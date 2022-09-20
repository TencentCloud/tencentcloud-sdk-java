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

public class DDoSAllowBlock extends AbstractModel{

    /**
    * 黑白名单数组。
    */
    @SerializedName("DDoSAllowBlockRules")
    @Expose
    private DDoSAllowBlockRule [] DDoSAllowBlockRules;

    /**
    * 开关标识防护是否清空，取值有：
<li>off ：关闭黑白名单；</li>
<li>on ：开启黑白名单，需填写UserAllowBlockIp参数。</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
     * Get 黑白名单数组。 
     * @return DDoSAllowBlockRules 黑白名单数组。
     */
    public DDoSAllowBlockRule [] getDDoSAllowBlockRules() {
        return this.DDoSAllowBlockRules;
    }

    /**
     * Set 黑白名单数组。
     * @param DDoSAllowBlockRules 黑白名单数组。
     */
    public void setDDoSAllowBlockRules(DDoSAllowBlockRule [] DDoSAllowBlockRules) {
        this.DDoSAllowBlockRules = DDoSAllowBlockRules;
    }

    /**
     * Get 开关标识防护是否清空，取值有：
<li>off ：关闭黑白名单；</li>
<li>on ：开启黑白名单，需填写UserAllowBlockIp参数。</li> 
     * @return Switch 开关标识防护是否清空，取值有：
<li>off ：关闭黑白名单；</li>
<li>on ：开启黑白名单，需填写UserAllowBlockIp参数。</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 开关标识防护是否清空，取值有：
<li>off ：关闭黑白名单；</li>
<li>on ：开启黑白名单，需填写UserAllowBlockIp参数。</li>
     * @param Switch 开关标识防护是否清空，取值有：
<li>off ：关闭黑白名单；</li>
<li>on ：开启黑白名单，需填写UserAllowBlockIp参数。</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    public DDoSAllowBlock() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDoSAllowBlock(DDoSAllowBlock source) {
        if (source.DDoSAllowBlockRules != null) {
            this.DDoSAllowBlockRules = new DDoSAllowBlockRule[source.DDoSAllowBlockRules.length];
            for (int i = 0; i < source.DDoSAllowBlockRules.length; i++) {
                this.DDoSAllowBlockRules[i] = new DDoSAllowBlockRule(source.DDoSAllowBlockRules[i]);
            }
        }
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DDoSAllowBlockRules.", this.DDoSAllowBlockRules);
        this.setParamSimple(map, prefix + "Switch", this.Switch);

    }
}

