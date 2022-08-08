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

public class ModifyWorkflowScheduleRequest extends AbstractModel{

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 工作流id
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 延迟时间，单位分钟
    */
    @SerializedName("DelayTime")
    @Expose
    private Long DelayTime;

    /**
    * 启动时间
    */
    @SerializedName("StartupTime")
    @Expose
    private Long StartupTime;

    /**
    * 自依赖类型  1:有序串行 一次一个 排队, 2: 无序串行 一次一个 不排队， 3:并行 一次多个
    */
    @SerializedName("SelfDepend")
    @Expose
    private Long SelfDepend;

    /**
    * "周期类型  0:crontab类型, 1:分钟，2:小时，3:天，4:周，5:月，6:一次性，7:用户驱动，10:弹性周期 周,11:弹性周期 月,12:年,13:即时触发Instant类型，与正常周期调度任务逻辑隔离
    */
    @SerializedName("CycleType")
    @Expose
    private Long CycleType;

    /**
    * 步长，间隔时间，最小1
    */
    @SerializedName("CycleStep")
    @Expose
    private Long CycleStep;

    /**
    * 生效开始时间，格式 yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 生效结束时间，格式 yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 调度配置-弹性周期配置，小时/周/月/年调度才有，小时任务指定每天的0点3点4点跑，则为'0,3,4'。
    */
    @SerializedName("TaskAction")
    @Expose
    private String TaskAction;

    /**
    * cron表达式  周期类型为crontab调度才需要
    */
    @SerializedName("CrontabExpression")
    @Expose
    private String CrontabExpression;

    /**
    * 执行时间左闭区间，格式：HH:mm  小时调度才有，例如小时任务, 每日固定区间生效
    */
    @SerializedName("ExecutionStartTime")
    @Expose
    private String ExecutionStartTime;

    /**
    * 执行时间右闭区间，格式：HH:mm  小时调度才有，例如小时任务, 每日固定区间生效
    */
    @SerializedName("ExecutionEndTime")
    @Expose
    private String ExecutionEndTime;

    /**
    * 工作流依赖 ,yes 或者no
    */
    @SerializedName("DependencyWorkflow")
    @Expose
    private String DependencyWorkflow;

    /**
     * Get 项目Id 
     * @return ProjectId 项目Id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目Id
     * @param ProjectId 项目Id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 工作流id 
     * @return WorkflowId 工作流id
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 工作流id
     * @param WorkflowId 工作流id
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get 延迟时间，单位分钟 
     * @return DelayTime 延迟时间，单位分钟
     */
    public Long getDelayTime() {
        return this.DelayTime;
    }

    /**
     * Set 延迟时间，单位分钟
     * @param DelayTime 延迟时间，单位分钟
     */
    public void setDelayTime(Long DelayTime) {
        this.DelayTime = DelayTime;
    }

    /**
     * Get 启动时间 
     * @return StartupTime 启动时间
     */
    public Long getStartupTime() {
        return this.StartupTime;
    }

    /**
     * Set 启动时间
     * @param StartupTime 启动时间
     */
    public void setStartupTime(Long StartupTime) {
        this.StartupTime = StartupTime;
    }

    /**
     * Get 自依赖类型  1:有序串行 一次一个 排队, 2: 无序串行 一次一个 不排队， 3:并行 一次多个 
     * @return SelfDepend 自依赖类型  1:有序串行 一次一个 排队, 2: 无序串行 一次一个 不排队， 3:并行 一次多个
     */
    public Long getSelfDepend() {
        return this.SelfDepend;
    }

    /**
     * Set 自依赖类型  1:有序串行 一次一个 排队, 2: 无序串行 一次一个 不排队， 3:并行 一次多个
     * @param SelfDepend 自依赖类型  1:有序串行 一次一个 排队, 2: 无序串行 一次一个 不排队， 3:并行 一次多个
     */
    public void setSelfDepend(Long SelfDepend) {
        this.SelfDepend = SelfDepend;
    }

    /**
     * Get "周期类型  0:crontab类型, 1:分钟，2:小时，3:天，4:周，5:月，6:一次性，7:用户驱动，10:弹性周期 周,11:弹性周期 月,12:年,13:即时触发Instant类型，与正常周期调度任务逻辑隔离 
     * @return CycleType "周期类型  0:crontab类型, 1:分钟，2:小时，3:天，4:周，5:月，6:一次性，7:用户驱动，10:弹性周期 周,11:弹性周期 月,12:年,13:即时触发Instant类型，与正常周期调度任务逻辑隔离
     */
    public Long getCycleType() {
        return this.CycleType;
    }

    /**
     * Set "周期类型  0:crontab类型, 1:分钟，2:小时，3:天，4:周，5:月，6:一次性，7:用户驱动，10:弹性周期 周,11:弹性周期 月,12:年,13:即时触发Instant类型，与正常周期调度任务逻辑隔离
     * @param CycleType "周期类型  0:crontab类型, 1:分钟，2:小时，3:天，4:周，5:月，6:一次性，7:用户驱动，10:弹性周期 周,11:弹性周期 月,12:年,13:即时触发Instant类型，与正常周期调度任务逻辑隔离
     */
    public void setCycleType(Long CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get 步长，间隔时间，最小1 
     * @return CycleStep 步长，间隔时间，最小1
     */
    public Long getCycleStep() {
        return this.CycleStep;
    }

    /**
     * Set 步长，间隔时间，最小1
     * @param CycleStep 步长，间隔时间，最小1
     */
    public void setCycleStep(Long CycleStep) {
        this.CycleStep = CycleStep;
    }

    /**
     * Get 生效开始时间，格式 yyyy-MM-dd HH:mm:ss 
     * @return StartTime 生效开始时间，格式 yyyy-MM-dd HH:mm:ss
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 生效开始时间，格式 yyyy-MM-dd HH:mm:ss
     * @param StartTime 生效开始时间，格式 yyyy-MM-dd HH:mm:ss
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 生效结束时间，格式 yyyy-MM-dd HH:mm:ss 
     * @return EndTime 生效结束时间，格式 yyyy-MM-dd HH:mm:ss
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 生效结束时间，格式 yyyy-MM-dd HH:mm:ss
     * @param EndTime 生效结束时间，格式 yyyy-MM-dd HH:mm:ss
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 调度配置-弹性周期配置，小时/周/月/年调度才有，小时任务指定每天的0点3点4点跑，则为'0,3,4'。 
     * @return TaskAction 调度配置-弹性周期配置，小时/周/月/年调度才有，小时任务指定每天的0点3点4点跑，则为'0,3,4'。
     */
    public String getTaskAction() {
        return this.TaskAction;
    }

    /**
     * Set 调度配置-弹性周期配置，小时/周/月/年调度才有，小时任务指定每天的0点3点4点跑，则为'0,3,4'。
     * @param TaskAction 调度配置-弹性周期配置，小时/周/月/年调度才有，小时任务指定每天的0点3点4点跑，则为'0,3,4'。
     */
    public void setTaskAction(String TaskAction) {
        this.TaskAction = TaskAction;
    }

    /**
     * Get cron表达式  周期类型为crontab调度才需要 
     * @return CrontabExpression cron表达式  周期类型为crontab调度才需要
     */
    public String getCrontabExpression() {
        return this.CrontabExpression;
    }

    /**
     * Set cron表达式  周期类型为crontab调度才需要
     * @param CrontabExpression cron表达式  周期类型为crontab调度才需要
     */
    public void setCrontabExpression(String CrontabExpression) {
        this.CrontabExpression = CrontabExpression;
    }

    /**
     * Get 执行时间左闭区间，格式：HH:mm  小时调度才有，例如小时任务, 每日固定区间生效 
     * @return ExecutionStartTime 执行时间左闭区间，格式：HH:mm  小时调度才有，例如小时任务, 每日固定区间生效
     */
    public String getExecutionStartTime() {
        return this.ExecutionStartTime;
    }

    /**
     * Set 执行时间左闭区间，格式：HH:mm  小时调度才有，例如小时任务, 每日固定区间生效
     * @param ExecutionStartTime 执行时间左闭区间，格式：HH:mm  小时调度才有，例如小时任务, 每日固定区间生效
     */
    public void setExecutionStartTime(String ExecutionStartTime) {
        this.ExecutionStartTime = ExecutionStartTime;
    }

    /**
     * Get 执行时间右闭区间，格式：HH:mm  小时调度才有，例如小时任务, 每日固定区间生效 
     * @return ExecutionEndTime 执行时间右闭区间，格式：HH:mm  小时调度才有，例如小时任务, 每日固定区间生效
     */
    public String getExecutionEndTime() {
        return this.ExecutionEndTime;
    }

    /**
     * Set 执行时间右闭区间，格式：HH:mm  小时调度才有，例如小时任务, 每日固定区间生效
     * @param ExecutionEndTime 执行时间右闭区间，格式：HH:mm  小时调度才有，例如小时任务, 每日固定区间生效
     */
    public void setExecutionEndTime(String ExecutionEndTime) {
        this.ExecutionEndTime = ExecutionEndTime;
    }

    /**
     * Get 工作流依赖 ,yes 或者no 
     * @return DependencyWorkflow 工作流依赖 ,yes 或者no
     */
    public String getDependencyWorkflow() {
        return this.DependencyWorkflow;
    }

    /**
     * Set 工作流依赖 ,yes 或者no
     * @param DependencyWorkflow 工作流依赖 ,yes 或者no
     */
    public void setDependencyWorkflow(String DependencyWorkflow) {
        this.DependencyWorkflow = DependencyWorkflow;
    }

    public ModifyWorkflowScheduleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyWorkflowScheduleRequest(ModifyWorkflowScheduleRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.DelayTime != null) {
            this.DelayTime = new Long(source.DelayTime);
        }
        if (source.StartupTime != null) {
            this.StartupTime = new Long(source.StartupTime);
        }
        if (source.SelfDepend != null) {
            this.SelfDepend = new Long(source.SelfDepend);
        }
        if (source.CycleType != null) {
            this.CycleType = new Long(source.CycleType);
        }
        if (source.CycleStep != null) {
            this.CycleStep = new Long(source.CycleStep);
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
        if (source.CrontabExpression != null) {
            this.CrontabExpression = new String(source.CrontabExpression);
        }
        if (source.ExecutionStartTime != null) {
            this.ExecutionStartTime = new String(source.ExecutionStartTime);
        }
        if (source.ExecutionEndTime != null) {
            this.ExecutionEndTime = new String(source.ExecutionEndTime);
        }
        if (source.DependencyWorkflow != null) {
            this.DependencyWorkflow = new String(source.DependencyWorkflow);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "DelayTime", this.DelayTime);
        this.setParamSimple(map, prefix + "StartupTime", this.StartupTime);
        this.setParamSimple(map, prefix + "SelfDepend", this.SelfDepend);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "CycleStep", this.CycleStep);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TaskAction", this.TaskAction);
        this.setParamSimple(map, prefix + "CrontabExpression", this.CrontabExpression);
        this.setParamSimple(map, prefix + "ExecutionStartTime", this.ExecutionStartTime);
        this.setParamSimple(map, prefix + "ExecutionEndTime", this.ExecutionEndTime);
        this.setParamSimple(map, prefix + "DependencyWorkflow", this.DependencyWorkflow);

    }
}

