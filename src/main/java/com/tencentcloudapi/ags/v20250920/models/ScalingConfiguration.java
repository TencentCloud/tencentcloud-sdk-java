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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScalingConfiguration extends AbstractModel {

    /**
    * <p>活跃 Sandbox Instance 下限，必须大于等于 0。</p>
    */
    @SerializedName("MinInstanceCount")
    @Expose
    private Long MinInstanceCount;

    /**
    * <p>活跃 Sandbox Instance 上限，必须大于等于 1，并且不小于 MinInstanceCount。</p>
    */
    @SerializedName("MaxInstanceCount")
    @Expose
    private Long MaxInstanceCount;

    /**
    * <p>每个活跃 Sandbox Instance 同时持有的 Deployment 请求或连接 Lease 上限，必须大于等于 1。</p>
    */
    @SerializedName("MaxInstanceRequestConcurrency")
    @Expose
    private Long MaxInstanceRequestConcurrency;

    /**
     * Get <p>活跃 Sandbox Instance 下限，必须大于等于 0。</p> 
     * @return MinInstanceCount <p>活跃 Sandbox Instance 下限，必须大于等于 0。</p>
     */
    public Long getMinInstanceCount() {
        return this.MinInstanceCount;
    }

    /**
     * Set <p>活跃 Sandbox Instance 下限，必须大于等于 0。</p>
     * @param MinInstanceCount <p>活跃 Sandbox Instance 下限，必须大于等于 0。</p>
     */
    public void setMinInstanceCount(Long MinInstanceCount) {
        this.MinInstanceCount = MinInstanceCount;
    }

    /**
     * Get <p>活跃 Sandbox Instance 上限，必须大于等于 1，并且不小于 MinInstanceCount。</p> 
     * @return MaxInstanceCount <p>活跃 Sandbox Instance 上限，必须大于等于 1，并且不小于 MinInstanceCount。</p>
     */
    public Long getMaxInstanceCount() {
        return this.MaxInstanceCount;
    }

    /**
     * Set <p>活跃 Sandbox Instance 上限，必须大于等于 1，并且不小于 MinInstanceCount。</p>
     * @param MaxInstanceCount <p>活跃 Sandbox Instance 上限，必须大于等于 1，并且不小于 MinInstanceCount。</p>
     */
    public void setMaxInstanceCount(Long MaxInstanceCount) {
        this.MaxInstanceCount = MaxInstanceCount;
    }

    /**
     * Get <p>每个活跃 Sandbox Instance 同时持有的 Deployment 请求或连接 Lease 上限，必须大于等于 1。</p> 
     * @return MaxInstanceRequestConcurrency <p>每个活跃 Sandbox Instance 同时持有的 Deployment 请求或连接 Lease 上限，必须大于等于 1。</p>
     */
    public Long getMaxInstanceRequestConcurrency() {
        return this.MaxInstanceRequestConcurrency;
    }

    /**
     * Set <p>每个活跃 Sandbox Instance 同时持有的 Deployment 请求或连接 Lease 上限，必须大于等于 1。</p>
     * @param MaxInstanceRequestConcurrency <p>每个活跃 Sandbox Instance 同时持有的 Deployment 请求或连接 Lease 上限，必须大于等于 1。</p>
     */
    public void setMaxInstanceRequestConcurrency(Long MaxInstanceRequestConcurrency) {
        this.MaxInstanceRequestConcurrency = MaxInstanceRequestConcurrency;
    }

    public ScalingConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScalingConfiguration(ScalingConfiguration source) {
        if (source.MinInstanceCount != null) {
            this.MinInstanceCount = new Long(source.MinInstanceCount);
        }
        if (source.MaxInstanceCount != null) {
            this.MaxInstanceCount = new Long(source.MaxInstanceCount);
        }
        if (source.MaxInstanceRequestConcurrency != null) {
            this.MaxInstanceRequestConcurrency = new Long(source.MaxInstanceRequestConcurrency);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MinInstanceCount", this.MinInstanceCount);
        this.setParamSimple(map, prefix + "MaxInstanceCount", this.MaxInstanceCount);
        this.setParamSimple(map, prefix + "MaxInstanceRequestConcurrency", this.MaxInstanceRequestConcurrency);

    }
}

