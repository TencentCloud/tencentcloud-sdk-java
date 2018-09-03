package soe.v20180724;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.soe.v20180724.SoeClient;
import com.tencentcloudapi.soe.v20180724.models.TransmitOralProcessRequest;
import com.tencentcloudapi.soe.v20180724.models.TransmitOralProcessResponse;

import java.nio.charset.StandardCharsets;
import java.util.Base64;


public class TransmitOralProcess {
    public static void main(String[] args) {
        try {
            // 实例化一个认证对象，入参需要传入腾讯云账户secretId，secretKey
            Credential cred = new Credential("secretId", "secretKey");

            // 实例化一个http选项，可选的，没有特殊需求可以跳过
            HttpProfile httpProfile = new HttpProfile();
            httpProfile.setReqMethod("GET"); // post请求(默认为post请求)
            httpProfile.setConnTimeout(30); // 请求连接超时时间，单位为秒(默认60秒)
            httpProfile.setEndpoint("soe.tencentcloudapi.com"); // 指定接入地域域名(默认就近接入)

            // 实例化要请求产品的client对象,clientProfile是可选的
            SoeClient client = new SoeClient(cred, "ap-guangzhou");
            TransmitOralProcessRequest req = new TransmitOralProcessRequest();
            req.setIsEnd(1);
            req.setSeqId(1);
            req.setSessionId("12345678");
            // base64编码数据
            String voiceData = "智聆口语评测";
            Base64.Encoder encoder = Base64.getEncoder();
            final String encoded = encoder.encodeToString(voiceData.getBytes(StandardCharsets.UTF_8));
            req.setUserVoiceData(encoded);
            req.setVoiceEncodeType(1);
            req.setVoiceFileType(1);

            TransmitOralProcessResponse res = client.TransmitOralProcess(req);

            // 输出json格式的字符串回包
            System.out.println(TransmitOralProcessResponse.toJsonString(res));
            // 也可以取出单个值。
            // 你可以通过官网接口文档或跳转到response对象的定义处查看返回字段的定义
            System.out.println(res.getPronAccuracy());
        } catch (TencentCloudSDKException e) {
            e.printStackTrace();
        }
    }
}
