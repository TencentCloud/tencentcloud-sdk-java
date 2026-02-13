package com.tencentcloudapi.unit.hunyuan;

import com.tencentcloudapi.hunyuan.v20230901.models.EmbeddingUsage;
import org.junit.Test;

public class EmbeddingUsageTest {
    @Test
    public void testEmbeddingUsage() {
        EmbeddingUsage usage = new EmbeddingUsage();
        usage.setPromptTokens(10L);
        assert usage.getPromptTokens() == 10L;

        usage.setTotalTokens(100L);
        assert usage.getTotalTokens() == 100L;

        new EmbeddingUsage(usage);
    }
}
