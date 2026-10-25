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

public class ModifyTDEMDialTaskRequest extends AbstractModel {

    /**
    * <p>应用 ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>任务 ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>任务名称。不传表示不修改。</p>
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>任务状态。取值说明：active、paused。不传表示不修改。不能改为 deleted。</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>探测类型。创建后不可修改。</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>执行时机。创建后不可修改。</p>
    */
    @SerializedName("ExecutionTime")
    @Expose
    private String ExecutionTime;

    /**
    * <p>监听域名。不传表示不修改。</p>
    */
    @SerializedName("WatchDomain")
    @Expose
    private String WatchDomain;

    /**
    * <p>拨测目标。不传表示不修改。</p>
    */
    @SerializedName("DialDomain")
    @Expose
    private String DialDomain;

    /**
    * <p>TCP 端口。不传表示不修改。</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>实时拨测间隔，单位毫秒。不传表示不修改。</p>
    */
    @SerializedName("FrequencyMs")
    @Expose
    private Long FrequencyMs;

    /**
    * <p>单次探测超时，单位毫秒。不传表示不修改。</p>
    */
    @SerializedName("TimeoutMs")
    @Expose
    private Long TimeoutMs;

    /**
    * <p>探测周期，单位毫秒。不传表示不修改。</p>
    */
    @SerializedName("PeriodMs")
    @Expose
    private Long PeriodMs;

    /**
    * <p>发包次数。不传表示不修改。</p>
    */
    @SerializedName("PackageCount")
    @Expose
    private Long PackageCount;

    /**
    * <p>ICMP 包大小，单位字节。不传表示不修改。</p>
    */
    @SerializedName("PackageSize")
    @Expose
    private Long PackageSize;

    /**
    * <p>是否做路由追踪。取值说明：0 否，1 是。不传表示不修改。</p>
    */
    @SerializedName("NeedMTR")
    @Expose
    private Long NeedMTR;

    /**
    * <p>路由追踪超时，单位毫秒。不传表示不修改。</p>
    */
    @SerializedName("MTRTimeoutMs")
    @Expose
    private Long MTRTimeoutMs;

    /**
    * <p>路由追踪最大跳数。不传表示不修改。</p>
    */
    @SerializedName("MTRMaxHop")
    @Expose
    private Long MTRMaxHop;

    /**
    * <p>每一跳发包次数。不传表示不修改。</p>
    */
    @SerializedName("MTRPingCount")
    @Expose
    private Long MTRPingCount;

    /**
    * <p>慢请求阈值，单位毫秒。不传表示不修改。</p>
    */
    @SerializedName("SlowThresholdMs")
    @Expose
    private Long SlowThresholdMs;

    /**
    * <p>错误类型过滤。不传表示不修改。</p>
    */
    @SerializedName("ErrorType")
    @Expose
    private String ErrorType;

    /**
    * <p>允许启动的客户端地区，逗号分隔，名称必须与分析页客户端地区完全一致。不传保留原值，空字符串清空。空名单表示不限制。</p>
    */
    @SerializedName("Regions")
    @Expose
    private String Regions;

    /**
    * <p>允许启动的客户端运营商，逗号分隔，名称必须与分析页客户端运营商完全一致。不传保留原值，空字符串清空。空名单表示不限制。</p>
    */
    @SerializedName("Operators")
    @Expose
    private String Operators;

    /**
    * <p>允许启动的用户 ID，逗号分隔。不传保留原值，空字符串清空。空名单表示不限制。</p>
    */
    @SerializedName("UserIds")
    @Expose
    private String UserIds;

    /**
    * <p>允许启动的设备 ID，逗号分隔。不传保留原值，空字符串清空。空名单表示不限制。</p>
    */
    @SerializedName("DeviceIds")
    @Expose
    private String DeviceIds;

    /**
     * Get <p>应用 ID</p> 
     * @return AppId <p>应用 ID</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用 ID</p>
     * @param AppId <p>应用 ID</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

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
     * Get <p>任务名称。不传表示不修改。</p> 
     * @return TaskName <p>任务名称。不传表示不修改。</p>
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>任务名称。不传表示不修改。</p>
     * @param TaskName <p>任务名称。不传表示不修改。</p>
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>任务状态。取值说明：active、paused。不传表示不修改。不能改为 deleted。</p> 
     * @return Status <p>任务状态。取值说明：active、paused。不传表示不修改。不能改为 deleted。</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态。取值说明：active、paused。不传表示不修改。不能改为 deleted。</p>
     * @param Status <p>任务状态。取值说明：active、paused。不传表示不修改。不能改为 deleted。</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>探测类型。创建后不可修改。</p> 
     * @return Type <p>探测类型。创建后不可修改。</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>探测类型。创建后不可修改。</p>
     * @param Type <p>探测类型。创建后不可修改。</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>执行时机。创建后不可修改。</p> 
     * @return ExecutionTime <p>执行时机。创建后不可修改。</p>
     */
    public String getExecutionTime() {
        return this.ExecutionTime;
    }

    /**
     * Set <p>执行时机。创建后不可修改。</p>
     * @param ExecutionTime <p>执行时机。创建后不可修改。</p>
     */
    public void setExecutionTime(String ExecutionTime) {
        this.ExecutionTime = ExecutionTime;
    }

    /**
     * Get <p>监听域名。不传表示不修改。</p> 
     * @return WatchDomain <p>监听域名。不传表示不修改。</p>
     */
    public String getWatchDomain() {
        return this.WatchDomain;
    }

    /**
     * Set <p>监听域名。不传表示不修改。</p>
     * @param WatchDomain <p>监听域名。不传表示不修改。</p>
     */
    public void setWatchDomain(String WatchDomain) {
        this.WatchDomain = WatchDomain;
    }

    /**
     * Get <p>拨测目标。不传表示不修改。</p> 
     * @return DialDomain <p>拨测目标。不传表示不修改。</p>
     */
    public String getDialDomain() {
        return this.DialDomain;
    }

    /**
     * Set <p>拨测目标。不传表示不修改。</p>
     * @param DialDomain <p>拨测目标。不传表示不修改。</p>
     */
    public void setDialDomain(String DialDomain) {
        this.DialDomain = DialDomain;
    }

    /**
     * Get <p>TCP 端口。不传表示不修改。</p> 
     * @return Port <p>TCP 端口。不传表示不修改。</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>TCP 端口。不传表示不修改。</p>
     * @param Port <p>TCP 端口。不传表示不修改。</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>实时拨测间隔，单位毫秒。不传表示不修改。</p> 
     * @return FrequencyMs <p>实时拨测间隔，单位毫秒。不传表示不修改。</p>
     */
    public Long getFrequencyMs() {
        return this.FrequencyMs;
    }

    /**
     * Set <p>实时拨测间隔，单位毫秒。不传表示不修改。</p>
     * @param FrequencyMs <p>实时拨测间隔，单位毫秒。不传表示不修改。</p>
     */
    public void setFrequencyMs(Long FrequencyMs) {
        this.FrequencyMs = FrequencyMs;
    }

    /**
     * Get <p>单次探测超时，单位毫秒。不传表示不修改。</p> 
     * @return TimeoutMs <p>单次探测超时，单位毫秒。不传表示不修改。</p>
     */
    public Long getTimeoutMs() {
        return this.TimeoutMs;
    }

    /**
     * Set <p>单次探测超时，单位毫秒。不传表示不修改。</p>
     * @param TimeoutMs <p>单次探测超时，单位毫秒。不传表示不修改。</p>
     */
    public void setTimeoutMs(Long TimeoutMs) {
        this.TimeoutMs = TimeoutMs;
    }

    /**
     * Get <p>探测周期，单位毫秒。不传表示不修改。</p> 
     * @return PeriodMs <p>探测周期，单位毫秒。不传表示不修改。</p>
     */
    public Long getPeriodMs() {
        return this.PeriodMs;
    }

    /**
     * Set <p>探测周期，单位毫秒。不传表示不修改。</p>
     * @param PeriodMs <p>探测周期，单位毫秒。不传表示不修改。</p>
     */
    public void setPeriodMs(Long PeriodMs) {
        this.PeriodMs = PeriodMs;
    }

    /**
     * Get <p>发包次数。不传表示不修改。</p> 
     * @return PackageCount <p>发包次数。不传表示不修改。</p>
     */
    public Long getPackageCount() {
        return this.PackageCount;
    }

    /**
     * Set <p>发包次数。不传表示不修改。</p>
     * @param PackageCount <p>发包次数。不传表示不修改。</p>
     */
    public void setPackageCount(Long PackageCount) {
        this.PackageCount = PackageCount;
    }

    /**
     * Get <p>ICMP 包大小，单位字节。不传表示不修改。</p> 
     * @return PackageSize <p>ICMP 包大小，单位字节。不传表示不修改。</p>
     */
    public Long getPackageSize() {
        return this.PackageSize;
    }

    /**
     * Set <p>ICMP 包大小，单位字节。不传表示不修改。</p>
     * @param PackageSize <p>ICMP 包大小，单位字节。不传表示不修改。</p>
     */
    public void setPackageSize(Long PackageSize) {
        this.PackageSize = PackageSize;
    }

    /**
     * Get <p>是否做路由追踪。取值说明：0 否，1 是。不传表示不修改。</p> 
     * @return NeedMTR <p>是否做路由追踪。取值说明：0 否，1 是。不传表示不修改。</p>
     */
    public Long getNeedMTR() {
        return this.NeedMTR;
    }

    /**
     * Set <p>是否做路由追踪。取值说明：0 否，1 是。不传表示不修改。</p>
     * @param NeedMTR <p>是否做路由追踪。取值说明：0 否，1 是。不传表示不修改。</p>
     */
    public void setNeedMTR(Long NeedMTR) {
        this.NeedMTR = NeedMTR;
    }

    /**
     * Get <p>路由追踪超时，单位毫秒。不传表示不修改。</p> 
     * @return MTRTimeoutMs <p>路由追踪超时，单位毫秒。不传表示不修改。</p>
     */
    public Long getMTRTimeoutMs() {
        return this.MTRTimeoutMs;
    }

    /**
     * Set <p>路由追踪超时，单位毫秒。不传表示不修改。</p>
     * @param MTRTimeoutMs <p>路由追踪超时，单位毫秒。不传表示不修改。</p>
     */
    public void setMTRTimeoutMs(Long MTRTimeoutMs) {
        this.MTRTimeoutMs = MTRTimeoutMs;
    }

    /**
     * Get <p>路由追踪最大跳数。不传表示不修改。</p> 
     * @return MTRMaxHop <p>路由追踪最大跳数。不传表示不修改。</p>
     */
    public Long getMTRMaxHop() {
        return this.MTRMaxHop;
    }

    /**
     * Set <p>路由追踪最大跳数。不传表示不修改。</p>
     * @param MTRMaxHop <p>路由追踪最大跳数。不传表示不修改。</p>
     */
    public void setMTRMaxHop(Long MTRMaxHop) {
        this.MTRMaxHop = MTRMaxHop;
    }

    /**
     * Get <p>每一跳发包次数。不传表示不修改。</p> 
     * @return MTRPingCount <p>每一跳发包次数。不传表示不修改。</p>
     */
    public Long getMTRPingCount() {
        return this.MTRPingCount;
    }

    /**
     * Set <p>每一跳发包次数。不传表示不修改。</p>
     * @param MTRPingCount <p>每一跳发包次数。不传表示不修改。</p>
     */
    public void setMTRPingCount(Long MTRPingCount) {
        this.MTRPingCount = MTRPingCount;
    }

    /**
     * Get <p>慢请求阈值，单位毫秒。不传表示不修改。</p> 
     * @return SlowThresholdMs <p>慢请求阈值，单位毫秒。不传表示不修改。</p>
     */
    public Long getSlowThresholdMs() {
        return this.SlowThresholdMs;
    }

    /**
     * Set <p>慢请求阈值，单位毫秒。不传表示不修改。</p>
     * @param SlowThresholdMs <p>慢请求阈值，单位毫秒。不传表示不修改。</p>
     */
    public void setSlowThresholdMs(Long SlowThresholdMs) {
        this.SlowThresholdMs = SlowThresholdMs;
    }

    /**
     * Get <p>错误类型过滤。不传表示不修改。</p> 
     * @return ErrorType <p>错误类型过滤。不传表示不修改。</p>
     */
    public String getErrorType() {
        return this.ErrorType;
    }

    /**
     * Set <p>错误类型过滤。不传表示不修改。</p>
     * @param ErrorType <p>错误类型过滤。不传表示不修改。</p>
     */
    public void setErrorType(String ErrorType) {
        this.ErrorType = ErrorType;
    }

    /**
     * Get <p>允许启动的客户端地区，逗号分隔，名称必须与分析页客户端地区完全一致。不传保留原值，空字符串清空。空名单表示不限制。</p> 
     * @return Regions <p>允许启动的客户端地区，逗号分隔，名称必须与分析页客户端地区完全一致。不传保留原值，空字符串清空。空名单表示不限制。</p>
     */
    public String getRegions() {
        return this.Regions;
    }

    /**
     * Set <p>允许启动的客户端地区，逗号分隔，名称必须与分析页客户端地区完全一致。不传保留原值，空字符串清空。空名单表示不限制。</p>
     * @param Regions <p>允许启动的客户端地区，逗号分隔，名称必须与分析页客户端地区完全一致。不传保留原值，空字符串清空。空名单表示不限制。</p>
     */
    public void setRegions(String Regions) {
        this.Regions = Regions;
    }

    /**
     * Get <p>允许启动的客户端运营商，逗号分隔，名称必须与分析页客户端运营商完全一致。不传保留原值，空字符串清空。空名单表示不限制。</p> 
     * @return Operators <p>允许启动的客户端运营商，逗号分隔，名称必须与分析页客户端运营商完全一致。不传保留原值，空字符串清空。空名单表示不限制。</p>
     */
    public String getOperators() {
        return this.Operators;
    }

    /**
     * Set <p>允许启动的客户端运营商，逗号分隔，名称必须与分析页客户端运营商完全一致。不传保留原值，空字符串清空。空名单表示不限制。</p>
     * @param Operators <p>允许启动的客户端运营商，逗号分隔，名称必须与分析页客户端运营商完全一致。不传保留原值，空字符串清空。空名单表示不限制。</p>
     */
    public void setOperators(String Operators) {
        this.Operators = Operators;
    }

    /**
     * Get <p>允许启动的用户 ID，逗号分隔。不传保留原值，空字符串清空。空名单表示不限制。</p> 
     * @return UserIds <p>允许启动的用户 ID，逗号分隔。不传保留原值，空字符串清空。空名单表示不限制。</p>
     */
    public String getUserIds() {
        return this.UserIds;
    }

    /**
     * Set <p>允许启动的用户 ID，逗号分隔。不传保留原值，空字符串清空。空名单表示不限制。</p>
     * @param UserIds <p>允许启动的用户 ID，逗号分隔。不传保留原值，空字符串清空。空名单表示不限制。</p>
     */
    public void setUserIds(String UserIds) {
        this.UserIds = UserIds;
    }

    /**
     * Get <p>允许启动的设备 ID，逗号分隔。不传保留原值，空字符串清空。空名单表示不限制。</p> 
     * @return DeviceIds <p>允许启动的设备 ID，逗号分隔。不传保留原值，空字符串清空。空名单表示不限制。</p>
     */
    public String getDeviceIds() {
        return this.DeviceIds;
    }

    /**
     * Set <p>允许启动的设备 ID，逗号分隔。不传保留原值，空字符串清空。空名单表示不限制。</p>
     * @param DeviceIds <p>允许启动的设备 ID，逗号分隔。不传保留原值，空字符串清空。空名单表示不限制。</p>
     */
    public void setDeviceIds(String DeviceIds) {
        this.DeviceIds = DeviceIds;
    }

    public ModifyTDEMDialTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTDEMDialTaskRequest(ModifyTDEMDialTaskRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
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

    }
}

