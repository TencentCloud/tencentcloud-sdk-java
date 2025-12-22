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

public class ModifyMetricSubscribeRequest extends AbstractModel {

    /**
    * 指标采集任务的日志主题id。必填字段
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 指标采集任务id。必填字段
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 名称：长度不超过64字符，以字母开头，接受0-9,a-z,A-Z, _,-,中文字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 云产品命名空间。
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 指标配置信息。
    */
    @SerializedName("Metrics")
    @Expose
    private MetricConfig [] Metrics;

    /**
    * 实例配置信息。
    */
    @SerializedName("InstanceInfo")
    @Expose
    private InstanceConfig InstanceInfo;

    /**
    * 任务状态。

1： 未启用

2： 启用
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
     * Get 指标采集任务的日志主题id。必填字段 
     * @return TopicId 指标采集任务的日志主题id。必填字段
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 指标采集任务的日志主题id。必填字段
     * @param TopicId 指标采集任务的日志主题id。必填字段
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 指标采集任务id。必填字段 
     * @return TaskId 指标采集任务id。必填字段
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 指标采集任务id。必填字段
     * @param TaskId 指标采集任务id。必填字段
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 名称：长度不超过64字符，以字母开头，接受0-9,a-z,A-Z, _,-,中文字符。 
     * @return Name 名称：长度不超过64字符，以字母开头，接受0-9,a-z,A-Z, _,-,中文字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称：长度不超过64字符，以字母开头，接受0-9,a-z,A-Z, _,-,中文字符。
     * @param Name 名称：长度不超过64字符，以字母开头，接受0-9,a-z,A-Z, _,-,中文字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 云产品命名空间。 
     * @return Namespace 云产品命名空间。
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 云产品命名空间。
     * @param Namespace 云产品命名空间。
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 指标配置信息。 
     * @return Metrics 指标配置信息。
     */
    public MetricConfig [] getMetrics() {
        return this.Metrics;
    }

    /**
     * Set 指标配置信息。
     * @param Metrics 指标配置信息。
     */
    public void setMetrics(MetricConfig [] Metrics) {
        this.Metrics = Metrics;
    }

    /**
     * Get 实例配置信息。 
     * @return InstanceInfo 实例配置信息。
     */
    public InstanceConfig getInstanceInfo() {
        return this.InstanceInfo;
    }

    /**
     * Set 实例配置信息。
     * @param InstanceInfo 实例配置信息。
     */
    public void setInstanceInfo(InstanceConfig InstanceInfo) {
        this.InstanceInfo = InstanceInfo;
    }

    /**
     * Get 任务状态。

1： 未启用

2： 启用 
     * @return Enable 任务状态。

1： 未启用

2： 启用
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 任务状态。

1： 未启用

2： 启用
     * @param Enable 任务状态。

1： 未启用

2： 启用
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    public ModifyMetricSubscribeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMetricSubscribeRequest(ModifyMetricSubscribeRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Metrics != null) {
            this.Metrics = new MetricConfig[source.Metrics.length];
            for (int i = 0; i < source.Metrics.length; i++) {
                this.Metrics[i] = new MetricConfig(source.Metrics[i]);
            }
        }
        if (source.InstanceInfo != null) {
            this.InstanceInfo = new InstanceConfig(source.InstanceInfo);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamArrayObj(map, prefix + "Metrics.", this.Metrics);
        this.setParamObj(map, prefix + "InstanceInfo.", this.InstanceInfo);
        this.setParamSimple(map, prefix + "Enable", this.Enable);

    }
}

