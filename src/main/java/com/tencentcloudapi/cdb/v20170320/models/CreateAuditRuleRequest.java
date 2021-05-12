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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAuditRuleRequest extends AbstractModel{

    /**
    * 审计规则名称。
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 审计规则描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 审计规则过滤条件。若设置了过滤条件，则不会开启全审计。
    */
    @SerializedName("RuleFilters")
    @Expose
    private AuditFilter [] RuleFilters;

    /**
    * 是否开启全审计。支持值包括：false – 不开启全审计，true – 开启全审计。用户未设置审计规则过滤条件时，默认开启全审计。
    */
    @SerializedName("AuditAll")
    @Expose
    private Boolean AuditAll;

    /**
     * Get 审计规则名称。 
     * @return RuleName 审计规则名称。
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 审计规则名称。
     * @param RuleName 审计规则名称。
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 审计规则描述。 
     * @return Description 审计规则描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 审计规则描述。
     * @param Description 审计规则描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 审计规则过滤条件。若设置了过滤条件，则不会开启全审计。 
     * @return RuleFilters 审计规则过滤条件。若设置了过滤条件，则不会开启全审计。
     */
    public AuditFilter [] getRuleFilters() {
        return this.RuleFilters;
    }

    /**
     * Set 审计规则过滤条件。若设置了过滤条件，则不会开启全审计。
     * @param RuleFilters 审计规则过滤条件。若设置了过滤条件，则不会开启全审计。
     */
    public void setRuleFilters(AuditFilter [] RuleFilters) {
        this.RuleFilters = RuleFilters;
    }

    /**
     * Get 是否开启全审计。支持值包括：false – 不开启全审计，true – 开启全审计。用户未设置审计规则过滤条件时，默认开启全审计。 
     * @return AuditAll 是否开启全审计。支持值包括：false – 不开启全审计，true – 开启全审计。用户未设置审计规则过滤条件时，默认开启全审计。
     */
    public Boolean getAuditAll() {
        return this.AuditAll;
    }

    /**
     * Set 是否开启全审计。支持值包括：false – 不开启全审计，true – 开启全审计。用户未设置审计规则过滤条件时，默认开启全审计。
     * @param AuditAll 是否开启全审计。支持值包括：false – 不开启全审计，true – 开启全审计。用户未设置审计规则过滤条件时，默认开启全审计。
     */
    public void setAuditAll(Boolean AuditAll) {
        this.AuditAll = AuditAll;
    }

    public CreateAuditRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAuditRuleRequest(CreateAuditRuleRequest source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RuleFilters != null) {
            this.RuleFilters = new AuditFilter[source.RuleFilters.length];
            for (int i = 0; i < source.RuleFilters.length; i++) {
                this.RuleFilters[i] = new AuditFilter(source.RuleFilters[i]);
            }
        }
        if (source.AuditAll != null) {
            this.AuditAll = new Boolean(source.AuditAll);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "RuleFilters.", this.RuleFilters);
        this.setParamSimple(map, prefix + "AuditAll", this.AuditAll);

    }
}

