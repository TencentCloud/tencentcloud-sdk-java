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

public class CreateOpenBankUnifiedOrderRequest extends AbstractModel{

    /**
    * 渠道商户号。
    */
    @SerializedName("ChannelMerchantId")
    @Expose
    private String ChannelMerchantId;

    /**
    * 渠道名称。
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * 支付产品类型。
被扫（扫码）：SWIPE, 主扫（刷卡）：SCAN, 
H5：WAP, 公众号：PUBLIC, 
APP-SDK：SDK, 小程序：MINI_PROGRAM, 
快捷支付：QUICK, 网银支付：ONLINE_BANK。
    */
    @SerializedName("PayType")
    @Expose
    private String PayType;

    /**
    * 外部商户订单号。
只能是数字、大小写字母，且在同一个接入平台下唯一。
    */
    @SerializedName("OutOrderId")
    @Expose
    private String OutOrderId;

    /**
    * 交易金额，单位分。
    */
    @SerializedName("TotalAmount")
    @Expose
    private Long TotalAmount;

    /**
    * 币种。固定：CNY。
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
    * 渠道子商户号。
    */
    @SerializedName("ChannelSubMerchantId")
    @Expose
    private String ChannelSubMerchantId;

    /**
    * 实际支付渠道。没有则无需填写。如
支付宝 ALIPAY
微信支付 WXPAY
银联 UNIONPAY
一般在间连模式下使用。
    */
    @SerializedName("PayChannel")
    @Expose
    private String PayChannel;

    /**
    * 设备信息。
    */
    @SerializedName("SceneInfo")
    @Expose
    private OpenBankSceneInfo SceneInfo;

    /**
    * 分账信息列表。
    */
    @SerializedName("ProfitShareInfoList")
    @Expose
    private OpenBankProfitShareInfo [] ProfitShareInfoList;

    /**
    * 订单标题。
    */
    @SerializedName("OrderSubject")
    @Expose
    private String OrderSubject;

    /**
    * 商品信息。
    */
    @SerializedName("GoodsDetail")
    @Expose
    private String GoodsDetail;

    /**
    * 超时时间。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 支付成功回调地址。
    */
    @SerializedName("NotifyUrl")
    @Expose
    private String NotifyUrl;

    /**
    * 支付成功前端跳转URL。
    */
    @SerializedName("FrontUrl")
    @Expose
    private String FrontUrl;

    /**
    * 订单附加信息，查询或者回调的时候原样返回。
    */
    @SerializedName("Attachment")
    @Expose
    private String Attachment;

    /**
    * 第三方渠道扩展字段。见附录-复杂类型。
未作特殊说明，则无需传入。
    */
    @SerializedName("ExternalPaymentData")
    @Expose
    private String ExternalPaymentData;

    /**
    * 备注。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 门店信息。
    */
    @SerializedName("StoreInfo")
    @Expose
    private OpenBankStoreInfo StoreInfo;

    /**
    * 支付限制。
    */
    @SerializedName("PayLimitInfo")
    @Expose
    private OpenBankPayLimitInfo PayLimitInfo;

    /**
    * 环境类型。
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
     * Get 渠道商户号。 
     * @return ChannelMerchantId 渠道商户号。
     */
    public String getChannelMerchantId() {
        return this.ChannelMerchantId;
    }

    /**
     * Set 渠道商户号。
     * @param ChannelMerchantId 渠道商户号。
     */
    public void setChannelMerchantId(String ChannelMerchantId) {
        this.ChannelMerchantId = ChannelMerchantId;
    }

    /**
     * Get 渠道名称。 
     * @return ChannelName 渠道名称。
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set 渠道名称。
     * @param ChannelName 渠道名称。
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get 支付产品类型。
被扫（扫码）：SWIPE, 主扫（刷卡）：SCAN, 
H5：WAP, 公众号：PUBLIC, 
APP-SDK：SDK, 小程序：MINI_PROGRAM, 
快捷支付：QUICK, 网银支付：ONLINE_BANK。 
     * @return PayType 支付产品类型。
被扫（扫码）：SWIPE, 主扫（刷卡）：SCAN, 
H5：WAP, 公众号：PUBLIC, 
APP-SDK：SDK, 小程序：MINI_PROGRAM, 
快捷支付：QUICK, 网银支付：ONLINE_BANK。
     */
    public String getPayType() {
        return this.PayType;
    }

    /**
     * Set 支付产品类型。
被扫（扫码）：SWIPE, 主扫（刷卡）：SCAN, 
H5：WAP, 公众号：PUBLIC, 
APP-SDK：SDK, 小程序：MINI_PROGRAM, 
快捷支付：QUICK, 网银支付：ONLINE_BANK。
     * @param PayType 支付产品类型。
被扫（扫码）：SWIPE, 主扫（刷卡）：SCAN, 
H5：WAP, 公众号：PUBLIC, 
APP-SDK：SDK, 小程序：MINI_PROGRAM, 
快捷支付：QUICK, 网银支付：ONLINE_BANK。
     */
    public void setPayType(String PayType) {
        this.PayType = PayType;
    }

    /**
     * Get 外部商户订单号。
只能是数字、大小写字母，且在同一个接入平台下唯一。 
     * @return OutOrderId 外部商户订单号。
只能是数字、大小写字母，且在同一个接入平台下唯一。
     */
    public String getOutOrderId() {
        return this.OutOrderId;
    }

    /**
     * Set 外部商户订单号。
只能是数字、大小写字母，且在同一个接入平台下唯一。
     * @param OutOrderId 外部商户订单号。
只能是数字、大小写字母，且在同一个接入平台下唯一。
     */
    public void setOutOrderId(String OutOrderId) {
        this.OutOrderId = OutOrderId;
    }

    /**
     * Get 交易金额，单位分。 
     * @return TotalAmount 交易金额，单位分。
     */
    public Long getTotalAmount() {
        return this.TotalAmount;
    }

    /**
     * Set 交易金额，单位分。
     * @param TotalAmount 交易金额，单位分。
     */
    public void setTotalAmount(Long TotalAmount) {
        this.TotalAmount = TotalAmount;
    }

    /**
     * Get 币种。固定：CNY。 
     * @return Currency 币种。固定：CNY。
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set 币种。固定：CNY。
     * @param Currency 币种。固定：CNY。
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    /**
     * Get 渠道子商户号。 
     * @return ChannelSubMerchantId 渠道子商户号。
     */
    public String getChannelSubMerchantId() {
        return this.ChannelSubMerchantId;
    }

    /**
     * Set 渠道子商户号。
     * @param ChannelSubMerchantId 渠道子商户号。
     */
    public void setChannelSubMerchantId(String ChannelSubMerchantId) {
        this.ChannelSubMerchantId = ChannelSubMerchantId;
    }

    /**
     * Get 实际支付渠道。没有则无需填写。如
支付宝 ALIPAY
微信支付 WXPAY
银联 UNIONPAY
一般在间连模式下使用。 
     * @return PayChannel 实际支付渠道。没有则无需填写。如
支付宝 ALIPAY
微信支付 WXPAY
银联 UNIONPAY
一般在间连模式下使用。
     */
    public String getPayChannel() {
        return this.PayChannel;
    }

    /**
     * Set 实际支付渠道。没有则无需填写。如
支付宝 ALIPAY
微信支付 WXPAY
银联 UNIONPAY
一般在间连模式下使用。
     * @param PayChannel 实际支付渠道。没有则无需填写。如
支付宝 ALIPAY
微信支付 WXPAY
银联 UNIONPAY
一般在间连模式下使用。
     */
    public void setPayChannel(String PayChannel) {
        this.PayChannel = PayChannel;
    }

    /**
     * Get 设备信息。 
     * @return SceneInfo 设备信息。
     */
    public OpenBankSceneInfo getSceneInfo() {
        return this.SceneInfo;
    }

    /**
     * Set 设备信息。
     * @param SceneInfo 设备信息。
     */
    public void setSceneInfo(OpenBankSceneInfo SceneInfo) {
        this.SceneInfo = SceneInfo;
    }

    /**
     * Get 分账信息列表。 
     * @return ProfitShareInfoList 分账信息列表。
     */
    public OpenBankProfitShareInfo [] getProfitShareInfoList() {
        return this.ProfitShareInfoList;
    }

    /**
     * Set 分账信息列表。
     * @param ProfitShareInfoList 分账信息列表。
     */
    public void setProfitShareInfoList(OpenBankProfitShareInfo [] ProfitShareInfoList) {
        this.ProfitShareInfoList = ProfitShareInfoList;
    }

    /**
     * Get 订单标题。 
     * @return OrderSubject 订单标题。
     */
    public String getOrderSubject() {
        return this.OrderSubject;
    }

    /**
     * Set 订单标题。
     * @param OrderSubject 订单标题。
     */
    public void setOrderSubject(String OrderSubject) {
        this.OrderSubject = OrderSubject;
    }

    /**
     * Get 商品信息。 
     * @return GoodsDetail 商品信息。
     */
    public String getGoodsDetail() {
        return this.GoodsDetail;
    }

    /**
     * Set 商品信息。
     * @param GoodsDetail 商品信息。
     */
    public void setGoodsDetail(String GoodsDetail) {
        this.GoodsDetail = GoodsDetail;
    }

    /**
     * Get 超时时间。 
     * @return ExpireTime 超时时间。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 超时时间。
     * @param ExpireTime 超时时间。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
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
     * Get 支付成功前端跳转URL。 
     * @return FrontUrl 支付成功前端跳转URL。
     */
    public String getFrontUrl() {
        return this.FrontUrl;
    }

    /**
     * Set 支付成功前端跳转URL。
     * @param FrontUrl 支付成功前端跳转URL。
     */
    public void setFrontUrl(String FrontUrl) {
        this.FrontUrl = FrontUrl;
    }

    /**
     * Get 订单附加信息，查询或者回调的时候原样返回。 
     * @return Attachment 订单附加信息，查询或者回调的时候原样返回。
     */
    public String getAttachment() {
        return this.Attachment;
    }

    /**
     * Set 订单附加信息，查询或者回调的时候原样返回。
     * @param Attachment 订单附加信息，查询或者回调的时候原样返回。
     */
    public void setAttachment(String Attachment) {
        this.Attachment = Attachment;
    }

    /**
     * Get 第三方渠道扩展字段。见附录-复杂类型。
未作特殊说明，则无需传入。 
     * @return ExternalPaymentData 第三方渠道扩展字段。见附录-复杂类型。
未作特殊说明，则无需传入。
     */
    public String getExternalPaymentData() {
        return this.ExternalPaymentData;
    }

    /**
     * Set 第三方渠道扩展字段。见附录-复杂类型。
未作特殊说明，则无需传入。
     * @param ExternalPaymentData 第三方渠道扩展字段。见附录-复杂类型。
未作特殊说明，则无需传入。
     */
    public void setExternalPaymentData(String ExternalPaymentData) {
        this.ExternalPaymentData = ExternalPaymentData;
    }

    /**
     * Get 备注。 
     * @return Remark 备注。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注。
     * @param Remark 备注。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 门店信息。 
     * @return StoreInfo 门店信息。
     */
    public OpenBankStoreInfo getStoreInfo() {
        return this.StoreInfo;
    }

    /**
     * Set 门店信息。
     * @param StoreInfo 门店信息。
     */
    public void setStoreInfo(OpenBankStoreInfo StoreInfo) {
        this.StoreInfo = StoreInfo;
    }

    /**
     * Get 支付限制。 
     * @return PayLimitInfo 支付限制。
     */
    public OpenBankPayLimitInfo getPayLimitInfo() {
        return this.PayLimitInfo;
    }

    /**
     * Set 支付限制。
     * @param PayLimitInfo 支付限制。
     */
    public void setPayLimitInfo(OpenBankPayLimitInfo PayLimitInfo) {
        this.PayLimitInfo = PayLimitInfo;
    }

    /**
     * Get 环境类型。
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_ 
     * @return Environment 环境类型。
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
     */
    public String getEnvironment() {
        return this.Environment;
    }

    /**
     * Set 环境类型。
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
     * @param Environment 环境类型。
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
     */
    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }

    public CreateOpenBankUnifiedOrderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOpenBankUnifiedOrderRequest(CreateOpenBankUnifiedOrderRequest source) {
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
        if (source.PayChannel != null) {
            this.PayChannel = new String(source.PayChannel);
        }
        if (source.SceneInfo != null) {
            this.SceneInfo = new OpenBankSceneInfo(source.SceneInfo);
        }
        if (source.ProfitShareInfoList != null) {
            this.ProfitShareInfoList = new OpenBankProfitShareInfo[source.ProfitShareInfoList.length];
            for (int i = 0; i < source.ProfitShareInfoList.length; i++) {
                this.ProfitShareInfoList[i] = new OpenBankProfitShareInfo(source.ProfitShareInfoList[i]);
            }
        }
        if (source.OrderSubject != null) {
            this.OrderSubject = new String(source.OrderSubject);
        }
        if (source.GoodsDetail != null) {
            this.GoodsDetail = new String(source.GoodsDetail);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.NotifyUrl != null) {
            this.NotifyUrl = new String(source.NotifyUrl);
        }
        if (source.FrontUrl != null) {
            this.FrontUrl = new String(source.FrontUrl);
        }
        if (source.Attachment != null) {
            this.Attachment = new String(source.Attachment);
        }
        if (source.ExternalPaymentData != null) {
            this.ExternalPaymentData = new String(source.ExternalPaymentData);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.StoreInfo != null) {
            this.StoreInfo = new OpenBankStoreInfo(source.StoreInfo);
        }
        if (source.PayLimitInfo != null) {
            this.PayLimitInfo = new OpenBankPayLimitInfo(source.PayLimitInfo);
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
        this.setParamSimple(map, prefix + "PayChannel", this.PayChannel);
        this.setParamObj(map, prefix + "SceneInfo.", this.SceneInfo);
        this.setParamArrayObj(map, prefix + "ProfitShareInfoList.", this.ProfitShareInfoList);
        this.setParamSimple(map, prefix + "OrderSubject", this.OrderSubject);
        this.setParamSimple(map, prefix + "GoodsDetail", this.GoodsDetail);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "NotifyUrl", this.NotifyUrl);
        this.setParamSimple(map, prefix + "FrontUrl", this.FrontUrl);
        this.setParamSimple(map, prefix + "Attachment", this.Attachment);
        this.setParamSimple(map, prefix + "ExternalPaymentData", this.ExternalPaymentData);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamObj(map, prefix + "StoreInfo.", this.StoreInfo);
        this.setParamObj(map, prefix + "PayLimitInfo.", this.PayLimitInfo);
        this.setParamSimple(map, prefix + "Environment", this.Environment);

    }
}

