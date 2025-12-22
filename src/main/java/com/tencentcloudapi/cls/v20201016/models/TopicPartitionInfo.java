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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TopicPartitionInfo extends AbstractModel {

    /**
    * 日志主题ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicID")
    @Expose
    private String TopicID;

    /**
    * 分区id列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Partitions")
    @Expose
    private Long [] Partitions;

    /**
     * Get 日志主题ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicID 日志主题ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopicID() {
        return this.TopicID;
    }

    /**
     * Set 日志主题ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicID 日志主题ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicID(String TopicID) {
        this.TopicID = TopicID;
    }

    /**
     * Get 分区id列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Partitions 分区id列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getPartitions() {
        return this.Partitions;
    }

    /**
     * Set 分区id列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Partitions 分区id列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPartitions(Long [] Partitions) {
        this.Partitions = Partitions;
    }

    public TopicPartitionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopicPartitionInfo(TopicPartitionInfo source) {
        if (source.TopicID != null) {
            this.TopicID = new String(source.TopicID);
        }
        if (source.Partitions != null) {
            this.Partitions = new Long[source.Partitions.length];
            for (int i = 0; i < source.Partitions.length; i++) {
                this.Partitions[i] = new Long(source.Partitions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicID", this.TopicID);
        this.setParamArraySimple(map, prefix + "Partitions.", this.Partitions);

    }
}

