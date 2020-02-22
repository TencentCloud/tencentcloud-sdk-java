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
package com.tencentcloudapi.msp.v20180319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Task extends AbstractModel{

    /**
    * 任务Id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务名称
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 迁移类型
    */
    @SerializedName("MigrationType")
    @Expose
    private String MigrationType;

    /**
    * 迁移状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 项目名称
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 迁移源信息
    */
    @SerializedName("SrcInfo")
    @Expose
    private SrcInfo SrcInfo;

    /**
    * 迁移时间信息
    */
    @SerializedName("MigrationTimeLine")
    @Expose
    private TimeObj MigrationTimeLine;

    /**
    * 状态更新时间
    */
    @SerializedName("Updated")
    @Expose
    private String Updated;

    /**
    * 迁移目的信息
    */
    @SerializedName("DstInfo")
    @Expose
    private DstInfo DstInfo;

    /**
     * Get 任务Id 
     * @return TaskId 任务Id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务Id
     * @param TaskId 任务Id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
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
     * Get 迁移类型 
     * @return MigrationType 迁移类型
     */
    public String getMigrationType() {
        return this.MigrationType;
    }

    /**
     * Set 迁移类型
     * @param MigrationType 迁移类型
     */
    public void setMigrationType(String MigrationType) {
        this.MigrationType = MigrationType;
    }

    /**
     * Get 迁移状态 
     * @return Status 迁移状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 迁移状态
     * @param Status 迁移状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 项目Id 
     * @return ProjectId 项目Id
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目Id
     * @param ProjectId 项目Id
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 项目名称 
     * @return ProjectName 项目名称
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 项目名称
     * @param ProjectName 项目名称
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 迁移源信息 
     * @return SrcInfo 迁移源信息
     */
    public SrcInfo getSrcInfo() {
        return this.SrcInfo;
    }

    /**
     * Set 迁移源信息
     * @param SrcInfo 迁移源信息
     */
    public void setSrcInfo(SrcInfo SrcInfo) {
        this.SrcInfo = SrcInfo;
    }

    /**
     * Get 迁移时间信息 
     * @return MigrationTimeLine 迁移时间信息
     */
    public TimeObj getMigrationTimeLine() {
        return this.MigrationTimeLine;
    }

    /**
     * Set 迁移时间信息
     * @param MigrationTimeLine 迁移时间信息
     */
    public void setMigrationTimeLine(TimeObj MigrationTimeLine) {
        this.MigrationTimeLine = MigrationTimeLine;
    }

    /**
     * Get 状态更新时间 
     * @return Updated 状态更新时间
     */
    public String getUpdated() {
        return this.Updated;
    }

    /**
     * Set 状态更新时间
     * @param Updated 状态更新时间
     */
    public void setUpdated(String Updated) {
        this.Updated = Updated;
    }

    /**
     * Get 迁移目的信息 
     * @return DstInfo 迁移目的信息
     */
    public DstInfo getDstInfo() {
        return this.DstInfo;
    }

    /**
     * Set 迁移目的信息
     * @param DstInfo 迁移目的信息
     */
    public void setDstInfo(DstInfo DstInfo) {
        this.DstInfo = DstInfo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "MigrationType", this.MigrationType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamObj(map, prefix + "SrcInfo.", this.SrcInfo);
        this.setParamObj(map, prefix + "MigrationTimeLine.", this.MigrationTimeLine);
        this.setParamSimple(map, prefix + "Updated", this.Updated);
        this.setParamObj(map, prefix + "DstInfo.", this.DstInfo);

    }
}

