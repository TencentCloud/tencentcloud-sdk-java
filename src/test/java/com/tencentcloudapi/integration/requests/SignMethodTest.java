package com.tencentcloudapi.integration.requests;

import com.tencentcloudapi.common.CommonClient;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.cvm.v20170312.CvmClient;
import com.tencentcloudapi.cvm.v20170312.models.DescribeInstancesRequest;
import org.junit.Test;

public class SignMethodTest {
    @Test
    public void TestCvmClient() throws TencentCloudSDKException {
        Credential cred = new Credential(
                System.getenv("TENCENTCLOUD_SECRET_ID"),
                System.getenv("TENCENTCLOUD_SECRET_KEY")
        );

        String[] signMethods = new String[]{
                ClientProfile.SIGN_SHA1,
                ClientProfile.SIGN_SHA256,
                ClientProfile.SIGN_TC3_256
        };
        String[] reqMethods = new String[]{
                HttpProfile.REQ_POST,
                HttpProfile.REQ_GET,
        };

        for (String signMethod : signMethods) {
            for (String reqMethod : reqMethods) {
                ClientProfile cpf = new ClientProfile();
                cpf.setSignMethod(signMethod);
                HttpProfile hpf = new HttpProfile();
                hpf.setReqMethod(reqMethod);
                cpf.setHttpProfile(hpf);

                CvmClient client = new CvmClient(cred, "ap-guangzhou", cpf);
                DescribeInstancesRequest req = new DescribeInstancesRequest();
                client.DescribeInstances(req);
            }
        }
    }

    @Test
    public void TestCommonClient() throws TencentCloudSDKException {
        Credential cred = new Credential(
                System.getenv("TENCENTCLOUD_SECRET_ID"),
                System.getenv("TENCENTCLOUD_SECRET_KEY")
        );

        String[] signMethods = new String[]{
                ClientProfile.SIGN_SHA1,
                ClientProfile.SIGN_SHA256,
                ClientProfile.SIGN_TC3_256
        };
        String[] reqMethods = new String[]{
                HttpProfile.REQ_POST,
                HttpProfile.REQ_GET,
        };

        for (String signMethod : signMethods) {
            for (String reqMethod : reqMethods) {
                ClientProfile cpf = new ClientProfile();
                cpf.setSignMethod(signMethod);
                HttpProfile hpf = new HttpProfile();
                hpf.setReqMethod(reqMethod);
                cpf.setHttpProfile(hpf);

                CommonClient client = new CommonClient("cvm", "2017-03-12", cred, "ap-guangzhou");
                DescribeInstancesRequest req = new DescribeInstancesRequest();
                client.commonRequest(req, "DescribeInstances");
            }
        }
    }

    @Test
    public void TestCommonClientCall() throws TencentCloudSDKException {
        Credential cred = new Credential(
                System.getenv("TENCENTCLOUD_SECRET_ID"),
                System.getenv("TENCENTCLOUD_SECRET_KEY")
        );

        String[] signMethods = new String[]{
                ClientProfile.SIGN_SHA1,
                ClientProfile.SIGN_SHA256,
                ClientProfile.SIGN_TC3_256
        };
        String[] reqMethods = new String[]{
                HttpProfile.REQ_POST,
                HttpProfile.REQ_GET,
        };

        for (String signMethod : signMethods) {
            for (String reqMethod : reqMethods) {
                ClientProfile cpf = new ClientProfile();
                cpf.setSignMethod(signMethod);
                HttpProfile hpf = new HttpProfile();
                hpf.setReqMethod(reqMethod);
                cpf.setHttpProfile(hpf);

                CommonClient client = new CommonClient("cvm", "2017-03-12", cred, "ap-guangzhou");
                client.call("DescribeInstances",
                        "{\"Filters\":"
                                + "[{\"Name\":\"zone\","
                                + "\"Values\":[\"ap-guangzhou-1\"]},"
                                + "{\"Name\":\"instance-charge-type\","
                                + "\"Values\":[\"PREPAID\",\"POSTPAID_BY_HOUR\"]}]"
                                + "}");
            }
        }
    }
}
