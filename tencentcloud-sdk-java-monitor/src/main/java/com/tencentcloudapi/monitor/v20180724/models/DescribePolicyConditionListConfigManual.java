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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePolicyConditionListConfigManual extends AbstractModel{

    /**
    * 检测方式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CalcType")
    @Expose
    private DescribePolicyConditionListConfigManualCalcType CalcType;

    /**
    * 检测阈值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CalcValue")
    @Expose
    private DescribePolicyConditionListConfigManualCalcValue CalcValue;

    /**
    * 持续时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContinueTime")
    @Expose
    private DescribePolicyConditionListConfigManualContinueTime ContinueTime;

    /**
    * 数据周期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Period")
    @Expose
    private DescribePolicyConditionListConfigManualPeriod Period;

    /**
    * 持续周期个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PeriodNum")
    @Expose
    private DescribePolicyConditionListConfigManualPeriodNum PeriodNum;

    /**
    * 聚合方式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatType")
    @Expose
    private DescribePolicyConditionListConfigManualStatType StatType;

    /**
     * Get 检测方式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CalcType 检测方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribePolicyConditionListConfigManualCalcType getCalcType() {
        return this.CalcType;
    }

    /**
     * Set 检测方式
注意：此字段可能返回 null，表示取不到有效值。
     * @param CalcType 检测方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCalcType(DescribePolicyConditionListConfigManualCalcType CalcType) {
        this.CalcType = CalcType;
    }

    /**
     * Get 检测阈值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CalcValue 检测阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribePolicyConditionListConfigManualCalcValue getCalcValue() {
        return this.CalcValue;
    }

    /**
     * Set 检测阈值
注意：此字段可能返回 null，表示取不到有效值。
     * @param CalcValue 检测阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCalcValue(DescribePolicyConditionListConfigManualCalcValue CalcValue) {
        this.CalcValue = CalcValue;
    }

    /**
     * Get 持续时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContinueTime 持续时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribePolicyConditionListConfigManualContinueTime getContinueTime() {
        return this.ContinueTime;
    }

    /**
     * Set 持续时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContinueTime 持续时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContinueTime(DescribePolicyConditionListConfigManualContinueTime ContinueTime) {
        this.ContinueTime = ContinueTime;
    }

    /**
     * Get 数据周期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Period 数据周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribePolicyConditionListConfigManualPeriod getPeriod() {
        return this.Period;
    }

    /**
     * Set 数据周期
注意：此字段可能返回 null，表示取不到有效值。
     * @param Period 数据周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeriod(DescribePolicyConditionListConfigManualPeriod Period) {
        this.Period = Period;
    }

    /**
     * Get 持续周期个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PeriodNum 持续周期个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribePolicyConditionListConfigManualPeriodNum getPeriodNum() {
        return this.PeriodNum;
    }

    /**
     * Set 持续周期个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param PeriodNum 持续周期个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeriodNum(DescribePolicyConditionListConfigManualPeriodNum PeriodNum) {
        this.PeriodNum = PeriodNum;
    }

    /**
     * Get 聚合方式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatType 聚合方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribePolicyConditionListConfigManualStatType getStatType() {
        return this.StatType;
    }

    /**
     * Set 聚合方式
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatType 聚合方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatType(DescribePolicyConditionListConfigManualStatType StatType) {
        this.StatType = StatType;
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

