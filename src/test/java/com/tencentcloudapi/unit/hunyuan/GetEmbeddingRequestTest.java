package com.tencentcloudapi.unit.hunyuan;

import com.tencentcloudapi.hunyuan.v20230901.models.GetEmbeddingRequest;
import org.junit.Test;

import java.util.HashMap;

public class GetEmbeddingRequestTest {
    @Test
    public void testGetEmbeddingRequest() {
        GetEmbeddingRequest request = new GetEmbeddingRequest();
        request.setInput("test");
        assert request.getInput().equals("test");

        new GetEmbeddingRequest(request);
        request.toMap(new HashMap<>(), "");
    }
}
