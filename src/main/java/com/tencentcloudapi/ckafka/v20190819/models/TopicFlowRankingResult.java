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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TopicFlowRankingResult extends AbstractModel {

    /**
    * Topic 流量数组
    */
    @SerializedName("TopicFlow")
    @Expose
    private TopicFlowRanking [] TopicFlow;

    /**
    * 消费者组消费速度排行速度
    */
    @SerializedName("ConsumeSpeed")
    @Expose
    private ConsumerGroupSpeed [] ConsumeSpeed;

    /**
    * Topic 消息堆积/占用磁盘排行
    */
    @SerializedName("TopicMessageHeap")
    @Expose
    private TopicMessageHeapRanking [] TopicMessageHeap;

    /**
    * Broker Ip 列表
    */
    @SerializedName("BrokerIp")
    @Expose
    private String [] BrokerIp;

    /**
    * 单个broker 节点 Topic占用的数据大小
    */
    @SerializedName("BrokerTopicData")
    @Expose
    private BrokerTopicData [] BrokerTopicData;

    /**
    * 单个Broker 节点Topic 流量的大小(单位MB)
    */
    @SerializedName("BrokerTopicFlowData")
    @Expose
    private BrokerTopicFlowData [] BrokerTopicFlowData;

    /**
     * Get Topic 流量数组 
     * @return TopicFlow Topic 流量数组
     */
    public TopicFlowRanking [] getTopicFlow() {
        return this.TopicFlow;
    }

    /**
     * Set Topic 流量数组
     * @param TopicFlow Topic 流量数组
     */
    public void setTopicFlow(TopicFlowRanking [] TopicFlow) {
        this.TopicFlow = TopicFlow;
    }

    /**
     * Get 消费者组消费速度排行速度 
     * @return ConsumeSpeed 消费者组消费速度排行速度
     */
    public ConsumerGroupSpeed [] getConsumeSpeed() {
        return this.ConsumeSpeed;
    }

    /**
     * Set 消费者组消费速度排行速度
     * @param ConsumeSpeed 消费者组消费速度排行速度
     */
    public void setConsumeSpeed(ConsumerGroupSpeed [] ConsumeSpeed) {
        this.ConsumeSpeed = ConsumeSpeed;
    }

    /**
     * Get Topic 消息堆积/占用磁盘排行 
     * @return TopicMessageHeap Topic 消息堆积/占用磁盘排行
     */
    public TopicMessageHeapRanking [] getTopicMessageHeap() {
        return this.TopicMessageHeap;
    }

    /**
     * Set Topic 消息堆积/占用磁盘排行
     * @param TopicMessageHeap Topic 消息堆积/占用磁盘排行
     */
    public void setTopicMessageHeap(TopicMessageHeapRanking [] TopicMessageHeap) {
        this.TopicMessageHeap = TopicMessageHeap;
    }

    /**
     * Get Broker Ip 列表 
     * @return BrokerIp Broker Ip 列表
     */
    public String [] getBrokerIp() {
        return this.BrokerIp;
    }

    /**
     * Set Broker Ip 列表
     * @param BrokerIp Broker Ip 列表
     */
    public void setBrokerIp(String [] BrokerIp) {
        this.BrokerIp = BrokerIp;
    }

    /**
     * Get 单个broker 节点 Topic占用的数据大小 
     * @return BrokerTopicData 单个broker 节点 Topic占用的数据大小
     */
    public BrokerTopicData [] getBrokerTopicData() {
        return this.BrokerTopicData;
    }

    /**
     * Set 单个broker 节点 Topic占用的数据大小
     * @param BrokerTopicData 单个broker 节点 Topic占用的数据大小
     */
    public void setBrokerTopicData(BrokerTopicData [] BrokerTopicData) {
        this.BrokerTopicData = BrokerTopicData;
    }

    /**
     * Get 单个Broker 节点Topic 流量的大小(单位MB) 
     * @return BrokerTopicFlowData 单个Broker 节点Topic 流量的大小(单位MB)
     */
    public BrokerTopicFlowData [] getBrokerTopicFlowData() {
        return this.BrokerTopicFlowData;
    }

    /**
     * Set 单个Broker 节点Topic 流量的大小(单位MB)
     * @param BrokerTopicFlowData 单个Broker 节点Topic 流量的大小(单位MB)
     */
    public void setBrokerTopicFlowData(BrokerTopicFlowData [] BrokerTopicFlowData) {
        this.BrokerTopicFlowData = BrokerTopicFlowData;
    }

    public TopicFlowRankingResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopicFlowRankingResult(TopicFlowRankingResult source) {
        if (source.TopicFlow != null) {
            this.TopicFlow = new TopicFlowRanking[source.TopicFlow.length];
            for (int i = 0; i < source.TopicFlow.length; i++) {
                this.TopicFlow[i] = new TopicFlowRanking(source.TopicFlow[i]);
            }
        }
        if (source.ConsumeSpeed != null) {
            this.ConsumeSpeed = new ConsumerGroupSpeed[source.ConsumeSpeed.length];
            for (int i = 0; i < source.ConsumeSpeed.length; i++) {
                this.ConsumeSpeed[i] = new ConsumerGroupSpeed(source.ConsumeSpeed[i]);
            }
        }
        if (source.TopicMessageHeap != null) {
            this.TopicMessageHeap = new TopicMessageHeapRanking[source.TopicMessageHeap.length];
            for (int i = 0; i < source.TopicMessageHeap.length; i++) {
                this.TopicMessageHeap[i] = new TopicMessageHeapRanking(source.TopicMessageHeap[i]);
            }
        }
        if (source.BrokerIp != null) {
            this.BrokerIp = new String[source.BrokerIp.length];
            for (int i = 0; i < source.BrokerIp.length; i++) {
                this.BrokerIp[i] = new String(source.BrokerIp[i]);
            }
        }
        if (source.BrokerTopicData != null) {
            this.BrokerTopicData = new BrokerTopicData[source.BrokerTopicData.length];
            for (int i = 0; i < source.BrokerTopicData.length; i++) {
                this.BrokerTopicData[i] = new BrokerTopicData(source.BrokerTopicData[i]);
            }
        }
        if (source.BrokerTopicFlowData != null) {
            this.BrokerTopicFlowData = new BrokerTopicFlowData[source.BrokerTopicFlowData.length];
            for (int i = 0; i < source.BrokerTopicFlowData.length; i++) {
                this.BrokerTopicFlowData[i] = new BrokerTopicFlowData(source.BrokerTopicFlowData[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TopicFlow.", this.TopicFlow);
        this.setParamArrayObj(map, prefix + "ConsumeSpeed.", this.ConsumeSpeed);
        this.setParamArrayObj(map, prefix + "TopicMessageHeap.", this.TopicMessageHeap);
        this.setParamArraySimple(map, prefix + "BrokerIp.", this.BrokerIp);
        this.setParamArrayObj(map, prefix + "BrokerTopicData.", this.BrokerTopicData);
        this.setParamArrayObj(map, prefix + "BrokerTopicFlowData.", this.BrokerTopicFlowData);

    }
}

