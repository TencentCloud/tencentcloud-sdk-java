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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTopicRequest extends AbstractModel {

    /**
    * 环境（命名空间）名称。
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * 主题名，不支持中字以及除了短线和下划线外的特殊字符且不超过64个字符。
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 入参为1，即是创建非分区topic，无分区；入参大于1，表示分区topic的分区数，最大不允许超过32。
    */
    @SerializedName("Partitions")
    @Expose
    private Long Partitions;

    /**
    * Pulsar 集群的ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 备注，128字符以内。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 该入参将逐步弃用，可切换至PulsarTopicType参数
0： 普通消息；
1 ：全局顺序消息；
2 ：局部顺序消息；
3 ：重试队列；
4 ：死信队列。
    */
    @SerializedName("TopicType")
    @Expose
    private Long TopicType;

    /**
    * Pulsar 主题类型
0: 非持久非分区
1: 非持久分区
2: 持久非分区
3: 持久分区
    */
    @SerializedName("PulsarTopicType")
    @Expose
    private Long PulsarTopicType;

    /**
    * 未消费消息过期时间，单位：秒，取值范围：60秒~15天。
    */
    @SerializedName("MsgTTL")
    @Expose
    private Long MsgTTL;

    /**
    * 不传默认是原生策略，DefaultPolicy表示当订阅下达到最大未确认消息数 5000 时，服务端将不再向当前订阅下的所有消费者推送消息，DynamicPolicy表示动态调整订阅下的最大未确认消息数，具体配额是在 5000 和消费者数量*20之间取最大值。每个消费者默认最大 unack 消息数为 20，超过该限制时仅影响该消费者，不影响其他消费者。
    */
    @SerializedName("UnackPolicy")
    @Expose
    private String UnackPolicy;

    /**
     * Get 环境（命名空间）名称。 
     * @return EnvironmentId 环境（命名空间）名称。
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set 环境（命名空间）名称。
     * @param EnvironmentId 环境（命名空间）名称。
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get 主题名，不支持中字以及除了短线和下划线外的特殊字符且不超过64个字符。 
     * @return TopicName 主题名，不支持中字以及除了短线和下划线外的特殊字符且不超过64个字符。
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 主题名，不支持中字以及除了短线和下划线外的特殊字符且不超过64个字符。
     * @param TopicName 主题名，不支持中字以及除了短线和下划线外的特殊字符且不超过64个字符。
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 入参为1，即是创建非分区topic，无分区；入参大于1，表示分区topic的分区数，最大不允许超过32。 
     * @return Partitions 入参为1，即是创建非分区topic，无分区；入参大于1，表示分区topic的分区数，最大不允许超过32。
     */
    public Long getPartitions() {
        return this.Partitions;
    }

    /**
     * Set 入参为1，即是创建非分区topic，无分区；入参大于1，表示分区topic的分区数，最大不允许超过32。
     * @param Partitions 入参为1，即是创建非分区topic，无分区；入参大于1，表示分区topic的分区数，最大不允许超过32。
     */
    public void setPartitions(Long Partitions) {
        this.Partitions = Partitions;
    }

    /**
     * Get Pulsar 集群的ID 
     * @return ClusterId Pulsar 集群的ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Pulsar 集群的ID
     * @param ClusterId Pulsar 集群的ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 备注，128字符以内。 
     * @return Remark 备注，128字符以内。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注，128字符以内。
     * @param Remark 备注，128字符以内。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 该入参将逐步弃用，可切换至PulsarTopicType参数
0： 普通消息；
1 ：全局顺序消息；
2 ：局部顺序消息；
3 ：重试队列；
4 ：死信队列。 
     * @return TopicType 该入参将逐步弃用，可切换至PulsarTopicType参数
0： 普通消息；
1 ：全局顺序消息；
2 ：局部顺序消息；
3 ：重试队列；
4 ：死信队列。
     */
    public Long getTopicType() {
        return this.TopicType;
    }

    /**
     * Set 该入参将逐步弃用，可切换至PulsarTopicType参数
0： 普通消息；
1 ：全局顺序消息；
2 ：局部顺序消息；
3 ：重试队列；
4 ：死信队列。
     * @param TopicType 该入参将逐步弃用，可切换至PulsarTopicType参数
0： 普通消息；
1 ：全局顺序消息；
2 ：局部顺序消息；
3 ：重试队列；
4 ：死信队列。
     */
    public void setTopicType(Long TopicType) {
        this.TopicType = TopicType;
    }

    /**
     * Get Pulsar 主题类型
0: 非持久非分区
1: 非持久分区
2: 持久非分区
3: 持久分区 
     * @return PulsarTopicType Pulsar 主题类型
0: 非持久非分区
1: 非持久分区
2: 持久非分区
3: 持久分区
     */
    public Long getPulsarTopicType() {
        return this.PulsarTopicType;
    }

    /**
     * Set Pulsar 主题类型
0: 非持久非分区
1: 非持久分区
2: 持久非分区
3: 持久分区
     * @param PulsarTopicType Pulsar 主题类型
0: 非持久非分区
1: 非持久分区
2: 持久非分区
3: 持久分区
     */
    public void setPulsarTopicType(Long PulsarTopicType) {
        this.PulsarTopicType = PulsarTopicType;
    }

    /**
     * Get 未消费消息过期时间，单位：秒，取值范围：60秒~15天。 
     * @return MsgTTL 未消费消息过期时间，单位：秒，取值范围：60秒~15天。
     */
    public Long getMsgTTL() {
        return this.MsgTTL;
    }

    /**
     * Set 未消费消息过期时间，单位：秒，取值范围：60秒~15天。
     * @param MsgTTL 未消费消息过期时间，单位：秒，取值范围：60秒~15天。
     */
    public void setMsgTTL(Long MsgTTL) {
        this.MsgTTL = MsgTTL;
    }

    /**
     * Get 不传默认是原生策略，DefaultPolicy表示当订阅下达到最大未确认消息数 5000 时，服务端将不再向当前订阅下的所有消费者推送消息，DynamicPolicy表示动态调整订阅下的最大未确认消息数，具体配额是在 5000 和消费者数量*20之间取最大值。每个消费者默认最大 unack 消息数为 20，超过该限制时仅影响该消费者，不影响其他消费者。 
     * @return UnackPolicy 不传默认是原生策略，DefaultPolicy表示当订阅下达到最大未确认消息数 5000 时，服务端将不再向当前订阅下的所有消费者推送消息，DynamicPolicy表示动态调整订阅下的最大未确认消息数，具体配额是在 5000 和消费者数量*20之间取最大值。每个消费者默认最大 unack 消息数为 20，超过该限制时仅影响该消费者，不影响其他消费者。
     */
    public String getUnackPolicy() {
        return this.UnackPolicy;
    }

    /**
     * Set 不传默认是原生策略，DefaultPolicy表示当订阅下达到最大未确认消息数 5000 时，服务端将不再向当前订阅下的所有消费者推送消息，DynamicPolicy表示动态调整订阅下的最大未确认消息数，具体配额是在 5000 和消费者数量*20之间取最大值。每个消费者默认最大 unack 消息数为 20，超过该限制时仅影响该消费者，不影响其他消费者。
     * @param UnackPolicy 不传默认是原生策略，DefaultPolicy表示当订阅下达到最大未确认消息数 5000 时，服务端将不再向当前订阅下的所有消费者推送消息，DynamicPolicy表示动态调整订阅下的最大未确认消息数，具体配额是在 5000 和消费者数量*20之间取最大值。每个消费者默认最大 unack 消息数为 20，超过该限制时仅影响该消费者，不影响其他消费者。
     */
    public void setUnackPolicy(String UnackPolicy) {
        this.UnackPolicy = UnackPolicy;
    }

    public CreateTopicRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTopicRequest(CreateTopicRequest source) {
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.Partitions != null) {
            this.Partitions = new Long(source.Partitions);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.TopicType != null) {
            this.TopicType = new Long(source.TopicType);
        }
        if (source.PulsarTopicType != null) {
            this.PulsarTopicType = new Long(source.PulsarTopicType);
        }
        if (source.MsgTTL != null) {
            this.MsgTTL = new Long(source.MsgTTL);
        }
        if (source.UnackPolicy != null) {
            this.UnackPolicy = new String(source.UnackPolicy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "Partitions", this.Partitions);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "TopicType", this.TopicType);
        this.setParamSimple(map, prefix + "PulsarTopicType", this.PulsarTopicType);
        this.setParamSimple(map, prefix + "MsgTTL", this.MsgTTL);
        this.setParamSimple(map, prefix + "UnackPolicy", this.UnackPolicy);

    }
}

