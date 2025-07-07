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

public class IntelligenceRule extends AbstractModel {

    /**
    * 开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 规则详情。
    */
    @SerializedName("IntelligenceRuleItems")
    @Expose
    private IntelligenceRuleItem [] IntelligenceRuleItems;

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
     * Get 规则详情。 
     * @return IntelligenceRuleItems 规则详情。
     */
    public IntelligenceRuleItem [] getIntelligenceRuleItems() {
        return this.IntelligenceRuleItems;
    }

    /**
     * Set 规则详情。
     * @param IntelligenceRuleItems 规则详情。
     */
    public void setIntelligenceRuleItems(IntelligenceRuleItem [] IntelligenceRuleItems) {
        this.IntelligenceRuleItems = IntelligenceRuleItems;
    }

    public IntelligenceRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntelligenceRule(IntelligenceRule source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.IntelligenceRuleItems != null) {
            this.IntelligenceRuleItems = new IntelligenceRuleItem[source.IntelligenceRuleItems.length];
            for (int i = 0; i < source.IntelligenceRuleItems.length; i++) {
                this.IntelligenceRuleItems[i] = new IntelligenceRuleItem(source.IntelligenceRuleItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArrayObj(map, prefix + "IntelligenceRuleItems.", this.IntelligenceRuleItems);

    }
}

