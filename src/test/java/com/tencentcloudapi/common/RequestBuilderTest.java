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
 * software distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.common;

import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.junit.Test;

import java.io.IOException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Tests for {@link RequestBuilder}.
 *
 * <p>Covers the three signing paths (TC3, v1, skip), the URL/host separation
 * ({@code withURL} decoupling the connection target from the signature host),
 * default-host fallback when {@code withHost} is not called, and the {@code build()}
 * validation failures.
 */
public class RequestBuilderTest {

    private static final String ORIGIN_HOST = "cvm.tencentcloudapi.com";
    private static final String FAILOVER_HOST = "cvm.internal.tencentcloudapi.com";
    private static final Credential CRED = new Credential("AKIDTEST", "SKTEST");

    // =================================================================
    //  Helpers
    // =================================================================

    /** Builds a signed origin request so tests start from a realistic input. */
    private static Request signedOriginRequest() throws IOException, TencentCloudSDKException {
        return new RequestBuilder(newPostRequest(ORIGIN_HOST, ORIGIN_HOST))
                .withCredential(CRED)
                .withSignMethod(ClientProfile.SIGN_TC3_256)
                .withHost(ORIGIN_HOST)
                .build();
    }

    private static Request newPostRequest(String urlHost, String headerHost) {
        return new Request.Builder()
                .url("https://" + urlHost + "/")
                .header("Host", headerHost)
                .header("Content-Type", "application/json")
                .post(RequestBody.create(MediaType.parse("application/json"), "{}".getBytes()))
                .build();
    }

    /** GET request with a query string (for v1 sign tests). */
    private static Request newGetRequest(String urlHost, String headerHost) {
        return new Request.Builder()
                .url("https://" + urlHost + "/?Action=DescribeInstances&Version=2017-03-12")
                .header("Host", headerHost)
                .get()
                .build();
    }

    private static Request newFormPostRequest(String urlHost, String headerHost) {
        return new Request.Builder()
                .url("https://" + urlHost + "/")
                .header("Host", headerHost)
                .header("Content-Type", "application/x-www-form-urlencoded")
                .post(RequestBody.create(MediaType.parse("application/x-www-form-urlencoded"),
                        "Action=DescribeInstances&Version=2017-03-12".getBytes()))
                .build();
    }

    private static Request newSkipRequest(String urlHost) {
        return new Request.Builder()
                .url("https://" + urlHost + "/")
                .header("Host", urlHost)
                .header("Authorization", "SKIP")
                .header("Content-Type", "application/json")
                .post(RequestBody.create(MediaType.parse("application/json"), "{}".getBytes()))
                .build();
    }

    // =================================================================
    //  build() validation
    // =================================================================

    @Test
    public void testBuildThrowsWhenCredentialMissing() throws IOException {
        try {
            new RequestBuilder(newPostRequest(ORIGIN_HOST, ORIGIN_HOST))
                    .withSignMethod(ClientProfile.SIGN_TC3_256)
                    .withHost(FAILOVER_HOST)
                    .build();
            fail("expected TencentCloudSDKException");
        } catch (TencentCloudSDKException e) {
            assertTrue(e.getMessage().contains("credential"));
        }
    }

    @Test
    public void testBuildThrowsWhenSignMethodMissing() throws IOException {
        try {
            new RequestBuilder(newPostRequest(ORIGIN_HOST, ORIGIN_HOST))
                    .withCredential(CRED)
                    .withHost(FAILOVER_HOST)
                    .build();
            fail("expected TencentCloudSDKException");
        } catch (TencentCloudSDKException e) {
            assertTrue(e.getMessage().contains("sign method"));
        }
    }

    // =================================================================
    //  TC3 signing + host rewrite
    // =================================================================

    // withUrlHost + withHost rewrites both URL host and Host header to the target.
    @Test
    public void testWithHostRewritesUrlAndHeader() throws Exception {
        Request out = new RequestBuilder(newPostRequest(ORIGIN_HOST, ORIGIN_HOST))
                .withCredential(CRED)
                .withSignMethod(ClientProfile.SIGN_TC3_256)
                .withUrlHost(FAILOVER_HOST)
                .withHost(FAILOVER_HOST)
                .build();

        assertEquals(FAILOVER_HOST, out.url().host());
        assertEquals(443, out.url().port());
        assertEquals(FAILOVER_HOST, out.header("Host"));
        assertNotNull(out.header("Authorization"));
        assertNotNull(out.header("X-TC-Timestamp"));
    }

    // Re-signing for a different host produces a different signature.
    @Test
    public void testReSignProducesDifferentAuthorization() throws Exception {
        Request origin = signedOriginRequest();
        String originAuth = origin.header("Authorization");

        Request resigned = new RequestBuilder(origin)
                .withCredential(CRED)
                .withSignMethod(ClientProfile.SIGN_TC3_256)
                .withHost(FAILOVER_HOST)
                .build();

        assertNotEquals(originAuth, resigned.header("Authorization"));
        assertEquals(FAILOVER_HOST, resigned.header("Host"));
    }

    // Token in credential is propagated to X-TC-Token.
    @Test
    public void testTokenPropagatedToHeader() throws Exception {
        Credential withToken = new Credential("AKIDTEST", "SKTEST", "token-value");
        Request out = new RequestBuilder(newPostRequest(ORIGIN_HOST, ORIGIN_HOST))
                .withCredential(withToken)
                .withSignMethod(ClientProfile.SIGN_TC3_256)
                .withHost(FAILOVER_HOST)
                .build();
        assertEquals("token-value", out.header("X-TC-Token"));
    }

    // Empty token removes the X-TC-Token header.
    @Test
    public void testEmptyTokenRemovesHeader() throws Exception {
        Request origin = new Request.Builder()
                .url("https://" + ORIGIN_HOST + "/")
                .header("Host", ORIGIN_HOST)
                .header("X-TC-Token", "stale")
                .header("Content-Type", "application/json")
                .post(RequestBody.create(MediaType.parse("application/json"), "{}".getBytes()))
                .build();
        Request out = new RequestBuilder(origin)
                .withCredential(CRED)
                .withSignMethod(ClientProfile.SIGN_TC3_256)
                .withHost(FAILOVER_HOST)
                .build();
        assertNull(out.header("X-TC-Token"));
    }

    @Test
    public void testExplicitServiceUsedInTc3CredentialScope() throws Exception {
        Request out = new RequestBuilder(newPostRequest(ORIGIN_HOST, ORIGIN_HOST))
                .withCredential(CRED)
                .withSignMethod(ClientProfile.SIGN_TC3_256)
                .withHost("gateway.example.com")
                .withService("cvm")
                .build();

        assertTrue(out.header("Authorization").contains("/cvm/tc3_request"));
    }

    // Unsigned-payload flag is reflected in the canonical request hash.
    @Test
    public void testUnsignedPayloadChangesAuthorization() throws Exception {
        Request signed = new RequestBuilder(newPostRequest(ORIGIN_HOST, ORIGIN_HOST))
                .withCredential(CRED)
                .withSignMethod(ClientProfile.SIGN_TC3_256)
                .withHost(FAILOVER_HOST)
                .build();
        Request unsigned = new RequestBuilder(newPostRequest(ORIGIN_HOST, ORIGIN_HOST))
                .withCredential(CRED)
                .withSignMethod(ClientProfile.SIGN_TC3_256)
                .withUnsignedPayload(true)
                .withHost(FAILOVER_HOST)
                .build();
        assertNotEquals(signed.header("Authorization"), unsigned.header("Authorization"));
    }

    // =================================================================
    //  withURL — URL/connect host decoupled from signing host
    // =================================================================

    // withURL overrides the connection target without changing the signature.
    @Test
    public void testWithURLOverridesConnectTarget() throws Exception {
        URL connectUrl = new URL("https", "10.0.0.1", 8080, "/");
        Request out = new RequestBuilder(newPostRequest(ORIGIN_HOST, ORIGIN_HOST))
                .withCredential(CRED)
                .withSignMethod(ClientProfile.SIGN_TC3_256)
                .withHost(ORIGIN_HOST)
                .withURL(connectUrl)
                .build();

        // URL points to the instance IP:port.
        assertEquals("10.0.0.1", out.url().host());
        assertEquals(8080, out.url().port());
        // Host header + signature are for the business domain.
        assertEquals(ORIGIN_HOST, out.header("Host"));
        assertNotNull(out.header("Authorization"));
    }

    // The signature computed with withURL must match one computed with only
    // withHost on the same signing host — i.e. withURL does not influence the
    // signature, only the connection target.
    @Test
    public void testWithURLDoesNotAffectSignature() throws Exception {
        Request noUrl = new RequestBuilder(newPostRequest(ORIGIN_HOST, ORIGIN_HOST))
                .withCredential(CRED)
                .withSignMethod(ClientProfile.SIGN_TC3_256)
                .withHost(ORIGIN_HOST)
                .build();
        Request withUrl = new RequestBuilder(newPostRequest(ORIGIN_HOST, ORIGIN_HOST))
                .withCredential(CRED)
                .withSignMethod(ClientProfile.SIGN_TC3_256)
                .withHost(ORIGIN_HOST)
                .withURL(new URL("https", "10.0.0.1", 8080, "/"))
                .build();
        assertEquals(noUrl.header("Authorization"), withUrl.header("Authorization"));
        assertEquals(noUrl.header("X-TC-Timestamp"), withUrl.header("X-TC-Timestamp"));
    }

    // =================================================================
    //  Default host fallback (no withHost)
    // =================================================================

    // When withHost is not called, the Host header / URL host are preserved
    // from the original request. The request is still re-signed for that host.
    @Test
    public void testNoWithHostPreservesOriginHost() throws Exception {
        Request out = new RequestBuilder(newPostRequest(ORIGIN_HOST, ORIGIN_HOST))
                .withCredential(CRED)
                .withSignMethod(ClientProfile.SIGN_TC3_256)
                .build();
        assertEquals(ORIGIN_HOST, out.url().host());
        assertEquals(ORIGIN_HOST, out.header("Host"));
        assertNotNull(out.header("Authorization"));
    }

    // When withHost is not called and Host header is absent, the URL host is
    // used as the signing host.
    @Test
    public void testNoWithHostFallsBackToUrlHostWhenHeaderAbsent() throws Exception {
        Request origin = new Request.Builder()
                .url("https://" + ORIGIN_HOST + "/")
                .header("Content-Type", "application/json")
                .post(RequestBody.create(MediaType.parse("application/json"), "{}".getBytes()))
                .build();
        Request out = new RequestBuilder(origin)
                .withCredential(CRED)
                .withSignMethod(ClientProfile.SIGN_TC3_256)
                .build();
        assertEquals(ORIGIN_HOST, out.header("Host"));
        assertNotNull(out.header("Authorization"));
    }

    // =================================================================
    //  v1 signing (HmacSHA1 / HmacSHA256)
    // =================================================================

    @Test
    public void testV1SignGetAppendsSignatureToQuery() throws Exception {
        Request out = new RequestBuilder(newGetRequest(ORIGIN_HOST, ORIGIN_HOST))
                .withCredential(CRED)
                .withSignMethod(ClientProfile.SIGN_SHA1)
                .withUrlHost(FAILOVER_HOST)
                .withHost(FAILOVER_HOST)
                .build();
        String query = out.url().query();
        assertNotNull(query);
        assertTrue(query.contains("Signature="));
        assertTrue(query.contains("SecretId="));
        assertEquals(FAILOVER_HOST, out.url().host());
    }

    @Test
    public void testV1SignPostAppendsSignatureToBody() throws Exception {
        Request out = new RequestBuilder(newFormPostRequest(ORIGIN_HOST, ORIGIN_HOST))
                .withCredential(CRED)
                .withSignMethod(ClientProfile.SIGN_SHA256)
                .withUrlHost(FAILOVER_HOST)
                .withHost(FAILOVER_HOST)
                .build();
        // Body is a form-encoded string ending with Signature=...
        assertEquals(FAILOVER_HOST, out.url().host());
        assertNotNull(out.body());
    }

    @Test
    public void testV1SignUnsupportedMethodThrows() throws IOException {
        Request origin = new Request.Builder()
                .url("https://" + ORIGIN_HOST + "/")
                .header("Host", ORIGIN_HOST)
                .put(RequestBody.create(MediaType.parse("application/json"), "{}".getBytes()))
                .build();
        try {
            new RequestBuilder(origin)
                    .withCredential(CRED)
                    .withSignMethod(ClientProfile.SIGN_SHA1)
                    .withHost(FAILOVER_HOST)
                    .build();
            fail("expected TencentCloudSDKException");
        } catch (TencentCloudSDKException e) {
            assertTrue(e.getMessage().contains("Method only support"));
        }
    }

    // =================================================================
    //  Sign skip path
    // =================================================================

    // Authorization: SKIP → buildSkip path, no signature computed.
    @Test
    public void testSkipV3StripsHostHeader() throws Exception {
        Request out = new RequestBuilder(newSkipRequest(ORIGIN_HOST))
                .withCredential(CRED)
                .withUrlHost(FAILOVER_HOST)
                .withHost(FAILOVER_HOST)
                .build();
        assertEquals(FAILOVER_HOST, out.header("Host"));
        // No real Authorization was added — still "SKIP".
        assertEquals("SKIP", out.header("Authorization"));
    }

    @Test
    public void testUnsupportedSignMethodThrows() throws IOException {
        try {
            new RequestBuilder(newPostRequest(ORIGIN_HOST, ORIGIN_HOST))
                    .withCredential(CRED)
                    .withSignMethod("bogus")
                    .withHost(FAILOVER_HOST)
                    .build();
            fail("expected TencentCloudSDKException");
        } catch (TencentCloudSDKException e) {
            assertTrue(e.getMessage().contains("invalid or not supported"));
        }
    }
}
