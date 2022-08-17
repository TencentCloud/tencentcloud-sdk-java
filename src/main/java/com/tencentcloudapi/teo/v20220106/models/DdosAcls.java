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

public class DdosAcls extends AbstractModel{

    /**
    * 端口过滤规则数组。
    */
    @SerializedName("Acl")
    @Expose
    private DDoSAcl [] Acl;

    /**
    * 清空规则标识，取值有：
<li>off ：清空端口过滤规则列表，Acl无需填写。 ；</li>
<li>on ：配置端口过滤规则，需填写Acl参数。</li>默认值为on。
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
     * Get 端口过滤规则数组。 
     * @return Acl 端口过滤规则数组。
     */
    public DDoSAcl [] getAcl() {
        return this.Acl;
    }

    /**
     * Set 端口过滤规则数组。
     * @param Acl 端口过滤规则数组。
     */
    public void setAcl(DDoSAcl [] Acl) {
        this.Acl = Acl;
    }

    /**
     * Get 清空规则标识，取值有：
<li>off ：清空端口过滤规则列表，Acl无需填写。 ；</li>
<li>on ：配置端口过滤规则，需填写Acl参数。</li>默认值为on。 
     * @return Switch 清空规则标识，取值有：
<li>off ：清空端口过滤规则列表，Acl无需填写。 ；</li>
<li>on ：配置端口过滤规则，需填写Acl参数。</li>默认值为on。
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 清空规则标识，取值有：
<li>off ：清空端口过滤规则列表，Acl无需填写。 ；</li>
<li>on ：配置端口过滤规则，需填写Acl参数。</li>默认值为on。
     * @param Switch 清空规则标识，取值有：
<li>off ：清空端口过滤规则列表，Acl无需填写。 ；</li>
<li>on ：配置端口过滤规则，需填写Acl参数。</li>默认值为on。
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    public DdosAcls() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DdosAcls(DdosAcls source) {
        if (source.Acl != null) {
            this.Acl = new DDoSAcl[source.Acl.length];
            for (int i = 0; i < source.Acl.length; i++) {
                this.Acl[i] = new DDoSAcl(source.Acl[i]);
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
        this.setParamArrayObj(map, prefix + "Acl.", this.Acl);
        this.setParamSimple(map, prefix + "Switch", this.Switch);

    }
}

