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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskMonitor extends AbstractModel{

    /**
    * 监控指标ID
    */
    @SerializedName("TaskMonitorId")
    @Expose
    private Long TaskMonitorId;

    /**
    * 监控指标对象类型ID
    */
    @SerializedName("TaskMonitorObjectTypeId")
    @Expose
    private Long TaskMonitorObjectTypeId;

    /**
    * 指标名称
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 实例ID列表
    */
    @SerializedName("InstancesIds")
    @Expose
    private String [] InstancesIds;

    /**
    * 中文指标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetricChineseName")
    @Expose
    private String MetricChineseName;

    /**
    * 单位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
     * Get 监控指标ID 
     * @return TaskMonitorId 监控指标ID
     */
    public Long getTaskMonitorId() {
        return this.TaskMonitorId;
    }

    /**
     * Set 监控指标ID
     * @param TaskMonitorId 监控指标ID
     */
    public void setTaskMonitorId(Long TaskMonitorId) {
        this.TaskMonitorId = TaskMonitorId;
    }

    /**
     * Get 监控指标对象类型ID 
     * @return TaskMonitorObjectTypeId 监控指标对象类型ID
     */
    public Long getTaskMonitorObjectTypeId() {
        return this.TaskMonitorObjectTypeId;
    }

    /**
     * Set 监控指标对象类型ID
     * @param TaskMonitorObjectTypeId 监控指标对象类型ID
     */
    public void setTaskMonitorObjectTypeId(Long TaskMonitorObjectTypeId) {
        this.TaskMonitorObjectTypeId = TaskMonitorObjectTypeId;
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
     * Get 实例ID列表 
     * @return InstancesIds 实例ID列表
     */
    public String [] getInstancesIds() {
        return this.InstancesIds;
    }

    /**
     * Set 实例ID列表
     * @param InstancesIds 实例ID列表
     */
    public void setInstancesIds(String [] InstancesIds) {
        this.InstancesIds = InstancesIds;
    }

    /**
     * Get 中文指标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetricChineseName 中文指标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMetricChineseName() {
        return this.MetricChineseName;
    }

    /**
     * Set 中文指标
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetricChineseName 中文指标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetricChineseName(String MetricChineseName) {
        this.MetricChineseName = MetricChineseName;
    }

    /**
     * Get 单位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Unit 单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set 单位
注意：此字段可能返回 null，表示取不到有效值。
     * @param Unit 单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    public TaskMonitor() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskMonitor(TaskMonitor source) {
        if (source.TaskMonitorId != null) {
            this.TaskMonitorId = new Long(source.TaskMonitorId);
        }
        if (source.TaskMonitorObjectTypeId != null) {
            this.TaskMonitorObjectTypeId = new Long(source.TaskMonitorObjectTypeId);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.InstancesIds != null) {
            this.InstancesIds = new String[source.InstancesIds.length];
            for (int i = 0; i < source.InstancesIds.length; i++) {
                this.InstancesIds[i] = new String(source.InstancesIds[i]);
            }
        }
        if (source.MetricChineseName != null) {
            this.MetricChineseName = new String(source.MetricChineseName);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskMonitorId", this.TaskMonitorId);
        this.setParamSimple(map, prefix + "TaskMonitorObjectTypeId", this.TaskMonitorObjectTypeId);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamArraySimple(map, prefix + "InstancesIds.", this.InstancesIds);
        this.setParamSimple(map, prefix + "MetricChineseName", this.MetricChineseName);
        this.setParamSimple(map, prefix + "Unit", this.Unit);

    }
}

