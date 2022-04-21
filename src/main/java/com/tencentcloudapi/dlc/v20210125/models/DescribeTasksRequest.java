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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTasksRequest extends AbstractModel{

    /**
    * 返回数量，默认为10，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 过滤条件，如下支持的过滤类型，传参Name应为以下其中一个,其中task-id支持最大50个过滤个数，其他过滤参数支持的总数不超过5个。
task-id - String - （任务ID准确过滤）task-id取值形如：e386471f-139a-4e59-877f-50ece8135b99。
task-state - String - （任务状态过滤）取值范围 0(初始化)， 1(运行中)， 2(成功)， -1(失败)。
task-sql-keyword - String - （SQL语句关键字模糊过滤）取值形如：DROP TABLE。
task-operator- string （子uin过滤）
task-kind - string （任务类型过滤）
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 排序字段，支持如下字段类型，create-time（创建时间，默认）、update-time（更新时间）
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * 排序方式，desc表示正序，asc表示反序， 默认为asc。
    */
    @SerializedName("Sorting")
    @Expose
    private String Sorting;

    /**
    * 起始时间点，格式为yyyy-mm-dd HH:MM:SS。默认为45天前的当前时刻
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间点，格式为yyyy-mm-dd HH:MM:SS时间跨度在(0,30天]，支持最近45天数据查询。默认为当前时刻
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 支持计算资源名字筛选
    */
    @SerializedName("DataEngineName")
    @Expose
    private String DataEngineName;

    /**
     * Get 返回数量，默认为10，最大值为100。 
     * @return Limit 返回数量，默认为10，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为10，最大值为100。
     * @param Limit 返回数量，默认为10，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，默认为0。 
     * @return Offset 偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 过滤条件，如下支持的过滤类型，传参Name应为以下其中一个,其中task-id支持最大50个过滤个数，其他过滤参数支持的总数不超过5个。
task-id - String - （任务ID准确过滤）task-id取值形如：e386471f-139a-4e59-877f-50ece8135b99。
task-state - String - （任务状态过滤）取值范围 0(初始化)， 1(运行中)， 2(成功)， -1(失败)。
task-sql-keyword - String - （SQL语句关键字模糊过滤）取值形如：DROP TABLE。
task-operator- string （子uin过滤）
task-kind - string （任务类型过滤） 
     * @return Filters 过滤条件，如下支持的过滤类型，传参Name应为以下其中一个,其中task-id支持最大50个过滤个数，其他过滤参数支持的总数不超过5个。
task-id - String - （任务ID准确过滤）task-id取值形如：e386471f-139a-4e59-877f-50ece8135b99。
task-state - String - （任务状态过滤）取值范围 0(初始化)， 1(运行中)， 2(成功)， -1(失败)。
task-sql-keyword - String - （SQL语句关键字模糊过滤）取值形如：DROP TABLE。
task-operator- string （子uin过滤）
task-kind - string （任务类型过滤）
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，如下支持的过滤类型，传参Name应为以下其中一个,其中task-id支持最大50个过滤个数，其他过滤参数支持的总数不超过5个。
task-id - String - （任务ID准确过滤）task-id取值形如：e386471f-139a-4e59-877f-50ece8135b99。
task-state - String - （任务状态过滤）取值范围 0(初始化)， 1(运行中)， 2(成功)， -1(失败)。
task-sql-keyword - String - （SQL语句关键字模糊过滤）取值形如：DROP TABLE。
task-operator- string （子uin过滤）
task-kind - string （任务类型过滤）
     * @param Filters 过滤条件，如下支持的过滤类型，传参Name应为以下其中一个,其中task-id支持最大50个过滤个数，其他过滤参数支持的总数不超过5个。
task-id - String - （任务ID准确过滤）task-id取值形如：e386471f-139a-4e59-877f-50ece8135b99。
task-state - String - （任务状态过滤）取值范围 0(初始化)， 1(运行中)， 2(成功)， -1(失败)。
task-sql-keyword - String - （SQL语句关键字模糊过滤）取值形如：DROP TABLE。
task-operator- string （子uin过滤）
task-kind - string （任务类型过滤）
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序字段，支持如下字段类型，create-time（创建时间，默认）、update-time（更新时间） 
     * @return SortBy 排序字段，支持如下字段类型，create-time（创建时间，默认）、update-time（更新时间）
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set 排序字段，支持如下字段类型，create-time（创建时间，默认）、update-time（更新时间）
     * @param SortBy 排序字段，支持如下字段类型，create-time（创建时间，默认）、update-time（更新时间）
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get 排序方式，desc表示正序，asc表示反序， 默认为asc。 
     * @return Sorting 排序方式，desc表示正序，asc表示反序， 默认为asc。
     */
    public String getSorting() {
        return this.Sorting;
    }

    /**
     * Set 排序方式，desc表示正序，asc表示反序， 默认为asc。
     * @param Sorting 排序方式，desc表示正序，asc表示反序， 默认为asc。
     */
    public void setSorting(String Sorting) {
        this.Sorting = Sorting;
    }

    /**
     * Get 起始时间点，格式为yyyy-mm-dd HH:MM:SS。默认为45天前的当前时刻 
     * @return StartTime 起始时间点，格式为yyyy-mm-dd HH:MM:SS。默认为45天前的当前时刻
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间点，格式为yyyy-mm-dd HH:MM:SS。默认为45天前的当前时刻
     * @param StartTime 起始时间点，格式为yyyy-mm-dd HH:MM:SS。默认为45天前的当前时刻
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间点，格式为yyyy-mm-dd HH:MM:SS时间跨度在(0,30天]，支持最近45天数据查询。默认为当前时刻 
     * @return EndTime 结束时间点，格式为yyyy-mm-dd HH:MM:SS时间跨度在(0,30天]，支持最近45天数据查询。默认为当前时刻
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间点，格式为yyyy-mm-dd HH:MM:SS时间跨度在(0,30天]，支持最近45天数据查询。默认为当前时刻
     * @param EndTime 结束时间点，格式为yyyy-mm-dd HH:MM:SS时间跨度在(0,30天]，支持最近45天数据查询。默认为当前时刻
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 支持计算资源名字筛选 
     * @return DataEngineName 支持计算资源名字筛选
     */
    public String getDataEngineName() {
        return this.DataEngineName;
    }

    /**
     * Set 支持计算资源名字筛选
     * @param DataEngineName 支持计算资源名字筛选
     */
    public void setDataEngineName(String DataEngineName) {
        this.DataEngineName = DataEngineName;
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

    }
}

