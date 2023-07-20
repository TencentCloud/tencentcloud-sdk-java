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

public class WorkflowSchedulerOpsDto extends AbstractModel{

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 创建人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * 修改时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 延迟时间, unit=minute
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DelayTime")
    @Expose
    private Long DelayTime;

    /**
    * 启动时间,unit=minute
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartupTime")
    @Expose
    private Long StartupTime;

    /**
    * 任务自依赖类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SelfDepend")
    @Expose
    private String SelfDepend;

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
    * 指定运行时间, 指定时间：如周一：1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskAction")
    @Expose
    private String TaskAction;

    /**
    * 调度周期类型，时间单位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * 调度周期，间隔步长 unit=minute
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CycleStep")
    @Expose
    private Long CycleStep;

    /**
    * 调度cron表达式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CrontabExpression")
    @Expose
    private String CrontabExpression;

    /**
    * 执行时间左闭区间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionStartTime")
    @Expose
    private String ExecutionStartTime;

    /**
    * 执行时间右闭区间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionEndTime")
    @Expose
    private String ExecutionEndTime;

    /**
    * 任务实例初始化策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceInitStrategy")
    @Expose
    private String InstanceInitStrategy;

    /**
    * 工作流ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 工作流自依赖
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DependencyWorkflow")
    @Expose
    private String DependencyWorkflow;

    /**
    * 调度计划释义
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchedulerDesc")
    @Expose
    private String SchedulerDesc;

    /**
    * 工作流首次提交时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FirstSubmitTime")
    @Expose
    private String FirstSubmitTime;

    /**
    * 工作流最近提交时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestSubmitTime")
    @Expose
    private String LatestSubmitTime;

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 创建人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Creator 创建人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 创建人
注意：此字段可能返回 null，表示取不到有效值。
     * @param Creator 创建人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get 修改时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 延迟时间, unit=minute
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DelayTime 延迟时间, unit=minute
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDelayTime() {
        return this.DelayTime;
    }

    /**
     * Set 延迟时间, unit=minute
注意：此字段可能返回 null，表示取不到有效值。
     * @param DelayTime 延迟时间, unit=minute
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDelayTime(Long DelayTime) {
        this.DelayTime = DelayTime;
    }

    /**
     * Get 启动时间,unit=minute
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartupTime 启动时间,unit=minute
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStartupTime() {
        return this.StartupTime;
    }

    /**
     * Set 启动时间,unit=minute
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartupTime 启动时间,unit=minute
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartupTime(Long StartupTime) {
        this.StartupTime = StartupTime;
    }

    /**
     * Get 任务自依赖类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SelfDepend 任务自依赖类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSelfDepend() {
        return this.SelfDepend;
    }

    /**
     * Set 任务自依赖类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param SelfDepend 任务自依赖类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSelfDepend(String SelfDepend) {
        this.SelfDepend = SelfDepend;
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
     * Get 指定运行时间, 指定时间：如周一：1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskAction 指定运行时间, 指定时间：如周一：1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskAction() {
        return this.TaskAction;
    }

    /**
     * Set 指定运行时间, 指定时间：如周一：1
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskAction 指定运行时间, 指定时间：如周一：1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskAction(String TaskAction) {
        this.TaskAction = TaskAction;
    }

    /**
     * Get 调度周期类型，时间单位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CycleType 调度周期类型，时间单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCycleType() {
        return this.CycleType;
    }

    /**
     * Set 调度周期类型，时间单位
注意：此字段可能返回 null，表示取不到有效值。
     * @param CycleType 调度周期类型，时间单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCycleType(String CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get 调度周期，间隔步长 unit=minute
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CycleStep 调度周期，间隔步长 unit=minute
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCycleStep() {
        return this.CycleStep;
    }

    /**
     * Set 调度周期，间隔步长 unit=minute
注意：此字段可能返回 null，表示取不到有效值。
     * @param CycleStep 调度周期，间隔步长 unit=minute
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCycleStep(Long CycleStep) {
        this.CycleStep = CycleStep;
    }

    /**
     * Get 调度cron表达式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CrontabExpression 调度cron表达式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCrontabExpression() {
        return this.CrontabExpression;
    }

    /**
     * Set 调度cron表达式
注意：此字段可能返回 null，表示取不到有效值。
     * @param CrontabExpression 调度cron表达式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCrontabExpression(String CrontabExpression) {
        this.CrontabExpression = CrontabExpression;
    }

    /**
     * Get 执行时间左闭区间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionStartTime 执行时间左闭区间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionStartTime() {
        return this.ExecutionStartTime;
    }

    /**
     * Set 执行时间左闭区间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionStartTime 执行时间左闭区间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionStartTime(String ExecutionStartTime) {
        this.ExecutionStartTime = ExecutionStartTime;
    }

    /**
     * Get 执行时间右闭区间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionEndTime 执行时间右闭区间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionEndTime() {
        return this.ExecutionEndTime;
    }

    /**
     * Set 执行时间右闭区间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionEndTime 执行时间右闭区间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionEndTime(String ExecutionEndTime) {
        this.ExecutionEndTime = ExecutionEndTime;
    }

    /**
     * Get 任务实例初始化策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceInitStrategy 任务实例初始化策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceInitStrategy() {
        return this.InstanceInitStrategy;
    }

    /**
     * Set 任务实例初始化策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceInitStrategy 任务实例初始化策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceInitStrategy(String InstanceInitStrategy) {
        this.InstanceInitStrategy = InstanceInitStrategy;
    }

    /**
     * Get 工作流ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowId 工作流ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 工作流ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowId 工作流ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get 工作流自依赖
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DependencyWorkflow 工作流自依赖
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDependencyWorkflow() {
        return this.DependencyWorkflow;
    }

    /**
     * Set 工作流自依赖
注意：此字段可能返回 null，表示取不到有效值。
     * @param DependencyWorkflow 工作流自依赖
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDependencyWorkflow(String DependencyWorkflow) {
        this.DependencyWorkflow = DependencyWorkflow;
    }

    /**
     * Get 调度计划释义
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchedulerDesc 调度计划释义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSchedulerDesc() {
        return this.SchedulerDesc;
    }

    /**
     * Set 调度计划释义
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchedulerDesc 调度计划释义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchedulerDesc(String SchedulerDesc) {
        this.SchedulerDesc = SchedulerDesc;
    }

    /**
     * Get 工作流首次提交时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FirstSubmitTime 工作流首次提交时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFirstSubmitTime() {
        return this.FirstSubmitTime;
    }

    /**
     * Set 工作流首次提交时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param FirstSubmitTime 工作流首次提交时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFirstSubmitTime(String FirstSubmitTime) {
        this.FirstSubmitTime = FirstSubmitTime;
    }

    /**
     * Get 工作流最近提交时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestSubmitTime 工作流最近提交时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestSubmitTime() {
        return this.LatestSubmitTime;
    }

    /**
     * Set 工作流最近提交时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestSubmitTime 工作流最近提交时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestSubmitTime(String LatestSubmitTime) {
        this.LatestSubmitTime = LatestSubmitTime;
    }

    public WorkflowSchedulerOpsDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowSchedulerOpsDto(WorkflowSchedulerOpsDto source) {
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.DelayTime != null) {
            this.DelayTime = new Long(source.DelayTime);
        }
        if (source.StartupTime != null) {
            this.StartupTime = new Long(source.StartupTime);
        }
        if (source.SelfDepend != null) {
            this.SelfDepend = new String(source.SelfDepend);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.TaskAction != null) {
            this.TaskAction = new String(source.TaskAction);
        }
        if (source.CycleType != null) {
            this.CycleType = new String(source.CycleType);
        }
        if (source.CycleStep != null) {
            this.CycleStep = new Long(source.CycleStep);
        }
        if (source.CrontabExpression != null) {
            this.CrontabExpression = new String(source.CrontabExpression);
        }
        if (source.ExecutionStartTime != null) {
            this.ExecutionStartTime = new String(source.ExecutionStartTime);
        }
        if (source.ExecutionEndTime != null) {
            this.ExecutionEndTime = new String(source.ExecutionEndTime);
        }
        if (source.InstanceInitStrategy != null) {
            this.InstanceInitStrategy = new String(source.InstanceInitStrategy);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.DependencyWorkflow != null) {
            this.DependencyWorkflow = new String(source.DependencyWorkflow);
        }
        if (source.SchedulerDesc != null) {
            this.SchedulerDesc = new String(source.SchedulerDesc);
        }
        if (source.FirstSubmitTime != null) {
            this.FirstSubmitTime = new String(source.FirstSubmitTime);
        }
        if (source.LatestSubmitTime != null) {
            this.LatestSubmitTime = new String(source.LatestSubmitTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "DelayTime", this.DelayTime);
        this.setParamSimple(map, prefix + "StartupTime", this.StartupTime);
        this.setParamSimple(map, prefix + "SelfDepend", this.SelfDepend);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TaskAction", this.TaskAction);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "CycleStep", this.CycleStep);
        this.setParamSimple(map, prefix + "CrontabExpression", this.CrontabExpression);
        this.setParamSimple(map, prefix + "ExecutionStartTime", this.ExecutionStartTime);
        this.setParamSimple(map, prefix + "ExecutionEndTime", this.ExecutionEndTime);
        this.setParamSimple(map, prefix + "InstanceInitStrategy", this.InstanceInitStrategy);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "DependencyWorkflow", this.DependencyWorkflow);
        this.setParamSimple(map, prefix + "SchedulerDesc", this.SchedulerDesc);
        this.setParamSimple(map, prefix + "FirstSubmitTime", this.FirstSubmitTime);
        this.setParamSimple(map, prefix + "LatestSubmitTime", this.LatestSubmitTime);

    }
}

