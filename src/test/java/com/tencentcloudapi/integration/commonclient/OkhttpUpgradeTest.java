package com.tencentcloudapi.integration.commonclient;

import com.tencentcloudapi.common.CommonClient;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import okhttp3.OkHttp;
import org.junit.Assert;
import org.junit.Test;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;

/**
 * 验证 okhttp 升级到 4.x 后核心功能正常
 * 运行前请设置环境变量:
 *   TENCENTCLOUD_SECRET_ID
 *   TENCENTCLOUD_SECRET_KEY
 */
public class OkhttpUpgradeTest {

    private Credential getCredential() {
        return new Credential(
                System.getenv("TENCENTCLOUD_SECRET_ID"),
                System.getenv("TENCENTCLOUD_SECRET_KEY"));
    }

    /**
     * 验证 okhttp 版本已升级到 4.x
     */
    @Test
    public void testOkhttpVersion() {
        String version = OkHttp.VERSION;
        System.out.println("OkHttp version: " + version);
        Assert.assertTrue("期望 okhttp 版本为 4.x，实际为: " + version,
                version.startsWith("4."));
    }

    /**
     * 基础 API 调用：DescribeInstances（验证 RequestBody.create 参数顺序修改后正常）
     */
    @Test
    public void testBasicApiCall() {
        Credential cred = getCredential();
        CommonClient client = new CommonClient("cvm", "2017-03-12", cred, "ap-guangzhou");
        try {
            String resp = client.call("DescribeInstances",
                    "{\"Filters\":[{\"Name\":\"zone\",\"Values\":[\"ap-guangzhou-1\"]}]}");
            System.out.println("DescribeInstances 响应: " + resp.substring(0, Math.min(200, resp.length())));
            Assert.assertTrue("响应中应包含 RequestId", resp.contains("RequestId"));
        } catch (TencentCloudSDKException e) {
            Assert.fail("API 调用失败: " + e.getMessage());
        }
    }

    /**
     * 验证 HTTPS 正常（默认 SSLSocketFactory，okhttp 4.x 默认连接）
     */
    @Test
    public void testHttpsCall() {
        Credential cred = getCredential();
        HttpProfile httpProfile = new HttpProfile();
        httpProfile.setProtocol("https://");
        ClientProfile clientProfile = new ClientProfile();
        clientProfile.setHttpProfile(httpProfile);

        CommonClient client = new CommonClient("cvm", "2017-03-12", cred, "ap-guangzhou", clientProfile);
        try {
            String resp = client.call("DescribeInstances", "{}");
            System.out.println("HTTPS 调用响应: " + resp.substring(0, Math.min(200, resp.length())));
            Assert.assertTrue("HTTPS 调用应包含 RequestId", resp.contains("RequestId"));
        } catch (TencentCloudSDKException e) {
            Assert.fail("HTTPS 调用失败: " + e.getMessage());
        }
    }

    /**
     * 验证仅设置 SSLSocketFactory（不传 TrustManager）时 okhttp 4.x 兼容性
     * AbstractClient 改动：自动获取默认 X509TrustManager，避免报错
     */
    @Test
    public void testSSLSocketFactoryOnlyCompat() throws NoSuchAlgorithmException, KeyManagementException {
        Credential cred = getCredential();

        // 只创建 SSLSocketFactory，不显式传 TrustManager（模拟旧调用方式）
        SSLContext sslContext = SSLContext.getInstance("TLS");
        sslContext.init(null, null, null); // 使用 JVM 默认 TrustManager
        SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();

        HttpProfile httpProfile = new HttpProfile();
        httpProfile.setSslSocketFactory(sslSocketFactory);
        // 注意：不调用 setX509TrustManager，测试 AbstractClient 的自动兜底逻辑
        ClientProfile clientProfile = new ClientProfile();
        clientProfile.setHttpProfile(httpProfile);

        CommonClient client = new CommonClient("cvm", "2017-03-12", cred, "ap-guangzhou", clientProfile);
        try {
            String resp = client.call("DescribeInstances", "{}");
            System.out.println("SSLSocketFactory-only 调用响应: " + resp.substring(0, Math.min(200, resp.length())));
            Assert.assertTrue("应包含 RequestId", resp.contains("RequestId"));
        } catch (TencentCloudSDKException e) {
            Assert.fail("SSLSocketFactory only 调用失败（兼容性回归）: " + e.getMessage());
        }
    }

    /**
     * 验证自定义 SSLSocketFactory + TrustManager（信任所有证书）调用正常
     */
    @Test
    public void testCustomSSLSocketFactory() throws Exception {
        Credential cred = getCredential();

        TrustManager[] trustAllCerts = new TrustManager[]{
                new X509TrustManager() {
                    public void checkClientTrusted(X509Certificate[] chain, String authType) {}
                    public void checkServerTrusted(X509Certificate[] chain, String authType) {}
                    public X509Certificate[] getAcceptedIssuers() { return new X509Certificate[0]; }
                }
        };
        SSLContext sslContext = SSLContext.getInstance("TLS");
        sslContext.init(null, trustAllCerts, new java.security.SecureRandom());
        SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();

        HttpProfile httpProfile = new HttpProfile();
        httpProfile.setSslSocketFactory(sslSocketFactory);
        httpProfile.setX509TrustManager((X509TrustManager) trustAllCerts[0]);
        ClientProfile clientProfile = new ClientProfile();
        clientProfile.setHttpProfile(httpProfile);

        CommonClient client = new CommonClient("cvm", "2017-03-12", cred, "ap-guangzhou", clientProfile);
        try {
            String resp = client.call("DescribeInstances", "{}");
            System.out.println("自定义 SSL 调用响应: " + resp.substring(0, Math.min(200, resp.length())));
            Assert.assertTrue("应包含 RequestId", resp.contains("RequestId"));
        } catch (TencentCloudSDKException e) {
            Assert.fail("自定义 SSL 调用失败: " + e.getMessage());
        }
    }

    /**
     * 验证 POST JSON 请求（覆盖 RequestBody.create(body, contentType) 调用路径）
     */
    @Test
    public void testPostJsonRequest() {
        Credential cred = getCredential();
        CommonClient client = new CommonClient("sts", "2018-08-13", cred, "ap-guangzhou");
        try {
            String resp = client.call("GetCallerIdentity", "{}");
            System.out.println("GetCallerIdentity 响应: " + resp.substring(0, Math.min(200, resp.length())));
            Assert.assertTrue("应包含 RequestId", resp.contains("RequestId"));
        } catch (TencentCloudSDKException e) {
            Assert.fail("POST JSON 请求失败: " + e.getMessage());
        }
    }
}
