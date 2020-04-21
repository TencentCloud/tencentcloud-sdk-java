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

public class ApplyTradeRequest extends AbstractModel{

    /**
    * 贸易材料流水号
    */
    @SerializedName("TradeFileId")
    @Expose
    private String TradeFileId;

    /**
    * 贸易材料订单号
    */
    @SerializedName("TradeOrderId")
    @Expose
    private String TradeOrderId;

    /**
    * 付款人ID
    */
    @SerializedName("PayerId")
    @Expose
    private String PayerId;

    /**
    * 付款人姓名
    */
    @SerializedName("PayeeName")
    @Expose
    private String PayeeName;

    /**
    * 收款人常驻国家或地区编码 (见常见问题)
    */
    @SerializedName("PayeeCountryCode")
    @Expose
    private String PayeeCountryCode;

    /**
    * 贸易类型 (GOODS: 商品, SERVICE: 服务)
    */
    @SerializedName("TradeType")
    @Expose
    private String TradeType;

    /**
    * 交易时间 (格式: yyyyMMdd)
    */
    @SerializedName("TradeTime")
    @Expose
    private String TradeTime;

    /**
    * 交易币种
    */
    @SerializedName("TradeCurrency")
    @Expose
    private String TradeCurrency;

    /**
    * 交易金额
    */
    @SerializedName("TradeAmount")
    @Expose
    private Float TradeAmount;

    /**
    * 交易名称 
(TradeType=GOODS时填写物品名称，可填写多个，格式无要求；
TradeType=SERVICE时填写贸易类别，见常见问题-贸易类别)
    */
    @SerializedName("TradeName")
    @Expose
    private String TradeName;

    /**
    * 交易数量 (TradeType=GOODS 填写物品数量, TradeType=SERVICE填写服务次数)
    */
    @SerializedName("TradeCount")
    @Expose
    private Long TradeCount;

    /**
    * 货贸承运人 (TradeType=GOODS 必填)
    */
    @SerializedName("GoodsCarrier")
    @Expose
    private String GoodsCarrier;

    /**
    * 服贸交易细节 (TradeType=GOODS 必填, 见常见问题-交易细节)
    */
    @SerializedName("ServiceDetail")
    @Expose
    private String ServiceDetail;

    /**
    * 服贸服务时间 (TradeType=GOODS 必填, 见常见问题-服务时间)
    */
    @SerializedName("ServiceTime")
    @Expose
    private String ServiceTime;

    /**
    * 接入环境。沙箱环境填sandbox
    */
    @SerializedName("Profile")
    @Expose
    private String Profile;

    /**
     * Get 贸易材料流水号 
     * @return TradeFileId 贸易材料流水号
     */
    public String getTradeFileId() {
        return this.TradeFileId;
    }

    /**
     * Set 贸易材料流水号
     * @param TradeFileId 贸易材料流水号
     */
    public void setTradeFileId(String TradeFileId) {
        this.TradeFileId = TradeFileId;
    }

    /**
     * Get 贸易材料订单号 
     * @return TradeOrderId 贸易材料订单号
     */
    public String getTradeOrderId() {
        return this.TradeOrderId;
    }

    /**
     * Set 贸易材料订单号
     * @param TradeOrderId 贸易材料订单号
     */
    public void setTradeOrderId(String TradeOrderId) {
        this.TradeOrderId = TradeOrderId;
    }

    /**
     * Get 付款人ID 
     * @return PayerId 付款人ID
     */
    public String getPayerId() {
        return this.PayerId;
    }

    /**
     * Set 付款人ID
     * @param PayerId 付款人ID
     */
    public void setPayerId(String PayerId) {
        this.PayerId = PayerId;
    }

    /**
     * Get 付款人姓名 
     * @return PayeeName 付款人姓名
     */
    public String getPayeeName() {
        return this.PayeeName;
    }

    /**
     * Set 付款人姓名
     * @param PayeeName 付款人姓名
     */
    public void setPayeeName(String PayeeName) {
        this.PayeeName = PayeeName;
    }

    /**
     * Get 收款人常驻国家或地区编码 (见常见问题) 
     * @return PayeeCountryCode 收款人常驻国家或地区编码 (见常见问题)
     */
    public String getPayeeCountryCode() {
        return this.PayeeCountryCode;
    }

    /**
     * Set 收款人常驻国家或地区编码 (见常见问题)
     * @param PayeeCountryCode 收款人常驻国家或地区编码 (见常见问题)
     */
    public void setPayeeCountryCode(String PayeeCountryCode) {
        this.PayeeCountryCode = PayeeCountryCode;
    }

    /**
     * Get 贸易类型 (GOODS: 商品, SERVICE: 服务) 
     * @return TradeType 贸易类型 (GOODS: 商品, SERVICE: 服务)
     */
    public String getTradeType() {
        return this.TradeType;
    }

    /**
     * Set 贸易类型 (GOODS: 商品, SERVICE: 服务)
     * @param TradeType 贸易类型 (GOODS: 商品, SERVICE: 服务)
     */
    public void setTradeType(String TradeType) {
        this.TradeType = TradeType;
    }

    /**
     * Get 交易时间 (格式: yyyyMMdd) 
     * @return TradeTime 交易时间 (格式: yyyyMMdd)
     */
    public String getTradeTime() {
        return this.TradeTime;
    }

    /**
     * Set 交易时间 (格式: yyyyMMdd)
     * @param TradeTime 交易时间 (格式: yyyyMMdd)
     */
    public void setTradeTime(String TradeTime) {
        this.TradeTime = TradeTime;
    }

    /**
     * Get 交易币种 
     * @return TradeCurrency 交易币种
     */
    public String getTradeCurrency() {
        return this.TradeCurrency;
    }

    /**
     * Set 交易币种
     * @param TradeCurrency 交易币种
     */
    public void setTradeCurrency(String TradeCurrency) {
        this.TradeCurrency = TradeCurrency;
    }

    /**
     * Get 交易金额 
     * @return TradeAmount 交易金额
     */
    public Float getTradeAmount() {
        return this.TradeAmount;
    }

    /**
     * Set 交易金额
     * @param TradeAmount 交易金额
     */
    public void setTradeAmount(Float TradeAmount) {
        this.TradeAmount = TradeAmount;
    }

    /**
     * Get 交易名称 
(TradeType=GOODS时填写物品名称，可填写多个，格式无要求；
TradeType=SERVICE时填写贸易类别，见常见问题-贸易类别) 
     * @return TradeName 交易名称 
(TradeType=GOODS时填写物品名称，可填写多个，格式无要求；
TradeType=SERVICE时填写贸易类别，见常见问题-贸易类别)
     */
    public String getTradeName() {
        return this.TradeName;
    }

    /**
     * Set 交易名称 
(TradeType=GOODS时填写物品名称，可填写多个，格式无要求；
TradeType=SERVICE时填写贸易类别，见常见问题-贸易类别)
     * @param TradeName 交易名称 
(TradeType=GOODS时填写物品名称，可填写多个，格式无要求；
TradeType=SERVICE时填写贸易类别，见常见问题-贸易类别)
     */
    public void setTradeName(String TradeName) {
        this.TradeName = TradeName;
    }

    /**
     * Get 交易数量 (TradeType=GOODS 填写物品数量, TradeType=SERVICE填写服务次数) 
     * @return TradeCount 交易数量 (TradeType=GOODS 填写物品数量, TradeType=SERVICE填写服务次数)
     */
    public Long getTradeCount() {
        return this.TradeCount;
    }

    /**
     * Set 交易数量 (TradeType=GOODS 填写物品数量, TradeType=SERVICE填写服务次数)
     * @param TradeCount 交易数量 (TradeType=GOODS 填写物品数量, TradeType=SERVICE填写服务次数)
     */
    public void setTradeCount(Long TradeCount) {
        this.TradeCount = TradeCount;
    }

    /**
     * Get 货贸承运人 (TradeType=GOODS 必填) 
     * @return GoodsCarrier 货贸承运人 (TradeType=GOODS 必填)
     */
    public String getGoodsCarrier() {
        return this.GoodsCarrier;
    }

    /**
     * Set 货贸承运人 (TradeType=GOODS 必填)
     * @param GoodsCarrier 货贸承运人 (TradeType=GOODS 必填)
     */
    public void setGoodsCarrier(String GoodsCarrier) {
        this.GoodsCarrier = GoodsCarrier;
    }

    /**
     * Get 服贸交易细节 (TradeType=GOODS 必填, 见常见问题-交易细节) 
     * @return ServiceDetail 服贸交易细节 (TradeType=GOODS 必填, 见常见问题-交易细节)
     */
    public String getServiceDetail() {
        return this.ServiceDetail;
    }

    /**
     * Set 服贸交易细节 (TradeType=GOODS 必填, 见常见问题-交易细节)
     * @param ServiceDetail 服贸交易细节 (TradeType=GOODS 必填, 见常见问题-交易细节)
     */
    public void setServiceDetail(String ServiceDetail) {
        this.ServiceDetail = ServiceDetail;
    }

    /**
     * Get 服贸服务时间 (TradeType=GOODS 必填, 见常见问题-服务时间) 
     * @return ServiceTime 服贸服务时间 (TradeType=GOODS 必填, 见常见问题-服务时间)
     */
    public String getServiceTime() {
        return this.ServiceTime;
    }

    /**
     * Set 服贸服务时间 (TradeType=GOODS 必填, 见常见问题-服务时间)
     * @param ServiceTime 服贸服务时间 (TradeType=GOODS 必填, 见常见问题-服务时间)
     */
    public void setServiceTime(String ServiceTime) {
        this.ServiceTime = ServiceTime;
    }

    /**
     * Get 接入环境。沙箱环境填sandbox 
     * @return Profile 接入环境。沙箱环境填sandbox
     */
    public String getProfile() {
        return this.Profile;
    }

    /**
     * Set 接入环境。沙箱环境填sandbox
     * @param Profile 接入环境。沙箱环境填sandbox
     */
    public void setProfile(String Profile) {
        this.Profile = Profile;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TradeFileId", this.TradeFileId);
        this.setParamSimple(map, prefix + "TradeOrderId", this.TradeOrderId);
        this.setParamSimple(map, prefix + "PayerId", this.PayerId);
        this.setParamSimple(map, prefix + "PayeeName", this.PayeeName);
        this.setParamSimple(map, prefix + "PayeeCountryCode", this.PayeeCountryCode);
        this.setParamSimple(map, prefix + "TradeType", this.TradeType);
        this.setParamSimple(map, prefix + "TradeTime", this.TradeTime);
        this.setParamSimple(map, prefix + "TradeCurrency", this.TradeCurrency);
        this.setParamSimple(map, prefix + "TradeAmount", this.TradeAmount);
        this.setParamSimple(map, prefix + "TradeName", this.TradeName);
        this.setParamSimple(map, prefix + "TradeCount", this.TradeCount);
        this.setParamSimple(map, prefix + "GoodsCarrier", this.GoodsCarrier);
        this.setParamSimple(map, prefix + "ServiceDetail", this.ServiceDetail);
        this.setParamSimple(map, prefix + "ServiceTime", this.ServiceTime);
        this.setParamSimple(map, prefix + "Profile", this.Profile);

    }
}

