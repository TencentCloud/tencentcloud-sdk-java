package com.tencentcloudapi.integration.requests;

import com.tencentcloudapi.common.CommonClient;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.cvm.v20170312.models.DescribeInstancesRequest;
import org.junit.Test;

public class CommonClientTest {
    @Test
    public void TestCall() throws TencentCloudSDKException {
        Credential cred = new Credential(
                System.getenv("TENCENTCLOUD_SECRET_ID"),
                System.getenv("TENCENTCLOUD_SECRET_KEY")
        );

        CommonClient client = new CommonClient("cvm", "2017-03-12", cred, "ap-guangzhou");

        client.call("DescribeInstances",
                "{\"Filters\":"
                        + "[{\"Name\":\"zone\","
                        + "\"Values\":[\"ap-guangzhou-1\"]},"
                        + "{\"Name\":\"instance-charge-type\","
                        + "\"Values\":[\"PREPAID\",\"POSTPAID_BY_HOUR\"]}]"
                        + "}");
    }

    @Test
    public void TestCommonRequest() throws TencentCloudSDKException {
        Credential cred = new Credential(
                System.getenv("TENCENTCLOUD_SECRET_ID"),
                System.getenv("TENCENTCLOUD_SECRET_KEY")
        );

        CommonClient client = new CommonClient("cvm", "2017-03-12", cred, "ap-guangzhou");

        DescribeInstancesRequest req = new DescribeInstancesRequest();
        client.commonRequest(req, "DescribeInstances");
    }
}
