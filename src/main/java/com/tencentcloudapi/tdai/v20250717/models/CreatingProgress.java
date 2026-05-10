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
package com.tencentcloudapi.tdai.v20250717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatingProgress extends AbstractModel {

    /**
    * <p>总步骤数</p>
    */
    @SerializedName("TotalSteps")
    @Expose
    private Long TotalSteps;

    /**
    * <p>当前步骤</p>
    */
    @SerializedName("CurrentStep")
    @Expose
    private Long CurrentStep;

    /**
    * <p>步骤详情</p>
    */
    @SerializedName("Steps")
    @Expose
    private CreatingStepInfo [] Steps;

    /**
     * Get <p>总步骤数</p> 
     * @return TotalSteps <p>总步骤数</p>
     */
    public Long getTotalSteps() {
        return this.TotalSteps;
    }

    /**
     * Set <p>总步骤数</p>
     * @param TotalSteps <p>总步骤数</p>
     */
    public void setTotalSteps(Long TotalSteps) {
        this.TotalSteps = TotalSteps;
    }

    /**
     * Get <p>当前步骤</p> 
     * @return CurrentStep <p>当前步骤</p>
     */
    public Long getCurrentStep() {
        return this.CurrentStep;
    }

    /**
     * Set <p>当前步骤</p>
     * @param CurrentStep <p>当前步骤</p>
     */
    public void setCurrentStep(Long CurrentStep) {
        this.CurrentStep = CurrentStep;
    }

    /**
     * Get <p>步骤详情</p> 
     * @return Steps <p>步骤详情</p>
     */
    public CreatingStepInfo [] getSteps() {
        return this.Steps;
    }

    /**
     * Set <p>步骤详情</p>
     * @param Steps <p>步骤详情</p>
     */
    public void setSteps(CreatingStepInfo [] Steps) {
        this.Steps = Steps;
    }

    public CreatingProgress() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatingProgress(CreatingProgress source) {
        if (source.TotalSteps != null) {
            this.TotalSteps = new Long(source.TotalSteps);
        }
        if (source.CurrentStep != null) {
            this.CurrentStep = new Long(source.CurrentStep);
        }
        if (source.Steps != null) {
            this.Steps = new CreatingStepInfo[source.Steps.length];
            for (int i = 0; i < source.Steps.length; i++) {
                this.Steps[i] = new CreatingStepInfo(source.Steps[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalSteps", this.TotalSteps);
        this.setParamSimple(map, prefix + "CurrentStep", this.CurrentStep);
        this.setParamArrayObj(map, prefix + "Steps.", this.Steps);

    }
}

