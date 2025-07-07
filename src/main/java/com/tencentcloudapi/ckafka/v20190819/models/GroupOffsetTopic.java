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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GroupOffsetTopic extends AbstractModel {

    /**
    * 主题名称
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * 该主题分区数组，其中每个元素为一个 json object
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
     * @return Partitions 该主题分区数组，其中每个元素为一个 json object
     */
    public GroupOffsetPartition [] getPartitions() {
        return this.Partitions;
    }

    /**
     * Set 该主题分区数组，其中每个元素为一个 json object
     * @param Partitions 该主题分区数组，其中每个元素为一个 json object
     */
    public void setPartitions(GroupOffsetPartition [] Partitions) {
        this.Partitions = Partitions;
    }

    public GroupOffsetTopic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GroupOffsetTopic(GroupOffsetTopic source) {
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.Partitions != null) {
            this.Partitions = new GroupOffsetPartition[source.Partitions.length];
            for (int i = 0; i < source.Partitions.length; i++) {
                this.Partitions[i] = new GroupOffsetPartition(source.Partitions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamArrayObj(map, prefix + "Partitions.", this.Partitions);

    }
}

