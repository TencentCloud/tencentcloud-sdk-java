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

public class PluginConfigDTO extends AbstractModel {

    /**
    * 状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * 名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PluginName")
    @Expose
    private String PluginName;

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PluginID")
    @Expose
    private String PluginID;

    /**
    * 优先级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 表单配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PluginFormValues")
    @Expose
    private PluginFormValueDTO [] PluginFormValues;

    /**
     * Get 状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get 名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PluginName 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPluginName() {
        return this.PluginName;
    }

    /**
     * Set 名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param PluginName 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPluginName(String PluginName) {
        this.PluginName = PluginName;
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
     * Get ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PluginID ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPluginID() {
        return this.PluginID;
    }

    /**
     * Set ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param PluginID ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPluginID(String PluginID) {
        this.PluginID = PluginID;
    }

    /**
     * Get 优先级
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Level 优先级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 优先级
注意：此字段可能返回 null，表示取不到有效值。
     * @param Level 优先级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 表单配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PluginFormValues 表单配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PluginFormValueDTO [] getPluginFormValues() {
        return this.PluginFormValues;
    }

    /**
     * Set 表单配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param PluginFormValues 表单配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPluginFormValues(PluginFormValueDTO [] PluginFormValues) {
        this.PluginFormValues = PluginFormValues;
    }

    public PluginConfigDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PluginConfigDTO(PluginConfigDTO source) {
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.PluginName != null) {
            this.PluginName = new String(source.PluginName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.PluginID != null) {
            this.PluginID = new String(source.PluginID);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.PluginFormValues != null) {
            this.PluginFormValues = new PluginFormValueDTO[source.PluginFormValues.length];
            for (int i = 0; i < source.PluginFormValues.length; i++) {
                this.PluginFormValues[i] = new PluginFormValueDTO(source.PluginFormValues[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PluginName", this.PluginName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "PluginID", this.PluginID);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamArrayObj(map, prefix + "PluginFormValues.", this.PluginFormValues);

    }
}

