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

public class PartitionsTopic extends AbstractModel{

    /**
    * 最后一次间隔内发布消息的平均byte大小。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AverageMsgSize")
    @Expose
    private String AverageMsgSize;

    /**
    * 消费者数量。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConsumerCount")
    @Expose
    private String ConsumerCount;

    /**
    * 被记录下来的消息总数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastConfirmedEntry")
    @Expose
    private String LastConfirmedEntry;

    /**
    * 最后一个ledger创建的时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastLedgerCreatedTimestamp")
    @Expose
    private String LastLedgerCreatedTimestamp;

    /**
    * 本地和复制的发布者每秒发布消息的速率。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MsgRateIn")
    @Expose
    private String MsgRateIn;

    /**
    * 本地和复制的消费者每秒分发消息的数量之和。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MsgRateOut")
    @Expose
    private String MsgRateOut;

    /**
    * 本地和复制的发布者每秒发布消息的byte。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MsgThroughputIn")
    @Expose
    private String MsgThroughputIn;

    /**
    * 本地和复制的消费者每秒分发消息的byte。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MsgThroughputOut")
    @Expose
    private String MsgThroughputOut;

    /**
    * 被记录下来的消息总数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NumberOfEntries")
    @Expose
    private String NumberOfEntries;

    /**
    * 子分区id。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Partitions")
    @Expose
    private Long Partitions;

    /**
    * 生产者数量。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProducerCount")
    @Expose
    private String ProducerCount;

    /**
    * 以byte计算的所有消息存储总量。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalSize")
    @Expose
    private String TotalSize;

    /**
    * topic类型描述。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicType")
    @Expose
    private Long TopicType;

    /**
     * Get 最后一次间隔内发布消息的平均byte大小。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AverageMsgSize 最后一次间隔内发布消息的平均byte大小。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAverageMsgSize() {
        return this.AverageMsgSize;
    }

    /**
     * Set 最后一次间隔内发布消息的平均byte大小。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AverageMsgSize 最后一次间隔内发布消息的平均byte大小。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAverageMsgSize(String AverageMsgSize) {
        this.AverageMsgSize = AverageMsgSize;
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
     * Get 被记录下来的消息总数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastConfirmedEntry 被记录下来的消息总数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastConfirmedEntry() {
        return this.LastConfirmedEntry;
    }

    /**
     * Set 被记录下来的消息总数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastConfirmedEntry 被记录下来的消息总数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastConfirmedEntry(String LastConfirmedEntry) {
        this.LastConfirmedEntry = LastConfirmedEntry;
    }

    /**
     * Get 最后一个ledger创建的时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastLedgerCreatedTimestamp 最后一个ledger创建的时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastLedgerCreatedTimestamp() {
        return this.LastLedgerCreatedTimestamp;
    }

    /**
     * Set 最后一个ledger创建的时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastLedgerCreatedTimestamp 最后一个ledger创建的时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastLedgerCreatedTimestamp(String LastLedgerCreatedTimestamp) {
        this.LastLedgerCreatedTimestamp = LastLedgerCreatedTimestamp;
    }

    /**
     * Get 本地和复制的发布者每秒发布消息的速率。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MsgRateIn 本地和复制的发布者每秒发布消息的速率。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMsgRateIn() {
        return this.MsgRateIn;
    }

    /**
     * Set 本地和复制的发布者每秒发布消息的速率。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MsgRateIn 本地和复制的发布者每秒发布消息的速率。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsgRateIn(String MsgRateIn) {
        this.MsgRateIn = MsgRateIn;
    }

    /**
     * Get 本地和复制的消费者每秒分发消息的数量之和。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MsgRateOut 本地和复制的消费者每秒分发消息的数量之和。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMsgRateOut() {
        return this.MsgRateOut;
    }

    /**
     * Set 本地和复制的消费者每秒分发消息的数量之和。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MsgRateOut 本地和复制的消费者每秒分发消息的数量之和。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsgRateOut(String MsgRateOut) {
        this.MsgRateOut = MsgRateOut;
    }

    /**
     * Get 本地和复制的发布者每秒发布消息的byte。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MsgThroughputIn 本地和复制的发布者每秒发布消息的byte。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMsgThroughputIn() {
        return this.MsgThroughputIn;
    }

    /**
     * Set 本地和复制的发布者每秒发布消息的byte。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MsgThroughputIn 本地和复制的发布者每秒发布消息的byte。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsgThroughputIn(String MsgThroughputIn) {
        this.MsgThroughputIn = MsgThroughputIn;
    }

    /**
     * Get 本地和复制的消费者每秒分发消息的byte。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MsgThroughputOut 本地和复制的消费者每秒分发消息的byte。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMsgThroughputOut() {
        return this.MsgThroughputOut;
    }

    /**
     * Set 本地和复制的消费者每秒分发消息的byte。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MsgThroughputOut 本地和复制的消费者每秒分发消息的byte。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsgThroughputOut(String MsgThroughputOut) {
        this.MsgThroughputOut = MsgThroughputOut;
    }

    /**
     * Get 被记录下来的消息总数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NumberOfEntries 被记录下来的消息总数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNumberOfEntries() {
        return this.NumberOfEntries;
    }

    /**
     * Set 被记录下来的消息总数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param NumberOfEntries 被记录下来的消息总数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNumberOfEntries(String NumberOfEntries) {
        this.NumberOfEntries = NumberOfEntries;
    }

    /**
     * Get 子分区id。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Partitions 子分区id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPartitions() {
        return this.Partitions;
    }

    /**
     * Set 子分区id。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Partitions 子分区id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPartitions(Long Partitions) {
        this.Partitions = Partitions;
    }

    /**
     * Get 生产者数量。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProducerCount 生产者数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProducerCount() {
        return this.ProducerCount;
    }

    /**
     * Set 生产者数量。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProducerCount 生产者数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProducerCount(String ProducerCount) {
        this.ProducerCount = ProducerCount;
    }

    /**
     * Get 以byte计算的所有消息存储总量。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalSize 以byte计算的所有消息存储总量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTotalSize() {
        return this.TotalSize;
    }

    /**
     * Set 以byte计算的所有消息存储总量。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalSize 以byte计算的所有消息存储总量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalSize(String TotalSize) {
        this.TotalSize = TotalSize;
    }

    /**
     * Get topic类型描述。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicType topic类型描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTopicType() {
        return this.TopicType;
    }

    /**
     * Set topic类型描述。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicType topic类型描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicType(Long TopicType) {
        this.TopicType = TopicType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AverageMsgSize", this.AverageMsgSize);
        this.setParamSimple(map, prefix + "ConsumerCount", this.ConsumerCount);
        this.setParamSimple(map, prefix + "LastConfirmedEntry", this.LastConfirmedEntry);
        this.setParamSimple(map, prefix + "LastLedgerCreatedTimestamp", this.LastLedgerCreatedTimestamp);
        this.setParamSimple(map, prefix + "MsgRateIn", this.MsgRateIn);
        this.setParamSimple(map, prefix + "MsgRateOut", this.MsgRateOut);
        this.setParamSimple(map, prefix + "MsgThroughputIn", this.MsgThroughputIn);
        this.setParamSimple(map, prefix + "MsgThroughputOut", this.MsgThroughputOut);
        this.setParamSimple(map, prefix + "NumberOfEntries", this.NumberOfEntries);
        this.setParamSimple(map, prefix + "Partitions", this.Partitions);
        this.setParamSimple(map, prefix + "ProducerCount", this.ProducerCount);
        this.setParamSimple(map, prefix + "TotalSize", this.TotalSize);
        this.setParamSimple(map, prefix + "TopicType", this.TopicType);

    }
}

