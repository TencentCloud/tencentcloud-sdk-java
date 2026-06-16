package com.tencentcloudapi.integration.okhttp4;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.cvm.v20170312.CvmClient;
import com.tencentcloudapi.cvm.v20170312.models.DescribeInstancesRequest;
import com.tencentcloudapi.cvm.v20170312.models.DescribeInstancesResponse;
import com.tencentcloudapi.cvm.v20170312.models.DescribeZonesRequest;
import com.tencentcloudapi.cvm.v20170312.models.DescribeZonesResponse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import java.security.KeyStore;

/**
 * okhttp 4.x 升级验证测试
 *
 * 覆盖场景：
 *   TC1 - 默认配置 POST TC3-HMAC-SHA256（最常用路径）
 *   TC2 - GET + HmacSHA256（旧签名方式）
 *   TC3 - GET + TC3-HMAC-SHA256
 *   TC4 - POST + HmacSHA1（旧签名方式）
 *   TC5 - 自定义 SSLSocketFactory + X509TrustManager（okhttp4 新 API）
 *   TC6 - 只设置 SSLSocketFactory 不设 TrustManager（向后兼容兜底逻辑）
 *   TC7 - 自定义 HostnameVerifier
 *   TC8 - HTTPS 协议显式指定
 *
 * 运行方式（在外部仓根目录）：
 *   mvn test -pl . -Dtest=Okhttp4UpgradeTest \
 *       -DTENCENTCLOUD_SECRET_ID=your_id \
 *       -DTENCENTCLOUD_SECRET_KEY=your_key
 *
 * 或通过环境变量：
 *   export TENCENTCLOUD_SECRET_ID=your_id
 *   export TENCENTCLOUD_SECRET_KEY=your_key
 *   mvn test -Dtest=Okhttp4UpgradeTest
 */
public class Okhttp4UpgradeTest {

    private static final String REGION = "ap-guangzhou";

    private String secretId;
    private String secretKey;

    @Before
    public void setUp() {
        secretId  = getEnvOrProp("TENCENTCLOUD_SECRET_ID");
        secretKey = getEnvOrProp("TENCENTCLOUD_SECRET_KEY");
        if (secretId == null || secretId.isEmpty() || secretKey == null || secretKey.isEmpty()) {
            throw new IllegalStateException(
                "请设置环境变量 TENCENTCLOUD_SECRET_ID 和 TENCENTCLOUD_SECRET_KEY");
        }
    }

    // -------------------------------------------------------------------------
    // TC1: 默认配置 POST TC3-HMAC-SHA256
    // -------------------------------------------------------------------------
    @Test
    public void TC1_DefaultPostTC3() throws TencentCloudSDKException {
        System.out.println("[TC1] POST TC3-HMAC-SHA256 (default)");

        CvmClient client = new CvmClient(credential(), REGION);
        DescribeZonesResponse resp = client.DescribeZones(new DescribeZonesRequest());

        Assert.assertNotNull("Response should not be null", resp);
        Assert.assertTrue("TotalCount >= 0", resp.getTotalCount() >= 0);
        System.out.println("[TC1] PASS — TotalCount=" + resp.getTotalCount());
    }

    // -------------------------------------------------------------------------
    // TC2: GET + HmacSHA256（验证 RequestBody.create 参数顺序调整不影响 GET）
    // -------------------------------------------------------------------------
    @Test
    public void TC2_GetHmacSHA256() throws TencentCloudSDKException {
        System.out.println("[TC2] GET HmacSHA256");

        HttpProfile hp = new HttpProfile();
        hp.setReqMethod("GET");
        ClientProfile cp = new ClientProfile();
        cp.setSignMethod("HmacSHA256");
        cp.setHttpProfile(hp);

        CvmClient client = new CvmClient(credential(), REGION, cp);
        DescribeInstancesResponse resp = client.DescribeInstances(new DescribeInstancesRequest());

        Assert.assertNotNull(resp);
        Assert.assertTrue(resp.getTotalCount() >= 0);
        System.out.println("[TC2] PASS — TotalCount=" + resp.getTotalCount());
    }

    // -------------------------------------------------------------------------
    // TC3: GET + TC3-HMAC-SHA256
    // -------------------------------------------------------------------------
    @Test
    public void TC3_GetTC3() throws TencentCloudSDKException {
        System.out.println("[TC3] GET TC3-HMAC-SHA256");

        HttpProfile hp = new HttpProfile();
        hp.setReqMethod("GET");
        ClientProfile cp = new ClientProfile();
        cp.setSignMethod("TC3-HMAC-SHA256");
        cp.setHttpProfile(hp);

        CvmClient client = new CvmClient(credential(), REGION, cp);
        DescribeInstancesResponse resp = client.DescribeInstances(new DescribeInstancesRequest());

        Assert.assertNotNull(resp);
        Assert.assertTrue(resp.getTotalCount() >= 0);
        System.out.println("[TC3] PASS — TotalCount=" + resp.getTotalCount());
    }

    // -------------------------------------------------------------------------
    // TC4: POST + HmacSHA1
    // -------------------------------------------------------------------------
    @Test
    public void TC4_PostHmacSHA1() throws TencentCloudSDKException {
        System.out.println("[TC4] POST HmacSHA1");

        HttpProfile hp = new HttpProfile();
        hp.setReqMethod("POST");
        ClientProfile cp = new ClientProfile();
        cp.setSignMethod("HmacSHA1");
        cp.setHttpProfile(hp);

        CvmClient client = new CvmClient(credential(), REGION, cp);
        DescribeInstancesResponse resp = client.DescribeInstances(new DescribeInstancesRequest());

        Assert.assertNotNull(resp);
        Assert.assertTrue(resp.getTotalCount() >= 0);
        System.out.println("[TC4] PASS — TotalCount=" + resp.getTotalCount());
    }

    // -------------------------------------------------------------------------
    // TC5: 自定义 SSLSocketFactory + X509TrustManager（okhttp4 标准用法）
    // 验证：setSSLSocketFactory(factory, trustManager) 双参数路径正常
    // -------------------------------------------------------------------------
    @Test
    public void TC5_CustomSSLWithTrustManager() throws Exception {
        System.out.println("[TC5] Custom SSLSocketFactory + X509TrustManager");

        TrustManagerFactory tmf = TrustManagerFactory.getInstance(
                TrustManagerFactory.getDefaultAlgorithm());
        tmf.init((KeyStore) null);
        X509TrustManager tm = findX509TrustManager(tmf.getTrustManagers());
        Assert.assertNotNull("Should find X509TrustManager", tm);

        SSLContext sslCtx = SSLContext.getInstance("TLS");
        sslCtx.init(null, new TrustManager[]{tm}, null);

        HttpProfile hp = new HttpProfile();
        hp.setSslSocketFactory(sslCtx.getSocketFactory());
        hp.setX509TrustManager(tm);
        ClientProfile cp = new ClientProfile();
        cp.setHttpProfile(hp);

        CvmClient client = new CvmClient(credential(), REGION, cp);
        DescribeZonesResponse resp = client.DescribeZones(new DescribeZonesRequest());

        Assert.assertNotNull(resp);
        Assert.assertTrue(resp.getTotalCount() >= 0);
        System.out.println("[TC5] PASS — TotalCount=" + resp.getTotalCount());
    }

    // -------------------------------------------------------------------------
    // TC6: 只设置 SSLSocketFactory，不设 X509TrustManager
    // 验证：AbstractClient.trySetSSLSocketFactory() 兜底逻辑（从 JVM 默认取 TrustManager）
    // 这是本次升级的核心向后兼容路径
    // -------------------------------------------------------------------------
    @Test
    public void TC6_SSLSocketFactoryWithoutTrustManager() throws Exception {
        System.out.println("[TC6] SSLSocketFactory only (backward compat fallback)");

        TrustManagerFactory tmf = TrustManagerFactory.getInstance(
                TrustManagerFactory.getDefaultAlgorithm());
        tmf.init((KeyStore) null);
        X509TrustManager tm = findX509TrustManager(tmf.getTrustManagers());

        SSLContext sslCtx = SSLContext.getInstance("TLS");
        sslCtx.init(null, new TrustManager[]{tm}, null);

        HttpProfile hp = new HttpProfile();
        hp.setSslSocketFactory(sslCtx.getSocketFactory());
        // 故意不调用 hp.setX509TrustManager()，触发兜底逻辑
        ClientProfile cp = new ClientProfile();
        cp.setHttpProfile(hp);

        CvmClient client = new CvmClient(credential(), REGION, cp);
        DescribeZonesResponse resp = client.DescribeZones(new DescribeZonesRequest());

        Assert.assertNotNull(resp);
        Assert.assertTrue(resp.getTotalCount() >= 0);
        System.out.println("[TC6] PASS — fallback TrustManager worked, TotalCount=" + resp.getTotalCount());
    }

    // -------------------------------------------------------------------------
    // TC7: 自定义 HostnameVerifier
    // -------------------------------------------------------------------------
    @Test
    public void TC7_CustomHostnameVerifier() throws TencentCloudSDKException {
        System.out.println("[TC7] Custom HostnameVerifier");

        HttpProfile hp = new HttpProfile();
        hp.setHostnameVerifier((hostname, session) -> {
            System.out.println("[TC7] verifying hostname: " + hostname);
            return true;
        });
        ClientProfile cp = new ClientProfile();
        cp.setHttpProfile(hp);

        CvmClient client = new CvmClient(credential(), REGION, cp);
        DescribeZonesResponse resp = client.DescribeZones(new DescribeZonesRequest());

        Assert.assertNotNull(resp);
        Assert.assertTrue(resp.getTotalCount() >= 0);
        System.out.println("[TC7] PASS — TotalCount=" + resp.getTotalCount());
    }

    // -------------------------------------------------------------------------
    // TC8: 显式指定 HTTPS 协议
    // -------------------------------------------------------------------------
    @Test
    public void TC8_ExplicitHttps() throws TencentCloudSDKException {
        System.out.println("[TC8] Explicit HTTPS protocol");

        HttpProfile hp = new HttpProfile();
        hp.setProtocol("https://");
        ClientProfile cp = new ClientProfile();
        cp.setHttpProfile(hp);

        CvmClient client = new CvmClient(credential(), REGION, cp);
        DescribeZonesResponse resp = client.DescribeZones(new DescribeZonesRequest());

        Assert.assertNotNull(resp);
        Assert.assertTrue(resp.getTotalCount() >= 0);
        System.out.println("[TC8] PASS — TotalCount=" + resp.getTotalCount());
    }

    // -------------------------------------------------------------------------
    // 工具方法
    // -------------------------------------------------------------------------
    private Credential credential() {
        return new Credential(secretId, secretKey);
    }

    private static String getEnvOrProp(String key) {
        String val = System.getenv(key);
        if (val != null && !val.isEmpty()) return val;
        return System.getProperty(key);
    }

    private static X509TrustManager findX509TrustManager(TrustManager[] managers) {
        for (TrustManager tm : managers) {
            if (tm instanceof X509TrustManager) return (X509TrustManager) tm;
        }
        return null;
    }
}
