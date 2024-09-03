package com.tencentcloudapi.unit.hunyuan;

import com.tencentcloudapi.hunyuan.v20230901.models.TextToImageLiteResponse;
import org.junit.Test;

import java.util.HashMap;

public class TextToImageLiteResponseTest {
    @Test
    public void testTextToImageLiteResponse() {
        TextToImageLiteResponse response = new TextToImageLiteResponse();
        response.setRequestId("requestId");
        assert response.getRequestId().equals("requestId");

        response.setResultImage("resultImage");
        assert response.getResultImage().equals("resultImage");

        new TextToImageLiteResponse(response);
        response.toMap(new HashMap<>(), "");
    }
}
