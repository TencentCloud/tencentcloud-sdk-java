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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DayRepeatStrategy extends AbstractModel {

    /**
    * 重复任务执行的具体时刻，例如"01:02:00"
    */
    @SerializedName("ExecuteAtTimeOfDay")
    @Expose
    private String ExecuteAtTimeOfDay;

    /**
    * 每隔Step天执行一次
    */
    @SerializedName("Step")
    @Expose
    private Long Step;

    /**
     * Get 重复任务执行的具体时刻，例如"01:02:00" 
     * @return ExecuteAtTimeOfDay 重复任务执行的具体时刻，例如"01:02:00"
     */
    public String getExecuteAtTimeOfDay() {
        return this.ExecuteAtTimeOfDay;
    }

    /**
     * Set 重复任务执行的具体时刻，例如"01:02:00"
     * @param ExecuteAtTimeOfDay 重复任务执行的具体时刻，例如"01:02:00"
     */
    public void setExecuteAtTimeOfDay(String ExecuteAtTimeOfDay) {
        this.ExecuteAtTimeOfDay = ExecuteAtTimeOfDay;
    }

    /**
     * Get 每隔Step天执行一次 
     * @return Step 每隔Step天执行一次
     */
    public Long getStep() {
        return this.Step;
    }

    /**
     * Set 每隔Step天执行一次
     * @param Step 每隔Step天执行一次
     */
    public void setStep(Long Step) {
        this.Step = Step;
    }

    public DayRepeatStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DayRepeatStrategy(DayRepeatStrategy source) {
        if (source.ExecuteAtTimeOfDay != null) {
            this.ExecuteAtTimeOfDay = new String(source.ExecuteAtTimeOfDay);
        }
        if (source.Step != null) {
            this.Step = new Long(source.Step);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExecuteAtTimeOfDay", this.ExecuteAtTimeOfDay);
        this.setParamSimple(map, prefix + "Step", this.Step);

    }
}

