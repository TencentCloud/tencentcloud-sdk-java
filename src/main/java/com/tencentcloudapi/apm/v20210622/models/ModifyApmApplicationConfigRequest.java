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

public class ModifyApmApplicationConfigRequest extends AbstractModel {

    /**
    * 业务系统 ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 应用名
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * URL收敛开关,0 关 | 1 开
    */
    @SerializedName("UrlConvergenceSwitch")
    @Expose
    private Long UrlConvergenceSwitch;

    /**
    * URL收敛阈值
    */
    @SerializedName("UrlConvergenceThreshold")
    @Expose
    private Long UrlConvergenceThreshold;

    /**
    * 异常过滤正则规则，逗号分隔
    */
    @SerializedName("ExceptionFilter")
    @Expose
    private String ExceptionFilter;

    /**
    * URL收敛正则规则，逗号分隔
    */
    @SerializedName("UrlConvergence")
    @Expose
    private String UrlConvergence;

    /**
    * 错误码过滤，逗号分隔
    */
    @SerializedName("ErrorCodeFilter")
    @Expose
    private String ErrorCodeFilter;

    /**
    * URL排除正则规则，逗号分隔
    */
    @SerializedName("UrlExclude")
    @Expose
    private String UrlExclude;

    /**
    * 日志开关 0 关 1 开
    */
    @SerializedName("IsRelatedLog")
    @Expose
    private Long IsRelatedLog;

    /**
    * 日志地域
    */
    @SerializedName("LogRegion")
    @Expose
    private String LogRegion;

    /**
    * 日志主题ID
    */
    @SerializedName("LogTopicID")
    @Expose
    private String LogTopicID;

    /**
    * CLS 日志集 | ES 集群ID
    */
    @SerializedName("LogSet")
    @Expose
    private String LogSet;

    /**
    * 日志来源 CLS | ES
    */
    @SerializedName("LogSource")
    @Expose
    private String LogSource;

    /**
    * 需过滤的接口
    */
    @SerializedName("IgnoreOperationName")
    @Expose
    private String IgnoreOperationName;

    /**
    * 是否开启线程剖析
    */
    @SerializedName("EnableSnapshot")
    @Expose
    private Boolean EnableSnapshot;

    /**
    * 线程剖析超时阈值
    */
    @SerializedName("SnapshotTimeout")
    @Expose
    private Long SnapshotTimeout;

    /**
    * 是否开启agent
    */
    @SerializedName("AgentEnable")
    @Expose
    private Boolean AgentEnable;

    /**
    * 是否开启链路压缩
    */
    @SerializedName("TraceSquash")
    @Expose
    private Boolean TraceSquash;

    /**
    * 是否开启应用诊断的开关
    */
    @SerializedName("EventEnable")
    @Expose
    private Boolean EventEnable;

    /**
    * 组件列表
    */
    @SerializedName("InstrumentList")
    @Expose
    private Instrument [] InstrumentList;

    /**
    * 探针接口相关配置
    */
    @SerializedName("AgentOperationConfigView")
    @Expose
    private AgentOperationConfigView AgentOperationConfigView;

    /**
    * 是否开启应用日志配置
    */
    @SerializedName("EnableLogConfig")
    @Expose
    private Boolean EnableLogConfig;

    /**
    * 应用是否开启dashboard配置： false 关（与业务系统保持一致）/true 开（应用级配置）
    */
    @SerializedName("EnableDashboardConfig")
    @Expose
    private Boolean EnableDashboardConfig;

    /**
    * 是否关联dashboard： 0 关 1 开
    */
    @SerializedName("IsRelatedDashboard")
    @Expose
    private Long IsRelatedDashboard;

    /**
    * dashboard ID
    */
    @SerializedName("DashboardTopicID")
    @Expose
    private String DashboardTopicID;

    /**
    * CLS索引类型(0=全文索引，1=键值索引)
    */
    @SerializedName("LogIndexType")
    @Expose
    private Long LogIndexType;

    /**
    * traceId的索引key: 当CLS索引类型为键值索引时生效
    */
    @SerializedName("LogTraceIdKey")
    @Expose
    private String LogTraceIdKey;

    /**
    * 是否开启应用安全配置
    */
    @SerializedName("EnableSecurityConfig")
    @Expose
    private Boolean EnableSecurityConfig;

    /**
    * 是否开启SQL注入分析
    */
    @SerializedName("IsSqlInjectionAnalysis")
    @Expose
    private Long IsSqlInjectionAnalysis;

    /**
    * 是否开启组件漏洞检测
    */
    @SerializedName("IsInstrumentationVulnerabilityScan")
    @Expose
    private Long IsInstrumentationVulnerabilityScan;

    /**
    * 是否开启远程命令检测
    */
    @SerializedName("IsRemoteCommandExecutionAnalysis")
    @Expose
    private Long IsRemoteCommandExecutionAnalysis;

    /**
    * 是否开启内存马检测
    */
    @SerializedName("IsMemoryHijackingAnalysis")
    @Expose
    private Long IsMemoryHijackingAnalysis;

    /**
    * 是否开启删除任意文件检测（0-关闭，1-开启）
    */
    @SerializedName("IsDeleteAnyFileAnalysis")
    @Expose
    private Long IsDeleteAnyFileAnalysis;

    /**
    * 是否开启读取任意文件检测（0-关闭，1-开启）
    */
    @SerializedName("IsReadAnyFileAnalysis")
    @Expose
    private Long IsReadAnyFileAnalysis;

    /**
    * 是否开启上传任意文件检测（0-关闭，1-开启）
    */
    @SerializedName("IsUploadAnyFileAnalysis")
    @Expose
    private Long IsUploadAnyFileAnalysis;

    /**
    * 是否开启包含任意文件检测（0-关闭，1-开启）
    */
    @SerializedName("IsIncludeAnyFileAnalysis")
    @Expose
    private Long IsIncludeAnyFileAnalysis;

    /**
    * 是否开启目录遍历检测（0-关闭，1-开启）
    */
    @SerializedName("IsDirectoryTraversalAnalysis")
    @Expose
    private Long IsDirectoryTraversalAnalysis;

    /**
    * 是否开启模板引擎注入检测（0-关闭，1-开启）
    */
    @SerializedName("IsTemplateEngineInjectionAnalysis")
    @Expose
    private Long IsTemplateEngineInjectionAnalysis;

    /**
    * 是否开启脚本引擎注入检测（0-关闭，1-开启）
    */
    @SerializedName("IsScriptEngineInjectionAnalysis")
    @Expose
    private Long IsScriptEngineInjectionAnalysis;

    /**
    * 是否开启表达式注入检测（0-关闭，1-开启）
    */
    @SerializedName("IsExpressionInjectionAnalysis")
    @Expose
    private Long IsExpressionInjectionAnalysis;

    /**
    * 是否开启JNDI注入检测（0-关闭，1-开启）
    */
    @SerializedName("IsJNDIInjectionAnalysis")
    @Expose
    private Long IsJNDIInjectionAnalysis;

    /**
    * 是否开启JNI注入检测（0-关闭，1-开启）
    */
    @SerializedName("IsJNIInjectionAnalysis")
    @Expose
    private Long IsJNIInjectionAnalysis;

    /**
    * 是否开启Webshell后门检测（0-关闭，1-开启）
    */
    @SerializedName("IsWebshellBackdoorAnalysis")
    @Expose
    private Long IsWebshellBackdoorAnalysis;

    /**
    * 是否开启反序列化检测（0-关闭，1-开启）
    */
    @SerializedName("IsDeserializationAnalysis")
    @Expose
    private Long IsDeserializationAnalysis;

    /**
    * 接口自动收敛开关,0 关 | 1 开
    */
    @SerializedName("UrlAutoConvergenceEnable")
    @Expose
    private Boolean UrlAutoConvergenceEnable;

    /**
    * URL长分段收敛阈值
    */
    @SerializedName("UrlLongSegmentThreshold")
    @Expose
    private Long UrlLongSegmentThreshold;

    /**
    * URL数字分段收敛阈值
    */
    @SerializedName("UrlNumberSegmentThreshold")
    @Expose
    private Long UrlNumberSegmentThreshold;

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
    * 是否开启SQL参数获取
    */
    @SerializedName("DbStatementParametersEnabled")
    @Expose
    private Boolean DbStatementParametersEnabled;

    /**
    * 慢SQL阈值
    */
    @SerializedName("SlowSQLThresholds")
    @Expose
    private ApmTag [] SlowSQLThresholds;

    /**
    * 是否开启脱敏规则
    */
    @SerializedName("EnableDesensitizationRule")
    @Expose
    private Long EnableDesensitizationRule;

    /**
    * 脱敏规则
    */
    @SerializedName("DesensitizationRule")
    @Expose
    private String DesensitizationRule;

    /**
    * spanId的索引key: 当CLS索引类型为键值索引时生效
    */
    @SerializedName("LogSpanIdKey")
    @Expose
    private String LogSpanIdKey;

    /**
    * 自动性能剖析任务配置
    */
    @SerializedName("AutoProfilingConfig")
    @Expose
    private AutoProfilingConfig AutoProfilingConfig;

    /**
     * Get 业务系统 ID 
     * @return InstanceId 业务系统 ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 业务系统 ID
     * @param InstanceId 业务系统 ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
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
     * Get URL收敛开关,0 关 | 1 开 
     * @return UrlConvergenceSwitch URL收敛开关,0 关 | 1 开
     */
    public Long getUrlConvergenceSwitch() {
        return this.UrlConvergenceSwitch;
    }

    /**
     * Set URL收敛开关,0 关 | 1 开
     * @param UrlConvergenceSwitch URL收敛开关,0 关 | 1 开
     */
    public void setUrlConvergenceSwitch(Long UrlConvergenceSwitch) {
        this.UrlConvergenceSwitch = UrlConvergenceSwitch;
    }

    /**
     * Get URL收敛阈值 
     * @return UrlConvergenceThreshold URL收敛阈值
     */
    public Long getUrlConvergenceThreshold() {
        return this.UrlConvergenceThreshold;
    }

    /**
     * Set URL收敛阈值
     * @param UrlConvergenceThreshold URL收敛阈值
     */
    public void setUrlConvergenceThreshold(Long UrlConvergenceThreshold) {
        this.UrlConvergenceThreshold = UrlConvergenceThreshold;
    }

    /**
     * Get 异常过滤正则规则，逗号分隔 
     * @return ExceptionFilter 异常过滤正则规则，逗号分隔
     */
    public String getExceptionFilter() {
        return this.ExceptionFilter;
    }

    /**
     * Set 异常过滤正则规则，逗号分隔
     * @param ExceptionFilter 异常过滤正则规则，逗号分隔
     */
    public void setExceptionFilter(String ExceptionFilter) {
        this.ExceptionFilter = ExceptionFilter;
    }

    /**
     * Get URL收敛正则规则，逗号分隔 
     * @return UrlConvergence URL收敛正则规则，逗号分隔
     */
    public String getUrlConvergence() {
        return this.UrlConvergence;
    }

    /**
     * Set URL收敛正则规则，逗号分隔
     * @param UrlConvergence URL收敛正则规则，逗号分隔
     */
    public void setUrlConvergence(String UrlConvergence) {
        this.UrlConvergence = UrlConvergence;
    }

    /**
     * Get 错误码过滤，逗号分隔 
     * @return ErrorCodeFilter 错误码过滤，逗号分隔
     */
    public String getErrorCodeFilter() {
        return this.ErrorCodeFilter;
    }

    /**
     * Set 错误码过滤，逗号分隔
     * @param ErrorCodeFilter 错误码过滤，逗号分隔
     */
    public void setErrorCodeFilter(String ErrorCodeFilter) {
        this.ErrorCodeFilter = ErrorCodeFilter;
    }

    /**
     * Get URL排除正则规则，逗号分隔 
     * @return UrlExclude URL排除正则规则，逗号分隔
     */
    public String getUrlExclude() {
        return this.UrlExclude;
    }

    /**
     * Set URL排除正则规则，逗号分隔
     * @param UrlExclude URL排除正则规则，逗号分隔
     */
    public void setUrlExclude(String UrlExclude) {
        this.UrlExclude = UrlExclude;
    }

    /**
     * Get 日志开关 0 关 1 开 
     * @return IsRelatedLog 日志开关 0 关 1 开
     */
    public Long getIsRelatedLog() {
        return this.IsRelatedLog;
    }

    /**
     * Set 日志开关 0 关 1 开
     * @param IsRelatedLog 日志开关 0 关 1 开
     */
    public void setIsRelatedLog(Long IsRelatedLog) {
        this.IsRelatedLog = IsRelatedLog;
    }

    /**
     * Get 日志地域 
     * @return LogRegion 日志地域
     */
    public String getLogRegion() {
        return this.LogRegion;
    }

    /**
     * Set 日志地域
     * @param LogRegion 日志地域
     */
    public void setLogRegion(String LogRegion) {
        this.LogRegion = LogRegion;
    }

    /**
     * Get 日志主题ID 
     * @return LogTopicID 日志主题ID
     */
    public String getLogTopicID() {
        return this.LogTopicID;
    }

    /**
     * Set 日志主题ID
     * @param LogTopicID 日志主题ID
     */
    public void setLogTopicID(String LogTopicID) {
        this.LogTopicID = LogTopicID;
    }

    /**
     * Get CLS 日志集 | ES 集群ID 
     * @return LogSet CLS 日志集 | ES 集群ID
     */
    public String getLogSet() {
        return this.LogSet;
    }

    /**
     * Set CLS 日志集 | ES 集群ID
     * @param LogSet CLS 日志集 | ES 集群ID
     */
    public void setLogSet(String LogSet) {
        this.LogSet = LogSet;
    }

    /**
     * Get 日志来源 CLS | ES 
     * @return LogSource 日志来源 CLS | ES
     */
    public String getLogSource() {
        return this.LogSource;
    }

    /**
     * Set 日志来源 CLS | ES
     * @param LogSource 日志来源 CLS | ES
     */
    public void setLogSource(String LogSource) {
        this.LogSource = LogSource;
    }

    /**
     * Get 需过滤的接口 
     * @return IgnoreOperationName 需过滤的接口
     */
    public String getIgnoreOperationName() {
        return this.IgnoreOperationName;
    }

    /**
     * Set 需过滤的接口
     * @param IgnoreOperationName 需过滤的接口
     */
    public void setIgnoreOperationName(String IgnoreOperationName) {
        this.IgnoreOperationName = IgnoreOperationName;
    }

    /**
     * Get 是否开启线程剖析 
     * @return EnableSnapshot 是否开启线程剖析
     */
    public Boolean getEnableSnapshot() {
        return this.EnableSnapshot;
    }

    /**
     * Set 是否开启线程剖析
     * @param EnableSnapshot 是否开启线程剖析
     */
    public void setEnableSnapshot(Boolean EnableSnapshot) {
        this.EnableSnapshot = EnableSnapshot;
    }

    /**
     * Get 线程剖析超时阈值 
     * @return SnapshotTimeout 线程剖析超时阈值
     */
    public Long getSnapshotTimeout() {
        return this.SnapshotTimeout;
    }

    /**
     * Set 线程剖析超时阈值
     * @param SnapshotTimeout 线程剖析超时阈值
     */
    public void setSnapshotTimeout(Long SnapshotTimeout) {
        this.SnapshotTimeout = SnapshotTimeout;
    }

    /**
     * Get 是否开启agent 
     * @return AgentEnable 是否开启agent
     */
    public Boolean getAgentEnable() {
        return this.AgentEnable;
    }

    /**
     * Set 是否开启agent
     * @param AgentEnable 是否开启agent
     */
    public void setAgentEnable(Boolean AgentEnable) {
        this.AgentEnable = AgentEnable;
    }

    /**
     * Get 是否开启链路压缩 
     * @return TraceSquash 是否开启链路压缩
     */
    public Boolean getTraceSquash() {
        return this.TraceSquash;
    }

    /**
     * Set 是否开启链路压缩
     * @param TraceSquash 是否开启链路压缩
     */
    public void setTraceSquash(Boolean TraceSquash) {
        this.TraceSquash = TraceSquash;
    }

    /**
     * Get 是否开启应用诊断的开关 
     * @return EventEnable 是否开启应用诊断的开关
     */
    public Boolean getEventEnable() {
        return this.EventEnable;
    }

    /**
     * Set 是否开启应用诊断的开关
     * @param EventEnable 是否开启应用诊断的开关
     */
    public void setEventEnable(Boolean EventEnable) {
        this.EventEnable = EventEnable;
    }

    /**
     * Get 组件列表 
     * @return InstrumentList 组件列表
     */
    public Instrument [] getInstrumentList() {
        return this.InstrumentList;
    }

    /**
     * Set 组件列表
     * @param InstrumentList 组件列表
     */
    public void setInstrumentList(Instrument [] InstrumentList) {
        this.InstrumentList = InstrumentList;
    }

    /**
     * Get 探针接口相关配置 
     * @return AgentOperationConfigView 探针接口相关配置
     */
    public AgentOperationConfigView getAgentOperationConfigView() {
        return this.AgentOperationConfigView;
    }

    /**
     * Set 探针接口相关配置
     * @param AgentOperationConfigView 探针接口相关配置
     */
    public void setAgentOperationConfigView(AgentOperationConfigView AgentOperationConfigView) {
        this.AgentOperationConfigView = AgentOperationConfigView;
    }

    /**
     * Get 是否开启应用日志配置 
     * @return EnableLogConfig 是否开启应用日志配置
     */
    public Boolean getEnableLogConfig() {
        return this.EnableLogConfig;
    }

    /**
     * Set 是否开启应用日志配置
     * @param EnableLogConfig 是否开启应用日志配置
     */
    public void setEnableLogConfig(Boolean EnableLogConfig) {
        this.EnableLogConfig = EnableLogConfig;
    }

    /**
     * Get 应用是否开启dashboard配置： false 关（与业务系统保持一致）/true 开（应用级配置） 
     * @return EnableDashboardConfig 应用是否开启dashboard配置： false 关（与业务系统保持一致）/true 开（应用级配置）
     */
    public Boolean getEnableDashboardConfig() {
        return this.EnableDashboardConfig;
    }

    /**
     * Set 应用是否开启dashboard配置： false 关（与业务系统保持一致）/true 开（应用级配置）
     * @param EnableDashboardConfig 应用是否开启dashboard配置： false 关（与业务系统保持一致）/true 开（应用级配置）
     */
    public void setEnableDashboardConfig(Boolean EnableDashboardConfig) {
        this.EnableDashboardConfig = EnableDashboardConfig;
    }

    /**
     * Get 是否关联dashboard： 0 关 1 开 
     * @return IsRelatedDashboard 是否关联dashboard： 0 关 1 开
     */
    public Long getIsRelatedDashboard() {
        return this.IsRelatedDashboard;
    }

    /**
     * Set 是否关联dashboard： 0 关 1 开
     * @param IsRelatedDashboard 是否关联dashboard： 0 关 1 开
     */
    public void setIsRelatedDashboard(Long IsRelatedDashboard) {
        this.IsRelatedDashboard = IsRelatedDashboard;
    }

    /**
     * Get dashboard ID 
     * @return DashboardTopicID dashboard ID
     */
    public String getDashboardTopicID() {
        return this.DashboardTopicID;
    }

    /**
     * Set dashboard ID
     * @param DashboardTopicID dashboard ID
     */
    public void setDashboardTopicID(String DashboardTopicID) {
        this.DashboardTopicID = DashboardTopicID;
    }

    /**
     * Get CLS索引类型(0=全文索引，1=键值索引) 
     * @return LogIndexType CLS索引类型(0=全文索引，1=键值索引)
     */
    public Long getLogIndexType() {
        return this.LogIndexType;
    }

    /**
     * Set CLS索引类型(0=全文索引，1=键值索引)
     * @param LogIndexType CLS索引类型(0=全文索引，1=键值索引)
     */
    public void setLogIndexType(Long LogIndexType) {
        this.LogIndexType = LogIndexType;
    }

    /**
     * Get traceId的索引key: 当CLS索引类型为键值索引时生效 
     * @return LogTraceIdKey traceId的索引key: 当CLS索引类型为键值索引时生效
     */
    public String getLogTraceIdKey() {
        return this.LogTraceIdKey;
    }

    /**
     * Set traceId的索引key: 当CLS索引类型为键值索引时生效
     * @param LogTraceIdKey traceId的索引key: 当CLS索引类型为键值索引时生效
     */
    public void setLogTraceIdKey(String LogTraceIdKey) {
        this.LogTraceIdKey = LogTraceIdKey;
    }

    /**
     * Get 是否开启应用安全配置 
     * @return EnableSecurityConfig 是否开启应用安全配置
     */
    public Boolean getEnableSecurityConfig() {
        return this.EnableSecurityConfig;
    }

    /**
     * Set 是否开启应用安全配置
     * @param EnableSecurityConfig 是否开启应用安全配置
     */
    public void setEnableSecurityConfig(Boolean EnableSecurityConfig) {
        this.EnableSecurityConfig = EnableSecurityConfig;
    }

    /**
     * Get 是否开启SQL注入分析 
     * @return IsSqlInjectionAnalysis 是否开启SQL注入分析
     */
    public Long getIsSqlInjectionAnalysis() {
        return this.IsSqlInjectionAnalysis;
    }

    /**
     * Set 是否开启SQL注入分析
     * @param IsSqlInjectionAnalysis 是否开启SQL注入分析
     */
    public void setIsSqlInjectionAnalysis(Long IsSqlInjectionAnalysis) {
        this.IsSqlInjectionAnalysis = IsSqlInjectionAnalysis;
    }

    /**
     * Get 是否开启组件漏洞检测 
     * @return IsInstrumentationVulnerabilityScan 是否开启组件漏洞检测
     */
    public Long getIsInstrumentationVulnerabilityScan() {
        return this.IsInstrumentationVulnerabilityScan;
    }

    /**
     * Set 是否开启组件漏洞检测
     * @param IsInstrumentationVulnerabilityScan 是否开启组件漏洞检测
     */
    public void setIsInstrumentationVulnerabilityScan(Long IsInstrumentationVulnerabilityScan) {
        this.IsInstrumentationVulnerabilityScan = IsInstrumentationVulnerabilityScan;
    }

    /**
     * Get 是否开启远程命令检测 
     * @return IsRemoteCommandExecutionAnalysis 是否开启远程命令检测
     */
    public Long getIsRemoteCommandExecutionAnalysis() {
        return this.IsRemoteCommandExecutionAnalysis;
    }

    /**
     * Set 是否开启远程命令检测
     * @param IsRemoteCommandExecutionAnalysis 是否开启远程命令检测
     */
    public void setIsRemoteCommandExecutionAnalysis(Long IsRemoteCommandExecutionAnalysis) {
        this.IsRemoteCommandExecutionAnalysis = IsRemoteCommandExecutionAnalysis;
    }

    /**
     * Get 是否开启内存马检测 
     * @return IsMemoryHijackingAnalysis 是否开启内存马检测
     */
    public Long getIsMemoryHijackingAnalysis() {
        return this.IsMemoryHijackingAnalysis;
    }

    /**
     * Set 是否开启内存马检测
     * @param IsMemoryHijackingAnalysis 是否开启内存马检测
     */
    public void setIsMemoryHijackingAnalysis(Long IsMemoryHijackingAnalysis) {
        this.IsMemoryHijackingAnalysis = IsMemoryHijackingAnalysis;
    }

    /**
     * Get 是否开启删除任意文件检测（0-关闭，1-开启） 
     * @return IsDeleteAnyFileAnalysis 是否开启删除任意文件检测（0-关闭，1-开启）
     */
    public Long getIsDeleteAnyFileAnalysis() {
        return this.IsDeleteAnyFileAnalysis;
    }

    /**
     * Set 是否开启删除任意文件检测（0-关闭，1-开启）
     * @param IsDeleteAnyFileAnalysis 是否开启删除任意文件检测（0-关闭，1-开启）
     */
    public void setIsDeleteAnyFileAnalysis(Long IsDeleteAnyFileAnalysis) {
        this.IsDeleteAnyFileAnalysis = IsDeleteAnyFileAnalysis;
    }

    /**
     * Get 是否开启读取任意文件检测（0-关闭，1-开启） 
     * @return IsReadAnyFileAnalysis 是否开启读取任意文件检测（0-关闭，1-开启）
     */
    public Long getIsReadAnyFileAnalysis() {
        return this.IsReadAnyFileAnalysis;
    }

    /**
     * Set 是否开启读取任意文件检测（0-关闭，1-开启）
     * @param IsReadAnyFileAnalysis 是否开启读取任意文件检测（0-关闭，1-开启）
     */
    public void setIsReadAnyFileAnalysis(Long IsReadAnyFileAnalysis) {
        this.IsReadAnyFileAnalysis = IsReadAnyFileAnalysis;
    }

    /**
     * Get 是否开启上传任意文件检测（0-关闭，1-开启） 
     * @return IsUploadAnyFileAnalysis 是否开启上传任意文件检测（0-关闭，1-开启）
     */
    public Long getIsUploadAnyFileAnalysis() {
        return this.IsUploadAnyFileAnalysis;
    }

    /**
     * Set 是否开启上传任意文件检测（0-关闭，1-开启）
     * @param IsUploadAnyFileAnalysis 是否开启上传任意文件检测（0-关闭，1-开启）
     */
    public void setIsUploadAnyFileAnalysis(Long IsUploadAnyFileAnalysis) {
        this.IsUploadAnyFileAnalysis = IsUploadAnyFileAnalysis;
    }

    /**
     * Get 是否开启包含任意文件检测（0-关闭，1-开启） 
     * @return IsIncludeAnyFileAnalysis 是否开启包含任意文件检测（0-关闭，1-开启）
     */
    public Long getIsIncludeAnyFileAnalysis() {
        return this.IsIncludeAnyFileAnalysis;
    }

    /**
     * Set 是否开启包含任意文件检测（0-关闭，1-开启）
     * @param IsIncludeAnyFileAnalysis 是否开启包含任意文件检测（0-关闭，1-开启）
     */
    public void setIsIncludeAnyFileAnalysis(Long IsIncludeAnyFileAnalysis) {
        this.IsIncludeAnyFileAnalysis = IsIncludeAnyFileAnalysis;
    }

    /**
     * Get 是否开启目录遍历检测（0-关闭，1-开启） 
     * @return IsDirectoryTraversalAnalysis 是否开启目录遍历检测（0-关闭，1-开启）
     */
    public Long getIsDirectoryTraversalAnalysis() {
        return this.IsDirectoryTraversalAnalysis;
    }

    /**
     * Set 是否开启目录遍历检测（0-关闭，1-开启）
     * @param IsDirectoryTraversalAnalysis 是否开启目录遍历检测（0-关闭，1-开启）
     */
    public void setIsDirectoryTraversalAnalysis(Long IsDirectoryTraversalAnalysis) {
        this.IsDirectoryTraversalAnalysis = IsDirectoryTraversalAnalysis;
    }

    /**
     * Get 是否开启模板引擎注入检测（0-关闭，1-开启） 
     * @return IsTemplateEngineInjectionAnalysis 是否开启模板引擎注入检测（0-关闭，1-开启）
     */
    public Long getIsTemplateEngineInjectionAnalysis() {
        return this.IsTemplateEngineInjectionAnalysis;
    }

    /**
     * Set 是否开启模板引擎注入检测（0-关闭，1-开启）
     * @param IsTemplateEngineInjectionAnalysis 是否开启模板引擎注入检测（0-关闭，1-开启）
     */
    public void setIsTemplateEngineInjectionAnalysis(Long IsTemplateEngineInjectionAnalysis) {
        this.IsTemplateEngineInjectionAnalysis = IsTemplateEngineInjectionAnalysis;
    }

    /**
     * Get 是否开启脚本引擎注入检测（0-关闭，1-开启） 
     * @return IsScriptEngineInjectionAnalysis 是否开启脚本引擎注入检测（0-关闭，1-开启）
     */
    public Long getIsScriptEngineInjectionAnalysis() {
        return this.IsScriptEngineInjectionAnalysis;
    }

    /**
     * Set 是否开启脚本引擎注入检测（0-关闭，1-开启）
     * @param IsScriptEngineInjectionAnalysis 是否开启脚本引擎注入检测（0-关闭，1-开启）
     */
    public void setIsScriptEngineInjectionAnalysis(Long IsScriptEngineInjectionAnalysis) {
        this.IsScriptEngineInjectionAnalysis = IsScriptEngineInjectionAnalysis;
    }

    /**
     * Get 是否开启表达式注入检测（0-关闭，1-开启） 
     * @return IsExpressionInjectionAnalysis 是否开启表达式注入检测（0-关闭，1-开启）
     */
    public Long getIsExpressionInjectionAnalysis() {
        return this.IsExpressionInjectionAnalysis;
    }

    /**
     * Set 是否开启表达式注入检测（0-关闭，1-开启）
     * @param IsExpressionInjectionAnalysis 是否开启表达式注入检测（0-关闭，1-开启）
     */
    public void setIsExpressionInjectionAnalysis(Long IsExpressionInjectionAnalysis) {
        this.IsExpressionInjectionAnalysis = IsExpressionInjectionAnalysis;
    }

    /**
     * Get 是否开启JNDI注入检测（0-关闭，1-开启） 
     * @return IsJNDIInjectionAnalysis 是否开启JNDI注入检测（0-关闭，1-开启）
     */
    public Long getIsJNDIInjectionAnalysis() {
        return this.IsJNDIInjectionAnalysis;
    }

    /**
     * Set 是否开启JNDI注入检测（0-关闭，1-开启）
     * @param IsJNDIInjectionAnalysis 是否开启JNDI注入检测（0-关闭，1-开启）
     */
    public void setIsJNDIInjectionAnalysis(Long IsJNDIInjectionAnalysis) {
        this.IsJNDIInjectionAnalysis = IsJNDIInjectionAnalysis;
    }

    /**
     * Get 是否开启JNI注入检测（0-关闭，1-开启） 
     * @return IsJNIInjectionAnalysis 是否开启JNI注入检测（0-关闭，1-开启）
     */
    public Long getIsJNIInjectionAnalysis() {
        return this.IsJNIInjectionAnalysis;
    }

    /**
     * Set 是否开启JNI注入检测（0-关闭，1-开启）
     * @param IsJNIInjectionAnalysis 是否开启JNI注入检测（0-关闭，1-开启）
     */
    public void setIsJNIInjectionAnalysis(Long IsJNIInjectionAnalysis) {
        this.IsJNIInjectionAnalysis = IsJNIInjectionAnalysis;
    }

    /**
     * Get 是否开启Webshell后门检测（0-关闭，1-开启） 
     * @return IsWebshellBackdoorAnalysis 是否开启Webshell后门检测（0-关闭，1-开启）
     */
    public Long getIsWebshellBackdoorAnalysis() {
        return this.IsWebshellBackdoorAnalysis;
    }

    /**
     * Set 是否开启Webshell后门检测（0-关闭，1-开启）
     * @param IsWebshellBackdoorAnalysis 是否开启Webshell后门检测（0-关闭，1-开启）
     */
    public void setIsWebshellBackdoorAnalysis(Long IsWebshellBackdoorAnalysis) {
        this.IsWebshellBackdoorAnalysis = IsWebshellBackdoorAnalysis;
    }

    /**
     * Get 是否开启反序列化检测（0-关闭，1-开启） 
     * @return IsDeserializationAnalysis 是否开启反序列化检测（0-关闭，1-开启）
     */
    public Long getIsDeserializationAnalysis() {
        return this.IsDeserializationAnalysis;
    }

    /**
     * Set 是否开启反序列化检测（0-关闭，1-开启）
     * @param IsDeserializationAnalysis 是否开启反序列化检测（0-关闭，1-开启）
     */
    public void setIsDeserializationAnalysis(Long IsDeserializationAnalysis) {
        this.IsDeserializationAnalysis = IsDeserializationAnalysis;
    }

    /**
     * Get 接口自动收敛开关,0 关 | 1 开 
     * @return UrlAutoConvergenceEnable 接口自动收敛开关,0 关 | 1 开
     */
    public Boolean getUrlAutoConvergenceEnable() {
        return this.UrlAutoConvergenceEnable;
    }

    /**
     * Set 接口自动收敛开关,0 关 | 1 开
     * @param UrlAutoConvergenceEnable 接口自动收敛开关,0 关 | 1 开
     */
    public void setUrlAutoConvergenceEnable(Boolean UrlAutoConvergenceEnable) {
        this.UrlAutoConvergenceEnable = UrlAutoConvergenceEnable;
    }

    /**
     * Get URL长分段收敛阈值 
     * @return UrlLongSegmentThreshold URL长分段收敛阈值
     */
    public Long getUrlLongSegmentThreshold() {
        return this.UrlLongSegmentThreshold;
    }

    /**
     * Set URL长分段收敛阈值
     * @param UrlLongSegmentThreshold URL长分段收敛阈值
     */
    public void setUrlLongSegmentThreshold(Long UrlLongSegmentThreshold) {
        this.UrlLongSegmentThreshold = UrlLongSegmentThreshold;
    }

    /**
     * Get URL数字分段收敛阈值 
     * @return UrlNumberSegmentThreshold URL数字分段收敛阈值
     */
    public Long getUrlNumberSegmentThreshold() {
        return this.UrlNumberSegmentThreshold;
    }

    /**
     * Set URL数字分段收敛阈值
     * @param UrlNumberSegmentThreshold URL数字分段收敛阈值
     */
    public void setUrlNumberSegmentThreshold(Long UrlNumberSegmentThreshold) {
        this.UrlNumberSegmentThreshold = UrlNumberSegmentThreshold;
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

    /**
     * Get 是否开启SQL参数获取 
     * @return DbStatementParametersEnabled 是否开启SQL参数获取
     */
    public Boolean getDbStatementParametersEnabled() {
        return this.DbStatementParametersEnabled;
    }

    /**
     * Set 是否开启SQL参数获取
     * @param DbStatementParametersEnabled 是否开启SQL参数获取
     */
    public void setDbStatementParametersEnabled(Boolean DbStatementParametersEnabled) {
        this.DbStatementParametersEnabled = DbStatementParametersEnabled;
    }

    /**
     * Get 慢SQL阈值 
     * @return SlowSQLThresholds 慢SQL阈值
     */
    public ApmTag [] getSlowSQLThresholds() {
        return this.SlowSQLThresholds;
    }

    /**
     * Set 慢SQL阈值
     * @param SlowSQLThresholds 慢SQL阈值
     */
    public void setSlowSQLThresholds(ApmTag [] SlowSQLThresholds) {
        this.SlowSQLThresholds = SlowSQLThresholds;
    }

    /**
     * Get 是否开启脱敏规则 
     * @return EnableDesensitizationRule 是否开启脱敏规则
     */
    public Long getEnableDesensitizationRule() {
        return this.EnableDesensitizationRule;
    }

    /**
     * Set 是否开启脱敏规则
     * @param EnableDesensitizationRule 是否开启脱敏规则
     */
    public void setEnableDesensitizationRule(Long EnableDesensitizationRule) {
        this.EnableDesensitizationRule = EnableDesensitizationRule;
    }

    /**
     * Get 脱敏规则 
     * @return DesensitizationRule 脱敏规则
     */
    public String getDesensitizationRule() {
        return this.DesensitizationRule;
    }

    /**
     * Set 脱敏规则
     * @param DesensitizationRule 脱敏规则
     */
    public void setDesensitizationRule(String DesensitizationRule) {
        this.DesensitizationRule = DesensitizationRule;
    }

    /**
     * Get spanId的索引key: 当CLS索引类型为键值索引时生效 
     * @return LogSpanIdKey spanId的索引key: 当CLS索引类型为键值索引时生效
     */
    public String getLogSpanIdKey() {
        return this.LogSpanIdKey;
    }

    /**
     * Set spanId的索引key: 当CLS索引类型为键值索引时生效
     * @param LogSpanIdKey spanId的索引key: 当CLS索引类型为键值索引时生效
     */
    public void setLogSpanIdKey(String LogSpanIdKey) {
        this.LogSpanIdKey = LogSpanIdKey;
    }

    /**
     * Get 自动性能剖析任务配置 
     * @return AutoProfilingConfig 自动性能剖析任务配置
     */
    public AutoProfilingConfig getAutoProfilingConfig() {
        return this.AutoProfilingConfig;
    }

    /**
     * Set 自动性能剖析任务配置
     * @param AutoProfilingConfig 自动性能剖析任务配置
     */
    public void setAutoProfilingConfig(AutoProfilingConfig AutoProfilingConfig) {
        this.AutoProfilingConfig = AutoProfilingConfig;
    }

    public ModifyApmApplicationConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyApmApplicationConfigRequest(ModifyApmApplicationConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.UrlConvergenceSwitch != null) {
            this.UrlConvergenceSwitch = new Long(source.UrlConvergenceSwitch);
        }
        if (source.UrlConvergenceThreshold != null) {
            this.UrlConvergenceThreshold = new Long(source.UrlConvergenceThreshold);
        }
        if (source.ExceptionFilter != null) {
            this.ExceptionFilter = new String(source.ExceptionFilter);
        }
        if (source.UrlConvergence != null) {
            this.UrlConvergence = new String(source.UrlConvergence);
        }
        if (source.ErrorCodeFilter != null) {
            this.ErrorCodeFilter = new String(source.ErrorCodeFilter);
        }
        if (source.UrlExclude != null) {
            this.UrlExclude = new String(source.UrlExclude);
        }
        if (source.IsRelatedLog != null) {
            this.IsRelatedLog = new Long(source.IsRelatedLog);
        }
        if (source.LogRegion != null) {
            this.LogRegion = new String(source.LogRegion);
        }
        if (source.LogTopicID != null) {
            this.LogTopicID = new String(source.LogTopicID);
        }
        if (source.LogSet != null) {
            this.LogSet = new String(source.LogSet);
        }
        if (source.LogSource != null) {
            this.LogSource = new String(source.LogSource);
        }
        if (source.IgnoreOperationName != null) {
            this.IgnoreOperationName = new String(source.IgnoreOperationName);
        }
        if (source.EnableSnapshot != null) {
            this.EnableSnapshot = new Boolean(source.EnableSnapshot);
        }
        if (source.SnapshotTimeout != null) {
            this.SnapshotTimeout = new Long(source.SnapshotTimeout);
        }
        if (source.AgentEnable != null) {
            this.AgentEnable = new Boolean(source.AgentEnable);
        }
        if (source.TraceSquash != null) {
            this.TraceSquash = new Boolean(source.TraceSquash);
        }
        if (source.EventEnable != null) {
            this.EventEnable = new Boolean(source.EventEnable);
        }
        if (source.InstrumentList != null) {
            this.InstrumentList = new Instrument[source.InstrumentList.length];
            for (int i = 0; i < source.InstrumentList.length; i++) {
                this.InstrumentList[i] = new Instrument(source.InstrumentList[i]);
            }
        }
        if (source.AgentOperationConfigView != null) {
            this.AgentOperationConfigView = new AgentOperationConfigView(source.AgentOperationConfigView);
        }
        if (source.EnableLogConfig != null) {
            this.EnableLogConfig = new Boolean(source.EnableLogConfig);
        }
        if (source.EnableDashboardConfig != null) {
            this.EnableDashboardConfig = new Boolean(source.EnableDashboardConfig);
        }
        if (source.IsRelatedDashboard != null) {
            this.IsRelatedDashboard = new Long(source.IsRelatedDashboard);
        }
        if (source.DashboardTopicID != null) {
            this.DashboardTopicID = new String(source.DashboardTopicID);
        }
        if (source.LogIndexType != null) {
            this.LogIndexType = new Long(source.LogIndexType);
        }
        if (source.LogTraceIdKey != null) {
            this.LogTraceIdKey = new String(source.LogTraceIdKey);
        }
        if (source.EnableSecurityConfig != null) {
            this.EnableSecurityConfig = new Boolean(source.EnableSecurityConfig);
        }
        if (source.IsSqlInjectionAnalysis != null) {
            this.IsSqlInjectionAnalysis = new Long(source.IsSqlInjectionAnalysis);
        }
        if (source.IsInstrumentationVulnerabilityScan != null) {
            this.IsInstrumentationVulnerabilityScan = new Long(source.IsInstrumentationVulnerabilityScan);
        }
        if (source.IsRemoteCommandExecutionAnalysis != null) {
            this.IsRemoteCommandExecutionAnalysis = new Long(source.IsRemoteCommandExecutionAnalysis);
        }
        if (source.IsMemoryHijackingAnalysis != null) {
            this.IsMemoryHijackingAnalysis = new Long(source.IsMemoryHijackingAnalysis);
        }
        if (source.IsDeleteAnyFileAnalysis != null) {
            this.IsDeleteAnyFileAnalysis = new Long(source.IsDeleteAnyFileAnalysis);
        }
        if (source.IsReadAnyFileAnalysis != null) {
            this.IsReadAnyFileAnalysis = new Long(source.IsReadAnyFileAnalysis);
        }
        if (source.IsUploadAnyFileAnalysis != null) {
            this.IsUploadAnyFileAnalysis = new Long(source.IsUploadAnyFileAnalysis);
        }
        if (source.IsIncludeAnyFileAnalysis != null) {
            this.IsIncludeAnyFileAnalysis = new Long(source.IsIncludeAnyFileAnalysis);
        }
        if (source.IsDirectoryTraversalAnalysis != null) {
            this.IsDirectoryTraversalAnalysis = new Long(source.IsDirectoryTraversalAnalysis);
        }
        if (source.IsTemplateEngineInjectionAnalysis != null) {
            this.IsTemplateEngineInjectionAnalysis = new Long(source.IsTemplateEngineInjectionAnalysis);
        }
        if (source.IsScriptEngineInjectionAnalysis != null) {
            this.IsScriptEngineInjectionAnalysis = new Long(source.IsScriptEngineInjectionAnalysis);
        }
        if (source.IsExpressionInjectionAnalysis != null) {
            this.IsExpressionInjectionAnalysis = new Long(source.IsExpressionInjectionAnalysis);
        }
        if (source.IsJNDIInjectionAnalysis != null) {
            this.IsJNDIInjectionAnalysis = new Long(source.IsJNDIInjectionAnalysis);
        }
        if (source.IsJNIInjectionAnalysis != null) {
            this.IsJNIInjectionAnalysis = new Long(source.IsJNIInjectionAnalysis);
        }
        if (source.IsWebshellBackdoorAnalysis != null) {
            this.IsWebshellBackdoorAnalysis = new Long(source.IsWebshellBackdoorAnalysis);
        }
        if (source.IsDeserializationAnalysis != null) {
            this.IsDeserializationAnalysis = new Long(source.IsDeserializationAnalysis);
        }
        if (source.UrlAutoConvergenceEnable != null) {
            this.UrlAutoConvergenceEnable = new Boolean(source.UrlAutoConvergenceEnable);
        }
        if (source.UrlLongSegmentThreshold != null) {
            this.UrlLongSegmentThreshold = new Long(source.UrlLongSegmentThreshold);
        }
        if (source.UrlNumberSegmentThreshold != null) {
            this.UrlNumberSegmentThreshold = new Long(source.UrlNumberSegmentThreshold);
        }
        if (source.DisableMemoryUsed != null) {
            this.DisableMemoryUsed = new Long(source.DisableMemoryUsed);
        }
        if (source.DisableCpuUsed != null) {
            this.DisableCpuUsed = new Long(source.DisableCpuUsed);
        }
        if (source.DbStatementParametersEnabled != null) {
            this.DbStatementParametersEnabled = new Boolean(source.DbStatementParametersEnabled);
        }
        if (source.SlowSQLThresholds != null) {
            this.SlowSQLThresholds = new ApmTag[source.SlowSQLThresholds.length];
            for (int i = 0; i < source.SlowSQLThresholds.length; i++) {
                this.SlowSQLThresholds[i] = new ApmTag(source.SlowSQLThresholds[i]);
            }
        }
        if (source.EnableDesensitizationRule != null) {
            this.EnableDesensitizationRule = new Long(source.EnableDesensitizationRule);
        }
        if (source.DesensitizationRule != null) {
            this.DesensitizationRule = new String(source.DesensitizationRule);
        }
        if (source.LogSpanIdKey != null) {
            this.LogSpanIdKey = new String(source.LogSpanIdKey);
        }
        if (source.AutoProfilingConfig != null) {
            this.AutoProfilingConfig = new AutoProfilingConfig(source.AutoProfilingConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "UrlConvergenceSwitch", this.UrlConvergenceSwitch);
        this.setParamSimple(map, prefix + "UrlConvergenceThreshold", this.UrlConvergenceThreshold);
        this.setParamSimple(map, prefix + "ExceptionFilter", this.ExceptionFilter);
        this.setParamSimple(map, prefix + "UrlConvergence", this.UrlConvergence);
        this.setParamSimple(map, prefix + "ErrorCodeFilter", this.ErrorCodeFilter);
        this.setParamSimple(map, prefix + "UrlExclude", this.UrlExclude);
        this.setParamSimple(map, prefix + "IsRelatedLog", this.IsRelatedLog);
        this.setParamSimple(map, prefix + "LogRegion", this.LogRegion);
        this.setParamSimple(map, prefix + "LogTopicID", this.LogTopicID);
        this.setParamSimple(map, prefix + "LogSet", this.LogSet);
        this.setParamSimple(map, prefix + "LogSource", this.LogSource);
        this.setParamSimple(map, prefix + "IgnoreOperationName", this.IgnoreOperationName);
        this.setParamSimple(map, prefix + "EnableSnapshot", this.EnableSnapshot);
        this.setParamSimple(map, prefix + "SnapshotTimeout", this.SnapshotTimeout);
        this.setParamSimple(map, prefix + "AgentEnable", this.AgentEnable);
        this.setParamSimple(map, prefix + "TraceSquash", this.TraceSquash);
        this.setParamSimple(map, prefix + "EventEnable", this.EventEnable);
        this.setParamArrayObj(map, prefix + "InstrumentList.", this.InstrumentList);
        this.setParamObj(map, prefix + "AgentOperationConfigView.", this.AgentOperationConfigView);
        this.setParamSimple(map, prefix + "EnableLogConfig", this.EnableLogConfig);
        this.setParamSimple(map, prefix + "EnableDashboardConfig", this.EnableDashboardConfig);
        this.setParamSimple(map, prefix + "IsRelatedDashboard", this.IsRelatedDashboard);
        this.setParamSimple(map, prefix + "DashboardTopicID", this.DashboardTopicID);
        this.setParamSimple(map, prefix + "LogIndexType", this.LogIndexType);
        this.setParamSimple(map, prefix + "LogTraceIdKey", this.LogTraceIdKey);
        this.setParamSimple(map, prefix + "EnableSecurityConfig", this.EnableSecurityConfig);
        this.setParamSimple(map, prefix + "IsSqlInjectionAnalysis", this.IsSqlInjectionAnalysis);
        this.setParamSimple(map, prefix + "IsInstrumentationVulnerabilityScan", this.IsInstrumentationVulnerabilityScan);
        this.setParamSimple(map, prefix + "IsRemoteCommandExecutionAnalysis", this.IsRemoteCommandExecutionAnalysis);
        this.setParamSimple(map, prefix + "IsMemoryHijackingAnalysis", this.IsMemoryHijackingAnalysis);
        this.setParamSimple(map, prefix + "IsDeleteAnyFileAnalysis", this.IsDeleteAnyFileAnalysis);
        this.setParamSimple(map, prefix + "IsReadAnyFileAnalysis", this.IsReadAnyFileAnalysis);
        this.setParamSimple(map, prefix + "IsUploadAnyFileAnalysis", this.IsUploadAnyFileAnalysis);
        this.setParamSimple(map, prefix + "IsIncludeAnyFileAnalysis", this.IsIncludeAnyFileAnalysis);
        this.setParamSimple(map, prefix + "IsDirectoryTraversalAnalysis", this.IsDirectoryTraversalAnalysis);
        this.setParamSimple(map, prefix + "IsTemplateEngineInjectionAnalysis", this.IsTemplateEngineInjectionAnalysis);
        this.setParamSimple(map, prefix + "IsScriptEngineInjectionAnalysis", this.IsScriptEngineInjectionAnalysis);
        this.setParamSimple(map, prefix + "IsExpressionInjectionAnalysis", this.IsExpressionInjectionAnalysis);
        this.setParamSimple(map, prefix + "IsJNDIInjectionAnalysis", this.IsJNDIInjectionAnalysis);
        this.setParamSimple(map, prefix + "IsJNIInjectionAnalysis", this.IsJNIInjectionAnalysis);
        this.setParamSimple(map, prefix + "IsWebshellBackdoorAnalysis", this.IsWebshellBackdoorAnalysis);
        this.setParamSimple(map, prefix + "IsDeserializationAnalysis", this.IsDeserializationAnalysis);
        this.setParamSimple(map, prefix + "UrlAutoConvergenceEnable", this.UrlAutoConvergenceEnable);
        this.setParamSimple(map, prefix + "UrlLongSegmentThreshold", this.UrlLongSegmentThreshold);
        this.setParamSimple(map, prefix + "UrlNumberSegmentThreshold", this.UrlNumberSegmentThreshold);
        this.setParamSimple(map, prefix + "DisableMemoryUsed", this.DisableMemoryUsed);
        this.setParamSimple(map, prefix + "DisableCpuUsed", this.DisableCpuUsed);
        this.setParamSimple(map, prefix + "DbStatementParametersEnabled", this.DbStatementParametersEnabled);
        this.setParamArrayObj(map, prefix + "SlowSQLThresholds.", this.SlowSQLThresholds);
        this.setParamSimple(map, prefix + "EnableDesensitizationRule", this.EnableDesensitizationRule);
        this.setParamSimple(map, prefix + "DesensitizationRule", this.DesensitizationRule);
        this.setParamSimple(map, prefix + "LogSpanIdKey", this.LogSpanIdKey);
        this.setParamObj(map, prefix + "AutoProfilingConfig.", this.AutoProfilingConfig);

    }
}

