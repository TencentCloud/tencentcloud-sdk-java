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

public class ModifyPluginRequest extends AbstractModel {

    /**
    * <p>插件id</p>
    */
    @SerializedName("PluginId")
    @Expose
    private String PluginId;

    /**
    * <p>插件版本号</p>
    */
    @SerializedName("PluginVersion")
    @Expose
    private Long PluginVersion;

    /**
    * <p>插件基础资料</p>
    */
    @SerializedName("Profile")
    @Expose
    private PluginProfile Profile;

    /**
    * <p>插件类型配置</p>
    */
    @SerializedName("Config")
    @Expose
    private PluginConfig Config;

    /**
    * <p>指定需要更新的字段，避免全量覆盖</p>
    */
    @SerializedName("UpdateMask")
    @Expose
    private FieldMask UpdateMask;

    /**
    * <p>插件的工具列表，mcp插件不传</p>
    */
    @SerializedName("ToolList")
    @Expose
    private Tool [] ToolList;

    /**
     * Get <p>插件id</p> 
     * @return PluginId <p>插件id</p>
     */
    public String getPluginId() {
        return this.PluginId;
    }

    /**
     * Set <p>插件id</p>
     * @param PluginId <p>插件id</p>
     */
    public void setPluginId(String PluginId) {
        this.PluginId = PluginId;
    }

    /**
     * Get <p>插件版本号</p> 
     * @return PluginVersion <p>插件版本号</p>
     */
    public Long getPluginVersion() {
        return this.PluginVersion;
    }

    /**
     * Set <p>插件版本号</p>
     * @param PluginVersion <p>插件版本号</p>
     */
    public void setPluginVersion(Long PluginVersion) {
        this.PluginVersion = PluginVersion;
    }

    /**
     * Get <p>插件基础资料</p> 
     * @return Profile <p>插件基础资料</p>
     */
    public PluginProfile getProfile() {
        return this.Profile;
    }

    /**
     * Set <p>插件基础资料</p>
     * @param Profile <p>插件基础资料</p>
     */
    public void setProfile(PluginProfile Profile) {
        this.Profile = Profile;
    }

    /**
     * Get <p>插件类型配置</p> 
     * @return Config <p>插件类型配置</p>
     */
    public PluginConfig getConfig() {
        return this.Config;
    }

    /**
     * Set <p>插件类型配置</p>
     * @param Config <p>插件类型配置</p>
     */
    public void setConfig(PluginConfig Config) {
        this.Config = Config;
    }

    /**
     * Get <p>指定需要更新的字段，避免全量覆盖</p> 
     * @return UpdateMask <p>指定需要更新的字段，避免全量覆盖</p>
     */
    public FieldMask getUpdateMask() {
        return this.UpdateMask;
    }

    /**
     * Set <p>指定需要更新的字段，避免全量覆盖</p>
     * @param UpdateMask <p>指定需要更新的字段，避免全量覆盖</p>
     */
    public void setUpdateMask(FieldMask UpdateMask) {
        this.UpdateMask = UpdateMask;
    }

    /**
     * Get <p>插件的工具列表，mcp插件不传</p> 
     * @return ToolList <p>插件的工具列表，mcp插件不传</p>
     */
    public Tool [] getToolList() {
        return this.ToolList;
    }

    /**
     * Set <p>插件的工具列表，mcp插件不传</p>
     * @param ToolList <p>插件的工具列表，mcp插件不传</p>
     */
    public void setToolList(Tool [] ToolList) {
        this.ToolList = ToolList;
    }

    public ModifyPluginRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPluginRequest(ModifyPluginRequest source) {
        if (source.PluginId != null) {
            this.PluginId = new String(source.PluginId);
        }
        if (source.PluginVersion != null) {
            this.PluginVersion = new Long(source.PluginVersion);
        }
        if (source.Profile != null) {
            this.Profile = new PluginProfile(source.Profile);
        }
        if (source.Config != null) {
            this.Config = new PluginConfig(source.Config);
        }
        if (source.UpdateMask != null) {
            this.UpdateMask = new FieldMask(source.UpdateMask);
        }
        if (source.ToolList != null) {
            this.ToolList = new Tool[source.ToolList.length];
            for (int i = 0; i < source.ToolList.length; i++) {
                this.ToolList[i] = new Tool(source.ToolList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PluginId", this.PluginId);
        this.setParamSimple(map, prefix + "PluginVersion", this.PluginVersion);
        this.setParamObj(map, prefix + "Profile.", this.Profile);
        this.setParamObj(map, prefix + "Config.", this.Config);
        this.setParamObj(map, prefix + "UpdateMask.", this.UpdateMask);
        this.setParamArrayObj(map, prefix + "ToolList.", this.ToolList);

    }
}

