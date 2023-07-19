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
     *绑定 Grafana 可视化服务实例
     * @param req BindPrometheusManagedGrafanaRequest
     * @return BindPrometheusManagedGrafanaResponse
     * @throws TencentCloudSDKException
     */
    public BindPrometheusManagedGrafanaResponse BindPrometheusManagedGrafana(BindPrometheusManagedGrafanaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindPrometheusManagedGrafanaResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<BindPrometheusManagedGrafanaResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindPrometheusManagedGrafana");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
     *判断用户是否为云原生监控新用户，即在任何地域下均未创建过监控实例的用户
     * @param req CheckIsPrometheusNewUserRequest
     * @return CheckIsPrometheusNewUserResponse
     * @throws TencentCloudSDKException
     */
    public CheckIsPrometheusNewUserResponse CheckIsPrometheusNewUser(CheckIsPrometheusNewUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckIsPrometheusNewUserResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CheckIsPrometheusNewUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckIsPrometheusNewUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *强制销毁 Grafana 实例
     * @param req CleanGrafanaInstanceRequest
     * @return CleanGrafanaInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CleanGrafanaInstanceResponse CleanGrafanaInstance(CleanGrafanaInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CleanGrafanaInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CleanGrafanaInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CleanGrafanaInstance");
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
        req.setSkipSign(false);
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
     *创建告警策略
     * @param req CreateAlarmPolicyRequest
     * @return CreateAlarmPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateAlarmPolicyResponse CreateAlarmPolicy(CreateAlarmPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAlarmPolicyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
     *创建 exporter 集成
     * @param req CreateExporterIntegrationRequest
     * @return CreateExporterIntegrationResponse
     * @throws TencentCloudSDKException
     */
    public CreateExporterIntegrationResponse CreateExporterIntegration(CreateExporterIntegrationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateExporterIntegrationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateExporterIntegrationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateExporterIntegration");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateGrafanaInstance）用于创建 Grafana 包年包月实例，默认基础版、到期自动续费、不可使用代金券。
     * @param req CreateGrafanaInstanceRequest
     * @return CreateGrafanaInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateGrafanaInstanceResponse CreateGrafanaInstance(CreateGrafanaInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateGrafanaInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateGrafanaInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateGrafanaInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建 Grafana 集成配置
     * @param req CreateGrafanaIntegrationRequest
     * @return CreateGrafanaIntegrationResponse
     * @throws TencentCloudSDKException
     */
    public CreateGrafanaIntegrationResponse CreateGrafanaIntegration(CreateGrafanaIntegrationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateGrafanaIntegrationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateGrafanaIntegrationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateGrafanaIntegration");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建 Grafana 告警通道
     * @param req CreateGrafanaNotificationChannelRequest
     * @return CreateGrafanaNotificationChannelResponse
     * @throws TencentCloudSDKException
     */
    public CreateGrafanaNotificationChannelResponse CreateGrafanaNotificationChannel(CreateGrafanaNotificationChannelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateGrafanaNotificationChannelResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateGrafanaNotificationChannelResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateGrafanaNotificationChannel");
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
        req.setSkipSign(false);
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
     *创建 Prometheus CVM Agent
     * @param req CreatePrometheusAgentRequest
     * @return CreatePrometheusAgentResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrometheusAgentResponse CreatePrometheusAgent(CreatePrometheusAgentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePrometheusAgentResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePrometheusAgentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePrometheusAgent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建告警策略
     * @param req CreatePrometheusAlertPolicyRequest
     * @return CreatePrometheusAlertPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrometheusAlertPolicyResponse CreatePrometheusAlertPolicy(CreatePrometheusAlertPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePrometheusAlertPolicyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePrometheusAlertPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePrometheusAlertPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *与腾讯云可观测融合的2.0实例关联集群
     * @param req CreatePrometheusClusterAgentRequest
     * @return CreatePrometheusClusterAgentResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrometheusClusterAgentResponse CreatePrometheusClusterAgent(CreatePrometheusClusterAgentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePrometheusClusterAgentResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePrometheusClusterAgentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePrometheusClusterAgent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建prometheus配置
     * @param req CreatePrometheusConfigRequest
     * @return CreatePrometheusConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrometheusConfigResponse CreatePrometheusConfig(CreatePrometheusConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePrometheusConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePrometheusConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePrometheusConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建全局告警通知渠道
     * @param req CreatePrometheusGlobalNotificationRequest
     * @return CreatePrometheusGlobalNotificationResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrometheusGlobalNotificationResponse CreatePrometheusGlobalNotification(CreatePrometheusGlobalNotificationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePrometheusGlobalNotificationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePrometheusGlobalNotificationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePrometheusGlobalNotification");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建按量 Prometheus 实例，根据用量收费实例
     * @param req CreatePrometheusMultiTenantInstancePostPayModeRequest
     * @return CreatePrometheusMultiTenantInstancePostPayModeResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrometheusMultiTenantInstancePostPayModeResponse CreatePrometheusMultiTenantInstancePostPayMode(CreatePrometheusMultiTenantInstancePostPayModeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePrometheusMultiTenantInstancePostPayModeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePrometheusMultiTenantInstancePostPayModeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePrometheusMultiTenantInstancePostPayMode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *以Yaml的方式创建聚合规则
     * @param req CreatePrometheusRecordRuleYamlRequest
     * @return CreatePrometheusRecordRuleYamlResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrometheusRecordRuleYamlResponse CreatePrometheusRecordRuleYaml(CreatePrometheusRecordRuleYamlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePrometheusRecordRuleYamlResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePrometheusRecordRuleYamlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePrometheusRecordRuleYaml");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建 Prometheus 抓取任务
     * @param req CreatePrometheusScrapeJobRequest
     * @return CreatePrometheusScrapeJobResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrometheusScrapeJobResponse CreatePrometheusScrapeJob(CreatePrometheusScrapeJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePrometheusScrapeJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePrometheusScrapeJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePrometheusScrapeJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建一个云原生Prometheus模板
     * @param req CreatePrometheusTempRequest
     * @return CreatePrometheusTempResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrometheusTempResponse CreatePrometheusTemp(CreatePrometheusTempRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePrometheusTempResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePrometheusTempResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePrometheusTemp");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建 Prometheus 的预聚合规则
     * @param req CreateRecordingRuleRequest
     * @return CreateRecordingRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateRecordingRuleResponse CreateRecordingRule(CreateRecordingRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRecordingRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRecordingRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateRecordingRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Grafana实例授权其他腾讯云用户
     * @param req CreateSSOAccountRequest
     * @return CreateSSOAccountResponse
     * @throws TencentCloudSDKException
     */
    public CreateSSOAccountResponse CreateSSOAccount(CreateSSOAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSSOAccountResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSSOAccountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSSOAccount");
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
        req.setSkipSign(false);
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
     *删除告警通知模板
     * @param req DeleteAlarmNoticesRequest
     * @return DeleteAlarmNoticesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAlarmNoticesResponse DeleteAlarmNotices(DeleteAlarmNoticesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAlarmNoticesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
     *删除 exporter 集成
     * @param req DeleteExporterIntegrationRequest
     * @return DeleteExporterIntegrationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteExporterIntegrationResponse DeleteExporterIntegration(DeleteExporterIntegrationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteExporterIntegrationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteExporterIntegrationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteExporterIntegration");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteGrafanaInstance）用于 Grafana 包年包月实例的退费，调用后实例处于停服状态，不可使用，7天后自动销毁。
     * @param req DeleteGrafanaInstanceRequest
     * @return DeleteGrafanaInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGrafanaInstanceResponse DeleteGrafanaInstance(DeleteGrafanaInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteGrafanaInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteGrafanaInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteGrafanaInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除 Grafana 集成配置
     * @param req DeleteGrafanaIntegrationRequest
     * @return DeleteGrafanaIntegrationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGrafanaIntegrationResponse DeleteGrafanaIntegration(DeleteGrafanaIntegrationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteGrafanaIntegrationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteGrafanaIntegrationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteGrafanaIntegration");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除 Grafana 告警通道
     * @param req DeleteGrafanaNotificationChannelRequest
     * @return DeleteGrafanaNotificationChannelResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGrafanaNotificationChannelResponse DeleteGrafanaNotificationChannel(DeleteGrafanaNotificationChannelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteGrafanaNotificationChannelResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteGrafanaNotificationChannelResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteGrafanaNotificationChannel");
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
        req.setSkipSign(false);
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
     *删除2.0实例告警策略
     * @param req DeletePrometheusAlertPolicyRequest
     * @return DeletePrometheusAlertPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrometheusAlertPolicyResponse DeletePrometheusAlertPolicy(DeletePrometheusAlertPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeletePrometheusAlertPolicyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePrometheusAlertPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeletePrometheusAlertPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *解除TMP实例的集群关联
     * @param req DeletePrometheusClusterAgentRequest
     * @return DeletePrometheusClusterAgentResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrometheusClusterAgentResponse DeletePrometheusClusterAgent(DeletePrometheusClusterAgentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeletePrometheusClusterAgentResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePrometheusClusterAgentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeletePrometheusClusterAgent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除Prometheus配置，如果目标不存在，将返回成功
     * @param req DeletePrometheusConfigRequest
     * @return DeletePrometheusConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrometheusConfigResponse DeletePrometheusConfig(DeletePrometheusConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeletePrometheusConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePrometheusConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeletePrometheusConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除聚合实例
     * @param req DeletePrometheusRecordRuleYamlRequest
     * @return DeletePrometheusRecordRuleYamlResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrometheusRecordRuleYamlResponse DeletePrometheusRecordRuleYaml(DeletePrometheusRecordRuleYamlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeletePrometheusRecordRuleYamlResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePrometheusRecordRuleYamlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeletePrometheusRecordRuleYaml");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除 Prometheus 抓取任务
     * @param req DeletePrometheusScrapeJobsRequest
     * @return DeletePrometheusScrapeJobsResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrometheusScrapeJobsResponse DeletePrometheusScrapeJobs(DeletePrometheusScrapeJobsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeletePrometheusScrapeJobsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePrometheusScrapeJobsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeletePrometheusScrapeJobs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除一个云原生Prometheus配置模板
     * @param req DeletePrometheusTempRequest
     * @return DeletePrometheusTempResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrometheusTempResponse DeletePrometheusTemp(DeletePrometheusTempRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeletePrometheusTempResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePrometheusTempResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeletePrometheusTemp");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *解除模板同步，这将会删除目标中该模板所生产的配置，针对V2版本实例
     * @param req DeletePrometheusTempSyncRequest
     * @return DeletePrometheusTempSyncResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrometheusTempSyncResponse DeletePrometheusTempSync(DeletePrometheusTempSyncRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeletePrometheusTempSyncResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePrometheusTempSyncResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeletePrometheusTempSync");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量删除 Prometheus 预聚合规则
     * @param req DeleteRecordingRulesRequest
     * @return DeleteRecordingRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRecordingRulesResponse DeleteRecordingRules(DeleteRecordingRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRecordingRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRecordingRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRecordingRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Grafana可视化服务 删除授权用户
     * @param req DeleteSSOAccountRequest
     * @return DeleteSSOAccountResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSSOAccountResponse DeleteSSOAccount(DeleteSSOAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSSOAccountResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSSOAccountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteSSOAccount");
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
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
     *查询告警历史

请注意，**如果使用子用户进行告警历史的查询，只能查询到被授权项目下的告警历史**，或不区分项目的产品的告警历史。如何对子账户授予项目的权限，请参考 [访问管理-项目与标签](https://cloud.tencent.com/document/product/598/32738)。
     * @param req DescribeAlarmHistoriesRequest
     * @return DescribeAlarmHistoriesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmHistoriesResponse DescribeAlarmHistories(DescribeAlarmHistoriesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAlarmHistoriesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
     *获取告警通知模板所有回调URL
     * @param req DescribeAlarmNoticeCallbacksRequest
     * @return DescribeAlarmNoticeCallbacksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmNoticeCallbacksResponse DescribeAlarmNoticeCallbacks(DescribeAlarmNoticeCallbacksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAlarmNoticeCallbacksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
     *获取prom实例中集群详细的关联状态
     * @param req DescribeClusterAgentCreatingProgressRequest
     * @return DescribeClusterAgentCreatingProgressResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterAgentCreatingProgressResponse DescribeClusterAgentCreatingProgress(DescribeClusterAgentCreatingProgressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterAgentCreatingProgressResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterAgentCreatingProgressResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterAgentCreatingProgress");
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
        req.setSkipSign(false);
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
     *列出 Grafana DNS 配置
     * @param req DescribeDNSConfigRequest
     * @return DescribeDNSConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDNSConfigResponse DescribeDNSConfig(DescribeDNSConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDNSConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDNSConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDNSConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询 exporter 集成列表
     * @param req DescribeExporterIntegrationsRequest
     * @return DescribeExporterIntegrationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExporterIntegrationsResponse DescribeExporterIntegrations(DescribeExporterIntegrationsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeExporterIntegrationsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeExporterIntegrationsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeExporterIntegrations");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *列出 Grafana 所有告警通道
     * @param req DescribeGrafanaChannelsRequest
     * @return DescribeGrafanaChannelsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGrafanaChannelsResponse DescribeGrafanaChannels(DescribeGrafanaChannelsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGrafanaChannelsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGrafanaChannelsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGrafanaChannels");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *列出 Grafana 的设置，即 grafana.ini 文件内容
     * @param req DescribeGrafanaConfigRequest
     * @return DescribeGrafanaConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGrafanaConfigResponse DescribeGrafanaConfig(DescribeGrafanaConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGrafanaConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGrafanaConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGrafanaConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *列出 Grafana 环境变量
     * @param req DescribeGrafanaEnvironmentsRequest
     * @return DescribeGrafanaEnvironmentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGrafanaEnvironmentsResponse DescribeGrafanaEnvironments(DescribeGrafanaEnvironmentsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGrafanaEnvironmentsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGrafanaEnvironmentsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGrafanaEnvironments");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *列出用户所有的 Grafana 服务
     * @param req DescribeGrafanaInstancesRequest
     * @return DescribeGrafanaInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGrafanaInstancesResponse DescribeGrafanaInstances(DescribeGrafanaInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGrafanaInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGrafanaInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGrafanaInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *列出 Grafana 已安装的集成
     * @param req DescribeGrafanaIntegrationsRequest
     * @return DescribeGrafanaIntegrationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGrafanaIntegrationsResponse DescribeGrafanaIntegrations(DescribeGrafanaIntegrationsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGrafanaIntegrationsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGrafanaIntegrationsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGrafanaIntegrations");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *列出 Grafana 告警通道
     * @param req DescribeGrafanaNotificationChannelsRequest
     * @return DescribeGrafanaNotificationChannelsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGrafanaNotificationChannelsResponse DescribeGrafanaNotificationChannels(DescribeGrafanaNotificationChannelsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGrafanaNotificationChannelsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGrafanaNotificationChannelsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGrafanaNotificationChannels");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *列出 Grafana 白名单
     * @param req DescribeGrafanaWhiteListRequest
     * @return DescribeGrafanaWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGrafanaWhiteListResponse DescribeGrafanaWhiteList(DescribeGrafanaWhiteListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGrafanaWhiteListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGrafanaWhiteListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGrafanaWhiteList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *列出实例已安装的插件
     * @param req DescribeInstalledPluginsRequest
     * @return DescribeInstalledPluginsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstalledPluginsResponse DescribeInstalledPlugins(DescribeInstalledPluginsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstalledPluginsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstalledPluginsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstalledPlugins");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *腾讯云可观测平台支持多种类型的监控，此接口列出支持的所有类型
     * @param req DescribeMonitorTypesRequest
     * @return DescribeMonitorTypesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMonitorTypesResponse DescribeMonitorTypes(DescribeMonitorTypesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMonitorTypesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *列出可安装的所有 Grafana 插件
     * @param req DescribePluginOverviewsRequest
     * @return DescribePluginOverviewsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePluginOverviewsResponse DescribePluginOverviews(DescribePluginOverviewsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePluginOverviewsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePluginOverviewsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePluginOverviews");
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
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
     *查询腾讯云可观测平台云产品列表，支持云服务器CVM、云数据库、云消息队列、负载均衡、容器服务、专线等云产品。
     * @param req DescribeProductListRequest
     * @return DescribeProductListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductListResponse DescribeProductList(DescribeProductListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProductListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *获取关联目标集群的实例列表
     * @param req DescribePrometheusAgentInstancesRequest
     * @return DescribePrometheusAgentInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusAgentInstancesResponse DescribePrometheusAgentInstances(DescribePrometheusAgentInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrometheusAgentInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrometheusAgentInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrometheusAgentInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *列出 Prometheus CVM Agent
     * @param req DescribePrometheusAgentsRequest
     * @return DescribePrometheusAgentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusAgentsResponse DescribePrometheusAgents(DescribePrometheusAgentsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrometheusAgentsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrometheusAgentsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrometheusAgents");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取2.0实例告警策略列表
     * @param req DescribePrometheusAlertPolicyRequest
     * @return DescribePrometheusAlertPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusAlertPolicyResponse DescribePrometheusAlertPolicy(DescribePrometheusAlertPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrometheusAlertPolicyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrometheusAlertPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrometheusAlertPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取TMP实例关联集群列表
     * @param req DescribePrometheusClusterAgentsRequest
     * @return DescribePrometheusClusterAgentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusClusterAgentsResponse DescribePrometheusClusterAgents(DescribePrometheusClusterAgentsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrometheusClusterAgentsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrometheusClusterAgentsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrometheusClusterAgents");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *拉取Prometheus配置
     * @param req DescribePrometheusConfigRequest
     * @return DescribePrometheusConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusConfigResponse DescribePrometheusConfig(DescribePrometheusConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrometheusConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrometheusConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrometheusConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获得实例级别抓取配置
     * @param req DescribePrometheusGlobalConfigRequest
     * @return DescribePrometheusGlobalConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusGlobalConfigResponse DescribePrometheusGlobalConfig(DescribePrometheusGlobalConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrometheusGlobalConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrometheusGlobalConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrometheusGlobalConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询全局告警通知渠道
     * @param req DescribePrometheusGlobalNotificationRequest
     * @return DescribePrometheusGlobalNotificationResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusGlobalNotificationResponse DescribePrometheusGlobalNotification(DescribePrometheusGlobalNotificationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrometheusGlobalNotificationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrometheusGlobalNotificationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrometheusGlobalNotification");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取TMP实例详情
     * @param req DescribePrometheusInstanceDetailRequest
     * @return DescribePrometheusInstanceDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusInstanceDetailResponse DescribePrometheusInstanceDetail(DescribePrometheusInstanceDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrometheusInstanceDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrometheusInstanceDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrometheusInstanceDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取2.0实例初始化任务状态
     * @param req DescribePrometheusInstanceInitStatusRequest
     * @return DescribePrometheusInstanceInitStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusInstanceInitStatusResponse DescribePrometheusInstanceInitStatus(DescribePrometheusInstanceInitStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrometheusInstanceInitStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrometheusInstanceInitStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrometheusInstanceInitStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     * 查询Prometheus按量实例用量
     * @param req DescribePrometheusInstanceUsageRequest
     * @return DescribePrometheusInstanceUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusInstanceUsageResponse DescribePrometheusInstanceUsage(DescribePrometheusInstanceUsageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrometheusInstanceUsageResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrometheusInstanceUsageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrometheusInstanceUsage");
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
        req.setSkipSign(false);
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
     *获取与 Prometheus 监控融合实例列表
     * @param req DescribePrometheusInstancesOverviewRequest
     * @return DescribePrometheusInstancesOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusInstancesOverviewResponse DescribePrometheusInstancesOverview(DescribePrometheusInstancesOverviewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrometheusInstancesOverviewResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrometheusInstancesOverviewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrometheusInstancesOverview");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *拉取Prometheus聚合规则yaml列表
     * @param req DescribePrometheusRecordRuleYamlRequest
     * @return DescribePrometheusRecordRuleYamlResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusRecordRuleYamlResponse DescribePrometheusRecordRuleYaml(DescribePrometheusRecordRuleYamlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrometheusRecordRuleYamlResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrometheusRecordRuleYamlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrometheusRecordRuleYaml");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取聚合规则列表，包含关联集群内crd资源创建的record rule
     * @param req DescribePrometheusRecordRulesRequest
     * @return DescribePrometheusRecordRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusRecordRulesResponse DescribePrometheusRecordRules(DescribePrometheusRecordRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrometheusRecordRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrometheusRecordRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrometheusRecordRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *列出 Prometheus 抓取任务
     * @param req DescribePrometheusScrapeJobsRequest
     * @return DescribePrometheusScrapeJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusScrapeJobsResponse DescribePrometheusScrapeJobs(DescribePrometheusScrapeJobsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrometheusScrapeJobsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrometheusScrapeJobsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrometheusScrapeJobs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取targets信息
     * @param req DescribePrometheusTargetsTMPRequest
     * @return DescribePrometheusTargetsTMPResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusTargetsTMPResponse DescribePrometheusTargetsTMP(DescribePrometheusTargetsTMPRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrometheusTargetsTMPResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrometheusTargetsTMPResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrometheusTargetsTMP");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *拉取模板列表，默认模板将总是在最前面
     * @param req DescribePrometheusTempRequest
     * @return DescribePrometheusTempResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusTempResponse DescribePrometheusTemp(DescribePrometheusTempRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrometheusTempResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrometheusTempResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrometheusTemp");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取模板关联实例信息，针对V2版本实例
     * @param req DescribePrometheusTempSyncRequest
     * @return DescribePrometheusTempSyncResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusTempSyncResponse DescribePrometheusTempSync(DescribePrometheusTempSyncRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrometheusTempSyncResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrometheusTempSyncResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrometheusTempSync");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *列出 Prometheus 服务可用区
     * @param req DescribePrometheusZonesRequest
     * @return DescribePrometheusZonesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusZonesResponse DescribePrometheusZones(DescribePrometheusZonesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrometheusZonesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrometheusZonesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrometheusZones");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据条件查询 Prometheus 预聚合规则
     * @param req DescribeRecordingRulesRequest
     * @return DescribeRecordingRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordingRulesResponse DescribeRecordingRules(DescribeRecordingRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRecordingRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRecordingRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRecordingRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *列出当前grafana实例的所有授权账号
     * @param req DescribeSSOAccountRequest
     * @return DescribeSSOAccountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSSOAccountResponse DescribeSSOAccount(DescribeSSOAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSSOAccountResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSSOAccountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSSOAccount");
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
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
     *彻底删除 Prometheus 实例相关数据，给定的实例必须先被 Terminate
     * @param req DestroyPrometheusInstanceRequest
     * @return DestroyPrometheusInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DestroyPrometheusInstanceResponse DestroyPrometheusInstance(DestroyPrometheusInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DestroyPrometheusInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DestroyPrometheusInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DestroyPrometheusInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置 Grafana 公网访问
     * @param req EnableGrafanaInternetRequest
     * @return EnableGrafanaInternetResponse
     * @throws TencentCloudSDKException
     */
    public EnableGrafanaInternetResponse EnableGrafanaInternet(EnableGrafanaInternetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableGrafanaInternetResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<EnableGrafanaInternetResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EnableGrafanaInternet");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置 Grafana 单点登录，使用腾讯云账号
     * @param req EnableGrafanaSSORequest
     * @return EnableGrafanaSSOResponse
     * @throws TencentCloudSDKException
     */
    public EnableGrafanaSSOResponse EnableGrafanaSSO(EnableGrafanaSSORequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableGrafanaSSOResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<EnableGrafanaSSOResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EnableGrafanaSSO");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *SSO单点登录时，设置是否cam鉴权
     * @param req EnableSSOCamCheckRequest
     * @return EnableSSOCamCheckResponse
     * @throws TencentCloudSDKException
     */
    public EnableSSOCamCheckResponse EnableSSOCamCheck(EnableSSOCamCheckRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableSSOCamCheckResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<EnableSSOCamCheckResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EnableSSOCamCheck");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取云产品的监控数据。此接口不适用于拉取容器服务监控数据，如需拉取容器服务监控数据，请使用[根据维度条件查询监控数据](https://cloud.tencent.com/document/product/248/51845)接口。
传入产品的命名空间、对象维度描述和监控指标即可获得相应的监控数据。
接口调用限制：单请求最多可支持批量拉取10个实例的监控数据，单请求的数据点数限制为1440个。
若您需要调用的指标、对象较多，可能存在因限频出现拉取失败的情况，建议尽量将请求按时间维度均摊。

>?
>- 2022年9月1日起，云监控开始对GetMonitorData接口计费。每个主账号每月可获得100万次免费请求额度，超过免费额度后如需继续调用接口需要开通 [API请求按量付费](https://buy.cloud.tencent.com/APIRequestBuy)。计费规则可查看[API计费文档](https://cloud.tencent.com/document/product/248/77914)。
     * @param req GetMonitorDataRequest
     * @return GetMonitorDataResponse
     * @throws TencentCloudSDKException
     */
    public GetMonitorDataResponse GetMonitorData(GetMonitorDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetMonitorDataResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *获取 Prometheus Agent 管理相关的命令行
     * @param req GetPrometheusAgentManagementCommandRequest
     * @return GetPrometheusAgentManagementCommandResponse
     * @throws TencentCloudSDKException
     */
    public GetPrometheusAgentManagementCommandResponse GetPrometheusAgentManagementCommand(GetPrometheusAgentManagementCommandRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetPrometheusAgentManagementCommandResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GetPrometheusAgentManagementCommandResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetPrometheusAgentManagementCommand");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *安装 Grafana Plugin
     * @param req InstallPluginsRequest
     * @return InstallPluginsResponse
     * @throws TencentCloudSDKException
     */
    public InstallPluginsResponse InstallPlugins(InstallPluginsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InstallPluginsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<InstallPluginsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InstallPlugins");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *编辑告警通知模板
     * @param req ModifyAlarmNoticeRequest
     * @return ModifyAlarmNoticeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmNoticeResponse ModifyAlarmNotice(ModifyAlarmNoticeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAlarmNoticeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
     *修改告警策略绑定的告警通知模板
     * @param req ModifyAlarmPolicyNoticeRequest
     * @return ModifyAlarmPolicyNoticeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmPolicyNoticeResponse ModifyAlarmPolicyNotice(ModifyAlarmPolicyNoticeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAlarmPolicyNoticeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
     *修改告警策略的触发任务，TriggerTasks字段放触发任务列表，TriggerTasks传空数组时，代表解绑该策略的所有触发任务。
     * @param req ModifyAlarmPolicyTasksRequest
     * @return ModifyAlarmPolicyTasksResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmPolicyTasksResponse ModifyAlarmPolicyTasks(ModifyAlarmPolicyTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAlarmPolicyTasksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
     *修改 Grafana 实例属性
     * @param req ModifyGrafanaInstanceRequest
     * @return ModifyGrafanaInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGrafanaInstanceResponse ModifyGrafanaInstance(ModifyGrafanaInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyGrafanaInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyGrafanaInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyGrafanaInstance");
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
        req.setSkipSign(false);
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
     *修改被关联集群的external labels
     * @param req ModifyPrometheusAgentExternalLabelsRequest
     * @return ModifyPrometheusAgentExternalLabelsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrometheusAgentExternalLabelsResponse ModifyPrometheusAgentExternalLabels(ModifyPrometheusAgentExternalLabelsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPrometheusAgentExternalLabelsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPrometheusAgentExternalLabelsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyPrometheusAgentExternalLabels");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改2.0实例告警策略
     * @param req ModifyPrometheusAlertPolicyRequest
     * @return ModifyPrometheusAlertPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrometheusAlertPolicyResponse ModifyPrometheusAlertPolicy(ModifyPrometheusAlertPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPrometheusAlertPolicyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPrometheusAlertPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyPrometheusAlertPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改prometheus配置，如果配置项不存在，则会新增
     * @param req ModifyPrometheusConfigRequest
     * @return ModifyPrometheusConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrometheusConfigResponse ModifyPrometheusConfig(ModifyPrometheusConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPrometheusConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPrometheusConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyPrometheusConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改全局告警通知渠道
     * @param req ModifyPrometheusGlobalNotificationRequest
     * @return ModifyPrometheusGlobalNotificationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrometheusGlobalNotificationResponse ModifyPrometheusGlobalNotification(ModifyPrometheusGlobalNotificationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPrometheusGlobalNotificationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPrometheusGlobalNotificationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyPrometheusGlobalNotification");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改 Prometheus 实例相关属性
     * @param req ModifyPrometheusInstanceAttributesRequest
     * @return ModifyPrometheusInstanceAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrometheusInstanceAttributesResponse ModifyPrometheusInstanceAttributes(ModifyPrometheusInstanceAttributesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPrometheusInstanceAttributesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPrometheusInstanceAttributesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyPrometheusInstanceAttributes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过yaml的方式修改Prometheus聚合实例
     * @param req ModifyPrometheusRecordRuleYamlRequest
     * @return ModifyPrometheusRecordRuleYamlResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrometheusRecordRuleYamlResponse ModifyPrometheusRecordRuleYaml(ModifyPrometheusRecordRuleYamlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPrometheusRecordRuleYamlResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPrometheusRecordRuleYamlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyPrometheusRecordRuleYaml");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改模板内容
     * @param req ModifyPrometheusTempRequest
     * @return ModifyPrometheusTempResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrometheusTempResponse ModifyPrometheusTemp(ModifyPrometheusTempRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPrometheusTempResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPrometheusTempResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyPrometheusTemp");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ResumeGrafanaInstance）用于 Grafana 包年包月实例的停服续费，调用后按原版本续费一个月。仍在运行中的实例无法使用该接口进行续费。
     * @param req ResumeGrafanaInstanceRequest
     * @return ResumeGrafanaInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ResumeGrafanaInstanceResponse ResumeGrafanaInstance(ResumeGrafanaInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResumeGrafanaInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ResumeGrafanaInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResumeGrafanaInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *初始化TMP实例，开启集成中心时调用
     * @param req RunPrometheusInstanceRequest
     * @return RunPrometheusInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RunPrometheusInstanceResponse RunPrometheusInstance(RunPrometheusInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RunPrometheusInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RunPrometheusInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RunPrometheusInstance");
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
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
     *同步模板到实例或者集群，针对V2版本实例
     * @param req SyncPrometheusTempRequest
     * @return SyncPrometheusTempResponse
     * @throws TencentCloudSDKException
     */
    public SyncPrometheusTempResponse SyncPrometheusTemp(SyncPrometheusTempRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SyncPrometheusTempResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SyncPrometheusTempResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SyncPrometheusTemp");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *销毁按量 Prometheus 实例
     * @param req TerminatePrometheusInstancesRequest
     * @return TerminatePrometheusInstancesResponse
     * @throws TencentCloudSDKException
     */
    public TerminatePrometheusInstancesResponse TerminatePrometheusInstances(TerminatePrometheusInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TerminatePrometheusInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<TerminatePrometheusInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TerminatePrometheusInstances");
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
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
     *解除实例绑定的 Grafana 可视化实例
     * @param req UnbindPrometheusManagedGrafanaRequest
     * @return UnbindPrometheusManagedGrafanaResponse
     * @throws TencentCloudSDKException
     */
    public UnbindPrometheusManagedGrafanaResponse UnbindPrometheusManagedGrafana(UnbindPrometheusManagedGrafanaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnbindPrometheusManagedGrafanaResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UnbindPrometheusManagedGrafanaResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnbindPrometheusManagedGrafana");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除 Grafana Dashboard
     * @param req UninstallGrafanaDashboardRequest
     * @return UninstallGrafanaDashboardResponse
     * @throws TencentCloudSDKException
     */
    public UninstallGrafanaDashboardResponse UninstallGrafanaDashboard(UninstallGrafanaDashboardRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UninstallGrafanaDashboardResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UninstallGrafanaDashboardResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UninstallGrafanaDashboard");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除已安装的插件
     * @param req UninstallGrafanaPluginsRequest
     * @return UninstallGrafanaPluginsResponse
     * @throws TencentCloudSDKException
     */
    public UninstallGrafanaPluginsResponse UninstallGrafanaPlugins(UninstallGrafanaPluginsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UninstallGrafanaPluginsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UninstallGrafanaPluginsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UninstallGrafanaPlugins");
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
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
     *更新 Grafana 的 DNS 配置
     * @param req UpdateDNSConfigRequest
     * @return UpdateDNSConfigResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDNSConfigResponse UpdateDNSConfig(UpdateDNSConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateDNSConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateDNSConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateDNSConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新 exporter 集成配置
     * @param req UpdateExporterIntegrationRequest
     * @return UpdateExporterIntegrationResponse
     * @throws TencentCloudSDKException
     */
    public UpdateExporterIntegrationResponse UpdateExporterIntegration(UpdateExporterIntegrationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateExporterIntegrationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateExporterIntegrationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateExporterIntegration");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新 Grafana 配置
     * @param req UpdateGrafanaConfigRequest
     * @return UpdateGrafanaConfigResponse
     * @throws TencentCloudSDKException
     */
    public UpdateGrafanaConfigResponse UpdateGrafanaConfig(UpdateGrafanaConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateGrafanaConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateGrafanaConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateGrafanaConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新 Grafana 环境变量
     * @param req UpdateGrafanaEnvironmentsRequest
     * @return UpdateGrafanaEnvironmentsResponse
     * @throws TencentCloudSDKException
     */
    public UpdateGrafanaEnvironmentsResponse UpdateGrafanaEnvironments(UpdateGrafanaEnvironmentsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateGrafanaEnvironmentsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateGrafanaEnvironmentsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateGrafanaEnvironments");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新 Grafana 集成配置
     * @param req UpdateGrafanaIntegrationRequest
     * @return UpdateGrafanaIntegrationResponse
     * @throws TencentCloudSDKException
     */
    public UpdateGrafanaIntegrationResponse UpdateGrafanaIntegration(UpdateGrafanaIntegrationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateGrafanaIntegrationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateGrafanaIntegrationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateGrafanaIntegration");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新 Grafana 告警通道
     * @param req UpdateGrafanaNotificationChannelRequest
     * @return UpdateGrafanaNotificationChannelResponse
     * @throws TencentCloudSDKException
     */
    public UpdateGrafanaNotificationChannelResponse UpdateGrafanaNotificationChannel(UpdateGrafanaNotificationChannelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateGrafanaNotificationChannelResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateGrafanaNotificationChannelResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateGrafanaNotificationChannel");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新 Grafana 白名单
     * @param req UpdateGrafanaWhiteListRequest
     * @return UpdateGrafanaWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public UpdateGrafanaWhiteListResponse UpdateGrafanaWhiteList(UpdateGrafanaWhiteListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateGrafanaWhiteListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateGrafanaWhiteListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateGrafanaWhiteList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新 Prometheus CVM Agent 状态
     * @param req UpdatePrometheusAgentStatusRequest
     * @return UpdatePrometheusAgentStatusResponse
     * @throws TencentCloudSDKException
     */
    public UpdatePrometheusAgentStatusResponse UpdatePrometheusAgentStatus(UpdatePrometheusAgentStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdatePrometheusAgentStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpdatePrometheusAgentStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdatePrometheusAgentStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新 Prometheus 抓取任务
     * @param req UpdatePrometheusScrapeJobRequest
     * @return UpdatePrometheusScrapeJobResponse
     * @throws TencentCloudSDKException
     */
    public UpdatePrometheusScrapeJobResponse UpdatePrometheusScrapeJob(UpdatePrometheusScrapeJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdatePrometheusScrapeJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpdatePrometheusScrapeJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdatePrometheusScrapeJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新 Prometheus 的预聚合规则
     * @param req UpdateRecordingRuleRequest
     * @return UpdateRecordingRuleResponse
     * @throws TencentCloudSDKException
     */
    public UpdateRecordingRuleResponse UpdateRecordingRule(UpdateRecordingRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateRecordingRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateRecordingRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateRecordingRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新已授权账号的备注、权限信息，会直接覆盖原有的信息，不传则不会更新。
     * @param req UpdateSSOAccountRequest
     * @return UpdateSSOAccountResponse
     * @throws TencentCloudSDKException
     */
    public UpdateSSOAccountResponse UpdateSSOAccount(UpdateSSOAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateSSOAccountResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateSSOAccountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateSSOAccount");
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
        req.setSkipSign(false);
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

    /**
     *升级 Grafana Dashboard
     * @param req UpgradeGrafanaDashboardRequest
     * @return UpgradeGrafanaDashboardResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeGrafanaDashboardResponse UpgradeGrafanaDashboard(UpgradeGrafanaDashboardRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpgradeGrafanaDashboardResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpgradeGrafanaDashboardResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpgradeGrafanaDashboard");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *升级 Grafana 实例
     * @param req UpgradeGrafanaInstanceRequest
     * @return UpgradeGrafanaInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeGrafanaInstanceResponse UpgradeGrafanaInstance(UpgradeGrafanaInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpgradeGrafanaInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpgradeGrafanaInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpgradeGrafanaInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
