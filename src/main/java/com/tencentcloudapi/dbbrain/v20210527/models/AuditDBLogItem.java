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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditDBLogItem extends AbstractModel {

    /**
    * <p>SQL 执行时间点（格式化字符串，yyyy-MM-dd HH:mm:ss）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
    * <p>集群 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>影响行数。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AffectRows")
    @Expose
    private Long AffectRows;

    /**
    * <p>扫描行数。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckRows")
    @Expose
    private Long CheckRows;

    /**
    * <p>CPU 耗时（微秒）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CpuTime")
    @Expose
    private Long CpuTime;

    /**
    * <p>后端 Set Host（源字段 dbHost）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SetHost")
    @Expose
    private String SetHost;

    /**
    * <p>SQL 执行所在的数据库名。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DBName")
    @Expose
    private String DBName;

    /**
    * <p>SQL 执行返回的错误码，0 表示成功。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrCode")
    @Expose
    private String ErrCode;

    /**
    * <p>SQL 执行耗时（微秒）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecTime")
    @Expose
    private Long ExecTime;

    /**
    * <p>客户端来源 IP。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * <p>Set 名称（源字段 instanceId）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SetName")
    @Expose
    private String SetName;

    /**
    * <p>IO 等待时间（微秒）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IoWaitTime")
    @Expose
    private Long IoWaitTime;

    /**
    * <p>锁等待时间（微秒）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LockWaitTime")
    @Expose
    private Long LockWaitTime;

    /**
    * <p>SQL 开始时间（纳秒级时间戳）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SqlStartTimeNs")
    @Expose
    private Long SqlStartTimeNs;

    /**
    * <p>查询 ID（用于关联查询）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueryId")
    @Expose
    private String QueryId;

    /**
    * <p>查询序号（同一事务内 SQL 的序列号）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueryNo")
    @Expose
    private Long QueryNo;

    /**
    * <p>返回行数（扫描结果集行数）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SentRows")
    @Expose
    private Long SentRows;

    /**
    * <p>执行的 SQL 语句原文。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Sql")
    @Expose
    private String Sql;

    /**
    * <p>SQL 模板 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SqlTemplateId")
    @Expose
    private String SqlTemplateId;

    /**
    * <p>SQL 类型（如 Select、Insert、Update、Delete 等）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SqlType")
    @Expose
    private String SqlType;

    /**
    * <p>涉及的表。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tables")
    @Expose
    private String Tables;

    /**
    * <p>线程 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ThreadId")
    @Expose
    private String ThreadId;

    /**
    * <p>SQL 开始时间（毫秒级时间戳）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SqlStartTime")
    @Expose
    private Long SqlStartTime;

    /**
    * <p>事务存活时间（微秒）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TrxLivingTime")
    @Expose
    private Long TrxLivingTime;

    /**
    * <p>执行 SQL 的数据库用户名。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * <p>事务 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TrxId")
    @Expose
    private String TrxId;

    /**
    * <p>内部 XID。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InternalXId")
    @Expose
    private String InternalXId;

    /**
    * <p>业务码（由业务侧 SQL 注释中 i/o/p 等 KV 提取）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BusinessCode")
    @Expose
    private String BusinessCode;

    /**
    * <p>网关流转耗时（毫秒），仅 LogType=All 时由 Gateway 日志关联后返回；LogType=DB 时该字段不下发。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowTime")
    @Expose
    private Long FlowTime;

    /**
     * Get <p>SQL 执行时间点（格式化字符串，yyyy-MM-dd HH:mm:ss）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Timestamp <p>SQL 执行时间点（格式化字符串，yyyy-MM-dd HH:mm:ss）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set <p>SQL 执行时间点（格式化字符串，yyyy-MM-dd HH:mm:ss）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Timestamp <p>SQL 执行时间点（格式化字符串，yyyy-MM-dd HH:mm:ss）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get <p>集群 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId <p>集群 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId <p>集群 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>影响行数。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AffectRows <p>影响行数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAffectRows() {
        return this.AffectRows;
    }

    /**
     * Set <p>影响行数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AffectRows <p>影响行数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAffectRows(Long AffectRows) {
        this.AffectRows = AffectRows;
    }

    /**
     * Get <p>扫描行数。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckRows <p>扫描行数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCheckRows() {
        return this.CheckRows;
    }

    /**
     * Set <p>扫描行数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckRows <p>扫描行数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckRows(Long CheckRows) {
        this.CheckRows = CheckRows;
    }

    /**
     * Get <p>CPU 耗时（微秒）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CpuTime <p>CPU 耗时（微秒）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCpuTime() {
        return this.CpuTime;
    }

    /**
     * Set <p>CPU 耗时（微秒）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CpuTime <p>CPU 耗时（微秒）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpuTime(Long CpuTime) {
        this.CpuTime = CpuTime;
    }

    /**
     * Get <p>后端 Set Host（源字段 dbHost）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SetHost <p>后端 Set Host（源字段 dbHost）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSetHost() {
        return this.SetHost;
    }

    /**
     * Set <p>后端 Set Host（源字段 dbHost）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SetHost <p>后端 Set Host（源字段 dbHost）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSetHost(String SetHost) {
        this.SetHost = SetHost;
    }

    /**
     * Get <p>SQL 执行所在的数据库名。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DBName <p>SQL 执行所在的数据库名。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDBName() {
        return this.DBName;
    }

    /**
     * Set <p>SQL 执行所在的数据库名。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DBName <p>SQL 执行所在的数据库名。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDBName(String DBName) {
        this.DBName = DBName;
    }

    /**
     * Get <p>SQL 执行返回的错误码，0 表示成功。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrCode <p>SQL 执行返回的错误码，0 表示成功。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set <p>SQL 执行返回的错误码，0 表示成功。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrCode <p>SQL 执行返回的错误码，0 表示成功。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrCode(String ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get <p>SQL 执行耗时（微秒）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecTime <p>SQL 执行耗时（微秒）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExecTime() {
        return this.ExecTime;
    }

    /**
     * Set <p>SQL 执行耗时（微秒）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecTime <p>SQL 执行耗时（微秒）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecTime(Long ExecTime) {
        this.ExecTime = ExecTime;
    }

    /**
     * Get <p>客户端来源 IP。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Host <p>客户端来源 IP。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set <p>客户端来源 IP。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Host <p>客户端来源 IP。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get <p>Set 名称（源字段 instanceId）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SetName <p>Set 名称（源字段 instanceId）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSetName() {
        return this.SetName;
    }

    /**
     * Set <p>Set 名称（源字段 instanceId）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SetName <p>Set 名称（源字段 instanceId）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSetName(String SetName) {
        this.SetName = SetName;
    }

    /**
     * Get <p>IO 等待时间（微秒）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IoWaitTime <p>IO 等待时间（微秒）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIoWaitTime() {
        return this.IoWaitTime;
    }

    /**
     * Set <p>IO 等待时间（微秒）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IoWaitTime <p>IO 等待时间（微秒）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIoWaitTime(Long IoWaitTime) {
        this.IoWaitTime = IoWaitTime;
    }

    /**
     * Get <p>锁等待时间（微秒）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LockWaitTime <p>锁等待时间（微秒）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLockWaitTime() {
        return this.LockWaitTime;
    }

    /**
     * Set <p>锁等待时间（微秒）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LockWaitTime <p>锁等待时间（微秒）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLockWaitTime(Long LockWaitTime) {
        this.LockWaitTime = LockWaitTime;
    }

    /**
     * Get <p>SQL 开始时间（纳秒级时间戳）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SqlStartTimeNs <p>SQL 开始时间（纳秒级时间戳）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSqlStartTimeNs() {
        return this.SqlStartTimeNs;
    }

    /**
     * Set <p>SQL 开始时间（纳秒级时间戳）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SqlStartTimeNs <p>SQL 开始时间（纳秒级时间戳）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSqlStartTimeNs(Long SqlStartTimeNs) {
        this.SqlStartTimeNs = SqlStartTimeNs;
    }

    /**
     * Get <p>查询 ID（用于关联查询）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueryId <p>查询 ID（用于关联查询）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQueryId() {
        return this.QueryId;
    }

    /**
     * Set <p>查询 ID（用于关联查询）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueryId <p>查询 ID（用于关联查询）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueryId(String QueryId) {
        this.QueryId = QueryId;
    }

    /**
     * Get <p>查询序号（同一事务内 SQL 的序列号）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueryNo <p>查询序号（同一事务内 SQL 的序列号）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getQueryNo() {
        return this.QueryNo;
    }

    /**
     * Set <p>查询序号（同一事务内 SQL 的序列号）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueryNo <p>查询序号（同一事务内 SQL 的序列号）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueryNo(Long QueryNo) {
        this.QueryNo = QueryNo;
    }

    /**
     * Get <p>返回行数（扫描结果集行数）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SentRows <p>返回行数（扫描结果集行数）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSentRows() {
        return this.SentRows;
    }

    /**
     * Set <p>返回行数（扫描结果集行数）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SentRows <p>返回行数（扫描结果集行数）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSentRows(Long SentRows) {
        this.SentRows = SentRows;
    }

    /**
     * Get <p>执行的 SQL 语句原文。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Sql <p>执行的 SQL 语句原文。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSql() {
        return this.Sql;
    }

    /**
     * Set <p>执行的 SQL 语句原文。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Sql <p>执行的 SQL 语句原文。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSql(String Sql) {
        this.Sql = Sql;
    }

    /**
     * Get <p>SQL 模板 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SqlTemplateId <p>SQL 模板 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSqlTemplateId() {
        return this.SqlTemplateId;
    }

    /**
     * Set <p>SQL 模板 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SqlTemplateId <p>SQL 模板 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSqlTemplateId(String SqlTemplateId) {
        this.SqlTemplateId = SqlTemplateId;
    }

    /**
     * Get <p>SQL 类型（如 Select、Insert、Update、Delete 等）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SqlType <p>SQL 类型（如 Select、Insert、Update、Delete 等）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSqlType() {
        return this.SqlType;
    }

    /**
     * Set <p>SQL 类型（如 Select、Insert、Update、Delete 等）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SqlType <p>SQL 类型（如 Select、Insert、Update、Delete 等）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSqlType(String SqlType) {
        this.SqlType = SqlType;
    }

    /**
     * Get <p>涉及的表。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tables <p>涉及的表。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTables() {
        return this.Tables;
    }

    /**
     * Set <p>涉及的表。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tables <p>涉及的表。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTables(String Tables) {
        this.Tables = Tables;
    }

    /**
     * Get <p>线程 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ThreadId <p>线程 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getThreadId() {
        return this.ThreadId;
    }

    /**
     * Set <p>线程 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ThreadId <p>线程 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setThreadId(String ThreadId) {
        this.ThreadId = ThreadId;
    }

    /**
     * Get <p>SQL 开始时间（毫秒级时间戳）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SqlStartTime <p>SQL 开始时间（毫秒级时间戳）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSqlStartTime() {
        return this.SqlStartTime;
    }

    /**
     * Set <p>SQL 开始时间（毫秒级时间戳）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SqlStartTime <p>SQL 开始时间（毫秒级时间戳）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSqlStartTime(Long SqlStartTime) {
        this.SqlStartTime = SqlStartTime;
    }

    /**
     * Get <p>事务存活时间（微秒）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TrxLivingTime <p>事务存活时间（微秒）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTrxLivingTime() {
        return this.TrxLivingTime;
    }

    /**
     * Set <p>事务存活时间（微秒）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TrxLivingTime <p>事务存活时间（微秒）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrxLivingTime(Long TrxLivingTime) {
        this.TrxLivingTime = TrxLivingTime;
    }

    /**
     * Get <p>执行 SQL 的数据库用户名。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return User <p>执行 SQL 的数据库用户名。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set <p>执行 SQL 的数据库用户名。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param User <p>执行 SQL 的数据库用户名。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get <p>事务 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TrxId <p>事务 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTrxId() {
        return this.TrxId;
    }

    /**
     * Set <p>事务 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TrxId <p>事务 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrxId(String TrxId) {
        this.TrxId = TrxId;
    }

    /**
     * Get <p>内部 XID。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InternalXId <p>内部 XID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInternalXId() {
        return this.InternalXId;
    }

    /**
     * Set <p>内部 XID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InternalXId <p>内部 XID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInternalXId(String InternalXId) {
        this.InternalXId = InternalXId;
    }

    /**
     * Get <p>业务码（由业务侧 SQL 注释中 i/o/p 等 KV 提取）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BusinessCode <p>业务码（由业务侧 SQL 注释中 i/o/p 等 KV 提取）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBusinessCode() {
        return this.BusinessCode;
    }

    /**
     * Set <p>业务码（由业务侧 SQL 注释中 i/o/p 等 KV 提取）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BusinessCode <p>业务码（由业务侧 SQL 注释中 i/o/p 等 KV 提取）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBusinessCode(String BusinessCode) {
        this.BusinessCode = BusinessCode;
    }

    /**
     * Get <p>网关流转耗时（毫秒），仅 LogType=All 时由 Gateway 日志关联后返回；LogType=DB 时该字段不下发。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowTime <p>网关流转耗时（毫秒），仅 LogType=All 时由 Gateway 日志关联后返回；LogType=DB 时该字段不下发。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFlowTime() {
        return this.FlowTime;
    }

    /**
     * Set <p>网关流转耗时（毫秒），仅 LogType=All 时由 Gateway 日志关联后返回；LogType=DB 时该字段不下发。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowTime <p>网关流转耗时（毫秒），仅 LogType=All 时由 Gateway 日志关联后返回；LogType=DB 时该字段不下发。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowTime(Long FlowTime) {
        this.FlowTime = FlowTime;
    }

    public AuditDBLogItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditDBLogItem(AuditDBLogItem source) {
        if (source.Timestamp != null) {
            this.Timestamp = new String(source.Timestamp);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.AffectRows != null) {
            this.AffectRows = new Long(source.AffectRows);
        }
        if (source.CheckRows != null) {
            this.CheckRows = new Long(source.CheckRows);
        }
        if (source.CpuTime != null) {
            this.CpuTime = new Long(source.CpuTime);
        }
        if (source.SetHost != null) {
            this.SetHost = new String(source.SetHost);
        }
        if (source.DBName != null) {
            this.DBName = new String(source.DBName);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new String(source.ErrCode);
        }
        if (source.ExecTime != null) {
            this.ExecTime = new Long(source.ExecTime);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.SetName != null) {
            this.SetName = new String(source.SetName);
        }
        if (source.IoWaitTime != null) {
            this.IoWaitTime = new Long(source.IoWaitTime);
        }
        if (source.LockWaitTime != null) {
            this.LockWaitTime = new Long(source.LockWaitTime);
        }
        if (source.SqlStartTimeNs != null) {
            this.SqlStartTimeNs = new Long(source.SqlStartTimeNs);
        }
        if (source.QueryId != null) {
            this.QueryId = new String(source.QueryId);
        }
        if (source.QueryNo != null) {
            this.QueryNo = new Long(source.QueryNo);
        }
        if (source.SentRows != null) {
            this.SentRows = new Long(source.SentRows);
        }
        if (source.Sql != null) {
            this.Sql = new String(source.Sql);
        }
        if (source.SqlTemplateId != null) {
            this.SqlTemplateId = new String(source.SqlTemplateId);
        }
        if (source.SqlType != null) {
            this.SqlType = new String(source.SqlType);
        }
        if (source.Tables != null) {
            this.Tables = new String(source.Tables);
        }
        if (source.ThreadId != null) {
            this.ThreadId = new String(source.ThreadId);
        }
        if (source.SqlStartTime != null) {
            this.SqlStartTime = new Long(source.SqlStartTime);
        }
        if (source.TrxLivingTime != null) {
            this.TrxLivingTime = new Long(source.TrxLivingTime);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.TrxId != null) {
            this.TrxId = new String(source.TrxId);
        }
        if (source.InternalXId != null) {
            this.InternalXId = new String(source.InternalXId);
        }
        if (source.BusinessCode != null) {
            this.BusinessCode = new String(source.BusinessCode);
        }
        if (source.FlowTime != null) {
            this.FlowTime = new Long(source.FlowTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "AffectRows", this.AffectRows);
        this.setParamSimple(map, prefix + "CheckRows", this.CheckRows);
        this.setParamSimple(map, prefix + "CpuTime", this.CpuTime);
        this.setParamSimple(map, prefix + "SetHost", this.SetHost);
        this.setParamSimple(map, prefix + "DBName", this.DBName);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "ExecTime", this.ExecTime);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "SetName", this.SetName);
        this.setParamSimple(map, prefix + "IoWaitTime", this.IoWaitTime);
        this.setParamSimple(map, prefix + "LockWaitTime", this.LockWaitTime);
        this.setParamSimple(map, prefix + "SqlStartTimeNs", this.SqlStartTimeNs);
        this.setParamSimple(map, prefix + "QueryId", this.QueryId);
        this.setParamSimple(map, prefix + "QueryNo", this.QueryNo);
        this.setParamSimple(map, prefix + "SentRows", this.SentRows);
        this.setParamSimple(map, prefix + "Sql", this.Sql);
        this.setParamSimple(map, prefix + "SqlTemplateId", this.SqlTemplateId);
        this.setParamSimple(map, prefix + "SqlType", this.SqlType);
        this.setParamSimple(map, prefix + "Tables", this.Tables);
        this.setParamSimple(map, prefix + "ThreadId", this.ThreadId);
        this.setParamSimple(map, prefix + "SqlStartTime", this.SqlStartTime);
        this.setParamSimple(map, prefix + "TrxLivingTime", this.TrxLivingTime);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "TrxId", this.TrxId);
        this.setParamSimple(map, prefix + "InternalXId", this.InternalXId);
        this.setParamSimple(map, prefix + "BusinessCode", this.BusinessCode);
        this.setParamSimple(map, prefix + "FlowTime", this.FlowTime);

    }
}

