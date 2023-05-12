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

public class TopicFlowRanking extends AbstractModel{

    /**
    * 主题Id
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 主题名称
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
    * 副本数
    */
    @SerializedName("ReplicaNum")
    @Expose
    private Long ReplicaNum;

    /**
    * Topic 流量
    */
    @SerializedName("TopicTraffic")
    @Expose
    private String TopicTraffic;

    /**
    * Topic 消息堆积
    */
    @SerializedName("MessageHeap")
    @Expose
    private Long MessageHeap;

    /**
     * Get 主题Id 
     * @return TopicId 主题Id
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 主题Id
     * @param TopicId 主题Id
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 主题名称 
     * @return TopicName 主题名称
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 主题名称
     * @param TopicName 主题名称
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
     * Get Topic 流量 
     * @return TopicTraffic Topic 流量
     */
    public String getTopicTraffic() {
        return this.TopicTraffic;
    }

    /**
     * Set Topic 流量
     * @param TopicTraffic Topic 流量
     */
    public void setTopicTraffic(String TopicTraffic) {
        this.TopicTraffic = TopicTraffic;
    }

    /**
     * Get Topic 消息堆积 
     * @return MessageHeap Topic 消息堆积
     */
    public Long getMessageHeap() {
        return this.MessageHeap;
    }

    /**
     * Set Topic 消息堆积
     * @param MessageHeap Topic 消息堆积
     */
    public void setMessageHeap(Long MessageHeap) {
        this.MessageHeap = MessageHeap;
    }

    public TopicFlowRanking() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopicFlowRanking(TopicFlowRanking source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.PartitionNum != null) {
            this.PartitionNum = new Long(source.PartitionNum);
        }
        if (source.ReplicaNum != null) {
            this.ReplicaNum = new Long(source.ReplicaNum);
        }
        if (source.TopicTraffic != null) {
            this.TopicTraffic = new String(source.TopicTraffic);
        }
        if (source.MessageHeap != null) {
            this.MessageHeap = new Long(source.MessageHeap);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "PartitionNum", this.PartitionNum);
        this.setParamSimple(map, prefix + "ReplicaNum", this.ReplicaNum);
        this.setParamSimple(map, prefix + "TopicTraffic", this.TopicTraffic);
        this.setParamSimple(map, prefix + "MessageHeap", this.MessageHeap);

    }
}

