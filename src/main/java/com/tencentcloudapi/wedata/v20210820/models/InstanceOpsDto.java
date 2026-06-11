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
    * <p>任务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>工作流ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * <p>工作流名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * <p>负责人</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InCharge")
    @Expose
    private String InCharge;

    /**
    * <p>周期类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * <p>数据时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurRunDate")
    @Expose
    private String CurRunDate;

    /**
    * <p>下一个数据时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NextCurDate")
    @Expose
    private String NextCurDate;

    /**
    * <p>运行优先级</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunPriority")
    @Expose
    private Long RunPriority;

    /**
    * <p>尝试运行次数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TryLimit")
    @Expose
    private Long TryLimit;

    /**
    * <p>当前运行次数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tries")
    @Expose
    private Long Tries;

    /**
    * <p>重跑总次数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalRunNum")
    @Expose
    private Long TotalRunNum;

    /**
    * <p>是否补录</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DoFlag")
    @Expose
    private Long DoFlag;

    /**
    * <p>是否是重跑</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RedoFlag")
    @Expose
    private Long RedoFlag;

    /**
    * <p>实例状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * <p>运行节点</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuntimeBroker")
    @Expose
    private String RuntimeBroker;

    /**
    * <p>失败的原因</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorDesc")
    @Expose
    private String ErrorDesc;

    /**
    * <p>任务类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskType")
    @Expose
    private TaskTypeOpsDto TaskType;

    /**
    * <p>依赖判断完成时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DependenceFulfillTime")
    @Expose
    private String DependenceFulfillTime;

    /**
    * <p>首次依赖判断通过时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FirstDependenceFulfillTime")
    @Expose
    private String FirstDependenceFulfillTime;

    /**
    * <p>首次启动时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FirstStartTime")
    @Expose
    private String FirstStartTime;

    /**
    * <p>开始启动时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>运行完成时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>耗费时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CostTime")
    @Expose
    private String CostTime;

    /**
    * <p>耗费时间(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CostMillisecond")
    @Expose
    private Long CostMillisecond;

    /**
    * <p>最大运行耗时</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxCostTime")
    @Expose
    private Long MaxCostTime;

    /**
    * <p>最小运行耗时</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MinCostTime")
    @Expose
    private Long MinCostTime;

    /**
    * <p>平均运行耗时</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AvgCostTime")
    @Expose
    private Float AvgCostTime;

    /**
    * <p>最近日志</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastLog")
    @Expose
    private String LastLog;

    /**
    * <p>调度时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchedulerDateTime")
    @Expose
    private String SchedulerDateTime;

    /**
    * <p>上次调度时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastSchedulerDateTime")
    @Expose
    private String LastSchedulerDateTime;

    /**
    * <p>最后更新事件</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastUpdate")
    @Expose
    private String LastUpdate;

    /**
    * <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>分支，依赖关系 and、or</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DependencyRel")
    @Expose
    private String DependencyRel;

    /**
    * <p>执行空间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionSpace")
    @Expose
    private String ExecutionSpace;

    /**
    * <p>忽略事件</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IgnoreEvent")
    @Expose
    private Boolean IgnoreEvent;

    /**
    * <p>虚拟任务实例</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VirtualFlag")
    @Expose
    private Boolean VirtualFlag;

    /**
    * <p>文件夹ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * <p>文件夹名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FolderName")
    @Expose
    private String FolderName;

    /**
    * <p>递归实例信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SonList")
    @Expose
    private String SonList;

    /**
    * <p>产品业务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * <p>资源组</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroup")
    @Expose
    private String ResourceGroup;

    /**
    * <p>资源组指定执行节点</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceInstanceId")
    @Expose
    private String ResourceInstanceId;

    /**
    * <p>资源队列</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("YarnQueue")
    @Expose
    private String YarnQueue;

    /**
    * <p>调度计划</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchedulerDesc")
    @Expose
    private String SchedulerDesc;

    /**
    * <p>最近提交时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FirstSubmitTime")
    @Expose
    private String FirstSubmitTime;

    /**
    * <p>首次执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FirstRunTime")
    @Expose
    private String FirstRunTime;

    /**
    * <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>项目标识</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectIdent")
    @Expose
    private String ProjectIdent;

    /**
    * <p>项目名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * <p>租户id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TenantId")
    @Expose
    private String TenantId;

    /**
    * <p>实例标识</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceKey")
    @Expose
    private String InstanceKey;

    /**
    * <p>资源组id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutorGroupId")
    @Expose
    private String ExecutorGroupId;

    /**
    * <p>资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutorGroupName")
    @Expose
    private String ExecutorGroupName;

    /**
    * <p>关联实例信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RelatedInstanceList")
    @Expose
    private InstanceOpsDto [] RelatedInstanceList;

    /**
    * <p>关联实例信息数量，不和RelatedInstanceList强关联。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RelatedInstanceSize")
    @Expose
    private Long RelatedInstanceSize;

    /**
    * <p>ownerId</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerId")
    @Expose
    private String OwnerId;

    /**
    * <p>用户id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>实例生命周期</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceLifeCycleOpsDto")
    @Expose
    private InstanceLifeCycleOpsDto InstanceLifeCycleOpsDto;

    /**
    * <p>自动重试次数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RetryAttempts")
    @Expose
    private Long RetryAttempts;

    /**
    * <p>紧急去除的依赖父实例列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeletedFatherList")
    @Expose
    private String [] DeletedFatherList;

    /**
    * <p>循环依赖关联的实例</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CirculateInstanceList")
    @Expose
    private InstanceOpsDto [] CirculateInstanceList;

    /**
    * <p>并发策略, 0: 等待并发, 1: kill自身</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConcurrentStrategy")
    @Expose
    private Long ConcurrentStrategy;

    /**
    * <p>调度运行方式, 0: 周期调度, 1: 空跑调度</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScheduleRunType")
    @Expose
    private Long ScheduleRunType;

    /**
    * <p>允许重跑类型，ALL 表示无论实例运行成功还是失败都允许重跑，NONE表示无论成功或者失败都不允许重跑，FAILURE 表示只有运行失败才能重跑</p>
    */
    @SerializedName("AllowRedoType")
    @Expose
    private String AllowRedoType;

    /**
    * <p>实例生命周期</p>
    */
    @SerializedName("InstanceCycleType")
    @Expose
    private String InstanceCycleType;

    /**
    * <p>实例执行计划描述</p>
    */
    @SerializedName("InstanceSchedulerDesc")
    @Expose
    private String InstanceSchedulerDesc;

    /**
    * <p>当前用户对该实例的权限列表</p>
    */
    @SerializedName("Privileges")
    @Expose
    private String [] Privileges;

    /**
    * <p>任务执行id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskExecutionId")
    @Expose
    private String TaskExecutionId;

    /**
    * <p>dlc taskid</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DlcTaskId")
    @Expose
    private String DlcTaskId;

    /**
    * <p>dlc jobid</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DlcSparkJobId")
    @Expose
    private String DlcSparkJobId;

    /**
    * <p>扩展属性</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ext")
    @Expose
    private StrToStrMap Ext;

    /**
    * <p>事件列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RelatedEventList")
    @Expose
    private EventCaseAuditLogOptDto [] RelatedEventList;

    /**
    * <p>代理任务ID（仅 嵌套场景使用，非 嵌套 场景为 null）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxyTaskId")
    @Expose
    private String ProxyTaskId;

    /**
    * <p>嵌套工作流名称（仅 嵌套场景使用，非 嵌套 场景为 null）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowRunName")
    @Expose
    private String WorkflowRunName;

    /**
    * <p>代理任务类型（仅 嵌套场景使用，非 嵌套 场景为 null）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxyTaskType")
    @Expose
    private TaskTypeOpsDto ProxyTaskType;

    /**
     * Get <p>任务ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId <p>任务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId <p>任务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskName <p>任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskName <p>任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>工作流ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowId <p>工作流ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set <p>工作流ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowId <p>工作流ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get <p>工作流名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowName <p>工作流名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set <p>工作流名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowName <p>工作流名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get <p>负责人</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InCharge <p>负责人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInCharge() {
        return this.InCharge;
    }

    /**
     * Set <p>负责人</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InCharge <p>负责人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInCharge(String InCharge) {
        this.InCharge = InCharge;
    }

    /**
     * Get <p>周期类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CycleType <p>周期类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCycleType() {
        return this.CycleType;
    }

    /**
     * Set <p>周期类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CycleType <p>周期类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCycleType(String CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get <p>数据时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurRunDate <p>数据时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCurRunDate() {
        return this.CurRunDate;
    }

    /**
     * Set <p>数据时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurRunDate <p>数据时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurRunDate(String CurRunDate) {
        this.CurRunDate = CurRunDate;
    }

    /**
     * Get <p>下一个数据时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NextCurDate <p>下一个数据时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNextCurDate() {
        return this.NextCurDate;
    }

    /**
     * Set <p>下一个数据时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NextCurDate <p>下一个数据时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNextCurDate(String NextCurDate) {
        this.NextCurDate = NextCurDate;
    }

    /**
     * Get <p>运行优先级</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunPriority <p>运行优先级</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRunPriority() {
        return this.RunPriority;
    }

    /**
     * Set <p>运行优先级</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunPriority <p>运行优先级</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunPriority(Long RunPriority) {
        this.RunPriority = RunPriority;
    }

    /**
     * Get <p>尝试运行次数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TryLimit <p>尝试运行次数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTryLimit() {
        return this.TryLimit;
    }

    /**
     * Set <p>尝试运行次数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TryLimit <p>尝试运行次数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTryLimit(Long TryLimit) {
        this.TryLimit = TryLimit;
    }

    /**
     * Get <p>当前运行次数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tries <p>当前运行次数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTries() {
        return this.Tries;
    }

    /**
     * Set <p>当前运行次数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tries <p>当前运行次数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTries(Long Tries) {
        this.Tries = Tries;
    }

    /**
     * Get <p>重跑总次数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalRunNum <p>重跑总次数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalRunNum() {
        return this.TotalRunNum;
    }

    /**
     * Set <p>重跑总次数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalRunNum <p>重跑总次数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalRunNum(Long TotalRunNum) {
        this.TotalRunNum = TotalRunNum;
    }

    /**
     * Get <p>是否补录</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DoFlag <p>是否补录</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDoFlag() {
        return this.DoFlag;
    }

    /**
     * Set <p>是否补录</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DoFlag <p>是否补录</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDoFlag(Long DoFlag) {
        this.DoFlag = DoFlag;
    }

    /**
     * Get <p>是否是重跑</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RedoFlag <p>是否是重跑</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRedoFlag() {
        return this.RedoFlag;
    }

    /**
     * Set <p>是否是重跑</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RedoFlag <p>是否是重跑</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRedoFlag(Long RedoFlag) {
        this.RedoFlag = RedoFlag;
    }

    /**
     * Get <p>实例状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return State <p>实例状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set <p>实例状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param State <p>实例状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get <p>运行节点</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuntimeBroker <p>运行节点</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuntimeBroker() {
        return this.RuntimeBroker;
    }

    /**
     * Set <p>运行节点</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuntimeBroker <p>运行节点</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuntimeBroker(String RuntimeBroker) {
        this.RuntimeBroker = RuntimeBroker;
    }

    /**
     * Get <p>失败的原因</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorDesc <p>失败的原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorDesc() {
        return this.ErrorDesc;
    }

    /**
     * Set <p>失败的原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorDesc <p>失败的原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorDesc(String ErrorDesc) {
        this.ErrorDesc = ErrorDesc;
    }

    /**
     * Get <p>任务类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskType <p>任务类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskTypeOpsDto getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>任务类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskType <p>任务类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskType(TaskTypeOpsDto TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>依赖判断完成时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DependenceFulfillTime <p>依赖判断完成时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDependenceFulfillTime() {
        return this.DependenceFulfillTime;
    }

    /**
     * Set <p>依赖判断完成时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DependenceFulfillTime <p>依赖判断完成时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDependenceFulfillTime(String DependenceFulfillTime) {
        this.DependenceFulfillTime = DependenceFulfillTime;
    }

    /**
     * Get <p>首次依赖判断通过时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FirstDependenceFulfillTime <p>首次依赖判断通过时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFirstDependenceFulfillTime() {
        return this.FirstDependenceFulfillTime;
    }

    /**
     * Set <p>首次依赖判断通过时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FirstDependenceFulfillTime <p>首次依赖判断通过时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFirstDependenceFulfillTime(String FirstDependenceFulfillTime) {
        this.FirstDependenceFulfillTime = FirstDependenceFulfillTime;
    }

    /**
     * Get <p>首次启动时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FirstStartTime <p>首次启动时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFirstStartTime() {
        return this.FirstStartTime;
    }

    /**
     * Set <p>首次启动时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FirstStartTime <p>首次启动时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFirstStartTime(String FirstStartTime) {
        this.FirstStartTime = FirstStartTime;
    }

    /**
     * Get <p>开始启动时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime <p>开始启动时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始启动时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime <p>开始启动时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>运行完成时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime <p>运行完成时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>运行完成时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime <p>运行完成时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>耗费时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CostTime <p>耗费时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCostTime() {
        return this.CostTime;
    }

    /**
     * Set <p>耗费时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CostTime <p>耗费时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCostTime(String CostTime) {
        this.CostTime = CostTime;
    }

    /**
     * Get <p>耗费时间(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CostMillisecond <p>耗费时间(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCostMillisecond() {
        return this.CostMillisecond;
    }

    /**
     * Set <p>耗费时间(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CostMillisecond <p>耗费时间(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCostMillisecond(Long CostMillisecond) {
        this.CostMillisecond = CostMillisecond;
    }

    /**
     * Get <p>最大运行耗时</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxCostTime <p>最大运行耗时</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxCostTime() {
        return this.MaxCostTime;
    }

    /**
     * Set <p>最大运行耗时</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxCostTime <p>最大运行耗时</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxCostTime(Long MaxCostTime) {
        this.MaxCostTime = MaxCostTime;
    }

    /**
     * Get <p>最小运行耗时</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MinCostTime <p>最小运行耗时</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMinCostTime() {
        return this.MinCostTime;
    }

    /**
     * Set <p>最小运行耗时</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MinCostTime <p>最小运行耗时</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMinCostTime(Long MinCostTime) {
        this.MinCostTime = MinCostTime;
    }

    /**
     * Get <p>平均运行耗时</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AvgCostTime <p>平均运行耗时</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getAvgCostTime() {
        return this.AvgCostTime;
    }

    /**
     * Set <p>平均运行耗时</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AvgCostTime <p>平均运行耗时</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAvgCostTime(Float AvgCostTime) {
        this.AvgCostTime = AvgCostTime;
    }

    /**
     * Get <p>最近日志</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastLog <p>最近日志</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastLog() {
        return this.LastLog;
    }

    /**
     * Set <p>最近日志</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastLog <p>最近日志</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastLog(String LastLog) {
        this.LastLog = LastLog;
    }

    /**
     * Get <p>调度时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchedulerDateTime <p>调度时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSchedulerDateTime() {
        return this.SchedulerDateTime;
    }

    /**
     * Set <p>调度时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchedulerDateTime <p>调度时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchedulerDateTime(String SchedulerDateTime) {
        this.SchedulerDateTime = SchedulerDateTime;
    }

    /**
     * Get <p>上次调度时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastSchedulerDateTime <p>上次调度时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastSchedulerDateTime() {
        return this.LastSchedulerDateTime;
    }

    /**
     * Set <p>上次调度时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastSchedulerDateTime <p>上次调度时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastSchedulerDateTime(String LastSchedulerDateTime) {
        this.LastSchedulerDateTime = LastSchedulerDateTime;
    }

    /**
     * Get <p>最后更新事件</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastUpdate <p>最后更新事件</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastUpdate() {
        return this.LastUpdate;
    }

    /**
     * Set <p>最后更新事件</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastUpdate <p>最后更新事件</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastUpdate(String LastUpdate) {
        this.LastUpdate = LastUpdate;
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
     * Get <p>分支，依赖关系 and、or</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DependencyRel <p>分支，依赖关系 and、or</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDependencyRel() {
        return this.DependencyRel;
    }

    /**
     * Set <p>分支，依赖关系 and、or</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DependencyRel <p>分支，依赖关系 and、or</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDependencyRel(String DependencyRel) {
        this.DependencyRel = DependencyRel;
    }

    /**
     * Get <p>执行空间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionSpace <p>执行空间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionSpace() {
        return this.ExecutionSpace;
    }

    /**
     * Set <p>执行空间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionSpace <p>执行空间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionSpace(String ExecutionSpace) {
        this.ExecutionSpace = ExecutionSpace;
    }

    /**
     * Get <p>忽略事件</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IgnoreEvent <p>忽略事件</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIgnoreEvent() {
        return this.IgnoreEvent;
    }

    /**
     * Set <p>忽略事件</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IgnoreEvent <p>忽略事件</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIgnoreEvent(Boolean IgnoreEvent) {
        this.IgnoreEvent = IgnoreEvent;
    }

    /**
     * Get <p>虚拟任务实例</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VirtualFlag <p>虚拟任务实例</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getVirtualFlag() {
        return this.VirtualFlag;
    }

    /**
     * Set <p>虚拟任务实例</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VirtualFlag <p>虚拟任务实例</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVirtualFlag(Boolean VirtualFlag) {
        this.VirtualFlag = VirtualFlag;
    }

    /**
     * Get <p>文件夹ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FolderId <p>文件夹ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set <p>文件夹ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FolderId <p>文件夹ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get <p>文件夹名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FolderName <p>文件夹名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFolderName() {
        return this.FolderName;
    }

    /**
     * Set <p>文件夹名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FolderName <p>文件夹名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFolderName(String FolderName) {
        this.FolderName = FolderName;
    }

    /**
     * Get <p>递归实例信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SonList <p>递归实例信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSonList() {
        return this.SonList;
    }

    /**
     * Set <p>递归实例信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SonList <p>递归实例信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSonList(String SonList) {
        this.SonList = SonList;
    }

    /**
     * Get <p>产品业务名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductName <p>产品业务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set <p>产品业务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductName <p>产品业务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get <p>资源组</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroup <p>资源组</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroup() {
        return this.ResourceGroup;
    }

    /**
     * Set <p>资源组</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroup <p>资源组</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroup(String ResourceGroup) {
        this.ResourceGroup = ResourceGroup;
    }

    /**
     * Get <p>资源组指定执行节点</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceInstanceId <p>资源组指定执行节点</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceInstanceId() {
        return this.ResourceInstanceId;
    }

    /**
     * Set <p>资源组指定执行节点</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceInstanceId <p>资源组指定执行节点</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceInstanceId(String ResourceInstanceId) {
        this.ResourceInstanceId = ResourceInstanceId;
    }

    /**
     * Get <p>资源队列</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return YarnQueue <p>资源队列</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getYarnQueue() {
        return this.YarnQueue;
    }

    /**
     * Set <p>资源队列</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param YarnQueue <p>资源队列</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setYarnQueue(String YarnQueue) {
        this.YarnQueue = YarnQueue;
    }

    /**
     * Get <p>调度计划</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchedulerDesc <p>调度计划</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSchedulerDesc() {
        return this.SchedulerDesc;
    }

    /**
     * Set <p>调度计划</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchedulerDesc <p>调度计划</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchedulerDesc(String SchedulerDesc) {
        this.SchedulerDesc = SchedulerDesc;
    }

    /**
     * Get <p>最近提交时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FirstSubmitTime <p>最近提交时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFirstSubmitTime() {
        return this.FirstSubmitTime;
    }

    /**
     * Set <p>最近提交时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FirstSubmitTime <p>最近提交时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFirstSubmitTime(String FirstSubmitTime) {
        this.FirstSubmitTime = FirstSubmitTime;
    }

    /**
     * Get <p>首次执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FirstRunTime <p>首次执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFirstRunTime() {
        return this.FirstRunTime;
    }

    /**
     * Set <p>首次执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FirstRunTime <p>首次执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFirstRunTime(String FirstRunTime) {
        this.FirstRunTime = FirstRunTime;
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
     * Get <p>项目标识</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectIdent <p>项目标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectIdent() {
        return this.ProjectIdent;
    }

    /**
     * Set <p>项目标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectIdent <p>项目标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectIdent(String ProjectIdent) {
        this.ProjectIdent = ProjectIdent;
    }

    /**
     * Get <p>项目名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectName <p>项目名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set <p>项目名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectName <p>项目名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get <p>租户id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TenantId <p>租户id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTenantId() {
        return this.TenantId;
    }

    /**
     * Set <p>租户id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TenantId <p>租户id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTenantId(String TenantId) {
        this.TenantId = TenantId;
    }

    /**
     * Get <p>实例标识</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceKey <p>实例标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceKey() {
        return this.InstanceKey;
    }

    /**
     * Set <p>实例标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceKey <p>实例标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceKey(String InstanceKey) {
        this.InstanceKey = InstanceKey;
    }

    /**
     * Get <p>资源组id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutorGroupId <p>资源组id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutorGroupId() {
        return this.ExecutorGroupId;
    }

    /**
     * Set <p>资源组id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutorGroupId <p>资源组id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutorGroupId(String ExecutorGroupId) {
        this.ExecutorGroupId = ExecutorGroupId;
    }

    /**
     * Get <p>资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutorGroupName <p>资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutorGroupName() {
        return this.ExecutorGroupName;
    }

    /**
     * Set <p>资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutorGroupName <p>资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutorGroupName(String ExecutorGroupName) {
        this.ExecutorGroupName = ExecutorGroupName;
    }

    /**
     * Get <p>关联实例信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RelatedInstanceList <p>关联实例信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceOpsDto [] getRelatedInstanceList() {
        return this.RelatedInstanceList;
    }

    /**
     * Set <p>关联实例信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RelatedInstanceList <p>关联实例信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRelatedInstanceList(InstanceOpsDto [] RelatedInstanceList) {
        this.RelatedInstanceList = RelatedInstanceList;
    }

    /**
     * Get <p>关联实例信息数量，不和RelatedInstanceList强关联。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RelatedInstanceSize <p>关联实例信息数量，不和RelatedInstanceList强关联。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRelatedInstanceSize() {
        return this.RelatedInstanceSize;
    }

    /**
     * Set <p>关联实例信息数量，不和RelatedInstanceList强关联。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RelatedInstanceSize <p>关联实例信息数量，不和RelatedInstanceList强关联。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRelatedInstanceSize(Long RelatedInstanceSize) {
        this.RelatedInstanceSize = RelatedInstanceSize;
    }

    /**
     * Get <p>ownerId</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerId <p>ownerId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerId() {
        return this.OwnerId;
    }

    /**
     * Set <p>ownerId</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerId <p>ownerId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerId(String OwnerId) {
        this.OwnerId = OwnerId;
    }

    /**
     * Get <p>用户id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserId <p>用户id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>用户id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserId <p>用户id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>实例生命周期</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceLifeCycleOpsDto <p>实例生命周期</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceLifeCycleOpsDto getInstanceLifeCycleOpsDto() {
        return this.InstanceLifeCycleOpsDto;
    }

    /**
     * Set <p>实例生命周期</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceLifeCycleOpsDto <p>实例生命周期</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceLifeCycleOpsDto(InstanceLifeCycleOpsDto InstanceLifeCycleOpsDto) {
        this.InstanceLifeCycleOpsDto = InstanceLifeCycleOpsDto;
    }

    /**
     * Get <p>自动重试次数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RetryAttempts <p>自动重试次数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRetryAttempts() {
        return this.RetryAttempts;
    }

    /**
     * Set <p>自动重试次数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RetryAttempts <p>自动重试次数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRetryAttempts(Long RetryAttempts) {
        this.RetryAttempts = RetryAttempts;
    }

    /**
     * Get <p>紧急去除的依赖父实例列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeletedFatherList <p>紧急去除的依赖父实例列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDeletedFatherList() {
        return this.DeletedFatherList;
    }

    /**
     * Set <p>紧急去除的依赖父实例列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeletedFatherList <p>紧急去除的依赖父实例列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeletedFatherList(String [] DeletedFatherList) {
        this.DeletedFatherList = DeletedFatherList;
    }

    /**
     * Get <p>循环依赖关联的实例</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CirculateInstanceList <p>循环依赖关联的实例</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceOpsDto [] getCirculateInstanceList() {
        return this.CirculateInstanceList;
    }

    /**
     * Set <p>循环依赖关联的实例</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CirculateInstanceList <p>循环依赖关联的实例</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCirculateInstanceList(InstanceOpsDto [] CirculateInstanceList) {
        this.CirculateInstanceList = CirculateInstanceList;
    }

    /**
     * Get <p>并发策略, 0: 等待并发, 1: kill自身</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConcurrentStrategy <p>并发策略, 0: 等待并发, 1: kill自身</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getConcurrentStrategy() {
        return this.ConcurrentStrategy;
    }

    /**
     * Set <p>并发策略, 0: 等待并发, 1: kill自身</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConcurrentStrategy <p>并发策略, 0: 等待并发, 1: kill自身</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConcurrentStrategy(Long ConcurrentStrategy) {
        this.ConcurrentStrategy = ConcurrentStrategy;
    }

    /**
     * Get <p>调度运行方式, 0: 周期调度, 1: 空跑调度</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScheduleRunType <p>调度运行方式, 0: 周期调度, 1: 空跑调度</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScheduleRunType() {
        return this.ScheduleRunType;
    }

    /**
     * Set <p>调度运行方式, 0: 周期调度, 1: 空跑调度</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScheduleRunType <p>调度运行方式, 0: 周期调度, 1: 空跑调度</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheduleRunType(Long ScheduleRunType) {
        this.ScheduleRunType = ScheduleRunType;
    }

    /**
     * Get <p>允许重跑类型，ALL 表示无论实例运行成功还是失败都允许重跑，NONE表示无论成功或者失败都不允许重跑，FAILURE 表示只有运行失败才能重跑</p> 
     * @return AllowRedoType <p>允许重跑类型，ALL 表示无论实例运行成功还是失败都允许重跑，NONE表示无论成功或者失败都不允许重跑，FAILURE 表示只有运行失败才能重跑</p>
     */
    public String getAllowRedoType() {
        return this.AllowRedoType;
    }

    /**
     * Set <p>允许重跑类型，ALL 表示无论实例运行成功还是失败都允许重跑，NONE表示无论成功或者失败都不允许重跑，FAILURE 表示只有运行失败才能重跑</p>
     * @param AllowRedoType <p>允许重跑类型，ALL 表示无论实例运行成功还是失败都允许重跑，NONE表示无论成功或者失败都不允许重跑，FAILURE 表示只有运行失败才能重跑</p>
     */
    public void setAllowRedoType(String AllowRedoType) {
        this.AllowRedoType = AllowRedoType;
    }

    /**
     * Get <p>实例生命周期</p> 
     * @return InstanceCycleType <p>实例生命周期</p>
     */
    public String getInstanceCycleType() {
        return this.InstanceCycleType;
    }

    /**
     * Set <p>实例生命周期</p>
     * @param InstanceCycleType <p>实例生命周期</p>
     */
    public void setInstanceCycleType(String InstanceCycleType) {
        this.InstanceCycleType = InstanceCycleType;
    }

    /**
     * Get <p>实例执行计划描述</p> 
     * @return InstanceSchedulerDesc <p>实例执行计划描述</p>
     */
    public String getInstanceSchedulerDesc() {
        return this.InstanceSchedulerDesc;
    }

    /**
     * Set <p>实例执行计划描述</p>
     * @param InstanceSchedulerDesc <p>实例执行计划描述</p>
     */
    public void setInstanceSchedulerDesc(String InstanceSchedulerDesc) {
        this.InstanceSchedulerDesc = InstanceSchedulerDesc;
    }

    /**
     * Get <p>当前用户对该实例的权限列表</p> 
     * @return Privileges <p>当前用户对该实例的权限列表</p>
     */
    public String [] getPrivileges() {
        return this.Privileges;
    }

    /**
     * Set <p>当前用户对该实例的权限列表</p>
     * @param Privileges <p>当前用户对该实例的权限列表</p>
     */
    public void setPrivileges(String [] Privileges) {
        this.Privileges = Privileges;
    }

    /**
     * Get <p>任务执行id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskExecutionId <p>任务执行id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskExecutionId() {
        return this.TaskExecutionId;
    }

    /**
     * Set <p>任务执行id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskExecutionId <p>任务执行id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskExecutionId(String TaskExecutionId) {
        this.TaskExecutionId = TaskExecutionId;
    }

    /**
     * Get <p>dlc taskid</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DlcTaskId <p>dlc taskid</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDlcTaskId() {
        return this.DlcTaskId;
    }

    /**
     * Set <p>dlc taskid</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DlcTaskId <p>dlc taskid</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDlcTaskId(String DlcTaskId) {
        this.DlcTaskId = DlcTaskId;
    }

    /**
     * Get <p>dlc jobid</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DlcSparkJobId <p>dlc jobid</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDlcSparkJobId() {
        return this.DlcSparkJobId;
    }

    /**
     * Set <p>dlc jobid</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DlcSparkJobId <p>dlc jobid</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDlcSparkJobId(String DlcSparkJobId) {
        this.DlcSparkJobId = DlcSparkJobId;
    }

    /**
     * Get <p>扩展属性</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ext <p>扩展属性</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StrToStrMap getExt() {
        return this.Ext;
    }

    /**
     * Set <p>扩展属性</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ext <p>扩展属性</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExt(StrToStrMap Ext) {
        this.Ext = Ext;
    }

    /**
     * Get <p>事件列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RelatedEventList <p>事件列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EventCaseAuditLogOptDto [] getRelatedEventList() {
        return this.RelatedEventList;
    }

    /**
     * Set <p>事件列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RelatedEventList <p>事件列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRelatedEventList(EventCaseAuditLogOptDto [] RelatedEventList) {
        this.RelatedEventList = RelatedEventList;
    }

    /**
     * Get <p>代理任务ID（仅 嵌套场景使用，非 嵌套 场景为 null）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxyTaskId <p>代理任务ID（仅 嵌套场景使用，非 嵌套 场景为 null）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProxyTaskId() {
        return this.ProxyTaskId;
    }

    /**
     * Set <p>代理任务ID（仅 嵌套场景使用，非 嵌套 场景为 null）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxyTaskId <p>代理任务ID（仅 嵌套场景使用，非 嵌套 场景为 null）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxyTaskId(String ProxyTaskId) {
        this.ProxyTaskId = ProxyTaskId;
    }

    /**
     * Get <p>嵌套工作流名称（仅 嵌套场景使用，非 嵌套 场景为 null）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowRunName <p>嵌套工作流名称（仅 嵌套场景使用，非 嵌套 场景为 null）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowRunName() {
        return this.WorkflowRunName;
    }

    /**
     * Set <p>嵌套工作流名称（仅 嵌套场景使用，非 嵌套 场景为 null）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowRunName <p>嵌套工作流名称（仅 嵌套场景使用，非 嵌套 场景为 null）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowRunName(String WorkflowRunName) {
        this.WorkflowRunName = WorkflowRunName;
    }

    /**
     * Get <p>代理任务类型（仅 嵌套场景使用，非 嵌套 场景为 null）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxyTaskType <p>代理任务类型（仅 嵌套场景使用，非 嵌套 场景为 null）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskTypeOpsDto getProxyTaskType() {
        return this.ProxyTaskType;
    }

    /**
     * Set <p>代理任务类型（仅 嵌套场景使用，非 嵌套 场景为 null）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxyTaskType <p>代理任务类型（仅 嵌套场景使用，非 嵌套 场景为 null）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxyTaskType(TaskTypeOpsDto ProxyTaskType) {
        this.ProxyTaskType = ProxyTaskType;
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
        if (source.Privileges != null) {
            this.Privileges = new String[source.Privileges.length];
            for (int i = 0; i < source.Privileges.length; i++) {
                this.Privileges[i] = new String(source.Privileges[i]);
            }
        }
        if (source.TaskExecutionId != null) {
            this.TaskExecutionId = new String(source.TaskExecutionId);
        }
        if (source.DlcTaskId != null) {
            this.DlcTaskId = new String(source.DlcTaskId);
        }
        if (source.DlcSparkJobId != null) {
            this.DlcSparkJobId = new String(source.DlcSparkJobId);
        }
        if (source.Ext != null) {
            this.Ext = new StrToStrMap(source.Ext);
        }
        if (source.RelatedEventList != null) {
            this.RelatedEventList = new EventCaseAuditLogOptDto[source.RelatedEventList.length];
            for (int i = 0; i < source.RelatedEventList.length; i++) {
                this.RelatedEventList[i] = new EventCaseAuditLogOptDto(source.RelatedEventList[i]);
            }
        }
        if (source.ProxyTaskId != null) {
            this.ProxyTaskId = new String(source.ProxyTaskId);
        }
        if (source.WorkflowRunName != null) {
            this.WorkflowRunName = new String(source.WorkflowRunName);
        }
        if (source.ProxyTaskType != null) {
            this.ProxyTaskType = new TaskTypeOpsDto(source.ProxyTaskType);
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
        this.setParamArraySimple(map, prefix + "Privileges.", this.Privileges);
        this.setParamSimple(map, prefix + "TaskExecutionId", this.TaskExecutionId);
        this.setParamSimple(map, prefix + "DlcTaskId", this.DlcTaskId);
        this.setParamSimple(map, prefix + "DlcSparkJobId", this.DlcSparkJobId);
        this.setParamObj(map, prefix + "Ext.", this.Ext);
        this.setParamArrayObj(map, prefix + "RelatedEventList.", this.RelatedEventList);
        this.setParamSimple(map, prefix + "ProxyTaskId", this.ProxyTaskId);
        this.setParamSimple(map, prefix + "WorkflowRunName", this.WorkflowRunName);
        this.setParamObj(map, prefix + "ProxyTaskType.", this.ProxyTaskType);

    }
}

