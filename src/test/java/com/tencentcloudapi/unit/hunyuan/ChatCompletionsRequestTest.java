package com.tencentcloudapi.unit.hunyuan;

import com.tencentcloudapi.hunyuan.v20230901.models.ChatCompletionsRequest;
import org.junit.Test;

import java.util.HashMap;

public class ChatCompletionsRequestTest {
    @Test
    public void testChatCompletionsRequest() {
        ChatCompletionsRequest request = new ChatCompletionsRequest();
        request.setModel("model");
        assert request.getModel().equals("model");

        request.setMessages(new com.tencentcloudapi.hunyuan.v20230901.models.Message[]{new com.tencentcloudapi.hunyuan.v20230901.models.Message()});
        assert request.getMessages().length == 1;

        request.setStream(true);
        assert request.getStream() == true;

        request.setStreamModeration(true);
        assert request.getStreamModeration() == true;

        request.setTopP(1.0f);
        assert request.getTopP() == 1.0f;

        request.setTemperature(1.0f);
        assert request.getTemperature() == 1.0f;

        request.setEnableEnhancement(true);
        assert request.getEnableEnhancement() == true;

        request.setTools(new com.tencentcloudapi.hunyuan.v20230901.models.Tool[]{new com.tencentcloudapi.hunyuan.v20230901.models.Tool()});
        assert request.getTools().length == 1;

        request.setToolChoice("toolChoice");
        assert request.getToolChoice().equals("toolChoice");

        request.setCustomTool(new com.tencentcloudapi.hunyuan.v20230901.models.Tool());
        request.getCustomTool();

        request.setSearchInfo(true);
        assert request.getSearchInfo() == true;

        new ChatCompletionsRequest(request);

        HashMap<String, String> map = new HashMap<>();
        request.toMap(map, "");
    }
}
