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

public class DescribePolicyConditionListConfigManualCalcValue extends AbstractModel{

    /**
    * 默认值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Default")
    @Expose
    private String Default;

    /**
    * 固定值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Fixed")
    @Expose
    private String Fixed;

    /**
    * 最大值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Max")
    @Expose
    private String Max;

    /**
    * 最小值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Min")
    @Expose
    private String Min;

    /**
    * 是否必须
    */
    @SerializedName("Need")
    @Expose
    private Boolean Need;

    /**
     * Get 默认值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Default 默认值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDefault() {
        return this.Default;
    }

    /**
     * Set 默认值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Default 默认值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefault(String Default) {
        this.Default = Default;
    }

    /**
     * Get 固定值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Fixed 固定值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFixed() {
        return this.Fixed;
    }

    /**
     * Set 固定值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Fixed 固定值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFixed(String Fixed) {
        this.Fixed = Fixed;
    }

    /**
     * Get 最大值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Max 最大值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMax() {
        return this.Max;
    }

    /**
     * Set 最大值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Max 最大值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMax(String Max) {
        this.Max = Max;
    }

    /**
     * Get 最小值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Min 最小值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMin() {
        return this.Min;
    }

    /**
     * Set 最小值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Min 最小值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMin(String Min) {
        this.Min = Min;
    }

    /**
     * Get 是否必须 
     * @return Need 是否必须
     */
    public Boolean getNeed() {
        return this.Need;
    }

    /**
     * Set 是否必须
     * @param Need 是否必须
     */
    public void setNeed(Boolean Need) {
        this.Need = Need;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Default", this.Default);
        this.setParamSimple(map, prefix + "Fixed", this.Fixed);
        this.setParamSimple(map, prefix + "Max", this.Max);
        this.setParamSimple(map, prefix + "Min", this.Min);
        this.setParamSimple(map, prefix + "Need", this.Need);

    }
}

