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
package com.tencentcloudapi.dasb.v20191018.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDeviceGroupRequest extends AbstractModel {

    /**
    * 资产组名，最大长度32字符，不能为空
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 资产组ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 资产组所属部门ID，如：1.2.3
    */
    @SerializedName("DepartmentId")
    @Expose
    private String DepartmentId;

    /**
     * Get 资产组名，最大长度32字符，不能为空 
     * @return Name 资产组名，最大长度32字符，不能为空
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 资产组名，最大长度32字符，不能为空
     * @param Name 资产组名，最大长度32字符，不能为空
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 资产组ID 
     * @return Id 资产组ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 资产组ID
     * @param Id 资产组ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 资产组所属部门ID，如：1.2.3 
     * @return DepartmentId 资产组所属部门ID，如：1.2.3
     */
    public String getDepartmentId() {
        return this.DepartmentId;
    }

    /**
     * Set 资产组所属部门ID，如：1.2.3
     * @param DepartmentId 资产组所属部门ID，如：1.2.3
     */
    public void setDepartmentId(String DepartmentId) {
        this.DepartmentId = DepartmentId;
    }

    public ModifyDeviceGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDeviceGroupRequest(ModifyDeviceGroupRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.DepartmentId != null) {
            this.DepartmentId = new String(source.DepartmentId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "DepartmentId", this.DepartmentId);

    }
}

