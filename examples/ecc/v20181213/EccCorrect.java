package ecc.v20181213;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.ecc.v20181213.EccClient;
import com.tencentcloudapi.ecc.v20181213.models.ECCRequest;
import com.tencentcloudapi.ecc.v20181213.models.ECCResponse;

public class EccCorrect {

    public static void main(String[] args) {
        try {
            // 为了保护密钥安全，建议将密钥设置在环境变量中或者配置文件中。
            // 硬编码密钥到代码中有可能随代码泄露而暴露，有安全隐患，并不推荐。
            // Credential cred = new Credential("SecretId", "SecretKey");
            Credential cred = new Credential(System.getenv("TENCENTCLOUD_SECRET_ID"), System.getenv("TENCENTCLOUD_SECRET_KEY"));
            HttpProfile httpProfile = new HttpProfile();
            httpProfile.setReqMethod("POST"); 
            httpProfile.setConnTimeout(60); 
            httpProfile.setEndpoint("ecc.ap-beijing.tencentcloudapi.com"); 
            ClientProfile clientProfile = new ClientProfile();
            clientProfile.setUnsignedPayload(true);
            clientProfile.setHttpProfile(httpProfile);
            EccClient client = new EccClient(cred, "",clientProfile);
            ECCRequest req = new ECCRequest();
            final String content ="this composition content";
            req.setContent(content);
            ECCResponse res = client.ECC(req);
            System.out.println(ECCResponse.toJsonString(res));
            System.out.println(res.getRequestId());

        } catch (TencentCloudSDKException e) {
            e.printStackTrace();
        }
    }

}
