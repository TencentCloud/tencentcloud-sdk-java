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
package com.tencentcloudapi.ams.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskData extends AbstractModel{

    /**
    * 输入的数据ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataId")
    @Expose
    private String DataId;

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 状态，可选：PENDING，RUNNING，ERROR，FINISH，CANCELLED
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 任务名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 业务类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BizType")
    @Expose
    private String BizType;

    /**
    * 任务类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 建议。可选：Pass，Block，Review
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 输入信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MediaInfo")
    @Expose
    private MediaInfo MediaInfo;

    /**
    * 任务违规标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Labels")
    @Expose
    private TaskLabel [] Labels;

    /**
    * 创建时间（ iso 8601 格式）
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 更新时间（ iso 8601 格式）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
     * Get 输入的数据ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataId 输入的数据ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataId() {
        return this.DataId;
    }

    /**
     * Set 输入的数据ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataId 输入的数据ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataId(String DataId) {
        this.DataId = DataId;
    }

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
     * Get 状态，可选：PENDING，RUNNING，ERROR，FINISH，CANCELLED 
     * @return Status 状态，可选：PENDING，RUNNING，ERROR，FINISH，CANCELLED
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态，可选：PENDING，RUNNING，ERROR，FINISH，CANCELLED
     * @param Status 状态，可选：PENDING，RUNNING，ERROR，FINISH，CANCELLED
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 任务名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 业务类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BizType 业务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set 业务类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param BizType 业务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBizType(String BizType) {
        this.BizType = BizType;
    }

    /**
     * Get 任务类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 建议。可选：Pass，Block，Review
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Suggestion 建议。可选：Pass，Block，Review
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 建议。可选：Pass，Block，Review
注意：此字段可能返回 null，表示取不到有效值。
     * @param Suggestion 建议。可选：Pass，Block，Review
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get 输入信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MediaInfo 输入信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaInfo getMediaInfo() {
        return this.MediaInfo;
    }

    /**
     * Set 输入信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param MediaInfo 输入信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMediaInfo(MediaInfo MediaInfo) {
        this.MediaInfo = MediaInfo;
    }

    /**
     * Get 任务违规标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Labels 任务违规标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskLabel [] getLabels() {
        return this.Labels;
    }

    /**
     * Set 任务违规标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Labels 任务违规标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabels(TaskLabel [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get 创建时间（ iso 8601 格式） 
     * @return CreatedAt 创建时间（ iso 8601 格式）
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 创建时间（ iso 8601 格式）
     * @param CreatedAt 创建时间（ iso 8601 格式）
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 更新时间（ iso 8601 格式）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedAt 更新时间（ iso 8601 格式）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 更新时间（ iso 8601 格式）
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedAt 更新时间（ iso 8601 格式）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataId", this.DataId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamObj(map, prefix + "MediaInfo.", this.MediaInfo);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);

    }
}

