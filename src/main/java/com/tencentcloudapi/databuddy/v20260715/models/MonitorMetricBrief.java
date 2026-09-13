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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MonitorMetricBrief extends AbstractModel {

    /**
    * 监控指标 ID，创建时无需传入，由服务端生成
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MonitorMetricId")
    @Expose
    private String MonitorMetricId;

    /**
    * 告警的监控对象类型，如工作流、任务等，当前支持 1. WORKFLOW 2. TASK
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmMonitorType")
    @Expose
    private String AlarmMonitorType;

    /**
    * 监控指标列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Metrics")
    @Expose
    private MonitorMetricItem [] Metrics;

    /**
     * Get 监控指标 ID，创建时无需传入，由服务端生成
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MonitorMetricId 监控指标 ID，创建时无需传入，由服务端生成
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMonitorMetricId() {
        return this.MonitorMetricId;
    }

    /**
     * Set 监控指标 ID，创建时无需传入，由服务端生成
注意：此字段可能返回 null，表示取不到有效值。
     * @param MonitorMetricId 监控指标 ID，创建时无需传入，由服务端生成
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMonitorMetricId(String MonitorMetricId) {
        this.MonitorMetricId = MonitorMetricId;
    }

    /**
     * Get 告警的监控对象类型，如工作流、任务等，当前支持 1. WORKFLOW 2. TASK
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmMonitorType 告警的监控对象类型，如工作流、任务等，当前支持 1. WORKFLOW 2. TASK
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlarmMonitorType() {
        return this.AlarmMonitorType;
    }

    /**
     * Set 告警的监控对象类型，如工作流、任务等，当前支持 1. WORKFLOW 2. TASK
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmMonitorType 告警的监控对象类型，如工作流、任务等，当前支持 1. WORKFLOW 2. TASK
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmMonitorType(String AlarmMonitorType) {
        this.AlarmMonitorType = AlarmMonitorType;
    }

    /**
     * Get 监控指标列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Metrics 监控指标列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MonitorMetricItem [] getMetrics() {
        return this.Metrics;
    }

    /**
     * Set 监控指标列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Metrics 监控指标列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetrics(MonitorMetricItem [] Metrics) {
        this.Metrics = Metrics;
    }

    public MonitorMetricBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MonitorMetricBrief(MonitorMetricBrief source) {
        if (source.MonitorMetricId != null) {
            this.MonitorMetricId = new String(source.MonitorMetricId);
        }
        if (source.AlarmMonitorType != null) {
            this.AlarmMonitorType = new String(source.AlarmMonitorType);
        }
        if (source.Metrics != null) {
            this.Metrics = new MonitorMetricItem[source.Metrics.length];
            for (int i = 0; i < source.Metrics.length; i++) {
                this.Metrics[i] = new MonitorMetricItem(source.Metrics[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MonitorMetricId", this.MonitorMetricId);
        this.setParamSimple(map, prefix + "AlarmMonitorType", this.AlarmMonitorType);
        this.setParamArrayObj(map, prefix + "Metrics.", this.Metrics);

    }
}

