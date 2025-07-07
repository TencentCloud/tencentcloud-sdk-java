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

public class DeleteCustomRuleRequest extends AbstractModel {

    /**
    * 删除的域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 删除的规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * WAF的版本，clb-waf代表负载均衡WAF、sparta-waf代表SaaS WAF，默认是sparta-waf。
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * 批量删除的规则列表
    */
    @SerializedName("DomainRuleIdList")
    @Expose
    private DomainRuleId [] DomainRuleIdList;

    /**
     * Get 删除的域名 
     * @return Domain 删除的域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 删除的域名
     * @param Domain 删除的域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 删除的规则ID 
     * @return RuleId 删除的规则ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 删除的规则ID
     * @param RuleId 删除的规则ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get WAF的版本，clb-waf代表负载均衡WAF、sparta-waf代表SaaS WAF，默认是sparta-waf。 
     * @return Edition WAF的版本，clb-waf代表负载均衡WAF、sparta-waf代表SaaS WAF，默认是sparta-waf。
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set WAF的版本，clb-waf代表负载均衡WAF、sparta-waf代表SaaS WAF，默认是sparta-waf。
     * @param Edition WAF的版本，clb-waf代表负载均衡WAF、sparta-waf代表SaaS WAF，默认是sparta-waf。
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get 批量删除的规则列表 
     * @return DomainRuleIdList 批量删除的规则列表
     */
    public DomainRuleId [] getDomainRuleIdList() {
        return this.DomainRuleIdList;
    }

    /**
     * Set 批量删除的规则列表
     * @param DomainRuleIdList 批量删除的规则列表
     */
    public void setDomainRuleIdList(DomainRuleId [] DomainRuleIdList) {
        this.DomainRuleIdList = DomainRuleIdList;
    }

    public DeleteCustomRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteCustomRuleRequest(DeleteCustomRuleRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.DomainRuleIdList != null) {
            this.DomainRuleIdList = new DomainRuleId[source.DomainRuleIdList.length];
            for (int i = 0; i < source.DomainRuleIdList.length; i++) {
                this.DomainRuleIdList[i] = new DomainRuleId(source.DomainRuleIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamArrayObj(map, prefix + "DomainRuleIdList.", this.DomainRuleIdList);

    }
}

