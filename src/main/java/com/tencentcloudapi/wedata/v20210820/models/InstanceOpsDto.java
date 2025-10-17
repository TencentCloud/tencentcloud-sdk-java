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

public class InstanceOpsDto extends AbstractModel {

    /**
    * 任务ID
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
    * 工作流ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * 负责人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InCharge")
    @Expose
    private String InCharge;

    /**
    * 周期类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * 数据时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurRunDate")
    @Expose
    private String CurRunDate;

    /**
    * 下一个数据时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NextCurDate")
    @Expose
    private String NextCurDate;

    /**
    * 运行优先级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunPriority")
    @Expose
    private Long RunPriority;

    /**
    * 尝试运行次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TryLimit")
    @Expose
    private Long TryLimit;

    /**
    * 当前运行次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tries")
    @Expose
    private Long Tries;

    /**
    * 重跑总次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalRunNum")
    @Expose
    private Long TotalRunNum;

    /**
    * 是否补录
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DoFlag")
    @Expose
    private Long DoFlag;

    /**
    * 是否是重跑
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RedoFlag")
    @Expose
    private Long RedoFlag;

    /**
    * 实例状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 运行节点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuntimeBroker")
    @Expose
    private String RuntimeBroker;

    /**
    * 失败的原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorDesc")
    @Expose
    private String ErrorDesc;

    /**
    * 任务类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskType")
    @Expose
    private TaskTypeOpsDto TaskType;

    /**
    * 依赖判断完成时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DependenceFulfillTime")
    @Expose
    private String DependenceFulfillTime;

    /**
    * 首次依赖判断通过时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FirstDependenceFulfillTime")
    @Expose
    private String FirstDependenceFulfillTime;

    /**
    * 首次启动时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FirstStartTime")
    @Expose
    private String FirstStartTime;

    /**
    * 开始启动时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 运行完成时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 耗费时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CostTime")
    @Expose
    private String CostTime;

    /**
    * 耗费时间(ms)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CostMillisecond")
    @Expose
    private Long CostMillisecond;

    /**
    * 最大运行耗时
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxCostTime")
    @Expose
    private Long MaxCostTime;

    /**
    * 最小运行耗时
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MinCostTime")
    @Expose
    private Long MinCostTime;

    /**
    * 平均运行耗时
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AvgCostTime")
    @Expose
    private Float AvgCostTime;

    /**
    * 最近日志
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastLog")
    @Expose
    private String LastLog;

    /**
    * 调度时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchedulerDateTime")
    @Expose
    private String SchedulerDateTime;

    /**
    * 上次调度时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastSchedulerDateTime")
    @Expose
    private String LastSchedulerDateTime;

    /**
    * 最后更新事件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastUpdate")
    @Expose
    private String LastUpdate;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 分支，依赖关系 and、or
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DependencyRel")
    @Expose
    private String DependencyRel;

    /**
    * 执行空间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionSpace")
    @Expose
    private String ExecutionSpace;

    /**
    * 忽略事件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IgnoreEvent")
    @Expose
    private Boolean IgnoreEvent;

    /**
    * 虚拟任务实例
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VirtualFlag")
    @Expose
    private Boolean VirtualFlag;

    /**
    * 文件夹ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * 文件夹名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FolderName")
    @Expose
    private String FolderName;

    /**
    * 递归实例信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SonList")
    @Expose
    private String SonList;

    /**
    * 产品业务名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 资源组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroup")
    @Expose
    private String ResourceGroup;

    /**
    * 资源组指定执行节点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceInstanceId")
    @Expose
    private String ResourceInstanceId;

    /**
    * 资源队列
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("YarnQueue")
    @Expose
    private String YarnQueue;

    /**
    * 调度计划
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchedulerDesc")
    @Expose
    private String SchedulerDesc;

    /**
    * 最近提交时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FirstSubmitTime")
    @Expose
    private String FirstSubmitTime;

    /**
    * 首次执行时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FirstRunTime")
    @Expose
    private String FirstRunTime;

    /**
    * 项目ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 项目标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectIdent")
    @Expose
    private String ProjectIdent;

    /**
    * 项目名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 租户id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TenantId")
    @Expose
    private String TenantId;

    /**
    * 实例标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceKey")
    @Expose
    private String InstanceKey;

    /**
    * 资源组id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutorGroupId")
    @Expose
    private String ExecutorGroupId;

    /**
    * 资源组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutorGroupName")
    @Expose
    private String ExecutorGroupName;

    /**
    * 关联实例信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RelatedInstanceList")
    @Expose
    private InstanceOpsDto [] RelatedInstanceList;

    /**
    * 关联实例信息数量，不和RelatedInstanceList强关联。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RelatedInstanceSize")
    @Expose
    private Long RelatedInstanceSize;

    /**
    * ownerId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerId")
    @Expose
    private String OwnerId;

    /**
    * 用户id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 实例生命周期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceLifeCycleOpsDto")
    @Expose
    private InstanceLifeCycleOpsDto InstanceLifeCycleOpsDto;

    /**
    * 自动重试次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RetryAttempts")
    @Expose
    private Long RetryAttempts;

    /**
    * 紧急去除的依赖父实例列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeletedFatherList")
    @Expose
    private String [] DeletedFatherList;

    /**
    * 循环依赖关联的实例
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CirculateInstanceList")
    @Expose
    private InstanceOpsDto [] CirculateInstanceList;

    /**
    * 并发策略, 0: 等待并发, 1: kill自身
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConcurrentStrategy")
    @Expose
    private Long ConcurrentStrategy;

    /**
    * 调度运行方式, 0: 周期调度, 1: 空跑调度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScheduleRunType")
    @Expose
    private Long ScheduleRunType;

    /**
    * 允许重跑类型，ALL 表示无论实例运行成功还是失败都允许重跑，NONE表示无论成功或者失败都不允许重跑，FAILURE 表示只有运行失败才能重跑
    */
    @SerializedName("AllowRedoType")
    @Expose
    private String AllowRedoType;

    /**
    * 实例生命周期
    */
    @SerializedName("InstanceCycleType")
    @Expose
    private String InstanceCycleType;

    /**
    * 实例执行计划描述
    */
    @SerializedName("InstanceSchedulerDesc")
    @Expose
    private String InstanceSchedulerDesc;

    /**
     * Get 任务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 任务ID
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
     * Get 工作流ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowId 工作流ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 工作流ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowId 工作流ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
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
     * Get 负责人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InCharge 负责人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInCharge() {
        return this.InCharge;
    }

    /**
     * Set 负责人
注意：此字段可能返回 null，表示取不到有效值。
     * @param InCharge 负责人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInCharge(String InCharge) {
        this.InCharge = InCharge;
    }

    /**
     * Get 周期类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CycleType 周期类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCycleType() {
        return this.CycleType;
    }

    /**
     * Set 周期类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param CycleType 周期类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCycleType(String CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get 数据时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurRunDate 数据时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCurRunDate() {
        return this.CurRunDate;
    }

    /**
     * Set 数据时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurRunDate 数据时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurRunDate(String CurRunDate) {
        this.CurRunDate = CurRunDate;
    }

    /**
     * Get 下一个数据时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NextCurDate 下一个数据时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNextCurDate() {
        return this.NextCurDate;
    }

    /**
     * Set 下一个数据时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param NextCurDate 下一个数据时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNextCurDate(String NextCurDate) {
        this.NextCurDate = NextCurDate;
    }

    /**
     * Get 运行优先级
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunPriority 运行优先级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRunPriority() {
        return this.RunPriority;
    }

    /**
     * Set 运行优先级
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunPriority 运行优先级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunPriority(Long RunPriority) {
        this.RunPriority = RunPriority;
    }

    /**
     * Get 尝试运行次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TryLimit 尝试运行次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTryLimit() {
        return this.TryLimit;
    }

    /**
     * Set 尝试运行次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TryLimit 尝试运行次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTryLimit(Long TryLimit) {
        this.TryLimit = TryLimit;
    }

    /**
     * Get 当前运行次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tries 当前运行次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTries() {
        return this.Tries;
    }

    /**
     * Set 当前运行次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tries 当前运行次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTries(Long Tries) {
        this.Tries = Tries;
    }

    /**
     * Get 重跑总次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalRunNum 重跑总次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalRunNum() {
        return this.TotalRunNum;
    }

    /**
     * Set 重跑总次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalRunNum 重跑总次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalRunNum(Long TotalRunNum) {
        this.TotalRunNum = TotalRunNum;
    }

    /**
     * Get 是否补录
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DoFlag 是否补录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDoFlag() {
        return this.DoFlag;
    }

    /**
     * Set 是否补录
注意：此字段可能返回 null，表示取不到有效值。
     * @param DoFlag 是否补录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDoFlag(Long DoFlag) {
        this.DoFlag = DoFlag;
    }

    /**
     * Get 是否是重跑
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RedoFlag 是否是重跑
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRedoFlag() {
        return this.RedoFlag;
    }

    /**
     * Set 是否是重跑
注意：此字段可能返回 null，表示取不到有效值。
     * @param RedoFlag 是否是重跑
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRedoFlag(Long RedoFlag) {
        this.RedoFlag = RedoFlag;
    }

    /**
     * Get 实例状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return State 实例状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 实例状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param State 实例状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 运行节点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuntimeBroker 运行节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuntimeBroker() {
        return this.RuntimeBroker;
    }

    /**
     * Set 运行节点
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuntimeBroker 运行节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuntimeBroker(String RuntimeBroker) {
        this.RuntimeBroker = RuntimeBroker;
    }

    /**
     * Get 失败的原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorDesc 失败的原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorDesc() {
        return this.ErrorDesc;
    }

    /**
     * Set 失败的原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorDesc 失败的原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorDesc(String ErrorDesc) {
        this.ErrorDesc = ErrorDesc;
    }

    /**
     * Get 任务类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskType 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskTypeOpsDto getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskType 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskType(TaskTypeOpsDto TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 依赖判断完成时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DependenceFulfillTime 依赖判断完成时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDependenceFulfillTime() {
        return this.DependenceFulfillTime;
    }

    /**
     * Set 依赖判断完成时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param DependenceFulfillTime 依赖判断完成时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDependenceFulfillTime(String DependenceFulfillTime) {
        this.DependenceFulfillTime = DependenceFulfillTime;
    }

    /**
     * Get 首次依赖判断通过时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FirstDependenceFulfillTime 首次依赖判断通过时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFirstDependenceFulfillTime() {
        return this.FirstDependenceFulfillTime;
    }

    /**
     * Set 首次依赖判断通过时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param FirstDependenceFulfillTime 首次依赖判断通过时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFirstDependenceFulfillTime(String FirstDependenceFulfillTime) {
        this.FirstDependenceFulfillTime = FirstDependenceFulfillTime;
    }

    /**
     * Get 首次启动时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FirstStartTime 首次启动时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFirstStartTime() {
        return this.FirstStartTime;
    }

    /**
     * Set 首次启动时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param FirstStartTime 首次启动时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFirstStartTime(String FirstStartTime) {
        this.FirstStartTime = FirstStartTime;
    }

    /**
     * Get 开始启动时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 开始启动时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始启动时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 开始启动时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 运行完成时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 运行完成时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 运行完成时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 运行完成时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 耗费时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CostTime 耗费时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCostTime() {
        return this.CostTime;
    }

    /**
     * Set 耗费时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CostTime 耗费时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCostTime(String CostTime) {
        this.CostTime = CostTime;
    }

    /**
     * Get 耗费时间(ms)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CostMillisecond 耗费时间(ms)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCostMillisecond() {
        return this.CostMillisecond;
    }

    /**
     * Set 耗费时间(ms)
注意：此字段可能返回 null，表示取不到有效值。
     * @param CostMillisecond 耗费时间(ms)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCostMillisecond(Long CostMillisecond) {
        this.CostMillisecond = CostMillisecond;
    }

    /**
     * Get 最大运行耗时
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxCostTime 最大运行耗时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxCostTime() {
        return this.MaxCostTime;
    }

    /**
     * Set 最大运行耗时
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxCostTime 最大运行耗时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxCostTime(Long MaxCostTime) {
        this.MaxCostTime = MaxCostTime;
    }

    /**
     * Get 最小运行耗时
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MinCostTime 最小运行耗时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMinCostTime() {
        return this.MinCostTime;
    }

    /**
     * Set 最小运行耗时
注意：此字段可能返回 null，表示取不到有效值。
     * @param MinCostTime 最小运行耗时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMinCostTime(Long MinCostTime) {
        this.MinCostTime = MinCostTime;
    }

    /**
     * Get 平均运行耗时
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AvgCostTime 平均运行耗时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getAvgCostTime() {
        return this.AvgCostTime;
    }

    /**
     * Set 平均运行耗时
注意：此字段可能返回 null，表示取不到有效值。
     * @param AvgCostTime 平均运行耗时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAvgCostTime(Float AvgCostTime) {
        this.AvgCostTime = AvgCostTime;
    }

    /**
     * Get 最近日志
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastLog 最近日志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastLog() {
        return this.LastLog;
    }

    /**
     * Set 最近日志
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastLog 最近日志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastLog(String LastLog) {
        this.LastLog = LastLog;
    }

    /**
     * Get 调度时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchedulerDateTime 调度时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSchedulerDateTime() {
        return this.SchedulerDateTime;
    }

    /**
     * Set 调度时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchedulerDateTime 调度时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchedulerDateTime(String SchedulerDateTime) {
        this.SchedulerDateTime = SchedulerDateTime;
    }

    /**
     * Get 上次调度时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastSchedulerDateTime 上次调度时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastSchedulerDateTime() {
        return this.LastSchedulerDateTime;
    }

    /**
     * Set 上次调度时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastSchedulerDateTime 上次调度时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastSchedulerDateTime(String LastSchedulerDateTime) {
        this.LastSchedulerDateTime = LastSchedulerDateTime;
    }

    /**
     * Get 最后更新事件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastUpdate 最后更新事件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastUpdate() {
        return this.LastUpdate;
    }

    /**
     * Set 最后更新事件
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastUpdate 最后更新事件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastUpdate(String LastUpdate) {
        this.LastUpdate = LastUpdate;
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
     * Get 分支，依赖关系 and、or
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DependencyRel 分支，依赖关系 and、or
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDependencyRel() {
        return this.DependencyRel;
    }

    /**
     * Set 分支，依赖关系 and、or
注意：此字段可能返回 null，表示取不到有效值。
     * @param DependencyRel 分支，依赖关系 and、or
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDependencyRel(String DependencyRel) {
        this.DependencyRel = DependencyRel;
    }

    /**
     * Get 执行空间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionSpace 执行空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionSpace() {
        return this.ExecutionSpace;
    }

    /**
     * Set 执行空间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionSpace 执行空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionSpace(String ExecutionSpace) {
        this.ExecutionSpace = ExecutionSpace;
    }

    /**
     * Get 忽略事件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IgnoreEvent 忽略事件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIgnoreEvent() {
        return this.IgnoreEvent;
    }

    /**
     * Set 忽略事件
注意：此字段可能返回 null，表示取不到有效值。
     * @param IgnoreEvent 忽略事件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIgnoreEvent(Boolean IgnoreEvent) {
        this.IgnoreEvent = IgnoreEvent;
    }

    /**
     * Get 虚拟任务实例
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VirtualFlag 虚拟任务实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getVirtualFlag() {
        return this.VirtualFlag;
    }

    /**
     * Set 虚拟任务实例
注意：此字段可能返回 null，表示取不到有效值。
     * @param VirtualFlag 虚拟任务实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVirtualFlag(Boolean VirtualFlag) {
        this.VirtualFlag = VirtualFlag;
    }

    /**
     * Get 文件夹ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FolderId 文件夹ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set 文件夹ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param FolderId 文件夹ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get 文件夹名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FolderName 文件夹名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFolderName() {
        return this.FolderName;
    }

    /**
     * Set 文件夹名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param FolderName 文件夹名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFolderName(String FolderName) {
        this.FolderName = FolderName;
    }

    /**
     * Get 递归实例信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SonList 递归实例信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSonList() {
        return this.SonList;
    }

    /**
     * Set 递归实例信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param SonList 递归实例信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSonList(String SonList) {
        this.SonList = SonList;
    }

    /**
     * Get 产品业务名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductName 产品业务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 产品业务名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductName 产品业务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 资源组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroup 资源组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroup() {
        return this.ResourceGroup;
    }

    /**
     * Set 资源组
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroup 资源组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroup(String ResourceGroup) {
        this.ResourceGroup = ResourceGroup;
    }

    /**
     * Get 资源组指定执行节点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceInstanceId 资源组指定执行节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceInstanceId() {
        return this.ResourceInstanceId;
    }

    /**
     * Set 资源组指定执行节点
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceInstanceId 资源组指定执行节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceInstanceId(String ResourceInstanceId) {
        this.ResourceInstanceId = ResourceInstanceId;
    }

    /**
     * Get 资源队列
注意：此字段可能返回 null，表示取不到有效值。 
     * @return YarnQueue 资源队列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getYarnQueue() {
        return this.YarnQueue;
    }

    /**
     * Set 资源队列
注意：此字段可能返回 null，表示取不到有效值。
     * @param YarnQueue 资源队列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setYarnQueue(String YarnQueue) {
        this.YarnQueue = YarnQueue;
    }

    /**
     * Get 调度计划
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchedulerDesc 调度计划
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSchedulerDesc() {
        return this.SchedulerDesc;
    }

    /**
     * Set 调度计划
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchedulerDesc 调度计划
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchedulerDesc(String SchedulerDesc) {
        this.SchedulerDesc = SchedulerDesc;
    }

    /**
     * Get 最近提交时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FirstSubmitTime 最近提交时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFirstSubmitTime() {
        return this.FirstSubmitTime;
    }

    /**
     * Set 最近提交时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param FirstSubmitTime 最近提交时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFirstSubmitTime(String FirstSubmitTime) {
        this.FirstSubmitTime = FirstSubmitTime;
    }

    /**
     * Get 首次执行时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FirstRunTime 首次执行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFirstRunTime() {
        return this.FirstRunTime;
    }

    /**
     * Set 首次执行时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param FirstRunTime 首次执行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFirstRunTime(String FirstRunTime) {
        this.FirstRunTime = FirstRunTime;
    }

    /**
     * Get 项目ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 项目标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectIdent 项目标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectIdent() {
        return this.ProjectIdent;
    }

    /**
     * Set 项目标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectIdent 项目标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectIdent(String ProjectIdent) {
        this.ProjectIdent = ProjectIdent;
    }

    /**
     * Get 项目名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectName 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectName 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 租户id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TenantId 租户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTenantId() {
        return this.TenantId;
    }

    /**
     * Set 租户id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TenantId 租户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTenantId(String TenantId) {
        this.TenantId = TenantId;
    }

    /**
     * Get 实例标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceKey 实例标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceKey() {
        return this.InstanceKey;
    }

    /**
     * Set 实例标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceKey 实例标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceKey(String InstanceKey) {
        this.InstanceKey = InstanceKey;
    }

    /**
     * Get 资源组id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutorGroupId 资源组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutorGroupId() {
        return this.ExecutorGroupId;
    }

    /**
     * Set 资源组id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutorGroupId 资源组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutorGroupId(String ExecutorGroupId) {
        this.ExecutorGroupId = ExecutorGroupId;
    }

    /**
     * Get 资源组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutorGroupName 资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutorGroupName() {
        return this.ExecutorGroupName;
    }

    /**
     * Set 资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutorGroupName 资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutorGroupName(String ExecutorGroupName) {
        this.ExecutorGroupName = ExecutorGroupName;
    }

    /**
     * Get 关联实例信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RelatedInstanceList 关联实例信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceOpsDto [] getRelatedInstanceList() {
        return this.RelatedInstanceList;
    }

    /**
     * Set 关联实例信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RelatedInstanceList 关联实例信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRelatedInstanceList(InstanceOpsDto [] RelatedInstanceList) {
        this.RelatedInstanceList = RelatedInstanceList;
    }

    /**
     * Get 关联实例信息数量，不和RelatedInstanceList强关联。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RelatedInstanceSize 关联实例信息数量，不和RelatedInstanceList强关联。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRelatedInstanceSize() {
        return this.RelatedInstanceSize;
    }

    /**
     * Set 关联实例信息数量，不和RelatedInstanceList强关联。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RelatedInstanceSize 关联实例信息数量，不和RelatedInstanceList强关联。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRelatedInstanceSize(Long RelatedInstanceSize) {
        this.RelatedInstanceSize = RelatedInstanceSize;
    }

    /**
     * Get ownerId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerId ownerId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerId() {
        return this.OwnerId;
    }

    /**
     * Set ownerId
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerId ownerId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerId(String OwnerId) {
        this.OwnerId = OwnerId;
    }

    /**
     * Get 用户id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserId 用户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户id
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserId 用户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 实例生命周期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceLifeCycleOpsDto 实例生命周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceLifeCycleOpsDto getInstanceLifeCycleOpsDto() {
        return this.InstanceLifeCycleOpsDto;
    }

    /**
     * Set 实例生命周期
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceLifeCycleOpsDto 实例生命周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceLifeCycleOpsDto(InstanceLifeCycleOpsDto InstanceLifeCycleOpsDto) {
        this.InstanceLifeCycleOpsDto = InstanceLifeCycleOpsDto;
    }

    /**
     * Get 自动重试次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RetryAttempts 自动重试次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRetryAttempts() {
        return this.RetryAttempts;
    }

    /**
     * Set 自动重试次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RetryAttempts 自动重试次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRetryAttempts(Long RetryAttempts) {
        this.RetryAttempts = RetryAttempts;
    }

    /**
     * Get 紧急去除的依赖父实例列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeletedFatherList 紧急去除的依赖父实例列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDeletedFatherList() {
        return this.DeletedFatherList;
    }

    /**
     * Set 紧急去除的依赖父实例列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeletedFatherList 紧急去除的依赖父实例列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeletedFatherList(String [] DeletedFatherList) {
        this.DeletedFatherList = DeletedFatherList;
    }

    /**
     * Get 循环依赖关联的实例
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CirculateInstanceList 循环依赖关联的实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceOpsDto [] getCirculateInstanceList() {
        return this.CirculateInstanceList;
    }

    /**
     * Set 循环依赖关联的实例
注意：此字段可能返回 null，表示取不到有效值。
     * @param CirculateInstanceList 循环依赖关联的实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCirculateInstanceList(InstanceOpsDto [] CirculateInstanceList) {
        this.CirculateInstanceList = CirculateInstanceList;
    }

    /**
     * Get 并发策略, 0: 等待并发, 1: kill自身
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConcurrentStrategy 并发策略, 0: 等待并发, 1: kill自身
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getConcurrentStrategy() {
        return this.ConcurrentStrategy;
    }

    /**
     * Set 并发策略, 0: 等待并发, 1: kill自身
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConcurrentStrategy 并发策略, 0: 等待并发, 1: kill自身
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConcurrentStrategy(Long ConcurrentStrategy) {
        this.ConcurrentStrategy = ConcurrentStrategy;
    }

    /**
     * Get 调度运行方式, 0: 周期调度, 1: 空跑调度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScheduleRunType 调度运行方式, 0: 周期调度, 1: 空跑调度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScheduleRunType() {
        return this.ScheduleRunType;
    }

    /**
     * Set 调度运行方式, 0: 周期调度, 1: 空跑调度
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScheduleRunType 调度运行方式, 0: 周期调度, 1: 空跑调度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheduleRunType(Long ScheduleRunType) {
        this.ScheduleRunType = ScheduleRunType;
    }

    /**
     * Get 允许重跑类型，ALL 表示无论实例运行成功还是失败都允许重跑，NONE表示无论成功或者失败都不允许重跑，FAILURE 表示只有运行失败才能重跑 
     * @return AllowRedoType 允许重跑类型，ALL 表示无论实例运行成功还是失败都允许重跑，NONE表示无论成功或者失败都不允许重跑，FAILURE 表示只有运行失败才能重跑
     */
    public String getAllowRedoType() {
        return this.AllowRedoType;
    }

    /**
     * Set 允许重跑类型，ALL 表示无论实例运行成功还是失败都允许重跑，NONE表示无论成功或者失败都不允许重跑，FAILURE 表示只有运行失败才能重跑
     * @param AllowRedoType 允许重跑类型，ALL 表示无论实例运行成功还是失败都允许重跑，NONE表示无论成功或者失败都不允许重跑，FAILURE 表示只有运行失败才能重跑
     */
    public void setAllowRedoType(String AllowRedoType) {
        this.AllowRedoType = AllowRedoType;
    }

    /**
     * Get 实例生命周期 
     * @return InstanceCycleType 实例生命周期
     */
    public String getInstanceCycleType() {
        return this.InstanceCycleType;
    }

    /**
     * Set 实例生命周期
     * @param InstanceCycleType 实例生命周期
     */
    public void setInstanceCycleType(String InstanceCycleType) {
        this.InstanceCycleType = InstanceCycleType;
    }

    /**
     * Get 实例执行计划描述 
     * @return InstanceSchedulerDesc 实例执行计划描述
     */
    public String getInstanceSchedulerDesc() {
        return this.InstanceSchedulerDesc;
    }

    /**
     * Set 实例执行计划描述
     * @param InstanceSchedulerDesc 实例执行计划描述
     */
    public void setInstanceSchedulerDesc(String InstanceSchedulerDesc) {
        this.InstanceSchedulerDesc = InstanceSchedulerDesc;
    }

    public InstanceOpsDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceOpsDto(InstanceOpsDto source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.InCharge != null) {
            this.InCharge = new String(source.InCharge);
        }
        if (source.CycleType != null) {
            this.CycleType = new String(source.CycleType);
        }
        if (source.CurRunDate != null) {
            this.CurRunDate = new String(source.CurRunDate);
        }
        if (source.NextCurDate != null) {
            this.NextCurDate = new String(source.NextCurDate);
        }
        if (source.RunPriority != null) {
            this.RunPriority = new Long(source.RunPriority);
        }
        if (source.TryLimit != null) {
            this.TryLimit = new Long(source.TryLimit);
        }
        if (source.Tries != null) {
            this.Tries = new Long(source.Tries);
        }
        if (source.TotalRunNum != null) {
            this.TotalRunNum = new Long(source.TotalRunNum);
        }
        if (source.DoFlag != null) {
            this.DoFlag = new Long(source.DoFlag);
        }
        if (source.RedoFlag != null) {
            this.RedoFlag = new Long(source.RedoFlag);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.RuntimeBroker != null) {
            this.RuntimeBroker = new String(source.RuntimeBroker);
        }
        if (source.ErrorDesc != null) {
            this.ErrorDesc = new String(source.ErrorDesc);
        }
        if (source.TaskType != null) {
            this.TaskType = new TaskTypeOpsDto(source.TaskType);
        }
        if (source.DependenceFulfillTime != null) {
            this.DependenceFulfillTime = new String(source.DependenceFulfillTime);
        }
        if (source.FirstDependenceFulfillTime != null) {
            this.FirstDependenceFulfillTime = new String(source.FirstDependenceFulfillTime);
        }
        if (source.FirstStartTime != null) {
            this.FirstStartTime = new String(source.FirstStartTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.CostTime != null) {
            this.CostTime = new String(source.CostTime);
        }
        if (source.CostMillisecond != null) {
            this.CostMillisecond = new Long(source.CostMillisecond);
        }
        if (source.MaxCostTime != null) {
            this.MaxCostTime = new Long(source.MaxCostTime);
        }
        if (source.MinCostTime != null) {
            this.MinCostTime = new Long(source.MinCostTime);
        }
        if (source.AvgCostTime != null) {
            this.AvgCostTime = new Float(source.AvgCostTime);
        }
        if (source.LastLog != null) {
            this.LastLog = new String(source.LastLog);
        }
        if (source.SchedulerDateTime != null) {
            this.SchedulerDateTime = new String(source.SchedulerDateTime);
        }
        if (source.LastSchedulerDateTime != null) {
            this.LastSchedulerDateTime = new String(source.LastSchedulerDateTime);
        }
        if (source.LastUpdate != null) {
            this.LastUpdate = new String(source.LastUpdate);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.DependencyRel != null) {
            this.DependencyRel = new String(source.DependencyRel);
        }
        if (source.ExecutionSpace != null) {
            this.ExecutionSpace = new String(source.ExecutionSpace);
        }
        if (source.IgnoreEvent != null) {
            this.IgnoreEvent = new Boolean(source.IgnoreEvent);
        }
        if (source.VirtualFlag != null) {
            this.VirtualFlag = new Boolean(source.VirtualFlag);
        }
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.FolderName != null) {
            this.FolderName = new String(source.FolderName);
        }
        if (source.SonList != null) {
            this.SonList = new String(source.SonList);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.ResourceGroup != null) {
            this.ResourceGroup = new String(source.ResourceGroup);
        }
        if (source.ResourceInstanceId != null) {
            this.ResourceInstanceId = new String(source.ResourceInstanceId);
        }
        if (source.YarnQueue != null) {
            this.YarnQueue = new String(source.YarnQueue);
        }
        if (source.SchedulerDesc != null) {
            this.SchedulerDesc = new String(source.SchedulerDesc);
        }
        if (source.FirstSubmitTime != null) {
            this.FirstSubmitTime = new String(source.FirstSubmitTime);
        }
        if (source.FirstRunTime != null) {
            this.FirstRunTime = new String(source.FirstRunTime);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ProjectIdent != null) {
            this.ProjectIdent = new String(source.ProjectIdent);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.TenantId != null) {
            this.TenantId = new String(source.TenantId);
        }
        if (source.InstanceKey != null) {
            this.InstanceKey = new String(source.InstanceKey);
        }
        if (source.ExecutorGroupId != null) {
            this.ExecutorGroupId = new String(source.ExecutorGroupId);
        }
        if (source.ExecutorGroupName != null) {
            this.ExecutorGroupName = new String(source.ExecutorGroupName);
        }
        if (source.RelatedInstanceList != null) {
            this.RelatedInstanceList = new InstanceOpsDto[source.RelatedInstanceList.length];
            for (int i = 0; i < source.RelatedInstanceList.length; i++) {
                this.RelatedInstanceList[i] = new InstanceOpsDto(source.RelatedInstanceList[i]);
            }
        }
        if (source.RelatedInstanceSize != null) {
            this.RelatedInstanceSize = new Long(source.RelatedInstanceSize);
        }
        if (source.OwnerId != null) {
            this.OwnerId = new String(source.OwnerId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.InstanceLifeCycleOpsDto != null) {
            this.InstanceLifeCycleOpsDto = new InstanceLifeCycleOpsDto(source.InstanceLifeCycleOpsDto);
        }
        if (source.RetryAttempts != null) {
            this.RetryAttempts = new Long(source.RetryAttempts);
        }
        if (source.DeletedFatherList != null) {
            this.DeletedFatherList = new String[source.DeletedFatherList.length];
            for (int i = 0; i < source.DeletedFatherList.length; i++) {
                this.DeletedFatherList[i] = new String(source.DeletedFatherList[i]);
            }
        }
        if (source.CirculateInstanceList != null) {
            this.CirculateInstanceList = new InstanceOpsDto[source.CirculateInstanceList.length];
            for (int i = 0; i < source.CirculateInstanceList.length; i++) {
                this.CirculateInstanceList[i] = new InstanceOpsDto(source.CirculateInstanceList[i]);
            }
        }
        if (source.ConcurrentStrategy != null) {
            this.ConcurrentStrategy = new Long(source.ConcurrentStrategy);
        }
        if (source.ScheduleRunType != null) {
            this.ScheduleRunType = new Long(source.ScheduleRunType);
        }
        if (source.AllowRedoType != null) {
            this.AllowRedoType = new String(source.AllowRedoType);
        }
        if (source.InstanceCycleType != null) {
            this.InstanceCycleType = new String(source.InstanceCycleType);
        }
        if (source.InstanceSchedulerDesc != null) {
            this.InstanceSchedulerDesc = new String(source.InstanceSchedulerDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "InCharge", this.InCharge);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "CurRunDate", this.CurRunDate);
        this.setParamSimple(map, prefix + "NextCurDate", this.NextCurDate);
        this.setParamSimple(map, prefix + "RunPriority", this.RunPriority);
        this.setParamSimple(map, prefix + "TryLimit", this.TryLimit);
        this.setParamSimple(map, prefix + "Tries", this.Tries);
        this.setParamSimple(map, prefix + "TotalRunNum", this.TotalRunNum);
        this.setParamSimple(map, prefix + "DoFlag", this.DoFlag);
        this.setParamSimple(map, prefix + "RedoFlag", this.RedoFlag);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "RuntimeBroker", this.RuntimeBroker);
        this.setParamSimple(map, prefix + "ErrorDesc", this.ErrorDesc);
        this.setParamObj(map, prefix + "TaskType.", this.TaskType);
        this.setParamSimple(map, prefix + "DependenceFulfillTime", this.DependenceFulfillTime);
        this.setParamSimple(map, prefix + "FirstDependenceFulfillTime", this.FirstDependenceFulfillTime);
        this.setParamSimple(map, prefix + "FirstStartTime", this.FirstStartTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CostTime", this.CostTime);
        this.setParamSimple(map, prefix + "CostMillisecond", this.CostMillisecond);
        this.setParamSimple(map, prefix + "MaxCostTime", this.MaxCostTime);
        this.setParamSimple(map, prefix + "MinCostTime", this.MinCostTime);
        this.setParamSimple(map, prefix + "AvgCostTime", this.AvgCostTime);
        this.setParamSimple(map, prefix + "LastLog", this.LastLog);
        this.setParamSimple(map, prefix + "SchedulerDateTime", this.SchedulerDateTime);
        this.setParamSimple(map, prefix + "LastSchedulerDateTime", this.LastSchedulerDateTime);
        this.setParamSimple(map, prefix + "LastUpdate", this.LastUpdate);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DependencyRel", this.DependencyRel);
        this.setParamSimple(map, prefix + "ExecutionSpace", this.ExecutionSpace);
        this.setParamSimple(map, prefix + "IgnoreEvent", this.IgnoreEvent);
        this.setParamSimple(map, prefix + "VirtualFlag", this.VirtualFlag);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "FolderName", this.FolderName);
        this.setParamSimple(map, prefix + "SonList", this.SonList);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "ResourceGroup", this.ResourceGroup);
        this.setParamSimple(map, prefix + "ResourceInstanceId", this.ResourceInstanceId);
        this.setParamSimple(map, prefix + "YarnQueue", this.YarnQueue);
        this.setParamSimple(map, prefix + "SchedulerDesc", this.SchedulerDesc);
        this.setParamSimple(map, prefix + "FirstSubmitTime", this.FirstSubmitTime);
        this.setParamSimple(map, prefix + "FirstRunTime", this.FirstRunTime);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectIdent", this.ProjectIdent);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "TenantId", this.TenantId);
        this.setParamSimple(map, prefix + "InstanceKey", this.InstanceKey);
        this.setParamSimple(map, prefix + "ExecutorGroupId", this.ExecutorGroupId);
        this.setParamSimple(map, prefix + "ExecutorGroupName", this.ExecutorGroupName);
        this.setParamArrayObj(map, prefix + "RelatedInstanceList.", this.RelatedInstanceList);
        this.setParamSimple(map, prefix + "RelatedInstanceSize", this.RelatedInstanceSize);
        this.setParamSimple(map, prefix + "OwnerId", this.OwnerId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamObj(map, prefix + "InstanceLifeCycleOpsDto.", this.InstanceLifeCycleOpsDto);
        this.setParamSimple(map, prefix + "RetryAttempts", this.RetryAttempts);
        this.setParamArraySimple(map, prefix + "DeletedFatherList.", this.DeletedFatherList);
        this.setParamArrayObj(map, prefix + "CirculateInstanceList.", this.CirculateInstanceList);
        this.setParamSimple(map, prefix + "ConcurrentStrategy", this.ConcurrentStrategy);
        this.setParamSimple(map, prefix + "ScheduleRunType", this.ScheduleRunType);
        this.setParamSimple(map, prefix + "AllowRedoType", this.AllowRedoType);
        this.setParamSimple(map, prefix + "InstanceCycleType", this.InstanceCycleType);
        this.setParamSimple(map, prefix + "InstanceSchedulerDesc", this.InstanceSchedulerDesc);

    }
}

