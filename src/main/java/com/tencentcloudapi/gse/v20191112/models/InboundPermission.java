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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InboundPermission extends AbstractModel {

    /**
    * 起始端口号，最小值1025
    */
    @SerializedName("FromPort")
    @Expose
    private Long FromPort;

    /**
    * IP 段范围，合法的 CIDR 地址类型，如所有IPv4来源：0.0.0.0/0
    */
    @SerializedName("IpRange")
    @Expose
    private String IpRange;

    /**
    * 协议类型：TCP或者UDP
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 终止端口号，最大值60000
    */
    @SerializedName("ToPort")
    @Expose
    private Long ToPort;

    /**
     * Get 起始端口号，最小值1025 
     * @return FromPort 起始端口号，最小值1025
     */
    public Long getFromPort() {
        return this.FromPort;
    }

    /**
     * Set 起始端口号，最小值1025
     * @param FromPort 起始端口号，最小值1025
     */
    public void setFromPort(Long FromPort) {
        this.FromPort = FromPort;
    }

    /**
     * Get IP 段范围，合法的 CIDR 地址类型，如所有IPv4来源：0.0.0.0/0 
     * @return IpRange IP 段范围，合法的 CIDR 地址类型，如所有IPv4来源：0.0.0.0/0
     */
    public String getIpRange() {
        return this.IpRange;
    }

    /**
     * Set IP 段范围，合法的 CIDR 地址类型，如所有IPv4来源：0.0.0.0/0
     * @param IpRange IP 段范围，合法的 CIDR 地址类型，如所有IPv4来源：0.0.0.0/0
     */
    public void setIpRange(String IpRange) {
        this.IpRange = IpRange;
    }

    /**
     * Get 协议类型：TCP或者UDP 
     * @return Protocol 协议类型：TCP或者UDP
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议类型：TCP或者UDP
     * @param Protocol 协议类型：TCP或者UDP
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 终止端口号，最大值60000 
     * @return ToPort 终止端口号，最大值60000
     */
    public Long getToPort() {
        return this.ToPort;
    }

    /**
     * Set 终止端口号，最大值60000
     * @param ToPort 终止端口号，最大值60000
     */
    public void setToPort(Long ToPort) {
        this.ToPort = ToPort;
    }

    public InboundPermission() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InboundPermission(InboundPermission source) {
        if (source.FromPort != null) {
            this.FromPort = new Long(source.FromPort);
        }
        if (source.IpRange != null) {
            this.IpRange = new String(source.IpRange);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.ToPort != null) {
            this.ToPort = new Long(source.ToPort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FromPort", this.FromPort);
        this.setParamSimple(map, prefix + "IpRange", this.IpRange);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "ToPort", this.ToPort);

    }
}

