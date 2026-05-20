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

public class CloudNativeAPIGatewayLLMModelServiceRoute extends AbstractModel {

    /**
    * 生效的路由算法类型：权重路由，模型名称路由、参数路由等Weighted/ModelName/Query (预留多个，暂时只能填写一个)
    */
    @SerializedName("SelectedTypes")
    @Expose
    private String [] SelectedTypes;

    /**
    * 权重路由配置，最多10个
    */
    @SerializedName("WeightedConfig")
    @Expose
    private CloudNativeAPIGatewayLLMModelServiceRouteWeightedStrategy [] WeightedConfig;

    /**
    * 模型名称路由配置，最多10个
    */
    @SerializedName("ModelNameConfig")
    @Expose
    private CloudNativeAPIGatewayLLMModelServiceRouteModelNameStrategy [] ModelNameConfig;

    /**
     * Get 生效的路由算法类型：权重路由，模型名称路由、参数路由等Weighted/ModelName/Query (预留多个，暂时只能填写一个) 
     * @return SelectedTypes 生效的路由算法类型：权重路由，模型名称路由、参数路由等Weighted/ModelName/Query (预留多个，暂时只能填写一个)
     */
    public String [] getSelectedTypes() {
        return this.SelectedTypes;
    }

    /**
     * Set 生效的路由算法类型：权重路由，模型名称路由、参数路由等Weighted/ModelName/Query (预留多个，暂时只能填写一个)
     * @param SelectedTypes 生效的路由算法类型：权重路由，模型名称路由、参数路由等Weighted/ModelName/Query (预留多个，暂时只能填写一个)
     */
    public void setSelectedTypes(String [] SelectedTypes) {
        this.SelectedTypes = SelectedTypes;
    }

    /**
     * Get 权重路由配置，最多10个 
     * @return WeightedConfig 权重路由配置，最多10个
     */
    public CloudNativeAPIGatewayLLMModelServiceRouteWeightedStrategy [] getWeightedConfig() {
        return this.WeightedConfig;
    }

    /**
     * Set 权重路由配置，最多10个
     * @param WeightedConfig 权重路由配置，最多10个
     */
    public void setWeightedConfig(CloudNativeAPIGatewayLLMModelServiceRouteWeightedStrategy [] WeightedConfig) {
        this.WeightedConfig = WeightedConfig;
    }

    /**
     * Get 模型名称路由配置，最多10个 
     * @return ModelNameConfig 模型名称路由配置，最多10个
     */
    public CloudNativeAPIGatewayLLMModelServiceRouteModelNameStrategy [] getModelNameConfig() {
        return this.ModelNameConfig;
    }

    /**
     * Set 模型名称路由配置，最多10个
     * @param ModelNameConfig 模型名称路由配置，最多10个
     */
    public void setModelNameConfig(CloudNativeAPIGatewayLLMModelServiceRouteModelNameStrategy [] ModelNameConfig) {
        this.ModelNameConfig = ModelNameConfig;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SelectedTypes.", this.SelectedTypes);
        this.setParamArrayObj(map, prefix + "WeightedConfig.", this.WeightedConfig);
        this.setParamArrayObj(map, prefix + "ModelNameConfig.", this.ModelNameConfig);

    }
}

