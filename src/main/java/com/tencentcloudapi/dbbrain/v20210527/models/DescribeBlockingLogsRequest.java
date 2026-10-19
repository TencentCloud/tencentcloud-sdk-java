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

public class DescribeBlockingLogsRequest extends AbstractModel {

    /**
    * <p>实例ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>服务产品类型，固定为sqlserver。</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * <p>查询起始时间（服务端时区 UTC+8），格式：yyyy-MM-dd HH:mm:ss。必须在最近 30 天内，否则返回 InvalidParameterValue。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>查询结束时间（服务端时区 UTC+8），格式：yyyy-MM-dd HH:mm:ss，需大于 StartTime。单次查询跨度必须 ≤ 1 天（24 小时），否则返回 InvalidParameterValue。大跨度趋势场景请改用 DescribeBlockingTrend。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>根因过滤（可选），支持：C1_LONG_QUERY=长事务查询持锁；C2_SLEEP_UNCOMMITTED=sleeping会话持未提交事务；C3_LOCK_ESCALATION=锁升级；C4_HIGH_CONCURRENCY=高并发争用；C5_INDEX_MISS=索引缺失导致大范围锁；C6_ORPHAN_TRAN=孤儿事务。</p>
    */
    @SerializedName("RootCause")
    @Expose
    private String RootCause;

    /**
    * <p>头SQL（blocker）MD5过滤（可选）。</p>
    */
    @SerializedName("BlockingSqlMd5")
    @Expose
    private String BlockingSqlMd5;

    /**
    * <p>被阻塞SQL（blocked）MD5过滤（可选）。</p>
    */
    @SerializedName("BlockedSqlMd5")
    @Expose
    private String BlockedSqlMd5;

    /**
    * <p>数据库名列表过滤（可选），按阻塞事件所在数据库名过滤；列表内任意匹配即命中，最多50项。多库实例场景下推荐用本字段定位阻塞所在库。</p>
    */
    @SerializedName("DatabaseNames")
    @Expose
    private String [] DatabaseNames;

    /**
    * <p>头阻塞会话 ID（SPID）列表过滤（可选），列表内任意匹配即命中，最多50项。</p>
    */
    @SerializedName("BlockingSessionIds")
    @Expose
    private Long [] BlockingSessionIds;

    /**
    * <p>被阻塞会话 ID（SPID）列表过滤（可选），列表内任意匹配即命中，最多50项。</p>
    */
    @SerializedName("BlockedSessionIds")
    @Expose
    private Long [] BlockedSessionIds;

    /**
    * <p>头阻塞登录名列表过滤（可选），列表内任意匹配即命中，最多50项。</p>
    */
    @SerializedName("BlockingLoginNames")
    @Expose
    private String [] BlockingLoginNames;

    /**
    * <p>被阻塞登录名列表过滤（可选），列表内任意匹配即命中，最多50项。</p>
    */
    @SerializedName("BlockedLoginNames")
    @Expose
    private String [] BlockedLoginNames;

    /**
    * <p>头阻塞客户端主机列表过滤（可选），列表内任意匹配即命中，最多50项。</p>
    */
    @SerializedName("BlockingHostNames")
    @Expose
    private String [] BlockingHostNames;

    /**
    * <p>被阻塞客户端主机列表过滤（可选），列表内任意匹配即命中，最多50项。</p>
    */
    @SerializedName("BlockedHostNames")
    @Expose
    private String [] BlockedHostNames;

    /**
    * <p>头阻塞客户端应用列表过滤（可选），列表内任意匹配即命中，最多50项。</p>
    */
    @SerializedName("BlockingClientApps")
    @Expose
    private String [] BlockingClientApps;

    /**
    * <p>被阻塞客户端应用列表过滤（可选），列表内任意匹配即命中，最多50项。</p>
    */
    @SerializedName("BlockedClientApps")
    @Expose
    private String [] BlockedClientApps;

    /**
    * <p>被阻塞方等待锁模式列表过滤（可选），SQL Server原生lock_mode枚举，常见取值（非穷尽）：S、U、X、IS、IU、IX、SIU、SIX、UIX、Sch-S、Sch-M；serializable隔离级别下还可能出现RangeS-S / RangeS-U / RangeX-X / RangeI-N系列。列表内任意匹配即命中，最多50项。</p>
    */
    @SerializedName("BlockedLockModes")
    @Expose
    private String [] BlockedLockModes;

    /**
    * <p>被阻塞方等待时长下限（毫秒，含），用于筛选慢阻塞（可选）。</p>
    */
    @SerializedName("DurationMsMin")
    @Expose
    private Long DurationMsMin;

    /**
    * <p>被阻塞方等待时长上限（毫秒，含），用于筛选阻塞时长不超过某值的记录（可选）。</p>
    */
    @SerializedName("DurationMsMax")
    @Expose
    private Long DurationMsMax;

    /**
    * <p>排序字段（可选），支持reportTime（按明细行上报时间，默认）/ durationMs（按链路阻塞时长）/ blockedWaitTimeMs（按被阻塞方等待时长）/ blockingWaitTimeMs（按头阻塞自身等待时长）。</p>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * <p>排序方向（可选），支持desc（默认，倒序）/ asc（正序）。</p>
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

    /**
    * <p>返回条数上限，默认20，最大100。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>偏移量，默认 0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>是否返回原始 blocked_process_report XML（可选，默认 false 不返回）。该字段体积较大（KB 级起步，含完整执行计划/等待链/死锁明细等原始上下文），常规列表展示不需要，仅在需要查看完整 XML 现场（如线下诊断、离线分析）时将本参数置为 true 按需拉取。</p>
    */
    @SerializedName("WithXml")
    @Expose
    private Boolean WithXml;

    /**
     * Get <p>实例ID。</p> 
     * @return InstanceId <p>实例ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID。</p>
     * @param InstanceId <p>实例ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>服务产品类型，固定为sqlserver。</p> 
     * @return Product <p>服务产品类型，固定为sqlserver。</p>
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set <p>服务产品类型，固定为sqlserver。</p>
     * @param Product <p>服务产品类型，固定为sqlserver。</p>
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get <p>查询起始时间（服务端时区 UTC+8），格式：yyyy-MM-dd HH:mm:ss。必须在最近 30 天内，否则返回 InvalidParameterValue。</p> 
     * @return StartTime <p>查询起始时间（服务端时区 UTC+8），格式：yyyy-MM-dd HH:mm:ss。必须在最近 30 天内，否则返回 InvalidParameterValue。</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>查询起始时间（服务端时区 UTC+8），格式：yyyy-MM-dd HH:mm:ss。必须在最近 30 天内，否则返回 InvalidParameterValue。</p>
     * @param StartTime <p>查询起始时间（服务端时区 UTC+8），格式：yyyy-MM-dd HH:mm:ss。必须在最近 30 天内，否则返回 InvalidParameterValue。</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>查询结束时间（服务端时区 UTC+8），格式：yyyy-MM-dd HH:mm:ss，需大于 StartTime。单次查询跨度必须 ≤ 1 天（24 小时），否则返回 InvalidParameterValue。大跨度趋势场景请改用 DescribeBlockingTrend。</p> 
     * @return EndTime <p>查询结束时间（服务端时区 UTC+8），格式：yyyy-MM-dd HH:mm:ss，需大于 StartTime。单次查询跨度必须 ≤ 1 天（24 小时），否则返回 InvalidParameterValue。大跨度趋势场景请改用 DescribeBlockingTrend。</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>查询结束时间（服务端时区 UTC+8），格式：yyyy-MM-dd HH:mm:ss，需大于 StartTime。单次查询跨度必须 ≤ 1 天（24 小时），否则返回 InvalidParameterValue。大跨度趋势场景请改用 DescribeBlockingTrend。</p>
     * @param EndTime <p>查询结束时间（服务端时区 UTC+8），格式：yyyy-MM-dd HH:mm:ss，需大于 StartTime。单次查询跨度必须 ≤ 1 天（24 小时），否则返回 InvalidParameterValue。大跨度趋势场景请改用 DescribeBlockingTrend。</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>根因过滤（可选），支持：C1_LONG_QUERY=长事务查询持锁；C2_SLEEP_UNCOMMITTED=sleeping会话持未提交事务；C3_LOCK_ESCALATION=锁升级；C4_HIGH_CONCURRENCY=高并发争用；C5_INDEX_MISS=索引缺失导致大范围锁；C6_ORPHAN_TRAN=孤儿事务。</p> 
     * @return RootCause <p>根因过滤（可选），支持：C1_LONG_QUERY=长事务查询持锁；C2_SLEEP_UNCOMMITTED=sleeping会话持未提交事务；C3_LOCK_ESCALATION=锁升级；C4_HIGH_CONCURRENCY=高并发争用；C5_INDEX_MISS=索引缺失导致大范围锁；C6_ORPHAN_TRAN=孤儿事务。</p>
     */
    public String getRootCause() {
        return this.RootCause;
    }

    /**
     * Set <p>根因过滤（可选），支持：C1_LONG_QUERY=长事务查询持锁；C2_SLEEP_UNCOMMITTED=sleeping会话持未提交事务；C3_LOCK_ESCALATION=锁升级；C4_HIGH_CONCURRENCY=高并发争用；C5_INDEX_MISS=索引缺失导致大范围锁；C6_ORPHAN_TRAN=孤儿事务。</p>
     * @param RootCause <p>根因过滤（可选），支持：C1_LONG_QUERY=长事务查询持锁；C2_SLEEP_UNCOMMITTED=sleeping会话持未提交事务；C3_LOCK_ESCALATION=锁升级；C4_HIGH_CONCURRENCY=高并发争用；C5_INDEX_MISS=索引缺失导致大范围锁；C6_ORPHAN_TRAN=孤儿事务。</p>
     */
    public void setRootCause(String RootCause) {
        this.RootCause = RootCause;
    }

    /**
     * Get <p>头SQL（blocker）MD5过滤（可选）。</p> 
     * @return BlockingSqlMd5 <p>头SQL（blocker）MD5过滤（可选）。</p>
     */
    public String getBlockingSqlMd5() {
        return this.BlockingSqlMd5;
    }

    /**
     * Set <p>头SQL（blocker）MD5过滤（可选）。</p>
     * @param BlockingSqlMd5 <p>头SQL（blocker）MD5过滤（可选）。</p>
     */
    public void setBlockingSqlMd5(String BlockingSqlMd5) {
        this.BlockingSqlMd5 = BlockingSqlMd5;
    }

    /**
     * Get <p>被阻塞SQL（blocked）MD5过滤（可选）。</p> 
     * @return BlockedSqlMd5 <p>被阻塞SQL（blocked）MD5过滤（可选）。</p>
     */
    public String getBlockedSqlMd5() {
        return this.BlockedSqlMd5;
    }

    /**
     * Set <p>被阻塞SQL（blocked）MD5过滤（可选）。</p>
     * @param BlockedSqlMd5 <p>被阻塞SQL（blocked）MD5过滤（可选）。</p>
     */
    public void setBlockedSqlMd5(String BlockedSqlMd5) {
        this.BlockedSqlMd5 = BlockedSqlMd5;
    }

    /**
     * Get <p>数据库名列表过滤（可选），按阻塞事件所在数据库名过滤；列表内任意匹配即命中，最多50项。多库实例场景下推荐用本字段定位阻塞所在库。</p> 
     * @return DatabaseNames <p>数据库名列表过滤（可选），按阻塞事件所在数据库名过滤；列表内任意匹配即命中，最多50项。多库实例场景下推荐用本字段定位阻塞所在库。</p>
     */
    public String [] getDatabaseNames() {
        return this.DatabaseNames;
    }

    /**
     * Set <p>数据库名列表过滤（可选），按阻塞事件所在数据库名过滤；列表内任意匹配即命中，最多50项。多库实例场景下推荐用本字段定位阻塞所在库。</p>
     * @param DatabaseNames <p>数据库名列表过滤（可选），按阻塞事件所在数据库名过滤；列表内任意匹配即命中，最多50项。多库实例场景下推荐用本字段定位阻塞所在库。</p>
     */
    public void setDatabaseNames(String [] DatabaseNames) {
        this.DatabaseNames = DatabaseNames;
    }

    /**
     * Get <p>头阻塞会话 ID（SPID）列表过滤（可选），列表内任意匹配即命中，最多50项。</p> 
     * @return BlockingSessionIds <p>头阻塞会话 ID（SPID）列表过滤（可选），列表内任意匹配即命中，最多50项。</p>
     */
    public Long [] getBlockingSessionIds() {
        return this.BlockingSessionIds;
    }

    /**
     * Set <p>头阻塞会话 ID（SPID）列表过滤（可选），列表内任意匹配即命中，最多50项。</p>
     * @param BlockingSessionIds <p>头阻塞会话 ID（SPID）列表过滤（可选），列表内任意匹配即命中，最多50项。</p>
     */
    public void setBlockingSessionIds(Long [] BlockingSessionIds) {
        this.BlockingSessionIds = BlockingSessionIds;
    }

    /**
     * Get <p>被阻塞会话 ID（SPID）列表过滤（可选），列表内任意匹配即命中，最多50项。</p> 
     * @return BlockedSessionIds <p>被阻塞会话 ID（SPID）列表过滤（可选），列表内任意匹配即命中，最多50项。</p>
     */
    public Long [] getBlockedSessionIds() {
        return this.BlockedSessionIds;
    }

    /**
     * Set <p>被阻塞会话 ID（SPID）列表过滤（可选），列表内任意匹配即命中，最多50项。</p>
     * @param BlockedSessionIds <p>被阻塞会话 ID（SPID）列表过滤（可选），列表内任意匹配即命中，最多50项。</p>
     */
    public void setBlockedSessionIds(Long [] BlockedSessionIds) {
        this.BlockedSessionIds = BlockedSessionIds;
    }

    /**
     * Get <p>头阻塞登录名列表过滤（可选），列表内任意匹配即命中，最多50项。</p> 
     * @return BlockingLoginNames <p>头阻塞登录名列表过滤（可选），列表内任意匹配即命中，最多50项。</p>
     */
    public String [] getBlockingLoginNames() {
        return this.BlockingLoginNames;
    }

    /**
     * Set <p>头阻塞登录名列表过滤（可选），列表内任意匹配即命中，最多50项。</p>
     * @param BlockingLoginNames <p>头阻塞登录名列表过滤（可选），列表内任意匹配即命中，最多50项。</p>
     */
    public void setBlockingLoginNames(String [] BlockingLoginNames) {
        this.BlockingLoginNames = BlockingLoginNames;
    }

    /**
     * Get <p>被阻塞登录名列表过滤（可选），列表内任意匹配即命中，最多50项。</p> 
     * @return BlockedLoginNames <p>被阻塞登录名列表过滤（可选），列表内任意匹配即命中，最多50项。</p>
     */
    public String [] getBlockedLoginNames() {
        return this.BlockedLoginNames;
    }

    /**
     * Set <p>被阻塞登录名列表过滤（可选），列表内任意匹配即命中，最多50项。</p>
     * @param BlockedLoginNames <p>被阻塞登录名列表过滤（可选），列表内任意匹配即命中，最多50项。</p>
     */
    public void setBlockedLoginNames(String [] BlockedLoginNames) {
        this.BlockedLoginNames = BlockedLoginNames;
    }

    /**
     * Get <p>头阻塞客户端主机列表过滤（可选），列表内任意匹配即命中，最多50项。</p> 
     * @return BlockingHostNames <p>头阻塞客户端主机列表过滤（可选），列表内任意匹配即命中，最多50项。</p>
     */
    public String [] getBlockingHostNames() {
        return this.BlockingHostNames;
    }

    /**
     * Set <p>头阻塞客户端主机列表过滤（可选），列表内任意匹配即命中，最多50项。</p>
     * @param BlockingHostNames <p>头阻塞客户端主机列表过滤（可选），列表内任意匹配即命中，最多50项。</p>
     */
    public void setBlockingHostNames(String [] BlockingHostNames) {
        this.BlockingHostNames = BlockingHostNames;
    }

    /**
     * Get <p>被阻塞客户端主机列表过滤（可选），列表内任意匹配即命中，最多50项。</p> 
     * @return BlockedHostNames <p>被阻塞客户端主机列表过滤（可选），列表内任意匹配即命中，最多50项。</p>
     */
    public String [] getBlockedHostNames() {
        return this.BlockedHostNames;
    }

    /**
     * Set <p>被阻塞客户端主机列表过滤（可选），列表内任意匹配即命中，最多50项。</p>
     * @param BlockedHostNames <p>被阻塞客户端主机列表过滤（可选），列表内任意匹配即命中，最多50项。</p>
     */
    public void setBlockedHostNames(String [] BlockedHostNames) {
        this.BlockedHostNames = BlockedHostNames;
    }

    /**
     * Get <p>头阻塞客户端应用列表过滤（可选），列表内任意匹配即命中，最多50项。</p> 
     * @return BlockingClientApps <p>头阻塞客户端应用列表过滤（可选），列表内任意匹配即命中，最多50项。</p>
     */
    public String [] getBlockingClientApps() {
        return this.BlockingClientApps;
    }

    /**
     * Set <p>头阻塞客户端应用列表过滤（可选），列表内任意匹配即命中，最多50项。</p>
     * @param BlockingClientApps <p>头阻塞客户端应用列表过滤（可选），列表内任意匹配即命中，最多50项。</p>
     */
    public void setBlockingClientApps(String [] BlockingClientApps) {
        this.BlockingClientApps = BlockingClientApps;
    }

    /**
     * Get <p>被阻塞客户端应用列表过滤（可选），列表内任意匹配即命中，最多50项。</p> 
     * @return BlockedClientApps <p>被阻塞客户端应用列表过滤（可选），列表内任意匹配即命中，最多50项。</p>
     */
    public String [] getBlockedClientApps() {
        return this.BlockedClientApps;
    }

    /**
     * Set <p>被阻塞客户端应用列表过滤（可选），列表内任意匹配即命中，最多50项。</p>
     * @param BlockedClientApps <p>被阻塞客户端应用列表过滤（可选），列表内任意匹配即命中，最多50项。</p>
     */
    public void setBlockedClientApps(String [] BlockedClientApps) {
        this.BlockedClientApps = BlockedClientApps;
    }

    /**
     * Get <p>被阻塞方等待锁模式列表过滤（可选），SQL Server原生lock_mode枚举，常见取值（非穷尽）：S、U、X、IS、IU、IX、SIU、SIX、UIX、Sch-S、Sch-M；serializable隔离级别下还可能出现RangeS-S / RangeS-U / RangeX-X / RangeI-N系列。列表内任意匹配即命中，最多50项。</p> 
     * @return BlockedLockModes <p>被阻塞方等待锁模式列表过滤（可选），SQL Server原生lock_mode枚举，常见取值（非穷尽）：S、U、X、IS、IU、IX、SIU、SIX、UIX、Sch-S、Sch-M；serializable隔离级别下还可能出现RangeS-S / RangeS-U / RangeX-X / RangeI-N系列。列表内任意匹配即命中，最多50项。</p>
     */
    public String [] getBlockedLockModes() {
        return this.BlockedLockModes;
    }

    /**
     * Set <p>被阻塞方等待锁模式列表过滤（可选），SQL Server原生lock_mode枚举，常见取值（非穷尽）：S、U、X、IS、IU、IX、SIU、SIX、UIX、Sch-S、Sch-M；serializable隔离级别下还可能出现RangeS-S / RangeS-U / RangeX-X / RangeI-N系列。列表内任意匹配即命中，最多50项。</p>
     * @param BlockedLockModes <p>被阻塞方等待锁模式列表过滤（可选），SQL Server原生lock_mode枚举，常见取值（非穷尽）：S、U、X、IS、IU、IX、SIU、SIX、UIX、Sch-S、Sch-M；serializable隔离级别下还可能出现RangeS-S / RangeS-U / RangeX-X / RangeI-N系列。列表内任意匹配即命中，最多50项。</p>
     */
    public void setBlockedLockModes(String [] BlockedLockModes) {
        this.BlockedLockModes = BlockedLockModes;
    }

    /**
     * Get <p>被阻塞方等待时长下限（毫秒，含），用于筛选慢阻塞（可选）。</p> 
     * @return DurationMsMin <p>被阻塞方等待时长下限（毫秒，含），用于筛选慢阻塞（可选）。</p>
     */
    public Long getDurationMsMin() {
        return this.DurationMsMin;
    }

    /**
     * Set <p>被阻塞方等待时长下限（毫秒，含），用于筛选慢阻塞（可选）。</p>
     * @param DurationMsMin <p>被阻塞方等待时长下限（毫秒，含），用于筛选慢阻塞（可选）。</p>
     */
    public void setDurationMsMin(Long DurationMsMin) {
        this.DurationMsMin = DurationMsMin;
    }

    /**
     * Get <p>被阻塞方等待时长上限（毫秒，含），用于筛选阻塞时长不超过某值的记录（可选）。</p> 
     * @return DurationMsMax <p>被阻塞方等待时长上限（毫秒，含），用于筛选阻塞时长不超过某值的记录（可选）。</p>
     */
    public Long getDurationMsMax() {
        return this.DurationMsMax;
    }

    /**
     * Set <p>被阻塞方等待时长上限（毫秒，含），用于筛选阻塞时长不超过某值的记录（可选）。</p>
     * @param DurationMsMax <p>被阻塞方等待时长上限（毫秒，含），用于筛选阻塞时长不超过某值的记录（可选）。</p>
     */
    public void setDurationMsMax(Long DurationMsMax) {
        this.DurationMsMax = DurationMsMax;
    }

    /**
     * Get <p>排序字段（可选），支持reportTime（按明细行上报时间，默认）/ durationMs（按链路阻塞时长）/ blockedWaitTimeMs（按被阻塞方等待时长）/ blockingWaitTimeMs（按头阻塞自身等待时长）。</p> 
     * @return OrderBy <p>排序字段（可选），支持reportTime（按明细行上报时间，默认）/ durationMs（按链路阻塞时长）/ blockedWaitTimeMs（按被阻塞方等待时长）/ blockingWaitTimeMs（按头阻塞自身等待时长）。</p>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set <p>排序字段（可选），支持reportTime（按明细行上报时间，默认）/ durationMs（按链路阻塞时长）/ blockedWaitTimeMs（按被阻塞方等待时长）/ blockingWaitTimeMs（按头阻塞自身等待时长）。</p>
     * @param OrderBy <p>排序字段（可选），支持reportTime（按明细行上报时间，默认）/ durationMs（按链路阻塞时长）/ blockedWaitTimeMs（按被阻塞方等待时长）/ blockingWaitTimeMs（按头阻塞自身等待时长）。</p>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get <p>排序方向（可选），支持desc（默认，倒序）/ asc（正序）。</p> 
     * @return OrderDirection <p>排序方向（可选），支持desc（默认，倒序）/ asc（正序）。</p>
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * Set <p>排序方向（可选），支持desc（默认，倒序）/ asc（正序）。</p>
     * @param OrderDirection <p>排序方向（可选），支持desc（默认，倒序）/ asc（正序）。</p>
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    /**
     * Get <p>返回条数上限，默认20，最大100。</p> 
     * @return Limit <p>返回条数上限，默认20，最大100。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回条数上限，默认20，最大100。</p>
     * @param Limit <p>返回条数上限，默认20，最大100。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>偏移量，默认 0。</p> 
     * @return Offset <p>偏移量，默认 0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，默认 0。</p>
     * @param Offset <p>偏移量，默认 0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>是否返回原始 blocked_process_report XML（可选，默认 false 不返回）。该字段体积较大（KB 级起步，含完整执行计划/等待链/死锁明细等原始上下文），常规列表展示不需要，仅在需要查看完整 XML 现场（如线下诊断、离线分析）时将本参数置为 true 按需拉取。</p> 
     * @return WithXml <p>是否返回原始 blocked_process_report XML（可选，默认 false 不返回）。该字段体积较大（KB 级起步，含完整执行计划/等待链/死锁明细等原始上下文），常规列表展示不需要，仅在需要查看完整 XML 现场（如线下诊断、离线分析）时将本参数置为 true 按需拉取。</p>
     */
    public Boolean getWithXml() {
        return this.WithXml;
    }

    /**
     * Set <p>是否返回原始 blocked_process_report XML（可选，默认 false 不返回）。该字段体积较大（KB 级起步，含完整执行计划/等待链/死锁明细等原始上下文），常规列表展示不需要，仅在需要查看完整 XML 现场（如线下诊断、离线分析）时将本参数置为 true 按需拉取。</p>
     * @param WithXml <p>是否返回原始 blocked_process_report XML（可选，默认 false 不返回）。该字段体积较大（KB 级起步，含完整执行计划/等待链/死锁明细等原始上下文），常规列表展示不需要，仅在需要查看完整 XML 现场（如线下诊断、离线分析）时将本参数置为 true 按需拉取。</p>
     */
    public void setWithXml(Boolean WithXml) {
        this.WithXml = WithXml;
    }

    public DescribeBlockingLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBlockingLogsRequest(DescribeBlockingLogsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.RootCause != null) {
            this.RootCause = new String(source.RootCause);
        }
        if (source.BlockingSqlMd5 != null) {
            this.BlockingSqlMd5 = new String(source.BlockingSqlMd5);
        }
        if (source.BlockedSqlMd5 != null) {
            this.BlockedSqlMd5 = new String(source.BlockedSqlMd5);
        }
        if (source.DatabaseNames != null) {
            this.DatabaseNames = new String[source.DatabaseNames.length];
            for (int i = 0; i < source.DatabaseNames.length; i++) {
                this.DatabaseNames[i] = new String(source.DatabaseNames[i]);
            }
        }
        if (source.BlockingSessionIds != null) {
            this.BlockingSessionIds = new Long[source.BlockingSessionIds.length];
            for (int i = 0; i < source.BlockingSessionIds.length; i++) {
                this.BlockingSessionIds[i] = new Long(source.BlockingSessionIds[i]);
            }
        }
        if (source.BlockedSessionIds != null) {
            this.BlockedSessionIds = new Long[source.BlockedSessionIds.length];
            for (int i = 0; i < source.BlockedSessionIds.length; i++) {
                this.BlockedSessionIds[i] = new Long(source.BlockedSessionIds[i]);
            }
        }
        if (source.BlockingLoginNames != null) {
            this.BlockingLoginNames = new String[source.BlockingLoginNames.length];
            for (int i = 0; i < source.BlockingLoginNames.length; i++) {
                this.BlockingLoginNames[i] = new String(source.BlockingLoginNames[i]);
            }
        }
        if (source.BlockedLoginNames != null) {
            this.BlockedLoginNames = new String[source.BlockedLoginNames.length];
            for (int i = 0; i < source.BlockedLoginNames.length; i++) {
                this.BlockedLoginNames[i] = new String(source.BlockedLoginNames[i]);
            }
        }
        if (source.BlockingHostNames != null) {
            this.BlockingHostNames = new String[source.BlockingHostNames.length];
            for (int i = 0; i < source.BlockingHostNames.length; i++) {
                this.BlockingHostNames[i] = new String(source.BlockingHostNames[i]);
            }
        }
        if (source.BlockedHostNames != null) {
            this.BlockedHostNames = new String[source.BlockedHostNames.length];
            for (int i = 0; i < source.BlockedHostNames.length; i++) {
                this.BlockedHostNames[i] = new String(source.BlockedHostNames[i]);
            }
        }
        if (source.BlockingClientApps != null) {
            this.BlockingClientApps = new String[source.BlockingClientApps.length];
            for (int i = 0; i < source.BlockingClientApps.length; i++) {
                this.BlockingClientApps[i] = new String(source.BlockingClientApps[i]);
            }
        }
        if (source.BlockedClientApps != null) {
            this.BlockedClientApps = new String[source.BlockedClientApps.length];
            for (int i = 0; i < source.BlockedClientApps.length; i++) {
                this.BlockedClientApps[i] = new String(source.BlockedClientApps[i]);
            }
        }
        if (source.BlockedLockModes != null) {
            this.BlockedLockModes = new String[source.BlockedLockModes.length];
            for (int i = 0; i < source.BlockedLockModes.length; i++) {
                this.BlockedLockModes[i] = new String(source.BlockedLockModes[i]);
            }
        }
        if (source.DurationMsMin != null) {
            this.DurationMsMin = new Long(source.DurationMsMin);
        }
        if (source.DurationMsMax != null) {
            this.DurationMsMax = new Long(source.DurationMsMax);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderDirection != null) {
            this.OrderDirection = new String(source.OrderDirection);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.WithXml != null) {
            this.WithXml = new Boolean(source.WithXml);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "RootCause", this.RootCause);
        this.setParamSimple(map, prefix + "BlockingSqlMd5", this.BlockingSqlMd5);
        this.setParamSimple(map, prefix + "BlockedSqlMd5", this.BlockedSqlMd5);
        this.setParamArraySimple(map, prefix + "DatabaseNames.", this.DatabaseNames);
        this.setParamArraySimple(map, prefix + "BlockingSessionIds.", this.BlockingSessionIds);
        this.setParamArraySimple(map, prefix + "BlockedSessionIds.", this.BlockedSessionIds);
        this.setParamArraySimple(map, prefix + "BlockingLoginNames.", this.BlockingLoginNames);
        this.setParamArraySimple(map, prefix + "BlockedLoginNames.", this.BlockedLoginNames);
        this.setParamArraySimple(map, prefix + "BlockingHostNames.", this.BlockingHostNames);
        this.setParamArraySimple(map, prefix + "BlockedHostNames.", this.BlockedHostNames);
        this.setParamArraySimple(map, prefix + "BlockingClientApps.", this.BlockingClientApps);
        this.setParamArraySimple(map, prefix + "BlockedClientApps.", this.BlockedClientApps);
        this.setParamArraySimple(map, prefix + "BlockedLockModes.", this.BlockedLockModes);
        this.setParamSimple(map, prefix + "DurationMsMin", this.DurationMsMin);
        this.setParamSimple(map, prefix + "DurationMsMax", this.DurationMsMax);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderDirection", this.OrderDirection);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "WithXml", this.WithXml);

    }
}

