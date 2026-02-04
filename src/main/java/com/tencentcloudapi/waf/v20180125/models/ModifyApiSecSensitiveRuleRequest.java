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
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 1表示开，0表示关，3表示删除
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 规则名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 客户自定义配置
    */
    @SerializedName("CustomRule")
    @Expose
    private ApiSecCustomSensitiveRule CustomRule;

    /**
    * rulename列表，批量操作的时候填改值
    */
    @SerializedName("RuleNameList")
    @Expose
    private String [] RuleNameList;

    /**
    * api提取规则内容
    */
    @SerializedName("CustomApiExtractRule")
    @Expose
    private ApiSecExtractRule CustomApiExtractRule;

    /**
    * 批量操作的时候的api提取规则
    */
    @SerializedName("ApiExtractRuleName")
    @Expose
    private String [] ApiExtractRuleName;

    /**
    * 自定义api鉴权规则
    */
    @SerializedName("ApiSecPrivilegeRule")
    @Expose
    private ApiSecPrivilegeRule ApiSecPrivilegeRule;

    /**
    * 匹配操作时候的api鉴权规则
    */
    @SerializedName("ApiSecPrivilegeRuleName")
    @Expose
    private String [] ApiSecPrivilegeRuleName;

    /**
    * 批量操作的时候的自定义场景列表
    */
    @SerializedName("ApiSecSceneRuleNameList")
    @Expose
    private String [] ApiSecSceneRuleNameList;

    /**
    * 单条自定义api场景规则
    */
    @SerializedName("ApiSecSceneRule")
    @Expose
    private ApiSecSceneRule ApiSecSceneRule;

    /**
    * 批量操作的时候的自定义事件规则列表
    */
    @SerializedName("ApiSecCustomEventRuleNameList")
    @Expose
    private String [] ApiSecCustomEventRuleNameList;

    /**
    * 自定义事件规则
    */
    @SerializedName("ApiSecCustomEventRuleRule")
    @Expose
    private ApiSecCustomEventRule ApiSecCustomEventRuleRule;

    /**
    * 无效api排除规则
    */
    @SerializedName("CustomApiExcludeRule")
    @Expose
    private ApiSecExcludeRule CustomApiExcludeRule;

    /**
    * 批量操作的时候的无效api排除规则
    */
    @SerializedName("ApiExcludeRuleName")
    @Expose
    private String [] ApiExcludeRuleName;

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
     * Get 1表示开，0表示关，3表示删除 
     * @return Status 1表示开，0表示关，3表示删除
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 1表示开，0表示关，3表示删除
     * @param Status 1表示开，0表示关，3表示删除
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 规则名称 
     * @return RuleName 规则名称
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名称
     * @param RuleName 规则名称
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 客户自定义配置 
     * @return CustomRule 客户自定义配置
     */
    public ApiSecCustomSensitiveRule getCustomRule() {
        return this.CustomRule;
    }

    /**
     * Set 客户自定义配置
     * @param CustomRule 客户自定义配置
     */
    public void setCustomRule(ApiSecCustomSensitiveRule CustomRule) {
        this.CustomRule = CustomRule;
    }

    /**
     * Get rulename列表，批量操作的时候填改值 
     * @return RuleNameList rulename列表，批量操作的时候填改值
     */
    public String [] getRuleNameList() {
        return this.RuleNameList;
    }

    /**
     * Set rulename列表，批量操作的时候填改值
     * @param RuleNameList rulename列表，批量操作的时候填改值
     */
    public void setRuleNameList(String [] RuleNameList) {
        this.RuleNameList = RuleNameList;
    }

    /**
     * Get api提取规则内容 
     * @return CustomApiExtractRule api提取规则内容
     */
    public ApiSecExtractRule getCustomApiExtractRule() {
        return this.CustomApiExtractRule;
    }

    /**
     * Set api提取规则内容
     * @param CustomApiExtractRule api提取规则内容
     */
    public void setCustomApiExtractRule(ApiSecExtractRule CustomApiExtractRule) {
        this.CustomApiExtractRule = CustomApiExtractRule;
    }

    /**
     * Get 批量操作的时候的api提取规则 
     * @return ApiExtractRuleName 批量操作的时候的api提取规则
     */
    public String [] getApiExtractRuleName() {
        return this.ApiExtractRuleName;
    }

    /**
     * Set 批量操作的时候的api提取规则
     * @param ApiExtractRuleName 批量操作的时候的api提取规则
     */
    public void setApiExtractRuleName(String [] ApiExtractRuleName) {
        this.ApiExtractRuleName = ApiExtractRuleName;
    }

    /**
     * Get 自定义api鉴权规则 
     * @return ApiSecPrivilegeRule 自定义api鉴权规则
     */
    public ApiSecPrivilegeRule getApiSecPrivilegeRule() {
        return this.ApiSecPrivilegeRule;
    }

    /**
     * Set 自定义api鉴权规则
     * @param ApiSecPrivilegeRule 自定义api鉴权规则
     */
    public void setApiSecPrivilegeRule(ApiSecPrivilegeRule ApiSecPrivilegeRule) {
        this.ApiSecPrivilegeRule = ApiSecPrivilegeRule;
    }

    /**
     * Get 匹配操作时候的api鉴权规则 
     * @return ApiSecPrivilegeRuleName 匹配操作时候的api鉴权规则
     */
    public String [] getApiSecPrivilegeRuleName() {
        return this.ApiSecPrivilegeRuleName;
    }

    /**
     * Set 匹配操作时候的api鉴权规则
     * @param ApiSecPrivilegeRuleName 匹配操作时候的api鉴权规则
     */
    public void setApiSecPrivilegeRuleName(String [] ApiSecPrivilegeRuleName) {
        this.ApiSecPrivilegeRuleName = ApiSecPrivilegeRuleName;
    }

    /**
     * Get 批量操作的时候的自定义场景列表 
     * @return ApiSecSceneRuleNameList 批量操作的时候的自定义场景列表
     */
    public String [] getApiSecSceneRuleNameList() {
        return this.ApiSecSceneRuleNameList;
    }

    /**
     * Set 批量操作的时候的自定义场景列表
     * @param ApiSecSceneRuleNameList 批量操作的时候的自定义场景列表
     */
    public void setApiSecSceneRuleNameList(String [] ApiSecSceneRuleNameList) {
        this.ApiSecSceneRuleNameList = ApiSecSceneRuleNameList;
    }

    /**
     * Get 单条自定义api场景规则 
     * @return ApiSecSceneRule 单条自定义api场景规则
     */
    public ApiSecSceneRule getApiSecSceneRule() {
        return this.ApiSecSceneRule;
    }

    /**
     * Set 单条自定义api场景规则
     * @param ApiSecSceneRule 单条自定义api场景规则
     */
    public void setApiSecSceneRule(ApiSecSceneRule ApiSecSceneRule) {
        this.ApiSecSceneRule = ApiSecSceneRule;
    }

    /**
     * Get 批量操作的时候的自定义事件规则列表 
     * @return ApiSecCustomEventRuleNameList 批量操作的时候的自定义事件规则列表
     */
    public String [] getApiSecCustomEventRuleNameList() {
        return this.ApiSecCustomEventRuleNameList;
    }

    /**
     * Set 批量操作的时候的自定义事件规则列表
     * @param ApiSecCustomEventRuleNameList 批量操作的时候的自定义事件规则列表
     */
    public void setApiSecCustomEventRuleNameList(String [] ApiSecCustomEventRuleNameList) {
        this.ApiSecCustomEventRuleNameList = ApiSecCustomEventRuleNameList;
    }

    /**
     * Get 自定义事件规则 
     * @return ApiSecCustomEventRuleRule 自定义事件规则
     */
    public ApiSecCustomEventRule getApiSecCustomEventRuleRule() {
        return this.ApiSecCustomEventRuleRule;
    }

    /**
     * Set 自定义事件规则
     * @param ApiSecCustomEventRuleRule 自定义事件规则
     */
    public void setApiSecCustomEventRuleRule(ApiSecCustomEventRule ApiSecCustomEventRuleRule) {
        this.ApiSecCustomEventRuleRule = ApiSecCustomEventRuleRule;
    }

    /**
     * Get 无效api排除规则 
     * @return CustomApiExcludeRule 无效api排除规则
     */
    public ApiSecExcludeRule getCustomApiExcludeRule() {
        return this.CustomApiExcludeRule;
    }

    /**
     * Set 无效api排除规则
     * @param CustomApiExcludeRule 无效api排除规则
     */
    public void setCustomApiExcludeRule(ApiSecExcludeRule CustomApiExcludeRule) {
        this.CustomApiExcludeRule = CustomApiExcludeRule;
    }

    /**
     * Get 批量操作的时候的无效api排除规则 
     * @return ApiExcludeRuleName 批量操作的时候的无效api排除规则
     */
    public String [] getApiExcludeRuleName() {
        return this.ApiExcludeRuleName;
    }

    /**
     * Set 批量操作的时候的无效api排除规则
     * @param ApiExcludeRuleName 批量操作的时候的无效api排除规则
     */
    public void setApiExcludeRuleName(String [] ApiExcludeRuleName) {
        this.ApiExcludeRuleName = ApiExcludeRuleName;
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
        if (source.CustomRule != null) {
            this.CustomRule = new ApiSecCustomSensitiveRule(source.CustomRule);
        }
        if (source.RuleNameList != null) {
            this.RuleNameList = new String[source.RuleNameList.length];
            for (int i = 0; i < source.RuleNameList.length; i++) {
                this.RuleNameList[i] = new String(source.RuleNameList[i]);
            }
        }
        if (source.CustomApiExtractRule != null) {
            this.CustomApiExtractRule = new ApiSecExtractRule(source.CustomApiExtractRule);
        }
        if (source.ApiExtractRuleName != null) {
            this.ApiExtractRuleName = new String[source.ApiExtractRuleName.length];
            for (int i = 0; i < source.ApiExtractRuleName.length; i++) {
                this.ApiExtractRuleName[i] = new String(source.ApiExtractRuleName[i]);
            }
        }
        if (source.ApiSecPrivilegeRule != null) {
            this.ApiSecPrivilegeRule = new ApiSecPrivilegeRule(source.ApiSecPrivilegeRule);
        }
        if (source.ApiSecPrivilegeRuleName != null) {
            this.ApiSecPrivilegeRuleName = new String[source.ApiSecPrivilegeRuleName.length];
            for (int i = 0; i < source.ApiSecPrivilegeRuleName.length; i++) {
                this.ApiSecPrivilegeRuleName[i] = new String(source.ApiSecPrivilegeRuleName[i]);
            }
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
        if (source.CustomApiExcludeRule != null) {
            this.CustomApiExcludeRule = new ApiSecExcludeRule(source.CustomApiExcludeRule);
        }
        if (source.ApiExcludeRuleName != null) {
            this.ApiExcludeRuleName = new String[source.ApiExcludeRuleName.length];
            for (int i = 0; i < source.ApiExcludeRuleName.length; i++) {
                this.ApiExcludeRuleName[i] = new String(source.ApiExcludeRuleName[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamObj(map, prefix + "CustomRule.", this.CustomRule);
        this.setParamArraySimple(map, prefix + "RuleNameList.", this.RuleNameList);
        this.setParamObj(map, prefix + "CustomApiExtractRule.", this.CustomApiExtractRule);
        this.setParamArraySimple(map, prefix + "ApiExtractRuleName.", this.ApiExtractRuleName);
        this.setParamObj(map, prefix + "ApiSecPrivilegeRule.", this.ApiSecPrivilegeRule);
        this.setParamArraySimple(map, prefix + "ApiSecPrivilegeRuleName.", this.ApiSecPrivilegeRuleName);
        this.setParamArraySimple(map, prefix + "ApiSecSceneRuleNameList.", this.ApiSecSceneRuleNameList);
        this.setParamObj(map, prefix + "ApiSecSceneRule.", this.ApiSecSceneRule);
        this.setParamArraySimple(map, prefix + "ApiSecCustomEventRuleNameList.", this.ApiSecCustomEventRuleNameList);
        this.setParamObj(map, prefix + "ApiSecCustomEventRuleRule.", this.ApiSecCustomEventRuleRule);
        this.setParamObj(map, prefix + "CustomApiExcludeRule.", this.CustomApiExcludeRule);
        this.setParamArraySimple(map, prefix + "ApiExcludeRuleName.", this.ApiExcludeRuleName);

    }
}

