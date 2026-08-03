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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppTriggerScheduleConfig extends AbstractModel {

    /**
    * <p>触发器定时配置</p>
    */
    @SerializedName("Schedule")
    @Expose
    private TimerScheduleConfig Schedule;

    /**
     * Get <p>触发器定时配置</p> 
     * @return Schedule <p>触发器定时配置</p>
     */
    public TimerScheduleConfig getSchedule() {
        return this.Schedule;
    }

    /**
     * Set <p>触发器定时配置</p>
     * @param Schedule <p>触发器定时配置</p>
     */
    public void setSchedule(TimerScheduleConfig Schedule) {
        this.Schedule = Schedule;
    }

    public AppTriggerScheduleConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppTriggerScheduleConfig(AppTriggerScheduleConfig source) {
        if (source.Schedule != null) {
            this.Schedule = new TimerScheduleConfig(source.Schedule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Schedule.", this.Schedule);

    }
}

