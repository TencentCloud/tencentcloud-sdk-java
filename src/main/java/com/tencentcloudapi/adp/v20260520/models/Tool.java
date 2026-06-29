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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Tool extends AbstractModel {

    /**
    * <p>工具计费信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Billing")
    @Expose
    private ToolBilling Billing;

    /**
    * <p>工具调用次数</p><p>单位：次数</p>
    */
    @SerializedName("CallCount")
    @Expose
    private Long CallCount;

    /**
    * <p>工具描述信息</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>工具名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>插件ID</p>
    */
    @SerializedName("PluginId")
    @Expose
    private String PluginId;

    /**
    * <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>TOOL_ACCESS_MODE_UNKNOWN</td><td>0</td><td>未指定</td></tr><tr><td>TOOL_ACCESS_MODE_READ_ONLY</td><td>1</td><td>只读</td></tr><tr><td>TOOL_ACCESS_MODE_WRITE_DELETE</td><td>2</td><td>写/删除</td></tr></tbody></table>
    */
    @SerializedName("ToolAccessMode")
    @Expose
    private Long ToolAccessMode;

    /**
    * <p>工具配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ToolConfig")
    @Expose
    private ToolConfig ToolConfig;

    /**
    * <p>工具ID</p>
    */
    @SerializedName("ToolId")
    @Expose
    private String ToolId;

    /**
     * Get <p>工具计费信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Billing <p>工具计费信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ToolBilling getBilling() {
        return this.Billing;
    }

    /**
     * Set <p>工具计费信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Billing <p>工具计费信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBilling(ToolBilling Billing) {
        this.Billing = Billing;
    }

    /**
     * Get <p>工具调用次数</p><p>单位：次数</p> 
     * @return CallCount <p>工具调用次数</p><p>单位：次数</p>
     */
    public Long getCallCount() {
        return this.CallCount;
    }

    /**
     * Set <p>工具调用次数</p><p>单位：次数</p>
     * @param CallCount <p>工具调用次数</p><p>单位：次数</p>
     */
    public void setCallCount(Long CallCount) {
        this.CallCount = CallCount;
    }

    /**
     * Get <p>工具描述信息</p> 
     * @return Description <p>工具描述信息</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>工具描述信息</p>
     * @param Description <p>工具描述信息</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>工具名称</p> 
     * @return Name <p>工具名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>工具名称</p>
     * @param Name <p>工具名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>插件ID</p> 
     * @return PluginId <p>插件ID</p>
     */
    public String getPluginId() {
        return this.PluginId;
    }

    /**
     * Set <p>插件ID</p>
     * @param PluginId <p>插件ID</p>
     */
    public void setPluginId(String PluginId) {
        this.PluginId = PluginId;
    }

    /**
     * Get <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>TOOL_ACCESS_MODE_UNKNOWN</td><td>0</td><td>未指定</td></tr><tr><td>TOOL_ACCESS_MODE_READ_ONLY</td><td>1</td><td>只读</td></tr><tr><td>TOOL_ACCESS_MODE_WRITE_DELETE</td><td>2</td><td>写/删除</td></tr></tbody></table> 
     * @return ToolAccessMode <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>TOOL_ACCESS_MODE_UNKNOWN</td><td>0</td><td>未指定</td></tr><tr><td>TOOL_ACCESS_MODE_READ_ONLY</td><td>1</td><td>只读</td></tr><tr><td>TOOL_ACCESS_MODE_WRITE_DELETE</td><td>2</td><td>写/删除</td></tr></tbody></table>
     */
    public Long getToolAccessMode() {
        return this.ToolAccessMode;
    }

    /**
     * Set <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>TOOL_ACCESS_MODE_UNKNOWN</td><td>0</td><td>未指定</td></tr><tr><td>TOOL_ACCESS_MODE_READ_ONLY</td><td>1</td><td>只读</td></tr><tr><td>TOOL_ACCESS_MODE_WRITE_DELETE</td><td>2</td><td>写/删除</td></tr></tbody></table>
     * @param ToolAccessMode <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>TOOL_ACCESS_MODE_UNKNOWN</td><td>0</td><td>未指定</td></tr><tr><td>TOOL_ACCESS_MODE_READ_ONLY</td><td>1</td><td>只读</td></tr><tr><td>TOOL_ACCESS_MODE_WRITE_DELETE</td><td>2</td><td>写/删除</td></tr></tbody></table>
     */
    public void setToolAccessMode(Long ToolAccessMode) {
        this.ToolAccessMode = ToolAccessMode;
    }

    /**
     * Get <p>工具配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ToolConfig <p>工具配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ToolConfig getToolConfig() {
        return this.ToolConfig;
    }

    /**
     * Set <p>工具配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ToolConfig <p>工具配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setToolConfig(ToolConfig ToolConfig) {
        this.ToolConfig = ToolConfig;
    }

    /**
     * Get <p>工具ID</p> 
     * @return ToolId <p>工具ID</p>
     */
    public String getToolId() {
        return this.ToolId;
    }

    /**
     * Set <p>工具ID</p>
     * @param ToolId <p>工具ID</p>
     */
    public void setToolId(String ToolId) {
        this.ToolId = ToolId;
    }

    public Tool() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Tool(Tool source) {
        if (source.Billing != null) {
            this.Billing = new ToolBilling(source.Billing);
        }
        if (source.CallCount != null) {
            this.CallCount = new Long(source.CallCount);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.PluginId != null) {
            this.PluginId = new String(source.PluginId);
        }
        if (source.ToolAccessMode != null) {
            this.ToolAccessMode = new Long(source.ToolAccessMode);
        }
        if (source.ToolConfig != null) {
            this.ToolConfig = new ToolConfig(source.ToolConfig);
        }
        if (source.ToolId != null) {
            this.ToolId = new String(source.ToolId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Billing.", this.Billing);
        this.setParamSimple(map, prefix + "CallCount", this.CallCount);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "PluginId", this.PluginId);
        this.setParamSimple(map, prefix + "ToolAccessMode", this.ToolAccessMode);
        this.setParamObj(map, prefix + "ToolConfig.", this.ToolConfig);
        this.setParamSimple(map, prefix + "ToolId", this.ToolId);

    }
}

