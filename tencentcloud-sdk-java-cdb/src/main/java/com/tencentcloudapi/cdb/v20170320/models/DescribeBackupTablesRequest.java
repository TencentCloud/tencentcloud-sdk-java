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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupTablesRequest extends AbstractModel{

    /**
    * 实例ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例ID相同。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 开始时间，格式为：2017-07-12 10:29:20。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 指定的数据库名。
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 要查询的数据表名前缀。
    */
    @SerializedName("SearchTable")
    @Expose
    private String SearchTable;

    /**
    * 分页偏移。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页大小，最小值为1，最大值为2000。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 实例ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例ID相同。 
     * @return InstanceId 实例ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例ID相同。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例ID相同。
     * @param InstanceId 实例ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例ID相同。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 开始时间，格式为：2017-07-12 10:29:20。 
     * @return StartTime 开始时间，格式为：2017-07-12 10:29:20。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间，格式为：2017-07-12 10:29:20。
     * @param StartTime 开始时间，格式为：2017-07-12 10:29:20。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 指定的数据库名。 
     * @return DatabaseName 指定的数据库名。
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 指定的数据库名。
     * @param DatabaseName 指定的数据库名。
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 要查询的数据表名前缀。 
     * @return SearchTable 要查询的数据表名前缀。
     */
    public String getSearchTable() {
        return this.SearchTable;
    }

    /**
     * Set 要查询的数据表名前缀。
     * @param SearchTable 要查询的数据表名前缀。
     */
    public void setSearchTable(String SearchTable) {
        this.SearchTable = SearchTable;
    }

    /**
     * Get 分页偏移。 
     * @return Offset 分页偏移。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移。
     * @param Offset 分页偏移。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页大小，最小值为1，最大值为2000。 
     * @return Limit 分页大小，最小值为1，最大值为2000。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页大小，最小值为1，最大值为2000。
     * @param Limit 分页大小，最小值为1，最大值为2000。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "SearchTable", this.SearchTable);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

