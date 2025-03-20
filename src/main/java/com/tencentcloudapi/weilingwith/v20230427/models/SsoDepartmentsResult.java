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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SsoDepartmentsResult extends AbstractModel {

    /**
    * 总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 部门列表
    */
    @SerializedName("Departments")
    @Expose
    private SsoDepartment [] Departments;

    /**
     * Get 总数 
     * @return Total 总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总数
     * @param Total 总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 部门列表 
     * @return Departments 部门列表
     */
    public SsoDepartment [] getDepartments() {
        return this.Departments;
    }

    /**
     * Set 部门列表
     * @param Departments 部门列表
     */
    public void setDepartments(SsoDepartment [] Departments) {
        this.Departments = Departments;
    }

    public SsoDepartmentsResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SsoDepartmentsResult(SsoDepartmentsResult source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Departments != null) {
            this.Departments = new SsoDepartment[source.Departments.length];
            for (int i = 0; i < source.Departments.length; i++) {
                this.Departments[i] = new SsoDepartment(source.Departments[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "Departments.", this.Departments);

    }
}

