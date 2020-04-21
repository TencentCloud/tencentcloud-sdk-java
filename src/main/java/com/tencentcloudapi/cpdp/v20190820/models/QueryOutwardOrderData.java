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

public class QueryOutwardOrderData extends AbstractModel{

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
    * 财务日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AcctDate")
    @Expose
    private String AcctDate;

    /**
    * 定价币种
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PricingCurrency")
    @Expose
    private String PricingCurrency;

    /**
    * 源币种
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。
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
    * 汇率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FxRate")
    @Expose
    private String FxRate;

    /**
    * 指令状态
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
    * 退汇金额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RefundAmount")
    @Expose
    private String RefundAmount;

    /**
    * 退汇币种
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RefundCurrency")
    @Expose
    private String RefundCurrency;

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
     * Get 财务日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AcctDate 财务日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAcctDate() {
        return this.AcctDate;
    }

    /**
     * Set 财务日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param AcctDate 财务日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAcctDate(String AcctDate) {
        this.AcctDate = AcctDate;
    }

    /**
     * Get 定价币种
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PricingCurrency 定价币种
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPricingCurrency() {
        return this.PricingCurrency;
    }

    /**
     * Set 定价币种
注意：此字段可能返回 null，表示取不到有效值。
     * @param PricingCurrency 定价币种
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPricingCurrency(String PricingCurrency) {
        this.PricingCurrency = PricingCurrency;
    }

    /**
     * Get 源币种
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceCurrency 源币种
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceCurrency() {
        return this.SourceCurrency;
    }

    /**
     * Set 源币种
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceCurrency 源币种
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetCurrency 目的币种
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetCurrency() {
        return this.TargetCurrency;
    }

    /**
     * Set 目的币种
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetCurrency 目的币种
注意：此字段可能返回 null，表示取不到有效值。
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
     * Get 汇率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FxRate 汇率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFxRate() {
        return this.FxRate;
    }

    /**
     * Set 汇率
注意：此字段可能返回 null，表示取不到有效值。
     * @param FxRate 汇率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFxRate(String FxRate) {
        this.FxRate = FxRate;
    }

    /**
     * Get 指令状态 
     * @return Status 指令状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 指令状态
     * @param Status 指令状态
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
     * Get 退汇金额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RefundAmount 退汇金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRefundAmount() {
        return this.RefundAmount;
    }

    /**
     * Set 退汇金额
注意：此字段可能返回 null，表示取不到有效值。
     * @param RefundAmount 退汇金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRefundAmount(String RefundAmount) {
        this.RefundAmount = RefundAmount;
    }

    /**
     * Get 退汇币种
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RefundCurrency 退汇币种
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRefundCurrency() {
        return this.RefundCurrency;
    }

    /**
     * Set 退汇币种
注意：此字段可能返回 null，表示取不到有效值。
     * @param RefundCurrency 退汇币种
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRefundCurrency(String RefundCurrency) {
        this.RefundCurrency = RefundCurrency;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MerchantId", this.MerchantId);
        this.setParamSimple(map, prefix + "TransactionId", this.TransactionId);
        this.setParamSimple(map, prefix + "AcctDate", this.AcctDate);
        this.setParamSimple(map, prefix + "PricingCurrency", this.PricingCurrency);
        this.setParamSimple(map, prefix + "SourceCurrency", this.SourceCurrency);
        this.setParamSimple(map, prefix + "SourceAmount", this.SourceAmount);
        this.setParamSimple(map, prefix + "TargetCurrency", this.TargetCurrency);
        this.setParamSimple(map, prefix + "TargetAmount", this.TargetAmount);
        this.setParamSimple(map, prefix + "FxRate", this.FxRate);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FailReason", this.FailReason);
        this.setParamSimple(map, prefix + "RefundAmount", this.RefundAmount);
        this.setParamSimple(map, prefix + "RefundCurrency", this.RefundCurrency);

    }
}

