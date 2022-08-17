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

public class DdosAllowBlock extends AbstractModel{

    /**
    * 黑白名单数组。
    */
    @SerializedName("UserAllowBlockIp")
    @Expose
    private DDoSUserAllowBlockIP [] UserAllowBlockIp;

    /**
    * 开关标识防护是否清空，取值有：
<li>off ：清空黑白名单列表，UserAllowBlockIp无需填写。 ；</li>
<li>on ：配置黑白名单，需填写UserAllowBlockIp参数。</li>默认值为on。
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
     * Get 黑白名单数组。 
     * @return UserAllowBlockIp 黑白名单数组。
     */
    public DDoSUserAllowBlockIP [] getUserAllowBlockIp() {
        return this.UserAllowBlockIp;
    }

    /**
     * Set 黑白名单数组。
     * @param UserAllowBlockIp 黑白名单数组。
     */
    public void setUserAllowBlockIp(DDoSUserAllowBlockIP [] UserAllowBlockIp) {
        this.UserAllowBlockIp = UserAllowBlockIp;
    }

    /**
     * Get 开关标识防护是否清空，取值有：
<li>off ：清空黑白名单列表，UserAllowBlockIp无需填写。 ；</li>
<li>on ：配置黑白名单，需填写UserAllowBlockIp参数。</li>默认值为on。 
     * @return Switch 开关标识防护是否清空，取值有：
<li>off ：清空黑白名单列表，UserAllowBlockIp无需填写。 ；</li>
<li>on ：配置黑白名单，需填写UserAllowBlockIp参数。</li>默认值为on。
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 开关标识防护是否清空，取值有：
<li>off ：清空黑白名单列表，UserAllowBlockIp无需填写。 ；</li>
<li>on ：配置黑白名单，需填写UserAllowBlockIp参数。</li>默认值为on。
     * @param Switch 开关标识防护是否清空，取值有：
<li>off ：清空黑白名单列表，UserAllowBlockIp无需填写。 ；</li>
<li>on ：配置黑白名单，需填写UserAllowBlockIp参数。</li>默认值为on。
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    public DdosAllowBlock() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DdosAllowBlock(DdosAllowBlock source) {
        if (source.UserAllowBlockIp != null) {
            this.UserAllowBlockIp = new DDoSUserAllowBlockIP[source.UserAllowBlockIp.length];
            for (int i = 0; i < source.UserAllowBlockIp.length; i++) {
                this.UserAllowBlockIp[i] = new DDoSUserAllowBlockIP(source.UserAllowBlockIp[i]);
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
        this.setParamArrayObj(map, prefix + "UserAllowBlockIp.", this.UserAllowBlockIp);
        this.setParamSimple(map, prefix + "Switch", this.Switch);

    }
}

