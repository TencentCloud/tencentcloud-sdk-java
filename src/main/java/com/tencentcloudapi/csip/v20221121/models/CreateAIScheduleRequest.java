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

public class CreateAIScheduleRequest extends AbstractModel {

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
    * <p>触发器列表，多个触发器之间为「或」关系，满足任一即触发。</p>
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
     * Get <p>触发器列表，多个触发器之间为「或」关系，满足任一即触发。</p> 
     * @return Triggers <p>触发器列表，多个触发器之间为「或」关系，满足任一即触发。</p>
     */
    public AiScheduleTriggerInfo [] getTriggers() {
        return this.Triggers;
    }

    /**
     * Set <p>触发器列表，多个触发器之间为「或」关系，满足任一即触发。</p>
     * @param Triggers <p>触发器列表，多个触发器之间为「或」关系，满足任一即触发。</p>
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

    public CreateAIScheduleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAIScheduleRequest(CreateAIScheduleRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Prompts != null) {
            this.Prompts = new String(source.Prompts);
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
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Prompts", this.Prompts);
        this.setParamArrayObj(map, prefix + "Triggers.", this.Triggers);
        this.setParamSimple(map, prefix + "MaxFireCount", this.MaxFireCount);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

