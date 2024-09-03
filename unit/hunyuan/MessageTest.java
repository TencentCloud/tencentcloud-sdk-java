package com.tencentcloudapi.unit.hunyuan;

import com.tencentcloudapi.hunyuan.v20230901.models.Content;
import com.tencentcloudapi.hunyuan.v20230901.models.Message;
import com.tencentcloudapi.hunyuan.v20230901.models.ToolCall;
import org.junit.Test;

public class MessageTest {
    @Test
    public void testMessage() {
        Message message = new Message();
        message.setRole("role");
        assert message.getRole().equals("role");

        message.setContent("content");
        assert message.getContent().equals("content");

        message.setContents(new Content[]{new Content()});
        assert message.getContents().length == 1;

        message.setToolCallId("toolCallId");
        assert message.getToolCallId().equals("toolCallId");

        message.setToolCalls(new ToolCall[]{new ToolCall()});
        assert message.getToolCalls().length == 1;

        new Message(message);
    }
}
