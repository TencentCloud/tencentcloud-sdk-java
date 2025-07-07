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

public class CreateAutoScalerResourceStrategyRequest extends AbstractModel {

    /**
    * 网关实例ID
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 策略名称
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
    * 策略描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 指标伸缩配置
    */
    @SerializedName("Config")
    @Expose
    private CloudNativeAPIGatewayStrategyAutoScalerConfig Config;

    /**
    * 定时伸缩配置列表
    */
    @SerializedName("CronScalerConfig")
    @Expose
    private CloudNativeAPIGatewayStrategyCronScalerConfig CronScalerConfig;

    /**
    * 最大节点数
    */
    @SerializedName("MaxReplicas")
    @Expose
    private Long MaxReplicas;

    /**
    * 定时伸缩配置
    */
    @SerializedName("CronConfig")
    @Expose
    private CloudNativeAPIGatewayStrategyCronScalerConfig CronConfig;

    /**
     * Get 网关实例ID 
     * @return GatewayId 网关实例ID
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 网关实例ID
     * @param GatewayId 网关实例ID
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 策略名称 
     * @return StrategyName 策略名称
     */
    public String getStrategyName() {
        return this.StrategyName;
    }

    /**
     * Set 策略名称
     * @param StrategyName 策略名称
     */
    public void setStrategyName(String StrategyName) {
        this.StrategyName = StrategyName;
    }

    /**
     * Get 策略描述 
     * @return Description 策略描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 策略描述
     * @param Description 策略描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 指标伸缩配置 
     * @return Config 指标伸缩配置
     */
    public CloudNativeAPIGatewayStrategyAutoScalerConfig getConfig() {
        return this.Config;
    }

    /**
     * Set 指标伸缩配置
     * @param Config 指标伸缩配置
     */
    public void setConfig(CloudNativeAPIGatewayStrategyAutoScalerConfig Config) {
        this.Config = Config;
    }

    /**
     * Get 定时伸缩配置列表 
     * @return CronScalerConfig 定时伸缩配置列表
     * @deprecated
     */
    @Deprecated
    public CloudNativeAPIGatewayStrategyCronScalerConfig getCronScalerConfig() {
        return this.CronScalerConfig;
    }

    /**
     * Set 定时伸缩配置列表
     * @param CronScalerConfig 定时伸缩配置列表
     * @deprecated
     */
    @Deprecated
    public void setCronScalerConfig(CloudNativeAPIGatewayStrategyCronScalerConfig CronScalerConfig) {
        this.CronScalerConfig = CronScalerConfig;
    }

    /**
     * Get 最大节点数 
     * @return MaxReplicas 最大节点数
     * @deprecated
     */
    @Deprecated
    public Long getMaxReplicas() {
        return this.MaxReplicas;
    }

    /**
     * Set 最大节点数
     * @param MaxReplicas 最大节点数
     * @deprecated
     */
    @Deprecated
    public void setMaxReplicas(Long MaxReplicas) {
        this.MaxReplicas = MaxReplicas;
    }

    /**
     * Get 定时伸缩配置 
     * @return CronConfig 定时伸缩配置
     */
    public CloudNativeAPIGatewayStrategyCronScalerConfig getCronConfig() {
        return this.CronConfig;
    }

    /**
     * Set 定时伸缩配置
     * @param CronConfig 定时伸缩配置
     */
    public void setCronConfig(CloudNativeAPIGatewayStrategyCronScalerConfig CronConfig) {
        this.CronConfig = CronConfig;
    }

    public CreateAutoScalerResourceStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAutoScalerResourceStrategyRequest(CreateAutoScalerResourceStrategyRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.StrategyName != null) {
            this.StrategyName = new String(source.StrategyName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Config != null) {
            this.Config = new CloudNativeAPIGatewayStrategyAutoScalerConfig(source.Config);
        }
        if (source.CronScalerConfig != null) {
            this.CronScalerConfig = new CloudNativeAPIGatewayStrategyCronScalerConfig(source.CronScalerConfig);
        }
        if (source.MaxReplicas != null) {
            this.MaxReplicas = new Long(source.MaxReplicas);
        }
        if (source.CronConfig != null) {
            this.CronConfig = new CloudNativeAPIGatewayStrategyCronScalerConfig(source.CronConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "StrategyName", this.StrategyName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamObj(map, prefix + "Config.", this.Config);
        this.setParamObj(map, prefix + "CronScalerConfig.", this.CronScalerConfig);
        this.setParamSimple(map, prefix + "MaxReplicas", this.MaxReplicas);
        this.setParamObj(map, prefix + "CronConfig.", this.CronConfig);

    }
}

