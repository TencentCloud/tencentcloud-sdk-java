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

public class AgentPlugin extends AbstractModel {

    /**
    * 插件基本配置
    */
    @SerializedName("Config")
    @Expose
    private AgentPluginConfig Config;

    /**
    * 插件名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 插件图标url
    */
    @SerializedName("IconUrl")
    @Expose
    private String IconUrl;

    /**
    * 插件描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>插件产品分类</p><p>枚举值：</p><ul><li>0： 普通插件</li><li>1： 连接器类插件</li></ul>
    */
    @SerializedName("PluginClass")
    @Expose
    private Long PluginClass;

    /**
    * <p>插件状态</p><p>枚举值：</p><ul><li>0： 未知</li><li>1： 可用</li><li>2： 不可用</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>插件鉴权配置状态</p><p>枚举值：</p><ul><li>0： 不需要授权</li><li>1： 未配置</li><li>2： 已配置</li></ul>
    */
    @SerializedName("AuthConfigStatus")
    @Expose
    private Long AuthConfigStatus;

    /**
     * Get 插件基本配置 
     * @return Config 插件基本配置
     */
    public AgentPluginConfig getConfig() {
        return this.Config;
    }

    /**
     * Set 插件基本配置
     * @param Config 插件基本配置
     */
    public void setConfig(AgentPluginConfig Config) {
        this.Config = Config;
    }

    /**
     * Get 插件名称 
     * @return Name 插件名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 插件名称
     * @param Name 插件名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 插件图标url 
     * @return IconUrl 插件图标url
     */
    public String getIconUrl() {
        return this.IconUrl;
    }

    /**
     * Set 插件图标url
     * @param IconUrl 插件图标url
     */
    public void setIconUrl(String IconUrl) {
        this.IconUrl = IconUrl;
    }

    /**
     * Get 插件描述 
     * @return Description 插件描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 插件描述
     * @param Description 插件描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>插件产品分类</p><p>枚举值：</p><ul><li>0： 普通插件</li><li>1： 连接器类插件</li></ul> 
     * @return PluginClass <p>插件产品分类</p><p>枚举值：</p><ul><li>0： 普通插件</li><li>1： 连接器类插件</li></ul>
     */
    public Long getPluginClass() {
        return this.PluginClass;
    }

    /**
     * Set <p>插件产品分类</p><p>枚举值：</p><ul><li>0： 普通插件</li><li>1： 连接器类插件</li></ul>
     * @param PluginClass <p>插件产品分类</p><p>枚举值：</p><ul><li>0： 普通插件</li><li>1： 连接器类插件</li></ul>
     */
    public void setPluginClass(Long PluginClass) {
        this.PluginClass = PluginClass;
    }

    /**
     * Get <p>插件状态</p><p>枚举值：</p><ul><li>0： 未知</li><li>1： 可用</li><li>2： 不可用</li></ul> 
     * @return Status <p>插件状态</p><p>枚举值：</p><ul><li>0： 未知</li><li>1： 可用</li><li>2： 不可用</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>插件状态</p><p>枚举值：</p><ul><li>0： 未知</li><li>1： 可用</li><li>2： 不可用</li></ul>
     * @param Status <p>插件状态</p><p>枚举值：</p><ul><li>0： 未知</li><li>1： 可用</li><li>2： 不可用</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>插件鉴权配置状态</p><p>枚举值：</p><ul><li>0： 不需要授权</li><li>1： 未配置</li><li>2： 已配置</li></ul> 
     * @return AuthConfigStatus <p>插件鉴权配置状态</p><p>枚举值：</p><ul><li>0： 不需要授权</li><li>1： 未配置</li><li>2： 已配置</li></ul>
     */
    public Long getAuthConfigStatus() {
        return this.AuthConfigStatus;
    }

    /**
     * Set <p>插件鉴权配置状态</p><p>枚举值：</p><ul><li>0： 不需要授权</li><li>1： 未配置</li><li>2： 已配置</li></ul>
     * @param AuthConfigStatus <p>插件鉴权配置状态</p><p>枚举值：</p><ul><li>0： 不需要授权</li><li>1： 未配置</li><li>2： 已配置</li></ul>
     */
    public void setAuthConfigStatus(Long AuthConfigStatus) {
        this.AuthConfigStatus = AuthConfigStatus;
    }

    public AgentPlugin() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentPlugin(AgentPlugin source) {
        if (source.Config != null) {
            this.Config = new AgentPluginConfig(source.Config);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IconUrl != null) {
            this.IconUrl = new String(source.IconUrl);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.PluginClass != null) {
            this.PluginClass = new Long(source.PluginClass);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.AuthConfigStatus != null) {
            this.AuthConfigStatus = new Long(source.AuthConfigStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Config.", this.Config);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IconUrl", this.IconUrl);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "PluginClass", this.PluginClass);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AuthConfigStatus", this.AuthConfigStatus);

    }
}

