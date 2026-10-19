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

public class ModifyTaskInfoDsRequest extends AbstractModel {

    /**
    * <p>项目Id</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>任务ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>执行时间，单位分钟，天/周/月/年调度才有。比如天调度，每天的02:00点执行一次，delayTime就是120分钟</p>
    */
    @SerializedName("DelayTime")
    @Expose
    private Long DelayTime;

    /**
    * <p>启动时间：该字段已废弃，无需填写</p>
    */
    @SerializedName("StartupTime")
    @Expose
    private Long StartupTime;

    /**
    * <p>自依赖类型  1:有序串行 一次一个 排队  2: 无序串行 一次一个 不排队 3:并行 一次多个；暂不支持其他值</p>
    */
    @SerializedName("SelfDepend")
    @Expose
    private Long SelfDepend;

    /**
    * <p>生效开始时间，格式 yyyy-MM-dd HH:mm:ss</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>生效结束时间，格式 yyyy-MM-dd HH:mm:ss</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>调度配置-弹性周期配置，小时/周/月/年调度才有，小时任务指定每天的0点3点4点跑，则为 0,3,4。设置该值时，请把CycleStep字段设置为1（如果原始值不为1）。</p>
    */
    @SerializedName("TaskAction")
    @Expose
    private String TaskAction;

    /**
    * <p>周期类型  0:crontab类型, 1:分钟，2:小时，3:天，4:周，5:月，6:一次性，7:用户驱动，10:弹性周期 周,11:弹性周期 月,12:年,13:即时触发Instant类型，与正常周期调度任务逻辑隔离</p>
    */
    @SerializedName("CycleType")
    @Expose
    private Long CycleType;

    /**
    * <p>小时和分钟任务才有；分钟任务：5、10、15、20、30，表示每隔5【或其他值】分钟执行一次；小时任务：1、2、3、4、5、6、7、8、9、10、11、12，表示每隔1【或其他值】小时执行一次。该值大于1时，请把TaskAction字段设置为空字符串。</p>
    */
    @SerializedName("CycleStep")
    @Expose
    private Long CycleStep;

    /**
    * <p>cron表达式  周期类型为crontab调度才需要</p>
    */
    @SerializedName("CrontabExpression")
    @Expose
    private String CrontabExpression;

    /**
    * <p>执行时间左闭区间，格式：HH:mm  小时调度才有，例如小时任务, 每日固定区间生效</p>
    */
    @SerializedName("ExecutionStartTime")
    @Expose
    private String ExecutionStartTime;

    /**
    * <p>执行时间右闭区间，格式：HH:mm  小时调度才有，例如小时任务, 每日固定区间生效</p>
    */
    @SerializedName("ExecutionEndTime")
    @Expose
    private String ExecutionEndTime;

    /**
    * <p>任务名，该字段废弃，请勿使用该字段重命名任务</p>
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>失败重试间隔,单位分钟，创建任务的时候已经给了默认值</p>
    */
    @SerializedName("RetryWait")
    @Expose
    private Long RetryWait;

    /**
    * <p>失败重试次数，创建任务的时候已经给了默认值</p>
    */
    @SerializedName("TryLimit")
    @Expose
    private Long TryLimit;

    /**
    * <p>是否可重试，0代码不可重试，1代表可以重试；暂不支持其他值</p>
    */
    @SerializedName("Retriable")
    @Expose
    private Long Retriable;

    /**
    * <p>运行优先级，4高 5中 6低；暂不支持其他值</p>
    */
    @SerializedName("RunPriority")
    @Expose
    private Long RunPriority;

    /**
    * <p>任务的扩展配置</p>
    */
    @SerializedName("TaskExt")
    @Expose
    private TaskExtInfo [] TaskExt;

    /**
    * <p>执行资源组Id，需要去资源管理服务上创建调度资源组，并且绑定cvm机器</p>
    */
    @SerializedName("ResourceGroup")
    @Expose
    private String ResourceGroup;

    /**
    * <p>资源池队列名称</p>
    */
    @SerializedName("YarnQueue")
    @Expose
    private String YarnQueue;

    /**
    * <p>资源组下具体执行机，any 表示可以跑在任意一台。</p>
    */
    @SerializedName("BrokerIp")
    @Expose
    private String BrokerIp;

    /**
    * <p>责任人，多个责任人请用分号隔开</p>
    */
    @SerializedName("InCharge")
    @Expose
    private String InCharge;

    /**
    * <p>任务备注</p>
    */
    @SerializedName("Notes")
    @Expose
    private String Notes;

    /**
    * <p>任务参数</p>
    */
    @SerializedName("TaskParamInfos")
    @Expose
    private ParamInfo [] TaskParamInfos;

    /**
    * <p>源数据源Id</p>
    */
    @SerializedName("SourceServer")
    @Expose
    private String SourceServer;

    /**
    * <p>目标数据源Id</p>
    */
    @SerializedName("TargetServer")
    @Expose
    private String TargetServer;

    /**
    * <p>是否支持工作流依赖 yes / no 默认 no</p>
    */
    @SerializedName("DependencyWorkflow")
    @Expose
    private String DependencyWorkflow;

    /**
    * <p>依赖配置,仅可修改上游任务实例配置方法</p>
    */
    @SerializedName("DependencyConfigDTOs")
    @Expose
    private DependencyConfig [] DependencyConfigDTOs;

    /**
    * <p>运行耗时超时时间分钟数</p>
    */
    @SerializedName("ExecutionTTL")
    @Expose
    private Long ExecutionTTL;

    /**
    * <p>脚本是否改变</p>
    */
    @SerializedName("ScriptChange")
    @Expose
    private Boolean ScriptChange;

    /**
    * <p>任务时区，仅支持整数时区配置</p>
    */
    @SerializedName("ScheduleTimeZone")
    @Expose
    private String ScheduleTimeZone;

    /**
    * <p>0 正常调度 1 空跑调度；暂不支持其他值</p>
    */
    @SerializedName("ScheduleRunType")
    @Expose
    private Long ScheduleRunType;

    /**
    * <p>0 并发度达到上限时，本次排队等待 1 并发度达到上限时，本次不执行，直接kill；暂不支持其他值</p>
    */
    @SerializedName("ConcurrentStrategy")
    @Expose
    private Long ConcurrentStrategy;

    /**
    * <p>shell任务发布事件</p>
    */
    @SerializedName("RegisterDsEventPublisherRequest")
    @Expose
    private RegisterDsEventPublisherReq RegisterDsEventPublisherRequest;

    /**
    * <p>base64编码后脚本内容</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>分钟任务相位偏移</p>
    */
    @SerializedName("MinuteOffset")
    @Expose
    private Long MinuteOffset;

    /**
     * Get <p>项目Id</p> 
     * @return ProjectId <p>项目Id</p>
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目Id</p>
     * @param ProjectId <p>项目Id</p>
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>任务ID</p> 
     * @return TaskId <p>任务ID</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务ID</p>
     * @param TaskId <p>任务ID</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>执行时间，单位分钟，天/周/月/年调度才有。比如天调度，每天的02:00点执行一次，delayTime就是120分钟</p> 
     * @return DelayTime <p>执行时间，单位分钟，天/周/月/年调度才有。比如天调度，每天的02:00点执行一次，delayTime就是120分钟</p>
     */
    public Long getDelayTime() {
        return this.DelayTime;
    }

    /**
     * Set <p>执行时间，单位分钟，天/周/月/年调度才有。比如天调度，每天的02:00点执行一次，delayTime就是120分钟</p>
     * @param DelayTime <p>执行时间，单位分钟，天/周/月/年调度才有。比如天调度，每天的02:00点执行一次，delayTime就是120分钟</p>
     */
    public void setDelayTime(Long DelayTime) {
        this.DelayTime = DelayTime;
    }

    /**
     * Get <p>启动时间：该字段已废弃，无需填写</p> 
     * @return StartupTime <p>启动时间：该字段已废弃，无需填写</p>
     */
    public Long getStartupTime() {
        return this.StartupTime;
    }

    /**
     * Set <p>启动时间：该字段已废弃，无需填写</p>
     * @param StartupTime <p>启动时间：该字段已废弃，无需填写</p>
     */
    public void setStartupTime(Long StartupTime) {
        this.StartupTime = StartupTime;
    }

    /**
     * Get <p>自依赖类型  1:有序串行 一次一个 排队  2: 无序串行 一次一个 不排队 3:并行 一次多个；暂不支持其他值</p> 
     * @return SelfDepend <p>自依赖类型  1:有序串行 一次一个 排队  2: 无序串行 一次一个 不排队 3:并行 一次多个；暂不支持其他值</p>
     */
    public Long getSelfDepend() {
        return this.SelfDepend;
    }

    /**
     * Set <p>自依赖类型  1:有序串行 一次一个 排队  2: 无序串行 一次一个 不排队 3:并行 一次多个；暂不支持其他值</p>
     * @param SelfDepend <p>自依赖类型  1:有序串行 一次一个 排队  2: 无序串行 一次一个 不排队 3:并行 一次多个；暂不支持其他值</p>
     */
    public void setSelfDepend(Long SelfDepend) {
        this.SelfDepend = SelfDepend;
    }

    /**
     * Get <p>生效开始时间，格式 yyyy-MM-dd HH:mm:ss</p> 
     * @return StartTime <p>生效开始时间，格式 yyyy-MM-dd HH:mm:ss</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>生效开始时间，格式 yyyy-MM-dd HH:mm:ss</p>
     * @param StartTime <p>生效开始时间，格式 yyyy-MM-dd HH:mm:ss</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>生效结束时间，格式 yyyy-MM-dd HH:mm:ss</p> 
     * @return EndTime <p>生效结束时间，格式 yyyy-MM-dd HH:mm:ss</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>生效结束时间，格式 yyyy-MM-dd HH:mm:ss</p>
     * @param EndTime <p>生效结束时间，格式 yyyy-MM-dd HH:mm:ss</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>调度配置-弹性周期配置，小时/周/月/年调度才有，小时任务指定每天的0点3点4点跑，则为 0,3,4。设置该值时，请把CycleStep字段设置为1（如果原始值不为1）。</p> 
     * @return TaskAction <p>调度配置-弹性周期配置，小时/周/月/年调度才有，小时任务指定每天的0点3点4点跑，则为 0,3,4。设置该值时，请把CycleStep字段设置为1（如果原始值不为1）。</p>
     */
    public String getTaskAction() {
        return this.TaskAction;
    }

    /**
     * Set <p>调度配置-弹性周期配置，小时/周/月/年调度才有，小时任务指定每天的0点3点4点跑，则为 0,3,4。设置该值时，请把CycleStep字段设置为1（如果原始值不为1）。</p>
     * @param TaskAction <p>调度配置-弹性周期配置，小时/周/月/年调度才有，小时任务指定每天的0点3点4点跑，则为 0,3,4。设置该值时，请把CycleStep字段设置为1（如果原始值不为1）。</p>
     */
    public void setTaskAction(String TaskAction) {
        this.TaskAction = TaskAction;
    }

    /**
     * Get <p>周期类型  0:crontab类型, 1:分钟，2:小时，3:天，4:周，5:月，6:一次性，7:用户驱动，10:弹性周期 周,11:弹性周期 月,12:年,13:即时触发Instant类型，与正常周期调度任务逻辑隔离</p> 
     * @return CycleType <p>周期类型  0:crontab类型, 1:分钟，2:小时，3:天，4:周，5:月，6:一次性，7:用户驱动，10:弹性周期 周,11:弹性周期 月,12:年,13:即时触发Instant类型，与正常周期调度任务逻辑隔离</p>
     */
    public Long getCycleType() {
        return this.CycleType;
    }

    /**
     * Set <p>周期类型  0:crontab类型, 1:分钟，2:小时，3:天，4:周，5:月，6:一次性，7:用户驱动，10:弹性周期 周,11:弹性周期 月,12:年,13:即时触发Instant类型，与正常周期调度任务逻辑隔离</p>
     * @param CycleType <p>周期类型  0:crontab类型, 1:分钟，2:小时，3:天，4:周，5:月，6:一次性，7:用户驱动，10:弹性周期 周,11:弹性周期 月,12:年,13:即时触发Instant类型，与正常周期调度任务逻辑隔离</p>
     */
    public void setCycleType(Long CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get <p>小时和分钟任务才有；分钟任务：5、10、15、20、30，表示每隔5【或其他值】分钟执行一次；小时任务：1、2、3、4、5、6、7、8、9、10、11、12，表示每隔1【或其他值】小时执行一次。该值大于1时，请把TaskAction字段设置为空字符串。</p> 
     * @return CycleStep <p>小时和分钟任务才有；分钟任务：5、10、15、20、30，表示每隔5【或其他值】分钟执行一次；小时任务：1、2、3、4、5、6、7、8、9、10、11、12，表示每隔1【或其他值】小时执行一次。该值大于1时，请把TaskAction字段设置为空字符串。</p>
     */
    public Long getCycleStep() {
        return this.CycleStep;
    }

    /**
     * Set <p>小时和分钟任务才有；分钟任务：5、10、15、20、30，表示每隔5【或其他值】分钟执行一次；小时任务：1、2、3、4、5、6、7、8、9、10、11、12，表示每隔1【或其他值】小时执行一次。该值大于1时，请把TaskAction字段设置为空字符串。</p>
     * @param CycleStep <p>小时和分钟任务才有；分钟任务：5、10、15、20、30，表示每隔5【或其他值】分钟执行一次；小时任务：1、2、3、4、5、6、7、8、9、10、11、12，表示每隔1【或其他值】小时执行一次。该值大于1时，请把TaskAction字段设置为空字符串。</p>
     */
    public void setCycleStep(Long CycleStep) {
        this.CycleStep = CycleStep;
    }

    /**
     * Get <p>cron表达式  周期类型为crontab调度才需要</p> 
     * @return CrontabExpression <p>cron表达式  周期类型为crontab调度才需要</p>
     */
    public String getCrontabExpression() {
        return this.CrontabExpression;
    }

    /**
     * Set <p>cron表达式  周期类型为crontab调度才需要</p>
     * @param CrontabExpression <p>cron表达式  周期类型为crontab调度才需要</p>
     */
    public void setCrontabExpression(String CrontabExpression) {
        this.CrontabExpression = CrontabExpression;
    }

    /**
     * Get <p>执行时间左闭区间，格式：HH:mm  小时调度才有，例如小时任务, 每日固定区间生效</p> 
     * @return ExecutionStartTime <p>执行时间左闭区间，格式：HH:mm  小时调度才有，例如小时任务, 每日固定区间生效</p>
     */
    public String getExecutionStartTime() {
        return this.ExecutionStartTime;
    }

    /**
     * Set <p>执行时间左闭区间，格式：HH:mm  小时调度才有，例如小时任务, 每日固定区间生效</p>
     * @param ExecutionStartTime <p>执行时间左闭区间，格式：HH:mm  小时调度才有，例如小时任务, 每日固定区间生效</p>
     */
    public void setExecutionStartTime(String ExecutionStartTime) {
        this.ExecutionStartTime = ExecutionStartTime;
    }

    /**
     * Get <p>执行时间右闭区间，格式：HH:mm  小时调度才有，例如小时任务, 每日固定区间生效</p> 
     * @return ExecutionEndTime <p>执行时间右闭区间，格式：HH:mm  小时调度才有，例如小时任务, 每日固定区间生效</p>
     */
    public String getExecutionEndTime() {
        return this.ExecutionEndTime;
    }

    /**
     * Set <p>执行时间右闭区间，格式：HH:mm  小时调度才有，例如小时任务, 每日固定区间生效</p>
     * @param ExecutionEndTime <p>执行时间右闭区间，格式：HH:mm  小时调度才有，例如小时任务, 每日固定区间生效</p>
     */
    public void setExecutionEndTime(String ExecutionEndTime) {
        this.ExecutionEndTime = ExecutionEndTime;
    }

    /**
     * Get <p>任务名，该字段废弃，请勿使用该字段重命名任务</p> 
     * @return TaskName <p>任务名，该字段废弃，请勿使用该字段重命名任务</p>
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>任务名，该字段废弃，请勿使用该字段重命名任务</p>
     * @param TaskName <p>任务名，该字段废弃，请勿使用该字段重命名任务</p>
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>失败重试间隔,单位分钟，创建任务的时候已经给了默认值</p> 
     * @return RetryWait <p>失败重试间隔,单位分钟，创建任务的时候已经给了默认值</p>
     */
    public Long getRetryWait() {
        return this.RetryWait;
    }

    /**
     * Set <p>失败重试间隔,单位分钟，创建任务的时候已经给了默认值</p>
     * @param RetryWait <p>失败重试间隔,单位分钟，创建任务的时候已经给了默认值</p>
     */
    public void setRetryWait(Long RetryWait) {
        this.RetryWait = RetryWait;
    }

    /**
     * Get <p>失败重试次数，创建任务的时候已经给了默认值</p> 
     * @return TryLimit <p>失败重试次数，创建任务的时候已经给了默认值</p>
     */
    public Long getTryLimit() {
        return this.TryLimit;
    }

    /**
     * Set <p>失败重试次数，创建任务的时候已经给了默认值</p>
     * @param TryLimit <p>失败重试次数，创建任务的时候已经给了默认值</p>
     */
    public void setTryLimit(Long TryLimit) {
        this.TryLimit = TryLimit;
    }

    /**
     * Get <p>是否可重试，0代码不可重试，1代表可以重试；暂不支持其他值</p> 
     * @return Retriable <p>是否可重试，0代码不可重试，1代表可以重试；暂不支持其他值</p>
     */
    public Long getRetriable() {
        return this.Retriable;
    }

    /**
     * Set <p>是否可重试，0代码不可重试，1代表可以重试；暂不支持其他值</p>
     * @param Retriable <p>是否可重试，0代码不可重试，1代表可以重试；暂不支持其他值</p>
     */
    public void setRetriable(Long Retriable) {
        this.Retriable = Retriable;
    }

    /**
     * Get <p>运行优先级，4高 5中 6低；暂不支持其他值</p> 
     * @return RunPriority <p>运行优先级，4高 5中 6低；暂不支持其他值</p>
     */
    public Long getRunPriority() {
        return this.RunPriority;
    }

    /**
     * Set <p>运行优先级，4高 5中 6低；暂不支持其他值</p>
     * @param RunPriority <p>运行优先级，4高 5中 6低；暂不支持其他值</p>
     */
    public void setRunPriority(Long RunPriority) {
        this.RunPriority = RunPriority;
    }

    /**
     * Get <p>任务的扩展配置</p> 
     * @return TaskExt <p>任务的扩展配置</p>
     */
    public TaskExtInfo [] getTaskExt() {
        return this.TaskExt;
    }

    /**
     * Set <p>任务的扩展配置</p>
     * @param TaskExt <p>任务的扩展配置</p>
     */
    public void setTaskExt(TaskExtInfo [] TaskExt) {
        this.TaskExt = TaskExt;
    }

    /**
     * Get <p>执行资源组Id，需要去资源管理服务上创建调度资源组，并且绑定cvm机器</p> 
     * @return ResourceGroup <p>执行资源组Id，需要去资源管理服务上创建调度资源组，并且绑定cvm机器</p>
     */
    public String getResourceGroup() {
        return this.ResourceGroup;
    }

    /**
     * Set <p>执行资源组Id，需要去资源管理服务上创建调度资源组，并且绑定cvm机器</p>
     * @param ResourceGroup <p>执行资源组Id，需要去资源管理服务上创建调度资源组，并且绑定cvm机器</p>
     */
    public void setResourceGroup(String ResourceGroup) {
        this.ResourceGroup = ResourceGroup;
    }

    /**
     * Get <p>资源池队列名称</p> 
     * @return YarnQueue <p>资源池队列名称</p>
     */
    public String getYarnQueue() {
        return this.YarnQueue;
    }

    /**
     * Set <p>资源池队列名称</p>
     * @param YarnQueue <p>资源池队列名称</p>
     */
    public void setYarnQueue(String YarnQueue) {
        this.YarnQueue = YarnQueue;
    }

    /**
     * Get <p>资源组下具体执行机，any 表示可以跑在任意一台。</p> 
     * @return BrokerIp <p>资源组下具体执行机，any 表示可以跑在任意一台。</p>
     */
    public String getBrokerIp() {
        return this.BrokerIp;
    }

    /**
     * Set <p>资源组下具体执行机，any 表示可以跑在任意一台。</p>
     * @param BrokerIp <p>资源组下具体执行机，any 表示可以跑在任意一台。</p>
     */
    public void setBrokerIp(String BrokerIp) {
        this.BrokerIp = BrokerIp;
    }

    /**
     * Get <p>责任人，多个责任人请用分号隔开</p> 
     * @return InCharge <p>责任人，多个责任人请用分号隔开</p>
     */
    public String getInCharge() {
        return this.InCharge;
    }

    /**
     * Set <p>责任人，多个责任人请用分号隔开</p>
     * @param InCharge <p>责任人，多个责任人请用分号隔开</p>
     */
    public void setInCharge(String InCharge) {
        this.InCharge = InCharge;
    }

    /**
     * Get <p>任务备注</p> 
     * @return Notes <p>任务备注</p>
     */
    public String getNotes() {
        return this.Notes;
    }

    /**
     * Set <p>任务备注</p>
     * @param Notes <p>任务备注</p>
     */
    public void setNotes(String Notes) {
        this.Notes = Notes;
    }

    /**
     * Get <p>任务参数</p> 
     * @return TaskParamInfos <p>任务参数</p>
     */
    public ParamInfo [] getTaskParamInfos() {
        return this.TaskParamInfos;
    }

    /**
     * Set <p>任务参数</p>
     * @param TaskParamInfos <p>任务参数</p>
     */
    public void setTaskParamInfos(ParamInfo [] TaskParamInfos) {
        this.TaskParamInfos = TaskParamInfos;
    }

    /**
     * Get <p>源数据源Id</p> 
     * @return SourceServer <p>源数据源Id</p>
     */
    public String getSourceServer() {
        return this.SourceServer;
    }

    /**
     * Set <p>源数据源Id</p>
     * @param SourceServer <p>源数据源Id</p>
     */
    public void setSourceServer(String SourceServer) {
        this.SourceServer = SourceServer;
    }

    /**
     * Get <p>目标数据源Id</p> 
     * @return TargetServer <p>目标数据源Id</p>
     */
    public String getTargetServer() {
        return this.TargetServer;
    }

    /**
     * Set <p>目标数据源Id</p>
     * @param TargetServer <p>目标数据源Id</p>
     */
    public void setTargetServer(String TargetServer) {
        this.TargetServer = TargetServer;
    }

    /**
     * Get <p>是否支持工作流依赖 yes / no 默认 no</p> 
     * @return DependencyWorkflow <p>是否支持工作流依赖 yes / no 默认 no</p>
     */
    public String getDependencyWorkflow() {
        return this.DependencyWorkflow;
    }

    /**
     * Set <p>是否支持工作流依赖 yes / no 默认 no</p>
     * @param DependencyWorkflow <p>是否支持工作流依赖 yes / no 默认 no</p>
     */
    public void setDependencyWorkflow(String DependencyWorkflow) {
        this.DependencyWorkflow = DependencyWorkflow;
    }

    /**
     * Get <p>依赖配置,仅可修改上游任务实例配置方法</p> 
     * @return DependencyConfigDTOs <p>依赖配置,仅可修改上游任务实例配置方法</p>
     */
    public DependencyConfig [] getDependencyConfigDTOs() {
        return this.DependencyConfigDTOs;
    }

    /**
     * Set <p>依赖配置,仅可修改上游任务实例配置方法</p>
     * @param DependencyConfigDTOs <p>依赖配置,仅可修改上游任务实例配置方法</p>
     */
    public void setDependencyConfigDTOs(DependencyConfig [] DependencyConfigDTOs) {
        this.DependencyConfigDTOs = DependencyConfigDTOs;
    }

    /**
     * Get <p>运行耗时超时时间分钟数</p> 
     * @return ExecutionTTL <p>运行耗时超时时间分钟数</p>
     */
    public Long getExecutionTTL() {
        return this.ExecutionTTL;
    }

    /**
     * Set <p>运行耗时超时时间分钟数</p>
     * @param ExecutionTTL <p>运行耗时超时时间分钟数</p>
     */
    public void setExecutionTTL(Long ExecutionTTL) {
        this.ExecutionTTL = ExecutionTTL;
    }

    /**
     * Get <p>脚本是否改变</p> 
     * @return ScriptChange <p>脚本是否改变</p>
     */
    public Boolean getScriptChange() {
        return this.ScriptChange;
    }

    /**
     * Set <p>脚本是否改变</p>
     * @param ScriptChange <p>脚本是否改变</p>
     */
    public void setScriptChange(Boolean ScriptChange) {
        this.ScriptChange = ScriptChange;
    }

    /**
     * Get <p>任务时区，仅支持整数时区配置</p> 
     * @return ScheduleTimeZone <p>任务时区，仅支持整数时区配置</p>
     */
    public String getScheduleTimeZone() {
        return this.ScheduleTimeZone;
    }

    /**
     * Set <p>任务时区，仅支持整数时区配置</p>
     * @param ScheduleTimeZone <p>任务时区，仅支持整数时区配置</p>
     */
    public void setScheduleTimeZone(String ScheduleTimeZone) {
        this.ScheduleTimeZone = ScheduleTimeZone;
    }

    /**
     * Get <p>0 正常调度 1 空跑调度；暂不支持其他值</p> 
     * @return ScheduleRunType <p>0 正常调度 1 空跑调度；暂不支持其他值</p>
     */
    public Long getScheduleRunType() {
        return this.ScheduleRunType;
    }

    /**
     * Set <p>0 正常调度 1 空跑调度；暂不支持其他值</p>
     * @param ScheduleRunType <p>0 正常调度 1 空跑调度；暂不支持其他值</p>
     */
    public void setScheduleRunType(Long ScheduleRunType) {
        this.ScheduleRunType = ScheduleRunType;
    }

    /**
     * Get <p>0 并发度达到上限时，本次排队等待 1 并发度达到上限时，本次不执行，直接kill；暂不支持其他值</p> 
     * @return ConcurrentStrategy <p>0 并发度达到上限时，本次排队等待 1 并发度达到上限时，本次不执行，直接kill；暂不支持其他值</p>
     */
    public Long getConcurrentStrategy() {
        return this.ConcurrentStrategy;
    }

    /**
     * Set <p>0 并发度达到上限时，本次排队等待 1 并发度达到上限时，本次不执行，直接kill；暂不支持其他值</p>
     * @param ConcurrentStrategy <p>0 并发度达到上限时，本次排队等待 1 并发度达到上限时，本次不执行，直接kill；暂不支持其他值</p>
     */
    public void setConcurrentStrategy(Long ConcurrentStrategy) {
        this.ConcurrentStrategy = ConcurrentStrategy;
    }

    /**
     * Get <p>shell任务发布事件</p> 
     * @return RegisterDsEventPublisherRequest <p>shell任务发布事件</p>
     */
    public RegisterDsEventPublisherReq getRegisterDsEventPublisherRequest() {
        return this.RegisterDsEventPublisherRequest;
    }

    /**
     * Set <p>shell任务发布事件</p>
     * @param RegisterDsEventPublisherRequest <p>shell任务发布事件</p>
     */
    public void setRegisterDsEventPublisherRequest(RegisterDsEventPublisherReq RegisterDsEventPublisherRequest) {
        this.RegisterDsEventPublisherRequest = RegisterDsEventPublisherRequest;
    }

    /**
     * Get <p>base64编码后脚本内容</p> 
     * @return Content <p>base64编码后脚本内容</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>base64编码后脚本内容</p>
     * @param Content <p>base64编码后脚本内容</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>分钟任务相位偏移</p> 
     * @return MinuteOffset <p>分钟任务相位偏移</p>
     */
    public Long getMinuteOffset() {
        return this.MinuteOffset;
    }

    /**
     * Set <p>分钟任务相位偏移</p>
     * @param MinuteOffset <p>分钟任务相位偏移</p>
     */
    public void setMinuteOffset(Long MinuteOffset) {
        this.MinuteOffset = MinuteOffset;
    }

    public ModifyTaskInfoDsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTaskInfoDsRequest(ModifyTaskInfoDsRequest source) {
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
        if (source.ExecutionTTL != null) {
            this.ExecutionTTL = new Long(source.ExecutionTTL);
        }
        if (source.ScriptChange != null) {
            this.ScriptChange = new Boolean(source.ScriptChange);
        }
        if (source.ScheduleTimeZone != null) {
            this.ScheduleTimeZone = new String(source.ScheduleTimeZone);
        }
        if (source.ScheduleRunType != null) {
            this.ScheduleRunType = new Long(source.ScheduleRunType);
        }
        if (source.ConcurrentStrategy != null) {
            this.ConcurrentStrategy = new Long(source.ConcurrentStrategy);
        }
        if (source.RegisterDsEventPublisherRequest != null) {
            this.RegisterDsEventPublisherRequest = new RegisterDsEventPublisherReq(source.RegisterDsEventPublisherRequest);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.MinuteOffset != null) {
            this.MinuteOffset = new Long(source.MinuteOffset);
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
        this.setParamSimple(map, prefix + "ExecutionTTL", this.ExecutionTTL);
        this.setParamSimple(map, prefix + "ScriptChange", this.ScriptChange);
        this.setParamSimple(map, prefix + "ScheduleTimeZone", this.ScheduleTimeZone);
        this.setParamSimple(map, prefix + "ScheduleRunType", this.ScheduleRunType);
        this.setParamSimple(map, prefix + "ConcurrentStrategy", this.ConcurrentStrategy);
        this.setParamObj(map, prefix + "RegisterDsEventPublisherRequest.", this.RegisterDsEventPublisherRequest);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "MinuteOffset", this.MinuteOffset);

    }
}

