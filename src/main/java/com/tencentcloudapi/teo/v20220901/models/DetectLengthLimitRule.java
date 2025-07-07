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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetectLengthLimitRule extends AbstractModel {

    /**
    * 规则Id。仅出参使用。
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 规则名称。仅出参使用。
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 规则描述，仅出参使用。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 规则配置条件。仅出参使用。
    */
    @SerializedName("Conditions")
    @Expose
    private DetectLengthLimitCondition [] Conditions;

    /**
    * 处置方式，取值有：
<li>skip：当请求正文数据超过 Conditions 出参中 body_depth 设置的检测深度时，跳过所有请求正文内容的检测；</li>
<li>scan：仅检测 Conditions 出参中 body_depth 设置的检测深度，对超出部分的请求正文内容直接截断处理，超出部分的请求正文不会经过安全检测。</li>仅出参使用。
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
     * Get 规则Id。仅出参使用。 
     * @return RuleId 规则Id。仅出参使用。
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则Id。仅出参使用。
     * @param RuleId 规则Id。仅出参使用。
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 规则名称。仅出参使用。 
     * @return RuleName 规则名称。仅出参使用。
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名称。仅出参使用。
     * @param RuleName 规则名称。仅出参使用。
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 规则描述，仅出参使用。 
     * @return Description 规则描述，仅出参使用。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 规则描述，仅出参使用。
     * @param Description 规则描述，仅出参使用。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 规则配置条件。仅出参使用。 
     * @return Conditions 规则配置条件。仅出参使用。
     */
    public DetectLengthLimitCondition [] getConditions() {
        return this.Conditions;
    }

    /**
     * Set 规则配置条件。仅出参使用。
     * @param Conditions 规则配置条件。仅出参使用。
     */
    public void setConditions(DetectLengthLimitCondition [] Conditions) {
        this.Conditions = Conditions;
    }

    /**
     * Get 处置方式，取值有：
<li>skip：当请求正文数据超过 Conditions 出参中 body_depth 设置的检测深度时，跳过所有请求正文内容的检测；</li>
<li>scan：仅检测 Conditions 出参中 body_depth 设置的检测深度，对超出部分的请求正文内容直接截断处理，超出部分的请求正文不会经过安全检测。</li>仅出参使用。 
     * @return Action 处置方式，取值有：
<li>skip：当请求正文数据超过 Conditions 出参中 body_depth 设置的检测深度时，跳过所有请求正文内容的检测；</li>
<li>scan：仅检测 Conditions 出参中 body_depth 设置的检测深度，对超出部分的请求正文内容直接截断处理，超出部分的请求正文不会经过安全检测。</li>仅出参使用。
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 处置方式，取值有：
<li>skip：当请求正文数据超过 Conditions 出参中 body_depth 设置的检测深度时，跳过所有请求正文内容的检测；</li>
<li>scan：仅检测 Conditions 出参中 body_depth 设置的检测深度，对超出部分的请求正文内容直接截断处理，超出部分的请求正文不会经过安全检测。</li>仅出参使用。
     * @param Action 处置方式，取值有：
<li>skip：当请求正文数据超过 Conditions 出参中 body_depth 设置的检测深度时，跳过所有请求正文内容的检测；</li>
<li>scan：仅检测 Conditions 出参中 body_depth 设置的检测深度，对超出部分的请求正文内容直接截断处理，超出部分的请求正文不会经过安全检测。</li>仅出参使用。
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    public DetectLengthLimitRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetectLengthLimitRule(DetectLengthLimitRule source) {
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Conditions != null) {
            this.Conditions = new DetectLengthLimitCondition[source.Conditions.length];
            for (int i = 0; i < source.Conditions.length; i++) {
                this.Conditions[i] = new DetectLengthLimitCondition(source.Conditions[i]);
            }
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "Conditions.", this.Conditions);
        this.setParamSimple(map, prefix + "Action", this.Action);

    }
}

