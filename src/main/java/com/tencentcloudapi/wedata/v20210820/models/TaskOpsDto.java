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

public class TaskOpsDto extends AbstractModel {

    /**
    * <p>任务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>虚拟任务id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VirtualTaskId")
    @Expose
    private String VirtualTaskId;

    /**
    * <p>虚拟任务标记</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VirtualFlag")
    @Expose
    private Boolean VirtualFlag;

    /**
    * <p>任务名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>工作流id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * <p>任务为虚拟任务时，任务所在的真实工作流Id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RealWorkflowId")
    @Expose
    private String RealWorkflowId;

    /**
    * <p>工作流名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * <p>文件夹id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * <p>文件夹名字</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FolderName")
    @Expose
    private String FolderName;

    /**
    * <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>最近更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastUpdate")
    @Expose
    private String LastUpdate;

    /**
    * <p>任务状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>责任人</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InCharge")
    @Expose
    private String InCharge;

    /**
    * <p>责任人用户id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InChargeId")
    @Expose
    private String InChargeId;

    /**
    * <p>调度生效日期</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>调度结束日期</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>执行时间左闭区间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionStartTime")
    @Expose
    private String ExecutionStartTime;

    /**
    * <p>执行时间右闭区间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionEndTime")
    @Expose
    private String ExecutionEndTime;

    /**
    * <p>周期类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * <p>步长</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CycleStep")
    @Expose
    private Long CycleStep;

    /**
    * <p>调度cron表达式</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CrontabExpression")
    @Expose
    private String CrontabExpression;

    /**
    * <p>延时执行时间，unit=分钟</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DelayTime")
    @Expose
    private Long DelayTime;

    /**
    * <p>开始执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartupTime")
    @Expose
    private Long StartupTime;

    /**
    * <p>重试等待时间, unit=分钟</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RetryWait")
    @Expose
    private Long RetryWait;

    /**
    * <p>是否可重试，1 代表可以重试</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RetryAble")
    @Expose
    private Long RetryAble;

    /**
    * <p>调度配置-弹性周期配置，小时/周/月/年调度才有，小时任务指定每天的0点3点4点跑，则为&#39;0,3,4&#39;</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskAction")
    @Expose
    private String TaskAction;

    /**
    * <p>运行次数限制</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TryLimit")
    @Expose
    private Long TryLimit;

    /**
    * <p>运行优先级</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunPriority")
    @Expose
    private Long RunPriority;

    /**
    * <p>任务类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskType")
    @Expose
    private TaskTypeOpsDto TaskType;

    /**
    * <p>指定的运行节点</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BrokerIp")
    @Expose
    private String BrokerIp;

    /**
    * <p>集群name</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>最小数据时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MinDateTime")
    @Expose
    private String MinDateTime;

    /**
    * <p>最大数据时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxDateTime")
    @Expose
    private String MaxDateTime;

    /**
    * <p>运行耗时超时时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionTTL")
    @Expose
    private Long ExecutionTTL;

    /**
    * <p>自依赖类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SelfDepend")
    @Expose
    private String SelfDepend;

    /**
    * <p>左侧坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LeftCoordinate")
    @Expose
    private Float LeftCoordinate;

    /**
    * <p>顶部坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopCoordinate")
    @Expose
    private Float TopCoordinate;

    /**
    * <p>任务备注</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Notes")
    @Expose
    private String Notes;

    /**
    * <p>任务初始化策略</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceInitStrategy")
    @Expose
    private String InstanceInitStrategy;

    /**
    * <p>计算队列</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("YarnQueue")
    @Expose
    private String YarnQueue;

    /**
    * <p>最新调度提交时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastSchedulerCommitTime")
    @Expose
    private String LastSchedulerCommitTime;

    /**
    * <p>按cron表达式计算的任务开始执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NormalizedJobStartTime")
    @Expose
    private String NormalizedJobStartTime;

    /**
    * <p>调度计划描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchedulerDesc")
    @Expose
    private String SchedulerDesc;

    /**
    * <p>计算资源组</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroup")
    @Expose
    private String ResourceGroup;

    /**
    * <p>任务创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * <p>任务依赖类型 and、or</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DependencyRel")
    @Expose
    private String DependencyRel;

    /**
    * <p>任务工作流依赖 yes、no</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DependencyWorkflow")
    @Expose
    private String DependencyWorkflow;

    /**
    * <p>事件监听配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventListenerConfig")
    @Expose
    private String EventListenerConfig;

    /**
    * <p>事件驱动配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventPublisherConfig")
    @Expose
    private String EventPublisherConfig;

    /**
    * <p>虚拟任务状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VirtualTaskStatus")
    @Expose
    private String VirtualTaskStatus;

    /**
    * <p>任务依赖边详情</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskLinkInfo")
    @Expose
    private LinkOpsDto TaskLinkInfo;

    /**
    * <p>任务产品类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * <p>项目id</p>
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
    * <p>主账户userId</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnId")
    @Expose
    private String OwnId;

    /**
    * <p>用户userId</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>租户id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TenantId")
    @Expose
    private String TenantId;

    /**
    * <p>更新人昵称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateUser")
    @Expose
    private String UpdateUser;

    /**
    * <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>更新人userId</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateUserId")
    @Expose
    private String UpdateUserId;

    /**
    * <p>任务类型id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskTypeId")
    @Expose
    private Long TaskTypeId;

    /**
    * <p>任务类型描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskTypeDesc")
    @Expose
    private String TaskTypeDesc;

    /**
    * <p>是否展示工作流</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShowWorkflow")
    @Expose
    private Boolean ShowWorkflow;

    /**
    * <p>首次提交时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FirstSubmitTime")
    @Expose
    private String FirstSubmitTime;

    /**
    * <p>首次运行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FirstRunTime")
    @Expose
    private String FirstRunTime;

    /**
    * <p>调度描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScheduleDesc")
    @Expose
    private String ScheduleDesc;

    /**
    * <p>周期</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CycleNum")
    @Expose
    private Long CycleNum;

    /**
    * <p>表达式</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Crontab")
    @Expose
    private String Crontab;

    /**
    * <p>开始日期</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * <p>结束日期</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * <p>周期单位</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CycleUnit")
    @Expose
    private String CycleUnit;

    /**
    * <p>初始化策略</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InitStrategy")
    @Expose
    private String InitStrategy;

    /**
    * <p>层级</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Layer")
    @Expose
    private String Layer;

    /**
    * <p>来源数据源ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceServiceId")
    @Expose
    private String SourceServiceId;

    /**
    * <p>来源数据源类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceServiceType")
    @Expose
    private String SourceServiceType;

    /**
    * <p>目标数据源ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetServiceId")
    @Expose
    private String TargetServiceId;

    /**
    * <p>目标数据源类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetServiceType")
    @Expose
    private String TargetServiceType;

    /**
    * <p>子任务列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TasksStr")
    @Expose
    private String TasksStr;

    /**
    * <p>任务版本是否已提交</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Submit")
    @Expose
    private Boolean Submit;

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
    * <p>任务扩展信息(目前返沪离线同步的任务详情)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskExtInfo")
    @Expose
    private String TaskExtInfo;

    /**
    * <p>任务绑定的事件信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventListenerInfos")
    @Expose
    private AiOpsEventListenerDTO [] EventListenerInfos;

    /**
    * <p>脚本信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScriptInfo")
    @Expose
    private AiopsScriptInfo ScriptInfo;

    /**
    * <p>DLC资源配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DLCResourceConfig")
    @Expose
    private AiopsDLCResourceConfigDto DLCResourceConfig;

    /**
    * <p>父任务simple信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentTaskInfos")
    @Expose
    private AiopsSimpleTaskDto ParentTaskInfos;

    /**
    * <p>资源获取标识</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtResourceFlag")
    @Expose
    private ExtResourceFlagDto ExtResourceFlag;

    /**
    * <p>父任务simple信息(新)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NewParentTaskInfos")
    @Expose
    private AiopsSimpleTaskDto [] NewParentTaskInfos;

    /**
    * <p>任务自依赖类型：<br>yes： 任务需满足自依赖<br>no：任务无需满足自依赖</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SelfWorkFlowDependType")
    @Expose
    private String SelfWorkFlowDependType;

    /**
    * <p>允许重跑类型，ALL 表示无论实例运行成功还是失败都允许重跑，NONE表示无论成功或者失败都不允许重跑，FAILURE 表示只有运行失败才能重跑</p>
    */
    @SerializedName("AllowRedoType")
    @Expose
    private String AllowRedoType;

    /**
    * <p>负责人Id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerId")
    @Expose
    private String OwnerId;

    /**
    * <p>当前用户对该任务的权限列表， 当前支持<br>CAN_MANAGE : 有权限管理操作</p>
    */
    @SerializedName("Privileges")
    @Expose
    private String [] Privileges;

    /**
    * <p>bundle客户端唯一id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * <p>bundle客户端信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BundleInfo")
    @Expose
    private String BundleInfo;

    /**
    * <p>工作流类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowType")
    @Expose
    private String WorkflowType;

    /**
    * <p>任务扩展信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskExtDTO")
    @Expose
    private TaskExtOpsDto TaskExtDTO;

    /**
    * <p>任务时区</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScheduleTimeZone")
    @Expose
    private String ScheduleTimeZone;

    /**
    * <p>代理任务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxyTaskId")
    @Expose
    private String ProxyTaskId;

    /**
    * <p>代理任务类型ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxyTaskTypeId")
    @Expose
    private Long ProxyTaskTypeId;

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
     * Get <p>虚拟任务id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VirtualTaskId <p>虚拟任务id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVirtualTaskId() {
        return this.VirtualTaskId;
    }

    /**
     * Set <p>虚拟任务id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VirtualTaskId <p>虚拟任务id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVirtualTaskId(String VirtualTaskId) {
        this.VirtualTaskId = VirtualTaskId;
    }

    /**
     * Get <p>虚拟任务标记</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VirtualFlag <p>虚拟任务标记</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getVirtualFlag() {
        return this.VirtualFlag;
    }

    /**
     * Set <p>虚拟任务标记</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VirtualFlag <p>虚拟任务标记</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVirtualFlag(Boolean VirtualFlag) {
        this.VirtualFlag = VirtualFlag;
    }

    /**
     * Get <p>任务名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskName <p>任务名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>任务名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskName <p>任务名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>工作流id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowId <p>工作流id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set <p>工作流id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowId <p>工作流id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get <p>任务为虚拟任务时，任务所在的真实工作流Id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RealWorkflowId <p>任务为虚拟任务时，任务所在的真实工作流Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRealWorkflowId() {
        return this.RealWorkflowId;
    }

    /**
     * Set <p>任务为虚拟任务时，任务所在的真实工作流Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealWorkflowId <p>任务为虚拟任务时，任务所在的真实工作流Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRealWorkflowId(String RealWorkflowId) {
        this.RealWorkflowId = RealWorkflowId;
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
     * Get <p>文件夹id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FolderId <p>文件夹id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set <p>文件夹id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FolderId <p>文件夹id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get <p>文件夹名字</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FolderName <p>文件夹名字</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFolderName() {
        return this.FolderName;
    }

    /**
     * Set <p>文件夹名字</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FolderName <p>文件夹名字</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFolderName(String FolderName) {
        this.FolderName = FolderName;
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
     * Get <p>最近更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastUpdate <p>最近更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastUpdate() {
        return this.LastUpdate;
    }

    /**
     * Set <p>最近更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastUpdate <p>最近更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastUpdate(String LastUpdate) {
        this.LastUpdate = LastUpdate;
    }

    /**
     * Get <p>任务状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>任务状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>任务状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>责任人</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InCharge <p>责任人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInCharge() {
        return this.InCharge;
    }

    /**
     * Set <p>责任人</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InCharge <p>责任人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInCharge(String InCharge) {
        this.InCharge = InCharge;
    }

    /**
     * Get <p>责任人用户id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InChargeId <p>责任人用户id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInChargeId() {
        return this.InChargeId;
    }

    /**
     * Set <p>责任人用户id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InChargeId <p>责任人用户id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInChargeId(String InChargeId) {
        this.InChargeId = InChargeId;
    }

    /**
     * Get <p>调度生效日期</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime <p>调度生效日期</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>调度生效日期</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime <p>调度生效日期</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>调度结束日期</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime <p>调度结束日期</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>调度结束日期</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime <p>调度结束日期</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>执行时间左闭区间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionStartTime <p>执行时间左闭区间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionStartTime() {
        return this.ExecutionStartTime;
    }

    /**
     * Set <p>执行时间左闭区间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionStartTime <p>执行时间左闭区间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionStartTime(String ExecutionStartTime) {
        this.ExecutionStartTime = ExecutionStartTime;
    }

    /**
     * Get <p>执行时间右闭区间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionEndTime <p>执行时间右闭区间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionEndTime() {
        return this.ExecutionEndTime;
    }

    /**
     * Set <p>执行时间右闭区间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionEndTime <p>执行时间右闭区间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionEndTime(String ExecutionEndTime) {
        this.ExecutionEndTime = ExecutionEndTime;
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
     * Get <p>步长</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CycleStep <p>步长</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCycleStep() {
        return this.CycleStep;
    }

    /**
     * Set <p>步长</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CycleStep <p>步长</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCycleStep(Long CycleStep) {
        this.CycleStep = CycleStep;
    }

    /**
     * Get <p>调度cron表达式</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CrontabExpression <p>调度cron表达式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCrontabExpression() {
        return this.CrontabExpression;
    }

    /**
     * Set <p>调度cron表达式</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CrontabExpression <p>调度cron表达式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCrontabExpression(String CrontabExpression) {
        this.CrontabExpression = CrontabExpression;
    }

    /**
     * Get <p>延时执行时间，unit=分钟</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DelayTime <p>延时执行时间，unit=分钟</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDelayTime() {
        return this.DelayTime;
    }

    /**
     * Set <p>延时执行时间，unit=分钟</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DelayTime <p>延时执行时间，unit=分钟</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDelayTime(Long DelayTime) {
        this.DelayTime = DelayTime;
    }

    /**
     * Get <p>开始执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartupTime <p>开始执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStartupTime() {
        return this.StartupTime;
    }

    /**
     * Set <p>开始执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartupTime <p>开始执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartupTime(Long StartupTime) {
        this.StartupTime = StartupTime;
    }

    /**
     * Get <p>重试等待时间, unit=分钟</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RetryWait <p>重试等待时间, unit=分钟</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRetryWait() {
        return this.RetryWait;
    }

    /**
     * Set <p>重试等待时间, unit=分钟</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RetryWait <p>重试等待时间, unit=分钟</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRetryWait(Long RetryWait) {
        this.RetryWait = RetryWait;
    }

    /**
     * Get <p>是否可重试，1 代表可以重试</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RetryAble <p>是否可重试，1 代表可以重试</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRetryAble() {
        return this.RetryAble;
    }

    /**
     * Set <p>是否可重试，1 代表可以重试</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RetryAble <p>是否可重试，1 代表可以重试</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRetryAble(Long RetryAble) {
        this.RetryAble = RetryAble;
    }

    /**
     * Get <p>调度配置-弹性周期配置，小时/周/月/年调度才有，小时任务指定每天的0点3点4点跑，则为&#39;0,3,4&#39;</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskAction <p>调度配置-弹性周期配置，小时/周/月/年调度才有，小时任务指定每天的0点3点4点跑，则为&#39;0,3,4&#39;</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskAction() {
        return this.TaskAction;
    }

    /**
     * Set <p>调度配置-弹性周期配置，小时/周/月/年调度才有，小时任务指定每天的0点3点4点跑，则为&#39;0,3,4&#39;</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskAction <p>调度配置-弹性周期配置，小时/周/月/年调度才有，小时任务指定每天的0点3点4点跑，则为&#39;0,3,4&#39;</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskAction(String TaskAction) {
        this.TaskAction = TaskAction;
    }

    /**
     * Get <p>运行次数限制</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TryLimit <p>运行次数限制</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTryLimit() {
        return this.TryLimit;
    }

    /**
     * Set <p>运行次数限制</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TryLimit <p>运行次数限制</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTryLimit(Long TryLimit) {
        this.TryLimit = TryLimit;
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
     * Get <p>指定的运行节点</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BrokerIp <p>指定的运行节点</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBrokerIp() {
        return this.BrokerIp;
    }

    /**
     * Set <p>指定的运行节点</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BrokerIp <p>指定的运行节点</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBrokerIp(String BrokerIp) {
        this.BrokerIp = BrokerIp;
    }

    /**
     * Get <p>集群name</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId <p>集群name</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群name</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId <p>集群name</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>最小数据时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MinDateTime <p>最小数据时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMinDateTime() {
        return this.MinDateTime;
    }

    /**
     * Set <p>最小数据时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MinDateTime <p>最小数据时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMinDateTime(String MinDateTime) {
        this.MinDateTime = MinDateTime;
    }

    /**
     * Get <p>最大数据时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxDateTime <p>最大数据时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMaxDateTime() {
        return this.MaxDateTime;
    }

    /**
     * Set <p>最大数据时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxDateTime <p>最大数据时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxDateTime(String MaxDateTime) {
        this.MaxDateTime = MaxDateTime;
    }

    /**
     * Get <p>运行耗时超时时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionTTL <p>运行耗时超时时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExecutionTTL() {
        return this.ExecutionTTL;
    }

    /**
     * Set <p>运行耗时超时时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionTTL <p>运行耗时超时时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionTTL(Long ExecutionTTL) {
        this.ExecutionTTL = ExecutionTTL;
    }

    /**
     * Get <p>自依赖类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SelfDepend <p>自依赖类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSelfDepend() {
        return this.SelfDepend;
    }

    /**
     * Set <p>自依赖类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SelfDepend <p>自依赖类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSelfDepend(String SelfDepend) {
        this.SelfDepend = SelfDepend;
    }

    /**
     * Get <p>左侧坐标</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LeftCoordinate <p>左侧坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getLeftCoordinate() {
        return this.LeftCoordinate;
    }

    /**
     * Set <p>左侧坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LeftCoordinate <p>左侧坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLeftCoordinate(Float LeftCoordinate) {
        this.LeftCoordinate = LeftCoordinate;
    }

    /**
     * Get <p>顶部坐标</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopCoordinate <p>顶部坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTopCoordinate() {
        return this.TopCoordinate;
    }

    /**
     * Set <p>顶部坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopCoordinate <p>顶部坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopCoordinate(Float TopCoordinate) {
        this.TopCoordinate = TopCoordinate;
    }

    /**
     * Get <p>任务备注</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Notes <p>任务备注</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNotes() {
        return this.Notes;
    }

    /**
     * Set <p>任务备注</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Notes <p>任务备注</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNotes(String Notes) {
        this.Notes = Notes;
    }

    /**
     * Get <p>任务初始化策略</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceInitStrategy <p>任务初始化策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceInitStrategy() {
        return this.InstanceInitStrategy;
    }

    /**
     * Set <p>任务初始化策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceInitStrategy <p>任务初始化策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceInitStrategy(String InstanceInitStrategy) {
        this.InstanceInitStrategy = InstanceInitStrategy;
    }

    /**
     * Get <p>计算队列</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return YarnQueue <p>计算队列</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getYarnQueue() {
        return this.YarnQueue;
    }

    /**
     * Set <p>计算队列</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param YarnQueue <p>计算队列</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setYarnQueue(String YarnQueue) {
        this.YarnQueue = YarnQueue;
    }

    /**
     * Get <p>最新调度提交时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastSchedulerCommitTime <p>最新调度提交时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastSchedulerCommitTime() {
        return this.LastSchedulerCommitTime;
    }

    /**
     * Set <p>最新调度提交时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastSchedulerCommitTime <p>最新调度提交时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastSchedulerCommitTime(String LastSchedulerCommitTime) {
        this.LastSchedulerCommitTime = LastSchedulerCommitTime;
    }

    /**
     * Get <p>按cron表达式计算的任务开始执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NormalizedJobStartTime <p>按cron表达式计算的任务开始执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNormalizedJobStartTime() {
        return this.NormalizedJobStartTime;
    }

    /**
     * Set <p>按cron表达式计算的任务开始执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NormalizedJobStartTime <p>按cron表达式计算的任务开始执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNormalizedJobStartTime(String NormalizedJobStartTime) {
        this.NormalizedJobStartTime = NormalizedJobStartTime;
    }

    /**
     * Get <p>调度计划描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchedulerDesc <p>调度计划描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSchedulerDesc() {
        return this.SchedulerDesc;
    }

    /**
     * Set <p>调度计划描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchedulerDesc <p>调度计划描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchedulerDesc(String SchedulerDesc) {
        this.SchedulerDesc = SchedulerDesc;
    }

    /**
     * Get <p>计算资源组</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroup <p>计算资源组</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroup() {
        return this.ResourceGroup;
    }

    /**
     * Set <p>计算资源组</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroup <p>计算资源组</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroup(String ResourceGroup) {
        this.ResourceGroup = ResourceGroup;
    }

    /**
     * Get <p>任务创建人</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Creator <p>任务创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set <p>任务创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Creator <p>任务创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get <p>任务依赖类型 and、or</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DependencyRel <p>任务依赖类型 and、or</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDependencyRel() {
        return this.DependencyRel;
    }

    /**
     * Set <p>任务依赖类型 and、or</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DependencyRel <p>任务依赖类型 and、or</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDependencyRel(String DependencyRel) {
        this.DependencyRel = DependencyRel;
    }

    /**
     * Get <p>任务工作流依赖 yes、no</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DependencyWorkflow <p>任务工作流依赖 yes、no</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDependencyWorkflow() {
        return this.DependencyWorkflow;
    }

    /**
     * Set <p>任务工作流依赖 yes、no</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DependencyWorkflow <p>任务工作流依赖 yes、no</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDependencyWorkflow(String DependencyWorkflow) {
        this.DependencyWorkflow = DependencyWorkflow;
    }

    /**
     * Get <p>事件监听配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventListenerConfig <p>事件监听配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventListenerConfig() {
        return this.EventListenerConfig;
    }

    /**
     * Set <p>事件监听配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventListenerConfig <p>事件监听配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventListenerConfig(String EventListenerConfig) {
        this.EventListenerConfig = EventListenerConfig;
    }

    /**
     * Get <p>事件驱动配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventPublisherConfig <p>事件驱动配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventPublisherConfig() {
        return this.EventPublisherConfig;
    }

    /**
     * Set <p>事件驱动配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventPublisherConfig <p>事件驱动配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventPublisherConfig(String EventPublisherConfig) {
        this.EventPublisherConfig = EventPublisherConfig;
    }

    /**
     * Get <p>虚拟任务状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VirtualTaskStatus <p>虚拟任务状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVirtualTaskStatus() {
        return this.VirtualTaskStatus;
    }

    /**
     * Set <p>虚拟任务状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VirtualTaskStatus <p>虚拟任务状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVirtualTaskStatus(String VirtualTaskStatus) {
        this.VirtualTaskStatus = VirtualTaskStatus;
    }

    /**
     * Get <p>任务依赖边详情</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskLinkInfo <p>任务依赖边详情</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LinkOpsDto getTaskLinkInfo() {
        return this.TaskLinkInfo;
    }

    /**
     * Set <p>任务依赖边详情</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskLinkInfo <p>任务依赖边详情</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskLinkInfo(LinkOpsDto TaskLinkInfo) {
        this.TaskLinkInfo = TaskLinkInfo;
    }

    /**
     * Get <p>任务产品类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductName <p>任务产品类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set <p>任务产品类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductName <p>任务产品类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get <p>项目id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId <p>项目id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId <p>项目id</p>
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
     * Get <p>主账户userId</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnId <p>主账户userId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnId() {
        return this.OwnId;
    }

    /**
     * Set <p>主账户userId</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnId <p>主账户userId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnId(String OwnId) {
        this.OwnId = OwnId;
    }

    /**
     * Get <p>用户userId</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserId <p>用户userId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>用户userId</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserId <p>用户userId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
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
     * Get <p>更新人昵称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateUser <p>更新人昵称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateUser() {
        return this.UpdateUser;
    }

    /**
     * Set <p>更新人昵称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateUser <p>更新人昵称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateUser(String UpdateUser) {
        this.UpdateUser = UpdateUser;
    }

    /**
     * Get <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>更新人userId</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateUserId <p>更新人userId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateUserId() {
        return this.UpdateUserId;
    }

    /**
     * Set <p>更新人userId</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateUserId <p>更新人userId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateUserId(String UpdateUserId) {
        this.UpdateUserId = UpdateUserId;
    }

    /**
     * Get <p>任务类型id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskTypeId <p>任务类型id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskTypeId() {
        return this.TaskTypeId;
    }

    /**
     * Set <p>任务类型id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskTypeId <p>任务类型id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskTypeId(Long TaskTypeId) {
        this.TaskTypeId = TaskTypeId;
    }

    /**
     * Get <p>任务类型描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskTypeDesc <p>任务类型描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskTypeDesc() {
        return this.TaskTypeDesc;
    }

    /**
     * Set <p>任务类型描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskTypeDesc <p>任务类型描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskTypeDesc(String TaskTypeDesc) {
        this.TaskTypeDesc = TaskTypeDesc;
    }

    /**
     * Get <p>是否展示工作流</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShowWorkflow <p>是否展示工作流</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getShowWorkflow() {
        return this.ShowWorkflow;
    }

    /**
     * Set <p>是否展示工作流</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShowWorkflow <p>是否展示工作流</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShowWorkflow(Boolean ShowWorkflow) {
        this.ShowWorkflow = ShowWorkflow;
    }

    /**
     * Get <p>首次提交时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FirstSubmitTime <p>首次提交时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFirstSubmitTime() {
        return this.FirstSubmitTime;
    }

    /**
     * Set <p>首次提交时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FirstSubmitTime <p>首次提交时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFirstSubmitTime(String FirstSubmitTime) {
        this.FirstSubmitTime = FirstSubmitTime;
    }

    /**
     * Get <p>首次运行时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FirstRunTime <p>首次运行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFirstRunTime() {
        return this.FirstRunTime;
    }

    /**
     * Set <p>首次运行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FirstRunTime <p>首次运行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFirstRunTime(String FirstRunTime) {
        this.FirstRunTime = FirstRunTime;
    }

    /**
     * Get <p>调度描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScheduleDesc <p>调度描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScheduleDesc() {
        return this.ScheduleDesc;
    }

    /**
     * Set <p>调度描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScheduleDesc <p>调度描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheduleDesc(String ScheduleDesc) {
        this.ScheduleDesc = ScheduleDesc;
    }

    /**
     * Get <p>周期</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CycleNum <p>周期</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCycleNum() {
        return this.CycleNum;
    }

    /**
     * Set <p>周期</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CycleNum <p>周期</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCycleNum(Long CycleNum) {
        this.CycleNum = CycleNum;
    }

    /**
     * Get <p>表达式</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Crontab <p>表达式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCrontab() {
        return this.Crontab;
    }

    /**
     * Set <p>表达式</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Crontab <p>表达式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCrontab(String Crontab) {
        this.Crontab = Crontab;
    }

    /**
     * Get <p>开始日期</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartDate <p>开始日期</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set <p>开始日期</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartDate <p>开始日期</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get <p>结束日期</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndDate <p>结束日期</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set <p>结束日期</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndDate <p>结束日期</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get <p>周期单位</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CycleUnit <p>周期单位</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCycleUnit() {
        return this.CycleUnit;
    }

    /**
     * Set <p>周期单位</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CycleUnit <p>周期单位</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCycleUnit(String CycleUnit) {
        this.CycleUnit = CycleUnit;
    }

    /**
     * Get <p>初始化策略</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InitStrategy <p>初始化策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInitStrategy() {
        return this.InitStrategy;
    }

    /**
     * Set <p>初始化策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InitStrategy <p>初始化策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInitStrategy(String InitStrategy) {
        this.InitStrategy = InitStrategy;
    }

    /**
     * Get <p>层级</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Layer <p>层级</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLayer() {
        return this.Layer;
    }

    /**
     * Set <p>层级</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Layer <p>层级</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLayer(String Layer) {
        this.Layer = Layer;
    }

    /**
     * Get <p>来源数据源ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceServiceId <p>来源数据源ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceServiceId() {
        return this.SourceServiceId;
    }

    /**
     * Set <p>来源数据源ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceServiceId <p>来源数据源ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceServiceId(String SourceServiceId) {
        this.SourceServiceId = SourceServiceId;
    }

    /**
     * Get <p>来源数据源类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceServiceType <p>来源数据源类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceServiceType() {
        return this.SourceServiceType;
    }

    /**
     * Set <p>来源数据源类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceServiceType <p>来源数据源类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceServiceType(String SourceServiceType) {
        this.SourceServiceType = SourceServiceType;
    }

    /**
     * Get <p>目标数据源ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetServiceId <p>目标数据源ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetServiceId() {
        return this.TargetServiceId;
    }

    /**
     * Set <p>目标数据源ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetServiceId <p>目标数据源ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetServiceId(String TargetServiceId) {
        this.TargetServiceId = TargetServiceId;
    }

    /**
     * Get <p>目标数据源类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetServiceType <p>目标数据源类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetServiceType() {
        return this.TargetServiceType;
    }

    /**
     * Set <p>目标数据源类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetServiceType <p>目标数据源类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetServiceType(String TargetServiceType) {
        this.TargetServiceType = TargetServiceType;
    }

    /**
     * Get <p>子任务列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TasksStr <p>子任务列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTasksStr() {
        return this.TasksStr;
    }

    /**
     * Set <p>子任务列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TasksStr <p>子任务列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTasksStr(String TasksStr) {
        this.TasksStr = TasksStr;
    }

    /**
     * Get <p>任务版本是否已提交</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Submit <p>任务版本是否已提交</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSubmit() {
        return this.Submit;
    }

    /**
     * Set <p>任务版本是否已提交</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Submit <p>任务版本是否已提交</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubmit(Boolean Submit) {
        this.Submit = Submit;
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
     * Get <p>任务扩展信息(目前返沪离线同步的任务详情)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskExtInfo <p>任务扩展信息(目前返沪离线同步的任务详情)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskExtInfo() {
        return this.TaskExtInfo;
    }

    /**
     * Set <p>任务扩展信息(目前返沪离线同步的任务详情)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskExtInfo <p>任务扩展信息(目前返沪离线同步的任务详情)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskExtInfo(String TaskExtInfo) {
        this.TaskExtInfo = TaskExtInfo;
    }

    /**
     * Get <p>任务绑定的事件信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventListenerInfos <p>任务绑定的事件信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiOpsEventListenerDTO [] getEventListenerInfos() {
        return this.EventListenerInfos;
    }

    /**
     * Set <p>任务绑定的事件信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventListenerInfos <p>任务绑定的事件信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventListenerInfos(AiOpsEventListenerDTO [] EventListenerInfos) {
        this.EventListenerInfos = EventListenerInfos;
    }

    /**
     * Get <p>脚本信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScriptInfo <p>脚本信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiopsScriptInfo getScriptInfo() {
        return this.ScriptInfo;
    }

    /**
     * Set <p>脚本信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScriptInfo <p>脚本信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScriptInfo(AiopsScriptInfo ScriptInfo) {
        this.ScriptInfo = ScriptInfo;
    }

    /**
     * Get <p>DLC资源配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DLCResourceConfig <p>DLC资源配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiopsDLCResourceConfigDto getDLCResourceConfig() {
        return this.DLCResourceConfig;
    }

    /**
     * Set <p>DLC资源配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DLCResourceConfig <p>DLC资源配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDLCResourceConfig(AiopsDLCResourceConfigDto DLCResourceConfig) {
        this.DLCResourceConfig = DLCResourceConfig;
    }

    /**
     * Get <p>父任务simple信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentTaskInfos <p>父任务simple信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiopsSimpleTaskDto getParentTaskInfos() {
        return this.ParentTaskInfos;
    }

    /**
     * Set <p>父任务simple信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentTaskInfos <p>父任务simple信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentTaskInfos(AiopsSimpleTaskDto ParentTaskInfos) {
        this.ParentTaskInfos = ParentTaskInfos;
    }

    /**
     * Get <p>资源获取标识</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtResourceFlag <p>资源获取标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExtResourceFlagDto getExtResourceFlag() {
        return this.ExtResourceFlag;
    }

    /**
     * Set <p>资源获取标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtResourceFlag <p>资源获取标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtResourceFlag(ExtResourceFlagDto ExtResourceFlag) {
        this.ExtResourceFlag = ExtResourceFlag;
    }

    /**
     * Get <p>父任务simple信息(新)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NewParentTaskInfos <p>父任务simple信息(新)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiopsSimpleTaskDto [] getNewParentTaskInfos() {
        return this.NewParentTaskInfos;
    }

    /**
     * Set <p>父任务simple信息(新)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NewParentTaskInfos <p>父任务simple信息(新)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNewParentTaskInfos(AiopsSimpleTaskDto [] NewParentTaskInfos) {
        this.NewParentTaskInfos = NewParentTaskInfos;
    }

    /**
     * Get <p>任务自依赖类型：<br>yes： 任务需满足自依赖<br>no：任务无需满足自依赖</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SelfWorkFlowDependType <p>任务自依赖类型：<br>yes： 任务需满足自依赖<br>no：任务无需满足自依赖</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSelfWorkFlowDependType() {
        return this.SelfWorkFlowDependType;
    }

    /**
     * Set <p>任务自依赖类型：<br>yes： 任务需满足自依赖<br>no：任务无需满足自依赖</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SelfWorkFlowDependType <p>任务自依赖类型：<br>yes： 任务需满足自依赖<br>no：任务无需满足自依赖</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSelfWorkFlowDependType(String SelfWorkFlowDependType) {
        this.SelfWorkFlowDependType = SelfWorkFlowDependType;
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
     * Get <p>负责人Id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerId <p>负责人Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerId() {
        return this.OwnerId;
    }

    /**
     * Set <p>负责人Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerId <p>负责人Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerId(String OwnerId) {
        this.OwnerId = OwnerId;
    }

    /**
     * Get <p>当前用户对该任务的权限列表， 当前支持<br>CAN_MANAGE : 有权限管理操作</p> 
     * @return Privileges <p>当前用户对该任务的权限列表， 当前支持<br>CAN_MANAGE : 有权限管理操作</p>
     */
    public String [] getPrivileges() {
        return this.Privileges;
    }

    /**
     * Set <p>当前用户对该任务的权限列表， 当前支持<br>CAN_MANAGE : 有权限管理操作</p>
     * @param Privileges <p>当前用户对该任务的权限列表， 当前支持<br>CAN_MANAGE : 有权限管理操作</p>
     */
    public void setPrivileges(String [] Privileges) {
        this.Privileges = Privileges;
    }

    /**
     * Get <p>bundle客户端唯一id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BundleId <p>bundle客户端唯一id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set <p>bundle客户端唯一id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BundleId <p>bundle客户端唯一id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    /**
     * Get <p>bundle客户端信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BundleInfo <p>bundle客户端信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBundleInfo() {
        return this.BundleInfo;
    }

    /**
     * Set <p>bundle客户端信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BundleInfo <p>bundle客户端信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBundleInfo(String BundleInfo) {
        this.BundleInfo = BundleInfo;
    }

    /**
     * Get <p>工作流类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowType <p>工作流类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowType() {
        return this.WorkflowType;
    }

    /**
     * Set <p>工作流类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowType <p>工作流类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowType(String WorkflowType) {
        this.WorkflowType = WorkflowType;
    }

    /**
     * Get <p>任务扩展信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskExtDTO <p>任务扩展信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskExtOpsDto getTaskExtDTO() {
        return this.TaskExtDTO;
    }

    /**
     * Set <p>任务扩展信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskExtDTO <p>任务扩展信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskExtDTO(TaskExtOpsDto TaskExtDTO) {
        this.TaskExtDTO = TaskExtDTO;
    }

    /**
     * Get <p>任务时区</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScheduleTimeZone <p>任务时区</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScheduleTimeZone() {
        return this.ScheduleTimeZone;
    }

    /**
     * Set <p>任务时区</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScheduleTimeZone <p>任务时区</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheduleTimeZone(String ScheduleTimeZone) {
        this.ScheduleTimeZone = ScheduleTimeZone;
    }

    /**
     * Get <p>代理任务ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxyTaskId <p>代理任务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProxyTaskId() {
        return this.ProxyTaskId;
    }

    /**
     * Set <p>代理任务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxyTaskId <p>代理任务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxyTaskId(String ProxyTaskId) {
        this.ProxyTaskId = ProxyTaskId;
    }

    /**
     * Get <p>代理任务类型ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxyTaskTypeId <p>代理任务类型ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProxyTaskTypeId() {
        return this.ProxyTaskTypeId;
    }

    /**
     * Set <p>代理任务类型ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxyTaskTypeId <p>代理任务类型ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxyTaskTypeId(Long ProxyTaskTypeId) {
        this.ProxyTaskTypeId = ProxyTaskTypeId;
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
        if (source.ExecutorGroupId != null) {
            this.ExecutorGroupId = new String(source.ExecutorGroupId);
        }
        if (source.ExecutorGroupName != null) {
            this.ExecutorGroupName = new String(source.ExecutorGroupName);
        }
        if (source.TaskExtInfo != null) {
            this.TaskExtInfo = new String(source.TaskExtInfo);
        }
        if (source.EventListenerInfos != null) {
            this.EventListenerInfos = new AiOpsEventListenerDTO[source.EventListenerInfos.length];
            for (int i = 0; i < source.EventListenerInfos.length; i++) {
                this.EventListenerInfos[i] = new AiOpsEventListenerDTO(source.EventListenerInfos[i]);
            }
        }
        if (source.ScriptInfo != null) {
            this.ScriptInfo = new AiopsScriptInfo(source.ScriptInfo);
        }
        if (source.DLCResourceConfig != null) {
            this.DLCResourceConfig = new AiopsDLCResourceConfigDto(source.DLCResourceConfig);
        }
        if (source.ParentTaskInfos != null) {
            this.ParentTaskInfos = new AiopsSimpleTaskDto(source.ParentTaskInfos);
        }
        if (source.ExtResourceFlag != null) {
            this.ExtResourceFlag = new ExtResourceFlagDto(source.ExtResourceFlag);
        }
        if (source.NewParentTaskInfos != null) {
            this.NewParentTaskInfos = new AiopsSimpleTaskDto[source.NewParentTaskInfos.length];
            for (int i = 0; i < source.NewParentTaskInfos.length; i++) {
                this.NewParentTaskInfos[i] = new AiopsSimpleTaskDto(source.NewParentTaskInfos[i]);
            }
        }
        if (source.SelfWorkFlowDependType != null) {
            this.SelfWorkFlowDependType = new String(source.SelfWorkFlowDependType);
        }
        if (source.AllowRedoType != null) {
            this.AllowRedoType = new String(source.AllowRedoType);
        }
        if (source.OwnerId != null) {
            this.OwnerId = new String(source.OwnerId);
        }
        if (source.Privileges != null) {
            this.Privileges = new String[source.Privileges.length];
            for (int i = 0; i < source.Privileges.length; i++) {
                this.Privileges[i] = new String(source.Privileges[i]);
            }
        }
        if (source.BundleId != null) {
            this.BundleId = new String(source.BundleId);
        }
        if (source.BundleInfo != null) {
            this.BundleInfo = new String(source.BundleInfo);
        }
        if (source.WorkflowType != null) {
            this.WorkflowType = new String(source.WorkflowType);
        }
        if (source.TaskExtDTO != null) {
            this.TaskExtDTO = new TaskExtOpsDto(source.TaskExtDTO);
        }
        if (source.ScheduleTimeZone != null) {
            this.ScheduleTimeZone = new String(source.ScheduleTimeZone);
        }
        if (source.ProxyTaskId != null) {
            this.ProxyTaskId = new String(source.ProxyTaskId);
        }
        if (source.ProxyTaskTypeId != null) {
            this.ProxyTaskTypeId = new Long(source.ProxyTaskTypeId);
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
        this.setParamSimple(map, prefix + "ExecutorGroupId", this.ExecutorGroupId);
        this.setParamSimple(map, prefix + "ExecutorGroupName", this.ExecutorGroupName);
        this.setParamSimple(map, prefix + "TaskExtInfo", this.TaskExtInfo);
        this.setParamArrayObj(map, prefix + "EventListenerInfos.", this.EventListenerInfos);
        this.setParamObj(map, prefix + "ScriptInfo.", this.ScriptInfo);
        this.setParamObj(map, prefix + "DLCResourceConfig.", this.DLCResourceConfig);
        this.setParamObj(map, prefix + "ParentTaskInfos.", this.ParentTaskInfos);
        this.setParamObj(map, prefix + "ExtResourceFlag.", this.ExtResourceFlag);
        this.setParamArrayObj(map, prefix + "NewParentTaskInfos.", this.NewParentTaskInfos);
        this.setParamSimple(map, prefix + "SelfWorkFlowDependType", this.SelfWorkFlowDependType);
        this.setParamSimple(map, prefix + "AllowRedoType", this.AllowRedoType);
        this.setParamSimple(map, prefix + "OwnerId", this.OwnerId);
        this.setParamArraySimple(map, prefix + "Privileges.", this.Privileges);
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "BundleInfo", this.BundleInfo);
        this.setParamSimple(map, prefix + "WorkflowType", this.WorkflowType);
        this.setParamObj(map, prefix + "TaskExtDTO.", this.TaskExtDTO);
        this.setParamSimple(map, prefix + "ScheduleTimeZone", this.ScheduleTimeZone);
        this.setParamSimple(map, prefix + "ProxyTaskId", this.ProxyTaskId);
        this.setParamSimple(map, prefix + "ProxyTaskTypeId", this.ProxyTaskTypeId);

    }
}

