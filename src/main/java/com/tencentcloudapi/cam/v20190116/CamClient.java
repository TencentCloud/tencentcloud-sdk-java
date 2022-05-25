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
package com.tencentcloudapi.cam.v20190116;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cam.v20190116.models.*;

public class CamClient extends AbstractClient{
    private static String endpoint = "cam.tencentcloudapi.com";
    private static String service = "cam";
    private static String version = "2019-01-16";

    public CamClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CamClient(Credential credential, String region, ClientProfile profile) {
        super(CamClient.endpoint, CamClient.version, credential, region, profile);
    }

    /**
     *添加子用户
     * @param req AddUserRequest
     * @return AddUserResponse
     * @throws TencentCloudSDKException
     */
    public AddUserResponse AddUser(AddUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddUserResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用户加入到用户组
     * @param req AddUserToGroupRequest
     * @return AddUserToGroupResponse
     * @throws TencentCloudSDKException
     */
    public AddUserToGroupResponse AddUserToGroup(AddUserToGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddUserToGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddUserToGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddUserToGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（AttachGroupPolicy）可用于绑定策略到用户组。
     * @param req AttachGroupPolicyRequest
     * @return AttachGroupPolicyResponse
     * @throws TencentCloudSDKException
     */
    public AttachGroupPolicyResponse AttachGroupPolicy(AttachGroupPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AttachGroupPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AttachGroupPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AttachGroupPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（AttachRolePolicy）用于绑定策略到角色。
     * @param req AttachRolePolicyRequest
     * @return AttachRolePolicyResponse
     * @throws TencentCloudSDKException
     */
    public AttachRolePolicyResponse AttachRolePolicy(AttachRolePolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AttachRolePolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AttachRolePolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AttachRolePolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（AttachUserPolicy）可用于绑定到用户的策略。
     * @param req AttachUserPolicyRequest
     * @return AttachUserPolicyResponse
     * @throws TencentCloudSDKException
     */
    public AttachUserPolicyResponse AttachUserPolicy(AttachUserPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AttachUserPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AttachUserPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AttachUserPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *验证自定义多因子Token
     * @param req ConsumeCustomMFATokenRequest
     * @return ConsumeCustomMFATokenResponse
     * @throws TencentCloudSDKException
     */
    public ConsumeCustomMFATokenResponse ConsumeCustomMFAToken(ConsumeCustomMFATokenRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ConsumeCustomMFATokenResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ConsumeCustomMFATokenResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ConsumeCustomMFAToken");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建用户组
     * @param req CreateGroupRequest
     * @return CreateGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateGroupResponse CreateGroup(CreateGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建角色OIDC配置
     * @param req CreateOIDCConfigRequest
     * @return CreateOIDCConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateOIDCConfigResponse CreateOIDCConfig(CreateOIDCConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateOIDCConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateOIDCConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateOIDCConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreatePolicy）可用于创建策略。
     * @param req CreatePolicyRequest
     * @return CreatePolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreatePolicyResponse CreatePolicy(CreatePolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口（CreatePolicyVersion）用于新增策略版本，用户创建了一个策略版本之后可以方便的通过变更策略版本的方式来变更策略。
     * @param req CreatePolicyVersionRequest
     * @return CreatePolicyVersionResponse
     * @throws TencentCloudSDKException
     */
    public CreatePolicyVersionResponse CreatePolicyVersion(CreatePolicyVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePolicyVersionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePolicyVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePolicyVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateRole）用于创建角色。
     * @param req CreateRoleRequest
     * @return CreateRoleResponse
     * @throws TencentCloudSDKException
     */
    public CreateRoleResponse CreateRole(CreateRoleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRoleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRoleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateRole");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建SAML身份提供商
     * @param req CreateSAMLProviderRequest
     * @return CreateSAMLProviderResponse
     * @throws TencentCloudSDKException
     */
    public CreateSAMLProviderResponse CreateSAMLProvider(CreateSAMLProviderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSAMLProviderResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSAMLProviderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSAMLProvider");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建服务相关角色
     * @param req CreateServiceLinkedRoleRequest
     * @return CreateServiceLinkedRoleResponse
     * @throws TencentCloudSDKException
     */
    public CreateServiceLinkedRoleResponse CreateServiceLinkedRole(CreateServiceLinkedRoleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateServiceLinkedRoleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateServiceLinkedRoleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateServiceLinkedRole");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建用户OIDC配置。只能创建一个用户OIDC身份提供商，并且创建用户OIDC配置之后会自动关闭用户SAML SSO身份提供商。
     * @param req CreateUserOIDCConfigRequest
     * @return CreateUserOIDCConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserOIDCConfigResponse CreateUserOIDCConfig(CreateUserOIDCConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateUserOIDCConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateUserOIDCConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateUserOIDCConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建用户SAML配置
     * @param req CreateUserSAMLConfigRequest
     * @return CreateUserSAMLConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserSAMLConfigResponse CreateUserSAMLConfig(CreateUserSAMLConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateUserSAMLConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateUserSAMLConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateUserSAMLConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除用户组
     * @param req DeleteGroupRequest
     * @return DeleteGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGroupResponse DeleteGroup(DeleteGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除OIDC身份提供商
     * @param req DeleteOIDCConfigRequest
     * @return DeleteOIDCConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOIDCConfigResponse DeleteOIDCConfig(DeleteOIDCConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteOIDCConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteOIDCConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteOIDCConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeletePolicy）可用于删除策略。
     * @param req DeletePolicyRequest
     * @return DeletePolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeletePolicyResponse DeletePolicy(DeletePolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeletePolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeletePolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeletePolicyVersion）可用于删除一个策略的策略版本。
     * @param req DeletePolicyVersionRequest
     * @return DeletePolicyVersionResponse
     * @throws TencentCloudSDKException
     */
    public DeletePolicyVersionResponse DeletePolicyVersion(DeletePolicyVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeletePolicyVersionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePolicyVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeletePolicyVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteRole）用于删除指定角色。
     * @param req DeleteRoleRequest
     * @return DeleteRoleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRoleResponse DeleteRole(DeleteRoleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRoleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRoleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRole");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除角色权限边界
     * @param req DeleteRolePermissionsBoundaryRequest
     * @return DeleteRolePermissionsBoundaryResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRolePermissionsBoundaryResponse DeleteRolePermissionsBoundary(DeleteRolePermissionsBoundaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRolePermissionsBoundaryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRolePermissionsBoundaryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRolePermissionsBoundary");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除SAML身份提供商
     * @param req DeleteSAMLProviderRequest
     * @return DeleteSAMLProviderResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSAMLProviderResponse DeleteSAMLProvider(DeleteSAMLProviderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSAMLProviderResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSAMLProviderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteSAMLProvider");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除服务相关角色
     * @param req DeleteServiceLinkedRoleRequest
     * @return DeleteServiceLinkedRoleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteServiceLinkedRoleResponse DeleteServiceLinkedRole(DeleteServiceLinkedRoleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteServiceLinkedRoleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteServiceLinkedRoleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteServiceLinkedRole");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除子用户
     * @param req DeleteUserRequest
     * @return DeleteUserResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUserResponse DeleteUser(DeleteUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteUserResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除用户权限边界
     * @param req DeleteUserPermissionsBoundaryRequest
     * @return DeleteUserPermissionsBoundaryResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUserPermissionsBoundaryResponse DeleteUserPermissionsBoundary(DeleteUserPermissionsBoundaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteUserPermissionsBoundaryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteUserPermissionsBoundaryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteUserPermissionsBoundary");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询角色OIDC配置
     * @param req DescribeOIDCConfigRequest
     * @return DescribeOIDCConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOIDCConfigResponse DescribeOIDCConfig(DescribeOIDCConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOIDCConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOIDCConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOIDCConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeRoleList）用于获取账号下的角色列表。
     * @param req DescribeRoleListRequest
     * @return DescribeRoleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRoleListResponse DescribeRoleList(DescribeRoleListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRoleListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRoleListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRoleList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询用户安全设置
     * @param req DescribeSafeAuthFlagRequest
     * @return DescribeSafeAuthFlagResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSafeAuthFlagResponse DescribeSafeAuthFlag(DescribeSafeAuthFlagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSafeAuthFlagResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSafeAuthFlagResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSafeAuthFlag");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询安全设置
     * @param req DescribeSafeAuthFlagCollRequest
     * @return DescribeSafeAuthFlagCollResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSafeAuthFlagCollResponse DescribeSafeAuthFlagColl(DescribeSafeAuthFlagCollRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSafeAuthFlagCollResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSafeAuthFlagCollResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSafeAuthFlagColl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询安全设置(国际站)
     * @param req DescribeSafeAuthFlagIntlRequest
     * @return DescribeSafeAuthFlagIntlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSafeAuthFlagIntlResponse DescribeSafeAuthFlagIntl(DescribeSafeAuthFlagIntlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSafeAuthFlagIntlResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSafeAuthFlagIntlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSafeAuthFlagIntl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过子用户UIN列表查询子用户
     * @param req DescribeSubAccountsRequest
     * @return DescribeSubAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubAccountsResponse DescribeSubAccounts(DescribeSubAccountsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSubAccountsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSubAccountsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSubAccounts");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询用户OIDC配置
     * @param req DescribeUserOIDCConfigRequest
     * @return DescribeUserOIDCConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserOIDCConfigResponse DescribeUserOIDCConfig(DescribeUserOIDCConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserOIDCConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserOIDCConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUserOIDCConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询用户SAML配置
     * @param req DescribeUserSAMLConfigRequest
     * @return DescribeUserSAMLConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserSAMLConfigResponse DescribeUserSAMLConfig(DescribeUserSAMLConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserSAMLConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserSAMLConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUserSAMLConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DetachGroupPolicy）可用于解除绑定到用户组的策略。
     * @param req DetachGroupPolicyRequest
     * @return DetachGroupPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DetachGroupPolicyResponse DetachGroupPolicy(DetachGroupPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetachGroupPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DetachGroupPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DetachGroupPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DetachRolePolicy）用于解除绑定角色的策略。
     * @param req DetachRolePolicyRequest
     * @return DetachRolePolicyResponse
     * @throws TencentCloudSDKException
     */
    public DetachRolePolicyResponse DetachRolePolicy(DetachRolePolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetachRolePolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DetachRolePolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DetachRolePolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DetachUserPolicy）可用于解除绑定到用户的策略。
     * @param req DetachUserPolicyRequest
     * @return DetachUserPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DetachUserPolicyResponse DetachUserPolicy(DetachUserPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetachUserPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DetachUserPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DetachUserPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *禁用用户SSO
     * @param req DisableUserSSORequest
     * @return DisableUserSSOResponse
     * @throws TencentCloudSDKException
     */
    public DisableUserSSOResponse DisableUserSSO(DisableUserSSORequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableUserSSOResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DisableUserSSOResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisableUserSSO");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询账户摘要 
     * @param req GetAccountSummaryRequest
     * @return GetAccountSummaryResponse
     * @throws TencentCloudSDKException
     */
    public GetAccountSummaryResponse GetAccountSummary(GetAccountSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetAccountSummaryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetAccountSummaryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetAccountSummary");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取自定义多因子Token关联信息
     * @param req GetCustomMFATokenInfoRequest
     * @return GetCustomMFATokenInfoResponse
     * @throws TencentCloudSDKException
     */
    public GetCustomMFATokenInfoResponse GetCustomMFATokenInfo(GetCustomMFATokenInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetCustomMFATokenInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetCustomMFATokenInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetCustomMFATokenInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询用户组详情
     * @param req GetGroupRequest
     * @return GetGroupResponse
     * @throws TencentCloudSDKException
     */
    public GetGroupResponse GetGroup(GetGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（GetPolicy）可用于查询查看策略详情。
     * @param req GetPolicyRequest
     * @return GetPolicyResponse
     * @throws TencentCloudSDKException
     */
    public GetPolicyResponse GetPolicy(GetPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口（GetPolicyVersion）用于查询策略版本详情
     * @param req GetPolicyVersionRequest
     * @return GetPolicyVersionResponse
     * @throws TencentCloudSDKException
     */
    public GetPolicyVersionResponse GetPolicyVersion(GetPolicyVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetPolicyVersionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetPolicyVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetPolicyVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（GetRole）用于获取指定角色的详细信息。
     * @param req GetRoleRequest
     * @return GetRoleResponse
     * @throws TencentCloudSDKException
     */
    public GetRoleResponse GetRole(GetRoleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetRoleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetRoleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetRole");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取角色权限边界
     * @param req GetRolePermissionBoundaryRequest
     * @return GetRolePermissionBoundaryResponse
     * @throws TencentCloudSDKException
     */
    public GetRolePermissionBoundaryResponse GetRolePermissionBoundary(GetRolePermissionBoundaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetRolePermissionBoundaryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetRolePermissionBoundaryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetRolePermissionBoundary");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询SAML身份提供商详情
     * @param req GetSAMLProviderRequest
     * @return GetSAMLProviderResponse
     * @throws TencentCloudSDKException
     */
    public GetSAMLProviderResponse GetSAMLProvider(GetSAMLProviderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetSAMLProviderResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetSAMLProviderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetSAMLProvider");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取密钥最近使用情况
     * @param req GetSecurityLastUsedRequest
     * @return GetSecurityLastUsedResponse
     * @throws TencentCloudSDKException
     */
    public GetSecurityLastUsedResponse GetSecurityLastUsed(GetSecurityLastUsedRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetSecurityLastUsedResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetSecurityLastUsedResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetSecurityLastUsed");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据删除TaskId获取服务相关角色删除状态
     * @param req GetServiceLinkedRoleDeletionStatusRequest
     * @return GetServiceLinkedRoleDeletionStatusResponse
     * @throws TencentCloudSDKException
     */
    public GetServiceLinkedRoleDeletionStatusResponse GetServiceLinkedRoleDeletionStatus(GetServiceLinkedRoleDeletionStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetServiceLinkedRoleDeletionStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetServiceLinkedRoleDeletionStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetServiceLinkedRoleDeletionStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询子用户
     * @param req GetUserRequest
     * @return GetUserResponse
     * @throws TencentCloudSDKException
     */
    public GetUserResponse GetUser(GetUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetUserResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取用户AppId
     * @param req GetUserAppIdRequest
     * @return GetUserAppIdResponse
     * @throws TencentCloudSDKException
     */
    public GetUserAppIdResponse GetUserAppId(GetUserAppIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetUserAppIdResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetUserAppIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetUserAppId");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取用户权限边界
     * @param req GetUserPermissionBoundaryRequest
     * @return GetUserPermissionBoundaryResponse
     * @throws TencentCloudSDKException
     */
    public GetUserPermissionBoundaryResponse GetUserPermissionBoundary(GetUserPermissionBoundaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetUserPermissionBoundaryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetUserPermissionBoundaryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetUserPermissionBoundary");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *列出指定CAM用户的访问密钥
     * @param req ListAccessKeysRequest
     * @return ListAccessKeysResponse
     * @throws TencentCloudSDKException
     */
    public ListAccessKeysResponse ListAccessKeys(ListAccessKeysRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListAccessKeysResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListAccessKeysResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListAccessKeys");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ListAttachedGroupPolicies）可用于查询用户组关联的策略列表。
     * @param req ListAttachedGroupPoliciesRequest
     * @return ListAttachedGroupPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public ListAttachedGroupPoliciesResponse ListAttachedGroupPolicies(ListAttachedGroupPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListAttachedGroupPoliciesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListAttachedGroupPoliciesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListAttachedGroupPolicies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ListAttachedRolePolicies）用于获取角色绑定的策略列表。
     * @param req ListAttachedRolePoliciesRequest
     * @return ListAttachedRolePoliciesResponse
     * @throws TencentCloudSDKException
     */
    public ListAttachedRolePoliciesResponse ListAttachedRolePolicies(ListAttachedRolePoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListAttachedRolePoliciesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListAttachedRolePoliciesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListAttachedRolePolicies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *列出用户关联的策略（包括随组关联）
     * @param req ListAttachedUserAllPoliciesRequest
     * @return ListAttachedUserAllPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public ListAttachedUserAllPoliciesResponse ListAttachedUserAllPolicies(ListAttachedUserAllPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListAttachedUserAllPoliciesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListAttachedUserAllPoliciesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListAttachedUserAllPolicies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ListAttachedUserPolicies）可用于查询子账号关联的策略列表。
     * @param req ListAttachedUserPoliciesRequest
     * @return ListAttachedUserPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public ListAttachedUserPoliciesResponse ListAttachedUserPolicies(ListAttachedUserPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListAttachedUserPoliciesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListAttachedUserPoliciesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListAttachedUserPolicies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取协作者列表
     * @param req ListCollaboratorsRequest
     * @return ListCollaboratorsResponse
     * @throws TencentCloudSDKException
     */
    public ListCollaboratorsResponse ListCollaborators(ListCollaboratorsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListCollaboratorsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListCollaboratorsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListCollaborators");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ListEntitiesForPolicy）可用于查询策略关联的实体列表。
     * @param req ListEntitiesForPolicyRequest
     * @return ListEntitiesForPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ListEntitiesForPolicyResponse ListEntitiesForPolicy(ListEntitiesForPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListEntitiesForPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListEntitiesForPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListEntitiesForPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询用户组列表
     * @param req ListGroupsRequest
     * @return ListGroupsResponse
     * @throws TencentCloudSDKException
     */
    public ListGroupsResponse ListGroups(ListGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListGroupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *列出用户关联的用户组
     * @param req ListGroupsForUserRequest
     * @return ListGroupsForUserResponse
     * @throws TencentCloudSDKException
     */
    public ListGroupsForUserResponse ListGroupsForUser(ListGroupsForUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListGroupsForUserResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListGroupsForUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListGroupsForUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ListPolicies）可用于查询策略列表。
     * @param req ListPoliciesRequest
     * @return ListPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public ListPoliciesResponse ListPolicies(ListPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListPoliciesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListPoliciesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListPolicies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取所有已授权服务
     * @param req ListPoliciesGrantingServiceAccessRequest
     * @return ListPoliciesGrantingServiceAccessResponse
     * @throws TencentCloudSDKException
     */
    public ListPoliciesGrantingServiceAccessResponse ListPoliciesGrantingServiceAccess(ListPoliciesGrantingServiceAccessRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListPoliciesGrantingServiceAccessResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListPoliciesGrantingServiceAccessResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListPoliciesGrantingServiceAccess");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口（ListPolicyVersions）用于获取策略版本列表
     * @param req ListPolicyVersionsRequest
     * @return ListPolicyVersionsResponse
     * @throws TencentCloudSDKException
     */
    public ListPolicyVersionsResponse ListPolicyVersions(ListPolicyVersionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListPolicyVersionsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListPolicyVersionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListPolicyVersions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询SAML身份提供商列表
     * @param req ListSAMLProvidersRequest
     * @return ListSAMLProvidersResponse
     * @throws TencentCloudSDKException
     */
    public ListSAMLProvidersResponse ListSAMLProviders(ListSAMLProvidersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListSAMLProvidersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListSAMLProvidersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListSAMLProviders");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *拉取子用户
     * @param req ListUsersRequest
     * @return ListUsersResponse
     * @throws TencentCloudSDKException
     */
    public ListUsersResponse ListUsers(ListUsersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListUsersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListUsersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListUsers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询用户组关联的用户列表
     * @param req ListUsersForGroupRequest
     * @return ListUsersForGroupResponse
     * @throws TencentCloudSDKException
     */
    public ListUsersForGroupResponse ListUsersForGroup(ListUsersForGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListUsersForGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListUsersForGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListUsersForGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取企业微信子用户列表
     * @param req ListWeChatWorkSubAccountsRequest
     * @return ListWeChatWorkSubAccountsResponse
     * @throws TencentCloudSDKException
     */
    public ListWeChatWorkSubAccountsResponse ListWeChatWorkSubAccounts(ListWeChatWorkSubAccountsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListWeChatWorkSubAccountsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListWeChatWorkSubAccountsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListWeChatWorkSubAccounts");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置角色权限边界
     * @param req PutRolePermissionsBoundaryRequest
     * @return PutRolePermissionsBoundaryResponse
     * @throws TencentCloudSDKException
     */
    public PutRolePermissionsBoundaryResponse PutRolePermissionsBoundary(PutRolePermissionsBoundaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PutRolePermissionsBoundaryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PutRolePermissionsBoundaryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PutRolePermissionsBoundary");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置用户权限边界
     * @param req PutUserPermissionsBoundaryRequest
     * @return PutUserPermissionsBoundaryResponse
     * @throws TencentCloudSDKException
     */
    public PutUserPermissionsBoundaryResponse PutUserPermissionsBoundary(PutUserPermissionsBoundaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PutUserPermissionsBoundaryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PutUserPermissionsBoundaryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PutUserPermissionsBoundary");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *从用户组删除用户
     * @param req RemoveUserFromGroupRequest
     * @return RemoveUserFromGroupResponse
     * @throws TencentCloudSDKException
     */
    public RemoveUserFromGroupResponse RemoveUserFromGroup(RemoveUserFromGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RemoveUserFromGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RemoveUserFromGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RemoveUserFromGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（SetDefaultPolicyVersion）可用于设置生效的策略版本。
     * @param req SetDefaultPolicyVersionRequest
     * @return SetDefaultPolicyVersionResponse
     * @throws TencentCloudSDKException
     */
    public SetDefaultPolicyVersionResponse SetDefaultPolicyVersion(SetDefaultPolicyVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetDefaultPolicyVersionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SetDefaultPolicyVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetDefaultPolicyVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置子用户的登录保护和敏感操作校验方式
     * @param req SetMfaFlagRequest
     * @return SetMfaFlagResponse
     * @throws TencentCloudSDKException
     */
    public SetMfaFlagResponse SetMfaFlag(SetMfaFlagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetMfaFlagResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SetMfaFlagResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetMfaFlag");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *角色绑定标签
     * @param req TagRoleRequest
     * @return TagRoleResponse
     * @throws TencentCloudSDKException
     */
    public TagRoleResponse TagRole(TagRoleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TagRoleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<TagRoleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TagRole");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *角色解绑标签。
     * @param req UntagRoleRequest
     * @return UntagRoleResponse
     * @throws TencentCloudSDKException
     */
    public UntagRoleResponse UntagRole(UntagRoleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UntagRoleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UntagRoleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UntagRole");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UpdateAssumeRolePolicy）用于修改角色信任策略的策略文档。
     * @param req UpdateAssumeRolePolicyRequest
     * @return UpdateAssumeRolePolicyResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAssumeRolePolicyResponse UpdateAssumeRolePolicy(UpdateAssumeRolePolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateAssumeRolePolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateAssumeRolePolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateAssumeRolePolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新用户组
     * @param req UpdateGroupRequest
     * @return UpdateGroupResponse
     * @throws TencentCloudSDKException
     */
    public UpdateGroupResponse UpdateGroup(UpdateGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改角色OIDC配置
     * @param req UpdateOIDCConfigRequest
     * @return UpdateOIDCConfigResponse
     * @throws TencentCloudSDKException
     */
    public UpdateOIDCConfigResponse UpdateOIDCConfig(UpdateOIDCConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateOIDCConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateOIDCConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateOIDCConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UpdatePolicy ）可用于更新策略。
如果已存在策略版本，本接口会直接更新策略的默认版本，不会创建新版本，如果不存在任何策略版本，则直接创建一个默认版本。
     * @param req UpdatePolicyRequest
     * @return UpdatePolicyResponse
     * @throws TencentCloudSDKException
     */
    public UpdatePolicyResponse UpdatePolicy(UpdatePolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdatePolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdatePolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdatePolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UpdateRoleConsoleLogin）用于修改角色是否可登录。
     * @param req UpdateRoleConsoleLoginRequest
     * @return UpdateRoleConsoleLoginResponse
     * @throws TencentCloudSDKException
     */
    public UpdateRoleConsoleLoginResponse UpdateRoleConsoleLogin(UpdateRoleConsoleLoginRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateRoleConsoleLoginResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateRoleConsoleLoginResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateRoleConsoleLogin");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UpdateRoleDescription）用于修改角色的描述信息。
     * @param req UpdateRoleDescriptionRequest
     * @return UpdateRoleDescriptionResponse
     * @throws TencentCloudSDKException
     */
    public UpdateRoleDescriptionResponse UpdateRoleDescription(UpdateRoleDescriptionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateRoleDescriptionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateRoleDescriptionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateRoleDescription");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新SAML身份提供商信息
     * @param req UpdateSAMLProviderRequest
     * @return UpdateSAMLProviderResponse
     * @throws TencentCloudSDKException
     */
    public UpdateSAMLProviderResponse UpdateSAMLProvider(UpdateSAMLProviderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateSAMLProviderResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateSAMLProviderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateSAMLProvider");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新子用户
     * @param req UpdateUserRequest
     * @return UpdateUserResponse
     * @throws TencentCloudSDKException
     */
    public UpdateUserResponse UpdateUser(UpdateUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateUserResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改用户OIDC配置
     * @param req UpdateUserOIDCConfigRequest
     * @return UpdateUserOIDCConfigResponse
     * @throws TencentCloudSDKException
     */
    public UpdateUserOIDCConfigResponse UpdateUserOIDCConfig(UpdateUserOIDCConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateUserOIDCConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateUserOIDCConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateUserOIDCConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改用户SAML配置
     * @param req UpdateUserSAMLConfigRequest
     * @return UpdateUserSAMLConfigResponse
     * @throws TencentCloudSDKException
     */
    public UpdateUserSAMLConfigResponse UpdateUserSAMLConfig(UpdateUserSAMLConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateUserSAMLConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateUserSAMLConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateUserSAMLConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
