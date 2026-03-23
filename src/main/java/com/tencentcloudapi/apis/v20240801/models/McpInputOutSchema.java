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
package com.tencentcloudapi.apis.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class McpInputOutSchema extends AbstractModel {

    /**
    * 类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 属性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Properties")
    @Expose
    private String Properties;

    /**
    * 必填字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Required")
    @Expose
    private String [] Required;

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 属性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Properties 属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProperties() {
        return this.Properties;
    }

    /**
     * Set 属性
注意：此字段可能返回 null，表示取不到有效值。
     * @param Properties 属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProperties(String Properties) {
        this.Properties = Properties;
    }

    /**
     * Get 必填字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Required 必填字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getRequired() {
        return this.Required;
    }

    /**
     * Set 必填字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param Required 必填字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequired(String [] Required) {
        this.Required = Required;
    }

    /**
     * Get 描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public McpInputOutSchema() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public McpInputOutSchema(McpInputOutSchema source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Properties != null) {
            this.Properties = new String(source.Properties);
        }
        if (source.Required != null) {
            this.Required = new String[source.Required.length];
            for (int i = 0; i < source.Required.length; i++) {
                this.Required[i] = new String(source.Required[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Properties", this.Properties);
        this.setParamArraySimple(map, prefix + "Required.", this.Required);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

