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
package com.tencentcloudapi.monitor.v20180724;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.monitor.v20180724.models.*;

public class MonitorClient extends AbstractClient{
    private static String endpoint = "monitor.tencentcloudapi.com";
    private static String service = "monitor";
    private static String version = "2018-07-24";

    public MonitorClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public MonitorClient(Credential credential, String region, ClientProfile profile) {
        super(MonitorClient.endpoint, MonitorClient.version, credential, region, profile);
    }

    /**
     *将告警策略绑定到特定对象
     * @param req BindingPolicyObjectRequest
     * @return BindingPolicyObjectResponse
     * @throws TencentCloudSDKException
     */
    public BindingPolicyObjectResponse BindingPolicyObject(BindingPolicyObjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindingPolicyObjectResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BindingPolicyObjectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindingPolicyObject");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *策略绑定标签
     * @param req BindingPolicyTagRequest
     * @return BindingPolicyTagResponse
     * @throws TencentCloudSDKException
     */
    public BindingPolicyTagResponse BindingPolicyTag(BindingPolicyTagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindingPolicyTagResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BindingPolicyTagResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindingPolicyTag");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建通知模板
     * @param req CreateAlarmNoticeRequest
     * @return CreateAlarmNoticeResponse
     * @throws TencentCloudSDKException
     */
    public CreateAlarmNoticeResponse CreateAlarmNotice(CreateAlarmNoticeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAlarmNoticeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAlarmNoticeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAlarmNotice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建云监控告警策略
     * @param req CreateAlarmPolicyRequest
     * @return CreateAlarmPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateAlarmPolicyResponse CreateAlarmPolicy(CreateAlarmPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAlarmPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAlarmPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAlarmPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建 Prometheus 告警规则。

请注意，**告警对象和告警消息是 Prometheus Rule Annotations 的特殊字段，需要通过 annotations 来传递，对应的 Key 分别为summary/description**，，请参考 [Prometheus Rule更多配置请参考](https://prometheus.io/docs/prometheus/latest/configuration/alerting_rules/)。
     * @param req CreateAlertRuleRequest
     * @return CreateAlertRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateAlertRuleResponse CreateAlertRule(CreateAlertRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAlertRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAlertRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAlertRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *增加策略组
     * @param req CreatePolicyGroupRequest
     * @return CreatePolicyGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreatePolicyGroupResponse CreatePolicyGroup(CreatePolicyGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePolicyGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePolicyGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePolicyGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *在腾讯云容器服务下创建 Prometheus 服务发现。
<p>注意：前提条件，已经通过 Prometheus 控制台集成了对应的腾讯云容器服务，具体请参考
<a href="https://cloud.tencent.com/document/product/248/48859" target="_blank">Agent 安装</a>。</p>
     * @param req CreateServiceDiscoveryRequest
     * @return CreateServiceDiscoveryResponse
     * @throws TencentCloudSDKException
     */
    public CreateServiceDiscoveryResponse CreateServiceDiscovery(CreateServiceDiscoveryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateServiceDiscoveryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateServiceDiscoveryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateServiceDiscovery");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云监控告警删除告警通知模板
     * @param req DeleteAlarmNoticesRequest
     * @return DeleteAlarmNoticesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAlarmNoticesResponse DeleteAlarmNotices(DeleteAlarmNoticesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAlarmNoticesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAlarmNoticesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAlarmNotices");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除告警策略
     * @param req DeleteAlarmPolicyRequest
     * @return DeleteAlarmPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAlarmPolicyResponse DeleteAlarmPolicy(DeleteAlarmPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAlarmPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAlarmPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAlarmPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量删除 Prometheus 报警规则
     * @param req DeleteAlertRulesRequest
     * @return DeleteAlertRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAlertRulesResponse DeleteAlertRules(DeleteAlertRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAlertRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAlertRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAlertRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除告警策略组
     * @param req DeletePolicyGroupRequest
     * @return DeletePolicyGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeletePolicyGroupResponse DeletePolicyGroup(DeletePolicyGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeletePolicyGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePolicyGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeletePolicyGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除在腾讯云容器服务下创建的 Prometheus 服务发现。
<p>注意：前提条件，已经通过 Prometheus 控制台集成了对应的腾讯云容器服务，具体请参考
<a href="https://cloud.tencent.com/document/product/248/48859" target="_blank">Agent 安装</a>。</p>
     * @param req DeleteServiceDiscoveryRequest
     * @return DeleteServiceDiscoveryResponse
     * @throws TencentCloudSDKException
     */
    public DeleteServiceDiscoveryResponse DeleteServiceDiscovery(DeleteServiceDiscoveryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteServiceDiscoveryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteServiceDiscoveryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteServiceDiscovery");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取平台事件列表
     * @param req DescribeAccidentEventListRequest
     * @return DescribeAccidentEventListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccidentEventListResponse DescribeAccidentEventList(DescribeAccidentEventListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccidentEventListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAccidentEventListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAccidentEventList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询告警事件列表
     * @param req DescribeAlarmEventsRequest
     * @return DescribeAlarmEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmEventsResponse DescribeAlarmEvents(DescribeAlarmEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAlarmEventsResponse> rsp = null;
        String rspStr = "";
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
     *查询告警历史

请注意，**如果使用子用户进行告警历史的查询，只能查询到被授权项目下的告警历史**，或不区分项目的产品的告警历史。如何对子账户授予项目的权限，请参考 [访问管理-项目与标签](https://cloud.tencent.com/document/product/598/32738)。
     * @param req DescribeAlarmHistoriesRequest
     * @return DescribeAlarmHistoriesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmHistoriesResponse DescribeAlarmHistories(DescribeAlarmHistoriesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAlarmHistoriesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAlarmHistoriesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAlarmHistories");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询告警指标列表
     * @param req DescribeAlarmMetricsRequest
     * @return DescribeAlarmMetricsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmMetricsResponse DescribeAlarmMetrics(DescribeAlarmMetricsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAlarmMetricsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAlarmMetricsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAlarmMetrics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询单个通知模板的详情
     * @param req DescribeAlarmNoticeRequest
     * @return DescribeAlarmNoticeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmNoticeResponse DescribeAlarmNotice(DescribeAlarmNoticeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAlarmNoticeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAlarmNoticeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAlarmNotice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云监控告警获取告警通知模板所有回调URL
     * @param req DescribeAlarmNoticeCallbacksRequest
     * @return DescribeAlarmNoticeCallbacksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmNoticeCallbacksResponse DescribeAlarmNoticeCallbacks(DescribeAlarmNoticeCallbacksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAlarmNoticeCallbacksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAlarmNoticeCallbacksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAlarmNoticeCallbacks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询通知模板列表
     * @param req DescribeAlarmNoticesRequest
     * @return DescribeAlarmNoticesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmNoticesResponse DescribeAlarmNotices(DescribeAlarmNoticesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAlarmNoticesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAlarmNoticesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAlarmNotices");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询告警策略列表
     * @param req DescribeAlarmPoliciesRequest
     * @return DescribeAlarmPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmPoliciesResponse DescribeAlarmPolicies(DescribeAlarmPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAlarmPoliciesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAlarmPoliciesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAlarmPolicies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取单个告警策略详情
     * @param req DescribeAlarmPolicyRequest
     * @return DescribeAlarmPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmPolicyResponse DescribeAlarmPolicy(DescribeAlarmPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAlarmPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAlarmPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAlarmPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Prometheus 报警规则查询接口
     * @param req DescribeAlertRulesRequest
     * @return DescribeAlertRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlertRulesResponse DescribeAlertRules(DescribeAlertRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAlertRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAlertRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAlertRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询所有名字空间
     * @param req DescribeAllNamespacesRequest
     * @return DescribeAllNamespacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAllNamespacesResponse DescribeAllNamespaces(DescribeAllNamespacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAllNamespacesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAllNamespacesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAllNamespaces");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取基础指标属性
     * @param req DescribeBaseMetricsRequest
     * @return DescribeBaseMetricsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaseMetricsResponse DescribeBaseMetrics(DescribeBaseMetricsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBaseMetricsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBaseMetricsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBaseMetrics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取基础告警列表
     * @param req DescribeBasicAlarmListRequest
     * @return DescribeBasicAlarmListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBasicAlarmListResponse DescribeBasicAlarmList(DescribeBasicAlarmListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBasicAlarmListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBasicAlarmListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBasicAlarmList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取已绑定对象列表
     * @param req DescribeBindingPolicyObjectListRequest
     * @return DescribeBindingPolicyObjectListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBindingPolicyObjectListResponse DescribeBindingPolicyObjectList(DescribeBindingPolicyObjectListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBindingPolicyObjectListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBindingPolicyObjectListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBindingPolicyObjectList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取条件模板列表
     * @param req DescribeConditionsTemplateListRequest
     * @return DescribeConditionsTemplateListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConditionsTemplateListResponse DescribeConditionsTemplateList(DescribeConditionsTemplateListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeConditionsTemplateListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeConditionsTemplateListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeConditionsTemplateList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云监控支持多种类型的监控，此接口列出支持的所有类型
     * @param req DescribeMonitorTypesRequest
     * @return DescribeMonitorTypesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMonitorTypesResponse DescribeMonitorTypes(DescribeMonitorTypesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMonitorTypesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMonitorTypesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMonitorTypes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取基础告警策略条件
     * @param req DescribePolicyConditionListRequest
     * @return DescribePolicyConditionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePolicyConditionListResponse DescribePolicyConditionList(DescribePolicyConditionListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePolicyConditionListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePolicyConditionListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePolicyConditionList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取基础策略组详情
     * @param req DescribePolicyGroupInfoRequest
     * @return DescribePolicyGroupInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribePolicyGroupInfoResponse DescribePolicyGroupInfo(DescribePolicyGroupInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePolicyGroupInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePolicyGroupInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePolicyGroupInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取基础策略告警组列表
     * @param req DescribePolicyGroupListRequest
     * @return DescribePolicyGroupListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePolicyGroupListResponse DescribePolicyGroupList(DescribePolicyGroupListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePolicyGroupListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePolicyGroupListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePolicyGroupList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *分页获取产品事件的列表
     * @param req DescribeProductEventListRequest
     * @return DescribeProductEventListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductEventListResponse DescribeProductEventList(DescribeProductEventListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProductEventListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProductEventListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProductEventList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询云监控产品列表，支持云服务器CVM、云数据库、云消息队列、负载均衡、容器服务、专线等云产品。
     * @param req DescribeProductListRequest
     * @return DescribeProductListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductListResponse DescribeProductList(DescribeProductListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProductListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProductListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProductList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribePrometheusInstances) 用于查询一个或多个实例的详细信息。
<ul>
<li>可以根据实例ID、实例名称或者实例状态等信息来查询实例的详细信息</li>
<li>如果参数为空，返回当前用户一定数量（Limit所指定的数量，默认为20）的实例。</li>
</ul>
     * @param req DescribePrometheusInstancesRequest
     * @return DescribePrometheusInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusInstancesResponse DescribePrometheusInstances(DescribePrometheusInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrometheusInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrometheusInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrometheusInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *列出在腾讯云容器服务下创建的 Prometheus 服务发现。
<p>注意：前提条件，已经通过 Prometheus 控制台集成了对应的腾讯云容器服务，具体请参考
<a href="https://cloud.tencent.com/document/product/248/48859" target="_blank">Agent 安装</a>。</p>
     * @param req DescribeServiceDiscoveryRequest
     * @return DescribeServiceDiscoveryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceDiscoveryResponse DescribeServiceDiscovery(DescribeServiceDiscoveryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeServiceDiscoveryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeServiceDiscoveryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeServiceDiscovery");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据维度条件查询监控数据
     * @param req DescribeStatisticDataRequest
     * @return DescribeStatisticDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStatisticDataResponse DescribeStatisticData(DescribeStatisticDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStatisticDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeStatisticDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeStatisticData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取云产品的监控数据。此接口不适用于拉取容器服务监控数据，如需拉取容器服务监控数据，请使用[根据维度条件查询监控数据](https://cloud.tencent.com/document/product/248/51845)接口。
传入产品的命名空间、对象维度描述和监控指标即可获得相应的监控数据。
接口调用频率限制为：20次/秒，1200次/分钟。单请求最多可支持批量拉取10个实例的监控数据，单请求的数据点数限制为1440个。
若您需要调用的指标、对象较多，可能存在因限频出现拉取失败的情况，建议尽量将请求按时间维度均摊。
     * @param req GetMonitorDataRequest
     * @return GetMonitorDataResponse
     * @throws TencentCloudSDKException
     */
    public GetMonitorDataResponse GetMonitorData(GetMonitorDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetMonitorDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetMonitorDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetMonitorData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云监控告警编辑告警通知模板
     * @param req ModifyAlarmNoticeRequest
     * @return ModifyAlarmNoticeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmNoticeResponse ModifyAlarmNotice(ModifyAlarmNoticeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAlarmNoticeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAlarmNoticeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAlarmNotice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改告警策略触发条件
     * @param req ModifyAlarmPolicyConditionRequest
     * @return ModifyAlarmPolicyConditionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmPolicyConditionResponse ModifyAlarmPolicyCondition(ModifyAlarmPolicyConditionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAlarmPolicyConditionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAlarmPolicyConditionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAlarmPolicyCondition");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *告警2.0编辑告警策略基本信息，包括策略名、备注
     * @param req ModifyAlarmPolicyInfoRequest
     * @return ModifyAlarmPolicyInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmPolicyInfoResponse ModifyAlarmPolicyInfo(ModifyAlarmPolicyInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAlarmPolicyInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAlarmPolicyInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAlarmPolicyInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云监控告警修改告警策略绑定的告警通知模板
     * @param req ModifyAlarmPolicyNoticeRequest
     * @return ModifyAlarmPolicyNoticeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmPolicyNoticeResponse ModifyAlarmPolicyNotice(ModifyAlarmPolicyNoticeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAlarmPolicyNoticeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAlarmPolicyNoticeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAlarmPolicyNotice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *启停告警策略
     * @param req ModifyAlarmPolicyStatusRequest
     * @return ModifyAlarmPolicyStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmPolicyStatusResponse ModifyAlarmPolicyStatus(ModifyAlarmPolicyStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAlarmPolicyStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAlarmPolicyStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAlarmPolicyStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云监控告警修改告警策略的触发任务，TriggerTasks字段放触发任务列表，TriggerTasks传空数组时，代表解绑该策略的所有触发任务。
     * @param req ModifyAlarmPolicyTasksRequest
     * @return ModifyAlarmPolicyTasksResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmPolicyTasksResponse ModifyAlarmPolicyTasks(ModifyAlarmPolicyTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAlarmPolicyTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAlarmPolicyTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAlarmPolicyTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改告警接收人
     * @param req ModifyAlarmReceiversRequest
     * @return ModifyAlarmReceiversResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmReceiversResponse ModifyAlarmReceivers(ModifyAlarmReceiversRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAlarmReceiversResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAlarmReceiversResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAlarmReceivers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新策略组
     * @param req ModifyPolicyGroupRequest
     * @return ModifyPolicyGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPolicyGroupResponse ModifyPolicyGroup(ModifyPolicyGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPolicyGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPolicyGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyPolicyGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *默认接口请求频率限制：50次/秒。
默认单租户指标上限：100个。
单次上报最多 30 个指标/值对，请求返回错误时，请求中所有的指标/值均不会被保存。

上报的时间戳为期望保存的时间戳，建议构造整数分钟时刻的时间戳。
时间戳时间范围必须为当前时间到 300 秒前之间。
同一 IP 指标对的数据需按分钟先后顺序上报。
     * @param req PutMonitorDataRequest
     * @return PutMonitorDataResponse
     * @throws TencentCloudSDKException
     */
    public PutMonitorDataResponse PutMonitorData(PutMonitorDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PutMonitorDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PutMonitorDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PutMonitorData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *发送自定义消息告警
     * @param req SendCustomAlarmMsgRequest
     * @return SendCustomAlarmMsgResponse
     * @throws TencentCloudSDKException
     */
    public SendCustomAlarmMsgResponse SendCustomAlarmMsg(SendCustomAlarmMsgRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SendCustomAlarmMsgResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SendCustomAlarmMsgResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SendCustomAlarmMsg");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置一个策略为该告警策略类型、该项目的默认告警策略。
同一项目下相同的告警策略类型，就会被设置为非默认。
     * @param req SetDefaultAlarmPolicyRequest
     * @return SetDefaultAlarmPolicyResponse
     * @throws TencentCloudSDKException
     */
    public SetDefaultAlarmPolicyResponse SetDefaultAlarmPolicy(SetDefaultAlarmPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetDefaultAlarmPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SetDefaultAlarmPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetDefaultAlarmPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除全部的关联对象
     * @param req UnBindingAllPolicyObjectRequest
     * @return UnBindingAllPolicyObjectResponse
     * @throws TencentCloudSDKException
     */
    public UnBindingAllPolicyObjectResponse UnBindingAllPolicyObject(UnBindingAllPolicyObjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnBindingAllPolicyObjectResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UnBindingAllPolicyObjectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnBindingAllPolicyObject");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除策略的关联对象
     * @param req UnBindingPolicyObjectRequest
     * @return UnBindingPolicyObjectResponse
     * @throws TencentCloudSDKException
     */
    public UnBindingPolicyObjectResponse UnBindingPolicyObject(UnBindingPolicyObjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnBindingPolicyObjectResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UnBindingPolicyObjectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnBindingPolicyObject");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新 Prometheus 的报警规则。

请注意，**告警对象和告警消息是 Prometheus Rule Annotations 的特殊字段，需要通过 annotations 来传递，对应的 Key 分别为summary/description**，，请参考 [Prometheus Rule更多配置请参考](https://prometheus.io/docs/prometheus/latest/configuration/alerting_rules/)。
     * @param req UpdateAlertRuleRequest
     * @return UpdateAlertRuleResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAlertRuleResponse UpdateAlertRule(UpdateAlertRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateAlertRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateAlertRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateAlertRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新 Prometheus 报警策略状态
     * @param req UpdateAlertRuleStateRequest
     * @return UpdateAlertRuleStateResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAlertRuleStateResponse UpdateAlertRuleState(UpdateAlertRuleStateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateAlertRuleStateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateAlertRuleStateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateAlertRuleState");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *在腾讯云容器服务下更新 Prometheus 服务发现。
<p>注意：前提条件，已经通过 Prometheus 控制台集成了对应的腾讯云容器服务，具体请参考
<a href="https://cloud.tencent.com/document/product/248/48859" target="_blank">Agent 安装</a>。</p>
     * @param req UpdateServiceDiscoveryRequest
     * @return UpdateServiceDiscoveryResponse
     * @throws TencentCloudSDKException
     */
    public UpdateServiceDiscoveryResponse UpdateServiceDiscovery(UpdateServiceDiscoveryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateServiceDiscoveryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateServiceDiscoveryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateServiceDiscovery");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
