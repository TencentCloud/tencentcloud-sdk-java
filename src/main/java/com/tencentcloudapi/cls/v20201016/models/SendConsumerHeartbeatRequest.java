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

public class SendConsumerHeartbeatRequest extends AbstractModel {

    /**
    * 上报心跳的消费组标识
    */
    @SerializedName("ConsumerGroup")
    @Expose
    private String ConsumerGroup;

    /**
    * 上报心跳的消费者名称
（字母数字下划线，不允许数字、_开头， 长度小于256）
    */
    @SerializedName("Consumer")
    @Expose
    private String Consumer;

    /**
    * 日志集ID
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * topic 分区信息
    */
    @SerializedName("TopicPartitionsInfo")
    @Expose
    private TopicPartitionInfo [] TopicPartitionsInfo;

    /**
     * Get 上报心跳的消费组标识 
     * @return ConsumerGroup 上报心跳的消费组标识
     */
    public String getConsumerGroup() {
        return this.ConsumerGroup;
    }

    /**
     * Set 上报心跳的消费组标识
     * @param ConsumerGroup 上报心跳的消费组标识
     */
    public void setConsumerGroup(String ConsumerGroup) {
        this.ConsumerGroup = ConsumerGroup;
    }

    /**
     * Get 上报心跳的消费者名称
（字母数字下划线，不允许数字、_开头， 长度小于256） 
     * @return Consumer 上报心跳的消费者名称
（字母数字下划线，不允许数字、_开头， 长度小于256）
     */
    public String getConsumer() {
        return this.Consumer;
    }

    /**
     * Set 上报心跳的消费者名称
（字母数字下划线，不允许数字、_开头， 长度小于256）
     * @param Consumer 上报心跳的消费者名称
（字母数字下划线，不允许数字、_开头， 长度小于256）
     */
    public void setConsumer(String Consumer) {
        this.Consumer = Consumer;
    }

    /**
     * Get 日志集ID 
     * @return LogsetId 日志集ID
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set 日志集ID
     * @param LogsetId 日志集ID
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get topic 分区信息 
     * @return TopicPartitionsInfo topic 分区信息
     */
    public TopicPartitionInfo [] getTopicPartitionsInfo() {
        return this.TopicPartitionsInfo;
    }

    /**
     * Set topic 分区信息
     * @param TopicPartitionsInfo topic 分区信息
     */
    public void setTopicPartitionsInfo(TopicPartitionInfo [] TopicPartitionsInfo) {
        this.TopicPartitionsInfo = TopicPartitionsInfo;
    }

    public SendConsumerHeartbeatRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendConsumerHeartbeatRequest(SendConsumerHeartbeatRequest source) {
        if (source.ConsumerGroup != null) {
            this.ConsumerGroup = new String(source.ConsumerGroup);
        }
        if (source.Consumer != null) {
            this.Consumer = new String(source.Consumer);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.TopicPartitionsInfo != null) {
            this.TopicPartitionsInfo = new TopicPartitionInfo[source.TopicPartitionsInfo.length];
            for (int i = 0; i < source.TopicPartitionsInfo.length; i++) {
                this.TopicPartitionsInfo[i] = new TopicPartitionInfo(source.TopicPartitionsInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConsumerGroup", this.ConsumerGroup);
        this.setParamSimple(map, prefix + "Consumer", this.Consumer);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamArrayObj(map, prefix + "TopicPartitionsInfo.", this.TopicPartitionsInfo);

    }
}

