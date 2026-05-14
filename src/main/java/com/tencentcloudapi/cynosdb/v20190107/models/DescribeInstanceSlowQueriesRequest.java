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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceSlowQueriesRequest extends AbstractModel {

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>事务开始最早时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>事务开始最晚时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>限制条数</p><p>建议控制 limit 大小，当 limit 过大时，由于平台返回结果大小限制，可能会造成截断</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>偏移量</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>用户名</p>
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * <p>客户端host</p>
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * <p>数据库名</p>
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * <p>排序字段</p><p>枚举值：</p><ul><li>QueryTime： 按照 SQL 语句的总执行时长排序</li><li>LockTime： 按照 SQL 语句在等待锁（如表锁、行锁）上消耗的时间排序</li><li>RowsExamined： 按照 SQL 语句在执行过程中扫描的行数排序</li><li>RowsSent： 按照 SQL 语句最终返回给客户端的结果行数排序</li><li>Timestamp： 按照慢查询语句发生的时间戳排序</li></ul>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * <p>排序类型，可选值：asc,desc</p>
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
    * <p>sql语句</p>
    */
    @SerializedName("SqlText")
    @Expose
    private String SqlText;

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>事务开始最早时间</p> 
     * @return StartTime <p>事务开始最早时间</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>事务开始最早时间</p>
     * @param StartTime <p>事务开始最早时间</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>事务开始最晚时间</p> 
     * @return EndTime <p>事务开始最晚时间</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>事务开始最晚时间</p>
     * @param EndTime <p>事务开始最晚时间</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>限制条数</p><p>建议控制 limit 大小，当 limit 过大时，由于平台返回结果大小限制，可能会造成截断</p> 
     * @return Limit <p>限制条数</p><p>建议控制 limit 大小，当 limit 过大时，由于平台返回结果大小限制，可能会造成截断</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>限制条数</p><p>建议控制 limit 大小，当 limit 过大时，由于平台返回结果大小限制，可能会造成截断</p>
     * @param Limit <p>限制条数</p><p>建议控制 limit 大小，当 limit 过大时，由于平台返回结果大小限制，可能会造成截断</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>偏移量</p> 
     * @return Offset <p>偏移量</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量</p>
     * @param Offset <p>偏移量</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>用户名</p> 
     * @return Username <p>用户名</p>
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set <p>用户名</p>
     * @param Username <p>用户名</p>
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get <p>客户端host</p> 
     * @return Host <p>客户端host</p>
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set <p>客户端host</p>
     * @param Host <p>客户端host</p>
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get <p>数据库名</p> 
     * @return Database <p>数据库名</p>
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set <p>数据库名</p>
     * @param Database <p>数据库名</p>
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get <p>排序字段</p><p>枚举值：</p><ul><li>QueryTime： 按照 SQL 语句的总执行时长排序</li><li>LockTime： 按照 SQL 语句在等待锁（如表锁、行锁）上消耗的时间排序</li><li>RowsExamined： 按照 SQL 语句在执行过程中扫描的行数排序</li><li>RowsSent： 按照 SQL 语句最终返回给客户端的结果行数排序</li><li>Timestamp： 按照慢查询语句发生的时间戳排序</li></ul> 
     * @return OrderBy <p>排序字段</p><p>枚举值：</p><ul><li>QueryTime： 按照 SQL 语句的总执行时长排序</li><li>LockTime： 按照 SQL 语句在等待锁（如表锁、行锁）上消耗的时间排序</li><li>RowsExamined： 按照 SQL 语句在执行过程中扫描的行数排序</li><li>RowsSent： 按照 SQL 语句最终返回给客户端的结果行数排序</li><li>Timestamp： 按照慢查询语句发生的时间戳排序</li></ul>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set <p>排序字段</p><p>枚举值：</p><ul><li>QueryTime： 按照 SQL 语句的总执行时长排序</li><li>LockTime： 按照 SQL 语句在等待锁（如表锁、行锁）上消耗的时间排序</li><li>RowsExamined： 按照 SQL 语句在执行过程中扫描的行数排序</li><li>RowsSent： 按照 SQL 语句最终返回给客户端的结果行数排序</li><li>Timestamp： 按照慢查询语句发生的时间戳排序</li></ul>
     * @param OrderBy <p>排序字段</p><p>枚举值：</p><ul><li>QueryTime： 按照 SQL 语句的总执行时长排序</li><li>LockTime： 按照 SQL 语句在等待锁（如表锁、行锁）上消耗的时间排序</li><li>RowsExamined： 按照 SQL 语句在执行过程中扫描的行数排序</li><li>RowsSent： 按照 SQL 语句最终返回给客户端的结果行数排序</li><li>Timestamp： 按照慢查询语句发生的时间戳排序</li></ul>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get <p>排序类型，可选值：asc,desc</p> 
     * @return OrderByType <p>排序类型，可选值：asc,desc</p>
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set <p>排序类型，可选值：asc,desc</p>
     * @param OrderByType <p>排序类型，可选值：asc,desc</p>
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Get <p>sql语句</p> 
     * @return SqlText <p>sql语句</p>
     */
    public String getSqlText() {
        return this.SqlText;
    }

    /**
     * Set <p>sql语句</p>
     * @param SqlText <p>sql语句</p>
     */
    public void setSqlText(String SqlText) {
        this.SqlText = SqlText;
    }

    public DescribeInstanceSlowQueriesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceSlowQueriesRequest(DescribeInstanceSlowQueriesRequest source) {
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
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderByType != null) {
            this.OrderByType = new String(source.OrderByType);
        }
        if (source.SqlText != null) {
            this.SqlText = new String(source.SqlText);
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
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);
        this.setParamSimple(map, prefix + "SqlText", this.SqlText);

    }
}

