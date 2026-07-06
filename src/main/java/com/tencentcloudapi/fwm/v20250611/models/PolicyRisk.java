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
package com.tencentcloudapi.fwm.v20250611.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PolicyRisk extends AbstractModel {

    /**
    * 问题对应的唯一uuid
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 风险大类
    */
    @SerializedName("RiskCategory")
    @Expose
    private String RiskCategory;

    /**
    * 风险子类
    */
    @SerializedName("RiskSubCategory")
    @Expose
    private String RiskSubCategory;

    /**
    * 规则分类
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * 风险等级，0：低风险
1：中风险
2：高风险
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long RiskLevel;

    /**
    * 安全组
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 风险包含的企业安全组规则ID
    */
    @SerializedName("SgRuleId")
    @Expose
    private String [] SgRuleId;

    /**
    * 风险包含安全组ID内的问题规则数
    */
    @SerializedName("RuleCount")
    @Expose
    private Long RuleCount;

    /**
    * 风险包含的安全组ID
    */
    @SerializedName("SgId")
    @Expose
    private String [] SgId;

    /**
    * 风险特征
    */
    @SerializedName("RiskFeature")
    @Expose
    private String RiskFeature;

    /**
    * 处置建议
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 处置状态，0：未处理，1：已处理，2：忽略
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 发现时间
    */
    @SerializedName("FoundTime")
    @Expose
    private String FoundTime;

    /**
    * 处置时间
    */
    @SerializedName("DisposalTime")
    @Expose
    private String DisposalTime;

    /**
    * 安全组地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Ingress入站，Egress出站
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
    * 风险原因
    */
    @SerializedName("RiskReason")
    @Expose
    private String RiskReason;

    /**
     * Get 问题对应的唯一uuid 
     * @return Id 问题对应的唯一uuid
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 问题对应的唯一uuid
     * @param Id 问题对应的唯一uuid
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 风险大类 
     * @return RiskCategory 风险大类
     */
    public String getRiskCategory() {
        return this.RiskCategory;
    }

    /**
     * Set 风险大类
     * @param RiskCategory 风险大类
     */
    public void setRiskCategory(String RiskCategory) {
        this.RiskCategory = RiskCategory;
    }

    /**
     * Get 风险子类 
     * @return RiskSubCategory 风险子类
     */
    public String getRiskSubCategory() {
        return this.RiskSubCategory;
    }

    /**
     * Set 风险子类
     * @param RiskSubCategory 风险子类
     */
    public void setRiskSubCategory(String RiskSubCategory) {
        this.RiskSubCategory = RiskSubCategory;
    }

    /**
     * Get 规则分类 
     * @return RuleType 规则分类
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 规则分类
     * @param RuleType 规则分类
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get 风险等级，0：低风险
1：中风险
2：高风险 
     * @return RiskLevel 风险等级，0：低风险
1：中风险
2：高风险
     */
    public Long getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 风险等级，0：低风险
1：中风险
2：高风险
     * @param RiskLevel 风险等级，0：低风险
1：中风险
2：高风险
     */
    public void setRiskLevel(Long RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get 安全组 
     * @return Product 安全组
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 安全组
     * @param Product 安全组
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 风险包含的企业安全组规则ID 
     * @return SgRuleId 风险包含的企业安全组规则ID
     */
    public String [] getSgRuleId() {
        return this.SgRuleId;
    }

    /**
     * Set 风险包含的企业安全组规则ID
     * @param SgRuleId 风险包含的企业安全组规则ID
     */
    public void setSgRuleId(String [] SgRuleId) {
        this.SgRuleId = SgRuleId;
    }

    /**
     * Get 风险包含安全组ID内的问题规则数 
     * @return RuleCount 风险包含安全组ID内的问题规则数
     */
    public Long getRuleCount() {
        return this.RuleCount;
    }

    /**
     * Set 风险包含安全组ID内的问题规则数
     * @param RuleCount 风险包含安全组ID内的问题规则数
     */
    public void setRuleCount(Long RuleCount) {
        this.RuleCount = RuleCount;
    }

    /**
     * Get 风险包含的安全组ID 
     * @return SgId 风险包含的安全组ID
     */
    public String [] getSgId() {
        return this.SgId;
    }

    /**
     * Set 风险包含的安全组ID
     * @param SgId 风险包含的安全组ID
     */
    public void setSgId(String [] SgId) {
        this.SgId = SgId;
    }

    /**
     * Get 风险特征 
     * @return RiskFeature 风险特征
     */
    public String getRiskFeature() {
        return this.RiskFeature;
    }

    /**
     * Set 风险特征
     * @param RiskFeature 风险特征
     */
    public void setRiskFeature(String RiskFeature) {
        this.RiskFeature = RiskFeature;
    }

    /**
     * Get 处置建议 
     * @return Suggestion 处置建议
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 处置建议
     * @param Suggestion 处置建议
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get 处置状态，0：未处理，1：已处理，2：忽略 
     * @return Status 处置状态，0：未处理，1：已处理，2：忽略
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 处置状态，0：未处理，1：已处理，2：忽略
     * @param Status 处置状态，0：未处理，1：已处理，2：忽略
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 发现时间 
     * @return FoundTime 发现时间
     */
    public String getFoundTime() {
        return this.FoundTime;
    }

    /**
     * Set 发现时间
     * @param FoundTime 发现时间
     */
    public void setFoundTime(String FoundTime) {
        this.FoundTime = FoundTime;
    }

    /**
     * Get 处置时间 
     * @return DisposalTime 处置时间
     */
    public String getDisposalTime() {
        return this.DisposalTime;
    }

    /**
     * Set 处置时间
     * @param DisposalTime 处置时间
     */
    public void setDisposalTime(String DisposalTime) {
        this.DisposalTime = DisposalTime;
    }

    /**
     * Get 安全组地域 
     * @return Region 安全组地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 安全组地域
     * @param Region 安全组地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Ingress入站，Egress出站 
     * @return Direction Ingress入站，Egress出站
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set Ingress入站，Egress出站
     * @param Direction Ingress入站，Egress出站
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    /**
     * Get 风险原因 
     * @return RiskReason 风险原因
     */
    public String getRiskReason() {
        return this.RiskReason;
    }

    /**
     * Set 风险原因
     * @param RiskReason 风险原因
     */
    public void setRiskReason(String RiskReason) {
        this.RiskReason = RiskReason;
    }

    public PolicyRisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PolicyRisk(PolicyRisk source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.RiskCategory != null) {
            this.RiskCategory = new String(source.RiskCategory);
        }
        if (source.RiskSubCategory != null) {
            this.RiskSubCategory = new String(source.RiskSubCategory);
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new Long(source.RiskLevel);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.SgRuleId != null) {
            this.SgRuleId = new String[source.SgRuleId.length];
            for (int i = 0; i < source.SgRuleId.length; i++) {
                this.SgRuleId[i] = new String(source.SgRuleId[i]);
            }
        }
        if (source.RuleCount != null) {
            this.RuleCount = new Long(source.RuleCount);
        }
        if (source.SgId != null) {
            this.SgId = new String[source.SgId.length];
            for (int i = 0; i < source.SgId.length; i++) {
                this.SgId[i] = new String(source.SgId[i]);
            }
        }
        if (source.RiskFeature != null) {
            this.RiskFeature = new String(source.RiskFeature);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.FoundTime != null) {
            this.FoundTime = new String(source.FoundTime);
        }
        if (source.DisposalTime != null) {
            this.DisposalTime = new String(source.DisposalTime);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Direction != null) {
            this.Direction = new String(source.Direction);
        }
        if (source.RiskReason != null) {
            this.RiskReason = new String(source.RiskReason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "RiskCategory", this.RiskCategory);
        this.setParamSimple(map, prefix + "RiskSubCategory", this.RiskSubCategory);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamArraySimple(map, prefix + "SgRuleId.", this.SgRuleId);
        this.setParamSimple(map, prefix + "RuleCount", this.RuleCount);
        this.setParamArraySimple(map, prefix + "SgId.", this.SgId);
        this.setParamSimple(map, prefix + "RiskFeature", this.RiskFeature);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FoundTime", this.FoundTime);
        this.setParamSimple(map, prefix + "DisposalTime", this.DisposalTime);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "RiskReason", this.RiskReason);

    }
}

