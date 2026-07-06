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

public class RiskCategoryItem extends AbstractModel {

    /**
    * 风险大类ID
    */
    @SerializedName("CategoryId")
    @Expose
    private String CategoryId;

    /**
    * 风险大类名称
    */
    @SerializedName("CategoryName")
    @Expose
    private String CategoryName;

    /**
    * 风险子类ID
    */
    @SerializedName("SubcategoryId")
    @Expose
    private String SubcategoryId;

    /**
    * 风险子类名称
    */
    @SerializedName("SubcategoryName")
    @Expose
    private String SubcategoryName;

    /**
    * 风险等级(0-低危,1-中危,2-高危)
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long RiskLevel;

    /**
    * 风险等级名称(低/中/高)
    */
    @SerializedName("RiskLevelName")
    @Expose
    private String RiskLevelName;

    /**
    * 风险描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 处置建议
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 该类风险的规则数量
    */
    @SerializedName("RuleCount")
    @Expose
    private Long RuleCount;

    /**
    * 已处置数量
    */
    @SerializedName("TreatedCount")
    @Expose
    private Long TreatedCount;

    /**
    * 已忽略数量
    */
    @SerializedName("IgnoredCount")
    @Expose
    private Long IgnoredCount;

    /**
    * 待整改数量
    */
    @SerializedName("UntreatedCount")
    @Expose
    private Long UntreatedCount;

    /**
    * 整改率(百分比字符串)
    */
    @SerializedName("DisposalRate")
    @Expose
    private Long DisposalRate;

    /**
    * 是否有未处理风险
-1: 未体检
0: 无风险
1: 有风险
    */
    @SerializedName("HasRisk")
    @Expose
    private Long HasRisk;

    /**
    * 整改状态：
Completed： 已整改完成（整改率 100%）
Incomplete： 未整改完成（整改率 < 100%）
-：未体检/无数据
    */
    @SerializedName("RemediationStatus")
    @Expose
    private String RemediationStatus;

    /**
     * Get 风险大类ID 
     * @return CategoryId 风险大类ID
     */
    public String getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set 风险大类ID
     * @param CategoryId 风险大类ID
     */
    public void setCategoryId(String CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get 风险大类名称 
     * @return CategoryName 风险大类名称
     */
    public String getCategoryName() {
        return this.CategoryName;
    }

    /**
     * Set 风险大类名称
     * @param CategoryName 风险大类名称
     */
    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    /**
     * Get 风险子类ID 
     * @return SubcategoryId 风险子类ID
     */
    public String getSubcategoryId() {
        return this.SubcategoryId;
    }

    /**
     * Set 风险子类ID
     * @param SubcategoryId 风险子类ID
     */
    public void setSubcategoryId(String SubcategoryId) {
        this.SubcategoryId = SubcategoryId;
    }

    /**
     * Get 风险子类名称 
     * @return SubcategoryName 风险子类名称
     */
    public String getSubcategoryName() {
        return this.SubcategoryName;
    }

    /**
     * Set 风险子类名称
     * @param SubcategoryName 风险子类名称
     */
    public void setSubcategoryName(String SubcategoryName) {
        this.SubcategoryName = SubcategoryName;
    }

    /**
     * Get 风险等级(0-低危,1-中危,2-高危) 
     * @return RiskLevel 风险等级(0-低危,1-中危,2-高危)
     */
    public Long getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 风险等级(0-低危,1-中危,2-高危)
     * @param RiskLevel 风险等级(0-低危,1-中危,2-高危)
     */
    public void setRiskLevel(Long RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get 风险等级名称(低/中/高) 
     * @return RiskLevelName 风险等级名称(低/中/高)
     */
    public String getRiskLevelName() {
        return this.RiskLevelName;
    }

    /**
     * Set 风险等级名称(低/中/高)
     * @param RiskLevelName 风险等级名称(低/中/高)
     */
    public void setRiskLevelName(String RiskLevelName) {
        this.RiskLevelName = RiskLevelName;
    }

    /**
     * Get 风险描述 
     * @return Description 风险描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 风险描述
     * @param Description 风险描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
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
     * Get 该类风险的规则数量 
     * @return RuleCount 该类风险的规则数量
     */
    public Long getRuleCount() {
        return this.RuleCount;
    }

    /**
     * Set 该类风险的规则数量
     * @param RuleCount 该类风险的规则数量
     */
    public void setRuleCount(Long RuleCount) {
        this.RuleCount = RuleCount;
    }

    /**
     * Get 已处置数量 
     * @return TreatedCount 已处置数量
     */
    public Long getTreatedCount() {
        return this.TreatedCount;
    }

    /**
     * Set 已处置数量
     * @param TreatedCount 已处置数量
     */
    public void setTreatedCount(Long TreatedCount) {
        this.TreatedCount = TreatedCount;
    }

    /**
     * Get 已忽略数量 
     * @return IgnoredCount 已忽略数量
     */
    public Long getIgnoredCount() {
        return this.IgnoredCount;
    }

    /**
     * Set 已忽略数量
     * @param IgnoredCount 已忽略数量
     */
    public void setIgnoredCount(Long IgnoredCount) {
        this.IgnoredCount = IgnoredCount;
    }

    /**
     * Get 待整改数量 
     * @return UntreatedCount 待整改数量
     */
    public Long getUntreatedCount() {
        return this.UntreatedCount;
    }

    /**
     * Set 待整改数量
     * @param UntreatedCount 待整改数量
     */
    public void setUntreatedCount(Long UntreatedCount) {
        this.UntreatedCount = UntreatedCount;
    }

    /**
     * Get 整改率(百分比字符串) 
     * @return DisposalRate 整改率(百分比字符串)
     */
    public Long getDisposalRate() {
        return this.DisposalRate;
    }

    /**
     * Set 整改率(百分比字符串)
     * @param DisposalRate 整改率(百分比字符串)
     */
    public void setDisposalRate(Long DisposalRate) {
        this.DisposalRate = DisposalRate;
    }

    /**
     * Get 是否有未处理风险
-1: 未体检
0: 无风险
1: 有风险 
     * @return HasRisk 是否有未处理风险
-1: 未体检
0: 无风险
1: 有风险
     */
    public Long getHasRisk() {
        return this.HasRisk;
    }

    /**
     * Set 是否有未处理风险
-1: 未体检
0: 无风险
1: 有风险
     * @param HasRisk 是否有未处理风险
-1: 未体检
0: 无风险
1: 有风险
     */
    public void setHasRisk(Long HasRisk) {
        this.HasRisk = HasRisk;
    }

    /**
     * Get 整改状态：
Completed： 已整改完成（整改率 100%）
Incomplete： 未整改完成（整改率 < 100%）
-：未体检/无数据 
     * @return RemediationStatus 整改状态：
Completed： 已整改完成（整改率 100%）
Incomplete： 未整改完成（整改率 < 100%）
-：未体检/无数据
     */
    public String getRemediationStatus() {
        return this.RemediationStatus;
    }

    /**
     * Set 整改状态：
Completed： 已整改完成（整改率 100%）
Incomplete： 未整改完成（整改率 < 100%）
-：未体检/无数据
     * @param RemediationStatus 整改状态：
Completed： 已整改完成（整改率 100%）
Incomplete： 未整改完成（整改率 < 100%）
-：未体检/无数据
     */
    public void setRemediationStatus(String RemediationStatus) {
        this.RemediationStatus = RemediationStatus;
    }

    public RiskCategoryItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RiskCategoryItem(RiskCategoryItem source) {
        if (source.CategoryId != null) {
            this.CategoryId = new String(source.CategoryId);
        }
        if (source.CategoryName != null) {
            this.CategoryName = new String(source.CategoryName);
        }
        if (source.SubcategoryId != null) {
            this.SubcategoryId = new String(source.SubcategoryId);
        }
        if (source.SubcategoryName != null) {
            this.SubcategoryName = new String(source.SubcategoryName);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new Long(source.RiskLevel);
        }
        if (source.RiskLevelName != null) {
            this.RiskLevelName = new String(source.RiskLevelName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.RuleCount != null) {
            this.RuleCount = new Long(source.RuleCount);
        }
        if (source.TreatedCount != null) {
            this.TreatedCount = new Long(source.TreatedCount);
        }
        if (source.IgnoredCount != null) {
            this.IgnoredCount = new Long(source.IgnoredCount);
        }
        if (source.UntreatedCount != null) {
            this.UntreatedCount = new Long(source.UntreatedCount);
        }
        if (source.DisposalRate != null) {
            this.DisposalRate = new Long(source.DisposalRate);
        }
        if (source.HasRisk != null) {
            this.HasRisk = new Long(source.HasRisk);
        }
        if (source.RemediationStatus != null) {
            this.RemediationStatus = new String(source.RemediationStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "CategoryName", this.CategoryName);
        this.setParamSimple(map, prefix + "SubcategoryId", this.SubcategoryId);
        this.setParamSimple(map, prefix + "SubcategoryName", this.SubcategoryName);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "RiskLevelName", this.RiskLevelName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "RuleCount", this.RuleCount);
        this.setParamSimple(map, prefix + "TreatedCount", this.TreatedCount);
        this.setParamSimple(map, prefix + "IgnoredCount", this.IgnoredCount);
        this.setParamSimple(map, prefix + "UntreatedCount", this.UntreatedCount);
        this.setParamSimple(map, prefix + "DisposalRate", this.DisposalRate);
        this.setParamSimple(map, prefix + "HasRisk", this.HasRisk);
        this.setParamSimple(map, prefix + "RemediationStatus", this.RemediationStatus);

    }
}

