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
        req.setSkipSign(false);
        return this.internalRequest(req, "BindPrometheusManagedGrafana", BindPrometheusManagedGrafanaResponse.class);
    }

    /**
     *将告警策略绑定到特定对象
     * @param req BindingPolicyObjectRequest
     * @return BindingPolicyObjectResponse
     * @throws TencentCloudSDKException
     */
    public BindingPolicyObjectResponse BindingPolicyObject(BindingPolicyObjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindingPolicyObject", BindingPolicyObjectResponse.class);
    }

    /**
     *策略绑定标签
     * @param req BindingPolicyTagRequest
     * @return BindingPolicyTagResponse
     * @throws TencentCloudSDKException
     */
    public BindingPolicyTagResponse BindingPolicyTag(BindingPolicyTagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindingPolicyTag", BindingPolicyTagResponse.class);
    }

    /**
     *强制销毁 Grafana 实例
     * @param req CleanGrafanaInstanceRequest
     * @return CleanGrafanaInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CleanGrafanaInstanceResponse CleanGrafanaInstance(CleanGrafanaInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CleanGrafanaInstance", CleanGrafanaInstanceResponse.class);
    }

    /**
     *创建通知模板
     * @param req CreateAlarmNoticeRequest
     * @return CreateAlarmNoticeResponse
     * @throws TencentCloudSDKException
     */
    public CreateAlarmNoticeResponse CreateAlarmNotice(CreateAlarmNoticeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAlarmNotice", CreateAlarmNoticeResponse.class);
    }

    /**
     *创建告警策略
     * @param req CreateAlarmPolicyRequest
     * @return CreateAlarmPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateAlarmPolicyResponse CreateAlarmPolicy(CreateAlarmPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAlarmPolicy", CreateAlarmPolicyResponse.class);
    }

    /**
     *创建告警屏蔽规则
     * @param req CreateAlarmShieldRequest
     * @return CreateAlarmShieldResponse
     * @throws TencentCloudSDKException
     */
    public CreateAlarmShieldResponse CreateAlarmShield(CreateAlarmShieldRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAlarmShield", CreateAlarmShieldResponse.class);
    }

    /**
     *创建 Prometheus 告警规则。

请注意，**告警对象和告警消息是 Prometheus Rule Annotations 的特殊字段，需要通过 annotations 来传递，对应的 Key 分别为summary/description**，，请参考 [Prometheus Rule更多配置请参考](https://prometheus.io/docs/prometheus/latest/configuration/alerting_rules/)。
     * @param req CreateAlertRuleRequest
     * @return CreateAlertRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateAlertRuleResponse CreateAlertRule(CreateAlertRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAlertRule", CreateAlertRuleResponse.class);
    }

    /**
     *创建告警条件模板
     * @param req CreateConditionsTemplateRequest
     * @return CreateConditionsTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateConditionsTemplateResponse CreateConditionsTemplate(CreateConditionsTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateConditionsTemplate", CreateConditionsTemplateResponse.class);
    }

    /**
     *创建集成中心 exporter 集成，因集成较多，建议控制台创建集成。(前提：已授权创建托管 EKS 集群，验证方式：1. 控制台界面确认，未提示授权则表示已授权创建；2. 通过 DescribePrometheusInstanceInitStatus 接口查询集群状态，如果托管集群不存在，可通过 RunPrometheusInstance 接口创建)
     * @param req CreateExporterIntegrationRequest
     * @return CreateExporterIntegrationResponse
     * @throws TencentCloudSDKException
     */
    public CreateExporterIntegrationResponse CreateExporterIntegration(CreateExporterIntegrationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateExporterIntegration", CreateExporterIntegrationResponse.class);
    }

    /**
     *注册外部集群到云上 TMP 实例
     * @param req CreateExternalClusterRequest
     * @return CreateExternalClusterResponse
     * @throws TencentCloudSDKException
     */
    public CreateExternalClusterResponse CreateExternalCluster(CreateExternalClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateExternalCluster", CreateExternalClusterResponse.class);
    }

    /**
     *本接口（CreateGrafanaInstance）用于创建 Grafana 包年包月实例，默认基础版、到期自动续费、不可使用代金券。
     * @param req CreateGrafanaInstanceRequest
     * @return CreateGrafanaInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateGrafanaInstanceResponse CreateGrafanaInstance(CreateGrafanaInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateGrafanaInstance", CreateGrafanaInstanceResponse.class);
    }

    /**
     *创建 Grafana 集成配置，其中 Prometheus 集成不通过该接口创建，可参考 BindPrometheusManagedGrafana 接口
     * @param req CreateGrafanaIntegrationRequest
     * @return CreateGrafanaIntegrationResponse
     * @throws TencentCloudSDKException
     */
    public CreateGrafanaIntegrationResponse CreateGrafanaIntegration(CreateGrafanaIntegrationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateGrafanaIntegration", CreateGrafanaIntegrationResponse.class);
    }

    /**
     *创建 Grafana 告警通道
     * @param req CreateGrafanaNotificationChannelRequest
     * @return CreateGrafanaNotificationChannelResponse
     * @throws TencentCloudSDKException
     */
    public CreateGrafanaNotificationChannelResponse CreateGrafanaNotificationChannel(CreateGrafanaNotificationChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateGrafanaNotificationChannel", CreateGrafanaNotificationChannelResponse.class);
    }

    /**
     *增加策略组
     * @param req CreatePolicyGroupRequest
     * @return CreatePolicyGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreatePolicyGroupResponse CreatePolicyGroup(CreatePolicyGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePolicyGroup", CreatePolicyGroupResponse.class);
    }

    /**
     *创建 Prometheus CVM Agent
     * @param req CreatePrometheusAgentRequest
     * @return CreatePrometheusAgentResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrometheusAgentResponse CreatePrometheusAgent(CreatePrometheusAgentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePrometheusAgent", CreatePrometheusAgentResponse.class);
    }

    /**
     *创建Prometheus告警规则分组

告警分组中可包含多条告警规则，分组内告警消息通过告警分组的通知模板发送。
支持单个告警分组下分别创建启用/禁用的告警规则。
     * @param req CreatePrometheusAlertGroupRequest
     * @return CreatePrometheusAlertGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrometheusAlertGroupResponse CreatePrometheusAlertGroup(CreatePrometheusAlertGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePrometheusAlertGroup", CreatePrometheusAlertGroupResponse.class);
    }

    /**
     *创建 Prometheus 告警策略(将逐步废弃，建议使用 CreatePrometheusAlertGroup 创建告警策略)
     * @param req CreatePrometheusAlertPolicyRequest
     * @return CreatePrometheusAlertPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrometheusAlertPolicyResponse CreatePrometheusAlertPolicy(CreatePrometheusAlertPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePrometheusAlertPolicy", CreatePrometheusAlertPolicyResponse.class);
    }

    /**
     *与腾讯云可观测融合的2.0实例关联集群
     * @param req CreatePrometheusClusterAgentRequest
     * @return CreatePrometheusClusterAgentResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrometheusClusterAgentResponse CreatePrometheusClusterAgent(CreatePrometheusClusterAgentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePrometheusClusterAgent", CreatePrometheusClusterAgentResponse.class);
    }

    /**
     *创建prometheus配置
     * @param req CreatePrometheusConfigRequest
     * @return CreatePrometheusConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrometheusConfigResponse CreatePrometheusConfig(CreatePrometheusConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePrometheusConfig", CreatePrometheusConfigResponse.class);
    }

    /**
     *创建全局告警通知渠道。集群内创建的告警规则如果未配置告警通知渠道，默认走全局告警通知渠道（建议在控制台创建告警，集群内创建告警不易维护）
     * @param req CreatePrometheusGlobalNotificationRequest
     * @return CreatePrometheusGlobalNotificationResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrometheusGlobalNotificationResponse CreatePrometheusGlobalNotification(CreatePrometheusGlobalNotificationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePrometheusGlobalNotification", CreatePrometheusGlobalNotificationResponse.class);
    }

    /**
     *创建按量 Prometheus 实例，根据用量收费实例
     * @param req CreatePrometheusMultiTenantInstancePostPayModeRequest
     * @return CreatePrometheusMultiTenantInstancePostPayModeResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrometheusMultiTenantInstancePostPayModeResponse CreatePrometheusMultiTenantInstancePostPayMode(CreatePrometheusMultiTenantInstancePostPayModeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePrometheusMultiTenantInstancePostPayMode", CreatePrometheusMultiTenantInstancePostPayModeResponse.class);
    }

    /**
     *以Yaml的方式创建聚合规则
     * @param req CreatePrometheusRecordRuleYamlRequest
     * @return CreatePrometheusRecordRuleYamlResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrometheusRecordRuleYamlResponse CreatePrometheusRecordRuleYaml(CreatePrometheusRecordRuleYamlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePrometheusRecordRuleYaml", CreatePrometheusRecordRuleYamlResponse.class);
    }

    /**
     *创建 Prometheus Agent 抓取任务
     * @param req CreatePrometheusScrapeJobRequest
     * @return CreatePrometheusScrapeJobResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrometheusScrapeJobResponse CreatePrometheusScrapeJob(CreatePrometheusScrapeJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePrometheusScrapeJob", CreatePrometheusScrapeJobResponse.class);
    }

    /**
     *创建一个云原生Prometheus模板
     * @param req CreatePrometheusTempRequest
     * @return CreatePrometheusTempResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrometheusTempResponse CreatePrometheusTemp(CreatePrometheusTempRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePrometheusTemp", CreatePrometheusTempResponse.class);
    }

    /**
     *创建 Prometheus 的预聚合规则
     * @param req CreateRecordingRuleRequest
     * @return CreateRecordingRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateRecordingRuleResponse CreateRecordingRule(CreateRecordingRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRecordingRule", CreateRecordingRuleResponse.class);
    }

    /**
     *Grafana实例授权其他腾讯云用户
     * @param req CreateSSOAccountRequest
     * @return CreateSSOAccountResponse
     * @throws TencentCloudSDKException
     */
    public CreateSSOAccountResponse CreateSSOAccount(CreateSSOAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSSOAccount", CreateSSOAccountResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateServiceDiscovery", CreateServiceDiscoveryResponse.class);
    }

    /**
     *删除告警通知模板
     * @param req DeleteAlarmNoticesRequest
     * @return DeleteAlarmNoticesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAlarmNoticesResponse DeleteAlarmNotices(DeleteAlarmNoticesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAlarmNotices", DeleteAlarmNoticesResponse.class);
    }

    /**
     *删除告警策略
     * @param req DeleteAlarmPolicyRequest
     * @return DeleteAlarmPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAlarmPolicyResponse DeleteAlarmPolicy(DeleteAlarmPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAlarmPolicy", DeleteAlarmPolicyResponse.class);
    }

    /**
     *删除告警屏蔽规则
     * @param req DeleteAlarmShieldsRequest
     * @return DeleteAlarmShieldsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAlarmShieldsResponse DeleteAlarmShields(DeleteAlarmShieldsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAlarmShields", DeleteAlarmShieldsResponse.class);
    }

    /**
     *批量删除 Prometheus 报警规则
     * @param req DeleteAlertRulesRequest
     * @return DeleteAlertRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAlertRulesResponse DeleteAlertRules(DeleteAlertRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAlertRules", DeleteAlertRulesResponse.class);
    }

    /**
     *删除集成中心 exporter 集成
     * @param req DeleteExporterIntegrationRequest
     * @return DeleteExporterIntegrationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteExporterIntegrationResponse DeleteExporterIntegration(DeleteExporterIntegrationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteExporterIntegration", DeleteExporterIntegrationResponse.class);
    }

    /**
     *本接口（DeleteGrafanaInstance）用于 Grafana 包年包月实例的退费，调用后实例处于停服状态，不可使用，7天后自动销毁。
     * @param req DeleteGrafanaInstanceRequest
     * @return DeleteGrafanaInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGrafanaInstanceResponse DeleteGrafanaInstance(DeleteGrafanaInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteGrafanaInstance", DeleteGrafanaInstanceResponse.class);
    }

    /**
     *删除 Grafana 集成配置
     * @param req DeleteGrafanaIntegrationRequest
     * @return DeleteGrafanaIntegrationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGrafanaIntegrationResponse DeleteGrafanaIntegration(DeleteGrafanaIntegrationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteGrafanaIntegration", DeleteGrafanaIntegrationResponse.class);
    }

    /**
     *删除 Grafana 告警通道
     * @param req DeleteGrafanaNotificationChannelRequest
     * @return DeleteGrafanaNotificationChannelResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGrafanaNotificationChannelResponse DeleteGrafanaNotificationChannel(DeleteGrafanaNotificationChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteGrafanaNotificationChannel", DeleteGrafanaNotificationChannelResponse.class);
    }

    /**
     *删除告警策略组
     * @param req DeletePolicyGroupRequest
     * @return DeletePolicyGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeletePolicyGroupResponse DeletePolicyGroup(DeletePolicyGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePolicyGroup", DeletePolicyGroupResponse.class);
    }

    /**
     *删除Prometheus告警规则分组
     * @param req DeletePrometheusAlertGroupsRequest
     * @return DeletePrometheusAlertGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrometheusAlertGroupsResponse DeletePrometheusAlertGroups(DeletePrometheusAlertGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePrometheusAlertGroups", DeletePrometheusAlertGroupsResponse.class);
    }

    /**
     *删除2.0实例告警策略
     * @param req DeletePrometheusAlertPolicyRequest
     * @return DeletePrometheusAlertPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrometheusAlertPolicyResponse DeletePrometheusAlertPolicy(DeletePrometheusAlertPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePrometheusAlertPolicy", DeletePrometheusAlertPolicyResponse.class);
    }

    /**
     *解除TMP实例的集群关联
     * @param req DeletePrometheusClusterAgentRequest
     * @return DeletePrometheusClusterAgentResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrometheusClusterAgentResponse DeletePrometheusClusterAgent(DeletePrometheusClusterAgentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePrometheusClusterAgent", DeletePrometheusClusterAgentResponse.class);
    }

    /**
     *删除Prometheus配置，如果目标不存在，将返回成功
     * @param req DeletePrometheusConfigRequest
     * @return DeletePrometheusConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrometheusConfigResponse DeletePrometheusConfig(DeletePrometheusConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePrometheusConfig", DeletePrometheusConfigResponse.class);
    }

    /**
     *删除聚合实例
     * @param req DeletePrometheusRecordRuleYamlRequest
     * @return DeletePrometheusRecordRuleYamlResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrometheusRecordRuleYamlResponse DeletePrometheusRecordRuleYaml(DeletePrometheusRecordRuleYamlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePrometheusRecordRuleYaml", DeletePrometheusRecordRuleYamlResponse.class);
    }

    /**
     *删除 Prometheus Agent 抓取任务
     * @param req DeletePrometheusScrapeJobsRequest
     * @return DeletePrometheusScrapeJobsResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrometheusScrapeJobsResponse DeletePrometheusScrapeJobs(DeletePrometheusScrapeJobsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePrometheusScrapeJobs", DeletePrometheusScrapeJobsResponse.class);
    }

    /**
     *删除一个云原生Prometheus配置模板
     * @param req DeletePrometheusTempRequest
     * @return DeletePrometheusTempResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrometheusTempResponse DeletePrometheusTemp(DeletePrometheusTempRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePrometheusTemp", DeletePrometheusTempResponse.class);
    }

    /**
     *解除模板同步，这将会删除目标中该模板所生产的配置，针对V2版本实例
     * @param req DeletePrometheusTempSyncRequest
     * @return DeletePrometheusTempSyncResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrometheusTempSyncResponse DeletePrometheusTempSync(DeletePrometheusTempSyncRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePrometheusTempSync", DeletePrometheusTempSyncResponse.class);
    }

    /**
     *批量删除 Prometheus 预聚合规则
     * @param req DeleteRecordingRulesRequest
     * @return DeleteRecordingRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRecordingRulesResponse DeleteRecordingRules(DeleteRecordingRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRecordingRules", DeleteRecordingRulesResponse.class);
    }

    /**
     *Grafana可视化服务 删除授权用户
     * @param req DeleteSSOAccountRequest
     * @return DeleteSSOAccountResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSSOAccountResponse DeleteSSOAccount(DeleteSSOAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSSOAccount", DeleteSSOAccountResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteServiceDiscovery", DeleteServiceDiscoveryResponse.class);
    }

    /**
     *获取平台事件列表
     * @param req DescribeAccidentEventListRequest
     * @return DescribeAccidentEventListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccidentEventListResponse DescribeAccidentEventList(DescribeAccidentEventListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccidentEventList", DescribeAccidentEventListResponse.class);
    }

    /**
     *查询告警事件列表
     * @param req DescribeAlarmEventsRequest
     * @return DescribeAlarmEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmEventsResponse DescribeAlarmEvents(DescribeAlarmEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlarmEvents", DescribeAlarmEventsResponse.class);
    }

    /**
     *查询告警历史

请注意，**如果使用子用户进行告警历史的查询，只能查询到被授权项目下的告警历史**，或不区分项目的产品的告警历史。如何对子账户授予项目的权限，请参考 [访问管理-项目与标签](https://cloud.tencent.com/document/product/598/32738)。
     * @param req DescribeAlarmHistoriesRequest
     * @return DescribeAlarmHistoriesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmHistoriesResponse DescribeAlarmHistories(DescribeAlarmHistoriesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlarmHistories", DescribeAlarmHistoriesResponse.class);
    }

    /**
     *查询告警指标列表
     * @param req DescribeAlarmMetricsRequest
     * @return DescribeAlarmMetricsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmMetricsResponse DescribeAlarmMetrics(DescribeAlarmMetricsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlarmMetrics", DescribeAlarmMetricsResponse.class);
    }

    /**
     *查询单个通知模板的详情
     * @param req DescribeAlarmNoticeRequest
     * @return DescribeAlarmNoticeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmNoticeResponse DescribeAlarmNotice(DescribeAlarmNoticeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlarmNotice", DescribeAlarmNoticeResponse.class);
    }

    /**
     *获取告警通知模板所有回调URL
     * @param req DescribeAlarmNoticeCallbacksRequest
     * @return DescribeAlarmNoticeCallbacksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmNoticeCallbacksResponse DescribeAlarmNoticeCallbacks(DescribeAlarmNoticeCallbacksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlarmNoticeCallbacks", DescribeAlarmNoticeCallbacksResponse.class);
    }

    /**
     *查询通知模板列表
     * @param req DescribeAlarmNoticesRequest
     * @return DescribeAlarmNoticesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmNoticesResponse DescribeAlarmNotices(DescribeAlarmNoticesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlarmNotices", DescribeAlarmNoticesResponse.class);
    }

    /**
     *查询告警策略列表
     * @param req DescribeAlarmPoliciesRequest
     * @return DescribeAlarmPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmPoliciesResponse DescribeAlarmPolicies(DescribeAlarmPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlarmPolicies", DescribeAlarmPoliciesResponse.class);
    }

    /**
     *获取单个告警策略详情
     * @param req DescribeAlarmPolicyRequest
     * @return DescribeAlarmPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmPolicyResponse DescribeAlarmPolicy(DescribeAlarmPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlarmPolicy", DescribeAlarmPolicyResponse.class);
    }

    /**
     *获取告警短信配额
     * @param req DescribeAlarmSmsQuotaRequest
     * @return DescribeAlarmSmsQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmSmsQuotaResponse DescribeAlarmSmsQuota(DescribeAlarmSmsQuotaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlarmSmsQuota", DescribeAlarmSmsQuotaResponse.class);
    }

    /**
     *Prometheus 报警规则查询接口
     * @param req DescribeAlertRulesRequest
     * @return DescribeAlertRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlertRulesResponse DescribeAlertRules(DescribeAlertRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlertRules", DescribeAlertRulesResponse.class);
    }

    /**
     *查询所有名字空间
     * @param req DescribeAllNamespacesRequest
     * @return DescribeAllNamespacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAllNamespacesResponse DescribeAllNamespaces(DescribeAllNamespacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAllNamespaces", DescribeAllNamespacesResponse.class);
    }

    /**
     *获取基础指标属性
     * @param req DescribeBaseMetricsRequest
     * @return DescribeBaseMetricsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaseMetricsResponse DescribeBaseMetrics(DescribeBaseMetricsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaseMetrics", DescribeBaseMetricsResponse.class);
    }

    /**
     *获取基础告警列表
     * @param req DescribeBasicAlarmListRequest
     * @return DescribeBasicAlarmListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBasicAlarmListResponse DescribeBasicAlarmList(DescribeBasicAlarmListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBasicAlarmList", DescribeBasicAlarmListResponse.class);
    }

    /**
     *获取已绑定对象列表
     * @param req DescribeBindingPolicyObjectListRequest
     * @return DescribeBindingPolicyObjectListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBindingPolicyObjectListResponse DescribeBindingPolicyObjectList(DescribeBindingPolicyObjectListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBindingPolicyObjectList", DescribeBindingPolicyObjectListResponse.class);
    }

    /**
     *获取prom实例中集群详细的关联状态
     * @param req DescribeClusterAgentCreatingProgressRequest
     * @return DescribeClusterAgentCreatingProgressResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterAgentCreatingProgressResponse DescribeClusterAgentCreatingProgress(DescribeClusterAgentCreatingProgressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterAgentCreatingProgress", DescribeClusterAgentCreatingProgressResponse.class);
    }

    /**
     *获取条件模板列表
     * @param req DescribeConditionsTemplateListRequest
     * @return DescribeConditionsTemplateListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConditionsTemplateListResponse DescribeConditionsTemplateList(DescribeConditionsTemplateListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConditionsTemplateList", DescribeConditionsTemplateListResponse.class);
    }

    /**
     *列出 Grafana DNS 配置
     * @param req DescribeDNSConfigRequest
     * @return DescribeDNSConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDNSConfigResponse DescribeDNSConfig(DescribeDNSConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDNSConfig", DescribeDNSConfigResponse.class);
    }

    /**
     *查询集成中心 exporter 集成列表
     * @param req DescribeExporterIntegrationsRequest
     * @return DescribeExporterIntegrationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExporterIntegrationsResponse DescribeExporterIntegrations(DescribeExporterIntegrationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExporterIntegrations", DescribeExporterIntegrationsResponse.class);
    }

    /**
     *查看外部集群注册命令
     * @param req DescribeExternalClusterRegisterCommandRequest
     * @return DescribeExternalClusterRegisterCommandResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExternalClusterRegisterCommandResponse DescribeExternalClusterRegisterCommand(DescribeExternalClusterRegisterCommandRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExternalClusterRegisterCommand", DescribeExternalClusterRegisterCommandResponse.class);
    }

    /**
     *查看外部集群 Agent 卸载命令
     * @param req DescribeExternalClusterUninstallCommandRequest
     * @return DescribeExternalClusterUninstallCommandResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExternalClusterUninstallCommandResponse DescribeExternalClusterUninstallCommand(DescribeExternalClusterUninstallCommandRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExternalClusterUninstallCommand", DescribeExternalClusterUninstallCommandResponse.class);
    }

    /**
     *列出 Grafana 所有告警通道
     * @param req DescribeGrafanaChannelsRequest
     * @return DescribeGrafanaChannelsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGrafanaChannelsResponse DescribeGrafanaChannels(DescribeGrafanaChannelsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGrafanaChannels", DescribeGrafanaChannelsResponse.class);
    }

    /**
     *列出 Grafana 的设置，即 grafana.ini 文件内容
     * @param req DescribeGrafanaConfigRequest
     * @return DescribeGrafanaConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGrafanaConfigResponse DescribeGrafanaConfig(DescribeGrafanaConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGrafanaConfig", DescribeGrafanaConfigResponse.class);
    }

    /**
     *列出 Grafana 环境变量
     * @param req DescribeGrafanaEnvironmentsRequest
     * @return DescribeGrafanaEnvironmentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGrafanaEnvironmentsResponse DescribeGrafanaEnvironments(DescribeGrafanaEnvironmentsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGrafanaEnvironments", DescribeGrafanaEnvironmentsResponse.class);
    }

    /**
     *列出用户所有的 Grafana 服务
     * @param req DescribeGrafanaInstancesRequest
     * @return DescribeGrafanaInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGrafanaInstancesResponse DescribeGrafanaInstances(DescribeGrafanaInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGrafanaInstances", DescribeGrafanaInstancesResponse.class);
    }

    /**
     *列出 Grafana 已安装的集成
     * @param req DescribeGrafanaIntegrationsRequest
     * @return DescribeGrafanaIntegrationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGrafanaIntegrationsResponse DescribeGrafanaIntegrations(DescribeGrafanaIntegrationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGrafanaIntegrations", DescribeGrafanaIntegrationsResponse.class);
    }

    /**
     *列出 Grafana 告警通道
     * @param req DescribeGrafanaNotificationChannelsRequest
     * @return DescribeGrafanaNotificationChannelsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGrafanaNotificationChannelsResponse DescribeGrafanaNotificationChannels(DescribeGrafanaNotificationChannelsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGrafanaNotificationChannels", DescribeGrafanaNotificationChannelsResponse.class);
    }

    /**
     *列出 Grafana 白名单
     * @param req DescribeGrafanaWhiteListRequest
     * @return DescribeGrafanaWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGrafanaWhiteListResponse DescribeGrafanaWhiteList(DescribeGrafanaWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGrafanaWhiteList", DescribeGrafanaWhiteListResponse.class);
    }

    /**
     *列出实例已安装的插件
     * @param req DescribeInstalledPluginsRequest
     * @return DescribeInstalledPluginsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstalledPluginsResponse DescribeInstalledPlugins(DescribeInstalledPluginsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstalledPlugins", DescribeInstalledPluginsResponse.class);
    }

    /**
     *获取资源消耗页概览
     * @param req DescribeMonitorResourceInfoRequest
     * @return DescribeMonitorResourceInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMonitorResourceInfoResponse DescribeMonitorResourceInfo(DescribeMonitorResourceInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMonitorResourceInfo", DescribeMonitorResourceInfoResponse.class);
    }

    /**
     *腾讯云可观测平台支持多种类型的监控，此接口列出支持的所有类型
     * @param req DescribeMonitorTypesRequest
     * @return DescribeMonitorTypesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMonitorTypesResponse DescribeMonitorTypes(DescribeMonitorTypesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMonitorTypes", DescribeMonitorTypesResponse.class);
    }

    /**
     *查询周期内电话流水总数
     * @param req DescribePhoneAlarmFlowTotalCountRequest
     * @return DescribePhoneAlarmFlowTotalCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribePhoneAlarmFlowTotalCountResponse DescribePhoneAlarmFlowTotalCount(DescribePhoneAlarmFlowTotalCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePhoneAlarmFlowTotalCount", DescribePhoneAlarmFlowTotalCountResponse.class);
    }

    /**
     *列出可安装的所有 Grafana 插件。
     * @param req DescribePluginOverviewsRequest
     * @return DescribePluginOverviewsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePluginOverviewsResponse DescribePluginOverviews(DescribePluginOverviewsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePluginOverviews", DescribePluginOverviewsResponse.class);
    }

    /**
     *获取基础告警策略条件
     * @param req DescribePolicyConditionListRequest
     * @return DescribePolicyConditionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePolicyConditionListResponse DescribePolicyConditionList(DescribePolicyConditionListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePolicyConditionList", DescribePolicyConditionListResponse.class);
    }

    /**
     *获取基础策略组详情
     * @param req DescribePolicyGroupInfoRequest
     * @return DescribePolicyGroupInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribePolicyGroupInfoResponse DescribePolicyGroupInfo(DescribePolicyGroupInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePolicyGroupInfo", DescribePolicyGroupInfoResponse.class);
    }

    /**
     *获取基础策略告警组列表
     * @param req DescribePolicyGroupListRequest
     * @return DescribePolicyGroupListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePolicyGroupListResponse DescribePolicyGroupList(DescribePolicyGroupListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePolicyGroupList", DescribePolicyGroupListResponse.class);
    }

    /**
     *查询策略组在每个地域下面绑定的对象数统计
     * @param req DescribePolicyObjectCountRequest
     * @return DescribePolicyObjectCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribePolicyObjectCountResponse DescribePolicyObjectCount(DescribePolicyObjectCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePolicyObjectCount", DescribePolicyObjectCountResponse.class);
    }

    /**
     *分页获取产品事件的列表
     * @param req DescribeProductEventListRequest
     * @return DescribeProductEventListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductEventListResponse DescribeProductEventList(DescribeProductEventListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProductEventList", DescribeProductEventListResponse.class);
    }

    /**
     *查询腾讯云可观测平台云产品列表，支持云服务器CVM、云数据库、云消息队列、负载均衡、容器服务、专线等云产品。
     * @param req DescribeProductListRequest
     * @return DescribeProductListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductListResponse DescribeProductList(DescribeProductListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProductList", DescribeProductListResponse.class);
    }

    /**
     *获取关联目标集群的实例列表
     * @param req DescribePrometheusAgentInstancesRequest
     * @return DescribePrometheusAgentInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusAgentInstancesResponse DescribePrometheusAgentInstances(DescribePrometheusAgentInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusAgentInstances", DescribePrometheusAgentInstancesResponse.class);
    }

    /**
     *列出 Prometheus CVM Agent
     * @param req DescribePrometheusAgentsRequest
     * @return DescribePrometheusAgentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusAgentsResponse DescribePrometheusAgents(DescribePrometheusAgentsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusAgents", DescribePrometheusAgentsResponse.class);
    }

    /**
     *查询给定prometheus下的告警分组
     * @param req DescribePrometheusAlertGroupsRequest
     * @return DescribePrometheusAlertGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusAlertGroupsResponse DescribePrometheusAlertGroups(DescribePrometheusAlertGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusAlertGroups", DescribePrometheusAlertGroupsResponse.class);
    }

    /**
     *获取2.0实例告警策略列表
     * @param req DescribePrometheusAlertPolicyRequest
     * @return DescribePrometheusAlertPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusAlertPolicyResponse DescribePrometheusAlertPolicy(DescribePrometheusAlertPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusAlertPolicy", DescribePrometheusAlertPolicyResponse.class);
    }

    /**
     *获取TMP实例关联集群列表
     * @param req DescribePrometheusClusterAgentsRequest
     * @return DescribePrometheusClusterAgentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusClusterAgentsResponse DescribePrometheusClusterAgents(DescribePrometheusClusterAgentsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusClusterAgents", DescribePrometheusClusterAgentsResponse.class);
    }

    /**
     *拉取Prometheus配置
     * @param req DescribePrometheusConfigRequest
     * @return DescribePrometheusConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusConfigResponse DescribePrometheusConfig(DescribePrometheusConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusConfig", DescribePrometheusConfigResponse.class);
    }

    /**
     *获得实例级别抓取配置
     * @param req DescribePrometheusGlobalConfigRequest
     * @return DescribePrometheusGlobalConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusGlobalConfigResponse DescribePrometheusGlobalConfig(DescribePrometheusGlobalConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusGlobalConfig", DescribePrometheusGlobalConfigResponse.class);
    }

    /**
     *查询全局告警通知渠道
     * @param req DescribePrometheusGlobalNotificationRequest
     * @return DescribePrometheusGlobalNotificationResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusGlobalNotificationResponse DescribePrometheusGlobalNotification(DescribePrometheusGlobalNotificationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusGlobalNotification", DescribePrometheusGlobalNotificationResponse.class);
    }

    /**
     *获取TMP实例详情
     * @param req DescribePrometheusInstanceDetailRequest
     * @return DescribePrometheusInstanceDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusInstanceDetailResponse DescribePrometheusInstanceDetail(DescribePrometheusInstanceDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusInstanceDetail", DescribePrometheusInstanceDetailResponse.class);
    }

    /**
     *获取2.0实例初始化任务状态
     * @param req DescribePrometheusInstanceInitStatusRequest
     * @return DescribePrometheusInstanceInitStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusInstanceInitStatusResponse DescribePrometheusInstanceInitStatus(DescribePrometheusInstanceInitStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusInstanceInitStatus", DescribePrometheusInstanceInitStatusResponse.class);
    }

    /**
     *查询Prometheus按量实例用量
     * @param req DescribePrometheusInstanceUsageRequest
     * @return DescribePrometheusInstanceUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusInstanceUsageResponse DescribePrometheusInstanceUsage(DescribePrometheusInstanceUsageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusInstanceUsage", DescribePrometheusInstanceUsageResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusInstances", DescribePrometheusInstancesResponse.class);
    }

    /**
     *获取与 Prometheus 监控融合实例列表
     * @param req DescribePrometheusInstancesOverviewRequest
     * @return DescribePrometheusInstancesOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusInstancesOverviewResponse DescribePrometheusInstancesOverview(DescribePrometheusInstancesOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusInstancesOverview", DescribePrometheusInstancesOverviewResponse.class);
    }

    /**
     *获取prometheus集成指标
     * @param req DescribePrometheusIntegrationMetricsRequest
     * @return DescribePrometheusIntegrationMetricsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusIntegrationMetricsResponse DescribePrometheusIntegrationMetrics(DescribePrometheusIntegrationMetricsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusIntegrationMetrics", DescribePrometheusIntegrationMetricsResponse.class);
    }

    /**
     *获取聚合规则列表，包含关联集群内crd资源创建的record rule
     * @param req DescribePrometheusRecordRulesRequest
     * @return DescribePrometheusRecordRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusRecordRulesResponse DescribePrometheusRecordRules(DescribePrometheusRecordRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusRecordRules", DescribePrometheusRecordRulesResponse.class);
    }

    /**
     *列出 Prometheus 服务所有可用的地域
     * @param req DescribePrometheusRegionsRequest
     * @return DescribePrometheusRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusRegionsResponse DescribePrometheusRegions(DescribePrometheusRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusRegions", DescribePrometheusRegionsResponse.class);
    }

    /**
     *列出 Prometheus 抓取任务
     * @param req DescribePrometheusScrapeJobsRequest
     * @return DescribePrometheusScrapeJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusScrapeJobsResponse DescribePrometheusScrapeJobs(DescribePrometheusScrapeJobsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusScrapeJobs", DescribePrometheusScrapeJobsResponse.class);
    }

    /**
     *获取实例采集速率信息
     * @param req DescribePrometheusScrapeStatisticsRequest
     * @return DescribePrometheusScrapeStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusScrapeStatisticsResponse DescribePrometheusScrapeStatistics(DescribePrometheusScrapeStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusScrapeStatistics", DescribePrometheusScrapeStatisticsResponse.class);
    }

    /**
     *获取targets信息，在过滤条件中指定job名称时返回targets详情，否则仅返回数量
     * @param req DescribePrometheusTargetsTMPRequest
     * @return DescribePrometheusTargetsTMPResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusTargetsTMPResponse DescribePrometheusTargetsTMP(DescribePrometheusTargetsTMPRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusTargetsTMP", DescribePrometheusTargetsTMPResponse.class);
    }

    /**
     *拉取模板列表，默认模板将总是在最前面
     * @param req DescribePrometheusTempRequest
     * @return DescribePrometheusTempResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusTempResponse DescribePrometheusTemp(DescribePrometheusTempRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusTemp", DescribePrometheusTempResponse.class);
    }

    /**
     *获取模板关联实例信息，针对V2版本实例
     * @param req DescribePrometheusTempSyncRequest
     * @return DescribePrometheusTempSyncResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusTempSyncResponse DescribePrometheusTempSync(DescribePrometheusTempSyncRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusTempSync", DescribePrometheusTempSyncResponse.class);
    }

    /**
     *列出 Prometheus 服务可用区。
     * @param req DescribePrometheusZonesRequest
     * @return DescribePrometheusZonesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusZonesResponse DescribePrometheusZones(DescribePrometheusZonesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusZones", DescribePrometheusZonesResponse.class);
    }

    /**
     *根据条件查询 Prometheus 预聚合规则
     * @param req DescribeRecordingRulesRequest
     * @return DescribeRecordingRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordingRulesResponse DescribeRecordingRules(DescribeRecordingRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRecordingRules", DescribeRecordingRulesResponse.class);
    }

    /**
     *获取多写配置详情
     * @param req DescribeRemoteURLsRequest
     * @return DescribeRemoteURLsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRemoteURLsResponse DescribeRemoteURLs(DescribeRemoteURLsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRemoteURLs", DescribeRemoteURLsResponse.class);
    }

    /**
     *列出当前grafana实例的所有授权账号
     * @param req DescribeSSOAccountRequest
     * @return DescribeSSOAccountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSSOAccountResponse DescribeSSOAccount(DescribeSSOAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSSOAccount", DescribeSSOAccountResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeServiceDiscovery", DescribeServiceDiscoveryResponse.class);
    }

    /**
     *根据维度条件查询监控数据
     * @param req DescribeStatisticDataRequest
     * @return DescribeStatisticDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStatisticDataResponse DescribeStatisticData(DescribeStatisticDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStatisticData", DescribeStatisticDataResponse.class);
    }

    /**
     *彻底删除 Prometheus 实例相关数据，给定的实例必须先被 Terminate(该接口是异步接口，实例是否释放需要通过 DescribePrometheusInstances 接口返回的状态来判断)。
     * @param req DestroyPrometheusInstanceRequest
     * @return DestroyPrometheusInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DestroyPrometheusInstanceResponse DestroyPrometheusInstance(DestroyPrometheusInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyPrometheusInstance", DestroyPrometheusInstanceResponse.class);
    }

    /**
     *设置 Grafana 公网访问
     * @param req EnableGrafanaInternetRequest
     * @return EnableGrafanaInternetResponse
     * @throws TencentCloudSDKException
     */
    public EnableGrafanaInternetResponse EnableGrafanaInternet(EnableGrafanaInternetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableGrafanaInternet", EnableGrafanaInternetResponse.class);
    }

    /**
     *设置 Grafana 单点登录，使用腾讯云账号
     * @param req EnableGrafanaSSORequest
     * @return EnableGrafanaSSOResponse
     * @throws TencentCloudSDKException
     */
    public EnableGrafanaSSOResponse EnableGrafanaSSO(EnableGrafanaSSORequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableGrafanaSSO", EnableGrafanaSSOResponse.class);
    }

    /**
     *SSO单点登录时，设置是否cam鉴权
     * @param req EnableSSOCamCheckRequest
     * @return EnableSSOCamCheckResponse
     * @throws TencentCloudSDKException
     */
    public EnableSSOCamCheckResponse EnableSSOCamCheck(EnableSSOCamCheckRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableSSOCamCheck", EnableSSOCamCheckResponse.class);
    }

    /**
     *Prometheus 内部动态 api 代理，仅内部使用
     * @param req ExportPrometheusReadOnlyDynamicAPIRequest
     * @return ExportPrometheusReadOnlyDynamicAPIResponse
     * @throws TencentCloudSDKException
     */
    public ExportPrometheusReadOnlyDynamicAPIResponse ExportPrometheusReadOnlyDynamicAPI(ExportPrometheusReadOnlyDynamicAPIRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportPrometheusReadOnlyDynamicAPI", ExportPrometheusReadOnlyDynamicAPIResponse.class);
    }

    /**
     *获取云产品的监控数据。此接口不适用于拉取容器服务监控数据，如需拉取容器服务监控数据，请使用[根据维度条件查询监控数据](https://cloud.tencent.com/document/product/248/51845)接口。
传入产品的命名空间、对象维度描述和监控指标即可获得相应的监控数据。
接口调用限制：单请求最多可支持批量拉取10个实例的监控数据，单请求的数据点数限制为1440个。
若您需要调用的指标、对象较多，可能存在因限频出现拉取失败的情况，建议尽量将请求按时间维度均摊。
参数SpecifyStatistics目前可支持返回三种统计方式（avg，max，min），分别为二进制1，2，4。
例子：3:avg+max，5:avg+min，6:max+min，7:avg+max+min
拉取数据的粒度和统计方式的对应关系尽量在接入平台进行配置，如果没有配置对应统计方式，请提工单反馈。

>?
>- 2022年9月1日起，腾讯云可观测平台开始对GetMonitorData接口计费。每个主账号每月可获得100万次免费请求额度，超过免费额度后如需继续调用接口需要开通 [API请求按量付费](https://buy.cloud.tencent.com/APIRequestBuy)。计费规则可查看[API计费文档](https://cloud.tencent.com/document/product/248/77914)。
     * @param req GetMonitorDataRequest
     * @return GetMonitorDataResponse
     * @throws TencentCloudSDKException
     */
    public GetMonitorDataResponse GetMonitorData(GetMonitorDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetMonitorData", GetMonitorDataResponse.class);
    }

    /**
     *获取 Prometheus Agent 管理相关的命令行
     * @param req GetPrometheusAgentManagementCommandRequest
     * @return GetPrometheusAgentManagementCommandResponse
     * @throws TencentCloudSDKException
     */
    public GetPrometheusAgentManagementCommandResponse GetPrometheusAgentManagementCommand(GetPrometheusAgentManagementCommandRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetPrometheusAgentManagementCommand", GetPrometheusAgentManagementCommandResponse.class);
    }

    /**
     *支持TopN查询，对于给定的监控指标和时间区间，按照指标大小按序返回不同维度组合及数据。
     * @param req GetTopNMonitorDataRequest
     * @return GetTopNMonitorDataResponse
     * @throws TencentCloudSDKException
     */
    public GetTopNMonitorDataResponse GetTopNMonitorData(GetTopNMonitorDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTopNMonitorData", GetTopNMonitorDataResponse.class);
    }

    /**
     *安装 Grafana Plugin
     * @param req InstallPluginsRequest
     * @return InstallPluginsResponse
     * @throws TencentCloudSDKException
     */
    public InstallPluginsResponse InstallPlugins(InstallPluginsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InstallPlugins", InstallPluginsResponse.class);
    }

    /**
     *编辑告警通知模板
     * @param req ModifyAlarmNoticeRequest
     * @return ModifyAlarmNoticeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmNoticeResponse ModifyAlarmNotice(ModifyAlarmNoticeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAlarmNotice", ModifyAlarmNoticeResponse.class);
    }

    /**
     *修改告警策略触发条件
     * @param req ModifyAlarmPolicyConditionRequest
     * @return ModifyAlarmPolicyConditionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmPolicyConditionResponse ModifyAlarmPolicyCondition(ModifyAlarmPolicyConditionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAlarmPolicyCondition", ModifyAlarmPolicyConditionResponse.class);
    }

    /**
     *告警2.0编辑告警策略基本信息，包括策略名、备注
     * @param req ModifyAlarmPolicyInfoRequest
     * @return ModifyAlarmPolicyInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmPolicyInfoResponse ModifyAlarmPolicyInfo(ModifyAlarmPolicyInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAlarmPolicyInfo", ModifyAlarmPolicyInfoResponse.class);
    }

    /**
     *修改告警策略绑定的告警通知模板
     * @param req ModifyAlarmPolicyNoticeRequest
     * @return ModifyAlarmPolicyNoticeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmPolicyNoticeResponse ModifyAlarmPolicyNotice(ModifyAlarmPolicyNoticeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAlarmPolicyNotice", ModifyAlarmPolicyNoticeResponse.class);
    }

    /**
     *启停告警策略
     * @param req ModifyAlarmPolicyStatusRequest
     * @return ModifyAlarmPolicyStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmPolicyStatusResponse ModifyAlarmPolicyStatus(ModifyAlarmPolicyStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAlarmPolicyStatus", ModifyAlarmPolicyStatusResponse.class);
    }

    /**
     *修改告警策略的触发任务，TriggerTasks字段放触发任务列表，TriggerTasks传空数组时，代表解绑该策略的所有触发任务。
     * @param req ModifyAlarmPolicyTasksRequest
     * @return ModifyAlarmPolicyTasksResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmPolicyTasksResponse ModifyAlarmPolicyTasks(ModifyAlarmPolicyTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAlarmPolicyTasks", ModifyAlarmPolicyTasksResponse.class);
    }

    /**
     *修改告警接收人
     * @param req ModifyAlarmReceiversRequest
     * @return ModifyAlarmReceiversResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmReceiversResponse ModifyAlarmReceivers(ModifyAlarmReceiversRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAlarmReceivers", ModifyAlarmReceiversResponse.class);
    }

    /**
     *修改 Grafana 实例属性
     * @param req ModifyGrafanaInstanceRequest
     * @return ModifyGrafanaInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGrafanaInstanceResponse ModifyGrafanaInstance(ModifyGrafanaInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyGrafanaInstance", ModifyGrafanaInstanceResponse.class);
    }

    /**
     *更新策略组
     * @param req ModifyPolicyGroupRequest
     * @return ModifyPolicyGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPolicyGroupResponse ModifyPolicyGroup(ModifyPolicyGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPolicyGroup", ModifyPolicyGroupResponse.class);
    }

    /**
     *修改被关联集群的external labels
     * @param req ModifyPrometheusAgentExternalLabelsRequest
     * @return ModifyPrometheusAgentExternalLabelsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrometheusAgentExternalLabelsResponse ModifyPrometheusAgentExternalLabels(ModifyPrometheusAgentExternalLabelsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPrometheusAgentExternalLabels", ModifyPrometheusAgentExternalLabelsResponse.class);
    }

    /**
     *修改2.0实例告警策略
     * @param req ModifyPrometheusAlertPolicyRequest
     * @return ModifyPrometheusAlertPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrometheusAlertPolicyResponse ModifyPrometheusAlertPolicy(ModifyPrometheusAlertPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPrometheusAlertPolicy", ModifyPrometheusAlertPolicyResponse.class);
    }

    /**
     *修改prometheus采集配置
     * @param req ModifyPrometheusConfigRequest
     * @return ModifyPrometheusConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrometheusConfigResponse ModifyPrometheusConfig(ModifyPrometheusConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPrometheusConfig", ModifyPrometheusConfigResponse.class);
    }

    /**
     *修改全局告警通知渠道
     * @param req ModifyPrometheusGlobalNotificationRequest
     * @return ModifyPrometheusGlobalNotificationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrometheusGlobalNotificationResponse ModifyPrometheusGlobalNotification(ModifyPrometheusGlobalNotificationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPrometheusGlobalNotification", ModifyPrometheusGlobalNotificationResponse.class);
    }

    /**
     *修改 Prometheus 实例相关属性
     * @param req ModifyPrometheusInstanceAttributesRequest
     * @return ModifyPrometheusInstanceAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrometheusInstanceAttributesResponse ModifyPrometheusInstanceAttributes(ModifyPrometheusInstanceAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPrometheusInstanceAttributes", ModifyPrometheusInstanceAttributesResponse.class);
    }

    /**
     *通过yaml的方式修改Prometheus预聚合规则
     * @param req ModifyPrometheusRecordRuleYamlRequest
     * @return ModifyPrometheusRecordRuleYamlResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrometheusRecordRuleYamlResponse ModifyPrometheusRecordRuleYaml(ModifyPrometheusRecordRuleYamlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPrometheusRecordRuleYaml", ModifyPrometheusRecordRuleYamlResponse.class);
    }

    /**
     *修改模板内容
     * @param req ModifyPrometheusTempRequest
     * @return ModifyPrometheusTempResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrometheusTempResponse ModifyPrometheusTemp(ModifyPrometheusTempRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPrometheusTemp", ModifyPrometheusTempResponse.class);
    }

    /**
     *修改多写配置
     * @param req ModifyRemoteURLsRequest
     * @return ModifyRemoteURLsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRemoteURLsResponse ModifyRemoteURLs(ModifyRemoteURLsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRemoteURLs", ModifyRemoteURLsResponse.class);
    }

    /**
     *本接口（ResumeGrafanaInstance）用于 Grafana 包年包月实例的停服续费，调用后按原版本续费一个月。仍在运行中的实例无法使用该接口进行续费。
     * @param req ResumeGrafanaInstanceRequest
     * @return ResumeGrafanaInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ResumeGrafanaInstanceResponse ResumeGrafanaInstance(ResumeGrafanaInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResumeGrafanaInstance", ResumeGrafanaInstanceResponse.class);
    }

    /**
     *初始化TMP实例，开启集成中心时调用
     * @param req RunPrometheusInstanceRequest
     * @return RunPrometheusInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RunPrometheusInstanceResponse RunPrometheusInstance(RunPrometheusInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RunPrometheusInstance", RunPrometheusInstanceResponse.class);
    }

    /**
     *设置一个策略为该告警策略类型、该项目的默认告警策略。
同一项目下相同的告警策略类型，就会被设置为非默认。
     * @param req SetDefaultAlarmPolicyRequest
     * @return SetDefaultAlarmPolicyResponse
     * @throws TencentCloudSDKException
     */
    public SetDefaultAlarmPolicyResponse SetDefaultAlarmPolicy(SetDefaultAlarmPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetDefaultAlarmPolicy", SetDefaultAlarmPolicyResponse.class);
    }

    /**
     *同步模板到实例或者集群，针对V2版本实例
     * @param req SyncPrometheusTempRequest
     * @return SyncPrometheusTempResponse
     * @throws TencentCloudSDKException
     */
    public SyncPrometheusTempResponse SyncPrometheusTemp(SyncPrometheusTempRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SyncPrometheusTemp", SyncPrometheusTempResponse.class);
    }

    /**
     *销毁按量 Prometheus 实例
     * @param req TerminatePrometheusInstancesRequest
     * @return TerminatePrometheusInstancesResponse
     * @throws TencentCloudSDKException
     */
    public TerminatePrometheusInstancesResponse TerminatePrometheusInstances(TerminatePrometheusInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminatePrometheusInstances", TerminatePrometheusInstancesResponse.class);
    }

    /**
     *删除全部的关联对象
     * @param req UnBindingAllPolicyObjectRequest
     * @return UnBindingAllPolicyObjectResponse
     * @throws TencentCloudSDKException
     */
    public UnBindingAllPolicyObjectResponse UnBindingAllPolicyObject(UnBindingAllPolicyObjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnBindingAllPolicyObject", UnBindingAllPolicyObjectResponse.class);
    }

    /**
     *删除策略的关联对象
     * @param req UnBindingPolicyObjectRequest
     * @return UnBindingPolicyObjectResponse
     * @throws TencentCloudSDKException
     */
    public UnBindingPolicyObjectResponse UnBindingPolicyObject(UnBindingPolicyObjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnBindingPolicyObject", UnBindingPolicyObjectResponse.class);
    }

    /**
     *解除实例绑定的 Grafana 可视化实例
     * @param req UnbindPrometheusManagedGrafanaRequest
     * @return UnbindPrometheusManagedGrafanaResponse
     * @throws TencentCloudSDKException
     */
    public UnbindPrometheusManagedGrafanaResponse UnbindPrometheusManagedGrafana(UnbindPrometheusManagedGrafanaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnbindPrometheusManagedGrafana", UnbindPrometheusManagedGrafanaResponse.class);
    }

    /**
     *删除 Grafana Dashboard
     * @param req UninstallGrafanaDashboardRequest
     * @return UninstallGrafanaDashboardResponse
     * @throws TencentCloudSDKException
     */
    public UninstallGrafanaDashboardResponse UninstallGrafanaDashboard(UninstallGrafanaDashboardRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UninstallGrafanaDashboard", UninstallGrafanaDashboardResponse.class);
    }

    /**
     *删除已安装的插件
     * @param req UninstallGrafanaPluginsRequest
     * @return UninstallGrafanaPluginsResponse
     * @throws TencentCloudSDKException
     */
    public UninstallGrafanaPluginsResponse UninstallGrafanaPlugins(UninstallGrafanaPluginsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UninstallGrafanaPlugins", UninstallGrafanaPluginsResponse.class);
    }

    /**
     *更新 Prometheus 的告警规则。

请注意，**告警对象和告警消息是 Prometheus Rule Annotations 的特殊字段，需要通过 annotations 来传递，对应的 Key 分别为summary/description**，请参考 [Prometheus Rule更多配置请参考](https://prometheus.io/docs/prometheus/latest/configuration/alerting_rules/)。
     * @param req UpdateAlertRuleRequest
     * @return UpdateAlertRuleResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAlertRuleResponse UpdateAlertRule(UpdateAlertRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAlertRule", UpdateAlertRuleResponse.class);
    }

    /**
     *更新 Prometheus 报警策略状态
     * @param req UpdateAlertRuleStateRequest
     * @return UpdateAlertRuleStateResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAlertRuleStateResponse UpdateAlertRuleState(UpdateAlertRuleStateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAlertRuleState", UpdateAlertRuleStateResponse.class);
    }

    /**
     *更新 Grafana 的 DNS 配置
     * @param req UpdateDNSConfigRequest
     * @return UpdateDNSConfigResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDNSConfigResponse UpdateDNSConfig(UpdateDNSConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateDNSConfig", UpdateDNSConfigResponse.class);
    }

    /**
     *更新 exporter 集成配置
     * @param req UpdateExporterIntegrationRequest
     * @return UpdateExporterIntegrationResponse
     * @throws TencentCloudSDKException
     */
    public UpdateExporterIntegrationResponse UpdateExporterIntegration(UpdateExporterIntegrationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateExporterIntegration", UpdateExporterIntegrationResponse.class);
    }

    /**
     *更新 Grafana 配置
     * @param req UpdateGrafanaConfigRequest
     * @return UpdateGrafanaConfigResponse
     * @throws TencentCloudSDKException
     */
    public UpdateGrafanaConfigResponse UpdateGrafanaConfig(UpdateGrafanaConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateGrafanaConfig", UpdateGrafanaConfigResponse.class);
    }

    /**
     *更新 Grafana 环境变量
     * @param req UpdateGrafanaEnvironmentsRequest
     * @return UpdateGrafanaEnvironmentsResponse
     * @throws TencentCloudSDKException
     */
    public UpdateGrafanaEnvironmentsResponse UpdateGrafanaEnvironments(UpdateGrafanaEnvironmentsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateGrafanaEnvironments", UpdateGrafanaEnvironmentsResponse.class);
    }

    /**
     *更新 Grafana 集成配置
     * @param req UpdateGrafanaIntegrationRequest
     * @return UpdateGrafanaIntegrationResponse
     * @throws TencentCloudSDKException
     */
    public UpdateGrafanaIntegrationResponse UpdateGrafanaIntegration(UpdateGrafanaIntegrationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateGrafanaIntegration", UpdateGrafanaIntegrationResponse.class);
    }

    /**
     *更新 Grafana 告警通道
     * @param req UpdateGrafanaNotificationChannelRequest
     * @return UpdateGrafanaNotificationChannelResponse
     * @throws TencentCloudSDKException
     */
    public UpdateGrafanaNotificationChannelResponse UpdateGrafanaNotificationChannel(UpdateGrafanaNotificationChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateGrafanaNotificationChannel", UpdateGrafanaNotificationChannelResponse.class);
    }

    /**
     *更新 Grafana 白名单
     * @param req UpdateGrafanaWhiteListRequest
     * @return UpdateGrafanaWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public UpdateGrafanaWhiteListResponse UpdateGrafanaWhiteList(UpdateGrafanaWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateGrafanaWhiteList", UpdateGrafanaWhiteListResponse.class);
    }

    /**
     *更新 Prometheus CVM Agent 状态
     * @param req UpdatePrometheusAgentStatusRequest
     * @return UpdatePrometheusAgentStatusResponse
     * @throws TencentCloudSDKException
     */
    public UpdatePrometheusAgentStatusResponse UpdatePrometheusAgentStatus(UpdatePrometheusAgentStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdatePrometheusAgentStatus", UpdatePrometheusAgentStatusResponse.class);
    }

    /**
     *更新Prometheus告警规则分组
     * @param req UpdatePrometheusAlertGroupRequest
     * @return UpdatePrometheusAlertGroupResponse
     * @throws TencentCloudSDKException
     */
    public UpdatePrometheusAlertGroupResponse UpdatePrometheusAlertGroup(UpdatePrometheusAlertGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdatePrometheusAlertGroup", UpdatePrometheusAlertGroupResponse.class);
    }

    /**
     *批量更新告警分组状态，将分组中全部告警规则更新为目标状态
     * @param req UpdatePrometheusAlertGroupStateRequest
     * @return UpdatePrometheusAlertGroupStateResponse
     * @throws TencentCloudSDKException
     */
    public UpdatePrometheusAlertGroupStateResponse UpdatePrometheusAlertGroupState(UpdatePrometheusAlertGroupStateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdatePrometheusAlertGroupState", UpdatePrometheusAlertGroupStateResponse.class);
    }

    /**
     *更新 Prometheus Agent 抓取任务
     * @param req UpdatePrometheusScrapeJobRequest
     * @return UpdatePrometheusScrapeJobResponse
     * @throws TencentCloudSDKException
     */
    public UpdatePrometheusScrapeJobResponse UpdatePrometheusScrapeJob(UpdatePrometheusScrapeJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdatePrometheusScrapeJob", UpdatePrometheusScrapeJobResponse.class);
    }

    /**
     *更新 Prometheus 的预聚合规则
     * @param req UpdateRecordingRuleRequest
     * @return UpdateRecordingRuleResponse
     * @throws TencentCloudSDKException
     */
    public UpdateRecordingRuleResponse UpdateRecordingRule(UpdateRecordingRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateRecordingRule", UpdateRecordingRuleResponse.class);
    }

    /**
     *更新已授权账号的备注、权限信息，会直接覆盖原有的信息，不传则不会更新。
     * @param req UpdateSSOAccountRequest
     * @return UpdateSSOAccountResponse
     * @throws TencentCloudSDKException
     */
    public UpdateSSOAccountResponse UpdateSSOAccount(UpdateSSOAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateSSOAccount", UpdateSSOAccountResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateServiceDiscovery", UpdateServiceDiscoveryResponse.class);
    }

    /**
     *升级 Grafana Dashboard
     * @param req UpgradeGrafanaDashboardRequest
     * @return UpgradeGrafanaDashboardResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeGrafanaDashboardResponse UpgradeGrafanaDashboard(UpgradeGrafanaDashboardRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeGrafanaDashboard", UpgradeGrafanaDashboardResponse.class);
    }

    /**
     *升级 Grafana 实例
     * @param req UpgradeGrafanaInstanceRequest
     * @return UpgradeGrafanaInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeGrafanaInstanceResponse UpgradeGrafanaInstance(UpgradeGrafanaInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeGrafanaInstance", UpgradeGrafanaInstanceResponse.class);
    }

}
