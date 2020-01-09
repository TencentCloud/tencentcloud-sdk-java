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
package com.tencentcloudapi.cat.v20180409;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cat.v20180409.models.*;

public class CatClient extends AbstractClient{
    private static String endpoint = "cat.tencentcloudapi.com";
    private static String version = "2018-04-09";

    public CatClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CatClient(Credential credential, String region, ClientProfile profile) {
        super(CatClient.endpoint, CatClient.version, credential, region, profile);
    }

    /**
     *绑定拨测任务和告警策略组
     * @param req BindAlarmPolicyRequest
     * @return BindAlarmPolicyResponse
     * @throws TencentCloudSDKException
     */
    public BindAlarmPolicyResponse BindAlarmPolicy(BindAlarmPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindAlarmPolicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<BindAlarmPolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "BindAlarmPolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加拨测分组
     * @param req CreateAgentGroupRequest
     * @return CreateAgentGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateAgentGroupResponse CreateAgentGroup(CreateAgentGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAgentGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAgentGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateAgentGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *为拨测任务创建告警策略
     * @param req CreateAlarmPloicyRequest
     * @return CreateAlarmPloicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateAlarmPloicyResponse CreateAlarmPloicy(CreateAlarmPloicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAlarmPloicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAlarmPloicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateAlarmPloicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建拨测任务（创建任务并发起验证）

操作提示：
下一步，请通过VerifyCatResult 接口，验证一下拨测验证是否成功。如果成功，则可通过RunTask 接口运行该任务。

     * @param req CreateTaskRequest
     * @return CreateTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateTaskResponse CreateTask(CreateTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTaskResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTaskResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateTask"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建拨测任务(扩充)
     * @param req CreateTaskExRequest
     * @return CreateTaskExResponse
     * @throws TencentCloudSDKException
     */
    public CreateTaskExResponse CreateTaskEx(CreateTaskExRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTaskExResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTaskExResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateTaskEx"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除拨测分组
     * @param req DeleteAgentGroupRequest
     * @return DeleteAgentGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAgentGroupResponse DeleteAgentGroup(DeleteAgentGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAgentGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAgentGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteAgentGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除多个拨测任务
     * @param req DeleteTasksRequest
     * @return DeleteTasksResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTasksResponse DeleteTasks(DeleteTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTasksResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTasksResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteTasks"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询拨测分组详情
     * @param req DescribeAgentGroupRequest
     * @return DescribeAgentGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentGroupResponse DescribeAgentGroup(DescribeAgentGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAgentGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAgentGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAgentGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询拨测分组列表
     * @param req DescribeAgentGroupsRequest
     * @return DescribeAgentGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentGroupsResponse DescribeAgentGroups(DescribeAgentGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAgentGroupsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAgentGroupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAgentGroups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询本用户可选的拨测点列表
     * @param req DescribeAgentsRequest
     * @return DescribeAgentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentsResponse DescribeAgents(DescribeAgentsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAgentsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAgentsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAgents"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询用户的告警接收组列表
     * @param req DescribeAlarmGroupsRequest
     * @return DescribeAlarmGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmGroupsResponse DescribeAlarmGroups(DescribeAlarmGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAlarmGroupsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAlarmGroupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAlarmGroups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询用户的告警主题列表
     * @param req DescribeAlarmTopicRequest
     * @return DescribeAlarmTopicResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmTopicResponse DescribeAlarmTopic(DescribeAlarmTopicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAlarmTopicResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAlarmTopicResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAlarmTopic"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询拨测告警列表
     * @param req DescribeAlarmsRequest
     * @return DescribeAlarmsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmsResponse DescribeAlarms(DescribeAlarmsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAlarmsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAlarmsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAlarms"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *按任务查询拨测告警列表
     * @param req DescribeAlarmsByTaskRequest
     * @return DescribeAlarmsByTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmsByTaskResponse DescribeAlarmsByTask(DescribeAlarmsByTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAlarmsByTaskResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAlarmsByTaskResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAlarmsByTask"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询拨测流水
     * @param req DescribeCatLogsRequest
     * @return DescribeCatLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCatLogsResponse DescribeCatLogs(DescribeCatLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCatLogsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCatLogsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCatLogs"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询拨测任务详情
     * @param req DescribeTaskRequest
     * @return DescribeTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskResponse DescribeTask(DescribeTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTask"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询拨测任务信息
     * @param req DescribeTaskDetailRequest
     * @return DescribeTaskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskDetailResponse DescribeTaskDetail(DescribeTaskDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskDetailResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskDetailResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTaskDetail"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询拨测任务列表
     * @param req DescribeTasksRequest
     * @return DescribeTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTasksResponse DescribeTasks(DescribeTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTasksResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTasksResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTasks"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *按类型查询拨测任务列表
     * @param req DescribeTasksByTypeRequest
     * @return DescribeTasksByTypeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTasksByTypeResponse DescribeTasksByType(DescribeTasksByTypeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTasksByTypeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTasksByTypeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTasksByType"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取用户可用资源限制
     * @param req DescribeUserLimitRequest
     * @return DescribeUserLimitResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserLimitResponse DescribeUserLimit(DescribeUserLimitRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserLimitResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserLimitResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeUserLimit"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取指定时刻的可用率地图信息
     * @param req GetAvailRatioHistoryRequest
     * @return GetAvailRatioHistoryResponse
     * @throws TencentCloudSDKException
     */
    public GetAvailRatioHistoryResponse GetAvailRatioHistory(GetAvailRatioHistoryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetAvailRatioHistoryResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetAvailRatioHistoryResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetAvailRatioHistory"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取一天的整体可用率信息
     * @param req GetDailyAvailRatioRequest
     * @return GetDailyAvailRatioResponse
     * @throws TencentCloudSDKException
     */
    public GetDailyAvailRatioResponse GetDailyAvailRatio(GetDailyAvailRatioRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetDailyAvailRatioResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetDailyAvailRatioResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetDailyAvailRatio"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取实时可用率信息
     * @param req GetRealAvailRatioRequest
     * @return GetRealAvailRatioResponse
     * @throws TencentCloudSDKException
     */
    public GetRealAvailRatioResponse GetRealAvailRatio(GetRealAvailRatioRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetRealAvailRatioResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetRealAvailRatioResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetRealAvailRatio"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询拨测任务的统计数据
     * @param req GetRespTimeTrendRequest
     * @return GetRespTimeTrendResponse
     * @throws TencentCloudSDKException
     */
    public GetRespTimeTrendResponse GetRespTimeTrend(GetRespTimeTrendRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetRespTimeTrendResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetRespTimeTrendResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetRespTimeTrend"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询拨测任务的走势数据
     * @param req GetRespTimeTrendExRequest
     * @return GetRespTimeTrendExResponse
     * @throws TencentCloudSDKException
     */
    public GetRespTimeTrendExResponse GetRespTimeTrendEx(GetRespTimeTrendExRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetRespTimeTrendExResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetRespTimeTrendExResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetRespTimeTrendEx"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取任务列表的实时数据
     * @param req GetResultSummaryRequest
     * @return GetResultSummaryResponse
     * @throws TencentCloudSDKException
     */
    public GetResultSummaryResponse GetResultSummary(GetResultSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetResultSummaryResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetResultSummaryResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetResultSummary"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询拨测任务的历史返回码信息
     * @param req GetReturnCodeHistoryRequest
     * @return GetReturnCodeHistoryResponse
     * @throws TencentCloudSDKException
     */
    public GetReturnCodeHistoryResponse GetReturnCodeHistory(GetReturnCodeHistoryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetReturnCodeHistoryResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetReturnCodeHistoryResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetReturnCodeHistory"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询拨测任务的返回码统计信息
     * @param req GetReturnCodeInfoRequest
     * @return GetReturnCodeInfoResponse
     * @throws TencentCloudSDKException
     */
    public GetReturnCodeInfoResponse GetReturnCodeInfo(GetReturnCodeInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetReturnCodeInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetReturnCodeInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetReturnCodeInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取AppId下的拨测任务总数
     * @param req GetTaskTotalNumberRequest
     * @return GetTaskTotalNumberResponse
     * @throws TencentCloudSDKException
     */
    public GetTaskTotalNumberResponse GetTaskTotalNumber(GetTaskTotalNumberRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetTaskTotalNumberResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetTaskTotalNumberResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetTaskTotalNumber"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改拨测分组
     * @param req ModifyAgentGroupRequest
     * @return ModifyAgentGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAgentGroupResponse ModifyAgentGroup(ModifyAgentGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAgentGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAgentGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyAgentGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *为拨测任务修改告警策略
     * @param req ModifyAlarmPloicyRequest
     * @return ModifyAlarmPloicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmPloicyResponse ModifyAlarmPloicy(ModifyAlarmPloicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAlarmPloicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAlarmPloicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyAlarmPloicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改 拨测任务。
如果验证未成功，请先验证成功。避免修改为失败率100%的拨测任务。

     * @param req ModifyTaskRequest
     * @return ModifyTaskResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTaskResponse ModifyTask(ModifyTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTaskResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTaskResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyTask"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改拨测任务(扩展)
     * @param req ModifyTaskExRequest
     * @return ModifyTaskExResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTaskExResponse ModifyTaskEx(ModifyTaskExRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTaskExResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTaskExResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyTaskEx"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *暂停拨测任务
     * @param req PauseTaskRequest
     * @return PauseTaskResponse
     * @throws TencentCloudSDKException
     */
    public PauseTaskResponse PauseTask(PauseTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PauseTaskResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<PauseTaskResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "PauseTask"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *运行拨测任务
     * @param req RunTaskRequest
     * @return RunTaskResponse
     * @throws TencentCloudSDKException
     */
    public RunTaskResponse RunTask(RunTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RunTaskResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RunTaskResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RunTask"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *验证拨测任务，结果验证查询（验证成功的，才建议创建拨测任务）
     * @param req VerifyResultRequest
     * @return VerifyResultResponse
     * @throws TencentCloudSDKException
     */
    public VerifyResultResponse VerifyResult(VerifyResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<VerifyResultResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<VerifyResultResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "VerifyResult"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
