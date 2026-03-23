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

public class McpTool extends AbstractModel {

    /**
    * 名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 入参参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputSchema")
    @Expose
    private McpInputOutSchema InputSchema;

    /**
    * 注释
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Annotations")
    @Expose
    private McpToolAnnotation Annotations;

    /**
    * 出参参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputSchema")
    @Expose
    private McpInputOutSchema OutputSchema;

    /**
     * Get 名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
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

    /**
     * Get 入参参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InputSchema 入参参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public McpInputOutSchema getInputSchema() {
        return this.InputSchema;
    }

    /**
     * Set 入参参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputSchema 入参参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputSchema(McpInputOutSchema InputSchema) {
        this.InputSchema = InputSchema;
    }

    /**
     * Get 注释
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Annotations 注释
注意：此字段可能返回 null，表示取不到有效值。
     */
    public McpToolAnnotation getAnnotations() {
        return this.Annotations;
    }

    /**
     * Set 注释
注意：此字段可能返回 null，表示取不到有效值。
     * @param Annotations 注释
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAnnotations(McpToolAnnotation Annotations) {
        this.Annotations = Annotations;
    }

    /**
     * Get 出参参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputSchema 出参参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public McpInputOutSchema getOutputSchema() {
        return this.OutputSchema;
    }

    /**
     * Set 出参参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputSchema 出参参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputSchema(McpInputOutSchema OutputSchema) {
        this.OutputSchema = OutputSchema;
    }

    public McpTool() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public McpTool(McpTool source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.InputSchema != null) {
            this.InputSchema = new McpInputOutSchema(source.InputSchema);
        }
        if (source.Annotations != null) {
            this.Annotations = new McpToolAnnotation(source.Annotations);
        }
        if (source.OutputSchema != null) {
            this.OutputSchema = new McpInputOutSchema(source.OutputSchema);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamObj(map, prefix + "InputSchema.", this.InputSchema);
        this.setParamObj(map, prefix + "Annotations.", this.Annotations);
        this.setParamObj(map, prefix + "OutputSchema.", this.OutputSchema);

    }
}

