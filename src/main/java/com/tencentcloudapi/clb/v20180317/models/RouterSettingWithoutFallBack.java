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

public class RouterSettingWithoutFallBack extends AbstractModel {

    /**
    * <p>路由策略</p><p>枚举值：</p><ul><li>SimpleShuffle： 简单随机路由</li><li>LeastBusy： 最低繁忙路由</li><li>LatencyBasedRouting： 最低延迟路由</li><li>UsageBasedRouting： 用量均衡路由</li><li>CostBasedRouting： 最低积分路由</li></ul>
    */
    @SerializedName("RoutingStrategy")
    @Expose
    private String RoutingStrategy;

    /**
    * <p>模型间路由策略。</p><p>枚举值：</p><ul><li>SimpleShuffle： 简单随机路由</li><li>CostBasedRouting： 最低积分路由</li></ul>
    */
    @SerializedName("CrossModelGroupRoutingStrategy")
    @Expose
    private String CrossModelGroupRoutingStrategy;

    /**
    * <p>L2模型组内路由调度算法参数</p>
    */
    @SerializedName("RoutingStrategyArgs")
    @Expose
    private RoutingStrategyArgs RoutingStrategyArgs;

    /**
    * <p>CMR实例级别请求组内重试次数</p><p>取值范围：[0, 5]</p><p>默认值：2</p>
    */
    @SerializedName("NumRetries")
    @Expose
    private Long NumRetries;

    /**
     * Get <p>路由策略</p><p>枚举值：</p><ul><li>SimpleShuffle： 简单随机路由</li><li>LeastBusy： 最低繁忙路由</li><li>LatencyBasedRouting： 最低延迟路由</li><li>UsageBasedRouting： 用量均衡路由</li><li>CostBasedRouting： 最低积分路由</li></ul> 
     * @return RoutingStrategy <p>路由策略</p><p>枚举值：</p><ul><li>SimpleShuffle： 简单随机路由</li><li>LeastBusy： 最低繁忙路由</li><li>LatencyBasedRouting： 最低延迟路由</li><li>UsageBasedRouting： 用量均衡路由</li><li>CostBasedRouting： 最低积分路由</li></ul>
     */
    public String getRoutingStrategy() {
        return this.RoutingStrategy;
    }

    /**
     * Set <p>路由策略</p><p>枚举值：</p><ul><li>SimpleShuffle： 简单随机路由</li><li>LeastBusy： 最低繁忙路由</li><li>LatencyBasedRouting： 最低延迟路由</li><li>UsageBasedRouting： 用量均衡路由</li><li>CostBasedRouting： 最低积分路由</li></ul>
     * @param RoutingStrategy <p>路由策略</p><p>枚举值：</p><ul><li>SimpleShuffle： 简单随机路由</li><li>LeastBusy： 最低繁忙路由</li><li>LatencyBasedRouting： 最低延迟路由</li><li>UsageBasedRouting： 用量均衡路由</li><li>CostBasedRouting： 最低积分路由</li></ul>
     */
    public void setRoutingStrategy(String RoutingStrategy) {
        this.RoutingStrategy = RoutingStrategy;
    }

    /**
     * Get <p>模型间路由策略。</p><p>枚举值：</p><ul><li>SimpleShuffle： 简单随机路由</li><li>CostBasedRouting： 最低积分路由</li></ul> 
     * @return CrossModelGroupRoutingStrategy <p>模型间路由策略。</p><p>枚举值：</p><ul><li>SimpleShuffle： 简单随机路由</li><li>CostBasedRouting： 最低积分路由</li></ul>
     */
    public String getCrossModelGroupRoutingStrategy() {
        return this.CrossModelGroupRoutingStrategy;
    }

    /**
     * Set <p>模型间路由策略。</p><p>枚举值：</p><ul><li>SimpleShuffle： 简单随机路由</li><li>CostBasedRouting： 最低积分路由</li></ul>
     * @param CrossModelGroupRoutingStrategy <p>模型间路由策略。</p><p>枚举值：</p><ul><li>SimpleShuffle： 简单随机路由</li><li>CostBasedRouting： 最低积分路由</li></ul>
     */
    public void setCrossModelGroupRoutingStrategy(String CrossModelGroupRoutingStrategy) {
        this.CrossModelGroupRoutingStrategy = CrossModelGroupRoutingStrategy;
    }

    /**
     * Get <p>L2模型组内路由调度算法参数</p> 
     * @return RoutingStrategyArgs <p>L2模型组内路由调度算法参数</p>
     */
    public RoutingStrategyArgs getRoutingStrategyArgs() {
        return this.RoutingStrategyArgs;
    }

    /**
     * Set <p>L2模型组内路由调度算法参数</p>
     * @param RoutingStrategyArgs <p>L2模型组内路由调度算法参数</p>
     */
    public void setRoutingStrategyArgs(RoutingStrategyArgs RoutingStrategyArgs) {
        this.RoutingStrategyArgs = RoutingStrategyArgs;
    }

    /**
     * Get <p>CMR实例级别请求组内重试次数</p><p>取值范围：[0, 5]</p><p>默认值：2</p> 
     * @return NumRetries <p>CMR实例级别请求组内重试次数</p><p>取值范围：[0, 5]</p><p>默认值：2</p>
     */
    public Long getNumRetries() {
        return this.NumRetries;
    }

    /**
     * Set <p>CMR实例级别请求组内重试次数</p><p>取值范围：[0, 5]</p><p>默认值：2</p>
     * @param NumRetries <p>CMR实例级别请求组内重试次数</p><p>取值范围：[0, 5]</p><p>默认值：2</p>
     */
    public void setNumRetries(Long NumRetries) {
        this.NumRetries = NumRetries;
    }

    public RouterSettingWithoutFallBack() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RouterSettingWithoutFallBack(RouterSettingWithoutFallBack source) {
        if (source.RoutingStrategy != null) {
            this.RoutingStrategy = new String(source.RoutingStrategy);
        }
        if (source.CrossModelGroupRoutingStrategy != null) {
            this.CrossModelGroupRoutingStrategy = new String(source.CrossModelGroupRoutingStrategy);
        }
        if (source.RoutingStrategyArgs != null) {
            this.RoutingStrategyArgs = new RoutingStrategyArgs(source.RoutingStrategyArgs);
        }
        if (source.NumRetries != null) {
            this.NumRetries = new Long(source.NumRetries);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoutingStrategy", this.RoutingStrategy);
        this.setParamSimple(map, prefix + "CrossModelGroupRoutingStrategy", this.CrossModelGroupRoutingStrategy);
        this.setParamObj(map, prefix + "RoutingStrategyArgs.", this.RoutingStrategyArgs);
        this.setParamSimple(map, prefix + "NumRetries", this.NumRetries);

    }
}

