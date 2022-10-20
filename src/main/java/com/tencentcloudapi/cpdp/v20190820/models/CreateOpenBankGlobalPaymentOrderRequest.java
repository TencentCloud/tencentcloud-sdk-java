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

public class CreateOpenBankGlobalPaymentOrderRequest extends AbstractModel{

    /**
    * 渠道商户号
    */
    @SerializedName("ChannelMerchantId")
    @Expose
    private String ChannelMerchantId;

    /**
    * 渠道名称
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * 付款方式
    */
    @SerializedName("PayType")
    @Expose
    private String PayType;

    /**
    * 外部商户订单号,只能是数字、大小写字母，且在同一个接入平台下唯一
    */
    @SerializedName("OutOrderId")
    @Expose
    private String OutOrderId;

    /**
    * 付款金额，单位分
    */
    @SerializedName("TotalAmount")
    @Expose
    private Long TotalAmount;

    /**
    * 支付币种，参考附录：货币代码
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
    * 渠道子商户号
    */
    @SerializedName("ChannelSubMerchantId")
    @Expose
    private String ChannelSubMerchantId;

    /**
    * 支付成功回调地址。
    */
    @SerializedName("NotifyUrl")
    @Expose
    private String NotifyUrl;

    /**
    * 前端跳转地址。通联支付成功后，支付网关跳回商户的地址
    */
    @SerializedName("FrontUrl")
    @Expose
    private String FrontUrl;

    /**
    * 网站语言。收银台显示语言，见附录网站语言
    */
    @SerializedName("FrontLanguage")
    @Expose
    private String FrontLanguage;

    /**
    * 付款备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 第三方拓展信息信息
    */
    @SerializedName("ExternalPaymentData")
    @Expose
    private String ExternalPaymentData;

    /**
    * 商品信息
    */
    @SerializedName("GoodsInfos")
    @Expose
    private OpenBankGoodsInfo [] GoodsInfos;

    /**
    * 邮寄信息
    */
    @SerializedName("ShippingInfo")
    @Expose
    private OpenBankShippingInfo ShippingInfo;

    /**
    * 账单信息
    */
    @SerializedName("BillingInfo")
    @Expose
    private OpenBankBillingInfo BillingInfo;

    /**
    * 环境类型
__release__:生产环境
__sandbox__:沙箱环境
缺省默认为生产环境
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
     * Get 渠道商户号 
     * @return ChannelMerchantId 渠道商户号
     */
    public String getChannelMerchantId() {
        return this.ChannelMerchantId;
    }

    /**
     * Set 渠道商户号
     * @param ChannelMerchantId 渠道商户号
     */
    public void setChannelMerchantId(String ChannelMerchantId) {
        this.ChannelMerchantId = ChannelMerchantId;
    }

    /**
     * Get 渠道名称 
     * @return ChannelName 渠道名称
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set 渠道名称
     * @param ChannelName 渠道名称
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get 付款方式 
     * @return PayType 付款方式
     */
    public String getPayType() {
        return this.PayType;
    }

    /**
     * Set 付款方式
     * @param PayType 付款方式
     */
    public void setPayType(String PayType) {
        this.PayType = PayType;
    }

    /**
     * Get 外部商户订单号,只能是数字、大小写字母，且在同一个接入平台下唯一 
     * @return OutOrderId 外部商户订单号,只能是数字、大小写字母，且在同一个接入平台下唯一
     */
    public String getOutOrderId() {
        return this.OutOrderId;
    }

    /**
     * Set 外部商户订单号,只能是数字、大小写字母，且在同一个接入平台下唯一
     * @param OutOrderId 外部商户订单号,只能是数字、大小写字母，且在同一个接入平台下唯一
     */
    public void setOutOrderId(String OutOrderId) {
        this.OutOrderId = OutOrderId;
    }

    /**
     * Get 付款金额，单位分 
     * @return TotalAmount 付款金额，单位分
     */
    public Long getTotalAmount() {
        return this.TotalAmount;
    }

    /**
     * Set 付款金额，单位分
     * @param TotalAmount 付款金额，单位分
     */
    public void setTotalAmount(Long TotalAmount) {
        this.TotalAmount = TotalAmount;
    }

    /**
     * Get 支付币种，参考附录：货币代码 
     * @return Currency 支付币种，参考附录：货币代码
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set 支付币种，参考附录：货币代码
     * @param Currency 支付币种，参考附录：货币代码
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
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
     * Get 支付成功回调地址。 
     * @return NotifyUrl 支付成功回调地址。
     */
    public String getNotifyUrl() {
        return this.NotifyUrl;
    }

    /**
     * Set 支付成功回调地址。
     * @param NotifyUrl 支付成功回调地址。
     */
    public void setNotifyUrl(String NotifyUrl) {
        this.NotifyUrl = NotifyUrl;
    }

    /**
     * Get 前端跳转地址。通联支付成功后，支付网关跳回商户的地址 
     * @return FrontUrl 前端跳转地址。通联支付成功后，支付网关跳回商户的地址
     */
    public String getFrontUrl() {
        return this.FrontUrl;
    }

    /**
     * Set 前端跳转地址。通联支付成功后，支付网关跳回商户的地址
     * @param FrontUrl 前端跳转地址。通联支付成功后，支付网关跳回商户的地址
     */
    public void setFrontUrl(String FrontUrl) {
        this.FrontUrl = FrontUrl;
    }

    /**
     * Get 网站语言。收银台显示语言，见附录网站语言 
     * @return FrontLanguage 网站语言。收银台显示语言，见附录网站语言
     */
    public String getFrontLanguage() {
        return this.FrontLanguage;
    }

    /**
     * Set 网站语言。收银台显示语言，见附录网站语言
     * @param FrontLanguage 网站语言。收银台显示语言，见附录网站语言
     */
    public void setFrontLanguage(String FrontLanguage) {
        this.FrontLanguage = FrontLanguage;
    }

    /**
     * Get 付款备注 
     * @return Remark 付款备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 付款备注
     * @param Remark 付款备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 第三方拓展信息信息 
     * @return ExternalPaymentData 第三方拓展信息信息
     */
    public String getExternalPaymentData() {
        return this.ExternalPaymentData;
    }

    /**
     * Set 第三方拓展信息信息
     * @param ExternalPaymentData 第三方拓展信息信息
     */
    public void setExternalPaymentData(String ExternalPaymentData) {
        this.ExternalPaymentData = ExternalPaymentData;
    }

    /**
     * Get 商品信息 
     * @return GoodsInfos 商品信息
     */
    public OpenBankGoodsInfo [] getGoodsInfos() {
        return this.GoodsInfos;
    }

    /**
     * Set 商品信息
     * @param GoodsInfos 商品信息
     */
    public void setGoodsInfos(OpenBankGoodsInfo [] GoodsInfos) {
        this.GoodsInfos = GoodsInfos;
    }

    /**
     * Get 邮寄信息 
     * @return ShippingInfo 邮寄信息
     */
    public OpenBankShippingInfo getShippingInfo() {
        return this.ShippingInfo;
    }

    /**
     * Set 邮寄信息
     * @param ShippingInfo 邮寄信息
     */
    public void setShippingInfo(OpenBankShippingInfo ShippingInfo) {
        this.ShippingInfo = ShippingInfo;
    }

    /**
     * Get 账单信息 
     * @return BillingInfo 账单信息
     */
    public OpenBankBillingInfo getBillingInfo() {
        return this.BillingInfo;
    }

    /**
     * Set 账单信息
     * @param BillingInfo 账单信息
     */
    public void setBillingInfo(OpenBankBillingInfo BillingInfo) {
        this.BillingInfo = BillingInfo;
    }

    /**
     * Get 环境类型
__release__:生产环境
__sandbox__:沙箱环境
缺省默认为生产环境 
     * @return Environment 环境类型
__release__:生产环境
__sandbox__:沙箱环境
缺省默认为生产环境
     */
    public String getEnvironment() {
        return this.Environment;
    }

    /**
     * Set 环境类型
__release__:生产环境
__sandbox__:沙箱环境
缺省默认为生产环境
     * @param Environment 环境类型
__release__:生产环境
__sandbox__:沙箱环境
缺省默认为生产环境
     */
    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }

    public CreateOpenBankGlobalPaymentOrderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOpenBankGlobalPaymentOrderRequest(CreateOpenBankGlobalPaymentOrderRequest source) {
        if (source.ChannelMerchantId != null) {
            this.ChannelMerchantId = new String(source.ChannelMerchantId);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.PayType != null) {
            this.PayType = new String(source.PayType);
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
        if (source.ChannelSubMerchantId != null) {
            this.ChannelSubMerchantId = new String(source.ChannelSubMerchantId);
        }
        if (source.NotifyUrl != null) {
            this.NotifyUrl = new String(source.NotifyUrl);
        }
        if (source.FrontUrl != null) {
            this.FrontUrl = new String(source.FrontUrl);
        }
        if (source.FrontLanguage != null) {
            this.FrontLanguage = new String(source.FrontLanguage);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ExternalPaymentData != null) {
            this.ExternalPaymentData = new String(source.ExternalPaymentData);
        }
        if (source.GoodsInfos != null) {
            this.GoodsInfos = new OpenBankGoodsInfo[source.GoodsInfos.length];
            for (int i = 0; i < source.GoodsInfos.length; i++) {
                this.GoodsInfos[i] = new OpenBankGoodsInfo(source.GoodsInfos[i]);
            }
        }
        if (source.ShippingInfo != null) {
            this.ShippingInfo = new OpenBankShippingInfo(source.ShippingInfo);
        }
        if (source.BillingInfo != null) {
            this.BillingInfo = new OpenBankBillingInfo(source.BillingInfo);
        }
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelMerchantId", this.ChannelMerchantId);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "PayType", this.PayType);
        this.setParamSimple(map, prefix + "OutOrderId", this.OutOrderId);
        this.setParamSimple(map, prefix + "TotalAmount", this.TotalAmount);
        this.setParamSimple(map, prefix + "Currency", this.Currency);
        this.setParamSimple(map, prefix + "ChannelSubMerchantId", this.ChannelSubMerchantId);
        this.setParamSimple(map, prefix + "NotifyUrl", this.NotifyUrl);
        this.setParamSimple(map, prefix + "FrontUrl", this.FrontUrl);
        this.setParamSimple(map, prefix + "FrontLanguage", this.FrontLanguage);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ExternalPaymentData", this.ExternalPaymentData);
        this.setParamArrayObj(map, prefix + "GoodsInfos.", this.GoodsInfos);
        this.setParamObj(map, prefix + "ShippingInfo.", this.ShippingInfo);
        this.setParamObj(map, prefix + "BillingInfo.", this.BillingInfo);
        this.setParamSimple(map, prefix + "Environment", this.Environment);

    }
}

