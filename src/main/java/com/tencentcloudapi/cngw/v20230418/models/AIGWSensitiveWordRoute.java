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

public class AIGWSensitiveWordRoute extends AbstractModel {

    /**
    * <p>是否开启</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * <p>模型API ID列表</p>
    */
    @SerializedName("ModelServiceRefs")
    @Expose
    private String [] ModelServiceRefs;

    /**
    * <p>查询接口会返回模型API的Name列表</p>
    */
    @SerializedName("ModelServiceNames")
    @Expose
    private String [] ModelServiceNames;

    /**
    * <p>路由方式</p><p>枚举值：</p><ul><li>Weighted： 权重路由</li><li>ModelName： 按模型名称路由</li></ul>
    */
    @SerializedName("SelectedTypes")
    @Expose
    private String [] SelectedTypes;

    /**
    * <p>权重路由配置</p>
    */
    @SerializedName("WeightedConfig")
    @Expose
    private CloudNativeAPIGatewayLLMModelServiceRouteWeightedStrategy [] WeightedConfig;

    /**
    * <p>路由名称路由配置</p>
    */
    @SerializedName("ModelNameConfig")
    @Expose
    private CloudNativeAPIGatewayLLMModelServiceRouteModelNameStrategy [] ModelNameConfig;

    /**
     * Get <p>是否开启</p> 
     * @return Enabled <p>是否开启</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>是否开启</p>
     * @param Enabled <p>是否开启</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>模型API ID列表</p> 
     * @return ModelServiceRefs <p>模型API ID列表</p>
     */
    public String [] getModelServiceRefs() {
        return this.ModelServiceRefs;
    }

    /**
     * Set <p>模型API ID列表</p>
     * @param ModelServiceRefs <p>模型API ID列表</p>
     */
    public void setModelServiceRefs(String [] ModelServiceRefs) {
        this.ModelServiceRefs = ModelServiceRefs;
    }

    /**
     * Get <p>查询接口会返回模型API的Name列表</p> 
     * @return ModelServiceNames <p>查询接口会返回模型API的Name列表</p>
     */
    public String [] getModelServiceNames() {
        return this.ModelServiceNames;
    }

    /**
     * Set <p>查询接口会返回模型API的Name列表</p>
     * @param ModelServiceNames <p>查询接口会返回模型API的Name列表</p>
     */
    public void setModelServiceNames(String [] ModelServiceNames) {
        this.ModelServiceNames = ModelServiceNames;
    }

    /**
     * Get <p>路由方式</p><p>枚举值：</p><ul><li>Weighted： 权重路由</li><li>ModelName： 按模型名称路由</li></ul> 
     * @return SelectedTypes <p>路由方式</p><p>枚举值：</p><ul><li>Weighted： 权重路由</li><li>ModelName： 按模型名称路由</li></ul>
     */
    public String [] getSelectedTypes() {
        return this.SelectedTypes;
    }

    /**
     * Set <p>路由方式</p><p>枚举值：</p><ul><li>Weighted： 权重路由</li><li>ModelName： 按模型名称路由</li></ul>
     * @param SelectedTypes <p>路由方式</p><p>枚举值：</p><ul><li>Weighted： 权重路由</li><li>ModelName： 按模型名称路由</li></ul>
     */
    public void setSelectedTypes(String [] SelectedTypes) {
        this.SelectedTypes = SelectedTypes;
    }

    /**
     * Get <p>权重路由配置</p> 
     * @return WeightedConfig <p>权重路由配置</p>
     */
    public CloudNativeAPIGatewayLLMModelServiceRouteWeightedStrategy [] getWeightedConfig() {
        return this.WeightedConfig;
    }

    /**
     * Set <p>权重路由配置</p>
     * @param WeightedConfig <p>权重路由配置</p>
     */
    public void setWeightedConfig(CloudNativeAPIGatewayLLMModelServiceRouteWeightedStrategy [] WeightedConfig) {
        this.WeightedConfig = WeightedConfig;
    }

    /**
     * Get <p>路由名称路由配置</p> 
     * @return ModelNameConfig <p>路由名称路由配置</p>
     */
    public CloudNativeAPIGatewayLLMModelServiceRouteModelNameStrategy [] getModelNameConfig() {
        return this.ModelNameConfig;
    }

    /**
     * Set <p>路由名称路由配置</p>
     * @param ModelNameConfig <p>路由名称路由配置</p>
     */
    public void setModelNameConfig(CloudNativeAPIGatewayLLMModelServiceRouteModelNameStrategy [] ModelNameConfig) {
        this.ModelNameConfig = ModelNameConfig;
    }

    public AIGWSensitiveWordRoute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWSensitiveWordRoute(AIGWSensitiveWordRoute source) {
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.ModelServiceRefs != null) {
            this.ModelServiceRefs = new String[source.ModelServiceRefs.length];
            for (int i = 0; i < source.ModelServiceRefs.length; i++) {
                this.ModelServiceRefs[i] = new String(source.ModelServiceRefs[i]);
            }
        }
        if (source.ModelServiceNames != null) {
            this.ModelServiceNames = new String[source.ModelServiceNames.length];
            for (int i = 0; i < source.ModelServiceNames.length; i++) {
                this.ModelServiceNames[i] = new String(source.ModelServiceNames[i]);
            }
        }
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
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamArraySimple(map, prefix + "ModelServiceRefs.", this.ModelServiceRefs);
        this.setParamArraySimple(map, prefix + "ModelServiceNames.", this.ModelServiceNames);
        this.setParamArraySimple(map, prefix + "SelectedTypes.", this.SelectedTypes);
        this.setParamArrayObj(map, prefix + "WeightedConfig.", this.WeightedConfig);
        this.setParamArrayObj(map, prefix + "ModelNameConfig.", this.ModelNameConfig);

    }
}

