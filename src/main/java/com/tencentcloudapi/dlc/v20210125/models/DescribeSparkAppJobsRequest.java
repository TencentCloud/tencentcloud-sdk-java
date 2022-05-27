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

public class DescribeSparkAppJobsRequest extends AbstractModel{

    /**
    * 返回结果按照该字段排序
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * 正序或者倒序，例如：desc
    */
    @SerializedName("Sorting")
    @Expose
    private String Sorting;

    /**
    * 按照该参数过滤
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 更新时间起始点
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 更新时间截止点
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 查询列表偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 查询列表限制数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 返回结果按照该字段排序 
     * @return SortBy 返回结果按照该字段排序
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set 返回结果按照该字段排序
     * @param SortBy 返回结果按照该字段排序
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get 正序或者倒序，例如：desc 
     * @return Sorting 正序或者倒序，例如：desc
     */
    public String getSorting() {
        return this.Sorting;
    }

    /**
     * Set 正序或者倒序，例如：desc
     * @param Sorting 正序或者倒序，例如：desc
     */
    public void setSorting(String Sorting) {
        this.Sorting = Sorting;
    }

    /**
     * Get 按照该参数过滤 
     * @return Filters 按照该参数过滤
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 按照该参数过滤
     * @param Filters 按照该参数过滤
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 更新时间起始点 
     * @return StartTime 更新时间起始点
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 更新时间起始点
     * @param StartTime 更新时间起始点
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 更新时间截止点 
     * @return EndTime 更新时间截止点
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 更新时间截止点
     * @param EndTime 更新时间截止点
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 查询列表偏移量 
     * @return Offset 查询列表偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询列表偏移量
     * @param Offset 查询列表偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 查询列表限制数量 
     * @return Limit 查询列表限制数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询列表限制数量
     * @param Limit 查询列表限制数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeSparkAppJobsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSparkAppJobsRequest(DescribeSparkAppJobsRequest source) {
        if (source.SortBy != null) {
            this.SortBy = new String(source.SortBy);
        }
        if (source.Sorting != null) {
            this.Sorting = new String(source.Sorting);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
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
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);
        this.setParamSimple(map, prefix + "Sorting", this.Sorting);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

