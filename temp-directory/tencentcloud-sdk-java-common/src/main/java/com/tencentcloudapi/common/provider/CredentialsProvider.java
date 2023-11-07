package com.tencentcloudapi.common.provider;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;

public interface CredentialsProvider {
    public Credential getCredentials() throws TencentCloudSDKException;
}