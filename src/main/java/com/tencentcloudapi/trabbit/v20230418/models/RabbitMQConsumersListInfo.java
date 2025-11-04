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
package com.tencentcloudapi.trabbit.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RabbitMQConsumersListInfo extends AbstractModel {

    /**
    * 客户端Ip
    */
    @SerializedName("ClientIp")
    @Expose
    private String ClientIp;

    /**
    * 消费者Tag
    */
    @SerializedName("ConsumerTag")
    @Expose
    private String ConsumerTag;

    /**
    * 消费目标队列
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * 是否需要消费者手动 ack
    */
    @SerializedName("AckRequired")
    @Expose
    private Boolean AckRequired;

    /**
    * 消费者 qos 值
    */
    @SerializedName("PrefetchCount")
    @Expose
    private Long PrefetchCount;

    /**
    * 消费者状态
    */
    @SerializedName("Active")
    @Expose
    private String Active;

    /**
    * 最后一次投递消息时间
    */
    @SerializedName("LastDeliveredTime")
    @Expose
    private String LastDeliveredTime;

    /**
    * 消费者未确认消息数
    */
    @SerializedName("UnAckMsgCount")
    @Expose
    private Long UnAckMsgCount;

    /**
    * consumer 所属的 channel 
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
     * Get 客户端Ip 
     * @return ClientIp 客户端Ip
     */
    public String getClientIp() {
        return this.ClientIp;
    }

    /**
     * Set 客户端Ip
     * @param ClientIp 客户端Ip
     */
    public void setClientIp(String ClientIp) {
        this.ClientIp = ClientIp;
    }

    /**
     * Get 消费者Tag 
     * @return ConsumerTag 消费者Tag
     */
    public String getConsumerTag() {
        return this.ConsumerTag;
    }

    /**
     * Set 消费者Tag
     * @param ConsumerTag 消费者Tag
     */
    public void setConsumerTag(String ConsumerTag) {
        this.ConsumerTag = ConsumerTag;
    }

    /**
     * Get 消费目标队列 
     * @return QueueName 消费目标队列
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set 消费目标队列
     * @param QueueName 消费目标队列
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get 是否需要消费者手动 ack 
     * @return AckRequired 是否需要消费者手动 ack
     */
    public Boolean getAckRequired() {
        return this.AckRequired;
    }

    /**
     * Set 是否需要消费者手动 ack
     * @param AckRequired 是否需要消费者手动 ack
     */
    public void setAckRequired(Boolean AckRequired) {
        this.AckRequired = AckRequired;
    }

    /**
     * Get 消费者 qos 值 
     * @return PrefetchCount 消费者 qos 值
     */
    public Long getPrefetchCount() {
        return this.PrefetchCount;
    }

    /**
     * Set 消费者 qos 值
     * @param PrefetchCount 消费者 qos 值
     */
    public void setPrefetchCount(Long PrefetchCount) {
        this.PrefetchCount = PrefetchCount;
    }

    /**
     * Get 消费者状态 
     * @return Active 消费者状态
     */
    public String getActive() {
        return this.Active;
    }

    /**
     * Set 消费者状态
     * @param Active 消费者状态
     */
    public void setActive(String Active) {
        this.Active = Active;
    }

    /**
     * Get 最后一次投递消息时间 
     * @return LastDeliveredTime 最后一次投递消息时间
     */
    public String getLastDeliveredTime() {
        return this.LastDeliveredTime;
    }

    /**
     * Set 最后一次投递消息时间
     * @param LastDeliveredTime 最后一次投递消息时间
     */
    public void setLastDeliveredTime(String LastDeliveredTime) {
        this.LastDeliveredTime = LastDeliveredTime;
    }

    /**
     * Get 消费者未确认消息数 
     * @return UnAckMsgCount 消费者未确认消息数
     */
    public Long getUnAckMsgCount() {
        return this.UnAckMsgCount;
    }

    /**
     * Set 消费者未确认消息数
     * @param UnAckMsgCount 消费者未确认消息数
     */
    public void setUnAckMsgCount(Long UnAckMsgCount) {
        this.UnAckMsgCount = UnAckMsgCount;
    }

    /**
     * Get consumer 所属的 channel  
     * @return ChannelName consumer 所属的 channel 
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set consumer 所属的 channel 
     * @param ChannelName consumer 所属的 channel 
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    public RabbitMQConsumersListInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RabbitMQConsumersListInfo(RabbitMQConsumersListInfo source) {
        if (source.ClientIp != null) {
            this.ClientIp = new String(source.ClientIp);
        }
        if (source.ConsumerTag != null) {
            this.ConsumerTag = new String(source.ConsumerTag);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.AckRequired != null) {
            this.AckRequired = new Boolean(source.AckRequired);
        }
        if (source.PrefetchCount != null) {
            this.PrefetchCount = new Long(source.PrefetchCount);
        }
        if (source.Active != null) {
            this.Active = new String(source.Active);
        }
        if (source.LastDeliveredTime != null) {
            this.LastDeliveredTime = new String(source.LastDeliveredTime);
        }
        if (source.UnAckMsgCount != null) {
            this.UnAckMsgCount = new Long(source.UnAckMsgCount);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientIp", this.ClientIp);
        this.setParamSimple(map, prefix + "ConsumerTag", this.ConsumerTag);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "AckRequired", this.AckRequired);
        this.setParamSimple(map, prefix + "PrefetchCount", this.PrefetchCount);
        this.setParamSimple(map, prefix + "Active", this.Active);
        this.setParamSimple(map, prefix + "LastDeliveredTime", this.LastDeliveredTime);
        this.setParamSimple(map, prefix + "UnAckMsgCount", this.UnAckMsgCount);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);

    }
}

