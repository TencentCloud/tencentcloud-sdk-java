package com.tencentcloudapi.unit.hunyuan;

import com.tencentcloudapi.hunyuan.v20230901.models.Usage;
import org.junit.Test;

import java.util.HashMap;

public class UsageTest {
    @Test
    public void testUsage() {
        Usage usage = new Usage();
        usage.setPromptTokens(1L);
        assert usage.getPromptTokens() == 1L;

        usage.setCompletionTokens(2L);
        assert usage.getCompletionTokens() == 2L;

        usage.setTotalTokens(3L);
        assert usage.getTotalTokens() == 3L;

        new Usage(usage);
        usage.toMap(new HashMap<>(), "");
    }
}
