package com.tencentcloudapi.integration.requests;

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
import org.junit.Test;

public class HunyuanTest {
    @Test
    public void TestChatCompletionsStream() throws TencentCloudSDKException {
        Credential cred = new Credential(
                System.getenv("TENCENTCLOUD_SECRET_ID"),
                System.getenv("TENCENTCLOUD_SECRET_KEY")
        );

        ClientProfile clientProfile = new ClientProfile();
        clientProfile.getHttpProfile().setReadTimeout(400);
        HunyuanClient client = new HunyuanClient(cred, "ap-guangzhou", clientProfile);

        ChatCompletionsRequest req = new ChatCompletionsRequest();
        req.setModel("hunyuan-standard");
        Message msg = new Message();
        msg.setRole("user");
        msg.setContent("hi, tell me a joke");
        req.setMessages(new Message[]{msg});
        req.setStream(true);

        if (req.getStream()) {
            try (ChatCompletionsResponse resp = client.ChatCompletions(req)) {
                Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
                for (SSEResponseModel.SSE e : resp) {
                    ChatCompletionsResponse eventModel = gson.fromJson(e.Data, ChatCompletionsResponse.class);
                    Choice[] choices = eventModel.getChoices();
                    if (choices.length > 0) {
                        System.out.println(choices[0].getDelta().getContent());
                    }
                }
            }
        } else {
            System.out.println(client.ChatCompletions(req).getChoices()[0].getMessage().getContent());
        }
    }

    @Test
    public void TestChatCompletionsNonStream() throws TencentCloudSDKException {
        Credential cred = new Credential(
                System.getenv("TENCENTCLOUD_SECRET_ID"),
                System.getenv("TENCENTCLOUD_SECRET_KEY")
        );

        ClientProfile clientProfile = new ClientProfile();
        clientProfile.getHttpProfile().setReadTimeout(400);
        HunyuanClient client = new HunyuanClient(cred, "ap-guangzhou", clientProfile);

        ChatCompletionsRequest req = new ChatCompletionsRequest();
        req.setModel("hunyuan-standard");
        Message msg = new Message();
        msg.setRole("user");
        msg.setContent("hi, tell me a joke");
        req.setMessages(new Message[]{msg});
        req.setStream(false);

        if (req.getStream()) {
            try (ChatCompletionsResponse resp = client.ChatCompletions(req)) {
                Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
                for (SSEResponseModel.SSE e : resp) {
                    ChatCompletionsResponse eventModel = gson.fromJson(e.Data, ChatCompletionsResponse.class);
                    Choice[] choices = eventModel.getChoices();
                    if (choices.length > 0) {
                        System.out.println(choices[0].getDelta().getContent());
                    }
                }
            }
        } else {
            System.out.println(client.ChatCompletions(req).getChoices()[0].getMessage().getContent());
        }
    }

}
