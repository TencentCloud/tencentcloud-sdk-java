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

public class ManualTriggerRecordOpsDto extends AbstractModel {

    /**
    * <p>运行触发记录ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerId")
    @Expose
    private String TriggerId;

    /**
    * <p>用户提交运行时配置的运行名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerName")
    @Expose
    private String TriggerName;

    /**
    * <p>用户提交运行的备注</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>数据时间列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatetimeList")
    @Expose
    private String [] DatetimeList;

    /**
    * <p>任务数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskCnt")
    @Expose
    private Long TaskCnt;

    /**
    * <p>实例数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceCnt")
    @Expose
    private Long InstanceCnt;

    /**
    * <p>已完成的实例数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FinishedInstanceCnt")
    @Expose
    private Long FinishedInstanceCnt;

    /**
    * <p>成功的实例数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuccessInstanceCnt")
    @Expose
    private Long SuccessInstanceCnt;

    /**
    * <p>记录运行状态<br> INIT, RUNNING, FINISHED</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>用户提交运行时的入参，主要用于前端反显和记录原始提交信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerParams")
    @Expose
    private String TriggerParams;

    /**
    * <p>用户主账号ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * <p>用户ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserUin")
    @Expose
    private String UserUin;

    /**
    * <p>用户展示名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>租户ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TenantId")
    @Expose
    private String TenantId;

    /**
    * <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>数据实例时间的时区</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScheduleTimeZone")
    @Expose
    private String ScheduleTimeZone;

    /**
    * <p>时间类型，DATA_TIME：数据时间、SCHEDULE_TIME：计划调度时间, 为空时会被当成DATA_TIME处理</p>
    */
    @SerializedName("TimeType")
    @Expose
    private String TimeType;

    /**
    * <p>触发类型</p><p>枚举值：</p><ul><li>SUB_PROCESS_TRIGGER： 由嵌套工作流 SP 任务触发</li><li>SUB_PROCESS_MAKEUP： 由嵌套工作流 SP 任务补录触发</li><li>MANUAL_RUN_BY_USER： 手动触发</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerSource")
    @Expose
    private String TriggerSource;

    /**
    * <p>触发实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerSourceId")
    @Expose
    private String TriggerSourceId;

    /**
    * <p>父嵌套工作流任务 ID。仅 <code>triggerSource</code> 以 <code>SUB_PROCESS_</code> 开头时有值</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentSpTaskId")
    @Expose
    private String ParentSpTaskId;

    /**
    * <p>父嵌套工作流任务实例名称（即任务名称）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentSpInstanceName")
    @Expose
    private String ParentSpInstanceName;

    /**
    * <p>父嵌套工作流任务实例数据时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentSpInstanceDataTime")
    @Expose
    private String ParentSpInstanceDataTime;

    /**
    * <p>数据时间列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScheduleTimeList")
    @Expose
    private String [] ScheduleTimeList;

    /**
     * Get <p>运行触发记录ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerId <p>运行触发记录ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTriggerId() {
        return this.TriggerId;
    }

    /**
     * Set <p>运行触发记录ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerId <p>运行触发记录ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerId(String TriggerId) {
        this.TriggerId = TriggerId;
    }

    /**
     * Get <p>用户提交运行时配置的运行名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerName <p>用户提交运行时配置的运行名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTriggerName() {
        return this.TriggerName;
    }

    /**
     * Set <p>用户提交运行时配置的运行名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerName <p>用户提交运行时配置的运行名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerName(String TriggerName) {
        this.TriggerName = TriggerName;
    }

    /**
     * Get <p>用户提交运行的备注</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark <p>用户提交运行的备注</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>用户提交运行的备注</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark <p>用户提交运行的备注</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>数据时间列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatetimeList <p>数据时间列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDatetimeList() {
        return this.DatetimeList;
    }

    /**
     * Set <p>数据时间列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatetimeList <p>数据时间列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatetimeList(String [] DatetimeList) {
        this.DatetimeList = DatetimeList;
    }

    /**
     * Get <p>任务数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskCnt <p>任务数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskCnt() {
        return this.TaskCnt;
    }

    /**
     * Set <p>任务数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskCnt <p>任务数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskCnt(Long TaskCnt) {
        this.TaskCnt = TaskCnt;
    }

    /**
     * Get <p>实例数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceCnt <p>实例数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInstanceCnt() {
        return this.InstanceCnt;
    }

    /**
     * Set <p>实例数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceCnt <p>实例数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceCnt(Long InstanceCnt) {
        this.InstanceCnt = InstanceCnt;
    }

    /**
     * Get <p>已完成的实例数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FinishedInstanceCnt <p>已完成的实例数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFinishedInstanceCnt() {
        return this.FinishedInstanceCnt;
    }

    /**
     * Set <p>已完成的实例数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FinishedInstanceCnt <p>已完成的实例数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFinishedInstanceCnt(Long FinishedInstanceCnt) {
        this.FinishedInstanceCnt = FinishedInstanceCnt;
    }

    /**
     * Get <p>成功的实例数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuccessInstanceCnt <p>成功的实例数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSuccessInstanceCnt() {
        return this.SuccessInstanceCnt;
    }

    /**
     * Set <p>成功的实例数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuccessInstanceCnt <p>成功的实例数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuccessInstanceCnt(Long SuccessInstanceCnt) {
        this.SuccessInstanceCnt = SuccessInstanceCnt;
    }

    /**
     * Get <p>记录运行状态<br> INIT, RUNNING, FINISHED</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>记录运行状态<br> INIT, RUNNING, FINISHED</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>记录运行状态<br> INIT, RUNNING, FINISHED</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>记录运行状态<br> INIT, RUNNING, FINISHED</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>用户提交运行时的入参，主要用于前端反显和记录原始提交信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerParams <p>用户提交运行时的入参，主要用于前端反显和记录原始提交信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTriggerParams() {
        return this.TriggerParams;
    }

    /**
     * Set <p>用户提交运行时的入参，主要用于前端反显和记录原始提交信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerParams <p>用户提交运行时的入参，主要用于前端反显和记录原始提交信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerParams(String TriggerParams) {
        this.TriggerParams = TriggerParams;
    }

    /**
     * Get <p>用户主账号ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerUin <p>用户主账号ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>用户主账号ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerUin <p>用户主账号ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get <p>用户ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserUin <p>用户ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserUin() {
        return this.UserUin;
    }

    /**
     * Set <p>用户ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserUin <p>用户ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserUin(String UserUin) {
        this.UserUin = UserUin;
    }

    /**
     * Get <p>用户展示名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserName <p>用户展示名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>用户展示名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserName <p>用户展示名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>租户ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TenantId <p>租户ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTenantId() {
        return this.TenantId;
    }

    /**
     * Set <p>租户ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TenantId <p>租户ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTenantId(String TenantId) {
        this.TenantId = TenantId;
    }

    /**
     * Get <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>数据实例时间的时区</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScheduleTimeZone <p>数据实例时间的时区</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScheduleTimeZone() {
        return this.ScheduleTimeZone;
    }

    /**
     * Set <p>数据实例时间的时区</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScheduleTimeZone <p>数据实例时间的时区</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheduleTimeZone(String ScheduleTimeZone) {
        this.ScheduleTimeZone = ScheduleTimeZone;
    }

    /**
     * Get <p>时间类型，DATA_TIME：数据时间、SCHEDULE_TIME：计划调度时间, 为空时会被当成DATA_TIME处理</p> 
     * @return TimeType <p>时间类型，DATA_TIME：数据时间、SCHEDULE_TIME：计划调度时间, 为空时会被当成DATA_TIME处理</p>
     */
    public String getTimeType() {
        return this.TimeType;
    }

    /**
     * Set <p>时间类型，DATA_TIME：数据时间、SCHEDULE_TIME：计划调度时间, 为空时会被当成DATA_TIME处理</p>
     * @param TimeType <p>时间类型，DATA_TIME：数据时间、SCHEDULE_TIME：计划调度时间, 为空时会被当成DATA_TIME处理</p>
     */
    public void setTimeType(String TimeType) {
        this.TimeType = TimeType;
    }

    /**
     * Get <p>触发类型</p><p>枚举值：</p><ul><li>SUB_PROCESS_TRIGGER： 由嵌套工作流 SP 任务触发</li><li>SUB_PROCESS_MAKEUP： 由嵌套工作流 SP 任务补录触发</li><li>MANUAL_RUN_BY_USER： 手动触发</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerSource <p>触发类型</p><p>枚举值：</p><ul><li>SUB_PROCESS_TRIGGER： 由嵌套工作流 SP 任务触发</li><li>SUB_PROCESS_MAKEUP： 由嵌套工作流 SP 任务补录触发</li><li>MANUAL_RUN_BY_USER： 手动触发</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTriggerSource() {
        return this.TriggerSource;
    }

    /**
     * Set <p>触发类型</p><p>枚举值：</p><ul><li>SUB_PROCESS_TRIGGER： 由嵌套工作流 SP 任务触发</li><li>SUB_PROCESS_MAKEUP： 由嵌套工作流 SP 任务补录触发</li><li>MANUAL_RUN_BY_USER： 手动触发</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerSource <p>触发类型</p><p>枚举值：</p><ul><li>SUB_PROCESS_TRIGGER： 由嵌套工作流 SP 任务触发</li><li>SUB_PROCESS_MAKEUP： 由嵌套工作流 SP 任务补录触发</li><li>MANUAL_RUN_BY_USER： 手动触发</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerSource(String TriggerSource) {
        this.TriggerSource = TriggerSource;
    }

    /**
     * Get <p>触发实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerSourceId <p>触发实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTriggerSourceId() {
        return this.TriggerSourceId;
    }

    /**
     * Set <p>触发实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerSourceId <p>触发实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerSourceId(String TriggerSourceId) {
        this.TriggerSourceId = TriggerSourceId;
    }

    /**
     * Get <p>父嵌套工作流任务 ID。仅 <code>triggerSource</code> 以 <code>SUB_PROCESS_</code> 开头时有值</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentSpTaskId <p>父嵌套工作流任务 ID。仅 <code>triggerSource</code> 以 <code>SUB_PROCESS_</code> 开头时有值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParentSpTaskId() {
        return this.ParentSpTaskId;
    }

    /**
     * Set <p>父嵌套工作流任务 ID。仅 <code>triggerSource</code> 以 <code>SUB_PROCESS_</code> 开头时有值</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentSpTaskId <p>父嵌套工作流任务 ID。仅 <code>triggerSource</code> 以 <code>SUB_PROCESS_</code> 开头时有值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentSpTaskId(String ParentSpTaskId) {
        this.ParentSpTaskId = ParentSpTaskId;
    }

    /**
     * Get <p>父嵌套工作流任务实例名称（即任务名称）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentSpInstanceName <p>父嵌套工作流任务实例名称（即任务名称）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParentSpInstanceName() {
        return this.ParentSpInstanceName;
    }

    /**
     * Set <p>父嵌套工作流任务实例名称（即任务名称）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentSpInstanceName <p>父嵌套工作流任务实例名称（即任务名称）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentSpInstanceName(String ParentSpInstanceName) {
        this.ParentSpInstanceName = ParentSpInstanceName;
    }

    /**
     * Get <p>父嵌套工作流任务实例数据时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentSpInstanceDataTime <p>父嵌套工作流任务实例数据时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParentSpInstanceDataTime() {
        return this.ParentSpInstanceDataTime;
    }

    /**
     * Set <p>父嵌套工作流任务实例数据时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentSpInstanceDataTime <p>父嵌套工作流任务实例数据时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentSpInstanceDataTime(String ParentSpInstanceDataTime) {
        this.ParentSpInstanceDataTime = ParentSpInstanceDataTime;
    }

    /**
     * Get <p>数据时间列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScheduleTimeList <p>数据时间列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getScheduleTimeList() {
        return this.ScheduleTimeList;
    }

    /**
     * Set <p>数据时间列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScheduleTimeList <p>数据时间列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheduleTimeList(String [] ScheduleTimeList) {
        this.ScheduleTimeList = ScheduleTimeList;
    }

    public ManualTriggerRecordOpsDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManualTriggerRecordOpsDto(ManualTriggerRecordOpsDto source) {
        if (source.TriggerId != null) {
            this.TriggerId = new String(source.TriggerId);
        }
        if (source.TriggerName != null) {
            this.TriggerName = new String(source.TriggerName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.DatetimeList != null) {
            this.DatetimeList = new String[source.DatetimeList.length];
            for (int i = 0; i < source.DatetimeList.length; i++) {
                this.DatetimeList[i] = new String(source.DatetimeList[i]);
            }
        }
        if (source.TaskCnt != null) {
            this.TaskCnt = new Long(source.TaskCnt);
        }
        if (source.InstanceCnt != null) {
            this.InstanceCnt = new Long(source.InstanceCnt);
        }
        if (source.FinishedInstanceCnt != null) {
            this.FinishedInstanceCnt = new Long(source.FinishedInstanceCnt);
        }
        if (source.SuccessInstanceCnt != null) {
            this.SuccessInstanceCnt = new Long(source.SuccessInstanceCnt);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TriggerParams != null) {
            this.TriggerParams = new String(source.TriggerParams);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.UserUin != null) {
            this.UserUin = new String(source.UserUin);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.TenantId != null) {
            this.TenantId = new String(source.TenantId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ScheduleTimeZone != null) {
            this.ScheduleTimeZone = new String(source.ScheduleTimeZone);
        }
        if (source.TimeType != null) {
            this.TimeType = new String(source.TimeType);
        }
        if (source.TriggerSource != null) {
            this.TriggerSource = new String(source.TriggerSource);
        }
        if (source.TriggerSourceId != null) {
            this.TriggerSourceId = new String(source.TriggerSourceId);
        }
        if (source.ParentSpTaskId != null) {
            this.ParentSpTaskId = new String(source.ParentSpTaskId);
        }
        if (source.ParentSpInstanceName != null) {
            this.ParentSpInstanceName = new String(source.ParentSpInstanceName);
        }
        if (source.ParentSpInstanceDataTime != null) {
            this.ParentSpInstanceDataTime = new String(source.ParentSpInstanceDataTime);
        }
        if (source.ScheduleTimeList != null) {
            this.ScheduleTimeList = new String[source.ScheduleTimeList.length];
            for (int i = 0; i < source.ScheduleTimeList.length; i++) {
                this.ScheduleTimeList[i] = new String(source.ScheduleTimeList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TriggerId", this.TriggerId);
        this.setParamSimple(map, prefix + "TriggerName", this.TriggerName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArraySimple(map, prefix + "DatetimeList.", this.DatetimeList);
        this.setParamSimple(map, prefix + "TaskCnt", this.TaskCnt);
        this.setParamSimple(map, prefix + "InstanceCnt", this.InstanceCnt);
        this.setParamSimple(map, prefix + "FinishedInstanceCnt", this.FinishedInstanceCnt);
        this.setParamSimple(map, prefix + "SuccessInstanceCnt", this.SuccessInstanceCnt);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TriggerParams", this.TriggerParams);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "UserUin", this.UserUin);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "TenantId", this.TenantId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ScheduleTimeZone", this.ScheduleTimeZone);
        this.setParamSimple(map, prefix + "TimeType", this.TimeType);
        this.setParamSimple(map, prefix + "TriggerSource", this.TriggerSource);
        this.setParamSimple(map, prefix + "TriggerSourceId", this.TriggerSourceId);
        this.setParamSimple(map, prefix + "ParentSpTaskId", this.ParentSpTaskId);
        this.setParamSimple(map, prefix + "ParentSpInstanceName", this.ParentSpInstanceName);
        this.setParamSimple(map, prefix + "ParentSpInstanceDataTime", this.ParentSpInstanceDataTime);
        this.setParamArraySimple(map, prefix + "ScheduleTimeList.", this.ScheduleTimeList);

    }
}

