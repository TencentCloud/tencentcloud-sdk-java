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
     *申请扮演角色
     * @param req AssumeRoleRequest
     * @return AssumeRoleResponse
     * @throws TencentCloudSDKException
     */
    public AssumeRoleResponse AssumeRole(AssumeRoleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssumeRoleResponse> rsp = null;
        String rspStr = "";
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
     *本接口（AssumeRoleWithSAML）用于根据 SAML 断言申请角色临时凭证。
     * @param req AssumeRoleWithSAMLRequest
     * @return AssumeRoleWithSAMLResponse
     * @throws TencentCloudSDKException
     */
    public AssumeRoleWithSAMLResponse AssumeRoleWithSAML(AssumeRoleWithSAMLRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssumeRoleWithSAMLResponse> rsp = null;
        String rspStr = "";
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
     *获取联合身份临时访问凭证
     * @param req GetFederationTokenRequest
     * @return GetFederationTokenResponse
     * @throws TencentCloudSDKException
     */
    public GetFederationTokenResponse GetFederationToken(GetFederationTokenRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetFederationTokenResponse> rsp = null;
        String rspStr = "";
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
