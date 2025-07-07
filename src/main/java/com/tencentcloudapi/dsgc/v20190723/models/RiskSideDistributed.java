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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RiskSideDistributed extends AbstractModel {

    /**
    * 风险面
    */
    @SerializedName("AssessmentRiskSide")
    @Expose
    private Note AssessmentRiskSide;

    /**
    * 风险类型
    */
    @SerializedName("AssessmentRisk")
    @Expose
    private Note [] AssessmentRisk;

    /**
     * Get 风险面 
     * @return AssessmentRiskSide 风险面
     */
    public Note getAssessmentRiskSide() {
        return this.AssessmentRiskSide;
    }

    /**
     * Set 风险面
     * @param AssessmentRiskSide 风险面
     */
    public void setAssessmentRiskSide(Note AssessmentRiskSide) {
        this.AssessmentRiskSide = AssessmentRiskSide;
    }

    /**
     * Get 风险类型 
     * @return AssessmentRisk 风险类型
     */
    public Note [] getAssessmentRisk() {
        return this.AssessmentRisk;
    }

    /**
     * Set 风险类型
     * @param AssessmentRisk 风险类型
     */
    public void setAssessmentRisk(Note [] AssessmentRisk) {
        this.AssessmentRisk = AssessmentRisk;
    }

    public RiskSideDistributed() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RiskSideDistributed(RiskSideDistributed source) {
        if (source.AssessmentRiskSide != null) {
            this.AssessmentRiskSide = new Note(source.AssessmentRiskSide);
        }
        if (source.AssessmentRisk != null) {
            this.AssessmentRisk = new Note[source.AssessmentRisk.length];
            for (int i = 0; i < source.AssessmentRisk.length; i++) {
                this.AssessmentRisk[i] = new Note(source.AssessmentRisk[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AssessmentRiskSide.", this.AssessmentRiskSide);
        this.setParamArrayObj(map, prefix + "AssessmentRisk.", this.AssessmentRisk);

    }
}

