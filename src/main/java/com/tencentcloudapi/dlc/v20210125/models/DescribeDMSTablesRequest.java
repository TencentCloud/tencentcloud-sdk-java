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

public class DescribeDMSTablesRequest extends AbstractModel{

    /**
    * 数据库名称
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * 数据库schema名称
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * 表名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 数据目录
    */
    @SerializedName("Catalog")
    @Expose
    private String Catalog;

    /**
    * 查询关键词
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 查询模式
    */
    @SerializedName("Pattern")
    @Expose
    private String Pattern;

    /**
    * 表类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 筛选参数：更新开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 筛选参数：更新结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 分页参数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页参数
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 排序字段：create_time：创建时间
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * 排序字段：true：升序（默认），false：降序
    */
    @SerializedName("Asc")
    @Expose
    private Boolean Asc;

    /**
     * Get 数据库名称 
     * @return DbName 数据库名称
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set 数据库名称
     * @param DbName 数据库名称
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get 数据库schema名称 
     * @return SchemaName 数据库schema名称
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set 数据库schema名称
     * @param SchemaName 数据库schema名称
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get 表名称 
     * @return Name 表名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 表名称
     * @param Name 表名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 数据目录 
     * @return Catalog 数据目录
     */
    public String getCatalog() {
        return this.Catalog;
    }

    /**
     * Set 数据目录
     * @param Catalog 数据目录
     */
    public void setCatalog(String Catalog) {
        this.Catalog = Catalog;
    }

    /**
     * Get 查询关键词 
     * @return Keyword 查询关键词
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 查询关键词
     * @param Keyword 查询关键词
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get 查询模式 
     * @return Pattern 查询模式
     */
    public String getPattern() {
        return this.Pattern;
    }

    /**
     * Set 查询模式
     * @param Pattern 查询模式
     */
    public void setPattern(String Pattern) {
        this.Pattern = Pattern;
    }

    /**
     * Get 表类型 
     * @return Type 表类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 表类型
     * @param Type 表类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 筛选参数：更新开始时间 
     * @return StartTime 筛选参数：更新开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 筛选参数：更新开始时间
     * @param StartTime 筛选参数：更新开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 筛选参数：更新结束时间 
     * @return EndTime 筛选参数：更新结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 筛选参数：更新结束时间
     * @param EndTime 筛选参数：更新结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 分页参数 
     * @return Limit 分页参数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页参数
     * @param Limit 分页参数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页参数 
     * @return Offset 分页参数
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页参数
     * @param Offset 分页参数
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 排序字段：create_time：创建时间 
     * @return Sort 排序字段：create_time：创建时间
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set 排序字段：create_time：创建时间
     * @param Sort 排序字段：create_time：创建时间
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get 排序字段：true：升序（默认），false：降序 
     * @return Asc 排序字段：true：升序（默认），false：降序
     */
    public Boolean getAsc() {
        return this.Asc;
    }

    /**
     * Set 排序字段：true：升序（默认），false：降序
     * @param Asc 排序字段：true：升序（默认），false：降序
     */
    public void setAsc(Boolean Asc) {
        this.Asc = Asc;
    }

    public DescribeDMSTablesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDMSTablesRequest(DescribeDMSTablesRequest source) {
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Catalog != null) {
            this.Catalog = new String(source.Catalog);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.Pattern != null) {
            this.Pattern = new String(source.Pattern);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.Asc != null) {
            this.Asc = new Boolean(source.Asc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Catalog", this.Catalog);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "Pattern", this.Pattern);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "Asc", this.Asc);

    }
}

