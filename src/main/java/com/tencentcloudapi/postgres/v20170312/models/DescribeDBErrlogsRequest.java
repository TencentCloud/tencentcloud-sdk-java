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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBErrlogsRequest extends AbstractModel {

    /**
    * <p>实例ID。    可通过<a href="https://cloud.tencent.com/document/api/409/16773">DescribeDBInstances</a>接口获取</p>
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * <p>查询起始时间，形如2018-01-01 00:00:00。日志保留时间默认为7天，起始时间不能超出保留时间范围。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>查询结束时间，形如2018-01-01 00:00:00。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>数据库名字。</p>
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * <p>搜索关键字。</p>
    */
    @SerializedName("SearchKeys")
    @Expose
    private String [] SearchKeys;

    /**
    * <p>每页显示数量，取值范围为1-100。默认值为50。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>数据偏移量，从0开始。默认值为0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>日志过滤条件。格式为  [{Type: &quot;ApplicationName&quot;, Compare: &quot;INC&quot;, Value: [&quot;123&quot;]}]。</p>
    */
    @SerializedName("LogFilters")
    @Expose
    private LogFilter [] LogFilters;

    /**
     * Get <p>实例ID。    可通过<a href="https://cloud.tencent.com/document/api/409/16773">DescribeDBInstances</a>接口获取</p> 
     * @return DBInstanceId <p>实例ID。    可通过<a href="https://cloud.tencent.com/document/api/409/16773">DescribeDBInstances</a>接口获取</p>
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set <p>实例ID。    可通过<a href="https://cloud.tencent.com/document/api/409/16773">DescribeDBInstances</a>接口获取</p>
     * @param DBInstanceId <p>实例ID。    可通过<a href="https://cloud.tencent.com/document/api/409/16773">DescribeDBInstances</a>接口获取</p>
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get <p>查询起始时间，形如2018-01-01 00:00:00。日志保留时间默认为7天，起始时间不能超出保留时间范围。</p> 
     * @return StartTime <p>查询起始时间，形如2018-01-01 00:00:00。日志保留时间默认为7天，起始时间不能超出保留时间范围。</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>查询起始时间，形如2018-01-01 00:00:00。日志保留时间默认为7天，起始时间不能超出保留时间范围。</p>
     * @param StartTime <p>查询起始时间，形如2018-01-01 00:00:00。日志保留时间默认为7天，起始时间不能超出保留时间范围。</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>查询结束时间，形如2018-01-01 00:00:00。</p> 
     * @return EndTime <p>查询结束时间，形如2018-01-01 00:00:00。</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>查询结束时间，形如2018-01-01 00:00:00。</p>
     * @param EndTime <p>查询结束时间，形如2018-01-01 00:00:00。</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>数据库名字。</p> 
     * @return DatabaseName <p>数据库名字。</p>
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set <p>数据库名字。</p>
     * @param DatabaseName <p>数据库名字。</p>
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get <p>搜索关键字。</p> 
     * @return SearchKeys <p>搜索关键字。</p>
     */
    public String [] getSearchKeys() {
        return this.SearchKeys;
    }

    /**
     * Set <p>搜索关键字。</p>
     * @param SearchKeys <p>搜索关键字。</p>
     */
    public void setSearchKeys(String [] SearchKeys) {
        this.SearchKeys = SearchKeys;
    }

    /**
     * Get <p>每页显示数量，取值范围为1-100。默认值为50。</p> 
     * @return Limit <p>每页显示数量，取值范围为1-100。默认值为50。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页显示数量，取值范围为1-100。默认值为50。</p>
     * @param Limit <p>每页显示数量，取值范围为1-100。默认值为50。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>数据偏移量，从0开始。默认值为0。</p> 
     * @return Offset <p>数据偏移量，从0开始。默认值为0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>数据偏移量，从0开始。默认值为0。</p>
     * @param Offset <p>数据偏移量，从0开始。默认值为0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>日志过滤条件。格式为  [{Type: &quot;ApplicationName&quot;, Compare: &quot;INC&quot;, Value: [&quot;123&quot;]}]。</p> 
     * @return LogFilters <p>日志过滤条件。格式为  [{Type: &quot;ApplicationName&quot;, Compare: &quot;INC&quot;, Value: [&quot;123&quot;]}]。</p>
     */
    public LogFilter [] getLogFilters() {
        return this.LogFilters;
    }

    /**
     * Set <p>日志过滤条件。格式为  [{Type: &quot;ApplicationName&quot;, Compare: &quot;INC&quot;, Value: [&quot;123&quot;]}]。</p>
     * @param LogFilters <p>日志过滤条件。格式为  [{Type: &quot;ApplicationName&quot;, Compare: &quot;INC&quot;, Value: [&quot;123&quot;]}]。</p>
     */
    public void setLogFilters(LogFilter [] LogFilters) {
        this.LogFilters = LogFilters;
    }

    public DescribeDBErrlogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBErrlogsRequest(DescribeDBErrlogsRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.SearchKeys != null) {
            this.SearchKeys = new String[source.SearchKeys.length];
            for (int i = 0; i < source.SearchKeys.length; i++) {
                this.SearchKeys[i] = new String(source.SearchKeys[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.LogFilters != null) {
            this.LogFilters = new LogFilter[source.LogFilters.length];
            for (int i = 0; i < source.LogFilters.length; i++) {
                this.LogFilters[i] = new LogFilter(source.LogFilters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamArraySimple(map, prefix + "SearchKeys.", this.SearchKeys);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "LogFilters.", this.LogFilters);

    }
}

