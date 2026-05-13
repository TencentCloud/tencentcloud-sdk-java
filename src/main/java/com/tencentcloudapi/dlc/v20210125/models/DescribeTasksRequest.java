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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTasksRequest extends AbstractModel {

    /**
    * <p>返回数量，默认为10，最大值为100。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>偏移量，默认为0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>过滤条件，如下支持的过滤类型，传参Name应为以下其中一个,其中task-id支持最大50个过滤个数，其他过滤参数支持的总数不超过5个。<br>task-id - String - （任务ID准确过滤）task-id取值形如：e386471f-139a-4e59-877f-50ece8135b99。<br>task-state - String - （任务状态过滤）取值范围 0(初始化)， 1(运行中)， 2(成功)， -1(失败)。<br>task-sql-keyword - String - （SQL语句关键字模糊过滤）取值形如：DROP TABLE。<br>task-operator- string （子uin过滤）<br>task-kind - string （任务类型过滤）</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>排序字段，支持如下字段类型，create-time（创建时间，默认）、update-time（更新时间）</p>
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * <p>排序方式，desc表示正序，asc表示反序， 默认为asc。</p>
    */
    @SerializedName("Sorting")
    @Expose
    private String Sorting;

    /**
    * <p>起始时间点，格式为yyyy-mm-dd HH:MM:SS。默认为45天前的当前时刻</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>结束时间点，格式为yyyy-mm-dd HH:MM:SS时间跨度在(0,30天]，支持最近45天数据查询。默认为当前时刻</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>数据引擎名称，用于筛选</p>
    */
    @SerializedName("DataEngineName")
    @Expose
    private String DataEngineName;

    /**
    * <p>spark引擎资源组名称</p>
    */
    @SerializedName("ResourceGroupName")
    @Expose
    private String ResourceGroupName;

    /**
     * Get <p>返回数量，默认为10，最大值为100。</p> 
     * @return Limit <p>返回数量，默认为10，最大值为100。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回数量，默认为10，最大值为100。</p>
     * @param Limit <p>返回数量，默认为10，最大值为100。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>偏移量，默认为0。</p> 
     * @return Offset <p>偏移量，默认为0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，默认为0。</p>
     * @param Offset <p>偏移量，默认为0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>过滤条件，如下支持的过滤类型，传参Name应为以下其中一个,其中task-id支持最大50个过滤个数，其他过滤参数支持的总数不超过5个。<br>task-id - String - （任务ID准确过滤）task-id取值形如：e386471f-139a-4e59-877f-50ece8135b99。<br>task-state - String - （任务状态过滤）取值范围 0(初始化)， 1(运行中)， 2(成功)， -1(失败)。<br>task-sql-keyword - String - （SQL语句关键字模糊过滤）取值形如：DROP TABLE。<br>task-operator- string （子uin过滤）<br>task-kind - string （任务类型过滤）</p> 
     * @return Filters <p>过滤条件，如下支持的过滤类型，传参Name应为以下其中一个,其中task-id支持最大50个过滤个数，其他过滤参数支持的总数不超过5个。<br>task-id - String - （任务ID准确过滤）task-id取值形如：e386471f-139a-4e59-877f-50ece8135b99。<br>task-state - String - （任务状态过滤）取值范围 0(初始化)， 1(运行中)， 2(成功)， -1(失败)。<br>task-sql-keyword - String - （SQL语句关键字模糊过滤）取值形如：DROP TABLE。<br>task-operator- string （子uin过滤）<br>task-kind - string （任务类型过滤）</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件，如下支持的过滤类型，传参Name应为以下其中一个,其中task-id支持最大50个过滤个数，其他过滤参数支持的总数不超过5个。<br>task-id - String - （任务ID准确过滤）task-id取值形如：e386471f-139a-4e59-877f-50ece8135b99。<br>task-state - String - （任务状态过滤）取值范围 0(初始化)， 1(运行中)， 2(成功)， -1(失败)。<br>task-sql-keyword - String - （SQL语句关键字模糊过滤）取值形如：DROP TABLE。<br>task-operator- string （子uin过滤）<br>task-kind - string （任务类型过滤）</p>
     * @param Filters <p>过滤条件，如下支持的过滤类型，传参Name应为以下其中一个,其中task-id支持最大50个过滤个数，其他过滤参数支持的总数不超过5个。<br>task-id - String - （任务ID准确过滤）task-id取值形如：e386471f-139a-4e59-877f-50ece8135b99。<br>task-state - String - （任务状态过滤）取值范围 0(初始化)， 1(运行中)， 2(成功)， -1(失败)。<br>task-sql-keyword - String - （SQL语句关键字模糊过滤）取值形如：DROP TABLE。<br>task-operator- string （子uin过滤）<br>task-kind - string （任务类型过滤）</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>排序字段，支持如下字段类型，create-time（创建时间，默认）、update-time（更新时间）</p> 
     * @return SortBy <p>排序字段，支持如下字段类型，create-time（创建时间，默认）、update-time（更新时间）</p>
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set <p>排序字段，支持如下字段类型，create-time（创建时间，默认）、update-time（更新时间）</p>
     * @param SortBy <p>排序字段，支持如下字段类型，create-time（创建时间，默认）、update-time（更新时间）</p>
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get <p>排序方式，desc表示正序，asc表示反序， 默认为asc。</p> 
     * @return Sorting <p>排序方式，desc表示正序，asc表示反序， 默认为asc。</p>
     */
    public String getSorting() {
        return this.Sorting;
    }

    /**
     * Set <p>排序方式，desc表示正序，asc表示反序， 默认为asc。</p>
     * @param Sorting <p>排序方式，desc表示正序，asc表示反序， 默认为asc。</p>
     */
    public void setSorting(String Sorting) {
        this.Sorting = Sorting;
    }

    /**
     * Get <p>起始时间点，格式为yyyy-mm-dd HH:MM:SS。默认为45天前的当前时刻</p> 
     * @return StartTime <p>起始时间点，格式为yyyy-mm-dd HH:MM:SS。默认为45天前的当前时刻</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>起始时间点，格式为yyyy-mm-dd HH:MM:SS。默认为45天前的当前时刻</p>
     * @param StartTime <p>起始时间点，格式为yyyy-mm-dd HH:MM:SS。默认为45天前的当前时刻</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间点，格式为yyyy-mm-dd HH:MM:SS时间跨度在(0,30天]，支持最近45天数据查询。默认为当前时刻</p> 
     * @return EndTime <p>结束时间点，格式为yyyy-mm-dd HH:MM:SS时间跨度在(0,30天]，支持最近45天数据查询。默认为当前时刻</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间点，格式为yyyy-mm-dd HH:MM:SS时间跨度在(0,30天]，支持最近45天数据查询。默认为当前时刻</p>
     * @param EndTime <p>结束时间点，格式为yyyy-mm-dd HH:MM:SS时间跨度在(0,30天]，支持最近45天数据查询。默认为当前时刻</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>数据引擎名称，用于筛选</p> 
     * @return DataEngineName <p>数据引擎名称，用于筛选</p>
     */
    public String getDataEngineName() {
        return this.DataEngineName;
    }

    /**
     * Set <p>数据引擎名称，用于筛选</p>
     * @param DataEngineName <p>数据引擎名称，用于筛选</p>
     */
    public void setDataEngineName(String DataEngineName) {
        this.DataEngineName = DataEngineName;
    }

    /**
     * Get <p>spark引擎资源组名称</p> 
     * @return ResourceGroupName <p>spark引擎资源组名称</p>
     */
    public String getResourceGroupName() {
        return this.ResourceGroupName;
    }

    /**
     * Set <p>spark引擎资源组名称</p>
     * @param ResourceGroupName <p>spark引擎资源组名称</p>
     */
    public void setResourceGroupName(String ResourceGroupName) {
        this.ResourceGroupName = ResourceGroupName;
    }

    public DescribeTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTasksRequest(DescribeTasksRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.SortBy != null) {
            this.SortBy = new String(source.SortBy);
        }
        if (source.Sorting != null) {
            this.Sorting = new String(source.Sorting);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.DataEngineName != null) {
            this.DataEngineName = new String(source.DataEngineName);
        }
        if (source.ResourceGroupName != null) {
            this.ResourceGroupName = new String(source.ResourceGroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);
        this.setParamSimple(map, prefix + "Sorting", this.Sorting);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "DataEngineName", this.DataEngineName);
        this.setParamSimple(map, prefix + "ResourceGroupName", this.ResourceGroupName);

    }
}

