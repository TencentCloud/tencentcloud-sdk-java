package tci.v20190318;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.tci.v20190318.TciClient;
import com.tencentcloudapi.tci.v20190318.models.CreatePersonResponse;
import com.tencentcloudapi.tci.v20190318.models.CreatePersonRequest;

public class CreatePerson {
    public static void main(String[] args) {
        try {
            Credential cred = new Credential("", "");
            HttpProfile httpProfile = new HttpProfile();
            httpProfile.setReqMethod("POST"); 
            httpProfile.setConnTimeout(60); 
            httpProfile.setEndpoint("tci.ap-beijing.tencentcloudapi.com"); 
            ClientProfile clientProfile = new ClientProfile();
            clientProfile.setUnsignedPayload(true);
            clientProfile.setHttpProfile(httpProfile);
            TciClient client = new TciClient(cred, "",clientProfile);
            CreatePersonRequest req = new CreatePersonRequest();
            req.setLibraryId("tci_library_156403897035611372834");
            req.setPersonName("fxh");
            req.setJobNumber("3512635");
            req.setStudentNumber("3628642364");
            final long b=1;
            req.setMale(b);
            req.setMail("79322391@qq.com");
            CreatePersonResponse res = client.CreatePerson(req);
            System.out.println(CreatePersonResponse.toJsonString(res));
            System.out.println(res.getRequestId());
        } catch (TencentCloudSDKException e) {
            e.printStackTrace();
        }
    }

}
