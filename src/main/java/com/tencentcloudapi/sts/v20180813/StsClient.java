/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.sts.v20180813;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.sts.v20180813.models.*;

public class StsClient extends AbstractClient{
    private static String endpoint = "sts.tencentcloudapi.com";
    private static String service = "sts";
    private static String version = "2018-08-13";
    
    public StsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public StsClient(Credential credential, String region, ClientProfile profile) {
        super(StsClient.endpoint, StsClient.version, credential, region, profile);
    }

    /**
     *申请扮演角色临时访问凭证。
     * @param req AssumeRoleRequest
     * @return AssumeRoleResponse
     * @throws TencentCloudSDKException
     */
    public AssumeRoleResponse AssumeRole(AssumeRoleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssumeRoleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<AssumeRoleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AssumeRole");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（AssumeRoleWithSAML）用于根据 SAML 断言申请角色临时访问凭证。

注意：当使用签名方法 V3 调用本接口时，请求头无须传入 X-TC-Token, 但 Authorization 需要传入值 SKIP。
     * @param req AssumeRoleWithSAMLRequest
     * @return AssumeRoleWithSAMLResponse
     * @throws TencentCloudSDKException
     */
    public AssumeRoleWithSAMLResponse AssumeRoleWithSAML(AssumeRoleWithSAMLRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssumeRoleWithSAMLResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(true);
        try {
                Type type = new TypeToken<JsonResponseModel<AssumeRoleWithSAMLResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AssumeRoleWithSAML");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *申请OIDC角色临时访问凭证。

注意：当使用签名方法 V3 调用本接口时，请求头无须传入 X-TC-Token, 但 Authorization 需要传入值 SKIP。
     * @param req AssumeRoleWithWebIdentityRequest
     * @return AssumeRoleWithWebIdentityResponse
     * @throws TencentCloudSDKException
     */
    public AssumeRoleWithWebIdentityResponse AssumeRoleWithWebIdentity(AssumeRoleWithWebIdentityRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssumeRoleWithWebIdentityResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(true);
        try {
                Type type = new TypeToken<JsonResponseModel<AssumeRoleWithWebIdentityResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AssumeRoleWithWebIdentity");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取当前调用者的身份信息。

接口支持主账号，子账号长期密钥以及AssumeRole，GetFederationToken生成的临时访问凭证身份获取。
     * @param req GetCallerIdentityRequest
     * @return GetCallerIdentityResponse
     * @throws TencentCloudSDKException
     */
    public GetCallerIdentityResponse GetCallerIdentity(GetCallerIdentityRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetCallerIdentityResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GetCallerIdentityResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetCallerIdentity");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     ***使用说明**

返回一组临时访问凭证，典型的应用场景是代理应用程序集中申请临时访问凭证，下发给企业网络内其他分布式终端应用，比如终端应用上传文件到COS场景，本接口仅支持永久密钥调用。

**最佳实践**

1. 临时访问凭据在有效期内都可以使用，建议在有效期内重复使用，以避免业务请求速率上升后被限频
2. 授予临时访问凭证权限的CAM策略，建议按权限最小化原则
3. 调用接口的永久密钥，建议不要使用主账号
     * @param req GetFederationTokenRequest
     * @return GetFederationTokenResponse
     * @throws TencentCloudSDKException
     */
    public GetFederationTokenResponse GetFederationToken(GetFederationTokenRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetFederationTokenResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GetFederationTokenResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetFederationToken");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *拉取API密钥列表
     * @param req QueryApiKeyRequest
     * @return QueryApiKeyResponse
     * @throws TencentCloudSDKException
     */
    public QueryApiKeyResponse QueryApiKey(QueryApiKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryApiKeyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<QueryApiKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryApiKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
