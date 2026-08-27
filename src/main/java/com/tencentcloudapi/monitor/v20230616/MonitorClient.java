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
package com.tencentcloudapi.monitor.v20230616;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.monitor.v20230616.models.*;

public class MonitorClient extends AbstractClient{
    private static String endpoint = "monitor.tencentcloudapi.com";
    private static String service = "monitor";
    private static String version = "2023-06-16";

    public MonitorClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public MonitorClient(Credential credential, String region, ClientProfile profile) {
        super(MonitorClient.endpoint, MonitorClient.version, credential, region, profile);
    }

    /**
     *取消对话执行
     * @param req CancelAIWorkbenchChatRequest
     * @return CancelAIWorkbenchChatResponse
     * @throws TencentCloudSDKException
     */
    public CancelAIWorkbenchChatResponse CancelAIWorkbenchChat(CancelAIWorkbenchChatRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelAIWorkbenchChat", CancelAIWorkbenchChatResponse.class);
    }

    /**
     *创建 Agent
     * @param req CreateAIWorkbenchAgentRequest
     * @return CreateAIWorkbenchAgentResponse
     * @throws TencentCloudSDKException
     */
    public CreateAIWorkbenchAgentResponse CreateAIWorkbenchAgent(CreateAIWorkbenchAgentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAIWorkbenchAgent", CreateAIWorkbenchAgentResponse.class);
    }

    /**
     *创建任务
     * @param req CreateAIWorkbenchTaskRequest
     * @return CreateAIWorkbenchTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateAIWorkbenchTaskResponse CreateAIWorkbenchTask(CreateAIWorkbenchTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAIWorkbenchTask", CreateAIWorkbenchTaskResponse.class);
    }

    /**
     *转发接口：创建转发规则
     * @param req CreateDispenseExternalRuleRequest
     * @return CreateDispenseExternalRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateDispenseExternalRuleResponse CreateDispenseExternalRule(CreateDispenseExternalRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDispenseExternalRule", CreateDispenseExternalRuleResponse.class);
    }

    /**
     *创建自定义通知内容模板
     * @param req CreateNoticeContentTmplRequest
     * @return CreateNoticeContentTmplResponse
     * @throws TencentCloudSDKException
     */
    public CreateNoticeContentTmplResponse CreateNoticeContentTmpl(CreateNoticeContentTmplRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNoticeContentTmpl", CreateNoticeContentTmplResponse.class);
    }

    /**
     *删除 Agent
     * @param req DeleteAIWorkbenchAgentRequest
     * @return DeleteAIWorkbenchAgentResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAIWorkbenchAgentResponse DeleteAIWorkbenchAgent(DeleteAIWorkbenchAgentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAIWorkbenchAgent", DeleteAIWorkbenchAgentResponse.class);
    }

    /**
     *删除任务
     * @param req DeleteAIWorkbenchTaskRequest
     * @return DeleteAIWorkbenchTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAIWorkbenchTaskResponse DeleteAIWorkbenchTask(DeleteAIWorkbenchTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAIWorkbenchTask", DeleteAIWorkbenchTaskResponse.class);
    }

    /**
     *规则删除接口
     * @param req DeleteDispenseExternalRuleRequest
     * @return DeleteDispenseExternalRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDispenseExternalRuleResponse DeleteDispenseExternalRule(DeleteDispenseExternalRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDispenseExternalRule", DeleteDispenseExternalRuleResponse.class);
    }

    /**
     *删除通知内容模板
     * @param req DeleteNoticeContentTmplsRequest
     * @return DeleteNoticeContentTmplsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNoticeContentTmplsResponse DeleteNoticeContentTmpls(DeleteNoticeContentTmplsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNoticeContentTmpls", DeleteNoticeContentTmplsResponse.class);
    }

    /**
     *查询 Agent 详情
     * @param req DescribeAIWorkbenchAgentRequest
     * @return DescribeAIWorkbenchAgentResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIWorkbenchAgentResponse DescribeAIWorkbenchAgent(DescribeAIWorkbenchAgentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAIWorkbenchAgent", DescribeAIWorkbenchAgentResponse.class);
    }

    /**
     *查询制品详情
     * @param req DescribeAIWorkbenchArtifactRequest
     * @return DescribeAIWorkbenchArtifactResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIWorkbenchArtifactResponse DescribeAIWorkbenchArtifact(DescribeAIWorkbenchArtifactRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAIWorkbenchArtifact", DescribeAIWorkbenchArtifactResponse.class);
    }

    /**
     *查询执行详情
     * @param req DescribeAIWorkbenchExecutionRequest
     * @return DescribeAIWorkbenchExecutionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIWorkbenchExecutionResponse DescribeAIWorkbenchExecution(DescribeAIWorkbenchExecutionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAIWorkbenchExecution", DescribeAIWorkbenchExecutionResponse.class);
    }

    /**
     *查询AI工作台SRE数字分身任务列表
     * @param req DescribeAIWorkbenchSREDigitalTwinTaskListRequest
     * @return DescribeAIWorkbenchSREDigitalTwinTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIWorkbenchSREDigitalTwinTaskListResponse DescribeAIWorkbenchSREDigitalTwinTaskList(DescribeAIWorkbenchSREDigitalTwinTaskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAIWorkbenchSREDigitalTwinTaskList", DescribeAIWorkbenchSREDigitalTwinTaskListResponse.class);
    }

    /**
     *查询AI工作台SRE数字分身工作日志详细信息
     * @param req DescribeAIWorkbenchSREDigitalTwinWorkLogDetailRequest
     * @return DescribeAIWorkbenchSREDigitalTwinWorkLogDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIWorkbenchSREDigitalTwinWorkLogDetailResponse DescribeAIWorkbenchSREDigitalTwinWorkLogDetail(DescribeAIWorkbenchSREDigitalTwinWorkLogDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAIWorkbenchSREDigitalTwinWorkLogDetail", DescribeAIWorkbenchSREDigitalTwinWorkLogDetailResponse.class);
    }

    /**
     *查询AI工作台SRE数字分身任务工作日志列表
     * @param req DescribeAIWorkbenchSREDigitalTwinWorkLogListRequest
     * @return DescribeAIWorkbenchSREDigitalTwinWorkLogListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIWorkbenchSREDigitalTwinWorkLogListResponse DescribeAIWorkbenchSREDigitalTwinWorkLogList(DescribeAIWorkbenchSREDigitalTwinWorkLogListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAIWorkbenchSREDigitalTwinWorkLogList", DescribeAIWorkbenchSREDigitalTwinWorkLogListResponse.class);
    }

    /**
     *查询会话详情
     * @param req DescribeAIWorkbenchSessionRequest
     * @return DescribeAIWorkbenchSessionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIWorkbenchSessionResponse DescribeAIWorkbenchSession(DescribeAIWorkbenchSessionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAIWorkbenchSession", DescribeAIWorkbenchSessionResponse.class);
    }

    /**
     *查询技能详情
     * @param req DescribeAIWorkbenchSkillRequest
     * @return DescribeAIWorkbenchSkillResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIWorkbenchSkillResponse DescribeAIWorkbenchSkill(DescribeAIWorkbenchSkillRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAIWorkbenchSkill", DescribeAIWorkbenchSkillResponse.class);
    }

    /**
     *按需查询告警的通知历史
     * @param req DescribeAlarmNotifyHistoriesRequest
     * @return DescribeAlarmNotifyHistoriesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmNotifyHistoriesResponse DescribeAlarmNotifyHistories(DescribeAlarmNotifyHistoriesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlarmNotifyHistories", DescribeAlarmNotifyHistoriesResponse.class);
    }

    /**
     *转发规则查询接口
     * @param req DescribeDispenseExternalRuleRequest
     * @return DescribeDispenseExternalRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDispenseExternalRuleResponse DescribeDispenseExternalRule(DescribeDispenseExternalRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDispenseExternalRule", DescribeDispenseExternalRuleResponse.class);
    }

    /**
     *查询所有列表
     * @param req DescribeDispenseExternalRuleListRequest
     * @return DescribeDispenseExternalRuleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDispenseExternalRuleListResponse DescribeDispenseExternalRuleList(DescribeDispenseExternalRuleListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDispenseExternalRuleList", DescribeDispenseExternalRuleListResponse.class);
    }

    /**
     *转发地域列表查询接口
     * @param req DescribeDispenseRegionRequest
     * @return DescribeDispenseRegionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDispenseRegionResponse DescribeDispenseRegion(DescribeDispenseRegionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDispenseRegion", DescribeDispenseRegionResponse.class);
    }

    /**
     *查询对外指标
     * @param req DescribeExtMetricRequest
     * @return DescribeExtMetricResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExtMetricResponse DescribeExtMetric(DescribeExtMetricRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExtMetric", DescribeExtMetricResponse.class);
    }

    /**
     *转发查询对外命名空间接口
     * @param req DescribeExtNamespaceRequest
     * @return DescribeExtNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExtNamespaceResponse DescribeExtNamespace(DescribeExtNamespaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExtNamespace", DescribeExtNamespaceResponse.class);
    }

    /**
     *转发kafka连通性测试
     * @param req DescribeKafkaRequest
     * @return DescribeKafkaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKafkaResponse DescribeKafka(DescribeKafkaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeKafka", DescribeKafkaResponse.class);
    }

    /**
     *根据查询条件获取自定义通知内容模板，若所有查询条件空，则获取账号下所有模板
     * @param req DescribeNoticeContentTmplRequest
     * @return DescribeNoticeContentTmplResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNoticeContentTmplResponse DescribeNoticeContentTmpl(DescribeNoticeContentTmplRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNoticeContentTmpl", DescribeNoticeContentTmplResponse.class);
    }

    /**
     *获取AI工作台制品的下载地址
     * @param req GetAIWorkbenchArtifactDownloadURLRequest
     * @return GetAIWorkbenchArtifactDownloadURLResponse
     * @throws TencentCloudSDKException
     */
    public GetAIWorkbenchArtifactDownloadURLResponse GetAIWorkbenchArtifactDownloadURL(GetAIWorkbenchArtifactDownloadURLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetAIWorkbenchArtifactDownloadURL", GetAIWorkbenchArtifactDownloadURLResponse.class);
    }

    /**
     *查询 Agent 列表
     * @param req ListAIWorkbenchAgentsRequest
     * @return ListAIWorkbenchAgentsResponse
     * @throws TencentCloudSDKException
     */
    public ListAIWorkbenchAgentsResponse ListAIWorkbenchAgents(ListAIWorkbenchAgentsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAIWorkbenchAgents", ListAIWorkbenchAgentsResponse.class);
    }

    /**
     *查询产物列表
     * @param req ListAIWorkbenchArtifactsRequest
     * @return ListAIWorkbenchArtifactsResponse
     * @throws TencentCloudSDKException
     */
    public ListAIWorkbenchArtifactsResponse ListAIWorkbenchArtifacts(ListAIWorkbenchArtifactsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAIWorkbenchArtifacts", ListAIWorkbenchArtifactsResponse.class);
    }

    /**
     *查询执行列表
     * @param req ListAIWorkbenchExecutionsRequest
     * @return ListAIWorkbenchExecutionsResponse
     * @throws TencentCloudSDKException
     */
    public ListAIWorkbenchExecutionsResponse ListAIWorkbenchExecutions(ListAIWorkbenchExecutionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAIWorkbenchExecutions", ListAIWorkbenchExecutionsResponse.class);
    }

    /**
     *查询 MCP 列表
     * @param req ListAIWorkbenchMCPsRequest
     * @return ListAIWorkbenchMCPsResponse
     * @throws TencentCloudSDKException
     */
    public ListAIWorkbenchMCPsResponse ListAIWorkbenchMCPs(ListAIWorkbenchMCPsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAIWorkbenchMCPs", ListAIWorkbenchMCPsResponse.class);
    }

    /**
     *查询消息列表
     * @param req ListAIWorkbenchMessagesRequest
     * @return ListAIWorkbenchMessagesResponse
     * @throws TencentCloudSDKException
     */
    public ListAIWorkbenchMessagesResponse ListAIWorkbenchMessages(ListAIWorkbenchMessagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAIWorkbenchMessages", ListAIWorkbenchMessagesResponse.class);
    }

    /**
     *列出资源实例
     * @param req ListAIWorkbenchResourceInstancesRequest
     * @return ListAIWorkbenchResourceInstancesResponse
     * @throws TencentCloudSDKException
     */
    public ListAIWorkbenchResourceInstancesResponse ListAIWorkbenchResourceInstances(ListAIWorkbenchResourceInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAIWorkbenchResourceInstances", ListAIWorkbenchResourceInstancesResponse.class);
    }

    /**
     *查询资源地图列表
     * @param req ListAIWorkbenchResourceMapsRequest
     * @return ListAIWorkbenchResourceMapsResponse
     * @throws TencentCloudSDKException
     */
    public ListAIWorkbenchResourceMapsResponse ListAIWorkbenchResourceMaps(ListAIWorkbenchResourceMapsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAIWorkbenchResourceMaps", ListAIWorkbenchResourceMapsResponse.class);
    }

    /**
     *查询会话列表
     * @param req ListAIWorkbenchSessionsRequest
     * @return ListAIWorkbenchSessionsResponse
     * @throws TencentCloudSDKException
     */
    public ListAIWorkbenchSessionsResponse ListAIWorkbenchSessions(ListAIWorkbenchSessionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAIWorkbenchSessions", ListAIWorkbenchSessionsResponse.class);
    }

    /**
     *查询技能列表
     * @param req ListAIWorkbenchSkillsRequest
     * @return ListAIWorkbenchSkillsResponse
     * @throws TencentCloudSDKException
     */
    public ListAIWorkbenchSkillsResponse ListAIWorkbenchSkills(ListAIWorkbenchSkillsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAIWorkbenchSkills", ListAIWorkbenchSkillsResponse.class);
    }

    /**
     *查询任务列表
     * @param req ListAIWorkbenchTasksRequest
     * @return ListAIWorkbenchTasksResponse
     * @throws TencentCloudSDKException
     */
    public ListAIWorkbenchTasksResponse ListAIWorkbenchTasks(ListAIWorkbenchTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAIWorkbenchTasks", ListAIWorkbenchTasksResponse.class);
    }

    /**
     *转发规则更新接口
     * @param req ModifyDispenseExternalRuleRequest
     * @return ModifyDispenseExternalRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDispenseExternalRuleResponse ModifyDispenseExternalRule(ModifyDispenseExternalRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDispenseExternalRule", ModifyDispenseExternalRuleResponse.class);
    }

    /**
     *新增规则开启关闭接口
     * @param req ModifyDispenseExternalRuleStatusRequest
     * @return ModifyDispenseExternalRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDispenseExternalRuleStatusResponse ModifyDispenseExternalRuleStatus(ModifyDispenseExternalRuleStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDispenseExternalRuleStatus", ModifyDispenseExternalRuleStatusResponse.class);
    }

    /**
     *修改通知内容模板
     * @param req ModifyNoticeContentTmplRequest
     * @return ModifyNoticeContentTmplResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNoticeContentTmplResponse ModifyNoticeContentTmpl(ModifyNoticeContentTmplRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNoticeContentTmpl", ModifyNoticeContentTmplResponse.class);
    }

    /**
     *触发数字分身任务请求
     * @param req TriggerAIWorkbenchSREDigitalTwinTaskRequest
     * @return TriggerAIWorkbenchSREDigitalTwinTaskResponse
     * @throws TencentCloudSDKException
     */
    public TriggerAIWorkbenchSREDigitalTwinTaskResponse TriggerAIWorkbenchSREDigitalTwinTask(TriggerAIWorkbenchSREDigitalTwinTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TriggerAIWorkbenchSREDigitalTwinTask", TriggerAIWorkbenchSREDigitalTwinTaskResponse.class);
    }

    /**
     *手动触发任务
     * @param req TriggerAIWorkbenchTaskRequest
     * @return TriggerAIWorkbenchTaskResponse
     * @throws TencentCloudSDKException
     */
    public TriggerAIWorkbenchTaskResponse TriggerAIWorkbenchTask(TriggerAIWorkbenchTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TriggerAIWorkbenchTask", TriggerAIWorkbenchTaskResponse.class);
    }

    /**
     *更新 Agent
     * @param req UpdateAIWorkbenchAgentRequest
     * @return UpdateAIWorkbenchAgentResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAIWorkbenchAgentResponse UpdateAIWorkbenchAgent(UpdateAIWorkbenchAgentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAIWorkbenchAgent", UpdateAIWorkbenchAgentResponse.class);
    }

}
