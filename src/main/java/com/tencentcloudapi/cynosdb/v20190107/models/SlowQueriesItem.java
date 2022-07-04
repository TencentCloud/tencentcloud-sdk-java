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

public class SlowQueriesItem extends AbstractModel{

    /**
    * 执行时间戳
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * 执行时长，单位秒
    */
    @SerializedName("QueryTime")
    @Expose
    private Float QueryTime;

    /**
    * sql语句
    */
    @SerializedName("SqlText")
    @Expose
    private String SqlText;

    /**
    * 客户端host
    */
    @SerializedName("UserHost")
    @Expose
    private String UserHost;

    /**
    * 用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 数据库名
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * 锁时长，单位秒
    */
    @SerializedName("LockTime")
    @Expose
    private Float LockTime;

    /**
    * 扫描行数
    */
    @SerializedName("RowsExamined")
    @Expose
    private Long RowsExamined;

    /**
    * 返回行数
    */
    @SerializedName("RowsSent")
    @Expose
    private Long RowsSent;

    /**
    * sql模版
    */
    @SerializedName("SqlTemplate")
    @Expose
    private String SqlTemplate;

    /**
    * sql语句md5
    */
    @SerializedName("SqlMd5")
    @Expose
    private String SqlMd5;

    /**
     * Get 执行时间戳 
     * @return Timestamp 执行时间戳
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 执行时间戳
     * @param Timestamp 执行时间戳
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 执行时长，单位秒 
     * @return QueryTime 执行时长，单位秒
     */
    public Float getQueryTime() {
        return this.QueryTime;
    }

    /**
     * Set 执行时长，单位秒
     * @param QueryTime 执行时长，单位秒
     */
    public void setQueryTime(Float QueryTime) {
        this.QueryTime = QueryTime;
    }

    /**
     * Get sql语句 
     * @return SqlText sql语句
     */
    public String getSqlText() {
        return this.SqlText;
    }

    /**
     * Set sql语句
     * @param SqlText sql语句
     */
    public void setSqlText(String SqlText) {
        this.SqlText = SqlText;
    }

    /**
     * Get 客户端host 
     * @return UserHost 客户端host
     */
    public String getUserHost() {
        return this.UserHost;
    }

    /**
     * Set 客户端host
     * @param UserHost 客户端host
     */
    public void setUserHost(String UserHost) {
        this.UserHost = UserHost;
    }

    /**
     * Get 用户名 
     * @return UserName 用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名
     * @param UserName 用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
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
     * Get 锁时长，单位秒 
     * @return LockTime 锁时长，单位秒
     */
    public Float getLockTime() {
        return this.LockTime;
    }

    /**
     * Set 锁时长，单位秒
     * @param LockTime 锁时长，单位秒
     */
    public void setLockTime(Float LockTime) {
        this.LockTime = LockTime;
    }

    /**
     * Get 扫描行数 
     * @return RowsExamined 扫描行数
     */
    public Long getRowsExamined() {
        return this.RowsExamined;
    }

    /**
     * Set 扫描行数
     * @param RowsExamined 扫描行数
     */
    public void setRowsExamined(Long RowsExamined) {
        this.RowsExamined = RowsExamined;
    }

    /**
     * Get 返回行数 
     * @return RowsSent 返回行数
     */
    public Long getRowsSent() {
        return this.RowsSent;
    }

    /**
     * Set 返回行数
     * @param RowsSent 返回行数
     */
    public void setRowsSent(Long RowsSent) {
        this.RowsSent = RowsSent;
    }

    /**
     * Get sql模版 
     * @return SqlTemplate sql模版
     */
    public String getSqlTemplate() {
        return this.SqlTemplate;
    }

    /**
     * Set sql模版
     * @param SqlTemplate sql模版
     */
    public void setSqlTemplate(String SqlTemplate) {
        this.SqlTemplate = SqlTemplate;
    }

    /**
     * Get sql语句md5 
     * @return SqlMd5 sql语句md5
     */
    public String getSqlMd5() {
        return this.SqlMd5;
    }

    /**
     * Set sql语句md5
     * @param SqlMd5 sql语句md5
     */
    public void setSqlMd5(String SqlMd5) {
        this.SqlMd5 = SqlMd5;
    }

    public SlowQueriesItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SlowQueriesItem(SlowQueriesItem source) {
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
        if (source.SqlMd5 != null) {
            this.SqlMd5 = new String(source.SqlMd5);
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
        this.setParamSimple(map, prefix + "SqlMd5", this.SqlMd5);

    }
}

