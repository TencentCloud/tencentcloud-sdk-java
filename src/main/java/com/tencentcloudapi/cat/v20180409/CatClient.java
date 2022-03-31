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
    private static String service = "cat";
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BindAlarmPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindAlarmPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAgentGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAgentGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量创建拨测任务
     * @param req CreateProbeTasksRequest
     * @return CreateProbeTasksResponse
     * @throws TencentCloudSDKException
     */
    public CreateProbeTasksResponse CreateProbeTasks(CreateProbeTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateProbeTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateProbeTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateProbeTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建拨测任务(扩展)
     * @param req CreateTaskExRequest
     * @return CreateTaskExResponse
     * @throws TencentCloudSDKException
     */
    public CreateTaskExResponse CreateTaskEx(CreateTaskExRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTaskExResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTaskExResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTaskEx");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAgentGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAgentGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除拨测任务
     * @param req DeleteProbeTaskRequest
     * @return DeleteProbeTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProbeTaskResponse DeleteProbeTask(DeleteProbeTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteProbeTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteProbeTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteProbeTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAgentGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAgentGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAgentsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAgents");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAlarmTopicResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAlarmTopic");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAlarmsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAlarms");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAlarmsByTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAlarmsByTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCatLogsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCatLogs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据时间范围、任务ID、运营商等条件查询单次拨测详情数据
     * @param req DescribeDetailedSingleProbeDataRequest
     * @return DescribeDetailedSingleProbeDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDetailedSingleProbeDataResponse DescribeDetailedSingleProbeData(DescribeDetailedSingleProbeDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDetailedSingleProbeDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDetailedSingleProbeDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDetailedSingleProbeData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *列出云拨测指标详细数据
     * @param req DescribeProbeMetricDataRequest
     * @return DescribeProbeMetricDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProbeMetricDataResponse DescribeProbeMetricData(DescribeProbeMetricDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProbeMetricDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProbeMetricDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProbeMetricData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询拨测节点
     * @param req DescribeProbeNodesRequest
     * @return DescribeProbeNodesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProbeNodesResponse DescribeProbeNodes(DescribeProbeNodesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProbeNodesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProbeNodesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProbeNodes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询拨测任务列表
     * @param req DescribeProbeTasksRequest
     * @return DescribeProbeTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProbeTasksResponse DescribeProbeTasks(DescribeProbeTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProbeTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProbeTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProbeTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
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
     *按类型查询拨测任务列表
     * @param req DescribeTasksByTypeRequest
     * @return DescribeTasksByTypeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTasksByTypeResponse DescribeTasksByType(DescribeTasksByTypeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTasksByTypeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTasksByTypeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTasksByType");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserLimitResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUserLimit");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetAvailRatioHistoryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetAvailRatioHistory");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetDailyAvailRatioResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetDailyAvailRatio");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetRealAvailRatioResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetRealAvailRatio");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetRespTimeTrendExResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetRespTimeTrendEx");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetResultSummaryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetResultSummary");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetReturnCodeHistoryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetReturnCodeHistory");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetReturnCodeInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetReturnCodeInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetTaskTotalNumberResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetTaskTotalNumber");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAgentGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAgentGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTaskExResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyTaskEx");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PauseTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PauseTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *恢复拨测任务
     * @param req ResumeProbeTaskRequest
     * @return ResumeProbeTaskResponse
     * @throws TencentCloudSDKException
     */
    public ResumeProbeTaskResponse ResumeProbeTask(ResumeProbeTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResumeProbeTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ResumeProbeTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResumeProbeTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
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
     *暂停拨测任务
     * @param req SuspendProbeTaskRequest
     * @return SuspendProbeTaskResponse
     * @throws TencentCloudSDKException
     */
    public SuspendProbeTaskResponse SuspendProbeTask(SuspendProbeTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SuspendProbeTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SuspendProbeTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SuspendProbeTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量更新拨测任务配置
     * @param req UpdateProbeTaskConfigurationListRequest
     * @return UpdateProbeTaskConfigurationListResponse
     * @throws TencentCloudSDKException
     */
    public UpdateProbeTaskConfigurationListResponse UpdateProbeTaskConfigurationList(UpdateProbeTaskConfigurationListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateProbeTaskConfigurationListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateProbeTaskConfigurationListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateProbeTaskConfigurationList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<VerifyResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "VerifyResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
