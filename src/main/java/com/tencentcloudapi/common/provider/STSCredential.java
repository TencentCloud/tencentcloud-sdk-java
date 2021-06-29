package com.tencentcloudapi.common.provider;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.sts.v20180813.StsClient;
import com.tencentcloudapi.sts.v20180813.models.AssumeRoleRequest;
import com.tencentcloudapi.sts.v20180813.models.AssumeRoleResponse;

import java.util.Date;

public class STSCredential extends Credential {
    private String secretId;
    private String secretIKey;
    private String roleArn;
    private String roleSessionName;
    private String tmpSecretId;
    private String tmpSecretKey;
    private String token;
    private long expiredTime;

    public STSCredential(String secretId, String secretIKey, String roleArn, String roleSessionName) {
        this.secretId = secretId;
        this.secretIKey = secretIKey;
        this.roleArn = roleArn;
        this.roleSessionName = roleSessionName;
    }

    public String getSecretId() throws TencentCloudSDKException {
        if (this.tmpSecretId == null || needRefresh()) {
            updataCredential();
        }
        return this.tmpSecretId;
    }

    public String getSecretKey() throws TencentCloudSDKException {
        if (this.tmpSecretKey == null || needRefresh()) {
            updataCredential();
        }
        return this.tmpSecretKey;
    }

    public String getToken() throws TencentCloudSDKException {
        if (token == null || needRefresh()) {
            updataCredential();
        }
        return this.token;
    }

    public void updataCredential() throws TencentCloudSDKException {
        Credential cred = new Credential(secretId, secretIKey);
        HttpProfile httpProfile = new HttpProfile();
        httpProfile.setEndpoint("sts.tencentcloudapi.com");
        ClientProfile clientProfile = new ClientProfile();
        clientProfile.setHttpProfile(httpProfile);
        StsClient client = new StsClient(cred, "ap-guangzhou", clientProfile);
        AssumeRoleRequest req = new AssumeRoleRequest();
        req.setRoleArn(roleArn);
        req.setRoleSessionName(roleSessionName);
        AssumeRoleResponse resp = client.AssumeRole(req);
        tmpSecretId = resp.getCredentials().getTmpSecretId();
        tmpSecretKey = resp.getCredentials().getTmpSecretKey();
        token = resp.getCredentials().getToken();
        expiredTime = resp.getExpiredTime();
    }

    public boolean needRefresh() {
        if (expiredTime-new Date().getTime()/1000 <= 300) {
            return true;
        } else {
            return false;
        }
    }
}