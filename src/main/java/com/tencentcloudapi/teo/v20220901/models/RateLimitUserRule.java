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

public class RateLimitUserRule extends AbstractModel{

    /**
    * 速率限制统计阈值，单位是次，取值范围0-4294967294。
    */
    @SerializedName("Threshold")
    @Expose
    private Long Threshold;

    /**
    * 速率限制统计时间，取值范围 10/20/30/40/50/60 单位是秒。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 规则名，只能以英文字符，数字，下划线组合，且不能以下划线开头。
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 处置动作，取值有：
<li>monitor：观察；</li>
<li>drop：拦截；</li>
<li>alg：JavaScript挑战。</li>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 惩罚时长，0-2天。
    */
    @SerializedName("PunishTime")
    @Expose
    private Long PunishTime;

    /**
    * 处罚时长单位，取值有：
<li>second：秒；</li>
<li>minutes：分钟；</li>
<li>hour：小时。</li>
    */
    @SerializedName("PunishTimeUnit")
    @Expose
    private String PunishTimeUnit;

    /**
    * 规则状态，取值有：
<li>on：生效；</li>
<li>off：不生效。</li>默认on生效。
    */
    @SerializedName("RuleStatus")
    @Expose
    private String RuleStatus;

    /**
    * 规则详情。
    */
    @SerializedName("AclConditions")
    @Expose
    private AclCondition [] AclConditions;

    /**
    * 规则权重，取值范围0-100。
    */
    @SerializedName("RulePriority")
    @Expose
    private Long RulePriority;

    /**
    * 规则id。仅出参使用。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleID")
    @Expose
    private Long RuleID;

    /**
    * 过滤词，取值有：
<li>sip：客户端ip。</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FreqFields")
    @Expose
    private String [] FreqFields;

    /**
    * 更新时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 统计范围，字段为null时，代表source_to_eo。取值有：
<li>source_to_eo：（响应）源站到EdgeOne。</li>
<li>client_to_eo：（请求）客户端到EdgeOne；</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FreqScope")
    @Expose
    private String [] FreqScope;

    /**
     * Get 速率限制统计阈值，单位是次，取值范围0-4294967294。 
     * @return Threshold 速率限制统计阈值，单位是次，取值范围0-4294967294。
     */
    public Long getThreshold() {
        return this.Threshold;
    }

    /**
     * Set 速率限制统计阈值，单位是次，取值范围0-4294967294。
     * @param Threshold 速率限制统计阈值，单位是次，取值范围0-4294967294。
     */
    public void setThreshold(Long Threshold) {
        this.Threshold = Threshold;
    }

    /**
     * Get 速率限制统计时间，取值范围 10/20/30/40/50/60 单位是秒。 
     * @return Period 速率限制统计时间，取值范围 10/20/30/40/50/60 单位是秒。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 速率限制统计时间，取值范围 10/20/30/40/50/60 单位是秒。
     * @param Period 速率限制统计时间，取值范围 10/20/30/40/50/60 单位是秒。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 规则名，只能以英文字符，数字，下划线组合，且不能以下划线开头。 
     * @return RuleName 规则名，只能以英文字符，数字，下划线组合，且不能以下划线开头。
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名，只能以英文字符，数字，下划线组合，且不能以下划线开头。
     * @param RuleName 规则名，只能以英文字符，数字，下划线组合，且不能以下划线开头。
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 处置动作，取值有：
<li>monitor：观察；</li>
<li>drop：拦截；</li>
<li>alg：JavaScript挑战。</li> 
     * @return Action 处置动作，取值有：
<li>monitor：观察；</li>
<li>drop：拦截；</li>
<li>alg：JavaScript挑战。</li>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 处置动作，取值有：
<li>monitor：观察；</li>
<li>drop：拦截；</li>
<li>alg：JavaScript挑战。</li>
     * @param Action 处置动作，取值有：
<li>monitor：观察；</li>
<li>drop：拦截；</li>
<li>alg：JavaScript挑战。</li>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 惩罚时长，0-2天。 
     * @return PunishTime 惩罚时长，0-2天。
     */
    public Long getPunishTime() {
        return this.PunishTime;
    }

    /**
     * Set 惩罚时长，0-2天。
     * @param PunishTime 惩罚时长，0-2天。
     */
    public void setPunishTime(Long PunishTime) {
        this.PunishTime = PunishTime;
    }

    /**
     * Get 处罚时长单位，取值有：
<li>second：秒；</li>
<li>minutes：分钟；</li>
<li>hour：小时。</li> 
     * @return PunishTimeUnit 处罚时长单位，取值有：
<li>second：秒；</li>
<li>minutes：分钟；</li>
<li>hour：小时。</li>
     */
    public String getPunishTimeUnit() {
        return this.PunishTimeUnit;
    }

    /**
     * Set 处罚时长单位，取值有：
<li>second：秒；</li>
<li>minutes：分钟；</li>
<li>hour：小时。</li>
     * @param PunishTimeUnit 处罚时长单位，取值有：
<li>second：秒；</li>
<li>minutes：分钟；</li>
<li>hour：小时。</li>
     */
    public void setPunishTimeUnit(String PunishTimeUnit) {
        this.PunishTimeUnit = PunishTimeUnit;
    }

    /**
     * Get 规则状态，取值有：
<li>on：生效；</li>
<li>off：不生效。</li>默认on生效。 
     * @return RuleStatus 规则状态，取值有：
<li>on：生效；</li>
<li>off：不生效。</li>默认on生效。
     */
    public String getRuleStatus() {
        return this.RuleStatus;
    }

    /**
     * Set 规则状态，取值有：
<li>on：生效；</li>
<li>off：不生效。</li>默认on生效。
     * @param RuleStatus 规则状态，取值有：
<li>on：生效；</li>
<li>off：不生效。</li>默认on生效。
     */
    public void setRuleStatus(String RuleStatus) {
        this.RuleStatus = RuleStatus;
    }

    /**
     * Get 规则详情。 
     * @return AclConditions 规则详情。
     */
    public AclCondition [] getAclConditions() {
        return this.AclConditions;
    }

    /**
     * Set 规则详情。
     * @param AclConditions 规则详情。
     */
    public void setAclConditions(AclCondition [] AclConditions) {
        this.AclConditions = AclConditions;
    }

    /**
     * Get 规则权重，取值范围0-100。 
     * @return RulePriority 规则权重，取值范围0-100。
     */
    public Long getRulePriority() {
        return this.RulePriority;
    }

    /**
     * Set 规则权重，取值范围0-100。
     * @param RulePriority 规则权重，取值范围0-100。
     */
    public void setRulePriority(Long RulePriority) {
        this.RulePriority = RulePriority;
    }

    /**
     * Get 规则id。仅出参使用。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleID 规则id。仅出参使用。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleID() {
        return this.RuleID;
    }

    /**
     * Set 规则id。仅出参使用。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleID 规则id。仅出参使用。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleID(Long RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get 过滤词，取值有：
<li>sip：客户端ip。</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FreqFields 过滤词，取值有：
<li>sip：客户端ip。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getFreqFields() {
        return this.FreqFields;
    }

    /**
     * Set 过滤词，取值有：
<li>sip：客户端ip。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FreqFields 过滤词，取值有：
<li>sip：客户端ip。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFreqFields(String [] FreqFields) {
        this.FreqFields = FreqFields;
    }

    /**
     * Get 更新时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 统计范围，字段为null时，代表source_to_eo。取值有：
<li>source_to_eo：（响应）源站到EdgeOne。</li>
<li>client_to_eo：（请求）客户端到EdgeOne；</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FreqScope 统计范围，字段为null时，代表source_to_eo。取值有：
<li>source_to_eo：（响应）源站到EdgeOne。</li>
<li>client_to_eo：（请求）客户端到EdgeOne；</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getFreqScope() {
        return this.FreqScope;
    }

    /**
     * Set 统计范围，字段为null时，代表source_to_eo。取值有：
<li>source_to_eo：（响应）源站到EdgeOne。</li>
<li>client_to_eo：（请求）客户端到EdgeOne；</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FreqScope 统计范围，字段为null时，代表source_to_eo。取值有：
<li>source_to_eo：（响应）源站到EdgeOne。</li>
<li>client_to_eo：（请求）客户端到EdgeOne；</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFreqScope(String [] FreqScope) {
        this.FreqScope = FreqScope;
    }

    public RateLimitUserRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RateLimitUserRule(RateLimitUserRule source) {
        if (source.Threshold != null) {
            this.Threshold = new Long(source.Threshold);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.PunishTime != null) {
            this.PunishTime = new Long(source.PunishTime);
        }
        if (source.PunishTimeUnit != null) {
            this.PunishTimeUnit = new String(source.PunishTimeUnit);
        }
        if (source.RuleStatus != null) {
            this.RuleStatus = new String(source.RuleStatus);
        }
        if (source.AclConditions != null) {
            this.AclConditions = new AclCondition[source.AclConditions.length];
            for (int i = 0; i < source.AclConditions.length; i++) {
                this.AclConditions[i] = new AclCondition(source.AclConditions[i]);
            }
        }
        if (source.RulePriority != null) {
            this.RulePriority = new Long(source.RulePriority);
        }
        if (source.RuleID != null) {
            this.RuleID = new Long(source.RuleID);
        }
        if (source.FreqFields != null) {
            this.FreqFields = new String[source.FreqFields.length];
            for (int i = 0; i < source.FreqFields.length; i++) {
                this.FreqFields[i] = new String(source.FreqFields[i]);
            }
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.FreqScope != null) {
            this.FreqScope = new String[source.FreqScope.length];
            for (int i = 0; i < source.FreqScope.length; i++) {
                this.FreqScope[i] = new String(source.FreqScope[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Threshold", this.Threshold);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "PunishTime", this.PunishTime);
        this.setParamSimple(map, prefix + "PunishTimeUnit", this.PunishTimeUnit);
        this.setParamSimple(map, prefix + "RuleStatus", this.RuleStatus);
        this.setParamArrayObj(map, prefix + "AclConditions.", this.AclConditions);
        this.setParamSimple(map, prefix + "RulePriority", this.RulePriority);
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamArraySimple(map, prefix + "FreqFields.", this.FreqFields);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArraySimple(map, prefix + "FreqScope.", this.FreqScope);

    }
}

