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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CycleEmailParam extends AbstractModel{

    /**
    * 任务开始时间
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 任务周期 小时维度
    */
    @SerializedName("IntervalTime")
    @Expose
    private Long IntervalTime;

    /**
    * 是否终止周期，用于任务更新 0否1是
    */
    @SerializedName("TermCycle")
    @Expose
    private Long TermCycle;

    /**
     * Get 任务开始时间 
     * @return BeginTime 任务开始时间
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 任务开始时间
     * @param BeginTime 任务开始时间
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 任务周期 小时维度 
     * @return IntervalTime 任务周期 小时维度
     */
    public Long getIntervalTime() {
        return this.IntervalTime;
    }

    /**
     * Set 任务周期 小时维度
     * @param IntervalTime 任务周期 小时维度
     */
    public void setIntervalTime(Long IntervalTime) {
        this.IntervalTime = IntervalTime;
    }

    /**
     * Get 是否终止周期，用于任务更新 0否1是 
     * @return TermCycle 是否终止周期，用于任务更新 0否1是
     */
    public Long getTermCycle() {
        return this.TermCycle;
    }

    /**
     * Set 是否终止周期，用于任务更新 0否1是
     * @param TermCycle 是否终止周期，用于任务更新 0否1是
     */
    public void setTermCycle(Long TermCycle) {
        this.TermCycle = TermCycle;
    }

    public CycleEmailParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CycleEmailParam(CycleEmailParam source) {
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.IntervalTime != null) {
            this.IntervalTime = new Long(source.IntervalTime);
        }
        if (source.TermCycle != null) {
            this.TermCycle = new Long(source.TermCycle);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "IntervalTime", this.IntervalTime);
        this.setParamSimple(map, prefix + "TermCycle", this.TermCycle);

    }
}

