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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoadMetricsCondition extends AbstractModel {

    /**
    * 规则统计周期，提供1min,3min,5min。
    */
    @SerializedName("StatisticPeriod")
    @Expose
    private Long StatisticPeriod;

    /**
    * 触发次数，当连续触发超过TriggerThreshold次后才开始扩缩容。
    */
    @SerializedName("TriggerThreshold")
    @Expose
    private Long TriggerThreshold;

    /**
    * 扩缩容负载指标。
    */
    @SerializedName("LoadMetrics")
    @Expose
    private String LoadMetrics;

    /**
    * 规则元数据记录ID。
    */
    @SerializedName("MetricId")
    @Expose
    private Long MetricId;

    /**
    * 触发条件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Conditions")
    @Expose
    private TriggerCondition [] Conditions;

    /**
     * Get 规则统计周期，提供1min,3min,5min。 
     * @return StatisticPeriod 规则统计周期，提供1min,3min,5min。
     */
    public Long getStatisticPeriod() {
        return this.StatisticPeriod;
    }

    /**
     * Set 规则统计周期，提供1min,3min,5min。
     * @param StatisticPeriod 规则统计周期，提供1min,3min,5min。
     */
    public void setStatisticPeriod(Long StatisticPeriod) {
        this.StatisticPeriod = StatisticPeriod;
    }

    /**
     * Get 触发次数，当连续触发超过TriggerThreshold次后才开始扩缩容。 
     * @return TriggerThreshold 触发次数，当连续触发超过TriggerThreshold次后才开始扩缩容。
     */
    public Long getTriggerThreshold() {
        return this.TriggerThreshold;
    }

    /**
     * Set 触发次数，当连续触发超过TriggerThreshold次后才开始扩缩容。
     * @param TriggerThreshold 触发次数，当连续触发超过TriggerThreshold次后才开始扩缩容。
     */
    public void setTriggerThreshold(Long TriggerThreshold) {
        this.TriggerThreshold = TriggerThreshold;
    }

    /**
     * Get 扩缩容负载指标。 
     * @return LoadMetrics 扩缩容负载指标。
     */
    public String getLoadMetrics() {
        return this.LoadMetrics;
    }

    /**
     * Set 扩缩容负载指标。
     * @param LoadMetrics 扩缩容负载指标。
     */
    public void setLoadMetrics(String LoadMetrics) {
        this.LoadMetrics = LoadMetrics;
    }

    /**
     * Get 规则元数据记录ID。 
     * @return MetricId 规则元数据记录ID。
     */
    public Long getMetricId() {
        return this.MetricId;
    }

    /**
     * Set 规则元数据记录ID。
     * @param MetricId 规则元数据记录ID。
     */
    public void setMetricId(Long MetricId) {
        this.MetricId = MetricId;
    }

    /**
     * Get 触发条件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Conditions 触发条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TriggerCondition [] getConditions() {
        return this.Conditions;
    }

    /**
     * Set 触发条件
注意：此字段可能返回 null，表示取不到有效值。
     * @param Conditions 触发条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConditions(TriggerCondition [] Conditions) {
        this.Conditions = Conditions;
    }

    public LoadMetricsCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoadMetricsCondition(LoadMetricsCondition source) {
        if (source.StatisticPeriod != null) {
            this.StatisticPeriod = new Long(source.StatisticPeriod);
        }
        if (source.TriggerThreshold != null) {
            this.TriggerThreshold = new Long(source.TriggerThreshold);
        }
        if (source.LoadMetrics != null) {
            this.LoadMetrics = new String(source.LoadMetrics);
        }
        if (source.MetricId != null) {
            this.MetricId = new Long(source.MetricId);
        }
        if (source.Conditions != null) {
            this.Conditions = new TriggerCondition[source.Conditions.length];
            for (int i = 0; i < source.Conditions.length; i++) {
                this.Conditions[i] = new TriggerCondition(source.Conditions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StatisticPeriod", this.StatisticPeriod);
        this.setParamSimple(map, prefix + "TriggerThreshold", this.TriggerThreshold);
        this.setParamSimple(map, prefix + "LoadMetrics", this.LoadMetrics);
        this.setParamSimple(map, prefix + "MetricId", this.MetricId);
        this.setParamArrayObj(map, prefix + "Conditions.", this.Conditions);

    }
}

