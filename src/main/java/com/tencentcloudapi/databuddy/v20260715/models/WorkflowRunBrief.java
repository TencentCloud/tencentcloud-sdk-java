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

public class WorkflowRunBrief extends AbstractModel {

    /**
    * 工作流运行ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowRunId")
    @Expose
    private String WorkflowRunId;

    /**
    * 运行开始时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunStartTime")
    @Expose
    private String RunStartTime;

    /**
    * 运行状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunState")
    @Expose
    private String RunState;

    /**
    * 运行错误码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorCodeString")
    @Expose
    private String ErrorCodeString;

    /**
     * Get 工作流运行ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowRunId 工作流运行ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowRunId() {
        return this.WorkflowRunId;
    }

    /**
     * Set 工作流运行ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowRunId 工作流运行ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowRunId(String WorkflowRunId) {
        this.WorkflowRunId = WorkflowRunId;
    }

    /**
     * Get 运行开始时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunStartTime 运行开始时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunStartTime() {
        return this.RunStartTime;
    }

    /**
     * Set 运行开始时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunStartTime 运行开始时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunStartTime(String RunStartTime) {
        this.RunStartTime = RunStartTime;
    }

    /**
     * Get 运行状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunState 运行状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunState() {
        return this.RunState;
    }

    /**
     * Set 运行状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunState 运行状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunState(String RunState) {
        this.RunState = RunState;
    }

    /**
     * Get 运行错误码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorCodeString 运行错误码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorCodeString() {
        return this.ErrorCodeString;
    }

    /**
     * Set 运行错误码
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorCodeString 运行错误码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorCodeString(String ErrorCodeString) {
        this.ErrorCodeString = ErrorCodeString;
    }

    public WorkflowRunBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowRunBrief(WorkflowRunBrief source) {
        if (source.WorkflowRunId != null) {
            this.WorkflowRunId = new String(source.WorkflowRunId);
        }
        if (source.RunStartTime != null) {
            this.RunStartTime = new String(source.RunStartTime);
        }
        if (source.RunState != null) {
            this.RunState = new String(source.RunState);
        }
        if (source.ErrorCodeString != null) {
            this.ErrorCodeString = new String(source.ErrorCodeString);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkflowRunId", this.WorkflowRunId);
        this.setParamSimple(map, prefix + "RunStartTime", this.RunStartTime);
        this.setParamSimple(map, prefix + "RunState", this.RunState);
        this.setParamSimple(map, prefix + "ErrorCodeString", this.ErrorCodeString);

    }
}

