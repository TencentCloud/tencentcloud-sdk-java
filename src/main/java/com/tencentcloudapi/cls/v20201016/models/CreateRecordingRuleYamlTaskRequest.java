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

public class CreateRecordingRuleYamlTaskRequest extends AbstractModel {

    /**
    * <p>源指标主题id</p><p>取值参考：</p><ul><li><a href="https://cloud.tencent.com/document/api/614/56454">DescribeTopics</a></li><li><a href="https://console.cloud.tencent.com/cls/metric">指标主题</a></li></ul>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>目标指标主题id，可与 TopicId 相同</p>
    */
    @SerializedName("DstTopicId")
    @Expose
    private String DstTopicId;

    /**
    * <p>任务状态； 1:开启；2:关闭</p>
    */
    @SerializedName("EnableFlag")
    @Expose
    private Long EnableFlag;

    /**
    * <p>任务执行开始时间 ,Unix时间戳</p><p>单位：ms</p>
    */
    @SerializedName("ProcessStartTime")
    @Expose
    private Long ProcessStartTime;

    /**
    * <p>调度周期(分钟)，支持范围(0,1440]分钟。</p><p>单位：分钟</p><p>也可在YAML中使用 interval: duration 为每个group单独设置执行间隔</p>
    */
    @SerializedName("ProcessPeriod")
    @Expose
    private Long ProcessPeriod;

    /**
    * <p>执行延迟，建议设置为30秒，避免指标上报延迟导致预聚合任务计算结果不精确</p><p>单位：秒</p>
    */
    @SerializedName("ProcessDelay")
    @Expose
    private Long ProcessDelay;

    /**
    * <p>yaml配置名称</p>
    */
    @SerializedName("YamlConfigName")
    @Expose
    private String YamlConfigName;

    /**
    * <p>yaml配置内容</p><p>兼容 Prometheus Recording Rules 配置文件，API调用时请注意字符串中的换行与缩进。</p>
    */
    @SerializedName("YamlContent")
    @Expose
    private String YamlContent;

    /**
    * <p>是否开启投递服务日志。1：关闭，2：开启。</p>
    */
    @SerializedName("HasServicesLog")
    @Expose
    private Long HasServicesLog;

    /**
     * Get <p>源指标主题id</p><p>取值参考：</p><ul><li><a href="https://cloud.tencent.com/document/api/614/56454">DescribeTopics</a></li><li><a href="https://console.cloud.tencent.com/cls/metric">指标主题</a></li></ul> 
     * @return TopicId <p>源指标主题id</p><p>取值参考：</p><ul><li><a href="https://cloud.tencent.com/document/api/614/56454">DescribeTopics</a></li><li><a href="https://console.cloud.tencent.com/cls/metric">指标主题</a></li></ul>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>源指标主题id</p><p>取值参考：</p><ul><li><a href="https://cloud.tencent.com/document/api/614/56454">DescribeTopics</a></li><li><a href="https://console.cloud.tencent.com/cls/metric">指标主题</a></li></ul>
     * @param TopicId <p>源指标主题id</p><p>取值参考：</p><ul><li><a href="https://cloud.tencent.com/document/api/614/56454">DescribeTopics</a></li><li><a href="https://console.cloud.tencent.com/cls/metric">指标主题</a></li></ul>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>目标指标主题id，可与 TopicId 相同</p> 
     * @return DstTopicId <p>目标指标主题id，可与 TopicId 相同</p>
     */
    public String getDstTopicId() {
        return this.DstTopicId;
    }

    /**
     * Set <p>目标指标主题id，可与 TopicId 相同</p>
     * @param DstTopicId <p>目标指标主题id，可与 TopicId 相同</p>
     */
    public void setDstTopicId(String DstTopicId) {
        this.DstTopicId = DstTopicId;
    }

    /**
     * Get <p>任务状态； 1:开启；2:关闭</p> 
     * @return EnableFlag <p>任务状态； 1:开启；2:关闭</p>
     */
    public Long getEnableFlag() {
        return this.EnableFlag;
    }

    /**
     * Set <p>任务状态； 1:开启；2:关闭</p>
     * @param EnableFlag <p>任务状态； 1:开启；2:关闭</p>
     */
    public void setEnableFlag(Long EnableFlag) {
        this.EnableFlag = EnableFlag;
    }

    /**
     * Get <p>任务执行开始时间 ,Unix时间戳</p><p>单位：ms</p> 
     * @return ProcessStartTime <p>任务执行开始时间 ,Unix时间戳</p><p>单位：ms</p>
     */
    public Long getProcessStartTime() {
        return this.ProcessStartTime;
    }

    /**
     * Set <p>任务执行开始时间 ,Unix时间戳</p><p>单位：ms</p>
     * @param ProcessStartTime <p>任务执行开始时间 ,Unix时间戳</p><p>单位：ms</p>
     */
    public void setProcessStartTime(Long ProcessStartTime) {
        this.ProcessStartTime = ProcessStartTime;
    }

    /**
     * Get <p>调度周期(分钟)，支持范围(0,1440]分钟。</p><p>单位：分钟</p><p>也可在YAML中使用 interval: duration 为每个group单独设置执行间隔</p> 
     * @return ProcessPeriod <p>调度周期(分钟)，支持范围(0,1440]分钟。</p><p>单位：分钟</p><p>也可在YAML中使用 interval: duration 为每个group单独设置执行间隔</p>
     */
    public Long getProcessPeriod() {
        return this.ProcessPeriod;
    }

    /**
     * Set <p>调度周期(分钟)，支持范围(0,1440]分钟。</p><p>单位：分钟</p><p>也可在YAML中使用 interval: duration 为每个group单独设置执行间隔</p>
     * @param ProcessPeriod <p>调度周期(分钟)，支持范围(0,1440]分钟。</p><p>单位：分钟</p><p>也可在YAML中使用 interval: duration 为每个group单独设置执行间隔</p>
     */
    public void setProcessPeriod(Long ProcessPeriod) {
        this.ProcessPeriod = ProcessPeriod;
    }

    /**
     * Get <p>执行延迟，建议设置为30秒，避免指标上报延迟导致预聚合任务计算结果不精确</p><p>单位：秒</p> 
     * @return ProcessDelay <p>执行延迟，建议设置为30秒，避免指标上报延迟导致预聚合任务计算结果不精确</p><p>单位：秒</p>
     */
    public Long getProcessDelay() {
        return this.ProcessDelay;
    }

    /**
     * Set <p>执行延迟，建议设置为30秒，避免指标上报延迟导致预聚合任务计算结果不精确</p><p>单位：秒</p>
     * @param ProcessDelay <p>执行延迟，建议设置为30秒，避免指标上报延迟导致预聚合任务计算结果不精确</p><p>单位：秒</p>
     */
    public void setProcessDelay(Long ProcessDelay) {
        this.ProcessDelay = ProcessDelay;
    }

    /**
     * Get <p>yaml配置名称</p> 
     * @return YamlConfigName <p>yaml配置名称</p>
     */
    public String getYamlConfigName() {
        return this.YamlConfigName;
    }

    /**
     * Set <p>yaml配置名称</p>
     * @param YamlConfigName <p>yaml配置名称</p>
     */
    public void setYamlConfigName(String YamlConfigName) {
        this.YamlConfigName = YamlConfigName;
    }

    /**
     * Get <p>yaml配置内容</p><p>兼容 Prometheus Recording Rules 配置文件，API调用时请注意字符串中的换行与缩进。</p> 
     * @return YamlContent <p>yaml配置内容</p><p>兼容 Prometheus Recording Rules 配置文件，API调用时请注意字符串中的换行与缩进。</p>
     */
    public String getYamlContent() {
        return this.YamlContent;
    }

    /**
     * Set <p>yaml配置内容</p><p>兼容 Prometheus Recording Rules 配置文件，API调用时请注意字符串中的换行与缩进。</p>
     * @param YamlContent <p>yaml配置内容</p><p>兼容 Prometheus Recording Rules 配置文件，API调用时请注意字符串中的换行与缩进。</p>
     */
    public void setYamlContent(String YamlContent) {
        this.YamlContent = YamlContent;
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

    public CreateRecordingRuleYamlTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRecordingRuleYamlTaskRequest(CreateRecordingRuleYamlTaskRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.DstTopicId != null) {
            this.DstTopicId = new String(source.DstTopicId);
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
        if (source.YamlConfigName != null) {
            this.YamlConfigName = new String(source.YamlConfigName);
        }
        if (source.YamlContent != null) {
            this.YamlContent = new String(source.YamlContent);
        }
        if (source.HasServicesLog != null) {
            this.HasServicesLog = new Long(source.HasServicesLog);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "DstTopicId", this.DstTopicId);
        this.setParamSimple(map, prefix + "EnableFlag", this.EnableFlag);
        this.setParamSimple(map, prefix + "ProcessStartTime", this.ProcessStartTime);
        this.setParamSimple(map, prefix + "ProcessPeriod", this.ProcessPeriod);
        this.setParamSimple(map, prefix + "ProcessDelay", this.ProcessDelay);
        this.setParamSimple(map, prefix + "YamlConfigName", this.YamlConfigName);
        this.setParamSimple(map, prefix + "YamlContent", this.YamlContent);
        this.setParamSimple(map, prefix + "HasServicesLog", this.HasServicesLog);

    }
}

