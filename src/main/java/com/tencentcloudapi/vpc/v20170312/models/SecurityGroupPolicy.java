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

public class SecurityGroupPolicy  extends AbstractModel{

    /**
    * 安全组规则索引号。
    */
    @SerializedName("PolicyIndex")
    @Expose
    private Integer PolicyIndex;

    /**
    * 协议, 取值: TCP,UDP, ICMP。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 端口(all, 离散port,  range)。
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * 协议端口ID或者协议端口组ID。ServiceTemplate和Protocol+Port互斥。
    */
    @SerializedName("ServiceTemplate")
    @Expose
    private ServiceTemplateSpecification ServiceTemplate;

    /**
    * 网段或IP(互斥)。
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * 网段或IPv6(互斥)。
    */
    @SerializedName("Ipv6CidrBlock")
    @Expose
    private String Ipv6CidrBlock;

    /**
    * 安全组实例ID，例如：sg-ohuuioma。
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * IP地址ID或者ID地址组ID。
    */
    @SerializedName("AddressTemplate")
    @Expose
    private AddressTemplateSpecification AddressTemplate;

    /**
    * ACCEPT 或 DROP。
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 安全组规则描述。
    */
    @SerializedName("PolicyDescription")
    @Expose
    private String PolicyDescription;

    /**
    * 安全组最近修改时间。
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * 获取安全组规则索引号。
     * @return PolicyIndex 安全组规则索引号。
     */
    public Integer getPolicyIndex() {
        return this.PolicyIndex;
    }

    /**
     * 设置安全组规则索引号。
     * @param PolicyIndex 安全组规则索引号。
     */
    public void setPolicyIndex(Integer PolicyIndex) {
        this.PolicyIndex = PolicyIndex;
    }

    /**
     * 获取协议, 取值: TCP,UDP, ICMP。
     * @return Protocol 协议, 取值: TCP,UDP, ICMP。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * 设置协议, 取值: TCP,UDP, ICMP。
     * @param Protocol 协议, 取值: TCP,UDP, ICMP。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * 获取端口(all, 离散port,  range)。
     * @return Port 端口(all, 离散port,  range)。
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * 设置端口(all, 离散port,  range)。
     * @param Port 端口(all, 离散port,  range)。
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * 获取协议端口ID或者协议端口组ID。ServiceTemplate和Protocol+Port互斥。
     * @return ServiceTemplate 协议端口ID或者协议端口组ID。ServiceTemplate和Protocol+Port互斥。
     */
    public ServiceTemplateSpecification getServiceTemplate() {
        return this.ServiceTemplate;
    }

    /**
     * 设置协议端口ID或者协议端口组ID。ServiceTemplate和Protocol+Port互斥。
     * @param ServiceTemplate 协议端口ID或者协议端口组ID。ServiceTemplate和Protocol+Port互斥。
     */
    public void setServiceTemplate(ServiceTemplateSpecification ServiceTemplate) {
        this.ServiceTemplate = ServiceTemplate;
    }

    /**
     * 获取网段或IP(互斥)。
     * @return CidrBlock 网段或IP(互斥)。
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * 设置网段或IP(互斥)。
     * @param CidrBlock 网段或IP(互斥)。
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * 获取网段或IPv6(互斥)。
     * @return Ipv6CidrBlock 网段或IPv6(互斥)。
     */
    public String getIpv6CidrBlock() {
        return this.Ipv6CidrBlock;
    }

    /**
     * 设置网段或IPv6(互斥)。
     * @param Ipv6CidrBlock 网段或IPv6(互斥)。
     */
    public void setIpv6CidrBlock(String Ipv6CidrBlock) {
        this.Ipv6CidrBlock = Ipv6CidrBlock;
    }

    /**
     * 获取安全组实例ID，例如：sg-ohuuioma。
     * @return SecurityGroupId 安全组实例ID，例如：sg-ohuuioma。
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * 设置安全组实例ID，例如：sg-ohuuioma。
     * @param SecurityGroupId 安全组实例ID，例如：sg-ohuuioma。
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * 获取IP地址ID或者ID地址组ID。
     * @return AddressTemplate IP地址ID或者ID地址组ID。
     */
    public AddressTemplateSpecification getAddressTemplate() {
        return this.AddressTemplate;
    }

    /**
     * 设置IP地址ID或者ID地址组ID。
     * @param AddressTemplate IP地址ID或者ID地址组ID。
     */
    public void setAddressTemplate(AddressTemplateSpecification AddressTemplate) {
        this.AddressTemplate = AddressTemplate;
    }

    /**
     * 获取ACCEPT 或 DROP。
     * @return Action ACCEPT 或 DROP。
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * 设置ACCEPT 或 DROP。
     * @param Action ACCEPT 或 DROP。
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * 获取安全组规则描述。
     * @return PolicyDescription 安全组规则描述。
     */
    public String getPolicyDescription() {
        return this.PolicyDescription;
    }

    /**
     * 设置安全组规则描述。
     * @param PolicyDescription 安全组规则描述。
     */
    public void setPolicyDescription(String PolicyDescription) {
        this.PolicyDescription = PolicyDescription;
    }

    /**
     * 获取安全组最近修改时间。
     * @return ModifyTime 安全组最近修改时间。
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * 设置安全组最近修改时间。
     * @param ModifyTime 安全组最近修改时间。
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyIndex", this.PolicyIndex);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamObj(map, prefix + "ServiceTemplate.", this.ServiceTemplate);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "Ipv6CidrBlock", this.Ipv6CidrBlock);
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamObj(map, prefix + "AddressTemplate.", this.AddressTemplate);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "PolicyDescription", this.PolicyDescription);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

