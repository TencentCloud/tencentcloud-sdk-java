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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCustomWhiteRuleRequest extends AbstractModel{

    /**
    * 编辑的域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 编辑的规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 编辑的规则名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 放行时是否继续执行其它检查逻辑，继续执行地域封禁防护：geoip、继续执行CC策略防护：cc、继续执行WEB应用防护：owasp、继续执行AI引擎防护：ai、继续执行信息防泄漏防护：antileakage。如果多个勾选那么以,串接。
    */
    @SerializedName("Bypass")
    @Expose
    private String Bypass;

    /**
    * 优先级，1~100的整数，数字越小，代表这条规则的执行优先级越高。
    */
    @SerializedName("SortId")
    @Expose
    private Long SortId;

    /**
    * 规则生效截止时间，0：永久生效，其它值为对应时间的时间戳。
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * 匹配条件数组
    */
    @SerializedName("Strategies")
    @Expose
    private Strategy [] Strategies;

    /**
     * Get 编辑的域名 
     * @return Domain 编辑的域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 编辑的域名
     * @param Domain 编辑的域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 编辑的规则ID 
     * @return RuleId 编辑的规则ID
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 编辑的规则ID
     * @param RuleId 编辑的规则ID
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 编辑的规则名称 
     * @return RuleName 编辑的规则名称
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 编辑的规则名称
     * @param RuleName 编辑的规则名称
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 放行时是否继续执行其它检查逻辑，继续执行地域封禁防护：geoip、继续执行CC策略防护：cc、继续执行WEB应用防护：owasp、继续执行AI引擎防护：ai、继续执行信息防泄漏防护：antileakage。如果多个勾选那么以,串接。 
     * @return Bypass 放行时是否继续执行其它检查逻辑，继续执行地域封禁防护：geoip、继续执行CC策略防护：cc、继续执行WEB应用防护：owasp、继续执行AI引擎防护：ai、继续执行信息防泄漏防护：antileakage。如果多个勾选那么以,串接。
     */
    public String getBypass() {
        return this.Bypass;
    }

    /**
     * Set 放行时是否继续执行其它检查逻辑，继续执行地域封禁防护：geoip、继续执行CC策略防护：cc、继续执行WEB应用防护：owasp、继续执行AI引擎防护：ai、继续执行信息防泄漏防护：antileakage。如果多个勾选那么以,串接。
     * @param Bypass 放行时是否继续执行其它检查逻辑，继续执行地域封禁防护：geoip、继续执行CC策略防护：cc、继续执行WEB应用防护：owasp、继续执行AI引擎防护：ai、继续执行信息防泄漏防护：antileakage。如果多个勾选那么以,串接。
     */
    public void setBypass(String Bypass) {
        this.Bypass = Bypass;
    }

    /**
     * Get 优先级，1~100的整数，数字越小，代表这条规则的执行优先级越高。 
     * @return SortId 优先级，1~100的整数，数字越小，代表这条规则的执行优先级越高。
     */
    public Long getSortId() {
        return this.SortId;
    }

    /**
     * Set 优先级，1~100的整数，数字越小，代表这条规则的执行优先级越高。
     * @param SortId 优先级，1~100的整数，数字越小，代表这条规则的执行优先级越高。
     */
    public void setSortId(Long SortId) {
        this.SortId = SortId;
    }

    /**
     * Get 规则生效截止时间，0：永久生效，其它值为对应时间的时间戳。 
     * @return ExpireTime 规则生效截止时间，0：永久生效，其它值为对应时间的时间戳。
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 规则生效截止时间，0：永久生效，其它值为对应时间的时间戳。
     * @param ExpireTime 规则生效截止时间，0：永久生效，其它值为对应时间的时间戳。
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 匹配条件数组 
     * @return Strategies 匹配条件数组
     */
    public Strategy [] getStrategies() {
        return this.Strategies;
    }

    /**
     * Set 匹配条件数组
     * @param Strategies 匹配条件数组
     */
    public void setStrategies(Strategy [] Strategies) {
        this.Strategies = Strategies;
    }

    public ModifyCustomWhiteRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCustomWhiteRuleRequest(ModifyCustomWhiteRuleRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Bypass != null) {
            this.Bypass = new String(source.Bypass);
        }
        if (source.SortId != null) {
            this.SortId = new Long(source.SortId);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.Strategies != null) {
            this.Strategies = new Strategy[source.Strategies.length];
            for (int i = 0; i < source.Strategies.length; i++) {
                this.Strategies[i] = new Strategy(source.Strategies[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Bypass", this.Bypass);
        this.setParamSimple(map, prefix + "SortId", this.SortId);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamArrayObj(map, prefix + "Strategies.", this.Strategies);

    }
}

