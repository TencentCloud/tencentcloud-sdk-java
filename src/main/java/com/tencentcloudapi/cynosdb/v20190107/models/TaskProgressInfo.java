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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskProgressInfo extends AbstractModel {

    /**
    * 当前步骤
    */
    @SerializedName("CurrentStep")
    @Expose
    private String CurrentStep;

    /**
    * 当前进度
    */
    @SerializedName("CurrentStepProgress")
    @Expose
    private Long CurrentStepProgress;

    /**
    * 预估时间
    */
    @SerializedName("CurrentStepRemainingTime")
    @Expose
    private String CurrentStepRemainingTime;

    /**
     * Get 当前步骤 
     * @return CurrentStep 当前步骤
     */
    public String getCurrentStep() {
        return this.CurrentStep;
    }

    /**
     * Set 当前步骤
     * @param CurrentStep 当前步骤
     */
    public void setCurrentStep(String CurrentStep) {
        this.CurrentStep = CurrentStep;
    }

    /**
     * Get 当前进度 
     * @return CurrentStepProgress 当前进度
     */
    public Long getCurrentStepProgress() {
        return this.CurrentStepProgress;
    }

    /**
     * Set 当前进度
     * @param CurrentStepProgress 当前进度
     */
    public void setCurrentStepProgress(Long CurrentStepProgress) {
        this.CurrentStepProgress = CurrentStepProgress;
    }

    /**
     * Get 预估时间 
     * @return CurrentStepRemainingTime 预估时间
     */
    public String getCurrentStepRemainingTime() {
        return this.CurrentStepRemainingTime;
    }

    /**
     * Set 预估时间
     * @param CurrentStepRemainingTime 预估时间
     */
    public void setCurrentStepRemainingTime(String CurrentStepRemainingTime) {
        this.CurrentStepRemainingTime = CurrentStepRemainingTime;
    }

    public TaskProgressInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskProgressInfo(TaskProgressInfo source) {
        if (source.CurrentStep != null) {
            this.CurrentStep = new String(source.CurrentStep);
        }
        if (source.CurrentStepProgress != null) {
            this.CurrentStepProgress = new Long(source.CurrentStepProgress);
        }
        if (source.CurrentStepRemainingTime != null) {
            this.CurrentStepRemainingTime = new String(source.CurrentStepRemainingTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CurrentStep", this.CurrentStep);
        this.setParamSimple(map, prefix + "CurrentStepProgress", this.CurrentStepProgress);
        this.setParamSimple(map, prefix + "CurrentStepRemainingTime", this.CurrentStepRemainingTime);

    }
}

