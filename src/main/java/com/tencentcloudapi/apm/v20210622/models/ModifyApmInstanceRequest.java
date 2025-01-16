/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
    * Tag 列表
    */
    @SerializedName("Tags")
    @Expose
    private ApmTag [] Tags;

    /**
    * 业务系统描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Trace 数据保存时长（单位：天）
    */
    @SerializedName("TraceDuration")
    @Expose
    private Long TraceDuration;

    /**
    * 是否开启计费
    */
    @SerializedName("OpenBilling")
    @Expose
    private Boolean OpenBilling;

    /**
    * 业务系统上报额度
    */
    @SerializedName("SpanDailyCounters")
    @Expose
    private Long SpanDailyCounters;

    /**
    * 错误率警示线，当应用的平均错误率超出该阈值时，系统会给出异常提示。
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
    * 是否开启日志功能（0=关, 1=开）
    */
    @SerializedName("IsRelatedLog")
    @Expose
    private Long IsRelatedLog;

    /**
    * 日志地域，开启日志功能后才会生效
    */
    @SerializedName("LogRegion")
    @Expose
    private String LogRegion;

    /**
    * CLS 日志主题 ID，开启日志功能后才会生效
    */
    @SerializedName("LogTopicID")
    @Expose
    private String LogTopicID;

    /**
    * 日志集，开启日志功能后才会生效
    */
    @SerializedName("LogSet")
    @Expose
    private String LogSet;

    /**
    * 日志源，开启日志功能后才会生效
    */
    @SerializedName("LogSource")
    @Expose
    private String LogSource;

    /**
    * 用户自定义展示标签列表
    */
    @SerializedName("CustomShowTags")
    @Expose
    private String [] CustomShowTags;

    /**
    * 修改计费模式（1为预付费，0为按量付费）
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 响应时间警示线
    */
    @SerializedName("ResponseDurationWarningThreshold")
    @Expose
    private Long ResponseDurationWarningThreshold;

    /**
    * 是否免费（0=付费版；1=TSF 受限免费版；2=免费版），默认0
    */
    @SerializedName("Free")
    @Expose
    private Long Free;

    /**
    * 是否关联 Dashboard（0=关,1=开）
    */
    @SerializedName("IsRelatedDashboard")
    @Expose
    private Long IsRelatedDashboard;

    /**
    * 关联的 Dashboard ID，开启关联 Dashboard 后才会生效
    */
    @SerializedName("DashboardTopicID")
    @Expose
    private String DashboardTopicID;

    /**
    * 是否开启 SQL 注入检测（0=关,1=开）
    */
    @SerializedName("IsSqlInjectionAnalysis")
    @Expose
    private Long IsSqlInjectionAnalysis;

    /**
    * 是否开启组件漏洞检测（0=关,1=开）
    */
    @SerializedName("IsInstrumentationVulnerabilityScan")
    @Expose
    private Long IsInstrumentationVulnerabilityScan;

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
     * Get Tag 列表 
     * @return Tags Tag 列表
     */
    public ApmTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag 列表
     * @param Tags Tag 列表
     */
    public void setTags(ApmTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 业务系统描述 
     * @return Description 业务系统描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 业务系统描述
     * @param Description 业务系统描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
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
     * Get 是否开启计费 
     * @return OpenBilling 是否开启计费
     */
    public Boolean getOpenBilling() {
        return this.OpenBilling;
    }

    /**
     * Set 是否开启计费
     * @param OpenBilling 是否开启计费
     */
    public void setOpenBilling(Boolean OpenBilling) {
        this.OpenBilling = OpenBilling;
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
     * Get 错误率警示线，当应用的平均错误率超出该阈值时，系统会给出异常提示。 
     * @return ErrRateThreshold 错误率警示线，当应用的平均错误率超出该阈值时，系统会给出异常提示。
     */
    public Long getErrRateThreshold() {
        return this.ErrRateThreshold;
    }

    /**
     * Set 错误率警示线，当应用的平均错误率超出该阈值时，系统会给出异常提示。
     * @param ErrRateThreshold 错误率警示线，当应用的平均错误率超出该阈值时，系统会给出异常提示。
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
     * Get 是否开启日志功能（0=关, 1=开） 
     * @return IsRelatedLog 是否开启日志功能（0=关, 1=开）
     */
    public Long getIsRelatedLog() {
        return this.IsRelatedLog;
    }

    /**
     * Set 是否开启日志功能（0=关, 1=开）
     * @param IsRelatedLog 是否开启日志功能（0=关, 1=开）
     */
    public void setIsRelatedLog(Long IsRelatedLog) {
        this.IsRelatedLog = IsRelatedLog;
    }

    /**
     * Get 日志地域，开启日志功能后才会生效 
     * @return LogRegion 日志地域，开启日志功能后才会生效
     */
    public String getLogRegion() {
        return this.LogRegion;
    }

    /**
     * Set 日志地域，开启日志功能后才会生效
     * @param LogRegion 日志地域，开启日志功能后才会生效
     */
    public void setLogRegion(String LogRegion) {
        this.LogRegion = LogRegion;
    }

    /**
     * Get CLS 日志主题 ID，开启日志功能后才会生效 
     * @return LogTopicID CLS 日志主题 ID，开启日志功能后才会生效
     */
    public String getLogTopicID() {
        return this.LogTopicID;
    }

    /**
     * Set CLS 日志主题 ID，开启日志功能后才会生效
     * @param LogTopicID CLS 日志主题 ID，开启日志功能后才会生效
     */
    public void setLogTopicID(String LogTopicID) {
        this.LogTopicID = LogTopicID;
    }

    /**
     * Get 日志集，开启日志功能后才会生效 
     * @return LogSet 日志集，开启日志功能后才会生效
     */
    public String getLogSet() {
        return this.LogSet;
    }

    /**
     * Set 日志集，开启日志功能后才会生效
     * @param LogSet 日志集，开启日志功能后才会生效
     */
    public void setLogSet(String LogSet) {
        this.LogSet = LogSet;
    }

    /**
     * Get 日志源，开启日志功能后才会生效 
     * @return LogSource 日志源，开启日志功能后才会生效
     */
    public String getLogSource() {
        return this.LogSource;
    }

    /**
     * Set 日志源，开启日志功能后才会生效
     * @param LogSource 日志源，开启日志功能后才会生效
     */
    public void setLogSource(String LogSource) {
        this.LogSource = LogSource;
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
     * Get 修改计费模式（1为预付费，0为按量付费） 
     * @return PayMode 修改计费模式（1为预付费，0为按量付费）
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 修改计费模式（1为预付费，0为按量付费）
     * @param PayMode 修改计费模式（1为预付费，0为按量付费）
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 响应时间警示线 
     * @return ResponseDurationWarningThreshold 响应时间警示线
     */
    public Long getResponseDurationWarningThreshold() {
        return this.ResponseDurationWarningThreshold;
    }

    /**
     * Set 响应时间警示线
     * @param ResponseDurationWarningThreshold 响应时间警示线
     */
    public void setResponseDurationWarningThreshold(Long ResponseDurationWarningThreshold) {
        this.ResponseDurationWarningThreshold = ResponseDurationWarningThreshold;
    }

    /**
     * Get 是否免费（0=付费版；1=TSF 受限免费版；2=免费版），默认0 
     * @return Free 是否免费（0=付费版；1=TSF 受限免费版；2=免费版），默认0
     */
    public Long getFree() {
        return this.Free;
    }

    /**
     * Set 是否免费（0=付费版；1=TSF 受限免费版；2=免费版），默认0
     * @param Free 是否免费（0=付费版；1=TSF 受限免费版；2=免费版），默认0
     */
    public void setFree(Long Free) {
        this.Free = Free;
    }

    /**
     * Get 是否关联 Dashboard（0=关,1=开） 
     * @return IsRelatedDashboard 是否关联 Dashboard（0=关,1=开）
     */
    public Long getIsRelatedDashboard() {
        return this.IsRelatedDashboard;
    }

    /**
     * Set 是否关联 Dashboard（0=关,1=开）
     * @param IsRelatedDashboard 是否关联 Dashboard（0=关,1=开）
     */
    public void setIsRelatedDashboard(Long IsRelatedDashboard) {
        this.IsRelatedDashboard = IsRelatedDashboard;
    }

    /**
     * Get 关联的 Dashboard ID，开启关联 Dashboard 后才会生效 
     * @return DashboardTopicID 关联的 Dashboard ID，开启关联 Dashboard 后才会生效
     */
    public String getDashboardTopicID() {
        return this.DashboardTopicID;
    }

    /**
     * Set 关联的 Dashboard ID，开启关联 Dashboard 后才会生效
     * @param DashboardTopicID 关联的 Dashboard ID，开启关联 Dashboard 后才会生效
     */
    public void setDashboardTopicID(String DashboardTopicID) {
        this.DashboardTopicID = DashboardTopicID;
    }

    /**
     * Get 是否开启 SQL 注入检测（0=关,1=开） 
     * @return IsSqlInjectionAnalysis 是否开启 SQL 注入检测（0=关,1=开）
     */
    public Long getIsSqlInjectionAnalysis() {
        return this.IsSqlInjectionAnalysis;
    }

    /**
     * Set 是否开启 SQL 注入检测（0=关,1=开）
     * @param IsSqlInjectionAnalysis 是否开启 SQL 注入检测（0=关,1=开）
     */
    public void setIsSqlInjectionAnalysis(Long IsSqlInjectionAnalysis) {
        this.IsSqlInjectionAnalysis = IsSqlInjectionAnalysis;
    }

    /**
     * Get 是否开启组件漏洞检测（0=关,1=开） 
     * @return IsInstrumentationVulnerabilityScan 是否开启组件漏洞检测（0=关,1=开）
     */
    public Long getIsInstrumentationVulnerabilityScan() {
        return this.IsInstrumentationVulnerabilityScan;
    }

    /**
     * Set 是否开启组件漏洞检测（0=关,1=开）
     * @param IsInstrumentationVulnerabilityScan 是否开启组件漏洞检测（0=关,1=开）
     */
    public void setIsInstrumentationVulnerabilityScan(Long IsInstrumentationVulnerabilityScan) {
        this.IsInstrumentationVulnerabilityScan = IsInstrumentationVulnerabilityScan;
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

    }
}

