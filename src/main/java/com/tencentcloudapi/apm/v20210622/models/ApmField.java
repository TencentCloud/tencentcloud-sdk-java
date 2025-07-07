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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApmField extends AbstractModel {

    /**
    * 指标名
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 指标数值
    */
    @SerializedName("Value")
    @Expose
    private Float Value;

    /**
    * 指标所对应的单位
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * 同比结果数组，推荐使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompareVals")
    @Expose
    private APMKVItem [] CompareVals;

    /**
    * 同比上一个周期的具体指标数值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastPeriodValue")
    @Expose
    private APMKV [] LastPeriodValue;

    /**
    * 同比指标值，已弃用，不建议使用
    */
    @SerializedName("CompareVal")
    @Expose
    private String CompareVal;

    /**
     * Get 指标名 
     * @return Key 指标名
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 指标名
     * @param Key 指标名
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 指标数值 
     * @return Value 指标数值
     */
    public Float getValue() {
        return this.Value;
    }

    /**
     * Set 指标数值
     * @param Value 指标数值
     */
    public void setValue(Float Value) {
        this.Value = Value;
    }

    /**
     * Get 指标所对应的单位 
     * @return Unit 指标所对应的单位
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set 指标所对应的单位
     * @param Unit 指标所对应的单位
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get 同比结果数组，推荐使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompareVals 同比结果数组，推荐使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public APMKVItem [] getCompareVals() {
        return this.CompareVals;
    }

    /**
     * Set 同比结果数组，推荐使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompareVals 同比结果数组，推荐使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompareVals(APMKVItem [] CompareVals) {
        this.CompareVals = CompareVals;
    }

    /**
     * Get 同比上一个周期的具体指标数值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastPeriodValue 同比上一个周期的具体指标数值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public APMKV [] getLastPeriodValue() {
        return this.LastPeriodValue;
    }

    /**
     * Set 同比上一个周期的具体指标数值
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastPeriodValue 同比上一个周期的具体指标数值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastPeriodValue(APMKV [] LastPeriodValue) {
        this.LastPeriodValue = LastPeriodValue;
    }

    /**
     * Get 同比指标值，已弃用，不建议使用 
     * @return CompareVal 同比指标值，已弃用，不建议使用
     */
    public String getCompareVal() {
        return this.CompareVal;
    }

    /**
     * Set 同比指标值，已弃用，不建议使用
     * @param CompareVal 同比指标值，已弃用，不建议使用
     */
    public void setCompareVal(String CompareVal) {
        this.CompareVal = CompareVal;
    }

    public ApmField() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApmField(ApmField source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new Float(source.Value);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.CompareVals != null) {
            this.CompareVals = new APMKVItem[source.CompareVals.length];
            for (int i = 0; i < source.CompareVals.length; i++) {
                this.CompareVals[i] = new APMKVItem(source.CompareVals[i]);
            }
        }
        if (source.LastPeriodValue != null) {
            this.LastPeriodValue = new APMKV[source.LastPeriodValue.length];
            for (int i = 0; i < source.LastPeriodValue.length; i++) {
                this.LastPeriodValue[i] = new APMKV(source.LastPeriodValue[i]);
            }
        }
        if (source.CompareVal != null) {
            this.CompareVal = new String(source.CompareVal);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamArrayObj(map, prefix + "CompareVals.", this.CompareVals);
        this.setParamArrayObj(map, prefix + "LastPeriodValue.", this.LastPeriodValue);
        this.setParamSimple(map, prefix + "CompareVal", this.CompareVal);

    }
}

