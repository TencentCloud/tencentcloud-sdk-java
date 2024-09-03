package com.tencentcloudapi.unit.common;

import com.tencentcloudapi.common.*;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.http.HttpConnection;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import okhttp3.Headers;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import org.junit.Before;
import org.junit.Test;
import org.powermock.reflect.Whitebox;

import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Map;

import static com.tencentcloudapi.common.profile.Language.ZH_CN;


public class AbstractClientPrivateTest {
    private Credential credential;
    private ClientProfile clientProfile;
    private AbstractClient client;
    private String endpoint = "example.com";
    private String version = "v1";
    private String region = "ap-guangzhou";

    @Before
    public void setUp() {
        credential =
                new Credential(
                        System.getenv("TENCENTCLOUD_SECRET_ID"), System.getenv("TENCENTCLOUD_SECRET_KEY"), "123e4567-e89b-12d3-a456-426614174000");
        clientProfile = new ClientProfile();
    }

    @Test
    public void testAbstractClientGetHeaders() throws Exception {
        clientProfile.setUnsignedPayload(true);
        clientProfile.setLanguage(ZH_CN);
        client = new AbstractClient(endpoint, version, credential, region, clientProfile) {
        };

        HashMap map = Whitebox.invokeMethod(client, "getHeaders");
        assert "123e4567-e89b-12d3-a456-426614174000" == map.get("X-TC-Token");
        assert "zh-CN" == map.get("X-TC-Language");
        assert "UNSIGNED-PAYLOAD" == map.get("X-TC-Content-SHA256");
    }

    @Test
    public void testAbstractClientGetResponseBody() throws Exception {
        client = new AbstractClient(endpoint, version, credential, region, clientProfile) {
        };

        String url = "https://example.com/api";
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        byte[] body = "{\"key\":\"value\"}".getBytes();
        try {
            Whitebox.invokeMethod(client, "getResponseBody", url, headers, body);
        } catch (TencentCloudSDKException e) {
            assert e.getMessage().contains("404");
        }
    }

    @Test
    public void testAbstractClientTrySetProxy() throws Exception {
        HttpProfile httpProfile = new HttpProfile();
        httpProfile.setProxyHost("127.0.0.1");
        httpProfile.setProxyPort(80);
        httpProfile.setProxyUsername("user");
        httpProfile.setProxyPassword("pwd");
        clientProfile.setHttpProfile(httpProfile);
        client = new AbstractClient(endpoint, version, credential, region, clientProfile) {
        };

        HttpConnection conn = new HttpConnection(10, 10, 10);
        Object result = Whitebox.invokeMethod(client, "trySetProxy", conn);
        assert result == null;

        httpProfile.setProxyHost("");
        clientProfile.setHttpProfile(httpProfile);
        client = new AbstractClient(endpoint, version, credential, region, clientProfile) {
        };
        result = Whitebox.invokeMethod(client, "trySetProxy", conn);
        assert result == null;

        httpProfile.setProxyHost("127.0.0.1");
        httpProfile.setProxyUsername("");
        clientProfile.setHttpProfile(httpProfile);
        client = new AbstractClient(endpoint, version, credential, region, clientProfile) {
        };
        result = Whitebox.invokeMethod(client, "trySetProxy", conn);
        assert result == null;
    }

    @Test
    public void testAbstractClientTrySetSSLSocketFactory() throws Exception {
        HttpProfile httpProfile = new HttpProfile();
        SSLSocketFactory factory = new SSLSocketFactory() {
            @Override
            public String[] getDefaultCipherSuites() {
                return new String[0];
            }

            @Override
            public String[] getSupportedCipherSuites() {
                return new String[0];
            }

            @Override
            public Socket createSocket(Socket socket, String s, int i, boolean b) throws IOException {
                return null;
            }

            @Override
            public Socket createSocket(String s, int i) throws IOException, UnknownHostException {
                return null;
            }

            @Override
            public Socket createSocket(String s, int i, InetAddress inetAddress, int i1) throws IOException, UnknownHostException {
                return null;
            }

            @Override
            public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
                return null;
            }

            @Override
            public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress1, int i1) throws IOException {
                return null;
            }
        };
        httpProfile.setSslSocketFactory(factory);
        X509TrustManager trustManager = new X509TrustManager() {
            @Override
            public void checkClientTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {
            }

            @Override
            public void checkServerTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {
            }

            @Override
            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }
        };
        httpProfile.setX509TrustManager(trustManager);
        clientProfile.setHttpProfile(httpProfile);

        HttpConnection conn = new HttpConnection(10, 10, 10);
        client = new AbstractClient(endpoint, version, credential, region, clientProfile) {
        };

        Whitebox.invokeMethod(client, "trySetSSLSocketFactory", conn);
    }

    @Test
    public void testAbstractClientTrySetHostnameVerifier() throws Exception {
        HttpProfile httpProfile = new HttpProfile();
        httpProfile.setHostnameVerifier((s, sslSession) -> true);
        clientProfile.setHttpProfile(httpProfile);
        client = new AbstractClient(endpoint, version, credential, region, clientProfile) {
        };

        HttpConnection conn = new HttpConnection(10, 10, 10);
        Whitebox.invokeMethod(client, "trySetHostnameVerifier", conn);
    }

    @Test
    public void testAbstractClientTrySetRegionBreaker() throws Exception {
        clientProfile.setBackupEndpoint("example.com");
        client = new AbstractClient(endpoint, version, credential, region, clientProfile) {
        };

        Whitebox.invokeMethod(client, "trySetRegionBreaker");
    }

    @Test
    public void testAbstractClientProcessResponseSSE() throws Exception {
        // 创建一个Response实例
        Request request = new Request.Builder()
                .url("https://example.com")
                .build();

        Headers headers = new Headers.Builder()
                .add("Content-Type", "application/json")
                .build();

        Response.Builder builder = new Response.Builder()
                .request(request) // 设置请求对象
                .protocol(Protocol.HTTP_2) // 设置协议版本，这里以HTTP/2为例
                .code(200) // 设置响应码
                .message("OK") // 设置响应消息
                .headers(headers) // 设置响应头
                .body(null) // 设置响应体，这里假设响应体为空
                .networkResponse(null) // 设置网络响应，这里假设没有网络响应
                .cacheResponse(null) // 设置缓存响应，这里假设没有缓存响应
                .priorResponse(null) // 设置之前的响应，这里假设没有之前的响应
                .sentRequestAtMillis(System.currentTimeMillis()) // 设置请求发送的时间戳
                .receivedResponseAtMillis(System.currentTimeMillis()); // 设置响应接收的时间戳
        builder.header("X-TC-RequestId", "123e4567-e89b-12d3");

        Response resp = builder.build();
        // 创建Token实例
        CircuitBreaker circuitBreaker = new CircuitBreaker();
        CircuitBreaker.Token token = circuitBreaker.allow();

        client = new AbstractClient(endpoint, version, credential, region, clientProfile) {
        };
        Class<CommonSSEResponse> typeOfT = CommonSSEResponse.class;

        Whitebox.invokeMethod(client, "processResponseSSE", resp, typeOfT, token);

        try {
            Whitebox.invokeMethod(client, "processResponseSSE", resp, SSEResponseModel.class, token);
        } catch (Exception e) {}

        CommonSSEResponse sse = new CommonSSEResponse();
        sse.setRequestId("123e4567-e89b-12d3");
        assert sse.getRequestId().equals("123e4567-e89b-12d3");
    }

    @Test
    public void testAbstractClientGetMultipartPayload() throws Exception {
        AbstractModel request = new AbstractModel() {
            @Override
            protected void toMap(HashMap<String, String> map, String prefix) {
            }

            @Override
            protected HashMap<String, byte[]> getMultipartRequestParams() {
                HashMap<String, byte[]> map = new HashMap<>();
                map.put("key", "value".getBytes());
                return map;
            }

            @Override
            protected String[] getBinaryParams() {
                String[] strings = new String[1];
                strings[0] = "key";
                return strings;
            }
        };
        String boundary = "boundary";
        client = new AbstractClient(endpoint, version, credential, region, clientProfile) {
        };

        Whitebox.invokeMethod(client, "getMultipartPayload", request, boundary);
    }

    @Test
    public void testAbstractClientRetry() {
        client = new AbstractClient(endpoint, version, credential, region, clientProfile) {
        };
        client.setRegionBreaker(new CircuitBreaker());
        client.getRegionBreaker();

        try {
            client.retry(null, -1);
        } catch (TencentCloudSDKException e) {
            assert e.getMessage().contains("The number of retryTimes supported is 0 to 10.");
        }

        class getRegionBreakerRequest extends AbstractModel {
            getRegionBreakerRequest() {
            }

            @Override
            protected void toMap(HashMap<String, String> map, String prefix) {
            }
        }
        try {
            client.retry(new getRegionBreakerRequest(), 0);
        } catch (TencentCloudSDKException e) {
            assert e.getMessage().contains("ClientSideError");
        }
    }
}









