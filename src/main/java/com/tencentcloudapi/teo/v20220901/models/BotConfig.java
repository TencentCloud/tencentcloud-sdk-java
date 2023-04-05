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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BotConfig extends AbstractModel{

    /**
    * bot开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 通用详细基础规则。如果为null，默认使用历史配置。
    */
    @SerializedName("BotManagedRule")
    @Expose
    private BotManagedRule BotManagedRule;

    /**
    * 用户画像规则。如果为null，默认使用历史配置。
    */
    @SerializedName("BotPortraitRule")
    @Expose
    private BotPortraitRule BotPortraitRule;

    /**
    * Bot智能分析。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IntelligenceRule")
    @Expose
    private IntelligenceRule IntelligenceRule;

    /**
    * Bot自定义规则。如果为null，默认使用历史配置。
    */
    @SerializedName("BotUserRules")
    @Expose
    private BotUserRule [] BotUserRules;

    /**
    * Bot主动特征识别规则。
    */
    @SerializedName("AlgDetectRule")
    @Expose
    private AlgDetectRule [] AlgDetectRule;

    /**
    * Bot托管定制策略，入参可不填，仅出参使用。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Customizes")
    @Expose
    private BotUserRule [] Customizes;

    /**
     * Get bot开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li> 
     * @return Switch bot开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set bot开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
     * @param Switch bot开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 通用详细基础规则。如果为null，默认使用历史配置。 
     * @return BotManagedRule 通用详细基础规则。如果为null，默认使用历史配置。
     */
    public BotManagedRule getBotManagedRule() {
        return this.BotManagedRule;
    }

    /**
     * Set 通用详细基础规则。如果为null，默认使用历史配置。
     * @param BotManagedRule 通用详细基础规则。如果为null，默认使用历史配置。
     */
    public void setBotManagedRule(BotManagedRule BotManagedRule) {
        this.BotManagedRule = BotManagedRule;
    }

    /**
     * Get 用户画像规则。如果为null，默认使用历史配置。 
     * @return BotPortraitRule 用户画像规则。如果为null，默认使用历史配置。
     */
    public BotPortraitRule getBotPortraitRule() {
        return this.BotPortraitRule;
    }

    /**
     * Set 用户画像规则。如果为null，默认使用历史配置。
     * @param BotPortraitRule 用户画像规则。如果为null，默认使用历史配置。
     */
    public void setBotPortraitRule(BotPortraitRule BotPortraitRule) {
        this.BotPortraitRule = BotPortraitRule;
    }

    /**
     * Get Bot智能分析。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IntelligenceRule Bot智能分析。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IntelligenceRule getIntelligenceRule() {
        return this.IntelligenceRule;
    }

    /**
     * Set Bot智能分析。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IntelligenceRule Bot智能分析。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIntelligenceRule(IntelligenceRule IntelligenceRule) {
        this.IntelligenceRule = IntelligenceRule;
    }

    /**
     * Get Bot自定义规则。如果为null，默认使用历史配置。 
     * @return BotUserRules Bot自定义规则。如果为null，默认使用历史配置。
     */
    public BotUserRule [] getBotUserRules() {
        return this.BotUserRules;
    }

    /**
     * Set Bot自定义规则。如果为null，默认使用历史配置。
     * @param BotUserRules Bot自定义规则。如果为null，默认使用历史配置。
     */
    public void setBotUserRules(BotUserRule [] BotUserRules) {
        this.BotUserRules = BotUserRules;
    }

    /**
     * Get Bot主动特征识别规则。 
     * @return AlgDetectRule Bot主动特征识别规则。
     */
    public AlgDetectRule [] getAlgDetectRule() {
        return this.AlgDetectRule;
    }

    /**
     * Set Bot主动特征识别规则。
     * @param AlgDetectRule Bot主动特征识别规则。
     */
    public void setAlgDetectRule(AlgDetectRule [] AlgDetectRule) {
        this.AlgDetectRule = AlgDetectRule;
    }

    /**
     * Get Bot托管定制策略，入参可不填，仅出参使用。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Customizes Bot托管定制策略，入参可不填，仅出参使用。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BotUserRule [] getCustomizes() {
        return this.Customizes;
    }

    /**
     * Set Bot托管定制策略，入参可不填，仅出参使用。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Customizes Bot托管定制策略，入参可不填，仅出参使用。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomizes(BotUserRule [] Customizes) {
        this.Customizes = Customizes;
    }

    public BotConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotConfig(BotConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.BotManagedRule != null) {
            this.BotManagedRule = new BotManagedRule(source.BotManagedRule);
        }
        if (source.BotPortraitRule != null) {
            this.BotPortraitRule = new BotPortraitRule(source.BotPortraitRule);
        }
        if (source.IntelligenceRule != null) {
            this.IntelligenceRule = new IntelligenceRule(source.IntelligenceRule);
        }
        if (source.BotUserRules != null) {
            this.BotUserRules = new BotUserRule[source.BotUserRules.length];
            for (int i = 0; i < source.BotUserRules.length; i++) {
                this.BotUserRules[i] = new BotUserRule(source.BotUserRules[i]);
            }
        }
        if (source.AlgDetectRule != null) {
            this.AlgDetectRule = new AlgDetectRule[source.AlgDetectRule.length];
            for (int i = 0; i < source.AlgDetectRule.length; i++) {
                this.AlgDetectRule[i] = new AlgDetectRule(source.AlgDetectRule[i]);
            }
        }
        if (source.Customizes != null) {
            this.Customizes = new BotUserRule[source.Customizes.length];
            for (int i = 0; i < source.Customizes.length; i++) {
                this.Customizes[i] = new BotUserRule(source.Customizes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamObj(map, prefix + "BotManagedRule.", this.BotManagedRule);
        this.setParamObj(map, prefix + "BotPortraitRule.", this.BotPortraitRule);
        this.setParamObj(map, prefix + "IntelligenceRule.", this.IntelligenceRule);
        this.setParamArrayObj(map, prefix + "BotUserRules.", this.BotUserRules);
        this.setParamArrayObj(map, prefix + "AlgDetectRule.", this.AlgDetectRule);
        this.setParamArrayObj(map, prefix + "Customizes.", this.Customizes);

    }
}

