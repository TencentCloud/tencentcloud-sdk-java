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

public class QueryDeclareData extends AbstractModel{

    /**
    * 商户号
    */
    @SerializedName("MerchantId")
    @Expose
    private String MerchantId;

    /**
    * 对接方汇出指令编号
    */
    @SerializedName("TransactionId")
    @Expose
    private String TransactionId;

    /**
    * 申报流水号
    */
    @SerializedName("DeclareId")
    @Expose
    private String DeclareId;

    /**
    * 原申报流水号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginalDeclareId")
    @Expose
    private String OriginalDeclareId;

    /**
    * 付款人ID
    */
    @SerializedName("PayerId")
    @Expose
    private String PayerId;

    /**
    * 源币种
    */
    @SerializedName("SourceCurrency")
    @Expose
    private String SourceCurrency;

    /**
    * 源金额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceAmount")
    @Expose
    private String SourceAmount;

    /**
    * 目的币种
    */
    @SerializedName("TargetCurrency")
    @Expose
    private String TargetCurrency;

    /**
    * 目的金额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetAmount")
    @Expose
    private String TargetAmount;

    /**
    * 交易编码
    */
    @SerializedName("TradeCode")
    @Expose
    private String TradeCode;

    /**
    * 状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

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
     * Get 对接方汇出指令编号 
     * @return TransactionId 对接方汇出指令编号
     */
    public String getTransactionId() {
        return this.TransactionId;
    }

    /**
     * Set 对接方汇出指令编号
     * @param TransactionId 对接方汇出指令编号
     */
    public void setTransactionId(String TransactionId) {
        this.TransactionId = TransactionId;
    }

    /**
     * Get 申报流水号 
     * @return DeclareId 申报流水号
     */
    public String getDeclareId() {
        return this.DeclareId;
    }

    /**
     * Set 申报流水号
     * @param DeclareId 申报流水号
     */
    public void setDeclareId(String DeclareId) {
        this.DeclareId = DeclareId;
    }

    /**
     * Get 原申报流水号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginalDeclareId 原申报流水号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOriginalDeclareId() {
        return this.OriginalDeclareId;
    }

    /**
     * Set 原申报流水号
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginalDeclareId 原申报流水号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginalDeclareId(String OriginalDeclareId) {
        this.OriginalDeclareId = OriginalDeclareId;
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
     * Get 源币种 
     * @return SourceCurrency 源币种
     */
    public String getSourceCurrency() {
        return this.SourceCurrency;
    }

    /**
     * Set 源币种
     * @param SourceCurrency 源币种
     */
    public void setSourceCurrency(String SourceCurrency) {
        this.SourceCurrency = SourceCurrency;
    }

    /**
     * Get 源金额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceAmount 源金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceAmount() {
        return this.SourceAmount;
    }

    /**
     * Set 源金额
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceAmount 源金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceAmount(String SourceAmount) {
        this.SourceAmount = SourceAmount;
    }

    /**
     * Get 目的币种 
     * @return TargetCurrency 目的币种
     */
    public String getTargetCurrency() {
        return this.TargetCurrency;
    }

    /**
     * Set 目的币种
     * @param TargetCurrency 目的币种
     */
    public void setTargetCurrency(String TargetCurrency) {
        this.TargetCurrency = TargetCurrency;
    }

    /**
     * Get 目的金额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetAmount 目的金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetAmount() {
        return this.TargetAmount;
    }

    /**
     * Set 目的金额
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetAmount 目的金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetAmount(String TargetAmount) {
        this.TargetAmount = TargetAmount;
    }

    /**
     * Get 交易编码 
     * @return TradeCode 交易编码
     */
    public String getTradeCode() {
        return this.TradeCode;
    }

    /**
     * Set 交易编码
     * @param TradeCode 交易编码
     */
    public void setTradeCode(String TradeCode) {
        this.TradeCode = TradeCode;
    }

    /**
     * Get 状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MerchantId", this.MerchantId);
        this.setParamSimple(map, prefix + "TransactionId", this.TransactionId);
        this.setParamSimple(map, prefix + "DeclareId", this.DeclareId);
        this.setParamSimple(map, prefix + "OriginalDeclareId", this.OriginalDeclareId);
        this.setParamSimple(map, prefix + "PayerId", this.PayerId);
        this.setParamSimple(map, prefix + "SourceCurrency", this.SourceCurrency);
        this.setParamSimple(map, prefix + "SourceAmount", this.SourceAmount);
        this.setParamSimple(map, prefix + "TargetCurrency", this.TargetCurrency);
        this.setParamSimple(map, prefix + "TargetAmount", this.TargetAmount);
        this.setParamSimple(map, prefix + "TradeCode", this.TradeCode);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

