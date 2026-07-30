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
package com.tencentcloudapi.dbdc.v20201029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PolicyRule extends AbstractModel {

    /**
    * <p>规则动作，</p><p>枚举值：</p><ul><li>ACCEPT： 允许</li><li>DROP： 拒绝</li></ul>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * <p>来源/目标 IP 或 CIDR，如 0.0.0.0/0</p>
    */
    @SerializedName("CidrIp")
    @Expose
    private String CidrIp;

    /**
    * <p>端口范围，如 80、8080-8090、ALL</p>
    */
    @SerializedName("PortRange")
    @Expose
    private String PortRange;

    /**
    * <p>协议类型，如 tcp、udp、icmp、ALL</p>
    */
    @SerializedName("IpProtocol")
    @Expose
    private String IpProtocol;

    /**
    * <p>协议端口模板 ID</p>
    */
    @SerializedName("ServiceModule")
    @Expose
    private String ServiceModule;

    /**
    * <p>IP 地址模板 ID</p>
    */
    @SerializedName("AddressModule")
    @Expose
    private String AddressModule;

    /**
    * <p>安全组 ID</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>规则备注描述</p>
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
     * Get <p>规则动作，</p><p>枚举值：</p><ul><li>ACCEPT： 允许</li><li>DROP： 拒绝</li></ul> 
     * @return Action <p>规则动作，</p><p>枚举值：</p><ul><li>ACCEPT： 允许</li><li>DROP： 拒绝</li></ul>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set <p>规则动作，</p><p>枚举值：</p><ul><li>ACCEPT： 允许</li><li>DROP： 拒绝</li></ul>
     * @param Action <p>规则动作，</p><p>枚举值：</p><ul><li>ACCEPT： 允许</li><li>DROP： 拒绝</li></ul>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get <p>来源/目标 IP 或 CIDR，如 0.0.0.0/0</p> 
     * @return CidrIp <p>来源/目标 IP 或 CIDR，如 0.0.0.0/0</p>
     */
    public String getCidrIp() {
        return this.CidrIp;
    }

    /**
     * Set <p>来源/目标 IP 或 CIDR，如 0.0.0.0/0</p>
     * @param CidrIp <p>来源/目标 IP 或 CIDR，如 0.0.0.0/0</p>
     */
    public void setCidrIp(String CidrIp) {
        this.CidrIp = CidrIp;
    }

    /**
     * Get <p>端口范围，如 80、8080-8090、ALL</p> 
     * @return PortRange <p>端口范围，如 80、8080-8090、ALL</p>
     */
    public String getPortRange() {
        return this.PortRange;
    }

    /**
     * Set <p>端口范围，如 80、8080-8090、ALL</p>
     * @param PortRange <p>端口范围，如 80、8080-8090、ALL</p>
     */
    public void setPortRange(String PortRange) {
        this.PortRange = PortRange;
    }

    /**
     * Get <p>协议类型，如 tcp、udp、icmp、ALL</p> 
     * @return IpProtocol <p>协议类型，如 tcp、udp、icmp、ALL</p>
     */
    public String getIpProtocol() {
        return this.IpProtocol;
    }

    /**
     * Set <p>协议类型，如 tcp、udp、icmp、ALL</p>
     * @param IpProtocol <p>协议类型，如 tcp、udp、icmp、ALL</p>
     */
    public void setIpProtocol(String IpProtocol) {
        this.IpProtocol = IpProtocol;
    }

    /**
     * Get <p>协议端口模板 ID</p> 
     * @return ServiceModule <p>协议端口模板 ID</p>
     */
    public String getServiceModule() {
        return this.ServiceModule;
    }

    /**
     * Set <p>协议端口模板 ID</p>
     * @param ServiceModule <p>协议端口模板 ID</p>
     */
    public void setServiceModule(String ServiceModule) {
        this.ServiceModule = ServiceModule;
    }

    /**
     * Get <p>IP 地址模板 ID</p> 
     * @return AddressModule <p>IP 地址模板 ID</p>
     */
    public String getAddressModule() {
        return this.AddressModule;
    }

    /**
     * Set <p>IP 地址模板 ID</p>
     * @param AddressModule <p>IP 地址模板 ID</p>
     */
    public void setAddressModule(String AddressModule) {
        this.AddressModule = AddressModule;
    }

    /**
     * Get <p>安全组 ID</p> 
     * @return Id <p>安全组 ID</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>安全组 ID</p>
     * @param Id <p>安全组 ID</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>规则备注描述</p> 
     * @return Desc <p>规则备注描述</p>
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set <p>规则备注描述</p>
     * @param Desc <p>规则备注描述</p>
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

