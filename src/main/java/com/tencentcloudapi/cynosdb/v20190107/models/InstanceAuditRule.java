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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceAuditRule extends AbstractModel {

    /**
    * 实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 是否是规则审计。true-规则审计，false-全审计。
    */
    @SerializedName("AuditRule")
    @Expose
    private Boolean AuditRule;

    /**
    * 审计规则详情。仅当AuditRule=true时有效。
    */
    @SerializedName("AuditRuleFilters")
    @Expose
    private AuditRuleFilters [] AuditRuleFilters;

    /**
    * 是否是审计策略
    */
    @SerializedName("OldRule")
    @Expose
    private Boolean OldRule;

    /**
    * 实例应用的规则模板详情
    */
    @SerializedName("RuleTemplates")
    @Expose
    private RuleTemplateInfo [] RuleTemplates;

    /**
     * Get 实例ID。 
     * @return InstanceId 实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID。
     * @param InstanceId 实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 是否是规则审计。true-规则审计，false-全审计。 
     * @return AuditRule 是否是规则审计。true-规则审计，false-全审计。
     */
    public Boolean getAuditRule() {
        return this.AuditRule;
    }

    /**
     * Set 是否是规则审计。true-规则审计，false-全审计。
     * @param AuditRule 是否是规则审计。true-规则审计，false-全审计。
     */
    public void setAuditRule(Boolean AuditRule) {
        this.AuditRule = AuditRule;
    }

    /**
     * Get 审计规则详情。仅当AuditRule=true时有效。 
     * @return AuditRuleFilters 审计规则详情。仅当AuditRule=true时有效。
     */
    public AuditRuleFilters [] getAuditRuleFilters() {
        return this.AuditRuleFilters;
    }

    /**
     * Set 审计规则详情。仅当AuditRule=true时有效。
     * @param AuditRuleFilters 审计规则详情。仅当AuditRule=true时有效。
     */
    public void setAuditRuleFilters(AuditRuleFilters [] AuditRuleFilters) {
        this.AuditRuleFilters = AuditRuleFilters;
    }

    /**
     * Get 是否是审计策略 
     * @return OldRule 是否是审计策略
     */
    public Boolean getOldRule() {
        return this.OldRule;
    }

    /**
     * Set 是否是审计策略
     * @param OldRule 是否是审计策略
     */
    public void setOldRule(Boolean OldRule) {
        this.OldRule = OldRule;
    }

    /**
     * Get 实例应用的规则模板详情 
     * @return RuleTemplates 实例应用的规则模板详情
     */
    public RuleTemplateInfo [] getRuleTemplates() {
        return this.RuleTemplates;
    }

    /**
     * Set 实例应用的规则模板详情
     * @param RuleTemplates 实例应用的规则模板详情
     */
    public void setRuleTemplates(RuleTemplateInfo [] RuleTemplates) {
        this.RuleTemplates = RuleTemplates;
    }

    public InstanceAuditRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceAuditRule(InstanceAuditRule source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AuditRule != null) {
            this.AuditRule = new Boolean(source.AuditRule);
        }
        if (source.AuditRuleFilters != null) {
            this.AuditRuleFilters = new AuditRuleFilters[source.AuditRuleFilters.length];
            for (int i = 0; i < source.AuditRuleFilters.length; i++) {
                this.AuditRuleFilters[i] = new AuditRuleFilters(source.AuditRuleFilters[i]);
            }
        }
        if (source.OldRule != null) {
            this.OldRule = new Boolean(source.OldRule);
        }
        if (source.RuleTemplates != null) {
            this.RuleTemplates = new RuleTemplateInfo[source.RuleTemplates.length];
            for (int i = 0; i < source.RuleTemplates.length; i++) {
                this.RuleTemplates[i] = new RuleTemplateInfo(source.RuleTemplates[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AuditRule", this.AuditRule);
        this.setParamArrayObj(map, prefix + "AuditRuleFilters.", this.AuditRuleFilters);
        this.setParamSimple(map, prefix + "OldRule", this.OldRule);
        this.setParamArrayObj(map, prefix + "RuleTemplates.", this.RuleTemplates);

    }
}

