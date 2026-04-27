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
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/** Unit tests for {@link EndpointFailoverInterceptor}. Pure in-process tests; no network. */
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
    public void testSubstituteTldPreservesPrefix() {
        assertEquals(
                "cvm.tencentcloudapi.com.cn",
                EndpointFailoverInterceptor.substituteTld(
                        "cvm.tencentcloudapi.com", "tencentcloudapi.com", "tencentcloudapi.com.cn"));
        assertEquals(
                "cvm.ap-shanghai.tencentcloudapi.cn",
                EndpointFailoverInterceptor.substituteTld(
                        "cvm.ap-shanghai.tencentcloudapi.com", "tencentcloudapi.com", "tencentcloudapi.cn"));
        assertEquals(
                "hunyuan.ai.ap-guangzhou.tencentcloudapi.com.cn",
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
        Request req = new Request.Builder()
                .url("https://cvm.tencentcloudapi.com/")
                .post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), "{}"))
                .header("Host", "cvm.tencentcloudapi.com")
                .header("Authorization", "SKIP")
                .build();
        RecordingChain chain = new RecordingChain(req);
        chain.programSuccess();

        it.intercept(chain);
        assertEquals(1, chain.requests.size());
        assertEquals("cvm.tencentcloudapi.com", chain.requests.get(0).url().host());
    }

    @Test
    public void testPassThroughWhenDomainFailoverDisabled() throws Exception {
        TestClient client = newTC3Client();
        client.getClientProfile().getHttpProfile().setDomainFailover(false);
        EndpointFailoverInterceptor it = new EndpointFailoverInterceptor(client);
        Request req = newTC3Request("cvm.tencentcloudapi.com");
        RecordingChain chain = new RecordingChain(req);
        chain.programDnsFailure();
        try {
            it.intercept(chain);
            fail("expected UnknownHostException");
        } catch (UnknownHostException expected) {
            // no retry attempted when failover disabled
        }
        assertEquals(1, chain.requests.size());
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
    public void testAllBackupTldsFailThrowsUnknownHostException() throws Exception {
        TestClient client = newTC3Client();
        EndpointFailoverInterceptor it = new EndpointFailoverInterceptor(client);
        Request req = newTC3Request("cvm.tencentcloudapi.com");

        RecordingChain chain = new RecordingChain(req);
        chain.programDnsFailure();
        chain.programDnsFailure();
        chain.programDnsFailure();

        try {
            it.intercept(chain);
            fail("expected UnknownHostException");
        } catch (IOException e) {
            assertTrue("Expected UnknownHostException, got " + e.getClass().getName(),
                    e instanceof UnknownHostException);
        }
        assertEquals(3, chain.requests.size());
        assertEquals("cvm.tencentcloudapi.com", chain.requests.get(0).url().host());
        assertEquals("cvm.tencentcloudapi.cn", chain.requests.get(1).url().host());
        assertEquals("cvm.tencentcloudapi.com.cn", chain.requests.get(2).url().host());
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
        }

        {
            Request req = newTC3Request("cvm.tencentcloudapi.com");
            RecordingChain chain = new RecordingChain(req);
            chain.programSuccess();
            Response resp = it.intercept(chain);
            assertEquals(200, resp.code());
            assertEquals(1, chain.requests.size());
            assertEquals("cvm.tencentcloudapi.cn", chain.requests.get(0).url().host());
        }
    }

    @Test
    public void testResignPicksUpRotatedCredential() throws Exception {
        // Rotating the credential on the AbstractClient between initial sign and
        // failover resign should be reflected in the new Authorization header,
        // because the interceptor reads client.credential live.
        TestClient client = newTC3Client();
        EndpointFailoverInterceptor it = new EndpointFailoverInterceptor(client);
        Request req = newTC3Request("cvm.tencentcloudapi.com");
        String origAuth = req.header("Authorization");

        client.setCredential(new Credential("AKIDNEW", "SKNEW"));

        RecordingChain chain = new RecordingChain(req);
        chain.programDnsFailure();
        chain.programSuccess();

        it.intercept(chain);
        String resignedAuth = chain.requests.get(1).header("Authorization");
        assertNotNull(resignedAuth);
        assertNotEquals(origAuth, resignedAuth);
        assertTrue("resigned auth should use rotated secretId, got: " + resignedAuth,
                resignedAuth.contains("Credential=AKIDNEW/"));
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
    }

    // ---- Helpers ----

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
            programmed.add(new UnknownHostException("injected DNS failure"));
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
}
