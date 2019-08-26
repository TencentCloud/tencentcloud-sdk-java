package tci.v20190318;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.tci.v20190318.TciClient;
import com.tencentcloudapi.tci.v20190318.models.SubmitOpenClassTaskResponse;
import com.tencentcloudapi.tci.v20190318.models.SubmitOpenClassTaskRequest;

public class SubmitOpenClassTask {
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
            SubmitOpenClassTaskRequest req = new SubmitOpenClassTaskRequest();
            req.setFileContent("https://edu-test-1253131631.cos.ap-guangzhou.myqcloud.com/aieduautotest/autotest_vedio.mp4");
            req.setFileType("vod_url");
            req.setLibrarySet(new String[]{"library_15603955264181591716"});
            SubmitOpenClassTaskResponse res = client.SubmitOpenClassTask(req);
            System.out.println(SubmitOpenClassTaskResponse.toJsonString(res));
            System.out.println(res.getRequestId());
        } catch (TencentCloudSDKException e) {
            e.printStackTrace();
        }
    }

}
