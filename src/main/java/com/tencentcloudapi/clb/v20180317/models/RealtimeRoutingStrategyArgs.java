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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RealtimeRoutingStrategyArgs extends AbstractModel {

    /**
    * <p>LeastBusy 路由策略的缓冲参数，仅 RoutingStrategy=LeastBusy 时允许设置。</p><p>取值范围：[0, 1000]</p><p>默认值：0</p><p>最多支持两位小数；不接受字符串、布尔值或 null。修改时未传保留旧值，显式 0 生效。</p>
    */
    @SerializedName("LeastBusyBuffer")
    @Expose
    private Float LeastBusyBuffer;

    /**
    * <p>CostBasedRouting 路由策略的缓冲参数，仅 RoutingStrategy=CostBasedRouting 时允许设置。</p><p>取值范围：[0, 1000]</p><p>默认值：0</p><p>最多支持两位小数；不接受字符串、布尔值或 null。修改时未传保留旧值，显式 0 生效。</p>
    */
    @SerializedName("LowestCostBuffer")
    @Expose
    private Float LowestCostBuffer;

    /**
     * Get <p>LeastBusy 路由策略的缓冲参数，仅 RoutingStrategy=LeastBusy 时允许设置。</p><p>取值范围：[0, 1000]</p><p>默认值：0</p><p>最多支持两位小数；不接受字符串、布尔值或 null。修改时未传保留旧值，显式 0 生效。</p> 
     * @return LeastBusyBuffer <p>LeastBusy 路由策略的缓冲参数，仅 RoutingStrategy=LeastBusy 时允许设置。</p><p>取值范围：[0, 1000]</p><p>默认值：0</p><p>最多支持两位小数；不接受字符串、布尔值或 null。修改时未传保留旧值，显式 0 生效。</p>
     */
    public Float getLeastBusyBuffer() {
        return this.LeastBusyBuffer;
    }

    /**
     * Set <p>LeastBusy 路由策略的缓冲参数，仅 RoutingStrategy=LeastBusy 时允许设置。</p><p>取值范围：[0, 1000]</p><p>默认值：0</p><p>最多支持两位小数；不接受字符串、布尔值或 null。修改时未传保留旧值，显式 0 生效。</p>
     * @param LeastBusyBuffer <p>LeastBusy 路由策略的缓冲参数，仅 RoutingStrategy=LeastBusy 时允许设置。</p><p>取值范围：[0, 1000]</p><p>默认值：0</p><p>最多支持两位小数；不接受字符串、布尔值或 null。修改时未传保留旧值，显式 0 生效。</p>
     */
    public void setLeastBusyBuffer(Float LeastBusyBuffer) {
        this.LeastBusyBuffer = LeastBusyBuffer;
    }

    /**
     * Get <p>CostBasedRouting 路由策略的缓冲参数，仅 RoutingStrategy=CostBasedRouting 时允许设置。</p><p>取值范围：[0, 1000]</p><p>默认值：0</p><p>最多支持两位小数；不接受字符串、布尔值或 null。修改时未传保留旧值，显式 0 生效。</p> 
     * @return LowestCostBuffer <p>CostBasedRouting 路由策略的缓冲参数，仅 RoutingStrategy=CostBasedRouting 时允许设置。</p><p>取值范围：[0, 1000]</p><p>默认值：0</p><p>最多支持两位小数；不接受字符串、布尔值或 null。修改时未传保留旧值，显式 0 生效。</p>
     */
    public Float getLowestCostBuffer() {
        return this.LowestCostBuffer;
    }

    /**
     * Set <p>CostBasedRouting 路由策略的缓冲参数，仅 RoutingStrategy=CostBasedRouting 时允许设置。</p><p>取值范围：[0, 1000]</p><p>默认值：0</p><p>最多支持两位小数；不接受字符串、布尔值或 null。修改时未传保留旧值，显式 0 生效。</p>
     * @param LowestCostBuffer <p>CostBasedRouting 路由策略的缓冲参数，仅 RoutingStrategy=CostBasedRouting 时允许设置。</p><p>取值范围：[0, 1000]</p><p>默认值：0</p><p>最多支持两位小数；不接受字符串、布尔值或 null。修改时未传保留旧值，显式 0 生效。</p>
     */
    public void setLowestCostBuffer(Float LowestCostBuffer) {
        this.LowestCostBuffer = LowestCostBuffer;
    }

    public RealtimeRoutingStrategyArgs() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RealtimeRoutingStrategyArgs(RealtimeRoutingStrategyArgs source) {
        if (source.LeastBusyBuffer != null) {
            this.LeastBusyBuffer = new Float(source.LeastBusyBuffer);
        }
        if (source.LowestCostBuffer != null) {
            this.LowestCostBuffer = new Float(source.LowestCostBuffer);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LeastBusyBuffer", this.LeastBusyBuffer);
        this.setParamSimple(map, prefix + "LowestCostBuffer", this.LowestCostBuffer);

    }
}

