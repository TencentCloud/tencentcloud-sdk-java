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
     *创建节省计划订单，创建订单完成需调用PayDeals接口完成订单支付
     * @param req CreateSavingPlanOrderRequest
     * @return CreateSavingPlanOrderResponse
     * @throws TencentCloudSDKException
     */
    public CreateSavingPlanOrderResponse CreateSavingPlanOrder(CreateSavingPlanOrderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSavingPlanOrder", CreateSavingPlanOrderResponse.class);
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
     *查询当前用户节省计划覆盖率明细数据，如无特别说明，金额单位均为元（国内站）或者美元（国际站）。
     * @param req DescribeSavingPlanCoverageRequest
     * @return DescribeSavingPlanCoverageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSavingPlanCoverageResponse DescribeSavingPlanCoverage(DescribeSavingPlanCoverageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSavingPlanCoverage", DescribeSavingPlanCoverageResponse.class);
    }

    /**
     *查用当前用户明细节省计划总览查询时段内的使用情况
     * @param req DescribeSavingPlanOverviewRequest
     * @return DescribeSavingPlanOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSavingPlanOverviewResponse DescribeSavingPlanOverview(DescribeSavingPlanOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSavingPlanOverview", DescribeSavingPlanOverviewResponse.class);
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
     *查用当前用户明细节省计划查询时段内的使用情况
     * @param req DescribeSavingPlanUsageRequest
     * @return DescribeSavingPlanUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSavingPlanUsageResponse DescribeSavingPlanUsage(DescribeSavingPlanUsageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSavingPlanUsage", DescribeSavingPlanUsageResponse.class);
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
     *支付订单
     * @param req PayDealsRequest
     * @return PayDealsResponse
     * @throws TencentCloudSDKException
     */
    public PayDealsResponse PayDeals(PayDealsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PayDeals", PayDealsResponse.class);
    }

}
