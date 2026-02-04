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
     *查询用户所有漏洞信息
     * @param req DescribeApmAllVulCountRequest
     * @return DescribeApmAllVulCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApmAllVulCountResponse DescribeApmAllVulCount(DescribeApmAllVulCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApmAllVulCount", DescribeApmAllVulCountResponse.class);
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
     *查询漏洞指标
     * @param req DescribeApmVulnerabilityCountRequest
     * @return DescribeApmVulnerabilityCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApmVulnerabilityCountResponse DescribeApmVulnerabilityCount(DescribeApmVulnerabilityCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApmVulnerabilityCount", DescribeApmVulnerabilityCountResponse.class);
    }

    /**
     *查询漏洞详情
     * @param req DescribeApmVulnerabilityDetailRequest
     * @return DescribeApmVulnerabilityDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApmVulnerabilityDetailResponse DescribeApmVulnerabilityDetail(DescribeApmVulnerabilityDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApmVulnerabilityDetail", DescribeApmVulnerabilityDetailResponse.class);
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

获取指标数据通用接口用法：DescribeGeneralMetricData 是通用的指标数据查询接口，支持灵活的获取指标数据。该接口的查询方式类似于使用如下 SQL 语句：SELECT {Metrics} FROM {ViewName} WHERE {Filters} GROUP BY {GroupBy}。在发起请求前，请确定如下关键入参：
1. 视图（ViewName）
决定您要查询的数据领域。
例如：service_metric（服务监控视图）、db_metric（数据库视图）等。关于 APM 支持的视图，请参考 [指标视图](https://cloud.tencent.com/document/product/248/101681#069b06a9-2593-49db-b694-dea4200f3b19)。

2. 指标（Metrics）
用于指定返回结果中包含的一个或多个指标项。
例如：request_count（请求数）、duration_avg（平均耗时）、error_rate（错误率）。关于APM 支持的指标，请参考 [APM 指标协议标准](https://cloud.tencent.com/document/product/248/101681)，每种视图（ViewName）支持专属的指标集。
3. 过滤（Filters）
支持一个或多个键值对（Key-Value）形式的过滤条件。
例如：只查某个特定服务 service.name = "order-service"。通用维度和每种视图（ViewName）支持专属专属维度，可以用作过滤条件中的键（Key），更多详情请参考 [APM 指标协议标准](https://cloud.tencent.com/document/product/248/101681)。

4. 聚合（GroupBy）
支持一个或多个聚合维度，相当于 SQL 的 GROUP BY。
例如：按接口名称 operation 分组，查看每个接口的性能。通用维度和每种视图（ViewName）支持专属专属维度，可以用作聚合维度，更多详情请参考 [APM 指标协议标准](https://cloud.tencent.com/document/product/248/101681)。
5. 粒度 (Period) 
该参数决定了是否需要以时间切片聚合。
    - Period = 1：时间序列模式：返回结果中按时间切片聚合，时间序列（TimeSerial）和数据序列（DataSerial）中包含的多个值一一对应，分别代表特定时间切片上的聚合结果。时间序列模式主要用于展示时间趋势图。
    - Period = 0：汇总统计模式：返回结果中，数据序列（DataSerial）中只包含唯一的值，代表整个时间区间内的汇总数据。
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
     *查询用户所有漏洞信息
     * @param req DescribeOPRAllVulCountRequest
     * @return DescribeOPRAllVulCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOPRAllVulCountResponse DescribeOPRAllVulCount(DescribeOPRAllVulCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOPRAllVulCount", DescribeOPRAllVulCountResponse.class);
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
