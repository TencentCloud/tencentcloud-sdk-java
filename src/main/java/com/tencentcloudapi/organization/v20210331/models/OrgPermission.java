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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OrgPermission extends AbstractModel{

    /**
    * 权限Id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 权限名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 权限Id 
     * @return Id 权限Id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 权限Id
     * @param Id 权限Id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 权限名 
     * @return Name 权限名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 权限名
     * @param Name 权限名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public OrgPermission() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrgPermission(OrgPermission source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

