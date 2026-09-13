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

public class RunActionBrief extends AbstractModel {

    /**
    * 工作流ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * 操作动作ID，用于追踪具体的执行动作
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunActionId")
    @Expose
    private String RunActionId;

    /**
    * 失败错误信息，操作失败时返回具体的错误描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * 操作状态，true 表示成功，false 表示失败
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OpStatus")
    @Expose
    private Boolean OpStatus;

    /**
    * 工作流运行ID。重跑 / 终止场景返回被操作的运行ID；运行工作流场景为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowRunId")
    @Expose
    private String WorkflowRunId;

    /**
     * Get 工作流ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowId 工作流ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 工作流ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowId 工作流ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
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
     * Get 操作动作ID，用于追踪具体的执行动作
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunActionId 操作动作ID，用于追踪具体的执行动作
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunActionId() {
        return this.RunActionId;
    }

    /**
     * Set 操作动作ID，用于追踪具体的执行动作
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunActionId 操作动作ID，用于追踪具体的执行动作
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunActionId(String RunActionId) {
        this.RunActionId = RunActionId;
    }

    /**
     * Get 失败错误信息，操作失败时返回具体的错误描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorMessage 失败错误信息，操作失败时返回具体的错误描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set 失败错误信息，操作失败时返回具体的错误描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorMessage 失败错误信息，操作失败时返回具体的错误描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get 操作状态，true 表示成功，false 表示失败
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OpStatus 操作状态，true 表示成功，false 表示失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getOpStatus() {
        return this.OpStatus;
    }

    /**
     * Set 操作状态，true 表示成功，false 表示失败
注意：此字段可能返回 null，表示取不到有效值。
     * @param OpStatus 操作状态，true 表示成功，false 表示失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOpStatus(Boolean OpStatus) {
        this.OpStatus = OpStatus;
    }

    /**
     * Get 工作流运行ID。重跑 / 终止场景返回被操作的运行ID；运行工作流场景为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowRunId 工作流运行ID。重跑 / 终止场景返回被操作的运行ID；运行工作流场景为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowRunId() {
        return this.WorkflowRunId;
    }

    /**
     * Set 工作流运行ID。重跑 / 终止场景返回被操作的运行ID；运行工作流场景为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowRunId 工作流运行ID。重跑 / 终止场景返回被操作的运行ID；运行工作流场景为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowRunId(String WorkflowRunId) {
        this.WorkflowRunId = WorkflowRunId;
    }

    public RunActionBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunActionBrief(RunActionBrief source) {
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.RunActionId != null) {
            this.RunActionId = new String(source.RunActionId);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.OpStatus != null) {
            this.OpStatus = new Boolean(source.OpStatus);
        }
        if (source.WorkflowRunId != null) {
            this.WorkflowRunId = new String(source.WorkflowRunId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "RunActionId", this.RunActionId);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "OpStatus", this.OpStatus);
        this.setParamSimple(map, prefix + "WorkflowRunId", this.WorkflowRunId);

    }
}

