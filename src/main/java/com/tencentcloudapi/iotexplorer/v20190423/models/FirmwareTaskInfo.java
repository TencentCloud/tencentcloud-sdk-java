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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FirmwareTaskInfo extends AbstractModel {

    /**
    * 任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 任务状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 任务类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 任务创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 创建者
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatorNickName")
    @Expose
    private String CreatorNickName;

    /**
    * 创建者ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateUserId")
    @Expose
    private Long CreateUserId;

    /**
    * 任务启动时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CronTime")
    @Expose
    private Long CronTime;

    /**
    * 固件类型
    */
    @SerializedName("FwType")
    @Expose
    private String FwType;

    /**
     * Get 任务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 任务状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 任务状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 任务类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 任务创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 任务创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 任务创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 任务创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 创建者
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatorNickName 创建者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatorNickName() {
        return this.CreatorNickName;
    }

    /**
     * Set 创建者
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatorNickName 创建者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatorNickName(String CreatorNickName) {
        this.CreatorNickName = CreatorNickName;
    }

    /**
     * Get 创建者ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateUserId 创建者ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateUserId() {
        return this.CreateUserId;
    }

    /**
     * Set 创建者ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateUserId 创建者ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateUserId(Long CreateUserId) {
        this.CreateUserId = CreateUserId;
    }

    /**
     * Get 任务启动时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CronTime 任务启动时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCronTime() {
        return this.CronTime;
    }

    /**
     * Set 任务启动时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CronTime 任务启动时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCronTime(Long CronTime) {
        this.CronTime = CronTime;
    }

    /**
     * Get 固件类型 
     * @return FwType 固件类型
     */
    public String getFwType() {
        return this.FwType;
    }

    /**
     * Set 固件类型
     * @param FwType 固件类型
     */
    public void setFwType(String FwType) {
        this.FwType = FwType;
    }

    public FirmwareTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FirmwareTaskInfo(FirmwareTaskInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.CreatorNickName != null) {
            this.CreatorNickName = new String(source.CreatorNickName);
        }
        if (source.CreateUserId != null) {
            this.CreateUserId = new Long(source.CreateUserId);
        }
        if (source.CronTime != null) {
            this.CronTime = new Long(source.CronTime);
        }
        if (source.FwType != null) {
            this.FwType = new String(source.FwType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "CreatorNickName", this.CreatorNickName);
        this.setParamSimple(map, prefix + "CreateUserId", this.CreateUserId);
        this.setParamSimple(map, prefix + "CronTime", this.CronTime);
        this.setParamSimple(map, prefix + "FwType", this.FwType);

    }
}

