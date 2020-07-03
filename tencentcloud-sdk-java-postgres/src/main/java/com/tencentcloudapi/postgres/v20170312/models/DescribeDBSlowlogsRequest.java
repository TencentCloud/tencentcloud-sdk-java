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

public class DescribeDBSlowlogsRequest extends AbstractModel{

    /**
    * 实例ID，形如postgres-lnp6j617
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 查询起始时间，形如2018-06-10 17:06:38，起始时间不得小于7天以前
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
    * 数据库名字
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 按照何种指标排序，取值为sum_calls或者sum_cost_time。sum_calls-总调用次数；sum_cost_time-总的花费时间
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 排序规则。desc-降序；asc-升序
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
    * 分页返回结果，每页最大返回数量，取值为1-100，默认20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页返回结果，返回结果的第几页，从0开始计数
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 实例ID，形如postgres-lnp6j617 
     * @return DBInstanceId 实例ID，形如postgres-lnp6j617
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set 实例ID，形如postgres-lnp6j617
     * @param DBInstanceId 实例ID，形如postgres-lnp6j617
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get 查询起始时间，形如2018-06-10 17:06:38，起始时间不得小于7天以前 
     * @return StartTime 查询起始时间，形如2018-06-10 17:06:38，起始时间不得小于7天以前
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询起始时间，形如2018-06-10 17:06:38，起始时间不得小于7天以前
     * @param StartTime 查询起始时间，形如2018-06-10 17:06:38，起始时间不得小于7天以前
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
     * Get 数据库名字 
     * @return DatabaseName 数据库名字
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 数据库名字
     * @param DatabaseName 数据库名字
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 按照何种指标排序，取值为sum_calls或者sum_cost_time。sum_calls-总调用次数；sum_cost_time-总的花费时间 
     * @return OrderBy 按照何种指标排序，取值为sum_calls或者sum_cost_time。sum_calls-总调用次数；sum_cost_time-总的花费时间
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 按照何种指标排序，取值为sum_calls或者sum_cost_time。sum_calls-总调用次数；sum_cost_time-总的花费时间
     * @param OrderBy 按照何种指标排序，取值为sum_calls或者sum_cost_time。sum_calls-总调用次数；sum_cost_time-总的花费时间
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 排序规则。desc-降序；asc-升序 
     * @return OrderByType 排序规则。desc-降序；asc-升序
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set 排序规则。desc-降序；asc-升序
     * @param OrderByType 排序规则。desc-降序；asc-升序
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Get 分页返回结果，每页最大返回数量，取值为1-100，默认20 
     * @return Limit 分页返回结果，每页最大返回数量，取值为1-100，默认20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页返回结果，每页最大返回数量，取值为1-100，默认20
     * @param Limit 分页返回结果，每页最大返回数量，取值为1-100，默认20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页返回结果，返回结果的第几页，从0开始计数 
     * @return Offset 分页返回结果，返回结果的第几页，从0开始计数
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页返回结果，返回结果的第几页，从0开始计数
     * @param Offset 分页返回结果，返回结果的第几页，从0开始计数
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

