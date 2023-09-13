package com.tencentcloudapi.common.provider;

import com.google.gson.annotations.Expose;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.CommonClient;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

public class OIDCRoleArnProvider implements CredentialsProvider {
    private static final String Service = "sts";
    private static final String Version = "2018-08-13";
    private static final String Action = "AssumeRoleWithWebIdentity";
    private static final String DefaultSessionName = "tencentcloud-java-sdk-";
    private static final long DefaultDurationSeconds = 7200;
    public String Region;
    public String ProviderId;
    public String WebIdentityToken;
    public String RoleArn;
    public String RoleSessionName;
    public long DurationSeconds;

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
        // can not use sts package here, because it will cause circular dependency
        CommonClient client = new CommonClient(Service, Version, new Credential("", ""), Region);

        Request request = new Request();
        request.ProviderId = ProviderId;
        request.WebIdentityToken = WebIdentityToken;
        request.RoleArn = RoleArn;
        request.RoleSessionName = RoleSessionName;
        request.DurationSeconds = DurationSeconds;
        request.setSkipSign(true);

        String respStr = client.commonRequest(request, Action);

        JsonResponseModel<Response> response = client.gson.fromJson(respStr, new TypeToken<JsonResponseModel<Response>>() {
        }.getType());
        Response resp = response.response;
        return new Credential(resp.Credentials.TmpSecretId, resp.Credentials.TmpSecretKey, resp.Credentials.Token);
    }

    private static class Request extends AbstractModel {
        @Expose
        public String ProviderId;
        @Expose
        public String WebIdentityToken;
        @Expose
        public String RoleArn;
        @Expose
        public String RoleSessionName;
        @Expose
        public Long DurationSeconds;

        @Override
        protected void toMap(HashMap<String, String> map, String prefix) {
        }
    }

    private static class Response {
        @Expose
        public Long ExpiredTime;
        @Expose
        public String Expiration;
        @Expose
        public Credentials Credentials;
        @Expose
        public String RequestId;

        private static class Credentials {
            @Expose
            public String Token;
            @Expose
            public String TmpSecretId;
            @Expose
            public String TmpSecretKey;
        }
    }
}
