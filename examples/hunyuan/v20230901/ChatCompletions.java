package hunyuan.v20230901;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.SSEResponseModel;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.hunyuan.v20230901.HunyuanClient;
import com.tencentcloudapi.hunyuan.v20230901.models.ChatCompletionsRequest;
import com.tencentcloudapi.hunyuan.v20230901.models.ChatCompletionsResponse;
import com.tencentcloudapi.hunyuan.v20230901.models.Choice;
import com.tencentcloudapi.hunyuan.v20230901.models.Message;

public class ChatCompletions {
    public static void main(String[] args) {
        try {
            Credential cred = new Credential(
                    System.getenv("TENCENTCLOUD_SECRET_ID"),
                    System.getenv("TENCENTCLOUD_SECRET_KEY")
            );

            ClientProfile clientProfile = new ClientProfile();
            HunyuanClient client = new HunyuanClient(cred, "ap-guangzhou", clientProfile);

            ChatCompletionsRequest req = new ChatCompletionsRequest();
            Message msg = new Message();
            msg.setRole("user");
            msg.setContent("你好, 可以讲个笑话吗");
            req.setMessages(new Message[]{
                    msg
            });

            // hunyuan ChatCompletions/ChatPro 同时支持 stream 和非 stream 的情况
            req.setStream(true);

            ChatCompletionsResponse resp = client.ChatCompletions(req);

            if (req.getStream()) {
                // stream 示例
                Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
                for (SSEResponseModel.SSE e : resp) {
                    ChatCompletionsResponse eventModel = gson.fromJson(e.Data, ChatCompletionsResponse.class);
                    Choice[] choices = eventModel.getChoices();
                    if (choices.length > 0) {
                        System.out.println(choices[0].getDelta().getContent());
                    }

                    // 如果希望在任意时刻中止事件流, 使用 resp.close() + break
                    boolean iWantToCancelNow = false;
                    if (iWantToCancelNow) {
                        resp.close();
                        break;
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
