package com.tencentcloudapi.integration.common;

import com.tencentcloudapi.common.CircuitBreaker;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.cvm.v20170312.CvmClient;
import com.tencentcloudapi.cvm.v20170312.models.DescribeInstancesRequest;
import com.tencentcloudapi.cvm.v20170312.models.DescribeInstancesResponse;
import org.junit.Assert;
import org.junit.Test;

public class CircuitBreakerTest {

    @Test
    public void testSuccess5() {
        CircuitBreaker.Setting setting = new CircuitBreaker.Setting();
        CircuitBreaker cb = new CircuitBreaker(setting);
        CircuitBreaker.Token t;

        t = cb.allow();
        Assert.assertTrue(t.allowed);
        t.report(true);

        t = cb.allow();
        Assert.assertTrue(t.allowed);
        t.report(true);

        t = cb.allow();
        Assert.assertTrue(t.allowed);
        t.report(true);

        t = cb.allow();
        Assert.assertTrue(t.allowed);
        t.report(true);

        t = cb.allow();
        Assert.assertTrue(t.allowed);
        t.report(true);
    }

    @Test
    public void testFail5() {
        CircuitBreaker.Setting setting = new CircuitBreaker.Setting();
        CircuitBreaker cb = new CircuitBreaker(setting);
        CircuitBreaker.Token t;

        t = cb.allow();
        Assert.assertTrue(t.allowed);
        t.report(false);

        t = cb.allow();
        Assert.assertTrue(t.allowed);
        t.report(false);

        t = cb.allow();
        Assert.assertTrue(t.allowed);
        t.report(false);

        t = cb.allow();
        Assert.assertTrue(t.allowed);
        t.report(false);

        t = cb.allow();
        Assert.assertTrue(t.allowed);
        t.report(false);

        t = cb.allow();
        Assert.assertFalse(t.allowed);
        t.report(false);
    }

    @Test
    public void testFail5Recover() {
        CircuitBreaker.Setting setting = new CircuitBreaker.Setting();
        CircuitBreaker cb = new CircuitBreaker(setting);
        CircuitBreaker.Token t;

        t = cb.allow();
        Assert.assertTrue(t.allowed);
        t.report(false);

        t = cb.allow();
        Assert.assertTrue(t.allowed);
        t.report(false);

        t = cb.allow();
        Assert.assertTrue(t.allowed);
        t.report(false);

        t = cb.allow();
        Assert.assertTrue(t.allowed);
        t.report(false);

        t = cb.allow();
        Assert.assertTrue(t.allowed);
        t.report(false);

        t = cb.allow();
        Assert.assertFalse(t.allowed);
        t.report(true);

        t = cb.allow();
        Assert.assertFalse(t.allowed);
        t.report(false);
    }

    @Test
    public void testFail5Recover2() throws InterruptedException {
        CircuitBreaker.Setting setting = new CircuitBreaker.Setting();
        setting.timeoutMs = 100;
        CircuitBreaker cb = new CircuitBreaker(setting);
        CircuitBreaker.Token t;

        t = cb.allow();
        Assert.assertTrue(t.allowed);
        t.report(false);

        t = cb.allow();
        Assert.assertTrue(t.allowed);
        t.report(false);

        t = cb.allow();
        Assert.assertTrue(t.allowed);
        t.report(false);

        t = cb.allow();
        Assert.assertTrue(t.allowed);
        t.report(false);

        t = cb.allow();
        Assert.assertTrue(t.allowed);
        t.report(false);

        t = cb.allow();
        Assert.assertFalse(t.allowed);
        t.report(true);

        Thread.sleep(setting.timeoutMs + 10);

        t = cb.allow();
        Assert.assertTrue(t.allowed);
        t.report(false);
    }
}
