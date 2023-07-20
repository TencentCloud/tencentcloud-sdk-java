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
     *批量创建任务告警规则
     * @param req BatchCreateIntegrationTaskAlarmsRequest
     * @return BatchCreateIntegrationTaskAlarmsResponse
     * @throws TencentCloudSDKException
     */
    public BatchCreateIntegrationTaskAlarmsResponse BatchCreateIntegrationTaskAlarms(BatchCreateIntegrationTaskAlarmsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchCreateIntegrationTaskAlarmsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<BatchCreateIntegrationTaskAlarmsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchCreateIntegrationTaskAlarms");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量删除集成任务
     * @param req BatchDeleteIntegrationTasksRequest
     * @return BatchDeleteIntegrationTasksResponse
     * @throws TencentCloudSDKException
     */
    public BatchDeleteIntegrationTasksResponse BatchDeleteIntegrationTasks(BatchDeleteIntegrationTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchDeleteIntegrationTasksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<BatchDeleteIntegrationTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchDeleteIntegrationTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *智能运维-批量删除任务
     * @param req BatchDeleteOpsTasksRequest
     * @return BatchDeleteOpsTasksResponse
     * @throws TencentCloudSDKException
     */
    public BatchDeleteOpsTasksResponse BatchDeleteOpsTasks(BatchDeleteOpsTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchDeleteOpsTasksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<BatchDeleteOpsTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchDeleteOpsTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Ds批量删除任务，仅对任务状态为”已停止“有效；
     * @param req BatchDeleteTasksDsRequest
     * @return BatchDeleteTasksDsResponse
     * @throws TencentCloudSDKException
     */
    public BatchDeleteTasksDsResponse BatchDeleteTasksDs(BatchDeleteTasksDsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchDeleteTasksDsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<BatchDeleteTasksDsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchDeleteTasksDs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
批量删除任务，仅对任务状态为”已停止“有效；

     * @param req BatchDeleteTasksNewRequest
     * @return BatchDeleteTasksNewResponse
     * @throws TencentCloudSDKException
     */
    public BatchDeleteTasksNewResponse BatchDeleteTasksNew(BatchDeleteTasksNewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchDeleteTasksNewResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<BatchDeleteTasksNewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchDeleteTasksNew");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量置成功集成任务实例
     * @param req BatchForceSuccessIntegrationTaskInstancesRequest
     * @return BatchForceSuccessIntegrationTaskInstancesResponse
     * @throws TencentCloudSDKException
     */
    public BatchForceSuccessIntegrationTaskInstancesResponse BatchForceSuccessIntegrationTaskInstances(BatchForceSuccessIntegrationTaskInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchForceSuccessIntegrationTaskInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<BatchForceSuccessIntegrationTaskInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchForceSuccessIntegrationTaskInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量终止集成任务实例
     * @param req BatchKillIntegrationTaskInstancesRequest
     * @return BatchKillIntegrationTaskInstancesResponse
     * @throws TencentCloudSDKException
     */
    public BatchKillIntegrationTaskInstancesResponse BatchKillIntegrationTaskInstances(BatchKillIntegrationTaskInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchKillIntegrationTaskInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<BatchKillIntegrationTaskInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchKillIntegrationTaskInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *对集成离线任务执行批量补数据操作
     * @param req BatchMakeUpIntegrationTasksRequest
     * @return BatchMakeUpIntegrationTasksResponse
     * @throws TencentCloudSDKException
     */
    public BatchMakeUpIntegrationTasksResponse BatchMakeUpIntegrationTasks(BatchMakeUpIntegrationTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchMakeUpIntegrationTasksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<BatchMakeUpIntegrationTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchMakeUpIntegrationTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量修改任务责任人
     * @param req BatchModifyOpsOwnersRequest
     * @return BatchModifyOpsOwnersResponse
     * @throws TencentCloudSDKException
     */
    public BatchModifyOpsOwnersResponse BatchModifyOpsOwners(BatchModifyOpsOwnersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchModifyOpsOwnersResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<BatchModifyOpsOwnersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchModifyOpsOwners");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
批量修改任务责任人
     * @param req BatchModifyOwnersNewRequest
     * @return BatchModifyOwnersNewResponse
     * @throws TencentCloudSDKException
     */
    public BatchModifyOwnersNewResponse BatchModifyOwnersNew(BatchModifyOwnersNewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchModifyOwnersNewResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<BatchModifyOwnersNewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchModifyOwnersNew");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量重跑集成任务实例
     * @param req BatchRerunIntegrationTaskInstancesRequest
     * @return BatchRerunIntegrationTaskInstancesResponse
     * @throws TencentCloudSDKException
     */
    public BatchRerunIntegrationTaskInstancesResponse BatchRerunIntegrationTaskInstances(BatchRerunIntegrationTaskInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchRerunIntegrationTaskInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<BatchRerunIntegrationTaskInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchRerunIntegrationTaskInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量继续执行集成实时任务
     * @param req BatchResumeIntegrationTasksRequest
     * @return BatchResumeIntegrationTasksResponse
     * @throws TencentCloudSDKException
     */
    public BatchResumeIntegrationTasksResponse BatchResumeIntegrationTasks(BatchResumeIntegrationTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchResumeIntegrationTasksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<BatchResumeIntegrationTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchResumeIntegrationTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *任务运维-任务列表 批量运行
     * @param req BatchRunOpsTaskRequest
     * @return BatchRunOpsTaskResponse
     * @throws TencentCloudSDKException
     */
    public BatchRunOpsTaskResponse BatchRunOpsTask(BatchRunOpsTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchRunOpsTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<BatchRunOpsTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchRunOpsTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量运行集成任务
     * @param req BatchStartIntegrationTasksRequest
     * @return BatchStartIntegrationTasksResponse
     * @throws TencentCloudSDKException
     */
    public BatchStartIntegrationTasksResponse BatchStartIntegrationTasks(BatchStartIntegrationTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchStartIntegrationTasksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<BatchStartIntegrationTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchStartIntegrationTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量停止集成任务
     * @param req BatchStopIntegrationTasksRequest
     * @return BatchStopIntegrationTasksResponse
     * @throws TencentCloudSDKException
     */
    public BatchStopIntegrationTasksResponse BatchStopIntegrationTasks(BatchStopIntegrationTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchStopIntegrationTasksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<BatchStopIntegrationTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchStopIntegrationTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *仅对任务状态为”调度中“和”已暂停“有效，对所选任务的任务实例进行终止，并停止调度
     * @param req BatchStopOpsTasksRequest
     * @return BatchStopOpsTasksResponse
     * @throws TencentCloudSDKException
     */
    public BatchStopOpsTasksResponse BatchStopOpsTasks(BatchStopOpsTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchStopOpsTasksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<BatchStopOpsTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchStopOpsTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
仅对任务状态为”调度中“和”已暂停“有效，对所选任务的任务实例进行终止，并停止调度
     * @param req BatchStopTasksNewRequest
     * @return BatchStopTasksNewResponse
     * @throws TencentCloudSDKException
     */
    public BatchStopTasksNewResponse BatchStopTasksNew(BatchStopTasksNewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchStopTasksNewResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<BatchStopTasksNewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchStopTasksNew");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量停止工作流
     * @param req BatchStopWorkflowsByIdsRequest
     * @return BatchStopWorkflowsByIdsResponse
     * @throws TencentCloudSDKException
     */
    public BatchStopWorkflowsByIdsResponse BatchStopWorkflowsByIds(BatchStopWorkflowsByIdsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchStopWorkflowsByIdsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<BatchStopWorkflowsByIdsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchStopWorkflowsByIds");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量暂停集成任务
     * @param req BatchSuspendIntegrationTasksRequest
     * @return BatchSuspendIntegrationTasksResponse
     * @throws TencentCloudSDKException
     */
    public BatchSuspendIntegrationTasksResponse BatchSuspendIntegrationTasks(BatchSuspendIntegrationTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchSuspendIntegrationTasksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<BatchSuspendIntegrationTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchSuspendIntegrationTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量更新集成任务（暂时仅支持批量更新责任人）
     * @param req BatchUpdateIntegrationTasksRequest
     * @return BatchUpdateIntegrationTasksResponse
     * @throws TencentCloudSDKException
     */
    public BatchUpdateIntegrationTasksResponse BatchUpdateIntegrationTasks(BatchUpdateIntegrationTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchUpdateIntegrationTasksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<BatchUpdateIntegrationTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchUpdateIntegrationTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *判断告警规则重名
     * @param req CheckAlarmRegularNameExistRequest
     * @return CheckAlarmRegularNameExistResponse
     * @throws TencentCloudSDKException
     */
    public CheckAlarmRegularNameExistResponse CheckAlarmRegularNameExist(CheckAlarmRegularNameExistRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckAlarmRegularNameExistResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CheckAlarmRegularNameExistResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckAlarmRegularNameExist");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *检查规则名称是否重复
     * @param req CheckDuplicateRuleNameRequest
     * @return CheckDuplicateRuleNameResponse
     * @throws TencentCloudSDKException
     */
    public CheckDuplicateRuleNameResponse CheckDuplicateRuleName(CheckDuplicateRuleNameRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckDuplicateRuleNameResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CheckDuplicateRuleNameResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckDuplicateRuleName");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *检查规则模板名称是否重复
     * @param req CheckDuplicateTemplateNameRequest
     * @return CheckDuplicateTemplateNameResponse
     * @throws TencentCloudSDKException
     */
    public CheckDuplicateTemplateNameResponse CheckDuplicateTemplateName(CheckDuplicateTemplateNameRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckDuplicateTemplateNameResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CheckDuplicateTemplateNameResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckDuplicateTemplateName");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *判断集成节点名称是否存在
     * @param req CheckIntegrationNodeNameExistsRequest
     * @return CheckIntegrationNodeNameExistsResponse
     * @throws TencentCloudSDKException
     */
    public CheckIntegrationNodeNameExistsResponse CheckIntegrationNodeNameExists(CheckIntegrationNodeNameExistsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckIntegrationNodeNameExistsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CheckIntegrationNodeNameExistsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckIntegrationNodeNameExists");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *判断集成任务名称是否存在
     * @param req CheckIntegrationTaskNameExistsRequest
     * @return CheckIntegrationTaskNameExistsResponse
     * @throws TencentCloudSDKException
     */
    public CheckIntegrationTaskNameExistsResponse CheckIntegrationTaskNameExists(CheckIntegrationTaskNameExistsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckIntegrationTaskNameExistsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CheckIntegrationTaskNameExistsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckIntegrationTaskNameExists");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *离线任务重名校验
     * @param req CheckTaskNameExistRequest
     * @return CheckTaskNameExistResponse
     * @throws TencentCloudSDKException
     */
    public CheckTaskNameExistResponse CheckTaskNameExist(CheckTaskNameExistRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckTaskNameExistResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CheckTaskNameExistResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckTaskNameExist");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提交数据导出任务
     * @param req CommitExportTaskRequest
     * @return CommitExportTaskResponse
     * @throws TencentCloudSDKException
     */
    public CommitExportTaskResponse CommitExportTask(CommitExportTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CommitExportTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CommitExportTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CommitExportTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提交集成任务
     * @param req CommitIntegrationTaskRequest
     * @return CommitIntegrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public CommitIntegrationTaskResponse CommitIntegrationTask(CommitIntegrationTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CommitIntegrationTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CommitIntegrationTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CommitIntegrationTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Runner 规则检测结果上报
     * @param req CommitRuleGroupExecResultRequest
     * @return CommitRuleGroupExecResultResponse
     * @throws TencentCloudSDKException
     */
    public CommitRuleGroupExecResultResponse CommitRuleGroupExecResult(CommitRuleGroupExecResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CommitRuleGroupExecResultResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CommitRuleGroupExecResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CommitRuleGroupExecResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提交规则组运行任务接口
     * @param req CommitRuleGroupTaskRequest
     * @return CommitRuleGroupTaskResponse
     * @throws TencentCloudSDKException
     */
    public CommitRuleGroupTaskResponse CommitRuleGroupTask(CommitRuleGroupTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CommitRuleGroupTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CommitRuleGroupTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CommitRuleGroupTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *统计任务实例状态
     * @param req CountOpsInstanceStateRequest
     * @return CountOpsInstanceStateResponse
     * @throws TencentCloudSDKException
     */
    public CountOpsInstanceStateResponse CountOpsInstanceState(CountOpsInstanceStateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CountOpsInstanceStateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CountOpsInstanceStateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CountOpsInstanceState");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建基线
     * @param req CreateBaselineRequest
     * @return CreateBaselineResponse
     * @throws TencentCloudSDKException
     */
    public CreateBaselineResponse CreateBaseline(CreateBaselineRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBaselineResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateBaselineResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateBaseline");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     * 创建用户自定义函数
     * @param req CreateCustomFunctionRequest
     * @return CreateCustomFunctionResponse
     * @throws TencentCloudSDKException
     */
    public CreateCustomFunctionResponse CreateCustomFunction(CreateCustomFunctionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCustomFunctionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCustomFunctionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCustomFunction");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
创建数据源
     * @param req CreateDataSourceRequest
     * @return CreateDataSourceResponse
     * @throws TencentCloudSDKException
     */
    public CreateDataSourceResponse CreateDataSource(CreateDataSourceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDataSourceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDataSourceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDataSource");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
创建文件夹
     * @param req CreateFolderRequest
     * @return CreateFolderResponse
     * @throws TencentCloudSDKException
     */
    public CreateFolderResponse CreateFolder(CreateFolderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFolderResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFolderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateFolder");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *建hive表
     * @param req CreateHiveTableRequest
     * @return CreateHiveTableResponse
     * @throws TencentCloudSDKException
     */
    public CreateHiveTableResponse CreateHiveTable(CreateHiveTableRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateHiveTableResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateHiveTableResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateHiveTable");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建hive表，返回表名称
     * @param req CreateHiveTableByDDLRequest
     * @return CreateHiveTableByDDLResponse
     * @throws TencentCloudSDKException
     */
    public CreateHiveTableByDDLResponse CreateHiveTableByDDL(CreateHiveTableByDDLRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateHiveTableByDDLResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateHiveTableByDDLResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateHiveTableByDDL");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *注册采集器
     * @param req CreateInLongAgentRequest
     * @return CreateInLongAgentResponse
     * @throws TencentCloudSDKException
     */
    public CreateInLongAgentResponse CreateInLongAgent(CreateInLongAgentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateInLongAgentResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateInLongAgentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateInLongAgent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建集成节点
     * @param req CreateIntegrationNodeRequest
     * @return CreateIntegrationNodeResponse
     * @throws TencentCloudSDKException
     */
    public CreateIntegrationNodeResponse CreateIntegrationNode(CreateIntegrationNodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateIntegrationNodeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateIntegrationNodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateIntegrationNode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建集成任务
     * @param req CreateIntegrationTaskRequest
     * @return CreateIntegrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateIntegrationTaskResponse CreateIntegrationTask(CreateIntegrationTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateIntegrationTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateIntegrationTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateIntegrationTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建离线任务
     * @param req CreateOfflineTaskRequest
     * @return CreateOfflineTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateOfflineTaskResponse CreateOfflineTask(CreateOfflineTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateOfflineTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateOfflineTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateOfflineTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *补录任务
     * @param req CreateOpsMakePlanRequest
     * @return CreateOpsMakePlanResponse
     * @throws TencentCloudSDKException
     */
    public CreateOpsMakePlanResponse CreateOpsMakePlan(CreateOpsMakePlanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateOpsMakePlanResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateOpsMakePlanResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateOpsMakePlan");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *资源管理需要先将资源上传到cos中，然后调用该接口，将cos资源绑定到wedata
     * @param req CreateOrUpdateResourceRequest
     * @return CreateOrUpdateResourceResponse
     * @throws TencentCloudSDKException
     */
    public CreateOrUpdateResourceResponse CreateOrUpdateResource(CreateOrUpdateResourceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateOrUpdateResourceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateOrUpdateResourceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateOrUpdateResource");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *文件路径的根目录为 /datastudio/resource，如果要在根目录下创建 aaa 文件夹，FilePath的值应该为 /datastudio/resource，如果根目录下已经创建了 aaa 文件夹，要在 aaa 下创建  bbb 文件夹，FilePath的值应该为 /datastudio/resource/aaa
     * @param req CreateResourcePathRequest
     * @return CreateResourcePathResponse
     * @throws TencentCloudSDKException
     */
    public CreateResourcePathResponse CreateResourcePath(CreateResourcePathRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateResourcePathResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateResourcePathResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateResourcePath");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建质量规则接口
     * @param req CreateRuleRequest
     * @return CreateRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateRuleResponse CreateRule(CreateRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建规则模版
     * @param req CreateRuleTemplateRequest
     * @return CreateRuleTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateRuleTemplateResponse CreateRuleTemplate(CreateRuleTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRuleTemplateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRuleTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateRuleTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
创建任务
     * @param req CreateTaskRequest
     * @return CreateTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateTaskResponse CreateTask(CreateTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建任务告警规则
     * @param req CreateTaskAlarmRegularRequest
     * @return CreateTaskAlarmRegularResponse
     * @throws TencentCloudSDKException
     */
    public CreateTaskAlarmRegularResponse CreateTaskAlarmRegular(CreateTaskAlarmRegularRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTaskAlarmRegularResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTaskAlarmRegularResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTaskAlarmRegular");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
创建工作流
     * @param req CreateWorkflowRequest
     * @return CreateWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public CreateWorkflowResponse CreateWorkflow(CreateWorkflowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateWorkflowResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateWorkflowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateWorkflow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *拉取dag实例
     * @param req DagInstancesRequest
     * @return DagInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DagInstancesResponse DagInstances(DagInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DagInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DagInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DagInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DeleteBaseline
     * @param req DeleteBaselineRequest
     * @return DeleteBaselineResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBaselineResponse DeleteBaseline(DeleteBaselineRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteBaselineResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteBaselineResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteBaseline");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除用户自定义函数
     * @param req DeleteCustomFunctionRequest
     * @return DeleteCustomFunctionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCustomFunctionResponse DeleteCustomFunction(DeleteCustomFunctionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCustomFunctionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCustomFunctionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCustomFunction");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
删除数据源
     * @param req DeleteDataSourcesRequest
     * @return DeleteDataSourcesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDataSourcesResponse DeleteDataSources(DeleteDataSourcesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDataSourcesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDataSourcesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDataSources");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除文件
     * @param req DeleteFileRequest
     * @return DeleteFileResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFileResponse DeleteFile(DeleteFileRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteFileResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteFileResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteFile");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *开发空间-批量删除目录和文件
     * @param req DeleteFilePathRequest
     * @return DeleteFilePathResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFilePathResponse DeleteFilePath(DeleteFilePathRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteFilePathResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteFilePathResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteFilePath");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
删除文件夹
     * @param req DeleteFolderRequest
     * @return DeleteFolderResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFolderResponse DeleteFolder(DeleteFolderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteFolderResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteFolderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteFolder");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除采集器
     * @param req DeleteInLongAgentRequest
     * @return DeleteInLongAgentResponse
     * @throws TencentCloudSDKException
     */
    public DeleteInLongAgentResponse DeleteInLongAgent(DeleteInLongAgentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteInLongAgentResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteInLongAgentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteInLongAgent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除集成节点
     * @param req DeleteIntegrationNodeRequest
     * @return DeleteIntegrationNodeResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIntegrationNodeResponse DeleteIntegrationNode(DeleteIntegrationNodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteIntegrationNodeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteIntegrationNodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteIntegrationNode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除集成任务
     * @param req DeleteIntegrationTaskRequest
     * @return DeleteIntegrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIntegrationTaskResponse DeleteIntegrationTask(DeleteIntegrationTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteIntegrationTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteIntegrationTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteIntegrationTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除任务
     * @param req DeleteOfflineTaskRequest
     * @return DeleteOfflineTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOfflineTaskResponse DeleteOfflineTask(DeleteOfflineTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteOfflineTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteOfflineTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteOfflineTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除项目参数
     * @param req DeleteProjectParamDsRequest
     * @return DeleteProjectParamDsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProjectParamDsResponse DeleteProjectParamDs(DeleteProjectParamDsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteProjectParamDsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteProjectParamDsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteProjectParamDs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *资源管理删除资源
     * @param req DeleteResourceRequest
     * @return DeleteResourceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteResourceResponse DeleteResource(DeleteResourceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteResourceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteResourceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteResource");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *资源管理-删除资源文件
     * @param req DeleteResourceFileRequest
     * @return DeleteResourceFileResponse
     * @throws TencentCloudSDKException
     */
    public DeleteResourceFileResponse DeleteResourceFile(DeleteResourceFileRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteResourceFileResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteResourceFileResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteResourceFile");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *资源管理-批量删除资源文件
     * @param req DeleteResourceFilesRequest
     * @return DeleteResourceFilesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteResourceFilesResponse DeleteResourceFiles(DeleteResourceFilesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteResourceFilesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteResourceFilesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteResourceFiles");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除质量规则接口
     * @param req DeleteRuleRequest
     * @return DeleteRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRuleResponse DeleteRule(DeleteRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除规则模版
     * @param req DeleteRuleTemplateRequest
     * @return DeleteRuleTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRuleTemplateResponse DeleteRuleTemplate(DeleteRuleTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRuleTemplateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRuleTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRuleTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除任务告警规则
     * @param req DeleteTaskAlarmRegularRequest
     * @return DeleteTaskAlarmRegularResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTaskAlarmRegularResponse DeleteTaskAlarmRegular(DeleteTaskAlarmRegularRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTaskAlarmRegularResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTaskAlarmRegularResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteTaskAlarmRegular");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除任务Ds
     * @param req DeleteTaskDsRequest
     * @return DeleteTaskDsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTaskDsResponse DeleteTaskDs(DeleteTaskDsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTaskDsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTaskDsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteTaskDs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过工作流Id删除工作流
     * @param req DeleteWorkflowByIdRequest
     * @return DeleteWorkflowByIdResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWorkflowByIdResponse DeleteWorkflowById(DeleteWorkflowByIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteWorkflowByIdResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteWorkflowByIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteWorkflowById");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
删除工作流
     * @param req DeleteWorkflowNewRequest
     * @return DeleteWorkflowNewResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWorkflowNewResponse DeleteWorkflowNew(DeleteWorkflowNewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteWorkflowNewResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteWorkflowNewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteWorkflowNew");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *告警事件列表
     * @param req DescribeAlarmEventsRequest
     * @return DescribeAlarmEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmEventsResponse DescribeAlarmEvents(DescribeAlarmEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAlarmEventsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAlarmEventsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAlarmEvents");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *告警接收人详情
     * @param req DescribeAlarmReceiverRequest
     * @return DescribeAlarmReceiverResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmReceiverResponse DescribeAlarmReceiver(DescribeAlarmReceiverRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAlarmReceiverResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAlarmReceiverResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAlarmReceiver");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询父目录下所有子文件夹+工作流
     * @param req DescribeAllByFolderNewRequest
     * @return DescribeAllByFolderNewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAllByFolderNewResponse DescribeAllByFolderNew(DescribeAllByFolderNewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAllByFolderNewResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAllByFolderNewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAllByFolderNew");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取所有任务类型
     * @param req DescribeAllTaskTypeRequest
     * @return DescribeAllTaskTypeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAllTaskTypeResponse DescribeAllTaskType(DescribeAllTaskTypeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAllTaskTypeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAllTaskTypeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAllTaskType");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据任务Id查找生产态子任务
     * @param req DescribeAllUsedVersionSonRequest
     * @return DescribeAllUsedVersionSonResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAllUsedVersionSonResponse DescribeAllUsedVersionSon(DescribeAllUsedVersionSonRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAllUsedVersionSonResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAllUsedVersionSonResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAllUsedVersionSon");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询基线DAG
     * @param req DescribeBaselineAllTaskDagRequest
     * @return DescribeBaselineAllTaskDagResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineAllTaskDagResponse DescribeBaselineAllTaskDag(DescribeBaselineAllTaskDagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBaselineAllTaskDagResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBaselineAllTaskDagResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBaselineAllTaskDag");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *基线列表
     * @param req DescribeBaselineByIdRequest
     * @return DescribeBaselineByIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineByIdResponse DescribeBaselineById(DescribeBaselineByIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBaselineByIdResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBaselineByIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBaselineById");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询基线实例DAG
     * @param req DescribeBaselineInstanceDagRequest
     * @return DescribeBaselineInstanceDagResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineInstanceDagResponse DescribeBaselineInstanceDag(DescribeBaselineInstanceDagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBaselineInstanceDagResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBaselineInstanceDagResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBaselineInstanceDag");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询基线实例关键任务实例甘特图
     * @param req DescribeBaselineInstanceGanttRequest
     * @return DescribeBaselineInstanceGanttResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineInstanceGanttResponse DescribeBaselineInstanceGantt(DescribeBaselineInstanceGanttRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBaselineInstanceGanttResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBaselineInstanceGanttResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBaselineInstanceGantt");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询基线实例列表
     * @param req DescribeBaselineInstancesRequest
     * @return DescribeBaselineInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineInstancesResponse DescribeBaselineInstances(DescribeBaselineInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBaselineInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBaselineInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBaselineInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *基线列表
     * @param req DescribeBaselinesRequest
     * @return DescribeBaselinesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselinesResponse DescribeBaselines(DescribeBaselinesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBaselinesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBaselinesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBaselines");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量操作任务列表
     * @param req DescribeBatchOperateTaskRequest
     * @return DescribeBatchOperateTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBatchOperateTaskResponse DescribeBatchOperateTask(DescribeBatchOperateTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBatchOperateTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBatchOperateTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBatchOperateTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *智能运维-事件列表-所属任务/基线过滤列表
     * @param req DescribeBelongToRequest
     * @return DescribeBelongToResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBelongToResponse DescribeBelongTo(DescribeBelongToRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBelongToResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBelongToResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBelongTo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取集群命名空间列表
     * @param req DescribeClusterNamespaceListRequest
     * @return DescribeClusterNamespaceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterNamespaceListResponse DescribeClusterNamespaceList(DescribeClusterNamespaceListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterNamespaceListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterNamespaceListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterNamespaceList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *列出字段血缘信息
     * @param req DescribeColumnLineageRequest
     * @return DescribeColumnLineageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeColumnLineageResponse DescribeColumnLineage(DescribeColumnLineageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeColumnLineageResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeColumnLineageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeColumnLineage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询数据来源列表
     * @param req DescribeDataBasesRequest
     * @return DescribeDataBasesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataBasesResponse DescribeDataBases(DescribeDataBasesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDataBasesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDataBasesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDataBases");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *数据质量的概览页面数据监测情况接口
     * @param req DescribeDataCheckStatRequest
     * @return DescribeDataCheckStatResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataCheckStatResponse DescribeDataCheckStat(DescribeDataCheckStatRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDataCheckStatResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDataCheckStatResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDataCheckStat");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询规则组数据对象列表
     * @param req DescribeDataObjectsRequest
     * @return DescribeDataObjectsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataObjectsResponse DescribeDataObjects(DescribeDataObjectsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDataObjectsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDataObjectsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDataObjects");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取数据源信息-数据源分页列表
     * @param req DescribeDataSourceInfoListRequest
     * @return DescribeDataSourceInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataSourceInfoListResponse DescribeDataSourceInfoList(DescribeDataSourceInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDataSourceInfoListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDataSourceInfoListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDataSourceInfoList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
数据源详情
     * @param req DescribeDataSourceListRequest
     * @return DescribeDataSourceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataSourceListResponse DescribeDataSourceList(DescribeDataSourceListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDataSourceListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDataSourceListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDataSourceList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
数据源列表
     * @param req DescribeDataSourceWithoutInfoRequest
     * @return DescribeDataSourceWithoutInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataSourceWithoutInfoResponse DescribeDataSourceWithoutInfo(DescribeDataSourceWithoutInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDataSourceWithoutInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDataSourceWithoutInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDataSourceWithoutInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取字段类型列表
     * @param req DescribeDataTypesRequest
     * @return DescribeDataTypesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataTypesResponse DescribeDataTypes(DescribeDataTypesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDataTypesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDataTypesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDataTypes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取数据库信息
     * @param req DescribeDatabaseInfoListRequest
     * @return DescribeDatabaseInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatabaseInfoListResponse DescribeDatabaseInfoList(DescribeDatabaseInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDatabaseInfoListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDatabaseInfoListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDatabaseInfoList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
数据源详情
     * @param req DescribeDatasourceRequest
     * @return DescribeDatasourceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatasourceResponse DescribeDatasource(DescribeDatasourceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDatasourceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDatasourceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDatasource");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据任务id获取下游依赖任务列表
     * @param req DescribeDependOpsTaskListRequest
     * @return DescribeDependOpsTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDependOpsTaskListResponse DescribeDependOpsTaskList(DescribeDependOpsTaskListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDependOpsTaskListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDependOpsTaskListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDependOpsTaskList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据层级查找上/下游任务节点
     * @param req DescribeDependOpsTasksRequest
     * @return DescribeDependOpsTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDependOpsTasksResponse DescribeDependOpsTasks(DescribeDependOpsTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDependOpsTasksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDependOpsTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDependOpsTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过taskIds查询task详情列表
     * @param req DescribeDependTaskListsRequest
     * @return DescribeDependTaskListsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDependTaskListsResponse DescribeDependTaskLists(DescribeDependTaskListsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDependTaskListsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDependTaskListsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDependTaskLists");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
根据层级查找上/下游任务节点
     * @param req DescribeDependTasksNewRequest
     * @return DescribeDependTasksNewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDependTasksNewResponse DescribeDependTasksNew(DescribeDependTasksNewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDependTasksNewResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDependTasksNewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDependTasksNew");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询基线诊断信息
     * @param req DescribeDiagnosticInfoByBaselineIdRequest
     * @return DescribeDiagnosticInfoByBaselineIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDiagnosticInfoByBaselineIdResponse DescribeDiagnosticInfoByBaselineId(DescribeDiagnosticInfoByBaselineIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDiagnosticInfoByBaselineIdResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDiagnosticInfoByBaselineIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDiagnosticInfoByBaselineId");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *质量报告-查询质量评分
     * @param req DescribeDimensionScoreRequest
     * @return DescribeDimensionScoreResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDimensionScoreResponse DescribeDimensionScore(DescribeDimensionScoreRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDimensionScoreResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDimensionScoreResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDimensionScore");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *分页查询试运行实例列表
     * @param req DescribeDrInstancePageRequest
     * @return DescribeDrInstancePageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDrInstancePageResponse DescribeDrInstancePage(DescribeDrInstancePageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDrInstancePageResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDrInstancePageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDrInstancePage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询试运行实例执行内容
     * @param req DescribeDrInstanceScriptContentRequest
     * @return DescribeDrInstanceScriptContentResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDrInstanceScriptContentResponse DescribeDrInstanceScriptContent(DescribeDrInstanceScriptContentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDrInstanceScriptContentResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDrInstanceScriptContentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDrInstanceScriptContent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询试运行实例子实例列表
     * @param req DescribeDrSonInstanceRequest
     * @return DescribeDrSonInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDrSonInstanceResponse DescribeDrSonInstance(DescribeDrSonInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDrSonInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDrSonInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDrSonInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据项目ID和事件名称查看事件详情
     * @param req DescribeEventRequest
     * @return DescribeEventResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEventResponse DescribeEvent(DescribeEventRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEventResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEventResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEvent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据条件查找事件实例
     * @param req DescribeEventCasesRequest
     * @return DescribeEventCasesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEventCasesResponse DescribeEventCases(DescribeEventCasesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEventCasesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEventCasesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEventCases");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查看事件实例的消费任务
     * @param req DescribeEventConsumeTasksRequest
     * @return DescribeEventConsumeTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEventConsumeTasksResponse DescribeEventConsumeTasks(DescribeEventConsumeTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEventConsumeTasksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEventConsumeTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEventConsumeTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *智能运维事件详情1
     * @param req DescribeEventDetailRequest
     * @return DescribeEventDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEventDetailResponse DescribeEventDetail(DescribeEventDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEventDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEventDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEventDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *事件是否告警过滤条件
     * @param req DescribeEventIsAlarmTypesRequest
     * @return DescribeEventIsAlarmTypesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEventIsAlarmTypesResponse DescribeEventIsAlarmTypes(DescribeEventIsAlarmTypesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEventIsAlarmTypesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEventIsAlarmTypesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEventIsAlarmTypes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询事件类型列表
     * @param req DescribeEventTypesRequest
     * @return DescribeEventTypesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEventTypesResponse DescribeEventTypes(DescribeEventTypesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEventTypesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEventTypesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEventTypes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *智能运维事件查询列表
     * @param req DescribeEventsRequest
     * @return DescribeEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEventsResponse DescribeEvents(DescribeEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEventsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEventsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEvents");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询规则组执行策略
     * @param req DescribeExecStrategyRequest
     * @return DescribeExecStrategyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExecStrategyResponse DescribeExecStrategy(DescribeExecStrategyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeExecStrategyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeExecStrategyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeExecStrategy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取关联父实例
     * @param req DescribeFathersRequest
     * @return DescribeFathersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFathersResponse DescribeFathers(DescribeFathersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFathersResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFathersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFathers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
拉取文件夹目录
     * @param req DescribeFolderListRequest
     * @return DescribeFolderListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFolderListResponse DescribeFolderList(DescribeFolderListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFolderListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFolderListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFolderList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
拉取文件夹下的工作流
     * @param req DescribeFolderWorkflowListRequest
     * @return DescribeFolderWorkflowListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFolderWorkflowListResponse DescribeFolderWorkflowList(DescribeFolderWorkflowListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFolderWorkflowListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFolderWorkflowListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFolderWorkflowList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询函数分类
     * @param req DescribeFunctionKindsRequest
     * @return DescribeFunctionKindsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFunctionKindsResponse DescribeFunctionKinds(DescribeFunctionKindsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFunctionKindsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFunctionKindsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFunctionKinds");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询函数类型
     * @param req DescribeFunctionTypesRequest
     * @return DescribeFunctionTypesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFunctionTypesResponse DescribeFunctionTypes(DescribeFunctionTypesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFunctionTypesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFunctionTypesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFunctionTypes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取采集器列表
     * @param req DescribeInLongAgentListRequest
     * @return DescribeInLongAgentListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInLongAgentListResponse DescribeInLongAgentList(DescribeInLongAgentListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInLongAgentListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInLongAgentListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInLongAgentList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询采集器关联的任务列表
     * @param req DescribeInLongAgentTaskListRequest
     * @return DescribeInLongAgentTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInLongAgentTaskListResponse DescribeInLongAgentTaskList(DescribeInLongAgentTaskListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInLongAgentTaskListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInLongAgentTaskListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInLongAgentTaskList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取采集器所在集群的VPC列表
     * @param req DescribeInLongAgentVpcListRequest
     * @return DescribeInLongAgentVpcListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInLongAgentVpcListResponse DescribeInLongAgentVpcList(DescribeInLongAgentVpcListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInLongAgentVpcListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInLongAgentVpcListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInLongAgentVpcList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取TKE集群列表
     * @param req DescribeInLongTkeClusterListRequest
     * @return DescribeInLongTkeClusterListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInLongTkeClusterListResponse DescribeInLongTkeClusterList(DescribeInLongTkeClusterListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInLongTkeClusterListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInLongTkeClusterListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInLongTkeClusterList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据周期类型查询所有实例
     * @param req DescribeInstanceByCycleRequest
     * @return DescribeInstanceByCycleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceByCycleResponse DescribeInstanceByCycle(DescribeInstanceByCycleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceByCycleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceByCycleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstanceByCycle");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *实例状态周期增长趋势
     * @param req DescribeInstanceByCycleReportRequest
     * @return DescribeInstanceByCycleReportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceByCycleReportResponse DescribeInstanceByCycleReport(DescribeInstanceByCycleReportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceByCycleReportResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceByCycleReportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstanceByCycleReport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *日志获取详情页面
     * @param req DescribeInstanceLastLogRequest
     * @return DescribeInstanceLastLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceLastLogResponse DescribeInstanceLastLog(DescribeInstanceLastLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceLastLogResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceLastLogResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstanceLastLog");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取实例列表
     * @param req DescribeInstanceListRequest
     * @return DescribeInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceListResponse DescribeInstanceList(DescribeInstanceListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstanceList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取实例运行日志
     * @param req DescribeInstanceLogRequest
     * @return DescribeInstanceLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceLogResponse DescribeInstanceLog(DescribeInstanceLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceLogResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceLogResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstanceLog");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取具体实例相关日志信息
     * @param req DescribeInstanceLogDetailRequest
     * @return DescribeInstanceLogDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceLogDetailResponse DescribeInstanceLogDetail(DescribeInstanceLogDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceLogDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceLogDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstanceLogDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *下载日志文件，返回日志URL
     * @param req DescribeInstanceLogFileRequest
     * @return DescribeInstanceLogFileResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceLogFileResponse DescribeInstanceLogFile(DescribeInstanceLogFileRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceLogFileResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceLogFileResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstanceLogFile");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *离线任务实例运行日志列表
     * @param req DescribeInstanceLogListRequest
     * @return DescribeInstanceLogListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceLogListResponse DescribeInstanceLogList(DescribeInstanceLogListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceLogListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceLogListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstanceLogList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
获取实例日志列表
     * @param req DescribeInstanceLogsRequest
     * @return DescribeInstanceLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceLogsResponse DescribeInstanceLogs(DescribeInstanceLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceLogsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceLogsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstanceLogs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *数据质量，查询调度任务的实例列表
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *拉取实例列表，join task表一些信息
     * @param req DescribeInstancesInfoWithTaskInfoRequest
     * @return DescribeInstancesInfoWithTaskInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesInfoWithTaskInfoResponse DescribeInstancesInfoWithTaskInfo(DescribeInstancesInfoWithTaskInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstancesInfoWithTaskInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstancesInfoWithTaskInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstancesInfoWithTaskInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询集成节点
     * @param req DescribeIntegrationNodeRequest
     * @return DescribeIntegrationNodeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIntegrationNodeResponse DescribeIntegrationNode(DescribeIntegrationNodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIntegrationNodeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIntegrationNodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIntegrationNode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *数据集成大屏概览
     * @param req DescribeIntegrationStatisticsRequest
     * @return DescribeIntegrationStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIntegrationStatisticsResponse DescribeIntegrationStatistics(DescribeIntegrationStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIntegrationStatisticsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIntegrationStatisticsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIntegrationStatistics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *数据集成大屏采集器状态分布统计
     * @param req DescribeIntegrationStatisticsAgentStatusRequest
     * @return DescribeIntegrationStatisticsAgentStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIntegrationStatisticsAgentStatusResponse DescribeIntegrationStatisticsAgentStatus(DescribeIntegrationStatisticsAgentStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIntegrationStatisticsAgentStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIntegrationStatisticsAgentStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIntegrationStatisticsAgentStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *数据集成大屏实例状态统计趋势
     * @param req DescribeIntegrationStatisticsInstanceTrendRequest
     * @return DescribeIntegrationStatisticsInstanceTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIntegrationStatisticsInstanceTrendResponse DescribeIntegrationStatisticsInstanceTrend(DescribeIntegrationStatisticsInstanceTrendRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIntegrationStatisticsInstanceTrendResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIntegrationStatisticsInstanceTrendResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIntegrationStatisticsInstanceTrend");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *数据集成大屏同步条数统计趋势
     * @param req DescribeIntegrationStatisticsRecordsTrendRequest
     * @return DescribeIntegrationStatisticsRecordsTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIntegrationStatisticsRecordsTrendResponse DescribeIntegrationStatisticsRecordsTrend(DescribeIntegrationStatisticsRecordsTrendRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIntegrationStatisticsRecordsTrendResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIntegrationStatisticsRecordsTrendResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIntegrationStatisticsRecordsTrend");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *数据集成大屏任务状态分布统计
     * @param req DescribeIntegrationStatisticsTaskStatusRequest
     * @return DescribeIntegrationStatisticsTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIntegrationStatisticsTaskStatusResponse DescribeIntegrationStatisticsTaskStatus(DescribeIntegrationStatisticsTaskStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIntegrationStatisticsTaskStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIntegrationStatisticsTaskStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIntegrationStatisticsTaskStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *数据集成大屏任务状态统计趋势
     * @param req DescribeIntegrationStatisticsTaskStatusTrendRequest
     * @return DescribeIntegrationStatisticsTaskStatusTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIntegrationStatisticsTaskStatusTrendResponse DescribeIntegrationStatisticsTaskStatusTrend(DescribeIntegrationStatisticsTaskStatusTrendRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIntegrationStatisticsTaskStatusTrendResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIntegrationStatisticsTaskStatusTrendResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIntegrationStatisticsTaskStatusTrend");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询集成任务
     * @param req DescribeIntegrationTaskRequest
     * @return DescribeIntegrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIntegrationTaskResponse DescribeIntegrationTask(DescribeIntegrationTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIntegrationTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIntegrationTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIntegrationTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询集成任务列表
     * @param req DescribeIntegrationTasksRequest
     * @return DescribeIntegrationTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIntegrationTasksResponse DescribeIntegrationTasks(DescribeIntegrationTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIntegrationTasksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIntegrationTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIntegrationTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询集成任务版本节点信息
     * @param req DescribeIntegrationVersionNodesInfoRequest
     * @return DescribeIntegrationVersionNodesInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIntegrationVersionNodesInfoResponse DescribeIntegrationVersionNodesInfo(DescribeIntegrationVersionNodesInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIntegrationVersionNodesInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIntegrationVersionNodesInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIntegrationVersionNodesInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取kafka的topic信息
     * @param req DescribeKafkaTopicInfoRequest
     * @return DescribeKafkaTopicInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKafkaTopicInfoResponse DescribeKafkaTopicInfo(DescribeKafkaTopicInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeKafkaTopicInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeKafkaTopicInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeKafkaTopicInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *分页查询质量监控组
     * @param req DescribeMonitorsByPageRequest
     * @return DescribeMonitorsByPageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMonitorsByPageResponse DescribeMonitorsByPage(DescribeMonitorsByPageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMonitorsByPageResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMonitorsByPageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMonitorsByPage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取离线任务长连接Token
     * @param req DescribeOfflineTaskTokenRequest
     * @return DescribeOfflineTaskTokenResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOfflineTaskTokenResponse DescribeOfflineTaskToken(DescribeOfflineTaskTokenRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOfflineTaskTokenResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOfflineTaskTokenResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOfflineTaskToken");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *任务运维搜索 查询生产态任务数据源列表
     * @param req DescribeOperateOpsTaskDatasourceRequest
     * @return DescribeOperateOpsTaskDatasourceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOperateOpsTaskDatasourceResponse DescribeOperateOpsTaskDatasource(DescribeOperateOpsTaskDatasourceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOperateOpsTaskDatasourceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOperateOpsTaskDatasourceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOperateOpsTaskDatasource");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *任务运维-查询生产态任务数据源类型列表
     * @param req DescribeOperateOpsTaskDatasourceTypeRequest
     * @return DescribeOperateOpsTaskDatasourceTypeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOperateOpsTaskDatasourceTypeResponse DescribeOperateOpsTaskDatasourceType(DescribeOperateOpsTaskDatasourceTypeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOperateOpsTaskDatasourceTypeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOperateOpsTaskDatasourceTypeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOperateOpsTaskDatasourceType");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *任务运维列表组合条件查询
     * @param req DescribeOperateOpsTasksRequest
     * @return DescribeOperateOpsTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOperateOpsTasksResponse DescribeOperateOpsTasks(DescribeOperateOpsTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOperateOpsTasksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOperateOpsTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOperateOpsTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *任务运维列表组合条件查询
     * @param req DescribeOperateTasksRequest
     * @return DescribeOperateTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOperateTasksResponse DescribeOperateTasks(DescribeOperateTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOperateTasksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOperateTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOperateTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *实例运维-获取实例日志列表
     * @param req DescribeOpsInstanceLogListRequest
     * @return DescribeOpsInstanceLogListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOpsInstanceLogListResponse DescribeOpsInstanceLogList(DescribeOpsInstanceLogListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOpsInstanceLogListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOpsInstanceLogListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOpsInstanceLogList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据补录计划和补录任务获取补录实例列表。
     * @param req DescribeOpsMakePlanInstancesRequest
     * @return DescribeOpsMakePlanInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOpsMakePlanInstancesResponse DescribeOpsMakePlanInstances(DescribeOpsMakePlanInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOpsMakePlanInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOpsMakePlanInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOpsMakePlanInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查看补录计划任务
     * @param req DescribeOpsMakePlanTasksRequest
     * @return DescribeOpsMakePlanTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOpsMakePlanTasksResponse DescribeOpsMakePlanTasks(DescribeOpsMakePlanTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOpsMakePlanTasksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOpsMakePlanTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOpsMakePlanTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据条件分页查询补录计划
     * @param req DescribeOpsMakePlansRequest
     * @return DescribeOpsMakePlansResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOpsMakePlansResponse DescribeOpsMakePlans(DescribeOpsMakePlansRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOpsMakePlansResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOpsMakePlansResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOpsMakePlans");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询用户生产工作流列表
     * @param req DescribeOpsWorkflowsRequest
     * @return DescribeOpsWorkflowsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOpsWorkflowsResponse DescribeOpsWorkflows(DescribeOpsWorkflowsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOpsWorkflowsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOpsWorkflowsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOpsWorkflows");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询全量函数
     * @param req DescribeOrganizationalFunctionsRequest
     * @return DescribeOrganizationalFunctionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationalFunctionsResponse DescribeOrganizationalFunctions(DescribeOrganizationalFunctionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOrganizationalFunctionsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOrganizationalFunctionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOrganizationalFunctions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *数据质量获取生产调度任务列表
     * @param req DescribeProdTasksRequest
     * @return DescribeProdTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProdTasksResponse DescribeProdTasks(DescribeProdTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProdTasksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProdTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProdTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取项目信息
     * @param req DescribeProjectRequest
     * @return DescribeProjectResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectResponse DescribeProject(DescribeProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProjectResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProjectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProject");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *质量报告-质量评分
     * @param req DescribeQualityScoreRequest
     * @return DescribeQualityScoreResponse
     * @throws TencentCloudSDKException
     */
    public DescribeQualityScoreResponse DescribeQualityScore(DescribeQualityScoreRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeQualityScoreResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeQualityScoreResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeQualityScore");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *质量报告-质量分周期趋势
     * @param req DescribeQualityScoreTrendRequest
     * @return DescribeQualityScoreTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeQualityScoreTrendResponse DescribeQualityScoreTrend(DescribeQualityScoreTrendRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeQualityScoreTrendResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeQualityScoreTrendResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeQualityScoreTrend");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询实时任务实例节点信息
     * @param req DescribeRealTimeTaskInstanceNodeInfoRequest
     * @return DescribeRealTimeTaskInstanceNodeInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRealTimeTaskInstanceNodeInfoResponse DescribeRealTimeTaskInstanceNodeInfo(DescribeRealTimeTaskInstanceNodeInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRealTimeTaskInstanceNodeInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRealTimeTaskInstanceNodeInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRealTimeTaskInstanceNodeInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *实时任务运行指标概览
     * @param req DescribeRealTimeTaskMetricOverviewRequest
     * @return DescribeRealTimeTaskMetricOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRealTimeTaskMetricOverviewResponse DescribeRealTimeTaskMetricOverview(DescribeRealTimeTaskMetricOverviewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRealTimeTaskMetricOverviewResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRealTimeTaskMetricOverviewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRealTimeTaskMetricOverview");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *实时任务同步速度趋势
     * @param req DescribeRealTimeTaskSpeedRequest
     * @return DescribeRealTimeTaskSpeedResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRealTimeTaskSpeedResponse DescribeRealTimeTaskSpeed(DescribeRealTimeTaskSpeedRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRealTimeTaskSpeedResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRealTimeTaskSpeedResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRealTimeTaskSpeed");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询任务实例的关联实例列表
     * @param req DescribeRelatedInstancesRequest
     * @return DescribeRelatedInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRelatedInstancesResponse DescribeRelatedInstances(DescribeRelatedInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRelatedInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRelatedInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRelatedInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取资源管理目录树
     * @param req DescribeResourceManagePathTreesRequest
     * @return DescribeResourceManagePathTreesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceManagePathTreesResponse DescribeResourceManagePathTrees(DescribeResourceManagePathTreesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeResourceManagePathTreesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeResourceManagePathTreesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeResourceManagePathTrees");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询规则详情
     * @param req DescribeRuleRequest
     * @return DescribeRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleResponse DescribeRule(DescribeRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询质量规则数据源
     * @param req DescribeRuleDataSourcesRequest
     * @return DescribeRuleDataSourcesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleDataSourcesResponse DescribeRuleDataSources(DescribeRuleDataSourcesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRuleDataSourcesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRuleDataSourcesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRuleDataSources");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *数据质量概览页面触发维度分布统计接口
     * @param req DescribeRuleDimStatRequest
     * @return DescribeRuleDimStatResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleDimStatResponse DescribeRuleDimStat(DescribeRuleDimStatRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRuleDimStatResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRuleDimStatResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRuleDimStat");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询规则执行结果详情
     * @param req DescribeRuleExecDetailRequest
     * @return DescribeRuleExecDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleExecDetailResponse DescribeRuleExecDetail(DescribeRuleExecDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRuleExecDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRuleExecDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRuleExecDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询规则执行导出结果
     * @param req DescribeRuleExecExportResultRequest
     * @return DescribeRuleExecExportResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleExecExportResultResponse DescribeRuleExecExportResult(DescribeRuleExecExportResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRuleExecExportResultResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRuleExecExportResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRuleExecExportResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询规则执行历史， 最近30条
     * @param req DescribeRuleExecHistoryRequest
     * @return DescribeRuleExecHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleExecHistoryResponse DescribeRuleExecHistory(DescribeRuleExecHistoryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRuleExecHistoryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRuleExecHistoryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRuleExecHistory");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *规则执行日志查询
     * @param req DescribeRuleExecLogRequest
     * @return DescribeRuleExecLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleExecLogResponse DescribeRuleExecLog(DescribeRuleExecLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRuleExecLogResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRuleExecLogResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRuleExecLog");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *规则执行结果列表查询
     * @param req DescribeRuleExecResultsRequest
     * @return DescribeRuleExecResultsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleExecResultsResponse DescribeRuleExecResults(DescribeRuleExecResultsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRuleExecResultsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRuleExecResultsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRuleExecResults");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *分页查询规则执行结果列表
     * @param req DescribeRuleExecResultsByPageRequest
     * @return DescribeRuleExecResultsByPageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleExecResultsByPageResponse DescribeRuleExecResultsByPage(DescribeRuleExecResultsByPageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRuleExecResultsByPageResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRuleExecResultsByPageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRuleExecResultsByPage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *数据质量概览页面规则运行情况接口
     * @param req DescribeRuleExecStatRequest
     * @return DescribeRuleExecStatResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleExecStatResponse DescribeRuleExecStat(DescribeRuleExecStatRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRuleExecStatResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRuleExecStatResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRuleExecStat");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询规则组详情接口
     * @param req DescribeRuleGroupRequest
     * @return DescribeRuleGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleGroupResponse DescribeRuleGroup(DescribeRuleGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRuleGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRuleGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRuleGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *规则组执行结果分页查询接口
     * @param req DescribeRuleGroupExecResultsByPageRequest
     * @return DescribeRuleGroupExecResultsByPageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleGroupExecResultsByPageResponse DescribeRuleGroupExecResultsByPage(DescribeRuleGroupExecResultsByPageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRuleGroupExecResultsByPageResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRuleGroupExecResultsByPageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRuleGroupExecResultsByPage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *规则组执行结果分页查询接口不带鉴权
     * @param req DescribeRuleGroupExecResultsByPageWithoutAuthRequest
     * @return DescribeRuleGroupExecResultsByPageWithoutAuthResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleGroupExecResultsByPageWithoutAuthResponse DescribeRuleGroupExecResultsByPageWithoutAuth(DescribeRuleGroupExecResultsByPageWithoutAuthRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRuleGroupExecResultsByPageWithoutAuthResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRuleGroupExecResultsByPageWithoutAuthResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRuleGroupExecResultsByPageWithoutAuth");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询规则组订阅信息
     * @param req DescribeRuleGroupSubscriptionRequest
     * @return DescribeRuleGroupSubscriptionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleGroupSubscriptionResponse DescribeRuleGroupSubscription(DescribeRuleGroupSubscriptionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRuleGroupSubscriptionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRuleGroupSubscriptionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRuleGroupSubscription");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询表绑定执行规则组信息
     * @param req DescribeRuleGroupTableRequest
     * @return DescribeRuleGroupTableResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleGroupTableResponse DescribeRuleGroupTable(DescribeRuleGroupTableRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRuleGroupTableResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRuleGroupTableResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRuleGroupTable");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        JsonResponseModel<DescribeRuleGroupsByPageResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRuleGroupsByPageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRuleGroupsByPage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *过滤条件【必要字段】{ruleId}
     * @param req DescribeRuleHistoryByPageRequest
     * @return DescribeRuleHistoryByPageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleHistoryByPageResponse DescribeRuleHistoryByPage(DescribeRuleHistoryByPageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRuleHistoryByPageResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRuleHistoryByPageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRuleHistoryByPage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取表列表
     * @param req DescribeRuleTablesByPageRequest
     * @return DescribeRuleTablesByPageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleTablesByPageResponse DescribeRuleTablesByPage(DescribeRuleTablesByPageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRuleTablesByPageResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRuleTablesByPageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRuleTablesByPage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询模板详情
     * @param req DescribeRuleTemplateRequest
     * @return DescribeRuleTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleTemplateResponse DescribeRuleTemplate(DescribeRuleTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRuleTemplateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRuleTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRuleTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询规则模版列表
     * @param req DescribeRuleTemplatesRequest
     * @return DescribeRuleTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleTemplatesResponse DescribeRuleTemplates(DescribeRuleTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRuleTemplatesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRuleTemplatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRuleTemplates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *过滤条件】 {模版名称Name,支持模糊匹配} {模版类型type，1.系统模版 2.自定义模版} {质量检测维度QualityDims, 1.准确性 2.唯一性 3.完整性 4.一致性 5.及时性 6.有效性} 【排序字段】 { 引用数排序类型CitationOrderType，根据引用数量排序 ASC DESC}
     * @param req DescribeRuleTemplatesByPageRequest
     * @return DescribeRuleTemplatesByPageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleTemplatesByPageResponse DescribeRuleTemplatesByPage(DescribeRuleTemplatesByPageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRuleTemplatesByPageResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRuleTemplatesByPageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRuleTemplatesByPage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询质量规则列表
     * @param req DescribeRulesRequest
     * @return DescribeRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRulesResponse DescribeRules(DescribeRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *分页查询质量规则
     * @param req DescribeRulesByPageRequest
     * @return DescribeRulesByPageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRulesByPageResponse DescribeRulesByPage(DescribeRulesByPageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRulesByPageResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRulesByPageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRulesByPage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *在基线系统内查询单个调度任务实例
     * @param req DescribeScheduleInstanceRequest
     * @return DescribeScheduleInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScheduleInstanceResponse DescribeScheduleInstance(DescribeScheduleInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScheduleInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeScheduleInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeScheduleInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取实例列表
     * @param req DescribeScheduleInstancesRequest
     * @return DescribeScheduleInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScheduleInstancesResponse DescribeScheduleInstances(DescribeScheduleInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScheduleInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeScheduleInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeScheduleInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *运维大屏-实例状态分布
     * @param req DescribeSchedulerInstanceStatusRequest
     * @return DescribeSchedulerInstanceStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSchedulerInstanceStatusResponse DescribeSchedulerInstanceStatus(DescribeSchedulerInstanceStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSchedulerInstanceStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSchedulerInstanceStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSchedulerInstanceStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *运维大屏-实例运行时长排行
     * @param req DescribeSchedulerRunTimeInstanceCntByStatusRequest
     * @return DescribeSchedulerRunTimeInstanceCntByStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSchedulerRunTimeInstanceCntByStatusResponse DescribeSchedulerRunTimeInstanceCntByStatus(DescribeSchedulerRunTimeInstanceCntByStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSchedulerRunTimeInstanceCntByStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSchedulerRunTimeInstanceCntByStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSchedulerRunTimeInstanceCntByStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *任务状态统计
     * @param req DescribeSchedulerTaskCntByStatusRequest
     * @return DescribeSchedulerTaskCntByStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSchedulerTaskCntByStatusResponse DescribeSchedulerTaskCntByStatus(DescribeSchedulerTaskCntByStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSchedulerTaskCntByStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSchedulerTaskCntByStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSchedulerTaskCntByStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *运维大屏-任务状态分布
     * @param req DescribeSchedulerTaskTypeCntRequest
     * @return DescribeSchedulerTaskTypeCntResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSchedulerTaskTypeCntResponse DescribeSchedulerTaskTypeCnt(DescribeSchedulerTaskTypeCntRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSchedulerTaskTypeCntResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSchedulerTaskTypeCntResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSchedulerTaskTypeCnt");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取关联子实例
     * @param req DescribeSonInstancesRequest
     * @return DescribeSonInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSonInstancesResponse DescribeSonInstances(DescribeSonInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSonInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSonInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSonInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取数据标准规则详情
     * @param req DescribeStandardRuleDetailInfoListRequest
     * @return DescribeStandardRuleDetailInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStandardRuleDetailInfoListResponse DescribeStandardRuleDetailInfoList(DescribeStandardRuleDetailInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStandardRuleDetailInfoListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeStandardRuleDetailInfoListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeStandardRuleDetailInfoList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *任务状态趋势
     * @param req DescribeStatisticInstanceStatusTrendOpsRequest
     * @return DescribeStatisticInstanceStatusTrendOpsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStatisticInstanceStatusTrendOpsResponse DescribeStatisticInstanceStatusTrendOps(DescribeStatisticInstanceStatusTrendOpsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStatisticInstanceStatusTrendOpsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeStatisticInstanceStatusTrendOpsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeStatisticInstanceStatusTrendOps");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询实时任务日志列表
     * @param req DescribeStreamTaskLogListRequest
     * @return DescribeStreamTaskLogListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamTaskLogListResponse DescribeStreamTaskLogList(DescribeStreamTaskLogListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStreamTaskLogListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeStreamTaskLogListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeStreamTaskLogList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取下游任务信息
     * @param req DescribeSuccessorOpsTaskInfosRequest
     * @return DescribeSuccessorOpsTaskInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSuccessorOpsTaskInfosResponse DescribeSuccessorOpsTaskInfos(DescribeSuccessorOpsTaskInfosRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSuccessorOpsTaskInfosResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSuccessorOpsTaskInfosResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSuccessorOpsTaskInfos");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取数据表信息
     * @param req DescribeTableInfoListRequest
     * @return DescribeTableInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTableInfoListResponse DescribeTableInfoList(DescribeTableInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTableInfoListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTableInfoListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTableInfoList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *列出表血缘信息
     * @param req DescribeTableLineageRequest
     * @return DescribeTableLineageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTableLineageResponse DescribeTableLineage(DescribeTableLineageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTableLineageResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTableLineageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTableLineage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *质量报告-查询表质量详情
     * @param req DescribeTableQualityDetailsRequest
     * @return DescribeTableQualityDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTableQualityDetailsResponse DescribeTableQualityDetails(DescribeTableQualityDetailsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTableQualityDetailsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTableQualityDetailsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTableQualityDetails");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取表schema信息
     * @param req DescribeTableSchemaInfoRequest
     * @return DescribeTableSchemaInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTableSchemaInfoResponse DescribeTableSchemaInfo(DescribeTableSchemaInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTableSchemaInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTableSchemaInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTableSchemaInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询表得分趋势
     * @param req DescribeTableScoreTrendRequest
     * @return DescribeTableScoreTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTableScoreTrendResponse DescribeTableScoreTrend(DescribeTableScoreTrendRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTableScoreTrendResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTableScoreTrendResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTableScoreTrend");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询任务告警规则列表
     * @param req DescribeTaskAlarmRegulationsRequest
     * @return DescribeTaskAlarmRegulationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskAlarmRegulationsResponse DescribeTaskAlarmRegulations(DescribeTaskAlarmRegulationsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskAlarmRegulationsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskAlarmRegulationsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTaskAlarmRegulations");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据周期类型 查询所有任务
     * @param req DescribeTaskByCycleRequest
     * @return DescribeTaskByCycleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskByCycleResponse DescribeTaskByCycle(DescribeTaskByCycleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskByCycleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskByCycleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTaskByCycle");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *任务状态周期增长趋势
     * @param req DescribeTaskByCycleReportRequest
     * @return DescribeTaskByCycleReportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskByCycleReportResponse DescribeTaskByCycleReport(DescribeTaskByCycleReportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskByCycleReportResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskByCycleReportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTaskByCycleReport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *任务状态趋势
     * @param req DescribeTaskByStatusReportRequest
     * @return DescribeTaskByStatusReportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskByStatusReportResponse DescribeTaskByStatusReport(DescribeTaskByStatusReportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskByStatusReportResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskByStatusReportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTaskByStatusReport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
查询任务具体详情
     * @param req DescribeTaskDetailRequest
     * @return DescribeTaskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskDetailResponse DescribeTaskDetail(DescribeTaskDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTaskDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *离线任务实例详情
     * @param req DescribeTaskInstanceRequest
     * @return DescribeTaskInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskInstanceResponse DescribeTaskInstance(DescribeTaskInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTaskInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *离线任务实例统计明细
     * @param req DescribeTaskInstanceReportDetailRequest
     * @return DescribeTaskInstanceReportDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskInstanceReportDetailResponse DescribeTaskInstanceReportDetail(DescribeTaskInstanceReportDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskInstanceReportDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskInstanceReportDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTaskInstanceReportDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询任务实例列表
     * @param req DescribeTaskInstancesRequest
     * @return DescribeTaskInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskInstancesResponse DescribeTaskInstances(DescribeTaskInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTaskInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查看任务锁状态信息
     * @param req DescribeTaskLockStatusRequest
     * @return DescribeTaskLockStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskLockStatusResponse DescribeTaskLockStatus(DescribeTaskLockStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskLockStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskLockStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTaskLockStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *按起止日期统计离线任务的所有实例的运行指标总和
     * @param req DescribeTaskReportRequest
     * @return DescribeTaskReportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskReportResponse DescribeTaskReport(DescribeTaskReportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskReportResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskReportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTaskReport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *离线任务周期统计明细
     * @param req DescribeTaskReportDetailListRequest
     * @return DescribeTaskReportDetailListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskReportDetailListResponse DescribeTaskReportDetailList(DescribeTaskReportDetailListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskReportDetailListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskReportDetailListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTaskReportDetailList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *分页查询任务运行历史
     * @param req DescribeTaskRunHistoryRequest
     * @return DescribeTaskRunHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskRunHistoryResponse DescribeTaskRunHistory(DescribeTaskRunHistoryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskRunHistoryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskRunHistoryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTaskRunHistory");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
查询任务脚本
     * @param req DescribeTaskScriptRequest
     * @return DescribeTaskScriptResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskScriptResponse DescribeTaskScript(DescribeTaskScriptRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskScriptResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskScriptResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTaskScript");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
根据工作流分页查询任务
     * @param req DescribeTasksByPageRequest
     * @return DescribeTasksByPageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTasksByPageResponse DescribeTasksByPage(DescribeTasksByPageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTasksByPageResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTasksByPageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTasksByPage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询规则模版维度分布情况
     * @param req DescribeTemplateDimCountRequest
     * @return DescribeTemplateDimCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTemplateDimCountResponse DescribeTemplateDimCount(DescribeTemplateDimCountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTemplateDimCountResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTemplateDimCountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTemplateDimCount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询规则模版操作记录
     * @param req DescribeTemplateHistoryRequest
     * @return DescribeTemplateHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTemplateHistoryResponse DescribeTemplateHistory(DescribeTemplateHistoryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTemplateHistoryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTemplateHistoryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTemplateHistory");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取第三方运行日志
     * @param req DescribeThirdTaskRunLogRequest
     * @return DescribeThirdTaskRunLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeThirdTaskRunLogResponse DescribeThirdTaskRunLog(DescribeThirdTaskRunLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeThirdTaskRunLogResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeThirdTaskRunLogResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeThirdTaskRunLog");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *数据质量概览页面表排行接口
     * @param req DescribeTopTableStatRequest
     * @return DescribeTopTableStatResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopTableStatResponse DescribeTopTableStat(DescribeTopTableStatRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTopTableStatResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTopTableStatResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTopTableStat");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *数据质量概览页面趋势变化接口
     * @param req DescribeTrendStatRequest
     * @return DescribeTrendStatResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrendStatResponse DescribeTrendStat(DescribeTrendStatRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTrendStatResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTrendStatResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTrendStat");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询工作流画布
     * @param req DescribeWorkflowCanvasInfoRequest
     * @return DescribeWorkflowCanvasInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkflowCanvasInfoResponse DescribeWorkflowCanvasInfo(DescribeWorkflowCanvasInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWorkflowCanvasInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWorkflowCanvasInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWorkflowCanvasInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询工作流画布运行起止时间
     * @param req DescribeWorkflowExecuteByIdRequest
     * @return DescribeWorkflowExecuteByIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkflowExecuteByIdResponse DescribeWorkflowExecuteById(DescribeWorkflowExecuteByIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWorkflowExecuteByIdResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWorkflowExecuteByIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWorkflowExecuteById");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过工作流id，查询工作流详情
     * @param req DescribeWorkflowInfoByIdRequest
     * @return DescribeWorkflowInfoByIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkflowInfoByIdResponse DescribeWorkflowInfoById(DescribeWorkflowInfoByIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWorkflowInfoByIdResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWorkflowInfoByIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWorkflowInfoById");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据项目id 获取项目下所有工作流列表
     * @param req DescribeWorkflowListByProjectIdRequest
     * @return DescribeWorkflowListByProjectIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkflowListByProjectIdResponse DescribeWorkflowListByProjectId(DescribeWorkflowListByProjectIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWorkflowListByProjectIdResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWorkflowListByProjectIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWorkflowListByProjectId");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询运维画布信息，只需要获取边和节点
     * @param req DescribeWorkflowOpsCanvasInfoRequest
     * @return DescribeWorkflowOpsCanvasInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkflowOpsCanvasInfoResponse DescribeWorkflowOpsCanvasInfo(DescribeWorkflowOpsCanvasInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWorkflowOpsCanvasInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWorkflowOpsCanvasInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWorkflowOpsCanvasInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询工作流任务数
     * @param req DescribeWorkflowTaskCountRequest
     * @return DescribeWorkflowTaskCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkflowTaskCountResponse DescribeWorkflowTaskCount(DescribeWorkflowTaskCountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWorkflowTaskCountResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWorkflowTaskCountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWorkflowTaskCount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *实例诊断信息
     * @param req DiagnosePlusRequest
     * @return DiagnosePlusResponse
     * @throws TencentCloudSDKException
     */
    public DiagnosePlusResponse DiagnosePlus(DiagnosePlusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DiagnosePlusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DiagnosePlusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DiagnosePlus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *调试运行集成任务
     * @param req DryRunDIOfflineTaskRequest
     * @return DryRunDIOfflineTaskResponse
     * @throws TencentCloudSDKException
     */
    public DryRunDIOfflineTaskResponse DryRunDIOfflineTask(DryRunDIOfflineTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DryRunDIOfflineTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DryRunDIOfflineTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DryRunDIOfflineTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *编辑基线
     * @param req EditBaselineRequest
     * @return EditBaselineResponse
     * @throws TencentCloudSDKException
     */
    public EditBaselineResponse EditBaseline(EditBaselineRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EditBaselineResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<EditBaselineResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EditBaseline");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
实例批量置成功
     * @param req ForceSucInstancesRequest
     * @return ForceSucInstancesResponse
     * @throws TencentCloudSDKException
     */
    public ForceSucInstancesResponse ForceSucInstances(ForceSucInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ForceSucInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ForceSucInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ForceSucInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *实例强制成功
     * @param req ForceSucScheduleInstancesRequest
     * @return ForceSucScheduleInstancesResponse
     * @throws TencentCloudSDKException
     */
    public ForceSucScheduleInstancesResponse ForceSucScheduleInstances(ForceSucScheduleInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ForceSucScheduleInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ForceSucScheduleInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ForceSucScheduleInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *任务运维-批量冻结任务
     * @param req FreezeOpsTasksRequest
     * @return FreezeOpsTasksResponse
     * @throws TencentCloudSDKException
     */
    public FreezeOpsTasksResponse FreezeOpsTasks(FreezeOpsTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<FreezeOpsTasksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<FreezeOpsTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "FreezeOpsTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
批量冻结任务
     * @param req FreezeTasksRequest
     * @return FreezeTasksResponse
     * @throws TencentCloudSDKException
     */
    public FreezeTasksResponse FreezeTasks(FreezeTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<FreezeTasksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<FreezeTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "FreezeTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
基于多个工作流进行批量冻结任务操作
     * @param req FreezeTasksByMultiWorkflowRequest
     * @return FreezeTasksByMultiWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public FreezeTasksByMultiWorkflowResponse FreezeTasksByMultiWorkflow(FreezeTasksByMultiWorkflowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<FreezeTasksByMultiWorkflowResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<FreezeTasksByMultiWorkflowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "FreezeTasksByMultiWorkflow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *暂停工作流下的所有任务
     * @param req FreezeTasksByWorkflowIdsRequest
     * @return FreezeTasksByWorkflowIdsResponse
     * @throws TencentCloudSDKException
     */
    public FreezeTasksByWorkflowIdsResponse FreezeTasksByWorkflowIds(FreezeTasksByWorkflowIdsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<FreezeTasksByWorkflowIdsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<FreezeTasksByWorkflowIdsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "FreezeTasksByWorkflowIds");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *生成建hive表的sql
     * @param req GenHiveTableDDLSqlRequest
     * @return GenHiveTableDDLSqlResponse
     * @throws TencentCloudSDKException
     */
    public GenHiveTableDDLSqlResponse GenHiveTableDDLSql(GenHiveTableDDLSqlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GenHiveTableDDLSqlResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GenHiveTableDDLSqlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GenHiveTableDDLSql");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提取数据集成节点字段Schema
     * @param req GetIntegrationNodeColumnSchemaRequest
     * @return GetIntegrationNodeColumnSchemaResponse
     * @throws TencentCloudSDKException
     */
    public GetIntegrationNodeColumnSchemaResponse GetIntegrationNodeColumnSchema(GetIntegrationNodeColumnSchemaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetIntegrationNodeColumnSchemaResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GetIntegrationNodeColumnSchemaResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetIntegrationNodeColumnSchema");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取离线任务实例列表(新)
     * @param req GetOfflineDIInstanceListRequest
     * @return GetOfflineDIInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public GetOfflineDIInstanceListResponse GetOfflineDIInstanceList(GetOfflineDIInstanceListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetOfflineDIInstanceListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GetOfflineDIInstanceListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetOfflineDIInstanceList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取离线任务实例
     * @param req GetOfflineInstanceListRequest
     * @return GetOfflineInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public GetOfflineInstanceListResponse GetOfflineInstanceList(GetOfflineInstanceListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetOfflineInstanceListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GetOfflineInstanceListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetOfflineInstanceList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
实例批量终止操作
     * @param req KillInstancesRequest
     * @return KillInstancesResponse
     * @throws TencentCloudSDKException
     */
    public KillInstancesResponse KillInstances(KillInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<KillInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<KillInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "KillInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *按补录计划批量终止实例。
     * @param req KillOpsMakePlanInstancesRequest
     * @return KillOpsMakePlanInstancesResponse
     * @throws TencentCloudSDKException
     */
    public KillOpsMakePlanInstancesResponse KillOpsMakePlanInstances(KillOpsMakePlanInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<KillOpsMakePlanInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<KillOpsMakePlanInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "KillOpsMakePlanInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量kill实例
     * @param req KillScheduleInstancesRequest
     * @return KillScheduleInstancesResponse
     * @throws TencentCloudSDKException
     */
    public KillScheduleInstancesResponse KillScheduleInstances(KillScheduleInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<KillScheduleInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<KillScheduleInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "KillScheduleInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *锁定集成任务
     * @param req LockIntegrationTaskRequest
     * @return LockIntegrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public LockIntegrationTaskResponse LockIntegrationTask(LockIntegrationTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<LockIntegrationTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<LockIntegrationTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "LockIntegrationTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *任务批量补录，调度状态任务才可以补录；
     * @param req MakeUpOpsTasksRequest
     * @return MakeUpOpsTasksResponse
     * @throws TencentCloudSDKException
     */
    public MakeUpOpsTasksResponse MakeUpOpsTasks(MakeUpOpsTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<MakeUpOpsTasksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<MakeUpOpsTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "MakeUpOpsTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *工作流补数据
     * @param req MakeUpTasksByWorkflowRequest
     * @return MakeUpTasksByWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public MakeUpTasksByWorkflowResponse MakeUpTasksByWorkflow(MakeUpTasksByWorkflowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<MakeUpTasksByWorkflowResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<MakeUpTasksByWorkflowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "MakeUpTasksByWorkflow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
任务批量补录，调度状态任务才可以补录；



     * @param req MakeUpTasksNewRequest
     * @return MakeUpTasksNewResponse
     * @throws TencentCloudSDKException
     */
    public MakeUpTasksNewResponse MakeUpTasksNew(MakeUpTasksNewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<MakeUpTasksNewResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<MakeUpTasksNewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "MakeUpTasksNew");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
工作流下所有任务的补录
     * @param req MakeUpWorkflowNewRequest
     * @return MakeUpWorkflowNewResponse
     * @throws TencentCloudSDKException
     */
    public MakeUpWorkflowNewResponse MakeUpWorkflowNew(MakeUpWorkflowNewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<MakeUpWorkflowNewResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<MakeUpWorkflowNewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "MakeUpWorkflowNew");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *编辑基线告警状态
     * @param req ModifyBaselineAlarmStatusRequest
     * @return ModifyBaselineAlarmStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBaselineAlarmStatusResponse ModifyBaselineAlarmStatus(ModifyBaselineAlarmStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyBaselineAlarmStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyBaselineAlarmStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyBaselineAlarmStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *编辑基线实例中任务告警状态
     * @param req ModifyBaselineTaskAlarmStatusRequest
     * @return ModifyBaselineTaskAlarmStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBaselineTaskAlarmStatusResponse ModifyBaselineTaskAlarmStatus(ModifyBaselineTaskAlarmStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyBaselineTaskAlarmStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyBaselineTaskAlarmStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyBaselineTaskAlarmStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
修改数据源
     * @param req ModifyDataSourceRequest
     * @return ModifyDataSourceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDataSourceResponse ModifyDataSource(ModifyDataSourceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDataSourceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDataSourceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDataSource");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *质量报告-修改维度权限
     * @param req ModifyDimensionWeightRequest
     * @return ModifyDimensionWeightResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDimensionWeightResponse ModifyDimensionWeight(ModifyDimensionWeightRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDimensionWeightResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDimensionWeightResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDimensionWeight");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新规则组执行策略
     * @param req ModifyExecStrategyRequest
     * @return ModifyExecStrategyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyExecStrategyResponse ModifyExecStrategy(ModifyExecStrategyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyExecStrategyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyExecStrategyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyExecStrategy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
文件夹更新
     * @param req ModifyFolderRequest
     * @return ModifyFolderResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFolderResponse ModifyFolder(ModifyFolderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyFolderResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyFolderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyFolder");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新集成节点
     * @param req ModifyIntegrationNodeRequest
     * @return ModifyIntegrationNodeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyIntegrationNodeResponse ModifyIntegrationNode(ModifyIntegrationNodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyIntegrationNodeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyIntegrationNodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyIntegrationNode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新集成任务
     * @param req ModifyIntegrationTaskRequest
     * @return ModifyIntegrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public ModifyIntegrationTaskResponse ModifyIntegrationTask(ModifyIntegrationTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyIntegrationTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyIntegrationTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyIntegrationTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新监控状态
     * @param req ModifyMonitorStatusRequest
     * @return ModifyMonitorStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMonitorStatusResponse ModifyMonitorStatus(ModifyMonitorStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyMonitorStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyMonitorStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyMonitorStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新质量规则接口
     * @param req ModifyRuleRequest
     * @return ModifyRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRuleResponse ModifyRule(ModifyRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新规则组订阅信息
     * @param req ModifyRuleGroupSubscriptionRequest
     * @return ModifyRuleGroupSubscriptionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRuleGroupSubscriptionResponse ModifyRuleGroupSubscription(ModifyRuleGroupSubscriptionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRuleGroupSubscriptionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRuleGroupSubscriptionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRuleGroupSubscription");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *编辑规则模版
     * @param req ModifyRuleTemplateRequest
     * @return ModifyRuleTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRuleTemplateResponse ModifyRuleTemplate(ModifyRuleTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRuleTemplateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRuleTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRuleTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改任务告警规则
     * @param req ModifyTaskAlarmRegularRequest
     * @return ModifyTaskAlarmRegularResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTaskAlarmRegularResponse ModifyTaskAlarmRegular(ModifyTaskAlarmRegularRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTaskAlarmRegularResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTaskAlarmRegularResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyTaskAlarmRegular");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
更新任务
     * @param req ModifyTaskInfoRequest
     * @return ModifyTaskInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTaskInfoResponse ModifyTaskInfo(ModifyTaskInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTaskInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTaskInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyTaskInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
添加父任务依赖
     * @param req ModifyTaskLinksRequest
     * @return ModifyTaskLinksResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTaskLinksResponse ModifyTaskLinks(ModifyTaskLinksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTaskLinksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTaskLinksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyTaskLinks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *重命名任务（任务编辑）
     * @param req ModifyTaskNameRequest
     * @return ModifyTaskNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTaskNameResponse ModifyTaskName(ModifyTaskNameRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTaskNameResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTaskNameResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyTaskName");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
修改任务脚本
     * @param req ModifyTaskScriptRequest
     * @return ModifyTaskScriptResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTaskScriptResponse ModifyTaskScript(ModifyTaskScriptRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTaskScriptResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTaskScriptResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyTaskScript");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
更新工作流
     * @param req ModifyWorkflowInfoRequest
     * @return ModifyWorkflowInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWorkflowInfoResponse ModifyWorkflowInfo(ModifyWorkflowInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyWorkflowInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyWorkflowInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyWorkflowInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
更新工作流调度
     * @param req ModifyWorkflowScheduleRequest
     * @return ModifyWorkflowScheduleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWorkflowScheduleResponse ModifyWorkflowSchedule(ModifyWorkflowScheduleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyWorkflowScheduleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyWorkflowScheduleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyWorkflowSchedule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
注册事件
     * @param req RegisterEventRequest
     * @return RegisterEventResponse
     * @throws TencentCloudSDKException
     */
    public RegisterEventResponse RegisterEvent(RegisterEventRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RegisterEventResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RegisterEventResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RegisterEvent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
注册事件监听器
     * @param req RegisterEventListenerRequest
     * @return RegisterEventListenerResponse
     * @throws TencentCloudSDKException
     */
    public RegisterEventListenerResponse RegisterEventListener(RegisterEventListenerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RegisterEventListenerResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RegisterEventListenerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RegisterEventListener");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除编排空间工作流
     * @param req RemoveWorkflowDsRequest
     * @return RemoveWorkflowDsResponse
     * @throws TencentCloudSDKException
     */
    public RemoveWorkflowDsResponse RemoveWorkflowDs(RemoveWorkflowDsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RemoveWorkflowDsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RemoveWorkflowDsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RemoveWorkflowDs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
实例批量重跑
     * @param req RerunInstancesRequest
     * @return RerunInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RerunInstancesResponse RerunInstances(RerunInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RerunInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RerunInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RerunInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *按补录计划批量重跑/选择补录计划→补录任务→补录实例，点击重跑
     * @param req RerunOpsMakePlanInstancesRequest
     * @return RerunOpsMakePlanInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RerunOpsMakePlanInstancesResponse RerunOpsMakePlanInstances(RerunOpsMakePlanInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RerunOpsMakePlanInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RerunOpsMakePlanInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RerunOpsMakePlanInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *实例批量重跑
     * @param req RerunScheduleInstancesRequest
     * @return RerunScheduleInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RerunScheduleInstancesResponse RerunScheduleInstances(RerunScheduleInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RerunScheduleInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RerunScheduleInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RerunScheduleInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *重启采集器
     * @param req RestartInLongAgentRequest
     * @return RestartInLongAgentResponse
     * @throws TencentCloudSDKException
     */
    public RestartInLongAgentResponse RestartInLongAgent(RestartInLongAgentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RestartInLongAgentResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RestartInLongAgentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RestartInLongAgent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *继续集成任务
     * @param req ResumeIntegrationTaskRequest
     * @return ResumeIntegrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public ResumeIntegrationTaskResponse ResumeIntegrationTask(ResumeIntegrationTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResumeIntegrationTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ResumeIntegrationTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResumeIntegrationTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *抢占锁定集成任务
     * @param req RobAndLockIntegrationTaskRequest
     * @return RobAndLockIntegrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public RobAndLockIntegrationTaskResponse RobAndLockIntegrationTask(RobAndLockIntegrationTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RobAndLockIntegrationTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RobAndLockIntegrationTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RobAndLockIntegrationTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
运行任务
     * @param req RunTaskRequest
     * @return RunTaskResponse
     * @throws TencentCloudSDKException
     */
    public RunTaskResponse RunTask(RunTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RunTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RunTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RunTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量启动工作流
     * @param req RunTasksByMultiWorkflowRequest
     * @return RunTasksByMultiWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public RunTasksByMultiWorkflowResponse RunTasksByMultiWorkflow(RunTasksByMultiWorkflowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RunTasksByMultiWorkflowResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RunTasksByMultiWorkflowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RunTasksByMultiWorkflow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *保存用户自定义函数
     * @param req SaveCustomFunctionRequest
     * @return SaveCustomFunctionResponse
     * @throws TencentCloudSDKException
     */
    public SaveCustomFunctionResponse SaveCustomFunction(SaveCustomFunctionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SaveCustomFunctionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SaveCustomFunctionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SaveCustomFunction");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
设置任务告警，新建/更新告警信息（最新）
     * @param req SetTaskAlarmNewRequest
     * @return SetTaskAlarmNewResponse
     * @throws TencentCloudSDKException
     */
    public SetTaskAlarmNewResponse SetTaskAlarmNew(SetTaskAlarmNewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetTaskAlarmNewResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SetTaskAlarmNewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetTaskAlarmNew");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *启动集成任务
     * @param req StartIntegrationTaskRequest
     * @return StartIntegrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public StartIntegrationTaskResponse StartIntegrationTask(StartIntegrationTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartIntegrationTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<StartIntegrationTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartIntegrationTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提交基线
     * @param req StopBaselineRequest
     * @return StopBaselineResponse
     * @throws TencentCloudSDKException
     */
    public StopBaselineResponse StopBaseline(StopBaselineRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopBaselineResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<StopBaselineResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopBaseline");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *停止集成任务
     * @param req StopIntegrationTaskRequest
     * @return StopIntegrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public StopIntegrationTaskResponse StopIntegrationTask(StopIntegrationTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopIntegrationTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<StopIntegrationTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopIntegrationTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提交基线
     * @param req SubmitBaselineRequest
     * @return SubmitBaselineResponse
     * @throws TencentCloudSDKException
     */
    public SubmitBaselineResponse SubmitBaseline(SubmitBaselineRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SubmitBaselineResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SubmitBaselineResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SubmitBaseline");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提交自定义函数
     * @param req SubmitCustomFunctionRequest
     * @return SubmitCustomFunctionResponse
     * @throws TencentCloudSDKException
     */
    public SubmitCustomFunctionResponse SubmitCustomFunction(SubmitCustomFunctionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SubmitCustomFunctionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SubmitCustomFunctionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SubmitCustomFunction");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *即席分析提交SQL任务
     * @param req SubmitSqlTaskRequest
     * @return SubmitSqlTaskResponse
     * @throws TencentCloudSDKException
     */
    public SubmitSqlTaskResponse SubmitSqlTask(SubmitSqlTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SubmitSqlTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SubmitSqlTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SubmitSqlTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
提交任务
     * @param req SubmitTaskRequest
     * @return SubmitTaskResponse
     * @throws TencentCloudSDKException
     */
    public SubmitTaskResponse SubmitTask(SubmitTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SubmitTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SubmitTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SubmitTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *无
     * @param req SubmitTaskTestRunRequest
     * @return SubmitTaskTestRunResponse
     * @throws TencentCloudSDKException
     */
    public SubmitTaskTestRunResponse SubmitTaskTestRun(SubmitTaskTestRunRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SubmitTaskTestRunResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SubmitTaskTestRunResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SubmitTaskTestRun");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
提交工作流
     * @param req SubmitWorkflowRequest
     * @return SubmitWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public SubmitWorkflowResponse SubmitWorkflow(SubmitWorkflowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SubmitWorkflowResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SubmitWorkflowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SubmitWorkflow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *暂停集成任务
     * @param req SuspendIntegrationTaskRequest
     * @return SuspendIntegrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public SuspendIntegrationTaskResponse SuspendIntegrationTask(SuspendIntegrationTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SuspendIntegrationTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SuspendIntegrationTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SuspendIntegrationTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询Inlong manager日志
     * @param req TaskLogRequest
     * @return TaskLogResponse
     * @throws TencentCloudSDKException
     */
    public TaskLogResponse TaskLog(TaskLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TaskLogResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<TaskLogResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TaskLog");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
触发事件
     * @param req TriggerEventRequest
     * @return TriggerEventResponse
     * @throws TencentCloudSDKException
     */
    public TriggerEventResponse TriggerEvent(TriggerEventRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TriggerEventResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<TriggerEventResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TriggerEvent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *解锁集成任务
     * @param req UnlockIntegrationTaskRequest
     * @return UnlockIntegrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public UnlockIntegrationTaskResponse UnlockIntegrationTask(UnlockIntegrationTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnlockIntegrationTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UnlockIntegrationTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnlockIntegrationTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新采集器
     * @param req UpdateInLongAgentRequest
     * @return UpdateInLongAgentResponse
     * @throws TencentCloudSDKException
     */
    public UpdateInLongAgentResponse UpdateInLongAgent(UpdateInLongAgentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateInLongAgentResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateInLongAgentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateInLongAgent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改工作流责任人
     * @param req UpdateWorkflowOwnerRequest
     * @return UpdateWorkflowOwnerResponse
     * @throws TencentCloudSDKException
     */
    public UpdateWorkflowOwnerResponse UpdateWorkflowOwner(UpdateWorkflowOwnerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateWorkflowOwnerResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateWorkflowOwnerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateWorkflowOwner");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *保存任务信息
     * @param req UploadContentRequest
     * @return UploadContentResponse
     * @throws TencentCloudSDKException
     */
    public UploadContentResponse UploadContent(UploadContentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UploadContentResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UploadContentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UploadContent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
