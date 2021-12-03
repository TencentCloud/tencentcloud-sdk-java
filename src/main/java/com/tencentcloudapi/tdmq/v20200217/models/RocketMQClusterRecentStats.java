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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RocketMQClusterRecentStats extends AbstractModel{

    /**
    * Topic数量
    */
    @SerializedName("TopicNum")
    @Expose
    private Long TopicNum;

    /**
    * 消息生产数
    */
    @SerializedName("ProducedMsgNum")
    @Expose
    private Long ProducedMsgNum;

    /**
    * 消息消费数
    */
    @SerializedName("ConsumedMsgNum")
    @Expose
    private Long ConsumedMsgNum;

    /**
    * 消息堆积数
    */
    @SerializedName("AccumulativeMsgNum")
    @Expose
    private Long AccumulativeMsgNum;

    /**
     * Get Topic数量 
     * @return TopicNum Topic数量
     */
    public Long getTopicNum() {
        return this.TopicNum;
    }

    /**
     * Set Topic数量
     * @param TopicNum Topic数量
     */
    public void setTopicNum(Long TopicNum) {
        this.TopicNum = TopicNum;
    }

    /**
     * Get 消息生产数 
     * @return ProducedMsgNum 消息生产数
     */
    public Long getProducedMsgNum() {
        return this.ProducedMsgNum;
    }

    /**
     * Set 消息生产数
     * @param ProducedMsgNum 消息生产数
     */
    public void setProducedMsgNum(Long ProducedMsgNum) {
        this.ProducedMsgNum = ProducedMsgNum;
    }

    /**
     * Get 消息消费数 
     * @return ConsumedMsgNum 消息消费数
     */
    public Long getConsumedMsgNum() {
        return this.ConsumedMsgNum;
    }

    /**
     * Set 消息消费数
     * @param ConsumedMsgNum 消息消费数
     */
    public void setConsumedMsgNum(Long ConsumedMsgNum) {
        this.ConsumedMsgNum = ConsumedMsgNum;
    }

    /**
     * Get 消息堆积数 
     * @return AccumulativeMsgNum 消息堆积数
     */
    public Long getAccumulativeMsgNum() {
        return this.AccumulativeMsgNum;
    }

    /**
     * Set 消息堆积数
     * @param AccumulativeMsgNum 消息堆积数
     */
    public void setAccumulativeMsgNum(Long AccumulativeMsgNum) {
        this.AccumulativeMsgNum = AccumulativeMsgNum;
    }

    public RocketMQClusterRecentStats() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RocketMQClusterRecentStats(RocketMQClusterRecentStats source) {
        if (source.TopicNum != null) {
            this.TopicNum = new Long(source.TopicNum);
        }
        if (source.ProducedMsgNum != null) {
            this.ProducedMsgNum = new Long(source.ProducedMsgNum);
        }
        if (source.ConsumedMsgNum != null) {
            this.ConsumedMsgNum = new Long(source.ConsumedMsgNum);
        }
        if (source.AccumulativeMsgNum != null) {
            this.AccumulativeMsgNum = new Long(source.AccumulativeMsgNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicNum", this.TopicNum);
        this.setParamSimple(map, prefix + "ProducedMsgNum", this.ProducedMsgNum);
        this.setParamSimple(map, prefix + "ConsumedMsgNum", this.ConsumedMsgNum);
        this.setParamSimple(map, prefix + "AccumulativeMsgNum", this.AccumulativeMsgNum);

    }
}

