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

public class RechargeByThirdPayRequest extends AbstractModel{

    /**
    * 请求类型 此接口固定填：MemberRechargeThirdPayReq
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
    @SerializedName("BankAccountNumber")
    @Expose
    private String BankAccountNumber;

    /**
    * 平台短号(银行分配)
    */
    @SerializedName("PlatformShortNumber")
    @Expose
    private String PlatformShortNumber;

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
    @SerializedName("TransSequenceNumber")
    @Expose
    private String TransSequenceNumber;

    /**
    * 子账户账号
    */
    @SerializedName("BankSubAccountNumber")
    @Expose
    private String BankSubAccountNumber;

    /**
    * 交易手续费，以元为单位
    */
    @SerializedName("TransFee")
    @Expose
    private String TransFee;

    /**
    * 第三方支付渠道类型 0001-微信 0002-支付宝 0003-京东支付
    */
    @SerializedName("ThirdPayChannel")
    @Expose
    private String ThirdPayChannel;

    /**
    * 第三方渠道商户号
    */
    @SerializedName("ThirdPayChannelMerchantCode")
    @Expose
    private String ThirdPayChannelMerchantCode;

    /**
    * 第三方渠道订单号或流水号
    */
    @SerializedName("ThirdPayChannelOrderId")
    @Expose
    private String ThirdPayChannelOrderId;

    /**
    * 交易金额
    */
    @SerializedName("CurrencyAmount")
    @Expose
    private String CurrencyAmount;

    /**
    * 单位，1：元，2：角，3：分
    */
    @SerializedName("CurrencyUnit")
    @Expose
    private String CurrencyUnit;

    /**
    * 币种
    */
    @SerializedName("CurrencyType")
    @Expose
    private String CurrencyType;

    /**
    * 交易网会员代码
    */
    @SerializedName("TransNetMemberCode")
    @Expose
    private String TransNetMemberCode;

    /**
    * midas环境参数
    */
    @SerializedName("MidasEnvironment")
    @Expose
    private String MidasEnvironment;

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
     * Get 请求类型 此接口固定填：MemberRechargeThirdPayReq 
     * @return RequestType 请求类型 此接口固定填：MemberRechargeThirdPayReq
     */
    public String getRequestType() {
        return this.RequestType;
    }

    /**
     * Set 请求类型 此接口固定填：MemberRechargeThirdPayReq
     * @param RequestType 请求类型 此接口固定填：MemberRechargeThirdPayReq
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
     * Get 子账户账号 
     * @return BankSubAccountNumber 子账户账号
     */
    public String getBankSubAccountNumber() {
        return this.BankSubAccountNumber;
    }

    /**
     * Set 子账户账号
     * @param BankSubAccountNumber 子账户账号
     */
    public void setBankSubAccountNumber(String BankSubAccountNumber) {
        this.BankSubAccountNumber = BankSubAccountNumber;
    }

    /**
     * Get 交易手续费，以元为单位 
     * @return TransFee 交易手续费，以元为单位
     */
    public String getTransFee() {
        return this.TransFee;
    }

    /**
     * Set 交易手续费，以元为单位
     * @param TransFee 交易手续费，以元为单位
     */
    public void setTransFee(String TransFee) {
        this.TransFee = TransFee;
    }

    /**
     * Get 第三方支付渠道类型 0001-微信 0002-支付宝 0003-京东支付 
     * @return ThirdPayChannel 第三方支付渠道类型 0001-微信 0002-支付宝 0003-京东支付
     */
    public String getThirdPayChannel() {
        return this.ThirdPayChannel;
    }

    /**
     * Set 第三方支付渠道类型 0001-微信 0002-支付宝 0003-京东支付
     * @param ThirdPayChannel 第三方支付渠道类型 0001-微信 0002-支付宝 0003-京东支付
     */
    public void setThirdPayChannel(String ThirdPayChannel) {
        this.ThirdPayChannel = ThirdPayChannel;
    }

    /**
     * Get 第三方渠道商户号 
     * @return ThirdPayChannelMerchantCode 第三方渠道商户号
     */
    public String getThirdPayChannelMerchantCode() {
        return this.ThirdPayChannelMerchantCode;
    }

    /**
     * Set 第三方渠道商户号
     * @param ThirdPayChannelMerchantCode 第三方渠道商户号
     */
    public void setThirdPayChannelMerchantCode(String ThirdPayChannelMerchantCode) {
        this.ThirdPayChannelMerchantCode = ThirdPayChannelMerchantCode;
    }

    /**
     * Get 第三方渠道订单号或流水号 
     * @return ThirdPayChannelOrderId 第三方渠道订单号或流水号
     */
    public String getThirdPayChannelOrderId() {
        return this.ThirdPayChannelOrderId;
    }

    /**
     * Set 第三方渠道订单号或流水号
     * @param ThirdPayChannelOrderId 第三方渠道订单号或流水号
     */
    public void setThirdPayChannelOrderId(String ThirdPayChannelOrderId) {
        this.ThirdPayChannelOrderId = ThirdPayChannelOrderId;
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
     * Get 单位，1：元，2：角，3：分 
     * @return CurrencyUnit 单位，1：元，2：角，3：分
     */
    public String getCurrencyUnit() {
        return this.CurrencyUnit;
    }

    /**
     * Set 单位，1：元，2：角，3：分
     * @param CurrencyUnit 单位，1：元，2：角，3：分
     */
    public void setCurrencyUnit(String CurrencyUnit) {
        this.CurrencyUnit = CurrencyUnit;
    }

    /**
     * Get 币种 
     * @return CurrencyType 币种
     */
    public String getCurrencyType() {
        return this.CurrencyType;
    }

    /**
     * Set 币种
     * @param CurrencyType 币种
     */
    public void setCurrencyType(String CurrencyType) {
        this.CurrencyType = CurrencyType;
    }

    /**
     * Get 交易网会员代码 
     * @return TransNetMemberCode 交易网会员代码
     */
    public String getTransNetMemberCode() {
        return this.TransNetMemberCode;
    }

    /**
     * Set 交易网会员代码
     * @param TransNetMemberCode 交易网会员代码
     */
    public void setTransNetMemberCode(String TransNetMemberCode) {
        this.TransNetMemberCode = TransNetMemberCode;
    }

    /**
     * Get midas环境参数 
     * @return MidasEnvironment midas环境参数
     */
    public String getMidasEnvironment() {
        return this.MidasEnvironment;
    }

    /**
     * Set midas环境参数
     * @param MidasEnvironment midas环境参数
     */
    public void setMidasEnvironment(String MidasEnvironment) {
        this.MidasEnvironment = MidasEnvironment;
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

    public RechargeByThirdPayRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RechargeByThirdPayRequest(RechargeByThirdPayRequest source) {
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
        if (source.BankAccountNumber != null) {
            this.BankAccountNumber = new String(source.BankAccountNumber);
        }
        if (source.PlatformShortNumber != null) {
            this.PlatformShortNumber = new String(source.PlatformShortNumber);
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
        if (source.TransSequenceNumber != null) {
            this.TransSequenceNumber = new String(source.TransSequenceNumber);
        }
        if (source.BankSubAccountNumber != null) {
            this.BankSubAccountNumber = new String(source.BankSubAccountNumber);
        }
        if (source.TransFee != null) {
            this.TransFee = new String(source.TransFee);
        }
        if (source.ThirdPayChannel != null) {
            this.ThirdPayChannel = new String(source.ThirdPayChannel);
        }
        if (source.ThirdPayChannelMerchantCode != null) {
            this.ThirdPayChannelMerchantCode = new String(source.ThirdPayChannelMerchantCode);
        }
        if (source.ThirdPayChannelOrderId != null) {
            this.ThirdPayChannelOrderId = new String(source.ThirdPayChannelOrderId);
        }
        if (source.CurrencyAmount != null) {
            this.CurrencyAmount = new String(source.CurrencyAmount);
        }
        if (source.CurrencyUnit != null) {
            this.CurrencyUnit = new String(source.CurrencyUnit);
        }
        if (source.CurrencyType != null) {
            this.CurrencyType = new String(source.CurrencyType);
        }
        if (source.TransNetMemberCode != null) {
            this.TransNetMemberCode = new String(source.TransNetMemberCode);
        }
        if (source.MidasEnvironment != null) {
            this.MidasEnvironment = new String(source.MidasEnvironment);
        }
        if (source.ReservedMessage != null) {
            this.ReservedMessage = new String(source.ReservedMessage);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
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
        this.setParamSimple(map, prefix + "BankAccountNumber", this.BankAccountNumber);
        this.setParamSimple(map, prefix + "PlatformShortNumber", this.PlatformShortNumber);
        this.setParamSimple(map, prefix + "MidasSecretId", this.MidasSecretId);
        this.setParamSimple(map, prefix + "MidasAppId", this.MidasAppId);
        this.setParamSimple(map, prefix + "MidasSignature", this.MidasSignature);
        this.setParamSimple(map, prefix + "TransSequenceNumber", this.TransSequenceNumber);
        this.setParamSimple(map, prefix + "BankSubAccountNumber", this.BankSubAccountNumber);
        this.setParamSimple(map, prefix + "TransFee", this.TransFee);
        this.setParamSimple(map, prefix + "ThirdPayChannel", this.ThirdPayChannel);
        this.setParamSimple(map, prefix + "ThirdPayChannelMerchantCode", this.ThirdPayChannelMerchantCode);
        this.setParamSimple(map, prefix + "ThirdPayChannelOrderId", this.ThirdPayChannelOrderId);
        this.setParamSimple(map, prefix + "CurrencyAmount", this.CurrencyAmount);
        this.setParamSimple(map, prefix + "CurrencyUnit", this.CurrencyUnit);
        this.setParamSimple(map, prefix + "CurrencyType", this.CurrencyType);
        this.setParamSimple(map, prefix + "TransNetMemberCode", this.TransNetMemberCode);
        this.setParamSimple(map, prefix + "MidasEnvironment", this.MidasEnvironment);
        this.setParamSimple(map, prefix + "ReservedMessage", this.ReservedMessage);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

