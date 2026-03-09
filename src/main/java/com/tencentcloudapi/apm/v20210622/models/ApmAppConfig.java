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

public class ApmAppConfig extends AbstractModel {

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceKey")
    @Expose
    private String InstanceKey;

    /**
    * <p>服务名</p>
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * <p>URL收敛开关</p>
    */
    @SerializedName("UrlConvergenceSwitch")
    @Expose
    private Long UrlConvergenceSwitch;

    /**
    * <p>URL收敛阈值</p>
    */
    @SerializedName("UrlConvergenceThreshold")
    @Expose
    private Long UrlConvergenceThreshold;

    /**
    * <p>URL收敛正则</p>
    */
    @SerializedName("UrlConvergence")
    @Expose
    private String UrlConvergence;

    /**
    * <p>异常过滤正则</p>
    */
    @SerializedName("ExceptionFilter")
    @Expose
    private String ExceptionFilter;

    /**
    * <p>错误码过滤</p>
    */
    @SerializedName("ErrorCodeFilter")
    @Expose
    private String ErrorCodeFilter;

    /**
    * <p>服务组件类型</p>
    */
    @SerializedName("Components")
    @Expose
    private String Components;

    /**
    * <p>URL排除正则</p>
    */
    @SerializedName("UrlExclude")
    @Expose
    private String UrlExclude;

    /**
    * <p>日志来源</p>
    */
    @SerializedName("LogSource")
    @Expose
    private String LogSource;

    /**
    * <p>日志所在地域</p>
    */
    @SerializedName("LogRegion")
    @Expose
    private String LogRegion;

    /**
    * <p>是否开启日志 0 关 1 开</p>
    */
    @SerializedName("IsRelatedLog")
    @Expose
    private Long IsRelatedLog;

    /**
    * <p>日志主题ID</p>
    */
    @SerializedName("LogTopicID")
    @Expose
    private String LogTopicID;

    /**
    * <p>需过滤的接口名</p>
    */
    @SerializedName("IgnoreOperationName")
    @Expose
    private String IgnoreOperationName;

    /**
    * <p>CLS日志集 | ES集群ID</p>
    */
    @SerializedName("LogSet")
    @Expose
    private String LogSet;

    /**
    * <p>探针每秒上报trace数</p>
    */
    @SerializedName("TraceRateLimit")
    @Expose
    private Long TraceRateLimit;

    /**
    * <p>是否开启线程剖析</p>
    */
    @SerializedName("EnableSnapshot")
    @Expose
    private Boolean EnableSnapshot;

    /**
    * <p>线程剖析超时阈值</p>
    */
    @SerializedName("SnapshotTimeout")
    @Expose
    private Long SnapshotTimeout;

    /**
    * <p>是否开启agent</p>
    */
    @SerializedName("AgentEnable")
    @Expose
    private Boolean AgentEnable;

    /**
    * <p>组件列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstrumentList")
    @Expose
    private Instrument [] InstrumentList;

    /**
    * <p>是否开启链路压缩</p>
    */
    @SerializedName("TraceSquash")
    @Expose
    private Boolean TraceSquash;

    /**
    * <p>是否开启应用诊断开关</p>
    */
    @SerializedName("EventEnable")
    @Expose
    private Boolean EventEnable;

    /**
    * <p>探针接口相关配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgentOperationConfigView")
    @Expose
    private AgentOperationConfigView AgentOperationConfigView;

    /**
    * <p>是否开启应用日志配置</p>
    */
    @SerializedName("EnableLogConfig")
    @Expose
    private Boolean EnableLogConfig;

    /**
    * <p>应用ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceID")
    @Expose
    private String ServiceID;

    /**
    * <p>应用是否开启dashboard配置： false 关（与业务系统保持一致）/true 开（应用级配置）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableDashboardConfig")
    @Expose
    private Boolean EnableDashboardConfig;

    /**
    * <p>是否关联dashboard： 0 关 1 开</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsRelatedDashboard")
    @Expose
    private Long IsRelatedDashboard;

    /**
    * <p>dashboard ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DashboardTopicID")
    @Expose
    private String DashboardTopicID;

    /**
    * <p>是否开启应用级别配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableSecurityConfig")
    @Expose
    private Boolean EnableSecurityConfig;

    /**
    * <p>是否开启组件漏洞检测</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsInstrumentationVulnerabilityScan")
    @Expose
    private Long IsInstrumentationVulnerabilityScan;

    /**
    * <p>是否开启SQL注入分析</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsSqlInjectionAnalysis")
    @Expose
    private Long IsSqlInjectionAnalysis;

    /**
    * <p>是否开启远程命令执行分析</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsRemoteCommandExecutionAnalysis")
    @Expose
    private Long IsRemoteCommandExecutionAnalysis;

    /**
    * <p>是否开启内存马检测分析</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsMemoryHijackingAnalysis")
    @Expose
    private Long IsMemoryHijackingAnalysis;

    /**
    * <p>CLS索引类型(0=全文索引，1=键值索引)</p>
    */
    @SerializedName("LogIndexType")
    @Expose
    private Long LogIndexType;

    /**
    * <p>traceId的索引key: 当CLS索引类型为键值索引时生效</p>
    */
    @SerializedName("LogTraceIdKey")
    @Expose
    private String LogTraceIdKey;

    /**
    * <p>是否开启删除任意文件检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsDeleteAnyFileAnalysis")
    @Expose
    private Long IsDeleteAnyFileAnalysis;

    /**
    * <p>是否开启读取任意文件检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsReadAnyFileAnalysis")
    @Expose
    private Long IsReadAnyFileAnalysis;

    /**
    * <p>是否开启上传任意文件检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsUploadAnyFileAnalysis")
    @Expose
    private Long IsUploadAnyFileAnalysis;

    /**
    * <p>是否开启包含任意文件检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsIncludeAnyFileAnalysis")
    @Expose
    private Long IsIncludeAnyFileAnalysis;

    /**
    * <p>是否开启目录遍历检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsDirectoryTraversalAnalysis")
    @Expose
    private Long IsDirectoryTraversalAnalysis;

    /**
    * <p>是否开启模板引擎注入检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsTemplateEngineInjectionAnalysis")
    @Expose
    private Long IsTemplateEngineInjectionAnalysis;

    /**
    * <p>是否开启脚本引擎注入检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsScriptEngineInjectionAnalysis")
    @Expose
    private Long IsScriptEngineInjectionAnalysis;

    /**
    * <p>是否开启表达式注入检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsExpressionInjectionAnalysis")
    @Expose
    private Long IsExpressionInjectionAnalysis;

    /**
    * <p>是否开启JNDI注入检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsJNDIInjectionAnalysis")
    @Expose
    private Long IsJNDIInjectionAnalysis;

    /**
    * <p>是否开启JNI注入检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsJNIInjectionAnalysis")
    @Expose
    private Long IsJNIInjectionAnalysis;

    /**
    * <p>是否开启Webshell后门检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsWebshellBackdoorAnalysis")
    @Expose
    private Long IsWebshellBackdoorAnalysis;

    /**
    * <p>是否开启反序列化检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsDeserializationAnalysis")
    @Expose
    private Long IsDeserializationAnalysis;

    /**
    * <p>接口名称自动收敛开关（0-关闭，1-开启）</p>
    */
    @SerializedName("UrlAutoConvergenceEnable")
    @Expose
    private Boolean UrlAutoConvergenceEnable;

    /**
    * <p>URL长分段收敛阈值</p>
    */
    @SerializedName("UrlLongSegmentThreshold")
    @Expose
    private Long UrlLongSegmentThreshold;

    /**
    * <p>URL数字分段收敛阈值</p>
    */
    @SerializedName("UrlNumberSegmentThreshold")
    @Expose
    private Long UrlNumberSegmentThreshold;

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
    * <p>spanId的索引key: 当CLS索引类型为键值索引时生效</p>
    */
    @SerializedName("LogSpanIdKey")
    @Expose
    private String LogSpanIdKey;

    /**
    * <p>自动性能剖析配置</p>
    */
    @SerializedName("AutoProfilingConfig")
    @Expose
    private AutoProfilingConfig AutoProfilingConfig;

    /**
    * <p>阈值配置开关。true 表示使用应用级阈值；false 表示使用业务系统级阈值</p>
    */
    @SerializedName("EnableThresholdConfig")
    @Expose
    private Boolean EnableThresholdConfig;

    /**
    * <p>错误率阈值（%），用于判断应用健康状态为&quot;红色&quot;</p>
    */
    @SerializedName("ErrRateThreshold")
    @Expose
    private Long ErrRateThreshold;

    /**
    * <p>响应时间预警阈值（ms），用于判断应用健康状态为&quot;黄色&quot;</p>
    */
    @SerializedName("ResponseDurationWarningThreshold")
    @Expose
    private Long ResponseDurationWarningThreshold;

    /**
     * Get <p>实例ID</p> 
     * @return InstanceKey <p>实例ID</p>
     */
    public String getInstanceKey() {
        return this.InstanceKey;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceKey <p>实例ID</p>
     */
    public void setInstanceKey(String InstanceKey) {
        this.InstanceKey = InstanceKey;
    }

    /**
     * Get <p>服务名</p> 
     * @return ServiceName <p>服务名</p>
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set <p>服务名</p>
     * @param ServiceName <p>服务名</p>
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get <p>URL收敛开关</p> 
     * @return UrlConvergenceSwitch <p>URL收敛开关</p>
     */
    public Long getUrlConvergenceSwitch() {
        return this.UrlConvergenceSwitch;
    }

    /**
     * Set <p>URL收敛开关</p>
     * @param UrlConvergenceSwitch <p>URL收敛开关</p>
     */
    public void setUrlConvergenceSwitch(Long UrlConvergenceSwitch) {
        this.UrlConvergenceSwitch = UrlConvergenceSwitch;
    }

    /**
     * Get <p>URL收敛阈值</p> 
     * @return UrlConvergenceThreshold <p>URL收敛阈值</p>
     */
    public Long getUrlConvergenceThreshold() {
        return this.UrlConvergenceThreshold;
    }

    /**
     * Set <p>URL收敛阈值</p>
     * @param UrlConvergenceThreshold <p>URL收敛阈值</p>
     */
    public void setUrlConvergenceThreshold(Long UrlConvergenceThreshold) {
        this.UrlConvergenceThreshold = UrlConvergenceThreshold;
    }

    /**
     * Get <p>URL收敛正则</p> 
     * @return UrlConvergence <p>URL收敛正则</p>
     */
    public String getUrlConvergence() {
        return this.UrlConvergence;
    }

    /**
     * Set <p>URL收敛正则</p>
     * @param UrlConvergence <p>URL收敛正则</p>
     */
    public void setUrlConvergence(String UrlConvergence) {
        this.UrlConvergence = UrlConvergence;
    }

    /**
     * Get <p>异常过滤正则</p> 
     * @return ExceptionFilter <p>异常过滤正则</p>
     */
    public String getExceptionFilter() {
        return this.ExceptionFilter;
    }

    /**
     * Set <p>异常过滤正则</p>
     * @param ExceptionFilter <p>异常过滤正则</p>
     */
    public void setExceptionFilter(String ExceptionFilter) {
        this.ExceptionFilter = ExceptionFilter;
    }

    /**
     * Get <p>错误码过滤</p> 
     * @return ErrorCodeFilter <p>错误码过滤</p>
     */
    public String getErrorCodeFilter() {
        return this.ErrorCodeFilter;
    }

    /**
     * Set <p>错误码过滤</p>
     * @param ErrorCodeFilter <p>错误码过滤</p>
     */
    public void setErrorCodeFilter(String ErrorCodeFilter) {
        this.ErrorCodeFilter = ErrorCodeFilter;
    }

    /**
     * Get <p>服务组件类型</p> 
     * @return Components <p>服务组件类型</p>
     */
    public String getComponents() {
        return this.Components;
    }

    /**
     * Set <p>服务组件类型</p>
     * @param Components <p>服务组件类型</p>
     */
    public void setComponents(String Components) {
        this.Components = Components;
    }

    /**
     * Get <p>URL排除正则</p> 
     * @return UrlExclude <p>URL排除正则</p>
     */
    public String getUrlExclude() {
        return this.UrlExclude;
    }

    /**
     * Set <p>URL排除正则</p>
     * @param UrlExclude <p>URL排除正则</p>
     */
    public void setUrlExclude(String UrlExclude) {
        this.UrlExclude = UrlExclude;
    }

    /**
     * Get <p>日志来源</p> 
     * @return LogSource <p>日志来源</p>
     */
    public String getLogSource() {
        return this.LogSource;
    }

    /**
     * Set <p>日志来源</p>
     * @param LogSource <p>日志来源</p>
     */
    public void setLogSource(String LogSource) {
        this.LogSource = LogSource;
    }

    /**
     * Get <p>日志所在地域</p> 
     * @return LogRegion <p>日志所在地域</p>
     */
    public String getLogRegion() {
        return this.LogRegion;
    }

    /**
     * Set <p>日志所在地域</p>
     * @param LogRegion <p>日志所在地域</p>
     */
    public void setLogRegion(String LogRegion) {
        this.LogRegion = LogRegion;
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
     * Get <p>日志主题ID</p> 
     * @return LogTopicID <p>日志主题ID</p>
     */
    public String getLogTopicID() {
        return this.LogTopicID;
    }

    /**
     * Set <p>日志主题ID</p>
     * @param LogTopicID <p>日志主题ID</p>
     */
    public void setLogTopicID(String LogTopicID) {
        this.LogTopicID = LogTopicID;
    }

    /**
     * Get <p>需过滤的接口名</p> 
     * @return IgnoreOperationName <p>需过滤的接口名</p>
     */
    public String getIgnoreOperationName() {
        return this.IgnoreOperationName;
    }

    /**
     * Set <p>需过滤的接口名</p>
     * @param IgnoreOperationName <p>需过滤的接口名</p>
     */
    public void setIgnoreOperationName(String IgnoreOperationName) {
        this.IgnoreOperationName = IgnoreOperationName;
    }

    /**
     * Get <p>CLS日志集 | ES集群ID</p> 
     * @return LogSet <p>CLS日志集 | ES集群ID</p>
     */
    public String getLogSet() {
        return this.LogSet;
    }

    /**
     * Set <p>CLS日志集 | ES集群ID</p>
     * @param LogSet <p>CLS日志集 | ES集群ID</p>
     */
    public void setLogSet(String LogSet) {
        this.LogSet = LogSet;
    }

    /**
     * Get <p>探针每秒上报trace数</p> 
     * @return TraceRateLimit <p>探针每秒上报trace数</p>
     */
    public Long getTraceRateLimit() {
        return this.TraceRateLimit;
    }

    /**
     * Set <p>探针每秒上报trace数</p>
     * @param TraceRateLimit <p>探针每秒上报trace数</p>
     */
    public void setTraceRateLimit(Long TraceRateLimit) {
        this.TraceRateLimit = TraceRateLimit;
    }

    /**
     * Get <p>是否开启线程剖析</p> 
     * @return EnableSnapshot <p>是否开启线程剖析</p>
     */
    public Boolean getEnableSnapshot() {
        return this.EnableSnapshot;
    }

    /**
     * Set <p>是否开启线程剖析</p>
     * @param EnableSnapshot <p>是否开启线程剖析</p>
     */
    public void setEnableSnapshot(Boolean EnableSnapshot) {
        this.EnableSnapshot = EnableSnapshot;
    }

    /**
     * Get <p>线程剖析超时阈值</p> 
     * @return SnapshotTimeout <p>线程剖析超时阈值</p>
     */
    public Long getSnapshotTimeout() {
        return this.SnapshotTimeout;
    }

    /**
     * Set <p>线程剖析超时阈值</p>
     * @param SnapshotTimeout <p>线程剖析超时阈值</p>
     */
    public void setSnapshotTimeout(Long SnapshotTimeout) {
        this.SnapshotTimeout = SnapshotTimeout;
    }

    /**
     * Get <p>是否开启agent</p> 
     * @return AgentEnable <p>是否开启agent</p>
     */
    public Boolean getAgentEnable() {
        return this.AgentEnable;
    }

    /**
     * Set <p>是否开启agent</p>
     * @param AgentEnable <p>是否开启agent</p>
     */
    public void setAgentEnable(Boolean AgentEnable) {
        this.AgentEnable = AgentEnable;
    }

    /**
     * Get <p>组件列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstrumentList <p>组件列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Instrument [] getInstrumentList() {
        return this.InstrumentList;
    }

    /**
     * Set <p>组件列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstrumentList <p>组件列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstrumentList(Instrument [] InstrumentList) {
        this.InstrumentList = InstrumentList;
    }

    /**
     * Get <p>是否开启链路压缩</p> 
     * @return TraceSquash <p>是否开启链路压缩</p>
     */
    public Boolean getTraceSquash() {
        return this.TraceSquash;
    }

    /**
     * Set <p>是否开启链路压缩</p>
     * @param TraceSquash <p>是否开启链路压缩</p>
     */
    public void setTraceSquash(Boolean TraceSquash) {
        this.TraceSquash = TraceSquash;
    }

    /**
     * Get <p>是否开启应用诊断开关</p> 
     * @return EventEnable <p>是否开启应用诊断开关</p>
     */
    public Boolean getEventEnable() {
        return this.EventEnable;
    }

    /**
     * Set <p>是否开启应用诊断开关</p>
     * @param EventEnable <p>是否开启应用诊断开关</p>
     */
    public void setEventEnable(Boolean EventEnable) {
        this.EventEnable = EventEnable;
    }

    /**
     * Get <p>探针接口相关配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgentOperationConfigView <p>探针接口相关配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AgentOperationConfigView getAgentOperationConfigView() {
        return this.AgentOperationConfigView;
    }

    /**
     * Set <p>探针接口相关配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgentOperationConfigView <p>探针接口相关配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgentOperationConfigView(AgentOperationConfigView AgentOperationConfigView) {
        this.AgentOperationConfigView = AgentOperationConfigView;
    }

    /**
     * Get <p>是否开启应用日志配置</p> 
     * @return EnableLogConfig <p>是否开启应用日志配置</p>
     */
    public Boolean getEnableLogConfig() {
        return this.EnableLogConfig;
    }

    /**
     * Set <p>是否开启应用日志配置</p>
     * @param EnableLogConfig <p>是否开启应用日志配置</p>
     */
    public void setEnableLogConfig(Boolean EnableLogConfig) {
        this.EnableLogConfig = EnableLogConfig;
    }

    /**
     * Get <p>应用ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceID <p>应用ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceID() {
        return this.ServiceID;
    }

    /**
     * Set <p>应用ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceID <p>应用ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceID(String ServiceID) {
        this.ServiceID = ServiceID;
    }

    /**
     * Get <p>应用是否开启dashboard配置： false 关（与业务系统保持一致）/true 开（应用级配置）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableDashboardConfig <p>应用是否开启dashboard配置： false 关（与业务系统保持一致）/true 开（应用级配置）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableDashboardConfig() {
        return this.EnableDashboardConfig;
    }

    /**
     * Set <p>应用是否开启dashboard配置： false 关（与业务系统保持一致）/true 开（应用级配置）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableDashboardConfig <p>应用是否开启dashboard配置： false 关（与业务系统保持一致）/true 开（应用级配置）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableDashboardConfig(Boolean EnableDashboardConfig) {
        this.EnableDashboardConfig = EnableDashboardConfig;
    }

    /**
     * Get <p>是否关联dashboard： 0 关 1 开</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsRelatedDashboard <p>是否关联dashboard： 0 关 1 开</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsRelatedDashboard() {
        return this.IsRelatedDashboard;
    }

    /**
     * Set <p>是否关联dashboard： 0 关 1 开</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsRelatedDashboard <p>是否关联dashboard： 0 关 1 开</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsRelatedDashboard(Long IsRelatedDashboard) {
        this.IsRelatedDashboard = IsRelatedDashboard;
    }

    /**
     * Get <p>dashboard ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DashboardTopicID <p>dashboard ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDashboardTopicID() {
        return this.DashboardTopicID;
    }

    /**
     * Set <p>dashboard ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DashboardTopicID <p>dashboard ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDashboardTopicID(String DashboardTopicID) {
        this.DashboardTopicID = DashboardTopicID;
    }

    /**
     * Get <p>是否开启应用级别配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableSecurityConfig <p>是否开启应用级别配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableSecurityConfig() {
        return this.EnableSecurityConfig;
    }

    /**
     * Set <p>是否开启应用级别配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableSecurityConfig <p>是否开启应用级别配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableSecurityConfig(Boolean EnableSecurityConfig) {
        this.EnableSecurityConfig = EnableSecurityConfig;
    }

    /**
     * Get <p>是否开启组件漏洞检测</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsInstrumentationVulnerabilityScan <p>是否开启组件漏洞检测</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsInstrumentationVulnerabilityScan() {
        return this.IsInstrumentationVulnerabilityScan;
    }

    /**
     * Set <p>是否开启组件漏洞检测</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsInstrumentationVulnerabilityScan <p>是否开启组件漏洞检测</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsInstrumentationVulnerabilityScan(Long IsInstrumentationVulnerabilityScan) {
        this.IsInstrumentationVulnerabilityScan = IsInstrumentationVulnerabilityScan;
    }

    /**
     * Get <p>是否开启SQL注入分析</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsSqlInjectionAnalysis <p>是否开启SQL注入分析</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsSqlInjectionAnalysis() {
        return this.IsSqlInjectionAnalysis;
    }

    /**
     * Set <p>是否开启SQL注入分析</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsSqlInjectionAnalysis <p>是否开启SQL注入分析</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsSqlInjectionAnalysis(Long IsSqlInjectionAnalysis) {
        this.IsSqlInjectionAnalysis = IsSqlInjectionAnalysis;
    }

    /**
     * Get <p>是否开启远程命令执行分析</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsRemoteCommandExecutionAnalysis <p>是否开启远程命令执行分析</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsRemoteCommandExecutionAnalysis() {
        return this.IsRemoteCommandExecutionAnalysis;
    }

    /**
     * Set <p>是否开启远程命令执行分析</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsRemoteCommandExecutionAnalysis <p>是否开启远程命令执行分析</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsRemoteCommandExecutionAnalysis(Long IsRemoteCommandExecutionAnalysis) {
        this.IsRemoteCommandExecutionAnalysis = IsRemoteCommandExecutionAnalysis;
    }

    /**
     * Get <p>是否开启内存马检测分析</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsMemoryHijackingAnalysis <p>是否开启内存马检测分析</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsMemoryHijackingAnalysis() {
        return this.IsMemoryHijackingAnalysis;
    }

    /**
     * Set <p>是否开启内存马检测分析</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsMemoryHijackingAnalysis <p>是否开启内存马检测分析</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsMemoryHijackingAnalysis(Long IsMemoryHijackingAnalysis) {
        this.IsMemoryHijackingAnalysis = IsMemoryHijackingAnalysis;
    }

    /**
     * Get <p>CLS索引类型(0=全文索引，1=键值索引)</p> 
     * @return LogIndexType <p>CLS索引类型(0=全文索引，1=键值索引)</p>
     */
    public Long getLogIndexType() {
        return this.LogIndexType;
    }

    /**
     * Set <p>CLS索引类型(0=全文索引，1=键值索引)</p>
     * @param LogIndexType <p>CLS索引类型(0=全文索引，1=键值索引)</p>
     */
    public void setLogIndexType(Long LogIndexType) {
        this.LogIndexType = LogIndexType;
    }

    /**
     * Get <p>traceId的索引key: 当CLS索引类型为键值索引时生效</p> 
     * @return LogTraceIdKey <p>traceId的索引key: 当CLS索引类型为键值索引时生效</p>
     */
    public String getLogTraceIdKey() {
        return this.LogTraceIdKey;
    }

    /**
     * Set <p>traceId的索引key: 当CLS索引类型为键值索引时生效</p>
     * @param LogTraceIdKey <p>traceId的索引key: 当CLS索引类型为键值索引时生效</p>
     */
    public void setLogTraceIdKey(String LogTraceIdKey) {
        this.LogTraceIdKey = LogTraceIdKey;
    }

    /**
     * Get <p>是否开启删除任意文件检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsDeleteAnyFileAnalysis <p>是否开启删除任意文件检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsDeleteAnyFileAnalysis() {
        return this.IsDeleteAnyFileAnalysis;
    }

    /**
     * Set <p>是否开启删除任意文件检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsDeleteAnyFileAnalysis <p>是否开启删除任意文件检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsDeleteAnyFileAnalysis(Long IsDeleteAnyFileAnalysis) {
        this.IsDeleteAnyFileAnalysis = IsDeleteAnyFileAnalysis;
    }

    /**
     * Get <p>是否开启读取任意文件检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsReadAnyFileAnalysis <p>是否开启读取任意文件检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsReadAnyFileAnalysis() {
        return this.IsReadAnyFileAnalysis;
    }

    /**
     * Set <p>是否开启读取任意文件检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsReadAnyFileAnalysis <p>是否开启读取任意文件检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsReadAnyFileAnalysis(Long IsReadAnyFileAnalysis) {
        this.IsReadAnyFileAnalysis = IsReadAnyFileAnalysis;
    }

    /**
     * Get <p>是否开启上传任意文件检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsUploadAnyFileAnalysis <p>是否开启上传任意文件检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsUploadAnyFileAnalysis() {
        return this.IsUploadAnyFileAnalysis;
    }

    /**
     * Set <p>是否开启上传任意文件检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsUploadAnyFileAnalysis <p>是否开启上传任意文件检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsUploadAnyFileAnalysis(Long IsUploadAnyFileAnalysis) {
        this.IsUploadAnyFileAnalysis = IsUploadAnyFileAnalysis;
    }

    /**
     * Get <p>是否开启包含任意文件检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsIncludeAnyFileAnalysis <p>是否开启包含任意文件检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsIncludeAnyFileAnalysis() {
        return this.IsIncludeAnyFileAnalysis;
    }

    /**
     * Set <p>是否开启包含任意文件检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsIncludeAnyFileAnalysis <p>是否开启包含任意文件检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsIncludeAnyFileAnalysis(Long IsIncludeAnyFileAnalysis) {
        this.IsIncludeAnyFileAnalysis = IsIncludeAnyFileAnalysis;
    }

    /**
     * Get <p>是否开启目录遍历检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsDirectoryTraversalAnalysis <p>是否开启目录遍历检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsDirectoryTraversalAnalysis() {
        return this.IsDirectoryTraversalAnalysis;
    }

    /**
     * Set <p>是否开启目录遍历检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsDirectoryTraversalAnalysis <p>是否开启目录遍历检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsDirectoryTraversalAnalysis(Long IsDirectoryTraversalAnalysis) {
        this.IsDirectoryTraversalAnalysis = IsDirectoryTraversalAnalysis;
    }

    /**
     * Get <p>是否开启模板引擎注入检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsTemplateEngineInjectionAnalysis <p>是否开启模板引擎注入检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsTemplateEngineInjectionAnalysis() {
        return this.IsTemplateEngineInjectionAnalysis;
    }

    /**
     * Set <p>是否开启模板引擎注入检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsTemplateEngineInjectionAnalysis <p>是否开启模板引擎注入检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsTemplateEngineInjectionAnalysis(Long IsTemplateEngineInjectionAnalysis) {
        this.IsTemplateEngineInjectionAnalysis = IsTemplateEngineInjectionAnalysis;
    }

    /**
     * Get <p>是否开启脚本引擎注入检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsScriptEngineInjectionAnalysis <p>是否开启脚本引擎注入检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsScriptEngineInjectionAnalysis() {
        return this.IsScriptEngineInjectionAnalysis;
    }

    /**
     * Set <p>是否开启脚本引擎注入检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsScriptEngineInjectionAnalysis <p>是否开启脚本引擎注入检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsScriptEngineInjectionAnalysis(Long IsScriptEngineInjectionAnalysis) {
        this.IsScriptEngineInjectionAnalysis = IsScriptEngineInjectionAnalysis;
    }

    /**
     * Get <p>是否开启表达式注入检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsExpressionInjectionAnalysis <p>是否开启表达式注入检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsExpressionInjectionAnalysis() {
        return this.IsExpressionInjectionAnalysis;
    }

    /**
     * Set <p>是否开启表达式注入检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsExpressionInjectionAnalysis <p>是否开启表达式注入检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsExpressionInjectionAnalysis(Long IsExpressionInjectionAnalysis) {
        this.IsExpressionInjectionAnalysis = IsExpressionInjectionAnalysis;
    }

    /**
     * Get <p>是否开启JNDI注入检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsJNDIInjectionAnalysis <p>是否开启JNDI注入检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsJNDIInjectionAnalysis() {
        return this.IsJNDIInjectionAnalysis;
    }

    /**
     * Set <p>是否开启JNDI注入检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsJNDIInjectionAnalysis <p>是否开启JNDI注入检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsJNDIInjectionAnalysis(Long IsJNDIInjectionAnalysis) {
        this.IsJNDIInjectionAnalysis = IsJNDIInjectionAnalysis;
    }

    /**
     * Get <p>是否开启JNI注入检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsJNIInjectionAnalysis <p>是否开启JNI注入检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsJNIInjectionAnalysis() {
        return this.IsJNIInjectionAnalysis;
    }

    /**
     * Set <p>是否开启JNI注入检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsJNIInjectionAnalysis <p>是否开启JNI注入检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsJNIInjectionAnalysis(Long IsJNIInjectionAnalysis) {
        this.IsJNIInjectionAnalysis = IsJNIInjectionAnalysis;
    }

    /**
     * Get <p>是否开启Webshell后门检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsWebshellBackdoorAnalysis <p>是否开启Webshell后门检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsWebshellBackdoorAnalysis() {
        return this.IsWebshellBackdoorAnalysis;
    }

    /**
     * Set <p>是否开启Webshell后门检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsWebshellBackdoorAnalysis <p>是否开启Webshell后门检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsWebshellBackdoorAnalysis(Long IsWebshellBackdoorAnalysis) {
        this.IsWebshellBackdoorAnalysis = IsWebshellBackdoorAnalysis;
    }

    /**
     * Get <p>是否开启反序列化检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsDeserializationAnalysis <p>是否开启反序列化检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsDeserializationAnalysis() {
        return this.IsDeserializationAnalysis;
    }

    /**
     * Set <p>是否开启反序列化检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsDeserializationAnalysis <p>是否开启反序列化检测（0-关闭，1-开启）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsDeserializationAnalysis(Long IsDeserializationAnalysis) {
        this.IsDeserializationAnalysis = IsDeserializationAnalysis;
    }

    /**
     * Get <p>接口名称自动收敛开关（0-关闭，1-开启）</p> 
     * @return UrlAutoConvergenceEnable <p>接口名称自动收敛开关（0-关闭，1-开启）</p>
     */
    public Boolean getUrlAutoConvergenceEnable() {
        return this.UrlAutoConvergenceEnable;
    }

    /**
     * Set <p>接口名称自动收敛开关（0-关闭，1-开启）</p>
     * @param UrlAutoConvergenceEnable <p>接口名称自动收敛开关（0-关闭，1-开启）</p>
     */
    public void setUrlAutoConvergenceEnable(Boolean UrlAutoConvergenceEnable) {
        this.UrlAutoConvergenceEnable = UrlAutoConvergenceEnable;
    }

    /**
     * Get <p>URL长分段收敛阈值</p> 
     * @return UrlLongSegmentThreshold <p>URL长分段收敛阈值</p>
     */
    public Long getUrlLongSegmentThreshold() {
        return this.UrlLongSegmentThreshold;
    }

    /**
     * Set <p>URL长分段收敛阈值</p>
     * @param UrlLongSegmentThreshold <p>URL长分段收敛阈值</p>
     */
    public void setUrlLongSegmentThreshold(Long UrlLongSegmentThreshold) {
        this.UrlLongSegmentThreshold = UrlLongSegmentThreshold;
    }

    /**
     * Get <p>URL数字分段收敛阈值</p> 
     * @return UrlNumberSegmentThreshold <p>URL数字分段收敛阈值</p>
     */
    public Long getUrlNumberSegmentThreshold() {
        return this.UrlNumberSegmentThreshold;
    }

    /**
     * Set <p>URL数字分段收敛阈值</p>
     * @param UrlNumberSegmentThreshold <p>URL数字分段收敛阈值</p>
     */
    public void setUrlNumberSegmentThreshold(Long UrlNumberSegmentThreshold) {
        this.UrlNumberSegmentThreshold = UrlNumberSegmentThreshold;
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
     * Get <p>spanId的索引key: 当CLS索引类型为键值索引时生效</p> 
     * @return LogSpanIdKey <p>spanId的索引key: 当CLS索引类型为键值索引时生效</p>
     */
    public String getLogSpanIdKey() {
        return this.LogSpanIdKey;
    }

    /**
     * Set <p>spanId的索引key: 当CLS索引类型为键值索引时生效</p>
     * @param LogSpanIdKey <p>spanId的索引key: 当CLS索引类型为键值索引时生效</p>
     */
    public void setLogSpanIdKey(String LogSpanIdKey) {
        this.LogSpanIdKey = LogSpanIdKey;
    }

    /**
     * Get <p>自动性能剖析配置</p> 
     * @return AutoProfilingConfig <p>自动性能剖析配置</p>
     */
    public AutoProfilingConfig getAutoProfilingConfig() {
        return this.AutoProfilingConfig;
    }

    /**
     * Set <p>自动性能剖析配置</p>
     * @param AutoProfilingConfig <p>自动性能剖析配置</p>
     */
    public void setAutoProfilingConfig(AutoProfilingConfig AutoProfilingConfig) {
        this.AutoProfilingConfig = AutoProfilingConfig;
    }

    /**
     * Get <p>阈值配置开关。true 表示使用应用级阈值；false 表示使用业务系统级阈值</p> 
     * @return EnableThresholdConfig <p>阈值配置开关。true 表示使用应用级阈值；false 表示使用业务系统级阈值</p>
     */
    public Boolean getEnableThresholdConfig() {
        return this.EnableThresholdConfig;
    }

    /**
     * Set <p>阈值配置开关。true 表示使用应用级阈值；false 表示使用业务系统级阈值</p>
     * @param EnableThresholdConfig <p>阈值配置开关。true 表示使用应用级阈值；false 表示使用业务系统级阈值</p>
     */
    public void setEnableThresholdConfig(Boolean EnableThresholdConfig) {
        this.EnableThresholdConfig = EnableThresholdConfig;
    }

    /**
     * Get <p>错误率阈值（%），用于判断应用健康状态为&quot;红色&quot;</p> 
     * @return ErrRateThreshold <p>错误率阈值（%），用于判断应用健康状态为&quot;红色&quot;</p>
     */
    public Long getErrRateThreshold() {
        return this.ErrRateThreshold;
    }

    /**
     * Set <p>错误率阈值（%），用于判断应用健康状态为&quot;红色&quot;</p>
     * @param ErrRateThreshold <p>错误率阈值（%），用于判断应用健康状态为&quot;红色&quot;</p>
     */
    public void setErrRateThreshold(Long ErrRateThreshold) {
        this.ErrRateThreshold = ErrRateThreshold;
    }

    /**
     * Get <p>响应时间预警阈值（ms），用于判断应用健康状态为&quot;黄色&quot;</p> 
     * @return ResponseDurationWarningThreshold <p>响应时间预警阈值（ms），用于判断应用健康状态为&quot;黄色&quot;</p>
     */
    public Long getResponseDurationWarningThreshold() {
        return this.ResponseDurationWarningThreshold;
    }

    /**
     * Set <p>响应时间预警阈值（ms），用于判断应用健康状态为&quot;黄色&quot;</p>
     * @param ResponseDurationWarningThreshold <p>响应时间预警阈值（ms），用于判断应用健康状态为&quot;黄色&quot;</p>
     */
    public void setResponseDurationWarningThreshold(Long ResponseDurationWarningThreshold) {
        this.ResponseDurationWarningThreshold = ResponseDurationWarningThreshold;
    }

    public ApmAppConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApmAppConfig(ApmAppConfig source) {
        if (source.InstanceKey != null) {
            this.InstanceKey = new String(source.InstanceKey);
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
        if (source.UrlConvergence != null) {
            this.UrlConvergence = new String(source.UrlConvergence);
        }
        if (source.ExceptionFilter != null) {
            this.ExceptionFilter = new String(source.ExceptionFilter);
        }
        if (source.ErrorCodeFilter != null) {
            this.ErrorCodeFilter = new String(source.ErrorCodeFilter);
        }
        if (source.Components != null) {
            this.Components = new String(source.Components);
        }
        if (source.UrlExclude != null) {
            this.UrlExclude = new String(source.UrlExclude);
        }
        if (source.LogSource != null) {
            this.LogSource = new String(source.LogSource);
        }
        if (source.LogRegion != null) {
            this.LogRegion = new String(source.LogRegion);
        }
        if (source.IsRelatedLog != null) {
            this.IsRelatedLog = new Long(source.IsRelatedLog);
        }
        if (source.LogTopicID != null) {
            this.LogTopicID = new String(source.LogTopicID);
        }
        if (source.IgnoreOperationName != null) {
            this.IgnoreOperationName = new String(source.IgnoreOperationName);
        }
        if (source.LogSet != null) {
            this.LogSet = new String(source.LogSet);
        }
        if (source.TraceRateLimit != null) {
            this.TraceRateLimit = new Long(source.TraceRateLimit);
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
        if (source.InstrumentList != null) {
            this.InstrumentList = new Instrument[source.InstrumentList.length];
            for (int i = 0; i < source.InstrumentList.length; i++) {
                this.InstrumentList[i] = new Instrument(source.InstrumentList[i]);
            }
        }
        if (source.TraceSquash != null) {
            this.TraceSquash = new Boolean(source.TraceSquash);
        }
        if (source.EventEnable != null) {
            this.EventEnable = new Boolean(source.EventEnable);
        }
        if (source.AgentOperationConfigView != null) {
            this.AgentOperationConfigView = new AgentOperationConfigView(source.AgentOperationConfigView);
        }
        if (source.EnableLogConfig != null) {
            this.EnableLogConfig = new Boolean(source.EnableLogConfig);
        }
        if (source.ServiceID != null) {
            this.ServiceID = new String(source.ServiceID);
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
        if (source.EnableSecurityConfig != null) {
            this.EnableSecurityConfig = new Boolean(source.EnableSecurityConfig);
        }
        if (source.IsInstrumentationVulnerabilityScan != null) {
            this.IsInstrumentationVulnerabilityScan = new Long(source.IsInstrumentationVulnerabilityScan);
        }
        if (source.IsSqlInjectionAnalysis != null) {
            this.IsSqlInjectionAnalysis = new Long(source.IsSqlInjectionAnalysis);
        }
        if (source.IsRemoteCommandExecutionAnalysis != null) {
            this.IsRemoteCommandExecutionAnalysis = new Long(source.IsRemoteCommandExecutionAnalysis);
        }
        if (source.IsMemoryHijackingAnalysis != null) {
            this.IsMemoryHijackingAnalysis = new Long(source.IsMemoryHijackingAnalysis);
        }
        if (source.LogIndexType != null) {
            this.LogIndexType = new Long(source.LogIndexType);
        }
        if (source.LogTraceIdKey != null) {
            this.LogTraceIdKey = new String(source.LogTraceIdKey);
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
        if (source.EnableThresholdConfig != null) {
            this.EnableThresholdConfig = new Boolean(source.EnableThresholdConfig);
        }
        if (source.ErrRateThreshold != null) {
            this.ErrRateThreshold = new Long(source.ErrRateThreshold);
        }
        if (source.ResponseDurationWarningThreshold != null) {
            this.ResponseDurationWarningThreshold = new Long(source.ResponseDurationWarningThreshold);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceKey", this.InstanceKey);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "UrlConvergenceSwitch", this.UrlConvergenceSwitch);
        this.setParamSimple(map, prefix + "UrlConvergenceThreshold", this.UrlConvergenceThreshold);
        this.setParamSimple(map, prefix + "UrlConvergence", this.UrlConvergence);
        this.setParamSimple(map, prefix + "ExceptionFilter", this.ExceptionFilter);
        this.setParamSimple(map, prefix + "ErrorCodeFilter", this.ErrorCodeFilter);
        this.setParamSimple(map, prefix + "Components", this.Components);
        this.setParamSimple(map, prefix + "UrlExclude", this.UrlExclude);
        this.setParamSimple(map, prefix + "LogSource", this.LogSource);
        this.setParamSimple(map, prefix + "LogRegion", this.LogRegion);
        this.setParamSimple(map, prefix + "IsRelatedLog", this.IsRelatedLog);
        this.setParamSimple(map, prefix + "LogTopicID", this.LogTopicID);
        this.setParamSimple(map, prefix + "IgnoreOperationName", this.IgnoreOperationName);
        this.setParamSimple(map, prefix + "LogSet", this.LogSet);
        this.setParamSimple(map, prefix + "TraceRateLimit", this.TraceRateLimit);
        this.setParamSimple(map, prefix + "EnableSnapshot", this.EnableSnapshot);
        this.setParamSimple(map, prefix + "SnapshotTimeout", this.SnapshotTimeout);
        this.setParamSimple(map, prefix + "AgentEnable", this.AgentEnable);
        this.setParamArrayObj(map, prefix + "InstrumentList.", this.InstrumentList);
        this.setParamSimple(map, prefix + "TraceSquash", this.TraceSquash);
        this.setParamSimple(map, prefix + "EventEnable", this.EventEnable);
        this.setParamObj(map, prefix + "AgentOperationConfigView.", this.AgentOperationConfigView);
        this.setParamSimple(map, prefix + "EnableLogConfig", this.EnableLogConfig);
        this.setParamSimple(map, prefix + "ServiceID", this.ServiceID);
        this.setParamSimple(map, prefix + "EnableDashboardConfig", this.EnableDashboardConfig);
        this.setParamSimple(map, prefix + "IsRelatedDashboard", this.IsRelatedDashboard);
        this.setParamSimple(map, prefix + "DashboardTopicID", this.DashboardTopicID);
        this.setParamSimple(map, prefix + "EnableSecurityConfig", this.EnableSecurityConfig);
        this.setParamSimple(map, prefix + "IsInstrumentationVulnerabilityScan", this.IsInstrumentationVulnerabilityScan);
        this.setParamSimple(map, prefix + "IsSqlInjectionAnalysis", this.IsSqlInjectionAnalysis);
        this.setParamSimple(map, prefix + "IsRemoteCommandExecutionAnalysis", this.IsRemoteCommandExecutionAnalysis);
        this.setParamSimple(map, prefix + "IsMemoryHijackingAnalysis", this.IsMemoryHijackingAnalysis);
        this.setParamSimple(map, prefix + "LogIndexType", this.LogIndexType);
        this.setParamSimple(map, prefix + "LogTraceIdKey", this.LogTraceIdKey);
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
        this.setParamSimple(map, prefix + "EnableThresholdConfig", this.EnableThresholdConfig);
        this.setParamSimple(map, prefix + "ErrRateThreshold", this.ErrRateThreshold);
        this.setParamSimple(map, prefix + "ResponseDurationWarningThreshold", this.ResponseDurationWarningThreshold);

    }
}

