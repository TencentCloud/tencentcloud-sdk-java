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
package com.tencentcloudapi.bm.v20180423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomImageProcess extends AbstractModel{

    /**
    * 步骤
    */
    @SerializedName("StepName")
    @Expose
    private String StepName;

    /**
    * 此步骤开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 0: 已完成 1: 当前进行 2: 未开始
    */
    @SerializedName("StepType")
    @Expose
    private Long StepType;

    /**
     * Get 步骤 
     * @return StepName 步骤
     */
    public String getStepName() {
        return this.StepName;
    }

    /**
     * Set 步骤
     * @param StepName 步骤
     */
    public void setStepName(String StepName) {
        this.StepName = StepName;
    }

    /**
     * Get 此步骤开始时间 
     * @return StartTime 此步骤开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 此步骤开始时间
     * @param StartTime 此步骤开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 0: 已完成 1: 当前进行 2: 未开始 
     * @return StepType 0: 已完成 1: 当前进行 2: 未开始
     */
    public Long getStepType() {
        return this.StepType;
    }

    /**
     * Set 0: 已完成 1: 当前进行 2: 未开始
     * @param StepType 0: 已完成 1: 当前进行 2: 未开始
     */
    public void setStepType(Long StepType) {
        this.StepType = StepType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StepName", this.StepName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "StepType", this.StepType);

    }
}

