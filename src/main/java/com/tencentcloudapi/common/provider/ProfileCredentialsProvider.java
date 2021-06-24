package com.tencentcloudapi.common.provider;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import org.ini4j.Wini;

import java.io.File;
import java.io.IOException;

public class ProfileCredentialsProvider implements CredentialsProvider {
    @Override
    public Credential getCredentials() throws TencentCloudSDKException {
        String fileName;
        if (new File(System.getProperty("user.home")+"/.tencentcloud/credentials").exists()) {
            fileName = System.getProperty("user.home")+"/.tencentcloud/credentials";
        } else if (new File("/etc/tencentcloud/credentials").exists()) {
            fileName = "/etc/tencentcloud/credentials";
        } else {
            return null;
        }
        Wini ini;
        try {
            ini = new Wini(new File(fileName));
        } catch (IOException e) {
            throw new TencentCloudSDKException("IOException");
        }
        String secretId = ini.get("default", "secret_id");
        String secretKey = ini.get("default", "secret_key");
        String roleName = ini.get("default","role_name");
        if (secretId != null && secretKey != null) {
            if (secretId.length() == 0) {
                throw new TencentCloudSDKException("secretId cannot be empty");
            } else if (secretKey.length() == 0) {
                throw new TencentCloudSDKException("secretKey cannot be empty");
            } else {
                return new Credential(secretId, secretKey);
            }
        } else {
            return null;
        }
    }
}
