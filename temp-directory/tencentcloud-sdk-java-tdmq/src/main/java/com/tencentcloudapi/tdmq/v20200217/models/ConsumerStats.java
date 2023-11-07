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

public class ConsumerStats extends AbstractModel {

    /**
    * 主题名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 所属Broker
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BrokerName")
    @Expose
    private String BrokerName;

    /**
    * 队列编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueueId")
    @Expose
    private Long QueueId;

    /**
    * 消费者ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConsumerClientId")
    @Expose
    private String ConsumerClientId;

    /**
    * 消费位点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConsumerOffset")
    @Expose
    private Long ConsumerOffset;

    /**
    * 服务端位点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BrokerOffset")
    @Expose
    private Long BrokerOffset;

    /**
    * 消息堆积条数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiffTotal")
    @Expose
    private Long DiffTotal;

    /**
    * 最近消费时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastTimestamp")
    @Expose
    private Long LastTimestamp;

    /**
     * Get 主题名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicName 主题名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 主题名
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicName 主题名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 所属Broker
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BrokerName 所属Broker
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBrokerName() {
        return this.BrokerName;
    }

    /**
     * Set 所属Broker
注意：此字段可能返回 null，表示取不到有效值。
     * @param BrokerName 所属Broker
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBrokerName(String BrokerName) {
        this.BrokerName = BrokerName;
    }

    /**
     * Get 队列编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueueId 队列编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getQueueId() {
        return this.QueueId;
    }

    /**
     * Set 队列编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueueId 队列编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueueId(Long QueueId) {
        this.QueueId = QueueId;
    }

    /**
     * Get 消费者ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConsumerClientId 消费者ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConsumerClientId() {
        return this.ConsumerClientId;
    }

    /**
     * Set 消费者ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConsumerClientId 消费者ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConsumerClientId(String ConsumerClientId) {
        this.ConsumerClientId = ConsumerClientId;
    }

    /**
     * Get 消费位点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConsumerOffset 消费位点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getConsumerOffset() {
        return this.ConsumerOffset;
    }

    /**
     * Set 消费位点
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConsumerOffset 消费位点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConsumerOffset(Long ConsumerOffset) {
        this.ConsumerOffset = ConsumerOffset;
    }

    /**
     * Get 服务端位点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BrokerOffset 服务端位点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBrokerOffset() {
        return this.BrokerOffset;
    }

    /**
     * Set 服务端位点
注意：此字段可能返回 null，表示取不到有效值。
     * @param BrokerOffset 服务端位点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBrokerOffset(Long BrokerOffset) {
        this.BrokerOffset = BrokerOffset;
    }

    /**
     * Get 消息堆积条数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiffTotal 消息堆积条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDiffTotal() {
        return this.DiffTotal;
    }

    /**
     * Set 消息堆积条数
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiffTotal 消息堆积条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiffTotal(Long DiffTotal) {
        this.DiffTotal = DiffTotal;
    }

    /**
     * Get 最近消费时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastTimestamp 最近消费时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLastTimestamp() {
        return this.LastTimestamp;
    }

    /**
     * Set 最近消费时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastTimestamp 最近消费时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastTimestamp(Long LastTimestamp) {
        this.LastTimestamp = LastTimestamp;
    }

    public ConsumerStats() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConsumerStats(ConsumerStats source) {
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.BrokerName != null) {
            this.BrokerName = new String(source.BrokerName);
        }
        if (source.QueueId != null) {
            this.QueueId = new Long(source.QueueId);
        }
        if (source.ConsumerClientId != null) {
            this.ConsumerClientId = new String(source.ConsumerClientId);
        }
        if (source.ConsumerOffset != null) {
            this.ConsumerOffset = new Long(source.ConsumerOffset);
        }
        if (source.BrokerOffset != null) {
            this.BrokerOffset = new Long(source.BrokerOffset);
        }
        if (source.DiffTotal != null) {
            this.DiffTotal = new Long(source.DiffTotal);
        }
        if (source.LastTimestamp != null) {
            this.LastTimestamp = new Long(source.LastTimestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "BrokerName", this.BrokerName);
        this.setParamSimple(map, prefix + "QueueId", this.QueueId);
        this.setParamSimple(map, prefix + "ConsumerClientId", this.ConsumerClientId);
        this.setParamSimple(map, prefix + "ConsumerOffset", this.ConsumerOffset);
        this.setParamSimple(map, prefix + "BrokerOffset", this.BrokerOffset);
        this.setParamSimple(map, prefix + "DiffTotal", this.DiffTotal);
        this.setParamSimple(map, prefix + "LastTimestamp", this.LastTimestamp);

    }
}

