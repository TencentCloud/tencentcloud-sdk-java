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

public class BlockingChainTree extends AbstractModel {

    /**
    * <p>监控轮次ID（同一实例内唯一标识一次采集快照，同一快照可包含多棵独立阻塞树）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MonitorLoop")
    @Expose
    private String MonitorLoop;

    /**
    * <p>阻塞发生所在的数据库名称（整条链路隶属同一 database，放在树级返回一次即可）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * <p>头阻塞会话ID（对应 SQL Server sys.dm_exec_sessions.session_id，即 SPID）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlockingSessionId")
    @Expose
    private Long BlockingSessionId;

    /**
    * <p>头阻塞会话事务ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlockingTransactionId")
    @Expose
    private Long BlockingTransactionId;

    /**
    * <p>头阻塞会话数据库用户。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlockingLoginName")
    @Expose
    private String BlockingLoginName;

    /**
    * <p>头阻塞会话客户端主机。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlockingHostName")
    @Expose
    private String BlockingHostName;

    /**
    * <p>头阻塞会话客户端应用名。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlockingClientApp")
    @Expose
    private String BlockingClientApp;

    /**
    * <p>头阻塞会话运行时状态（SQL Server sys.dm_exec_sessions.status 文本），常见取值：running / sleeping / suspended / background。sleeping + BlockingTranCount&gt;0 是 C2_SLEEPING_UNCOMMITTED（休眠会话持未提交事务）的直接证据。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlockingStatus")
    @Expose
    private String BlockingStatus;

    /**
    * <p>头阻塞会话事务隔离级别（SQL Server 原生取值：read uncommitted / read committed / repeatable read / serializable / snapshot）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlockingIsolationLevel")
    @Expose
    private String BlockingIsolationLevel;

    /**
    * <p>头阻塞会话当前显式事务嵌套层数（XEvent trancount）。&gt;0 表示持有显式事务；与 BlockingStatus=sleeping 组合是 C2_SLEEPING_UNCOMMITTED（休眠会话持未提交事务）的直接证据。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlockingTranCount")
    @Expose
    private Long BlockingTranCount;

    /**
    * <p>头阻塞会话正在执行的 SQL 原文（对应 DBCC INPUTBUFFER 返回内容，单条最长 16KB，超长截断）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlockingInputBuffer")
    @Expose
    private String BlockingInputBuffer;

    /**
    * <p>头阻塞SQL归一化模板。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlockingSqlTemplate")
    @Expose
    private String BlockingSqlTemplate;

    /**
    * <p>头阻塞SQL模板MD5。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlockingSqlMd5")
    @Expose
    private String BlockingSqlMd5;

    /**
    * <p>头阻塞会话自身的等待时长（毫秒，来自XML blocking-process/process的waittime属性）。多数场景为0。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlockingWaitTimeMs")
    @Expose
    private Long BlockingWaitTimeMs;

    /**
    * <p>根因分类。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RootCause")
    @Expose
    private String RootCause;

    /**
    * <p>根因分类的可读中文描述（服务端已完成中文化，前端可直接展示；与 RootCause 代号一一对应；未识别或空值统一返回“未识别”）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RootCauseDesc")
    @Expose
    private String RootCauseDesc;

    /**
    * <p>该链路阻塞事件的起始时间（该树内__time最小值），格式：yyyy-MM-dd HH:mm:ss。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>该链路阻塞事件的结束时间（该树内__time最大值），格式：yyyy-MM-dd HH:mm:ss。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>该链路最长等待时长（毫秒），作为链路影响时长。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DurationMs")
    @Expose
    private Long DurationMs;

    /**
    * <p>该链路被阻塞会话数（等价于树节点数-1，即受影响会话数）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChainLength")
    @Expose
    private Long ChainLength;

    /**
    * <p>树深度（根节点为0，最长路径的深度）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChainDepth")
    @Expose
    private Long ChainDepth;

    /**
    * <p>被阻塞节点子树（可能为空，也可能多叉或多层）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Details")
    @Expose
    private BlockingChainNode [] Details;

    /**
     * Get <p>监控轮次ID（同一实例内唯一标识一次采集快照，同一快照可包含多棵独立阻塞树）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MonitorLoop <p>监控轮次ID（同一实例内唯一标识一次采集快照，同一快照可包含多棵独立阻塞树）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMonitorLoop() {
        return this.MonitorLoop;
    }

    /**
     * Set <p>监控轮次ID（同一实例内唯一标识一次采集快照，同一快照可包含多棵独立阻塞树）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MonitorLoop <p>监控轮次ID（同一实例内唯一标识一次采集快照，同一快照可包含多棵独立阻塞树）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMonitorLoop(String MonitorLoop) {
        this.MonitorLoop = MonitorLoop;
    }

    /**
     * Get <p>阻塞发生所在的数据库名称（整条链路隶属同一 database，放在树级返回一次即可）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseName <p>阻塞发生所在的数据库名称（整条链路隶属同一 database，放在树级返回一次即可）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set <p>阻塞发生所在的数据库名称（整条链路隶属同一 database，放在树级返回一次即可）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseName <p>阻塞发生所在的数据库名称（整条链路隶属同一 database，放在树级返回一次即可）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get <p>头阻塞会话ID（对应 SQL Server sys.dm_exec_sessions.session_id，即 SPID）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockingSessionId <p>头阻塞会话ID（对应 SQL Server sys.dm_exec_sessions.session_id，即 SPID）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBlockingSessionId() {
        return this.BlockingSessionId;
    }

    /**
     * Set <p>头阻塞会话ID（对应 SQL Server sys.dm_exec_sessions.session_id，即 SPID）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockingSessionId <p>头阻塞会话ID（对应 SQL Server sys.dm_exec_sessions.session_id，即 SPID）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlockingSessionId(Long BlockingSessionId) {
        this.BlockingSessionId = BlockingSessionId;
    }

    /**
     * Get <p>头阻塞会话事务ID。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockingTransactionId <p>头阻塞会话事务ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBlockingTransactionId() {
        return this.BlockingTransactionId;
    }

    /**
     * Set <p>头阻塞会话事务ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockingTransactionId <p>头阻塞会话事务ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlockingTransactionId(Long BlockingTransactionId) {
        this.BlockingTransactionId = BlockingTransactionId;
    }

    /**
     * Get <p>头阻塞会话数据库用户。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockingLoginName <p>头阻塞会话数据库用户。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBlockingLoginName() {
        return this.BlockingLoginName;
    }

    /**
     * Set <p>头阻塞会话数据库用户。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockingLoginName <p>头阻塞会话数据库用户。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlockingLoginName(String BlockingLoginName) {
        this.BlockingLoginName = BlockingLoginName;
    }

    /**
     * Get <p>头阻塞会话客户端主机。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockingHostName <p>头阻塞会话客户端主机。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBlockingHostName() {
        return this.BlockingHostName;
    }

    /**
     * Set <p>头阻塞会话客户端主机。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockingHostName <p>头阻塞会话客户端主机。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlockingHostName(String BlockingHostName) {
        this.BlockingHostName = BlockingHostName;
    }

    /**
     * Get <p>头阻塞会话客户端应用名。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockingClientApp <p>头阻塞会话客户端应用名。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBlockingClientApp() {
        return this.BlockingClientApp;
    }

    /**
     * Set <p>头阻塞会话客户端应用名。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockingClientApp <p>头阻塞会话客户端应用名。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlockingClientApp(String BlockingClientApp) {
        this.BlockingClientApp = BlockingClientApp;
    }

    /**
     * Get <p>头阻塞会话运行时状态（SQL Server sys.dm_exec_sessions.status 文本），常见取值：running / sleeping / suspended / background。sleeping + BlockingTranCount&gt;0 是 C2_SLEEPING_UNCOMMITTED（休眠会话持未提交事务）的直接证据。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockingStatus <p>头阻塞会话运行时状态（SQL Server sys.dm_exec_sessions.status 文本），常见取值：running / sleeping / suspended / background。sleeping + BlockingTranCount&gt;0 是 C2_SLEEPING_UNCOMMITTED（休眠会话持未提交事务）的直接证据。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBlockingStatus() {
        return this.BlockingStatus;
    }

    /**
     * Set <p>头阻塞会话运行时状态（SQL Server sys.dm_exec_sessions.status 文本），常见取值：running / sleeping / suspended / background。sleeping + BlockingTranCount&gt;0 是 C2_SLEEPING_UNCOMMITTED（休眠会话持未提交事务）的直接证据。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockingStatus <p>头阻塞会话运行时状态（SQL Server sys.dm_exec_sessions.status 文本），常见取值：running / sleeping / suspended / background。sleeping + BlockingTranCount&gt;0 是 C2_SLEEPING_UNCOMMITTED（休眠会话持未提交事务）的直接证据。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlockingStatus(String BlockingStatus) {
        this.BlockingStatus = BlockingStatus;
    }

    /**
     * Get <p>头阻塞会话事务隔离级别（SQL Server 原生取值：read uncommitted / read committed / repeatable read / serializable / snapshot）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockingIsolationLevel <p>头阻塞会话事务隔离级别（SQL Server 原生取值：read uncommitted / read committed / repeatable read / serializable / snapshot）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBlockingIsolationLevel() {
        return this.BlockingIsolationLevel;
    }

    /**
     * Set <p>头阻塞会话事务隔离级别（SQL Server 原生取值：read uncommitted / read committed / repeatable read / serializable / snapshot）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockingIsolationLevel <p>头阻塞会话事务隔离级别（SQL Server 原生取值：read uncommitted / read committed / repeatable read / serializable / snapshot）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlockingIsolationLevel(String BlockingIsolationLevel) {
        this.BlockingIsolationLevel = BlockingIsolationLevel;
    }

    /**
     * Get <p>头阻塞会话当前显式事务嵌套层数（XEvent trancount）。&gt;0 表示持有显式事务；与 BlockingStatus=sleeping 组合是 C2_SLEEPING_UNCOMMITTED（休眠会话持未提交事务）的直接证据。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockingTranCount <p>头阻塞会话当前显式事务嵌套层数（XEvent trancount）。&gt;0 表示持有显式事务；与 BlockingStatus=sleeping 组合是 C2_SLEEPING_UNCOMMITTED（休眠会话持未提交事务）的直接证据。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBlockingTranCount() {
        return this.BlockingTranCount;
    }

    /**
     * Set <p>头阻塞会话当前显式事务嵌套层数（XEvent trancount）。&gt;0 表示持有显式事务；与 BlockingStatus=sleeping 组合是 C2_SLEEPING_UNCOMMITTED（休眠会话持未提交事务）的直接证据。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockingTranCount <p>头阻塞会话当前显式事务嵌套层数（XEvent trancount）。&gt;0 表示持有显式事务；与 BlockingStatus=sleeping 组合是 C2_SLEEPING_UNCOMMITTED（休眠会话持未提交事务）的直接证据。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlockingTranCount(Long BlockingTranCount) {
        this.BlockingTranCount = BlockingTranCount;
    }

    /**
     * Get <p>头阻塞会话正在执行的 SQL 原文（对应 DBCC INPUTBUFFER 返回内容，单条最长 16KB，超长截断）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockingInputBuffer <p>头阻塞会话正在执行的 SQL 原文（对应 DBCC INPUTBUFFER 返回内容，单条最长 16KB，超长截断）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBlockingInputBuffer() {
        return this.BlockingInputBuffer;
    }

    /**
     * Set <p>头阻塞会话正在执行的 SQL 原文（对应 DBCC INPUTBUFFER 返回内容，单条最长 16KB，超长截断）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockingInputBuffer <p>头阻塞会话正在执行的 SQL 原文（对应 DBCC INPUTBUFFER 返回内容，单条最长 16KB，超长截断）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlockingInputBuffer(String BlockingInputBuffer) {
        this.BlockingInputBuffer = BlockingInputBuffer;
    }

    /**
     * Get <p>头阻塞SQL归一化模板。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockingSqlTemplate <p>头阻塞SQL归一化模板。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBlockingSqlTemplate() {
        return this.BlockingSqlTemplate;
    }

    /**
     * Set <p>头阻塞SQL归一化模板。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockingSqlTemplate <p>头阻塞SQL归一化模板。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlockingSqlTemplate(String BlockingSqlTemplate) {
        this.BlockingSqlTemplate = BlockingSqlTemplate;
    }

    /**
     * Get <p>头阻塞SQL模板MD5。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockingSqlMd5 <p>头阻塞SQL模板MD5。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBlockingSqlMd5() {
        return this.BlockingSqlMd5;
    }

    /**
     * Set <p>头阻塞SQL模板MD5。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockingSqlMd5 <p>头阻塞SQL模板MD5。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlockingSqlMd5(String BlockingSqlMd5) {
        this.BlockingSqlMd5 = BlockingSqlMd5;
    }

    /**
     * Get <p>头阻塞会话自身的等待时长（毫秒，来自XML blocking-process/process的waittime属性）。多数场景为0。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockingWaitTimeMs <p>头阻塞会话自身的等待时长（毫秒，来自XML blocking-process/process的waittime属性）。多数场景为0。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBlockingWaitTimeMs() {
        return this.BlockingWaitTimeMs;
    }

    /**
     * Set <p>头阻塞会话自身的等待时长（毫秒，来自XML blocking-process/process的waittime属性）。多数场景为0。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockingWaitTimeMs <p>头阻塞会话自身的等待时长（毫秒，来自XML blocking-process/process的waittime属性）。多数场景为0。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlockingWaitTimeMs(Long BlockingWaitTimeMs) {
        this.BlockingWaitTimeMs = BlockingWaitTimeMs;
    }

    /**
     * Get <p>根因分类。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RootCause <p>根因分类。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRootCause() {
        return this.RootCause;
    }

    /**
     * Set <p>根因分类。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RootCause <p>根因分类。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRootCause(String RootCause) {
        this.RootCause = RootCause;
    }

    /**
     * Get <p>根因分类的可读中文描述（服务端已完成中文化，前端可直接展示；与 RootCause 代号一一对应；未识别或空值统一返回“未识别”）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RootCauseDesc <p>根因分类的可读中文描述（服务端已完成中文化，前端可直接展示；与 RootCause 代号一一对应；未识别或空值统一返回“未识别”）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRootCauseDesc() {
        return this.RootCauseDesc;
    }

    /**
     * Set <p>根因分类的可读中文描述（服务端已完成中文化，前端可直接展示；与 RootCause 代号一一对应；未识别或空值统一返回“未识别”）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RootCauseDesc <p>根因分类的可读中文描述（服务端已完成中文化，前端可直接展示；与 RootCause 代号一一对应；未识别或空值统一返回“未识别”）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRootCauseDesc(String RootCauseDesc) {
        this.RootCauseDesc = RootCauseDesc;
    }

    /**
     * Get <p>该链路阻塞事件的起始时间（该树内__time最小值），格式：yyyy-MM-dd HH:mm:ss。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime <p>该链路阻塞事件的起始时间（该树内__time最小值），格式：yyyy-MM-dd HH:mm:ss。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>该链路阻塞事件的起始时间（该树内__time最小值），格式：yyyy-MM-dd HH:mm:ss。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime <p>该链路阻塞事件的起始时间（该树内__time最小值），格式：yyyy-MM-dd HH:mm:ss。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>该链路阻塞事件的结束时间（该树内__time最大值），格式：yyyy-MM-dd HH:mm:ss。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime <p>该链路阻塞事件的结束时间（该树内__time最大值），格式：yyyy-MM-dd HH:mm:ss。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>该链路阻塞事件的结束时间（该树内__time最大值），格式：yyyy-MM-dd HH:mm:ss。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime <p>该链路阻塞事件的结束时间（该树内__time最大值），格式：yyyy-MM-dd HH:mm:ss。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>该链路最长等待时长（毫秒），作为链路影响时长。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DurationMs <p>该链路最长等待时长（毫秒），作为链路影响时长。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDurationMs() {
        return this.DurationMs;
    }

    /**
     * Set <p>该链路最长等待时长（毫秒），作为链路影响时长。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DurationMs <p>该链路最长等待时长（毫秒），作为链路影响时长。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDurationMs(Long DurationMs) {
        this.DurationMs = DurationMs;
    }

    /**
     * Get <p>该链路被阻塞会话数（等价于树节点数-1，即受影响会话数）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChainLength <p>该链路被阻塞会话数（等价于树节点数-1，即受影响会话数）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getChainLength() {
        return this.ChainLength;
    }

    /**
     * Set <p>该链路被阻塞会话数（等价于树节点数-1，即受影响会话数）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChainLength <p>该链路被阻塞会话数（等价于树节点数-1，即受影响会话数）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChainLength(Long ChainLength) {
        this.ChainLength = ChainLength;
    }

    /**
     * Get <p>树深度（根节点为0，最长路径的深度）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChainDepth <p>树深度（根节点为0，最长路径的深度）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getChainDepth() {
        return this.ChainDepth;
    }

    /**
     * Set <p>树深度（根节点为0，最长路径的深度）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChainDepth <p>树深度（根节点为0，最长路径的深度）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChainDepth(Long ChainDepth) {
        this.ChainDepth = ChainDepth;
    }

    /**
     * Get <p>被阻塞节点子树（可能为空，也可能多叉或多层）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Details <p>被阻塞节点子树（可能为空，也可能多叉或多层）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockingChainNode [] getDetails() {
        return this.Details;
    }

    /**
     * Set <p>被阻塞节点子树（可能为空，也可能多叉或多层）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Details <p>被阻塞节点子树（可能为空，也可能多叉或多层）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetails(BlockingChainNode [] Details) {
        this.Details = Details;
    }

    public BlockingChainTree() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BlockingChainTree(BlockingChainTree source) {
        if (source.MonitorLoop != null) {
            this.MonitorLoop = new String(source.MonitorLoop);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.BlockingSessionId != null) {
            this.BlockingSessionId = new Long(source.BlockingSessionId);
        }
        if (source.BlockingTransactionId != null) {
            this.BlockingTransactionId = new Long(source.BlockingTransactionId);
        }
        if (source.BlockingLoginName != null) {
            this.BlockingLoginName = new String(source.BlockingLoginName);
        }
        if (source.BlockingHostName != null) {
            this.BlockingHostName = new String(source.BlockingHostName);
        }
        if (source.BlockingClientApp != null) {
            this.BlockingClientApp = new String(source.BlockingClientApp);
        }
        if (source.BlockingStatus != null) {
            this.BlockingStatus = new String(source.BlockingStatus);
        }
        if (source.BlockingIsolationLevel != null) {
            this.BlockingIsolationLevel = new String(source.BlockingIsolationLevel);
        }
        if (source.BlockingTranCount != null) {
            this.BlockingTranCount = new Long(source.BlockingTranCount);
        }
        if (source.BlockingInputBuffer != null) {
            this.BlockingInputBuffer = new String(source.BlockingInputBuffer);
        }
        if (source.BlockingSqlTemplate != null) {
            this.BlockingSqlTemplate = new String(source.BlockingSqlTemplate);
        }
        if (source.BlockingSqlMd5 != null) {
            this.BlockingSqlMd5 = new String(source.BlockingSqlMd5);
        }
        if (source.BlockingWaitTimeMs != null) {
            this.BlockingWaitTimeMs = new Long(source.BlockingWaitTimeMs);
        }
        if (source.RootCause != null) {
            this.RootCause = new String(source.RootCause);
        }
        if (source.RootCauseDesc != null) {
            this.RootCauseDesc = new String(source.RootCauseDesc);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.DurationMs != null) {
            this.DurationMs = new Long(source.DurationMs);
        }
        if (source.ChainLength != null) {
            this.ChainLength = new Long(source.ChainLength);
        }
        if (source.ChainDepth != null) {
            this.ChainDepth = new Long(source.ChainDepth);
        }
        if (source.Details != null) {
            this.Details = new BlockingChainNode[source.Details.length];
            for (int i = 0; i < source.Details.length; i++) {
                this.Details[i] = new BlockingChainNode(source.Details[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MonitorLoop", this.MonitorLoop);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "BlockingSessionId", this.BlockingSessionId);
        this.setParamSimple(map, prefix + "BlockingTransactionId", this.BlockingTransactionId);
        this.setParamSimple(map, prefix + "BlockingLoginName", this.BlockingLoginName);
        this.setParamSimple(map, prefix + "BlockingHostName", this.BlockingHostName);
        this.setParamSimple(map, prefix + "BlockingClientApp", this.BlockingClientApp);
        this.setParamSimple(map, prefix + "BlockingStatus", this.BlockingStatus);
        this.setParamSimple(map, prefix + "BlockingIsolationLevel", this.BlockingIsolationLevel);
        this.setParamSimple(map, prefix + "BlockingTranCount", this.BlockingTranCount);
        this.setParamSimple(map, prefix + "BlockingInputBuffer", this.BlockingInputBuffer);
        this.setParamSimple(map, prefix + "BlockingSqlTemplate", this.BlockingSqlTemplate);
        this.setParamSimple(map, prefix + "BlockingSqlMd5", this.BlockingSqlMd5);
        this.setParamSimple(map, prefix + "BlockingWaitTimeMs", this.BlockingWaitTimeMs);
        this.setParamSimple(map, prefix + "RootCause", this.RootCause);
        this.setParamSimple(map, prefix + "RootCauseDesc", this.RootCauseDesc);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "DurationMs", this.DurationMs);
        this.setParamSimple(map, prefix + "ChainLength", this.ChainLength);
        this.setParamSimple(map, prefix + "ChainDepth", this.ChainDepth);
        this.setParamArrayObj(map, prefix + "Details.", this.Details);

    }
}

