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

public class RateLimitIntelligence extends AbstractModel{

    /**
    * 功能开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 执行动作，取值有：
<li>monitor：观察；</li>
<li>alg：挑战。</li>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 规则id，仅出参使用。
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
     * Get 功能开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li> 
     * @return Switch 功能开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 功能开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
     * @param Switch 功能开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 执行动作，取值有：
<li>monitor：观察；</li>
<li>alg：挑战。</li> 
     * @return Action 执行动作，取值有：
<li>monitor：观察；</li>
<li>alg：挑战。</li>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 执行动作，取值有：
<li>monitor：观察；</li>
<li>alg：挑战。</li>
     * @param Action 执行动作，取值有：
<li>monitor：观察；</li>
<li>alg：挑战。</li>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 规则id，仅出参使用。 
     * @return RuleId 规则id，仅出参使用。
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则id，仅出参使用。
     * @param RuleId 规则id，仅出参使用。
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    public RateLimitIntelligence() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RateLimitIntelligence(RateLimitIntelligence source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
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
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);

    }
}

