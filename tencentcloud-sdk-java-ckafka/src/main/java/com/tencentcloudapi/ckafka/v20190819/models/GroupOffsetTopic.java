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

public class GroupOffsetTopic extends AbstractModel{

    /**
    * 主题名称
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * 该主题分区数组，其中每个元素为一个 json object
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Partitions")
    @Expose
    private GroupOffsetPartition [] Partitions;

    /**
     * Get 主题名称 
     * @return Topic 主题名称
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set 主题名称
     * @param Topic 主题名称
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get 该主题分区数组，其中每个元素为一个 json object
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Partitions 该主题分区数组，其中每个元素为一个 json object
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GroupOffsetPartition [] getPartitions() {
        return this.Partitions;
    }

    /**
     * Set 该主题分区数组，其中每个元素为一个 json object
注意：此字段可能返回 null，表示取不到有效值。
     * @param Partitions 该主题分区数组，其中每个元素为一个 json object
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPartitions(GroupOffsetPartition [] Partitions) {
        this.Partitions = Partitions;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamArrayObj(map, prefix + "Partitions.", this.Partitions);

    }
}

