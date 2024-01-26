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
     *获取协同编辑资源锁
     * @param req AcquireLockRequest
     * @return AcquireLockResponse
     * @throws TencentCloudSDKException
     */
    public AcquireLockResponse AcquireLock(AcquireLockRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AcquireLock", AcquireLockResponse.class);
    }

    /**
     *上游依赖自动解析
     * @param req AnalyzeDependentTasksRequest
     * @return AnalyzeDependentTasksResponse
     * @throws TencentCloudSDKException
     */
    public AnalyzeDependentTasksResponse AnalyzeDependentTasks(AnalyzeDependentTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AnalyzeDependentTasks", AnalyzeDependentTasksResponse.class);
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
     *批量创建任务版本Ds
     * @param req BatchCreateTaskVersionDsRequest
     * @return BatchCreateTaskVersionDsResponse
     * @throws TencentCloudSDKException
     */
    public BatchCreateTaskVersionDsResponse BatchCreateTaskVersionDs(BatchCreateTaskVersionDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchCreateTaskVersionDs", BatchCreateTaskVersionDsResponse.class);
    }

    /**
     *批量创建虚拟任务, 用于新建跨工作流任务场景中新增跨工作流任务操作
     * @param req BatchCreateVirtualTaskDsRequest
     * @return BatchCreateVirtualTaskDsResponse
     * @throws TencentCloudSDKException
     */
    public BatchCreateVirtualTaskDsResponse BatchCreateVirtualTaskDs(BatchCreateVirtualTaskDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchCreateVirtualTaskDs", BatchCreateVirtualTaskDsResponse.class);
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
     *智能运维-批量删除任务
     * @param req BatchDeleteOpsTasksRequest
     * @return BatchDeleteOpsTasksResponse
     * @throws TencentCloudSDKException
     */
    public BatchDeleteOpsTasksResponse BatchDeleteOpsTasks(BatchDeleteOpsTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchDeleteOpsTasks", BatchDeleteOpsTasksResponse.class);
    }

    /**
     *Ds批量删除任务，仅对任务状态为”已停止“有效；
     * @param req BatchDeleteTasksDsRequest
     * @return BatchDeleteTasksDsResponse
     * @throws TencentCloudSDKException
     */
    public BatchDeleteTasksDsResponse BatchDeleteTasksDs(BatchDeleteTasksDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchDeleteTasksDs", BatchDeleteTasksDsResponse.class);
    }

    /**
     *Ds批量删除任务，仅对任务状态为”已停止“有效；
     * @param req BatchDeleteTasksDsAsyncRequest
     * @return BatchDeleteTasksDsAsyncResponse
     * @throws TencentCloudSDKException
     */
    public BatchDeleteTasksDsAsyncResponse BatchDeleteTasksDsAsync(BatchDeleteTasksDsAsyncRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchDeleteTasksDsAsync", BatchDeleteTasksDsAsyncResponse.class);
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
批量删除任务，仅对任务状态为”已停止“有效；

     * @param req BatchDeleteTasksNewRequest
     * @return BatchDeleteTasksNewResponse
     * @throws TencentCloudSDKException
     */
    public BatchDeleteTasksNewResponse BatchDeleteTasksNew(BatchDeleteTasksNewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchDeleteTasksNew", BatchDeleteTasksNewResponse.class);
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
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
批量修改任务责任人
     * @param req BatchModifyOwnersNewRequest
     * @return BatchModifyOwnersNewResponse
     * @throws TencentCloudSDKException
     */
    public BatchModifyOwnersNewResponse BatchModifyOwnersNew(BatchModifyOwnersNewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchModifyOwnersNew", BatchModifyOwnersNewResponse.class);
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
     *任务运维-任务列表 批量运行
     * @param req BatchRunOpsTaskRequest
     * @return BatchRunOpsTaskResponse
     * @throws TencentCloudSDKException
     */
    public BatchRunOpsTaskResponse BatchRunOpsTask(BatchRunOpsTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchRunOpsTask", BatchRunOpsTaskResponse.class);
    }

    /**
     *批量运行任务, 用于工作流-任务配置-运行、工作流-任务右键-运行、任务运维-任务管理-更多操作-运行、任务运维-任务管理-选择任务-批量运行等场景。
1. 任务运行预判断
2. 更新db中任务状态
3. 通知scheduler进行运行操作
     * @param req BatchRunTasksDsRequest
     * @return BatchRunTasksDsResponse
     * @throws TencentCloudSDKException
     */
    public BatchRunTasksDsResponse BatchRunTasksDs(BatchRunTasksDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchRunTasksDs", BatchRunTasksDsResponse.class);
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
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
仅对任务状态为”调度中“和”已暂停“有效，对所选任务的任务实例进行终止，并停止调度
     * @param req BatchStopTasksNewRequest
     * @return BatchStopTasksNewResponse
     * @throws TencentCloudSDKException
     */
    public BatchStopTasksNewResponse BatchStopTasksNew(BatchStopTasksNewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchStopTasksNew", BatchStopTasksNewResponse.class);
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
     *批量更新任务Ds
     * @param req BatchUpdateTasksDsRequest
     * @return BatchUpdateTasksDsResponse
     * @throws TencentCloudSDKException
     */
    public BatchUpdateTasksDsResponse BatchUpdateTasksDs(BatchUpdateTasksDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchUpdateTasksDs", BatchUpdateTasksDsResponse.class);
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
     *新建用户自定义函数组件检查
     * @param req CheckCustomFunctionPremiseRequest
     * @return CheckCustomFunctionPremiseResponse
     * @throws TencentCloudSDKException
     */
    public CheckCustomFunctionPremiseResponse CheckCustomFunctionPremise(CheckCustomFunctionPremiseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckCustomFunctionPremise", CheckCustomFunctionPremiseResponse.class);
    }

    /**
     *检查规则名称是否重复
     * @param req CheckDuplicateRuleNameRequest
     * @return CheckDuplicateRuleNameResponse
     * @throws TencentCloudSDKException
     */
    public CheckDuplicateRuleNameResponse CheckDuplicateRuleName(CheckDuplicateRuleNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckDuplicateRuleName", CheckDuplicateRuleNameResponse.class);
    }

    /**
     *检查规则模板名称是否重复
     * @param req CheckDuplicateTemplateNameRequest
     * @return CheckDuplicateTemplateNameResponse
     * @throws TencentCloudSDKException
     */
    public CheckDuplicateTemplateNameResponse CheckDuplicateTemplateName(CheckDuplicateTemplateNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckDuplicateTemplateName", CheckDuplicateTemplateNameResponse.class);
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
     *检查任务名称是否重复
     * @param req CheckTaskNameExistDsRequest
     * @return CheckTaskNameExistDsResponse
     * @throws TencentCloudSDKException
     */
    public CheckTaskNameExistDsResponse CheckTaskNameExistDs(CheckTaskNameExistDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckTaskNameExistDs", CheckTaskNameExistDsResponse.class);
    }

    /**
     *检查操作用户对所选任务是否有操作权限, 用于新建跨工作流任务场景中展示审批提示操作
     * @param req CheckTaskPriorityDsRequest
     * @return CheckTaskPriorityDsResponse
     * @throws TencentCloudSDKException
     */
    public CheckTaskPriorityDsResponse CheckTaskPriorityDs(CheckTaskPriorityDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckTaskPriorityDs", CheckTaskPriorityDsResponse.class);
    }

    /**
     *清空回收站任务
     * @param req ClearRecycleTaskRequest
     * @return ClearRecycleTaskResponse
     * @throws TencentCloudSDKException
     */
    public ClearRecycleTaskResponse ClearRecycleTask(ClearRecycleTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ClearRecycleTask", ClearRecycleTaskResponse.class);
    }

    /**
     *提交数据导出任务
     * @param req CommitExportTaskRequest
     * @return CommitExportTaskResponse
     * @throws TencentCloudSDKException
     */
    public CommitExportTaskResponse CommitExportTask(CommitExportTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CommitExportTask", CommitExportTaskResponse.class);
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
     *Runner 规则检测结果上报
     * @param req CommitRuleGroupExecResultRequest
     * @return CommitRuleGroupExecResultResponse
     * @throws TencentCloudSDKException
     */
    public CommitRuleGroupExecResultResponse CommitRuleGroupExecResult(CommitRuleGroupExecResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CommitRuleGroupExecResult", CommitRuleGroupExecResultResponse.class);
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
     *工作流版本提交
     * @param req CommitWorkflowRequest
     * @return CommitWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public CommitWorkflowResponse CommitWorkflow(CommitWorkflowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CommitWorkflow", CommitWorkflowResponse.class);
    }

    /**
     *对比任务版本
     * @param req CompareDsTaskVersionInfoRequest
     * @return CompareDsTaskVersionInfoResponse
     * @throws TencentCloudSDKException
     */
    public CompareDsTaskVersionInfoResponse CompareDsTaskVersionInfo(CompareDsTaskVersionInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CompareDsTaskVersionInfo", CompareDsTaskVersionInfoResponse.class);
    }

    /**
     *复制任务Ds
     * @param req CopyTaskDsRequest
     * @return CopyTaskDsResponse
     * @throws TencentCloudSDKException
     */
    public CopyTaskDsResponse CopyTaskDs(CopyTaskDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CopyTaskDs", CopyTaskDsResponse.class);
    }

    /**
     *复制工作流
     * @param req CopyWorkflowDsRequest
     * @return CopyWorkflowDsResponse
     * @throws TencentCloudSDKException
     */
    public CopyWorkflowDsResponse CopyWorkflowDs(CopyWorkflowDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CopyWorkflowDs", CopyWorkflowDsResponse.class);
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
     *创建基线
     * @param req CreateBaselineRequest
     * @return CreateBaselineResponse
     * @throws TencentCloudSDKException
     */
    public CreateBaselineResponse CreateBaseline(CreateBaselineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBaseline", CreateBaselineResponse.class);
    }

    /**
     *创建用户数据开发浏览历史
     * @param req CreateBrowsingHistoryRequest
     * @return CreateBrowsingHistoryResponse
     * @throws TencentCloudSDKException
     */
    public CreateBrowsingHistoryResponse CreateBrowsingHistory(CreateBrowsingHistoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBrowsingHistory", CreateBrowsingHistoryResponse.class);
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
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
创建数据源
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
     *创建开发空间版本
     * @param req CreateFileVersionRequest
     * @return CreateFileVersionResponse
     * @throws TencentCloudSDKException
     */
    public CreateFileVersionResponse CreateFileVersion(CreateFileVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateFileVersion", CreateFileVersionResponse.class);
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
创建文件夹
     * @param req CreateFolderRequest
     * @return CreateFolderResponse
     * @throws TencentCloudSDKException
     */
    public CreateFolderResponse CreateFolder(CreateFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateFolder", CreateFolderResponse.class);
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
     *注册采集器
     * @param req CreateInLongAgentRequest
     * @return CreateInLongAgentResponse
     * @throws TencentCloudSDKException
     */
    public CreateInLongAgentResponse CreateInLongAgent(CreateInLongAgentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInLongAgent", CreateInLongAgentResponse.class);
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
     *创建任务连接
     * @param req CreateLinkRequest
     * @return CreateLinkResponse
     * @throws TencentCloudSDKException
     */
    public CreateLinkResponse CreateLink(CreateLinkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLink", CreateLinkResponse.class);
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
     *补录任务
     * @param req CreateOpsMakePlanRequest
     * @return CreateOpsMakePlanResponse
     * @throws TencentCloudSDKException
     */
    public CreateOpsMakePlanResponse CreateOpsMakePlan(CreateOpsMakePlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateOpsMakePlan", CreateOpsMakePlanResponse.class);
    }

    /**
     *资源管理需要先将资源上传到cos中，然后调用该接口，将cos资源绑定到wedata
     * @param req CreateOrUpdateResourceRequest
     * @return CreateOrUpdateResourceResponse
     * @throws TencentCloudSDKException
     */
    public CreateOrUpdateResourceResponse CreateOrUpdateResource(CreateOrUpdateResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateOrUpdateResource", CreateOrUpdateResourceResponse.class);
    }

    /**
     *新建文件夹
     * @param req CreatePathRequest
     * @return CreatePathResponse
     * @throws TencentCloudSDKException
     */
    public CreatePathResponse CreatePath(CreatePathRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePath", CreatePathResponse.class);
    }

    /**
     *创建项目参数
     * @param req CreateProjectParamDsRequest
     * @return CreateProjectParamDsResponse
     * @throws TencentCloudSDKException
     */
    public CreateProjectParamDsResponse CreateProjectParamDs(CreateProjectParamDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateProjectParamDs", CreateProjectParamDsResponse.class);
    }

    /**
     *资源管理-创建资源目录
     * @param req CreateResourceDirectoryRequest
     * @return CreateResourceDirectoryResponse
     * @throws TencentCloudSDKException
     */
    public CreateResourceDirectoryResponse CreateResourceDirectory(CreateResourceDirectoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateResourceDirectory", CreateResourceDirectoryResponse.class);
    }

    /**
     *文件路径的根目录为 /datastudio/resource，如果要在根目录下创建 aaa 文件夹，FilePath的值应该为 /datastudio/resource，如果根目录下已经创建了 aaa 文件夹，要在 aaa 下创建  bbb 文件夹，FilePath的值应该为 /datastudio/resource/aaa
     * @param req CreateResourcePathRequest
     * @return CreateResourcePathResponse
     * @throws TencentCloudSDKException
     */
    public CreateResourcePathResponse CreateResourcePath(CreateResourcePathRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateResourcePath", CreateResourcePathResponse.class);
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
     *创建规则模版
     * @param req CreateRuleTemplateRequest
     * @return CreateRuleTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateRuleTemplateResponse CreateRuleTemplate(CreateRuleTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRuleTemplate", CreateRuleTemplateResponse.class);
    }

    /**
     *编排空间导入开发空间脚本。
     * @param req CreateScriptsImportTasksDsRequest
     * @return CreateScriptsImportTasksDsResponse
     * @throws TencentCloudSDKException
     */
    public CreateScriptsImportTasksDsResponse CreateScriptsImportTasksDs(CreateScriptsImportTasksDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateScriptsImportTasksDs", CreateScriptsImportTasksDsResponse.class);
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
创建任务
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
     *创建任务Ds
     * @param req CreateTaskDsRequest
     * @return CreateTaskDsResponse
     * @throws TencentCloudSDKException
     */
    public CreateTaskDsResponse CreateTaskDs(CreateTaskDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTaskDs", CreateTaskDsResponse.class);
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
     *设置任务输入参数
     * @param req CreateTaskInParamDsRequest
     * @return CreateTaskInParamDsResponse
     * @throws TencentCloudSDKException
     */
    public CreateTaskInParamDsResponse CreateTaskInParamDs(CreateTaskInParamDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTaskInParamDs", CreateTaskInParamDsResponse.class);
    }

    /**
     *设置任务输出参数
     * @param req CreateTaskOutParamDsRequest
     * @return CreateTaskOutParamDsResponse
     * @throws TencentCloudSDKException
     */
    public CreateTaskOutParamDsResponse CreateTaskOutParamDs(CreateTaskOutParamDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTaskOutParamDs", CreateTaskOutParamDsResponse.class);
    }

    /**
     *批量创建登记项
     * @param req CreateTaskOutputRegistriesRequest
     * @return CreateTaskOutputRegistriesResponse
     * @throws TencentCloudSDKException
     */
    public CreateTaskOutputRegistriesResponse CreateTaskOutputRegistries(CreateTaskOutputRegistriesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTaskOutputRegistries", CreateTaskOutputRegistriesResponse.class);
    }

    /**
     *新增或编辑产出登记项
     * @param req CreateTaskOutputRegistryRequest
     * @return CreateTaskOutputRegistryResponse
     * @throws TencentCloudSDKException
     */
    public CreateTaskOutputRegistryResponse CreateTaskOutputRegistry(CreateTaskOutputRegistryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTaskOutputRegistry", CreateTaskOutputRegistryResponse.class);
    }

    /**
     *任务引用参数
     * @param req CreateTaskParamDsRequest
     * @return CreateTaskParamDsResponse
     * @throws TencentCloudSDKException
     */
    public CreateTaskParamDsResponse CreateTaskParamDs(CreateTaskParamDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTaskParamDs", CreateTaskParamDsResponse.class);
    }

    /**
     *创建任务版本
     * @param req CreateTaskVersionDsRequest
     * @return CreateTaskVersionDsResponse
     * @throws TencentCloudSDKException
     */
    public CreateTaskVersionDsResponse CreateTaskVersionDs(CreateTaskVersionDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTaskVersionDs", CreateTaskVersionDsResponse.class);
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
创建工作流
     * @param req CreateWorkflowRequest
     * @return CreateWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public CreateWorkflowResponse CreateWorkflow(CreateWorkflowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWorkflow", CreateWorkflowResponse.class);
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
     *DeleteBaseline
     * @param req DeleteBaselineRequest
     * @return DeleteBaselineResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBaselineResponse DeleteBaseline(DeleteBaselineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBaseline", DeleteBaselineResponse.class);
    }

    /**
     *批量删除工作流
     * @param req DeleteBatchWorkflowDsRequest
     * @return DeleteBatchWorkflowDsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBatchWorkflowDsResponse DeleteBatchWorkflowDs(DeleteBatchWorkflowDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBatchWorkflowDs", DeleteBatchWorkflowDsResponse.class);
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
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
删除数据源
     * @param req DeleteDataSourcesRequest
     * @return DeleteDataSourcesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDataSourcesResponse DeleteDataSources(DeleteDataSourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDataSources", DeleteDataSourcesResponse.class);
    }

    /**
     *删除事件
     * @param req DeleteDsEventRequest
     * @return DeleteDsEventResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDsEventResponse DeleteDsEvent(DeleteDsEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDsEvent", DeleteDsEventResponse.class);
    }

    /**
     *删除事件监听者
     * @param req DeleteDsEventListenerRequest
     * @return DeleteDsEventListenerResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDsEventListenerResponse DeleteDsEventListener(DeleteDsEventListenerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDsEventListener", DeleteDsEventListenerResponse.class);
    }

    /**
     *删除事件发布者
     * @param req DeleteDsEventPublisherRequest
     * @return DeleteDsEventPublisherResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDsEventPublisherResponse DeleteDsEventPublisher(DeleteDsEventPublisherRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDsEventPublisher", DeleteDsEventPublisherResponse.class);
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
     *通过任务ID删除所有事件
     * @param req DeleteEventListenerByTaskIdRequest
     * @return DeleteEventListenerByTaskIdResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEventListenerByTaskIdResponse DeleteEventListenerByTaskId(DeleteEventListenerByTaskIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEventListenerByTaskId", DeleteEventListenerByTaskIdResponse.class);
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
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
删除文件夹
     * @param req DeleteFolderRequest
     * @return DeleteFolderResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFolderResponse DeleteFolder(DeleteFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteFolder", DeleteFolderResponse.class);
    }

    /**
     *删除采集器
     * @param req DeleteInLongAgentRequest
     * @return DeleteInLongAgentResponse
     * @throws TencentCloudSDKException
     */
    public DeleteInLongAgentResponse DeleteInLongAgent(DeleteInLongAgentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteInLongAgent", DeleteInLongAgentResponse.class);
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
     *删除任务连接
     * @param req DeleteLinkRequest
     * @return DeleteLinkResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLinkResponse DeleteLink(DeleteLinkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLink", DeleteLinkResponse.class);
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
     *删除项目参数版本
     * @param req DeleteProjectParamVersionDsRequest
     * @return DeleteProjectParamVersionDsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProjectParamVersionDsResponse DeleteProjectParamVersionDs(DeleteProjectParamVersionDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteProjectParamVersionDs", DeleteProjectParamVersionDsResponse.class);
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
     *批量删除任务提交记录列表
     * @param req DeleteRecordListRequest
     * @return DeleteRecordListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRecordListResponse DeleteRecordList(DeleteRecordListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRecordList", DeleteRecordListResponse.class);
    }

    /**
     *删除回收站任务
     * @param req DeleteRecycleTaskRequest
     * @return DeleteRecycleTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRecycleTaskResponse DeleteRecycleTask(DeleteRecycleTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRecycleTask", DeleteRecycleTaskResponse.class);
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
     *资源管理-删除资源目录
     * @param req DeleteResourcePathRequest
     * @return DeleteResourcePathResponse
     * @throws TencentCloudSDKException
     */
    public DeleteResourcePathResponse DeleteResourcePath(DeleteResourcePathRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteResourcePath", DeleteResourcePathResponse.class);
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
     *删除规则模版
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
     *删除任务Ds
     * @param req DeleteTaskDsRequest
     * @return DeleteTaskDsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTaskDsResponse DeleteTaskDs(DeleteTaskDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTaskDs", DeleteTaskDsResponse.class);
    }

    /**
     *编排空间-工作流-删除任务文件夹
     * @param req DeleteTaskFolderRequest
     * @return DeleteTaskFolderResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTaskFolderResponse DeleteTaskFolder(DeleteTaskFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTaskFolder", DeleteTaskFolderResponse.class);
    }

    /**
     *删除任务输入参数
     * @param req DeleteTaskInParamDsRequest
     * @return DeleteTaskInParamDsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTaskInParamDsResponse DeleteTaskInParamDs(DeleteTaskInParamDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTaskInParamDs", DeleteTaskInParamDsResponse.class);
    }

    /**
     *删除任务输出参数
     * @param req DeleteTaskOutParamDsRequest
     * @return DeleteTaskOutParamDsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTaskOutParamDsResponse DeleteTaskOutParamDs(DeleteTaskOutParamDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTaskOutParamDs", DeleteTaskOutParamDsResponse.class);
    }

    /**
     *删除产出登记项
     * @param req DeleteTaskOutputRegistryRequest
     * @return DeleteTaskOutputRegistryResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTaskOutputRegistryResponse DeleteTaskOutputRegistry(DeleteTaskOutputRegistryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTaskOutputRegistry", DeleteTaskOutputRegistryResponse.class);
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
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
删除工作流
     * @param req DeleteWorkflowNewRequest
     * @return DeleteWorkflowNewResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWorkflowNewResponse DeleteWorkflowNew(DeleteWorkflowNewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteWorkflowNew", DeleteWorkflowNewResponse.class);
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
     *查询所有参数
     * @param req DescribeAllParamDsRequest
     * @return DescribeAllParamDsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAllParamDsResponse DescribeAllParamDs(DescribeAllParamDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAllParamDs", DescribeAllParamDsResponse.class);
    }

    /**
     *获取所有任务类型
     * @param req DescribeAllTaskTypeRequest
     * @return DescribeAllTaskTypeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAllTaskTypeResponse DescribeAllTaskType(DescribeAllTaskTypeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAllTaskType", DescribeAllTaskTypeResponse.class);
    }

    /**
     *根据任务Id查找生产态子任务
     * @param req DescribeAllUsedVersionSonRequest
     * @return DescribeAllUsedVersionSonResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAllUsedVersionSonResponse DescribeAllUsedVersionSon(DescribeAllUsedVersionSonRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAllUsedVersionSon", DescribeAllUsedVersionSonResponse.class);
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
     *查询基线DAG
     * @param req DescribeBaselineAllTaskDagRequest
     * @return DescribeBaselineAllTaskDagResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineAllTaskDagResponse DescribeBaselineAllTaskDag(DescribeBaselineAllTaskDagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineAllTaskDag", DescribeBaselineAllTaskDagResponse.class);
    }

    /**
     *基线列表
     * @param req DescribeBaselineByIdRequest
     * @return DescribeBaselineByIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineByIdResponse DescribeBaselineById(DescribeBaselineByIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineById", DescribeBaselineByIdResponse.class);
    }

    /**
     *查询基线实例DAG
     * @param req DescribeBaselineInstanceDagRequest
     * @return DescribeBaselineInstanceDagResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineInstanceDagResponse DescribeBaselineInstanceDag(DescribeBaselineInstanceDagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineInstanceDag", DescribeBaselineInstanceDagResponse.class);
    }

    /**
     *查询基线实例关键任务实例甘特图
     * @param req DescribeBaselineInstanceGanttRequest
     * @return DescribeBaselineInstanceGanttResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineInstanceGanttResponse DescribeBaselineInstanceGantt(DescribeBaselineInstanceGanttRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineInstanceGantt", DescribeBaselineInstanceGanttResponse.class);
    }

    /**
     *查询基线实例列表
     * @param req DescribeBaselineInstancesRequest
     * @return DescribeBaselineInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineInstancesResponse DescribeBaselineInstances(DescribeBaselineInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineInstances", DescribeBaselineInstancesResponse.class);
    }

    /**
     *基线列表
     * @param req DescribeBaselinesRequest
     * @return DescribeBaselinesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselinesResponse DescribeBaselines(DescribeBaselinesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselines", DescribeBaselinesResponse.class);
    }

    /**
     *批量操作任务列表
     * @param req DescribeBatchOperateTaskRequest
     * @return DescribeBatchOperateTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBatchOperateTaskResponse DescribeBatchOperateTask(DescribeBatchOperateTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBatchOperateTask", DescribeBatchOperateTaskResponse.class);
    }

    /**
     *批量获取etl测试运行任务执行状态和日志
     * @param req DescribeBatchTestRunRequest
     * @return DescribeBatchTestRunResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBatchTestRunResponse DescribeBatchTestRun(DescribeBatchTestRunRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBatchTestRun", DescribeBatchTestRunResponse.class);
    }

    /**
     *智能运维-事件列表-所属任务/基线过滤列表
     * @param req DescribeBelongToRequest
     * @return DescribeBelongToResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBelongToResponse DescribeBelongTo(DescribeBelongToRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBelongTo", DescribeBelongToResponse.class);
    }

    /**
     *查询用户数据开发浏览历史
     * @param req DescribeBrowsingHistoriesRequest
     * @return DescribeBrowsingHistoriesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBrowsingHistoriesResponse DescribeBrowsingHistories(DescribeBrowsingHistoriesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBrowsingHistories", DescribeBrowsingHistoriesResponse.class);
    }

    /**
     *查询子任务信息Ds
     * @param req DescribeChildrenDsRequest
     * @return DescribeChildrenDsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeChildrenDsResponse DescribeChildrenDs(DescribeChildrenDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeChildrenDs", DescribeChildrenDsResponse.class);
    }

    /**
     *开发空间-拉取指定路径目录树
     * @param req DescribeChildrenPathTreesRequest
     * @return DescribeChildrenPathTreesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeChildrenPathTreesResponse DescribeChildrenPathTrees(DescribeChildrenPathTreesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeChildrenPathTrees", DescribeChildrenPathTreesResponse.class);
    }

    /**
     *获取集群命名空间列表
     * @param req DescribeClusterNamespaceListRequest
     * @return DescribeClusterNamespaceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterNamespaceListResponse DescribeClusterNamespaceList(DescribeClusterNamespaceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterNamespaceList", DescribeClusterNamespaceListResponse.class);
    }

    /**
     *查询文件或任务详情
     * @param req DescribeCodeDetailRequest
     * @return DescribeCodeDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCodeDetailResponse DescribeCodeDetail(DescribeCodeDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCodeDetail", DescribeCodeDetailResponse.class);
    }

    /**
     *全局搜索查询文件或任务详情
     * @param req DescribeCodeDetailV2Request
     * @return DescribeCodeDetailV2Response
     * @throws TencentCloudSDKException
     */
    public DescribeCodeDetailV2Response DescribeCodeDetailV2(DescribeCodeDetailV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCodeDetailV2", DescribeCodeDetailV2Response.class);
    }

    /**
     *查询最近5条代码搜索审计日志
     * @param req DescribeCodeSearchAuditInfoRequest
     * @return DescribeCodeSearchAuditInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCodeSearchAuditInfoResponse DescribeCodeSearchAuditInfo(DescribeCodeSearchAuditInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCodeSearchAuditInfo", DescribeCodeSearchAuditInfoResponse.class);
    }

    /**
     *获取代码搜索最近n条关键字搜索信息
     * @param req DescribeCodeSearchAuditInfoV2Request
     * @return DescribeCodeSearchAuditInfoV2Response
     * @throws TencentCloudSDKException
     */
    public DescribeCodeSearchAuditInfoV2Response DescribeCodeSearchAuditInfoV2(DescribeCodeSearchAuditInfoV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCodeSearchAuditInfoV2", DescribeCodeSearchAuditInfoV2Response.class);
    }

    /**
     *代码搜索结果的统计信息
     * @param req DescribeCodeSearchCountRequest
     * @return DescribeCodeSearchCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCodeSearchCountResponse DescribeCodeSearchCount(DescribeCodeSearchCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCodeSearchCount", DescribeCodeSearchCountResponse.class);
    }

    /**
     *根据条件搜索代码
     * @param req DescribeCodeSearchInfoRequest
     * @return DescribeCodeSearchInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCodeSearchInfoResponse DescribeCodeSearchInfo(DescribeCodeSearchInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCodeSearchInfo", DescribeCodeSearchInfoResponse.class);
    }

    /**
     *全局搜索根据条件搜索代码
     * @param req DescribeCodeSearchInfoV2Request
     * @return DescribeCodeSearchInfoV2Response
     * @throws TencentCloudSDKException
     */
    public DescribeCodeSearchInfoV2Response DescribeCodeSearchInfoV2(DescribeCodeSearchInfoV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCodeSearchInfoV2", DescribeCodeSearchInfoV2Response.class);
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
     *获取 crontab topN 个数据时间周期
     * @param req DescribeCrontabTopNDsRequest
     * @return DescribeCrontabTopNDsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCrontabTopNDsResponse DescribeCrontabTopNDs(DescribeCrontabTopNDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCrontabTopNDs", DescribeCrontabTopNDsResponse.class);
    }

    /**
     *查询函数版本列表
     * @param req DescribeCustomFunctionVersionListRequest
     * @return DescribeCustomFunctionVersionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomFunctionVersionListResponse DescribeCustomFunctionVersionList(DescribeCustomFunctionVersionListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCustomFunctionVersionList", DescribeCustomFunctionVersionListResponse.class);
    }

    /**
     *查询数据来源列表
     * @param req DescribeDataBasesRequest
     * @return DescribeDataBasesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataBasesResponse DescribeDataBases(DescribeDataBasesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataBases", DescribeDataBasesResponse.class);
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
     *获取数据开发任务类型
     * @param req DescribeDataDevelopTaskTypeRequest
     * @return DescribeDataDevelopTaskTypeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataDevelopTaskTypeResponse DescribeDataDevelopTaskType(DescribeDataDevelopTaskTypeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataDevelopTaskType", DescribeDataDevelopTaskTypeResponse.class);
    }

    /**
     *查询规则组数据对象列表
     * @param req DescribeDataObjectsRequest
     * @return DescribeDataObjectsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataObjectsResponse DescribeDataObjects(DescribeDataObjectsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataObjects", DescribeDataObjectsResponse.class);
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
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
数据源详情
     * @param req DescribeDataSourceListRequest
     * @return DescribeDataSourceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataSourceListResponse DescribeDataSourceList(DescribeDataSourceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataSourceList", DescribeDataSourceListResponse.class);
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
数据源列表
     * @param req DescribeDataSourceWithoutInfoRequest
     * @return DescribeDataSourceWithoutInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataSourceWithoutInfoResponse DescribeDataSourceWithoutInfo(DescribeDataSourceWithoutInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataSourceWithoutInfo", DescribeDataSourceWithoutInfoResponse.class);
    }

    /**
     *获取数据表导入状态
     * @param req DescribeDataTableImportProgressRequest
     * @return DescribeDataTableImportProgressResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataTableImportProgressResponse DescribeDataTableImportProgress(DescribeDataTableImportProgressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataTableImportProgress", DescribeDataTableImportProgressResponse.class);
    }

    /**
     *获取字段类型列表
     * @param req DescribeDataTypesRequest
     * @return DescribeDataTypesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataTypesResponse DescribeDataTypes(DescribeDataTypesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataTypes", DescribeDataTypesResponse.class);
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
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
数据源详情
     * @param req DescribeDatasourceRequest
     * @return DescribeDatasourceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatasourceResponse DescribeDatasource(DescribeDatasourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDatasource", DescribeDatasourceResponse.class);
    }

    /**
     *根据任务id获取下游依赖任务列表
     * @param req DescribeDependOpsTaskListRequest
     * @return DescribeDependOpsTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDependOpsTaskListResponse DescribeDependOpsTaskList(DescribeDependOpsTaskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDependOpsTaskList", DescribeDependOpsTaskListResponse.class);
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
     *根据层级查找开发态上下游任务节点
     * @param req DescribeDependTasksDevDsRequest
     * @return DescribeDependTasksDevDsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDependTasksDevDsResponse DescribeDependTasksDevDs(DescribeDependTasksDevDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDependTasksDevDs", DescribeDependTasksDevDsResponse.class);
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
根据层级查找上/下游任务节点
     * @param req DescribeDependTasksNewRequest
     * @return DescribeDependTasksNewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDependTasksNewResponse DescribeDependTasksNew(DescribeDependTasksNewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDependTasksNew", DescribeDependTasksNewResponse.class);
    }

    /**
     *【项目克隆任务模式】依赖任务信息查询
     * @param req DescribeDependencyTasksForProjectCloneRequest
     * @return DescribeDependencyTasksForProjectCloneResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDependencyTasksForProjectCloneResponse DescribeDependencyTasksForProjectClone(DescribeDependencyTasksForProjectCloneRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDependencyTasksForProjectClone", DescribeDependencyTasksForProjectCloneResponse.class);
    }

    /**
     *查询依赖工作流信息查询-项目克隆使用
     * @param req DescribeDependencyWorkflowForProjectCloneRequest
     * @return DescribeDependencyWorkflowForProjectCloneResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDependencyWorkflowForProjectCloneResponse DescribeDependencyWorkflowForProjectClone(DescribeDependencyWorkflowForProjectCloneRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDependencyWorkflowForProjectClone", DescribeDependencyWorkflowForProjectCloneResponse.class);
    }

    /**
     *获取开发空间支持的脚本类型
     * @param req DescribeDevelopmentSpaceSupportTypeRequest
     * @return DescribeDevelopmentSpaceSupportTypeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDevelopmentSpaceSupportTypeResponse DescribeDevelopmentSpaceSupportType(DescribeDevelopmentSpaceSupportTypeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDevelopmentSpaceSupportType", DescribeDevelopmentSpaceSupportTypeResponse.class);
    }

    /**
     *查询基线诊断信息
     * @param req DescribeDiagnosticInfoByBaselineIdRequest
     * @return DescribeDiagnosticInfoByBaselineIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDiagnosticInfoByBaselineIdResponse DescribeDiagnosticInfoByBaselineId(DescribeDiagnosticInfoByBaselineIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDiagnosticInfoByBaselineId", DescribeDiagnosticInfoByBaselineIdResponse.class);
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
     *分页查询试运行实例列表
     * @param req DescribeDrInstancePageRequest
     * @return DescribeDrInstancePageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDrInstancePageResponse DescribeDrInstancePage(DescribeDrInstancePageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDrInstancePage", DescribeDrInstancePageResponse.class);
    }

    /**
     *查询试运行实例执行内容
     * @param req DescribeDrInstanceScriptContentRequest
     * @return DescribeDrInstanceScriptContentResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDrInstanceScriptContentResponse DescribeDrInstanceScriptContent(DescribeDrInstanceScriptContentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDrInstanceScriptContent", DescribeDrInstanceScriptContentResponse.class);
    }

    /**
     *查询试运行实例子实例列表
     * @param req DescribeDrSonInstanceRequest
     * @return DescribeDrSonInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDrSonInstanceResponse DescribeDrSonInstance(DescribeDrSonInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDrSonInstance", DescribeDrSonInstanceResponse.class);
    }

    /**
     *分页查询事件
     * @param req DescribeDsEventRequest
     * @return DescribeDsEventResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDsEventResponse DescribeDsEvent(DescribeDsEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDsEvent", DescribeDsEventResponse.class);
    }

    /**
     *事件管理-查询事件详情
     * @param req DescribeDsEventDetailRequest
     * @return DescribeDsEventDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDsEventDetailResponse DescribeDsEventDetail(DescribeDsEventDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDsEventDetail", DescribeDsEventDetailResponse.class);
    }

    /**
     *查询事件监听者信息
     * @param req DescribeDsEventListenerRequest
     * @return DescribeDsEventListenerResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDsEventListenerResponse DescribeDsEventListener(DescribeDsEventListenerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDsEventListener", DescribeDsEventListenerResponse.class);
    }

    /**
     *查询事件监听者列表
     * @param req DescribeDsEventListenerListRequest
     * @return DescribeDsEventListenerListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDsEventListenerListResponse DescribeDsEventListenerList(DescribeDsEventListenerListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDsEventListenerList", DescribeDsEventListenerListResponse.class);
    }

    /**
     *查询事件发布者信息
     * @param req DescribeDsEventPublisherRequest
     * @return DescribeDsEventPublisherResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDsEventPublisherResponse DescribeDsEventPublisher(DescribeDsEventPublisherRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDsEventPublisher", DescribeDsEventPublisherResponse.class);
    }

    /**
     *查询事件发布者列表
     * @param req DescribeDsEventPublisherListRequest
     * @return DescribeDsEventPublisherListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDsEventPublisherListResponse DescribeDsEventPublisherList(DescribeDsEventPublisherListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDsEventPublisherList", DescribeDsEventPublisherListResponse.class);
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
     *查询 kettle 资源服务器目录树
     * @param req DescribeDsKettleServerFolderTreeRequest
     * @return DescribeDsKettleServerFolderTreeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDsKettleServerFolderTreeResponse DescribeDsKettleServerFolderTree(DescribeDsKettleServerFolderTreeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDsKettleServerFolderTree", DescribeDsKettleServerFolderTreeResponse.class);
    }

    /**
     *获取任务最新版本
     * @param req DescribeDsLatestTaskVersionInfoRequest
     * @return DescribeDsLatestTaskVersionInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDsLatestTaskVersionInfoResponse DescribeDsLatestTaskVersionInfo(DescribeDsLatestTaskVersionInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDsLatestTaskVersionInfo", DescribeDsLatestTaskVersionInfoResponse.class);
    }

    /**
     *根据工作流id查询保存未提交任务
     * @param req DescribeDsNotSubmitTasksAndCanRunByWorkflowRequest
     * @return DescribeDsNotSubmitTasksAndCanRunByWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDsNotSubmitTasksAndCanRunByWorkflowResponse DescribeDsNotSubmitTasksAndCanRunByWorkflow(DescribeDsNotSubmitTasksAndCanRunByWorkflowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDsNotSubmitTasksAndCanRunByWorkflow", DescribeDsNotSubmitTasksAndCanRunByWorkflowResponse.class);
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
     *查看任务版本详细信息
     * @param req DescribeDsTaskVersionInfoRequest
     * @return DescribeDsTaskVersionInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDsTaskVersionInfoResponse DescribeDsTaskVersionInfo(DescribeDsTaskVersionInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDsTaskVersionInfo", DescribeDsTaskVersionInfoResponse.class);
    }

    /**
     *拉取任务版本列表
     * @param req DescribeDsTaskVersionListRequest
     * @return DescribeDsTaskVersionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDsTaskVersionListResponse DescribeDsTaskVersionList(DescribeDsTaskVersionListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDsTaskVersionList", DescribeDsTaskVersionListResponse.class);
    }

    /**
     *获取数据同步任务类型
     * @param req DescribeEtlTaskTypeRequest
     * @return DescribeEtlTaskTypeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEtlTaskTypeResponse DescribeEtlTaskType(DescribeEtlTaskTypeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEtlTaskType", DescribeEtlTaskTypeResponse.class);
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
     *智能运维事件详情1
     * @param req DescribeEventDetailRequest
     * @return DescribeEventDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEventDetailResponse DescribeEventDetail(DescribeEventDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEventDetail", DescribeEventDetailResponse.class);
    }

    /**
     *事件是否告警过滤条件
     * @param req DescribeEventIsAlarmTypesRequest
     * @return DescribeEventIsAlarmTypesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEventIsAlarmTypesResponse DescribeEventIsAlarmTypes(DescribeEventIsAlarmTypesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEventIsAlarmTypes", DescribeEventIsAlarmTypesResponse.class);
    }

    /**
     *根据任务ID获取任务监听事件
     * @param req DescribeEventListenerByTaskIdRequest
     * @return DescribeEventListenerByTaskIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEventListenerByTaskIdResponse DescribeEventListenerByTaskId(DescribeEventListenerByTaskIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEventListenerByTaskId", DescribeEventListenerByTaskIdResponse.class);
    }

    /**
     *事件管理-查询事件关联任务
     * @param req DescribeEventListenerTaskRequest
     * @return DescribeEventListenerTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEventListenerTaskResponse DescribeEventListenerTask(DescribeEventListenerTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEventListenerTask", DescribeEventListenerTaskResponse.class);
    }

    /**
     *查询事件类型列表
     * @param req DescribeEventTypesRequest
     * @return DescribeEventTypesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEventTypesResponse DescribeEventTypes(DescribeEventTypesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEventTypes", DescribeEventTypesResponse.class);
    }

    /**
     *智能运维事件查询列表
     * @param req DescribeEventsRequest
     * @return DescribeEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEventsResponse DescribeEvents(DescribeEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEvents", DescribeEventsResponse.class);
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
     *获取执行日志
     * @param req DescribeExecutionLogRequest
     * @return DescribeExecutionLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExecutionLogResponse DescribeExecutionLog(DescribeExecutionLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExecutionLog", DescribeExecutionLogResponse.class);
    }

    /**
     *查询父任务数据源信息Ds
     * @param req DescribeFatherDatasourceInfoDsRequest
     * @return DescribeFatherDatasourceInfoDsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFatherDatasourceInfoDsResponse DescribeFatherDatasourceInfoDs(DescribeFatherDatasourceInfoDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFatherDatasourceInfoDs", DescribeFatherDatasourceInfoDsResponse.class);
    }

    /**
     *获取关联父实例
     * @param req DescribeFathersRequest
     * @return DescribeFathersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFathersResponse DescribeFathers(DescribeFathersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFathers", DescribeFathersResponse.class);
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
     *查询开发空间版本列表
     * @param req DescribeFileVersionsRequest
     * @return DescribeFileVersionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileVersionsResponse DescribeFileVersions(DescribeFileVersionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFileVersions", DescribeFileVersionsResponse.class);
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
拉取文件夹目录
     * @param req DescribeFolderListRequest
     * @return DescribeFolderListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFolderListResponse DescribeFolderList(DescribeFolderListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFolderList", DescribeFolderListResponse.class);
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
拉取文件夹下的工作流
     * @param req DescribeFolderWorkflowListRequest
     * @return DescribeFolderWorkflowListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFolderWorkflowListResponse DescribeFolderWorkflowList(DescribeFolderWorkflowListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFolderWorkflowList", DescribeFolderWorkflowListResponse.class);
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
     *获取全局工作流信息，用于跨工作流节点拉取租户所有工作流列表
     * @param req DescribeGlobalWorkflowDsRequest
     * @return DescribeGlobalWorkflowDsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGlobalWorkflowDsResponse DescribeGlobalWorkflowDs(DescribeGlobalWorkflowDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGlobalWorkflowDs", DescribeGlobalWorkflowDsResponse.class);
    }

    /**
     *查询可导入的集成任务
     * @param req DescribeImportableOfflineTaskRequest
     * @return DescribeImportableOfflineTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImportableOfflineTaskResponse DescribeImportableOfflineTask(DescribeImportableOfflineTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImportableOfflineTask", DescribeImportableOfflineTaskResponse.class);
    }

    /**
     *获取采集器列表
     * @param req DescribeInLongAgentListRequest
     * @return DescribeInLongAgentListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInLongAgentListResponse DescribeInLongAgentList(DescribeInLongAgentListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInLongAgentList", DescribeInLongAgentListResponse.class);
    }

    /**
     *查询采集器关联的任务列表
     * @param req DescribeInLongAgentTaskListRequest
     * @return DescribeInLongAgentTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInLongAgentTaskListResponse DescribeInLongAgentTaskList(DescribeInLongAgentTaskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInLongAgentTaskList", DescribeInLongAgentTaskListResponse.class);
    }

    /**
     *获取采集器所在集群的VPC列表
     * @param req DescribeInLongAgentVpcListRequest
     * @return DescribeInLongAgentVpcListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInLongAgentVpcListResponse DescribeInLongAgentVpcList(DescribeInLongAgentVpcListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInLongAgentVpcList", DescribeInLongAgentVpcListResponse.class);
    }

    /**
     *获取TKE集群列表
     * @param req DescribeInLongTkeClusterListRequest
     * @return DescribeInLongTkeClusterListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInLongTkeClusterListResponse DescribeInLongTkeClusterList(DescribeInLongTkeClusterListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInLongTkeClusterList", DescribeInLongTkeClusterListResponse.class);
    }

    /**
     *基于任务类型获取任务信息Ds
     * @param req DescribeInfoTransByTypeIdDsRequest
     * @return DescribeInfoTransByTypeIdDsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInfoTransByTypeIdDsResponse DescribeInfoTransByTypeIdDs(DescribeInfoTransByTypeIdDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInfoTransByTypeIdDs", DescribeInfoTransByTypeIdDsResponse.class);
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
     *实例状态周期增长趋势
     * @param req DescribeInstanceByCycleReportRequest
     * @return DescribeInstanceByCycleReportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceByCycleReportResponse DescribeInstanceByCycleReport(DescribeInstanceByCycleReportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceByCycleReport", DescribeInstanceByCycleReportResponse.class);
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
     *下载日志文件，返回日志URL
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
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
获取实例日志列表
     * @param req DescribeInstanceLogsRequest
     * @return DescribeInstanceLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceLogsResponse DescribeInstanceLogs(DescribeInstanceLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceLogs", DescribeInstanceLogsResponse.class);
    }

    /**
     *数据质量，查询调度任务的实例列表
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstances", DescribeInstancesResponse.class);
    }

    /**
     *拉取实例列表，join task表一些信息
     * @param req DescribeInstancesInfoWithTaskInfoRequest
     * @return DescribeInstancesInfoWithTaskInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesInfoWithTaskInfoResponse DescribeInstancesInfoWithTaskInfo(DescribeInstancesInfoWithTaskInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstancesInfoWithTaskInfo", DescribeInstancesInfoWithTaskInfoResponse.class);
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
     *数据集成大屏采集器状态分布统计
     * @param req DescribeIntegrationStatisticsAgentStatusRequest
     * @return DescribeIntegrationStatisticsAgentStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIntegrationStatisticsAgentStatusResponse DescribeIntegrationStatisticsAgentStatus(DescribeIntegrationStatisticsAgentStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIntegrationStatisticsAgentStatus", DescribeIntegrationStatisticsAgentStatusResponse.class);
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
     *获取协同编辑资源锁
     * @param req DescribeLockRequest
     * @return DescribeLockResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLockResponse DescribeLock(DescribeLockRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLock", DescribeLockResponse.class);
    }

    /**
     *分页查询质量监控组
     * @param req DescribeMonitorsByPageRequest
     * @return DescribeMonitorsByPageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMonitorsByPageResponse DescribeMonitorsByPage(DescribeMonitorsByPageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMonitorsByPage", DescribeMonitorsByPageResponse.class);
    }

    /**
     *新获取SQL执行结果
     * @param req DescribeNewSqlTaskResultRequest
     * @return DescribeNewSqlTaskResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNewSqlTaskResultResponse DescribeNewSqlTaskResult(DescribeNewSqlTaskResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNewSqlTaskResult", DescribeNewSqlTaskResultResponse.class);
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
     *任务运维搜索 查询生产态任务数据源列表
     * @param req DescribeOperateOpsTaskDatasourceRequest
     * @return DescribeOperateOpsTaskDatasourceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOperateOpsTaskDatasourceResponse DescribeOperateOpsTaskDatasource(DescribeOperateOpsTaskDatasourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOperateOpsTaskDatasource", DescribeOperateOpsTaskDatasourceResponse.class);
    }

    /**
     *任务运维-查询生产态任务数据源类型列表
     * @param req DescribeOperateOpsTaskDatasourceTypeRequest
     * @return DescribeOperateOpsTaskDatasourceTypeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOperateOpsTaskDatasourceTypeResponse DescribeOperateOpsTaskDatasourceType(DescribeOperateOpsTaskDatasourceTypeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOperateOpsTaskDatasourceType", DescribeOperateOpsTaskDatasourceTypeResponse.class);
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
     *任务运维列表组合条件查询
     * @param req DescribeOperateTasksRequest
     * @return DescribeOperateTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOperateTasksResponse DescribeOperateTasks(DescribeOperateTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOperateTasks", DescribeOperateTasksResponse.class);
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
     *查询任务父依赖
     * @param req DescribeParentTaskRequest
     * @return DescribeParentTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeParentTaskResponse DescribeParentTask(DescribeParentTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeParentTask", DescribeParentTaskResponse.class);
    }

    /**
     *开发空间-拉取完整目录树
     * @param req DescribePathTreesRequest
     * @return DescribePathTreesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePathTreesResponse DescribePathTrees(DescribePathTreesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePathTrees", DescribePathTreesResponse.class);
    }

    /**
     *数据质量获取生产调度任务列表
     * @param req DescribeProdTasksRequest
     * @return DescribeProdTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProdTasksResponse DescribeProdTasks(DescribeProdTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProdTasks", DescribeProdTasksResponse.class);
    }

    /**
     *获取工作流画布信息
     * @param req DescribeProdWorkflowCanvasInfoDsRequest
     * @return DescribeProdWorkflowCanvasInfoDsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProdWorkflowCanvasInfoDsResponse DescribeProdWorkflowCanvasInfoDs(DescribeProdWorkflowCanvasInfoDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProdWorkflowCanvasInfoDs", DescribeProdWorkflowCanvasInfoDsResponse.class);
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
     *查询项目全局参数
     * @param req DescribeProjectParamDsRequest
     * @return DescribeProjectParamDsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectParamDsResponse DescribeProjectParamDs(DescribeProjectParamDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProjectParamDs", DescribeProjectParamDsResponse.class);
    }

    /**
     *查询项目全局参数
     * @param req DescribeProjectParamDsPageRequest
     * @return DescribeProjectParamDsPageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectParamDsPageResponse DescribeProjectParamDsPage(DescribeProjectParamDsPageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProjectParamDsPage", DescribeProjectParamDsPageResponse.class);
    }

    /**
     *查询项目参数历史版本
     * @param req DescribeProjectParamVersionDsRequest
     * @return DescribeProjectParamVersionDsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectParamVersionDsResponse DescribeProjectParamVersionDs(DescribeProjectParamVersionDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProjectParamVersionDs", DescribeProjectParamVersionDsResponse.class);
    }

    /**
     *拉取项目参数版本详情
     * @param req DescribeProjectParamVersionInfoDsRequest
     * @return DescribeProjectParamVersionInfoDsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectParamVersionInfoDsResponse DescribeProjectParamVersionInfoDs(DescribeProjectParamVersionInfoDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProjectParamVersionInfoDs", DescribeProjectParamVersionInfoDsResponse.class);
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
     *即席分析-获取任务列表
     * @param req DescribeRecordListRequest
     * @return DescribeRecordListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordListResponse DescribeRecordList(DescribeRecordListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRecordList", DescribeRecordListResponse.class);
    }

    /**
     *获取回收站任务详情
     * @param req DescribeRecycleTaskDetailRequest
     * @return DescribeRecycleTaskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecycleTaskDetailResponse DescribeRecycleTaskDetail(DescribeRecycleTaskDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRecycleTaskDetail", DescribeRecycleTaskDetailResponse.class);
    }

    /**
     *查询回收站任务列表
     * @param req DescribeRecycleTaskListRequest
     * @return DescribeRecycleTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecycleTaskListResponse DescribeRecycleTaskList(DescribeRecycleTaskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRecycleTaskList", DescribeRecycleTaskListResponse.class);
    }

    /**
     *查询任务实例的关联实例列表
     * @param req DescribeRelatedInstancesRequest
     * @return DescribeRelatedInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRelatedInstancesResponse DescribeRelatedInstances(DescribeRelatedInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRelatedInstances", DescribeRelatedInstancesResponse.class);
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
     *查询质量规则数据源
     * @param req DescribeRuleDataSourcesRequest
     * @return DescribeRuleDataSourcesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleDataSourcesResponse DescribeRuleDataSources(DescribeRuleDataSourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRuleDataSources", DescribeRuleDataSourcesResponse.class);
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
     *查询规则执行导出结果
     * @param req DescribeRuleExecExportResultRequest
     * @return DescribeRuleExecExportResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleExecExportResultResponse DescribeRuleExecExportResult(DescribeRuleExecExportResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRuleExecExportResult", DescribeRuleExecExportResultResponse.class);
    }

    /**
     *查询规则执行历史， 最近30条
     * @param req DescribeRuleExecHistoryRequest
     * @return DescribeRuleExecHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleExecHistoryResponse DescribeRuleExecHistory(DescribeRuleExecHistoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRuleExecHistory", DescribeRuleExecHistoryResponse.class);
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
     *分页查询规则执行结果列表
     * @param req DescribeRuleExecResultsByPageRequest
     * @return DescribeRuleExecResultsByPageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleExecResultsByPageResponse DescribeRuleExecResultsByPage(DescribeRuleExecResultsByPageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRuleExecResultsByPage", DescribeRuleExecResultsByPageResponse.class);
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
     *规则组执行结果分页查询接口不带鉴权
     * @param req DescribeRuleGroupExecResultsByPageWithoutAuthRequest
     * @return DescribeRuleGroupExecResultsByPageWithoutAuthResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleGroupExecResultsByPageWithoutAuthResponse DescribeRuleGroupExecResultsByPageWithoutAuth(DescribeRuleGroupExecResultsByPageWithoutAuthRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRuleGroupExecResultsByPageWithoutAuth", DescribeRuleGroupExecResultsByPageWithoutAuthResponse.class);
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
     *过滤条件【必要字段】{ruleId}
     * @param req DescribeRuleHistoryByPageRequest
     * @return DescribeRuleHistoryByPageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleHistoryByPageResponse DescribeRuleHistoryByPage(DescribeRuleHistoryByPageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRuleHistoryByPage", DescribeRuleHistoryByPageResponse.class);
    }

    /**
     *获取表列表
     * @param req DescribeRuleTablesByPageRequest
     * @return DescribeRuleTablesByPageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleTablesByPageResponse DescribeRuleTablesByPage(DescribeRuleTablesByPageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRuleTablesByPage", DescribeRuleTablesByPageResponse.class);
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
     *查询规则模版列表
     * @param req DescribeRuleTemplatesRequest
     * @return DescribeRuleTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleTemplatesResponse DescribeRuleTemplates(DescribeRuleTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRuleTemplates", DescribeRuleTemplatesResponse.class);
    }

    /**
     *过滤条件】 {模版名称Name,支持模糊匹配} {模版类型type，1.系统模版 2.自定义模版} {质量检测维度QualityDims, 1.准确性 2.唯一性 3.完整性 4.一致性 5.及时性 6.有效性} 【排序字段】 { 引用数排序类型CitationOrderType，根据引用数量排序 ASC DESC}
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
     *在基线系统内查询单个调度任务实例
     * @param req DescribeScheduleInstanceRequest
     * @return DescribeScheduleInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScheduleInstanceResponse DescribeScheduleInstance(DescribeScheduleInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScheduleInstance", DescribeScheduleInstanceResponse.class);
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
     *获取脚本导出任务类型
     * @param req DescribeScriptsImportTaskTypeRequest
     * @return DescribeScriptsImportTaskTypeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScriptsImportTaskTypeResponse DescribeScriptsImportTaskType(DescribeScriptsImportTaskTypeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScriptsImportTaskType", DescribeScriptsImportTaskTypeResponse.class);
    }

    /**
     *获取关联子实例
     * @param req DescribeSonInstancesRequest
     * @return DescribeSonInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSonInstancesResponse DescribeSonInstances(DescribeSonInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSonInstances", DescribeSonInstancesResponse.class);
    }

    /**
     *获取SQL执行结果
     * @param req DescribeSqlTaskResultRequest
     * @return DescribeSqlTaskResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSqlTaskResultResponse DescribeSqlTaskResult(DescribeSqlTaskResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSqlTaskResult", DescribeSqlTaskResultResponse.class);
    }

    /**
     *获取数据标准规则详情
     * @param req DescribeStandardRuleDetailInfoListRequest
     * @return DescribeStandardRuleDetailInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStandardRuleDetailInfoListResponse DescribeStandardRuleDetailInfoList(DescribeStandardRuleDetailInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStandardRuleDetailInfoList", DescribeStandardRuleDetailInfoListResponse.class);
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
     *获取任务绑定的虚拟任务
     * @param req DescribeTaskBindVirtualTaskRequest
     * @return DescribeTaskBindVirtualTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskBindVirtualTaskResponse DescribeTaskBindVirtualTask(DescribeTaskBindVirtualTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskBindVirtualTask", DescribeTaskBindVirtualTaskResponse.class);
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
     *任务状态周期增长趋势
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
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
查询任务具体详情
     * @param req DescribeTaskDetailRequest
     * @return DescribeTaskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskDetailResponse DescribeTaskDetail(DescribeTaskDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskDetail", DescribeTaskDetailResponse.class);
    }

    /**
     *查询任务具体详情Ds
     * @param req DescribeTaskDetailDsRequest
     * @return DescribeTaskDetailDsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskDetailDsResponse DescribeTaskDetailDs(DescribeTaskDetailDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskDetailDs", DescribeTaskDetailDsResponse.class);
    }

    /**
     *查询任务输入参数
     * @param req DescribeTaskInParamDsRequest
     * @return DescribeTaskInParamDsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskInParamDsResponse DescribeTaskInParamDs(DescribeTaskInParamDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskInParamDs", DescribeTaskInParamDsResponse.class);
    }

    /**
     *离线任务实例详情
     * @param req DescribeTaskInstanceRequest
     * @return DescribeTaskInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskInstanceResponse DescribeTaskInstance(DescribeTaskInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskInstance", DescribeTaskInstanceResponse.class);
    }

    /**
     *离线任务实例统计明细
     * @param req DescribeTaskInstanceReportDetailRequest
     * @return DescribeTaskInstanceReportDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskInstanceReportDetailResponse DescribeTaskInstanceReportDetail(DescribeTaskInstanceReportDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskInstanceReportDetail", DescribeTaskInstanceReportDetailResponse.class);
    }

    /**
     *查询任务实例列表
     * @param req DescribeTaskInstancesRequest
     * @return DescribeTaskInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskInstancesResponse DescribeTaskInstances(DescribeTaskInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskInstances", DescribeTaskInstancesResponse.class);
    }

    /**
     *通过指定基准时间，计算出最近一次任务基于该基准时间的运行时间
     * @param req DescribeTaskLatestRunTimeRequest
     * @return DescribeTaskLatestRunTimeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskLatestRunTimeResponse DescribeTaskLatestRunTime(DescribeTaskLatestRunTimeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskLatestRunTime", DescribeTaskLatestRunTimeResponse.class);
    }

    /**
     *基于条件翻页获取任务列表, 用于新建跨工作流任务场景中展示工作流列表操作
     * @param req DescribeTaskListByConditionDsRequest
     * @return DescribeTaskListByConditionDsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskListByConditionDsResponse DescribeTaskListByConditionDs(DescribeTaskListByConditionDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskListByConditionDs", DescribeTaskListByConditionDsResponse.class);
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
     *查询任务输出参数
     * @param req DescribeTaskOutParamDsRequest
     * @return DescribeTaskOutParamDsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskOutParamDsResponse DescribeTaskOutParamDs(DescribeTaskOutParamDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskOutParamDs", DescribeTaskOutParamDsResponse.class);
    }

    /**
     *获取指定任务产出登记列表
     * @param req DescribeTaskOutputRegistriesRequest
     * @return DescribeTaskOutputRegistriesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskOutputRegistriesResponse DescribeTaskOutputRegistries(DescribeTaskOutputRegistriesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskOutputRegistries", DescribeTaskOutputRegistriesResponse.class);
    }

    /**
     *查询任务引用参数
     * @param req DescribeTaskParamDsRequest
     * @return DescribeTaskParamDsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskParamDsResponse DescribeTaskParamDs(DescribeTaskParamDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskParamDs", DescribeTaskParamDsResponse.class);
    }

    /**
     *基于当前任务的数据时间计算依赖的上游任务数据时间
     * @param req DescribeTaskParentRunTimeRequest
     * @return DescribeTaskParentRunTimeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskParentRunTimeResponse DescribeTaskParentRunTime(DescribeTaskParentRunTimeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskParentRunTime", DescribeTaskParentRunTimeResponse.class);
    }

    /**
     *按起止日期统计离线任务的所有实例的运行指标总和
     * @param req DescribeTaskReportRequest
     * @return DescribeTaskReportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskReportResponse DescribeTaskReport(DescribeTaskReportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskReport", DescribeTaskReportResponse.class);
    }

    /**
     *离线任务周期统计明细
     * @param req DescribeTaskReportDetailListRequest
     * @return DescribeTaskReportDetailListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskReportDetailListResponse DescribeTaskReportDetailList(DescribeTaskReportDetailListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskReportDetailList", DescribeTaskReportDetailListResponse.class);
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
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
查询任务脚本
     * @param req DescribeTaskScriptRequest
     * @return DescribeTaskScriptResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskScriptResponse DescribeTaskScript(DescribeTaskScriptRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskScript", DescribeTaskScriptResponse.class);
    }

    /**
     *根据脚本类型获取任务类型
     * @param req DescribeTaskTypeByScriptTypeRequest
     * @return DescribeTaskTypeByScriptTypeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskTypeByScriptTypeResponse DescribeTaskTypeByScriptType(DescribeTaskTypeByScriptTypeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskTypeByScriptType", DescribeTaskTypeByScriptTypeResponse.class);
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
根据工作流分页查询任务
     * @param req DescribeTasksByPageRequest
     * @return DescribeTasksByPageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTasksByPageResponse DescribeTasksByPage(DescribeTasksByPageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTasksByPage", DescribeTasksByPageResponse.class);
    }

    /**
     *任务信息查询-项目克隆使用
     * @param req DescribeTasksForProjectCloneRequest
     * @return DescribeTasksForProjectCloneResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTasksForProjectCloneResponse DescribeTasksForProjectClone(DescribeTasksForProjectCloneRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTasksForProjectClone", DescribeTasksForProjectCloneResponse.class);
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
     *查询规则模板操作记录
     * @param req DescribeTemplateHistoryRequest
     * @return DescribeTemplateHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTemplateHistoryResponse DescribeTemplateHistory(DescribeTemplateHistoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTemplateHistory", DescribeTemplateHistoryResponse.class);
    }

    /**
     *获取etl测试运行任务执行状态和日志
     * @param req DescribeTestRunRequest
     * @return DescribeTestRunResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTestRunResponse DescribeTestRun(DescribeTestRunRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTestRun", DescribeTestRunResponse.class);
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
     *获取长连接Token
     * @param req DescribeTokenRequest
     * @return DescribeTokenResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTokenResponse DescribeToken(DescribeTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeToken", DescribeTokenResponse.class);
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
     *根据文件夹查询工作流
     * @param req DescribeWorkflowByFordIdsRequest
     * @return DescribeWorkflowByFordIdsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkflowByFordIdsResponse DescribeWorkflowByFordIds(DescribeWorkflowByFordIdsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWorkflowByFordIds", DescribeWorkflowByFordIdsResponse.class);
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
     *数据开发-获取工作流画布信息
     * @param req DescribeWorkflowCanvasInfoDsRequest
     * @return DescribeWorkflowCanvasInfoDsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkflowCanvasInfoDsResponse DescribeWorkflowCanvasInfoDs(DescribeWorkflowCanvasInfoDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWorkflowCanvasInfoDs", DescribeWorkflowCanvasInfoDsResponse.class);
    }

    /**
     *获取工作流操作日志
     * @param req DescribeWorkflowCanvasOpLogsRequest
     * @return DescribeWorkflowCanvasOpLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkflowCanvasOpLogsResponse DescribeWorkflowCanvasOpLogs(DescribeWorkflowCanvasOpLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWorkflowCanvasOpLogs", DescribeWorkflowCanvasOpLogsResponse.class);
    }

    /**
     *获取工作流画布操作人列表
     * @param req DescribeWorkflowCanvasOperatorsRequest
     * @return DescribeWorkflowCanvasOperatorsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkflowCanvasOperatorsResponse DescribeWorkflowCanvasOperators(DescribeWorkflowCanvasOperatorsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWorkflowCanvasOperators", DescribeWorkflowCanvasOperatorsResponse.class);
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
     *工作流信息查询-项目克隆使用
     * @param req DescribeWorkflowForProjectCloneRequest
     * @return DescribeWorkflowForProjectCloneResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkflowForProjectCloneResponse DescribeWorkflowForProjectClone(DescribeWorkflowForProjectCloneRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWorkflowForProjectClone", DescribeWorkflowForProjectCloneResponse.class);
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
     *查询运维画布信息，只需要获取边和节点
     * @param req DescribeWorkflowOpsCanvasInfoRequest
     * @return DescribeWorkflowOpsCanvasInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkflowOpsCanvasInfoResponse DescribeWorkflowOpsCanvasInfo(DescribeWorkflowOpsCanvasInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWorkflowOpsCanvasInfo", DescribeWorkflowOpsCanvasInfoResponse.class);
    }

    /**
     *查询工作流全局参数
     * @param req DescribeWorkflowParamDsRequest
     * @return DescribeWorkflowParamDsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkflowParamDsResponse DescribeWorkflowParamDs(DescribeWorkflowParamDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWorkflowParamDs", DescribeWorkflowParamDsResponse.class);
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
     *工作流任务信息查询-项目克隆使用
     * @param req DescribeWorkflowTasksForProjectCloneRequest
     * @return DescribeWorkflowTasksForProjectCloneResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkflowTasksForProjectCloneResponse DescribeWorkflowTasksForProjectClone(DescribeWorkflowTasksForProjectCloneRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWorkflowTasksForProjectClone", DescribeWorkflowTasksForProjectCloneResponse.class);
    }

    /**
     *实例诊断信息
     * @param req DiagnosePlusRequest
     * @return DiagnosePlusResponse
     * @throws TencentCloudSDKException
     */
    public DiagnosePlusResponse DiagnosePlus(DiagnosePlusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DiagnosePlus", DiagnosePlusResponse.class);
    }

    /**
     *下载SQL执行结果
     * @param req DownloadNewSqlResultRequest
     * @return DownloadNewSqlResultResponse
     * @throws TencentCloudSDKException
     */
    public DownloadNewSqlResultResponse DownloadNewSqlResult(DownloadNewSqlResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DownloadNewSqlResult", DownloadNewSqlResultResponse.class);
    }

    /**
     *下载SQL执行结果
     * @param req DownloadSqlResultRequest
     * @return DownloadSqlResultResponse
     * @throws TencentCloudSDKException
     */
    public DownloadSqlResultResponse DownloadSqlResult(DownloadSqlResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DownloadSqlResult", DownloadSqlResultResponse.class);
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
     *编辑基线
     * @param req EditBaselineRequest
     * @return EditBaselineResponse
     * @throws TencentCloudSDKException
     */
    public EditBaselineResponse EditBaseline(EditBaselineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EditBaseline", EditBaselineResponse.class);
    }

    /**
     *事件管理-导出事件
     * @param req ExportDsEventRequest
     * @return ExportDsEventResponse
     * @throws TencentCloudSDKException
     */
    public ExportDsEventResponse ExportDsEvent(ExportDsEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportDsEvent", ExportDsEventResponse.class);
    }

    /**
     *批量导出文件
     * @param req ExportFilesRequest
     * @return ExportFilesResponse
     * @throws TencentCloudSDKException
     */
    public ExportFilesResponse ExportFiles(ExportFilesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportFiles", ExportFilesResponse.class);
    }

    /**
     *导出项目参数
     * @param req ExportProjectParamDsRequest
     * @return ExportProjectParamDsResponse
     * @throws TencentCloudSDKException
     */
    public ExportProjectParamDsResponse ExportProjectParamDs(ExportProjectParamDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportProjectParamDs", ExportProjectParamDsResponse.class);
    }

    /**
     *导出工作流(XML格式)，导出的文件存储在 cos 中(私有化 csp)，请自行下载，相关的下载信息在返回值中可以获取到
     * @param req ExportWorkflowXmlRequest
     * @return ExportWorkflowXmlResponse
     * @throws TencentCloudSDKException
     */
    public ExportWorkflowXmlResponse ExportWorkflowXml(ExportWorkflowXmlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportWorkflowXml", ExportWorkflowXmlResponse.class);
    }

    /**
     *导出工作流到 Zip 文件，导出的文件存储在 cos 中(私有化 csp)，请自行下载，相关的下载信息在返回值中可以获取到
     * @param req ExportWorkflowZipRequest
     * @return ExportWorkflowZipResponse
     * @throws TencentCloudSDKException
     */
    public ExportWorkflowZipResponse ExportWorkflowZip(ExportWorkflowZipRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportWorkflowZip", ExportWorkflowZipResponse.class);
    }

    /**
     *查找全部的文件夹
     * @param req FindAllFolderRequest
     * @return FindAllFolderResponse
     * @throws TencentCloudSDKException
     */
    public FindAllFolderResponse FindAllFolder(FindAllFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "FindAllFolder", FindAllFolderResponse.class);
    }

    /**
     *拉取下游依赖的任务列表Ds
     * @param req FindDependTaskListDsRequest
     * @return FindDependTaskListDsResponse
     * @throws TencentCloudSDKException
     */
    public FindDependTaskListDsResponse FindDependTaskListDs(FindDependTaskListDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "FindDependTaskListDs", FindDependTaskListDsResponse.class);
    }

    /**
     *批量拉取下游依赖的任务列表Ds
     * @param req FindDependTaskListsDsRequest
     * @return FindDependTaskListsDsResponse
     * @throws TencentCloudSDKException
     */
    public FindDependTaskListsDsResponse FindDependTaskListsDs(FindDependTaskListsDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "FindDependTaskListsDs", FindDependTaskListsDsResponse.class);
    }

    /**
     *编排空间-根据项目名称和任务名称模糊查询所有任务
     * @param req FindFuzzyTasksDsRequest
     * @return FindFuzzyTasksDsResponse
     * @throws TencentCloudSDKException
     */
    public FindFuzzyTasksDsResponse FindFuzzyTasksDs(FindFuzzyTasksDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "FindFuzzyTasksDs", FindFuzzyTasksDsResponse.class);
    }

    /**
     *远端路径寻找任务
     * @param req FindTaskByRemotePathRequest
     * @return FindTaskByRemotePathResponse
     * @throws TencentCloudSDKException
     */
    public FindTaskByRemotePathResponse FindTaskByRemotePath(FindTaskByRemotePathRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "FindTaskByRemotePath", FindTaskByRemotePathResponse.class);
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
实例批量置成功
     * @param req ForceSucInstancesRequest
     * @return ForceSucInstancesResponse
     * @throws TencentCloudSDKException
     */
    public ForceSucInstancesResponse ForceSucInstances(ForceSucInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ForceSucInstances", ForceSucInstancesResponse.class);
    }

    /**
     *实例强制成功
     * @param req ForceSucScheduleInstancesRequest
     * @return ForceSucScheduleInstancesResponse
     * @throws TencentCloudSDKException
     */
    public ForceSucScheduleInstancesResponse ForceSucScheduleInstances(ForceSucScheduleInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ForceSucScheduleInstances", ForceSucScheduleInstancesResponse.class);
    }

    /**
     *任务运维-批量冻结任务
     * @param req FreezeOpsTasksRequest
     * @return FreezeOpsTasksResponse
     * @throws TencentCloudSDKException
     */
    public FreezeOpsTasksResponse FreezeOpsTasks(FreezeOpsTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "FreezeOpsTasks", FreezeOpsTasksResponse.class);
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
批量冻结任务
     * @param req FreezeTasksRequest
     * @return FreezeTasksResponse
     * @throws TencentCloudSDKException
     */
    public FreezeTasksResponse FreezeTasks(FreezeTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "FreezeTasks", FreezeTasksResponse.class);
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
基于多个工作流进行批量冻结任务操作
     * @param req FreezeTasksByMultiWorkflowRequest
     * @return FreezeTasksByMultiWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public FreezeTasksByMultiWorkflowResponse FreezeTasksByMultiWorkflow(FreezeTasksByMultiWorkflowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "FreezeTasksByMultiWorkflow", FreezeTasksByMultiWorkflowResponse.class);
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
     *获取高级运行参数
     * @param req GetAdvanceRunParamsRequest
     * @return GetAdvanceRunParamsResponse
     * @throws TencentCloudSDKException
     */
    public GetAdvanceRunParamsResponse GetAdvanceRunParams(GetAdvanceRunParamsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetAdvanceRunParams", GetAdvanceRunParamsResponse.class);
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
     *开发空间获取最近一次测试运行记录信息
     * @param req GetLatestAnalyseInfoRequest
     * @return GetLatestAnalyseInfoResponse
     * @throws TencentCloudSDKException
     */
    public GetLatestAnalyseInfoResponse GetLatestAnalyseInfo(GetLatestAnalyseInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetLatestAnalyseInfo", GetLatestAnalyseInfoResponse.class);
    }

    /**
     *编排空间获取最近一次测试运行记录信息
     * @param req GetLatestTestRunInfoRequest
     * @return GetLatestTestRunInfoResponse
     * @throws TencentCloudSDKException
     */
    public GetLatestTestRunInfoResponse GetLatestTestRunInfo(GetLatestTestRunInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetLatestTestRunInfo", GetLatestTestRunInfoResponse.class);
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
     *回收站脚本文件目录树
     * @param req GetPathTreesRequest
     * @return GetPathTreesResponse
     * @throws TencentCloudSDKException
     */
    public GetPathTreesResponse GetPathTrees(GetPathTreesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetPathTrees", GetPathTreesResponse.class);
    }

    /**
     *资源管理-获取资源上传的可用 cos 路径
     * @param req GetResourceCosPathRequest
     * @return GetResourceCosPathResponse
     * @throws TencentCloudSDKException
     */
    public GetResourceCosPathResponse GetResourceCosPath(GetResourceCosPathRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetResourceCosPath", GetResourceCosPathResponse.class);
    }

    /**
     *资源管理-拉取资源目录树
     * @param req GetResourcePathTreeRequest
     * @return GetResourcePathTreeResponse
     * @throws TencentCloudSDKException
     */
    public GetResourcePathTreeResponse GetResourcePathTree(GetResourcePathTreeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetResourcePathTree", GetResourcePathTreeResponse.class);
    }

    /**
     *获取工作流运行任务下游Ds
     * @param req GetRunSonListDsRequest
     * @return GetRunSonListDsResponse
     * @throws TencentCloudSDKException
     */
    public GetRunSonListDsResponse GetRunSonListDs(GetRunSonListDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetRunSonListDs", GetRunSonListDsResponse.class);
    }

    /**
     *获取调试任务实例状态信息
     * @param req GetTestRunTaskInstancesStatusInfoRequest
     * @return GetTestRunTaskInstancesStatusInfoResponse
     * @throws TencentCloudSDKException
     */
    public GetTestRunTaskInstancesStatusInfoResponse GetTestRunTaskInstancesStatusInfo(GetTestRunTaskInstancesStatusInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTestRunTaskInstancesStatusInfo", GetTestRunTaskInstancesStatusInfoResponse.class);
    }

    /**
     *协同编辑资源锁心跳
     * @param req HeartBeatRequest
     * @return HeartBeatResponse
     * @throws TencentCloudSDKException
     */
    public HeartBeatResponse HeartBeat(HeartBeatRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "HeartBeat", HeartBeatResponse.class);
    }

    /**
     *事件管理-导入事件
     * @param req ImportDsEventRequest
     * @return ImportDsEventResponse
     * @throws TencentCloudSDKException
     */
    public ImportDsEventResponse ImportDsEvent(ImportDsEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImportDsEvent", ImportDsEventResponse.class);
    }

    /**
     *批量导入文件
     * @param req ImportFilesRequest
     * @return ImportFilesResponse
     * @throws TencentCloudSDKException
     */
    public ImportFilesResponse ImportFiles(ImportFilesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImportFiles", ImportFilesResponse.class);
    }

    /**
     *异步导入集成任务
     * @param req ImportOfflineTaskRequest
     * @return ImportOfflineTaskResponse
     * @throws TencentCloudSDKException
     */
    public ImportOfflineTaskResponse ImportOfflineTask(ImportOfflineTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImportOfflineTask", ImportOfflineTaskResponse.class);
    }

    /**
     *导入项目参数
     * @param req ImportProjectParamDsRequest
     * @return ImportProjectParamDsResponse
     * @throws TencentCloudSDKException
     */
    public ImportProjectParamDsResponse ImportProjectParamDs(ImportProjectParamDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImportProjectParamDs", ImportProjectParamDsResponse.class);
    }

    /**
     *创建数据表：HIVE
     * @param req ImportTableDataRequest
     * @return ImportTableDataResponse
     * @throws TencentCloudSDKException
     */
    public ImportTableDataResponse ImportTableData(ImportTableDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImportTableData", ImportTableDataResponse.class);
    }

    /**
     *工作流导入（XML）
     * @param req ImportWorkflowXmlRequest
     * @return ImportWorkflowXmlResponse
     * @throws TencentCloudSDKException
     */
    public ImportWorkflowXmlResponse ImportWorkflowXml(ImportWorkflowXmlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImportWorkflowXml", ImportWorkflowXmlResponse.class);
    }

    /**
     *工作流导入（ZIP）
     * @param req ImportWorkflowZipRequest
     * @return ImportWorkflowZipResponse
     * @throws TencentCloudSDKException
     */
    public ImportWorkflowZipResponse ImportWorkflowZip(ImportWorkflowZipRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImportWorkflowZip", ImportWorkflowZipResponse.class);
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
     *任务是否存在监听事件
     * @param req JudgeTaskListenEventRequest
     * @return JudgeTaskListenEventResponse
     * @throws TencentCloudSDKException
     */
    public JudgeTaskListenEventResponse JudgeTaskListenEvent(JudgeTaskListenEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "JudgeTaskListenEvent", JudgeTaskListenEventResponse.class);
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
实例批量终止操作
     * @param req KillInstancesRequest
     * @return KillInstancesResponse
     * @throws TencentCloudSDKException
     */
    public KillInstancesResponse KillInstances(KillInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "KillInstances", KillInstancesResponse.class);
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
     *批量kill实例
     * @param req KillScheduleInstancesRequest
     * @return KillScheduleInstancesResponse
     * @throws TencentCloudSDKException
     */
    public KillScheduleInstancesResponse KillScheduleInstances(KillScheduleInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "KillScheduleInstances", KillScheduleInstancesResponse.class);
    }

    /**
     *停止试运行任务（多个）
     * @param req KillTasksTestRunRequest
     * @return KillTasksTestRunResponse
     * @throws TencentCloudSDKException
     */
    public KillTasksTestRunResponse KillTasksTestRun(KillTasksTestRunRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "KillTasksTestRun", KillTasksTestRunResponse.class);
    }

    /**
     *获取操作详情列表
     * @param req ListBatchDetailRequest
     * @return ListBatchDetailResponse
     * @throws TencentCloudSDKException
     */
    public ListBatchDetailResponse ListBatchDetail(ListBatchDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListBatchDetail", ListBatchDetailResponse.class);
    }

    /**
     *获取操作历史列表
     * @param req ListBatchJobRequest
     * @return ListBatchJobResponse
     * @throws TencentCloudSDKException
     */
    public ListBatchJobResponse ListBatchJob(ListBatchJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListBatchJob", ListBatchJobResponse.class);
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
     *任务批量补录，调度状态任务才可以补录；
     * @param req MakeUpOpsTasksRequest
     * @return MakeUpOpsTasksResponse
     * @throws TencentCloudSDKException
     */
    public MakeUpOpsTasksResponse MakeUpOpsTasks(MakeUpOpsTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "MakeUpOpsTasks", MakeUpOpsTasksResponse.class);
    }

    /**
     *工作流补数据
     * @param req MakeUpTasksByWorkflowRequest
     * @return MakeUpTasksByWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public MakeUpTasksByWorkflowResponse MakeUpTasksByWorkflow(MakeUpTasksByWorkflowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "MakeUpTasksByWorkflow", MakeUpTasksByWorkflowResponse.class);
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
任务批量补录，调度状态任务才可以补录；



     * @param req MakeUpTasksNewRequest
     * @return MakeUpTasksNewResponse
     * @throws TencentCloudSDKException
     */
    public MakeUpTasksNewResponse MakeUpTasksNew(MakeUpTasksNewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "MakeUpTasksNew", MakeUpTasksNewResponse.class);
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
工作流下所有任务的补录
     * @param req MakeUpWorkflowNewRequest
     * @return MakeUpWorkflowNewResponse
     * @throws TencentCloudSDKException
     */
    public MakeUpWorkflowNewResponse MakeUpWorkflowNew(MakeUpWorkflowNewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "MakeUpWorkflowNew", MakeUpWorkflowNewResponse.class);
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
     *编辑基线告警状态
     * @param req ModifyBaselineAlarmStatusRequest
     * @return ModifyBaselineAlarmStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBaselineAlarmStatusResponse ModifyBaselineAlarmStatus(ModifyBaselineAlarmStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBaselineAlarmStatus", ModifyBaselineAlarmStatusResponse.class);
    }

    /**
     *编辑基线实例中任务告警状态
     * @param req ModifyBaselineTaskAlarmStatusRequest
     * @return ModifyBaselineTaskAlarmStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBaselineTaskAlarmStatusResponse ModifyBaselineTaskAlarmStatus(ModifyBaselineTaskAlarmStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBaselineTaskAlarmStatus", ModifyBaselineTaskAlarmStatusResponse.class);
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
修改数据源
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
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
文件夹更新
     * @param req ModifyFolderRequest
     * @return ModifyFolderResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFolderResponse ModifyFolder(ModifyFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyFolder", ModifyFolderResponse.class);
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
     *编排空间-工作流-创建任务文件夹
     * @param req ModifyTaskFolderRequest
     * @return ModifyTaskFolderResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTaskFolderResponse ModifyTaskFolder(ModifyTaskFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTaskFolder", ModifyTaskFolderResponse.class);
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
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
     *更新任务Ds
     * @param req ModifyTaskInfoDsRequest
     * @return ModifyTaskInfoDsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTaskInfoDsResponse ModifyTaskInfoDs(ModifyTaskInfoDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTaskInfoDs", ModifyTaskInfoDsResponse.class);
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
添加父任务依赖
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
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
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
     *修改任务脚本Ds
     * @param req ModifyTaskScriptDsRequest
     * @return ModifyTaskScriptDsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTaskScriptDsResponse ModifyTaskScriptDs(ModifyTaskScriptDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTaskScriptDs", ModifyTaskScriptDsResponse.class);
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
更新工作流
     * @param req ModifyWorkflowInfoRequest
     * @return ModifyWorkflowInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWorkflowInfoResponse ModifyWorkflowInfo(ModifyWorkflowInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWorkflowInfo", ModifyWorkflowInfoResponse.class);
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
更新工作流调度
     * @param req ModifyWorkflowScheduleRequest
     * @return ModifyWorkflowScheduleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWorkflowScheduleResponse ModifyWorkflowSchedule(ModifyWorkflowScheduleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWorkflowSchedule", ModifyWorkflowScheduleResponse.class);
    }

    /**
     *移动文件
     * @param req MoveFileRequest
     * @return MoveFileResponse
     * @throws TencentCloudSDKException
     */
    public MoveFileResponse MoveFile(MoveFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "MoveFile", MoveFileResponse.class);
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
     *库表管理-新建数据表-csv预览，最多支持500行预览
     * @param req PreviewDataTableCsvRequest
     * @return PreviewDataTableCsvResponse
     * @throws TencentCloudSDKException
     */
    public PreviewDataTableCsvResponse PreviewDataTableCsv(PreviewDataTableCsvRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PreviewDataTableCsv", PreviewDataTableCsvResponse.class);
    }

    /**
     *查询工作流版本信息
     * @param req QueryWorkflowVersionRequest
     * @return QueryWorkflowVersionResponse
     * @throws TencentCloudSDKException
     */
    public QueryWorkflowVersionResponse QueryWorkflowVersion(QueryWorkflowVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryWorkflowVersion", QueryWorkflowVersionResponse.class);
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
     *注册事件监听者
     * @param req RegisterDsEventListenerRequest
     * @return RegisterDsEventListenerResponse
     * @throws TencentCloudSDKException
     */
    public RegisterDsEventListenerResponse RegisterDsEventListener(RegisterDsEventListenerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RegisterDsEventListener", RegisterDsEventListenerResponse.class);
    }

    /**
     *注册事件发布者
     * @param req RegisterDsEventPublisherRequest
     * @return RegisterDsEventPublisherResponse
     * @throws TencentCloudSDKException
     */
    public RegisterDsEventPublisherResponse RegisterDsEventPublisher(RegisterDsEventPublisherRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RegisterDsEventPublisher", RegisterDsEventPublisherResponse.class);
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
注册事件
     * @param req RegisterEventRequest
     * @return RegisterEventResponse
     * @throws TencentCloudSDKException
     */
    public RegisterEventResponse RegisterEvent(RegisterEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RegisterEvent", RegisterEventResponse.class);
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
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
     *释放协同编辑资源锁
     * @param req ReleaseLockRequest
     * @return ReleaseLockResponse
     * @throws TencentCloudSDKException
     */
    public ReleaseLockResponse ReleaseLock(ReleaseLockRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReleaseLock", ReleaseLockResponse.class);
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
     *重命名文件
     * @param req RenameFileRequest
     * @return RenameFileResponse
     * @throws TencentCloudSDKException
     */
    public RenameFileResponse RenameFile(RenameFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenameFile", RenameFileResponse.class);
    }

    /**
     *资源管理-重命名资源
     * @param req RenameResourceRequest
     * @return RenameResourceResponse
     * @throws TencentCloudSDKException
     */
    public RenameResourceResponse RenameResource(RenameResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenameResource", RenameResourceResponse.class);
    }

    /**
     *资源管理-重命名资源文件
     * @param req RenameResourceFileRequest
     * @return RenameResourceFileResponse
     * @throws TencentCloudSDKException
     */
    public RenameResourceFileResponse RenameResourceFile(RenameResourceFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenameResourceFile", RenameResourceFileResponse.class);
    }

    /**
     *资源管理-重命名资源目录
     * @param req RenameResourcePathRequest
     * @return RenameResourcePathResponse
     * @throws TencentCloudSDKException
     */
    public RenameResourcePathResponse RenameResourcePath(RenameResourcePathRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenameResourcePath", RenameResourcePathResponse.class);
    }

    /**
     *RenameTaskDs
     * @param req RenameTaskDsRequest
     * @return RenameTaskDsResponse
     * @throws TencentCloudSDKException
     */
    public RenameTaskDsResponse RenameTaskDs(RenameTaskDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenameTaskDs", RenameTaskDsResponse.class);
    }

    /**
     *更新工作流
     * @param req RenewWorkflowDsRequest
     * @return RenewWorkflowDsResponse
     * @throws TencentCloudSDKException
     */
    public RenewWorkflowDsResponse RenewWorkflowDs(RenewWorkflowDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenewWorkflowDs", RenewWorkflowDsResponse.class);
    }

    /**
     *移动文件夹
     * @param req RenewWorkflowFolderDsRequest
     * @return RenewWorkflowFolderDsResponse
     * @throws TencentCloudSDKException
     */
    public RenewWorkflowFolderDsResponse RenewWorkflowFolderDs(RenewWorkflowFolderDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenewWorkflowFolderDs", RenewWorkflowFolderDsResponse.class);
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
     *替换项目参数历史版本
     * @param req ReplaceProjectParamVersionDsRequest
     * @return ReplaceProjectParamVersionDsResponse
     * @throws TencentCloudSDKException
     */
    public ReplaceProjectParamVersionDsResponse ReplaceProjectParamVersionDs(ReplaceProjectParamVersionDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReplaceProjectParamVersionDs", ReplaceProjectParamVersionDsResponse.class);
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
实例批量重跑
     * @param req RerunInstancesRequest
     * @return RerunInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RerunInstancesResponse RerunInstances(RerunInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RerunInstances", RerunInstancesResponse.class);
    }

    /**
     *按补录计划批量重跑/选择补录计划→补录任务→补录实例，点击重跑
     * @param req RerunOpsMakePlanInstancesRequest
     * @return RerunOpsMakePlanInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RerunOpsMakePlanInstancesResponse RerunOpsMakePlanInstances(RerunOpsMakePlanInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RerunOpsMakePlanInstances", RerunOpsMakePlanInstancesResponse.class);
    }

    /**
     *实例批量重跑
     * @param req RerunScheduleInstancesRequest
     * @return RerunScheduleInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RerunScheduleInstancesResponse RerunScheduleInstances(RerunScheduleInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RerunScheduleInstances", RerunScheduleInstancesResponse.class);
    }

    /**
     *重启采集器
     * @param req RestartInLongAgentRequest
     * @return RestartInLongAgentResponse
     * @throws TencentCloudSDKException
     */
    public RestartInLongAgentResponse RestartInLongAgent(RestartInLongAgentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestartInLongAgent", RestartInLongAgentResponse.class);
    }

    /**
     *还原任务
     * @param req RestoreRecycleTaskRequest
     * @return RestoreRecycleTaskResponse
     * @throws TencentCloudSDKException
     */
    public RestoreRecycleTaskResponse RestoreRecycleTask(RestoreRecycleTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestoreRecycleTask", RestoreRecycleTaskResponse.class);
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
     *回滚自定义函数版本
     * @param req RollbackCustomFunctionVersionRequest
     * @return RollbackCustomFunctionVersionResponse
     * @throws TencentCloudSDKException
     */
    public RollbackCustomFunctionVersionResponse RollbackCustomFunctionVersion(RollbackCustomFunctionVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RollbackCustomFunctionVersion", RollbackCustomFunctionVersionResponse.class);
    }

    /**
     *实例强制成功
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
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
运行任务
     * @param req RunTaskRequest
     * @return RunTaskResponse
     * @throws TencentCloudSDKException
     */
    public RunTaskResponse RunTask(RunTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RunTask", RunTaskResponse.class);
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
     *批量保存任务位置
     * @param req SavePositionsDsRequest
     * @return SavePositionsDsResponse
     * @throws TencentCloudSDKException
     */
    public SavePositionsDsResponse SavePositionsDs(SavePositionsDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SavePositionsDs", SavePositionsDsResponse.class);
    }

    /**
     *判断脚本文件是否被任务列表所引用
     * @param req ScriptUsedByOtherTaskDsRequest
     * @return ScriptUsedByOtherTaskDsResponse
     * @throws TencentCloudSDKException
     */
    public ScriptUsedByOtherTaskDsResponse ScriptUsedByOtherTaskDs(ScriptUsedByOtherTaskDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScriptUsedByOtherTaskDs", ScriptUsedByOtherTaskDsResponse.class);
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
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
     *即席分析终止任务接口
     * @param req StopAdhocTaskRequest
     * @return StopAdhocTaskResponse
     * @throws TencentCloudSDKException
     */
    public StopAdhocTaskResponse StopAdhocTask(StopAdhocTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopAdhocTask", StopAdhocTaskResponse.class);
    }

    /**
     *提交基线
     * @param req StopBaselineRequest
     * @return StopBaselineResponse
     * @throws TencentCloudSDKException
     */
    public StopBaselineResponse StopBaseline(StopBaselineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopBaseline", StopBaselineResponse.class);
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
     *终止etl测试运行任务
     * @param req StopTestRunRequest
     * @return StopTestRunResponse
     * @throws TencentCloudSDKException
     */
    public StopTestRunResponse StopTestRun(StopTestRunRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopTestRun", StopTestRunResponse.class);
    }

    /**
     *提交基线
     * @param req SubmitBaselineRequest
     * @return SubmitBaselineResponse
     * @throws TencentCloudSDKException
     */
    public SubmitBaselineResponse SubmitBaseline(SubmitBaselineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitBaseline", SubmitBaselineResponse.class);
    }

    /**
     *批量提交etl测试运行任务
     * @param req SubmitBatchTestRunRequest
     * @return SubmitBatchTestRunResponse
     * @throws TencentCloudSDKException
     */
    public SubmitBatchTestRunResponse SubmitBatchTestRun(SubmitBatchTestRunRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitBatchTestRun", SubmitBatchTestRunResponse.class);
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
     *即席分析提交数据集成任务
     * @param req SubmitIntegrationTaskRequest
     * @return SubmitIntegrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public SubmitIntegrationTaskResponse SubmitIntegrationTask(SubmitIntegrationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitIntegrationTask", SubmitIntegrationTaskResponse.class);
    }

    /**
     *即席分析提交PySpark任务
     * @param req SubmitPySparkTaskRequest
     * @return SubmitPySparkTaskResponse
     * @throws TencentCloudSDKException
     */
    public SubmitPySparkTaskResponse SubmitPySparkTask(SubmitPySparkTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitPySparkTask", SubmitPySparkTaskResponse.class);
    }

    /**
     *即席分析提交PYTHON任务
     * @param req SubmitPythonTaskRequest
     * @return SubmitPythonTaskResponse
     * @throws TencentCloudSDKException
     */
    public SubmitPythonTaskResponse SubmitPythonTask(SubmitPythonTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitPythonTask", SubmitPythonTaskResponse.class);
    }

    /**
     *即席分析提交SHELL任务
     * @param req SubmitShellTaskRequest
     * @return SubmitShellTaskResponse
     * @throws TencentCloudSDKException
     */
    public SubmitShellTaskResponse SubmitShellTask(SubmitShellTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitShellTask", SubmitShellTaskResponse.class);
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
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
提交任务
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
     *提交etl测试运行任务
     * @param req SubmitTestRunRequest
     * @return SubmitTestRunResponse
     * @throws TencentCloudSDKException
     */
    public SubmitTestRunResponse SubmitTestRun(SubmitTestRunRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitTestRun", SubmitTestRunResponse.class);
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
提交工作流
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
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
触发事件
     * @param req TriggerEventRequest
     * @return TriggerEventResponse
     * @throws TencentCloudSDKException
     */
    public TriggerEventResponse TriggerEvent(TriggerEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TriggerEvent", TriggerEventResponse.class);
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
     *批量更新高级设置
     * @param req UpdateBatchTaskAdvancedSettingsRequest
     * @return UpdateBatchTaskAdvancedSettingsResponse
     * @throws TencentCloudSDKException
     */
    public UpdateBatchTaskAdvancedSettingsResponse UpdateBatchTaskAdvancedSettings(UpdateBatchTaskAdvancedSettingsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateBatchTaskAdvancedSettings", UpdateBatchTaskAdvancedSettingsResponse.class);
    }

    /**
     *批量更新数据源
     * @param req UpdateBatchTaskDatasourceRequest
     * @return UpdateBatchTaskDatasourceResponse
     * @throws TencentCloudSDKException
     */
    public UpdateBatchTaskDatasourceResponse UpdateBatchTaskDatasource(UpdateBatchTaskDatasourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateBatchTaskDatasource", UpdateBatchTaskDatasourceResponse.class);
    }

    /**
     *批量修改责任人
     * @param req UpdateBatchTaskInChargeRequest
     * @return UpdateBatchTaskInChargeResponse
     * @throws TencentCloudSDKException
     */
    public UpdateBatchTaskInChargeResponse UpdateBatchTaskInCharge(UpdateBatchTaskInChargeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateBatchTaskInCharge", UpdateBatchTaskInChargeResponse.class);
    }

    /**
     *批量修改参数
     * @param req UpdateBatchTaskParameterRequest
     * @return UpdateBatchTaskParameterResponse
     * @throws TencentCloudSDKException
     */
    public UpdateBatchTaskParameterResponse UpdateBatchTaskParameter(UpdateBatchTaskParameterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateBatchTaskParameter", UpdateBatchTaskParameterResponse.class);
    }

    /**
     *批量更新调度参数
     * @param req UpdateBatchTaskParamsRequest
     * @return UpdateBatchTaskParamsResponse
     * @throws TencentCloudSDKException
     */
    public UpdateBatchTaskParamsResponse UpdateBatchTaskParams(UpdateBatchTaskParamsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateBatchTaskParams", UpdateBatchTaskParamsResponse.class);
    }

    /**
     *批量修改资源组
     * @param req UpdateBatchTaskResourceGroupRequest
     * @return UpdateBatchTaskResourceGroupResponse
     * @throws TencentCloudSDKException
     */
    public UpdateBatchTaskResourceGroupResponse UpdateBatchTaskResourceGroup(UpdateBatchTaskResourceGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateBatchTaskResourceGroup", UpdateBatchTaskResourceGroupResponse.class);
    }

    /**
     *批量更新调度周期设置
     * @param req UpdateBatchTaskScheduleRequest
     * @return UpdateBatchTaskScheduleResponse
     * @throws TencentCloudSDKException
     */
    public UpdateBatchTaskScheduleResponse UpdateBatchTaskSchedule(UpdateBatchTaskScheduleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateBatchTaskSchedule", UpdateBatchTaskScheduleResponse.class);
    }

    /**
     *更新事件
     * @param req UpdateDsEventRequest
     * @return UpdateDsEventResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDsEventResponse UpdateDsEvent(UpdateDsEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateDsEvent", UpdateDsEventResponse.class);
    }

    /**
     *更新事件监听
     * @param req UpdateEventListenerRequest
     * @return UpdateEventListenerResponse
     * @throws TencentCloudSDKException
     */
    public UpdateEventListenerResponse UpdateEventListener(UpdateEventListenerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateEventListener", UpdateEventListenerResponse.class);
    }

    /**
     *更新采集器
     * @param req UpdateInLongAgentRequest
     * @return UpdateInLongAgentResponse
     * @throws TencentCloudSDKException
     */
    public UpdateInLongAgentResponse UpdateInLongAgent(UpdateInLongAgentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateInLongAgent", UpdateInLongAgentResponse.class);
    }

    /**
     *更新任务Ds
     * @param req UpdateTaskDsRequest
     * @return UpdateTaskDsResponse
     * @throws TencentCloudSDKException
     */
    public UpdateTaskDsResponse UpdateTaskDs(UpdateTaskDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateTaskDs", UpdateTaskDsResponse.class);
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
     *修改工作流责任人
     * @param req UpdateWorkflowOwnerRequest
     * @return UpdateWorkflowOwnerResponse
     * @throws TencentCloudSDKException
     */
    public UpdateWorkflowOwnerResponse UpdateWorkflowOwner(UpdateWorkflowOwnerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateWorkflowOwner", UpdateWorkflowOwnerResponse.class);
    }

    /**
     *保存高级运行用户自定义参数
     * @param req UploadAdvanceRunParamsRequest
     * @return UploadAdvanceRunParamsResponse
     * @throws TencentCloudSDKException
     */
    public UploadAdvanceRunParamsResponse UploadAdvanceRunParams(UploadAdvanceRunParamsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UploadAdvanceRunParams", UploadAdvanceRunParamsResponse.class);
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
     *文件上传需要先获取文件上传所需要的秘钥，文件位置等信息，因为文件名字可能会出现冲突，所以需要传入将要写入的文件，如果检测到文件名冲突，WeData 后端会在文件名上加入随机字符串。
     * @param req UploadFilesDsRequest
     * @return UploadFilesDsResponse
     * @throws TencentCloudSDKException
     */
    public UploadFilesDsResponse UploadFilesDs(UploadFilesDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UploadFilesDs", UploadFilesDsResponse.class);
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
