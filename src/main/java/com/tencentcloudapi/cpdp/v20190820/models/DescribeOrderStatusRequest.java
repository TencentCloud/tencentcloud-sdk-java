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

public class DescribeOrderStatusRequest extends AbstractModel{

    /**
    * 请求类型，此接口固定填：QueryOrderStatusReq
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
    * 交易订单号或流水号，提现，充值或会员交易请求时的CnsmrSeqNo值
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
    * 功能标志 0：会员间交易 1：提现 2：充值
    */
    @SerializedName("QueryType")
    @Expose
    private String QueryType;

    /**
    * 银行流水号
    */
    @SerializedName("TransSequenceNumber")
    @Expose
    private String TransSequenceNumber;

    /**
    * 计费签名
    */
    @SerializedName("MidasSignature")
    @Expose
    private String MidasSignature;

    /**
    * 聚鑫分配的支付主MidasAppId
    */
    @SerializedName("MidasAppId")
    @Expose
    private String MidasAppId;

    /**
    * 聚鑫分配的安全ID
    */
    @SerializedName("MidasSecretId")
    @Expose
    private String MidasSecretId;

    /**
    * Midas环境参数
    */
    @SerializedName("MidasEnvironment")
    @Expose
    private String MidasEnvironment;

    /**
    * 保留字段
    */
    @SerializedName("ReservedMessage")
    @Expose
    private String ReservedMessage;

    /**
    * 子账户账号 暂未使用
    */
    @SerializedName("BankSubAccountNumber")
    @Expose
    private String BankSubAccountNumber;

    /**
    * 交易日期 暂未使用
    */
    @SerializedName("TransDate")
    @Expose
    private String TransDate;

    /**
     * Get 请求类型，此接口固定填：QueryOrderStatusReq 
     * @return RequestType 请求类型，此接口固定填：QueryOrderStatusReq
     */
    public String getRequestType() {
        return this.RequestType;
    }

    /**
     * Set 请求类型，此接口固定填：QueryOrderStatusReq
     * @param RequestType 请求类型，此接口固定填：QueryOrderStatusReq
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
     * Get 交易订单号或流水号，提现，充值或会员交易请求时的CnsmrSeqNo值 
     * @return OrderId 交易订单号或流水号，提现，充值或会员交易请求时的CnsmrSeqNo值
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 交易订单号或流水号，提现，充值或会员交易请求时的CnsmrSeqNo值
     * @param OrderId 交易订单号或流水号，提现，充值或会员交易请求时的CnsmrSeqNo值
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
     * Get 功能标志 0：会员间交易 1：提现 2：充值 
     * @return QueryType 功能标志 0：会员间交易 1：提现 2：充值
     */
    public String getQueryType() {
        return this.QueryType;
    }

    /**
     * Set 功能标志 0：会员间交易 1：提现 2：充值
     * @param QueryType 功能标志 0：会员间交易 1：提现 2：充值
     */
    public void setQueryType(String QueryType) {
        this.QueryType = QueryType;
    }

    /**
     * Get 银行流水号 
     * @return TransSequenceNumber 银行流水号
     */
    public String getTransSequenceNumber() {
        return this.TransSequenceNumber;
    }

    /**
     * Set 银行流水号
     * @param TransSequenceNumber 银行流水号
     */
    public void setTransSequenceNumber(String TransSequenceNumber) {
        this.TransSequenceNumber = TransSequenceNumber;
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

    /**
     * Get 保留字段 
     * @return ReservedMessage 保留字段
     */
    public String getReservedMessage() {
        return this.ReservedMessage;
    }

    /**
     * Set 保留字段
     * @param ReservedMessage 保留字段
     */
    public void setReservedMessage(String ReservedMessage) {
        this.ReservedMessage = ReservedMessage;
    }

    /**
     * Get 子账户账号 暂未使用 
     * @return BankSubAccountNumber 子账户账号 暂未使用
     */
    public String getBankSubAccountNumber() {
        return this.BankSubAccountNumber;
    }

    /**
     * Set 子账户账号 暂未使用
     * @param BankSubAccountNumber 子账户账号 暂未使用
     */
    public void setBankSubAccountNumber(String BankSubAccountNumber) {
        this.BankSubAccountNumber = BankSubAccountNumber;
    }

    /**
     * Get 交易日期 暂未使用 
     * @return TransDate 交易日期 暂未使用
     */
    public String getTransDate() {
        return this.TransDate;
    }

    /**
     * Set 交易日期 暂未使用
     * @param TransDate 交易日期 暂未使用
     */
    public void setTransDate(String TransDate) {
        this.TransDate = TransDate;
    }

    public DescribeOrderStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOrderStatusRequest(DescribeOrderStatusRequest source) {
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
        if (source.QueryType != null) {
            this.QueryType = new String(source.QueryType);
        }
        if (source.TransSequenceNumber != null) {
            this.TransSequenceNumber = new String(source.TransSequenceNumber);
        }
        if (source.MidasSignature != null) {
            this.MidasSignature = new String(source.MidasSignature);
        }
        if (source.MidasAppId != null) {
            this.MidasAppId = new String(source.MidasAppId);
        }
        if (source.MidasSecretId != null) {
            this.MidasSecretId = new String(source.MidasSecretId);
        }
        if (source.MidasEnvironment != null) {
            this.MidasEnvironment = new String(source.MidasEnvironment);
        }
        if (source.ReservedMessage != null) {
            this.ReservedMessage = new String(source.ReservedMessage);
        }
        if (source.BankSubAccountNumber != null) {
            this.BankSubAccountNumber = new String(source.BankSubAccountNumber);
        }
        if (source.TransDate != null) {
            this.TransDate = new String(source.TransDate);
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
        this.setParamSimple(map, prefix + "QueryType", this.QueryType);
        this.setParamSimple(map, prefix + "TransSequenceNumber", this.TransSequenceNumber);
        this.setParamSimple(map, prefix + "MidasSignature", this.MidasSignature);
        this.setParamSimple(map, prefix + "MidasAppId", this.MidasAppId);
        this.setParamSimple(map, prefix + "MidasSecretId", this.MidasSecretId);
        this.setParamSimple(map, prefix + "MidasEnvironment", this.MidasEnvironment);
        this.setParamSimple(map, prefix + "ReservedMessage", this.ReservedMessage);
        this.setParamSimple(map, prefix + "BankSubAccountNumber", this.BankSubAccountNumber);
        this.setParamSimple(map, prefix + "TransDate", this.TransDate);

    }
}

