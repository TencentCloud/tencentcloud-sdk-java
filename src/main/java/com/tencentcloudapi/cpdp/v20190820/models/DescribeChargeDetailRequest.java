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

public class DescribeChargeDetailRequest extends AbstractModel{

    /**
    * 请求类型
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
    * 原始交易订单号或者流水号
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
    * 收单渠道类型
    */
    @SerializedName("AcquiringChannelType")
    @Expose
    private String AcquiringChannelType;

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
    * Midas环境参数
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
     * Get 请求类型 
     * @return RequestType 请求类型
     */
    public String getRequestType() {
        return this.RequestType;
    }

    /**
     * Set 请求类型
     * @param RequestType 请求类型
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
     * Get 原始交易订单号或者流水号 
     * @return OrderId 原始交易订单号或者流水号
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 原始交易订单号或者流水号
     * @param OrderId 原始交易订单号或者流水号
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
     * Get 收单渠道类型 
     * @return AcquiringChannelType 收单渠道类型
     */
    public String getAcquiringChannelType() {
        return this.AcquiringChannelType;
    }

    /**
     * Set 收单渠道类型
     * @param AcquiringChannelType 收单渠道类型
     */
    public void setAcquiringChannelType(String AcquiringChannelType) {
        this.AcquiringChannelType = AcquiringChannelType;
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

    public DescribeChargeDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeChargeDetailRequest(DescribeChargeDetailRequest source) {
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
        if (source.AcquiringChannelType != null) {
            this.AcquiringChannelType = new String(source.AcquiringChannelType);
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
        if (source.MidasEnvironment != null) {
            this.MidasEnvironment = new String(source.MidasEnvironment);
        }
        if (source.ReservedMessage != null) {
            this.ReservedMessage = new String(source.ReservedMessage);
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
        this.setParamSimple(map, prefix + "AcquiringChannelType", this.AcquiringChannelType);
        this.setParamSimple(map, prefix + "PlatformShortNumber", this.PlatformShortNumber);
        this.setParamSimple(map, prefix + "MidasSecretId", this.MidasSecretId);
        this.setParamSimple(map, prefix + "MidasAppId", this.MidasAppId);
        this.setParamSimple(map, prefix + "MidasSignature", this.MidasSignature);
        this.setParamSimple(map, prefix + "TransSequenceNumber", this.TransSequenceNumber);
        this.setParamSimple(map, prefix + "MidasEnvironment", this.MidasEnvironment);
        this.setParamSimple(map, prefix + "ReservedMessage", this.ReservedMessage);

    }
}

