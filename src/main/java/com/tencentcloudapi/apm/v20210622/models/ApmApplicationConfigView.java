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
    * <p>业务系统 ID</p>
    */
    @SerializedName("InstanceKey")
    @Expose
    private String InstanceKey;

    /**
    * <p>应用名</p>
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * <p>接口过滤</p>
    */
    @SerializedName("OperationNameFilter")
    @Expose
    private String OperationNameFilter;

    /**
    * <p>错误类型过滤</p>
    */
    @SerializedName("ExceptionFilter")
    @Expose
    private String ExceptionFilter;

    /**
    * <p>HTTP 状态码过滤</p>
    */
    @SerializedName("ErrorCodeFilter")
    @Expose
    private String ErrorCodeFilter;

    /**
    * <p>应用诊断开关（已废弃）</p>
    */
    @SerializedName("EventEnable")
    @Expose
    private Boolean EventEnable;

    /**
    * <p>URL 收敛开关 0 关 1 开</p>
    */
    @SerializedName("UrlConvergenceSwitch")
    @Expose
    private Long UrlConvergenceSwitch;

    /**
    * <p>URL 收敛阈值</p>
    */
    @SerializedName("UrlConvergenceThreshold")
    @Expose
    private Long UrlConvergenceThreshold;

    /**
    * <p>URL 收敛规则正则</p>
    */
    @SerializedName("UrlConvergence")
    @Expose
    private String UrlConvergence;

    /**
    * <p>URL 排除规则正则</p>
    */
    @SerializedName("UrlExclude")
    @Expose
    private String UrlExclude;

    /**
    * <p>是否开启日志 0 关 1 开</p>
    */
    @SerializedName("IsRelatedLog")
    @Expose
    private Long IsRelatedLog;

    /**
    * <p>日志源</p>
    */
    @SerializedName("LogSource")
    @Expose
    private String LogSource;

    /**
    * <p>日志集</p>
    */
    @SerializedName("LogSet")
    @Expose
    private String LogSet;

    /**
    * <p>日志主题</p>
    */
    @SerializedName("LogTopicID")
    @Expose
    private String LogTopicID;

    /**
    * <p>方法栈快照开关 true 开启 false 关闭</p>
    */
    @SerializedName("SnapshotEnable")
    @Expose
    private Boolean SnapshotEnable;

    /**
    * <p>慢调用监听触发阈值</p>
    */
    @SerializedName("SnapshotTimeout")
    @Expose
    private Long SnapshotTimeout;

    /**
    * <p>探针总开关</p>
    */
    @SerializedName("AgentEnable")
    @Expose
    private Boolean AgentEnable;

    /**
    * <p>组件列表开关（已废弃）</p>
    */
    @SerializedName("InstrumentList")
    @Expose
    private Instrument [] InstrumentList;

    /**
    * <p>链路压缩开关（已废弃）</p>
    */
    @SerializedName("TraceSquash")
    @Expose
    private Boolean TraceSquash;

    /**
    * <p>链路过滤配置</p>
    */
    @SerializedName("AgentIgnoreOperation")
    @Expose
    private String AgentIgnoreOperation;

    /**
    * <p>开启应用安全开关</p>
    */
    @SerializedName("EnableSecurityConfig")
    @Expose
    private Boolean EnableSecurityConfig;

    /**
    * <p>是否开启SQL注入检测</p>
    */
    @SerializedName("IsSqlInjectionAnalysis")
    @Expose
    private Long IsSqlInjectionAnalysis;

    /**
    * <p>是否开启组件漏洞检测</p>
    */
    @SerializedName("IsInstrumentationVulnerabilityScan")
    @Expose
    private Long IsInstrumentationVulnerabilityScan;

    /**
    * <p>是否开启远程命令执行检测</p>
    */
    @SerializedName("IsRemoteCommandExecutionAnalysis")
    @Expose
    private Long IsRemoteCommandExecutionAnalysis;

    /**
    * <p>是否开启内存泄漏检测</p>
    */
    @SerializedName("IsMemoryHijackingAnalysis")
    @Expose
    private Long IsMemoryHijackingAnalysis;

    /**
    * <p>是否开启删除任意文件检测</p>
    */
    @SerializedName("IsDeleteAnyFileAnalysis")
    @Expose
    private Long IsDeleteAnyFileAnalysis;

    /**
    * <p>是否开启读取任意文件检测</p>
    */
    @SerializedName("IsReadAnyFileAnalysis")
    @Expose
    private Long IsReadAnyFileAnalysis;

    /**
    * <p>是否开启上传任意文件检测</p>
    */
    @SerializedName("IsUploadAnyFileAnalysis")
    @Expose
    private Long IsUploadAnyFileAnalysis;

    /**
    * <p>是否开启包含任意文件检测</p>
    */
    @SerializedName("IsIncludeAnyFileAnalysis")
    @Expose
    private Long IsIncludeAnyFileAnalysis;

    /**
    * <p>是否开启目录遍历检测</p>
    */
    @SerializedName("IsDirectoryTraversalAnalysis")
    @Expose
    private Long IsDirectoryTraversalAnalysis;

    /**
    * <p>是否开启模板引擎注入检测</p>
    */
    @SerializedName("IsTemplateEngineInjectionAnalysis")
    @Expose
    private Long IsTemplateEngineInjectionAnalysis;

    /**
    * <p>是否开启脚本引擎注入检测</p>
    */
    @SerializedName("IsScriptEngineInjectionAnalysis")
    @Expose
    private Long IsScriptEngineInjectionAnalysis;

    /**
    * <p>是否开启表达式注入检测</p>
    */
    @SerializedName("IsExpressionInjectionAnalysis")
    @Expose
    private Long IsExpressionInjectionAnalysis;

    /**
    * <p>是否开启JNDI注入检测</p>
    */
    @SerializedName("IsJndiInjectionAnalysis")
    @Expose
    private Long IsJndiInjectionAnalysis;

    /**
    * <p>是否开启JNI注入检测</p>
    */
    @SerializedName("IsJniInjectionAnalysis")
    @Expose
    private Long IsJniInjectionAnalysis;

    /**
    * <p>是否开启Webshell后门检测</p>
    */
    @SerializedName("IsWebshellBackdoorAnalysis")
    @Expose
    private Long IsWebshellBackdoorAnalysis;

    /**
    * <p>是否开启反序列化检测</p>
    */
    @SerializedName("IsDeserializationAnalysis")
    @Expose
    private Long IsDeserializationAnalysis;

    /**
    * <p>是否开启控制台开关</p>
    */
    @SerializedName("EnableDashboardConfig")
    @Expose
    private Boolean EnableDashboardConfig;

    /**
    * <p>是否关联Dashboard</p>
    */
    @SerializedName("IsRelatedDashboard")
    @Expose
    private Long IsRelatedDashboard;

    /**
    * <p>Dashboard topic</p>
    */
    @SerializedName("DashboardTopicID")
    @Expose
    private String DashboardTopicID;

    /**
    * <p>探针熔断内存阈值</p>
    */
    @SerializedName("DisableMemoryUsed")
    @Expose
    private Long DisableMemoryUsed;

    /**
    * <p>探针熔断CPU阈值</p>
    */
    @SerializedName("DisableCpuUsed")
    @Expose
    private Long DisableCpuUsed;

    /**
    * <p>是否开启SQL参数获取</p>
    */
    @SerializedName("DbStatementParametersEnabled")
    @Expose
    private Boolean DbStatementParametersEnabled;

    /**
    * <p>慢SQL阈值</p>
    */
    @SerializedName("SlowSQLThresholds")
    @Expose
    private ApmTag [] SlowSQLThresholds;

    /**
    * <p>是否开启脱敏规则</p>
    */
    @SerializedName("EnableDesensitizationRule")
    @Expose
    private Long EnableDesensitizationRule;

    /**
    * <p>脱敏规则</p>
    */
    @SerializedName("DesensitizationRule")
    @Expose
    private String DesensitizationRule;

    /**
    * <p>自动性能剖析任务配置</p>
    */
    @SerializedName("AutoProfilingConfig")
    @Expose
    private AutoProfilingConfig AutoProfilingConfig;

    /**
    * <p>阈值配置开关</p>
    */
    @SerializedName("EnableThresholdConfig")
    @Expose
    private Boolean EnableThresholdConfig;

    /**
    * <p>错误率阈值</p><p>单位：%</p>
    */
    @SerializedName("ErrRateThreshold")
    @Expose
    private Long ErrRateThreshold;

    /**
    * <p>响应时间预警阈值</p><p>单位：ms</p>
    */
    @SerializedName("ResponseDurationWarningThreshold")
    @Expose
    private Long ResponseDurationWarningThreshold;

    /**
    * <p>是否使用探针默认熔断阈值</p>
    */
    @SerializedName("UseDefaultFuseConfig")
    @Expose
    private Boolean UseDefaultFuseConfig;

    /**
     * Get <p>业务系统 ID</p> 
     * @return InstanceKey <p>业务系统 ID</p>
     */
    public String getInstanceKey() {
        return this.InstanceKey;
    }

    /**
     * Set <p>业务系统 ID</p>
     * @param InstanceKey <p>业务系统 ID</p>
     */
    public void setInstanceKey(String InstanceKey) {
        this.InstanceKey = InstanceKey;
    }

    /**
     * Get <p>应用名</p> 
     * @return ServiceName <p>应用名</p>
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set <p>应用名</p>
     * @param ServiceName <p>应用名</p>
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get <p>接口过滤</p> 
     * @return OperationNameFilter <p>接口过滤</p>
     */
    public String getOperationNameFilter() {
        return this.OperationNameFilter;
    }

    /**
     * Set <p>接口过滤</p>
     * @param OperationNameFilter <p>接口过滤</p>
     */
    public void setOperationNameFilter(String OperationNameFilter) {
        this.OperationNameFilter = OperationNameFilter;
    }

    /**
     * Get <p>错误类型过滤</p> 
     * @return ExceptionFilter <p>错误类型过滤</p>
     */
    public String getExceptionFilter() {
        return this.ExceptionFilter;
    }

    /**
     * Set <p>错误类型过滤</p>
     * @param ExceptionFilter <p>错误类型过滤</p>
     */
    public void setExceptionFilter(String ExceptionFilter) {
        this.ExceptionFilter = ExceptionFilter;
    }

    /**
     * Get <p>HTTP 状态码过滤</p> 
     * @return ErrorCodeFilter <p>HTTP 状态码过滤</p>
     */
    public String getErrorCodeFilter() {
        return this.ErrorCodeFilter;
    }

    /**
     * Set <p>HTTP 状态码过滤</p>
     * @param ErrorCodeFilter <p>HTTP 状态码过滤</p>
     */
    public void setErrorCodeFilter(String ErrorCodeFilter) {
        this.ErrorCodeFilter = ErrorCodeFilter;
    }

    /**
     * Get <p>应用诊断开关（已废弃）</p> 
     * @return EventEnable <p>应用诊断开关（已废弃）</p>
     */
    public Boolean getEventEnable() {
        return this.EventEnable;
    }

    /**
     * Set <p>应用诊断开关（已废弃）</p>
     * @param EventEnable <p>应用诊断开关（已废弃）</p>
     */
    public void setEventEnable(Boolean EventEnable) {
        this.EventEnable = EventEnable;
    }

    /**
     * Get <p>URL 收敛开关 0 关 1 开</p> 
     * @return UrlConvergenceSwitch <p>URL 收敛开关 0 关 1 开</p>
     */
    public Long getUrlConvergenceSwitch() {
        return this.UrlConvergenceSwitch;
    }

    /**
     * Set <p>URL 收敛开关 0 关 1 开</p>
     * @param UrlConvergenceSwitch <p>URL 收敛开关 0 关 1 开</p>
     */
    public void setUrlConvergenceSwitch(Long UrlConvergenceSwitch) {
        this.UrlConvergenceSwitch = UrlConvergenceSwitch;
    }

    /**
     * Get <p>URL 收敛阈值</p> 
     * @return UrlConvergenceThreshold <p>URL 收敛阈值</p>
     */
    public Long getUrlConvergenceThreshold() {
        return this.UrlConvergenceThreshold;
    }

    /**
     * Set <p>URL 收敛阈值</p>
     * @param UrlConvergenceThreshold <p>URL 收敛阈值</p>
     */
    public void setUrlConvergenceThreshold(Long UrlConvergenceThreshold) {
        this.UrlConvergenceThreshold = UrlConvergenceThreshold;
    }

    /**
     * Get <p>URL 收敛规则正则</p> 
     * @return UrlConvergence <p>URL 收敛规则正则</p>
     */
    public String getUrlConvergence() {
        return this.UrlConvergence;
    }

    /**
     * Set <p>URL 收敛规则正则</p>
     * @param UrlConvergence <p>URL 收敛规则正则</p>
     */
    public void setUrlConvergence(String UrlConvergence) {
        this.UrlConvergence = UrlConvergence;
    }

    /**
     * Get <p>URL 排除规则正则</p> 
     * @return UrlExclude <p>URL 排除规则正则</p>
     */
    public String getUrlExclude() {
        return this.UrlExclude;
    }

    /**
     * Set <p>URL 排除规则正则</p>
     * @param UrlExclude <p>URL 排除规则正则</p>
     */
    public void setUrlExclude(String UrlExclude) {
        this.UrlExclude = UrlExclude;
    }

    /**
     * Get <p>是否开启日志 0 关 1 开</p> 
     * @return IsRelatedLog <p>是否开启日志 0 关 1 开</p>
     */
    public Long getIsRelatedLog() {
        return this.IsRelatedLog;
    }

    /**
     * Set <p>是否开启日志 0 关 1 开</p>
     * @param IsRelatedLog <p>是否开启日志 0 关 1 开</p>
     */
    public void setIsRelatedLog(Long IsRelatedLog) {
        this.IsRelatedLog = IsRelatedLog;
    }

    /**
     * Get <p>日志源</p> 
     * @return LogSource <p>日志源</p>
     */
    public String getLogSource() {
        return this.LogSource;
    }

    /**
     * Set <p>日志源</p>
     * @param LogSource <p>日志源</p>
     */
    public void setLogSource(String LogSource) {
        this.LogSource = LogSource;
    }

    /**
     * Get <p>日志集</p> 
     * @return LogSet <p>日志集</p>
     */
    public String getLogSet() {
        return this.LogSet;
    }

    /**
     * Set <p>日志集</p>
     * @param LogSet <p>日志集</p>
     */
    public void setLogSet(String LogSet) {
        this.LogSet = LogSet;
    }

    /**
     * Get <p>日志主题</p> 
     * @return LogTopicID <p>日志主题</p>
     */
    public String getLogTopicID() {
        return this.LogTopicID;
    }

    /**
     * Set <p>日志主题</p>
     * @param LogTopicID <p>日志主题</p>
     */
    public void setLogTopicID(String LogTopicID) {
        this.LogTopicID = LogTopicID;
    }

    /**
     * Get <p>方法栈快照开关 true 开启 false 关闭</p> 
     * @return SnapshotEnable <p>方法栈快照开关 true 开启 false 关闭</p>
     */
    public Boolean getSnapshotEnable() {
        return this.SnapshotEnable;
    }

    /**
     * Set <p>方法栈快照开关 true 开启 false 关闭</p>
     * @param SnapshotEnable <p>方法栈快照开关 true 开启 false 关闭</p>
     */
    public void setSnapshotEnable(Boolean SnapshotEnable) {
        this.SnapshotEnable = SnapshotEnable;
    }

    /**
     * Get <p>慢调用监听触发阈值</p> 
     * @return SnapshotTimeout <p>慢调用监听触发阈值</p>
     */
    public Long getSnapshotTimeout() {
        return this.SnapshotTimeout;
    }

    /**
     * Set <p>慢调用监听触发阈值</p>
     * @param SnapshotTimeout <p>慢调用监听触发阈值</p>
     */
    public void setSnapshotTimeout(Long SnapshotTimeout) {
        this.SnapshotTimeout = SnapshotTimeout;
    }

    /**
     * Get <p>探针总开关</p> 
     * @return AgentEnable <p>探针总开关</p>
     */
    public Boolean getAgentEnable() {
        return this.AgentEnable;
    }

    /**
     * Set <p>探针总开关</p>
     * @param AgentEnable <p>探针总开关</p>
     */
    public void setAgentEnable(Boolean AgentEnable) {
        this.AgentEnable = AgentEnable;
    }

    /**
     * Get <p>组件列表开关（已废弃）</p> 
     * @return InstrumentList <p>组件列表开关（已废弃）</p>
     */
    public Instrument [] getInstrumentList() {
        return this.InstrumentList;
    }

    /**
     * Set <p>组件列表开关（已废弃）</p>
     * @param InstrumentList <p>组件列表开关（已废弃）</p>
     */
    public void setInstrumentList(Instrument [] InstrumentList) {
        this.InstrumentList = InstrumentList;
    }

    /**
     * Get <p>链路压缩开关（已废弃）</p> 
     * @return TraceSquash <p>链路压缩开关（已废弃）</p>
     */
    public Boolean getTraceSquash() {
        return this.TraceSquash;
    }

    /**
     * Set <p>链路压缩开关（已废弃）</p>
     * @param TraceSquash <p>链路压缩开关（已废弃）</p>
     */
    public void setTraceSquash(Boolean TraceSquash) {
        this.TraceSquash = TraceSquash;
    }

    /**
     * Get <p>链路过滤配置</p> 
     * @return AgentIgnoreOperation <p>链路过滤配置</p>
     */
    public String getAgentIgnoreOperation() {
        return this.AgentIgnoreOperation;
    }

    /**
     * Set <p>链路过滤配置</p>
     * @param AgentIgnoreOperation <p>链路过滤配置</p>
     */
    public void setAgentIgnoreOperation(String AgentIgnoreOperation) {
        this.AgentIgnoreOperation = AgentIgnoreOperation;
    }

    /**
     * Get <p>开启应用安全开关</p> 
     * @return EnableSecurityConfig <p>开启应用安全开关</p>
     */
    public Boolean getEnableSecurityConfig() {
        return this.EnableSecurityConfig;
    }

    /**
     * Set <p>开启应用安全开关</p>
     * @param EnableSecurityConfig <p>开启应用安全开关</p>
     */
    public void setEnableSecurityConfig(Boolean EnableSecurityConfig) {
        this.EnableSecurityConfig = EnableSecurityConfig;
    }

    /**
     * Get <p>是否开启SQL注入检测</p> 
     * @return IsSqlInjectionAnalysis <p>是否开启SQL注入检测</p>
     */
    public Long getIsSqlInjectionAnalysis() {
        return this.IsSqlInjectionAnalysis;
    }

    /**
     * Set <p>是否开启SQL注入检测</p>
     * @param IsSqlInjectionAnalysis <p>是否开启SQL注入检测</p>
     */
    public void setIsSqlInjectionAnalysis(Long IsSqlInjectionAnalysis) {
        this.IsSqlInjectionAnalysis = IsSqlInjectionAnalysis;
    }

    /**
     * Get <p>是否开启组件漏洞检测</p> 
     * @return IsInstrumentationVulnerabilityScan <p>是否开启组件漏洞检测</p>
     */
    public Long getIsInstrumentationVulnerabilityScan() {
        return this.IsInstrumentationVulnerabilityScan;
    }

    /**
     * Set <p>是否开启组件漏洞检测</p>
     * @param IsInstrumentationVulnerabilityScan <p>是否开启组件漏洞检测</p>
     */
    public void setIsInstrumentationVulnerabilityScan(Long IsInstrumentationVulnerabilityScan) {
        this.IsInstrumentationVulnerabilityScan = IsInstrumentationVulnerabilityScan;
    }

    /**
     * Get <p>是否开启远程命令执行检测</p> 
     * @return IsRemoteCommandExecutionAnalysis <p>是否开启远程命令执行检测</p>
     */
    public Long getIsRemoteCommandExecutionAnalysis() {
        return this.IsRemoteCommandExecutionAnalysis;
    }

    /**
     * Set <p>是否开启远程命令执行检测</p>
     * @param IsRemoteCommandExecutionAnalysis <p>是否开启远程命令执行检测</p>
     */
    public void setIsRemoteCommandExecutionAnalysis(Long IsRemoteCommandExecutionAnalysis) {
        this.IsRemoteCommandExecutionAnalysis = IsRemoteCommandExecutionAnalysis;
    }

    /**
     * Get <p>是否开启内存泄漏检测</p> 
     * @return IsMemoryHijackingAnalysis <p>是否开启内存泄漏检测</p>
     */
    public Long getIsMemoryHijackingAnalysis() {
        return this.IsMemoryHijackingAnalysis;
    }

    /**
     * Set <p>是否开启内存泄漏检测</p>
     * @param IsMemoryHijackingAnalysis <p>是否开启内存泄漏检测</p>
     */
    public void setIsMemoryHijackingAnalysis(Long IsMemoryHijackingAnalysis) {
        this.IsMemoryHijackingAnalysis = IsMemoryHijackingAnalysis;
    }

    /**
     * Get <p>是否开启删除任意文件检测</p> 
     * @return IsDeleteAnyFileAnalysis <p>是否开启删除任意文件检测</p>
     */
    public Long getIsDeleteAnyFileAnalysis() {
        return this.IsDeleteAnyFileAnalysis;
    }

    /**
     * Set <p>是否开启删除任意文件检测</p>
     * @param IsDeleteAnyFileAnalysis <p>是否开启删除任意文件检测</p>
     */
    public void setIsDeleteAnyFileAnalysis(Long IsDeleteAnyFileAnalysis) {
        this.IsDeleteAnyFileAnalysis = IsDeleteAnyFileAnalysis;
    }

    /**
     * Get <p>是否开启读取任意文件检测</p> 
     * @return IsReadAnyFileAnalysis <p>是否开启读取任意文件检测</p>
     */
    public Long getIsReadAnyFileAnalysis() {
        return this.IsReadAnyFileAnalysis;
    }

    /**
     * Set <p>是否开启读取任意文件检测</p>
     * @param IsReadAnyFileAnalysis <p>是否开启读取任意文件检测</p>
     */
    public void setIsReadAnyFileAnalysis(Long IsReadAnyFileAnalysis) {
        this.IsReadAnyFileAnalysis = IsReadAnyFileAnalysis;
    }

    /**
     * Get <p>是否开启上传任意文件检测</p> 
     * @return IsUploadAnyFileAnalysis <p>是否开启上传任意文件检测</p>
     */
    public Long getIsUploadAnyFileAnalysis() {
        return this.IsUploadAnyFileAnalysis;
    }

    /**
     * Set <p>是否开启上传任意文件检测</p>
     * @param IsUploadAnyFileAnalysis <p>是否开启上传任意文件检测</p>
     */
    public void setIsUploadAnyFileAnalysis(Long IsUploadAnyFileAnalysis) {
        this.IsUploadAnyFileAnalysis = IsUploadAnyFileAnalysis;
    }

    /**
     * Get <p>是否开启包含任意文件检测</p> 
     * @return IsIncludeAnyFileAnalysis <p>是否开启包含任意文件检测</p>
     */
    public Long getIsIncludeAnyFileAnalysis() {
        return this.IsIncludeAnyFileAnalysis;
    }

    /**
     * Set <p>是否开启包含任意文件检测</p>
     * @param IsIncludeAnyFileAnalysis <p>是否开启包含任意文件检测</p>
     */
    public void setIsIncludeAnyFileAnalysis(Long IsIncludeAnyFileAnalysis) {
        this.IsIncludeAnyFileAnalysis = IsIncludeAnyFileAnalysis;
    }

    /**
     * Get <p>是否开启目录遍历检测</p> 
     * @return IsDirectoryTraversalAnalysis <p>是否开启目录遍历检测</p>
     */
    public Long getIsDirectoryTraversalAnalysis() {
        return this.IsDirectoryTraversalAnalysis;
    }

    /**
     * Set <p>是否开启目录遍历检测</p>
     * @param IsDirectoryTraversalAnalysis <p>是否开启目录遍历检测</p>
     */
    public void setIsDirectoryTraversalAnalysis(Long IsDirectoryTraversalAnalysis) {
        this.IsDirectoryTraversalAnalysis = IsDirectoryTraversalAnalysis;
    }

    /**
     * Get <p>是否开启模板引擎注入检测</p> 
     * @return IsTemplateEngineInjectionAnalysis <p>是否开启模板引擎注入检测</p>
     */
    public Long getIsTemplateEngineInjectionAnalysis() {
        return this.IsTemplateEngineInjectionAnalysis;
    }

    /**
     * Set <p>是否开启模板引擎注入检测</p>
     * @param IsTemplateEngineInjectionAnalysis <p>是否开启模板引擎注入检测</p>
     */
    public void setIsTemplateEngineInjectionAnalysis(Long IsTemplateEngineInjectionAnalysis) {
        this.IsTemplateEngineInjectionAnalysis = IsTemplateEngineInjectionAnalysis;
    }

    /**
     * Get <p>是否开启脚本引擎注入检测</p> 
     * @return IsScriptEngineInjectionAnalysis <p>是否开启脚本引擎注入检测</p>
     */
    public Long getIsScriptEngineInjectionAnalysis() {
        return this.IsScriptEngineInjectionAnalysis;
    }

    /**
     * Set <p>是否开启脚本引擎注入检测</p>
     * @param IsScriptEngineInjectionAnalysis <p>是否开启脚本引擎注入检测</p>
     */
    public void setIsScriptEngineInjectionAnalysis(Long IsScriptEngineInjectionAnalysis) {
        this.IsScriptEngineInjectionAnalysis = IsScriptEngineInjectionAnalysis;
    }

    /**
     * Get <p>是否开启表达式注入检测</p> 
     * @return IsExpressionInjectionAnalysis <p>是否开启表达式注入检测</p>
     */
    public Long getIsExpressionInjectionAnalysis() {
        return this.IsExpressionInjectionAnalysis;
    }

    /**
     * Set <p>是否开启表达式注入检测</p>
     * @param IsExpressionInjectionAnalysis <p>是否开启表达式注入检测</p>
     */
    public void setIsExpressionInjectionAnalysis(Long IsExpressionInjectionAnalysis) {
        this.IsExpressionInjectionAnalysis = IsExpressionInjectionAnalysis;
    }

    /**
     * Get <p>是否开启JNDI注入检测</p> 
     * @return IsJndiInjectionAnalysis <p>是否开启JNDI注入检测</p>
     */
    public Long getIsJndiInjectionAnalysis() {
        return this.IsJndiInjectionAnalysis;
    }

    /**
     * Set <p>是否开启JNDI注入检测</p>
     * @param IsJndiInjectionAnalysis <p>是否开启JNDI注入检测</p>
     */
    public void setIsJndiInjectionAnalysis(Long IsJndiInjectionAnalysis) {
        this.IsJndiInjectionAnalysis = IsJndiInjectionAnalysis;
    }

    /**
     * Get <p>是否开启JNI注入检测</p> 
     * @return IsJniInjectionAnalysis <p>是否开启JNI注入检测</p>
     */
    public Long getIsJniInjectionAnalysis() {
        return this.IsJniInjectionAnalysis;
    }

    /**
     * Set <p>是否开启JNI注入检测</p>
     * @param IsJniInjectionAnalysis <p>是否开启JNI注入检测</p>
     */
    public void setIsJniInjectionAnalysis(Long IsJniInjectionAnalysis) {
        this.IsJniInjectionAnalysis = IsJniInjectionAnalysis;
    }

    /**
     * Get <p>是否开启Webshell后门检测</p> 
     * @return IsWebshellBackdoorAnalysis <p>是否开启Webshell后门检测</p>
     */
    public Long getIsWebshellBackdoorAnalysis() {
        return this.IsWebshellBackdoorAnalysis;
    }

    /**
     * Set <p>是否开启Webshell后门检测</p>
     * @param IsWebshellBackdoorAnalysis <p>是否开启Webshell后门检测</p>
     */
    public void setIsWebshellBackdoorAnalysis(Long IsWebshellBackdoorAnalysis) {
        this.IsWebshellBackdoorAnalysis = IsWebshellBackdoorAnalysis;
    }

    /**
     * Get <p>是否开启反序列化检测</p> 
     * @return IsDeserializationAnalysis <p>是否开启反序列化检测</p>
     */
    public Long getIsDeserializationAnalysis() {
        return this.IsDeserializationAnalysis;
    }

    /**
     * Set <p>是否开启反序列化检测</p>
     * @param IsDeserializationAnalysis <p>是否开启反序列化检测</p>
     */
    public void setIsDeserializationAnalysis(Long IsDeserializationAnalysis) {
        this.IsDeserializationAnalysis = IsDeserializationAnalysis;
    }

    /**
     * Get <p>是否开启控制台开关</p> 
     * @return EnableDashboardConfig <p>是否开启控制台开关</p>
     */
    public Boolean getEnableDashboardConfig() {
        return this.EnableDashboardConfig;
    }

    /**
     * Set <p>是否开启控制台开关</p>
     * @param EnableDashboardConfig <p>是否开启控制台开关</p>
     */
    public void setEnableDashboardConfig(Boolean EnableDashboardConfig) {
        this.EnableDashboardConfig = EnableDashboardConfig;
    }

    /**
     * Get <p>是否关联Dashboard</p> 
     * @return IsRelatedDashboard <p>是否关联Dashboard</p>
     */
    public Long getIsRelatedDashboard() {
        return this.IsRelatedDashboard;
    }

    /**
     * Set <p>是否关联Dashboard</p>
     * @param IsRelatedDashboard <p>是否关联Dashboard</p>
     */
    public void setIsRelatedDashboard(Long IsRelatedDashboard) {
        this.IsRelatedDashboard = IsRelatedDashboard;
    }

    /**
     * Get <p>Dashboard topic</p> 
     * @return DashboardTopicID <p>Dashboard topic</p>
     */
    public String getDashboardTopicID() {
        return this.DashboardTopicID;
    }

    /**
     * Set <p>Dashboard topic</p>
     * @param DashboardTopicID <p>Dashboard topic</p>
     */
    public void setDashboardTopicID(String DashboardTopicID) {
        this.DashboardTopicID = DashboardTopicID;
    }

    /**
     * Get <p>探针熔断内存阈值</p> 
     * @return DisableMemoryUsed <p>探针熔断内存阈值</p>
     */
    public Long getDisableMemoryUsed() {
        return this.DisableMemoryUsed;
    }

    /**
     * Set <p>探针熔断内存阈值</p>
     * @param DisableMemoryUsed <p>探针熔断内存阈值</p>
     */
    public void setDisableMemoryUsed(Long DisableMemoryUsed) {
        this.DisableMemoryUsed = DisableMemoryUsed;
    }

    /**
     * Get <p>探针熔断CPU阈值</p> 
     * @return DisableCpuUsed <p>探针熔断CPU阈值</p>
     */
    public Long getDisableCpuUsed() {
        return this.DisableCpuUsed;
    }

    /**
     * Set <p>探针熔断CPU阈值</p>
     * @param DisableCpuUsed <p>探针熔断CPU阈值</p>
     */
    public void setDisableCpuUsed(Long DisableCpuUsed) {
        this.DisableCpuUsed = DisableCpuUsed;
    }

    /**
     * Get <p>是否开启SQL参数获取</p> 
     * @return DbStatementParametersEnabled <p>是否开启SQL参数获取</p>
     */
    public Boolean getDbStatementParametersEnabled() {
        return this.DbStatementParametersEnabled;
    }

    /**
     * Set <p>是否开启SQL参数获取</p>
     * @param DbStatementParametersEnabled <p>是否开启SQL参数获取</p>
     */
    public void setDbStatementParametersEnabled(Boolean DbStatementParametersEnabled) {
        this.DbStatementParametersEnabled = DbStatementParametersEnabled;
    }

    /**
     * Get <p>慢SQL阈值</p> 
     * @return SlowSQLThresholds <p>慢SQL阈值</p>
     */
    public ApmTag [] getSlowSQLThresholds() {
        return this.SlowSQLThresholds;
    }

    /**
     * Set <p>慢SQL阈值</p>
     * @param SlowSQLThresholds <p>慢SQL阈值</p>
     */
    public void setSlowSQLThresholds(ApmTag [] SlowSQLThresholds) {
        this.SlowSQLThresholds = SlowSQLThresholds;
    }

    /**
     * Get <p>是否开启脱敏规则</p> 
     * @return EnableDesensitizationRule <p>是否开启脱敏规则</p>
     */
    public Long getEnableDesensitizationRule() {
        return this.EnableDesensitizationRule;
    }

    /**
     * Set <p>是否开启脱敏规则</p>
     * @param EnableDesensitizationRule <p>是否开启脱敏规则</p>
     */
    public void setEnableDesensitizationRule(Long EnableDesensitizationRule) {
        this.EnableDesensitizationRule = EnableDesensitizationRule;
    }

    /**
     * Get <p>脱敏规则</p> 
     * @return DesensitizationRule <p>脱敏规则</p>
     */
    public String getDesensitizationRule() {
        return this.DesensitizationRule;
    }

    /**
     * Set <p>脱敏规则</p>
     * @param DesensitizationRule <p>脱敏规则</p>
     */
    public void setDesensitizationRule(String DesensitizationRule) {
        this.DesensitizationRule = DesensitizationRule;
    }

    /**
     * Get <p>自动性能剖析任务配置</p> 
     * @return AutoProfilingConfig <p>自动性能剖析任务配置</p>
     */
    public AutoProfilingConfig getAutoProfilingConfig() {
        return this.AutoProfilingConfig;
    }

    /**
     * Set <p>自动性能剖析任务配置</p>
     * @param AutoProfilingConfig <p>自动性能剖析任务配置</p>
     */
    public void setAutoProfilingConfig(AutoProfilingConfig AutoProfilingConfig) {
        this.AutoProfilingConfig = AutoProfilingConfig;
    }

    /**
     * Get <p>阈值配置开关</p> 
     * @return EnableThresholdConfig <p>阈值配置开关</p>
     */
    public Boolean getEnableThresholdConfig() {
        return this.EnableThresholdConfig;
    }

    /**
     * Set <p>阈值配置开关</p>
     * @param EnableThresholdConfig <p>阈值配置开关</p>
     */
    public void setEnableThresholdConfig(Boolean EnableThresholdConfig) {
        this.EnableThresholdConfig = EnableThresholdConfig;
    }

    /**
     * Get <p>错误率阈值</p><p>单位：%</p> 
     * @return ErrRateThreshold <p>错误率阈值</p><p>单位：%</p>
     */
    public Long getErrRateThreshold() {
        return this.ErrRateThreshold;
    }

    /**
     * Set <p>错误率阈值</p><p>单位：%</p>
     * @param ErrRateThreshold <p>错误率阈值</p><p>单位：%</p>
     */
    public void setErrRateThreshold(Long ErrRateThreshold) {
        this.ErrRateThreshold = ErrRateThreshold;
    }

    /**
     * Get <p>响应时间预警阈值</p><p>单位：ms</p> 
     * @return ResponseDurationWarningThreshold <p>响应时间预警阈值</p><p>单位：ms</p>
     */
    public Long getResponseDurationWarningThreshold() {
        return this.ResponseDurationWarningThreshold;
    }

    /**
     * Set <p>响应时间预警阈值</p><p>单位：ms</p>
     * @param ResponseDurationWarningThreshold <p>响应时间预警阈值</p><p>单位：ms</p>
     */
    public void setResponseDurationWarningThreshold(Long ResponseDurationWarningThreshold) {
        this.ResponseDurationWarningThreshold = ResponseDurationWarningThreshold;
    }

    /**
     * Get <p>是否使用探针默认熔断阈值</p> 
     * @return UseDefaultFuseConfig <p>是否使用探针默认熔断阈值</p>
     */
    public Boolean getUseDefaultFuseConfig() {
        return this.UseDefaultFuseConfig;
    }

    /**
     * Set <p>是否使用探针默认熔断阈值</p>
     * @param UseDefaultFuseConfig <p>是否使用探针默认熔断阈值</p>
     */
    public void setUseDefaultFuseConfig(Boolean UseDefaultFuseConfig) {
        this.UseDefaultFuseConfig = UseDefaultFuseConfig;
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
        if (source.AgentIgnoreOperation != null) {
            this.AgentIgnoreOperation = new String(source.AgentIgnoreOperation);
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
        if (source.IsJndiInjectionAnalysis != null) {
            this.IsJndiInjectionAnalysis = new Long(source.IsJndiInjectionAnalysis);
        }
        if (source.IsJniInjectionAnalysis != null) {
            this.IsJniInjectionAnalysis = new Long(source.IsJniInjectionAnalysis);
        }
        if (source.IsWebshellBackdoorAnalysis != null) {
            this.IsWebshellBackdoorAnalysis = new Long(source.IsWebshellBackdoorAnalysis);
        }
        if (source.IsDeserializationAnalysis != null) {
            this.IsDeserializationAnalysis = new Long(source.IsDeserializationAnalysis);
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
        if (source.AutoProfilingConfig != null) {
            this.AutoProfilingConfig = new AutoProfilingConfig(source.AutoProfilingConfig);
        }
        if (source.EnableThresholdConfig != null) {
            this.EnableThresholdConfig = new Boolean(source.EnableThresholdConfig);
        }
        if (source.ErrRateThreshold != null) {
            this.ErrRateThreshold = new Long(source.ErrRateThreshold);
        }
        if (source.ResponseDurationWarningThreshold != null) {
            this.ResponseDurationWarningThreshold = new Long(source.ResponseDurationWarningThreshold);
        }
        if (source.UseDefaultFuseConfig != null) {
            this.UseDefaultFuseConfig = new Boolean(source.UseDefaultFuseConfig);
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
        this.setParamSimple(map, prefix + "AgentIgnoreOperation", this.AgentIgnoreOperation);
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
        this.setParamSimple(map, prefix + "IsJndiInjectionAnalysis", this.IsJndiInjectionAnalysis);
        this.setParamSimple(map, prefix + "IsJniInjectionAnalysis", this.IsJniInjectionAnalysis);
        this.setParamSimple(map, prefix + "IsWebshellBackdoorAnalysis", this.IsWebshellBackdoorAnalysis);
        this.setParamSimple(map, prefix + "IsDeserializationAnalysis", this.IsDeserializationAnalysis);
        this.setParamSimple(map, prefix + "EnableDashboardConfig", this.EnableDashboardConfig);
        this.setParamSimple(map, prefix + "IsRelatedDashboard", this.IsRelatedDashboard);
        this.setParamSimple(map, prefix + "DashboardTopicID", this.DashboardTopicID);
        this.setParamSimple(map, prefix + "DisableMemoryUsed", this.DisableMemoryUsed);
        this.setParamSimple(map, prefix + "DisableCpuUsed", this.DisableCpuUsed);
        this.setParamSimple(map, prefix + "DbStatementParametersEnabled", this.DbStatementParametersEnabled);
        this.setParamArrayObj(map, prefix + "SlowSQLThresholds.", this.SlowSQLThresholds);
        this.setParamSimple(map, prefix + "EnableDesensitizationRule", this.EnableDesensitizationRule);
        this.setParamSimple(map, prefix + "DesensitizationRule", this.DesensitizationRule);
        this.setParamObj(map, prefix + "AutoProfilingConfig.", this.AutoProfilingConfig);
        this.setParamSimple(map, prefix + "EnableThresholdConfig", this.EnableThresholdConfig);
        this.setParamSimple(map, prefix + "ErrRateThreshold", this.ErrRateThreshold);
        this.setParamSimple(map, prefix + "ResponseDurationWarningThreshold", this.ResponseDurationWarningThreshold);
        this.setParamSimple(map, prefix + "UseDefaultFuseConfig", this.UseDefaultFuseConfig);

    }
}

