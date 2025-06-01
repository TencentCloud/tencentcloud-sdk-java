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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMessageByTopicRequest extends AbstractModel {

    /**
    * 腾讯云MQTT实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * home/room
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
    * 查询消息条数，最大1024，默认100.
    */
    @SerializedName("MaxNumber")
    @Expose
    private Long MaxNumber;

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
     * Get home/room 
     * @return Topic home/room
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set home/room
     * @param Topic home/room
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
     * Get 查询消息条数，最大1024，默认100. 
     * @return MaxNumber 查询消息条数，最大1024，默认100.
     */
    public Long getMaxNumber() {
        return this.MaxNumber;
    }

    /**
     * Set 查询消息条数，最大1024，默认100.
     * @param MaxNumber 查询消息条数，最大1024，默认100.
     */
    public void setMaxNumber(Long MaxNumber) {
        this.MaxNumber = MaxNumber;
    }

    public DescribeMessageByTopicRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMessageByTopicRequest(DescribeMessageByTopicRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.MaxNumber != null) {
            this.MaxNumber = new Long(source.MaxNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "MaxNumber", this.MaxNumber);

    }
}

