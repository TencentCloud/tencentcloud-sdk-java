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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubTaskData extends AbstractModel {

    /**
    * 子任务ID
    */
    @SerializedName("SubTaskId")
    @Expose
    private String SubTaskId;

    /**
    * 任务状态1:NEW,2:RUNNING,3:COMPLETED ,4:FAILED
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 任务失败原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailReason")
    @Expose
    private String FailReason;

    /**
    * 任务进度
    */
    @SerializedName("Progress")
    @Expose
    private Float Progress;

    /**
    * 操作类型
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 操作类型中文描述
    */
    @SerializedName("ActionZhDesc")
    @Expose
    private String ActionZhDesc;

    /**
    * 资源ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 启动任务时间
    */
    @SerializedName("StartedAt")
    @Expose
    private String StartedAt;

    /**
    * 创建任务时间
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 更新任务时间
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * 任务运行时间，单位ms
    */
    @SerializedName("Runtime")
    @Expose
    private Long Runtime;

    /**
    * 设备ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 设备名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 通道ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * 通道名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
     * Get 子任务ID 
     * @return SubTaskId 子任务ID
     */
    public String getSubTaskId() {
        return this.SubTaskId;
    }

    /**
     * Set 子任务ID
     * @param SubTaskId 子任务ID
     */
    public void setSubTaskId(String SubTaskId) {
        this.SubTaskId = SubTaskId;
    }

    /**
     * Get 任务状态1:NEW,2:RUNNING,3:COMPLETED ,4:FAILED 
     * @return Status 任务状态1:NEW,2:RUNNING,3:COMPLETED ,4:FAILED
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态1:NEW,2:RUNNING,3:COMPLETED ,4:FAILED
     * @param Status 任务状态1:NEW,2:RUNNING,3:COMPLETED ,4:FAILED
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 任务失败原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailReason 任务失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFailReason() {
        return this.FailReason;
    }

    /**
     * Set 任务失败原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailReason 任务失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailReason(String FailReason) {
        this.FailReason = FailReason;
    }

    /**
     * Get 任务进度 
     * @return Progress 任务进度
     */
    public Float getProgress() {
        return this.Progress;
    }

    /**
     * Set 任务进度
     * @param Progress 任务进度
     */
    public void setProgress(Float Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 操作类型 
     * @return Action 操作类型
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 操作类型
     * @param Action 操作类型
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 操作类型中文描述 
     * @return ActionZhDesc 操作类型中文描述
     */
    public String getActionZhDesc() {
        return this.ActionZhDesc;
    }

    /**
     * Set 操作类型中文描述
     * @param ActionZhDesc 操作类型中文描述
     */
    public void setActionZhDesc(String ActionZhDesc) {
        this.ActionZhDesc = ActionZhDesc;
    }

    /**
     * Get 资源ID 
     * @return ResourceId 资源ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源ID
     * @param ResourceId 资源ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 启动任务时间 
     * @return StartedAt 启动任务时间
     */
    public String getStartedAt() {
        return this.StartedAt;
    }

    /**
     * Set 启动任务时间
     * @param StartedAt 启动任务时间
     */
    public void setStartedAt(String StartedAt) {
        this.StartedAt = StartedAt;
    }

    /**
     * Get 创建任务时间 
     * @return CreatedAt 创建任务时间
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 创建任务时间
     * @param CreatedAt 创建任务时间
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 更新任务时间 
     * @return UpdatedAt 更新任务时间
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 更新任务时间
     * @param UpdatedAt 更新任务时间
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get 任务运行时间，单位ms 
     * @return Runtime 任务运行时间，单位ms
     */
    public Long getRuntime() {
        return this.Runtime;
    }

    /**
     * Set 任务运行时间，单位ms
     * @param Runtime 任务运行时间，单位ms
     */
    public void setRuntime(Long Runtime) {
        this.Runtime = Runtime;
    }

    /**
     * Get 设备ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceId 设备ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceId 设备ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 设备名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceName 设备名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceName 设备名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 通道ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelId 通道ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 通道ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelId 通道ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get 通道名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelName 通道名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set 通道名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelName 通道名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    public SubTaskData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubTaskData(SubTaskData source) {
        if (source.SubTaskId != null) {
            this.SubTaskId = new String(source.SubTaskId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.FailReason != null) {
            this.FailReason = new String(source.FailReason);
        }
        if (source.Progress != null) {
            this.Progress = new Float(source.Progress);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.ActionZhDesc != null) {
            this.ActionZhDesc = new String(source.ActionZhDesc);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.StartedAt != null) {
            this.StartedAt = new String(source.StartedAt);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.Runtime != null) {
            this.Runtime = new Long(source.Runtime);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubTaskId", this.SubTaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FailReason", this.FailReason);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "ActionZhDesc", this.ActionZhDesc);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "StartedAt", this.StartedAt);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "Runtime", this.Runtime);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);

    }
}

