/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudNativeAPIGatewayStrategyAutoScalerConfig extends AbstractModel{

    /**
    * 最大副本数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxReplicas")
    @Expose
    private Long MaxReplicas;

    /**
    * 指标列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Metrics")
    @Expose
    private CloudNativeAPIGatewayStrategyAutoScalerConfigMetric [] Metrics;

    /**
    * 是否开启指标伸缩
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 修改时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 弹性策略ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StrategyId")
    @Expose
    private String StrategyId;

    /**
    * 指标配置ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoScalerId")
    @Expose
    private String AutoScalerId;

    /**
    * 指标伸缩行为配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Behavior")
    @Expose
    private AutoScalerBehavior Behavior;

    /**
     * Get 最大副本数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxReplicas 最大副本数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxReplicas() {
        return this.MaxReplicas;
    }

    /**
     * Set 最大副本数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxReplicas 最大副本数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxReplicas(Long MaxReplicas) {
        this.MaxReplicas = MaxReplicas;
    }

    /**
     * Get 指标列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Metrics 指标列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CloudNativeAPIGatewayStrategyAutoScalerConfigMetric [] getMetrics() {
        return this.Metrics;
    }

    /**
     * Set 指标列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Metrics 指标列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetrics(CloudNativeAPIGatewayStrategyAutoScalerConfigMetric [] Metrics) {
        this.Metrics = Metrics;
    }

    /**
     * Get 是否开启指标伸缩
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Enabled 是否开启指标伸缩
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 是否开启指标伸缩
注意：此字段可能返回 null，表示取不到有效值。
     * @param Enabled 是否开启指标伸缩
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 修改时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 弹性策略ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StrategyId 弹性策略ID
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public String getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set 弹性策略ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param StrategyId 弹性策略ID
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setStrategyId(String StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get 指标配置ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoScalerId 指标配置ID
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public String getAutoScalerId() {
        return this.AutoScalerId;
    }

    /**
     * Set 指标配置ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoScalerId 指标配置ID
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setAutoScalerId(String AutoScalerId) {
        this.AutoScalerId = AutoScalerId;
    }

    /**
     * Get 指标伸缩行为配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Behavior 指标伸缩行为配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AutoScalerBehavior getBehavior() {
        return this.Behavior;
    }

    /**
     * Set 指标伸缩行为配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Behavior 指标伸缩行为配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBehavior(AutoScalerBehavior Behavior) {
        this.Behavior = Behavior;
    }

    public CloudNativeAPIGatewayStrategyAutoScalerConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudNativeAPIGatewayStrategyAutoScalerConfig(CloudNativeAPIGatewayStrategyAutoScalerConfig source) {
        if (source.MaxReplicas != null) {
            this.MaxReplicas = new Long(source.MaxReplicas);
        }
        if (source.Metrics != null) {
            this.Metrics = new CloudNativeAPIGatewayStrategyAutoScalerConfigMetric[source.Metrics.length];
            for (int i = 0; i < source.Metrics.length; i++) {
                this.Metrics[i] = new CloudNativeAPIGatewayStrategyAutoScalerConfigMetric(source.Metrics[i]);
            }
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.StrategyId != null) {
            this.StrategyId = new String(source.StrategyId);
        }
        if (source.AutoScalerId != null) {
            this.AutoScalerId = new String(source.AutoScalerId);
        }
        if (source.Behavior != null) {
            this.Behavior = new AutoScalerBehavior(source.Behavior);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxReplicas", this.MaxReplicas);
        this.setParamArrayObj(map, prefix + "Metrics.", this.Metrics);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamSimple(map, prefix + "AutoScalerId", this.AutoScalerId);
        this.setParamObj(map, prefix + "Behavior.", this.Behavior);

    }
}

