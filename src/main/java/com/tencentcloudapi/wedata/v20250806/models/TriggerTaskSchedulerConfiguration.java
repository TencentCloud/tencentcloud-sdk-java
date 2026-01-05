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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TriggerTaskSchedulerConfiguration extends AbstractModel {

    /**
    * 上游依赖数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpstreamDependencyConfigList")
    @Expose
    private DependencyTriggerTaskBrief [] UpstreamDependencyConfigList;

    /**
    * 任务调度优先级 运行优先级 4高 5中 6低 , 默认:6
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunPriorityType")
    @Expose
    private Long RunPriorityType;

    /**
    * 重试策略 重试等待时间,单位分钟: 默认: 5
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RetryWaitMinute")
    @Expose
    private Long RetryWaitMinute;

    /**
    * 重试策略 最大尝试次数, 默认: 4
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxRetryNumber")
    @Expose
    private Long MaxRetryNumber;

    /**
    * 超时处理策略 运行耗时超时（单位：分钟）默认为 -1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionTTLMinute")
    @Expose
    private Long ExecutionTTLMinute;

    /**
    * 超时处理策略 等待总时长耗时超时（单位：分钟）默认为 -1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WaitExecutionTotalTTLMinute")
    @Expose
    private Long WaitExecutionTotalTTLMinute;

    /**
    * 重跑&补录配置, 默认为 ALL; , ALL 运行成功或失败后皆可重跑或补录, FAILURE 运行成功后不可重跑或补录，运行失败后可重跑或补录, NONE 运行成功或失败后皆不可重跑或补录;
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AllowRedoType")
    @Expose
    private String AllowRedoType;

    /**
    * 输出参数数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamTaskOutList")
    @Expose
    private OutTaskParameter [] ParamTaskOutList;

    /**
    * 输入参数数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamTaskInList")
    @Expose
    private InTaskParameter [] ParamTaskInList;

    /**
    * 产出登记
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskOutputRegistryList")
    @Expose
    private TaskDataRegistry [] TaskOutputRegistryList;

    /**
     * Get 上游依赖数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpstreamDependencyConfigList 上游依赖数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DependencyTriggerTaskBrief [] getUpstreamDependencyConfigList() {
        return this.UpstreamDependencyConfigList;
    }

    /**
     * Set 上游依赖数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpstreamDependencyConfigList 上游依赖数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpstreamDependencyConfigList(DependencyTriggerTaskBrief [] UpstreamDependencyConfigList) {
        this.UpstreamDependencyConfigList = UpstreamDependencyConfigList;
    }

    /**
     * Get 任务调度优先级 运行优先级 4高 5中 6低 , 默认:6
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunPriorityType 任务调度优先级 运行优先级 4高 5中 6低 , 默认:6
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRunPriorityType() {
        return this.RunPriorityType;
    }

    /**
     * Set 任务调度优先级 运行优先级 4高 5中 6低 , 默认:6
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunPriorityType 任务调度优先级 运行优先级 4高 5中 6低 , 默认:6
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunPriorityType(Long RunPriorityType) {
        this.RunPriorityType = RunPriorityType;
    }

    /**
     * Get 重试策略 重试等待时间,单位分钟: 默认: 5
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RetryWaitMinute 重试策略 重试等待时间,单位分钟: 默认: 5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRetryWaitMinute() {
        return this.RetryWaitMinute;
    }

    /**
     * Set 重试策略 重试等待时间,单位分钟: 默认: 5
注意：此字段可能返回 null，表示取不到有效值。
     * @param RetryWaitMinute 重试策略 重试等待时间,单位分钟: 默认: 5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRetryWaitMinute(Long RetryWaitMinute) {
        this.RetryWaitMinute = RetryWaitMinute;
    }

    /**
     * Get 重试策略 最大尝试次数, 默认: 4
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxRetryNumber 重试策略 最大尝试次数, 默认: 4
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxRetryNumber() {
        return this.MaxRetryNumber;
    }

    /**
     * Set 重试策略 最大尝试次数, 默认: 4
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxRetryNumber 重试策略 最大尝试次数, 默认: 4
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxRetryNumber(Long MaxRetryNumber) {
        this.MaxRetryNumber = MaxRetryNumber;
    }

    /**
     * Get 超时处理策略 运行耗时超时（单位：分钟）默认为 -1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionTTLMinute 超时处理策略 运行耗时超时（单位：分钟）默认为 -1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExecutionTTLMinute() {
        return this.ExecutionTTLMinute;
    }

    /**
     * Set 超时处理策略 运行耗时超时（单位：分钟）默认为 -1
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionTTLMinute 超时处理策略 运行耗时超时（单位：分钟）默认为 -1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionTTLMinute(Long ExecutionTTLMinute) {
        this.ExecutionTTLMinute = ExecutionTTLMinute;
    }

    /**
     * Get 超时处理策略 等待总时长耗时超时（单位：分钟）默认为 -1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WaitExecutionTotalTTLMinute 超时处理策略 等待总时长耗时超时（单位：分钟）默认为 -1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWaitExecutionTotalTTLMinute() {
        return this.WaitExecutionTotalTTLMinute;
    }

    /**
     * Set 超时处理策略 等待总时长耗时超时（单位：分钟）默认为 -1
注意：此字段可能返回 null，表示取不到有效值。
     * @param WaitExecutionTotalTTLMinute 超时处理策略 等待总时长耗时超时（单位：分钟）默认为 -1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWaitExecutionTotalTTLMinute(Long WaitExecutionTotalTTLMinute) {
        this.WaitExecutionTotalTTLMinute = WaitExecutionTotalTTLMinute;
    }

    /**
     * Get 重跑&补录配置, 默认为 ALL; , ALL 运行成功或失败后皆可重跑或补录, FAILURE 运行成功后不可重跑或补录，运行失败后可重跑或补录, NONE 运行成功或失败后皆不可重跑或补录;
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AllowRedoType 重跑&补录配置, 默认为 ALL; , ALL 运行成功或失败后皆可重跑或补录, FAILURE 运行成功后不可重跑或补录，运行失败后可重跑或补录, NONE 运行成功或失败后皆不可重跑或补录;
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAllowRedoType() {
        return this.AllowRedoType;
    }

    /**
     * Set 重跑&补录配置, 默认为 ALL; , ALL 运行成功或失败后皆可重跑或补录, FAILURE 运行成功后不可重跑或补录，运行失败后可重跑或补录, NONE 运行成功或失败后皆不可重跑或补录;
注意：此字段可能返回 null，表示取不到有效值。
     * @param AllowRedoType 重跑&补录配置, 默认为 ALL; , ALL 运行成功或失败后皆可重跑或补录, FAILURE 运行成功后不可重跑或补录，运行失败后可重跑或补录, NONE 运行成功或失败后皆不可重跑或补录;
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAllowRedoType(String AllowRedoType) {
        this.AllowRedoType = AllowRedoType;
    }

    /**
     * Get 输出参数数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParamTaskOutList 输出参数数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OutTaskParameter [] getParamTaskOutList() {
        return this.ParamTaskOutList;
    }

    /**
     * Set 输出参数数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParamTaskOutList 输出参数数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParamTaskOutList(OutTaskParameter [] ParamTaskOutList) {
        this.ParamTaskOutList = ParamTaskOutList;
    }

    /**
     * Get 输入参数数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParamTaskInList 输入参数数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InTaskParameter [] getParamTaskInList() {
        return this.ParamTaskInList;
    }

    /**
     * Set 输入参数数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParamTaskInList 输入参数数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParamTaskInList(InTaskParameter [] ParamTaskInList) {
        this.ParamTaskInList = ParamTaskInList;
    }

    /**
     * Get 产出登记
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskOutputRegistryList 产出登记
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskDataRegistry [] getTaskOutputRegistryList() {
        return this.TaskOutputRegistryList;
    }

    /**
     * Set 产出登记
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskOutputRegistryList 产出登记
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskOutputRegistryList(TaskDataRegistry [] TaskOutputRegistryList) {
        this.TaskOutputRegistryList = TaskOutputRegistryList;
    }

    public TriggerTaskSchedulerConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TriggerTaskSchedulerConfiguration(TriggerTaskSchedulerConfiguration source) {
        if (source.UpstreamDependencyConfigList != null) {
            this.UpstreamDependencyConfigList = new DependencyTriggerTaskBrief[source.UpstreamDependencyConfigList.length];
            for (int i = 0; i < source.UpstreamDependencyConfigList.length; i++) {
                this.UpstreamDependencyConfigList[i] = new DependencyTriggerTaskBrief(source.UpstreamDependencyConfigList[i]);
            }
        }
        if (source.RunPriorityType != null) {
            this.RunPriorityType = new Long(source.RunPriorityType);
        }
        if (source.RetryWaitMinute != null) {
            this.RetryWaitMinute = new Long(source.RetryWaitMinute);
        }
        if (source.MaxRetryNumber != null) {
            this.MaxRetryNumber = new Long(source.MaxRetryNumber);
        }
        if (source.ExecutionTTLMinute != null) {
            this.ExecutionTTLMinute = new Long(source.ExecutionTTLMinute);
        }
        if (source.WaitExecutionTotalTTLMinute != null) {
            this.WaitExecutionTotalTTLMinute = new Long(source.WaitExecutionTotalTTLMinute);
        }
        if (source.AllowRedoType != null) {
            this.AllowRedoType = new String(source.AllowRedoType);
        }
        if (source.ParamTaskOutList != null) {
            this.ParamTaskOutList = new OutTaskParameter[source.ParamTaskOutList.length];
            for (int i = 0; i < source.ParamTaskOutList.length; i++) {
                this.ParamTaskOutList[i] = new OutTaskParameter(source.ParamTaskOutList[i]);
            }
        }
        if (source.ParamTaskInList != null) {
            this.ParamTaskInList = new InTaskParameter[source.ParamTaskInList.length];
            for (int i = 0; i < source.ParamTaskInList.length; i++) {
                this.ParamTaskInList[i] = new InTaskParameter(source.ParamTaskInList[i]);
            }
        }
        if (source.TaskOutputRegistryList != null) {
            this.TaskOutputRegistryList = new TaskDataRegistry[source.TaskOutputRegistryList.length];
            for (int i = 0; i < source.TaskOutputRegistryList.length; i++) {
                this.TaskOutputRegistryList[i] = new TaskDataRegistry(source.TaskOutputRegistryList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "UpstreamDependencyConfigList.", this.UpstreamDependencyConfigList);
        this.setParamSimple(map, prefix + "RunPriorityType", this.RunPriorityType);
        this.setParamSimple(map, prefix + "RetryWaitMinute", this.RetryWaitMinute);
        this.setParamSimple(map, prefix + "MaxRetryNumber", this.MaxRetryNumber);
        this.setParamSimple(map, prefix + "ExecutionTTLMinute", this.ExecutionTTLMinute);
        this.setParamSimple(map, prefix + "WaitExecutionTotalTTLMinute", this.WaitExecutionTotalTTLMinute);
        this.setParamSimple(map, prefix + "AllowRedoType", this.AllowRedoType);
        this.setParamArrayObj(map, prefix + "ParamTaskOutList.", this.ParamTaskOutList);
        this.setParamArrayObj(map, prefix + "ParamTaskInList.", this.ParamTaskInList);
        this.setParamArrayObj(map, prefix + "TaskOutputRegistryList.", this.TaskOutputRegistryList);

    }
}

