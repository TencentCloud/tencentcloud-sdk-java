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
package com.tencentcloudapi.dasb.v20191018;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.dasb.v20191018.models.*;

public class DasbClient extends AbstractClient{
    private static String endpoint = "dasb.tencentcloudapi.com";
    private static String service = "dasb";
    private static String version = "2019-10-18";
    
    public DasbClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public DasbClient(Credential credential, String region, ClientProfile profile) {
        super(DasbClient.endpoint, DasbClient.version, credential, region, profile);
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
     *获取镜像列表
     * @param req DescribeDasbImageIdsRequest
     * @return DescribeDasbImageIdsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDasbImageIdsResponse DescribeDasbImageIds(DescribeDasbImageIdsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDasbImageIds", DescribeDasbImageIdsResponse.class);
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

}
