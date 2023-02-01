package soe.v20180724;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.soe.v20180724.SoeClient;
import com.tencentcloudapi.soe.v20180724.models.InitOralProcessResponse;
import com.tencentcloudapi.soe.v20180724.models.KeywordEvaluateRequest;
import com.tencentcloudapi.soe.v20180724.models.Keyword;
import com.tencentcloudapi.soe.v20180724.models.KeywordEvaluateResponse;

public class KeywordEvaluate {
    public static final String AUDIO_FOR_ONCE = "./bike.mp3";

    public static void main(String [] args) throws IOException {
        try{
            // 为了保护密钥安全，建议将密钥设置在环境变量中或者配置文件中。
            // 硬编码密钥到代码中有可能随代码泄露而暴露，有安全隐患，并不推荐。
            // Credential cred = new Credential("SecretId", "SecretKey");
            Credential cred = new Credential(System.getenv("TENCENTCLOUD_SECRET_ID"), System.getenv("TENCENTCLOUD_SECRET_KEY"));

            HttpProfile httpProfile = new HttpProfile();
            httpProfile.setEndpoint("soe.tencentcloudapi.com");

            ClientProfile clientProfile = new ClientProfile();
            clientProfile.setHttpProfile(httpProfile);

            SoeClient client = new SoeClient(cred, "", clientProfile);

            KeywordEvaluateRequest req = new KeywordEvaluateRequest();
            req.setSeqId(1);
            req.setIsEnd(1);
            req.setVoiceFileType(3);
            req.setVoiceEncodeType(1);
            req.setSessionId("test_12345_456");
            byte[] buf = Files.readAllBytes(Paths.get(AUDIO_FOR_ONCE));
            String base64Str = new sun.misc.BASE64Encoder().encode(buf);
            req.setUserVoiceData(base64Str);

            Keyword[] keywords1 = new Keyword[2];
            Keyword keyword1 = new Keyword();
            keyword1.setRefText("bike");
            keyword1.setEvalMode(0);
            keyword1.setServerType(0);
            keyword1.setScoreCoeff(1.0f);
            keyword1.setTextMode(0);
            keywords1[0] = keyword1;

            Keyword keyword2 = new Keyword();
            keyword2.setRefText("bick");
            keyword2.setEvalMode(0);
            keyword2.setServerType(0);
            keyword2.setScoreCoeff(1.0f);
            keyword2.setTextMode(0);
            keywords1[1] = keyword2;

            req.setKeywords(keywords1);

            KeywordEvaluateResponse resp = client.KeywordEvaluate(req);
            System.out.println(KeywordEvaluateResponse.toJsonString(resp));

        } catch (TencentCloudSDKException | IOException e) {
            System.out.println(e.toString());
        }
    }
}
