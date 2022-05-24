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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskListItem extends AbstractModel{

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
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskTag 任务标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskTag() {
        return this.TaskTag;
    }

    /**
     * Set 任务标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskTag 任务标签
注意：此字段可能返回 null，表示取不到有效值。
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

    }
}

