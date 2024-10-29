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
package com.tencentcloudapi.organization.v20210331;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.organization.v20210331.models.*;

public class OrganizationClient extends AbstractClient{
    private static String endpoint = "organization.tencentcloudapi.com";
    private static String service = "organization";
    private static String version = "2021-03-31";
    
    public OrganizationClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public OrganizationClient(Credential credential, String region, ClientProfile profile) {
        super(OrganizationClient.endpoint, OrganizationClient.version, credential, region, profile);
    }

    /**
     *接受加入共享单元邀请。
     * @param req AcceptJoinShareUnitInvitationRequest
     * @return AcceptJoinShareUnitInvitationResponse
     * @throws TencentCloudSDKException
     */
    public AcceptJoinShareUnitInvitationResponse AcceptJoinShareUnitInvitation(AcceptJoinShareUnitInvitationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AcceptJoinShareUnitInvitation", AcceptJoinShareUnitInvitationResponse.class);
    }

    /**
     *添加SAML签名证书
     * @param req AddExternalSAMLIdPCertificateRequest
     * @return AddExternalSAMLIdPCertificateResponse
     * @throws TencentCloudSDKException
     */
    public AddExternalSAMLIdPCertificateResponse AddExternalSAMLIdPCertificate(AddExternalSAMLIdPCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddExternalSAMLIdPCertificate", AddExternalSAMLIdPCertificateResponse.class);
    }

    /**
     *添加组织成员邮箱
     * @param req AddOrganizationMemberEmailRequest
     * @return AddOrganizationMemberEmailResponse
     * @throws TencentCloudSDKException
     */
    public AddOrganizationMemberEmailResponse AddOrganizationMemberEmail(AddOrganizationMemberEmailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddOrganizationMemberEmail", AddOrganizationMemberEmailResponse.class);
    }

    /**
     *添加企业组织节点
     * @param req AddOrganizationNodeRequest
     * @return AddOrganizationNodeResponse
     * @throws TencentCloudSDKException
     */
    public AddOrganizationNodeResponse AddOrganizationNode(AddOrganizationNodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddOrganizationNode", AddOrganizationNodeResponse.class);
    }

    /**
     *为权限配置添加策略
     * @param req AddPermissionPolicyToRoleConfigurationRequest
     * @return AddPermissionPolicyToRoleConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public AddPermissionPolicyToRoleConfigurationResponse AddPermissionPolicyToRoleConfiguration(AddPermissionPolicyToRoleConfigurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddPermissionPolicyToRoleConfiguration", AddPermissionPolicyToRoleConfigurationResponse.class);
    }

    /**
     *创建共享单元。
     * @param req AddShareUnitRequest
     * @return AddShareUnitResponse
     * @throws TencentCloudSDKException
     */
    public AddShareUnitResponse AddShareUnit(AddShareUnitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddShareUnit", AddShareUnitResponse.class);
    }

    /**
     *添加共享单元成员
     * @param req AddShareUnitMembersRequest
     * @return AddShareUnitMembersResponse
     * @throws TencentCloudSDKException
     */
    public AddShareUnitMembersResponse AddShareUnitMembers(AddShareUnitMembersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddShareUnitMembers", AddShareUnitMembersResponse.class);
    }

    /**
     *添加共享单元资源
     * @param req AddShareUnitResourcesRequest
     * @return AddShareUnitResourcesResponse
     * @throws TencentCloudSDKException
     */
    public AddShareUnitResourcesResponse AddShareUnitResources(AddShareUnitResourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddShareUnitResources", AddShareUnitResourcesResponse.class);
    }

    /**
     *为用户组添加用户
     * @param req AddUserToGroupRequest
     * @return AddUserToGroupResponse
     * @throws TencentCloudSDKException
     */
    public AddUserToGroupResponse AddUserToGroup(AddUserToGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddUserToGroup", AddUserToGroupResponse.class);
    }

    /**
     *绑定策略
     * @param req AttachPolicyRequest
     * @return AttachPolicyResponse
     * @throws TencentCloudSDKException
     */
    public AttachPolicyResponse AttachPolicy(AttachPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AttachPolicy", AttachPolicyResponse.class);
    }

    /**
     *绑定组织成员和组织管理员子账号的授权关系
     * @param req BindOrganizationMemberAuthAccountRequest
     * @return BindOrganizationMemberAuthAccountResponse
     * @throws TencentCloudSDKException
     */
    public BindOrganizationMemberAuthAccountResponse BindOrganizationMemberAuthAccount(BindOrganizationMemberAuthAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindOrganizationMemberAuthAccount", BindOrganizationMemberAuthAccountResponse.class);
    }

    /**
     *取消组织成员和组织管理员子账号的授权关系
     * @param req CancelOrganizationMemberAuthAccountRequest
     * @return CancelOrganizationMemberAuthAccountResponse
     * @throws TencentCloudSDKException
     */
    public CancelOrganizationMemberAuthAccountResponse CancelOrganizationMemberAuthAccount(CancelOrganizationMemberAuthAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelOrganizationMemberAuthAccount", CancelOrganizationMemberAuthAccountResponse.class);
    }

    /**
     *成员账号删除检查
     * @param req CheckAccountDeleteRequest
     * @return CheckAccountDeleteResponse
     * @throws TencentCloudSDKException
     */
    public CheckAccountDeleteResponse CheckAccountDelete(CheckAccountDeleteRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckAccountDelete", CheckAccountDeleteResponse.class);
    }

    /**
     *清空SAML身份提供商配置信息
     * @param req ClearExternalSAMLIdentityProviderRequest
     * @return ClearExternalSAMLIdentityProviderResponse
     * @throws TencentCloudSDKException
     */
    public ClearExternalSAMLIdentityProviderResponse ClearExternalSAMLIdentityProvider(ClearExternalSAMLIdentityProviderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ClearExternalSAMLIdentityProvider", ClearExternalSAMLIdentityProviderResponse.class);
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
     *添加集团服务委派管理员
     * @param req CreateOrgServiceAssignRequest
     * @return CreateOrgServiceAssignResponse
     * @throws TencentCloudSDKException
     */
    public CreateOrgServiceAssignResponse CreateOrgServiceAssign(CreateOrgServiceAssignRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateOrgServiceAssign", CreateOrgServiceAssignResponse.class);
    }

    /**
     *创建企业组织
     * @param req CreateOrganizationRequest
     * @return CreateOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public CreateOrganizationResponse CreateOrganization(CreateOrganizationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateOrganization", CreateOrganizationResponse.class);
    }

    /**
     *添加组织身份
     * @param req CreateOrganizationIdentityRequest
     * @return CreateOrganizationIdentityResponse
     * @throws TencentCloudSDKException
     */
    public CreateOrganizationIdentityResponse CreateOrganizationIdentity(CreateOrganizationIdentityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateOrganizationIdentity", CreateOrganizationIdentityResponse.class);
    }

    /**
     *创建组织成员
     * @param req CreateOrganizationMemberRequest
     * @return CreateOrganizationMemberResponse
     * @throws TencentCloudSDKException
     */
    public CreateOrganizationMemberResponse CreateOrganizationMember(CreateOrganizationMemberRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateOrganizationMember", CreateOrganizationMemberResponse.class);
    }

    /**
     *添加组织成员访问授权
     * @param req CreateOrganizationMemberAuthIdentityRequest
     * @return CreateOrganizationMemberAuthIdentityResponse
     * @throws TencentCloudSDKException
     */
    public CreateOrganizationMemberAuthIdentityResponse CreateOrganizationMemberAuthIdentity(CreateOrganizationMemberAuthIdentityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateOrganizationMemberAuthIdentity", CreateOrganizationMemberAuthIdentityResponse.class);
    }

    /**
     *创建组织成员访问授权策略
     * @param req CreateOrganizationMemberPolicyRequest
     * @return CreateOrganizationMemberPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateOrganizationMemberPolicyResponse CreateOrganizationMemberPolicy(CreateOrganizationMemberPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateOrganizationMemberPolicy", CreateOrganizationMemberPolicyResponse.class);
    }

    /**
     *创建组织成员访问策略
     * @param req CreateOrganizationMembersPolicyRequest
     * @return CreateOrganizationMembersPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateOrganizationMembersPolicyResponse CreateOrganizationMembersPolicy(CreateOrganizationMembersPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateOrganizationMembersPolicy", CreateOrganizationMembersPolicyResponse.class);
    }

    /**
     *创建一个特殊类型的策略，您可以关联到企业组织Root节点、企业部门节点或者企业的成员账号。
     * @param req CreatePolicyRequest
     * @return CreatePolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreatePolicyResponse CreatePolicy(CreatePolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePolicy", CreatePolicyResponse.class);
    }

    /**
     *在成员账号上授权
     * @param req CreateRoleAssignmentRequest
     * @return CreateRoleAssignmentResponse
     * @throws TencentCloudSDKException
     */
    public CreateRoleAssignmentResponse CreateRoleAssignment(CreateRoleAssignmentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRoleAssignment", CreateRoleAssignmentResponse.class);
    }

    /**
     *创建权限配置
     * @param req CreateRoleConfigurationRequest
     * @return CreateRoleConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public CreateRoleConfigurationResponse CreateRoleConfiguration(CreateRoleConfigurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRoleConfiguration", CreateRoleConfigurationResponse.class);
    }

    /**
     *创建SCIM密钥
     * @param req CreateSCIMCredentialRequest
     * @return CreateSCIMCredentialResponse
     * @throws TencentCloudSDKException
     */
    public CreateSCIMCredentialResponse CreateSCIMCredential(CreateSCIMCredentialRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSCIMCredential", CreateSCIMCredentialResponse.class);
    }

    /**
     *创建用户
     * @param req CreateUserRequest
     * @return CreateUserResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserResponse CreateUser(CreateUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateUser", CreateUserResponse.class);
    }

    /**
     *创建子用户同步任务
     * @param req CreateUserSyncProvisioningRequest
     * @return CreateUserSyncProvisioningResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserSyncProvisioningResponse CreateUserSyncProvisioning(CreateUserSyncProvisioningRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateUserSyncProvisioning", CreateUserSyncProvisioningResponse.class);
    }

    /**
     *删除成员账号
     * @param req DeleteAccountRequest
     * @return DeleteAccountResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAccountResponse DeleteAccount(DeleteAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAccount", DeleteAccountResponse.class);
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
     *删除集团服务委派管理员
     * @param req DeleteOrgServiceAssignRequest
     * @return DeleteOrgServiceAssignResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOrgServiceAssignResponse DeleteOrgServiceAssign(DeleteOrgServiceAssignRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteOrgServiceAssign", DeleteOrgServiceAssignResponse.class);
    }

    /**
     *删除企业组织
     * @param req DeleteOrganizationRequest
     * @return DeleteOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOrganizationResponse DeleteOrganization(DeleteOrganizationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteOrganization", DeleteOrganizationResponse.class);
    }

    /**
     *删除组织身份
     * @param req DeleteOrganizationIdentityRequest
     * @return DeleteOrganizationIdentityResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOrganizationIdentityResponse DeleteOrganizationIdentity(DeleteOrganizationIdentityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteOrganizationIdentity", DeleteOrganizationIdentityResponse.class);
    }

    /**
     *删除组织成员访问授权
     * @param req DeleteOrganizationMemberAuthIdentityRequest
     * @return DeleteOrganizationMemberAuthIdentityResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOrganizationMemberAuthIdentityResponse DeleteOrganizationMemberAuthIdentity(DeleteOrganizationMemberAuthIdentityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteOrganizationMemberAuthIdentity", DeleteOrganizationMemberAuthIdentityResponse.class);
    }

    /**
     *从组织中移除成员账号，不会删除账号。
     * @param req DeleteOrganizationMembersRequest
     * @return DeleteOrganizationMembersResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOrganizationMembersResponse DeleteOrganizationMembers(DeleteOrganizationMembersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteOrganizationMembers", DeleteOrganizationMembersResponse.class);
    }

    /**
     *删除组织成员访问策略
     * @param req DeleteOrganizationMembersPolicyRequest
     * @return DeleteOrganizationMembersPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOrganizationMembersPolicyResponse DeleteOrganizationMembersPolicy(DeleteOrganizationMembersPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteOrganizationMembersPolicy", DeleteOrganizationMembersPolicyResponse.class);
    }

    /**
     *批量删除企业组织节点
     * @param req DeleteOrganizationNodesRequest
     * @return DeleteOrganizationNodesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOrganizationNodesResponse DeleteOrganizationNodes(DeleteOrganizationNodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteOrganizationNodes", DeleteOrganizationNodesResponse.class);
    }

    /**
     *删除策略
     * @param req DeletePolicyRequest
     * @return DeletePolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeletePolicyResponse DeletePolicy(DeletePolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePolicy", DeletePolicyResponse.class);
    }

    /**
     *移除成员账号上的授权
     * @param req DeleteRoleAssignmentRequest
     * @return DeleteRoleAssignmentResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRoleAssignmentResponse DeleteRoleAssignment(DeleteRoleAssignmentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRoleAssignment", DeleteRoleAssignmentResponse.class);
    }

    /**
     *删除权限配置信息
     * @param req DeleteRoleConfigurationRequest
     * @return DeleteRoleConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRoleConfigurationResponse DeleteRoleConfiguration(DeleteRoleConfigurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRoleConfiguration", DeleteRoleConfigurationResponse.class);
    }

    /**
     *删除SCIM密钥
     * @param req DeleteSCIMCredentialRequest
     * @return DeleteSCIMCredentialResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSCIMCredentialResponse DeleteSCIMCredential(DeleteSCIMCredentialRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSCIMCredential", DeleteSCIMCredentialResponse.class);
    }

    /**
     *删除共享单元。
     * @param req DeleteShareUnitRequest
     * @return DeleteShareUnitResponse
     * @throws TencentCloudSDKException
     */
    public DeleteShareUnitResponse DeleteShareUnit(DeleteShareUnitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteShareUnit", DeleteShareUnitResponse.class);
    }

    /**
     *删除共享单元成员
     * @param req DeleteShareUnitMembersRequest
     * @return DeleteShareUnitMembersResponse
     * @throws TencentCloudSDKException
     */
    public DeleteShareUnitMembersResponse DeleteShareUnitMembers(DeleteShareUnitMembersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteShareUnitMembers", DeleteShareUnitMembersResponse.class);
    }

    /**
     *删除共享单元资源
     * @param req DeleteShareUnitResourcesRequest
     * @return DeleteShareUnitResourcesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteShareUnitResourcesResponse DeleteShareUnitResources(DeleteShareUnitResourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteShareUnitResources", DeleteShareUnitResourcesResponse.class);
    }

    /**
     *删除用户
     * @param req DeleteUserRequest
     * @return DeleteUserResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUserResponse DeleteUser(DeleteUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteUser", DeleteUserResponse.class);
    }

    /**
     *删除子用户同步任务
     * @param req DeleteUserSyncProvisioningRequest
     * @return DeleteUserSyncProvisioningResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUserSyncProvisioningResponse DeleteUserSyncProvisioning(DeleteUserSyncProvisioningRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteUserSyncProvisioning", DeleteUserSyncProvisioningResponse.class);
    }

    /**
     *查询目标关联的有效策略
     * @param req DescribeEffectivePolicyRequest
     * @return DescribeEffectivePolicyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEffectivePolicyResponse DescribeEffectivePolicy(DescribeEffectivePolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEffectivePolicy", DescribeEffectivePolicyResponse.class);
    }

    /**
     *获取集团账号身份中心服务信息
     * @param req DescribeIdentityCenterRequest
     * @return DescribeIdentityCenterResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIdentityCenterResponse DescribeIdentityCenter(DescribeIdentityCenterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIdentityCenter", DescribeIdentityCenterResponse.class);
    }

    /**
     *获取企业组织信息
     * @param req DescribeOrganizationRequest
     * @return DescribeOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationResponse DescribeOrganization(DescribeOrganizationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOrganization", DescribeOrganizationResponse.class);
    }

    /**
     *获取已设置管理员的互信主体关系列表
     * @param req DescribeOrganizationAuthNodeRequest
     * @return DescribeOrganizationAuthNodeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationAuthNodeResponse DescribeOrganizationAuthNode(DescribeOrganizationAuthNodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOrganizationAuthNode", DescribeOrganizationAuthNodeResponse.class);
    }

    /**
     *以成员维度获取组织财务信息
     * @param req DescribeOrganizationFinancialByMemberRequest
     * @return DescribeOrganizationFinancialByMemberResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationFinancialByMemberResponse DescribeOrganizationFinancialByMember(DescribeOrganizationFinancialByMemberRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOrganizationFinancialByMember", DescribeOrganizationFinancialByMemberResponse.class);
    }

    /**
     *以月维度获取组织财务信息趋势
     * @param req DescribeOrganizationFinancialByMonthRequest
     * @return DescribeOrganizationFinancialByMonthResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationFinancialByMonthResponse DescribeOrganizationFinancialByMonth(DescribeOrganizationFinancialByMonthRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOrganizationFinancialByMonth", DescribeOrganizationFinancialByMonthResponse.class);
    }

    /**
     *以产品维度获取组织财务信息
     * @param req DescribeOrganizationFinancialByProductRequest
     * @return DescribeOrganizationFinancialByProductResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationFinancialByProductResponse DescribeOrganizationFinancialByProduct(DescribeOrganizationFinancialByProductRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOrganizationFinancialByProduct", DescribeOrganizationFinancialByProductResponse.class);
    }

    /**
     *获取组织成员被绑定授权关系的子账号列表
     * @param req DescribeOrganizationMemberAuthAccountsRequest
     * @return DescribeOrganizationMemberAuthAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationMemberAuthAccountsResponse DescribeOrganizationMemberAuthAccounts(DescribeOrganizationMemberAuthAccountsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOrganizationMemberAuthAccounts", DescribeOrganizationMemberAuthAccountsResponse.class);
    }

    /**
     *获取组织成员访问授权列表
     * @param req DescribeOrganizationMemberAuthIdentitiesRequest
     * @return DescribeOrganizationMemberAuthIdentitiesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationMemberAuthIdentitiesResponse DescribeOrganizationMemberAuthIdentities(DescribeOrganizationMemberAuthIdentitiesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOrganizationMemberAuthIdentities", DescribeOrganizationMemberAuthIdentitiesResponse.class);
    }

    /**
     *查询成员邮箱绑定详细信息
     * @param req DescribeOrganizationMemberEmailBindRequest
     * @return DescribeOrganizationMemberEmailBindResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationMemberEmailBindResponse DescribeOrganizationMemberEmailBind(DescribeOrganizationMemberEmailBindRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOrganizationMemberEmailBind", DescribeOrganizationMemberEmailBindResponse.class);
    }

    /**
     *获取组织成员的授权策略列表
     * @param req DescribeOrganizationMemberPoliciesRequest
     * @return DescribeOrganizationMemberPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationMemberPoliciesResponse DescribeOrganizationMemberPolicies(DescribeOrganizationMemberPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOrganizationMemberPolicies", DescribeOrganizationMemberPoliciesResponse.class);
    }

    /**
     *获取企业组织成员列表
     * @param req DescribeOrganizationMembersRequest
     * @return DescribeOrganizationMembersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationMembersResponse DescribeOrganizationMembers(DescribeOrganizationMembersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOrganizationMembers", DescribeOrganizationMembersResponse.class);
    }

    /**
     *获取组织节点列表
     * @param req DescribeOrganizationNodesRequest
     * @return DescribeOrganizationNodesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationNodesResponse DescribeOrganizationNodes(DescribeOrganizationNodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOrganizationNodes", DescribeOrganizationNodesResponse.class);
    }

    /**
     *本接口（DescribePolicy）可用于查询查看策略详情。
     * @param req DescribePolicyRequest
     * @return DescribePolicyResponse
     * @throws TencentCloudSDKException
     */
    public DescribePolicyResponse DescribePolicy(DescribePolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePolicy", DescribePolicyResponse.class);
    }

    /**
     *本接口（DescribePolicyConfig）可用于查询企业组织策略配置
     * @param req DescribePolicyConfigRequest
     * @return DescribePolicyConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribePolicyConfigResponse DescribePolicyConfig(DescribePolicyConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePolicyConfig", DescribePolicyConfigResponse.class);
    }

    /**
     *获取可共享地域列表
     * @param req DescribeShareAreasRequest
     * @return DescribeShareAreasResponse
     * @throws TencentCloudSDKException
     */
    public DescribeShareAreasResponse DescribeShareAreas(DescribeShareAreasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeShareAreas", DescribeShareAreasResponse.class);
    }

    /**
     *获取共享单元成员列表。
     * @param req DescribeShareUnitMembersRequest
     * @return DescribeShareUnitMembersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeShareUnitMembersResponse DescribeShareUnitMembers(DescribeShareUnitMembersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeShareUnitMembers", DescribeShareUnitMembersResponse.class);
    }

    /**
     *获取共享单元资源列表。
     * @param req DescribeShareUnitResourcesRequest
     * @return DescribeShareUnitResourcesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeShareUnitResourcesResponse DescribeShareUnitResources(DescribeShareUnitResourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeShareUnitResources", DescribeShareUnitResourcesResponse.class);
    }

    /**
     *获取共享单元列表。
     * @param req DescribeShareUnitsRequest
     * @return DescribeShareUnitsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeShareUnitsResponse DescribeShareUnits(DescribeShareUnitsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeShareUnits", DescribeShareUnitsResponse.class);
    }

    /**
     *解绑策略
     * @param req DetachPolicyRequest
     * @return DetachPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DetachPolicyResponse DetachPolicy(DetachPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DetachPolicy", DetachPolicyResponse.class);
    }

    /**
     *禁用策略类型
     * @param req DisablePolicyTypeRequest
     * @return DisablePolicyTypeResponse
     * @throws TencentCloudSDKException
     */
    public DisablePolicyTypeResponse DisablePolicyType(DisablePolicyTypeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisablePolicyType", DisablePolicyTypeResponse.class);
    }

    /**
     *解除权限配置在成员账号上的部署
     * @param req DismantleRoleConfigurationRequest
     * @return DismantleRoleConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public DismantleRoleConfigurationResponse DismantleRoleConfiguration(DismantleRoleConfigurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DismantleRoleConfiguration", DismantleRoleConfigurationResponse.class);
    }

    /**
     *启用策略类型
     * @param req EnablePolicyTypeRequest
     * @return EnablePolicyTypeResponse
     * @throws TencentCloudSDKException
     */
    public EnablePolicyTypeResponse EnablePolicyType(EnablePolicyTypeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnablePolicyType", EnablePolicyTypeResponse.class);
    }

    /**
     *查询SAML身份提供商配置信息
     * @param req GetExternalSAMLIdentityProviderRequest
     * @return GetExternalSAMLIdentityProviderResponse
     * @throws TencentCloudSDKException
     */
    public GetExternalSAMLIdentityProviderResponse GetExternalSAMLIdentityProvider(GetExternalSAMLIdentityProviderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetExternalSAMLIdentityProvider", GetExternalSAMLIdentityProviderResponse.class);
    }

    /**
     *查询用户组信息
     * @param req GetGroupRequest
     * @return GetGroupResponse
     * @throws TencentCloudSDKException
     */
    public GetGroupResponse GetGroup(GetGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetGroup", GetGroupResponse.class);
    }

    /**
     *查询用户同步异步任务的状态
     * @param req GetProvisioningTaskStatusRequest
     * @return GetProvisioningTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public GetProvisioningTaskStatusResponse GetProvisioningTaskStatus(GetProvisioningTaskStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetProvisioningTaskStatus", GetProvisioningTaskStatusResponse.class);
    }

    /**
     *查询权限配置信息
     * @param req GetRoleConfigurationRequest
     * @return GetRoleConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public GetRoleConfigurationResponse GetRoleConfiguration(GetRoleConfigurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetRoleConfiguration", GetRoleConfigurationResponse.class);
    }

    /**
     *获取SCIM同步状态
     * @param req GetSCIMSynchronizationStatusRequest
     * @return GetSCIMSynchronizationStatusResponse
     * @throws TencentCloudSDKException
     */
    public GetSCIMSynchronizationStatusResponse GetSCIMSynchronizationStatus(GetSCIMSynchronizationStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetSCIMSynchronizationStatus", GetSCIMSynchronizationStatusResponse.class);
    }

    /**
     *查询异步任务的状态
     * @param req GetTaskStatusRequest
     * @return GetTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public GetTaskStatusResponse GetTaskStatus(GetTaskStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTaskStatus", GetTaskStatusResponse.class);
    }

    /**
     *查询用户信息
     * @param req GetUserRequest
     * @return GetUserResponse
     * @throws TencentCloudSDKException
     */
    public GetUserResponse GetUser(GetUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetUser", GetUserResponse.class);
    }

    /**
     *查询CAM用户同步
     * @param req GetUserSyncProvisioningRequest
     * @return GetUserSyncProvisioningResponse
     * @throws TencentCloudSDKException
     */
    public GetUserSyncProvisioningResponse GetUserSyncProvisioning(GetUserSyncProvisioningRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetUserSyncProvisioning", GetUserSyncProvisioningResponse.class);
    }

    /**
     *查询SAML服务提供商配置信息
     * @param req GetZoneSAMLServiceProviderInfoRequest
     * @return GetZoneSAMLServiceProviderInfoResponse
     * @throws TencentCloudSDKException
     */
    public GetZoneSAMLServiceProviderInfoResponse GetZoneSAMLServiceProviderInfo(GetZoneSAMLServiceProviderInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetZoneSAMLServiceProviderInfo", GetZoneSAMLServiceProviderInfoResponse.class);
    }

    /**
     *查询空间的统计信息
     * @param req GetZoneStatisticsRequest
     * @return GetZoneStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public GetZoneStatisticsResponse GetZoneStatistics(GetZoneStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetZoneStatistics", GetZoneStatisticsResponse.class);
    }

    /**
     *邀请组织成员
     * @param req InviteOrganizationMemberRequest
     * @return InviteOrganizationMemberResponse
     * @throws TencentCloudSDKException
     */
    public InviteOrganizationMemberResponse InviteOrganizationMember(InviteOrganizationMemberRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InviteOrganizationMember", InviteOrganizationMemberResponse.class);
    }

    /**
     *查询SAML签名证书列表
     * @param req ListExternalSAMLIdPCertificatesRequest
     * @return ListExternalSAMLIdPCertificatesResponse
     * @throws TencentCloudSDKException
     */
    public ListExternalSAMLIdPCertificatesResponse ListExternalSAMLIdPCertificates(ListExternalSAMLIdPCertificatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListExternalSAMLIdPCertificates", ListExternalSAMLIdPCertificatesResponse.class);
    }

    /**
     *查询用户组中的用户列表
     * @param req ListGroupMembersRequest
     * @return ListGroupMembersResponse
     * @throws TencentCloudSDKException
     */
    public ListGroupMembersResponse ListGroupMembers(ListGroupMembersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListGroupMembers", ListGroupMembersResponse.class);
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
     *查询用户加入的用户组
     * @param req ListJoinedGroupsForUserRequest
     * @return ListJoinedGroupsForUserResponse
     * @throws TencentCloudSDKException
     */
    public ListJoinedGroupsForUserResponse ListJoinedGroupsForUser(ListJoinedGroupsForUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListJoinedGroupsForUser", ListJoinedGroupsForUserResponse.class);
    }

    /**
     *获取成员标签检测不合规资源列表
     * @param req ListNonCompliantResourceRequest
     * @return ListNonCompliantResourceResponse
     * @throws TencentCloudSDKException
     */
    public ListNonCompliantResourceResponse ListNonCompliantResource(ListNonCompliantResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListNonCompliantResource", ListNonCompliantResourceResponse.class);
    }

    /**
     *获取集团服务委派管理员列表
     * @param req ListOrgServiceAssignMemberRequest
     * @return ListOrgServiceAssignMemberResponse
     * @throws TencentCloudSDKException
     */
    public ListOrgServiceAssignMemberResponse ListOrgServiceAssignMember(ListOrgServiceAssignMemberRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListOrgServiceAssignMember", ListOrgServiceAssignMemberResponse.class);
    }

    /**
     *获取组织成员访问身份列表
     * @param req ListOrganizationIdentityRequest
     * @return ListOrganizationIdentityResponse
     * @throws TencentCloudSDKException
     */
    public ListOrganizationIdentityResponse ListOrganizationIdentity(ListOrganizationIdentityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListOrganizationIdentity", ListOrganizationIdentityResponse.class);
    }

    /**
     *获取集团服务设置列表
     * @param req ListOrganizationServiceRequest
     * @return ListOrganizationServiceResponse
     * @throws TencentCloudSDKException
     */
    public ListOrganizationServiceResponse ListOrganizationService(ListOrganizationServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListOrganizationService", ListOrganizationServiceResponse.class);
    }

    /**
     *获取权限配置中的策略列表
     * @param req ListPermissionPoliciesInRoleConfigurationRequest
     * @return ListPermissionPoliciesInRoleConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public ListPermissionPoliciesInRoleConfigurationResponse ListPermissionPoliciesInRoleConfiguration(ListPermissionPoliciesInRoleConfigurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListPermissionPoliciesInRoleConfiguration", ListPermissionPoliciesInRoleConfigurationResponse.class);
    }

    /**
     *本接口（ListPolicies）可用于查询查看策略列表数据
     * @param req ListPoliciesRequest
     * @return ListPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public ListPoliciesResponse ListPolicies(ListPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListPolicies", ListPoliciesResponse.class);
    }

    /**
     *本接口（ListPoliciesForTarget）查询目标关联的策略列表
     * @param req ListPoliciesForTargetRequest
     * @return ListPoliciesForTargetResponse
     * @throws TencentCloudSDKException
     */
    public ListPoliciesForTargetResponse ListPoliciesForTarget(ListPoliciesForTargetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListPoliciesForTarget", ListPoliciesForTargetResponse.class);
    }

    /**
     *查询授权列表
     * @param req ListRoleAssignmentsRequest
     * @return ListRoleAssignmentsResponse
     * @throws TencentCloudSDKException
     */
    public ListRoleAssignmentsResponse ListRoleAssignments(ListRoleAssignmentsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListRoleAssignments", ListRoleAssignmentsResponse.class);
    }

    /**
     *查询权限配置部署列表
     * @param req ListRoleConfigurationProvisioningsRequest
     * @return ListRoleConfigurationProvisioningsResponse
     * @throws TencentCloudSDKException
     */
    public ListRoleConfigurationProvisioningsResponse ListRoleConfigurationProvisionings(ListRoleConfigurationProvisioningsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListRoleConfigurationProvisionings", ListRoleConfigurationProvisioningsResponse.class);
    }

    /**
     *查询权限配置列表
     * @param req ListRoleConfigurationsRequest
     * @return ListRoleConfigurationsResponse
     * @throws TencentCloudSDKException
     */
    public ListRoleConfigurationsResponse ListRoleConfigurations(ListRoleConfigurationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListRoleConfigurations", ListRoleConfigurationsResponse.class);
    }

    /**
     *查询用户SCIM密钥列表
     * @param req ListSCIMCredentialsRequest
     * @return ListSCIMCredentialsResponse
     * @throws TencentCloudSDKException
     */
    public ListSCIMCredentialsResponse ListSCIMCredentials(ListSCIMCredentialsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListSCIMCredentials", ListSCIMCredentialsResponse.class);
    }

    /**
     *本接口（ListTargetsForPolicy）查询某个指定策略关联的目标列表
     * @param req ListTargetsForPolicyRequest
     * @return ListTargetsForPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ListTargetsForPolicyResponse ListTargetsForPolicy(ListTargetsForPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListTargetsForPolicy", ListTargetsForPolicyResponse.class);
    }

    /**
     *查询异步任务列表
     * @param req ListTasksRequest
     * @return ListTasksResponse
     * @throws TencentCloudSDKException
     */
    public ListTasksResponse ListTasks(ListTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListTasks", ListTasksResponse.class);
    }

    /**
     *查询CAM用户同步列表
     * @param req ListUserSyncProvisioningsRequest
     * @return ListUserSyncProvisioningsResponse
     * @throws TencentCloudSDKException
     */
    public ListUserSyncProvisioningsResponse ListUserSyncProvisionings(ListUserSyncProvisioningsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListUserSyncProvisionings", ListUserSyncProvisioningsResponse.class);
    }

    /**
     *查询用户列表
     * @param req ListUsersRequest
     * @return ListUsersResponse
     * @throws TencentCloudSDKException
     */
    public ListUsersResponse ListUsers(ListUsersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListUsers", ListUsersResponse.class);
    }

    /**
     *移动成员到指定企业组织节点
     * @param req MoveOrganizationNodeMembersRequest
     * @return MoveOrganizationNodeMembersResponse
     * @throws TencentCloudSDKException
     */
    public MoveOrganizationNodeMembersResponse MoveOrganizationNodeMembers(MoveOrganizationNodeMembersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "MoveOrganizationNodeMembers", MoveOrganizationNodeMembersResponse.class);
    }

    /**
     *开通身份中心服务（CIC）
     * @param req OpenIdentityCenterRequest
     * @return OpenIdentityCenterResponse
     * @throws TencentCloudSDKException
     */
    public OpenIdentityCenterResponse OpenIdentityCenter(OpenIdentityCenterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenIdentityCenter", OpenIdentityCenterResponse.class);
    }

    /**
     *将权限配置部署到成员账号上
     * @param req ProvisionRoleConfigurationRequest
     * @return ProvisionRoleConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public ProvisionRoleConfigurationResponse ProvisionRoleConfiguration(ProvisionRoleConfigurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ProvisionRoleConfiguration", ProvisionRoleConfigurationResponse.class);
    }

    /**
     *退出企业组织
     * @param req QuitOrganizationRequest
     * @return QuitOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public QuitOrganizationResponse QuitOrganization(QuitOrganizationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QuitOrganization", QuitOrganizationResponse.class);
    }

    /**
     *拒绝加入共享单元邀请。
     * @param req RejectJoinShareUnitInvitationRequest
     * @return RejectJoinShareUnitInvitationResponse
     * @throws TencentCloudSDKException
     */
    public RejectJoinShareUnitInvitationResponse RejectJoinShareUnitInvitation(RejectJoinShareUnitInvitationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RejectJoinShareUnitInvitation", RejectJoinShareUnitInvitationResponse.class);
    }

    /**
     *移除SAML签名证书
     * @param req RemoveExternalSAMLIdPCertificateRequest
     * @return RemoveExternalSAMLIdPCertificateResponse
     * @throws TencentCloudSDKException
     */
    public RemoveExternalSAMLIdPCertificateResponse RemoveExternalSAMLIdPCertificate(RemoveExternalSAMLIdPCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveExternalSAMLIdPCertificate", RemoveExternalSAMLIdPCertificateResponse.class);
    }

    /**
     *为权限配置移除策略
     * @param req RemovePermissionPolicyFromRoleConfigurationRequest
     * @return RemovePermissionPolicyFromRoleConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public RemovePermissionPolicyFromRoleConfigurationResponse RemovePermissionPolicyFromRoleConfiguration(RemovePermissionPolicyFromRoleConfigurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemovePermissionPolicyFromRoleConfiguration", RemovePermissionPolicyFromRoleConfigurationResponse.class);
    }

    /**
     *从用户组中移除用户
     * @param req RemoveUserFromGroupRequest
     * @return RemoveUserFromGroupResponse
     * @throws TencentCloudSDKException
     */
    public RemoveUserFromGroupResponse RemoveUserFromGroup(RemoveUserFromGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveUserFromGroup", RemoveUserFromGroupResponse.class);
    }

    /**
     *重新发送成员绑定邮箱激活邮件
     * @param req SendOrgMemberAccountBindEmailRequest
     * @return SendOrgMemberAccountBindEmailResponse
     * @throws TencentCloudSDKException
     */
    public SendOrgMemberAccountBindEmailResponse SendOrgMemberAccountBindEmail(SendOrgMemberAccountBindEmailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SendOrgMemberAccountBindEmail", SendOrgMemberAccountBindEmailResponse.class);
    }

    /**
     *配置SAML身份提供商信息
     * @param req SetExternalSAMLIdentityProviderRequest
     * @return SetExternalSAMLIdentityProviderResponse
     * @throws TencentCloudSDKException
     */
    public SetExternalSAMLIdentityProviderResponse SetExternalSAMLIdentityProvider(SetExternalSAMLIdentityProviderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetExternalSAMLIdentityProvider", SetExternalSAMLIdentityProviderResponse.class);
    }

    /**
     *为权限配置修改自定义策略
     * @param req UpdateCustomPolicyForRoleConfigurationRequest
     * @return UpdateCustomPolicyForRoleConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCustomPolicyForRoleConfigurationResponse UpdateCustomPolicyForRoleConfiguration(UpdateCustomPolicyForRoleConfigurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateCustomPolicyForRoleConfiguration", UpdateCustomPolicyForRoleConfigurationResponse.class);
    }

    /**
     *修改用户组信息
     * @param req UpdateGroupRequest
     * @return UpdateGroupResponse
     * @throws TencentCloudSDKException
     */
    public UpdateGroupResponse UpdateGroup(UpdateGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateGroup", UpdateGroupResponse.class);
    }

    /**
     *更新组织身份
     * @param req UpdateOrganizationIdentityRequest
     * @return UpdateOrganizationIdentityResponse
     * @throws TencentCloudSDKException
     */
    public UpdateOrganizationIdentityResponse UpdateOrganizationIdentity(UpdateOrganizationIdentityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateOrganizationIdentity", UpdateOrganizationIdentityResponse.class);
    }

    /**
     *更新组织成员信息
     * @param req UpdateOrganizationMemberRequest
     * @return UpdateOrganizationMemberResponse
     * @throws TencentCloudSDKException
     */
    public UpdateOrganizationMemberResponse UpdateOrganizationMember(UpdateOrganizationMemberRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateOrganizationMember", UpdateOrganizationMemberResponse.class);
    }

    /**
     *修改绑定成员邮箱
     * @param req UpdateOrganizationMemberEmailBindRequest
     * @return UpdateOrganizationMemberEmailBindResponse
     * @throws TencentCloudSDKException
     */
    public UpdateOrganizationMemberEmailBindResponse UpdateOrganizationMemberEmailBind(UpdateOrganizationMemberEmailBindRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateOrganizationMemberEmailBind", UpdateOrganizationMemberEmailBindResponse.class);
    }

    /**
     *更新企业组织节点
     * @param req UpdateOrganizationNodeRequest
     * @return UpdateOrganizationNodeResponse
     * @throws TencentCloudSDKException
     */
    public UpdateOrganizationNodeResponse UpdateOrganizationNode(UpdateOrganizationNodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateOrganizationNode", UpdateOrganizationNodeResponse.class);
    }

    /**
     *编辑策略
     * @param req UpdatePolicyRequest
     * @return UpdatePolicyResponse
     * @throws TencentCloudSDKException
     */
    public UpdatePolicyResponse UpdatePolicy(UpdatePolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdatePolicy", UpdatePolicyResponse.class);
    }

    /**
     *修改权限配置信息
     * @param req UpdateRoleConfigurationRequest
     * @return UpdateRoleConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public UpdateRoleConfigurationResponse UpdateRoleConfiguration(UpdateRoleConfigurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateRoleConfiguration", UpdateRoleConfigurationResponse.class);
    }

    /**
     *启用/禁用SCIM密钥
     * @param req UpdateSCIMCredentialStatusRequest
     * @return UpdateSCIMCredentialStatusResponse
     * @throws TencentCloudSDKException
     */
    public UpdateSCIMCredentialStatusResponse UpdateSCIMCredentialStatus(UpdateSCIMCredentialStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateSCIMCredentialStatus", UpdateSCIMCredentialStatusResponse.class);
    }

    /**
     *启用/禁用用户SCIM同步
     * @param req UpdateSCIMSynchronizationStatusRequest
     * @return UpdateSCIMSynchronizationStatusResponse
     * @throws TencentCloudSDKException
     */
    public UpdateSCIMSynchronizationStatusResponse UpdateSCIMSynchronizationStatus(UpdateSCIMSynchronizationStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateSCIMSynchronizationStatus", UpdateSCIMSynchronizationStatusResponse.class);
    }

    /**
     *更新共享单元。
     * @param req UpdateShareUnitRequest
     * @return UpdateShareUnitResponse
     * @throws TencentCloudSDKException
     */
    public UpdateShareUnitResponse UpdateShareUnit(UpdateShareUnitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateShareUnit", UpdateShareUnitResponse.class);
    }

    /**
     *修改用户信息
     * @param req UpdateUserRequest
     * @return UpdateUserResponse
     * @throws TencentCloudSDKException
     */
    public UpdateUserResponse UpdateUser(UpdateUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateUser", UpdateUserResponse.class);
    }

    /**
     *修改用户状态
     * @param req UpdateUserStatusRequest
     * @return UpdateUserStatusResponse
     * @throws TencentCloudSDKException
     */
    public UpdateUserStatusResponse UpdateUserStatus(UpdateUserStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateUserStatus", UpdateUserStatusResponse.class);
    }

    /**
     *创建子用户同步任务
     * @param req UpdateUserSyncProvisioningRequest
     * @return UpdateUserSyncProvisioningResponse
     * @throws TencentCloudSDKException
     */
    public UpdateUserSyncProvisioningResponse UpdateUserSyncProvisioning(UpdateUserSyncProvisioningRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateUserSyncProvisioning", UpdateUserSyncProvisioningResponse.class);
    }

    /**
     *更新用户空间名
     * @param req UpdateZoneRequest
     * @return UpdateZoneResponse
     * @throws TencentCloudSDKException
     */
    public UpdateZoneResponse UpdateZone(UpdateZoneRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateZone", UpdateZoneResponse.class);
    }

}
