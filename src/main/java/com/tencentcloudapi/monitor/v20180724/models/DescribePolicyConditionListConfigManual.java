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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePolicyConditionListConfigManual extends AbstractModel {

    /**
    * <p>检测方式</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CalcType")
    @Expose
    private DescribePolicyConditionListConfigManualCalcType CalcType;

    /**
    * <p>检测阈值</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CalcValue")
    @Expose
    private DescribePolicyConditionListConfigManualCalcValue CalcValue;

    /**
    * <p>持续时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContinueTime")
    @Expose
    private DescribePolicyConditionListConfigManualContinueTime ContinueTime;

    /**
    * <p>数据周期</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Period")
    @Expose
    private DescribePolicyConditionListConfigManualPeriod Period;

    /**
    * <p>持续周期个数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PeriodNum")
    @Expose
    private DescribePolicyConditionListConfigManualPeriodNum PeriodNum;

    /**
    * <p>聚合方式</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatType")
    @Expose
    private DescribePolicyConditionListConfigManualStatType StatType;

    /**
     * Get <p>检测方式</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CalcType <p>检测方式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribePolicyConditionListConfigManualCalcType getCalcType() {
        return this.CalcType;
    }

    /**
     * Set <p>检测方式</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CalcType <p>检测方式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCalcType(DescribePolicyConditionListConfigManualCalcType CalcType) {
        this.CalcType = CalcType;
    }

    /**
     * Get <p>检测阈值</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CalcValue <p>检测阈值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribePolicyConditionListConfigManualCalcValue getCalcValue() {
        return this.CalcValue;
    }

    /**
     * Set <p>检测阈值</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CalcValue <p>检测阈值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCalcValue(DescribePolicyConditionListConfigManualCalcValue CalcValue) {
        this.CalcValue = CalcValue;
    }

    /**
     * Get <p>持续时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContinueTime <p>持续时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribePolicyConditionListConfigManualContinueTime getContinueTime() {
        return this.ContinueTime;
    }

    /**
     * Set <p>持续时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContinueTime <p>持续时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContinueTime(DescribePolicyConditionListConfigManualContinueTime ContinueTime) {
        this.ContinueTime = ContinueTime;
    }

    /**
     * Get <p>数据周期</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Period <p>数据周期</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribePolicyConditionListConfigManualPeriod getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>数据周期</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Period <p>数据周期</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeriod(DescribePolicyConditionListConfigManualPeriod Period) {
        this.Period = Period;
    }

    /**
     * Get <p>持续周期个数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PeriodNum <p>持续周期个数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribePolicyConditionListConfigManualPeriodNum getPeriodNum() {
        return this.PeriodNum;
    }

    /**
     * Set <p>持续周期个数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PeriodNum <p>持续周期个数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeriodNum(DescribePolicyConditionListConfigManualPeriodNum PeriodNum) {
        this.PeriodNum = PeriodNum;
    }

    /**
     * Get <p>聚合方式</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatType <p>聚合方式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribePolicyConditionListConfigManualStatType getStatType() {
        return this.StatType;
    }

    /**
     * Set <p>聚合方式</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatType <p>聚合方式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatType(DescribePolicyConditionListConfigManualStatType StatType) {
        this.StatType = StatType;
    }

    public DescribePolicyConditionListConfigManual() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePolicyConditionListConfigManual(DescribePolicyConditionListConfigManual source) {
        if (source.CalcType != null) {
            this.CalcType = new DescribePolicyConditionListConfigManualCalcType(source.CalcType);
        }
        if (source.CalcValue != null) {
            this.CalcValue = new DescribePolicyConditionListConfigManualCalcValue(source.CalcValue);
        }
        if (source.ContinueTime != null) {
            this.ContinueTime = new DescribePolicyConditionListConfigManualContinueTime(source.ContinueTime);
        }
        if (source.Period != null) {
            this.Period = new DescribePolicyConditionListConfigManualPeriod(source.Period);
        }
        if (source.PeriodNum != null) {
            this.PeriodNum = new DescribePolicyConditionListConfigManualPeriodNum(source.PeriodNum);
        }
        if (source.StatType != null) {
            this.StatType = new DescribePolicyConditionListConfigManualStatType(source.StatType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "CalcType.", this.CalcType);
        this.setParamObj(map, prefix + "CalcValue.", this.CalcValue);
        this.setParamObj(map, prefix + "ContinueTime.", this.ContinueTime);
        this.setParamObj(map, prefix + "Period.", this.Period);
        this.setParamObj(map, prefix + "PeriodNum.", this.PeriodNum);
        this.setParamObj(map, prefix + "StatType.", this.StatType);

    }
}

