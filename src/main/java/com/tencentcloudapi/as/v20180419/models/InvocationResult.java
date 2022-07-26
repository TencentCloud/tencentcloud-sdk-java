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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InvocationResult extends AbstractModel{

    /**
    * 实例ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 执行活动ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InvocationId")
    @Expose
    private String InvocationId;

    /**
    * 执行任务ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InvocationTaskId")
    @Expose
    private String InvocationTaskId;

    /**
    * 命令ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CommandId")
    @Expose
    private String CommandId;

    /**
    * 执行任务状态。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
    * 执行异常信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
     * Get 实例ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 执行活动ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InvocationId 执行活动ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInvocationId() {
        return this.InvocationId;
    }

    /**
     * Set 执行活动ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InvocationId 执行活动ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInvocationId(String InvocationId) {
        this.InvocationId = InvocationId;
    }

    /**
     * Get 执行任务ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InvocationTaskId 执行任务ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInvocationTaskId() {
        return this.InvocationTaskId;
    }

    /**
     * Set 执行任务ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InvocationTaskId 执行任务ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInvocationTaskId(String InvocationTaskId) {
        this.InvocationTaskId = InvocationTaskId;
    }

    /**
     * Get 命令ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CommandId 命令ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCommandId() {
        return this.CommandId;
    }

    /**
     * Set 命令ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CommandId 命令ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCommandId(String CommandId) {
        this.CommandId = CommandId;
    }

    /**
     * Get 执行任务状态。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskStatus 执行任务状态。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 执行任务状态。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskStatus 执行任务状态。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get 执行异常信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorMessage 执行异常信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set 执行异常信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorMessage 执行异常信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    public InvocationResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InvocationResult(InvocationResult source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InvocationId != null) {
            this.InvocationId = new String(source.InvocationId);
        }
        if (source.InvocationTaskId != null) {
            this.InvocationTaskId = new String(source.InvocationTaskId);
        }
        if (source.CommandId != null) {
            this.CommandId = new String(source.CommandId);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new String(source.TaskStatus);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InvocationId", this.InvocationId);
        this.setParamSimple(map, prefix + "InvocationTaskId", this.InvocationTaskId);
        this.setParamSimple(map, prefix + "CommandId", this.CommandId);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);

    }
}

