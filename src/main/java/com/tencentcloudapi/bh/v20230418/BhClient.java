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
package com.tencentcloudapi.bh.v20230418;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.bh.v20230418.models.*;

public class BhClient extends AbstractClient{
    private static String endpoint = "bh.tencentcloudapi.com";
    private static String service = "bh";
    private static String version = "2023-04-18";

    public BhClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public BhClient(Credential credential, String region, ClientProfile profile) {
        super(BhClient.endpoint, BhClient.version, credential, region, profile);
    }

    /**
     *外部客户访问资产
     * @param req AccessDevicesRequest
     * @return AccessDevicesResponse
     * @throws TencentCloudSDKException
     */
    public AccessDevicesResponse AccessDevices(AccessDevicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AccessDevices", AccessDevicesResponse.class);
    }

    /**
     *添加资产组成员
     * @param req AddDeviceGroupMembersRequest
     * @return AddDeviceGroupMembersResponse
     * @throws TencentCloudSDKException
     */
    public AddDeviceGroupMembersResponse AddDeviceGroupMembers(AddDeviceGroupMembersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddDeviceGroupMembers", AddDeviceGroupMembersResponse.class);
    }

    /**
     *添加用户组成员
     * @param req AddUserGroupMembersRequest
     * @return AddUserGroupMembersResponse
     * @throws TencentCloudSDKException
     */
    public AddUserGroupMembersResponse AddUserGroupMembers(AddUserGroupMembersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddUserGroupMembers", AddUserGroupMembersResponse.class);
    }

    /**
     *绑定主机账号密码
     * @param req BindDeviceAccountPasswordRequest
     * @return BindDeviceAccountPasswordResponse
     * @throws TencentCloudSDKException
     */
    public BindDeviceAccountPasswordResponse BindDeviceAccountPassword(BindDeviceAccountPasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindDeviceAccountPassword", BindDeviceAccountPasswordResponse.class);
    }

    /**
     *绑定主机账号私钥
     * @param req BindDeviceAccountPrivateKeyRequest
     * @return BindDeviceAccountPrivateKeyResponse
     * @throws TencentCloudSDKException
     */
    public BindDeviceAccountPrivateKeyResponse BindDeviceAccountPrivateKey(BindDeviceAccountPrivateKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindDeviceAccountPrivateKey", BindDeviceAccountPrivateKeyResponse.class);
    }

    /**
     *修改资产绑定的堡垒机服务
     * @param req BindDeviceResourceRequest
     * @return BindDeviceResourceResponse
     * @throws TencentCloudSDKException
     */
    public BindDeviceResourceResponse BindDeviceResource(BindDeviceResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindDeviceResource", BindDeviceResourceResponse.class);
    }

    /**
     *测试LDAP连接
     * @param req CheckLDAPConnectionRequest
     * @return CheckLDAPConnectionResponse
     * @throws TencentCloudSDKException
     */
    public CheckLDAPConnectionResponse CheckLDAPConnection(CheckLDAPConnectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckLDAPConnection", CheckLDAPConnectionResponse.class);
    }

    /**
     *添加访问白名单规则
     * @param req CreateAccessWhiteListRuleRequest
     * @return CreateAccessWhiteListRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccessWhiteListRuleResponse CreateAccessWhiteListRule(CreateAccessWhiteListRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAccessWhiteListRule", CreateAccessWhiteListRuleResponse.class);
    }

    /**
     *新建访问权限
     * @param req CreateAclRequest
     * @return CreateAclResponse
     * @throws TencentCloudSDKException
     */
    public CreateAclResponse CreateAcl(CreateAclRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAcl", CreateAclResponse.class);
    }

    /**
     *创建手工资产同步任务
     * @param req CreateAssetSyncJobRequest
     * @return CreateAssetSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateAssetSyncJobResponse CreateAssetSyncJob(CreateAssetSyncJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAssetSyncJob", CreateAssetSyncJobResponse.class);
    }

    /**
     *创建修改密码任务
     * @param req CreateChangePwdTaskRequest
     * @return CreateChangePwdTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateChangePwdTaskResponse CreateChangePwdTask(CreateChangePwdTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateChangePwdTask", CreateChangePwdTaskResponse.class);
    }

    /**
     *新建高危命令模板
     * @param req CreateCmdTemplateRequest
     * @return CreateCmdTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateCmdTemplateResponse CreateCmdTemplate(CreateCmdTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCmdTemplate", CreateCmdTemplateResponse.class);
    }

    /**
     *新建主机账号
     * @param req CreateDeviceAccountRequest
     * @return CreateDeviceAccountResponse
     * @throws TencentCloudSDKException
     */
    public CreateDeviceAccountResponse CreateDeviceAccount(CreateDeviceAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDeviceAccount", CreateDeviceAccountResponse.class);
    }

    /**
     *新建资产组
     * @param req CreateDeviceGroupRequest
     * @return CreateDeviceGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateDeviceGroupResponse CreateDeviceGroup(CreateDeviceGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDeviceGroup", CreateDeviceGroupResponse.class);
    }

    /**
     *创建运维任务
     * @param req CreateOperationTaskRequest
     * @return CreateOperationTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateOperationTaskResponse CreateOperationTask(CreateOperationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateOperationTask", CreateOperationTaskResponse.class);
    }

    /**
     *创建堡垒机实例
     * @param req CreateResourceRequest
     * @return CreateResourceResponse
     * @throws TencentCloudSDKException
     */
    public CreateResourceResponse CreateResource(CreateResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateResource", CreateResourceResponse.class);
    }

    /**
     *创建用户同步任务
     * @param req CreateSyncUserTaskRequest
     * @return CreateSyncUserTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateSyncUserTaskResponse CreateSyncUserTask(CreateSyncUserTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSyncUserTask", CreateSyncUserTaskResponse.class);
    }

    /**
     *新建用户
     * @param req CreateUserRequest
     * @return CreateUserResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserResponse CreateUser(CreateUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateUser", CreateUserResponse.class);
    }

    /**
     *创建用户目录
     * @param req CreateUserDirectoryRequest
     * @return CreateUserDirectoryResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserDirectoryResponse CreateUserDirectory(CreateUserDirectoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateUserDirectory", CreateUserDirectoryResponse.class);
    }

    /**
     *新建用户组
     * @param req CreateUserGroupRequest
     * @return CreateUserGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserGroupResponse CreateUserGroup(CreateUserGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateUserGroup", CreateUserGroupResponse.class);
    }

    /**
     *删除访问白名单规则
     * @param req DeleteAccessWhiteListRulesRequest
     * @return DeleteAccessWhiteListRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAccessWhiteListRulesResponse DeleteAccessWhiteListRules(DeleteAccessWhiteListRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAccessWhiteListRules", DeleteAccessWhiteListRulesResponse.class);
    }

    /**
     *删除访问权限
     * @param req DeleteAclsRequest
     * @return DeleteAclsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAclsResponse DeleteAcls(DeleteAclsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAcls", DeleteAclsResponse.class);
    }

    /**
     *删除改密任务
     * @param req DeleteChangePwdTaskRequest
     * @return DeleteChangePwdTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteChangePwdTaskResponse DeleteChangePwdTask(DeleteChangePwdTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteChangePwdTask", DeleteChangePwdTaskResponse.class);
    }

    /**
     *删除高危命令模板
     * @param req DeleteCmdTemplatesRequest
     * @return DeleteCmdTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCmdTemplatesResponse DeleteCmdTemplates(DeleteCmdTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCmdTemplates", DeleteCmdTemplatesResponse.class);
    }

    /**
     *删除主机账号
     * @param req DeleteDeviceAccountsRequest
     * @return DeleteDeviceAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDeviceAccountsResponse DeleteDeviceAccounts(DeleteDeviceAccountsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDeviceAccounts", DeleteDeviceAccountsResponse.class);
    }

    /**
     *删除资产组成员
     * @param req DeleteDeviceGroupMembersRequest
     * @return DeleteDeviceGroupMembersResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDeviceGroupMembersResponse DeleteDeviceGroupMembers(DeleteDeviceGroupMembersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDeviceGroupMembers", DeleteDeviceGroupMembersResponse.class);
    }

    /**
     *删除资产组
     * @param req DeleteDeviceGroupsRequest
     * @return DeleteDeviceGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDeviceGroupsResponse DeleteDeviceGroups(DeleteDeviceGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDeviceGroups", DeleteDeviceGroupsResponse.class);
    }

    /**
     *删除主机
     * @param req DeleteDevicesRequest
     * @return DeleteDevicesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDevicesResponse DeleteDevices(DeleteDevicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDevices", DeleteDevicesResponse.class);
    }

    /**
     *删除运维任务
     * @param req DeleteOperationTasksRequest
     * @return DeleteOperationTasksResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOperationTasksResponse DeleteOperationTasks(DeleteOperationTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteOperationTasks", DeleteOperationTasksResponse.class);
    }

    /**
     *删除用户目录
     * @param req DeleteUserDirectoryRequest
     * @return DeleteUserDirectoryResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUserDirectoryResponse DeleteUserDirectory(DeleteUserDirectoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteUserDirectory", DeleteUserDirectoryResponse.class);
    }

    /**
     *删除用户组成员
     * @param req DeleteUserGroupMembersRequest
     * @return DeleteUserGroupMembersResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUserGroupMembersResponse DeleteUserGroupMembers(DeleteUserGroupMembersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteUserGroupMembers", DeleteUserGroupMembersResponse.class);
    }

    /**
     *删除用户组
     * @param req DeleteUserGroupsRequest
     * @return DeleteUserGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUserGroupsResponse DeleteUserGroups(DeleteUserGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteUserGroups", DeleteUserGroupsResponse.class);
    }

    /**
     *删除用户
     * @param req DeleteUsersRequest
     * @return DeleteUsersResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUsersResponse DeleteUsers(DeleteUsersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteUsers", DeleteUsersResponse.class);
    }

    /**
     *开通服务，初始化资源，只针对新购资源
     * @param req DeployResourceRequest
     * @return DeployResourceResponse
     * @throws TencentCloudSDKException
     */
    public DeployResourceResponse DeployResource(DeployResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeployResource", DeployResourceResponse.class);
    }

    /**
     *查询访问白名单规则列表
     * @param req DescribeAccessWhiteListRulesRequest
     * @return DescribeAccessWhiteListRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessWhiteListRulesResponse DescribeAccessWhiteListRules(DescribeAccessWhiteListRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessWhiteListRules", DescribeAccessWhiteListRulesResponse.class);
    }

    /**
     *获取账号组信息
     * @param req DescribeAccountGroupsRequest
     * @return DescribeAccountGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountGroupsResponse DescribeAccountGroups(DescribeAccountGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccountGroups", DescribeAccountGroupsResponse.class);
    }

    /**
     *查询访问权限列表
     * @param req DescribeAclsRequest
     * @return DescribeAclsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAclsResponse DescribeAcls(DescribeAclsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAcls", DescribeAclsResponse.class);
    }

    /**
     *查询资产自动同步开关
     * @param req DescribeAssetSyncFlagRequest
     * @return DescribeAssetSyncFlagResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetSyncFlagResponse DescribeAssetSyncFlag(DescribeAssetSyncFlagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetSyncFlag", DescribeAssetSyncFlagResponse.class);
    }

    /**
     *查询资产同步状态
     * @param req DescribeAssetSyncStatusRequest
     * @return DescribeAssetSyncStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetSyncStatusResponse DescribeAssetSyncStatus(DescribeAssetSyncStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetSyncStatus", DescribeAssetSyncStatusResponse.class);
    }

    /**
     *查询改密任务列表
     * @param req DescribeChangePwdTaskRequest
     * @return DescribeChangePwdTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeChangePwdTaskResponse DescribeChangePwdTask(DescribeChangePwdTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeChangePwdTask", DescribeChangePwdTaskResponse.class);
    }

    /**
     *查询改密任务详情
     * @param req DescribeChangePwdTaskDetailRequest
     * @return DescribeChangePwdTaskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeChangePwdTaskDetailResponse DescribeChangePwdTaskDetail(DescribeChangePwdTaskDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeChangePwdTaskDetail", DescribeChangePwdTaskDetailResponse.class);
    }

    /**
     *查询命令模板列表
     * @param req DescribeCmdTemplatesRequest
     * @return DescribeCmdTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCmdTemplatesResponse DescribeCmdTemplates(DescribeCmdTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCmdTemplates", DescribeCmdTemplatesResponse.class);
    }

    /**
     *查询主机账号列表
     * @param req DescribeDeviceAccountsRequest
     * @return DescribeDeviceAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceAccountsResponse DescribeDeviceAccounts(DescribeDeviceAccountsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeviceAccounts", DescribeDeviceAccountsResponse.class);
    }

    /**
     *查询资产组成员列表
     * @param req DescribeDeviceGroupMembersRequest
     * @return DescribeDeviceGroupMembersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceGroupMembersResponse DescribeDeviceGroupMembers(DescribeDeviceGroupMembersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeviceGroupMembers", DescribeDeviceGroupMembersResponse.class);
    }

    /**
     *查询资产组列表
     * @param req DescribeDeviceGroupsRequest
     * @return DescribeDeviceGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceGroupsResponse DescribeDeviceGroups(DescribeDeviceGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeviceGroups", DescribeDeviceGroupsResponse.class);
    }

    /**
     *查询资产列表
     * @param req DescribeDevicesRequest
     * @return DescribeDevicesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDevicesResponse DescribeDevices(DescribeDevicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDevices", DescribeDevicesResponse.class);
    }

    /**
     *查询网络域
     * @param req DescribeDomainsRequest
     * @return DescribeDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainsResponse DescribeDomains(DescribeDomainsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomains", DescribeDomainsResponse.class);
    }

    /**
     *获取LDAP ou 列表
     * @param req DescribeLDAPUnitSetRequest
     * @return DescribeLDAPUnitSetResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLDAPUnitSetResponse DescribeLDAPUnitSet(DescribeLDAPUnitSetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLDAPUnitSet", DescribeLDAPUnitSetResponse.class);
    }

    /**
     *查询登录日志
     * @param req DescribeLoginEventRequest
     * @return DescribeLoginEventResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoginEventResponse DescribeLoginEvent(DescribeLoginEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLoginEvent", DescribeLoginEventResponse.class);
    }

    /**
     *查询操作日志
     * @param req DescribeOperationEventRequest
     * @return DescribeOperationEventResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOperationEventResponse DescribeOperationEvent(DescribeOperationEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOperationEvent", DescribeOperationEventResponse.class);
    }

    /**
     *获取运维任务列表
     * @param req DescribeOperationTaskRequest
     * @return DescribeOperationTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOperationTaskResponse DescribeOperationTask(DescribeOperationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOperationTask", DescribeOperationTaskResponse.class);
    }

    /**
     *查询用户购买的堡垒机服务信息，包括资源ID、授权点数、VPC、过期时间等。
     * @param req DescribeResourcesRequest
     * @return DescribeResourcesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourcesResponse DescribeResources(DescribeResourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResources", DescribeResourcesResponse.class);
    }

    /**
     *查询安全配置信息
     * @param req DescribeSecuritySettingRequest
     * @return DescribeSecuritySettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecuritySettingResponse DescribeSecuritySetting(DescribeSecuritySettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecuritySetting", DescribeSecuritySettingResponse.class);
    }

    /**
     *获取认证源信息
     * @param req DescribeSourceTypesRequest
     * @return DescribeSourceTypesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSourceTypesResponse DescribeSourceTypes(DescribeSourceTypesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSourceTypes", DescribeSourceTypesResponse.class);
    }

    /**
     *获取用户目录
     * @param req DescribeUserDirectoryRequest
     * @return DescribeUserDirectoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserDirectoryResponse DescribeUserDirectory(DescribeUserDirectoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserDirectory", DescribeUserDirectoryResponse.class);
    }

    /**
     *查询用户组成员列表
     * @param req DescribeUserGroupMembersRequest
     * @return DescribeUserGroupMembersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserGroupMembersResponse DescribeUserGroupMembers(DescribeUserGroupMembersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserGroupMembers", DescribeUserGroupMembersResponse.class);
    }

    /**
     *查询用户组列表
     * @param req DescribeUserGroupsRequest
     * @return DescribeUserGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserGroupsResponse DescribeUserGroups(DescribeUserGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserGroups", DescribeUserGroupsResponse.class);
    }

    /**
     *获取用户同步状态
     * @param req DescribeUserSyncStatusRequest
     * @return DescribeUserSyncStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserSyncStatusResponse DescribeUserSyncStatus(DescribeUserSyncStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserSyncStatus", DescribeUserSyncStatusResponse.class);
    }

    /**
     *查询用户列表
     * @param req DescribeUsersRequest
     * @return DescribeUsersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsersResponse DescribeUsers(DescribeUsersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUsers", DescribeUsersResponse.class);
    }

    /**
     *关闭公网访问堡垒机
     * @param req DisableExternalAccessRequest
     * @return DisableExternalAccessResponse
     * @throws TencentCloudSDKException
     */
    public DisableExternalAccessResponse DisableExternalAccess(DisableExternalAccessRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableExternalAccess", DisableExternalAccessResponse.class);
    }

    /**
     *关闭内网访问
     * @param req DisableIntranetAccessRequest
     * @return DisableIntranetAccessResponse
     * @throws TencentCloudSDKException
     */
    public DisableIntranetAccessResponse DisableIntranetAccess(DisableIntranetAccessRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableIntranetAccess", DisableIntranetAccessResponse.class);
    }

    /**
     *开启公网访问堡垒机
     * @param req EnableExternalAccessRequest
     * @return EnableExternalAccessResponse
     * @throws TencentCloudSDKException
     */
    public EnableExternalAccessResponse EnableExternalAccess(EnableExternalAccessRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableExternalAccess", EnableExternalAccessResponse.class);
    }

    /**
     *开通内网访问
     * @param req EnableIntranetAccessRequest
     * @return EnableIntranetAccessResponse
     * @throws TencentCloudSDKException
     */
    public EnableIntranetAccessResponse EnableIntranetAccess(EnableIntranetAccessRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableIntranetAccess", EnableIntranetAccessResponse.class);
    }

    /**
     *导入外部资产信息
     * @param req ImportExternalDeviceRequest
     * @return ImportExternalDeviceResponse
     * @throws TencentCloudSDKException
     */
    public ImportExternalDeviceResponse ImportExternalDevice(ImportExternalDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImportExternalDevice", ImportExternalDeviceResponse.class);
    }

    /**
     *修改访问白名单自动添加IP状态：开启或关闭自动添加IP
     * @param req ModifyAccessWhiteListAutoStatusRequest
     * @return ModifyAccessWhiteListAutoStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccessWhiteListAutoStatusResponse ModifyAccessWhiteListAutoStatus(ModifyAccessWhiteListAutoStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAccessWhiteListAutoStatus", ModifyAccessWhiteListAutoStatusResponse.class);
    }

    /**
     *修改访问白名单规则
     * @param req ModifyAccessWhiteListRuleRequest
     * @return ModifyAccessWhiteListRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccessWhiteListRuleResponse ModifyAccessWhiteListRule(ModifyAccessWhiteListRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAccessWhiteListRule", ModifyAccessWhiteListRuleResponse.class);
    }

    /**
     *修改访问白名单状态：开启或关闭放开全部来源IP。
     * @param req ModifyAccessWhiteListStatusRequest
     * @return ModifyAccessWhiteListStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccessWhiteListStatusResponse ModifyAccessWhiteListStatus(ModifyAccessWhiteListStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAccessWhiteListStatus", ModifyAccessWhiteListStatusResponse.class);
    }

    /**
     *修改访问权限
     * @param req ModifyAclRequest
     * @return ModifyAclResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAclResponse ModifyAcl(ModifyAclRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAcl", ModifyAclResponse.class);
    }

    /**
     *修改资产自动同步开关
     * @param req ModifyAssetSyncFlagRequest
     * @return ModifyAssetSyncFlagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAssetSyncFlagResponse ModifyAssetSyncFlag(ModifyAssetSyncFlagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAssetSyncFlag", ModifyAssetSyncFlagResponse.class);
    }

    /**
     *修改认证方式配置信息
     * @param req ModifyAuthModeSettingRequest
     * @return ModifyAuthModeSettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAuthModeSettingResponse ModifyAuthModeSetting(ModifyAuthModeSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAuthModeSetting", ModifyAuthModeSettingResponse.class);
    }

    /**
     *更新修改密码任务
     * @param req ModifyChangePwdTaskRequest
     * @return ModifyChangePwdTaskResponse
     * @throws TencentCloudSDKException
     */
    public ModifyChangePwdTaskResponse ModifyChangePwdTask(ModifyChangePwdTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyChangePwdTask", ModifyChangePwdTaskResponse.class);
    }

    /**
     *修改高危命令模板
     * @param req ModifyCmdTemplateRequest
     * @return ModifyCmdTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCmdTemplateResponse ModifyCmdTemplate(ModifyCmdTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCmdTemplate", ModifyCmdTemplateResponse.class);
    }

    /**
     *修改资产信息
     * @param req ModifyDeviceRequest
     * @return ModifyDeviceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDeviceResponse ModifyDevice(ModifyDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDevice", ModifyDeviceResponse.class);
    }

    /**
     *修改资产组
     * @param req ModifyDeviceGroupRequest
     * @return ModifyDeviceGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDeviceGroupResponse ModifyDeviceGroup(ModifyDeviceGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDeviceGroup", ModifyDeviceGroupResponse.class);
    }

    /**
     *修改LDAP配置信息
     * @param req ModifyLDAPSettingRequest
     * @return ModifyLDAPSettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLDAPSettingResponse ModifyLDAPSetting(ModifyLDAPSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLDAPSetting", ModifyLDAPSettingResponse.class);
    }

    /**
     *设置OAuth认证参数
     * @param req ModifyOAuthSettingRequest
     * @return ModifyOAuthSettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyOAuthSettingResponse ModifyOAuthSetting(ModifyOAuthSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyOAuthSetting", ModifyOAuthSettingResponse.class);
    }

    /**
     *修改运维任务
     * @param req ModifyOperationTaskRequest
     * @return ModifyOperationTaskResponse
     * @throws TencentCloudSDKException
     */
    public ModifyOperationTaskResponse ModifyOperationTask(ModifyOperationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyOperationTask", ModifyOperationTaskResponse.class);
    }

    /**
     *修改运维资产连接重连次数
     * @param req ModifyReconnectionSettingRequest
     * @return ModifyReconnectionSettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyReconnectionSettingResponse ModifyReconnectionSetting(ModifyReconnectionSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyReconnectionSetting", ModifyReconnectionSettingResponse.class);
    }

    /**
     *资源变配
     * @param req ModifyResourceRequest
     * @return ModifyResourceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyResourceResponse ModifyResource(ModifyResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyResource", ModifyResourceResponse.class);
    }

    /**
     *修改用户信息
     * @param req ModifyUserRequest
     * @return ModifyUserResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserResponse ModifyUser(ModifyUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUser", ModifyUserResponse.class);
    }

    /**
     *修改用户目录信息
     * @param req ModifyUserDirectoryRequest
     * @return ModifyUserDirectoryResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserDirectoryResponse ModifyUserDirectory(ModifyUserDirectoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUserDirectory", ModifyUserDirectoryResponse.class);
    }

    /**
     *修改用户组
     * @param req ModifyUserGroupRequest
     * @return ModifyUserGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserGroupResponse ModifyUserGroup(ModifyUserGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUserGroup", ModifyUserGroupResponse.class);
    }

    /**
     *会话回放
     * @param req ReplaySessionRequest
     * @return ReplaySessionResponse
     * @throws TencentCloudSDKException
     */
    public ReplaySessionResponse ReplaySession(ReplaySessionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReplaySession", ReplaySessionResponse.class);
    }

    /**
     *清除设备账号绑定密码
     * @param req ResetDeviceAccountPasswordRequest
     * @return ResetDeviceAccountPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ResetDeviceAccountPasswordResponse ResetDeviceAccountPassword(ResetDeviceAccountPasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetDeviceAccountPassword", ResetDeviceAccountPasswordResponse.class);
    }

    /**
     *清除设备账号绑定的密钥
     * @param req ResetDeviceAccountPrivateKeyRequest
     * @return ResetDeviceAccountPrivateKeyResponse
     * @throws TencentCloudSDKException
     */
    public ResetDeviceAccountPrivateKeyResponse ResetDeviceAccountPrivateKey(ResetDeviceAccountPrivateKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetDeviceAccountPrivateKey", ResetDeviceAccountPrivateKeyResponse.class);
    }

    /**
     *重置用户
     * @param req ResetUserRequest
     * @return ResetUserResponse
     * @throws TencentCloudSDKException
     */
    public ResetUserResponse ResetUser(ResetUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetUser", ResetUserResponse.class);
    }

    /**
     *执行改密任务
     * @param req RunChangePwdTaskRequest
     * @return RunChangePwdTaskResponse
     * @throws TencentCloudSDKException
     */
    public RunChangePwdTaskResponse RunChangePwdTask(RunChangePwdTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RunChangePwdTask", RunChangePwdTaskResponse.class);
    }

    /**
     *执行运维任务
     * @param req RunOperationTaskRequest
     * @return RunOperationTaskResponse
     * @throws TencentCloudSDKException
     */
    public RunOperationTaskResponse RunOperationTask(RunOperationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RunOperationTask", RunOperationTaskResponse.class);
    }

    /**
     *搜索审计日志
     * @param req SearchAuditLogRequest
     * @return SearchAuditLogResponse
     * @throws TencentCloudSDKException
     */
    public SearchAuditLogResponse SearchAuditLog(SearchAuditLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchAuditLog", SearchAuditLogResponse.class);
    }

    /**
     *命令执行检索
     * @param req SearchCommandRequest
     * @return SearchCommandResponse
     * @throws TencentCloudSDKException
     */
    public SearchCommandResponse SearchCommand(SearchCommandRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchCommand", SearchCommandResponse.class);
    }

    /**
     *根据会话Id搜索Command
     * @param req SearchCommandBySidRequest
     * @return SearchCommandBySidResponse
     * @throws TencentCloudSDKException
     */
    public SearchCommandBySidResponse SearchCommandBySid(SearchCommandBySidRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchCommandBySid", SearchCommandBySidResponse.class);
    }

    /**
     *文件传输检索
     * @param req SearchFileRequest
     * @return SearchFileResponse
     * @throws TencentCloudSDKException
     */
    public SearchFileResponse SearchFile(SearchFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchFile", SearchFileResponse.class);
    }

    /**
     *搜索文件传输会话下文件操作列表
     * @param req SearchFileBySidRequest
     * @return SearchFileBySidResponse
     * @throws TencentCloudSDKException
     */
    public SearchFileBySidResponse SearchFileBySid(SearchFileBySidRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchFileBySid", SearchFileBySidResponse.class);
    }

    /**
     *搜索会话
     * @param req SearchSessionRequest
     * @return SearchSessionResponse
     * @throws TencentCloudSDKException
     */
    public SearchSessionResponse SearchSession(SearchSessionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchSession", SearchSessionResponse.class);
    }

    /**
     *命令检索
     * @param req SearchSessionCommandRequest
     * @return SearchSessionCommandResponse
     * @throws TencentCloudSDKException
     */
    public SearchSessionCommandResponse SearchSessionCommand(SearchSessionCommandRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchSessionCommand", SearchSessionCommandResponse.class);
    }

    /**
     *查询运维子任务执行结果
     * @param req SearchSubtaskResultByIdRequest
     * @return SearchSubtaskResultByIdResponse
     * @throws TencentCloudSDKException
     */
    public SearchSubtaskResultByIdResponse SearchSubtaskResultById(SearchSubtaskResultByIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchSubtaskResultById", SearchSubtaskResultByIdResponse.class);
    }

    /**
     *搜索运维任务执行结果
     * @param req SearchTaskResultRequest
     * @return SearchTaskResultResponse
     * @throws TencentCloudSDKException
     */
    public SearchTaskResultResponse SearchTaskResult(SearchTaskResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchTaskResult", SearchTaskResultResponse.class);
    }

    /**
     *设置LDAP 立即同步标记
     * @param req SetLDAPSyncFlagRequest
     * @return SetLDAPSyncFlagResponse
     * @throws TencentCloudSDKException
     */
    public SetLDAPSyncFlagResponse SetLDAPSyncFlag(SetLDAPSyncFlagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetLDAPSyncFlag", SetLDAPSyncFlagResponse.class);
    }

    /**
     *同步资产到IOA
     * @param req SyncDevicesToIOARequest
     * @return SyncDevicesToIOAResponse
     * @throws TencentCloudSDKException
     */
    public SyncDevicesToIOAResponse SyncDevicesToIOA(SyncDevicesToIOARequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SyncDevicesToIOA", SyncDevicesToIOAResponse.class);
    }

    /**
     *同步堡垒机本地用户到IOA
     * @param req SyncUserToIOARequest
     * @return SyncUserToIOAResponse
     * @throws TencentCloudSDKException
     */
    public SyncUserToIOAResponse SyncUserToIOA(SyncUserToIOARequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SyncUserToIOA", SyncUserToIOAResponse.class);
    }

    /**
     *解锁用户
     * @param req UnlockUserRequest
     * @return UnlockUserResponse
     * @throws TencentCloudSDKException
     */
    public UnlockUserResponse UnlockUser(UnlockUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnlockUser", UnlockUserResponse.class);
    }

}
