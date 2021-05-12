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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegisterBillRequest extends AbstractModel{

    /**
    * 请求类型此接口固定填：RegBillSupportWithdrawReq
    */
    @SerializedName("RequestType")
    @Expose
    private String RequestType;

    /**
    * 商户号
    */
    @SerializedName("MerchantCode")
    @Expose
    private String MerchantCode;

    /**
    * 支付渠道
    */
    @SerializedName("PayChannel")
    @Expose
    private String PayChannel;

    /**
    * 子渠道
    */
    @SerializedName("PayChannelSubId")
    @Expose
    private Long PayChannelSubId;

    /**
    * 交易订单号
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * 父账户账号，资金汇总账号
    */
    @SerializedName("BankAccountNo")
    @Expose
    private String BankAccountNo;

    /**
    * 平台短号(银行分配)
    */
    @SerializedName("PlatformShortNo")
    @Expose
    private String PlatformShortNo;

    /**
    * 聚鑫分配的安全ID
    */
    @SerializedName("MidasSecretId")
    @Expose
    private String MidasSecretId;

    /**
    * 聚鑫分配的支付主MidasAppId
    */
    @SerializedName("MidasAppId")
    @Expose
    private String MidasAppId;

    /**
    * 计费签名
    */
    @SerializedName("MidasSignature")
    @Expose
    private String MidasSignature;

    /**
    * 交易流水号
    */
    @SerializedName("TransSeqNo")
    @Expose
    private String TransSeqNo;

    /**
    * 暂未使用，默认传0.0
    */
    @SerializedName("TranFee")
    @Expose
    private String TranFee;

    /**
    * 挂账金额，以元为单位
    */
    @SerializedName("OrderAmt")
    @Expose
    private String OrderAmt;

    /**
    * 子账户账号
    */
    @SerializedName("BankSubAccountNo")
    @Expose
    private String BankSubAccountNo;

    /**
    * 交易网会员代码
    */
    @SerializedName("TranNetMemberCode")
    @Expose
    private String TranNetMemberCode;

    /**
    * 0,登记挂账，1，撤销挂账
    */
    @SerializedName("TranType")
    @Expose
    private String TranType;

    /**
    * 保留域
    */
    @SerializedName("ReservedMessage")
    @Expose
    private String ReservedMessage;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Midas环境参数
    */
    @SerializedName("MidasEnvironment")
    @Expose
    private String MidasEnvironment;

    /**
     * Get 请求类型此接口固定填：RegBillSupportWithdrawReq 
     * @return RequestType 请求类型此接口固定填：RegBillSupportWithdrawReq
     */
    public String getRequestType() {
        return this.RequestType;
    }

    /**
     * Set 请求类型此接口固定填：RegBillSupportWithdrawReq
     * @param RequestType 请求类型此接口固定填：RegBillSupportWithdrawReq
     */
    public void setRequestType(String RequestType) {
        this.RequestType = RequestType;
    }

    /**
     * Get 商户号 
     * @return MerchantCode 商户号
     */
    public String getMerchantCode() {
        return this.MerchantCode;
    }

    /**
     * Set 商户号
     * @param MerchantCode 商户号
     */
    public void setMerchantCode(String MerchantCode) {
        this.MerchantCode = MerchantCode;
    }

    /**
     * Get 支付渠道 
     * @return PayChannel 支付渠道
     */
    public String getPayChannel() {
        return this.PayChannel;
    }

    /**
     * Set 支付渠道
     * @param PayChannel 支付渠道
     */
    public void setPayChannel(String PayChannel) {
        this.PayChannel = PayChannel;
    }

    /**
     * Get 子渠道 
     * @return PayChannelSubId 子渠道
     */
    public Long getPayChannelSubId() {
        return this.PayChannelSubId;
    }

    /**
     * Set 子渠道
     * @param PayChannelSubId 子渠道
     */
    public void setPayChannelSubId(Long PayChannelSubId) {
        this.PayChannelSubId = PayChannelSubId;
    }

    /**
     * Get 交易订单号 
     * @return OrderId 交易订单号
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 交易订单号
     * @param OrderId 交易订单号
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get 父账户账号，资金汇总账号 
     * @return BankAccountNo 父账户账号，资金汇总账号
     */
    public String getBankAccountNo() {
        return this.BankAccountNo;
    }

    /**
     * Set 父账户账号，资金汇总账号
     * @param BankAccountNo 父账户账号，资金汇总账号
     */
    public void setBankAccountNo(String BankAccountNo) {
        this.BankAccountNo = BankAccountNo;
    }

    /**
     * Get 平台短号(银行分配) 
     * @return PlatformShortNo 平台短号(银行分配)
     */
    public String getPlatformShortNo() {
        return this.PlatformShortNo;
    }

    /**
     * Set 平台短号(银行分配)
     * @param PlatformShortNo 平台短号(银行分配)
     */
    public void setPlatformShortNo(String PlatformShortNo) {
        this.PlatformShortNo = PlatformShortNo;
    }

    /**
     * Get 聚鑫分配的安全ID 
     * @return MidasSecretId 聚鑫分配的安全ID
     */
    public String getMidasSecretId() {
        return this.MidasSecretId;
    }

    /**
     * Set 聚鑫分配的安全ID
     * @param MidasSecretId 聚鑫分配的安全ID
     */
    public void setMidasSecretId(String MidasSecretId) {
        this.MidasSecretId = MidasSecretId;
    }

    /**
     * Get 聚鑫分配的支付主MidasAppId 
     * @return MidasAppId 聚鑫分配的支付主MidasAppId
     */
    public String getMidasAppId() {
        return this.MidasAppId;
    }

    /**
     * Set 聚鑫分配的支付主MidasAppId
     * @param MidasAppId 聚鑫分配的支付主MidasAppId
     */
    public void setMidasAppId(String MidasAppId) {
        this.MidasAppId = MidasAppId;
    }

    /**
     * Get 计费签名 
     * @return MidasSignature 计费签名
     */
    public String getMidasSignature() {
        return this.MidasSignature;
    }

    /**
     * Set 计费签名
     * @param MidasSignature 计费签名
     */
    public void setMidasSignature(String MidasSignature) {
        this.MidasSignature = MidasSignature;
    }

    /**
     * Get 交易流水号 
     * @return TransSeqNo 交易流水号
     */
    public String getTransSeqNo() {
        return this.TransSeqNo;
    }

    /**
     * Set 交易流水号
     * @param TransSeqNo 交易流水号
     */
    public void setTransSeqNo(String TransSeqNo) {
        this.TransSeqNo = TransSeqNo;
    }

    /**
     * Get 暂未使用，默认传0.0 
     * @return TranFee 暂未使用，默认传0.0
     */
    public String getTranFee() {
        return this.TranFee;
    }

    /**
     * Set 暂未使用，默认传0.0
     * @param TranFee 暂未使用，默认传0.0
     */
    public void setTranFee(String TranFee) {
        this.TranFee = TranFee;
    }

    /**
     * Get 挂账金额，以元为单位 
     * @return OrderAmt 挂账金额，以元为单位
     */
    public String getOrderAmt() {
        return this.OrderAmt;
    }

    /**
     * Set 挂账金额，以元为单位
     * @param OrderAmt 挂账金额，以元为单位
     */
    public void setOrderAmt(String OrderAmt) {
        this.OrderAmt = OrderAmt;
    }

    /**
     * Get 子账户账号 
     * @return BankSubAccountNo 子账户账号
     */
    public String getBankSubAccountNo() {
        return this.BankSubAccountNo;
    }

    /**
     * Set 子账户账号
     * @param BankSubAccountNo 子账户账号
     */
    public void setBankSubAccountNo(String BankSubAccountNo) {
        this.BankSubAccountNo = BankSubAccountNo;
    }

    /**
     * Get 交易网会员代码 
     * @return TranNetMemberCode 交易网会员代码
     */
    public String getTranNetMemberCode() {
        return this.TranNetMemberCode;
    }

    /**
     * Set 交易网会员代码
     * @param TranNetMemberCode 交易网会员代码
     */
    public void setTranNetMemberCode(String TranNetMemberCode) {
        this.TranNetMemberCode = TranNetMemberCode;
    }

    /**
     * Get 0,登记挂账，1，撤销挂账 
     * @return TranType 0,登记挂账，1，撤销挂账
     */
    public String getTranType() {
        return this.TranType;
    }

    /**
     * Set 0,登记挂账，1，撤销挂账
     * @param TranType 0,登记挂账，1，撤销挂账
     */
    public void setTranType(String TranType) {
        this.TranType = TranType;
    }

    /**
     * Get 保留域 
     * @return ReservedMessage 保留域
     */
    public String getReservedMessage() {
        return this.ReservedMessage;
    }

    /**
     * Set 保留域
     * @param ReservedMessage 保留域
     */
    public void setReservedMessage(String ReservedMessage) {
        this.ReservedMessage = ReservedMessage;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Midas环境参数 
     * @return MidasEnvironment Midas环境参数
     */
    public String getMidasEnvironment() {
        return this.MidasEnvironment;
    }

    /**
     * Set Midas环境参数
     * @param MidasEnvironment Midas环境参数
     */
    public void setMidasEnvironment(String MidasEnvironment) {
        this.MidasEnvironment = MidasEnvironment;
    }

    public RegisterBillRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegisterBillRequest(RegisterBillRequest source) {
        if (source.RequestType != null) {
            this.RequestType = new String(source.RequestType);
        }
        if (source.MerchantCode != null) {
            this.MerchantCode = new String(source.MerchantCode);
        }
        if (source.PayChannel != null) {
            this.PayChannel = new String(source.PayChannel);
        }
        if (source.PayChannelSubId != null) {
            this.PayChannelSubId = new Long(source.PayChannelSubId);
        }
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.BankAccountNo != null) {
            this.BankAccountNo = new String(source.BankAccountNo);
        }
        if (source.PlatformShortNo != null) {
            this.PlatformShortNo = new String(source.PlatformShortNo);
        }
        if (source.MidasSecretId != null) {
            this.MidasSecretId = new String(source.MidasSecretId);
        }
        if (source.MidasAppId != null) {
            this.MidasAppId = new String(source.MidasAppId);
        }
        if (source.MidasSignature != null) {
            this.MidasSignature = new String(source.MidasSignature);
        }
        if (source.TransSeqNo != null) {
            this.TransSeqNo = new String(source.TransSeqNo);
        }
        if (source.TranFee != null) {
            this.TranFee = new String(source.TranFee);
        }
        if (source.OrderAmt != null) {
            this.OrderAmt = new String(source.OrderAmt);
        }
        if (source.BankSubAccountNo != null) {
            this.BankSubAccountNo = new String(source.BankSubAccountNo);
        }
        if (source.TranNetMemberCode != null) {
            this.TranNetMemberCode = new String(source.TranNetMemberCode);
        }
        if (source.TranType != null) {
            this.TranType = new String(source.TranType);
        }
        if (source.ReservedMessage != null) {
            this.ReservedMessage = new String(source.ReservedMessage);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.MidasEnvironment != null) {
            this.MidasEnvironment = new String(source.MidasEnvironment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RequestType", this.RequestType);
        this.setParamSimple(map, prefix + "MerchantCode", this.MerchantCode);
        this.setParamSimple(map, prefix + "PayChannel", this.PayChannel);
        this.setParamSimple(map, prefix + "PayChannelSubId", this.PayChannelSubId);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "BankAccountNo", this.BankAccountNo);
        this.setParamSimple(map, prefix + "PlatformShortNo", this.PlatformShortNo);
        this.setParamSimple(map, prefix + "MidasSecretId", this.MidasSecretId);
        this.setParamSimple(map, prefix + "MidasAppId", this.MidasAppId);
        this.setParamSimple(map, prefix + "MidasSignature", this.MidasSignature);
        this.setParamSimple(map, prefix + "TransSeqNo", this.TransSeqNo);
        this.setParamSimple(map, prefix + "TranFee", this.TranFee);
        this.setParamSimple(map, prefix + "OrderAmt", this.OrderAmt);
        this.setParamSimple(map, prefix + "BankSubAccountNo", this.BankSubAccountNo);
        this.setParamSimple(map, prefix + "TranNetMemberCode", this.TranNetMemberCode);
        this.setParamSimple(map, prefix + "TranType", this.TranType);
        this.setParamSimple(map, prefix + "ReservedMessage", this.ReservedMessage);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "MidasEnvironment", this.MidasEnvironment);

    }
}

