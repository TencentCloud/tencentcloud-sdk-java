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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDatasourceConnectionRequest extends AbstractModel {

    /**
    * 连接ID列表，指定要查询的连接ID
    */
    @SerializedName("DatasourceConnectionIds")
    @Expose
    private String [] DatasourceConnectionIds;

    /**
    * 过滤条件，当前支持的过滤键为：DatasourceConnectionName（数据源连接名）。
DatasourceConnectionType   （数据源连接连接类型）
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 偏移量，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认20，最大值100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 排序字段，支持如下字段类型，create-time（默认，创建时间）、update-time（更新时间）
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * 排序方式，desc表示正序，asc表示反序， 默认为desc
    */
    @SerializedName("Sorting")
    @Expose
    private String Sorting;

    /**
    * 筛选字段：起始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 筛选字段：截止时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 连接名称列表，指定要查询的连接名称
    */
    @SerializedName("DatasourceConnectionNames")
    @Expose
    private String [] DatasourceConnectionNames;

    /**
    * 连接类型，支持Mysql/HiveCos/Kafka/DataLakeCatalog
    */
    @SerializedName("DatasourceConnectionTypes")
    @Expose
    private String [] DatasourceConnectionTypes;

    /**
     * Get 连接ID列表，指定要查询的连接ID 
     * @return DatasourceConnectionIds 连接ID列表，指定要查询的连接ID
     */
    public String [] getDatasourceConnectionIds() {
        return this.DatasourceConnectionIds;
    }

    /**
     * Set 连接ID列表，指定要查询的连接ID
     * @param DatasourceConnectionIds 连接ID列表，指定要查询的连接ID
     */
    public void setDatasourceConnectionIds(String [] DatasourceConnectionIds) {
        this.DatasourceConnectionIds = DatasourceConnectionIds;
    }

    /**
     * Get 过滤条件，当前支持的过滤键为：DatasourceConnectionName（数据源连接名）。
DatasourceConnectionType   （数据源连接连接类型） 
     * @return Filters 过滤条件，当前支持的过滤键为：DatasourceConnectionName（数据源连接名）。
DatasourceConnectionType   （数据源连接连接类型）
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，当前支持的过滤键为：DatasourceConnectionName（数据源连接名）。
DatasourceConnectionType   （数据源连接连接类型）
     * @param Filters 过滤条件，当前支持的过滤键为：DatasourceConnectionName（数据源连接名）。
DatasourceConnectionType   （数据源连接连接类型）
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 偏移量，默认为0 
     * @return Offset 偏移量，默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0
     * @param Offset 偏移量，默认为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认20，最大值100 
     * @return Limit 返回数量，默认20，最大值100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认20，最大值100
     * @param Limit 返回数量，默认20，最大值100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 排序字段，支持如下字段类型，create-time（默认，创建时间）、update-time（更新时间） 
     * @return SortBy 排序字段，支持如下字段类型，create-time（默认，创建时间）、update-time（更新时间）
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set 排序字段，支持如下字段类型，create-time（默认，创建时间）、update-time（更新时间）
     * @param SortBy 排序字段，支持如下字段类型，create-time（默认，创建时间）、update-time（更新时间）
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get 排序方式，desc表示正序，asc表示反序， 默认为desc 
     * @return Sorting 排序方式，desc表示正序，asc表示反序， 默认为desc
     */
    public String getSorting() {
        return this.Sorting;
    }

    /**
     * Set 排序方式，desc表示正序，asc表示反序， 默认为desc
     * @param Sorting 排序方式，desc表示正序，asc表示反序， 默认为desc
     */
    public void setSorting(String Sorting) {
        this.Sorting = Sorting;
    }

    /**
     * Get 筛选字段：起始时间 
     * @return StartTime 筛选字段：起始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 筛选字段：起始时间
     * @param StartTime 筛选字段：起始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 筛选字段：截止时间 
     * @return EndTime 筛选字段：截止时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 筛选字段：截止时间
     * @param EndTime 筛选字段：截止时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 连接名称列表，指定要查询的连接名称 
     * @return DatasourceConnectionNames 连接名称列表，指定要查询的连接名称
     */
    public String [] getDatasourceConnectionNames() {
        return this.DatasourceConnectionNames;
    }

    /**
     * Set 连接名称列表，指定要查询的连接名称
     * @param DatasourceConnectionNames 连接名称列表，指定要查询的连接名称
     */
    public void setDatasourceConnectionNames(String [] DatasourceConnectionNames) {
        this.DatasourceConnectionNames = DatasourceConnectionNames;
    }

    /**
     * Get 连接类型，支持Mysql/HiveCos/Kafka/DataLakeCatalog 
     * @return DatasourceConnectionTypes 连接类型，支持Mysql/HiveCos/Kafka/DataLakeCatalog
     */
    public String [] getDatasourceConnectionTypes() {
        return this.DatasourceConnectionTypes;
    }

    /**
     * Set 连接类型，支持Mysql/HiveCos/Kafka/DataLakeCatalog
     * @param DatasourceConnectionTypes 连接类型，支持Mysql/HiveCos/Kafka/DataLakeCatalog
     */
    public void setDatasourceConnectionTypes(String [] DatasourceConnectionTypes) {
        this.DatasourceConnectionTypes = DatasourceConnectionTypes;
    }

    public DescribeDatasourceConnectionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDatasourceConnectionRequest(DescribeDatasourceConnectionRequest source) {
        if (source.DatasourceConnectionIds != null) {
            this.DatasourceConnectionIds = new String[source.DatasourceConnectionIds.length];
            for (int i = 0; i < source.DatasourceConnectionIds.length; i++) {
                this.DatasourceConnectionIds[i] = new String(source.DatasourceConnectionIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
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
        if (source.DatasourceConnectionNames != null) {
            this.DatasourceConnectionNames = new String[source.DatasourceConnectionNames.length];
            for (int i = 0; i < source.DatasourceConnectionNames.length; i++) {
                this.DatasourceConnectionNames[i] = new String(source.DatasourceConnectionNames[i]);
            }
        }
        if (source.DatasourceConnectionTypes != null) {
            this.DatasourceConnectionTypes = new String[source.DatasourceConnectionTypes.length];
            for (int i = 0; i < source.DatasourceConnectionTypes.length; i++) {
                this.DatasourceConnectionTypes[i] = new String(source.DatasourceConnectionTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DatasourceConnectionIds.", this.DatasourceConnectionIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);
        this.setParamSimple(map, prefix + "Sorting", this.Sorting);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "DatasourceConnectionNames.", this.DatasourceConnectionNames);
        this.setParamArraySimple(map, prefix + "DatasourceConnectionTypes.", this.DatasourceConnectionTypes);

    }
}

