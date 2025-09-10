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

public class DescribeTablePartitionsRequest extends AbstractModel {

    /**
    * 数据目录名称
    */
    @SerializedName("Catalog")
    @Expose
    private String Catalog;

    /**
    * 数据库名称
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * 数据表名称
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * 查询偏移位置
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 当次查询的数量限制
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 模糊查询的分区名称
    */
    @SerializedName("FuzzyPartition")
    @Expose
    private String FuzzyPartition;

    /**
    * 排序信息
    */
    @SerializedName("Sorts")
    @Expose
    private Sort [] Sorts;

    /**
    * 分页查询的游标信息
    */
    @SerializedName("Cursor")
    @Expose
    private String Cursor;

    /**
     * Get 数据目录名称 
     * @return Catalog 数据目录名称
     */
    public String getCatalog() {
        return this.Catalog;
    }

    /**
     * Set 数据目录名称
     * @param Catalog 数据目录名称
     */
    public void setCatalog(String Catalog) {
        this.Catalog = Catalog;
    }

    /**
     * Get 数据库名称 
     * @return Database 数据库名称
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set 数据库名称
     * @param Database 数据库名称
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get 数据表名称 
     * @return Table 数据表名称
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set 数据表名称
     * @param Table 数据表名称
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * Get 查询偏移位置 
     * @return Offset 查询偏移位置
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询偏移位置
     * @param Offset 查询偏移位置
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 当次查询的数量限制 
     * @return Limit 当次查询的数量限制
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 当次查询的数量限制
     * @param Limit 当次查询的数量限制
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 模糊查询的分区名称 
     * @return FuzzyPartition 模糊查询的分区名称
     */
    public String getFuzzyPartition() {
        return this.FuzzyPartition;
    }

    /**
     * Set 模糊查询的分区名称
     * @param FuzzyPartition 模糊查询的分区名称
     */
    public void setFuzzyPartition(String FuzzyPartition) {
        this.FuzzyPartition = FuzzyPartition;
    }

    /**
     * Get 排序信息 
     * @return Sorts 排序信息
     */
    public Sort [] getSorts() {
        return this.Sorts;
    }

    /**
     * Set 排序信息
     * @param Sorts 排序信息
     */
    public void setSorts(Sort [] Sorts) {
        this.Sorts = Sorts;
    }

    /**
     * Get 分页查询的游标信息 
     * @return Cursor 分页查询的游标信息
     */
    public String getCursor() {
        return this.Cursor;
    }

    /**
     * Set 分页查询的游标信息
     * @param Cursor 分页查询的游标信息
     */
    public void setCursor(String Cursor) {
        this.Cursor = Cursor;
    }

    public DescribeTablePartitionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTablePartitionsRequest(DescribeTablePartitionsRequest source) {
        if (source.Catalog != null) {
            this.Catalog = new String(source.Catalog);
        }
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.Table != null) {
            this.Table = new String(source.Table);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.FuzzyPartition != null) {
            this.FuzzyPartition = new String(source.FuzzyPartition);
        }
        if (source.Sorts != null) {
            this.Sorts = new Sort[source.Sorts.length];
            for (int i = 0; i < source.Sorts.length; i++) {
                this.Sorts[i] = new Sort(source.Sorts[i]);
            }
        }
        if (source.Cursor != null) {
            this.Cursor = new String(source.Cursor);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Catalog", this.Catalog);
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "Table", this.Table);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "FuzzyPartition", this.FuzzyPartition);
        this.setParamArrayObj(map, prefix + "Sorts.", this.Sorts);
        this.setParamSimple(map, prefix + "Cursor", this.Cursor);

    }
}

