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
package com.tencentcloudapi.wedata.v20210820;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.wedata.v20210820.models.*;

public class WedataClient extends AbstractClient{
    private static String endpoint = "wedata.tencentcloudapi.com";
    private static String service = "wedata";
    private static String version = "2021-08-20";
    
    public WedataClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public WedataClient(Credential credential, String region, ClientProfile profile) {
        super(WedataClient.endpoint, WedataClient.version, credential, region, profile);
    }

    /**
     *添加项目用户角色
     * @param req AddProjectUserRoleRequest
     * @return AddProjectUserRoleResponse
     * @throws TencentCloudSDKException
     */
    public AddProjectUserRoleResponse AddProjectUserRole(AddProjectUserRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddProjectUserRole", AddProjectUserRoleResponse.class);
    }

    /**
     *批量创建任务告警规则
     * @param req BatchCreateIntegrationTaskAlarmsRequest
     * @return BatchCreateIntegrationTaskAlarmsResponse
     * @throws TencentCloudSDKException
     */
    public BatchCreateIntegrationTaskAlarmsResponse BatchCreateIntegrationTaskAlarms(BatchCreateIntegrationTaskAlarmsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchCreateIntegrationTaskAlarms", BatchCreateIntegrationTaskAlarmsResponse.class);
    }

    /**
     *异步批量创建任务版本
     * @param req BatchCreateTaskVersionAsyncRequest
     * @return BatchCreateTaskVersionAsyncResponse
     * @throws TencentCloudSDKException
     */
    public BatchCreateTaskVersionAsyncResponse BatchCreateTaskVersionAsync(BatchCreateTaskVersionAsyncRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchCreateTaskVersionAsync", BatchCreateTaskVersionAsyncResponse.class);
    }

    /**
     *批量删除集成任务
     * @param req BatchDeleteIntegrationTasksRequest
     * @return BatchDeleteIntegrationTasksResponse
     * @throws TencentCloudSDKException
     */
    public BatchDeleteIntegrationTasksResponse BatchDeleteIntegrationTasks(BatchDeleteIntegrationTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchDeleteIntegrationTasks", BatchDeleteIntegrationTasksResponse.class);
    }

    /**
     *任务运维-批量删除任务
     * @param req BatchDeleteOpsTasksRequest
     * @return BatchDeleteOpsTasksResponse
     * @throws TencentCloudSDKException
     */
    public BatchDeleteOpsTasksResponse BatchDeleteOpsTasks(BatchDeleteOpsTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchDeleteOpsTasks", BatchDeleteOpsTasksResponse.class);
    }

    /**
     *批量置成功集成任务实例
     * @param req BatchForceSuccessIntegrationTaskInstancesRequest
     * @return BatchForceSuccessIntegrationTaskInstancesResponse
     * @throws TencentCloudSDKException
     */
    public BatchForceSuccessIntegrationTaskInstancesResponse BatchForceSuccessIntegrationTaskInstances(BatchForceSuccessIntegrationTaskInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchForceSuccessIntegrationTaskInstances", BatchForceSuccessIntegrationTaskInstancesResponse.class);
    }

    /**
     *批量终止集成任务实例
     * @param req BatchKillIntegrationTaskInstancesRequest
     * @return BatchKillIntegrationTaskInstancesResponse
     * @throws TencentCloudSDKException
     */
    public BatchKillIntegrationTaskInstancesResponse BatchKillIntegrationTaskInstances(BatchKillIntegrationTaskInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchKillIntegrationTaskInstances", BatchKillIntegrationTaskInstancesResponse.class);
    }

    /**
     *对集成离线任务执行批量补数据操作
     * @param req BatchMakeUpIntegrationTasksRequest
     * @return BatchMakeUpIntegrationTasksResponse
     * @throws TencentCloudSDKException
     */
    public BatchMakeUpIntegrationTasksResponse BatchMakeUpIntegrationTasks(BatchMakeUpIntegrationTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchMakeUpIntegrationTasks", BatchMakeUpIntegrationTasksResponse.class);
    }

    /**
     *批量修改任务责任人
     * @param req BatchModifyOpsOwnersRequest
     * @return BatchModifyOpsOwnersResponse
     * @throws TencentCloudSDKException
     */
    public BatchModifyOpsOwnersResponse BatchModifyOpsOwners(BatchModifyOpsOwnersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchModifyOpsOwners", BatchModifyOpsOwnersResponse.class);
    }

    /**
     *批量重跑集成任务实例
     * @param req BatchRerunIntegrationTaskInstancesRequest
     * @return BatchRerunIntegrationTaskInstancesResponse
     * @throws TencentCloudSDKException
     */
    public BatchRerunIntegrationTaskInstancesResponse BatchRerunIntegrationTaskInstances(BatchRerunIntegrationTaskInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchRerunIntegrationTaskInstances", BatchRerunIntegrationTaskInstancesResponse.class);
    }

    /**
     *批量继续执行集成实时任务
     * @param req BatchResumeIntegrationTasksRequest
     * @return BatchResumeIntegrationTasksResponse
     * @throws TencentCloudSDKException
     */
    public BatchResumeIntegrationTasksResponse BatchResumeIntegrationTasks(BatchResumeIntegrationTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchResumeIntegrationTasks", BatchResumeIntegrationTasksResponse.class);
    }

    /**
     *任务运维-任务列表 批量启动
     * @param req BatchRunOpsTaskRequest
     * @return BatchRunOpsTaskResponse
     * @throws TencentCloudSDKException
     */
    public BatchRunOpsTaskResponse BatchRunOpsTask(BatchRunOpsTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchRunOpsTask", BatchRunOpsTaskResponse.class);
    }

    /**
     *批量运行集成任务
     * @param req BatchStartIntegrationTasksRequest
     * @return BatchStartIntegrationTasksResponse
     * @throws TencentCloudSDKException
     */
    public BatchStartIntegrationTasksResponse BatchStartIntegrationTasks(BatchStartIntegrationTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchStartIntegrationTasks", BatchStartIntegrationTasksResponse.class);
    }

    /**
     *批量停止集成任务
     * @param req BatchStopIntegrationTasksRequest
     * @return BatchStopIntegrationTasksResponse
     * @throws TencentCloudSDKException
     */
    public BatchStopIntegrationTasksResponse BatchStopIntegrationTasks(BatchStopIntegrationTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchStopIntegrationTasks", BatchStopIntegrationTasksResponse.class);
    }

    /**
     *仅对任务状态为”调度中“和”已暂停“有效，对所选任务的任务实例进行终止，并停止调度
     * @param req BatchStopOpsTasksRequest
     * @return BatchStopOpsTasksResponse
     * @throws TencentCloudSDKException
     */
    public BatchStopOpsTasksResponse BatchStopOpsTasks(BatchStopOpsTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchStopOpsTasks", BatchStopOpsTasksResponse.class);
    }

    /**
     *批量停止工作流
     * @param req BatchStopWorkflowsByIdsRequest
     * @return BatchStopWorkflowsByIdsResponse
     * @throws TencentCloudSDKException
     */
    public BatchStopWorkflowsByIdsResponse BatchStopWorkflowsByIds(BatchStopWorkflowsByIdsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchStopWorkflowsByIds", BatchStopWorkflowsByIdsResponse.class);
    }

    /**
     *批量暂停集成任务
     * @param req BatchSuspendIntegrationTasksRequest
     * @return BatchSuspendIntegrationTasksResponse
     * @throws TencentCloudSDKException
     */
    public BatchSuspendIntegrationTasksResponse BatchSuspendIntegrationTasks(BatchSuspendIntegrationTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchSuspendIntegrationTasks", BatchSuspendIntegrationTasksResponse.class);
    }

    /**
     *批量更新集成任务（暂时仅支持批量更新责任人）
     * @param req BatchUpdateIntegrationTasksRequest
     * @return BatchUpdateIntegrationTasksResponse
     * @throws TencentCloudSDKException
     */
    public BatchUpdateIntegrationTasksResponse BatchUpdateIntegrationTasks(BatchUpdateIntegrationTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchUpdateIntegrationTasks", BatchUpdateIntegrationTasksResponse.class);
    }

    /**
     *判断告警规则重名
     * @param req CheckAlarmRegularNameExistRequest
     * @return CheckAlarmRegularNameExistResponse
     * @throws TencentCloudSDKException
     */
    public CheckAlarmRegularNameExistResponse CheckAlarmRegularNameExist(CheckAlarmRegularNameExistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckAlarmRegularNameExist", CheckAlarmRegularNameExistResponse.class);
    }

    /**
     *判断集成节点名称是否存在
     * @param req CheckIntegrationNodeNameExistsRequest
     * @return CheckIntegrationNodeNameExistsResponse
     * @throws TencentCloudSDKException
     */
    public CheckIntegrationNodeNameExistsResponse CheckIntegrationNodeNameExists(CheckIntegrationNodeNameExistsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckIntegrationNodeNameExists", CheckIntegrationNodeNameExistsResponse.class);
    }

    /**
     *判断集成任务名称是否存在
     * @param req CheckIntegrationTaskNameExistsRequest
     * @return CheckIntegrationTaskNameExistsResponse
     * @throws TencentCloudSDKException
     */
    public CheckIntegrationTaskNameExistsResponse CheckIntegrationTaskNameExists(CheckIntegrationTaskNameExistsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckIntegrationTaskNameExists", CheckIntegrationTaskNameExistsResponse.class);
    }

    /**
     *离线任务重名校验
     * @param req CheckTaskNameExistRequest
     * @return CheckTaskNameExistResponse
     * @throws TencentCloudSDKException
     */
    public CheckTaskNameExistResponse CheckTaskNameExist(CheckTaskNameExistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckTaskNameExist", CheckTaskNameExistResponse.class);
    }

    /**
     *提交集成任务
     * @param req CommitIntegrationTaskRequest
     * @return CommitIntegrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public CommitIntegrationTaskResponse CommitIntegrationTask(CommitIntegrationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CommitIntegrationTask", CommitIntegrationTaskResponse.class);
    }

    /**
     *提交规则组运行任务接口
     * @param req CommitRuleGroupTaskRequest
     * @return CommitRuleGroupTaskResponse
     * @throws TencentCloudSDKException
     */
    public CommitRuleGroupTaskResponse CommitRuleGroupTask(CommitRuleGroupTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CommitRuleGroupTask", CommitRuleGroupTaskResponse.class);
    }

    /**
     *统计任务实例状态
     * @param req CountOpsInstanceStateRequest
     * @return CountOpsInstanceStateResponse
     * @throws TencentCloudSDKException
     */
    public CountOpsInstanceStateResponse CountOpsInstanceState(CountOpsInstanceStateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CountOpsInstanceState", CountOpsInstanceStateResponse.class);
    }

    /**
     *创建代码模版
     * @param req CreateCodeTemplateRequest
     * @return CreateCodeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateCodeTemplateResponse CreateCodeTemplate(CreateCodeTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCodeTemplate", CreateCodeTemplateResponse.class);
    }

    /**
     *提交代码模版
     * @param req CreateCodeTemplateVersionRequest
     * @return CreateCodeTemplateVersionResponse
     * @throws TencentCloudSDKException
     */
    public CreateCodeTemplateVersionResponse CreateCodeTemplateVersion(CreateCodeTemplateVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCodeTemplateVersion", CreateCodeTemplateVersionResponse.class);
    }

    /**
     *创建用户自定义函数
     * @param req CreateCustomFunctionRequest
     * @return CreateCustomFunctionResponse
     * @throws TencentCloudSDKException
     */
    public CreateCustomFunctionResponse CreateCustomFunction(CreateCustomFunctionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCustomFunction", CreateCustomFunctionResponse.class);
    }

    /**
     *创建数据建模，提供给云应用使用，实现“Wedata数据建模”的下单发货
     * @param req CreateDataModelRequest
     * @return CreateDataModelResponse
     * @throws TencentCloudSDKException
     */
    public CreateDataModelResponse CreateDataModel(CreateDataModelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDataModel", CreateDataModelResponse.class);
    }

    /**
     *创建数据源
     * @param req CreateDataSourceRequest
     * @return CreateDataSourceResponse
     * @throws TencentCloudSDKException
     */
    public CreateDataSourceResponse CreateDataSource(CreateDataSourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDataSource", CreateDataSourceResponse.class);
    }

    /**
     *编排空间-创建文件夹
     * @param req CreateDsFolderRequest
     * @return CreateDsFolderResponse
     * @throws TencentCloudSDKException
     */
    public CreateDsFolderResponse CreateDsFolder(CreateDsFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDsFolder", CreateDsFolderResponse.class);
    }

    /**
     *建hive表
     * @param req CreateHiveTableRequest
     * @return CreateHiveTableResponse
     * @throws TencentCloudSDKException
     */
    public CreateHiveTableResponse CreateHiveTable(CreateHiveTableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateHiveTable", CreateHiveTableResponse.class);
    }

    /**
     *创建hive表，返回表名称
     * @param req CreateHiveTableByDDLRequest
     * @return CreateHiveTableByDDLResponse
     * @throws TencentCloudSDKException
     */
    public CreateHiveTableByDDLResponse CreateHiveTableByDDL(CreateHiveTableByDDLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateHiveTableByDDL", CreateHiveTableByDDLResponse.class);
    }

    /**
     *创建集成节点
     * @param req CreateIntegrationNodeRequest
     * @return CreateIntegrationNodeResponse
     * @throws TencentCloudSDKException
     */
    public CreateIntegrationNodeResponse CreateIntegrationNode(CreateIntegrationNodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateIntegrationNode", CreateIntegrationNodeResponse.class);
    }

    /**
     *创建集成任务
     * @param req CreateIntegrationTaskRequest
     * @return CreateIntegrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateIntegrationTaskResponse CreateIntegrationTask(CreateIntegrationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateIntegrationTask", CreateIntegrationTaskResponse.class);
    }

    /**
     *创建离线任务
     * @param req CreateOfflineTaskRequest
     * @return CreateOfflineTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateOfflineTaskResponse CreateOfflineTask(CreateOfflineTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateOfflineTask", CreateOfflineTaskResponse.class);
    }

    /**
     *批量补数据（创建补录任务）
     * @param req CreateOpsMakePlanRequest
     * @return CreateOpsMakePlanResponse
     * @throws TencentCloudSDKException
     */
    public CreateOpsMakePlanResponse CreateOpsMakePlan(CreateOpsMakePlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateOpsMakePlan", CreateOpsMakePlanResponse.class);
    }

    /**
     *创建质量规则接口
     * @param req CreateRuleRequest
     * @return CreateRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateRuleResponse CreateRule(CreateRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRule", CreateRuleResponse.class);
    }

    /**
     *创建规则模板
     * @param req CreateRuleTemplateRequest
     * @return CreateRuleTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateRuleTemplateResponse CreateRuleTemplate(CreateRuleTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRuleTemplate", CreateRuleTemplateResponse.class);
    }

    /**
     *创建任务。本接口已废弃，请使用接口CreateTaskNew。
     * @param req CreateTaskRequest
     * @return CreateTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateTaskResponse CreateTask(CreateTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTask", CreateTaskResponse.class);
    }

    /**
     *创建任务告警规则
     * @param req CreateTaskAlarmRegularRequest
     * @return CreateTaskAlarmRegularResponse
     * @throws TencentCloudSDKException
     */
    public CreateTaskAlarmRegularResponse CreateTaskAlarmRegular(CreateTaskAlarmRegularRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTaskAlarmRegular", CreateTaskAlarmRegularResponse.class);
    }

    /**
     *编排空间-工作流-创建任务文件夹
     * @param req CreateTaskFolderRequest
     * @return CreateTaskFolderResponse
     * @throws TencentCloudSDKException
     */
    public CreateTaskFolderResponse CreateTaskFolder(CreateTaskFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTaskFolder", CreateTaskFolderResponse.class);
    }

    /**
     *聚合创建任务
     * @param req CreateTaskNewRequest
     * @return CreateTaskNewResponse
     * @throws TencentCloudSDKException
     */
    public CreateTaskNewResponse CreateTaskNew(CreateTaskNewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTaskNew", CreateTaskNewResponse.class);
    }

    /**
     *提交任务版本
     * @param req CreateTaskVersionDsRequest
     * @return CreateTaskVersionDsResponse
     * @throws TencentCloudSDKException
     */
    public CreateTaskVersionDsResponse CreateTaskVersionDs(CreateTaskVersionDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTaskVersionDs", CreateTaskVersionDsResponse.class);
    }

    /**
     *创建工作流
     * @param req CreateWorkflowDsRequest
     * @return CreateWorkflowDsResponse
     * @throws TencentCloudSDKException
     */
    public CreateWorkflowDsResponse CreateWorkflowDs(CreateWorkflowDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWorkflowDs", CreateWorkflowDsResponse.class);
    }

    /**
     *拉取dag实例
     * @param req DagInstancesRequest
     * @return DagInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DagInstancesResponse DagInstances(DagInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DagInstances", DagInstancesResponse.class);
    }

    /**
     *删除代码模版
     * @param req DeleteCodeTemplateRequest
     * @return DeleteCodeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCodeTemplateResponse DeleteCodeTemplate(DeleteCodeTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCodeTemplate", DeleteCodeTemplateResponse.class);
    }

    /**
     *删除用户自定义函数
     * @param req DeleteCustomFunctionRequest
     * @return DeleteCustomFunctionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCustomFunctionResponse DeleteCustomFunction(DeleteCustomFunctionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCustomFunction", DeleteCustomFunctionResponse.class);
    }

    /**
     *销毁数据建模，提供给云应用使用，实现“Wedata数据建模”的销毁
     * @param req DeleteDataModelRequest
     * @return DeleteDataModelResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDataModelResponse DeleteDataModel(DeleteDataModelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDataModel", DeleteDataModelResponse.class);
    }

    /**
     *删除数据源
     * @param req DeleteDataSourcesRequest
     * @return DeleteDataSourcesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDataSourcesResponse DeleteDataSources(DeleteDataSourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDataSources", DeleteDataSourcesResponse.class);
    }

    /**
     *编排空间-删除文件夹
     * @param req DeleteDsFolderRequest
     * @return DeleteDsFolderResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDsFolderResponse DeleteDsFolder(DeleteDsFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDsFolder", DeleteDsFolderResponse.class);
    }

    /**
     *删除文件
     * @param req DeleteFileRequest
     * @return DeleteFileResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFileResponse DeleteFile(DeleteFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteFile", DeleteFileResponse.class);
    }

    /**
     *开发空间-批量删除目录和文件
     * @param req DeleteFilePathRequest
     * @return DeleteFilePathResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFilePathResponse DeleteFilePath(DeleteFilePathRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteFilePath", DeleteFilePathResponse.class);
    }

    /**
     *删除集成节点
     * @param req DeleteIntegrationNodeRequest
     * @return DeleteIntegrationNodeResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIntegrationNodeResponse DeleteIntegrationNode(DeleteIntegrationNodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteIntegrationNode", DeleteIntegrationNodeResponse.class);
    }

    /**
     *删除集成任务
     * @param req DeleteIntegrationTaskRequest
     * @return DeleteIntegrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIntegrationTaskResponse DeleteIntegrationTask(DeleteIntegrationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteIntegrationTask", DeleteIntegrationTaskResponse.class);
    }

    /**
     *删除任务
     * @param req DeleteOfflineTaskRequest
     * @return DeleteOfflineTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOfflineTaskResponse DeleteOfflineTask(DeleteOfflineTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteOfflineTask", DeleteOfflineTaskResponse.class);
    }

    /**
     *删除项目参数
     * @param req DeleteProjectParamDsRequest
     * @return DeleteProjectParamDsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProjectParamDsResponse DeleteProjectParamDs(DeleteProjectParamDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteProjectParamDs", DeleteProjectParamDsResponse.class);
    }

    /**
     *删除项目用户
     * @param req DeleteProjectUsersRequest
     * @return DeleteProjectUsersResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProjectUsersResponse DeleteProjectUsers(DeleteProjectUsersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteProjectUsers", DeleteProjectUsersResponse.class);
    }

    /**
     *资源管理删除资源
     * @param req DeleteResourceRequest
     * @return DeleteResourceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteResourceResponse DeleteResource(DeleteResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteResource", DeleteResourceResponse.class);
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
     *资源管理-批量删除资源文件
     * @param req DeleteResourceFilesRequest
     * @return DeleteResourceFilesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteResourceFilesResponse DeleteResourceFiles(DeleteResourceFilesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteResourceFiles", DeleteResourceFilesResponse.class);
    }

    /**
     *删除质量规则接口
     * @param req DeleteRuleRequest
     * @return DeleteRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRuleResponse DeleteRule(DeleteRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRule", DeleteRuleResponse.class);
    }

    /**
     *删除规则模板
     * @param req DeleteRuleTemplateRequest
     * @return DeleteRuleTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRuleTemplateResponse DeleteRuleTemplate(DeleteRuleTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRuleTemplate", DeleteRuleTemplateResponse.class);
    }

    /**
     *删除任务告警规则
     * @param req DeleteTaskAlarmRegularRequest
     * @return DeleteTaskAlarmRegularResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTaskAlarmRegularResponse DeleteTaskAlarmRegular(DeleteTaskAlarmRegularRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTaskAlarmRegular", DeleteTaskAlarmRegularResponse.class);
    }

    /**
     *删除编排空间任务
     * @param req DeleteTaskDsRequest
     * @return DeleteTaskDsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTaskDsResponse DeleteTaskDs(DeleteTaskDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTaskDs", DeleteTaskDsResponse.class);
    }

    /**
     *通过工作流Id删除工作流
     * @param req DeleteWorkflowByIdRequest
     * @return DeleteWorkflowByIdResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWorkflowByIdResponse DeleteWorkflowById(DeleteWorkflowByIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteWorkflowById", DeleteWorkflowByIdResponse.class);
    }

    /**
     *告警事件列表
     * @param req DescribeAlarmEventsRequest
     * @return DescribeAlarmEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmEventsResponse DescribeAlarmEvents(DescribeAlarmEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlarmEvents", DescribeAlarmEventsResponse.class);
    }

    /**
     *告警接收人详情
     * @param req DescribeAlarmReceiverRequest
     * @return DescribeAlarmReceiverResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmReceiverResponse DescribeAlarmReceiver(DescribeAlarmReceiverRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlarmReceiver", DescribeAlarmReceiverResponse.class);
    }

    /**
     *查询父目录下所有子文件夹+工作流
     * @param req DescribeAllByFolderNewRequest
     * @return DescribeAllByFolderNewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAllByFolderNewResponse DescribeAllByFolderNew(DescribeAllByFolderNewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAllByFolderNew", DescribeAllByFolderNewResponse.class);
    }

    /**
     *获取待审批列表
     * @param req DescribeApproveListRequest
     * @return DescribeApproveListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApproveListResponse DescribeApproveList(DescribeApproveListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApproveList", DescribeApproveListResponse.class);
    }

    /**
     *获取审批分类列表
     * @param req DescribeApproveTypeListRequest
     * @return DescribeApproveTypeListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApproveTypeListResponse DescribeApproveTypeList(DescribeApproveTypeListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApproveTypeList", DescribeApproveTypeListResponse.class);
    }

    /**
     *数据地图-信息配置 数据类目列表
     * @param req DescribeBaseBizCatalogsRequest
     * @return DescribeBaseBizCatalogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaseBizCatalogsResponse DescribeBaseBizCatalogs(DescribeBaseBizCatalogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaseBizCatalogs", DescribeBaseBizCatalogsResponse.class);
    }

    /**
     *批量操作页面获取任务列表
     * @param req DescribeBatchOperateTaskRequest
     * @return DescribeBatchOperateTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBatchOperateTaskResponse DescribeBatchOperateTask(DescribeBatchOperateTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBatchOperateTask", DescribeBatchOperateTaskResponse.class);
    }

    /**
     *查询代码模版具体详情
     * @param req DescribeCodeTemplateDetailRequest
     * @return DescribeCodeTemplateDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCodeTemplateDetailResponse DescribeCodeTemplateDetail(DescribeCodeTemplateDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCodeTemplateDetail", DescribeCodeTemplateDetailResponse.class);
    }

    /**
     *列出字段血缘信息
     * @param req DescribeColumnLineageRequest
     * @return DescribeColumnLineageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeColumnLineageResponse DescribeColumnLineage(DescribeColumnLineageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeColumnLineage", DescribeColumnLineageResponse.class);
    }

    /**
     *查询表的所有列元数据
     * @param req DescribeColumnsMetaRequest
     * @return DescribeColumnsMetaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeColumnsMetaResponse DescribeColumnsMeta(DescribeColumnsMetaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeColumnsMeta", DescribeColumnsMetaResponse.class);
    }

    /**
     *数据质量的概览页面数据监测情况接口
     * @param req DescribeDataCheckStatRequest
     * @return DescribeDataCheckStatResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataCheckStatResponse DescribeDataCheckStat(DescribeDataCheckStatRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataCheckStat", DescribeDataCheckStatResponse.class);
    }

    /**
     *查询数据服务API的发布态信息
     * @param req DescribeDataServicePublishedApiDetailRequest
     * @return DescribeDataServicePublishedApiDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataServicePublishedApiDetailResponse DescribeDataServicePublishedApiDetail(DescribeDataServicePublishedApiDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataServicePublishedApiDetail", DescribeDataServicePublishedApiDetailResponse.class);
    }

    /**
     *获取数据服务API的发布态信息列表
     * @param req DescribeDataServicePublishedApiListRequest
     * @return DescribeDataServicePublishedApiListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataServicePublishedApiListResponse DescribeDataServicePublishedApiList(DescribeDataServicePublishedApiListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataServicePublishedApiList", DescribeDataServicePublishedApiListResponse.class);
    }

    /**
     *获取数据源信息-数据源分页列表
     * @param req DescribeDataSourceInfoListRequest
     * @return DescribeDataSourceInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataSourceInfoListResponse DescribeDataSourceInfoList(DescribeDataSourceInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataSourceInfoList", DescribeDataSourceInfoListResponse.class);
    }

    /**
     *数据源详情
     * @param req DescribeDataSourceListRequest
     * @return DescribeDataSourceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataSourceListResponse DescribeDataSourceList(DescribeDataSourceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataSourceList", DescribeDataSourceListResponse.class);
    }

    /**
     *获取数据库信息
     * @param req DescribeDatabaseInfoListRequest
     * @return DescribeDatabaseInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatabaseInfoListResponse DescribeDatabaseInfoList(DescribeDatabaseInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDatabaseInfoList", DescribeDatabaseInfoListResponse.class);
    }

    /**
     *查询数据库列表
     * @param req DescribeDatabaseMetasRequest
     * @return DescribeDatabaseMetasResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatabaseMetasResponse DescribeDatabaseMetas(DescribeDatabaseMetasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDatabaseMetas", DescribeDatabaseMetasResponse.class);
    }

    /**
     *数据源详情
     * @param req DescribeDatasourceRequest
     * @return DescribeDatasourceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatasourceResponse DescribeDatasource(DescribeDatasourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDatasource", DescribeDatasourceResponse.class);
    }

    /**
     *根据层级查找上/下游任务节点
     * @param req DescribeDependOpsTasksRequest
     * @return DescribeDependOpsTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDependOpsTasksResponse DescribeDependOpsTasks(DescribeDependOpsTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDependOpsTasks", DescribeDependOpsTasksResponse.class);
    }

    /**
     *通过taskIds查询task详情列表
     * @param req DescribeDependTaskListsRequest
     * @return DescribeDependTaskListsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDependTaskListsResponse DescribeDependTaskLists(DescribeDependTaskListsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDependTaskLists", DescribeDependTaskListsResponse.class);
    }

    /**
     *质量报告-查询质量评分
     * @param req DescribeDimensionScoreRequest
     * @return DescribeDimensionScoreResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDimensionScoreResponse DescribeDimensionScore(DescribeDimensionScoreRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDimensionScore", DescribeDimensionScoreResponse.class);
    }

    /**
     *无效API，没有上线过的业务功能

分页查询试运行实例列表
     * @param req DescribeDrInstancePageRequest
     * @return DescribeDrInstancePageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDrInstancePageResponse DescribeDrInstancePage(DescribeDrInstancePageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDrInstancePage", DescribeDrInstancePageResponse.class);
    }

    /**
     *查询目录树
     * @param req DescribeDsFolderTreeRequest
     * @return DescribeDsFolderTreeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDsFolderTreeResponse DescribeDsFolderTree(DescribeDsFolderTreeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDsFolderTree", DescribeDsFolderTreeResponse.class);
    }

    /**
     *查询父目录树，用于工作流、任务定位
     * @param req DescribeDsParentFolderTreeRequest
     * @return DescribeDsParentFolderTreeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDsParentFolderTreeResponse DescribeDsParentFolderTree(DescribeDsParentFolderTreeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDsParentFolderTree", DescribeDsParentFolderTreeResponse.class);
    }

    /**
     *获取值班日历
     * @param req DescribeDutyScheduleDetailsRequest
     * @return DescribeDutyScheduleDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDutyScheduleDetailsResponse DescribeDutyScheduleDetails(DescribeDutyScheduleDetailsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDutyScheduleDetails", DescribeDutyScheduleDetailsResponse.class);
    }

    /**
     *获取值班表列表
     * @param req DescribeDutyScheduleListRequest
     * @return DescribeDutyScheduleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDutyScheduleListResponse DescribeDutyScheduleList(DescribeDutyScheduleListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDutyScheduleList", DescribeDutyScheduleListResponse.class);
    }

    /**
     *根据项目ID和事件名称查看事件详情
     * @param req DescribeEventRequest
     * @return DescribeEventResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEventResponse DescribeEvent(DescribeEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEvent", DescribeEventResponse.class);
    }

    /**
     *根据条件查找事件实例
     * @param req DescribeEventCasesRequest
     * @return DescribeEventCasesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEventCasesResponse DescribeEventCases(DescribeEventCasesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEventCases", DescribeEventCasesResponse.class);
    }

    /**
     *查看事件实例的消费任务
     * @param req DescribeEventConsumeTasksRequest
     * @return DescribeEventConsumeTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEventConsumeTasksResponse DescribeEventConsumeTasks(DescribeEventConsumeTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEventConsumeTasks", DescribeEventConsumeTasksResponse.class);
    }

    /**
     *查询规则组执行策略
     * @param req DescribeExecStrategyRequest
     * @return DescribeExecStrategyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExecStrategyResponse DescribeExecStrategy(DescribeExecStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExecStrategy", DescribeExecStrategyResponse.class);
    }

    /**
     *元数据模型-字段基础信息查询接口
     * @param req DescribeFieldBasicInfoRequest
     * @return DescribeFieldBasicInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFieldBasicInfoResponse DescribeFieldBasicInfo(DescribeFieldBasicInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFieldBasicInfo", DescribeFieldBasicInfoResponse.class);
    }

    /**
     *根据项目id 获取项目下所有工作流列表
     * @param req DescribeFolderWorkflowListRequest
     * @return DescribeFolderWorkflowListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFolderWorkflowListResponse DescribeFolderWorkflowList(DescribeFolderWorkflowListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFolderWorkflowList", DescribeFolderWorkflowListResponse.class);
    }

    /**
     *查询模版关联的任务和可填充参数，为下一步代码模版提交做准备
     * @param req DescribeFormVersionParamRequest
     * @return DescribeFormVersionParamResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFormVersionParamResponse DescribeFormVersionParam(DescribeFormVersionParamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFormVersionParam", DescribeFormVersionParamResponse.class);
    }

    /**
     *查询函数分类
     * @param req DescribeFunctionKindsRequest
     * @return DescribeFunctionKindsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFunctionKindsResponse DescribeFunctionKinds(DescribeFunctionKindsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFunctionKinds", DescribeFunctionKindsResponse.class);
    }

    /**
     *查询函数类型
     * @param req DescribeFunctionTypesRequest
     * @return DescribeFunctionTypesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFunctionTypesResponse DescribeFunctionTypes(DescribeFunctionTypesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFunctionTypes", DescribeFunctionTypesResponse.class);
    }

    /**
     *根据周期类型查询所有实例
     * @param req DescribeInstanceByCycleRequest
     * @return DescribeInstanceByCycleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceByCycleResponse DescribeInstanceByCycle(DescribeInstanceByCycleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceByCycle", DescribeInstanceByCycleResponse.class);
    }

    /**
     *实例详情页，返回某个实例所有生命周期信息
     * @param req DescribeInstanceDetailInfoRequest
     * @return DescribeInstanceDetailInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceDetailInfoResponse DescribeInstanceDetailInfo(DescribeInstanceDetailInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceDetailInfo", DescribeInstanceDetailInfoResponse.class);
    }

    /**
     *日志获取详情页面
     * @param req DescribeInstanceLastLogRequest
     * @return DescribeInstanceLastLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceLastLogResponse DescribeInstanceLastLog(DescribeInstanceLastLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceLastLog", DescribeInstanceLastLogResponse.class);
    }

    /**
     *获取实例列表
     * @param req DescribeInstanceListRequest
     * @return DescribeInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceListResponse DescribeInstanceList(DescribeInstanceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceList", DescribeInstanceListResponse.class);
    }

    /**
     *获取实例运行日志
     * @param req DescribeInstanceLogRequest
     * @return DescribeInstanceLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceLogResponse DescribeInstanceLog(DescribeInstanceLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceLog", DescribeInstanceLogResponse.class);
    }

    /**
     *获取具体实例相关日志信息
     * @param req DescribeInstanceLogDetailRequest
     * @return DescribeInstanceLogDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceLogDetailResponse DescribeInstanceLogDetail(DescribeInstanceLogDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceLogDetail", DescribeInstanceLogDetailResponse.class);
    }

    /**
     *下载日志文件，返回日志下载URL
     * @param req DescribeInstanceLogFileRequest
     * @return DescribeInstanceLogFileResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceLogFileResponse DescribeInstanceLogFile(DescribeInstanceLogFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceLogFile", DescribeInstanceLogFileResponse.class);
    }

    /**
     *离线任务实例运行日志列表
     * @param req DescribeInstanceLogListRequest
     * @return DescribeInstanceLogListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceLogListResponse DescribeInstanceLogList(DescribeInstanceLogListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceLogList", DescribeInstanceLogListResponse.class);
    }

    /**
     *查询集成节点
     * @param req DescribeIntegrationNodeRequest
     * @return DescribeIntegrationNodeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIntegrationNodeResponse DescribeIntegrationNode(DescribeIntegrationNodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIntegrationNode", DescribeIntegrationNodeResponse.class);
    }

    /**
     *数据集成大屏概览
     * @param req DescribeIntegrationStatisticsRequest
     * @return DescribeIntegrationStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIntegrationStatisticsResponse DescribeIntegrationStatistics(DescribeIntegrationStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIntegrationStatistics", DescribeIntegrationStatisticsResponse.class);
    }

    /**
     *数据集成大屏实例状态统计趋势
     * @param req DescribeIntegrationStatisticsInstanceTrendRequest
     * @return DescribeIntegrationStatisticsInstanceTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIntegrationStatisticsInstanceTrendResponse DescribeIntegrationStatisticsInstanceTrend(DescribeIntegrationStatisticsInstanceTrendRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIntegrationStatisticsInstanceTrend", DescribeIntegrationStatisticsInstanceTrendResponse.class);
    }

    /**
     *数据集成大屏同步条数统计趋势
     * @param req DescribeIntegrationStatisticsRecordsTrendRequest
     * @return DescribeIntegrationStatisticsRecordsTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIntegrationStatisticsRecordsTrendResponse DescribeIntegrationStatisticsRecordsTrend(DescribeIntegrationStatisticsRecordsTrendRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIntegrationStatisticsRecordsTrend", DescribeIntegrationStatisticsRecordsTrendResponse.class);
    }

    /**
     *数据集成大屏任务状态分布统计
     * @param req DescribeIntegrationStatisticsTaskStatusRequest
     * @return DescribeIntegrationStatisticsTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIntegrationStatisticsTaskStatusResponse DescribeIntegrationStatisticsTaskStatus(DescribeIntegrationStatisticsTaskStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIntegrationStatisticsTaskStatus", DescribeIntegrationStatisticsTaskStatusResponse.class);
    }

    /**
     *数据集成大屏任务状态统计趋势
     * @param req DescribeIntegrationStatisticsTaskStatusTrendRequest
     * @return DescribeIntegrationStatisticsTaskStatusTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIntegrationStatisticsTaskStatusTrendResponse DescribeIntegrationStatisticsTaskStatusTrend(DescribeIntegrationStatisticsTaskStatusTrendRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIntegrationStatisticsTaskStatusTrend", DescribeIntegrationStatisticsTaskStatusTrendResponse.class);
    }

    /**
     *查询集成任务
     * @param req DescribeIntegrationTaskRequest
     * @return DescribeIntegrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIntegrationTaskResponse DescribeIntegrationTask(DescribeIntegrationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIntegrationTask", DescribeIntegrationTaskResponse.class);
    }

    /**
     *查询集成任务列表
     * @param req DescribeIntegrationTasksRequest
     * @return DescribeIntegrationTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIntegrationTasksResponse DescribeIntegrationTasks(DescribeIntegrationTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIntegrationTasks", DescribeIntegrationTasksResponse.class);
    }

    /**
     *查询集成任务版本节点信息
     * @param req DescribeIntegrationVersionNodesInfoRequest
     * @return DescribeIntegrationVersionNodesInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIntegrationVersionNodesInfoResponse DescribeIntegrationVersionNodesInfo(DescribeIntegrationVersionNodesInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIntegrationVersionNodesInfo", DescribeIntegrationVersionNodesInfoResponse.class);
    }

    /**
     *获取离线任务长连接Token
     * @param req DescribeOfflineTaskTokenRequest
     * @return DescribeOfflineTaskTokenResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOfflineTaskTokenResponse DescribeOfflineTaskToken(DescribeOfflineTaskTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOfflineTaskToken", DescribeOfflineTaskTokenResponse.class);
    }

    /**
     *任务运维列表组合条件查询
     * @param req DescribeOperateOpsTasksRequest
     * @return DescribeOperateOpsTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOperateOpsTasksResponse DescribeOperateOpsTasks(DescribeOperateOpsTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOperateOpsTasks", DescribeOperateOpsTasksResponse.class);
    }

    /**
     *实例运维-获取实例日志列表
     * @param req DescribeOpsInstanceLogListRequest
     * @return DescribeOpsInstanceLogListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOpsInstanceLogListResponse DescribeOpsInstanceLogList(DescribeOpsInstanceLogListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOpsInstanceLogList", DescribeOpsInstanceLogListResponse.class);
    }

    /**
     *根据补录计划和补录任务获取补录实例列表。
     * @param req DescribeOpsMakePlanInstancesRequest
     * @return DescribeOpsMakePlanInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOpsMakePlanInstancesResponse DescribeOpsMakePlanInstances(DescribeOpsMakePlanInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOpsMakePlanInstances", DescribeOpsMakePlanInstancesResponse.class);
    }

    /**
     *查看补录计划任务
     * @param req DescribeOpsMakePlanTasksRequest
     * @return DescribeOpsMakePlanTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOpsMakePlanTasksResponse DescribeOpsMakePlanTasks(DescribeOpsMakePlanTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOpsMakePlanTasks", DescribeOpsMakePlanTasksResponse.class);
    }

    /**
     *根据条件分页查询补录计划
     * @param req DescribeOpsMakePlansRequest
     * @return DescribeOpsMakePlansResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOpsMakePlansResponse DescribeOpsMakePlans(DescribeOpsMakePlansRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOpsMakePlans", DescribeOpsMakePlansResponse.class);
    }

    /**
     *查询用户生产工作流列表
     * @param req DescribeOpsWorkflowsRequest
     * @return DescribeOpsWorkflowsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOpsWorkflowsResponse DescribeOpsWorkflows(DescribeOpsWorkflowsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOpsWorkflows", DescribeOpsWorkflowsResponse.class);
    }

    /**
     *查询全量函数
     * @param req DescribeOrganizationalFunctionsRequest
     * @return DescribeOrganizationalFunctionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationalFunctionsResponse DescribeOrganizationalFunctions(DescribeOrganizationalFunctionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOrganizationalFunctions", DescribeOrganizationalFunctionsResponse.class);
    }

    /**
     *获取待提交任务预提交校验信息（注意：工作流编号或者任务编号列表，必须填一项）
     * @param req DescribePendingSubmitTaskListRequest
     * @return DescribePendingSubmitTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePendingSubmitTaskListResponse DescribePendingSubmitTaskList(DescribePendingSubmitTaskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePendingSubmitTaskList", DescribePendingSubmitTaskListResponse.class);
    }

    /**
     *获取项目信息
     * @param req DescribeProjectRequest
     * @return DescribeProjectResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectResponse DescribeProject(DescribeProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProject", DescribeProjectResponse.class);
    }

    /**
     *获取项目下的用户，分页返回
     * @param req DescribeProjectUsersRequest
     * @return DescribeProjectUsersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectUsersResponse DescribeProjectUsers(DescribeProjectUsersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProjectUsers", DescribeProjectUsersResponse.class);
    }

    /**
     *质量报告-质量评分
     * @param req DescribeQualityScoreRequest
     * @return DescribeQualityScoreResponse
     * @throws TencentCloudSDKException
     */
    public DescribeQualityScoreResponse DescribeQualityScore(DescribeQualityScoreRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeQualityScore", DescribeQualityScoreResponse.class);
    }

    /**
     *质量报告-质量分周期趋势
     * @param req DescribeQualityScoreTrendRequest
     * @return DescribeQualityScoreTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeQualityScoreTrendResponse DescribeQualityScoreTrend(DescribeQualityScoreTrendRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeQualityScoreTrend", DescribeQualityScoreTrendResponse.class);
    }

    /**
     *查询实时任务实例节点信息
     * @param req DescribeRealTimeTaskInstanceNodeInfoRequest
     * @return DescribeRealTimeTaskInstanceNodeInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRealTimeTaskInstanceNodeInfoResponse DescribeRealTimeTaskInstanceNodeInfo(DescribeRealTimeTaskInstanceNodeInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRealTimeTaskInstanceNodeInfo", DescribeRealTimeTaskInstanceNodeInfoResponse.class);
    }

    /**
     *实时任务运行指标概览
     * @param req DescribeRealTimeTaskMetricOverviewRequest
     * @return DescribeRealTimeTaskMetricOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRealTimeTaskMetricOverviewResponse DescribeRealTimeTaskMetricOverview(DescribeRealTimeTaskMetricOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRealTimeTaskMetricOverview", DescribeRealTimeTaskMetricOverviewResponse.class);
    }

    /**
     *实时任务同步速度趋势
     * @param req DescribeRealTimeTaskSpeedRequest
     * @return DescribeRealTimeTaskSpeedResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRealTimeTaskSpeedResponse DescribeRealTimeTaskSpeed(DescribeRealTimeTaskSpeedRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRealTimeTaskSpeed", DescribeRealTimeTaskSpeedResponse.class);
    }

    /**
     *查询上报任务详情
     * @param req DescribeReportTaskDetailRequest
     * @return DescribeReportTaskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReportTaskDetailResponse DescribeReportTaskDetail(DescribeReportTaskDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReportTaskDetail", DescribeReportTaskDetailResponse.class);
    }

    /**
     *查询上报任务列表
     * @param req DescribeReportTaskListRequest
     * @return DescribeReportTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReportTaskListResponse DescribeReportTaskList(DescribeReportTaskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReportTaskList", DescribeReportTaskListResponse.class);
    }

    /**
     *获取资源管理目录树
     * @param req DescribeResourceManagePathTreesRequest
     * @return DescribeResourceManagePathTreesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceManagePathTreesResponse DescribeResourceManagePathTrees(DescribeResourceManagePathTreesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResourceManagePathTrees", DescribeResourceManagePathTreesResponse.class);
    }

    /**
     *获取角色列表信息
     * @param req DescribeRoleListRequest
     * @return DescribeRoleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRoleListResponse DescribeRoleList(DescribeRoleListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRoleList", DescribeRoleListResponse.class);
    }

    /**
     *查询规则详情
     * @param req DescribeRuleRequest
     * @return DescribeRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleResponse DescribeRule(DescribeRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRule", DescribeRuleResponse.class);
    }

    /**
     *数据质量概览页面触发维度分布统计接口
     * @param req DescribeRuleDimStatRequest
     * @return DescribeRuleDimStatResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleDimStatResponse DescribeRuleDimStat(DescribeRuleDimStatRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRuleDimStat", DescribeRuleDimStatResponse.class);
    }

    /**
     *查询规则执行结果详情
     * @param req DescribeRuleExecDetailRequest
     * @return DescribeRuleExecDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleExecDetailResponse DescribeRuleExecDetail(DescribeRuleExecDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRuleExecDetail", DescribeRuleExecDetailResponse.class);
    }

    /**
     *规则执行日志查询
     * @param req DescribeRuleExecLogRequest
     * @return DescribeRuleExecLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleExecLogResponse DescribeRuleExecLog(DescribeRuleExecLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRuleExecLog", DescribeRuleExecLogResponse.class);
    }

    /**
     *规则执行结果列表查询
     * @param req DescribeRuleExecResultsRequest
     * @return DescribeRuleExecResultsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleExecResultsResponse DescribeRuleExecResults(DescribeRuleExecResultsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRuleExecResults", DescribeRuleExecResultsResponse.class);
    }

    /**
     *数据质量概览页面规则运行情况接口
     * @param req DescribeRuleExecStatRequest
     * @return DescribeRuleExecStatResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleExecStatResponse DescribeRuleExecStat(DescribeRuleExecStatRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRuleExecStat", DescribeRuleExecStatResponse.class);
    }

    /**
     *查询规则组详情接口
     * @param req DescribeRuleGroupRequest
     * @return DescribeRuleGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleGroupResponse DescribeRuleGroup(DescribeRuleGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRuleGroup", DescribeRuleGroupResponse.class);
    }

    /**
     *规则组执行结果分页查询接口
     * @param req DescribeRuleGroupExecResultsByPageRequest
     * @return DescribeRuleGroupExecResultsByPageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleGroupExecResultsByPageResponse DescribeRuleGroupExecResultsByPage(DescribeRuleGroupExecResultsByPageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRuleGroupExecResultsByPage", DescribeRuleGroupExecResultsByPageResponse.class);
    }

    /**
     *查询规则组订阅信息
     * @param req DescribeRuleGroupSubscriptionRequest
     * @return DescribeRuleGroupSubscriptionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleGroupSubscriptionResponse DescribeRuleGroupSubscription(DescribeRuleGroupSubscriptionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRuleGroupSubscription", DescribeRuleGroupSubscriptionResponse.class);
    }

    /**
     *查询表绑定执行规则组信息
     * @param req DescribeRuleGroupTableRequest
     * @return DescribeRuleGroupTableResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleGroupTableResponse DescribeRuleGroupTable(DescribeRuleGroupTableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRuleGroupTable", DescribeRuleGroupTableResponse.class);
    }

    /**
     *【过滤条件】
{表名称TableName,支持模糊匹配}       {表负责人TableOwnerName,支持模糊匹配}      {监控方式MonitorTypes，1.未配置 2.关联生产调度 3.离线周期检测,支持多选}  {订阅人ReceiverUin}
【必要字段】
{数据来源DatasourceId}
     * @param req DescribeRuleGroupsByPageRequest
     * @return DescribeRuleGroupsByPageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleGroupsByPageResponse DescribeRuleGroupsByPage(DescribeRuleGroupsByPageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRuleGroupsByPage", DescribeRuleGroupsByPageResponse.class);
    }

    /**
     *查询模板详情
     * @param req DescribeRuleTemplateRequest
     * @return DescribeRuleTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleTemplateResponse DescribeRuleTemplate(DescribeRuleTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRuleTemplate", DescribeRuleTemplateResponse.class);
    }

    /**
     *查询规则模板列表
     * @param req DescribeRuleTemplatesRequest
     * @return DescribeRuleTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleTemplatesResponse DescribeRuleTemplates(DescribeRuleTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRuleTemplates", DescribeRuleTemplatesResponse.class);
    }

    /**
     *【过滤条件】 {模板名称Name,支持模糊匹配} {模板类型type，1.系统模板 2.自定义模板} {质量检测维度QualityDims, 1.准确性 2.唯一性 3.完整性 4.一致性 5.及时性 6.有效性} 【排序字段】 { 引用数排序类型CitationOrderType，根据引用数量排序 ASC DESC}
     * @param req DescribeRuleTemplatesByPageRequest
     * @return DescribeRuleTemplatesByPageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleTemplatesByPageResponse DescribeRuleTemplatesByPage(DescribeRuleTemplatesByPageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRuleTemplatesByPage", DescribeRuleTemplatesByPageResponse.class);
    }

    /**
     *查询质量规则列表
     * @param req DescribeRulesRequest
     * @return DescribeRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRulesResponse DescribeRules(DescribeRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRules", DescribeRulesResponse.class);
    }

    /**
     *分页查询质量规则
     * @param req DescribeRulesByPageRequest
     * @return DescribeRulesByPageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRulesByPageResponse DescribeRulesByPage(DescribeRulesByPageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRulesByPage", DescribeRulesByPageResponse.class);
    }

    /**
     *获取实例列表
     * @param req DescribeScheduleInstancesRequest
     * @return DescribeScheduleInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScheduleInstancesResponse DescribeScheduleInstances(DescribeScheduleInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScheduleInstances", DescribeScheduleInstancesResponse.class);
    }

    /**
     *运维大屏-实例状态分布
     * @param req DescribeSchedulerInstanceStatusRequest
     * @return DescribeSchedulerInstanceStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSchedulerInstanceStatusResponse DescribeSchedulerInstanceStatus(DescribeSchedulerInstanceStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSchedulerInstanceStatus", DescribeSchedulerInstanceStatusResponse.class);
    }

    /**
     *运维大屏-实例运行时长排行
     * @param req DescribeSchedulerRunTimeInstanceCntByStatusRequest
     * @return DescribeSchedulerRunTimeInstanceCntByStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSchedulerRunTimeInstanceCntByStatusResponse DescribeSchedulerRunTimeInstanceCntByStatus(DescribeSchedulerRunTimeInstanceCntByStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSchedulerRunTimeInstanceCntByStatus", DescribeSchedulerRunTimeInstanceCntByStatusResponse.class);
    }

    /**
     *任务状态统计
     * @param req DescribeSchedulerTaskCntByStatusRequest
     * @return DescribeSchedulerTaskCntByStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSchedulerTaskCntByStatusResponse DescribeSchedulerTaskCntByStatus(DescribeSchedulerTaskCntByStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSchedulerTaskCntByStatus", DescribeSchedulerTaskCntByStatusResponse.class);
    }

    /**
     *运维大屏-任务状态分布
     * @param req DescribeSchedulerTaskTypeCntRequest
     * @return DescribeSchedulerTaskTypeCntResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSchedulerTaskTypeCntResponse DescribeSchedulerTaskTypeCnt(DescribeSchedulerTaskTypeCntRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSchedulerTaskTypeCnt", DescribeSchedulerTaskTypeCntResponse.class);
    }

    /**
     *任务状态趋势
     * @param req DescribeStatisticInstanceStatusTrendOpsRequest
     * @return DescribeStatisticInstanceStatusTrendOpsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStatisticInstanceStatusTrendOpsResponse DescribeStatisticInstanceStatusTrendOps(DescribeStatisticInstanceStatusTrendOpsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStatisticInstanceStatusTrendOps", DescribeStatisticInstanceStatusTrendOpsResponse.class);
    }

    /**
     *查询实时任务日志列表
     * @param req DescribeStreamTaskLogListRequest
     * @return DescribeStreamTaskLogListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamTaskLogListResponse DescribeStreamTaskLogList(DescribeStreamTaskLogListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamTaskLogList", DescribeStreamTaskLogListResponse.class);
    }

    /**
     *获取下游任务信息
     * @param req DescribeSuccessorOpsTaskInfosRequest
     * @return DescribeSuccessorOpsTaskInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSuccessorOpsTaskInfosResponse DescribeSuccessorOpsTaskInfos(DescribeSuccessorOpsTaskInfosRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSuccessorOpsTaskInfos", DescribeSuccessorOpsTaskInfosResponse.class);
    }

    /**
     *元数据模型-表基础信息查询接口
     * @param req DescribeTableBasicInfoRequest
     * @return DescribeTableBasicInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTableBasicInfoResponse DescribeTableBasicInfo(DescribeTableBasicInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTableBasicInfo", DescribeTableBasicInfoResponse.class);
    }

    /**
     *获取数据表信息
     * @param req DescribeTableInfoListRequest
     * @return DescribeTableInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTableInfoListResponse DescribeTableInfoList(DescribeTableInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTableInfoList", DescribeTableInfoListResponse.class);
    }

    /**
     *列出表血缘信息
     * @param req DescribeTableLineageRequest
     * @return DescribeTableLineageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTableLineageResponse DescribeTableLineage(DescribeTableLineageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTableLineage", DescribeTableLineageResponse.class);
    }

    /**
     *列出表血缘信息
     * @param req DescribeTableLineageInfoRequest
     * @return DescribeTableLineageInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTableLineageInfoResponse DescribeTableLineageInfo(DescribeTableLineageInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTableLineageInfo", DescribeTableLineageInfoResponse.class);
    }

    /**
     *查询表元数据详情
     * @param req DescribeTableMetaRequest
     * @return DescribeTableMetaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTableMetaResponse DescribeTableMeta(DescribeTableMetaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTableMeta", DescribeTableMetaResponse.class);
    }

    /**
     *获取表元数据list
     * @param req DescribeTableMetasRequest
     * @return DescribeTableMetasResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTableMetasResponse DescribeTableMetas(DescribeTableMetasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTableMetas", DescribeTableMetasResponse.class);
    }

    /**
     *查询表的分区详情信息
     * @param req DescribeTablePartitionsRequest
     * @return DescribeTablePartitionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTablePartitionsResponse DescribeTablePartitions(DescribeTablePartitionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTablePartitions", DescribeTablePartitionsResponse.class);
    }

    /**
     *质量报告-查询表质量详情
     * @param req DescribeTableQualityDetailsRequest
     * @return DescribeTableQualityDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTableQualityDetailsResponse DescribeTableQualityDetails(DescribeTableQualityDetailsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTableQualityDetails", DescribeTableQualityDetailsResponse.class);
    }

    /**
     *获取表schema信息
     * @param req DescribeTableSchemaInfoRequest
     * @return DescribeTableSchemaInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTableSchemaInfoResponse DescribeTableSchemaInfo(DescribeTableSchemaInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTableSchemaInfo", DescribeTableSchemaInfoResponse.class);
    }

    /**
     *查询表得分趋势
     * @param req DescribeTableScoreTrendRequest
     * @return DescribeTableScoreTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTableScoreTrendResponse DescribeTableScoreTrend(DescribeTableScoreTrendRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTableScoreTrend", DescribeTableScoreTrendResponse.class);
    }

    /**
     *查询任务告警规则列表
     * @param req DescribeTaskAlarmRegulationsRequest
     * @return DescribeTaskAlarmRegulationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskAlarmRegulationsResponse DescribeTaskAlarmRegulations(DescribeTaskAlarmRegulationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskAlarmRegulations", DescribeTaskAlarmRegulationsResponse.class);
    }

    /**
     *根据周期类型 查询所有任务
     * @param req DescribeTaskByCycleRequest
     * @return DescribeTaskByCycleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskByCycleResponse DescribeTaskByCycle(DescribeTaskByCycleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskByCycle", DescribeTaskByCycleResponse.class);
    }

    /**
     *能够调通但该API已经没有使用了，看北京数据最后一次上报是23年10月，有接近一千万条数据历史无效数据。当前策略，云API示例修订然后已经分析出来的无效API走预下线流程。
https://capi.woa.com/api/detail?product=wedata&env=api_formal&version=2021-08-20&action=DescribeTaskByCycleReport
这两天在分析API的时候 有较多运维大屏的原始API当前已经没有使用了，但API没有下线。预计需要专项去梳理这一系列待下线API。

任务状态周期增长趋势
     * @param req DescribeTaskByCycleReportRequest
     * @return DescribeTaskByCycleReportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskByCycleReportResponse DescribeTaskByCycleReport(DescribeTaskByCycleReportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskByCycleReport", DescribeTaskByCycleReportResponse.class);
    }

    /**
     *任务状态趋势
     * @param req DescribeTaskByStatusReportRequest
     * @return DescribeTaskByStatusReportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskByStatusReportResponse DescribeTaskByStatusReport(DescribeTaskByStatusReportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskByStatusReport", DescribeTaskByStatusReportResponse.class);
    }

    /**
     *通过任务查询表的血缘关系
     * @param req DescribeTaskLineageRequest
     * @return DescribeTaskLineageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskLineageResponse DescribeTaskLineage(DescribeTaskLineageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskLineage", DescribeTaskLineageResponse.class);
    }

    /**
     *查看任务锁状态信息
     * @param req DescribeTaskLockStatusRequest
     * @return DescribeTaskLockStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskLockStatusResponse DescribeTaskLockStatus(DescribeTaskLockStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskLockStatus", DescribeTaskLockStatusResponse.class);
    }

    /**
     *分页查询任务运行历史
     * @param req DescribeTaskRunHistoryRequest
     * @return DescribeTaskRunHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskRunHistoryResponse DescribeTaskRunHistory(DescribeTaskRunHistoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskRunHistory", DescribeTaskRunHistoryResponse.class);
    }

    /**
     *查询任务脚本
     * @param req DescribeTaskScriptRequest
     * @return DescribeTaskScriptResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskScriptResponse DescribeTaskScript(DescribeTaskScriptRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskScript", DescribeTaskScriptResponse.class);
    }

    /**
     *查询实时任务表粒度指标概览
     * @param req DescribeTaskTableMetricOverviewRequest
     * @return DescribeTaskTableMetricOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskTableMetricOverviewResponse DescribeTaskTableMetricOverview(DescribeTaskTableMetricOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskTableMetricOverview", DescribeTaskTableMetricOverviewResponse.class);
    }

    /**
     *查询项目下所有任务列表,包括虚拟任务
     * @param req DescribeTaskTemplatesRequest
     * @return DescribeTaskTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskTemplatesResponse DescribeTaskTemplates(DescribeTaskTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskTemplates", DescribeTaskTemplatesResponse.class);
    }

    /**
     *分页查询引用模板的任务列表
     * @param req DescribeTasksForCodeTemplateRequest
     * @return DescribeTasksForCodeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTasksForCodeTemplateResponse DescribeTasksForCodeTemplate(DescribeTasksForCodeTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTasksForCodeTemplate", DescribeTasksForCodeTemplateResponse.class);
    }

    /**
     *查询规则模板维度分布情况
     * @param req DescribeTemplateDimCountRequest
     * @return DescribeTemplateDimCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTemplateDimCountResponse DescribeTemplateDimCount(DescribeTemplateDimCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTemplateDimCount", DescribeTemplateDimCountResponse.class);
    }

    /**
     *租户全局范围的项目列表，与用户查看范围无关.
     * @param req DescribeTenantProjectsRequest
     * @return DescribeTenantProjectsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTenantProjectsResponse DescribeTenantProjects(DescribeTenantProjectsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTenantProjects", DescribeTenantProjectsResponse.class);
    }

    /**
     *获取第三方运行日志
     * @param req DescribeThirdTaskRunLogRequest
     * @return DescribeThirdTaskRunLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeThirdTaskRunLogResponse DescribeThirdTaskRunLog(DescribeThirdTaskRunLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeThirdTaskRunLog", DescribeThirdTaskRunLogResponse.class);
    }

    /**
     *数据质量概览页面表排行接口
     * @param req DescribeTopTableStatRequest
     * @return DescribeTopTableStatResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopTableStatResponse DescribeTopTableStat(DescribeTopTableStatRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopTableStat", DescribeTopTableStatResponse.class);
    }

    /**
     *数据质量概览页面趋势变化接口
     * @param req DescribeTrendStatRequest
     * @return DescribeTrendStatResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrendStatResponse DescribeTrendStat(DescribeTrendStatRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTrendStat", DescribeTrendStatResponse.class);
    }

    /**
     *查询工作流画布
     * @param req DescribeWorkflowCanvasInfoRequest
     * @return DescribeWorkflowCanvasInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkflowCanvasInfoResponse DescribeWorkflowCanvasInfo(DescribeWorkflowCanvasInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWorkflowCanvasInfo", DescribeWorkflowCanvasInfoResponse.class);
    }

    /**
     *查询工作流画布运行起止时间
     * @param req DescribeWorkflowExecuteByIdRequest
     * @return DescribeWorkflowExecuteByIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkflowExecuteByIdResponse DescribeWorkflowExecuteById(DescribeWorkflowExecuteByIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWorkflowExecuteById", DescribeWorkflowExecuteByIdResponse.class);
    }

    /**
     *通过工作流id，查询工作流详情
     * @param req DescribeWorkflowInfoByIdRequest
     * @return DescribeWorkflowInfoByIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkflowInfoByIdResponse DescribeWorkflowInfoById(DescribeWorkflowInfoByIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWorkflowInfoById", DescribeWorkflowInfoByIdResponse.class);
    }

    /**
     *根据项目id 获取项目下所有工作流列表
     * @param req DescribeWorkflowListByProjectIdRequest
     * @return DescribeWorkflowListByProjectIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkflowListByProjectIdResponse DescribeWorkflowListByProjectId(DescribeWorkflowListByProjectIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWorkflowListByProjectId", DescribeWorkflowListByProjectIdResponse.class);
    }

    /**
     *获取工作流调度信息
     * @param req DescribeWorkflowSchedulerInfoDsRequest
     * @return DescribeWorkflowSchedulerInfoDsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkflowSchedulerInfoDsResponse DescribeWorkflowSchedulerInfoDs(DescribeWorkflowSchedulerInfoDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWorkflowSchedulerInfoDs", DescribeWorkflowSchedulerInfoDsResponse.class);
    }

    /**
     *查询工作流任务数
     * @param req DescribeWorkflowTaskCountRequest
     * @return DescribeWorkflowTaskCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkflowTaskCountResponse DescribeWorkflowTaskCount(DescribeWorkflowTaskCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWorkflowTaskCount", DescribeWorkflowTaskCountResponse.class);
    }

    /**
     *实例诊断，用于诊断 INITIAL、DEPENDENCE、ALLOCATED、LAUNCHED、EVENT_LISTENING、BEFORE_ASPECT、EXPIRED、FAILED状态的实例
     * @param req DiagnoseProRequest
     * @return DiagnoseProResponse
     * @throws TencentCloudSDKException
     */
    public DiagnoseProResponse DiagnosePro(DiagnoseProRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DiagnosePro", DiagnoseProResponse.class);
    }

    /**
     *按行下载日志信息
     * @param req DownloadLogByLineRequest
     * @return DownloadLogByLineResponse
     * @throws TencentCloudSDKException
     */
    public DownloadLogByLineResponse DownloadLogByLine(DownloadLogByLineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DownloadLogByLine", DownloadLogByLineResponse.class);
    }

    /**
     *调试运行集成任务
     * @param req DryRunDIOfflineTaskRequest
     * @return DryRunDIOfflineTaskResponse
     * @throws TencentCloudSDKException
     */
    public DryRunDIOfflineTaskResponse DryRunDIOfflineTask(DryRunDIOfflineTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DryRunDIOfflineTask", DryRunDIOfflineTaskResponse.class);
    }

    /**
     *编排空间批量操作页面查找全部的文件夹
     * @param req FindAllFolderRequest
     * @return FindAllFolderResponse
     * @throws TencentCloudSDKException
     */
    public FindAllFolderResponse FindAllFolder(FindAllFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "FindAllFolder", FindAllFolderResponse.class);
    }

    /**
     *任务运维-批量暂停任务
     * @param req FreezeOpsTasksRequest
     * @return FreezeOpsTasksResponse
     * @throws TencentCloudSDKException
     */
    public FreezeOpsTasksResponse FreezeOpsTasks(FreezeOpsTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "FreezeOpsTasks", FreezeOpsTasksResponse.class);
    }

    /**
     *暂停工作流下的所有任务
     * @param req FreezeTasksByWorkflowIdsRequest
     * @return FreezeTasksByWorkflowIdsResponse
     * @throws TencentCloudSDKException
     */
    public FreezeTasksByWorkflowIdsResponse FreezeTasksByWorkflowIds(FreezeTasksByWorkflowIdsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "FreezeTasksByWorkflowIds", FreezeTasksByWorkflowIdsResponse.class);
    }

    /**
     *生成建hive表的sql
     * @param req GenHiveTableDDLSqlRequest
     * @return GenHiveTableDDLSqlResponse
     * @throws TencentCloudSDKException
     */
    public GenHiveTableDDLSqlResponse GenHiveTableDDLSql(GenHiveTableDDLSqlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GenHiveTableDDLSql", GenHiveTableDDLSqlResponse.class);
    }

    /**
     *获取批量操作错误日志
     * @param req GetBatchDetailErrorLogRequest
     * @return GetBatchDetailErrorLogResponse
     * @throws TencentCloudSDKException
     */
    public GetBatchDetailErrorLogResponse GetBatchDetailErrorLog(GetBatchDetailErrorLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetBatchDetailErrorLog", GetBatchDetailErrorLogResponse.class);
    }

    /**
     *获取cos token
     * @param req GetCosTokenRequest
     * @return GetCosTokenResponse
     * @throws TencentCloudSDKException
     */
    public GetCosTokenResponse GetCosToken(GetCosTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetCosToken", GetCosTokenResponse.class);
    }

    /**
     *开发空间-获取数据开发脚本信息
     * @param req GetFileInfoRequest
     * @return GetFileInfoResponse
     * @throws TencentCloudSDKException
     */
    public GetFileInfoResponse GetFileInfo(GetFileInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetFileInfo", GetFileInfoResponse.class);
    }

    /**
     *获取实例列表
     * @param req GetInstanceLogRequest
     * @return GetInstanceLogResponse
     * @throws TencentCloudSDKException
     */
    public GetInstanceLogResponse GetInstanceLog(GetInstanceLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetInstanceLog", GetInstanceLogResponse.class);
    }

    /**
     *提取数据集成节点字段Schema
     * @param req GetIntegrationNodeColumnSchemaRequest
     * @return GetIntegrationNodeColumnSchemaResponse
     * @throws TencentCloudSDKException
     */
    public GetIntegrationNodeColumnSchemaResponse GetIntegrationNodeColumnSchema(GetIntegrationNodeColumnSchemaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetIntegrationNodeColumnSchema", GetIntegrationNodeColumnSchemaResponse.class);
    }

    /**
     *获取离线任务实例列表(新)
     * @param req GetOfflineDIInstanceListRequest
     * @return GetOfflineDIInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public GetOfflineDIInstanceListResponse GetOfflineDIInstanceList(GetOfflineDIInstanceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetOfflineDIInstanceList", GetOfflineDIInstanceListResponse.class);
    }

    /**
     *获取离线任务实例
     * @param req GetOfflineInstanceListRequest
     * @return GetOfflineInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public GetOfflineInstanceListResponse GetOfflineInstanceList(GetOfflineInstanceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetOfflineInstanceList", GetOfflineInstanceListResponse.class);
    }

    /**
     *获取实例列表
     * @param req GetTaskInstanceRequest
     * @return GetTaskInstanceResponse
     * @throws TencentCloudSDKException
     */
    public GetTaskInstanceResponse GetTaskInstance(GetTaskInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTaskInstance", GetTaskInstanceResponse.class);
    }

    /**
     *资源管理-判断资源文件是否存在
     * @param req JudgeResourceFileRequest
     * @return JudgeResourceFileResponse
     * @throws TencentCloudSDKException
     */
    public JudgeResourceFileResponse JudgeResourceFile(JudgeResourceFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "JudgeResourceFile", JudgeResourceFileResponse.class);
    }

    /**
     *按补录计划批量终止实例。
     * @param req KillOpsMakePlanInstancesRequest
     * @return KillOpsMakePlanInstancesResponse
     * @throws TencentCloudSDKException
     */
    public KillOpsMakePlanInstancesResponse KillOpsMakePlanInstances(KillOpsMakePlanInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "KillOpsMakePlanInstances", KillOpsMakePlanInstancesResponse.class);
    }

    /**
     *批量终止实例
     * @param req KillScheduleInstancesRequest
     * @return KillScheduleInstancesResponse
     * @throws TencentCloudSDKException
     */
    public KillScheduleInstancesResponse KillScheduleInstances(KillScheduleInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "KillScheduleInstances", KillScheduleInstancesResponse.class);
    }

    /**
     *获取批量操作详情列表
     * @param req ListBatchDetailRequest
     * @return ListBatchDetailResponse
     * @throws TencentCloudSDKException
     */
    public ListBatchDetailResponse ListBatchDetail(ListBatchDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListBatchDetail", ListBatchDetailResponse.class);
    }

    /**
     *获取实例列表
     * @param req ListInstancesRequest
     * @return ListInstancesResponse
     * @throws TencentCloudSDKException
     */
    public ListInstancesResponse ListInstances(ListInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListInstances", ListInstancesResponse.class);
    }

    /**
     *锁定集成任务
     * @param req LockIntegrationTaskRequest
     * @return LockIntegrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public LockIntegrationTaskResponse LockIntegrationTask(LockIntegrationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "LockIntegrationTask", LockIntegrationTaskResponse.class);
    }

    /**
     *修改审批单状态
     * @param req ModifyApproveStatusRequest
     * @return ModifyApproveStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApproveStatusResponse ModifyApproveStatus(ModifyApproveStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApproveStatus", ModifyApproveStatusResponse.class);
    }

    /**
     *修改数据源
     * @param req ModifyDataSourceRequest
     * @return ModifyDataSourceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDataSourceResponse ModifyDataSource(ModifyDataSourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDataSource", ModifyDataSourceResponse.class);
    }

    /**
     *质量报告-修改维度权限
     * @param req ModifyDimensionWeightRequest
     * @return ModifyDimensionWeightResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDimensionWeightResponse ModifyDimensionWeight(ModifyDimensionWeightRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDimensionWeight", ModifyDimensionWeightResponse.class);
    }

    /**
     *数据开发模块-文件夹更新
     * @param req ModifyDsFolderRequest
     * @return ModifyDsFolderResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDsFolderResponse ModifyDsFolder(ModifyDsFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDsFolder", ModifyDsFolderResponse.class);
    }

    /**
     *更新规则组执行策略
     * @param req ModifyExecStrategyRequest
     * @return ModifyExecStrategyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyExecStrategyResponse ModifyExecStrategy(ModifyExecStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyExecStrategy", ModifyExecStrategyResponse.class);
    }

    /**
     *更新集成节点
     * @param req ModifyIntegrationNodeRequest
     * @return ModifyIntegrationNodeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyIntegrationNodeResponse ModifyIntegrationNode(ModifyIntegrationNodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyIntegrationNode", ModifyIntegrationNodeResponse.class);
    }

    /**
     *更新集成任务
     * @param req ModifyIntegrationTaskRequest
     * @return ModifyIntegrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public ModifyIntegrationTaskResponse ModifyIntegrationTask(ModifyIntegrationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyIntegrationTask", ModifyIntegrationTaskResponse.class);
    }

    /**
     *更新监控状态
     * @param req ModifyMonitorStatusRequest
     * @return ModifyMonitorStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMonitorStatusResponse ModifyMonitorStatus(ModifyMonitorStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMonitorStatus", ModifyMonitorStatusResponse.class);
    }

    /**
     *更新质量规则接口
     * @param req ModifyRuleRequest
     * @return ModifyRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRuleResponse ModifyRule(ModifyRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRule", ModifyRuleResponse.class);
    }

    /**
     *更新规则组订阅信息
     * @param req ModifyRuleGroupSubscriptionRequest
     * @return ModifyRuleGroupSubscriptionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRuleGroupSubscriptionResponse ModifyRuleGroupSubscription(ModifyRuleGroupSubscriptionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRuleGroupSubscription", ModifyRuleGroupSubscriptionResponse.class);
    }

    /**
     *编辑规则模板
     * @param req ModifyRuleTemplateRequest
     * @return ModifyRuleTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRuleTemplateResponse ModifyRuleTemplate(ModifyRuleTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRuleTemplate", ModifyRuleTemplateResponse.class);
    }

    /**
     *修改任务告警规则
     * @param req ModifyTaskAlarmRegularRequest
     * @return ModifyTaskAlarmRegularResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTaskAlarmRegularResponse ModifyTaskAlarmRegular(ModifyTaskAlarmRegularRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTaskAlarmRegular", ModifyTaskAlarmRegularResponse.class);
    }

    /**
     *<p style="color:red;">[注意：该版本只满足广州区部分白名单客户使用]</p>
更新任务
     * @param req ModifyTaskInfoRequest
     * @return ModifyTaskInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTaskInfoResponse ModifyTaskInfo(ModifyTaskInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTaskInfo", ModifyTaskInfoResponse.class);
    }

    /**
     *<p style="color:red;">[注意：该版本只满足广州区部分白名单客户使用]</p>
添加父任务依赖。本接口已废弃，请使用接口ModifyTaskLinksDs。
     * @param req ModifyTaskLinksRequest
     * @return ModifyTaskLinksResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTaskLinksResponse ModifyTaskLinks(ModifyTaskLinksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTaskLinks", ModifyTaskLinksResponse.class);
    }

    /**
     *添加父任务依赖
     * @param req ModifyTaskLinksDsRequest
     * @return ModifyTaskLinksDsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTaskLinksDsResponse ModifyTaskLinksDs(ModifyTaskLinksDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTaskLinksDs", ModifyTaskLinksDsResponse.class);
    }

    /**
     *重命名任务（任务编辑）
     * @param req ModifyTaskNameRequest
     * @return ModifyTaskNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTaskNameResponse ModifyTaskName(ModifyTaskNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTaskName", ModifyTaskNameResponse.class);
    }

    /**
     *<p style="color:red;">[注意：该版本只满足广州区部分白名单客户使用]</p>
修改任务脚本
     * @param req ModifyTaskScriptRequest
     * @return ModifyTaskScriptResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTaskScriptResponse ModifyTaskScript(ModifyTaskScriptRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTaskScript", ModifyTaskScriptResponse.class);
    }

    /**
     *更新工作流信息。本接口已废弃，请使用接口UpdateWorkflowInfo。
     * @param req ModifyWorkflowInfoRequest
     * @return ModifyWorkflowInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWorkflowInfoResponse ModifyWorkflowInfo(ModifyWorkflowInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWorkflowInfo", ModifyWorkflowInfoResponse.class);
    }

    /**
     *更新工作流调度。本接口已废弃，请使用接口RenewWorkflowSchedulerInfoDs。
     * @param req ModifyWorkflowScheduleRequest
     * @return ModifyWorkflowScheduleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWorkflowScheduleResponse ModifyWorkflowSchedule(ModifyWorkflowScheduleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWorkflowSchedule", ModifyWorkflowScheduleResponse.class);
    }

    /**
     *编排空间-工作流-移动任务到工作流文件夹
     * @param req MoveTasksToFolderRequest
     * @return MoveTasksToFolderResponse
     * @throws TencentCloudSDKException
     */
    public MoveTasksToFolderResponse MoveTasksToFolder(MoveTasksToFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "MoveTasksToFolder", MoveTasksToFolderResponse.class);
    }

    /**
     *注册事件
     * @param req RegisterDsEventRequest
     * @return RegisterDsEventResponse
     * @throws TencentCloudSDKException
     */
    public RegisterDsEventResponse RegisterDsEvent(RegisterDsEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RegisterDsEvent", RegisterDsEventResponse.class);
    }

    /**
     *<p style="color:red;">[注意：该版本只满足广州区部分白名单客户使用]</p>
注册事件。本接口已废弃，请使用接口RegisterDsEvent。
     * @param req RegisterEventRequest
     * @return RegisterEventResponse
     * @throws TencentCloudSDKException
     */
    public RegisterEventResponse RegisterEvent(RegisterEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RegisterEvent", RegisterEventResponse.class);
    }

    /**
     *<p style="color:red;">[注意：该版本只满足广州区部分白名单客户使用]</p>
注册事件监听器
     * @param req RegisterEventListenerRequest
     * @return RegisterEventListenerResponse
     * @throws TencentCloudSDKException
     */
    public RegisterEventListenerResponse RegisterEventListener(RegisterEventListenerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RegisterEventListener", RegisterEventListenerResponse.class);
    }

    /**
     *删除编排空间工作流
     * @param req RemoveWorkflowDsRequest
     * @return RemoveWorkflowDsResponse
     * @throws TencentCloudSDKException
     */
    public RemoveWorkflowDsResponse RemoveWorkflowDs(RemoveWorkflowDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveWorkflowDs", RemoveWorkflowDsResponse.class);
    }

    /**
     *批量更新工作流下任务责任人
     * @param req RenewWorkflowOwnerDsRequest
     * @return RenewWorkflowOwnerDsResponse
     * @throws TencentCloudSDKException
     */
    public RenewWorkflowOwnerDsResponse RenewWorkflowOwnerDs(RenewWorkflowOwnerDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenewWorkflowOwnerDs", RenewWorkflowOwnerDsResponse.class);
    }

    /**
     *更新工作流下任务调度信息
     * @param req RenewWorkflowSchedulerInfoDsRequest
     * @return RenewWorkflowSchedulerInfoDsResponse
     * @throws TencentCloudSDKException
     */
    public RenewWorkflowSchedulerInfoDsResponse RenewWorkflowSchedulerInfoDs(RenewWorkflowSchedulerInfoDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenewWorkflowSchedulerInfoDs", RenewWorkflowSchedulerInfoDsResponse.class);
    }

    /**
     *血缘上报接口
     * @param req ReportTaskLineageRequest
     * @return ReportTaskLineageResponse
     * @throws TencentCloudSDKException
     */
    public ReportTaskLineageResponse ReportTaskLineage(ReportTaskLineageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReportTaskLineage", ReportTaskLineageResponse.class);
    }

    /**
     *继续集成任务
     * @param req ResumeIntegrationTaskRequest
     * @return ResumeIntegrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public ResumeIntegrationTaskResponse ResumeIntegrationTask(ResumeIntegrationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResumeIntegrationTask", ResumeIntegrationTaskResponse.class);
    }

    /**
     *抢占锁定集成任务
     * @param req RobAndLockIntegrationTaskRequest
     * @return RobAndLockIntegrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public RobAndLockIntegrationTaskResponse RobAndLockIntegrationTask(RobAndLockIntegrationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RobAndLockIntegrationTask", RobAndLockIntegrationTaskResponse.class);
    }

    /**
     *实例批量置成功
     * @param req RunForceSucScheduleInstancesRequest
     * @return RunForceSucScheduleInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RunForceSucScheduleInstancesResponse RunForceSucScheduleInstances(RunForceSucScheduleInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RunForceSucScheduleInstances", RunForceSucScheduleInstancesResponse.class);
    }

    /**
     *实例批量重跑
     * @param req RunRerunScheduleInstancesRequest
     * @return RunRerunScheduleInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RunRerunScheduleInstancesResponse RunRerunScheduleInstances(RunRerunScheduleInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RunRerunScheduleInstances", RunRerunScheduleInstancesResponse.class);
    }

    /**
     *批量启动工作流
     * @param req RunTasksByMultiWorkflowRequest
     * @return RunTasksByMultiWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public RunTasksByMultiWorkflowResponse RunTasksByMultiWorkflow(RunTasksByMultiWorkflowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RunTasksByMultiWorkflow", RunTasksByMultiWorkflowResponse.class);
    }

    /**
     *保存用户自定义函数
     * @param req SaveCustomFunctionRequest
     * @return SaveCustomFunctionResponse
     * @throws TencentCloudSDKException
     */
    public SaveCustomFunctionResponse SaveCustomFunction(SaveCustomFunctionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SaveCustomFunction", SaveCustomFunctionResponse.class);
    }

    /**
     *<p style="color:red;">[注意：该版本只满足广州区部分白名单客户使用]</p>
设置任务告警，新建/更新告警信息（最新）
     * @param req SetTaskAlarmNewRequest
     * @return SetTaskAlarmNewResponse
     * @throws TencentCloudSDKException
     */
    public SetTaskAlarmNewResponse SetTaskAlarmNew(SetTaskAlarmNewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetTaskAlarmNew", SetTaskAlarmNewResponse.class);
    }

    /**
     *启动集成任务
     * @param req StartIntegrationTaskRequest
     * @return StartIntegrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public StartIntegrationTaskResponse StartIntegrationTask(StartIntegrationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartIntegrationTask", StartIntegrationTaskResponse.class);
    }

    /**
     *停止集成任务
     * @param req StopIntegrationTaskRequest
     * @return StopIntegrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public StopIntegrationTaskResponse StopIntegrationTask(StopIntegrationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopIntegrationTask", StopIntegrationTaskResponse.class);
    }

    /**
     *提交自定义函数
     * @param req SubmitCustomFunctionRequest
     * @return SubmitCustomFunctionResponse
     * @throws TencentCloudSDKException
     */
    public SubmitCustomFunctionResponse SubmitCustomFunction(SubmitCustomFunctionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitCustomFunction", SubmitCustomFunctionResponse.class);
    }

    /**
     *即席分析提交SQL任务
     * @param req SubmitSqlTaskRequest
     * @return SubmitSqlTaskResponse
     * @throws TencentCloudSDKException
     */
    public SubmitSqlTaskResponse SubmitSqlTask(SubmitSqlTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitSqlTask", SubmitSqlTaskResponse.class);
    }

    /**
     *<p style="color:red;">[注意：该版本只满足广州区部分白名单客户使用]</p>
提交任务。本接口已废弃，请使用接口CreateTaskVersionDs。
     * @param req SubmitTaskRequest
     * @return SubmitTaskResponse
     * @throws TencentCloudSDKException
     */
    public SubmitTaskResponse SubmitTask(SubmitTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitTask", SubmitTaskResponse.class);
    }

    /**
     *无
     * @param req SubmitTaskTestRunRequest
     * @return SubmitTaskTestRunResponse
     * @throws TencentCloudSDKException
     */
    public SubmitTaskTestRunResponse SubmitTaskTestRun(SubmitTaskTestRunRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitTaskTestRun", SubmitTaskTestRunResponse.class);
    }

    /**
     *提交工作流。本接口已废弃，请使用接口BatchCreateTaskVersionAsync。
     * @param req SubmitWorkflowRequest
     * @return SubmitWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public SubmitWorkflowResponse SubmitWorkflow(SubmitWorkflowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitWorkflow", SubmitWorkflowResponse.class);
    }

    /**
     *暂停集成任务
     * @param req SuspendIntegrationTaskRequest
     * @return SuspendIntegrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public SuspendIntegrationTaskResponse SuspendIntegrationTask(SuspendIntegrationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SuspendIntegrationTask", SuspendIntegrationTaskResponse.class);
    }

    /**
     *查询Inlong manager日志
     * @param req TaskLogRequest
     * @return TaskLogResponse
     * @throws TencentCloudSDKException
     */
    public TaskLogResponse TaskLog(TaskLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TaskLog", TaskLogResponse.class);
    }

    /**
     *事件管理-触发事件
     * @param req TriggerDsEventRequest
     * @return TriggerDsEventResponse
     * @throws TencentCloudSDKException
     */
    public TriggerDsEventResponse TriggerDsEvent(TriggerDsEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TriggerDsEvent", TriggerDsEventResponse.class);
    }

    /**
     *<p style="color:red;">[注意：该版本只满足广州区部分白名单客户使用]</p>
触发事件。本接口已废弃，请使用接口TriggerDsEvent。
     * @param req TriggerEventRequest
     * @return TriggerEventResponse
     * @throws TencentCloudSDKException
     */
    public TriggerEventResponse TriggerEvent(TriggerEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TriggerEvent", TriggerEventResponse.class);
    }

    /**
     *手动任务触发运行
     * @param req TriggerManualTasksRequest
     * @return TriggerManualTasksResponse
     * @throws TencentCloudSDKException
     */
    public TriggerManualTasksResponse TriggerManualTasks(TriggerManualTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TriggerManualTasks", TriggerManualTasksResponse.class);
    }

    /**
     *解锁集成任务
     * @param req UnlockIntegrationTaskRequest
     * @return UnlockIntegrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public UnlockIntegrationTaskResponse UnlockIntegrationTask(UnlockIntegrationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnlockIntegrationTask", UnlockIntegrationTaskResponse.class);
    }

    /**
     *更新模版
     * @param req UpdateCodeTemplateRequest
     * @return UpdateCodeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCodeTemplateResponse UpdateCodeTemplate(UpdateCodeTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateCodeTemplate", UpdateCodeTemplateResponse.class);
    }

    /**
     *数语向wedata注册，提供自身cam角色信息，跳转域名、ip、端口信息等
     * @param req UpdateDataModelRegistryInfoRequest
     * @return UpdateDataModelRegistryInfoResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDataModelRegistryInfoResponse UpdateDataModelRegistryInfo(UpdateDataModelRegistryInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateDataModelRegistryInfo", UpdateDataModelRegistryInfoResponse.class);
    }

    /**
     *修改项目用户角色
     * @param req UpdateProjectUserRoleRequest
     * @return UpdateProjectUserRoleResponse
     * @throws TencentCloudSDKException
     */
    public UpdateProjectUserRoleResponse UpdateProjectUserRole(UpdateProjectUserRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateProjectUserRole", UpdateProjectUserRoleResponse.class);
    }

    /**
     *<p style="color:red;">[该接口为 ds 中开发]</p>
更新工作流（包括工作流基本信息与工作流参数）
     * @param req UpdateWorkflowInfoRequest
     * @return UpdateWorkflowInfoResponse
     * @throws TencentCloudSDKException
     */
    public UpdateWorkflowInfoResponse UpdateWorkflowInfo(UpdateWorkflowInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateWorkflowInfo", UpdateWorkflowInfoResponse.class);
    }

    /**
     *修改工作流责任人。本接口已废弃，请使用接口RenewWorkflowOwnerDs。
     * @param req UpdateWorkflowOwnerRequest
     * @return UpdateWorkflowOwnerResponse
     * @throws TencentCloudSDKException
     */
    public UpdateWorkflowOwnerResponse UpdateWorkflowOwner(UpdateWorkflowOwnerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateWorkflowOwner", UpdateWorkflowOwnerResponse.class);
    }

    /**
     *保存任务信息
     * @param req UploadContentRequest
     * @return UploadContentResponse
     * @throws TencentCloudSDKException
     */
    public UploadContentResponse UploadContent(UploadContentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UploadContent", UploadContentResponse.class);
    }

    /**
     *资源管理-上传资源
     * @param req UploadResourceRequest
     * @return UploadResourceResponse
     * @throws TencentCloudSDKException
     */
    public UploadResourceResponse UploadResource(UploadResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UploadResource", UploadResourceResponse.class);
    }

}
