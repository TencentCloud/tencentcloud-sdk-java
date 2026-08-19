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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneFullConfig extends AbstractModel {

    /**
    * <p>语法版本，当前默认为 1.0，输入其他值将会报错。</p>
    */
    @SerializedName("FormatVersion")
    @Expose
    private String FormatVersion;

    /**
    * <p>站点级配置，包含「站点加速」中所有配置项，且所有项均为必选，否则配置无效。</p>
    */
    @SerializedName("ZoneConfig")
    @Expose
    private ZoneConfig ZoneConfig;

    /**
    * <p>规则级配置，包含「规则引擎」中所有规则，且数组可为空，表示不启用任何规则。</p>
    */
    @SerializedName("Rules")
    @Expose
    private ConfigGroupRuleEngineItem [] Rules;

    /**
    * <p>Web 安全防护配置，对应控制台中「安全防护 - Web 防护」里支持的功能。</p>
    */
    @SerializedName("WebSecurity")
    @Expose
    private WebSecurity WebSecurity;

    /**
    * <p>边缘函数触发规则配置，包含触发「边缘函数」中所有规则，且数组可为空，表示不启用任何规则。</p>
    */
    @SerializedName("FunctionTriggers")
    @Expose
    private ConfigGroupFunctionTrigger [] FunctionTriggers;

    /**
     * Get <p>语法版本，当前默认为 1.0，输入其他值将会报错。</p> 
     * @return FormatVersion <p>语法版本，当前默认为 1.0，输入其他值将会报错。</p>
     */
    public String getFormatVersion() {
        return this.FormatVersion;
    }

    /**
     * Set <p>语法版本，当前默认为 1.0，输入其他值将会报错。</p>
     * @param FormatVersion <p>语法版本，当前默认为 1.0，输入其他值将会报错。</p>
     */
    public void setFormatVersion(String FormatVersion) {
        this.FormatVersion = FormatVersion;
    }

    /**
     * Get <p>站点级配置，包含「站点加速」中所有配置项，且所有项均为必选，否则配置无效。</p> 
     * @return ZoneConfig <p>站点级配置，包含「站点加速」中所有配置项，且所有项均为必选，否则配置无效。</p>
     */
    public ZoneConfig getZoneConfig() {
        return this.ZoneConfig;
    }

    /**
     * Set <p>站点级配置，包含「站点加速」中所有配置项，且所有项均为必选，否则配置无效。</p>
     * @param ZoneConfig <p>站点级配置，包含「站点加速」中所有配置项，且所有项均为必选，否则配置无效。</p>
     */
    public void setZoneConfig(ZoneConfig ZoneConfig) {
        this.ZoneConfig = ZoneConfig;
    }

    /**
     * Get <p>规则级配置，包含「规则引擎」中所有规则，且数组可为空，表示不启用任何规则。</p> 
     * @return Rules <p>规则级配置，包含「规则引擎」中所有规则，且数组可为空，表示不启用任何规则。</p>
     */
    public ConfigGroupRuleEngineItem [] getRules() {
        return this.Rules;
    }

    /**
     * Set <p>规则级配置，包含「规则引擎」中所有规则，且数组可为空，表示不启用任何规则。</p>
     * @param Rules <p>规则级配置，包含「规则引擎」中所有规则，且数组可为空，表示不启用任何规则。</p>
     */
    public void setRules(ConfigGroupRuleEngineItem [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get <p>Web 安全防护配置，对应控制台中「安全防护 - Web 防护」里支持的功能。</p> 
     * @return WebSecurity <p>Web 安全防护配置，对应控制台中「安全防护 - Web 防护」里支持的功能。</p>
     */
    public WebSecurity getWebSecurity() {
        return this.WebSecurity;
    }

    /**
     * Set <p>Web 安全防护配置，对应控制台中「安全防护 - Web 防护」里支持的功能。</p>
     * @param WebSecurity <p>Web 安全防护配置，对应控制台中「安全防护 - Web 防护」里支持的功能。</p>
     */
    public void setWebSecurity(WebSecurity WebSecurity) {
        this.WebSecurity = WebSecurity;
    }

    /**
     * Get <p>边缘函数触发规则配置，包含触发「边缘函数」中所有规则，且数组可为空，表示不启用任何规则。</p> 
     * @return FunctionTriggers <p>边缘函数触发规则配置，包含触发「边缘函数」中所有规则，且数组可为空，表示不启用任何规则。</p>
     */
    public ConfigGroupFunctionTrigger [] getFunctionTriggers() {
        return this.FunctionTriggers;
    }

    /**
     * Set <p>边缘函数触发规则配置，包含触发「边缘函数」中所有规则，且数组可为空，表示不启用任何规则。</p>
     * @param FunctionTriggers <p>边缘函数触发规则配置，包含触发「边缘函数」中所有规则，且数组可为空，表示不启用任何规则。</p>
     */
    public void setFunctionTriggers(ConfigGroupFunctionTrigger [] FunctionTriggers) {
        this.FunctionTriggers = FunctionTriggers;
    }

    public ZoneFullConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneFullConfig(ZoneFullConfig source) {
        if (source.FormatVersion != null) {
            this.FormatVersion = new String(source.FormatVersion);
        }
        if (source.ZoneConfig != null) {
            this.ZoneConfig = new ZoneConfig(source.ZoneConfig);
        }
        if (source.Rules != null) {
            this.Rules = new ConfigGroupRuleEngineItem[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new ConfigGroupRuleEngineItem(source.Rules[i]);
            }
        }
        if (source.WebSecurity != null) {
            this.WebSecurity = new WebSecurity(source.WebSecurity);
        }
        if (source.FunctionTriggers != null) {
            this.FunctionTriggers = new ConfigGroupFunctionTrigger[source.FunctionTriggers.length];
            for (int i = 0; i < source.FunctionTriggers.length; i++) {
                this.FunctionTriggers[i] = new ConfigGroupFunctionTrigger(source.FunctionTriggers[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FormatVersion", this.FormatVersion);
        this.setParamObj(map, prefix + "ZoneConfig.", this.ZoneConfig);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamObj(map, prefix + "WebSecurity.", this.WebSecurity);
        this.setParamArrayObj(map, prefix + "FunctionTriggers.", this.FunctionTriggers);

    }
}

