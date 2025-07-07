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

public class DescribeViewsRequest extends AbstractModel {

    /**
    * 列出该数据库下所属数据表。
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 返回数量，默认为10，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 数据偏移量，从0开始，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 过滤条件，如下支持的过滤类型，传参Name应为其一
view-name - String - （过滤条件）数据表名称,形如：view-001。
view-id - String - （过滤条件）view id形如：12342。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 数据库所属的数据源名称
    */
    @SerializedName("DatasourceConnectionName")
    @Expose
    private String DatasourceConnectionName;

    /**
    * 排序字段
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * 排序规则，true:升序；false:降序
    */
    @SerializedName("Asc")
    @Expose
    private Boolean Asc;

    /**
    * 按视图更新时间筛选，开始时间，如2021-11-11 00:00:00
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 按视图更新时间筛选，结束时间，如2021-11-12 00:00:00
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 查询类型：all：全部数据（默认）、permission：有权限的数据
注意：此字段需要开启白名单使用，如果需要使用，请提交工单联系我们。
    */
    @SerializedName("DescribeType")
    @Expose
    private String DescribeType;

    /**
     * Get 列出该数据库下所属数据表。 
     * @return DatabaseName 列出该数据库下所属数据表。
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 列出该数据库下所属数据表。
     * @param DatabaseName 列出该数据库下所属数据表。
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

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
     * Get 数据偏移量，从0开始，默认为0。 
     * @return Offset 数据偏移量，从0开始，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 数据偏移量，从0开始，默认为0。
     * @param Offset 数据偏移量，从0开始，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 过滤条件，如下支持的过滤类型，传参Name应为其一
view-name - String - （过滤条件）数据表名称,形如：view-001。
view-id - String - （过滤条件）view id形如：12342。 
     * @return Filters 过滤条件，如下支持的过滤类型，传参Name应为其一
view-name - String - （过滤条件）数据表名称,形如：view-001。
view-id - String - （过滤条件）view id形如：12342。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，如下支持的过滤类型，传参Name应为其一
view-name - String - （过滤条件）数据表名称,形如：view-001。
view-id - String - （过滤条件）view id形如：12342。
     * @param Filters 过滤条件，如下支持的过滤类型，传参Name应为其一
view-name - String - （过滤条件）数据表名称,形如：view-001。
view-id - String - （过滤条件）view id形如：12342。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 数据库所属的数据源名称 
     * @return DatasourceConnectionName 数据库所属的数据源名称
     */
    public String getDatasourceConnectionName() {
        return this.DatasourceConnectionName;
    }

    /**
     * Set 数据库所属的数据源名称
     * @param DatasourceConnectionName 数据库所属的数据源名称
     */
    public void setDatasourceConnectionName(String DatasourceConnectionName) {
        this.DatasourceConnectionName = DatasourceConnectionName;
    }

    /**
     * Get 排序字段 
     * @return Sort 排序字段
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set 排序字段
     * @param Sort 排序字段
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get 排序规则，true:升序；false:降序 
     * @return Asc 排序规则，true:升序；false:降序
     */
    public Boolean getAsc() {
        return this.Asc;
    }

    /**
     * Set 排序规则，true:升序；false:降序
     * @param Asc 排序规则，true:升序；false:降序
     */
    public void setAsc(Boolean Asc) {
        this.Asc = Asc;
    }

    /**
     * Get 按视图更新时间筛选，开始时间，如2021-11-11 00:00:00 
     * @return StartTime 按视图更新时间筛选，开始时间，如2021-11-11 00:00:00
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 按视图更新时间筛选，开始时间，如2021-11-11 00:00:00
     * @param StartTime 按视图更新时间筛选，开始时间，如2021-11-11 00:00:00
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 按视图更新时间筛选，结束时间，如2021-11-12 00:00:00 
     * @return EndTime 按视图更新时间筛选，结束时间，如2021-11-12 00:00:00
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 按视图更新时间筛选，结束时间，如2021-11-12 00:00:00
     * @param EndTime 按视图更新时间筛选，结束时间，如2021-11-12 00:00:00
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 查询类型：all：全部数据（默认）、permission：有权限的数据
注意：此字段需要开启白名单使用，如果需要使用，请提交工单联系我们。 
     * @return DescribeType 查询类型：all：全部数据（默认）、permission：有权限的数据
注意：此字段需要开启白名单使用，如果需要使用，请提交工单联系我们。
     */
    public String getDescribeType() {
        return this.DescribeType;
    }

    /**
     * Set 查询类型：all：全部数据（默认）、permission：有权限的数据
注意：此字段需要开启白名单使用，如果需要使用，请提交工单联系我们。
     * @param DescribeType 查询类型：all：全部数据（默认）、permission：有权限的数据
注意：此字段需要开启白名单使用，如果需要使用，请提交工单联系我们。
     */
    public void setDescribeType(String DescribeType) {
        this.DescribeType = DescribeType;
    }

    public DescribeViewsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeViewsRequest(DescribeViewsRequest source) {
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
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
        if (source.DatasourceConnectionName != null) {
            this.DatasourceConnectionName = new String(source.DatasourceConnectionName);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.Asc != null) {
            this.Asc = new Boolean(source.Asc);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.DescribeType != null) {
            this.DescribeType = new String(source.DescribeType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "DatasourceConnectionName", this.DatasourceConnectionName);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "Asc", this.Asc);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "DescribeType", this.DescribeType);

    }
}

