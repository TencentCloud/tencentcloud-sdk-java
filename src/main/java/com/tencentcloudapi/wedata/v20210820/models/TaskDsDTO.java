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

public class TaskDsDTO extends AbstractModel {

    /**
    * 任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 虚拟任务标记
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
    * 真实工作流id
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
    * 更新时间
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
    * 对于crontab类型调度配置其为用户输入 对于周期类型调度配置其为系统计算
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CrontabExpression")
    @Expose
    private String CrontabExpression;

    /**
    * 延时调度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DelayTime")
    @Expose
    private Long DelayTime;

    /**
    * 延时执行时间
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
    private TaskTypeDsVO TaskType;

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
    * 是否自身依赖 是1 否2 并行3
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SelfDepend")
    @Expose
    private String SelfDepend;

    /**
    * LeftCoordinate坐标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LeftCoordinate")
    @Expose
    private Float LeftCoordinate;

    /**
    * TopCoordinate坐标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopCoordinate")
    @Expose
    private Float TopCoordinate;

    /**
    * TaskExt信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskExt")
    @Expose
    private TaskExtDsVO TaskExt;

    /**
    * taskExt 导入导出json使用 private Map  properties;
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Properties")
    @Expose
    private String Properties;

    /**
    * 任务备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Notes")
    @Expose
    private String Notes;

    /**
    * 实例生成策略 T+1 表示当前周期生成上一周期数据时间任务实例 默认T+1 T+0 表示当前周期生成当前周期数据时间任务实例 T-1
     * 表示当前周期生成下一周期数据时间任务实例
     *
     * service不做默认策略处理, 下沉到数据初始化默认T+1, service涉及到多个更新task的路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceInitStrategy")
    @Expose
    private String InstanceInitStrategy;

    /**
    * 资源池队列名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("YarnQueue")
    @Expose
    private String YarnQueue;

    /**
    * 任务告警信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Alarms")
    @Expose
    private AlarmDsVO [] Alarms;

    /**
    * alarmDTO 导入导出json使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Alarm")
    @Expose
    private String Alarm;

    /**
    * 任务脚本是否发生变化
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScriptChange")
    @Expose
    private Boolean ScriptChange;

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
    * 启动暂停的任务时，选择不补录中间实例，通过此字段来标识从哪个时间开始生成实例
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecoverFreezeStartTime")
    @Expose
    private String RecoverFreezeStartTime;

    /**
    * 源数据源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceServer")
    @Expose
    private String SourceServer;

    /**
    * 目标数据源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetServer")
    @Expose
    private String TargetServer;

    /**
    * 父子节点树
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tasks")
    @Expose
    private TaskDsDTO [] Tasks;

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
    * 支持事件监听器配置导入导出
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventListenerConfig")
    @Expose
    private String EventListenerConfig;

    /**
    * 支持事件触发器配置导入导出
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventPublisherConfig")
    @Expose
    private String EventPublisherConfig;

    /**
    * 依赖配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DependencyConfigList")
    @Expose
    private DependencyConfigDsDTO [] DependencyConfigList;

    /**
    * 虚拟任务状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VirtualTaskStatus")
    @Expose
    private String VirtualTaskStatus;

    /**
    * 回收站还原提示语
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecycleTips")
    @Expose
    private String RecycleTips;

    /**
    * 回收站所属用户
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecycleUser")
    @Expose
    private String RecycleUser;

    /**
    * 新增 或 修改
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NewOrUpdate")
    @Expose
    private String NewOrUpdate;

    /**
    * 任务上游依赖信息 用于发布管理导入导出
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Params")
    @Expose
    private ParameterTaskDsDto [] Params;

    /**
    * 任务上游依赖信息 用于发布管理导入导出
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskLinkInfo")
    @Expose
    private TaskLinkDsDTO [] TaskLinkInfo;

    /**
    * 导入结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImportResult")
    @Expose
    private Boolean ImportResult;

    /**
    * 导入失败原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImportErrMsg")
    @Expose
    private String ImportErrMsg;

    /**
    * 任务内容 全部内容 配置内容 资源内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContentType")
    @Expose
    private String ContentType;

    /**
    * 是否导入提交运行
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskAutoSubmit")
    @Expose
    private Boolean TaskAutoSubmit;

    /**
    * 上层产品 数据质量 / 数据开发 / ...
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 创建者帐号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnId")
    @Expose
    private String OwnId;

    /**
    * 子账号
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
    * 最后修改的人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateUser")
    @Expose
    private String UpdateUser;

    /**
    * 最后修改时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 最后修改的人的ID
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
    * 资源组

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
    * 编排-删除添加的链接
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LinkId")
    @Expose
    private String LinkId;

    /**
    * 脚本引用关系
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserFileId")
    @Expose
    private String UserFileId;

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
    * 去向数据源ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetServiceId")
    @Expose
    private String TargetServiceId;

    /**
    * 去向数据源类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetServiceType")
    @Expose
    private String TargetServiceType;

    /**
    * 输入参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamInList")
    @Expose
    private ParameterTaskInDsDto [] ParamInList;

    /**
    * 输出参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamOutList")
    @Expose
    private ParameterTaskOutDsDto [] ParamOutList;

    /**
    * 任务文件夹id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskFolderId")
    @Expose
    private String TaskFolderId;

    /**
    * 最大尝试次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxRetryAttempts")
    @Expose
    private Long MaxRetryAttempts;

    /**
    * 资源组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroupName")
    @Expose
    private String ResourceGroupName;

    /**
    * 数据源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceServiceName")
    @Expose
    private String SourceServiceName;

    /**
    * 任务产出登记
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskRegisterOutputTable")
    @Expose
    private TaskDataRegistryDTO [] TaskRegisterOutputTable;

    /**
    * 循环依赖配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CycleDependencyConfigList")
    @Expose
    private TaskCycleLinkDTO [] CycleDependencyConfigList;

    /**
    * 特殊警告信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Warning")
    @Expose
    private String Warning;

    /**
    * 0 正常调度 1 空跑调度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScheduleRunType")
    @Expose
    private Long ScheduleRunType;

    /**
    * 0 并发度达到上限时，本次排队等待 1 并发度达到上限时，本次不执行，直接kill
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConcurrentStrategy")
    @Expose
    private Long ConcurrentStrategy;

    /**
    * UTC+8;UDC-8
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScheduleTimeZone")
    @Expose
    private String ScheduleTimeZone;

    /**
    * 引用的代码模版id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

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
     * Get 虚拟任务标记
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VirtualTaskId 虚拟任务标记
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVirtualTaskId() {
        return this.VirtualTaskId;
    }

    /**
     * Set 虚拟任务标记
注意：此字段可能返回 null，表示取不到有效值。
     * @param VirtualTaskId 虚拟任务标记
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
     * Get 真实工作流id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RealWorkflowId 真实工作流id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRealWorkflowId() {
        return this.RealWorkflowId;
    }

    /**
     * Set 真实工作流id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealWorkflowId 真实工作流id
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
     * Get 对于crontab类型调度配置其为用户输入 对于周期类型调度配置其为系统计算
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CrontabExpression 对于crontab类型调度配置其为用户输入 对于周期类型调度配置其为系统计算
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCrontabExpression() {
        return this.CrontabExpression;
    }

    /**
     * Set 对于crontab类型调度配置其为用户输入 对于周期类型调度配置其为系统计算
注意：此字段可能返回 null，表示取不到有效值。
     * @param CrontabExpression 对于crontab类型调度配置其为用户输入 对于周期类型调度配置其为系统计算
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCrontabExpression(String CrontabExpression) {
        this.CrontabExpression = CrontabExpression;
    }

    /**
     * Get 延时调度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DelayTime 延时调度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDelayTime() {
        return this.DelayTime;
    }

    /**
     * Set 延时调度
注意：此字段可能返回 null，表示取不到有效值。
     * @param DelayTime 延时调度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDelayTime(Long DelayTime) {
        this.DelayTime = DelayTime;
    }

    /**
     * Get 延时执行时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartupTime 延时执行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStartupTime() {
        return this.StartupTime;
    }

    /**
     * Set 延时执行时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartupTime 延时执行时间
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
    public TaskTypeDsVO getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskType 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskType(TaskTypeDsVO TaskType) {
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
     * Get 是否自身依赖 是1 否2 并行3
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SelfDepend 是否自身依赖 是1 否2 并行3
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSelfDepend() {
        return this.SelfDepend;
    }

    /**
     * Set 是否自身依赖 是1 否2 并行3
注意：此字段可能返回 null，表示取不到有效值。
     * @param SelfDepend 是否自身依赖 是1 否2 并行3
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSelfDepend(String SelfDepend) {
        this.SelfDepend = SelfDepend;
    }

    /**
     * Get LeftCoordinate坐标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LeftCoordinate LeftCoordinate坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getLeftCoordinate() {
        return this.LeftCoordinate;
    }

    /**
     * Set LeftCoordinate坐标
注意：此字段可能返回 null，表示取不到有效值。
     * @param LeftCoordinate LeftCoordinate坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLeftCoordinate(Float LeftCoordinate) {
        this.LeftCoordinate = LeftCoordinate;
    }

    /**
     * Get TopCoordinate坐标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopCoordinate TopCoordinate坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTopCoordinate() {
        return this.TopCoordinate;
    }

    /**
     * Set TopCoordinate坐标
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopCoordinate TopCoordinate坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopCoordinate(Float TopCoordinate) {
        this.TopCoordinate = TopCoordinate;
    }

    /**
     * Get TaskExt信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskExt TaskExt信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskExtDsVO getTaskExt() {
        return this.TaskExt;
    }

    /**
     * Set TaskExt信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskExt TaskExt信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskExt(TaskExtDsVO TaskExt) {
        this.TaskExt = TaskExt;
    }

    /**
     * Get taskExt 导入导出json使用 private Map  properties;
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Properties taskExt 导入导出json使用 private Map  properties;
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProperties() {
        return this.Properties;
    }

    /**
     * Set taskExt 导入导出json使用 private Map  properties;
注意：此字段可能返回 null，表示取不到有效值。
     * @param Properties taskExt 导入导出json使用 private Map  properties;
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProperties(String Properties) {
        this.Properties = Properties;
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
     * Get 实例生成策略 T+1 表示当前周期生成上一周期数据时间任务实例 默认T+1 T+0 表示当前周期生成当前周期数据时间任务实例 T-1
     * 表示当前周期生成下一周期数据时间任务实例
     *
     * service不做默认策略处理, 下沉到数据初始化默认T+1, service涉及到多个更新task的路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceInitStrategy 实例生成策略 T+1 表示当前周期生成上一周期数据时间任务实例 默认T+1 T+0 表示当前周期生成当前周期数据时间任务实例 T-1
     * 表示当前周期生成下一周期数据时间任务实例
     *
     * service不做默认策略处理, 下沉到数据初始化默认T+1, service涉及到多个更新task的路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceInitStrategy() {
        return this.InstanceInitStrategy;
    }

    /**
     * Set 实例生成策略 T+1 表示当前周期生成上一周期数据时间任务实例 默认T+1 T+0 表示当前周期生成当前周期数据时间任务实例 T-1
     * 表示当前周期生成下一周期数据时间任务实例
     *
     * service不做默认策略处理, 下沉到数据初始化默认T+1, service涉及到多个更新task的路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceInitStrategy 实例生成策略 T+1 表示当前周期生成上一周期数据时间任务实例 默认T+1 T+0 表示当前周期生成当前周期数据时间任务实例 T-1
     * 表示当前周期生成下一周期数据时间任务实例
     *
     * service不做默认策略处理, 下沉到数据初始化默认T+1, service涉及到多个更新task的路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceInitStrategy(String InstanceInitStrategy) {
        this.InstanceInitStrategy = InstanceInitStrategy;
    }

    /**
     * Get 资源池队列名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return YarnQueue 资源池队列名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getYarnQueue() {
        return this.YarnQueue;
    }

    /**
     * Set 资源池队列名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param YarnQueue 资源池队列名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setYarnQueue(String YarnQueue) {
        this.YarnQueue = YarnQueue;
    }

    /**
     * Get 任务告警信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Alarms 任务告警信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AlarmDsVO [] getAlarms() {
        return this.Alarms;
    }

    /**
     * Set 任务告警信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Alarms 任务告警信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarms(AlarmDsVO [] Alarms) {
        this.Alarms = Alarms;
    }

    /**
     * Get alarmDTO 导入导出json使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Alarm alarmDTO 导入导出json使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlarm() {
        return this.Alarm;
    }

    /**
     * Set alarmDTO 导入导出json使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param Alarm alarmDTO 导入导出json使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarm(String Alarm) {
        this.Alarm = Alarm;
    }

    /**
     * Get 任务脚本是否发生变化
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScriptChange 任务脚本是否发生变化
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getScriptChange() {
        return this.ScriptChange;
    }

    /**
     * Set 任务脚本是否发生变化
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScriptChange 任务脚本是否发生变化
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScriptChange(Boolean ScriptChange) {
        this.ScriptChange = ScriptChange;
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
     * Get 启动暂停的任务时，选择不补录中间实例，通过此字段来标识从哪个时间开始生成实例
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecoverFreezeStartTime 启动暂停的任务时，选择不补录中间实例，通过此字段来标识从哪个时间开始生成实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRecoverFreezeStartTime() {
        return this.RecoverFreezeStartTime;
    }

    /**
     * Set 启动暂停的任务时，选择不补录中间实例，通过此字段来标识从哪个时间开始生成实例
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecoverFreezeStartTime 启动暂停的任务时，选择不补录中间实例，通过此字段来标识从哪个时间开始生成实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecoverFreezeStartTime(String RecoverFreezeStartTime) {
        this.RecoverFreezeStartTime = RecoverFreezeStartTime;
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
     * Get 父子节点树
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tasks 父子节点树
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskDsDTO [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set 父子节点树
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tasks 父子节点树
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTasks(TaskDsDTO [] Tasks) {
        this.Tasks = Tasks;
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
     * Get 支持事件监听器配置导入导出
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventListenerConfig 支持事件监听器配置导入导出
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventListenerConfig() {
        return this.EventListenerConfig;
    }

    /**
     * Set 支持事件监听器配置导入导出
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventListenerConfig 支持事件监听器配置导入导出
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventListenerConfig(String EventListenerConfig) {
        this.EventListenerConfig = EventListenerConfig;
    }

    /**
     * Get 支持事件触发器配置导入导出
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventPublisherConfig 支持事件触发器配置导入导出
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventPublisherConfig() {
        return this.EventPublisherConfig;
    }

    /**
     * Set 支持事件触发器配置导入导出
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventPublisherConfig 支持事件触发器配置导入导出
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventPublisherConfig(String EventPublisherConfig) {
        this.EventPublisherConfig = EventPublisherConfig;
    }

    /**
     * Get 依赖配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DependencyConfigList 依赖配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DependencyConfigDsDTO [] getDependencyConfigList() {
        return this.DependencyConfigList;
    }

    /**
     * Set 依赖配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param DependencyConfigList 依赖配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDependencyConfigList(DependencyConfigDsDTO [] DependencyConfigList) {
        this.DependencyConfigList = DependencyConfigList;
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
     * Get 回收站还原提示语
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecycleTips 回收站还原提示语
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRecycleTips() {
        return this.RecycleTips;
    }

    /**
     * Set 回收站还原提示语
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecycleTips 回收站还原提示语
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecycleTips(String RecycleTips) {
        this.RecycleTips = RecycleTips;
    }

    /**
     * Get 回收站所属用户
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecycleUser 回收站所属用户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRecycleUser() {
        return this.RecycleUser;
    }

    /**
     * Set 回收站所属用户
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecycleUser 回收站所属用户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecycleUser(String RecycleUser) {
        this.RecycleUser = RecycleUser;
    }

    /**
     * Get 新增 或 修改
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NewOrUpdate 新增 或 修改
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNewOrUpdate() {
        return this.NewOrUpdate;
    }

    /**
     * Set 新增 或 修改
注意：此字段可能返回 null，表示取不到有效值。
     * @param NewOrUpdate 新增 或 修改
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNewOrUpdate(String NewOrUpdate) {
        this.NewOrUpdate = NewOrUpdate;
    }

    /**
     * Get 任务上游依赖信息 用于发布管理导入导出
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Params 任务上游依赖信息 用于发布管理导入导出
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ParameterTaskDsDto [] getParams() {
        return this.Params;
    }

    /**
     * Set 任务上游依赖信息 用于发布管理导入导出
注意：此字段可能返回 null，表示取不到有效值。
     * @param Params 任务上游依赖信息 用于发布管理导入导出
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParams(ParameterTaskDsDto [] Params) {
        this.Params = Params;
    }

    /**
     * Get 任务上游依赖信息 用于发布管理导入导出
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskLinkInfo 任务上游依赖信息 用于发布管理导入导出
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskLinkDsDTO [] getTaskLinkInfo() {
        return this.TaskLinkInfo;
    }

    /**
     * Set 任务上游依赖信息 用于发布管理导入导出
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskLinkInfo 任务上游依赖信息 用于发布管理导入导出
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskLinkInfo(TaskLinkDsDTO [] TaskLinkInfo) {
        this.TaskLinkInfo = TaskLinkInfo;
    }

    /**
     * Get 导入结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImportResult 导入结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getImportResult() {
        return this.ImportResult;
    }

    /**
     * Set 导入结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImportResult 导入结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImportResult(Boolean ImportResult) {
        this.ImportResult = ImportResult;
    }

    /**
     * Get 导入失败原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImportErrMsg 导入失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImportErrMsg() {
        return this.ImportErrMsg;
    }

    /**
     * Set 导入失败原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImportErrMsg 导入失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImportErrMsg(String ImportErrMsg) {
        this.ImportErrMsg = ImportErrMsg;
    }

    /**
     * Get 任务内容 全部内容 配置内容 资源内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContentType 任务内容 全部内容 配置内容 资源内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContentType() {
        return this.ContentType;
    }

    /**
     * Set 任务内容 全部内容 配置内容 资源内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContentType 任务内容 全部内容 配置内容 资源内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContentType(String ContentType) {
        this.ContentType = ContentType;
    }

    /**
     * Get 是否导入提交运行
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskAutoSubmit 是否导入提交运行
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getTaskAutoSubmit() {
        return this.TaskAutoSubmit;
    }

    /**
     * Set 是否导入提交运行
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskAutoSubmit 是否导入提交运行
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskAutoSubmit(Boolean TaskAutoSubmit) {
        this.TaskAutoSubmit = TaskAutoSubmit;
    }

    /**
     * Get 上层产品 数据质量 / 数据开发 / ...
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductName 上层产品 数据质量 / 数据开发 / ...
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 上层产品 数据质量 / 数据开发 / ...
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductName 上层产品 数据质量 / 数据开发 / ...
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 创建者帐号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnId 创建者帐号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnId() {
        return this.OwnId;
    }

    /**
     * Set 创建者帐号
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnId 创建者帐号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnId(String OwnId) {
        this.OwnId = OwnId;
    }

    /**
     * Get 子账号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserId 子账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 子账号
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserId 子账号
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
     * Get 最后修改时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 最后修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 最后修改时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 最后修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 最后修改的人的ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateUserId 最后修改的人的ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateUserId() {
        return this.UpdateUserId;
    }

    /**
     * Set 最后修改的人的ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateUserId 最后修改的人的ID
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
     * Get 编排-删除添加的链接
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LinkId 编排-删除添加的链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLinkId() {
        return this.LinkId;
    }

    /**
     * Set 编排-删除添加的链接
注意：此字段可能返回 null，表示取不到有效值。
     * @param LinkId 编排-删除添加的链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLinkId(String LinkId) {
        this.LinkId = LinkId;
    }

    /**
     * Get 脚本引用关系
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserFileId 脚本引用关系
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserFileId() {
        return this.UserFileId;
    }

    /**
     * Set 脚本引用关系
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserFileId 脚本引用关系
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserFileId(String UserFileId) {
        this.UserFileId = UserFileId;
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
     * Get 去向数据源ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetServiceId 去向数据源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetServiceId() {
        return this.TargetServiceId;
    }

    /**
     * Set 去向数据源ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetServiceId 去向数据源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetServiceId(String TargetServiceId) {
        this.TargetServiceId = TargetServiceId;
    }

    /**
     * Get 去向数据源类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetServiceType 去向数据源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetServiceType() {
        return this.TargetServiceType;
    }

    /**
     * Set 去向数据源类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetServiceType 去向数据源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetServiceType(String TargetServiceType) {
        this.TargetServiceType = TargetServiceType;
    }

    /**
     * Get 输入参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParamInList 输入参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ParameterTaskInDsDto [] getParamInList() {
        return this.ParamInList;
    }

    /**
     * Set 输入参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParamInList 输入参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParamInList(ParameterTaskInDsDto [] ParamInList) {
        this.ParamInList = ParamInList;
    }

    /**
     * Get 输出参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParamOutList 输出参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ParameterTaskOutDsDto [] getParamOutList() {
        return this.ParamOutList;
    }

    /**
     * Set 输出参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParamOutList 输出参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParamOutList(ParameterTaskOutDsDto [] ParamOutList) {
        this.ParamOutList = ParamOutList;
    }

    /**
     * Get 任务文件夹id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskFolderId 任务文件夹id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskFolderId() {
        return this.TaskFolderId;
    }

    /**
     * Set 任务文件夹id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskFolderId 任务文件夹id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskFolderId(String TaskFolderId) {
        this.TaskFolderId = TaskFolderId;
    }

    /**
     * Get 最大尝试次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxRetryAttempts 最大尝试次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxRetryAttempts() {
        return this.MaxRetryAttempts;
    }

    /**
     * Set 最大尝试次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxRetryAttempts 最大尝试次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxRetryAttempts(Long MaxRetryAttempts) {
        this.MaxRetryAttempts = MaxRetryAttempts;
    }

    /**
     * Get 资源组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroupName 资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroupName() {
        return this.ResourceGroupName;
    }

    /**
     * Set 资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroupName 资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroupName(String ResourceGroupName) {
        this.ResourceGroupName = ResourceGroupName;
    }

    /**
     * Get 数据源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceServiceName 数据源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceServiceName() {
        return this.SourceServiceName;
    }

    /**
     * Set 数据源
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceServiceName 数据源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceServiceName(String SourceServiceName) {
        this.SourceServiceName = SourceServiceName;
    }

    /**
     * Get 任务产出登记
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskRegisterOutputTable 任务产出登记
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskDataRegistryDTO [] getTaskRegisterOutputTable() {
        return this.TaskRegisterOutputTable;
    }

    /**
     * Set 任务产出登记
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskRegisterOutputTable 任务产出登记
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskRegisterOutputTable(TaskDataRegistryDTO [] TaskRegisterOutputTable) {
        this.TaskRegisterOutputTable = TaskRegisterOutputTable;
    }

    /**
     * Get 循环依赖配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CycleDependencyConfigList 循环依赖配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskCycleLinkDTO [] getCycleDependencyConfigList() {
        return this.CycleDependencyConfigList;
    }

    /**
     * Set 循环依赖配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param CycleDependencyConfigList 循环依赖配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCycleDependencyConfigList(TaskCycleLinkDTO [] CycleDependencyConfigList) {
        this.CycleDependencyConfigList = CycleDependencyConfigList;
    }

    /**
     * Get 特殊警告信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Warning 特殊警告信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWarning() {
        return this.Warning;
    }

    /**
     * Set 特殊警告信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Warning 特殊警告信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWarning(String Warning) {
        this.Warning = Warning;
    }

    /**
     * Get 0 正常调度 1 空跑调度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScheduleRunType 0 正常调度 1 空跑调度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScheduleRunType() {
        return this.ScheduleRunType;
    }

    /**
     * Set 0 正常调度 1 空跑调度
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScheduleRunType 0 正常调度 1 空跑调度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheduleRunType(Long ScheduleRunType) {
        this.ScheduleRunType = ScheduleRunType;
    }

    /**
     * Get 0 并发度达到上限时，本次排队等待 1 并发度达到上限时，本次不执行，直接kill
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConcurrentStrategy 0 并发度达到上限时，本次排队等待 1 并发度达到上限时，本次不执行，直接kill
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getConcurrentStrategy() {
        return this.ConcurrentStrategy;
    }

    /**
     * Set 0 并发度达到上限时，本次排队等待 1 并发度达到上限时，本次不执行，直接kill
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConcurrentStrategy 0 并发度达到上限时，本次排队等待 1 并发度达到上限时，本次不执行，直接kill
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConcurrentStrategy(Long ConcurrentStrategy) {
        this.ConcurrentStrategy = ConcurrentStrategy;
    }

    /**
     * Get UTC+8;UDC-8
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScheduleTimeZone UTC+8;UDC-8
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScheduleTimeZone() {
        return this.ScheduleTimeZone;
    }

    /**
     * Set UTC+8;UDC-8
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScheduleTimeZone UTC+8;UDC-8
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheduleTimeZone(String ScheduleTimeZone) {
        this.ScheduleTimeZone = ScheduleTimeZone;
    }

    /**
     * Get 引用的代码模版id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TemplateId 引用的代码模版id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 引用的代码模版id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TemplateId 引用的代码模版id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    public TaskDsDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskDsDTO(TaskDsDTO source) {
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
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ProjectIdent != null) {
            this.ProjectIdent = new String(source.ProjectIdent);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
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
            this.TaskType = new TaskTypeDsVO(source.TaskType);
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
        if (source.TaskExt != null) {
            this.TaskExt = new TaskExtDsVO(source.TaskExt);
        }
        if (source.Properties != null) {
            this.Properties = new String(source.Properties);
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
        if (source.Alarms != null) {
            this.Alarms = new AlarmDsVO[source.Alarms.length];
            for (int i = 0; i < source.Alarms.length; i++) {
                this.Alarms[i] = new AlarmDsVO(source.Alarms[i]);
            }
        }
        if (source.Alarm != null) {
            this.Alarm = new String(source.Alarm);
        }
        if (source.ScriptChange != null) {
            this.ScriptChange = new Boolean(source.ScriptChange);
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
        if (source.RecoverFreezeStartTime != null) {
            this.RecoverFreezeStartTime = new String(source.RecoverFreezeStartTime);
        }
        if (source.SourceServer != null) {
            this.SourceServer = new String(source.SourceServer);
        }
        if (source.TargetServer != null) {
            this.TargetServer = new String(source.TargetServer);
        }
        if (source.Tasks != null) {
            this.Tasks = new TaskDsDTO[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new TaskDsDTO(source.Tasks[i]);
            }
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
        if (source.EventListenerConfig != null) {
            this.EventListenerConfig = new String(source.EventListenerConfig);
        }
        if (source.EventPublisherConfig != null) {
            this.EventPublisherConfig = new String(source.EventPublisherConfig);
        }
        if (source.DependencyConfigList != null) {
            this.DependencyConfigList = new DependencyConfigDsDTO[source.DependencyConfigList.length];
            for (int i = 0; i < source.DependencyConfigList.length; i++) {
                this.DependencyConfigList[i] = new DependencyConfigDsDTO(source.DependencyConfigList[i]);
            }
        }
        if (source.VirtualTaskStatus != null) {
            this.VirtualTaskStatus = new String(source.VirtualTaskStatus);
        }
        if (source.RecycleTips != null) {
            this.RecycleTips = new String(source.RecycleTips);
        }
        if (source.RecycleUser != null) {
            this.RecycleUser = new String(source.RecycleUser);
        }
        if (source.NewOrUpdate != null) {
            this.NewOrUpdate = new String(source.NewOrUpdate);
        }
        if (source.Params != null) {
            this.Params = new ParameterTaskDsDto[source.Params.length];
            for (int i = 0; i < source.Params.length; i++) {
                this.Params[i] = new ParameterTaskDsDto(source.Params[i]);
            }
        }
        if (source.TaskLinkInfo != null) {
            this.TaskLinkInfo = new TaskLinkDsDTO[source.TaskLinkInfo.length];
            for (int i = 0; i < source.TaskLinkInfo.length; i++) {
                this.TaskLinkInfo[i] = new TaskLinkDsDTO(source.TaskLinkInfo[i]);
            }
        }
        if (source.ImportResult != null) {
            this.ImportResult = new Boolean(source.ImportResult);
        }
        if (source.ImportErrMsg != null) {
            this.ImportErrMsg = new String(source.ImportErrMsg);
        }
        if (source.ContentType != null) {
            this.ContentType = new String(source.ContentType);
        }
        if (source.TaskAutoSubmit != null) {
            this.TaskAutoSubmit = new Boolean(source.TaskAutoSubmit);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
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
        if (source.SchedulerDesc != null) {
            this.SchedulerDesc = new String(source.SchedulerDesc);
        }
        if (source.ResourceGroup != null) {
            this.ResourceGroup = new String(source.ResourceGroup);
        }
        if (source.VersionDesc != null) {
            this.VersionDesc = new String(source.VersionDesc);
        }
        if (source.LinkId != null) {
            this.LinkId = new String(source.LinkId);
        }
        if (source.UserFileId != null) {
            this.UserFileId = new String(source.UserFileId);
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
        if (source.ParamInList != null) {
            this.ParamInList = new ParameterTaskInDsDto[source.ParamInList.length];
            for (int i = 0; i < source.ParamInList.length; i++) {
                this.ParamInList[i] = new ParameterTaskInDsDto(source.ParamInList[i]);
            }
        }
        if (source.ParamOutList != null) {
            this.ParamOutList = new ParameterTaskOutDsDto[source.ParamOutList.length];
            for (int i = 0; i < source.ParamOutList.length; i++) {
                this.ParamOutList[i] = new ParameterTaskOutDsDto(source.ParamOutList[i]);
            }
        }
        if (source.TaskFolderId != null) {
            this.TaskFolderId = new String(source.TaskFolderId);
        }
        if (source.MaxRetryAttempts != null) {
            this.MaxRetryAttempts = new Long(source.MaxRetryAttempts);
        }
        if (source.ResourceGroupName != null) {
            this.ResourceGroupName = new String(source.ResourceGroupName);
        }
        if (source.SourceServiceName != null) {
            this.SourceServiceName = new String(source.SourceServiceName);
        }
        if (source.TaskRegisterOutputTable != null) {
            this.TaskRegisterOutputTable = new TaskDataRegistryDTO[source.TaskRegisterOutputTable.length];
            for (int i = 0; i < source.TaskRegisterOutputTable.length; i++) {
                this.TaskRegisterOutputTable[i] = new TaskDataRegistryDTO(source.TaskRegisterOutputTable[i]);
            }
        }
        if (source.CycleDependencyConfigList != null) {
            this.CycleDependencyConfigList = new TaskCycleLinkDTO[source.CycleDependencyConfigList.length];
            for (int i = 0; i < source.CycleDependencyConfigList.length; i++) {
                this.CycleDependencyConfigList[i] = new TaskCycleLinkDTO(source.CycleDependencyConfigList[i]);
            }
        }
        if (source.Warning != null) {
            this.Warning = new String(source.Warning);
        }
        if (source.ScheduleRunType != null) {
            this.ScheduleRunType = new Long(source.ScheduleRunType);
        }
        if (source.ConcurrentStrategy != null) {
            this.ConcurrentStrategy = new Long(source.ConcurrentStrategy);
        }
        if (source.ScheduleTimeZone != null) {
            this.ScheduleTimeZone = new String(source.ScheduleTimeZone);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
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
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectIdent", this.ProjectIdent);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "CycleStep", this.CycleStep);
        this.setParamSimple(map, prefix + "CrontabExpression", this.CrontabExpression);
        this.setParamSimple(map, prefix + "DelayTime", this.DelayTime);
        this.setParamSimple(map, prefix + "StartupTime", this.StartupTime);
        this.setParamSimple(map, prefix + "RetryWait", this.RetryWait);
        this.setParamSimple(map, prefix + "Retriable", this.Retriable);
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
        this.setParamObj(map, prefix + "TaskExt.", this.TaskExt);
        this.setParamSimple(map, prefix + "Properties", this.Properties);
        this.setParamSimple(map, prefix + "Notes", this.Notes);
        this.setParamSimple(map, prefix + "InstanceInitStrategy", this.InstanceInitStrategy);
        this.setParamSimple(map, prefix + "YarnQueue", this.YarnQueue);
        this.setParamArrayObj(map, prefix + "Alarms.", this.Alarms);
        this.setParamSimple(map, prefix + "Alarm", this.Alarm);
        this.setParamSimple(map, prefix + "ScriptChange", this.ScriptChange);
        this.setParamSimple(map, prefix + "Submit", this.Submit);
        this.setParamSimple(map, prefix + "LastSchedulerCommitTime", this.LastSchedulerCommitTime);
        this.setParamSimple(map, prefix + "NormalizedJobStartTime", this.NormalizedJobStartTime);
        this.setParamSimple(map, prefix + "RecoverFreezeStartTime", this.RecoverFreezeStartTime);
        this.setParamSimple(map, prefix + "SourceServer", this.SourceServer);
        this.setParamSimple(map, prefix + "TargetServer", this.TargetServer);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "Creater", this.Creater);
        this.setParamSimple(map, prefix + "DependencyRel", this.DependencyRel);
        this.setParamSimple(map, prefix + "DependencyWorkflow", this.DependencyWorkflow);
        this.setParamSimple(map, prefix + "EventListenerConfig", this.EventListenerConfig);
        this.setParamSimple(map, prefix + "EventPublisherConfig", this.EventPublisherConfig);
        this.setParamArrayObj(map, prefix + "DependencyConfigList.", this.DependencyConfigList);
        this.setParamSimple(map, prefix + "VirtualTaskStatus", this.VirtualTaskStatus);
        this.setParamSimple(map, prefix + "RecycleTips", this.RecycleTips);
        this.setParamSimple(map, prefix + "RecycleUser", this.RecycleUser);
        this.setParamSimple(map, prefix + "NewOrUpdate", this.NewOrUpdate);
        this.setParamArrayObj(map, prefix + "Params.", this.Params);
        this.setParamArrayObj(map, prefix + "TaskLinkInfo.", this.TaskLinkInfo);
        this.setParamSimple(map, prefix + "ImportResult", this.ImportResult);
        this.setParamSimple(map, prefix + "ImportErrMsg", this.ImportErrMsg);
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);
        this.setParamSimple(map, prefix + "TaskAutoSubmit", this.TaskAutoSubmit);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "OwnId", this.OwnId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "TenantId", this.TenantId);
        this.setParamSimple(map, prefix + "UpdateUser", this.UpdateUser);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "UpdateUserId", this.UpdateUserId);
        this.setParamSimple(map, prefix + "SchedulerDesc", this.SchedulerDesc);
        this.setParamSimple(map, prefix + "ResourceGroup", this.ResourceGroup);
        this.setParamSimple(map, prefix + "VersionDesc", this.VersionDesc);
        this.setParamSimple(map, prefix + "LinkId", this.LinkId);
        this.setParamSimple(map, prefix + "UserFileId", this.UserFileId);
        this.setParamSimple(map, prefix + "SourceServiceId", this.SourceServiceId);
        this.setParamSimple(map, prefix + "SourceServiceType", this.SourceServiceType);
        this.setParamSimple(map, prefix + "TargetServiceId", this.TargetServiceId);
        this.setParamSimple(map, prefix + "TargetServiceType", this.TargetServiceType);
        this.setParamArrayObj(map, prefix + "ParamInList.", this.ParamInList);
        this.setParamArrayObj(map, prefix + "ParamOutList.", this.ParamOutList);
        this.setParamSimple(map, prefix + "TaskFolderId", this.TaskFolderId);
        this.setParamSimple(map, prefix + "MaxRetryAttempts", this.MaxRetryAttempts);
        this.setParamSimple(map, prefix + "ResourceGroupName", this.ResourceGroupName);
        this.setParamSimple(map, prefix + "SourceServiceName", this.SourceServiceName);
        this.setParamArrayObj(map, prefix + "TaskRegisterOutputTable.", this.TaskRegisterOutputTable);
        this.setParamArrayObj(map, prefix + "CycleDependencyConfigList.", this.CycleDependencyConfigList);
        this.setParamSimple(map, prefix + "Warning", this.Warning);
        this.setParamSimple(map, prefix + "ScheduleRunType", this.ScheduleRunType);
        this.setParamSimple(map, prefix + "ConcurrentStrategy", this.ConcurrentStrategy);
        this.setParamSimple(map, prefix + "ScheduleTimeZone", this.ScheduleTimeZone);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);

    }
}

