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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PolicyRule extends AbstractModel{

    /**
    * 策略，ACCEPT或者DROP
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 来源Ip或Ip段，例如192.168.0.0/16
    */
    @SerializedName("CidrIp")
    @Expose
    private String CidrIp;

    /**
    * 端口
    */
    @SerializedName("PortRange")
    @Expose
    private String PortRange;

    /**
    * 网络协议，支持udp、tcp等
    */
    @SerializedName("IpProtocol")
    @Expose
    private String IpProtocol;

    /**
    * 协议端口ID或者协议端口组ID。
    */
    @SerializedName("ServiceModule")
    @Expose
    private String ServiceModule;

    /**
    * IP地址ID或者ID地址组ID。
    */
    @SerializedName("AddressModule")
    @Expose
    private String AddressModule;

    /**
    * id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 描述
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
     * Get 策略，ACCEPT或者DROP 
     * @return Action 策略，ACCEPT或者DROP
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 策略，ACCEPT或者DROP
     * @param Action 策略，ACCEPT或者DROP
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 来源Ip或Ip段，例如192.168.0.0/16 
     * @return CidrIp 来源Ip或Ip段，例如192.168.0.0/16
     */
    public String getCidrIp() {
        return this.CidrIp;
    }

    /**
     * Set 来源Ip或Ip段，例如192.168.0.0/16
     * @param CidrIp 来源Ip或Ip段，例如192.168.0.0/16
     */
    public void setCidrIp(String CidrIp) {
        this.CidrIp = CidrIp;
    }

    /**
     * Get 端口 
     * @return PortRange 端口
     */
    public String getPortRange() {
        return this.PortRange;
    }

    /**
     * Set 端口
     * @param PortRange 端口
     */
    public void setPortRange(String PortRange) {
        this.PortRange = PortRange;
    }

    /**
     * Get 网络协议，支持udp、tcp等 
     * @return IpProtocol 网络协议，支持udp、tcp等
     */
    public String getIpProtocol() {
        return this.IpProtocol;
    }

    /**
     * Set 网络协议，支持udp、tcp等
     * @param IpProtocol 网络协议，支持udp、tcp等
     */
    public void setIpProtocol(String IpProtocol) {
        this.IpProtocol = IpProtocol;
    }

    /**
     * Get 协议端口ID或者协议端口组ID。 
     * @return ServiceModule 协议端口ID或者协议端口组ID。
     */
    public String getServiceModule() {
        return this.ServiceModule;
    }

    /**
     * Set 协议端口ID或者协议端口组ID。
     * @param ServiceModule 协议端口ID或者协议端口组ID。
     */
    public void setServiceModule(String ServiceModule) {
        this.ServiceModule = ServiceModule;
    }

    /**
     * Get IP地址ID或者ID地址组ID。 
     * @return AddressModule IP地址ID或者ID地址组ID。
     */
    public String getAddressModule() {
        return this.AddressModule;
    }

    /**
     * Set IP地址ID或者ID地址组ID。
     * @param AddressModule IP地址ID或者ID地址组ID。
     */
    public void setAddressModule(String AddressModule) {
        this.AddressModule = AddressModule;
    }

    /**
     * Get id 
     * @return Id id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set id
     * @param Id id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 描述 
     * @return Desc 描述
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 描述
     * @param Desc 描述
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public PolicyRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PolicyRule(PolicyRule source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.CidrIp != null) {
            this.CidrIp = new String(source.CidrIp);
        }
        if (source.PortRange != null) {
            this.PortRange = new String(source.PortRange);
        }
        if (source.IpProtocol != null) {
            this.IpProtocol = new String(source.IpProtocol);
        }
        if (source.ServiceModule != null) {
            this.ServiceModule = new String(source.ServiceModule);
        }
        if (source.AddressModule != null) {
            this.AddressModule = new String(source.AddressModule);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "CidrIp", this.CidrIp);
        this.setParamSimple(map, prefix + "PortRange", this.PortRange);
        this.setParamSimple(map, prefix + "IpProtocol", this.IpProtocol);
        this.setParamSimple(map, prefix + "ServiceModule", this.ServiceModule);
        this.setParamSimple(map, prefix + "AddressModule", this.AddressModule);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Desc", this.Desc);

    }
}

