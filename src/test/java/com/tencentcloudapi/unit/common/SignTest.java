package com.tencentcloudapi.unit.common;

import com.tencentcloudapi.common.Sign;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import org.junit.Test;

public class SignTest {
    @Test
    public void testSign() throws TencentCloudSDKException {
        Sign sign = new Sign();
        try {
            sign.sign("1", "1", "1");
        } catch (TencentCloudSDKException e) {
            assert e.getMessage().contains("1 not available");
        }
    }

    @Test
    public void testSha256Hex() throws TencentCloudSDKException {
        Sign sign = new Sign();
        String s = sign.sha256Hex("1");
        assert s.equals("6b86b273ff34fce19d6b804eff5a3f5747ada4eaa22f1d49c01e52ddb7875b4b");
    }
}
