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

public class AuditLog extends AbstractModel{

    /**
    * 影响行数。
    */
    @SerializedName("AffectRows")
    @Expose
    private Long AffectRows;

    /**
    * 错误码。
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * SQL类型。
    */
    @SerializedName("SqlType")
    @Expose
    private String SqlType;

    /**
    * 表名称。
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 实例名称。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 审计策略名称。
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * 数据库名称。
    */
    @SerializedName("DBName")
    @Expose
    private String DBName;

    /**
    * SQL语句。
    */
    @SerializedName("Sql")
    @Expose
    private String Sql;

    /**
    * 客户端地址。
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 用户名。
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 执行时间。
    */
    @SerializedName("ExecTime")
    @Expose
    private Long ExecTime;

    /**
    * 时间戳。
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
    * 发送行数。
    */
    @SerializedName("SentRows")
    @Expose
    private Long SentRows;

    /**
    * 执行线程ID。
    */
    @SerializedName("ThreadId")
    @Expose
    private Long ThreadId;

    /**
     * Get 影响行数。 
     * @return AffectRows 影响行数。
     */
    public Long getAffectRows() {
        return this.AffectRows;
    }

    /**
     * Set 影响行数。
     * @param AffectRows 影响行数。
     */
    public void setAffectRows(Long AffectRows) {
        this.AffectRows = AffectRows;
    }

    /**
     * Get 错误码。 
     * @return ErrCode 错误码。
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set 错误码。
     * @param ErrCode 错误码。
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get SQL类型。 
     * @return SqlType SQL类型。
     */
    public String getSqlType() {
        return this.SqlType;
    }

    /**
     * Set SQL类型。
     * @param SqlType SQL类型。
     */
    public void setSqlType(String SqlType) {
        this.SqlType = SqlType;
    }

    /**
     * Get 表名称。 
     * @return TableName 表名称。
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表名称。
     * @param TableName 表名称。
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 实例名称。 
     * @return InstanceName 实例名称。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称。
     * @param InstanceName 实例名称。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 审计策略名称。 
     * @return PolicyName 审计策略名称。
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set 审计策略名称。
     * @param PolicyName 审计策略名称。
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get 数据库名称。 
     * @return DBName 数据库名称。
     */
    public String getDBName() {
        return this.DBName;
    }

    /**
     * Set 数据库名称。
     * @param DBName 数据库名称。
     */
    public void setDBName(String DBName) {
        this.DBName = DBName;
    }

    /**
     * Get SQL语句。 
     * @return Sql SQL语句。
     */
    public String getSql() {
        return this.Sql;
    }

    /**
     * Set SQL语句。
     * @param Sql SQL语句。
     */
    public void setSql(String Sql) {
        this.Sql = Sql;
    }

    /**
     * Get 客户端地址。 
     * @return Host 客户端地址。
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 客户端地址。
     * @param Host 客户端地址。
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 用户名。 
     * @return User 用户名。
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 用户名。
     * @param User 用户名。
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get 执行时间。 
     * @return ExecTime 执行时间。
     */
    public Long getExecTime() {
        return this.ExecTime;
    }

    /**
     * Set 执行时间。
     * @param ExecTime 执行时间。
     */
    public void setExecTime(Long ExecTime) {
        this.ExecTime = ExecTime;
    }

    /**
     * Get 时间戳。 
     * @return Timestamp 时间戳。
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 时间戳。
     * @param Timestamp 时间戳。
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 发送行数。 
     * @return SentRows 发送行数。
     */
    public Long getSentRows() {
        return this.SentRows;
    }

    /**
     * Set 发送行数。
     * @param SentRows 发送行数。
     */
    public void setSentRows(Long SentRows) {
        this.SentRows = SentRows;
    }

    /**
     * Get 执行线程ID。 
     * @return ThreadId 执行线程ID。
     */
    public Long getThreadId() {
        return this.ThreadId;
    }

    /**
     * Set 执行线程ID。
     * @param ThreadId 执行线程ID。
     */
    public void setThreadId(Long ThreadId) {
        this.ThreadId = ThreadId;
    }

    public AuditLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditLog(AuditLog source) {
        if (source.AffectRows != null) {
            this.AffectRows = new Long(source.AffectRows);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new Long(source.ErrCode);
        }
        if (source.SqlType != null) {
            this.SqlType = new String(source.SqlType);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.DBName != null) {
            this.DBName = new String(source.DBName);
        }
        if (source.Sql != null) {
            this.Sql = new String(source.Sql);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.ExecTime != null) {
            this.ExecTime = new Long(source.ExecTime);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new String(source.Timestamp);
        }
        if (source.SentRows != null) {
            this.SentRows = new Long(source.SentRows);
        }
        if (source.ThreadId != null) {
            this.ThreadId = new Long(source.ThreadId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AffectRows", this.AffectRows);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "SqlType", this.SqlType);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "DBName", this.DBName);
        this.setParamSimple(map, prefix + "Sql", this.Sql);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "ExecTime", this.ExecTime);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "SentRows", this.SentRows);
        this.setParamSimple(map, prefix + "ThreadId", this.ThreadId);

    }
}

