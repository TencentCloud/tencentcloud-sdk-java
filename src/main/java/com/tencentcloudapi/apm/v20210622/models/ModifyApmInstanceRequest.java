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
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 标签列表
    */
    @SerializedName("Tags")
    @Expose
    private ApmTag [] Tags;

    /**
    * 实例详情
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Trace数据保存时长
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
    * 实例上报额度
    */
    @SerializedName("SpanDailyCounters")
    @Expose
    private Long SpanDailyCounters;

    /**
    * 错误率阈值
    */
    @SerializedName("ErrRateThreshold")
    @Expose
    private Long ErrRateThreshold;

    /**
    * 采样率
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    * 是否开启错误采样 0 关 1 开
    */
    @SerializedName("ErrorSample")
    @Expose
    private Long ErrorSample;

    /**
    * 慢请求阈值
    */
    @SerializedName("SlowRequestSavedThreshold")
    @Expose
    private Long SlowRequestSavedThreshold;

    /**
    * 是否开启日志功能 0 关 1 开
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
    * CLS日志主题ID | ES 索引名
    */
    @SerializedName("LogTopicID")
    @Expose
    private String LogTopicID;

    /**
    * CLS日志集 | ES集群ID
    */
    @SerializedName("LogSet")
    @Expose
    private String LogSet;

    /**
    * CLS | ES
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
    * 修改计费模式
1为预付费
0为按量付费
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 响应时间满意阈值
    */
    @SerializedName("ResponseDurationWarningThreshold")
    @Expose
    private Long ResponseDurationWarningThreshold;

    /**
    * （0=付费版；1=tsf受限免费版；2=免费版）
    */
    @SerializedName("Free")
    @Expose
    private Long Free;

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
    * 是否开启SQL注入检测
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
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名 
     * @return Name 实例名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 实例名
     * @param Name 实例名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 标签列表 
     * @return Tags 标签列表
     */
    public ApmTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签列表
     * @param Tags 标签列表
     */
    public void setTags(ApmTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 实例详情 
     * @return Description 实例详情
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 实例详情
     * @param Description 实例详情
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Trace数据保存时长 
     * @return TraceDuration Trace数据保存时长
     */
    public Long getTraceDuration() {
        return this.TraceDuration;
    }

    /**
     * Set Trace数据保存时长
     * @param TraceDuration Trace数据保存时长
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
     * Get 实例上报额度 
     * @return SpanDailyCounters 实例上报额度
     */
    public Long getSpanDailyCounters() {
        return this.SpanDailyCounters;
    }

    /**
     * Set 实例上报额度
     * @param SpanDailyCounters 实例上报额度
     */
    public void setSpanDailyCounters(Long SpanDailyCounters) {
        this.SpanDailyCounters = SpanDailyCounters;
    }

    /**
     * Get 错误率阈值 
     * @return ErrRateThreshold 错误率阈值
     */
    public Long getErrRateThreshold() {
        return this.ErrRateThreshold;
    }

    /**
     * Set 错误率阈值
     * @param ErrRateThreshold 错误率阈值
     */
    public void setErrRateThreshold(Long ErrRateThreshold) {
        this.ErrRateThreshold = ErrRateThreshold;
    }

    /**
     * Get 采样率 
     * @return SampleRate 采样率
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set 采样率
     * @param SampleRate 采样率
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get 是否开启错误采样 0 关 1 开 
     * @return ErrorSample 是否开启错误采样 0 关 1 开
     */
    public Long getErrorSample() {
        return this.ErrorSample;
    }

    /**
     * Set 是否开启错误采样 0 关 1 开
     * @param ErrorSample 是否开启错误采样 0 关 1 开
     */
    public void setErrorSample(Long ErrorSample) {
        this.ErrorSample = ErrorSample;
    }

    /**
     * Get 慢请求阈值 
     * @return SlowRequestSavedThreshold 慢请求阈值
     */
    public Long getSlowRequestSavedThreshold() {
        return this.SlowRequestSavedThreshold;
    }

    /**
     * Set 慢请求阈值
     * @param SlowRequestSavedThreshold 慢请求阈值
     */
    public void setSlowRequestSavedThreshold(Long SlowRequestSavedThreshold) {
        this.SlowRequestSavedThreshold = SlowRequestSavedThreshold;
    }

    /**
     * Get 是否开启日志功能 0 关 1 开 
     * @return IsRelatedLog 是否开启日志功能 0 关 1 开
     */
    public Long getIsRelatedLog() {
        return this.IsRelatedLog;
    }

    /**
     * Set 是否开启日志功能 0 关 1 开
     * @param IsRelatedLog 是否开启日志功能 0 关 1 开
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
     * Get CLS日志主题ID | ES 索引名 
     * @return LogTopicID CLS日志主题ID | ES 索引名
     */
    public String getLogTopicID() {
        return this.LogTopicID;
    }

    /**
     * Set CLS日志主题ID | ES 索引名
     * @param LogTopicID CLS日志主题ID | ES 索引名
     */
    public void setLogTopicID(String LogTopicID) {
        this.LogTopicID = LogTopicID;
    }

    /**
     * Get CLS日志集 | ES集群ID 
     * @return LogSet CLS日志集 | ES集群ID
     */
    public String getLogSet() {
        return this.LogSet;
    }

    /**
     * Set CLS日志集 | ES集群ID
     * @param LogSet CLS日志集 | ES集群ID
     */
    public void setLogSet(String LogSet) {
        this.LogSet = LogSet;
    }

    /**
     * Get CLS | ES 
     * @return LogSource CLS | ES
     */
    public String getLogSource() {
        return this.LogSource;
    }

    /**
     * Set CLS | ES
     * @param LogSource CLS | ES
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
     * Get 修改计费模式
1为预付费
0为按量付费 
     * @return PayMode 修改计费模式
1为预付费
0为按量付费
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 修改计费模式
1为预付费
0为按量付费
     * @param PayMode 修改计费模式
1为预付费
0为按量付费
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 响应时间满意阈值 
     * @return ResponseDurationWarningThreshold 响应时间满意阈值
     */
    public Long getResponseDurationWarningThreshold() {
        return this.ResponseDurationWarningThreshold;
    }

    /**
     * Set 响应时间满意阈值
     * @param ResponseDurationWarningThreshold 响应时间满意阈值
     */
    public void setResponseDurationWarningThreshold(Long ResponseDurationWarningThreshold) {
        this.ResponseDurationWarningThreshold = ResponseDurationWarningThreshold;
    }

    /**
     * Get （0=付费版；1=tsf受限免费版；2=免费版） 
     * @return Free （0=付费版；1=tsf受限免费版；2=免费版）
     */
    public Long getFree() {
        return this.Free;
    }

    /**
     * Set （0=付费版；1=tsf受限免费版；2=免费版）
     * @param Free （0=付费版；1=tsf受限免费版；2=免费版）
     */
    public void setFree(Long Free) {
        this.Free = Free;
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
     * Get 是否开启SQL注入检测 
     * @return IsSqlInjectionAnalysis 是否开启SQL注入检测
     */
    public Long getIsSqlInjectionAnalysis() {
        return this.IsSqlInjectionAnalysis;
    }

    /**
     * Set 是否开启SQL注入检测
     * @param IsSqlInjectionAnalysis 是否开启SQL注入检测
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

