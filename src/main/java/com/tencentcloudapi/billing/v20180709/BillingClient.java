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
    private static String version = "2018-07-09";

    public BillingClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public BillingClient(Credential credential, String region, ClientProfile profile) {
        super(BillingClient.endpoint, BillingClient.version, credential, region, profile);
    }

    /**
     *获取云账户余额信息。
     * @param req DescribeAccountBalanceRequest
     * @return DescribeAccountBalanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountBalanceResponse DescribeAccountBalance(DescribeAccountBalanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccountBalanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAccountBalanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAccountBalance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询账单明细数据
     * @param req DescribeBillDetailRequest
     * @return DescribeBillDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillDetailResponse DescribeBillDetail(DescribeBillDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBillDetailResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBillDetailResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeBillDetail"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBillListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeBillList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询账单资源汇总数据 
     * @param req DescribeBillResourceSummaryRequest
     * @return DescribeBillResourceSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillResourceSummaryResponse DescribeBillResourceSummary(DescribeBillResourceSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBillResourceSummaryResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBillResourceSummaryResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeBillResourceSummary"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取按付费模式汇总费用分布
     * @param req DescribeBillSummaryByPayModeRequest
     * @return DescribeBillSummaryByPayModeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillSummaryByPayModeResponse DescribeBillSummaryByPayMode(DescribeBillSummaryByPayModeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBillSummaryByPayModeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBillSummaryByPayModeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeBillSummaryByPayMode"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBillSummaryByProductResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeBillSummaryByProduct"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBillSummaryByProjectResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeBillSummaryByProject"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBillSummaryByRegionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeBillSummaryByRegion"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBillSummaryByTagResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeBillSummaryByTag"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCostDetailResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCostDetail"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCostSummaryByProductResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCostSummaryByProduct"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCostSummaryByProjectResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCostSummaryByProject"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCostSummaryByRegionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCostSummaryByRegion"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCostSummaryByResourceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCostSummaryByResource"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDealsByCondResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDealsByCond"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDosageDetailByDateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDosageDetailByDate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<PayDealsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "PayDeals"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
