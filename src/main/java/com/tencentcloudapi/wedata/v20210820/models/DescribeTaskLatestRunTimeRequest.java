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

public class DescribeTaskLatestRunTimeRequest extends AbstractModel {

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 基准时间，非必填，如果不填，自动取当前的事件，如果要填，格式为 yyyy-MM-dd HH:mm:ss，如果格式不符合要求，则默认取当前时间
    */
    @SerializedName("BaseTime")
    @Expose
    private String BaseTime;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 周期类型
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * 自依赖类型
    */
    @SerializedName("SelfDepend")
    @Expose
    private String SelfDepend;

    /**
    * TaskAction
    */
    @SerializedName("TaskAction")
    @Expose
    private String TaskAction;

    /**
    * 循环步长
    */
    @SerializedName("CycleStep")
    @Expose
    private Long CycleStep;

    /**
    * 延迟时间
    */
    @SerializedName("DelayTime")
    @Expose
    private Long DelayTime;

    /**
    * Cron表达式
    */
    @SerializedName("CronTabExpression")
    @Expose
    private String CronTabExpression;

    /**
    * 小时周期在一天中的开始时间
    */
    @SerializedName("ExecutionStartTime")
    @Expose
    private String ExecutionStartTime;

    /**
    * 小时周期在一天中的结束时间
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
     * Get 任务ID 
     * @return TaskId 任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
     * @param TaskId 任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 基准时间，非必填，如果不填，自动取当前的事件，如果要填，格式为 yyyy-MM-dd HH:mm:ss，如果格式不符合要求，则默认取当前时间 
     * @return BaseTime 基准时间，非必填，如果不填，自动取当前的事件，如果要填，格式为 yyyy-MM-dd HH:mm:ss，如果格式不符合要求，则默认取当前时间
     */
    public String getBaseTime() {
        return this.BaseTime;
    }

    /**
     * Set 基准时间，非必填，如果不填，自动取当前的事件，如果要填，格式为 yyyy-MM-dd HH:mm:ss，如果格式不符合要求，则默认取当前时间
     * @param BaseTime 基准时间，非必填，如果不填，自动取当前的事件，如果要填，格式为 yyyy-MM-dd HH:mm:ss，如果格式不符合要求，则默认取当前时间
     */
    public void setBaseTime(String BaseTime) {
        this.BaseTime = BaseTime;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
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
     * Get 自依赖类型 
     * @return SelfDepend 自依赖类型
     */
    public String getSelfDepend() {
        return this.SelfDepend;
    }

    /**
     * Set 自依赖类型
     * @param SelfDepend 自依赖类型
     */
    public void setSelfDepend(String SelfDepend) {
        this.SelfDepend = SelfDepend;
    }

    /**
     * Get TaskAction 
     * @return TaskAction TaskAction
     */
    public String getTaskAction() {
        return this.TaskAction;
    }

    /**
     * Set TaskAction
     * @param TaskAction TaskAction
     */
    public void setTaskAction(String TaskAction) {
        this.TaskAction = TaskAction;
    }

    /**
     * Get 循环步长 
     * @return CycleStep 循环步长
     */
    public Long getCycleStep() {
        return this.CycleStep;
    }

    /**
     * Set 循环步长
     * @param CycleStep 循环步长
     */
    public void setCycleStep(Long CycleStep) {
        this.CycleStep = CycleStep;
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
     * @return CronTabExpression Cron表达式
     */
    public String getCronTabExpression() {
        return this.CronTabExpression;
    }

    /**
     * Set Cron表达式
     * @param CronTabExpression Cron表达式
     */
    public void setCronTabExpression(String CronTabExpression) {
        this.CronTabExpression = CronTabExpression;
    }

    /**
     * Get 小时周期在一天中的开始时间 
     * @return ExecutionStartTime 小时周期在一天中的开始时间
     */
    public String getExecutionStartTime() {
        return this.ExecutionStartTime;
    }

    /**
     * Set 小时周期在一天中的开始时间
     * @param ExecutionStartTime 小时周期在一天中的开始时间
     */
    public void setExecutionStartTime(String ExecutionStartTime) {
        this.ExecutionStartTime = ExecutionStartTime;
    }

    /**
     * Get 小时周期在一天中的结束时间 
     * @return ExecutionEndTime 小时周期在一天中的结束时间
     */
    public String getExecutionEndTime() {
        return this.ExecutionEndTime;
    }

    /**
     * Set 小时周期在一天中的结束时间
     * @param ExecutionEndTime 小时周期在一天中的结束时间
     */
    public void setExecutionEndTime(String ExecutionEndTime) {
        this.ExecutionEndTime = ExecutionEndTime;
    }

    public DescribeTaskLatestRunTimeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskLatestRunTimeRequest(DescribeTaskLatestRunTimeRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.BaseTime != null) {
            this.BaseTime = new String(source.BaseTime);
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
        if (source.SelfDepend != null) {
            this.SelfDepend = new String(source.SelfDepend);
        }
        if (source.TaskAction != null) {
            this.TaskAction = new String(source.TaskAction);
        }
        if (source.CycleStep != null) {
            this.CycleStep = new Long(source.CycleStep);
        }
        if (source.DelayTime != null) {
            this.DelayTime = new Long(source.DelayTime);
        }
        if (source.CronTabExpression != null) {
            this.CronTabExpression = new String(source.CronTabExpression);
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
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "BaseTime", this.BaseTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "SelfDepend", this.SelfDepend);
        this.setParamSimple(map, prefix + "TaskAction", this.TaskAction);
        this.setParamSimple(map, prefix + "CycleStep", this.CycleStep);
        this.setParamSimple(map, prefix + "DelayTime", this.DelayTime);
        this.setParamSimple(map, prefix + "CronTabExpression", this.CronTabExpression);
        this.setParamSimple(map, prefix + "ExecutionStartTime", this.ExecutionStartTime);
        this.setParamSimple(map, prefix + "ExecutionEndTime", this.ExecutionEndTime);

    }
}

