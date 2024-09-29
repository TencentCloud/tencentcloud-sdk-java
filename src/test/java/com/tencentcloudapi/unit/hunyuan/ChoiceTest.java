package com.tencentcloudapi.unit.hunyuan;

import com.tencentcloudapi.hunyuan.v20230901.models.Choice;
import com.tencentcloudapi.hunyuan.v20230901.models.Delta;
import com.tencentcloudapi.hunyuan.v20230901.models.Message;
import org.junit.Test;

public class ChoiceTest {
    @Test
    public void testChoice() {
        Choice choice = new Choice();
        choice.setFinishReason("finishReason");
        assert choice.getFinishReason().equals("finishReason");

        choice.setDelta(new Delta());
        choice.getDelta();

        choice.setMessage(new Message());
        choice.getMessage().setRole("role");

        new Choice(choice);
    }
}
