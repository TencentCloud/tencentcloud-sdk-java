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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SlowLogItem extends AbstractModel {

    /**
    * Sql的执行时间。秒级时间戳。
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * Sql的执行时长（秒）。
    */
    @SerializedName("QueryTime")
    @Expose
    private Float QueryTime;

    /**
    * Sql语句。
    */
    @SerializedName("SqlText")
    @Expose
    private String SqlText;

    /**
    * 客户端地址。
    */
    @SerializedName("UserHost")
    @Expose
    private String UserHost;

    /**
    * 用户名。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 数据库名。
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * 锁时长（秒）。
    */
    @SerializedName("LockTime")
    @Expose
    private Float LockTime;

    /**
    * 扫描行数。
    */
    @SerializedName("RowsExamined")
    @Expose
    private Long RowsExamined;

    /**
    * 结果集行数。
    */
    @SerializedName("RowsSent")
    @Expose
    private Long RowsSent;

    /**
    * Sql模板。
    */
    @SerializedName("SqlTemplate")
    @Expose
    private String SqlTemplate;

    /**
    * Sql语句的md5。
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
     * Get Sql的执行时间。秒级时间戳。 
     * @return Timestamp Sql的执行时间。秒级时间戳。
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set Sql的执行时间。秒级时间戳。
     * @param Timestamp Sql的执行时间。秒级时间戳。
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get Sql的执行时长（秒）。 
     * @return QueryTime Sql的执行时长（秒）。
     */
    public Float getQueryTime() {
        return this.QueryTime;
    }

    /**
     * Set Sql的执行时长（秒）。
     * @param QueryTime Sql的执行时长（秒）。
     */
    public void setQueryTime(Float QueryTime) {
        this.QueryTime = QueryTime;
    }

    /**
     * Get Sql语句。 
     * @return SqlText Sql语句。
     */
    public String getSqlText() {
        return this.SqlText;
    }

    /**
     * Set Sql语句。
     * @param SqlText Sql语句。
     */
    public void setSqlText(String SqlText) {
        this.SqlText = SqlText;
    }

    /**
     * Get 客户端地址。 
     * @return UserHost 客户端地址。
     */
    public String getUserHost() {
        return this.UserHost;
    }

    /**
     * Set 客户端地址。
     * @param UserHost 客户端地址。
     */
    public void setUserHost(String UserHost) {
        this.UserHost = UserHost;
    }

    /**
     * Get 用户名。 
     * @return UserName 用户名。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名。
     * @param UserName 用户名。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 数据库名。 
     * @return Database 数据库名。
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set 数据库名。
     * @param Database 数据库名。
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get 锁时长（秒）。 
     * @return LockTime 锁时长（秒）。
     */
    public Float getLockTime() {
        return this.LockTime;
    }

    /**
     * Set 锁时长（秒）。
     * @param LockTime 锁时长（秒）。
     */
    public void setLockTime(Float LockTime) {
        this.LockTime = LockTime;
    }

    /**
     * Get 扫描行数。 
     * @return RowsExamined 扫描行数。
     */
    public Long getRowsExamined() {
        return this.RowsExamined;
    }

    /**
     * Set 扫描行数。
     * @param RowsExamined 扫描行数。
     */
    public void setRowsExamined(Long RowsExamined) {
        this.RowsExamined = RowsExamined;
    }

    /**
     * Get 结果集行数。 
     * @return RowsSent 结果集行数。
     */
    public Long getRowsSent() {
        return this.RowsSent;
    }

    /**
     * Set 结果集行数。
     * @param RowsSent 结果集行数。
     */
    public void setRowsSent(Long RowsSent) {
        this.RowsSent = RowsSent;
    }

    /**
     * Get Sql模板。 
     * @return SqlTemplate Sql模板。
     */
    public String getSqlTemplate() {
        return this.SqlTemplate;
    }

    /**
     * Set Sql模板。
     * @param SqlTemplate Sql模板。
     */
    public void setSqlTemplate(String SqlTemplate) {
        this.SqlTemplate = SqlTemplate;
    }

    /**
     * Get Sql语句的md5。 
     * @return Md5 Sql语句的md5。
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set Sql语句的md5。
     * @param Md5 Sql语句的md5。
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
    }

    public SlowLogItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SlowLogItem(SlowLogItem source) {
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.QueryTime != null) {
            this.QueryTime = new Float(source.QueryTime);
        }
        if (source.SqlText != null) {
            this.SqlText = new String(source.SqlText);
        }
        if (source.UserHost != null) {
            this.UserHost = new String(source.UserHost);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.LockTime != null) {
            this.LockTime = new Float(source.LockTime);
        }
        if (source.RowsExamined != null) {
            this.RowsExamined = new Long(source.RowsExamined);
        }
        if (source.RowsSent != null) {
            this.RowsSent = new Long(source.RowsSent);
        }
        if (source.SqlTemplate != null) {
            this.SqlTemplate = new String(source.SqlTemplate);
        }
        if (source.Md5 != null) {
            this.Md5 = new String(source.Md5);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "QueryTime", this.QueryTime);
        this.setParamSimple(map, prefix + "SqlText", this.SqlText);
        this.setParamSimple(map, prefix + "UserHost", this.UserHost);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "LockTime", this.LockTime);
        this.setParamSimple(map, prefix + "RowsExamined", this.RowsExamined);
        this.setParamSimple(map, prefix + "RowsSent", this.RowsSent);
        this.setParamSimple(map, prefix + "SqlTemplate", this.SqlTemplate);
        this.setParamSimple(map, prefix + "Md5", this.Md5);

    }
}

