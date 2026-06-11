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

public class ApmInstanceDetail extends AbstractModel {

    /**
    * <p>业务系统 ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>业务系统名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>业务系统描述信息</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>业务系统状态。{<br>1: 初始化中; 2: 运行中; 4: 限流}</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>业务系统所属地域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>业务系统 Tag 列表</p>
    */
    @SerializedName("Tags")
    @Expose
    private ApmTag [] Tags;

    /**
    * <p>AppID 信息</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>创建人 Uin</p>
    */
    @SerializedName("CreateUin")
    @Expose
    private String CreateUin;

    /**
    * <p>存储使用量(单位：MB)</p>
    */
    @SerializedName("AmountOfUsedStorage")
    @Expose
    private Float AmountOfUsedStorage;

    /**
    * <p>该业务系统服务端应用数量</p>
    */
    @SerializedName("ServiceCount")
    @Expose
    private Long ServiceCount;

    /**
    * <p>日均上报 Span 数</p>
    */
    @SerializedName("CountOfReportSpanPerDay")
    @Expose
    private Long CountOfReportSpanPerDay;

    /**
    * <p>Trace 数据保存时长（单位：天）</p>
    */
    @SerializedName("TraceDuration")
    @Expose
    private Long TraceDuration;

    /**
    * <p>业务系统上报额度</p>
    */
    @SerializedName("SpanDailyCounters")
    @Expose
    private Long SpanDailyCounters;

    /**
    * <p>业务系统是否已开通计费（0=未开通，1=已开通）</p>
    */
    @SerializedName("BillingInstance")
    @Expose
    private Long BillingInstance;

    /**
    * <p>错误警示线（单位：%）</p>
    */
    @SerializedName("ErrRateThreshold")
    @Expose
    private Long ErrRateThreshold;

    /**
    * <p>采样率（单位：%）</p>
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    * <p>是否开启错误采样（0=关, 1=开）</p>
    */
    @SerializedName("ErrorSample")
    @Expose
    private Long ErrorSample;

    /**
    * <p>采样慢调用保存阈值（单位：ms）</p>
    */
    @SerializedName("SlowRequestSavedThreshold")
    @Expose
    private Long SlowRequestSavedThreshold;

    /**
    * <p>CLS 日志所在地域</p>
    */
    @SerializedName("LogRegion")
    @Expose
    private String LogRegion;

    /**
    * <p>日志源</p>
    */
    @SerializedName("LogSource")
    @Expose
    private String LogSource;

    /**
    * <p>日志功能开关（0=关， 1=开）</p>
    */
    @SerializedName("IsRelatedLog")
    @Expose
    private Long IsRelatedLog;

    /**
    * <p>日志主题 ID</p>
    */
    @SerializedName("LogTopicID")
    @Expose
    private String LogTopicID;

    /**
    * <p>该业务系统客户端应用数量</p>
    */
    @SerializedName("ClientCount")
    @Expose
    private Long ClientCount;

    /**
    * <p>该业务系统最近2天活跃应用数量</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>CLS 日志集</p>
    */
    @SerializedName("LogSet")
    @Expose
    private String LogSet;

    /**
    * <p>Metric 数据保存时长（单位：天）</p>
    */
    @SerializedName("MetricDuration")
    @Expose
    private Long MetricDuration;

    /**
    * <p>用户自定义展示标签列表</p>
    */
    @SerializedName("CustomShowTags")
    @Expose
    private String [] CustomShowTags;

    /**
    * <p>业务系统计费模式（1为预付费，0为按量付费）</p>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>业务系统计费模式是否生效</p>
    */
    @SerializedName("PayModeEffective")
    @Expose
    private Boolean PayModeEffective;

    /**
    * <p>响应时间警示线（单位：ms）</p>
    */
    @SerializedName("ResponseDurationWarningThreshold")
    @Expose
    private Long ResponseDurationWarningThreshold;

    /**
    * <p>是否免费（0=否，1=限额免费，2=完全免费），默认0</p>
    */
    @SerializedName("Free")
    @Expose
    private Long Free;

    /**
    * <p>是否 TSF 默认业务系统（0=否，1=是）</p>
    */
    @SerializedName("DefaultTSF")
    @Expose
    private Long DefaultTSF;

    /**
    * <p>是否关联 Dashboard（0=关, 1=开）</p>
    */
    @SerializedName("IsRelatedDashboard")
    @Expose
    private Long IsRelatedDashboard;

    /**
    * <p>关联的 Dashboard ID</p>
    */
    @SerializedName("DashboardTopicID")
    @Expose
    private String DashboardTopicID;

    /**
    * <p>是否开启组件漏洞检测（0=关， 1=开）</p>
    */
    @SerializedName("IsInstrumentationVulnerabilityScan")
    @Expose
    private Long IsInstrumentationVulnerabilityScan;

    /**
    * <p>是否开启 SQL 注入分析（0=关， 1=开）</p>
    */
    @SerializedName("IsSqlInjectionAnalysis")
    @Expose
    private Long IsSqlInjectionAnalysis;

    /**
    * <p>限流原因。{<br>1: 正式版限额;<br>2: 试用版限额;<br>4: 试用版到期;<br>8: 账号欠费<br>}</p>
    */
    @SerializedName("StopReason")
    @Expose
    private Long StopReason;

    /**
    * <p>是否开远程命令执行检测（0=关， 1=开）</p>
    */
    @SerializedName("IsRemoteCommandExecutionAnalysis")
    @Expose
    private Long IsRemoteCommandExecutionAnalysis;

    /**
    * <p>是否开内存马执行检测（0=关， 1=开）</p>
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
    */
    @SerializedName("IsDeleteAnyFileAnalysis")
    @Expose
    private Long IsDeleteAnyFileAnalysis;

    /**
    * <p>是否开启读取任意文件检测（0-关闭，1-开启）</p>
    */
    @SerializedName("IsReadAnyFileAnalysis")
    @Expose
    private Long IsReadAnyFileAnalysis;

    /**
    * <p>是否开启上传任意文件检测（0-关闭，1-开启）</p>
    */
    @SerializedName("IsUploadAnyFileAnalysis")
    @Expose
    private Long IsUploadAnyFileAnalysis;

    /**
    * <p>是否开启包含任意文件检测（0-关闭，1-开启）</p>
    */
    @SerializedName("IsIncludeAnyFileAnalysis")
    @Expose
    private Long IsIncludeAnyFileAnalysis;

    /**
    * <p>是否开启目录遍历检测（0-关闭，1-开启）</p>
    */
    @SerializedName("IsDirectoryTraversalAnalysis")
    @Expose
    private Long IsDirectoryTraversalAnalysis;

    /**
    * <p>是否开启模板引擎注入检测（0-关闭，1-开启）</p>
    */
    @SerializedName("IsTemplateEngineInjectionAnalysis")
    @Expose
    private Long IsTemplateEngineInjectionAnalysis;

    /**
    * <p>是否开启脚本引擎注入检测（0-关闭，1-开启）</p>
    */
    @SerializedName("IsScriptEngineInjectionAnalysis")
    @Expose
    private Long IsScriptEngineInjectionAnalysis;

    /**
    * <p>是否开启表达式注入检测（0-关闭，1-开启）</p>
    */
    @SerializedName("IsExpressionInjectionAnalysis")
    @Expose
    private Long IsExpressionInjectionAnalysis;

    /**
    * <p>是否开启JNDI注入检测（0-关闭，1-开启）</p>
    */
    @SerializedName("IsJNDIInjectionAnalysis")
    @Expose
    private Long IsJNDIInjectionAnalysis;

    /**
    * <p>是否开启JNI注入检测（0-关闭，1-开启）</p>
    */
    @SerializedName("IsJNIInjectionAnalysis")
    @Expose
    private Long IsJNIInjectionAnalysis;

    /**
    * <p>是否开启Webshell后门检测（0-关闭，1-开启）</p>
    */
    @SerializedName("IsWebshellBackdoorAnalysis")
    @Expose
    private Long IsWebshellBackdoorAnalysis;

    /**
    * <p>是否开启反序列化检测（0-关闭，1-开启）</p>
    */
    @SerializedName("IsDeserializationAnalysis")
    @Expose
    private Long IsDeserializationAnalysis;

    /**
    * <p>业务系统鉴权 token</p>
    */
    @SerializedName("Token")
    @Expose
    private String Token;

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
    * <p>spanId的索引key: 当CLS索引类型为键值索引时生效</p>
    */
    @SerializedName("LogSpanIdKey")
    @Expose
    private String LogSpanIdKey;

    /**
     * Get <p>业务系统 ID</p> 
     * @return InstanceId <p>业务系统 ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>业务系统 ID</p>
     * @param InstanceId <p>业务系统 ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>业务系统名</p> 
     * @return Name <p>业务系统名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>业务系统名</p>
     * @param Name <p>业务系统名</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>业务系统描述信息</p> 
     * @return Description <p>业务系统描述信息</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>业务系统描述信息</p>
     * @param Description <p>业务系统描述信息</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>业务系统状态。{<br>1: 初始化中; 2: 运行中; 4: 限流}</p> 
     * @return Status <p>业务系统状态。{<br>1: 初始化中; 2: 运行中; 4: 限流}</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>业务系统状态。{<br>1: 初始化中; 2: 运行中; 4: 限流}</p>
     * @param Status <p>业务系统状态。{<br>1: 初始化中; 2: 运行中; 4: 限流}</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>业务系统所属地域</p> 
     * @return Region <p>业务系统所属地域</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>业务系统所属地域</p>
     * @param Region <p>业务系统所属地域</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>业务系统 Tag 列表</p> 
     * @return Tags <p>业务系统 Tag 列表</p>
     */
    public ApmTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>业务系统 Tag 列表</p>
     * @param Tags <p>业务系统 Tag 列表</p>
     */
    public void setTags(ApmTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>AppID 信息</p> 
     * @return AppId <p>AppID 信息</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>AppID 信息</p>
     * @param AppId <p>AppID 信息</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>创建人 Uin</p> 
     * @return CreateUin <p>创建人 Uin</p>
     */
    public String getCreateUin() {
        return this.CreateUin;
    }

    /**
     * Set <p>创建人 Uin</p>
     * @param CreateUin <p>创建人 Uin</p>
     */
    public void setCreateUin(String CreateUin) {
        this.CreateUin = CreateUin;
    }

    /**
     * Get <p>存储使用量(单位：MB)</p> 
     * @return AmountOfUsedStorage <p>存储使用量(单位：MB)</p>
     */
    public Float getAmountOfUsedStorage() {
        return this.AmountOfUsedStorage;
    }

    /**
     * Set <p>存储使用量(单位：MB)</p>
     * @param AmountOfUsedStorage <p>存储使用量(单位：MB)</p>
     */
    public void setAmountOfUsedStorage(Float AmountOfUsedStorage) {
        this.AmountOfUsedStorage = AmountOfUsedStorage;
    }

    /**
     * Get <p>该业务系统服务端应用数量</p> 
     * @return ServiceCount <p>该业务系统服务端应用数量</p>
     */
    public Long getServiceCount() {
        return this.ServiceCount;
    }

    /**
     * Set <p>该业务系统服务端应用数量</p>
     * @param ServiceCount <p>该业务系统服务端应用数量</p>
     */
    public void setServiceCount(Long ServiceCount) {
        this.ServiceCount = ServiceCount;
    }

    /**
     * Get <p>日均上报 Span 数</p> 
     * @return CountOfReportSpanPerDay <p>日均上报 Span 数</p>
     */
    public Long getCountOfReportSpanPerDay() {
        return this.CountOfReportSpanPerDay;
    }

    /**
     * Set <p>日均上报 Span 数</p>
     * @param CountOfReportSpanPerDay <p>日均上报 Span 数</p>
     */
    public void setCountOfReportSpanPerDay(Long CountOfReportSpanPerDay) {
        this.CountOfReportSpanPerDay = CountOfReportSpanPerDay;
    }

    /**
     * Get <p>Trace 数据保存时长（单位：天）</p> 
     * @return TraceDuration <p>Trace 数据保存时长（单位：天）</p>
     */
    public Long getTraceDuration() {
        return this.TraceDuration;
    }

    /**
     * Set <p>Trace 数据保存时长（单位：天）</p>
     * @param TraceDuration <p>Trace 数据保存时长（单位：天）</p>
     */
    public void setTraceDuration(Long TraceDuration) {
        this.TraceDuration = TraceDuration;
    }

    /**
     * Get <p>业务系统上报额度</p> 
     * @return SpanDailyCounters <p>业务系统上报额度</p>
     */
    public Long getSpanDailyCounters() {
        return this.SpanDailyCounters;
    }

    /**
     * Set <p>业务系统上报额度</p>
     * @param SpanDailyCounters <p>业务系统上报额度</p>
     */
    public void setSpanDailyCounters(Long SpanDailyCounters) {
        this.SpanDailyCounters = SpanDailyCounters;
    }

    /**
     * Get <p>业务系统是否已开通计费（0=未开通，1=已开通）</p> 
     * @return BillingInstance <p>业务系统是否已开通计费（0=未开通，1=已开通）</p>
     */
    public Long getBillingInstance() {
        return this.BillingInstance;
    }

    /**
     * Set <p>业务系统是否已开通计费（0=未开通，1=已开通）</p>
     * @param BillingInstance <p>业务系统是否已开通计费（0=未开通，1=已开通）</p>
     */
    public void setBillingInstance(Long BillingInstance) {
        this.BillingInstance = BillingInstance;
    }

    /**
     * Get <p>错误警示线（单位：%）</p> 
     * @return ErrRateThreshold <p>错误警示线（单位：%）</p>
     */
    public Long getErrRateThreshold() {
        return this.ErrRateThreshold;
    }

    /**
     * Set <p>错误警示线（单位：%）</p>
     * @param ErrRateThreshold <p>错误警示线（单位：%）</p>
     */
    public void setErrRateThreshold(Long ErrRateThreshold) {
        this.ErrRateThreshold = ErrRateThreshold;
    }

    /**
     * Get <p>采样率（单位：%）</p> 
     * @return SampleRate <p>采样率（单位：%）</p>
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set <p>采样率（单位：%）</p>
     * @param SampleRate <p>采样率（单位：%）</p>
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get <p>是否开启错误采样（0=关, 1=开）</p> 
     * @return ErrorSample <p>是否开启错误采样（0=关, 1=开）</p>
     */
    public Long getErrorSample() {
        return this.ErrorSample;
    }

    /**
     * Set <p>是否开启错误采样（0=关, 1=开）</p>
     * @param ErrorSample <p>是否开启错误采样（0=关, 1=开）</p>
     */
    public void setErrorSample(Long ErrorSample) {
        this.ErrorSample = ErrorSample;
    }

    /**
     * Get <p>采样慢调用保存阈值（单位：ms）</p> 
     * @return SlowRequestSavedThreshold <p>采样慢调用保存阈值（单位：ms）</p>
     */
    public Long getSlowRequestSavedThreshold() {
        return this.SlowRequestSavedThreshold;
    }

    /**
     * Set <p>采样慢调用保存阈值（单位：ms）</p>
     * @param SlowRequestSavedThreshold <p>采样慢调用保存阈值（单位：ms）</p>
     */
    public void setSlowRequestSavedThreshold(Long SlowRequestSavedThreshold) {
        this.SlowRequestSavedThreshold = SlowRequestSavedThreshold;
    }

    /**
     * Get <p>CLS 日志所在地域</p> 
     * @return LogRegion <p>CLS 日志所在地域</p>
     */
    public String getLogRegion() {
        return this.LogRegion;
    }

    /**
     * Set <p>CLS 日志所在地域</p>
     * @param LogRegion <p>CLS 日志所在地域</p>
     */
    public void setLogRegion(String LogRegion) {
        this.LogRegion = LogRegion;
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
     * Get <p>日志功能开关（0=关， 1=开）</p> 
     * @return IsRelatedLog <p>日志功能开关（0=关， 1=开）</p>
     */
    public Long getIsRelatedLog() {
        return this.IsRelatedLog;
    }

    /**
     * Set <p>日志功能开关（0=关， 1=开）</p>
     * @param IsRelatedLog <p>日志功能开关（0=关， 1=开）</p>
     */
    public void setIsRelatedLog(Long IsRelatedLog) {
        this.IsRelatedLog = IsRelatedLog;
    }

    /**
     * Get <p>日志主题 ID</p> 
     * @return LogTopicID <p>日志主题 ID</p>
     */
    public String getLogTopicID() {
        return this.LogTopicID;
    }

    /**
     * Set <p>日志主题 ID</p>
     * @param LogTopicID <p>日志主题 ID</p>
     */
    public void setLogTopicID(String LogTopicID) {
        this.LogTopicID = LogTopicID;
    }

    /**
     * Get <p>该业务系统客户端应用数量</p> 
     * @return ClientCount <p>该业务系统客户端应用数量</p>
     */
    public Long getClientCount() {
        return this.ClientCount;
    }

    /**
     * Set <p>该业务系统客户端应用数量</p>
     * @param ClientCount <p>该业务系统客户端应用数量</p>
     */
    public void setClientCount(Long ClientCount) {
        this.ClientCount = ClientCount;
    }

    /**
     * Get <p>该业务系统最近2天活跃应用数量</p> 
     * @return TotalCount <p>该业务系统最近2天活跃应用数量</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>该业务系统最近2天活跃应用数量</p>
     * @param TotalCount <p>该业务系统最近2天活跃应用数量</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>CLS 日志集</p> 
     * @return LogSet <p>CLS 日志集</p>
     */
    public String getLogSet() {
        return this.LogSet;
    }

    /**
     * Set <p>CLS 日志集</p>
     * @param LogSet <p>CLS 日志集</p>
     */
    public void setLogSet(String LogSet) {
        this.LogSet = LogSet;
    }

    /**
     * Get <p>Metric 数据保存时长（单位：天）</p> 
     * @return MetricDuration <p>Metric 数据保存时长（单位：天）</p>
     */
    public Long getMetricDuration() {
        return this.MetricDuration;
    }

    /**
     * Set <p>Metric 数据保存时长（单位：天）</p>
     * @param MetricDuration <p>Metric 数据保存时长（单位：天）</p>
     */
    public void setMetricDuration(Long MetricDuration) {
        this.MetricDuration = MetricDuration;
    }

    /**
     * Get <p>用户自定义展示标签列表</p> 
     * @return CustomShowTags <p>用户自定义展示标签列表</p>
     */
    public String [] getCustomShowTags() {
        return this.CustomShowTags;
    }

    /**
     * Set <p>用户自定义展示标签列表</p>
     * @param CustomShowTags <p>用户自定义展示标签列表</p>
     */
    public void setCustomShowTags(String [] CustomShowTags) {
        this.CustomShowTags = CustomShowTags;
    }

    /**
     * Get <p>业务系统计费模式（1为预付费，0为按量付费）</p> 
     * @return PayMode <p>业务系统计费模式（1为预付费，0为按量付费）</p>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>业务系统计费模式（1为预付费，0为按量付费）</p>
     * @param PayMode <p>业务系统计费模式（1为预付费，0为按量付费）</p>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>业务系统计费模式是否生效</p> 
     * @return PayModeEffective <p>业务系统计费模式是否生效</p>
     */
    public Boolean getPayModeEffective() {
        return this.PayModeEffective;
    }

    /**
     * Set <p>业务系统计费模式是否生效</p>
     * @param PayModeEffective <p>业务系统计费模式是否生效</p>
     */
    public void setPayModeEffective(Boolean PayModeEffective) {
        this.PayModeEffective = PayModeEffective;
    }

    /**
     * Get <p>响应时间警示线（单位：ms）</p> 
     * @return ResponseDurationWarningThreshold <p>响应时间警示线（单位：ms）</p>
     */
    public Long getResponseDurationWarningThreshold() {
        return this.ResponseDurationWarningThreshold;
    }

    /**
     * Set <p>响应时间警示线（单位：ms）</p>
     * @param ResponseDurationWarningThreshold <p>响应时间警示线（单位：ms）</p>
     */
    public void setResponseDurationWarningThreshold(Long ResponseDurationWarningThreshold) {
        this.ResponseDurationWarningThreshold = ResponseDurationWarningThreshold;
    }

    /**
     * Get <p>是否免费（0=否，1=限额免费，2=完全免费），默认0</p> 
     * @return Free <p>是否免费（0=否，1=限额免费，2=完全免费），默认0</p>
     */
    public Long getFree() {
        return this.Free;
    }

    /**
     * Set <p>是否免费（0=否，1=限额免费，2=完全免费），默认0</p>
     * @param Free <p>是否免费（0=否，1=限额免费，2=完全免费），默认0</p>
     */
    public void setFree(Long Free) {
        this.Free = Free;
    }

    /**
     * Get <p>是否 TSF 默认业务系统（0=否，1=是）</p> 
     * @return DefaultTSF <p>是否 TSF 默认业务系统（0=否，1=是）</p>
     */
    public Long getDefaultTSF() {
        return this.DefaultTSF;
    }

    /**
     * Set <p>是否 TSF 默认业务系统（0=否，1=是）</p>
     * @param DefaultTSF <p>是否 TSF 默认业务系统（0=否，1=是）</p>
     */
    public void setDefaultTSF(Long DefaultTSF) {
        this.DefaultTSF = DefaultTSF;
    }

    /**
     * Get <p>是否关联 Dashboard（0=关, 1=开）</p> 
     * @return IsRelatedDashboard <p>是否关联 Dashboard（0=关, 1=开）</p>
     */
    public Long getIsRelatedDashboard() {
        return this.IsRelatedDashboard;
    }

    /**
     * Set <p>是否关联 Dashboard（0=关, 1=开）</p>
     * @param IsRelatedDashboard <p>是否关联 Dashboard（0=关, 1=开）</p>
     */
    public void setIsRelatedDashboard(Long IsRelatedDashboard) {
        this.IsRelatedDashboard = IsRelatedDashboard;
    }

    /**
     * Get <p>关联的 Dashboard ID</p> 
     * @return DashboardTopicID <p>关联的 Dashboard ID</p>
     */
    public String getDashboardTopicID() {
        return this.DashboardTopicID;
    }

    /**
     * Set <p>关联的 Dashboard ID</p>
     * @param DashboardTopicID <p>关联的 Dashboard ID</p>
     */
    public void setDashboardTopicID(String DashboardTopicID) {
        this.DashboardTopicID = DashboardTopicID;
    }

    /**
     * Get <p>是否开启组件漏洞检测（0=关， 1=开）</p> 
     * @return IsInstrumentationVulnerabilityScan <p>是否开启组件漏洞检测（0=关， 1=开）</p>
     */
    public Long getIsInstrumentationVulnerabilityScan() {
        return this.IsInstrumentationVulnerabilityScan;
    }

    /**
     * Set <p>是否开启组件漏洞检测（0=关， 1=开）</p>
     * @param IsInstrumentationVulnerabilityScan <p>是否开启组件漏洞检测（0=关， 1=开）</p>
     */
    public void setIsInstrumentationVulnerabilityScan(Long IsInstrumentationVulnerabilityScan) {
        this.IsInstrumentationVulnerabilityScan = IsInstrumentationVulnerabilityScan;
    }

    /**
     * Get <p>是否开启 SQL 注入分析（0=关， 1=开）</p> 
     * @return IsSqlInjectionAnalysis <p>是否开启 SQL 注入分析（0=关， 1=开）</p>
     */
    public Long getIsSqlInjectionAnalysis() {
        return this.IsSqlInjectionAnalysis;
    }

    /**
     * Set <p>是否开启 SQL 注入分析（0=关， 1=开）</p>
     * @param IsSqlInjectionAnalysis <p>是否开启 SQL 注入分析（0=关， 1=开）</p>
     */
    public void setIsSqlInjectionAnalysis(Long IsSqlInjectionAnalysis) {
        this.IsSqlInjectionAnalysis = IsSqlInjectionAnalysis;
    }

    /**
     * Get <p>限流原因。{<br>1: 正式版限额;<br>2: 试用版限额;<br>4: 试用版到期;<br>8: 账号欠费<br>}</p> 
     * @return StopReason <p>限流原因。{<br>1: 正式版限额;<br>2: 试用版限额;<br>4: 试用版到期;<br>8: 账号欠费<br>}</p>
     */
    public Long getStopReason() {
        return this.StopReason;
    }

    /**
     * Set <p>限流原因。{<br>1: 正式版限额;<br>2: 试用版限额;<br>4: 试用版到期;<br>8: 账号欠费<br>}</p>
     * @param StopReason <p>限流原因。{<br>1: 正式版限额;<br>2: 试用版限额;<br>4: 试用版到期;<br>8: 账号欠费<br>}</p>
     */
    public void setStopReason(Long StopReason) {
        this.StopReason = StopReason;
    }

    /**
     * Get <p>是否开远程命令执行检测（0=关， 1=开）</p> 
     * @return IsRemoteCommandExecutionAnalysis <p>是否开远程命令执行检测（0=关， 1=开）</p>
     */
    public Long getIsRemoteCommandExecutionAnalysis() {
        return this.IsRemoteCommandExecutionAnalysis;
    }

    /**
     * Set <p>是否开远程命令执行检测（0=关， 1=开）</p>
     * @param IsRemoteCommandExecutionAnalysis <p>是否开远程命令执行检测（0=关， 1=开）</p>
     */
    public void setIsRemoteCommandExecutionAnalysis(Long IsRemoteCommandExecutionAnalysis) {
        this.IsRemoteCommandExecutionAnalysis = IsRemoteCommandExecutionAnalysis;
    }

    /**
     * Get <p>是否开内存马执行检测（0=关， 1=开）</p> 
     * @return IsMemoryHijackingAnalysis <p>是否开内存马执行检测（0=关， 1=开）</p>
     */
    public Long getIsMemoryHijackingAnalysis() {
        return this.IsMemoryHijackingAnalysis;
    }

    /**
     * Set <p>是否开内存马执行检测（0=关， 1=开）</p>
     * @param IsMemoryHijackingAnalysis <p>是否开内存马执行检测（0=关， 1=开）</p>
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
     * @return IsDeleteAnyFileAnalysis <p>是否开启删除任意文件检测（0-关闭，1-开启）</p>
     */
    public Long getIsDeleteAnyFileAnalysis() {
        return this.IsDeleteAnyFileAnalysis;
    }

    /**
     * Set <p>是否开启删除任意文件检测（0-关闭，1-开启）</p>
     * @param IsDeleteAnyFileAnalysis <p>是否开启删除任意文件检测（0-关闭，1-开启）</p>
     */
    public void setIsDeleteAnyFileAnalysis(Long IsDeleteAnyFileAnalysis) {
        this.IsDeleteAnyFileAnalysis = IsDeleteAnyFileAnalysis;
    }

    /**
     * Get <p>是否开启读取任意文件检测（0-关闭，1-开启）</p> 
     * @return IsReadAnyFileAnalysis <p>是否开启读取任意文件检测（0-关闭，1-开启）</p>
     */
    public Long getIsReadAnyFileAnalysis() {
        return this.IsReadAnyFileAnalysis;
    }

    /**
     * Set <p>是否开启读取任意文件检测（0-关闭，1-开启）</p>
     * @param IsReadAnyFileAnalysis <p>是否开启读取任意文件检测（0-关闭，1-开启）</p>
     */
    public void setIsReadAnyFileAnalysis(Long IsReadAnyFileAnalysis) {
        this.IsReadAnyFileAnalysis = IsReadAnyFileAnalysis;
    }

    /**
     * Get <p>是否开启上传任意文件检测（0-关闭，1-开启）</p> 
     * @return IsUploadAnyFileAnalysis <p>是否开启上传任意文件检测（0-关闭，1-开启）</p>
     */
    public Long getIsUploadAnyFileAnalysis() {
        return this.IsUploadAnyFileAnalysis;
    }

    /**
     * Set <p>是否开启上传任意文件检测（0-关闭，1-开启）</p>
     * @param IsUploadAnyFileAnalysis <p>是否开启上传任意文件检测（0-关闭，1-开启）</p>
     */
    public void setIsUploadAnyFileAnalysis(Long IsUploadAnyFileAnalysis) {
        this.IsUploadAnyFileAnalysis = IsUploadAnyFileAnalysis;
    }

    /**
     * Get <p>是否开启包含任意文件检测（0-关闭，1-开启）</p> 
     * @return IsIncludeAnyFileAnalysis <p>是否开启包含任意文件检测（0-关闭，1-开启）</p>
     */
    public Long getIsIncludeAnyFileAnalysis() {
        return this.IsIncludeAnyFileAnalysis;
    }

    /**
     * Set <p>是否开启包含任意文件检测（0-关闭，1-开启）</p>
     * @param IsIncludeAnyFileAnalysis <p>是否开启包含任意文件检测（0-关闭，1-开启）</p>
     */
    public void setIsIncludeAnyFileAnalysis(Long IsIncludeAnyFileAnalysis) {
        this.IsIncludeAnyFileAnalysis = IsIncludeAnyFileAnalysis;
    }

    /**
     * Get <p>是否开启目录遍历检测（0-关闭，1-开启）</p> 
     * @return IsDirectoryTraversalAnalysis <p>是否开启目录遍历检测（0-关闭，1-开启）</p>
     */
    public Long getIsDirectoryTraversalAnalysis() {
        return this.IsDirectoryTraversalAnalysis;
    }

    /**
     * Set <p>是否开启目录遍历检测（0-关闭，1-开启）</p>
     * @param IsDirectoryTraversalAnalysis <p>是否开启目录遍历检测（0-关闭，1-开启）</p>
     */
    public void setIsDirectoryTraversalAnalysis(Long IsDirectoryTraversalAnalysis) {
        this.IsDirectoryTraversalAnalysis = IsDirectoryTraversalAnalysis;
    }

    /**
     * Get <p>是否开启模板引擎注入检测（0-关闭，1-开启）</p> 
     * @return IsTemplateEngineInjectionAnalysis <p>是否开启模板引擎注入检测（0-关闭，1-开启）</p>
     */
    public Long getIsTemplateEngineInjectionAnalysis() {
        return this.IsTemplateEngineInjectionAnalysis;
    }

    /**
     * Set <p>是否开启模板引擎注入检测（0-关闭，1-开启）</p>
     * @param IsTemplateEngineInjectionAnalysis <p>是否开启模板引擎注入检测（0-关闭，1-开启）</p>
     */
    public void setIsTemplateEngineInjectionAnalysis(Long IsTemplateEngineInjectionAnalysis) {
        this.IsTemplateEngineInjectionAnalysis = IsTemplateEngineInjectionAnalysis;
    }

    /**
     * Get <p>是否开启脚本引擎注入检测（0-关闭，1-开启）</p> 
     * @return IsScriptEngineInjectionAnalysis <p>是否开启脚本引擎注入检测（0-关闭，1-开启）</p>
     */
    public Long getIsScriptEngineInjectionAnalysis() {
        return this.IsScriptEngineInjectionAnalysis;
    }

    /**
     * Set <p>是否开启脚本引擎注入检测（0-关闭，1-开启）</p>
     * @param IsScriptEngineInjectionAnalysis <p>是否开启脚本引擎注入检测（0-关闭，1-开启）</p>
     */
    public void setIsScriptEngineInjectionAnalysis(Long IsScriptEngineInjectionAnalysis) {
        this.IsScriptEngineInjectionAnalysis = IsScriptEngineInjectionAnalysis;
    }

    /**
     * Get <p>是否开启表达式注入检测（0-关闭，1-开启）</p> 
     * @return IsExpressionInjectionAnalysis <p>是否开启表达式注入检测（0-关闭，1-开启）</p>
     */
    public Long getIsExpressionInjectionAnalysis() {
        return this.IsExpressionInjectionAnalysis;
    }

    /**
     * Set <p>是否开启表达式注入检测（0-关闭，1-开启）</p>
     * @param IsExpressionInjectionAnalysis <p>是否开启表达式注入检测（0-关闭，1-开启）</p>
     */
    public void setIsExpressionInjectionAnalysis(Long IsExpressionInjectionAnalysis) {
        this.IsExpressionInjectionAnalysis = IsExpressionInjectionAnalysis;
    }

    /**
     * Get <p>是否开启JNDI注入检测（0-关闭，1-开启）</p> 
     * @return IsJNDIInjectionAnalysis <p>是否开启JNDI注入检测（0-关闭，1-开启）</p>
     */
    public Long getIsJNDIInjectionAnalysis() {
        return this.IsJNDIInjectionAnalysis;
    }

    /**
     * Set <p>是否开启JNDI注入检测（0-关闭，1-开启）</p>
     * @param IsJNDIInjectionAnalysis <p>是否开启JNDI注入检测（0-关闭，1-开启）</p>
     */
    public void setIsJNDIInjectionAnalysis(Long IsJNDIInjectionAnalysis) {
        this.IsJNDIInjectionAnalysis = IsJNDIInjectionAnalysis;
    }

    /**
     * Get <p>是否开启JNI注入检测（0-关闭，1-开启）</p> 
     * @return IsJNIInjectionAnalysis <p>是否开启JNI注入检测（0-关闭，1-开启）</p>
     */
    public Long getIsJNIInjectionAnalysis() {
        return this.IsJNIInjectionAnalysis;
    }

    /**
     * Set <p>是否开启JNI注入检测（0-关闭，1-开启）</p>
     * @param IsJNIInjectionAnalysis <p>是否开启JNI注入检测（0-关闭，1-开启）</p>
     */
    public void setIsJNIInjectionAnalysis(Long IsJNIInjectionAnalysis) {
        this.IsJNIInjectionAnalysis = IsJNIInjectionAnalysis;
    }

    /**
     * Get <p>是否开启Webshell后门检测（0-关闭，1-开启）</p> 
     * @return IsWebshellBackdoorAnalysis <p>是否开启Webshell后门检测（0-关闭，1-开启）</p>
     */
    public Long getIsWebshellBackdoorAnalysis() {
        return this.IsWebshellBackdoorAnalysis;
    }

    /**
     * Set <p>是否开启Webshell后门检测（0-关闭，1-开启）</p>
     * @param IsWebshellBackdoorAnalysis <p>是否开启Webshell后门检测（0-关闭，1-开启）</p>
     */
    public void setIsWebshellBackdoorAnalysis(Long IsWebshellBackdoorAnalysis) {
        this.IsWebshellBackdoorAnalysis = IsWebshellBackdoorAnalysis;
    }

    /**
     * Get <p>是否开启反序列化检测（0-关闭，1-开启）</p> 
     * @return IsDeserializationAnalysis <p>是否开启反序列化检测（0-关闭，1-开启）</p>
     */
    public Long getIsDeserializationAnalysis() {
        return this.IsDeserializationAnalysis;
    }

    /**
     * Set <p>是否开启反序列化检测（0-关闭，1-开启）</p>
     * @param IsDeserializationAnalysis <p>是否开启反序列化检测（0-关闭，1-开启）</p>
     */
    public void setIsDeserializationAnalysis(Long IsDeserializationAnalysis) {
        this.IsDeserializationAnalysis = IsDeserializationAnalysis;
    }

    /**
     * Get <p>业务系统鉴权 token</p> 
     * @return Token <p>业务系统鉴权 token</p>
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set <p>业务系统鉴权 token</p>
     * @param Token <p>业务系统鉴权 token</p>
     */
    public void setToken(String Token) {
        this.Token = Token;
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

    public ApmInstanceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApmInstanceDetail(ApmInstanceDetail source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Tags != null) {
            this.Tags = new ApmTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new ApmTag(source.Tags[i]);
            }
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.CreateUin != null) {
            this.CreateUin = new String(source.CreateUin);
        }
        if (source.AmountOfUsedStorage != null) {
            this.AmountOfUsedStorage = new Float(source.AmountOfUsedStorage);
        }
        if (source.ServiceCount != null) {
            this.ServiceCount = new Long(source.ServiceCount);
        }
        if (source.CountOfReportSpanPerDay != null) {
            this.CountOfReportSpanPerDay = new Long(source.CountOfReportSpanPerDay);
        }
        if (source.TraceDuration != null) {
            this.TraceDuration = new Long(source.TraceDuration);
        }
        if (source.SpanDailyCounters != null) {
            this.SpanDailyCounters = new Long(source.SpanDailyCounters);
        }
        if (source.BillingInstance != null) {
            this.BillingInstance = new Long(source.BillingInstance);
        }
        if (source.ErrRateThreshold != null) {
            this.ErrRateThreshold = new Long(source.ErrRateThreshold);
        }
        if (source.SampleRate != null) {
            this.SampleRate = new Long(source.SampleRate);
        }
        if (source.ErrorSample != null) {
            this.ErrorSample = new Long(source.ErrorSample);
        }
        if (source.SlowRequestSavedThreshold != null) {
            this.SlowRequestSavedThreshold = new Long(source.SlowRequestSavedThreshold);
        }
        if (source.LogRegion != null) {
            this.LogRegion = new String(source.LogRegion);
        }
        if (source.LogSource != null) {
            this.LogSource = new String(source.LogSource);
        }
        if (source.IsRelatedLog != null) {
            this.IsRelatedLog = new Long(source.IsRelatedLog);
        }
        if (source.LogTopicID != null) {
            this.LogTopicID = new String(source.LogTopicID);
        }
        if (source.ClientCount != null) {
            this.ClientCount = new Long(source.ClientCount);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.LogSet != null) {
            this.LogSet = new String(source.LogSet);
        }
        if (source.MetricDuration != null) {
            this.MetricDuration = new Long(source.MetricDuration);
        }
        if (source.CustomShowTags != null) {
            this.CustomShowTags = new String[source.CustomShowTags.length];
            for (int i = 0; i < source.CustomShowTags.length; i++) {
                this.CustomShowTags[i] = new String(source.CustomShowTags[i]);
            }
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.PayModeEffective != null) {
            this.PayModeEffective = new Boolean(source.PayModeEffective);
        }
        if (source.ResponseDurationWarningThreshold != null) {
            this.ResponseDurationWarningThreshold = new Long(source.ResponseDurationWarningThreshold);
        }
        if (source.Free != null) {
            this.Free = new Long(source.Free);
        }
        if (source.DefaultTSF != null) {
            this.DefaultTSF = new Long(source.DefaultTSF);
        }
        if (source.IsRelatedDashboard != null) {
            this.IsRelatedDashboard = new Long(source.IsRelatedDashboard);
        }
        if (source.DashboardTopicID != null) {
            this.DashboardTopicID = new String(source.DashboardTopicID);
        }
        if (source.IsInstrumentationVulnerabilityScan != null) {
            this.IsInstrumentationVulnerabilityScan = new Long(source.IsInstrumentationVulnerabilityScan);
        }
        if (source.IsSqlInjectionAnalysis != null) {
            this.IsSqlInjectionAnalysis = new Long(source.IsSqlInjectionAnalysis);
        }
        if (source.StopReason != null) {
            this.StopReason = new Long(source.StopReason);
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
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
        if (source.UrlLongSegmentThreshold != null) {
            this.UrlLongSegmentThreshold = new Long(source.UrlLongSegmentThreshold);
        }
        if (source.UrlNumberSegmentThreshold != null) {
            this.UrlNumberSegmentThreshold = new Long(source.UrlNumberSegmentThreshold);
        }
        if (source.LogSpanIdKey != null) {
            this.LogSpanIdKey = new String(source.LogSpanIdKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "CreateUin", this.CreateUin);
        this.setParamSimple(map, prefix + "AmountOfUsedStorage", this.AmountOfUsedStorage);
        this.setParamSimple(map, prefix + "ServiceCount", this.ServiceCount);
        this.setParamSimple(map, prefix + "CountOfReportSpanPerDay", this.CountOfReportSpanPerDay);
        this.setParamSimple(map, prefix + "TraceDuration", this.TraceDuration);
        this.setParamSimple(map, prefix + "SpanDailyCounters", this.SpanDailyCounters);
        this.setParamSimple(map, prefix + "BillingInstance", this.BillingInstance);
        this.setParamSimple(map, prefix + "ErrRateThreshold", this.ErrRateThreshold);
        this.setParamSimple(map, prefix + "SampleRate", this.SampleRate);
        this.setParamSimple(map, prefix + "ErrorSample", this.ErrorSample);
        this.setParamSimple(map, prefix + "SlowRequestSavedThreshold", this.SlowRequestSavedThreshold);
        this.setParamSimple(map, prefix + "LogRegion", this.LogRegion);
        this.setParamSimple(map, prefix + "LogSource", this.LogSource);
        this.setParamSimple(map, prefix + "IsRelatedLog", this.IsRelatedLog);
        this.setParamSimple(map, prefix + "LogTopicID", this.LogTopicID);
        this.setParamSimple(map, prefix + "ClientCount", this.ClientCount);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "LogSet", this.LogSet);
        this.setParamSimple(map, prefix + "MetricDuration", this.MetricDuration);
        this.setParamArraySimple(map, prefix + "CustomShowTags.", this.CustomShowTags);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "PayModeEffective", this.PayModeEffective);
        this.setParamSimple(map, prefix + "ResponseDurationWarningThreshold", this.ResponseDurationWarningThreshold);
        this.setParamSimple(map, prefix + "Free", this.Free);
        this.setParamSimple(map, prefix + "DefaultTSF", this.DefaultTSF);
        this.setParamSimple(map, prefix + "IsRelatedDashboard", this.IsRelatedDashboard);
        this.setParamSimple(map, prefix + "DashboardTopicID", this.DashboardTopicID);
        this.setParamSimple(map, prefix + "IsInstrumentationVulnerabilityScan", this.IsInstrumentationVulnerabilityScan);
        this.setParamSimple(map, prefix + "IsSqlInjectionAnalysis", this.IsSqlInjectionAnalysis);
        this.setParamSimple(map, prefix + "StopReason", this.StopReason);
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
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "UrlLongSegmentThreshold", this.UrlLongSegmentThreshold);
        this.setParamSimple(map, prefix + "UrlNumberSegmentThreshold", this.UrlNumberSegmentThreshold);
        this.setParamSimple(map, prefix + "LogSpanIdKey", this.LogSpanIdKey);

    }
}

