package com.tencentcloudapi.unit.hunyuan;

import com.tencentcloudapi.hunyuan.v20230901.models.GetTokenCountRequest;
import org.junit.Test;

import java.util.HashMap;

public class GetTokenCountRequestTest {
    @Test
    public void testGetTokenCountRequest() {
        GetTokenCountRequest request = new GetTokenCountRequest();
        request.setPrompt("test");
        assert request.getPrompt().equals("test");

        new GetTokenCountRequest(request);
        request.toMap(new HashMap<String, String>(), "");
    }
}
