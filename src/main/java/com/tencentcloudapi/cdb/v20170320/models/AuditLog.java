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
package com.tencentcloudapi.cdb.v20170320.models;

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
    * SQL 类型。
    */
    @SerializedName("SqlType")
    @Expose
    private String SqlType;

    /**
    * 审计策略名称，逐步下线。
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
    * SQL 语句。
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
    * 执行时间，微秒。
    */
    @SerializedName("ExecTime")
    @Expose
    private Long ExecTime;

    /**
    * 时间。
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
    * 返回行数。
    */
    @SerializedName("SentRows")
    @Expose
    private Long SentRows;

    /**
    * 线程ID。
    */
    @SerializedName("ThreadId")
    @Expose
    private Long ThreadId;

    /**
    * 扫描行数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckRows")
    @Expose
    private Long CheckRows;

    /**
    * cpu执行时间，微秒。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CpuTime")
    @Expose
    private Float CpuTime;

    /**
    * IO等待时间，微秒。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IoWaitTime")
    @Expose
    private Long IoWaitTime;

    /**
    * 锁等待时间，微秒。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LockWaitTime")
    @Expose
    private Long LockWaitTime;

    /**
    * 开始时间，与timestamp构成一个精确到纳秒的时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NsTime")
    @Expose
    private Long NsTime;

    /**
    * 事物持续时间，微秒。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TrxLivingTime")
    @Expose
    private Long TrxLivingTime;

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
     * Get SQL 类型。 
     * @return SqlType SQL 类型。
     */
    public String getSqlType() {
        return this.SqlType;
    }

    /**
     * Set SQL 类型。
     * @param SqlType SQL 类型。
     */
    public void setSqlType(String SqlType) {
        this.SqlType = SqlType;
    }

    /**
     * Get 审计策略名称，逐步下线。 
     * @return PolicyName 审计策略名称，逐步下线。
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set 审计策略名称，逐步下线。
     * @param PolicyName 审计策略名称，逐步下线。
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
     * Get SQL 语句。 
     * @return Sql SQL 语句。
     */
    public String getSql() {
        return this.Sql;
    }

    /**
     * Set SQL 语句。
     * @param Sql SQL 语句。
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
     * Get 执行时间，微秒。 
     * @return ExecTime 执行时间，微秒。
     */
    public Long getExecTime() {
        return this.ExecTime;
    }

    /**
     * Set 执行时间，微秒。
     * @param ExecTime 执行时间，微秒。
     */
    public void setExecTime(Long ExecTime) {
        this.ExecTime = ExecTime;
    }

    /**
     * Get 时间。 
     * @return Timestamp 时间。
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 时间。
     * @param Timestamp 时间。
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 返回行数。 
     * @return SentRows 返回行数。
     */
    public Long getSentRows() {
        return this.SentRows;
    }

    /**
     * Set 返回行数。
     * @param SentRows 返回行数。
     */
    public void setSentRows(Long SentRows) {
        this.SentRows = SentRows;
    }

    /**
     * Get 线程ID。 
     * @return ThreadId 线程ID。
     */
    public Long getThreadId() {
        return this.ThreadId;
    }

    /**
     * Set 线程ID。
     * @param ThreadId 线程ID。
     */
    public void setThreadId(Long ThreadId) {
        this.ThreadId = ThreadId;
    }

    /**
     * Get 扫描行数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckRows 扫描行数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCheckRows() {
        return this.CheckRows;
    }

    /**
     * Set 扫描行数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckRows 扫描行数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckRows(Long CheckRows) {
        this.CheckRows = CheckRows;
    }

    /**
     * Get cpu执行时间，微秒。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CpuTime cpu执行时间，微秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getCpuTime() {
        return this.CpuTime;
    }

    /**
     * Set cpu执行时间，微秒。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CpuTime cpu执行时间，微秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpuTime(Float CpuTime) {
        this.CpuTime = CpuTime;
    }

    /**
     * Get IO等待时间，微秒。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IoWaitTime IO等待时间，微秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIoWaitTime() {
        return this.IoWaitTime;
    }

    /**
     * Set IO等待时间，微秒。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IoWaitTime IO等待时间，微秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIoWaitTime(Long IoWaitTime) {
        this.IoWaitTime = IoWaitTime;
    }

    /**
     * Get 锁等待时间，微秒。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LockWaitTime 锁等待时间，微秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLockWaitTime() {
        return this.LockWaitTime;
    }

    /**
     * Set 锁等待时间，微秒。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LockWaitTime 锁等待时间，微秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLockWaitTime(Long LockWaitTime) {
        this.LockWaitTime = LockWaitTime;
    }

    /**
     * Get 开始时间，与timestamp构成一个精确到纳秒的时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NsTime 开始时间，与timestamp构成一个精确到纳秒的时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNsTime() {
        return this.NsTime;
    }

    /**
     * Set 开始时间，与timestamp构成一个精确到纳秒的时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param NsTime 开始时间，与timestamp构成一个精确到纳秒的时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNsTime(Long NsTime) {
        this.NsTime = NsTime;
    }

    /**
     * Get 事物持续时间，微秒。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TrxLivingTime 事物持续时间，微秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTrxLivingTime() {
        return this.TrxLivingTime;
    }

    /**
     * Set 事物持续时间，微秒。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TrxLivingTime 事物持续时间，微秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrxLivingTime(Long TrxLivingTime) {
        this.TrxLivingTime = TrxLivingTime;
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
        if (source.CheckRows != null) {
            this.CheckRows = new Long(source.CheckRows);
        }
        if (source.CpuTime != null) {
            this.CpuTime = new Float(source.CpuTime);
        }
        if (source.IoWaitTime != null) {
            this.IoWaitTime = new Long(source.IoWaitTime);
        }
        if (source.LockWaitTime != null) {
            this.LockWaitTime = new Long(source.LockWaitTime);
        }
        if (source.NsTime != null) {
            this.NsTime = new Long(source.NsTime);
        }
        if (source.TrxLivingTime != null) {
            this.TrxLivingTime = new Long(source.TrxLivingTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AffectRows", this.AffectRows);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "SqlType", this.SqlType);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "DBName", this.DBName);
        this.setParamSimple(map, prefix + "Sql", this.Sql);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "ExecTime", this.ExecTime);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "SentRows", this.SentRows);
        this.setParamSimple(map, prefix + "ThreadId", this.ThreadId);
        this.setParamSimple(map, prefix + "CheckRows", this.CheckRows);
        this.setParamSimple(map, prefix + "CpuTime", this.CpuTime);
        this.setParamSimple(map, prefix + "IoWaitTime", this.IoWaitTime);
        this.setParamSimple(map, prefix + "LockWaitTime", this.LockWaitTime);
        this.setParamSimple(map, prefix + "NsTime", this.NsTime);
        this.setParamSimple(map, prefix + "TrxLivingTime", this.TrxLivingTime);

    }
}

