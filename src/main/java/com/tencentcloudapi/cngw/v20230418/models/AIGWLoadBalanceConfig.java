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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIGWLoadBalanceConfig extends AbstractModel {

    /**
    * <p>负载均衡类型</p><p>枚举值：</p><ul><li>RoundRobin： 轮询</li><li>WeightedRoundRobin： 加权轮询</li><li>LeastConnections： 最少连接</li><li>Random： 随机</li></ul><p>默认值：RoundRobin</p>
    */
    @SerializedName("Algorithm")
    @Expose
    private String Algorithm;

    /**
     * Get <p>负载均衡类型</p><p>枚举值：</p><ul><li>RoundRobin： 轮询</li><li>WeightedRoundRobin： 加权轮询</li><li>LeastConnections： 最少连接</li><li>Random： 随机</li></ul><p>默认值：RoundRobin</p> 
     * @return Algorithm <p>负载均衡类型</p><p>枚举值：</p><ul><li>RoundRobin： 轮询</li><li>WeightedRoundRobin： 加权轮询</li><li>LeastConnections： 最少连接</li><li>Random： 随机</li></ul><p>默认值：RoundRobin</p>
     */
    public String getAlgorithm() {
        return this.Algorithm;
    }

    /**
     * Set <p>负载均衡类型</p><p>枚举值：</p><ul><li>RoundRobin： 轮询</li><li>WeightedRoundRobin： 加权轮询</li><li>LeastConnections： 最少连接</li><li>Random： 随机</li></ul><p>默认值：RoundRobin</p>
     * @param Algorithm <p>负载均衡类型</p><p>枚举值：</p><ul><li>RoundRobin： 轮询</li><li>WeightedRoundRobin： 加权轮询</li><li>LeastConnections： 最少连接</li><li>Random： 随机</li></ul><p>默认值：RoundRobin</p>
     */
    public void setAlgorithm(String Algorithm) {
        this.Algorithm = Algorithm;
    }

    public AIGWLoadBalanceConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWLoadBalanceConfig(AIGWLoadBalanceConfig source) {
        if (source.Algorithm != null) {
            this.Algorithm = new String(source.Algorithm);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Algorithm", this.Algorithm);

    }
}

