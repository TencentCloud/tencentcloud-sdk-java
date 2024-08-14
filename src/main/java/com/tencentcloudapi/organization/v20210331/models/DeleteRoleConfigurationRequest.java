/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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

public class DeleteRoleConfigurationRequest extends AbstractModel {

    /**
    * 空间 ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 权限配置 ID
    */
    @SerializedName("RoleConfigurationId")
    @Expose
    private String RoleConfigurationId;

    /**
     * Get 空间 ID 
     * @return ZoneId 空间 ID
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 空间 ID
     * @param ZoneId 空间 ID
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 权限配置 ID 
     * @return RoleConfigurationId 权限配置 ID
     */
    public String getRoleConfigurationId() {
        return this.RoleConfigurationId;
    }

    /**
     * Set 权限配置 ID
     * @param RoleConfigurationId 权限配置 ID
     */
    public void setRoleConfigurationId(String RoleConfigurationId) {
        this.RoleConfigurationId = RoleConfigurationId;
    }

    public DeleteRoleConfigurationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteRoleConfigurationRequest(DeleteRoleConfigurationRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.RoleConfigurationId != null) {
            this.RoleConfigurationId = new String(source.RoleConfigurationId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "RoleConfigurationId", this.RoleConfigurationId);

    }
}

