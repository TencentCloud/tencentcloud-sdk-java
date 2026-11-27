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

public class RealtimeConfig extends AbstractModel {

    /**
    * <p>Realtime 模型路由策略。</p><p>入参限制：仅支持 SimpleShuffle（随机）、LeastBusy（最少繁忙）、CostBasedRouting（最低成本）。</p><p>默认值：SimpleShuffle</p><p>修改时未传保留旧策略；切换策略会清理旧策略的 RoutingStrategyArgs。不接受 null。</p>
    */
    @SerializedName("RoutingStrategy")
    @Expose
    private String RoutingStrategy;

    /**
    * <p>Realtime 路由重试次数。</p><p>取值范围：[0, 5]</p><p>默认值：2</p><p>仅接受整数，0 表示不重试。修改时未提供此字段则保留旧值，不接受 null。</p>
    */
    @SerializedName("NumRetries")
    @Expose
    private Long NumRetries;

    /**
    * <p>Realtime 路由策略的附加参数。</p><p>入参限制：LeastBusy 仅接受 LeastBusyBuffer；CostBasedRouting 仅接受 LowestCostBuffer；SimpleShuffle 仅接受空对象。</p><p>修改时未提供的参数保留旧值，切换策略时清理旧参数；适用的 Buffer 默认 0。不接受 null。</p>
    */
    @SerializedName("RoutingStrategyArgs")
    @Expose
    private RealtimeRoutingStrategyArgs RoutingStrategyArgs;

    /**
     * Get <p>Realtime 模型路由策略。</p><p>入参限制：仅支持 SimpleShuffle（随机）、LeastBusy（最少繁忙）、CostBasedRouting（最低成本）。</p><p>默认值：SimpleShuffle</p><p>修改时未传保留旧策略；切换策略会清理旧策略的 RoutingStrategyArgs。不接受 null。</p> 
     * @return RoutingStrategy <p>Realtime 模型路由策略。</p><p>入参限制：仅支持 SimpleShuffle（随机）、LeastBusy（最少繁忙）、CostBasedRouting（最低成本）。</p><p>默认值：SimpleShuffle</p><p>修改时未传保留旧策略；切换策略会清理旧策略的 RoutingStrategyArgs。不接受 null。</p>
     */
    public String getRoutingStrategy() {
        return this.RoutingStrategy;
    }

    /**
     * Set <p>Realtime 模型路由策略。</p><p>入参限制：仅支持 SimpleShuffle（随机）、LeastBusy（最少繁忙）、CostBasedRouting（最低成本）。</p><p>默认值：SimpleShuffle</p><p>修改时未传保留旧策略；切换策略会清理旧策略的 RoutingStrategyArgs。不接受 null。</p>
     * @param RoutingStrategy <p>Realtime 模型路由策略。</p><p>入参限制：仅支持 SimpleShuffle（随机）、LeastBusy（最少繁忙）、CostBasedRouting（最低成本）。</p><p>默认值：SimpleShuffle</p><p>修改时未传保留旧策略；切换策略会清理旧策略的 RoutingStrategyArgs。不接受 null。</p>
     */
    public void setRoutingStrategy(String RoutingStrategy) {
        this.RoutingStrategy = RoutingStrategy;
    }

    /**
     * Get <p>Realtime 路由重试次数。</p><p>取值范围：[0, 5]</p><p>默认值：2</p><p>仅接受整数，0 表示不重试。修改时未提供此字段则保留旧值，不接受 null。</p> 
     * @return NumRetries <p>Realtime 路由重试次数。</p><p>取值范围：[0, 5]</p><p>默认值：2</p><p>仅接受整数，0 表示不重试。修改时未提供此字段则保留旧值，不接受 null。</p>
     */
    public Long getNumRetries() {
        return this.NumRetries;
    }

    /**
     * Set <p>Realtime 路由重试次数。</p><p>取值范围：[0, 5]</p><p>默认值：2</p><p>仅接受整数，0 表示不重试。修改时未提供此字段则保留旧值，不接受 null。</p>
     * @param NumRetries <p>Realtime 路由重试次数。</p><p>取值范围：[0, 5]</p><p>默认值：2</p><p>仅接受整数，0 表示不重试。修改时未提供此字段则保留旧值，不接受 null。</p>
     */
    public void setNumRetries(Long NumRetries) {
        this.NumRetries = NumRetries;
    }

    /**
     * Get <p>Realtime 路由策略的附加参数。</p><p>入参限制：LeastBusy 仅接受 LeastBusyBuffer；CostBasedRouting 仅接受 LowestCostBuffer；SimpleShuffle 仅接受空对象。</p><p>修改时未提供的参数保留旧值，切换策略时清理旧参数；适用的 Buffer 默认 0。不接受 null。</p> 
     * @return RoutingStrategyArgs <p>Realtime 路由策略的附加参数。</p><p>入参限制：LeastBusy 仅接受 LeastBusyBuffer；CostBasedRouting 仅接受 LowestCostBuffer；SimpleShuffle 仅接受空对象。</p><p>修改时未提供的参数保留旧值，切换策略时清理旧参数；适用的 Buffer 默认 0。不接受 null。</p>
     */
    public RealtimeRoutingStrategyArgs getRoutingStrategyArgs() {
        return this.RoutingStrategyArgs;
    }

    /**
     * Set <p>Realtime 路由策略的附加参数。</p><p>入参限制：LeastBusy 仅接受 LeastBusyBuffer；CostBasedRouting 仅接受 LowestCostBuffer；SimpleShuffle 仅接受空对象。</p><p>修改时未提供的参数保留旧值，切换策略时清理旧参数；适用的 Buffer 默认 0。不接受 null。</p>
     * @param RoutingStrategyArgs <p>Realtime 路由策略的附加参数。</p><p>入参限制：LeastBusy 仅接受 LeastBusyBuffer；CostBasedRouting 仅接受 LowestCostBuffer；SimpleShuffle 仅接受空对象。</p><p>修改时未提供的参数保留旧值，切换策略时清理旧参数；适用的 Buffer 默认 0。不接受 null。</p>
     */
    public void setRoutingStrategyArgs(RealtimeRoutingStrategyArgs RoutingStrategyArgs) {
        this.RoutingStrategyArgs = RoutingStrategyArgs;
    }

    public RealtimeConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RealtimeConfig(RealtimeConfig source) {
        if (source.RoutingStrategy != null) {
            this.RoutingStrategy = new String(source.RoutingStrategy);
        }
        if (source.NumRetries != null) {
            this.NumRetries = new Long(source.NumRetries);
        }
        if (source.RoutingStrategyArgs != null) {
            this.RoutingStrategyArgs = new RealtimeRoutingStrategyArgs(source.RoutingStrategyArgs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoutingStrategy", this.RoutingStrategy);
        this.setParamSimple(map, prefix + "NumRetries", this.NumRetries);
        this.setParamObj(map, prefix + "RoutingStrategyArgs.", this.RoutingStrategyArgs);

    }
}

