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

public class DescribeDBErrlogsRequest extends AbstractModel{

    /**
    * 实例ID。	
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 查询起始时间，形如2018-01-01 00:00:00。日志保留时间默认为7天，起始时间不能超出保留时间范围。	
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询结束时间，形如2018-01-01 00:00:00。	
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 数据库名字。
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 搜索关键字。
    */
    @SerializedName("SearchKeys")
    @Expose
    private String [] SearchKeys;

    /**
    * 每页显示数量，取值范围为1-100。默认值为50。	
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 数据偏移量，从0开始。默认值为0。	
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 实例ID。	 
     * @return DBInstanceId 实例ID。	
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set 实例ID。	
     * @param DBInstanceId 实例ID。	
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get 查询起始时间，形如2018-01-01 00:00:00。日志保留时间默认为7天，起始时间不能超出保留时间范围。	 
     * @return StartTime 查询起始时间，形如2018-01-01 00:00:00。日志保留时间默认为7天，起始时间不能超出保留时间范围。	
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询起始时间，形如2018-01-01 00:00:00。日志保留时间默认为7天，起始时间不能超出保留时间范围。	
     * @param StartTime 查询起始时间，形如2018-01-01 00:00:00。日志保留时间默认为7天，起始时间不能超出保留时间范围。	
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询结束时间，形如2018-01-01 00:00:00。	 
     * @return EndTime 查询结束时间，形如2018-01-01 00:00:00。	
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询结束时间，形如2018-01-01 00:00:00。	
     * @param EndTime 查询结束时间，形如2018-01-01 00:00:00。	
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 数据库名字。 
     * @return DatabaseName 数据库名字。
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 数据库名字。
     * @param DatabaseName 数据库名字。
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 搜索关键字。 
     * @return SearchKeys 搜索关键字。
     */
    public String [] getSearchKeys() {
        return this.SearchKeys;
    }

    /**
     * Set 搜索关键字。
     * @param SearchKeys 搜索关键字。
     */
    public void setSearchKeys(String [] SearchKeys) {
        this.SearchKeys = SearchKeys;
    }

    /**
     * Get 每页显示数量，取值范围为1-100。默认值为50。	 
     * @return Limit 每页显示数量，取值范围为1-100。默认值为50。	
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页显示数量，取值范围为1-100。默认值为50。	
     * @param Limit 每页显示数量，取值范围为1-100。默认值为50。	
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 数据偏移量，从0开始。默认值为0。	 
     * @return Offset 数据偏移量，从0开始。默认值为0。	
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 数据偏移量，从0开始。默认值为0。	
     * @param Offset 数据偏移量，从0开始。默认值为0。	
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
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

    }
}

