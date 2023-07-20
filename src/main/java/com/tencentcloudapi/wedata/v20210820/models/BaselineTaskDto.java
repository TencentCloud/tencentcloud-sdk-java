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

public class BaselineTaskDto extends AbstractModel{

    /**
    * 变更记录id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 基线id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BaselineId")
    @Expose
    private Long BaselineId;

    /**
    * 任务id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 任务运行平均时间/单位秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EstimatedCostTime")
    @Expose
    private Long EstimatedCostTime;

    /**
    * 上游实例id,多个实例用,分开
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpstreamTaskIds")
    @Expose
    private StringListNode UpstreamTaskIds;

    /**
    * 下游实例id,多个实例用,分开
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DownstreamTaskIds")
    @Expose
    private StringListNode DownstreamTaskIds;

    /**
    * 否是保障任务
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsPromiseTask")
    @Expose
    private Boolean IsPromiseTask;

    /**
    * 当前用户uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserUin")
    @Expose
    private String UserUin;

    /**
    * 主账号uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 项目id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 租户id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * 工作流id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 任务周期类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskCycle")
    @Expose
    private String TaskCycle;

    /**
    * 任务负责人名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskInChargeUin")
    @Expose
    private String TaskInChargeUin;

    /**
    * 任务负责人uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskInChargeName")
    @Expose
    private String TaskInChargeName;

    /**
    * 任务准入基准
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessBenchmark")
    @Expose
    private String AccessBenchmark;

    /**
    * 任务准入基准诊断信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessBenchmarkDesc")
    @Expose
    private String AccessBenchmarkDesc;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 变更记录id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 变更记录id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 变更记录id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 变更记录id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 基线id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BaselineId 基线id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBaselineId() {
        return this.BaselineId;
    }

    /**
     * Set 基线id
注意：此字段可能返回 null，表示取不到有效值。
     * @param BaselineId 基线id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBaselineId(Long BaselineId) {
        this.BaselineId = BaselineId;
    }

    /**
     * Get 任务id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskName 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskName 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 任务运行平均时间/单位秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EstimatedCostTime 任务运行平均时间/单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEstimatedCostTime() {
        return this.EstimatedCostTime;
    }

    /**
     * Set 任务运行平均时间/单位秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param EstimatedCostTime 任务运行平均时间/单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEstimatedCostTime(Long EstimatedCostTime) {
        this.EstimatedCostTime = EstimatedCostTime;
    }

    /**
     * Get 上游实例id,多个实例用,分开
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpstreamTaskIds 上游实例id,多个实例用,分开
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StringListNode getUpstreamTaskIds() {
        return this.UpstreamTaskIds;
    }

    /**
     * Set 上游实例id,多个实例用,分开
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpstreamTaskIds 上游实例id,多个实例用,分开
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpstreamTaskIds(StringListNode UpstreamTaskIds) {
        this.UpstreamTaskIds = UpstreamTaskIds;
    }

    /**
     * Get 下游实例id,多个实例用,分开
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DownstreamTaskIds 下游实例id,多个实例用,分开
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StringListNode getDownstreamTaskIds() {
        return this.DownstreamTaskIds;
    }

    /**
     * Set 下游实例id,多个实例用,分开
注意：此字段可能返回 null，表示取不到有效值。
     * @param DownstreamTaskIds 下游实例id,多个实例用,分开
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDownstreamTaskIds(StringListNode DownstreamTaskIds) {
        this.DownstreamTaskIds = DownstreamTaskIds;
    }

    /**
     * Get 否是保障任务
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsPromiseTask 否是保障任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsPromiseTask() {
        return this.IsPromiseTask;
    }

    /**
     * Set 否是保障任务
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsPromiseTask 否是保障任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsPromiseTask(Boolean IsPromiseTask) {
        this.IsPromiseTask = IsPromiseTask;
    }

    /**
     * Get 当前用户uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserUin 当前用户uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserUin() {
        return this.UserUin;
    }

    /**
     * Set 当前用户uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserUin 当前用户uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserUin(String UserUin) {
        this.UserUin = UserUin;
    }

    /**
     * Get 主账号uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerUin 主账号uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 主账号uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerUin 主账号uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 项目id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 项目id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 项目id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 租户id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId 租户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 租户id
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId 租户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 工作流名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowName 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowName 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get 工作流id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowId 工作流id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 工作流id
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowId 工作流id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get 任务周期类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskCycle 任务周期类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskCycle() {
        return this.TaskCycle;
    }

    /**
     * Set 任务周期类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskCycle 任务周期类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskCycle(String TaskCycle) {
        this.TaskCycle = TaskCycle;
    }

    /**
     * Get 任务负责人名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskInChargeUin 任务负责人名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskInChargeUin() {
        return this.TaskInChargeUin;
    }

    /**
     * Set 任务负责人名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskInChargeUin 任务负责人名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskInChargeUin(String TaskInChargeUin) {
        this.TaskInChargeUin = TaskInChargeUin;
    }

    /**
     * Get 任务负责人uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskInChargeName 任务负责人uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskInChargeName() {
        return this.TaskInChargeName;
    }

    /**
     * Set 任务负责人uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskInChargeName 任务负责人uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskInChargeName(String TaskInChargeName) {
        this.TaskInChargeName = TaskInChargeName;
    }

    /**
     * Get 任务准入基准
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccessBenchmark 任务准入基准
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccessBenchmark() {
        return this.AccessBenchmark;
    }

    /**
     * Set 任务准入基准
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessBenchmark 任务准入基准
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccessBenchmark(String AccessBenchmark) {
        this.AccessBenchmark = AccessBenchmark;
    }

    /**
     * Get 任务准入基准诊断信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccessBenchmarkDesc 任务准入基准诊断信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccessBenchmarkDesc() {
        return this.AccessBenchmarkDesc;
    }

    /**
     * Set 任务准入基准诊断信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessBenchmarkDesc 任务准入基准诊断信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccessBenchmarkDesc(String AccessBenchmarkDesc) {
        this.AccessBenchmarkDesc = AccessBenchmarkDesc;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public BaselineTaskDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineTaskDto(BaselineTaskDto source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.BaselineId != null) {
            this.BaselineId = new Long(source.BaselineId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.EstimatedCostTime != null) {
            this.EstimatedCostTime = new Long(source.EstimatedCostTime);
        }
        if (source.UpstreamTaskIds != null) {
            this.UpstreamTaskIds = new StringListNode(source.UpstreamTaskIds);
        }
        if (source.DownstreamTaskIds != null) {
            this.DownstreamTaskIds = new StringListNode(source.DownstreamTaskIds);
        }
        if (source.IsPromiseTask != null) {
            this.IsPromiseTask = new Boolean(source.IsPromiseTask);
        }
        if (source.UserUin != null) {
            this.UserUin = new String(source.UserUin);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.TaskCycle != null) {
            this.TaskCycle = new String(source.TaskCycle);
        }
        if (source.TaskInChargeUin != null) {
            this.TaskInChargeUin = new String(source.TaskInChargeUin);
        }
        if (source.TaskInChargeName != null) {
            this.TaskInChargeName = new String(source.TaskInChargeName);
        }
        if (source.AccessBenchmark != null) {
            this.AccessBenchmark = new String(source.AccessBenchmark);
        }
        if (source.AccessBenchmarkDesc != null) {
            this.AccessBenchmarkDesc = new String(source.AccessBenchmarkDesc);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "BaselineId", this.BaselineId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "EstimatedCostTime", this.EstimatedCostTime);
        this.setParamObj(map, prefix + "UpstreamTaskIds.", this.UpstreamTaskIds);
        this.setParamObj(map, prefix + "DownstreamTaskIds.", this.DownstreamTaskIds);
        this.setParamSimple(map, prefix + "IsPromiseTask", this.IsPromiseTask);
        this.setParamSimple(map, prefix + "UserUin", this.UserUin);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "TaskCycle", this.TaskCycle);
        this.setParamSimple(map, prefix + "TaskInChargeUin", this.TaskInChargeUin);
        this.setParamSimple(map, prefix + "TaskInChargeName", this.TaskInChargeName);
        this.setParamSimple(map, prefix + "AccessBenchmark", this.AccessBenchmark);
        this.setParamSimple(map, prefix + "AccessBenchmarkDesc", this.AccessBenchmarkDesc);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

