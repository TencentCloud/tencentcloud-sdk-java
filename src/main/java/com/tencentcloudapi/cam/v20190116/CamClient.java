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
     *创建子用户
     * @param req AddUserRequest
     * @return AddUserResponse
     * @throws TencentCloudSDKException
     */
    public AddUserResponse AddUser(AddUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddUser", AddUserResponse.class);
    }

    /**
     *用户加入到用户组
     * @param req AddUserToGroupRequest
     * @return AddUserToGroupResponse
     * @throws TencentCloudSDKException
     */
    public AddUserToGroupResponse AddUserToGroup(AddUserToGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddUserToGroup", AddUserToGroupResponse.class);
    }

    /**
     *本接口（AttachGroupPolicy）可用于绑定策略到用户组。
     * @param req AttachGroupPolicyRequest
     * @return AttachGroupPolicyResponse
     * @throws TencentCloudSDKException
     */
    public AttachGroupPolicyResponse AttachGroupPolicy(AttachGroupPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AttachGroupPolicy", AttachGroupPolicyResponse.class);
    }

    /**
     *本接口（AttachRolePolicy）用于绑定策略到角色。
     * @param req AttachRolePolicyRequest
     * @return AttachRolePolicyResponse
     * @throws TencentCloudSDKException
     */
    public AttachRolePolicyResponse AttachRolePolicy(AttachRolePolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AttachRolePolicy", AttachRolePolicyResponse.class);
    }

    /**
     *本接口（AttachUserPolicy）可用于绑定到用户的策略。
     * @param req AttachUserPolicyRequest
     * @return AttachUserPolicyResponse
     * @throws TencentCloudSDKException
     */
    public AttachUserPolicyResponse AttachUserPolicy(AttachUserPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AttachUserPolicy", AttachUserPolicyResponse.class);
    }

    /**
     *获取数据流认证Token
     * @param req BuildDataFlowAuthTokenRequest
     * @return BuildDataFlowAuthTokenResponse
     * @throws TencentCloudSDKException
     */
    public BuildDataFlowAuthTokenResponse BuildDataFlowAuthToken(BuildDataFlowAuthTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BuildDataFlowAuthToken", BuildDataFlowAuthTokenResponse.class);
    }

    /**
     *验证自定义多因子Token
     * @param req ConsumeCustomMFATokenRequest
     * @return ConsumeCustomMFATokenResponse
     * @throws TencentCloudSDKException
     */
    public ConsumeCustomMFATokenResponse ConsumeCustomMFAToken(ConsumeCustomMFATokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ConsumeCustomMFAToken", ConsumeCustomMFATokenResponse.class);
    }

    /**
     *为CAM用户创建访问密钥
     * @param req CreateAccessKeyRequest
     * @return CreateAccessKeyResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccessKeyResponse CreateAccessKey(CreateAccessKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAccessKey", CreateAccessKeyResponse.class);
    }

    /**
     *创建用户组
     * @param req CreateGroupRequest
     * @return CreateGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateGroupResponse CreateGroup(CreateGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateGroup", CreateGroupResponse.class);
    }

    /**
     *创建消息接收人接口：仅允许已完成实名认证的用户访问消息接收人接口，并对每个用户限制每天最多请求10次。
     * @param req CreateMessageReceiverRequest
     * @return CreateMessageReceiverResponse
     * @throws TencentCloudSDKException
     */
    public CreateMessageReceiverResponse CreateMessageReceiver(CreateMessageReceiverRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMessageReceiver", CreateMessageReceiverResponse.class);
    }

    /**
     *创建角色OIDC配置
     * @param req CreateOIDCConfigRequest
     * @return CreateOIDCConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateOIDCConfigResponse CreateOIDCConfig(CreateOIDCConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateOIDCConfig", CreateOIDCConfigResponse.class);
    }

    /**
     *本接口（CreatePolicy）可用于创建策略。
     * @param req CreatePolicyRequest
     * @return CreatePolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreatePolicyResponse CreatePolicy(CreatePolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePolicy", CreatePolicyResponse.class);
    }

    /**
     *该接口（CreatePolicyVersion）用于新增策略版本，用户创建了一个策略版本之后可以方便的通过变更策略版本的方式来变更策略。
     * @param req CreatePolicyVersionRequest
     * @return CreatePolicyVersionResponse
     * @throws TencentCloudSDKException
     */
    public CreatePolicyVersionResponse CreatePolicyVersion(CreatePolicyVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePolicyVersion", CreatePolicyVersionResponse.class);
    }

    /**
     *本接口（CreateRole）用于创建角色。
     * @param req CreateRoleRequest
     * @return CreateRoleResponse
     * @throws TencentCloudSDKException
     */
    public CreateRoleResponse CreateRole(CreateRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRole", CreateRoleResponse.class);
    }

    /**
     *创建SAML身份提供商
     * @param req CreateSAMLProviderRequest
     * @return CreateSAMLProviderResponse
     * @throws TencentCloudSDKException
     */
    public CreateSAMLProviderResponse CreateSAMLProvider(CreateSAMLProviderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSAMLProvider", CreateSAMLProviderResponse.class);
    }

    /**
     *创建服务相关角色
     * @param req CreateServiceLinkedRoleRequest
     * @return CreateServiceLinkedRoleResponse
     * @throws TencentCloudSDKException
     */
    public CreateServiceLinkedRoleResponse CreateServiceLinkedRole(CreateServiceLinkedRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateServiceLinkedRole", CreateServiceLinkedRoleResponse.class);
    }

    /**
     *创建用户OIDC配置。只能创建一个用户OIDC身份提供商，并且创建用户OIDC配置之后会自动关闭用户SAML SSO身份提供商。
     * @param req CreateUserOIDCConfigRequest
     * @return CreateUserOIDCConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserOIDCConfigResponse CreateUserOIDCConfig(CreateUserOIDCConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateUserOIDCConfig", CreateUserOIDCConfigResponse.class);
    }

    /**
     *创建用户SAML配置
     * @param req CreateUserSAMLConfigRequest
     * @return CreateUserSAMLConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserSAMLConfigResponse CreateUserSAMLConfig(CreateUserSAMLConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateUserSAMLConfig", CreateUserSAMLConfigResponse.class);
    }

    /**
     *为CAM用户删除访问密钥。
此接口属于高风险操作，删除密钥后不可恢复，腾讯云将永久拒绝此密钥的所有请求，请谨慎使用。
     * @param req DeleteAccessKeyRequest
     * @return DeleteAccessKeyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAccessKeyResponse DeleteAccessKey(DeleteAccessKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAccessKey", DeleteAccessKeyResponse.class);
    }

    /**
     *删除用户组
     * @param req DeleteGroupRequest
     * @return DeleteGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGroupResponse DeleteGroup(DeleteGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteGroup", DeleteGroupResponse.class);
    }

    /**
     *删除消息接收人
     * @param req DeleteMessageReceiverRequest
     * @return DeleteMessageReceiverResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMessageReceiverResponse DeleteMessageReceiver(DeleteMessageReceiverRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMessageReceiver", DeleteMessageReceiverResponse.class);
    }

    /**
     *删除OIDC身份提供商
     * @param req DeleteOIDCConfigRequest
     * @return DeleteOIDCConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOIDCConfigResponse DeleteOIDCConfig(DeleteOIDCConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteOIDCConfig", DeleteOIDCConfigResponse.class);
    }

    /**
     *本接口（DeletePolicy）可用于删除策略。
     * @param req DeletePolicyRequest
     * @return DeletePolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeletePolicyResponse DeletePolicy(DeletePolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePolicy", DeletePolicyResponse.class);
    }

    /**
     *本接口（DeletePolicyVersion）可用于删除一个策略的策略版本。
     * @param req DeletePolicyVersionRequest
     * @return DeletePolicyVersionResponse
     * @throws TencentCloudSDKException
     */
    public DeletePolicyVersionResponse DeletePolicyVersion(DeletePolicyVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePolicyVersion", DeletePolicyVersionResponse.class);
    }

    /**
     *本接口（DeleteRole）用于删除指定角色。
     * @param req DeleteRoleRequest
     * @return DeleteRoleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRoleResponse DeleteRole(DeleteRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRole", DeleteRoleResponse.class);
    }

    /**
     *删除角色权限边界
     * @param req DeleteRolePermissionsBoundaryRequest
     * @return DeleteRolePermissionsBoundaryResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRolePermissionsBoundaryResponse DeleteRolePermissionsBoundary(DeleteRolePermissionsBoundaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRolePermissionsBoundary", DeleteRolePermissionsBoundaryResponse.class);
    }

    /**
     *删除SAML身份提供商
     * @param req DeleteSAMLProviderRequest
     * @return DeleteSAMLProviderResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSAMLProviderResponse DeleteSAMLProvider(DeleteSAMLProviderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSAMLProvider", DeleteSAMLProviderResponse.class);
    }

    /**
     *删除服务相关角色
     * @param req DeleteServiceLinkedRoleRequest
     * @return DeleteServiceLinkedRoleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteServiceLinkedRoleResponse DeleteServiceLinkedRole(DeleteServiceLinkedRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteServiceLinkedRole", DeleteServiceLinkedRoleResponse.class);
    }

    /**
     *删除子用户
     * @param req DeleteUserRequest
     * @return DeleteUserResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUserResponse DeleteUser(DeleteUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteUser", DeleteUserResponse.class);
    }

    /**
     *删除用户权限边界
     * @param req DeleteUserPermissionsBoundaryRequest
     * @return DeleteUserPermissionsBoundaryResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUserPermissionsBoundaryResponse DeleteUserPermissionsBoundary(DeleteUserPermissionsBoundaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteUserPermissionsBoundary", DeleteUserPermissionsBoundaryResponse.class);
    }

    /**
     *查询角色OIDC配置
     * @param req DescribeOIDCConfigRequest
     * @return DescribeOIDCConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOIDCConfigResponse DescribeOIDCConfig(DescribeOIDCConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOIDCConfig", DescribeOIDCConfigResponse.class);
    }

    /**
     *本接口（DescribeRoleList）用于获取账号下的角色列表。
     * @param req DescribeRoleListRequest
     * @return DescribeRoleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRoleListResponse DescribeRoleList(DescribeRoleListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRoleList", DescribeRoleListResponse.class);
    }

    /**
     *查询用户安全设置
     * @param req DescribeSafeAuthFlagRequest
     * @return DescribeSafeAuthFlagResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSafeAuthFlagResponse DescribeSafeAuthFlag(DescribeSafeAuthFlagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSafeAuthFlag", DescribeSafeAuthFlagResponse.class);
    }

    /**
     *获取子账号安全设置
     * @param req DescribeSafeAuthFlagCollRequest
     * @return DescribeSafeAuthFlagCollResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSafeAuthFlagCollResponse DescribeSafeAuthFlagColl(DescribeSafeAuthFlagCollRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSafeAuthFlagColl", DescribeSafeAuthFlagCollResponse.class);
    }

    /**
     *查询安全设置(国际站)
     * @param req DescribeSafeAuthFlagIntlRequest
     * @return DescribeSafeAuthFlagIntlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSafeAuthFlagIntlResponse DescribeSafeAuthFlagIntl(DescribeSafeAuthFlagIntlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSafeAuthFlagIntl", DescribeSafeAuthFlagIntlResponse.class);
    }

    /**
     *通过子用户UIN列表查询子用户
     * @param req DescribeSubAccountsRequest
     * @return DescribeSubAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubAccountsResponse DescribeSubAccounts(DescribeSubAccountsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSubAccounts", DescribeSubAccountsResponse.class);
    }

    /**
     *查询用户OIDC配置
     * @param req DescribeUserOIDCConfigRequest
     * @return DescribeUserOIDCConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserOIDCConfigResponse DescribeUserOIDCConfig(DescribeUserOIDCConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserOIDCConfig", DescribeUserOIDCConfigResponse.class);
    }

    /**
     *查询用户SAML配置
     * @param req DescribeUserSAMLConfigRequest
     * @return DescribeUserSAMLConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserSAMLConfigResponse DescribeUserSAMLConfig(DescribeUserSAMLConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserSAMLConfig", DescribeUserSAMLConfigResponse.class);
    }

    /**
     *本接口（DetachGroupPolicy）可用于解除绑定到用户组的策略。
     * @param req DetachGroupPolicyRequest
     * @return DetachGroupPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DetachGroupPolicyResponse DetachGroupPolicy(DetachGroupPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DetachGroupPolicy", DetachGroupPolicyResponse.class);
    }

    /**
     *本接口（DetachRolePolicy）用于解除绑定角色的策略。
     * @param req DetachRolePolicyRequest
     * @return DetachRolePolicyResponse
     * @throws TencentCloudSDKException
     */
    public DetachRolePolicyResponse DetachRolePolicy(DetachRolePolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DetachRolePolicy", DetachRolePolicyResponse.class);
    }

    /**
     *本接口（DetachUserPolicy）可用于解除绑定到用户的策略。
     * @param req DetachUserPolicyRequest
     * @return DetachUserPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DetachUserPolicyResponse DetachUserPolicy(DetachUserPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DetachUserPolicy", DetachUserPolicyResponse.class);
    }

    /**
     *禁用用户SSO
     * @param req DisableUserSSORequest
     * @return DisableUserSSOResponse
     * @throws TencentCloudSDKException
     */
    public DisableUserSSOResponse DisableUserSSO(DisableUserSSORequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableUserSSO", DisableUserSSOResponse.class);
    }

    /**
     *查询账户摘要
     * @param req GetAccountSummaryRequest
     * @return GetAccountSummaryResponse
     * @throws TencentCloudSDKException
     */
    public GetAccountSummaryResponse GetAccountSummary(GetAccountSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetAccountSummary", GetAccountSummaryResponse.class);
    }

    /**
     *获取自定义多因子Token关联信息
     * @param req GetCustomMFATokenInfoRequest
     * @return GetCustomMFATokenInfoResponse
     * @throws TencentCloudSDKException
     */
    public GetCustomMFATokenInfoResponse GetCustomMFATokenInfo(GetCustomMFATokenInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetCustomMFATokenInfo", GetCustomMFATokenInfoResponse.class);
    }

    /**
     *查询用户组详情
     * @param req GetGroupRequest
     * @return GetGroupResponse
     * @throws TencentCloudSDKException
     */
    public GetGroupResponse GetGroup(GetGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetGroup", GetGroupResponse.class);
    }

    /**
     *本接口（GetPolicy）可用于查询查看策略详情。
     * @param req GetPolicyRequest
     * @return GetPolicyResponse
     * @throws TencentCloudSDKException
     */
    public GetPolicyResponse GetPolicy(GetPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetPolicy", GetPolicyResponse.class);
    }

    /**
     *该接口（GetPolicyVersion）用于查询策略版本详情
     * @param req GetPolicyVersionRequest
     * @return GetPolicyVersionResponse
     * @throws TencentCloudSDKException
     */
    public GetPolicyVersionResponse GetPolicyVersion(GetPolicyVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetPolicyVersion", GetPolicyVersionResponse.class);
    }

    /**
     *本接口（GetRole）用于获取指定角色的详细信息。
     * @param req GetRoleRequest
     * @return GetRoleResponse
     * @throws TencentCloudSDKException
     */
    public GetRoleResponse GetRole(GetRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetRole", GetRoleResponse.class);
    }

    /**
     *获取角色权限边界
     * @param req GetRolePermissionBoundaryRequest
     * @return GetRolePermissionBoundaryResponse
     * @throws TencentCloudSDKException
     */
    public GetRolePermissionBoundaryResponse GetRolePermissionBoundary(GetRolePermissionBoundaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetRolePermissionBoundary", GetRolePermissionBoundaryResponse.class);
    }

    /**
     *查询SAML身份提供商详情
     * @param req GetSAMLProviderRequest
     * @return GetSAMLProviderResponse
     * @throws TencentCloudSDKException
     */
    public GetSAMLProviderResponse GetSAMLProvider(GetSAMLProviderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetSAMLProvider", GetSAMLProviderResponse.class);
    }

    /**
     *获取密钥最近使用情况
     * @param req GetSecurityLastUsedRequest
     * @return GetSecurityLastUsedResponse
     * @throws TencentCloudSDKException
     */
    public GetSecurityLastUsedResponse GetSecurityLastUsed(GetSecurityLastUsedRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetSecurityLastUsed", GetSecurityLastUsedResponse.class);
    }

    /**
     *根据删除TaskId获取服务相关角色删除状态
     * @param req GetServiceLinkedRoleDeletionStatusRequest
     * @return GetServiceLinkedRoleDeletionStatusResponse
     * @throws TencentCloudSDKException
     */
    public GetServiceLinkedRoleDeletionStatusResponse GetServiceLinkedRoleDeletionStatus(GetServiceLinkedRoleDeletionStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetServiceLinkedRoleDeletionStatus", GetServiceLinkedRoleDeletionStatusResponse.class);
    }

    /**
     *查询子用户
     * @param req GetUserRequest
     * @return GetUserResponse
     * @throws TencentCloudSDKException
     */
    public GetUserResponse GetUser(GetUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetUser", GetUserResponse.class);
    }

    /**
     *获取用户AppId
     * @param req GetUserAppIdRequest
     * @return GetUserAppIdResponse
     * @throws TencentCloudSDKException
     */
    public GetUserAppIdResponse GetUserAppId(GetUserAppIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetUserAppId", GetUserAppIdResponse.class);
    }

    /**
     *获取用户权限边界
     * @param req GetUserPermissionBoundaryRequest
     * @return GetUserPermissionBoundaryResponse
     * @throws TencentCloudSDKException
     */
    public GetUserPermissionBoundaryResponse GetUserPermissionBoundary(GetUserPermissionBoundaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetUserPermissionBoundary", GetUserPermissionBoundaryResponse.class);
    }

    /**
     *列出指定CAM用户的访问密钥
     * @param req ListAccessKeysRequest
     * @return ListAccessKeysResponse
     * @throws TencentCloudSDKException
     */
    public ListAccessKeysResponse ListAccessKeys(ListAccessKeysRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAccessKeys", ListAccessKeysResponse.class);
    }

    /**
     *本接口（ListAttachedGroupPolicies）可用于查询用户组关联的策略列表。
     * @param req ListAttachedGroupPoliciesRequest
     * @return ListAttachedGroupPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public ListAttachedGroupPoliciesResponse ListAttachedGroupPolicies(ListAttachedGroupPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAttachedGroupPolicies", ListAttachedGroupPoliciesResponse.class);
    }

    /**
     *本接口（ListAttachedRolePolicies）用于获取角色绑定的策略列表。
     * @param req ListAttachedRolePoliciesRequest
     * @return ListAttachedRolePoliciesResponse
     * @throws TencentCloudSDKException
     */
    public ListAttachedRolePoliciesResponse ListAttachedRolePolicies(ListAttachedRolePoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAttachedRolePolicies", ListAttachedRolePoliciesResponse.class);
    }

    /**
     *列出用户关联的策略（包括随组关联）
     * @param req ListAttachedUserAllPoliciesRequest
     * @return ListAttachedUserAllPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public ListAttachedUserAllPoliciesResponse ListAttachedUserAllPolicies(ListAttachedUserAllPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAttachedUserAllPolicies", ListAttachedUserAllPoliciesResponse.class);
    }

    /**
     *本接口（ListAttachedUserPolicies）可用于查询子账号关联的策略列表。
     * @param req ListAttachedUserPoliciesRequest
     * @return ListAttachedUserPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public ListAttachedUserPoliciesResponse ListAttachedUserPolicies(ListAttachedUserPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAttachedUserPolicies", ListAttachedUserPoliciesResponse.class);
    }

    /**
     *获取协作者列表
     * @param req ListCollaboratorsRequest
     * @return ListCollaboratorsResponse
     * @throws TencentCloudSDKException
     */
    public ListCollaboratorsResponse ListCollaborators(ListCollaboratorsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListCollaborators", ListCollaboratorsResponse.class);
    }

    /**
     *本接口（ListEntitiesForPolicy）可用于查询策略关联的实体列表。
     * @param req ListEntitiesForPolicyRequest
     * @return ListEntitiesForPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ListEntitiesForPolicyResponse ListEntitiesForPolicy(ListEntitiesForPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListEntitiesForPolicy", ListEntitiesForPolicyResponse.class);
    }

    /**
     *查询用户组列表
     * @param req ListGroupsRequest
     * @return ListGroupsResponse
     * @throws TencentCloudSDKException
     */
    public ListGroupsResponse ListGroups(ListGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListGroups", ListGroupsResponse.class);
    }

    /**
     *列出用户关联的用户组
     * @param req ListGroupsForUserRequest
     * @return ListGroupsForUserResponse
     * @throws TencentCloudSDKException
     */
    public ListGroupsForUserResponse ListGroupsForUser(ListGroupsForUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListGroupsForUser", ListGroupsForUserResponse.class);
    }

    /**
     *本接口（ListPolicies）可用于查询策略列表。
     * @param req ListPoliciesRequest
     * @return ListPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public ListPoliciesResponse ListPolicies(ListPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListPolicies", ListPoliciesResponse.class);
    }

    /**
     *获取所有已授权服务
     * @param req ListPoliciesGrantingServiceAccessRequest
     * @return ListPoliciesGrantingServiceAccessResponse
     * @throws TencentCloudSDKException
     */
    public ListPoliciesGrantingServiceAccessResponse ListPoliciesGrantingServiceAccess(ListPoliciesGrantingServiceAccessRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListPoliciesGrantingServiceAccess", ListPoliciesGrantingServiceAccessResponse.class);
    }

    /**
     *该接口（ListPolicyVersions）用于获取策略版本列表
     * @param req ListPolicyVersionsRequest
     * @return ListPolicyVersionsResponse
     * @throws TencentCloudSDKException
     */
    public ListPolicyVersionsResponse ListPolicyVersions(ListPolicyVersionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListPolicyVersions", ListPolicyVersionsResponse.class);
    }

    /**
     *获取消息接收人列表
     * @param req ListReceiverRequest
     * @return ListReceiverResponse
     * @throws TencentCloudSDKException
     */
    public ListReceiverResponse ListReceiver(ListReceiverRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListReceiver", ListReceiverResponse.class);
    }

    /**
     *查询SAML身份提供商列表
     * @param req ListSAMLProvidersRequest
     * @return ListSAMLProvidersResponse
     * @throws TencentCloudSDKException
     */
    public ListSAMLProvidersResponse ListSAMLProviders(ListSAMLProvidersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListSAMLProviders", ListSAMLProvidersResponse.class);
    }

    /**
     *拉取子用户
     * @param req ListUsersRequest
     * @return ListUsersResponse
     * @throws TencentCloudSDKException
     */
    public ListUsersResponse ListUsers(ListUsersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListUsers", ListUsersResponse.class);
    }

    /**
     *查询用户组关联的用户列表
     * @param req ListUsersForGroupRequest
     * @return ListUsersForGroupResponse
     * @throws TencentCloudSDKException
     */
    public ListUsersForGroupResponse ListUsersForGroup(ListUsersForGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListUsersForGroup", ListUsersForGroupResponse.class);
    }

    /**
     *获取企业微信子用户列表
     * @param req ListWeChatWorkSubAccountsRequest
     * @return ListWeChatWorkSubAccountsResponse
     * @throws TencentCloudSDKException
     */
    public ListWeChatWorkSubAccountsResponse ListWeChatWorkSubAccounts(ListWeChatWorkSubAccountsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListWeChatWorkSubAccounts", ListWeChatWorkSubAccountsResponse.class);
    }

    /**
     *设置角色权限边界
     * @param req PutRolePermissionsBoundaryRequest
     * @return PutRolePermissionsBoundaryResponse
     * @throws TencentCloudSDKException
     */
    public PutRolePermissionsBoundaryResponse PutRolePermissionsBoundary(PutRolePermissionsBoundaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PutRolePermissionsBoundary", PutRolePermissionsBoundaryResponse.class);
    }

    /**
     *设置用户权限边界
     * @param req PutUserPermissionsBoundaryRequest
     * @return PutUserPermissionsBoundaryResponse
     * @throws TencentCloudSDKException
     */
    public PutUserPermissionsBoundaryResponse PutUserPermissionsBoundary(PutUserPermissionsBoundaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PutUserPermissionsBoundary", PutUserPermissionsBoundaryResponse.class);
    }

    /**
     *从用户组删除用户
     * @param req RemoveUserFromGroupRequest
     * @return RemoveUserFromGroupResponse
     * @throws TencentCloudSDKException
     */
    public RemoveUserFromGroupResponse RemoveUserFromGroup(RemoveUserFromGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveUserFromGroup", RemoveUserFromGroupResponse.class);
    }

    /**
     *本接口（SetDefaultPolicyVersion）可用于设置生效的策略版本。
     * @param req SetDefaultPolicyVersionRequest
     * @return SetDefaultPolicyVersionResponse
     * @throws TencentCloudSDKException
     */
    public SetDefaultPolicyVersionResponse SetDefaultPolicyVersion(SetDefaultPolicyVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetDefaultPolicyVersion", SetDefaultPolicyVersionResponse.class);
    }

    /**
     *设置子用户的登录保护和敏感操作校验方式
     * @param req SetMfaFlagRequest
     * @return SetMfaFlagResponse
     * @throws TencentCloudSDKException
     */
    public SetMfaFlagResponse SetMfaFlag(SetMfaFlagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetMfaFlag", SetMfaFlagResponse.class);
    }

    /**
     *角色绑定标签
     * @param req TagRoleRequest
     * @return TagRoleResponse
     * @throws TencentCloudSDKException
     */
    public TagRoleResponse TagRole(TagRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TagRole", TagRoleResponse.class);
    }

    /**
     *角色解绑标签。
     * @param req UntagRoleRequest
     * @return UntagRoleResponse
     * @throws TencentCloudSDKException
     */
    public UntagRoleResponse UntagRole(UntagRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UntagRole", UntagRoleResponse.class);
    }

    /**
     *为CAM用户更新访问密钥
     * @param req UpdateAccessKeyRequest
     * @return UpdateAccessKeyResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAccessKeyResponse UpdateAccessKey(UpdateAccessKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAccessKey", UpdateAccessKeyResponse.class);
    }

    /**
     *本接口（UpdateAssumeRolePolicy）用于修改角色信任策略的策略文档。
     * @param req UpdateAssumeRolePolicyRequest
     * @return UpdateAssumeRolePolicyResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAssumeRolePolicyResponse UpdateAssumeRolePolicy(UpdateAssumeRolePolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAssumeRolePolicy", UpdateAssumeRolePolicyResponse.class);
    }

    /**
     *更新用户组
     * @param req UpdateGroupRequest
     * @return UpdateGroupResponse
     * @throws TencentCloudSDKException
     */
    public UpdateGroupResponse UpdateGroup(UpdateGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateGroup", UpdateGroupResponse.class);
    }

    /**
     *修改角色OIDC配置
     * @param req UpdateOIDCConfigRequest
     * @return UpdateOIDCConfigResponse
     * @throws TencentCloudSDKException
     */
    public UpdateOIDCConfigResponse UpdateOIDCConfig(UpdateOIDCConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateOIDCConfig", UpdateOIDCConfigResponse.class);
    }

    /**
     *本接口（UpdatePolicy ）可用于更新策略。
如果已存在策略版本，本接口会直接更新策略的默认版本，不会创建新版本，如果不存在任何策略版本，则直接创建一个默认版本。
     * @param req UpdatePolicyRequest
     * @return UpdatePolicyResponse
     * @throws TencentCloudSDKException
     */
    public UpdatePolicyResponse UpdatePolicy(UpdatePolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdatePolicy", UpdatePolicyResponse.class);
    }

    /**
     *本接口（UpdateRoleConsoleLogin）用于修改角色是否可登录。
     * @param req UpdateRoleConsoleLoginRequest
     * @return UpdateRoleConsoleLoginResponse
     * @throws TencentCloudSDKException
     */
    public UpdateRoleConsoleLoginResponse UpdateRoleConsoleLogin(UpdateRoleConsoleLoginRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateRoleConsoleLogin", UpdateRoleConsoleLoginResponse.class);
    }

    /**
     *本接口（UpdateRoleDescription）用于修改角色的描述信息。
     * @param req UpdateRoleDescriptionRequest
     * @return UpdateRoleDescriptionResponse
     * @throws TencentCloudSDKException
     */
    public UpdateRoleDescriptionResponse UpdateRoleDescription(UpdateRoleDescriptionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateRoleDescription", UpdateRoleDescriptionResponse.class);
    }

    /**
     *更新SAML身份提供商信息
     * @param req UpdateSAMLProviderRequest
     * @return UpdateSAMLProviderResponse
     * @throws TencentCloudSDKException
     */
    public UpdateSAMLProviderResponse UpdateSAMLProvider(UpdateSAMLProviderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateSAMLProvider", UpdateSAMLProviderResponse.class);
    }

    /**
     *更新子用户
     * @param req UpdateUserRequest
     * @return UpdateUserResponse
     * @throws TencentCloudSDKException
     */
    public UpdateUserResponse UpdateUser(UpdateUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateUser", UpdateUserResponse.class);
    }

    /**
     *修改用户OIDC配置
     * @param req UpdateUserOIDCConfigRequest
     * @return UpdateUserOIDCConfigResponse
     * @throws TencentCloudSDKException
     */
    public UpdateUserOIDCConfigResponse UpdateUserOIDCConfig(UpdateUserOIDCConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateUserOIDCConfig", UpdateUserOIDCConfigResponse.class);
    }

    /**
     *修改用户SAML配置
     * @param req UpdateUserSAMLConfigRequest
     * @return UpdateUserSAMLConfigResponse
     * @throws TencentCloudSDKException
     */
    public UpdateUserSAMLConfigResponse UpdateUserSAMLConfig(UpdateUserSAMLConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateUserSAMLConfig", UpdateUserSAMLConfigResponse.class);
    }

}
