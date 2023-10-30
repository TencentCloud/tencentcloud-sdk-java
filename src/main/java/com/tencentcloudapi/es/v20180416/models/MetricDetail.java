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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MetricDetail extends AbstractModel {

    /**
    * 指标详情名
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 指标详情值
    */
    @SerializedName("Metrics")
    @Expose
    private Metric [] Metrics;

    /**
     * Get 指标详情名 
     * @return Key 指标详情名
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 指标详情名
     * @param Key 指标详情名
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 指标详情值 
     * @return Metrics 指标详情值
     */
    public Metric [] getMetrics() {
        return this.Metrics;
    }

    /**
     * Set 指标详情值
     * @param Metrics 指标详情值
     */
    public void setMetrics(Metric [] Metrics) {
        this.Metrics = Metrics;
    }

    public MetricDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetricDetail(MetricDetail source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Metrics != null) {
            this.Metrics = new Metric[source.Metrics.length];
            for (int i = 0; i < source.Metrics.length; i++) {
                this.Metrics[i] = new Metric(source.Metrics[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamArrayObj(map, prefix + "Metrics.", this.Metrics);

    }
}

