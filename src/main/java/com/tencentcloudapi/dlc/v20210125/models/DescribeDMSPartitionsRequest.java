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

public class DescribeDMSPartitionsRequest extends AbstractModel{

    /**
    * 数据库名
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 表名称
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * schema名称
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 单个分区名称，精准匹配
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
    * 多个分区名称，精准匹配
    */
    @SerializedName("PartitionNames")
    @Expose
    private String [] PartitionNames;

    /**
    * 多个分区字段的匹配，模糊匹配
    */
    @SerializedName("PartValues")
    @Expose
    private String [] PartValues;

    /**
    * 过滤SQL
    */
    @SerializedName("Filter")
    @Expose
    private String Filter;

    /**
    * 最大分区数量
    */
    @SerializedName("MaxParts")
    @Expose
    private Long MaxParts;

    /**
    * 翻页跳过数量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 页面数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 表达式
    */
    @SerializedName("Expression")
    @Expose
    private String Expression;

    /**
     * Get 数据库名 
     * @return DatabaseName 数据库名
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 数据库名
     * @param DatabaseName 数据库名
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 表名称 
     * @return TableName 表名称
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表名称
     * @param TableName 表名称
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get schema名称 
     * @return SchemaName schema名称
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set schema名称
     * @param SchemaName schema名称
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 单个分区名称，精准匹配 
     * @return Values 单个分区名称，精准匹配
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set 单个分区名称，精准匹配
     * @param Values 单个分区名称，精准匹配
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    /**
     * Get 多个分区名称，精准匹配 
     * @return PartitionNames 多个分区名称，精准匹配
     */
    public String [] getPartitionNames() {
        return this.PartitionNames;
    }

    /**
     * Set 多个分区名称，精准匹配
     * @param PartitionNames 多个分区名称，精准匹配
     */
    public void setPartitionNames(String [] PartitionNames) {
        this.PartitionNames = PartitionNames;
    }

    /**
     * Get 多个分区字段的匹配，模糊匹配 
     * @return PartValues 多个分区字段的匹配，模糊匹配
     */
    public String [] getPartValues() {
        return this.PartValues;
    }

    /**
     * Set 多个分区字段的匹配，模糊匹配
     * @param PartValues 多个分区字段的匹配，模糊匹配
     */
    public void setPartValues(String [] PartValues) {
        this.PartValues = PartValues;
    }

    /**
     * Get 过滤SQL 
     * @return Filter 过滤SQL
     */
    public String getFilter() {
        return this.Filter;
    }

    /**
     * Set 过滤SQL
     * @param Filter 过滤SQL
     */
    public void setFilter(String Filter) {
        this.Filter = Filter;
    }

    /**
     * Get 最大分区数量 
     * @return MaxParts 最大分区数量
     */
    public Long getMaxParts() {
        return this.MaxParts;
    }

    /**
     * Set 最大分区数量
     * @param MaxParts 最大分区数量
     */
    public void setMaxParts(Long MaxParts) {
        this.MaxParts = MaxParts;
    }

    /**
     * Get 翻页跳过数量 
     * @return Offset 翻页跳过数量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 翻页跳过数量
     * @param Offset 翻页跳过数量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 页面数量 
     * @return Limit 页面数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 页面数量
     * @param Limit 页面数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 表达式 
     * @return Expression 表达式
     */
    public String getExpression() {
        return this.Expression;
    }

    /**
     * Set 表达式
     * @param Expression 表达式
     */
    public void setExpression(String Expression) {
        this.Expression = Expression;
    }

    public DescribeDMSPartitionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDMSPartitionsRequest(DescribeDMSPartitionsRequest source) {
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
        if (source.PartitionNames != null) {
            this.PartitionNames = new String[source.PartitionNames.length];
            for (int i = 0; i < source.PartitionNames.length; i++) {
                this.PartitionNames[i] = new String(source.PartitionNames[i]);
            }
        }
        if (source.PartValues != null) {
            this.PartValues = new String[source.PartValues.length];
            for (int i = 0; i < source.PartValues.length; i++) {
                this.PartValues[i] = new String(source.PartValues[i]);
            }
        }
        if (source.Filter != null) {
            this.Filter = new String(source.Filter);
        }
        if (source.MaxParts != null) {
            this.MaxParts = new Long(source.MaxParts);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Expression != null) {
            this.Expression = new String(source.Expression);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);
        this.setParamArraySimple(map, prefix + "PartitionNames.", this.PartitionNames);
        this.setParamArraySimple(map, prefix + "PartValues.", this.PartValues);
        this.setParamSimple(map, prefix + "Filter", this.Filter);
        this.setParamSimple(map, prefix + "MaxParts", this.MaxParts);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Expression", this.Expression);

    }
}

