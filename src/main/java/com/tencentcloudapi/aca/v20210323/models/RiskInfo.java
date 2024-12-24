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
package com.tencentcloudapi.aca.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RiskInfo extends AbstractModel {

    /**
    * 药品ID
    */
    @SerializedName("DrugId")
    @Expose
    private String DrugId;

    /**
    * 药品名称
    */
    @SerializedName("DrugName")
    @Expose
    private String DrugName;

    /**
    * 风险等级：低级风险、中级风险、高级风险
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * 风险提示
    */
    @SerializedName("RiskTips")
    @Expose
    private String RiskTips;

    /**
    * FDA分级
    */
    @SerializedName("FdaLevel")
    @Expose
    private String FdaLevel;

    /**
    * 关联药品名称
    */
    @SerializedName("RelatedDrugName")
    @Expose
    private String RelatedDrugName;

    /**
    * 关联处方ID
    */
    @SerializedName("RelatedPrescriptionId")
    @Expose
    private String RelatedPrescriptionId;

    /**
     * Get 药品ID 
     * @return DrugId 药品ID
     */
    public String getDrugId() {
        return this.DrugId;
    }

    /**
     * Set 药品ID
     * @param DrugId 药品ID
     */
    public void setDrugId(String DrugId) {
        this.DrugId = DrugId;
    }

    /**
     * Get 药品名称 
     * @return DrugName 药品名称
     */
    public String getDrugName() {
        return this.DrugName;
    }

    /**
     * Set 药品名称
     * @param DrugName 药品名称
     */
    public void setDrugName(String DrugName) {
        this.DrugName = DrugName;
    }

    /**
     * Get 风险等级：低级风险、中级风险、高级风险 
     * @return RiskLevel 风险等级：低级风险、中级风险、高级风险
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 风险等级：低级风险、中级风险、高级风险
     * @param RiskLevel 风险等级：低级风险、中级风险、高级风险
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get 风险提示 
     * @return RiskTips 风险提示
     */
    public String getRiskTips() {
        return this.RiskTips;
    }

    /**
     * Set 风险提示
     * @param RiskTips 风险提示
     */
    public void setRiskTips(String RiskTips) {
        this.RiskTips = RiskTips;
    }

    /**
     * Get FDA分级 
     * @return FdaLevel FDA分级
     */
    public String getFdaLevel() {
        return this.FdaLevel;
    }

    /**
     * Set FDA分级
     * @param FdaLevel FDA分级
     */
    public void setFdaLevel(String FdaLevel) {
        this.FdaLevel = FdaLevel;
    }

    /**
     * Get 关联药品名称 
     * @return RelatedDrugName 关联药品名称
     */
    public String getRelatedDrugName() {
        return this.RelatedDrugName;
    }

    /**
     * Set 关联药品名称
     * @param RelatedDrugName 关联药品名称
     */
    public void setRelatedDrugName(String RelatedDrugName) {
        this.RelatedDrugName = RelatedDrugName;
    }

    /**
     * Get 关联处方ID 
     * @return RelatedPrescriptionId 关联处方ID
     */
    public String getRelatedPrescriptionId() {
        return this.RelatedPrescriptionId;
    }

    /**
     * Set 关联处方ID
     * @param RelatedPrescriptionId 关联处方ID
     */
    public void setRelatedPrescriptionId(String RelatedPrescriptionId) {
        this.RelatedPrescriptionId = RelatedPrescriptionId;
    }

    public RiskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RiskInfo(RiskInfo source) {
        if (source.DrugId != null) {
            this.DrugId = new String(source.DrugId);
        }
        if (source.DrugName != null) {
            this.DrugName = new String(source.DrugName);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.RiskTips != null) {
            this.RiskTips = new String(source.RiskTips);
        }
        if (source.FdaLevel != null) {
            this.FdaLevel = new String(source.FdaLevel);
        }
        if (source.RelatedDrugName != null) {
            this.RelatedDrugName = new String(source.RelatedDrugName);
        }
        if (source.RelatedPrescriptionId != null) {
            this.RelatedPrescriptionId = new String(source.RelatedPrescriptionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DrugId", this.DrugId);
        this.setParamSimple(map, prefix + "DrugName", this.DrugName);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "RiskTips", this.RiskTips);
        this.setParamSimple(map, prefix + "FdaLevel", this.FdaLevel);
        this.setParamSimple(map, prefix + "RelatedDrugName", this.RelatedDrugName);
        this.setParamSimple(map, prefix + "RelatedPrescriptionId", this.RelatedPrescriptionId);

    }
}

