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

public class DescribeTablesRequest extends AbstractModel{

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
table-name - String - （过滤条件）数据表名称,形如：table-001。
table-id - String - （过滤条件）table id形如：12342。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 指定查询的数据源名称，默认为DataLakeCatalog
    */
    @SerializedName("DatasourceConnectionName")
    @Expose
    private String DatasourceConnectionName;

    /**
    * 起始时间：用于对更新时间的筛选
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 终止时间：用于对更新时间的筛选
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 排序字段，支持：ModifiedTime（默认）；CreateTime
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * 排序字段，false：降序（默认）；true
    */
    @SerializedName("Asc")
    @Expose
    private Boolean Asc;

    /**
    * table type，表类型查询,可用值:EXTERNAL_TABLE,INDEX_TABLE,MANAGED_TABLE,MATERIALIZED_VIEW,TABLE,VIEW,VIRTUAL_VIEW
    */
    @SerializedName("TableType")
    @Expose
    private String TableType;

    /**
    * 筛选字段-表格式：不传（默认）为查全部；LAKEFS：托管表；ICEBERG：非托管iceberg表；HIVE：非托管hive表；OTHER：非托管其它；
    */
    @SerializedName("TableFormat")
    @Expose
    private String TableFormat;

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
table-name - String - （过滤条件）数据表名称,形如：table-001。
table-id - String - （过滤条件）table id形如：12342。 
     * @return Filters 过滤条件，如下支持的过滤类型，传参Name应为其一
table-name - String - （过滤条件）数据表名称,形如：table-001。
table-id - String - （过滤条件）table id形如：12342。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，如下支持的过滤类型，传参Name应为其一
table-name - String - （过滤条件）数据表名称,形如：table-001。
table-id - String - （过滤条件）table id形如：12342。
     * @param Filters 过滤条件，如下支持的过滤类型，传参Name应为其一
table-name - String - （过滤条件）数据表名称,形如：table-001。
table-id - String - （过滤条件）table id形如：12342。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 指定查询的数据源名称，默认为DataLakeCatalog 
     * @return DatasourceConnectionName 指定查询的数据源名称，默认为DataLakeCatalog
     */
    public String getDatasourceConnectionName() {
        return this.DatasourceConnectionName;
    }

    /**
     * Set 指定查询的数据源名称，默认为DataLakeCatalog
     * @param DatasourceConnectionName 指定查询的数据源名称，默认为DataLakeCatalog
     */
    public void setDatasourceConnectionName(String DatasourceConnectionName) {
        this.DatasourceConnectionName = DatasourceConnectionName;
    }

    /**
     * Get 起始时间：用于对更新时间的筛选 
     * @return StartTime 起始时间：用于对更新时间的筛选
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间：用于对更新时间的筛选
     * @param StartTime 起始时间：用于对更新时间的筛选
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 终止时间：用于对更新时间的筛选 
     * @return EndTime 终止时间：用于对更新时间的筛选
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 终止时间：用于对更新时间的筛选
     * @param EndTime 终止时间：用于对更新时间的筛选
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 排序字段，支持：ModifiedTime（默认）；CreateTime 
     * @return Sort 排序字段，支持：ModifiedTime（默认）；CreateTime
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set 排序字段，支持：ModifiedTime（默认）；CreateTime
     * @param Sort 排序字段，支持：ModifiedTime（默认）；CreateTime
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get 排序字段，false：降序（默认）；true 
     * @return Asc 排序字段，false：降序（默认）；true
     */
    public Boolean getAsc() {
        return this.Asc;
    }

    /**
     * Set 排序字段，false：降序（默认）；true
     * @param Asc 排序字段，false：降序（默认）；true
     */
    public void setAsc(Boolean Asc) {
        this.Asc = Asc;
    }

    /**
     * Get table type，表类型查询,可用值:EXTERNAL_TABLE,INDEX_TABLE,MANAGED_TABLE,MATERIALIZED_VIEW,TABLE,VIEW,VIRTUAL_VIEW 
     * @return TableType table type，表类型查询,可用值:EXTERNAL_TABLE,INDEX_TABLE,MANAGED_TABLE,MATERIALIZED_VIEW,TABLE,VIEW,VIRTUAL_VIEW
     */
    public String getTableType() {
        return this.TableType;
    }

    /**
     * Set table type，表类型查询,可用值:EXTERNAL_TABLE,INDEX_TABLE,MANAGED_TABLE,MATERIALIZED_VIEW,TABLE,VIEW,VIRTUAL_VIEW
     * @param TableType table type，表类型查询,可用值:EXTERNAL_TABLE,INDEX_TABLE,MANAGED_TABLE,MATERIALIZED_VIEW,TABLE,VIEW,VIRTUAL_VIEW
     */
    public void setTableType(String TableType) {
        this.TableType = TableType;
    }

    /**
     * Get 筛选字段-表格式：不传（默认）为查全部；LAKEFS：托管表；ICEBERG：非托管iceberg表；HIVE：非托管hive表；OTHER：非托管其它； 
     * @return TableFormat 筛选字段-表格式：不传（默认）为查全部；LAKEFS：托管表；ICEBERG：非托管iceberg表；HIVE：非托管hive表；OTHER：非托管其它；
     */
    public String getTableFormat() {
        return this.TableFormat;
    }

    /**
     * Set 筛选字段-表格式：不传（默认）为查全部；LAKEFS：托管表；ICEBERG：非托管iceberg表；HIVE：非托管hive表；OTHER：非托管其它；
     * @param TableFormat 筛选字段-表格式：不传（默认）为查全部；LAKEFS：托管表；ICEBERG：非托管iceberg表；HIVE：非托管hive表；OTHER：非托管其它；
     */
    public void setTableFormat(String TableFormat) {
        this.TableFormat = TableFormat;
    }

    public DescribeTablesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTablesRequest(DescribeTablesRequest source) {
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
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.Asc != null) {
            this.Asc = new Boolean(source.Asc);
        }
        if (source.TableType != null) {
            this.TableType = new String(source.TableType);
        }
        if (source.TableFormat != null) {
            this.TableFormat = new String(source.TableFormat);
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
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "Asc", this.Asc);
        this.setParamSimple(map, prefix + "TableType", this.TableType);
        this.setParamSimple(map, prefix + "TableFormat", this.TableFormat);

    }
}

