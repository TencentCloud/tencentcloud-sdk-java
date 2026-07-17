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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InferenceScheduledScalingPolicy extends AbstractModel {

    /**
    * 定时伸缩动作列表。至少填写 1 个，最多支持 10 个。
    */
    @SerializedName("ScheduledActions")
    @Expose
    private InferenceScheduledScalingAction [] ScheduledActions;

    /**
    * 有效期范围，用于描述该定时伸缩策略长期有效或仅在指定日期范围内有效。
    */
    @SerializedName("EffectiveRange")
    @Expose
    private InferenceScheduledScalingEffectiveRange EffectiveRange;

    /**
    * 时区，使用 [IANA 时区](https://www.iana.org/time-zones) 标识 ScheduledActions 中的触发时间，例如 UTC、Asia/Shanghai、America/New_York、Europe/London、Asia/Kolkata。不传时默认使用 UTC。





    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
     * Get 定时伸缩动作列表。至少填写 1 个，最多支持 10 个。 
     * @return ScheduledActions 定时伸缩动作列表。至少填写 1 个，最多支持 10 个。
     */
    public InferenceScheduledScalingAction [] getScheduledActions() {
        return this.ScheduledActions;
    }

    /**
     * Set 定时伸缩动作列表。至少填写 1 个，最多支持 10 个。
     * @param ScheduledActions 定时伸缩动作列表。至少填写 1 个，最多支持 10 个。
     */
    public void setScheduledActions(InferenceScheduledScalingAction [] ScheduledActions) {
        this.ScheduledActions = ScheduledActions;
    }

    /**
     * Get 有效期范围，用于描述该定时伸缩策略长期有效或仅在指定日期范围内有效。 
     * @return EffectiveRange 有效期范围，用于描述该定时伸缩策略长期有效或仅在指定日期范围内有效。
     */
    public InferenceScheduledScalingEffectiveRange getEffectiveRange() {
        return this.EffectiveRange;
    }

    /**
     * Set 有效期范围，用于描述该定时伸缩策略长期有效或仅在指定日期范围内有效。
     * @param EffectiveRange 有效期范围，用于描述该定时伸缩策略长期有效或仅在指定日期范围内有效。
     */
    public void setEffectiveRange(InferenceScheduledScalingEffectiveRange EffectiveRange) {
        this.EffectiveRange = EffectiveRange;
    }

    /**
     * Get 时区，使用 [IANA 时区](https://www.iana.org/time-zones) 标识 ScheduledActions 中的触发时间，例如 UTC、Asia/Shanghai、America/New_York、Europe/London、Asia/Kolkata。不传时默认使用 UTC。




 
     * @return TimeZone 时区，使用 [IANA 时区](https://www.iana.org/time-zones) 标识 ScheduledActions 中的触发时间，例如 UTC、Asia/Shanghai、America/New_York、Europe/London、Asia/Kolkata。不传时默认使用 UTC。





     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set 时区，使用 [IANA 时区](https://www.iana.org/time-zones) 标识 ScheduledActions 中的触发时间，例如 UTC、Asia/Shanghai、America/New_York、Europe/London、Asia/Kolkata。不传时默认使用 UTC。





     * @param TimeZone 时区，使用 [IANA 时区](https://www.iana.org/time-zones) 标识 ScheduledActions 中的触发时间，例如 UTC、Asia/Shanghai、America/New_York、Europe/London、Asia/Kolkata。不传时默认使用 UTC。





     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    public InferenceScheduledScalingPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InferenceScheduledScalingPolicy(InferenceScheduledScalingPolicy source) {
        if (source.ScheduledActions != null) {
            this.ScheduledActions = new InferenceScheduledScalingAction[source.ScheduledActions.length];
            for (int i = 0; i < source.ScheduledActions.length; i++) {
                this.ScheduledActions[i] = new InferenceScheduledScalingAction(source.ScheduledActions[i]);
            }
        }
        if (source.EffectiveRange != null) {
            this.EffectiveRange = new InferenceScheduledScalingEffectiveRange(source.EffectiveRange);
        }
        if (source.TimeZone != null) {
            this.TimeZone = new String(source.TimeZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ScheduledActions.", this.ScheduledActions);
        this.setParamObj(map, prefix + "EffectiveRange.", this.EffectiveRange);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);

    }
}

