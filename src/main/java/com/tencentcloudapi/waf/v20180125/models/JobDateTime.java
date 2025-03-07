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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JobDateTime extends AbstractModel {

    /**
    * 定时执行的时间参数
    */
    @SerializedName("Timed")
    @Expose
    private TimedJob [] Timed;

    /**
    * 周期执行的时间参数
    */
    @SerializedName("Cron")
    @Expose
    private CronJob [] Cron;

    /**
    * 时区
    */
    @SerializedName("TimeTZone")
    @Expose
    private String TimeTZone;

    /**
     * Get 定时执行的时间参数 
     * @return Timed 定时执行的时间参数
     */
    public TimedJob [] getTimed() {
        return this.Timed;
    }

    /**
     * Set 定时执行的时间参数
     * @param Timed 定时执行的时间参数
     */
    public void setTimed(TimedJob [] Timed) {
        this.Timed = Timed;
    }

    /**
     * Get 周期执行的时间参数 
     * @return Cron 周期执行的时间参数
     */
    public CronJob [] getCron() {
        return this.Cron;
    }

    /**
     * Set 周期执行的时间参数
     * @param Cron 周期执行的时间参数
     */
    public void setCron(CronJob [] Cron) {
        this.Cron = Cron;
    }

    /**
     * Get 时区 
     * @return TimeTZone 时区
     */
    public String getTimeTZone() {
        return this.TimeTZone;
    }

    /**
     * Set 时区
     * @param TimeTZone 时区
     */
    public void setTimeTZone(String TimeTZone) {
        this.TimeTZone = TimeTZone;
    }

    public JobDateTime() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JobDateTime(JobDateTime source) {
        if (source.Timed != null) {
            this.Timed = new TimedJob[source.Timed.length];
            for (int i = 0; i < source.Timed.length; i++) {
                this.Timed[i] = new TimedJob(source.Timed[i]);
            }
        }
        if (source.Cron != null) {
            this.Cron = new CronJob[source.Cron.length];
            for (int i = 0; i < source.Cron.length; i++) {
                this.Cron[i] = new CronJob(source.Cron[i]);
            }
        }
        if (source.TimeTZone != null) {
            this.TimeTZone = new String(source.TimeTZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Timed.", this.Timed);
        this.setParamArrayObj(map, prefix + "Cron.", this.Cron);
        this.setParamSimple(map, prefix + "TimeTZone", this.TimeTZone);

    }
}

