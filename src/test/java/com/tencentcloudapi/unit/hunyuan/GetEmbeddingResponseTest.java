package com.tencentcloudapi.unit.hunyuan;

import com.tencentcloudapi.hunyuan.v20230901.models.EmbeddingData;
import com.tencentcloudapi.hunyuan.v20230901.models.EmbeddingUsage;
import com.tencentcloudapi.hunyuan.v20230901.models.GetEmbeddingResponse;
import org.junit.Test;

import java.util.HashMap;

public class GetEmbeddingResponseTest {
    @Test
    public void testGetEmbeddingResponse() {
        GetEmbeddingResponse response = new GetEmbeddingResponse();
        response.setData(new EmbeddingData[]{});
        assert response.getData().length == 0;

        response.setUsage(new EmbeddingUsage());
        response.getUsage().setPromptTokens(1L);

        response.setRequestId("test");
        assert response.getRequestId().equals("test");

        new GetEmbeddingResponse(response);
        response.toMap(new HashMap<>(), "");
    }
}
