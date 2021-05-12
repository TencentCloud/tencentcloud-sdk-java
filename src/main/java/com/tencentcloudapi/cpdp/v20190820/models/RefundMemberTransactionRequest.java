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

public class RefundMemberTransactionRequest extends AbstractModel{

    /**
    * 转出见证子账户的户名
    */
    @SerializedName("OutSubAccountName")
    @Expose
    private String OutSubAccountName;

    /**
    * 转入见证子账户的户名
    */
    @SerializedName("InSubAccountName")
    @Expose
    private String InSubAccountName;

    /**
    * 子渠道
    */
    @SerializedName("PayChannelSubId")
    @Expose
    private Long PayChannelSubId;

    /**
    * 转出见证子账户账号
    */
    @SerializedName("OutSubAccountNumber")
    @Expose
    private String OutSubAccountNumber;

    /**
    * 计费签名
    */
    @SerializedName("MidasSignature")
    @Expose
    private String MidasSignature;

    /**
    * 转入见证子账户账号
    */
    @SerializedName("InSubAccountNumber")
    @Expose
    private String InSubAccountNumber;

    /**
    * 聚鑫分配的安全ID
    */
    @SerializedName("MidasSecretId")
    @Expose
    private String MidasSecretId;

    /**
    * 父账户账号，资金汇总账号
    */
    @SerializedName("BankAccountNumber")
    @Expose
    private String BankAccountNumber;

    /**
    * 原老订单流水号
    */
    @SerializedName("OldTransSequenceNumber")
    @Expose
    private String OldTransSequenceNumber;

    /**
    * 银行注册商户号
    */
    @SerializedName("MerchantCode")
    @Expose
    private String MerchantCode;

    /**
    * 请求类型，固定为MemberTransactionRefundReq
    */
    @SerializedName("RequestType")
    @Expose
    private String RequestType;

    /**
    * 交易金额
    */
    @SerializedName("CurrencyAmount")
    @Expose
    private String CurrencyAmount;

    /**
    * 交易流水号
    */
    @SerializedName("TransSequenceNumber")
    @Expose
    private String TransSequenceNumber;

    /**
    * 渠道
    */
    @SerializedName("PayChannel")
    @Expose
    private String PayChannel;

    /**
    * 原订单号
    */
    @SerializedName("OldOrderId")
    @Expose
    private String OldOrderId;

    /**
    * 聚鑫分配的支付主MidasAppId
    */
    @SerializedName("MidasAppId")
    @Expose
    private String MidasAppId;

    /**
    * 订单号
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * Midas环境标识 release 现网环境 sandbox 沙箱环境
development 开发环境
    */
    @SerializedName("MidasEnvironment")
    @Expose
    private String MidasEnvironment;

    /**
    * 转出子账户交易网会员代码
    */
    @SerializedName("OutTransNetMemberCode")
    @Expose
    private String OutTransNetMemberCode;

    /**
    * 转入子账户交易网会员代码
    */
    @SerializedName("InTransNetMemberCode")
    @Expose
    private String InTransNetMemberCode;

    /**
    * 保留域
    */
    @SerializedName("ReservedMessage")
    @Expose
    private String ReservedMessage;

    /**
    * 平台短号(银行分配)
    */
    @SerializedName("PlatformShortNumber")
    @Expose
    private String PlatformShortNumber;

    /**
    * 0-登记挂账，1-撤销挂账
    */
    @SerializedName("TransType")
    @Expose
    private String TransType;

    /**
    * 交易手续费
    */
    @SerializedName("TransFee")
    @Expose
    private String TransFee;

    /**
     * Get 转出见证子账户的户名 
     * @return OutSubAccountName 转出见证子账户的户名
     */
    public String getOutSubAccountName() {
        return this.OutSubAccountName;
    }

    /**
     * Set 转出见证子账户的户名
     * @param OutSubAccountName 转出见证子账户的户名
     */
    public void setOutSubAccountName(String OutSubAccountName) {
        this.OutSubAccountName = OutSubAccountName;
    }

    /**
     * Get 转入见证子账户的户名 
     * @return InSubAccountName 转入见证子账户的户名
     */
    public String getInSubAccountName() {
        return this.InSubAccountName;
    }

    /**
     * Set 转入见证子账户的户名
     * @param InSubAccountName 转入见证子账户的户名
     */
    public void setInSubAccountName(String InSubAccountName) {
        this.InSubAccountName = InSubAccountName;
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
     * Get 转出见证子账户账号 
     * @return OutSubAccountNumber 转出见证子账户账号
     */
    public String getOutSubAccountNumber() {
        return this.OutSubAccountNumber;
    }

    /**
     * Set 转出见证子账户账号
     * @param OutSubAccountNumber 转出见证子账户账号
     */
    public void setOutSubAccountNumber(String OutSubAccountNumber) {
        this.OutSubAccountNumber = OutSubAccountNumber;
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
     * Get 转入见证子账户账号 
     * @return InSubAccountNumber 转入见证子账户账号
     */
    public String getInSubAccountNumber() {
        return this.InSubAccountNumber;
    }

    /**
     * Set 转入见证子账户账号
     * @param InSubAccountNumber 转入见证子账户账号
     */
    public void setInSubAccountNumber(String InSubAccountNumber) {
        this.InSubAccountNumber = InSubAccountNumber;
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
     * Get 父账户账号，资金汇总账号 
     * @return BankAccountNumber 父账户账号，资金汇总账号
     */
    public String getBankAccountNumber() {
        return this.BankAccountNumber;
    }

    /**
     * Set 父账户账号，资金汇总账号
     * @param BankAccountNumber 父账户账号，资金汇总账号
     */
    public void setBankAccountNumber(String BankAccountNumber) {
        this.BankAccountNumber = BankAccountNumber;
    }

    /**
     * Get 原老订单流水号 
     * @return OldTransSequenceNumber 原老订单流水号
     */
    public String getOldTransSequenceNumber() {
        return this.OldTransSequenceNumber;
    }

    /**
     * Set 原老订单流水号
     * @param OldTransSequenceNumber 原老订单流水号
     */
    public void setOldTransSequenceNumber(String OldTransSequenceNumber) {
        this.OldTransSequenceNumber = OldTransSequenceNumber;
    }

    /**
     * Get 银行注册商户号 
     * @return MerchantCode 银行注册商户号
     */
    public String getMerchantCode() {
        return this.MerchantCode;
    }

    /**
     * Set 银行注册商户号
     * @param MerchantCode 银行注册商户号
     */
    public void setMerchantCode(String MerchantCode) {
        this.MerchantCode = MerchantCode;
    }

    /**
     * Get 请求类型，固定为MemberTransactionRefundReq 
     * @return RequestType 请求类型，固定为MemberTransactionRefundReq
     */
    public String getRequestType() {
        return this.RequestType;
    }

    /**
     * Set 请求类型，固定为MemberTransactionRefundReq
     * @param RequestType 请求类型，固定为MemberTransactionRefundReq
     */
    public void setRequestType(String RequestType) {
        this.RequestType = RequestType;
    }

    /**
     * Get 交易金额 
     * @return CurrencyAmount 交易金额
     */
    public String getCurrencyAmount() {
        return this.CurrencyAmount;
    }

    /**
     * Set 交易金额
     * @param CurrencyAmount 交易金额
     */
    public void setCurrencyAmount(String CurrencyAmount) {
        this.CurrencyAmount = CurrencyAmount;
    }

    /**
     * Get 交易流水号 
     * @return TransSequenceNumber 交易流水号
     */
    public String getTransSequenceNumber() {
        return this.TransSequenceNumber;
    }

    /**
     * Set 交易流水号
     * @param TransSequenceNumber 交易流水号
     */
    public void setTransSequenceNumber(String TransSequenceNumber) {
        this.TransSequenceNumber = TransSequenceNumber;
    }

    /**
     * Get 渠道 
     * @return PayChannel 渠道
     */
    public String getPayChannel() {
        return this.PayChannel;
    }

    /**
     * Set 渠道
     * @param PayChannel 渠道
     */
    public void setPayChannel(String PayChannel) {
        this.PayChannel = PayChannel;
    }

    /**
     * Get 原订单号 
     * @return OldOrderId 原订单号
     */
    public String getOldOrderId() {
        return this.OldOrderId;
    }

    /**
     * Set 原订单号
     * @param OldOrderId 原订单号
     */
    public void setOldOrderId(String OldOrderId) {
        this.OldOrderId = OldOrderId;
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
     * Get 订单号 
     * @return OrderId 订单号
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 订单号
     * @param OrderId 订单号
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get Midas环境标识 release 现网环境 sandbox 沙箱环境
development 开发环境 
     * @return MidasEnvironment Midas环境标识 release 现网环境 sandbox 沙箱环境
development 开发环境
     */
    public String getMidasEnvironment() {
        return this.MidasEnvironment;
    }

    /**
     * Set Midas环境标识 release 现网环境 sandbox 沙箱环境
development 开发环境
     * @param MidasEnvironment Midas环境标识 release 现网环境 sandbox 沙箱环境
development 开发环境
     */
    public void setMidasEnvironment(String MidasEnvironment) {
        this.MidasEnvironment = MidasEnvironment;
    }

    /**
     * Get 转出子账户交易网会员代码 
     * @return OutTransNetMemberCode 转出子账户交易网会员代码
     */
    public String getOutTransNetMemberCode() {
        return this.OutTransNetMemberCode;
    }

    /**
     * Set 转出子账户交易网会员代码
     * @param OutTransNetMemberCode 转出子账户交易网会员代码
     */
    public void setOutTransNetMemberCode(String OutTransNetMemberCode) {
        this.OutTransNetMemberCode = OutTransNetMemberCode;
    }

    /**
     * Get 转入子账户交易网会员代码 
     * @return InTransNetMemberCode 转入子账户交易网会员代码
     */
    public String getInTransNetMemberCode() {
        return this.InTransNetMemberCode;
    }

    /**
     * Set 转入子账户交易网会员代码
     * @param InTransNetMemberCode 转入子账户交易网会员代码
     */
    public void setInTransNetMemberCode(String InTransNetMemberCode) {
        this.InTransNetMemberCode = InTransNetMemberCode;
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
     * Get 平台短号(银行分配) 
     * @return PlatformShortNumber 平台短号(银行分配)
     */
    public String getPlatformShortNumber() {
        return this.PlatformShortNumber;
    }

    /**
     * Set 平台短号(银行分配)
     * @param PlatformShortNumber 平台短号(银行分配)
     */
    public void setPlatformShortNumber(String PlatformShortNumber) {
        this.PlatformShortNumber = PlatformShortNumber;
    }

    /**
     * Get 0-登记挂账，1-撤销挂账 
     * @return TransType 0-登记挂账，1-撤销挂账
     */
    public String getTransType() {
        return this.TransType;
    }

    /**
     * Set 0-登记挂账，1-撤销挂账
     * @param TransType 0-登记挂账，1-撤销挂账
     */
    public void setTransType(String TransType) {
        this.TransType = TransType;
    }

    /**
     * Get 交易手续费 
     * @return TransFee 交易手续费
     */
    public String getTransFee() {
        return this.TransFee;
    }

    /**
     * Set 交易手续费
     * @param TransFee 交易手续费
     */
    public void setTransFee(String TransFee) {
        this.TransFee = TransFee;
    }

    public RefundMemberTransactionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RefundMemberTransactionRequest(RefundMemberTransactionRequest source) {
        if (source.OutSubAccountName != null) {
            this.OutSubAccountName = new String(source.OutSubAccountName);
        }
        if (source.InSubAccountName != null) {
            this.InSubAccountName = new String(source.InSubAccountName);
        }
        if (source.PayChannelSubId != null) {
            this.PayChannelSubId = new Long(source.PayChannelSubId);
        }
        if (source.OutSubAccountNumber != null) {
            this.OutSubAccountNumber = new String(source.OutSubAccountNumber);
        }
        if (source.MidasSignature != null) {
            this.MidasSignature = new String(source.MidasSignature);
        }
        if (source.InSubAccountNumber != null) {
            this.InSubAccountNumber = new String(source.InSubAccountNumber);
        }
        if (source.MidasSecretId != null) {
            this.MidasSecretId = new String(source.MidasSecretId);
        }
        if (source.BankAccountNumber != null) {
            this.BankAccountNumber = new String(source.BankAccountNumber);
        }
        if (source.OldTransSequenceNumber != null) {
            this.OldTransSequenceNumber = new String(source.OldTransSequenceNumber);
        }
        if (source.MerchantCode != null) {
            this.MerchantCode = new String(source.MerchantCode);
        }
        if (source.RequestType != null) {
            this.RequestType = new String(source.RequestType);
        }
        if (source.CurrencyAmount != null) {
            this.CurrencyAmount = new String(source.CurrencyAmount);
        }
        if (source.TransSequenceNumber != null) {
            this.TransSequenceNumber = new String(source.TransSequenceNumber);
        }
        if (source.PayChannel != null) {
            this.PayChannel = new String(source.PayChannel);
        }
        if (source.OldOrderId != null) {
            this.OldOrderId = new String(source.OldOrderId);
        }
        if (source.MidasAppId != null) {
            this.MidasAppId = new String(source.MidasAppId);
        }
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.MidasEnvironment != null) {
            this.MidasEnvironment = new String(source.MidasEnvironment);
        }
        if (source.OutTransNetMemberCode != null) {
            this.OutTransNetMemberCode = new String(source.OutTransNetMemberCode);
        }
        if (source.InTransNetMemberCode != null) {
            this.InTransNetMemberCode = new String(source.InTransNetMemberCode);
        }
        if (source.ReservedMessage != null) {
            this.ReservedMessage = new String(source.ReservedMessage);
        }
        if (source.PlatformShortNumber != null) {
            this.PlatformShortNumber = new String(source.PlatformShortNumber);
        }
        if (source.TransType != null) {
            this.TransType = new String(source.TransType);
        }
        if (source.TransFee != null) {
            this.TransFee = new String(source.TransFee);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OutSubAccountName", this.OutSubAccountName);
        this.setParamSimple(map, prefix + "InSubAccountName", this.InSubAccountName);
        this.setParamSimple(map, prefix + "PayChannelSubId", this.PayChannelSubId);
        this.setParamSimple(map, prefix + "OutSubAccountNumber", this.OutSubAccountNumber);
        this.setParamSimple(map, prefix + "MidasSignature", this.MidasSignature);
        this.setParamSimple(map, prefix + "InSubAccountNumber", this.InSubAccountNumber);
        this.setParamSimple(map, prefix + "MidasSecretId", this.MidasSecretId);
        this.setParamSimple(map, prefix + "BankAccountNumber", this.BankAccountNumber);
        this.setParamSimple(map, prefix + "OldTransSequenceNumber", this.OldTransSequenceNumber);
        this.setParamSimple(map, prefix + "MerchantCode", this.MerchantCode);
        this.setParamSimple(map, prefix + "RequestType", this.RequestType);
        this.setParamSimple(map, prefix + "CurrencyAmount", this.CurrencyAmount);
        this.setParamSimple(map, prefix + "TransSequenceNumber", this.TransSequenceNumber);
        this.setParamSimple(map, prefix + "PayChannel", this.PayChannel);
        this.setParamSimple(map, prefix + "OldOrderId", this.OldOrderId);
        this.setParamSimple(map, prefix + "MidasAppId", this.MidasAppId);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "MidasEnvironment", this.MidasEnvironment);
        this.setParamSimple(map, prefix + "OutTransNetMemberCode", this.OutTransNetMemberCode);
        this.setParamSimple(map, prefix + "InTransNetMemberCode", this.InTransNetMemberCode);
        this.setParamSimple(map, prefix + "ReservedMessage", this.ReservedMessage);
        this.setParamSimple(map, prefix + "PlatformShortNumber", this.PlatformShortNumber);
        this.setParamSimple(map, prefix + "TransType", this.TransType);
        this.setParamSimple(map, prefix + "TransFee", this.TransFee);

    }
}

