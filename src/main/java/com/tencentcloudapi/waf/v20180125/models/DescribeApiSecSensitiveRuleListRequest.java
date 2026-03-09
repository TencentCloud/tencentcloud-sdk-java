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
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 是否查询api提取规则策略，true表示查询
    */
    @SerializedName("IsQueryApiExtractRule")
    @Expose
    private Boolean IsQueryApiExtractRule;

    /**
    * 是否查询api鉴权规则
    */
    @SerializedName("IsQueryApiPrivilegeRule")
    @Expose
    private Boolean IsQueryApiPrivilegeRule;

    /**
    * 是否查询api场景规则
    */
    @SerializedName("IsQueryApiSceneRule")
    @Expose
    private Boolean IsQueryApiSceneRule;

    /**
    * 查询鉴权配置的时候，该rule只返回鉴权配置的规则
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 是否查询api自定义事件规则
    */
    @SerializedName("IsQueryApiCustomEventRule")
    @Expose
    private Boolean IsQueryApiCustomEventRule;

    /**
    * 是否查询无效api排除策略
    */
    @SerializedName("IsQueryApiExcludeRule")
    @Expose
    private Boolean IsQueryApiExcludeRule;

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
     * Get 是否查询api提取规则策略，true表示查询 
     * @return IsQueryApiExtractRule 是否查询api提取规则策略，true表示查询
     */
    public Boolean getIsQueryApiExtractRule() {
        return this.IsQueryApiExtractRule;
    }

    /**
     * Set 是否查询api提取规则策略，true表示查询
     * @param IsQueryApiExtractRule 是否查询api提取规则策略，true表示查询
     */
    public void setIsQueryApiExtractRule(Boolean IsQueryApiExtractRule) {
        this.IsQueryApiExtractRule = IsQueryApiExtractRule;
    }

    /**
     * Get 是否查询api鉴权规则 
     * @return IsQueryApiPrivilegeRule 是否查询api鉴权规则
     */
    public Boolean getIsQueryApiPrivilegeRule() {
        return this.IsQueryApiPrivilegeRule;
    }

    /**
     * Set 是否查询api鉴权规则
     * @param IsQueryApiPrivilegeRule 是否查询api鉴权规则
     */
    public void setIsQueryApiPrivilegeRule(Boolean IsQueryApiPrivilegeRule) {
        this.IsQueryApiPrivilegeRule = IsQueryApiPrivilegeRule;
    }

    /**
     * Get 是否查询api场景规则 
     * @return IsQueryApiSceneRule 是否查询api场景规则
     */
    public Boolean getIsQueryApiSceneRule() {
        return this.IsQueryApiSceneRule;
    }

    /**
     * Set 是否查询api场景规则
     * @param IsQueryApiSceneRule 是否查询api场景规则
     */
    public void setIsQueryApiSceneRule(Boolean IsQueryApiSceneRule) {
        this.IsQueryApiSceneRule = IsQueryApiSceneRule;
    }

    /**
     * Get 查询鉴权配置的时候，该rule只返回鉴权配置的规则 
     * @return RuleName 查询鉴权配置的时候，该rule只返回鉴权配置的规则
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 查询鉴权配置的时候，该rule只返回鉴权配置的规则
     * @param RuleName 查询鉴权配置的时候，该rule只返回鉴权配置的规则
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 是否查询api自定义事件规则 
     * @return IsQueryApiCustomEventRule 是否查询api自定义事件规则
     */
    public Boolean getIsQueryApiCustomEventRule() {
        return this.IsQueryApiCustomEventRule;
    }

    /**
     * Set 是否查询api自定义事件规则
     * @param IsQueryApiCustomEventRule 是否查询api自定义事件规则
     */
    public void setIsQueryApiCustomEventRule(Boolean IsQueryApiCustomEventRule) {
        this.IsQueryApiCustomEventRule = IsQueryApiCustomEventRule;
    }

    /**
     * Get 是否查询无效api排除策略 
     * @return IsQueryApiExcludeRule 是否查询无效api排除策略
     */
    public Boolean getIsQueryApiExcludeRule() {
        return this.IsQueryApiExcludeRule;
    }

    /**
     * Set 是否查询无效api排除策略
     * @param IsQueryApiExcludeRule 是否查询无效api排除策略
     */
    public void setIsQueryApiExcludeRule(Boolean IsQueryApiExcludeRule) {
        this.IsQueryApiExcludeRule = IsQueryApiExcludeRule;
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

    }
}

