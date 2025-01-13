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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CronJob extends AbstractModel {

    /**
    * 定时任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CronJobId")
    @Expose
    private String CronJobId;

    /**
    * 定时任务名字
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 场景ID
    */
    @SerializedName("ScenarioId")
    @Expose
    private String ScenarioId;

    /**
    * 场景名称
    */
    @SerializedName("ScenarioName")
    @Expose
    private String ScenarioName;

    /**
    * cron 表达式
    */
    @SerializedName("CronExpression")
    @Expose
    private String CronExpression;

    /**
    * 结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 中止原因
    */
    @SerializedName("AbortReason")
    @Expose
    private Long AbortReason;

    /**
    * 定时任务状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Notice ID
    */
    @SerializedName("NoticeId")
    @Expose
    private String NoticeId;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * 执行频率类型
    */
    @SerializedName("FrequencyType")
    @Expose
    private Long FrequencyType;

    /**
    * 备注
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * tom
    */
    @SerializedName("JobOwner")
    @Expose
    private String JobOwner;

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
     * Get 定时任务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CronJobId 定时任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCronJobId() {
        return this.CronJobId;
    }

    /**
     * Set 定时任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param CronJobId 定时任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCronJobId(String CronJobId) {
        this.CronJobId = CronJobId;
    }

    /**
     * Get 定时任务名字 
     * @return Name 定时任务名字
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 定时任务名字
     * @param Name 定时任务名字
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 场景ID 
     * @return ScenarioId 场景ID
     */
    public String getScenarioId() {
        return this.ScenarioId;
    }

    /**
     * Set 场景ID
     * @param ScenarioId 场景ID
     */
    public void setScenarioId(String ScenarioId) {
        this.ScenarioId = ScenarioId;
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
     * Get cron 表达式 
     * @return CronExpression cron 表达式
     */
    public String getCronExpression() {
        return this.CronExpression;
    }

    /**
     * Set cron 表达式
     * @param CronExpression cron 表达式
     */
    public void setCronExpression(String CronExpression) {
        this.CronExpression = CronExpression;
    }

    /**
     * Get 结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 中止原因 
     * @return AbortReason 中止原因
     */
    public Long getAbortReason() {
        return this.AbortReason;
    }

    /**
     * Set 中止原因
     * @param AbortReason 中止原因
     */
    public void setAbortReason(Long AbortReason) {
        this.AbortReason = AbortReason;
    }

    /**
     * Get 定时任务状态 
     * @return Status 定时任务状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 定时任务状态
     * @param Status 定时任务状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Notice ID 
     * @return NoticeId Notice ID
     */
    public String getNoticeId() {
        return this.NoticeId;
    }

    /**
     * Set Notice ID
     * @param NoticeId Notice ID
     */
    public void setNoticeId(String NoticeId) {
        this.NoticeId = NoticeId;
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
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedAt 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedAt 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get 执行频率类型 
     * @return FrequencyType 执行频率类型
     */
    public Long getFrequencyType() {
        return this.FrequencyType;
    }

    /**
     * Set 执行频率类型
     * @param FrequencyType 执行频率类型
     */
    public void setFrequencyType(Long FrequencyType) {
        this.FrequencyType = FrequencyType;
    }

    /**
     * Get 备注 
     * @return Note 备注
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set 备注
     * @param Note 备注
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * Get tom 
     * @return JobOwner tom
     */
    public String getJobOwner() {
        return this.JobOwner;
    }

    /**
     * Set tom
     * @param JobOwner tom
     */
    public void setJobOwner(String JobOwner) {
        this.JobOwner = JobOwner;
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

    public CronJob() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CronJob(CronJob source) {
        if (source.CronJobId != null) {
            this.CronJobId = new String(source.CronJobId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ScenarioId != null) {
            this.ScenarioId = new String(source.ScenarioId);
        }
        if (source.ScenarioName != null) {
            this.ScenarioName = new String(source.ScenarioName);
        }
        if (source.CronExpression != null) {
            this.CronExpression = new String(source.CronExpression);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.AbortReason != null) {
            this.AbortReason = new Long(source.AbortReason);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.NoticeId != null) {
            this.NoticeId = new String(source.NoticeId);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.FrequencyType != null) {
            this.FrequencyType = new Long(source.FrequencyType);
        }
        if (source.Note != null) {
            this.Note = new String(source.Note);
        }
        if (source.JobOwner != null) {
            this.JobOwner = new String(source.JobOwner);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CronJobId", this.CronJobId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ScenarioId", this.ScenarioId);
        this.setParamSimple(map, prefix + "ScenarioName", this.ScenarioName);
        this.setParamSimple(map, prefix + "CronExpression", this.CronExpression);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "AbortReason", this.AbortReason);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "NoticeId", this.NoticeId);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "FrequencyType", this.FrequencyType);
        this.setParamSimple(map, prefix + "Note", this.Note);
        this.setParamSimple(map, prefix + "JobOwner", this.JobOwner);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);

    }
}

