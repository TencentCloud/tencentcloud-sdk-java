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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextLabelDistributionDetailInfoFifthClass extends AbstractModel{

    /**
    * 标签名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LabelValue")
    @Expose
    private String LabelValue;

    /**
    * 标签个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LabelCount")
    @Expose
    private Long LabelCount;

    /**
    * 标签占比
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LabelPercentage")
    @Expose
    private Float LabelPercentage;

    /**
     * Get 标签名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LabelValue 标签名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLabelValue() {
        return this.LabelValue;
    }

    /**
     * Set 标签名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param LabelValue 标签名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabelValue(String LabelValue) {
        this.LabelValue = LabelValue;
    }

    /**
     * Get 标签个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LabelCount 标签个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLabelCount() {
        return this.LabelCount;
    }

    /**
     * Set 标签个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param LabelCount 标签个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabelCount(Long LabelCount) {
        this.LabelCount = LabelCount;
    }

    /**
     * Get 标签占比
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LabelPercentage 标签占比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getLabelPercentage() {
        return this.LabelPercentage;
    }

    /**
     * Set 标签占比
注意：此字段可能返回 null，表示取不到有效值。
     * @param LabelPercentage 标签占比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabelPercentage(Float LabelPercentage) {
        this.LabelPercentage = LabelPercentage;
    }

    public TextLabelDistributionDetailInfoFifthClass() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextLabelDistributionDetailInfoFifthClass(TextLabelDistributionDetailInfoFifthClass source) {
        if (source.LabelValue != null) {
            this.LabelValue = new String(source.LabelValue);
        }
        if (source.LabelCount != null) {
            this.LabelCount = new Long(source.LabelCount);
        }
        if (source.LabelPercentage != null) {
            this.LabelPercentage = new Float(source.LabelPercentage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LabelValue", this.LabelValue);
        this.setParamSimple(map, prefix + "LabelCount", this.LabelCount);
        this.setParamSimple(map, prefix + "LabelPercentage", this.LabelPercentage);

    }
}

