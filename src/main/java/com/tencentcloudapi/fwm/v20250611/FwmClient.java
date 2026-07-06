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
package com.tencentcloudapi.fwm.v20250611;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.fwm.v20250611.models.*;

public class FwmClient extends AbstractClient{
    private static String endpoint = "fwm.tencentcloudapi.com";
    private static String service = "fwm";
    private static String version = "2025-06-11";

    public FwmClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public FwmClient(Credential credential, String region, ClientProfile profile) {
        super(FwmClient.endpoint, FwmClient.version, credential, region, profile);
    }

    /**
     *取消忽略策略风险
     * @param req CancelIgnorePolicyRiskRequest
     * @return CancelIgnorePolicyRiskResponse
     * @throws TencentCloudSDKException
     */
    public CancelIgnorePolicyRiskResponse CancelIgnorePolicyRisk(CancelIgnorePolicyRiskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelIgnorePolicyRisk", CancelIgnorePolicyRiskResponse.class);
    }

    /**
     *创建策略风险分析任务
     * @param req CreateAnalyzePolicyTaskRequest
     * @return CreateAnalyzePolicyTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateAnalyzePolicyTaskResponse CreateAnalyzePolicyTask(CreateAnalyzePolicyTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAnalyzePolicyTask", CreateAnalyzePolicyTaskResponse.class);
    }

    /**
     *向已有的互联网边界ACL规则组中添加规则。需要先创建规则组，然后通过此接口添加规则。
     * @param req CreateEdgeAclRuleRequest
     * @return CreateEdgeAclRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateEdgeAclRuleResponse CreateEdgeAclRule(CreateEdgeAclRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEdgeAclRule", CreateEdgeAclRuleResponse.class);
    }

    /**
     *创建互联网边界ACL规则组，支持同时创建多条规则。Product 必须为 cfw_edge_acl。规则支持 IP、域名、参数模板、实例、标签等多种源/目标类型。
     * @param req CreateEdgeAclRuleGroupRequest
     * @return CreateEdgeAclRuleGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateEdgeAclRuleGroupResponse CreateEdgeAclRuleGroup(CreateEdgeAclRuleGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEdgeAclRuleGroup", CreateEdgeAclRuleGroupResponse.class);
    }

    /**
     *在已有规则组中添加NAT ACL规则
     * @param req CreateNatAclRuleRequest
     * @return CreateNatAclRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateNatAclRuleResponse CreateNatAclRule(CreateNatAclRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNatAclRule", CreateNatAclRuleResponse.class);
    }

    /**
     *创建NAT ACL规则组（NAT边界防火墙规则组管理）
     * @param req CreateNatAclRuleGroupRequest
     * @return CreateNatAclRuleGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateNatAclRuleGroupResponse CreateNatAclRuleGroup(CreateNatAclRuleGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNatAclRuleGroup", CreateNatAclRuleGroupResponse.class);
    }

    /**
     *规则组编辑时添加规则（规则组管理）
     * @param req CreateSecurityGroupRuleRequest
     * @return CreateSecurityGroupRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityGroupRuleResponse CreateSecurityGroupRule(CreateSecurityGroupRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSecurityGroupRule", CreateSecurityGroupRuleResponse.class);
    }

    /**
     *创建规则组（规则组管理）
     * @param req CreateSecurityGroupRuleGroupRequest
     * @return CreateSecurityGroupRuleGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityGroupRuleGroupResponse CreateSecurityGroupRuleGroup(CreateSecurityGroupRuleGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSecurityGroupRuleGroup", CreateSecurityGroupRuleGroupResponse.class);
    }

    /**
     *创建策略
     * @param req CreateStrategyRequest
     * @return CreateStrategyResponse
     * @throws TencentCloudSDKException
     */
    public CreateStrategyResponse CreateStrategy(CreateStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateStrategy", CreateStrategyResponse.class);
    }

    /**
     *在已有规则组中添加VPC ACL规则
     * @param req CreateVpcAclRuleRequest
     * @return CreateVpcAclRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateVpcAclRuleResponse CreateVpcAclRule(CreateVpcAclRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVpcAclRule", CreateVpcAclRuleResponse.class);
    }

    /**
     *创建VPC ACL规则组（VPC间防火墙规则组管理）
     * @param req CreateVpcAclRuleGroupRequest
     * @return CreateVpcAclRuleGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateVpcAclRuleGroupResponse CreateVpcAclRuleGroup(CreateVpcAclRuleGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVpcAclRuleGroup", CreateVpcAclRuleGroupResponse.class);
    }

    /**
     *批量删除互联网边界ACL规则。支持一次删除多条规则。
     * @param req DeleteEdgeAclRuleRequest
     * @return DeleteEdgeAclRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEdgeAclRuleResponse DeleteEdgeAclRule(DeleteEdgeAclRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEdgeAclRule", DeleteEdgeAclRuleResponse.class);
    }

    /**
     *删除NAT ACL规则
     * @param req DeleteNatAclRuleRequest
     * @return DeleteNatAclRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNatAclRuleResponse DeleteNatAclRule(DeleteNatAclRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNatAclRule", DeleteNatAclRuleResponse.class);
    }

    /**
     *删除规则组
     * @param req DeleteRuleGroupRequest
     * @return DeleteRuleGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRuleGroupResponse DeleteRuleGroup(DeleteRuleGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRuleGroup", DeleteRuleGroupResponse.class);
    }

    /**
     *删除规则（规则组管理）
     * @param req DeleteSecurityGroupRuleRequest
     * @return DeleteSecurityGroupRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSecurityGroupRuleResponse DeleteSecurityGroupRule(DeleteSecurityGroupRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSecurityGroupRule", DeleteSecurityGroupRuleResponse.class);
    }

    /**
     *删除策略
     * @param req DeleteStrategyRequest
     * @return DeleteStrategyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteStrategyResponse DeleteStrategy(DeleteStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteStrategy", DeleteStrategyResponse.class);
    }

    /**
     *删除VPC ACL规则
     * @param req DeleteVpcAclRuleRequest
     * @return DeleteVpcAclRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVpcAclRuleResponse DeleteVpcAclRule(DeleteVpcAclRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteVpcAclRule", DeleteVpcAclRuleResponse.class);
    }

    /**
     *查询指定规则组下的互联网边界ACL规则列表。支持分页和多种过滤条件。
     * @param req DescribeEdgeAclRulesRequest
     * @return DescribeEdgeAclRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeAclRulesResponse DescribeEdgeAclRules(DescribeEdgeAclRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdgeAclRules", DescribeEdgeAclRulesResponse.class);
    }

    /**
     *查询NAT ACL规则列表
     * @param req DescribeNatAclRulesRequest
     * @return DescribeNatAclRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNatAclRulesResponse DescribeNatAclRules(DescribeNatAclRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNatAclRules", DescribeNatAclRulesResponse.class);
    }

    /**
     *查询集团下所有纳管成员账号列表，支持分页、排序和多条件筛选，仅管理员可调用
     * @param req DescribeOrganMembersRequest
     * @return DescribeOrganMembersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganMembersResponse DescribeOrganMembers(DescribeOrganMembersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOrganMembers", DescribeOrganMembersResponse.class);
    }

    /**
     *获取集团概览信息，包括集团名称、管理员信息、成员数量等
     * @param req DescribeOrganSummaryRequest
     * @return DescribeOrganSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganSummaryResponse DescribeOrganSummary(DescribeOrganSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOrganSummary", DescribeOrganSummaryResponse.class);
    }

    /**
     *查询账号+产品维度风险统计，按账号分组返回各产品的体检策略数、待整改风险数、整改率、最近体检时间等信息，支持按账号名称/ID搜索以及仅看待整改、仅超时未体检筛选
     * @param req DescribePolicyRiskAccountProductStatsRequest
     * @return DescribePolicyRiskAccountProductStatsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePolicyRiskAccountProductStatsResponse DescribePolicyRiskAccountProductStats(DescribePolicyRiskAccountProductStatsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePolicyRiskAccountProductStats", DescribePolicyRiskAccountProductStatsResponse.class);
    }

    /**
     *获取实时分析风险详情
     * @param req DescribeRiskAnalysisDetailsRequest
     * @return DescribeRiskAnalysisDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskAnalysisDetailsResponse DescribeRiskAnalysisDetails(DescribeRiskAnalysisDetailsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskAnalysisDetails", DescribeRiskAnalysisDetailsResponse.class);
    }

    /**
     *查询策略体检风险分类统计数据,包含各类风险的规则数量、处置状态、整改率等信息
     * @param req DescribeRiskCategoryStatsRequest
     * @return DescribeRiskCategoryStatsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskCategoryStatsResponse DescribeRiskCategoryStats(DescribeRiskCategoryStatsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskCategoryStats", DescribeRiskCategoryStatsResponse.class);
    }

    /**
     *查询用户所有规则的策略问题
     * @param req DescribeRiskListRequest
     * @return DescribeRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskListResponse DescribeRiskList(DescribeRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskList", DescribeRiskListResponse.class);
    }

    /**
     *查询规则详情（规则组管理）
     * @param req DescribeSecurityGroupRuleRequest
     * @return DescribeSecurityGroupRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityGroupRuleResponse DescribeSecurityGroupRule(DescribeSecurityGroupRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityGroupRule", DescribeSecurityGroupRuleResponse.class);
    }

    /**
     *查询规则组中规则列表接口
     * @param req DescribeSecurityGroupRulesRequest
     * @return DescribeSecurityGroupRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityGroupRulesResponse DescribeSecurityGroupRules(DescribeSecurityGroupRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityGroupRules", DescribeSecurityGroupRulesResponse.class);
    }

    /**
     *查询策略列表
     * @param req DescribeStrategiesRequest
     * @return DescribeStrategiesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStrategiesResponse DescribeStrategies(DescribeStrategiesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStrategies", DescribeStrategiesResponse.class);
    }

    /**
     *查询策略详情
     * @param req DescribeStrategyRequest
     * @return DescribeStrategyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStrategyResponse DescribeStrategy(DescribeStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStrategy", DescribeStrategyResponse.class);
    }

    /**
     *查看防火墙管理规则下发账号列表
     * @param req DescribeStrategyAccountsRequest
     * @return DescribeStrategyAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStrategyAccountsResponse DescribeStrategyAccounts(DescribeStrategyAccountsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStrategyAccounts", DescribeStrategyAccountsResponse.class);
    }

    /**
     *查询策略下发状态
     * @param req DescribeStrategyDispatchStatusRequest
     * @return DescribeStrategyDispatchStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStrategyDispatchStatusResponse DescribeStrategyDispatchStatus(DescribeStrategyDispatchStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStrategyDispatchStatus", DescribeStrategyDispatchStatusResponse.class);
    }

    /**
     *查询VPC ACL规则列表
     * @param req DescribeVpcAclRulesRequest
     * @return DescribeVpcAclRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcAclRulesResponse DescribeVpcAclRules(DescribeVpcAclRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVpcAclRules", DescribeVpcAclRulesResponse.class);
    }

    /**
     *下发策略
     * @param req DispatchStrategyRequest
     * @return DispatchStrategyResponse
     * @throws TencentCloudSDKException
     */
    public DispatchStrategyResponse DispatchStrategy(DispatchStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DispatchStrategy", DispatchStrategyResponse.class);
    }

    /**
     *忽略策略问题
     * @param req IgnorePolicyRiskRequest
     * @return IgnorePolicyRiskResponse
     * @throws TencentCloudSDKException
     */
    public IgnorePolicyRiskResponse IgnorePolicyRisk(IgnorePolicyRiskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IgnorePolicyRisk", IgnorePolicyRiskResponse.class);
    }

    /**
     *修改互联网边界ACL规则。Rule 参数中必须包含 RuleId 用于指定要修改的规则。
     * @param req ModifyEdgeAclRuleRequest
     * @return ModifyEdgeAclRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEdgeAclRuleResponse ModifyEdgeAclRule(ModifyEdgeAclRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEdgeAclRule", ModifyEdgeAclRuleResponse.class);
    }

    /**
     *批量调整互联网边界ACL规则的执行顺序。Sequences 参数必须包含所有受影响的规则序号映射关系。
     * @param req ModifyEdgeAclRuleSequenceRequest
     * @return ModifyEdgeAclRuleSequenceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEdgeAclRuleSequenceResponse ModifyEdgeAclRuleSequence(ModifyEdgeAclRuleSequenceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEdgeAclRuleSequence", ModifyEdgeAclRuleSequenceResponse.class);
    }

    /**
     *修改NAT ACL规则
     * @param req ModifyNatAclRuleRequest
     * @return ModifyNatAclRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNatAclRuleResponse ModifyNatAclRule(ModifyNatAclRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNatAclRule", ModifyNatAclRuleResponse.class);
    }

    /**
     *调整NAT ACL规则优先级顺序
     * @param req ModifyNatAclRuleSequenceRequest
     * @return ModifyNatAclRuleSequenceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNatAclRuleSequenceResponse ModifyNatAclRuleSequence(ModifyNatAclRuleSequenceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNatAclRuleSequence", ModifyNatAclRuleSequenceResponse.class);
    }

    /**
     *修改规则组信息（规则组管理）
     * @param req ModifyRuleGroupRequest
     * @return ModifyRuleGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRuleGroupResponse ModifyRuleGroup(ModifyRuleGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRuleGroup", ModifyRuleGroupResponse.class);
    }

    /**
     *修改规则（规则组管理）
     * @param req ModifySecurityGroupRuleRequest
     * @return ModifySecurityGroupRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityGroupRuleResponse ModifySecurityGroupRule(ModifySecurityGroupRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySecurityGroupRule", ModifySecurityGroupRuleResponse.class);
    }

    /**
     *修改策略信息
     * @param req ModifyStrategyRequest
     * @return ModifyStrategyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyStrategyResponse ModifyStrategy(ModifyStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyStrategy", ModifyStrategyResponse.class);
    }

    /**
     *快速排序修改策略优先级
     * @param req ModifyStrategySequenceRequest
     * @return ModifyStrategySequenceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyStrategySequenceResponse ModifyStrategySequence(ModifyStrategySequenceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyStrategySequence", ModifyStrategySequenceResponse.class);
    }

    /**
     *修改VPC ACL规则
     * @param req ModifyVpcAclRuleRequest
     * @return ModifyVpcAclRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVpcAclRuleResponse ModifyVpcAclRule(ModifyVpcAclRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyVpcAclRule", ModifyVpcAclRuleResponse.class);
    }

    /**
     *调整VPC ACL规则优先级顺序
     * @param req ModifyVpcAclRuleSequenceRequest
     * @return ModifyVpcAclRuleSequenceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVpcAclRuleSequenceResponse ModifyVpcAclRuleSequence(ModifyVpcAclRuleSequenceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyVpcAclRuleSequence", ModifyVpcAclRuleSequenceResponse.class);
    }

}
