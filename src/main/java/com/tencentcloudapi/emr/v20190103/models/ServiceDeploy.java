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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceDeploy extends AbstractModel {

    /**
    * <p>组件名称</p>
    */
    @SerializedName("SoftwareName")
    @Expose
    private String SoftwareName;

    /**
    * <p>组件下角色名称</p>
    */
    @SerializedName("Roles")
    @Expose
    private String [] Roles;

    /**
     * Get <p>组件名称</p> 
     * @return SoftwareName <p>组件名称</p>
     */
    public String getSoftwareName() {
        return this.SoftwareName;
    }

    /**
     * Set <p>组件名称</p>
     * @param SoftwareName <p>组件名称</p>
     */
    public void setSoftwareName(String SoftwareName) {
        this.SoftwareName = SoftwareName;
    }

    /**
     * Get <p>组件下角色名称</p> 
     * @return Roles <p>组件下角色名称</p>
     */
    public String [] getRoles() {
        return this.Roles;
    }

    /**
     * Set <p>组件下角色名称</p>
     * @param Roles <p>组件下角色名称</p>
     */
    public void setRoles(String [] Roles) {
        this.Roles = Roles;
    }

    public ServiceDeploy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceDeploy(ServiceDeploy source) {
        if (source.SoftwareName != null) {
            this.SoftwareName = new String(source.SoftwareName);
        }
        if (source.Roles != null) {
            this.Roles = new String[source.Roles.length];
            for (int i = 0; i < source.Roles.length; i++) {
                this.Roles[i] = new String(source.Roles[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SoftwareName", this.SoftwareName);
        this.setParamArraySimple(map, prefix + "Roles.", this.Roles);

    }
}

