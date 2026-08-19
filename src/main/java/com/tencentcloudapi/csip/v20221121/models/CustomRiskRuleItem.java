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

public class CustomRiskRuleItem extends AbstractModel {

    /**
    * <p>风险规则ID</p>
    */
    @SerializedName("RuleID")
    @Expose
    private String RuleID;

    /**
    * <p>腾讯云</p>
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * <p>风险标题</p>
    */
    @SerializedName("RiskTitle")
    @Expose
    private String RiskTitle;

    /**
    * <p>风险分类</p>
    */
    @SerializedName("Classify")
    @Expose
    private String Classify;

    /**
    * <p>风险等级</p>
    */
    @SerializedName("Severity")
    @Expose
    private String Severity;

    /**
    * <p>风险规则开启状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>关联的账号数量</p>
    */
    @SerializedName("RelatedUinCount")
    @Expose
    private Long RelatedUinCount;

    /**
    * <p>策略启用的账号数量</p>
    */
    @SerializedName("PolicyEnableCount")
    @Expose
    private Long PolicyEnableCount;

    /**
    * <p>资产类型</p>
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * <p>规则是否免费</p>
    */
    @SerializedName("IsFree")
    @Expose
    private Long IsFree;

    /**
    * <p>检查类型</p>
    */
    @SerializedName("CheckType")
    @Expose
    private String CheckType;

    /**
    * <p>安全条款规范</p>
    */
    @SerializedName("StandardTerms")
    @Expose
    private StandardTerm [] StandardTerms;

    /**
    * <p>资产类型图标</p>
    */
    @SerializedName("AssetTypeIconURL")
    @Expose
    private String AssetTypeIconURL;

    /**
     * Get <p>风险规则ID</p> 
     * @return RuleID <p>风险规则ID</p>
     */
    public String getRuleID() {
        return this.RuleID;
    }

    /**
     * Set <p>风险规则ID</p>
     * @param RuleID <p>风险规则ID</p>
     */
    public void setRuleID(String RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get <p>腾讯云</p> 
     * @return Provider <p>腾讯云</p>
     */
    public String getProvider() {
        return this.Provider;
    }

    /**
     * Set <p>腾讯云</p>
     * @param Provider <p>腾讯云</p>
     */
    public void setProvider(String Provider) {
        this.Provider = Provider;
    }

    /**
     * Get <p>风险标题</p> 
     * @return RiskTitle <p>风险标题</p>
     */
    public String getRiskTitle() {
        return this.RiskTitle;
    }

    /**
     * Set <p>风险标题</p>
     * @param RiskTitle <p>风险标题</p>
     */
    public void setRiskTitle(String RiskTitle) {
        this.RiskTitle = RiskTitle;
    }

    /**
     * Get <p>风险分类</p> 
     * @return Classify <p>风险分类</p>
     */
    public String getClassify() {
        return this.Classify;
    }

    /**
     * Set <p>风险分类</p>
     * @param Classify <p>风险分类</p>
     */
    public void setClassify(String Classify) {
        this.Classify = Classify;
    }

    /**
     * Get <p>风险等级</p> 
     * @return Severity <p>风险等级</p>
     */
    public String getSeverity() {
        return this.Severity;
    }

    /**
     * Set <p>风险等级</p>
     * @param Severity <p>风险等级</p>
     */
    public void setSeverity(String Severity) {
        this.Severity = Severity;
    }

    /**
     * Get <p>风险规则开启状态</p> 
     * @return Status <p>风险规则开启状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>风险规则开启状态</p>
     * @param Status <p>风险规则开启状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>关联的账号数量</p> 
     * @return RelatedUinCount <p>关联的账号数量</p>
     */
    public Long getRelatedUinCount() {
        return this.RelatedUinCount;
    }

    /**
     * Set <p>关联的账号数量</p>
     * @param RelatedUinCount <p>关联的账号数量</p>
     */
    public void setRelatedUinCount(Long RelatedUinCount) {
        this.RelatedUinCount = RelatedUinCount;
    }

    /**
     * Get <p>策略启用的账号数量</p> 
     * @return PolicyEnableCount <p>策略启用的账号数量</p>
     */
    public Long getPolicyEnableCount() {
        return this.PolicyEnableCount;
    }

    /**
     * Set <p>策略启用的账号数量</p>
     * @param PolicyEnableCount <p>策略启用的账号数量</p>
     */
    public void setPolicyEnableCount(Long PolicyEnableCount) {
        this.PolicyEnableCount = PolicyEnableCount;
    }

    /**
     * Get <p>资产类型</p> 
     * @return AssetType <p>资产类型</p>
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set <p>资产类型</p>
     * @param AssetType <p>资产类型</p>
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get <p>规则是否免费</p> 
     * @return IsFree <p>规则是否免费</p>
     */
    public Long getIsFree() {
        return this.IsFree;
    }

    /**
     * Set <p>规则是否免费</p>
     * @param IsFree <p>规则是否免费</p>
     */
    public void setIsFree(Long IsFree) {
        this.IsFree = IsFree;
    }

    /**
     * Get <p>检查类型</p> 
     * @return CheckType <p>检查类型</p>
     */
    public String getCheckType() {
        return this.CheckType;
    }

    /**
     * Set <p>检查类型</p>
     * @param CheckType <p>检查类型</p>
     */
    public void setCheckType(String CheckType) {
        this.CheckType = CheckType;
    }

    /**
     * Get <p>安全条款规范</p> 
     * @return StandardTerms <p>安全条款规范</p>
     */
    public StandardTerm [] getStandardTerms() {
        return this.StandardTerms;
    }

    /**
     * Set <p>安全条款规范</p>
     * @param StandardTerms <p>安全条款规范</p>
     */
    public void setStandardTerms(StandardTerm [] StandardTerms) {
        this.StandardTerms = StandardTerms;
    }

    /**
     * Get <p>资产类型图标</p> 
     * @return AssetTypeIconURL <p>资产类型图标</p>
     */
    public String getAssetTypeIconURL() {
        return this.AssetTypeIconURL;
    }

    /**
     * Set <p>资产类型图标</p>
     * @param AssetTypeIconURL <p>资产类型图标</p>
     */
    public void setAssetTypeIconURL(String AssetTypeIconURL) {
        this.AssetTypeIconURL = AssetTypeIconURL;
    }

    public CustomRiskRuleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomRiskRuleItem(CustomRiskRuleItem source) {
        if (source.RuleID != null) {
            this.RuleID = new String(source.RuleID);
        }
        if (source.Provider != null) {
            this.Provider = new String(source.Provider);
        }
        if (source.RiskTitle != null) {
            this.RiskTitle = new String(source.RiskTitle);
        }
        if (source.Classify != null) {
            this.Classify = new String(source.Classify);
        }
        if (source.Severity != null) {
            this.Severity = new String(source.Severity);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RelatedUinCount != null) {
            this.RelatedUinCount = new Long(source.RelatedUinCount);
        }
        if (source.PolicyEnableCount != null) {
            this.PolicyEnableCount = new Long(source.PolicyEnableCount);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.IsFree != null) {
            this.IsFree = new Long(source.IsFree);
        }
        if (source.CheckType != null) {
            this.CheckType = new String(source.CheckType);
        }
        if (source.StandardTerms != null) {
            this.StandardTerms = new StandardTerm[source.StandardTerms.length];
            for (int i = 0; i < source.StandardTerms.length; i++) {
                this.StandardTerms[i] = new StandardTerm(source.StandardTerms[i]);
            }
        }
        if (source.AssetTypeIconURL != null) {
            this.AssetTypeIconURL = new String(source.AssetTypeIconURL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "Provider", this.Provider);
        this.setParamSimple(map, prefix + "RiskTitle", this.RiskTitle);
        this.setParamSimple(map, prefix + "Classify", this.Classify);
        this.setParamSimple(map, prefix + "Severity", this.Severity);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RelatedUinCount", this.RelatedUinCount);
        this.setParamSimple(map, prefix + "PolicyEnableCount", this.PolicyEnableCount);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "IsFree", this.IsFree);
        this.setParamSimple(map, prefix + "CheckType", this.CheckType);
        this.setParamArrayObj(map, prefix + "StandardTerms.", this.StandardTerms);
        this.setParamSimple(map, prefix + "AssetTypeIconURL", this.AssetTypeIconURL);

    }
}

