package com.tencentcloudapi.integration.common;

import com.tencentcloudapi.common.CommonClient;
import com.tencentcloudapi.common.Credential;
import org.junit.Test;

import static org.junit.Assert.fail;

public class DaemonThreadTest {

    @Test
    // ensure OkHttp threads are daemon to allow clean JVM shutdown
    public void testOkhttpUseDaemonThread() {
        Credential cred = new Credential(
                System.getenv("TENCENTCLOUD_SECRET_ID"),
                System.getenv("TENCENTCLOUD_SECRET_KEY")
        );
        CommonClient client = new CommonClient("cvm", "2017-03-12", cred, "ap-guangzhou");
        try {
            client.call(
                    "DescribeInstances",
                    "{\"Limit\": 1, \"Filters\":[{\"Name\":\"zone\",\"Values\":[\"ap-guangzhou-1\"]}]}");
        } catch (Exception e) {
            fail(e.toString());
        }

        for (Thread t : Thread.getAllStackTraces().keySet()) {
            if (t.getName().startsWith("OkHttp") && !t.isDaemon()) {
                fail("thread should be daemon: " + t.getName());
            }
        }
    }
}
