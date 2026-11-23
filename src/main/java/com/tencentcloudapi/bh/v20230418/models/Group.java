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

public class Group extends AbstractModel {

    /**
    * <p>组ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>组名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>所属部门信息</p>
    */
    @SerializedName("Department")
    @Expose
    private Department Department;

    /**
    * <p>个数</p>
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get <p>组ID</p> 
     * @return Id <p>组ID</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>组ID</p>
     * @param Id <p>组ID</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>组名称</p> 
     * @return Name <p>组名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>组名称</p>
     * @param Name <p>组名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>所属部门信息</p> 
     * @return Department <p>所属部门信息</p>
     */
    public Department getDepartment() {
        return this.Department;
    }

    /**
     * Set <p>所属部门信息</p>
     * @param Department <p>所属部门信息</p>
     */
    public void setDepartment(Department Department) {
        this.Department = Department;
    }

    /**
     * Get <p>个数</p> 
     * @return Count <p>个数</p>
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set <p>个数</p>
     * @param Count <p>个数</p>
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

