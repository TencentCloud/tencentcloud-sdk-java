package com.tencentcloudapi.common.provider;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;

public class DefaultCredentialsProvider implements CredentialsProvider {
    @Override
    public Credential getCredentials() throws TencentCloudSDKException {
        Credential cred;
        cred = new EnvironmentVariableCredentialsProvider().getCredentials();
        if (cred != null) {
            return cred;
        }
        cred = new ProfileCredentialsProvider().getCredentials();
        if (cred != null) {
            return cred;
        }
        cred = new CvmRoleCredentialsProvider().getCredentials();
        if (cred != null) {
            return cred;
        }
        throw new TencentCloudSDKException("no valid credentail.");
    }
}
