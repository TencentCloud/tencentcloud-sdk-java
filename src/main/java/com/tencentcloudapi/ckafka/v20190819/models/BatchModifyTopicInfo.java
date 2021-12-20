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

public class BatchModifyTopicInfo extends AbstractModel{

    /**
    * topic名称
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 分区数
    */
    @SerializedName("PartitionNum")
    @Expose
    private Long PartitionNum;

    /**
    * 备注
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * 副本数
    */
    @SerializedName("ReplicaNum")
    @Expose
    private Long ReplicaNum;

    /**
    * 消息删除策略，可以选择delete 或者compact
    */
    @SerializedName("CleanUpPolicy")
    @Expose
    private String CleanUpPolicy;

    /**
    * 当producer设置request.required.acks为-1时，min.insync.replicas指定replicas的最小数目
    */
    @SerializedName("MinInsyncReplicas")
    @Expose
    private Long MinInsyncReplicas;

    /**
    * 是否允许非ISR的副本成为Leader
    */
    @SerializedName("UncleanLeaderElectionEnable")
    @Expose
    private Boolean UncleanLeaderElectionEnable;

    /**
    * topic维度的消息保留时间（毫秒）范围1 分钟到90 天
    */
    @SerializedName("RetentionMs")
    @Expose
    private Long RetentionMs;

    /**
    * topic维度的消息保留大小，范围1 MB到1024 GB
    */
    @SerializedName("RetentionBytes")
    @Expose
    private Long RetentionBytes;

    /**
    * Segment分片滚动的时长（毫秒），范围1 到90 天
    */
    @SerializedName("SegmentMs")
    @Expose
    private Long SegmentMs;

    /**
    * 批次的消息大小，范围1 KB到12 MB
    */
    @SerializedName("MaxMessageBytes")
    @Expose
    private Long MaxMessageBytes;

    /**
     * Get topic名称 
     * @return TopicName topic名称
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set topic名称
     * @param TopicName topic名称
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
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
     * Get 备注 
     * @return Note 备注
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set 备注
     * @param Note 备注
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * Get 副本数 
     * @return ReplicaNum 副本数
     */
    public Long getReplicaNum() {
        return this.ReplicaNum;
    }

    /**
     * Set 副本数
     * @param ReplicaNum 副本数
     */
    public void setReplicaNum(Long ReplicaNum) {
        this.ReplicaNum = ReplicaNum;
    }

    /**
     * Get 消息删除策略，可以选择delete 或者compact 
     * @return CleanUpPolicy 消息删除策略，可以选择delete 或者compact
     */
    public String getCleanUpPolicy() {
        return this.CleanUpPolicy;
    }

    /**
     * Set 消息删除策略，可以选择delete 或者compact
     * @param CleanUpPolicy 消息删除策略，可以选择delete 或者compact
     */
    public void setCleanUpPolicy(String CleanUpPolicy) {
        this.CleanUpPolicy = CleanUpPolicy;
    }

    /**
     * Get 当producer设置request.required.acks为-1时，min.insync.replicas指定replicas的最小数目 
     * @return MinInsyncReplicas 当producer设置request.required.acks为-1时，min.insync.replicas指定replicas的最小数目
     */
    public Long getMinInsyncReplicas() {
        return this.MinInsyncReplicas;
    }

    /**
     * Set 当producer设置request.required.acks为-1时，min.insync.replicas指定replicas的最小数目
     * @param MinInsyncReplicas 当producer设置request.required.acks为-1时，min.insync.replicas指定replicas的最小数目
     */
    public void setMinInsyncReplicas(Long MinInsyncReplicas) {
        this.MinInsyncReplicas = MinInsyncReplicas;
    }

    /**
     * Get 是否允许非ISR的副本成为Leader 
     * @return UncleanLeaderElectionEnable 是否允许非ISR的副本成为Leader
     */
    public Boolean getUncleanLeaderElectionEnable() {
        return this.UncleanLeaderElectionEnable;
    }

    /**
     * Set 是否允许非ISR的副本成为Leader
     * @param UncleanLeaderElectionEnable 是否允许非ISR的副本成为Leader
     */
    public void setUncleanLeaderElectionEnable(Boolean UncleanLeaderElectionEnable) {
        this.UncleanLeaderElectionEnable = UncleanLeaderElectionEnable;
    }

    /**
     * Get topic维度的消息保留时间（毫秒）范围1 分钟到90 天 
     * @return RetentionMs topic维度的消息保留时间（毫秒）范围1 分钟到90 天
     */
    public Long getRetentionMs() {
        return this.RetentionMs;
    }

    /**
     * Set topic维度的消息保留时间（毫秒）范围1 分钟到90 天
     * @param RetentionMs topic维度的消息保留时间（毫秒）范围1 分钟到90 天
     */
    public void setRetentionMs(Long RetentionMs) {
        this.RetentionMs = RetentionMs;
    }

    /**
     * Get topic维度的消息保留大小，范围1 MB到1024 GB 
     * @return RetentionBytes topic维度的消息保留大小，范围1 MB到1024 GB
     */
    public Long getRetentionBytes() {
        return this.RetentionBytes;
    }

    /**
     * Set topic维度的消息保留大小，范围1 MB到1024 GB
     * @param RetentionBytes topic维度的消息保留大小，范围1 MB到1024 GB
     */
    public void setRetentionBytes(Long RetentionBytes) {
        this.RetentionBytes = RetentionBytes;
    }

    /**
     * Get Segment分片滚动的时长（毫秒），范围1 到90 天 
     * @return SegmentMs Segment分片滚动的时长（毫秒），范围1 到90 天
     */
    public Long getSegmentMs() {
        return this.SegmentMs;
    }

    /**
     * Set Segment分片滚动的时长（毫秒），范围1 到90 天
     * @param SegmentMs Segment分片滚动的时长（毫秒），范围1 到90 天
     */
    public void setSegmentMs(Long SegmentMs) {
        this.SegmentMs = SegmentMs;
    }

    /**
     * Get 批次的消息大小，范围1 KB到12 MB 
     * @return MaxMessageBytes 批次的消息大小，范围1 KB到12 MB
     */
    public Long getMaxMessageBytes() {
        return this.MaxMessageBytes;
    }

    /**
     * Set 批次的消息大小，范围1 KB到12 MB
     * @param MaxMessageBytes 批次的消息大小，范围1 KB到12 MB
     */
    public void setMaxMessageBytes(Long MaxMessageBytes) {
        this.MaxMessageBytes = MaxMessageBytes;
    }

    public BatchModifyTopicInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchModifyTopicInfo(BatchModifyTopicInfo source) {
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.PartitionNum != null) {
            this.PartitionNum = new Long(source.PartitionNum);
        }
        if (source.Note != null) {
            this.Note = new String(source.Note);
        }
        if (source.ReplicaNum != null) {
            this.ReplicaNum = new Long(source.ReplicaNum);
        }
        if (source.CleanUpPolicy != null) {
            this.CleanUpPolicy = new String(source.CleanUpPolicy);
        }
        if (source.MinInsyncReplicas != null) {
            this.MinInsyncReplicas = new Long(source.MinInsyncReplicas);
        }
        if (source.UncleanLeaderElectionEnable != null) {
            this.UncleanLeaderElectionEnable = new Boolean(source.UncleanLeaderElectionEnable);
        }
        if (source.RetentionMs != null) {
            this.RetentionMs = new Long(source.RetentionMs);
        }
        if (source.RetentionBytes != null) {
            this.RetentionBytes = new Long(source.RetentionBytes);
        }
        if (source.SegmentMs != null) {
            this.SegmentMs = new Long(source.SegmentMs);
        }
        if (source.MaxMessageBytes != null) {
            this.MaxMessageBytes = new Long(source.MaxMessageBytes);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "PartitionNum", this.PartitionNum);
        this.setParamSimple(map, prefix + "Note", this.Note);
        this.setParamSimple(map, prefix + "ReplicaNum", this.ReplicaNum);
        this.setParamSimple(map, prefix + "CleanUpPolicy", this.CleanUpPolicy);
        this.setParamSimple(map, prefix + "MinInsyncReplicas", this.MinInsyncReplicas);
        this.setParamSimple(map, prefix + "UncleanLeaderElectionEnable", this.UncleanLeaderElectionEnable);
        this.setParamSimple(map, prefix + "RetentionMs", this.RetentionMs);
        this.setParamSimple(map, prefix + "RetentionBytes", this.RetentionBytes);
        this.setParamSimple(map, prefix + "SegmentMs", this.SegmentMs);
        this.setParamSimple(map, prefix + "MaxMessageBytes", this.MaxMessageBytes);

    }
}

