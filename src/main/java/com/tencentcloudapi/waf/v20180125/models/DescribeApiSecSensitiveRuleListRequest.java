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

public class DescribeApiSecSensitiveRuleListRequest extends AbstractModel {

    /**
    * <p>域名</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>是否查询api提取规则策略，true表示查询</p>
    */
    @SerializedName("IsQueryApiExtractRule")
    @Expose
    private Boolean IsQueryApiExtractRule;

    /**
    * <p>是否查询api鉴权规则</p>
    */
    @SerializedName("IsQueryApiPrivilegeRule")
    @Expose
    private Boolean IsQueryApiPrivilegeRule;

    /**
    * <p>是否查询api场景规则</p>
    */
    @SerializedName("IsQueryApiSceneRule")
    @Expose
    private Boolean IsQueryApiSceneRule;

    /**
    * <p>查询鉴权配置的时候，该rule只返回鉴权配置的规则</p>
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * <p>是否查询api自定义事件规则</p>
    */
    @SerializedName("IsQueryApiCustomEventRule")
    @Expose
    private Boolean IsQueryApiCustomEventRule;

    /**
    * <p>是否查询无效api排除策略</p>
    */
    @SerializedName("IsQueryApiExcludeRule")
    @Expose
    private Boolean IsQueryApiExcludeRule;

    /**
    * <p>是否查询敏感数据加白规则</p>
    */
    @SerializedName("IsQueryApiSensitiveWhiteRule")
    @Expose
    private Boolean IsQueryApiSensitiveWhiteRule;

    /**
     * Get <p>域名</p> 
     * @return Domain <p>域名</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>域名</p>
     * @param Domain <p>域名</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>是否查询api提取规则策略，true表示查询</p> 
     * @return IsQueryApiExtractRule <p>是否查询api提取规则策略，true表示查询</p>
     */
    public Boolean getIsQueryApiExtractRule() {
        return this.IsQueryApiExtractRule;
    }

    /**
     * Set <p>是否查询api提取规则策略，true表示查询</p>
     * @param IsQueryApiExtractRule <p>是否查询api提取规则策略，true表示查询</p>
     */
    public void setIsQueryApiExtractRule(Boolean IsQueryApiExtractRule) {
        this.IsQueryApiExtractRule = IsQueryApiExtractRule;
    }

    /**
     * Get <p>是否查询api鉴权规则</p> 
     * @return IsQueryApiPrivilegeRule <p>是否查询api鉴权规则</p>
     */
    public Boolean getIsQueryApiPrivilegeRule() {
        return this.IsQueryApiPrivilegeRule;
    }

    /**
     * Set <p>是否查询api鉴权规则</p>
     * @param IsQueryApiPrivilegeRule <p>是否查询api鉴权规则</p>
     */
    public void setIsQueryApiPrivilegeRule(Boolean IsQueryApiPrivilegeRule) {
        this.IsQueryApiPrivilegeRule = IsQueryApiPrivilegeRule;
    }

    /**
     * Get <p>是否查询api场景规则</p> 
     * @return IsQueryApiSceneRule <p>是否查询api场景规则</p>
     */
    public Boolean getIsQueryApiSceneRule() {
        return this.IsQueryApiSceneRule;
    }

    /**
     * Set <p>是否查询api场景规则</p>
     * @param IsQueryApiSceneRule <p>是否查询api场景规则</p>
     */
    public void setIsQueryApiSceneRule(Boolean IsQueryApiSceneRule) {
        this.IsQueryApiSceneRule = IsQueryApiSceneRule;
    }

    /**
     * Get <p>查询鉴权配置的时候，该rule只返回鉴权配置的规则</p> 
     * @return RuleName <p>查询鉴权配置的时候，该rule只返回鉴权配置的规则</p>
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set <p>查询鉴权配置的时候，该rule只返回鉴权配置的规则</p>
     * @param RuleName <p>查询鉴权配置的时候，该rule只返回鉴权配置的规则</p>
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get <p>是否查询api自定义事件规则</p> 
     * @return IsQueryApiCustomEventRule <p>是否查询api自定义事件规则</p>
     */
    public Boolean getIsQueryApiCustomEventRule() {
        return this.IsQueryApiCustomEventRule;
    }

    /**
     * Set <p>是否查询api自定义事件规则</p>
     * @param IsQueryApiCustomEventRule <p>是否查询api自定义事件规则</p>
     */
    public void setIsQueryApiCustomEventRule(Boolean IsQueryApiCustomEventRule) {
        this.IsQueryApiCustomEventRule = IsQueryApiCustomEventRule;
    }

    /**
     * Get <p>是否查询无效api排除策略</p> 
     * @return IsQueryApiExcludeRule <p>是否查询无效api排除策略</p>
     */
    public Boolean getIsQueryApiExcludeRule() {
        return this.IsQueryApiExcludeRule;
    }

    /**
     * Set <p>是否查询无效api排除策略</p>
     * @param IsQueryApiExcludeRule <p>是否查询无效api排除策略</p>
     */
    public void setIsQueryApiExcludeRule(Boolean IsQueryApiExcludeRule) {
        this.IsQueryApiExcludeRule = IsQueryApiExcludeRule;
    }

    /**
     * Get <p>是否查询敏感数据加白规则</p> 
     * @return IsQueryApiSensitiveWhiteRule <p>是否查询敏感数据加白规则</p>
     */
    public Boolean getIsQueryApiSensitiveWhiteRule() {
        return this.IsQueryApiSensitiveWhiteRule;
    }

    /**
     * Set <p>是否查询敏感数据加白规则</p>
     * @param IsQueryApiSensitiveWhiteRule <p>是否查询敏感数据加白规则</p>
     */
    public void setIsQueryApiSensitiveWhiteRule(Boolean IsQueryApiSensitiveWhiteRule) {
        this.IsQueryApiSensitiveWhiteRule = IsQueryApiSensitiveWhiteRule;
    }

    public DescribeApiSecSensitiveRuleListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApiSecSensitiveRuleListRequest(DescribeApiSecSensitiveRuleListRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.IsQueryApiExtractRule != null) {
            this.IsQueryApiExtractRule = new Boolean(source.IsQueryApiExtractRule);
        }
        if (source.IsQueryApiPrivilegeRule != null) {
            this.IsQueryApiPrivilegeRule = new Boolean(source.IsQueryApiPrivilegeRule);
        }
        if (source.IsQueryApiSceneRule != null) {
            this.IsQueryApiSceneRule = new Boolean(source.IsQueryApiSceneRule);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.IsQueryApiCustomEventRule != null) {
            this.IsQueryApiCustomEventRule = new Boolean(source.IsQueryApiCustomEventRule);
        }
        if (source.IsQueryApiExcludeRule != null) {
            this.IsQueryApiExcludeRule = new Boolean(source.IsQueryApiExcludeRule);
        }
        if (source.IsQueryApiSensitiveWhiteRule != null) {
            this.IsQueryApiSensitiveWhiteRule = new Boolean(source.IsQueryApiSensitiveWhiteRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "IsQueryApiExtractRule", this.IsQueryApiExtractRule);
        this.setParamSimple(map, prefix + "IsQueryApiPrivilegeRule", this.IsQueryApiPrivilegeRule);
        this.setParamSimple(map, prefix + "IsQueryApiSceneRule", this.IsQueryApiSceneRule);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "IsQueryApiCustomEventRule", this.IsQueryApiCustomEventRule);
        this.setParamSimple(map, prefix + "IsQueryApiExcludeRule", this.IsQueryApiExcludeRule);
        this.setParamSimple(map, prefix + "IsQueryApiSensitiveWhiteRule", this.IsQueryApiSensitiveWhiteRule);

    }
}

