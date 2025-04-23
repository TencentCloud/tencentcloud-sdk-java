package com.tencentcloudapi.integration.requests;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.cvm.v20170312.CvmClient;
import com.tencentcloudapi.cvm.v20170312.models.DescribeInstancesRequest;
import com.tencentcloudapi.cvm.v20170312.models.DescribeZonesRequest;
import org.junit.Test;

public class CvmTest {
    @Test
    public void TestDescribeInstances() throws TencentCloudSDKException {
        Credential cred = new Credential(
                System.getenv("TENCENTCLOUD_SECRET_ID"),
                System.getenv("TENCENTCLOUD_SECRET_KEY")
        );

        CvmClient client = new CvmClient(cred, "ap-guangzhou");
        DescribeInstancesRequest req = new DescribeInstancesRequest();
        client.DescribeInstances(req);
    }

    @Test
    public void TestDescribeZones() throws TencentCloudSDKException {
        Credential cred = new Credential(
                System.getenv("TENCENTCLOUD_SECRET_ID"),
                System.getenv("TENCENTCLOUD_SECRET_KEY")
        );

        CvmClient client = new CvmClient(cred, "ap-guangzhou");
        DescribeZonesRequest req = new DescribeZonesRequest();
        client.DescribeZones(req);
    }
}
