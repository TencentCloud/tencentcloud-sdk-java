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

public class AttributeItem extends AbstractModel {

    /**
    * 属性id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttributeId")
    @Expose
    private String AttributeId;

    /**
    * 属性标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttributeKey")
    @Expose
    private String AttributeKey;

    /**
    * 属性名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttributeName")
    @Expose
    private String AttributeName;

    /**
    * 标签名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Labels")
    @Expose
    private AttributeLabelItem [] Labels;

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
     * Get 属性标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttributeKey 属性标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAttributeKey() {
        return this.AttributeKey;
    }

    /**
     * Set 属性标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttributeKey 属性标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttributeKey(String AttributeKey) {
        this.AttributeKey = AttributeKey;
    }

    /**
     * Get 属性名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttributeName 属性名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAttributeName() {
        return this.AttributeName;
    }

    /**
     * Set 属性名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttributeName 属性名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttributeName(String AttributeName) {
        this.AttributeName = AttributeName;
    }

    /**
     * Get 标签名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Labels 标签名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AttributeLabelItem [] getLabels() {
        return this.Labels;
    }

    /**
     * Set 标签名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Labels 标签名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabels(AttributeLabelItem [] Labels) {
        this.Labels = Labels;
    }

    public AttributeItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttributeItem(AttributeItem source) {
        if (source.AttributeId != null) {
            this.AttributeId = new String(source.AttributeId);
        }
        if (source.AttributeKey != null) {
            this.AttributeKey = new String(source.AttributeKey);
        }
        if (source.AttributeName != null) {
            this.AttributeName = new String(source.AttributeName);
        }
        if (source.Labels != null) {
            this.Labels = new AttributeLabelItem[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new AttributeLabelItem(source.Labels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AttributeId", this.AttributeId);
        this.setParamSimple(map, prefix + "AttributeKey", this.AttributeKey);
        this.setParamSimple(map, prefix + "AttributeName", this.AttributeName);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);

    }
}

