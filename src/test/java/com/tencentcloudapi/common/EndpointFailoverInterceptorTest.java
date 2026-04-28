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
import org.junit.Before;
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

    @Before
    public void resetState() {
        EndpointFailoverInterceptor.resetStateForTesting();
    }

    // =================================================================
    //  Pure helper tests
    // =================================================================

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
    public void testFailoverFromComEndpoint() throws Exception {
        CvmClient client = newCvm();
        TransportStub transport = installStub(client);
        transport.programFailure(new UnknownHostException("dns miss"));
        transport.programOk();

        DescribeInstancesResponse resp = client.DescribeInstances(new DescribeInstancesRequest());
        assertNotNull(resp);
        assertEquals(2, transport.received.size());
        assertEquals("cvm.tencentcloudapi.com", transport.received.get(0).url().host());
        assertEquals("cvm.tencentcloudapi.cn", transport.received.get(1).url().host());
        // Resigned request must carry Host header tracking new URL host.
        assertEquals("cvm.tencentcloudapi.cn", transport.received.get(1).header("Host"));
        // Authorization recomputed for new host.
        assertNotEquals(
                transport.received.get(0).header("Authorization"),
                transport.received.get(1).header("Authorization"));
    }

    @Test
    public void testFailoverFromCnEndpoint() throws Exception {
        ClientProfile profile = new ClientProfile();
        profile.getHttpProfile().setEndpoint("cvm.tencentcloudapi.cn");
        CvmClient client = newCvm(profile);
        TransportStub transport = installStub(client);
        transport.programFailure(new UnknownHostException("dns miss"));
        transport.programOk();

        client.DescribeInstances(new DescribeInstancesRequest());
        assertEquals(2, transport.received.size());
        assertEquals("cvm.tencentcloudapi.cn", transport.received.get(0).url().host());
        assertEquals("cvm.tencentcloudapi.com", transport.received.get(1).url().host());
    }

    @Test
    public void testFailoverDropsRegionalLabelFromHost() throws Exception {
        ClientProfile profile = new ClientProfile();
        profile.getHttpProfile().setEndpoint("cvm.ap-guangzhou.tencentcloudapi.com");
        CvmClient client = newCvm(profile);
        TransportStub transport = installStub(client);
        transport.programFailure(new UnknownHostException("dns miss"));
        transport.programOk();

        client.DescribeInstances(new DescribeInstancesRequest());
        assertEquals(2, transport.received.size());
        assertEquals("cvm.ap-guangzhou.tencentcloudapi.com",
                transport.received.get(0).url().host());
        assertEquals("cvm.tencentcloudapi.cn", transport.received.get(1).url().host());
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

    // ---- 5xx server response is not a failover trigger ----

    @Test
    public void test5xxResponseDoesNotTriggerFailover() throws Exception {
        CvmClient client = newCvm();
        TransportStub transport = installStub(client);
        transport.programResponse(503, "service unavailable");

        try {
            client.DescribeInstances(new DescribeInstancesRequest());
            fail("expected SDK exception for 503");
        } catch (TencentCloudSDKException e) {
            assertTrue("message should mention non-200 code, got: " + e.getMessage(),
                    e.getMessage().contains("503"));
        }
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
        EndpointFailoverInterceptor.STATE.put("cvm.tencentcloudapi.com", state);
        tripBreaker(state.breakers[0]);  // .com Open

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
        EndpointFailoverInterceptor.STATE.put("cvm.tencentcloudapi.com", state);
        tripBreaker(state.breakers[1]);
        tripBreaker(state.breakers[2]);

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
        EndpointFailoverInterceptor.STATE.put("cvm.tencentcloudapi.com", state);
        for (CircuitBreaker breaker : state.breakers) {
            tripBreaker(breaker);
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

    // ---- Followup ordering: known-working TLD preferred; origin reprobed after cooldown ----

    @Test
    public void testFollowupRequestUsesKnownWorkingTld() throws Exception {
        CvmClient client = newCvm();
        TransportStub transport = installStub(client);

        transport.programFailure(new UnknownHostException("first dns miss"));
        transport.programOk();
        client.DescribeInstances(new DescribeInstancesRequest());
        assertEquals(2, transport.received.size());

        transport.received.clear();
        // Ample programmed outcomes — if the interceptor wrongly reprobes
        // .com it will consume more than one and the assertion catches it.
        transport.programOk();
        transport.programOk();
        client.DescribeInstances(new DescribeInstancesRequest());
        assertEquals(1, transport.received.size());
        assertEquals("cvm.tencentcloudapi.cn", transport.received.get(0).url().host());
    }

    @Test
    public void testFollowupRequestReprobesOriginalTldAfterCooldown() throws Exception {
        CvmClient client = newCvm();
        TransportStub transport = installStub(client);

        transport.programFailure(new UnknownHostException("first dns miss"));
        transport.programOk();
        client.DescribeInstances(new DescribeInstancesRequest());

        EndpointFailoverInterceptor.FailoverState state =
                EndpointFailoverInterceptor.STATE.get("cvm.tencentcloudapi.com");
        assertNotNull(state);
        state.originProbeAfterMs = 0;  // simulate cooldown elapsed

        transport.received.clear();
        transport.programOk();
        transport.programOk();
        client.DescribeInstances(new DescribeInstancesRequest());
        assertEquals(1, transport.received.size());
        assertEquals("cvm.tencentcloudapi.com", transport.received.get(0).url().host());
        assertEquals("origin probe must clear cooldown after a successful reprobe",
                -1, state.originProbeAfterMs);
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
            programmed.add(new ProgrammedResponse(200, json));
        }

        void programResponse(int code, String body) {
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
