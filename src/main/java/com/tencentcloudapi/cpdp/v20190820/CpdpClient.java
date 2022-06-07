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
    private static String service = "cpdp";
    private static String version = "2019-08-20";

    public CpdpClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CpdpClient(Credential credential, String region, ClientProfile profile) {
        super(CpdpClient.endpoint, CpdpClient.version, credential, region, profile);
    }

    /**
     *云支付-添加合同接口
     * @param req AddContractRequest
     * @return AddContractResponse
     * @throws TencentCloudSDKException
     */
    public AddContractResponse AddContract(AddContractRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddContractResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddContractResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddContract");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云支付-添加商户接口
     * @param req AddMerchantRequest
     * @return AddMerchantResponse
     * @throws TencentCloudSDKException
     */
    public AddMerchantResponse AddMerchant(AddMerchantRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddMerchantResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddMerchantResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddMerchant");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云支付-添加门店接口
     * @param req AddShopRequest
     * @return AddShopResponse
     * @throws TencentCloudSDKException
     */
    public AddShopResponse AddShop(AddShopRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddShopResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddShopResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddShop");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *跨境-提交申报材料。申报材料的主体是付款人，需要提前调用【跨境-付款人申请】接口提交付款人信息且审核通过后调用。
     * @param req ApplyApplicationMaterialRequest
     * @return ApplyApplicationMaterialResponse
     * @throws TencentCloudSDKException
     */
    public ApplyApplicationMaterialResponse ApplyApplicationMaterial(ApplyApplicationMaterialRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ApplyApplicationMaterialResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ApplyApplicationMaterialResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ApplyApplicationMaterial");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *灵云V2-付款
     * @param req ApplyFlexPaymentRequest
     * @return ApplyFlexPaymentResponse
     * @throws TencentCloudSDKException
     */
    public ApplyFlexPaymentResponse ApplyFlexPayment(ApplyFlexPaymentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ApplyFlexPaymentResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ApplyFlexPaymentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ApplyFlexPayment");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *灵云V2-结算
     * @param req ApplyFlexSettlementRequest
     * @return ApplyFlexSettlementResponse
     * @throws TencentCloudSDKException
     */
    public ApplyFlexSettlementResponse ApplyFlexSettlement(ApplyFlexSettlementRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ApplyFlexSettlementResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ApplyFlexSettlementResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ApplyFlexSettlement");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云企付-申请单笔交易回单
     * @param req ApplyOpenBankOrderDetailReceiptRequest
     * @return ApplyOpenBankOrderDetailReceiptResponse
     * @throws TencentCloudSDKException
     */
    public ApplyOpenBankOrderDetailReceiptResponse ApplyOpenBankOrderDetailReceipt(ApplyOpenBankOrderDetailReceiptRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ApplyOpenBankOrderDetailReceiptResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ApplyOpenBankOrderDetailReceiptResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ApplyOpenBankOrderDetailReceipt");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *跨境-汇出指令申请。通过该接口可将对接方账户中的人民币余额汇兑成外币，再汇出至指定银行账户。
     * @param req ApplyOutwardOrderRequest
     * @return ApplyOutwardOrderResponse
     * @throws TencentCloudSDKException
     */
    public ApplyOutwardOrderResponse ApplyOutwardOrder(ApplyOutwardOrderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ApplyOutwardOrderResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ApplyOutwardOrderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ApplyOutwardOrder");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *跨境-付款人申请。通过该接口提交付款人信息并进行 kyc 审核。
     * @param req ApplyPayerInfoRequest
     * @return ApplyPayerInfoResponse
     * @throws TencentCloudSDKException
     */
    public ApplyPayerInfoResponse ApplyPayerInfo(ApplyPayerInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ApplyPayerInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ApplyPayerInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ApplyPayerInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ApplyReWithdrawalResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ApplyReWithdrawal");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *聚鑫-申请对账文件
     * @param req ApplyReconciliationFileRequest
     * @return ApplyReconciliationFileResponse
     * @throws TencentCloudSDKException
     */
    public ApplyReconciliationFileResponse ApplyReconciliationFile(ApplyReconciliationFileRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ApplyReconciliationFileResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ApplyReconciliationFileResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ApplyReconciliationFile");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *跨境-提交贸易材料。通过提交贸易材料接口可为对接方累计贸易额度，在额度范围内可发起汇兑汇出交易。
     * @param req ApplyTradeRequest
     * @return ApplyTradeResponse
     * @throws TencentCloudSDKException
     */
    public ApplyTradeResponse ApplyTrade(ApplyTradeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ApplyTradeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ApplyTradeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ApplyTrade");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ApplyWithdrawalResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ApplyWithdrawal");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *灵云-绑定账号
     * @param req BindAccountRequest
     * @return BindAccountResponse
     * @throws TencentCloudSDKException
     */
    public BindAccountResponse BindAccount(BindAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindAccountResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BindAccountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindAccount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BindAcctResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindAcct");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云企付-子商户银行卡绑定
     * @param req BindOpenBankExternalSubMerchantBankAccountRequest
     * @return BindOpenBankExternalSubMerchantBankAccountResponse
     * @throws TencentCloudSDKException
     */
    public BindOpenBankExternalSubMerchantBankAccountResponse BindOpenBankExternalSubMerchantBankAccount(BindOpenBankExternalSubMerchantBankAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindOpenBankExternalSubMerchantBankAccountResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BindOpenBankExternalSubMerchantBankAccountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindOpenBankExternalSubMerchantBankAccount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BindRelateAccReUnionPayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindRelateAccReUnionPay");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BindRelateAcctSmallAmountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindRelateAcctSmallAmount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BindRelateAcctUnionPayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindRelateAcctUnionPay");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CheckAcctResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckAcct");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CheckAmountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckAmount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过此接口关闭此前已创建的订单。关闭后，用户将无法继续付款，仅能关闭创建后未支付的订单。
     * @param req CloseCloudOrderRequest
     * @return CloseCloudOrderResponse
     * @throws TencentCloudSDKException
     */
    public CloseCloudOrderResponse CloseCloudOrder(CloseCloudOrderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CloseCloudOrderResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CloseCloudOrderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CloseCloudOrder");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云企付-关闭订单
     * @param req CloseOpenBankPaymentOrderRequest
     * @return CloseOpenBankPaymentOrderResponse
     * @throws TencentCloudSDKException
     */
    public CloseOpenBankPaymentOrderResponse CloseOpenBankPaymentOrder(CloseOpenBankPaymentOrderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CloseOpenBankPaymentOrderResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CloseOpenBankPaymentOrderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CloseOpenBankPaymentOrder");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CloseOrderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CloseOrder");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云鉴-消费订单确认接口
     * @param req ConfirmOrderRequest
     * @return ConfirmOrderResponse
     * @throws TencentCloudSDKException
     */
    public ConfirmOrderResponse ConfirmOrder(ConfirmOrderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ConfirmOrderResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ConfirmOrderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ConfirmOrder");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *应用需要先带上签约信息调用本接口生成支付订单号，并将应答的PayInfo透传给聚鑫SDK，拉起客户端（包括微信公众号/微信小程序/客户端App）支付。
     * @param req ContractOrderRequest
     * @return ContractOrderResponse
     * @throws TencentCloudSDKException
     */
    public ContractOrderResponse ContractOrder(ContractOrderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ContractOrderResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ContractOrderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ContractOrder");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAcctResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAcct");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAgentTaxPaymentInfosResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAgentTaxPaymentInfos");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *直播平台-主播入驻
     * @param req CreateAnchorRequest
     * @return CreateAnchorResponse
     * @throws TencentCloudSDKException
     */
    public CreateAnchorResponse CreateAnchor(CreateAnchorRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAnchorResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAnchorResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAnchor");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *灵云-批量主播转账接口
     * @param req CreateBatchPaymentRequest
     * @return CreateBatchPaymentResponse
     * @throws TencentCloudSDKException
     */
    public CreateBatchPaymentResponse CreateBatchPayment(CreateBatchPaymentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBatchPaymentResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateBatchPaymentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateBatchPayment");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建子商户
     * @param req CreateCloudSubMerchantRequest
     * @return CreateCloudSubMerchantResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudSubMerchantResponse CreateCloudSubMerchant(CreateCloudSubMerchantRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCloudSubMerchantResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCloudSubMerchantResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCloudSubMerchant");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCustAcctIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCustAcctId");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *灵云-主播入驻
     * @param req CreateExternalAnchorRequest
     * @return CreateExternalAnchorResponse
     * @throws TencentCloudSDKException
     */
    public CreateExternalAnchorResponse CreateExternalAnchor(CreateExternalAnchorRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateExternalAnchorResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateExternalAnchorResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateExternalAnchor");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *灵云V2-收款用户开立
     * @param req CreateFlexPayeeRequest
     * @return CreateFlexPayeeResponse
     * @throws TencentCloudSDKException
     */
    public CreateFlexPayeeResponse CreateFlexPayee(CreateFlexPayeeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFlexPayeeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFlexPayeeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateFlexPayee");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateInvoiceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateInvoice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *智慧零售-发票开具V2
     * @param req CreateInvoiceV2Request
     * @return CreateInvoiceV2Response
     * @throws TencentCloudSDKException
     */
    public CreateInvoiceV2Response CreateInvoiceV2(CreateInvoiceV2Request req) throws TencentCloudSDKException{
        JsonResponseModel<CreateInvoiceV2Response> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateInvoiceV2Response>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateInvoiceV2");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateMerchantResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateMerchant");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *第三方子商户电子记账本创建接口
     * @param req CreateOpenBankExternalSubMerchantAccountBookRequest
     * @return CreateOpenBankExternalSubMerchantAccountBookResponse
     * @throws TencentCloudSDKException
     */
    public CreateOpenBankExternalSubMerchantAccountBookResponse CreateOpenBankExternalSubMerchantAccountBook(CreateOpenBankExternalSubMerchantAccountBookRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateOpenBankExternalSubMerchantAccountBookResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateOpenBankExternalSubMerchantAccountBookResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateOpenBankExternalSubMerchantAccountBook");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云企付-子商户进件
     * @param req CreateOpenBankExternalSubMerchantRegistrationRequest
     * @return CreateOpenBankExternalSubMerchantRegistrationResponse
     * @throws TencentCloudSDKException
     */
    public CreateOpenBankExternalSubMerchantRegistrationResponse CreateOpenBankExternalSubMerchantRegistration(CreateOpenBankExternalSubMerchantRegistrationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateOpenBankExternalSubMerchantRegistrationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateOpenBankExternalSubMerchantRegistrationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateOpenBankExternalSubMerchantRegistration");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云企付-创建商户
     * @param req CreateOpenBankMerchantRequest
     * @return CreateOpenBankMerchantResponse
     * @throws TencentCloudSDKException
     */
    public CreateOpenBankMerchantResponse CreateOpenBankMerchant(CreateOpenBankMerchantRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateOpenBankMerchantResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateOpenBankMerchantResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateOpenBankMerchant");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云企付-创建支付订单
     * @param req CreateOpenBankPaymentOrderRequest
     * @return CreateOpenBankPaymentOrderResponse
     * @throws TencentCloudSDKException
     */
    public CreateOpenBankPaymentOrderResponse CreateOpenBankPaymentOrder(CreateOpenBankPaymentOrderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateOpenBankPaymentOrderResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateOpenBankPaymentOrderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateOpenBankPaymentOrder");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云企付-创建充值订单
     * @param req CreateOpenBankRechargeOrderRequest
     * @return CreateOpenBankRechargeOrderResponse
     * @throws TencentCloudSDKException
     */
    public CreateOpenBankRechargeOrderResponse CreateOpenBankRechargeOrder(CreateOpenBankRechargeOrderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateOpenBankRechargeOrderResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateOpenBankRechargeOrderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateOpenBankRechargeOrder");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云鉴-消费订单发起的接口
     * @param req CreateOrderRequest
     * @return CreateOrderResponse
     * @throws TencentCloudSDKException
     */
    public CreateOrderResponse CreateOrder(CreateOrderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateOrderResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateOrderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateOrder");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *商户新增的接口
     * @param req CreatePayMerchantRequest
     * @return CreatePayMerchantResponse
     * @throws TencentCloudSDKException
     */
    public CreatePayMerchantResponse CreatePayMerchant(CreatePayMerchantRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePayMerchantResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePayMerchantResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePayMerchant");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *务工卡-核身预下单
     * @param req CreatePayRollPreOrderRequest
     * @return CreatePayRollPreOrderResponse
     * @throws TencentCloudSDKException
     */
    public CreatePayRollPreOrderResponse CreatePayRollPreOrder(CreatePayRollPreOrderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePayRollPreOrderResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePayRollPreOrderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePayRollPreOrder");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *务工卡-核身预下单带授权
     * @param req CreatePayRollPreOrderWithAuthRequest
     * @return CreatePayRollPreOrderWithAuthResponse
     * @throws TencentCloudSDKException
     */
    public CreatePayRollPreOrderWithAuthResponse CreatePayRollPreOrderWithAuth(CreatePayRollPreOrderWithAuthRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePayRollPreOrderWithAuthResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePayRollPreOrderWithAuthResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePayRollPreOrderWithAuth");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *务工卡-生成授权令牌
     * @param req CreatePayRollTokenRequest
     * @return CreatePayRollTokenResponse
     * @throws TencentCloudSDKException
     */
    public CreatePayRollTokenResponse CreatePayRollToken(CreatePayRollTokenRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePayRollTokenResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePayRollTokenResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePayRollToken");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRedInvoiceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateRedInvoice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *智慧零售-发票红冲V2
     * @param req CreateRedInvoiceV2Request
     * @return CreateRedInvoiceV2Response
     * @throws TencentCloudSDKException
     */
    public CreateRedInvoiceV2Response CreateRedInvoiceV2(CreateRedInvoiceV2Request req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRedInvoiceV2Response> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRedInvoiceV2Response>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateRedInvoiceV2");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *银企直连-单笔支付接口
     * @param req CreateSinglePayRequest
     * @return CreateSinglePayResponse
     * @throws TencentCloudSDKException
     */
    public CreateSinglePayResponse CreateSinglePay(CreateSinglePayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSinglePayResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSinglePayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSinglePay");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *灵云-单笔主播转账接口
     * @param req CreateSinglePaymentRequest
     * @return CreateSinglePaymentResponse
     * @throws TencentCloudSDKException
     */
    public CreateSinglePaymentResponse CreateSinglePayment(CreateSinglePaymentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSinglePaymentResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSinglePaymentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSinglePayment");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *微信商户发起批量转账
     * @param req CreateTransferBatchRequest
     * @return CreateTransferBatchResponse
     * @throws TencentCloudSDKException
     */
    public CreateTransferBatchResponse CreateTransferBatch(CreateTransferBatchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTransferBatchResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTransferBatchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTransferBatch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *直播平台-扣减额度
     * @param req DeduceQuotaRequest
     * @return DeduceQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DeduceQuotaResponse DeduceQuota(DeduceQuotaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeduceQuotaResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeduceQuotaResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeduceQuota");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAgentTaxPaymentInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAgentTaxPaymentInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAgentTaxPaymentInfosResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAgentTaxPaymentInfos");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询充值明细接口
     * @param req DescribeChargeDetailRequest
     * @return DescribeChargeDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeChargeDetailResponse DescribeChargeDetail(DescribeChargeDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeChargeDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeChargeDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeChargeDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询单笔订单交易状态
     * @param req DescribeOrderStatusRequest
     * @return DescribeOrderStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrderStatusResponse DescribeOrderStatus(DescribeOrderStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOrderStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOrderStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOrderStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云支付-分账授权申请查询接口
     * @param req DistributeAccreditQueryRequest
     * @return DistributeAccreditQueryResponse
     * @throws TencentCloudSDKException
     */
    public DistributeAccreditQueryResponse DistributeAccreditQuery(DistributeAccreditQueryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DistributeAccreditQueryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DistributeAccreditQueryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DistributeAccreditQuery");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云支付-分账授权申请接口
     * @param req DistributeAccreditTlinxRequest
     * @return DistributeAccreditTlinxResponse
     * @throws TencentCloudSDKException
     */
    public DistributeAccreditTlinxResponse DistributeAccreditTlinx(DistributeAccreditTlinxRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DistributeAccreditTlinxResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DistributeAccreditTlinxResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DistributeAccreditTlinx");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云支付-分账添加分账接收方接口
     * @param req DistributeAddReceiverRequest
     * @return DistributeAddReceiverResponse
     * @throws TencentCloudSDKException
     */
    public DistributeAddReceiverResponse DistributeAddReceiver(DistributeAddReceiverRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DistributeAddReceiverResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DistributeAddReceiverResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DistributeAddReceiver");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云支付-分账请求接口
     * @param req DistributeApplyRequest
     * @return DistributeApplyResponse
     * @throws TencentCloudSDKException
     */
    public DistributeApplyResponse DistributeApply(DistributeApplyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DistributeApplyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DistributeApplyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DistributeApply");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云支付-分账撤销接口
     * @param req DistributeCancelRequest
     * @return DistributeCancelResponse
     * @throws TencentCloudSDKException
     */
    public DistributeCancelResponse DistributeCancel(DistributeCancelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DistributeCancelResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DistributeCancelResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DistributeCancel");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云支付-分账结果查询接口
     * @param req DistributeQueryRequest
     * @return DistributeQueryResponse
     * @throws TencentCloudSDKException
     */
    public DistributeQueryResponse DistributeQuery(DistributeQueryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DistributeQueryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DistributeQueryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DistributeQuery");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云支付-查询已添加分账接收方接口
     * @param req DistributeQueryReceiverRequest
     * @return DistributeQueryReceiverResponse
     * @throws TencentCloudSDKException
     */
    public DistributeQueryReceiverResponse DistributeQueryReceiver(DistributeQueryReceiverRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DistributeQueryReceiverResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DistributeQueryReceiverResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DistributeQueryReceiver");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云支付-分账解除分账接收方接口
     * @param req DistributeRemoveReceiverRequest
     * @return DistributeRemoveReceiverResponse
     * @throws TencentCloudSDKException
     */
    public DistributeRemoveReceiverResponse DistributeRemoveReceiver(DistributeRemoveReceiverRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DistributeRemoveReceiverResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DistributeRemoveReceiverResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DistributeRemoveReceiver");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DownloadBillResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DownloadBill");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云支付-下载机构文件接口
     * @param req DownloadOrgFileRequest
     * @return DownloadOrgFileResponse
     * @throws TencentCloudSDKException
     */
    public DownloadOrgFileResponse DownloadOrgFile(DownloadOrgFileRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DownloadOrgFileResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DownloadOrgFileResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DownloadOrgFile");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取对账中心账单下载地址的接口
     * @param req DownloadReconciliationUrlRequest
     * @return DownloadReconciliationUrlResponse
     * @throws TencentCloudSDKException
     */
    public DownloadReconciliationUrlResponse DownloadReconciliationUrl(DownloadReconciliationUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DownloadReconciliationUrlResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DownloadReconciliationUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DownloadReconciliationUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *会员间交易接口
     * @param req ExecuteMemberTransactionRequest
     * @return ExecuteMemberTransactionResponse
     * @throws TencentCloudSDKException
     */
    public ExecuteMemberTransactionResponse ExecuteMemberTransaction(ExecuteMemberTransactionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExecuteMemberTransactionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ExecuteMemberTransactionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExecuteMemberTransaction");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *灵云V2-冻结余额
     * @param req FreezeFlexBalanceRequest
     * @return FreezeFlexBalanceResponse
     * @throws TencentCloudSDKException
     */
    public FreezeFlexBalanceResponse FreezeFlexBalance(FreezeFlexBalanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<FreezeFlexBalanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<FreezeFlexBalanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "FreezeFlexBalance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *调用该接口返回对账单下载地址，对账单下载URL通过GET方式访问，返回zip包，解压后为csv格式文件。文件首行如下：
订单号,订单归属日期,机构编号,订单描述,交易类型,订单状态,支付场景,原始金额,折扣金额,实际交易金额,支付渠道优惠金额,抹零金额,币种,下单时间,付款成功时间,商户编号,门店编号,付款方式编号,付款方式名称,商户手续费T1,商户扣率,是否信用卡交易,原始订单号,用户账号,外部订单号,订单备注
     * @param req GetBillDownloadUrlRequest
     * @return GetBillDownloadUrlResponse
     * @throws TencentCloudSDKException
     */
    public GetBillDownloadUrlResponse GetBillDownloadUrl(GetBillDownloadUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetBillDownloadUrlResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetBillDownloadUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetBillDownloadUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *调用该接口返回对账单下载地址，对账单下载URL通过GET方式访问，返回zip包，解压后为csv格式文件。文件首行如下：
商户号,订单号,支付订单号,分账订单总金额,分账详情（通过|分割每笔明细：商户号1#分账金额1|商户号2#分账金额2）,交易手续费承担方商户号,交易手续费,发起时间,分账状态,结算日期,非交易主体分账金额,商户退款订单号,商户分账单号
     * @param req GetDistributeBillDownloadUrlRequest
     * @return GetDistributeBillDownloadUrlResponse
     * @throws TencentCloudSDKException
     */
    public GetDistributeBillDownloadUrlResponse GetDistributeBillDownloadUrl(GetDistributeBillDownloadUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetDistributeBillDownloadUrlResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetDistributeBillDownloadUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetDistributeBillDownloadUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *务工卡-查询授权关系
     * @param req GetPayRollAuthRequest
     * @return GetPayRollAuthResponse
     * @throws TencentCloudSDKException
     */
    public GetPayRollAuthResponse GetPayRollAuth(GetPayRollAuthRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetPayRollAuthResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetPayRollAuthResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetPayRollAuth");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *务工卡-查询核身记录
     * @param req GetPayRollAuthListRequest
     * @return GetPayRollAuthListResponse
     * @throws TencentCloudSDKException
     */
    public GetPayRollAuthListResponse GetPayRollAuthList(GetPayRollAuthListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetPayRollAuthListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetPayRollAuthListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetPayRollAuthList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *务工卡-获取核身结果
     * @param req GetPayRollAuthResultRequest
     * @return GetPayRollAuthResultResponse
     * @throws TencentCloudSDKException
     */
    public GetPayRollAuthResultResponse GetPayRollAuthResult(GetPayRollAuthResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetPayRollAuthResultResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetPayRollAuthResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetPayRollAuthResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *山姆聚合支付项目-存量订单退款接口。可以通过本接口将支付款全部或部分退还给付款方，在收到用户退款请求并且验证成功之后，按照退款规则将支付款按原路退回到支付帐号。
     * @param req MigrateOrderRefundRequest
     * @return MigrateOrderRefundResponse
     * @throws TencentCloudSDKException
     */
    public MigrateOrderRefundResponse MigrateOrderRefund(MigrateOrderRefundRequest req) throws TencentCloudSDKException{
        JsonResponseModel<MigrateOrderRefundResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<MigrateOrderRefundResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "MigrateOrderRefund");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提交退款申请后，通过调用该接口查询退款状态。退款可能有一定延时。
     * @param req MigrateOrderRefundQueryRequest
     * @return MigrateOrderRefundQueryResponse
     * @throws TencentCloudSDKException
     */
    public MigrateOrderRefundQueryResponse MigrateOrderRefundQuery(MigrateOrderRefundQueryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<MigrateOrderRefundQueryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<MigrateOrderRefundQueryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "MigrateOrderRefundQuery");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAgentTaxPaymentInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAgentTaxPaymentInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *灵云-重新绑定账号
     * @param req ModifyBindedAccountRequest
     * @return ModifyBindedAccountResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBindedAccountResponse ModifyBindedAccount(ModifyBindedAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyBindedAccountResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyBindedAccountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyBindedAccount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *灵云V2-收款用户账户权益状态修改
     * @param req ModifyFlexPayeeAccountRightStatusRequest
     * @return ModifyFlexPayeeAccountRightStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFlexPayeeAccountRightStatusResponse ModifyFlexPayeeAccountRightStatus(ModifyFlexPayeeAccountRightStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyFlexPayeeAccountRightStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyFlexPayeeAccountRightStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyFlexPayeeAccountRightStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云鉴-商户信息修改的接口
     * @param req ModifyMerchantRequest
     * @return ModifyMerchantResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMerchantResponse ModifyMerchant(ModifyMerchantRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyMerchantResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyMerchantResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyMerchant");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyMntMbrBindRelateAcctBankCodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyMntMbrBindRelateAcctBankCode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryAcctBindingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryAcctBinding");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryAcctInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryAcctInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryAcctInfoListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryAcctInfoList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *直播平台-查询代理商结算单链接
     * @param req QueryAgentStatementsRequest
     * @return QueryAgentStatementsResponse
     * @throws TencentCloudSDKException
     */
    public QueryAgentStatementsResponse QueryAgentStatements(QueryAgentStatementsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryAgentStatementsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryAgentStatementsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryAgentStatements");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryAgentTaxPaymentBatchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryAgentTaxPaymentBatch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *直播平台-查询主播签约信息
     * @param req QueryAnchorContractInfoRequest
     * @return QueryAnchorContractInfoResponse
     * @throws TencentCloudSDKException
     */
    public QueryAnchorContractInfoResponse QueryAnchorContractInfo(QueryAnchorContractInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryAnchorContractInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryAnchorContractInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryAnchorContractInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *跨境-成功申报材料查询。查询成功入库的申报材料。
     * @param req QueryApplicationMaterialRequest
     * @return QueryApplicationMaterialResponse
     * @throws TencentCloudSDKException
     */
    public QueryApplicationMaterialResponse QueryApplicationMaterial(QueryApplicationMaterialRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryApplicationMaterialResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryApplicationMaterialResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryApplicationMaterial");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *直播平台-查询分配关系
     * @param req QueryAssignmentRequest
     * @return QueryAssignmentResponse
     * @throws TencentCloudSDKException
     */
    public QueryAssignmentResponse QueryAssignment(QueryAssignmentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryAssignmentResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryAssignmentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryAssignment");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryBalanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryBalance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryBankClearResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryBankClear");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryBankTransactionDetailsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryBankTransactionDetails");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryBankWithdrawCashDetailsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryBankWithdrawCashDetails");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *灵云-批量转账结果查询
     * @param req QueryBatchPaymentResultRequest
     * @return QueryBatchPaymentResultResponse
     * @throws TencentCloudSDKException
     */
    public QueryBatchPaymentResultResponse QueryBatchPaymentResult(QueryBatchPaymentResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryBatchPaymentResultResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryBatchPaymentResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryBatchPaymentResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取单笔代发转账对账单下载URL
     * @param req QueryBillDownloadURLRequest
     * @return QueryBillDownloadURLResponse
     * @throws TencentCloudSDKException
     */
    public QueryBillDownloadURLResponse QueryBillDownloadURL(QueryBillDownloadURLRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryBillDownloadURLResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryBillDownloadURLResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryBillDownloadURL");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云支付-查询城市编码接口
     * @param req QueryCityCodeRequest
     * @return QueryCityCodeResponse
     * @throws TencentCloudSDKException
     */
    public QueryCityCodeResponse QueryCityCode(QueryCityCodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryCityCodeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryCityCodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryCityCode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *发起支付等渠道操作后，可以调用该接口查询渠道的数据。
     * @param req QueryCloudChannelDataRequest
     * @return QueryCloudChannelDataResponse
     * @throws TencentCloudSDKException
     */
    public QueryCloudChannelDataResponse QueryCloudChannelData(QueryCloudChannelDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryCloudChannelDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryCloudChannelDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryCloudChannelData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据订单号或用户ID，查询支付订单状态。
     * @param req QueryCloudOrderRequest
     * @return QueryCloudOrderResponse
     * @throws TencentCloudSDKException
     */
    public QueryCloudOrderResponse QueryCloudOrder(QueryCloudOrderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryCloudOrderResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryCloudOrderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryCloudOrder");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提交退款申请后，通过调用该接口查询退款状态。退款可能有一定延时，用微信零钱支付的退款约20分钟内到账，银行卡支付的退款约3个工作日后到账。
     * @param req QueryCloudRefundOrderRequest
     * @return QueryCloudRefundOrderResponse
     * @throws TencentCloudSDKException
     */
    public QueryCloudRefundOrderResponse QueryCloudRefundOrder(QueryCloudRefundOrderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryCloudRefundOrderResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryCloudRefundOrderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryCloudRefundOrder");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryCommonTransferRechargeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryCommonTransferRecharge");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过此接口查询签约数据
     * @param req QueryContractRequest
     * @return QueryContractResponse
     * @throws TencentCloudSDKException
     */
    public QueryContractResponse QueryContract(QueryContractRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryContractResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryContractResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryContract");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云支付-查询支付方式费率及自定义表单项接口
     * @param req QueryContractPayFeeRequest
     * @return QueryContractPayFeeResponse
     * @throws TencentCloudSDKException
     */
    public QueryContractPayFeeResponse QueryContractPayFee(QueryContractPayFeeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryContractPayFeeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryContractPayFeeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryContractPayFee");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云支付-查询合同支付方式列表接口
     * @param req QueryContractPayWayListRequest
     * @return QueryContractPayWayListResponse
     * @throws TencentCloudSDKException
     */
    public QueryContractPayWayListResponse QueryContractPayWayList(QueryContractPayWayListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryContractPayWayListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryContractPayWayListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryContractPayWayList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云支付-查询合同可关联门店接口
     * @param req QueryContractRelateShopRequest
     * @return QueryContractRelateShopResponse
     * @throws TencentCloudSDKException
     */
    public QueryContractRelateShopResponse QueryContractRelateShop(QueryContractRelateShopRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryContractRelateShopResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryContractRelateShopResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryContractRelateShop");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryCustAcctIdBalanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryCustAcctIdBalance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云鉴-查询对账单下载地址的接口
     * @param req QueryDownloadBillURLRequest
     * @return QueryDownloadBillURLResponse
     * @throws TencentCloudSDKException
     */
    public QueryDownloadBillURLResponse QueryDownloadBillURL(QueryDownloadBillURLRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryDownloadBillURLResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryDownloadBillURLResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryDownloadBillURL");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *灵云-查询超额信息
     * @param req QueryExceedingInfoRequest
     * @return QueryExceedingInfoResponse
     * @throws TencentCloudSDKException
     */
    public QueryExceedingInfoResponse QueryExceedingInfo(QueryExceedingInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryExceedingInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryExceedingInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryExceedingInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryExchangeRateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryExchangeRate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *灵云V2-查询税前金额
     * @param req QueryFlexAmountBeforeTaxRequest
     * @return QueryFlexAmountBeforeTaxResponse
     * @throws TencentCloudSDKException
     */
    public QueryFlexAmountBeforeTaxResponse QueryFlexAmountBeforeTax(QueryFlexAmountBeforeTaxRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryFlexAmountBeforeTaxResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryFlexAmountBeforeTaxResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryFlexAmountBeforeTax");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *灵云V2-查询冻结订单列表
     * @param req QueryFlexFreezeOrderListRequest
     * @return QueryFlexFreezeOrderListResponse
     * @throws TencentCloudSDKException
     */
    public QueryFlexFreezeOrderListResponse QueryFlexFreezeOrderList(QueryFlexFreezeOrderListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryFlexFreezeOrderListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryFlexFreezeOrderListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryFlexFreezeOrderList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *灵云V2-收款用户账户余额查询
     * @param req QueryFlexPayeeAccountBalanceRequest
     * @return QueryFlexPayeeAccountBalanceResponse
     * @throws TencentCloudSDKException
     */
    public QueryFlexPayeeAccountBalanceResponse QueryFlexPayeeAccountBalance(QueryFlexPayeeAccountBalanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryFlexPayeeAccountBalanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryFlexPayeeAccountBalanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryFlexPayeeAccountBalance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *灵云V2-收款用户账户信息查询
     * @param req QueryFlexPayeeAccountInfoRequest
     * @return QueryFlexPayeeAccountInfoResponse
     * @throws TencentCloudSDKException
     */
    public QueryFlexPayeeAccountInfoResponse QueryFlexPayeeAccountInfo(QueryFlexPayeeAccountInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryFlexPayeeAccountInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryFlexPayeeAccountInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryFlexPayeeAccountInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *灵云V2-收款用户账户列表查询
     * @param req QueryFlexPayeeAccountListRequest
     * @return QueryFlexPayeeAccountListResponse
     * @throws TencentCloudSDKException
     */
    public QueryFlexPayeeAccountListResponse QueryFlexPayeeAccountList(QueryFlexPayeeAccountListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryFlexPayeeAccountListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryFlexPayeeAccountListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryFlexPayeeAccountList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *灵云V2-收款用户信息查询
     * @param req QueryFlexPayeeInfoRequest
     * @return QueryFlexPayeeInfoResponse
     * @throws TencentCloudSDKException
     */
    public QueryFlexPayeeInfoResponse QueryFlexPayeeInfo(QueryFlexPayeeInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryFlexPayeeInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryFlexPayeeInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryFlexPayeeInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *灵云V2-查询付款订单列表
     * @param req QueryFlexPaymentOrderListRequest
     * @return QueryFlexPaymentOrderListResponse
     * @throws TencentCloudSDKException
     */
    public QueryFlexPaymentOrderListResponse QueryFlexPaymentOrderList(QueryFlexPaymentOrderListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryFlexPaymentOrderListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryFlexPaymentOrderListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryFlexPaymentOrderList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *灵云V2-查询付款订单状态
     * @param req QueryFlexPaymentOrderStatusRequest
     * @return QueryFlexPaymentOrderStatusResponse
     * @throws TencentCloudSDKException
     */
    public QueryFlexPaymentOrderStatusResponse QueryFlexPaymentOrderStatus(QueryFlexPaymentOrderStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryFlexPaymentOrderStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryFlexPaymentOrderStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryFlexPaymentOrderStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *灵云V2-查询结算订单列表
     * @param req QueryFlexSettlementOrderListRequest
     * @return QueryFlexSettlementOrderListResponse
     * @throws TencentCloudSDKException
     */
    public QueryFlexSettlementOrderListResponse QueryFlexSettlementOrderList(QueryFlexSettlementOrderListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryFlexSettlementOrderListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryFlexSettlementOrderListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryFlexSettlementOrderList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *聚鑫-查询会员资金交易信息列表
     * @param req QueryFundsTransactionDetailsRequest
     * @return QueryFundsTransactionDetailsResponse
     * @throws TencentCloudSDKException
     */
    public QueryFundsTransactionDetailsResponse QueryFundsTransactionDetails(QueryFundsTransactionDetailsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryFundsTransactionDetailsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryFundsTransactionDetailsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryFundsTransactionDetails");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryInvoiceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryInvoice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *智慧零售-发票查询V2
     * @param req QueryInvoiceV2Request
     * @return QueryInvoiceV2Response
     * @throws TencentCloudSDKException
     */
    public QueryInvoiceV2Response QueryInvoiceV2(QueryInvoiceV2Request req) throws TencentCloudSDKException{
        JsonResponseModel<QueryInvoiceV2Response> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryInvoiceV2Response>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryInvoiceV2");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *商户恶意注册接口
     * @param req QueryMaliciousRegistrationRequest
     * @return QueryMaliciousRegistrationResponse
     * @throws TencentCloudSDKException
     */
    public QueryMaliciousRegistrationResponse QueryMaliciousRegistration(QueryMaliciousRegistrationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryMaliciousRegistrationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryMaliciousRegistrationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryMaliciousRegistration");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryMemberBindResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryMemberBind");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryMemberTransactionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryMemberTransaction");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *聚鑫-查询会员间交易信息列表
     * @param req QueryMemberTransactionDetailsRequest
     * @return QueryMemberTransactionDetailsResponse
     * @throws TencentCloudSDKException
     */
    public QueryMemberTransactionDetailsResponse QueryMemberTransactionDetails(QueryMemberTransactionDetailsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryMemberTransactionDetailsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryMemberTransactionDetailsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryMemberTransactionDetails");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云鉴-商户信息查询接口
     * @param req QueryMerchantRequest
     * @return QueryMerchantResponse
     * @throws TencentCloudSDKException
     */
    public QueryMerchantResponse QueryMerchant(QueryMerchantRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryMerchantResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryMerchantResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryMerchant");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryMerchantBalanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryMerchantBalance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云支付-查询商户分类接口
     * @param req QueryMerchantClassificationRequest
     * @return QueryMerchantClassificationResponse
     * @throws TencentCloudSDKException
     */
    public QueryMerchantClassificationResponse QueryMerchantClassification(QueryMerchantClassificationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryMerchantClassificationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryMerchantClassificationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryMerchantClassification");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *智慧零售-查询管理端商户
     * @param req QueryMerchantInfoForManagementRequest
     * @return QueryMerchantInfoForManagementResponse
     * @throws TencentCloudSDKException
     */
    public QueryMerchantInfoForManagementResponse QueryMerchantInfoForManagement(QueryMerchantInfoForManagementRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryMerchantInfoForManagementResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryMerchantInfoForManagementResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryMerchantInfoForManagement");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云鉴-消费订单查询接口
     * @param req QueryMerchantOrderRequest
     * @return QueryMerchantOrderResponse
     * @throws TencentCloudSDKException
     */
    public QueryMerchantOrderResponse QueryMerchantOrder(QueryMerchantOrderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryMerchantOrderResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryMerchantOrderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryMerchantOrder");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *商户查询已开通的支付方式列表
     * @param req QueryMerchantPayWayListRequest
     * @return QueryMerchantPayWayListResponse
     * @throws TencentCloudSDKException
     */
    public QueryMerchantPayWayListResponse QueryMerchantPayWayList(QueryMerchantPayWayListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryMerchantPayWayListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryMerchantPayWayListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryMerchantPayWayList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云企付-子商户银行卡余额查询
     * @param req QueryOpenBankBankAccountBalanceRequest
     * @return QueryOpenBankBankAccountBalanceResponse
     * @throws TencentCloudSDKException
     */
    public QueryOpenBankBankAccountBalanceResponse QueryOpenBankBankAccountBalance(QueryOpenBankBankAccountBalanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryOpenBankBankAccountBalanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryOpenBankBankAccountBalanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryOpenBankBankAccountBalance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云企付-查询联行号
     * @param req QueryOpenBankBankBranchListRequest
     * @return QueryOpenBankBankBranchListResponse
     * @throws TencentCloudSDKException
     */
    public QueryOpenBankBankBranchListResponse QueryOpenBankBankBranchList(QueryOpenBankBankBranchListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryOpenBankBankBranchListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryOpenBankBankBranchListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryOpenBankBankBranchList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云企付-子商户银行卡绑定结果查询
     * @param req QueryOpenBankBindExternalSubMerchantBankAccountRequest
     * @return QueryOpenBankBindExternalSubMerchantBankAccountResponse
     * @throws TencentCloudSDKException
     */
    public QueryOpenBankBindExternalSubMerchantBankAccountResponse QueryOpenBankBindExternalSubMerchantBankAccount(QueryOpenBankBindExternalSubMerchantBankAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryOpenBankBindExternalSubMerchantBankAccountResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryOpenBankBindExternalSubMerchantBankAccountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryOpenBankBindExternalSubMerchantBankAccount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云企付-按日期批量查询回单下载地址
     * @param req QueryOpenBankDailyReceiptDownloadUrlRequest
     * @return QueryOpenBankDailyReceiptDownloadUrlResponse
     * @throws TencentCloudSDKException
     */
    public QueryOpenBankDailyReceiptDownloadUrlResponse QueryOpenBankDailyReceiptDownloadUrl(QueryOpenBankDailyReceiptDownloadUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryOpenBankDailyReceiptDownloadUrlResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryOpenBankDailyReceiptDownloadUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryOpenBankDailyReceiptDownloadUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云企付-查询对账单下载地址
     * @param req QueryOpenBankDownLoadUrlRequest
     * @return QueryOpenBankDownLoadUrlResponse
     * @throws TencentCloudSDKException
     */
    public QueryOpenBankDownLoadUrlResponse QueryOpenBankDownLoadUrl(QueryOpenBankDownLoadUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryOpenBankDownLoadUrlResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryOpenBankDownLoadUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryOpenBankDownLoadUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *第三方子商户电子记账本余额查询接口
     * @param req QueryOpenBankExternalSubAccountBookBalanceRequest
     * @return QueryOpenBankExternalSubAccountBookBalanceResponse
     * @throws TencentCloudSDKException
     */
    public QueryOpenBankExternalSubAccountBookBalanceResponse QueryOpenBankExternalSubAccountBookBalance(QueryOpenBankExternalSubAccountBookBalanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryOpenBankExternalSubAccountBookBalanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryOpenBankExternalSubAccountBookBalanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryOpenBankExternalSubAccountBookBalance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云企付-子商户银行卡列表查询
     * @param req QueryOpenBankExternalSubMerchantBankAccountRequest
     * @return QueryOpenBankExternalSubMerchantBankAccountResponse
     * @throws TencentCloudSDKException
     */
    public QueryOpenBankExternalSubMerchantBankAccountResponse QueryOpenBankExternalSubMerchantBankAccount(QueryOpenBankExternalSubMerchantBankAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryOpenBankExternalSubMerchantBankAccountResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryOpenBankExternalSubMerchantBankAccountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryOpenBankExternalSubMerchantBankAccount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云企付-子商户进件结果查询
     * @param req QueryOpenBankExternalSubMerchantRegistrationRequest
     * @return QueryOpenBankExternalSubMerchantRegistrationResponse
     * @throws TencentCloudSDKException
     */
    public QueryOpenBankExternalSubMerchantRegistrationResponse QueryOpenBankExternalSubMerchantRegistration(QueryOpenBankExternalSubMerchantRegistrationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryOpenBankExternalSubMerchantRegistrationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryOpenBankExternalSubMerchantRegistrationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryOpenBankExternalSubMerchantRegistration");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云企付-单笔交易回单申请结果查询
     * @param req QueryOpenBankOrderDetailReceiptInfoRequest
     * @return QueryOpenBankOrderDetailReceiptInfoResponse
     * @throws TencentCloudSDKException
     */
    public QueryOpenBankOrderDetailReceiptInfoResponse QueryOpenBankOrderDetailReceiptInfo(QueryOpenBankOrderDetailReceiptInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryOpenBankOrderDetailReceiptInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryOpenBankOrderDetailReceiptInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryOpenBankOrderDetailReceiptInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云企付-查询订单支付结果
     * @param req QueryOpenBankPaymentOrderRequest
     * @return QueryOpenBankPaymentOrderResponse
     * @throws TencentCloudSDKException
     */
    public QueryOpenBankPaymentOrderResponse QueryOpenBankPaymentOrder(QueryOpenBankPaymentOrderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryOpenBankPaymentOrderResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryOpenBankPaymentOrderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryOpenBankPaymentOrder");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云企付-查询支持银行列表
     * @param req QueryOpenBankSupportBankListRequest
     * @return QueryOpenBankSupportBankListResponse
     * @throws TencentCloudSDKException
     */
    public QueryOpenBankSupportBankListResponse QueryOpenBankSupportBankList(QueryOpenBankSupportBankListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryOpenBankSupportBankListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryOpenBankSupportBankListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryOpenBankSupportBankList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云企付-子商户银行卡解绑结果查询
     * @param req QueryOpenBankUnbindExternalSubMerchantBankAccountRequest
     * @return QueryOpenBankUnbindExternalSubMerchantBankAccountResponse
     * @throws TencentCloudSDKException
     */
    public QueryOpenBankUnbindExternalSubMerchantBankAccountResponse QueryOpenBankUnbindExternalSubMerchantBankAccount(QueryOpenBankUnbindExternalSubMerchantBankAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryOpenBankUnbindExternalSubMerchantBankAccountResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryOpenBankUnbindExternalSubMerchantBankAccountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryOpenBankUnbindExternalSubMerchantBankAccount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryOrderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryOrder");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云支付-查询订单付款状态
     * @param req QueryOrderStatusRequest
     * @return QueryOrderStatusResponse
     * @throws TencentCloudSDKException
     */
    public QueryOrderStatusResponse QueryOrderStatus(QueryOrderStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryOrderStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryOrderStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryOrderStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryOutwardOrderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryOutwardOrder");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryPayerInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryPayerInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryReconciliationDocumentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryReconciliationDocument");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *聚鑫-查询对账文件申请结果
     * @param req QueryReconciliationFileApplyInfoRequest
     * @return QueryReconciliationFileApplyInfoResponse
     * @throws TencentCloudSDKException
     */
    public QueryReconciliationFileApplyInfoResponse QueryReconciliationFileApplyInfo(QueryReconciliationFileApplyInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryReconciliationFileApplyInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryReconciliationFileApplyInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryReconciliationFileApplyInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryRefundResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryRefund");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云支付-获取门店OpenId接口
     * @param req QueryShopOpenIdRequest
     * @return QueryShopOpenIdResponse
     * @throws TencentCloudSDKException
     */
    public QueryShopOpenIdResponse QueryShopOpenId(QueryShopOpenIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryShopOpenIdResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryShopOpenIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryShopOpenId");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *银企直连-单笔支付状态查询接口
     * @param req QuerySinglePayRequest
     * @return QuerySinglePayResponse
     * @throws TencentCloudSDKException
     */
    public QuerySinglePayResponse QuerySinglePay(QuerySinglePayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QuerySinglePayResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QuerySinglePayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QuerySinglePay");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *灵云-单笔转账结果查询
     * @param req QuerySinglePaymentResultRequest
     * @return QuerySinglePaymentResultResponse
     * @throws TencentCloudSDKException
     */
    public QuerySinglePaymentResultResponse QuerySinglePaymentResult(QuerySinglePaymentResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QuerySinglePaymentResultResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QuerySinglePaymentResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QuerySinglePaymentResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QuerySingleTransactionStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QuerySingleTransactionStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QuerySmallAmountTransferResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QuerySmallAmountTransfer");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *跨境-贸易材料明细查询。
     * @param req QueryTradeRequest
     * @return QueryTradeResponse
     * @throws TencentCloudSDKException
     */
    public QueryTradeResponse QueryTrade(QueryTradeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryTradeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryTradeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryTrade");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过商家批次单号或者微信批次号查询批次单
     * @param req QueryTransferBatchRequest
     * @return QueryTransferBatchResponse
     * @throws TencentCloudSDKException
     */
    public QueryTransferBatchResponse QueryTransferBatch(QueryTransferBatchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryTransferBatchResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryTransferBatchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryTransferBatch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过商家或者微信批次明细单号查询明细单
     * @param req QueryTransferDetailRequest
     * @return QueryTransferDetailResponse
     * @throws TencentCloudSDKException
     */
    public QueryTransferDetailResponse QueryTransferDetail(QueryTransferDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryTransferDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryTransferDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryTransferDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *智能代发-单笔代发转账查询接口
     * @param req QueryTransferResultRequest
     * @return QueryTransferResultResponse
     * @throws TencentCloudSDKException
     */
    public QueryTransferResultResponse QueryTransferResult(QueryTransferResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryTransferResultResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryTransferResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryTransferResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *会员在途充值(经第三方支付渠道)接口
     * @param req RechargeByThirdPayRequest
     * @return RechargeByThirdPayResponse
     * @throws TencentCloudSDKException
     */
    public RechargeByThirdPayResponse RechargeByThirdPay(RechargeByThirdPayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RechargeByThirdPayResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RechargeByThirdPayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RechargeByThirdPay");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RechargeMemberThirdPayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RechargeMemberThirdPay");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RefundResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "Refund");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *如交易订单需退款，可以通过本接口将支付款全部或部分退还给付款方，聚鑫将在收到退款请求并且验证成功之后，按照退款规则将支付款按原路退回到支付帐号。最长支持1年的订单退款。在订单包含多个子订单的情况下，如果使用本接口传入OutTradeNo或TransactionId退款，则只支持全单退款；如果需要部分退款，请通过传入子订单的方式来指定部分金额退款。 
     * @param req RefundCloudOrderRequest
     * @return RefundCloudOrderResponse
     * @throws TencentCloudSDKException
     */
    public RefundCloudOrderResponse RefundCloudOrder(RefundCloudOrderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RefundCloudOrderResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RefundCloudOrderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RefundCloudOrder");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *会员间交易退款
     * @param req RefundMemberTransactionRequest
     * @return RefundMemberTransactionResponse
     * @throws TencentCloudSDKException
     */
    public RefundMemberTransactionResponse RefundMemberTransaction(RefundMemberTransactionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RefundMemberTransactionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RefundMemberTransactionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RefundMemberTransaction");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云鉴-消费订单退款的接口
     * @param req RefundOrderRequest
     * @return RefundOrderResponse
     * @throws TencentCloudSDKException
     */
    public RefundOrderResponse RefundOrder(RefundOrderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RefundOrderResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RefundOrderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RefundOrder");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云支付订单退款接口
     * @param req RefundTlinxOrderRequest
     * @return RefundTlinxOrderResponse
     * @throws TencentCloudSDKException
     */
    public RefundTlinxOrderResponse RefundTlinxOrder(RefundTlinxOrderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RefundTlinxOrderResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RefundTlinxOrderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RefundTlinxOrder");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *商户查询是否签约和签约行为上报
     * @param req RegisterBehaviorRequest
     * @return RegisterBehaviorResponse
     * @throws TencentCloudSDKException
     */
    public RegisterBehaviorResponse RegisterBehavior(RegisterBehaviorRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RegisterBehaviorResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RegisterBehaviorResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RegisterBehavior");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *登记挂账(支持撤销)
     * @param req RegisterBillRequest
     * @return RegisterBillResponse
     * @throws TencentCloudSDKException
     */
    public RegisterBillResponse RegisterBill(RegisterBillRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RegisterBillResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RegisterBillResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RegisterBill");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RegisterBillSupportWithdrawResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RegisterBillSupportWithdraw");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RevResigterBillSupportWithdrawResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RevResigterBillSupportWithdraw");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ReviseMbrPropertyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ReviseMbrProperty");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RevokeMemberRechargeThirdPayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RevokeMemberRechargeThirdPay");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *撤销会员在途充值(经第三方支付渠道)接口
     * @param req RevokeRechargeByThirdPayRequest
     * @return RevokeRechargeByThirdPayResponse
     * @throws TencentCloudSDKException
     */
    public RevokeRechargeByThirdPayResponse RevokeRechargeByThirdPay(RevokeRechargeByThirdPayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RevokeRechargeByThirdPayResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RevokeRechargeByThirdPayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RevokeRechargeByThirdPay");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *对于存量的签约关系导入或者部分场景下米大师无法收到签约通知的场景，需要由调用方主动将签约状态同步至米大师
     * @param req SyncContractDataRequest
     * @return SyncContractDataResponse
     * @throws TencentCloudSDKException
     */
    public SyncContractDataResponse SyncContractData(SyncContractDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SyncContractDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SyncContractDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SyncContractData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过此接口进行解约
     * @param req TerminateContractRequest
     * @return TerminateContractResponse
     * @throws TencentCloudSDKException
     */
    public TerminateContractResponse TerminateContract(TerminateContractRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TerminateContractResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<TerminateContractResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TerminateContract");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *智能代发-单笔代发转账接口
     * @param req TransferSinglePayRequest
     * @return TransferSinglePayResponse
     * @throws TencentCloudSDKException
     */
    public TransferSinglePayResponse TransferSinglePay(TransferSinglePayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TransferSinglePayResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<TransferSinglePayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TransferSinglePay");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UnBindAcctResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnBindAcct");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云企付-子商户银行卡解绑
     * @param req UnbindOpenBankExternalSubMerchantBankAccountRequest
     * @return UnbindOpenBankExternalSubMerchantBankAccountResponse
     * @throws TencentCloudSDKException
     */
    public UnbindOpenBankExternalSubMerchantBankAccountResponse UnbindOpenBankExternalSubMerchantBankAccount(UnbindOpenBankExternalSubMerchantBankAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnbindOpenBankExternalSubMerchantBankAccountResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UnbindOpenBankExternalSubMerchantBankAccountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnbindOpenBankExternalSubMerchantBankAccount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UnbindRelateAcctResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnbindRelateAcct");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *应用需要先调用本接口生成支付订单号，并将应答的PayInfo透传给聚鑫SDK，拉起客户端（包括微信公众号/微信小程序/客户端App）支付。
     * @param req UnifiedCloudOrderRequest
     * @return UnifiedCloudOrderResponse
     * @throws TencentCloudSDKException
     */
    public UnifiedCloudOrderResponse UnifiedCloudOrder(UnifiedCloudOrderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnifiedCloudOrderResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UnifiedCloudOrderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnifiedCloudOrder");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UnifiedOrderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnifiedOrder");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云支付-统一下单接口
     * @param req UnifiedTlinxOrderRequest
     * @return UnifiedTlinxOrderResponse
     * @throws TencentCloudSDKException
     */
    public UnifiedTlinxOrderResponse UnifiedTlinxOrder(UnifiedTlinxOrderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnifiedTlinxOrderResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UnifiedTlinxOrderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnifiedTlinxOrder");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *灵云-上传主播信息
     * @param req UploadExternalAnchorInfoRequest
     * @return UploadExternalAnchorInfoResponse
     * @throws TencentCloudSDKException
     */
    public UploadExternalAnchorInfoResponse UploadExternalAnchorInfo(UploadExternalAnchorInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UploadExternalAnchorInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UploadExternalAnchorInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UploadExternalAnchorInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *直播平台-文件上传
     * @param req UploadFileRequest
     * @return UploadFileResponse
     * @throws TencentCloudSDKException
     */
    public UploadFileResponse UploadFile(UploadFileRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UploadFileResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UploadFileResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UploadFile");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云支付-上传机构文件接口
     * @param req UploadOrgFileRequest
     * @return UploadOrgFileResponse
     * @throws TencentCloudSDKException
     */
    public UploadOrgFileResponse UploadOrgFile(UploadOrgFileRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UploadOrgFileResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UploadOrgFileResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UploadOrgFile");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *直播平台-上传代理商完税列表
     * @param req UploadTaxListRequest
     * @return UploadTaxListResponse
     * @throws TencentCloudSDKException
     */
    public UploadTaxListResponse UploadTaxList(UploadTaxListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UploadTaxListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UploadTaxListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UploadTaxList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *直播平台-上传代理商完税证明
     * @param req UploadTaxPaymentRequest
     * @return UploadTaxPaymentResponse
     * @throws TencentCloudSDKException
     */
    public UploadTaxPaymentResponse UploadTaxPayment(UploadTaxPaymentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UploadTaxPaymentResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UploadTaxPaymentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UploadTaxPayment");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云支付-查询合同明细接口
     * @param req ViewContractRequest
     * @return ViewContractResponse
     * @throws TencentCloudSDKException
     */
    public ViewContractResponse ViewContract(ViewContractRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ViewContractResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ViewContractResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ViewContract");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云支付-查询商户明细接口
     * @param req ViewMerchantRequest
     * @return ViewMerchantResponse
     * @throws TencentCloudSDKException
     */
    public ViewMerchantResponse ViewMerchant(ViewMerchantRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ViewMerchantResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ViewMerchantResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ViewMerchant");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云支付-查询门店明细接口
     * @param req ViewShopRequest
     * @return ViewShopResponse
     * @throws TencentCloudSDKException
     */
    public ViewShopResponse ViewShop(ViewShopRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ViewShopResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ViewShopResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ViewShop");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<WithdrawCashMembershipResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "WithdrawCashMembership");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
