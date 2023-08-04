package com.tencentcloudapi.common.provider;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.sts.v20180813.StsClient;
import com.tencentcloudapi.sts.v20180813.models.AssumeRoleWithWebIdentityRequest;
import com.tencentcloudapi.sts.v20180813.models.AssumeRoleWithWebIdentityResponse;
import com.tencentcloudapi.sts.v20180813.models.Credentials;
import org.ini4j.Reg;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;

public class OIDCRoleArnProvider implements CredentialsProvider {
    public String Region;
    public String ProviderId;
    public String WebIdentityToken;
    public String RoleArn;
    public String RoleSessionName;
    public long DurationSeconds;

    private static final String DefaultSessionName = "tencentcloud-java-sdk-";
    private static final long DefaultDurationSeconds = 7200;

    public OIDCRoleArnProvider(String region, String providerId, String webIdentityToken,
                               String roleArn, String roleSessionName, long durationSeconds) {
        Region = region;
        ProviderId = providerId;
        WebIdentityToken = webIdentityToken;
        RoleArn = roleArn;
        RoleSessionName = roleSessionName;
        DurationSeconds = durationSeconds;
    }

    public OIDCRoleArnProvider() throws IOException, TencentCloudSDKException {
        Region = System.getenv("TKE_REGION");
        if (Region == null || Region.isEmpty())
            throw new TencentCloudSDKException("env TKE_REGION not exist");

        ProviderId = System.getenv("TKE_PROVIDER_ID");
        if (ProviderId == null || ProviderId.isEmpty())
            throw new TencentCloudSDKException("env TKE_PROVIDER_ID not exist");

        String tokenFile = System.getenv("TKE_WEB_IDENTITY_TOKEN_FILE");
        if (tokenFile == null || tokenFile.isEmpty())
            throw new TencentCloudSDKException("env TKE_WEB_IDENTITY_TOKEN_FILE not exist");

        WebIdentityToken = new String(Files.readAllBytes(Paths.get(tokenFile)));

        RoleArn = System.getenv("TKE_ROLE_ARN");
        if (RoleArn == null || RoleArn.isEmpty())
            throw new TencentCloudSDKException("env TKE_ROLE_ARN not exist");

        ProviderId = System.getenv("TKE_PROVIDER_ID");
        if (ProviderId == null || ProviderId.isEmpty())
            throw new TencentCloudSDKException("env TKE_PROVIDER_ID not exist");

        // timestamp in microseconds
        RoleSessionName = DefaultSessionName + System.currentTimeMillis() * 1000;
        DurationSeconds = DefaultDurationSeconds;
    }

    @Override
    public Credential getCredentials() throws TencentCloudSDKException {
        StsClient client = new StsClient(new Credential("", ""), Region);

        AssumeRoleWithWebIdentityRequest req = new AssumeRoleWithWebIdentityRequest();
        req.setProviderId(ProviderId);
        req.setWebIdentityToken(WebIdentityToken);
        req.setRoleArn(RoleArn);
        req.setRoleSessionName(RoleSessionName);
        req.setDurationSeconds(DurationSeconds);
        AssumeRoleWithWebIdentityResponse rep = client.AssumeRoleWithWebIdentity(req);

        Credentials credentials = rep.getCredentials();
        return new Credential(credentials.getTmpSecretId(), credentials.getTmpSecretKey(), credentials.getToken());
    }
}
