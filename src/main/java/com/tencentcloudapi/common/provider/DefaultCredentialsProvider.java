package com.tencentcloudapi.common.provider;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;

public class DefaultCredentialsProvider implements CredentialsProvider {
    @Override
    public Credential getCredentials() throws TencentCloudSDKException {
        Credential cred;
        try {
            cred = new EnvironmentVariableCredentialsProvider().getCredentials();
            return cred;
        } catch (TencentCloudSDKException e) {

        }
        try {
            cred = new ProfileCredentialsProvider().getCredentials();
            return cred;
        } catch (TencentCloudSDKException e) {

        }
        try {
            cred = new CvmRoleCredential();
            if (cred.getSecretId() != null && cred.getSecretKey() != null && cred.getToken() != null) {
                return cred;
            }
        } catch (RuntimeException e) {
            // Credential getters wrap refresh failures in RuntimeException.
            if (!(e.getCause() instanceof TencentCloudSDKException)) {
                throw e;
            }
        }

        cred = new OIDCRoleArnProvider().getCredentials();
        return cred;
    }
}
