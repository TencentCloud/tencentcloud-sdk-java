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

public class DescribeDBXlogsRequest extends AbstractModel {

    /**
    * 实例ID，形如postgres-4wdeb0zv。
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 查询开始时间，形如2018-06-10 17:06:38，起始时间不得小于7天以前
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询结束时间，形如2018-06-10 17:06:38
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 分页返回，表示返回第几页的条目。从第0页开始计数。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页返回，表示每页有多少条目。取值为1-100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 实例ID，形如postgres-4wdeb0zv。 
     * @return DBInstanceId 实例ID，形如postgres-4wdeb0zv。
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set 实例ID，形如postgres-4wdeb0zv。
     * @param DBInstanceId 实例ID，形如postgres-4wdeb0zv。
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get 查询开始时间，形如2018-06-10 17:06:38，起始时间不得小于7天以前 
     * @return StartTime 查询开始时间，形如2018-06-10 17:06:38，起始时间不得小于7天以前
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询开始时间，形如2018-06-10 17:06:38，起始时间不得小于7天以前
     * @param StartTime 查询开始时间，形如2018-06-10 17:06:38，起始时间不得小于7天以前
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询结束时间，形如2018-06-10 17:06:38 
     * @return EndTime 查询结束时间，形如2018-06-10 17:06:38
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询结束时间，形如2018-06-10 17:06:38
     * @param EndTime 查询结束时间，形如2018-06-10 17:06:38
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 分页返回，表示返回第几页的条目。从第0页开始计数。 
     * @return Offset 分页返回，表示返回第几页的条目。从第0页开始计数。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页返回，表示返回第几页的条目。从第0页开始计数。
     * @param Offset 分页返回，表示返回第几页的条目。从第0页开始计数。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页返回，表示每页有多少条目。取值为1-100。 
     * @return Limit 分页返回，表示每页有多少条目。取值为1-100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页返回，表示每页有多少条目。取值为1-100。
     * @param Limit 分页返回，表示每页有多少条目。取值为1-100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeDBXlogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBXlogsRequest(DescribeDBXlogsRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

