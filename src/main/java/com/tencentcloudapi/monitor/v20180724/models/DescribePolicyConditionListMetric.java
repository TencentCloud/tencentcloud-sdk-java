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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePolicyConditionListMetric extends AbstractModel {

    /**
    * <p>指标配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigManual")
    @Expose
    private DescribePolicyConditionListConfigManual ConfigManual;

    /**
    * <p>指标id</p>
    */
    @SerializedName("MetricId")
    @Expose
    private Long MetricId;

    /**
    * <p>指标名称</p>
    */
    @SerializedName("MetricShowName")
    @Expose
    private String MetricShowName;

    /**
    * <p>指标单位</p>
    */
    @SerializedName("MetricUnit")
    @Expose
    private String MetricUnit;

    /**
     * Get <p>指标配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigManual <p>指标配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribePolicyConditionListConfigManual getConfigManual() {
        return this.ConfigManual;
    }

    /**
     * Set <p>指标配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigManual <p>指标配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigManual(DescribePolicyConditionListConfigManual ConfigManual) {
        this.ConfigManual = ConfigManual;
    }

    /**
     * Get <p>指标id</p> 
     * @return MetricId <p>指标id</p>
     */
    public Long getMetricId() {
        return this.MetricId;
    }

    /**
     * Set <p>指标id</p>
     * @param MetricId <p>指标id</p>
     */
    public void setMetricId(Long MetricId) {
        this.MetricId = MetricId;
    }

    /**
     * Get <p>指标名称</p> 
     * @return MetricShowName <p>指标名称</p>
     */
    public String getMetricShowName() {
        return this.MetricShowName;
    }

    /**
     * Set <p>指标名称</p>
     * @param MetricShowName <p>指标名称</p>
     */
    public void setMetricShowName(String MetricShowName) {
        this.MetricShowName = MetricShowName;
    }

    /**
     * Get <p>指标单位</p> 
     * @return MetricUnit <p>指标单位</p>
     */
    public String getMetricUnit() {
        return this.MetricUnit;
    }

    /**
     * Set <p>指标单位</p>
     * @param MetricUnit <p>指标单位</p>
     */
    public void setMetricUnit(String MetricUnit) {
        this.MetricUnit = MetricUnit;
    }

    public DescribePolicyConditionListMetric() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePolicyConditionListMetric(DescribePolicyConditionListMetric source) {
        if (source.ConfigManual != null) {
            this.ConfigManual = new DescribePolicyConditionListConfigManual(source.ConfigManual);
        }
        if (source.MetricId != null) {
            this.MetricId = new Long(source.MetricId);
        }
        if (source.MetricShowName != null) {
            this.MetricShowName = new String(source.MetricShowName);
        }
        if (source.MetricUnit != null) {
            this.MetricUnit = new String(source.MetricUnit);
        }
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

