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
package com.tencentcloudapi.iap.v20240713;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.iap.v20240713.models.*;

public class IapClient extends AbstractClient{
    private static String endpoint = "iap.tencentcloudapi.com";
    private static String service = "iap";
    private static String version = "2024-07-13";

    public IapClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public IapClient(Credential credential, String region, ClientProfile profile) {
        super(IapClient.endpoint, IapClient.version, credential, region, profile);
    }

    /**
     *创建用户OIDC配置。只能创建一个用户OIDC身份提供商，并且创建用户OIDC配置之后会自动关闭用户SAML SSO身份提供商。
     * @param req CreateIAPUserOIDCConfigRequest
     * @return CreateIAPUserOIDCConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateIAPUserOIDCConfigResponse CreateIAPUserOIDCConfig(CreateIAPUserOIDCConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateIAPUserOIDCConfig", CreateIAPUserOIDCConfigResponse.class);
    }

    /**
     *查询登录会话时长
     * @param req DescribeIAPLoginSessionDurationRequest
     * @return DescribeIAPLoginSessionDurationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIAPLoginSessionDurationResponse DescribeIAPLoginSessionDuration(DescribeIAPLoginSessionDurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIAPLoginSessionDuration", DescribeIAPLoginSessionDurationResponse.class);
    }

    /**
     *查询用户OIDC配置
     * @param req DescribeIAPUserOIDCConfigRequest
     * @return DescribeIAPUserOIDCConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIAPUserOIDCConfigResponse DescribeIAPUserOIDCConfig(DescribeIAPUserOIDCConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIAPUserOIDCConfig", DescribeIAPUserOIDCConfigResponse.class);
    }

    /**
     *禁用用户SSO
     * @param req DisableIAPUserSSORequest
     * @return DisableIAPUserSSOResponse
     * @throws TencentCloudSDKException
     */
    public DisableIAPUserSSOResponse DisableIAPUserSSO(DisableIAPUserSSORequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableIAPUserSSO", DisableIAPUserSSOResponse.class);
    }

    /**
     *修改登录会话时长
     * @param req ModifyIAPLoginSessionDurationRequest
     * @return ModifyIAPLoginSessionDurationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyIAPLoginSessionDurationResponse ModifyIAPLoginSessionDuration(ModifyIAPLoginSessionDurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyIAPLoginSessionDuration", ModifyIAPLoginSessionDurationResponse.class);
    }

    /**
     *修改用户OIDC配置
     * @param req UpdateIAPUserOIDCConfigRequest
     * @return UpdateIAPUserOIDCConfigResponse
     * @throws TencentCloudSDKException
     */
    public UpdateIAPUserOIDCConfigResponse UpdateIAPUserOIDCConfig(UpdateIAPUserOIDCConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateIAPUserOIDCConfig", UpdateIAPUserOIDCConfigResponse.class);
    }

}
