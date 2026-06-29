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

public class AgentProfile extends AbstractModel {

    /**
    * <p>Agent名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>图标URL</p>
    */
    @SerializedName("IconUrl")
    @Expose
    private String IconUrl;

    /**
    * <p>Agent 角色：0=主 / 1=子</p>
    */
    @SerializedName("Role")
    @Expose
    private Long Role;

    /**
    * <p>Agent 描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>应用名称</p>
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * <p>开发者</p>
    */
    @SerializedName("Developer")
    @Expose
    private String Developer;

    /**
    * <p>主AgentId，只读，不可通过修改接口进行变更</p>
    */
    @SerializedName("ParentAgentId")
    @Expose
    private String ParentAgentId;

    /**
     * Get <p>Agent名称</p> 
     * @return Name <p>Agent名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Agent名称</p>
     * @param Name <p>Agent名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>图标URL</p> 
     * @return IconUrl <p>图标URL</p>
     */
    public String getIconUrl() {
        return this.IconUrl;
    }

    /**
     * Set <p>图标URL</p>
     * @param IconUrl <p>图标URL</p>
     */
    public void setIconUrl(String IconUrl) {
        this.IconUrl = IconUrl;
    }

    /**
     * Get <p>Agent 角色：0=主 / 1=子</p> 
     * @return Role <p>Agent 角色：0=主 / 1=子</p>
     */
    public Long getRole() {
        return this.Role;
    }

    /**
     * Set <p>Agent 角色：0=主 / 1=子</p>
     * @param Role <p>Agent 角色：0=主 / 1=子</p>
     */
    public void setRole(Long Role) {
        this.Role = Role;
    }

    /**
     * Get <p>Agent 描述</p> 
     * @return Description <p>Agent 描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Agent 描述</p>
     * @param Description <p>Agent 描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>应用名称</p> 
     * @return AppName <p>应用名称</p>
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set <p>应用名称</p>
     * @param AppName <p>应用名称</p>
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get <p>开发者</p> 
     * @return Developer <p>开发者</p>
     */
    public String getDeveloper() {
        return this.Developer;
    }

    /**
     * Set <p>开发者</p>
     * @param Developer <p>开发者</p>
     */
    public void setDeveloper(String Developer) {
        this.Developer = Developer;
    }

    /**
     * Get <p>主AgentId，只读，不可通过修改接口进行变更</p> 
     * @return ParentAgentId <p>主AgentId，只读，不可通过修改接口进行变更</p>
     */
    public String getParentAgentId() {
        return this.ParentAgentId;
    }

    /**
     * Set <p>主AgentId，只读，不可通过修改接口进行变更</p>
     * @param ParentAgentId <p>主AgentId，只读，不可通过修改接口进行变更</p>
     */
    public void setParentAgentId(String ParentAgentId) {
        this.ParentAgentId = ParentAgentId;
    }

    public AgentProfile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentProfile(AgentProfile source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IconUrl != null) {
            this.IconUrl = new String(source.IconUrl);
        }
        if (source.Role != null) {
            this.Role = new Long(source.Role);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.Developer != null) {
            this.Developer = new String(source.Developer);
        }
        if (source.ParentAgentId != null) {
            this.ParentAgentId = new String(source.ParentAgentId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IconUrl", this.IconUrl);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "Developer", this.Developer);
        this.setParamSimple(map, prefix + "ParentAgentId", this.ParentAgentId);

    }
}

