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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RocketMQMsgLog extends AbstractModel{

    /**
    * 消息id
    */
    @SerializedName("MsgId")
    @Expose
    private String MsgId;

    /**
    * 消息tag
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MsgTag")
    @Expose
    private String MsgTag;

    /**
    * 消息key
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MsgKey")
    @Expose
    private String MsgKey;

    /**
    * 客户端地址
    */
    @SerializedName("ProducerAddr")
    @Expose
    private String ProducerAddr;

    /**
    * 消息发送时间
    */
    @SerializedName("ProduceTime")
    @Expose
    private String ProduceTime;

    /**
    * pulsar消息id
    */
    @SerializedName("PulsarMsgId")
    @Expose
    private String PulsarMsgId;

    /**
    * 死信重发次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeadLetterResendTimes")
    @Expose
    private Long DeadLetterResendTimes;

    /**
    * 死信重发成功次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResendSuccessCount")
    @Expose
    private Long ResendSuccessCount;

    /**
     * Get 消息id 
     * @return MsgId 消息id
     */
    public String getMsgId() {
        return this.MsgId;
    }

    /**
     * Set 消息id
     * @param MsgId 消息id
     */
    public void setMsgId(String MsgId) {
        this.MsgId = MsgId;
    }

    /**
     * Get 消息tag
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MsgTag 消息tag
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMsgTag() {
        return this.MsgTag;
    }

    /**
     * Set 消息tag
注意：此字段可能返回 null，表示取不到有效值。
     * @param MsgTag 消息tag
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsgTag(String MsgTag) {
        this.MsgTag = MsgTag;
    }

    /**
     * Get 消息key
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MsgKey 消息key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMsgKey() {
        return this.MsgKey;
    }

    /**
     * Set 消息key
注意：此字段可能返回 null，表示取不到有效值。
     * @param MsgKey 消息key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsgKey(String MsgKey) {
        this.MsgKey = MsgKey;
    }

    /**
     * Get 客户端地址 
     * @return ProducerAddr 客户端地址
     */
    public String getProducerAddr() {
        return this.ProducerAddr;
    }

    /**
     * Set 客户端地址
     * @param ProducerAddr 客户端地址
     */
    public void setProducerAddr(String ProducerAddr) {
        this.ProducerAddr = ProducerAddr;
    }

    /**
     * Get 消息发送时间 
     * @return ProduceTime 消息发送时间
     */
    public String getProduceTime() {
        return this.ProduceTime;
    }

    /**
     * Set 消息发送时间
     * @param ProduceTime 消息发送时间
     */
    public void setProduceTime(String ProduceTime) {
        this.ProduceTime = ProduceTime;
    }

    /**
     * Get pulsar消息id 
     * @return PulsarMsgId pulsar消息id
     */
    public String getPulsarMsgId() {
        return this.PulsarMsgId;
    }

    /**
     * Set pulsar消息id
     * @param PulsarMsgId pulsar消息id
     */
    public void setPulsarMsgId(String PulsarMsgId) {
        this.PulsarMsgId = PulsarMsgId;
    }

    /**
     * Get 死信重发次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeadLetterResendTimes 死信重发次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDeadLetterResendTimes() {
        return this.DeadLetterResendTimes;
    }

    /**
     * Set 死信重发次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeadLetterResendTimes 死信重发次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeadLetterResendTimes(Long DeadLetterResendTimes) {
        this.DeadLetterResendTimes = DeadLetterResendTimes;
    }

    /**
     * Get 死信重发成功次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResendSuccessCount 死信重发成功次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getResendSuccessCount() {
        return this.ResendSuccessCount;
    }

    /**
     * Set 死信重发成功次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResendSuccessCount 死信重发成功次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResendSuccessCount(Long ResendSuccessCount) {
        this.ResendSuccessCount = ResendSuccessCount;
    }

    public RocketMQMsgLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RocketMQMsgLog(RocketMQMsgLog source) {
        if (source.MsgId != null) {
            this.MsgId = new String(source.MsgId);
        }
        if (source.MsgTag != null) {
            this.MsgTag = new String(source.MsgTag);
        }
        if (source.MsgKey != null) {
            this.MsgKey = new String(source.MsgKey);
        }
        if (source.ProducerAddr != null) {
            this.ProducerAddr = new String(source.ProducerAddr);
        }
        if (source.ProduceTime != null) {
            this.ProduceTime = new String(source.ProduceTime);
        }
        if (source.PulsarMsgId != null) {
            this.PulsarMsgId = new String(source.PulsarMsgId);
        }
        if (source.DeadLetterResendTimes != null) {
            this.DeadLetterResendTimes = new Long(source.DeadLetterResendTimes);
        }
        if (source.ResendSuccessCount != null) {
            this.ResendSuccessCount = new Long(source.ResendSuccessCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MsgId", this.MsgId);
        this.setParamSimple(map, prefix + "MsgTag", this.MsgTag);
        this.setParamSimple(map, prefix + "MsgKey", this.MsgKey);
        this.setParamSimple(map, prefix + "ProducerAddr", this.ProducerAddr);
        this.setParamSimple(map, prefix + "ProduceTime", this.ProduceTime);
        this.setParamSimple(map, prefix + "PulsarMsgId", this.PulsarMsgId);
        this.setParamSimple(map, prefix + "DeadLetterResendTimes", this.DeadLetterResendTimes);
        this.setParamSimple(map, prefix + "ResendSuccessCount", this.ResendSuccessCount);

    }
}

