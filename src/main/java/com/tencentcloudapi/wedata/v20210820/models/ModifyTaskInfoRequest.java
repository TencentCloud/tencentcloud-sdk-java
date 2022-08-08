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

public class ModifyTaskInfoRequest extends AbstractModel{

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 执行时间，单位分钟，天/周/月/年调度才有。比如天调度，每天的02:00点执行一次，delayTime就是120分钟
    */
    @SerializedName("DelayTime")
    @Expose
    private Long DelayTime;

    /**
    * 启动时间
    */
    @SerializedName("StartupTime")
    @Expose
    private Long StartupTime;

    /**
    * 自依赖类型  1:有序串行 一次一个 排队, 2: 无序串行 一次一个 不排队， 3:并行 一次多个
    */
    @SerializedName("SelfDepend")
    @Expose
    private Long SelfDepend;

    /**
    * 生效开始时间，格式 yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 生效结束时间，格式 yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 调度配置-弹性周期配置，小时/周/月/年调度才有，小时任务指定每天的0点3点4点跑，则为'0,3,4'。
    */
    @SerializedName("TaskAction")
    @Expose
    private String TaskAction;

    /**
    * "周期类型  0:crontab类型, 1:分钟，2:小时，3:天，4:周，5:月，6:一次性，7:用户驱动，10:弹性周期 周,11:弹性周期 月,12:年,13:即时触发Instant类型，与正常周期调度任务逻辑隔离
    */
    @SerializedName("CycleType")
    @Expose
    private Long CycleType;

    /**
    * 步长，间隔时间，最小1
    */
    @SerializedName("CycleStep")
    @Expose
    private Long CycleStep;

    /**
    * cron表达式  周期类型为crontab调度才需要
    */
    @SerializedName("CrontabExpression")
    @Expose
    private String CrontabExpression;

    /**
    * 执行时间左闭区间，格式：HH:mm  小时调度才有，例如小时任务, 每日固定区间生效
    */
    @SerializedName("ExecutionStartTime")
    @Expose
    private String ExecutionStartTime;

    /**
    * 执行时间右闭区间，格式：HH:mm  小时调度才有，例如小时任务, 每日固定区间生效
    */
    @SerializedName("ExecutionEndTime")
    @Expose
    private String ExecutionEndTime;

    /**
    * 新的任务名
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 失败重试间隔,单位分钟，创建任务的时候已经给了默认值
    */
    @SerializedName("RetryWait")
    @Expose
    private Long RetryWait;

    /**
    * 失败重试次数，创建任务的时候已经给了默认值
    */
    @SerializedName("TryLimit")
    @Expose
    private Long TryLimit;

    /**
    * 是否可重试，1代表可以重试
    */
    @SerializedName("Retriable")
    @Expose
    private Long Retriable;

    /**
    * 运行优先级，4高 5中 6低
    */
    @SerializedName("RunPriority")
    @Expose
    private Long RunPriority;

    /**
    * 任务的扩展配置
    */
    @SerializedName("TaskExt")
    @Expose
    private TaskExtInfo [] TaskExt;

    /**
    * 执行资源组id，需要去资源管理服务上创建调度资源组，并且绑定cvm机器
    */
    @SerializedName("ResourceGroup")
    @Expose
    private String ResourceGroup;

    /**
    * 资源池队列名称
    */
    @SerializedName("YarnQueue")
    @Expose
    private String YarnQueue;

    /**
    * 资源组下具体执行机，any 表示可以跑在任意一台。
    */
    @SerializedName("BrokerIp")
    @Expose
    private String BrokerIp;

    /**
    * 责任人
    */
    @SerializedName("InCharge")
    @Expose
    private String InCharge;

    /**
    * 任务备注
    */
    @SerializedName("Notes")
    @Expose
    private String Notes;

    /**
    * 任务参数
    */
    @SerializedName("TaskParamInfos")
    @Expose
    private ParamInfo [] TaskParamInfos;

    /**
    * 源数据源
    */
    @SerializedName("SourceServer")
    @Expose
    private String SourceServer;

    /**
    * 目标数据源
    */
    @SerializedName("TargetServer")
    @Expose
    private String TargetServer;

    /**
    * 是否支持工作流依赖 yes / no 默认 no
    */
    @SerializedName("DependencyWorkflow")
    @Expose
    private String DependencyWorkflow;

    /**
    * 依赖配置
    */
    @SerializedName("DependencyConfigDTOs")
    @Expose
    private DependencyConfig [] DependencyConfigDTOs;

    /**
     * Get 项目Id 
     * @return ProjectId 项目Id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目Id
     * @param ProjectId 项目Id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 任务ID 
     * @return TaskId 任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
     * @param TaskId 任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 执行时间，单位分钟，天/周/月/年调度才有。比如天调度，每天的02:00点执行一次，delayTime就是120分钟 
     * @return DelayTime 执行时间，单位分钟，天/周/月/年调度才有。比如天调度，每天的02:00点执行一次，delayTime就是120分钟
     */
    public Long getDelayTime() {
        return this.DelayTime;
    }

    /**
     * Set 执行时间，单位分钟，天/周/月/年调度才有。比如天调度，每天的02:00点执行一次，delayTime就是120分钟
     * @param DelayTime 执行时间，单位分钟，天/周/月/年调度才有。比如天调度，每天的02:00点执行一次，delayTime就是120分钟
     */
    public void setDelayTime(Long DelayTime) {
        this.DelayTime = DelayTime;
    }

    /**
     * Get 启动时间 
     * @return StartupTime 启动时间
     */
    public Long getStartupTime() {
        return this.StartupTime;
    }

    /**
     * Set 启动时间
     * @param StartupTime 启动时间
     */
    public void setStartupTime(Long StartupTime) {
        this.StartupTime = StartupTime;
    }

    /**
     * Get 自依赖类型  1:有序串行 一次一个 排队, 2: 无序串行 一次一个 不排队， 3:并行 一次多个 
     * @return SelfDepend 自依赖类型  1:有序串行 一次一个 排队, 2: 无序串行 一次一个 不排队， 3:并行 一次多个
     */
    public Long getSelfDepend() {
        return this.SelfDepend;
    }

    /**
     * Set 自依赖类型  1:有序串行 一次一个 排队, 2: 无序串行 一次一个 不排队， 3:并行 一次多个
     * @param SelfDepend 自依赖类型  1:有序串行 一次一个 排队, 2: 无序串行 一次一个 不排队， 3:并行 一次多个
     */
    public void setSelfDepend(Long SelfDepend) {
        this.SelfDepend = SelfDepend;
    }

    /**
     * Get 生效开始时间，格式 yyyy-MM-dd HH:mm:ss 
     * @return StartTime 生效开始时间，格式 yyyy-MM-dd HH:mm:ss
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 生效开始时间，格式 yyyy-MM-dd HH:mm:ss
     * @param StartTime 生效开始时间，格式 yyyy-MM-dd HH:mm:ss
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 生效结束时间，格式 yyyy-MM-dd HH:mm:ss 
     * @return EndTime 生效结束时间，格式 yyyy-MM-dd HH:mm:ss
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 生效结束时间，格式 yyyy-MM-dd HH:mm:ss
     * @param EndTime 生效结束时间，格式 yyyy-MM-dd HH:mm:ss
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 调度配置-弹性周期配置，小时/周/月/年调度才有，小时任务指定每天的0点3点4点跑，则为'0,3,4'。 
     * @return TaskAction 调度配置-弹性周期配置，小时/周/月/年调度才有，小时任务指定每天的0点3点4点跑，则为'0,3,4'。
     */
    public String getTaskAction() {
        return this.TaskAction;
    }

    /**
     * Set 调度配置-弹性周期配置，小时/周/月/年调度才有，小时任务指定每天的0点3点4点跑，则为'0,3,4'。
     * @param TaskAction 调度配置-弹性周期配置，小时/周/月/年调度才有，小时任务指定每天的0点3点4点跑，则为'0,3,4'。
     */
    public void setTaskAction(String TaskAction) {
        this.TaskAction = TaskAction;
    }

    /**
     * Get "周期类型  0:crontab类型, 1:分钟，2:小时，3:天，4:周，5:月，6:一次性，7:用户驱动，10:弹性周期 周,11:弹性周期 月,12:年,13:即时触发Instant类型，与正常周期调度任务逻辑隔离 
     * @return CycleType "周期类型  0:crontab类型, 1:分钟，2:小时，3:天，4:周，5:月，6:一次性，7:用户驱动，10:弹性周期 周,11:弹性周期 月,12:年,13:即时触发Instant类型，与正常周期调度任务逻辑隔离
     */
    public Long getCycleType() {
        return this.CycleType;
    }

    /**
     * Set "周期类型  0:crontab类型, 1:分钟，2:小时，3:天，4:周，5:月，6:一次性，7:用户驱动，10:弹性周期 周,11:弹性周期 月,12:年,13:即时触发Instant类型，与正常周期调度任务逻辑隔离
     * @param CycleType "周期类型  0:crontab类型, 1:分钟，2:小时，3:天，4:周，5:月，6:一次性，7:用户驱动，10:弹性周期 周,11:弹性周期 月,12:年,13:即时触发Instant类型，与正常周期调度任务逻辑隔离
     */
    public void setCycleType(Long CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get 步长，间隔时间，最小1 
     * @return CycleStep 步长，间隔时间，最小1
     */
    public Long getCycleStep() {
        return this.CycleStep;
    }

    /**
     * Set 步长，间隔时间，最小1
     * @param CycleStep 步长，间隔时间，最小1
     */
    public void setCycleStep(Long CycleStep) {
        this.CycleStep = CycleStep;
    }

    /**
     * Get cron表达式  周期类型为crontab调度才需要 
     * @return CrontabExpression cron表达式  周期类型为crontab调度才需要
     */
    public String getCrontabExpression() {
        return this.CrontabExpression;
    }

    /**
     * Set cron表达式  周期类型为crontab调度才需要
     * @param CrontabExpression cron表达式  周期类型为crontab调度才需要
     */
    public void setCrontabExpression(String CrontabExpression) {
        this.CrontabExpression = CrontabExpression;
    }

    /**
     * Get 执行时间左闭区间，格式：HH:mm  小时调度才有，例如小时任务, 每日固定区间生效 
     * @return ExecutionStartTime 执行时间左闭区间，格式：HH:mm  小时调度才有，例如小时任务, 每日固定区间生效
     */
    public String getExecutionStartTime() {
        return this.ExecutionStartTime;
    }

    /**
     * Set 执行时间左闭区间，格式：HH:mm  小时调度才有，例如小时任务, 每日固定区间生效
     * @param ExecutionStartTime 执行时间左闭区间，格式：HH:mm  小时调度才有，例如小时任务, 每日固定区间生效
     */
    public void setExecutionStartTime(String ExecutionStartTime) {
        this.ExecutionStartTime = ExecutionStartTime;
    }

    /**
     * Get 执行时间右闭区间，格式：HH:mm  小时调度才有，例如小时任务, 每日固定区间生效 
     * @return ExecutionEndTime 执行时间右闭区间，格式：HH:mm  小时调度才有，例如小时任务, 每日固定区间生效
     */
    public String getExecutionEndTime() {
        return this.ExecutionEndTime;
    }

    /**
     * Set 执行时间右闭区间，格式：HH:mm  小时调度才有，例如小时任务, 每日固定区间生效
     * @param ExecutionEndTime 执行时间右闭区间，格式：HH:mm  小时调度才有，例如小时任务, 每日固定区间生效
     */
    public void setExecutionEndTime(String ExecutionEndTime) {
        this.ExecutionEndTime = ExecutionEndTime;
    }

    /**
     * Get 新的任务名 
     * @return TaskName 新的任务名
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 新的任务名
     * @param TaskName 新的任务名
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 失败重试间隔,单位分钟，创建任务的时候已经给了默认值 
     * @return RetryWait 失败重试间隔,单位分钟，创建任务的时候已经给了默认值
     */
    public Long getRetryWait() {
        return this.RetryWait;
    }

    /**
     * Set 失败重试间隔,单位分钟，创建任务的时候已经给了默认值
     * @param RetryWait 失败重试间隔,单位分钟，创建任务的时候已经给了默认值
     */
    public void setRetryWait(Long RetryWait) {
        this.RetryWait = RetryWait;
    }

    /**
     * Get 失败重试次数，创建任务的时候已经给了默认值 
     * @return TryLimit 失败重试次数，创建任务的时候已经给了默认值
     */
    public Long getTryLimit() {
        return this.TryLimit;
    }

    /**
     * Set 失败重试次数，创建任务的时候已经给了默认值
     * @param TryLimit 失败重试次数，创建任务的时候已经给了默认值
     */
    public void setTryLimit(Long TryLimit) {
        this.TryLimit = TryLimit;
    }

    /**
     * Get 是否可重试，1代表可以重试 
     * @return Retriable 是否可重试，1代表可以重试
     */
    public Long getRetriable() {
        return this.Retriable;
    }

    /**
     * Set 是否可重试，1代表可以重试
     * @param Retriable 是否可重试，1代表可以重试
     */
    public void setRetriable(Long Retriable) {
        this.Retriable = Retriable;
    }

    /**
     * Get 运行优先级，4高 5中 6低 
     * @return RunPriority 运行优先级，4高 5中 6低
     */
    public Long getRunPriority() {
        return this.RunPriority;
    }

    /**
     * Set 运行优先级，4高 5中 6低
     * @param RunPriority 运行优先级，4高 5中 6低
     */
    public void setRunPriority(Long RunPriority) {
        this.RunPriority = RunPriority;
    }

    /**
     * Get 任务的扩展配置 
     * @return TaskExt 任务的扩展配置
     */
    public TaskExtInfo [] getTaskExt() {
        return this.TaskExt;
    }

    /**
     * Set 任务的扩展配置
     * @param TaskExt 任务的扩展配置
     */
    public void setTaskExt(TaskExtInfo [] TaskExt) {
        this.TaskExt = TaskExt;
    }

    /**
     * Get 执行资源组id，需要去资源管理服务上创建调度资源组，并且绑定cvm机器 
     * @return ResourceGroup 执行资源组id，需要去资源管理服务上创建调度资源组，并且绑定cvm机器
     */
    public String getResourceGroup() {
        return this.ResourceGroup;
    }

    /**
     * Set 执行资源组id，需要去资源管理服务上创建调度资源组，并且绑定cvm机器
     * @param ResourceGroup 执行资源组id，需要去资源管理服务上创建调度资源组，并且绑定cvm机器
     */
    public void setResourceGroup(String ResourceGroup) {
        this.ResourceGroup = ResourceGroup;
    }

    /**
     * Get 资源池队列名称 
     * @return YarnQueue 资源池队列名称
     */
    public String getYarnQueue() {
        return this.YarnQueue;
    }

    /**
     * Set 资源池队列名称
     * @param YarnQueue 资源池队列名称
     */
    public void setYarnQueue(String YarnQueue) {
        this.YarnQueue = YarnQueue;
    }

    /**
     * Get 资源组下具体执行机，any 表示可以跑在任意一台。 
     * @return BrokerIp 资源组下具体执行机，any 表示可以跑在任意一台。
     */
    public String getBrokerIp() {
        return this.BrokerIp;
    }

    /**
     * Set 资源组下具体执行机，any 表示可以跑在任意一台。
     * @param BrokerIp 资源组下具体执行机，any 表示可以跑在任意一台。
     */
    public void setBrokerIp(String BrokerIp) {
        this.BrokerIp = BrokerIp;
    }

    /**
     * Get 责任人 
     * @return InCharge 责任人
     */
    public String getInCharge() {
        return this.InCharge;
    }

    /**
     * Set 责任人
     * @param InCharge 责任人
     */
    public void setInCharge(String InCharge) {
        this.InCharge = InCharge;
    }

    /**
     * Get 任务备注 
     * @return Notes 任务备注
     */
    public String getNotes() {
        return this.Notes;
    }

    /**
     * Set 任务备注
     * @param Notes 任务备注
     */
    public void setNotes(String Notes) {
        this.Notes = Notes;
    }

    /**
     * Get 任务参数 
     * @return TaskParamInfos 任务参数
     */
    public ParamInfo [] getTaskParamInfos() {
        return this.TaskParamInfos;
    }

    /**
     * Set 任务参数
     * @param TaskParamInfos 任务参数
     */
    public void setTaskParamInfos(ParamInfo [] TaskParamInfos) {
        this.TaskParamInfos = TaskParamInfos;
    }

    /**
     * Get 源数据源 
     * @return SourceServer 源数据源
     */
    public String getSourceServer() {
        return this.SourceServer;
    }

    /**
     * Set 源数据源
     * @param SourceServer 源数据源
     */
    public void setSourceServer(String SourceServer) {
        this.SourceServer = SourceServer;
    }

    /**
     * Get 目标数据源 
     * @return TargetServer 目标数据源
     */
    public String getTargetServer() {
        return this.TargetServer;
    }

    /**
     * Set 目标数据源
     * @param TargetServer 目标数据源
     */
    public void setTargetServer(String TargetServer) {
        this.TargetServer = TargetServer;
    }

    /**
     * Get 是否支持工作流依赖 yes / no 默认 no 
     * @return DependencyWorkflow 是否支持工作流依赖 yes / no 默认 no
     */
    public String getDependencyWorkflow() {
        return this.DependencyWorkflow;
    }

    /**
     * Set 是否支持工作流依赖 yes / no 默认 no
     * @param DependencyWorkflow 是否支持工作流依赖 yes / no 默认 no
     */
    public void setDependencyWorkflow(String DependencyWorkflow) {
        this.DependencyWorkflow = DependencyWorkflow;
    }

    /**
     * Get 依赖配置 
     * @return DependencyConfigDTOs 依赖配置
     */
    public DependencyConfig [] getDependencyConfigDTOs() {
        return this.DependencyConfigDTOs;
    }

    /**
     * Set 依赖配置
     * @param DependencyConfigDTOs 依赖配置
     */
    public void setDependencyConfigDTOs(DependencyConfig [] DependencyConfigDTOs) {
        this.DependencyConfigDTOs = DependencyConfigDTOs;
    }

    public ModifyTaskInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTaskInfoRequest(ModifyTaskInfoRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.DelayTime != null) {
            this.DelayTime = new Long(source.DelayTime);
        }
        if (source.StartupTime != null) {
            this.StartupTime = new Long(source.StartupTime);
        }
        if (source.SelfDepend != null) {
            this.SelfDepend = new Long(source.SelfDepend);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.TaskAction != null) {
            this.TaskAction = new String(source.TaskAction);
        }
        if (source.CycleType != null) {
            this.CycleType = new Long(source.CycleType);
        }
        if (source.CycleStep != null) {
            this.CycleStep = new Long(source.CycleStep);
        }
        if (source.CrontabExpression != null) {
            this.CrontabExpression = new String(source.CrontabExpression);
        }
        if (source.ExecutionStartTime != null) {
            this.ExecutionStartTime = new String(source.ExecutionStartTime);
        }
        if (source.ExecutionEndTime != null) {
            this.ExecutionEndTime = new String(source.ExecutionEndTime);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.RetryWait != null) {
            this.RetryWait = new Long(source.RetryWait);
        }
        if (source.TryLimit != null) {
            this.TryLimit = new Long(source.TryLimit);
        }
        if (source.Retriable != null) {
            this.Retriable = new Long(source.Retriable);
        }
        if (source.RunPriority != null) {
            this.RunPriority = new Long(source.RunPriority);
        }
        if (source.TaskExt != null) {
            this.TaskExt = new TaskExtInfo[source.TaskExt.length];
            for (int i = 0; i < source.TaskExt.length; i++) {
                this.TaskExt[i] = new TaskExtInfo(source.TaskExt[i]);
            }
        }
        if (source.ResourceGroup != null) {
            this.ResourceGroup = new String(source.ResourceGroup);
        }
        if (source.YarnQueue != null) {
            this.YarnQueue = new String(source.YarnQueue);
        }
        if (source.BrokerIp != null) {
            this.BrokerIp = new String(source.BrokerIp);
        }
        if (source.InCharge != null) {
            this.InCharge = new String(source.InCharge);
        }
        if (source.Notes != null) {
            this.Notes = new String(source.Notes);
        }
        if (source.TaskParamInfos != null) {
            this.TaskParamInfos = new ParamInfo[source.TaskParamInfos.length];
            for (int i = 0; i < source.TaskParamInfos.length; i++) {
                this.TaskParamInfos[i] = new ParamInfo(source.TaskParamInfos[i]);
            }
        }
        if (source.SourceServer != null) {
            this.SourceServer = new String(source.SourceServer);
        }
        if (source.TargetServer != null) {
            this.TargetServer = new String(source.TargetServer);
        }
        if (source.DependencyWorkflow != null) {
            this.DependencyWorkflow = new String(source.DependencyWorkflow);
        }
        if (source.DependencyConfigDTOs != null) {
            this.DependencyConfigDTOs = new DependencyConfig[source.DependencyConfigDTOs.length];
            for (int i = 0; i < source.DependencyConfigDTOs.length; i++) {
                this.DependencyConfigDTOs[i] = new DependencyConfig(source.DependencyConfigDTOs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "DelayTime", this.DelayTime);
        this.setParamSimple(map, prefix + "StartupTime", this.StartupTime);
        this.setParamSimple(map, prefix + "SelfDepend", this.SelfDepend);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TaskAction", this.TaskAction);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "CycleStep", this.CycleStep);
        this.setParamSimple(map, prefix + "CrontabExpression", this.CrontabExpression);
        this.setParamSimple(map, prefix + "ExecutionStartTime", this.ExecutionStartTime);
        this.setParamSimple(map, prefix + "ExecutionEndTime", this.ExecutionEndTime);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "RetryWait", this.RetryWait);
        this.setParamSimple(map, prefix + "TryLimit", this.TryLimit);
        this.setParamSimple(map, prefix + "Retriable", this.Retriable);
        this.setParamSimple(map, prefix + "RunPriority", this.RunPriority);
        this.setParamArrayObj(map, prefix + "TaskExt.", this.TaskExt);
        this.setParamSimple(map, prefix + "ResourceGroup", this.ResourceGroup);
        this.setParamSimple(map, prefix + "YarnQueue", this.YarnQueue);
        this.setParamSimple(map, prefix + "BrokerIp", this.BrokerIp);
        this.setParamSimple(map, prefix + "InCharge", this.InCharge);
        this.setParamSimple(map, prefix + "Notes", this.Notes);
        this.setParamArrayObj(map, prefix + "TaskParamInfos.", this.TaskParamInfos);
        this.setParamSimple(map, prefix + "SourceServer", this.SourceServer);
        this.setParamSimple(map, prefix + "TargetServer", this.TargetServer);
        this.setParamSimple(map, prefix + "DependencyWorkflow", this.DependencyWorkflow);
        this.setParamArrayObj(map, prefix + "DependencyConfigDTOs.", this.DependencyConfigDTOs);

    }
}

