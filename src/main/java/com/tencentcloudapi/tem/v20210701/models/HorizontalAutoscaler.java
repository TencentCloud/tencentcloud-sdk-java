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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HorizontalAutoscaler extends AbstractModel{

    /**
    * 最小实例数（可以不传）
    */
    @SerializedName("MinReplicas")
    @Expose
    private Long MinReplicas;

    /**
    * 最大实例数（可以不传）
    */
    @SerializedName("MaxReplicas")
    @Expose
    private Long MaxReplicas;

    /**
    * 指标度量（CPU or MEMORY）
    */
    @SerializedName("Metrics")
    @Expose
    private String Metrics;

    /**
    * 阈值（百分比）
    */
    @SerializedName("Threshold")
    @Expose
    private Long Threshold;

    /**
    * 是否启用
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
     * Get 最小实例数（可以不传） 
     * @return MinReplicas 最小实例数（可以不传）
     */
    public Long getMinReplicas() {
        return this.MinReplicas;
    }

    /**
     * Set 最小实例数（可以不传）
     * @param MinReplicas 最小实例数（可以不传）
     */
    public void setMinReplicas(Long MinReplicas) {
        this.MinReplicas = MinReplicas;
    }

    /**
     * Get 最大实例数（可以不传） 
     * @return MaxReplicas 最大实例数（可以不传）
     */
    public Long getMaxReplicas() {
        return this.MaxReplicas;
    }

    /**
     * Set 最大实例数（可以不传）
     * @param MaxReplicas 最大实例数（可以不传）
     */
    public void setMaxReplicas(Long MaxReplicas) {
        this.MaxReplicas = MaxReplicas;
    }

    /**
     * Get 指标度量（CPU or MEMORY） 
     * @return Metrics 指标度量（CPU or MEMORY）
     */
    public String getMetrics() {
        return this.Metrics;
    }

    /**
     * Set 指标度量（CPU or MEMORY）
     * @param Metrics 指标度量（CPU or MEMORY）
     */
    public void setMetrics(String Metrics) {
        this.Metrics = Metrics;
    }

    /**
     * Get 阈值（百分比） 
     * @return Threshold 阈值（百分比）
     */
    public Long getThreshold() {
        return this.Threshold;
    }

    /**
     * Set 阈值（百分比）
     * @param Threshold 阈值（百分比）
     */
    public void setThreshold(Long Threshold) {
        this.Threshold = Threshold;
    }

    /**
     * Get 是否启用 
     * @return Enabled 是否启用
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 是否启用
     * @param Enabled 是否启用
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    public HorizontalAutoscaler() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HorizontalAutoscaler(HorizontalAutoscaler source) {
        if (source.MinReplicas != null) {
            this.MinReplicas = new Long(source.MinReplicas);
        }
        if (source.MaxReplicas != null) {
            this.MaxReplicas = new Long(source.MaxReplicas);
        }
        if (source.Metrics != null) {
            this.Metrics = new String(source.Metrics);
        }
        if (source.Threshold != null) {
            this.Threshold = new Long(source.Threshold);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MinReplicas", this.MinReplicas);
        this.setParamSimple(map, prefix + "MaxReplicas", this.MaxReplicas);
        this.setParamSimple(map, prefix + "Metrics", this.Metrics);
        this.setParamSimple(map, prefix + "Threshold", this.Threshold);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);

    }
}

