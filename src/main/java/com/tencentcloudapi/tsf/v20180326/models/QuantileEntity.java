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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QuantileEntity extends AbstractModel{

    /**
    * 最大值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxValue")
    @Expose
    private String MaxValue;

    /**
    * 最小值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MinValue")
    @Expose
    private String MinValue;

    /**
    * 五分位值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FifthPositionValue")
    @Expose
    private String FifthPositionValue;

    /**
    * 九分位值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NinthPositionValue")
    @Expose
    private String NinthPositionValue;

    /**
     * Get 最大值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxValue 最大值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMaxValue() {
        return this.MaxValue;
    }

    /**
     * Set 最大值
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxValue 最大值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxValue(String MaxValue) {
        this.MaxValue = MaxValue;
    }

    /**
     * Get 最小值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MinValue 最小值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMinValue() {
        return this.MinValue;
    }

    /**
     * Set 最小值
注意：此字段可能返回 null，表示取不到有效值。
     * @param MinValue 最小值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMinValue(String MinValue) {
        this.MinValue = MinValue;
    }

    /**
     * Get 五分位值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FifthPositionValue 五分位值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFifthPositionValue() {
        return this.FifthPositionValue;
    }

    /**
     * Set 五分位值
注意：此字段可能返回 null，表示取不到有效值。
     * @param FifthPositionValue 五分位值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFifthPositionValue(String FifthPositionValue) {
        this.FifthPositionValue = FifthPositionValue;
    }

    /**
     * Get 九分位值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NinthPositionValue 九分位值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNinthPositionValue() {
        return this.NinthPositionValue;
    }

    /**
     * Set 九分位值
注意：此字段可能返回 null，表示取不到有效值。
     * @param NinthPositionValue 九分位值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNinthPositionValue(String NinthPositionValue) {
        this.NinthPositionValue = NinthPositionValue;
    }

    public QuantileEntity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QuantileEntity(QuantileEntity source) {
        if (source.MaxValue != null) {
            this.MaxValue = new String(source.MaxValue);
        }
        if (source.MinValue != null) {
            this.MinValue = new String(source.MinValue);
        }
        if (source.FifthPositionValue != null) {
            this.FifthPositionValue = new String(source.FifthPositionValue);
        }
        if (source.NinthPositionValue != null) {
            this.NinthPositionValue = new String(source.NinthPositionValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxValue", this.MaxValue);
        this.setParamSimple(map, prefix + "MinValue", this.MinValue);
        this.setParamSimple(map, prefix + "FifthPositionValue", this.FifthPositionValue);
        this.setParamSimple(map, prefix + "NinthPositionValue", this.NinthPositionValue);

    }
}

