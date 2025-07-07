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

public class DescribeDSPAAssessmentLatestRiskDetailInfoRequest extends AbstractModel {

    /**
    * dspa实例Id
    */
    @SerializedName("DspaId")
    @Expose
    private String DspaId;

    /**
    * 评估模板id
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * 风险id
    */
    @SerializedName("RiskId")
    @Expose
    private Long RiskId;

    /**
     * Get dspa实例Id 
     * @return DspaId dspa实例Id
     */
    public String getDspaId() {
        return this.DspaId;
    }

    /**
     * Set dspa实例Id
     * @param DspaId dspa实例Id
     */
    public void setDspaId(String DspaId) {
        this.DspaId = DspaId;
    }

    /**
     * Get 评估模板id 
     * @return TemplateId 评估模板id
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 评估模板id
     * @param TemplateId 评估模板id
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 风险id 
     * @return RiskId 风险id
     */
    public Long getRiskId() {
        return this.RiskId;
    }

    /**
     * Set 风险id
     * @param RiskId 风险id
     */
    public void setRiskId(Long RiskId) {
        this.RiskId = RiskId;
    }

    public DescribeDSPAAssessmentLatestRiskDetailInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDSPAAssessmentLatestRiskDetailInfoRequest(DescribeDSPAAssessmentLatestRiskDetailInfoRequest source) {
        if (source.DspaId != null) {
            this.DspaId = new String(source.DspaId);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.RiskId != null) {
            this.RiskId = new Long(source.RiskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DspaId", this.DspaId);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "RiskId", this.RiskId);

    }
}

