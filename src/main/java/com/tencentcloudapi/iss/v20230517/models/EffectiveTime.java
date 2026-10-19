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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EffectiveTime extends AbstractModel {

    /**
    * <p>开始时间</p><p>参数格式：hh:mm:ss</p>
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * <p>结束时间</p><p>参数格式：hh:mm:ss</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>重复周期： 1-周一 2-周二 3-周三 4-周四 5-周五 6-周六 7-周日</p><p>取值范围：[1, 7]</p>
    */
    @SerializedName("WeekDay")
    @Expose
    private Long WeekDay;

    /**
     * Get <p>开始时间</p><p>参数格式：hh:mm:ss</p> 
     * @return BeginTime <p>开始时间</p><p>参数格式：hh:mm:ss</p>
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set <p>开始时间</p><p>参数格式：hh:mm:ss</p>
     * @param BeginTime <p>开始时间</p><p>参数格式：hh:mm:ss</p>
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get <p>结束时间</p><p>参数格式：hh:mm:ss</p> 
     * @return EndTime <p>结束时间</p><p>参数格式：hh:mm:ss</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间</p><p>参数格式：hh:mm:ss</p>
     * @param EndTime <p>结束时间</p><p>参数格式：hh:mm:ss</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>重复周期： 1-周一 2-周二 3-周三 4-周四 5-周五 6-周六 7-周日</p><p>取值范围：[1, 7]</p> 
     * @return WeekDay <p>重复周期： 1-周一 2-周二 3-周三 4-周四 5-周五 6-周六 7-周日</p><p>取值范围：[1, 7]</p>
     */
    public Long getWeekDay() {
        return this.WeekDay;
    }

    /**
     * Set <p>重复周期： 1-周一 2-周二 3-周三 4-周四 5-周五 6-周六 7-周日</p><p>取值范围：[1, 7]</p>
     * @param WeekDay <p>重复周期： 1-周一 2-周二 3-周三 4-周四 5-周五 6-周六 7-周日</p><p>取值范围：[1, 7]</p>
     */
    public void setWeekDay(Long WeekDay) {
        this.WeekDay = WeekDay;
    }

    public EffectiveTime() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EffectiveTime(EffectiveTime source) {
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.WeekDay != null) {
            this.WeekDay = new Long(source.WeekDay);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "WeekDay", this.WeekDay);

    }
}

