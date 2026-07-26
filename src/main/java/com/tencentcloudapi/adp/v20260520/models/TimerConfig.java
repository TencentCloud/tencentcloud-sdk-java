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

public class TimerConfig extends AbstractModel {

    /**
    * 推送配置
    */
    @SerializedName("PushConfig")
    @Expose
    private TimerPushConfig PushConfig;

    /**
    * 定时配置
    */
    @SerializedName("Schedule")
    @Expose
    private TimerScheduleConfig Schedule;

    /**
     * Get 推送配置 
     * @return PushConfig 推送配置
     */
    public TimerPushConfig getPushConfig() {
        return this.PushConfig;
    }

    /**
     * Set 推送配置
     * @param PushConfig 推送配置
     */
    public void setPushConfig(TimerPushConfig PushConfig) {
        this.PushConfig = PushConfig;
    }

    /**
     * Get 定时配置 
     * @return Schedule 定时配置
     */
    public TimerScheduleConfig getSchedule() {
        return this.Schedule;
    }

    /**
     * Set 定时配置
     * @param Schedule 定时配置
     */
    public void setSchedule(TimerScheduleConfig Schedule) {
        this.Schedule = Schedule;
    }

    public TimerConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimerConfig(TimerConfig source) {
        if (source.PushConfig != null) {
            this.PushConfig = new TimerPushConfig(source.PushConfig);
        }
        if (source.Schedule != null) {
            this.Schedule = new TimerScheduleConfig(source.Schedule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "PushConfig.", this.PushConfig);
        this.setParamObj(map, prefix + "Schedule.", this.Schedule);

    }
}

