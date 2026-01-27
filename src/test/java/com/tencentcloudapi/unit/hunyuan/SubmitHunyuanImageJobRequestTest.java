package com.tencentcloudapi.unit.hunyuan;

import com.tencentcloudapi.hunyuan.v20230901.models.LogoParam;
import com.tencentcloudapi.hunyuan.v20230901.models.SubmitHunyuanImageJobRequest;
import org.junit.Test;

import java.util.HashMap;

public class SubmitHunyuanImageJobRequestTest {
    @Test
    public void testBuildRequest() {
        SubmitHunyuanImageJobRequest request = new SubmitHunyuanImageJobRequest();
        request.setPrompt("test");
        assert request.getPrompt().equals("test");

        request.setStyle("test");
        assert request.getStyle().equals("test");

        request.setResolution("768:768（1:1）");
        assert request.getResolution().equals("768:768（1:1）");

        request.setNum(1L);
        assert request.getNum() == 1L;

        request.setSeed(9L);
        assert request.getSeed() == 9L;

        request.setRevise(1L);
        assert request.getRevise() == 1L;

        request.setLogoAdd(1L);
        assert request.getLogoAdd() == 1L;

        request.setLogoParam(new LogoParam());
        request.getLogoParam().setLogoUrl("test");

        new SubmitHunyuanImageJobRequest(request);
        request.toMap(new HashMap<String, String>(), "");
    }
}
