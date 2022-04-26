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

public class CreateOpenBankRechargeOrderRequest extends AbstractModel{

    /**
    * 云企付渠道商户号。外部接入平台入驻云企付平台后下发。
    */
    @SerializedName("ChannelMerchantId")
    @Expose
    private String ChannelMerchantId;

    /**
    * 外部订单号,只能是数字、大小写字母，且在同一个接入平台下唯一，限定长度40位。
    */
    @SerializedName("OutOrderId")
    @Expose
    private String OutOrderId;

    /**
    * 付款金额，单位分。
    */
    @SerializedName("TotalAmount")
    @Expose
    private Long TotalAmount;

    /**
    * 固定值CNY。
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
    * 订单过期时间，yyyy-MM-dd HH:mm:ss格式。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 渠道名称。
__TENPAY__: 商企付
__WECHAT__: 微信支付
__ALIPAY__: 支付宝
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * 渠道名称。
__TENPAY__: 商企付
__WECHAT__: 微信支付
__ALIPAY__: 支付宝
    */
    @SerializedName("PaymentMethod")
    @Expose
    private String PaymentMethod;

    /**
    * 收款方信息。
    */
    @SerializedName("PayeeInfo")
    @Expose
    private OpenBankRechargePayeeInfo PayeeInfo;

    /**
    * 渠道子商户号
    */
    @SerializedName("ChannelSubMerchantId")
    @Expose
    private String ChannelSubMerchantId;

    /**
    * 通知地址，如www.test.com。
    */
    @SerializedName("NotifyUrl")
    @Expose
    private String NotifyUrl;

    /**
    * 备注信息。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 云企付渠道商户号。外部接入平台入驻云企付平台后下发。 
     * @return ChannelMerchantId 云企付渠道商户号。外部接入平台入驻云企付平台后下发。
     */
    public String getChannelMerchantId() {
        return this.ChannelMerchantId;
    }

    /**
     * Set 云企付渠道商户号。外部接入平台入驻云企付平台后下发。
     * @param ChannelMerchantId 云企付渠道商户号。外部接入平台入驻云企付平台后下发。
     */
    public void setChannelMerchantId(String ChannelMerchantId) {
        this.ChannelMerchantId = ChannelMerchantId;
    }

    /**
     * Get 外部订单号,只能是数字、大小写字母，且在同一个接入平台下唯一，限定长度40位。 
     * @return OutOrderId 外部订单号,只能是数字、大小写字母，且在同一个接入平台下唯一，限定长度40位。
     */
    public String getOutOrderId() {
        return this.OutOrderId;
    }

    /**
     * Set 外部订单号,只能是数字、大小写字母，且在同一个接入平台下唯一，限定长度40位。
     * @param OutOrderId 外部订单号,只能是数字、大小写字母，且在同一个接入平台下唯一，限定长度40位。
     */
    public void setOutOrderId(String OutOrderId) {
        this.OutOrderId = OutOrderId;
    }

    /**
     * Get 付款金额，单位分。 
     * @return TotalAmount 付款金额，单位分。
     */
    public Long getTotalAmount() {
        return this.TotalAmount;
    }

    /**
     * Set 付款金额，单位分。
     * @param TotalAmount 付款金额，单位分。
     */
    public void setTotalAmount(Long TotalAmount) {
        this.TotalAmount = TotalAmount;
    }

    /**
     * Get 固定值CNY。 
     * @return Currency 固定值CNY。
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set 固定值CNY。
     * @param Currency 固定值CNY。
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    /**
     * Get 订单过期时间，yyyy-MM-dd HH:mm:ss格式。 
     * @return ExpireTime 订单过期时间，yyyy-MM-dd HH:mm:ss格式。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 订单过期时间，yyyy-MM-dd HH:mm:ss格式。
     * @param ExpireTime 订单过期时间，yyyy-MM-dd HH:mm:ss格式。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 渠道名称。
__TENPAY__: 商企付
__WECHAT__: 微信支付
__ALIPAY__: 支付宝 
     * @return ChannelName 渠道名称。
__TENPAY__: 商企付
__WECHAT__: 微信支付
__ALIPAY__: 支付宝
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set 渠道名称。
__TENPAY__: 商企付
__WECHAT__: 微信支付
__ALIPAY__: 支付宝
     * @param ChannelName 渠道名称。
__TENPAY__: 商企付
__WECHAT__: 微信支付
__ALIPAY__: 支付宝
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get 渠道名称。
__TENPAY__: 商企付
__WECHAT__: 微信支付
__ALIPAY__: 支付宝 
     * @return PaymentMethod 渠道名称。
__TENPAY__: 商企付
__WECHAT__: 微信支付
__ALIPAY__: 支付宝
     */
    public String getPaymentMethod() {
        return this.PaymentMethod;
    }

    /**
     * Set 渠道名称。
__TENPAY__: 商企付
__WECHAT__: 微信支付
__ALIPAY__: 支付宝
     * @param PaymentMethod 渠道名称。
__TENPAY__: 商企付
__WECHAT__: 微信支付
__ALIPAY__: 支付宝
     */
    public void setPaymentMethod(String PaymentMethod) {
        this.PaymentMethod = PaymentMethod;
    }

    /**
     * Get 收款方信息。 
     * @return PayeeInfo 收款方信息。
     */
    public OpenBankRechargePayeeInfo getPayeeInfo() {
        return this.PayeeInfo;
    }

    /**
     * Set 收款方信息。
     * @param PayeeInfo 收款方信息。
     */
    public void setPayeeInfo(OpenBankRechargePayeeInfo PayeeInfo) {
        this.PayeeInfo = PayeeInfo;
    }

    /**
     * Get 渠道子商户号 
     * @return ChannelSubMerchantId 渠道子商户号
     */
    public String getChannelSubMerchantId() {
        return this.ChannelSubMerchantId;
    }

    /**
     * Set 渠道子商户号
     * @param ChannelSubMerchantId 渠道子商户号
     */
    public void setChannelSubMerchantId(String ChannelSubMerchantId) {
        this.ChannelSubMerchantId = ChannelSubMerchantId;
    }

    /**
     * Get 通知地址，如www.test.com。 
     * @return NotifyUrl 通知地址，如www.test.com。
     */
    public String getNotifyUrl() {
        return this.NotifyUrl;
    }

    /**
     * Set 通知地址，如www.test.com。
     * @param NotifyUrl 通知地址，如www.test.com。
     */
    public void setNotifyUrl(String NotifyUrl) {
        this.NotifyUrl = NotifyUrl;
    }

    /**
     * Get 备注信息。 
     * @return Remark 备注信息。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注信息。
     * @param Remark 备注信息。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public CreateOpenBankRechargeOrderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOpenBankRechargeOrderRequest(CreateOpenBankRechargeOrderRequest source) {
        if (source.ChannelMerchantId != null) {
            this.ChannelMerchantId = new String(source.ChannelMerchantId);
        }
        if (source.OutOrderId != null) {
            this.OutOrderId = new String(source.OutOrderId);
        }
        if (source.TotalAmount != null) {
            this.TotalAmount = new Long(source.TotalAmount);
        }
        if (source.Currency != null) {
            this.Currency = new String(source.Currency);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.PaymentMethod != null) {
            this.PaymentMethod = new String(source.PaymentMethod);
        }
        if (source.PayeeInfo != null) {
            this.PayeeInfo = new OpenBankRechargePayeeInfo(source.PayeeInfo);
        }
        if (source.ChannelSubMerchantId != null) {
            this.ChannelSubMerchantId = new String(source.ChannelSubMerchantId);
        }
        if (source.NotifyUrl != null) {
            this.NotifyUrl = new String(source.NotifyUrl);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelMerchantId", this.ChannelMerchantId);
        this.setParamSimple(map, prefix + "OutOrderId", this.OutOrderId);
        this.setParamSimple(map, prefix + "TotalAmount", this.TotalAmount);
        this.setParamSimple(map, prefix + "Currency", this.Currency);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "PaymentMethod", this.PaymentMethod);
        this.setParamObj(map, prefix + "PayeeInfo.", this.PayeeInfo);
        this.setParamSimple(map, prefix + "ChannelSubMerchantId", this.ChannelSubMerchantId);
        this.setParamSimple(map, prefix + "NotifyUrl", this.NotifyUrl);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

