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
    * 业务系统 ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 业务系统名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 业务系统描述信息
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 业务系统状态。{
1: 初始化中; 2: 运行中; 4: 限流}
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 业务系统所属地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 业务系统 Tag 列表
    */
    @SerializedName("Tags")
    @Expose
    private ApmTag [] Tags;

    /**
    * AppID 信息
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 创建人 Uin
    */
    @SerializedName("CreateUin")
    @Expose
    private String CreateUin;

    /**
    * 存储使用量(单位：MB)
    */
    @SerializedName("AmountOfUsedStorage")
    @Expose
    private Float AmountOfUsedStorage;

    /**
    * 该业务系统服务端应用数量
    */
    @SerializedName("ServiceCount")
    @Expose
    private Long ServiceCount;

    /**
    * 日均上报 Span 数
    */
    @SerializedName("CountOfReportSpanPerDay")
    @Expose
    private Long CountOfReportSpanPerDay;

    /**
    * Trace 数据保存时长（单位：天）
    */
    @SerializedName("TraceDuration")
    @Expose
    private Long TraceDuration;

    /**
    * 业务系统上报额度
    */
    @SerializedName("SpanDailyCounters")
    @Expose
    private Long SpanDailyCounters;

    /**
    * 业务系统是否已开通计费（0=未开通，1=已开通）
    */
    @SerializedName("BillingInstance")
    @Expose
    private Long BillingInstance;

    /**
    * 错误警示线（单位：%）
    */
    @SerializedName("ErrRateThreshold")
    @Expose
    private Long ErrRateThreshold;

    /**
    * 采样率（单位：%）
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    * 是否开启错误采样（0=关, 1=开）
    */
    @SerializedName("ErrorSample")
    @Expose
    private Long ErrorSample;

    /**
    * 采样慢调用保存阈值（单位：ms）
    */
    @SerializedName("SlowRequestSavedThreshold")
    @Expose
    private Long SlowRequestSavedThreshold;

    /**
    * CLS 日志所在地域
    */
    @SerializedName("LogRegion")
    @Expose
    private String LogRegion;

    /**
    * 日志源
    */
    @SerializedName("LogSource")
    @Expose
    private String LogSource;

    /**
    * 日志功能开关（0=关， 1=开）
    */
    @SerializedName("IsRelatedLog")
    @Expose
    private Long IsRelatedLog;

    /**
    * 日志主题 ID
    */
    @SerializedName("LogTopicID")
    @Expose
    private String LogTopicID;

    /**
    * 该业务系统客户端应用数量
    */
    @SerializedName("ClientCount")
    @Expose
    private Long ClientCount;

    /**
    * 该业务系统最近2天活跃应用数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * CLS 日志集
    */
    @SerializedName("LogSet")
    @Expose
    private String LogSet;

    /**
    * Metric 数据保存时长（单位：天）
    */
    @SerializedName("MetricDuration")
    @Expose
    private Long MetricDuration;

    /**
    * 用户自定义展示标签列表
    */
    @SerializedName("CustomShowTags")
    @Expose
    private String [] CustomShowTags;

    /**
    * 业务系统计费模式（1为预付费，0为按量付费）
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 业务系统计费模式是否生效
    */
    @SerializedName("PayModeEffective")
    @Expose
    private Boolean PayModeEffective;

    /**
    * 响应时间警示线（单位：ms）
    */
    @SerializedName("ResponseDurationWarningThreshold")
    @Expose
    private Long ResponseDurationWarningThreshold;

    /**
    * 是否免费（0=否，1=限额免费，2=完全免费），默认0
    */
    @SerializedName("Free")
    @Expose
    private Long Free;

    /**
    * 是否 TSF 默认业务系统（0=否，1=是）
    */
    @SerializedName("DefaultTSF")
    @Expose
    private Long DefaultTSF;

    /**
    * 是否关联 Dashboard（0=关, 1=开）
    */
    @SerializedName("IsRelatedDashboard")
    @Expose
    private Long IsRelatedDashboard;

    /**
    * 关联的 Dashboard ID
    */
    @SerializedName("DashboardTopicID")
    @Expose
    private String DashboardTopicID;

    /**
    * 是否开启组件漏洞检测（0=关， 1=开）
    */
    @SerializedName("IsInstrumentationVulnerabilityScan")
    @Expose
    private Long IsInstrumentationVulnerabilityScan;

    /**
    * 是否开启 SQL 注入分析（0=关， 1=开）
    */
    @SerializedName("IsSqlInjectionAnalysis")
    @Expose
    private Long IsSqlInjectionAnalysis;

    /**
    * 限流原因。{
1: 正式版限额;
2: 试用版限额;
4: 试用版到期;
8: 账号欠费
}
    */
    @SerializedName("StopReason")
    @Expose
    private Long StopReason;

    /**
    * 是否开远程命令执行检测（0=关， 1=开）
    */
    @SerializedName("IsRemoteCommandExecutionAnalysis")
    @Expose
    private Long IsRemoteCommandExecutionAnalysis;

    /**
    * 是否开内存马执行检测（0=关， 1=开）
    */
    @SerializedName("IsMemoryHijackingAnalysis")
    @Expose
    private Long IsMemoryHijackingAnalysis;

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
    * 业务系统鉴权 token
    */
    @SerializedName("Token")
    @Expose
    private String Token;

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
     * Get 业务系统名 
     * @return Name 业务系统名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 业务系统名
     * @param Name 业务系统名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 业务系统描述信息 
     * @return Description 业务系统描述信息
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 业务系统描述信息
     * @param Description 业务系统描述信息
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 业务系统状态。{
1: 初始化中; 2: 运行中; 4: 限流} 
     * @return Status 业务系统状态。{
1: 初始化中; 2: 运行中; 4: 限流}
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 业务系统状态。{
1: 初始化中; 2: 运行中; 4: 限流}
     * @param Status 业务系统状态。{
1: 初始化中; 2: 运行中; 4: 限流}
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 业务系统所属地域 
     * @return Region 业务系统所属地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 业务系统所属地域
     * @param Region 业务系统所属地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 业务系统 Tag 列表 
     * @return Tags 业务系统 Tag 列表
     */
    public ApmTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 业务系统 Tag 列表
     * @param Tags 业务系统 Tag 列表
     */
    public void setTags(ApmTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get AppID 信息 
     * @return AppId AppID 信息
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set AppID 信息
     * @param AppId AppID 信息
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 创建人 Uin 
     * @return CreateUin 创建人 Uin
     */
    public String getCreateUin() {
        return this.CreateUin;
    }

    /**
     * Set 创建人 Uin
     * @param CreateUin 创建人 Uin
     */
    public void setCreateUin(String CreateUin) {
        this.CreateUin = CreateUin;
    }

    /**
     * Get 存储使用量(单位：MB) 
     * @return AmountOfUsedStorage 存储使用量(单位：MB)
     */
    public Float getAmountOfUsedStorage() {
        return this.AmountOfUsedStorage;
    }

    /**
     * Set 存储使用量(单位：MB)
     * @param AmountOfUsedStorage 存储使用量(单位：MB)
     */
    public void setAmountOfUsedStorage(Float AmountOfUsedStorage) {
        this.AmountOfUsedStorage = AmountOfUsedStorage;
    }

    /**
     * Get 该业务系统服务端应用数量 
     * @return ServiceCount 该业务系统服务端应用数量
     */
    public Long getServiceCount() {
        return this.ServiceCount;
    }

    /**
     * Set 该业务系统服务端应用数量
     * @param ServiceCount 该业务系统服务端应用数量
     */
    public void setServiceCount(Long ServiceCount) {
        this.ServiceCount = ServiceCount;
    }

    /**
     * Get 日均上报 Span 数 
     * @return CountOfReportSpanPerDay 日均上报 Span 数
     */
    public Long getCountOfReportSpanPerDay() {
        return this.CountOfReportSpanPerDay;
    }

    /**
     * Set 日均上报 Span 数
     * @param CountOfReportSpanPerDay 日均上报 Span 数
     */
    public void setCountOfReportSpanPerDay(Long CountOfReportSpanPerDay) {
        this.CountOfReportSpanPerDay = CountOfReportSpanPerDay;
    }

    /**
     * Get Trace 数据保存时长（单位：天） 
     * @return TraceDuration Trace 数据保存时长（单位：天）
     */
    public Long getTraceDuration() {
        return this.TraceDuration;
    }

    /**
     * Set Trace 数据保存时长（单位：天）
     * @param TraceDuration Trace 数据保存时长（单位：天）
     */
    public void setTraceDuration(Long TraceDuration) {
        this.TraceDuration = TraceDuration;
    }

    /**
     * Get 业务系统上报额度 
     * @return SpanDailyCounters 业务系统上报额度
     */
    public Long getSpanDailyCounters() {
        return this.SpanDailyCounters;
    }

    /**
     * Set 业务系统上报额度
     * @param SpanDailyCounters 业务系统上报额度
     */
    public void setSpanDailyCounters(Long SpanDailyCounters) {
        this.SpanDailyCounters = SpanDailyCounters;
    }

    /**
     * Get 业务系统是否已开通计费（0=未开通，1=已开通） 
     * @return BillingInstance 业务系统是否已开通计费（0=未开通，1=已开通）
     */
    public Long getBillingInstance() {
        return this.BillingInstance;
    }

    /**
     * Set 业务系统是否已开通计费（0=未开通，1=已开通）
     * @param BillingInstance 业务系统是否已开通计费（0=未开通，1=已开通）
     */
    public void setBillingInstance(Long BillingInstance) {
        this.BillingInstance = BillingInstance;
    }

    /**
     * Get 错误警示线（单位：%） 
     * @return ErrRateThreshold 错误警示线（单位：%）
     */
    public Long getErrRateThreshold() {
        return this.ErrRateThreshold;
    }

    /**
     * Set 错误警示线（单位：%）
     * @param ErrRateThreshold 错误警示线（单位：%）
     */
    public void setErrRateThreshold(Long ErrRateThreshold) {
        this.ErrRateThreshold = ErrRateThreshold;
    }

    /**
     * Get 采样率（单位：%） 
     * @return SampleRate 采样率（单位：%）
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set 采样率（单位：%）
     * @param SampleRate 采样率（单位：%）
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get 是否开启错误采样（0=关, 1=开） 
     * @return ErrorSample 是否开启错误采样（0=关, 1=开）
     */
    public Long getErrorSample() {
        return this.ErrorSample;
    }

    /**
     * Set 是否开启错误采样（0=关, 1=开）
     * @param ErrorSample 是否开启错误采样（0=关, 1=开）
     */
    public void setErrorSample(Long ErrorSample) {
        this.ErrorSample = ErrorSample;
    }

    /**
     * Get 采样慢调用保存阈值（单位：ms） 
     * @return SlowRequestSavedThreshold 采样慢调用保存阈值（单位：ms）
     */
    public Long getSlowRequestSavedThreshold() {
        return this.SlowRequestSavedThreshold;
    }

    /**
     * Set 采样慢调用保存阈值（单位：ms）
     * @param SlowRequestSavedThreshold 采样慢调用保存阈值（单位：ms）
     */
    public void setSlowRequestSavedThreshold(Long SlowRequestSavedThreshold) {
        this.SlowRequestSavedThreshold = SlowRequestSavedThreshold;
    }

    /**
     * Get CLS 日志所在地域 
     * @return LogRegion CLS 日志所在地域
     */
    public String getLogRegion() {
        return this.LogRegion;
    }

    /**
     * Set CLS 日志所在地域
     * @param LogRegion CLS 日志所在地域
     */
    public void setLogRegion(String LogRegion) {
        this.LogRegion = LogRegion;
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
     * Get 日志功能开关（0=关， 1=开） 
     * @return IsRelatedLog 日志功能开关（0=关， 1=开）
     */
    public Long getIsRelatedLog() {
        return this.IsRelatedLog;
    }

    /**
     * Set 日志功能开关（0=关， 1=开）
     * @param IsRelatedLog 日志功能开关（0=关， 1=开）
     */
    public void setIsRelatedLog(Long IsRelatedLog) {
        this.IsRelatedLog = IsRelatedLog;
    }

    /**
     * Get 日志主题 ID 
     * @return LogTopicID 日志主题 ID
     */
    public String getLogTopicID() {
        return this.LogTopicID;
    }

    /**
     * Set 日志主题 ID
     * @param LogTopicID 日志主题 ID
     */
    public void setLogTopicID(String LogTopicID) {
        this.LogTopicID = LogTopicID;
    }

    /**
     * Get 该业务系统客户端应用数量 
     * @return ClientCount 该业务系统客户端应用数量
     */
    public Long getClientCount() {
        return this.ClientCount;
    }

    /**
     * Set 该业务系统客户端应用数量
     * @param ClientCount 该业务系统客户端应用数量
     */
    public void setClientCount(Long ClientCount) {
        this.ClientCount = ClientCount;
    }

    /**
     * Get 该业务系统最近2天活跃应用数量 
     * @return TotalCount 该业务系统最近2天活跃应用数量
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 该业务系统最近2天活跃应用数量
     * @param TotalCount 该业务系统最近2天活跃应用数量
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get CLS 日志集 
     * @return LogSet CLS 日志集
     */
    public String getLogSet() {
        return this.LogSet;
    }

    /**
     * Set CLS 日志集
     * @param LogSet CLS 日志集
     */
    public void setLogSet(String LogSet) {
        this.LogSet = LogSet;
    }

    /**
     * Get Metric 数据保存时长（单位：天） 
     * @return MetricDuration Metric 数据保存时长（单位：天）
     */
    public Long getMetricDuration() {
        return this.MetricDuration;
    }

    /**
     * Set Metric 数据保存时长（单位：天）
     * @param MetricDuration Metric 数据保存时长（单位：天）
     */
    public void setMetricDuration(Long MetricDuration) {
        this.MetricDuration = MetricDuration;
    }

    /**
     * Get 用户自定义展示标签列表 
     * @return CustomShowTags 用户自定义展示标签列表
     */
    public String [] getCustomShowTags() {
        return this.CustomShowTags;
    }

    /**
     * Set 用户自定义展示标签列表
     * @param CustomShowTags 用户自定义展示标签列表
     */
    public void setCustomShowTags(String [] CustomShowTags) {
        this.CustomShowTags = CustomShowTags;
    }

    /**
     * Get 业务系统计费模式（1为预付费，0为按量付费） 
     * @return PayMode 业务系统计费模式（1为预付费，0为按量付费）
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 业务系统计费模式（1为预付费，0为按量付费）
     * @param PayMode 业务系统计费模式（1为预付费，0为按量付费）
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 业务系统计费模式是否生效 
     * @return PayModeEffective 业务系统计费模式是否生效
     */
    public Boolean getPayModeEffective() {
        return this.PayModeEffective;
    }

    /**
     * Set 业务系统计费模式是否生效
     * @param PayModeEffective 业务系统计费模式是否生效
     */
    public void setPayModeEffective(Boolean PayModeEffective) {
        this.PayModeEffective = PayModeEffective;
    }

    /**
     * Get 响应时间警示线（单位：ms） 
     * @return ResponseDurationWarningThreshold 响应时间警示线（单位：ms）
     */
    public Long getResponseDurationWarningThreshold() {
        return this.ResponseDurationWarningThreshold;
    }

    /**
     * Set 响应时间警示线（单位：ms）
     * @param ResponseDurationWarningThreshold 响应时间警示线（单位：ms）
     */
    public void setResponseDurationWarningThreshold(Long ResponseDurationWarningThreshold) {
        this.ResponseDurationWarningThreshold = ResponseDurationWarningThreshold;
    }

    /**
     * Get 是否免费（0=否，1=限额免费，2=完全免费），默认0 
     * @return Free 是否免费（0=否，1=限额免费，2=完全免费），默认0
     */
    public Long getFree() {
        return this.Free;
    }

    /**
     * Set 是否免费（0=否，1=限额免费，2=完全免费），默认0
     * @param Free 是否免费（0=否，1=限额免费，2=完全免费），默认0
     */
    public void setFree(Long Free) {
        this.Free = Free;
    }

    /**
     * Get 是否 TSF 默认业务系统（0=否，1=是） 
     * @return DefaultTSF 是否 TSF 默认业务系统（0=否，1=是）
     */
    public Long getDefaultTSF() {
        return this.DefaultTSF;
    }

    /**
     * Set 是否 TSF 默认业务系统（0=否，1=是）
     * @param DefaultTSF 是否 TSF 默认业务系统（0=否，1=是）
     */
    public void setDefaultTSF(Long DefaultTSF) {
        this.DefaultTSF = DefaultTSF;
    }

    /**
     * Get 是否关联 Dashboard（0=关, 1=开） 
     * @return IsRelatedDashboard 是否关联 Dashboard（0=关, 1=开）
     */
    public Long getIsRelatedDashboard() {
        return this.IsRelatedDashboard;
    }

    /**
     * Set 是否关联 Dashboard（0=关, 1=开）
     * @param IsRelatedDashboard 是否关联 Dashboard（0=关, 1=开）
     */
    public void setIsRelatedDashboard(Long IsRelatedDashboard) {
        this.IsRelatedDashboard = IsRelatedDashboard;
    }

    /**
     * Get 关联的 Dashboard ID 
     * @return DashboardTopicID 关联的 Dashboard ID
     */
    public String getDashboardTopicID() {
        return this.DashboardTopicID;
    }

    /**
     * Set 关联的 Dashboard ID
     * @param DashboardTopicID 关联的 Dashboard ID
     */
    public void setDashboardTopicID(String DashboardTopicID) {
        this.DashboardTopicID = DashboardTopicID;
    }

    /**
     * Get 是否开启组件漏洞检测（0=关， 1=开） 
     * @return IsInstrumentationVulnerabilityScan 是否开启组件漏洞检测（0=关， 1=开）
     */
    public Long getIsInstrumentationVulnerabilityScan() {
        return this.IsInstrumentationVulnerabilityScan;
    }

    /**
     * Set 是否开启组件漏洞检测（0=关， 1=开）
     * @param IsInstrumentationVulnerabilityScan 是否开启组件漏洞检测（0=关， 1=开）
     */
    public void setIsInstrumentationVulnerabilityScan(Long IsInstrumentationVulnerabilityScan) {
        this.IsInstrumentationVulnerabilityScan = IsInstrumentationVulnerabilityScan;
    }

    /**
     * Get 是否开启 SQL 注入分析（0=关， 1=开） 
     * @return IsSqlInjectionAnalysis 是否开启 SQL 注入分析（0=关， 1=开）
     */
    public Long getIsSqlInjectionAnalysis() {
        return this.IsSqlInjectionAnalysis;
    }

    /**
     * Set 是否开启 SQL 注入分析（0=关， 1=开）
     * @param IsSqlInjectionAnalysis 是否开启 SQL 注入分析（0=关， 1=开）
     */
    public void setIsSqlInjectionAnalysis(Long IsSqlInjectionAnalysis) {
        this.IsSqlInjectionAnalysis = IsSqlInjectionAnalysis;
    }

    /**
     * Get 限流原因。{
1: 正式版限额;
2: 试用版限额;
4: 试用版到期;
8: 账号欠费
} 
     * @return StopReason 限流原因。{
1: 正式版限额;
2: 试用版限额;
4: 试用版到期;
8: 账号欠费
}
     */
    public Long getStopReason() {
        return this.StopReason;
    }

    /**
     * Set 限流原因。{
1: 正式版限额;
2: 试用版限额;
4: 试用版到期;
8: 账号欠费
}
     * @param StopReason 限流原因。{
1: 正式版限额;
2: 试用版限额;
4: 试用版到期;
8: 账号欠费
}
     */
    public void setStopReason(Long StopReason) {
        this.StopReason = StopReason;
    }

    /**
     * Get 是否开远程命令执行检测（0=关， 1=开） 
     * @return IsRemoteCommandExecutionAnalysis 是否开远程命令执行检测（0=关， 1=开）
     */
    public Long getIsRemoteCommandExecutionAnalysis() {
        return this.IsRemoteCommandExecutionAnalysis;
    }

    /**
     * Set 是否开远程命令执行检测（0=关， 1=开）
     * @param IsRemoteCommandExecutionAnalysis 是否开远程命令执行检测（0=关， 1=开）
     */
    public void setIsRemoteCommandExecutionAnalysis(Long IsRemoteCommandExecutionAnalysis) {
        this.IsRemoteCommandExecutionAnalysis = IsRemoteCommandExecutionAnalysis;
    }

    /**
     * Get 是否开内存马执行检测（0=关， 1=开） 
     * @return IsMemoryHijackingAnalysis 是否开内存马执行检测（0=关， 1=开）
     */
    public Long getIsMemoryHijackingAnalysis() {
        return this.IsMemoryHijackingAnalysis;
    }

    /**
     * Set 是否开内存马执行检测（0=关， 1=开）
     * @param IsMemoryHijackingAnalysis 是否开内存马执行检测（0=关， 1=开）
     */
    public void setIsMemoryHijackingAnalysis(Long IsMemoryHijackingAnalysis) {
        this.IsMemoryHijackingAnalysis = IsMemoryHijackingAnalysis;
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
     * Get 业务系统鉴权 token 
     * @return Token 业务系统鉴权 token
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set 业务系统鉴权 token
     * @param Token 业务系统鉴权 token
     */
    public void setToken(String Token) {
        this.Token = Token;
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

    }
}

