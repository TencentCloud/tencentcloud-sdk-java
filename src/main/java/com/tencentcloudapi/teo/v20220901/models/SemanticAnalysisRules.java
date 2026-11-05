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

public class SemanticAnalysisRules extends AbstractModel {

    /**
    * <p>深度分析规则是否开启。取值有：<li>on：开启，深度分析规则生效；</li><li>off：关闭，深度分析规则不生效。</li></p>
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
    * <p>深度分析下规则项的具体配置。</p>
    */
    @SerializedName("RuleActions")
    @Expose
    private ManagedRuleAction [] RuleActions;

    /**
    * <p>深度分析配置信息，仅出参使用。</p>
    */
    @SerializedName("MetaData")
    @Expose
    private ManagedRuleGroupMeta MetaData;

    /**
     * Get <p>深度分析规则是否开启。取值有：<li>on：开启，深度分析规则生效；</li><li>off：关闭，深度分析规则不生效。</li></p> 
     * @return Enabled <p>深度分析规则是否开启。取值有：<li>on：开启，深度分析规则生效；</li><li>off：关闭，深度分析规则不生效。</li></p>
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>深度分析规则是否开启。取值有：<li>on：开启，深度分析规则生效；</li><li>off：关闭，深度分析规则不生效。</li></p>
     * @param Enabled <p>深度分析规则是否开启。取值有：<li>on：开启，深度分析规则生效；</li><li>off：关闭，深度分析规则不生效。</li></p>
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>深度分析下规则项的具体配置。</p> 
     * @return RuleActions <p>深度分析下规则项的具体配置。</p>
     */
    public ManagedRuleAction [] getRuleActions() {
        return this.RuleActions;
    }

    /**
     * Set <p>深度分析下规则项的具体配置。</p>
     * @param RuleActions <p>深度分析下规则项的具体配置。</p>
     */
    public void setRuleActions(ManagedRuleAction [] RuleActions) {
        this.RuleActions = RuleActions;
    }

    /**
     * Get <p>深度分析配置信息，仅出参使用。</p> 
     * @return MetaData <p>深度分析配置信息，仅出参使用。</p>
     */
    public ManagedRuleGroupMeta getMetaData() {
        return this.MetaData;
    }

    /**
     * Set <p>深度分析配置信息，仅出参使用。</p>
     * @param MetaData <p>深度分析配置信息，仅出参使用。</p>
     */
    public void setMetaData(ManagedRuleGroupMeta MetaData) {
        this.MetaData = MetaData;
    }

    public SemanticAnalysisRules() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SemanticAnalysisRules(SemanticAnalysisRules source) {
        if (source.Enabled != null) {
            this.Enabled = new String(source.Enabled);
        }
        if (source.RuleActions != null) {
            this.RuleActions = new ManagedRuleAction[source.RuleActions.length];
            for (int i = 0; i < source.RuleActions.length; i++) {
                this.RuleActions[i] = new ManagedRuleAction(source.RuleActions[i]);
            }
        }
        if (source.MetaData != null) {
            this.MetaData = new ManagedRuleGroupMeta(source.MetaData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamArrayObj(map, prefix + "RuleActions.", this.RuleActions);
        this.setParamObj(map, prefix + "MetaData.", this.MetaData);

    }
}

