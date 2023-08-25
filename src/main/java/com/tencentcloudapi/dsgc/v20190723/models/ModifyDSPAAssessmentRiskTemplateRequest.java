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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDSPAAssessmentRiskTemplateRequest extends AbstractModel{

    /**
    * dspa实例id
    */
    @SerializedName("DspaId")
    @Expose
    private String DspaId;

    /**
    * 模版名称
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * 模版的描述
    */
    @SerializedName("TemplateDescription")
    @Expose
    private String TemplateDescription;

    /**
    * 模版id
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * 修改的风险等级id
    */
    @SerializedName("RiskLevelId")
    @Expose
    private Long RiskLevelId;

    /**
    * 脆弱项列表
    */
    @SerializedName("RiskIdList")
    @Expose
    private Long [] RiskIdList;

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
     * Get 模版名称 
     * @return TemplateName 模版名称
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set 模版名称
     * @param TemplateName 模版名称
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get 模版的描述 
     * @return TemplateDescription 模版的描述
     */
    public String getTemplateDescription() {
        return this.TemplateDescription;
    }

    /**
     * Set 模版的描述
     * @param TemplateDescription 模版的描述
     */
    public void setTemplateDescription(String TemplateDescription) {
        this.TemplateDescription = TemplateDescription;
    }

    /**
     * Get 模版id 
     * @return TemplateId 模版id
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模版id
     * @param TemplateId 模版id
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 修改的风险等级id 
     * @return RiskLevelId 修改的风险等级id
     */
    public Long getRiskLevelId() {
        return this.RiskLevelId;
    }

    /**
     * Set 修改的风险等级id
     * @param RiskLevelId 修改的风险等级id
     */
    public void setRiskLevelId(Long RiskLevelId) {
        this.RiskLevelId = RiskLevelId;
    }

    /**
     * Get 脆弱项列表 
     * @return RiskIdList 脆弱项列表
     */
    public Long [] getRiskIdList() {
        return this.RiskIdList;
    }

    /**
     * Set 脆弱项列表
     * @param RiskIdList 脆弱项列表
     */
    public void setRiskIdList(Long [] RiskIdList) {
        this.RiskIdList = RiskIdList;
    }

    public ModifyDSPAAssessmentRiskTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDSPAAssessmentRiskTemplateRequest(ModifyDSPAAssessmentRiskTemplateRequest source) {
        if (source.DspaId != null) {
            this.DspaId = new String(source.DspaId);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.TemplateDescription != null) {
            this.TemplateDescription = new String(source.TemplateDescription);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DspaId", this.DspaId);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "TemplateDescription", this.TemplateDescription);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "RiskLevelId", this.RiskLevelId);
        this.setParamArraySimple(map, prefix + "RiskIdList.", this.RiskIdList);

    }
}

