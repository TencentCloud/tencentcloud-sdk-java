package com.tencentcloudapi.unit.hunyuan;

import com.tencentcloudapi.hunyuan.v20230901.models.Tool;
import com.tencentcloudapi.hunyuan.v20230901.models.ToolFunction;
import org.junit.Test;

public class ToolTest {
    @Test
    public void testTool() {
        Tool tool = new Tool();
        tool.setType("type");
        assert tool.getType().equals("type");

        tool.setFunction(new ToolFunction());
        tool.getFunction().setName("name");

        new Tool(tool);
    }
}
