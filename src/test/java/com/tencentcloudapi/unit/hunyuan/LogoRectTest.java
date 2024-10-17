package com.tencentcloudapi.unit.hunyuan;

import com.tencentcloudapi.hunyuan.v20230901.models.LogoRect;
import org.junit.Test;

import java.util.HashMap;

public class LogoRectTest {
    @Test
    public void testLogoRect() {
        LogoRect logoRect = new LogoRect();
        logoRect.setX(1L);
        assert logoRect.getX() == 1L;

        logoRect.setY(1L);
        assert logoRect.getY() == 1L;

        logoRect.setWidth(2L);
        assert logoRect.getWidth() == 2L;

        logoRect.setHeight(2L);
        assert logoRect.getHeight() == 2L;

        new LogoRect(logoRect);
        logoRect.toMap(new HashMap<>(), "");
    }
}
