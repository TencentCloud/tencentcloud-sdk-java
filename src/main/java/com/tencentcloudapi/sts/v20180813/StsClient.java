/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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

1、角色策略组成

（1）角色信任策略：指定谁可以扮演该角色；

（2）角色权限策略：指定扮演角色后可以执行哪些操作。


2、角色可扮演条件

（1）给用户绑定允许调用AssumeRole的策略 ；

（2）将用户添加为角色信任策略中的主体。
     * @param req AssumeRoleRequest
     * @return AssumeRoleResponse
     * @throws TencentCloudSDKException
     */
    public AssumeRoleResponse AssumeRole(AssumeRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssumeRole", AssumeRoleResponse.class);
    }

    /**
     *本接口（AssumeRoleWithSAML）用于根据 SAML 断言申请角色临时访问凭证。

注意：当使用签名方法 V3 调用本接口时，请求头无须传入 X-TC-Token, 但 Authorization 需要传入值 SKIP。
     * @param req AssumeRoleWithSAMLRequest
     * @return AssumeRoleWithSAMLResponse
     * @throws TencentCloudSDKException
     */
    public AssumeRoleWithSAMLResponse AssumeRoleWithSAML(AssumeRoleWithSAMLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(true);
        return this.internalRequest(req, "AssumeRoleWithSAML", AssumeRoleWithSAMLResponse.class);
    }

    /**
     *申请OIDC角色临时访问凭证。

注意：当使用签名方法 V3 调用本接口时，请求头无须传入 X-TC-Token, 但 Authorization 需要传入值 SKIP。
     * @param req AssumeRoleWithWebIdentityRequest
     * @return AssumeRoleWithWebIdentityResponse
     * @throws TencentCloudSDKException
     */
    public AssumeRoleWithWebIdentityResponse AssumeRoleWithWebIdentity(AssumeRoleWithWebIdentityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(true);
        return this.internalRequest(req, "AssumeRoleWithWebIdentity", AssumeRoleWithWebIdentityResponse.class);
    }

    /**
     *获取当前调用者的身份信息。

接口支持主账号，子账号长期密钥以及AssumeRole，GetFederationToken生成的临时访问凭证身份获取。
     * @param req GetCallerIdentityRequest
     * @return GetCallerIdentityResponse
     * @throws TencentCloudSDKException
     */
    public GetCallerIdentityResponse GetCallerIdentity(GetCallerIdentityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetCallerIdentity", GetCallerIdentityResponse.class);
    }

    /**
     ***使用说明**

1. 返回一组临时身份访问凭证，包含token和获取该身份的临时密钥；

2. 当您需要将当前账号下的部分权限和资源临时委托给第三方（如合作伙伴、外包团队），且希望避免下发永久密钥时，调用此接口；
3. 临时身份的权限为：当前调用账号的权限和输入参数 Policy 权限的交集；
4. 此接口仅支持永久密钥调用。


**典型场景**

1. 代理应用程序集中申请临时访问凭证，下发给企业网络内的其他分布式终端应用。例如：终端应用上传文件到COS。

2. 将指定资源临时委托给第三方代理。例如：申请临时访问凭证，分发给企业外部团队，仅允许查看某个存储桶，有效期结束后权限自动回收。


**最佳实践**
1. 临时访问凭证在有效期内（Expiration）都可以使用，建议在有效期内重复使用，避免业务请求该接口频率达到上限被限频；

2. 授予临时访问凭证权限的CAM策略，建议严格遵循最小权限原则；
3. 建议不要使用主账号永久密钥，对该接口进行调用。
     * @param req GetFederationTokenRequest
     * @return GetFederationTokenResponse
     * @throws TencentCloudSDKException
     */
    public GetFederationTokenResponse GetFederationToken(GetFederationTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetFederationToken", GetFederationTokenResponse.class);
    }

    /**
     *获取MFA临时证书
     * @param req GetSessionTokenRequest
     * @return GetSessionTokenResponse
     * @throws TencentCloudSDKException
     */
    public GetSessionTokenResponse GetSessionToken(GetSessionTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetSessionToken", GetSessionTokenResponse.class);
    }

    /**
     *拉取API密钥列表
     * @param req QueryApiKeyRequest
     * @return QueryApiKeyResponse
     * @throws TencentCloudSDKException
     */
    public QueryApiKeyResponse QueryApiKey(QueryApiKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryApiKey", QueryApiKeyResponse.class);
    }

}
