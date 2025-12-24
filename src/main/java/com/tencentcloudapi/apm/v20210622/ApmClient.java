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
package com.tencentcloudapi.apm.v20210622;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.apm.v20210622.models.*;

public class ApmClient extends AbstractClient{
    private static String endpoint = "apm.tencentcloudapi.com";
    private static String service = "apm";
    private static String version = "2021-06-22";

    public ApmClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public ApmClient(Credential credential, String region, ClientProfile profile) {
        super(ApmClient.endpoint, ApmClient.version, credential, region, profile);
    }

    /**
     *业务购买 APM 业务系统，调用该接口创建
     * @param req CreateApmInstanceRequest
     * @return CreateApmInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateApmInstanceResponse CreateApmInstance(CreateApmInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateApmInstance", CreateApmInstanceResponse.class);
    }

    /**
     *用于创建apm业务系统与Prometheus实例的指标匹配规则
     * @param req CreateApmPrometheusRuleRequest
     * @return CreateApmPrometheusRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateApmPrometheusRuleResponse CreateApmPrometheusRule(CreateApmPrometheusRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateApmPrometheusRule", CreateApmPrometheusRuleResponse.class);
    }

    /**
     *创建采样配置接口
     * @param req CreateApmSampleConfigRequest
     * @return CreateApmSampleConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateApmSampleConfigResponse CreateApmSampleConfig(CreateApmSampleConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateApmSampleConfig", CreateApmSampleConfigResponse.class);
    }

    /**
     *创建事件任务
     * @param req CreateProfileTaskRequest
     * @return CreateProfileTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateProfileTaskResponse CreateProfileTask(CreateProfileTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateProfileTask", CreateProfileTaskResponse.class);
    }

    /**
     *删除采样配置接口
     * @param req DeleteApmSampleConfigRequest
     * @return DeleteApmSampleConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeleteApmSampleConfigResponse DeleteApmSampleConfig(DeleteApmSampleConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteApmSampleConfig", DeleteApmSampleConfigResponse.class);
    }

    /**
     *获取 APM 接入点
     * @param req DescribeApmAgentRequest
     * @return DescribeApmAgentResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApmAgentResponse DescribeApmAgent(DescribeApmAgentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApmAgent", DescribeApmAgentResponse.class);
    }

    /**
     *查询应用配置接口
     * @param req DescribeApmApplicationConfigRequest
     * @return DescribeApmApplicationConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApmApplicationConfigResponse DescribeApmApplicationConfig(DescribeApmApplicationConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApmApplicationConfig", DescribeApmApplicationConfigResponse.class);
    }

    /**
     *用于查询apm业务系统与其他产品的关联关系
     * @param req DescribeApmAssociationRequest
     * @return DescribeApmAssociationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApmAssociationResponse DescribeApmAssociation(DescribeApmAssociationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApmAssociation", DescribeApmAssociationResponse.class);
    }

    /**
     *获取 APM 业务系统列表
     * @param req DescribeApmInstancesRequest
     * @return DescribeApmInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApmInstancesResponse DescribeApmInstances(DescribeApmInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApmInstances", DescribeApmInstancesResponse.class);
    }

    /**
     *用于查询apm业务系统与Prometheus实例的指标匹配规则
     * @param req DescribeApmPrometheusRuleRequest
     * @return DescribeApmPrometheusRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApmPrometheusRuleResponse DescribeApmPrometheusRule(DescribeApmPrometheusRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApmPrometheusRule", DescribeApmPrometheusRuleResponse.class);
    }

    /**
     *查询采样配置接口
     * @param req DescribeApmSampleConfigRequest
     * @return DescribeApmSampleConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApmSampleConfigResponse DescribeApmSampleConfig(DescribeApmSampleConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApmSampleConfig", DescribeApmSampleConfigResponse.class);
    }

    /**
     *获取 APM 应用指标列表
     * @param req DescribeApmServiceMetricRequest
     * @return DescribeApmServiceMetricResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApmServiceMetricResponse DescribeApmServiceMetric(DescribeApmServiceMetricRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApmServiceMetric", DescribeApmServiceMetricResponse.class);
    }

    /**
     *查询应用配置信息
     * @param req DescribeGeneralApmApplicationConfigRequest
     * @return DescribeGeneralApmApplicationConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGeneralApmApplicationConfigResponse DescribeGeneralApmApplicationConfig(DescribeGeneralApmApplicationConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGeneralApmApplicationConfig", DescribeGeneralApmApplicationConfigResponse.class);
    }

    /**
     *获取指标数据通用接口。用户根据需要上送请求参数，返回对应的指标数据。
接口调用频率限制为：20次/秒，1200次/分钟。单请求的数据点数限制为1440个。
     * @param req DescribeGeneralMetricDataRequest
     * @return DescribeGeneralMetricDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGeneralMetricDataResponse DescribeGeneralMetricData(DescribeGeneralMetricDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGeneralMetricData", DescribeGeneralMetricDataResponse.class);
    }

    /**
     *通用查询 OpenTelemetry 调用链列表
     * @param req DescribeGeneralOTSpanListRequest
     * @return DescribeGeneralOTSpanListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGeneralOTSpanListResponse DescribeGeneralOTSpanList(DescribeGeneralOTSpanListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGeneralOTSpanList", DescribeGeneralOTSpanListResponse.class);
    }

    /**
     *通用查询调用链列表
     * @param req DescribeGeneralSpanListRequest
     * @return DescribeGeneralSpanListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGeneralSpanListResponse DescribeGeneralSpanList(DescribeGeneralSpanListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGeneralSpanList", DescribeGeneralSpanListResponse.class);
    }

    /**
     *查询指标列表接口，查询指标更推荐使用DescribeGeneralMetricData接口
     * @param req DescribeMetricRecordsRequest
     * @return DescribeMetricRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMetricRecordsResponse DescribeMetricRecords(DescribeMetricRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMetricRecords", DescribeMetricRecordsResponse.class);
    }

    /**
     *应用概览数据拉取
     * @param req DescribeServiceOverviewRequest
     * @return DescribeServiceOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceOverviewResponse DescribeServiceOverview(DescribeServiceOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeServiceOverview", DescribeServiceOverviewResponse.class);
    }

    /**
     *根据维度名和过滤条件，查询维度数据.
     * @param req DescribeTagValuesRequest
     * @return DescribeTagValuesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTagValuesResponse DescribeTagValues(DescribeTagValuesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTagValues", DescribeTagValuesResponse.class);
    }

    /**
     *根据应用名查询服务拓扑图
     * @param req DescribeTopologyNewRequest
     * @return DescribeTopologyNewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopologyNewResponse DescribeTopologyNew(DescribeTopologyNewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopologyNew", DescribeTopologyNewResponse.class);
    }

    /**
     *修改应用配置接口
     * @param req ModifyApmApplicationConfigRequest
     * @return ModifyApmApplicationConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApmApplicationConfigResponse ModifyApmApplicationConfig(ModifyApmApplicationConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApmApplicationConfig", ModifyApmApplicationConfigResponse.class);
    }

    /**
     *用于修改apm业务系统与其他产品的关联关系（包括创建和删除）
     * @param req ModifyApmAssociationRequest
     * @return ModifyApmAssociationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApmAssociationResponse ModifyApmAssociation(ModifyApmAssociationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApmAssociation", ModifyApmAssociationResponse.class);
    }

    /**
     *修改APM业务系统接口
     * @param req ModifyApmInstanceRequest
     * @return ModifyApmInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApmInstanceResponse ModifyApmInstance(ModifyApmInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApmInstance", ModifyApmInstanceResponse.class);
    }

    /**
     *用于修改apm业务系统与Prometheus实例的指标匹配规则
     * @param req ModifyApmPrometheusRuleRequest
     * @return ModifyApmPrometheusRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApmPrometheusRuleResponse ModifyApmPrometheusRule(ModifyApmPrometheusRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApmPrometheusRule", ModifyApmPrometheusRuleResponse.class);
    }

    /**
     *修改采样配置接口
     * @param req ModifyApmSampleConfigRequest
     * @return ModifyApmSampleConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApmSampleConfigResponse ModifyApmSampleConfig(ModifyApmSampleConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApmSampleConfig", ModifyApmSampleConfigResponse.class);
    }

    /**
     *对外开放的openApi，客户可以灵活的指定需要修改的字段，再加入需要修改的服务列表.
     * @param req ModifyGeneralApmApplicationConfigRequest
     * @return ModifyGeneralApmApplicationConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGeneralApmApplicationConfigResponse ModifyGeneralApmApplicationConfig(ModifyGeneralApmApplicationConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyGeneralApmApplicationConfig", ModifyGeneralApmApplicationConfigResponse.class);
    }

    /**
     *销毁 APM 业务系统
     * @param req TerminateApmInstanceRequest
     * @return TerminateApmInstanceResponse
     * @throws TencentCloudSDKException
     */
    public TerminateApmInstanceResponse TerminateApmInstance(TerminateApmInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateApmInstance", TerminateApmInstanceResponse.class);
    }

}
