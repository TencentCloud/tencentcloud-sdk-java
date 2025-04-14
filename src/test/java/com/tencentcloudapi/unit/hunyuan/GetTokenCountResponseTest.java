package com.tencentcloudapi.unit.hunyuan;

import com.tencentcloudapi.hunyuan.v20230901.models.GetTokenCountResponse;
import org.junit.Test;

import java.util.HashMap;

public class GetTokenCountResponseTest {
    @Test
    public void TestGetTokenCountResponse() {
        GetTokenCountResponse response = new GetTokenCountResponse();
        response.setTokenCount(1L);
        assert response.getTokenCount() == 1L;

        response.setTokenCount(2L);
        assert response.getTokenCount() == 2L;

        response.setTokens(new String[]{"a", "b", "c"});
        assert response.getTokens().length == 3;

        response.setCharacterCount(1L);
        assert response.getCharacterCount() == 1L;

        response.setRequestId("123");
        assert response.getRequestId().equals("123");

        new GetTokenCountResponse(response);
        response.toMap(new HashMap<String, String>(), "");
    }
}
