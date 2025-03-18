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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskListItem extends AbstractModel {

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 任务标题
    */
    @SerializedName("TaskTitle")
    @Expose
    private String TaskTitle;

    /**
    * 任务描述
    */
    @SerializedName("TaskDescription")
    @Expose
    private String TaskDescription;

    /**
    * 任务标签
    */
    @SerializedName("TaskTag")
    @Expose
    private String TaskTag;

    /**
    * 任务状态(1001 -- 未开始   1002 -- 进行中  1003 -- 暂停中   1004 -- 任务结束)
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long TaskStatus;

    /**
    * 任务创建时间
    */
    @SerializedName("TaskCreateTime")
    @Expose
    private String TaskCreateTime;

    /**
    * 任务更新时间
    */
    @SerializedName("TaskUpdateTime")
    @Expose
    private String TaskUpdateTime;

    /**
    * 0--未开始，1--进行中，2--已完成
    */
    @SerializedName("TaskPreCheckStatus")
    @Expose
    private Long TaskPreCheckStatus;

    /**
    * 环境检查是否通过
    */
    @SerializedName("TaskPreCheckSuccess")
    @Expose
    private Boolean TaskPreCheckSuccess;

    /**
    * 演练是否符合预期 1-符合预期 2-不符合预期
    */
    @SerializedName("TaskExpect")
    @Expose
    private Long TaskExpect;

    /**
    * 关联应用ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 关联应用名称
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * 验证项ID
    */
    @SerializedName("VerifyId")
    @Expose
    private Long VerifyId;

    /**
    * 状态类型: 0 -- 无状态，1 -- 成功，2-- 失败，3--终止
    */
    @SerializedName("TaskStatusType")
    @Expose
    private Long TaskStatusType;

    /**
    * 架构ID
    */
    @SerializedName("ArchId")
    @Expose
    private String ArchId;

    /**
    * 架构名称
    */
    @SerializedName("ArchName")
    @Expose
    private String ArchName;

    /**
     * Get 任务ID 
     * @return TaskId 任务ID
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
     * @param TaskId 任务ID
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务标题 
     * @return TaskTitle 任务标题
     */
    public String getTaskTitle() {
        return this.TaskTitle;
    }

    /**
     * Set 任务标题
     * @param TaskTitle 任务标题
     */
    public void setTaskTitle(String TaskTitle) {
        this.TaskTitle = TaskTitle;
    }

    /**
     * Get 任务描述 
     * @return TaskDescription 任务描述
     */
    public String getTaskDescription() {
        return this.TaskDescription;
    }

    /**
     * Set 任务描述
     * @param TaskDescription 任务描述
     */
    public void setTaskDescription(String TaskDescription) {
        this.TaskDescription = TaskDescription;
    }

    /**
     * Get 任务标签 
     * @return TaskTag 任务标签
     */
    public String getTaskTag() {
        return this.TaskTag;
    }

    /**
     * Set 任务标签
     * @param TaskTag 任务标签
     */
    public void setTaskTag(String TaskTag) {
        this.TaskTag = TaskTag;
    }

    /**
     * Get 任务状态(1001 -- 未开始   1002 -- 进行中  1003 -- 暂停中   1004 -- 任务结束) 
     * @return TaskStatus 任务状态(1001 -- 未开始   1002 -- 进行中  1003 -- 暂停中   1004 -- 任务结束)
     */
    public Long getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 任务状态(1001 -- 未开始   1002 -- 进行中  1003 -- 暂停中   1004 -- 任务结束)
     * @param TaskStatus 任务状态(1001 -- 未开始   1002 -- 进行中  1003 -- 暂停中   1004 -- 任务结束)
     */
    public void setTaskStatus(Long TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get 任务创建时间 
     * @return TaskCreateTime 任务创建时间
     */
    public String getTaskCreateTime() {
        return this.TaskCreateTime;
    }

    /**
     * Set 任务创建时间
     * @param TaskCreateTime 任务创建时间
     */
    public void setTaskCreateTime(String TaskCreateTime) {
        this.TaskCreateTime = TaskCreateTime;
    }

    /**
     * Get 任务更新时间 
     * @return TaskUpdateTime 任务更新时间
     */
    public String getTaskUpdateTime() {
        return this.TaskUpdateTime;
    }

    /**
     * Set 任务更新时间
     * @param TaskUpdateTime 任务更新时间
     */
    public void setTaskUpdateTime(String TaskUpdateTime) {
        this.TaskUpdateTime = TaskUpdateTime;
    }

    /**
     * Get 0--未开始，1--进行中，2--已完成 
     * @return TaskPreCheckStatus 0--未开始，1--进行中，2--已完成
     */
    public Long getTaskPreCheckStatus() {
        return this.TaskPreCheckStatus;
    }

    /**
     * Set 0--未开始，1--进行中，2--已完成
     * @param TaskPreCheckStatus 0--未开始，1--进行中，2--已完成
     */
    public void setTaskPreCheckStatus(Long TaskPreCheckStatus) {
        this.TaskPreCheckStatus = TaskPreCheckStatus;
    }

    /**
     * Get 环境检查是否通过 
     * @return TaskPreCheckSuccess 环境检查是否通过
     */
    public Boolean getTaskPreCheckSuccess() {
        return this.TaskPreCheckSuccess;
    }

    /**
     * Set 环境检查是否通过
     * @param TaskPreCheckSuccess 环境检查是否通过
     */
    public void setTaskPreCheckSuccess(Boolean TaskPreCheckSuccess) {
        this.TaskPreCheckSuccess = TaskPreCheckSuccess;
    }

    /**
     * Get 演练是否符合预期 1-符合预期 2-不符合预期 
     * @return TaskExpect 演练是否符合预期 1-符合预期 2-不符合预期
     */
    public Long getTaskExpect() {
        return this.TaskExpect;
    }

    /**
     * Set 演练是否符合预期 1-符合预期 2-不符合预期
     * @param TaskExpect 演练是否符合预期 1-符合预期 2-不符合预期
     */
    public void setTaskExpect(Long TaskExpect) {
        this.TaskExpect = TaskExpect;
    }

    /**
     * Get 关联应用ID 
     * @return ApplicationId 关联应用ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 关联应用ID
     * @param ApplicationId 关联应用ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 关联应用名称 
     * @return ApplicationName 关联应用名称
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set 关联应用名称
     * @param ApplicationName 关联应用名称
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get 验证项ID 
     * @return VerifyId 验证项ID
     */
    public Long getVerifyId() {
        return this.VerifyId;
    }

    /**
     * Set 验证项ID
     * @param VerifyId 验证项ID
     */
    public void setVerifyId(Long VerifyId) {
        this.VerifyId = VerifyId;
    }

    /**
     * Get 状态类型: 0 -- 无状态，1 -- 成功，2-- 失败，3--终止 
     * @return TaskStatusType 状态类型: 0 -- 无状态，1 -- 成功，2-- 失败，3--终止
     */
    public Long getTaskStatusType() {
        return this.TaskStatusType;
    }

    /**
     * Set 状态类型: 0 -- 无状态，1 -- 成功，2-- 失败，3--终止
     * @param TaskStatusType 状态类型: 0 -- 无状态，1 -- 成功，2-- 失败，3--终止
     */
    public void setTaskStatusType(Long TaskStatusType) {
        this.TaskStatusType = TaskStatusType;
    }

    /**
     * Get 架构ID 
     * @return ArchId 架构ID
     */
    public String getArchId() {
        return this.ArchId;
    }

    /**
     * Set 架构ID
     * @param ArchId 架构ID
     */
    public void setArchId(String ArchId) {
        this.ArchId = ArchId;
    }

    /**
     * Get 架构名称 
     * @return ArchName 架构名称
     */
    public String getArchName() {
        return this.ArchName;
    }

    /**
     * Set 架构名称
     * @param ArchName 架构名称
     */
    public void setArchName(String ArchName) {
        this.ArchName = ArchName;
    }

    public TaskListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskListItem(TaskListItem source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.TaskTitle != null) {
            this.TaskTitle = new String(source.TaskTitle);
        }
        if (source.TaskDescription != null) {
            this.TaskDescription = new String(source.TaskDescription);
        }
        if (source.TaskTag != null) {
            this.TaskTag = new String(source.TaskTag);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new Long(source.TaskStatus);
        }
        if (source.TaskCreateTime != null) {
            this.TaskCreateTime = new String(source.TaskCreateTime);
        }
        if (source.TaskUpdateTime != null) {
            this.TaskUpdateTime = new String(source.TaskUpdateTime);
        }
        if (source.TaskPreCheckStatus != null) {
            this.TaskPreCheckStatus = new Long(source.TaskPreCheckStatus);
        }
        if (source.TaskPreCheckSuccess != null) {
            this.TaskPreCheckSuccess = new Boolean(source.TaskPreCheckSuccess);
        }
        if (source.TaskExpect != null) {
            this.TaskExpect = new Long(source.TaskExpect);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
        if (source.VerifyId != null) {
            this.VerifyId = new Long(source.VerifyId);
        }
        if (source.TaskStatusType != null) {
            this.TaskStatusType = new Long(source.TaskStatusType);
        }
        if (source.ArchId != null) {
            this.ArchId = new String(source.ArchId);
        }
        if (source.ArchName != null) {
            this.ArchName = new String(source.ArchName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskTitle", this.TaskTitle);
        this.setParamSimple(map, prefix + "TaskDescription", this.TaskDescription);
        this.setParamSimple(map, prefix + "TaskTag", this.TaskTag);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "TaskCreateTime", this.TaskCreateTime);
        this.setParamSimple(map, prefix + "TaskUpdateTime", this.TaskUpdateTime);
        this.setParamSimple(map, prefix + "TaskPreCheckStatus", this.TaskPreCheckStatus);
        this.setParamSimple(map, prefix + "TaskPreCheckSuccess", this.TaskPreCheckSuccess);
        this.setParamSimple(map, prefix + "TaskExpect", this.TaskExpect);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "VerifyId", this.VerifyId);
        this.setParamSimple(map, prefix + "TaskStatusType", this.TaskStatusType);
        this.setParamSimple(map, prefix + "ArchId", this.ArchId);
        this.setParamSimple(map, prefix + "ArchName", this.ArchName);

    }
}

