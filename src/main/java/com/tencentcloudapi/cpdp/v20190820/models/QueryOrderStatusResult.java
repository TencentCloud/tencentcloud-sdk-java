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

public class QueryOrderStatusResult extends AbstractModel{

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
    * 开始交易时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TradeTime")
    @Expose
    private String TradeTime;

    /**
    * 折扣金额（以分为单位，没有小数点）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiscountAmount")
    @Expose
    private String DiscountAmount;

    /**
    * 商户号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MerchantNo")
    @Expose
    private String MerchantNo;

    /**
    * 订单备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 订单标题
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrderName")
    @Expose
    private String OrderName;

    /**
    * 原始金额（以分为单位，没有小数点）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginalAmount")
    @Expose
    private String OriginalAmount;

    /**
    * 门店编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShopNo")
    @Expose
    private String ShopNo;

    /**
    * 收单机构原始交易数据，如果返回非标准json数据，请自行转换
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TradeResult")
    @Expose
    private String TradeResult;

    /**
    * 订单流水号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * 订单类型（1消费，2辙单）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

    /**
    * 收单机构交易号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TradeNo")
    @Expose
    private String TradeNo;

    /**
    * 原始订单号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginalOrderNo")
    @Expose
    private String OriginalOrderNo;

    /**
    * 订单标记，订单附加数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * 下单时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * 收银员编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CashierId")
    @Expose
    private String CashierId;

    /**
    * 收银员名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CashierRealName")
    @Expose
    private String CashierRealName;

    /**
    * 店铺全称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShopFullName")
    @Expose
    private String ShopFullName;

    /**
    * 店铺名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShopName")
    @Expose
    private String ShopName;

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
     * Get 开始交易时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TradeTime 开始交易时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTradeTime() {
        return this.TradeTime;
    }

    /**
     * Set 开始交易时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param TradeTime 开始交易时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTradeTime(String TradeTime) {
        this.TradeTime = TradeTime;
    }

    /**
     * Get 折扣金额（以分为单位，没有小数点）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiscountAmount 折扣金额（以分为单位，没有小数点）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiscountAmount() {
        return this.DiscountAmount;
    }

    /**
     * Set 折扣金额（以分为单位，没有小数点）
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiscountAmount 折扣金额（以分为单位，没有小数点）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiscountAmount(String DiscountAmount) {
        this.DiscountAmount = DiscountAmount;
    }

    /**
     * Get 商户号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MerchantNo 商户号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMerchantNo() {
        return this.MerchantNo;
    }

    /**
     * Set 商户号
注意：此字段可能返回 null，表示取不到有效值。
     * @param MerchantNo 商户号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMerchantNo(String MerchantNo) {
        this.MerchantNo = MerchantNo;
    }

    /**
     * Get 订单备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 订单备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 订单备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 订单备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 订单标题
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrderName 订单标题
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrderName() {
        return this.OrderName;
    }

    /**
     * Set 订单标题
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrderName 订单标题
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrderName(String OrderName) {
        this.OrderName = OrderName;
    }

    /**
     * Get 原始金额（以分为单位，没有小数点）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginalAmount 原始金额（以分为单位，没有小数点）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOriginalAmount() {
        return this.OriginalAmount;
    }

    /**
     * Set 原始金额（以分为单位，没有小数点）
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginalAmount 原始金额（以分为单位，没有小数点）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginalAmount(String OriginalAmount) {
        this.OriginalAmount = OriginalAmount;
    }

    /**
     * Get 门店编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShopNo 门店编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getShopNo() {
        return this.ShopNo;
    }

    /**
     * Set 门店编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShopNo 门店编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShopNo(String ShopNo) {
        this.ShopNo = ShopNo;
    }

    /**
     * Get 收单机构原始交易数据，如果返回非标准json数据，请自行转换
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TradeResult 收单机构原始交易数据，如果返回非标准json数据，请自行转换
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTradeResult() {
        return this.TradeResult;
    }

    /**
     * Set 收单机构原始交易数据，如果返回非标准json数据，请自行转换
注意：此字段可能返回 null，表示取不到有效值。
     * @param TradeResult 收单机构原始交易数据，如果返回非标准json数据，请自行转换
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTradeResult(String TradeResult) {
        this.TradeResult = TradeResult;
    }

    /**
     * Get 订单流水号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrderId 订单流水号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 订单流水号
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrderId 订单流水号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get 订单类型（1消费，2辙单）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrderType 订单类型（1消费，2辙单）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 订单类型（1消费，2辙单）
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrderType 订单类型（1消费，2辙单）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get 收单机构交易号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TradeNo 收单机构交易号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTradeNo() {
        return this.TradeNo;
    }

    /**
     * Set 收单机构交易号
注意：此字段可能返回 null，表示取不到有效值。
     * @param TradeNo 收单机构交易号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTradeNo(String TradeNo) {
        this.TradeNo = TradeNo;
    }

    /**
     * Get 原始订单号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginalOrderNo 原始订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOriginalOrderNo() {
        return this.OriginalOrderNo;
    }

    /**
     * Set 原始订单号
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginalOrderNo 原始订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginalOrderNo(String OriginalOrderNo) {
        this.OriginalOrderNo = OriginalOrderNo;
    }

    /**
     * Get 订单标记，订单附加数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tag 订单标记，订单附加数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set 订单标记，订单附加数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tag 订单标记，订单附加数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get 下单时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AddTime 下单时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set 下单时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param AddTime 下单时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get 收银员编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CashierId 收银员编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCashierId() {
        return this.CashierId;
    }

    /**
     * Set 收银员编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param CashierId 收银员编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCashierId(String CashierId) {
        this.CashierId = CashierId;
    }

    /**
     * Get 收银员名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CashierRealName 收银员名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCashierRealName() {
        return this.CashierRealName;
    }

    /**
     * Set 收银员名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param CashierRealName 收银员名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCashierRealName(String CashierRealName) {
        this.CashierRealName = CashierRealName;
    }

    /**
     * Get 店铺全称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShopFullName 店铺全称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getShopFullName() {
        return this.ShopFullName;
    }

    /**
     * Set 店铺全称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShopFullName 店铺全称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShopFullName(String ShopFullName) {
        this.ShopFullName = ShopFullName;
    }

    /**
     * Get 店铺名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShopName 店铺名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getShopName() {
        return this.ShopName;
    }

    /**
     * Set 店铺名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShopName 店铺名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShopName(String ShopName) {
        this.ShopName = ShopName;
    }

    public QueryOrderStatusResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryOrderStatusResult(QueryOrderStatusResult source) {
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
        if (source.TradeTime != null) {
            this.TradeTime = new String(source.TradeTime);
        }
        if (source.DiscountAmount != null) {
            this.DiscountAmount = new String(source.DiscountAmount);
        }
        if (source.MerchantNo != null) {
            this.MerchantNo = new String(source.MerchantNo);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.OrderName != null) {
            this.OrderName = new String(source.OrderName);
        }
        if (source.OriginalAmount != null) {
            this.OriginalAmount = new String(source.OriginalAmount);
        }
        if (source.ShopNo != null) {
            this.ShopNo = new String(source.ShopNo);
        }
        if (source.TradeResult != null) {
            this.TradeResult = new String(source.TradeResult);
        }
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.OrderType != null) {
            this.OrderType = new String(source.OrderType);
        }
        if (source.TradeNo != null) {
            this.TradeNo = new String(source.TradeNo);
        }
        if (source.OriginalOrderNo != null) {
            this.OriginalOrderNo = new String(source.OriginalOrderNo);
        }
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
        if (source.AddTime != null) {
            this.AddTime = new String(source.AddTime);
        }
        if (source.CashierId != null) {
            this.CashierId = new String(source.CashierId);
        }
        if (source.CashierRealName != null) {
            this.CashierRealName = new String(source.CashierRealName);
        }
        if (source.ShopFullName != null) {
            this.ShopFullName = new String(source.ShopFullName);
        }
        if (source.ShopName != null) {
            this.ShopName = new String(source.ShopName);
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
        this.setParamSimple(map, prefix + "TradeTime", this.TradeTime);
        this.setParamSimple(map, prefix + "DiscountAmount", this.DiscountAmount);
        this.setParamSimple(map, prefix + "MerchantNo", this.MerchantNo);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "OrderName", this.OrderName);
        this.setParamSimple(map, prefix + "OriginalAmount", this.OriginalAmount);
        this.setParamSimple(map, prefix + "ShopNo", this.ShopNo);
        this.setParamSimple(map, prefix + "TradeResult", this.TradeResult);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "TradeNo", this.TradeNo);
        this.setParamSimple(map, prefix + "OriginalOrderNo", this.OriginalOrderNo);
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "CashierId", this.CashierId);
        this.setParamSimple(map, prefix + "CashierRealName", this.CashierRealName);
        this.setParamSimple(map, prefix + "ShopFullName", this.ShopFullName);
        this.setParamSimple(map, prefix + "ShopName", this.ShopName);

    }
}

