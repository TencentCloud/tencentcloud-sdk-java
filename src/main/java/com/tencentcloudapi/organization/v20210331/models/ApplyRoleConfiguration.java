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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplyRoleConfiguration extends AbstractModel {

    /**
    * <p>权限配置 ID</p>
    */
    @SerializedName("RoleConfigurationId")
    @Expose
    private String RoleConfigurationId;

    /**
    * <p>权限配置名称</p>
    */
    @SerializedName("RoleConfigurationName")
    @Expose
    private String RoleConfigurationName;

    /**
    * <p>说明</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get <p>权限配置 ID</p> 
     * @return RoleConfigurationId <p>权限配置 ID</p>
     */
    public String getRoleConfigurationId() {
        return this.RoleConfigurationId;
    }

    /**
     * Set <p>权限配置 ID</p>
     * @param RoleConfigurationId <p>权限配置 ID</p>
     */
    public void setRoleConfigurationId(String RoleConfigurationId) {
        this.RoleConfigurationId = RoleConfigurationId;
    }

    /**
     * Get <p>权限配置名称</p> 
     * @return RoleConfigurationName <p>权限配置名称</p>
     */
    public String getRoleConfigurationName() {
        return this.RoleConfigurationName;
    }

    /**
     * Set <p>权限配置名称</p>
     * @param RoleConfigurationName <p>权限配置名称</p>
     */
    public void setRoleConfigurationName(String RoleConfigurationName) {
        this.RoleConfigurationName = RoleConfigurationName;
    }

    /**
     * Get <p>说明</p> 
     * @return Description <p>说明</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>说明</p>
     * @param Description <p>说明</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ApplyRoleConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyRoleConfiguration(ApplyRoleConfiguration source) {
        if (source.RoleConfigurationId != null) {
            this.RoleConfigurationId = new String(source.RoleConfigurationId);
        }
        if (source.RoleConfigurationName != null) {
            this.RoleConfigurationName = new String(source.RoleConfigurationName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleConfigurationId", this.RoleConfigurationId);
        this.setParamSimple(map, prefix + "RoleConfigurationName", this.RoleConfigurationName);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

