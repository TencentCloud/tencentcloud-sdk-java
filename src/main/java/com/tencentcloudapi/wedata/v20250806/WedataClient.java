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
package com.tencentcloudapi.wedata.v20250806;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.wedata.v20250806.models.*;

public class WedataClient extends AbstractClient{
    private static String endpoint = "wedata.tencentcloudapi.com";
    private static String service = "wedata";
    private static String version = "2025-08-06";

    public WedataClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public WedataClient(Credential credential, String region, ClientProfile profile) {
        super(WedataClient.endpoint, WedataClient.version, credential, region, profile);
    }

    /**
     *关联项目集群
     * @param req AddCalcEnginesToProjectRequest
     * @return AddCalcEnginesToProjectResponse
     * @throws TencentCloudSDKException
     */
    public AddCalcEnginesToProjectResponse AddCalcEnginesToProject(AddCalcEnginesToProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddCalcEnginesToProject", AddCalcEnginesToProjectResponse.class);
    }

    /**
     *该接口用于将指定执行资源组绑定到项目
     * @param req AssociateResourceGroupToProjectRequest
     * @return AssociateResourceGroupToProjectResponse
     * @throws TencentCloudSDKException
     */
    public AssociateResourceGroupToProjectResponse AssociateResourceGroupToProject(AssociateResourceGroupToProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssociateResourceGroupToProject", AssociateResourceGroupToProjectResponse.class);
    }

    /**
     *授权数据源
     * @param req AuthorizeDataSourceRequest
     * @return AuthorizeDataSourceResponse
     * @throws TencentCloudSDKException
     */
    public AuthorizeDataSourceResponse AuthorizeDataSource(AuthorizeDataSourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AuthorizeDataSource", AuthorizeDataSourceResponse.class);
    }

    /**
     *新建代码文件
     * @param req CreateCodeFileRequest
     * @return CreateCodeFileResponse
     * @throws TencentCloudSDKException
     */
    public CreateCodeFileResponse CreateCodeFile(CreateCodeFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCodeFile", CreateCodeFileResponse.class);
    }

    /**
     *新建代码文件夹
     * @param req CreateCodeFolderRequest
     * @return CreateCodeFolderResponse
     * @throws TencentCloudSDKException
     */
    public CreateCodeFolderResponse CreateCodeFolder(CreateCodeFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCodeFolder", CreateCodeFolderResponse.class);
    }

    /**
     *配置CodeStudio实体权限
     * @param req CreateCodePermissionsRequest
     * @return CreateCodePermissionsResponse
     * @throws TencentCloudSDKException
     */
    public CreateCodePermissionsResponse CreateCodePermissions(CreateCodePermissionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCodePermissions", CreateCodePermissionsResponse.class);
    }

    /**
     *创建数据补录计划
     * @param req CreateDataBackfillPlanRequest
     * @return CreateDataBackfillPlanResponse
     * @throws TencentCloudSDKException
     */
    public CreateDataBackfillPlanResponse CreateDataBackfillPlan(CreateDataBackfillPlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDataBackfillPlan", CreateDataBackfillPlanResponse.class);
    }

    /**
     *该接口用于在指定项目中创建数据源
     * @param req CreateDataSourceRequest
     * @return CreateDataSourceResponse
     * @throws TencentCloudSDKException
     */
    public CreateDataSourceResponse CreateDataSource(CreateDataSourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDataSource", CreateDataSourceResponse.class);
    }

    /**
     *设置告警规则
     * @param req CreateOpsAlarmRuleRequest
     * @return CreateOpsAlarmRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateOpsAlarmRuleResponse CreateOpsAlarmRule(CreateOpsAlarmRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateOpsAlarmRule", CreateOpsAlarmRuleResponse.class);
    }

    /**
     *创建项目，创建时包含集群信息
     * @param req CreateProjectRequest
     * @return CreateProjectResponse
     * @throws TencentCloudSDKException
     */
    public CreateProjectResponse CreateProject(CreateProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateProject", CreateProjectResponse.class);
    }

    /**
     *添加项目用户角色
     * @param req CreateProjectMemberRequest
     * @return CreateProjectMemberResponse
     * @throws TencentCloudSDKException
     */
    public CreateProjectMemberResponse CreateProjectMember(CreateProjectMemberRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateProjectMember", CreateProjectMemberResponse.class);
    }

    /**
     *创建监控任务
     * @param req CreateQualityRuleGroupRequest
     * @return CreateQualityRuleGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateQualityRuleGroupResponse CreateQualityRuleGroup(CreateQualityRuleGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateQualityRuleGroup", CreateQualityRuleGroupResponse.class);
    }

    /**
     *创建资源文件
     * @param req CreateResourceFileRequest
     * @return CreateResourceFileResponse
     * @throws TencentCloudSDKException
     */
    public CreateResourceFileResponse CreateResourceFile(CreateResourceFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateResourceFile", CreateResourceFileResponse.class);
    }

    /**
     *创建资源文件文件夹
     * @param req CreateResourceFolderRequest
     * @return CreateResourceFolderResponse
     * @throws TencentCloudSDKException
     */
    public CreateResourceFolderResponse CreateResourceFolder(CreateResourceFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateResourceFolder", CreateResourceFolderResponse.class);
    }

    /**
     *该接口用于购买资源
     * @param req CreateResourceGroupRequest
     * @return CreateResourceGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateResourceGroupResponse CreateResourceGroup(CreateResourceGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateResourceGroup", CreateResourceGroupResponse.class);
    }

    /**
     *创建数据探索脚本文件夹
     * @param req CreateSQLFolderRequest
     * @return CreateSQLFolderResponse
     * @throws TencentCloudSDKException
     */
    public CreateSQLFolderResponse CreateSQLFolder(CreateSQLFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSQLFolder", CreateSQLFolderResponse.class);
    }

    /**
     *新增SQL脚本
     * @param req CreateSQLScriptRequest
     * @return CreateSQLScriptResponse
     * @throws TencentCloudSDKException
     */
    public CreateSQLScriptResponse CreateSQLScript(CreateSQLScriptRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSQLScript", CreateSQLScriptResponse.class);
    }

    /**
     *创建任务接口
     * @param req CreateTaskRequest
     * @return CreateTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateTaskResponse CreateTask(CreateTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTask", CreateTaskResponse.class);
    }

    /**
     *创建文件夹
     * @param req CreateTaskFolderRequest
     * @return CreateTaskFolderResponse
     * @throws TencentCloudSDKException
     */
    public CreateTaskFolderResponse CreateTaskFolder(CreateTaskFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTaskFolder", CreateTaskFolderResponse.class);
    }

    /**
     *创建任务接口
     * @param req CreateTriggerTaskRequest
     * @return CreateTriggerTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateTriggerTaskResponse CreateTriggerTask(CreateTriggerTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTriggerTask", CreateTriggerTaskResponse.class);
    }

    /**
     *创建工作流
     * @param req CreateTriggerWorkflowRequest
     * @return CreateTriggerWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public CreateTriggerWorkflowResponse CreateTriggerWorkflow(CreateTriggerWorkflowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTriggerWorkflow", CreateTriggerWorkflowResponse.class);
    }

    /**
     *创建工作流
     * @param req CreateWorkflowRequest
     * @return CreateWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public CreateWorkflowResponse CreateWorkflow(CreateWorkflowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWorkflow", CreateWorkflowResponse.class);
    }

    /**
     *创建文件夹
     * @param req CreateWorkflowFolderRequest
     * @return CreateWorkflowFolderResponse
     * @throws TencentCloudSDKException
     */
    public CreateWorkflowFolderResponse CreateWorkflowFolder(CreateWorkflowFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWorkflowFolder", CreateWorkflowFolderResponse.class);
    }

    /**
     *数据开发配置权限
     * @param req CreateWorkflowPermissionsRequest
     * @return CreateWorkflowPermissionsResponse
     * @throws TencentCloudSDKException
     */
    public CreateWorkflowPermissionsResponse CreateWorkflowPermissions(CreateWorkflowPermissionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWorkflowPermissions", CreateWorkflowPermissionsResponse.class);
    }

    /**
     *删除代码文件
     * @param req DeleteCodeFileRequest
     * @return DeleteCodeFileResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCodeFileResponse DeleteCodeFile(DeleteCodeFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCodeFile", DeleteCodeFileResponse.class);
    }

    /**
     *数据探索删除文件夹
     * @param req DeleteCodeFolderRequest
     * @return DeleteCodeFolderResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCodeFolderResponse DeleteCodeFolder(DeleteCodeFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCodeFolder", DeleteCodeFolderResponse.class);
    }

    /**
     *删除CodeStudio实体权限
     * @param req DeleteCodePermissionsRequest
     * @return DeleteCodePermissionsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCodePermissionsResponse DeleteCodePermissions(DeleteCodePermissionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCodePermissions", DeleteCodePermissionsResponse.class);
    }

    /**
     *删除补录计划
     * @param req DeleteDataBackfillPlanAsyncRequest
     * @return DeleteDataBackfillPlanAsyncResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDataBackfillPlanAsyncResponse DeleteDataBackfillPlanAsync(DeleteDataBackfillPlanAsyncRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDataBackfillPlanAsync", DeleteDataBackfillPlanAsyncResponse.class);
    }

    /**
     *该接口用于删除数据源
     * @param req DeleteDataSourceRequest
     * @return DeleteDataSourceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDataSourceResponse DeleteDataSource(DeleteDataSourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDataSource", DeleteDataSourceResponse.class);
    }

    /**
     *RegisterLineage
     * @param req DeleteLineageRequest
     * @return DeleteLineageResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLineageResponse DeleteLineage(DeleteLineageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLineage", DeleteLineageResponse.class);
    }

    /**
     *删除告警规则
     * @param req DeleteOpsAlarmRuleRequest
     * @return DeleteOpsAlarmRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOpsAlarmRuleResponse DeleteOpsAlarmRule(DeleteOpsAlarmRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteOpsAlarmRule", DeleteOpsAlarmRuleResponse.class);
    }

    /**
     *删除项目
     * @param req DeleteProjectRequest
     * @return DeleteProjectResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProjectResponse DeleteProject(DeleteProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteProject", DeleteProjectResponse.class);
    }

    /**
     *删除项目用户
     * @param req DeleteProjectMemberRequest
     * @return DeleteProjectMemberResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProjectMemberResponse DeleteProjectMember(DeleteProjectMemberRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteProjectMember", DeleteProjectMemberResponse.class);
    }

    /**
     *删除质量规则接口
     * @param req DeleteQualityRuleRequest
     * @return DeleteQualityRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteQualityRuleResponse DeleteQualityRule(DeleteQualityRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteQualityRule", DeleteQualityRuleResponse.class);
    }

    /**
     *删除监控任务
     * @param req DeleteQualityRuleGroupRequest
     * @return DeleteQualityRuleGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteQualityRuleGroupResponse DeleteQualityRuleGroup(DeleteQualityRuleGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteQualityRuleGroup", DeleteQualityRuleGroupResponse.class);
    }

    /**
     *资源管理-删除资源文件
     * @param req DeleteResourceFileRequest
     * @return DeleteResourceFileResponse
     * @throws TencentCloudSDKException
     */
    public DeleteResourceFileResponse DeleteResourceFile(DeleteResourceFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteResourceFile", DeleteResourceFileResponse.class);
    }

    /**
     *删除资源文件文件夹
     * @param req DeleteResourceFolderRequest
     * @return DeleteResourceFolderResponse
     * @throws TencentCloudSDKException
     */
    public DeleteResourceFolderResponse DeleteResourceFolder(DeleteResourceFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteResourceFolder", DeleteResourceFolderResponse.class);
    }

    /**
     *该接口用于销毁资源
     * @param req DeleteResourceGroupRequest
     * @return DeleteResourceGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteResourceGroupResponse DeleteResourceGroup(DeleteResourceGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteResourceGroup", DeleteResourceGroupResponse.class);
    }

    /**
     *删除SQL文件夹
     * @param req DeleteSQLFolderRequest
     * @return DeleteSQLFolderResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSQLFolderResponse DeleteSQLFolder(DeleteSQLFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSQLFolder", DeleteSQLFolderResponse.class);
    }

    /**
     *删除探索脚本
     * @param req DeleteSQLScriptRequest
     * @return DeleteSQLScriptResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSQLScriptResponse DeleteSQLScript(DeleteSQLScriptRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSQLScript", DeleteSQLScriptResponse.class);
    }

    /**
     *删除编排空间任务
     * @param req DeleteTaskRequest
     * @return DeleteTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTaskResponse DeleteTask(DeleteTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTask", DeleteTaskResponse.class);
    }

    /**
     *删除数据开发任务文件夹
     * @param req DeleteTaskFolderRequest
     * @return DeleteTaskFolderResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTaskFolderResponse DeleteTaskFolder(DeleteTaskFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTaskFolder", DeleteTaskFolderResponse.class);
    }

    /**
     *删除工作流调度任务
     * @param req DeleteTriggerTaskRequest
     * @return DeleteTriggerTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTriggerTaskResponse DeleteTriggerTask(DeleteTriggerTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTriggerTask", DeleteTriggerTaskResponse.class);
    }

    /**
     *删除工作流
     * @param req DeleteTriggerWorkflowRequest
     * @return DeleteTriggerWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTriggerWorkflowResponse DeleteTriggerWorkflow(DeleteTriggerWorkflowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTriggerWorkflow", DeleteTriggerWorkflowResponse.class);
    }

    /**
     *删除工作流
     * @param req DeleteWorkflowRequest
     * @return DeleteWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWorkflowResponse DeleteWorkflow(DeleteWorkflowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteWorkflow", DeleteWorkflowResponse.class);
    }

    /**
     *删除数据开发文件夹
     * @param req DeleteWorkflowFolderRequest
     * @return DeleteWorkflowFolderResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWorkflowFolderResponse DeleteWorkflowFolder(DeleteWorkflowFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteWorkflowFolder", DeleteWorkflowFolderResponse.class);
    }

    /**
     *删除工作流文件夹权限
     * @param req DeleteWorkflowPermissionsRequest
     * @return DeleteWorkflowPermissionsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWorkflowPermissionsResponse DeleteWorkflowPermissions(DeleteWorkflowPermissionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteWorkflowPermissions", DeleteWorkflowPermissionsResponse.class);
    }

    /**
     *查看数据源权限
     * @param req DescribeDataSourceAuthorityRequest
     * @return DescribeDataSourceAuthorityResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataSourceAuthorityResponse DescribeDataSourceAuthority(DescribeDataSourceAuthorityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataSourceAuthority", DescribeDataSourceAuthorityResponse.class);
    }

    /**
     *禁用项目
     * @param req DisableProjectRequest
     * @return DisableProjectResponse
     * @throws TencentCloudSDKException
     */
    public DisableProjectResponse DisableProject(DisableProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableProject", DisableProjectResponse.class);
    }

    /**
     *该接口用于将指定执行资源组解除与项目的绑定
     * @param req DissociateResourceGroupFromProjectRequest
     * @return DissociateResourceGroupFromProjectResponse
     * @throws TencentCloudSDKException
     */
    public DissociateResourceGroupFromProjectResponse DissociateResourceGroupFromProject(DissociateResourceGroupFromProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DissociateResourceGroupFromProject", DissociateResourceGroupFromProjectResponse.class);
    }

    /**
     *启用项目
     * @param req EnableProjectRequest
     * @return EnableProjectResponse
     * @throws TencentCloudSDKException
     */
    public EnableProjectResponse EnableProject(EnableProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableProject", EnableProjectResponse.class);
    }

    /**
     *查询告警信息详情
     * @param req GetAlarmMessageRequest
     * @return GetAlarmMessageResponse
     * @throws TencentCloudSDKException
     */
    public GetAlarmMessageResponse GetAlarmMessage(GetAlarmMessageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetAlarmMessage", GetAlarmMessageResponse.class);
    }

    /**
     *查看代码文件详情
     * @param req GetCodeFileRequest
     * @return GetCodeFileResponse
     * @throws TencentCloudSDKException
     */
    public GetCodeFileResponse GetCodeFile(GetCodeFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetCodeFile", GetCodeFileResponse.class);
    }

    /**
     *获取sql文件夹详情
     * @param req GetCodeFolderRequest
     * @return GetCodeFolderResponse
     * @throws TencentCloudSDKException
     */
    public GetCodeFolderResponse GetCodeFolder(GetCodeFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetCodeFolder", GetCodeFolderResponse.class);
    }

    /**
     *获取补录计划详情
     * @param req GetDataBackfillPlanRequest
     * @return GetDataBackfillPlanResponse
     * @throws TencentCloudSDKException
     */
    public GetDataBackfillPlanResponse GetDataBackfillPlan(GetDataBackfillPlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDataBackfillPlan", GetDataBackfillPlanResponse.class);
    }

    /**
     *该接口用于查看指定数据源的详细信息
     * @param req GetDataSourceRequest
     * @return GetDataSourceResponse
     * @throws TencentCloudSDKException
     */
    public GetDataSourceResponse GetDataSource(GetDataSourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDataSource", GetDataSourceResponse.class);
    }

    /**
     *数据源关联任务详情
     * @param req GetDataSourceRelatedTasksRequest
     * @return GetDataSourceRelatedTasksResponse
     * @throws TencentCloudSDKException
     */
    public GetDataSourceRelatedTasksResponse GetDataSourceRelatedTasks(GetDataSourceRelatedTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDataSourceRelatedTasks", GetDataSourceRelatedTasksResponse.class);
    }

    /**
     *查看当前用户对CodeStudio实体的最大权限
     * @param req GetMyCodeMaxPermissionRequest
     * @return GetMyCodeMaxPermissionResponse
     * @throws TencentCloudSDKException
     */
    public GetMyCodeMaxPermissionResponse GetMyCodeMaxPermission(GetMyCodeMaxPermissionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetMyCodeMaxPermission", GetMyCodeMaxPermissionResponse.class);
    }

    /**
     *查询当前用户对工作流文件夹的递归最大权限
     * @param req GetMyWorkflowMaxPermissionRequest
     * @return GetMyWorkflowMaxPermissionResponse
     * @throws TencentCloudSDKException
     */
    public GetMyWorkflowMaxPermissionResponse GetMyWorkflowMaxPermission(GetMyWorkflowMaxPermissionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetMyWorkflowMaxPermission", GetMyWorkflowMaxPermissionResponse.class);
    }

    /**
     *根据告警规则id/名称查询单个告警规则信息
     * @param req GetOpsAlarmRuleRequest
     * @return GetOpsAlarmRuleResponse
     * @throws TencentCloudSDKException
     */
    public GetOpsAlarmRuleResponse GetOpsAlarmRule(GetOpsAlarmRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetOpsAlarmRule", GetOpsAlarmRuleResponse.class);
    }

    /**
     *查询运维中心异步操作详情
     * @param req GetOpsAsyncJobRequest
     * @return GetOpsAsyncJobResponse
     * @throws TencentCloudSDKException
     */
    public GetOpsAsyncJobResponse GetOpsAsyncJob(GetOpsAsyncJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetOpsAsyncJob", GetOpsAsyncJobResponse.class);
    }

    /**
     *获取任务详情
     * @param req GetOpsTaskRequest
     * @return GetOpsTaskResponse
     * @throws TencentCloudSDKException
     */
    public GetOpsTaskResponse GetOpsTask(GetOpsTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetOpsTask", GetOpsTaskResponse.class);
    }

    /**
     *获取任务代码
     * @param req GetOpsTaskCodeRequest
     * @return GetOpsTaskCodeResponse
     * @throws TencentCloudSDKException
     */
    public GetOpsTaskCodeResponse GetOpsTaskCode(GetOpsTaskCodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetOpsTaskCode", GetOpsTaskCodeResponse.class);
    }

    /**
     *查询工作流任务详情
     * @param req GetOpsTriggerWorkflowRequest
     * @return GetOpsTriggerWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public GetOpsTriggerWorkflowResponse GetOpsTriggerWorkflow(GetOpsTriggerWorkflowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetOpsTriggerWorkflow", GetOpsTriggerWorkflowResponse.class);
    }

    /**
     *根据工作流id，获取工作流调度详情。
     * @param req GetOpsWorkflowRequest
     * @return GetOpsWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public GetOpsWorkflowResponse GetOpsWorkflow(GetOpsWorkflowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetOpsWorkflow", GetOpsWorkflowResponse.class);
    }

    /**
     *获取项目信息
     * @param req GetProjectRequest
     * @return GetProjectResponse
     * @throws TencentCloudSDKException
     */
    public GetProjectResponse GetProject(GetProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetProject", GetProjectResponse.class);
    }

    /**
     *获取资源文件详情
     * @param req GetResourceFileRequest
     * @return GetResourceFileResponse
     * @throws TencentCloudSDKException
     */
    public GetResourceFileResponse GetResourceFile(GetResourceFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetResourceFile", GetResourceFileResponse.class);
    }

    /**
     *查询资源文件文件夹详情
     * @param req GetResourceFolderRequest
     * @return GetResourceFolderResponse
     * @throws TencentCloudSDKException
     */
    public GetResourceFolderResponse GetResourceFolder(GetResourceFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetResourceFolder", GetResourceFolderResponse.class);
    }

    /**
     *该接口用于查看指定执行资源组的监控指标
     * @param req GetResourceGroupMetricsRequest
     * @return GetResourceGroupMetricsResponse
     * @throws TencentCloudSDKException
     */
    public GetResourceGroupMetricsResponse GetResourceGroupMetrics(GetResourceGroupMetricsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetResourceGroupMetrics", GetResourceGroupMetricsResponse.class);
    }

    /**
     *获取sql文件夹详情
     * @param req GetSQLFolderRequest
     * @return GetSQLFolderResponse
     * @throws TencentCloudSDKException
     */
    public GetSQLFolderResponse GetSQLFolder(GetSQLFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetSQLFolder", GetSQLFolderResponse.class);
    }

    /**
     *查询脚本详情
     * @param req GetSQLScriptRequest
     * @return GetSQLScriptResponse
     * @throws TencentCloudSDKException
     */
    public GetSQLScriptResponse GetSQLScript(GetSQLScriptRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetSQLScript", GetSQLScriptResponse.class);
    }

    /**
     *查询表详情
     * @param req GetTableRequest
     * @return GetTableResponse
     * @throws TencentCloudSDKException
     */
    public GetTableResponse GetTable(GetTableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTable", GetTableResponse.class);
    }

    /**
     *查询表所有字段列表
     * @param req GetTableColumnsRequest
     * @return GetTableColumnsResponse
     * @throws TencentCloudSDKException
     */
    public GetTableColumnsResponse GetTableColumns(GetTableColumnsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTableColumns", GetTableColumnsResponse.class);
    }

    /**
     *获取任务详情接口
     * @param req GetTaskRequest
     * @return GetTaskResponse
     * @throws TencentCloudSDKException
     */
    public GetTaskResponse GetTask(GetTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTask", GetTaskResponse.class);
    }

    /**
     *获取任务代码
     * @param req GetTaskCodeRequest
     * @return GetTaskCodeResponse
     * @throws TencentCloudSDKException
     */
    public GetTaskCodeResponse GetTaskCode(GetTaskCodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTaskCode", GetTaskCodeResponse.class);
    }

    /**
     *查询任务文件夹详情
     * @param req GetTaskFolderRequest
     * @return GetTaskFolderResponse
     * @throws TencentCloudSDKException
     */
    public GetTaskFolderResponse GetTaskFolder(GetTaskFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTaskFolder", GetTaskFolderResponse.class);
    }

    /**
     *调度实例详情
     * @param req GetTaskInstanceRequest
     * @return GetTaskInstanceResponse
     * @throws TencentCloudSDKException
     */
    public GetTaskInstanceResponse GetTaskInstance(GetTaskInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTaskInstance", GetTaskInstanceResponse.class);
    }

    /**
     *获取实例列表
     * @param req GetTaskInstanceLogRequest
     * @return GetTaskInstanceLogResponse
     * @throws TencentCloudSDKException
     */
    public GetTaskInstanceLogResponse GetTaskInstanceLog(GetTaskInstanceLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTaskInstanceLog", GetTaskInstanceLogResponse.class);
    }

    /**
     *拉取任务版本列表
     * @param req GetTaskVersionRequest
     * @return GetTaskVersionResponse
     * @throws TencentCloudSDKException
     */
    public GetTaskVersionResponse GetTaskVersion(GetTaskVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTaskVersion", GetTaskVersionResponse.class);
    }

    /**
     *获取任务详情接口
     * @param req GetTriggerTaskRequest
     * @return GetTriggerTaskResponse
     * @throws TencentCloudSDKException
     */
    public GetTriggerTaskResponse GetTriggerTask(GetTriggerTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTriggerTask", GetTriggerTaskResponse.class);
    }

    /**
     *获取工作流调度任务代码
     * @param req GetTriggerTaskCodeRequest
     * @return GetTriggerTaskCodeResponse
     * @throws TencentCloudSDKException
     */
    public GetTriggerTaskCodeResponse GetTriggerTaskCode(GetTriggerTaskCodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTriggerTaskCode", GetTriggerTaskCodeResponse.class);
    }

    /**
     *查询任务执行详情
     * @param req GetTriggerTaskRunRequest
     * @return GetTriggerTaskRunResponse
     * @throws TencentCloudSDKException
     */
    public GetTriggerTaskRunResponse GetTriggerTaskRun(GetTriggerTaskRunRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTriggerTaskRun", GetTriggerTaskRunResponse.class);
    }

    /**
     *拉取任务版本列表
     * @param req GetTriggerTaskVersionRequest
     * @return GetTriggerTaskVersionResponse
     * @throws TencentCloudSDKException
     */
    public GetTriggerTaskVersionResponse GetTriggerTaskVersion(GetTriggerTaskVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTriggerTaskVersion", GetTriggerTaskVersionResponse.class);
    }

    /**
     *获取工作流信息
     * @param req GetTriggerWorkflowRequest
     * @return GetTriggerWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public GetTriggerWorkflowResponse GetTriggerWorkflow(GetTriggerWorkflowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTriggerWorkflow", GetTriggerWorkflowResponse.class);
    }

    /**
     *查询工作流任务详情
     * @param req GetTriggerWorkflowRunRequest
     * @return GetTriggerWorkflowRunResponse
     * @throws TencentCloudSDKException
     */
    public GetTriggerWorkflowRunResponse GetTriggerWorkflowRun(GetTriggerWorkflowRunRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTriggerWorkflowRun", GetTriggerWorkflowRunResponse.class);
    }

    /**
     *获取工作流信息
     * @param req GetWorkflowRequest
     * @return GetWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public GetWorkflowResponse GetWorkflow(GetWorkflowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetWorkflow", GetWorkflowResponse.class);
    }

    /**
     *查询文件夹详情
     * @param req GetWorkflowFolderRequest
     * @return GetWorkflowFolderResponse
     * @throws TencentCloudSDKException
     */
    public GetWorkflowFolderResponse GetWorkflowFolder(GetWorkflowFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetWorkflowFolder", GetWorkflowFolderResponse.class);
    }

    /**
     *修改项目用户角色
     * @param req GrantMemberProjectRoleRequest
     * @return GrantMemberProjectRoleResponse
     * @throws TencentCloudSDKException
     */
    public GrantMemberProjectRoleResponse GrantMemberProjectRole(GrantMemberProjectRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GrantMemberProjectRole", GrantMemberProjectRoleResponse.class);
    }

    /**
     *实例批量终止操作-异步操作
     * @param req KillTaskInstancesAsyncRequest
     * @return KillTaskInstancesAsyncResponse
     * @throws TencentCloudSDKException
     */
    public KillTaskInstancesAsyncResponse KillTaskInstancesAsync(KillTaskInstancesAsyncRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "KillTaskInstancesAsync", KillTaskInstancesAsyncResponse.class);
    }

    /**
     *终止运行
     * @param req KillTriggerWorkflowRunsRequest
     * @return KillTriggerWorkflowRunsResponse
     * @throws TencentCloudSDKException
     */
    public KillTriggerWorkflowRunsResponse KillTriggerWorkflowRuns(KillTriggerWorkflowRunsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "KillTriggerWorkflowRuns", KillTriggerWorkflowRunsResponse.class);
    }

    /**
     *获取告警信息列表
     * @param req ListAlarmMessagesRequest
     * @return ListAlarmMessagesResponse
     * @throws TencentCloudSDKException
     */
    public ListAlarmMessagesResponse ListAlarmMessages(ListAlarmMessagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAlarmMessages", ListAlarmMessagesResponse.class);
    }

    /**
     *获取资产目录信息
     * @param req ListCatalogRequest
     * @return ListCatalogResponse
     * @throws TencentCloudSDKException
     */
    public ListCatalogResponse ListCatalog(ListCatalogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListCatalog", ListCatalogResponse.class);
    }

    /**
     *获取文件夹内容
     * @param req ListCodeFolderContentsRequest
     * @return ListCodeFolderContentsResponse
     * @throws TencentCloudSDKException
     */
    public ListCodeFolderContentsResponse ListCodeFolderContents(ListCodeFolderContentsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListCodeFolderContents", ListCodeFolderContentsResponse.class);
    }

    /**
     *查看CodeStudio实体权限
     * @param req ListCodePermissionsRequest
     * @return ListCodePermissionsResponse
     * @throws TencentCloudSDKException
     */
    public ListCodePermissionsResponse ListCodePermissions(ListCodePermissionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListCodePermissions", ListCodePermissionsResponse.class);
    }

    /**
     *获取表字段血缘信息
     * @param req ListColumnLineageRequest
     * @return ListColumnLineageResponse
     * @throws TencentCloudSDKException
     */
    public ListColumnLineageResponse ListColumnLineage(ListColumnLineageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListColumnLineage", ListColumnLineageResponse.class);
    }

    /**
     *获取单次补录的所有实例详情
     * @param req ListDataBackfillInstancesRequest
     * @return ListDataBackfillInstancesResponse
     * @throws TencentCloudSDKException
     */
    public ListDataBackfillInstancesResponse ListDataBackfillInstances(ListDataBackfillInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListDataBackfillInstances", ListDataBackfillInstancesResponse.class);
    }

    /**
     *该接口用于查询指定项目中的数据源列表
     * @param req ListDataSourcesRequest
     * @return ListDataSourcesResponse
     * @throws TencentCloudSDKException
     */
    public ListDataSourcesResponse ListDataSources(ListDataSourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListDataSources", ListDataSourcesResponse.class);
    }

    /**
     *获取资产数据库信息
     * @param req ListDatabaseRequest
     * @return ListDatabaseResponse
     * @throws TencentCloudSDKException
     */
    public ListDatabaseResponse ListDatabase(ListDatabaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListDatabase", ListDatabaseResponse.class);
    }

    /**
     *获取任务直接下游详情
     * @param req ListDownstreamOpsTasksRequest
     * @return ListDownstreamOpsTasksResponse
     * @throws TencentCloudSDKException
     */
    public ListDownstreamOpsTasksResponse ListDownstreamOpsTasks(ListDownstreamOpsTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListDownstreamOpsTasks", ListDownstreamOpsTasksResponse.class);
    }

    /**
     *获取实例直接上游
     * @param req ListDownstreamTaskInstancesRequest
     * @return ListDownstreamTaskInstancesResponse
     * @throws TencentCloudSDKException
     */
    public ListDownstreamTaskInstancesResponse ListDownstreamTaskInstances(ListDownstreamTaskInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListDownstreamTaskInstances", ListDownstreamTaskInstancesResponse.class);
    }

    /**
     *获取任务直接下游详情
     * @param req ListDownstreamTasksRequest
     * @return ListDownstreamTasksResponse
     * @throws TencentCloudSDKException
     */
    public ListDownstreamTasksResponse ListDownstreamTasks(ListDownstreamTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListDownstreamTasks", ListDownstreamTasksResponse.class);
    }

    /**
     *获取任务直接下游详情
     * @param req ListDownstreamTriggerTasksRequest
     * @return ListDownstreamTriggerTasksResponse
     * @throws TencentCloudSDKException
     */
    public ListDownstreamTriggerTasksResponse ListDownstreamTriggerTasks(ListDownstreamTriggerTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListDownstreamTriggerTasks", ListDownstreamTriggerTasksResponse.class);
    }

    /**
     *获取资产血缘信息
     * @param req ListLineageRequest
     * @return ListLineageResponse
     * @throws TencentCloudSDKException
     */
    public ListLineageResponse ListLineage(ListLineageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListLineage", ListLineageResponse.class);
    }

    /**
     *查询告警规则列表
     * @param req ListOpsAlarmRulesRequest
     * @return ListOpsAlarmRulesResponse
     * @throws TencentCloudSDKException
     */
    public ListOpsAlarmRulesResponse ListOpsAlarmRules(ListOpsAlarmRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListOpsAlarmRules", ListOpsAlarmRulesResponse.class);
    }

    /**
     *根据项目id获取任务列表
     * @param req ListOpsTasksRequest
     * @return ListOpsTasksResponse
     * @throws TencentCloudSDKException
     */
    public ListOpsTasksResponse ListOpsTasks(ListOpsTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListOpsTasks", ListOpsTasksResponse.class);
    }

    /**
     *查询工作流列表
     * @param req ListOpsTriggerWorkflowsRequest
     * @return ListOpsTriggerWorkflowsResponse
     * @throws TencentCloudSDKException
     */
    public ListOpsTriggerWorkflowsResponse ListOpsTriggerWorkflows(ListOpsTriggerWorkflowsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListOpsTriggerWorkflows", ListOpsTriggerWorkflowsResponse.class);
    }

    /**
     *根据项目ID获取项目下工作流
     * @param req ListOpsWorkflowsRequest
     * @return ListOpsWorkflowsResponse
     * @throws TencentCloudSDKException
     */
    public ListOpsWorkflowsResponse ListOpsWorkflows(ListOpsWorkflowsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListOpsWorkflows", ListOpsWorkflowsResponse.class);
    }

    /**
     *获取资产血缘信息
     * @param req ListProcessLineageRequest
     * @return ListProcessLineageResponse
     * @throws TencentCloudSDKException
     */
    public ListProcessLineageResponse ListProcessLineage(ListProcessLineageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListProcessLineage", ListProcessLineageResponse.class);
    }

    /**
     *获取项目下的用户，分页返回
     * @param req ListProjectMembersRequest
     * @return ListProjectMembersResponse
     * @throws TencentCloudSDKException
     */
    public ListProjectMembersResponse ListProjectMembers(ListProjectMembersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListProjectMembers", ListProjectMembersResponse.class);
    }

    /**
     *获取角色列表信息
     * @param req ListProjectRolesRequest
     * @return ListProjectRolesResponse
     * @throws TencentCloudSDKException
     */
    public ListProjectRolesResponse ListProjectRoles(ListProjectRolesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListProjectRoles", ListProjectRolesResponse.class);
    }

    /**
     *租户全局范围的项目列表，与用户查看范围无关.
     * @param req ListProjectsRequest
     * @return ListProjectsResponse
     * @throws TencentCloudSDKException
     */
    public ListProjectsResponse ListProjects(ListProjectsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListProjects", ListProjectsResponse.class);
    }

    /**
     *规则组执行结果分页查询接口
     * @param req ListQualityRuleGroupExecResultsByPageRequest
     * @return ListQualityRuleGroupExecResultsByPageResponse
     * @throws TencentCloudSDKException
     */
    public ListQualityRuleGroupExecResultsByPageResponse ListQualityRuleGroupExecResultsByPage(ListQualityRuleGroupExecResultsByPageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListQualityRuleGroupExecResultsByPage", ListQualityRuleGroupExecResultsByPageResponse.class);
    }

    /**
     *查询监控列表
     * @param req ListQualityRuleGroupsTableRequest
     * @return ListQualityRuleGroupsTableResponse
     * @throws TencentCloudSDKException
     */
    public ListQualityRuleGroupsTableResponse ListQualityRuleGroupsTable(ListQualityRuleGroupsTableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListQualityRuleGroupsTable", ListQualityRuleGroupsTableResponse.class);
    }

    /**
     *【过滤条件】 {模板名称Name，查询使用Keyword进行模糊匹配} {模板类型type，1.系统模板 2.自定义模板} {质量检测维度QualityDims, 1.准确性 2.唯一性 3.完整性 4.一致性 5.及时性 6.有效性} 【排序字段】 { 引用数排序类型CitationOrderType，根据引用数量排序 ASC DESC}
     * @param req ListQualityRuleTemplatesRequest
     * @return ListQualityRuleTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public ListQualityRuleTemplatesResponse ListQualityRuleTemplates(ListQualityRuleTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListQualityRuleTemplates", ListQualityRuleTemplatesResponse.class);
    }

    /**
     *分页查询质量规则
     * @param req ListQualityRulesRequest
     * @return ListQualityRulesResponse
     * @throws TencentCloudSDKException
     */
    public ListQualityRulesResponse ListQualityRules(ListQualityRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListQualityRules", ListQualityRulesResponse.class);
    }

    /**
     *获取资源文件列表
     * @param req ListResourceFilesRequest
     * @return ListResourceFilesResponse
     * @throws TencentCloudSDKException
     */
    public ListResourceFilesResponse ListResourceFiles(ListResourceFilesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListResourceFiles", ListResourceFilesResponse.class);
    }

    /**
     *查询资源文件文件夹列表
     * @param req ListResourceFoldersRequest
     * @return ListResourceFoldersResponse
     * @throws TencentCloudSDKException
     */
    public ListResourceFoldersResponse ListResourceFolders(ListResourceFoldersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListResourceFolders", ListResourceFoldersResponse.class);
    }

    /**
     *该接口用于查询执行资源组列表
     * @param req ListResourceGroupsRequest
     * @return ListResourceGroupsResponse
     * @throws TencentCloudSDKException
     */
    public ListResourceGroupsResponse ListResourceGroups(ListResourceGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListResourceGroups", ListResourceGroupsResponse.class);
    }

    /**
     *查询数据探索文件夹树，包括文件夹下的脚本
     * @param req ListSQLFolderContentsRequest
     * @return ListSQLFolderContentsResponse
     * @throws TencentCloudSDKException
     */
    public ListSQLFolderContentsResponse ListSQLFolderContents(ListSQLFolderContentsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListSQLFolderContents", ListSQLFolderContentsResponse.class);
    }

    /**
     *查询SQL运行记录
     * @param req ListSQLScriptRunsRequest
     * @return ListSQLScriptRunsResponse
     * @throws TencentCloudSDKException
     */
    public ListSQLScriptRunsResponse ListSQLScriptRuns(ListSQLScriptRunsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListSQLScriptRuns", ListSQLScriptRunsResponse.class);
    }

    /**
     *获取资产数据库Schema信息
     * @param req ListSchemaRequest
     * @return ListSchemaResponse
     * @throws TencentCloudSDKException
     */
    public ListSchemaResponse ListSchema(ListSchemaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListSchema", ListSchemaResponse.class);
    }

    /**
     *获取资产表信息
     * @param req ListTableRequest
     * @return ListTableResponse
     * @throws TencentCloudSDKException
     */
    public ListTableResponse ListTable(ListTableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListTable", ListTableResponse.class);
    }

    /**
     *查询任务文件夹列表
     * @param req ListTaskFoldersRequest
     * @return ListTaskFoldersResponse
     * @throws TencentCloudSDKException
     */
    public ListTaskFoldersResponse ListTaskFolders(ListTaskFoldersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListTaskFolders", ListTaskFoldersResponse.class);
    }

    /**
     *调度实例详情
     * @param req ListTaskInstanceExecutionsRequest
     * @return ListTaskInstanceExecutionsResponse
     * @throws TencentCloudSDKException
     */
    public ListTaskInstanceExecutionsResponse ListTaskInstanceExecutions(ListTaskInstanceExecutionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListTaskInstanceExecutions", ListTaskInstanceExecutionsResponse.class);
    }

    /**
     *获取实例列表
     * @param req ListTaskInstancesRequest
     * @return ListTaskInstancesResponse
     * @throws TencentCloudSDKException
     */
    public ListTaskInstancesResponse ListTaskInstances(ListTaskInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListTaskInstances", ListTaskInstancesResponse.class);
    }

    /**
     *任务保存版本列表
     * @param req ListTaskVersionsRequest
     * @return ListTaskVersionsResponse
     * @throws TencentCloudSDKException
     */
    public ListTaskVersionsResponse ListTaskVersions(ListTaskVersionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListTaskVersions", ListTaskVersionsResponse.class);
    }

    /**
     *查询任务分页信息
     * @param req ListTasksRequest
     * @return ListTasksResponse
     * @throws TencentCloudSDKException
     */
    public ListTasksResponse ListTasks(ListTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListTasks", ListTasksResponse.class);
    }

    /**
     *获取所有主账号角色列表
     * @param req ListTenantRolesRequest
     * @return ListTenantRolesResponse
     * @throws TencentCloudSDKException
     */
    public ListTenantRolesResponse ListTenantRoles(ListTenantRolesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListTenantRoles", ListTenantRolesResponse.class);
    }

    /**
     *任务保存版本列表
     * @param req ListTriggerTaskVersionsRequest
     * @return ListTriggerTaskVersionsResponse
     * @throws TencentCloudSDKException
     */
    public ListTriggerTaskVersionsResponse ListTriggerTaskVersions(ListTriggerTaskVersionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListTriggerTaskVersions", ListTriggerTaskVersionsResponse.class);
    }

    /**
     *查询任务分页信息
     * @param req ListTriggerTasksRequest
     * @return ListTriggerTasksResponse
     * @throws TencentCloudSDKException
     */
    public ListTriggerTasksResponse ListTriggerTasks(ListTriggerTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListTriggerTasks", ListTriggerTasksResponse.class);
    }

    /**
     *查询工作流运行
     * @param req ListTriggerWorkflowRunsRequest
     * @return ListTriggerWorkflowRunsResponse
     * @throws TencentCloudSDKException
     */
    public ListTriggerWorkflowRunsResponse ListTriggerWorkflowRuns(ListTriggerWorkflowRunsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListTriggerWorkflowRuns", ListTriggerWorkflowRunsResponse.class);
    }

    /**
     *查询工作流列表
     * @param req ListTriggerWorkflowsRequest
     * @return ListTriggerWorkflowsResponse
     * @throws TencentCloudSDKException
     */
    public ListTriggerWorkflowsResponse ListTriggerWorkflows(ListTriggerWorkflowsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListTriggerWorkflows", ListTriggerWorkflowsResponse.class);
    }

    /**
     *获取任务直接上游
     * @param req ListUpstreamOpsTasksRequest
     * @return ListUpstreamOpsTasksResponse
     * @throws TencentCloudSDKException
     */
    public ListUpstreamOpsTasksResponse ListUpstreamOpsTasks(ListUpstreamOpsTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListUpstreamOpsTasks", ListUpstreamOpsTasksResponse.class);
    }

    /**
     *获取实例直接上游
     * @param req ListUpstreamTaskInstancesRequest
     * @return ListUpstreamTaskInstancesResponse
     * @throws TencentCloudSDKException
     */
    public ListUpstreamTaskInstancesResponse ListUpstreamTaskInstances(ListUpstreamTaskInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListUpstreamTaskInstances", ListUpstreamTaskInstancesResponse.class);
    }

    /**
     *获取任务直接上游
     * @param req ListUpstreamTasksRequest
     * @return ListUpstreamTasksResponse
     * @throws TencentCloudSDKException
     */
    public ListUpstreamTasksResponse ListUpstreamTasks(ListUpstreamTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListUpstreamTasks", ListUpstreamTasksResponse.class);
    }

    /**
     *获取任务直接上游
     * @param req ListUpstreamTriggerTasksRequest
     * @return ListUpstreamTriggerTasksResponse
     * @throws TencentCloudSDKException
     */
    public ListUpstreamTriggerTasksResponse ListUpstreamTriggerTasks(ListUpstreamTriggerTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListUpstreamTriggerTasks", ListUpstreamTriggerTasksResponse.class);
    }

    /**
     *查询文件夹列表
     * @param req ListWorkflowFoldersRequest
     * @return ListWorkflowFoldersResponse
     * @throws TencentCloudSDKException
     */
    public ListWorkflowFoldersResponse ListWorkflowFolders(ListWorkflowFoldersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListWorkflowFolders", ListWorkflowFoldersResponse.class);
    }

    /**
     *查询工作流授权权限
     * @param req ListWorkflowPermissionsRequest
     * @return ListWorkflowPermissionsResponse
     * @throws TencentCloudSDKException
     */
    public ListWorkflowPermissionsResponse ListWorkflowPermissions(ListWorkflowPermissionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListWorkflowPermissions", ListWorkflowPermissionsResponse.class);
    }

    /**
     *查询工作流列表
     * @param req ListWorkflowsRequest
     * @return ListWorkflowsResponse
     * @throws TencentCloudSDKException
     */
    public ListWorkflowsResponse ListWorkflows(ListWorkflowsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListWorkflows", ListWorkflowsResponse.class);
    }

    /**
     *更新质量规则接口
     * @param req ModifyQualityRuleRequest
     * @return ModifyQualityRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyQualityRuleResponse ModifyQualityRule(ModifyQualityRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyQualityRule", ModifyQualityRuleResponse.class);
    }

    /**
     *创建监控任务
     * @param req ModifyQualityRuleGroupRequest
     * @return ModifyQualityRuleGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyQualityRuleGroupResponse ModifyQualityRuleGroup(ModifyQualityRuleGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyQualityRuleGroup", ModifyQualityRuleGroupResponse.class);
    }

    /**
     *异步批量暂停任务
     * @param req PauseOpsTasksAsyncRequest
     * @return PauseOpsTasksAsyncResponse
     * @throws TencentCloudSDKException
     */
    public PauseOpsTasksAsyncResponse PauseOpsTasksAsync(PauseOpsTasksAsyncRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PauseOpsTasksAsync", PauseOpsTasksAsyncResponse.class);
    }

    /**
     *RegisterLineage
     * @param req RegisterLineageRequest
     * @return RegisterLineageResponse
     * @throws TencentCloudSDKException
     */
    public RegisterLineageResponse RegisterLineage(RegisterLineageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RegisterLineage", RegisterLineageResponse.class);
    }

    /**
     *删除项目用户角色
     * @param req RemoveMemberProjectRoleRequest
     * @return RemoveMemberProjectRoleResponse
     * @throws TencentCloudSDKException
     */
    public RemoveMemberProjectRoleResponse RemoveMemberProjectRole(RemoveMemberProjectRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveMemberProjectRole", RemoveMemberProjectRoleResponse.class);
    }

    /**
     *实例批量重跑-异步
     * @param req RerunTaskInstancesAsyncRequest
     * @return RerunTaskInstancesAsyncResponse
     * @throws TencentCloudSDKException
     */
    public RerunTaskInstancesAsyncResponse RerunTaskInstancesAsync(RerunTaskInstancesAsyncRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RerunTaskInstancesAsync", RerunTaskInstancesAsyncResponse.class);
    }

    /**
     *重跑运行
     * @param req RerunTriggerWorkflowRunAsyncRequest
     * @return RerunTriggerWorkflowRunAsyncResponse
     * @throws TencentCloudSDKException
     */
    public RerunTriggerWorkflowRunAsyncResponse RerunTriggerWorkflowRunAsync(RerunTriggerWorkflowRunAsyncRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RerunTriggerWorkflowRunAsync", RerunTriggerWorkflowRunAsyncResponse.class);
    }

    /**
     *回收数据源权限
     * @param req RevokeDataSourceAuthorizationRequest
     * @return RevokeDataSourceAuthorizationResponse
     * @throws TencentCloudSDKException
     */
    public RevokeDataSourceAuthorizationResponse RevokeDataSourceAuthorization(RevokeDataSourceAuthorizationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RevokeDataSourceAuthorization", RevokeDataSourceAuthorizationResponse.class);
    }

    /**
     *运行SQL脚本
     * @param req RunSQLScriptRequest
     * @return RunSQLScriptResponse
     * @throws TencentCloudSDKException
     */
    public RunSQLScriptResponse RunSQLScript(RunSQLScriptRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RunSQLScript", RunSQLScriptResponse.class);
    }

    /**
     *实例批量置成功-异步
     * @param req SetSuccessTaskInstancesAsyncRequest
     * @return SetSuccessTaskInstancesAsyncResponse
     * @throws TencentCloudSDKException
     */
    public SetSuccessTaskInstancesAsyncResponse SetSuccessTaskInstancesAsync(SetSuccessTaskInstancesAsyncRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetSuccessTaskInstancesAsync", SetSuccessTaskInstancesAsyncResponse.class);
    }

    /**
     *异步批量启动任务
     * @param req StartOpsTasksRequest
     * @return StartOpsTasksResponse
     * @throws TencentCloudSDKException
     */
    public StartOpsTasksResponse StartOpsTasks(StartOpsTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartOpsTasks", StartOpsTasksResponse.class);
    }

    /**
     *异步批量下线任务
     * @param req StopOpsTasksAsyncRequest
     * @return StopOpsTasksAsyncResponse
     * @throws TencentCloudSDKException
     */
    public StopOpsTasksAsyncResponse StopOpsTasksAsync(StopOpsTasksAsyncRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopOpsTasksAsync", StopOpsTasksAsyncResponse.class);
    }

    /**
     *停止运行SQL脚本
     * @param req StopSQLScriptRunRequest
     * @return StopSQLScriptRunResponse
     * @throws TencentCloudSDKException
     */
    public StopSQLScriptRunResponse StopSQLScriptRun(StopSQLScriptRunRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopSQLScriptRun", StopSQLScriptRunResponse.class);
    }

    /**
     *提交任务。
     * @param req SubmitTaskRequest
     * @return SubmitTaskResponse
     * @throws TencentCloudSDKException
     */
    public SubmitTaskResponse SubmitTask(SubmitTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitTask", SubmitTaskResponse.class);
    }

    /**
     *提交工作流调度任务
     * @param req SubmitTriggerTaskRequest
     * @return SubmitTriggerTaskResponse
     * @throws TencentCloudSDKException
     */
    public SubmitTriggerTaskResponse SubmitTriggerTask(SubmitTriggerTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitTriggerTask", SubmitTriggerTaskResponse.class);
    }

    /**
     *更新代码文件
     * @param req UpdateCodeFileRequest
     * @return UpdateCodeFileResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCodeFileResponse UpdateCodeFile(UpdateCodeFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateCodeFile", UpdateCodeFileResponse.class);
    }

    /**
     *重命名代码文件夹
     * @param req UpdateCodeFolderRequest
     * @return UpdateCodeFolderResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCodeFolderResponse UpdateCodeFolder(UpdateCodeFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateCodeFolder", UpdateCodeFolderResponse.class);
    }

    /**
     *该接口用于更新数据源
     * @param req UpdateDataSourceRequest
     * @return UpdateDataSourceResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDataSourceResponse UpdateDataSource(UpdateDataSourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateDataSource", UpdateDataSourceResponse.class);
    }

    /**
     *修改告警规则
     * @param req UpdateOpsAlarmRuleRequest
     * @return UpdateOpsAlarmRuleResponse
     * @throws TencentCloudSDKException
     */
    public UpdateOpsAlarmRuleResponse UpdateOpsAlarmRule(UpdateOpsAlarmRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateOpsAlarmRule", UpdateOpsAlarmRuleResponse.class);
    }

    /**
     *修改任务负责人
     * @param req UpdateOpsTasksOwnerRequest
     * @return UpdateOpsTasksOwnerResponse
     * @throws TencentCloudSDKException
     */
    public UpdateOpsTasksOwnerResponse UpdateOpsTasksOwner(UpdateOpsTasksOwnerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateOpsTasksOwner", UpdateOpsTasksOwnerResponse.class);
    }

    /**
     *查询任务执行详情
     * @param req UpdateOpsTriggerTasksOwnerRequest
     * @return UpdateOpsTriggerTasksOwnerResponse
     * @throws TencentCloudSDKException
     */
    public UpdateOpsTriggerTasksOwnerResponse UpdateOpsTriggerTasksOwner(UpdateOpsTriggerTasksOwnerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateOpsTriggerTasksOwner", UpdateOpsTriggerTasksOwnerResponse.class);
    }

    /**
     *修改项目基础信息。
     * @param req UpdateProjectRequest
     * @return UpdateProjectResponse
     * @throws TencentCloudSDKException
     */
    public UpdateProjectResponse UpdateProject(UpdateProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateProject", UpdateProjectResponse.class);
    }

    /**
     *更新资源文件
     * @param req UpdateResourceFileRequest
     * @return UpdateResourceFileResponse
     * @throws TencentCloudSDKException
     */
    public UpdateResourceFileResponse UpdateResourceFile(UpdateResourceFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateResourceFile", UpdateResourceFileResponse.class);
    }

    /**
     *更新资源文件夹
     * @param req UpdateResourceFolderRequest
     * @return UpdateResourceFolderResponse
     * @throws TencentCloudSDKException
     */
    public UpdateResourceFolderResponse UpdateResourceFolder(UpdateResourceFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateResourceFolder", UpdateResourceFolderResponse.class);
    }

    /**
     *该接口用于变配/续费资源
     * @param req UpdateResourceGroupRequest
     * @return UpdateResourceGroupResponse
     * @throws TencentCloudSDKException
     */
    public UpdateResourceGroupResponse UpdateResourceGroup(UpdateResourceGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateResourceGroup", UpdateResourceGroupResponse.class);
    }

    /**
     *重命名SQL文件夹
     * @param req UpdateSQLFolderRequest
     * @return UpdateSQLFolderResponse
     * @throws TencentCloudSDKException
     */
    public UpdateSQLFolderResponse UpdateSQLFolder(UpdateSQLFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateSQLFolder", UpdateSQLFolderResponse.class);
    }

    /**
     *保存探索脚本内容
     * @param req UpdateSQLScriptRequest
     * @return UpdateSQLScriptResponse
     * @throws TencentCloudSDKException
     */
    public UpdateSQLScriptResponse UpdateSQLScript(UpdateSQLScriptRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateSQLScript", UpdateSQLScriptResponse.class);
    }

    /**
     *更新任务接口
     * @param req UpdateTaskRequest
     * @return UpdateTaskResponse
     * @throws TencentCloudSDKException
     */
    public UpdateTaskResponse UpdateTask(UpdateTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateTask", UpdateTaskResponse.class);
    }

    /**
     *更新任务文件夹
     * @param req UpdateTaskFolderRequest
     * @return UpdateTaskFolderResponse
     * @throws TencentCloudSDKException
     */
    public UpdateTaskFolderResponse UpdateTaskFolder(UpdateTaskFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateTaskFolder", UpdateTaskFolderResponse.class);
    }

    /**
     *更新任务接口
     * @param req UpdateTaskPartiallyRequest
     * @return UpdateTaskPartiallyResponse
     * @throws TencentCloudSDKException
     */
    public UpdateTaskPartiallyResponse UpdateTaskPartially(UpdateTaskPartiallyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateTaskPartially", UpdateTaskPartiallyResponse.class);
    }

    /**
     *更新任务接口
     * @param req UpdateTriggerTaskRequest
     * @return UpdateTriggerTaskResponse
     * @throws TencentCloudSDKException
     */
    public UpdateTriggerTaskResponse UpdateTriggerTask(UpdateTriggerTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateTriggerTask", UpdateTriggerTaskResponse.class);
    }

    /**
     *更新任务接口
     * @param req UpdateTriggerTaskPartiallyRequest
     * @return UpdateTriggerTaskPartiallyResponse
     * @throws TencentCloudSDKException
     */
    public UpdateTriggerTaskPartiallyResponse UpdateTriggerTaskPartially(UpdateTriggerTaskPartiallyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateTriggerTaskPartially", UpdateTriggerTaskPartiallyResponse.class);
    }

    /**
     *更新工作流（包括工作流基本信息与工作流参数）
     * @param req UpdateTriggerWorkflowRequest
     * @return UpdateTriggerWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public UpdateTriggerWorkflowResponse UpdateTriggerWorkflow(UpdateTriggerWorkflowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateTriggerWorkflow", UpdateTriggerWorkflowResponse.class);
    }

    /**
     *更新工作流（包括工作流基本信息与工作流参数）
     * @param req UpdateTriggerWorkflowPartiallyRequest
     * @return UpdateTriggerWorkflowPartiallyResponse
     * @throws TencentCloudSDKException
     */
    public UpdateTriggerWorkflowPartiallyResponse UpdateTriggerWorkflowPartially(UpdateTriggerWorkflowPartiallyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateTriggerWorkflowPartially", UpdateTriggerWorkflowPartiallyResponse.class);
    }

    /**
     *更新工作流（包括工作流基本信息与工作流参数）
     * @param req UpdateWorkflowRequest
     * @return UpdateWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public UpdateWorkflowResponse UpdateWorkflow(UpdateWorkflowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateWorkflow", UpdateWorkflowResponse.class);
    }

    /**
     *更新工作流文件夹
     * @param req UpdateWorkflowFolderRequest
     * @return UpdateWorkflowFolderResponse
     * @throws TencentCloudSDKException
     */
    public UpdateWorkflowFolderResponse UpdateWorkflowFolder(UpdateWorkflowFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateWorkflowFolder", UpdateWorkflowFolderResponse.class);
    }

}
