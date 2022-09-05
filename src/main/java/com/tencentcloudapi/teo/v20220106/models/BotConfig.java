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

public class BotConfig extends AbstractModel{

    /**
    * 开关。
1. on 开启
2. off 关闭
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 通用详细基础规则。
    */
    @SerializedName("ManagedRule")
    @Expose
    private BotManagedRule ManagedRule;

    /**
    * ua基础规则。
    */
    @SerializedName("UaBotRule")
    @Expose
    private BotManagedRule UaBotRule;

    /**
    * isp基础规则。
    */
    @SerializedName("IspBotRule")
    @Expose
    private BotManagedRule IspBotRule;

    /**
    * 用户画像规则。
    */
    @SerializedName("PortraitRule")
    @Expose
    private BotPortraitRule PortraitRule;

    /**
    * Bot智能分析。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IntelligenceRule")
    @Expose
    private IntelligenceRule IntelligenceRule;

    /**
     * Get 开关。
1. on 开启
2. off 关闭 
     * @return Switch 开关。
1. on 开启
2. off 关闭
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 开关。
1. on 开启
2. off 关闭
     * @param Switch 开关。
1. on 开启
2. off 关闭
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 通用详细基础规则。 
     * @return ManagedRule 通用详细基础规则。
     */
    public BotManagedRule getManagedRule() {
        return this.ManagedRule;
    }

    /**
     * Set 通用详细基础规则。
     * @param ManagedRule 通用详细基础规则。
     */
    public void setManagedRule(BotManagedRule ManagedRule) {
        this.ManagedRule = ManagedRule;
    }

    /**
     * Get ua基础规则。 
     * @return UaBotRule ua基础规则。
     */
    public BotManagedRule getUaBotRule() {
        return this.UaBotRule;
    }

    /**
     * Set ua基础规则。
     * @param UaBotRule ua基础规则。
     */
    public void setUaBotRule(BotManagedRule UaBotRule) {
        this.UaBotRule = UaBotRule;
    }

    /**
     * Get isp基础规则。 
     * @return IspBotRule isp基础规则。
     */
    public BotManagedRule getIspBotRule() {
        return this.IspBotRule;
    }

    /**
     * Set isp基础规则。
     * @param IspBotRule isp基础规则。
     */
    public void setIspBotRule(BotManagedRule IspBotRule) {
        this.IspBotRule = IspBotRule;
    }

    /**
     * Get 用户画像规则。 
     * @return PortraitRule 用户画像规则。
     */
    public BotPortraitRule getPortraitRule() {
        return this.PortraitRule;
    }

    /**
     * Set 用户画像规则。
     * @param PortraitRule 用户画像规则。
     */
    public void setPortraitRule(BotPortraitRule PortraitRule) {
        this.PortraitRule = PortraitRule;
    }

    /**
     * Get Bot智能分析。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IntelligenceRule Bot智能分析。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IntelligenceRule getIntelligenceRule() {
        return this.IntelligenceRule;
    }

    /**
     * Set Bot智能分析。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IntelligenceRule Bot智能分析。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIntelligenceRule(IntelligenceRule IntelligenceRule) {
        this.IntelligenceRule = IntelligenceRule;
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
        if (source.ManagedRule != null) {
            this.ManagedRule = new BotManagedRule(source.ManagedRule);
        }
        if (source.UaBotRule != null) {
            this.UaBotRule = new BotManagedRule(source.UaBotRule);
        }
        if (source.IspBotRule != null) {
            this.IspBotRule = new BotManagedRule(source.IspBotRule);
        }
        if (source.PortraitRule != null) {
            this.PortraitRule = new BotPortraitRule(source.PortraitRule);
        }
        if (source.IntelligenceRule != null) {
            this.IntelligenceRule = new IntelligenceRule(source.IntelligenceRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamObj(map, prefix + "ManagedRule.", this.ManagedRule);
        this.setParamObj(map, prefix + "UaBotRule.", this.UaBotRule);
        this.setParamObj(map, prefix + "IspBotRule.", this.IspBotRule);
        this.setParamObj(map, prefix + "PortraitRule.", this.PortraitRule);
        this.setParamObj(map, prefix + "IntelligenceRule.", this.IntelligenceRule);

    }
}

