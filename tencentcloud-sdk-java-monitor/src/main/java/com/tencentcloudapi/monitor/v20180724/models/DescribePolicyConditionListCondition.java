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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePolicyConditionListCondition extends AbstractModel{

    /**
    * 策略视图名称
    */
    @SerializedName("PolicyViewName")
    @Expose
    private String PolicyViewName;

    /**
    * 事件告警条件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventMetrics")
    @Expose
    private DescribePolicyConditionListEventMetric [] EventMetrics;

    /**
    * 是否支持多地域
    */
    @SerializedName("IsSupportMultiRegion")
    @Expose
    private Boolean IsSupportMultiRegion;

    /**
    * 指标告警条件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Metrics")
    @Expose
    private DescribePolicyConditionListMetric [] Metrics;

    /**
    * 策略类型名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 排序id
    */
    @SerializedName("SortId")
    @Expose
    private Long SortId;

    /**
    * 是否支持默认策略
    */
    @SerializedName("SupportDefault")
    @Expose
    private Boolean SupportDefault;

    /**
    * 支持该策略类型的地域列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportRegions")
    @Expose
    private String [] SupportRegions;

    /**
     * Get 策略视图名称 
     * @return PolicyViewName 策略视图名称
     */
    public String getPolicyViewName() {
        return this.PolicyViewName;
    }

    /**
     * Set 策略视图名称
     * @param PolicyViewName 策略视图名称
     */
    public void setPolicyViewName(String PolicyViewName) {
        this.PolicyViewName = PolicyViewName;
    }

    /**
     * Get 事件告警条件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventMetrics 事件告警条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribePolicyConditionListEventMetric [] getEventMetrics() {
        return this.EventMetrics;
    }

    /**
     * Set 事件告警条件
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventMetrics 事件告警条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventMetrics(DescribePolicyConditionListEventMetric [] EventMetrics) {
        this.EventMetrics = EventMetrics;
    }

    /**
     * Get 是否支持多地域 
     * @return IsSupportMultiRegion 是否支持多地域
     */
    public Boolean getIsSupportMultiRegion() {
        return this.IsSupportMultiRegion;
    }

    /**
     * Set 是否支持多地域
     * @param IsSupportMultiRegion 是否支持多地域
     */
    public void setIsSupportMultiRegion(Boolean IsSupportMultiRegion) {
        this.IsSupportMultiRegion = IsSupportMultiRegion;
    }

    /**
     * Get 指标告警条件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Metrics 指标告警条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribePolicyConditionListMetric [] getMetrics() {
        return this.Metrics;
    }

    /**
     * Set 指标告警条件
注意：此字段可能返回 null，表示取不到有效值。
     * @param Metrics 指标告警条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetrics(DescribePolicyConditionListMetric [] Metrics) {
        this.Metrics = Metrics;
    }

    /**
     * Get 策略类型名称 
     * @return Name 策略类型名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 策略类型名称
     * @param Name 策略类型名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 排序id 
     * @return SortId 排序id
     */
    public Long getSortId() {
        return this.SortId;
    }

    /**
     * Set 排序id
     * @param SortId 排序id
     */
    public void setSortId(Long SortId) {
        this.SortId = SortId;
    }

    /**
     * Get 是否支持默认策略 
     * @return SupportDefault 是否支持默认策略
     */
    public Boolean getSupportDefault() {
        return this.SupportDefault;
    }

    /**
     * Set 是否支持默认策略
     * @param SupportDefault 是否支持默认策略
     */
    public void setSupportDefault(Boolean SupportDefault) {
        this.SupportDefault = SupportDefault;
    }

    /**
     * Get 支持该策略类型的地域列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportRegions 支持该策略类型的地域列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSupportRegions() {
        return this.SupportRegions;
    }

    /**
     * Set 支持该策略类型的地域列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportRegions 支持该策略类型的地域列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportRegions(String [] SupportRegions) {
        this.SupportRegions = SupportRegions;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyViewName", this.PolicyViewName);
        this.setParamArrayObj(map, prefix + "EventMetrics.", this.EventMetrics);
        this.setParamSimple(map, prefix + "IsSupportMultiRegion", this.IsSupportMultiRegion);
        this.setParamArrayObj(map, prefix + "Metrics.", this.Metrics);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SortId", this.SortId);
        this.setParamSimple(map, prefix + "SupportDefault", this.SupportDefault);
        this.setParamArraySimple(map, prefix + "SupportRegions.", this.SupportRegions);

    }
}

