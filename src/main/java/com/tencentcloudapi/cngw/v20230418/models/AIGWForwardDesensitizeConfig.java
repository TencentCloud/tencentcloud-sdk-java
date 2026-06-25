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

public class AIGWForwardDesensitizeConfig extends AbstractModel {

    /**
    * <p>转发脱敏开关</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * <p>预定义规则类型</p><p>枚举值：</p><ul><li>Phone： 电话号码</li><li>IdCard： 身份证号</li><li>BankCard： 银行卡号</li><li>Email： 电子邮箱地址</li><li>IP： IP地址</li><li>Name： 姓名</li></ul>
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
    * <p>掩码</p>
    */
    @SerializedName("PlaceholderFormat")
    @Expose
    private String PlaceholderFormat;

    /**
    * <p>脱敏异常处理</p><p>枚举值：</p><ul><li>Reject： 拒绝请求</li><li>Skip： 跳过</li></ul>
    */
    @SerializedName("OnFailure")
    @Expose
    private String OnFailure;

    /**
     * Get <p>转发脱敏开关</p> 
     * @return Enabled <p>转发脱敏开关</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>转发脱敏开关</p>
     * @param Enabled <p>转发脱敏开关</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>预定义规则类型</p><p>枚举值：</p><ul><li>Phone： 电话号码</li><li>IdCard： 身份证号</li><li>BankCard： 银行卡号</li><li>Email： 电子邮箱地址</li><li>IP： IP地址</li><li>Name： 姓名</li></ul> 
     * @return PredefinedRuleTypes <p>预定义规则类型</p><p>枚举值：</p><ul><li>Phone： 电话号码</li><li>IdCard： 身份证号</li><li>BankCard： 银行卡号</li><li>Email： 电子邮箱地址</li><li>IP： IP地址</li><li>Name： 姓名</li></ul>
     */
    public String [] getPredefinedRuleTypes() {
        return this.PredefinedRuleTypes;
    }

    /**
     * Set <p>预定义规则类型</p><p>枚举值：</p><ul><li>Phone： 电话号码</li><li>IdCard： 身份证号</li><li>BankCard： 银行卡号</li><li>Email： 电子邮箱地址</li><li>IP： IP地址</li><li>Name： 姓名</li></ul>
     * @param PredefinedRuleTypes <p>预定义规则类型</p><p>枚举值：</p><ul><li>Phone： 电话号码</li><li>IdCard： 身份证号</li><li>BankCard： 银行卡号</li><li>Email： 电子邮箱地址</li><li>IP： IP地址</li><li>Name： 姓名</li></ul>
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
     * Get <p>掩码</p> 
     * @return PlaceholderFormat <p>掩码</p>
     */
    public String getPlaceholderFormat() {
        return this.PlaceholderFormat;
    }

    /**
     * Set <p>掩码</p>
     * @param PlaceholderFormat <p>掩码</p>
     */
    public void setPlaceholderFormat(String PlaceholderFormat) {
        this.PlaceholderFormat = PlaceholderFormat;
    }

    /**
     * Get <p>脱敏异常处理</p><p>枚举值：</p><ul><li>Reject： 拒绝请求</li><li>Skip： 跳过</li></ul> 
     * @return OnFailure <p>脱敏异常处理</p><p>枚举值：</p><ul><li>Reject： 拒绝请求</li><li>Skip： 跳过</li></ul>
     */
    public String getOnFailure() {
        return this.OnFailure;
    }

    /**
     * Set <p>脱敏异常处理</p><p>枚举值：</p><ul><li>Reject： 拒绝请求</li><li>Skip： 跳过</li></ul>
     * @param OnFailure <p>脱敏异常处理</p><p>枚举值：</p><ul><li>Reject： 拒绝请求</li><li>Skip： 跳过</li></ul>
     */
    public void setOnFailure(String OnFailure) {
        this.OnFailure = OnFailure;
    }

    public AIGWForwardDesensitizeConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWForwardDesensitizeConfig(AIGWForwardDesensitizeConfig source) {
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
        if (source.PlaceholderFormat != null) {
            this.PlaceholderFormat = new String(source.PlaceholderFormat);
        }
        if (source.OnFailure != null) {
            this.OnFailure = new String(source.OnFailure);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamArraySimple(map, prefix + "PredefinedRuleTypes.", this.PredefinedRuleTypes);
        this.setParamArrayObj(map, prefix + "CustomRules.", this.CustomRules);
        this.setParamSimple(map, prefix + "PlaceholderFormat", this.PlaceholderFormat);
        this.setParamSimple(map, prefix + "OnFailure", this.OnFailure);

    }
}

