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

public class ConsumerGroupResponse extends AbstractModel{

    /**
    * 符合条件的消费组数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 主题列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicList")
    @Expose
    private ConsumerGroupTopic [] TopicList;

    /**
    * 消费分组List
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupList")
    @Expose
    private ConsumerGroup [] GroupList;

    /**
    * 所有分区数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalPartition")
    @Expose
    private Long TotalPartition;

    /**
    * 监控的分区列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PartitionListForMonitor")
    @Expose
    private Partition [] PartitionListForMonitor;

    /**
    * 主题总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalTopic")
    @Expose
    private Long TotalTopic;

    /**
    * 监控的主题列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicListForMonitor")
    @Expose
    private ConsumerGroupTopic [] TopicListForMonitor;

    /**
    * 监控的组列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupListForMonitor")
    @Expose
    private Group [] GroupListForMonitor;

    /**
     * Get 符合条件的消费组数量 
     * @return TotalCount 符合条件的消费组数量
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 符合条件的消费组数量
     * @param TotalCount 符合条件的消费组数量
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 主题列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicList 主题列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ConsumerGroupTopic [] getTopicList() {
        return this.TopicList;
    }

    /**
     * Set 主题列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicList 主题列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicList(ConsumerGroupTopic [] TopicList) {
        this.TopicList = TopicList;
    }

    /**
     * Get 消费分组List
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupList 消费分组List
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ConsumerGroup [] getGroupList() {
        return this.GroupList;
    }

    /**
     * Set 消费分组List
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupList 消费分组List
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupList(ConsumerGroup [] GroupList) {
        this.GroupList = GroupList;
    }

    /**
     * Get 所有分区数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalPartition 所有分区数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalPartition() {
        return this.TotalPartition;
    }

    /**
     * Set 所有分区数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalPartition 所有分区数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalPartition(Long TotalPartition) {
        this.TotalPartition = TotalPartition;
    }

    /**
     * Get 监控的分区列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PartitionListForMonitor 监控的分区列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Partition [] getPartitionListForMonitor() {
        return this.PartitionListForMonitor;
    }

    /**
     * Set 监控的分区列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param PartitionListForMonitor 监控的分区列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPartitionListForMonitor(Partition [] PartitionListForMonitor) {
        this.PartitionListForMonitor = PartitionListForMonitor;
    }

    /**
     * Get 主题总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalTopic 主题总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalTopic() {
        return this.TotalTopic;
    }

    /**
     * Set 主题总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalTopic 主题总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalTopic(Long TotalTopic) {
        this.TotalTopic = TotalTopic;
    }

    /**
     * Get 监控的主题列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicListForMonitor 监控的主题列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ConsumerGroupTopic [] getTopicListForMonitor() {
        return this.TopicListForMonitor;
    }

    /**
     * Set 监控的主题列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicListForMonitor 监控的主题列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicListForMonitor(ConsumerGroupTopic [] TopicListForMonitor) {
        this.TopicListForMonitor = TopicListForMonitor;
    }

    /**
     * Get 监控的组列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupListForMonitor 监控的组列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Group [] getGroupListForMonitor() {
        return this.GroupListForMonitor;
    }

    /**
     * Set 监控的组列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupListForMonitor 监控的组列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupListForMonitor(Group [] GroupListForMonitor) {
        this.GroupListForMonitor = GroupListForMonitor;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "TopicList.", this.TopicList);
        this.setParamArrayObj(map, prefix + "GroupList.", this.GroupList);
        this.setParamSimple(map, prefix + "TotalPartition", this.TotalPartition);
        this.setParamArrayObj(map, prefix + "PartitionListForMonitor.", this.PartitionListForMonitor);
        this.setParamSimple(map, prefix + "TotalTopic", this.TotalTopic);
        this.setParamArrayObj(map, prefix + "TopicListForMonitor.", this.TopicListForMonitor);
        this.setParamArrayObj(map, prefix + "GroupListForMonitor.", this.GroupListForMonitor);

    }
}

