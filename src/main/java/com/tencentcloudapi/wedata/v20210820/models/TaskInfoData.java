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

public class TaskInfoData extends AbstractModel{

    /**
    * 任务Id
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
    * 工作流id
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
    * 项目名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 项目标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectIdent")
    @Expose
    private String ProjectIdent;

    /**
    * 任务状态，'Y','F','O','T','INVALID' 分别表示调度中、已停止、已暂停、停止中、已失效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 项目id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 文件夹名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FolderName")
    @Expose
    private String FolderName;

    /**
    * 文件夹id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * 负责人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InCharge")
    @Expose
    private String InCharge;

    /**
    * 跨工作流虚拟任务标识；true标识跨工作流任务；false标识本工作流任务
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VirtualFlag")
    @Expose
    private Boolean VirtualFlag;

    /**
    * 延时实例生成时间(延时调度)，转换为分钟
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DelayTime")
    @Expose
    private Long DelayTime;

    /**
    * crontab表达式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CrontabExpression")
    @Expose
    private String CrontabExpression;

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
    @SerializedName("LastUpdate")
    @Expose
    private String LastUpdate;

    /**
    * 生效日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束日期
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
    private Long CycleType;

    /**
    * 步长
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CycleStep")
    @Expose
    private Long CycleStep;

    /**
    * 延时执行时间（延时执行) 对应为 开始时间 状态为分钟
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartupTime")
    @Expose
    private Long StartupTime;

    /**
    * 重试等待时间,单位分钟
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RetryWait")
    @Expose
    private Long RetryWait;

    /**
    * 是否可重试
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Retriable")
    @Expose
    private Long Retriable;

    /**
    * 调度扩展信息
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
    private Long TaskType;

    /**
    * 指定的运行节点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BrokerIp")
    @Expose
    private String BrokerIp;

    /**
    * 集群
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
    * 是否自身依赖 是1 否2 并行3
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SelfDepend")
    @Expose
    private Long SelfDepend;

    /**
    * 扩展属性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskExt")
    @Expose
    private TaskExtInfo [] TaskExt;

    /**
    * 任务备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Notes")
    @Expose
    private String Notes;

    /**
    * 队列
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("YarnQueue")
    @Expose
    private String YarnQueue;

    /**
    * 任务版本是否已提交
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Submit")
    @Expose
    private Boolean Submit;

    /**
    * 最新调度计划变更时间 仅生产态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastSchedulerCommitTime")
    @Expose
    private String LastSchedulerCommitTime;

    /**
    * 仅生产态存储于生产态序列化任务信息, 减少base CPU重复密集计算
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NormalizedJobStartTime")
    @Expose
    private String NormalizedJobStartTime;

    /**
    * 源数据源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceServer")
    @Expose
    private String SourceServer;

    /**
    * 创建者
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Creater")
    @Expose
    private String Creater;

    /**
    * 分支，依赖关系，and/or, 默认and
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DependencyRel")
    @Expose
    private String DependencyRel;

    /**
    * 是否支持工作流依赖 yes / no 默认 no
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DependencyWorkflow")
    @Expose
    private String DependencyWorkflow;

    /**
    * 任务参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Params")
    @Expose
    private ParamInfo [] Params;

    /**
    * 最后修改的人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateUser")
    @Expose
    private String UpdateUser;

    /**
    * 最后修改的时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 最后修改的人Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateUserId")
    @Expose
    private String UpdateUserId;

    /**
    * 调度计划
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchedulerDesc")
    @Expose
    private String SchedulerDesc;

    /**
    * 资源组信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroup")
    @Expose
    private String ResourceGroup;

    /**
    * 版本提交说明
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionDesc")
    @Expose
    private String VersionDesc;

    /**
    * 真实工作流Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RealWorkflowId")
    @Expose
    private String RealWorkflowId;

    /**
    * 目标数据源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetServer")
    @Expose
    private String TargetServer;

    /**
    * 依赖配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DependencyConfigs")
    @Expose
    private DependencyConfig [] DependencyConfigs;

    /**
    * 虚拟任务状态1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VirtualTaskStatus")
    @Expose
    private String VirtualTaskStatus;

    /**
    * 虚拟任务id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VirtualTaskId")
    @Expose
    private String VirtualTaskId;

    /**
     * Get 任务Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 任务Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 任务Id
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
     * Get 任务状态，'Y','F','O','T','INVALID' 分别表示调度中、已停止、已暂停、停止中、已失效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 任务状态，'Y','F','O','T','INVALID' 分别表示调度中、已停止、已暂停、停止中、已失效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态，'Y','F','O','T','INVALID' 分别表示调度中、已停止、已暂停、停止中、已失效
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 任务状态，'Y','F','O','T','INVALID' 分别表示调度中、已停止、已暂停、停止中、已失效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
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
     * Get 跨工作流虚拟任务标识；true标识跨工作流任务；false标识本工作流任务
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VirtualFlag 跨工作流虚拟任务标识；true标识跨工作流任务；false标识本工作流任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getVirtualFlag() {
        return this.VirtualFlag;
    }

    /**
     * Set 跨工作流虚拟任务标识；true标识跨工作流任务；false标识本工作流任务
注意：此字段可能返回 null，表示取不到有效值。
     * @param VirtualFlag 跨工作流虚拟任务标识；true标识跨工作流任务；false标识本工作流任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVirtualFlag(Boolean VirtualFlag) {
        this.VirtualFlag = VirtualFlag;
    }

    /**
     * Get 延时实例生成时间(延时调度)，转换为分钟
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DelayTime 延时实例生成时间(延时调度)，转换为分钟
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDelayTime() {
        return this.DelayTime;
    }

    /**
     * Set 延时实例生成时间(延时调度)，转换为分钟
注意：此字段可能返回 null，表示取不到有效值。
     * @param DelayTime 延时实例生成时间(延时调度)，转换为分钟
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDelayTime(Long DelayTime) {
        this.DelayTime = DelayTime;
    }

    /**
     * Get crontab表达式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CrontabExpression crontab表达式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCrontabExpression() {
        return this.CrontabExpression;
    }

    /**
     * Set crontab表达式
注意：此字段可能返回 null，表示取不到有效值。
     * @param CrontabExpression crontab表达式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCrontabExpression(String CrontabExpression) {
        this.CrontabExpression = CrontabExpression;
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
     * @return LastUpdate 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastUpdate() {
        return this.LastUpdate;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastUpdate 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastUpdate(String LastUpdate) {
        this.LastUpdate = LastUpdate;
    }

    /**
     * Get 生效日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 生效日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 生效日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 生效日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 结束日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 结束日期
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
    public Long getCycleType() {
        return this.CycleType;
    }

    /**
     * Set 周期类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param CycleType 周期类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCycleType(Long CycleType) {
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
     * Get 延时执行时间（延时执行) 对应为 开始时间 状态为分钟
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartupTime 延时执行时间（延时执行) 对应为 开始时间 状态为分钟
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStartupTime() {
        return this.StartupTime;
    }

    /**
     * Set 延时执行时间（延时执行) 对应为 开始时间 状态为分钟
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartupTime 延时执行时间（延时执行) 对应为 开始时间 状态为分钟
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartupTime(Long StartupTime) {
        this.StartupTime = StartupTime;
    }

    /**
     * Get 重试等待时间,单位分钟
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RetryWait 重试等待时间,单位分钟
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRetryWait() {
        return this.RetryWait;
    }

    /**
     * Set 重试等待时间,单位分钟
注意：此字段可能返回 null，表示取不到有效值。
     * @param RetryWait 重试等待时间,单位分钟
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRetryWait(Long RetryWait) {
        this.RetryWait = RetryWait;
    }

    /**
     * Get 是否可重试
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Retriable 是否可重试
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRetriable() {
        return this.Retriable;
    }

    /**
     * Set 是否可重试
注意：此字段可能返回 null，表示取不到有效值。
     * @param Retriable 是否可重试
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRetriable(Long Retriable) {
        this.Retriable = Retriable;
    }

    /**
     * Get 调度扩展信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskAction 调度扩展信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskAction() {
        return this.TaskAction;
    }

    /**
     * Set 调度扩展信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskAction 调度扩展信息
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
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskType 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskType(Long TaskType) {
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
     * Get 集群
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId 集群
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId 集群
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
     * Get 是否自身依赖 是1 否2 并行3
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SelfDepend 是否自身依赖 是1 否2 并行3
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSelfDepend() {
        return this.SelfDepend;
    }

    /**
     * Set 是否自身依赖 是1 否2 并行3
注意：此字段可能返回 null，表示取不到有效值。
     * @param SelfDepend 是否自身依赖 是1 否2 并行3
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSelfDepend(Long SelfDepend) {
        this.SelfDepend = SelfDepend;
    }

    /**
     * Get 扩展属性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskExt 扩展属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskExtInfo [] getTaskExt() {
        return this.TaskExt;
    }

    /**
     * Set 扩展属性
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskExt 扩展属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskExt(TaskExtInfo [] TaskExt) {
        this.TaskExt = TaskExt;
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
     * Get 队列
注意：此字段可能返回 null，表示取不到有效值。 
     * @return YarnQueue 队列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getYarnQueue() {
        return this.YarnQueue;
    }

    /**
     * Set 队列
注意：此字段可能返回 null，表示取不到有效值。
     * @param YarnQueue 队列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setYarnQueue(String YarnQueue) {
        this.YarnQueue = YarnQueue;
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

    /**
     * Get 最新调度计划变更时间 仅生产态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastSchedulerCommitTime 最新调度计划变更时间 仅生产态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastSchedulerCommitTime() {
        return this.LastSchedulerCommitTime;
    }

    /**
     * Set 最新调度计划变更时间 仅生产态
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastSchedulerCommitTime 最新调度计划变更时间 仅生产态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastSchedulerCommitTime(String LastSchedulerCommitTime) {
        this.LastSchedulerCommitTime = LastSchedulerCommitTime;
    }

    /**
     * Get 仅生产态存储于生产态序列化任务信息, 减少base CPU重复密集计算
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NormalizedJobStartTime 仅生产态存储于生产态序列化任务信息, 减少base CPU重复密集计算
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNormalizedJobStartTime() {
        return this.NormalizedJobStartTime;
    }

    /**
     * Set 仅生产态存储于生产态序列化任务信息, 减少base CPU重复密集计算
注意：此字段可能返回 null，表示取不到有效值。
     * @param NormalizedJobStartTime 仅生产态存储于生产态序列化任务信息, 减少base CPU重复密集计算
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNormalizedJobStartTime(String NormalizedJobStartTime) {
        this.NormalizedJobStartTime = NormalizedJobStartTime;
    }

    /**
     * Get 源数据源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceServer 源数据源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceServer() {
        return this.SourceServer;
    }

    /**
     * Set 源数据源
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceServer 源数据源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceServer(String SourceServer) {
        this.SourceServer = SourceServer;
    }

    /**
     * Get 创建者
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Creater 创建者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreater() {
        return this.Creater;
    }

    /**
     * Set 创建者
注意：此字段可能返回 null，表示取不到有效值。
     * @param Creater 创建者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreater(String Creater) {
        this.Creater = Creater;
    }

    /**
     * Get 分支，依赖关系，and/or, 默认and
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DependencyRel 分支，依赖关系，and/or, 默认and
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDependencyRel() {
        return this.DependencyRel;
    }

    /**
     * Set 分支，依赖关系，and/or, 默认and
注意：此字段可能返回 null，表示取不到有效值。
     * @param DependencyRel 分支，依赖关系，and/or, 默认and
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDependencyRel(String DependencyRel) {
        this.DependencyRel = DependencyRel;
    }

    /**
     * Get 是否支持工作流依赖 yes / no 默认 no
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DependencyWorkflow 是否支持工作流依赖 yes / no 默认 no
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDependencyWorkflow() {
        return this.DependencyWorkflow;
    }

    /**
     * Set 是否支持工作流依赖 yes / no 默认 no
注意：此字段可能返回 null，表示取不到有效值。
     * @param DependencyWorkflow 是否支持工作流依赖 yes / no 默认 no
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDependencyWorkflow(String DependencyWorkflow) {
        this.DependencyWorkflow = DependencyWorkflow;
    }

    /**
     * Get 任务参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Params 任务参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ParamInfo [] getParams() {
        return this.Params;
    }

    /**
     * Set 任务参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Params 任务参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParams(ParamInfo [] Params) {
        this.Params = Params;
    }

    /**
     * Get 最后修改的人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateUser 最后修改的人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateUser() {
        return this.UpdateUser;
    }

    /**
     * Set 最后修改的人
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateUser 最后修改的人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateUser(String UpdateUser) {
        this.UpdateUser = UpdateUser;
    }

    /**
     * Get 最后修改的时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 最后修改的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 最后修改的时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 最后修改的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 最后修改的人Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateUserId 最后修改的人Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateUserId() {
        return this.UpdateUserId;
    }

    /**
     * Set 最后修改的人Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateUserId 最后修改的人Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateUserId(String UpdateUserId) {
        this.UpdateUserId = UpdateUserId;
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
     * Get 资源组信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroup 资源组信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroup() {
        return this.ResourceGroup;
    }

    /**
     * Set 资源组信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroup 资源组信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroup(String ResourceGroup) {
        this.ResourceGroup = ResourceGroup;
    }

    /**
     * Get 版本提交说明
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionDesc 版本提交说明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersionDesc() {
        return this.VersionDesc;
    }

    /**
     * Set 版本提交说明
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionDesc 版本提交说明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionDesc(String VersionDesc) {
        this.VersionDesc = VersionDesc;
    }

    /**
     * Get 真实工作流Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RealWorkflowId 真实工作流Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRealWorkflowId() {
        return this.RealWorkflowId;
    }

    /**
     * Set 真实工作流Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealWorkflowId 真实工作流Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRealWorkflowId(String RealWorkflowId) {
        this.RealWorkflowId = RealWorkflowId;
    }

    /**
     * Get 目标数据源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetServer 目标数据源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetServer() {
        return this.TargetServer;
    }

    /**
     * Set 目标数据源
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetServer 目标数据源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetServer(String TargetServer) {
        this.TargetServer = TargetServer;
    }

    /**
     * Get 依赖配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DependencyConfigs 依赖配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DependencyConfig [] getDependencyConfigs() {
        return this.DependencyConfigs;
    }

    /**
     * Set 依赖配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param DependencyConfigs 依赖配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDependencyConfigs(DependencyConfig [] DependencyConfigs) {
        this.DependencyConfigs = DependencyConfigs;
    }

    /**
     * Get 虚拟任务状态1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VirtualTaskStatus 虚拟任务状态1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVirtualTaskStatus() {
        return this.VirtualTaskStatus;
    }

    /**
     * Set 虚拟任务状态1
注意：此字段可能返回 null，表示取不到有效值。
     * @param VirtualTaskStatus 虚拟任务状态1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVirtualTaskStatus(String VirtualTaskStatus) {
        this.VirtualTaskStatus = VirtualTaskStatus;
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

    public TaskInfoData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskInfoData(TaskInfoData source) {
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
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.ProjectIdent != null) {
            this.ProjectIdent = new String(source.ProjectIdent);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.FolderName != null) {
            this.FolderName = new String(source.FolderName);
        }
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.InCharge != null) {
            this.InCharge = new String(source.InCharge);
        }
        if (source.VirtualFlag != null) {
            this.VirtualFlag = new Boolean(source.VirtualFlag);
        }
        if (source.DelayTime != null) {
            this.DelayTime = new Long(source.DelayTime);
        }
        if (source.CrontabExpression != null) {
            this.CrontabExpression = new String(source.CrontabExpression);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.LastUpdate != null) {
            this.LastUpdate = new String(source.LastUpdate);
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
            this.CycleType = new Long(source.CycleType);
        }
        if (source.CycleStep != null) {
            this.CycleStep = new Long(source.CycleStep);
        }
        if (source.StartupTime != null) {
            this.StartupTime = new Long(source.StartupTime);
        }
        if (source.RetryWait != null) {
            this.RetryWait = new Long(source.RetryWait);
        }
        if (source.Retriable != null) {
            this.Retriable = new Long(source.Retriable);
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
            this.TaskType = new Long(source.TaskType);
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
        if (source.SelfDepend != null) {
            this.SelfDepend = new Long(source.SelfDepend);
        }
        if (source.TaskExt != null) {
            this.TaskExt = new TaskExtInfo[source.TaskExt.length];
            for (int i = 0; i < source.TaskExt.length; i++) {
                this.TaskExt[i] = new TaskExtInfo(source.TaskExt[i]);
            }
        }
        if (source.Notes != null) {
            this.Notes = new String(source.Notes);
        }
        if (source.YarnQueue != null) {
            this.YarnQueue = new String(source.YarnQueue);
        }
        if (source.Submit != null) {
            this.Submit = new Boolean(source.Submit);
        }
        if (source.LastSchedulerCommitTime != null) {
            this.LastSchedulerCommitTime = new String(source.LastSchedulerCommitTime);
        }
        if (source.NormalizedJobStartTime != null) {
            this.NormalizedJobStartTime = new String(source.NormalizedJobStartTime);
        }
        if (source.SourceServer != null) {
            this.SourceServer = new String(source.SourceServer);
        }
        if (source.Creater != null) {
            this.Creater = new String(source.Creater);
        }
        if (source.DependencyRel != null) {
            this.DependencyRel = new String(source.DependencyRel);
        }
        if (source.DependencyWorkflow != null) {
            this.DependencyWorkflow = new String(source.DependencyWorkflow);
        }
        if (source.Params != null) {
            this.Params = new ParamInfo[source.Params.length];
            for (int i = 0; i < source.Params.length; i++) {
                this.Params[i] = new ParamInfo(source.Params[i]);
            }
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
        if (source.SchedulerDesc != null) {
            this.SchedulerDesc = new String(source.SchedulerDesc);
        }
        if (source.ResourceGroup != null) {
            this.ResourceGroup = new String(source.ResourceGroup);
        }
        if (source.VersionDesc != null) {
            this.VersionDesc = new String(source.VersionDesc);
        }
        if (source.RealWorkflowId != null) {
            this.RealWorkflowId = new String(source.RealWorkflowId);
        }
        if (source.TargetServer != null) {
            this.TargetServer = new String(source.TargetServer);
        }
        if (source.DependencyConfigs != null) {
            this.DependencyConfigs = new DependencyConfig[source.DependencyConfigs.length];
            for (int i = 0; i < source.DependencyConfigs.length; i++) {
                this.DependencyConfigs[i] = new DependencyConfig(source.DependencyConfigs[i]);
            }
        }
        if (source.VirtualTaskStatus != null) {
            this.VirtualTaskStatus = new String(source.VirtualTaskStatus);
        }
        if (source.VirtualTaskId != null) {
            this.VirtualTaskId = new String(source.VirtualTaskId);
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
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "ProjectIdent", this.ProjectIdent);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "FolderName", this.FolderName);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "InCharge", this.InCharge);
        this.setParamSimple(map, prefix + "VirtualFlag", this.VirtualFlag);
        this.setParamSimple(map, prefix + "DelayTime", this.DelayTime);
        this.setParamSimple(map, prefix + "CrontabExpression", this.CrontabExpression);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "LastUpdate", this.LastUpdate);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ExecutionStartTime", this.ExecutionStartTime);
        this.setParamSimple(map, prefix + "ExecutionEndTime", this.ExecutionEndTime);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "CycleStep", this.CycleStep);
        this.setParamSimple(map, prefix + "StartupTime", this.StartupTime);
        this.setParamSimple(map, prefix + "RetryWait", this.RetryWait);
        this.setParamSimple(map, prefix + "Retriable", this.Retriable);
        this.setParamSimple(map, prefix + "TaskAction", this.TaskAction);
        this.setParamSimple(map, prefix + "TryLimit", this.TryLimit);
        this.setParamSimple(map, prefix + "RunPriority", this.RunPriority);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "BrokerIp", this.BrokerIp);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "MinDateTime", this.MinDateTime);
        this.setParamSimple(map, prefix + "MaxDateTime", this.MaxDateTime);
        this.setParamSimple(map, prefix + "SelfDepend", this.SelfDepend);
        this.setParamArrayObj(map, prefix + "TaskExt.", this.TaskExt);
        this.setParamSimple(map, prefix + "Notes", this.Notes);
        this.setParamSimple(map, prefix + "YarnQueue", this.YarnQueue);
        this.setParamSimple(map, prefix + "Submit", this.Submit);
        this.setParamSimple(map, prefix + "LastSchedulerCommitTime", this.LastSchedulerCommitTime);
        this.setParamSimple(map, prefix + "NormalizedJobStartTime", this.NormalizedJobStartTime);
        this.setParamSimple(map, prefix + "SourceServer", this.SourceServer);
        this.setParamSimple(map, prefix + "Creater", this.Creater);
        this.setParamSimple(map, prefix + "DependencyRel", this.DependencyRel);
        this.setParamSimple(map, prefix + "DependencyWorkflow", this.DependencyWorkflow);
        this.setParamArrayObj(map, prefix + "Params.", this.Params);
        this.setParamSimple(map, prefix + "UpdateUser", this.UpdateUser);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "UpdateUserId", this.UpdateUserId);
        this.setParamSimple(map, prefix + "SchedulerDesc", this.SchedulerDesc);
        this.setParamSimple(map, prefix + "ResourceGroup", this.ResourceGroup);
        this.setParamSimple(map, prefix + "VersionDesc", this.VersionDesc);
        this.setParamSimple(map, prefix + "RealWorkflowId", this.RealWorkflowId);
        this.setParamSimple(map, prefix + "TargetServer", this.TargetServer);
        this.setParamArrayObj(map, prefix + "DependencyConfigs.", this.DependencyConfigs);
        this.setParamSimple(map, prefix + "VirtualTaskStatus", this.VirtualTaskStatus);
        this.setParamSimple(map, prefix + "VirtualTaskId", this.VirtualTaskId);

    }
}

