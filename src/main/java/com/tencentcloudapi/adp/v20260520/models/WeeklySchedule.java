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

public class WeeklySchedule extends AbstractModel {

    /**
    * 定时配置（星期）
    */
    @SerializedName("Times")
    @Expose
    private WeeklyTime [] Times;

    /**
     * Get 定时配置（星期） 
     * @return Times 定时配置（星期）
     */
    public WeeklyTime [] getTimes() {
        return this.Times;
    }

    /**
     * Set 定时配置（星期）
     * @param Times 定时配置（星期）
     */
    public void setTimes(WeeklyTime [] Times) {
        this.Times = Times;
    }

    public WeeklySchedule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WeeklySchedule(WeeklySchedule source) {
        if (source.Times != null) {
            this.Times = new WeeklyTime[source.Times.length];
            for (int i = 0; i < source.Times.length; i++) {
                this.Times[i] = new WeeklyTime(source.Times[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Times.", this.Times);

    }
}

