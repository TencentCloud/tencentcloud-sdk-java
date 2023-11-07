package com.tencentcloudapi.common.provider;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;

import java.io.IOException;

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
        cred = new CvmRoleCredential();
        if (cred.getSecretId() != null && cred.getSecretKey() != null && cred.getToken() != null) {
            return cred;
        }

        try {
            cred = new OIDCRoleArnProvider().getCredentials();
            return cred;
        } catch (IOException e) {
        }

        throw new TencentCloudSDKException("No valid credential");
    }
}
