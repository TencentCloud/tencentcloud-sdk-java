package com.tencentcloudapi.unit.hunyuanclient;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.hunyuan.v20230901.HunyuanClient;
import com.tencentcloudapi.hunyuan.v20230901.models.*;
import org.junit.Test;
import org.powermock.reflect.Whitebox;


public class HunyuanClientTest {
    @Test
    public void testChatCompletions() throws TencentCloudSDKException {
        Credential cred =
                new Credential(
                        System.getenv("TENCENTCLOUD_SECRET_ID"), System.getenv("TENCENTCLOUD_SECRET_KEY"));
        HttpProfile httpProfile = new HttpProfile();
        ClientProfile clientProfile = new ClientProfile();
        clientProfile.setHttpProfile(httpProfile);
        HunyuanClient client = new HunyuanClient(cred, "ap-guangzhou", clientProfile);

        ChatCompletionsRequest req = new ChatCompletionsRequest();
        Whitebox.setInternalState(req, "Model", "hunyuan-pro");
        Message message = new Message();
        Whitebox.setInternalState(message, "Role", "user");
        Whitebox.setInternalState(message, "Content", "hello");
        Message[] messages = new Message[1];
        messages[0] = message;
        Whitebox.setInternalState(req, "Messages", messages);

        ChatCompletionsResponse response = client.ChatCompletions(req);
        assert response != null;
    }

    @Test
    public void testGetEmbedding() throws TencentCloudSDKException {
        Credential cred =
                new Credential(
                        System.getenv("TENCENTCLOUD_SECRET_ID"), System.getenv("TENCENTCLOUD_SECRET_KEY"));
        HunyuanClient client = new HunyuanClient(cred, "ap-guangzhou");

        GetEmbeddingRequest req = new GetEmbeddingRequest();
        req.setInput("hello");

        GetEmbeddingResponse response = client.GetEmbedding(req);
        assert response != null;
    }

    @Test
    public void testGetTokenCount() throws TencentCloudSDKException {
        Credential cred =
                new Credential(
                        System.getenv("TENCENTCLOUD_SECRET_ID"), System.getenv("TENCENTCLOUD_SECRET_KEY"));
        HunyuanClient client = new HunyuanClient(cred, "ap-guangzhou");

        GetTokenCountRequest req = new GetTokenCountRequest();
        req.setPrompt("hello");

        GetTokenCountResponse response = client.GetTokenCount(req);
        assert response != null;
    }

    @Test
    public void testQueryHunyuanImageJobResponse() throws TencentCloudSDKException {
        Credential cred =
                new Credential(
                        System.getenv("TENCENTCLOUD_SECRET_ID"), System.getenv("TENCENTCLOUD_SECRET_KEY"));
        HunyuanClient client = new HunyuanClient(cred, "ap-guangzhou");

        SubmitHunyuanImageJobRequest req = new SubmitHunyuanImageJobRequest();
        req.setPrompt("snow and fire");

        SubmitHunyuanImageJobResponse response = client.SubmitHunyuanImageJob(req);
        assert response != null;
    }

    @Test
    public void testTextToImageLite() throws TencentCloudSDKException {
        Credential cred =
                new Credential(
                        System.getenv("TENCENTCLOUD_SECRET_ID"), System.getenv("TENCENTCLOUD_SECRET_KEY"));
        HunyuanClient client = new HunyuanClient(cred, "ap-guangzhou");

        TextToImageLiteRequest req = new TextToImageLiteRequest();
        req.setPrompt("mountains and rivers");

        TextToImageLiteResponse response = client.TextToImageLite(req);
        assert response != null;
    }
}
