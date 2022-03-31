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

public class Task extends AbstractModel{

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
    * 自定义标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskTag")
    @Expose
    private String TaskTag;

    /**
    * 任务状态，1001--未开始  1002--进行中（执行）1003--进行中（暂停）1004--执行结束
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long TaskStatus;

    /**
    * 任务结束状态，表明任务以何种状态结束: 0 -- 尚未结束，1 -- 成功，2-- 失败，3--终止
    */
    @SerializedName("TaskStatusType")
    @Expose
    private Long TaskStatusType;

    /**
    * 保护策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskProtectStrategy")
    @Expose
    private String TaskProtectStrategy;

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
    * 任务动作组
    */
    @SerializedName("TaskGroups")
    @Expose
    private TaskGroup [] TaskGroups;

    /**
    * 开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskStartTime")
    @Expose
    private String TaskStartTime;

    /**
    * 结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskEndTime")
    @Expose
    private String TaskEndTime;

    /**
    * 是否符合预期。1：符合预期，2：不符合预期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskExpect")
    @Expose
    private Long TaskExpect;

    /**
    * 演习记录
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskSummary")
    @Expose
    private String TaskSummary;

    /**
    * 任务模式。1:手工执行，2:自动执行
    */
    @SerializedName("TaskMode")
    @Expose
    private Long TaskMode;

    /**
    * 自动暂停时长。单位分钟
    */
    @SerializedName("TaskPauseDuration")
    @Expose
    private Long TaskPauseDuration;

    /**
    * 演练创建者Uin
    */
    @SerializedName("TaskOwnerUin")
    @Expose
    private String TaskOwnerUin;

    /**
    * 地域ID
    */
    @SerializedName("TaskRegionId")
    @Expose
    private Long TaskRegionId;

    /**
    * 监控指标列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskMonitors")
    @Expose
    private TaskMonitor [] TaskMonitors;

    /**
    * 保护策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskPolicy")
    @Expose
    private DescribePolicy TaskPolicy;

    /**
    * 标签列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private TagWithDescribe [] Tags;

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
     * Get 自定义标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskTag 自定义标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskTag() {
        return this.TaskTag;
    }

    /**
     * Set 自定义标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskTag 自定义标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskTag(String TaskTag) {
        this.TaskTag = TaskTag;
    }

    /**
     * Get 任务状态，1001--未开始  1002--进行中（执行）1003--进行中（暂停）1004--执行结束
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskStatus 任务状态，1001--未开始  1002--进行中（执行）1003--进行中（暂停）1004--执行结束
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 任务状态，1001--未开始  1002--进行中（执行）1003--进行中（暂停）1004--执行结束
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskStatus 任务状态，1001--未开始  1002--进行中（执行）1003--进行中（暂停）1004--执行结束
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskStatus(Long TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get 任务结束状态，表明任务以何种状态结束: 0 -- 尚未结束，1 -- 成功，2-- 失败，3--终止 
     * @return TaskStatusType 任务结束状态，表明任务以何种状态结束: 0 -- 尚未结束，1 -- 成功，2-- 失败，3--终止
     */
    public Long getTaskStatusType() {
        return this.TaskStatusType;
    }

    /**
     * Set 任务结束状态，表明任务以何种状态结束: 0 -- 尚未结束，1 -- 成功，2-- 失败，3--终止
     * @param TaskStatusType 任务结束状态，表明任务以何种状态结束: 0 -- 尚未结束，1 -- 成功，2-- 失败，3--终止
     */
    public void setTaskStatusType(Long TaskStatusType) {
        this.TaskStatusType = TaskStatusType;
    }

    /**
     * Get 保护策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskProtectStrategy 保护策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskProtectStrategy() {
        return this.TaskProtectStrategy;
    }

    /**
     * Set 保护策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskProtectStrategy 保护策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskProtectStrategy(String TaskProtectStrategy) {
        this.TaskProtectStrategy = TaskProtectStrategy;
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
     * Get 任务动作组 
     * @return TaskGroups 任务动作组
     */
    public TaskGroup [] getTaskGroups() {
        return this.TaskGroups;
    }

    /**
     * Set 任务动作组
     * @param TaskGroups 任务动作组
     */
    public void setTaskGroups(TaskGroup [] TaskGroups) {
        this.TaskGroups = TaskGroups;
    }

    /**
     * Get 开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskStartTime 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskStartTime() {
        return this.TaskStartTime;
    }

    /**
     * Set 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskStartTime 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskStartTime(String TaskStartTime) {
        this.TaskStartTime = TaskStartTime;
    }

    /**
     * Get 结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskEndTime 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskEndTime() {
        return this.TaskEndTime;
    }

    /**
     * Set 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskEndTime 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskEndTime(String TaskEndTime) {
        this.TaskEndTime = TaskEndTime;
    }

    /**
     * Get 是否符合预期。1：符合预期，2：不符合预期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskExpect 是否符合预期。1：符合预期，2：不符合预期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskExpect() {
        return this.TaskExpect;
    }

    /**
     * Set 是否符合预期。1：符合预期，2：不符合预期
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskExpect 是否符合预期。1：符合预期，2：不符合预期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskExpect(Long TaskExpect) {
        this.TaskExpect = TaskExpect;
    }

    /**
     * Get 演习记录
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskSummary 演习记录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskSummary() {
        return this.TaskSummary;
    }

    /**
     * Set 演习记录
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskSummary 演习记录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskSummary(String TaskSummary) {
        this.TaskSummary = TaskSummary;
    }

    /**
     * Get 任务模式。1:手工执行，2:自动执行 
     * @return TaskMode 任务模式。1:手工执行，2:自动执行
     */
    public Long getTaskMode() {
        return this.TaskMode;
    }

    /**
     * Set 任务模式。1:手工执行，2:自动执行
     * @param TaskMode 任务模式。1:手工执行，2:自动执行
     */
    public void setTaskMode(Long TaskMode) {
        this.TaskMode = TaskMode;
    }

    /**
     * Get 自动暂停时长。单位分钟 
     * @return TaskPauseDuration 自动暂停时长。单位分钟
     */
    public Long getTaskPauseDuration() {
        return this.TaskPauseDuration;
    }

    /**
     * Set 自动暂停时长。单位分钟
     * @param TaskPauseDuration 自动暂停时长。单位分钟
     */
    public void setTaskPauseDuration(Long TaskPauseDuration) {
        this.TaskPauseDuration = TaskPauseDuration;
    }

    /**
     * Get 演练创建者Uin 
     * @return TaskOwnerUin 演练创建者Uin
     */
    public String getTaskOwnerUin() {
        return this.TaskOwnerUin;
    }

    /**
     * Set 演练创建者Uin
     * @param TaskOwnerUin 演练创建者Uin
     */
    public void setTaskOwnerUin(String TaskOwnerUin) {
        this.TaskOwnerUin = TaskOwnerUin;
    }

    /**
     * Get 地域ID 
     * @return TaskRegionId 地域ID
     */
    public Long getTaskRegionId() {
        return this.TaskRegionId;
    }

    /**
     * Set 地域ID
     * @param TaskRegionId 地域ID
     */
    public void setTaskRegionId(Long TaskRegionId) {
        this.TaskRegionId = TaskRegionId;
    }

    /**
     * Get 监控指标列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskMonitors 监控指标列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskMonitor [] getTaskMonitors() {
        return this.TaskMonitors;
    }

    /**
     * Set 监控指标列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskMonitors 监控指标列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskMonitors(TaskMonitor [] TaskMonitors) {
        this.TaskMonitors = TaskMonitors;
    }

    /**
     * Get 保护策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskPolicy 保护策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribePolicy getTaskPolicy() {
        return this.TaskPolicy;
    }

    /**
     * Set 保护策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskPolicy 保护策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskPolicy(DescribePolicy TaskPolicy) {
        this.TaskPolicy = TaskPolicy;
    }

    /**
     * Get 标签列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 标签列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TagWithDescribe [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 标签列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(TagWithDescribe [] Tags) {
        this.Tags = Tags;
    }

    public Task() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Task(Task source) {
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
        if (source.TaskStatusType != null) {
            this.TaskStatusType = new Long(source.TaskStatusType);
        }
        if (source.TaskProtectStrategy != null) {
            this.TaskProtectStrategy = new String(source.TaskProtectStrategy);
        }
        if (source.TaskCreateTime != null) {
            this.TaskCreateTime = new String(source.TaskCreateTime);
        }
        if (source.TaskUpdateTime != null) {
            this.TaskUpdateTime = new String(source.TaskUpdateTime);
        }
        if (source.TaskGroups != null) {
            this.TaskGroups = new TaskGroup[source.TaskGroups.length];
            for (int i = 0; i < source.TaskGroups.length; i++) {
                this.TaskGroups[i] = new TaskGroup(source.TaskGroups[i]);
            }
        }
        if (source.TaskStartTime != null) {
            this.TaskStartTime = new String(source.TaskStartTime);
        }
        if (source.TaskEndTime != null) {
            this.TaskEndTime = new String(source.TaskEndTime);
        }
        if (source.TaskExpect != null) {
            this.TaskExpect = new Long(source.TaskExpect);
        }
        if (source.TaskSummary != null) {
            this.TaskSummary = new String(source.TaskSummary);
        }
        if (source.TaskMode != null) {
            this.TaskMode = new Long(source.TaskMode);
        }
        if (source.TaskPauseDuration != null) {
            this.TaskPauseDuration = new Long(source.TaskPauseDuration);
        }
        if (source.TaskOwnerUin != null) {
            this.TaskOwnerUin = new String(source.TaskOwnerUin);
        }
        if (source.TaskRegionId != null) {
            this.TaskRegionId = new Long(source.TaskRegionId);
        }
        if (source.TaskMonitors != null) {
            this.TaskMonitors = new TaskMonitor[source.TaskMonitors.length];
            for (int i = 0; i < source.TaskMonitors.length; i++) {
                this.TaskMonitors[i] = new TaskMonitor(source.TaskMonitors[i]);
            }
        }
        if (source.TaskPolicy != null) {
            this.TaskPolicy = new DescribePolicy(source.TaskPolicy);
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
        this.setParamSimple(map, prefix + "TaskStatusType", this.TaskStatusType);
        this.setParamSimple(map, prefix + "TaskProtectStrategy", this.TaskProtectStrategy);
        this.setParamSimple(map, prefix + "TaskCreateTime", this.TaskCreateTime);
        this.setParamSimple(map, prefix + "TaskUpdateTime", this.TaskUpdateTime);
        this.setParamArrayObj(map, prefix + "TaskGroups.", this.TaskGroups);
        this.setParamSimple(map, prefix + "TaskStartTime", this.TaskStartTime);
        this.setParamSimple(map, prefix + "TaskEndTime", this.TaskEndTime);
        this.setParamSimple(map, prefix + "TaskExpect", this.TaskExpect);
        this.setParamSimple(map, prefix + "TaskSummary", this.TaskSummary);
        this.setParamSimple(map, prefix + "TaskMode", this.TaskMode);
        this.setParamSimple(map, prefix + "TaskPauseDuration", this.TaskPauseDuration);
        this.setParamSimple(map, prefix + "TaskOwnerUin", this.TaskOwnerUin);
        this.setParamSimple(map, prefix + "TaskRegionId", this.TaskRegionId);
        this.setParamArrayObj(map, prefix + "TaskMonitors.", this.TaskMonitors);
        this.setParamObj(map, prefix + "TaskPolicy.", this.TaskPolicy);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

