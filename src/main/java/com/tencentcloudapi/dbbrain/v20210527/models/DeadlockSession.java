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

public class DeadlockSession extends AbstractModel {

    /**
    * <p>SQL 归一化后的指纹（SHA-1 前 16 位）。去掉字面量、注释、参数名、空白差异后计算，抗字面量差异，用于聚合相同 SQL 模板。SqlText 为空时为 null。</p>
    */
    @SerializedName("SqlFingerprint")
    @Expose
    private String SqlFingerprint;

    /**
    * <p>SQL Server 登录账号，用于权限归因。可判断是 SQLAgent、业务账号还是 DBA 账号。</p>
    */
    @SerializedName("LoginName")
    @Expose
    private String LoginName;

    /**
    * <p>会话执行栈帧列表（xml 的 executionStack.frame），用于定位到存储过程内的具体语句区间。partial 事件为空数组。</p>
    */
    @SerializedName("Frames")
    @Expose
    private DeadlockFrame [] Frames;

    /**
    * <p>事务隔离级别，例如 &#39;read committed (2)&#39;、&#39;repeatable read (3)&#39;、&#39;serializable (4)&#39; 等。显著影响锁形态和死锁模式。</p>
    */
    @SerializedName("IsolationLevel")
    @Expose
    private String IsolationLevel;

    /**
    * <p>进程状态。常见值：suspended（挂起等锁）/ running / background。判断是否运行中被检测终止。</p>
    */
    @SerializedName("ProcessStatus")
    @Expose
    private String ProcessStatus;

    /**
    * <p>客户端应用名（xml 的 clientapp）。判断连接来源，例如 SQLAgent Job、ORM、SSMS、业务服务名等。</p>
    */
    @SerializedName("ClientApp")
    @Expose
    private String ClientApp;

    /**
    * <p>会话的 DEADLOCK_PRIORITY 设置。-10 表示主动降级为牺牲者候选；10 表示优先级更高。可解释为何这一方成为牺牲品。</p>
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * <p>会话当前活跃的数据库名（xml 的 currentdbname）。</p>
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * <p>本进程当前持有的锁资源描述列表（死锁环的持有边）。格式同 LockRequest 但结尾为 &#39;holding&#39;。partial 事件为空数组。</p>
    */
    @SerializedName("LockHold")
    @Expose
    private String [] LockHold;

    /**
    * <p>会话最近执行的 SQL 文本（xml 的 InputBuf）。是 AI 诊断的主输入与 SqlFingerprint 的来源。</p>
    */
    @SerializedName("SqlText")
    @Expose
    private String SqlText;

    /**
    * <p>客户端主机的 IP 地址（点分十进制，来自 message.ip）。判断是否来自同一台机器、批处理源。</p>
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * <p>会话当前活跃的数据库 ID（xml 的 currentdb）。</p>
    */
    @SerializedName("DatabaseId")
    @Expose
    private Long DatabaseId;

    /**
    * <p>本事务是否为牺牲事务。true 表示 SQL Server 已回滚该事务；false 表示正常提交；null 表示 XML 缺 VictimProcessIds 无法判定。</p>
    */
    @SerializedName("IsVictim")
    @Expose
    private Boolean IsVictim;

    /**
    * <p>等锁时长，单位毫秒。判断死锁检测延迟、事务超时的辅助指标。</p>
    */
    @SerializedName("WaitTimeMs")
    @Expose
    private Long WaitTimeMs;

    /**
    * <p>事务开始时间（xml 里的 lasttranstarted，本地时间字符串，如 2026-09-16T14:58:23.840）。用于分析长事务、锁持有时长。</p>
    */
    @SerializedName("LastTransStarted")
    @Expose
    private String LastTransStarted;

    /**
    * <p>该边对应进程的并行执行子线程 ID。</p>
    */
    @SerializedName("ExecutionContextId")
    @Expose
    private Long ExecutionContextId;

    /**
    * <p>SQL Server 引擎内的进程指针，例如 process260256c7468。与 Resources.Owners/Waiters.ProcessId 拼接死锁环。partial 事件为 null。</p>
    */
    @SerializedName("ProcessId")
    @Expose
    private String ProcessId;

    /**
    * <p>归一化后的客户端应用名。去掉 SQLAgent 的 JobId（16-64 位十六进制串）、Step 号、GUID、末尾进程号等易变部分，用于按应用类别聚合。</p>
    */
    @SerializedName("ClientAppNormalized")
    @Expose
    private String ClientAppNormalized;

    /**
    * <p>本进程正在等待的锁资源描述列表（死锁环的等待边）。每条形如 &#39;keylock on tempdb.dbo.dl_a mode X waiting&#39;。applicationlock 会展示原始资源名（如 &#39;lock_a&#39;）。partial 事件为空数组。</p>
    */
    @SerializedName("LockRequest")
    @Expose
    private String [] LockRequest;

    /**
    * <p>SQL Server 会话 ID。日志排查主键。</p>
    */
    @SerializedName("SessionId")
    @Expose
    private Long SessionId;

    /**
     * Get <p>SQL 归一化后的指纹（SHA-1 前 16 位）。去掉字面量、注释、参数名、空白差异后计算，抗字面量差异，用于聚合相同 SQL 模板。SqlText 为空时为 null。</p> 
     * @return SqlFingerprint <p>SQL 归一化后的指纹（SHA-1 前 16 位）。去掉字面量、注释、参数名、空白差异后计算，抗字面量差异，用于聚合相同 SQL 模板。SqlText 为空时为 null。</p>
     */
    public String getSqlFingerprint() {
        return this.SqlFingerprint;
    }

    /**
     * Set <p>SQL 归一化后的指纹（SHA-1 前 16 位）。去掉字面量、注释、参数名、空白差异后计算，抗字面量差异，用于聚合相同 SQL 模板。SqlText 为空时为 null。</p>
     * @param SqlFingerprint <p>SQL 归一化后的指纹（SHA-1 前 16 位）。去掉字面量、注释、参数名、空白差异后计算，抗字面量差异，用于聚合相同 SQL 模板。SqlText 为空时为 null。</p>
     */
    public void setSqlFingerprint(String SqlFingerprint) {
        this.SqlFingerprint = SqlFingerprint;
    }

    /**
     * Get <p>SQL Server 登录账号，用于权限归因。可判断是 SQLAgent、业务账号还是 DBA 账号。</p> 
     * @return LoginName <p>SQL Server 登录账号，用于权限归因。可判断是 SQLAgent、业务账号还是 DBA 账号。</p>
     */
    public String getLoginName() {
        return this.LoginName;
    }

    /**
     * Set <p>SQL Server 登录账号，用于权限归因。可判断是 SQLAgent、业务账号还是 DBA 账号。</p>
     * @param LoginName <p>SQL Server 登录账号，用于权限归因。可判断是 SQLAgent、业务账号还是 DBA 账号。</p>
     */
    public void setLoginName(String LoginName) {
        this.LoginName = LoginName;
    }

    /**
     * Get <p>会话执行栈帧列表（xml 的 executionStack.frame），用于定位到存储过程内的具体语句区间。partial 事件为空数组。</p> 
     * @return Frames <p>会话执行栈帧列表（xml 的 executionStack.frame），用于定位到存储过程内的具体语句区间。partial 事件为空数组。</p>
     */
    public DeadlockFrame [] getFrames() {
        return this.Frames;
    }

    /**
     * Set <p>会话执行栈帧列表（xml 的 executionStack.frame），用于定位到存储过程内的具体语句区间。partial 事件为空数组。</p>
     * @param Frames <p>会话执行栈帧列表（xml 的 executionStack.frame），用于定位到存储过程内的具体语句区间。partial 事件为空数组。</p>
     */
    public void setFrames(DeadlockFrame [] Frames) {
        this.Frames = Frames;
    }

    /**
     * Get <p>事务隔离级别，例如 &#39;read committed (2)&#39;、&#39;repeatable read (3)&#39;、&#39;serializable (4)&#39; 等。显著影响锁形态和死锁模式。</p> 
     * @return IsolationLevel <p>事务隔离级别，例如 &#39;read committed (2)&#39;、&#39;repeatable read (3)&#39;、&#39;serializable (4)&#39; 等。显著影响锁形态和死锁模式。</p>
     */
    public String getIsolationLevel() {
        return this.IsolationLevel;
    }

    /**
     * Set <p>事务隔离级别，例如 &#39;read committed (2)&#39;、&#39;repeatable read (3)&#39;、&#39;serializable (4)&#39; 等。显著影响锁形态和死锁模式。</p>
     * @param IsolationLevel <p>事务隔离级别，例如 &#39;read committed (2)&#39;、&#39;repeatable read (3)&#39;、&#39;serializable (4)&#39; 等。显著影响锁形态和死锁模式。</p>
     */
    public void setIsolationLevel(String IsolationLevel) {
        this.IsolationLevel = IsolationLevel;
    }

    /**
     * Get <p>进程状态。常见值：suspended（挂起等锁）/ running / background。判断是否运行中被检测终止。</p> 
     * @return ProcessStatus <p>进程状态。常见值：suspended（挂起等锁）/ running / background。判断是否运行中被检测终止。</p>
     */
    public String getProcessStatus() {
        return this.ProcessStatus;
    }

    /**
     * Set <p>进程状态。常见值：suspended（挂起等锁）/ running / background。判断是否运行中被检测终止。</p>
     * @param ProcessStatus <p>进程状态。常见值：suspended（挂起等锁）/ running / background。判断是否运行中被检测终止。</p>
     */
    public void setProcessStatus(String ProcessStatus) {
        this.ProcessStatus = ProcessStatus;
    }

    /**
     * Get <p>客户端应用名（xml 的 clientapp）。判断连接来源，例如 SQLAgent Job、ORM、SSMS、业务服务名等。</p> 
     * @return ClientApp <p>客户端应用名（xml 的 clientapp）。判断连接来源，例如 SQLAgent Job、ORM、SSMS、业务服务名等。</p>
     */
    public String getClientApp() {
        return this.ClientApp;
    }

    /**
     * Set <p>客户端应用名（xml 的 clientapp）。判断连接来源，例如 SQLAgent Job、ORM、SSMS、业务服务名等。</p>
     * @param ClientApp <p>客户端应用名（xml 的 clientapp）。判断连接来源，例如 SQLAgent Job、ORM、SSMS、业务服务名等。</p>
     */
    public void setClientApp(String ClientApp) {
        this.ClientApp = ClientApp;
    }

    /**
     * Get <p>会话的 DEADLOCK_PRIORITY 设置。-10 表示主动降级为牺牲者候选；10 表示优先级更高。可解释为何这一方成为牺牲品。</p> 
     * @return Priority <p>会话的 DEADLOCK_PRIORITY 设置。-10 表示主动降级为牺牲者候选；10 表示优先级更高。可解释为何这一方成为牺牲品。</p>
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set <p>会话的 DEADLOCK_PRIORITY 设置。-10 表示主动降级为牺牲者候选；10 表示优先级更高。可解释为何这一方成为牺牲品。</p>
     * @param Priority <p>会话的 DEADLOCK_PRIORITY 设置。-10 表示主动降级为牺牲者候选；10 表示优先级更高。可解释为何这一方成为牺牲品。</p>
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get <p>会话当前活跃的数据库名（xml 的 currentdbname）。</p> 
     * @return DatabaseName <p>会话当前活跃的数据库名（xml 的 currentdbname）。</p>
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set <p>会话当前活跃的数据库名（xml 的 currentdbname）。</p>
     * @param DatabaseName <p>会话当前活跃的数据库名（xml 的 currentdbname）。</p>
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get <p>本进程当前持有的锁资源描述列表（死锁环的持有边）。格式同 LockRequest 但结尾为 &#39;holding&#39;。partial 事件为空数组。</p> 
     * @return LockHold <p>本进程当前持有的锁资源描述列表（死锁环的持有边）。格式同 LockRequest 但结尾为 &#39;holding&#39;。partial 事件为空数组。</p>
     */
    public String [] getLockHold() {
        return this.LockHold;
    }

    /**
     * Set <p>本进程当前持有的锁资源描述列表（死锁环的持有边）。格式同 LockRequest 但结尾为 &#39;holding&#39;。partial 事件为空数组。</p>
     * @param LockHold <p>本进程当前持有的锁资源描述列表（死锁环的持有边）。格式同 LockRequest 但结尾为 &#39;holding&#39;。partial 事件为空数组。</p>
     */
    public void setLockHold(String [] LockHold) {
        this.LockHold = LockHold;
    }

    /**
     * Get <p>会话最近执行的 SQL 文本（xml 的 InputBuf）。是 AI 诊断的主输入与 SqlFingerprint 的来源。</p> 
     * @return SqlText <p>会话最近执行的 SQL 文本（xml 的 InputBuf）。是 AI 诊断的主输入与 SqlFingerprint 的来源。</p>
     */
    public String getSqlText() {
        return this.SqlText;
    }

    /**
     * Set <p>会话最近执行的 SQL 文本（xml 的 InputBuf）。是 AI 诊断的主输入与 SqlFingerprint 的来源。</p>
     * @param SqlText <p>会话最近执行的 SQL 文本（xml 的 InputBuf）。是 AI 诊断的主输入与 SqlFingerprint 的来源。</p>
     */
    public void setSqlText(String SqlText) {
        this.SqlText = SqlText;
    }

    /**
     * Get <p>客户端主机的 IP 地址（点分十进制，来自 message.ip）。判断是否来自同一台机器、批处理源。</p> 
     * @return Host <p>客户端主机的 IP 地址（点分十进制，来自 message.ip）。判断是否来自同一台机器、批处理源。</p>
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set <p>客户端主机的 IP 地址（点分十进制，来自 message.ip）。判断是否来自同一台机器、批处理源。</p>
     * @param Host <p>客户端主机的 IP 地址（点分十进制，来自 message.ip）。判断是否来自同一台机器、批处理源。</p>
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get <p>会话当前活跃的数据库 ID（xml 的 currentdb）。</p> 
     * @return DatabaseId <p>会话当前活跃的数据库 ID（xml 的 currentdb）。</p>
     */
    public Long getDatabaseId() {
        return this.DatabaseId;
    }

    /**
     * Set <p>会话当前活跃的数据库 ID（xml 的 currentdb）。</p>
     * @param DatabaseId <p>会话当前活跃的数据库 ID（xml 的 currentdb）。</p>
     */
    public void setDatabaseId(Long DatabaseId) {
        this.DatabaseId = DatabaseId;
    }

    /**
     * Get <p>本事务是否为牺牲事务。true 表示 SQL Server 已回滚该事务；false 表示正常提交；null 表示 XML 缺 VictimProcessIds 无法判定。</p> 
     * @return IsVictim <p>本事务是否为牺牲事务。true 表示 SQL Server 已回滚该事务；false 表示正常提交；null 表示 XML 缺 VictimProcessIds 无法判定。</p>
     */
    public Boolean getIsVictim() {
        return this.IsVictim;
    }

    /**
     * Set <p>本事务是否为牺牲事务。true 表示 SQL Server 已回滚该事务；false 表示正常提交；null 表示 XML 缺 VictimProcessIds 无法判定。</p>
     * @param IsVictim <p>本事务是否为牺牲事务。true 表示 SQL Server 已回滚该事务；false 表示正常提交；null 表示 XML 缺 VictimProcessIds 无法判定。</p>
     */
    public void setIsVictim(Boolean IsVictim) {
        this.IsVictim = IsVictim;
    }

    /**
     * Get <p>等锁时长，单位毫秒。判断死锁检测延迟、事务超时的辅助指标。</p> 
     * @return WaitTimeMs <p>等锁时长，单位毫秒。判断死锁检测延迟、事务超时的辅助指标。</p>
     */
    public Long getWaitTimeMs() {
        return this.WaitTimeMs;
    }

    /**
     * Set <p>等锁时长，单位毫秒。判断死锁检测延迟、事务超时的辅助指标。</p>
     * @param WaitTimeMs <p>等锁时长，单位毫秒。判断死锁检测延迟、事务超时的辅助指标。</p>
     */
    public void setWaitTimeMs(Long WaitTimeMs) {
        this.WaitTimeMs = WaitTimeMs;
    }

    /**
     * Get <p>事务开始时间（xml 里的 lasttranstarted，本地时间字符串，如 2026-09-16T14:58:23.840）。用于分析长事务、锁持有时长。</p> 
     * @return LastTransStarted <p>事务开始时间（xml 里的 lasttranstarted，本地时间字符串，如 2026-09-16T14:58:23.840）。用于分析长事务、锁持有时长。</p>
     */
    public String getLastTransStarted() {
        return this.LastTransStarted;
    }

    /**
     * Set <p>事务开始时间（xml 里的 lasttranstarted，本地时间字符串，如 2026-09-16T14:58:23.840）。用于分析长事务、锁持有时长。</p>
     * @param LastTransStarted <p>事务开始时间（xml 里的 lasttranstarted，本地时间字符串，如 2026-09-16T14:58:23.840）。用于分析长事务、锁持有时长。</p>
     */
    public void setLastTransStarted(String LastTransStarted) {
        this.LastTransStarted = LastTransStarted;
    }

    /**
     * Get <p>该边对应进程的并行执行子线程 ID。</p> 
     * @return ExecutionContextId <p>该边对应进程的并行执行子线程 ID。</p>
     */
    public Long getExecutionContextId() {
        return this.ExecutionContextId;
    }

    /**
     * Set <p>该边对应进程的并行执行子线程 ID。</p>
     * @param ExecutionContextId <p>该边对应进程的并行执行子线程 ID。</p>
     */
    public void setExecutionContextId(Long ExecutionContextId) {
        this.ExecutionContextId = ExecutionContextId;
    }

    /**
     * Get <p>SQL Server 引擎内的进程指针，例如 process260256c7468。与 Resources.Owners/Waiters.ProcessId 拼接死锁环。partial 事件为 null。</p> 
     * @return ProcessId <p>SQL Server 引擎内的进程指针，例如 process260256c7468。与 Resources.Owners/Waiters.ProcessId 拼接死锁环。partial 事件为 null。</p>
     */
    public String getProcessId() {
        return this.ProcessId;
    }

    /**
     * Set <p>SQL Server 引擎内的进程指针，例如 process260256c7468。与 Resources.Owners/Waiters.ProcessId 拼接死锁环。partial 事件为 null。</p>
     * @param ProcessId <p>SQL Server 引擎内的进程指针，例如 process260256c7468。与 Resources.Owners/Waiters.ProcessId 拼接死锁环。partial 事件为 null。</p>
     */
    public void setProcessId(String ProcessId) {
        this.ProcessId = ProcessId;
    }

    /**
     * Get <p>归一化后的客户端应用名。去掉 SQLAgent 的 JobId（16-64 位十六进制串）、Step 号、GUID、末尾进程号等易变部分，用于按应用类别聚合。</p> 
     * @return ClientAppNormalized <p>归一化后的客户端应用名。去掉 SQLAgent 的 JobId（16-64 位十六进制串）、Step 号、GUID、末尾进程号等易变部分，用于按应用类别聚合。</p>
     */
    public String getClientAppNormalized() {
        return this.ClientAppNormalized;
    }

    /**
     * Set <p>归一化后的客户端应用名。去掉 SQLAgent 的 JobId（16-64 位十六进制串）、Step 号、GUID、末尾进程号等易变部分，用于按应用类别聚合。</p>
     * @param ClientAppNormalized <p>归一化后的客户端应用名。去掉 SQLAgent 的 JobId（16-64 位十六进制串）、Step 号、GUID、末尾进程号等易变部分，用于按应用类别聚合。</p>
     */
    public void setClientAppNormalized(String ClientAppNormalized) {
        this.ClientAppNormalized = ClientAppNormalized;
    }

    /**
     * Get <p>本进程正在等待的锁资源描述列表（死锁环的等待边）。每条形如 &#39;keylock on tempdb.dbo.dl_a mode X waiting&#39;。applicationlock 会展示原始资源名（如 &#39;lock_a&#39;）。partial 事件为空数组。</p> 
     * @return LockRequest <p>本进程正在等待的锁资源描述列表（死锁环的等待边）。每条形如 &#39;keylock on tempdb.dbo.dl_a mode X waiting&#39;。applicationlock 会展示原始资源名（如 &#39;lock_a&#39;）。partial 事件为空数组。</p>
     */
    public String [] getLockRequest() {
        return this.LockRequest;
    }

    /**
     * Set <p>本进程正在等待的锁资源描述列表（死锁环的等待边）。每条形如 &#39;keylock on tempdb.dbo.dl_a mode X waiting&#39;。applicationlock 会展示原始资源名（如 &#39;lock_a&#39;）。partial 事件为空数组。</p>
     * @param LockRequest <p>本进程正在等待的锁资源描述列表（死锁环的等待边）。每条形如 &#39;keylock on tempdb.dbo.dl_a mode X waiting&#39;。applicationlock 会展示原始资源名（如 &#39;lock_a&#39;）。partial 事件为空数组。</p>
     */
    public void setLockRequest(String [] LockRequest) {
        this.LockRequest = LockRequest;
    }

    /**
     * Get <p>SQL Server 会话 ID。日志排查主键。</p> 
     * @return SessionId <p>SQL Server 会话 ID。日志排查主键。</p>
     */
    public Long getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>SQL Server 会话 ID。日志排查主键。</p>
     * @param SessionId <p>SQL Server 会话 ID。日志排查主键。</p>
     */
    public void setSessionId(Long SessionId) {
        this.SessionId = SessionId;
    }

    public DeadlockSession() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeadlockSession(DeadlockSession source) {
        if (source.SqlFingerprint != null) {
            this.SqlFingerprint = new String(source.SqlFingerprint);
        }
        if (source.LoginName != null) {
            this.LoginName = new String(source.LoginName);
        }
        if (source.Frames != null) {
            this.Frames = new DeadlockFrame[source.Frames.length];
            for (int i = 0; i < source.Frames.length; i++) {
                this.Frames[i] = new DeadlockFrame(source.Frames[i]);
            }
        }
        if (source.IsolationLevel != null) {
            this.IsolationLevel = new String(source.IsolationLevel);
        }
        if (source.ProcessStatus != null) {
            this.ProcessStatus = new String(source.ProcessStatus);
        }
        if (source.ClientApp != null) {
            this.ClientApp = new String(source.ClientApp);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.LockHold != null) {
            this.LockHold = new String[source.LockHold.length];
            for (int i = 0; i < source.LockHold.length; i++) {
                this.LockHold[i] = new String(source.LockHold[i]);
            }
        }
        if (source.SqlText != null) {
            this.SqlText = new String(source.SqlText);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.DatabaseId != null) {
            this.DatabaseId = new Long(source.DatabaseId);
        }
        if (source.IsVictim != null) {
            this.IsVictim = new Boolean(source.IsVictim);
        }
        if (source.WaitTimeMs != null) {
            this.WaitTimeMs = new Long(source.WaitTimeMs);
        }
        if (source.LastTransStarted != null) {
            this.LastTransStarted = new String(source.LastTransStarted);
        }
        if (source.ExecutionContextId != null) {
            this.ExecutionContextId = new Long(source.ExecutionContextId);
        }
        if (source.ProcessId != null) {
            this.ProcessId = new String(source.ProcessId);
        }
        if (source.ClientAppNormalized != null) {
            this.ClientAppNormalized = new String(source.ClientAppNormalized);
        }
        if (source.LockRequest != null) {
            this.LockRequest = new String[source.LockRequest.length];
            for (int i = 0; i < source.LockRequest.length; i++) {
                this.LockRequest[i] = new String(source.LockRequest[i]);
            }
        }
        if (source.SessionId != null) {
            this.SessionId = new Long(source.SessionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SqlFingerprint", this.SqlFingerprint);
        this.setParamSimple(map, prefix + "LoginName", this.LoginName);
        this.setParamArrayObj(map, prefix + "Frames.", this.Frames);
        this.setParamSimple(map, prefix + "IsolationLevel", this.IsolationLevel);
        this.setParamSimple(map, prefix + "ProcessStatus", this.ProcessStatus);
        this.setParamSimple(map, prefix + "ClientApp", this.ClientApp);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamArraySimple(map, prefix + "LockHold.", this.LockHold);
        this.setParamSimple(map, prefix + "SqlText", this.SqlText);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "DatabaseId", this.DatabaseId);
        this.setParamSimple(map, prefix + "IsVictim", this.IsVictim);
        this.setParamSimple(map, prefix + "WaitTimeMs", this.WaitTimeMs);
        this.setParamSimple(map, prefix + "LastTransStarted", this.LastTransStarted);
        this.setParamSimple(map, prefix + "ExecutionContextId", this.ExecutionContextId);
        this.setParamSimple(map, prefix + "ProcessId", this.ProcessId);
        this.setParamSimple(map, prefix + "ClientAppNormalized", this.ClientAppNormalized);
        this.setParamArraySimple(map, prefix + "LockRequest.", this.LockRequest);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);

    }
}

