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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDSPAAssessmentRiskLevelRequest extends AbstractModel {

    /**
    * dspa实例id
    */
    @SerializedName("DspaId")
    @Expose
    private String DspaId;

    /**
    * 风险等级名称
    */
    @SerializedName("RiskLevelName")
    @Expose
    private String RiskLevelName;

    /**
    * 识别模板
    */
    @SerializedName("IdentifyComplianceId")
    @Expose
    private Long IdentifyComplianceId;

    /**
    * 风险等级矩阵
    */
    @SerializedName("RiskLevelRule")
    @Expose
    private RiskLevelMatrix [] RiskLevelRule;

    /**
    * 风险等级的描述
    */
    @SerializedName("RiskLevelDescription")
    @Expose
    private String RiskLevelDescription;

    /**
     * Get dspa实例id 
     * @return DspaId dspa实例id
     */
    public String getDspaId() {
        return this.DspaId;
    }

    /**
     * Set dspa实例id
     * @param DspaId dspa实例id
     */
    public void setDspaId(String DspaId) {
        this.DspaId = DspaId;
    }

    /**
     * Get 风险等级名称 
     * @return RiskLevelName 风险等级名称
     */
    public String getRiskLevelName() {
        return this.RiskLevelName;
    }

    /**
     * Set 风险等级名称
     * @param RiskLevelName 风险等级名称
     */
    public void setRiskLevelName(String RiskLevelName) {
        this.RiskLevelName = RiskLevelName;
    }

    /**
     * Get 识别模板 
     * @return IdentifyComplianceId 识别模板
     */
    public Long getIdentifyComplianceId() {
        return this.IdentifyComplianceId;
    }

    /**
     * Set 识别模板
     * @param IdentifyComplianceId 识别模板
     */
    public void setIdentifyComplianceId(Long IdentifyComplianceId) {
        this.IdentifyComplianceId = IdentifyComplianceId;
    }

    /**
     * Get 风险等级矩阵 
     * @return RiskLevelRule 风险等级矩阵
     */
    public RiskLevelMatrix [] getRiskLevelRule() {
        return this.RiskLevelRule;
    }

    /**
     * Set 风险等级矩阵
     * @param RiskLevelRule 风险等级矩阵
     */
    public void setRiskLevelRule(RiskLevelMatrix [] RiskLevelRule) {
        this.RiskLevelRule = RiskLevelRule;
    }

    /**
     * Get 风险等级的描述 
     * @return RiskLevelDescription 风险等级的描述
     */
    public String getRiskLevelDescription() {
        return this.RiskLevelDescription;
    }

    /**
     * Set 风险等级的描述
     * @param RiskLevelDescription 风险等级的描述
     */
    public void setRiskLevelDescription(String RiskLevelDescription) {
        this.RiskLevelDescription = RiskLevelDescription;
    }

    public CreateDSPAAssessmentRiskLevelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDSPAAssessmentRiskLevelRequest(CreateDSPAAssessmentRiskLevelRequest source) {
        if (source.DspaId != null) {
            this.DspaId = new String(source.DspaId);
        }
        if (source.RiskLevelName != null) {
            this.RiskLevelName = new String(source.RiskLevelName);
        }
        if (source.IdentifyComplianceId != null) {
            this.IdentifyComplianceId = new Long(source.IdentifyComplianceId);
        }
        if (source.RiskLevelRule != null) {
            this.RiskLevelRule = new RiskLevelMatrix[source.RiskLevelRule.length];
            for (int i = 0; i < source.RiskLevelRule.length; i++) {
                this.RiskLevelRule[i] = new RiskLevelMatrix(source.RiskLevelRule[i]);
            }
        }
        if (source.RiskLevelDescription != null) {
            this.RiskLevelDescription = new String(source.RiskLevelDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DspaId", this.DspaId);
        this.setParamSimple(map, prefix + "RiskLevelName", this.RiskLevelName);
        this.setParamSimple(map, prefix + "IdentifyComplianceId", this.IdentifyComplianceId);
        this.setParamArrayObj(map, prefix + "RiskLevelRule.", this.RiskLevelRule);
        this.setParamSimple(map, prefix + "RiskLevelDescription", this.RiskLevelDescription);

    }
}

