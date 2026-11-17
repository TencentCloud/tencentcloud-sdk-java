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

public class AgentBuiltinTool extends AbstractModel {

    /**
    * <p>内置工具基础配置</p>
    */
    @SerializedName("Config")
    @Expose
    private AgentBuiltinToolConfig Config;

    /**
    * <p>工具展示名称</p>
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * <p>工具描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>计费标识</p><p>枚举值：</p><ul><li>0： 免费</li><li>1： 限时免费</li><li>2： 官方收费</li></ul>
    */
    @SerializedName("BillingType")
    @Expose
    private Long BillingType;

    /**
     * Get <p>内置工具基础配置</p> 
     * @return Config <p>内置工具基础配置</p>
     */
    public AgentBuiltinToolConfig getConfig() {
        return this.Config;
    }

    /**
     * Set <p>内置工具基础配置</p>
     * @param Config <p>内置工具基础配置</p>
     */
    public void setConfig(AgentBuiltinToolConfig Config) {
        this.Config = Config;
    }

    /**
     * Get <p>工具展示名称</p> 
     * @return DisplayName <p>工具展示名称</p>
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set <p>工具展示名称</p>
     * @param DisplayName <p>工具展示名称</p>
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get <p>工具描述</p> 
     * @return Description <p>工具描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>工具描述</p>
     * @param Description <p>工具描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>计费标识</p><p>枚举值：</p><ul><li>0： 免费</li><li>1： 限时免费</li><li>2： 官方收费</li></ul> 
     * @return BillingType <p>计费标识</p><p>枚举值：</p><ul><li>0： 免费</li><li>1： 限时免费</li><li>2： 官方收费</li></ul>
     */
    public Long getBillingType() {
        return this.BillingType;
    }

    /**
     * Set <p>计费标识</p><p>枚举值：</p><ul><li>0： 免费</li><li>1： 限时免费</li><li>2： 官方收费</li></ul>
     * @param BillingType <p>计费标识</p><p>枚举值：</p><ul><li>0： 免费</li><li>1： 限时免费</li><li>2： 官方收费</li></ul>
     */
    public void setBillingType(Long BillingType) {
        this.BillingType = BillingType;
    }

    public AgentBuiltinTool() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentBuiltinTool(AgentBuiltinTool source) {
        if (source.Config != null) {
            this.Config = new AgentBuiltinToolConfig(source.Config);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.BillingType != null) {
            this.BillingType = new Long(source.BillingType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Config.", this.Config);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "BillingType", this.BillingType);

    }
}

