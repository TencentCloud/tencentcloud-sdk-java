package tci.v20190318;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.tci.v20190318.TciClient;
import com.tencentcloudapi.tci.v20190318.models.SubmitFullBodyClassTaskResponse;
import com.tencentcloudapi.tci.v20190318.models.SubmitFullBodyClassTaskRequest;

public class SubmitFullBodyClassTask {
    public static void main(String[] args) {
        try {
            // 为了保护密钥安全，建议将密钥设置在环境变量中或者配置文件中。
            // 硬编码密钥到代码中有可能随代码泄露而暴露，有安全隐患，并不推荐。
            // Credential cred = new Credential("SecretId", "SecretKey");
            Credential cred = new Credential(System.getenv("TENCENTCLOUD_SECRET_ID"), System.getenv("TENCENTCLOUD_SECRET_KEY"));
            HttpProfile httpProfile = new HttpProfile();
            httpProfile.setReqMethod("POST"); 
            httpProfile.setConnTimeout(60); 
            httpProfile.setEndpoint("tci.ap-beijing.tencentcloudapi.com"); 
            ClientProfile clientProfile = new ClientProfile();
            clientProfile.setUnsignedPayload(true);
            clientProfile.setHttpProfile(httpProfile);
            TciClient client = new TciClient(cred, "",clientProfile);
            SubmitFullBodyClassTaskRequest req = new SubmitFullBodyClassTaskRequest();
            req.setFileContent("https://edu-test-1253131631.cos.ap-guangzhou.myqcloud.com/aieduautotest/autotest_vedio.mp4");
            req.setFileType("vod_url");
            long lang=0;
            req.setLang(lang);
            req.setLibrarySet(new String[]{"library_15603955264181591716"});
            req.setVocabLibNameList(new String[]{"testlib2"});
            long EncodeType=1;
            req.setVoiceEncodeType(EncodeType);
            long FileType=10;
            req.setVoiceFileType(FileType);
            SubmitFullBodyClassTaskResponse res = client.SubmitFullBodyClassTask(req);
            System.out.println(SubmitFullBodyClassTaskResponse.toJsonString(res));
            System.out.println(res.getRequestId());
        } catch (TencentCloudSDKException e) {
            e.printStackTrace();
        }
    }

}
