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

public class UnifiedOrderRequest extends AbstractModel{

    /**
    * ISO 货币代码，CNY
    */
    @SerializedName("CurrencyType")
    @Expose
    private String CurrencyType;

    /**
    * 聚鑫分配的支付主MidasAppId
    */
    @SerializedName("MidasAppId")
    @Expose
    private String MidasAppId;

    /**
    * 支付订单号，仅支持数字、字母、下划线（_）、横杠字符（-）、点（.）的组合
    */
    @SerializedName("OutTradeNo")
    @Expose
    private String OutTradeNo;

    /**
    * 商品详情，需要URL编码
    */
    @SerializedName("ProductDetail")
    @Expose
    private String ProductDetail;

    /**
    * 商品ID，仅支持数字、字母、下划线（_）、横杠字符（-）、点（.）的组合
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 商品名称，需要URL编码
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 支付金额，单位： 分
    */
    @SerializedName("TotalAmt")
    @Expose
    private Long TotalAmt;

    /**
    * 用户ID，长度不小于5位，仅支持字母和数字的组合
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 银行真实渠道.如:bank_pingan
    */
    @SerializedName("RealChannel")
    @Expose
    private String RealChannel;

    /**
    * 原始金额
    */
    @SerializedName("OriginalAmt")
    @Expose
    private Long OriginalAmt;

    /**
    * 聚鑫分配的安全ID
    */
    @SerializedName("MidasSecretId")
    @Expose
    private String MidasSecretId;

    /**
    * 按照聚鑫安全密钥计算的签名
    */
    @SerializedName("MidasSignature")
    @Expose
    private String MidasSignature;

    /**
    * Web端回调地址
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * 指定支付渠道：  wechat：微信支付  qqwallet：QQ钱包 
 bank：网银支付  只有一个渠道时需要指定
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
    * 透传字段，支付成功回调透传给应用，用于业务透传自定义内容
    */
    @SerializedName("Metadata")
    @Expose
    private String Metadata;

    /**
    * 购买数量，不传默认为1
    */
    @SerializedName("Quantity")
    @Expose
    private Long Quantity;

    /**
    * 聚鑫计费SubAppId，代表子商户
    */
    @SerializedName("SubAppId")
    @Expose
    private String SubAppId;

    /**
    * 子订单信息列表，格式：子订单号、子应用ID、金额。 压缩后最长不可超过65535字节(去除空格，换行，制表符等无意义字符)
注：接入银行或其他支付渠道服务商模式下，必传
    */
    @SerializedName("SubOrderList")
    @Expose
    private UnifiedOrderInSubOrderList [] SubOrderList;

    /**
    * 结算应收金额，单位：分
    */
    @SerializedName("TotalMchIncome")
    @Expose
    private Long TotalMchIncome;

    /**
    * 平台应收金额，单位：分
    */
    @SerializedName("TotalPlatformIncome")
    @Expose
    private Long TotalPlatformIncome;

    /**
    * 微信公众号/小程序支付时为必选，需要传微信下的openid
    */
    @SerializedName("WxOpenId")
    @Expose
    private String WxOpenId;

    /**
    * 在服务商模式下，微信公众号/小程序支付时wx_sub_openid和wx_openid二选一
    */
    @SerializedName("WxSubOpenId")
    @Expose
    private String WxSubOpenId;

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
     * Get 支付订单号，仅支持数字、字母、下划线（_）、横杠字符（-）、点（.）的组合 
     * @return OutTradeNo 支付订单号，仅支持数字、字母、下划线（_）、横杠字符（-）、点（.）的组合
     */
    public String getOutTradeNo() {
        return this.OutTradeNo;
    }

    /**
     * Set 支付订单号，仅支持数字、字母、下划线（_）、横杠字符（-）、点（.）的组合
     * @param OutTradeNo 支付订单号，仅支持数字、字母、下划线（_）、横杠字符（-）、点（.）的组合
     */
    public void setOutTradeNo(String OutTradeNo) {
        this.OutTradeNo = OutTradeNo;
    }

    /**
     * Get 商品详情，需要URL编码 
     * @return ProductDetail 商品详情，需要URL编码
     */
    public String getProductDetail() {
        return this.ProductDetail;
    }

    /**
     * Set 商品详情，需要URL编码
     * @param ProductDetail 商品详情，需要URL编码
     */
    public void setProductDetail(String ProductDetail) {
        this.ProductDetail = ProductDetail;
    }

    /**
     * Get 商品ID，仅支持数字、字母、下划线（_）、横杠字符（-）、点（.）的组合 
     * @return ProductId 商品ID，仅支持数字、字母、下划线（_）、横杠字符（-）、点（.）的组合
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 商品ID，仅支持数字、字母、下划线（_）、横杠字符（-）、点（.）的组合
     * @param ProductId 商品ID，仅支持数字、字母、下划线（_）、横杠字符（-）、点（.）的组合
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 商品名称，需要URL编码 
     * @return ProductName 商品名称，需要URL编码
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 商品名称，需要URL编码
     * @param ProductName 商品名称，需要URL编码
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 支付金额，单位： 分 
     * @return TotalAmt 支付金额，单位： 分
     */
    public Long getTotalAmt() {
        return this.TotalAmt;
    }

    /**
     * Set 支付金额，单位： 分
     * @param TotalAmt 支付金额，单位： 分
     */
    public void setTotalAmt(Long TotalAmt) {
        this.TotalAmt = TotalAmt;
    }

    /**
     * Get 用户ID，长度不小于5位，仅支持字母和数字的组合 
     * @return UserId 用户ID，长度不小于5位，仅支持字母和数字的组合
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户ID，长度不小于5位，仅支持字母和数字的组合
     * @param UserId 用户ID，长度不小于5位，仅支持字母和数字的组合
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 银行真实渠道.如:bank_pingan 
     * @return RealChannel 银行真实渠道.如:bank_pingan
     */
    public String getRealChannel() {
        return this.RealChannel;
    }

    /**
     * Set 银行真实渠道.如:bank_pingan
     * @param RealChannel 银行真实渠道.如:bank_pingan
     */
    public void setRealChannel(String RealChannel) {
        this.RealChannel = RealChannel;
    }

    /**
     * Get 原始金额 
     * @return OriginalAmt 原始金额
     */
    public Long getOriginalAmt() {
        return this.OriginalAmt;
    }

    /**
     * Set 原始金额
     * @param OriginalAmt 原始金额
     */
    public void setOriginalAmt(Long OriginalAmt) {
        this.OriginalAmt = OriginalAmt;
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
     * Get 按照聚鑫安全密钥计算的签名 
     * @return MidasSignature 按照聚鑫安全密钥计算的签名
     */
    public String getMidasSignature() {
        return this.MidasSignature;
    }

    /**
     * Set 按照聚鑫安全密钥计算的签名
     * @param MidasSignature 按照聚鑫安全密钥计算的签名
     */
    public void setMidasSignature(String MidasSignature) {
        this.MidasSignature = MidasSignature;
    }

    /**
     * Get Web端回调地址 
     * @return CallbackUrl Web端回调地址
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set Web端回调地址
     * @param CallbackUrl Web端回调地址
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get 指定支付渠道：  wechat：微信支付  qqwallet：QQ钱包 
 bank：网银支付  只有一个渠道时需要指定 
     * @return Channel 指定支付渠道：  wechat：微信支付  qqwallet：QQ钱包 
 bank：网银支付  只有一个渠道时需要指定
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set 指定支付渠道：  wechat：微信支付  qqwallet：QQ钱包 
 bank：网银支付  只有一个渠道时需要指定
     * @param Channel 指定支付渠道：  wechat：微信支付  qqwallet：QQ钱包 
 bank：网银支付  只有一个渠道时需要指定
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    /**
     * Get 透传字段，支付成功回调透传给应用，用于业务透传自定义内容 
     * @return Metadata 透传字段，支付成功回调透传给应用，用于业务透传自定义内容
     */
    public String getMetadata() {
        return this.Metadata;
    }

    /**
     * Set 透传字段，支付成功回调透传给应用，用于业务透传自定义内容
     * @param Metadata 透传字段，支付成功回调透传给应用，用于业务透传自定义内容
     */
    public void setMetadata(String Metadata) {
        this.Metadata = Metadata;
    }

    /**
     * Get 购买数量，不传默认为1 
     * @return Quantity 购买数量，不传默认为1
     */
    public Long getQuantity() {
        return this.Quantity;
    }

    /**
     * Set 购买数量，不传默认为1
     * @param Quantity 购买数量，不传默认为1
     */
    public void setQuantity(Long Quantity) {
        this.Quantity = Quantity;
    }

    /**
     * Get 聚鑫计费SubAppId，代表子商户 
     * @return SubAppId 聚鑫计费SubAppId，代表子商户
     */
    public String getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 聚鑫计费SubAppId，代表子商户
     * @param SubAppId 聚鑫计费SubAppId，代表子商户
     */
    public void setSubAppId(String SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get 子订单信息列表，格式：子订单号、子应用ID、金额。 压缩后最长不可超过65535字节(去除空格，换行，制表符等无意义字符)
注：接入银行或其他支付渠道服务商模式下，必传 
     * @return SubOrderList 子订单信息列表，格式：子订单号、子应用ID、金额。 压缩后最长不可超过65535字节(去除空格，换行，制表符等无意义字符)
注：接入银行或其他支付渠道服务商模式下，必传
     */
    public UnifiedOrderInSubOrderList [] getSubOrderList() {
        return this.SubOrderList;
    }

    /**
     * Set 子订单信息列表，格式：子订单号、子应用ID、金额。 压缩后最长不可超过65535字节(去除空格，换行，制表符等无意义字符)
注：接入银行或其他支付渠道服务商模式下，必传
     * @param SubOrderList 子订单信息列表，格式：子订单号、子应用ID、金额。 压缩后最长不可超过65535字节(去除空格，换行，制表符等无意义字符)
注：接入银行或其他支付渠道服务商模式下，必传
     */
    public void setSubOrderList(UnifiedOrderInSubOrderList [] SubOrderList) {
        this.SubOrderList = SubOrderList;
    }

    /**
     * Get 结算应收金额，单位：分 
     * @return TotalMchIncome 结算应收金额，单位：分
     */
    public Long getTotalMchIncome() {
        return this.TotalMchIncome;
    }

    /**
     * Set 结算应收金额，单位：分
     * @param TotalMchIncome 结算应收金额，单位：分
     */
    public void setTotalMchIncome(Long TotalMchIncome) {
        this.TotalMchIncome = TotalMchIncome;
    }

    /**
     * Get 平台应收金额，单位：分 
     * @return TotalPlatformIncome 平台应收金额，单位：分
     */
    public Long getTotalPlatformIncome() {
        return this.TotalPlatformIncome;
    }

    /**
     * Set 平台应收金额，单位：分
     * @param TotalPlatformIncome 平台应收金额，单位：分
     */
    public void setTotalPlatformIncome(Long TotalPlatformIncome) {
        this.TotalPlatformIncome = TotalPlatformIncome;
    }

    /**
     * Get 微信公众号/小程序支付时为必选，需要传微信下的openid 
     * @return WxOpenId 微信公众号/小程序支付时为必选，需要传微信下的openid
     */
    public String getWxOpenId() {
        return this.WxOpenId;
    }

    /**
     * Set 微信公众号/小程序支付时为必选，需要传微信下的openid
     * @param WxOpenId 微信公众号/小程序支付时为必选，需要传微信下的openid
     */
    public void setWxOpenId(String WxOpenId) {
        this.WxOpenId = WxOpenId;
    }

    /**
     * Get 在服务商模式下，微信公众号/小程序支付时wx_sub_openid和wx_openid二选一 
     * @return WxSubOpenId 在服务商模式下，微信公众号/小程序支付时wx_sub_openid和wx_openid二选一
     */
    public String getWxSubOpenId() {
        return this.WxSubOpenId;
    }

    /**
     * Set 在服务商模式下，微信公众号/小程序支付时wx_sub_openid和wx_openid二选一
     * @param WxSubOpenId 在服务商模式下，微信公众号/小程序支付时wx_sub_openid和wx_openid二选一
     */
    public void setWxSubOpenId(String WxSubOpenId) {
        this.WxSubOpenId = WxSubOpenId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CurrencyType", this.CurrencyType);
        this.setParamSimple(map, prefix + "MidasAppId", this.MidasAppId);
        this.setParamSimple(map, prefix + "OutTradeNo", this.OutTradeNo);
        this.setParamSimple(map, prefix + "ProductDetail", this.ProductDetail);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "TotalAmt", this.TotalAmt);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "RealChannel", this.RealChannel);
        this.setParamSimple(map, prefix + "OriginalAmt", this.OriginalAmt);
        this.setParamSimple(map, prefix + "MidasSecretId", this.MidasSecretId);
        this.setParamSimple(map, prefix + "MidasSignature", this.MidasSignature);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "Metadata", this.Metadata);
        this.setParamSimple(map, prefix + "Quantity", this.Quantity);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamArrayObj(map, prefix + "SubOrderList.", this.SubOrderList);
        this.setParamSimple(map, prefix + "TotalMchIncome", this.TotalMchIncome);
        this.setParamSimple(map, prefix + "TotalPlatformIncome", this.TotalPlatformIncome);
        this.setParamSimple(map, prefix + "WxOpenId", this.WxOpenId);
        this.setParamSimple(map, prefix + "WxSubOpenId", this.WxSubOpenId);

    }
}

