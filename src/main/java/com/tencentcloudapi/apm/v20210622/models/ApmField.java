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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApmField extends AbstractModel{

    /**
    * 昨日同比指标值，已弃用，不建议使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompareVal")
    @Expose
    private String CompareVal;

    /**
    * Compare值结果数组，推荐使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompareVals")
    @Expose
    private APMKVItem [] CompareVals;

    /**
    * 指标值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private Float Value;

    /**
    * 指标所对应的单位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * 请求数
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
     * Get 昨日同比指标值，已弃用，不建议使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompareVal 昨日同比指标值，已弃用，不建议使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCompareVal() {
        return this.CompareVal;
    }

    /**
     * Set 昨日同比指标值，已弃用，不建议使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompareVal 昨日同比指标值，已弃用，不建议使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompareVal(String CompareVal) {
        this.CompareVal = CompareVal;
    }

    /**
     * Get Compare值结果数组，推荐使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompareVals Compare值结果数组，推荐使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public APMKVItem [] getCompareVals() {
        return this.CompareVals;
    }

    /**
     * Set Compare值结果数组，推荐使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompareVals Compare值结果数组，推荐使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompareVals(APMKVItem [] CompareVals) {
        this.CompareVals = CompareVals;
    }

    /**
     * Get 指标值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value 指标值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getValue() {
        return this.Value;
    }

    /**
     * Set 指标值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value 指标值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(Float Value) {
        this.Value = Value;
    }

    /**
     * Get 指标所对应的单位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Unit 指标所对应的单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set 指标所对应的单位
注意：此字段可能返回 null，表示取不到有效值。
     * @param Unit 指标所对应的单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get 请求数 
     * @return Key 请求数
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 请求数
     * @param Key 请求数
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    public ApmField() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApmField(ApmField source) {
        if (source.CompareVal != null) {
            this.CompareVal = new String(source.CompareVal);
        }
        if (source.CompareVals != null) {
            this.CompareVals = new APMKVItem[source.CompareVals.length];
            for (int i = 0; i < source.CompareVals.length; i++) {
                this.CompareVals[i] = new APMKVItem(source.CompareVals[i]);
            }
        }
        if (source.Value != null) {
            this.Value = new Float(source.Value);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompareVal", this.CompareVal);
        this.setParamArrayObj(map, prefix + "CompareVals.", this.CompareVals);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "Key", this.Key);

    }
}

