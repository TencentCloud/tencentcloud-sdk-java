package com.tencentcloudapi.unit.hunyuan;

import com.tencentcloudapi.hunyuan.v20230901.models.ToolCallFunction;
import org.junit.Test;

import java.util.HashMap;

public class ToolCallFunctionTest {
    @Test
    public void testToolCallFunction() {
        ToolCallFunction toolCallFunction = new ToolCallFunction();
        toolCallFunction.setName("test");
        assert toolCallFunction.getName().equals("test");

        toolCallFunction.setArguments("test");
        assert toolCallFunction.getArguments().equals("test");

        new ToolCallFunction(toolCallFunction);
        toolCallFunction.toMap(new HashMap<>(), "");
    }
}
