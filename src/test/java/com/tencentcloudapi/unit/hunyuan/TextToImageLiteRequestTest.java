package com.tencentcloudapi.unit.hunyuan;

import com.tencentcloudapi.hunyuan.v20230901.models.LogoParam;
import com.tencentcloudapi.hunyuan.v20230901.models.TextToImageLiteRequest;
import org.junit.Test;

import java.util.HashMap;

public class TextToImageLiteRequestTest {
    @Test
    public void testTextToImageLiteRequest() {
        TextToImageLiteRequest request = new TextToImageLiteRequest();
        request.setPrompt("test");
        assert request.getPrompt().equals("test");

        request.setNegativePrompt("test");
        assert request.getNegativePrompt().equals("test");

        request.setStyle("style");
        assert request.getStyle().equals("style");

        request.setResolution("768:1024（3:4）");
        assert request.getResolution().equals("768:1024（3:4）");

        request.setLogoAdd(1L);
        assert request.getLogoAdd() == 1L;

        request.setLogoParam(new LogoParam());
        request.getLogoParam();

        request.setRspImgType("png");
        assert request.getRspImgType().equals("png");

        new TextToImageLiteRequest(request);
        request.toMap(new HashMap<>(), "");
    }
}
