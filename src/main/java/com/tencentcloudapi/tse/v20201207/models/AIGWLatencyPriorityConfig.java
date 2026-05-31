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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIGWLatencyPriorityConfig extends AbstractModel {

    /**
    * <p>路由规则列表</p>
    */
    @SerializedName("Rules")
    @Expose
    private AIGWLatencyPriorityRouteRule [] Rules;

    /**
    * <p>延迟指标</p><p>枚举值：</p><ul><li>LLMLatency： LLM 延迟</li><li>NetworkLatency： 网络延迟</li></ul>
    */
    @SerializedName("LatencyMetric")
    @Expose
    private String LatencyMetric;

    /**
    * <p>路由策略</p><p>枚举值：</p><ul><li>FastMode： 快速模式</li><li>BalanceMode： 均衡模式</li></ul>
    */
    @SerializedName("RouteMode")
    @Expose
    private String RouteMode;

    /**
     * Get <p>路由规则列表</p> 
     * @return Rules <p>路由规则列表</p>
     */
    public AIGWLatencyPriorityRouteRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set <p>路由规则列表</p>
     * @param Rules <p>路由规则列表</p>
     */
    public void setRules(AIGWLatencyPriorityRouteRule [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get <p>延迟指标</p><p>枚举值：</p><ul><li>LLMLatency： LLM 延迟</li><li>NetworkLatency： 网络延迟</li></ul> 
     * @return LatencyMetric <p>延迟指标</p><p>枚举值：</p><ul><li>LLMLatency： LLM 延迟</li><li>NetworkLatency： 网络延迟</li></ul>
     */
    public String getLatencyMetric() {
        return this.LatencyMetric;
    }

    /**
     * Set <p>延迟指标</p><p>枚举值：</p><ul><li>LLMLatency： LLM 延迟</li><li>NetworkLatency： 网络延迟</li></ul>
     * @param LatencyMetric <p>延迟指标</p><p>枚举值：</p><ul><li>LLMLatency： LLM 延迟</li><li>NetworkLatency： 网络延迟</li></ul>
     */
    public void setLatencyMetric(String LatencyMetric) {
        this.LatencyMetric = LatencyMetric;
    }

    /**
     * Get <p>路由策略</p><p>枚举值：</p><ul><li>FastMode： 快速模式</li><li>BalanceMode： 均衡模式</li></ul> 
     * @return RouteMode <p>路由策略</p><p>枚举值：</p><ul><li>FastMode： 快速模式</li><li>BalanceMode： 均衡模式</li></ul>
     */
    public String getRouteMode() {
        return this.RouteMode;
    }

    /**
     * Set <p>路由策略</p><p>枚举值：</p><ul><li>FastMode： 快速模式</li><li>BalanceMode： 均衡模式</li></ul>
     * @param RouteMode <p>路由策略</p><p>枚举值：</p><ul><li>FastMode： 快速模式</li><li>BalanceMode： 均衡模式</li></ul>
     */
    public void setRouteMode(String RouteMode) {
        this.RouteMode = RouteMode;
    }

    public AIGWLatencyPriorityConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWLatencyPriorityConfig(AIGWLatencyPriorityConfig source) {
        if (source.Rules != null) {
            this.Rules = new AIGWLatencyPriorityRouteRule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new AIGWLatencyPriorityRouteRule(source.Rules[i]);
            }
        }
        if (source.LatencyMetric != null) {
            this.LatencyMetric = new String(source.LatencyMetric);
        }
        if (source.RouteMode != null) {
            this.RouteMode = new String(source.RouteMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "LatencyMetric", this.LatencyMetric);
        this.setParamSimple(map, prefix + "RouteMode", this.RouteMode);

    }
}

