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

public class ModifyApmInstanceRequest extends AbstractModel {

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
    * <p>Tag 列表</p>
    */
    @SerializedName("Tags")
    @Expose
    private ApmTag [] Tags;

    /**
    * <p>业务系统描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Trace 数据保存时长（单位：天）</p>
    */
    @SerializedName("TraceDuration")
    @Expose
    private Long TraceDuration;

    /**
    * <p>是否开启计费</p>
    */
    @SerializedName("OpenBilling")
    @Expose
    private Boolean OpenBilling;

    /**
    * <p>业务系统上报额度</p>
    */
    @SerializedName("SpanDailyCounters")
    @Expose
    private Long SpanDailyCounters;

    /**
    * <p>错误率警示线，当应用的平均错误率超出该阈值时，系统会给出异常提示。</p>
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
    * <p>是否开启日志功能（0=关, 1=开）</p>
    */
    @SerializedName("IsRelatedLog")
    @Expose
    private Long IsRelatedLog;

    /**
    * <p>日志地域，开启日志功能后才会生效</p>
    */
    @SerializedName("LogRegion")
    @Expose
    private String LogRegion;

    /**
    * <p>CLS 日志主题 ID，开启日志功能后才会生效</p>
    */
    @SerializedName("LogTopicID")
    @Expose
    private String LogTopicID;

    /**
    * <p>日志集，开启日志功能后才会生效</p>
    */
    @SerializedName("LogSet")
    @Expose
    private String LogSet;

    /**
    * <p>日志源，开启日志功能后才会生效</p>
    */
    @SerializedName("LogSource")
    @Expose
    private String LogSource;

    /**
    * <p>用户自定义展示标签列表</p>
    */
    @SerializedName("CustomShowTags")
    @Expose
    private String [] CustomShowTags;

    /**
    * <p>修改计费模式（1为预付费，0为按量付费）</p>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>响应时间警示线</p>
    */
    @SerializedName("ResponseDurationWarningThreshold")
    @Expose
    private Long ResponseDurationWarningThreshold;

    /**
    * <p>是否免费（0=付费版；1=TSF 受限免费版；2=免费版），默认0</p>
    */
    @SerializedName("Free")
    @Expose
    private Long Free;

    /**
    * <p>是否关联 Dashboard（0=关,1=开）</p>
    */
    @SerializedName("IsRelatedDashboard")
    @Expose
    private Long IsRelatedDashboard;

    /**
    * <p>关联的 Dashboard ID，开启关联 Dashboard 后才会生效</p>
    */
    @SerializedName("DashboardTopicID")
    @Expose
    private String DashboardTopicID;

    /**
    * <p>是否开启 SQL 注入检测（0=关,1=开）</p>
    */
    @SerializedName("IsSqlInjectionAnalysis")
    @Expose
    private Long IsSqlInjectionAnalysis;

    /**
    * <p>是否开启组件漏洞检测（0=关,1=开）</p>
    */
    @SerializedName("IsInstrumentationVulnerabilityScan")
    @Expose
    private Long IsInstrumentationVulnerabilityScan;

    /**
    * <p>是否开启远程命令攻击检测</p>
    */
    @SerializedName("IsRemoteCommandExecutionAnalysis")
    @Expose
    private Long IsRemoteCommandExecutionAnalysis;

    /**
    * <p>是否开启内存马检测</p>
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
    * <p>是否开启探针头采样</p>
    */
    @SerializedName("EnableHeadSampler")
    @Expose
    private Boolean EnableHeadSampler;

    /**
    * <p>头采类型</p><p>枚举值：</p><ul><li>parentbased_traceidratio： 默认</li></ul>
    */
    @SerializedName("HeadSamplerType")
    @Expose
    private String HeadSamplerType;

    /**
    * <p>头采采样率</p><p>取值范围：[0, 100]</p>
    */
    @SerializedName("HeadSamplerArg")
    @Expose
    private Long HeadSamplerArg;

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
     * Get <p>Tag 列表</p> 
     * @return Tags <p>Tag 列表</p>
     */
    public ApmTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Tag 列表</p>
     * @param Tags <p>Tag 列表</p>
     */
    public void setTags(ApmTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>业务系统描述</p> 
     * @return Description <p>业务系统描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>业务系统描述</p>
     * @param Description <p>业务系统描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
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
     * Get <p>是否开启计费</p> 
     * @return OpenBilling <p>是否开启计费</p>
     */
    public Boolean getOpenBilling() {
        return this.OpenBilling;
    }

    /**
     * Set <p>是否开启计费</p>
     * @param OpenBilling <p>是否开启计费</p>
     */
    public void setOpenBilling(Boolean OpenBilling) {
        this.OpenBilling = OpenBilling;
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
     * Get <p>错误率警示线，当应用的平均错误率超出该阈值时，系统会给出异常提示。</p> 
     * @return ErrRateThreshold <p>错误率警示线，当应用的平均错误率超出该阈值时，系统会给出异常提示。</p>
     */
    public Long getErrRateThreshold() {
        return this.ErrRateThreshold;
    }

    /**
     * Set <p>错误率警示线，当应用的平均错误率超出该阈值时，系统会给出异常提示。</p>
     * @param ErrRateThreshold <p>错误率警示线，当应用的平均错误率超出该阈值时，系统会给出异常提示。</p>
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
     * Get <p>是否开启日志功能（0=关, 1=开）</p> 
     * @return IsRelatedLog <p>是否开启日志功能（0=关, 1=开）</p>
     */
    public Long getIsRelatedLog() {
        return this.IsRelatedLog;
    }

    /**
     * Set <p>是否开启日志功能（0=关, 1=开）</p>
     * @param IsRelatedLog <p>是否开启日志功能（0=关, 1=开）</p>
     */
    public void setIsRelatedLog(Long IsRelatedLog) {
        this.IsRelatedLog = IsRelatedLog;
    }

    /**
     * Get <p>日志地域，开启日志功能后才会生效</p> 
     * @return LogRegion <p>日志地域，开启日志功能后才会生效</p>
     */
    public String getLogRegion() {
        return this.LogRegion;
    }

    /**
     * Set <p>日志地域，开启日志功能后才会生效</p>
     * @param LogRegion <p>日志地域，开启日志功能后才会生效</p>
     */
    public void setLogRegion(String LogRegion) {
        this.LogRegion = LogRegion;
    }

    /**
     * Get <p>CLS 日志主题 ID，开启日志功能后才会生效</p> 
     * @return LogTopicID <p>CLS 日志主题 ID，开启日志功能后才会生效</p>
     */
    public String getLogTopicID() {
        return this.LogTopicID;
    }

    /**
     * Set <p>CLS 日志主题 ID，开启日志功能后才会生效</p>
     * @param LogTopicID <p>CLS 日志主题 ID，开启日志功能后才会生效</p>
     */
    public void setLogTopicID(String LogTopicID) {
        this.LogTopicID = LogTopicID;
    }

    /**
     * Get <p>日志集，开启日志功能后才会生效</p> 
     * @return LogSet <p>日志集，开启日志功能后才会生效</p>
     */
    public String getLogSet() {
        return this.LogSet;
    }

    /**
     * Set <p>日志集，开启日志功能后才会生效</p>
     * @param LogSet <p>日志集，开启日志功能后才会生效</p>
     */
    public void setLogSet(String LogSet) {
        this.LogSet = LogSet;
    }

    /**
     * Get <p>日志源，开启日志功能后才会生效</p> 
     * @return LogSource <p>日志源，开启日志功能后才会生效</p>
     */
    public String getLogSource() {
        return this.LogSource;
    }

    /**
     * Set <p>日志源，开启日志功能后才会生效</p>
     * @param LogSource <p>日志源，开启日志功能后才会生效</p>
     */
    public void setLogSource(String LogSource) {
        this.LogSource = LogSource;
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
     * Get <p>修改计费模式（1为预付费，0为按量付费）</p> 
     * @return PayMode <p>修改计费模式（1为预付费，0为按量付费）</p>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>修改计费模式（1为预付费，0为按量付费）</p>
     * @param PayMode <p>修改计费模式（1为预付费，0为按量付费）</p>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>响应时间警示线</p> 
     * @return ResponseDurationWarningThreshold <p>响应时间警示线</p>
     */
    public Long getResponseDurationWarningThreshold() {
        return this.ResponseDurationWarningThreshold;
    }

    /**
     * Set <p>响应时间警示线</p>
     * @param ResponseDurationWarningThreshold <p>响应时间警示线</p>
     */
    public void setResponseDurationWarningThreshold(Long ResponseDurationWarningThreshold) {
        this.ResponseDurationWarningThreshold = ResponseDurationWarningThreshold;
    }

    /**
     * Get <p>是否免费（0=付费版；1=TSF 受限免费版；2=免费版），默认0</p> 
     * @return Free <p>是否免费（0=付费版；1=TSF 受限免费版；2=免费版），默认0</p>
     */
    public Long getFree() {
        return this.Free;
    }

    /**
     * Set <p>是否免费（0=付费版；1=TSF 受限免费版；2=免费版），默认0</p>
     * @param Free <p>是否免费（0=付费版；1=TSF 受限免费版；2=免费版），默认0</p>
     */
    public void setFree(Long Free) {
        this.Free = Free;
    }

    /**
     * Get <p>是否关联 Dashboard（0=关,1=开）</p> 
     * @return IsRelatedDashboard <p>是否关联 Dashboard（0=关,1=开）</p>
     */
    public Long getIsRelatedDashboard() {
        return this.IsRelatedDashboard;
    }

    /**
     * Set <p>是否关联 Dashboard（0=关,1=开）</p>
     * @param IsRelatedDashboard <p>是否关联 Dashboard（0=关,1=开）</p>
     */
    public void setIsRelatedDashboard(Long IsRelatedDashboard) {
        this.IsRelatedDashboard = IsRelatedDashboard;
    }

    /**
     * Get <p>关联的 Dashboard ID，开启关联 Dashboard 后才会生效</p> 
     * @return DashboardTopicID <p>关联的 Dashboard ID，开启关联 Dashboard 后才会生效</p>
     */
    public String getDashboardTopicID() {
        return this.DashboardTopicID;
    }

    /**
     * Set <p>关联的 Dashboard ID，开启关联 Dashboard 后才会生效</p>
     * @param DashboardTopicID <p>关联的 Dashboard ID，开启关联 Dashboard 后才会生效</p>
     */
    public void setDashboardTopicID(String DashboardTopicID) {
        this.DashboardTopicID = DashboardTopicID;
    }

    /**
     * Get <p>是否开启 SQL 注入检测（0=关,1=开）</p> 
     * @return IsSqlInjectionAnalysis <p>是否开启 SQL 注入检测（0=关,1=开）</p>
     */
    public Long getIsSqlInjectionAnalysis() {
        return this.IsSqlInjectionAnalysis;
    }

    /**
     * Set <p>是否开启 SQL 注入检测（0=关,1=开）</p>
     * @param IsSqlInjectionAnalysis <p>是否开启 SQL 注入检测（0=关,1=开）</p>
     */
    public void setIsSqlInjectionAnalysis(Long IsSqlInjectionAnalysis) {
        this.IsSqlInjectionAnalysis = IsSqlInjectionAnalysis;
    }

    /**
     * Get <p>是否开启组件漏洞检测（0=关,1=开）</p> 
     * @return IsInstrumentationVulnerabilityScan <p>是否开启组件漏洞检测（0=关,1=开）</p>
     */
    public Long getIsInstrumentationVulnerabilityScan() {
        return this.IsInstrumentationVulnerabilityScan;
    }

    /**
     * Set <p>是否开启组件漏洞检测（0=关,1=开）</p>
     * @param IsInstrumentationVulnerabilityScan <p>是否开启组件漏洞检测（0=关,1=开）</p>
     */
    public void setIsInstrumentationVulnerabilityScan(Long IsInstrumentationVulnerabilityScan) {
        this.IsInstrumentationVulnerabilityScan = IsInstrumentationVulnerabilityScan;
    }

    /**
     * Get <p>是否开启远程命令攻击检测</p> 
     * @return IsRemoteCommandExecutionAnalysis <p>是否开启远程命令攻击检测</p>
     */
    public Long getIsRemoteCommandExecutionAnalysis() {
        return this.IsRemoteCommandExecutionAnalysis;
    }

    /**
     * Set <p>是否开启远程命令攻击检测</p>
     * @param IsRemoteCommandExecutionAnalysis <p>是否开启远程命令攻击检测</p>
     */
    public void setIsRemoteCommandExecutionAnalysis(Long IsRemoteCommandExecutionAnalysis) {
        this.IsRemoteCommandExecutionAnalysis = IsRemoteCommandExecutionAnalysis;
    }

    /**
     * Get <p>是否开启内存马检测</p> 
     * @return IsMemoryHijackingAnalysis <p>是否开启内存马检测</p>
     */
    public Long getIsMemoryHijackingAnalysis() {
        return this.IsMemoryHijackingAnalysis;
    }

    /**
     * Set <p>是否开启内存马检测</p>
     * @param IsMemoryHijackingAnalysis <p>是否开启内存马检测</p>
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

    /**
     * Get <p>是否开启探针头采样</p> 
     * @return EnableHeadSampler <p>是否开启探针头采样</p>
     */
    public Boolean getEnableHeadSampler() {
        return this.EnableHeadSampler;
    }

    /**
     * Set <p>是否开启探针头采样</p>
     * @param EnableHeadSampler <p>是否开启探针头采样</p>
     */
    public void setEnableHeadSampler(Boolean EnableHeadSampler) {
        this.EnableHeadSampler = EnableHeadSampler;
    }

    /**
     * Get <p>头采类型</p><p>枚举值：</p><ul><li>parentbased_traceidratio： 默认</li></ul> 
     * @return HeadSamplerType <p>头采类型</p><p>枚举值：</p><ul><li>parentbased_traceidratio： 默认</li></ul>
     */
    public String getHeadSamplerType() {
        return this.HeadSamplerType;
    }

    /**
     * Set <p>头采类型</p><p>枚举值：</p><ul><li>parentbased_traceidratio： 默认</li></ul>
     * @param HeadSamplerType <p>头采类型</p><p>枚举值：</p><ul><li>parentbased_traceidratio： 默认</li></ul>
     */
    public void setHeadSamplerType(String HeadSamplerType) {
        this.HeadSamplerType = HeadSamplerType;
    }

    /**
     * Get <p>头采采样率</p><p>取值范围：[0, 100]</p> 
     * @return HeadSamplerArg <p>头采采样率</p><p>取值范围：[0, 100]</p>
     */
    public Long getHeadSamplerArg() {
        return this.HeadSamplerArg;
    }

    /**
     * Set <p>头采采样率</p><p>取值范围：[0, 100]</p>
     * @param HeadSamplerArg <p>头采采样率</p><p>取值范围：[0, 100]</p>
     */
    public void setHeadSamplerArg(Long HeadSamplerArg) {
        this.HeadSamplerArg = HeadSamplerArg;
    }

    public ModifyApmInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyApmInstanceRequest(ModifyApmInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Tags != null) {
            this.Tags = new ApmTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new ApmTag(source.Tags[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.TraceDuration != null) {
            this.TraceDuration = new Long(source.TraceDuration);
        }
        if (source.OpenBilling != null) {
            this.OpenBilling = new Boolean(source.OpenBilling);
        }
        if (source.SpanDailyCounters != null) {
            this.SpanDailyCounters = new Long(source.SpanDailyCounters);
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
        if (source.CustomShowTags != null) {
            this.CustomShowTags = new String[source.CustomShowTags.length];
            for (int i = 0; i < source.CustomShowTags.length; i++) {
                this.CustomShowTags[i] = new String(source.CustomShowTags[i]);
            }
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.ResponseDurationWarningThreshold != null) {
            this.ResponseDurationWarningThreshold = new Long(source.ResponseDurationWarningThreshold);
        }
        if (source.Free != null) {
            this.Free = new Long(source.Free);
        }
        if (source.IsRelatedDashboard != null) {
            this.IsRelatedDashboard = new Long(source.IsRelatedDashboard);
        }
        if (source.DashboardTopicID != null) {
            this.DashboardTopicID = new String(source.DashboardTopicID);
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
        if (source.UrlLongSegmentThreshold != null) {
            this.UrlLongSegmentThreshold = new Long(source.UrlLongSegmentThreshold);
        }
        if (source.UrlNumberSegmentThreshold != null) {
            this.UrlNumberSegmentThreshold = new Long(source.UrlNumberSegmentThreshold);
        }
        if (source.LogSpanIdKey != null) {
            this.LogSpanIdKey = new String(source.LogSpanIdKey);
        }
        if (source.EnableHeadSampler != null) {
            this.EnableHeadSampler = new Boolean(source.EnableHeadSampler);
        }
        if (source.HeadSamplerType != null) {
            this.HeadSamplerType = new String(source.HeadSamplerType);
        }
        if (source.HeadSamplerArg != null) {
            this.HeadSamplerArg = new Long(source.HeadSamplerArg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "TraceDuration", this.TraceDuration);
        this.setParamSimple(map, prefix + "OpenBilling", this.OpenBilling);
        this.setParamSimple(map, prefix + "SpanDailyCounters", this.SpanDailyCounters);
        this.setParamSimple(map, prefix + "ErrRateThreshold", this.ErrRateThreshold);
        this.setParamSimple(map, prefix + "SampleRate", this.SampleRate);
        this.setParamSimple(map, prefix + "ErrorSample", this.ErrorSample);
        this.setParamSimple(map, prefix + "SlowRequestSavedThreshold", this.SlowRequestSavedThreshold);
        this.setParamSimple(map, prefix + "IsRelatedLog", this.IsRelatedLog);
        this.setParamSimple(map, prefix + "LogRegion", this.LogRegion);
        this.setParamSimple(map, prefix + "LogTopicID", this.LogTopicID);
        this.setParamSimple(map, prefix + "LogSet", this.LogSet);
        this.setParamSimple(map, prefix + "LogSource", this.LogSource);
        this.setParamArraySimple(map, prefix + "CustomShowTags.", this.CustomShowTags);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "ResponseDurationWarningThreshold", this.ResponseDurationWarningThreshold);
        this.setParamSimple(map, prefix + "Free", this.Free);
        this.setParamSimple(map, prefix + "IsRelatedDashboard", this.IsRelatedDashboard);
        this.setParamSimple(map, prefix + "DashboardTopicID", this.DashboardTopicID);
        this.setParamSimple(map, prefix + "IsSqlInjectionAnalysis", this.IsSqlInjectionAnalysis);
        this.setParamSimple(map, prefix + "IsInstrumentationVulnerabilityScan", this.IsInstrumentationVulnerabilityScan);
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
        this.setParamSimple(map, prefix + "UrlLongSegmentThreshold", this.UrlLongSegmentThreshold);
        this.setParamSimple(map, prefix + "UrlNumberSegmentThreshold", this.UrlNumberSegmentThreshold);
        this.setParamSimple(map, prefix + "LogSpanIdKey", this.LogSpanIdKey);
        this.setParamSimple(map, prefix + "EnableHeadSampler", this.EnableHeadSampler);
        this.setParamSimple(map, prefix + "HeadSamplerType", this.HeadSamplerType);
        this.setParamSimple(map, prefix + "HeadSamplerArg", this.HeadSamplerArg);

    }
}

