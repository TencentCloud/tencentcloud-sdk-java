package com.tencentcloudapi.integration.requests;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.cvm.v20170312.CvmClient;
import com.tencentcloudapi.cvm.v20170312.models.DescribeInstancesRequest;
import org.junit.Test;

import java.util.HashMap;

public class HeaderTest {
    @Test
    public void TestSetHeader() throws TencentCloudSDKException {
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
                hpf.setProtocol("http://");
                hpf.setEndpoint("9.134.89.153:81/tc_api");
                cpf.setHttpProfile(hpf);

                CvmClient client = new CvmClient(cred, "ap-guangzhou", cpf);
                DescribeInstancesRequest req = new DescribeInstancesRequest();
                req.SetHeader(new HashMap<String, String>() {{
                    put("Host", "cvm.tencentcloudapi.com");
                }});
                client.DescribeInstances(req);
            }
        }
    }
}
