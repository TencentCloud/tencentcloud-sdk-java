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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClawRiskItem extends AbstractModel {

    /**
    * 风险类别
    */
    @SerializedName("RiskType")
    @Expose
    private String RiskType;

    /**
    * 规则id
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 规则名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 分数
    */
    @SerializedName("Score")
    @Expose
    private Float Score;

    /**
     * Get 风险类别 
     * @return RiskType 风险类别
     */
    public String getRiskType() {
        return this.RiskType;
    }

    /**
     * Set 风险类别
     * @param RiskType 风险类别
     */
    public void setRiskType(String RiskType) {
        this.RiskType = RiskType;
    }

    /**
     * Get 规则id 
     * @return RuleId 规则id
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则id
     * @param RuleId 规则id
     */
    public void setRuleId(String RuleId) {
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
     * Get 分数 
     * @return Score 分数
     */
    public Float getScore() {
        return this.Score;
    }

    /**
     * Set 分数
     * @param Score 分数
     */
    public void setScore(Float Score) {
        this.Score = Score;
    }

    public ClawRiskItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClawRiskItem(ClawRiskItem source) {
        if (source.RiskType != null) {
            this.RiskType = new String(source.RiskType);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Score != null) {
            this.Score = new Float(source.Score);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RiskType", this.RiskType);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Score", this.Score);

    }
}

