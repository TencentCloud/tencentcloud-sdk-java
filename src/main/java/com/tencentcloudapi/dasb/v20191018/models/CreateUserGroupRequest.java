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
package com.tencentcloudapi.dasb.v20191018.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateUserGroupRequest extends AbstractModel{

    /**
    * 用户组名，最大长度32字符
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 用户组所属部门的ID，如：1.2.3
    */
    @SerializedName("DepartmentId")
    @Expose
    private String DepartmentId;

    /**
     * Get 用户组名，最大长度32字符 
     * @return Name 用户组名，最大长度32字符
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 用户组名，最大长度32字符
     * @param Name 用户组名，最大长度32字符
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 用户组所属部门的ID，如：1.2.3 
     * @return DepartmentId 用户组所属部门的ID，如：1.2.3
     */
    public String getDepartmentId() {
        return this.DepartmentId;
    }

    /**
     * Set 用户组所属部门的ID，如：1.2.3
     * @param DepartmentId 用户组所属部门的ID，如：1.2.3
     */
    public void setDepartmentId(String DepartmentId) {
        this.DepartmentId = DepartmentId;
    }

    public CreateUserGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUserGroupRequest(CreateUserGroupRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        this.setParamSimple(map, prefix + "DepartmentId", this.DepartmentId);

    }
}

