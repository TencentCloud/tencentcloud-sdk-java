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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiScheduleInfo extends AbstractModel {

    /**
    * <p>AI 定时任务 ID。</p>
    */
    @SerializedName("ScheduleId")
    @Expose
    private String ScheduleId;

    /**
    * <p>任务名称。最大 128 字符。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>执行提示词。最大 2048 字符。</p>
    */
    @SerializedName("Prompts")
    @Expose
    private String Prompts;

    /**
    * <p>状态。取值：1（已启用）、2（已停用）。</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>触发器</p>
    */
    @SerializedName("Triggers")
    @Expose
    private AiScheduleTriggerInfo [] Triggers;

    /**
    * <p>最大触发次数，0 表示无限制。</p>
    */
    @SerializedName("MaxFireCount")
    @Expose
    private Long MaxFireCount;

    /**
    * <p>已触发次数。</p>
    */
    @SerializedName("CurrentFireCount")
    @Expose
    private Long CurrentFireCount;

    /**
    * <p>生效开始时间，Unix 毫秒时间戳，0 表示立即生效。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>生效结束时间，Unix 毫秒时间戳，0 表示永不过期。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>创建时间，Unix 毫秒时间戳。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>更新时间，Unix 毫秒时间戳。</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * <p>身份信息</p>
    */
    @SerializedName("Identity")
    @Expose
    private AIScheduleUserIdentity Identity;

    /**
     * Get <p>AI 定时任务 ID。</p> 
     * @return ScheduleId <p>AI 定时任务 ID。</p>
     */
    public String getScheduleId() {
        return this.ScheduleId;
    }

    /**
     * Set <p>AI 定时任务 ID。</p>
     * @param ScheduleId <p>AI 定时任务 ID。</p>
     */
    public void setScheduleId(String ScheduleId) {
        this.ScheduleId = ScheduleId;
    }

    /**
     * Get <p>任务名称。最大 128 字符。</p> 
     * @return Name <p>任务名称。最大 128 字符。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>任务名称。最大 128 字符。</p>
     * @param Name <p>任务名称。最大 128 字符。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>执行提示词。最大 2048 字符。</p> 
     * @return Prompts <p>执行提示词。最大 2048 字符。</p>
     */
    public String getPrompts() {
        return this.Prompts;
    }

    /**
     * Set <p>执行提示词。最大 2048 字符。</p>
     * @param Prompts <p>执行提示词。最大 2048 字符。</p>
     */
    public void setPrompts(String Prompts) {
        this.Prompts = Prompts;
    }

    /**
     * Get <p>状态。取值：1（已启用）、2（已停用）。</p> 
     * @return Status <p>状态。取值：1（已启用）、2（已停用）。</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态。取值：1（已启用）、2（已停用）。</p>
     * @param Status <p>状态。取值：1（已启用）、2（已停用）。</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>触发器</p> 
     * @return Triggers <p>触发器</p>
     */
    public AiScheduleTriggerInfo [] getTriggers() {
        return this.Triggers;
    }

    /**
     * Set <p>触发器</p>
     * @param Triggers <p>触发器</p>
     */
    public void setTriggers(AiScheduleTriggerInfo [] Triggers) {
        this.Triggers = Triggers;
    }

    /**
     * Get <p>最大触发次数，0 表示无限制。</p> 
     * @return MaxFireCount <p>最大触发次数，0 表示无限制。</p>
     */
    public Long getMaxFireCount() {
        return this.MaxFireCount;
    }

    /**
     * Set <p>最大触发次数，0 表示无限制。</p>
     * @param MaxFireCount <p>最大触发次数，0 表示无限制。</p>
     */
    public void setMaxFireCount(Long MaxFireCount) {
        this.MaxFireCount = MaxFireCount;
    }

    /**
     * Get <p>已触发次数。</p> 
     * @return CurrentFireCount <p>已触发次数。</p>
     */
    public Long getCurrentFireCount() {
        return this.CurrentFireCount;
    }

    /**
     * Set <p>已触发次数。</p>
     * @param CurrentFireCount <p>已触发次数。</p>
     */
    public void setCurrentFireCount(Long CurrentFireCount) {
        this.CurrentFireCount = CurrentFireCount;
    }

    /**
     * Get <p>生效开始时间，Unix 毫秒时间戳，0 表示立即生效。</p> 
     * @return StartTime <p>生效开始时间，Unix 毫秒时间戳，0 表示立即生效。</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>生效开始时间，Unix 毫秒时间戳，0 表示立即生效。</p>
     * @param StartTime <p>生效开始时间，Unix 毫秒时间戳，0 表示立即生效。</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>生效结束时间，Unix 毫秒时间戳，0 表示永不过期。</p> 
     * @return EndTime <p>生效结束时间，Unix 毫秒时间戳，0 表示永不过期。</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>生效结束时间，Unix 毫秒时间戳，0 表示永不过期。</p>
     * @param EndTime <p>生效结束时间，Unix 毫秒时间戳，0 表示永不过期。</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>创建时间，Unix 毫秒时间戳。</p> 
     * @return CreateTime <p>创建时间，Unix 毫秒时间戳。</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间，Unix 毫秒时间戳。</p>
     * @param CreateTime <p>创建时间，Unix 毫秒时间戳。</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间，Unix 毫秒时间戳。</p> 
     * @return UpdateTime <p>更新时间，Unix 毫秒时间戳。</p>
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间，Unix 毫秒时间戳。</p>
     * @param UpdateTime <p>更新时间，Unix 毫秒时间戳。</p>
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>身份信息</p> 
     * @return Identity <p>身份信息</p>
     */
    public AIScheduleUserIdentity getIdentity() {
        return this.Identity;
    }

    /**
     * Set <p>身份信息</p>
     * @param Identity <p>身份信息</p>
     */
    public void setIdentity(AIScheduleUserIdentity Identity) {
        this.Identity = Identity;
    }

    public AiScheduleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiScheduleInfo(AiScheduleInfo source) {
        if (source.ScheduleId != null) {
            this.ScheduleId = new String(source.ScheduleId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Prompts != null) {
            this.Prompts = new String(source.Prompts);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Triggers != null) {
            this.Triggers = new AiScheduleTriggerInfo[source.Triggers.length];
            for (int i = 0; i < source.Triggers.length; i++) {
                this.Triggers[i] = new AiScheduleTriggerInfo(source.Triggers[i]);
            }
        }
        if (source.MaxFireCount != null) {
            this.MaxFireCount = new Long(source.MaxFireCount);
        }
        if (source.CurrentFireCount != null) {
            this.CurrentFireCount = new Long(source.CurrentFireCount);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.Identity != null) {
            this.Identity = new AIScheduleUserIdentity(source.Identity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScheduleId", this.ScheduleId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Prompts", this.Prompts);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Triggers.", this.Triggers);
        this.setParamSimple(map, prefix + "MaxFireCount", this.MaxFireCount);
        this.setParamSimple(map, prefix + "CurrentFireCount", this.CurrentFireCount);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamObj(map, prefix + "Identity.", this.Identity);

    }
}

