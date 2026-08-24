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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIGWLogDesensitizeConfig extends AbstractModel {

    /**
    * <p>日志脱敏配置总开关</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * <p>内置规则类型：Phone、IdCard、BankCard、Email、IP、Name</p>
    */
    @SerializedName("PredefinedRuleTypes")
    @Expose
    private String [] PredefinedRuleTypes;

    /**
    * <p>自定义规则，最多 20 条</p>
    */
    @SerializedName("CustomRules")
    @Expose
    private AIGWCustomDesensitizeRule [] CustomRules;

    /**
    * <p>脱敏方向：Request、Response；为空时默认两者</p>
    */
    @SerializedName("Scope")
    @Expose
    private String [] Scope;

    /**
     * Get <p>日志脱敏配置总开关</p> 
     * @return Enabled <p>日志脱敏配置总开关</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>日志脱敏配置总开关</p>
     * @param Enabled <p>日志脱敏配置总开关</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>内置规则类型：Phone、IdCard、BankCard、Email、IP、Name</p> 
     * @return PredefinedRuleTypes <p>内置规则类型：Phone、IdCard、BankCard、Email、IP、Name</p>
     */
    public String [] getPredefinedRuleTypes() {
        return this.PredefinedRuleTypes;
    }

    /**
     * Set <p>内置规则类型：Phone、IdCard、BankCard、Email、IP、Name</p>
     * @param PredefinedRuleTypes <p>内置规则类型：Phone、IdCard、BankCard、Email、IP、Name</p>
     */
    public void setPredefinedRuleTypes(String [] PredefinedRuleTypes) {
        this.PredefinedRuleTypes = PredefinedRuleTypes;
    }

    /**
     * Get <p>自定义规则，最多 20 条</p> 
     * @return CustomRules <p>自定义规则，最多 20 条</p>
     */
    public AIGWCustomDesensitizeRule [] getCustomRules() {
        return this.CustomRules;
    }

    /**
     * Set <p>自定义规则，最多 20 条</p>
     * @param CustomRules <p>自定义规则，最多 20 条</p>
     */
    public void setCustomRules(AIGWCustomDesensitizeRule [] CustomRules) {
        this.CustomRules = CustomRules;
    }

    /**
     * Get <p>脱敏方向：Request、Response；为空时默认两者</p> 
     * @return Scope <p>脱敏方向：Request、Response；为空时默认两者</p>
     */
    public String [] getScope() {
        return this.Scope;
    }

    /**
     * Set <p>脱敏方向：Request、Response；为空时默认两者</p>
     * @param Scope <p>脱敏方向：Request、Response；为空时默认两者</p>
     */
    public void setScope(String [] Scope) {
        this.Scope = Scope;
    }

    public AIGWLogDesensitizeConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWLogDesensitizeConfig(AIGWLogDesensitizeConfig source) {
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.PredefinedRuleTypes != null) {
            this.PredefinedRuleTypes = new String[source.PredefinedRuleTypes.length];
            for (int i = 0; i < source.PredefinedRuleTypes.length; i++) {
                this.PredefinedRuleTypes[i] = new String(source.PredefinedRuleTypes[i]);
            }
        }
        if (source.CustomRules != null) {
            this.CustomRules = new AIGWCustomDesensitizeRule[source.CustomRules.length];
            for (int i = 0; i < source.CustomRules.length; i++) {
                this.CustomRules[i] = new AIGWCustomDesensitizeRule(source.CustomRules[i]);
            }
        }
        if (source.Scope != null) {
            this.Scope = new String[source.Scope.length];
            for (int i = 0; i < source.Scope.length; i++) {
                this.Scope[i] = new String(source.Scope[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamArraySimple(map, prefix + "PredefinedRuleTypes.", this.PredefinedRuleTypes);
        this.setParamArrayObj(map, prefix + "CustomRules.", this.CustomRules);
        this.setParamArraySimple(map, prefix + "Scope.", this.Scope);

    }
}

