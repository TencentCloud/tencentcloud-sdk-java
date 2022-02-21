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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetworkData extends AbstractModel{

    /**
    * 时延数组，最大长度30
    */
    @SerializedName("RTT")
    @Expose
    private Float [] RTT;

    /**
    * 丢包率
    */
    @SerializedName("Loss")
    @Expose
    private Float Loss;

    /**
    * 抖动
    */
    @SerializedName("Jitter")
    @Expose
    private Float Jitter;

    /**
    * 10位秒级时间戳
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
     * Get 时延数组，最大长度30 
     * @return RTT 时延数组，最大长度30
     */
    public Float [] getRTT() {
        return this.RTT;
    }

    /**
     * Set 时延数组，最大长度30
     * @param RTT 时延数组，最大长度30
     */
    public void setRTT(Float [] RTT) {
        this.RTT = RTT;
    }

    /**
     * Get 丢包率 
     * @return Loss 丢包率
     */
    public Float getLoss() {
        return this.Loss;
    }

    /**
     * Set 丢包率
     * @param Loss 丢包率
     */
    public void setLoss(Float Loss) {
        this.Loss = Loss;
    }

    /**
     * Get 抖动 
     * @return Jitter 抖动
     */
    public Float getJitter() {
        return this.Jitter;
    }

    /**
     * Set 抖动
     * @param Jitter 抖动
     */
    public void setJitter(Float Jitter) {
        this.Jitter = Jitter;
    }

    /**
     * Get 10位秒级时间戳 
     * @return Timestamp 10位秒级时间戳
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 10位秒级时间戳
     * @param Timestamp 10位秒级时间戳
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    public NetworkData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetworkData(NetworkData source) {
        if (source.RTT != null) {
            this.RTT = new Float[source.RTT.length];
            for (int i = 0; i < source.RTT.length; i++) {
                this.RTT[i] = new Float(source.RTT[i]);
            }
        }
        if (source.Loss != null) {
            this.Loss = new Float(source.Loss);
        }
        if (source.Jitter != null) {
            this.Jitter = new Float(source.Jitter);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "RTT.", this.RTT);
        this.setParamSimple(map, prefix + "Loss", this.Loss);
        this.setParamSimple(map, prefix + "Jitter", this.Jitter);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);

    }
}

