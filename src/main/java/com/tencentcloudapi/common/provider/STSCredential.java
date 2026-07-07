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

/**
 * Assumes a CAM role via Security Token Service and exposes the resulting ephemeral triple as a
 * {@link Credential}. Refresh is driven by {@link UpdaterImpl}, attached at construction. Use
 * {@link Credential#getSnapshot()} for atomic reads.
 */
public class STSCredential extends Credential {
    public STSCredential(String secretId, String secretKey, String roleArn, String roleSessionName, String endpoint) {
        super();
        super.setUpdater(new UpdaterImpl(secretId, secretKey, roleArn, roleSessionName, endpoint));
    }

    public STSCredential(String secretId, String secretKey, String roleArn, String roleSessionName) {
        this(secretId, secretKey, roleArn, roleSessionName, "sts.tencentcloudapi.com");
    }

    /** Refreshes the triple via STS AssumeRole when the cached credentials are about to expire. */
    private static class UpdaterImpl implements Credential.Updater {
        private static final int EXPIRED_TIME = 300;
        private final String secretId;
        private final String secretKey;
        private final String roleArn;
        private final String roleSessionName;
        private final String endpoint;
        private int expiredTime;

        UpdaterImpl(String secretId, String secretKey, String roleArn, String roleSessionName, String endpoint) {
            this.secretId = secretId;
            this.secretKey = secretKey;
            this.roleArn = roleArn;
            this.roleSessionName = roleSessionName;
            this.endpoint = endpoint;
        }

        @Override
        public void update(Credential credential) throws TencentCloudSDKException {
            if (!needRefresh()) {
                return;
            }
            updateCredential(credential);
        }

        private void updateCredential(Credential credential) throws TencentCloudSDKException {
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
            credential.setCredential(
                    credmap.get("TmpSecretId"),
                    credmap.get("TmpSecretKey"),
                    credmap.get("Token"));
            expiredTime = ((Double) respmap.get("ExpiredTime")).intValue();
        }

        private boolean needRefresh() {
            if (expiredTime - new Date().getTime() / 1000 <= EXPIRED_TIME) {
                return true;
            } else {
                return false;
            }
        }
    }
}
