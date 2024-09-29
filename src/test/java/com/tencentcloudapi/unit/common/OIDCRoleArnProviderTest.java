package com.tencentcloudapi.unit.common;

import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.provider.OIDCRoleArnProvider;
import org.junit.Test;
import org.powermock.reflect.Whitebox;


public class OIDCRoleArnProviderTest {
    @Test
    public void testOIDCRoleArnProviderInit() throws TencentCloudSDKException {
        OIDCRoleArnProvider oidcRoleArnProvider = new OIDCRoleArnProvider("ap-shanghai", "", "", "", "", 0L);
        oidcRoleArnProvider.ExpirationReservationTime = 0L;
        Whitebox.setInternalState(oidcRoleArnProvider,"isTke",false);

    }
}
