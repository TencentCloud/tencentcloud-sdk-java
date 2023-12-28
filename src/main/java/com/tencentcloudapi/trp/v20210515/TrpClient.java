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
package com.tencentcloudapi.trp.v20210515;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.trp.v20210515.models.*;

public class TrpClient extends AbstractClient{
    private static String endpoint = "trp.tencentcloudapi.com";
    private static String service = "trp";
    private static String version = "2021-05-15";
    
    public TrpClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TrpClient(Credential credential, String region, ClientProfile profile) {
        super(TrpClient.endpoint, TrpClient.version, credential, region, profile);
    }

    /**
     *接收客户侧的用户已授权的号码。
     * @param req AuthorizedTransferRequest
     * @return AuthorizedTransferResponse
     * @throws TencentCloudSDKException
     */
    public AuthorizedTransferResponse AuthorizedTransfer(AuthorizedTransferRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AuthorizedTransfer", AuthorizedTransferResponse.class);
    }

    /**
     *新增批次
     * @param req CreateCodeBatchRequest
     * @return CreateCodeBatchResponse
     * @throws TencentCloudSDKException
     */
    public CreateCodeBatchResponse CreateCodeBatch(CreateCodeBatchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCodeBatch", CreateCodeBatchResponse.class);
    }

    /**
     *生成普通码包
     * @param req CreateCodePackRequest
     * @return CreateCodePackResponse
     * @throws TencentCloudSDKException
     */
    public CreateCodePackResponse CreateCodePack(CreateCodePackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCodePack", CreateCodePackResponse.class);
    }

    /**
     *以订单方式新建企业信息/配额信息
     * @param req CreateCorporationOrderRequest
     * @return CreateCorporationOrderResponse
     * @throws TencentCloudSDKException
     */
    public CreateCorporationOrderResponse CreateCorporationOrder(CreateCorporationOrderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCorporationOrder", CreateCorporationOrderResponse.class);
    }

    /**
     *生成自定义码包
     * @param req CreateCustomPackRequest
     * @return CreateCustomPackResponse
     * @throws TencentCloudSDKException
     */
    public CreateCustomPackResponse CreateCustomPack(CreateCustomPackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCustomPack", CreateCustomPackResponse.class);
    }

    /**
     *新建自定义码规则
     * @param req CreateCustomRuleRequest
     * @return CreateCustomRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateCustomRuleResponse CreateCustomRule(CreateCustomRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCustomRule", CreateCustomRuleResponse.class);
    }

    /**
     *新建商户
     * @param req CreateMerchantRequest
     * @return CreateMerchantResponse
     * @throws TencentCloudSDKException
     */
    public CreateMerchantResponse CreateMerchant(CreateMerchantRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMerchant", CreateMerchantResponse.class);
    }

    /**
     *新建商品
     * @param req CreateProductRequest
     * @return CreateProductResponse
     * @throws TencentCloudSDKException
     */
    public CreateProductResponse CreateProduct(CreateProductRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateProduct", CreateProductResponse.class);
    }

    /**
     *上链溯源信息
     * @param req CreateTraceChainRequest
     * @return CreateTraceChainResponse
     * @throws TencentCloudSDKException
     */
    public CreateTraceChainResponse CreateTraceChain(CreateTraceChainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTraceChain", CreateTraceChainResponse.class);
    }

    /**
     *批量绑定指定批次并激活二维码，只支持平台发的码，且只会激活没有使用过的码
     * @param req CreateTraceCodesRequest
     * @return CreateTraceCodesResponse
     * @throws TencentCloudSDKException
     */
    public CreateTraceCodesResponse CreateTraceCodes(CreateTraceCodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTraceCodes", CreateTraceCodesResponse.class);
    }

    /**
     *异步导入激活码包，如果是第三方码包，需要域名跟配置的匹配
     * @param req CreateTraceCodesAsyncRequest
     * @return CreateTraceCodesAsyncResponse
     * @throws TencentCloudSDKException
     */
    public CreateTraceCodesAsyncResponse CreateTraceCodesAsync(CreateTraceCodesAsyncRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTraceCodesAsync", CreateTraceCodesAsyncResponse.class);
    }

    /**
     *新增溯源信息
     * @param req CreateTraceDataRequest
     * @return CreateTraceDataResponse
     * @throws TencentCloudSDKException
     */
    public CreateTraceDataResponse CreateTraceData(CreateTraceDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTraceData", CreateTraceDataResponse.class);
    }

    /**
     *删除批次
     * @param req DeleteCodeBatchRequest
     * @return DeleteCodeBatchResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCodeBatchResponse DeleteCodeBatch(DeleteCodeBatchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCodeBatch", DeleteCodeBatchResponse.class);
    }

    /**
     *删除商户
     * @param req DeleteMerchantRequest
     * @return DeleteMerchantResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMerchantResponse DeleteMerchant(DeleteMerchantRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMerchant", DeleteMerchantResponse.class);
    }

    /**
     *删除商品，如果商品被使用，则不可删除
     * @param req DeleteProductRequest
     * @return DeleteProductResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProductResponse DeleteProduct(DeleteProductRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteProduct", DeleteProductResponse.class);
    }

    /**
     *删除溯源信息，如果已经上链则不可删除
     * @param req DeleteTraceDataRequest
     * @return DeleteTraceDataResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTraceDataResponse DeleteTraceData(DeleteTraceDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTraceData", DeleteTraceDataResponse.class);
    }

    /**
     *查询渠道企业列表
     * @param req DescribeAgentCorpsRequest
     * @return DescribeAgentCorpsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentCorpsResponse DescribeAgentCorps(DescribeAgentCorpsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAgentCorps", DescribeAgentCorpsResponse.class);
    }

    /**
     *查询批次信息
     * @param req DescribeCodeBatchByIdRequest
     * @return DescribeCodeBatchByIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCodeBatchByIdResponse DescribeCodeBatchById(DescribeCodeBatchByIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCodeBatchById", DescribeCodeBatchByIdResponse.class);
    }

    /**
     *查询批次列表
     * @param req DescribeCodeBatchesRequest
     * @return DescribeCodeBatchesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCodeBatchesResponse DescribeCodeBatches(DescribeCodeBatchesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCodeBatches", DescribeCodeBatchesResponse.class);
    }

    /**
     *查询批次列表

旧版接口已经弃用，新业务请使用新版的接口 DescribeCodeBatches
     * @param req DescribeCodeBatchsRequest
     * @return DescribeCodeBatchsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCodeBatchsResponse DescribeCodeBatchs(DescribeCodeBatchsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCodeBatchs", DescribeCodeBatchsResponse.class);
    }

    /**
     *查询码包状态
     * @param req DescribeCodePackStatusRequest
     * @return DescribeCodePackStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCodePackStatusResponse DescribeCodePackStatus(DescribeCodePackStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCodePackStatus", DescribeCodePackStatusResponse.class);
    }

    /**
     *查询码包地址
     * @param req DescribeCodePackUrlRequest
     * @return DescribeCodePackUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCodePackUrlResponse DescribeCodePackUrl(DescribeCodePackUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCodePackUrl", DescribeCodePackUrlResponse.class);
    }

    /**
     *查询码包列表
     * @param req DescribeCodePacksRequest
     * @return DescribeCodePacksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCodePacksResponse DescribeCodePacks(DescribeCodePacksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCodePacks", DescribeCodePacksResponse.class);
    }

    /**
     *查询码包的二维码列表，上限 3 万
     * @param req DescribeCodesByPackRequest
     * @return DescribeCodesByPackResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCodesByPackResponse DescribeCodesByPack(DescribeCodesByPackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCodesByPack", DescribeCodesByPackResponse.class);
    }

    /**
     *查询渠道商下属企业额度使用情况
     * @param req DescribeCorpQuotasRequest
     * @return DescribeCorpQuotasResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCorpQuotasResponse DescribeCorpQuotas(DescribeCorpQuotasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCorpQuotas", DescribeCorpQuotasResponse.class);
    }

    /**
     *查自定义码规则
     * @param req DescribeCustomRuleByIdRequest
     * @return DescribeCustomRuleByIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomRuleByIdResponse DescribeCustomRuleById(DescribeCustomRuleByIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCustomRuleById", DescribeCustomRuleByIdResponse.class);
    }

    /**
     *查自定义码规则列表
     * @param req DescribeCustomRulesRequest
     * @return DescribeCustomRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomRulesResponse DescribeCustomRules(DescribeCustomRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCustomRules", DescribeCustomRulesResponse.class);
    }

    /**
     *获取异步任务的输出地址
     * @param req DescribeJobFileUrlRequest
     * @return DescribeJobFileUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJobFileUrlResponse DescribeJobFileUrl(DescribeJobFileUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeJobFileUrl", DescribeJobFileUrlResponse.class);
    }

    /**
     *查询商户信息
     * @param req DescribeMerchantByIdRequest
     * @return DescribeMerchantByIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMerchantByIdResponse DescribeMerchantById(DescribeMerchantByIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMerchantById", DescribeMerchantByIdResponse.class);
    }

    /**
     *查询商户列表
     * @param req DescribeMerchantsRequest
     * @return DescribeMerchantsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMerchantsResponse DescribeMerchants(DescribeMerchantsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMerchants", DescribeMerchantsResponse.class);
    }

    /**
     *查询安心计划二维码扫码记录
     * @param req DescribePlanQRCodeScanRecordsRequest
     * @return DescribePlanQRCodeScanRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePlanQRCodeScanRecordsResponse DescribePlanQRCodeScanRecords(DescribePlanQRCodeScanRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePlanQRCodeScanRecords", DescribePlanQRCodeScanRecordsResponse.class);
    }

    /**
     *查询安心计划二维码列表
     * @param req DescribePlanQRCodesRequest
     * @return DescribePlanQRCodesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePlanQRCodesResponse DescribePlanQRCodes(DescribePlanQRCodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePlanQRCodes", DescribePlanQRCodesResponse.class);
    }

    /**
     *查询商品信息
     * @param req DescribeProductByIdRequest
     * @return DescribeProductByIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductByIdResponse DescribeProductById(DescribeProductByIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProductById", DescribeProductByIdResponse.class);
    }

    /**
     *查询商品列表
     * @param req DescribeProductsRequest
     * @return DescribeProductsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductsResponse DescribeProducts(DescribeProductsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProducts", DescribeProductsResponse.class);
    }

    /**
     *支持增量查询扫码日志，通常提供给数据同步使用，调用时需要指定从哪一行开始查询数据
     * @param req DescribeRawScanLogsRequest
     * @return DescribeRawScanLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRawScanLogsResponse DescribeRawScanLogs(DescribeRawScanLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRawScanLogs", DescribeRawScanLogsResponse.class);
    }

    /**
     *查询扫码日志明细
     * @param req DescribeScanLogsRequest
     * @return DescribeScanLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanLogsResponse DescribeScanLogs(DescribeScanLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScanLogs", DescribeScanLogsResponse.class);
    }

    /**
     *查询扫码的统计信息列表，支持按照商户ID，产品ID，批次ID，安心码筛选，筛选条件至少有一个
没有被扫过的不会返回
     * @param req DescribeScanStatsRequest
     * @return DescribeScanStatsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanStatsResponse DescribeScanStats(DescribeScanStatsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScanStats", DescribeScanStatsResponse.class);
    }

    /**
     *查询临时Token，主要用于上传接口
     * @param req DescribeTmpTokenRequest
     * @return DescribeTmpTokenResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTmpTokenResponse DescribeTmpToken(DescribeTmpTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTmpToken", DescribeTmpTokenResponse.class);
    }

    /**
     *查询二维码信息
     * @param req DescribeTraceCodeByIdRequest
     * @return DescribeTraceCodeByIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTraceCodeByIdResponse DescribeTraceCodeById(DescribeTraceCodeByIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTraceCodeById", DescribeTraceCodeByIdResponse.class);
    }

    /**
     *查询二维码列表
     * @param req DescribeTraceCodesRequest
     * @return DescribeTraceCodesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTraceCodesResponse DescribeTraceCodes(DescribeTraceCodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTraceCodes", DescribeTraceCodesResponse.class);
    }

    /**
     *查询溯源ID查溯源信息，通常溯源信息跟生产批次绑定，即一个批次的所有溯源信息都是一样的
     * @param req DescribeTraceDataByIdRequest
     * @return DescribeTraceDataByIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTraceDataByIdResponse DescribeTraceDataById(DescribeTraceDataByIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTraceDataById", DescribeTraceDataByIdResponse.class);
    }

    /**
     *查询溯源信息，通常溯源信息跟生产批次绑定，即一个批次的所有溯源信息都是一样的
     * @param req DescribeTraceDataListRequest
     * @return DescribeTraceDataListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTraceDataListResponse DescribeTraceDataList(DescribeTraceDataListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTraceDataList", DescribeTraceDataListResponse.class);
    }

    /**
     *接收客户反馈的各环节数据
     * @param req EffectFeedbackRequest
     * @return EffectFeedbackResponse
     * @throws TencentCloudSDKException
     */
    public EffectFeedbackResponse EffectFeedback(EffectFeedbackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EffectFeedback", EffectFeedbackResponse.class);
    }

    /**
     *修改批次
     * @param req ModifyCodeBatchRequest
     * @return ModifyCodeBatchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCodeBatchResponse ModifyCodeBatch(ModifyCodeBatchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCodeBatch", ModifyCodeBatchResponse.class);
    }

    /**
     *修改自定义码规则
     * @param req ModifyCustomRuleRequest
     * @return ModifyCustomRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCustomRuleResponse ModifyCustomRule(ModifyCustomRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCustomRule", ModifyCustomRuleResponse.class);
    }

    /**
     *更新自定义码规则状态
     * @param req ModifyCustomRuleStatusRequest
     * @return ModifyCustomRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCustomRuleStatusResponse ModifyCustomRuleStatus(ModifyCustomRuleStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCustomRuleStatus", ModifyCustomRuleStatusResponse.class);
    }

    /**
     *编辑商户
     * @param req ModifyMerchantRequest
     * @return ModifyMerchantResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMerchantResponse ModifyMerchant(ModifyMerchantRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMerchant", ModifyMerchantResponse.class);
    }

    /**
     *编辑商品
     * @param req ModifyProductRequest
     * @return ModifyProductResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProductResponse ModifyProduct(ModifyProductRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyProduct", ModifyProductResponse.class);
    }

    /**
     *冻结或者激活二维码，所属的批次的冻结状态优先级大于单个二维码的状态，即如果批次是冻结的，那么该批次下二维码的状态都是冻结的
     * @param req ModifyTraceCodeRequest
     * @return ModifyTraceCodeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTraceCodeResponse ModifyTraceCode(ModifyTraceCodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTraceCode", ModifyTraceCodeResponse.class);
    }

    /**
     *解绑溯源码和批次的关系，让溯源码重置为未关联的状态，以便关联其他批次
注意：溯源码必须属于指定的批次才会解绑
     * @param req ModifyTraceCodeUnlinkRequest
     * @return ModifyTraceCodeUnlinkResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTraceCodeUnlinkResponse ModifyTraceCodeUnlink(ModifyTraceCodeUnlinkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTraceCodeUnlink", ModifyTraceCodeUnlinkResponse.class);
    }

    /**
     *修改溯源信息
     * @param req ModifyTraceDataRequest
     * @return ModifyTraceDataResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTraceDataResponse ModifyTraceData(ModifyTraceDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTraceData", ModifyTraceDataResponse.class);
    }

    /**
     *修改溯源信息的排序
     * @param req ModifyTraceDataRanksRequest
     * @return ModifyTraceDataRanksResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTraceDataRanksResponse ModifyTraceDataRanks(ModifyTraceDataRanksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTraceDataRanks", ModifyTraceDataRanksResponse.class);
    }

    /**
     *接收离线筛选包回执，用于效果统计和分析。
     * @param req ReportBatchCallbackStatusRequest
     * @return ReportBatchCallbackStatusResponse
     * @throws TencentCloudSDKException
     */
    public ReportBatchCallbackStatusResponse ReportBatchCallbackStatus(ReportBatchCallbackStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReportBatchCallbackStatus", ReportBatchCallbackStatusResponse.class);
    }

}
