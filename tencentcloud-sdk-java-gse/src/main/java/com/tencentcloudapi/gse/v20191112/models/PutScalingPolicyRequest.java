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

public class PutScalingPolicyRequest extends AbstractModel{

    /**
    * 基于规则的扩缩容配置
    */
    @SerializedName("FleetId")
    @Expose
    private String FleetId;

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 调整值
    */
    @SerializedName("ScalingAdjustment")
    @Expose
    private Long ScalingAdjustment;

    /**
    * 调整类型
    */
    @SerializedName("ScalingAdjustmentType")
    @Expose
    private String ScalingAdjustmentType;

    /**
    * 指标阈值
    */
    @SerializedName("Threshold")
    @Expose
    private Float Threshold;

    /**
    * 比较符
    */
    @SerializedName("ComparisonOperator")
    @Expose
    private String ComparisonOperator;

    /**
    * 时间长度（分钟）
    */
    @SerializedName("EvaluationPeriods")
    @Expose
    private Long EvaluationPeriods;

    /**
    * 指标名称
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 策略类型
    */
    @SerializedName("PolicyType")
    @Expose
    private String PolicyType;

    /**
    * 扩缩容配置类型
    */
    @SerializedName("TargetConfiguration")
    @Expose
    private TargetConfiguration TargetConfiguration;

    /**
     * Get 基于规则的扩缩容配置 
     * @return FleetId 基于规则的扩缩容配置
     */
    public String getFleetId() {
        return this.FleetId;
    }

    /**
     * Set 基于规则的扩缩容配置
     * @param FleetId 基于规则的扩缩容配置
     */
    public void setFleetId(String FleetId) {
        this.FleetId = FleetId;
    }

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 调整值 
     * @return ScalingAdjustment 调整值
     */
    public Long getScalingAdjustment() {
        return this.ScalingAdjustment;
    }

    /**
     * Set 调整值
     * @param ScalingAdjustment 调整值
     */
    public void setScalingAdjustment(Long ScalingAdjustment) {
        this.ScalingAdjustment = ScalingAdjustment;
    }

    /**
     * Get 调整类型 
     * @return ScalingAdjustmentType 调整类型
     */
    public String getScalingAdjustmentType() {
        return this.ScalingAdjustmentType;
    }

    /**
     * Set 调整类型
     * @param ScalingAdjustmentType 调整类型
     */
    public void setScalingAdjustmentType(String ScalingAdjustmentType) {
        this.ScalingAdjustmentType = ScalingAdjustmentType;
    }

    /**
     * Get 指标阈值 
     * @return Threshold 指标阈值
     */
    public Float getThreshold() {
        return this.Threshold;
    }

    /**
     * Set 指标阈值
     * @param Threshold 指标阈值
     */
    public void setThreshold(Float Threshold) {
        this.Threshold = Threshold;
    }

    /**
     * Get 比较符 
     * @return ComparisonOperator 比较符
     */
    public String getComparisonOperator() {
        return this.ComparisonOperator;
    }

    /**
     * Set 比较符
     * @param ComparisonOperator 比较符
     */
    public void setComparisonOperator(String ComparisonOperator) {
        this.ComparisonOperator = ComparisonOperator;
    }

    /**
     * Get 时间长度（分钟） 
     * @return EvaluationPeriods 时间长度（分钟）
     */
    public Long getEvaluationPeriods() {
        return this.EvaluationPeriods;
    }

    /**
     * Set 时间长度（分钟）
     * @param EvaluationPeriods 时间长度（分钟）
     */
    public void setEvaluationPeriods(Long EvaluationPeriods) {
        this.EvaluationPeriods = EvaluationPeriods;
    }

    /**
     * Get 指标名称 
     * @return MetricName 指标名称
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 指标名称
     * @param MetricName 指标名称
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get 策略类型 
     * @return PolicyType 策略类型
     */
    public String getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set 策略类型
     * @param PolicyType 策略类型
     */
    public void setPolicyType(String PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get 扩缩容配置类型 
     * @return TargetConfiguration 扩缩容配置类型
     */
    public TargetConfiguration getTargetConfiguration() {
        return this.TargetConfiguration;
    }

    /**
     * Set 扩缩容配置类型
     * @param TargetConfiguration 扩缩容配置类型
     */
    public void setTargetConfiguration(TargetConfiguration TargetConfiguration) {
        this.TargetConfiguration = TargetConfiguration;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FleetId", this.FleetId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ScalingAdjustment", this.ScalingAdjustment);
        this.setParamSimple(map, prefix + "ScalingAdjustmentType", this.ScalingAdjustmentType);
        this.setParamSimple(map, prefix + "Threshold", this.Threshold);
        this.setParamSimple(map, prefix + "ComparisonOperator", this.ComparisonOperator);
        this.setParamSimple(map, prefix + "EvaluationPeriods", this.EvaluationPeriods);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamObj(map, prefix + "TargetConfiguration.", this.TargetConfiguration);

    }
}

