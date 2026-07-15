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

public class AIGWLLMModelServiceSubRoute extends AbstractModel {

    /**
    * <p>生效的路由算法类型：权重路由，模型名称路由、参数路由等Weighted/ModelName/Query (预留多个，暂时只能填写一个)</p>
    */
    @SerializedName("SelectedTypes")
    @Expose
    private String [] SelectedTypes;

    /**
    * <p>权重路由配置，最多10个</p>
    */
    @SerializedName("WeightedConfig")
    @Expose
    private CloudNativeAPIGatewayLLMModelServiceRouteWeightedStrategy [] WeightedConfig;

    /**
    * <p>延迟路由</p>
    */
    @SerializedName("LatencyPriorityConfig")
    @Expose
    private AIGWLatencyPriorityConfig LatencyPriorityConfig;

    /**
    * <p>指定模型路由（暂时只用在Token长度路由时的子路由选择）</p>
    */
    @SerializedName("ModelServiceConfig")
    @Expose
    private AIGWRouteModelServiceConfig ModelServiceConfig;

    /**
     * Get <p>生效的路由算法类型：权重路由，模型名称路由、参数路由等Weighted/ModelName/Query (预留多个，暂时只能填写一个)</p> 
     * @return SelectedTypes <p>生效的路由算法类型：权重路由，模型名称路由、参数路由等Weighted/ModelName/Query (预留多个，暂时只能填写一个)</p>
     */
    public String [] getSelectedTypes() {
        return this.SelectedTypes;
    }

    /**
     * Set <p>生效的路由算法类型：权重路由，模型名称路由、参数路由等Weighted/ModelName/Query (预留多个，暂时只能填写一个)</p>
     * @param SelectedTypes <p>生效的路由算法类型：权重路由，模型名称路由、参数路由等Weighted/ModelName/Query (预留多个，暂时只能填写一个)</p>
     */
    public void setSelectedTypes(String [] SelectedTypes) {
        this.SelectedTypes = SelectedTypes;
    }

    /**
     * Get <p>权重路由配置，最多10个</p> 
     * @return WeightedConfig <p>权重路由配置，最多10个</p>
     */
    public CloudNativeAPIGatewayLLMModelServiceRouteWeightedStrategy [] getWeightedConfig() {
        return this.WeightedConfig;
    }

    /**
     * Set <p>权重路由配置，最多10个</p>
     * @param WeightedConfig <p>权重路由配置，最多10个</p>
     */
    public void setWeightedConfig(CloudNativeAPIGatewayLLMModelServiceRouteWeightedStrategy [] WeightedConfig) {
        this.WeightedConfig = WeightedConfig;
    }

    /**
     * Get <p>延迟路由</p> 
     * @return LatencyPriorityConfig <p>延迟路由</p>
     */
    public AIGWLatencyPriorityConfig getLatencyPriorityConfig() {
        return this.LatencyPriorityConfig;
    }

    /**
     * Set <p>延迟路由</p>
     * @param LatencyPriorityConfig <p>延迟路由</p>
     */
    public void setLatencyPriorityConfig(AIGWLatencyPriorityConfig LatencyPriorityConfig) {
        this.LatencyPriorityConfig = LatencyPriorityConfig;
    }

    /**
     * Get <p>指定模型路由（暂时只用在Token长度路由时的子路由选择）</p> 
     * @return ModelServiceConfig <p>指定模型路由（暂时只用在Token长度路由时的子路由选择）</p>
     */
    public AIGWRouteModelServiceConfig getModelServiceConfig() {
        return this.ModelServiceConfig;
    }

    /**
     * Set <p>指定模型路由（暂时只用在Token长度路由时的子路由选择）</p>
     * @param ModelServiceConfig <p>指定模型路由（暂时只用在Token长度路由时的子路由选择）</p>
     */
    public void setModelServiceConfig(AIGWRouteModelServiceConfig ModelServiceConfig) {
        this.ModelServiceConfig = ModelServiceConfig;
    }

    public AIGWLLMModelServiceSubRoute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWLLMModelServiceSubRoute(AIGWLLMModelServiceSubRoute source) {
        if (source.SelectedTypes != null) {
            this.SelectedTypes = new String[source.SelectedTypes.length];
            for (int i = 0; i < source.SelectedTypes.length; i++) {
                this.SelectedTypes[i] = new String(source.SelectedTypes[i]);
            }
        }
        if (source.WeightedConfig != null) {
            this.WeightedConfig = new CloudNativeAPIGatewayLLMModelServiceRouteWeightedStrategy[source.WeightedConfig.length];
            for (int i = 0; i < source.WeightedConfig.length; i++) {
                this.WeightedConfig[i] = new CloudNativeAPIGatewayLLMModelServiceRouteWeightedStrategy(source.WeightedConfig[i]);
            }
        }
        if (source.LatencyPriorityConfig != null) {
            this.LatencyPriorityConfig = new AIGWLatencyPriorityConfig(source.LatencyPriorityConfig);
        }
        if (source.ModelServiceConfig != null) {
            this.ModelServiceConfig = new AIGWRouteModelServiceConfig(source.ModelServiceConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SelectedTypes.", this.SelectedTypes);
        this.setParamArrayObj(map, prefix + "WeightedConfig.", this.WeightedConfig);
        this.setParamObj(map, prefix + "LatencyPriorityConfig.", this.LatencyPriorityConfig);
        this.setParamObj(map, prefix + "ModelServiceConfig.", this.ModelServiceConfig);

    }
}

