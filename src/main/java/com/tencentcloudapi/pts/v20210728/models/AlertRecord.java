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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlertRecord extends AbstractModel {

    /**
    * 告警历史记录项 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlertRecordId")
    @Expose
    private String AlertRecordId;

    /**
    * 项目 ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 场景 ID
    */
    @SerializedName("ScenarioId")
    @Expose
    private String ScenarioId;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private AlertRecordStatus Status;

    /**
    * 创建时间
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 修改时间
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * 任务 ID
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * App ID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 主账号
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 子账号
    */
    @SerializedName("SubAccountUin")
    @Expose
    private String SubAccountUin;

    /**
    * 场景名称
    */
    @SerializedName("ScenarioName")
    @Expose
    private String ScenarioName;

    /**
    * 告警对象
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * 告警规则 ID
    */
    @SerializedName("JobSLAId")
    @Expose
    private String JobSLAId;

    /**
    * 告警规则描述
    */
    @SerializedName("JobSLADescription")
    @Expose
    private String JobSLADescription;

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
     * @return ProjectId 项目 ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目 ID
     * @param ProjectId 项目 ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 场景 ID 
     * @return ScenarioId 场景 ID
     */
    public String getScenarioId() {
        return this.ScenarioId;
    }

    /**
     * Set 场景 ID
     * @param ScenarioId 场景 ID
     */
    public void setScenarioId(String ScenarioId) {
        this.ScenarioId = ScenarioId;
    }

    /**
     * Get 状态 
     * @return Status 状态
     */
    public AlertRecordStatus getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(AlertRecordStatus Status) {
        this.Status = Status;
    }

    /**
     * Get 创建时间 
     * @return CreatedAt 创建时间
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 创建时间
     * @param CreatedAt 创建时间
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 修改时间 
     * @return UpdatedAt 修改时间
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 修改时间
     * @param UpdatedAt 修改时间
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get 任务 ID 
     * @return JobId 任务 ID
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 任务 ID
     * @param JobId 任务 ID
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get App ID 
     * @return AppId App ID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set App ID
     * @param AppId App ID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 主账号 
     * @return Uin 主账号
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 主账号
     * @param Uin 主账号
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 子账号 
     * @return SubAccountUin 子账号
     */
    public String getSubAccountUin() {
        return this.SubAccountUin;
    }

    /**
     * Set 子账号
     * @param SubAccountUin 子账号
     */
    public void setSubAccountUin(String SubAccountUin) {
        this.SubAccountUin = SubAccountUin;
    }

    /**
     * Get 场景名称 
     * @return ScenarioName 场景名称
     */
    public String getScenarioName() {
        return this.ScenarioName;
    }

    /**
     * Set 场景名称
     * @param ScenarioName 场景名称
     */
    public void setScenarioName(String ScenarioName) {
        this.ScenarioName = ScenarioName;
    }

    /**
     * Get 告警对象 
     * @return Target 告警对象
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set 告警对象
     * @param Target 告警对象
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get 告警规则 ID 
     * @return JobSLAId 告警规则 ID
     */
    public String getJobSLAId() {
        return this.JobSLAId;
    }

    /**
     * Set 告警规则 ID
     * @param JobSLAId 告警规则 ID
     */
    public void setJobSLAId(String JobSLAId) {
        this.JobSLAId = JobSLAId;
    }

    /**
     * Get 告警规则描述 
     * @return JobSLADescription 告警规则描述
     */
    public String getJobSLADescription() {
        return this.JobSLADescription;
    }

    /**
     * Set 告警规则描述
     * @param JobSLADescription 告警规则描述
     */
    public void setJobSLADescription(String JobSLADescription) {
        this.JobSLADescription = JobSLADescription;
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
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.SubAccountUin != null) {
            this.SubAccountUin = new String(source.SubAccountUin);
        }
        if (source.ScenarioName != null) {
            this.ScenarioName = new String(source.ScenarioName);
        }
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
        if (source.JobSLAId != null) {
            this.JobSLAId = new String(source.JobSLAId);
        }
        if (source.JobSLADescription != null) {
            this.JobSLADescription = new String(source.JobSLADescription);
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
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);
        this.setParamSimple(map, prefix + "ScenarioName", this.ScenarioName);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "JobSLAId", this.JobSLAId);
        this.setParamSimple(map, prefix + "JobSLADescription", this.JobSLADescription);

    }
}

