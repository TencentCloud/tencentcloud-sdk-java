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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RocketMQConsumerTopic extends AbstractModel {

    /**
    * 主题名称
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * 主题类型，Normal表示普通，GlobalOrder表示全局顺序，PartitionedOrder表示局部顺序，Transaction表示事务，Retry表示重试，DeadLetter表示死信
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 分区数
    */
    @SerializedName("PartitionNum")
    @Expose
    private Long PartitionNum;

    /**
    * 消息堆积数
    */
    @SerializedName("Accumulative")
    @Expose
    private Long Accumulative;

    /**
    * 最后消费时间，以毫秒为单位
    */
    @SerializedName("LastConsumptionTime")
    @Expose
    private Long LastConsumptionTime;

    /**
    * 订阅规则
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubRule")
    @Expose
    private String SubRule;

    /**
     * Get 主题名称 
     * @return Topic 主题名称
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set 主题名称
     * @param Topic 主题名称
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get 主题类型，Normal表示普通，GlobalOrder表示全局顺序，PartitionedOrder表示局部顺序，Transaction表示事务，Retry表示重试，DeadLetter表示死信 
     * @return Type 主题类型，Normal表示普通，GlobalOrder表示全局顺序，PartitionedOrder表示局部顺序，Transaction表示事务，Retry表示重试，DeadLetter表示死信
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 主题类型，Normal表示普通，GlobalOrder表示全局顺序，PartitionedOrder表示局部顺序，Transaction表示事务，Retry表示重试，DeadLetter表示死信
     * @param Type 主题类型，Normal表示普通，GlobalOrder表示全局顺序，PartitionedOrder表示局部顺序，Transaction表示事务，Retry表示重试，DeadLetter表示死信
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 分区数 
     * @return PartitionNum 分区数
     */
    public Long getPartitionNum() {
        return this.PartitionNum;
    }

    /**
     * Set 分区数
     * @param PartitionNum 分区数
     */
    public void setPartitionNum(Long PartitionNum) {
        this.PartitionNum = PartitionNum;
    }

    /**
     * Get 消息堆积数 
     * @return Accumulative 消息堆积数
     */
    public Long getAccumulative() {
        return this.Accumulative;
    }

    /**
     * Set 消息堆积数
     * @param Accumulative 消息堆积数
     */
    public void setAccumulative(Long Accumulative) {
        this.Accumulative = Accumulative;
    }

    /**
     * Get 最后消费时间，以毫秒为单位 
     * @return LastConsumptionTime 最后消费时间，以毫秒为单位
     */
    public Long getLastConsumptionTime() {
        return this.LastConsumptionTime;
    }

    /**
     * Set 最后消费时间，以毫秒为单位
     * @param LastConsumptionTime 最后消费时间，以毫秒为单位
     */
    public void setLastConsumptionTime(Long LastConsumptionTime) {
        this.LastConsumptionTime = LastConsumptionTime;
    }

    /**
     * Get 订阅规则
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubRule 订阅规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubRule() {
        return this.SubRule;
    }

    /**
     * Set 订阅规则
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubRule 订阅规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubRule(String SubRule) {
        this.SubRule = SubRule;
    }

    public RocketMQConsumerTopic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RocketMQConsumerTopic(RocketMQConsumerTopic source) {
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.PartitionNum != null) {
            this.PartitionNum = new Long(source.PartitionNum);
        }
        if (source.Accumulative != null) {
            this.Accumulative = new Long(source.Accumulative);
        }
        if (source.LastConsumptionTime != null) {
            this.LastConsumptionTime = new Long(source.LastConsumptionTime);
        }
        if (source.SubRule != null) {
            this.SubRule = new String(source.SubRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "PartitionNum", this.PartitionNum);
        this.setParamSimple(map, prefix + "Accumulative", this.Accumulative);
        this.setParamSimple(map, prefix + "LastConsumptionTime", this.LastConsumptionTime);
        this.setParamSimple(map, prefix + "SubRule", this.SubRule);

    }
}

