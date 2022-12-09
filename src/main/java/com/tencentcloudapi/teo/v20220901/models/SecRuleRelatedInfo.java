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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecRuleRelatedInfo extends AbstractModel{

    /**
    * 规则ID。
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 执行动作（处置方式），取值有：
<li>trans ：通过 ；</li>
<li>alg ：算法挑战 ；</li>
<li>drop ：丢弃 ；</li>
<li>ban ：封禁源ip ；</li>
<li>redirect ：重定向 ；</li>
<li>page ：返回指定页面 ；</li>
<li>monitor ：观察 。</li>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 风险等级（waf日志中独有），取值有：
<li>high risk ：高危 ；</li>
<li>middle risk ：中危 ；</li>
<li>low risk ：低危 ；</li>
<li>unkonw ：未知 。</li>
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * 规则等级，取值有：
<li>normal  ：正常 。</li>
    */
    @SerializedName("RuleLevel")
    @Expose
    private String RuleLevel;

    /**
    * 规则描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 规则类型名称。
    */
    @SerializedName("RuleTypeName")
    @Expose
    private String RuleTypeName;

    /**
    * 攻击内容。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttackContent")
    @Expose
    private String AttackContent;

    /**
    * 规则类型，取值有：
<li>waf: 托管规则；</li>
<li>acl：自定义规则；</li>
<li>rate：速率限制规则；</li>
<li>bot：bot防护规则。</li>
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * 规则是否开启。
    */
    @SerializedName("RuleEnabled")
    @Expose
    private Boolean RuleEnabled;

    /**
    * 规则是否存在，取值有：
<li>true: 规则不存在；</li>
<li>false: 规则存在。</li>
    */
    @SerializedName("RuleDeleted")
    @Expose
    private Boolean RuleDeleted;

    /**
    * 规则是否启用监控告警。
    */
    @SerializedName("AlarmEnabled")
    @Expose
    private Boolean AlarmEnabled;

    /**
     * Get 规则ID。 
     * @return RuleId 规则ID。
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则ID。
     * @param RuleId 规则ID。
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 执行动作（处置方式），取值有：
<li>trans ：通过 ；</li>
<li>alg ：算法挑战 ；</li>
<li>drop ：丢弃 ；</li>
<li>ban ：封禁源ip ；</li>
<li>redirect ：重定向 ；</li>
<li>page ：返回指定页面 ；</li>
<li>monitor ：观察 。</li> 
     * @return Action 执行动作（处置方式），取值有：
<li>trans ：通过 ；</li>
<li>alg ：算法挑战 ；</li>
<li>drop ：丢弃 ；</li>
<li>ban ：封禁源ip ；</li>
<li>redirect ：重定向 ；</li>
<li>page ：返回指定页面 ；</li>
<li>monitor ：观察 。</li>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 执行动作（处置方式），取值有：
<li>trans ：通过 ；</li>
<li>alg ：算法挑战 ；</li>
<li>drop ：丢弃 ；</li>
<li>ban ：封禁源ip ；</li>
<li>redirect ：重定向 ；</li>
<li>page ：返回指定页面 ；</li>
<li>monitor ：观察 。</li>
     * @param Action 执行动作（处置方式），取值有：
<li>trans ：通过 ；</li>
<li>alg ：算法挑战 ；</li>
<li>drop ：丢弃 ；</li>
<li>ban ：封禁源ip ；</li>
<li>redirect ：重定向 ；</li>
<li>page ：返回指定页面 ；</li>
<li>monitor ：观察 。</li>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 风险等级（waf日志中独有），取值有：
<li>high risk ：高危 ；</li>
<li>middle risk ：中危 ；</li>
<li>low risk ：低危 ；</li>
<li>unkonw ：未知 。</li> 
     * @return RiskLevel 风险等级（waf日志中独有），取值有：
<li>high risk ：高危 ；</li>
<li>middle risk ：中危 ；</li>
<li>low risk ：低危 ；</li>
<li>unkonw ：未知 。</li>
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 风险等级（waf日志中独有），取值有：
<li>high risk ：高危 ；</li>
<li>middle risk ：中危 ；</li>
<li>low risk ：低危 ；</li>
<li>unkonw ：未知 。</li>
     * @param RiskLevel 风险等级（waf日志中独有），取值有：
<li>high risk ：高危 ；</li>
<li>middle risk ：中危 ；</li>
<li>low risk ：低危 ；</li>
<li>unkonw ：未知 。</li>
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get 规则等级，取值有：
<li>normal  ：正常 。</li> 
     * @return RuleLevel 规则等级，取值有：
<li>normal  ：正常 。</li>
     */
    public String getRuleLevel() {
        return this.RuleLevel;
    }

    /**
     * Set 规则等级，取值有：
<li>normal  ：正常 。</li>
     * @param RuleLevel 规则等级，取值有：
<li>normal  ：正常 。</li>
     */
    public void setRuleLevel(String RuleLevel) {
        this.RuleLevel = RuleLevel;
    }

    /**
     * Get 规则描述。 
     * @return Description 规则描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 规则描述。
     * @param Description 规则描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 规则类型名称。 
     * @return RuleTypeName 规则类型名称。
     */
    public String getRuleTypeName() {
        return this.RuleTypeName;
    }

    /**
     * Set 规则类型名称。
     * @param RuleTypeName 规则类型名称。
     */
    public void setRuleTypeName(String RuleTypeName) {
        this.RuleTypeName = RuleTypeName;
    }

    /**
     * Get 攻击内容。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttackContent 攻击内容。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAttackContent() {
        return this.AttackContent;
    }

    /**
     * Set 攻击内容。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttackContent 攻击内容。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttackContent(String AttackContent) {
        this.AttackContent = AttackContent;
    }

    /**
     * Get 规则类型，取值有：
<li>waf: 托管规则；</li>
<li>acl：自定义规则；</li>
<li>rate：速率限制规则；</li>
<li>bot：bot防护规则。</li> 
     * @return RuleType 规则类型，取值有：
<li>waf: 托管规则；</li>
<li>acl：自定义规则；</li>
<li>rate：速率限制规则；</li>
<li>bot：bot防护规则。</li>
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 规则类型，取值有：
<li>waf: 托管规则；</li>
<li>acl：自定义规则；</li>
<li>rate：速率限制规则；</li>
<li>bot：bot防护规则。</li>
     * @param RuleType 规则类型，取值有：
<li>waf: 托管规则；</li>
<li>acl：自定义规则；</li>
<li>rate：速率限制规则；</li>
<li>bot：bot防护规则。</li>
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get 规则是否开启。 
     * @return RuleEnabled 规则是否开启。
     */
    public Boolean getRuleEnabled() {
        return this.RuleEnabled;
    }

    /**
     * Set 规则是否开启。
     * @param RuleEnabled 规则是否开启。
     */
    public void setRuleEnabled(Boolean RuleEnabled) {
        this.RuleEnabled = RuleEnabled;
    }

    /**
     * Get 规则是否存在，取值有：
<li>true: 规则不存在；</li>
<li>false: 规则存在。</li> 
     * @return RuleDeleted 规则是否存在，取值有：
<li>true: 规则不存在；</li>
<li>false: 规则存在。</li>
     */
    public Boolean getRuleDeleted() {
        return this.RuleDeleted;
    }

    /**
     * Set 规则是否存在，取值有：
<li>true: 规则不存在；</li>
<li>false: 规则存在。</li>
     * @param RuleDeleted 规则是否存在，取值有：
<li>true: 规则不存在；</li>
<li>false: 规则存在。</li>
     */
    public void setRuleDeleted(Boolean RuleDeleted) {
        this.RuleDeleted = RuleDeleted;
    }

    /**
     * Get 规则是否启用监控告警。 
     * @return AlarmEnabled 规则是否启用监控告警。
     */
    public Boolean getAlarmEnabled() {
        return this.AlarmEnabled;
    }

    /**
     * Set 规则是否启用监控告警。
     * @param AlarmEnabled 规则是否启用监控告警。
     */
    public void setAlarmEnabled(Boolean AlarmEnabled) {
        this.AlarmEnabled = AlarmEnabled;
    }

    public SecRuleRelatedInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecRuleRelatedInfo(SecRuleRelatedInfo source) {
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.RuleLevel != null) {
            this.RuleLevel = new String(source.RuleLevel);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RuleTypeName != null) {
            this.RuleTypeName = new String(source.RuleTypeName);
        }
        if (source.AttackContent != null) {
            this.AttackContent = new String(source.AttackContent);
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.RuleEnabled != null) {
            this.RuleEnabled = new Boolean(source.RuleEnabled);
        }
        if (source.RuleDeleted != null) {
            this.RuleDeleted = new Boolean(source.RuleDeleted);
        }
        if (source.AlarmEnabled != null) {
            this.AlarmEnabled = new Boolean(source.AlarmEnabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "RuleLevel", this.RuleLevel);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RuleTypeName", this.RuleTypeName);
        this.setParamSimple(map, prefix + "AttackContent", this.AttackContent);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "RuleEnabled", this.RuleEnabled);
        this.setParamSimple(map, prefix + "RuleDeleted", this.RuleDeleted);
        this.setParamSimple(map, prefix + "AlarmEnabled", this.AlarmEnabled);

    }
}

