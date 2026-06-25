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
    * <p>日志脱敏开关</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * <p>预定义规则类型</p><p>枚举值：</p><ul><li>Phone： 电话号码</li><li>IdCard： 身份证号</li><li>BankCard： 银行卡号</li><li>Email： 邮箱地址</li><li>IP： IP地址</li><li>Name： 姓名</li></ul>
    */
    @SerializedName("PredefinedRuleTypes")
    @Expose
    private String [] PredefinedRuleTypes;

    /**
    * <p>自定义脱敏规则</p>
    */
    @SerializedName("CustomRules")
    @Expose
    private AIGWCustomDesensitizeRule [] CustomRules;

    /**
    * <p>日志脱敏范围</p><p>枚举值：</p><ul><li>Request： 请求</li><li>Response： 响应</li></ul>
    */
    @SerializedName("Scope")
    @Expose
    private String [] Scope;

    /**
     * Get <p>日志脱敏开关</p> 
     * @return Enabled <p>日志脱敏开关</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>日志脱敏开关</p>
     * @param Enabled <p>日志脱敏开关</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>预定义规则类型</p><p>枚举值：</p><ul><li>Phone： 电话号码</li><li>IdCard： 身份证号</li><li>BankCard： 银行卡号</li><li>Email： 邮箱地址</li><li>IP： IP地址</li><li>Name： 姓名</li></ul> 
     * @return PredefinedRuleTypes <p>预定义规则类型</p><p>枚举值：</p><ul><li>Phone： 电话号码</li><li>IdCard： 身份证号</li><li>BankCard： 银行卡号</li><li>Email： 邮箱地址</li><li>IP： IP地址</li><li>Name： 姓名</li></ul>
     */
    public String [] getPredefinedRuleTypes() {
        return this.PredefinedRuleTypes;
    }

    /**
     * Set <p>预定义规则类型</p><p>枚举值：</p><ul><li>Phone： 电话号码</li><li>IdCard： 身份证号</li><li>BankCard： 银行卡号</li><li>Email： 邮箱地址</li><li>IP： IP地址</li><li>Name： 姓名</li></ul>
     * @param PredefinedRuleTypes <p>预定义规则类型</p><p>枚举值：</p><ul><li>Phone： 电话号码</li><li>IdCard： 身份证号</li><li>BankCard： 银行卡号</li><li>Email： 邮箱地址</li><li>IP： IP地址</li><li>Name： 姓名</li></ul>
     */
    public void setPredefinedRuleTypes(String [] PredefinedRuleTypes) {
        this.PredefinedRuleTypes = PredefinedRuleTypes;
    }

    /**
     * Get <p>自定义脱敏规则</p> 
     * @return CustomRules <p>自定义脱敏规则</p>
     */
    public AIGWCustomDesensitizeRule [] getCustomRules() {
        return this.CustomRules;
    }

    /**
     * Set <p>自定义脱敏规则</p>
     * @param CustomRules <p>自定义脱敏规则</p>
     */
    public void setCustomRules(AIGWCustomDesensitizeRule [] CustomRules) {
        this.CustomRules = CustomRules;
    }

    /**
     * Get <p>日志脱敏范围</p><p>枚举值：</p><ul><li>Request： 请求</li><li>Response： 响应</li></ul> 
     * @return Scope <p>日志脱敏范围</p><p>枚举值：</p><ul><li>Request： 请求</li><li>Response： 响应</li></ul>
     */
    public String [] getScope() {
        return this.Scope;
    }

    /**
     * Set <p>日志脱敏范围</p><p>枚举值：</p><ul><li>Request： 请求</li><li>Response： 响应</li></ul>
     * @param Scope <p>日志脱敏范围</p><p>枚举值：</p><ul><li>Request： 请求</li><li>Response： 响应</li></ul>
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

