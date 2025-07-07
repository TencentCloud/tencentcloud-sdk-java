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

public class StandardDebug extends AbstractModel {

    /**
    * Debug 功能开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 允许的客户端来源。支持填写 IPv4 以及 IPv6 的 IP/IP 段。0.0.0.0/0 表示允许所有 IPv4 客户端进行调试，::/0 表示允许所有 IPv6 客户端进行调试。
    */
    @SerializedName("AllowClientIPList")
    @Expose
    private String [] AllowClientIPList;

    /**
    * Debug 功能到期时间。超出设置的时间，则功能失效。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
     * Get Debug 功能开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li> 
     * @return Switch Debug 功能开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Debug 功能开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
     * @param Switch Debug 功能开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 允许的客户端来源。支持填写 IPv4 以及 IPv6 的 IP/IP 段。0.0.0.0/0 表示允许所有 IPv4 客户端进行调试，::/0 表示允许所有 IPv6 客户端进行调试。 
     * @return AllowClientIPList 允许的客户端来源。支持填写 IPv4 以及 IPv6 的 IP/IP 段。0.0.0.0/0 表示允许所有 IPv4 客户端进行调试，::/0 表示允许所有 IPv6 客户端进行调试。
     */
    public String [] getAllowClientIPList() {
        return this.AllowClientIPList;
    }

    /**
     * Set 允许的客户端来源。支持填写 IPv4 以及 IPv6 的 IP/IP 段。0.0.0.0/0 表示允许所有 IPv4 客户端进行调试，::/0 表示允许所有 IPv6 客户端进行调试。
     * @param AllowClientIPList 允许的客户端来源。支持填写 IPv4 以及 IPv6 的 IP/IP 段。0.0.0.0/0 表示允许所有 IPv4 客户端进行调试，::/0 表示允许所有 IPv6 客户端进行调试。
     */
    public void setAllowClientIPList(String [] AllowClientIPList) {
        this.AllowClientIPList = AllowClientIPList;
    }

    /**
     * Get Debug 功能到期时间。超出设置的时间，则功能失效。 
     * @return ExpireTime Debug 功能到期时间。超出设置的时间，则功能失效。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Debug 功能到期时间。超出设置的时间，则功能失效。
     * @param ExpireTime Debug 功能到期时间。超出设置的时间，则功能失效。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    public StandardDebug() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StandardDebug(StandardDebug source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.AllowClientIPList != null) {
            this.AllowClientIPList = new String[source.AllowClientIPList.length];
            for (int i = 0; i < source.AllowClientIPList.length; i++) {
                this.AllowClientIPList[i] = new String(source.AllowClientIPList[i]);
            }
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArraySimple(map, prefix + "AllowClientIPList.", this.AllowClientIPList);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);

    }
}

