package cls.v20201016;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.SSEResponseModel;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.cls.v20201016.ClsClient;
import com.tencentcloudapi.cls.v20201016.models.ChatCompletionsRequest;
import com.tencentcloudapi.cls.v20201016.models.ChatCompletionsResponse;
import com.tencentcloudapi.cls.v20201016.models.Choice;
import com.tencentcloudapi.cls.v20201016.models.Message;
import com.tencentcloudapi.cls.v20201016.models.MetadataItem;

public class ChatCompletions {
    public static void main(String[] args) {
        try {
            // 1. 实例化一个认证对象
            // 从环境变量中获取密钥 ID 和密钥 Key，这是访问云 API 的必需凭证。
            Credential cred = new Credential(
                    System.getenv("TENCENTCLOUD_SECRET_ID"),
                    System.getenv("TENCENTCLOUD_SECRET_KEY")
            );

            // 2. 实例化 HTTP 配置
            HttpProfile httpProfile = new HttpProfile();
            // 流式接口可能耗时较长，因此将请求超时时间设置为 300 秒。
            httpProfile.setReadTimeout(300);
            // 通过 SSE 流式调用此接口时，请务必设置请求域名（Endpoint）为 cls.ai.tencentcloudapi.com。
            httpProfile.setEndpoint("cls.ai.tencentcloudapi.com");

            ClientProfile clientProfile = new ClientProfile();
            clientProfile.setHttpProfile(httpProfile);

            // 3. 实例化 CLS Client
            ClsClient client = new ClsClient(cred, "ap-guangzhou", clientProfile);

            // 4. 构造请求参数
            ChatCompletionsRequest req = new ChatCompletionsRequest();
            // 指定要使用的功能，例如 "text2sql"。
            req.setModel("text2sql");

            // 设置对话消息，角色为 "user"，内容为用户的提问。
            Message msg = new Message();
            msg.setRole("user");
            msg.setContent("状态码200, 统计日志条数");
            req.setMessages(new Message[]{msg});

            // 设置元数据，传递日志主题地域和日志主题 ID
            MetadataItem topicRegion = new MetadataItem();
            topicRegion.setKey("topic_region");
            topicRegion.setValue("ap-guangzhou");

            MetadataItem topicId = new MetadataItem();
            topicId.setKey("topic_id");
            topicId.setValue("xxxxxxxx-xxxx");

            req.setMetadata(new MetadataItem[]{topicRegion, topicId});

            // 5. 流式调用
            // CLS ChatCompletions 同时支持流式和非流式两种模式。
            // 将 Stream 参数设置为 true，表示以流式方式获取响应。
            req.setStream(true);
            try (ChatCompletionsResponse resp = client.ChatCompletions(req)) {
                Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();

                for (SSEResponseModel.SSE e : resp) {
                    // 跳过心跳等 data 为空的事件（如服务端每隔一段时间发送的 :heartbeat 注释）
                    if (e.Data == null || e.Data.isEmpty()) continue;
                    // 服务端通过 event: error 返回应用层错误
                    if ("error".equals(e.Event == null ? null : e.Event.trim())) {
                        JsonObject errObj = JsonParser.parseString(e.Data).getAsJsonObject();
                        JsonObject error = errObj.getAsJsonObject("Response").getAsJsonObject("Error");
                        System.err.println("\n[流式] error " + error);
                        break;
                    }
                    ChatCompletionsResponse eventModel = gson.fromJson(e.Data, ChatCompletionsResponse.class);
                    Choice[] choices = eventModel.getChoices();
                    if (choices != null) {
                        for (Choice choice : choices) {
                            // 实时输出思考过程（ReasoningContent）
                            String reasoningContent = choice.getDelta().getReasoningContent();
                            if (reasoningContent != null && !reasoningContent.isEmpty()) {
                                System.out.print(reasoningContent);
                            }
                            // 实时输出回复内容（Content）
                            String content = choice.getDelta().getContent();
                            if (content != null && !content.isEmpty()) {
                                System.out.print(content);
                            }
                        }
                    }
                }
                System.out.println("\n[流式] 完成，开始非流式调用...");
            }

            // 6. 非流式调用
            // 通过 Stream=false 参数来指定非 stream 协议，一次性拿到结果。
            req.setStream(false);
            ChatCompletionsResponse resp = client.ChatCompletions(req);
            if (resp.getChoices()[0].getMessage().getReasoningContent() != null) {
                System.out.println("思考过程：" + resp.getChoices()[0].getMessage().getReasoningContent());
            }
            System.out.println("[非流式] 回复内容：\n" + resp.getChoices()[0].getMessage().getContent());

        } catch (TencentCloudSDKException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }
}
