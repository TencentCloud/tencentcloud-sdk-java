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

public class ConsumersSchedule extends AbstractModel{

    /**
    * 当前分区id。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Partitions")
    @Expose
    private Long Partitions;

    /**
    * 消息数量。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NumberOfEntries")
    @Expose
    private Long NumberOfEntries;

    /**
    * 消息积压数量。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MsgBacklog")
    @Expose
    private Long MsgBacklog;

    /**
    * 消费者每秒分发消息的数量之和。
    */
    @SerializedName("MsgRateOut")
    @Expose
    private String MsgRateOut;

    /**
    * 消费者每秒消息的byte。
    */
    @SerializedName("MsgThroughputOut")
    @Expose
    private String MsgThroughputOut;

    /**
    * 超时丢弃比例。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MsgRateExpired")
    @Expose
    private String MsgRateExpired;

    /**
     * Get 当前分区id。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Partitions 当前分区id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPartitions() {
        return this.Partitions;
    }

    /**
     * Set 当前分区id。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Partitions 当前分区id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPartitions(Long Partitions) {
        this.Partitions = Partitions;
    }

    /**
     * Get 消息数量。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NumberOfEntries 消息数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNumberOfEntries() {
        return this.NumberOfEntries;
    }

    /**
     * Set 消息数量。
注意：此字段可能返回 null，表示取不到有效值。
     * @param NumberOfEntries 消息数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNumberOfEntries(Long NumberOfEntries) {
        this.NumberOfEntries = NumberOfEntries;
    }

    /**
     * Get 消息积压数量。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MsgBacklog 消息积压数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMsgBacklog() {
        return this.MsgBacklog;
    }

    /**
     * Set 消息积压数量。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MsgBacklog 消息积压数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsgBacklog(Long MsgBacklog) {
        this.MsgBacklog = MsgBacklog;
    }

    /**
     * Get 消费者每秒分发消息的数量之和。 
     * @return MsgRateOut 消费者每秒分发消息的数量之和。
     */
    public String getMsgRateOut() {
        return this.MsgRateOut;
    }

    /**
     * Set 消费者每秒分发消息的数量之和。
     * @param MsgRateOut 消费者每秒分发消息的数量之和。
     */
    public void setMsgRateOut(String MsgRateOut) {
        this.MsgRateOut = MsgRateOut;
    }

    /**
     * Get 消费者每秒消息的byte。 
     * @return MsgThroughputOut 消费者每秒消息的byte。
     */
    public String getMsgThroughputOut() {
        return this.MsgThroughputOut;
    }

    /**
     * Set 消费者每秒消息的byte。
     * @param MsgThroughputOut 消费者每秒消息的byte。
     */
    public void setMsgThroughputOut(String MsgThroughputOut) {
        this.MsgThroughputOut = MsgThroughputOut;
    }

    /**
     * Get 超时丢弃比例。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MsgRateExpired 超时丢弃比例。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMsgRateExpired() {
        return this.MsgRateExpired;
    }

    /**
     * Set 超时丢弃比例。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MsgRateExpired 超时丢弃比例。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsgRateExpired(String MsgRateExpired) {
        this.MsgRateExpired = MsgRateExpired;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Partitions", this.Partitions);
        this.setParamSimple(map, prefix + "NumberOfEntries", this.NumberOfEntries);
        this.setParamSimple(map, prefix + "MsgBacklog", this.MsgBacklog);
        this.setParamSimple(map, prefix + "MsgRateOut", this.MsgRateOut);
        this.setParamSimple(map, prefix + "MsgThroughputOut", this.MsgThroughputOut);
        this.setParamSimple(map, prefix + "MsgRateExpired", this.MsgRateExpired);

    }
}

