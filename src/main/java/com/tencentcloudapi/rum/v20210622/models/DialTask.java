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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DialTask extends AbstractModel {

    /**
    * <p>任务 ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>任务名称</p>
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>任务状态。取值说明：active、paused；已删除任务不返回。</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>探测类型。取值说明：icmp、tcp。</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>执行时机。取值说明：realtime、after_request、after_error、after_slow、after_dns_slow。</p>
    */
    @SerializedName("ExecutionTime")
    @Expose
    private String ExecutionTime;

    /**
    * <p>监听域名。非 realtime 时有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WatchDomain")
    @Expose
    private String WatchDomain;

    /**
    * <p>拨测目标。域名、IP 或 ldns。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DialDomain")
    @Expose
    private String DialDomain;

    /**
    * <p>TCP 端口。仅 tcp 任务返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>实时拨测间隔，单位毫秒。仅 realtime 返回。取值说明：60000、300000、600000、900000、1800000、3600000。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FrequencyMs")
    @Expose
    private Long FrequencyMs;

    /**
    * <p>单次探测超时，单位毫秒。范围 1000 到 20000。</p>
    */
    @SerializedName("TimeoutMs")
    @Expose
    private Long TimeoutMs;

    /**
    * <p>探测周期，单位毫秒。</p>
    */
    @SerializedName("PeriodMs")
    @Expose
    private Long PeriodMs;

    /**
    * <p>发包次数。范围 3 到 40。</p>
    */
    @SerializedName("PackageCount")
    @Expose
    private Long PackageCount;

    /**
    * <p>ICMP 包大小，单位字节。范围 32 到 1024，默认 64。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageSize")
    @Expose
    private Long PackageSize;

    /**
    * <p>是否做路由追踪。取值说明：0 否，1 是。</p>
    */
    @SerializedName("NeedMTR")
    @Expose
    private Long NeedMTR;

    /**
    * <p>路由追踪超时，单位毫秒。NeedMTR 为 1 时有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MTRTimeoutMs")
    @Expose
    private Long MTRTimeoutMs;

    /**
    * <p>路由追踪最大跳数。NeedMTR 为 1 时有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MTRMaxHop")
    @Expose
    private Long MTRMaxHop;

    /**
    * <p>每一跳发包次数。范围 3 到 40。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MTRPingCount")
    @Expose
    private Long MTRPingCount;

    /**
    * <p>慢请求阈值，单位毫秒。after_slow、after_dns_slow 时使用，默认 2000。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SlowThresholdMs")
    @Expose
    private Long SlowThresholdMs;

    /**
    * <p>错误类型过滤。after_error 时使用。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorType")
    @Expose
    private String ErrorType;

    /**
    * <p>允许启动的客户端地区，逗号分隔，名称与分析页客户端地区一致。空表示不限制。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Regions")
    @Expose
    private String Regions;

    /**
    * <p>允许启动的客户端运营商，逗号分隔，名称与分析页客户端运营商一致。空表示不限制。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Operators")
    @Expose
    private String Operators;

    /**
    * <p>允许启动的用户 ID，逗号分隔。空表示不限制。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserIds")
    @Expose
    private String UserIds;

    /**
    * <p>允许启动的设备 ID，逗号分隔。空表示不限制。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceIds")
    @Expose
    private String DeviceIds;

    /**
    * <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedBy")
    @Expose
    private String CreatedBy;

    /**
    * <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
     * Get <p>任务 ID</p> 
     * @return TaskId <p>任务 ID</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务 ID</p>
     * @param TaskId <p>任务 ID</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>任务名称</p> 
     * @return TaskName <p>任务名称</p>
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>任务名称</p>
     * @param TaskName <p>任务名称</p>
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>任务状态。取值说明：active、paused；已删除任务不返回。</p> 
     * @return Status <p>任务状态。取值说明：active、paused；已删除任务不返回。</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态。取值说明：active、paused；已删除任务不返回。</p>
     * @param Status <p>任务状态。取值说明：active、paused；已删除任务不返回。</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>探测类型。取值说明：icmp、tcp。</p> 
     * @return Type <p>探测类型。取值说明：icmp、tcp。</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>探测类型。取值说明：icmp、tcp。</p>
     * @param Type <p>探测类型。取值说明：icmp、tcp。</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>执行时机。取值说明：realtime、after_request、after_error、after_slow、after_dns_slow。</p> 
     * @return ExecutionTime <p>执行时机。取值说明：realtime、after_request、after_error、after_slow、after_dns_slow。</p>
     */
    public String getExecutionTime() {
        return this.ExecutionTime;
    }

    /**
     * Set <p>执行时机。取值说明：realtime、after_request、after_error、after_slow、after_dns_slow。</p>
     * @param ExecutionTime <p>执行时机。取值说明：realtime、after_request、after_error、after_slow、after_dns_slow。</p>
     */
    public void setExecutionTime(String ExecutionTime) {
        this.ExecutionTime = ExecutionTime;
    }

    /**
     * Get <p>监听域名。非 realtime 时有值。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WatchDomain <p>监听域名。非 realtime 时有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWatchDomain() {
        return this.WatchDomain;
    }

    /**
     * Set <p>监听域名。非 realtime 时有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WatchDomain <p>监听域名。非 realtime 时有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWatchDomain(String WatchDomain) {
        this.WatchDomain = WatchDomain;
    }

    /**
     * Get <p>拨测目标。域名、IP 或 ldns。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DialDomain <p>拨测目标。域名、IP 或 ldns。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDialDomain() {
        return this.DialDomain;
    }

    /**
     * Set <p>拨测目标。域名、IP 或 ldns。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DialDomain <p>拨测目标。域名、IP 或 ldns。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDialDomain(String DialDomain) {
        this.DialDomain = DialDomain;
    }

    /**
     * Get <p>TCP 端口。仅 tcp 任务返回。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port <p>TCP 端口。仅 tcp 任务返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>TCP 端口。仅 tcp 任务返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port <p>TCP 端口。仅 tcp 任务返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>实时拨测间隔，单位毫秒。仅 realtime 返回。取值说明：60000、300000、600000、900000、1800000、3600000。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FrequencyMs <p>实时拨测间隔，单位毫秒。仅 realtime 返回。取值说明：60000、300000、600000、900000、1800000、3600000。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFrequencyMs() {
        return this.FrequencyMs;
    }

    /**
     * Set <p>实时拨测间隔，单位毫秒。仅 realtime 返回。取值说明：60000、300000、600000、900000、1800000、3600000。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FrequencyMs <p>实时拨测间隔，单位毫秒。仅 realtime 返回。取值说明：60000、300000、600000、900000、1800000、3600000。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrequencyMs(Long FrequencyMs) {
        this.FrequencyMs = FrequencyMs;
    }

    /**
     * Get <p>单次探测超时，单位毫秒。范围 1000 到 20000。</p> 
     * @return TimeoutMs <p>单次探测超时，单位毫秒。范围 1000 到 20000。</p>
     */
    public Long getTimeoutMs() {
        return this.TimeoutMs;
    }

    /**
     * Set <p>单次探测超时，单位毫秒。范围 1000 到 20000。</p>
     * @param TimeoutMs <p>单次探测超时，单位毫秒。范围 1000 到 20000。</p>
     */
    public void setTimeoutMs(Long TimeoutMs) {
        this.TimeoutMs = TimeoutMs;
    }

    /**
     * Get <p>探测周期，单位毫秒。</p> 
     * @return PeriodMs <p>探测周期，单位毫秒。</p>
     */
    public Long getPeriodMs() {
        return this.PeriodMs;
    }

    /**
     * Set <p>探测周期，单位毫秒。</p>
     * @param PeriodMs <p>探测周期，单位毫秒。</p>
     */
    public void setPeriodMs(Long PeriodMs) {
        this.PeriodMs = PeriodMs;
    }

    /**
     * Get <p>发包次数。范围 3 到 40。</p> 
     * @return PackageCount <p>发包次数。范围 3 到 40。</p>
     */
    public Long getPackageCount() {
        return this.PackageCount;
    }

    /**
     * Set <p>发包次数。范围 3 到 40。</p>
     * @param PackageCount <p>发包次数。范围 3 到 40。</p>
     */
    public void setPackageCount(Long PackageCount) {
        this.PackageCount = PackageCount;
    }

    /**
     * Get <p>ICMP 包大小，单位字节。范围 32 到 1024，默认 64。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageSize <p>ICMP 包大小，单位字节。范围 32 到 1024，默认 64。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPackageSize() {
        return this.PackageSize;
    }

    /**
     * Set <p>ICMP 包大小，单位字节。范围 32 到 1024，默认 64。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageSize <p>ICMP 包大小，单位字节。范围 32 到 1024，默认 64。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageSize(Long PackageSize) {
        this.PackageSize = PackageSize;
    }

    /**
     * Get <p>是否做路由追踪。取值说明：0 否，1 是。</p> 
     * @return NeedMTR <p>是否做路由追踪。取值说明：0 否，1 是。</p>
     */
    public Long getNeedMTR() {
        return this.NeedMTR;
    }

    /**
     * Set <p>是否做路由追踪。取值说明：0 否，1 是。</p>
     * @param NeedMTR <p>是否做路由追踪。取值说明：0 否，1 是。</p>
     */
    public void setNeedMTR(Long NeedMTR) {
        this.NeedMTR = NeedMTR;
    }

    /**
     * Get <p>路由追踪超时，单位毫秒。NeedMTR 为 1 时有值。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MTRTimeoutMs <p>路由追踪超时，单位毫秒。NeedMTR 为 1 时有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMTRTimeoutMs() {
        return this.MTRTimeoutMs;
    }

    /**
     * Set <p>路由追踪超时，单位毫秒。NeedMTR 为 1 时有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MTRTimeoutMs <p>路由追踪超时，单位毫秒。NeedMTR 为 1 时有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMTRTimeoutMs(Long MTRTimeoutMs) {
        this.MTRTimeoutMs = MTRTimeoutMs;
    }

    /**
     * Get <p>路由追踪最大跳数。NeedMTR 为 1 时有值。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MTRMaxHop <p>路由追踪最大跳数。NeedMTR 为 1 时有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMTRMaxHop() {
        return this.MTRMaxHop;
    }

    /**
     * Set <p>路由追踪最大跳数。NeedMTR 为 1 时有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MTRMaxHop <p>路由追踪最大跳数。NeedMTR 为 1 时有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMTRMaxHop(Long MTRMaxHop) {
        this.MTRMaxHop = MTRMaxHop;
    }

    /**
     * Get <p>每一跳发包次数。范围 3 到 40。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MTRPingCount <p>每一跳发包次数。范围 3 到 40。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMTRPingCount() {
        return this.MTRPingCount;
    }

    /**
     * Set <p>每一跳发包次数。范围 3 到 40。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MTRPingCount <p>每一跳发包次数。范围 3 到 40。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMTRPingCount(Long MTRPingCount) {
        this.MTRPingCount = MTRPingCount;
    }

    /**
     * Get <p>慢请求阈值，单位毫秒。after_slow、after_dns_slow 时使用，默认 2000。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SlowThresholdMs <p>慢请求阈值，单位毫秒。after_slow、after_dns_slow 时使用，默认 2000。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSlowThresholdMs() {
        return this.SlowThresholdMs;
    }

    /**
     * Set <p>慢请求阈值，单位毫秒。after_slow、after_dns_slow 时使用，默认 2000。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SlowThresholdMs <p>慢请求阈值，单位毫秒。after_slow、after_dns_slow 时使用，默认 2000。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSlowThresholdMs(Long SlowThresholdMs) {
        this.SlowThresholdMs = SlowThresholdMs;
    }

    /**
     * Get <p>错误类型过滤。after_error 时使用。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorType <p>错误类型过滤。after_error 时使用。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorType() {
        return this.ErrorType;
    }

    /**
     * Set <p>错误类型过滤。after_error 时使用。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorType <p>错误类型过滤。after_error 时使用。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorType(String ErrorType) {
        this.ErrorType = ErrorType;
    }

    /**
     * Get <p>允许启动的客户端地区，逗号分隔，名称与分析页客户端地区一致。空表示不限制。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Regions <p>允许启动的客户端地区，逗号分隔，名称与分析页客户端地区一致。空表示不限制。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegions() {
        return this.Regions;
    }

    /**
     * Set <p>允许启动的客户端地区，逗号分隔，名称与分析页客户端地区一致。空表示不限制。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Regions <p>允许启动的客户端地区，逗号分隔，名称与分析页客户端地区一致。空表示不限制。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegions(String Regions) {
        this.Regions = Regions;
    }

    /**
     * Get <p>允许启动的客户端运营商，逗号分隔，名称与分析页客户端运营商一致。空表示不限制。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Operators <p>允许启动的客户端运营商，逗号分隔，名称与分析页客户端运营商一致。空表示不限制。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperators() {
        return this.Operators;
    }

    /**
     * Set <p>允许启动的客户端运营商，逗号分隔，名称与分析页客户端运营商一致。空表示不限制。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Operators <p>允许启动的客户端运营商，逗号分隔，名称与分析页客户端运营商一致。空表示不限制。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperators(String Operators) {
        this.Operators = Operators;
    }

    /**
     * Get <p>允许启动的用户 ID，逗号分隔。空表示不限制。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserIds <p>允许启动的用户 ID，逗号分隔。空表示不限制。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserIds() {
        return this.UserIds;
    }

    /**
     * Set <p>允许启动的用户 ID，逗号分隔。空表示不限制。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserIds <p>允许启动的用户 ID，逗号分隔。空表示不限制。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserIds(String UserIds) {
        this.UserIds = UserIds;
    }

    /**
     * Get <p>允许启动的设备 ID，逗号分隔。空表示不限制。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceIds <p>允许启动的设备 ID，逗号分隔。空表示不限制。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeviceIds() {
        return this.DeviceIds;
    }

    /**
     * Set <p>允许启动的设备 ID，逗号分隔。空表示不限制。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceIds <p>允许启动的设备 ID，逗号分隔。空表示不限制。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceIds(String DeviceIds) {
        this.DeviceIds = DeviceIds;
    }

    /**
     * Get <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedBy <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedBy() {
        return this.CreatedBy;
    }

    /**
     * Set <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedBy <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedBy(String CreatedBy) {
        this.CreatedBy = CreatedBy;
    }

    /**
     * Get <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedAt <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedAt <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedAt <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedAt <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    public DialTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DialTask(DialTask source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ExecutionTime != null) {
            this.ExecutionTime = new String(source.ExecutionTime);
        }
        if (source.WatchDomain != null) {
            this.WatchDomain = new String(source.WatchDomain);
        }
        if (source.DialDomain != null) {
            this.DialDomain = new String(source.DialDomain);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.FrequencyMs != null) {
            this.FrequencyMs = new Long(source.FrequencyMs);
        }
        if (source.TimeoutMs != null) {
            this.TimeoutMs = new Long(source.TimeoutMs);
        }
        if (source.PeriodMs != null) {
            this.PeriodMs = new Long(source.PeriodMs);
        }
        if (source.PackageCount != null) {
            this.PackageCount = new Long(source.PackageCount);
        }
        if (source.PackageSize != null) {
            this.PackageSize = new Long(source.PackageSize);
        }
        if (source.NeedMTR != null) {
            this.NeedMTR = new Long(source.NeedMTR);
        }
        if (source.MTRTimeoutMs != null) {
            this.MTRTimeoutMs = new Long(source.MTRTimeoutMs);
        }
        if (source.MTRMaxHop != null) {
            this.MTRMaxHop = new Long(source.MTRMaxHop);
        }
        if (source.MTRPingCount != null) {
            this.MTRPingCount = new Long(source.MTRPingCount);
        }
        if (source.SlowThresholdMs != null) {
            this.SlowThresholdMs = new Long(source.SlowThresholdMs);
        }
        if (source.ErrorType != null) {
            this.ErrorType = new String(source.ErrorType);
        }
        if (source.Regions != null) {
            this.Regions = new String(source.Regions);
        }
        if (source.Operators != null) {
            this.Operators = new String(source.Operators);
        }
        if (source.UserIds != null) {
            this.UserIds = new String(source.UserIds);
        }
        if (source.DeviceIds != null) {
            this.DeviceIds = new String(source.DeviceIds);
        }
        if (source.CreatedBy != null) {
            this.CreatedBy = new String(source.CreatedBy);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ExecutionTime", this.ExecutionTime);
        this.setParamSimple(map, prefix + "WatchDomain", this.WatchDomain);
        this.setParamSimple(map, prefix + "DialDomain", this.DialDomain);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "FrequencyMs", this.FrequencyMs);
        this.setParamSimple(map, prefix + "TimeoutMs", this.TimeoutMs);
        this.setParamSimple(map, prefix + "PeriodMs", this.PeriodMs);
        this.setParamSimple(map, prefix + "PackageCount", this.PackageCount);
        this.setParamSimple(map, prefix + "PackageSize", this.PackageSize);
        this.setParamSimple(map, prefix + "NeedMTR", this.NeedMTR);
        this.setParamSimple(map, prefix + "MTRTimeoutMs", this.MTRTimeoutMs);
        this.setParamSimple(map, prefix + "MTRMaxHop", this.MTRMaxHop);
        this.setParamSimple(map, prefix + "MTRPingCount", this.MTRPingCount);
        this.setParamSimple(map, prefix + "SlowThresholdMs", this.SlowThresholdMs);
        this.setParamSimple(map, prefix + "ErrorType", this.ErrorType);
        this.setParamSimple(map, prefix + "Regions", this.Regions);
        this.setParamSimple(map, prefix + "Operators", this.Operators);
        this.setParamSimple(map, prefix + "UserIds", this.UserIds);
        this.setParamSimple(map, prefix + "DeviceIds", this.DeviceIds);
        this.setParamSimple(map, prefix + "CreatedBy", this.CreatedBy);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);

    }
}

