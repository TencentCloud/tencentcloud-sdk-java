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

public class PayOrderResult extends AbstractModel{

    /**
    * 付款订单号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrderNo")
    @Expose
    private String OrderNo;

    /**
    * 开发者流水号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeveloperNo")
    @Expose
    private String DeveloperNo;

    /**
    * 交易优惠金额（免充值券）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TradeDiscountAmount")
    @Expose
    private String TradeDiscountAmount;

    /**
    * 付款方式名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayName")
    @Expose
    private String PayName;

    /**
    * 商户流水号（从1开始自增长不重复）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrderMerchantId")
    @Expose
    private String OrderMerchantId;

    /**
    * 交易帐号（银行卡号、支付宝帐号、微信帐号等，某些收单机构没有此数据）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TradeAccount")
    @Expose
    private String TradeAccount;

    /**
    * 实际交易金额（以分为单位，没有小数点）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TradeAmount")
    @Expose
    private String TradeAmount;

    /**
    * 币种签名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurrencySign")
    @Expose
    private String CurrencySign;

    /**
    * 付款完成时间（以收单机构为准）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TradePayTime")
    @Expose
    private String TradePayTime;

    /**
    * 门店流水号（从1开始自增长不重复）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShopOrderId")
    @Expose
    private String ShopOrderId;

    /**
    * 支付标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayTag")
    @Expose
    private String PayTag;

    /**
    * 订单状态（1交易成功，2待支付，4已取消，9等待用户输入密码确认
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 币种代码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrderCurrency")
    @Expose
    private String OrderCurrency;

    /**
    * 二维码字符串
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TradeQrcode")
    @Expose
    private String TradeQrcode;

    /**
    * 微信返回调起小程序/原生JS支付的appid参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WechatAppId")
    @Expose
    private String WechatAppId;

    /**
    * 微信返回调起小程序/原生JS支付的timeStamp参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WechatTimeStamp")
    @Expose
    private String WechatTimeStamp;

    /**
    * 微信返回调起小程序/原生JS支付的nonceStr参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WechatNonceStr")
    @Expose
    private String WechatNonceStr;

    /**
    * 微信返回调起小程序/原生JS支付的signType参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WechatSignType")
    @Expose
    private String WechatSignType;

    /**
    * 微信返回调起小程序/原生JS支付的package参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WechatPackage")
    @Expose
    private String WechatPackage;

    /**
    * 微信返回调起小程序/原生JS支付的paySign参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WechatPaySign")
    @Expose
    private String WechatPaySign;

    /**
     * Get 付款订单号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrderNo 付款订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrderNo() {
        return this.OrderNo;
    }

    /**
     * Set 付款订单号
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrderNo 付款订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrderNo(String OrderNo) {
        this.OrderNo = OrderNo;
    }

    /**
     * Get 开发者流水号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeveloperNo 开发者流水号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeveloperNo() {
        return this.DeveloperNo;
    }

    /**
     * Set 开发者流水号
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeveloperNo 开发者流水号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeveloperNo(String DeveloperNo) {
        this.DeveloperNo = DeveloperNo;
    }

    /**
     * Get 交易优惠金额（免充值券）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TradeDiscountAmount 交易优惠金额（免充值券）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTradeDiscountAmount() {
        return this.TradeDiscountAmount;
    }

    /**
     * Set 交易优惠金额（免充值券）
注意：此字段可能返回 null，表示取不到有效值。
     * @param TradeDiscountAmount 交易优惠金额（免充值券）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTradeDiscountAmount(String TradeDiscountAmount) {
        this.TradeDiscountAmount = TradeDiscountAmount;
    }

    /**
     * Get 付款方式名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayName 付款方式名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPayName() {
        return this.PayName;
    }

    /**
     * Set 付款方式名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayName 付款方式名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayName(String PayName) {
        this.PayName = PayName;
    }

    /**
     * Get 商户流水号（从1开始自增长不重复）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrderMerchantId 商户流水号（从1开始自增长不重复）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrderMerchantId() {
        return this.OrderMerchantId;
    }

    /**
     * Set 商户流水号（从1开始自增长不重复）
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrderMerchantId 商户流水号（从1开始自增长不重复）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrderMerchantId(String OrderMerchantId) {
        this.OrderMerchantId = OrderMerchantId;
    }

    /**
     * Get 交易帐号（银行卡号、支付宝帐号、微信帐号等，某些收单机构没有此数据）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TradeAccount 交易帐号（银行卡号、支付宝帐号、微信帐号等，某些收单机构没有此数据）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTradeAccount() {
        return this.TradeAccount;
    }

    /**
     * Set 交易帐号（银行卡号、支付宝帐号、微信帐号等，某些收单机构没有此数据）
注意：此字段可能返回 null，表示取不到有效值。
     * @param TradeAccount 交易帐号（银行卡号、支付宝帐号、微信帐号等，某些收单机构没有此数据）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTradeAccount(String TradeAccount) {
        this.TradeAccount = TradeAccount;
    }

    /**
     * Get 实际交易金额（以分为单位，没有小数点）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TradeAmount 实际交易金额（以分为单位，没有小数点）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTradeAmount() {
        return this.TradeAmount;
    }

    /**
     * Set 实际交易金额（以分为单位，没有小数点）
注意：此字段可能返回 null，表示取不到有效值。
     * @param TradeAmount 实际交易金额（以分为单位，没有小数点）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTradeAmount(String TradeAmount) {
        this.TradeAmount = TradeAmount;
    }

    /**
     * Get 币种签名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurrencySign 币种签名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCurrencySign() {
        return this.CurrencySign;
    }

    /**
     * Set 币种签名
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurrencySign 币种签名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurrencySign(String CurrencySign) {
        this.CurrencySign = CurrencySign;
    }

    /**
     * Get 付款完成时间（以收单机构为准）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TradePayTime 付款完成时间（以收单机构为准）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTradePayTime() {
        return this.TradePayTime;
    }

    /**
     * Set 付款完成时间（以收单机构为准）
注意：此字段可能返回 null，表示取不到有效值。
     * @param TradePayTime 付款完成时间（以收单机构为准）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTradePayTime(String TradePayTime) {
        this.TradePayTime = TradePayTime;
    }

    /**
     * Get 门店流水号（从1开始自增长不重复）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShopOrderId 门店流水号（从1开始自增长不重复）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getShopOrderId() {
        return this.ShopOrderId;
    }

    /**
     * Set 门店流水号（从1开始自增长不重复）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShopOrderId 门店流水号（从1开始自增长不重复）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShopOrderId(String ShopOrderId) {
        this.ShopOrderId = ShopOrderId;
    }

    /**
     * Get 支付标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayTag 支付标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPayTag() {
        return this.PayTag;
    }

    /**
     * Set 支付标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayTag 支付标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayTag(String PayTag) {
        this.PayTag = PayTag;
    }

    /**
     * Get 订单状态（1交易成功，2待支付，4已取消，9等待用户输入密码确认
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 订单状态（1交易成功，2待支付，4已取消，9等待用户输入密码确认
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 订单状态（1交易成功，2待支付，4已取消，9等待用户输入密码确认
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 订单状态（1交易成功，2待支付，4已取消，9等待用户输入密码确认
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 币种代码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrderCurrency 币种代码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrderCurrency() {
        return this.OrderCurrency;
    }

    /**
     * Set 币种代码
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrderCurrency 币种代码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrderCurrency(String OrderCurrency) {
        this.OrderCurrency = OrderCurrency;
    }

    /**
     * Get 二维码字符串
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TradeQrcode 二维码字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTradeQrcode() {
        return this.TradeQrcode;
    }

    /**
     * Set 二维码字符串
注意：此字段可能返回 null，表示取不到有效值。
     * @param TradeQrcode 二维码字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTradeQrcode(String TradeQrcode) {
        this.TradeQrcode = TradeQrcode;
    }

    /**
     * Get 微信返回调起小程序/原生JS支付的appid参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WechatAppId 微信返回调起小程序/原生JS支付的appid参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWechatAppId() {
        return this.WechatAppId;
    }

    /**
     * Set 微信返回调起小程序/原生JS支付的appid参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param WechatAppId 微信返回调起小程序/原生JS支付的appid参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWechatAppId(String WechatAppId) {
        this.WechatAppId = WechatAppId;
    }

    /**
     * Get 微信返回调起小程序/原生JS支付的timeStamp参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WechatTimeStamp 微信返回调起小程序/原生JS支付的timeStamp参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWechatTimeStamp() {
        return this.WechatTimeStamp;
    }

    /**
     * Set 微信返回调起小程序/原生JS支付的timeStamp参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param WechatTimeStamp 微信返回调起小程序/原生JS支付的timeStamp参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWechatTimeStamp(String WechatTimeStamp) {
        this.WechatTimeStamp = WechatTimeStamp;
    }

    /**
     * Get 微信返回调起小程序/原生JS支付的nonceStr参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WechatNonceStr 微信返回调起小程序/原生JS支付的nonceStr参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWechatNonceStr() {
        return this.WechatNonceStr;
    }

    /**
     * Set 微信返回调起小程序/原生JS支付的nonceStr参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param WechatNonceStr 微信返回调起小程序/原生JS支付的nonceStr参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWechatNonceStr(String WechatNonceStr) {
        this.WechatNonceStr = WechatNonceStr;
    }

    /**
     * Get 微信返回调起小程序/原生JS支付的signType参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WechatSignType 微信返回调起小程序/原生JS支付的signType参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWechatSignType() {
        return this.WechatSignType;
    }

    /**
     * Set 微信返回调起小程序/原生JS支付的signType参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param WechatSignType 微信返回调起小程序/原生JS支付的signType参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWechatSignType(String WechatSignType) {
        this.WechatSignType = WechatSignType;
    }

    /**
     * Get 微信返回调起小程序/原生JS支付的package参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WechatPackage 微信返回调起小程序/原生JS支付的package参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWechatPackage() {
        return this.WechatPackage;
    }

    /**
     * Set 微信返回调起小程序/原生JS支付的package参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param WechatPackage 微信返回调起小程序/原生JS支付的package参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWechatPackage(String WechatPackage) {
        this.WechatPackage = WechatPackage;
    }

    /**
     * Get 微信返回调起小程序/原生JS支付的paySign参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WechatPaySign 微信返回调起小程序/原生JS支付的paySign参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWechatPaySign() {
        return this.WechatPaySign;
    }

    /**
     * Set 微信返回调起小程序/原生JS支付的paySign参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param WechatPaySign 微信返回调起小程序/原生JS支付的paySign参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWechatPaySign(String WechatPaySign) {
        this.WechatPaySign = WechatPaySign;
    }

    public PayOrderResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PayOrderResult(PayOrderResult source) {
        if (source.OrderNo != null) {
            this.OrderNo = new String(source.OrderNo);
        }
        if (source.DeveloperNo != null) {
            this.DeveloperNo = new String(source.DeveloperNo);
        }
        if (source.TradeDiscountAmount != null) {
            this.TradeDiscountAmount = new String(source.TradeDiscountAmount);
        }
        if (source.PayName != null) {
            this.PayName = new String(source.PayName);
        }
        if (source.OrderMerchantId != null) {
            this.OrderMerchantId = new String(source.OrderMerchantId);
        }
        if (source.TradeAccount != null) {
            this.TradeAccount = new String(source.TradeAccount);
        }
        if (source.TradeAmount != null) {
            this.TradeAmount = new String(source.TradeAmount);
        }
        if (source.CurrencySign != null) {
            this.CurrencySign = new String(source.CurrencySign);
        }
        if (source.TradePayTime != null) {
            this.TradePayTime = new String(source.TradePayTime);
        }
        if (source.ShopOrderId != null) {
            this.ShopOrderId = new String(source.ShopOrderId);
        }
        if (source.PayTag != null) {
            this.PayTag = new String(source.PayTag);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.OrderCurrency != null) {
            this.OrderCurrency = new String(source.OrderCurrency);
        }
        if (source.TradeQrcode != null) {
            this.TradeQrcode = new String(source.TradeQrcode);
        }
        if (source.WechatAppId != null) {
            this.WechatAppId = new String(source.WechatAppId);
        }
        if (source.WechatTimeStamp != null) {
            this.WechatTimeStamp = new String(source.WechatTimeStamp);
        }
        if (source.WechatNonceStr != null) {
            this.WechatNonceStr = new String(source.WechatNonceStr);
        }
        if (source.WechatSignType != null) {
            this.WechatSignType = new String(source.WechatSignType);
        }
        if (source.WechatPackage != null) {
            this.WechatPackage = new String(source.WechatPackage);
        }
        if (source.WechatPaySign != null) {
            this.WechatPaySign = new String(source.WechatPaySign);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrderNo", this.OrderNo);
        this.setParamSimple(map, prefix + "DeveloperNo", this.DeveloperNo);
        this.setParamSimple(map, prefix + "TradeDiscountAmount", this.TradeDiscountAmount);
        this.setParamSimple(map, prefix + "PayName", this.PayName);
        this.setParamSimple(map, prefix + "OrderMerchantId", this.OrderMerchantId);
        this.setParamSimple(map, prefix + "TradeAccount", this.TradeAccount);
        this.setParamSimple(map, prefix + "TradeAmount", this.TradeAmount);
        this.setParamSimple(map, prefix + "CurrencySign", this.CurrencySign);
        this.setParamSimple(map, prefix + "TradePayTime", this.TradePayTime);
        this.setParamSimple(map, prefix + "ShopOrderId", this.ShopOrderId);
        this.setParamSimple(map, prefix + "PayTag", this.PayTag);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "OrderCurrency", this.OrderCurrency);
        this.setParamSimple(map, prefix + "TradeQrcode", this.TradeQrcode);
        this.setParamSimple(map, prefix + "WechatAppId", this.WechatAppId);
        this.setParamSimple(map, prefix + "WechatTimeStamp", this.WechatTimeStamp);
        this.setParamSimple(map, prefix + "WechatNonceStr", this.WechatNonceStr);
        this.setParamSimple(map, prefix + "WechatSignType", this.WechatSignType);
        this.setParamSimple(map, prefix + "WechatPackage", this.WechatPackage);
        this.setParamSimple(map, prefix + "WechatPaySign", this.WechatPaySign);

    }
}

