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
    * <p>任务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>虚拟任务标记</p>
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
    * <p>真实工作流id</p>
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
    * <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastUpdate")
    @Expose
    private String LastUpdate;

    /**
    * <p>任务状态，取值范围：</p><ul><li>N 新建</li><li>Y 运行</li><li>F 停止</li><li>O 冻结</li><li>T 停止中</li><li>INVALID 已失效</li></ul>
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
    * <p>生效日期</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>结束日期</p>
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
    * <p>对于crontab类型调度配置其为用户输入 对于周期类型调度配置其为系统计算</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CrontabExpression")
    @Expose
    private String CrontabExpression;

    /**
    * <p>延时调度</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DelayTime")
    @Expose
    private Long DelayTime;

    /**
    * <p>延时执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartupTime")
    @Expose
    private Long StartupTime;

    /**
    * <p>重试等待时间,单位分钟</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RetryWait")
    @Expose
    private Long RetryWait;

    /**
    * <p>是否可重试</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Retriable")
    @Expose
    private Long Retriable;

    /**
    * <p>调度扩展信息</p>
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
    private TaskTypeDsVO TaskType;

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
    * <p>是否自身依赖 是1 否2 并行3</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SelfDepend")
    @Expose
    private String SelfDepend;

    /**
    * <p>LeftCoordinate坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LeftCoordinate")
    @Expose
    private Float LeftCoordinate;

    /**
    * <p>TopCoordinate坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopCoordinate")
    @Expose
    private Float TopCoordinate;

    /**
    * <p>TaskExt信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskExt")
    @Expose
    private TaskExtDsVO TaskExt;

    /**
    * <p>taskExt 导入导出json使用 private Map  properties;</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Properties")
    @Expose
    private String Properties;

    /**
    * <p>任务备注</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Notes")
    @Expose
    private String Notes;

    /**
    * <p>实例生成策略 T+1 表示当前周期生成上一周期数据时间任务实例 默认T+1 T+0 表示当前周期生成当前周期数据时间任务实例 T-1</p><pre><code> * 表示当前周期生成下一周期数据时间任务实例 * * service不做默认策略处理, 下沉到数据初始化默认T+1, service涉及到多个更新task的路径</code></pre>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceInitStrategy")
    @Expose
    private String InstanceInitStrategy;

    /**
    * <p>资源池队列名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("YarnQueue")
    @Expose
    private String YarnQueue;

    /**
    * <p>任务告警信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Alarms")
    @Expose
    private AlarmDsVO [] Alarms;

    /**
    * <p>alarmDTO 导入导出json使用</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Alarm")
    @Expose
    private String Alarm;

    /**
    * <p>任务脚本是否发生变化</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScriptChange")
    @Expose
    private Boolean ScriptChange;

    /**
    * <p>任务版本是否已提交</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Submit")
    @Expose
    private Boolean Submit;

    /**
    * <p>最新调度计划变更时间 仅生产态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastSchedulerCommitTime")
    @Expose
    private String LastSchedulerCommitTime;

    /**
    * <p>仅生产态存储于生产态序列化任务信息, 减少base CPU重复密集计算</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NormalizedJobStartTime")
    @Expose
    private String NormalizedJobStartTime;

    /**
    * <p>启动暂停的任务时，选择不补录中间实例，通过此字段来标识从哪个时间开始生成实例</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecoverFreezeStartTime")
    @Expose
    private String RecoverFreezeStartTime;

    /**
    * <p>源数据源</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceServer")
    @Expose
    private String SourceServer;

    /**
    * <p>目标数据源</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetServer")
    @Expose
    private String TargetServer;

    /**
    * <p>父子节点树</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tasks")
    @Expose
    private TaskDsDTO [] Tasks;

    /**
    * <p>创建者</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Creater")
    @Expose
    private String Creater;

    /**
    * <p>分支，依赖关系，and/or, 默认and</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DependencyRel")
    @Expose
    private String DependencyRel;

    /**
    * <p>是否支持工作流依赖 yes / no 默认 no</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DependencyWorkflow")
    @Expose
    private String DependencyWorkflow;

    /**
    * <p>支持事件监听器配置导入导出</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventListenerConfig")
    @Expose
    private String EventListenerConfig;

    /**
    * <p>支持事件触发器配置导入导出</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventPublisherConfig")
    @Expose
    private String EventPublisherConfig;

    /**
    * <p>依赖配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DependencyConfigList")
    @Expose
    private DependencyConfigDsDTO [] DependencyConfigList;

    /**
    * <p>任务状态，取值范围：</p><ul><li>N 新建</li><li>Y 运行</li><li>F 停止</li><li>O 冻结</li><li>T 停止中</li><li>INVALID 已失效</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VirtualTaskStatus")
    @Expose
    private String VirtualTaskStatus;

    /**
    * <p>回收站还原提示语</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecycleTips")
    @Expose
    private String RecycleTips;

    /**
    * <p>回收站所属用户</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecycleUser")
    @Expose
    private String RecycleUser;

    /**
    * <p>新增 或 修改</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NewOrUpdate")
    @Expose
    private String NewOrUpdate;

    /**
    * <p>任务上游依赖信息 用于发布管理导入导出</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Params")
    @Expose
    private ParameterTaskDsDto [] Params;

    /**
    * <p>任务上游依赖信息 用于发布管理导入导出</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskLinkInfo")
    @Expose
    private TaskLinkDsDTO [] TaskLinkInfo;

    /**
    * <p>导入结果</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImportResult")
    @Expose
    private Boolean ImportResult;

    /**
    * <p>导入失败原因</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImportErrMsg")
    @Expose
    private String ImportErrMsg;

    /**
    * <p>任务内容 全部内容 配置内容 资源内容</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContentType")
    @Expose
    private String ContentType;

    /**
    * <p>是否导入提交运行</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskAutoSubmit")
    @Expose
    private Boolean TaskAutoSubmit;

    /**
    * <p>上层产品 数据质量 / 数据开发 / ...</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * <p>创建者帐号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnId")
    @Expose
    private String OwnId;

    /**
    * <p>子账号</p>
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
    * <p>最后修改的人</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateUser")
    @Expose
    private String UpdateUser;

    /**
    * <p>最后修改时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>最后修改的人的ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateUserId")
    @Expose
    private String UpdateUserId;

    /**
    * <p>调度计划</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchedulerDesc")
    @Expose
    private String SchedulerDesc;

    /**
    * <p>资源组</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroup")
    @Expose
    private String ResourceGroup;

    /**
    * <p>版本提交说明</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionDesc")
    @Expose
    private String VersionDesc;

    /**
    * <p>编排-删除添加的链接</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LinkId")
    @Expose
    private String LinkId;

    /**
    * <p>脚本引用关系</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserFileId")
    @Expose
    private String UserFileId;

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
    * <p>去向数据源ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetServiceId")
    @Expose
    private String TargetServiceId;

    /**
    * <p>去向数据源类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetServiceType")
    @Expose
    private String TargetServiceType;

    /**
    * <p>输入参数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamInList")
    @Expose
    private ParameterTaskInDsDto [] ParamInList;

    /**
    * <p>输出参数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamOutList")
    @Expose
    private ParameterTaskOutDsDto [] ParamOutList;

    /**
    * <p>任务文件夹id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskFolderId")
    @Expose
    private String TaskFolderId;

    /**
    * <p>最大尝试次数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxRetryAttempts")
    @Expose
    private Long MaxRetryAttempts;

    /**
    * <p>资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroupName")
    @Expose
    private String ResourceGroupName;

    /**
    * <p>数据源</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceServiceName")
    @Expose
    private String SourceServiceName;

    /**
    * <p>任务产出登记</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskRegisterOutputTable")
    @Expose
    private TaskDataRegistryDTO [] TaskRegisterOutputTable;

    /**
    * <p>循环依赖配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CycleDependencyConfigList")
    @Expose
    private TaskCycleLinkDTO [] CycleDependencyConfigList;

    /**
    * <p>特殊警告信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Warning")
    @Expose
    private String Warning;

    /**
    * <p>0 正常调度 1 空跑调度</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScheduleRunType")
    @Expose
    private Long ScheduleRunType;

    /**
    * <p>0 并发度达到上限时，本次排队等待 1 并发度达到上限时，本次不执行，直接kill</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConcurrentStrategy")
    @Expose
    private Long ConcurrentStrategy;

    /**
    * <p>UTC+8;UDC-8</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScheduleTimeZone")
    @Expose
    private String ScheduleTimeZone;

    /**
    * <p>引用的代码模版id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * <p>允许重跑类 ALL 无论实例成功或者失败，都允许重跑 FAILURE 只有失败的实例允许重跑，成功的实例不允许重跑 NONE 无论成功或者失败，都不允许重跑</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AllowRedoType")
    @Expose
    private String AllowRedoType;

    /**
    * <p>BundleId<br>CI/CD工程生成的bundle唯一标识</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * <p>bundle信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BundleInfo")
    @Expose
    private String BundleInfo;

    /**
    * <p>是否允许下游依赖 0 不允许 1 允许</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AllowDownstreamDependency")
    @Expose
    private Long AllowDownstreamDependency;

    /**
    * <ul><li>任务依赖运行条件，默认为ALL_SUCCESS，暂时只支持工作流调度项目下配置</li><li>ALL_SUCCESS： 全部成功：所有上游依赖任务都达到终态时，进行依赖判断，如果上游全部都成功，则依赖判断成功，否则如果上游有一个跳过运行，则标记为跳过运行，其余情况标记为上游失败</li><li>ALL_FAILED：全部失败：所有上游依赖任务都达到终态时，进行依赖判断，如果上游状态都是失败或者上游失败，则依赖判断成功，否则就标记为跳过运行</li><li>ALL_DONE：全部完成：所有上游依赖任务都达到终态时，进行依赖判断，直接是依赖判断成功</li><li>ALL_DONE_AT_LEAST_ONE_SUCCESS：上游全部完成至少一个成功: 所有上游依赖任务都达到终态时，进行依赖判断，至少有一个成功，则依赖判断成功，否则就是跳过运行</li><li>ALL_SKIPPED：上游全部都跳过: 所有上游依赖任务都达到终态时，进行依赖判断，所有的上游都是跳过状态才算依赖判断成功，否则当前节点就是跳过运行</li><li>ONE_FAILED：至少一个失败: 上游只要有一个失败了，就进行依赖判断，且依赖判断成功，如果上游全部完成但是没有失败，则跳过运行</li><li>ONE_SUCCESS：至少一个成功：上游只要有一个成功，就进行依赖判断，且依赖判断成功，如果上游全部完成但是没有成功，则跳过运行</li><li>ONE_DONE：至少一个完成：上游只要有一个完成了，就进行依赖判断，且依赖判断成功，否则还是等待上游</li><li>NONE_FAILED：上游全部完成，没有失败: 所有上游依赖任务都达到终态时，进行依赖判断，如果上游都是成功或者跳过运行，则依赖判断成功，否则标记为上游失败</li><li>ALL_DONE_NONE_FAILED_AT_LEAST_ONE_SUCCESS：上游全部完成，没有失败，至少有一个成功: 所有上游依赖任务都达到终态时，进行依赖判断，上游没有一个失败且至少有一个成功的情况下，依赖判断成功，否则就是跳过运行</li><li>NONE_SKIPPED：上游全部完成，没有跳过运行: 所有上游依赖任务都达到终态时，进行依赖判断, 如果上游状态全部都是成功、失败、上游失败状态，则依赖判断成功，否则为跳过运行</li><li>ALL_DONE_AT_LEAST_ONE_FAILED：上游全部完成至少一个失败: 所有上游依赖任务都达到终态时，进行依赖判断，至少有一个失败，则依赖判断成功，否则就是跳过运行</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DependencyTriggerPolicy")
    @Expose
    private String DependencyTriggerPolicy;

    /**
    * <p>任务最后更新时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastUpdateTimestamp")
    @Expose
    private Long LastUpdateTimestamp;

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
     * Get <p>虚拟任务标记</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VirtualTaskId <p>虚拟任务标记</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVirtualTaskId() {
        return this.VirtualTaskId;
    }

    /**
     * Set <p>虚拟任务标记</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VirtualTaskId <p>虚拟任务标记</p>
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
     * Get <p>真实工作流id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RealWorkflowId <p>真实工作流id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRealWorkflowId() {
        return this.RealWorkflowId;
    }

    /**
     * Set <p>真实工作流id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealWorkflowId <p>真实工作流id</p>
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
     * Get <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastUpdate <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastUpdate() {
        return this.LastUpdate;
    }

    /**
     * Set <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastUpdate <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastUpdate(String LastUpdate) {
        this.LastUpdate = LastUpdate;
    }

    /**
     * Get <p>任务状态，取值范围：</p><ul><li>N 新建</li><li>Y 运行</li><li>F 停止</li><li>O 冻结</li><li>T 停止中</li><li>INVALID 已失效</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>任务状态，取值范围：</p><ul><li>N 新建</li><li>Y 运行</li><li>F 停止</li><li>O 冻结</li><li>T 停止中</li><li>INVALID 已失效</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态，取值范围：</p><ul><li>N 新建</li><li>Y 运行</li><li>F 停止</li><li>O 冻结</li><li>T 停止中</li><li>INVALID 已失效</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>任务状态，取值范围：</p><ul><li>N 新建</li><li>Y 运行</li><li>F 停止</li><li>O 冻结</li><li>T 停止中</li><li>INVALID 已失效</li></ul>
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
     * Get <p>生效日期</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime <p>生效日期</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>生效日期</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime <p>生效日期</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束日期</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime <p>结束日期</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束日期</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime <p>结束日期</p>
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
     * Get <p>对于crontab类型调度配置其为用户输入 对于周期类型调度配置其为系统计算</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CrontabExpression <p>对于crontab类型调度配置其为用户输入 对于周期类型调度配置其为系统计算</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCrontabExpression() {
        return this.CrontabExpression;
    }

    /**
     * Set <p>对于crontab类型调度配置其为用户输入 对于周期类型调度配置其为系统计算</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CrontabExpression <p>对于crontab类型调度配置其为用户输入 对于周期类型调度配置其为系统计算</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCrontabExpression(String CrontabExpression) {
        this.CrontabExpression = CrontabExpression;
    }

    /**
     * Get <p>延时调度</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DelayTime <p>延时调度</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDelayTime() {
        return this.DelayTime;
    }

    /**
     * Set <p>延时调度</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DelayTime <p>延时调度</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDelayTime(Long DelayTime) {
        this.DelayTime = DelayTime;
    }

    /**
     * Get <p>延时执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartupTime <p>延时执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStartupTime() {
        return this.StartupTime;
    }

    /**
     * Set <p>延时执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartupTime <p>延时执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartupTime(Long StartupTime) {
        this.StartupTime = StartupTime;
    }

    /**
     * Get <p>重试等待时间,单位分钟</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RetryWait <p>重试等待时间,单位分钟</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRetryWait() {
        return this.RetryWait;
    }

    /**
     * Set <p>重试等待时间,单位分钟</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RetryWait <p>重试等待时间,单位分钟</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRetryWait(Long RetryWait) {
        this.RetryWait = RetryWait;
    }

    /**
     * Get <p>是否可重试</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Retriable <p>是否可重试</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRetriable() {
        return this.Retriable;
    }

    /**
     * Set <p>是否可重试</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Retriable <p>是否可重试</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRetriable(Long Retriable) {
        this.Retriable = Retriable;
    }

    /**
     * Get <p>调度扩展信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskAction <p>调度扩展信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskAction() {
        return this.TaskAction;
    }

    /**
     * Set <p>调度扩展信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskAction <p>调度扩展信息</p>
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
    public TaskTypeDsVO getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>任务类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskType <p>任务类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskType(TaskTypeDsVO TaskType) {
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
     * Get <p>是否自身依赖 是1 否2 并行3</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SelfDepend <p>是否自身依赖 是1 否2 并行3</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSelfDepend() {
        return this.SelfDepend;
    }

    /**
     * Set <p>是否自身依赖 是1 否2 并行3</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SelfDepend <p>是否自身依赖 是1 否2 并行3</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSelfDepend(String SelfDepend) {
        this.SelfDepend = SelfDepend;
    }

    /**
     * Get <p>LeftCoordinate坐标</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LeftCoordinate <p>LeftCoordinate坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getLeftCoordinate() {
        return this.LeftCoordinate;
    }

    /**
     * Set <p>LeftCoordinate坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LeftCoordinate <p>LeftCoordinate坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLeftCoordinate(Float LeftCoordinate) {
        this.LeftCoordinate = LeftCoordinate;
    }

    /**
     * Get <p>TopCoordinate坐标</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopCoordinate <p>TopCoordinate坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTopCoordinate() {
        return this.TopCoordinate;
    }

    /**
     * Set <p>TopCoordinate坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopCoordinate <p>TopCoordinate坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopCoordinate(Float TopCoordinate) {
        this.TopCoordinate = TopCoordinate;
    }

    /**
     * Get <p>TaskExt信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskExt <p>TaskExt信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskExtDsVO getTaskExt() {
        return this.TaskExt;
    }

    /**
     * Set <p>TaskExt信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskExt <p>TaskExt信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskExt(TaskExtDsVO TaskExt) {
        this.TaskExt = TaskExt;
    }

    /**
     * Get <p>taskExt 导入导出json使用 private Map  properties;</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Properties <p>taskExt 导入导出json使用 private Map  properties;</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProperties() {
        return this.Properties;
    }

    /**
     * Set <p>taskExt 导入导出json使用 private Map  properties;</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Properties <p>taskExt 导入导出json使用 private Map  properties;</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProperties(String Properties) {
        this.Properties = Properties;
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
     * Get <p>实例生成策略 T+1 表示当前周期生成上一周期数据时间任务实例 默认T+1 T+0 表示当前周期生成当前周期数据时间任务实例 T-1</p><pre><code> * 表示当前周期生成下一周期数据时间任务实例 * * service不做默认策略处理, 下沉到数据初始化默认T+1, service涉及到多个更新task的路径</code></pre>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceInitStrategy <p>实例生成策略 T+1 表示当前周期生成上一周期数据时间任务实例 默认T+1 T+0 表示当前周期生成当前周期数据时间任务实例 T-1</p><pre><code> * 表示当前周期生成下一周期数据时间任务实例 * * service不做默认策略处理, 下沉到数据初始化默认T+1, service涉及到多个更新task的路径</code></pre>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceInitStrategy() {
        return this.InstanceInitStrategy;
    }

    /**
     * Set <p>实例生成策略 T+1 表示当前周期生成上一周期数据时间任务实例 默认T+1 T+0 表示当前周期生成当前周期数据时间任务实例 T-1</p><pre><code> * 表示当前周期生成下一周期数据时间任务实例 * * service不做默认策略处理, 下沉到数据初始化默认T+1, service涉及到多个更新task的路径</code></pre>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceInitStrategy <p>实例生成策略 T+1 表示当前周期生成上一周期数据时间任务实例 默认T+1 T+0 表示当前周期生成当前周期数据时间任务实例 T-1</p><pre><code> * 表示当前周期生成下一周期数据时间任务实例 * * service不做默认策略处理, 下沉到数据初始化默认T+1, service涉及到多个更新task的路径</code></pre>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceInitStrategy(String InstanceInitStrategy) {
        this.InstanceInitStrategy = InstanceInitStrategy;
    }

    /**
     * Get <p>资源池队列名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return YarnQueue <p>资源池队列名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getYarnQueue() {
        return this.YarnQueue;
    }

    /**
     * Set <p>资源池队列名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param YarnQueue <p>资源池队列名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setYarnQueue(String YarnQueue) {
        this.YarnQueue = YarnQueue;
    }

    /**
     * Get <p>任务告警信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Alarms <p>任务告警信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AlarmDsVO [] getAlarms() {
        return this.Alarms;
    }

    /**
     * Set <p>任务告警信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Alarms <p>任务告警信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarms(AlarmDsVO [] Alarms) {
        this.Alarms = Alarms;
    }

    /**
     * Get <p>alarmDTO 导入导出json使用</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Alarm <p>alarmDTO 导入导出json使用</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlarm() {
        return this.Alarm;
    }

    /**
     * Set <p>alarmDTO 导入导出json使用</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Alarm <p>alarmDTO 导入导出json使用</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarm(String Alarm) {
        this.Alarm = Alarm;
    }

    /**
     * Get <p>任务脚本是否发生变化</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScriptChange <p>任务脚本是否发生变化</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getScriptChange() {
        return this.ScriptChange;
    }

    /**
     * Set <p>任务脚本是否发生变化</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScriptChange <p>任务脚本是否发生变化</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScriptChange(Boolean ScriptChange) {
        this.ScriptChange = ScriptChange;
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
     * Get <p>最新调度计划变更时间 仅生产态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastSchedulerCommitTime <p>最新调度计划变更时间 仅生产态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastSchedulerCommitTime() {
        return this.LastSchedulerCommitTime;
    }

    /**
     * Set <p>最新调度计划变更时间 仅生产态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastSchedulerCommitTime <p>最新调度计划变更时间 仅生产态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastSchedulerCommitTime(String LastSchedulerCommitTime) {
        this.LastSchedulerCommitTime = LastSchedulerCommitTime;
    }

    /**
     * Get <p>仅生产态存储于生产态序列化任务信息, 减少base CPU重复密集计算</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NormalizedJobStartTime <p>仅生产态存储于生产态序列化任务信息, 减少base CPU重复密集计算</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNormalizedJobStartTime() {
        return this.NormalizedJobStartTime;
    }

    /**
     * Set <p>仅生产态存储于生产态序列化任务信息, 减少base CPU重复密集计算</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NormalizedJobStartTime <p>仅生产态存储于生产态序列化任务信息, 减少base CPU重复密集计算</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNormalizedJobStartTime(String NormalizedJobStartTime) {
        this.NormalizedJobStartTime = NormalizedJobStartTime;
    }

    /**
     * Get <p>启动暂停的任务时，选择不补录中间实例，通过此字段来标识从哪个时间开始生成实例</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecoverFreezeStartTime <p>启动暂停的任务时，选择不补录中间实例，通过此字段来标识从哪个时间开始生成实例</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRecoverFreezeStartTime() {
        return this.RecoverFreezeStartTime;
    }

    /**
     * Set <p>启动暂停的任务时，选择不补录中间实例，通过此字段来标识从哪个时间开始生成实例</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecoverFreezeStartTime <p>启动暂停的任务时，选择不补录中间实例，通过此字段来标识从哪个时间开始生成实例</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecoverFreezeStartTime(String RecoverFreezeStartTime) {
        this.RecoverFreezeStartTime = RecoverFreezeStartTime;
    }

    /**
     * Get <p>源数据源</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceServer <p>源数据源</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceServer() {
        return this.SourceServer;
    }

    /**
     * Set <p>源数据源</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceServer <p>源数据源</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceServer(String SourceServer) {
        this.SourceServer = SourceServer;
    }

    /**
     * Get <p>目标数据源</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetServer <p>目标数据源</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetServer() {
        return this.TargetServer;
    }

    /**
     * Set <p>目标数据源</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetServer <p>目标数据源</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetServer(String TargetServer) {
        this.TargetServer = TargetServer;
    }

    /**
     * Get <p>父子节点树</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tasks <p>父子节点树</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskDsDTO [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set <p>父子节点树</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tasks <p>父子节点树</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTasks(TaskDsDTO [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get <p>创建者</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Creater <p>创建者</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreater() {
        return this.Creater;
    }

    /**
     * Set <p>创建者</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Creater <p>创建者</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreater(String Creater) {
        this.Creater = Creater;
    }

    /**
     * Get <p>分支，依赖关系，and/or, 默认and</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DependencyRel <p>分支，依赖关系，and/or, 默认and</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDependencyRel() {
        return this.DependencyRel;
    }

    /**
     * Set <p>分支，依赖关系，and/or, 默认and</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DependencyRel <p>分支，依赖关系，and/or, 默认and</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDependencyRel(String DependencyRel) {
        this.DependencyRel = DependencyRel;
    }

    /**
     * Get <p>是否支持工作流依赖 yes / no 默认 no</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DependencyWorkflow <p>是否支持工作流依赖 yes / no 默认 no</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDependencyWorkflow() {
        return this.DependencyWorkflow;
    }

    /**
     * Set <p>是否支持工作流依赖 yes / no 默认 no</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DependencyWorkflow <p>是否支持工作流依赖 yes / no 默认 no</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDependencyWorkflow(String DependencyWorkflow) {
        this.DependencyWorkflow = DependencyWorkflow;
    }

    /**
     * Get <p>支持事件监听器配置导入导出</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventListenerConfig <p>支持事件监听器配置导入导出</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventListenerConfig() {
        return this.EventListenerConfig;
    }

    /**
     * Set <p>支持事件监听器配置导入导出</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventListenerConfig <p>支持事件监听器配置导入导出</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventListenerConfig(String EventListenerConfig) {
        this.EventListenerConfig = EventListenerConfig;
    }

    /**
     * Get <p>支持事件触发器配置导入导出</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventPublisherConfig <p>支持事件触发器配置导入导出</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventPublisherConfig() {
        return this.EventPublisherConfig;
    }

    /**
     * Set <p>支持事件触发器配置导入导出</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventPublisherConfig <p>支持事件触发器配置导入导出</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventPublisherConfig(String EventPublisherConfig) {
        this.EventPublisherConfig = EventPublisherConfig;
    }

    /**
     * Get <p>依赖配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DependencyConfigList <p>依赖配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DependencyConfigDsDTO [] getDependencyConfigList() {
        return this.DependencyConfigList;
    }

    /**
     * Set <p>依赖配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DependencyConfigList <p>依赖配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDependencyConfigList(DependencyConfigDsDTO [] DependencyConfigList) {
        this.DependencyConfigList = DependencyConfigList;
    }

    /**
     * Get <p>任务状态，取值范围：</p><ul><li>N 新建</li><li>Y 运行</li><li>F 停止</li><li>O 冻结</li><li>T 停止中</li><li>INVALID 已失效</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VirtualTaskStatus <p>任务状态，取值范围：</p><ul><li>N 新建</li><li>Y 运行</li><li>F 停止</li><li>O 冻结</li><li>T 停止中</li><li>INVALID 已失效</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVirtualTaskStatus() {
        return this.VirtualTaskStatus;
    }

    /**
     * Set <p>任务状态，取值范围：</p><ul><li>N 新建</li><li>Y 运行</li><li>F 停止</li><li>O 冻结</li><li>T 停止中</li><li>INVALID 已失效</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VirtualTaskStatus <p>任务状态，取值范围：</p><ul><li>N 新建</li><li>Y 运行</li><li>F 停止</li><li>O 冻结</li><li>T 停止中</li><li>INVALID 已失效</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVirtualTaskStatus(String VirtualTaskStatus) {
        this.VirtualTaskStatus = VirtualTaskStatus;
    }

    /**
     * Get <p>回收站还原提示语</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecycleTips <p>回收站还原提示语</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRecycleTips() {
        return this.RecycleTips;
    }

    /**
     * Set <p>回收站还原提示语</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecycleTips <p>回收站还原提示语</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecycleTips(String RecycleTips) {
        this.RecycleTips = RecycleTips;
    }

    /**
     * Get <p>回收站所属用户</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecycleUser <p>回收站所属用户</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRecycleUser() {
        return this.RecycleUser;
    }

    /**
     * Set <p>回收站所属用户</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecycleUser <p>回收站所属用户</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecycleUser(String RecycleUser) {
        this.RecycleUser = RecycleUser;
    }

    /**
     * Get <p>新增 或 修改</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NewOrUpdate <p>新增 或 修改</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNewOrUpdate() {
        return this.NewOrUpdate;
    }

    /**
     * Set <p>新增 或 修改</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NewOrUpdate <p>新增 或 修改</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNewOrUpdate(String NewOrUpdate) {
        this.NewOrUpdate = NewOrUpdate;
    }

    /**
     * Get <p>任务上游依赖信息 用于发布管理导入导出</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Params <p>任务上游依赖信息 用于发布管理导入导出</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ParameterTaskDsDto [] getParams() {
        return this.Params;
    }

    /**
     * Set <p>任务上游依赖信息 用于发布管理导入导出</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Params <p>任务上游依赖信息 用于发布管理导入导出</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParams(ParameterTaskDsDto [] Params) {
        this.Params = Params;
    }

    /**
     * Get <p>任务上游依赖信息 用于发布管理导入导出</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskLinkInfo <p>任务上游依赖信息 用于发布管理导入导出</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskLinkDsDTO [] getTaskLinkInfo() {
        return this.TaskLinkInfo;
    }

    /**
     * Set <p>任务上游依赖信息 用于发布管理导入导出</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskLinkInfo <p>任务上游依赖信息 用于发布管理导入导出</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskLinkInfo(TaskLinkDsDTO [] TaskLinkInfo) {
        this.TaskLinkInfo = TaskLinkInfo;
    }

    /**
     * Get <p>导入结果</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImportResult <p>导入结果</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getImportResult() {
        return this.ImportResult;
    }

    /**
     * Set <p>导入结果</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImportResult <p>导入结果</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImportResult(Boolean ImportResult) {
        this.ImportResult = ImportResult;
    }

    /**
     * Get <p>导入失败原因</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImportErrMsg <p>导入失败原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImportErrMsg() {
        return this.ImportErrMsg;
    }

    /**
     * Set <p>导入失败原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImportErrMsg <p>导入失败原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImportErrMsg(String ImportErrMsg) {
        this.ImportErrMsg = ImportErrMsg;
    }

    /**
     * Get <p>任务内容 全部内容 配置内容 资源内容</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContentType <p>任务内容 全部内容 配置内容 资源内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContentType() {
        return this.ContentType;
    }

    /**
     * Set <p>任务内容 全部内容 配置内容 资源内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContentType <p>任务内容 全部内容 配置内容 资源内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContentType(String ContentType) {
        this.ContentType = ContentType;
    }

    /**
     * Get <p>是否导入提交运行</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskAutoSubmit <p>是否导入提交运行</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getTaskAutoSubmit() {
        return this.TaskAutoSubmit;
    }

    /**
     * Set <p>是否导入提交运行</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskAutoSubmit <p>是否导入提交运行</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskAutoSubmit(Boolean TaskAutoSubmit) {
        this.TaskAutoSubmit = TaskAutoSubmit;
    }

    /**
     * Get <p>上层产品 数据质量 / 数据开发 / ...</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductName <p>上层产品 数据质量 / 数据开发 / ...</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set <p>上层产品 数据质量 / 数据开发 / ...</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductName <p>上层产品 数据质量 / 数据开发 / ...</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get <p>创建者帐号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnId <p>创建者帐号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnId() {
        return this.OwnId;
    }

    /**
     * Set <p>创建者帐号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnId <p>创建者帐号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnId(String OwnId) {
        this.OwnId = OwnId;
    }

    /**
     * Get <p>子账号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserId <p>子账号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>子账号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserId <p>子账号</p>
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
     * Get <p>最后修改的人</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateUser <p>最后修改的人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateUser() {
        return this.UpdateUser;
    }

    /**
     * Set <p>最后修改的人</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateUser <p>最后修改的人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateUser(String UpdateUser) {
        this.UpdateUser = UpdateUser;
    }

    /**
     * Get <p>最后修改时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime <p>最后修改时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>最后修改时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime <p>最后修改时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>最后修改的人的ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateUserId <p>最后修改的人的ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateUserId() {
        return this.UpdateUserId;
    }

    /**
     * Set <p>最后修改的人的ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateUserId <p>最后修改的人的ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateUserId(String UpdateUserId) {
        this.UpdateUserId = UpdateUserId;
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
     * Get <p>版本提交说明</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionDesc <p>版本提交说明</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersionDesc() {
        return this.VersionDesc;
    }

    /**
     * Set <p>版本提交说明</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionDesc <p>版本提交说明</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionDesc(String VersionDesc) {
        this.VersionDesc = VersionDesc;
    }

    /**
     * Get <p>编排-删除添加的链接</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LinkId <p>编排-删除添加的链接</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLinkId() {
        return this.LinkId;
    }

    /**
     * Set <p>编排-删除添加的链接</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LinkId <p>编排-删除添加的链接</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLinkId(String LinkId) {
        this.LinkId = LinkId;
    }

    /**
     * Get <p>脚本引用关系</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserFileId <p>脚本引用关系</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserFileId() {
        return this.UserFileId;
    }

    /**
     * Set <p>脚本引用关系</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserFileId <p>脚本引用关系</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserFileId(String UserFileId) {
        this.UserFileId = UserFileId;
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
     * Get <p>去向数据源ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetServiceId <p>去向数据源ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetServiceId() {
        return this.TargetServiceId;
    }

    /**
     * Set <p>去向数据源ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetServiceId <p>去向数据源ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetServiceId(String TargetServiceId) {
        this.TargetServiceId = TargetServiceId;
    }

    /**
     * Get <p>去向数据源类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetServiceType <p>去向数据源类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetServiceType() {
        return this.TargetServiceType;
    }

    /**
     * Set <p>去向数据源类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetServiceType <p>去向数据源类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetServiceType(String TargetServiceType) {
        this.TargetServiceType = TargetServiceType;
    }

    /**
     * Get <p>输入参数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParamInList <p>输入参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ParameterTaskInDsDto [] getParamInList() {
        return this.ParamInList;
    }

    /**
     * Set <p>输入参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParamInList <p>输入参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParamInList(ParameterTaskInDsDto [] ParamInList) {
        this.ParamInList = ParamInList;
    }

    /**
     * Get <p>输出参数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParamOutList <p>输出参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ParameterTaskOutDsDto [] getParamOutList() {
        return this.ParamOutList;
    }

    /**
     * Set <p>输出参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParamOutList <p>输出参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParamOutList(ParameterTaskOutDsDto [] ParamOutList) {
        this.ParamOutList = ParamOutList;
    }

    /**
     * Get <p>任务文件夹id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskFolderId <p>任务文件夹id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskFolderId() {
        return this.TaskFolderId;
    }

    /**
     * Set <p>任务文件夹id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskFolderId <p>任务文件夹id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskFolderId(String TaskFolderId) {
        this.TaskFolderId = TaskFolderId;
    }

    /**
     * Get <p>最大尝试次数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxRetryAttempts <p>最大尝试次数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxRetryAttempts() {
        return this.MaxRetryAttempts;
    }

    /**
     * Set <p>最大尝试次数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxRetryAttempts <p>最大尝试次数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxRetryAttempts(Long MaxRetryAttempts) {
        this.MaxRetryAttempts = MaxRetryAttempts;
    }

    /**
     * Get <p>资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroupName <p>资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroupName() {
        return this.ResourceGroupName;
    }

    /**
     * Set <p>资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroupName <p>资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroupName(String ResourceGroupName) {
        this.ResourceGroupName = ResourceGroupName;
    }

    /**
     * Get <p>数据源</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceServiceName <p>数据源</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceServiceName() {
        return this.SourceServiceName;
    }

    /**
     * Set <p>数据源</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceServiceName <p>数据源</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceServiceName(String SourceServiceName) {
        this.SourceServiceName = SourceServiceName;
    }

    /**
     * Get <p>任务产出登记</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskRegisterOutputTable <p>任务产出登记</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskDataRegistryDTO [] getTaskRegisterOutputTable() {
        return this.TaskRegisterOutputTable;
    }

    /**
     * Set <p>任务产出登记</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskRegisterOutputTable <p>任务产出登记</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskRegisterOutputTable(TaskDataRegistryDTO [] TaskRegisterOutputTable) {
        this.TaskRegisterOutputTable = TaskRegisterOutputTable;
    }

    /**
     * Get <p>循环依赖配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CycleDependencyConfigList <p>循环依赖配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskCycleLinkDTO [] getCycleDependencyConfigList() {
        return this.CycleDependencyConfigList;
    }

    /**
     * Set <p>循环依赖配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CycleDependencyConfigList <p>循环依赖配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCycleDependencyConfigList(TaskCycleLinkDTO [] CycleDependencyConfigList) {
        this.CycleDependencyConfigList = CycleDependencyConfigList;
    }

    /**
     * Get <p>特殊警告信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Warning <p>特殊警告信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWarning() {
        return this.Warning;
    }

    /**
     * Set <p>特殊警告信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Warning <p>特殊警告信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWarning(String Warning) {
        this.Warning = Warning;
    }

    /**
     * Get <p>0 正常调度 1 空跑调度</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScheduleRunType <p>0 正常调度 1 空跑调度</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScheduleRunType() {
        return this.ScheduleRunType;
    }

    /**
     * Set <p>0 正常调度 1 空跑调度</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScheduleRunType <p>0 正常调度 1 空跑调度</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheduleRunType(Long ScheduleRunType) {
        this.ScheduleRunType = ScheduleRunType;
    }

    /**
     * Get <p>0 并发度达到上限时，本次排队等待 1 并发度达到上限时，本次不执行，直接kill</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConcurrentStrategy <p>0 并发度达到上限时，本次排队等待 1 并发度达到上限时，本次不执行，直接kill</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getConcurrentStrategy() {
        return this.ConcurrentStrategy;
    }

    /**
     * Set <p>0 并发度达到上限时，本次排队等待 1 并发度达到上限时，本次不执行，直接kill</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConcurrentStrategy <p>0 并发度达到上限时，本次排队等待 1 并发度达到上限时，本次不执行，直接kill</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConcurrentStrategy(Long ConcurrentStrategy) {
        this.ConcurrentStrategy = ConcurrentStrategy;
    }

    /**
     * Get <p>UTC+8;UDC-8</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScheduleTimeZone <p>UTC+8;UDC-8</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScheduleTimeZone() {
        return this.ScheduleTimeZone;
    }

    /**
     * Set <p>UTC+8;UDC-8</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScheduleTimeZone <p>UTC+8;UDC-8</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheduleTimeZone(String ScheduleTimeZone) {
        this.ScheduleTimeZone = ScheduleTimeZone;
    }

    /**
     * Get <p>引用的代码模版id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TemplateId <p>引用的代码模版id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set <p>引用的代码模版id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TemplateId <p>引用的代码模版id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get <p>允许重跑类 ALL 无论实例成功或者失败，都允许重跑 FAILURE 只有失败的实例允许重跑，成功的实例不允许重跑 NONE 无论成功或者失败，都不允许重跑</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AllowRedoType <p>允许重跑类 ALL 无论实例成功或者失败，都允许重跑 FAILURE 只有失败的实例允许重跑，成功的实例不允许重跑 NONE 无论成功或者失败，都不允许重跑</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAllowRedoType() {
        return this.AllowRedoType;
    }

    /**
     * Set <p>允许重跑类 ALL 无论实例成功或者失败，都允许重跑 FAILURE 只有失败的实例允许重跑，成功的实例不允许重跑 NONE 无论成功或者失败，都不允许重跑</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AllowRedoType <p>允许重跑类 ALL 无论实例成功或者失败，都允许重跑 FAILURE 只有失败的实例允许重跑，成功的实例不允许重跑 NONE 无论成功或者失败，都不允许重跑</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAllowRedoType(String AllowRedoType) {
        this.AllowRedoType = AllowRedoType;
    }

    /**
     * Get <p>BundleId<br>CI/CD工程生成的bundle唯一标识</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BundleId <p>BundleId<br>CI/CD工程生成的bundle唯一标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set <p>BundleId<br>CI/CD工程生成的bundle唯一标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BundleId <p>BundleId<br>CI/CD工程生成的bundle唯一标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    /**
     * Get <p>bundle信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BundleInfo <p>bundle信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBundleInfo() {
        return this.BundleInfo;
    }

    /**
     * Set <p>bundle信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BundleInfo <p>bundle信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBundleInfo(String BundleInfo) {
        this.BundleInfo = BundleInfo;
    }

    /**
     * Get <p>是否允许下游依赖 0 不允许 1 允许</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AllowDownstreamDependency <p>是否允许下游依赖 0 不允许 1 允许</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAllowDownstreamDependency() {
        return this.AllowDownstreamDependency;
    }

    /**
     * Set <p>是否允许下游依赖 0 不允许 1 允许</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AllowDownstreamDependency <p>是否允许下游依赖 0 不允许 1 允许</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAllowDownstreamDependency(Long AllowDownstreamDependency) {
        this.AllowDownstreamDependency = AllowDownstreamDependency;
    }

    /**
     * Get <ul><li>任务依赖运行条件，默认为ALL_SUCCESS，暂时只支持工作流调度项目下配置</li><li>ALL_SUCCESS： 全部成功：所有上游依赖任务都达到终态时，进行依赖判断，如果上游全部都成功，则依赖判断成功，否则如果上游有一个跳过运行，则标记为跳过运行，其余情况标记为上游失败</li><li>ALL_FAILED：全部失败：所有上游依赖任务都达到终态时，进行依赖判断，如果上游状态都是失败或者上游失败，则依赖判断成功，否则就标记为跳过运行</li><li>ALL_DONE：全部完成：所有上游依赖任务都达到终态时，进行依赖判断，直接是依赖判断成功</li><li>ALL_DONE_AT_LEAST_ONE_SUCCESS：上游全部完成至少一个成功: 所有上游依赖任务都达到终态时，进行依赖判断，至少有一个成功，则依赖判断成功，否则就是跳过运行</li><li>ALL_SKIPPED：上游全部都跳过: 所有上游依赖任务都达到终态时，进行依赖判断，所有的上游都是跳过状态才算依赖判断成功，否则当前节点就是跳过运行</li><li>ONE_FAILED：至少一个失败: 上游只要有一个失败了，就进行依赖判断，且依赖判断成功，如果上游全部完成但是没有失败，则跳过运行</li><li>ONE_SUCCESS：至少一个成功：上游只要有一个成功，就进行依赖判断，且依赖判断成功，如果上游全部完成但是没有成功，则跳过运行</li><li>ONE_DONE：至少一个完成：上游只要有一个完成了，就进行依赖判断，且依赖判断成功，否则还是等待上游</li><li>NONE_FAILED：上游全部完成，没有失败: 所有上游依赖任务都达到终态时，进行依赖判断，如果上游都是成功或者跳过运行，则依赖判断成功，否则标记为上游失败</li><li>ALL_DONE_NONE_FAILED_AT_LEAST_ONE_SUCCESS：上游全部完成，没有失败，至少有一个成功: 所有上游依赖任务都达到终态时，进行依赖判断，上游没有一个失败且至少有一个成功的情况下，依赖判断成功，否则就是跳过运行</li><li>NONE_SKIPPED：上游全部完成，没有跳过运行: 所有上游依赖任务都达到终态时，进行依赖判断, 如果上游状态全部都是成功、失败、上游失败状态，则依赖判断成功，否则为跳过运行</li><li>ALL_DONE_AT_LEAST_ONE_FAILED：上游全部完成至少一个失败: 所有上游依赖任务都达到终态时，进行依赖判断，至少有一个失败，则依赖判断成功，否则就是跳过运行</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DependencyTriggerPolicy <ul><li>任务依赖运行条件，默认为ALL_SUCCESS，暂时只支持工作流调度项目下配置</li><li>ALL_SUCCESS： 全部成功：所有上游依赖任务都达到终态时，进行依赖判断，如果上游全部都成功，则依赖判断成功，否则如果上游有一个跳过运行，则标记为跳过运行，其余情况标记为上游失败</li><li>ALL_FAILED：全部失败：所有上游依赖任务都达到终态时，进行依赖判断，如果上游状态都是失败或者上游失败，则依赖判断成功，否则就标记为跳过运行</li><li>ALL_DONE：全部完成：所有上游依赖任务都达到终态时，进行依赖判断，直接是依赖判断成功</li><li>ALL_DONE_AT_LEAST_ONE_SUCCESS：上游全部完成至少一个成功: 所有上游依赖任务都达到终态时，进行依赖判断，至少有一个成功，则依赖判断成功，否则就是跳过运行</li><li>ALL_SKIPPED：上游全部都跳过: 所有上游依赖任务都达到终态时，进行依赖判断，所有的上游都是跳过状态才算依赖判断成功，否则当前节点就是跳过运行</li><li>ONE_FAILED：至少一个失败: 上游只要有一个失败了，就进行依赖判断，且依赖判断成功，如果上游全部完成但是没有失败，则跳过运行</li><li>ONE_SUCCESS：至少一个成功：上游只要有一个成功，就进行依赖判断，且依赖判断成功，如果上游全部完成但是没有成功，则跳过运行</li><li>ONE_DONE：至少一个完成：上游只要有一个完成了，就进行依赖判断，且依赖判断成功，否则还是等待上游</li><li>NONE_FAILED：上游全部完成，没有失败: 所有上游依赖任务都达到终态时，进行依赖判断，如果上游都是成功或者跳过运行，则依赖判断成功，否则标记为上游失败</li><li>ALL_DONE_NONE_FAILED_AT_LEAST_ONE_SUCCESS：上游全部完成，没有失败，至少有一个成功: 所有上游依赖任务都达到终态时，进行依赖判断，上游没有一个失败且至少有一个成功的情况下，依赖判断成功，否则就是跳过运行</li><li>NONE_SKIPPED：上游全部完成，没有跳过运行: 所有上游依赖任务都达到终态时，进行依赖判断, 如果上游状态全部都是成功、失败、上游失败状态，则依赖判断成功，否则为跳过运行</li><li>ALL_DONE_AT_LEAST_ONE_FAILED：上游全部完成至少一个失败: 所有上游依赖任务都达到终态时，进行依赖判断，至少有一个失败，则依赖判断成功，否则就是跳过运行</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDependencyTriggerPolicy() {
        return this.DependencyTriggerPolicy;
    }

    /**
     * Set <ul><li>任务依赖运行条件，默认为ALL_SUCCESS，暂时只支持工作流调度项目下配置</li><li>ALL_SUCCESS： 全部成功：所有上游依赖任务都达到终态时，进行依赖判断，如果上游全部都成功，则依赖判断成功，否则如果上游有一个跳过运行，则标记为跳过运行，其余情况标记为上游失败</li><li>ALL_FAILED：全部失败：所有上游依赖任务都达到终态时，进行依赖判断，如果上游状态都是失败或者上游失败，则依赖判断成功，否则就标记为跳过运行</li><li>ALL_DONE：全部完成：所有上游依赖任务都达到终态时，进行依赖判断，直接是依赖判断成功</li><li>ALL_DONE_AT_LEAST_ONE_SUCCESS：上游全部完成至少一个成功: 所有上游依赖任务都达到终态时，进行依赖判断，至少有一个成功，则依赖判断成功，否则就是跳过运行</li><li>ALL_SKIPPED：上游全部都跳过: 所有上游依赖任务都达到终态时，进行依赖判断，所有的上游都是跳过状态才算依赖判断成功，否则当前节点就是跳过运行</li><li>ONE_FAILED：至少一个失败: 上游只要有一个失败了，就进行依赖判断，且依赖判断成功，如果上游全部完成但是没有失败，则跳过运行</li><li>ONE_SUCCESS：至少一个成功：上游只要有一个成功，就进行依赖判断，且依赖判断成功，如果上游全部完成但是没有成功，则跳过运行</li><li>ONE_DONE：至少一个完成：上游只要有一个完成了，就进行依赖判断，且依赖判断成功，否则还是等待上游</li><li>NONE_FAILED：上游全部完成，没有失败: 所有上游依赖任务都达到终态时，进行依赖判断，如果上游都是成功或者跳过运行，则依赖判断成功，否则标记为上游失败</li><li>ALL_DONE_NONE_FAILED_AT_LEAST_ONE_SUCCESS：上游全部完成，没有失败，至少有一个成功: 所有上游依赖任务都达到终态时，进行依赖判断，上游没有一个失败且至少有一个成功的情况下，依赖判断成功，否则就是跳过运行</li><li>NONE_SKIPPED：上游全部完成，没有跳过运行: 所有上游依赖任务都达到终态时，进行依赖判断, 如果上游状态全部都是成功、失败、上游失败状态，则依赖判断成功，否则为跳过运行</li><li>ALL_DONE_AT_LEAST_ONE_FAILED：上游全部完成至少一个失败: 所有上游依赖任务都达到终态时，进行依赖判断，至少有一个失败，则依赖判断成功，否则就是跳过运行</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DependencyTriggerPolicy <ul><li>任务依赖运行条件，默认为ALL_SUCCESS，暂时只支持工作流调度项目下配置</li><li>ALL_SUCCESS： 全部成功：所有上游依赖任务都达到终态时，进行依赖判断，如果上游全部都成功，则依赖判断成功，否则如果上游有一个跳过运行，则标记为跳过运行，其余情况标记为上游失败</li><li>ALL_FAILED：全部失败：所有上游依赖任务都达到终态时，进行依赖判断，如果上游状态都是失败或者上游失败，则依赖判断成功，否则就标记为跳过运行</li><li>ALL_DONE：全部完成：所有上游依赖任务都达到终态时，进行依赖判断，直接是依赖判断成功</li><li>ALL_DONE_AT_LEAST_ONE_SUCCESS：上游全部完成至少一个成功: 所有上游依赖任务都达到终态时，进行依赖判断，至少有一个成功，则依赖判断成功，否则就是跳过运行</li><li>ALL_SKIPPED：上游全部都跳过: 所有上游依赖任务都达到终态时，进行依赖判断，所有的上游都是跳过状态才算依赖判断成功，否则当前节点就是跳过运行</li><li>ONE_FAILED：至少一个失败: 上游只要有一个失败了，就进行依赖判断，且依赖判断成功，如果上游全部完成但是没有失败，则跳过运行</li><li>ONE_SUCCESS：至少一个成功：上游只要有一个成功，就进行依赖判断，且依赖判断成功，如果上游全部完成但是没有成功，则跳过运行</li><li>ONE_DONE：至少一个完成：上游只要有一个完成了，就进行依赖判断，且依赖判断成功，否则还是等待上游</li><li>NONE_FAILED：上游全部完成，没有失败: 所有上游依赖任务都达到终态时，进行依赖判断，如果上游都是成功或者跳过运行，则依赖判断成功，否则标记为上游失败</li><li>ALL_DONE_NONE_FAILED_AT_LEAST_ONE_SUCCESS：上游全部完成，没有失败，至少有一个成功: 所有上游依赖任务都达到终态时，进行依赖判断，上游没有一个失败且至少有一个成功的情况下，依赖判断成功，否则就是跳过运行</li><li>NONE_SKIPPED：上游全部完成，没有跳过运行: 所有上游依赖任务都达到终态时，进行依赖判断, 如果上游状态全部都是成功、失败、上游失败状态，则依赖判断成功，否则为跳过运行</li><li>ALL_DONE_AT_LEAST_ONE_FAILED：上游全部完成至少一个失败: 所有上游依赖任务都达到终态时，进行依赖判断，至少有一个失败，则依赖判断成功，否则就是跳过运行</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDependencyTriggerPolicy(String DependencyTriggerPolicy) {
        this.DependencyTriggerPolicy = DependencyTriggerPolicy;
    }

    /**
     * Get <p>任务最后更新时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastUpdateTimestamp <p>任务最后更新时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLastUpdateTimestamp() {
        return this.LastUpdateTimestamp;
    }

    /**
     * Set <p>任务最后更新时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastUpdateTimestamp <p>任务最后更新时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastUpdateTimestamp(Long LastUpdateTimestamp) {
        this.LastUpdateTimestamp = LastUpdateTimestamp;
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
        if (source.AllowRedoType != null) {
            this.AllowRedoType = new String(source.AllowRedoType);
        }
        if (source.BundleId != null) {
            this.BundleId = new String(source.BundleId);
        }
        if (source.BundleInfo != null) {
            this.BundleInfo = new String(source.BundleInfo);
        }
        if (source.AllowDownstreamDependency != null) {
            this.AllowDownstreamDependency = new Long(source.AllowDownstreamDependency);
        }
        if (source.DependencyTriggerPolicy != null) {
            this.DependencyTriggerPolicy = new String(source.DependencyTriggerPolicy);
        }
        if (source.LastUpdateTimestamp != null) {
            this.LastUpdateTimestamp = new Long(source.LastUpdateTimestamp);
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
        this.setParamSimple(map, prefix + "AllowRedoType", this.AllowRedoType);
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "BundleInfo", this.BundleInfo);
        this.setParamSimple(map, prefix + "AllowDownstreamDependency", this.AllowDownstreamDependency);
        this.setParamSimple(map, prefix + "DependencyTriggerPolicy", this.DependencyTriggerPolicy);
        this.setParamSimple(map, prefix + "LastUpdateTimestamp", this.LastUpdateTimestamp);

    }
}

