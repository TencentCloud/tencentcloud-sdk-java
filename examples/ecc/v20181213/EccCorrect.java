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
        	
            Credential cred = new Credential("", "");
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
