package com.tencentcloudapi.common.provider;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import org.apache.commons.configuration2.INIConfiguration;
import org.apache.commons.configuration2.ex.ConfigurationException;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ProfileCredentialsProvider implements CredentialsProvider {
    private static INIConfiguration ini;

    private static INIConfiguration getIni() throws TencentCloudSDKException {
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
            ini = new INIConfiguration();
            ini.read(new FileReader(fileName));
        } catch (IOException | ConfigurationException e) {
            throw new TencentCloudSDKException("IOException or ConfigurationException");
        }
        return ini;
    }

    @Override
    public Credential getCredentials() throws TencentCloudSDKException {
        INIConfiguration ini = getIni();
        String secretId = ini.getString("default.secret_id");
        String secretKey = ini.getString("default.secret_key");
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
}
