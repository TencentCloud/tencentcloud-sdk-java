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
package com.tencentcloudapi.billing.v20180709;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.billing.v20180709.models.*;

public class BillingClient extends AbstractClient{
    private static String endpoint = "billing.tencentcloudapi.com";
    private static String service = "billing";
    private static String version = "2018-07-09";

    public BillingClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public BillingClient(Credential credential, String region, ClientProfile profile) {
        super(BillingClient.endpoint, BillingClient.version, credential, region, profile);
    }

    /**
     *创建公摊规则
     * @param req CreateAllocationRuleRequest
     * @return CreateAllocationRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateAllocationRuleResponse CreateAllocationRule(CreateAllocationRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAllocationRule", CreateAllocationRuleResponse.class);
    }

    /**
     *批量设置分账标签
     * @param req CreateAllocationTagRequest
     * @return CreateAllocationTagResponse
     * @throws TencentCloudSDKException
     */
    public CreateAllocationTagResponse CreateAllocationTag(CreateAllocationTagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAllocationTag", CreateAllocationTagResponse.class);
    }

    /**
     *创建分账单元
     * @param req CreateAllocationUnitRequest
     * @return CreateAllocationUnitResponse
     * @throws TencentCloudSDKException
     */
    public CreateAllocationUnitResponse CreateAllocationUnit(CreateAllocationUnitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAllocationUnit", CreateAllocationUnitResponse.class);
    }

    /**
     *创建预算信息
     * @param req CreateBudgetRequest
     * @return CreateBudgetResponse
     * @throws TencentCloudSDKException
     */
    public CreateBudgetResponse CreateBudget(CreateBudgetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBudget", CreateBudgetResponse.class);
    }

    /**
     *创建归集规则
     * @param req CreateGatherRuleRequest
     * @return CreateGatherRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateGatherRuleResponse CreateGatherRule(CreateGatherRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateGatherRule", CreateGatherRuleResponse.class);
    }

    /**
     *创建一个实例资源，会创建一个新购实例资源的订单，并通过腾讯云账户余额自动支付。调用该接口的账号需要授予finace:trade的权限，否则无法支付成功。目前已接入并支持购买的产品包括：T-Sec-Web应用防火墙、云防火墙、主机安全、主机容器、云安全中心、T-Sec-密钥管理系统。
     * @param req CreateInstanceRequest
     * @return CreateInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstanceResponse CreateInstance(CreateInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInstance", CreateInstanceResponse.class);
    }

    /**
     *公摊规则删除接口
     * @param req DeleteAllocationRuleRequest
     * @return DeleteAllocationRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAllocationRuleResponse DeleteAllocationRule(DeleteAllocationRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAllocationRule", DeleteAllocationRuleResponse.class);
    }

    /**
     *批量取消设置分账标签
     * @param req DeleteAllocationTagRequest
     * @return DeleteAllocationTagResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAllocationTagResponse DeleteAllocationTag(DeleteAllocationTagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAllocationTag", DeleteAllocationTagResponse.class);
    }

    /**
     *删除分账单元
     * @param req DeleteAllocationUnitRequest
     * @return DeleteAllocationUnitResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAllocationUnitResponse DeleteAllocationUnit(DeleteAllocationUnitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAllocationUnit", DeleteAllocationUnitResponse.class);
    }

    /**
     *依据预算ID删除对应预算项目
     * @param req DeleteBudgetRequest
     * @return DeleteBudgetResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBudgetResponse DeleteBudget(DeleteBudgetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBudget", DeleteBudgetResponse.class);
    }

    /**
     *删除归集规则
     * @param req DeleteGatherRuleRequest
     * @return DeleteGatherRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGatherRuleResponse DeleteGatherRule(DeleteGatherRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteGatherRule", DeleteGatherRuleResponse.class);
    }

    /**
     *获取云账户余额信息。
     * @param req DescribeAccountBalanceRequest
     * @return DescribeAccountBalanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountBalanceResponse DescribeAccountBalance(DescribeAccountBalanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccountBalance", DescribeAccountBalanceResponse.class);
    }

    /**
     *查询资源目录筛选条件
     * @param req DescribeAllocateConditionsRequest
     * @return DescribeAllocateConditionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAllocateConditionsResponse DescribeAllocateConditions(DescribeAllocateConditionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAllocateConditions", DescribeAllocateConditionsResponse.class);
    }

    /**
     *查询分账账单筛选条件
     * @param req DescribeAllocationBillConditionsRequest
     * @return DescribeAllocationBillConditionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAllocationBillConditionsResponse DescribeAllocationBillConditions(DescribeAllocationBillConditionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAllocationBillConditions", DescribeAllocationBillConditionsResponse.class);
    }

    /**
     *查询分账账单明细
     * @param req DescribeAllocationBillDetailRequest
     * @return DescribeAllocationBillDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAllocationBillDetailResponse DescribeAllocationBillDetail(DescribeAllocationBillDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAllocationBillDetail", DescribeAllocationBillDetailResponse.class);
    }

    /**
     *查询分账账单月概览
     * @param req DescribeAllocationMonthOverviewRequest
     * @return DescribeAllocationMonthOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAllocationMonthOverviewResponse DescribeAllocationMonthOverview(DescribeAllocationMonthOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAllocationMonthOverview", DescribeAllocationMonthOverviewResponse.class);
    }

    /**
     *查询分账账单日概览
     * @param req DescribeAllocationOverviewRequest
     * @return DescribeAllocationOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAllocationOverviewResponse DescribeAllocationOverview(DescribeAllocationOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAllocationOverview", DescribeAllocationOverviewResponse.class);
    }

    /**
     *查询公摊规则详情
     * @param req DescribeAllocationRuleDetailRequest
     * @return DescribeAllocationRuleDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAllocationRuleDetailResponse DescribeAllocationRuleDetail(DescribeAllocationRuleDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAllocationRuleDetail", DescribeAllocationRuleDetailResponse.class);
    }

    /**
     *查询所有公摊规则概览
     * @param req DescribeAllocationRuleSummaryRequest
     * @return DescribeAllocationRuleSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAllocationRuleSummaryResponse DescribeAllocationRuleSummary(DescribeAllocationRuleSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAllocationRuleSummary", DescribeAllocationRuleSummaryResponse.class);
    }

    /**
     *查询分账账单按产品汇总
     * @param req DescribeAllocationSummaryByBusinessRequest
     * @return DescribeAllocationSummaryByBusinessResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAllocationSummaryByBusinessResponse DescribeAllocationSummaryByBusiness(DescribeAllocationSummaryByBusinessRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAllocationSummaryByBusiness", DescribeAllocationSummaryByBusinessResponse.class);
    }

    /**
     *查询分账账单按组件汇总
     * @param req DescribeAllocationSummaryByItemRequest
     * @return DescribeAllocationSummaryByItemResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAllocationSummaryByItemResponse DescribeAllocationSummaryByItem(DescribeAllocationSummaryByItemRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAllocationSummaryByItem", DescribeAllocationSummaryByItemResponse.class);
    }

    /**
     *查询分账账单按资源汇总
     * @param req DescribeAllocationSummaryByResourceRequest
     * @return DescribeAllocationSummaryByResourceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAllocationSummaryByResourceResponse DescribeAllocationSummaryByResource(DescribeAllocationSummaryByResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAllocationSummaryByResource", DescribeAllocationSummaryByResourceResponse.class);
    }

    /**
     *查询分账目录树
     * @param req DescribeAllocationTreeRequest
     * @return DescribeAllocationTreeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAllocationTreeResponse DescribeAllocationTree(DescribeAllocationTreeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAllocationTree", DescribeAllocationTreeResponse.class);
    }

    /**
     *查询分账账单费用趋势
     * @param req DescribeAllocationTrendByMonthRequest
     * @return DescribeAllocationTrendByMonthResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAllocationTrendByMonthResponse DescribeAllocationTrendByMonth(DescribeAllocationTrendByMonthRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAllocationTrendByMonth", DescribeAllocationTrendByMonthResponse.class);
    }

    /**
     *查询分账单元详情
     * @param req DescribeAllocationUnitDetailRequest
     * @return DescribeAllocationUnitDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAllocationUnitDetailResponse DescribeAllocationUnitDetail(DescribeAllocationUnitDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAllocationUnitDetail", DescribeAllocationUnitDetailResponse.class);
    }

    /**
     *可以通过API获取当前UIN是否有调账，客户可以更快地主动地获取调账情况。
     * @param req DescribeBillAdjustInfoRequest
     * @return DescribeBillAdjustInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillAdjustInfoResponse DescribeBillAdjustInfo(DescribeBillAdjustInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillAdjustInfo", DescribeBillAdjustInfoResponse.class);
    }

    /**
     *获取账单明细数据。
注意事项：
1.在请求接口时，由于网络不稳定或其它异常，可能会导致请求失败。如果您遇到这种情况，我们建议您在接口请求失败时，手动发起重试操作，这样可以更好地确保您的接口请求能够成功执行。
2.对于账单明细数据量级很大（例如每月账单明细量级超过20w）的客户，通过 API 调用账单数据效率较低，建议您开通账单数据存储功能，通过存储桶中获取账单文件进行分析。[账单存储至COS桶](https://cloud.tencent.com/document/product/555/61275)
     * @param req DescribeBillDetailRequest
     * @return DescribeBillDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillDetailResponse DescribeBillDetail(DescribeBillDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillDetail", DescribeBillDetailResponse.class);
    }

    /**
     *成员账号获取管理账号代付账单（费用明细）。
注意事项：在请求接口时，由于网络不稳定或其它异常，可能会导致请求失败。如果您遇到这种情况，我们建议您在接口请求失败时，手动发起重试操作，这样可以更好地确保您的接口请求能够成功执行。
     * @param req DescribeBillDetailForOrganizationRequest
     * @return DescribeBillDetailForOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillDetailForOrganizationResponse DescribeBillDetailForOrganization(DescribeBillDetailForOrganizationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillDetailForOrganization", DescribeBillDetailForOrganizationResponse.class);
    }

    /**
     *该接口支持通过传参，获取L0-PDF、L1-汇总、L2-资源、L3-明细、账单包、五类账单文件下载链接
     * @param req DescribeBillDownloadUrlRequest
     * @return DescribeBillDownloadUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillDownloadUrlResponse DescribeBillDownloadUrl(DescribeBillDownloadUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillDownloadUrl", DescribeBillDownloadUrlResponse.class);
    }

    /**
     *获取收支明细列表，支持翻页和参数过滤
     * @param req DescribeBillListRequest
     * @return DescribeBillListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillListResponse DescribeBillList(DescribeBillListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillList", DescribeBillListResponse.class);
    }

    /**
     *获取账单资源汇总数据
     * @param req DescribeBillResourceSummaryRequest
     * @return DescribeBillResourceSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillResourceSummaryResponse DescribeBillResourceSummary(DescribeBillResourceSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillResourceSummary", DescribeBillResourceSummaryResponse.class);
    }

    /**
     *成员账号获取管理账号代付账单（按资源汇总）
     * @param req DescribeBillResourceSummaryForOrganizationRequest
     * @return DescribeBillResourceSummaryForOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillResourceSummaryForOrganizationResponse DescribeBillResourceSummaryForOrganization(DescribeBillResourceSummaryForOrganizationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillResourceSummaryForOrganization", DescribeBillResourceSummaryForOrganizationResponse.class);
    }

    /**
     *该接口支持通过传参，按照产品、项目、地域、计费模式和标签五个维度获取账单费用明细。
     * @param req DescribeBillSummaryRequest
     * @return DescribeBillSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillSummaryResponse DescribeBillSummary(DescribeBillSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillSummary", DescribeBillSummaryResponse.class);
    }

    /**
     *获取按计费模式汇总费用分布
     * @param req DescribeBillSummaryByPayModeRequest
     * @return DescribeBillSummaryByPayModeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillSummaryByPayModeResponse DescribeBillSummaryByPayMode(DescribeBillSummaryByPayModeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillSummaryByPayMode", DescribeBillSummaryByPayModeResponse.class);
    }

    /**
     *获取产品汇总费用分布
     * @param req DescribeBillSummaryByProductRequest
     * @return DescribeBillSummaryByProductResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillSummaryByProductResponse DescribeBillSummaryByProduct(DescribeBillSummaryByProductRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillSummaryByProduct", DescribeBillSummaryByProductResponse.class);
    }

    /**
     *获取按项目汇总费用分布
     * @param req DescribeBillSummaryByProjectRequest
     * @return DescribeBillSummaryByProjectResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillSummaryByProjectResponse DescribeBillSummaryByProject(DescribeBillSummaryByProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillSummaryByProject", DescribeBillSummaryByProjectResponse.class);
    }

    /**
     *获取按地域汇总费用分布
     * @param req DescribeBillSummaryByRegionRequest
     * @return DescribeBillSummaryByRegionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillSummaryByRegionResponse DescribeBillSummaryByRegion(DescribeBillSummaryByRegionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillSummaryByRegion", DescribeBillSummaryByRegionResponse.class);
    }

    /**
     *获取按标签汇总费用分布
     * @param req DescribeBillSummaryByTagRequest
     * @return DescribeBillSummaryByTagResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillSummaryByTagResponse DescribeBillSummaryByTag(DescribeBillSummaryByTagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillSummaryByTag", DescribeBillSummaryByTagResponse.class);
    }

    /**
     *该接口支持通过传参，按照产品、项目、地域、计费模式和标签五个维度获取账单费用明细。
     * @param req DescribeBillSummaryForOrganizationRequest
     * @return DescribeBillSummaryForOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillSummaryForOrganizationResponse DescribeBillSummaryForOrganization(DescribeBillSummaryForOrganizationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillSummaryForOrganization", DescribeBillSummaryForOrganizationResponse.class);
    }

    /**
     *获取预算详细信息
     * @param req DescribeBudgetRequest
     * @return DescribeBudgetResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBudgetResponse DescribeBudget(DescribeBudgetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBudget", DescribeBudgetResponse.class);
    }

    /**
     *查询预算修改记录
     * @param req DescribeBudgetOperationLogRequest
     * @return DescribeBudgetOperationLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBudgetOperationLogResponse DescribeBudgetOperationLog(DescribeBudgetOperationLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBudgetOperationLog", DescribeBudgetOperationLogResponse.class);
    }

    /**
     *返回预算提醒记录，包括预算周期、检测时间、提醒时间、提醒类型、提醒内容
     * @param req DescribeBudgetRemindRecordListRequest
     * @return DescribeBudgetRemindRecordListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBudgetRemindRecordListResponse DescribeBudgetRemindRecordList(DescribeBudgetRemindRecordListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBudgetRemindRecordList", DescribeBudgetRemindRecordListResponse.class);
    }

    /**
     *查询消耗明细

注意事项：
1. 对于消耗明细数据量级很大（例如每月消耗明细量级超过100w）的客户，通过 API 调用明细数据会有超时风险，建议您开通消耗账单数据存储功能，通过存储桶中获取账单文件进行分析。[账单存储至COS桶](https://cloud.tencent.com/document/product/555/61275)
     * @param req DescribeCostDetailRequest
     * @return DescribeCostDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCostDetailResponse DescribeCostDetail(DescribeCostDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCostDetail", DescribeCostDetailResponse.class);
    }

    /**
     *查看成本分析明细
     * @param req DescribeCostExplorerSummaryRequest
     * @return DescribeCostExplorerSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCostExplorerSummaryResponse DescribeCostExplorerSummary(DescribeCostExplorerSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCostExplorerSummary", DescribeCostExplorerSummaryResponse.class);
    }

    /**
     *获取按产品汇总消耗详情
     * @param req DescribeCostSummaryByProductRequest
     * @return DescribeCostSummaryByProductResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCostSummaryByProductResponse DescribeCostSummaryByProduct(DescribeCostSummaryByProductRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCostSummaryByProduct", DescribeCostSummaryByProductResponse.class);
    }

    /**
     *获取按项目汇总消耗详情
     * @param req DescribeCostSummaryByProjectRequest
     * @return DescribeCostSummaryByProjectResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCostSummaryByProjectResponse DescribeCostSummaryByProject(DescribeCostSummaryByProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCostSummaryByProject", DescribeCostSummaryByProjectResponse.class);
    }

    /**
     *获取按地域汇总消耗详情
     * @param req DescribeCostSummaryByRegionRequest
     * @return DescribeCostSummaryByRegionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCostSummaryByRegionResponse DescribeCostSummaryByRegion(DescribeCostSummaryByRegionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCostSummaryByRegion", DescribeCostSummaryByRegionResponse.class);
    }

    /**
     *获取按资源汇总消耗详情
     * @param req DescribeCostSummaryByResourceRequest
     * @return DescribeCostSummaryByResourceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCostSummaryByResourceResponse DescribeCostSummaryByResource(DescribeCostSummaryByResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCostSummaryByResource", DescribeCostSummaryByResourceResponse.class);
    }

    /**
     *获取按标签汇总消耗详情
     * @param req DescribeCostSummaryByTagRequest
     * @return DescribeCostSummaryByTagResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCostSummaryByTagResponse DescribeCostSummaryByTag(DescribeCostSummaryByTagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCostSummaryByTag", DescribeCostSummaryByTagResponse.class);
    }

    /**
     *查询订单
     * @param req DescribeDealsByCondRequest
     * @return DescribeDealsByCondResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDealsByCondResponse DescribeDealsByCond(DescribeDealsByCondRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDealsByCond", DescribeDealsByCondResponse.class);
    }

    /**
     *获取COS产品用量明细
     * @param req DescribeDosageCosDetailByDateRequest
     * @return DescribeDosageCosDetailByDateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDosageCosDetailByDateResponse DescribeDosageCosDetailByDate(DescribeDosageCosDetailByDateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDosageCosDetailByDate", DescribeDosageCosDetailByDateResponse.class);
    }

    /**
     *按日期获取产品用量明细
     * @param req DescribeDosageDetailByDateRequest
     * @return DescribeDosageDetailByDateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDosageDetailByDateResponse DescribeDosageDetailByDate(DescribeDosageDetailByDateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDosageDetailByDate", DescribeDosageDetailByDateResponse.class);
    }

    /**
     *获取已接入标准用量明细模板产品的用量明细数据，目前已接入并支持查询的产品包括：云联络中心、实时音视频、实时音视频、智能媒资托管、CODING DevOps、全球IP应用加速
     * @param req DescribeDosageDetailListRequest
     * @return DescribeDosageDetailListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDosageDetailListResponse DescribeDosageDetailList(DescribeDosageDetailListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDosageDetailList", DescribeDosageDetailListResponse.class);
    }

    /**
     *查询分账账单资源归集汇总
     * @param req DescribeGatherResourceRequest
     * @return DescribeGatherResourceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGatherResourceResponse DescribeGatherResource(DescribeGatherResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGatherResource", DescribeGatherResourceResponse.class);
    }

    /**
     *查询归集规则详情
     * @param req DescribeGatherRuleDetailRequest
     * @return DescribeGatherRuleDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGatherRuleDetailResponse DescribeGatherRuleDetail(DescribeGatherRuleDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGatherRuleDetail", DescribeGatherRuleDetailResponse.class);
    }

    /**
     *注意事项：
1、本接口支持查询已接入续费管理页的包年包月实例，包括运行中、已隔离（部分产品不支持）
2、子用户使用该接口时，应具备QcloudFinanceRenewManageFullAccess权限策略。
     * @param req DescribeRenewInstancesRequest
     * @return DescribeRenewInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRenewInstancesResponse DescribeRenewInstances(DescribeRenewInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRenewInstances", DescribeRenewInstancesResponse.class);
    }

    /**
     *查询节省计划详情
     * @param req DescribeSavingPlanResourceInfoRequest
     * @return DescribeSavingPlanResourceInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSavingPlanResourceInfoResponse DescribeSavingPlanResourceInfo(DescribeSavingPlanResourceInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSavingPlanResourceInfo", DescribeSavingPlanResourceInfoResponse.class);
    }

    /**
     *获取分账标签
     * @param req DescribeTagListRequest
     * @return DescribeTagListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTagListResponse DescribeTagList(DescribeTagListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTagList", DescribeTagListResponse.class);
    }

    /**
     *获取代金券相关信息
     * @param req DescribeVoucherInfoRequest
     * @return DescribeVoucherInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVoucherInfoResponse DescribeVoucherInfo(DescribeVoucherInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVoucherInfo", DescribeVoucherInfoResponse.class);
    }

    /**
     *获取代金券使用记录
     * @param req DescribeVoucherUsageDetailsRequest
     * @return DescribeVoucherUsageDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVoucherUsageDetailsResponse DescribeVoucherUsageDetails(DescribeVoucherUsageDetailsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVoucherUsageDetails", DescribeVoucherUsageDetailsResponse.class);
    }

    /**
     *编辑公摊规则
     * @param req ModifyAllocationRuleRequest
     * @return ModifyAllocationRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAllocationRuleResponse ModifyAllocationRule(ModifyAllocationRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAllocationRule", ModifyAllocationRuleResponse.class);
    }

    /**
     *修改分账单元信息
     * @param req ModifyAllocationUnitRequest
     * @return ModifyAllocationUnitResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAllocationUnitResponse ModifyAllocationUnit(ModifyAllocationUnitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAllocationUnit", ModifyAllocationUnitResponse.class);
    }

    /**
     *更新预算信息
     * @param req ModifyBudgetRequest
     * @return ModifyBudgetResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBudgetResponse ModifyBudget(ModifyBudgetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBudget", ModifyBudgetResponse.class);
    }

    /**
     *编辑归集规则
     * @param req ModifyGatherRuleRequest
     * @return ModifyGatherRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGatherRuleResponse ModifyGatherRule(ModifyGatherRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyGatherRule", ModifyGatherRuleResponse.class);
    }

    /**
     *支付订单
     * @param req PayDealsRequest
     * @return PayDealsResponse
     * @throws TencentCloudSDKException
     */
    public PayDealsResponse PayDeals(PayDealsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PayDeals", PayDealsResponse.class);
    }

    /**
     *退订不再需要的实例，只退还实付金额的部分，已使用的代金券不退还，退还的实付金额默认退到腾讯云账户余额中。调用该接口的账号需要授予finace:RefundInstance的权限，否则无法支付成功。目前已接入并支持退订的产品包括：T-Sec-Web应用防火墙、云防火墙、主机安全、主机容器、云安全中心、T-Sec-密钥管理系统。
     * @param req RefundInstanceRequest
     * @return RefundInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RefundInstanceResponse RefundInstance(RefundInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RefundInstance", RefundInstanceResponse.class);
    }

    /**
     *续费一台实例，调用该接口续费服务器时，您需要确保您的腾讯云账户余额充足，否则会续费失败。调用该接口的账号需要授予finace:trade的权限，否则无法续费成功。目前已接入并支持续费的产品包括：T-Sec-Web应用防火墙、云防火墙、主机安全、主机容器、云安全中心、T-Sec-密钥管理系统。
     * @param req RenewInstanceRequest
     * @return RenewInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RenewInstanceResponse RenewInstance(RenewInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenewInstance", RenewInstanceResponse.class);
    }

}
