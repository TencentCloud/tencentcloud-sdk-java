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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteEnvironmentRolesRequest extends AbstractModel{

    /**
    * 环境（命名空间）名称。
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * 角色名称数组。
    */
    @SerializedName("RoleNames")
    @Expose
    private String [] RoleNames;

    /**
    * 必填字段，集群的ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
     * Get 环境（命名空间）名称。 
     * @return EnvironmentId 环境（命名空间）名称。
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set 环境（命名空间）名称。
     * @param EnvironmentId 环境（命名空间）名称。
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get 角色名称数组。 
     * @return RoleNames 角色名称数组。
     */
    public String [] getRoleNames() {
        return this.RoleNames;
    }

    /**
     * Set 角色名称数组。
     * @param RoleNames 角色名称数组。
     */
    public void setRoleNames(String [] RoleNames) {
        this.RoleNames = RoleNames;
    }

    /**
     * Get 必填字段，集群的ID 
     * @return ClusterId 必填字段，集群的ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 必填字段，集群的ID
     * @param ClusterId 必填字段，集群的ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    public DeleteEnvironmentRolesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteEnvironmentRolesRequest(DeleteEnvironmentRolesRequest source) {
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.RoleNames != null) {
            this.RoleNames = new String[source.RoleNames.length];
            for (int i = 0; i < source.RoleNames.length; i++) {
                this.RoleNames[i] = new String(source.RoleNames[i]);
            }
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamArraySimple(map, prefix + "RoleNames.", this.RoleNames);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);

    }
}

