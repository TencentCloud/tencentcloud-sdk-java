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

public class InnerWorkflowTaskRunIterationBrief extends AbstractModel {

    /**
    * <p>任务运行ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowTaskRunId")
    @Expose
    private String WorkflowTaskRunId;

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
    * <p>运行状态</p>
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
    @SerializedName("TaskParams")
    @Expose
    private String TaskParams;

    /**
    * <p>错误码</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorCodeString")
    @Expose
    private String ErrorCodeString;

    /**
     * Get <p>任务运行ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowTaskRunId <p>任务运行ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowTaskRunId() {
        return this.WorkflowTaskRunId;
    }

    /**
     * Set <p>任务运行ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowTaskRunId <p>任务运行ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowTaskRunId(String WorkflowTaskRunId) {
        this.WorkflowTaskRunId = WorkflowTaskRunId;
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
     * Get <p>运行状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunState <p>运行状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunState() {
        return this.RunState;
    }

    /**
     * Set <p>运行状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunState <p>运行状态</p>
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
     * @return TaskParams <p>运行参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskParams() {
        return this.TaskParams;
    }

    /**
     * Set <p>运行参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskParams <p>运行参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskParams(String TaskParams) {
        this.TaskParams = TaskParams;
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

    public InnerWorkflowTaskRunIterationBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InnerWorkflowTaskRunIterationBrief(InnerWorkflowTaskRunIterationBrief source) {
        if (source.WorkflowTaskRunId != null) {
            this.WorkflowTaskRunId = new String(source.WorkflowTaskRunId);
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
        if (source.TaskParams != null) {
            this.TaskParams = new String(source.TaskParams);
        }
        if (source.ErrorCodeString != null) {
            this.ErrorCodeString = new String(source.ErrorCodeString);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkflowTaskRunId", this.WorkflowTaskRunId);
        this.setParamSimple(map, prefix + "IterationIndex", this.IterationIndex);
        this.setParamSimple(map, prefix + "RunStartTime", this.RunStartTime);
        this.setParamSimple(map, prefix + "RunEndTime", this.RunEndTime);
        this.setParamSimple(map, prefix + "RunState", this.RunState);
        this.setParamSimple(map, prefix + "RunCostTime", this.RunCostTime);
        this.setParamSimple(map, prefix + "TaskParams", this.TaskParams);
        this.setParamSimple(map, prefix + "ErrorCodeString", this.ErrorCodeString);

    }
}

