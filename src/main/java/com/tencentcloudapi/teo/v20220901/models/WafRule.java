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

public class WafRule extends AbstractModel{

    /**
    * 托管规则开关，取值有：
<li> on：开启；</li>
<li> off：关闭。</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 黑名单ID列表，将规则ID加入本参数列表中代表该ID关闭，即该规则ID不再生效。
    */
    @SerializedName("BlockRuleIDs")
    @Expose
    private Long [] BlockRuleIDs;

    /**
    * 观察模式ID列表，将规则ID加入本参数列表中代表该ID使用观察模式生效，即该规则ID进入观察模式。
    */
    @SerializedName("ObserveRuleIDs")
    @Expose
    private Long [] ObserveRuleIDs;

    /**
     * Get 托管规则开关，取值有：
<li> on：开启；</li>
<li> off：关闭。</li> 
     * @return Switch 托管规则开关，取值有：
<li> on：开启；</li>
<li> off：关闭。</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 托管规则开关，取值有：
<li> on：开启；</li>
<li> off：关闭。</li>
     * @param Switch 托管规则开关，取值有：
<li> on：开启；</li>
<li> off：关闭。</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 黑名单ID列表，将规则ID加入本参数列表中代表该ID关闭，即该规则ID不再生效。 
     * @return BlockRuleIDs 黑名单ID列表，将规则ID加入本参数列表中代表该ID关闭，即该规则ID不再生效。
     */
    public Long [] getBlockRuleIDs() {
        return this.BlockRuleIDs;
    }

    /**
     * Set 黑名单ID列表，将规则ID加入本参数列表中代表该ID关闭，即该规则ID不再生效。
     * @param BlockRuleIDs 黑名单ID列表，将规则ID加入本参数列表中代表该ID关闭，即该规则ID不再生效。
     */
    public void setBlockRuleIDs(Long [] BlockRuleIDs) {
        this.BlockRuleIDs = BlockRuleIDs;
    }

    /**
     * Get 观察模式ID列表，将规则ID加入本参数列表中代表该ID使用观察模式生效，即该规则ID进入观察模式。 
     * @return ObserveRuleIDs 观察模式ID列表，将规则ID加入本参数列表中代表该ID使用观察模式生效，即该规则ID进入观察模式。
     */
    public Long [] getObserveRuleIDs() {
        return this.ObserveRuleIDs;
    }

    /**
     * Set 观察模式ID列表，将规则ID加入本参数列表中代表该ID使用观察模式生效，即该规则ID进入观察模式。
     * @param ObserveRuleIDs 观察模式ID列表，将规则ID加入本参数列表中代表该ID使用观察模式生效，即该规则ID进入观察模式。
     */
    public void setObserveRuleIDs(Long [] ObserveRuleIDs) {
        this.ObserveRuleIDs = ObserveRuleIDs;
    }

    public WafRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WafRule(WafRule source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.BlockRuleIDs != null) {
            this.BlockRuleIDs = new Long[source.BlockRuleIDs.length];
            for (int i = 0; i < source.BlockRuleIDs.length; i++) {
                this.BlockRuleIDs[i] = new Long(source.BlockRuleIDs[i]);
            }
        }
        if (source.ObserveRuleIDs != null) {
            this.ObserveRuleIDs = new Long[source.ObserveRuleIDs.length];
            for (int i = 0; i < source.ObserveRuleIDs.length; i++) {
                this.ObserveRuleIDs[i] = new Long(source.ObserveRuleIDs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArraySimple(map, prefix + "BlockRuleIDs.", this.BlockRuleIDs);
        this.setParamArraySimple(map, prefix + "ObserveRuleIDs.", this.ObserveRuleIDs);

    }
}

