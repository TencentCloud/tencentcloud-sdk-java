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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RoutingDestinationRuleLabel extends AbstractModel {

    /**
    * 标签键
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LabelKey")
    @Expose
    private String LabelKey;

    /**
    * 标签值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LabelValue")
    @Expose
    private String LabelValue;

    /**
    * 表达式类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LabelType")
    @Expose
    private String LabelType;

    /**
    * 值类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LabelValueType")
    @Expose
    private String LabelValueType;

    /**
     * Get 标签键
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LabelKey 标签键
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLabelKey() {
        return this.LabelKey;
    }

    /**
     * Set 标签键
注意：此字段可能返回 null，表示取不到有效值。
     * @param LabelKey 标签键
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabelKey(String LabelKey) {
        this.LabelKey = LabelKey;
    }

    /**
     * Get 标签值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LabelValue 标签值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLabelValue() {
        return this.LabelValue;
    }

    /**
     * Set 标签值
注意：此字段可能返回 null，表示取不到有效值。
     * @param LabelValue 标签值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabelValue(String LabelValue) {
        this.LabelValue = LabelValue;
    }

    /**
     * Get 表达式类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LabelType 表达式类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLabelType() {
        return this.LabelType;
    }

    /**
     * Set 表达式类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param LabelType 表达式类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabelType(String LabelType) {
        this.LabelType = LabelType;
    }

    /**
     * Get 值类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LabelValueType 值类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLabelValueType() {
        return this.LabelValueType;
    }

    /**
     * Set 值类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param LabelValueType 值类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabelValueType(String LabelValueType) {
        this.LabelValueType = LabelValueType;
    }

    public RoutingDestinationRuleLabel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoutingDestinationRuleLabel(RoutingDestinationRuleLabel source) {
        if (source.LabelKey != null) {
            this.LabelKey = new String(source.LabelKey);
        }
        if (source.LabelValue != null) {
            this.LabelValue = new String(source.LabelValue);
        }
        if (source.LabelType != null) {
            this.LabelType = new String(source.LabelType);
        }
        if (source.LabelValueType != null) {
            this.LabelValueType = new String(source.LabelValueType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LabelKey", this.LabelKey);
        this.setParamSimple(map, prefix + "LabelValue", this.LabelValue);
        this.setParamSimple(map, prefix + "LabelType", this.LabelType);
        this.setParamSimple(map, prefix + "LabelValueType", this.LabelValueType);

    }
}

