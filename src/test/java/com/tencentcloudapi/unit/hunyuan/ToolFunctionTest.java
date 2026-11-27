package com.tencentcloudapi.unit.hunyuan;

import com.tencentcloudapi.hunyuan.v20230901.models.ToolFunction;
import org.junit.Test;

import java.util.HashMap;

public class ToolFunctionTest {
    @Test
    public void testToolFunction() {
        ToolFunction toolFunction = new ToolFunction();
        toolFunction.setName("test");
        assert toolFunction.getName().equals("test");

        toolFunction.setParameters("test");
        assert toolFunction.getParameters().equals("test");

        toolFunction.setDescription("test");
        assert toolFunction.getDescription().equals("test");

        new ToolFunction(toolFunction);
        toolFunction.toMap(new HashMap<>(), "");
    }
}
