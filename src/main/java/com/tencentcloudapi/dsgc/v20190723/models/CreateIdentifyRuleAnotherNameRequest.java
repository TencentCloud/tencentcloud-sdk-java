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

public class CreateIdentifyRuleAnotherNameRequest extends AbstractModel {

    /**
    * DSPA实例ID
    */
    @SerializedName("DspaId")
    @Expose
    private String DspaId;

    /**
    * 合规组ID
    */
    @SerializedName("ComplianceId")
    @Expose
    private Long ComplianceId;

    /**
    * 规则绑定的分类id
    */
    @SerializedName("CategoryId")
    @Expose
    private Long CategoryId;

    /**
    * 规则id
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 规则名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 规则别名
    */
    @SerializedName("AnotherName")
    @Expose
    private String AnotherName;

    /**
    * 别名规则id
    */
    @SerializedName("AliasRuleId")
    @Expose
    private Long AliasRuleId;

    /**
    * 别名规则名称
    */
    @SerializedName("AliasRuleName")
    @Expose
    private String AliasRuleName;

    /**
     * Get DSPA实例ID 
     * @return DspaId DSPA实例ID
     */
    public String getDspaId() {
        return this.DspaId;
    }

    /**
     * Set DSPA实例ID
     * @param DspaId DSPA实例ID
     */
    public void setDspaId(String DspaId) {
        this.DspaId = DspaId;
    }

    /**
     * Get 合规组ID 
     * @return ComplianceId 合规组ID
     */
    public Long getComplianceId() {
        return this.ComplianceId;
    }

    /**
     * Set 合规组ID
     * @param ComplianceId 合规组ID
     */
    public void setComplianceId(Long ComplianceId) {
        this.ComplianceId = ComplianceId;
    }

    /**
     * Get 规则绑定的分类id 
     * @return CategoryId 规则绑定的分类id
     */
    public Long getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set 规则绑定的分类id
     * @param CategoryId 规则绑定的分类id
     */
    public void setCategoryId(Long CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get 规则id 
     * @return RuleId 规则id
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则id
     * @param RuleId 规则id
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 规则名称 
     * @return RuleName 规则名称
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名称
     * @param RuleName 规则名称
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 规则别名 
     * @return AnotherName 规则别名
     */
    public String getAnotherName() {
        return this.AnotherName;
    }

    /**
     * Set 规则别名
     * @param AnotherName 规则别名
     */
    public void setAnotherName(String AnotherName) {
        this.AnotherName = AnotherName;
    }

    /**
     * Get 别名规则id 
     * @return AliasRuleId 别名规则id
     */
    public Long getAliasRuleId() {
        return this.AliasRuleId;
    }

    /**
     * Set 别名规则id
     * @param AliasRuleId 别名规则id
     */
    public void setAliasRuleId(Long AliasRuleId) {
        this.AliasRuleId = AliasRuleId;
    }

    /**
     * Get 别名规则名称 
     * @return AliasRuleName 别名规则名称
     */
    public String getAliasRuleName() {
        return this.AliasRuleName;
    }

    /**
     * Set 别名规则名称
     * @param AliasRuleName 别名规则名称
     */
    public void setAliasRuleName(String AliasRuleName) {
        this.AliasRuleName = AliasRuleName;
    }

    public CreateIdentifyRuleAnotherNameRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateIdentifyRuleAnotherNameRequest(CreateIdentifyRuleAnotherNameRequest source) {
        if (source.DspaId != null) {
            this.DspaId = new String(source.DspaId);
        }
        if (source.ComplianceId != null) {
            this.ComplianceId = new Long(source.ComplianceId);
        }
        if (source.CategoryId != null) {
            this.CategoryId = new Long(source.CategoryId);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.AnotherName != null) {
            this.AnotherName = new String(source.AnotherName);
        }
        if (source.AliasRuleId != null) {
            this.AliasRuleId = new Long(source.AliasRuleId);
        }
        if (source.AliasRuleName != null) {
            this.AliasRuleName = new String(source.AliasRuleName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DspaId", this.DspaId);
        this.setParamSimple(map, prefix + "ComplianceId", this.ComplianceId);
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "AnotherName", this.AnotherName);
        this.setParamSimple(map, prefix + "AliasRuleId", this.AliasRuleId);
        this.setParamSimple(map, prefix + "AliasRuleName", this.AliasRuleName);

    }
}

