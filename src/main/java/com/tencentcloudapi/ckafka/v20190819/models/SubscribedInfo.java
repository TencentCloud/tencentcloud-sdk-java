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

public class SubscribedInfo extends AbstractModel{

    /**
    * 订阅的主题名
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 订阅的分区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Partition")
    @Expose
    private Long [] Partition;

    /**
    * 分区offset信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PartitionOffset")
    @Expose
    private PartitionOffset [] PartitionOffset;

    /**
    * 订阅的主题ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
     * Get 订阅的主题名 
     * @return TopicName 订阅的主题名
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 订阅的主题名
     * @param TopicName 订阅的主题名
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 订阅的分区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Partition 订阅的分区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getPartition() {
        return this.Partition;
    }

    /**
     * Set 订阅的分区
注意：此字段可能返回 null，表示取不到有效值。
     * @param Partition 订阅的分区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPartition(Long [] Partition) {
        this.Partition = Partition;
    }

    /**
     * Get 分区offset信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PartitionOffset 分区offset信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PartitionOffset [] getPartitionOffset() {
        return this.PartitionOffset;
    }

    /**
     * Set 分区offset信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param PartitionOffset 分区offset信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPartitionOffset(PartitionOffset [] PartitionOffset) {
        this.PartitionOffset = PartitionOffset;
    }

    /**
     * Get 订阅的主题ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicId 订阅的主题ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 订阅的主题ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicId 订阅的主题ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    public SubscribedInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubscribedInfo(SubscribedInfo source) {
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.Partition != null) {
            this.Partition = new Long[source.Partition.length];
            for (int i = 0; i < source.Partition.length; i++) {
                this.Partition[i] = new Long(source.Partition[i]);
            }
        }
        if (source.PartitionOffset != null) {
            this.PartitionOffset = new PartitionOffset[source.PartitionOffset.length];
            for (int i = 0; i < source.PartitionOffset.length; i++) {
                this.PartitionOffset[i] = new PartitionOffset(source.PartitionOffset[i]);
            }
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamArraySimple(map, prefix + "Partition.", this.Partition);
        this.setParamArrayObj(map, prefix + "PartitionOffset.", this.PartitionOffset);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);

    }
}

