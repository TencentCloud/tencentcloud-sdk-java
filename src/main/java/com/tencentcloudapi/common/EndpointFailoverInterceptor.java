/*
 * Copyright (c) 2018 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.tencentcloudapi.common;

import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import okhttp3.*;

import javax.net.ssl.SSLException;
import java.io.IOException;
import java.net.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Selects a healthy API host via per-host circuit breakers.
 * No same-request retry — API calls may be non-idempotent.
 * All breakers open → fall through to origin host.
 */
class EndpointFailoverInterceptor implements Interceptor {

    /** More-specific families first — matchFamily returns first hit. */
    static final String[][] FAILOVER_DOMAIN_FAMILIES = {
            {
                    "ai.tencentcloudapi.com",
                    "ai.tencentcloudapi.com.cn",
                    "ai.tencentcloudapi.cn",
            },
            {
                    "internal.tencentcloudapi.com",
                    "internal.tencentcloudapi.com.cn",
                    "internal.tencentcloudapi.cn",
            },
            {
                    "tencentcloudapi.com",
                    "tencentcloudapi.com.cn",
                    "tencentcloudapi.cn",
            },
    };

    public static long BREAKER_TIMEOUT_MS = 60 * 1000;

    private final AbstractClient client;
    private final String backupEndpoint;
    // Per AbstractClient instance.
    private final ConcurrentHashMap<String, CircuitBreaker> breakers =
            new ConcurrentHashMap<String, CircuitBreaker>();

    /**
     * Stores the region breaker set via {@link AbstractClient#setRegionBreaker}
     * so its settings are applied to all per-host breakers created here.
     */
    private CircuitBreaker regionBreaker;

    EndpointFailoverInterceptor(AbstractClient client) {
        this.client = client;
        String bp = client.getClientProfile().getBackupEndpoint();
        this.backupEndpoint = (bp != null && !bp.isEmpty()) ? bp : null;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        String originHost = request.url().host();

        // selectHost always returns a non-null Candidate.
        Candidate c = selectHost(request);

        try {
            // rewriteFor returns the original request unchanged when c.host == originHost.
            Request rewritten = rewriteFor(request, originHost, c.host);
            Response raw = chain.proceed(rewritten);
            Response validated = validateResponse(raw);
            c.token.report(true);
            return validated;
        } catch (TencentCloudSDKException e) {
            throw new IOException("Failed to re-sign request for failover: " + e.getMessage(), e);
        } catch (IOException e) {
            if (!shouldFailover(e)) {
                throw e;
            }
            c.token.report(false);
            throw e;
        }
    }

    // --- Candidate selection ---

    /**
     * Returns the first candidate whose breaker is closed, or the origin host
     * when all breakers are open.
     */
    Candidate selectHost(Request request) {
        String urlHost = request.url().host();

        // Fast path: check the origin host's breaker first. In the common case
        // the origin is healthy, so we avoid allocating the candidate list entirely.
        CircuitBreaker.Token originToken = breakerFor(urlHost).allow();
        if (originToken.allowed) {
            return new Candidate(urlHost, originToken);
        }

        // Origin host is tripped — build the failover candidates (excluding the
        // origin, which we already checked) and walk them.
        List<String> candidates = buildCandidateHosts(urlHost);
        for (int i = 0; i < candidates.size(); i++) {
            String host = candidates.get(i);
            CircuitBreaker.Token token = breakerFor(host).allow();
            if (token.allowed) {
                return new Candidate(host, token);
            }
        }
        // All breakers open: fall back to origin host.
        return new Candidate(urlHost, originToken);
    }

    /**
     * Ordered failover candidates (excluding the origin host, which is checked
     * first in {@link #selectHost}). Priority: backup endpoint, then TLD-family rotation.
     */
    private List<String> buildCandidateHosts(String urlHost) {
        String prefix = serviceOf(urlHost);
        if (prefix == null || prefix.isEmpty()) {
            return Collections.emptyList();
        }

        // 1. backup endpoint
        if (backupEndpoint != null) {
            return Collections.singletonList(prefix + "." + backupEndpoint);
        }

        // 2. Default TLD-family rotation
        Match match = matchFamily(urlHost);
        if (match == null) {
            return Collections.emptyList();
        }
        List<String> hosts = new ArrayList<String>();
        for (int i = 1; i < match.family.length; i++) {
            int tldIdx = (match.tldIdx + i) % match.family.length;
            hosts.add(prefix + "." + match.family[tldIdx]);
        }
        return hosts;
    }

    CircuitBreaker breakerFor(String host) {
        CircuitBreaker existing = breakers.get(host);
        if (existing != null) {
            return existing;
        }
        CircuitBreaker created = newBreaker();
        CircuitBreaker prev = breakers.putIfAbsent(host, created);
        return prev != null ? prev : created;
    }

    /** Test hook. */
    void putBreakerForTesting(String host, CircuitBreaker breaker) {
        breakers.put(host, breaker);
    }

    private CircuitBreaker newBreaker() {
        if (regionBreaker != null) {
            return new CircuitBreaker(regionBreaker.getSetting());
        }
        CircuitBreaker.Setting s = new CircuitBreaker.Setting();
        s.timeoutMs = BREAKER_TIMEOUT_MS;
        return new CircuitBreaker(s);
    }

    /** Package-private: store the region breaker instance. */
    void setRegionBreaker(CircuitBreaker regionBreaker) {
        this.regionBreaker = regionBreaker;
    }

    /** Package-private: return the region breaker instance. */
    CircuitBreaker getRegionBreaker() {
        return regionBreaker;
    }

    // Per-candidate helpers.

    private Request rewriteFor(Request request, String originHost, String targetHost)
            throws TencentCloudSDKException, IOException {
        if (originHost.equals(targetHost)) {
            return request;
        }
        return RequestBuilder.from(request)
                .fromClient(client)
                .withUrlHost(targetHost)
                .withUrlSchemeHttps()
                .withHost(targetHost)
                .build();
    }

    static final class Candidate {
        final String host;
        final CircuitBreaker.Token token;

        Candidate(String host, CircuitBreaker.Token token) {
            this.host = host;
            this.token = token;
        }
    }

    // --- Host classification & TLD family matching ---

    static boolean isKnownTencentCloudHost(String host) {
        return matchFamily(host) != null;
    }

    /** Returns null if host matches no family. */
    static Match matchFamily(String host) {
        if (host == null) {
            return null;
        }
        for (int familyIdx = 0; familyIdx < FAILOVER_DOMAIN_FAMILIES.length; familyIdx++) {
            Match m = tryMatchFamily(host, FAILOVER_DOMAIN_FAMILIES[familyIdx]);
            if (m != null) {
                return m;
            }
        }
        return null;
    }

    private static Match tryMatchFamily(String host, String[] family) {
        for (int tldIdx = 0; tldIdx < family.length; tldIdx++) {
            String suffix = family[tldIdx];
            if (!host.endsWith("." + suffix)) {
                continue;
            }
            String prefix = host.substring(0, host.length() - suffix.length() - 1);
            if (prefix.isEmpty() || hasEmptyLabel(prefix)) {
                return null;
            }
            return new Match(family, prefix, tldIdx);
        }
        return null;
    }

    // "foo..bar" → malformed hostname.
    private static boolean hasEmptyLabel(String prefix) {
        if (prefix.startsWith(".") || prefix.endsWith(".")) {
            return true;
        }
        for (int i = 0; i < prefix.length() - 1; i++) {
            if (prefix.charAt(i) == '.' && prefix.charAt(i + 1) == '.') {
                return true;
            }
        }
        return false;
    }

    static final class Match {
        final String[] family;
        final String prefix;
        final int tldIdx;

        Match(String[] family, String prefix, int tldIdx) {
            this.family = family;
            this.prefix = prefix;
            this.tldIdx = tldIdx;
        }
    }

    /** Test hook. */
    static String hostWithTld(String originHost, int newTldIdx) {
        Match m = matchFamily(originHost);
        return serviceOf(originHost) + "." + m.family[newTldIdx];
    }

    private static String serviceOf(String host) {
        int dot = host.indexOf('.');
        return dot < 0 ? host : host.substring(0, dot);
    }

    // Failure classification.

    // Host is unreachable or compromised — not a transient application error.
    private static boolean shouldFailover(IOException e) {
        return e instanceof UnknownHostException
                || e instanceof SSLException
                || e instanceof SocketException
                || e instanceof SocketTimeoutException
                || e instanceof UnhealthyResponseException;
    }

    // Wraps non-200 or invalid-JSON responses so validateResponse's caller
    // records them as breaker failures alongside transport errors.
    private static final class UnhealthyResponseException extends IOException {
        UnhealthyResponseException(String message) {
            super(message);
        }
    }

    /**
     * Validates response is healthy based solely on the HTTP status code.
     * Body content is not inspected — business-level errors (HTTP 200 + JSON
     * error body) are handled by the response parser, not by the failover
     * breaker. Non-200 responses are recorded as breaker failures.
     */
    private static Response validateResponse(Response resp) throws IOException {
        if (resp.code() != 200) {
            String msg = "HTTP " + resp.code() + " " + resp.message();
            resp.close();
            throw new UnhealthyResponseException(msg);
        }
        return resp;
    }
}
