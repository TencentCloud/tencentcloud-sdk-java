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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RiskRuleInfo extends AbstractModel {

    /**
    * 风险检查项ID
    */
    @SerializedName("RuleID")
    @Expose
    private String RuleID;

    /**
    * 云厂商名称
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * 实例类型
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 风险名称
    */
    @SerializedName("RiskTitle")
    @Expose
    private String RiskTitle;

    /**
    * 检查类型
    */
    @SerializedName("CheckType")
    @Expose
    private String CheckType;

    /**
    * 风险等级
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * 风险危害
    */
    @SerializedName("RiskInfluence")
    @Expose
    private String RiskInfluence;

    /**
    * 风险修复指引报告链接
    */
    @SerializedName("RiskFixAdvance")
    @Expose
    private String RiskFixAdvance;

    /**
    * 边界管控
    */
    @SerializedName("DispositionType")
    @Expose
    private String DispositionType;

    /**
     * Get 风险检查项ID 
     * @return RuleID 风险检查项ID
     */
    public String getRuleID() {
        return this.RuleID;
    }

    /**
     * Set 风险检查项ID
     * @param RuleID 风险检查项ID
     */
    public void setRuleID(String RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get 云厂商名称 
     * @return Provider 云厂商名称
     */
    public String getProvider() {
        return this.Provider;
    }

    /**
     * Set 云厂商名称
     * @param Provider 云厂商名称
     */
    public void setProvider(String Provider) {
        this.Provider = Provider;
    }

    /**
     * Get 实例类型 
     * @return InstanceType 实例类型
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型
     * @param InstanceType 实例类型
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 风险名称 
     * @return RiskTitle 风险名称
     */
    public String getRiskTitle() {
        return this.RiskTitle;
    }

    /**
     * Set 风险名称
     * @param RiskTitle 风险名称
     */
    public void setRiskTitle(String RiskTitle) {
        this.RiskTitle = RiskTitle;
    }

    /**
     * Get 检查类型 
     * @return CheckType 检查类型
     */
    public String getCheckType() {
        return this.CheckType;
    }

    /**
     * Set 检查类型
     * @param CheckType 检查类型
     */
    public void setCheckType(String CheckType) {
        this.CheckType = CheckType;
    }

    /**
     * Get 风险等级 
     * @return RiskLevel 风险等级
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 风险等级
     * @param RiskLevel 风险等级
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get 风险危害 
     * @return RiskInfluence 风险危害
     */
    public String getRiskInfluence() {
        return this.RiskInfluence;
    }

    /**
     * Set 风险危害
     * @param RiskInfluence 风险危害
     */
    public void setRiskInfluence(String RiskInfluence) {
        this.RiskInfluence = RiskInfluence;
    }

    /**
     * Get 风险修复指引报告链接 
     * @return RiskFixAdvance 风险修复指引报告链接
     */
    public String getRiskFixAdvance() {
        return this.RiskFixAdvance;
    }

    /**
     * Set 风险修复指引报告链接
     * @param RiskFixAdvance 风险修复指引报告链接
     */
    public void setRiskFixAdvance(String RiskFixAdvance) {
        this.RiskFixAdvance = RiskFixAdvance;
    }

    /**
     * Get 边界管控 
     * @return DispositionType 边界管控
     */
    public String getDispositionType() {
        return this.DispositionType;
    }

    /**
     * Set 边界管控
     * @param DispositionType 边界管控
     */
    public void setDispositionType(String DispositionType) {
        this.DispositionType = DispositionType;
    }

    public RiskRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RiskRuleInfo(RiskRuleInfo source) {
        if (source.RuleID != null) {
            this.RuleID = new String(source.RuleID);
        }
        if (source.Provider != null) {
            this.Provider = new String(source.Provider);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.RiskTitle != null) {
            this.RiskTitle = new String(source.RiskTitle);
        }
        if (source.CheckType != null) {
            this.CheckType = new String(source.CheckType);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.RiskInfluence != null) {
            this.RiskInfluence = new String(source.RiskInfluence);
        }
        if (source.RiskFixAdvance != null) {
            this.RiskFixAdvance = new String(source.RiskFixAdvance);
        }
        if (source.DispositionType != null) {
            this.DispositionType = new String(source.DispositionType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "Provider", this.Provider);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "RiskTitle", this.RiskTitle);
        this.setParamSimple(map, prefix + "CheckType", this.CheckType);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "RiskInfluence", this.RiskInfluence);
        this.setParamSimple(map, prefix + "RiskFixAdvance", this.RiskFixAdvance);
        this.setParamSimple(map, prefix + "DispositionType", this.DispositionType);

    }
}

