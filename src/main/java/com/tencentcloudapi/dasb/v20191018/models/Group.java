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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Group extends AbstractModel {

    /**
    * 组ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 组名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 所属部门信息
    */
    @SerializedName("Department")
    @Expose
    private Department Department;

    /**
    * 个数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get 组ID 
     * @return Id 组ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 组ID
     * @param Id 组ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 组名称 
     * @return Name 组名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 组名称
     * @param Name 组名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 所属部门信息 
     * @return Department 所属部门信息
     */
    public Department getDepartment() {
        return this.Department;
    }

    /**
     * Set 所属部门信息
     * @param Department 所属部门信息
     */
    public void setDepartment(Department Department) {
        this.Department = Department;
    }

    /**
     * Get 个数 
     * @return Count 个数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 个数
     * @param Count 个数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public Group() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Group(Group source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Department != null) {
            this.Department = new Department(source.Department);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "Department.", this.Department);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

