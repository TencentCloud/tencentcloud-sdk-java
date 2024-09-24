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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class L4ProxyRemoteAuth extends AbstractModel {

    /**
    * 四层远程鉴权开关，取值有：
<li>on：表示开启;</li>
<li>off：表示关闭。</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 远程鉴权服务地址，格式为: domain/ip:port。例：example.auth.com:8888

    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 远程鉴权服务不可访问后，经过四层转发规则默认回源行为，取值有：
<li>reject：表示进行拦截，拒绝访问;</li>
<li>allow：表示允许通过。</li>
    */
    @SerializedName("ServerFaultyBehavior")
    @Expose
    private String ServerFaultyBehavior;

    /**
     * Get 四层远程鉴权开关，取值有：
<li>on：表示开启;</li>
<li>off：表示关闭。</li> 
     * @return Switch 四层远程鉴权开关，取值有：
<li>on：表示开启;</li>
<li>off：表示关闭。</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 四层远程鉴权开关，取值有：
<li>on：表示开启;</li>
<li>off：表示关闭。</li>
     * @param Switch 四层远程鉴权开关，取值有：
<li>on：表示开启;</li>
<li>off：表示关闭。</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 远程鉴权服务地址，格式为: domain/ip:port。例：example.auth.com:8888
 
     * @return Address 远程鉴权服务地址，格式为: domain/ip:port。例：example.auth.com:8888

     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 远程鉴权服务地址，格式为: domain/ip:port。例：example.auth.com:8888

     * @param Address 远程鉴权服务地址，格式为: domain/ip:port。例：example.auth.com:8888

     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 远程鉴权服务不可访问后，经过四层转发规则默认回源行为，取值有：
<li>reject：表示进行拦截，拒绝访问;</li>
<li>allow：表示允许通过。</li> 
     * @return ServerFaultyBehavior 远程鉴权服务不可访问后，经过四层转发规则默认回源行为，取值有：
<li>reject：表示进行拦截，拒绝访问;</li>
<li>allow：表示允许通过。</li>
     */
    public String getServerFaultyBehavior() {
        return this.ServerFaultyBehavior;
    }

    /**
     * Set 远程鉴权服务不可访问后，经过四层转发规则默认回源行为，取值有：
<li>reject：表示进行拦截，拒绝访问;</li>
<li>allow：表示允许通过。</li>
     * @param ServerFaultyBehavior 远程鉴权服务不可访问后，经过四层转发规则默认回源行为，取值有：
<li>reject：表示进行拦截，拒绝访问;</li>
<li>allow：表示允许通过。</li>
     */
    public void setServerFaultyBehavior(String ServerFaultyBehavior) {
        this.ServerFaultyBehavior = ServerFaultyBehavior;
    }

    public L4ProxyRemoteAuth() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public L4ProxyRemoteAuth(L4ProxyRemoteAuth source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.ServerFaultyBehavior != null) {
            this.ServerFaultyBehavior = new String(source.ServerFaultyBehavior);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "ServerFaultyBehavior", this.ServerFaultyBehavior);

    }
}

