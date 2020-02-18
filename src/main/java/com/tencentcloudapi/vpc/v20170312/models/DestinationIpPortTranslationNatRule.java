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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DestinationIpPortTranslationNatRule extends AbstractModel{

    /**
    * 网络协议，可选值：`TCP`、`UDP`。
    */
    @SerializedName("IpProtocol")
    @Expose
    private String IpProtocol;

    /**
    * 弹性IP。
    */
    @SerializedName("PublicIpAddress")
    @Expose
    private String PublicIpAddress;

    /**
    * 公网端口。
    */
    @SerializedName("PublicPort")
    @Expose
    private Long PublicPort;

    /**
    * 内网地址。
    */
    @SerializedName("PrivateIpAddress")
    @Expose
    private String PrivateIpAddress;

    /**
    * 内网端口。
    */
    @SerializedName("PrivatePort")
    @Expose
    private Long PrivatePort;

    /**
    * NAT网关转发规则描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 网络协议，可选值：`TCP`、`UDP`。 
     * @return IpProtocol 网络协议，可选值：`TCP`、`UDP`。
     */
    public String getIpProtocol() {
        return this.IpProtocol;
    }

    /**
     * Set 网络协议，可选值：`TCP`、`UDP`。
     * @param IpProtocol 网络协议，可选值：`TCP`、`UDP`。
     */
    public void setIpProtocol(String IpProtocol) {
        this.IpProtocol = IpProtocol;
    }

    /**
     * Get 弹性IP。 
     * @return PublicIpAddress 弹性IP。
     */
    public String getPublicIpAddress() {
        return this.PublicIpAddress;
    }

    /**
     * Set 弹性IP。
     * @param PublicIpAddress 弹性IP。
     */
    public void setPublicIpAddress(String PublicIpAddress) {
        this.PublicIpAddress = PublicIpAddress;
    }

    /**
     * Get 公网端口。 
     * @return PublicPort 公网端口。
     */
    public Long getPublicPort() {
        return this.PublicPort;
    }

    /**
     * Set 公网端口。
     * @param PublicPort 公网端口。
     */
    public void setPublicPort(Long PublicPort) {
        this.PublicPort = PublicPort;
    }

    /**
     * Get 内网地址。 
     * @return PrivateIpAddress 内网地址。
     */
    public String getPrivateIpAddress() {
        return this.PrivateIpAddress;
    }

    /**
     * Set 内网地址。
     * @param PrivateIpAddress 内网地址。
     */
    public void setPrivateIpAddress(String PrivateIpAddress) {
        this.PrivateIpAddress = PrivateIpAddress;
    }

    /**
     * Get 内网端口。 
     * @return PrivatePort 内网端口。
     */
    public Long getPrivatePort() {
        return this.PrivatePort;
    }

    /**
     * Set 内网端口。
     * @param PrivatePort 内网端口。
     */
    public void setPrivatePort(Long PrivatePort) {
        this.PrivatePort = PrivatePort;
    }

    /**
     * Get NAT网关转发规则描述。 
     * @return Description NAT网关转发规则描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set NAT网关转发规则描述。
     * @param Description NAT网关转发规则描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IpProtocol", this.IpProtocol);
        this.setParamSimple(map, prefix + "PublicIpAddress", this.PublicIpAddress);
        this.setParamSimple(map, prefix + "PublicPort", this.PublicPort);
        this.setParamSimple(map, prefix + "PrivateIpAddress", this.PrivateIpAddress);
        this.setParamSimple(map, prefix + "PrivatePort", this.PrivatePort);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

