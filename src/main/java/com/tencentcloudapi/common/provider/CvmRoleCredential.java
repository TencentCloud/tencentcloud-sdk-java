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

/**
 * Fetches ephemeral CAM credentials from the CVM instance metadata service. Refresh is driven by
 * {@link UpdaterImpl}, attached at construction. Use {@link Credential#getSnapshot()} for atomic reads.
 */
public class CvmRoleCredential extends Credential {
    public CvmRoleCredential() {
        this(null);
    }

    public CvmRoleCredential(String roleName) {
        super();
        super.setUpdater(new UpdaterImpl(roleName));
    }

    /** Refreshes the triple from CVM metadata when the cached credentials are about to expire. */
    private static class UpdaterImpl implements Credential.Updater {
        private static final String ENDPOINT =
                "http://metadata.tencentyun.com/latest/meta-data/cam/security-credentials/";
        private static final int EXPIRED_TIME = 300;
        private String roleName;
        private int expiredTime;

        UpdaterImpl(String roleName) {
            this.roleName = roleName;
        }

        @Override
        public void update(Credential credential) throws TencentCloudSDKException {
            if (!needRefresh()) {
                return;
            }
            updateCredential(credential);
        }

        private void updateCredential(Credential credential) throws TencentCloudSDKException {
            if (roleName == null) {
                roleName = loadJson(ENDPOINT);
            }
            String resp = loadJson(ENDPOINT + roleName);
            Map<String, Object> maps = new Gson().fromJson(resp,
                    new TypeToken<HashMap<String, Object>>() {}.getType());
            if (!maps.get("Code").equals("Success")) {
                throw new TencentCloudSDKException("CVM role token data failed");
            }
            credential.setCredential(
                    (String) maps.get("TmpSecretId"),
                    (String) maps.get("TmpSecretKey"),
                    (String) maps.get("Token"));
            expiredTime = ((Double) maps.get("ExpiredTime")).intValue();
        }

        private boolean needRefresh() {
            if (expiredTime - new Date().getTime() / 1000 <= EXPIRED_TIME) {
                return true;
            } else {
                return false;
            }
        }

        private String loadJson(String url) throws TencentCloudSDKException {
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
}
