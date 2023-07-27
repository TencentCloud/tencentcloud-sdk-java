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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportInstanceSlowQueriesRequest extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 事务开始最早时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 事务开始最晚时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 限制条数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 用户名
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * 客户端host
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 数据库名
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * 文件类型，可选值：csv, original
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 排序字段，可选值： QueryTime,LockTime,RowsExamined,RowsSent
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 排序类型，可选值：asc,desc
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

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
     * Get 事务开始最早时间 
     * @return StartTime 事务开始最早时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 事务开始最早时间
     * @param StartTime 事务开始最早时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 事务开始最晚时间 
     * @return EndTime 事务开始最晚时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 事务开始最晚时间
     * @param EndTime 事务开始最晚时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 限制条数 
     * @return Limit 限制条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制条数
     * @param Limit 限制条数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 用户名 
     * @return Username 用户名
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set 用户名
     * @param Username 用户名
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get 客户端host 
     * @return Host 客户端host
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 客户端host
     * @param Host 客户端host
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 数据库名 
     * @return Database 数据库名
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set 数据库名
     * @param Database 数据库名
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get 文件类型，可选值：csv, original 
     * @return FileType 文件类型，可选值：csv, original
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 文件类型，可选值：csv, original
     * @param FileType 文件类型，可选值：csv, original
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 排序字段，可选值： QueryTime,LockTime,RowsExamined,RowsSent 
     * @return OrderBy 排序字段，可选值： QueryTime,LockTime,RowsExamined,RowsSent
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序字段，可选值： QueryTime,LockTime,RowsExamined,RowsSent
     * @param OrderBy 排序字段，可选值： QueryTime,LockTime,RowsExamined,RowsSent
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 排序类型，可选值：asc,desc 
     * @return OrderByType 排序类型，可选值：asc,desc
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set 排序类型，可选值：asc,desc
     * @param OrderByType 排序类型，可选值：asc,desc
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    public ExportInstanceSlowQueriesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportInstanceSlowQueriesRequest(ExportInstanceSlowQueriesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
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
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderByType != null) {
            this.OrderByType = new String(source.OrderByType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);

    }
}

