package com.tencentcloudapi.integration.requests;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.cvm.v20170312.CvmClient;
import com.tencentcloudapi.cvm.v20170312.models.DescribeInstancesRequest;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TempCredentialTest {
    @Test
    public void TestEmptyToken() throws TencentCloudSDKException {
        List<String> reqMethods = Arrays.asList("GET", "POST");
        List<String> signMethods = Arrays.asList(
                ClientProfile.SIGN_SHA1, ClientProfile.SIGN_SHA256, ClientProfile.SIGN_TC3_256);
        List<String> tokens = Arrays.asList("", null);

        for (String reqMethod : reqMethods) {
            for (String signMethod : signMethods) {
                for (String token : tokens) {
                    Credential cred = new Credential(
                            System.getenv("TENCENTCLOUD_SECRET_ID"),
                            System.getenv("TENCENTCLOUD_SECRET_KEY"),
                            token
                    );

                    ClientProfile cpf = new ClientProfile();
                    cpf.getHttpProfile().setReqMethod(reqMethod);
                    cpf.setSignMethod(signMethod);
                    CvmClient client = new CvmClient(cred, "ap-guangzhou", cpf);
                    DescribeInstancesRequest req = new DescribeInstancesRequest();
                    client.DescribeInstances(req);
                }
            }
        }


    }
}
