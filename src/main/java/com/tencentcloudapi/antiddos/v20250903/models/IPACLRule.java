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
package com.tencentcloudapi.antiddos.v20250903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IPACLRule extends AbstractModel {

    /**
    * <p>处置方式。</p><p>枚举值：</p><ul><li>drop： 黑名单（拦截）。</li><li>allow： 白名单（放行）。</li></ul>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * <p>IP 列表。</p><p>参数格式：支持 IPv4、IPv6 和 CIDR 格式。</p>
    */
    @SerializedName("IPs")
    @Expose
    private String [] IPs;

    /**
     * Get <p>处置方式。</p><p>枚举值：</p><ul><li>drop： 黑名单（拦截）。</li><li>allow： 白名单（放行）。</li></ul> 
     * @return Action <p>处置方式。</p><p>枚举值：</p><ul><li>drop： 黑名单（拦截）。</li><li>allow： 白名单（放行）。</li></ul>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set <p>处置方式。</p><p>枚举值：</p><ul><li>drop： 黑名单（拦截）。</li><li>allow： 白名单（放行）。</li></ul>
     * @param Action <p>处置方式。</p><p>枚举值：</p><ul><li>drop： 黑名单（拦截）。</li><li>allow： 白名单（放行）。</li></ul>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get <p>IP 列表。</p><p>参数格式：支持 IPv4、IPv6 和 CIDR 格式。</p> 
     * @return IPs <p>IP 列表。</p><p>参数格式：支持 IPv4、IPv6 和 CIDR 格式。</p>
     */
    public String [] getIPs() {
        return this.IPs;
    }

    /**
     * Set <p>IP 列表。</p><p>参数格式：支持 IPv4、IPv6 和 CIDR 格式。</p>
     * @param IPs <p>IP 列表。</p><p>参数格式：支持 IPv4、IPv6 和 CIDR 格式。</p>
     */
    public void setIPs(String [] IPs) {
        this.IPs = IPs;
    }

    public IPACLRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IPACLRule(IPACLRule source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.IPs != null) {
            this.IPs = new String[source.IPs.length];
            for (int i = 0; i < source.IPs.length; i++) {
                this.IPs[i] = new String(source.IPs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamArraySimple(map, prefix + "IPs.", this.IPs);

    }
}

