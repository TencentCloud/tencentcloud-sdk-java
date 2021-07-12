package soe.v20180724;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.soe.v20180724.SoeClient;
import com.tencentcloudapi.soe.v20180724.models.TransmitOralProcessResponse;
import com.tencentcloudapi.soe.v20180724.models.TransmitOralProcessWithInitRequest;
import com.tencentcloudapi.soe.v20180724.models.TransmitOralProcessWithInitResponse;
import sun.misc.BASE64Encoder;



public class TransmitOralProcessWithInit {
    public static final String AUDIO_FOR_ONCE = "./bike.mp3";

    public static void main(String[] args)throws Exception {
        try {
            // 实例化一个认证对象，入参需要传入腾讯云账户secretId，secretKey
            Credential cred = new Credential("", "");

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

            TransmitOralProcessWithInitRequest req = new TransmitOralProcessWithInitRequest();

            req.setIsEnd(1); //分片起始
            req.setSeqId(1); //分片结束
            req.setVoiceEncodeType(1);  //语音数据类型1:pcm
            req.setVoiceFileType(3); //语音文件类型
            req.setSessionId("test_12345678901234567"); //唯一标识
            //将文件装换成base64
            byte[] buf = Files.readAllBytes(Paths.get(AUDIO_FOR_ONCE));
            String base64Str = new sun.misc.BASE64Encoder().encode(buf);

            req.setUserVoiceData(base64Str);
            req.setRefText("bike"); //文本
            req.setWorkMode(1); //0,流式分片,1一次性评测
            req.setEvalMode(3); //评估模式,0,单词.1,句子,2,段落,3自由说,4单词纠错
            req.setScoreCoeff(1.0f); //评估难度
            req.setServerType(0); //服务类型.0英文,1中文
            req.setIsAsync(0); //异步
            req.setIsQuery(0); //轮询
            req.setTextMode(0); //文本格式.0普通文本 1,音素结构
            TransmitOralProcessWithInitResponse resp = client.TransmitOralProcessWithInit(req);

            // 输出json格式的字符串回包
            System.out.println(TransmitOralProcessWithInitResponse.toJsonString(resp));
            // 也可以取出单个值。
            // 你可以通过官网接口文档或跳转到response对象的定义处查看返回字段的定义
            System.out.println(resp.getPronAccuracy());

        } catch (TencentCloudSDKException e) {
            e.printStackTrace();
        }
    }
}
