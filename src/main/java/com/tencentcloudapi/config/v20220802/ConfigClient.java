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
package com.tencentcloudapi.config.v20220802;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.config.v20220802.models.*;

public class ConfigClient extends AbstractClient{
    private static String endpoint = "config.tencentcloudapi.com";
    private static String service = "config";
    private static String version = "2022-08-02";

    public ConfigClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public ConfigClient(Credential credential, String region, ClientProfile profile) {
        super(ConfigClient.endpoint, ConfigClient.version, credential, region, profile);
    }

    /**
     *账号组新建合规包
     * @param req AddAggregateCompliancePackRequest
     * @return AddAggregateCompliancePackResponse
     * @throws TencentCloudSDKException
     */
    public AddAggregateCompliancePackResponse AddAggregateCompliancePack(AddAggregateCompliancePackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddAggregateCompliancePack", AddAggregateCompliancePackResponse.class);
    }

    /**
     *账号组新建规则
     * @param req AddAggregateConfigRuleRequest
     * @return AddAggregateConfigRuleResponse
     * @throws TencentCloudSDKException
     */
    public AddAggregateConfigRuleResponse AddAggregateConfigRule(AddAggregateConfigRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddAggregateConfigRule", AddAggregateConfigRuleResponse.class);
    }

    /**
     *新增告警监控规则
     * @param req AddAlarmPolicyRequest
     * @return AddAlarmPolicyResponse
     * @throws TencentCloudSDKException
     */
    public AddAlarmPolicyResponse AddAlarmPolicy(AddAlarmPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddAlarmPolicy", AddAlarmPolicyResponse.class);
    }

    /**
     *新建合规包
     * @param req AddCompliancePackRequest
     * @return AddCompliancePackResponse
     * @throws TencentCloudSDKException
     */
    public AddCompliancePackResponse AddCompliancePack(AddCompliancePackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddCompliancePack", AddCompliancePackResponse.class);
    }

    /**
     *新建 规则
     * @param req AddConfigRuleRequest
     * @return AddConfigRuleResponse
     * @throws TencentCloudSDKException
     */
    public AddConfigRuleResponse AddConfigRule(AddConfigRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddConfigRule", AddConfigRuleResponse.class);
    }

    /**
     *账号组关闭规则
     * @param req CloseAggregateConfigRuleRequest
     * @return CloseAggregateConfigRuleResponse
     * @throws TencentCloudSDKException
     */
    public CloseAggregateConfigRuleResponse CloseAggregateConfigRule(CloseAggregateConfigRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloseAggregateConfigRule", CloseAggregateConfigRuleResponse.class);
    }

    /**
     *资源监控管理-关闭监控
     * @param req CloseConfigRecorderRequest
     * @return CloseConfigRecorderResponse
     * @throws TencentCloudSDKException
     */
    public CloseConfigRecorderResponse CloseConfigRecorder(CloseConfigRecorderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloseConfigRecorder", CloseConfigRecorderResponse.class);
    }

    /**
     *关闭规则
     * @param req CloseConfigRuleRequest
     * @return CloseConfigRuleResponse
     * @throws TencentCloudSDKException
     */
    public CloseConfigRuleResponse CloseConfigRule(CloseConfigRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloseConfigRule", CloseConfigRuleResponse.class);
    }

    /**
     *新建账号组
     * @param req CreateAggregatorRequest
     * @return CreateAggregatorResponse
     * @throws TencentCloudSDKException
     */
    public CreateAggregatorResponse CreateAggregator(CreateAggregatorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAggregator", CreateAggregatorResponse.class);
    }

    /**
     *新增规则修正设置
     * @param req CreateRemediationRequest
     * @return CreateRemediationResponse
     * @throws TencentCloudSDKException
     */
    public CreateRemediationResponse CreateRemediation(CreateRemediationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRemediation", CreateRemediationResponse.class);
    }

    /**
     *账号组删除合规包
     * @param req DeleteAggregateCompliancePackRequest
     * @return DeleteAggregateCompliancePackResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAggregateCompliancePackResponse DeleteAggregateCompliancePack(DeleteAggregateCompliancePackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAggregateCompliancePack", DeleteAggregateCompliancePackResponse.class);
    }

    /**
     *账号组删除规则
     * @param req DeleteAggregateConfigRuleRequest
     * @return DeleteAggregateConfigRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAggregateConfigRuleResponse DeleteAggregateConfigRule(DeleteAggregateConfigRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAggregateConfigRule", DeleteAggregateConfigRuleResponse.class);
    }

    /**
     *删除告警规则
     * @param req DeleteAlarmPolicyRequest
     * @return DeleteAlarmPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAlarmPolicyResponse DeleteAlarmPolicy(DeleteAlarmPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAlarmPolicy", DeleteAlarmPolicyResponse.class);
    }

    /**
     *删除合规包
     * @param req DeleteCompliancePackRequest
     * @return DeleteCompliancePackResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCompliancePackResponse DeleteCompliancePack(DeleteCompliancePackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCompliancePack", DeleteCompliancePackResponse.class);
    }

    /**
     *删除规则
     * @param req DeleteConfigRuleRequest
     * @return DeleteConfigRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteConfigRuleResponse DeleteConfigRule(DeleteConfigRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteConfigRule", DeleteConfigRuleResponse.class);
    }

    /**
     *删除规则修正设置
     * @param req DeleteRemediationsRequest
     * @return DeleteRemediationsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRemediationsResponse DeleteRemediations(DeleteRemediationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRemediations", DeleteRemediationsResponse.class);
    }

    /**
     *账号组合规包详情
     * @param req DescribeAggregateCompliancePackRequest
     * @return DescribeAggregateCompliancePackResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAggregateCompliancePackResponse DescribeAggregateCompliancePack(DescribeAggregateCompliancePackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAggregateCompliancePack", DescribeAggregateCompliancePackResponse.class);
    }

    /**
     *账号组获取投递设置详情
     * @param req DescribeAggregateConfigDeliverRequest
     * @return DescribeAggregateConfigDeliverResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAggregateConfigDeliverResponse DescribeAggregateConfigDeliver(DescribeAggregateConfigDeliverRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAggregateConfigDeliver", DescribeAggregateConfigDeliverResponse.class);
    }

    /**
     *账号组获取规则详情
     * @param req DescribeAggregateConfigRuleRequest
     * @return DescribeAggregateConfigRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAggregateConfigRuleResponse DescribeAggregateConfigRule(DescribeAggregateConfigRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAggregateConfigRule", DescribeAggregateConfigRuleResponse.class);
    }

    /**
     *账号组资源详情
     * @param req DescribeAggregateDiscoveredResourceRequest
     * @return DescribeAggregateDiscoveredResourceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAggregateDiscoveredResourceResponse DescribeAggregateDiscoveredResource(DescribeAggregateDiscoveredResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAggregateDiscoveredResource", DescribeAggregateDiscoveredResourceResponse.class);
    }

    /**
     *账号组详情
     * @param req DescribeAggregatorRequest
     * @return DescribeAggregatorResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAggregatorResponse DescribeAggregator(DescribeAggregatorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAggregator", DescribeAggregatorResponse.class);
    }

    /**
     *合规包详情
     * @param req DescribeCompliancePackRequest
     * @return DescribeCompliancePackResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCompliancePackResponse DescribeCompliancePack(DescribeCompliancePackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCompliancePack", DescribeCompliancePackResponse.class);
    }

    /**
     *获取投递设置详情
     * @param req DescribeConfigDeliverRequest
     * @return DescribeConfigDeliverResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigDeliverResponse DescribeConfigDeliver(DescribeConfigDeliverRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConfigDeliver", DescribeConfigDeliverResponse.class);
    }

    /**
     *获取监控详情
     * @param req DescribeConfigRecorderRequest
     * @return DescribeConfigRecorderResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigRecorderResponse DescribeConfigRecorder(DescribeConfigRecorderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConfigRecorder", DescribeConfigRecorderResponse.class);
    }

    /**
     *获取规则详情
     * @param req DescribeConfigRuleRequest
     * @return DescribeConfigRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigRuleResponse DescribeConfigRule(DescribeConfigRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConfigRule", DescribeConfigRuleResponse.class);
    }

    /**
     *资源详情
     * @param req DescribeDiscoveredResourceRequest
     * @return DescribeDiscoveredResourceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDiscoveredResourceResponse DescribeDiscoveredResource(DescribeDiscoveredResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDiscoveredResource", DescribeDiscoveredResourceResponse.class);
    }

    /**
     *获取系统合规包详情
     * @param req DescribeSystemCompliancePackRequest
     * @return DescribeSystemCompliancePackResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSystemCompliancePackResponse DescribeSystemCompliancePack(DescribeSystemCompliancePackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSystemCompliancePack", DescribeSystemCompliancePackResponse.class);
    }

    /**
     *预设规则详情
     * @param req DescribeSystemRuleRequest
     * @return DescribeSystemRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSystemRuleResponse DescribeSystemRule(DescribeSystemRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSystemRule", DescribeSystemRuleResponse.class);
    }

    /**
     *账号组合规包移除规则
     * @param req DetachAggregateConfigRuleToCompliancePackRequest
     * @return DetachAggregateConfigRuleToCompliancePackResponse
     * @throws TencentCloudSDKException
     */
    public DetachAggregateConfigRuleToCompliancePackResponse DetachAggregateConfigRuleToCompliancePack(DetachAggregateConfigRuleToCompliancePackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DetachAggregateConfigRuleToCompliancePack", DetachAggregateConfigRuleToCompliancePackResponse.class);
    }

    /**
     *合规包移除规则
     * @param req DetachConfigRuleToCompliancePackRequest
     * @return DetachConfigRuleToCompliancePackResponse
     * @throws TencentCloudSDKException
     */
    public DetachConfigRuleToCompliancePackResponse DetachConfigRuleToCompliancePack(DetachConfigRuleToCompliancePackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DetachConfigRuleToCompliancePack", DetachConfigRuleToCompliancePackResponse.class);
    }

    /**
     *账号组获取合规包列表
     * @param req ListAggregateCompliancePacksRequest
     * @return ListAggregateCompliancePacksResponse
     * @throws TencentCloudSDKException
     */
    public ListAggregateCompliancePacksResponse ListAggregateCompliancePacks(ListAggregateCompliancePacksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAggregateCompliancePacks", ListAggregateCompliancePacksResponse.class);
    }

    /**
     *账号组获取评估结果--规则维度（某个规则下资源的评估结果列表）
     * @param req ListAggregateConfigRuleEvaluationResultsRequest
     * @return ListAggregateConfigRuleEvaluationResultsResponse
     * @throws TencentCloudSDKException
     */
    public ListAggregateConfigRuleEvaluationResultsResponse ListAggregateConfigRuleEvaluationResults(ListAggregateConfigRuleEvaluationResultsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAggregateConfigRuleEvaluationResults", ListAggregateConfigRuleEvaluationResultsResponse.class);
    }

    /**
     *账号组获取规则列表
     * @param req ListAggregateConfigRulesRequest
     * @return ListAggregateConfigRulesResponse
     * @throws TencentCloudSDKException
     */
    public ListAggregateConfigRulesResponse ListAggregateConfigRules(ListAggregateConfigRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAggregateConfigRules", ListAggregateConfigRulesResponse.class);
    }

    /**
     *账号组获取资源列表
     * @param req ListAggregateDiscoveredResourcesRequest
     * @return ListAggregateDiscoveredResourcesResponse
     * @throws TencentCloudSDKException
     */
    public ListAggregateDiscoveredResourcesResponse ListAggregateDiscoveredResources(ListAggregateDiscoveredResourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAggregateDiscoveredResources", ListAggregateDiscoveredResourcesResponse.class);
    }

    /**
     *账号组列表
     * @param req ListAggregatorsRequest
     * @return ListAggregatorsResponse
     * @throws TencentCloudSDKException
     */
    public ListAggregatorsResponse ListAggregators(ListAggregatorsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAggregators", ListAggregatorsResponse.class);
    }

    /**
     *告警规则列表
     * @param req ListAlarmPolicyRequest
     * @return ListAlarmPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ListAlarmPolicyResponse ListAlarmPolicy(ListAlarmPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAlarmPolicy", ListAlarmPolicyResponse.class);
    }

    /**
     *获取合规包列表
     * @param req ListCompliancePacksRequest
     * @return ListCompliancePacksResponse
     * @throws TencentCloudSDKException
     */
    public ListCompliancePacksResponse ListCompliancePacks(ListCompliancePacksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListCompliancePacks", ListCompliancePacksResponse.class);
    }

    /**
     * 获取评估结果--规则维度（某个规则下资源的评估结果列表）
     * @param req ListConfigRuleEvaluationResultsRequest
     * @return ListConfigRuleEvaluationResultsResponse
     * @throws TencentCloudSDKException
     */
    public ListConfigRuleEvaluationResultsResponse ListConfigRuleEvaluationResults(ListConfigRuleEvaluationResultsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListConfigRuleEvaluationResults", ListConfigRuleEvaluationResultsResponse.class);
    }

    /**
     *获取规则列表
     * @param req ListConfigRulesRequest
     * @return ListConfigRulesResponse
     * @throws TencentCloudSDKException
     */
    public ListConfigRulesResponse ListConfigRules(ListConfigRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListConfigRules", ListConfigRulesResponse.class);
    }

    /**
     *获取资源列表
     * @param req ListDiscoveredResourcesRequest
     * @return ListDiscoveredResourcesResponse
     * @throws TencentCloudSDKException
     */
    public ListDiscoveredResourcesResponse ListDiscoveredResources(ListDiscoveredResourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListDiscoveredResources", ListDiscoveredResourcesResponse.class);
    }

    /**
     *修正记录
     * @param req ListRemediationExecutionsRequest
     * @return ListRemediationExecutionsResponse
     * @throws TencentCloudSDKException
     */
    public ListRemediationExecutionsResponse ListRemediationExecutions(ListRemediationExecutionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListRemediationExecutions", ListRemediationExecutionsResponse.class);
    }

    /**
     *修正设置列表
     * @param req ListRemediationsRequest
     * @return ListRemediationsResponse
     * @throws TencentCloudSDKException
     */
    public ListRemediationsResponse ListRemediations(ListRemediationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListRemediations", ListRemediationsResponse.class);
    }

    /**
     *获取资源类型列表
     * @param req ListResourceTypesRequest
     * @return ListResourceTypesResponse
     * @throws TencentCloudSDKException
     */
    public ListResourceTypesResponse ListResourceTypes(ListResourceTypesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListResourceTypes", ListResourceTypesResponse.class);
    }

    /**
     *获取系统合规包列表
     * @param req ListSystemCompliancePacksRequest
     * @return ListSystemCompliancePacksResponse
     * @throws TencentCloudSDKException
     */
    public ListSystemCompliancePacksResponse ListSystemCompliancePacks(ListSystemCompliancePacksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListSystemCompliancePacks", ListSystemCompliancePacksResponse.class);
    }

    /**
     *获取预设规则列表
     * @param req ListSystemRulesRequest
     * @return ListSystemRulesResponse
     * @throws TencentCloudSDKException
     */
    public ListSystemRulesResponse ListSystemRules(ListSystemRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListSystemRules", ListSystemRulesResponse.class);
    }

    /**
     *账号组开启规则
     * @param req OpenAggregateConfigRuleRequest
     * @return OpenAggregateConfigRuleResponse
     * @throws TencentCloudSDKException
     */
    public OpenAggregateConfigRuleResponse OpenAggregateConfigRule(OpenAggregateConfigRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenAggregateConfigRule", OpenAggregateConfigRuleResponse.class);
    }

    /**
     *资源监控管理-开启监控
     * @param req OpenConfigRecorderRequest
     * @return OpenConfigRecorderResponse
     * @throws TencentCloudSDKException
     */
    public OpenConfigRecorderResponse OpenConfigRecorder(OpenConfigRecorderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenConfigRecorder", OpenConfigRecorderResponse.class);
    }

    /**
     *开启规则
     * @param req OpenConfigRuleRequest
     * @return OpenConfigRuleResponse
     * @throws TencentCloudSDKException
     */
    public OpenConfigRuleResponse OpenConfigRule(OpenConfigRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenConfigRule", OpenConfigRuleResponse.class);
    }

    /**
     *上报自定义规则评估结果
     * @param req PutEvaluationsRequest
     * @return PutEvaluationsResponse
     * @throws TencentCloudSDKException
     */
    public PutEvaluationsResponse PutEvaluations(PutEvaluationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PutEvaluations", PutEvaluationsResponse.class);
    }

    /**
     *账号组触发评估
     * @param req StartAggregateConfigRuleEvaluationRequest
     * @return StartAggregateConfigRuleEvaluationResponse
     * @throws TencentCloudSDKException
     */
    public StartAggregateConfigRuleEvaluationResponse StartAggregateConfigRuleEvaluation(StartAggregateConfigRuleEvaluationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartAggregateConfigRuleEvaluation", StartAggregateConfigRuleEvaluationResponse.class);
    }

    /**
     *触发评估
     * @param req StartConfigRuleEvaluationRequest
     * @return StartConfigRuleEvaluationResponse
     * @throws TencentCloudSDKException
     */
    public StartConfigRuleEvaluationResponse StartConfigRuleEvaluation(StartConfigRuleEvaluationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartConfigRuleEvaluation", StartConfigRuleEvaluationResponse.class);
    }

    /**
     *手动执行规则修复
     * @param req StartRemediationRequest
     * @return StartRemediationResponse
     * @throws TencentCloudSDKException
     */
    public StartRemediationResponse StartRemediation(StartRemediationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartRemediation", StartRemediationResponse.class);
    }

    /**
     *账号组编辑合规包
     * @param req UpdateAggregateCompliancePackRequest
     * @return UpdateAggregateCompliancePackResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAggregateCompliancePackResponse UpdateAggregateCompliancePack(UpdateAggregateCompliancePackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAggregateCompliancePack", UpdateAggregateCompliancePackResponse.class);
    }

    /**
     *账号组开启、关闭合规包
     * @param req UpdateAggregateCompliancePackStatusRequest
     * @return UpdateAggregateCompliancePackStatusResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAggregateCompliancePackStatusResponse UpdateAggregateCompliancePackStatus(UpdateAggregateCompliancePackStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAggregateCompliancePackStatus", UpdateAggregateCompliancePackStatusResponse.class);
    }

    /**
     *账号组编辑投递设置
     * @param req UpdateAggregateConfigDeliverRequest
     * @return UpdateAggregateConfigDeliverResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAggregateConfigDeliverResponse UpdateAggregateConfigDeliver(UpdateAggregateConfigDeliverRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAggregateConfigDeliver", UpdateAggregateConfigDeliverResponse.class);
    }

    /**
     *账号组编辑规则
     * @param req UpdateAggregateConfigRuleRequest
     * @return UpdateAggregateConfigRuleResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAggregateConfigRuleResponse UpdateAggregateConfigRule(UpdateAggregateConfigRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAggregateConfigRule", UpdateAggregateConfigRuleResponse.class);
    }

    /**
     *更新告警规则
     * @param req UpdateAlarmPolicyRequest
     * @return UpdateAlarmPolicyResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAlarmPolicyResponse UpdateAlarmPolicy(UpdateAlarmPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAlarmPolicy", UpdateAlarmPolicyResponse.class);
    }

    /**
     *编辑合规包
     * @param req UpdateCompliancePackRequest
     * @return UpdateCompliancePackResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCompliancePackResponse UpdateCompliancePack(UpdateCompliancePackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateCompliancePack", UpdateCompliancePackResponse.class);
    }

    /**
     *开启、关闭合规包
     * @param req UpdateCompliancePackStatusRequest
     * @return UpdateCompliancePackStatusResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCompliancePackStatusResponse UpdateCompliancePackStatus(UpdateCompliancePackStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateCompliancePackStatus", UpdateCompliancePackStatusResponse.class);
    }

    /**
     *编辑投递设置
     * @param req UpdateConfigDeliverRequest
     * @return UpdateConfigDeliverResponse
     * @throws TencentCloudSDKException
     */
    public UpdateConfigDeliverResponse UpdateConfigDeliver(UpdateConfigDeliverRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateConfigDeliver", UpdateConfigDeliverResponse.class);
    }

    /**
     *编辑监控范围
     * @param req UpdateConfigRecorderRequest
     * @return UpdateConfigRecorderResponse
     * @throws TencentCloudSDKException
     */
    public UpdateConfigRecorderResponse UpdateConfigRecorder(UpdateConfigRecorderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateConfigRecorder", UpdateConfigRecorderResponse.class);
    }

    /**
     *编辑规则
     * @param req UpdateConfigRuleRequest
     * @return UpdateConfigRuleResponse
     * @throws TencentCloudSDKException
     */
    public UpdateConfigRuleResponse UpdateConfigRule(UpdateConfigRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateConfigRule", UpdateConfigRuleResponse.class);
    }

    /**
     *新增告警监控规则
     * @param req UpdateRemediationRequest
     * @return UpdateRemediationResponse
     * @throws TencentCloudSDKException
     */
    public UpdateRemediationResponse UpdateRemediation(UpdateRemediationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateRemediation", UpdateRemediationResponse.class);
    }

}
