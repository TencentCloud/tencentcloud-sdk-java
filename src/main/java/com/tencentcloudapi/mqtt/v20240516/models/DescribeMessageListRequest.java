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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMessageListRequest extends AbstractModel {

    /**
    * 腾讯云MQTT实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 要查询的一级Topic，可从 [查询MQTT主题列表](https://cloud.tencent.com/document/product/1778/111082) 获取。
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * 开始时间，毫秒级时间戳 。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间，毫秒级时间戳 。
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 请求任务id，用于相同查询参数下查询加速，第一次查询时无需传递，第一次查询会根据本次查询参数生成查询任务ID，保留查询条件，查询下一页消息时可传递第一次查询返回的任务ID。
    */
    @SerializedName("TaskRequestId")
    @Expose
    private String TaskRequestId;

    /**
    * 查询起始位置，默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 查询结果限制数量，默认20，最大50
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 腾讯云MQTT实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。 
     * @return InstanceId 腾讯云MQTT实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 腾讯云MQTT实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。
     * @param InstanceId 腾讯云MQTT实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 要查询的一级Topic，可从 [查询MQTT主题列表](https://cloud.tencent.com/document/product/1778/111082) 获取。 
     * @return Topic 要查询的一级Topic，可从 [查询MQTT主题列表](https://cloud.tencent.com/document/product/1778/111082) 获取。
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set 要查询的一级Topic，可从 [查询MQTT主题列表](https://cloud.tencent.com/document/product/1778/111082) 获取。
     * @param Topic 要查询的一级Topic，可从 [查询MQTT主题列表](https://cloud.tencent.com/document/product/1778/111082) 获取。
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get 开始时间，毫秒级时间戳 。 
     * @return StartTime 开始时间，毫秒级时间戳 。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间，毫秒级时间戳 。
     * @param StartTime 开始时间，毫秒级时间戳 。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间，毫秒级时间戳 。 
     * @return EndTime 结束时间，毫秒级时间戳 。
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，毫秒级时间戳 。
     * @param EndTime 结束时间，毫秒级时间戳 。
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 请求任务id，用于相同查询参数下查询加速，第一次查询时无需传递，第一次查询会根据本次查询参数生成查询任务ID，保留查询条件，查询下一页消息时可传递第一次查询返回的任务ID。 
     * @return TaskRequestId 请求任务id，用于相同查询参数下查询加速，第一次查询时无需传递，第一次查询会根据本次查询参数生成查询任务ID，保留查询条件，查询下一页消息时可传递第一次查询返回的任务ID。
     */
    public String getTaskRequestId() {
        return this.TaskRequestId;
    }

    /**
     * Set 请求任务id，用于相同查询参数下查询加速，第一次查询时无需传递，第一次查询会根据本次查询参数生成查询任务ID，保留查询条件，查询下一页消息时可传递第一次查询返回的任务ID。
     * @param TaskRequestId 请求任务id，用于相同查询参数下查询加速，第一次查询时无需传递，第一次查询会根据本次查询参数生成查询任务ID，保留查询条件，查询下一页消息时可传递第一次查询返回的任务ID。
     */
    public void setTaskRequestId(String TaskRequestId) {
        this.TaskRequestId = TaskRequestId;
    }

    /**
     * Get 查询起始位置，默认0 
     * @return Offset 查询起始位置，默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询起始位置，默认0
     * @param Offset 查询起始位置，默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 查询结果限制数量，默认20，最大50 
     * @return Limit 查询结果限制数量，默认20，最大50
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询结果限制数量，默认20，最大50
     * @param Limit 查询结果限制数量，默认20，最大50
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeMessageListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMessageListRequest(DescribeMessageListRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.TaskRequestId != null) {
            this.TaskRequestId = new String(source.TaskRequestId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TaskRequestId", this.TaskRequestId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

