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

public class DescribeSlowQueryListRequest extends AbstractModel{

    /**
    * 实例ID。
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 查询起始时间戳，格式 “YYYY-MM-DD HH:mm:ss” ，日志保留时间默认为7天，起始时间不能超出保留时间范围。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询结束时间戳，格式 “YYYY-MM-DD HH:mm:ss”。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 根据数据库名进行筛选，可以为空。
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 排序类型。升序asc、降序desc。默认为desc。
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
    * 排序维度。 可选参数，取值范围[SessionStartTime,Duration]，默认为SessionStartTime。
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 分页大小。取值范围[1,100],默认为20。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页偏移。取值范围[0,INF)，默认为0。
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
     * Get 查询起始时间戳，格式 “YYYY-MM-DD HH:mm:ss” ，日志保留时间默认为7天，起始时间不能超出保留时间范围。 
     * @return StartTime 查询起始时间戳，格式 “YYYY-MM-DD HH:mm:ss” ，日志保留时间默认为7天，起始时间不能超出保留时间范围。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询起始时间戳，格式 “YYYY-MM-DD HH:mm:ss” ，日志保留时间默认为7天，起始时间不能超出保留时间范围。
     * @param StartTime 查询起始时间戳，格式 “YYYY-MM-DD HH:mm:ss” ，日志保留时间默认为7天，起始时间不能超出保留时间范围。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询结束时间戳，格式 “YYYY-MM-DD HH:mm:ss”。 
     * @return EndTime 查询结束时间戳，格式 “YYYY-MM-DD HH:mm:ss”。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询结束时间戳，格式 “YYYY-MM-DD HH:mm:ss”。
     * @param EndTime 查询结束时间戳，格式 “YYYY-MM-DD HH:mm:ss”。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 根据数据库名进行筛选，可以为空。 
     * @return DatabaseName 根据数据库名进行筛选，可以为空。
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 根据数据库名进行筛选，可以为空。
     * @param DatabaseName 根据数据库名进行筛选，可以为空。
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 排序类型。升序asc、降序desc。默认为desc。 
     * @return OrderByType 排序类型。升序asc、降序desc。默认为desc。
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set 排序类型。升序asc、降序desc。默认为desc。
     * @param OrderByType 排序类型。升序asc、降序desc。默认为desc。
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Get 排序维度。 可选参数，取值范围[SessionStartTime,Duration]，默认为SessionStartTime。 
     * @return OrderBy 排序维度。 可选参数，取值范围[SessionStartTime,Duration]，默认为SessionStartTime。
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序维度。 可选参数，取值范围[SessionStartTime,Duration]，默认为SessionStartTime。
     * @param OrderBy 排序维度。 可选参数，取值范围[SessionStartTime,Duration]，默认为SessionStartTime。
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 分页大小。取值范围[1,100],默认为20。 
     * @return Limit 分页大小。取值范围[1,100],默认为20。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页大小。取值范围[1,100],默认为20。
     * @param Limit 分页大小。取值范围[1,100],默认为20。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页偏移。取值范围[0,INF)，默认为0。 
     * @return Offset 分页偏移。取值范围[0,INF)，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移。取值范围[0,INF)，默认为0。
     * @param Offset 分页偏移。取值范围[0,INF)，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeSlowQueryListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSlowQueryListRequest(DescribeSlowQueryListRequest source) {
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
        if (source.OrderByType != null) {
            this.OrderByType = new String(source.OrderByType);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
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
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

