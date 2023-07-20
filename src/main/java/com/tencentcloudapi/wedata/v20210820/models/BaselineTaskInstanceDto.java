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

public class BaselineTaskInstanceDto extends AbstractModel{

    /**
    * 任务实例变更记录id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 基线实例id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BaselineInstanceId")
    @Expose
    private Long BaselineInstanceId;

    /**
    * 基线周期, D: 天 / H: 小时
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BaselineType")
    @Expose
    private String BaselineType;

    /**
    * 数据时间/基线实例应该应该生成的时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BaselineDataTime")
    @Expose
    private String BaselineDataTime;

    /**
    * 上游实例id,多个实例用,分开.格式为taskId_curRunDate
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpstreamInstanceIds")
    @Expose
    private String UpstreamInstanceIds;

    /**
    * 下游实例id,多个实例用,分开.格式为taskId_curRunDate
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DownstreamInstanceIds")
    @Expose
    private String DownstreamInstanceIds;

    /**
    * 是否是保障任务的实例
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsPromiseTask")
    @Expose
    private Boolean IsPromiseTask;

    /**
    * 任务id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务实例的数据时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurRunDate")
    @Expose
    private String CurRunDate;

    /**
    * 任务名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 是否在关键路径上，1表示在，0表示不在
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InCriticalPath")
    @Expose
    private Long InCriticalPath;

    /**
    * 是否在DAG首层
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InFirstLevel")
    @Expose
    private Boolean InFirstLevel;

    /**
    * 实例预计耗时/单位秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EstimatedCostTime")
    @Expose
    private Long EstimatedCostTime;

    /**
    * 实例实际耗时/单位秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActualCostTime")
    @Expose
    private Long ActualCostTime;

    /**
    * 预计最晚开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestStartTime")
    @Expose
    private String LatestStartTime;

    /**
    * 实际开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActualStartTime")
    @Expose
    private String ActualStartTime;

    /**
    * 预计完成时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EstimatedEndTime")
    @Expose
    private String EstimatedEndTime;

    /**
    * 最晚完成时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestEndTime")
    @Expose
    private String LatestEndTime;

    /**
    * 实际完成时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActualEndTime")
    @Expose
    private String ActualEndTime;

    /**
    * 实例运行状态
WAITINT_TO_RUN:等待运行 / RUNNING: 正在运行 / COMPLETED: 执行成功 / FAILED: 执行失败
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskInstanceStatus")
    @Expose
    private String TaskInstanceStatus;

    /**
    * 项目id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 该基线由哪个机器处理
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShardKey")
    @Expose
    private String ShardKey;

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
    * 租户id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
     * Get 任务实例变更记录id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 任务实例变更记录id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 任务实例变更记录id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 任务实例变更记录id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 基线实例id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BaselineInstanceId 基线实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBaselineInstanceId() {
        return this.BaselineInstanceId;
    }

    /**
     * Set 基线实例id
注意：此字段可能返回 null，表示取不到有效值。
     * @param BaselineInstanceId 基线实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBaselineInstanceId(Long BaselineInstanceId) {
        this.BaselineInstanceId = BaselineInstanceId;
    }

    /**
     * Get 基线周期, D: 天 / H: 小时
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BaselineType 基线周期, D: 天 / H: 小时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBaselineType() {
        return this.BaselineType;
    }

    /**
     * Set 基线周期, D: 天 / H: 小时
注意：此字段可能返回 null，表示取不到有效值。
     * @param BaselineType 基线周期, D: 天 / H: 小时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBaselineType(String BaselineType) {
        this.BaselineType = BaselineType;
    }

    /**
     * Get 数据时间/基线实例应该应该生成的时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BaselineDataTime 数据时间/基线实例应该应该生成的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBaselineDataTime() {
        return this.BaselineDataTime;
    }

    /**
     * Set 数据时间/基线实例应该应该生成的时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param BaselineDataTime 数据时间/基线实例应该应该生成的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBaselineDataTime(String BaselineDataTime) {
        this.BaselineDataTime = BaselineDataTime;
    }

    /**
     * Get 上游实例id,多个实例用,分开.格式为taskId_curRunDate
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpstreamInstanceIds 上游实例id,多个实例用,分开.格式为taskId_curRunDate
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpstreamInstanceIds() {
        return this.UpstreamInstanceIds;
    }

    /**
     * Set 上游实例id,多个实例用,分开.格式为taskId_curRunDate
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpstreamInstanceIds 上游实例id,多个实例用,分开.格式为taskId_curRunDate
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpstreamInstanceIds(String UpstreamInstanceIds) {
        this.UpstreamInstanceIds = UpstreamInstanceIds;
    }

    /**
     * Get 下游实例id,多个实例用,分开.格式为taskId_curRunDate
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DownstreamInstanceIds 下游实例id,多个实例用,分开.格式为taskId_curRunDate
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDownstreamInstanceIds() {
        return this.DownstreamInstanceIds;
    }

    /**
     * Set 下游实例id,多个实例用,分开.格式为taskId_curRunDate
注意：此字段可能返回 null，表示取不到有效值。
     * @param DownstreamInstanceIds 下游实例id,多个实例用,分开.格式为taskId_curRunDate
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDownstreamInstanceIds(String DownstreamInstanceIds) {
        this.DownstreamInstanceIds = DownstreamInstanceIds;
    }

    /**
     * Get 是否是保障任务的实例
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsPromiseTask 是否是保障任务的实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsPromiseTask() {
        return this.IsPromiseTask;
    }

    /**
     * Set 是否是保障任务的实例
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsPromiseTask 是否是保障任务的实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsPromiseTask(Boolean IsPromiseTask) {
        this.IsPromiseTask = IsPromiseTask;
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
     * Get 任务实例的数据时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurRunDate 任务实例的数据时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCurRunDate() {
        return this.CurRunDate;
    }

    /**
     * Set 任务实例的数据时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurRunDate 任务实例的数据时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurRunDate(String CurRunDate) {
        this.CurRunDate = CurRunDate;
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
     * Get 是否在关键路径上，1表示在，0表示不在
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InCriticalPath 是否在关键路径上，1表示在，0表示不在
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInCriticalPath() {
        return this.InCriticalPath;
    }

    /**
     * Set 是否在关键路径上，1表示在，0表示不在
注意：此字段可能返回 null，表示取不到有效值。
     * @param InCriticalPath 是否在关键路径上，1表示在，0表示不在
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInCriticalPath(Long InCriticalPath) {
        this.InCriticalPath = InCriticalPath;
    }

    /**
     * Get 是否在DAG首层
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InFirstLevel 是否在DAG首层
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getInFirstLevel() {
        return this.InFirstLevel;
    }

    /**
     * Set 是否在DAG首层
注意：此字段可能返回 null，表示取不到有效值。
     * @param InFirstLevel 是否在DAG首层
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInFirstLevel(Boolean InFirstLevel) {
        this.InFirstLevel = InFirstLevel;
    }

    /**
     * Get 实例预计耗时/单位秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EstimatedCostTime 实例预计耗时/单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEstimatedCostTime() {
        return this.EstimatedCostTime;
    }

    /**
     * Set 实例预计耗时/单位秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param EstimatedCostTime 实例预计耗时/单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEstimatedCostTime(Long EstimatedCostTime) {
        this.EstimatedCostTime = EstimatedCostTime;
    }

    /**
     * Get 实例实际耗时/单位秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActualCostTime 实例实际耗时/单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getActualCostTime() {
        return this.ActualCostTime;
    }

    /**
     * Set 实例实际耗时/单位秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActualCostTime 实例实际耗时/单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActualCostTime(Long ActualCostTime) {
        this.ActualCostTime = ActualCostTime;
    }

    /**
     * Get 预计最晚开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestStartTime 预计最晚开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestStartTime() {
        return this.LatestStartTime;
    }

    /**
     * Set 预计最晚开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestStartTime 预计最晚开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestStartTime(String LatestStartTime) {
        this.LatestStartTime = LatestStartTime;
    }

    /**
     * Get 实际开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActualStartTime 实际开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getActualStartTime() {
        return this.ActualStartTime;
    }

    /**
     * Set 实际开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActualStartTime 实际开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActualStartTime(String ActualStartTime) {
        this.ActualStartTime = ActualStartTime;
    }

    /**
     * Get 预计完成时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EstimatedEndTime 预计完成时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEstimatedEndTime() {
        return this.EstimatedEndTime;
    }

    /**
     * Set 预计完成时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EstimatedEndTime 预计完成时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEstimatedEndTime(String EstimatedEndTime) {
        this.EstimatedEndTime = EstimatedEndTime;
    }

    /**
     * Get 最晚完成时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestEndTime 最晚完成时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestEndTime() {
        return this.LatestEndTime;
    }

    /**
     * Set 最晚完成时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestEndTime 最晚完成时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestEndTime(String LatestEndTime) {
        this.LatestEndTime = LatestEndTime;
    }

    /**
     * Get 实际完成时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActualEndTime 实际完成时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getActualEndTime() {
        return this.ActualEndTime;
    }

    /**
     * Set 实际完成时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActualEndTime 实际完成时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActualEndTime(String ActualEndTime) {
        this.ActualEndTime = ActualEndTime;
    }

    /**
     * Get 实例运行状态
WAITINT_TO_RUN:等待运行 / RUNNING: 正在运行 / COMPLETED: 执行成功 / FAILED: 执行失败
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskInstanceStatus 实例运行状态
WAITINT_TO_RUN:等待运行 / RUNNING: 正在运行 / COMPLETED: 执行成功 / FAILED: 执行失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskInstanceStatus() {
        return this.TaskInstanceStatus;
    }

    /**
     * Set 实例运行状态
WAITINT_TO_RUN:等待运行 / RUNNING: 正在运行 / COMPLETED: 执行成功 / FAILED: 执行失败
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskInstanceStatus 实例运行状态
WAITINT_TO_RUN:等待运行 / RUNNING: 正在运行 / COMPLETED: 执行成功 / FAILED: 执行失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskInstanceStatus(String TaskInstanceStatus) {
        this.TaskInstanceStatus = TaskInstanceStatus;
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
     * Get 该基线由哪个机器处理
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShardKey 该基线由哪个机器处理
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getShardKey() {
        return this.ShardKey;
    }

    /**
     * Set 该基线由哪个机器处理
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShardKey 该基线由哪个机器处理
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShardKey(String ShardKey) {
        this.ShardKey = ShardKey;
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

    public BaselineTaskInstanceDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineTaskInstanceDto(BaselineTaskInstanceDto source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.BaselineInstanceId != null) {
            this.BaselineInstanceId = new Long(source.BaselineInstanceId);
        }
        if (source.BaselineType != null) {
            this.BaselineType = new String(source.BaselineType);
        }
        if (source.BaselineDataTime != null) {
            this.BaselineDataTime = new String(source.BaselineDataTime);
        }
        if (source.UpstreamInstanceIds != null) {
            this.UpstreamInstanceIds = new String(source.UpstreamInstanceIds);
        }
        if (source.DownstreamInstanceIds != null) {
            this.DownstreamInstanceIds = new String(source.DownstreamInstanceIds);
        }
        if (source.IsPromiseTask != null) {
            this.IsPromiseTask = new Boolean(source.IsPromiseTask);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.CurRunDate != null) {
            this.CurRunDate = new String(source.CurRunDate);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.InCriticalPath != null) {
            this.InCriticalPath = new Long(source.InCriticalPath);
        }
        if (source.InFirstLevel != null) {
            this.InFirstLevel = new Boolean(source.InFirstLevel);
        }
        if (source.EstimatedCostTime != null) {
            this.EstimatedCostTime = new Long(source.EstimatedCostTime);
        }
        if (source.ActualCostTime != null) {
            this.ActualCostTime = new Long(source.ActualCostTime);
        }
        if (source.LatestStartTime != null) {
            this.LatestStartTime = new String(source.LatestStartTime);
        }
        if (source.ActualStartTime != null) {
            this.ActualStartTime = new String(source.ActualStartTime);
        }
        if (source.EstimatedEndTime != null) {
            this.EstimatedEndTime = new String(source.EstimatedEndTime);
        }
        if (source.LatestEndTime != null) {
            this.LatestEndTime = new String(source.LatestEndTime);
        }
        if (source.ActualEndTime != null) {
            this.ActualEndTime = new String(source.ActualEndTime);
        }
        if (source.TaskInstanceStatus != null) {
            this.TaskInstanceStatus = new String(source.TaskInstanceStatus);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ShardKey != null) {
            this.ShardKey = new String(source.ShardKey);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.UserUin != null) {
            this.UserUin = new String(source.UserUin);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "BaselineInstanceId", this.BaselineInstanceId);
        this.setParamSimple(map, prefix + "BaselineType", this.BaselineType);
        this.setParamSimple(map, prefix + "BaselineDataTime", this.BaselineDataTime);
        this.setParamSimple(map, prefix + "UpstreamInstanceIds", this.UpstreamInstanceIds);
        this.setParamSimple(map, prefix + "DownstreamInstanceIds", this.DownstreamInstanceIds);
        this.setParamSimple(map, prefix + "IsPromiseTask", this.IsPromiseTask);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "CurRunDate", this.CurRunDate);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "InCriticalPath", this.InCriticalPath);
        this.setParamSimple(map, prefix + "InFirstLevel", this.InFirstLevel);
        this.setParamSimple(map, prefix + "EstimatedCostTime", this.EstimatedCostTime);
        this.setParamSimple(map, prefix + "ActualCostTime", this.ActualCostTime);
        this.setParamSimple(map, prefix + "LatestStartTime", this.LatestStartTime);
        this.setParamSimple(map, prefix + "ActualStartTime", this.ActualStartTime);
        this.setParamSimple(map, prefix + "EstimatedEndTime", this.EstimatedEndTime);
        this.setParamSimple(map, prefix + "LatestEndTime", this.LatestEndTime);
        this.setParamSimple(map, prefix + "ActualEndTime", this.ActualEndTime);
        this.setParamSimple(map, prefix + "TaskInstanceStatus", this.TaskInstanceStatus);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ShardKey", this.ShardKey);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "UserUin", this.UserUin);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "AppId", this.AppId);

    }
}

