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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Departments extends AbstractModel {

    /**
    * 部门列表
    */
    @SerializedName("DepartmentSet")
    @Expose
    private Department [] DepartmentSet;

    /**
    * 是否开启了部门管理 true - 已开启, false - 未开启
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * 当前操作UIN是否是根部门管理员
    */
    @SerializedName("RootManager")
    @Expose
    private Boolean RootManager;

    /**
     * Get 部门列表 
     * @return DepartmentSet 部门列表
     */
    public Department [] getDepartmentSet() {
        return this.DepartmentSet;
    }

    /**
     * Set 部门列表
     * @param DepartmentSet 部门列表
     */
    public void setDepartmentSet(Department [] DepartmentSet) {
        this.DepartmentSet = DepartmentSet;
    }

    /**
     * Get 是否开启了部门管理 true - 已开启, false - 未开启 
     * @return Enabled 是否开启了部门管理 true - 已开启, false - 未开启
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 是否开启了部门管理 true - 已开启, false - 未开启
     * @param Enabled 是否开启了部门管理 true - 已开启, false - 未开启
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 当前操作UIN是否是根部门管理员 
     * @return RootManager 当前操作UIN是否是根部门管理员
     */
    public Boolean getRootManager() {
        return this.RootManager;
    }

    /**
     * Set 当前操作UIN是否是根部门管理员
     * @param RootManager 当前操作UIN是否是根部门管理员
     */
    public void setRootManager(Boolean RootManager) {
        this.RootManager = RootManager;
    }

    public Departments() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Departments(Departments source) {
        if (source.DepartmentSet != null) {
            this.DepartmentSet = new Department[source.DepartmentSet.length];
            for (int i = 0; i < source.DepartmentSet.length; i++) {
                this.DepartmentSet[i] = new Department(source.DepartmentSet[i]);
            }
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.RootManager != null) {
            this.RootManager = new Boolean(source.RootManager);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DepartmentSet.", this.DepartmentSet);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "RootManager", this.RootManager);

    }
}

