package com.tencentcloudapi.common.provider;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.sts.v20180813.StsClient;
import com.tencentcloudapi.sts.v20180813.models.AssumeRoleRequest;
import com.tencentcloudapi.sts.v20180813.models.AssumeRoleResponse;

import java.util.Date;

public class STSCredentialsProvider implements CredentialsProvider{
    private String secretId;
    private String secretIKey;
    private String roleArn;
    private String roleSessionName;
    private String tmpSecretId;
    private String tmpSecretKey;
    private String token;
    private long expiredTime;
    public STSCredentialsProvider(String secretId, String secretIKey, String roleArn, String roleSessionName) {
        this.secretId = secretId;
        this.secretIKey = secretIKey;
        this.roleArn = roleArn;
        this.roleSessionName = roleSessionName;
    }

    @Override
    public Credential getCredentials() throws TencentCloudSDKException {
        if (needRefresh()) {
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
            return new Credential(tmpSecretId, tmpSecretKey, token);
        }
        if (tmpSecretId == null || tmpSecretKey ==null || token ==null) {
            return null;
        } else {
            return new Credential(tmpSecretId, tmpSecretKey, token);
        }
    }
    public boolean needRefresh() {
        if (expiredTime-new Date().getTime()/1000 <= 300) {
            return true;
        } else {
            return false;
        }
    }
}
