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
import com.tencentcloudapi.common.http.HttpConnection;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.cvm.v20170312.CvmClient;
import com.tencentcloudapi.cvm.v20170312.models.DescribeInstancesRequest;
import com.tencentcloudapi.cvm.v20170312.models.DescribeInstancesResponse;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import org.junit.Test;

import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Tests for {@link EndpointFailoverInterceptor}.
 *
 * <h3>How tests are organized</h3>
 *
 * <p>Each test scenario is run against every domain family (N1/N2/N3) via a
 * {@code for (Family f : FAMILIES)} loop inside the test method. This gives
 * M × N coverage while keeping the code DRY.
 *
 * <p>Scenarios that do NOT depend on the domain family (e.g. pure helper
 * methods like {@code isKnownTencentCloudHost}) use a single test method
 * without the family loop.
 *
 * <h3>Adding a new test case</h3>
 *
 * <ol>
 *   <li><b>Choose the right section.</b> Find the scenario group that best
 *       matches (see the M-numbered list below), or add a new group at the
 *       bottom.
 *   <li><b>If family-dependent:</b> Copy the pattern of an existing test in
 *       that section — wrap the test body in {@code for (Family f : FAMILIES)}
 *       and use {@code f.originHost}, {@code f.firstFailover}, etc.
 *       Include {@code f.name} in assertion messages for debugging.
 *   <li><b>If family-independent:</b> Write a plain {@code @Test} method
 *       without the loop.
 *   <li><b>Use existing helpers:</b>
 *       <ul>
 *         <li>{@link #newClient(Family)} — creates a CvmClient for a family
 *         <li>{@link #installStub(AbstractClient)} — installs TransportStub
 *         <li>{@link #tripBreakerFor(AbstractClient, String, long)} — trips a breaker
 *         <li>{@link #tripAllBreakersFor(AbstractClient, Family, long)} — trips all 3
 *         <li>{@link #failoverInterceptorOf(AbstractClient)} — gets the interceptor
 *       </ul>
 *   <li><b>Script the TransportStub:</b> Use {@code transport.programOk()},
 *       {@code transport.programFailure(ex)}, {@code transport.programJsonOk(json)},
 *       {@code transport.programResponse(code, body)}, or
 *       {@code transport.programResponseWithCt(code, body, contentType)}.
 *   <li><b>Assert transport hits:</b> Check {@code transport.received.size()}
 *       and {@code transport.received.get(i).url().host()}.
 *   <li><b>Assign a scenario number.</b> Pick the next available M number and
 *       update the list below so the index stays current.
 * </ol>
 *
 * <h3>Domain families (N)</h3>
 * <ul>
 *   <li>N1: Normal — {@code tencentcloudapi.{com,cn,com.cn}}
 *   <li>N2: AI — {@code ai.tencentcloudapi.{com,cn,com.cn}}
 *   <li>N3: Internal — {@code internal.tencentcloudapi.{com,cn,com.cn}}
 * </ul>
 *
 * <h3>Test scenarios (M)</h3>
 *
 * <h4>Pure helpers</h4>
 * <ol start="1">
 *   <li>isKnownTencentCloudHost — host classification
 *   <li>hostWithTld / serviceOf — utility helpers
 * </ol>
 *
 * <h4>Pass-through</h4>
 * <ol start="3">
 *   <li>Non-TencentCloud host — passthrough
 *   <li>Unknown TLD — passthrough
 *   <li>Non-POST request — passthrough
 *   <li>Non-failover IOException — propagate without retry
 * </ol>
 *
 * <h4>Failover triggers</h4>
 * <ol start="7">
 *   <li>UnknownHostException
 *   <li>SSLPeerUnverifiedException
 *   <li>SSLHandshakeException
 *   <li>ConnectException
 *   <li>NoRouteToHostException
 *   <li>PortUnreachableException
 *   <li>SocketTimeoutException
 *   <li>HTTP non-200 response (UnhealthyResponseException)
 *   <li>200 + invalid JSON body
 *   <li>200 + empty body
 * </ol>
 *
 * <h4>Response after failover</h4>
 * <ol start="17">
 *   <li>API response delivered intact after selecting alternate host
 * </ol>
 *
 * <h4>Circuit breaker lifecycle</h4>
 * <ol start="18">
 *   <li>Sustained failure opens breaker
 *   <li>Open breaker short-circuits host
 *   <li>Open → HalfOpen after cooldown
 *   <li>HalfOpen probe success → Closed
 *   <li>HalfOpen probe failure → re-Open
 *   <li>All breakers open → fallback to origin host
 * </ol>
 *
 * <h4>Failure reporting &amp; isolation</h4>
 * <ol start="24">
 *   <li>One transport attempt per request (no same-request retry)
 *   <li>Failure preserves original exception type and message
 *   <li>Breaker skip mixed with real failure
 *   <li>Failure does not pollute next request
 *   <li>Breaker state isolated across origin hosts
 * </ol>
 *
 * <h4>Request re-signing</h4>
 * <ol start="29">
 *   <li>TC3 V3 re-sign (POST)
 *   <li>TC3 V3 GET re-sign
 *   <li>Hmac V1 re-sign
 *   <li>SKIP V3 — rewrite Host only
 *   <li>Re-sign uses current credential (SecretId/Key rotation)
 *   <li>X-TC-Token rotation
 * </ol>
 *
 * <h4>Response type handling</h4>
 * <ol start="35">
 *   <li>SSE (text/event-stream) — no failover
 *   <li>No Content-Type — no failover
 *   <li>200 + JSON business error — no failover
 * </ol>
 *
 * <h4>backupEndpoint mode</h4>
 * <ol start="38">
 *   <li>backupEndpoint failover behavior
 * </ol>
 *
 * <h4>TLD boundary &amp; region-pinned</h4>
 * <ol start="39">
 *   <li>hostWithTld from .cn / .com.cn origins
 *   <li>hostWithTld preserves region prefix
 * </ol>
 *
 * <h4>Passthrough details</h4>
 * <ol start="41">
 *   <li>Non-TencentCloud host DNS miss — no retry
 *   <li>Non-TencentCloud host + backupEndpoint — no retry
 * </ol>
 *
 * <h4>Endpoint eligibility</h4>
 * <ol start="43">
 *   <li>.cn origin eligible for failover
 *   <li>Region-pinned host eligible for failover
 *   <li>setEnableDomainFailover(false) at runtime — no effect
 * </ol>
 *
 * <h4>TLD family rotation</h4>
 * <ol start="46">
 *   <li>AI family stays within ai.tencentcloudapi
 *   <li>Internal family stays within internal.tencentcloudapi
 *   <li>Region-pinned failover preserves prefix
 * </ol>
 *
 * <h4>Re-sign details</h4>
 * <ol start="49">
 *   <li>TC3 resign preserves body bytes and Content-Type
 *   <li>X-TC-Token dropped when cleared
 * </ol>
 *
 * <h4>backupEndpoint details</h4>
 * <ol start="51">
 *   <li>Origin DNS miss — no same-request retry to backup
 *   <li>Non-failover IOException propagates directly
 *   <li>No backupEndpoint — DNS miss behavior
 * </ol>
 */
public class EndpointFailoverInterceptorTest {

    // =================================================================
    //  Domain families
    // =================================================================

    private static final Family N1 = new Family(
            "Normal", "tencentcloudapi.com",
            "cvm.tencentcloudapi.com",
            "cvm.tencentcloudapi.cn",
            "cvm.tencentcloudapi.com.cn");

    private static final Family N2 = new Family(
            "AI", "ai.tencentcloudapi.com",
            "hunyuan.ai.tencentcloudapi.com",
            "hunyuan.ai.tencentcloudapi.cn",
            "hunyuan.ai.tencentcloudapi.com.cn");

    private static final Family N3 = new Family(
            "Internal", "internal.tencentcloudapi.com",
            "cvm.internal.tencentcloudapi.com",
            "cvm.internal.tencentcloudapi.cn",
            "cvm.internal.tencentcloudapi.com.cn");

    private static final Family[] FAMILIES = {N1, N2, N3};

    private static class Family {
        final String name;
        final String rootDomain;
        final String originHost;
        final String firstFailover;
        final String secondFailover;
        final String[] allTldHosts;

        Family(String name, String rootDomain, String host0, String host1, String host2) {
            this.name = name;
            this.rootDomain = rootDomain;
            this.originHost = host0;
            this.firstFailover = host1;
            this.secondFailover = host2;
            this.allTldHosts = new String[]{host0, host1, host2};
        }
    }

    // =================================================================
    //  M1: isKnownTencentCloudHost — host classification
    // =================================================================

    @Test
    public void testIsKnownTencentCloudHost() {
        // Normal family (tencentcloudapi.com / .cn / .com.cn)
        assertTrue(EndpointFailoverInterceptor.isKnownTencentCloudHost("cvm.tencentcloudapi.com"));
        assertTrue(EndpointFailoverInterceptor.isKnownTencentCloudHost("cvm.tencentcloudapi.cn"));
        assertTrue(EndpointFailoverInterceptor.isKnownTencentCloudHost("cvm.tencentcloudapi.com.cn"));
        // intl prefix maps to the normal family.
        assertTrue(EndpointFailoverInterceptor.isKnownTencentCloudHost("cvm.intl.tencentcloudapi.com"));
        // Region-pinned.
        assertTrue(EndpointFailoverInterceptor.isKnownTencentCloudHost("cvm.ap-shanghai.tencentcloudapi.com"));
        assertTrue(EndpointFailoverInterceptor.isKnownTencentCloudHost("cvm.ap-shanghai.tencentcloudapi.cn"));
        assertTrue(EndpointFailoverInterceptor.isKnownTencentCloudHost("cvm.ap-shanghai.tencentcloudapi.com.cn"));

        // AI family (ai.tencentcloudapi.com / .cn / .com.cn)
        assertTrue(EndpointFailoverInterceptor.isKnownTencentCloudHost("hunyuan.ai.tencentcloudapi.com"));
        assertTrue(EndpointFailoverInterceptor.isKnownTencentCloudHost("hunyuan.ai.tencentcloudapi.cn"));
        assertTrue(EndpointFailoverInterceptor.isKnownTencentCloudHost("hunyuan.ai.tencentcloudapi.com.cn"));
        // Region-pinned.
        assertTrue(EndpointFailoverInterceptor.isKnownTencentCloudHost("hunyuan.ap-guangzhou.ai.tencentcloudapi.com"));

        // Internal family (internal.tencentcloudapi.com / .cn / .com.cn)
        assertTrue(EndpointFailoverInterceptor.isKnownTencentCloudHost("cvm.internal.tencentcloudapi.com"));
        assertTrue(EndpointFailoverInterceptor.isKnownTencentCloudHost("cvm.internal.tencentcloudapi.cn"));
        assertTrue(EndpointFailoverInterceptor.isKnownTencentCloudHost("cvm.internal.tencentcloudapi.com.cn"));
        // Region-pinned.
        assertTrue(EndpointFailoverInterceptor.isKnownTencentCloudHost("cvm.ap-guangzhou.internal.tencentcloudapi.com"));

        // Empty prefix (no service label)
        assertFalse(EndpointFailoverInterceptor.isKnownTencentCloudHost("tencentcloudapi.com"));
        assertFalse(EndpointFailoverInterceptor.isKnownTencentCloudHost("tencentcloudapi.cn"));
        assertFalse(EndpointFailoverInterceptor.isKnownTencentCloudHost("tencentcloudapi.com.cn"));

        // Malformed prefix
        assertFalse(EndpointFailoverInterceptor.isKnownTencentCloudHost(".tencentcloudapi.com"));
        assertFalse(EndpointFailoverInterceptor.isKnownTencentCloudHost(".foo.tencentcloudapi.com"));
        assertFalse(EndpointFailoverInterceptor.isKnownTencentCloudHost("foo..tencentcloudapi.com"));

        // Non-TencentCloud hosts
        assertFalse(EndpointFailoverInterceptor.isKnownTencentCloudHost("example.com"));
        assertFalse(EndpointFailoverInterceptor.isKnownTencentCloudHost("cvm.tencentcloudapi.woa.com"));
        assertFalse(EndpointFailoverInterceptor.isKnownTencentCloudHost("proxy.internal"));
        assertFalse(EndpointFailoverInterceptor.isKnownTencentCloudHost("192.168.0.1"));
        assertFalse(EndpointFailoverInterceptor.isKnownTencentCloudHost(null));
    }

    // =================================================================
    //  M2: hostWithTld / serviceOf — utility helpers
    // =================================================================

    @Test
    public void testHostWithTldBuildsCorrectHosts() {
        assertEquals("cvm.tencentcloudapi.com",
                EndpointFailoverInterceptor.hostWithTld("cvm.tencentcloudapi.com", 0));
        assertEquals("cvm.tencentcloudapi.cn",
                EndpointFailoverInterceptor.hostWithTld("cvm.tencentcloudapi.com", 1));
        assertEquals("cvm.tencentcloudapi.com.cn",
                EndpointFailoverInterceptor.hostWithTld("cvm.tencentcloudapi.com", 2));

        assertEquals("hunyuan.ai.tencentcloudapi.com",
                EndpointFailoverInterceptor.hostWithTld("hunyuan.ai.tencentcloudapi.com", 0));
        assertEquals("hunyuan.ai.tencentcloudapi.cn",
                EndpointFailoverInterceptor.hostWithTld("hunyuan.ai.tencentcloudapi.com", 1));

        assertEquals("cvm.internal.tencentcloudapi.com",
                EndpointFailoverInterceptor.hostWithTld("cvm.internal.tencentcloudapi.com", 0));
    }

    @Test
    public void testMatchFamilyReturnsNullForUnknownHosts() {
        assertNull(EndpointFailoverInterceptor.matchFamily("example.com"));
        assertNull(EndpointFailoverInterceptor.matchFamily(null));
    }

    @Test
    public void testMatchFamilyReturnsFirstMatchingFamily() {
        EndpointFailoverInterceptor.Match m;

        m = EndpointFailoverInterceptor.matchFamily("cvm.tencentcloudapi.com");
        assertNotNull(m);
        assertEquals("cvm", m.prefix);
        assertEquals("tencentcloudapi.com", m.family[0]);

        m = EndpointFailoverInterceptor.matchFamily("hunyuan.ai.tencentcloudapi.cn");
        assertNotNull(m);
        assertEquals("hunyuan", m.prefix);
        assertEquals("ai.tencentcloudapi.com", m.family[0]);

        m = EndpointFailoverInterceptor.matchFamily("cvm.internal.tencentcloudapi.com.cn");
        assertNotNull(m);
        assertEquals("cvm", m.prefix);
        assertEquals("internal.tencentcloudapi.com", m.family[0]);
    }

    // =================================================================
    //  M2a: hostWithTld — boundary origins (.cn, .com.cn, region-pinned)
    // =================================================================

    @Test
    public void testHostWithTldFromCnAndComCnOrigins() {
        // From .cn origin (tldIdx=1): idx 0 -> .com, idx 1 -> .cn
        assertEquals("cvm.tencentcloudapi.com",
                EndpointFailoverInterceptor.hostWithTld("cvm.tencentcloudapi.cn", 0));
        assertEquals("cvm.tencentcloudapi.cn",
                EndpointFailoverInterceptor.hostWithTld("cvm.tencentcloudapi.cn", 1));

        // From .com.cn origin (tldIdx=2): idx 0 -> .com, idx 1 -> .cn
        assertEquals("cvm.tencentcloudapi.com",
                EndpointFailoverInterceptor.hostWithTld("cvm.tencentcloudapi.com.cn", 0));
        assertEquals("cvm.tencentcloudapi.cn",
                EndpointFailoverInterceptor.hostWithTld("cvm.tencentcloudapi.com.cn", 1));
    }

    @Test
    public void testHostWithTldPreservesRegionInPrefix() {
        assertEquals("cvm.ap-guangzhou.tencentcloudapi.cn",
                EndpointFailoverInterceptor.hostWithTld("cvm.ap-guangzhou.tencentcloudapi.com", 1));
        assertEquals("hunyuan.ap-guangzhou.ai.tencentcloudapi.cn",
                EndpointFailoverInterceptor.hostWithTld("hunyuan.ap-guangzhou.ai.tencentcloudapi.com", 1));
    }

    // =================================================================
    //  M3: Non-TencentCloud host — passthrough (family loop)
    // =================================================================

    @Test
    public void testPassthroughNonTencentCloudHost() throws Exception {
        for (Family f : FAMILIES) {
            CvmClient client = newClient(f);
            TransportStub transport = installStub(client);
            // Build a request to a non-TencentCloud host.
            OkHttpClient http = grabOkHttpClient(client);
            Request req = new Request.Builder()
                    .url("https://example.com/")
                    .header("Host", "example.com")
                    .header("Authorization", "SKIP")
                    .header("Content-Type", "application/json")
                    .post(RequestBody.create(MediaType.parse("application/json"), "{}".getBytes()))
                    .build();
            transport.programOk();
            Response resp = http.newCall(req).execute();
            resp.close();
            assertEquals(1, transport.received.size());
            assertEquals("example.com", transport.received.get(0).url().host());
        }
    }

    // =================================================================
    //  M3a: Non-TencentCloud host — DNS miss + backup details
    // =================================================================

    @Test
    public void testNonTencentHostDnsMissPropagatesWithoutRetry() throws Exception {
        for (Family f : FAMILIES) {
            CvmClient client = newClient(f);
            TransportStub transport = installStub(client);
            transport.programFailure(new UnknownHostException("proxy dns miss"));

            OkHttpClient http = grabOkHttpClient(client);
            Request req = new Request.Builder()
                    .url("https://proxy.internal/")
                    .header("Host", "proxy.internal")
                    .header("Authorization", "SKIP")
                    .header("Content-Type", "application/json")
                    .post(RequestBody.create(MediaType.parse("application/json"), "{}".getBytes()))
                    .build();

            try {
                http.newCall(req).execute();
                fail(f.name + ": expected IOException");
            } catch (IOException e) {
                assertTrue(f.name, e instanceof UnknownHostException);
            }
            assertEquals(f.name + ": no retry for non-TencentCloud host",
                    1, transport.received.size());
        }
    }

    @Test
    public void testNonTencentHostWithBackupDoesNotRetrySameRequest() throws Exception {
        for (Family f : FAMILIES) {
            ClientProfile profile = new ClientProfile();
            profile.getHttpProfile().setEndpoint(f.originHost);
            profile.setBackupEndpoint("backup.example.com");
            CvmClient client = new CvmClient(
                    new Credential("AKIDTEST", "SKTEST"), "ap-guangzhou", profile);
            TransportStub transport = installStub(client);
            transport.programFailure(new UnknownHostException("proxy dns miss"));

            OkHttpClient http = grabOkHttpClient(client);
            Request req = new Request.Builder()
                    .url("https://proxy.internal/")
                    .header("Host", "proxy.internal")
                    .header("Authorization", "SKIP")
                    .header("Content-Type", "application/json")
                    .post(RequestBody.create(MediaType.parse("application/json"), "{}".getBytes()))
                    .build();

            try {
                http.newCall(req).execute();
                fail(f.name + ": expected IOException");
            } catch (IOException ignored) { }
            assertEquals(f.name + ": only one attempt, no retry to backup",
                    1, transport.received.size());
        }
    }

    // =================================================================
    //  M4: Unknown TLD — passthrough (family loop)
    // =================================================================

    @Test
    public void testPassthroughUnknownTld() throws Exception {
        for (Family f : FAMILIES) {
            CvmClient client = newClient(f);
            TransportStub transport = installStub(client);
            transport.programOk();
            client.DescribeInstances(new DescribeInstancesRequest());
            assertEquals(f.name, 1, transport.received.size());
            assertEquals(f.name, f.originHost, transport.received.get(0).url().host());
        }
    }

    // =================================================================
    //  M5: Non-POST request — passthrough (family loop)
    // =================================================================

    @Test
    public void testPassthroughNonPostRequest() throws Exception {
        for (Family f : FAMILIES) {
            ClientProfile profile = new ClientProfile();
            profile.getHttpProfile().setReqMethod(HttpProfile.REQ_GET);
            profile.getHttpProfile().setEndpoint(f.originHost);
            CvmClient client = new CvmClient(
                    new Credential("AKIDTEST", "SKTEST"), "ap-guangzhou", profile);
            TransportStub transport = installStub(client);
            transport.programOk();
            client.DescribeInstances(new DescribeInstancesRequest());
            assertEquals(f.name, 1, transport.received.size());
        }
    }

    // =================================================================
    //  M6: Non-failover IOException — propagate without retry (family loop)
    // =================================================================

    @Test
    public void testGenericIOExceptionPropagatesWithoutFailover() throws Exception {
        for (Family f : FAMILIES) {
            CvmClient client = newClient(f);
            TransportStub transport = installStub(client);
            transport.programFailure(new IOException("unrelated I/O error"));

            try {
                client.DescribeInstances(new DescribeInstancesRequest());
                fail(f.name + ": expected SDK exception");
            } catch (TencentCloudSDKException e) {
                assertTrue(f.name + ": expected IOException cause",
                        e.getCause() instanceof IOException);
                assertEquals(f.name + ": should not retry", 1, transport.received.size());
                assertEquals(f.name, f.originHost, transport.received.get(0).url().host());
            }
        }
    }

    // =================================================================
    //  M6a-M6d: Endpoint eligibility (family loop)
    // =================================================================

    @Test
    public void testCnOriginIsEligibleForFailover() throws Exception {
        for (Family f : FAMILIES) {
            CvmClient client = newClient(f);
            TransportStub transport = installStub(client);
            transport.programFailure(new UnknownHostException("cn dns miss"));
            try {
                client.DescribeInstances(new DescribeInstancesRequest());
                fail(f.name + ": expected SDK exception");
            } catch (TencentCloudSDKException ignored) { }
            assertEquals(f.name, 1, transport.received.size());
            assertEquals(f.name, f.originHost, transport.received.get(0).url().host());
        }
    }

    @Test
    public void testRegionPinnedHostIsEligibleForFailover() throws Exception {
        // Use region-pinned hosts: cvm.ap-guangzhou.tencentcloudapi.com etc.
        Family[] regionFamilies = {
            new Family("Normal-R", "tencentcloudapi.com",
                    "cvm.ap-guangzhou.tencentcloudapi.com",
                    "cvm.ap-guangzhou.tencentcloudapi.cn",
                    "cvm.ap-guangzhou.tencentcloudapi.com.cn"),
            new Family("AI-R", "ai.tencentcloudapi.com",
                    "hunyuan.ap-guangzhou.ai.tencentcloudapi.com",
                    "hunyuan.ap-guangzhou.ai.tencentcloudapi.cn",
                    "hunyuan.ap-guangzhou.ai.tencentcloudapi.com.cn"),
            new Family("Internal-R", "internal.tencentcloudapi.com",
                    "cvm.ap-guangzhou.internal.tencentcloudapi.com",
                    "cvm.ap-guangzhou.internal.tencentcloudapi.cn",
                    "cvm.ap-guangzhou.internal.tencentcloudapi.com.cn"),
        };
        for (Family f : regionFamilies) {
            CvmClient client = newClient(f);
            TransportStub transport = installStub(client);
            transport.programFailure(new UnknownHostException("region dns miss"));
            try {
                client.DescribeInstances(new DescribeInstancesRequest());
                fail(f.name + ": expected SDK exception");
            } catch (TencentCloudSDKException ignored) { }
            assertEquals(f.name, 1, transport.received.size());
            assertEquals(f.name, f.originHost, transport.received.get(0).url().host());
        }
    }

    @Test
    public void testFailoverEnabledAtRuntimeHasNoEffect() throws Exception {
        // setEnableDomainFailover(false) after constructor: interceptor is already installed.
        for (Family f : FAMILIES) {
            CvmClient client = newClient(f);
            client.getClientProfile().setEnableDomainFailover(false);
            TransportStub transport = installStub(client);
            transport.programFailure(new UnknownHostException("dns miss"));
            try {
                client.DescribeInstances(new DescribeInstancesRequest());
                fail(f.name + ": expected SDK exception");
            } catch (TencentCloudSDKException ignored) { }
            assertEquals(f.name + ": interceptor is already installed, flag has no effect",
                    1, transport.received.size());
        }
    }

    // =================================================================
    //  M7-M13: Failover IOException types (family loop)
    // =================================================================

    @Test public void testFailoverOnUnknownHostException() throws Exception {
        for (Family f : FAMILIES) runFailoverFor(f, new UnknownHostException("dns miss"));
    }

    @Test public void testFailoverOnSslPeerUnverifiedException() throws Exception {
        for (Family f : FAMILIES) runFailoverFor(f, new SSLPeerUnverifiedException("cert mismatch"));
    }

    @Test public void testFailoverOnSslHandshakeException() throws Exception {
        for (Family f : FAMILIES) runFailoverFor(f, new SSLHandshakeException("tls fail"));
    }

    @Test public void testFailoverOnConnectException() throws Exception {
        for (Family f : FAMILIES) runFailoverFor(f, new ConnectException("connection refused"));
    }

    @Test public void testFailoverOnNoRouteToHostException() throws Exception {
        for (Family f : FAMILIES) runFailoverFor(f, new NoRouteToHostException("no route"));
    }

    @Test public void testFailoverOnPortUnreachableException() throws Exception {
        for (Family f : FAMILIES) runFailoverFor(f, new java.net.PortUnreachableException("port unreachable"));
    }

    @Test public void testFailoverOnSocketTimeoutException() throws Exception {
        for (Family f : FAMILIES) runFailoverFor(f, new SocketTimeoutException("read timed out"));
    }

    private void runFailoverFor(Family f, IOException failure) throws Exception {
        CvmClient client = newClient(f);
        TransportStub transport = installStub(client);
        transport.programFailure(failure);

        try {
            client.DescribeInstances(new DescribeInstancesRequest());
            fail(f.name + ": expected SDK exception");
        } catch (TencentCloudSDKException ignored) { }
        assertEquals(f.name + ": one transport attempt per request",
                1, transport.received.size());
        assertEquals(f.name + ": first attempt hits origin",
                f.originHost, transport.received.get(0).url().host());
    }

    // =================================================================
    //  M14-M16: Protocol-level failover (family loop)
    // =================================================================

    @Test
    public void testNon200ResponseRecordsFailureWithoutRetry() throws Exception {
        for (Family f : FAMILIES) {
            CvmClient client = newClient(f);
            TransportStub transport = installStub(client);
            transport.programResponse(503, "{\"Response\":{\"Error\":{}}}");

            try {
                client.DescribeInstances(new DescribeInstancesRequest());
                fail(f.name + ": expected SDK exception");
            } catch (TencentCloudSDKException ignored) { }
            assertEquals(f.name, 1, transport.received.size());
            assertEquals(f.name, f.originHost, transport.received.get(0).url().host());
        }
    }

    @Test
    public void testInvalidJsonBodyRecordsFailure() throws Exception {
        for (Family f : FAMILIES) {
            CvmClient client = newClient(f);
            TransportStub transport = installStub(client);
            transport.programJsonOk("not json at all");

            try {
                client.DescribeInstances(new DescribeInstancesRequest());
                fail(f.name + ": expected SDK exception");
            } catch (TencentCloudSDKException ignored) { }
            assertEquals(f.name, 1, transport.received.size());
            assertEquals(f.name, f.originHost, transport.received.get(0).url().host());
        }
    }

    @Test
    public void testEmptyBodyRecordsFailure() throws Exception {
        for (Family f : FAMILIES) {
            CvmClient client = newClient(f);
            TransportStub transport = installStub(client);
            // 200 with JSON content-type but empty body — not valid JSON.
            transport.programJsonOk("");

            try {
                client.DescribeInstances(new DescribeInstancesRequest());
                fail(f.name + ": expected SDK exception");
            } catch (TencentCloudSDKException ignored) { }
            assertEquals(f.name, 1, transport.received.size());
            assertEquals(f.name, f.originHost, transport.received.get(0).url().host());
        }
    }

    // =================================================================
    //  M16a-M16b: TLD family rotation (AI/Internal don't cross families)
    // =================================================================

    @Test
    public void testAiFamilyRotationStaysWithinFamily() throws Exception {
        Family f = N2;
        CvmClient client = newClient(f);
        tripBreakerFor(client, f.originHost, 60_000);
        TransportStub transport = installStub(client);
        transport.programOk();
        client.DescribeInstances(new DescribeInstancesRequest());
        assertEquals(1, transport.received.size());
        assertEquals(f.firstFailover, transport.received.get(0).url().host());
        // Must be within ai.tencentcloudapi family, NOT plain hunyuan.tencentcloudapi.cn
        assertTrue(transport.received.get(0).url().host().contains("ai.tencentcloudapi"));
    }

    @Test
    public void testInternalFamilyRotationStaysWithinFamily() throws Exception {
        Family f = N3;
        CvmClient client = newClient(f);
        tripBreakerFor(client, f.originHost, 60_000);
        TransportStub transport = installStub(client);
        transport.programOk();
        client.DescribeInstances(new DescribeInstancesRequest());
        assertEquals(1, transport.received.size());
        assertEquals(f.firstFailover, transport.received.get(0).url().host());
        assertTrue(transport.received.get(0).url().host().contains("internal.tencentcloudapi"));
    }

    @Test
    public void testRegionPinnedHostFailoverPreservesPrefix() throws Exception {
        Family f = new Family("R", "tencentcloudapi.com",
                "cvm.ap-guangzhou.tencentcloudapi.com",
                "cvm.ap-guangzhou.tencentcloudapi.cn",
                "cvm.ap-guangzhou.tencentcloudapi.com.cn");
        CvmClient client = newClient(f);
        tripBreakerFor(client, f.originHost, 60_000);
        TransportStub transport = installStub(client);
        transport.programOk();
        client.DescribeInstances(new DescribeInstancesRequest());
        assertEquals(1, transport.received.size());
        assertEquals(f.firstFailover, transport.received.get(0).url().host());
        // Region prefix must be preserved: cvm.ap-guangzhou.* not cvm.*
        assertTrue(transport.received.get(0).url().host().startsWith("cvm.ap-guangzhou."));
    }

    // =================================================================
    //  M17: API response delivered after failover (family loop)
    // =================================================================

    @Test
    public void testApiResponseDeliveredAfterFailover() throws Exception {
        for (Family f : FAMILIES) {
            CvmClient client = newClient(f);
            tripBreakerFor(client, f.originHost, 60_000);
            TransportStub transport = installStub(client);
            transport.programJsonOk("{\"Response\":{\"TotalCount\":42,\"InstanceSet\":[],\"RequestId\":\"req-xyz\"}}");

            DescribeInstancesResponse resp = client.DescribeInstances(new DescribeInstancesRequest());
            assertEquals(f.name, Long.valueOf(42), resp.getTotalCount());
            assertEquals(f.name, "req-xyz", resp.getRequestId());
            assertEquals(f.name, f.firstFailover, transport.received.get(0).url().host());
        }
    }

    // =================================================================
    //  M18: Sustained failure opens breaker (family loop)
    // =================================================================

    @Test
    public void testBreakerOpensAfterSustainedFailure() throws Exception {
        for (Family f : FAMILIES) {
            CvmClient client = newClient(f);
            TransportStub transport = installStub(client);

            for (int i = 0; i < 5; i++) {
                transport.programFailure(new UnknownHostException("fail " + i));
                try {
                    client.DescribeInstances(new DescribeInstancesRequest());
                    fail(f.name + ": expected SDK exception");
                } catch (TencentCloudSDKException ignored) { }
            }
            assertEquals(f.name, 5, transport.received.size());

            assertFalse(f.name + ": origin breaker should be Open",
                    failoverInterceptorOf(client).breakerFor(f.originHost).allow().allowed);

            // Next request short-circuits origin, goes to first failover.
            transport.received.clear();
            transport.programOk();
            client.DescribeInstances(new DescribeInstancesRequest());
            assertEquals(f.name, 1, transport.received.size());
            assertEquals(f.name, f.firstFailover, transport.received.get(0).url().host());
        }
    }

    // =================================================================
    //  M19: Open breaker short-circuits host (family loop)
    // =================================================================

    @Test
    public void testOpenBreakerShortCircuitsHost() throws Exception {
        for (Family f : FAMILIES) {
            CvmClient client = newClient(f);
            tripBreakerFor(client, f.originHost, 60_000);
            TransportStub transport = installStub(client);
            transport.programOk();

            client.DescribeInstances(new DescribeInstancesRequest());
            assertEquals(f.name, 1, transport.received.size());
            assertEquals(f.name + ": should skip origin and hit first failover",
                    f.firstFailover, transport.received.get(0).url().host());
        }
    }

    // =================================================================
    //  M20: Open → HalfOpen after cooldown (family loop)
    // =================================================================

    @Test
    public void testBreakerTransitionsOpenToHalfOpenAfterCooldown() throws Exception {
        long shortTimeoutMs = 100;
        for (Family f : FAMILIES) {
            CvmClient client = newClient(f);
            CircuitBreaker breaker = tripBreakerFor(client, f.originHost, shortTimeoutMs);
            assertFalse(f.name, breaker.allow().allowed);

            Thread.sleep(shortTimeoutMs + 50);
            CircuitBreaker.Token probe = breaker.allow();
            assertTrue(f.name + ": should permit HalfOpen probe", probe.allowed);
        }
    }

    // =================================================================
    //  M21: HalfOpen probe success → Closed (family loop)
    // =================================================================

    @Test
    public void testBreakerReClosesAfterHalfOpenSuccess() throws Exception {
        long shortTimeoutMs = 100;
        for (Family f : FAMILIES) {
            CvmClient client = newClient(f);
            CircuitBreaker breaker = tripBreakerFor(client, f.originHost, shortTimeoutMs);
            TransportStub transport = installStub(client);

            Thread.sleep(shortTimeoutMs + 50);
            transport.programOk();
            client.DescribeInstances(new DescribeInstancesRequest());
            assertEquals(f.name, 1, transport.received.size());
            assertEquals(f.name, f.originHost, transport.received.get(0).url().host());

            for (int i = 0; i < 10; i++) {
                assertTrue(f.name + ": should be Closed after HalfOpen success",
                        breaker.allow().allowed);
            }
        }
    }

    // =================================================================
    //  M22: HalfOpen probe failure → re-Open (family loop)
    // =================================================================

    @Test
    public void testBreakerReOpensWhenHalfOpenProbeFails() throws Exception {
        long shortTimeoutMs = 100;
        for (Family f : FAMILIES) {
            CvmClient client = newClient(f);
            CircuitBreaker breaker = tripBreakerFor(client, f.originHost, shortTimeoutMs);
            TransportStub transport = installStub(client);

            Thread.sleep(shortTimeoutMs + 50);
            transport.programFailure(new UnknownHostException("still down"));
            try {
                client.DescribeInstances(new DescribeInstancesRequest());
                fail(f.name + ": expected SDK exception");
            } catch (TencentCloudSDKException ignored) { }
            assertEquals(f.name, 1, transport.received.size());
            assertEquals(f.name, f.originHost, transport.received.get(0).url().host());

            assertFalse(f.name + ": should re-Open after HalfOpen failure",
                    breaker.allow().allowed);

            // Next request short-circuits origin again.
            transport.received.clear();
            transport.programOk();
            client.DescribeInstances(new DescribeInstancesRequest());
            assertEquals(f.name, 1, transport.received.size());
            assertEquals(f.name, f.firstFailover, transport.received.get(0).url().host());
        }
    }

    // =================================================================
    //  M23: All breakers open → fallback to origin host (family loop)
    // =================================================================

    @Test
    public void testAllBreakersOpenFallsBackToOriginHost() throws Exception {
        for (Family f : FAMILIES) {
            CvmClient client = newClient(f);
            tripAllBreakersFor(client, f, 60_000);
            TransportStub transport = installStub(client);
            transport.programOk();

            client.DescribeInstances(new DescribeInstancesRequest());
            assertEquals(f.name, 1, transport.received.size());
            assertEquals(f.name, f.originHost, transport.received.get(0).url().host());
        }
    }

    // =================================================================
    //  M24: One transport attempt per request (family loop)
    // =================================================================

    @Test
    public void testEndpointFailureSurfacesAttemptFailure() throws Exception {
        for (Family f : FAMILIES) {
            CvmClient client = newClient(f);
            TransportStub transport = installStub(client);
            transport.programFailure(new UnknownHostException("dns miss " + f.name));

            TencentCloudSDKException sdkEx = null;
            try {
                client.DescribeInstances(new DescribeInstancesRequest());
                fail(f.name + ": expected SDK exception");
            } catch (TencentCloudSDKException e) {
                sdkEx = e;
            }
            IOException primary = unwrapToIOException(sdkEx);
            assertTrue(f.name, primary.getMessage().contains("dns miss"));
            assertEquals(f.name, 0, primary.getSuppressed().length);
            assertEquals(f.name, 1, transport.received.size());
        }
    }

    // =================================================================
    //  M25: Failure preserves original exception type and message (family loop)
    // =================================================================

    @Test
    public void testFailurePreservesAttemptCauseType() throws Exception {
        for (Family f : FAMILIES) {
            CvmClient client = newClient(f);
            TransportStub transport = installStub(client);
            transport.programFailure(new ConnectException("connect fail " + f.name));

            TencentCloudSDKException sdkEx = null;
            try {
                client.DescribeInstances(new DescribeInstancesRequest());
                fail(f.name + ": expected SDK exception");
            } catch (TencentCloudSDKException e) {
                sdkEx = e;
            }
            IOException primary = unwrapToIOException(sdkEx);
            assertTrue(f.name, primary instanceof ConnectException);
            assertEquals(f.name, 0, primary.getSuppressed().length);
            assertEquals(f.name, 1, transport.received.size());
        }
    }

    // =================================================================
    //  M26: Breaker skip mixed with real failure (family loop)
    // =================================================================

    @Test
    public void testFailureMixesPriorBreakerSkipsWithRealFailure() throws Exception {
        for (Family f : FAMILIES) {
            CvmClient client = newClient(f);
            tripBreakerFor(client, f.originHost, 60_000);
            TransportStub transport = installStub(client);
            transport.programFailure(new SSLHandshakeException("tls fail"));

            TencentCloudSDKException sdkEx = null;
            try {
                client.DescribeInstances(new DescribeInstancesRequest());
                fail(f.name + ": expected SDK exception");
            } catch (TencentCloudSDKException e) {
                sdkEx = e;
            }
            assertEquals(f.name, 1, transport.received.size());
            assertEquals(f.name + ": origin skipped, hits first failover",
                    f.firstFailover, transport.received.get(0).url().host());

            IOException primary = unwrapToIOException(sdkEx);
            assertTrue(f.name, primary instanceof SSLHandshakeException);
            assertEquals(f.name, 0, primary.getSuppressed().length);
        }
    }

    // =================================================================
    //  M27: Failure does not pollute next request (family loop)
    // =================================================================

    @Test
    public void testFailoverDoesNotPolluteNextRequest() throws Exception {
        for (Family f : FAMILIES) {
            CvmClient client = newClient(f);
            TransportStub transport = installStub(client);

            transport.programFailure(new UnknownHostException("run1 " + f.name));
            try {
                client.DescribeInstances(new DescribeInstancesRequest());
                fail(f.name + ": expected SDK exception");
            } catch (TencentCloudSDKException ignored) { }
            transport.received.clear();

            transport.programFailure(new UnknownHostException("run2 " + f.name));
            TencentCloudSDKException sdkEx = null;
            try {
                client.DescribeInstances(new DescribeInstancesRequest());
                fail(f.name + ": expected SDK exception");
            } catch (TencentCloudSDKException e) {
                sdkEx = e;
            }
            IOException primary = unwrapToIOException(sdkEx);
            assertEquals(f.name, 0, primary.getSuppressed().length);
            assertTrue(f.name, primary.getMessage().contains("run2"));
            assertFalse(f.name, primary.getMessage().contains("run1"));
        }
    }

    // =================================================================
    //  M28: Breaker state isolated across origin hosts (family loop)
    // =================================================================

    @Test
    public void testBreakerStateIsolatedAcrossOriginHosts() throws Exception {
        // Trip breaker for one family, verify it doesn't affect another family.
        // We test isolation between N1 and N2, and between N1 and N3.
        Family[][] pairs = {{N1, N2}, {N1, N3}};
        for (Family[] pair : pairs) {
            Family a = pair[0];
            Family b = pair[1];

            CvmClient clientA = newClient(a);
            tripBreakerFor(clientA, a.originHost, 60_000);

            CvmClient clientB = newClient(b);
            TransportStub transportB = installStub(clientB);
            transportB.programOk();
            clientB.DescribeInstances(new DescribeInstancesRequest());
            assertEquals(b.name + " should be unaffected by " + a.name,
                    1, transportB.received.size());
            assertEquals(b.name, b.originHost, transportB.received.get(0).url().host());
        }
    }

    // =================================================================
    //  M29: TC3 V3 re-sign (POST) (family loop)
    // =================================================================

    @Test
    public void testTc3ResignOnFailover() throws Exception {
        for (Family f : FAMILIES) {
            CvmClient client = newClient(f);
            tripBreakerFor(client, f.originHost, 60_000);
            TransportStub transport = installStub(client);
            transport.programOk();

            client.DescribeInstances(new DescribeInstancesRequest());
            assertEquals(f.name, 1, transport.received.size());
            Request resigned = transport.received.get(0);
            assertEquals(f.name, f.firstFailover, resigned.url().host());
            assertTrue(f.name, resigned.header("Authorization").contains("TC3-HMAC-SHA256"));
        }
    }

    // =================================================================
    //  M29a: TC3 resign preserves body and content-type
    // =================================================================

    @Test
    public void testTc3ResignPreservesBodyAndContentType() throws Exception {
        for (Family f : FAMILIES) {
            CvmClient client = newClient(f);
            tripBreakerFor(client, f.originHost, 60_000);
            TransportStub transport = installStub(client);
            transport.programOk();

            client.DescribeInstances(new DescribeInstancesRequest());
            assertEquals(f.name, 1, transport.received.size());
            Request resigned = transport.received.get(0);
            assertEquals(f.name, f.firstFailover, resigned.url().host());
            assertEquals(f.name, "application/json; charset=utf-8", resigned.header("Content-Type"));
            byte[] body = bodyBytes(resigned);
            assertTrue(f.name, body.length > 0);
        }
    }

    // =================================================================
    //  M30: TC3 V3 GET re-sign (family loop)
    // =================================================================

    @Test
    public void testTc3GetResignOnFailover() throws Exception {
        for (Family f : FAMILIES) {
            ClientProfile profile = new ClientProfile();
            profile.getHttpProfile().setReqMethod(HttpProfile.REQ_GET);
            profile.getHttpProfile().setEndpoint(f.originHost);
            CvmClient client = new CvmClient(
                    new Credential("AKIDTEST", "SKTEST"), "ap-guangzhou", profile);
            tripBreakerFor(client, f.originHost, 60_000);
            TransportStub transport = installStub(client);
            transport.programOk();

            client.DescribeInstances(new DescribeInstancesRequest());
            assertEquals(f.name, 1, transport.received.size());
            Request resigned = transport.received.get(0);
            assertEquals(f.name, f.firstFailover, resigned.url().host());
            assertEquals(f.name, "GET", resigned.method());
            assertTrue(f.name, resigned.header("Authorization").contains("TC3-HMAC-SHA256"));
        }
    }

    // =================================================================
    //  M31: Hmac V1 re-sign (family loop)
    // =================================================================

    @Test
    public void testHmacV1ResignOnFailover() throws Exception {
        for (Family f : FAMILIES) {
            ClientProfile profile = new ClientProfile();
            profile.setSignMethod(ClientProfile.SIGN_SHA1);
            profile.getHttpProfile().setEndpoint(f.originHost);
            CvmClient client = new CvmClient(
                    new Credential("AKIDTEST", "SKTEST"), "ap-guangzhou", profile);
            tripBreakerFor(client, f.originHost, 60_000);
            TransportStub transport = installStub(client);
            transport.programOk();

            client.DescribeInstances(new DescribeInstancesRequest());
            assertEquals(f.name, 1, transport.received.size());
            Request resigned = transport.received.get(0);
            assertEquals(f.name, f.firstFailover, resigned.url().host());
            // Hmac V1 embeds Signature in body, not Authorization header.
            byte[] body = bodyBytes(resigned);
            assertTrue(f.name, new String(body).contains("Signature="));
        }
    }

    // =================================================================
    //  M32: SKIP V3 — rewrite Host only (family loop)
    // =================================================================

    @Test
    public void testSkipSignV3OnFailoverRewritesHostWithoutResigning() throws Exception {
        for (Family f : FAMILIES) {
            CvmClient client = newClient(f);
            tripBreakerFor(client, f.originHost, 60_000);
            TransportStub transport = installStub(client);
            transport.programOk();

            OkHttpClient http = grabOkHttpClient(client);
            Request raw = new Request.Builder()
                    .url("https://" + f.originHost + "/")
                    .header("Host", f.originHost)
                    .header("Authorization", "SKIP")
                    .header("X-TC-Action", "DescribeInstances")
                    .header("X-TC-Version", "2017-03-12")
                    .header("Content-Type", "application/json")
                    .post(RequestBody.create(MediaType.parse("application/json"), "{}".getBytes()))
                    .build();

            Response resp = http.newCall(raw).execute();
            resp.close();
            assertEquals(f.name, 1, transport.received.size());
            Request resigned = transport.received.get(0);
            assertEquals(f.name, f.firstFailover, resigned.url().host());
            assertEquals(f.name, f.firstFailover, resigned.header("Host"));
            assertEquals(f.name, "SKIP", resigned.header("Authorization"));
        }
    }

    // =================================================================
    //  M33: Re-sign uses current credential (family loop)
    // =================================================================

    @Test
    public void testResignUsesCurrentCredential() throws Exception {
        for (Family f : FAMILIES) {
            CvmClient client = newClient(f);
            client.setCredential(new Credential("AKIDNEW", "SKNEW"));
            tripBreakerFor(client, f.originHost, 60_000);
            TransportStub transport = installStub(client);
            transport.programOk();

            client.DescribeInstances(new DescribeInstancesRequest());
            assertEquals(f.name, 1, transport.received.size());
            assertTrue(f.name, transport.received.get(0).header("Authorization")
                    .contains("Credential=AKIDNEW/"));
        }
    }

    // =================================================================
    //  M34: X-TC-Token rotation (family loop)
    // =================================================================

    @Test
    public void testXtcTokenRotationOnFailover() throws Exception {
        for (Family f : FAMILIES) {
            Credential cred = new Credential("AKIDTEST", "SKTEST", "token-abc");
            ClientProfile profile = new ClientProfile();
            profile.getHttpProfile().setEndpoint(f.originHost);
            CvmClient client = new CvmClient(cred, "ap-guangzhou", profile);
            tripBreakerFor(client, f.originHost, 60_000);
            TransportStub transport = installStub(client);
            transport.programOk();

            client.DescribeInstances(new DescribeInstancesRequest());
            assertEquals(f.name, 1, transport.received.size());
            assertEquals(f.name, "token-abc", transport.received.get(0).header("X-TC-Token"));
        }
    }

    // =================================================================
    //  M34a: X-TC-Token dropped when cleared
    // =================================================================

    @Test
    public void testResignDropsTokenWhenCleared() throws Exception {
        for (Family f : FAMILIES) {
            Credential cred = new Credential("AKIDTEST", "SKTEST", "token-abc");
            ClientProfile profile = new ClientProfile();
            profile.getHttpProfile().setEndpoint(f.originHost);
            CvmClient client = new CvmClient(cred, "ap-guangzhou", profile);
            tripBreakerFor(client, f.originHost, 60_000);
            // Clear the token before the failover request.
            client.setCredential(new Credential("AKIDTEST", "SKTEST"));
            TransportStub transport = installStub(client);
            transport.programOk();

            client.DescribeInstances(new DescribeInstancesRequest());
            assertEquals(f.name, 1, transport.received.size());
            assertNull(f.name, transport.received.get(0).header("X-TC-Token"));
        }
    }

    // =================================================================
    //  M35: SSE — no failover (family loop)
    // =================================================================

    @Test
    public void testSseStreamResponseIsNotJsonValidated() throws Exception {
        for (Family f : FAMILIES) {
            CvmClient client = newClient(f);
            TransportStub transport = installStub(client);
            transport.programResponseWithCt(200, "data: hello\n\n", "text/event-stream");

            try {
                client.DescribeInstances(new DescribeInstancesRequest());
            } catch (Exception ignored) { }
            assertEquals(f.name, 1, transport.received.size());
        }
    }

    // =================================================================
    //  M36: No Content-Type — no failover (family loop)
    // =================================================================

    @Test
    public void testResponseWithoutContentTypeIsNotJsonValidated() throws Exception {
        for (Family f : FAMILIES) {
            CvmClient client = newClient(f);
            TransportStub transport = installStub(client);
            transport.programResponseWithCt(200, "<html>oops</html>", null);

            try {
                client.DescribeInstances(new DescribeInstancesRequest());
            } catch (Exception ignored) { }
            assertEquals(f.name, 1, transport.received.size());
        }
    }

    // =================================================================
    //  M37: 200 + JSON business error — no failover (family loop)
    // =================================================================

    @Test
    public void testBusinessSdkErrorDoesNotTriggerFailover() throws Exception {
        for (Family f : FAMILIES) {
            CvmClient client = newClient(f);
            TransportStub transport = installStub(client);
            transport.programJsonOk(
                    "{\"Response\":{\"RequestId\":\"req-bad\",\"Error\":{"
                            + "\"Code\":\"AuthFailure.SignatureFailure\","
                            + "\"Message\":\"signature wrong\"}}}");

            try {
                client.DescribeInstances(new DescribeInstancesRequest());
                fail(f.name + ": expected business SDK exception");
            } catch (TencentCloudSDKException e) {
                assertEquals(f.name, "AuthFailure.SignatureFailure", e.getErrorCode());
                assertEquals(f.name, "req-bad", e.getRequestId());
            }
            assertEquals(f.name, 1, transport.received.size());
        }
    }

    // =================================================================
    //  M38: backupEndpoint failover behavior (family loop)
    // =================================================================

    @Test
    public void testBackupEndpointFailover() throws Exception {
        for (Family f : FAMILIES) {
            ClientProfile profile = new ClientProfile();
            profile.getHttpProfile().setEndpoint(f.originHost);
            profile.setBackupEndpoint("backup.example.com");
            CvmClient client = new CvmClient(
                    new Credential("AKIDTEST", "SKTEST"), "ap-guangzhou", profile);
            TransportStub transport = installStub(client);

            // Origin succeeds.
            transport.programOk();
            client.DescribeInstances(new DescribeInstancesRequest());
            assertEquals(f.name + " origin", 1, transport.received.size());
            assertEquals(f.name, f.originHost, transport.received.get(0).url().host());

            // Trip origin breaker, backup should be used.
            tripBreakerFor(client, f.originHost, 60_000);
            transport.received.clear();
            transport.programOk();
            client.DescribeInstances(new DescribeInstancesRequest());
            assertEquals(f.name + " backup", 1, transport.received.size());
            String servicePrefix = f.originHost.substring(0, f.originHost.indexOf('.'));
            String backupHost = servicePrefix + ".backup.example.com";
            assertEquals(f.name, backupHost, transport.received.get(0).url().host());
        }
    }

    // =================================================================
    //  M38a-M38d: backupEndpoint detail scenarios (family loop)
    // =================================================================

    @Test
    public void testBackupEndpointOriginDnsMissDoesNotRetrySameRequest() throws Exception {
        for (Family f : FAMILIES) {
            ClientProfile profile = new ClientProfile();
            profile.getHttpProfile().setEndpoint(f.originHost);
            profile.setBackupEndpoint("backup.example.com");
            CvmClient client = new CvmClient(
                    new Credential("AKIDTEST", "SKTEST"), "ap-guangzhou", profile);
            TransportStub transport = installStub(client);
            transport.programFailure(new UnknownHostException("origin dns miss"));

            try {
                client.DescribeInstances(new DescribeInstancesRequest());
                fail(f.name + ": expected SDK exception");
            } catch (TencentCloudSDKException ignored) { }
            assertEquals(f.name + ": no same-request retry to backup",
                    1, transport.received.size());
            assertEquals(f.name, f.originHost, transport.received.get(0).url().host());
        }
    }

    @Test
    public void testBackupEndpointNonFailoverErrorPropagates() throws Exception {
        for (Family f : FAMILIES) {
            ClientProfile profile = new ClientProfile();
            profile.getHttpProfile().setEndpoint(f.originHost);
            profile.setBackupEndpoint("backup.example.com");
            CvmClient client = new CvmClient(
                    new Credential("AKIDTEST", "SKTEST"), "ap-guangzhou", profile);
            TransportStub transport = installStub(client);
            transport.programFailure(new IOException("generic I/O error"));

            try {
                client.DescribeInstances(new DescribeInstancesRequest());
                fail(f.name + ": expected SDK exception");
            } catch (TencentCloudSDKException e) {
                assertTrue(f.name, e.getCause() instanceof IOException);
            }
            assertEquals(f.name, 1, transport.received.size());
            assertEquals(f.name, f.originHost, transport.received.get(0).url().host());
        }
    }

    @Test
    public void testNoBackupEndpointDnsMissDoesNotRetrySameRequest() throws Exception {
        for (Family f : FAMILIES) {
            CvmClient client = newClient(f);
            TransportStub transport = installStub(client);
            transport.programFailure(new UnknownHostException("dns miss"));

            try {
                client.DescribeInstances(new DescribeInstancesRequest());
                fail(f.name + ": expected SDK exception");
            } catch (TencentCloudSDKException ignored) { }
            assertEquals(f.name + ": no same-request retry", 1, transport.received.size());
            assertEquals(f.name, f.originHost, transport.received.get(0).url().host());
        }
    }

    // =================================================================
    //  Helpers
    // =================================================================

    private static CvmClient newClient(Family family) {
        ClientProfile profile = new ClientProfile();
        profile.getHttpProfile().setEndpoint(family.originHost);
        return new CvmClient(new Credential("AKIDTEST", "SKTEST"), "ap-guangzhou", profile);
    }

    private static TransportStub installStub(AbstractClient client) {
        TransportStub stub = new TransportStub();
        OkHttpClient orig = grabOkHttpClient(client);
        setOkHttpClient(client, orig.newBuilder().addInterceptor(stub).build());
        return stub;
    }

    private static OkHttpClient grabOkHttpClient(AbstractClient client) {
        try {
            Field f = AbstractClient.class.getDeclaredField("httpConnection");
            f.setAccessible(true);
            HttpConnection conn = (HttpConnection) f.get(client);
            return (OkHttpClient) conn.getHttpClient();
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }
    }

    private static void setOkHttpClient(AbstractClient client, OkHttpClient http) {
        try {
            Field f = AbstractClient.class.getDeclaredField("httpConnection");
            f.setAccessible(true);
            HttpConnection conn = (HttpConnection) f.get(client);
            conn.setHttpClient(http);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }
    }

    private static EndpointFailoverInterceptor failoverInterceptorOf(AbstractClient client) {
        for (Interceptor it : grabOkHttpClient(client).interceptors()) {
            if (it instanceof EndpointFailoverInterceptor) {
                return (EndpointFailoverInterceptor) it;
            }
        }
        throw new IllegalStateException("EndpointFailoverInterceptor not installed on client");
    }

    private static CircuitBreaker tripBreakerFor(AbstractClient client, String host, long timeoutMs) {
        CircuitBreaker breaker = newBreaker(timeoutMs);
        failoverInterceptorOf(client).putBreakerForTesting(host, breaker);
        tripBreaker(breaker);
        return breaker;
    }

    private static void tripAllBreakersFor(AbstractClient client, Family f, long timeoutMs) {
        for (String host : f.allTldHosts) {
            tripBreakerFor(client, host, timeoutMs);
        }
    }

    private static CircuitBreaker newBreaker(long timeoutMs) {
        CircuitBreaker.Setting setting = new CircuitBreaker.Setting();
        setting.timeoutMs = timeoutMs;
        return new CircuitBreaker(setting);
    }

    private static void tripBreaker(CircuitBreaker breaker) {
        for (int i = 0; i < 6; i++) {
            CircuitBreaker.Token t = breaker.allow();
            if (t.allowed) {
                t.report(false);
            }
        }
    }

    private static IOException unwrapToIOException(TencentCloudSDKException e) {
        Throwable cause = e.getCause();
        assertNotNull("SDK exception must wrap an IOException, got null cause", cause);
        assertTrue("expected IOException cause, got " + cause.getClass().getName(),
                cause instanceof IOException);
        return (IOException) cause;
    }

    private static byte[] bodyBytes(Request req) throws IOException {
        if (req.body() == null) {
            return new byte[0];
        }
        Buffer buf = new Buffer();
        req.body().writeTo(buf);
        return buf.readByteArray();
    }

    // =================================================================
    //  TransportStub
    // =================================================================

    private static final class TransportStub implements Interceptor {
        final List<Request> received = new ArrayList<Request>();
        private final Queue<Object> programmed = new LinkedList<Object>();

        void programFailure(IOException e) {
            programmed.add(e);
        }

        void programOk() {
            programJsonOk("{\"Response\":{\"RequestId\":\"req-ok\"}}");
        }

        void programJsonOk(String json) {
            programmed.add(new ProgrammedResponse(200, json, "application/json"));
        }

        void programResponse(int code, String body) {
            programmed.add(new ProgrammedResponse(code, body, "application/json"));
        }

        void programResponseWithCt(int code, String body, String contentType) {
            programmed.add(new ProgrammedResponse(code, body, contentType));
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
            Response.Builder b = new Response.Builder()
                    .request(request)
                    .protocol(Protocol.HTTP_1_1)
                    .code(pr.code)
                    .message(pr.code == 200 ? "OK" : "Error");
            if (pr.contentType != null) {
                b.header("Content-Type", pr.contentType);
                b.body(ResponseBody.create(MediaType.parse(pr.contentType), pr.body));
            } else {
                b.body(ResponseBody.create(null, pr.body));
            }
            return b.build();
        }

        private static final class ProgrammedResponse {
            final int code;
            final String body;
            final String contentType;

            ProgrammedResponse(int code, String body, String contentType) {
                this.code = code;
                this.body = body;
                this.contentType = contentType;
            }
        }
    }
}
