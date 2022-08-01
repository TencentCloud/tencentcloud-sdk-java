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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlertRecord extends AbstractModel{

    /**
    * 告警历史记录项 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlertRecordId")
    @Expose
    private String AlertRecordId;

    /**
    * 项目 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 场景 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScenarioId")
    @Expose
    private String ScenarioId;

    /**
    * 状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private AlertRecordStatus Status;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 修改时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * 任务 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
     * Get 告警历史记录项 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlertRecordId 告警历史记录项 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlertRecordId() {
        return this.AlertRecordId;
    }

    /**
     * Set 告警历史记录项 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlertRecordId 告警历史记录项 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlertRecordId(String AlertRecordId) {
        this.AlertRecordId = AlertRecordId;
    }

    /**
     * Get 项目 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 项目 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 项目 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 场景 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScenarioId 场景 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScenarioId() {
        return this.ScenarioId;
    }

    /**
     * Set 场景 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScenarioId 场景 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScenarioId(String ScenarioId) {
        this.ScenarioId = ScenarioId;
    }

    /**
     * Get 状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AlertRecordStatus getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(AlertRecordStatus Status) {
        this.Status = Status;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedAt 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedAt 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 修改时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedAt 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedAt 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get 任务 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobId 任务 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 任务 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobId 任务 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    public AlertRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlertRecord(AlertRecord source) {
        if (source.AlertRecordId != null) {
            this.AlertRecordId = new String(source.AlertRecordId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ScenarioId != null) {
            this.ScenarioId = new String(source.ScenarioId);
        }
        if (source.Status != null) {
            this.Status = new AlertRecordStatus(source.Status);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlertRecordId", this.AlertRecordId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ScenarioId", this.ScenarioId);
        this.setParamObj(map, prefix + "Status.", this.Status);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "JobId", this.JobId);

    }
}

