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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScheduledAction extends AbstractModel{

    /**
    * 是否要定时停止服务，true or false。true 则 ScheduleStopTime 必填， false 则 ScheduleStopTime 不生效
    */
    @SerializedName("ScheduleStop")
    @Expose
    private Boolean ScheduleStop;

    /**
    * 要执行定时停止的时间，格式：“2022-01-26T19:46:22+08:00”
    */
    @SerializedName("ScheduleStopTime")
    @Expose
    private String ScheduleStopTime;

    /**
     * Get 是否要定时停止服务，true or false。true 则 ScheduleStopTime 必填， false 则 ScheduleStopTime 不生效 
     * @return ScheduleStop 是否要定时停止服务，true or false。true 则 ScheduleStopTime 必填， false 则 ScheduleStopTime 不生效
     */
    public Boolean getScheduleStop() {
        return this.ScheduleStop;
    }

    /**
     * Set 是否要定时停止服务，true or false。true 则 ScheduleStopTime 必填， false 则 ScheduleStopTime 不生效
     * @param ScheduleStop 是否要定时停止服务，true or false。true 则 ScheduleStopTime 必填， false 则 ScheduleStopTime 不生效
     */
    public void setScheduleStop(Boolean ScheduleStop) {
        this.ScheduleStop = ScheduleStop;
    }

    /**
     * Get 要执行定时停止的时间，格式：“2022-01-26T19:46:22+08:00” 
     * @return ScheduleStopTime 要执行定时停止的时间，格式：“2022-01-26T19:46:22+08:00”
     */
    public String getScheduleStopTime() {
        return this.ScheduleStopTime;
    }

    /**
     * Set 要执行定时停止的时间，格式：“2022-01-26T19:46:22+08:00”
     * @param ScheduleStopTime 要执行定时停止的时间，格式：“2022-01-26T19:46:22+08:00”
     */
    public void setScheduleStopTime(String ScheduleStopTime) {
        this.ScheduleStopTime = ScheduleStopTime;
    }

    public ScheduledAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScheduledAction(ScheduledAction source) {
        if (source.ScheduleStop != null) {
            this.ScheduleStop = new Boolean(source.ScheduleStop);
        }
        if (source.ScheduleStopTime != null) {
            this.ScheduleStopTime = new String(source.ScheduleStopTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScheduleStop", this.ScheduleStop);
        this.setParamSimple(map, prefix + "ScheduleStopTime", this.ScheduleStopTime);

    }
}

