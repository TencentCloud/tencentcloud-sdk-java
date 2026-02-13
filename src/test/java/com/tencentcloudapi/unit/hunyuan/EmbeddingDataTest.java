package com.tencentcloudapi.unit.hunyuan;

import com.tencentcloudapi.hunyuan.v20230901.models.EmbeddingData;
import org.junit.Test;

import java.util.HashMap;

public class EmbeddingDataTest {
    @Test
    public void testEmbeddingData() {
        EmbeddingData embeddingData = new EmbeddingData();
        embeddingData.setEmbedding(new Float[]{1.0f, 2.0f, 3.0f});
        assert embeddingData.getEmbedding().length == 3;

        embeddingData.setIndex(1L);
        assert embeddingData.getIndex() == 1L;

        embeddingData.setObject("test");
        assert embeddingData.getObject().equals("test");

        new EmbeddingData(embeddingData);
        embeddingData.toMap(new HashMap<>(), "");
    }
}
