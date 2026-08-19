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

public class ExposeRuleItem extends AbstractModel {

    /**
    * 规则类型
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * 风险等级
    */
    @SerializedName("Severity")
    @Expose
    private String Severity;

    /**
    * 规则名称
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 修复建议
    */
    @SerializedName("FixAdvice")
    @Expose
    private String FixAdvice;

    /**
     * Get 规则类型 
     * @return RuleType 规则类型
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 规则类型
     * @param RuleType 规则类型
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get 风险等级 
     * @return Severity 风险等级
     */
    public String getSeverity() {
        return this.Severity;
    }

    /**
     * Set 风险等级
     * @param Severity 风险等级
     */
    public void setSeverity(String Severity) {
        this.Severity = Severity;
    }

    /**
     * Get 规则名称 
     * @return Title 规则名称
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 规则名称
     * @param Title 规则名称
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 修复建议 
     * @return FixAdvice 修复建议
     */
    public String getFixAdvice() {
        return this.FixAdvice;
    }

    /**
     * Set 修复建议
     * @param FixAdvice 修复建议
     */
    public void setFixAdvice(String FixAdvice) {
        this.FixAdvice = FixAdvice;
    }

    public ExposeRuleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExposeRuleItem(ExposeRuleItem source) {
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.Severity != null) {
            this.Severity = new String(source.Severity);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.FixAdvice != null) {
            this.FixAdvice = new String(source.FixAdvice);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "Severity", this.Severity);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "FixAdvice", this.FixAdvice);

    }
}

