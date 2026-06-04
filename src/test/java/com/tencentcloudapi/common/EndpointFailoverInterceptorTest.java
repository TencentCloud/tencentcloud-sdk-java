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
import okhttp3.Response;
import okhttp3.ResponseBody;
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

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Tests for {@link EndpointFailoverInterceptor}.
 *
 * <p>All behavior tests drive a real {@link CvmClient} with the standard
 * profile/credential flow exactly the way users construct one — so the
 * full pipeline (sign → log interceptor → failover interceptor → HTTP)
 * runs end-to-end. Network is short-circuited by injecting a
 * {@link TransportStub} interceptor at the tail of the OkHttpClient inside
 * {@link HttpConnection}; the stub plays back scripted DNS misses, TLS
 * failures, timeouts, and JSON success bodies per attempt.
 *
 * <p>The pure-helper tests at the top exercise package-private static
 * methods directly — no client / no pipeline needed.
 */
public class EndpointFailoverInterceptorTest {

    // Each test constructs its own CvmClient — failover state is now per-client,
    // so no global reset is needed between tests.

    // =================================================================
    //  Pure helper tests
    // =================================================================

    @Test
    public void testIsKnownTencentCloudHost() {
        // Plain family
        assertTrue(EndpointFailoverInterceptor.isKnownTencentCloudHost("cvm.tencentcloudapi.com"));
        assertTrue(EndpointFailoverInterceptor.isKnownTencentCloudHost("cvm.tencentcloudapi.cn"));
        assertTrue(EndpointFailoverInterceptor.isKnownTencentCloudHost("cvm.tencentcloudapi.com.cn"));
        // Region-pinned hosts are still "known" (recognised), even though they
        // won't be eligible for TLD failover. eligibleForFailover is a separate concern.
        assertTrue(EndpointFailoverInterceptor.isKnownTencentCloudHost("cvm.ap-shanghai.tencentcloudapi.com"));
        // ai. family
        assertTrue(EndpointFailoverInterceptor.isKnownTencentCloudHost("hunyuan.ai.tencentcloudapi.com"));
        assertTrue(EndpointFailoverInterceptor.isKnownTencentCloudHost("hunyuan.ai.tencentcloudapi.com.cn"));
        assertTrue(EndpointFailoverInterceptor.isKnownTencentCloudHost("hunyuan.ai.ap-guangzhou.tencentcloudapi.com"));
        // internal. family
        assertTrue(EndpointFailoverInterceptor.isKnownTencentCloudHost("cvm.internal.tencentcloudapi.com"));
        assertTrue(EndpointFailoverInterceptor.isKnownTencentCloudHost("cvm.internal.ap-guangzhou.tencentcloudapi.com"));
        // Negatives
        assertFalse(EndpointFailoverInterceptor.isKnownTencentCloudHost("example.com"));
        assertFalse(EndpointFailoverInterceptor.isKnownTencentCloudHost("cvm.tencentcloudapi.woa.com"));
        assertFalse(EndpointFailoverInterceptor.isKnownTencentCloudHost("proxy.internal"));
        assertFalse(EndpointFailoverInterceptor.isKnownTencentCloudHost(null));
    }

    @Test
    public void testTldMatchOfClassifiesFamilyAndRegion() {
        // Plain family, no region
        EndpointFailoverInterceptor.TldMatch m = EndpointFailoverInterceptor.tldMatchOf("cvm.tencentcloudapi.com");
        assertNotNull(m);
        assertEquals(0, m.familyIdx);
        assertEquals(0, m.tldIdx);
        assertFalse(m.hasRegion);

        // Plain family, region-pinned
        m = EndpointFailoverInterceptor.tldMatchOf("cvm.ap-guangzhou.tencentcloudapi.com");
        assertNotNull(m);
        assertEquals(0, m.familyIdx);
        assertTrue(m.hasRegion);

        // ai family, no region
        m = EndpointFailoverInterceptor.tldMatchOf("hunyuan.ai.tencentcloudapi.cn");
        assertNotNull(m);
        assertEquals(1, m.familyIdx);
        assertEquals(1, m.tldIdx);
        assertFalse(m.hasRegion);

        // ai family, region-pinned
        m = EndpointFailoverInterceptor.tldMatchOf("hunyuan.ai.ap-guangzhou.tencentcloudapi.com");
        assertNotNull(m);
        assertEquals(1, m.familyIdx);
        assertTrue(m.hasRegion);

        // internal family
        m = EndpointFailoverInterceptor.tldMatchOf("cvm.internal.tencentcloudapi.com.cn");
        assertNotNull(m);
        assertEquals(2, m.familyIdx);
        assertEquals(2, m.tldIdx);
        assertFalse(m.hasRegion);

        // Unknown host
        assertNull(EndpointFailoverInterceptor.tldMatchOf("example.com"));
    }

    // =================================================================
    //  Behavior tests via real CvmClient + injected transport stub
    // =================================================================

    // ---- Pass-through paths ----

    @Test
    public void testPassThroughForUnknownHost() throws Exception {
        // Override endpoint to a non-Tencent host — interceptor must be inert.
        ClientProfile profile = new ClientProfile();
        profile.getHttpProfile().setEndpoint("example.com");
        CvmClient client = newCvm(profile);
        TransportStub transport = installStub(client);
        transport.programOk();

        client.DescribeInstances(new DescribeInstancesRequest());
        assertEquals(1, transport.received.size());
        assertEquals("example.com", transport.received.get(0).url().host());
    }

    @Test
    public void testNonTencentHostWithoutBackupDoesNotFailOver() throws Exception {
        // Proxy / private domain + no backupEndpoint → propagate, no retry.
        ClientProfile profile = new ClientProfile();
        profile.getHttpProfile().setEndpoint("proxy.example.com");
        CvmClient client = newCvm(profile);
        TransportStub transport = installStub(client);
        transport.programFailure(new UnknownHostException("dns miss"));

        try {
            client.DescribeInstances(new DescribeInstancesRequest());
            fail("expected UnknownHostException to propagate");
        } catch (TencentCloudSDKException ignored) { }
        assertEquals(1, transport.received.size());
    }

    @Test
    public void testNonTencentHostWithBackupFailsOverToBackup() throws Exception {
        // Proxy / private domain + backupEndpoint → backup must be tried.
        ClientProfile profile = new ClientProfile();
        profile.getHttpProfile().setEndpoint("proxy.example.com");
        profile.setBackupEndpoint("ap-guangzhou.tencentcloudapi.com");
        CvmClient client = newCvm(profile);
        TransportStub transport = installStub(client);
        transport.programFailure(new UnknownHostException("dns miss"));
        transport.programOk();

        client.DescribeInstances(new DescribeInstancesRequest());

        assertEquals(2, transport.received.size());
        assertEquals("proxy.example.com", transport.received.get(0).url().host());
        assertEquals("proxy.ap-guangzhou.tencentcloudapi.com",
                transport.received.get(1).url().host());
    }

    @Test
    public void testFailoverFromComEndpoint() throws Exception {
        // Cyclic rotation from .com (idx 0): [.com, .cn, .com.cn].
        // Drive all three candidates to failure so we exercise the full order,
        // then assert the SDK still surfaces the last error.
        CvmClient client = newCvm();
        TransportStub transport = installStub(client);
        transport.programFailure(new UnknownHostException("com fail"));
        transport.programFailure(new UnknownHostException("cn fail"));
        transport.programFailure(new UnknownHostException("com.cn fail"));

        try {
            client.DescribeInstances(new DescribeInstancesRequest());
            fail("expected SDK exception when every candidate fails");
        } catch (TencentCloudSDKException ignored) { }

        assertEquals(3, transport.received.size());
        assertEquals("cvm.tencentcloudapi.com",    transport.received.get(0).url().host());
        assertEquals("cvm.tencentcloudapi.cn",     transport.received.get(1).url().host());
        assertEquals("cvm.tencentcloudapi.com.cn", transport.received.get(2).url().host());

        // Sanity: each candidate was re-signed for its own host.
        assertEquals("cvm.tencentcloudapi.cn",     transport.received.get(1).header("Host"));
        assertEquals("cvm.tencentcloudapi.com.cn", transport.received.get(2).header("Host"));
        assertNotEquals(
                transport.received.get(0).header("Authorization"),
                transport.received.get(1).header("Authorization"));
        assertNotEquals(
                transport.received.get(1).header("Authorization"),
                transport.received.get(2).header("Authorization"));
    }

    @Test
    public void testFailoverFromCnEndpoint() throws Exception {
        // Cyclic rotation from .cn (idx 1): [.cn, .com.cn, .com].
        ClientProfile profile = new ClientProfile();
        profile.getHttpProfile().setEndpoint("cvm.tencentcloudapi.cn");
        CvmClient client = newCvm(profile);
        TransportStub transport = installStub(client);
        transport.programFailure(new UnknownHostException("cn fail"));
        transport.programFailure(new UnknownHostException("com.cn fail"));
        transport.programFailure(new UnknownHostException("com fail"));

        try {
            client.DescribeInstances(new DescribeInstancesRequest());
            fail("expected SDK exception when every candidate fails");
        } catch (TencentCloudSDKException ignored) { }

        assertEquals(3, transport.received.size());
        assertEquals("cvm.tencentcloudapi.cn",     transport.received.get(0).url().host());
        assertEquals("cvm.tencentcloudapi.com.cn", transport.received.get(1).url().host());
        assertEquals("cvm.tencentcloudapi.com",    transport.received.get(2).url().host());
    }

    @Test
    public void testFailoverFromComCnEndpoint() throws Exception {
        // Cyclic rotation from .com.cn (idx 2): [.com.cn, .com, .cn].
        ClientProfile profile = new ClientProfile();
        profile.getHttpProfile().setEndpoint("cvm.tencentcloudapi.com.cn");
        CvmClient client = newCvm(profile);
        TransportStub transport = installStub(client);
        transport.programFailure(new UnknownHostException("com.cn fail"));
        transport.programFailure(new UnknownHostException("com fail"));
        transport.programFailure(new UnknownHostException("cn fail"));

        try {
            client.DescribeInstances(new DescribeInstancesRequest());
            fail("expected SDK exception when every candidate fails");
        } catch (TencentCloudSDKException ignored) { }

        assertEquals(3, transport.received.size());
        assertEquals("cvm.tencentcloudapi.com.cn", transport.received.get(0).url().host());
        assertEquals("cvm.tencentcloudapi.com",    transport.received.get(1).url().host());
        assertEquals("cvm.tencentcloudapi.cn",     transport.received.get(2).url().host());
    }

    @Test
    public void testRegionPinnedHostIsNotEligibleForTldFailover() throws Exception {
        // A region-pinned host (ap-guangzhou label between service and TLD)
        // targets a specific region deliberately. We must NOT silently fail it
        // over to another TLD, which would change the resolved region.
        ClientProfile profile = new ClientProfile();
        profile.getHttpProfile().setEndpoint("cvm.ap-guangzhou.tencentcloudapi.com");
        CvmClient client = newCvm(profile);
        TransportStub transport = installStub(client);
        // Only one programmed outcome — if the interceptor mistakenly retried,
        // the stub would throw "no programmed outcome left".
        transport.programFailure(new UnknownHostException("dns miss"));

        try {
            client.DescribeInstances(new DescribeInstancesRequest());
            fail("expected the original UnknownHostException to propagate");
        } catch (TencentCloudSDKException e) {
            // expected — the original failure surfaces directly with no retry.
        }
        assertEquals(1, transport.received.size());
        assertEquals("cvm.ap-guangzhou.tencentcloudapi.com",
                transport.received.get(0).url().host());
    }

    @Test
    public void testKnownDomainFailsOverEvenWhenFailoverDisabledAtRuntime() throws Exception {
        // setDomainFailover(false) AFTER ctor — the interceptor was already
        // installed at ctor time, so flipping the flag later cannot remove it.
        // Documents the actual (slightly surprising) behavior.
        CvmClient client = newCvm();
        client.getClientProfile().getHttpProfile().setDomainFailover(false);
        TransportStub transport = installStub(client);
        transport.programFailure(new UnknownHostException("dns miss"));
        transport.programOk();

        client.DescribeInstances(new DescribeInstancesRequest());
        assertEquals(2, transport.received.size());
    }

    // ---- TLD-family rotation: ai / internal stay within their family ----

    @Test
    public void testFailoverWithinAiFamily() throws Exception {
        ClientProfile profile = new ClientProfile();
        profile.getHttpProfile().setEndpoint("hunyuan.ai.tencentcloudapi.com");
        CvmClient client = newCvm(profile);
        TransportStub transport = installStub(client);
        transport.programFailure(new UnknownHostException("dns miss"));
        transport.programOk();

        client.DescribeInstances(new DescribeInstancesRequest());

        assertEquals(2, transport.received.size());
        assertEquals("hunyuan.ai.tencentcloudapi.com", transport.received.get(0).url().host());
        // Must rotate within the ai. family — NOT to plain hunyuan.tencentcloudapi.cn.
        assertEquals("hunyuan.ai.tencentcloudapi.cn", transport.received.get(1).url().host());
    }

    @Test
    public void testFailoverWithinInternalFamily() throws Exception {
        ClientProfile profile = new ClientProfile();
        profile.getHttpProfile().setEndpoint("cvm.internal.tencentcloudapi.com");
        CvmClient client = newCvm(profile);
        TransportStub transport = installStub(client);
        transport.programFailure(new UnknownHostException("dns miss"));
        transport.programOk();

        client.DescribeInstances(new DescribeInstancesRequest());

        assertEquals(2, transport.received.size());
        assertEquals("cvm.internal.tencentcloudapi.com", transport.received.get(0).url().host());
        // Stays within internal. family.
        assertEquals("cvm.internal.tencentcloudapi.cn", transport.received.get(1).url().host());
    }

    @Test
    public void testRegionPinnedAiHostIsNotEligibleForTldFailover() throws Exception {
        ClientProfile profile = new ClientProfile();
        profile.getHttpProfile().setEndpoint("hunyuan.ai.ap-guangzhou.tencentcloudapi.com");
        CvmClient client = newCvm(profile);
        TransportStub transport = installStub(client);
        transport.programFailure(new UnknownHostException("dns miss"));

        try {
            client.DescribeInstances(new DescribeInstancesRequest());
            fail("expected the original UnknownHostException to propagate");
        } catch (TencentCloudSDKException ignored) { }
        assertEquals(1, transport.received.size());
    }

    @Test
    public void testRegionPinnedHostStillFailsOverWhenBackupEndpointSet() throws Exception {
        // backupEndpoint is an explicit user opt-in, so it overrides the
        // "region-pinned hosts skip failover" rule.
        ClientProfile profile = new ClientProfile();
        profile.getHttpProfile().setEndpoint("cvm.ap-guangzhou.tencentcloudapi.com");
        profile.setBackupEndpoint("ap-shanghai.tencentcloudapi.com");
        CvmClient client = newCvm(profile);
        TransportStub transport = installStub(client);
        transport.programFailure(new UnknownHostException("dns miss"));
        transport.programOk();

        client.DescribeInstances(new DescribeInstancesRequest());

        assertEquals(2, transport.received.size());
        assertEquals("cvm.ap-guangzhou.tencentcloudapi.com",
                transport.received.get(0).url().host());
        assertEquals("cvm.ap-shanghai.tencentcloudapi.com",
                transport.received.get(1).url().host());
    }

    // ---- shouldFailover branch coverage ----

    @Test
    public void testFailoverOnSslHandshakeException() throws Exception {
        runSingleFailureScenario(new SSLHandshakeException("tls handshake failed"));
    }

    @Test
    public void testFailoverOnSslPeerUnverifiedException() throws Exception {
        runSingleFailureScenario(new SSLPeerUnverifiedException("cert mismatch"));
    }

    @Test
    public void testFailoverOnConnectException() throws Exception {
        runSingleFailureScenario(new ConnectException("connection refused"));
    }

    @Test
    public void testFailoverOnNoRouteToHostException() throws Exception {
        runSingleFailureScenario(new NoRouteToHostException("no route"));
    }

    @Test
    public void testFailoverOnSocketTimeoutException() throws Exception {
        runSingleFailureScenario(new SocketTimeoutException("read timed out"));
    }

    private void runSingleFailureScenario(IOException firstFailure) throws Exception {
        CvmClient client = newCvm();
        TransportStub transport = installStub(client);
        transport.programFailure(firstFailure);
        transport.programOk();

        client.DescribeInstances(new DescribeInstancesRequest());
        assertEquals(2, transport.received.size());
        assertEquals("cvm.tencentcloudapi.com", transport.received.get(0).url().host());
        assertEquals("cvm.tencentcloudapi.cn", transport.received.get(1).url().host());
    }

    // ---- Non-failover IOException must propagate without retry ----

    @Test
    public void testGenericIOExceptionPropagatesWithoutFailover() throws Exception {
        CvmClient client = newCvm();
        TransportStub transport = installStub(client);
        transport.programFailure(new IOException("some unrelated I/O error"));

        try {
            client.DescribeInstances(new DescribeInstancesRequest());
            fail("expected SDK exception");
        } catch (TencentCloudSDKException e) {
            // SDK wraps the IOException as cause.
            Throwable cause = unwrapToIOException(e);
            assertEquals("some unrelated I/O error", cause.getMessage());
        }
        assertEquals("must not retry on non-failover IOException", 1, transport.received.size());
    }

    // ---- HTTP body / status reaches caller intact after failover ----

    @Test
    public void testApiResponseDeliveredAfterFailover() throws Exception {
        CvmClient client = newCvm();
        TransportStub transport = installStub(client);
        transport.programFailure(new UnknownHostException("dns miss"));
        transport.programJsonOk("{\"Response\":{\"TotalCount\":42,\"InstanceSet\":[],\"RequestId\":\"req-xyz\"}}");

        DescribeInstancesResponse resp = client.DescribeInstances(new DescribeInstancesRequest());
        assertEquals(Long.valueOf(42), resp.getTotalCount());
        assertEquals("req-xyz", resp.getRequestId());
    }

    // ---- protocol-level failover: non-200 / non-JSON body ----

    @Test
    public void testNon200ResponseTriggersFailover() throws Exception {
        // A 503 from .com is a protocol-level signal that the host is unhealthy.
        // The interceptor must close that response and fall over to .cn.
        CvmClient client = newCvm();
        TransportStub transport = installStub(client);
        transport.programResponse(503, "{\"Response\":{\"Error\":{}}}");
        transport.programOk();

        client.DescribeInstances(new DescribeInstancesRequest());

        assertEquals(2, transport.received.size());
        assertEquals("cvm.tencentcloudapi.com", transport.received.get(0).url().host());
        assertEquals("cvm.tencentcloudapi.cn", transport.received.get(1).url().host());
    }

    @Test
    public void testAllNon200ResponsesAggregateFailure() throws Exception {
        CvmClient client = newCvm();
        TransportStub transport = installStub(client);
        transport.programResponse(502, "{}");
        transport.programResponse(503, "{}");
        transport.programResponse(504, "{}");

        try {
            client.DescribeInstances(new DescribeInstancesRequest());
            fail("expected aggregated failure");
        } catch (TencentCloudSDKException e) {
            // The SDK wraps the IOException with an empty message; inspect the
            // cause chain for the per-host failure descriptions.
            String causeMsg = e.getCause() == null ? "" : e.getCause().getMessage();
            assertTrue("primary cause should mention HTTP 504, got: " + causeMsg,
                    causeMsg.contains("504"));
        }
        assertEquals(3, transport.received.size());
    }

    @Test
    public void test4xxResponseTriggersFailover() throws Exception {
        // Per spec, ANY non-200 triggers failover — even 4xx. Cost: a malformed
        // request gets retried 3× before surfacing. Documented trade-off.
        CvmClient client = newCvm();
        TransportStub transport = installStub(client);
        transport.programResponse(403, "{\"Response\":{\"Error\":{}}}");
        transport.programOk();

        client.DescribeInstances(new DescribeInstancesRequest());
        assertEquals(2, transport.received.size());
    }

    @Test
    public void testInvalidJsonBodyTriggersFailover() throws Exception {
        // 200 OK but body is not parseable JSON (e.g. transparent proxy
        // returning an HTML block page) → treat as host failure.
        CvmClient client = newCvm();
        TransportStub transport = installStub(client);
        transport.programJsonOk("<html>blocked</html>");
        transport.programOk();

        client.DescribeInstances(new DescribeInstancesRequest());
        assertEquals(2, transport.received.size());
    }

    @Test
    public void testValidJsonBodyDoesNotTriggerFailover() throws Exception {
        // Sanity: ordinary 200 + valid JSON path is the happy path; only one
        // request is sent.
        CvmClient client = newCvm();
        TransportStub transport = installStub(client);
        transport.programOk();

        client.DescribeInstances(new DescribeInstancesRequest());
        assertEquals(1, transport.received.size());
    }

    // ---- TC3 resign preserves body / content-type / signing scope ----

    @Test
    public void testTC3ResignPreservesBodyAndContentType() throws Exception {
        CvmClient client = newCvm();
        TransportStub transport = installStub(client);
        transport.programFailure(new UnknownHostException("dns miss"));
        transport.programOk();

        DescribeInstancesRequest req = new DescribeInstancesRequest();
        req.setLimit(10L);
        req.setOffset(0L);
        req.setInstanceIds(new String[]{"ins-aaa", "ins-bbb"});
        client.DescribeInstances(req);

        Request first = transport.received.get(0);
        Request resigned = transport.received.get(1);

        // Same body bytes round-trip through resign.
        assertArrayEquals(bodyBytes(first), bodyBytes(resigned));
        assertEquals(first.header("Content-Type"), resigned.header("Content-Type"));

        // Authorization rebound for new host scope.
        assertNotEquals(first.header("Authorization"), resigned.header("Authorization"));
        assertTrue(resigned.header("Authorization").startsWith("TC3-HMAC-SHA256 "));
        assertTrue(resigned.header("Authorization").contains("/cvm/tc3_request"));
    }

    // ---- X-TC-Token rotation visible to resigned request ----

    @Test
    public void testResignReflectsRotatedToken() throws Exception {
        CvmClient client = newCvm();
        client.setCredential(new Credential("AKIDTEST", "SKTEST", "tok-v1"));
        TransportStub transport = installStub(client);
        transport.programFailure(new UnknownHostException("dns miss"));
        transport.programOk();

        // Mid-flight credential rotation: hook a one-shot interceptor that
        // swaps the token after the first request goes out, before the
        // failover interceptor resigns for the backup TLD.
        AtomicTokenSwapper swapper = new AtomicTokenSwapper(client, "tok-v2");
        installInterceptorBefore(client, swapper);

        client.DescribeInstances(new DescribeInstancesRequest());
        assertEquals("tok-v1", transport.received.get(0).header("X-TC-Token"));
        assertEquals("tok-v2", transport.received.get(1).header("X-TC-Token"));
    }

    @Test
    public void testResignDropsTokenWhenCleared() throws Exception {
        CvmClient client = newCvm();
        client.setCredential(new Credential("AKIDTEST", "SKTEST", "tok-v1"));
        TransportStub transport = installStub(client);
        transport.programFailure(new UnknownHostException("dns miss"));
        transport.programOk();

        // Rotate creds to one without a token between attempts.
        AtomicTokenSwapper clearer = new AtomicTokenSwapper(client, null);
        installInterceptorBefore(client, clearer);

        client.DescribeInstances(new DescribeInstancesRequest());
        assertEquals("tok-v1", transport.received.get(0).header("X-TC-Token"));
        assertNull("token must be removed on resign when credential drops it",
                transport.received.get(1).header("X-TC-Token"));
    }

    // ---- Hmac (V1) resign preserves all params; signature rebuilt for new host ----

    @Test
    public void testHmacResignPreservesQueryParams() throws Exception {
        ClientProfile profile = new ClientProfile();
        profile.setSignMethod(ClientProfile.SIGN_SHA256);
        profile.getHttpProfile().setReqMethod(HttpProfile.REQ_GET);
        CvmClient client = newCvm(profile);
        TransportStub transport = installStub(client);
        transport.programFailure(new UnknownHostException("dns miss"));
        transport.programOk();

        client.DescribeInstances(new DescribeInstancesRequest());

        Request resigned = transport.received.get(1);
        assertEquals("cvm.tencentcloudapi.cn", resigned.url().host());
        assertEquals("DescribeInstances", resigned.url().queryParameter("Action"));
        assertEquals("2017-03-12", resigned.url().queryParameter("Version"));
        assertEquals("ap-guangzhou", resigned.url().queryParameter("Region"));
        assertEquals("AKIDTEST", resigned.url().queryParameter("SecretId"));
        assertEquals("HmacSHA256", resigned.url().queryParameter("SignatureMethod"));
        // Signature replaced, not appended.
        List<String> sigs = resigned.url().queryParameterValues("Signature");
        assertEquals("must have exactly one Signature param", 1, sigs.size());
        assertNotEquals(transport.received.get(0).url().queryParameter("Signature"),
                resigned.url().queryParameter("Signature"));
    }

    // ---- Aggregation: every TLD failure surfaces in a single exception ----

    @Test
    public void testAllBackupTldsFailAggregatesEveryAttemptFailure() throws Exception {
        CvmClient client = newCvm();
        TransportStub transport = installStub(client);
        transport.programFailure(new UnknownHostException("first dns miss"));
        transport.programFailure(new UnknownHostException("second dns miss"));
        transport.programFailure(new UnknownHostException("third dns miss"));

        TencentCloudSDKException sdkEx = null;
        try {
            client.DescribeInstances(new DescribeInstancesRequest());
            fail("expected SDK exception");
        } catch (TencentCloudSDKException e) {
            sdkEx = e;
        }

        IOException primary = unwrapToIOException(sdkEx);
        assertTrue(primary.getMessage().contains("cvm.tencentcloudapi.com.cn"));
        assertTrue(primary.getMessage().contains("third dns miss"));
        assertTrue(primary.getCause() instanceof UnknownHostException);
        assertEquals("third dns miss", primary.getCause().getMessage());

        Throwable[] suppressed = primary.getSuppressed();
        assertEquals(2, suppressed.length);
        assertTrue(suppressed[0].getMessage().contains("cvm.tencentcloudapi.com"));
        assertTrue(suppressed[0].getCause() instanceof UnknownHostException);
        assertEquals("first dns miss", suppressed[0].getCause().getMessage());
        assertTrue(suppressed[1].getMessage().contains("cvm.tencentcloudapi.cn"));
        assertTrue(suppressed[1].getCause() instanceof UnknownHostException);
        assertEquals("second dns miss", suppressed[1].getCause().getMessage());

        assertEquals(3, transport.received.size());
    }

    @Test
    public void testAggregatedFailurePreservesPerAttemptCauseTypes() throws Exception {
        CvmClient client = newCvm();
        TransportStub transport = installStub(client);
        transport.programFailure(new UnknownHostException("dns miss .com"));
        transport.programFailure(new SSLHandshakeException("tls fail .cn"));
        transport.programFailure(new ConnectException("connect fail .com.cn"));

        TencentCloudSDKException sdkEx = null;
        try {
            client.DescribeInstances(new DescribeInstancesRequest());
            fail("expected SDK exception");
        } catch (TencentCloudSDKException e) {
            sdkEx = e;
        }

        IOException primary = unwrapToIOException(sdkEx);
        assertTrue(primary.getCause() instanceof ConnectException);
        Throwable[] suppressed = primary.getSuppressed();
        assertEquals(2, suppressed.length);
        assertTrue(suppressed[0].getCause() instanceof UnknownHostException);
        assertTrue(suppressed[1].getCause() instanceof SSLHandshakeException);
    }

    @Test
    public void testAggregatedFailureMixesBreakerSkipsWithRealFailures() throws Exception {
        // Pre-open .com breaker, then drive a request where .cn and .com.cn
        // both fail at transport. .com is short-circuited (placeholder, no
        // cause); the other two contribute real cause chains.
        CvmClient client = newCvm();
        EndpointFailoverInterceptor.FailoverState state =
                new EndpointFailoverInterceptor.FailoverState(60_000);
        failoverInterceptorOf(client).putStateForTesting("cvm.tencentcloudapi.com", state);
        tripBreaker(state.breakerFor("cvm.tencentcloudapi.com"));  // .com Open

        TransportStub transport = installStub(client);
        // candidates() with currentIndex=-1 (.com origin still preferred but
        // breaker open) → order: .com (skipped), .cn, .com.cn.
        transport.programFailure(new SSLHandshakeException("cn tls fail"));
        transport.programFailure(new ConnectException("com.cn connect fail"));

        TencentCloudSDKException sdkEx = null;
        try {
            client.DescribeInstances(new DescribeInstancesRequest());
            fail("expected SDK exception");
        } catch (TencentCloudSDKException e) {
            sdkEx = e;
        }

        // .com never reached transport.
        assertEquals(2, transport.received.size());
        assertEquals("cvm.tencentcloudapi.cn", transport.received.get(0).url().host());
        assertEquals("cvm.tencentcloudapi.com.cn", transport.received.get(1).url().host());

        IOException primary = unwrapToIOException(sdkEx);
        // Last attempt = ConnectException on .com.cn.
        assertTrue(primary.getCause() instanceof ConnectException);

        // Suppressed[0] = .com breaker placeholder; Suppressed[1] = .cn TLS failure.
        Throwable[] suppressed = primary.getSuppressed();
        assertEquals(2, suppressed.length);
        assertTrue(suppressed[0].getMessage().contains("cvm.tencentcloudapi.com"));
        assertTrue(suppressed[0].getMessage().contains("circuit breaker open"));
        assertNull("breaker-skip placeholder has no cause", suppressed[0].getCause());
        assertTrue(suppressed[1].getCause() instanceof SSLHandshakeException);
    }

    @Test
    public void testAggregatedFailureWhenPrimaryIsBreakerSkip() throws Exception {
        // Pre-open .cn and .com.cn — only .com reaches transport. Suppressed
        // and primary both contain the breaker-skip placeholders.
        CvmClient client = newCvm();
        EndpointFailoverInterceptor.FailoverState state =
                new EndpointFailoverInterceptor.FailoverState(60_000);
        failoverInterceptorOf(client).putStateForTesting("cvm.tencentcloudapi.com", state);
        tripBreaker(state.breakerFor("cvm.tencentcloudapi.cn"));
        tripBreaker(state.breakerFor("cvm.tencentcloudapi.com.cn"));

        TransportStub transport = installStub(client);
        transport.programFailure(new UnknownHostException("com dns fail"));

        TencentCloudSDKException sdkEx = null;
        try {
            client.DescribeInstances(new DescribeInstancesRequest());
            fail("expected SDK exception");
        } catch (TencentCloudSDKException e) {
            sdkEx = e;
        }

        assertEquals(1, transport.received.size());
        assertEquals("cvm.tencentcloudapi.com", transport.received.get(0).url().host());

        IOException primary = unwrapToIOException(sdkEx);
        // Last attempt = .com.cn breaker skip → no cause.
        assertNull(primary.getCause());
        assertTrue(primary.getMessage().contains("cvm.tencentcloudapi.com.cn"));
        assertTrue(primary.getMessage().contains("circuit breaker open"));

        Throwable[] suppressed = primary.getSuppressed();
        assertEquals(2, suppressed.length);
        assertTrue(suppressed[0].getCause() instanceof UnknownHostException);
        assertEquals("com dns fail", suppressed[0].getCause().getMessage());
        assertNull(suppressed[1].getCause());
        assertTrue(suppressed[1].getMessage().contains("cvm.tencentcloudapi.cn"));
    }

    @Test
    public void testFailoverDoesNotPolluteNextRequestAttemptFailures() throws Exception {
        CvmClient client = newCvm();
        TransportStub transport = installStub(client);

        // Run 1: 1 fail + 1 success.
        transport.programFailure(new UnknownHostException("run1 fail"));
        transport.programOk();
        client.DescribeInstances(new DescribeInstancesRequest());
        transport.received.clear();

        // Run 2: all fail. Suppressed must contain ONLY run-2 failures.
        transport.programFailure(new UnknownHostException("run2 com fail"));
        transport.programFailure(new UnknownHostException("run2 cn fail"));
        transport.programFailure(new UnknownHostException("run2 com.cn fail"));
        TencentCloudSDKException sdkEx = null;
        try {
            client.DescribeInstances(new DescribeInstancesRequest());
            fail("expected SDK exception");
        } catch (TencentCloudSDKException e) {
            sdkEx = e;
        }
        IOException primary = unwrapToIOException(sdkEx);
        assertEquals(2, primary.getSuppressed().length);
        for (Throwable s : primary.getSuppressed()) {
            assertFalse("must not leak run-1 failure into run-2 aggregation: " + s.getMessage(),
                    s.getMessage().contains("run1"));
        }
        assertTrue(primary.getMessage().contains("run2"));
    }

    // ---- All breakers open: aggregated, zero transport hits ----

    @Test
    public void testAllBreakersOpenThrowsAggregatedWithoutProbing() throws Exception {
        CvmClient client = newCvm();
        EndpointFailoverInterceptor.FailoverState state =
                new EndpointFailoverInterceptor.FailoverState(60_000);
        failoverInterceptorOf(client).putStateForTesting("cvm.tencentcloudapi.com", state);
        for (String tldHost : new String[]{"cvm.tencentcloudapi.com", "cvm.tencentcloudapi.cn", "cvm.tencentcloudapi.com.cn"}) {
            tripBreaker(state.breakerFor(tldHost));
        }

        TransportStub transport = installStub(client);
        TencentCloudSDKException sdkEx = null;
        try {
            client.DescribeInstances(new DescribeInstancesRequest());
            fail("expected SDK exception when every breaker is open");
        } catch (TencentCloudSDKException e) {
            sdkEx = e;
        }

        IOException primary = unwrapToIOException(sdkEx);
        assertTrue(primary.getMessage().contains("circuit breaker open"));
        assertEquals(2, primary.getSuppressed().length);
        for (Throwable s : primary.getSuppressed()) {
            assertTrue(s.getMessage().contains("circuit breaker open"));
        }
        assertEquals("must not send any request when every breaker is open",
                0, transport.received.size());
    }

    // ---- Breaker lifecycle: real traffic drives Closed → Open → HalfOpen → Closed ----

    @Test
    public void testBreakerOpensAfterSustainedRealFailure() throws Exception {
        // Drive the .com breaker entirely through the public API: 5 attempts
        // where .com always fails DNS and .cn always succeeds. .cn never
        // touches .com's breaker, so .com accumulates 5/5 failures (≥maxFailNum=5,
        // 100%≥maxFailPercentage=0.75) and trips Open. After that, the next
        // request must skip .com without sending it to transport.
        CvmClient client = newCvm();
        TransportStub transport = installStub(client);

        for (int i = 0; i < 5; i++) {
            transport.programFailure(new UnknownHostException("real fail " + i));
            transport.programOk();
            client.DescribeInstances(new DescribeInstancesRequest());
        }
        assertEquals(10, transport.received.size());

        // Sanity: state exists, breaker[0] (.com) is Open.
        EndpointFailoverInterceptor.FailoverState state =
                failoverInterceptorOf(client).stateFor("cvm.tencentcloudapi.com");
        assertNotNull(state);
        assertFalse(".com breaker should be Open after 5/5 failures",
                state.breakerFor("cvm.tencentcloudapi.com").allow().allowed);

        // Next request: .com short-circuited, goes straight to .cn.
        transport.received.clear();
        transport.programOk();
        client.DescribeInstances(new DescribeInstancesRequest());
        assertEquals("Open breaker must short-circuit .com without transport hit",
                1, transport.received.size());
        assertEquals("cvm.tencentcloudapi.cn", transport.received.get(0).url().host());
    }

    @Test
    public void testBreakerTransitionsOpenToHalfOpenAfterCooldown() throws Exception {
        // Pre-place a FailoverState with a *short* breaker timeout so we don't
        // have to sleep 60 s. Trip its .com breaker Open, wait for cooldown,
        // then verify the next attempt is allowed (HalfOpen) and reaches
        // transport against .com again.
        long shortTimeoutMs = 100;
        CvmClient client = newCvm();
        EndpointFailoverInterceptor.FailoverState state =
                new EndpointFailoverInterceptor.FailoverState(shortTimeoutMs);
        failoverInterceptorOf(client).putStateForTesting("cvm.tencentcloudapi.com", state);
        tripBreaker(state.breakerFor("cvm.tencentcloudapi.com"));
        assertFalse("breaker should be Open immediately after trip",
                state.breakerFor("cvm.tencentcloudapi.com").allow().allowed);

        // Wait past cooldown — Open → HalfOpen on next allow().
        Thread.sleep(shortTimeoutMs + 50);
        CircuitBreaker.Token probeToken = state.breakerFor("cvm.tencentcloudapi.com").allow();
        assertTrue("breaker should permit a probe (HalfOpen) after cooldown elapses",
                probeToken.allowed);
        // Don't report — leave HalfOpen for the next test scenario; here we
        // only care that the cooldown transition worked.
    }

    @Test
    public void testBreakerReClosesAfterHalfOpenSuccessAndStaysClosed() throws Exception {
        // Full lifecycle through the public API:
        //   Closed → Open (sustained failure)
        //   Open → HalfOpen (cooldown elapses)
        //   HalfOpen → Closed (probe succeeds; default maxRequests=0 means
        //                      one success closes the breaker)
        // After that the .com breaker should permit unlimited traffic.
        long shortTimeoutMs = 100;
        CvmClient client = newCvm();
        EndpointFailoverInterceptor.FailoverState state =
                new EndpointFailoverInterceptor.FailoverState(shortTimeoutMs);
        failoverInterceptorOf(client).putStateForTesting("cvm.tencentcloudapi.com", state);
        TransportStub transport = installStub(client);

        // Open .com via direct breaker manipulation (faster than 5 real loops).
        tripBreaker(state.breakerFor("cvm.tencentcloudapi.com"));
        assertFalse(state.breakerFor("cvm.tencentcloudapi.com").allow().allowed);

        // Wait past cooldown to permit HalfOpen probe.
        Thread.sleep(shortTimeoutMs + 50);

        // .com is always first in the try order; breaker is HalfOpen →
        // permits probe → success reports to breaker → Closed.
        transport.programOk();
        client.DescribeInstances(new DescribeInstancesRequest());
        assertEquals(1, transport.received.size());
        assertEquals("cvm.tencentcloudapi.com", transport.received.get(0).url().host());

        // Breaker must be Closed now — multiple back-to-back allow() calls
        // should all succeed without short-circuiting.
        for (int i = 0; i < 10; i++) {
            assertTrue("breaker should be Closed after HalfOpen success, attempt " + i,
                    state.breakerFor("cvm.tencentcloudapi.com").allow().allowed);
        }

        // End-to-end: a fresh request should reach transport on .com without
        // failover, since the breaker is Closed.
        transport.received.clear();
        transport.programOk();
        client.DescribeInstances(new DescribeInstancesRequest());
        assertEquals(1, transport.received.size());
        assertEquals("cvm.tencentcloudapi.com", transport.received.get(0).url().host());
    }

    @Test
    public void testBreakerReOpensWhenHalfOpenProbeFails() throws Exception {
        // Open → HalfOpen → Open: a single failure during HalfOpen reverts
        // to Open. The interceptor must surface that failure and on the next
        // request short-circuit again.
        long shortTimeoutMs = 100;
        CvmClient client = newCvm();
        EndpointFailoverInterceptor.FailoverState state =
                new EndpointFailoverInterceptor.FailoverState(shortTimeoutMs);
        failoverInterceptorOf(client).putStateForTesting("cvm.tencentcloudapi.com", state);
        TransportStub transport = installStub(client);

        tripBreaker(state.breakerFor("cvm.tencentcloudapi.com"));
        Thread.sleep(shortTimeoutMs + 50);

        // HalfOpen probe: .com first, fails again → re-Open. .cn succeeds.
        transport.programFailure(new UnknownHostException("still down"));
        transport.programOk();
        client.DescribeInstances(new DescribeInstancesRequest());
        assertEquals(2, transport.received.size());
        assertEquals("cvm.tencentcloudapi.com", transport.received.get(0).url().host());
        assertEquals("cvm.tencentcloudapi.cn", transport.received.get(1).url().host());

        // .com breaker must be Open again immediately (not waiting for the
        // failure threshold — HalfOpen reverts to Open on a single failure).
        assertFalse("HalfOpen failure must re-Open the breaker",
                state.breakerFor("cvm.tencentcloudapi.com").allow().allowed);

        // Next request short-circuits .com again.
        transport.received.clear();
        transport.programOk();
        client.DescribeInstances(new DescribeInstancesRequest());
        assertEquals(1, transport.received.size());
        assertEquals("cvm.tencentcloudapi.cn", transport.received.get(0).url().host());
    }

    // ---- Resigned request must use rotated SecretId/Key ----

    @Test
    public void testResignPicksUpRotatedCredential() throws Exception {
        final CvmClient client = newCvm();
        TransportStub transport = installStub(client);
        transport.programFailure(new UnknownHostException("dns miss"));
        transport.programOk();

        // Swap creds mid-flight (between original sign and resign).
        installInterceptorBefore(client, new Interceptor() {
            private boolean swapped = false;
            @Override public Response intercept(Chain chain) throws IOException {
                if (!swapped) {
                    swapped = true;
                    client.setCredential(new Credential("AKIDNEW", "SKNEW"));
                }
                return chain.proceed(chain.request());
            }
        });

        client.DescribeInstances(new DescribeInstancesRequest());
        assertEquals(2, transport.received.size());
        // First request signed with old creds, resign with new ones.
        assertTrue(transport.received.get(0).header("Authorization").contains("Credential=AKIDTEST/"));
        assertTrue(transport.received.get(1).header("Authorization").contains("Credential=AKIDNEW/"));
    }

    // =================================================================
    //  Content-Type: only validate JSON bodies; pass everything else through
    // =================================================================

    @Test
    public void testFailoverOnPortUnreachableException() throws Exception {
        runSingleFailureScenario(new java.net.PortUnreachableException("port unreachable"));
    }

    /**
     * Streaming endpoints (e.g. hunyuan ChatCompletions, CLS tail) return 200 +
     * {@code text/event-stream}. The interceptor must NOT try to parse the body
     * as JSON for those — failover hinges on the status code only.
     */
    @Test
    public void testSseStreamResponseIsNotJsonValidated() throws Exception {
        CvmClient client = newCvm();
        TransportStub transport = installStub(client);
        // 200 + non-JSON body that would clearly fail JSON parsing if validateResponse
        // wrongly inspected it. Must be returned as-is.
        transport.programResponseWithCt(200, "data: hello\n\n", "text/event-stream");

        // The CVM model expects JSON, so the SDK will fail downstream when it tries
        // to cast the SSE-typed response to a normal model. That happens AFTER the
        // interceptor returns the response — we only care that the interceptor did
        // not retry. Swallow whatever the cast/parse layer throws.
        try {
            client.DescribeInstances(new DescribeInstancesRequest());
        } catch (Exception ignored) {
            // expected: SSE body cannot be deserialized into a typed CVM response.
        }
        assertEquals(
                "200 with non-JSON Content-Type must not trigger failover (no second attempt)",
                1, transport.received.size());
    }

    /**
     * 200 with no Content-Type header at all → cannot tell whether body is JSON,
     * so the interceptor passes the response through unchanged. Lets the SDK's
     * downstream JSON parser handle it (and surface a plain deserialization
     * error to the caller without 3× the requests).
     */
    @Test
    public void testResponseWithoutContentTypeIsNotJsonValidated() throws Exception {
        CvmClient client = newCvm();
        TransportStub transport = installStub(client);
        transport.programResponseWithCt(200, "<html>oops</html>", null);

        try {
            client.DescribeInstances(new DescribeInstancesRequest());
        } catch (Exception ignored) {
            // SDK may fail to parse body; that's fine.
        }
        assertEquals("missing Content-Type must not trigger failover",
                1, transport.received.size());
    }

    /**
     * 200 + JSON envelope carrying a business error (e.g. AuthFailure). The
     * interceptor MUST treat this as a healthy host response — no retry —
     * and let the SDK surface the {@link TencentCloudSDKException}.
     */
    @Test
    public void testBusinessSdkErrorDoesNotTriggerFailover() throws Exception {
        CvmClient client = newCvm();
        TransportStub transport = installStub(client);
        transport.programJsonOk(
                "{\"Response\":{\"RequestId\":\"req-bad\",\"Error\":{"
                        + "\"Code\":\"AuthFailure.SignatureFailure\","
                        + "\"Message\":\"signature wrong\"}}}");

        try {
            client.DescribeInstances(new DescribeInstancesRequest());
            fail("expected business SDK exception");
        } catch (TencentCloudSDKException e) {
            assertEquals("AuthFailure.SignatureFailure", e.getErrorCode());
            assertEquals("req-bad", e.getRequestId());
        }
        assertEquals("business 4xx-style errors must not be retried as failover",
                1, transport.received.size());
    }

    // =================================================================
    //  Re-sign coverage for paths the happy-path tests miss
    // =================================================================

    /**
     * SkipSign V3: streaming endpoints set {@code Authorization: SKIP} and the
     * resigner just rewrites Host + URL host without recomputing a signature.
     * Easiest way to trigger that path is a fake request constructed with
     * {@code Authorization: SKIP} pre-set; we drive it through the same OkHttp
     * client so the interceptor sees it.
     */
    @Test
    public void testSkipSignV3OnFailoverRewritesHostWithoutResigning() throws Exception {
        CvmClient client = newCvm();
        TransportStub transport = installStub(client);
        transport.programFailure(new UnknownHostException("dns miss"));
        transport.programOk();

        // Build a Request directly with Authorization: SKIP and feed it to the
        // installed OkHttpClient (which has the failover interceptor at the head).
        OkHttpClient http = grabOkHttpClient(client);
        Request raw = new Request.Builder()
                .url("https://cvm.tencentcloudapi.com/")
                .header("Host", "cvm.tencentcloudapi.com")
                .header("Authorization", "SKIP")
                .header("X-TC-Action", "DescribeInstances")
                .header("X-TC-Version", "2017-03-12")
                .header("Content-Type", "application/json")
                .post(okhttp3.RequestBody.create(
                        MediaType.parse("application/json"), "{}".getBytes()))
                .build();

        Response resp = http.newCall(raw).execute();
        try {
            assertEquals(200, resp.code());
        } finally {
            resp.close();
        }
        assertEquals(2, transport.received.size());
        Request resigned = transport.received.get(1);
        assertEquals("cvm.tencentcloudapi.cn", resigned.url().host());
        assertEquals("cvm.tencentcloudapi.cn", resigned.header("Host"));
        // SKIP path: Authorization header is preserved verbatim, NOT recomputed.
        assertEquals("SKIP", resigned.header("Authorization"));
    }

    /**
     * TC3 GET re-sign: query parameters live in the URL and must be folded into
     * the canonical query string (sorted, URL-encoded). Verifies the GET branch
     * of {@code RequestResigner.resignV3} —  the rest of the failover suite is
     * POST-only.
     */
    @Test
    public void testTc3GetResignBuildsSortedCanonicalQuery() throws Exception {
        ClientProfile profile = new ClientProfile();
        profile.getHttpProfile().setReqMethod(HttpProfile.REQ_GET);
        CvmClient client = newCvm(profile);
        TransportStub transport = installStub(client);
        transport.programFailure(new UnknownHostException("dns miss"));
        transport.programOk();

        client.DescribeInstances(new DescribeInstancesRequest());
        assertEquals(2, transport.received.size());

        Request resigned = transport.received.get(1);
        assertEquals("cvm.tencentcloudapi.cn", resigned.url().host());
        // Authorization re-computed for new host (TC3 GET path actually exercised).
        assertNotEquals(transport.received.get(0).header("Authorization"),
                resigned.header("Authorization"));
        assertTrue(resigned.header("Authorization").startsWith("TC3-HMAC-SHA256 "));
    }

    /** HmacSHA1 mirrors HmacSHA256; covered explicitly so a regression in either branch is caught. */
    @Test
    public void testHmacSha1ResignProducesValidSignature() throws Exception {
        ClientProfile profile = new ClientProfile();
        profile.setSignMethod(ClientProfile.SIGN_SHA1);
        profile.getHttpProfile().setReqMethod(HttpProfile.REQ_GET);
        CvmClient client = newCvm(profile);
        TransportStub transport = installStub(client);
        transport.programFailure(new UnknownHostException("dns miss"));
        transport.programOk();

        client.DescribeInstances(new DescribeInstancesRequest());

        Request resigned = transport.received.get(1);
        assertEquals("cvm.tencentcloudapi.cn", resigned.url().host());
        assertEquals("HmacSHA1", resigned.url().queryParameter("SignatureMethod"));
        // Exactly one Signature param — old signature replaced, not appended.
        assertEquals(1, resigned.url().queryParameterValues("Signature").size());
        assertNotEquals(transport.received.get(0).url().queryParameter("Signature"),
                resigned.url().queryParameter("Signature"));
    }

    // =================================================================
    //  Per-origin breaker isolation
    // =================================================================

    /**
     * Failure state is keyed by origin host. Tripping the breaker for
     * {@code cvm.tencentcloudapi.com} must NOT short-circuit a request whose
     * origin is a DIFFERENT host (e.g. another service on the same client).
     * Catches accidental sharing across origins.
     */
    @Test
    public void testBreakerStateIsolatedAcrossOriginHosts() throws Exception {
        CvmClient client = newCvm();
        TransportStub transport = installStub(client);

        // Pre-trip the .com breaker on the cvm origin.
        EndpointFailoverInterceptor.FailoverState cvmState =
                new EndpointFailoverInterceptor.FailoverState(60_000);
        failoverInterceptorOf(client).putStateForTesting(
                "cvm.tencentcloudapi.com", cvmState);
        tripBreaker(cvmState.breakerFor("cvm.tencentcloudapi.com"));

        // Now drive a request whose origin is a different host. We do that by
        // calling http.newCall directly so we control the URL.
        OkHttpClient http = grabOkHttpClient(client);
        Request other = new Request.Builder()
                .url("https://cls.tencentcloudapi.com/")
                .header("Host", "cls.tencentcloudapi.com")
                .header("Authorization", "SKIP")
                .header("Content-Type", "application/json")
                .post(okhttp3.RequestBody.create(
                        MediaType.parse("application/json"), "{}".getBytes()))
                .build();
        transport.programOk();
        Response resp = http.newCall(other).execute();
        try {
            assertEquals(200, resp.code());
        } finally {
            resp.close();
        }
        assertEquals("cls origin must reach transport on first attempt — "
                        + "cvm's breaker state must not affect it",
                1, transport.received.size());
        assertEquals("cls.tencentcloudapi.com", transport.received.get(0).url().host());
    }

    // =================================================================
    //  Helpers
    // =================================================================

    private static CvmClient newCvm() {
        return newCvm(new ClientProfile());
    }

    private static CvmClient newCvm(ClientProfile profile) {
        return new CvmClient(
                new Credential("AKIDTEST", "SKTEST"),
                "ap-guangzhou",
                profile);
    }

    /**
     * Reaches into the CvmClient's HttpConnection and rebuilds its OkHttpClient
     * with {@code stub} appended as the terminal interceptor, so all in-flight
     * traffic is short-circuited to the stub instead of hitting the network.
     * Returns the stub for scripting.
     */
    private static TransportStub installStub(AbstractClient client) {
        TransportStub stub = new TransportStub();
        OkHttpClient orig = grabOkHttpClient(client);
        setOkHttpClient(client, orig.newBuilder().addInterceptor(stub).build());
        return stub;
    }

    /**
     * Adds an interceptor BEFORE the existing chain so it sees the request
     * before the failover interceptor. Used for mid-flight credential rotation
     * scenarios where the test needs to mutate state between attempts.
     */
    private static void installInterceptorBefore(AbstractClient client, Interceptor it) {
        OkHttpClient orig = grabOkHttpClient(client);
        OkHttpClient.Builder b = new OkHttpClient.Builder()
                .connectTimeout(orig.connectTimeoutMillis(), java.util.concurrent.TimeUnit.MILLISECONDS)
                .readTimeout(orig.readTimeoutMillis(), java.util.concurrent.TimeUnit.MILLISECONDS)
                .writeTimeout(orig.writeTimeoutMillis(), java.util.concurrent.TimeUnit.MILLISECONDS)
                .addInterceptor(it);
        for (Interceptor existing : orig.interceptors()) {
            b.addInterceptor(existing);
        }
        setOkHttpClient(client, b.build());
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

    /** Locates the {@link EndpointFailoverInterceptor} attached to {@code client}'s OkHttpClient. */
    private static EndpointFailoverInterceptor failoverInterceptorOf(AbstractClient client) {
        for (Interceptor it : grabOkHttpClient(client).interceptors()) {
            if (it instanceof EndpointFailoverInterceptor) {
                return (EndpointFailoverInterceptor) it;
            }
        }
        throw new IllegalStateException("EndpointFailoverInterceptor not installed on client");
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

    private static void tripBreaker(CircuitBreaker breaker) {
        // CircuitBreaker.Setting.maxFailNum=5, maxFailPercentage=0.75 by
        // default — 6 consecutive failures guarantee Open state.
        for (int i = 0; i < 6; i++) {
            CircuitBreaker.Token t = breaker.allow();
            if (t.allowed) {
                t.report(false);
            }
        }
    }

    /**
     * SDK wraps the failover IOException as the cause of a TencentCloudSDKException.
     * Walk one level down to get the IOException that carries primary message
     * and suppressed entries.
     */
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
        okio.Buffer buf = new okio.Buffer();
        req.body().writeTo(buf);
        return buf.readByteArray();
    }

    /** Mid-flight token rotator used by token-rotation tests. Swaps once. */
    private static final class AtomicTokenSwapper implements Interceptor {
        private final AbstractClient client;
        private final String newToken;
        private boolean swapped = false;

        AtomicTokenSwapper(AbstractClient client, String newToken) {
            this.client = client;
            this.newToken = newToken;
        }

        @Override
        public Response intercept(Chain chain) throws IOException {
            if (!swapped) {
                swapped = true;
                Credential cur = client.getCredential();
                client.setCredential(newToken == null
                        ? new Credential(cur.getSecretId(), cur.getSecretKey())
                        : new Credential(cur.getSecretId(), cur.getSecretKey(), newToken));
            }
            return chain.proceed(chain.request());
        }
    }

    /**
     * Terminal interceptor that replaces the network. Tests script a queue of
     * outcomes (IOException / Response). Records every request that reaches it.
     */
    private static final class TransportStub implements Interceptor {
        final List<Request> received = new ArrayList<Request>();
        private final Queue<Object> programmed = new LinkedList<Object>();

        void programFailure(IOException e) {
            programmed.add(e);
        }

        /** Returns a minimal valid Tencent Cloud JSON envelope. */
        void programOk() {
            programJsonOk("{\"Response\":{\"RequestId\":\"req-ok\"}}");
        }

        void programJsonOk(String json) {
            programmed.add(new ProgrammedResponse(200, json, "application/json"));
        }

        void programResponse(int code, String body) {
            programmed.add(new ProgrammedResponse(code, body, "application/json"));
        }

        /** Program a 200 response with an arbitrary Content-Type (or null to omit it). */
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
                // No Content-Type header at all — body still needs a MediaType for OkHttp.
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

    // =================================================================
    //  backupEndpoint (legacy) mode tests
    // =================================================================

    /** When the origin succeeds, the request goes to the original host — no backup involved. */
    @Test
    public void testBackupEndpoint_originSucceeds_usesOrigin() throws Exception {
        ClientProfile profile = new ClientProfile();
        profile.setBackupEndpoint("ap-guangzhou.tencentcloudapi.com");
        CvmClient client = newCvm(profile);
        TransportStub transport = installStub(client);
        transport.programOk();

        client.DescribeInstances(new DescribeInstancesRequest());

        assertEquals(1, transport.received.size());
        assertEquals("cvm.tencentcloudapi.com", transport.received.get(0).url().host());
    }

    /** When the origin throws a DNS-miss, the interceptor retries against the backup host. */
    @Test
    public void testBackupEndpoint_originDnsMiss_retriesBackup() throws Exception {
        ClientProfile profile = new ClientProfile();
        profile.setBackupEndpoint("ap-guangzhou.tencentcloudapi.com");
        CvmClient client = newCvm(profile);
        TransportStub transport = installStub(client);
        transport.programFailure(new UnknownHostException("cvm.tencentcloudapi.com"));
        transport.programOk();

        client.DescribeInstances(new DescribeInstancesRequest());

        assertEquals(2, transport.received.size());
        assertEquals("cvm.tencentcloudapi.com", transport.received.get(0).url().host());
        assertEquals("cvm.ap-guangzhou.tencentcloudapi.com", transport.received.get(1).url().host());
    }

    /** Both origin and backup fail: the exception from the backup propagates. */
    @Test
    public void testBackupEndpoint_bothFail_throws() throws Exception {
        ClientProfile profile = new ClientProfile();
        profile.setBackupEndpoint("ap-guangzhou.tencentcloudapi.com");
        CvmClient client = newCvm(profile);
        TransportStub transport = installStub(client);
        transport.programFailure(new UnknownHostException("cvm.tencentcloudapi.com"));
        transport.programFailure(new UnknownHostException("cvm.ap-guangzhou.tencentcloudapi.com"));

        try {
            client.DescribeInstances(new DescribeInstancesRequest());
            fail("expected TencentCloudSDKException");
        } catch (TencentCloudSDKException e) {
            IOException io = unwrapToIOException(e);
            assertTrue(io.getMessage(), io.getMessage().contains("cvm.ap-guangzhou.tencentcloudapi.com"));
            // The origin failure is attached as a suppressed cause.
            assertEquals(1, io.getSuppressed().length);
            assertTrue(io.getSuppressed()[0].getMessage().contains("cvm.tencentcloudapi.com"));
        }
        assertEquals(2, transport.received.size());
    }

    /**
     * Once enough origin failures accumulate, the circuit breaker opens and
     * subsequent requests go straight to the backup endpoint.
     */
    @Test
    public void testBackupEndpoint_breakerOpen_skipsOrigin() throws Exception {
        ClientProfile profile = new ClientProfile();
        profile.setBackupEndpoint("ap-guangzhou.tencentcloudapi.com");
        CvmClient client = newCvm(profile);
        TransportStub transport = installStub(client);

        // Drive 6 origin-fail + backup-ok cycles to open the circuit breaker.
        for (int i = 0; i < 6; i++) {
            transport.programFailure(new UnknownHostException("origin down"));
            transport.programOk();
            try {
                client.DescribeInstances(new DescribeInstancesRequest());
            } catch (TencentCloudSDKException ignored) { }
        }
        transport.received.clear();

        // With breaker open, the next request should go straight to backup (1 attempt only).
        transport.programOk();
        client.DescribeInstances(new DescribeInstancesRequest());

        assertEquals(1, transport.received.size());
        assertEquals("cvm.ap-guangzhou.tencentcloudapi.com", transport.received.get(0).url().host());
    }

    /** Non-failover-worthy errors (e.g., SocketException with non-matching type) propagate immediately. */
    @Test
    public void testBackupEndpoint_nonFailoverError_propagatesDirectly() throws Exception {
        ClientProfile profile = new ClientProfile();
        profile.setBackupEndpoint("ap-guangzhou.tencentcloudapi.com");
        CvmClient client = newCvm(profile);
        TransportStub transport = installStub(client);
        // java.io.IOException (non-subclass of the failover-worthy set) should propagate.
        transport.programFailure(new IOException("generic IO error"));

        try {
            client.DescribeInstances(new DescribeInstancesRequest());
            fail("expected TencentCloudSDKException");
        } catch (TencentCloudSDKException e) {
            assertTrue(e.getCause() instanceof IOException);
        }
        // Only one attempt: the backup was NOT tried.
        assertEquals(1, transport.received.size());
    }

    /**
     * Without backupEndpoint, a DNS-miss triggers TLD failover (the new behaviour),
     * not a fixed backup host.
     */
    @Test
    public void testNoBackupEndpoint_dnsMiss_triggersNewTldFailover() throws Exception {
        CvmClient client = newCvm(); // no backupEndpoint
        TransportStub transport = installStub(client);
        transport.programFailure(new UnknownHostException("cvm.tencentcloudapi.com"));
        transport.programOk(); // second TLD succeeds

        client.DescribeInstances(new DescribeInstancesRequest());

        assertEquals(2, transport.received.size());
        assertEquals("cvm.tencentcloudapi.com", transport.received.get(0).url().host());
        // Should have failed over to .cn (the next KNOWN_TLD after .com).
        assertEquals("cvm.tencentcloudapi.cn", transport.received.get(1).url().host());
    }
}
