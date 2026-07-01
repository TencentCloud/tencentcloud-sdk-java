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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TopicStatsDetail extends AbstractModel {

    /**
    * <p>Broker节点名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BrokerName")
    @Expose
    private String BrokerName;

    /**
    * <p>队列编号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueueId")
    @Expose
    private Long QueueId;

    /**
    * <p>生产消息位点</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BrokerOffset")
    @Expose
    private Long BrokerOffset;

    /**
    * <p>最新消费位点</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CommitOffset")
    @Expose
    private Long CommitOffset;

    /**
    * <p>堆积总数</p><p>单位：条</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MessageCount")
    @Expose
    private Long MessageCount;

    /**
    * <p>最后消费时间</p><p>单位：毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastUpdateTimestamp")
    @Expose
    private Long LastUpdateTimestamp;

    /**
     * Get <p>Broker节点名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BrokerName <p>Broker节点名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBrokerName() {
        return this.BrokerName;
    }

    /**
     * Set <p>Broker节点名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BrokerName <p>Broker节点名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBrokerName(String BrokerName) {
        this.BrokerName = BrokerName;
    }

    /**
     * Get <p>队列编号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueueId <p>队列编号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getQueueId() {
        return this.QueueId;
    }

    /**
     * Set <p>队列编号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueueId <p>队列编号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueueId(Long QueueId) {
        this.QueueId = QueueId;
    }

    /**
     * Get <p>生产消息位点</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BrokerOffset <p>生产消息位点</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBrokerOffset() {
        return this.BrokerOffset;
    }

    /**
     * Set <p>生产消息位点</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BrokerOffset <p>生产消息位点</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBrokerOffset(Long BrokerOffset) {
        this.BrokerOffset = BrokerOffset;
    }

    /**
     * Get <p>最新消费位点</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CommitOffset <p>最新消费位点</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCommitOffset() {
        return this.CommitOffset;
    }

    /**
     * Set <p>最新消费位点</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CommitOffset <p>最新消费位点</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCommitOffset(Long CommitOffset) {
        this.CommitOffset = CommitOffset;
    }

    /**
     * Get <p>堆积总数</p><p>单位：条</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MessageCount <p>堆积总数</p><p>单位：条</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMessageCount() {
        return this.MessageCount;
    }

    /**
     * Set <p>堆积总数</p><p>单位：条</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MessageCount <p>堆积总数</p><p>单位：条</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessageCount(Long MessageCount) {
        this.MessageCount = MessageCount;
    }

    /**
     * Get <p>最后消费时间</p><p>单位：毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastUpdateTimestamp <p>最后消费时间</p><p>单位：毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLastUpdateTimestamp() {
        return this.LastUpdateTimestamp;
    }

    /**
     * Set <p>最后消费时间</p><p>单位：毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastUpdateTimestamp <p>最后消费时间</p><p>单位：毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastUpdateTimestamp(Long LastUpdateTimestamp) {
        this.LastUpdateTimestamp = LastUpdateTimestamp;
    }

    public TopicStatsDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopicStatsDetail(TopicStatsDetail source) {
        if (source.BrokerName != null) {
            this.BrokerName = new String(source.BrokerName);
        }
        if (source.QueueId != null) {
            this.QueueId = new Long(source.QueueId);
        }
        if (source.BrokerOffset != null) {
            this.BrokerOffset = new Long(source.BrokerOffset);
        }
        if (source.CommitOffset != null) {
            this.CommitOffset = new Long(source.CommitOffset);
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
        this.setParamSimple(map, prefix + "BrokerOffset", this.BrokerOffset);
        this.setParamSimple(map, prefix + "CommitOffset", this.CommitOffset);
        this.setParamSimple(map, prefix + "MessageCount", this.MessageCount);
        this.setParamSimple(map, prefix + "LastUpdateTimestamp", this.LastUpdateTimestamp);

    }
}

