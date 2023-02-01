package soe.v20180724;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.soe.v20180724.SoeClient;
import com.tencentcloudapi.soe.v20180724.models.TransmitOralProcessRequest;
import com.tencentcloudapi.soe.v20180724.models.TransmitOralProcessResponse;
import jdk.nashorn.internal.ir.debug.ClassHistogramElement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;


public class TransmitOralProcess {
    public static final String AUDIO_FOR_ONCE = "./bike.mp3";

    public static void main(String[] args) {
        try {
            // 为了保护密钥安全，建议将密钥设置在环境变量中或者配置文件中。
            // 硬编码密钥到代码中有可能随代码泄露而暴露，有安全隐患，并不推荐。
            // Credential cred = new Credential("SecretId", "SecretKey");
            Credential cred = new Credential(System.getenv("TENCENTCLOUD_SECRET_ID"), System.getenv("TENCENTCLOUD_SECRET_KEY"));

            // 实例化一个http选项，可选的，没有特殊需求可以跳过
            HttpProfile httpProfile = new HttpProfile();
            httpProfile.setReqMethod("POST"); // post请求(默认为post请求)
            httpProfile.setConnTimeout(60); // 请求连接超时时间，单位为秒(默认60秒)
            httpProfile.setEndpoint("soe.ap-beijing.tencentcloudapi.com"); // 指定接入地域域名(默认就近接入)

            ClientProfile clientProfile = new ClientProfile();
            clientProfile.setUnsignedPayload(true);
            clientProfile.setHttpProfile(httpProfile);
            // 实例化要请求产品的client对象,clientProfile是可选的
            SoeClient client = new SoeClient(cred, "",clientProfile);
            TransmitOralProcessRequest req = new TransmitOralProcessRequest();

            req.setIsEnd(1);
            req.setSeqId(1);
            req.setSessionId("test_123456");
            // base64编码数据
            byte[] buf = Files.readAllBytes(Paths.get(AUDIO_FOR_ONCE));
            String base64Str = new sun.misc.BASE64Encoder().encode(buf);

            req.setUserVoiceData(base64Str);
            req.setVoiceEncodeType(1);
            req.setVoiceFileType(3);

            TransmitOralProcessResponse res = client.TransmitOralProcess(req);

            // 输出json格式的字符串回包
            System.out.println(TransmitOralProcessResponse.toJsonString(res));
            // 也可以取出单个值。
            // 你可以通过官网接口文档或跳转到response对象的定义处查看返回字段的定义
            System.out.println(res.getPronAccuracy());
        } catch (TencentCloudSDKException | IOException e) {
            e.printStackTrace();
        }
    }
}
