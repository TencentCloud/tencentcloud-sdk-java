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

public class CloudNativeAPIGatewayLLMModelServiceRoute extends AbstractModel {

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
    * <p>模型名称路由配置，最多10个</p>
    */
    @SerializedName("ModelNameConfig")
    @Expose
    private CloudNativeAPIGatewayLLMModelServiceRouteModelNameStrategy [] ModelNameConfig;

    /**
    * <p>意图识别</p>
    */
    @SerializedName("IntentRouteConfig")
    @Expose
    private AIGWIntentRoute IntentRouteConfig;

    /**
    * <p>延迟路由</p>
    */
    @SerializedName("LatencyPriorityConfig")
    @Expose
    private AIGWLatencyPriorityConfig LatencyPriorityConfig;

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
     * Get <p>模型名称路由配置，最多10个</p> 
     * @return ModelNameConfig <p>模型名称路由配置，最多10个</p>
     */
    public CloudNativeAPIGatewayLLMModelServiceRouteModelNameStrategy [] getModelNameConfig() {
        return this.ModelNameConfig;
    }

    /**
     * Set <p>模型名称路由配置，最多10个</p>
     * @param ModelNameConfig <p>模型名称路由配置，最多10个</p>
     */
    public void setModelNameConfig(CloudNativeAPIGatewayLLMModelServiceRouteModelNameStrategy [] ModelNameConfig) {
        this.ModelNameConfig = ModelNameConfig;
    }

    /**
     * Get <p>意图识别</p> 
     * @return IntentRouteConfig <p>意图识别</p>
     */
    public AIGWIntentRoute getIntentRouteConfig() {
        return this.IntentRouteConfig;
    }

    /**
     * Set <p>意图识别</p>
     * @param IntentRouteConfig <p>意图识别</p>
     */
    public void setIntentRouteConfig(AIGWIntentRoute IntentRouteConfig) {
        this.IntentRouteConfig = IntentRouteConfig;
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

    public CloudNativeAPIGatewayLLMModelServiceRoute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudNativeAPIGatewayLLMModelServiceRoute(CloudNativeAPIGatewayLLMModelServiceRoute source) {
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
        if (source.ModelNameConfig != null) {
            this.ModelNameConfig = new CloudNativeAPIGatewayLLMModelServiceRouteModelNameStrategy[source.ModelNameConfig.length];
            for (int i = 0; i < source.ModelNameConfig.length; i++) {
                this.ModelNameConfig[i] = new CloudNativeAPIGatewayLLMModelServiceRouteModelNameStrategy(source.ModelNameConfig[i]);
            }
        }
        if (source.IntentRouteConfig != null) {
            this.IntentRouteConfig = new AIGWIntentRoute(source.IntentRouteConfig);
        }
        if (source.LatencyPriorityConfig != null) {
            this.LatencyPriorityConfig = new AIGWLatencyPriorityConfig(source.LatencyPriorityConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SelectedTypes.", this.SelectedTypes);
        this.setParamArrayObj(map, prefix + "WeightedConfig.", this.WeightedConfig);
        this.setParamArrayObj(map, prefix + "ModelNameConfig.", this.ModelNameConfig);
        this.setParamObj(map, prefix + "IntentRouteConfig.", this.IntentRouteConfig);
        this.setParamObj(map, prefix + "LatencyPriorityConfig.", this.LatencyPriorityConfig);

    }
}

