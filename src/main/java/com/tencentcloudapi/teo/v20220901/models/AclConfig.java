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

public class AclConfig extends AbstractModel{

    /**
    * 开关，取值有：
<li> on：开启；</li>
<li> off：关闭。</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 用户自定义规则。
    */
    @SerializedName("AclUserRules")
    @Expose
    private AclUserRule [] AclUserRules;

    /**
     * Get 开关，取值有：
<li> on：开启；</li>
<li> off：关闭。</li> 
     * @return Switch 开关，取值有：
<li> on：开启；</li>
<li> off：关闭。</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 开关，取值有：
<li> on：开启；</li>
<li> off：关闭。</li>
     * @param Switch 开关，取值有：
<li> on：开启；</li>
<li> off：关闭。</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 用户自定义规则。 
     * @return AclUserRules 用户自定义规则。
     */
    public AclUserRule [] getAclUserRules() {
        return this.AclUserRules;
    }

    /**
     * Set 用户自定义规则。
     * @param AclUserRules 用户自定义规则。
     */
    public void setAclUserRules(AclUserRule [] AclUserRules) {
        this.AclUserRules = AclUserRules;
    }

    public AclConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AclConfig(AclConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.AclUserRules != null) {
            this.AclUserRules = new AclUserRule[source.AclUserRules.length];
            for (int i = 0; i < source.AclUserRules.length; i++) {
                this.AclUserRules[i] = new AclUserRule(source.AclUserRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArrayObj(map, prefix + "AclUserRules.", this.AclUserRules);

    }
}

