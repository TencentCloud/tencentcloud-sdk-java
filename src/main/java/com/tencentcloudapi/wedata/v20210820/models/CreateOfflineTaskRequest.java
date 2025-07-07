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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateOfflineTaskRequest extends AbstractModel {

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 间隔，可选，默认1。非空。默认 1
    */
    @SerializedName("CycleStep")
    @Expose
    private Long CycleStep;

    /**
    * 延时执行时间，单位分钟
    */
    @SerializedName("DelayTime")
    @Expose
    private Long DelayTime;

    /**
    * 任务结束数据时间。非空。默认当前时间
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
    * 时间指定，如月任务指定1，3号，则填入 1，3。非空。默认 "" 月任务：如具体1，3号则写 "1,3"，指定月末不可和具体号数一起输入，仅能为 "L"
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
    * 导入编排空间配置
    */
    @SerializedName("TaskImportInfo")
    @Expose
    private TaskImportInfo TaskImportInfo;

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
     * Get 间隔，可选，默认1。非空。默认 1 
     * @return CycleStep 间隔，可选，默认1。非空。默认 1
     */
    public Long getCycleStep() {
        return this.CycleStep;
    }

    /**
     * Set 间隔，可选，默认1。非空。默认 1
     * @param CycleStep 间隔，可选，默认1。非空。默认 1
     */
    public void setCycleStep(Long CycleStep) {
        this.CycleStep = CycleStep;
    }

    /**
     * Get 延时执行时间，单位分钟 
     * @return DelayTime 延时执行时间，单位分钟
     */
    public Long getDelayTime() {
        return this.DelayTime;
    }

    /**
     * Set 延时执行时间，单位分钟
     * @param DelayTime 延时执行时间，单位分钟
     */
    public void setDelayTime(Long DelayTime) {
        this.DelayTime = DelayTime;
    }

    /**
     * Get 任务结束数据时间。非空。默认当前时间 
     * @return EndTime 任务结束数据时间。非空。默认当前时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 任务结束数据时间。非空。默认当前时间
     * @param EndTime 任务结束数据时间。非空。默认当前时间
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
     * Get 时间指定，如月任务指定1，3号，则填入 1，3。非空。默认 "" 月任务：如具体1，3号则写 "1,3"，指定月末不可和具体号数一起输入，仅能为 "L" 
     * @return TaskAction 时间指定，如月任务指定1，3号，则填入 1，3。非空。默认 "" 月任务：如具体1，3号则写 "1,3"，指定月末不可和具体号数一起输入，仅能为 "L"
     */
    public String getTaskAction() {
        return this.TaskAction;
    }

    /**
     * Set 时间指定，如月任务指定1，3号，则填入 1，3。非空。默认 "" 月任务：如具体1，3号则写 "1,3"，指定月末不可和具体号数一起输入，仅能为 "L"
     * @param TaskAction 时间指定，如月任务指定1，3号，则填入 1，3。非空。默认 "" 月任务：如具体1，3号则写 "1,3"，指定月末不可和具体号数一起输入，仅能为 "L"
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

    /**
     * Get 导入编排空间配置 
     * @return TaskImportInfo 导入编排空间配置
     */
    public TaskImportInfo getTaskImportInfo() {
        return this.TaskImportInfo;
    }

    /**
     * Set 导入编排空间配置
     * @param TaskImportInfo 导入编排空间配置
     */
    public void setTaskImportInfo(TaskImportInfo TaskImportInfo) {
        this.TaskImportInfo = TaskImportInfo;
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
        if (source.TaskImportInfo != null) {
            this.TaskImportInfo = new TaskImportInfo(source.TaskImportInfo);
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
        this.setParamObj(map, prefix + "TaskImportInfo.", this.TaskImportInfo);

    }
}

