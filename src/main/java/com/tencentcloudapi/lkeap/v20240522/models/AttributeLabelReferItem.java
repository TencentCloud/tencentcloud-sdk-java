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
package com.tencentcloudapi.lkeap.v20240522.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttributeLabelReferItem extends AbstractModel {

    /**
    * 属性id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttributeId")
    @Expose
    private String AttributeId;

    /**
    * 标签id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LabelIds")
    @Expose
    private String [] LabelIds;

    /**
     * Get 属性id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttributeId 属性id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAttributeId() {
        return this.AttributeId;
    }

    /**
     * Set 属性id
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttributeId 属性id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttributeId(String AttributeId) {
        this.AttributeId = AttributeId;
    }

    /**
     * Get 标签id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LabelIds 标签id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getLabelIds() {
        return this.LabelIds;
    }

    /**
     * Set 标签id
注意：此字段可能返回 null，表示取不到有效值。
     * @param LabelIds 标签id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabelIds(String [] LabelIds) {
        this.LabelIds = LabelIds;
    }

    public AttributeLabelReferItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttributeLabelReferItem(AttributeLabelReferItem source) {
        if (source.AttributeId != null) {
            this.AttributeId = new String(source.AttributeId);
        }
        if (source.LabelIds != null) {
            this.LabelIds = new String[source.LabelIds.length];
            for (int i = 0; i < source.LabelIds.length; i++) {
                this.LabelIds[i] = new String(source.LabelIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AttributeId", this.AttributeId);
        this.setParamArraySimple(map, prefix + "LabelIds.", this.LabelIds);

    }
}

