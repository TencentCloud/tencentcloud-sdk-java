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

public class DescribeSecurityRuleIdRequest extends AbstractModel{

    /**
    * 规则类型，取值有：
<li>waf：web托管规则；</li>
<li>acl：自定义规则；</li>
<li>rate：速率限制规则；</li>
<li>bot：Bot基础规则。</li>
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * 子域名/应用名。
    */
    @SerializedName("Entity")
    @Expose
    private String Entity;

    /**
    * 规则Id数组。 当为空时查询 子域名或者应用名下所有规则
    */
    @SerializedName("RuleIdList")
    @Expose
    private Long [] RuleIdList;

    /**
    * 子域名数组。
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
     * Get 规则类型，取值有：
<li>waf：web托管规则；</li>
<li>acl：自定义规则；</li>
<li>rate：速率限制规则；</li>
<li>bot：Bot基础规则。</li> 
     * @return RuleType 规则类型，取值有：
<li>waf：web托管规则；</li>
<li>acl：自定义规则；</li>
<li>rate：速率限制规则；</li>
<li>bot：Bot基础规则。</li>
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 规则类型，取值有：
<li>waf：web托管规则；</li>
<li>acl：自定义规则；</li>
<li>rate：速率限制规则；</li>
<li>bot：Bot基础规则。</li>
     * @param RuleType 规则类型，取值有：
<li>waf：web托管规则；</li>
<li>acl：自定义规则；</li>
<li>rate：速率限制规则；</li>
<li>bot：Bot基础规则。</li>
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get 子域名/应用名。 
     * @return Entity 子域名/应用名。
     */
    public String getEntity() {
        return this.Entity;
    }

    /**
     * Set 子域名/应用名。
     * @param Entity 子域名/应用名。
     */
    public void setEntity(String Entity) {
        this.Entity = Entity;
    }

    /**
     * Get 规则Id数组。 当为空时查询 子域名或者应用名下所有规则 
     * @return RuleIdList 规则Id数组。 当为空时查询 子域名或者应用名下所有规则
     */
    public Long [] getRuleIdList() {
        return this.RuleIdList;
    }

    /**
     * Set 规则Id数组。 当为空时查询 子域名或者应用名下所有规则
     * @param RuleIdList 规则Id数组。 当为空时查询 子域名或者应用名下所有规则
     */
    public void setRuleIdList(Long [] RuleIdList) {
        this.RuleIdList = RuleIdList;
    }

    /**
     * Get 子域名数组。 
     * @return Domains 子域名数组。
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set 子域名数组。
     * @param Domains 子域名数组。
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    public DescribeSecurityRuleIdRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecurityRuleIdRequest(DescribeSecurityRuleIdRequest source) {
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.Entity != null) {
            this.Entity = new String(source.Entity);
        }
        if (source.RuleIdList != null) {
            this.RuleIdList = new Long[source.RuleIdList.length];
            for (int i = 0; i < source.RuleIdList.length; i++) {
                this.RuleIdList[i] = new Long(source.RuleIdList[i]);
            }
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "Entity", this.Entity);
        this.setParamArraySimple(map, prefix + "RuleIdList.", this.RuleIdList);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);

    }
}

