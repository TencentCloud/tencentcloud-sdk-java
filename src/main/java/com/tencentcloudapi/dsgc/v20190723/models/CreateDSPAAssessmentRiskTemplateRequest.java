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

public class CreateDSPAAssessmentRiskTemplateRequest extends AbstractModel {

    /**
    * dspa实例id
    */
    @SerializedName("DspaId")
    @Expose
    private String DspaId;

    /**
    * 模板名称
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * 风险等级id
    */
    @SerializedName("RiskLevelId")
    @Expose
    private Long RiskLevelId;

    /**
    * 风险id列表
    */
    @SerializedName("RiskIdList")
    @Expose
    private Long [] RiskIdList;

    /**
    * 模板描述
    */
    @SerializedName("TemplateDescription")
    @Expose
    private String TemplateDescription;

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
     * Get 模板名称 
     * @return TemplateName 模板名称
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set 模板名称
     * @param TemplateName 模板名称
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get 风险等级id 
     * @return RiskLevelId 风险等级id
     */
    public Long getRiskLevelId() {
        return this.RiskLevelId;
    }

    /**
     * Set 风险等级id
     * @param RiskLevelId 风险等级id
     */
    public void setRiskLevelId(Long RiskLevelId) {
        this.RiskLevelId = RiskLevelId;
    }

    /**
     * Get 风险id列表 
     * @return RiskIdList 风险id列表
     */
    public Long [] getRiskIdList() {
        return this.RiskIdList;
    }

    /**
     * Set 风险id列表
     * @param RiskIdList 风险id列表
     */
    public void setRiskIdList(Long [] RiskIdList) {
        this.RiskIdList = RiskIdList;
    }

    /**
     * Get 模板描述 
     * @return TemplateDescription 模板描述
     */
    public String getTemplateDescription() {
        return this.TemplateDescription;
    }

    /**
     * Set 模板描述
     * @param TemplateDescription 模板描述
     */
    public void setTemplateDescription(String TemplateDescription) {
        this.TemplateDescription = TemplateDescription;
    }

    public CreateDSPAAssessmentRiskTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDSPAAssessmentRiskTemplateRequest(CreateDSPAAssessmentRiskTemplateRequest source) {
        if (source.DspaId != null) {
            this.DspaId = new String(source.DspaId);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.RiskLevelId != null) {
            this.RiskLevelId = new Long(source.RiskLevelId);
        }
        if (source.RiskIdList != null) {
            this.RiskIdList = new Long[source.RiskIdList.length];
            for (int i = 0; i < source.RiskIdList.length; i++) {
                this.RiskIdList[i] = new Long(source.RiskIdList[i]);
            }
        }
        if (source.TemplateDescription != null) {
            this.TemplateDescription = new String(source.TemplateDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DspaId", this.DspaId);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "RiskLevelId", this.RiskLevelId);
        this.setParamArraySimple(map, prefix + "RiskIdList.", this.RiskIdList);
        this.setParamSimple(map, prefix + "TemplateDescription", this.TemplateDescription);

    }
}

