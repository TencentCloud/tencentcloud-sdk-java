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

public class TopicStats extends AbstractModel {

    /**
    * 所属Broker节点
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
    * 最小位点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MinOffset")
    @Expose
    private Long MinOffset;

    /**
    * 最大位点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxOffset")
    @Expose
    private Long MaxOffset;

    /**
    * 消息条数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MessageCount")
    @Expose
    private Long MessageCount;

    /**
    * 消息最后写入时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastUpdateTimestamp")
    @Expose
    private Long LastUpdateTimestamp;

    /**
     * Get 所属Broker节点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BrokerName 所属Broker节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBrokerName() {
        return this.BrokerName;
    }

    /**
     * Set 所属Broker节点
注意：此字段可能返回 null，表示取不到有效值。
     * @param BrokerName 所属Broker节点
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
     * Get 最小位点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MinOffset 最小位点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMinOffset() {
        return this.MinOffset;
    }

    /**
     * Set 最小位点
注意：此字段可能返回 null，表示取不到有效值。
     * @param MinOffset 最小位点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMinOffset(Long MinOffset) {
        this.MinOffset = MinOffset;
    }

    /**
     * Get 最大位点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxOffset 最大位点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxOffset() {
        return this.MaxOffset;
    }

    /**
     * Set 最大位点
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxOffset 最大位点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxOffset(Long MaxOffset) {
        this.MaxOffset = MaxOffset;
    }

    /**
     * Get 消息条数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MessageCount 消息条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMessageCount() {
        return this.MessageCount;
    }

    /**
     * Set 消息条数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MessageCount 消息条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessageCount(Long MessageCount) {
        this.MessageCount = MessageCount;
    }

    /**
     * Get 消息最后写入时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastUpdateTimestamp 消息最后写入时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLastUpdateTimestamp() {
        return this.LastUpdateTimestamp;
    }

    /**
     * Set 消息最后写入时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastUpdateTimestamp 消息最后写入时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastUpdateTimestamp(Long LastUpdateTimestamp) {
        this.LastUpdateTimestamp = LastUpdateTimestamp;
    }

    public TopicStats() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopicStats(TopicStats source) {
        if (source.BrokerName != null) {
            this.BrokerName = new String(source.BrokerName);
        }
        if (source.QueueId != null) {
            this.QueueId = new Long(source.QueueId);
        }
        if (source.MinOffset != null) {
            this.MinOffset = new Long(source.MinOffset);
        }
        if (source.MaxOffset != null) {
            this.MaxOffset = new Long(source.MaxOffset);
        }
        if (source.MessageCount != null) {
            this.MessageCount = new Long(source.MessageCount);
        }
        if (source.LastUpdateTimestamp != null) {
            this.LastUpdateTimestamp = new Long(source.LastUpdateTimestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BrokerName", this.BrokerName);
        this.setParamSimple(map, prefix + "QueueId", this.QueueId);
        this.setParamSimple(map, prefix + "MinOffset", this.MinOffset);
        this.setParamSimple(map, prefix + "MaxOffset", this.MaxOffset);
        this.setParamSimple(map, prefix + "MessageCount", this.MessageCount);
        this.setParamSimple(map, prefix + "LastUpdateTimestamp", this.LastUpdateTimestamp);

    }
}

