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

public class BatchModifyGroupOffsetsRequest extends AbstractModel{

    /**
    * 消费分组名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 实例名称
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * partition信息
    */
    @SerializedName("Partitions")
    @Expose
    private Partitions [] Partitions;

    /**
    * 指定topic，默认所有topic
    */
    @SerializedName("TopicName")
    @Expose
    private String [] TopicName;

    /**
     * Get 消费分组名称 
     * @return GroupName 消费分组名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 消费分组名称
     * @param GroupName 消费分组名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 实例名称 
     * @return InstanceId 实例名称
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例名称
     * @param InstanceId 实例名称
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get partition信息 
     * @return Partitions partition信息
     */
    public Partitions [] getPartitions() {
        return this.Partitions;
    }

    /**
     * Set partition信息
     * @param Partitions partition信息
     */
    public void setPartitions(Partitions [] Partitions) {
        this.Partitions = Partitions;
    }

    /**
     * Get 指定topic，默认所有topic 
     * @return TopicName 指定topic，默认所有topic
     */
    public String [] getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 指定topic，默认所有topic
     * @param TopicName 指定topic，默认所有topic
     */
    public void setTopicName(String [] TopicName) {
        this.TopicName = TopicName;
    }

    public BatchModifyGroupOffsetsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchModifyGroupOffsetsRequest(BatchModifyGroupOffsetsRequest source) {
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Partitions != null) {
            this.Partitions = new Partitions[source.Partitions.length];
            for (int i = 0; i < source.Partitions.length; i++) {
                this.Partitions[i] = new Partitions(source.Partitions[i]);
            }
        }
        if (source.TopicName != null) {
            this.TopicName = new String[source.TopicName.length];
            for (int i = 0; i < source.TopicName.length; i++) {
                this.TopicName[i] = new String(source.TopicName[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "Partitions.", this.Partitions);
        this.setParamArraySimple(map, prefix + "TopicName.", this.TopicName);

    }
}

