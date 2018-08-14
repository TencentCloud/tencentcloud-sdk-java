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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBErrlogsRequest  extends AbstractModel{

    /**
    * 实例ID，形如postgres-5bq3wfjd
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 查询起始时间，形如2018-01-01 00:00:00，起始时间不得小于7天以前
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询结束时间，形如2018-01-01 00:00:00
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 数据库名字
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 搜索关键字
    */
    @SerializedName("SearchKeys")
    @Expose
    private String [] SearchKeys;

    /**
    * 分页返回，每页返回的最大数量。取值为1-100
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
    * 分页返回，返回第几页的数据，从第0页开始计数
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
     * 获取实例ID，形如postgres-5bq3wfjd
     * @return DBInstanceId 实例ID，形如postgres-5bq3wfjd
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * 设置实例ID，形如postgres-5bq3wfjd
     * @param DBInstanceId 实例ID，形如postgres-5bq3wfjd
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * 获取查询起始时间，形如2018-01-01 00:00:00，起始时间不得小于7天以前
     * @return StartTime 查询起始时间，形如2018-01-01 00:00:00，起始时间不得小于7天以前
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * 设置查询起始时间，形如2018-01-01 00:00:00，起始时间不得小于7天以前
     * @param StartTime 查询起始时间，形如2018-01-01 00:00:00，起始时间不得小于7天以前
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * 获取查询结束时间，形如2018-01-01 00:00:00
     * @return EndTime 查询结束时间，形如2018-01-01 00:00:00
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * 设置查询结束时间，形如2018-01-01 00:00:00
     * @param EndTime 查询结束时间，形如2018-01-01 00:00:00
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * 获取数据库名字
     * @return DatabaseName 数据库名字
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * 设置数据库名字
     * @param DatabaseName 数据库名字
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * 获取搜索关键字
     * @return SearchKeys 搜索关键字
     */
    public String [] getSearchKeys() {
        return this.SearchKeys;
    }

    /**
     * 设置搜索关键字
     * @param SearchKeys 搜索关键字
     */
    public void setSearchKeys(String [] SearchKeys) {
        this.SearchKeys = SearchKeys;
    }

    /**
     * 获取分页返回，每页返回的最大数量。取值为1-100
     * @return Limit 分页返回，每页返回的最大数量。取值为1-100
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置分页返回，每页返回的最大数量。取值为1-100
     * @param Limit 分页返回，每页返回的最大数量。取值为1-100
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取分页返回，返回第几页的数据，从第0页开始计数
     * @return Offset 分页返回，返回第几页的数据，从第0页开始计数
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置分页返回，返回第几页的数据，从第0页开始计数
     * @param Offset 分页返回，返回第几页的数据，从第0页开始计数
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamArraySimple(map, prefix + "SearchKeys.", this.SearchKeys);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

