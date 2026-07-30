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
package com.tencentcloudapi.common.http;

import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.junit.Test;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import java.io.IOException;
import java.net.Proxy;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Tests for {@link HttpConnection}.
 *
 * <p>Uses an OkHttp application interceptor stub to capture the {@link Request}
 * that {@link HttpConnection} builds (verifying url/method/body/headers) and
 * to short-circuit the call with a canned {@link Response} — no real network
 * is involved.
 */
public class HttpConnectionTest {

    // =================================================================
    //  Constructor / timeouts
    // =================================================================

    @Test
    public void testConstructorAppliesTimeouts() {
        HttpConnection conn = new HttpConnection(3, 7, 11);
        OkHttpClient client = (OkHttpClient) conn.getHttpClient();
        // OkHttp exposes timeouts in milliseconds.
        assertEquals(3000, client.connectTimeoutMillis());
        assertEquals(7000, client.readTimeoutMillis());
        assertEquals(11000, client.writeTimeoutMillis());
    }

    // =================================================================
    //  Interceptors
    // =================================================================

    @Test
    public void testAddInterceptorsPreservesOrder() {
        HttpConnection conn = new HttpConnection(1, 1, 1);
        Interceptor a = new NoopInterceptor();
        Interceptor b = new NoopInterceptor();
        conn.addInterceptors(a);
        conn.addInterceptors(b);
        List<Interceptor> list = conn.getInterceptors();
        // Application interceptors are appended in add order.
        assertTrue("first interceptor should be a", list.contains(a));
        assertTrue("second interceptor should be b", list.contains(b));
        assertEquals(a, list.get(list.size() - 2));
        assertEquals(b, list.get(list.size() - 1));
    }

    // =================================================================
    //  Proxy / SSL / HostnameVerifier configuration
    // =================================================================

    @Test
    public void testSetProxyAppliesToClient() {
        HttpConnection conn = new HttpConnection(1, 1, 1);
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new java.net.InetSocketAddress("127.0.0.1", 8888));
        conn.setProxy(proxy);
        OkHttpClient client = (OkHttpClient) conn.getHttpClient();
        assertEquals(proxy, client.proxy());
    }

    @Test
    public void testSetHostnameVerifierAppliesToClient() {
        HttpConnection conn = new HttpConnection(1, 1, 1);
        HostnameVerifier verifier = new HostnameVerifier() {
            @Override
            public boolean verify(String hostname, SSLSession session) {
                return true;
            }
        };
        conn.setHostnameVerifier(verifier);
        OkHttpClient client = (OkHttpClient) conn.getHttpClient();
        assertSame(verifier, client.hostnameVerifier());
    }

    /**
     * Configuration calls chain: each {@code newBuilder().build()} carries
     * forward previously set config. Verify proxy survives a subsequent
     * hostname-verifier set.
     */
    @Test
    public void testConfigChainingPreservesPriorSettings() {
        HttpConnection conn = new HttpConnection(1, 1, 1);
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new java.net.InetSocketAddress("127.0.0.1", 8888));
        conn.setProxy(proxy);
        conn.setHostnameVerifier(new HostnameVerifier() {
            @Override
            public boolean verify(String h, SSLSession s) { return true; }
        });
        OkHttpClient client = (OkHttpClient) conn.getHttpClient();
        assertEquals("proxy must survive a later newBuilder().build()",
                proxy, client.proxy());
        assertNotNull("hostnameVerifier must also be set",
                client.hostnameVerifier());
    }

    // =================================================================
    //  getRequest
    // =================================================================

    @Test
    public void testGetRequestBuildsGetWithUrl() throws Exception {
        CapturingInterceptor cap = new CapturingInterceptor();
        HttpConnection conn = newConnectionWith(cap);
        conn.getRequest("https://example.com/path?q=1");
        assertNotNull(cap.seen);
        assertEquals("GET", cap.seen.method());
        assertEquals("https://example.com/path?q=1", cap.seen.url().toString());
    }

    @Test
    public void testGetRequestWithHeadersCarriesHeaders() throws Exception {
        CapturingInterceptor cap = new CapturingInterceptor();
        HttpConnection conn = newConnectionWith(cap);
        Headers headers = new Headers.Builder()
                .add("X-TC-Action", "DescribeInstances")
                .add("X-TC-Region", "ap-guangzhou")
                .build();
        conn.getRequest("https://example.com/", headers);
        assertEquals("DescribeInstances", cap.seen.header("X-TC-Action"));
        assertEquals("ap-guangzhou", cap.seen.header("X-TC-Region"));
    }

    @Test
    public void testGetRequestIllegalUrlThrowsTencentCloudSdkException() {
        HttpConnection conn = new HttpConnection(1, 1, 1);
        try {
            conn.getRequest("not a url");
            fail("expected TencentCloudSDKException for illegal url");
        } catch (TencentCloudSDKException e) {
            assertTrue("message should mention IllegalArgumentException, got: " + e.getMessage(),
                    e.getMessage().contains("IllegalArgumentException"));
        } catch (IOException e) {
            fail("expected TencentCloudSDKException, got IOException: " + e);
        }
    }

    // =================================================================
    //  postRequest
    // =================================================================

    @Test
    public void testPostRequestStringBodyDefaultsFormUrlencoded() throws Exception {
        CapturingInterceptor cap = new CapturingInterceptor();
        HttpConnection conn = newConnectionWith(cap);
        conn.postRequest("https://example.com/", "a=1&b=2");
        assertEquals("POST", cap.seen.method());
        assertEquals("https://example.com/", cap.seen.url().toString());
        MediaType ct = cap.seen.body().contentType();
        assertNotNull(ct);
        assertEquals("application/x-www-form-urlencoded", ct.type() + "/" + ct.subtype());
    }

    @Test
    public void testPostRequestStringBodyWithHeadersUsesContentType() throws Exception {
        CapturingInterceptor cap = new CapturingInterceptor();
        HttpConnection conn = newConnectionWith(cap);
        Headers headers = new Headers.Builder()
                .add("Content-Type", "application/json")
                .add("X-TC-Action", "CallJson")
                .build();
        conn.postRequest("https://example.com/", "{\"k\":\"v\"}", headers);
        assertEquals("POST", cap.seen.method());
        MediaType ct = cap.seen.body().contentType();
        assertNotNull(ct);
        assertEquals("application/json", ct.type() + "/" + ct.subtype());
        assertEquals("CallJson", cap.seen.header("X-TC-Action"));
    }

    @Test
    public void testPostRequestByteBodyWithHeaders() throws Exception {
        CapturingInterceptor cap = new CapturingInterceptor();
        HttpConnection conn = newConnectionWith(cap);
        Headers headers = new Headers.Builder()
                .add("Content-Type", "application/octet-stream")
                .build();
        byte[] body = {1, 2, 3, 4};
        conn.postRequest("https://example.com/", body, headers);
        assertEquals("POST", cap.seen.method());
        MediaType ct = cap.seen.body().contentType();
        assertNotNull(ct);
        assertEquals("application/octet-stream", ct.type() + "/" + ct.subtype());
        // Body length preserved.
        assertEquals(4, cap.seen.body().contentLength());
    }

    @Test
    public void testPostRequestIllegalUrlThrowsTencentCloudSdkException() {
        HttpConnection conn = new HttpConnection(1, 1, 1);
        try {
            conn.postRequest("::not a url::", "body");
            fail("expected TencentCloudSDKException for illegal url");
        } catch (TencentCloudSDKException e) {
            assertTrue(e.getMessage().contains("IllegalArgumentException"));
        } catch (IOException e) {
            fail("expected TencentCloudSDKException, got IOException: " + e);
        }
    }

    // =================================================================
    //  doRequest
    // =================================================================

    @Test
    public void testDoRequestExecutesAndReturnsResponse() throws Exception {
        CapturingInterceptor cap = new CapturingInterceptor();
        HttpConnection conn = newConnectionWith(cap);
        Request req = new Request.Builder().url("https://example.com/").build();
        Response resp = conn.doRequest(req);
        assertNotNull(resp);
        assertEquals(200, resp.code());
        assertNotNull(cap.seen);
        assertEquals("https://example.com/", cap.seen.url().toString());
        resp.close();
    }

    // =================================================================
    //  setHttpClient / getHttpClient round-trip
    // =================================================================

    @Test
    public void testSetGetHttpClientRoundTrip() {
        HttpConnection conn = new HttpConnection(1, 1, 1);
        OkHttpClient custom = new OkHttpClient();
        conn.setHttpClient(custom);
        assertSame(custom, conn.getHttpClient());
    }

    // =================================================================
    //  Helpers
    // =================================================================

    /** Builds an HttpConnection and inserts the capturing interceptor as the last app interceptor. */
    private static HttpConnection newConnectionWith(CapturingInterceptor cap) {
        HttpConnection conn = new HttpConnection(1, 1, 1);
        conn.addInterceptors(cap);
        return conn;
    }

    /** A no-op interceptor that just proceeds. */
    private static final class NoopInterceptor implements Interceptor {
        @Override
        public Response intercept(Chain chain) throws IOException {
            return chain.proceed(chain.request());
        }
    }

    /**
     * Captures the request handed to {@code chain.proceed} and returns a canned
     * 200 response, short-circuiting the network.
     */
    private static final class CapturingInterceptor implements Interceptor {
        Request seen;

        @Override
        public Response intercept(Chain chain) throws IOException {
            seen = chain.request();
            return new Response.Builder()
                    .request(seen)
                    .protocol(Protocol.HTTP_1_1)
                    .code(200)
                    .message("OK")
                    .body(ResponseBody.create(null, ""))
                    .build();
        }
    }
}
