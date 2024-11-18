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

public class ApmInstanceDetail extends AbstractModel {

    /**
    * 存储使用量(MB)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AmountOfUsedStorage")
    @Expose
    private Float AmountOfUsedStorage;

    /**
    * 实例名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 实例所属tag列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private ApmTag [] Tags;

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 创建人Uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateUin")
    @Expose
    private String CreateUin;

    /**
    * 该实例已上报的服务端应用数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceCount")
    @Expose
    private Long ServiceCount;

    /**
    * 日均上报Span数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CountOfReportSpanPerDay")
    @Expose
    private Long CountOfReportSpanPerDay;

    /**
    * AppId信息
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Trace数据保存时长
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TraceDuration")
    @Expose
    private Long TraceDuration;

    /**
    * 实例描述信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 实例状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 实例所属地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 实例上报额度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpanDailyCounters")
    @Expose
    private Long SpanDailyCounters;

    /**
    * 实例是否开通计费
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BillingInstance")
    @Expose
    private Long BillingInstance;

    /**
    * 错误率阈值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrRateThreshold")
    @Expose
    private Long ErrRateThreshold;

    /**
    * 采样率阈值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    * 是否开启错误采样 0  关 1 开
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorSample")
    @Expose
    private Long ErrorSample;

    /**
    * 慢调用保存阈值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SlowRequestSavedThreshold")
    @Expose
    private Long SlowRequestSavedThreshold;

    /**
    * cls日志所在地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogRegion")
    @Expose
    private String LogRegion;

    /**
    * 日志来源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogSource")
    @Expose
    private String LogSource;

    /**
    * 日志功能开关 0 关 | 1 开
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsRelatedLog")
    @Expose
    private Long IsRelatedLog;

    /**
    * 日志主题ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogTopicID")
    @Expose
    private String LogTopicID;

    /**
    * 该实例已上报的客户端应用数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientCount")
    @Expose
    private Long ClientCount;

    /**
    * 该实例已上报的总应用数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * CLS日志集 | ES集群ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogSet")
    @Expose
    private String LogSet;

    /**
    * Metric数据保存时长
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetricDuration")
    @Expose
    private Long MetricDuration;

    /**
    * 用户自定义展示标签列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomShowTags")
    @Expose
    private String [] CustomShowTags;

    /**
    * 实例计费模式
1为预付费
0为按量付费
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 实例计费模式是否生效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayModeEffective")
    @Expose
    private Boolean PayModeEffective;

    /**
    * 响应时间满意阈值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResponseDurationWarningThreshold")
    @Expose
    private Long ResponseDurationWarningThreshold;

    /**
    * 是否免费（0=否，1=限额免费，2=完全免费），默认0
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Free")
    @Expose
    private Long Free;

    /**
    * 是否tsf默认业务系统（0=否，1-是）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultTSF")
    @Expose
    private Long DefaultTSF;

    /**
    * 是否关联dashboard： 0 关 1 开
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsRelatedDashboard")
    @Expose
    private Long IsRelatedDashboard;

    /**
    * dashboard ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DashboardTopicID")
    @Expose
    private String DashboardTopicID;

    /**
    * 是否开启组件漏洞检测
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsInstrumentationVulnerabilityScan")
    @Expose
    private Long IsInstrumentationVulnerabilityScan;

    /**
    * 是否开启SQL注入分析
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsSqlInjectionAnalysis")
    @Expose
    private Long IsSqlInjectionAnalysis;

    /**
     * Get 存储使用量(MB)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AmountOfUsedStorage 存储使用量(MB)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getAmountOfUsedStorage() {
        return this.AmountOfUsedStorage;
    }

    /**
     * Set 存储使用量(MB)
注意：此字段可能返回 null，表示取不到有效值。
     * @param AmountOfUsedStorage 存储使用量(MB)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAmountOfUsedStorage(Float AmountOfUsedStorage) {
        this.AmountOfUsedStorage = AmountOfUsedStorage;
    }

    /**
     * Get 实例名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 实例名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 实例名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 实例名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 实例所属tag列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 实例所属tag列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ApmTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 实例所属tag列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 实例所属tag列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(ApmTag [] Tags) {
        this.Tags = Tags;
    }

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
     * Get 创建人Uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateUin 创建人Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateUin() {
        return this.CreateUin;
    }

    /**
     * Set 创建人Uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateUin 创建人Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateUin(String CreateUin) {
        this.CreateUin = CreateUin;
    }

    /**
     * Get 该实例已上报的服务端应用数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceCount 该实例已上报的服务端应用数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getServiceCount() {
        return this.ServiceCount;
    }

    /**
     * Set 该实例已上报的服务端应用数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceCount 该实例已上报的服务端应用数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceCount(Long ServiceCount) {
        this.ServiceCount = ServiceCount;
    }

    /**
     * Get 日均上报Span数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CountOfReportSpanPerDay 日均上报Span数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCountOfReportSpanPerDay() {
        return this.CountOfReportSpanPerDay;
    }

    /**
     * Set 日均上报Span数
注意：此字段可能返回 null，表示取不到有效值。
     * @param CountOfReportSpanPerDay 日均上报Span数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCountOfReportSpanPerDay(Long CountOfReportSpanPerDay) {
        this.CountOfReportSpanPerDay = CountOfReportSpanPerDay;
    }

    /**
     * Get AppId信息 
     * @return AppId AppId信息
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set AppId信息
     * @param AppId AppId信息
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Trace数据保存时长
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TraceDuration Trace数据保存时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTraceDuration() {
        return this.TraceDuration;
    }

    /**
     * Set Trace数据保存时长
注意：此字段可能返回 null，表示取不到有效值。
     * @param TraceDuration Trace数据保存时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTraceDuration(Long TraceDuration) {
        this.TraceDuration = TraceDuration;
    }

    /**
     * Get 实例描述信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 实例描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 实例描述信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 实例描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 实例状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 实例状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 实例状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 实例状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 实例所属地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 实例所属地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 实例所属地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 实例所属地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 实例上报额度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpanDailyCounters 实例上报额度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSpanDailyCounters() {
        return this.SpanDailyCounters;
    }

    /**
     * Set 实例上报额度
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpanDailyCounters 实例上报额度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpanDailyCounters(Long SpanDailyCounters) {
        this.SpanDailyCounters = SpanDailyCounters;
    }

    /**
     * Get 实例是否开通计费
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BillingInstance 实例是否开通计费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBillingInstance() {
        return this.BillingInstance;
    }

    /**
     * Set 实例是否开通计费
注意：此字段可能返回 null，表示取不到有效值。
     * @param BillingInstance 实例是否开通计费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBillingInstance(Long BillingInstance) {
        this.BillingInstance = BillingInstance;
    }

    /**
     * Get 错误率阈值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrRateThreshold 错误率阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getErrRateThreshold() {
        return this.ErrRateThreshold;
    }

    /**
     * Set 错误率阈值
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrRateThreshold 错误率阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrRateThreshold(Long ErrRateThreshold) {
        this.ErrRateThreshold = ErrRateThreshold;
    }

    /**
     * Get 采样率阈值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SampleRate 采样率阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set 采样率阈值
注意：此字段可能返回 null，表示取不到有效值。
     * @param SampleRate 采样率阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get 是否开启错误采样 0  关 1 开
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorSample 是否开启错误采样 0  关 1 开
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getErrorSample() {
        return this.ErrorSample;
    }

    /**
     * Set 是否开启错误采样 0  关 1 开
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorSample 是否开启错误采样 0  关 1 开
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorSample(Long ErrorSample) {
        this.ErrorSample = ErrorSample;
    }

    /**
     * Get 慢调用保存阈值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SlowRequestSavedThreshold 慢调用保存阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSlowRequestSavedThreshold() {
        return this.SlowRequestSavedThreshold;
    }

    /**
     * Set 慢调用保存阈值
注意：此字段可能返回 null，表示取不到有效值。
     * @param SlowRequestSavedThreshold 慢调用保存阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSlowRequestSavedThreshold(Long SlowRequestSavedThreshold) {
        this.SlowRequestSavedThreshold = SlowRequestSavedThreshold;
    }

    /**
     * Get cls日志所在地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogRegion cls日志所在地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogRegion() {
        return this.LogRegion;
    }

    /**
     * Set cls日志所在地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogRegion cls日志所在地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogRegion(String LogRegion) {
        this.LogRegion = LogRegion;
    }

    /**
     * Get 日志来源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogSource 日志来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogSource() {
        return this.LogSource;
    }

    /**
     * Set 日志来源
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogSource 日志来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogSource(String LogSource) {
        this.LogSource = LogSource;
    }

    /**
     * Get 日志功能开关 0 关 | 1 开
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsRelatedLog 日志功能开关 0 关 | 1 开
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsRelatedLog() {
        return this.IsRelatedLog;
    }

    /**
     * Set 日志功能开关 0 关 | 1 开
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsRelatedLog 日志功能开关 0 关 | 1 开
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsRelatedLog(Long IsRelatedLog) {
        this.IsRelatedLog = IsRelatedLog;
    }

    /**
     * Get 日志主题ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogTopicID 日志主题ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogTopicID() {
        return this.LogTopicID;
    }

    /**
     * Set 日志主题ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogTopicID 日志主题ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogTopicID(String LogTopicID) {
        this.LogTopicID = LogTopicID;
    }

    /**
     * Get 该实例已上报的客户端应用数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClientCount 该实例已上报的客户端应用数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getClientCount() {
        return this.ClientCount;
    }

    /**
     * Set 该实例已上报的客户端应用数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientCount 该实例已上报的客户端应用数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientCount(Long ClientCount) {
        this.ClientCount = ClientCount;
    }

    /**
     * Get 该实例已上报的总应用数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 该实例已上报的总应用数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 该实例已上报的总应用数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 该实例已上报的总应用数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get CLS日志集 | ES集群ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogSet CLS日志集 | ES集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogSet() {
        return this.LogSet;
    }

    /**
     * Set CLS日志集 | ES集群ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogSet CLS日志集 | ES集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogSet(String LogSet) {
        this.LogSet = LogSet;
    }

    /**
     * Get Metric数据保存时长
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetricDuration Metric数据保存时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMetricDuration() {
        return this.MetricDuration;
    }

    /**
     * Set Metric数据保存时长
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetricDuration Metric数据保存时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetricDuration(Long MetricDuration) {
        this.MetricDuration = MetricDuration;
    }

    /**
     * Get 用户自定义展示标签列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomShowTags 用户自定义展示标签列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCustomShowTags() {
        return this.CustomShowTags;
    }

    /**
     * Set 用户自定义展示标签列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomShowTags 用户自定义展示标签列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomShowTags(String [] CustomShowTags) {
        this.CustomShowTags = CustomShowTags;
    }

    /**
     * Get 实例计费模式
1为预付费
0为按量付费
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayMode 实例计费模式
1为预付费
0为按量付费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 实例计费模式
1为预付费
0为按量付费
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayMode 实例计费模式
1为预付费
0为按量付费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 实例计费模式是否生效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayModeEffective 实例计费模式是否生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getPayModeEffective() {
        return this.PayModeEffective;
    }

    /**
     * Set 实例计费模式是否生效
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayModeEffective 实例计费模式是否生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayModeEffective(Boolean PayModeEffective) {
        this.PayModeEffective = PayModeEffective;
    }

    /**
     * Get 响应时间满意阈值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResponseDurationWarningThreshold 响应时间满意阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getResponseDurationWarningThreshold() {
        return this.ResponseDurationWarningThreshold;
    }

    /**
     * Set 响应时间满意阈值
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResponseDurationWarningThreshold 响应时间满意阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResponseDurationWarningThreshold(Long ResponseDurationWarningThreshold) {
        this.ResponseDurationWarningThreshold = ResponseDurationWarningThreshold;
    }

    /**
     * Get 是否免费（0=否，1=限额免费，2=完全免费），默认0
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Free 是否免费（0=否，1=限额免费，2=完全免费），默认0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFree() {
        return this.Free;
    }

    /**
     * Set 是否免费（0=否，1=限额免费，2=完全免费），默认0
注意：此字段可能返回 null，表示取不到有效值。
     * @param Free 是否免费（0=否，1=限额免费，2=完全免费），默认0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFree(Long Free) {
        this.Free = Free;
    }

    /**
     * Get 是否tsf默认业务系统（0=否，1-是）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultTSF 是否tsf默认业务系统（0=否，1-是）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDefaultTSF() {
        return this.DefaultTSF;
    }

    /**
     * Set 是否tsf默认业务系统（0=否，1-是）
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultTSF 是否tsf默认业务系统（0=否，1-是）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultTSF(Long DefaultTSF) {
        this.DefaultTSF = DefaultTSF;
    }

    /**
     * Get 是否关联dashboard： 0 关 1 开
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsRelatedDashboard 是否关联dashboard： 0 关 1 开
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsRelatedDashboard() {
        return this.IsRelatedDashboard;
    }

    /**
     * Set 是否关联dashboard： 0 关 1 开
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsRelatedDashboard 是否关联dashboard： 0 关 1 开
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsRelatedDashboard(Long IsRelatedDashboard) {
        this.IsRelatedDashboard = IsRelatedDashboard;
    }

    /**
     * Get dashboard ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DashboardTopicID dashboard ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDashboardTopicID() {
        return this.DashboardTopicID;
    }

    /**
     * Set dashboard ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param DashboardTopicID dashboard ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDashboardTopicID(String DashboardTopicID) {
        this.DashboardTopicID = DashboardTopicID;
    }

    /**
     * Get 是否开启组件漏洞检测
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsInstrumentationVulnerabilityScan 是否开启组件漏洞检测
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsInstrumentationVulnerabilityScan() {
        return this.IsInstrumentationVulnerabilityScan;
    }

    /**
     * Set 是否开启组件漏洞检测
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsInstrumentationVulnerabilityScan 是否开启组件漏洞检测
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsInstrumentationVulnerabilityScan(Long IsInstrumentationVulnerabilityScan) {
        this.IsInstrumentationVulnerabilityScan = IsInstrumentationVulnerabilityScan;
    }

    /**
     * Get 是否开启SQL注入分析
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsSqlInjectionAnalysis 是否开启SQL注入分析
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsSqlInjectionAnalysis() {
        return this.IsSqlInjectionAnalysis;
    }

    /**
     * Set 是否开启SQL注入分析
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsSqlInjectionAnalysis 是否开启SQL注入分析
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsSqlInjectionAnalysis(Long IsSqlInjectionAnalysis) {
        this.IsSqlInjectionAnalysis = IsSqlInjectionAnalysis;
    }

    public ApmInstanceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApmInstanceDetail(ApmInstanceDetail source) {
        if (source.AmountOfUsedStorage != null) {
            this.AmountOfUsedStorage = new Float(source.AmountOfUsedStorage);
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
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.CreateUin != null) {
            this.CreateUin = new String(source.CreateUin);
        }
        if (source.ServiceCount != null) {
            this.ServiceCount = new Long(source.ServiceCount);
        }
        if (source.CountOfReportSpanPerDay != null) {
            this.CountOfReportSpanPerDay = new Long(source.CountOfReportSpanPerDay);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.TraceDuration != null) {
            this.TraceDuration = new Long(source.TraceDuration);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AmountOfUsedStorage", this.AmountOfUsedStorage);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "CreateUin", this.CreateUin);
        this.setParamSimple(map, prefix + "ServiceCount", this.ServiceCount);
        this.setParamSimple(map, prefix + "CountOfReportSpanPerDay", this.CountOfReportSpanPerDay);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "TraceDuration", this.TraceDuration);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Region", this.Region);
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

    }
}

