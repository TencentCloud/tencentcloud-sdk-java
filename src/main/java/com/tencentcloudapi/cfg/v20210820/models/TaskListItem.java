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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskListItem extends AbstractModel {

    /**
    * <p>任务ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * <p>任务标题</p>
    */
    @SerializedName("TaskTitle")
    @Expose
    private String TaskTitle;

    /**
    * <p>任务描述</p>
    */
    @SerializedName("TaskDescription")
    @Expose
    private String TaskDescription;

    /**
    * <p>任务标签</p>
    */
    @SerializedName("TaskTag")
    @Expose
    private String TaskTag;

    /**
    * <p>任务状态(1001 -- 未开始   1002 -- 进行中  1003 -- 暂停中   1004 -- 任务结束)</p>
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long TaskStatus;

    /**
    * <p>任务创建时间</p>
    */
    @SerializedName("TaskCreateTime")
    @Expose
    private String TaskCreateTime;

    /**
    * <p>任务更新时间</p>
    */
    @SerializedName("TaskUpdateTime")
    @Expose
    private String TaskUpdateTime;

    /**
    * <p>0--未开始，1--进行中，2--已完成</p>
    */
    @SerializedName("TaskPreCheckStatus")
    @Expose
    private Long TaskPreCheckStatus;

    /**
    * <p>环境检查是否通过</p>
    */
    @SerializedName("TaskPreCheckSuccess")
    @Expose
    private Boolean TaskPreCheckSuccess;

    /**
    * <p>演练是否符合预期 1-符合预期 2-不符合预期</p>
    */
    @SerializedName("TaskExpect")
    @Expose
    private Long TaskExpect;

    /**
    * <p>关联应用ID</p>
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * <p>关联应用名称</p>
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * <p>验证项ID</p>
    */
    @SerializedName("VerifyId")
    @Expose
    private Long VerifyId;

    /**
    * <p>状态类型: 0 -- 无状态，1 -- 成功，2-- 失败，3--终止</p>
    */
    @SerializedName("TaskStatusType")
    @Expose
    private Long TaskStatusType;

    /**
    * <p>架构ID</p>
    */
    @SerializedName("ArchId")
    @Expose
    private String ArchId;

    /**
    * <p>架构名称</p>
    */
    @SerializedName("ArchName")
    @Expose
    private String ArchName;

    /**
    * <p>来源</p>
    */
    @SerializedName("TaskSource")
    @Expose
    private Long TaskSource;

    /**
    * <p>云资源标签列表</p>
    */
    @SerializedName("Tags")
    @Expose
    private TagWithDescribe [] Tags;

    /**
     * Get <p>任务ID</p> 
     * @return TaskId <p>任务ID</p>
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务ID</p>
     * @param TaskId <p>任务ID</p>
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>任务标题</p> 
     * @return TaskTitle <p>任务标题</p>
     */
    public String getTaskTitle() {
        return this.TaskTitle;
    }

    /**
     * Set <p>任务标题</p>
     * @param TaskTitle <p>任务标题</p>
     */
    public void setTaskTitle(String TaskTitle) {
        this.TaskTitle = TaskTitle;
    }

    /**
     * Get <p>任务描述</p> 
     * @return TaskDescription <p>任务描述</p>
     */
    public String getTaskDescription() {
        return this.TaskDescription;
    }

    /**
     * Set <p>任务描述</p>
     * @param TaskDescription <p>任务描述</p>
     */
    public void setTaskDescription(String TaskDescription) {
        this.TaskDescription = TaskDescription;
    }

    /**
     * Get <p>任务标签</p> 
     * @return TaskTag <p>任务标签</p>
     */
    public String getTaskTag() {
        return this.TaskTag;
    }

    /**
     * Set <p>任务标签</p>
     * @param TaskTag <p>任务标签</p>
     */
    public void setTaskTag(String TaskTag) {
        this.TaskTag = TaskTag;
    }

    /**
     * Get <p>任务状态(1001 -- 未开始   1002 -- 进行中  1003 -- 暂停中   1004 -- 任务结束)</p> 
     * @return TaskStatus <p>任务状态(1001 -- 未开始   1002 -- 进行中  1003 -- 暂停中   1004 -- 任务结束)</p>
     */
    public Long getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set <p>任务状态(1001 -- 未开始   1002 -- 进行中  1003 -- 暂停中   1004 -- 任务结束)</p>
     * @param TaskStatus <p>任务状态(1001 -- 未开始   1002 -- 进行中  1003 -- 暂停中   1004 -- 任务结束)</p>
     */
    public void setTaskStatus(Long TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get <p>任务创建时间</p> 
     * @return TaskCreateTime <p>任务创建时间</p>
     */
    public String getTaskCreateTime() {
        return this.TaskCreateTime;
    }

    /**
     * Set <p>任务创建时间</p>
     * @param TaskCreateTime <p>任务创建时间</p>
     */
    public void setTaskCreateTime(String TaskCreateTime) {
        this.TaskCreateTime = TaskCreateTime;
    }

    /**
     * Get <p>任务更新时间</p> 
     * @return TaskUpdateTime <p>任务更新时间</p>
     */
    public String getTaskUpdateTime() {
        return this.TaskUpdateTime;
    }

    /**
     * Set <p>任务更新时间</p>
     * @param TaskUpdateTime <p>任务更新时间</p>
     */
    public void setTaskUpdateTime(String TaskUpdateTime) {
        this.TaskUpdateTime = TaskUpdateTime;
    }

    /**
     * Get <p>0--未开始，1--进行中，2--已完成</p> 
     * @return TaskPreCheckStatus <p>0--未开始，1--进行中，2--已完成</p>
     */
    public Long getTaskPreCheckStatus() {
        return this.TaskPreCheckStatus;
    }

    /**
     * Set <p>0--未开始，1--进行中，2--已完成</p>
     * @param TaskPreCheckStatus <p>0--未开始，1--进行中，2--已完成</p>
     */
    public void setTaskPreCheckStatus(Long TaskPreCheckStatus) {
        this.TaskPreCheckStatus = TaskPreCheckStatus;
    }

    /**
     * Get <p>环境检查是否通过</p> 
     * @return TaskPreCheckSuccess <p>环境检查是否通过</p>
     */
    public Boolean getTaskPreCheckSuccess() {
        return this.TaskPreCheckSuccess;
    }

    /**
     * Set <p>环境检查是否通过</p>
     * @param TaskPreCheckSuccess <p>环境检查是否通过</p>
     */
    public void setTaskPreCheckSuccess(Boolean TaskPreCheckSuccess) {
        this.TaskPreCheckSuccess = TaskPreCheckSuccess;
    }

    /**
     * Get <p>演练是否符合预期 1-符合预期 2-不符合预期</p> 
     * @return TaskExpect <p>演练是否符合预期 1-符合预期 2-不符合预期</p>
     */
    public Long getTaskExpect() {
        return this.TaskExpect;
    }

    /**
     * Set <p>演练是否符合预期 1-符合预期 2-不符合预期</p>
     * @param TaskExpect <p>演练是否符合预期 1-符合预期 2-不符合预期</p>
     */
    public void setTaskExpect(Long TaskExpect) {
        this.TaskExpect = TaskExpect;
    }

    /**
     * Get <p>关联应用ID</p> 
     * @return ApplicationId <p>关联应用ID</p>
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set <p>关联应用ID</p>
     * @param ApplicationId <p>关联应用ID</p>
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get <p>关联应用名称</p> 
     * @return ApplicationName <p>关联应用名称</p>
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set <p>关联应用名称</p>
     * @param ApplicationName <p>关联应用名称</p>
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get <p>验证项ID</p> 
     * @return VerifyId <p>验证项ID</p>
     */
    public Long getVerifyId() {
        return this.VerifyId;
    }

    /**
     * Set <p>验证项ID</p>
     * @param VerifyId <p>验证项ID</p>
     */
    public void setVerifyId(Long VerifyId) {
        this.VerifyId = VerifyId;
    }

    /**
     * Get <p>状态类型: 0 -- 无状态，1 -- 成功，2-- 失败，3--终止</p> 
     * @return TaskStatusType <p>状态类型: 0 -- 无状态，1 -- 成功，2-- 失败，3--终止</p>
     */
    public Long getTaskStatusType() {
        return this.TaskStatusType;
    }

    /**
     * Set <p>状态类型: 0 -- 无状态，1 -- 成功，2-- 失败，3--终止</p>
     * @param TaskStatusType <p>状态类型: 0 -- 无状态，1 -- 成功，2-- 失败，3--终止</p>
     */
    public void setTaskStatusType(Long TaskStatusType) {
        this.TaskStatusType = TaskStatusType;
    }

    /**
     * Get <p>架构ID</p> 
     * @return ArchId <p>架构ID</p>
     */
    public String getArchId() {
        return this.ArchId;
    }

    /**
     * Set <p>架构ID</p>
     * @param ArchId <p>架构ID</p>
     */
    public void setArchId(String ArchId) {
        this.ArchId = ArchId;
    }

    /**
     * Get <p>架构名称</p> 
     * @return ArchName <p>架构名称</p>
     */
    public String getArchName() {
        return this.ArchName;
    }

    /**
     * Set <p>架构名称</p>
     * @param ArchName <p>架构名称</p>
     */
    public void setArchName(String ArchName) {
        this.ArchName = ArchName;
    }

    /**
     * Get <p>来源</p> 
     * @return TaskSource <p>来源</p>
     */
    public Long getTaskSource() {
        return this.TaskSource;
    }

    /**
     * Set <p>来源</p>
     * @param TaskSource <p>来源</p>
     */
    public void setTaskSource(Long TaskSource) {
        this.TaskSource = TaskSource;
    }

    /**
     * Get <p>云资源标签列表</p> 
     * @return Tags <p>云资源标签列表</p>
     */
    public TagWithDescribe [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>云资源标签列表</p>
     * @param Tags <p>云资源标签列表</p>
     */
    public void setTags(TagWithDescribe [] Tags) {
        this.Tags = Tags;
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
        if (source.TaskSource != null) {
            this.TaskSource = new Long(source.TaskSource);
        }
        if (source.Tags != null) {
            this.Tags = new TagWithDescribe[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagWithDescribe(source.Tags[i]);
            }
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
        this.setParamSimple(map, prefix + "TaskSource", this.TaskSource);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

