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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityGroupBound extends AbstractModel {

    /**
    * 执行策略。
- ACCEPT：允许，放行该端口相应的访问请求。
- DROP：拒绝，直接丢弃数据包，不返回任何回应信息。
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 访问数据库的入站 IP 或 IP 段。
    */
    @SerializedName("CidrIp")
    @Expose
    private String CidrIp;

    /**
    * 访问数据库的端口。
    */
    @SerializedName("PortRange")
    @Expose
    private String PortRange;

    /**
    * 传输层协议：tcp。
    */
    @SerializedName("IpProtocol")
    @Expose
    private String IpProtocol;

    /**
    * 安全组 ID。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * IP 地址或 IP 地址组参数模板 ID。请登录[参数模板控制台](https://console.cloud.tencent.com/vpc/template/ip)获取参数模板 IP 地址详情。
    */
    @SerializedName("AddressModule")
    @Expose
    private String AddressModule;

    /**
    * 协议端口或协议端口组参数模板 ID。请登录[参数模板控制台](https://console.cloud.tencent.com/vpc/template/protoport)获取参数模板协议端口详情。
    */
    @SerializedName("ServiceModule")
    @Expose
    private String ServiceModule;

    /**
    * 安全组描述信息。
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
     * Get 执行策略。
- ACCEPT：允许，放行该端口相应的访问请求。
- DROP：拒绝，直接丢弃数据包，不返回任何回应信息。 
     * @return Action 执行策略。
- ACCEPT：允许，放行该端口相应的访问请求。
- DROP：拒绝，直接丢弃数据包，不返回任何回应信息。
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 执行策略。
- ACCEPT：允许，放行该端口相应的访问请求。
- DROP：拒绝，直接丢弃数据包，不返回任何回应信息。
     * @param Action 执行策略。
- ACCEPT：允许，放行该端口相应的访问请求。
- DROP：拒绝，直接丢弃数据包，不返回任何回应信息。
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 访问数据库的入站 IP 或 IP 段。 
     * @return CidrIp 访问数据库的入站 IP 或 IP 段。
     */
    public String getCidrIp() {
        return this.CidrIp;
    }

    /**
     * Set 访问数据库的入站 IP 或 IP 段。
     * @param CidrIp 访问数据库的入站 IP 或 IP 段。
     */
    public void setCidrIp(String CidrIp) {
        this.CidrIp = CidrIp;
    }

    /**
     * Get 访问数据库的端口。 
     * @return PortRange 访问数据库的端口。
     */
    public String getPortRange() {
        return this.PortRange;
    }

    /**
     * Set 访问数据库的端口。
     * @param PortRange 访问数据库的端口。
     */
    public void setPortRange(String PortRange) {
        this.PortRange = PortRange;
    }

    /**
     * Get 传输层协议：tcp。 
     * @return IpProtocol 传输层协议：tcp。
     */
    public String getIpProtocol() {
        return this.IpProtocol;
    }

    /**
     * Set 传输层协议：tcp。
     * @param IpProtocol 传输层协议：tcp。
     */
    public void setIpProtocol(String IpProtocol) {
        this.IpProtocol = IpProtocol;
    }

    /**
     * Get 安全组 ID。 
     * @return Id 安全组 ID。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 安全组 ID。
     * @param Id 安全组 ID。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get IP 地址或 IP 地址组参数模板 ID。请登录[参数模板控制台](https://console.cloud.tencent.com/vpc/template/ip)获取参数模板 IP 地址详情。 
     * @return AddressModule IP 地址或 IP 地址组参数模板 ID。请登录[参数模板控制台](https://console.cloud.tencent.com/vpc/template/ip)获取参数模板 IP 地址详情。
     */
    public String getAddressModule() {
        return this.AddressModule;
    }

    /**
     * Set IP 地址或 IP 地址组参数模板 ID。请登录[参数模板控制台](https://console.cloud.tencent.com/vpc/template/ip)获取参数模板 IP 地址详情。
     * @param AddressModule IP 地址或 IP 地址组参数模板 ID。请登录[参数模板控制台](https://console.cloud.tencent.com/vpc/template/ip)获取参数模板 IP 地址详情。
     */
    public void setAddressModule(String AddressModule) {
        this.AddressModule = AddressModule;
    }

    /**
     * Get 协议端口或协议端口组参数模板 ID。请登录[参数模板控制台](https://console.cloud.tencent.com/vpc/template/protoport)获取参数模板协议端口详情。 
     * @return ServiceModule 协议端口或协议端口组参数模板 ID。请登录[参数模板控制台](https://console.cloud.tencent.com/vpc/template/protoport)获取参数模板协议端口详情。
     */
    public String getServiceModule() {
        return this.ServiceModule;
    }

    /**
     * Set 协议端口或协议端口组参数模板 ID。请登录[参数模板控制台](https://console.cloud.tencent.com/vpc/template/protoport)获取参数模板协议端口详情。
     * @param ServiceModule 协议端口或协议端口组参数模板 ID。请登录[参数模板控制台](https://console.cloud.tencent.com/vpc/template/protoport)获取参数模板协议端口详情。
     */
    public void setServiceModule(String ServiceModule) {
        this.ServiceModule = ServiceModule;
    }

    /**
     * Get 安全组描述信息。 
     * @return Desc 安全组描述信息。
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 安全组描述信息。
     * @param Desc 安全组描述信息。
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public SecurityGroupBound() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityGroupBound(SecurityGroupBound source) {
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
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.AddressModule != null) {
            this.AddressModule = new String(source.AddressModule);
        }
        if (source.ServiceModule != null) {
            this.ServiceModule = new String(source.ServiceModule);
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
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "AddressModule", this.AddressModule);
        this.setParamSimple(map, prefix + "ServiceModule", this.ServiceModule);
        this.setParamSimple(map, prefix + "Desc", this.Desc);

    }
}

