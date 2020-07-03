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
package com.tencentcloudapi.tiems.v20190416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Scaler extends AbstractModel{

    /**
    * 最大副本数，ScaleMode 为 MANUAL 时辞会此值会被置为 StartReplicas 取值
    */
    @SerializedName("MaxReplicas")
    @Expose
    private Long MaxReplicas;

    /**
    * 最小副本数，ScaleMode 为 MANUAL 时辞会此值会被置为 StartReplicas 取值
    */
    @SerializedName("MinReplicas")
    @Expose
    private Long MinReplicas;

    /**
    * 起始副本数
    */
    @SerializedName("StartReplicas")
    @Expose
    private Long StartReplicas;

    /**
    * 扩缩容指标，选择自动扩缩容时至少需要选择一个指标，支持CPU-UTIL、MEMORY-UTIL
    */
    @SerializedName("HpaMetrics")
    @Expose
    private Option [] HpaMetrics;

    /**
     * Get 最大副本数，ScaleMode 为 MANUAL 时辞会此值会被置为 StartReplicas 取值 
     * @return MaxReplicas 最大副本数，ScaleMode 为 MANUAL 时辞会此值会被置为 StartReplicas 取值
     */
    public Long getMaxReplicas() {
        return this.MaxReplicas;
    }

    /**
     * Set 最大副本数，ScaleMode 为 MANUAL 时辞会此值会被置为 StartReplicas 取值
     * @param MaxReplicas 最大副本数，ScaleMode 为 MANUAL 时辞会此值会被置为 StartReplicas 取值
     */
    public void setMaxReplicas(Long MaxReplicas) {
        this.MaxReplicas = MaxReplicas;
    }

    /**
     * Get 最小副本数，ScaleMode 为 MANUAL 时辞会此值会被置为 StartReplicas 取值 
     * @return MinReplicas 最小副本数，ScaleMode 为 MANUAL 时辞会此值会被置为 StartReplicas 取值
     */
    public Long getMinReplicas() {
        return this.MinReplicas;
    }

    /**
     * Set 最小副本数，ScaleMode 为 MANUAL 时辞会此值会被置为 StartReplicas 取值
     * @param MinReplicas 最小副本数，ScaleMode 为 MANUAL 时辞会此值会被置为 StartReplicas 取值
     */
    public void setMinReplicas(Long MinReplicas) {
        this.MinReplicas = MinReplicas;
    }

    /**
     * Get 起始副本数 
     * @return StartReplicas 起始副本数
     */
    public Long getStartReplicas() {
        return this.StartReplicas;
    }

    /**
     * Set 起始副本数
     * @param StartReplicas 起始副本数
     */
    public void setStartReplicas(Long StartReplicas) {
        this.StartReplicas = StartReplicas;
    }

    /**
     * Get 扩缩容指标，选择自动扩缩容时至少需要选择一个指标，支持CPU-UTIL、MEMORY-UTIL 
     * @return HpaMetrics 扩缩容指标，选择自动扩缩容时至少需要选择一个指标，支持CPU-UTIL、MEMORY-UTIL
     */
    public Option [] getHpaMetrics() {
        return this.HpaMetrics;
    }

    /**
     * Set 扩缩容指标，选择自动扩缩容时至少需要选择一个指标，支持CPU-UTIL、MEMORY-UTIL
     * @param HpaMetrics 扩缩容指标，选择自动扩缩容时至少需要选择一个指标，支持CPU-UTIL、MEMORY-UTIL
     */
    public void setHpaMetrics(Option [] HpaMetrics) {
        this.HpaMetrics = HpaMetrics;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxReplicas", this.MaxReplicas);
        this.setParamSimple(map, prefix + "MinReplicas", this.MinReplicas);
        this.setParamSimple(map, prefix + "StartReplicas", this.StartReplicas);
        this.setParamArrayObj(map, prefix + "HpaMetrics.", this.HpaMetrics);

    }
}

