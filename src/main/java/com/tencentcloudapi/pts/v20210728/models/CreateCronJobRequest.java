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

public class CreateCronJobRequest extends AbstractModel{

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
    * 执行频率类型，1:只执行一次; 2:日粒度; 3:周粒度; 4:高级
    */
    @SerializedName("FrequencyType")
    @Expose
    private Long FrequencyType;

    /**
    * cron表达式
    */
    @SerializedName("CronExpression")
    @Expose
    private String CronExpression;

    /**
    * 任务发起人
    */
    @SerializedName("JobOwner")
    @Expose
    private String JobOwner;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Notice ID
    */
    @SerializedName("NoticeId")
    @Expose
    private String NoticeId;

    /**
    * 备注
    */
    @SerializedName("Note")
    @Expose
    private String Note;

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
     * Get 执行频率类型，1:只执行一次; 2:日粒度; 3:周粒度; 4:高级 
     * @return FrequencyType 执行频率类型，1:只执行一次; 2:日粒度; 3:周粒度; 4:高级
     */
    public Long getFrequencyType() {
        return this.FrequencyType;
    }

    /**
     * Set 执行频率类型，1:只执行一次; 2:日粒度; 3:周粒度; 4:高级
     * @param FrequencyType 执行频率类型，1:只执行一次; 2:日粒度; 3:周粒度; 4:高级
     */
    public void setFrequencyType(Long FrequencyType) {
        this.FrequencyType = FrequencyType;
    }

    /**
     * Get cron表达式 
     * @return CronExpression cron表达式
     */
    public String getCronExpression() {
        return this.CronExpression;
    }

    /**
     * Set cron表达式
     * @param CronExpression cron表达式
     */
    public void setCronExpression(String CronExpression) {
        this.CronExpression = CronExpression;
    }

    /**
     * Get 任务发起人 
     * @return JobOwner 任务发起人
     */
    public String getJobOwner() {
        return this.JobOwner;
    }

    /**
     * Set 任务发起人
     * @param JobOwner 任务发起人
     */
    public void setJobOwner(String JobOwner) {
        this.JobOwner = JobOwner;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
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

    public CreateCronJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCronJobRequest(CreateCronJobRequest source) {
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
        if (source.FrequencyType != null) {
            this.FrequencyType = new Long(source.FrequencyType);
        }
        if (source.CronExpression != null) {
            this.CronExpression = new String(source.CronExpression);
        }
        if (source.JobOwner != null) {
            this.JobOwner = new String(source.JobOwner);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.NoticeId != null) {
            this.NoticeId = new String(source.NoticeId);
        }
        if (source.Note != null) {
            this.Note = new String(source.Note);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ScenarioId", this.ScenarioId);
        this.setParamSimple(map, prefix + "ScenarioName", this.ScenarioName);
        this.setParamSimple(map, prefix + "FrequencyType", this.FrequencyType);
        this.setParamSimple(map, prefix + "CronExpression", this.CronExpression);
        this.setParamSimple(map, prefix + "JobOwner", this.JobOwner);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "NoticeId", this.NoticeId);
        this.setParamSimple(map, prefix + "Note", this.Note);

    }
}

