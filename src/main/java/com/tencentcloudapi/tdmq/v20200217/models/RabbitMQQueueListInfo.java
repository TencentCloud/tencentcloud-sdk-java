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

public class RabbitMQQueueListInfo extends AbstractModel {

    /**
    * 队列名
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * 备注说明
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 消费者信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConsumerDetail")
    @Expose
    private RabbitMQQueueListConsumerDetailInfo ConsumerDetail;

    /**
    * 队列类型，取值 "classic"，"quorum"
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueueType")
    @Expose
    private String QueueType;

    /**
    * 消息堆积数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MessageHeapCount")
    @Expose
    private Long MessageHeapCount;

    /**
    * 消息生产速率，每秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MessageRateIn")
    @Expose
    private Float MessageRateIn;

    /**
    * 消息消费速率，每秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MessageRateOut")
    @Expose
    private Float MessageRateOut;

    /**
     * Get 队列名 
     * @return QueueName 队列名
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set 队列名
     * @param QueueName 队列名
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get 备注说明
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 备注说明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注说明
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 备注说明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 消费者信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConsumerDetail 消费者信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RabbitMQQueueListConsumerDetailInfo getConsumerDetail() {
        return this.ConsumerDetail;
    }

    /**
     * Set 消费者信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConsumerDetail 消费者信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConsumerDetail(RabbitMQQueueListConsumerDetailInfo ConsumerDetail) {
        this.ConsumerDetail = ConsumerDetail;
    }

    /**
     * Get 队列类型，取值 "classic"，"quorum"
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueueType 队列类型，取值 "classic"，"quorum"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQueueType() {
        return this.QueueType;
    }

    /**
     * Set 队列类型，取值 "classic"，"quorum"
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueueType 队列类型，取值 "classic"，"quorum"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueueType(String QueueType) {
        this.QueueType = QueueType;
    }

    /**
     * Get 消息堆积数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MessageHeapCount 消息堆积数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMessageHeapCount() {
        return this.MessageHeapCount;
    }

    /**
     * Set 消息堆积数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MessageHeapCount 消息堆积数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessageHeapCount(Long MessageHeapCount) {
        this.MessageHeapCount = MessageHeapCount;
    }

    /**
     * Get 消息生产速率，每秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MessageRateIn 消息生产速率，每秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getMessageRateIn() {
        return this.MessageRateIn;
    }

    /**
     * Set 消息生产速率，每秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param MessageRateIn 消息生产速率，每秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessageRateIn(Float MessageRateIn) {
        this.MessageRateIn = MessageRateIn;
    }

    /**
     * Get 消息消费速率，每秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MessageRateOut 消息消费速率，每秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getMessageRateOut() {
        return this.MessageRateOut;
    }

    /**
     * Set 消息消费速率，每秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param MessageRateOut 消息消费速率，每秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessageRateOut(Float MessageRateOut) {
        this.MessageRateOut = MessageRateOut;
    }

    public RabbitMQQueueListInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RabbitMQQueueListInfo(RabbitMQQueueListInfo source) {
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ConsumerDetail != null) {
            this.ConsumerDetail = new RabbitMQQueueListConsumerDetailInfo(source.ConsumerDetail);
        }
        if (source.QueueType != null) {
            this.QueueType = new String(source.QueueType);
        }
        if (source.MessageHeapCount != null) {
            this.MessageHeapCount = new Long(source.MessageHeapCount);
        }
        if (source.MessageRateIn != null) {
            this.MessageRateIn = new Float(source.MessageRateIn);
        }
        if (source.MessageRateOut != null) {
            this.MessageRateOut = new Float(source.MessageRateOut);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamObj(map, prefix + "ConsumerDetail.", this.ConsumerDetail);
        this.setParamSimple(map, prefix + "QueueType", this.QueueType);
        this.setParamSimple(map, prefix + "MessageHeapCount", this.MessageHeapCount);
        this.setParamSimple(map, prefix + "MessageRateIn", this.MessageRateIn);
        this.setParamSimple(map, prefix + "MessageRateOut", this.MessageRateOut);

    }
}

