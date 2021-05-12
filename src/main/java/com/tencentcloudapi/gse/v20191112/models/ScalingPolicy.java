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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScalingPolicy extends AbstractModel{

    /**
    * 服务部署ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FleetId")
    @Expose
    private String FleetId;

    /**
    * 名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 保留参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScalingAdjustment")
    @Expose
    private String ScalingAdjustment;

    /**
    * 保留参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScalingAdjustmentType")
    @Expose
    private String ScalingAdjustmentType;

    /**
    * 保留参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComparisonOperator")
    @Expose
    private String ComparisonOperator;

    /**
    * 保留参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Threshold")
    @Expose
    private String Threshold;

    /**
    * 保留参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EvaluationPeriods")
    @Expose
    private String EvaluationPeriods;

    /**
    * 保留参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 策略类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PolicyType")
    @Expose
    private String PolicyType;

    /**
    * 基于规则的配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetConfiguration")
    @Expose
    private TargetConfiguration TargetConfiguration;

    /**
     * Get 服务部署ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FleetId 服务部署ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFleetId() {
        return this.FleetId;
    }

    /**
     * Set 服务部署ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param FleetId 服务部署ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFleetId(String FleetId) {
        this.FleetId = FleetId;
    }

    /**
     * Get 名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 保留参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScalingAdjustment 保留参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScalingAdjustment() {
        return this.ScalingAdjustment;
    }

    /**
     * Set 保留参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScalingAdjustment 保留参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScalingAdjustment(String ScalingAdjustment) {
        this.ScalingAdjustment = ScalingAdjustment;
    }

    /**
     * Get 保留参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScalingAdjustmentType 保留参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScalingAdjustmentType() {
        return this.ScalingAdjustmentType;
    }

    /**
     * Set 保留参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScalingAdjustmentType 保留参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScalingAdjustmentType(String ScalingAdjustmentType) {
        this.ScalingAdjustmentType = ScalingAdjustmentType;
    }

    /**
     * Get 保留参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComparisonOperator 保留参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComparisonOperator() {
        return this.ComparisonOperator;
    }

    /**
     * Set 保留参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComparisonOperator 保留参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComparisonOperator(String ComparisonOperator) {
        this.ComparisonOperator = ComparisonOperator;
    }

    /**
     * Get 保留参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Threshold 保留参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getThreshold() {
        return this.Threshold;
    }

    /**
     * Set 保留参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Threshold 保留参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setThreshold(String Threshold) {
        this.Threshold = Threshold;
    }

    /**
     * Get 保留参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EvaluationPeriods 保留参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEvaluationPeriods() {
        return this.EvaluationPeriods;
    }

    /**
     * Set 保留参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param EvaluationPeriods 保留参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEvaluationPeriods(String EvaluationPeriods) {
        this.EvaluationPeriods = EvaluationPeriods;
    }

    /**
     * Get 保留参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetricName 保留参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 保留参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetricName 保留参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get 策略类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PolicyType 策略类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set 策略类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param PolicyType 策略类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicyType(String PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get 基于规则的配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetConfiguration 基于规则的配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TargetConfiguration getTargetConfiguration() {
        return this.TargetConfiguration;
    }

    /**
     * Set 基于规则的配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetConfiguration 基于规则的配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetConfiguration(TargetConfiguration TargetConfiguration) {
        this.TargetConfiguration = TargetConfiguration;
    }

    public ScalingPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScalingPolicy(ScalingPolicy source) {
        if (source.FleetId != null) {
            this.FleetId = new String(source.FleetId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ScalingAdjustment != null) {
            this.ScalingAdjustment = new String(source.ScalingAdjustment);
        }
        if (source.ScalingAdjustmentType != null) {
            this.ScalingAdjustmentType = new String(source.ScalingAdjustmentType);
        }
        if (source.ComparisonOperator != null) {
            this.ComparisonOperator = new String(source.ComparisonOperator);
        }
        if (source.Threshold != null) {
            this.Threshold = new String(source.Threshold);
        }
        if (source.EvaluationPeriods != null) {
            this.EvaluationPeriods = new String(source.EvaluationPeriods);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.PolicyType != null) {
            this.PolicyType = new String(source.PolicyType);
        }
        if (source.TargetConfiguration != null) {
            this.TargetConfiguration = new TargetConfiguration(source.TargetConfiguration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FleetId", this.FleetId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ScalingAdjustment", this.ScalingAdjustment);
        this.setParamSimple(map, prefix + "ScalingAdjustmentType", this.ScalingAdjustmentType);
        this.setParamSimple(map, prefix + "ComparisonOperator", this.ComparisonOperator);
        this.setParamSimple(map, prefix + "Threshold", this.Threshold);
        this.setParamSimple(map, prefix + "EvaluationPeriods", this.EvaluationPeriods);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamObj(map, prefix + "TargetConfiguration.", this.TargetConfiguration);

    }
}

