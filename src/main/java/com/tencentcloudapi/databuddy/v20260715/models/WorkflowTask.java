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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkflowTask extends AbstractModel {

    /**
    * <p>任务参数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamList")
    @Expose
    private ParamInfo [] ParamList;

    /**
    * <p>任务依赖</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DependOnList")
    @Expose
    private DependOnBrief [] DependOnList;

    /**
    * <p>任务ID，创建时无需传入，由服务端生成</p>
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
    * <p>任务类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskType")
    @Expose
    private TaskType TaskType;

    /**
    * <p>计算资源组ID，计算资源取值通过 ListComputeResourceOptions 接口获取，入参 ResourceTypes 需按任务类型传值：DATA_INTEGRATION 传 [1]（平台集群），PYTHON/NOTEBOOK/RAY_JOB/DATA_QUALITY/IF_ELSE 传 [2]（作业集群），SQL 传 [2,3]（交互式+作业集群），其余任务类型无需填写本字段。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * <p>任务描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>任务告警</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Alarm")
    @Expose
    private AlarmBrief Alarm;

    /**
    * <p>监控指标</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MonitorMetric")
    @Expose
    private MonitorMetricBrief MonitorMetric;

    /**
    * <p>任务重试策略</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskRetryStrategy")
    @Expose
    private TaskRetryStrategy TaskRetryStrategy;

    /**
    * <p>任依赖运行条件</p><ul><li>ALL_SUCCESS: 全部成功：所有上游依赖任务均已执行并成功</li><li>ONE_SUCCESS: 至少一个成功：至少有一个上游依赖任务成功</li><li>NONE_FAILED: 目前没有失败：没有依赖任务失败，并且至少有一个依赖任务在运行中</li><li>ALL_DONE: 全部完成：所有上游依赖任务均已执行并完成（无论成功或失败</li><li>ONE_FAILED: 至少一个失败：至少有一个上游依赖任务失败</li><li>ALL_FAILED: 全部失败：所有上游依赖任务都失败</li><li>ALL_DONE_AT_LEAST_ONE_SUCCESS：上游全部完成至少一个成功: 所有上游依赖任务都达到终态时，进行依赖判断，至少有一个成功，则依赖判断成功，否则就是跳过运行</li><li>ALL_SKIPPED：上游全部完成，没有跳过运行: 所有上游依赖任务都达到终态时，进行依赖判断, 如果上游状态全部都是成功、失败、上游失败状态，则依赖判断成功，否则为跳过运行</li><li>ONE_DONE：至少一个完成：上游只要有一个完成了，就进行依赖判断，且依赖判断成功，否则还是等待上游</li><li>ALL_DONE_NONE_FAILED_AT_LEAST_ONE_SUCCESS：上游全部完成，没有失败，至少有一个成功: 所有上游依赖任务都达到终态时，进行依赖判断，上游没有一个失败且至少有一个成功的情况下，依赖判断成功，否则就是跳过运行</li><li>NONE_SKIPPED：上游全部完成，没有跳过运行: 所有上游依赖任务都达到终态时，进行依赖判断, 如果上游状态全部都是成功、失败、上游失败状态，则依赖判断成功，否则为跳过运行</li><li>ALL_DONE_AT_LEAST_ONE_FAILED：上游全部完成至少一个失败: 所有上游依赖任务都达到终态时，进行依赖判断，至少有一个失败，则依赖判断成功，否则就是跳过运行</li><li>ADVANCED:运行条件为高级模式时配置</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DependOnRunCondition")
    @Expose
    private String DependOnRunCondition;

    /**
    * <p>任务X坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LeftCoordinate")
    @Expose
    private Float LeftCoordinate;

    /**
    * <p>任务Y坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopCoordinate")
    @Expose
    private Float TopCoordinate;

    /**
    * <p>任务高级运行参数，当DependOnRunCondition为ADVANCED时配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdvancedDependencyConfig")
    @Expose
    private AdvancedDependencyConfig AdvancedDependencyConfig;

    /**
    * <p>内嵌任务（FOR_EACH任务的子任务）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InnerTask")
    @Expose
    private WorkflowTask InnerTask;

    /**
    * <p>创建时间，单位：毫秒时间戳。系统生成字段，仅出参返回，入参无需传入（传入不生效，服务端忽略且不报错）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>更新时间，单位：毫秒时间戳。系统生成字段，仅出参返回，入参无需传入（传入不生效，服务端忽略且不报错）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>创建人UIN。系统生成字段，仅出参返回，入参无需传入（传入不生效，服务端忽略且不报错）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateUserUin")
    @Expose
    private String CreateUserUin;

    /**
     * Get <p>任务参数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParamList <p>任务参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ParamInfo [] getParamList() {
        return this.ParamList;
    }

    /**
     * Set <p>任务参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParamList <p>任务参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParamList(ParamInfo [] ParamList) {
        this.ParamList = ParamList;
    }

    /**
     * Get <p>任务依赖</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DependOnList <p>任务依赖</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DependOnBrief [] getDependOnList() {
        return this.DependOnList;
    }

    /**
     * Set <p>任务依赖</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DependOnList <p>任务依赖</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDependOnList(DependOnBrief [] DependOnList) {
        this.DependOnList = DependOnList;
    }

    /**
     * Get <p>任务ID，创建时无需传入，由服务端生成</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId <p>任务ID，创建时无需传入，由服务端生成</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务ID，创建时无需传入，由服务端生成</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId <p>任务ID，创建时无需传入，由服务端生成</p>
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
     * Get <p>任务类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskType <p>任务类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskType getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>任务类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskType <p>任务类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskType(TaskType TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>计算资源组ID，计算资源取值通过 ListComputeResourceOptions 接口获取，入参 ResourceTypes 需按任务类型传值：DATA_INTEGRATION 传 [1]（平台集群），PYTHON/NOTEBOOK/RAY_JOB/DATA_QUALITY/IF_ELSE 传 [2]（作业集群），SQL 传 [2,3]（交互式+作业集群），其余任务类型无需填写本字段。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroupId <p>计算资源组ID，计算资源取值通过 ListComputeResourceOptions 接口获取，入参 ResourceTypes 需按任务类型传值：DATA_INTEGRATION 传 [1]（平台集群），PYTHON/NOTEBOOK/RAY_JOB/DATA_QUALITY/IF_ELSE 传 [2]（作业集群），SQL 传 [2,3]（交互式+作业集群），其余任务类型无需填写本字段。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set <p>计算资源组ID，计算资源取值通过 ListComputeResourceOptions 接口获取，入参 ResourceTypes 需按任务类型传值：DATA_INTEGRATION 传 [1]（平台集群），PYTHON/NOTEBOOK/RAY_JOB/DATA_QUALITY/IF_ELSE 传 [2]（作业集群），SQL 传 [2,3]（交互式+作业集群），其余任务类型无需填写本字段。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroupId <p>计算资源组ID，计算资源取值通过 ListComputeResourceOptions 接口获取，入参 ResourceTypes 需按任务类型传值：DATA_INTEGRATION 传 [1]（平台集群），PYTHON/NOTEBOOK/RAY_JOB/DATA_QUALITY/IF_ELSE 传 [2]（作业集群），SQL 传 [2,3]（交互式+作业集群），其余任务类型无需填写本字段。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * Get <p>任务描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description <p>任务描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>任务描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description <p>任务描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>任务告警</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Alarm <p>任务告警</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AlarmBrief getAlarm() {
        return this.Alarm;
    }

    /**
     * Set <p>任务告警</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Alarm <p>任务告警</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarm(AlarmBrief Alarm) {
        this.Alarm = Alarm;
    }

    /**
     * Get <p>监控指标</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MonitorMetric <p>监控指标</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MonitorMetricBrief getMonitorMetric() {
        return this.MonitorMetric;
    }

    /**
     * Set <p>监控指标</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MonitorMetric <p>监控指标</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMonitorMetric(MonitorMetricBrief MonitorMetric) {
        this.MonitorMetric = MonitorMetric;
    }

    /**
     * Get <p>任务重试策略</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskRetryStrategy <p>任务重试策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskRetryStrategy getTaskRetryStrategy() {
        return this.TaskRetryStrategy;
    }

    /**
     * Set <p>任务重试策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskRetryStrategy <p>任务重试策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskRetryStrategy(TaskRetryStrategy TaskRetryStrategy) {
        this.TaskRetryStrategy = TaskRetryStrategy;
    }

    /**
     * Get <p>任依赖运行条件</p><ul><li>ALL_SUCCESS: 全部成功：所有上游依赖任务均已执行并成功</li><li>ONE_SUCCESS: 至少一个成功：至少有一个上游依赖任务成功</li><li>NONE_FAILED: 目前没有失败：没有依赖任务失败，并且至少有一个依赖任务在运行中</li><li>ALL_DONE: 全部完成：所有上游依赖任务均已执行并完成（无论成功或失败</li><li>ONE_FAILED: 至少一个失败：至少有一个上游依赖任务失败</li><li>ALL_FAILED: 全部失败：所有上游依赖任务都失败</li><li>ALL_DONE_AT_LEAST_ONE_SUCCESS：上游全部完成至少一个成功: 所有上游依赖任务都达到终态时，进行依赖判断，至少有一个成功，则依赖判断成功，否则就是跳过运行</li><li>ALL_SKIPPED：上游全部完成，没有跳过运行: 所有上游依赖任务都达到终态时，进行依赖判断, 如果上游状态全部都是成功、失败、上游失败状态，则依赖判断成功，否则为跳过运行</li><li>ONE_DONE：至少一个完成：上游只要有一个完成了，就进行依赖判断，且依赖判断成功，否则还是等待上游</li><li>ALL_DONE_NONE_FAILED_AT_LEAST_ONE_SUCCESS：上游全部完成，没有失败，至少有一个成功: 所有上游依赖任务都达到终态时，进行依赖判断，上游没有一个失败且至少有一个成功的情况下，依赖判断成功，否则就是跳过运行</li><li>NONE_SKIPPED：上游全部完成，没有跳过运行: 所有上游依赖任务都达到终态时，进行依赖判断, 如果上游状态全部都是成功、失败、上游失败状态，则依赖判断成功，否则为跳过运行</li><li>ALL_DONE_AT_LEAST_ONE_FAILED：上游全部完成至少一个失败: 所有上游依赖任务都达到终态时，进行依赖判断，至少有一个失败，则依赖判断成功，否则就是跳过运行</li><li>ADVANCED:运行条件为高级模式时配置</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DependOnRunCondition <p>任依赖运行条件</p><ul><li>ALL_SUCCESS: 全部成功：所有上游依赖任务均已执行并成功</li><li>ONE_SUCCESS: 至少一个成功：至少有一个上游依赖任务成功</li><li>NONE_FAILED: 目前没有失败：没有依赖任务失败，并且至少有一个依赖任务在运行中</li><li>ALL_DONE: 全部完成：所有上游依赖任务均已执行并完成（无论成功或失败</li><li>ONE_FAILED: 至少一个失败：至少有一个上游依赖任务失败</li><li>ALL_FAILED: 全部失败：所有上游依赖任务都失败</li><li>ALL_DONE_AT_LEAST_ONE_SUCCESS：上游全部完成至少一个成功: 所有上游依赖任务都达到终态时，进行依赖判断，至少有一个成功，则依赖判断成功，否则就是跳过运行</li><li>ALL_SKIPPED：上游全部完成，没有跳过运行: 所有上游依赖任务都达到终态时，进行依赖判断, 如果上游状态全部都是成功、失败、上游失败状态，则依赖判断成功，否则为跳过运行</li><li>ONE_DONE：至少一个完成：上游只要有一个完成了，就进行依赖判断，且依赖判断成功，否则还是等待上游</li><li>ALL_DONE_NONE_FAILED_AT_LEAST_ONE_SUCCESS：上游全部完成，没有失败，至少有一个成功: 所有上游依赖任务都达到终态时，进行依赖判断，上游没有一个失败且至少有一个成功的情况下，依赖判断成功，否则就是跳过运行</li><li>NONE_SKIPPED：上游全部完成，没有跳过运行: 所有上游依赖任务都达到终态时，进行依赖判断, 如果上游状态全部都是成功、失败、上游失败状态，则依赖判断成功，否则为跳过运行</li><li>ALL_DONE_AT_LEAST_ONE_FAILED：上游全部完成至少一个失败: 所有上游依赖任务都达到终态时，进行依赖判断，至少有一个失败，则依赖判断成功，否则就是跳过运行</li><li>ADVANCED:运行条件为高级模式时配置</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDependOnRunCondition() {
        return this.DependOnRunCondition;
    }

    /**
     * Set <p>任依赖运行条件</p><ul><li>ALL_SUCCESS: 全部成功：所有上游依赖任务均已执行并成功</li><li>ONE_SUCCESS: 至少一个成功：至少有一个上游依赖任务成功</li><li>NONE_FAILED: 目前没有失败：没有依赖任务失败，并且至少有一个依赖任务在运行中</li><li>ALL_DONE: 全部完成：所有上游依赖任务均已执行并完成（无论成功或失败</li><li>ONE_FAILED: 至少一个失败：至少有一个上游依赖任务失败</li><li>ALL_FAILED: 全部失败：所有上游依赖任务都失败</li><li>ALL_DONE_AT_LEAST_ONE_SUCCESS：上游全部完成至少一个成功: 所有上游依赖任务都达到终态时，进行依赖判断，至少有一个成功，则依赖判断成功，否则就是跳过运行</li><li>ALL_SKIPPED：上游全部完成，没有跳过运行: 所有上游依赖任务都达到终态时，进行依赖判断, 如果上游状态全部都是成功、失败、上游失败状态，则依赖判断成功，否则为跳过运行</li><li>ONE_DONE：至少一个完成：上游只要有一个完成了，就进行依赖判断，且依赖判断成功，否则还是等待上游</li><li>ALL_DONE_NONE_FAILED_AT_LEAST_ONE_SUCCESS：上游全部完成，没有失败，至少有一个成功: 所有上游依赖任务都达到终态时，进行依赖判断，上游没有一个失败且至少有一个成功的情况下，依赖判断成功，否则就是跳过运行</li><li>NONE_SKIPPED：上游全部完成，没有跳过运行: 所有上游依赖任务都达到终态时，进行依赖判断, 如果上游状态全部都是成功、失败、上游失败状态，则依赖判断成功，否则为跳过运行</li><li>ALL_DONE_AT_LEAST_ONE_FAILED：上游全部完成至少一个失败: 所有上游依赖任务都达到终态时，进行依赖判断，至少有一个失败，则依赖判断成功，否则就是跳过运行</li><li>ADVANCED:运行条件为高级模式时配置</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DependOnRunCondition <p>任依赖运行条件</p><ul><li>ALL_SUCCESS: 全部成功：所有上游依赖任务均已执行并成功</li><li>ONE_SUCCESS: 至少一个成功：至少有一个上游依赖任务成功</li><li>NONE_FAILED: 目前没有失败：没有依赖任务失败，并且至少有一个依赖任务在运行中</li><li>ALL_DONE: 全部完成：所有上游依赖任务均已执行并完成（无论成功或失败</li><li>ONE_FAILED: 至少一个失败：至少有一个上游依赖任务失败</li><li>ALL_FAILED: 全部失败：所有上游依赖任务都失败</li><li>ALL_DONE_AT_LEAST_ONE_SUCCESS：上游全部完成至少一个成功: 所有上游依赖任务都达到终态时，进行依赖判断，至少有一个成功，则依赖判断成功，否则就是跳过运行</li><li>ALL_SKIPPED：上游全部完成，没有跳过运行: 所有上游依赖任务都达到终态时，进行依赖判断, 如果上游状态全部都是成功、失败、上游失败状态，则依赖判断成功，否则为跳过运行</li><li>ONE_DONE：至少一个完成：上游只要有一个完成了，就进行依赖判断，且依赖判断成功，否则还是等待上游</li><li>ALL_DONE_NONE_FAILED_AT_LEAST_ONE_SUCCESS：上游全部完成，没有失败，至少有一个成功: 所有上游依赖任务都达到终态时，进行依赖判断，上游没有一个失败且至少有一个成功的情况下，依赖判断成功，否则就是跳过运行</li><li>NONE_SKIPPED：上游全部完成，没有跳过运行: 所有上游依赖任务都达到终态时，进行依赖判断, 如果上游状态全部都是成功、失败、上游失败状态，则依赖判断成功，否则为跳过运行</li><li>ALL_DONE_AT_LEAST_ONE_FAILED：上游全部完成至少一个失败: 所有上游依赖任务都达到终态时，进行依赖判断，至少有一个失败，则依赖判断成功，否则就是跳过运行</li><li>ADVANCED:运行条件为高级模式时配置</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDependOnRunCondition(String DependOnRunCondition) {
        this.DependOnRunCondition = DependOnRunCondition;
    }

    /**
     * Get <p>任务X坐标</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LeftCoordinate <p>任务X坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getLeftCoordinate() {
        return this.LeftCoordinate;
    }

    /**
     * Set <p>任务X坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LeftCoordinate <p>任务X坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLeftCoordinate(Float LeftCoordinate) {
        this.LeftCoordinate = LeftCoordinate;
    }

    /**
     * Get <p>任务Y坐标</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopCoordinate <p>任务Y坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTopCoordinate() {
        return this.TopCoordinate;
    }

    /**
     * Set <p>任务Y坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopCoordinate <p>任务Y坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopCoordinate(Float TopCoordinate) {
        this.TopCoordinate = TopCoordinate;
    }

    /**
     * Get <p>任务高级运行参数，当DependOnRunCondition为ADVANCED时配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdvancedDependencyConfig <p>任务高级运行参数，当DependOnRunCondition为ADVANCED时配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AdvancedDependencyConfig getAdvancedDependencyConfig() {
        return this.AdvancedDependencyConfig;
    }

    /**
     * Set <p>任务高级运行参数，当DependOnRunCondition为ADVANCED时配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdvancedDependencyConfig <p>任务高级运行参数，当DependOnRunCondition为ADVANCED时配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdvancedDependencyConfig(AdvancedDependencyConfig AdvancedDependencyConfig) {
        this.AdvancedDependencyConfig = AdvancedDependencyConfig;
    }

    /**
     * Get <p>内嵌任务（FOR_EACH任务的子任务）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InnerTask <p>内嵌任务（FOR_EACH任务的子任务）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WorkflowTask getInnerTask() {
        return this.InnerTask;
    }

    /**
     * Set <p>内嵌任务（FOR_EACH任务的子任务）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InnerTask <p>内嵌任务（FOR_EACH任务的子任务）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInnerTask(WorkflowTask InnerTask) {
        this.InnerTask = InnerTask;
    }

    /**
     * Get <p>创建时间，单位：毫秒时间戳。系统生成字段，仅出参返回，入参无需传入（传入不生效，服务端忽略且不报错）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>创建时间，单位：毫秒时间戳。系统生成字段，仅出参返回，入参无需传入（传入不生效，服务端忽略且不报错）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间，单位：毫秒时间戳。系统生成字段，仅出参返回，入参无需传入（传入不生效，服务端忽略且不报错）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>创建时间，单位：毫秒时间戳。系统生成字段，仅出参返回，入参无需传入（传入不生效，服务端忽略且不报错）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间，单位：毫秒时间戳。系统生成字段，仅出参返回，入参无需传入（传入不生效，服务端忽略且不报错）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime <p>更新时间，单位：毫秒时间戳。系统生成字段，仅出参返回，入参无需传入（传入不生效，服务端忽略且不报错）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间，单位：毫秒时间戳。系统生成字段，仅出参返回，入参无需传入（传入不生效，服务端忽略且不报错）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime <p>更新时间，单位：毫秒时间戳。系统生成字段，仅出参返回，入参无需传入（传入不生效，服务端忽略且不报错）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>创建人UIN。系统生成字段，仅出参返回，入参无需传入（传入不生效，服务端忽略且不报错）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateUserUin <p>创建人UIN。系统生成字段，仅出参返回，入参无需传入（传入不生效，服务端忽略且不报错）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateUserUin() {
        return this.CreateUserUin;
    }

    /**
     * Set <p>创建人UIN。系统生成字段，仅出参返回，入参无需传入（传入不生效，服务端忽略且不报错）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateUserUin <p>创建人UIN。系统生成字段，仅出参返回，入参无需传入（传入不生效，服务端忽略且不报错）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateUserUin(String CreateUserUin) {
        this.CreateUserUin = CreateUserUin;
    }

    public WorkflowTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowTask(WorkflowTask source) {
        if (source.ParamList != null) {
            this.ParamList = new ParamInfo[source.ParamList.length];
            for (int i = 0; i < source.ParamList.length; i++) {
                this.ParamList[i] = new ParamInfo(source.ParamList[i]);
            }
        }
        if (source.DependOnList != null) {
            this.DependOnList = new DependOnBrief[source.DependOnList.length];
            for (int i = 0; i < source.DependOnList.length; i++) {
                this.DependOnList[i] = new DependOnBrief(source.DependOnList[i]);
            }
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskType != null) {
            this.TaskType = new TaskType(source.TaskType);
        }
        if (source.ResourceGroupId != null) {
            this.ResourceGroupId = new String(source.ResourceGroupId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Alarm != null) {
            this.Alarm = new AlarmBrief(source.Alarm);
        }
        if (source.MonitorMetric != null) {
            this.MonitorMetric = new MonitorMetricBrief(source.MonitorMetric);
        }
        if (source.TaskRetryStrategy != null) {
            this.TaskRetryStrategy = new TaskRetryStrategy(source.TaskRetryStrategy);
        }
        if (source.DependOnRunCondition != null) {
            this.DependOnRunCondition = new String(source.DependOnRunCondition);
        }
        if (source.LeftCoordinate != null) {
            this.LeftCoordinate = new Float(source.LeftCoordinate);
        }
        if (source.TopCoordinate != null) {
            this.TopCoordinate = new Float(source.TopCoordinate);
        }
        if (source.AdvancedDependencyConfig != null) {
            this.AdvancedDependencyConfig = new AdvancedDependencyConfig(source.AdvancedDependencyConfig);
        }
        if (source.InnerTask != null) {
            this.InnerTask = new WorkflowTask(source.InnerTask);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.CreateUserUin != null) {
            this.CreateUserUin = new String(source.CreateUserUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ParamList.", this.ParamList);
        this.setParamArrayObj(map, prefix + "DependOnList.", this.DependOnList);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamObj(map, prefix + "TaskType.", this.TaskType);
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamObj(map, prefix + "Alarm.", this.Alarm);
        this.setParamObj(map, prefix + "MonitorMetric.", this.MonitorMetric);
        this.setParamObj(map, prefix + "TaskRetryStrategy.", this.TaskRetryStrategy);
        this.setParamSimple(map, prefix + "DependOnRunCondition", this.DependOnRunCondition);
        this.setParamSimple(map, prefix + "LeftCoordinate", this.LeftCoordinate);
        this.setParamSimple(map, prefix + "TopCoordinate", this.TopCoordinate);
        this.setParamObj(map, prefix + "AdvancedDependencyConfig.", this.AdvancedDependencyConfig);
        this.setParamObj(map, prefix + "InnerTask.", this.InnerTask);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "CreateUserUin", this.CreateUserUin);

    }
}

