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

public class DescribeChangePwdTaskRequest extends AbstractModel {

    /**
    * 过滤数组。过滤数组。Name支持以下值: OperationId 任务ID TaskName 任务名
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 所属部门ID
    */
    @SerializedName("DepartmentId")
    @Expose
    private String DepartmentId;

    /**
    * 分页偏移量，默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页条目数量，默认20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 过滤数组。过滤数组。Name支持以下值: OperationId 任务ID TaskName 任务名 
     * @return Filters 过滤数组。过滤数组。Name支持以下值: OperationId 任务ID TaskName 任务名
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤数组。过滤数组。Name支持以下值: OperationId 任务ID TaskName 任务名
     * @param Filters 过滤数组。过滤数组。Name支持以下值: OperationId 任务ID TaskName 任务名
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 所属部门ID 
     * @return DepartmentId 所属部门ID
     */
    public String getDepartmentId() {
        return this.DepartmentId;
    }

    /**
     * Set 所属部门ID
     * @param DepartmentId 所属部门ID
     */
    public void setDepartmentId(String DepartmentId) {
        this.DepartmentId = DepartmentId;
    }

    /**
     * Get 分页偏移量，默认0 
     * @return Offset 分页偏移量，默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量，默认0
     * @param Offset 分页偏移量，默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页条目数量，默认20 
     * @return Limit 每页条目数量，默认20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页条目数量，默认20
     * @param Limit 每页条目数量，默认20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeChangePwdTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeChangePwdTaskRequest(DescribeChangePwdTaskRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.DepartmentId != null) {
            this.DepartmentId = new String(source.DepartmentId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "DepartmentId", this.DepartmentId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

