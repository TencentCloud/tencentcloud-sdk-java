package com.tencentcloudapi.common.provider;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import org.ini4j.Wini;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ProfileCredentialsProvider implements CredentialsProvider {
    private static Wini ini;

    @Override
    public Credential getCredentials() throws TencentCloudSDKException {
        Wini ini = getIni();
        String secretId = ini.get("default", "secret_id");
        String secretKey = ini.get("default", "secret_key");
        if (secretId == null || secretKey == null) {
            throw new TencentCloudSDKException("Not found secretId or secretKey");
        }
        if (secretId.length() == 0) {
            throw new TencentCloudSDKException("SecretId cannot be empty");
        } else if (secretKey.length() == 0) {
            throw new TencentCloudSDKException("SecretKey cannot be empty");
        } else {
            return new Credential(secretId, secretKey);
        }
    }

    private static Wini getIni() throws TencentCloudSDKException {
        String fileName;
        if (Files.exists(Paths.get(System.getProperty("user.home") + "\\.tencentcloud\\credentials"))) {
            fileName = System.getProperty("user.home") + "\\.tencentcloud\\credentials";
        } else if (Files.exists(Paths.get("/etc/tencentcloud/credentials"))) {
            fileName = "/etc/tencentcloud/credentials";
        } else if (Files.exists(Paths.get(System.getProperty("user.home") + "/.tencentcloud/credentials"))) {
            fileName = System.getProperty("user.home") + "/.tencentcloud/credentials";
        } else {
            throw new TencentCloudSDKException("Not found file");
        }
        try {
            ini = new Wini(new File(fileName));
        } catch (IOException e) {
            throw new TencentCloudSDKException("IOException");
        }
        return ini;
    }
}
