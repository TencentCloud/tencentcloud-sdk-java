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

public class CreateOfflineTaskRequest extends AbstractModel{

    /**
    * 项目/工作
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 1
    */
    @SerializedName("CycleStep")
    @Expose
    private Long CycleStep;

    /**
    * 0
    */
    @SerializedName("DelayTime")
    @Expose
    private Long DelayTime;

    /**
    * 2099-12-31 00:00:00
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 备注
    */
    @SerializedName("Notes")
    @Expose
    private String Notes;

    /**
    * 当前日期
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 任务名称
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 跟之前调用调度接口保持一致27
    */
    @SerializedName("TypeId")
    @Expose
    private Long TypeId;

    /**
    * 默认 ""
    */
    @SerializedName("TaskAction")
    @Expose
    private String TaskAction;

    /**
    * 区分画布和表单
    */
    @SerializedName("TaskMode")
    @Expose
    private String TaskMode;

    /**
     * Get 项目/工作 
     * @return ProjectId 项目/工作
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目/工作
     * @param ProjectId 项目/工作
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 1 
     * @return CycleStep 1
     */
    public Long getCycleStep() {
        return this.CycleStep;
    }

    /**
     * Set 1
     * @param CycleStep 1
     */
    public void setCycleStep(Long CycleStep) {
        this.CycleStep = CycleStep;
    }

    /**
     * Get 0 
     * @return DelayTime 0
     */
    public Long getDelayTime() {
        return this.DelayTime;
    }

    /**
     * Set 0
     * @param DelayTime 0
     */
    public void setDelayTime(Long DelayTime) {
        this.DelayTime = DelayTime;
    }

    /**
     * Get 2099-12-31 00:00:00 
     * @return EndTime 2099-12-31 00:00:00
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 2099-12-31 00:00:00
     * @param EndTime 2099-12-31 00:00:00
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 备注 
     * @return Notes 备注
     */
    public String getNotes() {
        return this.Notes;
    }

    /**
     * Set 备注
     * @param Notes 备注
     */
    public void setNotes(String Notes) {
        this.Notes = Notes;
    }

    /**
     * Get 当前日期 
     * @return StartTime 当前日期
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 当前日期
     * @param StartTime 当前日期
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 任务名称 
     * @return TaskName 任务名称
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名称
     * @param TaskName 任务名称
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 跟之前调用调度接口保持一致27 
     * @return TypeId 跟之前调用调度接口保持一致27
     */
    public Long getTypeId() {
        return this.TypeId;
    }

    /**
     * Set 跟之前调用调度接口保持一致27
     * @param TypeId 跟之前调用调度接口保持一致27
     */
    public void setTypeId(Long TypeId) {
        this.TypeId = TypeId;
    }

    /**
     * Get 默认 "" 
     * @return TaskAction 默认 ""
     */
    public String getTaskAction() {
        return this.TaskAction;
    }

    /**
     * Set 默认 ""
     * @param TaskAction 默认 ""
     */
    public void setTaskAction(String TaskAction) {
        this.TaskAction = TaskAction;
    }

    /**
     * Get 区分画布和表单 
     * @return TaskMode 区分画布和表单
     */
    public String getTaskMode() {
        return this.TaskMode;
    }

    /**
     * Set 区分画布和表单
     * @param TaskMode 区分画布和表单
     */
    public void setTaskMode(String TaskMode) {
        this.TaskMode = TaskMode;
    }

    public CreateOfflineTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOfflineTaskRequest(CreateOfflineTaskRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.CycleStep != null) {
            this.CycleStep = new Long(source.CycleStep);
        }
        if (source.DelayTime != null) {
            this.DelayTime = new Long(source.DelayTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Notes != null) {
            this.Notes = new String(source.Notes);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TypeId != null) {
            this.TypeId = new Long(source.TypeId);
        }
        if (source.TaskAction != null) {
            this.TaskAction = new String(source.TaskAction);
        }
        if (source.TaskMode != null) {
            this.TaskMode = new String(source.TaskMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CycleStep", this.CycleStep);
        this.setParamSimple(map, prefix + "DelayTime", this.DelayTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Notes", this.Notes);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TypeId", this.TypeId);
        this.setParamSimple(map, prefix + "TaskAction", this.TaskAction);
        this.setParamSimple(map, prefix + "TaskMode", this.TaskMode);

    }
}

