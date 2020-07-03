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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TagSummaryOverviewItem extends AbstractModel{

    /**
    * 标签值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagValue")
    @Expose
    private String TagValue;

    /**
    * 实际花费
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RealTotalCost")
    @Expose
    private String RealTotalCost;

    /**
    * 费用所占百分比，两位小数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RealTotalCostRatio")
    @Expose
    private String RealTotalCostRatio;

    /**
     * Get 标签值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagValue 标签值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTagValue() {
        return this.TagValue;
    }

    /**
     * Set 标签值
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagValue 标签值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagValue(String TagValue) {
        this.TagValue = TagValue;
    }

    /**
     * Get 实际花费
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RealTotalCost 实际花费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRealTotalCost() {
        return this.RealTotalCost;
    }

    /**
     * Set 实际花费
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealTotalCost 实际花费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRealTotalCost(String RealTotalCost) {
        this.RealTotalCost = RealTotalCost;
    }

    /**
     * Get 费用所占百分比，两位小数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RealTotalCostRatio 费用所占百分比，两位小数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRealTotalCostRatio() {
        return this.RealTotalCostRatio;
    }

    /**
     * Set 费用所占百分比，两位小数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealTotalCostRatio 费用所占百分比，两位小数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRealTotalCostRatio(String RealTotalCostRatio) {
        this.RealTotalCostRatio = RealTotalCostRatio;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TagValue", this.TagValue);
        this.setParamSimple(map, prefix + "RealTotalCost", this.RealTotalCost);
        this.setParamSimple(map, prefix + "RealTotalCostRatio", this.RealTotalCostRatio);

    }
}

