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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Ip6RuleInfo extends AbstractModel {

    /**
    * IPV6端口号，可在0~65535范围取值
    */
    @SerializedName("Vport6")
    @Expose
    private Long Vport6;

    /**
    * 协议类型，支持TCP/UDP
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * IPV4地址
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * IPV4端口号，可在0~65535范围取值
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
     * Get IPV6端口号，可在0~65535范围取值 
     * @return Vport6 IPV6端口号，可在0~65535范围取值
     */
    public Long getVport6() {
        return this.Vport6;
    }

    /**
     * Set IPV6端口号，可在0~65535范围取值
     * @param Vport6 IPV6端口号，可在0~65535范围取值
     */
    public void setVport6(Long Vport6) {
        this.Vport6 = Vport6;
    }

    /**
     * Get 协议类型，支持TCP/UDP 
     * @return Protocol 协议类型，支持TCP/UDP
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议类型，支持TCP/UDP
     * @param Protocol 协议类型，支持TCP/UDP
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get IPV4地址 
     * @return Vip IPV4地址
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set IPV4地址
     * @param Vip IPV4地址
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get IPV4端口号，可在0~65535范围取值 
     * @return Vport IPV4端口号，可在0~65535范围取值
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set IPV4端口号，可在0~65535范围取值
     * @param Vport IPV4端口号，可在0~65535范围取值
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    public Ip6RuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Ip6RuleInfo(Ip6RuleInfo source) {
        if (source.Vport6 != null) {
            this.Vport6 = new Long(source.Vport6);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Vport6", this.Vport6);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);

    }
}

