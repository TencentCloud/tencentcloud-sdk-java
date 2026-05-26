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

public class ModifyApiSecSensitiveRuleRequest extends AbstractModel {

    /**
    * <p>域名</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>1表示开，0表示关，3表示删除</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>规则名称</p>
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * <p>rulename列表，批量操作的时候填改值</p>
    */
    @SerializedName("RuleNameList")
    @Expose
    private String [] RuleNameList;

    /**
    * <p>客户自定义配置</p>
    */
    @SerializedName("CustomRule")
    @Expose
    private ApiSecCustomSensitiveRule CustomRule;

    /**
    * <p>批量操作的时候的api提取规则</p>
    */
    @SerializedName("ApiExtractRuleName")
    @Expose
    private String [] ApiExtractRuleName;

    /**
    * <p>api提取规则内容</p>
    */
    @SerializedName("CustomApiExtractRule")
    @Expose
    private ApiSecExtractRule CustomApiExtractRule;

    /**
    * <p>匹配操作时候的api鉴权规则</p>
    */
    @SerializedName("ApiSecPrivilegeRuleName")
    @Expose
    private String [] ApiSecPrivilegeRuleName;

    /**
    * <p>自定义api鉴权规则</p>
    */
    @SerializedName("ApiSecPrivilegeRule")
    @Expose
    private ApiSecPrivilegeRule ApiSecPrivilegeRule;

    /**
    * <p>批量操作的时候的自定义场景列表</p>
    */
    @SerializedName("ApiSecSceneRuleNameList")
    @Expose
    private String [] ApiSecSceneRuleNameList;

    /**
    * <p>单条自定义api场景规则</p>
    */
    @SerializedName("ApiSecSceneRule")
    @Expose
    private ApiSecSceneRule ApiSecSceneRule;

    /**
    * <p>批量操作的时候的自定义事件规则列表</p>
    */
    @SerializedName("ApiSecCustomEventRuleNameList")
    @Expose
    private String [] ApiSecCustomEventRuleNameList;

    /**
    * <p>自定义事件规则</p>
    */
    @SerializedName("ApiSecCustomEventRuleRule")
    @Expose
    private ApiSecCustomEventRule ApiSecCustomEventRuleRule;

    /**
    * <p>批量操作的时候的无效api排除规则</p>
    */
    @SerializedName("ApiExcludeRuleName")
    @Expose
    private String [] ApiExcludeRuleName;

    /**
    * <p>无效api排除规则</p>
    */
    @SerializedName("CustomApiExcludeRule")
    @Expose
    private ApiSecExcludeRule CustomApiExcludeRule;

    /**
    * <p>批量操作时的敏感数据加白规则名称列表</p>
    */
    @SerializedName("ApiSecSensitiveWhiteRuleNameList")
    @Expose
    private String [] ApiSecSensitiveWhiteRuleNameList;

    /**
    * <p>敏感数据加白规则</p>
    */
    @SerializedName("ApiSecSensitiveWhiteRuleRule")
    @Expose
    private ApiSecSensitiveWhiteRule ApiSecSensitiveWhiteRuleRule;

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
     * Get <p>1表示开，0表示关，3表示删除</p> 
     * @return Status <p>1表示开，0表示关，3表示删除</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>1表示开，0表示关，3表示删除</p>
     * @param Status <p>1表示开，0表示关，3表示删除</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>规则名称</p> 
     * @return RuleName <p>规则名称</p>
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set <p>规则名称</p>
     * @param RuleName <p>规则名称</p>
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get <p>rulename列表，批量操作的时候填改值</p> 
     * @return RuleNameList <p>rulename列表，批量操作的时候填改值</p>
     */
    public String [] getRuleNameList() {
        return this.RuleNameList;
    }

    /**
     * Set <p>rulename列表，批量操作的时候填改值</p>
     * @param RuleNameList <p>rulename列表，批量操作的时候填改值</p>
     */
    public void setRuleNameList(String [] RuleNameList) {
        this.RuleNameList = RuleNameList;
    }

    /**
     * Get <p>客户自定义配置</p> 
     * @return CustomRule <p>客户自定义配置</p>
     */
    public ApiSecCustomSensitiveRule getCustomRule() {
        return this.CustomRule;
    }

    /**
     * Set <p>客户自定义配置</p>
     * @param CustomRule <p>客户自定义配置</p>
     */
    public void setCustomRule(ApiSecCustomSensitiveRule CustomRule) {
        this.CustomRule = CustomRule;
    }

    /**
     * Get <p>批量操作的时候的api提取规则</p> 
     * @return ApiExtractRuleName <p>批量操作的时候的api提取规则</p>
     */
    public String [] getApiExtractRuleName() {
        return this.ApiExtractRuleName;
    }

    /**
     * Set <p>批量操作的时候的api提取规则</p>
     * @param ApiExtractRuleName <p>批量操作的时候的api提取规则</p>
     */
    public void setApiExtractRuleName(String [] ApiExtractRuleName) {
        this.ApiExtractRuleName = ApiExtractRuleName;
    }

    /**
     * Get <p>api提取规则内容</p> 
     * @return CustomApiExtractRule <p>api提取规则内容</p>
     */
    public ApiSecExtractRule getCustomApiExtractRule() {
        return this.CustomApiExtractRule;
    }

    /**
     * Set <p>api提取规则内容</p>
     * @param CustomApiExtractRule <p>api提取规则内容</p>
     */
    public void setCustomApiExtractRule(ApiSecExtractRule CustomApiExtractRule) {
        this.CustomApiExtractRule = CustomApiExtractRule;
    }

    /**
     * Get <p>匹配操作时候的api鉴权规则</p> 
     * @return ApiSecPrivilegeRuleName <p>匹配操作时候的api鉴权规则</p>
     */
    public String [] getApiSecPrivilegeRuleName() {
        return this.ApiSecPrivilegeRuleName;
    }

    /**
     * Set <p>匹配操作时候的api鉴权规则</p>
     * @param ApiSecPrivilegeRuleName <p>匹配操作时候的api鉴权规则</p>
     */
    public void setApiSecPrivilegeRuleName(String [] ApiSecPrivilegeRuleName) {
        this.ApiSecPrivilegeRuleName = ApiSecPrivilegeRuleName;
    }

    /**
     * Get <p>自定义api鉴权规则</p> 
     * @return ApiSecPrivilegeRule <p>自定义api鉴权规则</p>
     */
    public ApiSecPrivilegeRule getApiSecPrivilegeRule() {
        return this.ApiSecPrivilegeRule;
    }

    /**
     * Set <p>自定义api鉴权规则</p>
     * @param ApiSecPrivilegeRule <p>自定义api鉴权规则</p>
     */
    public void setApiSecPrivilegeRule(ApiSecPrivilegeRule ApiSecPrivilegeRule) {
        this.ApiSecPrivilegeRule = ApiSecPrivilegeRule;
    }

    /**
     * Get <p>批量操作的时候的自定义场景列表</p> 
     * @return ApiSecSceneRuleNameList <p>批量操作的时候的自定义场景列表</p>
     */
    public String [] getApiSecSceneRuleNameList() {
        return this.ApiSecSceneRuleNameList;
    }

    /**
     * Set <p>批量操作的时候的自定义场景列表</p>
     * @param ApiSecSceneRuleNameList <p>批量操作的时候的自定义场景列表</p>
     */
    public void setApiSecSceneRuleNameList(String [] ApiSecSceneRuleNameList) {
        this.ApiSecSceneRuleNameList = ApiSecSceneRuleNameList;
    }

    /**
     * Get <p>单条自定义api场景规则</p> 
     * @return ApiSecSceneRule <p>单条自定义api场景规则</p>
     */
    public ApiSecSceneRule getApiSecSceneRule() {
        return this.ApiSecSceneRule;
    }

    /**
     * Set <p>单条自定义api场景规则</p>
     * @param ApiSecSceneRule <p>单条自定义api场景规则</p>
     */
    public void setApiSecSceneRule(ApiSecSceneRule ApiSecSceneRule) {
        this.ApiSecSceneRule = ApiSecSceneRule;
    }

    /**
     * Get <p>批量操作的时候的自定义事件规则列表</p> 
     * @return ApiSecCustomEventRuleNameList <p>批量操作的时候的自定义事件规则列表</p>
     */
    public String [] getApiSecCustomEventRuleNameList() {
        return this.ApiSecCustomEventRuleNameList;
    }

    /**
     * Set <p>批量操作的时候的自定义事件规则列表</p>
     * @param ApiSecCustomEventRuleNameList <p>批量操作的时候的自定义事件规则列表</p>
     */
    public void setApiSecCustomEventRuleNameList(String [] ApiSecCustomEventRuleNameList) {
        this.ApiSecCustomEventRuleNameList = ApiSecCustomEventRuleNameList;
    }

    /**
     * Get <p>自定义事件规则</p> 
     * @return ApiSecCustomEventRuleRule <p>自定义事件规则</p>
     */
    public ApiSecCustomEventRule getApiSecCustomEventRuleRule() {
        return this.ApiSecCustomEventRuleRule;
    }

    /**
     * Set <p>自定义事件规则</p>
     * @param ApiSecCustomEventRuleRule <p>自定义事件规则</p>
     */
    public void setApiSecCustomEventRuleRule(ApiSecCustomEventRule ApiSecCustomEventRuleRule) {
        this.ApiSecCustomEventRuleRule = ApiSecCustomEventRuleRule;
    }

    /**
     * Get <p>批量操作的时候的无效api排除规则</p> 
     * @return ApiExcludeRuleName <p>批量操作的时候的无效api排除规则</p>
     */
    public String [] getApiExcludeRuleName() {
        return this.ApiExcludeRuleName;
    }

    /**
     * Set <p>批量操作的时候的无效api排除规则</p>
     * @param ApiExcludeRuleName <p>批量操作的时候的无效api排除规则</p>
     */
    public void setApiExcludeRuleName(String [] ApiExcludeRuleName) {
        this.ApiExcludeRuleName = ApiExcludeRuleName;
    }

    /**
     * Get <p>无效api排除规则</p> 
     * @return CustomApiExcludeRule <p>无效api排除规则</p>
     */
    public ApiSecExcludeRule getCustomApiExcludeRule() {
        return this.CustomApiExcludeRule;
    }

    /**
     * Set <p>无效api排除规则</p>
     * @param CustomApiExcludeRule <p>无效api排除规则</p>
     */
    public void setCustomApiExcludeRule(ApiSecExcludeRule CustomApiExcludeRule) {
        this.CustomApiExcludeRule = CustomApiExcludeRule;
    }

    /**
     * Get <p>批量操作时的敏感数据加白规则名称列表</p> 
     * @return ApiSecSensitiveWhiteRuleNameList <p>批量操作时的敏感数据加白规则名称列表</p>
     */
    public String [] getApiSecSensitiveWhiteRuleNameList() {
        return this.ApiSecSensitiveWhiteRuleNameList;
    }

    /**
     * Set <p>批量操作时的敏感数据加白规则名称列表</p>
     * @param ApiSecSensitiveWhiteRuleNameList <p>批量操作时的敏感数据加白规则名称列表</p>
     */
    public void setApiSecSensitiveWhiteRuleNameList(String [] ApiSecSensitiveWhiteRuleNameList) {
        this.ApiSecSensitiveWhiteRuleNameList = ApiSecSensitiveWhiteRuleNameList;
    }

    /**
     * Get <p>敏感数据加白规则</p> 
     * @return ApiSecSensitiveWhiteRuleRule <p>敏感数据加白规则</p>
     */
    public ApiSecSensitiveWhiteRule getApiSecSensitiveWhiteRuleRule() {
        return this.ApiSecSensitiveWhiteRuleRule;
    }

    /**
     * Set <p>敏感数据加白规则</p>
     * @param ApiSecSensitiveWhiteRuleRule <p>敏感数据加白规则</p>
     */
    public void setApiSecSensitiveWhiteRuleRule(ApiSecSensitiveWhiteRule ApiSecSensitiveWhiteRuleRule) {
        this.ApiSecSensitiveWhiteRuleRule = ApiSecSensitiveWhiteRuleRule;
    }

    public ModifyApiSecSensitiveRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyApiSecSensitiveRuleRequest(ModifyApiSecSensitiveRuleRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RuleNameList != null) {
            this.RuleNameList = new String[source.RuleNameList.length];
            for (int i = 0; i < source.RuleNameList.length; i++) {
                this.RuleNameList[i] = new String(source.RuleNameList[i]);
            }
        }
        if (source.CustomRule != null) {
            this.CustomRule = new ApiSecCustomSensitiveRule(source.CustomRule);
        }
        if (source.ApiExtractRuleName != null) {
            this.ApiExtractRuleName = new String[source.ApiExtractRuleName.length];
            for (int i = 0; i < source.ApiExtractRuleName.length; i++) {
                this.ApiExtractRuleName[i] = new String(source.ApiExtractRuleName[i]);
            }
        }
        if (source.CustomApiExtractRule != null) {
            this.CustomApiExtractRule = new ApiSecExtractRule(source.CustomApiExtractRule);
        }
        if (source.ApiSecPrivilegeRuleName != null) {
            this.ApiSecPrivilegeRuleName = new String[source.ApiSecPrivilegeRuleName.length];
            for (int i = 0; i < source.ApiSecPrivilegeRuleName.length; i++) {
                this.ApiSecPrivilegeRuleName[i] = new String(source.ApiSecPrivilegeRuleName[i]);
            }
        }
        if (source.ApiSecPrivilegeRule != null) {
            this.ApiSecPrivilegeRule = new ApiSecPrivilegeRule(source.ApiSecPrivilegeRule);
        }
        if (source.ApiSecSceneRuleNameList != null) {
            this.ApiSecSceneRuleNameList = new String[source.ApiSecSceneRuleNameList.length];
            for (int i = 0; i < source.ApiSecSceneRuleNameList.length; i++) {
                this.ApiSecSceneRuleNameList[i] = new String(source.ApiSecSceneRuleNameList[i]);
            }
        }
        if (source.ApiSecSceneRule != null) {
            this.ApiSecSceneRule = new ApiSecSceneRule(source.ApiSecSceneRule);
        }
        if (source.ApiSecCustomEventRuleNameList != null) {
            this.ApiSecCustomEventRuleNameList = new String[source.ApiSecCustomEventRuleNameList.length];
            for (int i = 0; i < source.ApiSecCustomEventRuleNameList.length; i++) {
                this.ApiSecCustomEventRuleNameList[i] = new String(source.ApiSecCustomEventRuleNameList[i]);
            }
        }
        if (source.ApiSecCustomEventRuleRule != null) {
            this.ApiSecCustomEventRuleRule = new ApiSecCustomEventRule(source.ApiSecCustomEventRuleRule);
        }
        if (source.ApiExcludeRuleName != null) {
            this.ApiExcludeRuleName = new String[source.ApiExcludeRuleName.length];
            for (int i = 0; i < source.ApiExcludeRuleName.length; i++) {
                this.ApiExcludeRuleName[i] = new String(source.ApiExcludeRuleName[i]);
            }
        }
        if (source.CustomApiExcludeRule != null) {
            this.CustomApiExcludeRule = new ApiSecExcludeRule(source.CustomApiExcludeRule);
        }
        if (source.ApiSecSensitiveWhiteRuleNameList != null) {
            this.ApiSecSensitiveWhiteRuleNameList = new String[source.ApiSecSensitiveWhiteRuleNameList.length];
            for (int i = 0; i < source.ApiSecSensitiveWhiteRuleNameList.length; i++) {
                this.ApiSecSensitiveWhiteRuleNameList[i] = new String(source.ApiSecSensitiveWhiteRuleNameList[i]);
            }
        }
        if (source.ApiSecSensitiveWhiteRuleRule != null) {
            this.ApiSecSensitiveWhiteRuleRule = new ApiSecSensitiveWhiteRule(source.ApiSecSensitiveWhiteRuleRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamArraySimple(map, prefix + "RuleNameList.", this.RuleNameList);
        this.setParamObj(map, prefix + "CustomRule.", this.CustomRule);
        this.setParamArraySimple(map, prefix + "ApiExtractRuleName.", this.ApiExtractRuleName);
        this.setParamObj(map, prefix + "CustomApiExtractRule.", this.CustomApiExtractRule);
        this.setParamArraySimple(map, prefix + "ApiSecPrivilegeRuleName.", this.ApiSecPrivilegeRuleName);
        this.setParamObj(map, prefix + "ApiSecPrivilegeRule.", this.ApiSecPrivilegeRule);
        this.setParamArraySimple(map, prefix + "ApiSecSceneRuleNameList.", this.ApiSecSceneRuleNameList);
        this.setParamObj(map, prefix + "ApiSecSceneRule.", this.ApiSecSceneRule);
        this.setParamArraySimple(map, prefix + "ApiSecCustomEventRuleNameList.", this.ApiSecCustomEventRuleNameList);
        this.setParamObj(map, prefix + "ApiSecCustomEventRuleRule.", this.ApiSecCustomEventRuleRule);
        this.setParamArraySimple(map, prefix + "ApiExcludeRuleName.", this.ApiExcludeRuleName);
        this.setParamObj(map, prefix + "CustomApiExcludeRule.", this.CustomApiExcludeRule);
        this.setParamArraySimple(map, prefix + "ApiSecSensitiveWhiteRuleNameList.", this.ApiSecSensitiveWhiteRuleNameList);
        this.setParamObj(map, prefix + "ApiSecSensitiveWhiteRuleRule.", this.ApiSecSensitiveWhiteRuleRule);

    }
}

