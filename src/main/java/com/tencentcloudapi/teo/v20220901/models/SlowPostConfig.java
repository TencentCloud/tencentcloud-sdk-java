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

public class SlowPostConfig extends AbstractModel{

    /**
    * 开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 首包配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FirstPartConfig")
    @Expose
    private FirstPartConfig FirstPartConfig;

    /**
    * 基础配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SlowRateConfig")
    @Expose
    private SlowRateConfig SlowRateConfig;

    /**
    * 慢速攻击的处置动作，取值有：
<li>monitor：观察；</li>
<li>drop：拦截。</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 本规则的Id。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
     * Get 开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li> 
     * @return Switch 开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
     * @param Switch 开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 首包配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FirstPartConfig 首包配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FirstPartConfig getFirstPartConfig() {
        return this.FirstPartConfig;
    }

    /**
     * Set 首包配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FirstPartConfig 首包配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFirstPartConfig(FirstPartConfig FirstPartConfig) {
        this.FirstPartConfig = FirstPartConfig;
    }

    /**
     * Get 基础配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SlowRateConfig 基础配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SlowRateConfig getSlowRateConfig() {
        return this.SlowRateConfig;
    }

    /**
     * Set 基础配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SlowRateConfig 基础配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSlowRateConfig(SlowRateConfig SlowRateConfig) {
        this.SlowRateConfig = SlowRateConfig;
    }

    /**
     * Get 慢速攻击的处置动作，取值有：
<li>monitor：观察；</li>
<li>drop：拦截。</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Action 慢速攻击的处置动作，取值有：
<li>monitor：观察；</li>
<li>drop：拦截。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 慢速攻击的处置动作，取值有：
<li>monitor：观察；</li>
<li>drop：拦截。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Action 慢速攻击的处置动作，取值有：
<li>monitor：观察；</li>
<li>drop：拦截。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 本规则的Id。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleId 本规则的Id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 本规则的Id。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleId 本规则的Id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    public SlowPostConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SlowPostConfig(SlowPostConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.FirstPartConfig != null) {
            this.FirstPartConfig = new FirstPartConfig(source.FirstPartConfig);
        }
        if (source.SlowRateConfig != null) {
            this.SlowRateConfig = new SlowRateConfig(source.SlowRateConfig);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamObj(map, prefix + "FirstPartConfig.", this.FirstPartConfig);
        this.setParamObj(map, prefix + "SlowRateConfig.", this.SlowRateConfig);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);

    }
}

