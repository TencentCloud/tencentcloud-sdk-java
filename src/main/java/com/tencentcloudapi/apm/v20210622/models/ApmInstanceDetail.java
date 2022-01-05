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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApmInstanceDetail extends AbstractModel{

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
    * 该实例已上报的服务数
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
     * Get 该实例已上报的服务数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceCount 该实例已上报的服务数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getServiceCount() {
        return this.ServiceCount;
    }

    /**
     * Set 该实例已上报的服务数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceCount 该实例已上报的服务数
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

    }
}

