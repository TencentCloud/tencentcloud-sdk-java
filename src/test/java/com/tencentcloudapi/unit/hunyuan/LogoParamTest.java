package com.tencentcloudapi.unit.hunyuan;

import com.tencentcloudapi.hunyuan.v20230901.models.LogoParam;
import com.tencentcloudapi.hunyuan.v20230901.models.LogoRect;
import org.junit.Test;

public class LogoParamTest {
    @Test
    public void testLogoParam() {
        LogoParam logoParam = new LogoParam();
        logoParam.setLogoUrl("https://hunyuan.com");
        assert logoParam.getLogoUrl().equals("https://hunyuan.com");

        logoParam.setLogoImage("logo");
        assert logoParam.getLogoImage().equals("logo");

        logoParam.setLogoRect(new LogoRect());
        logoParam.getLogoRect().setX(10L);

        new LogoParam(logoParam);
    }
}
