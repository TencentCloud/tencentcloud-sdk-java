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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GrafanaAccountRole extends AbstractModel {

    /**
    * 组织
    */
    @SerializedName("Organization")
    @Expose
    private String Organization;

    /**
    * 权限(Admin、Editor、Viewer)
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
     * Get 组织 
     * @return Organization 组织
     */
    public String getOrganization() {
        return this.Organization;
    }

    /**
     * Set 组织
     * @param Organization 组织
     */
    public void setOrganization(String Organization) {
        this.Organization = Organization;
    }

    /**
     * Get 权限(Admin、Editor、Viewer) 
     * @return Role 权限(Admin、Editor、Viewer)
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set 权限(Admin、Editor、Viewer)
     * @param Role 权限(Admin、Editor、Viewer)
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    public GrafanaAccountRole() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GrafanaAccountRole(GrafanaAccountRole source) {
        if (source.Organization != null) {
            this.Organization = new String(source.Organization);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Organization", this.Organization);
        this.setParamSimple(map, prefix + "Role", this.Role);

    }
}

