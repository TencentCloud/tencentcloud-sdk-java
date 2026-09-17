/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PlatformResUsageItem extends AbstractModel {

    /**
    * <p>资源类型</p><p>枚举值：</p><ul><li>Storage： 云存储</li><li>Function： 云函数</li></ul>
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * <p>资源点</p>
    */
    @SerializedName("TotalCredits")
    @Expose
    private Long TotalCredits;

    /**
    * <p>指标用量信息</p>
    */
    @SerializedName("Metrics")
    @Expose
    private PlatformMetricUsageItem [] Metrics;

    /**
     * Get <p>资源类型</p><p>枚举值：</p><ul><li>Storage： 云存储</li><li>Function： 云函数</li></ul> 
     * @return ResourceType <p>资源类型</p><p>枚举值：</p><ul><li>Storage： 云存储</li><li>Function： 云函数</li></ul>
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set <p>资源类型</p><p>枚举值：</p><ul><li>Storage： 云存储</li><li>Function： 云函数</li></ul>
     * @param ResourceType <p>资源类型</p><p>枚举值：</p><ul><li>Storage： 云存储</li><li>Function： 云函数</li></ul>
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get <p>资源点</p> 
     * @return TotalCredits <p>资源点</p>
     */
    public Long getTotalCredits() {
        return this.TotalCredits;
    }

    /**
     * Set <p>资源点</p>
     * @param TotalCredits <p>资源点</p>
     */
    public void setTotalCredits(Long TotalCredits) {
        this.TotalCredits = TotalCredits;
    }

    /**
     * Get <p>指标用量信息</p> 
     * @return Metrics <p>指标用量信息</p>
     */
    public PlatformMetricUsageItem [] getMetrics() {
        return this.Metrics;
    }

    /**
     * Set <p>指标用量信息</p>
     * @param Metrics <p>指标用量信息</p>
     */
    public void setMetrics(PlatformMetricUsageItem [] Metrics) {
        this.Metrics = Metrics;
    }

    public PlatformResUsageItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PlatformResUsageItem(PlatformResUsageItem source) {
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.TotalCredits != null) {
            this.TotalCredits = new Long(source.TotalCredits);
        }
        if (source.Metrics != null) {
            this.Metrics = new PlatformMetricUsageItem[source.Metrics.length];
            for (int i = 0; i < source.Metrics.length; i++) {
                this.Metrics[i] = new PlatformMetricUsageItem(source.Metrics[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "TotalCredits", this.TotalCredits);
        this.setParamArrayObj(map, prefix + "Metrics.", this.Metrics);

    }
}

