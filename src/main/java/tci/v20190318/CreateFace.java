package tci.v20190318;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.tci.v20190318.TciClient;
import com.tencentcloudapi.tci.v20190318.models.CreateFaceResponse;
import com.tencentcloudapi.tci.v20190318.models.CreateFaceRequest;

public class CreateFace {
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
            CreateFaceRequest req = new CreateFaceRequest();
            req.setLibraryId("tci_library_156403897035611372834");
            req.setPersonId("tci_person_1564039695429032573626");
            String[] str= {"https://img-blog.csdn.net/20161128171723259"} ;
            req.setUrls(str);
            CreateFaceResponse res = client.CreateFace(req);
            System.out.println(CreateFaceResponse.toJsonString(res));
            System.out.println(res.getRequestId());
        } catch (TencentCloudSDKException e) {
            e.printStackTrace();
        }
    }

}
