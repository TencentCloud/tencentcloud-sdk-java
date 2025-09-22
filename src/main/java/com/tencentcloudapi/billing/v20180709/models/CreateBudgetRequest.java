/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBudgetRequest extends AbstractModel {

    /**
    * 预算名称
    */
    @SerializedName("BudgetName")
    @Expose
    private String BudgetName;

    /**
    * DAY 天，MONTH 月度，QUARTER 季度 ，YEAR 年度
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * 有效期起始时间 2025-01-01(周期: 天) / 2025-01（周期: 月）
    */
    @SerializedName("PeriodBegin")
    @Expose
    private String PeriodBegin;

    /**
    * 有效期结束时间  2025-12-01(周期：天)  / 2025-12（周期：月）
    */
    @SerializedName("PeriodEnd")
    @Expose
    private String PeriodEnd;

    /**
    * FIX 固定预算，CYCLE 计划预算
    */
    @SerializedName("PlanType")
    @Expose
    private String PlanType;

    /**
    * 预算值额度
预算计划类型为FIX(固定预算)时传定值；
预算计划类型为CYCLE(计划预算)时传[{"dateDesc":"2025-07","quota":"1000"},{"dateDesc":"2025-08","quota":"2000"}]；
    */
    @SerializedName("BudgetQuota")
    @Expose
    private String BudgetQuota;

    /**
    * BILL  系统账单，CONSUMPTION  消耗账单
    */
    @SerializedName("BillType")
    @Expose
    private String BillType;

    /**
    * COST 原价，REAL_COST 实际费用，CASH 现金，INCENTIVE 赠送金，VOUCHER 代金券，TRANSFER 分成金，TAX 税，AMOUNT_BEFORE_TAX 现金支付(税前)
    */
    @SerializedName("FeeType")
    @Expose
    private String FeeType;

    /**
    * 阈值提醒
    */
    @SerializedName("WarnJson")
    @Expose
    private BudgetWarn [] WarnJson;

    /**
    * 预算备注
    */
    @SerializedName("BudgetNote")
    @Expose
    private String BudgetNote;

    /**
    * 预算维度范围条件
    */
    @SerializedName("DimensionsRange")
    @Expose
    private BudgetConditionsForm DimensionsRange;

    /**
    * 波动提醒
    */
    @SerializedName("WaveThresholdJson")
    @Expose
    private WaveThresholdForm [] WaveThresholdJson;

    /**
     * Get 预算名称 
     * @return BudgetName 预算名称
     */
    public String getBudgetName() {
        return this.BudgetName;
    }

    /**
     * Set 预算名称
     * @param BudgetName 预算名称
     */
    public void setBudgetName(String BudgetName) {
        this.BudgetName = BudgetName;
    }

    /**
     * Get DAY 天，MONTH 月度，QUARTER 季度 ，YEAR 年度 
     * @return CycleType DAY 天，MONTH 月度，QUARTER 季度 ，YEAR 年度
     */
    public String getCycleType() {
        return this.CycleType;
    }

    /**
     * Set DAY 天，MONTH 月度，QUARTER 季度 ，YEAR 年度
     * @param CycleType DAY 天，MONTH 月度，QUARTER 季度 ，YEAR 年度
     */
    public void setCycleType(String CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get 有效期起始时间 2025-01-01(周期: 天) / 2025-01（周期: 月） 
     * @return PeriodBegin 有效期起始时间 2025-01-01(周期: 天) / 2025-01（周期: 月）
     */
    public String getPeriodBegin() {
        return this.PeriodBegin;
    }

    /**
     * Set 有效期起始时间 2025-01-01(周期: 天) / 2025-01（周期: 月）
     * @param PeriodBegin 有效期起始时间 2025-01-01(周期: 天) / 2025-01（周期: 月）
     */
    public void setPeriodBegin(String PeriodBegin) {
        this.PeriodBegin = PeriodBegin;
    }

    /**
     * Get 有效期结束时间  2025-12-01(周期：天)  / 2025-12（周期：月） 
     * @return PeriodEnd 有效期结束时间  2025-12-01(周期：天)  / 2025-12（周期：月）
     */
    public String getPeriodEnd() {
        return this.PeriodEnd;
    }

    /**
     * Set 有效期结束时间  2025-12-01(周期：天)  / 2025-12（周期：月）
     * @param PeriodEnd 有效期结束时间  2025-12-01(周期：天)  / 2025-12（周期：月）
     */
    public void setPeriodEnd(String PeriodEnd) {
        this.PeriodEnd = PeriodEnd;
    }

    /**
     * Get FIX 固定预算，CYCLE 计划预算 
     * @return PlanType FIX 固定预算，CYCLE 计划预算
     */
    public String getPlanType() {
        return this.PlanType;
    }

    /**
     * Set FIX 固定预算，CYCLE 计划预算
     * @param PlanType FIX 固定预算，CYCLE 计划预算
     */
    public void setPlanType(String PlanType) {
        this.PlanType = PlanType;
    }

    /**
     * Get 预算值额度
预算计划类型为FIX(固定预算)时传定值；
预算计划类型为CYCLE(计划预算)时传[{"dateDesc":"2025-07","quota":"1000"},{"dateDesc":"2025-08","quota":"2000"}]； 
     * @return BudgetQuota 预算值额度
预算计划类型为FIX(固定预算)时传定值；
预算计划类型为CYCLE(计划预算)时传[{"dateDesc":"2025-07","quota":"1000"},{"dateDesc":"2025-08","quota":"2000"}]；
     */
    public String getBudgetQuota() {
        return this.BudgetQuota;
    }

    /**
     * Set 预算值额度
预算计划类型为FIX(固定预算)时传定值；
预算计划类型为CYCLE(计划预算)时传[{"dateDesc":"2025-07","quota":"1000"},{"dateDesc":"2025-08","quota":"2000"}]；
     * @param BudgetQuota 预算值额度
预算计划类型为FIX(固定预算)时传定值；
预算计划类型为CYCLE(计划预算)时传[{"dateDesc":"2025-07","quota":"1000"},{"dateDesc":"2025-08","quota":"2000"}]；
     */
    public void setBudgetQuota(String BudgetQuota) {
        this.BudgetQuota = BudgetQuota;
    }

    /**
     * Get BILL  系统账单，CONSUMPTION  消耗账单 
     * @return BillType BILL  系统账单，CONSUMPTION  消耗账单
     */
    public String getBillType() {
        return this.BillType;
    }

    /**
     * Set BILL  系统账单，CONSUMPTION  消耗账单
     * @param BillType BILL  系统账单，CONSUMPTION  消耗账单
     */
    public void setBillType(String BillType) {
        this.BillType = BillType;
    }

    /**
     * Get COST 原价，REAL_COST 实际费用，CASH 现金，INCENTIVE 赠送金，VOUCHER 代金券，TRANSFER 分成金，TAX 税，AMOUNT_BEFORE_TAX 现金支付(税前) 
     * @return FeeType COST 原价，REAL_COST 实际费用，CASH 现金，INCENTIVE 赠送金，VOUCHER 代金券，TRANSFER 分成金，TAX 税，AMOUNT_BEFORE_TAX 现金支付(税前)
     */
    public String getFeeType() {
        return this.FeeType;
    }

    /**
     * Set COST 原价，REAL_COST 实际费用，CASH 现金，INCENTIVE 赠送金，VOUCHER 代金券，TRANSFER 分成金，TAX 税，AMOUNT_BEFORE_TAX 现金支付(税前)
     * @param FeeType COST 原价，REAL_COST 实际费用，CASH 现金，INCENTIVE 赠送金，VOUCHER 代金券，TRANSFER 分成金，TAX 税，AMOUNT_BEFORE_TAX 现金支付(税前)
     */
    public void setFeeType(String FeeType) {
        this.FeeType = FeeType;
    }

    /**
     * Get 阈值提醒 
     * @return WarnJson 阈值提醒
     */
    public BudgetWarn [] getWarnJson() {
        return this.WarnJson;
    }

    /**
     * Set 阈值提醒
     * @param WarnJson 阈值提醒
     */
    public void setWarnJson(BudgetWarn [] WarnJson) {
        this.WarnJson = WarnJson;
    }

    /**
     * Get 预算备注 
     * @return BudgetNote 预算备注
     */
    public String getBudgetNote() {
        return this.BudgetNote;
    }

    /**
     * Set 预算备注
     * @param BudgetNote 预算备注
     */
    public void setBudgetNote(String BudgetNote) {
        this.BudgetNote = BudgetNote;
    }

    /**
     * Get 预算维度范围条件 
     * @return DimensionsRange 预算维度范围条件
     */
    public BudgetConditionsForm getDimensionsRange() {
        return this.DimensionsRange;
    }

    /**
     * Set 预算维度范围条件
     * @param DimensionsRange 预算维度范围条件
     */
    public void setDimensionsRange(BudgetConditionsForm DimensionsRange) {
        this.DimensionsRange = DimensionsRange;
    }

    /**
     * Get 波动提醒 
     * @return WaveThresholdJson 波动提醒
     */
    public WaveThresholdForm [] getWaveThresholdJson() {
        return this.WaveThresholdJson;
    }

    /**
     * Set 波动提醒
     * @param WaveThresholdJson 波动提醒
     */
    public void setWaveThresholdJson(WaveThresholdForm [] WaveThresholdJson) {
        this.WaveThresholdJson = WaveThresholdJson;
    }

    public CreateBudgetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBudgetRequest(CreateBudgetRequest source) {
        if (source.BudgetName != null) {
            this.BudgetName = new String(source.BudgetName);
        }
        if (source.CycleType != null) {
            this.CycleType = new String(source.CycleType);
        }
        if (source.PeriodBegin != null) {
            this.PeriodBegin = new String(source.PeriodBegin);
        }
        if (source.PeriodEnd != null) {
            this.PeriodEnd = new String(source.PeriodEnd);
        }
        if (source.PlanType != null) {
            this.PlanType = new String(source.PlanType);
        }
        if (source.BudgetQuota != null) {
            this.BudgetQuota = new String(source.BudgetQuota);
        }
        if (source.BillType != null) {
            this.BillType = new String(source.BillType);
        }
        if (source.FeeType != null) {
            this.FeeType = new String(source.FeeType);
        }
        if (source.WarnJson != null) {
            this.WarnJson = new BudgetWarn[source.WarnJson.length];
            for (int i = 0; i < source.WarnJson.length; i++) {
                this.WarnJson[i] = new BudgetWarn(source.WarnJson[i]);
            }
        }
        if (source.BudgetNote != null) {
            this.BudgetNote = new String(source.BudgetNote);
        }
        if (source.DimensionsRange != null) {
            this.DimensionsRange = new BudgetConditionsForm(source.DimensionsRange);
        }
        if (source.WaveThresholdJson != null) {
            this.WaveThresholdJson = new WaveThresholdForm[source.WaveThresholdJson.length];
            for (int i = 0; i < source.WaveThresholdJson.length; i++) {
                this.WaveThresholdJson[i] = new WaveThresholdForm(source.WaveThresholdJson[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BudgetName", this.BudgetName);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "PeriodBegin", this.PeriodBegin);
        this.setParamSimple(map, prefix + "PeriodEnd", this.PeriodEnd);
        this.setParamSimple(map, prefix + "PlanType", this.PlanType);
        this.setParamSimple(map, prefix + "BudgetQuota", this.BudgetQuota);
        this.setParamSimple(map, prefix + "BillType", this.BillType);
        this.setParamSimple(map, prefix + "FeeType", this.FeeType);
        this.setParamArrayObj(map, prefix + "WarnJson.", this.WarnJson);
        this.setParamSimple(map, prefix + "BudgetNote", this.BudgetNote);
        this.setParamObj(map, prefix + "DimensionsRange.", this.DimensionsRange);
        this.setParamArrayObj(map, prefix + "WaveThresholdJson.", this.WaveThresholdJson);

    }
}

