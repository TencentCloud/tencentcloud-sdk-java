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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CrontabTaskInfo extends AbstractModel {

    /**
    * forcemerge任务id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 集群地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 集群id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private Long InstanceId;

    /**
    * forcemerge任务名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 任务类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 任务执行时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskTime")
    @Expose
    private String TaskTime;

    /**
    * 执行forcemerge的索引
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * 上次执行时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastExecTime")
    @Expose
    private String LastExecTime;

    /**
    * 状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 任务状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long TaskStatus;

    /**
    * 创建任务时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 任务更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 任务详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskDetail")
    @Expose
    private String TaskDetail;

    /**
    * 是否只合并有deleted标记的索引，对应ES _forcemerge API中的only_expunge_deletes参数,默认值false
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OnlyExpungeDeletes")
    @Expose
    private Boolean OnlyExpungeDeletes;

    /**
    * 最大合并Segment数量，对应ES _forcemerge API中的max_num_segments参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxMumSegments")
    @Expose
    private Long MaxMumSegments;

    /**
     * Get forcemerge任务id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId forcemerge任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set forcemerge任务id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId forcemerge任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 集群地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionId 集群地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 集群地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionId 集群地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 集群id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 集群id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群id
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 集群id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(Long InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get forcemerge任务名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskName forcemerge任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set forcemerge任务名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskName forcemerge任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 任务类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskType 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskType 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 任务执行时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskTime 任务执行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskTime() {
        return this.TaskTime;
    }

    /**
     * Set 任务执行时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskTime 任务执行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskTime(String TaskTime) {
        this.TaskTime = TaskTime;
    }

    /**
     * Get 执行forcemerge的索引
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Target 执行forcemerge的索引
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set 执行forcemerge的索引
注意：此字段可能返回 null，表示取不到有效值。
     * @param Target 执行forcemerge的索引
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get 上次执行时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastExecTime 上次执行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastExecTime() {
        return this.LastExecTime;
    }

    /**
     * Set 上次执行时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastExecTime 上次执行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastExecTime(String LastExecTime) {
        this.LastExecTime = LastExecTime;
    }

    /**
     * Get 状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return State 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param State 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 任务状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskStatus 任务状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 任务状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskStatus 任务状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskStatus(Long TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get 创建任务时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建任务时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建任务时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建任务时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 任务更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 任务更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 任务更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 任务更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 任务详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskDetail 任务详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskDetail() {
        return this.TaskDetail;
    }

    /**
     * Set 任务详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskDetail 任务详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskDetail(String TaskDetail) {
        this.TaskDetail = TaskDetail;
    }

    /**
     * Get 是否只合并有deleted标记的索引，对应ES _forcemerge API中的only_expunge_deletes参数,默认值false
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OnlyExpungeDeletes 是否只合并有deleted标记的索引，对应ES _forcemerge API中的only_expunge_deletes参数,默认值false
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getOnlyExpungeDeletes() {
        return this.OnlyExpungeDeletes;
    }

    /**
     * Set 是否只合并有deleted标记的索引，对应ES _forcemerge API中的only_expunge_deletes参数,默认值false
注意：此字段可能返回 null，表示取不到有效值。
     * @param OnlyExpungeDeletes 是否只合并有deleted标记的索引，对应ES _forcemerge API中的only_expunge_deletes参数,默认值false
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOnlyExpungeDeletes(Boolean OnlyExpungeDeletes) {
        this.OnlyExpungeDeletes = OnlyExpungeDeletes;
    }

    /**
     * Get 最大合并Segment数量，对应ES _forcemerge API中的max_num_segments参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxMumSegments 最大合并Segment数量，对应ES _forcemerge API中的max_num_segments参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxMumSegments() {
        return this.MaxMumSegments;
    }

    /**
     * Set 最大合并Segment数量，对应ES _forcemerge API中的max_num_segments参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxMumSegments 最大合并Segment数量，对应ES _forcemerge API中的max_num_segments参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxMumSegments(Long MaxMumSegments) {
        this.MaxMumSegments = MaxMumSegments;
    }

    public CrontabTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CrontabTaskInfo(CrontabTaskInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new Long(source.InstanceId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.TaskTime != null) {
            this.TaskTime = new String(source.TaskTime);
        }
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
        if (source.LastExecTime != null) {
            this.LastExecTime = new String(source.LastExecTime);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new Long(source.TaskStatus);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.TaskDetail != null) {
            this.TaskDetail = new String(source.TaskDetail);
        }
        if (source.OnlyExpungeDeletes != null) {
            this.OnlyExpungeDeletes = new Boolean(source.OnlyExpungeDeletes);
        }
        if (source.MaxMumSegments != null) {
            this.MaxMumSegments = new Long(source.MaxMumSegments);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "TaskTime", this.TaskTime);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "LastExecTime", this.LastExecTime);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "TaskDetail", this.TaskDetail);
        this.setParamSimple(map, prefix + "OnlyExpungeDeletes", this.OnlyExpungeDeletes);
        this.setParamSimple(map, prefix + "MaxMumSegments", this.MaxMumSegments);

    }
}

