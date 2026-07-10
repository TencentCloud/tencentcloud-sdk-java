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

public class DescribePolicyConditionListConfigManualCalcValue extends AbstractModel {

    /**
    * <p>默认值</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Default")
    @Expose
    private String Default;

    /**
    * <p>固定值</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Fixed")
    @Expose
    private String Fixed;

    /**
    * <p>最大值</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Max")
    @Expose
    private String Max;

    /**
    * <p>最小值</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Min")
    @Expose
    private String Min;

    /**
    * <p>是否必须</p>
    */
    @SerializedName("Need")
    @Expose
    private Boolean Need;

    /**
     * Get <p>默认值</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Default <p>默认值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDefault() {
        return this.Default;
    }

    /**
     * Set <p>默认值</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Default <p>默认值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefault(String Default) {
        this.Default = Default;
    }

    /**
     * Get <p>固定值</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Fixed <p>固定值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFixed() {
        return this.Fixed;
    }

    /**
     * Set <p>固定值</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Fixed <p>固定值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFixed(String Fixed) {
        this.Fixed = Fixed;
    }

    /**
     * Get <p>最大值</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Max <p>最大值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMax() {
        return this.Max;
    }

    /**
     * Set <p>最大值</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Max <p>最大值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMax(String Max) {
        this.Max = Max;
    }

    /**
     * Get <p>最小值</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Min <p>最小值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMin() {
        return this.Min;
    }

    /**
     * Set <p>最小值</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Min <p>最小值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMin(String Min) {
        this.Min = Min;
    }

    /**
     * Get <p>是否必须</p> 
     * @return Need <p>是否必须</p>
     */
    public Boolean getNeed() {
        return this.Need;
    }

    /**
     * Set <p>是否必须</p>
     * @param Need <p>是否必须</p>
     */
    public void setNeed(Boolean Need) {
        this.Need = Need;
    }

    public DescribePolicyConditionListConfigManualCalcValue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePolicyConditionListConfigManualCalcValue(DescribePolicyConditionListConfigManualCalcValue source) {
        if (source.Default != null) {
            this.Default = new String(source.Default);
        }
        if (source.Fixed != null) {
            this.Fixed = new String(source.Fixed);
        }
        if (source.Max != null) {
            this.Max = new String(source.Max);
        }
        if (source.Min != null) {
            this.Min = new String(source.Min);
        }
        if (source.Need != null) {
            this.Need = new Boolean(source.Need);
        }
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

