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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePredictiveDialingCampaignsElement extends AbstractModel {

    /**
    * 任务 ID
    */
    @SerializedName("CampaignId")
    @Expose
    private Long CampaignId;

    /**
    * 任务名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 任务状态 0 待开始 1 进行中 2 已暂停 3 已终止 4 已完成
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 任务状态原因 0 正常 1 手动结束 2 超时结束
    */
    @SerializedName("StatusReason")
    @Expose
    private Long StatusReason;

    /**
    * 被叫号码个数
    */
    @SerializedName("CalleeCount")
    @Expose
    private Long CalleeCount;

    /**
    * 已完成的被叫个数
    */
    @SerializedName("FinishedCalleeCount")
    @Expose
    private Long FinishedCalleeCount;

    /**
    * 相同应用内多个任务运行优先级，从高到底 1 - 5
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * 使用的座席技能组 ID
    */
    @SerializedName("SkillGroupId")
    @Expose
    private Long SkillGroupId;

    /**
     * Get 任务 ID 
     * @return CampaignId 任务 ID
     */
    public Long getCampaignId() {
        return this.CampaignId;
    }

    /**
     * Set 任务 ID
     * @param CampaignId 任务 ID
     */
    public void setCampaignId(Long CampaignId) {
        this.CampaignId = CampaignId;
    }

    /**
     * Get 任务名称 
     * @return Name 任务名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 任务名称
     * @param Name 任务名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 任务状态 0 待开始 1 进行中 2 已暂停 3 已终止 4 已完成 
     * @return Status 任务状态 0 待开始 1 进行中 2 已暂停 3 已终止 4 已完成
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态 0 待开始 1 进行中 2 已暂停 3 已终止 4 已完成
     * @param Status 任务状态 0 待开始 1 进行中 2 已暂停 3 已终止 4 已完成
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 任务状态原因 0 正常 1 手动结束 2 超时结束 
     * @return StatusReason 任务状态原因 0 正常 1 手动结束 2 超时结束
     */
    public Long getStatusReason() {
        return this.StatusReason;
    }

    /**
     * Set 任务状态原因 0 正常 1 手动结束 2 超时结束
     * @param StatusReason 任务状态原因 0 正常 1 手动结束 2 超时结束
     */
    public void setStatusReason(Long StatusReason) {
        this.StatusReason = StatusReason;
    }

    /**
     * Get 被叫号码个数 
     * @return CalleeCount 被叫号码个数
     */
    public Long getCalleeCount() {
        return this.CalleeCount;
    }

    /**
     * Set 被叫号码个数
     * @param CalleeCount 被叫号码个数
     */
    public void setCalleeCount(Long CalleeCount) {
        this.CalleeCount = CalleeCount;
    }

    /**
     * Get 已完成的被叫个数 
     * @return FinishedCalleeCount 已完成的被叫个数
     */
    public Long getFinishedCalleeCount() {
        return this.FinishedCalleeCount;
    }

    /**
     * Set 已完成的被叫个数
     * @param FinishedCalleeCount 已完成的被叫个数
     */
    public void setFinishedCalleeCount(Long FinishedCalleeCount) {
        this.FinishedCalleeCount = FinishedCalleeCount;
    }

    /**
     * Get 相同应用内多个任务运行优先级，从高到底 1 - 5 
     * @return Priority 相同应用内多个任务运行优先级，从高到底 1 - 5
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 相同应用内多个任务运行优先级，从高到底 1 - 5
     * @param Priority 相同应用内多个任务运行优先级，从高到底 1 - 5
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 使用的座席技能组 ID 
     * @return SkillGroupId 使用的座席技能组 ID
     */
    public Long getSkillGroupId() {
        return this.SkillGroupId;
    }

    /**
     * Set 使用的座席技能组 ID
     * @param SkillGroupId 使用的座席技能组 ID
     */
    public void setSkillGroupId(Long SkillGroupId) {
        this.SkillGroupId = SkillGroupId;
    }

    public DescribePredictiveDialingCampaignsElement() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePredictiveDialingCampaignsElement(DescribePredictiveDialingCampaignsElement source) {
        if (source.CampaignId != null) {
            this.CampaignId = new Long(source.CampaignId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StatusReason != null) {
            this.StatusReason = new Long(source.StatusReason);
        }
        if (source.CalleeCount != null) {
            this.CalleeCount = new Long(source.CalleeCount);
        }
        if (source.FinishedCalleeCount != null) {
            this.FinishedCalleeCount = new Long(source.FinishedCalleeCount);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.SkillGroupId != null) {
            this.SkillGroupId = new Long(source.SkillGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CampaignId", this.CampaignId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusReason", this.StatusReason);
        this.setParamSimple(map, prefix + "CalleeCount", this.CalleeCount);
        this.setParamSimple(map, prefix + "FinishedCalleeCount", this.FinishedCalleeCount);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "SkillGroupId", this.SkillGroupId);

    }
}

