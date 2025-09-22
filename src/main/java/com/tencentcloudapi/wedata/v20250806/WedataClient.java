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
     *创建任务接口
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
     *创建资源文件文件夹
     * @param req UpdateResourceFolderRequest
     * @return UpdateResourceFolderResponse
     * @throws TencentCloudSDKException
     */
    public UpdateResourceFolderResponse UpdateResourceFolder(UpdateResourceFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateResourceFolder", UpdateResourceFolderResponse.class);
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
     *创建任务接口
     * @param req UpdateTaskRequest
     * @return UpdateTaskResponse
     * @throws TencentCloudSDKException
     */
    public UpdateTaskResponse UpdateTask(UpdateTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateTask", UpdateTaskResponse.class);
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
     *创建文件夹
     * @param req UpdateWorkflowFolderRequest
     * @return UpdateWorkflowFolderResponse
     * @throws TencentCloudSDKException
     */
    public UpdateWorkflowFolderResponse UpdateWorkflowFolder(UpdateWorkflowFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateWorkflowFolder", UpdateWorkflowFolderResponse.class);
    }

}
