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

public class InnerWorkflowTaskRunIteration extends AbstractModel {

    /**
    * <p>内嵌工作流运行ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowRunId")
    @Expose
    private String WorkflowRunId;

    /**
    * <p>迭代序号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IterationIndex")
    @Expose
    private String IterationIndex;

    /**
    * <p>运行开始时间，单位：毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunStartTime")
    @Expose
    private String RunStartTime;

    /**
    * <p>运行结束时间，单位：毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunEndTime")
    @Expose
    private String RunEndTime;

    /**
    * <p>运行状态（参考工作流运行状态枚举）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunState")
    @Expose
    private String RunState;

    /**
    * <p>运行时长，单位：秒</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunCostTime")
    @Expose
    private String RunCostTime;

    /**
    * <p>运行参数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowParams")
    @Expose
    private String WorkflowParams;

    /**
    * <p>错误码</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorCodeString")
    @Expose
    private String ErrorCodeString;

    /**
    * <p>内嵌工作流内部的任务运行</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InnerTaskRun")
    @Expose
    private InnerWorkflowTaskRunIterationBrief InnerTaskRun;

    /**
     * Get <p>内嵌工作流运行ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowRunId <p>内嵌工作流运行ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowRunId() {
        return this.WorkflowRunId;
    }

    /**
     * Set <p>内嵌工作流运行ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowRunId <p>内嵌工作流运行ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowRunId(String WorkflowRunId) {
        this.WorkflowRunId = WorkflowRunId;
    }

    /**
     * Get <p>迭代序号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IterationIndex <p>迭代序号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIterationIndex() {
        return this.IterationIndex;
    }

    /**
     * Set <p>迭代序号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IterationIndex <p>迭代序号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIterationIndex(String IterationIndex) {
        this.IterationIndex = IterationIndex;
    }

    /**
     * Get <p>运行开始时间，单位：毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunStartTime <p>运行开始时间，单位：毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunStartTime() {
        return this.RunStartTime;
    }

    /**
     * Set <p>运行开始时间，单位：毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunStartTime <p>运行开始时间，单位：毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunStartTime(String RunStartTime) {
        this.RunStartTime = RunStartTime;
    }

    /**
     * Get <p>运行结束时间，单位：毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunEndTime <p>运行结束时间，单位：毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunEndTime() {
        return this.RunEndTime;
    }

    /**
     * Set <p>运行结束时间，单位：毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunEndTime <p>运行结束时间，单位：毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunEndTime(String RunEndTime) {
        this.RunEndTime = RunEndTime;
    }

    /**
     * Get <p>运行状态（参考工作流运行状态枚举）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunState <p>运行状态（参考工作流运行状态枚举）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunState() {
        return this.RunState;
    }

    /**
     * Set <p>运行状态（参考工作流运行状态枚举）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunState <p>运行状态（参考工作流运行状态枚举）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunState(String RunState) {
        this.RunState = RunState;
    }

    /**
     * Get <p>运行时长，单位：秒</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunCostTime <p>运行时长，单位：秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunCostTime() {
        return this.RunCostTime;
    }

    /**
     * Set <p>运行时长，单位：秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunCostTime <p>运行时长，单位：秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunCostTime(String RunCostTime) {
        this.RunCostTime = RunCostTime;
    }

    /**
     * Get <p>运行参数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowParams <p>运行参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowParams() {
        return this.WorkflowParams;
    }

    /**
     * Set <p>运行参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowParams <p>运行参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowParams(String WorkflowParams) {
        this.WorkflowParams = WorkflowParams;
    }

    /**
     * Get <p>错误码</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorCodeString <p>错误码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorCodeString() {
        return this.ErrorCodeString;
    }

    /**
     * Set <p>错误码</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorCodeString <p>错误码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorCodeString(String ErrorCodeString) {
        this.ErrorCodeString = ErrorCodeString;
    }

    /**
     * Get <p>内嵌工作流内部的任务运行</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InnerTaskRun <p>内嵌工作流内部的任务运行</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InnerWorkflowTaskRunIterationBrief getInnerTaskRun() {
        return this.InnerTaskRun;
    }

    /**
     * Set <p>内嵌工作流内部的任务运行</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InnerTaskRun <p>内嵌工作流内部的任务运行</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInnerTaskRun(InnerWorkflowTaskRunIterationBrief InnerTaskRun) {
        this.InnerTaskRun = InnerTaskRun;
    }

    public InnerWorkflowTaskRunIteration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InnerWorkflowTaskRunIteration(InnerWorkflowTaskRunIteration source) {
        if (source.WorkflowRunId != null) {
            this.WorkflowRunId = new String(source.WorkflowRunId);
        }
        if (source.IterationIndex != null) {
            this.IterationIndex = new String(source.IterationIndex);
        }
        if (source.RunStartTime != null) {
            this.RunStartTime = new String(source.RunStartTime);
        }
        if (source.RunEndTime != null) {
            this.RunEndTime = new String(source.RunEndTime);
        }
        if (source.RunState != null) {
            this.RunState = new String(source.RunState);
        }
        if (source.RunCostTime != null) {
            this.RunCostTime = new String(source.RunCostTime);
        }
        if (source.WorkflowParams != null) {
            this.WorkflowParams = new String(source.WorkflowParams);
        }
        if (source.ErrorCodeString != null) {
            this.ErrorCodeString = new String(source.ErrorCodeString);
        }
        if (source.InnerTaskRun != null) {
            this.InnerTaskRun = new InnerWorkflowTaskRunIterationBrief(source.InnerTaskRun);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkflowRunId", this.WorkflowRunId);
        this.setParamSimple(map, prefix + "IterationIndex", this.IterationIndex);
        this.setParamSimple(map, prefix + "RunStartTime", this.RunStartTime);
        this.setParamSimple(map, prefix + "RunEndTime", this.RunEndTime);
        this.setParamSimple(map, prefix + "RunState", this.RunState);
        this.setParamSimple(map, prefix + "RunCostTime", this.RunCostTime);
        this.setParamSimple(map, prefix + "WorkflowParams", this.WorkflowParams);
        this.setParamSimple(map, prefix + "ErrorCodeString", this.ErrorCodeString);
        this.setParamObj(map, prefix + "InnerTaskRun.", this.InnerTaskRun);

    }
}

