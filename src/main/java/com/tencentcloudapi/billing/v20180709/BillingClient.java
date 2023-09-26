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
        JsonResponseModel<CreateAllocationTagResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAllocationTagResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAllocationTag");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量取消设置分账标签
     * @param req DeleteAllocationTagRequest
     * @return DeleteAllocationTagResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAllocationTagResponse DeleteAllocationTag(DeleteAllocationTagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAllocationTagResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAllocationTagResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAllocationTag");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取云账户余额信息。
     * @param req DescribeAccountBalanceRequest
     * @return DescribeAccountBalanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountBalanceResponse DescribeAccountBalance(DescribeAccountBalanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccountBalanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAccountBalanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAccountBalance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        JsonResponseModel<DescribeBillDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBillDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBillDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *成员账号获取管理账号代付账单（费用明细）。
注意事项：在请求接口时，由于网络不稳定或其它异常，可能会导致请求失败。如果您遇到这种情况，我们建议您在接口请求失败时，手动发起重试操作，这样可以更好地确保您的接口请求能够成功执行。
     * @param req DescribeBillDetailForOrganizationRequest
     * @return DescribeBillDetailForOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillDetailForOrganizationResponse DescribeBillDetailForOrganization(DescribeBillDetailForOrganizationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBillDetailForOrganizationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBillDetailForOrganizationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBillDetailForOrganization");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口支持通过传参，获取L0-PDF、L1-汇总、L2-资源、L3-明细、账单包、五类账单文件下载链接
     * @param req DescribeBillDownloadUrlRequest
     * @return DescribeBillDownloadUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillDownloadUrlResponse DescribeBillDownloadUrl(DescribeBillDownloadUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBillDownloadUrlResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBillDownloadUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBillDownloadUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取收支明细列表，支持翻页和参数过滤
     * @param req DescribeBillListRequest
     * @return DescribeBillListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillListResponse DescribeBillList(DescribeBillListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBillListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBillListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBillList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取账单资源汇总数据
     * @param req DescribeBillResourceSummaryRequest
     * @return DescribeBillResourceSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillResourceSummaryResponse DescribeBillResourceSummary(DescribeBillResourceSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBillResourceSummaryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBillResourceSummaryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBillResourceSummary");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *成员账号获取管理账号代付账单（按资源汇总）
     * @param req DescribeBillResourceSummaryForOrganizationRequest
     * @return DescribeBillResourceSummaryForOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillResourceSummaryForOrganizationResponse DescribeBillResourceSummaryForOrganization(DescribeBillResourceSummaryForOrganizationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBillResourceSummaryForOrganizationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBillResourceSummaryForOrganizationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBillResourceSummaryForOrganization");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口支持通过传参，按照产品、项目、地域、计费模式和标签五个维度获取账单费用明细。
     * @param req DescribeBillSummaryRequest
     * @return DescribeBillSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillSummaryResponse DescribeBillSummary(DescribeBillSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBillSummaryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBillSummaryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBillSummary");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取按计费模式汇总费用分布
     * @param req DescribeBillSummaryByPayModeRequest
     * @return DescribeBillSummaryByPayModeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillSummaryByPayModeResponse DescribeBillSummaryByPayMode(DescribeBillSummaryByPayModeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBillSummaryByPayModeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBillSummaryByPayModeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBillSummaryByPayMode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取产品汇总费用分布
     * @param req DescribeBillSummaryByProductRequest
     * @return DescribeBillSummaryByProductResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillSummaryByProductResponse DescribeBillSummaryByProduct(DescribeBillSummaryByProductRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBillSummaryByProductResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBillSummaryByProductResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBillSummaryByProduct");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取按项目汇总费用分布
     * @param req DescribeBillSummaryByProjectRequest
     * @return DescribeBillSummaryByProjectResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillSummaryByProjectResponse DescribeBillSummaryByProject(DescribeBillSummaryByProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBillSummaryByProjectResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBillSummaryByProjectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBillSummaryByProject");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取按地域汇总费用分布
     * @param req DescribeBillSummaryByRegionRequest
     * @return DescribeBillSummaryByRegionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillSummaryByRegionResponse DescribeBillSummaryByRegion(DescribeBillSummaryByRegionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBillSummaryByRegionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBillSummaryByRegionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBillSummaryByRegion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取按标签汇总费用分布
     * @param req DescribeBillSummaryByTagRequest
     * @return DescribeBillSummaryByTagResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillSummaryByTagResponse DescribeBillSummaryByTag(DescribeBillSummaryByTagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBillSummaryByTagResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBillSummaryByTagResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBillSummaryByTag");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口支持通过传参，按照产品、项目、地域、计费模式和标签五个维度获取账单费用明细。
     * @param req DescribeBillSummaryForOrganizationRequest
     * @return DescribeBillSummaryForOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillSummaryForOrganizationResponse DescribeBillSummaryForOrganization(DescribeBillSummaryForOrganizationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBillSummaryForOrganizationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBillSummaryForOrganizationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBillSummaryForOrganization");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询消耗明细
     * @param req DescribeCostDetailRequest
     * @return DescribeCostDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCostDetailResponse DescribeCostDetail(DescribeCostDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCostDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCostDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCostDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取按产品汇总消耗详情
     * @param req DescribeCostSummaryByProductRequest
     * @return DescribeCostSummaryByProductResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCostSummaryByProductResponse DescribeCostSummaryByProduct(DescribeCostSummaryByProductRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCostSummaryByProductResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCostSummaryByProductResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCostSummaryByProduct");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取按项目汇总消耗详情
     * @param req DescribeCostSummaryByProjectRequest
     * @return DescribeCostSummaryByProjectResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCostSummaryByProjectResponse DescribeCostSummaryByProject(DescribeCostSummaryByProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCostSummaryByProjectResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCostSummaryByProjectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCostSummaryByProject");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取按地域汇总消耗详情
     * @param req DescribeCostSummaryByRegionRequest
     * @return DescribeCostSummaryByRegionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCostSummaryByRegionResponse DescribeCostSummaryByRegion(DescribeCostSummaryByRegionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCostSummaryByRegionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCostSummaryByRegionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCostSummaryByRegion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取按资源汇总消耗详情
     * @param req DescribeCostSummaryByResourceRequest
     * @return DescribeCostSummaryByResourceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCostSummaryByResourceResponse DescribeCostSummaryByResource(DescribeCostSummaryByResourceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCostSummaryByResourceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCostSummaryByResourceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCostSummaryByResource");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询订单
     * @param req DescribeDealsByCondRequest
     * @return DescribeDealsByCondResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDealsByCondResponse DescribeDealsByCond(DescribeDealsByCondRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDealsByCondResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDealsByCondResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDealsByCond");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取COS产品用量明细
     * @param req DescribeDosageCosDetailByDateRequest
     * @return DescribeDosageCosDetailByDateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDosageCosDetailByDateResponse DescribeDosageCosDetailByDate(DescribeDosageCosDetailByDateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDosageCosDetailByDateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDosageCosDetailByDateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDosageCosDetailByDate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *按日期获取产品用量明细
     * @param req DescribeDosageDetailByDateRequest
     * @return DescribeDosageDetailByDateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDosageDetailByDateResponse DescribeDosageDetailByDate(DescribeDosageDetailByDateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDosageDetailByDateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDosageDetailByDateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDosageDetailByDate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取分账标签
     * @param req DescribeTagListRequest
     * @return DescribeTagListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTagListResponse DescribeTagList(DescribeTagListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTagListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTagListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTagList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取代金券相关信息
     * @param req DescribeVoucherInfoRequest
     * @return DescribeVoucherInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVoucherInfoResponse DescribeVoucherInfo(DescribeVoucherInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVoucherInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVoucherInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVoucherInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取代金券使用记录
     * @param req DescribeVoucherUsageDetailsRequest
     * @return DescribeVoucherUsageDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVoucherUsageDetailsResponse DescribeVoucherUsageDetails(DescribeVoucherUsageDetailsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVoucherUsageDetailsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVoucherUsageDetailsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVoucherUsageDetails");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *支付订单
     * @param req PayDealsRequest
     * @return PayDealsResponse
     * @throws TencentCloudSDKException
     */
    public PayDealsResponse PayDeals(PayDealsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PayDealsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<PayDealsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PayDeals");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
