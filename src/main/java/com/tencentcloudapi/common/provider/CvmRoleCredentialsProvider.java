package com.tencentcloudapi.common.provider;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class CvmRoleCredentialsProvider implements CredentialsProvider {
    private static final String ENDPOINT = "http://metadata.tencentyun.com/latest/meta-data/cam/security-credentials/";
    private static final int EXPIRED_TIME = 300;
    private String roleName;
    private String secretId;
    private String secretKey;
    private String token;
    private int expiredTime;

    public CvmRoleCredentialsProvider() {
    }

    public CvmRoleCredentialsProvider(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public  Credential getCredentials() throws TencentCloudSDKException {
        if (needRefresh()) {
            if (roleName == null) {
                roleName = loadJson(ENDPOINT);
            }
            String resp = loadJson(ENDPOINT+roleName);
            Map<String,Object> maps = new Gson().fromJson(resp, new TypeToken<HashMap<String,Object>>(){}.getType());
            if (!maps.get("Code").equals("Success")) {
                throw new TencentCloudSDKException("CVM role token data failed");
            }
            secretId = (String) maps.get("TmpSecretId");
            secretKey = (String) maps.get("TmpSecretKey");
            token = (String) maps.get("Token");
            expiredTime = (Integer) maps.get("ExpiredTime");
        }
        if (secretId == null || secretKey ==null || token ==null) {
            return null;
        } else {
            return new Credential(secretId,secretKey,token);
        }
    }

    public boolean needRefresh() {
        if (expiredTime-new Date().getTime()/1000 <= EXPIRED_TIME) {
            return true;
        } else {
            return false;
        }
    }

    public static String loadJson(String url) throws TencentCloudSDKException {
        StringBuilder json = new StringBuilder();
        try {
            URL urlObject = new URL(url);
            HttpURLConnection uc = (HttpURLConnection) urlObject.openConnection();
            BufferedReader in = null;
            in = new BufferedReader(new InputStreamReader(uc.getInputStream(), "utf-8"));
            String inputLine = null;
            while ((inputLine = in.readLine()) != null) {
                json.append(inputLine);
            }
            in.close();
            uc.disconnect();
        } catch (Exception e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return json.toString();
    }
}
