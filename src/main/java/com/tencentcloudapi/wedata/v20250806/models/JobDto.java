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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JobDto extends AbstractModel {

    /**
    * 数据探索任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 数据探索任务名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * 任务类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobType")
    @Expose
    private String JobType;

    /**
    * 脚本ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScriptId")
    @Expose
    private String ScriptId;

    /**
    * 子任务列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobExecutionList")
    @Expose
    private JobExecutionDto [] JobExecutionList;

    /**
    * 脚本内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScriptContent")
    @Expose
    private String ScriptContent;

    /**
    * 任务状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 任务创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 云主账号UIN
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 账号UIN
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserUin")
    @Expose
    private String UserUin;

    /**
    * 耗时
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeCost")
    @Expose
    private Long TimeCost;

    /**
    * 是否脚本内容被截断
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScriptContentTruncate")
    @Expose
    private Boolean ScriptContentTruncate;

    /**
     * Get 数据探索任务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobId 数据探索任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 数据探索任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobId 数据探索任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 数据探索任务名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobName 数据探索任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set 数据探索任务名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobName 数据探索任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get 任务类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobType 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJobType() {
        return this.JobType;
    }

    /**
     * Set 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobType 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobType(String JobType) {
        this.JobType = JobType;
    }

    /**
     * Get 脚本ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScriptId 脚本ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScriptId() {
        return this.ScriptId;
    }

    /**
     * Set 脚本ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScriptId 脚本ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScriptId(String ScriptId) {
        this.ScriptId = ScriptId;
    }

    /**
     * Get 子任务列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobExecutionList 子任务列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public JobExecutionDto [] getJobExecutionList() {
        return this.JobExecutionList;
    }

    /**
     * Set 子任务列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobExecutionList 子任务列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobExecutionList(JobExecutionDto [] JobExecutionList) {
        this.JobExecutionList = JobExecutionList;
    }

    /**
     * Get 脚本内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScriptContent 脚本内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScriptContent() {
        return this.ScriptContent;
    }

    /**
     * Set 脚本内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScriptContent 脚本内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScriptContent(String ScriptContent) {
        this.ScriptContent = ScriptContent;
    }

    /**
     * Get 任务状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 任务状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 任务状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 任务创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 任务创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 任务创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 任务创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
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
     * Get 云主账号UIN
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerUin 云主账号UIN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 云主账号UIN
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerUin 云主账号UIN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 账号UIN
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserUin 账号UIN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserUin() {
        return this.UserUin;
    }

    /**
     * Set 账号UIN
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserUin 账号UIN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserUin(String UserUin) {
        this.UserUin = UserUin;
    }

    /**
     * Get 耗时
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeCost 耗时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimeCost() {
        return this.TimeCost;
    }

    /**
     * Set 耗时
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeCost 耗时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeCost(Long TimeCost) {
        this.TimeCost = TimeCost;
    }

    /**
     * Get 是否脚本内容被截断
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScriptContentTruncate 是否脚本内容被截断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getScriptContentTruncate() {
        return this.ScriptContentTruncate;
    }

    /**
     * Set 是否脚本内容被截断
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScriptContentTruncate 是否脚本内容被截断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScriptContentTruncate(Boolean ScriptContentTruncate) {
        this.ScriptContentTruncate = ScriptContentTruncate;
    }

    public JobDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JobDto(JobDto source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.JobName != null) {
            this.JobName = new String(source.JobName);
        }
        if (source.JobType != null) {
            this.JobType = new String(source.JobType);
        }
        if (source.ScriptId != null) {
            this.ScriptId = new String(source.ScriptId);
        }
        if (source.JobExecutionList != null) {
            this.JobExecutionList = new JobExecutionDto[source.JobExecutionList.length];
            for (int i = 0; i < source.JobExecutionList.length; i++) {
                this.JobExecutionList[i] = new JobExecutionDto(source.JobExecutionList[i]);
            }
        }
        if (source.ScriptContent != null) {
            this.ScriptContent = new String(source.ScriptContent);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.UserUin != null) {
            this.UserUin = new String(source.UserUin);
        }
        if (source.TimeCost != null) {
            this.TimeCost = new Long(source.TimeCost);
        }
        if (source.ScriptContentTruncate != null) {
            this.ScriptContentTruncate = new Boolean(source.ScriptContentTruncate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamSimple(map, prefix + "JobType", this.JobType);
        this.setParamSimple(map, prefix + "ScriptId", this.ScriptId);
        this.setParamArrayObj(map, prefix + "JobExecutionList.", this.JobExecutionList);
        this.setParamSimple(map, prefix + "ScriptContent", this.ScriptContent);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "UserUin", this.UserUin);
        this.setParamSimple(map, prefix + "TimeCost", this.TimeCost);
        this.setParamSimple(map, prefix + "ScriptContentTruncate", this.ScriptContentTruncate);

    }
}

