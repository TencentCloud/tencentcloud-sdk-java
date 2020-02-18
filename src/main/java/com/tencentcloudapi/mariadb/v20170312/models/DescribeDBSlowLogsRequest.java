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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBSlowLogsRequest extends AbstractModel{

    /**
    * 实例 ID，形如：tdsql-ow728lmc。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 从结果的第几条数据开始返回
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回的结果条数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 查询的起始时间，形如2016-07-23 14:55:20
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询的结束时间，形如2016-08-22 14:55:20
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 要查询的具体数据库名称
    */
    @SerializedName("Db")
    @Expose
    private String Db;

    /**
    * 排序指标，取值为query_time_sum或者query_count
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 排序类型，desc或者asc
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
    * 是否查询从机的慢查询，0-主机; 1-从机
    */
    @SerializedName("Slave")
    @Expose
    private Long Slave;

    /**
     * Get 实例 ID，形如：tdsql-ow728lmc。 
     * @return InstanceId 实例 ID，形如：tdsql-ow728lmc。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID，形如：tdsql-ow728lmc。
     * @param InstanceId 实例 ID，形如：tdsql-ow728lmc。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 从结果的第几条数据开始返回 
     * @return Offset 从结果的第几条数据开始返回
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 从结果的第几条数据开始返回
     * @param Offset 从结果的第几条数据开始返回
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回的结果条数 
     * @return Limit 返回的结果条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回的结果条数
     * @param Limit 返回的结果条数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 查询的起始时间，形如2016-07-23 14:55:20 
     * @return StartTime 查询的起始时间，形如2016-07-23 14:55:20
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询的起始时间，形如2016-07-23 14:55:20
     * @param StartTime 查询的起始时间，形如2016-07-23 14:55:20
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询的结束时间，形如2016-08-22 14:55:20 
     * @return EndTime 查询的结束时间，形如2016-08-22 14:55:20
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询的结束时间，形如2016-08-22 14:55:20
     * @param EndTime 查询的结束时间，形如2016-08-22 14:55:20
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 要查询的具体数据库名称 
     * @return Db 要查询的具体数据库名称
     */
    public String getDb() {
        return this.Db;
    }

    /**
     * Set 要查询的具体数据库名称
     * @param Db 要查询的具体数据库名称
     */
    public void setDb(String Db) {
        this.Db = Db;
    }

    /**
     * Get 排序指标，取值为query_time_sum或者query_count 
     * @return OrderBy 排序指标，取值为query_time_sum或者query_count
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序指标，取值为query_time_sum或者query_count
     * @param OrderBy 排序指标，取值为query_time_sum或者query_count
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 排序类型，desc或者asc 
     * @return OrderByType 排序类型，desc或者asc
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set 排序类型，desc或者asc
     * @param OrderByType 排序类型，desc或者asc
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Get 是否查询从机的慢查询，0-主机; 1-从机 
     * @return Slave 是否查询从机的慢查询，0-主机; 1-从机
     */
    public Long getSlave() {
        return this.Slave;
    }

    /**
     * Set 是否查询从机的慢查询，0-主机; 1-从机
     * @param Slave 是否查询从机的慢查询，0-主机; 1-从机
     */
    public void setSlave(Long Slave) {
        this.Slave = Slave;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Db", this.Db);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);
        this.setParamSimple(map, prefix + "Slave", this.Slave);

    }
}

