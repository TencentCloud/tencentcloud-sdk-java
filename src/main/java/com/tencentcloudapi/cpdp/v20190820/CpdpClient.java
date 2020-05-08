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
package com.tencentcloudapi.cpdp.v20190820;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cpdp.v20190820.models.*;

public class CpdpClient extends AbstractClient{
    private static String endpoint = "cpdp.tencentcloudapi.com";
    private static String version = "2019-08-20";

    public CpdpClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CpdpClient(Credential credential, String region, ClientProfile profile) {
        super(CpdpClient.endpoint, CpdpClient.version, credential, region, profile);
    }

    /**
     *跨境-提交申报材料
     * @param req ApplyApplicationMaterialRequest
     * @return ApplyApplicationMaterialResponse
     * @throws TencentCloudSDKException
     */
    public ApplyApplicationMaterialResponse ApplyApplicationMaterial(ApplyApplicationMaterialRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ApplyApplicationMaterialResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ApplyApplicationMaterialResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ApplyApplicationMaterial"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *跨境-汇出指令申请
     * @param req ApplyOutwardOrderRequest
     * @return ApplyOutwardOrderResponse
     * @throws TencentCloudSDKException
     */
    public ApplyOutwardOrderResponse ApplyOutwardOrder(ApplyOutwardOrderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ApplyOutwardOrderResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ApplyOutwardOrderResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ApplyOutwardOrder"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *跨境-付款人申请
     * @param req ApplyPayerInfoRequest
     * @return ApplyPayerInfoResponse
     * @throws TencentCloudSDKException
     */
    public ApplyPayerInfoResponse ApplyPayerInfo(ApplyPayerInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ApplyPayerInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ApplyPayerInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ApplyPayerInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *正常结算提现失败情况下，发起重新提现的请求接口
     * @param req ApplyReWithdrawalRequest
     * @return ApplyReWithdrawalResponse
     * @throws TencentCloudSDKException
     */
    public ApplyReWithdrawalResponse ApplyReWithdrawal(ApplyReWithdrawalRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ApplyReWithdrawalResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ApplyReWithdrawalResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ApplyReWithdrawal"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *跨境-提交贸易材料
     * @param req ApplyTradeRequest
     * @return ApplyTradeResponse
     * @throws TencentCloudSDKException
     */
    public ApplyTradeResponse ApplyTrade(ApplyTradeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ApplyTradeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ApplyTradeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ApplyTrade"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *商户提现
     * @param req ApplyWithdrawalRequest
     * @return ApplyWithdrawalResponse
     * @throws TencentCloudSDKException
     */
    public ApplyWithdrawalResponse ApplyWithdrawal(ApplyWithdrawalRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ApplyWithdrawalResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ApplyWithdrawalResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ApplyWithdrawal"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *商户绑定提现银行卡，每个商户只能绑定一张提现银行卡
     * @param req BindAcctRequest
     * @return BindAcctResponse
     * @throws TencentCloudSDKException
     */
    public BindAcctResponse BindAcct(BindAcctRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindAcctResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<BindAcctResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "BindAcct"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *会员绑定提现账户-回填银联鉴权短信码。用于会员填写动态验证码后，发往银行进行验证，验证成功则完成绑定。
     * @param req BindRelateAccReUnionPayRequest
     * @return BindRelateAccReUnionPayResponse
     * @throws TencentCloudSDKException
     */
    public BindRelateAccReUnionPayResponse BindRelateAccReUnionPay(BindRelateAccReUnionPayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindRelateAccReUnionPayResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<BindRelateAccReUnionPayResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "BindRelateAccReUnionPay"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *会员绑定提现账户-小额鉴权。会员申请绑定提现账户，绑定后从会员子账户中提现到绑定账户。
转账鉴权有两种形式：往账鉴权和来账鉴权。
往账鉴权：该接口发起成功后，银行会向提现账户转入小于等于0.5元的随机金额，并短信通知客户查看，客户查看后，需将收到的金额大小，在电商平台页面上回填，并通知银行。银行验证通过后，完成提现账户绑定。
来账鉴权：该接口发起成功后，银行以短信通知客户查看，客户查看后，需通过待绑定的账户往市场的监管账户转入短信上指定的金额。银行检索到该笔指定金额的来账是源自待绑定账户，则绑定成功。平安银行的账户，即BankType送1时，大小额行号和超级网银号都不用送。
     * @param req BindRelateAcctSmallAmountRequest
     * @return BindRelateAcctSmallAmountResponse
     * @throws TencentCloudSDKException
     */
    public BindRelateAcctSmallAmountResponse BindRelateAcctSmallAmount(BindRelateAcctSmallAmountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindRelateAcctSmallAmountResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<BindRelateAcctSmallAmountResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "BindRelateAcctSmallAmount"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *会员绑定提现账户-银联鉴权。用于会员申请绑定提现账户，申请后银行前往银联验证卡信息：姓名、证件、卡号、银行预留手机是否相符，相符则发送给会员手机动态验证码并返回成功，不相符则返回失败。
平台接收到银行返回成功后，进入输入动态验证码的页面，有效期120秒，若120秒未输入，客户可点击重新发送动态验证码，这个步骤重新调用该接口即可。
平安银行的账户，大小额行号和超级网银号都不用送。
超级网银号：单笔转账金额不超过5万，不限制笔数，只用选XX银行，不用具体到支行，可实时知道对方是否收款成功。
大小额联行号：单笔转账可超过5万，需具体到支行，不能实时知道对方是否收款成功。金额超过5万的，在工作日的8点30-17点间才会成功。
     * @param req BindRelateAcctUnionPayRequest
     * @return BindRelateAcctUnionPayResponse
     * @throws TencentCloudSDKException
     */
    public BindRelateAcctUnionPayResponse BindRelateAcctUnionPay(BindRelateAcctUnionPayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindRelateAcctUnionPayResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<BindRelateAcctUnionPayResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "BindRelateAcctUnionPay"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *商户绑定提现银行卡的验证接口
     * @param req CheckAcctRequest
     * @return CheckAcctResponse
     * @throws TencentCloudSDKException
     */
    public CheckAcctResponse CheckAcct(CheckAcctRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckAcctResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CheckAcctResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CheckAcct"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *验证鉴权金额。此接口可受理BindRelateAcctSmallAmount接口发起的转账金额（往账鉴权方式）的验证处理。若所回填的验证金额验证通过，则会绑定原申请中的银行账户作为提现账户。通过此接口也可以查得BindRelateAcctSmallAmount接口发起的来账鉴权方式的申请的当前状态。
     * @param req CheckAmountRequest
     * @return CheckAmountResponse
     * @throws TencentCloudSDKException
     */
    public CheckAmountResponse CheckAmount(CheckAmountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckAmountResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CheckAmountResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CheckAmount"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过此接口关闭此前已创建的订单，关闭后，用户将无法继续付款。仅能关闭创建后未支付的订单
     * @param req CloseOrderRequest
     * @return CloseOrderResponse
     * @throws TencentCloudSDKException
     */
    public CloseOrderResponse CloseOrder(CloseOrderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CloseOrderResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CloseOrderResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CloseOrder"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *子商户入驻聚鑫平台
     * @param req CreateAcctRequest
     * @return CreateAcctResponse
     * @throws TencentCloudSDKException
     */
    public CreateAcctResponse CreateAcct(CreateAcctRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAcctResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAcctResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateAcct"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *直播平台-代理商完税信息录入
     * @param req CreateAgentTaxPaymentInfosRequest
     * @return CreateAgentTaxPaymentInfosResponse
     * @throws TencentCloudSDKException
     */
    public CreateAgentTaxPaymentInfosResponse CreateAgentTaxPaymentInfos(CreateAgentTaxPaymentInfosRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAgentTaxPaymentInfosResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAgentTaxPaymentInfosResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateAgentTaxPaymentInfos"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *会员子账户开立。会员在银行注册，并开立会员子账户，交易网会员代码即会员在平台端系统的会员编号。
平台需保存银行返回的子账户账号，后续交易接口都会用到。会员属性字段为预留扩展字段，当前必须送默认值。
     * @param req CreateCustAcctIdRequest
     * @return CreateCustAcctIdResponse
     * @throws TencentCloudSDKException
     */
    public CreateCustAcctIdResponse CreateCustAcctId(CreateCustAcctIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCustAcctIdResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCustAcctIdResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateCustAcctId"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *智慧零售-发票开具
     * @param req CreateInvoiceRequest
     * @return CreateInvoiceResponse
     * @throws TencentCloudSDKException
     */
    public CreateInvoiceResponse CreateInvoice(CreateInvoiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateInvoiceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateInvoiceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateInvoice"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *智慧零售-商户注册
     * @param req CreateMerchantRequest
     * @return CreateMerchantResponse
     * @throws TencentCloudSDKException
     */
    public CreateMerchantResponse CreateMerchant(CreateMerchantRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateMerchantResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateMerchantResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateMerchant"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *智慧零售-发票红冲
     * @param req CreateRedInvoiceRequest
     * @return CreateRedInvoiceResponse
     * @throws TencentCloudSDKException
     */
    public CreateRedInvoiceResponse CreateRedInvoice(CreateRedInvoiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRedInvoiceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRedInvoiceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateRedInvoice"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *直播平台-删除代理商完税信息
     * @param req DeleteAgentTaxPaymentInfoRequest
     * @return DeleteAgentTaxPaymentInfoResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAgentTaxPaymentInfoResponse DeleteAgentTaxPaymentInfo(DeleteAgentTaxPaymentInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAgentTaxPaymentInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAgentTaxPaymentInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteAgentTaxPaymentInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *直播平台-删除代理商完税信息
     * @param req DeleteAgentTaxPaymentInfosRequest
     * @return DeleteAgentTaxPaymentInfosResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAgentTaxPaymentInfosResponse DeleteAgentTaxPaymentInfos(DeleteAgentTaxPaymentInfosRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAgentTaxPaymentInfosResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAgentTaxPaymentInfosResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteAgentTaxPaymentInfos"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *账单下载接口，根据本接口返回的URL地址，在D+1日下载对账单。注意，本接口返回的URL地址有时效，请尽快下载。URL超时时效后，请重新调用本接口再次获取。
     * @param req DownloadBillRequest
     * @return DownloadBillResponse
     * @throws TencentCloudSDKException
     */
    public DownloadBillResponse DownloadBill(DownloadBillRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DownloadBillResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DownloadBillResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DownloadBill"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *直播平台-修改代理商完税信息
     * @param req ModifyAgentTaxPaymentInfoRequest
     * @return ModifyAgentTaxPaymentInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAgentTaxPaymentInfoResponse ModifyAgentTaxPaymentInfo(ModifyAgentTaxPaymentInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAgentTaxPaymentInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAgentTaxPaymentInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyAgentTaxPaymentInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *维护会员绑定提现账户联行号。此接口可以支持市场修改会员的提现账户的开户行信息，具体包括开户行行名、开户行的银行联行号（大小额联行号）和超级网银行号。
     * @param req ModifyMntMbrBindRelateAcctBankCodeRequest
     * @return ModifyMntMbrBindRelateAcctBankCodeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMntMbrBindRelateAcctBankCodeResponse ModifyMntMbrBindRelateAcctBankCode(ModifyMntMbrBindRelateAcctBankCodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyMntMbrBindRelateAcctBankCodeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyMntMbrBindRelateAcctBankCodeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyMntMbrBindRelateAcctBankCode"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *聚鑫-查询子账户绑定银行卡
     * @param req QueryAcctBindingRequest
     * @return QueryAcctBindingResponse
     * @throws TencentCloudSDKException
     */
    public QueryAcctBindingResponse QueryAcctBinding(QueryAcctBindingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryAcctBindingResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<QueryAcctBindingResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "QueryAcctBinding"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *聚鑫-开户信息查询
     * @param req QueryAcctInfoRequest
     * @return QueryAcctInfoResponse
     * @throws TencentCloudSDKException
     */
    public QueryAcctInfoResponse QueryAcctInfo(QueryAcctInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryAcctInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<QueryAcctInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "QueryAcctInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *聚鑫-开户信息列表查询, 查询某一段时间的开户信息
     * @param req QueryAcctInfoListRequest
     * @return QueryAcctInfoListResponse
     * @throws TencentCloudSDKException
     */
    public QueryAcctInfoListResponse QueryAcctInfoList(QueryAcctInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryAcctInfoListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<QueryAcctInfoListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "QueryAcctInfoList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *直播平台-查询批次信息
     * @param req QueryAgentTaxPaymentBatchRequest
     * @return QueryAgentTaxPaymentBatchResponse
     * @throws TencentCloudSDKException
     */
    public QueryAgentTaxPaymentBatchResponse QueryAgentTaxPaymentBatch(QueryAgentTaxPaymentBatchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryAgentTaxPaymentBatchResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<QueryAgentTaxPaymentBatchResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "QueryAgentTaxPaymentBatch"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *跨境-成功申报材料查询
     * @param req QueryApplicationMaterialRequest
     * @return QueryApplicationMaterialResponse
     * @throws TencentCloudSDKException
     */
    public QueryApplicationMaterialResponse QueryApplicationMaterial(QueryApplicationMaterialRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryApplicationMaterialResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<QueryApplicationMaterialResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "QueryApplicationMaterial"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *子商户余额查询
     * @param req QueryBalanceRequest
     * @return QueryBalanceResponse
     * @throws TencentCloudSDKException
     */
    public QueryBalanceResponse QueryBalance(QueryBalanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryBalanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<QueryBalanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "QueryBalance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询银行在途清算结果。查询时间段内交易网的在途清算结果。
     * @param req QueryBankClearRequest
     * @return QueryBankClearResponse
     * @throws TencentCloudSDKException
     */
    public QueryBankClearResponse QueryBankClear(QueryBankClearRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryBankClearResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<QueryBankClearResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "QueryBankClear"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询银行时间段内交易明细。查询时间段的会员成功交易。
     * @param req QueryBankTransactionDetailsRequest
     * @return QueryBankTransactionDetailsResponse
     * @throws TencentCloudSDKException
     */
    public QueryBankTransactionDetailsResponse QueryBankTransactionDetails(QueryBankTransactionDetailsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryBankTransactionDetailsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<QueryBankTransactionDetailsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "QueryBankTransactionDetails"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询银行时间段内清分提现明细。查询银行时间段内清分提现明细接口：若为“见证+收单退款”“见证+收单充值”记录时备注Note为“见证+收单充值,订单号”“见证+收单退款,订单号”，此接口可以查到T0/T1的充值明细和退款记录。查询标志：充值记录仍用3清分选项查询，退款记录同提现用2选项查询。
     * @param req QueryBankWithdrawCashDetailsRequest
     * @return QueryBankWithdrawCashDetailsResponse
     * @throws TencentCloudSDKException
     */
    public QueryBankWithdrawCashDetailsResponse QueryBankWithdrawCashDetails(QueryBankWithdrawCashDetailsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryBankWithdrawCashDetailsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<QueryBankWithdrawCashDetailsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "QueryBankWithdrawCashDetails"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询普通转账充值明细。接口用于查询会员主动转账进资金汇总账户的明细情况。若会员使用绑定账号转入，则直接入账到会员子账户。若未使用绑定账号转入，则系统无法自动清分到对应子账户，则转入挂账子账户由平台自行清分。若是 “见证+收单充值”T0充值记录时备注Note为“见证+收单充值,订单号” 此接口可以查到T0到账的“见证+收单充值”充值记录。
     * @param req QueryCommonTransferRechargeRequest
     * @return QueryCommonTransferRechargeResponse
     * @throws TencentCloudSDKException
     */
    public QueryCommonTransferRechargeResponse QueryCommonTransferRecharge(QueryCommonTransferRechargeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryCommonTransferRechargeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<QueryCommonTransferRechargeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "QueryCommonTransferRecharge"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询银行子账户余额。查询会员子账户以及平台的功能子账户的余额。
     * @param req QueryCustAcctIdBalanceRequest
     * @return QueryCustAcctIdBalanceResponse
     * @throws TencentCloudSDKException
     */
    public QueryCustAcctIdBalanceResponse QueryCustAcctIdBalance(QueryCustAcctIdBalanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryCustAcctIdBalanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<QueryCustAcctIdBalanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "QueryCustAcctIdBalance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *跨境-查询汇率
     * @param req QueryExchangeRateRequest
     * @return QueryExchangeRateResponse
     * @throws TencentCloudSDKException
     */
    public QueryExchangeRateResponse QueryExchangeRate(QueryExchangeRateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryExchangeRateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<QueryExchangeRateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "QueryExchangeRate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *智慧零售-发票查询
     * @param req QueryInvoiceRequest
     * @return QueryInvoiceResponse
     * @throws TencentCloudSDKException
     */
    public QueryInvoiceResponse QueryInvoice(QueryInvoiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryInvoiceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<QueryInvoiceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "QueryInvoice"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *会员绑定信息查询。查询标志为“单个会员”的情况下，返回该会员的有效的绑定账户信息。
查询标志为“全部会员”的情况下，返回市场下的全部的有效的绑定账户信息。查询标志为“单个会员的证件信息”的情况下，返回市场下的指定的会员的留存在电商见证宝系统的证件信息。
     * @param req QueryMemberBindRequest
     * @return QueryMemberBindResponse
     * @throws TencentCloudSDKException
     */
    public QueryMemberBindResponse QueryMemberBind(QueryMemberBindRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryMemberBindResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<QueryMemberBindResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "QueryMemberBind"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *会员间交易-不验证。此接口可以实现会员间的余额的交易，实现资金在会员之间流动。
     * @param req QueryMemberTransactionRequest
     * @return QueryMemberTransactionResponse
     * @throws TencentCloudSDKException
     */
    public QueryMemberTransactionResponse QueryMemberTransaction(QueryMemberTransactionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryMemberTransactionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<QueryMemberTransactionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "QueryMemberTransaction"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *跨境-对接方账户余额查询
     * @param req QueryMerchantBalanceRequest
     * @return QueryMerchantBalanceResponse
     * @throws TencentCloudSDKException
     */
    public QueryMerchantBalanceResponse QueryMerchantBalance(QueryMerchantBalanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryMerchantBalanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<QueryMerchantBalanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "QueryMerchantBalance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据订单号，或者用户Id，查询支付订单状态 
     * @param req QueryOrderRequest
     * @return QueryOrderResponse
     * @throws TencentCloudSDKException
     */
    public QueryOrderResponse QueryOrder(QueryOrderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryOrderResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<QueryOrderResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "QueryOrder"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *跨境-查询汇出结果
     * @param req QueryOutwardOrderRequest
     * @return QueryOutwardOrderResponse
     * @throws TencentCloudSDKException
     */
    public QueryOutwardOrderResponse QueryOutwardOrder(QueryOutwardOrderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryOutwardOrderResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<QueryOutwardOrderResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "QueryOutwardOrder"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *跨境-付款人查询
     * @param req QueryPayerInfoRequest
     * @return QueryPayerInfoResponse
     * @throws TencentCloudSDKException
     */
    public QueryPayerInfoResponse QueryPayerInfo(QueryPayerInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryPayerInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<QueryPayerInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "QueryPayerInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询对账文件信息。平台调用该接口获取需下载对账文件的文件名称以及密钥。 平台获取到信息后， 可以再调用OPENAPI的文件下载功能。
     * @param req QueryReconciliationDocumentRequest
     * @return QueryReconciliationDocumentResponse
     * @throws TencentCloudSDKException
     */
    public QueryReconciliationDocumentResponse QueryReconciliationDocument(QueryReconciliationDocumentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryReconciliationDocumentResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<QueryReconciliationDocumentResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "QueryReconciliationDocument"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提交退款申请后，通过调用该接口查询退款状态。退款可能有一定延时，用微信零钱支付的退款约20分钟内到账，银行卡支付的退款约3个工作日后到账。
     * @param req QueryRefundRequest
     * @return QueryRefundResponse
     * @throws TencentCloudSDKException
     */
    public QueryRefundResponse QueryRefund(QueryRefundRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryRefundResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<QueryRefundResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "QueryRefund"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询银行单笔交易状态。查询单笔交易的状态。
     * @param req QuerySingleTransactionStatusRequest
     * @return QuerySingleTransactionStatusResponse
     * @throws TencentCloudSDKException
     */
    public QuerySingleTransactionStatusResponse QuerySingleTransactionStatus(QuerySingleTransactionStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QuerySingleTransactionStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<QuerySingleTransactionStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "QuerySingleTransactionStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询小额鉴权转账结果。查询小额往账鉴权的转账状态。
     * @param req QuerySmallAmountTransferRequest
     * @return QuerySmallAmountTransferResponse
     * @throws TencentCloudSDKException
     */
    public QuerySmallAmountTransferResponse QuerySmallAmountTransfer(QuerySmallAmountTransferRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QuerySmallAmountTransferResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<QuerySmallAmountTransferResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "QuerySmallAmountTransfer"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *跨境-贸易材料明细查询
     * @param req QueryTradeRequest
     * @return QueryTradeResponse
     * @throws TencentCloudSDKException
     */
    public QueryTradeResponse QueryTrade(QueryTradeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryTradeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<QueryTradeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "QueryTrade"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *见证宝-会员在途充值(经第三方支付渠道)
     * @param req RechargeMemberThirdPayRequest
     * @return RechargeMemberThirdPayResponse
     * @throws TencentCloudSDKException
     */
    public RechargeMemberThirdPayResponse RechargeMemberThirdPay(RechargeMemberThirdPayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RechargeMemberThirdPayResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RechargeMemberThirdPayResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RechargeMemberThirdPay"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *如交易订单需退款，可以通过本接口将支付款全部或部分退还给付款方，聚鑫将在收到退款请求并且验证成功之后，按照退款规则将支付款按原路退回到支付帐号。最长支持1年的订单退款。在订单包含多个子订单的情况下，如果使用本接口传入OutTradeNo或TransactionId退款，则只支持全单退款；如果需要部分退款，请通过传入子订单的方式来指定部分金额退款。 
     * @param req RefundRequest
     * @return RefundResponse
     * @throws TencentCloudSDKException
     */
    public RefundResponse Refund(RefundRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RefundResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RefundResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "Refund"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *登记挂账(支持撤销)。此接口可实现把不明来账或自有资金等已登记在挂账子账户下的资金调整到普通会员子账户。即通过申请调用此接口，将会减少挂账子账户的资金，调增指定的普通会员子账户的可提现余额及可用余额。此接口不支持把挂账子账户资金清分到功能子账户。
     * @param req RegisterBillSupportWithdrawRequest
     * @return RegisterBillSupportWithdrawResponse
     * @throws TencentCloudSDKException
     */
    public RegisterBillSupportWithdrawResponse RegisterBillSupportWithdraw(RegisterBillSupportWithdrawRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RegisterBillSupportWithdrawResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RegisterBillSupportWithdrawResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RegisterBillSupportWithdraw"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *登记挂账撤销。此接口可以实现把RegisterBillSupportWithdraw接口完成的登记挂账进行撤销，即调减普通会员子账户的可提现和可用余额，调增挂账子账户的可用余额。
     * @param req RevRegisterBillSupportWithdrawRequest
     * @return RevRegisterBillSupportWithdrawResponse
     * @throws TencentCloudSDKException
     */
    public RevRegisterBillSupportWithdrawResponse RevRegisterBillSupportWithdraw(RevRegisterBillSupportWithdrawRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RevRegisterBillSupportWithdrawResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RevRegisterBillSupportWithdrawResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RevRegisterBillSupportWithdraw"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *登记挂账撤销。此接口可以实现把RegisterBillSupportWithdraw接口完成的登记挂账进行撤销，即调减普通会员子账户的可提现和可用余额，调增挂账子账户的可用余额。
     * @param req RevResigterBillSupportWithdrawRequest
     * @return RevResigterBillSupportWithdrawResponse
     * @throws TencentCloudSDKException
     */
    public RevResigterBillSupportWithdrawResponse RevResigterBillSupportWithdraw(RevResigterBillSupportWithdrawRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RevResigterBillSupportWithdrawResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RevResigterBillSupportWithdrawResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RevResigterBillSupportWithdraw"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改会员属性-普通商户子账户。修改会员的会员属性。
     * @param req ReviseMbrPropertyRequest
     * @return ReviseMbrPropertyResponse
     * @throws TencentCloudSDKException
     */
    public ReviseMbrPropertyResponse ReviseMbrProperty(ReviseMbrPropertyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReviseMbrPropertyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ReviseMbrPropertyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ReviseMbrProperty"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *撤销会员在途充值(经第三方支付渠道)
     * @param req RevokeMemberRechargeThirdPayRequest
     * @return RevokeMemberRechargeThirdPayResponse
     * @throws TencentCloudSDKException
     */
    public RevokeMemberRechargeThirdPayResponse RevokeMemberRechargeThirdPay(RevokeMemberRechargeThirdPayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RevokeMemberRechargeThirdPayResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RevokeMemberRechargeThirdPayResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RevokeMemberRechargeThirdPay"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *商户解除绑定的提现银行卡
     * @param req UnBindAcctRequest
     * @return UnBindAcctResponse
     * @throws TencentCloudSDKException
     */
    public UnBindAcctResponse UnBindAcct(UnBindAcctRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnBindAcctResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UnBindAcctResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UnBindAcct"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *会员解绑提现账户。此接口可以支持会员解除名下的绑定账户关系。
     * @param req UnbindRelateAcctRequest
     * @return UnbindRelateAcctResponse
     * @throws TencentCloudSDKException
     */
    public UnbindRelateAcctResponse UnbindRelateAcct(UnbindRelateAcctRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnbindRelateAcctResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UnbindRelateAcctResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UnbindRelateAcct"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *应用需要先调用本接口生成支付订单号，并将应答的PayInfo透传给聚鑫SDK，拉起客户端（包括微信公众号/微信小程序/客户端App）支付。
     * @param req UnifiedOrderRequest
     * @return UnifiedOrderResponse
     * @throws TencentCloudSDKException
     */
    public UnifiedOrderResponse UnifiedOrder(UnifiedOrderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnifiedOrderResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UnifiedOrderResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UnifiedOrder"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *会员提现-不验证。此接口受理会员发起的提现申请。会员子账户的可提现余额、可用余额会减少，市场的资金汇总账户(监管账户)会减少相应的发生金额，提现到会员申请的收款账户。		
     * @param req WithdrawCashMembershipRequest
     * @return WithdrawCashMembershipResponse
     * @throws TencentCloudSDKException
     */
    public WithdrawCashMembershipResponse WithdrawCashMembership(WithdrawCashMembershipRequest req) throws TencentCloudSDKException{
        JsonResponseModel<WithdrawCashMembershipResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<WithdrawCashMembershipResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "WithdrawCashMembership"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
