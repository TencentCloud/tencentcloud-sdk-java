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

public class UnifiedCloudOrderRequest extends AbstractModel{

    /**
    * 米大师分配的支付主MidasAppId
    */
    @SerializedName("MidasAppId")
    @Expose
    private String MidasAppId;

    /**
    * 用户ID
长度不小于5位，仅支持字母和数字的组合，长度限制以具体接入渠道为准
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 开发者主订单号
支付订单号，仅支持数字、字母、下划线（_）、横杠字符（-）、点（.）的组合，长度供参考，部分渠道存在长度更短的情况接入时请联系开发咨询
    */
    @SerializedName("OutTradeNo")
    @Expose
    private String OutTradeNo;

    /**
    * 货币类型
ISO货币代码，CNY
    */
    @SerializedName("CurrencyType")
    @Expose
    private String CurrencyType;

    /**
    * 商品ID
业务自定义的商品id，仅支持数字、字母、下划线（_）、横杠字符（-）、点（.）的组合。
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 商品名称
业务自定义的商品名称，无需URL编码，长度限制以具体所接入渠道为准。
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 商品详情
业务自定义的商品详情，无需URL编码，长度限制以具体所接入渠道为准。
    */
    @SerializedName("ProductDetail")
    @Expose
    private String ProductDetail;

    /**
    * 原始金额
单位：分，需要注意的是，OriginalAmt>=TotalAmt
    */
    @SerializedName("OriginalAmt")
    @Expose
    private Long OriginalAmt;

    /**
    * 支付金额
单位：分，需要注意的是，TotalAmt=TotalPlatformIncome+TotalMchIncome。
    */
    @SerializedName("TotalAmt")
    @Expose
    private Long TotalAmt;

    /**
    * 环境类型
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
    */
    @SerializedName("MidasEnvironment")
    @Expose
    private String MidasEnvironment;

    /**
    * 支付SubAppId
米大师计费SubAppId，代表子商户。指定使用该商户的商户号下单时必传。
    */
    @SerializedName("SubAppId")
    @Expose
    private String SubAppId;

    /**
    * 顶层支付渠道
银行收单:
openbank_ccb: 建设银行
openbank_icbc: 工商银行
openbank_cmb: 招商银行
openbank_ping: 平安银行
openbank_icbc_jft：工商银行聚付通
非银行收单，可以为空
    */
    @SerializedName("RealChannel")
    @Expose
    private String RealChannel;

    /**
    * 支付渠道
wechat：微信支付
wechat_ecommerce: 微信电商收付通
open_alipay: 支付宝
open_quickpass: 银联云闪付
icbc_epay: 工银e支付
foreign_cardpay: 外卡支付
icbc_jft_wechat: 工行聚付通-微信
icbc_jft_alipay: 工行聚付通-支付宝
icbc_jft_epay: 工行聚付通-e支付
指定渠道下单时必传
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
    * 透传字段
支付成功回调透传给应用，用于开发者透传自定义内容。
    */
    @SerializedName("Metadata")
    @Expose
    private String Metadata;

    /**
    * 数量
购买数量,不传默认为1。
    */
    @SerializedName("Quantity")
    @Expose
    private Long Quantity;

    /**
    * Web端回调地址
Web端网页回调地址，仅当Web端SDK使用页面跳转方式时有效。
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * 支付取消地址
    */
    @SerializedName("CancelUrl")
    @Expose
    private String CancelUrl;

    /**
    * 微信AppId
wechat渠道或wchat_ecommerce渠道可以指定下单时的wxappid。
    */
    @SerializedName("WxAppId")
    @Expose
    private String WxAppId;

    /**
    * 微信SubAppId
wechat渠道可以指定下单时的sub_appid。
    */
    @SerializedName("WxSubAppId")
    @Expose
    private String WxSubAppId;

    /**
    * 微信公众号/小程序OpenId
微信公众号/小程序支付时为必选，需要传微信下的openid。
    */
    @SerializedName("WxOpenId")
    @Expose
    private String WxOpenId;

    /**
    * 微信公众号/小程序SubOpenId
在服务商模式下，微信公众号/小程序支付时wx_sub_openid和wx_openid二选一。
    */
    @SerializedName("WxSubOpenId")
    @Expose
    private String WxSubOpenId;

    /**
    * 平台应收金额
单位：分，需要注意的是，TotalAmt=TotalPlatformIncome+TotalMchIncome
    */
    @SerializedName("TotalPlatformIncome")
    @Expose
    private Long TotalPlatformIncome;

    /**
    * 结算应收金额
单位：分，需要注意的是，TotalAmt=TotalPlatformIncome+TotalMchIncome
    */
    @SerializedName("TotalMchIncome")
    @Expose
    private Long TotalMchIncome;

    /**
    * 子订单列表
格式：子订单号、子应用Id、金额。压缩后最长不可超过32K字节(去除空格，换行，制表符等无意义字符)。
    */
    @SerializedName("SubOrderList")
    @Expose
    private CloudSubOrder [] SubOrderList;

    /**
    * 结算信息
例如是否需要分账、是否需要支付确认等，
注意：如果子单列表中传入了SettleInfo，在主单中不可再传入SettleInfo字段。
    */
    @SerializedName("SettleInfo")
    @Expose
    private CloudSettleInfo SettleInfo;

    /**
    * 附加项信息列表
例如溢价信息、抵扣信息、积分信息、补贴信息
通过该字段可以实现渠道方的优惠抵扣补贴等营销功能
注意：当传SubOrderList时，请在子单信息中传附加项信息，不要在主单中传该字段。
    */
    @SerializedName("AttachmentInfoList")
    @Expose
    private CloudAttachmentInfo [] AttachmentInfoList;

    /**
    * 支付通知地址
调用方可通过该字段传入自定义支付通知地址。
    */
    @SerializedName("PaymentNotifyUrl")
    @Expose
    private String PaymentNotifyUrl;

    /**
    * 支付场景
需要结合 RealChannel和Channel字段使用可选值:
wechat-app 微信APP支付方式
wechat-mini 微信小程序支付，示例：当 RealChannel=wechat Channel=wechat PayScene=wechat-mini时，内部会直接以小程序方式调用微信统一下单接口。
    */
    @SerializedName("PayScene")
    @Expose
    private String PayScene;

    /**
    * 语言代码
取值请参考[ISO 639-1代码表](https://zh.wikipedia.org/zh-cn/ISO_639-1%E4%BB%A3%E7%A0%81%E8%A1%A8)
    */
    @SerializedName("LocaleCode")
    @Expose
    private String LocaleCode;

    /**
    * 地区代码
取值请参考[ISO 3166-1二位字母代码表](https://zh.wikipedia.org/zh-cn/ISO_3166-1%E4%BA%8C%E4%BD%8D%E5%AD%97%E6%AF%8D%E4%BB%A3%E7%A0%81#%E6%AD%A3%E5%BC%8F%E5%88%86%E9%85%8D%E4%BB%A3%E7%A0%81)
    */
    @SerializedName("RegionCode")
    @Expose
    private String RegionCode;

    /**
    * 用户IP
请求用户的IP地址，特定的渠道或特定的支付方式，此字段为必填
wechat_ecommerce渠道 - h5支付方式，此字段必填。
    */
    @SerializedName("UserClientIp")
    @Expose
    private String UserClientIp;

    /**
    * 渠道订单号生成模式
枚举值。决定请求渠道方时的订单号的生成模式，详情请联系米大师沟通。不指定时默认为由米大师自行生成。
    */
    @SerializedName("ChannelOrderIdMode")
    @Expose
    private String ChannelOrderIdMode;

    /**
    * 全局支付时间信息
    */
    @SerializedName("GlobalPayTimeInfo")
    @Expose
    private CloudGlobalPayTimeInfo GlobalPayTimeInfo;

    /**
    * 渠道应用ID取用方式
USE_APPID 使用渠道应用Id;
USE_SUB_APPID 使用子渠道应用Id;
USE_APPID_AND_SUB_APPID 既使用渠道应用Id也使用子渠道应用ID。
    */
    @SerializedName("ChannelAppIdPolicy")
    @Expose
    private String ChannelAppIdPolicy;

    /**
    * 门店信息
特定的渠道或特定的支付方式，此字段为必填
wechat_ecommerce渠道 - h5支付方式，此字段必填
    */
    @SerializedName("StoreInfo")
    @Expose
    private CloudStoreInfo StoreInfo;

    /**
    * 客户端信息
特定的渠道或特定的支付方式，此字段为必填
wechat_ecommerce渠道 - h5支付方式，此字段必填
    */
    @SerializedName("ClientInfo")
    @Expose
    private CloudClientInfo ClientInfo;

    /**
    * 渠道扩展促销列表
可将各个渠道的促销信息放于该列表。
    */
    @SerializedName("ExternalPromptGroupList")
    @Expose
    private CloudExternalPromptGroup [] ExternalPromptGroupList;

    /**
    * 收单模式
ORDER_RECEIVE_MODE_COMMON - 普通支付
ORDER_RECEIVE_MODE_COMBINE - 合单支付
ORDER_RECEIVE_MODE_V_COMBINE - 虚拟合单支付
若不传入该字段，则会根据是否传入子单来判断是 普通支付 还是 合单支付
    */
    @SerializedName("OrderReceiveMode")
    @Expose
    private String OrderReceiveMode;

    /**
     * Get 米大师分配的支付主MidasAppId 
     * @return MidasAppId 米大师分配的支付主MidasAppId
     */
    public String getMidasAppId() {
        return this.MidasAppId;
    }

    /**
     * Set 米大师分配的支付主MidasAppId
     * @param MidasAppId 米大师分配的支付主MidasAppId
     */
    public void setMidasAppId(String MidasAppId) {
        this.MidasAppId = MidasAppId;
    }

    /**
     * Get 用户ID
长度不小于5位，仅支持字母和数字的组合，长度限制以具体接入渠道为准 
     * @return UserId 用户ID
长度不小于5位，仅支持字母和数字的组合，长度限制以具体接入渠道为准
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户ID
长度不小于5位，仅支持字母和数字的组合，长度限制以具体接入渠道为准
     * @param UserId 用户ID
长度不小于5位，仅支持字母和数字的组合，长度限制以具体接入渠道为准
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 开发者主订单号
支付订单号，仅支持数字、字母、下划线（_）、横杠字符（-）、点（.）的组合，长度供参考，部分渠道存在长度更短的情况接入时请联系开发咨询 
     * @return OutTradeNo 开发者主订单号
支付订单号，仅支持数字、字母、下划线（_）、横杠字符（-）、点（.）的组合，长度供参考，部分渠道存在长度更短的情况接入时请联系开发咨询
     */
    public String getOutTradeNo() {
        return this.OutTradeNo;
    }

    /**
     * Set 开发者主订单号
支付订单号，仅支持数字、字母、下划线（_）、横杠字符（-）、点（.）的组合，长度供参考，部分渠道存在长度更短的情况接入时请联系开发咨询
     * @param OutTradeNo 开发者主订单号
支付订单号，仅支持数字、字母、下划线（_）、横杠字符（-）、点（.）的组合，长度供参考，部分渠道存在长度更短的情况接入时请联系开发咨询
     */
    public void setOutTradeNo(String OutTradeNo) {
        this.OutTradeNo = OutTradeNo;
    }

    /**
     * Get 货币类型
ISO货币代码，CNY 
     * @return CurrencyType 货币类型
ISO货币代码，CNY
     */
    public String getCurrencyType() {
        return this.CurrencyType;
    }

    /**
     * Set 货币类型
ISO货币代码，CNY
     * @param CurrencyType 货币类型
ISO货币代码，CNY
     */
    public void setCurrencyType(String CurrencyType) {
        this.CurrencyType = CurrencyType;
    }

    /**
     * Get 商品ID
业务自定义的商品id，仅支持数字、字母、下划线（_）、横杠字符（-）、点（.）的组合。 
     * @return ProductId 商品ID
业务自定义的商品id，仅支持数字、字母、下划线（_）、横杠字符（-）、点（.）的组合。
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 商品ID
业务自定义的商品id，仅支持数字、字母、下划线（_）、横杠字符（-）、点（.）的组合。
     * @param ProductId 商品ID
业务自定义的商品id，仅支持数字、字母、下划线（_）、横杠字符（-）、点（.）的组合。
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 商品名称
业务自定义的商品名称，无需URL编码，长度限制以具体所接入渠道为准。 
     * @return ProductName 商品名称
业务自定义的商品名称，无需URL编码，长度限制以具体所接入渠道为准。
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 商品名称
业务自定义的商品名称，无需URL编码，长度限制以具体所接入渠道为准。
     * @param ProductName 商品名称
业务自定义的商品名称，无需URL编码，长度限制以具体所接入渠道为准。
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 商品详情
业务自定义的商品详情，无需URL编码，长度限制以具体所接入渠道为准。 
     * @return ProductDetail 商品详情
业务自定义的商品详情，无需URL编码，长度限制以具体所接入渠道为准。
     */
    public String getProductDetail() {
        return this.ProductDetail;
    }

    /**
     * Set 商品详情
业务自定义的商品详情，无需URL编码，长度限制以具体所接入渠道为准。
     * @param ProductDetail 商品详情
业务自定义的商品详情，无需URL编码，长度限制以具体所接入渠道为准。
     */
    public void setProductDetail(String ProductDetail) {
        this.ProductDetail = ProductDetail;
    }

    /**
     * Get 原始金额
单位：分，需要注意的是，OriginalAmt>=TotalAmt 
     * @return OriginalAmt 原始金额
单位：分，需要注意的是，OriginalAmt>=TotalAmt
     */
    public Long getOriginalAmt() {
        return this.OriginalAmt;
    }

    /**
     * Set 原始金额
单位：分，需要注意的是，OriginalAmt>=TotalAmt
     * @param OriginalAmt 原始金额
单位：分，需要注意的是，OriginalAmt>=TotalAmt
     */
    public void setOriginalAmt(Long OriginalAmt) {
        this.OriginalAmt = OriginalAmt;
    }

    /**
     * Get 支付金额
单位：分，需要注意的是，TotalAmt=TotalPlatformIncome+TotalMchIncome。 
     * @return TotalAmt 支付金额
单位：分，需要注意的是，TotalAmt=TotalPlatformIncome+TotalMchIncome。
     */
    public Long getTotalAmt() {
        return this.TotalAmt;
    }

    /**
     * Set 支付金额
单位：分，需要注意的是，TotalAmt=TotalPlatformIncome+TotalMchIncome。
     * @param TotalAmt 支付金额
单位：分，需要注意的是，TotalAmt=TotalPlatformIncome+TotalMchIncome。
     */
    public void setTotalAmt(Long TotalAmt) {
        this.TotalAmt = TotalAmt;
    }

    /**
     * Get 环境类型
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_ 
     * @return MidasEnvironment 环境类型
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
     */
    public String getMidasEnvironment() {
        return this.MidasEnvironment;
    }

    /**
     * Set 环境类型
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
     * @param MidasEnvironment 环境类型
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
     */
    public void setMidasEnvironment(String MidasEnvironment) {
        this.MidasEnvironment = MidasEnvironment;
    }

    /**
     * Get 支付SubAppId
米大师计费SubAppId，代表子商户。指定使用该商户的商户号下单时必传。 
     * @return SubAppId 支付SubAppId
米大师计费SubAppId，代表子商户。指定使用该商户的商户号下单时必传。
     */
    public String getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 支付SubAppId
米大师计费SubAppId，代表子商户。指定使用该商户的商户号下单时必传。
     * @param SubAppId 支付SubAppId
米大师计费SubAppId，代表子商户。指定使用该商户的商户号下单时必传。
     */
    public void setSubAppId(String SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get 顶层支付渠道
银行收单:
openbank_ccb: 建设银行
openbank_icbc: 工商银行
openbank_cmb: 招商银行
openbank_ping: 平安银行
openbank_icbc_jft：工商银行聚付通
非银行收单，可以为空 
     * @return RealChannel 顶层支付渠道
银行收单:
openbank_ccb: 建设银行
openbank_icbc: 工商银行
openbank_cmb: 招商银行
openbank_ping: 平安银行
openbank_icbc_jft：工商银行聚付通
非银行收单，可以为空
     */
    public String getRealChannel() {
        return this.RealChannel;
    }

    /**
     * Set 顶层支付渠道
银行收单:
openbank_ccb: 建设银行
openbank_icbc: 工商银行
openbank_cmb: 招商银行
openbank_ping: 平安银行
openbank_icbc_jft：工商银行聚付通
非银行收单，可以为空
     * @param RealChannel 顶层支付渠道
银行收单:
openbank_ccb: 建设银行
openbank_icbc: 工商银行
openbank_cmb: 招商银行
openbank_ping: 平安银行
openbank_icbc_jft：工商银行聚付通
非银行收单，可以为空
     */
    public void setRealChannel(String RealChannel) {
        this.RealChannel = RealChannel;
    }

    /**
     * Get 支付渠道
wechat：微信支付
wechat_ecommerce: 微信电商收付通
open_alipay: 支付宝
open_quickpass: 银联云闪付
icbc_epay: 工银e支付
foreign_cardpay: 外卡支付
icbc_jft_wechat: 工行聚付通-微信
icbc_jft_alipay: 工行聚付通-支付宝
icbc_jft_epay: 工行聚付通-e支付
指定渠道下单时必传 
     * @return Channel 支付渠道
wechat：微信支付
wechat_ecommerce: 微信电商收付通
open_alipay: 支付宝
open_quickpass: 银联云闪付
icbc_epay: 工银e支付
foreign_cardpay: 外卡支付
icbc_jft_wechat: 工行聚付通-微信
icbc_jft_alipay: 工行聚付通-支付宝
icbc_jft_epay: 工行聚付通-e支付
指定渠道下单时必传
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set 支付渠道
wechat：微信支付
wechat_ecommerce: 微信电商收付通
open_alipay: 支付宝
open_quickpass: 银联云闪付
icbc_epay: 工银e支付
foreign_cardpay: 外卡支付
icbc_jft_wechat: 工行聚付通-微信
icbc_jft_alipay: 工行聚付通-支付宝
icbc_jft_epay: 工行聚付通-e支付
指定渠道下单时必传
     * @param Channel 支付渠道
wechat：微信支付
wechat_ecommerce: 微信电商收付通
open_alipay: 支付宝
open_quickpass: 银联云闪付
icbc_epay: 工银e支付
foreign_cardpay: 外卡支付
icbc_jft_wechat: 工行聚付通-微信
icbc_jft_alipay: 工行聚付通-支付宝
icbc_jft_epay: 工行聚付通-e支付
指定渠道下单时必传
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    /**
     * Get 透传字段
支付成功回调透传给应用，用于开发者透传自定义内容。 
     * @return Metadata 透传字段
支付成功回调透传给应用，用于开发者透传自定义内容。
     */
    public String getMetadata() {
        return this.Metadata;
    }

    /**
     * Set 透传字段
支付成功回调透传给应用，用于开发者透传自定义内容。
     * @param Metadata 透传字段
支付成功回调透传给应用，用于开发者透传自定义内容。
     */
    public void setMetadata(String Metadata) {
        this.Metadata = Metadata;
    }

    /**
     * Get 数量
购买数量,不传默认为1。 
     * @return Quantity 数量
购买数量,不传默认为1。
     */
    public Long getQuantity() {
        return this.Quantity;
    }

    /**
     * Set 数量
购买数量,不传默认为1。
     * @param Quantity 数量
购买数量,不传默认为1。
     */
    public void setQuantity(Long Quantity) {
        this.Quantity = Quantity;
    }

    /**
     * Get Web端回调地址
Web端网页回调地址，仅当Web端SDK使用页面跳转方式时有效。 
     * @return CallbackUrl Web端回调地址
Web端网页回调地址，仅当Web端SDK使用页面跳转方式时有效。
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set Web端回调地址
Web端网页回调地址，仅当Web端SDK使用页面跳转方式时有效。
     * @param CallbackUrl Web端回调地址
Web端网页回调地址，仅当Web端SDK使用页面跳转方式时有效。
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get 支付取消地址 
     * @return CancelUrl 支付取消地址
     */
    public String getCancelUrl() {
        return this.CancelUrl;
    }

    /**
     * Set 支付取消地址
     * @param CancelUrl 支付取消地址
     */
    public void setCancelUrl(String CancelUrl) {
        this.CancelUrl = CancelUrl;
    }

    /**
     * Get 微信AppId
wechat渠道或wchat_ecommerce渠道可以指定下单时的wxappid。 
     * @return WxAppId 微信AppId
wechat渠道或wchat_ecommerce渠道可以指定下单时的wxappid。
     */
    public String getWxAppId() {
        return this.WxAppId;
    }

    /**
     * Set 微信AppId
wechat渠道或wchat_ecommerce渠道可以指定下单时的wxappid。
     * @param WxAppId 微信AppId
wechat渠道或wchat_ecommerce渠道可以指定下单时的wxappid。
     */
    public void setWxAppId(String WxAppId) {
        this.WxAppId = WxAppId;
    }

    /**
     * Get 微信SubAppId
wechat渠道可以指定下单时的sub_appid。 
     * @return WxSubAppId 微信SubAppId
wechat渠道可以指定下单时的sub_appid。
     */
    public String getWxSubAppId() {
        return this.WxSubAppId;
    }

    /**
     * Set 微信SubAppId
wechat渠道可以指定下单时的sub_appid。
     * @param WxSubAppId 微信SubAppId
wechat渠道可以指定下单时的sub_appid。
     */
    public void setWxSubAppId(String WxSubAppId) {
        this.WxSubAppId = WxSubAppId;
    }

    /**
     * Get 微信公众号/小程序OpenId
微信公众号/小程序支付时为必选，需要传微信下的openid。 
     * @return WxOpenId 微信公众号/小程序OpenId
微信公众号/小程序支付时为必选，需要传微信下的openid。
     */
    public String getWxOpenId() {
        return this.WxOpenId;
    }

    /**
     * Set 微信公众号/小程序OpenId
微信公众号/小程序支付时为必选，需要传微信下的openid。
     * @param WxOpenId 微信公众号/小程序OpenId
微信公众号/小程序支付时为必选，需要传微信下的openid。
     */
    public void setWxOpenId(String WxOpenId) {
        this.WxOpenId = WxOpenId;
    }

    /**
     * Get 微信公众号/小程序SubOpenId
在服务商模式下，微信公众号/小程序支付时wx_sub_openid和wx_openid二选一。 
     * @return WxSubOpenId 微信公众号/小程序SubOpenId
在服务商模式下，微信公众号/小程序支付时wx_sub_openid和wx_openid二选一。
     */
    public String getWxSubOpenId() {
        return this.WxSubOpenId;
    }

    /**
     * Set 微信公众号/小程序SubOpenId
在服务商模式下，微信公众号/小程序支付时wx_sub_openid和wx_openid二选一。
     * @param WxSubOpenId 微信公众号/小程序SubOpenId
在服务商模式下，微信公众号/小程序支付时wx_sub_openid和wx_openid二选一。
     */
    public void setWxSubOpenId(String WxSubOpenId) {
        this.WxSubOpenId = WxSubOpenId;
    }

    /**
     * Get 平台应收金额
单位：分，需要注意的是，TotalAmt=TotalPlatformIncome+TotalMchIncome 
     * @return TotalPlatformIncome 平台应收金额
单位：分，需要注意的是，TotalAmt=TotalPlatformIncome+TotalMchIncome
     */
    public Long getTotalPlatformIncome() {
        return this.TotalPlatformIncome;
    }

    /**
     * Set 平台应收金额
单位：分，需要注意的是，TotalAmt=TotalPlatformIncome+TotalMchIncome
     * @param TotalPlatformIncome 平台应收金额
单位：分，需要注意的是，TotalAmt=TotalPlatformIncome+TotalMchIncome
     */
    public void setTotalPlatformIncome(Long TotalPlatformIncome) {
        this.TotalPlatformIncome = TotalPlatformIncome;
    }

    /**
     * Get 结算应收金额
单位：分，需要注意的是，TotalAmt=TotalPlatformIncome+TotalMchIncome 
     * @return TotalMchIncome 结算应收金额
单位：分，需要注意的是，TotalAmt=TotalPlatformIncome+TotalMchIncome
     */
    public Long getTotalMchIncome() {
        return this.TotalMchIncome;
    }

    /**
     * Set 结算应收金额
单位：分，需要注意的是，TotalAmt=TotalPlatformIncome+TotalMchIncome
     * @param TotalMchIncome 结算应收金额
单位：分，需要注意的是，TotalAmt=TotalPlatformIncome+TotalMchIncome
     */
    public void setTotalMchIncome(Long TotalMchIncome) {
        this.TotalMchIncome = TotalMchIncome;
    }

    /**
     * Get 子订单列表
格式：子订单号、子应用Id、金额。压缩后最长不可超过32K字节(去除空格，换行，制表符等无意义字符)。 
     * @return SubOrderList 子订单列表
格式：子订单号、子应用Id、金额。压缩后最长不可超过32K字节(去除空格，换行，制表符等无意义字符)。
     */
    public CloudSubOrder [] getSubOrderList() {
        return this.SubOrderList;
    }

    /**
     * Set 子订单列表
格式：子订单号、子应用Id、金额。压缩后最长不可超过32K字节(去除空格，换行，制表符等无意义字符)。
     * @param SubOrderList 子订单列表
格式：子订单号、子应用Id、金额。压缩后最长不可超过32K字节(去除空格，换行，制表符等无意义字符)。
     */
    public void setSubOrderList(CloudSubOrder [] SubOrderList) {
        this.SubOrderList = SubOrderList;
    }

    /**
     * Get 结算信息
例如是否需要分账、是否需要支付确认等，
注意：如果子单列表中传入了SettleInfo，在主单中不可再传入SettleInfo字段。 
     * @return SettleInfo 结算信息
例如是否需要分账、是否需要支付确认等，
注意：如果子单列表中传入了SettleInfo，在主单中不可再传入SettleInfo字段。
     */
    public CloudSettleInfo getSettleInfo() {
        return this.SettleInfo;
    }

    /**
     * Set 结算信息
例如是否需要分账、是否需要支付确认等，
注意：如果子单列表中传入了SettleInfo，在主单中不可再传入SettleInfo字段。
     * @param SettleInfo 结算信息
例如是否需要分账、是否需要支付确认等，
注意：如果子单列表中传入了SettleInfo，在主单中不可再传入SettleInfo字段。
     */
    public void setSettleInfo(CloudSettleInfo SettleInfo) {
        this.SettleInfo = SettleInfo;
    }

    /**
     * Get 附加项信息列表
例如溢价信息、抵扣信息、积分信息、补贴信息
通过该字段可以实现渠道方的优惠抵扣补贴等营销功能
注意：当传SubOrderList时，请在子单信息中传附加项信息，不要在主单中传该字段。 
     * @return AttachmentInfoList 附加项信息列表
例如溢价信息、抵扣信息、积分信息、补贴信息
通过该字段可以实现渠道方的优惠抵扣补贴等营销功能
注意：当传SubOrderList时，请在子单信息中传附加项信息，不要在主单中传该字段。
     */
    public CloudAttachmentInfo [] getAttachmentInfoList() {
        return this.AttachmentInfoList;
    }

    /**
     * Set 附加项信息列表
例如溢价信息、抵扣信息、积分信息、补贴信息
通过该字段可以实现渠道方的优惠抵扣补贴等营销功能
注意：当传SubOrderList时，请在子单信息中传附加项信息，不要在主单中传该字段。
     * @param AttachmentInfoList 附加项信息列表
例如溢价信息、抵扣信息、积分信息、补贴信息
通过该字段可以实现渠道方的优惠抵扣补贴等营销功能
注意：当传SubOrderList时，请在子单信息中传附加项信息，不要在主单中传该字段。
     */
    public void setAttachmentInfoList(CloudAttachmentInfo [] AttachmentInfoList) {
        this.AttachmentInfoList = AttachmentInfoList;
    }

    /**
     * Get 支付通知地址
调用方可通过该字段传入自定义支付通知地址。 
     * @return PaymentNotifyUrl 支付通知地址
调用方可通过该字段传入自定义支付通知地址。
     */
    public String getPaymentNotifyUrl() {
        return this.PaymentNotifyUrl;
    }

    /**
     * Set 支付通知地址
调用方可通过该字段传入自定义支付通知地址。
     * @param PaymentNotifyUrl 支付通知地址
调用方可通过该字段传入自定义支付通知地址。
     */
    public void setPaymentNotifyUrl(String PaymentNotifyUrl) {
        this.PaymentNotifyUrl = PaymentNotifyUrl;
    }

    /**
     * Get 支付场景
需要结合 RealChannel和Channel字段使用可选值:
wechat-app 微信APP支付方式
wechat-mini 微信小程序支付，示例：当 RealChannel=wechat Channel=wechat PayScene=wechat-mini时，内部会直接以小程序方式调用微信统一下单接口。 
     * @return PayScene 支付场景
需要结合 RealChannel和Channel字段使用可选值:
wechat-app 微信APP支付方式
wechat-mini 微信小程序支付，示例：当 RealChannel=wechat Channel=wechat PayScene=wechat-mini时，内部会直接以小程序方式调用微信统一下单接口。
     */
    public String getPayScene() {
        return this.PayScene;
    }

    /**
     * Set 支付场景
需要结合 RealChannel和Channel字段使用可选值:
wechat-app 微信APP支付方式
wechat-mini 微信小程序支付，示例：当 RealChannel=wechat Channel=wechat PayScene=wechat-mini时，内部会直接以小程序方式调用微信统一下单接口。
     * @param PayScene 支付场景
需要结合 RealChannel和Channel字段使用可选值:
wechat-app 微信APP支付方式
wechat-mini 微信小程序支付，示例：当 RealChannel=wechat Channel=wechat PayScene=wechat-mini时，内部会直接以小程序方式调用微信统一下单接口。
     */
    public void setPayScene(String PayScene) {
        this.PayScene = PayScene;
    }

    /**
     * Get 语言代码
取值请参考[ISO 639-1代码表](https://zh.wikipedia.org/zh-cn/ISO_639-1%E4%BB%A3%E7%A0%81%E8%A1%A8) 
     * @return LocaleCode 语言代码
取值请参考[ISO 639-1代码表](https://zh.wikipedia.org/zh-cn/ISO_639-1%E4%BB%A3%E7%A0%81%E8%A1%A8)
     */
    public String getLocaleCode() {
        return this.LocaleCode;
    }

    /**
     * Set 语言代码
取值请参考[ISO 639-1代码表](https://zh.wikipedia.org/zh-cn/ISO_639-1%E4%BB%A3%E7%A0%81%E8%A1%A8)
     * @param LocaleCode 语言代码
取值请参考[ISO 639-1代码表](https://zh.wikipedia.org/zh-cn/ISO_639-1%E4%BB%A3%E7%A0%81%E8%A1%A8)
     */
    public void setLocaleCode(String LocaleCode) {
        this.LocaleCode = LocaleCode;
    }

    /**
     * Get 地区代码
取值请参考[ISO 3166-1二位字母代码表](https://zh.wikipedia.org/zh-cn/ISO_3166-1%E4%BA%8C%E4%BD%8D%E5%AD%97%E6%AF%8D%E4%BB%A3%E7%A0%81#%E6%AD%A3%E5%BC%8F%E5%88%86%E9%85%8D%E4%BB%A3%E7%A0%81) 
     * @return RegionCode 地区代码
取值请参考[ISO 3166-1二位字母代码表](https://zh.wikipedia.org/zh-cn/ISO_3166-1%E4%BA%8C%E4%BD%8D%E5%AD%97%E6%AF%8D%E4%BB%A3%E7%A0%81#%E6%AD%A3%E5%BC%8F%E5%88%86%E9%85%8D%E4%BB%A3%E7%A0%81)
     */
    public String getRegionCode() {
        return this.RegionCode;
    }

    /**
     * Set 地区代码
取值请参考[ISO 3166-1二位字母代码表](https://zh.wikipedia.org/zh-cn/ISO_3166-1%E4%BA%8C%E4%BD%8D%E5%AD%97%E6%AF%8D%E4%BB%A3%E7%A0%81#%E6%AD%A3%E5%BC%8F%E5%88%86%E9%85%8D%E4%BB%A3%E7%A0%81)
     * @param RegionCode 地区代码
取值请参考[ISO 3166-1二位字母代码表](https://zh.wikipedia.org/zh-cn/ISO_3166-1%E4%BA%8C%E4%BD%8D%E5%AD%97%E6%AF%8D%E4%BB%A3%E7%A0%81#%E6%AD%A3%E5%BC%8F%E5%88%86%E9%85%8D%E4%BB%A3%E7%A0%81)
     */
    public void setRegionCode(String RegionCode) {
        this.RegionCode = RegionCode;
    }

    /**
     * Get 用户IP
请求用户的IP地址，特定的渠道或特定的支付方式，此字段为必填
wechat_ecommerce渠道 - h5支付方式，此字段必填。 
     * @return UserClientIp 用户IP
请求用户的IP地址，特定的渠道或特定的支付方式，此字段为必填
wechat_ecommerce渠道 - h5支付方式，此字段必填。
     */
    public String getUserClientIp() {
        return this.UserClientIp;
    }

    /**
     * Set 用户IP
请求用户的IP地址，特定的渠道或特定的支付方式，此字段为必填
wechat_ecommerce渠道 - h5支付方式，此字段必填。
     * @param UserClientIp 用户IP
请求用户的IP地址，特定的渠道或特定的支付方式，此字段为必填
wechat_ecommerce渠道 - h5支付方式，此字段必填。
     */
    public void setUserClientIp(String UserClientIp) {
        this.UserClientIp = UserClientIp;
    }

    /**
     * Get 渠道订单号生成模式
枚举值。决定请求渠道方时的订单号的生成模式，详情请联系米大师沟通。不指定时默认为由米大师自行生成。 
     * @return ChannelOrderIdMode 渠道订单号生成模式
枚举值。决定请求渠道方时的订单号的生成模式，详情请联系米大师沟通。不指定时默认为由米大师自行生成。
     */
    public String getChannelOrderIdMode() {
        return this.ChannelOrderIdMode;
    }

    /**
     * Set 渠道订单号生成模式
枚举值。决定请求渠道方时的订单号的生成模式，详情请联系米大师沟通。不指定时默认为由米大师自行生成。
     * @param ChannelOrderIdMode 渠道订单号生成模式
枚举值。决定请求渠道方时的订单号的生成模式，详情请联系米大师沟通。不指定时默认为由米大师自行生成。
     */
    public void setChannelOrderIdMode(String ChannelOrderIdMode) {
        this.ChannelOrderIdMode = ChannelOrderIdMode;
    }

    /**
     * Get 全局支付时间信息 
     * @return GlobalPayTimeInfo 全局支付时间信息
     */
    public CloudGlobalPayTimeInfo getGlobalPayTimeInfo() {
        return this.GlobalPayTimeInfo;
    }

    /**
     * Set 全局支付时间信息
     * @param GlobalPayTimeInfo 全局支付时间信息
     */
    public void setGlobalPayTimeInfo(CloudGlobalPayTimeInfo GlobalPayTimeInfo) {
        this.GlobalPayTimeInfo = GlobalPayTimeInfo;
    }

    /**
     * Get 渠道应用ID取用方式
USE_APPID 使用渠道应用Id;
USE_SUB_APPID 使用子渠道应用Id;
USE_APPID_AND_SUB_APPID 既使用渠道应用Id也使用子渠道应用ID。 
     * @return ChannelAppIdPolicy 渠道应用ID取用方式
USE_APPID 使用渠道应用Id;
USE_SUB_APPID 使用子渠道应用Id;
USE_APPID_AND_SUB_APPID 既使用渠道应用Id也使用子渠道应用ID。
     */
    public String getChannelAppIdPolicy() {
        return this.ChannelAppIdPolicy;
    }

    /**
     * Set 渠道应用ID取用方式
USE_APPID 使用渠道应用Id;
USE_SUB_APPID 使用子渠道应用Id;
USE_APPID_AND_SUB_APPID 既使用渠道应用Id也使用子渠道应用ID。
     * @param ChannelAppIdPolicy 渠道应用ID取用方式
USE_APPID 使用渠道应用Id;
USE_SUB_APPID 使用子渠道应用Id;
USE_APPID_AND_SUB_APPID 既使用渠道应用Id也使用子渠道应用ID。
     */
    public void setChannelAppIdPolicy(String ChannelAppIdPolicy) {
        this.ChannelAppIdPolicy = ChannelAppIdPolicy;
    }

    /**
     * Get 门店信息
特定的渠道或特定的支付方式，此字段为必填
wechat_ecommerce渠道 - h5支付方式，此字段必填 
     * @return StoreInfo 门店信息
特定的渠道或特定的支付方式，此字段为必填
wechat_ecommerce渠道 - h5支付方式，此字段必填
     */
    public CloudStoreInfo getStoreInfo() {
        return this.StoreInfo;
    }

    /**
     * Set 门店信息
特定的渠道或特定的支付方式，此字段为必填
wechat_ecommerce渠道 - h5支付方式，此字段必填
     * @param StoreInfo 门店信息
特定的渠道或特定的支付方式，此字段为必填
wechat_ecommerce渠道 - h5支付方式，此字段必填
     */
    public void setStoreInfo(CloudStoreInfo StoreInfo) {
        this.StoreInfo = StoreInfo;
    }

    /**
     * Get 客户端信息
特定的渠道或特定的支付方式，此字段为必填
wechat_ecommerce渠道 - h5支付方式，此字段必填 
     * @return ClientInfo 客户端信息
特定的渠道或特定的支付方式，此字段为必填
wechat_ecommerce渠道 - h5支付方式，此字段必填
     */
    public CloudClientInfo getClientInfo() {
        return this.ClientInfo;
    }

    /**
     * Set 客户端信息
特定的渠道或特定的支付方式，此字段为必填
wechat_ecommerce渠道 - h5支付方式，此字段必填
     * @param ClientInfo 客户端信息
特定的渠道或特定的支付方式，此字段为必填
wechat_ecommerce渠道 - h5支付方式，此字段必填
     */
    public void setClientInfo(CloudClientInfo ClientInfo) {
        this.ClientInfo = ClientInfo;
    }

    /**
     * Get 渠道扩展促销列表
可将各个渠道的促销信息放于该列表。 
     * @return ExternalPromptGroupList 渠道扩展促销列表
可将各个渠道的促销信息放于该列表。
     */
    public CloudExternalPromptGroup [] getExternalPromptGroupList() {
        return this.ExternalPromptGroupList;
    }

    /**
     * Set 渠道扩展促销列表
可将各个渠道的促销信息放于该列表。
     * @param ExternalPromptGroupList 渠道扩展促销列表
可将各个渠道的促销信息放于该列表。
     */
    public void setExternalPromptGroupList(CloudExternalPromptGroup [] ExternalPromptGroupList) {
        this.ExternalPromptGroupList = ExternalPromptGroupList;
    }

    /**
     * Get 收单模式
ORDER_RECEIVE_MODE_COMMON - 普通支付
ORDER_RECEIVE_MODE_COMBINE - 合单支付
ORDER_RECEIVE_MODE_V_COMBINE - 虚拟合单支付
若不传入该字段，则会根据是否传入子单来判断是 普通支付 还是 合单支付 
     * @return OrderReceiveMode 收单模式
ORDER_RECEIVE_MODE_COMMON - 普通支付
ORDER_RECEIVE_MODE_COMBINE - 合单支付
ORDER_RECEIVE_MODE_V_COMBINE - 虚拟合单支付
若不传入该字段，则会根据是否传入子单来判断是 普通支付 还是 合单支付
     */
    public String getOrderReceiveMode() {
        return this.OrderReceiveMode;
    }

    /**
     * Set 收单模式
ORDER_RECEIVE_MODE_COMMON - 普通支付
ORDER_RECEIVE_MODE_COMBINE - 合单支付
ORDER_RECEIVE_MODE_V_COMBINE - 虚拟合单支付
若不传入该字段，则会根据是否传入子单来判断是 普通支付 还是 合单支付
     * @param OrderReceiveMode 收单模式
ORDER_RECEIVE_MODE_COMMON - 普通支付
ORDER_RECEIVE_MODE_COMBINE - 合单支付
ORDER_RECEIVE_MODE_V_COMBINE - 虚拟合单支付
若不传入该字段，则会根据是否传入子单来判断是 普通支付 还是 合单支付
     */
    public void setOrderReceiveMode(String OrderReceiveMode) {
        this.OrderReceiveMode = OrderReceiveMode;
    }

    public UnifiedCloudOrderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnifiedCloudOrderRequest(UnifiedCloudOrderRequest source) {
        if (source.MidasAppId != null) {
            this.MidasAppId = new String(source.MidasAppId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.OutTradeNo != null) {
            this.OutTradeNo = new String(source.OutTradeNo);
        }
        if (source.CurrencyType != null) {
            this.CurrencyType = new String(source.CurrencyType);
        }
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.ProductDetail != null) {
            this.ProductDetail = new String(source.ProductDetail);
        }
        if (source.OriginalAmt != null) {
            this.OriginalAmt = new Long(source.OriginalAmt);
        }
        if (source.TotalAmt != null) {
            this.TotalAmt = new Long(source.TotalAmt);
        }
        if (source.MidasEnvironment != null) {
            this.MidasEnvironment = new String(source.MidasEnvironment);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new String(source.SubAppId);
        }
        if (source.RealChannel != null) {
            this.RealChannel = new String(source.RealChannel);
        }
        if (source.Channel != null) {
            this.Channel = new String(source.Channel);
        }
        if (source.Metadata != null) {
            this.Metadata = new String(source.Metadata);
        }
        if (source.Quantity != null) {
            this.Quantity = new Long(source.Quantity);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.CancelUrl != null) {
            this.CancelUrl = new String(source.CancelUrl);
        }
        if (source.WxAppId != null) {
            this.WxAppId = new String(source.WxAppId);
        }
        if (source.WxSubAppId != null) {
            this.WxSubAppId = new String(source.WxSubAppId);
        }
        if (source.WxOpenId != null) {
            this.WxOpenId = new String(source.WxOpenId);
        }
        if (source.WxSubOpenId != null) {
            this.WxSubOpenId = new String(source.WxSubOpenId);
        }
        if (source.TotalPlatformIncome != null) {
            this.TotalPlatformIncome = new Long(source.TotalPlatformIncome);
        }
        if (source.TotalMchIncome != null) {
            this.TotalMchIncome = new Long(source.TotalMchIncome);
        }
        if (source.SubOrderList != null) {
            this.SubOrderList = new CloudSubOrder[source.SubOrderList.length];
            for (int i = 0; i < source.SubOrderList.length; i++) {
                this.SubOrderList[i] = new CloudSubOrder(source.SubOrderList[i]);
            }
        }
        if (source.SettleInfo != null) {
            this.SettleInfo = new CloudSettleInfo(source.SettleInfo);
        }
        if (source.AttachmentInfoList != null) {
            this.AttachmentInfoList = new CloudAttachmentInfo[source.AttachmentInfoList.length];
            for (int i = 0; i < source.AttachmentInfoList.length; i++) {
                this.AttachmentInfoList[i] = new CloudAttachmentInfo(source.AttachmentInfoList[i]);
            }
        }
        if (source.PaymentNotifyUrl != null) {
            this.PaymentNotifyUrl = new String(source.PaymentNotifyUrl);
        }
        if (source.PayScene != null) {
            this.PayScene = new String(source.PayScene);
        }
        if (source.LocaleCode != null) {
            this.LocaleCode = new String(source.LocaleCode);
        }
        if (source.RegionCode != null) {
            this.RegionCode = new String(source.RegionCode);
        }
        if (source.UserClientIp != null) {
            this.UserClientIp = new String(source.UserClientIp);
        }
        if (source.ChannelOrderIdMode != null) {
            this.ChannelOrderIdMode = new String(source.ChannelOrderIdMode);
        }
        if (source.GlobalPayTimeInfo != null) {
            this.GlobalPayTimeInfo = new CloudGlobalPayTimeInfo(source.GlobalPayTimeInfo);
        }
        if (source.ChannelAppIdPolicy != null) {
            this.ChannelAppIdPolicy = new String(source.ChannelAppIdPolicy);
        }
        if (source.StoreInfo != null) {
            this.StoreInfo = new CloudStoreInfo(source.StoreInfo);
        }
        if (source.ClientInfo != null) {
            this.ClientInfo = new CloudClientInfo(source.ClientInfo);
        }
        if (source.ExternalPromptGroupList != null) {
            this.ExternalPromptGroupList = new CloudExternalPromptGroup[source.ExternalPromptGroupList.length];
            for (int i = 0; i < source.ExternalPromptGroupList.length; i++) {
                this.ExternalPromptGroupList[i] = new CloudExternalPromptGroup(source.ExternalPromptGroupList[i]);
            }
        }
        if (source.OrderReceiveMode != null) {
            this.OrderReceiveMode = new String(source.OrderReceiveMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MidasAppId", this.MidasAppId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "OutTradeNo", this.OutTradeNo);
        this.setParamSimple(map, prefix + "CurrencyType", this.CurrencyType);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "ProductDetail", this.ProductDetail);
        this.setParamSimple(map, prefix + "OriginalAmt", this.OriginalAmt);
        this.setParamSimple(map, prefix + "TotalAmt", this.TotalAmt);
        this.setParamSimple(map, prefix + "MidasEnvironment", this.MidasEnvironment);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "RealChannel", this.RealChannel);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "Metadata", this.Metadata);
        this.setParamSimple(map, prefix + "Quantity", this.Quantity);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "CancelUrl", this.CancelUrl);
        this.setParamSimple(map, prefix + "WxAppId", this.WxAppId);
        this.setParamSimple(map, prefix + "WxSubAppId", this.WxSubAppId);
        this.setParamSimple(map, prefix + "WxOpenId", this.WxOpenId);
        this.setParamSimple(map, prefix + "WxSubOpenId", this.WxSubOpenId);
        this.setParamSimple(map, prefix + "TotalPlatformIncome", this.TotalPlatformIncome);
        this.setParamSimple(map, prefix + "TotalMchIncome", this.TotalMchIncome);
        this.setParamArrayObj(map, prefix + "SubOrderList.", this.SubOrderList);
        this.setParamObj(map, prefix + "SettleInfo.", this.SettleInfo);
        this.setParamArrayObj(map, prefix + "AttachmentInfoList.", this.AttachmentInfoList);
        this.setParamSimple(map, prefix + "PaymentNotifyUrl", this.PaymentNotifyUrl);
        this.setParamSimple(map, prefix + "PayScene", this.PayScene);
        this.setParamSimple(map, prefix + "LocaleCode", this.LocaleCode);
        this.setParamSimple(map, prefix + "RegionCode", this.RegionCode);
        this.setParamSimple(map, prefix + "UserClientIp", this.UserClientIp);
        this.setParamSimple(map, prefix + "ChannelOrderIdMode", this.ChannelOrderIdMode);
        this.setParamObj(map, prefix + "GlobalPayTimeInfo.", this.GlobalPayTimeInfo);
        this.setParamSimple(map, prefix + "ChannelAppIdPolicy", this.ChannelAppIdPolicy);
        this.setParamObj(map, prefix + "StoreInfo.", this.StoreInfo);
        this.setParamObj(map, prefix + "ClientInfo.", this.ClientInfo);
        this.setParamArrayObj(map, prefix + "ExternalPromptGroupList.", this.ExternalPromptGroupList);
        this.setParamSimple(map, prefix + "OrderReceiveMode", this.OrderReceiveMode);

    }
}

