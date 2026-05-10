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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRecordingRuleTaskRequest extends AbstractModel {

    /**
    * <p>任务ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>源指标主题id</p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>目标指标主题id</p>
    */
    @SerializedName("DstTopicId")
    @Expose
    private String DstTopicId;

    /**
    * <p>任务名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>任务启动状态.   1开启,  2关闭</p>
    */
    @SerializedName("EnableFlag")
    @Expose
    private Long EnableFlag;

    /**
    * <p>调度开始时间,Unix时间戳，单位ms</p>
    */
    @SerializedName("ProcessStartTime")
    @Expose
    private Long ProcessStartTime;

    /**
    * <p>调度周期(分钟)，支持范围(0,1440]分钟。</p>
    */
    @SerializedName("ProcessPeriod")
    @Expose
    private Long ProcessPeriod;

    /**
    * <p>执行延迟(秒)</p>
    */
    @SerializedName("ProcessDelay")
    @Expose
    private Long ProcessDelay;

    /**
    * <p>指标名称</p>
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * <p>执行语句(PromQL)</p>
    */
    @SerializedName("RecordingRuleContent")
    @Expose
    private String RecordingRuleContent;

    /**
    * <p>自定义指标名称</p>
    */
    @SerializedName("CustomMetricLabels")
    @Expose
    private MetricLabel [] CustomMetricLabels;

    /**
    * <p>是否开启投递服务日志。1：关闭，2：开启。</p>
    */
    @SerializedName("HasServicesLog")
    @Expose
    private Long HasServicesLog;

    /**
     * Get <p>任务ID</p> 
     * @return TaskId <p>任务ID</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务ID</p>
     * @param TaskId <p>任务ID</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>源指标主题id</p> 
     * @return TopicId <p>源指标主题id</p>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>源指标主题id</p>
     * @param TopicId <p>源指标主题id</p>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>目标指标主题id</p> 
     * @return DstTopicId <p>目标指标主题id</p>
     */
    public String getDstTopicId() {
        return this.DstTopicId;
    }

    /**
     * Set <p>目标指标主题id</p>
     * @param DstTopicId <p>目标指标主题id</p>
     */
    public void setDstTopicId(String DstTopicId) {
        this.DstTopicId = DstTopicId;
    }

    /**
     * Get <p>任务名称</p> 
     * @return Name <p>任务名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>任务名称</p>
     * @param Name <p>任务名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>任务启动状态.   1开启,  2关闭</p> 
     * @return EnableFlag <p>任务启动状态.   1开启,  2关闭</p>
     */
    public Long getEnableFlag() {
        return this.EnableFlag;
    }

    /**
     * Set <p>任务启动状态.   1开启,  2关闭</p>
     * @param EnableFlag <p>任务启动状态.   1开启,  2关闭</p>
     */
    public void setEnableFlag(Long EnableFlag) {
        this.EnableFlag = EnableFlag;
    }

    /**
     * Get <p>调度开始时间,Unix时间戳，单位ms</p> 
     * @return ProcessStartTime <p>调度开始时间,Unix时间戳，单位ms</p>
     */
    public Long getProcessStartTime() {
        return this.ProcessStartTime;
    }

    /**
     * Set <p>调度开始时间,Unix时间戳，单位ms</p>
     * @param ProcessStartTime <p>调度开始时间,Unix时间戳，单位ms</p>
     */
    public void setProcessStartTime(Long ProcessStartTime) {
        this.ProcessStartTime = ProcessStartTime;
    }

    /**
     * Get <p>调度周期(分钟)，支持范围(0,1440]分钟。</p> 
     * @return ProcessPeriod <p>调度周期(分钟)，支持范围(0,1440]分钟。</p>
     */
    public Long getProcessPeriod() {
        return this.ProcessPeriod;
    }

    /**
     * Set <p>调度周期(分钟)，支持范围(0,1440]分钟。</p>
     * @param ProcessPeriod <p>调度周期(分钟)，支持范围(0,1440]分钟。</p>
     */
    public void setProcessPeriod(Long ProcessPeriod) {
        this.ProcessPeriod = ProcessPeriod;
    }

    /**
     * Get <p>执行延迟(秒)</p> 
     * @return ProcessDelay <p>执行延迟(秒)</p>
     */
    public Long getProcessDelay() {
        return this.ProcessDelay;
    }

    /**
     * Set <p>执行延迟(秒)</p>
     * @param ProcessDelay <p>执行延迟(秒)</p>
     */
    public void setProcessDelay(Long ProcessDelay) {
        this.ProcessDelay = ProcessDelay;
    }

    /**
     * Get <p>指标名称</p> 
     * @return MetricName <p>指标名称</p>
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set <p>指标名称</p>
     * @param MetricName <p>指标名称</p>
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get <p>执行语句(PromQL)</p> 
     * @return RecordingRuleContent <p>执行语句(PromQL)</p>
     */
    public String getRecordingRuleContent() {
        return this.RecordingRuleContent;
    }

    /**
     * Set <p>执行语句(PromQL)</p>
     * @param RecordingRuleContent <p>执行语句(PromQL)</p>
     */
    public void setRecordingRuleContent(String RecordingRuleContent) {
        this.RecordingRuleContent = RecordingRuleContent;
    }

    /**
     * Get <p>自定义指标名称</p> 
     * @return CustomMetricLabels <p>自定义指标名称</p>
     */
    public MetricLabel [] getCustomMetricLabels() {
        return this.CustomMetricLabels;
    }

    /**
     * Set <p>自定义指标名称</p>
     * @param CustomMetricLabels <p>自定义指标名称</p>
     */
    public void setCustomMetricLabels(MetricLabel [] CustomMetricLabels) {
        this.CustomMetricLabels = CustomMetricLabels;
    }

    /**
     * Get <p>是否开启投递服务日志。1：关闭，2：开启。</p> 
     * @return HasServicesLog <p>是否开启投递服务日志。1：关闭，2：开启。</p>
     */
    public Long getHasServicesLog() {
        return this.HasServicesLog;
    }

    /**
     * Set <p>是否开启投递服务日志。1：关闭，2：开启。</p>
     * @param HasServicesLog <p>是否开启投递服务日志。1：关闭，2：开启。</p>
     */
    public void setHasServicesLog(Long HasServicesLog) {
        this.HasServicesLog = HasServicesLog;
    }

    public ModifyRecordingRuleTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRecordingRuleTaskRequest(ModifyRecordingRuleTaskRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.DstTopicId != null) {
            this.DstTopicId = new String(source.DstTopicId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.EnableFlag != null) {
            this.EnableFlag = new Long(source.EnableFlag);
        }
        if (source.ProcessStartTime != null) {
            this.ProcessStartTime = new Long(source.ProcessStartTime);
        }
        if (source.ProcessPeriod != null) {
            this.ProcessPeriod = new Long(source.ProcessPeriod);
        }
        if (source.ProcessDelay != null) {
            this.ProcessDelay = new Long(source.ProcessDelay);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.RecordingRuleContent != null) {
            this.RecordingRuleContent = new String(source.RecordingRuleContent);
        }
        if (source.CustomMetricLabels != null) {
            this.CustomMetricLabels = new MetricLabel[source.CustomMetricLabels.length];
            for (int i = 0; i < source.CustomMetricLabels.length; i++) {
                this.CustomMetricLabels[i] = new MetricLabel(source.CustomMetricLabels[i]);
            }
        }
        if (source.HasServicesLog != null) {
            this.HasServicesLog = new Long(source.HasServicesLog);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "DstTopicId", this.DstTopicId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "EnableFlag", this.EnableFlag);
        this.setParamSimple(map, prefix + "ProcessStartTime", this.ProcessStartTime);
        this.setParamSimple(map, prefix + "ProcessPeriod", this.ProcessPeriod);
        this.setParamSimple(map, prefix + "ProcessDelay", this.ProcessDelay);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "RecordingRuleContent", this.RecordingRuleContent);
        this.setParamArrayObj(map, prefix + "CustomMetricLabels.", this.CustomMetricLabels);
        this.setParamSimple(map, prefix + "HasServicesLog", this.HasServicesLog);

    }
}

