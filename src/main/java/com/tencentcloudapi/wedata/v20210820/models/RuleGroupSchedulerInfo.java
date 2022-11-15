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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleGroupSchedulerInfo extends AbstractModel{

    /**
    * 规则组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 1:未配置 2:关联生产调度 3:离线周期检测
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MonitorType")
    @Expose
    private Long MonitorType;

    /**
    * 开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 循环类型简写
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * 循环步长
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CycleStep")
    @Expose
    private Long CycleStep;

    /**
    * 循环类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CycleDesc")
    @Expose
    private String CycleDesc;

    /**
    * 离线周期检测下指定时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskAction")
    @Expose
    private String TaskAction;

    /**
    * 离线周期检测下延迟时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DelayTime")
    @Expose
    private Long DelayTime;

    /**
    * 离线周期检测下注册到任务调度的任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CycleTaskId")
    @Expose
    private String CycleTaskId;

    /**
    * 关联生产调度下关联的任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssociateTaskIds")
    @Expose
    private String [] AssociateTaskIds;

    /**
     * Get 规则组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 规则组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 规则组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 规则组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 1:未配置 2:关联生产调度 3:离线周期检测
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MonitorType 1:未配置 2:关联生产调度 3:离线周期检测
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMonitorType() {
        return this.MonitorType;
    }

    /**
     * Set 1:未配置 2:关联生产调度 3:离线周期检测
注意：此字段可能返回 null，表示取不到有效值。
     * @param MonitorType 1:未配置 2:关联生产调度 3:离线周期检测
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMonitorType(Long MonitorType) {
        this.MonitorType = MonitorType;
    }

    /**
     * Get 开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 循环类型简写
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CycleType 循环类型简写
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCycleType() {
        return this.CycleType;
    }

    /**
     * Set 循环类型简写
注意：此字段可能返回 null，表示取不到有效值。
     * @param CycleType 循环类型简写
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCycleType(String CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get 循环步长
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CycleStep 循环步长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCycleStep() {
        return this.CycleStep;
    }

    /**
     * Set 循环步长
注意：此字段可能返回 null，表示取不到有效值。
     * @param CycleStep 循环步长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCycleStep(Long CycleStep) {
        this.CycleStep = CycleStep;
    }

    /**
     * Get 循环类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CycleDesc 循环类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCycleDesc() {
        return this.CycleDesc;
    }

    /**
     * Set 循环类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param CycleDesc 循环类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCycleDesc(String CycleDesc) {
        this.CycleDesc = CycleDesc;
    }

    /**
     * Get 离线周期检测下指定时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskAction 离线周期检测下指定时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskAction() {
        return this.TaskAction;
    }

    /**
     * Set 离线周期检测下指定时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskAction 离线周期检测下指定时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskAction(String TaskAction) {
        this.TaskAction = TaskAction;
    }

    /**
     * Get 离线周期检测下延迟时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DelayTime 离线周期检测下延迟时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDelayTime() {
        return this.DelayTime;
    }

    /**
     * Set 离线周期检测下延迟时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param DelayTime 离线周期检测下延迟时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDelayTime(Long DelayTime) {
        this.DelayTime = DelayTime;
    }

    /**
     * Get 离线周期检测下注册到任务调度的任务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CycleTaskId 离线周期检测下注册到任务调度的任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCycleTaskId() {
        return this.CycleTaskId;
    }

    /**
     * Set 离线周期检测下注册到任务调度的任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param CycleTaskId 离线周期检测下注册到任务调度的任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCycleTaskId(String CycleTaskId) {
        this.CycleTaskId = CycleTaskId;
    }

    /**
     * Get 关联生产调度下关联的任务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssociateTaskIds 关联生产调度下关联的任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAssociateTaskIds() {
        return this.AssociateTaskIds;
    }

    /**
     * Set 关联生产调度下关联的任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssociateTaskIds 关联生产调度下关联的任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssociateTaskIds(String [] AssociateTaskIds) {
        this.AssociateTaskIds = AssociateTaskIds;
    }

    public RuleGroupSchedulerInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleGroupSchedulerInfo(RuleGroupSchedulerInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.MonitorType != null) {
            this.MonitorType = new Long(source.MonitorType);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.CycleType != null) {
            this.CycleType = new String(source.CycleType);
        }
        if (source.CycleStep != null) {
            this.CycleStep = new Long(source.CycleStep);
        }
        if (source.CycleDesc != null) {
            this.CycleDesc = new String(source.CycleDesc);
        }
        if (source.TaskAction != null) {
            this.TaskAction = new String(source.TaskAction);
        }
        if (source.DelayTime != null) {
            this.DelayTime = new Long(source.DelayTime);
        }
        if (source.CycleTaskId != null) {
            this.CycleTaskId = new String(source.CycleTaskId);
        }
        if (source.AssociateTaskIds != null) {
            this.AssociateTaskIds = new String[source.AssociateTaskIds.length];
            for (int i = 0; i < source.AssociateTaskIds.length; i++) {
                this.AssociateTaskIds[i] = new String(source.AssociateTaskIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "MonitorType", this.MonitorType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "CycleStep", this.CycleStep);
        this.setParamSimple(map, prefix + "CycleDesc", this.CycleDesc);
        this.setParamSimple(map, prefix + "TaskAction", this.TaskAction);
        this.setParamSimple(map, prefix + "DelayTime", this.DelayTime);
        this.setParamSimple(map, prefix + "CycleTaskId", this.CycleTaskId);
        this.setParamArraySimple(map, prefix + "AssociateTaskIds.", this.AssociateTaskIds);

    }
}

