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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApmApplicationConfigView extends AbstractModel {

    /**
    * 业务系统 ID
    */
    @SerializedName("InstanceKey")
    @Expose
    private String InstanceKey;

    /**
    * 应用名	
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * 接口过滤
    */
    @SerializedName("OperationNameFilter")
    @Expose
    private String OperationNameFilter;

    /**
    * 错误类型过滤
    */
    @SerializedName("ExceptionFilter")
    @Expose
    private String ExceptionFilter;

    /**
    * HTTP 状态码过滤
    */
    @SerializedName("ErrorCodeFilter")
    @Expose
    private String ErrorCodeFilter;

    /**
    * 应用诊断开关（已废弃）
    */
    @SerializedName("EventEnable")
    @Expose
    private Boolean EventEnable;

    /**
    * URL 收敛开关 0 关 1 开
    */
    @SerializedName("UrlConvergenceSwitch")
    @Expose
    private Long UrlConvergenceSwitch;

    /**
    * URL 收敛阈值	
    */
    @SerializedName("UrlConvergenceThreshold")
    @Expose
    private Long UrlConvergenceThreshold;

    /**
    * URL 收敛规则正则	
    */
    @SerializedName("UrlConvergence")
    @Expose
    private String UrlConvergence;

    /**
    * URL 排除规则正则
    */
    @SerializedName("UrlExclude")
    @Expose
    private String UrlExclude;

    /**
    * 是否开启日志 0 关 1 开
    */
    @SerializedName("IsRelatedLog")
    @Expose
    private Long IsRelatedLog;

    /**
    * 日志源	
    */
    @SerializedName("LogSource")
    @Expose
    private String LogSource;

    /**
    * 日志集 
    */
    @SerializedName("LogSet")
    @Expose
    private String LogSet;

    /**
    * 日志主题
    */
    @SerializedName("LogTopicID")
    @Expose
    private String LogTopicID;

    /**
    * 方法栈快照开关 true 开启 false 关闭
    */
    @SerializedName("SnapshotEnable")
    @Expose
    private Boolean SnapshotEnable;

    /**
    * 慢调用监听触发阈值
    */
    @SerializedName("SnapshotTimeout")
    @Expose
    private Long SnapshotTimeout;

    /**
    * 探针总开关
    */
    @SerializedName("AgentEnable")
    @Expose
    private Boolean AgentEnable;

    /**
    * 组件列表开关（已废弃）
    */
    @SerializedName("InstrumentList")
    @Expose
    private Instrument [] InstrumentList;

    /**
    * 链路压缩开关（已废弃）
    */
    @SerializedName("TraceSquash")
    @Expose
    private Boolean TraceSquash;

    /**
    * 探针熔断内存阈值
    */
    @SerializedName("DisableMemoryUsed")
    @Expose
    private Long DisableMemoryUsed;

    /**
    * 探针熔断CPU阈值
    */
    @SerializedName("DisableCpuUsed")
    @Expose
    private Long DisableCpuUsed;

    /**
     * Get 业务系统 ID 
     * @return InstanceKey 业务系统 ID
     */
    public String getInstanceKey() {
        return this.InstanceKey;
    }

    /**
     * Set 业务系统 ID
     * @param InstanceKey 业务系统 ID
     */
    public void setInstanceKey(String InstanceKey) {
        this.InstanceKey = InstanceKey;
    }

    /**
     * Get 应用名	 
     * @return ServiceName 应用名	
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 应用名	
     * @param ServiceName 应用名	
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get 接口过滤 
     * @return OperationNameFilter 接口过滤
     */
    public String getOperationNameFilter() {
        return this.OperationNameFilter;
    }

    /**
     * Set 接口过滤
     * @param OperationNameFilter 接口过滤
     */
    public void setOperationNameFilter(String OperationNameFilter) {
        this.OperationNameFilter = OperationNameFilter;
    }

    /**
     * Get 错误类型过滤 
     * @return ExceptionFilter 错误类型过滤
     */
    public String getExceptionFilter() {
        return this.ExceptionFilter;
    }

    /**
     * Set 错误类型过滤
     * @param ExceptionFilter 错误类型过滤
     */
    public void setExceptionFilter(String ExceptionFilter) {
        this.ExceptionFilter = ExceptionFilter;
    }

    /**
     * Get HTTP 状态码过滤 
     * @return ErrorCodeFilter HTTP 状态码过滤
     */
    public String getErrorCodeFilter() {
        return this.ErrorCodeFilter;
    }

    /**
     * Set HTTP 状态码过滤
     * @param ErrorCodeFilter HTTP 状态码过滤
     */
    public void setErrorCodeFilter(String ErrorCodeFilter) {
        this.ErrorCodeFilter = ErrorCodeFilter;
    }

    /**
     * Get 应用诊断开关（已废弃） 
     * @return EventEnable 应用诊断开关（已废弃）
     */
    public Boolean getEventEnable() {
        return this.EventEnable;
    }

    /**
     * Set 应用诊断开关（已废弃）
     * @param EventEnable 应用诊断开关（已废弃）
     */
    public void setEventEnable(Boolean EventEnable) {
        this.EventEnable = EventEnable;
    }

    /**
     * Get URL 收敛开关 0 关 1 开 
     * @return UrlConvergenceSwitch URL 收敛开关 0 关 1 开
     */
    public Long getUrlConvergenceSwitch() {
        return this.UrlConvergenceSwitch;
    }

    /**
     * Set URL 收敛开关 0 关 1 开
     * @param UrlConvergenceSwitch URL 收敛开关 0 关 1 开
     */
    public void setUrlConvergenceSwitch(Long UrlConvergenceSwitch) {
        this.UrlConvergenceSwitch = UrlConvergenceSwitch;
    }

    /**
     * Get URL 收敛阈值	 
     * @return UrlConvergenceThreshold URL 收敛阈值	
     */
    public Long getUrlConvergenceThreshold() {
        return this.UrlConvergenceThreshold;
    }

    /**
     * Set URL 收敛阈值	
     * @param UrlConvergenceThreshold URL 收敛阈值	
     */
    public void setUrlConvergenceThreshold(Long UrlConvergenceThreshold) {
        this.UrlConvergenceThreshold = UrlConvergenceThreshold;
    }

    /**
     * Get URL 收敛规则正则	 
     * @return UrlConvergence URL 收敛规则正则	
     */
    public String getUrlConvergence() {
        return this.UrlConvergence;
    }

    /**
     * Set URL 收敛规则正则	
     * @param UrlConvergence URL 收敛规则正则	
     */
    public void setUrlConvergence(String UrlConvergence) {
        this.UrlConvergence = UrlConvergence;
    }

    /**
     * Get URL 排除规则正则 
     * @return UrlExclude URL 排除规则正则
     */
    public String getUrlExclude() {
        return this.UrlExclude;
    }

    /**
     * Set URL 排除规则正则
     * @param UrlExclude URL 排除规则正则
     */
    public void setUrlExclude(String UrlExclude) {
        this.UrlExclude = UrlExclude;
    }

    /**
     * Get 是否开启日志 0 关 1 开 
     * @return IsRelatedLog 是否开启日志 0 关 1 开
     */
    public Long getIsRelatedLog() {
        return this.IsRelatedLog;
    }

    /**
     * Set 是否开启日志 0 关 1 开
     * @param IsRelatedLog 是否开启日志 0 关 1 开
     */
    public void setIsRelatedLog(Long IsRelatedLog) {
        this.IsRelatedLog = IsRelatedLog;
    }

    /**
     * Get 日志源	 
     * @return LogSource 日志源	
     */
    public String getLogSource() {
        return this.LogSource;
    }

    /**
     * Set 日志源	
     * @param LogSource 日志源	
     */
    public void setLogSource(String LogSource) {
        this.LogSource = LogSource;
    }

    /**
     * Get 日志集  
     * @return LogSet 日志集 
     */
    public String getLogSet() {
        return this.LogSet;
    }

    /**
     * Set 日志集 
     * @param LogSet 日志集 
     */
    public void setLogSet(String LogSet) {
        this.LogSet = LogSet;
    }

    /**
     * Get 日志主题 
     * @return LogTopicID 日志主题
     */
    public String getLogTopicID() {
        return this.LogTopicID;
    }

    /**
     * Set 日志主题
     * @param LogTopicID 日志主题
     */
    public void setLogTopicID(String LogTopicID) {
        this.LogTopicID = LogTopicID;
    }

    /**
     * Get 方法栈快照开关 true 开启 false 关闭 
     * @return SnapshotEnable 方法栈快照开关 true 开启 false 关闭
     */
    public Boolean getSnapshotEnable() {
        return this.SnapshotEnable;
    }

    /**
     * Set 方法栈快照开关 true 开启 false 关闭
     * @param SnapshotEnable 方法栈快照开关 true 开启 false 关闭
     */
    public void setSnapshotEnable(Boolean SnapshotEnable) {
        this.SnapshotEnable = SnapshotEnable;
    }

    /**
     * Get 慢调用监听触发阈值 
     * @return SnapshotTimeout 慢调用监听触发阈值
     */
    public Long getSnapshotTimeout() {
        return this.SnapshotTimeout;
    }

    /**
     * Set 慢调用监听触发阈值
     * @param SnapshotTimeout 慢调用监听触发阈值
     */
    public void setSnapshotTimeout(Long SnapshotTimeout) {
        this.SnapshotTimeout = SnapshotTimeout;
    }

    /**
     * Get 探针总开关 
     * @return AgentEnable 探针总开关
     */
    public Boolean getAgentEnable() {
        return this.AgentEnable;
    }

    /**
     * Set 探针总开关
     * @param AgentEnable 探针总开关
     */
    public void setAgentEnable(Boolean AgentEnable) {
        this.AgentEnable = AgentEnable;
    }

    /**
     * Get 组件列表开关（已废弃） 
     * @return InstrumentList 组件列表开关（已废弃）
     */
    public Instrument [] getInstrumentList() {
        return this.InstrumentList;
    }

    /**
     * Set 组件列表开关（已废弃）
     * @param InstrumentList 组件列表开关（已废弃）
     */
    public void setInstrumentList(Instrument [] InstrumentList) {
        this.InstrumentList = InstrumentList;
    }

    /**
     * Get 链路压缩开关（已废弃） 
     * @return TraceSquash 链路压缩开关（已废弃）
     */
    public Boolean getTraceSquash() {
        return this.TraceSquash;
    }

    /**
     * Set 链路压缩开关（已废弃）
     * @param TraceSquash 链路压缩开关（已废弃）
     */
    public void setTraceSquash(Boolean TraceSquash) {
        this.TraceSquash = TraceSquash;
    }

    /**
     * Get 探针熔断内存阈值 
     * @return DisableMemoryUsed 探针熔断内存阈值
     */
    public Long getDisableMemoryUsed() {
        return this.DisableMemoryUsed;
    }

    /**
     * Set 探针熔断内存阈值
     * @param DisableMemoryUsed 探针熔断内存阈值
     */
    public void setDisableMemoryUsed(Long DisableMemoryUsed) {
        this.DisableMemoryUsed = DisableMemoryUsed;
    }

    /**
     * Get 探针熔断CPU阈值 
     * @return DisableCpuUsed 探针熔断CPU阈值
     */
    public Long getDisableCpuUsed() {
        return this.DisableCpuUsed;
    }

    /**
     * Set 探针熔断CPU阈值
     * @param DisableCpuUsed 探针熔断CPU阈值
     */
    public void setDisableCpuUsed(Long DisableCpuUsed) {
        this.DisableCpuUsed = DisableCpuUsed;
    }

    public ApmApplicationConfigView() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApmApplicationConfigView(ApmApplicationConfigView source) {
        if (source.InstanceKey != null) {
            this.InstanceKey = new String(source.InstanceKey);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.OperationNameFilter != null) {
            this.OperationNameFilter = new String(source.OperationNameFilter);
        }
        if (source.ExceptionFilter != null) {
            this.ExceptionFilter = new String(source.ExceptionFilter);
        }
        if (source.ErrorCodeFilter != null) {
            this.ErrorCodeFilter = new String(source.ErrorCodeFilter);
        }
        if (source.EventEnable != null) {
            this.EventEnable = new Boolean(source.EventEnable);
        }
        if (source.UrlConvergenceSwitch != null) {
            this.UrlConvergenceSwitch = new Long(source.UrlConvergenceSwitch);
        }
        if (source.UrlConvergenceThreshold != null) {
            this.UrlConvergenceThreshold = new Long(source.UrlConvergenceThreshold);
        }
        if (source.UrlConvergence != null) {
            this.UrlConvergence = new String(source.UrlConvergence);
        }
        if (source.UrlExclude != null) {
            this.UrlExclude = new String(source.UrlExclude);
        }
        if (source.IsRelatedLog != null) {
            this.IsRelatedLog = new Long(source.IsRelatedLog);
        }
        if (source.LogSource != null) {
            this.LogSource = new String(source.LogSource);
        }
        if (source.LogSet != null) {
            this.LogSet = new String(source.LogSet);
        }
        if (source.LogTopicID != null) {
            this.LogTopicID = new String(source.LogTopicID);
        }
        if (source.SnapshotEnable != null) {
            this.SnapshotEnable = new Boolean(source.SnapshotEnable);
        }
        if (source.SnapshotTimeout != null) {
            this.SnapshotTimeout = new Long(source.SnapshotTimeout);
        }
        if (source.AgentEnable != null) {
            this.AgentEnable = new Boolean(source.AgentEnable);
        }
        if (source.InstrumentList != null) {
            this.InstrumentList = new Instrument[source.InstrumentList.length];
            for (int i = 0; i < source.InstrumentList.length; i++) {
                this.InstrumentList[i] = new Instrument(source.InstrumentList[i]);
            }
        }
        if (source.TraceSquash != null) {
            this.TraceSquash = new Boolean(source.TraceSquash);
        }
        if (source.DisableMemoryUsed != null) {
            this.DisableMemoryUsed = new Long(source.DisableMemoryUsed);
        }
        if (source.DisableCpuUsed != null) {
            this.DisableCpuUsed = new Long(source.DisableCpuUsed);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceKey", this.InstanceKey);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "OperationNameFilter", this.OperationNameFilter);
        this.setParamSimple(map, prefix + "ExceptionFilter", this.ExceptionFilter);
        this.setParamSimple(map, prefix + "ErrorCodeFilter", this.ErrorCodeFilter);
        this.setParamSimple(map, prefix + "EventEnable", this.EventEnable);
        this.setParamSimple(map, prefix + "UrlConvergenceSwitch", this.UrlConvergenceSwitch);
        this.setParamSimple(map, prefix + "UrlConvergenceThreshold", this.UrlConvergenceThreshold);
        this.setParamSimple(map, prefix + "UrlConvergence", this.UrlConvergence);
        this.setParamSimple(map, prefix + "UrlExclude", this.UrlExclude);
        this.setParamSimple(map, prefix + "IsRelatedLog", this.IsRelatedLog);
        this.setParamSimple(map, prefix + "LogSource", this.LogSource);
        this.setParamSimple(map, prefix + "LogSet", this.LogSet);
        this.setParamSimple(map, prefix + "LogTopicID", this.LogTopicID);
        this.setParamSimple(map, prefix + "SnapshotEnable", this.SnapshotEnable);
        this.setParamSimple(map, prefix + "SnapshotTimeout", this.SnapshotTimeout);
        this.setParamSimple(map, prefix + "AgentEnable", this.AgentEnable);
        this.setParamArrayObj(map, prefix + "InstrumentList.", this.InstrumentList);
        this.setParamSimple(map, prefix + "TraceSquash", this.TraceSquash);
        this.setParamSimple(map, prefix + "DisableMemoryUsed", this.DisableMemoryUsed);
        this.setParamSimple(map, prefix + "DisableCpuUsed", this.DisableCpuUsed);

    }
}

