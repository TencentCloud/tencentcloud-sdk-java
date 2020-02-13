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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Inbound extends AbstractModel{

    /**
    * 策略，ACCEPT或者DROP。
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 地址组id代表的地址集合。
    */
    @SerializedName("AddressModule")
    @Expose
    private String AddressModule;

    /**
    * 来源Ip或Ip段，例如192.168.0.0/16。
    */
    @SerializedName("CidrIp")
    @Expose
    private String CidrIp;

    /**
    * 描述。
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 网络协议，支持udp、tcp等。
    */
    @SerializedName("IpProtocol")
    @Expose
    private String IpProtocol;

    /**
    * 端口。
    */
    @SerializedName("PortRange")
    @Expose
    private String PortRange;

    /**
    * 服务组id代表的协议和端口集合。
    */
    @SerializedName("ServiceModule")
    @Expose
    private String ServiceModule;

    /**
    * 安全组id代表的地址集合。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
     * Get 策略，ACCEPT或者DROP。 
     * @return Action 策略，ACCEPT或者DROP。
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 策略，ACCEPT或者DROP。
     * @param Action 策略，ACCEPT或者DROP。
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 地址组id代表的地址集合。 
     * @return AddressModule 地址组id代表的地址集合。
     */
    public String getAddressModule() {
        return this.AddressModule;
    }

    /**
     * Set 地址组id代表的地址集合。
     * @param AddressModule 地址组id代表的地址集合。
     */
    public void setAddressModule(String AddressModule) {
        this.AddressModule = AddressModule;
    }

    /**
     * Get 来源Ip或Ip段，例如192.168.0.0/16。 
     * @return CidrIp 来源Ip或Ip段，例如192.168.0.0/16。
     */
    public String getCidrIp() {
        return this.CidrIp;
    }

    /**
     * Set 来源Ip或Ip段，例如192.168.0.0/16。
     * @param CidrIp 来源Ip或Ip段，例如192.168.0.0/16。
     */
    public void setCidrIp(String CidrIp) {
        this.CidrIp = CidrIp;
    }

    /**
     * Get 描述。 
     * @return Desc 描述。
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 描述。
     * @param Desc 描述。
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 网络协议，支持udp、tcp等。 
     * @return IpProtocol 网络协议，支持udp、tcp等。
     */
    public String getIpProtocol() {
        return this.IpProtocol;
    }

    /**
     * Set 网络协议，支持udp、tcp等。
     * @param IpProtocol 网络协议，支持udp、tcp等。
     */
    public void setIpProtocol(String IpProtocol) {
        this.IpProtocol = IpProtocol;
    }

    /**
     * Get 端口。 
     * @return PortRange 端口。
     */
    public String getPortRange() {
        return this.PortRange;
    }

    /**
     * Set 端口。
     * @param PortRange 端口。
     */
    public void setPortRange(String PortRange) {
        this.PortRange = PortRange;
    }

    /**
     * Get 服务组id代表的协议和端口集合。 
     * @return ServiceModule 服务组id代表的协议和端口集合。
     */
    public String getServiceModule() {
        return this.ServiceModule;
    }

    /**
     * Set 服务组id代表的协议和端口集合。
     * @param ServiceModule 服务组id代表的协议和端口集合。
     */
    public void setServiceModule(String ServiceModule) {
        this.ServiceModule = ServiceModule;
    }

    /**
     * Get 安全组id代表的地址集合。 
     * @return Id 安全组id代表的地址集合。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 安全组id代表的地址集合。
     * @param Id 安全组id代表的地址集合。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "AddressModule", this.AddressModule);
        this.setParamSimple(map, prefix + "CidrIp", this.CidrIp);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "IpProtocol", this.IpProtocol);
        this.setParamSimple(map, prefix + "PortRange", this.PortRange);
        this.setParamSimple(map, prefix + "ServiceModule", this.ServiceModule);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

