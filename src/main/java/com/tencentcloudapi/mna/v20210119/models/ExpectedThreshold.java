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

public class ExpectedThreshold extends AbstractModel{

    /**
    * 期望发起加速的时延阈值
    */
    @SerializedName("RTT")
    @Expose
    private Float RTT;

    /**
    * 期望发起加速的丢包率阈值
    */
    @SerializedName("Loss")
    @Expose
    private Float Loss;

    /**
    * 期望发起加速的抖动阈值
    */
    @SerializedName("Jitter")
    @Expose
    private Float Jitter;

    /**
     * Get 期望发起加速的时延阈值 
     * @return RTT 期望发起加速的时延阈值
     */
    public Float getRTT() {
        return this.RTT;
    }

    /**
     * Set 期望发起加速的时延阈值
     * @param RTT 期望发起加速的时延阈值
     */
    public void setRTT(Float RTT) {
        this.RTT = RTT;
    }

    /**
     * Get 期望发起加速的丢包率阈值 
     * @return Loss 期望发起加速的丢包率阈值
     */
    public Float getLoss() {
        return this.Loss;
    }

    /**
     * Set 期望发起加速的丢包率阈值
     * @param Loss 期望发起加速的丢包率阈值
     */
    public void setLoss(Float Loss) {
        this.Loss = Loss;
    }

    /**
     * Get 期望发起加速的抖动阈值 
     * @return Jitter 期望发起加速的抖动阈值
     */
    public Float getJitter() {
        return this.Jitter;
    }

    /**
     * Set 期望发起加速的抖动阈值
     * @param Jitter 期望发起加速的抖动阈值
     */
    public void setJitter(Float Jitter) {
        this.Jitter = Jitter;
    }

    public ExpectedThreshold() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExpectedThreshold(ExpectedThreshold source) {
        if (source.RTT != null) {
            this.RTT = new Float(source.RTT);
        }
        if (source.Loss != null) {
            this.Loss = new Float(source.Loss);
        }
        if (source.Jitter != null) {
            this.Jitter = new Float(source.Jitter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RTT", this.RTT);
        this.setParamSimple(map, prefix + "Loss", this.Loss);
        this.setParamSimple(map, prefix + "Jitter", this.Jitter);

    }
}

