package com.tencentcloudapi.unit.common;

import com.tencentcloudapi.common.profile.HttpProfile;
import org.junit.Test;

public class HttpProfileTest {
    @Test
    public void testHttpProfile() {
        HttpProfile profile = new HttpProfile();
        profile.setEndpoint("https://unit.tencentcloudapi.com");
        assert profile.getEndpoint().equals("https://unit.tencentcloudapi.com");
        profile.setReadTimeout(10000);
        assert profile.getReadTimeout() == 10000;
        profile.setWriteTimeout(10000);
        assert profile.getWriteTimeout() == 10000;
        profile.setConnTimeout(10000);
        assert profile.getConnTimeout() == 10000;
        profile.setProtocol("http");
        assert profile.getProtocol().equals("http");
        profile.setRootDomain("unit.tencentcloudapi.com");
        assert profile.getRootDomain().equals("unit.tencentcloudapi.com");
        profile.setApigwEndpoint("https://unit.tencentcloudapi.com");
        assert profile.getApigwEndpoint().equals("https://unit.tencentcloudapi.com");
    }
}
