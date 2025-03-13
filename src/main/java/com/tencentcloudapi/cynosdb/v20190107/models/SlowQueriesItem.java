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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SlowQueriesItem extends AbstractModel {

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
    * sql模板
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
    * 远程读取次数
数据库内核版本大于3.1.12
    */
    @SerializedName("SyncReadCountRemote")
    @Expose
    private Long SyncReadCountRemote;

    /**
    * 远程读取的字节数
数据库内核版本大于3.1.12
    */
    @SerializedName("SyncReadBytesRemote")
    @Expose
    private Long SyncReadBytesRemote;

    /**
    * 远程读取所花费的时间（微秒）
数据库内核版本大于3.1.12
    */
    @SerializedName("SyncReadTimeRemote")
    @Expose
    private Long SyncReadTimeRemote;

    /**
    * 远程写入次数
数据库内核版本大于3.1.12
    */
    @SerializedName("SyncWriteCountRemote")
    @Expose
    private Long SyncWriteCountRemote;

    /**
    * 远程写入的字节数。
数据库内核版本大于3.1.12
    */
    @SerializedName("SyncWriteBytesRemote")
    @Expose
    private Long SyncWriteBytesRemote;

    /**
    * 远程写入所花费的时间（微秒）。
数据库内核版本大于3.1.12
    */
    @SerializedName("SyncWriteTimeRemote")
    @Expose
    private Long SyncWriteTimeRemote;

    /**
    * 事务提交延迟（微秒）
数据库内核版本大于3.1.12
    */
    @SerializedName("TrxCommitDelay")
    @Expose
    private Long TrxCommitDelay;

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
     * Get sql模板 
     * @return SqlTemplate sql模板
     */
    public String getSqlTemplate() {
        return this.SqlTemplate;
    }

    /**
     * Set sql模板
     * @param SqlTemplate sql模板
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

    /**
     * Get 远程读取次数
数据库内核版本大于3.1.12 
     * @return SyncReadCountRemote 远程读取次数
数据库内核版本大于3.1.12
     */
    public Long getSyncReadCountRemote() {
        return this.SyncReadCountRemote;
    }

    /**
     * Set 远程读取次数
数据库内核版本大于3.1.12
     * @param SyncReadCountRemote 远程读取次数
数据库内核版本大于3.1.12
     */
    public void setSyncReadCountRemote(Long SyncReadCountRemote) {
        this.SyncReadCountRemote = SyncReadCountRemote;
    }

    /**
     * Get 远程读取的字节数
数据库内核版本大于3.1.12 
     * @return SyncReadBytesRemote 远程读取的字节数
数据库内核版本大于3.1.12
     */
    public Long getSyncReadBytesRemote() {
        return this.SyncReadBytesRemote;
    }

    /**
     * Set 远程读取的字节数
数据库内核版本大于3.1.12
     * @param SyncReadBytesRemote 远程读取的字节数
数据库内核版本大于3.1.12
     */
    public void setSyncReadBytesRemote(Long SyncReadBytesRemote) {
        this.SyncReadBytesRemote = SyncReadBytesRemote;
    }

    /**
     * Get 远程读取所花费的时间（微秒）
数据库内核版本大于3.1.12 
     * @return SyncReadTimeRemote 远程读取所花费的时间（微秒）
数据库内核版本大于3.1.12
     */
    public Long getSyncReadTimeRemote() {
        return this.SyncReadTimeRemote;
    }

    /**
     * Set 远程读取所花费的时间（微秒）
数据库内核版本大于3.1.12
     * @param SyncReadTimeRemote 远程读取所花费的时间（微秒）
数据库内核版本大于3.1.12
     */
    public void setSyncReadTimeRemote(Long SyncReadTimeRemote) {
        this.SyncReadTimeRemote = SyncReadTimeRemote;
    }

    /**
     * Get 远程写入次数
数据库内核版本大于3.1.12 
     * @return SyncWriteCountRemote 远程写入次数
数据库内核版本大于3.1.12
     */
    public Long getSyncWriteCountRemote() {
        return this.SyncWriteCountRemote;
    }

    /**
     * Set 远程写入次数
数据库内核版本大于3.1.12
     * @param SyncWriteCountRemote 远程写入次数
数据库内核版本大于3.1.12
     */
    public void setSyncWriteCountRemote(Long SyncWriteCountRemote) {
        this.SyncWriteCountRemote = SyncWriteCountRemote;
    }

    /**
     * Get 远程写入的字节数。
数据库内核版本大于3.1.12 
     * @return SyncWriteBytesRemote 远程写入的字节数。
数据库内核版本大于3.1.12
     */
    public Long getSyncWriteBytesRemote() {
        return this.SyncWriteBytesRemote;
    }

    /**
     * Set 远程写入的字节数。
数据库内核版本大于3.1.12
     * @param SyncWriteBytesRemote 远程写入的字节数。
数据库内核版本大于3.1.12
     */
    public void setSyncWriteBytesRemote(Long SyncWriteBytesRemote) {
        this.SyncWriteBytesRemote = SyncWriteBytesRemote;
    }

    /**
     * Get 远程写入所花费的时间（微秒）。
数据库内核版本大于3.1.12 
     * @return SyncWriteTimeRemote 远程写入所花费的时间（微秒）。
数据库内核版本大于3.1.12
     */
    public Long getSyncWriteTimeRemote() {
        return this.SyncWriteTimeRemote;
    }

    /**
     * Set 远程写入所花费的时间（微秒）。
数据库内核版本大于3.1.12
     * @param SyncWriteTimeRemote 远程写入所花费的时间（微秒）。
数据库内核版本大于3.1.12
     */
    public void setSyncWriteTimeRemote(Long SyncWriteTimeRemote) {
        this.SyncWriteTimeRemote = SyncWriteTimeRemote;
    }

    /**
     * Get 事务提交延迟（微秒）
数据库内核版本大于3.1.12 
     * @return TrxCommitDelay 事务提交延迟（微秒）
数据库内核版本大于3.1.12
     */
    public Long getTrxCommitDelay() {
        return this.TrxCommitDelay;
    }

    /**
     * Set 事务提交延迟（微秒）
数据库内核版本大于3.1.12
     * @param TrxCommitDelay 事务提交延迟（微秒）
数据库内核版本大于3.1.12
     */
    public void setTrxCommitDelay(Long TrxCommitDelay) {
        this.TrxCommitDelay = TrxCommitDelay;
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
        if (source.SyncReadCountRemote != null) {
            this.SyncReadCountRemote = new Long(source.SyncReadCountRemote);
        }
        if (source.SyncReadBytesRemote != null) {
            this.SyncReadBytesRemote = new Long(source.SyncReadBytesRemote);
        }
        if (source.SyncReadTimeRemote != null) {
            this.SyncReadTimeRemote = new Long(source.SyncReadTimeRemote);
        }
        if (source.SyncWriteCountRemote != null) {
            this.SyncWriteCountRemote = new Long(source.SyncWriteCountRemote);
        }
        if (source.SyncWriteBytesRemote != null) {
            this.SyncWriteBytesRemote = new Long(source.SyncWriteBytesRemote);
        }
        if (source.SyncWriteTimeRemote != null) {
            this.SyncWriteTimeRemote = new Long(source.SyncWriteTimeRemote);
        }
        if (source.TrxCommitDelay != null) {
            this.TrxCommitDelay = new Long(source.TrxCommitDelay);
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
        this.setParamSimple(map, prefix + "SyncReadCountRemote", this.SyncReadCountRemote);
        this.setParamSimple(map, prefix + "SyncReadBytesRemote", this.SyncReadBytesRemote);
        this.setParamSimple(map, prefix + "SyncReadTimeRemote", this.SyncReadTimeRemote);
        this.setParamSimple(map, prefix + "SyncWriteCountRemote", this.SyncWriteCountRemote);
        this.setParamSimple(map, prefix + "SyncWriteBytesRemote", this.SyncWriteBytesRemote);
        this.setParamSimple(map, prefix + "SyncWriteTimeRemote", this.SyncWriteTimeRemote);
        this.setParamSimple(map, prefix + "TrxCommitDelay", this.TrxCommitDelay);

    }
}

