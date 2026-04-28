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

import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.junit.Before;
import org.junit.Test;

import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import java.io.IOException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Tests for {@link EndpointFailoverInterceptor}. Two flavours, no network:
 * <ul>
 *   <li>Hand-rolled {@link RecordingChain}: cheap unit tests over a fake Chain.</li>
 *   <li>{@link TransportStub} plumbed into a real {@link OkHttpClient}: end-to-end
 *       tests through the actual OkHttp interceptor pipeline. Programs DNS misses,
 *       TLS failures, timeouts and 5xx outcomes per attempt.</li>
 * </ul>
 */
public class EndpointFailoverInterceptorTest {

    @Before
    public void resetState() {
        EndpointFailoverInterceptor.resetStateForTesting();
    }

    // ---- Pure helper tests ----

    @Test
    public void testIsKnownTencentCloudHost() {
        assertTrue(EndpointFailoverInterceptor.isKnownTencentCloudHost("cvm.tencentcloudapi.com"));
        assertTrue(EndpointFailoverInterceptor.isKnownTencentCloudHost("cvm.ap-shanghai.tencentcloudapi.com"));
        assertTrue(EndpointFailoverInterceptor.isKnownTencentCloudHost("hunyuan.ai.ap-guangzhou.tencentcloudapi.com"));
        assertTrue(EndpointFailoverInterceptor.isKnownTencentCloudHost("hunyuan.ai.tencentcloudapi.com"));
        assertTrue(EndpointFailoverInterceptor.isKnownTencentCloudHost("cvm.tencentcloudapi.cn"));
        assertTrue(EndpointFailoverInterceptor.isKnownTencentCloudHost("cvm.tencentcloudapi.com.cn"));
        assertFalse(EndpointFailoverInterceptor.isKnownTencentCloudHost("example.com"));
        assertFalse(EndpointFailoverInterceptor.isKnownTencentCloudHost("cvm.tencentcloudapi.woa.com"));
        assertFalse(EndpointFailoverInterceptor.isKnownTencentCloudHost("proxy.internal"));
        assertFalse(EndpointFailoverInterceptor.isKnownTencentCloudHost(null));
    }

    @Test
    public void testSubstituteTldDropsRegionalLabel() {
        assertEquals(
                "cvm.tencentcloudapi.com.cn",
                EndpointFailoverInterceptor.substituteTld(
                        "cvm.tencentcloudapi.com", "tencentcloudapi.com", "tencentcloudapi.com.cn"));
        assertEquals(
                "cvm.tencentcloudapi.cn",
                EndpointFailoverInterceptor.substituteTld(
                        "cvm.ap-shanghai.tencentcloudapi.com", "tencentcloudapi.com", "tencentcloudapi.cn"));
        assertEquals(
                "hunyuan.ai.tencentcloudapi.com.cn",
                EndpointFailoverInterceptor.substituteTld(
                        "hunyuan.ai.ap-guangzhou.tencentcloudapi.com",
                        "tencentcloudapi.com",
                        "tencentcloudapi.com.cn"));
    }

    @Test
    public void testSubstituteTldNoMatchReturnsInput() {
        assertEquals(
                "example.com",
                EndpointFailoverInterceptor.substituteTld(
                        "example.com", "tencentcloudapi.com", "tencentcloudapi.cn"));
    }

    // ---- Interceptor behavior tests ----

    @Test
    public void testPassThroughForUnknownHost() throws Exception {
        TestClient client = newTC3Client();
        EndpointFailoverInterceptor it = new EndpointFailoverInterceptor(client);
        Request req = newTC3Request("example.com");
        RecordingChain chain = new RecordingChain(req);
        chain.programSuccess();

        Response resp = it.intercept(chain);
        assertEquals(200, resp.code());
        assertEquals("example.com", chain.requests.get(0).url().host());
    }

    @Test
    public void testPassThroughWhenSkipSign() throws Exception {
        TestClient client = newTC3Client();
        EndpointFailoverInterceptor it = new EndpointFailoverInterceptor(client);
        Request req = newSkipSignV3Request("cvm.tencentcloudapi.com");
        RecordingChain chain = new RecordingChain(req);
        chain.programSuccess();

        it.intercept(chain);
        assertEquals(1, chain.requests.size());
        assertEquals("cvm.tencentcloudapi.com", chain.requests.get(0).url().host());
        assertEquals("SKIP", chain.requests.get(0).header("Authorization"));
    }

    @Test
    public void testFailoverRewritesSkipSignV3Request() throws Exception {
        TestClient client = newTC3Client();
        EndpointFailoverInterceptor it = new EndpointFailoverInterceptor(client);
        Request req = newSkipSignV3Request("cvm.tencentcloudapi.com");
        RecordingChain chain = new RecordingChain(req);
        chain.programDnsFailure();
        chain.programSuccess();

        Response resp = it.intercept(chain);
        assertEquals(200, resp.code());
        assertEquals(2, chain.requests.size());
        assertEquals("cvm.tencentcloudapi.com", chain.requests.get(0).url().host());
        assertEquals("cvm.tencentcloudapi.cn", chain.requests.get(1).url().host());
        assertEquals("cvm.tencentcloudapi.cn", chain.requests.get(1).header("Host"));
        assertEquals("SKIP", chain.requests.get(1).header("Authorization"));
    }

    @Test
    public void testKnownDomainStillFailsOverAfterRuntimeDisable() throws Exception {
        TestClient client = newTC3Client();
        client.getClientProfile().getHttpProfile().setDomainFailover(false);
        EndpointFailoverInterceptor it = new EndpointFailoverInterceptor(client);
        Request req = newTC3Request("cvm.tencentcloudapi.com");
        RecordingChain chain = new RecordingChain(req);
        chain.programDnsFailure();
        chain.programSuccess();

        Response resp = it.intercept(chain);
        assertEquals(200, resp.code());
        assertEquals(2, chain.requests.size());
        assertEquals("cvm.tencentcloudapi.com", chain.requests.get(0).url().host());
        assertEquals("cvm.tencentcloudapi.cn", chain.requests.get(1).url().host());
    }

    @Test
    public void testPassThroughForBackupTldUsedAsEndpoint() throws Exception {
        TestClient client = newTC3Client();
        EndpointFailoverInterceptor it = new EndpointFailoverInterceptor(client);
        Request req = newTC3Request("cvm.tencentcloudapi.cn");
        RecordingChain chain = new RecordingChain(req);
        chain.programSuccess();

        Response resp = it.intercept(chain);
        assertEquals(200, resp.code());
        assertEquals(1, chain.requests.size());
        assertEquals("cvm.tencentcloudapi.cn", chain.requests.get(0).url().host());
    }

    @Test
    public void testFailoverFromCnEndpoint() throws Exception {
        TestClient client = newTC3Client();
        EndpointFailoverInterceptor it = new EndpointFailoverInterceptor(client);
        Request req = newTC3Request("cvm.tencentcloudapi.cn");

        RecordingChain chain = new RecordingChain(req);
        chain.programDnsFailure();
        chain.programSuccess();

        Response resp = it.intercept(chain);
        assertEquals(200, resp.code());
        assertEquals(2, chain.requests.size());
        assertEquals("cvm.tencentcloudapi.cn", chain.requests.get(0).url().host());
        assertEquals("cvm.tencentcloudapi.com", chain.requests.get(1).url().host());
        assertEquals("cvm.tencentcloudapi.com", chain.requests.get(1).header("Host"));
    }

    @Test
    public void testFailoverToBackupTldOnDnsFailure() throws Exception {
        TestClient client = newTC3Client();
        EndpointFailoverInterceptor it = new EndpointFailoverInterceptor(client);
        Request req = newTC3Request("cvm.tencentcloudapi.com");

        RecordingChain chain = new RecordingChain(req);
        chain.programDnsFailure();
        chain.programSuccess();

        Response resp = it.intercept(chain);
        assertEquals(200, resp.code());
        assertEquals(2, chain.requests.size());
        assertEquals("cvm.tencentcloudapi.com", chain.requests.get(0).url().host());
        assertEquals("cvm.tencentcloudapi.cn", chain.requests.get(1).url().host());
        assertEquals("cvm.tencentcloudapi.cn", chain.requests.get(1).header("Host"));
        assertNotNull(chain.requests.get(1).header("Authorization"));
        assertNotEquals(
                chain.requests.get(0).header("Authorization"),
                chain.requests.get(1).header("Authorization"));
    }

    @Test
    public void testFailoverDropsRegionalLabelFromHost() throws Exception {
        TestClient client = newTC3Client();
        EndpointFailoverInterceptor it = new EndpointFailoverInterceptor(client);
        Request req = newTC3Request("cvm.ap-guangzhou.tencentcloudapi.com");

        RecordingChain chain = new RecordingChain(req);
        chain.programDnsFailure();
        chain.programSuccess();

        Response resp = it.intercept(chain);
        assertEquals(200, resp.code());
        assertEquals(2, chain.requests.size());
        assertEquals("cvm.ap-guangzhou.tencentcloudapi.com", chain.requests.get(0).url().host());
        assertEquals("cvm.tencentcloudapi.cn", chain.requests.get(1).url().host());
        assertEquals("cvm.tencentcloudapi.cn", chain.requests.get(1).header("Host"));
    }

    @Test
    public void testAllBackupTldsFailAggregatesEveryAttemptFailure() throws Exception {
        TestClient client = newTC3Client();
        EndpointFailoverInterceptor it = new EndpointFailoverInterceptor(client);
        Request req = newTC3Request("cvm.tencentcloudapi.com");

        RecordingChain chain = new RecordingChain(req);
        chain.programDnsFailure("first dns miss");
        chain.programDnsFailure("second dns miss");
        chain.programDnsFailure("third dns miss");

        IOException thrown = null;
        try {
            it.intercept(chain);
            fail("expected IOException");
        } catch (IOException e) {
            thrown = e;
        }
        // Primary cause = last attempt. Wrapper IOException carries the
        // original UnknownHostException as its cause so the root type is
        // recoverable for callers that want to switch on it.
        assertTrue("primary message should mention last host, got: " + thrown.getMessage(),
                thrown.getMessage().contains("cvm.tencentcloudapi.com.cn"));
        assertTrue("primary message should mention last attempt's failure, got: " + thrown.getMessage(),
                thrown.getMessage().contains("third dns miss"));
        assertNotNull(thrown.getCause());
        assertTrue(thrown.getCause() instanceof UnknownHostException);
        assertEquals("third dns miss", thrown.getCause().getMessage());

        // Every other attempt is attached as a suppressed exception so a
        // single stack-trace dump exposes all 3 root causes.
        Throwable[] suppressed = thrown.getSuppressed();
        assertEquals(2, suppressed.length);
        assertTrue(suppressed[0].getMessage().contains("cvm.tencentcloudapi.com"));
        assertTrue(suppressed[0].getMessage().contains("first dns miss"));
        assertTrue(suppressed[0].getCause() instanceof UnknownHostException);
        assertTrue(suppressed[1].getMessage().contains("cvm.tencentcloudapi.cn"));
        assertTrue(suppressed[1].getMessage().contains("second dns miss"));
        assertTrue(suppressed[1].getCause() instanceof UnknownHostException);

        assertEquals(3, chain.requests.size());
        assertEquals("cvm.tencentcloudapi.com", chain.requests.get(0).url().host());
        assertEquals("cvm.tencentcloudapi.cn", chain.requests.get(1).url().host());
        assertEquals("cvm.tencentcloudapi.com.cn", chain.requests.get(2).url().host());
        chain.assertAllProgrammedConsumed();
    }

    @Test
    public void testAggregatedFailurePreservesPerAttemptCauseTypes() throws Exception {
        // Different IOException subtypes per attempt — each must round-trip
        // intact through the aggregation so callers can switch on root type
        // (e.g. distinguish TLS vs DNS vs connect failure for diagnostics).
        TestClient client = newTC3Client();
        EndpointFailoverInterceptor it = new EndpointFailoverInterceptor(client);
        Request req = newTC3Request("cvm.tencentcloudapi.com");

        RecordingChain chain = new RecordingChain(req);
        chain.programFailure(new UnknownHostException("dns miss .com"));
        chain.programFailure(new SSLHandshakeException("tls fail .cn"));
        chain.programFailure(new ConnectException("connect fail .com.cn"));

        IOException thrown = null;
        try {
            it.intercept(chain);
            fail("expected IOException");
        } catch (IOException e) {
            thrown = e;
        }
        // Primary = last attempt's wrapper; cause = ConnectException.
        assertTrue(thrown.getCause() instanceof ConnectException);
        assertEquals("connect fail .com.cn", thrown.getCause().getMessage());

        Throwable[] suppressed = thrown.getSuppressed();
        assertEquals(2, suppressed.length);
        assertTrue(suppressed[0].getCause() instanceof UnknownHostException);
        assertEquals("dns miss .com", suppressed[0].getCause().getMessage());
        assertTrue(suppressed[1].getCause() instanceof SSLHandshakeException);
        assertEquals("tls fail .cn", suppressed[1].getCause().getMessage());
        chain.assertAllProgrammedConsumed();
    }

    @Test
    public void testAggregatedFailureMixesBreakerSkipsWithRealFailures() throws Exception {
        // Pre-open the .com breaker so the first candidate is short-circuited
        // (no real attempt, placeholder IOException with no cause). The next
        // two TLDs hit transport and fail. Aggregation must include all three
        // entries in attempt order.
        TestClient client = newTC3Client();
        EndpointFailoverInterceptor it = new EndpointFailoverInterceptor(client);

        // Open the .com breaker via a 5-failure burst on a throwaway chain.
        for (int i = 0; i < 5; i++) {
            RecordingChain warmup = new RecordingChain(newTC3Request("cvm.tencentcloudapi.com"));
            warmup.programDnsFailure("warmup fail " + i);
            warmup.programSuccess();  // .cn succeeds, doesn't touch .com breaker
            it.intercept(warmup);
            EndpointFailoverInterceptor.FailoverState state =
                    EndpointFailoverInterceptor.STATE.get("cvm.tencentcloudapi.com");
            state.originProbeAfterMs = 0;  // force .com to be retried each loop
        }

        // .com breaker should now be Open.
        EndpointFailoverInterceptor.FailoverState state =
                EndpointFailoverInterceptor.STATE.get("cvm.tencentcloudapi.com");
        // Sanity: confirm Open.
        assertFalse("expected .com breaker Open after 5 failures",
                state.breakers[0].allow().allowed);

        // Real run: .com short-circuits, .cn fails, .com.cn fails.
        // candidates() order with currentIndex=.cn and originProbeAfterMs=0:
        // first .com (origin reprobe due), then .cn (preferred), then .com.cn.
        state.originProbeAfterMs = 0;
        Request req = newTC3Request("cvm.tencentcloudapi.com");
        RecordingChain chain = new RecordingChain(req);
        chain.programFailure(new SSLHandshakeException("cn tls fail"));
        chain.programFailure(new ConnectException("com.cn connect fail"));

        IOException thrown = null;
        try {
            it.intercept(chain);
            fail("expected IOException");
        } catch (IOException e) {
            thrown = e;
        }

        // Only 2 chain.proceed calls — .com was skipped by breaker.
        assertEquals(2, chain.requests.size());
        assertEquals("cvm.tencentcloudapi.cn", chain.requests.get(0).url().host());
        assertEquals("cvm.tencentcloudapi.com.cn", chain.requests.get(1).url().host());

        // Primary = last attempt (com.cn ConnectException).
        assertTrue(thrown.getCause() instanceof ConnectException);

        // Suppressed: [.com breaker skip placeholder, .cn SSLHandshake wrapper].
        Throwable[] suppressed = thrown.getSuppressed();
        assertEquals(2, suppressed.length);
        // Order matters — must reflect attempt order, not failure-type grouping.
        assertTrue("first suppressed must be .com breaker skip, got: " + suppressed[0].getMessage(),
                suppressed[0].getMessage().contains("cvm.tencentcloudapi.com")
                        && suppressed[0].getMessage().contains("circuit breaker open"));
        assertNull("breaker-skip placeholder has no underlying cause",
                suppressed[0].getCause());
        assertTrue(suppressed[1].getCause() instanceof SSLHandshakeException);
    }

    @Test
    public void testAggregatedFailureWhenPrimaryIsBreakerSkip() throws Exception {
        // Pre-fail .cn and .com.cn breakers so they're Open while .com is still
        // Closed. Then drive a request where .com fails (the only attempt
        // that reaches transport). Both breaker-skips arrive AFTER .com's
        // failure in attempt order, so the *primary* (last entry) is a
        // breaker-skip placeholder with no cause.
        TestClient client = newTC3Client();
        EndpointFailoverInterceptor it = new EndpointFailoverInterceptor(client);

        EndpointFailoverInterceptor.FailoverState state =
                new EndpointFailoverInterceptor.FailoverState(60_000);
        EndpointFailoverInterceptor.STATE.put("cvm.tencentcloudapi.com", state);
        // Open .cn (idx=1) and .com.cn (idx=2); leave .com (idx=0) Closed.
        for (int idx : new int[]{1, 2}) {
            for (int i = 0; i < 6; i++) {
                CircuitBreaker.Token t = state.breakers[idx].allow();
                if (t.allowed) {
                    t.report(false);
                }
            }
        }

        Request req = newTC3Request("cvm.tencentcloudapi.com");
        RecordingChain chain = new RecordingChain(req);
        chain.programFailure(new UnknownHostException("com dns fail"));

        IOException thrown = null;
        try {
            it.intercept(chain);
            fail("expected IOException");
        } catch (IOException e) {
            thrown = e;
        }
        // Only .com hit transport.
        assertEquals(1, chain.requests.size());
        assertEquals("cvm.tencentcloudapi.com", chain.requests.get(0).url().host());

        // Primary = last attempt (.com.cn breaker skip), no cause.
        assertNull("breaker-skip primary has no cause", thrown.getCause());
        assertTrue(thrown.getMessage().contains("cvm.tencentcloudapi.com.cn"));
        assertTrue(thrown.getMessage().contains("circuit breaker open"));

        // Suppressed: [.com real failure, .cn breaker skip].
        Throwable[] suppressed = thrown.getSuppressed();
        assertEquals(2, suppressed.length);
        assertTrue(suppressed[0].getCause() instanceof UnknownHostException);
        assertEquals("com dns fail", suppressed[0].getCause().getMessage());
        assertNull(suppressed[1].getCause());
        assertTrue(suppressed[1].getMessage().contains("cvm.tencentcloudapi.cn"));
    }

    @Test
    public void testFailoverDoesNotPollutateNextRequestAttemptFailures() throws Exception {
        // attemptFailures lives on Failover (per-intercept), not on the
        // interceptor — guard against accidental promotion to instance state
        // that would carry stale failures into the next request.
        TestClient client = newTC3Client();
        EndpointFailoverInterceptor it = new EndpointFailoverInterceptor(client);

        // Run 1: 1 failure + 1 success → no exception, no aggregation.
        {
            RecordingChain chain = new RecordingChain(newTC3Request("cvm.tencentcloudapi.com"));
            chain.programDnsFailure("run1 fail");
            chain.programSuccess();
            Response resp = it.intercept(chain);
            assertEquals(200, resp.code());
        }

        // Run 2: all-fail. Suppressed must contain ONLY run-2 failures, not
        // any leftover from run 1.
        {
            RecordingChain chain = new RecordingChain(newTC3Request("cvm.tencentcloudapi.com"));
            chain.programDnsFailure("run2 com fail");
            chain.programDnsFailure("run2 cn fail");
            chain.programDnsFailure("run2 com.cn fail");
            IOException thrown = null;
            try {
                it.intercept(chain);
                fail("expected IOException");
            } catch (IOException e) {
                thrown = e;
            }
            assertEquals(2, thrown.getSuppressed().length);
            for (Throwable s : thrown.getSuppressed()) {
                assertFalse("must not leak run-1 failure into run-2 aggregation: " + s.getMessage(),
                        s.getMessage().contains("run1"));
            }
            assertTrue(thrown.getMessage().contains("run2"));
        }
    }

    @Test
    public void testFollowupRequestUsesKnownWorkingTld() throws Exception {
        TestClient client = newTC3Client();
        EndpointFailoverInterceptor it = new EndpointFailoverInterceptor(client);

        {
            Request req = newTC3Request("cvm.tencentcloudapi.com");
            RecordingChain chain = new RecordingChain(req);
            chain.programDnsFailure();
            chain.programSuccess();
            Response resp = it.intercept(chain);
            assertEquals(200, resp.code());
            chain.assertAllProgrammedConsumed();
        }

        {
            Request req = newTC3Request("cvm.tencentcloudapi.com");
            RecordingChain chain = new RecordingChain(req);
            // Two outcomes programmed: if the interceptor wrongly probes
            // .com first, it would consume the failure and need the second
            // success — leaving zero leftovers. With correct behavior only
            // .cn is tried, leaving one outcome unconsumed (asserted below).
            chain.programSuccess();
            chain.programSuccess();
            Response resp = it.intercept(chain);
            assertEquals(200, resp.code());
            assertEquals(1, chain.requests.size());
            assertEquals("cvm.tencentcloudapi.cn", chain.requests.get(0).url().host());
            assertEquals("must take exactly one outcome (no .com probe)",
                    1, chain.programmedRemaining());
        }
    }

    @Test
    public void testFollowupRequestReprobesOriginalTldAfterCooldown() throws Exception {
        TestClient client = newTC3Client();
        EndpointFailoverInterceptor it = new EndpointFailoverInterceptor(client);

        {
            Request req = newTC3Request("cvm.tencentcloudapi.com");
            RecordingChain chain = new RecordingChain(req);
            chain.programDnsFailure();
            chain.programSuccess();
            Response resp = it.intercept(chain);
            assertEquals(200, resp.code());
            chain.assertAllProgrammedConsumed();
        }

        EndpointFailoverInterceptor.FailoverState state =
                EndpointFailoverInterceptor.STATE.get("cvm.tencentcloudapi.com");
        assertNotNull(state);
        state.originProbeAfterMs = 0;

        {
            Request req = newTC3Request("cvm.tencentcloudapi.com");
            RecordingChain chain = new RecordingChain(req);
            // Belt-and-braces: extra success queued so a wrong fallback path
            // would still complete the test rather than blow up with
            // "no programmed outcomes" — which would mask the real bug.
            chain.programSuccess();
            chain.programSuccess();
            Response resp = it.intercept(chain);
            assertEquals(200, resp.code());
            assertEquals(1, chain.requests.size());
            assertEquals("cvm.tencentcloudapi.com", chain.requests.get(0).url().host());
            assertEquals("must take exactly one outcome (origin probe succeeded first)",
                    1, chain.programmedRemaining());
            // After the successful origin probe the cooldown must clear,
            // otherwise the next request would reprobe forever.
            assertEquals(-1, state.originProbeAfterMs);
        }
    }

    @Test
    public void testResignPicksUpRotatedCredential() throws Exception {
        // Rotating the credential on the AbstractClient between initial sign and
        // failover resign should be reflected in the new Authorization header,
        // because the interceptor reads client.credential live. Verify the
        // resigned signature is actually computed with the NEW SecretKey, not
        // just the new SecretId — independently reproduce the TC3 signature
        // using SKNEW + the timestamp echoed in the resigned headers, then
        // assert byte-for-byte equality.
        TestClient client = newTC3Client();
        EndpointFailoverInterceptor it = new EndpointFailoverInterceptor(client);
        Request req = newTC3Request("cvm.tencentcloudapi.com");
        String origAuth = req.header("Authorization");

        client.setCredential(new Credential("AKIDNEW", "SKNEW"));

        RecordingChain chain = new RecordingChain(req);
        chain.programDnsFailure();
        chain.programSuccess();

        it.intercept(chain);
        Request resigned = chain.requests.get(1);
        String resignedAuth = resigned.header("Authorization");
        assertNotNull(resignedAuth);
        assertNotEquals(origAuth, resignedAuth);
        assertTrue("resigned auth should use rotated secretId, got: " + resignedAuth,
                resignedAuth.contains("Credential=AKIDNEW/"));

        String resignedTimestamp = resigned.header("X-TC-Timestamp");
        assertNotNull(resignedTimestamp);
        String expectedAuth = reproduceTc3SignaturePost(
                "AKIDNEW", "SKNEW",
                "cvm.tencentcloudapi.cn", "cvm",
                "application/json; charset=utf-8",
                "{}".getBytes(StandardCharsets.UTF_8),
                Long.parseLong(resignedTimestamp));
        assertEquals("resigned signature must be computable with the rotated SK",
                expectedAuth, resignedAuth);

        // Negative control: same inputs but with the OLD secret produce a
        // different signature — proves the assertion above is meaningful and
        // not a tautology.
        String wrongAuth = reproduceTc3SignaturePost(
                "AKIDTEST", "SKTEST",
                "cvm.tencentcloudapi.cn", "cvm",
                "application/json; charset=utf-8",
                "{}".getBytes(StandardCharsets.UTF_8),
                Long.parseLong(resignedTimestamp));
        assertNotEquals(wrongAuth, resignedAuth);
    }

    @Test
    public void testResignHmacReplacesSignatureForNewHost() throws Exception {
        TestClient client = newHmacClient();
        EndpointFailoverInterceptor it = new EndpointFailoverInterceptor(client);
        Request req = newHmacRequest("cvm.tencentcloudapi.com");
        String originalSig = req.url().queryParameter("Signature");
        assertNotNull(originalSig);

        RecordingChain chain = new RecordingChain(req);
        chain.programDnsFailure();
        chain.programSuccess();

        it.intercept(chain);
        assertEquals(2, chain.requests.size());
        Request resigned = chain.requests.get(1);
        assertEquals("cvm.tencentcloudapi.cn", resigned.url().host());
        String newSig = resigned.url().queryParameter("Signature");
        assertNotNull(newSig);
        assertNotEquals(originalSig, newSig);

        // Stronger check: independently reproduce the expected V1 signature
        // for the new host using the same SK and parameters, and compare.
        // Sig changing alone is too weak — host change forces signature
        // change for any half-correct implementation. This catches subtle
        // bugs like signing with the wrong host, double-signing the old
        // Signature param, or losing query params during resign.
        java.util.TreeMap<String, String> params = new java.util.TreeMap<String, String>();
        params.put("Action", "TestAction");
        params.put("Version", "2020-01-01");
        params.put("Region", "ap-guangzhou");
        params.put("SecretId", "AKIDTEST");
        params.put("Timestamp", "1700000000");
        params.put("Nonce", "12345");
        params.put("SignatureMethod", "HmacSHA256");
        String plain = Sign.makeSignPlainText(
                params, HttpProfile.REQ_GET, "cvm.tencentcloudapi.cn", "/");
        String expectedSig = Sign.sign("SKTEST", plain, ClientProfile.SIGN_SHA256);
        assertEquals(expectedSig, newSig);

        // Negative control: signing for the ORIGINAL host produces a different
        // signature, proving the resign actually rebound to the new host.
        String wrongHostPlain = Sign.makeSignPlainText(
                params, HttpProfile.REQ_GET, "cvm.tencentcloudapi.com", "/");
        String wrongHostSig = Sign.sign("SKTEST", wrongHostPlain, ClientProfile.SIGN_SHA256);
        assertNotEquals(wrongHostSig, newSig);

        // Confirm every original query param is preserved (none lost on resign).
        assertEquals("TestAction", resigned.url().queryParameter("Action"));
        assertEquals("2020-01-01", resigned.url().queryParameter("Version"));
        assertEquals("ap-guangzhou", resigned.url().queryParameter("Region"));
        assertEquals("AKIDTEST", resigned.url().queryParameter("SecretId"));
        assertEquals("1700000000", resigned.url().queryParameter("Timestamp"));
        assertEquals("12345", resigned.url().queryParameter("Nonce"));
        assertEquals("HmacSHA256", resigned.url().queryParameter("SignatureMethod"));
        // Old Signature must be replaced, not duplicated.
        assertEquals("Signature must appear exactly once",
                1, resigned.url().queryParameterValues("Signature").size());
    }

    // ---- Helpers ----

    /**
     * Independently reproduces a TC3-HMAC-SHA256 Authorization header for a
     * POST request with content-type;host as the signed headers. Used by
     * {@link #testResignPicksUpRotatedCredential} to verify the interceptor's
     * resigned signature byte-for-byte. Mirrors {@code resignV3} in the
     * interceptor; if either drifts, this assertion catches it.
     */
    private static String reproduceTc3SignaturePost(String secretId, String secretKey,
                                                    String host, String service,
                                                    String contentType, byte[] payload,
                                                    long timestampSec) throws Exception {
        String canonicalHeaders = "content-type:" + contentType + "\nhost:" + host + "\n";
        String signedHeaders = "content-type;host";
        String hashedPayload = Sign.sha256Hex(payload);
        String canonicalRequest = "POST\n/\n\n" + canonicalHeaders + "\n"
                + signedHeaders + "\n" + hashedPayload;

        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
        sdf.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        String date = sdf.format(new java.util.Date(timestampSec * 1000L));
        String credentialScope = date + "/" + service + "/tc3_request";
        String hashedCanonical = Sign.sha256Hex(canonicalRequest.getBytes(StandardCharsets.UTF_8));
        String stringToSign = "TC3-HMAC-SHA256\n" + timestampSec + "\n"
                + credentialScope + "\n" + hashedCanonical;

        byte[] secretDate = Sign.hmac256(("TC3" + secretKey).getBytes(StandardCharsets.UTF_8), date);
        byte[] secretService = Sign.hmac256(secretDate, service);
        byte[] secretSigning = Sign.hmac256(secretService, "tc3_request");
        String signature = DatatypeConverter
                .printHexBinary(Sign.hmac256(secretSigning, stringToSign))
                .toLowerCase();
        return "TC3-HMAC-SHA256 "
                + "Credential=" + secretId + "/" + credentialScope + ", "
                + "SignedHeaders=" + signedHeaders + ", "
                + "Signature=" + signature;
    }

    /** Minimal concrete AbstractClient subclass usable in tests. */
    private static final class TestClient extends AbstractClient {
        TestClient(ClientProfile profile) {
            super("cvm.tencentcloudapi.com", "2020-01-01",
                    new Credential("AKIDTEST", "SKTEST"), "ap-guangzhou", profile);
        }
    }

    private TestClient newTC3Client() {
        ClientProfile profile = new ClientProfile();
        profile.getHttpProfile().setReqMethod(HttpProfile.REQ_POST);
        return new TestClient(profile);
    }

    private TestClient newHmacClient() {
        ClientProfile profile = new ClientProfile();
        profile.setSignMethod(ClientProfile.SIGN_SHA256);
        profile.getHttpProfile().setReqMethod(HttpProfile.REQ_GET);
        return new TestClient(profile);
    }

    /**
     * Hand-crafted TC3-signed Request minimal enough for the interceptor to
     * recognise and re-sign. Body + contentType + X-TC-* headers + Authorization
     * are all the interceptor needs; the signature value itself is opaque to
     * re-sign (it's recomputed from scratch for the backup host).
     */
    private static Request newTC3Request(String host) {
        byte[] body = "{}".getBytes();
        return new Request.Builder()
                .url("https://" + host + "/")
                .post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), body))
                .header("Content-Type", "application/json; charset=utf-8")
                .header("Host", host)
                .header("Authorization",
                        "TC3-HMAC-SHA256 Credential=AKIDTEST/2024-01-01/cvm/tc3_request,"
                                + " SignedHeaders=content-type;host, Signature=deadbeef")
                .header("X-TC-Action", "TestAction")
                .header("X-TC-Timestamp", "1700000000")
                .header("X-TC-Version", "2020-01-01")
                .header("X-TC-RequestClient", "SDK_JAVA_TEST")
                .header("X-TC-Region", "ap-guangzhou")
                .build();
    }

    private static Request newSkipSignV3Request(String host) {
        return new Request.Builder()
                .url("https://" + host + "/")
                .post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), "{}"))
                .header("Content-Type", "application/json; charset=utf-8")
                .header("Host", host)
                .header("Authorization", "SKIP")
                .header("X-TC-Action", "TestAction")
                .header("X-TC-Timestamp", "1700000000")
                .header("X-TC-Version", "2020-01-01")
                .header("X-TC-RequestClient", "SDK_JAVA_TEST")
                .header("X-TC-Region", "ap-guangzhou")
                .build();
    }

    /** Hand-crafted Hmac-signed GET Request with Signature in query string. */
    private static Request newHmacRequest(String host) {
        return new Request.Builder()
                .url("https://" + host + "/?Action=TestAction"
                        + "&Version=2020-01-01"
                        + "&Region=ap-guangzhou"
                        + "&SecretId=AKIDTEST"
                        + "&Timestamp=1700000000"
                        + "&Nonce=12345"
                        + "&SignatureMethod=HmacSHA256"
                        + "&Signature=deadbeefdeadbeef")
                .get()
                .build();
    }

    private static Response okResponse(Request req) {
        return new Response.Builder()
                .request(req)
                .protocol(Protocol.HTTP_1_1)
                .code(200)
                .message("OK")
                .body(ResponseBody.create(MediaType.parse("application/json"), "{}"))
                .build();
    }

    private static final class RecordingChain implements Interceptor.Chain {
        final List<Request> requests = new ArrayList<Request>();
        private final List<Object> programmed = new ArrayList<Object>();
        private int idx = 0;
        private Request current;

        RecordingChain(Request initialRequest) {
            this.current = initialRequest;
        }

        void programSuccess() {
            programmed.add(null);
        }

        void programDnsFailure() {
            programDnsFailure("injected DNS failure");
        }

        void programDnsFailure(String message) {
            programmed.add(new UnknownHostException(message));
        }

        void programFailure(IOException e) {
            programmed.add(e);
        }

        int programmedRemaining() {
            return programmed.size() - idx;
        }

        void assertAllProgrammedConsumed() {
            if (programmedRemaining() != 0) {
                throw new AssertionError(
                        "Expected all programmed outcomes to be consumed but "
                                + programmedRemaining() + " remain");
            }
        }

        @Override
        public Request request() {
            return current;
        }

        @Override
        public Response proceed(Request request) throws IOException {
            current = request;
            requests.add(request);
            if (idx >= programmed.size()) {
                throw new IllegalStateException("No more programmed responses");
            }
            Object next = programmed.get(idx++);
            if (next instanceof Throwable) {
                if (next instanceof IOException) {
                    throw (IOException) next;
                }
                throw new RuntimeException((Throwable) next);
            }
            if (next == null) {
                return okResponse(request);
            }
            return (Response) next;
        }

        @Override public Connection connection() { return null; }
        @Override public Call call() { return null; }
        @Override public int connectTimeoutMillis() { return 0; }
        @Override public Interceptor.Chain withConnectTimeout(int timeout, TimeUnit unit) { return this; }
        @Override public int readTimeoutMillis() { return 0; }
        @Override public Interceptor.Chain withReadTimeout(int timeout, TimeUnit unit) { return this; }
        @Override public int writeTimeoutMillis() { return 0; }
        @Override public Interceptor.Chain withWriteTimeout(int timeout, TimeUnit unit) { return this; }
    }

    // ====================================================================
    //  End-to-end tests: real OkHttpClient pipeline + TransportStub.
    //  Exercises the interceptor through OkHttp's actual chain, not a hand-
    //  rolled fake. Catches integration bugs RecordingChain can't.
    // ====================================================================

    // ---- shouldFailover branch coverage ----

    @Test
    public void e2eFailoverOnSslHandshakeException() throws Exception {
        runE2EFailoverScenario(new SSLHandshakeException("tls handshake failed"));
    }

    @Test
    public void e2eFailoverOnSslPeerUnverifiedException() throws Exception {
        runE2EFailoverScenario(new SSLPeerUnverifiedException("cert mismatch"));
    }

    @Test
    public void e2eFailoverOnConnectException() throws Exception {
        runE2EFailoverScenario(new ConnectException("connection refused"));
    }

    @Test
    public void e2eFailoverOnNoRouteToHostException() throws Exception {
        runE2EFailoverScenario(new NoRouteToHostException("no route"));
    }

    @Test
    public void e2eFailoverOnSocketTimeoutException() throws Exception {
        runE2EFailoverScenario(new SocketTimeoutException("read timed out"));
    }

    private void runE2EFailoverScenario(IOException firstFailure) throws Exception {
        AbstractClient client = newTC3Client();
        TransportStub transport = new TransportStub();
        OkHttpClient http = newE2EClient(client, transport);

        transport.programFailure(firstFailure);
        transport.programSuccess(200, "{\"Response\":{}}");

        Request req = newTC3Request("cvm.tencentcloudapi.com");
        Response resp = http.newCall(req).execute();
        assertEquals(200, resp.code());
        assertEquals("{\"Response\":{}}", resp.body().string());

        assertEquals(2, transport.received.size());
        assertEquals("cvm.tencentcloudapi.com", transport.received.get(0).url().host());
        assertEquals("cvm.tencentcloudapi.cn", transport.received.get(1).url().host());
    }

    // ---- Non-failover IOException must propagate without retry ----

    @Test
    public void e2eGenericIOExceptionPropagatesWithoutFailover() throws Exception {
        AbstractClient client = newTC3Client();
        TransportStub transport = new TransportStub();
        OkHttpClient http = newE2EClient(client, transport);

        IOException unrelated = new IOException("some unrelated I/O error");
        transport.programFailure(unrelated);

        Request req = newTC3Request("cvm.tencentcloudapi.com");
        try {
            http.newCall(req).execute();
            fail("expected IOException to propagate");
        } catch (IOException e) {
            assertEquals("some unrelated I/O error", e.getMessage());
        }
        assertEquals("must not retry on non-failover IOException", 1, transport.received.size());
    }

    // ---- Response body / status / headers reach caller intact ----

    @Test
    public void e2eResponseBodyAndStatusPreservedAfterFailover() throws Exception {
        AbstractClient client = newTC3Client();
        TransportStub transport = new TransportStub();
        OkHttpClient http = newE2EClient(client, transport);

        transport.programFailure(new UnknownHostException("dns miss"));
        transport.programSuccess(202, "{\"Response\":{\"X\":42}}");

        Request req = newTC3Request("cvm.tencentcloudapi.com");
        Response resp = http.newCall(req).execute();
        assertEquals(202, resp.code());
        assertEquals("{\"Response\":{\"X\":42}}", resp.body().string());
    }

    // ---- 5xx server response is not a failover trigger ----

    @Test
    public void e2e5xxResponseDoesNotTriggerFailover() throws Exception {
        AbstractClient client = newTC3Client();
        TransportStub transport = new TransportStub();
        OkHttpClient http = newE2EClient(client, transport);

        // Server reachable, returns 503 — interceptor must surface this, not retry.
        transport.programSuccess(503, "service unavailable");

        Request req = newTC3Request("cvm.tencentcloudapi.com");
        Response resp = http.newCall(req).execute();
        assertEquals(503, resp.code());
        assertEquals(1, transport.received.size());
    }

    // ---- TC3 resign preserves body, content-type, signing scope ----

    @Test
    public void e2eTC3ResignPreservesBodyAndContentType() throws Exception {
        AbstractClient client = newTC3Client();
        TransportStub transport = new TransportStub();
        OkHttpClient http = newE2EClient(client, transport);

        transport.programFailure(new UnknownHostException("dns miss"));
        transport.programSuccess(200, "{}");

        String payload = "{\"Limit\":10,\"Offset\":0,\"Filters\":[\"a\",\"b\"]}";
        Request req = newTC3RequestWithBody("cvm.tencentcloudapi.com", payload);
        http.newCall(req).execute();

        Request resigned = transport.received.get(1);
        assertEquals("cvm.tencentcloudapi.cn", resigned.url().host());
        assertEquals("application/json; charset=utf-8", resigned.header("Content-Type"));
        // Authorization must be regenerated with the new host bound into the signed scope.
        String origAuth = transport.received.get(0).header("Authorization");
        String newAuth = resigned.header("Authorization");
        assertNotNull(newAuth);
        assertNotEquals(origAuth, newAuth);
        assertTrue("resigned auth must be TC3", newAuth.startsWith("TC3-HMAC-SHA256 "));
        assertTrue("scope must include new service host segment",
                newAuth.contains("/cvm/tc3_request"));
        // Body must round-trip byte-identical through resign.
        assertEquals(payload, bodyAsString(resigned));
    }

    // ---- X-TC-Token rotation visible to resigned request ----

    @Test
    public void e2eResignReflectsRotatedToken() throws Exception {
        AbstractClient client = newTC3Client();
        client.setCredential(new Credential("AKIDTEST", "SKTEST", "tok-v1"));
        TransportStub transport = new TransportStub();
        OkHttpClient http = newE2EClient(client, transport);

        transport.programFailure(new UnknownHostException("dns miss"));
        transport.programSuccess(200, "{}");

        // Build a TC3 request that already carries the v1 token.
        Request req = newTC3Request("cvm.tencentcloudapi.com")
                .newBuilder()
                .header("X-TC-Token", "tok-v1")
                .build();

        // Rotate the token between original sign and resign.
        client.setCredential(new Credential("AKIDTEST", "SKTEST", "tok-v2"));

        http.newCall(req).execute();
        assertEquals("tok-v2", transport.received.get(1).header("X-TC-Token"));
    }

    @Test
    public void e2eResignDropsTokenWhenCleared() throws Exception {
        AbstractClient client = newTC3Client();
        client.setCredential(new Credential("AKIDTEST", "SKTEST", "tok-v1"));
        TransportStub transport = new TransportStub();
        OkHttpClient http = newE2EClient(client, transport);

        transport.programFailure(new UnknownHostException("dns miss"));
        transport.programSuccess(200, "{}");

        Request req = newTC3Request("cvm.tencentcloudapi.com")
                .newBuilder()
                .header("X-TC-Token", "tok-v1")
                .build();

        client.setCredential(new Credential("AKIDTEST", "SKTEST"));  // no token

        http.newCall(req).execute();
        assertNull("token must be removed from resigned request when credential drops it",
                transport.received.get(1).header("X-TC-Token"));
    }

    // ---- Hmac (V1) resign preserves all query params; Signature replaced exactly once ----

    @Test
    public void e2eHmacResignPreservesQueryParams() throws Exception {
        AbstractClient client = newHmacClient();
        TransportStub transport = new TransportStub();
        OkHttpClient http = newE2EClient(client, transport);

        transport.programFailure(new UnknownHostException("dns miss"));
        transport.programSuccess(200, "{}");

        Request req = newHmacRequest("cvm.tencentcloudapi.com");
        http.newCall(req).execute();

        Request resigned = transport.received.get(1);
        assertEquals("cvm.tencentcloudapi.cn", resigned.url().host());
        assertEquals("TestAction", resigned.url().queryParameter("Action"));
        assertEquals("2020-01-01", resigned.url().queryParameter("Version"));
        assertEquals("ap-guangzhou", resigned.url().queryParameter("Region"));
        assertEquals("AKIDTEST", resigned.url().queryParameter("SecretId"));
        assertEquals("12345", resigned.url().queryParameter("Nonce"));
        assertEquals("HmacSHA256", resigned.url().queryParameter("SignatureMethod"));
        // Must still have a Signature, must differ from the original.
        String newSig = resigned.url().queryParameter("Signature");
        assertNotNull(newSig);
        assertNotEquals("deadbeefdeadbeef", newSig);
        // Old "Signature=deadbeefdeadbeef" must NOT survive as a duplicate query
        // param (resigner must drop it before signing, not append alongside).
        List<String> sigValues = resigned.url().queryParameterValues("Signature");
        assertEquals("must have exactly one Signature param", 1, sigValues.size());
    }

    // ---- All breakers Open: surface aggregated IOException, do not probe ----

    @Test
    public void e2eAllBreakersOpenThrowsAggregatedWithoutProbing() throws Exception {
        AbstractClient client = newTC3Client();
        TransportStub transport = new TransportStub();
        OkHttpClient http = newE2EClient(client, transport);

        // Force every breaker into Open state directly.
        EndpointFailoverInterceptor.FailoverState state =
                new EndpointFailoverInterceptor.FailoverState(60_000);
        EndpointFailoverInterceptor.STATE.put("cvm.tencentcloudapi.com", state);
        for (CircuitBreaker breaker : state.breakers) {
            for (int i = 0; i < 6; i++) {
                CircuitBreaker.Token t = breaker.allow();
                if (t.allowed) {
                    t.report(false);
                }
            }
        }

        IOException thrown = null;
        try {
            http.newCall(newTC3Request("cvm.tencentcloudapi.com")).execute();
            fail("expected IOException when every breaker is open");
        } catch (IOException e) {
            thrown = e;
        }
        // Primary message names the last skipped host.
        assertTrue("primary message must mention breaker skip, got: " + thrown.getMessage(),
                thrown.getMessage().contains("circuit breaker open"));
        // Two suppressed entries — one per other TLD.
        assertEquals(2, thrown.getSuppressed().length);
        for (Throwable s : thrown.getSuppressed()) {
            assertTrue("suppressed must mention breaker skip, got: " + s.getMessage(),
                    s.getMessage().contains("circuit breaker open"));
        }
        assertEquals("must not send any request when every breaker is open",
                0, transport.received.size());
    }

    // ---- Sustained failure trips the breaker (subsequent attempts skip the host) ----

    @Test
    public void e2eRepeatedDnsFailureTripsBreakerOnOriginTld() throws Exception {
        AbstractClient client = newTC3Client();
        TransportStub transport = new TransportStub();
        OkHttpClient http = newE2EClient(client, transport);

        // Drive 5 requests where .com always fails DNS and .cn always succeeds.
        // The .cn success path does not touch the .com breaker, so .com
        // accumulates 5 failures with 100% fail-rate (failures>=maxFailNum=5
        // && failPercentage>=0.75) and trips Open. Subsequent requests must
        // skip .com on the first attempt. Force origin reprobe each loop so
        // every iteration actually hits .com first (otherwise `.cn`-prefer
        // ordering kicks in after the first success).
        EndpointFailoverInterceptor.FailoverState state = null;
        for (int i = 0; i < 5; i++) {
            transport.programFailure(new UnknownHostException("dns miss"));
            transport.programSuccess(200, "{}");
            http.newCall(newTC3Request("cvm.tencentcloudapi.com")).execute();
            if (state == null) {
                state = EndpointFailoverInterceptor.STATE.get("cvm.tencentcloudapi.com");
                assertNotNull(state);
            }
            state.originProbeAfterMs = 0;
        }

        // Next request: .com breaker is Open, interceptor must skip .com on
        // the first attempt and go straight to .cn.
        transport.received.clear();
        transport.programSuccess(200, "{}");
        Response resp = http.newCall(newTC3Request("cvm.tencentcloudapi.com")).execute();
        assertEquals(200, resp.code());
        assertEquals("breaker should short-circuit .com without sending it to transport",
                1, transport.received.size());
        assertEquals("cvm.tencentcloudapi.cn", transport.received.get(0).url().host());
    }

    // ---- Original signature/host must NOT be the one that hit the wire on resign ----

    @Test
    public void e2eOriginalRequestNotSentTwice() throws Exception {
        AbstractClient client = newTC3Client();
        TransportStub transport = new TransportStub();
        OkHttpClient http = newE2EClient(client, transport);

        transport.programFailure(new UnknownHostException("dns miss"));
        transport.programSuccess(200, "{}");

        Request req = newTC3Request("cvm.tencentcloudapi.com");
        http.newCall(req).execute();

        Request first = transport.received.get(0);
        Request second = transport.received.get(1);
        assertNotEquals("hosts must differ between attempts",
                first.url().host(), second.url().host());
        assertNotEquals("Authorization must be resigned for new host",
                first.header("Authorization"), second.header("Authorization"));
        assertEquals("Host header must track the URL host on resign",
                second.url().host(), second.header("Host"));
    }

    // ---- E2E helpers ----

    private static Request newTC3RequestWithBody(String host, String body) {
        return new Request.Builder()
                .url("https://" + host + "/")
                .post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"),
                        body.getBytes(StandardCharsets.UTF_8)))
                .header("Content-Type", "application/json; charset=utf-8")
                .header("Host", host)
                .header("Authorization",
                        "TC3-HMAC-SHA256 Credential=AKIDTEST/2024-01-01/cvm/tc3_request,"
                                + " SignedHeaders=content-type;host, Signature=deadbeef")
                .header("X-TC-Action", "TestAction")
                .header("X-TC-Timestamp", "1700000000")
                .header("X-TC-Version", "2020-01-01")
                .header("X-TC-RequestClient", "SDK_JAVA_TEST")
                .header("X-TC-Region", "ap-guangzhou")
                .build();
    }

    /**
     * Builds an {@link OkHttpClient} whose interceptor chain is:
     * EndpointFailoverInterceptor → TransportStub. The transport stub plays
     * the role of the network so each test runs offline yet exercises the
     * real OkHttp pipeline (unlike {@link RecordingChain}).
     */
    private static OkHttpClient newE2EClient(AbstractClient client, TransportStub transport) {
        return new OkHttpClient.Builder()
                .addInterceptor(new EndpointFailoverInterceptor(client))
                .addInterceptor(transport)
                .build();
    }

    private static String bodyAsString(Request req) throws IOException {
        if (req.body() == null) {
            return "";
        }
        okio.Buffer buf = new okio.Buffer();
        req.body().writeTo(buf);
        return buf.readUtf8();
    }

    /**
     * Terminal interceptor that replaces the network. Tests script a queue of
     * {@link IOException} (failure) / {@link Response} (success) outcomes; each
     * proceed call consumes one entry. Records every request that reaches it
     * so tests can assert host / header / body content per attempt.
     */
    private static final class TransportStub implements Interceptor {
        final List<Request> received = new ArrayList<Request>();
        private final Queue<Object> programmed = new LinkedList<Object>();

        void programFailure(IOException e) {
            programmed.add(e);
        }

        void programSuccess(int code, String body) {
            programmed.add(new ProgrammedResponse(code, body));
        }

        @Override
        public Response intercept(Chain chain) throws IOException {
            Request request = chain.request();
            received.add(request);
            Object next = programmed.poll();
            if (next == null) {
                throw new IllegalStateException(
                        "TransportStub got an unexpected request to "
                                + request.url() + " — no programmed outcome left");
            }
            if (next instanceof IOException) {
                throw (IOException) next;
            }
            ProgrammedResponse pr = (ProgrammedResponse) next;
            return new Response.Builder()
                    .request(request)
                    .protocol(Protocol.HTTP_1_1)
                    .code(pr.code)
                    .message(pr.code == 200 ? "OK" : "Error")
                    .body(ResponseBody.create(MediaType.parse("application/json"), pr.body))
                    .build();
        }

        private static final class ProgrammedResponse {
            final int code;
            final String body;

            ProgrammedResponse(int code, String body) {
                this.code = code;
                this.body = body;
            }
        }
    }
}
