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

public class QueryTradeData extends AbstractModel{

    /**
    * 商户号
    */
    @SerializedName("MerchantId")
    @Expose
    private String MerchantId;

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
    * 审核状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 失败原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailReason")
    @Expose
    private String FailReason;

    /**
    * 付款人ID
    */
    @SerializedName("PayerId")
    @Expose
    private String PayerId;

    /**
    * 收款人姓名
    */
    @SerializedName("PayeeName")
    @Expose
    private String PayeeName;

    /**
    * 收款人常驻国家或地区编码
    */
    @SerializedName("PayeeCountryCode")
    @Expose
    private String PayeeCountryCode;

    /**
    * 交易类型
    */
    @SerializedName("TradeType")
    @Expose
    private String TradeType;

    /**
    * 交易日期
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
    private String TradeAmount;

    /**
    * 交易名称
    */
    @SerializedName("TradeName")
    @Expose
    private String TradeName;

    /**
    * 交易数量
    */
    @SerializedName("TradeCount")
    @Expose
    private Long TradeCount;

    /**
    * 货贸承运人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GoodsCarrier")
    @Expose
    private String GoodsCarrier;

    /**
    * 服贸交易细节
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceDetail")
    @Expose
    private String ServiceDetail;

    /**
    * 服贸服务时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceTime")
    @Expose
    private String ServiceTime;

    /**
     * Get 商户号 
     * @return MerchantId 商户号
     */
    public String getMerchantId() {
        return this.MerchantId;
    }

    /**
     * Set 商户号
     * @param MerchantId 商户号
     */
    public void setMerchantId(String MerchantId) {
        this.MerchantId = MerchantId;
    }

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
     * Get 审核状态 
     * @return Status 审核状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 审核状态
     * @param Status 审核状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 失败原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailReason 失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFailReason() {
        return this.FailReason;
    }

    /**
     * Set 失败原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailReason 失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailReason(String FailReason) {
        this.FailReason = FailReason;
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
     * Get 收款人姓名 
     * @return PayeeName 收款人姓名
     */
    public String getPayeeName() {
        return this.PayeeName;
    }

    /**
     * Set 收款人姓名
     * @param PayeeName 收款人姓名
     */
    public void setPayeeName(String PayeeName) {
        this.PayeeName = PayeeName;
    }

    /**
     * Get 收款人常驻国家或地区编码 
     * @return PayeeCountryCode 收款人常驻国家或地区编码
     */
    public String getPayeeCountryCode() {
        return this.PayeeCountryCode;
    }

    /**
     * Set 收款人常驻国家或地区编码
     * @param PayeeCountryCode 收款人常驻国家或地区编码
     */
    public void setPayeeCountryCode(String PayeeCountryCode) {
        this.PayeeCountryCode = PayeeCountryCode;
    }

    /**
     * Get 交易类型 
     * @return TradeType 交易类型
     */
    public String getTradeType() {
        return this.TradeType;
    }

    /**
     * Set 交易类型
     * @param TradeType 交易类型
     */
    public void setTradeType(String TradeType) {
        this.TradeType = TradeType;
    }

    /**
     * Get 交易日期 
     * @return TradeTime 交易日期
     */
    public String getTradeTime() {
        return this.TradeTime;
    }

    /**
     * Set 交易日期
     * @param TradeTime 交易日期
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
    public String getTradeAmount() {
        return this.TradeAmount;
    }

    /**
     * Set 交易金额
     * @param TradeAmount 交易金额
     */
    public void setTradeAmount(String TradeAmount) {
        this.TradeAmount = TradeAmount;
    }

    /**
     * Get 交易名称 
     * @return TradeName 交易名称
     */
    public String getTradeName() {
        return this.TradeName;
    }

    /**
     * Set 交易名称
     * @param TradeName 交易名称
     */
    public void setTradeName(String TradeName) {
        this.TradeName = TradeName;
    }

    /**
     * Get 交易数量 
     * @return TradeCount 交易数量
     */
    public Long getTradeCount() {
        return this.TradeCount;
    }

    /**
     * Set 交易数量
     * @param TradeCount 交易数量
     */
    public void setTradeCount(Long TradeCount) {
        this.TradeCount = TradeCount;
    }

    /**
     * Get 货贸承运人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GoodsCarrier 货贸承运人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGoodsCarrier() {
        return this.GoodsCarrier;
    }

    /**
     * Set 货贸承运人
注意：此字段可能返回 null，表示取不到有效值。
     * @param GoodsCarrier 货贸承运人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGoodsCarrier(String GoodsCarrier) {
        this.GoodsCarrier = GoodsCarrier;
    }

    /**
     * Get 服贸交易细节
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceDetail 服贸交易细节
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceDetail() {
        return this.ServiceDetail;
    }

    /**
     * Set 服贸交易细节
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceDetail 服贸交易细节
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceDetail(String ServiceDetail) {
        this.ServiceDetail = ServiceDetail;
    }

    /**
     * Get 服贸服务时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceTime 服贸服务时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceTime() {
        return this.ServiceTime;
    }

    /**
     * Set 服贸服务时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceTime 服贸服务时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceTime(String ServiceTime) {
        this.ServiceTime = ServiceTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MerchantId", this.MerchantId);
        this.setParamSimple(map, prefix + "TradeFileId", this.TradeFileId);
        this.setParamSimple(map, prefix + "TradeOrderId", this.TradeOrderId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FailReason", this.FailReason);
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

    }
}

