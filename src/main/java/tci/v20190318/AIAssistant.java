package tci.v20190318;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.tci.v20190318.TciClient;
import com.tencentcloudapi.tci.v20190318.models.AIAssistantResponse;
import com.tencentcloudapi.tci.v20190318.models.AIAssistantRequest;

public class AIAssistant {
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
            AIAssistantRequest req = new AIAssistantRequest();
            req.setFileContent ("https%3A%2F%2Fedu-test-1253131631.cos.ap-guangzhou.myqcloud.com%2Faieduautotest%2Fautotest_vedio.mp4"); 
            req.setFileType("vod_url");
            String[] LibraryId= {"tci_library_156403897035611372834"};
            req.setLibrarySet(LibraryId);
            long b=1;
            req.setVoiceEncodeType(b);
       
            String[] str= {"testlib2"};
            req.setVocabLibNameList(str);
            long a=0;
            req.setLang(a);
            AIAssistantResponse res = client.AIAssistant(req);
            System.out.println(AIAssistantResponse.toJsonString(res));
            System.out.println(res.getRequestId());
        } catch (TencentCloudSDKException e) {
            e.printStackTrace();
        }
    }

}
