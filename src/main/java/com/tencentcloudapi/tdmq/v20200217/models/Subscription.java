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

public class Subscription extends AbstractModel {

    /**
    * 主题名称。
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 环境（命名空间）名称。
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * 消费者开始连接的时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConnectedSince")
    @Expose
    private String ConnectedSince;

    /**
    * 消费者地址。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConsumerAddr")
    @Expose
    private String ConsumerAddr;

    /**
    * 消费者数量。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConsumerCount")
    @Expose
    private String ConsumerCount;

    /**
    * 消费者名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConsumerName")
    @Expose
    private String ConsumerName;

    /**
    * 堆积的消息数量。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MsgBacklog")
    @Expose
    private String MsgBacklog;

    /**
    * 于TTL，此订阅下没有被发送而是被丢弃的比例。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MsgRateExpired")
    @Expose
    private String MsgRateExpired;

    /**
    * 消费者每秒分发消息的数量之和。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MsgRateOut")
    @Expose
    private String MsgRateOut;

    /**
    * 消费者每秒消息的byte。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MsgThroughputOut")
    @Expose
    private String MsgThroughputOut;

    /**
    * 订阅名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubscriptionName")
    @Expose
    private String SubscriptionName;

    /**
    * 消费者集合。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConsumerSets")
    @Expose
    private Consumer [] ConsumerSets;

    /**
    * 是否在线。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsOnline")
    @Expose
    private Boolean IsOnline;

    /**
    * 消费进度集合。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConsumersScheduleSets")
    @Expose
    private ConsumersSchedule [] ConsumersScheduleSets;

    /**
    * 备注。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 最近修改时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 订阅类型，Exclusive，Shared，Failover， Key_Shared，空或NULL表示未知，
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubType")
    @Expose
    private String SubType;

    /**
    * 是否由于未 ack 数到达上限而被 block
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlockedSubscriptionOnUnackedMsgs")
    @Expose
    private Boolean BlockedSubscriptionOnUnackedMsgs;

    /**
    * 未 ack 消息数上限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxUnackedMsgNum")
    @Expose
    private Long MaxUnackedMsgNum;

    /**
     * Get 主题名称。 
     * @return TopicName 主题名称。
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 主题名称。
     * @param TopicName 主题名称。
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

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
     * Get 消费者开始连接的时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConnectedSince 消费者开始连接的时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConnectedSince() {
        return this.ConnectedSince;
    }

    /**
     * Set 消费者开始连接的时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConnectedSince 消费者开始连接的时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConnectedSince(String ConnectedSince) {
        this.ConnectedSince = ConnectedSince;
    }

    /**
     * Get 消费者地址。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConsumerAddr 消费者地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConsumerAddr() {
        return this.ConsumerAddr;
    }

    /**
     * Set 消费者地址。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConsumerAddr 消费者地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConsumerAddr(String ConsumerAddr) {
        this.ConsumerAddr = ConsumerAddr;
    }

    /**
     * Get 消费者数量。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConsumerCount 消费者数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConsumerCount() {
        return this.ConsumerCount;
    }

    /**
     * Set 消费者数量。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConsumerCount 消费者数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConsumerCount(String ConsumerCount) {
        this.ConsumerCount = ConsumerCount;
    }

    /**
     * Get 消费者名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConsumerName 消费者名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConsumerName() {
        return this.ConsumerName;
    }

    /**
     * Set 消费者名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConsumerName 消费者名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConsumerName(String ConsumerName) {
        this.ConsumerName = ConsumerName;
    }

    /**
     * Get 堆积的消息数量。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MsgBacklog 堆积的消息数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMsgBacklog() {
        return this.MsgBacklog;
    }

    /**
     * Set 堆积的消息数量。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MsgBacklog 堆积的消息数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsgBacklog(String MsgBacklog) {
        this.MsgBacklog = MsgBacklog;
    }

    /**
     * Get 于TTL，此订阅下没有被发送而是被丢弃的比例。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MsgRateExpired 于TTL，此订阅下没有被发送而是被丢弃的比例。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMsgRateExpired() {
        return this.MsgRateExpired;
    }

    /**
     * Set 于TTL，此订阅下没有被发送而是被丢弃的比例。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MsgRateExpired 于TTL，此订阅下没有被发送而是被丢弃的比例。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsgRateExpired(String MsgRateExpired) {
        this.MsgRateExpired = MsgRateExpired;
    }

    /**
     * Get 消费者每秒分发消息的数量之和。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MsgRateOut 消费者每秒分发消息的数量之和。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMsgRateOut() {
        return this.MsgRateOut;
    }

    /**
     * Set 消费者每秒分发消息的数量之和。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MsgRateOut 消费者每秒分发消息的数量之和。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsgRateOut(String MsgRateOut) {
        this.MsgRateOut = MsgRateOut;
    }

    /**
     * Get 消费者每秒消息的byte。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MsgThroughputOut 消费者每秒消息的byte。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMsgThroughputOut() {
        return this.MsgThroughputOut;
    }

    /**
     * Set 消费者每秒消息的byte。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MsgThroughputOut 消费者每秒消息的byte。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsgThroughputOut(String MsgThroughputOut) {
        this.MsgThroughputOut = MsgThroughputOut;
    }

    /**
     * Get 订阅名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubscriptionName 订阅名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubscriptionName() {
        return this.SubscriptionName;
    }

    /**
     * Set 订阅名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubscriptionName 订阅名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubscriptionName(String SubscriptionName) {
        this.SubscriptionName = SubscriptionName;
    }

    /**
     * Get 消费者集合。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConsumerSets 消费者集合。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Consumer [] getConsumerSets() {
        return this.ConsumerSets;
    }

    /**
     * Set 消费者集合。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConsumerSets 消费者集合。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConsumerSets(Consumer [] ConsumerSets) {
        this.ConsumerSets = ConsumerSets;
    }

    /**
     * Get 是否在线。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsOnline 是否在线。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsOnline() {
        return this.IsOnline;
    }

    /**
     * Set 是否在线。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsOnline 是否在线。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsOnline(Boolean IsOnline) {
        this.IsOnline = IsOnline;
    }

    /**
     * Get 消费进度集合。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConsumersScheduleSets 消费进度集合。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ConsumersSchedule [] getConsumersScheduleSets() {
        return this.ConsumersScheduleSets;
    }

    /**
     * Set 消费进度集合。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConsumersScheduleSets 消费进度集合。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConsumersScheduleSets(ConsumersSchedule [] ConsumersScheduleSets) {
        this.ConsumersScheduleSets = ConsumersScheduleSets;
    }

    /**
     * Get 备注。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 备注。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 备注。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 创建时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 最近修改时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 最近修改时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 最近修改时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 最近修改时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 订阅类型，Exclusive，Shared，Failover， Key_Shared，空或NULL表示未知，
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubType 订阅类型，Exclusive，Shared，Failover， Key_Shared，空或NULL表示未知，
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubType() {
        return this.SubType;
    }

    /**
     * Set 订阅类型，Exclusive，Shared，Failover， Key_Shared，空或NULL表示未知，
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubType 订阅类型，Exclusive，Shared，Failover， Key_Shared，空或NULL表示未知，
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubType(String SubType) {
        this.SubType = SubType;
    }

    /**
     * Get 是否由于未 ack 数到达上限而被 block
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockedSubscriptionOnUnackedMsgs 是否由于未 ack 数到达上限而被 block
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getBlockedSubscriptionOnUnackedMsgs() {
        return this.BlockedSubscriptionOnUnackedMsgs;
    }

    /**
     * Set 是否由于未 ack 数到达上限而被 block
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockedSubscriptionOnUnackedMsgs 是否由于未 ack 数到达上限而被 block
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlockedSubscriptionOnUnackedMsgs(Boolean BlockedSubscriptionOnUnackedMsgs) {
        this.BlockedSubscriptionOnUnackedMsgs = BlockedSubscriptionOnUnackedMsgs;
    }

    /**
     * Get 未 ack 消息数上限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxUnackedMsgNum 未 ack 消息数上限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxUnackedMsgNum() {
        return this.MaxUnackedMsgNum;
    }

    /**
     * Set 未 ack 消息数上限
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxUnackedMsgNum 未 ack 消息数上限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxUnackedMsgNum(Long MaxUnackedMsgNum) {
        this.MaxUnackedMsgNum = MaxUnackedMsgNum;
    }

    public Subscription() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Subscription(Subscription source) {
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.ConnectedSince != null) {
            this.ConnectedSince = new String(source.ConnectedSince);
        }
        if (source.ConsumerAddr != null) {
            this.ConsumerAddr = new String(source.ConsumerAddr);
        }
        if (source.ConsumerCount != null) {
            this.ConsumerCount = new String(source.ConsumerCount);
        }
        if (source.ConsumerName != null) {
            this.ConsumerName = new String(source.ConsumerName);
        }
        if (source.MsgBacklog != null) {
            this.MsgBacklog = new String(source.MsgBacklog);
        }
        if (source.MsgRateExpired != null) {
            this.MsgRateExpired = new String(source.MsgRateExpired);
        }
        if (source.MsgRateOut != null) {
            this.MsgRateOut = new String(source.MsgRateOut);
        }
        if (source.MsgThroughputOut != null) {
            this.MsgThroughputOut = new String(source.MsgThroughputOut);
        }
        if (source.SubscriptionName != null) {
            this.SubscriptionName = new String(source.SubscriptionName);
        }
        if (source.ConsumerSets != null) {
            this.ConsumerSets = new Consumer[source.ConsumerSets.length];
            for (int i = 0; i < source.ConsumerSets.length; i++) {
                this.ConsumerSets[i] = new Consumer(source.ConsumerSets[i]);
            }
        }
        if (source.IsOnline != null) {
            this.IsOnline = new Boolean(source.IsOnline);
        }
        if (source.ConsumersScheduleSets != null) {
            this.ConsumersScheduleSets = new ConsumersSchedule[source.ConsumersScheduleSets.length];
            for (int i = 0; i < source.ConsumersScheduleSets.length; i++) {
                this.ConsumersScheduleSets[i] = new ConsumersSchedule(source.ConsumersScheduleSets[i]);
            }
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.SubType != null) {
            this.SubType = new String(source.SubType);
        }
        if (source.BlockedSubscriptionOnUnackedMsgs != null) {
            this.BlockedSubscriptionOnUnackedMsgs = new Boolean(source.BlockedSubscriptionOnUnackedMsgs);
        }
        if (source.MaxUnackedMsgNum != null) {
            this.MaxUnackedMsgNum = new Long(source.MaxUnackedMsgNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "ConnectedSince", this.ConnectedSince);
        this.setParamSimple(map, prefix + "ConsumerAddr", this.ConsumerAddr);
        this.setParamSimple(map, prefix + "ConsumerCount", this.ConsumerCount);
        this.setParamSimple(map, prefix + "ConsumerName", this.ConsumerName);
        this.setParamSimple(map, prefix + "MsgBacklog", this.MsgBacklog);
        this.setParamSimple(map, prefix + "MsgRateExpired", this.MsgRateExpired);
        this.setParamSimple(map, prefix + "MsgRateOut", this.MsgRateOut);
        this.setParamSimple(map, prefix + "MsgThroughputOut", this.MsgThroughputOut);
        this.setParamSimple(map, prefix + "SubscriptionName", this.SubscriptionName);
        this.setParamArrayObj(map, prefix + "ConsumerSets.", this.ConsumerSets);
        this.setParamSimple(map, prefix + "IsOnline", this.IsOnline);
        this.setParamArrayObj(map, prefix + "ConsumersScheduleSets.", this.ConsumersScheduleSets);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "SubType", this.SubType);
        this.setParamSimple(map, prefix + "BlockedSubscriptionOnUnackedMsgs", this.BlockedSubscriptionOnUnackedMsgs);
        this.setParamSimple(map, prefix + "MaxUnackedMsgNum", this.MaxUnackedMsgNum);

    }
}

