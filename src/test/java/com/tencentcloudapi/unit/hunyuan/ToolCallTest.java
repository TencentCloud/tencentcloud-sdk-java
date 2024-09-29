package com.tencentcloudapi.unit.hunyuan;

import com.tencentcloudapi.hunyuan.v20230901.models.ToolCall;
import com.tencentcloudapi.hunyuan.v20230901.models.ToolCallFunction;
import org.junit.Test;

import java.util.HashMap;

public class ToolCallTest {
    @Test
    public void testToolCall() {
        ToolCall toolCall = new ToolCall();
        toolCall.setId("111");
        assert toolCall.getId().equals("111");

        toolCall.setType("test");
        assert toolCall.getType().equals("test");

        toolCall.setFunction(new ToolCallFunction());
        toolCall.getFunction().setName("test");

        new ToolCall(toolCall);
        toolCall.toMap(new HashMap<>(), "");
    }
}
