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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBaselineMainTaskListRequest extends AbstractModel {

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>通用过滤条件。支持的 Name：JobID（任务ID精确搜索）、TaskStatus（任务状态 INIT/SCANNING/SUCCESS/FAILED）、TaskType（任务类型 PERIODIC/MANUAL）。</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * <p>分页查询每页数量，最大值 100；超过时服务端将自动回退为默认值 10。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>分页查询起始偏移量，从 0 开始。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>排序方向，取值 asc（升序）或 desc（降序），默认 desc。</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>排序字段名，由具体接口定义可选字段。</p>
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>通用过滤条件。支持的 Name：JobID（任务ID精确搜索）、TaskStatus（任务状态 INIT/SCANNING/SUCCESS/FAILED）、TaskType（任务类型 PERIODIC/MANUAL）。</p> 
     * @return Filters <p>通用过滤条件。支持的 Name：JobID（任务ID精确搜索）、TaskStatus（任务状态 INIT/SCANNING/SUCCESS/FAILED）、TaskType（任务类型 PERIODIC/MANUAL）。</p>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>通用过滤条件。支持的 Name：JobID（任务ID精确搜索）、TaskStatus（任务状态 INIT/SCANNING/SUCCESS/FAILED）、TaskType（任务类型 PERIODIC/MANUAL）。</p>
     * @param Filters <p>通用过滤条件。支持的 Name：JobID（任务ID精确搜索）、TaskStatus（任务状态 INIT/SCANNING/SUCCESS/FAILED）、TaskType（任务类型 PERIODIC/MANUAL）。</p>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>分页查询每页数量，最大值 100；超过时服务端将自动回退为默认值 10。</p> 
     * @return Limit <p>分页查询每页数量，最大值 100；超过时服务端将自动回退为默认值 10。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页查询每页数量，最大值 100；超过时服务端将自动回退为默认值 10。</p>
     * @param Limit <p>分页查询每页数量，最大值 100；超过时服务端将自动回退为默认值 10。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>分页查询起始偏移量，从 0 开始。</p> 
     * @return Offset <p>分页查询起始偏移量，从 0 开始。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页查询起始偏移量，从 0 开始。</p>
     * @param Offset <p>分页查询起始偏移量，从 0 开始。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>排序方向，取值 asc（升序）或 desc（降序），默认 desc。</p> 
     * @return Order <p>排序方向，取值 asc（升序）或 desc（降序），默认 desc。</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>排序方向，取值 asc（升序）或 desc（降序），默认 desc。</p>
     * @param Order <p>排序方向，取值 asc（升序）或 desc（降序），默认 desc。</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>排序字段名，由具体接口定义可选字段。</p> 
     * @return By <p>排序字段名，由具体接口定义可选字段。</p>
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set <p>排序字段名，由具体接口定义可选字段。</p>
     * @param By <p>排序字段名，由具体接口定义可选字段。</p>
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeBaselineMainTaskListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBaselineMainTaskListRequest(DescribeBaselineMainTaskListRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

