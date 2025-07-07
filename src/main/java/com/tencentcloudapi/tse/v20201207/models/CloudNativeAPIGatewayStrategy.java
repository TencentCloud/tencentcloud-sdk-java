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

public class CloudNativeAPIGatewayStrategy extends AbstractModel {

    /**
    * 策略ID
    */
    @SerializedName("StrategyId")
    @Expose
    private String StrategyId;

    /**
    * 策略名称
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 策略描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 弹性伸缩配置
    */
    @SerializedName("Config")
    @Expose
    private CloudNativeAPIGatewayStrategyAutoScalerConfig Config;

    /**
    * 网关实例ID
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 定时伸缩配置
    */
    @SerializedName("CronConfig")
    @Expose
    private CloudNativeAPIGatewayStrategyCronScalerConfig CronConfig;

    /**
    * 最大节点数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxReplicas")
    @Expose
    private Long MaxReplicas;

    /**
     * Get 策略ID 
     * @return StrategyId 策略ID
     */
    public String getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set 策略ID
     * @param StrategyId 策略ID
     */
    public void setStrategyId(String StrategyId) {
        this.StrategyId = StrategyId;
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
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间 
     * @return ModifyTime 更新时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 更新时间
     * @param ModifyTime 更新时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
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
     * Get 弹性伸缩配置 
     * @return Config 弹性伸缩配置
     */
    public CloudNativeAPIGatewayStrategyAutoScalerConfig getConfig() {
        return this.Config;
    }

    /**
     * Set 弹性伸缩配置
     * @param Config 弹性伸缩配置
     */
    public void setConfig(CloudNativeAPIGatewayStrategyAutoScalerConfig Config) {
        this.Config = Config;
    }

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

    /**
     * Get 最大节点数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxReplicas 最大节点数
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public Long getMaxReplicas() {
        return this.MaxReplicas;
    }

    /**
     * Set 最大节点数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxReplicas 最大节点数
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setMaxReplicas(Long MaxReplicas) {
        this.MaxReplicas = MaxReplicas;
    }

    public CloudNativeAPIGatewayStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudNativeAPIGatewayStrategy(CloudNativeAPIGatewayStrategy source) {
        if (source.StrategyId != null) {
            this.StrategyId = new String(source.StrategyId);
        }
        if (source.StrategyName != null) {
            this.StrategyName = new String(source.StrategyName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Config != null) {
            this.Config = new CloudNativeAPIGatewayStrategyAutoScalerConfig(source.Config);
        }
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.CronConfig != null) {
            this.CronConfig = new CloudNativeAPIGatewayStrategyCronScalerConfig(source.CronConfig);
        }
        if (source.MaxReplicas != null) {
            this.MaxReplicas = new Long(source.MaxReplicas);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamSimple(map, prefix + "StrategyName", this.StrategyName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamObj(map, prefix + "Config.", this.Config);
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamObj(map, prefix + "CronConfig.", this.CronConfig);
        this.setParamSimple(map, prefix + "MaxReplicas", this.MaxReplicas);

    }
}

