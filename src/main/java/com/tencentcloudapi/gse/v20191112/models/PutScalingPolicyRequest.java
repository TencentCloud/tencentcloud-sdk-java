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
    * 扩缩容配置服务器舰队ID
    */
    @SerializedName("FleetId")
    @Expose
    private String FleetId;

    /**
    * 扩缩容策略名称，最小长度为1，最大长度为1024
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 扩缩容调整值，ScalingAdjustmentType取值PercentChangeInCapacity时，取值范围-99~99
ScalingAdjustmentType取值ChangeInCapacity或ExactCapacity时，最小值要缩容的最多CVM个数，最大值为实际最大的CVM个数限额
    */
    @SerializedName("ScalingAdjustment")
    @Expose
    private Long ScalingAdjustment;

    /**
    * 扩缩容调整类型，取值（ChangeInCapacity，ExactCapacity，PercentChangeInCapacity）
    */
    @SerializedName("ScalingAdjustmentType")
    @Expose
    private String ScalingAdjustmentType;

    /**
    * 扩缩容指标阈值
    */
    @SerializedName("Threshold")
    @Expose
    private Float Threshold;

    /**
    * 扩缩容策略比较符，取值：>,>=,<,<=
    */
    @SerializedName("ComparisonOperator")
    @Expose
    private String ComparisonOperator;

    /**
    * 单个策略持续时间长度（分钟）
    */
    @SerializedName("EvaluationPeriods")
    @Expose
    private Long EvaluationPeriods;

    /**
    * 扩缩容参与计算的指标名称，PolicyType取值RuleBased，
MetricName取值（AvailableGameServerSessions，AvailableCustomCount，PercentAvailableCustomCount，ActiveInstances，IdleInstances，CurrentPlayerSessions和PercentIdleInstances）；
PolicyType取值TargetBased时，MetricName取值PercentAvailableGameSessions
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 策略类型，取值：TargetBased表示基于目标的策略；RuleBased表示基于规则的策略
    */
    @SerializedName("PolicyType")
    @Expose
    private String PolicyType;

    /**
    * 扩缩容目标值配置，只有TargetBased类型的策略生效
    */
    @SerializedName("TargetConfiguration")
    @Expose
    private TargetConfiguration TargetConfiguration;

    /**
     * Get 扩缩容配置服务器舰队ID 
     * @return FleetId 扩缩容配置服务器舰队ID
     */
    public String getFleetId() {
        return this.FleetId;
    }

    /**
     * Set 扩缩容配置服务器舰队ID
     * @param FleetId 扩缩容配置服务器舰队ID
     */
    public void setFleetId(String FleetId) {
        this.FleetId = FleetId;
    }

    /**
     * Get 扩缩容策略名称，最小长度为1，最大长度为1024 
     * @return Name 扩缩容策略名称，最小长度为1，最大长度为1024
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 扩缩容策略名称，最小长度为1，最大长度为1024
     * @param Name 扩缩容策略名称，最小长度为1，最大长度为1024
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 扩缩容调整值，ScalingAdjustmentType取值PercentChangeInCapacity时，取值范围-99~99
ScalingAdjustmentType取值ChangeInCapacity或ExactCapacity时，最小值要缩容的最多CVM个数，最大值为实际最大的CVM个数限额 
     * @return ScalingAdjustment 扩缩容调整值，ScalingAdjustmentType取值PercentChangeInCapacity时，取值范围-99~99
ScalingAdjustmentType取值ChangeInCapacity或ExactCapacity时，最小值要缩容的最多CVM个数，最大值为实际最大的CVM个数限额
     */
    public Long getScalingAdjustment() {
        return this.ScalingAdjustment;
    }

    /**
     * Set 扩缩容调整值，ScalingAdjustmentType取值PercentChangeInCapacity时，取值范围-99~99
ScalingAdjustmentType取值ChangeInCapacity或ExactCapacity时，最小值要缩容的最多CVM个数，最大值为实际最大的CVM个数限额
     * @param ScalingAdjustment 扩缩容调整值，ScalingAdjustmentType取值PercentChangeInCapacity时，取值范围-99~99
ScalingAdjustmentType取值ChangeInCapacity或ExactCapacity时，最小值要缩容的最多CVM个数，最大值为实际最大的CVM个数限额
     */
    public void setScalingAdjustment(Long ScalingAdjustment) {
        this.ScalingAdjustment = ScalingAdjustment;
    }

    /**
     * Get 扩缩容调整类型，取值（ChangeInCapacity，ExactCapacity，PercentChangeInCapacity） 
     * @return ScalingAdjustmentType 扩缩容调整类型，取值（ChangeInCapacity，ExactCapacity，PercentChangeInCapacity）
     */
    public String getScalingAdjustmentType() {
        return this.ScalingAdjustmentType;
    }

    /**
     * Set 扩缩容调整类型，取值（ChangeInCapacity，ExactCapacity，PercentChangeInCapacity）
     * @param ScalingAdjustmentType 扩缩容调整类型，取值（ChangeInCapacity，ExactCapacity，PercentChangeInCapacity）
     */
    public void setScalingAdjustmentType(String ScalingAdjustmentType) {
        this.ScalingAdjustmentType = ScalingAdjustmentType;
    }

    /**
     * Get 扩缩容指标阈值 
     * @return Threshold 扩缩容指标阈值
     */
    public Float getThreshold() {
        return this.Threshold;
    }

    /**
     * Set 扩缩容指标阈值
     * @param Threshold 扩缩容指标阈值
     */
    public void setThreshold(Float Threshold) {
        this.Threshold = Threshold;
    }

    /**
     * Get 扩缩容策略比较符，取值：>,>=,<,<= 
     * @return ComparisonOperator 扩缩容策略比较符，取值：>,>=,<,<=
     */
    public String getComparisonOperator() {
        return this.ComparisonOperator;
    }

    /**
     * Set 扩缩容策略比较符，取值：>,>=,<,<=
     * @param ComparisonOperator 扩缩容策略比较符，取值：>,>=,<,<=
     */
    public void setComparisonOperator(String ComparisonOperator) {
        this.ComparisonOperator = ComparisonOperator;
    }

    /**
     * Get 单个策略持续时间长度（分钟） 
     * @return EvaluationPeriods 单个策略持续时间长度（分钟）
     */
    public Long getEvaluationPeriods() {
        return this.EvaluationPeriods;
    }

    /**
     * Set 单个策略持续时间长度（分钟）
     * @param EvaluationPeriods 单个策略持续时间长度（分钟）
     */
    public void setEvaluationPeriods(Long EvaluationPeriods) {
        this.EvaluationPeriods = EvaluationPeriods;
    }

    /**
     * Get 扩缩容参与计算的指标名称，PolicyType取值RuleBased，
MetricName取值（AvailableGameServerSessions，AvailableCustomCount，PercentAvailableCustomCount，ActiveInstances，IdleInstances，CurrentPlayerSessions和PercentIdleInstances）；
PolicyType取值TargetBased时，MetricName取值PercentAvailableGameSessions 
     * @return MetricName 扩缩容参与计算的指标名称，PolicyType取值RuleBased，
MetricName取值（AvailableGameServerSessions，AvailableCustomCount，PercentAvailableCustomCount，ActiveInstances，IdleInstances，CurrentPlayerSessions和PercentIdleInstances）；
PolicyType取值TargetBased时，MetricName取值PercentAvailableGameSessions
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 扩缩容参与计算的指标名称，PolicyType取值RuleBased，
MetricName取值（AvailableGameServerSessions，AvailableCustomCount，PercentAvailableCustomCount，ActiveInstances，IdleInstances，CurrentPlayerSessions和PercentIdleInstances）；
PolicyType取值TargetBased时，MetricName取值PercentAvailableGameSessions
     * @param MetricName 扩缩容参与计算的指标名称，PolicyType取值RuleBased，
MetricName取值（AvailableGameServerSessions，AvailableCustomCount，PercentAvailableCustomCount，ActiveInstances，IdleInstances，CurrentPlayerSessions和PercentIdleInstances）；
PolicyType取值TargetBased时，MetricName取值PercentAvailableGameSessions
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get 策略类型，取值：TargetBased表示基于目标的策略；RuleBased表示基于规则的策略 
     * @return PolicyType 策略类型，取值：TargetBased表示基于目标的策略；RuleBased表示基于规则的策略
     */
    public String getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set 策略类型，取值：TargetBased表示基于目标的策略；RuleBased表示基于规则的策略
     * @param PolicyType 策略类型，取值：TargetBased表示基于目标的策略；RuleBased表示基于规则的策略
     */
    public void setPolicyType(String PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get 扩缩容目标值配置，只有TargetBased类型的策略生效 
     * @return TargetConfiguration 扩缩容目标值配置，只有TargetBased类型的策略生效
     */
    public TargetConfiguration getTargetConfiguration() {
        return this.TargetConfiguration;
    }

    /**
     * Set 扩缩容目标值配置，只有TargetBased类型的策略生效
     * @param TargetConfiguration 扩缩容目标值配置，只有TargetBased类型的策略生效
     */
    public void setTargetConfiguration(TargetConfiguration TargetConfiguration) {
        this.TargetConfiguration = TargetConfiguration;
    }

    public PutScalingPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PutScalingPolicyRequest(PutScalingPolicyRequest source) {
        if (source.FleetId != null) {
            this.FleetId = new String(source.FleetId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ScalingAdjustment != null) {
            this.ScalingAdjustment = new Long(source.ScalingAdjustment);
        }
        if (source.ScalingAdjustmentType != null) {
            this.ScalingAdjustmentType = new String(source.ScalingAdjustmentType);
        }
        if (source.Threshold != null) {
            this.Threshold = new Float(source.Threshold);
        }
        if (source.ComparisonOperator != null) {
            this.ComparisonOperator = new String(source.ComparisonOperator);
        }
        if (source.EvaluationPeriods != null) {
            this.EvaluationPeriods = new Long(source.EvaluationPeriods);
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

