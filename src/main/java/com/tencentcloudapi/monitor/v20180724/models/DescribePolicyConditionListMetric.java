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

public class DescribePolicyConditionListMetric extends AbstractModel{

    /**
    * 指标配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigManual")
    @Expose
    private DescribePolicyConditionListConfigManual ConfigManual;

    /**
    * 指标id
    */
    @SerializedName("MetricId")
    @Expose
    private Long MetricId;

    /**
    * 指标名称
    */
    @SerializedName("MetricShowName")
    @Expose
    private String MetricShowName;

    /**
    * 指标单位
    */
    @SerializedName("MetricUnit")
    @Expose
    private String MetricUnit;

    /**
     * Get 指标配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigManual 指标配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribePolicyConditionListConfigManual getConfigManual() {
        return this.ConfigManual;
    }

    /**
     * Set 指标配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigManual 指标配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigManual(DescribePolicyConditionListConfigManual ConfigManual) {
        this.ConfigManual = ConfigManual;
    }

    /**
     * Get 指标id 
     * @return MetricId 指标id
     */
    public Long getMetricId() {
        return this.MetricId;
    }

    /**
     * Set 指标id
     * @param MetricId 指标id
     */
    public void setMetricId(Long MetricId) {
        this.MetricId = MetricId;
    }

    /**
     * Get 指标名称 
     * @return MetricShowName 指标名称
     */
    public String getMetricShowName() {
        return this.MetricShowName;
    }

    /**
     * Set 指标名称
     * @param MetricShowName 指标名称
     */
    public void setMetricShowName(String MetricShowName) {
        this.MetricShowName = MetricShowName;
    }

    /**
     * Get 指标单位 
     * @return MetricUnit 指标单位
     */
    public String getMetricUnit() {
        return this.MetricUnit;
    }

    /**
     * Set 指标单位
     * @param MetricUnit 指标单位
     */
    public void setMetricUnit(String MetricUnit) {
        this.MetricUnit = MetricUnit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ConfigManual.", this.ConfigManual);
        this.setParamSimple(map, prefix + "MetricId", this.MetricId);
        this.setParamSimple(map, prefix + "MetricShowName", this.MetricShowName);
        this.setParamSimple(map, prefix + "MetricUnit", this.MetricUnit);

    }
}

