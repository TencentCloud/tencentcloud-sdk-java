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

public class TaskOpsDto extends AbstractModel{

    /**
    * 任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 虚拟任务id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VirtualTaskId")
    @Expose
    private String VirtualTaskId;

    /**
    * 虚拟任务标记
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VirtualFlag")
    @Expose
    private Boolean VirtualFlag;

    /**
    * 任务名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 工作流id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 任务为虚拟任务时，任务所在的真实工作流Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RealWorkflowId")
    @Expose
    private String RealWorkflowId;

    /**
    * 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * 文件夹id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * 文件夹名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FolderName")
    @Expose
    private String FolderName;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 最近更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastUpdate")
    @Expose
    private String LastUpdate;

    /**
    * 任务状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 责任人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InCharge")
    @Expose
    private String InCharge;

    /**
    * 责任人用户id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InChargeId")
    @Expose
    private String InChargeId;

    /**
    * 调度生效日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 调度结束日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 执行时间左闭区间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionStartTime")
    @Expose
    private String ExecutionStartTime;

    /**
    * 执行时间右闭区间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionEndTime")
    @Expose
    private String ExecutionEndTime;

    /**
    * 周期类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * 步长
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CycleStep")
    @Expose
    private Long CycleStep;

    /**
    * 调度cron表达式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CrontabExpression")
    @Expose
    private String CrontabExpression;

    /**
    * 延时执行时间，unit=分钟
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DelayTime")
    @Expose
    private Long DelayTime;

    /**
    * 开始执行时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartupTime")
    @Expose
    private Long StartupTime;

    /**
    * 重试等待时间, unit=分钟
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RetryWait")
    @Expose
    private Long RetryWait;

    /**
    * 是否可重试，1 代表可以重试
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RetryAble")
    @Expose
    private Long RetryAble;

    /**
    * 调度配置-弹性周期配置，小时/周/月/年调度才有，小时任务指定每天的0点3点4点跑，则为'0,3,4'
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskAction")
    @Expose
    private String TaskAction;

    /**
    * 运行次数限制
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TryLimit")
    @Expose
    private Long TryLimit;

    /**
    * 运行优先级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunPriority")
    @Expose
    private Long RunPriority;

    /**
    * 任务类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskType")
    @Expose
    private TaskTypeOpsDto TaskType;

    /**
    * 指定的运行节点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BrokerIp")
    @Expose
    private String BrokerIp;

    /**
    * 集群name
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 最小数据时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MinDateTime")
    @Expose
    private String MinDateTime;

    /**
    * 最大数据时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxDateTime")
    @Expose
    private String MaxDateTime;

    /**
    * 运行耗时超时时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionTTL")
    @Expose
    private Long ExecutionTTL;

    /**
    * 自依赖类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SelfDepend")
    @Expose
    private String SelfDepend;

    /**
    * 左侧坐标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LeftCoordinate")
    @Expose
    private Float LeftCoordinate;

    /**
    * 顶部坐标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopCoordinate")
    @Expose
    private Float TopCoordinate;

    /**
    * 任务备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Notes")
    @Expose
    private String Notes;

    /**
    * 任务初始化策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceInitStrategy")
    @Expose
    private String InstanceInitStrategy;

    /**
    * 计算队列
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("YarnQueue")
    @Expose
    private String YarnQueue;

    /**
    * 最新调度提交时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastSchedulerCommitTime")
    @Expose
    private String LastSchedulerCommitTime;

    /**
    * 按cron表达式计算的任务开始执行时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NormalizedJobStartTime")
    @Expose
    private String NormalizedJobStartTime;

    /**
    * 调度计划描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchedulerDesc")
    @Expose
    private String SchedulerDesc;

    /**
    * 计算资源组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroup")
    @Expose
    private String ResourceGroup;

    /**
    * 任务创建人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * 任务依赖类型 and、or
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DependencyRel")
    @Expose
    private String DependencyRel;

    /**
    * 任务工作流依赖 yes、no
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DependencyWorkflow")
    @Expose
    private String DependencyWorkflow;

    /**
    * 事件监听配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventListenerConfig")
    @Expose
    private String EventListenerConfig;

    /**
    * 事件驱动配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventPublisherConfig")
    @Expose
    private String EventPublisherConfig;

    /**
    * 虚拟任务状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VirtualTaskStatus")
    @Expose
    private String VirtualTaskStatus;

    /**
    * 任务依赖边详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskLinkInfo")
    @Expose
    private LinkOpsDto TaskLinkInfo;

    /**
    * 任务产品类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 项目id
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
    * 主账户userId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnId")
    @Expose
    private String OwnId;

    /**
    * 用户userId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 租户id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TenantId")
    @Expose
    private String TenantId;

    /**
    * 更新人昵称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateUser")
    @Expose
    private String UpdateUser;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 更新人userId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateUserId")
    @Expose
    private String UpdateUserId;

    /**
    * 任务类型id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskTypeId")
    @Expose
    private Long TaskTypeId;

    /**
    * 任务类型描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskTypeDesc")
    @Expose
    private String TaskTypeDesc;

    /**
    * 是否展示工作流
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShowWorkflow")
    @Expose
    private Boolean ShowWorkflow;

    /**
    * 首次提交时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FirstSubmitTime")
    @Expose
    private String FirstSubmitTime;

    /**
    * 首次运行时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FirstRunTime")
    @Expose
    private String FirstRunTime;

    /**
    * 调度描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScheduleDesc")
    @Expose
    private String ScheduleDesc;

    /**
    * 周期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CycleNum")
    @Expose
    private Long CycleNum;

    /**
    * 表达式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Crontab")
    @Expose
    private String Crontab;

    /**
    * 开始日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * 结束日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * 周期单位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CycleUnit")
    @Expose
    private String CycleUnit;

    /**
    * 初始化策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InitStrategy")
    @Expose
    private String InitStrategy;

    /**
    * 层级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Layer")
    @Expose
    private String Layer;

    /**
    * 来源数据源ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceServiceId")
    @Expose
    private String SourceServiceId;

    /**
    * 来源数据源类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceServiceType")
    @Expose
    private String SourceServiceType;

    /**
    * 目标数据源ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetServiceId")
    @Expose
    private String TargetServiceId;

    /**
    * 目标数据源类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetServiceType")
    @Expose
    private String TargetServiceType;

    /**
    * 子任务列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TasksStr")
    @Expose
    private String TasksStr;

    /**
    * 任务版本是否已提交
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Submit")
    @Expose
    private Boolean Submit;

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
     * Get 虚拟任务id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VirtualTaskId 虚拟任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVirtualTaskId() {
        return this.VirtualTaskId;
    }

    /**
     * Set 虚拟任务id
注意：此字段可能返回 null，表示取不到有效值。
     * @param VirtualTaskId 虚拟任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVirtualTaskId(String VirtualTaskId) {
        this.VirtualTaskId = VirtualTaskId;
    }

    /**
     * Get 虚拟任务标记
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VirtualFlag 虚拟任务标记
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getVirtualFlag() {
        return this.VirtualFlag;
    }

    /**
     * Set 虚拟任务标记
注意：此字段可能返回 null，表示取不到有效值。
     * @param VirtualFlag 虚拟任务标记
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVirtualFlag(Boolean VirtualFlag) {
        this.VirtualFlag = VirtualFlag;
    }

    /**
     * Get 任务名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskName 任务名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskName 任务名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
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
     * Get 任务为虚拟任务时，任务所在的真实工作流Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RealWorkflowId 任务为虚拟任务时，任务所在的真实工作流Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRealWorkflowId() {
        return this.RealWorkflowId;
    }

    /**
     * Set 任务为虚拟任务时，任务所在的真实工作流Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealWorkflowId 任务为虚拟任务时，任务所在的真实工作流Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRealWorkflowId(String RealWorkflowId) {
        this.RealWorkflowId = RealWorkflowId;
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
     * Get 文件夹id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FolderId 文件夹id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set 文件夹id
注意：此字段可能返回 null，表示取不到有效值。
     * @param FolderId 文件夹id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get 文件夹名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FolderName 文件夹名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFolderName() {
        return this.FolderName;
    }

    /**
     * Set 文件夹名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param FolderName 文件夹名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFolderName(String FolderName) {
        this.FolderName = FolderName;
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
     * Get 最近更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastUpdate 最近更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastUpdate() {
        return this.LastUpdate;
    }

    /**
     * Set 最近更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastUpdate 最近更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastUpdate(String LastUpdate) {
        this.LastUpdate = LastUpdate;
    }

    /**
     * Get 任务状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 任务状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 任务状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 责任人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InCharge 责任人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInCharge() {
        return this.InCharge;
    }

    /**
     * Set 责任人
注意：此字段可能返回 null，表示取不到有效值。
     * @param InCharge 责任人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInCharge(String InCharge) {
        this.InCharge = InCharge;
    }

    /**
     * Get 责任人用户id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InChargeId 责任人用户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInChargeId() {
        return this.InChargeId;
    }

    /**
     * Set 责任人用户id
注意：此字段可能返回 null，表示取不到有效值。
     * @param InChargeId 责任人用户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInChargeId(String InChargeId) {
        this.InChargeId = InChargeId;
    }

    /**
     * Get 调度生效日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 调度生效日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 调度生效日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 调度生效日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 调度结束日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 调度结束日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 调度结束日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 调度结束日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 执行时间左闭区间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionStartTime 执行时间左闭区间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionStartTime() {
        return this.ExecutionStartTime;
    }

    /**
     * Set 执行时间左闭区间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionStartTime 执行时间左闭区间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionStartTime(String ExecutionStartTime) {
        this.ExecutionStartTime = ExecutionStartTime;
    }

    /**
     * Get 执行时间右闭区间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionEndTime 执行时间右闭区间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionEndTime() {
        return this.ExecutionEndTime;
    }

    /**
     * Set 执行时间右闭区间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionEndTime 执行时间右闭区间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionEndTime(String ExecutionEndTime) {
        this.ExecutionEndTime = ExecutionEndTime;
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
     * Get 步长
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CycleStep 步长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCycleStep() {
        return this.CycleStep;
    }

    /**
     * Set 步长
注意：此字段可能返回 null，表示取不到有效值。
     * @param CycleStep 步长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCycleStep(Long CycleStep) {
        this.CycleStep = CycleStep;
    }

    /**
     * Get 调度cron表达式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CrontabExpression 调度cron表达式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCrontabExpression() {
        return this.CrontabExpression;
    }

    /**
     * Set 调度cron表达式
注意：此字段可能返回 null，表示取不到有效值。
     * @param CrontabExpression 调度cron表达式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCrontabExpression(String CrontabExpression) {
        this.CrontabExpression = CrontabExpression;
    }

    /**
     * Get 延时执行时间，unit=分钟
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DelayTime 延时执行时间，unit=分钟
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDelayTime() {
        return this.DelayTime;
    }

    /**
     * Set 延时执行时间，unit=分钟
注意：此字段可能返回 null，表示取不到有效值。
     * @param DelayTime 延时执行时间，unit=分钟
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDelayTime(Long DelayTime) {
        this.DelayTime = DelayTime;
    }

    /**
     * Get 开始执行时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartupTime 开始执行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStartupTime() {
        return this.StartupTime;
    }

    /**
     * Set 开始执行时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartupTime 开始执行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartupTime(Long StartupTime) {
        this.StartupTime = StartupTime;
    }

    /**
     * Get 重试等待时间, unit=分钟
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RetryWait 重试等待时间, unit=分钟
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRetryWait() {
        return this.RetryWait;
    }

    /**
     * Set 重试等待时间, unit=分钟
注意：此字段可能返回 null，表示取不到有效值。
     * @param RetryWait 重试等待时间, unit=分钟
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRetryWait(Long RetryWait) {
        this.RetryWait = RetryWait;
    }

    /**
     * Get 是否可重试，1 代表可以重试
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RetryAble 是否可重试，1 代表可以重试
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRetryAble() {
        return this.RetryAble;
    }

    /**
     * Set 是否可重试，1 代表可以重试
注意：此字段可能返回 null，表示取不到有效值。
     * @param RetryAble 是否可重试，1 代表可以重试
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRetryAble(Long RetryAble) {
        this.RetryAble = RetryAble;
    }

    /**
     * Get 调度配置-弹性周期配置，小时/周/月/年调度才有，小时任务指定每天的0点3点4点跑，则为'0,3,4'
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskAction 调度配置-弹性周期配置，小时/周/月/年调度才有，小时任务指定每天的0点3点4点跑，则为'0,3,4'
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskAction() {
        return this.TaskAction;
    }

    /**
     * Set 调度配置-弹性周期配置，小时/周/月/年调度才有，小时任务指定每天的0点3点4点跑，则为'0,3,4'
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskAction 调度配置-弹性周期配置，小时/周/月/年调度才有，小时任务指定每天的0点3点4点跑，则为'0,3,4'
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskAction(String TaskAction) {
        this.TaskAction = TaskAction;
    }

    /**
     * Get 运行次数限制
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TryLimit 运行次数限制
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTryLimit() {
        return this.TryLimit;
    }

    /**
     * Set 运行次数限制
注意：此字段可能返回 null，表示取不到有效值。
     * @param TryLimit 运行次数限制
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTryLimit(Long TryLimit) {
        this.TryLimit = TryLimit;
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
     * Get 指定的运行节点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BrokerIp 指定的运行节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBrokerIp() {
        return this.BrokerIp;
    }

    /**
     * Set 指定的运行节点
注意：此字段可能返回 null，表示取不到有效值。
     * @param BrokerIp 指定的运行节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBrokerIp(String BrokerIp) {
        this.BrokerIp = BrokerIp;
    }

    /**
     * Get 集群name
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId 集群name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群name
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId 集群name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 最小数据时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MinDateTime 最小数据时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMinDateTime() {
        return this.MinDateTime;
    }

    /**
     * Set 最小数据时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param MinDateTime 最小数据时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMinDateTime(String MinDateTime) {
        this.MinDateTime = MinDateTime;
    }

    /**
     * Get 最大数据时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxDateTime 最大数据时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMaxDateTime() {
        return this.MaxDateTime;
    }

    /**
     * Set 最大数据时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxDateTime 最大数据时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxDateTime(String MaxDateTime) {
        this.MaxDateTime = MaxDateTime;
    }

    /**
     * Get 运行耗时超时时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionTTL 运行耗时超时时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExecutionTTL() {
        return this.ExecutionTTL;
    }

    /**
     * Set 运行耗时超时时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionTTL 运行耗时超时时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionTTL(Long ExecutionTTL) {
        this.ExecutionTTL = ExecutionTTL;
    }

    /**
     * Get 自依赖类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SelfDepend 自依赖类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSelfDepend() {
        return this.SelfDepend;
    }

    /**
     * Set 自依赖类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param SelfDepend 自依赖类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSelfDepend(String SelfDepend) {
        this.SelfDepend = SelfDepend;
    }

    /**
     * Get 左侧坐标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LeftCoordinate 左侧坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getLeftCoordinate() {
        return this.LeftCoordinate;
    }

    /**
     * Set 左侧坐标
注意：此字段可能返回 null，表示取不到有效值。
     * @param LeftCoordinate 左侧坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLeftCoordinate(Float LeftCoordinate) {
        this.LeftCoordinate = LeftCoordinate;
    }

    /**
     * Get 顶部坐标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopCoordinate 顶部坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTopCoordinate() {
        return this.TopCoordinate;
    }

    /**
     * Set 顶部坐标
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopCoordinate 顶部坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopCoordinate(Float TopCoordinate) {
        this.TopCoordinate = TopCoordinate;
    }

    /**
     * Get 任务备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Notes 任务备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNotes() {
        return this.Notes;
    }

    /**
     * Set 任务备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Notes 任务备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNotes(String Notes) {
        this.Notes = Notes;
    }

    /**
     * Get 任务初始化策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceInitStrategy 任务初始化策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceInitStrategy() {
        return this.InstanceInitStrategy;
    }

    /**
     * Set 任务初始化策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceInitStrategy 任务初始化策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceInitStrategy(String InstanceInitStrategy) {
        this.InstanceInitStrategy = InstanceInitStrategy;
    }

    /**
     * Get 计算队列
注意：此字段可能返回 null，表示取不到有效值。 
     * @return YarnQueue 计算队列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getYarnQueue() {
        return this.YarnQueue;
    }

    /**
     * Set 计算队列
注意：此字段可能返回 null，表示取不到有效值。
     * @param YarnQueue 计算队列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setYarnQueue(String YarnQueue) {
        this.YarnQueue = YarnQueue;
    }

    /**
     * Get 最新调度提交时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastSchedulerCommitTime 最新调度提交时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastSchedulerCommitTime() {
        return this.LastSchedulerCommitTime;
    }

    /**
     * Set 最新调度提交时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastSchedulerCommitTime 最新调度提交时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastSchedulerCommitTime(String LastSchedulerCommitTime) {
        this.LastSchedulerCommitTime = LastSchedulerCommitTime;
    }

    /**
     * Get 按cron表达式计算的任务开始执行时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NormalizedJobStartTime 按cron表达式计算的任务开始执行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNormalizedJobStartTime() {
        return this.NormalizedJobStartTime;
    }

    /**
     * Set 按cron表达式计算的任务开始执行时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param NormalizedJobStartTime 按cron表达式计算的任务开始执行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNormalizedJobStartTime(String NormalizedJobStartTime) {
        this.NormalizedJobStartTime = NormalizedJobStartTime;
    }

    /**
     * Get 调度计划描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchedulerDesc 调度计划描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSchedulerDesc() {
        return this.SchedulerDesc;
    }

    /**
     * Set 调度计划描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchedulerDesc 调度计划描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchedulerDesc(String SchedulerDesc) {
        this.SchedulerDesc = SchedulerDesc;
    }

    /**
     * Get 计算资源组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroup 计算资源组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroup() {
        return this.ResourceGroup;
    }

    /**
     * Set 计算资源组
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroup 计算资源组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroup(String ResourceGroup) {
        this.ResourceGroup = ResourceGroup;
    }

    /**
     * Get 任务创建人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Creator 任务创建人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 任务创建人
注意：此字段可能返回 null，表示取不到有效值。
     * @param Creator 任务创建人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get 任务依赖类型 and、or
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DependencyRel 任务依赖类型 and、or
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDependencyRel() {
        return this.DependencyRel;
    }

    /**
     * Set 任务依赖类型 and、or
注意：此字段可能返回 null，表示取不到有效值。
     * @param DependencyRel 任务依赖类型 and、or
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDependencyRel(String DependencyRel) {
        this.DependencyRel = DependencyRel;
    }

    /**
     * Get 任务工作流依赖 yes、no
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DependencyWorkflow 任务工作流依赖 yes、no
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDependencyWorkflow() {
        return this.DependencyWorkflow;
    }

    /**
     * Set 任务工作流依赖 yes、no
注意：此字段可能返回 null，表示取不到有效值。
     * @param DependencyWorkflow 任务工作流依赖 yes、no
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDependencyWorkflow(String DependencyWorkflow) {
        this.DependencyWorkflow = DependencyWorkflow;
    }

    /**
     * Get 事件监听配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventListenerConfig 事件监听配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventListenerConfig() {
        return this.EventListenerConfig;
    }

    /**
     * Set 事件监听配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventListenerConfig 事件监听配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventListenerConfig(String EventListenerConfig) {
        this.EventListenerConfig = EventListenerConfig;
    }

    /**
     * Get 事件驱动配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventPublisherConfig 事件驱动配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventPublisherConfig() {
        return this.EventPublisherConfig;
    }

    /**
     * Set 事件驱动配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventPublisherConfig 事件驱动配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventPublisherConfig(String EventPublisherConfig) {
        this.EventPublisherConfig = EventPublisherConfig;
    }

    /**
     * Get 虚拟任务状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VirtualTaskStatus 虚拟任务状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVirtualTaskStatus() {
        return this.VirtualTaskStatus;
    }

    /**
     * Set 虚拟任务状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param VirtualTaskStatus 虚拟任务状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVirtualTaskStatus(String VirtualTaskStatus) {
        this.VirtualTaskStatus = VirtualTaskStatus;
    }

    /**
     * Get 任务依赖边详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskLinkInfo 任务依赖边详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LinkOpsDto getTaskLinkInfo() {
        return this.TaskLinkInfo;
    }

    /**
     * Set 任务依赖边详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskLinkInfo 任务依赖边详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskLinkInfo(LinkOpsDto TaskLinkInfo) {
        this.TaskLinkInfo = TaskLinkInfo;
    }

    /**
     * Get 任务产品类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductName 任务产品类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 任务产品类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductName 任务产品类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
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
     * Get 主账户userId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnId 主账户userId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnId() {
        return this.OwnId;
    }

    /**
     * Set 主账户userId
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnId 主账户userId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnId(String OwnId) {
        this.OwnId = OwnId;
    }

    /**
     * Get 用户userId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserId 用户userId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户userId
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserId 用户userId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
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
     * Get 更新人昵称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateUser 更新人昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateUser() {
        return this.UpdateUser;
    }

    /**
     * Set 更新人昵称
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateUser 更新人昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateUser(String UpdateUser) {
        this.UpdateUser = UpdateUser;
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
     * Get 更新人userId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateUserId 更新人userId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateUserId() {
        return this.UpdateUserId;
    }

    /**
     * Set 更新人userId
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateUserId 更新人userId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateUserId(String UpdateUserId) {
        this.UpdateUserId = UpdateUserId;
    }

    /**
     * Get 任务类型id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskTypeId 任务类型id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskTypeId() {
        return this.TaskTypeId;
    }

    /**
     * Set 任务类型id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskTypeId 任务类型id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskTypeId(Long TaskTypeId) {
        this.TaskTypeId = TaskTypeId;
    }

    /**
     * Get 任务类型描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskTypeDesc 任务类型描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskTypeDesc() {
        return this.TaskTypeDesc;
    }

    /**
     * Set 任务类型描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskTypeDesc 任务类型描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskTypeDesc(String TaskTypeDesc) {
        this.TaskTypeDesc = TaskTypeDesc;
    }

    /**
     * Get 是否展示工作流
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShowWorkflow 是否展示工作流
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getShowWorkflow() {
        return this.ShowWorkflow;
    }

    /**
     * Set 是否展示工作流
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShowWorkflow 是否展示工作流
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShowWorkflow(Boolean ShowWorkflow) {
        this.ShowWorkflow = ShowWorkflow;
    }

    /**
     * Get 首次提交时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FirstSubmitTime 首次提交时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFirstSubmitTime() {
        return this.FirstSubmitTime;
    }

    /**
     * Set 首次提交时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param FirstSubmitTime 首次提交时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFirstSubmitTime(String FirstSubmitTime) {
        this.FirstSubmitTime = FirstSubmitTime;
    }

    /**
     * Get 首次运行时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FirstRunTime 首次运行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFirstRunTime() {
        return this.FirstRunTime;
    }

    /**
     * Set 首次运行时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param FirstRunTime 首次运行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFirstRunTime(String FirstRunTime) {
        this.FirstRunTime = FirstRunTime;
    }

    /**
     * Get 调度描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScheduleDesc 调度描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScheduleDesc() {
        return this.ScheduleDesc;
    }

    /**
     * Set 调度描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScheduleDesc 调度描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheduleDesc(String ScheduleDesc) {
        this.ScheduleDesc = ScheduleDesc;
    }

    /**
     * Get 周期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CycleNum 周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCycleNum() {
        return this.CycleNum;
    }

    /**
     * Set 周期
注意：此字段可能返回 null，表示取不到有效值。
     * @param CycleNum 周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCycleNum(Long CycleNum) {
        this.CycleNum = CycleNum;
    }

    /**
     * Get 表达式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Crontab 表达式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCrontab() {
        return this.Crontab;
    }

    /**
     * Set 表达式
注意：此字段可能返回 null，表示取不到有效值。
     * @param Crontab 表达式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCrontab(String Crontab) {
        this.Crontab = Crontab;
    }

    /**
     * Get 开始日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartDate 开始日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set 开始日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartDate 开始日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get 结束日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndDate 结束日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set 结束日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndDate 结束日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get 周期单位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CycleUnit 周期单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCycleUnit() {
        return this.CycleUnit;
    }

    /**
     * Set 周期单位
注意：此字段可能返回 null，表示取不到有效值。
     * @param CycleUnit 周期单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCycleUnit(String CycleUnit) {
        this.CycleUnit = CycleUnit;
    }

    /**
     * Get 初始化策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InitStrategy 初始化策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInitStrategy() {
        return this.InitStrategy;
    }

    /**
     * Set 初始化策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param InitStrategy 初始化策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInitStrategy(String InitStrategy) {
        this.InitStrategy = InitStrategy;
    }

    /**
     * Get 层级
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Layer 层级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLayer() {
        return this.Layer;
    }

    /**
     * Set 层级
注意：此字段可能返回 null，表示取不到有效值。
     * @param Layer 层级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLayer(String Layer) {
        this.Layer = Layer;
    }

    /**
     * Get 来源数据源ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceServiceId 来源数据源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceServiceId() {
        return this.SourceServiceId;
    }

    /**
     * Set 来源数据源ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceServiceId 来源数据源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceServiceId(String SourceServiceId) {
        this.SourceServiceId = SourceServiceId;
    }

    /**
     * Get 来源数据源类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceServiceType 来源数据源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceServiceType() {
        return this.SourceServiceType;
    }

    /**
     * Set 来源数据源类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceServiceType 来源数据源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceServiceType(String SourceServiceType) {
        this.SourceServiceType = SourceServiceType;
    }

    /**
     * Get 目标数据源ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetServiceId 目标数据源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetServiceId() {
        return this.TargetServiceId;
    }

    /**
     * Set 目标数据源ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetServiceId 目标数据源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetServiceId(String TargetServiceId) {
        this.TargetServiceId = TargetServiceId;
    }

    /**
     * Get 目标数据源类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetServiceType 目标数据源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetServiceType() {
        return this.TargetServiceType;
    }

    /**
     * Set 目标数据源类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetServiceType 目标数据源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetServiceType(String TargetServiceType) {
        this.TargetServiceType = TargetServiceType;
    }

    /**
     * Get 子任务列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TasksStr 子任务列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTasksStr() {
        return this.TasksStr;
    }

    /**
     * Set 子任务列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param TasksStr 子任务列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTasksStr(String TasksStr) {
        this.TasksStr = TasksStr;
    }

    /**
     * Get 任务版本是否已提交
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Submit 任务版本是否已提交
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSubmit() {
        return this.Submit;
    }

    /**
     * Set 任务版本是否已提交
注意：此字段可能返回 null，表示取不到有效值。
     * @param Submit 任务版本是否已提交
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubmit(Boolean Submit) {
        this.Submit = Submit;
    }

    public TaskOpsDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskOpsDto(TaskOpsDto source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.VirtualTaskId != null) {
            this.VirtualTaskId = new String(source.VirtualTaskId);
        }
        if (source.VirtualFlag != null) {
            this.VirtualFlag = new Boolean(source.VirtualFlag);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.RealWorkflowId != null) {
            this.RealWorkflowId = new String(source.RealWorkflowId);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.FolderName != null) {
            this.FolderName = new String(source.FolderName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.LastUpdate != null) {
            this.LastUpdate = new String(source.LastUpdate);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.InCharge != null) {
            this.InCharge = new String(source.InCharge);
        }
        if (source.InChargeId != null) {
            this.InChargeId = new String(source.InChargeId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ExecutionStartTime != null) {
            this.ExecutionStartTime = new String(source.ExecutionStartTime);
        }
        if (source.ExecutionEndTime != null) {
            this.ExecutionEndTime = new String(source.ExecutionEndTime);
        }
        if (source.CycleType != null) {
            this.CycleType = new String(source.CycleType);
        }
        if (source.CycleStep != null) {
            this.CycleStep = new Long(source.CycleStep);
        }
        if (source.CrontabExpression != null) {
            this.CrontabExpression = new String(source.CrontabExpression);
        }
        if (source.DelayTime != null) {
            this.DelayTime = new Long(source.DelayTime);
        }
        if (source.StartupTime != null) {
            this.StartupTime = new Long(source.StartupTime);
        }
        if (source.RetryWait != null) {
            this.RetryWait = new Long(source.RetryWait);
        }
        if (source.RetryAble != null) {
            this.RetryAble = new Long(source.RetryAble);
        }
        if (source.TaskAction != null) {
            this.TaskAction = new String(source.TaskAction);
        }
        if (source.TryLimit != null) {
            this.TryLimit = new Long(source.TryLimit);
        }
        if (source.RunPriority != null) {
            this.RunPriority = new Long(source.RunPriority);
        }
        if (source.TaskType != null) {
            this.TaskType = new TaskTypeOpsDto(source.TaskType);
        }
        if (source.BrokerIp != null) {
            this.BrokerIp = new String(source.BrokerIp);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.MinDateTime != null) {
            this.MinDateTime = new String(source.MinDateTime);
        }
        if (source.MaxDateTime != null) {
            this.MaxDateTime = new String(source.MaxDateTime);
        }
        if (source.ExecutionTTL != null) {
            this.ExecutionTTL = new Long(source.ExecutionTTL);
        }
        if (source.SelfDepend != null) {
            this.SelfDepend = new String(source.SelfDepend);
        }
        if (source.LeftCoordinate != null) {
            this.LeftCoordinate = new Float(source.LeftCoordinate);
        }
        if (source.TopCoordinate != null) {
            this.TopCoordinate = new Float(source.TopCoordinate);
        }
        if (source.Notes != null) {
            this.Notes = new String(source.Notes);
        }
        if (source.InstanceInitStrategy != null) {
            this.InstanceInitStrategy = new String(source.InstanceInitStrategy);
        }
        if (source.YarnQueue != null) {
            this.YarnQueue = new String(source.YarnQueue);
        }
        if (source.LastSchedulerCommitTime != null) {
            this.LastSchedulerCommitTime = new String(source.LastSchedulerCommitTime);
        }
        if (source.NormalizedJobStartTime != null) {
            this.NormalizedJobStartTime = new String(source.NormalizedJobStartTime);
        }
        if (source.SchedulerDesc != null) {
            this.SchedulerDesc = new String(source.SchedulerDesc);
        }
        if (source.ResourceGroup != null) {
            this.ResourceGroup = new String(source.ResourceGroup);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.DependencyRel != null) {
            this.DependencyRel = new String(source.DependencyRel);
        }
        if (source.DependencyWorkflow != null) {
            this.DependencyWorkflow = new String(source.DependencyWorkflow);
        }
        if (source.EventListenerConfig != null) {
            this.EventListenerConfig = new String(source.EventListenerConfig);
        }
        if (source.EventPublisherConfig != null) {
            this.EventPublisherConfig = new String(source.EventPublisherConfig);
        }
        if (source.VirtualTaskStatus != null) {
            this.VirtualTaskStatus = new String(source.VirtualTaskStatus);
        }
        if (source.TaskLinkInfo != null) {
            this.TaskLinkInfo = new LinkOpsDto(source.TaskLinkInfo);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
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
        if (source.OwnId != null) {
            this.OwnId = new String(source.OwnId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.TenantId != null) {
            this.TenantId = new String(source.TenantId);
        }
        if (source.UpdateUser != null) {
            this.UpdateUser = new String(source.UpdateUser);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.UpdateUserId != null) {
            this.UpdateUserId = new String(source.UpdateUserId);
        }
        if (source.TaskTypeId != null) {
            this.TaskTypeId = new Long(source.TaskTypeId);
        }
        if (source.TaskTypeDesc != null) {
            this.TaskTypeDesc = new String(source.TaskTypeDesc);
        }
        if (source.ShowWorkflow != null) {
            this.ShowWorkflow = new Boolean(source.ShowWorkflow);
        }
        if (source.FirstSubmitTime != null) {
            this.FirstSubmitTime = new String(source.FirstSubmitTime);
        }
        if (source.FirstRunTime != null) {
            this.FirstRunTime = new String(source.FirstRunTime);
        }
        if (source.ScheduleDesc != null) {
            this.ScheduleDesc = new String(source.ScheduleDesc);
        }
        if (source.CycleNum != null) {
            this.CycleNum = new Long(source.CycleNum);
        }
        if (source.Crontab != null) {
            this.Crontab = new String(source.Crontab);
        }
        if (source.StartDate != null) {
            this.StartDate = new String(source.StartDate);
        }
        if (source.EndDate != null) {
            this.EndDate = new String(source.EndDate);
        }
        if (source.CycleUnit != null) {
            this.CycleUnit = new String(source.CycleUnit);
        }
        if (source.InitStrategy != null) {
            this.InitStrategy = new String(source.InitStrategy);
        }
        if (source.Layer != null) {
            this.Layer = new String(source.Layer);
        }
        if (source.SourceServiceId != null) {
            this.SourceServiceId = new String(source.SourceServiceId);
        }
        if (source.SourceServiceType != null) {
            this.SourceServiceType = new String(source.SourceServiceType);
        }
        if (source.TargetServiceId != null) {
            this.TargetServiceId = new String(source.TargetServiceId);
        }
        if (source.TargetServiceType != null) {
            this.TargetServiceType = new String(source.TargetServiceType);
        }
        if (source.TasksStr != null) {
            this.TasksStr = new String(source.TasksStr);
        }
        if (source.Submit != null) {
            this.Submit = new Boolean(source.Submit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "VirtualTaskId", this.VirtualTaskId);
        this.setParamSimple(map, prefix + "VirtualFlag", this.VirtualFlag);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "RealWorkflowId", this.RealWorkflowId);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "FolderName", this.FolderName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "LastUpdate", this.LastUpdate);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "InCharge", this.InCharge);
        this.setParamSimple(map, prefix + "InChargeId", this.InChargeId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ExecutionStartTime", this.ExecutionStartTime);
        this.setParamSimple(map, prefix + "ExecutionEndTime", this.ExecutionEndTime);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "CycleStep", this.CycleStep);
        this.setParamSimple(map, prefix + "CrontabExpression", this.CrontabExpression);
        this.setParamSimple(map, prefix + "DelayTime", this.DelayTime);
        this.setParamSimple(map, prefix + "StartupTime", this.StartupTime);
        this.setParamSimple(map, prefix + "RetryWait", this.RetryWait);
        this.setParamSimple(map, prefix + "RetryAble", this.RetryAble);
        this.setParamSimple(map, prefix + "TaskAction", this.TaskAction);
        this.setParamSimple(map, prefix + "TryLimit", this.TryLimit);
        this.setParamSimple(map, prefix + "RunPriority", this.RunPriority);
        this.setParamObj(map, prefix + "TaskType.", this.TaskType);
        this.setParamSimple(map, prefix + "BrokerIp", this.BrokerIp);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "MinDateTime", this.MinDateTime);
        this.setParamSimple(map, prefix + "MaxDateTime", this.MaxDateTime);
        this.setParamSimple(map, prefix + "ExecutionTTL", this.ExecutionTTL);
        this.setParamSimple(map, prefix + "SelfDepend", this.SelfDepend);
        this.setParamSimple(map, prefix + "LeftCoordinate", this.LeftCoordinate);
        this.setParamSimple(map, prefix + "TopCoordinate", this.TopCoordinate);
        this.setParamSimple(map, prefix + "Notes", this.Notes);
        this.setParamSimple(map, prefix + "InstanceInitStrategy", this.InstanceInitStrategy);
        this.setParamSimple(map, prefix + "YarnQueue", this.YarnQueue);
        this.setParamSimple(map, prefix + "LastSchedulerCommitTime", this.LastSchedulerCommitTime);
        this.setParamSimple(map, prefix + "NormalizedJobStartTime", this.NormalizedJobStartTime);
        this.setParamSimple(map, prefix + "SchedulerDesc", this.SchedulerDesc);
        this.setParamSimple(map, prefix + "ResourceGroup", this.ResourceGroup);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "DependencyRel", this.DependencyRel);
        this.setParamSimple(map, prefix + "DependencyWorkflow", this.DependencyWorkflow);
        this.setParamSimple(map, prefix + "EventListenerConfig", this.EventListenerConfig);
        this.setParamSimple(map, prefix + "EventPublisherConfig", this.EventPublisherConfig);
        this.setParamSimple(map, prefix + "VirtualTaskStatus", this.VirtualTaskStatus);
        this.setParamObj(map, prefix + "TaskLinkInfo.", this.TaskLinkInfo);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectIdent", this.ProjectIdent);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "OwnId", this.OwnId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "TenantId", this.TenantId);
        this.setParamSimple(map, prefix + "UpdateUser", this.UpdateUser);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "UpdateUserId", this.UpdateUserId);
        this.setParamSimple(map, prefix + "TaskTypeId", this.TaskTypeId);
        this.setParamSimple(map, prefix + "TaskTypeDesc", this.TaskTypeDesc);
        this.setParamSimple(map, prefix + "ShowWorkflow", this.ShowWorkflow);
        this.setParamSimple(map, prefix + "FirstSubmitTime", this.FirstSubmitTime);
        this.setParamSimple(map, prefix + "FirstRunTime", this.FirstRunTime);
        this.setParamSimple(map, prefix + "ScheduleDesc", this.ScheduleDesc);
        this.setParamSimple(map, prefix + "CycleNum", this.CycleNum);
        this.setParamSimple(map, prefix + "Crontab", this.Crontab);
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "CycleUnit", this.CycleUnit);
        this.setParamSimple(map, prefix + "InitStrategy", this.InitStrategy);
        this.setParamSimple(map, prefix + "Layer", this.Layer);
        this.setParamSimple(map, prefix + "SourceServiceId", this.SourceServiceId);
        this.setParamSimple(map, prefix + "SourceServiceType", this.SourceServiceType);
        this.setParamSimple(map, prefix + "TargetServiceId", this.TargetServiceId);
        this.setParamSimple(map, prefix + "TargetServiceType", this.TargetServiceType);
        this.setParamSimple(map, prefix + "TasksStr", this.TasksStr);
        this.setParamSimple(map, prefix + "Submit", this.Submit);

    }
}

