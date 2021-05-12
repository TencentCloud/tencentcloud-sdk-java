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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiagnoseUnit extends AbstractModel{

    /**
    * 内容单元英文名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 内容单元中文名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeyText")
    @Expose
    private String KeyText;

    /**
    * 报告内容。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 报告内容。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValueText")
    @Expose
    private String ValueText;

    /**
     * Get 内容单元英文名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Key 内容单元英文名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 内容单元英文名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Key 内容单元英文名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 内容单元中文名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeyText 内容单元中文名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKeyText() {
        return this.KeyText;
    }

    /**
     * Set 内容单元中文名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeyText 内容单元中文名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeyText(String KeyText) {
        this.KeyText = KeyText;
    }

    /**
     * Get 报告内容。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value 报告内容。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 报告内容。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value 报告内容。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 报告内容。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ValueText 报告内容。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValueText() {
        return this.ValueText;
    }

    /**
     * Set 报告内容。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ValueText 报告内容。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValueText(String ValueText) {
        this.ValueText = ValueText;
    }

    public DiagnoseUnit() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiagnoseUnit(DiagnoseUnit source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.KeyText != null) {
            this.KeyText = new String(source.KeyText);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.ValueText != null) {
            this.ValueText = new String(source.ValueText);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "KeyText", this.KeyText);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "ValueText", this.ValueText);

    }
}

