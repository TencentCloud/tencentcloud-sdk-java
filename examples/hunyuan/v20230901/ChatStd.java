package hunyuan.v20230901;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.SSEResponseModel;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.hunyuan.v20230901.HunyuanClient;
import com.tencentcloudapi.hunyuan.v20230901.models.ChatStdRequest;
import com.tencentcloudapi.hunyuan.v20230901.models.ChatStdResponse;
import com.tencentcloudapi.hunyuan.v20230901.models.Choice;
import com.tencentcloudapi.hunyuan.v20230901.models.Message;

public class ChatStd {
    public static void main(String[] args) {
        try {
            Credential cred = new Credential(
                    System.getenv("TENCENTCLOUD_SECRET_ID"),
                    System.getenv("TENCENTCLOUD_SECRET_KEY")
            );

            ClientProfile clientProfile = new ClientProfile();
            HunyuanClient client = new HunyuanClient(cred, "ap-guangzhou", clientProfile);

            ChatStdRequest req = new ChatStdRequest();
            Message msg = new Message();
            msg.setRole("user");
            msg.setContent("你好, 可以讲个笑话吗");
            req.setMessages(new Message[]{
                    msg
            });

            // hunyuan ChatStd/ChatPro 同时支持 stream 和非 stream 的情况
            req.setStream(true);

            ChatStdResponse resp = client.ChatStd(req);

            if (req.getStream()) {
                // stream 示例
                Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
                for (SSEResponseModel.SSE e : resp) {
                    ChatStdResponse eventModel = gson.fromJson(e.Data, ChatStdResponse.class);
                    Choice[] choices = eventModel.getChoices();
                    if (choices.length > 0) {
                        System.out.println(choices[0].getDelta().getContent());
                    }
                }
            } else {
                // 非 stream 示例
                // 通过 Stream=false 参数来指定非 stream 协议, 一次性拿到结果
                System.out.println(resp.getChoices()[0].getMessage().getContent());
            }
        } catch (TencentCloudSDKException e) {
            e.printStackTrace();
        }
    }
}
