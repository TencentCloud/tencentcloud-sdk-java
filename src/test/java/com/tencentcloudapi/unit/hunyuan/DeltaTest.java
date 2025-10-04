package com.tencentcloudapi.unit.hunyuan;

import com.tencentcloudapi.hunyuan.v20230901.models.Delta;
import com.tencentcloudapi.hunyuan.v20230901.models.ToolCall;
import org.junit.Test;

import java.util.HashMap;

public class DeltaTest {
    @Test
    public void testDelta() {
        Delta delta = new Delta();
        delta.setRole("test");
        assert delta.getRole().equals("test");

        delta.setContent("test");
        assert delta.getContent().equals("test");

        delta.setToolCalls(new ToolCall[]{new ToolCall()});
        assert delta.getToolCalls().length == 1;

        new Delta(delta);
        delta.toMap(new HashMap<>(), "");
    }
}
