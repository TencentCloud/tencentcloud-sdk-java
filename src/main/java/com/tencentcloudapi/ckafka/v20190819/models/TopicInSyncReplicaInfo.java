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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TopicInSyncReplicaInfo extends AbstractModel{

    /**
    * 分区名称
    */
    @SerializedName("Partition")
    @Expose
    private String Partition;

    /**
    * Leader Id
    */
    @SerializedName("Leader")
    @Expose
    private Long Leader;

    /**
    * 副本集
    */
    @SerializedName("Replica")
    @Expose
    private String Replica;

    /**
    * ISR
    */
    @SerializedName("InSyncReplica")
    @Expose
    private String InSyncReplica;

    /**
    * 起始Offset
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BeginOffset")
    @Expose
    private Long BeginOffset;

    /**
    * 末端Offset
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndOffset")
    @Expose
    private Long EndOffset;

    /**
    * 消息数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MessageCount")
    @Expose
    private Long MessageCount;

    /**
    * 未同步副本集
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutOfSyncReplica")
    @Expose
    private String OutOfSyncReplica;

    /**
     * Get 分区名称 
     * @return Partition 分区名称
     */
    public String getPartition() {
        return this.Partition;
    }

    /**
     * Set 分区名称
     * @param Partition 分区名称
     */
    public void setPartition(String Partition) {
        this.Partition = Partition;
    }

    /**
     * Get Leader Id 
     * @return Leader Leader Id
     */
    public Long getLeader() {
        return this.Leader;
    }

    /**
     * Set Leader Id
     * @param Leader Leader Id
     */
    public void setLeader(Long Leader) {
        this.Leader = Leader;
    }

    /**
     * Get 副本集 
     * @return Replica 副本集
     */
    public String getReplica() {
        return this.Replica;
    }

    /**
     * Set 副本集
     * @param Replica 副本集
     */
    public void setReplica(String Replica) {
        this.Replica = Replica;
    }

    /**
     * Get ISR 
     * @return InSyncReplica ISR
     */
    public String getInSyncReplica() {
        return this.InSyncReplica;
    }

    /**
     * Set ISR
     * @param InSyncReplica ISR
     */
    public void setInSyncReplica(String InSyncReplica) {
        this.InSyncReplica = InSyncReplica;
    }

    /**
     * Get 起始Offset
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BeginOffset 起始Offset
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBeginOffset() {
        return this.BeginOffset;
    }

    /**
     * Set 起始Offset
注意：此字段可能返回 null，表示取不到有效值。
     * @param BeginOffset 起始Offset
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBeginOffset(Long BeginOffset) {
        this.BeginOffset = BeginOffset;
    }

    /**
     * Get 末端Offset
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndOffset 末端Offset
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEndOffset() {
        return this.EndOffset;
    }

    /**
     * Set 末端Offset
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndOffset 末端Offset
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndOffset(Long EndOffset) {
        this.EndOffset = EndOffset;
    }

    /**
     * Get 消息数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MessageCount 消息数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMessageCount() {
        return this.MessageCount;
    }

    /**
     * Set 消息数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MessageCount 消息数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessageCount(Long MessageCount) {
        this.MessageCount = MessageCount;
    }

    /**
     * Get 未同步副本集
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutOfSyncReplica 未同步副本集
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutOfSyncReplica() {
        return this.OutOfSyncReplica;
    }

    /**
     * Set 未同步副本集
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutOfSyncReplica 未同步副本集
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutOfSyncReplica(String OutOfSyncReplica) {
        this.OutOfSyncReplica = OutOfSyncReplica;
    }

    public TopicInSyncReplicaInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopicInSyncReplicaInfo(TopicInSyncReplicaInfo source) {
        if (source.Partition != null) {
            this.Partition = new String(source.Partition);
        }
        if (source.Leader != null) {
            this.Leader = new Long(source.Leader);
        }
        if (source.Replica != null) {
            this.Replica = new String(source.Replica);
        }
        if (source.InSyncReplica != null) {
            this.InSyncReplica = new String(source.InSyncReplica);
        }
        if (source.BeginOffset != null) {
            this.BeginOffset = new Long(source.BeginOffset);
        }
        if (source.EndOffset != null) {
            this.EndOffset = new Long(source.EndOffset);
        }
        if (source.MessageCount != null) {
            this.MessageCount = new Long(source.MessageCount);
        }
        if (source.OutOfSyncReplica != null) {
            this.OutOfSyncReplica = new String(source.OutOfSyncReplica);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Partition", this.Partition);
        this.setParamSimple(map, prefix + "Leader", this.Leader);
        this.setParamSimple(map, prefix + "Replica", this.Replica);
        this.setParamSimple(map, prefix + "InSyncReplica", this.InSyncReplica);
        this.setParamSimple(map, prefix + "BeginOffset", this.BeginOffset);
        this.setParamSimple(map, prefix + "EndOffset", this.EndOffset);
        this.setParamSimple(map, prefix + "MessageCount", this.MessageCount);
        this.setParamSimple(map, prefix + "OutOfSyncReplica", this.OutOfSyncReplica);

    }
}

