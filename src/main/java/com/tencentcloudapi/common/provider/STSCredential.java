package com.tencentcloudapi.common.provider;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.CommonClient;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class STSCredential extends Credential {
    private String secretId;
    private String secretKey;
    private String roleArn;
    private String roleSessionName;
    private String endpoint;
    private int expiredTime;

    public STSCredential(String secretId, String secretKey, String roleArn, String roleSessionName, String endpoint) {
        this.secretId = secretId;
        this.secretKey = secretKey;
        this.roleArn = roleArn;
        this.roleSessionName = roleSessionName;
        this.endpoint = endpoint;
    }

    public STSCredential(String secretId, String secretKey, String roleArn, String roleSessionName) {
        this(secretId, secretKey, roleArn, roleSessionName, "sts.tencentcloudapi.com");
    }

    /**
     * @deprecated use {@link #getSnapshot()} for any multi-field read. This getter is retained for
     * backward compatibility and triggers a refresh on stale state, but the read is not atomic
     * across the three fields.
     */
    @Override
    @Deprecated
    @SuppressWarnings("deprecation")
    public String getSecretId() {
        if (super.getSecretId() == null || needRefresh()) {
            try {
                updateCredential();
            } catch (TencentCloudSDKException e) {
                return null;
            }
        }
        return super.getSecretId();
    }

    /**
     * @deprecated use {@link #getSnapshot()} for any multi-field read.
     */
    @Override
    @Deprecated
    @SuppressWarnings("deprecation")
    public String getSecretKey() {
        if (super.getSecretKey() == null || needRefresh()) {
            try {
                updateCredential();
            } catch (TencentCloudSDKException e) {
                return null;
            }
        }
        return super.getSecretKey();
    }

    /**
     * @deprecated use {@link #getSnapshot()} for any multi-field read.
     */
    @Override
    @Deprecated
    @SuppressWarnings("deprecation")
    public String getToken() {
        if (super.getToken() == null || needRefresh()) {
            try {
                updateCredential();
            } catch (TencentCloudSDKException e) {
                return null;
            }
        }
        return super.getToken();
    }

    @SuppressWarnings("deprecation")
    private void updateCredential() throws TencentCloudSDKException {
        Credential cred = new Credential(secretId, secretKey);
        HttpProfile httpProfile = new HttpProfile();
        httpProfile.setEndpoint(endpoint);
        ClientProfile clientProfile = new ClientProfile();
        clientProfile.setHttpProfile(httpProfile);
        CommonClient client = new CommonClient("sts", "2018-08-13", cred, "ap-guangzhou", clientProfile);
        String resp = client.call("AssumeRole", "{\"RoleArn\":\"" + roleArn + "\","
                + "\"RoleSessionName\":\"" + roleSessionName + "\"}");
        Map<String, Object> map = new Gson().fromJson(resp, new TypeToken<HashMap<String, Object>>() {
        }.getType());
        Map<String, Object> respmap = (Map<String, Object>) map.get("Response");
        Map<String, String> credmap = (Map<String, String>) respmap.get("Credentials");
        // Write the refreshed triple into the parent class fields so that
        // getSnapshot() returns a self-consistent copy.
        super.setSecretId(credmap.get("TmpSecretId"));
        super.setSecretKey(credmap.get("TmpSecretKey"));
        super.setToken(credmap.get("Token"));
        expiredTime = ((Double) respmap.get("ExpiredTime")).intValue();
    }

    private boolean needRefresh() {
        if (expiredTime - new Date().getTime() / 1000 <= 300) {
            return true;
        } else {
            return false;
        }
    }
}
