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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAttackWhiteRuleRequest extends AbstractModel {

    /**
    * 规则序号
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 规则Id
    */
    @SerializedName("SignatureId")
    @Expose
    private String SignatureId;

    /**
    * 规则状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 匹配规则项列表
    */
    @SerializedName("Rules")
    @Expose
    private UserWhiteRuleItem [] Rules;

    /**
     * Get 规则序号 
     * @return RuleId 规则序号
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则序号
     * @param RuleId 规则序号
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 规则Id 
     * @return SignatureId 规则Id
     */
    public String getSignatureId() {
        return this.SignatureId;
    }

    /**
     * Set 规则Id
     * @param SignatureId 规则Id
     */
    public void setSignatureId(String SignatureId) {
        this.SignatureId = SignatureId;
    }

    /**
     * Get 规则状态 
     * @return Status 规则状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 规则状态
     * @param Status 规则状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 匹配规则项列表 
     * @return Rules 匹配规则项列表
     */
    public UserWhiteRuleItem [] getRules() {
        return this.Rules;
    }

    /**
     * Set 匹配规则项列表
     * @param Rules 匹配规则项列表
     */
    public void setRules(UserWhiteRuleItem [] Rules) {
        this.Rules = Rules;
    }

    public ModifyAttackWhiteRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAttackWhiteRuleRequest(ModifyAttackWhiteRuleRequest source) {
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.SignatureId != null) {
            this.SignatureId = new String(source.SignatureId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Rules != null) {
            this.Rules = new UserWhiteRuleItem[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new UserWhiteRuleItem(source.Rules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "SignatureId", this.SignatureId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);

    }
}

