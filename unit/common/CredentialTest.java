package com.tencentcloudapi.unit.common;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import org.junit.Test;
import org.powermock.reflect.Whitebox;

public class CredentialTest {
    @Test
    public void testCredential() throws Exception {
        class CredentialUpdater implements Credential.Updater {
            @Override
            public void update(Credential credential) throws TencentCloudSDKException {
                throw new TencentCloudSDKException("test");
            }
        }
        CredentialUpdater updater = new CredentialUpdater();
        Credential credential = new Credential("secretId", "secretKey", "token", updater);
        credential.getUpdater();
        credential.setUpdater(new CredentialUpdater());
        credential.setSecretId("secretId");
        credential.setSecretKey("secretKey");
        credential.setToken("token");

        try {
            Whitebox.invokeMethod(credential, "tryUpdate");
        } catch (Exception e) {
            assert e.getMessage().contains("test");
        }

        Credential cred = new Credential();
        class testUpdater implements Credential.Updater {
            @Override
            public void update(Credential credential) throws TencentCloudSDKException {
            }
        }
        testUpdater testUpdater = new testUpdater();
        Credential cred1 = new Credential("secretId", "secretKey", "token", testUpdater);
        Whitebox.invokeMethod(cred1, "tryUpdate");
    }
}
