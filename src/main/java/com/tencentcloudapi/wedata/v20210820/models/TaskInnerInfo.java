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

public class TaskInnerInfo extends AbstractModel{

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务名
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 工作流id
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 周期类型  0:crontab类型, 1:分钟，2:小时，3:天，4:周，5:月，6:一次性，7:用户驱动，10:弹性周期 周,11:弹性周期 月,12:年,13:即时触发Instant类型，与正常周期调度任务逻辑隔离
    */
    @SerializedName("CycleType")
    @Expose
    private Long CycleType;

    /**
    * 虚拟任务id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VirtualTaskId")
    @Expose
    private String VirtualTaskId;

    /**
    * 虚拟任务标记
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VirtualFlag")
    @Expose
    private Boolean VirtualFlag;

    /**
    * 真实任务工作流id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RealWorkflowId")
    @Expose
    private String RealWorkflowId;

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
     * Get 任务名 
     * @return TaskName 任务名
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名
     * @param TaskName 任务名
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 工作流id 
     * @return WorkflowId 工作流id
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 工作流id
     * @param WorkflowId 工作流id
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get 周期类型  0:crontab类型, 1:分钟，2:小时，3:天，4:周，5:月，6:一次性，7:用户驱动，10:弹性周期 周,11:弹性周期 月,12:年,13:即时触发Instant类型，与正常周期调度任务逻辑隔离 
     * @return CycleType 周期类型  0:crontab类型, 1:分钟，2:小时，3:天，4:周，5:月，6:一次性，7:用户驱动，10:弹性周期 周,11:弹性周期 月,12:年,13:即时触发Instant类型，与正常周期调度任务逻辑隔离
     */
    public Long getCycleType() {
        return this.CycleType;
    }

    /**
     * Set 周期类型  0:crontab类型, 1:分钟，2:小时，3:天，4:周，5:月，6:一次性，7:用户驱动，10:弹性周期 周,11:弹性周期 月,12:年,13:即时触发Instant类型，与正常周期调度任务逻辑隔离
     * @param CycleType 周期类型  0:crontab类型, 1:分钟，2:小时，3:天，4:周，5:月，6:一次性，7:用户驱动，10:弹性周期 周,11:弹性周期 月,12:年,13:即时触发Instant类型，与正常周期调度任务逻辑隔离
     */
    public void setCycleType(Long CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get 虚拟任务id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VirtualTaskId 虚拟任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVirtualTaskId() {
        return this.VirtualTaskId;
    }

    /**
     * Set 虚拟任务id
注意：此字段可能返回 null，表示取不到有效值。
     * @param VirtualTaskId 虚拟任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVirtualTaskId(String VirtualTaskId) {
        this.VirtualTaskId = VirtualTaskId;
    }

    /**
     * Get 虚拟任务标记
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VirtualFlag 虚拟任务标记
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getVirtualFlag() {
        return this.VirtualFlag;
    }

    /**
     * Set 虚拟任务标记
注意：此字段可能返回 null，表示取不到有效值。
     * @param VirtualFlag 虚拟任务标记
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVirtualFlag(Boolean VirtualFlag) {
        this.VirtualFlag = VirtualFlag;
    }

    /**
     * Get 真实任务工作流id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RealWorkflowId 真实任务工作流id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRealWorkflowId() {
        return this.RealWorkflowId;
    }

    /**
     * Set 真实任务工作流id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealWorkflowId 真实任务工作流id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRealWorkflowId(String RealWorkflowId) {
        this.RealWorkflowId = RealWorkflowId;
    }

    public TaskInnerInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskInnerInfo(TaskInnerInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.CycleType != null) {
            this.CycleType = new Long(source.CycleType);
        }
        if (source.VirtualTaskId != null) {
            this.VirtualTaskId = new String(source.VirtualTaskId);
        }
        if (source.VirtualFlag != null) {
            this.VirtualFlag = new Boolean(source.VirtualFlag);
        }
        if (source.RealWorkflowId != null) {
            this.RealWorkflowId = new String(source.RealWorkflowId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "VirtualTaskId", this.VirtualTaskId);
        this.setParamSimple(map, prefix + "VirtualFlag", this.VirtualFlag);
        this.setParamSimple(map, prefix + "RealWorkflowId", this.RealWorkflowId);

    }
}

