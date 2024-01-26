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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskParentRunTimeRequest extends AbstractModel {

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 父任务配置
    */
    @SerializedName("ParentConfigs")
    @Expose
    private TaskParentSchedulerDependency [] ParentConfigs;

    /**
    * 周期类型
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * 周期步长
    */
    @SerializedName("CycleStep")
    @Expose
    private Long CycleStep;

    /**
    * 当前任务的数据时间，格式为 yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("CurRunDate")
    @Expose
    private String CurRunDate;

    /**
    * 延迟时间
    */
    @SerializedName("DelayTime")
    @Expose
    private Long DelayTime;

    /**
    * Cron表达式
    */
    @SerializedName("CrontabExpression")
    @Expose
    private String CrontabExpression;

    /**
    * 初始化策略
    */
    @SerializedName("InstanceInitStrategy")
    @Expose
    private String InstanceInitStrategy;

    /**
    * 任务Action
    */
    @SerializedName("TaskAction")
    @Expose
    private String TaskAction;

    /**
    * 周期类型为小时的时候需要设置当天的开始时间
    */
    @SerializedName("ExecutionStartTime")
    @Expose
    private String ExecutionStartTime;

    /**
    * 周期类型为小时的时候需要设置当天的结束时间
    */
    @SerializedName("ExecutionEndTime")
    @Expose
    private String ExecutionEndTime;

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 父任务配置 
     * @return ParentConfigs 父任务配置
     */
    public TaskParentSchedulerDependency [] getParentConfigs() {
        return this.ParentConfigs;
    }

    /**
     * Set 父任务配置
     * @param ParentConfigs 父任务配置
     */
    public void setParentConfigs(TaskParentSchedulerDependency [] ParentConfigs) {
        this.ParentConfigs = ParentConfigs;
    }

    /**
     * Get 周期类型 
     * @return CycleType 周期类型
     */
    public String getCycleType() {
        return this.CycleType;
    }

    /**
     * Set 周期类型
     * @param CycleType 周期类型
     */
    public void setCycleType(String CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get 周期步长 
     * @return CycleStep 周期步长
     */
    public Long getCycleStep() {
        return this.CycleStep;
    }

    /**
     * Set 周期步长
     * @param CycleStep 周期步长
     */
    public void setCycleStep(Long CycleStep) {
        this.CycleStep = CycleStep;
    }

    /**
     * Get 当前任务的数据时间，格式为 yyyy-MM-dd HH:mm:ss 
     * @return CurRunDate 当前任务的数据时间，格式为 yyyy-MM-dd HH:mm:ss
     */
    public String getCurRunDate() {
        return this.CurRunDate;
    }

    /**
     * Set 当前任务的数据时间，格式为 yyyy-MM-dd HH:mm:ss
     * @param CurRunDate 当前任务的数据时间，格式为 yyyy-MM-dd HH:mm:ss
     */
    public void setCurRunDate(String CurRunDate) {
        this.CurRunDate = CurRunDate;
    }

    /**
     * Get 延迟时间 
     * @return DelayTime 延迟时间
     */
    public Long getDelayTime() {
        return this.DelayTime;
    }

    /**
     * Set 延迟时间
     * @param DelayTime 延迟时间
     */
    public void setDelayTime(Long DelayTime) {
        this.DelayTime = DelayTime;
    }

    /**
     * Get Cron表达式 
     * @return CrontabExpression Cron表达式
     */
    public String getCrontabExpression() {
        return this.CrontabExpression;
    }

    /**
     * Set Cron表达式
     * @param CrontabExpression Cron表达式
     */
    public void setCrontabExpression(String CrontabExpression) {
        this.CrontabExpression = CrontabExpression;
    }

    /**
     * Get 初始化策略 
     * @return InstanceInitStrategy 初始化策略
     */
    public String getInstanceInitStrategy() {
        return this.InstanceInitStrategy;
    }

    /**
     * Set 初始化策略
     * @param InstanceInitStrategy 初始化策略
     */
    public void setInstanceInitStrategy(String InstanceInitStrategy) {
        this.InstanceInitStrategy = InstanceInitStrategy;
    }

    /**
     * Get 任务Action 
     * @return TaskAction 任务Action
     */
    public String getTaskAction() {
        return this.TaskAction;
    }

    /**
     * Set 任务Action
     * @param TaskAction 任务Action
     */
    public void setTaskAction(String TaskAction) {
        this.TaskAction = TaskAction;
    }

    /**
     * Get 周期类型为小时的时候需要设置当天的开始时间 
     * @return ExecutionStartTime 周期类型为小时的时候需要设置当天的开始时间
     */
    public String getExecutionStartTime() {
        return this.ExecutionStartTime;
    }

    /**
     * Set 周期类型为小时的时候需要设置当天的开始时间
     * @param ExecutionStartTime 周期类型为小时的时候需要设置当天的开始时间
     */
    public void setExecutionStartTime(String ExecutionStartTime) {
        this.ExecutionStartTime = ExecutionStartTime;
    }

    /**
     * Get 周期类型为小时的时候需要设置当天的结束时间 
     * @return ExecutionEndTime 周期类型为小时的时候需要设置当天的结束时间
     */
    public String getExecutionEndTime() {
        return this.ExecutionEndTime;
    }

    /**
     * Set 周期类型为小时的时候需要设置当天的结束时间
     * @param ExecutionEndTime 周期类型为小时的时候需要设置当天的结束时间
     */
    public void setExecutionEndTime(String ExecutionEndTime) {
        this.ExecutionEndTime = ExecutionEndTime;
    }

    public DescribeTaskParentRunTimeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskParentRunTimeRequest(DescribeTaskParentRunTimeRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ParentConfigs != null) {
            this.ParentConfigs = new TaskParentSchedulerDependency[source.ParentConfigs.length];
            for (int i = 0; i < source.ParentConfigs.length; i++) {
                this.ParentConfigs[i] = new TaskParentSchedulerDependency(source.ParentConfigs[i]);
            }
        }
        if (source.CycleType != null) {
            this.CycleType = new String(source.CycleType);
        }
        if (source.CycleStep != null) {
            this.CycleStep = new Long(source.CycleStep);
        }
        if (source.CurRunDate != null) {
            this.CurRunDate = new String(source.CurRunDate);
        }
        if (source.DelayTime != null) {
            this.DelayTime = new Long(source.DelayTime);
        }
        if (source.CrontabExpression != null) {
            this.CrontabExpression = new String(source.CrontabExpression);
        }
        if (source.InstanceInitStrategy != null) {
            this.InstanceInitStrategy = new String(source.InstanceInitStrategy);
        }
        if (source.TaskAction != null) {
            this.TaskAction = new String(source.TaskAction);
        }
        if (source.ExecutionStartTime != null) {
            this.ExecutionStartTime = new String(source.ExecutionStartTime);
        }
        if (source.ExecutionEndTime != null) {
            this.ExecutionEndTime = new String(source.ExecutionEndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "ParentConfigs.", this.ParentConfigs);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "CycleStep", this.CycleStep);
        this.setParamSimple(map, prefix + "CurRunDate", this.CurRunDate);
        this.setParamSimple(map, prefix + "DelayTime", this.DelayTime);
        this.setParamSimple(map, prefix + "CrontabExpression", this.CrontabExpression);
        this.setParamSimple(map, prefix + "InstanceInitStrategy", this.InstanceInitStrategy);
        this.setParamSimple(map, prefix + "TaskAction", this.TaskAction);
        this.setParamSimple(map, prefix + "ExecutionStartTime", this.ExecutionStartTime);
        this.setParamSimple(map, prefix + "ExecutionEndTime", this.ExecutionEndTime);

    }
}

