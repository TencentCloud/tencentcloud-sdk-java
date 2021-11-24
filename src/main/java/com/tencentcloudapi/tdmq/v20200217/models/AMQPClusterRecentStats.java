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

public class AMQPClusterRecentStats extends AbstractModel{

    /**
    * Queue数量
    */
    @SerializedName("QueueNum")
    @Expose
    private Long QueueNum;

    /**
    * 消息生产数
    */
    @SerializedName("ProducedMsgNum")
    @Expose
    private Long ProducedMsgNum;

    /**
    * 消息堆积数
    */
    @SerializedName("AccumulativeMsgNum")
    @Expose
    private Long AccumulativeMsgNum;

    /**
    * Exchange数量
    */
    @SerializedName("ExchangeNum")
    @Expose
    private Long ExchangeNum;

    /**
     * Get Queue数量 
     * @return QueueNum Queue数量
     */
    public Long getQueueNum() {
        return this.QueueNum;
    }

    /**
     * Set Queue数量
     * @param QueueNum Queue数量
     */
    public void setQueueNum(Long QueueNum) {
        this.QueueNum = QueueNum;
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

    /**
     * Get Exchange数量 
     * @return ExchangeNum Exchange数量
     */
    public Long getExchangeNum() {
        return this.ExchangeNum;
    }

    /**
     * Set Exchange数量
     * @param ExchangeNum Exchange数量
     */
    public void setExchangeNum(Long ExchangeNum) {
        this.ExchangeNum = ExchangeNum;
    }

    public AMQPClusterRecentStats() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AMQPClusterRecentStats(AMQPClusterRecentStats source) {
        if (source.QueueNum != null) {
            this.QueueNum = new Long(source.QueueNum);
        }
        if (source.ProducedMsgNum != null) {
            this.ProducedMsgNum = new Long(source.ProducedMsgNum);
        }
        if (source.AccumulativeMsgNum != null) {
            this.AccumulativeMsgNum = new Long(source.AccumulativeMsgNum);
        }
        if (source.ExchangeNum != null) {
            this.ExchangeNum = new Long(source.ExchangeNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QueueNum", this.QueueNum);
        this.setParamSimple(map, prefix + "ProducedMsgNum", this.ProducedMsgNum);
        this.setParamSimple(map, prefix + "AccumulativeMsgNum", this.AccumulativeMsgNum);
        this.setParamSimple(map, prefix + "ExchangeNum", this.ExchangeNum);

    }
}

