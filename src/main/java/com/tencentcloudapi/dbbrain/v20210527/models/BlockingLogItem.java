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

public class BlockingLogItem extends AbstractModel {

    /**
    * <p>本条明细行上报时间（事件时间，__time；时区UTC+8），格式：yyyy-MM-dd HH:mm:ss。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReportTime")
    @Expose
    private String ReportTime;

    /**
    * <p>监控轮次ID（同一实例内唯一标识一次采集快照，可透传至DescribeBlockingLockTree下钻查看完整阻塞树）。文本承载数值。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MonitorLoop")
    @Expose
    private String MonitorLoop;

    /**
    * <p>被阻塞方的等待时长（毫秒）。来源：Kafka顶层Fields.duration÷1000（微秒→毫秒），来自SQL Server内核XEvent事件的duration字段。与BlockedWaitTimeMs来源不同但通常非常接近（非严格相等，两者为同一事件的两个独立快照）；仅为OrderBy=durationMs排序别名保留。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DurationMs")
    @Expose
    private Long DurationMs;

    /**
    * <p>阻塞发生所在的数据库名称。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * <p>阻塞发生所在的数据库 ID（Fields.database_id，对应 SQL Server sys.databases.database_id）。可配合 DatabaseName 使用：ID 稳定、Name 易读；Name 在重命名场景下会变化，ID 则不会。采样为空时该字段不返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseId")
    @Expose
    private Long DatabaseId;

    /**
    * <p>阻塞锁资源归属的对象 ID（Fields.object_id，对应 SQL Server sys.objects.object_id）。标识具体的表/视图/存储过程等用户对象；可结合 sys.objects 元数据查询对象名。采样为空时该字段不返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ObjectId")
    @Expose
    private Long ObjectId;

    /**
    * <p>阻塞锁资源归属的索引 ID（Fields.index_id，对应 SQL Server sys.indexes.index_id）。常见取值：0=堆（无聚集索引）、1=聚集索引、&gt;1=非聚集索引；&gt;250 通常为系统内部索引（如全文/XML/空间索引），诊断时按&quot;是否为用户索引&quot;判断即可。采样为空时该字段不返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexId")
    @Expose
    private Long IndexId;

    /**
    * <p>根因分类（与枚举BlockingRootCause一一对应）。取值：C1_LONG_QUERY=长查询正常运行阻塞；C2_SLEEPING_UNCOMMITTED=休眠会话且存在未提交事务；C3_CLIENT_NOT_FETCHING=客户端未取完结果行；C4_APP_DEADLOCK=应用层分布式死锁；C5_ROLLBACK=会话正在rollback；C6_ORPHAN_TRANSACTION=孤立事务；UNKNOWN=未识别。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RootCause")
    @Expose
    private String RootCause;

    /**
    * <p>根因分类的可读中文描述（服务端已完成中文化，前端可直接展示；与RootCause代号一一对应，例如C1_LONG_QUERY→&quot;长查询正常运行阻塞，考虑优化SQL/索引&quot;，未识别或空值统一返回&quot;未识别&quot;）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RootCauseDesc")
    @Expose
    private String RootCauseDesc;

    /**
    * <p>头阻塞会话 ID（对应 SQL Server sys.dm_exec_sessions.session_id，即 SPID）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlockingSessionId")
    @Expose
    private Long BlockingSessionId;

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
    * <p>头阻塞会话运行时状态（SQL Server sys.dm_exec_sessions.status文本），常见取值：running / sleeping / suspended / background。sleeping+trancount&gt;0是C2_SLEEPING_UNCOMMITTED（休眠会话持未提交事务）的直接证据。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlockingStatus")
    @Expose
    private String BlockingStatus;

    /**
    * <p>头阻塞会话事务隔离级别（SQL Server原生取值：read uncommitted / read committed / repeatable read / serializable / snapshot）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlockingIsolationLevel")
    @Expose
    private String BlockingIsolationLevel;

    /**
    * <p>头阻塞会话当前显式事务名（XEvent transactionname，如user_transaction / implicit_transaction）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlockingTransactionName")
    @Expose
    private String BlockingTransactionName;

    /**
    * <p>头阻塞会话当前显式事务嵌套层数（XEvent trancount）。&gt;0表示持有显式事务；与BlockingStatus=sleeping组合是C2_SLEEPING_UNCOMMITTED（休眠会话持未提交事务）的直接证据。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlockingTranCount")
    @Expose
    private Long BlockingTranCount;

    /**
    * <p>头阻塞会话显式事务BEGIN TRAN时刻（XEvent lasttranstarted，SQL Server服务端本地时区的ISO 8601字符串，无时区后缀）。该字段代表事务持锁开始时刻：ReportTime-BlockingLastTranStarted≈事务持锁时长，用于C1_LONG_QUERY / C6_ORPHAN_TRANSACTION根因复核；在多语句事务场景下比lastbatchstarted更稳定（不会被每个新batch刷新）。值为空表示XML未提供该属性（blocking-process侧常见）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlockingLastTranStarted")
    @Expose
    private String BlockingLastTranStarted;

    /**
    * <p>头阻塞会话正在执行的SQL原文（对应DBCC INPUTBUFFER返回内容，单条最长16KB，超长截断）。</p>
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
    * <p>头阻塞会话持有或请求的锁模式（SQL Server原生lock_mode枚举；blocker通常不处于等锁状态，该字段多为空）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlockingLockMode")
    @Expose
    private String BlockingLockMode;

    /**
    * <p>头阻塞会话自身的等待时长（毫秒）。多数场景为0。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlockingWaitTimeMs")
    @Expose
    private Long BlockingWaitTimeMs;

    /**
    * <p>被阻塞会话 ID（对应 SQL Server sys.dm_exec_sessions.session_id，即 SPID）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlockedSessionId")
    @Expose
    private Long BlockedSessionId;

    /**
    * <p>被阻塞会话事务ID（SQL Server transaction_id，bigint）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlockedTransactionId")
    @Expose
    private Long BlockedTransactionId;

    /**
    * <p>被阻塞会话等待时长（毫秒）。来源：XML &lt;blocked-process&gt;&lt;process waittime&gt;属性（来自ys.dm_os_waiting_tasks.wait_duration_ms在report生成瞬间的快照）。与DurationMs来源不同但通常非常接近；仅为OrderBy=blockedWaitTimeMs排序别名保留。</p>
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
    * <p>被阻塞会话运行时状态（SQL Server sys.dm_exec_sessions.status文本），常见取值：running / sleeping / suspended / background。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlockedStatus")
    @Expose
    private String BlockedStatus;

    /**
    * <p>被阻塞会话事务隔离级别（SQL Server原生取值：read uncommitted / read committed / repeatable read / serializable / snapshot）。</p>
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
    * <p>被阻塞会话显式事务BEGIN TRAN时刻（XEvent lasttranstarted，SQL Server服务端本地时区的ISO 8601字符串，无时区后缀）。该字段代表事务开始时刻，在多语句事务场景下比lastbatchstarted更稳定。咨视值1900-01-01T00:00:00表示未知。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlockedLastTranStarted")
    @Expose
    private String BlockedLastTranStarted;

    /**
    * <p>被阻塞会话正在执行的SQL原文（对应DBCC INPUTBUFFER返回内容，单条最长16KB，超长截断）。</p>
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
    * <p>被阻塞方 blocked_process_report 原始 XML 文本（含完整执行计划、等待链、死锁明细等原始现场；字段体积较大，KB 级起步）。仅当请求参数 WithXml=true 时才返回；默认 false 时该字段省略，不出现在响应体中。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlockedProcessXml")
    @Expose
    private String BlockedProcessXml;

    /**
     * Get <p>本条明细行上报时间（事件时间，__time；时区UTC+8），格式：yyyy-MM-dd HH:mm:ss。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReportTime <p>本条明细行上报时间（事件时间，__time；时区UTC+8），格式：yyyy-MM-dd HH:mm:ss。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReportTime() {
        return this.ReportTime;
    }

    /**
     * Set <p>本条明细行上报时间（事件时间，__time；时区UTC+8），格式：yyyy-MM-dd HH:mm:ss。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReportTime <p>本条明细行上报时间（事件时间，__time；时区UTC+8），格式：yyyy-MM-dd HH:mm:ss。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReportTime(String ReportTime) {
        this.ReportTime = ReportTime;
    }

    /**
     * Get <p>监控轮次ID（同一实例内唯一标识一次采集快照，可透传至DescribeBlockingLockTree下钻查看完整阻塞树）。文本承载数值。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MonitorLoop <p>监控轮次ID（同一实例内唯一标识一次采集快照，可透传至DescribeBlockingLockTree下钻查看完整阻塞树）。文本承载数值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMonitorLoop() {
        return this.MonitorLoop;
    }

    /**
     * Set <p>监控轮次ID（同一实例内唯一标识一次采集快照，可透传至DescribeBlockingLockTree下钻查看完整阻塞树）。文本承载数值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MonitorLoop <p>监控轮次ID（同一实例内唯一标识一次采集快照，可透传至DescribeBlockingLockTree下钻查看完整阻塞树）。文本承载数值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMonitorLoop(String MonitorLoop) {
        this.MonitorLoop = MonitorLoop;
    }

    /**
     * Get <p>被阻塞方的等待时长（毫秒）。来源：Kafka顶层Fields.duration÷1000（微秒→毫秒），来自SQL Server内核XEvent事件的duration字段。与BlockedWaitTimeMs来源不同但通常非常接近（非严格相等，两者为同一事件的两个独立快照）；仅为OrderBy=durationMs排序别名保留。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DurationMs <p>被阻塞方的等待时长（毫秒）。来源：Kafka顶层Fields.duration÷1000（微秒→毫秒），来自SQL Server内核XEvent事件的duration字段。与BlockedWaitTimeMs来源不同但通常非常接近（非严格相等，两者为同一事件的两个独立快照）；仅为OrderBy=durationMs排序别名保留。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDurationMs() {
        return this.DurationMs;
    }

    /**
     * Set <p>被阻塞方的等待时长（毫秒）。来源：Kafka顶层Fields.duration÷1000（微秒→毫秒），来自SQL Server内核XEvent事件的duration字段。与BlockedWaitTimeMs来源不同但通常非常接近（非严格相等，两者为同一事件的两个独立快照）；仅为OrderBy=durationMs排序别名保留。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DurationMs <p>被阻塞方的等待时长（毫秒）。来源：Kafka顶层Fields.duration÷1000（微秒→毫秒），来自SQL Server内核XEvent事件的duration字段。与BlockedWaitTimeMs来源不同但通常非常接近（非严格相等，两者为同一事件的两个独立快照）；仅为OrderBy=durationMs排序别名保留。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDurationMs(Long DurationMs) {
        this.DurationMs = DurationMs;
    }

    /**
     * Get <p>阻塞发生所在的数据库名称。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseName <p>阻塞发生所在的数据库名称。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set <p>阻塞发生所在的数据库名称。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseName <p>阻塞发生所在的数据库名称。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get <p>阻塞发生所在的数据库 ID（Fields.database_id，对应 SQL Server sys.databases.database_id）。可配合 DatabaseName 使用：ID 稳定、Name 易读；Name 在重命名场景下会变化，ID 则不会。采样为空时该字段不返回。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseId <p>阻塞发生所在的数据库 ID（Fields.database_id，对应 SQL Server sys.databases.database_id）。可配合 DatabaseName 使用：ID 稳定、Name 易读；Name 在重命名场景下会变化，ID 则不会。采样为空时该字段不返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDatabaseId() {
        return this.DatabaseId;
    }

    /**
     * Set <p>阻塞发生所在的数据库 ID（Fields.database_id，对应 SQL Server sys.databases.database_id）。可配合 DatabaseName 使用：ID 稳定、Name 易读；Name 在重命名场景下会变化，ID 则不会。采样为空时该字段不返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseId <p>阻塞发生所在的数据库 ID（Fields.database_id，对应 SQL Server sys.databases.database_id）。可配合 DatabaseName 使用：ID 稳定、Name 易读；Name 在重命名场景下会变化，ID 则不会。采样为空时该字段不返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabaseId(Long DatabaseId) {
        this.DatabaseId = DatabaseId;
    }

    /**
     * Get <p>阻塞锁资源归属的对象 ID（Fields.object_id，对应 SQL Server sys.objects.object_id）。标识具体的表/视图/存储过程等用户对象；可结合 sys.objects 元数据查询对象名。采样为空时该字段不返回。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ObjectId <p>阻塞锁资源归属的对象 ID（Fields.object_id，对应 SQL Server sys.objects.object_id）。标识具体的表/视图/存储过程等用户对象；可结合 sys.objects 元数据查询对象名。采样为空时该字段不返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getObjectId() {
        return this.ObjectId;
    }

    /**
     * Set <p>阻塞锁资源归属的对象 ID（Fields.object_id，对应 SQL Server sys.objects.object_id）。标识具体的表/视图/存储过程等用户对象；可结合 sys.objects 元数据查询对象名。采样为空时该字段不返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ObjectId <p>阻塞锁资源归属的对象 ID（Fields.object_id，对应 SQL Server sys.objects.object_id）。标识具体的表/视图/存储过程等用户对象；可结合 sys.objects 元数据查询对象名。采样为空时该字段不返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObjectId(Long ObjectId) {
        this.ObjectId = ObjectId;
    }

    /**
     * Get <p>阻塞锁资源归属的索引 ID（Fields.index_id，对应 SQL Server sys.indexes.index_id）。常见取值：0=堆（无聚集索引）、1=聚集索引、&gt;1=非聚集索引；&gt;250 通常为系统内部索引（如全文/XML/空间索引），诊断时按&quot;是否为用户索引&quot;判断即可。采样为空时该字段不返回。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexId <p>阻塞锁资源归属的索引 ID（Fields.index_id，对应 SQL Server sys.indexes.index_id）。常见取值：0=堆（无聚集索引）、1=聚集索引、&gt;1=非聚集索引；&gt;250 通常为系统内部索引（如全文/XML/空间索引），诊断时按&quot;是否为用户索引&quot;判断即可。采样为空时该字段不返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIndexId() {
        return this.IndexId;
    }

    /**
     * Set <p>阻塞锁资源归属的索引 ID（Fields.index_id，对应 SQL Server sys.indexes.index_id）。常见取值：0=堆（无聚集索引）、1=聚集索引、&gt;1=非聚集索引；&gt;250 通常为系统内部索引（如全文/XML/空间索引），诊断时按&quot;是否为用户索引&quot;判断即可。采样为空时该字段不返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexId <p>阻塞锁资源归属的索引 ID（Fields.index_id，对应 SQL Server sys.indexes.index_id）。常见取值：0=堆（无聚集索引）、1=聚集索引、&gt;1=非聚集索引；&gt;250 通常为系统内部索引（如全文/XML/空间索引），诊断时按&quot;是否为用户索引&quot;判断即可。采样为空时该字段不返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexId(Long IndexId) {
        this.IndexId = IndexId;
    }

    /**
     * Get <p>根因分类（与枚举BlockingRootCause一一对应）。取值：C1_LONG_QUERY=长查询正常运行阻塞；C2_SLEEPING_UNCOMMITTED=休眠会话且存在未提交事务；C3_CLIENT_NOT_FETCHING=客户端未取完结果行；C4_APP_DEADLOCK=应用层分布式死锁；C5_ROLLBACK=会话正在rollback；C6_ORPHAN_TRANSACTION=孤立事务；UNKNOWN=未识别。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RootCause <p>根因分类（与枚举BlockingRootCause一一对应）。取值：C1_LONG_QUERY=长查询正常运行阻塞；C2_SLEEPING_UNCOMMITTED=休眠会话且存在未提交事务；C3_CLIENT_NOT_FETCHING=客户端未取完结果行；C4_APP_DEADLOCK=应用层分布式死锁；C5_ROLLBACK=会话正在rollback；C6_ORPHAN_TRANSACTION=孤立事务；UNKNOWN=未识别。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRootCause() {
        return this.RootCause;
    }

    /**
     * Set <p>根因分类（与枚举BlockingRootCause一一对应）。取值：C1_LONG_QUERY=长查询正常运行阻塞；C2_SLEEPING_UNCOMMITTED=休眠会话且存在未提交事务；C3_CLIENT_NOT_FETCHING=客户端未取完结果行；C4_APP_DEADLOCK=应用层分布式死锁；C5_ROLLBACK=会话正在rollback；C6_ORPHAN_TRANSACTION=孤立事务；UNKNOWN=未识别。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RootCause <p>根因分类（与枚举BlockingRootCause一一对应）。取值：C1_LONG_QUERY=长查询正常运行阻塞；C2_SLEEPING_UNCOMMITTED=休眠会话且存在未提交事务；C3_CLIENT_NOT_FETCHING=客户端未取完结果行；C4_APP_DEADLOCK=应用层分布式死锁；C5_ROLLBACK=会话正在rollback；C6_ORPHAN_TRANSACTION=孤立事务；UNKNOWN=未识别。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRootCause(String RootCause) {
        this.RootCause = RootCause;
    }

    /**
     * Get <p>根因分类的可读中文描述（服务端已完成中文化，前端可直接展示；与RootCause代号一一对应，例如C1_LONG_QUERY→&quot;长查询正常运行阻塞，考虑优化SQL/索引&quot;，未识别或空值统一返回&quot;未识别&quot;）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RootCauseDesc <p>根因分类的可读中文描述（服务端已完成中文化，前端可直接展示；与RootCause代号一一对应，例如C1_LONG_QUERY→&quot;长查询正常运行阻塞，考虑优化SQL/索引&quot;，未识别或空值统一返回&quot;未识别&quot;）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRootCauseDesc() {
        return this.RootCauseDesc;
    }

    /**
     * Set <p>根因分类的可读中文描述（服务端已完成中文化，前端可直接展示；与RootCause代号一一对应，例如C1_LONG_QUERY→&quot;长查询正常运行阻塞，考虑优化SQL/索引&quot;，未识别或空值统一返回&quot;未识别&quot;）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RootCauseDesc <p>根因分类的可读中文描述（服务端已完成中文化，前端可直接展示；与RootCause代号一一对应，例如C1_LONG_QUERY→&quot;长查询正常运行阻塞，考虑优化SQL/索引&quot;，未识别或空值统一返回&quot;未识别&quot;）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRootCauseDesc(String RootCauseDesc) {
        this.RootCauseDesc = RootCauseDesc;
    }

    /**
     * Get <p>头阻塞会话 ID（对应 SQL Server sys.dm_exec_sessions.session_id，即 SPID）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockingSessionId <p>头阻塞会话 ID（对应 SQL Server sys.dm_exec_sessions.session_id，即 SPID）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBlockingSessionId() {
        return this.BlockingSessionId;
    }

    /**
     * Set <p>头阻塞会话 ID（对应 SQL Server sys.dm_exec_sessions.session_id，即 SPID）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockingSessionId <p>头阻塞会话 ID（对应 SQL Server sys.dm_exec_sessions.session_id，即 SPID）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlockingSessionId(Long BlockingSessionId) {
        this.BlockingSessionId = BlockingSessionId;
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
     * Get <p>头阻塞会话运行时状态（SQL Server sys.dm_exec_sessions.status文本），常见取值：running / sleeping / suspended / background。sleeping+trancount&gt;0是C2_SLEEPING_UNCOMMITTED（休眠会话持未提交事务）的直接证据。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockingStatus <p>头阻塞会话运行时状态（SQL Server sys.dm_exec_sessions.status文本），常见取值：running / sleeping / suspended / background。sleeping+trancount&gt;0是C2_SLEEPING_UNCOMMITTED（休眠会话持未提交事务）的直接证据。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBlockingStatus() {
        return this.BlockingStatus;
    }

    /**
     * Set <p>头阻塞会话运行时状态（SQL Server sys.dm_exec_sessions.status文本），常见取值：running / sleeping / suspended / background。sleeping+trancount&gt;0是C2_SLEEPING_UNCOMMITTED（休眠会话持未提交事务）的直接证据。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockingStatus <p>头阻塞会话运行时状态（SQL Server sys.dm_exec_sessions.status文本），常见取值：running / sleeping / suspended / background。sleeping+trancount&gt;0是C2_SLEEPING_UNCOMMITTED（休眠会话持未提交事务）的直接证据。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlockingStatus(String BlockingStatus) {
        this.BlockingStatus = BlockingStatus;
    }

    /**
     * Get <p>头阻塞会话事务隔离级别（SQL Server原生取值：read uncommitted / read committed / repeatable read / serializable / snapshot）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockingIsolationLevel <p>头阻塞会话事务隔离级别（SQL Server原生取值：read uncommitted / read committed / repeatable read / serializable / snapshot）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBlockingIsolationLevel() {
        return this.BlockingIsolationLevel;
    }

    /**
     * Set <p>头阻塞会话事务隔离级别（SQL Server原生取值：read uncommitted / read committed / repeatable read / serializable / snapshot）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockingIsolationLevel <p>头阻塞会话事务隔离级别（SQL Server原生取值：read uncommitted / read committed / repeatable read / serializable / snapshot）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlockingIsolationLevel(String BlockingIsolationLevel) {
        this.BlockingIsolationLevel = BlockingIsolationLevel;
    }

    /**
     * Get <p>头阻塞会话当前显式事务名（XEvent transactionname，如user_transaction / implicit_transaction）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockingTransactionName <p>头阻塞会话当前显式事务名（XEvent transactionname，如user_transaction / implicit_transaction）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBlockingTransactionName() {
        return this.BlockingTransactionName;
    }

    /**
     * Set <p>头阻塞会话当前显式事务名（XEvent transactionname，如user_transaction / implicit_transaction）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockingTransactionName <p>头阻塞会话当前显式事务名（XEvent transactionname，如user_transaction / implicit_transaction）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlockingTransactionName(String BlockingTransactionName) {
        this.BlockingTransactionName = BlockingTransactionName;
    }

    /**
     * Get <p>头阻塞会话当前显式事务嵌套层数（XEvent trancount）。&gt;0表示持有显式事务；与BlockingStatus=sleeping组合是C2_SLEEPING_UNCOMMITTED（休眠会话持未提交事务）的直接证据。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockingTranCount <p>头阻塞会话当前显式事务嵌套层数（XEvent trancount）。&gt;0表示持有显式事务；与BlockingStatus=sleeping组合是C2_SLEEPING_UNCOMMITTED（休眠会话持未提交事务）的直接证据。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBlockingTranCount() {
        return this.BlockingTranCount;
    }

    /**
     * Set <p>头阻塞会话当前显式事务嵌套层数（XEvent trancount）。&gt;0表示持有显式事务；与BlockingStatus=sleeping组合是C2_SLEEPING_UNCOMMITTED（休眠会话持未提交事务）的直接证据。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockingTranCount <p>头阻塞会话当前显式事务嵌套层数（XEvent trancount）。&gt;0表示持有显式事务；与BlockingStatus=sleeping组合是C2_SLEEPING_UNCOMMITTED（休眠会话持未提交事务）的直接证据。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlockingTranCount(Long BlockingTranCount) {
        this.BlockingTranCount = BlockingTranCount;
    }

    /**
     * Get <p>头阻塞会话显式事务BEGIN TRAN时刻（XEvent lasttranstarted，SQL Server服务端本地时区的ISO 8601字符串，无时区后缀）。该字段代表事务持锁开始时刻：ReportTime-BlockingLastTranStarted≈事务持锁时长，用于C1_LONG_QUERY / C6_ORPHAN_TRANSACTION根因复核；在多语句事务场景下比lastbatchstarted更稳定（不会被每个新batch刷新）。值为空表示XML未提供该属性（blocking-process侧常见）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockingLastTranStarted <p>头阻塞会话显式事务BEGIN TRAN时刻（XEvent lasttranstarted，SQL Server服务端本地时区的ISO 8601字符串，无时区后缀）。该字段代表事务持锁开始时刻：ReportTime-BlockingLastTranStarted≈事务持锁时长，用于C1_LONG_QUERY / C6_ORPHAN_TRANSACTION根因复核；在多语句事务场景下比lastbatchstarted更稳定（不会被每个新batch刷新）。值为空表示XML未提供该属性（blocking-process侧常见）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBlockingLastTranStarted() {
        return this.BlockingLastTranStarted;
    }

    /**
     * Set <p>头阻塞会话显式事务BEGIN TRAN时刻（XEvent lasttranstarted，SQL Server服务端本地时区的ISO 8601字符串，无时区后缀）。该字段代表事务持锁开始时刻：ReportTime-BlockingLastTranStarted≈事务持锁时长，用于C1_LONG_QUERY / C6_ORPHAN_TRANSACTION根因复核；在多语句事务场景下比lastbatchstarted更稳定（不会被每个新batch刷新）。值为空表示XML未提供该属性（blocking-process侧常见）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockingLastTranStarted <p>头阻塞会话显式事务BEGIN TRAN时刻（XEvent lasttranstarted，SQL Server服务端本地时区的ISO 8601字符串，无时区后缀）。该字段代表事务持锁开始时刻：ReportTime-BlockingLastTranStarted≈事务持锁时长，用于C1_LONG_QUERY / C6_ORPHAN_TRANSACTION根因复核；在多语句事务场景下比lastbatchstarted更稳定（不会被每个新batch刷新）。值为空表示XML未提供该属性（blocking-process侧常见）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlockingLastTranStarted(String BlockingLastTranStarted) {
        this.BlockingLastTranStarted = BlockingLastTranStarted;
    }

    /**
     * Get <p>头阻塞会话正在执行的SQL原文（对应DBCC INPUTBUFFER返回内容，单条最长16KB，超长截断）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockingInputBuffer <p>头阻塞会话正在执行的SQL原文（对应DBCC INPUTBUFFER返回内容，单条最长16KB，超长截断）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBlockingInputBuffer() {
        return this.BlockingInputBuffer;
    }

    /**
     * Set <p>头阻塞会话正在执行的SQL原文（对应DBCC INPUTBUFFER返回内容，单条最长16KB，超长截断）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockingInputBuffer <p>头阻塞会话正在执行的SQL原文（对应DBCC INPUTBUFFER返回内容，单条最长16KB，超长截断）。</p>
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
     * Get <p>头阻塞会话持有或请求的锁模式（SQL Server原生lock_mode枚举；blocker通常不处于等锁状态，该字段多为空）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockingLockMode <p>头阻塞会话持有或请求的锁模式（SQL Server原生lock_mode枚举；blocker通常不处于等锁状态，该字段多为空）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBlockingLockMode() {
        return this.BlockingLockMode;
    }

    /**
     * Set <p>头阻塞会话持有或请求的锁模式（SQL Server原生lock_mode枚举；blocker通常不处于等锁状态，该字段多为空）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockingLockMode <p>头阻塞会话持有或请求的锁模式（SQL Server原生lock_mode枚举；blocker通常不处于等锁状态，该字段多为空）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlockingLockMode(String BlockingLockMode) {
        this.BlockingLockMode = BlockingLockMode;
    }

    /**
     * Get <p>头阻塞会话自身的等待时长（毫秒）。多数场景为0。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockingWaitTimeMs <p>头阻塞会话自身的等待时长（毫秒）。多数场景为0。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBlockingWaitTimeMs() {
        return this.BlockingWaitTimeMs;
    }

    /**
     * Set <p>头阻塞会话自身的等待时长（毫秒）。多数场景为0。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockingWaitTimeMs <p>头阻塞会话自身的等待时长（毫秒）。多数场景为0。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlockingWaitTimeMs(Long BlockingWaitTimeMs) {
        this.BlockingWaitTimeMs = BlockingWaitTimeMs;
    }

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
     * Get <p>被阻塞会话事务ID（SQL Server transaction_id，bigint）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockedTransactionId <p>被阻塞会话事务ID（SQL Server transaction_id，bigint）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBlockedTransactionId() {
        return this.BlockedTransactionId;
    }

    /**
     * Set <p>被阻塞会话事务ID（SQL Server transaction_id，bigint）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockedTransactionId <p>被阻塞会话事务ID（SQL Server transaction_id，bigint）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlockedTransactionId(Long BlockedTransactionId) {
        this.BlockedTransactionId = BlockedTransactionId;
    }

    /**
     * Get <p>被阻塞会话等待时长（毫秒）。来源：XML &lt;blocked-process&gt;&lt;process waittime&gt;属性（来自ys.dm_os_waiting_tasks.wait_duration_ms在report生成瞬间的快照）。与DurationMs来源不同但通常非常接近；仅为OrderBy=blockedWaitTimeMs排序别名保留。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockedWaitTimeMs <p>被阻塞会话等待时长（毫秒）。来源：XML &lt;blocked-process&gt;&lt;process waittime&gt;属性（来自ys.dm_os_waiting_tasks.wait_duration_ms在report生成瞬间的快照）。与DurationMs来源不同但通常非常接近；仅为OrderBy=blockedWaitTimeMs排序别名保留。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBlockedWaitTimeMs() {
        return this.BlockedWaitTimeMs;
    }

    /**
     * Set <p>被阻塞会话等待时长（毫秒）。来源：XML &lt;blocked-process&gt;&lt;process waittime&gt;属性（来自ys.dm_os_waiting_tasks.wait_duration_ms在report生成瞬间的快照）。与DurationMs来源不同但通常非常接近；仅为OrderBy=blockedWaitTimeMs排序别名保留。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockedWaitTimeMs <p>被阻塞会话等待时长（毫秒）。来源：XML &lt;blocked-process&gt;&lt;process waittime&gt;属性（来自ys.dm_os_waiting_tasks.wait_duration_ms在report生成瞬间的快照）。与DurationMs来源不同但通常非常接近；仅为OrderBy=blockedWaitTimeMs排序别名保留。</p>
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
     * Get <p>被阻塞会话运行时状态（SQL Server sys.dm_exec_sessions.status文本），常见取值：running / sleeping / suspended / background。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockedStatus <p>被阻塞会话运行时状态（SQL Server sys.dm_exec_sessions.status文本），常见取值：running / sleeping / suspended / background。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBlockedStatus() {
        return this.BlockedStatus;
    }

    /**
     * Set <p>被阻塞会话运行时状态（SQL Server sys.dm_exec_sessions.status文本），常见取值：running / sleeping / suspended / background。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockedStatus <p>被阻塞会话运行时状态（SQL Server sys.dm_exec_sessions.status文本），常见取值：running / sleeping / suspended / background。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlockedStatus(String BlockedStatus) {
        this.BlockedStatus = BlockedStatus;
    }

    /**
     * Get <p>被阻塞会话事务隔离级别（SQL Server原生取值：read uncommitted / read committed / repeatable read / serializable / snapshot）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockedIsolationLevel <p>被阻塞会话事务隔离级别（SQL Server原生取值：read uncommitted / read committed / repeatable read / serializable / snapshot）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBlockedIsolationLevel() {
        return this.BlockedIsolationLevel;
    }

    /**
     * Set <p>被阻塞会话事务隔离级别（SQL Server原生取值：read uncommitted / read committed / repeatable read / serializable / snapshot）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockedIsolationLevel <p>被阻塞会话事务隔离级别（SQL Server原生取值：read uncommitted / read committed / repeatable read / serializable / snapshot）。</p>
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
     * Get <p>被阻塞会话显式事务BEGIN TRAN时刻（XEvent lasttranstarted，SQL Server服务端本地时区的ISO 8601字符串，无时区后缀）。该字段代表事务开始时刻，在多语句事务场景下比lastbatchstarted更稳定。咨视值1900-01-01T00:00:00表示未知。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockedLastTranStarted <p>被阻塞会话显式事务BEGIN TRAN时刻（XEvent lasttranstarted，SQL Server服务端本地时区的ISO 8601字符串，无时区后缀）。该字段代表事务开始时刻，在多语句事务场景下比lastbatchstarted更稳定。咨视值1900-01-01T00:00:00表示未知。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBlockedLastTranStarted() {
        return this.BlockedLastTranStarted;
    }

    /**
     * Set <p>被阻塞会话显式事务BEGIN TRAN时刻（XEvent lasttranstarted，SQL Server服务端本地时区的ISO 8601字符串，无时区后缀）。该字段代表事务开始时刻，在多语句事务场景下比lastbatchstarted更稳定。咨视值1900-01-01T00:00:00表示未知。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockedLastTranStarted <p>被阻塞会话显式事务BEGIN TRAN时刻（XEvent lasttranstarted，SQL Server服务端本地时区的ISO 8601字符串，无时区后缀）。该字段代表事务开始时刻，在多语句事务场景下比lastbatchstarted更稳定。咨视值1900-01-01T00:00:00表示未知。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlockedLastTranStarted(String BlockedLastTranStarted) {
        this.BlockedLastTranStarted = BlockedLastTranStarted;
    }

    /**
     * Get <p>被阻塞会话正在执行的SQL原文（对应DBCC INPUTBUFFER返回内容，单条最长16KB，超长截断）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockedInputBuffer <p>被阻塞会话正在执行的SQL原文（对应DBCC INPUTBUFFER返回内容，单条最长16KB，超长截断）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBlockedInputBuffer() {
        return this.BlockedInputBuffer;
    }

    /**
     * Set <p>被阻塞会话正在执行的SQL原文（对应DBCC INPUTBUFFER返回内容，单条最长16KB，超长截断）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockedInputBuffer <p>被阻塞会话正在执行的SQL原文（对应DBCC INPUTBUFFER返回内容，单条最长16KB，超长截断）。</p>
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
     * Get <p>被阻塞方 blocked_process_report 原始 XML 文本（含完整执行计划、等待链、死锁明细等原始现场；字段体积较大，KB 级起步）。仅当请求参数 WithXml=true 时才返回；默认 false 时该字段省略，不出现在响应体中。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockedProcessXml <p>被阻塞方 blocked_process_report 原始 XML 文本（含完整执行计划、等待链、死锁明细等原始现场；字段体积较大，KB 级起步）。仅当请求参数 WithXml=true 时才返回；默认 false 时该字段省略，不出现在响应体中。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBlockedProcessXml() {
        return this.BlockedProcessXml;
    }

    /**
     * Set <p>被阻塞方 blocked_process_report 原始 XML 文本（含完整执行计划、等待链、死锁明细等原始现场；字段体积较大，KB 级起步）。仅当请求参数 WithXml=true 时才返回；默认 false 时该字段省略，不出现在响应体中。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockedProcessXml <p>被阻塞方 blocked_process_report 原始 XML 文本（含完整执行计划、等待链、死锁明细等原始现场；字段体积较大，KB 级起步）。仅当请求参数 WithXml=true 时才返回；默认 false 时该字段省略，不出现在响应体中。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlockedProcessXml(String BlockedProcessXml) {
        this.BlockedProcessXml = BlockedProcessXml;
    }

    public BlockingLogItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BlockingLogItem(BlockingLogItem source) {
        if (source.ReportTime != null) {
            this.ReportTime = new String(source.ReportTime);
        }
        if (source.MonitorLoop != null) {
            this.MonitorLoop = new String(source.MonitorLoop);
        }
        if (source.DurationMs != null) {
            this.DurationMs = new Long(source.DurationMs);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.DatabaseId != null) {
            this.DatabaseId = new Long(source.DatabaseId);
        }
        if (source.ObjectId != null) {
            this.ObjectId = new Long(source.ObjectId);
        }
        if (source.IndexId != null) {
            this.IndexId = new Long(source.IndexId);
        }
        if (source.RootCause != null) {
            this.RootCause = new String(source.RootCause);
        }
        if (source.RootCauseDesc != null) {
            this.RootCauseDesc = new String(source.RootCauseDesc);
        }
        if (source.BlockingSessionId != null) {
            this.BlockingSessionId = new Long(source.BlockingSessionId);
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
        if (source.BlockingTransactionName != null) {
            this.BlockingTransactionName = new String(source.BlockingTransactionName);
        }
        if (source.BlockingTranCount != null) {
            this.BlockingTranCount = new Long(source.BlockingTranCount);
        }
        if (source.BlockingLastTranStarted != null) {
            this.BlockingLastTranStarted = new String(source.BlockingLastTranStarted);
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
        if (source.BlockingLockMode != null) {
            this.BlockingLockMode = new String(source.BlockingLockMode);
        }
        if (source.BlockingWaitTimeMs != null) {
            this.BlockingWaitTimeMs = new Long(source.BlockingWaitTimeMs);
        }
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
        if (source.BlockedProcessXml != null) {
            this.BlockedProcessXml = new String(source.BlockedProcessXml);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReportTime", this.ReportTime);
        this.setParamSimple(map, prefix + "MonitorLoop", this.MonitorLoop);
        this.setParamSimple(map, prefix + "DurationMs", this.DurationMs);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "DatabaseId", this.DatabaseId);
        this.setParamSimple(map, prefix + "ObjectId", this.ObjectId);
        this.setParamSimple(map, prefix + "IndexId", this.IndexId);
        this.setParamSimple(map, prefix + "RootCause", this.RootCause);
        this.setParamSimple(map, prefix + "RootCauseDesc", this.RootCauseDesc);
        this.setParamSimple(map, prefix + "BlockingSessionId", this.BlockingSessionId);
        this.setParamSimple(map, prefix + "BlockingLoginName", this.BlockingLoginName);
        this.setParamSimple(map, prefix + "BlockingHostName", this.BlockingHostName);
        this.setParamSimple(map, prefix + "BlockingClientApp", this.BlockingClientApp);
        this.setParamSimple(map, prefix + "BlockingStatus", this.BlockingStatus);
        this.setParamSimple(map, prefix + "BlockingIsolationLevel", this.BlockingIsolationLevel);
        this.setParamSimple(map, prefix + "BlockingTransactionName", this.BlockingTransactionName);
        this.setParamSimple(map, prefix + "BlockingTranCount", this.BlockingTranCount);
        this.setParamSimple(map, prefix + "BlockingLastTranStarted", this.BlockingLastTranStarted);
        this.setParamSimple(map, prefix + "BlockingInputBuffer", this.BlockingInputBuffer);
        this.setParamSimple(map, prefix + "BlockingSqlTemplate", this.BlockingSqlTemplate);
        this.setParamSimple(map, prefix + "BlockingSqlMd5", this.BlockingSqlMd5);
        this.setParamSimple(map, prefix + "BlockingLockMode", this.BlockingLockMode);
        this.setParamSimple(map, prefix + "BlockingWaitTimeMs", this.BlockingWaitTimeMs);
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
        this.setParamSimple(map, prefix + "BlockedProcessXml", this.BlockedProcessXml);

    }
}

