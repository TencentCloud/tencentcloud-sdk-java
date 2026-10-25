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

public class BlockingChainNode extends AbstractModel {

    /**
    * <p>被阻塞会话 ID（对应 SQL Server sys.dm_exec_sessions.session_id，即 SPID）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlockedSessionId")
    @Expose
    private Long BlockedSessionId;

    /**
    * <p>被阻塞会话事务ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlockedTransactionId")
    @Expose
    private Long BlockedTransactionId;

    /**
    * <p>被阻塞会话等待时长（毫秒）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlockedWaitTimeMs")
    @Expose
    private Long BlockedWaitTimeMs;

    /**
    * <p>被阻塞会话正在等待的锁模式（SQL Server原生lock_mode枚举，常见取值：S、U、X、IS、IU、IX、SIU、SIX、UIX、Sch-S、Sch-M）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlockedLockMode")
    @Expose
    private String BlockedLockMode;

    /**
    * <p>被阻塞会话等待资源。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlockedWaitResource")
    @Expose
    private String BlockedWaitResource;

    /**
    * <p>被阻塞会话数据库用户。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlockedLoginName")
    @Expose
    private String BlockedLoginName;

    /**
    * <p>被阻塞会话客户端主机。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlockedHostName")
    @Expose
    private String BlockedHostName;

    /**
    * <p>被阻塞会话客户端应用名。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlockedClientApp")
    @Expose
    private String BlockedClientApp;

    /**
    * <p>被阻塞会话运行时状态（SQL Server sys.dm_exec_sessions.status 文本），常见取值：running / sleeping / suspended / background。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlockedStatus")
    @Expose
    private String BlockedStatus;

    /**
    * <p>被阻塞会话事务隔离级别（SQL Server 原生取值：read uncommitted / read committed / repeatable read / serializable / snapshot）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlockedIsolationLevel")
    @Expose
    private String BlockedIsolationLevel;

    /**
    * <p>被阻塞会话当前显式事务名（XEvent transactionname）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlockedTransactionName")
    @Expose
    private String BlockedTransactionName;

    /**
    * <p>被阻塞会话当前显式事务嵌套层数（XEvent trancount）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlockedTranCount")
    @Expose
    private Long BlockedTranCount;

    /**
    * <p>被阻塞会话显式事务 BEGIN TRAN 时刻（XEvent lasttranstarted，SQL Server 服务端本地时区的 ISO 8601 字符串，无时区后缀）。多语句事务场景下比 lastbatchstarted 更稳定。咨视值 1900-01-01T00:00:00 表示未知。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlockedLastTranStarted")
    @Expose
    private String BlockedLastTranStarted;

    /**
    * <p>被阻塞会话正在执行的 SQL 原文（对应 DBCC INPUTBUFFER 返回内容，单条最长 16KB，超长截断）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlockedInputBuffer")
    @Expose
    private String BlockedInputBuffer;

    /**
    * <p>被阻塞SQL归一化模板。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlockedSqlTemplate")
    @Expose
    private String BlockedSqlTemplate;

    /**
    * <p>被阻塞SQL模板MD5。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlockedSqlMd5")
    @Expose
    private String BlockedSqlMd5;

    /**
    * <p>根因分类（继承自所属报告的rootCause）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RootCause")
    @Expose
    private String RootCause;

    /**
    * <p>本节点上报事件时间（__time），格式：yyyy-MM-dd HH:mm:ss。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReportTime")
    @Expose
    private String ReportTime;

    /**
    * <p>本节点又阻塞的下级会话（可能为空）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Children")
    @Expose
    private BlockingChainNode [] Children;

    /**
     * Get <p>被阻塞会话 ID（对应 SQL Server sys.dm_exec_sessions.session_id，即 SPID）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockedSessionId <p>被阻塞会话 ID（对应 SQL Server sys.dm_exec_sessions.session_id，即 SPID）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBlockedSessionId() {
        return this.BlockedSessionId;
    }

    /**
     * Set <p>被阻塞会话 ID（对应 SQL Server sys.dm_exec_sessions.session_id，即 SPID）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockedSessionId <p>被阻塞会话 ID（对应 SQL Server sys.dm_exec_sessions.session_id，即 SPID）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlockedSessionId(Long BlockedSessionId) {
        this.BlockedSessionId = BlockedSessionId;
    }

    /**
     * Get <p>被阻塞会话事务ID。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockedTransactionId <p>被阻塞会话事务ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBlockedTransactionId() {
        return this.BlockedTransactionId;
    }

    /**
     * Set <p>被阻塞会话事务ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockedTransactionId <p>被阻塞会话事务ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlockedTransactionId(Long BlockedTransactionId) {
        this.BlockedTransactionId = BlockedTransactionId;
    }

    /**
     * Get <p>被阻塞会话等待时长（毫秒）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockedWaitTimeMs <p>被阻塞会话等待时长（毫秒）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBlockedWaitTimeMs() {
        return this.BlockedWaitTimeMs;
    }

    /**
     * Set <p>被阻塞会话等待时长（毫秒）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockedWaitTimeMs <p>被阻塞会话等待时长（毫秒）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlockedWaitTimeMs(Long BlockedWaitTimeMs) {
        this.BlockedWaitTimeMs = BlockedWaitTimeMs;
    }

    /**
     * Get <p>被阻塞会话正在等待的锁模式（SQL Server原生lock_mode枚举，常见取值：S、U、X、IS、IU、IX、SIU、SIX、UIX、Sch-S、Sch-M）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockedLockMode <p>被阻塞会话正在等待的锁模式（SQL Server原生lock_mode枚举，常见取值：S、U、X、IS、IU、IX、SIU、SIX、UIX、Sch-S、Sch-M）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBlockedLockMode() {
        return this.BlockedLockMode;
    }

    /**
     * Set <p>被阻塞会话正在等待的锁模式（SQL Server原生lock_mode枚举，常见取值：S、U、X、IS、IU、IX、SIU、SIX、UIX、Sch-S、Sch-M）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockedLockMode <p>被阻塞会话正在等待的锁模式（SQL Server原生lock_mode枚举，常见取值：S、U、X、IS、IU、IX、SIU、SIX、UIX、Sch-S、Sch-M）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlockedLockMode(String BlockedLockMode) {
        this.BlockedLockMode = BlockedLockMode;
    }

    /**
     * Get <p>被阻塞会话等待资源。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockedWaitResource <p>被阻塞会话等待资源。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBlockedWaitResource() {
        return this.BlockedWaitResource;
    }

    /**
     * Set <p>被阻塞会话等待资源。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockedWaitResource <p>被阻塞会话等待资源。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlockedWaitResource(String BlockedWaitResource) {
        this.BlockedWaitResource = BlockedWaitResource;
    }

    /**
     * Get <p>被阻塞会话数据库用户。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockedLoginName <p>被阻塞会话数据库用户。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBlockedLoginName() {
        return this.BlockedLoginName;
    }

    /**
     * Set <p>被阻塞会话数据库用户。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockedLoginName <p>被阻塞会话数据库用户。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlockedLoginName(String BlockedLoginName) {
        this.BlockedLoginName = BlockedLoginName;
    }

    /**
     * Get <p>被阻塞会话客户端主机。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockedHostName <p>被阻塞会话客户端主机。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBlockedHostName() {
        return this.BlockedHostName;
    }

    /**
     * Set <p>被阻塞会话客户端主机。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockedHostName <p>被阻塞会话客户端主机。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlockedHostName(String BlockedHostName) {
        this.BlockedHostName = BlockedHostName;
    }

    /**
     * Get <p>被阻塞会话客户端应用名。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockedClientApp <p>被阻塞会话客户端应用名。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBlockedClientApp() {
        return this.BlockedClientApp;
    }

    /**
     * Set <p>被阻塞会话客户端应用名。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockedClientApp <p>被阻塞会话客户端应用名。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlockedClientApp(String BlockedClientApp) {
        this.BlockedClientApp = BlockedClientApp;
    }

    /**
     * Get <p>被阻塞会话运行时状态（SQL Server sys.dm_exec_sessions.status 文本），常见取值：running / sleeping / suspended / background。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockedStatus <p>被阻塞会话运行时状态（SQL Server sys.dm_exec_sessions.status 文本），常见取值：running / sleeping / suspended / background。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBlockedStatus() {
        return this.BlockedStatus;
    }

    /**
     * Set <p>被阻塞会话运行时状态（SQL Server sys.dm_exec_sessions.status 文本），常见取值：running / sleeping / suspended / background。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockedStatus <p>被阻塞会话运行时状态（SQL Server sys.dm_exec_sessions.status 文本），常见取值：running / sleeping / suspended / background。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlockedStatus(String BlockedStatus) {
        this.BlockedStatus = BlockedStatus;
    }

    /**
     * Get <p>被阻塞会话事务隔离级别（SQL Server 原生取值：read uncommitted / read committed / repeatable read / serializable / snapshot）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockedIsolationLevel <p>被阻塞会话事务隔离级别（SQL Server 原生取值：read uncommitted / read committed / repeatable read / serializable / snapshot）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBlockedIsolationLevel() {
        return this.BlockedIsolationLevel;
    }

    /**
     * Set <p>被阻塞会话事务隔离级别（SQL Server 原生取值：read uncommitted / read committed / repeatable read / serializable / snapshot）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockedIsolationLevel <p>被阻塞会话事务隔离级别（SQL Server 原生取值：read uncommitted / read committed / repeatable read / serializable / snapshot）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlockedIsolationLevel(String BlockedIsolationLevel) {
        this.BlockedIsolationLevel = BlockedIsolationLevel;
    }

    /**
     * Get <p>被阻塞会话当前显式事务名（XEvent transactionname）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockedTransactionName <p>被阻塞会话当前显式事务名（XEvent transactionname）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBlockedTransactionName() {
        return this.BlockedTransactionName;
    }

    /**
     * Set <p>被阻塞会话当前显式事务名（XEvent transactionname）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockedTransactionName <p>被阻塞会话当前显式事务名（XEvent transactionname）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlockedTransactionName(String BlockedTransactionName) {
        this.BlockedTransactionName = BlockedTransactionName;
    }

    /**
     * Get <p>被阻塞会话当前显式事务嵌套层数（XEvent trancount）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockedTranCount <p>被阻塞会话当前显式事务嵌套层数（XEvent trancount）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBlockedTranCount() {
        return this.BlockedTranCount;
    }

    /**
     * Set <p>被阻塞会话当前显式事务嵌套层数（XEvent trancount）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockedTranCount <p>被阻塞会话当前显式事务嵌套层数（XEvent trancount）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlockedTranCount(Long BlockedTranCount) {
        this.BlockedTranCount = BlockedTranCount;
    }

    /**
     * Get <p>被阻塞会话显式事务 BEGIN TRAN 时刻（XEvent lasttranstarted，SQL Server 服务端本地时区的 ISO 8601 字符串，无时区后缀）。多语句事务场景下比 lastbatchstarted 更稳定。咨视值 1900-01-01T00:00:00 表示未知。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockedLastTranStarted <p>被阻塞会话显式事务 BEGIN TRAN 时刻（XEvent lasttranstarted，SQL Server 服务端本地时区的 ISO 8601 字符串，无时区后缀）。多语句事务场景下比 lastbatchstarted 更稳定。咨视值 1900-01-01T00:00:00 表示未知。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBlockedLastTranStarted() {
        return this.BlockedLastTranStarted;
    }

    /**
     * Set <p>被阻塞会话显式事务 BEGIN TRAN 时刻（XEvent lasttranstarted，SQL Server 服务端本地时区的 ISO 8601 字符串，无时区后缀）。多语句事务场景下比 lastbatchstarted 更稳定。咨视值 1900-01-01T00:00:00 表示未知。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockedLastTranStarted <p>被阻塞会话显式事务 BEGIN TRAN 时刻（XEvent lasttranstarted，SQL Server 服务端本地时区的 ISO 8601 字符串，无时区后缀）。多语句事务场景下比 lastbatchstarted 更稳定。咨视值 1900-01-01T00:00:00 表示未知。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlockedLastTranStarted(String BlockedLastTranStarted) {
        this.BlockedLastTranStarted = BlockedLastTranStarted;
    }

    /**
     * Get <p>被阻塞会话正在执行的 SQL 原文（对应 DBCC INPUTBUFFER 返回内容，单条最长 16KB，超长截断）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockedInputBuffer <p>被阻塞会话正在执行的 SQL 原文（对应 DBCC INPUTBUFFER 返回内容，单条最长 16KB，超长截断）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBlockedInputBuffer() {
        return this.BlockedInputBuffer;
    }

    /**
     * Set <p>被阻塞会话正在执行的 SQL 原文（对应 DBCC INPUTBUFFER 返回内容，单条最长 16KB，超长截断）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockedInputBuffer <p>被阻塞会话正在执行的 SQL 原文（对应 DBCC INPUTBUFFER 返回内容，单条最长 16KB，超长截断）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlockedInputBuffer(String BlockedInputBuffer) {
        this.BlockedInputBuffer = BlockedInputBuffer;
    }

    /**
     * Get <p>被阻塞SQL归一化模板。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockedSqlTemplate <p>被阻塞SQL归一化模板。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBlockedSqlTemplate() {
        return this.BlockedSqlTemplate;
    }

    /**
     * Set <p>被阻塞SQL归一化模板。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockedSqlTemplate <p>被阻塞SQL归一化模板。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlockedSqlTemplate(String BlockedSqlTemplate) {
        this.BlockedSqlTemplate = BlockedSqlTemplate;
    }

    /**
     * Get <p>被阻塞SQL模板MD5。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockedSqlMd5 <p>被阻塞SQL模板MD5。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBlockedSqlMd5() {
        return this.BlockedSqlMd5;
    }

    /**
     * Set <p>被阻塞SQL模板MD5。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockedSqlMd5 <p>被阻塞SQL模板MD5。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlockedSqlMd5(String BlockedSqlMd5) {
        this.BlockedSqlMd5 = BlockedSqlMd5;
    }

    /**
     * Get <p>根因分类（继承自所属报告的rootCause）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RootCause <p>根因分类（继承自所属报告的rootCause）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRootCause() {
        return this.RootCause;
    }

    /**
     * Set <p>根因分类（继承自所属报告的rootCause）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RootCause <p>根因分类（继承自所属报告的rootCause）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRootCause(String RootCause) {
        this.RootCause = RootCause;
    }

    /**
     * Get <p>本节点上报事件时间（__time），格式：yyyy-MM-dd HH:mm:ss。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReportTime <p>本节点上报事件时间（__time），格式：yyyy-MM-dd HH:mm:ss。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReportTime() {
        return this.ReportTime;
    }

    /**
     * Set <p>本节点上报事件时间（__time），格式：yyyy-MM-dd HH:mm:ss。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReportTime <p>本节点上报事件时间（__time），格式：yyyy-MM-dd HH:mm:ss。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReportTime(String ReportTime) {
        this.ReportTime = ReportTime;
    }

    /**
     * Get <p>本节点又阻塞的下级会话（可能为空）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Children <p>本节点又阻塞的下级会话（可能为空）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockingChainNode [] getChildren() {
        return this.Children;
    }

    /**
     * Set <p>本节点又阻塞的下级会话（可能为空）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Children <p>本节点又阻塞的下级会话（可能为空）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChildren(BlockingChainNode [] Children) {
        this.Children = Children;
    }

    public BlockingChainNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BlockingChainNode(BlockingChainNode source) {
        if (source.BlockedSessionId != null) {
            this.BlockedSessionId = new Long(source.BlockedSessionId);
        }
        if (source.BlockedTransactionId != null) {
            this.BlockedTransactionId = new Long(source.BlockedTransactionId);
        }
        if (source.BlockedWaitTimeMs != null) {
            this.BlockedWaitTimeMs = new Long(source.BlockedWaitTimeMs);
        }
        if (source.BlockedLockMode != null) {
            this.BlockedLockMode = new String(source.BlockedLockMode);
        }
        if (source.BlockedWaitResource != null) {
            this.BlockedWaitResource = new String(source.BlockedWaitResource);
        }
        if (source.BlockedLoginName != null) {
            this.BlockedLoginName = new String(source.BlockedLoginName);
        }
        if (source.BlockedHostName != null) {
            this.BlockedHostName = new String(source.BlockedHostName);
        }
        if (source.BlockedClientApp != null) {
            this.BlockedClientApp = new String(source.BlockedClientApp);
        }
        if (source.BlockedStatus != null) {
            this.BlockedStatus = new String(source.BlockedStatus);
        }
        if (source.BlockedIsolationLevel != null) {
            this.BlockedIsolationLevel = new String(source.BlockedIsolationLevel);
        }
        if (source.BlockedTransactionName != null) {
            this.BlockedTransactionName = new String(source.BlockedTransactionName);
        }
        if (source.BlockedTranCount != null) {
            this.BlockedTranCount = new Long(source.BlockedTranCount);
        }
        if (source.BlockedLastTranStarted != null) {
            this.BlockedLastTranStarted = new String(source.BlockedLastTranStarted);
        }
        if (source.BlockedInputBuffer != null) {
            this.BlockedInputBuffer = new String(source.BlockedInputBuffer);
        }
        if (source.BlockedSqlTemplate != null) {
            this.BlockedSqlTemplate = new String(source.BlockedSqlTemplate);
        }
        if (source.BlockedSqlMd5 != null) {
            this.BlockedSqlMd5 = new String(source.BlockedSqlMd5);
        }
        if (source.RootCause != null) {
            this.RootCause = new String(source.RootCause);
        }
        if (source.ReportTime != null) {
            this.ReportTime = new String(source.ReportTime);
        }
        if (source.Children != null) {
            this.Children = new BlockingChainNode[source.Children.length];
            for (int i = 0; i < source.Children.length; i++) {
                this.Children[i] = new BlockingChainNode(source.Children[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BlockedSessionId", this.BlockedSessionId);
        this.setParamSimple(map, prefix + "BlockedTransactionId", this.BlockedTransactionId);
        this.setParamSimple(map, prefix + "BlockedWaitTimeMs", this.BlockedWaitTimeMs);
        this.setParamSimple(map, prefix + "BlockedLockMode", this.BlockedLockMode);
        this.setParamSimple(map, prefix + "BlockedWaitResource", this.BlockedWaitResource);
        this.setParamSimple(map, prefix + "BlockedLoginName", this.BlockedLoginName);
        this.setParamSimple(map, prefix + "BlockedHostName", this.BlockedHostName);
        this.setParamSimple(map, prefix + "BlockedClientApp", this.BlockedClientApp);
        this.setParamSimple(map, prefix + "BlockedStatus", this.BlockedStatus);
        this.setParamSimple(map, prefix + "BlockedIsolationLevel", this.BlockedIsolationLevel);
        this.setParamSimple(map, prefix + "BlockedTransactionName", this.BlockedTransactionName);
        this.setParamSimple(map, prefix + "BlockedTranCount", this.BlockedTranCount);
        this.setParamSimple(map, prefix + "BlockedLastTranStarted", this.BlockedLastTranStarted);
        this.setParamSimple(map, prefix + "BlockedInputBuffer", this.BlockedInputBuffer);
        this.setParamSimple(map, prefix + "BlockedSqlTemplate", this.BlockedSqlTemplate);
        this.setParamSimple(map, prefix + "BlockedSqlMd5", this.BlockedSqlMd5);
        this.setParamSimple(map, prefix + "RootCause", this.RootCause);
        this.setParamSimple(map, prefix + "ReportTime", this.ReportTime);
        this.setParamArrayObj(map, prefix + "Children.", this.Children);

    }
}

