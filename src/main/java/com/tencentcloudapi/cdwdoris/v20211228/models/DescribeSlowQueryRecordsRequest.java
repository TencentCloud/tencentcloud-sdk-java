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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSlowQueryRecordsRequest extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 慢查询时间
    */
    @SerializedName("QueryDurationMs")
    @Expose
    private Long QueryDurationMs;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 分页
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 分页
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * 排序参数
    */
    @SerializedName("DurationMs")
    @Expose
    private String DurationMs;

    /**
    * 数据库名称
    */
    @SerializedName("DbName")
    @Expose
    private String [] DbName;

    /**
    * 是否是查询，0：否， 1：是
    */
    @SerializedName("IsQuery")
    @Expose
    private Long IsQuery;

    /**
    * catalog名称
    */
    @SerializedName("CatalogName")
    @Expose
    private String [] CatalogName;

    /**
    * sql名
    */
    @SerializedName("Sql")
    @Expose
    private String Sql;

    /**
    * ReadRows排序字段
    */
    @SerializedName("ReadRows")
    @Expose
    private String ReadRows;

    /**
    * ResultBytes排序字段
    */
    @SerializedName("ResultBytes")
    @Expose
    private String ResultBytes;

    /**
    * MemoryUsage排序字段
    */
    @SerializedName("MemoryUsage")
    @Expose
    private String MemoryUsage;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 慢查询时间 
     * @return QueryDurationMs 慢查询时间
     */
    public Long getQueryDurationMs() {
        return this.QueryDurationMs;
    }

    /**
     * Set 慢查询时间
     * @param QueryDurationMs 慢查询时间
     */
    public void setQueryDurationMs(Long QueryDurationMs) {
        this.QueryDurationMs = QueryDurationMs;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 分页 
     * @return PageSize 分页
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页
     * @param PageSize 分页
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 分页 
     * @return PageNum 分页
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set 分页
     * @param PageNum 分页
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get 排序参数 
     * @return DurationMs 排序参数
     */
    public String getDurationMs() {
        return this.DurationMs;
    }

    /**
     * Set 排序参数
     * @param DurationMs 排序参数
     */
    public void setDurationMs(String DurationMs) {
        this.DurationMs = DurationMs;
    }

    /**
     * Get 数据库名称 
     * @return DbName 数据库名称
     */
    public String [] getDbName() {
        return this.DbName;
    }

    /**
     * Set 数据库名称
     * @param DbName 数据库名称
     */
    public void setDbName(String [] DbName) {
        this.DbName = DbName;
    }

    /**
     * Get 是否是查询，0：否， 1：是 
     * @return IsQuery 是否是查询，0：否， 1：是
     */
    public Long getIsQuery() {
        return this.IsQuery;
    }

    /**
     * Set 是否是查询，0：否， 1：是
     * @param IsQuery 是否是查询，0：否， 1：是
     */
    public void setIsQuery(Long IsQuery) {
        this.IsQuery = IsQuery;
    }

    /**
     * Get catalog名称 
     * @return CatalogName catalog名称
     */
    public String [] getCatalogName() {
        return this.CatalogName;
    }

    /**
     * Set catalog名称
     * @param CatalogName catalog名称
     */
    public void setCatalogName(String [] CatalogName) {
        this.CatalogName = CatalogName;
    }

    /**
     * Get sql名 
     * @return Sql sql名
     */
    public String getSql() {
        return this.Sql;
    }

    /**
     * Set sql名
     * @param Sql sql名
     */
    public void setSql(String Sql) {
        this.Sql = Sql;
    }

    /**
     * Get ReadRows排序字段 
     * @return ReadRows ReadRows排序字段
     */
    public String getReadRows() {
        return this.ReadRows;
    }

    /**
     * Set ReadRows排序字段
     * @param ReadRows ReadRows排序字段
     */
    public void setReadRows(String ReadRows) {
        this.ReadRows = ReadRows;
    }

    /**
     * Get ResultBytes排序字段 
     * @return ResultBytes ResultBytes排序字段
     */
    public String getResultBytes() {
        return this.ResultBytes;
    }

    /**
     * Set ResultBytes排序字段
     * @param ResultBytes ResultBytes排序字段
     */
    public void setResultBytes(String ResultBytes) {
        this.ResultBytes = ResultBytes;
    }

    /**
     * Get MemoryUsage排序字段 
     * @return MemoryUsage MemoryUsage排序字段
     */
    public String getMemoryUsage() {
        return this.MemoryUsage;
    }

    /**
     * Set MemoryUsage排序字段
     * @param MemoryUsage MemoryUsage排序字段
     */
    public void setMemoryUsage(String MemoryUsage) {
        this.MemoryUsage = MemoryUsage;
    }

    public DescribeSlowQueryRecordsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSlowQueryRecordsRequest(DescribeSlowQueryRecordsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.QueryDurationMs != null) {
            this.QueryDurationMs = new Long(source.QueryDurationMs);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
        if (source.DurationMs != null) {
            this.DurationMs = new String(source.DurationMs);
        }
        if (source.DbName != null) {
            this.DbName = new String[source.DbName.length];
            for (int i = 0; i < source.DbName.length; i++) {
                this.DbName[i] = new String(source.DbName[i]);
            }
        }
        if (source.IsQuery != null) {
            this.IsQuery = new Long(source.IsQuery);
        }
        if (source.CatalogName != null) {
            this.CatalogName = new String[source.CatalogName.length];
            for (int i = 0; i < source.CatalogName.length; i++) {
                this.CatalogName[i] = new String(source.CatalogName[i]);
            }
        }
        if (source.Sql != null) {
            this.Sql = new String(source.Sql);
        }
        if (source.ReadRows != null) {
            this.ReadRows = new String(source.ReadRows);
        }
        if (source.ResultBytes != null) {
            this.ResultBytes = new String(source.ResultBytes);
        }
        if (source.MemoryUsage != null) {
            this.MemoryUsage = new String(source.MemoryUsage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "QueryDurationMs", this.QueryDurationMs);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "DurationMs", this.DurationMs);
        this.setParamArraySimple(map, prefix + "DbName.", this.DbName);
        this.setParamSimple(map, prefix + "IsQuery", this.IsQuery);
        this.setParamArraySimple(map, prefix + "CatalogName.", this.CatalogName);
        this.setParamSimple(map, prefix + "Sql", this.Sql);
        this.setParamSimple(map, prefix + "ReadRows", this.ReadRows);
        this.setParamSimple(map, prefix + "ResultBytes", this.ResultBytes);
        this.setParamSimple(map, prefix + "MemoryUsage", this.MemoryUsage);

    }
}

