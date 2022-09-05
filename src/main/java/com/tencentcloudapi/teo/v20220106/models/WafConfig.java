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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WafConfig extends AbstractModel{

    /**
    * WafConfig开关，取值有：
<li> on：开启；</li>
<li> off：关闭。</li>开关仅与配置是否生效有关，即使为off（关闭），也可以正常修改配置的内容。
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 防护级别，取值有：
<li> loose：宽松；</li>
<li> normal：正常；</li>
<li> strict：严格；</li>
<li> stricter：超严格；</li>
<li> custom：自定义。</li>
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 全局WAF模式，取值有：
<li> block：阻断（全局阻断，但可对详细规则配置观察）；</li>
<li> observe：观察（无论详细规则配置什么，都为观察）。</li>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 托管规则详细配置。
    */
    @SerializedName("WafRules")
    @Expose
    private WafRule WafRules;

    /**
    * AI规则引擎防护配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AiRule")
    @Expose
    private AiRule AiRule;

    /**
     * Get WafConfig开关，取值有：
<li> on：开启；</li>
<li> off：关闭。</li>开关仅与配置是否生效有关，即使为off（关闭），也可以正常修改配置的内容。 
     * @return Switch WafConfig开关，取值有：
<li> on：开启；</li>
<li> off：关闭。</li>开关仅与配置是否生效有关，即使为off（关闭），也可以正常修改配置的内容。
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set WafConfig开关，取值有：
<li> on：开启；</li>
<li> off：关闭。</li>开关仅与配置是否生效有关，即使为off（关闭），也可以正常修改配置的内容。
     * @param Switch WafConfig开关，取值有：
<li> on：开启；</li>
<li> off：关闭。</li>开关仅与配置是否生效有关，即使为off（关闭），也可以正常修改配置的内容。
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 防护级别，取值有：
<li> loose：宽松；</li>
<li> normal：正常；</li>
<li> strict：严格；</li>
<li> stricter：超严格；</li>
<li> custom：自定义。</li> 
     * @return Level 防护级别，取值有：
<li> loose：宽松；</li>
<li> normal：正常；</li>
<li> strict：严格；</li>
<li> stricter：超严格；</li>
<li> custom：自定义。</li>
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 防护级别，取值有：
<li> loose：宽松；</li>
<li> normal：正常；</li>
<li> strict：严格；</li>
<li> stricter：超严格；</li>
<li> custom：自定义。</li>
     * @param Level 防护级别，取值有：
<li> loose：宽松；</li>
<li> normal：正常；</li>
<li> strict：严格；</li>
<li> stricter：超严格；</li>
<li> custom：自定义。</li>
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get 全局WAF模式，取值有：
<li> block：阻断（全局阻断，但可对详细规则配置观察）；</li>
<li> observe：观察（无论详细规则配置什么，都为观察）。</li> 
     * @return Mode 全局WAF模式，取值有：
<li> block：阻断（全局阻断，但可对详细规则配置观察）；</li>
<li> observe：观察（无论详细规则配置什么，都为观察）。</li>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 全局WAF模式，取值有：
<li> block：阻断（全局阻断，但可对详细规则配置观察）；</li>
<li> observe：观察（无论详细规则配置什么，都为观察）。</li>
     * @param Mode 全局WAF模式，取值有：
<li> block：阻断（全局阻断，但可对详细规则配置观察）；</li>
<li> observe：观察（无论详细规则配置什么，都为观察）。</li>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 托管规则详细配置。 
     * @return WafRules 托管规则详细配置。
     */
    public WafRule getWafRules() {
        return this.WafRules;
    }

    /**
     * Set 托管规则详细配置。
     * @param WafRules 托管规则详细配置。
     */
    public void setWafRules(WafRule WafRules) {
        this.WafRules = WafRules;
    }

    /**
     * Get AI规则引擎防护配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AiRule AI规则引擎防护配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiRule getAiRule() {
        return this.AiRule;
    }

    /**
     * Set AI规则引擎防护配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AiRule AI规则引擎防护配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAiRule(AiRule AiRule) {
        this.AiRule = AiRule;
    }

    public WafConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WafConfig(WafConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.WafRules != null) {
            this.WafRules = new WafRule(source.WafRules);
        }
        if (source.AiRule != null) {
            this.AiRule = new AiRule(source.AiRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamObj(map, prefix + "WafRules.", this.WafRules);
        this.setParamObj(map, prefix + "AiRule.", this.AiRule);

    }
}

