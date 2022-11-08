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

public class OfflineTaskAddParam extends AbstractModel{

    /**
    * 名称
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * 依赖
    */
    @SerializedName("DependencyWorkflow")
    @Expose
    private String DependencyWorkflow;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 周期
    */
    @SerializedName("CycleType")
    @Expose
    private Long CycleType;

    /**
    * 周期间隔
    */
    @SerializedName("CycleStep")
    @Expose
    private Long CycleStep;

    /**
    * 延迟时间
    */
    @SerializedName("DelayTime")
    @Expose
    private Long DelayTime;

    /**
    * crontab
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CrontabExpression")
    @Expose
    private String CrontabExpression;

    /**
    * 重试等待
    */
    @SerializedName("RetryWait")
    @Expose
    private Long RetryWait;

    /**
    * 是否可以重试
    */
    @SerializedName("Retriable")
    @Expose
    private Long Retriable;

    /**
    * 重试限制
    */
    @SerializedName("TryLimit")
    @Expose
    private Long TryLimit;

    /**
    * 优先级
    */
    @SerializedName("RunPriority")
    @Expose
    private Long RunPriority;

    /**
    * 产品名称
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 1 有序串行 一次一个，排队 orderly 
2 无序串行 一次一个，不排队 serial  
3 并行 一次多个 parallel
    */
    @SerializedName("SelfDepend")
    @Expose
    private Long SelfDepend;

    /**
    * 周任务：1是周天，2是周1，7是周6 。
月任务：如具体1，3号则写 "1,3"，指定月末不可和具体号数一起输入，仅能为 "L"
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskAction")
    @Expose
    private String TaskAction;

    /**
    * 调度执行结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionEndTime")
    @Expose
    private String ExecutionEndTime;

    /**
    * 调度执行开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionStartTime")
    @Expose
    private String ExecutionStartTime;

    /**
     * Get 名称 
     * @return WorkflowName 名称
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set 名称
     * @param WorkflowName 名称
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get 依赖 
     * @return DependencyWorkflow 依赖
     */
    public String getDependencyWorkflow() {
        return this.DependencyWorkflow;
    }

    /**
     * Set 依赖
     * @param DependencyWorkflow 依赖
     */
    public void setDependencyWorkflow(String DependencyWorkflow) {
        this.DependencyWorkflow = DependencyWorkflow;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 周期 
     * @return CycleType 周期
     */
    public Long getCycleType() {
        return this.CycleType;
    }

    /**
     * Set 周期
     * @param CycleType 周期
     */
    public void setCycleType(Long CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get 周期间隔 
     * @return CycleStep 周期间隔
     */
    public Long getCycleStep() {
        return this.CycleStep;
    }

    /**
     * Set 周期间隔
     * @param CycleStep 周期间隔
     */
    public void setCycleStep(Long CycleStep) {
        this.CycleStep = CycleStep;
    }

    /**
     * Get 延迟时间 
     * @return DelayTime 延迟时间
     */
    public Long getDelayTime() {
        return this.DelayTime;
    }

    /**
     * Set 延迟时间
     * @param DelayTime 延迟时间
     */
    public void setDelayTime(Long DelayTime) {
        this.DelayTime = DelayTime;
    }

    /**
     * Get crontab
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CrontabExpression crontab
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCrontabExpression() {
        return this.CrontabExpression;
    }

    /**
     * Set crontab
注意：此字段可能返回 null，表示取不到有效值。
     * @param CrontabExpression crontab
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCrontabExpression(String CrontabExpression) {
        this.CrontabExpression = CrontabExpression;
    }

    /**
     * Get 重试等待 
     * @return RetryWait 重试等待
     */
    public Long getRetryWait() {
        return this.RetryWait;
    }

    /**
     * Set 重试等待
     * @param RetryWait 重试等待
     */
    public void setRetryWait(Long RetryWait) {
        this.RetryWait = RetryWait;
    }

    /**
     * Get 是否可以重试 
     * @return Retriable 是否可以重试
     */
    public Long getRetriable() {
        return this.Retriable;
    }

    /**
     * Set 是否可以重试
     * @param Retriable 是否可以重试
     */
    public void setRetriable(Long Retriable) {
        this.Retriable = Retriable;
    }

    /**
     * Get 重试限制 
     * @return TryLimit 重试限制
     */
    public Long getTryLimit() {
        return this.TryLimit;
    }

    /**
     * Set 重试限制
     * @param TryLimit 重试限制
     */
    public void setTryLimit(Long TryLimit) {
        this.TryLimit = TryLimit;
    }

    /**
     * Get 优先级 
     * @return RunPriority 优先级
     */
    public Long getRunPriority() {
        return this.RunPriority;
    }

    /**
     * Set 优先级
     * @param RunPriority 优先级
     */
    public void setRunPriority(Long RunPriority) {
        this.RunPriority = RunPriority;
    }

    /**
     * Get 产品名称 
     * @return ProductName 产品名称
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 产品名称
     * @param ProductName 产品名称
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 1 有序串行 一次一个，排队 orderly 
2 无序串行 一次一个，不排队 serial  
3 并行 一次多个 parallel 
     * @return SelfDepend 1 有序串行 一次一个，排队 orderly 
2 无序串行 一次一个，不排队 serial  
3 并行 一次多个 parallel
     */
    public Long getSelfDepend() {
        return this.SelfDepend;
    }

    /**
     * Set 1 有序串行 一次一个，排队 orderly 
2 无序串行 一次一个，不排队 serial  
3 并行 一次多个 parallel
     * @param SelfDepend 1 有序串行 一次一个，排队 orderly 
2 无序串行 一次一个，不排队 serial  
3 并行 一次多个 parallel
     */
    public void setSelfDepend(Long SelfDepend) {
        this.SelfDepend = SelfDepend;
    }

    /**
     * Get 周任务：1是周天，2是周1，7是周6 。
月任务：如具体1，3号则写 "1,3"，指定月末不可和具体号数一起输入，仅能为 "L"
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskAction 周任务：1是周天，2是周1，7是周6 。
月任务：如具体1，3号则写 "1,3"，指定月末不可和具体号数一起输入，仅能为 "L"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskAction() {
        return this.TaskAction;
    }

    /**
     * Set 周任务：1是周天，2是周1，7是周6 。
月任务：如具体1，3号则写 "1,3"，指定月末不可和具体号数一起输入，仅能为 "L"
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskAction 周任务：1是周天，2是周1，7是周6 。
月任务：如具体1，3号则写 "1,3"，指定月末不可和具体号数一起输入，仅能为 "L"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskAction(String TaskAction) {
        this.TaskAction = TaskAction;
    }

    /**
     * Get 调度执行结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionEndTime 调度执行结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionEndTime() {
        return this.ExecutionEndTime;
    }

    /**
     * Set 调度执行结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionEndTime 调度执行结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionEndTime(String ExecutionEndTime) {
        this.ExecutionEndTime = ExecutionEndTime;
    }

    /**
     * Get 调度执行开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionStartTime 调度执行开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionStartTime() {
        return this.ExecutionStartTime;
    }

    /**
     * Set 调度执行开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionStartTime 调度执行开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionStartTime(String ExecutionStartTime) {
        this.ExecutionStartTime = ExecutionStartTime;
    }

    public OfflineTaskAddParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OfflineTaskAddParam(OfflineTaskAddParam source) {
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.DependencyWorkflow != null) {
            this.DependencyWorkflow = new String(source.DependencyWorkflow);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.CycleType != null) {
            this.CycleType = new Long(source.CycleType);
        }
        if (source.CycleStep != null) {
            this.CycleStep = new Long(source.CycleStep);
        }
        if (source.DelayTime != null) {
            this.DelayTime = new Long(source.DelayTime);
        }
        if (source.CrontabExpression != null) {
            this.CrontabExpression = new String(source.CrontabExpression);
        }
        if (source.RetryWait != null) {
            this.RetryWait = new Long(source.RetryWait);
        }
        if (source.Retriable != null) {
            this.Retriable = new Long(source.Retriable);
        }
        if (source.TryLimit != null) {
            this.TryLimit = new Long(source.TryLimit);
        }
        if (source.RunPriority != null) {
            this.RunPriority = new Long(source.RunPriority);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.SelfDepend != null) {
            this.SelfDepend = new Long(source.SelfDepend);
        }
        if (source.TaskAction != null) {
            this.TaskAction = new String(source.TaskAction);
        }
        if (source.ExecutionEndTime != null) {
            this.ExecutionEndTime = new String(source.ExecutionEndTime);
        }
        if (source.ExecutionStartTime != null) {
            this.ExecutionStartTime = new String(source.ExecutionStartTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "DependencyWorkflow", this.DependencyWorkflow);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "CycleStep", this.CycleStep);
        this.setParamSimple(map, prefix + "DelayTime", this.DelayTime);
        this.setParamSimple(map, prefix + "CrontabExpression", this.CrontabExpression);
        this.setParamSimple(map, prefix + "RetryWait", this.RetryWait);
        this.setParamSimple(map, prefix + "Retriable", this.Retriable);
        this.setParamSimple(map, prefix + "TryLimit", this.TryLimit);
        this.setParamSimple(map, prefix + "RunPriority", this.RunPriority);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "SelfDepend", this.SelfDepend);
        this.setParamSimple(map, prefix + "TaskAction", this.TaskAction);
        this.setParamSimple(map, prefix + "ExecutionEndTime", this.ExecutionEndTime);
        this.setParamSimple(map, prefix + "ExecutionStartTime", this.ExecutionStartTime);

    }
}

