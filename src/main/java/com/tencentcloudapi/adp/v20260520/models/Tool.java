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
    * 工具描述信息
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 工具名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 插件id
    */
    @SerializedName("PluginId")
    @Expose
    private String PluginId;

    /**
    * 工具id
    */
    @SerializedName("ToolId")
    @Expose
    private String ToolId;

    /**
    * 工具计费信息
    */
    @SerializedName("Billing")
    @Expose
    private ToolBilling Billing;

    /**
    * 工具调用次数
    */
    @SerializedName("CallCount")
    @Expose
    private Long CallCount;

    /**
    * <p>工具访问模式</p><p>枚举值：</p><ul><li>0： 未指定</li><li>1： READ_ONLY</li><li>2： WRITE_DELETE</li></ul>
    */
    @SerializedName("ToolAccessMode")
    @Expose
    private Long ToolAccessMode;

    /**
    * 工具配置
    */
    @SerializedName("ToolConfig")
    @Expose
    private ToolConfig ToolConfig;

    /**
     * Get 工具描述信息 
     * @return Description 工具描述信息
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 工具描述信息
     * @param Description 工具描述信息
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 工具名称 
     * @return Name 工具名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 工具名称
     * @param Name 工具名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 插件id 
     * @return PluginId 插件id
     */
    public String getPluginId() {
        return this.PluginId;
    }

    /**
     * Set 插件id
     * @param PluginId 插件id
     */
    public void setPluginId(String PluginId) {
        this.PluginId = PluginId;
    }

    /**
     * Get 工具id 
     * @return ToolId 工具id
     */
    public String getToolId() {
        return this.ToolId;
    }

    /**
     * Set 工具id
     * @param ToolId 工具id
     */
    public void setToolId(String ToolId) {
        this.ToolId = ToolId;
    }

    /**
     * Get 工具计费信息 
     * @return Billing 工具计费信息
     */
    public ToolBilling getBilling() {
        return this.Billing;
    }

    /**
     * Set 工具计费信息
     * @param Billing 工具计费信息
     */
    public void setBilling(ToolBilling Billing) {
        this.Billing = Billing;
    }

    /**
     * Get 工具调用次数 
     * @return CallCount 工具调用次数
     */
    public Long getCallCount() {
        return this.CallCount;
    }

    /**
     * Set 工具调用次数
     * @param CallCount 工具调用次数
     */
    public void setCallCount(Long CallCount) {
        this.CallCount = CallCount;
    }

    /**
     * Get <p>工具访问模式</p><p>枚举值：</p><ul><li>0： 未指定</li><li>1： READ_ONLY</li><li>2： WRITE_DELETE</li></ul> 
     * @return ToolAccessMode <p>工具访问模式</p><p>枚举值：</p><ul><li>0： 未指定</li><li>1： READ_ONLY</li><li>2： WRITE_DELETE</li></ul>
     */
    public Long getToolAccessMode() {
        return this.ToolAccessMode;
    }

    /**
     * Set <p>工具访问模式</p><p>枚举值：</p><ul><li>0： 未指定</li><li>1： READ_ONLY</li><li>2： WRITE_DELETE</li></ul>
     * @param ToolAccessMode <p>工具访问模式</p><p>枚举值：</p><ul><li>0： 未指定</li><li>1： READ_ONLY</li><li>2： WRITE_DELETE</li></ul>
     */
    public void setToolAccessMode(Long ToolAccessMode) {
        this.ToolAccessMode = ToolAccessMode;
    }

    /**
     * Get 工具配置 
     * @return ToolConfig 工具配置
     */
    public ToolConfig getToolConfig() {
        return this.ToolConfig;
    }

    /**
     * Set 工具配置
     * @param ToolConfig 工具配置
     */
    public void setToolConfig(ToolConfig ToolConfig) {
        this.ToolConfig = ToolConfig;
    }

    public Tool() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Tool(Tool source) {
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.PluginId != null) {
            this.PluginId = new String(source.PluginId);
        }
        if (source.ToolId != null) {
            this.ToolId = new String(source.ToolId);
        }
        if (source.Billing != null) {
            this.Billing = new ToolBilling(source.Billing);
        }
        if (source.CallCount != null) {
            this.CallCount = new Long(source.CallCount);
        }
        if (source.ToolAccessMode != null) {
            this.ToolAccessMode = new Long(source.ToolAccessMode);
        }
        if (source.ToolConfig != null) {
            this.ToolConfig = new ToolConfig(source.ToolConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "PluginId", this.PluginId);
        this.setParamSimple(map, prefix + "ToolId", this.ToolId);
        this.setParamObj(map, prefix + "Billing.", this.Billing);
        this.setParamSimple(map, prefix + "CallCount", this.CallCount);
        this.setParamSimple(map, prefix + "ToolAccessMode", this.ToolAccessMode);
        this.setParamObj(map, prefix + "ToolConfig.", this.ToolConfig);

    }
}

