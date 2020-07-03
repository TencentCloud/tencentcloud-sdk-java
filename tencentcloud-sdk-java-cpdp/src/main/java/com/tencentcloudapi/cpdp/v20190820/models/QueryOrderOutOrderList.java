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

public class QueryOrderOutOrderList extends AbstractModel{

    /**
    * 聚鑫分配的支付主MidasAppId
    */
    @SerializedName("MidasAppId")
    @Expose
    private String MidasAppId;

    /**
    * 支付金额，单位：分
    */
    @SerializedName("Amt")
    @Expose
    private Long Amt;

    /**
    * 用户Id
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 现金支付金额
    */
    @SerializedName("CashAmt")
    @Expose
    private String CashAmt;

    /**
    * 发货标识，由业务在调用聚鑫下单 接口的时候下发
    */
    @SerializedName("Metadata")
    @Expose
    private String Metadata;

    /**
    * 支付时间unix时间戳
    */
    @SerializedName("PayTime")
    @Expose
    private String PayTime;

    /**
    * 抵扣券金额
    */
    @SerializedName("CouponAmt")
    @Expose
    private String CouponAmt;

    /**
    * 下单时间unix时间戳
    */
    @SerializedName("OrderTime")
    @Expose
    private String OrderTime;

    /**
    * 物品id
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 高速场景信息
    */
    @SerializedName("SceneInfo")
    @Expose
    private String SceneInfo;

    /**
    * 当前订单的订单状态 
0：初始状态，获取聚鑫交易订单成功；  
1：拉起聚鑫支付页面成功，用户未 支付；
2：用户支付成功，正在发货；
3：用户支付成功，发货失败；
4：用户支付成功，发货成功；
5：聚鑫支付页面正在失效中；
6：聚鑫支付页面已经失效；
    */
    @SerializedName("OrderState")
    @Expose
    private String OrderState;

    /**
    * 支付渠道：wechat：微信支付;
qqwallet：QQ钱包;
bank：网银
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
    * 是否曾退款
    */
    @SerializedName("RefundFlag")
    @Expose
    private String RefundFlag;

    /**
    * 务支付订单号
    */
    @SerializedName("OutTradeNo")
    @Expose
    private String OutTradeNo;

    /**
    * 商品名称
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 支付回调时间，unix时间戳
    */
    @SerializedName("CallBackTime")
    @Expose
    private String CallBackTime;

    /**
    * ISO 货币代码，CNY
    */
    @SerializedName("CurrencyType")
    @Expose
    private String CurrencyType;

    /**
    * 微校场景账户Id
    */
    @SerializedName("AcctSubAppId")
    @Expose
    private String AcctSubAppId;

    /**
    * 调用下单接口获取的聚鑫交易订单
    */
    @SerializedName("TransactionId")
    @Expose
    private String TransactionId;

    /**
    * 聚鑫内部渠道订单号
    */
    @SerializedName("ChannelOrderId")
    @Expose
    private String ChannelOrderId;

    /**
    * 调用下单接口传进来的 SubOutTradeNoList
    */
    @SerializedName("SubOrderList")
    @Expose
    private QueryOrderOutSubOrderList [] SubOrderList;

    /**
    * 支付机构订单号
    */
    @SerializedName("ChannelExternalOrderId")
    @Expose
    private String ChannelExternalOrderId;

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
     * Get 支付金额，单位：分 
     * @return Amt 支付金额，单位：分
     */
    public Long getAmt() {
        return this.Amt;
    }

    /**
     * Set 支付金额，单位：分
     * @param Amt 支付金额，单位：分
     */
    public void setAmt(Long Amt) {
        this.Amt = Amt;
    }

    /**
     * Get 用户Id 
     * @return UserId 用户Id
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户Id
     * @param UserId 用户Id
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 现金支付金额 
     * @return CashAmt 现金支付金额
     */
    public String getCashAmt() {
        return this.CashAmt;
    }

    /**
     * Set 现金支付金额
     * @param CashAmt 现金支付金额
     */
    public void setCashAmt(String CashAmt) {
        this.CashAmt = CashAmt;
    }

    /**
     * Get 发货标识，由业务在调用聚鑫下单 接口的时候下发 
     * @return Metadata 发货标识，由业务在调用聚鑫下单 接口的时候下发
     */
    public String getMetadata() {
        return this.Metadata;
    }

    /**
     * Set 发货标识，由业务在调用聚鑫下单 接口的时候下发
     * @param Metadata 发货标识，由业务在调用聚鑫下单 接口的时候下发
     */
    public void setMetadata(String Metadata) {
        this.Metadata = Metadata;
    }

    /**
     * Get 支付时间unix时间戳 
     * @return PayTime 支付时间unix时间戳
     */
    public String getPayTime() {
        return this.PayTime;
    }

    /**
     * Set 支付时间unix时间戳
     * @param PayTime 支付时间unix时间戳
     */
    public void setPayTime(String PayTime) {
        this.PayTime = PayTime;
    }

    /**
     * Get 抵扣券金额 
     * @return CouponAmt 抵扣券金额
     */
    public String getCouponAmt() {
        return this.CouponAmt;
    }

    /**
     * Set 抵扣券金额
     * @param CouponAmt 抵扣券金额
     */
    public void setCouponAmt(String CouponAmt) {
        this.CouponAmt = CouponAmt;
    }

    /**
     * Get 下单时间unix时间戳 
     * @return OrderTime 下单时间unix时间戳
     */
    public String getOrderTime() {
        return this.OrderTime;
    }

    /**
     * Set 下单时间unix时间戳
     * @param OrderTime 下单时间unix时间戳
     */
    public void setOrderTime(String OrderTime) {
        this.OrderTime = OrderTime;
    }

    /**
     * Get 物品id 
     * @return ProductId 物品id
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 物品id
     * @param ProductId 物品id
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 高速场景信息 
     * @return SceneInfo 高速场景信息
     */
    public String getSceneInfo() {
        return this.SceneInfo;
    }

    /**
     * Set 高速场景信息
     * @param SceneInfo 高速场景信息
     */
    public void setSceneInfo(String SceneInfo) {
        this.SceneInfo = SceneInfo;
    }

    /**
     * Get 当前订单的订单状态 
0：初始状态，获取聚鑫交易订单成功；  
1：拉起聚鑫支付页面成功，用户未 支付；
2：用户支付成功，正在发货；
3：用户支付成功，发货失败；
4：用户支付成功，发货成功；
5：聚鑫支付页面正在失效中；
6：聚鑫支付页面已经失效； 
     * @return OrderState 当前订单的订单状态 
0：初始状态，获取聚鑫交易订单成功；  
1：拉起聚鑫支付页面成功，用户未 支付；
2：用户支付成功，正在发货；
3：用户支付成功，发货失败；
4：用户支付成功，发货成功；
5：聚鑫支付页面正在失效中；
6：聚鑫支付页面已经失效；
     */
    public String getOrderState() {
        return this.OrderState;
    }

    /**
     * Set 当前订单的订单状态 
0：初始状态，获取聚鑫交易订单成功；  
1：拉起聚鑫支付页面成功，用户未 支付；
2：用户支付成功，正在发货；
3：用户支付成功，发货失败；
4：用户支付成功，发货成功；
5：聚鑫支付页面正在失效中；
6：聚鑫支付页面已经失效；
     * @param OrderState 当前订单的订单状态 
0：初始状态，获取聚鑫交易订单成功；  
1：拉起聚鑫支付页面成功，用户未 支付；
2：用户支付成功，正在发货；
3：用户支付成功，发货失败；
4：用户支付成功，发货成功；
5：聚鑫支付页面正在失效中；
6：聚鑫支付页面已经失效；
     */
    public void setOrderState(String OrderState) {
        this.OrderState = OrderState;
    }

    /**
     * Get 支付渠道：wechat：微信支付;
qqwallet：QQ钱包;
bank：网银 
     * @return Channel 支付渠道：wechat：微信支付;
qqwallet：QQ钱包;
bank：网银
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set 支付渠道：wechat：微信支付;
qqwallet：QQ钱包;
bank：网银
     * @param Channel 支付渠道：wechat：微信支付;
qqwallet：QQ钱包;
bank：网银
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    /**
     * Get 是否曾退款 
     * @return RefundFlag 是否曾退款
     */
    public String getRefundFlag() {
        return this.RefundFlag;
    }

    /**
     * Set 是否曾退款
     * @param RefundFlag 是否曾退款
     */
    public void setRefundFlag(String RefundFlag) {
        this.RefundFlag = RefundFlag;
    }

    /**
     * Get 务支付订单号 
     * @return OutTradeNo 务支付订单号
     */
    public String getOutTradeNo() {
        return this.OutTradeNo;
    }

    /**
     * Set 务支付订单号
     * @param OutTradeNo 务支付订单号
     */
    public void setOutTradeNo(String OutTradeNo) {
        this.OutTradeNo = OutTradeNo;
    }

    /**
     * Get 商品名称 
     * @return ProductName 商品名称
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 商品名称
     * @param ProductName 商品名称
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 支付回调时间，unix时间戳 
     * @return CallBackTime 支付回调时间，unix时间戳
     */
    public String getCallBackTime() {
        return this.CallBackTime;
    }

    /**
     * Set 支付回调时间，unix时间戳
     * @param CallBackTime 支付回调时间，unix时间戳
     */
    public void setCallBackTime(String CallBackTime) {
        this.CallBackTime = CallBackTime;
    }

    /**
     * Get ISO 货币代码，CNY 
     * @return CurrencyType ISO 货币代码，CNY
     */
    public String getCurrencyType() {
        return this.CurrencyType;
    }

    /**
     * Set ISO 货币代码，CNY
     * @param CurrencyType ISO 货币代码，CNY
     */
    public void setCurrencyType(String CurrencyType) {
        this.CurrencyType = CurrencyType;
    }

    /**
     * Get 微校场景账户Id 
     * @return AcctSubAppId 微校场景账户Id
     */
    public String getAcctSubAppId() {
        return this.AcctSubAppId;
    }

    /**
     * Set 微校场景账户Id
     * @param AcctSubAppId 微校场景账户Id
     */
    public void setAcctSubAppId(String AcctSubAppId) {
        this.AcctSubAppId = AcctSubAppId;
    }

    /**
     * Get 调用下单接口获取的聚鑫交易订单 
     * @return TransactionId 调用下单接口获取的聚鑫交易订单
     */
    public String getTransactionId() {
        return this.TransactionId;
    }

    /**
     * Set 调用下单接口获取的聚鑫交易订单
     * @param TransactionId 调用下单接口获取的聚鑫交易订单
     */
    public void setTransactionId(String TransactionId) {
        this.TransactionId = TransactionId;
    }

    /**
     * Get 聚鑫内部渠道订单号 
     * @return ChannelOrderId 聚鑫内部渠道订单号
     */
    public String getChannelOrderId() {
        return this.ChannelOrderId;
    }

    /**
     * Set 聚鑫内部渠道订单号
     * @param ChannelOrderId 聚鑫内部渠道订单号
     */
    public void setChannelOrderId(String ChannelOrderId) {
        this.ChannelOrderId = ChannelOrderId;
    }

    /**
     * Get 调用下单接口传进来的 SubOutTradeNoList 
     * @return SubOrderList 调用下单接口传进来的 SubOutTradeNoList
     */
    public QueryOrderOutSubOrderList [] getSubOrderList() {
        return this.SubOrderList;
    }

    /**
     * Set 调用下单接口传进来的 SubOutTradeNoList
     * @param SubOrderList 调用下单接口传进来的 SubOutTradeNoList
     */
    public void setSubOrderList(QueryOrderOutSubOrderList [] SubOrderList) {
        this.SubOrderList = SubOrderList;
    }

    /**
     * Get 支付机构订单号 
     * @return ChannelExternalOrderId 支付机构订单号
     */
    public String getChannelExternalOrderId() {
        return this.ChannelExternalOrderId;
    }

    /**
     * Set 支付机构订单号
     * @param ChannelExternalOrderId 支付机构订单号
     */
    public void setChannelExternalOrderId(String ChannelExternalOrderId) {
        this.ChannelExternalOrderId = ChannelExternalOrderId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MidasAppId", this.MidasAppId);
        this.setParamSimple(map, prefix + "Amt", this.Amt);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "CashAmt", this.CashAmt);
        this.setParamSimple(map, prefix + "Metadata", this.Metadata);
        this.setParamSimple(map, prefix + "PayTime", this.PayTime);
        this.setParamSimple(map, prefix + "CouponAmt", this.CouponAmt);
        this.setParamSimple(map, prefix + "OrderTime", this.OrderTime);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "SceneInfo", this.SceneInfo);
        this.setParamSimple(map, prefix + "OrderState", this.OrderState);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "RefundFlag", this.RefundFlag);
        this.setParamSimple(map, prefix + "OutTradeNo", this.OutTradeNo);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "CallBackTime", this.CallBackTime);
        this.setParamSimple(map, prefix + "CurrencyType", this.CurrencyType);
        this.setParamSimple(map, prefix + "AcctSubAppId", this.AcctSubAppId);
        this.setParamSimple(map, prefix + "TransactionId", this.TransactionId);
        this.setParamSimple(map, prefix + "ChannelOrderId", this.ChannelOrderId);
        this.setParamArrayObj(map, prefix + "SubOrderList.", this.SubOrderList);
        this.setParamSimple(map, prefix + "ChannelExternalOrderId", this.ChannelExternalOrderId);

    }
}

