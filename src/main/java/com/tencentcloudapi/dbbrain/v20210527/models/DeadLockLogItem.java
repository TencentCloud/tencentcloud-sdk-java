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

public class DeadLockLogItem extends AbstractModel {

    /**
    * <p>实例 ID，例如 mssql-ks3s56dj。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>时间字段来源。XML_EVENT 表示时间来自 xml_deadlock_report 的引擎打点；OBSERVED_LOG 表示时间来自 chain/lock 观测记录（partial 事件）。</p>
    */
    @SerializedName("TimestampSource")
    @Expose
    private String TimestampSource;

    /**
    * <p>降级原因码。IsPartial=true 时值为 XML_NOT_AVAILABLE；否则为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PartialReasonCode")
    @Expose
    private String PartialReasonCode;

    /**
    * <p>被回滚的进程内部指针列表，例如 process260256c7468。与 Resources.Owners/Waiters.ProcessId 对齐，可用于死锁环节点定位。</p>
    */
    @SerializedName("VictimProcessIds")
    @Expose
    private String [] VictimProcessIds;

    /**
    * <p>原始负载是否被上游截断。true 表示 XmlReport 或 chain/lock payload 有过截断，会影响诊断可信度。</p>
    */
    @SerializedName("PayloadTruncated")
    @Expose
    private Boolean PayloadTruncated;

    /**
    * <p>组成本事件的所有 XEvent 原始消息 UUID 列表（去重后按字典序排序），用于多源溯源、审计、补数。</p>
    */
    @SerializedName("SourceUuids")
    @Expose
    private String [] SourceUuids;

    /**
    * <p>实际可归因（有 TransactionId）的事务数量。</p>
    */
    @SerializedName("ObservedTransactionCount")
    @Expose
    private Long ObservedTransactionCount;

    /**
    * <p>死锁发生时间。ISO-8601 带偏移格式，例如 2026-09-16T06:58:52.611+00:00。来源于 XEvent 原始 timestamp。</p>
    */
    @SerializedName("EventTimestamp")
    @Expose
    private String EventTimestamp;

    /**
    * <p>死锁图完整性。COMPLETE 表示成功装配 xml_deadlock_report；MISSING 表示无 xml 只有 chain/lock 消息（对应 IsPartial=true）。</p>
    */
    @SerializedName("GraphStatus")
    @Expose
    private String GraphStatus;

    /**
    * <p>本次响应中是否内联了原始死锁 XML。仅当请求参数 IncludeXml=true 且事件为 COMPLETE 时为 true。</p>
    */
    @SerializedName("XmlIncluded")
    @Expose
    private Boolean XmlIncluded;

    /**
    * <p>参与死锁的进程总数。2 方死锁最常见，N 方死锁更严重。</p>
    */
    @SerializedName("ProcessCount")
    @Expose
    private Long ProcessCount;

    /**
    * <p>参与死锁的事务列表（按 IsVictim=true 排前、TransactionId 升序）。每个事务下可能有多个 Session（例如并行执行 worker）。</p>
    */
    @SerializedName("Transactions")
    @Expose
    private DeadlockTransaction [] Transactions;

    /**
    * <p>引擎内的死锁编号，例如 84。与 SQL Server 端 xml_deadlock_report 对齐。同实例短期内可辨识，重启后会复用。若上游数据缺失则为 null。</p>
    */
    @SerializedName("DeadlockId")
    @Expose
    private String DeadlockId;

    /**
    * <p>原始 SQL Server 死锁图 XML 字符串（xml_deadlock_report 输出）。IncludeXml=false 或事件为 partial 时为 null。可用于前端直接绘制死锁环、AI 深度诊断，或落到对象存储做冷归档。</p>
    */
    @SerializedName("XmlReport")
    @Expose
    private String XmlReport;

    /**
    * <p>原始 XML 字节数，用于采集侧健康度评估。partial 事件为 null。</p>
    */
    @SerializedName("OriginalXmlBytes")
    @Expose
    private Long OriginalXmlBytes;

    /**
    * <p>被 SQL Server 选中回滚的会话 SPID 列表（去重）。DBA 复盘定位牺牲者的核心字段。</p>
    */
    @SerializedName("VictimSessionIds")
    @Expose
    private Long [] VictimSessionIds;

    /**
    * <p>是否为降级 partial 事件。true 表示无 xml_deadlock_report，Transactions/Resources 只能从 chain/lock 消息尽力还原。AI 诊断前建议过滤 IsPartial=true 的记录。</p>
    */
    @SerializedName("IsPartial")
    @Expose
    private Boolean IsPartial;

    /**
    * <p>涉及的数据库名去重列表，用于分库聚合与影响范围判断。</p>
    */
    @SerializedName("DatabaseNames")
    @Expose
    private String [] DatabaseNames;

    /**
    * <p>事件唯一 ID，格式为 xml:&lt;uuid&gt; 或 partial:&lt;uuid&gt;。前缀 xml 表示由 xml_deadlock_report 装配的完整事件；partial 表示只有 chain/lock 消息的降级事件。可作为幂等主键。</p>
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * <p>死锁事件级签名（SHA-1 前 16 位）。基于参与死锁的所有锁资源三元组 (Kind, ObjectName, IndexName, Mode) 排序后计算，用于聚合相同锁冲突模式的死锁模板。partial 事件无 Resources 时为 null。</p>
    */
    @SerializedName("DeadlockSignature")
    @Expose
    private String DeadlockSignature;

    /**
    * <p>死锁涉及的锁资源节点列表。每个资源节点有若干 Owners（持有边）与 Waiters（等待边），二者组合构成死锁环。partial 事件为空数组。</p>
    */
    @SerializedName("Resources")
    @Expose
    private DeadlockResource [] Resources;

    /**
    * <p>XE 辅助事件（chain/lock）与 XML 图的关联状态。MATCHED 表示至少一个 chain/lock 消息已关联到该 xml；UNMATCHED 表示只有孤立 xml 或降级 partial 事件。</p>
    */
    @SerializedName("AssociationStatus")
    @Expose
    private String AssociationStatus;

    /**
    * <p>参与死锁的事务总数（有 TransactionId 的会话按事务分组后的数量）。当存在无 TransactionId 的会话时为 null，通过 ObservedTransactionCount 与该字段的差值可以判断归因缺失情况。</p>
    */
    @SerializedName("TransactionCount")
    @Expose
    private Long TransactionCount;

    /**
     * Get <p>实例 ID，例如 mssql-ks3s56dj。</p> 
     * @return InstanceId <p>实例 ID，例如 mssql-ks3s56dj。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID，例如 mssql-ks3s56dj。</p>
     * @param InstanceId <p>实例 ID，例如 mssql-ks3s56dj。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>时间字段来源。XML_EVENT 表示时间来自 xml_deadlock_report 的引擎打点；OBSERVED_LOG 表示时间来自 chain/lock 观测记录（partial 事件）。</p> 
     * @return TimestampSource <p>时间字段来源。XML_EVENT 表示时间来自 xml_deadlock_report 的引擎打点；OBSERVED_LOG 表示时间来自 chain/lock 观测记录（partial 事件）。</p>
     */
    public String getTimestampSource() {
        return this.TimestampSource;
    }

    /**
     * Set <p>时间字段来源。XML_EVENT 表示时间来自 xml_deadlock_report 的引擎打点；OBSERVED_LOG 表示时间来自 chain/lock 观测记录（partial 事件）。</p>
     * @param TimestampSource <p>时间字段来源。XML_EVENT 表示时间来自 xml_deadlock_report 的引擎打点；OBSERVED_LOG 表示时间来自 chain/lock 观测记录（partial 事件）。</p>
     */
    public void setTimestampSource(String TimestampSource) {
        this.TimestampSource = TimestampSource;
    }

    /**
     * Get <p>降级原因码。IsPartial=true 时值为 XML_NOT_AVAILABLE；否则为空。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PartialReasonCode <p>降级原因码。IsPartial=true 时值为 XML_NOT_AVAILABLE；否则为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPartialReasonCode() {
        return this.PartialReasonCode;
    }

    /**
     * Set <p>降级原因码。IsPartial=true 时值为 XML_NOT_AVAILABLE；否则为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PartialReasonCode <p>降级原因码。IsPartial=true 时值为 XML_NOT_AVAILABLE；否则为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPartialReasonCode(String PartialReasonCode) {
        this.PartialReasonCode = PartialReasonCode;
    }

    /**
     * Get <p>被回滚的进程内部指针列表，例如 process260256c7468。与 Resources.Owners/Waiters.ProcessId 对齐，可用于死锁环节点定位。</p> 
     * @return VictimProcessIds <p>被回滚的进程内部指针列表，例如 process260256c7468。与 Resources.Owners/Waiters.ProcessId 对齐，可用于死锁环节点定位。</p>
     */
    public String [] getVictimProcessIds() {
        return this.VictimProcessIds;
    }

    /**
     * Set <p>被回滚的进程内部指针列表，例如 process260256c7468。与 Resources.Owners/Waiters.ProcessId 对齐，可用于死锁环节点定位。</p>
     * @param VictimProcessIds <p>被回滚的进程内部指针列表，例如 process260256c7468。与 Resources.Owners/Waiters.ProcessId 对齐，可用于死锁环节点定位。</p>
     */
    public void setVictimProcessIds(String [] VictimProcessIds) {
        this.VictimProcessIds = VictimProcessIds;
    }

    /**
     * Get <p>原始负载是否被上游截断。true 表示 XmlReport 或 chain/lock payload 有过截断，会影响诊断可信度。</p> 
     * @return PayloadTruncated <p>原始负载是否被上游截断。true 表示 XmlReport 或 chain/lock payload 有过截断，会影响诊断可信度。</p>
     */
    public Boolean getPayloadTruncated() {
        return this.PayloadTruncated;
    }

    /**
     * Set <p>原始负载是否被上游截断。true 表示 XmlReport 或 chain/lock payload 有过截断，会影响诊断可信度。</p>
     * @param PayloadTruncated <p>原始负载是否被上游截断。true 表示 XmlReport 或 chain/lock payload 有过截断，会影响诊断可信度。</p>
     */
    public void setPayloadTruncated(Boolean PayloadTruncated) {
        this.PayloadTruncated = PayloadTruncated;
    }

    /**
     * Get <p>组成本事件的所有 XEvent 原始消息 UUID 列表（去重后按字典序排序），用于多源溯源、审计、补数。</p> 
     * @return SourceUuids <p>组成本事件的所有 XEvent 原始消息 UUID 列表（去重后按字典序排序），用于多源溯源、审计、补数。</p>
     */
    public String [] getSourceUuids() {
        return this.SourceUuids;
    }

    /**
     * Set <p>组成本事件的所有 XEvent 原始消息 UUID 列表（去重后按字典序排序），用于多源溯源、审计、补数。</p>
     * @param SourceUuids <p>组成本事件的所有 XEvent 原始消息 UUID 列表（去重后按字典序排序），用于多源溯源、审计、补数。</p>
     */
    public void setSourceUuids(String [] SourceUuids) {
        this.SourceUuids = SourceUuids;
    }

    /**
     * Get <p>实际可归因（有 TransactionId）的事务数量。</p> 
     * @return ObservedTransactionCount <p>实际可归因（有 TransactionId）的事务数量。</p>
     */
    public Long getObservedTransactionCount() {
        return this.ObservedTransactionCount;
    }

    /**
     * Set <p>实际可归因（有 TransactionId）的事务数量。</p>
     * @param ObservedTransactionCount <p>实际可归因（有 TransactionId）的事务数量。</p>
     */
    public void setObservedTransactionCount(Long ObservedTransactionCount) {
        this.ObservedTransactionCount = ObservedTransactionCount;
    }

    /**
     * Get <p>死锁发生时间。ISO-8601 带偏移格式，例如 2026-09-16T06:58:52.611+00:00。来源于 XEvent 原始 timestamp。</p> 
     * @return EventTimestamp <p>死锁发生时间。ISO-8601 带偏移格式，例如 2026-09-16T06:58:52.611+00:00。来源于 XEvent 原始 timestamp。</p>
     */
    public String getEventTimestamp() {
        return this.EventTimestamp;
    }

    /**
     * Set <p>死锁发生时间。ISO-8601 带偏移格式，例如 2026-09-16T06:58:52.611+00:00。来源于 XEvent 原始 timestamp。</p>
     * @param EventTimestamp <p>死锁发生时间。ISO-8601 带偏移格式，例如 2026-09-16T06:58:52.611+00:00。来源于 XEvent 原始 timestamp。</p>
     */
    public void setEventTimestamp(String EventTimestamp) {
        this.EventTimestamp = EventTimestamp;
    }

    /**
     * Get <p>死锁图完整性。COMPLETE 表示成功装配 xml_deadlock_report；MISSING 表示无 xml 只有 chain/lock 消息（对应 IsPartial=true）。</p> 
     * @return GraphStatus <p>死锁图完整性。COMPLETE 表示成功装配 xml_deadlock_report；MISSING 表示无 xml 只有 chain/lock 消息（对应 IsPartial=true）。</p>
     */
    public String getGraphStatus() {
        return this.GraphStatus;
    }

    /**
     * Set <p>死锁图完整性。COMPLETE 表示成功装配 xml_deadlock_report；MISSING 表示无 xml 只有 chain/lock 消息（对应 IsPartial=true）。</p>
     * @param GraphStatus <p>死锁图完整性。COMPLETE 表示成功装配 xml_deadlock_report；MISSING 表示无 xml 只有 chain/lock 消息（对应 IsPartial=true）。</p>
     */
    public void setGraphStatus(String GraphStatus) {
        this.GraphStatus = GraphStatus;
    }

    /**
     * Get <p>本次响应中是否内联了原始死锁 XML。仅当请求参数 IncludeXml=true 且事件为 COMPLETE 时为 true。</p> 
     * @return XmlIncluded <p>本次响应中是否内联了原始死锁 XML。仅当请求参数 IncludeXml=true 且事件为 COMPLETE 时为 true。</p>
     */
    public Boolean getXmlIncluded() {
        return this.XmlIncluded;
    }

    /**
     * Set <p>本次响应中是否内联了原始死锁 XML。仅当请求参数 IncludeXml=true 且事件为 COMPLETE 时为 true。</p>
     * @param XmlIncluded <p>本次响应中是否内联了原始死锁 XML。仅当请求参数 IncludeXml=true 且事件为 COMPLETE 时为 true。</p>
     */
    public void setXmlIncluded(Boolean XmlIncluded) {
        this.XmlIncluded = XmlIncluded;
    }

    /**
     * Get <p>参与死锁的进程总数。2 方死锁最常见，N 方死锁更严重。</p> 
     * @return ProcessCount <p>参与死锁的进程总数。2 方死锁最常见，N 方死锁更严重。</p>
     */
    public Long getProcessCount() {
        return this.ProcessCount;
    }

    /**
     * Set <p>参与死锁的进程总数。2 方死锁最常见，N 方死锁更严重。</p>
     * @param ProcessCount <p>参与死锁的进程总数。2 方死锁最常见，N 方死锁更严重。</p>
     */
    public void setProcessCount(Long ProcessCount) {
        this.ProcessCount = ProcessCount;
    }

    /**
     * Get <p>参与死锁的事务列表（按 IsVictim=true 排前、TransactionId 升序）。每个事务下可能有多个 Session（例如并行执行 worker）。</p> 
     * @return Transactions <p>参与死锁的事务列表（按 IsVictim=true 排前、TransactionId 升序）。每个事务下可能有多个 Session（例如并行执行 worker）。</p>
     */
    public DeadlockTransaction [] getTransactions() {
        return this.Transactions;
    }

    /**
     * Set <p>参与死锁的事务列表（按 IsVictim=true 排前、TransactionId 升序）。每个事务下可能有多个 Session（例如并行执行 worker）。</p>
     * @param Transactions <p>参与死锁的事务列表（按 IsVictim=true 排前、TransactionId 升序）。每个事务下可能有多个 Session（例如并行执行 worker）。</p>
     */
    public void setTransactions(DeadlockTransaction [] Transactions) {
        this.Transactions = Transactions;
    }

    /**
     * Get <p>引擎内的死锁编号，例如 84。与 SQL Server 端 xml_deadlock_report 对齐。同实例短期内可辨识，重启后会复用。若上游数据缺失则为 null。</p> 
     * @return DeadlockId <p>引擎内的死锁编号，例如 84。与 SQL Server 端 xml_deadlock_report 对齐。同实例短期内可辨识，重启后会复用。若上游数据缺失则为 null。</p>
     */
    public String getDeadlockId() {
        return this.DeadlockId;
    }

    /**
     * Set <p>引擎内的死锁编号，例如 84。与 SQL Server 端 xml_deadlock_report 对齐。同实例短期内可辨识，重启后会复用。若上游数据缺失则为 null。</p>
     * @param DeadlockId <p>引擎内的死锁编号，例如 84。与 SQL Server 端 xml_deadlock_report 对齐。同实例短期内可辨识，重启后会复用。若上游数据缺失则为 null。</p>
     */
    public void setDeadlockId(String DeadlockId) {
        this.DeadlockId = DeadlockId;
    }

    /**
     * Get <p>原始 SQL Server 死锁图 XML 字符串（xml_deadlock_report 输出）。IncludeXml=false 或事件为 partial 时为 null。可用于前端直接绘制死锁环、AI 深度诊断，或落到对象存储做冷归档。</p> 
     * @return XmlReport <p>原始 SQL Server 死锁图 XML 字符串（xml_deadlock_report 输出）。IncludeXml=false 或事件为 partial 时为 null。可用于前端直接绘制死锁环、AI 深度诊断，或落到对象存储做冷归档。</p>
     */
    public String getXmlReport() {
        return this.XmlReport;
    }

    /**
     * Set <p>原始 SQL Server 死锁图 XML 字符串（xml_deadlock_report 输出）。IncludeXml=false 或事件为 partial 时为 null。可用于前端直接绘制死锁环、AI 深度诊断，或落到对象存储做冷归档。</p>
     * @param XmlReport <p>原始 SQL Server 死锁图 XML 字符串（xml_deadlock_report 输出）。IncludeXml=false 或事件为 partial 时为 null。可用于前端直接绘制死锁环、AI 深度诊断，或落到对象存储做冷归档。</p>
     */
    public void setXmlReport(String XmlReport) {
        this.XmlReport = XmlReport;
    }

    /**
     * Get <p>原始 XML 字节数，用于采集侧健康度评估。partial 事件为 null。</p> 
     * @return OriginalXmlBytes <p>原始 XML 字节数，用于采集侧健康度评估。partial 事件为 null。</p>
     */
    public Long getOriginalXmlBytes() {
        return this.OriginalXmlBytes;
    }

    /**
     * Set <p>原始 XML 字节数，用于采集侧健康度评估。partial 事件为 null。</p>
     * @param OriginalXmlBytes <p>原始 XML 字节数，用于采集侧健康度评估。partial 事件为 null。</p>
     */
    public void setOriginalXmlBytes(Long OriginalXmlBytes) {
        this.OriginalXmlBytes = OriginalXmlBytes;
    }

    /**
     * Get <p>被 SQL Server 选中回滚的会话 SPID 列表（去重）。DBA 复盘定位牺牲者的核心字段。</p> 
     * @return VictimSessionIds <p>被 SQL Server 选中回滚的会话 SPID 列表（去重）。DBA 复盘定位牺牲者的核心字段。</p>
     */
    public Long [] getVictimSessionIds() {
        return this.VictimSessionIds;
    }

    /**
     * Set <p>被 SQL Server 选中回滚的会话 SPID 列表（去重）。DBA 复盘定位牺牲者的核心字段。</p>
     * @param VictimSessionIds <p>被 SQL Server 选中回滚的会话 SPID 列表（去重）。DBA 复盘定位牺牲者的核心字段。</p>
     */
    public void setVictimSessionIds(Long [] VictimSessionIds) {
        this.VictimSessionIds = VictimSessionIds;
    }

    /**
     * Get <p>是否为降级 partial 事件。true 表示无 xml_deadlock_report，Transactions/Resources 只能从 chain/lock 消息尽力还原。AI 诊断前建议过滤 IsPartial=true 的记录。</p> 
     * @return IsPartial <p>是否为降级 partial 事件。true 表示无 xml_deadlock_report，Transactions/Resources 只能从 chain/lock 消息尽力还原。AI 诊断前建议过滤 IsPartial=true 的记录。</p>
     */
    public Boolean getIsPartial() {
        return this.IsPartial;
    }

    /**
     * Set <p>是否为降级 partial 事件。true 表示无 xml_deadlock_report，Transactions/Resources 只能从 chain/lock 消息尽力还原。AI 诊断前建议过滤 IsPartial=true 的记录。</p>
     * @param IsPartial <p>是否为降级 partial 事件。true 表示无 xml_deadlock_report，Transactions/Resources 只能从 chain/lock 消息尽力还原。AI 诊断前建议过滤 IsPartial=true 的记录。</p>
     */
    public void setIsPartial(Boolean IsPartial) {
        this.IsPartial = IsPartial;
    }

    /**
     * Get <p>涉及的数据库名去重列表，用于分库聚合与影响范围判断。</p> 
     * @return DatabaseNames <p>涉及的数据库名去重列表，用于分库聚合与影响范围判断。</p>
     */
    public String [] getDatabaseNames() {
        return this.DatabaseNames;
    }

    /**
     * Set <p>涉及的数据库名去重列表，用于分库聚合与影响范围判断。</p>
     * @param DatabaseNames <p>涉及的数据库名去重列表，用于分库聚合与影响范围判断。</p>
     */
    public void setDatabaseNames(String [] DatabaseNames) {
        this.DatabaseNames = DatabaseNames;
    }

    /**
     * Get <p>事件唯一 ID，格式为 xml:&lt;uuid&gt; 或 partial:&lt;uuid&gt;。前缀 xml 表示由 xml_deadlock_report 装配的完整事件；partial 表示只有 chain/lock 消息的降级事件。可作为幂等主键。</p> 
     * @return EventId <p>事件唯一 ID，格式为 xml:&lt;uuid&gt; 或 partial:&lt;uuid&gt;。前缀 xml 表示由 xml_deadlock_report 装配的完整事件；partial 表示只有 chain/lock 消息的降级事件。可作为幂等主键。</p>
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set <p>事件唯一 ID，格式为 xml:&lt;uuid&gt; 或 partial:&lt;uuid&gt;。前缀 xml 表示由 xml_deadlock_report 装配的完整事件；partial 表示只有 chain/lock 消息的降级事件。可作为幂等主键。</p>
     * @param EventId <p>事件唯一 ID，格式为 xml:&lt;uuid&gt; 或 partial:&lt;uuid&gt;。前缀 xml 表示由 xml_deadlock_report 装配的完整事件；partial 表示只有 chain/lock 消息的降级事件。可作为幂等主键。</p>
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Get <p>死锁事件级签名（SHA-1 前 16 位）。基于参与死锁的所有锁资源三元组 (Kind, ObjectName, IndexName, Mode) 排序后计算，用于聚合相同锁冲突模式的死锁模板。partial 事件无 Resources 时为 null。</p> 
     * @return DeadlockSignature <p>死锁事件级签名（SHA-1 前 16 位）。基于参与死锁的所有锁资源三元组 (Kind, ObjectName, IndexName, Mode) 排序后计算，用于聚合相同锁冲突模式的死锁模板。partial 事件无 Resources 时为 null。</p>
     */
    public String getDeadlockSignature() {
        return this.DeadlockSignature;
    }

    /**
     * Set <p>死锁事件级签名（SHA-1 前 16 位）。基于参与死锁的所有锁资源三元组 (Kind, ObjectName, IndexName, Mode) 排序后计算，用于聚合相同锁冲突模式的死锁模板。partial 事件无 Resources 时为 null。</p>
     * @param DeadlockSignature <p>死锁事件级签名（SHA-1 前 16 位）。基于参与死锁的所有锁资源三元组 (Kind, ObjectName, IndexName, Mode) 排序后计算，用于聚合相同锁冲突模式的死锁模板。partial 事件无 Resources 时为 null。</p>
     */
    public void setDeadlockSignature(String DeadlockSignature) {
        this.DeadlockSignature = DeadlockSignature;
    }

    /**
     * Get <p>死锁涉及的锁资源节点列表。每个资源节点有若干 Owners（持有边）与 Waiters（等待边），二者组合构成死锁环。partial 事件为空数组。</p> 
     * @return Resources <p>死锁涉及的锁资源节点列表。每个资源节点有若干 Owners（持有边）与 Waiters（等待边），二者组合构成死锁环。partial 事件为空数组。</p>
     */
    public DeadlockResource [] getResources() {
        return this.Resources;
    }

    /**
     * Set <p>死锁涉及的锁资源节点列表。每个资源节点有若干 Owners（持有边）与 Waiters（等待边），二者组合构成死锁环。partial 事件为空数组。</p>
     * @param Resources <p>死锁涉及的锁资源节点列表。每个资源节点有若干 Owners（持有边）与 Waiters（等待边），二者组合构成死锁环。partial 事件为空数组。</p>
     */
    public void setResources(DeadlockResource [] Resources) {
        this.Resources = Resources;
    }

    /**
     * Get <p>XE 辅助事件（chain/lock）与 XML 图的关联状态。MATCHED 表示至少一个 chain/lock 消息已关联到该 xml；UNMATCHED 表示只有孤立 xml 或降级 partial 事件。</p> 
     * @return AssociationStatus <p>XE 辅助事件（chain/lock）与 XML 图的关联状态。MATCHED 表示至少一个 chain/lock 消息已关联到该 xml；UNMATCHED 表示只有孤立 xml 或降级 partial 事件。</p>
     */
    public String getAssociationStatus() {
        return this.AssociationStatus;
    }

    /**
     * Set <p>XE 辅助事件（chain/lock）与 XML 图的关联状态。MATCHED 表示至少一个 chain/lock 消息已关联到该 xml；UNMATCHED 表示只有孤立 xml 或降级 partial 事件。</p>
     * @param AssociationStatus <p>XE 辅助事件（chain/lock）与 XML 图的关联状态。MATCHED 表示至少一个 chain/lock 消息已关联到该 xml；UNMATCHED 表示只有孤立 xml 或降级 partial 事件。</p>
     */
    public void setAssociationStatus(String AssociationStatus) {
        this.AssociationStatus = AssociationStatus;
    }

    /**
     * Get <p>参与死锁的事务总数（有 TransactionId 的会话按事务分组后的数量）。当存在无 TransactionId 的会话时为 null，通过 ObservedTransactionCount 与该字段的差值可以判断归因缺失情况。</p> 
     * @return TransactionCount <p>参与死锁的事务总数（有 TransactionId 的会话按事务分组后的数量）。当存在无 TransactionId 的会话时为 null，通过 ObservedTransactionCount 与该字段的差值可以判断归因缺失情况。</p>
     */
    public Long getTransactionCount() {
        return this.TransactionCount;
    }

    /**
     * Set <p>参与死锁的事务总数（有 TransactionId 的会话按事务分组后的数量）。当存在无 TransactionId 的会话时为 null，通过 ObservedTransactionCount 与该字段的差值可以判断归因缺失情况。</p>
     * @param TransactionCount <p>参与死锁的事务总数（有 TransactionId 的会话按事务分组后的数量）。当存在无 TransactionId 的会话时为 null，通过 ObservedTransactionCount 与该字段的差值可以判断归因缺失情况。</p>
     */
    public void setTransactionCount(Long TransactionCount) {
        this.TransactionCount = TransactionCount;
    }

    public DeadLockLogItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeadLockLogItem(DeadLockLogItem source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.TimestampSource != null) {
            this.TimestampSource = new String(source.TimestampSource);
        }
        if (source.PartialReasonCode != null) {
            this.PartialReasonCode = new String(source.PartialReasonCode);
        }
        if (source.VictimProcessIds != null) {
            this.VictimProcessIds = new String[source.VictimProcessIds.length];
            for (int i = 0; i < source.VictimProcessIds.length; i++) {
                this.VictimProcessIds[i] = new String(source.VictimProcessIds[i]);
            }
        }
        if (source.PayloadTruncated != null) {
            this.PayloadTruncated = new Boolean(source.PayloadTruncated);
        }
        if (source.SourceUuids != null) {
            this.SourceUuids = new String[source.SourceUuids.length];
            for (int i = 0; i < source.SourceUuids.length; i++) {
                this.SourceUuids[i] = new String(source.SourceUuids[i]);
            }
        }
        if (source.ObservedTransactionCount != null) {
            this.ObservedTransactionCount = new Long(source.ObservedTransactionCount);
        }
        if (source.EventTimestamp != null) {
            this.EventTimestamp = new String(source.EventTimestamp);
        }
        if (source.GraphStatus != null) {
            this.GraphStatus = new String(source.GraphStatus);
        }
        if (source.XmlIncluded != null) {
            this.XmlIncluded = new Boolean(source.XmlIncluded);
        }
        if (source.ProcessCount != null) {
            this.ProcessCount = new Long(source.ProcessCount);
        }
        if (source.Transactions != null) {
            this.Transactions = new DeadlockTransaction[source.Transactions.length];
            for (int i = 0; i < source.Transactions.length; i++) {
                this.Transactions[i] = new DeadlockTransaction(source.Transactions[i]);
            }
        }
        if (source.DeadlockId != null) {
            this.DeadlockId = new String(source.DeadlockId);
        }
        if (source.XmlReport != null) {
            this.XmlReport = new String(source.XmlReport);
        }
        if (source.OriginalXmlBytes != null) {
            this.OriginalXmlBytes = new Long(source.OriginalXmlBytes);
        }
        if (source.VictimSessionIds != null) {
            this.VictimSessionIds = new Long[source.VictimSessionIds.length];
            for (int i = 0; i < source.VictimSessionIds.length; i++) {
                this.VictimSessionIds[i] = new Long(source.VictimSessionIds[i]);
            }
        }
        if (source.IsPartial != null) {
            this.IsPartial = new Boolean(source.IsPartial);
        }
        if (source.DatabaseNames != null) {
            this.DatabaseNames = new String[source.DatabaseNames.length];
            for (int i = 0; i < source.DatabaseNames.length; i++) {
                this.DatabaseNames[i] = new String(source.DatabaseNames[i]);
            }
        }
        if (source.EventId != null) {
            this.EventId = new String(source.EventId);
        }
        if (source.DeadlockSignature != null) {
            this.DeadlockSignature = new String(source.DeadlockSignature);
        }
        if (source.Resources != null) {
            this.Resources = new DeadlockResource[source.Resources.length];
            for (int i = 0; i < source.Resources.length; i++) {
                this.Resources[i] = new DeadlockResource(source.Resources[i]);
            }
        }
        if (source.AssociationStatus != null) {
            this.AssociationStatus = new String(source.AssociationStatus);
        }
        if (source.TransactionCount != null) {
            this.TransactionCount = new Long(source.TransactionCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "TimestampSource", this.TimestampSource);
        this.setParamSimple(map, prefix + "PartialReasonCode", this.PartialReasonCode);
        this.setParamArraySimple(map, prefix + "VictimProcessIds.", this.VictimProcessIds);
        this.setParamSimple(map, prefix + "PayloadTruncated", this.PayloadTruncated);
        this.setParamArraySimple(map, prefix + "SourceUuids.", this.SourceUuids);
        this.setParamSimple(map, prefix + "ObservedTransactionCount", this.ObservedTransactionCount);
        this.setParamSimple(map, prefix + "EventTimestamp", this.EventTimestamp);
        this.setParamSimple(map, prefix + "GraphStatus", this.GraphStatus);
        this.setParamSimple(map, prefix + "XmlIncluded", this.XmlIncluded);
        this.setParamSimple(map, prefix + "ProcessCount", this.ProcessCount);
        this.setParamArrayObj(map, prefix + "Transactions.", this.Transactions);
        this.setParamSimple(map, prefix + "DeadlockId", this.DeadlockId);
        this.setParamSimple(map, prefix + "XmlReport", this.XmlReport);
        this.setParamSimple(map, prefix + "OriginalXmlBytes", this.OriginalXmlBytes);
        this.setParamArraySimple(map, prefix + "VictimSessionIds.", this.VictimSessionIds);
        this.setParamSimple(map, prefix + "IsPartial", this.IsPartial);
        this.setParamArraySimple(map, prefix + "DatabaseNames.", this.DatabaseNames);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "DeadlockSignature", this.DeadlockSignature);
        this.setParamArrayObj(map, prefix + "Resources.", this.Resources);
        this.setParamSimple(map, prefix + "AssociationStatus", this.AssociationStatus);
        this.setParamSimple(map, prefix + "TransactionCount", this.TransactionCount);

    }
}

