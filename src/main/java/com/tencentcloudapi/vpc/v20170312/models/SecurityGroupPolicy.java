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

public class SecurityGroupPolicy extends AbstractModel {

    /**
    * <p>安全组规则索引号，值会随着安全组规则的变更动态变化。使用PolicyIndex时，请先调用<code>DescribeSecurityGroupPolicies</code>获取到规则的PolicyIndex，并且结合返回值中的Version一起使用处理规则。</p>
    */
    @SerializedName("PolicyIndex")
    @Expose
    private Long PolicyIndex;

    /**
    * <p>协议, 取值: TCP,UDP,ICMP,ICMPv6,ALL。</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>端口(all, 离散port,  range)。<br>说明：如果Protocol设置为ALL，则Port也需要设置为all。</p>
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * <p>协议端口ID或者协议端口组ID。ServiceTemplate和Protocol+Port互斥。</p>
    */
    @SerializedName("ServiceTemplate")
    @Expose
    private ServiceTemplateSpecification ServiceTemplate;

    /**
    * <p>网段或IP(互斥)，特殊说明：0.0.0.0/n 都会映射为0.0.0.0/0。作为入参时，可使用字符串<code>MY_PUBLIC_IP</code>指代发起请求的公网IP地址。</p>
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * <p>网段或IPv6(互斥)。作为入参时，可使用字符串<code>MY_PUBLIC_IP</code>指代发起请求的公网IPv6地址。</p>
    */
    @SerializedName("Ipv6CidrBlock")
    @Expose
    private String Ipv6CidrBlock;

    /**
    * <p>安全组实例ID，例如：sg-ohuuioma。</p>
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * <p>IP地址ID或者IP地址组ID。</p>
    */
    @SerializedName("AddressTemplate")
    @Expose
    private AddressTemplateSpecification AddressTemplate;

    /**
    * <p>ACCEPT 或 DROP。</p>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * <p>安全组规则描述。作为入参时，当未传递该参数或值为空，且参数CidrBlock或Ipv6CidrBlock值为MY_PUBLIC_IP时，该参数的值将会被自动填充为Replaced-From-MY_PUBLIC_IP。</p>
    */
    @SerializedName("PolicyDescription")
    @Expose
    private String PolicyDescription;

    /**
    * <p>安全组最近修改时间。</p>
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * <p>安全组规则优先级，值会随着安全组规则的变更动态变化。使用Priority时，请先调用<code>DescribeSecurityGroupPolicies</code>获取到规则的Priority，并且结合返回值中的Version一起使用处理规则。</p>
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
     * Get <p>安全组规则索引号，值会随着安全组规则的变更动态变化。使用PolicyIndex时，请先调用<code>DescribeSecurityGroupPolicies</code>获取到规则的PolicyIndex，并且结合返回值中的Version一起使用处理规则。</p> 
     * @return PolicyIndex <p>安全组规则索引号，值会随着安全组规则的变更动态变化。使用PolicyIndex时，请先调用<code>DescribeSecurityGroupPolicies</code>获取到规则的PolicyIndex，并且结合返回值中的Version一起使用处理规则。</p>
     */
    public Long getPolicyIndex() {
        return this.PolicyIndex;
    }

    /**
     * Set <p>安全组规则索引号，值会随着安全组规则的变更动态变化。使用PolicyIndex时，请先调用<code>DescribeSecurityGroupPolicies</code>获取到规则的PolicyIndex，并且结合返回值中的Version一起使用处理规则。</p>
     * @param PolicyIndex <p>安全组规则索引号，值会随着安全组规则的变更动态变化。使用PolicyIndex时，请先调用<code>DescribeSecurityGroupPolicies</code>获取到规则的PolicyIndex，并且结合返回值中的Version一起使用处理规则。</p>
     */
    public void setPolicyIndex(Long PolicyIndex) {
        this.PolicyIndex = PolicyIndex;
    }

    /**
     * Get <p>协议, 取值: TCP,UDP,ICMP,ICMPv6,ALL。</p> 
     * @return Protocol <p>协议, 取值: TCP,UDP,ICMP,ICMPv6,ALL。</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>协议, 取值: TCP,UDP,ICMP,ICMPv6,ALL。</p>
     * @param Protocol <p>协议, 取值: TCP,UDP,ICMP,ICMPv6,ALL。</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>端口(all, 离散port,  range)。<br>说明：如果Protocol设置为ALL，则Port也需要设置为all。</p> 
     * @return Port <p>端口(all, 离散port,  range)。<br>说明：如果Protocol设置为ALL，则Port也需要设置为all。</p>
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set <p>端口(all, 离散port,  range)。<br>说明：如果Protocol设置为ALL，则Port也需要设置为all。</p>
     * @param Port <p>端口(all, 离散port,  range)。<br>说明：如果Protocol设置为ALL，则Port也需要设置为all。</p>
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get <p>协议端口ID或者协议端口组ID。ServiceTemplate和Protocol+Port互斥。</p> 
     * @return ServiceTemplate <p>协议端口ID或者协议端口组ID。ServiceTemplate和Protocol+Port互斥。</p>
     */
    public ServiceTemplateSpecification getServiceTemplate() {
        return this.ServiceTemplate;
    }

    /**
     * Set <p>协议端口ID或者协议端口组ID。ServiceTemplate和Protocol+Port互斥。</p>
     * @param ServiceTemplate <p>协议端口ID或者协议端口组ID。ServiceTemplate和Protocol+Port互斥。</p>
     */
    public void setServiceTemplate(ServiceTemplateSpecification ServiceTemplate) {
        this.ServiceTemplate = ServiceTemplate;
    }

    /**
     * Get <p>网段或IP(互斥)，特殊说明：0.0.0.0/n 都会映射为0.0.0.0/0。作为入参时，可使用字符串<code>MY_PUBLIC_IP</code>指代发起请求的公网IP地址。</p> 
     * @return CidrBlock <p>网段或IP(互斥)，特殊说明：0.0.0.0/n 都会映射为0.0.0.0/0。作为入参时，可使用字符串<code>MY_PUBLIC_IP</code>指代发起请求的公网IP地址。</p>
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set <p>网段或IP(互斥)，特殊说明：0.0.0.0/n 都会映射为0.0.0.0/0。作为入参时，可使用字符串<code>MY_PUBLIC_IP</code>指代发起请求的公网IP地址。</p>
     * @param CidrBlock <p>网段或IP(互斥)，特殊说明：0.0.0.0/n 都会映射为0.0.0.0/0。作为入参时，可使用字符串<code>MY_PUBLIC_IP</code>指代发起请求的公网IP地址。</p>
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get <p>网段或IPv6(互斥)。作为入参时，可使用字符串<code>MY_PUBLIC_IP</code>指代发起请求的公网IPv6地址。</p> 
     * @return Ipv6CidrBlock <p>网段或IPv6(互斥)。作为入参时，可使用字符串<code>MY_PUBLIC_IP</code>指代发起请求的公网IPv6地址。</p>
     */
    public String getIpv6CidrBlock() {
        return this.Ipv6CidrBlock;
    }

    /**
     * Set <p>网段或IPv6(互斥)。作为入参时，可使用字符串<code>MY_PUBLIC_IP</code>指代发起请求的公网IPv6地址。</p>
     * @param Ipv6CidrBlock <p>网段或IPv6(互斥)。作为入参时，可使用字符串<code>MY_PUBLIC_IP</code>指代发起请求的公网IPv6地址。</p>
     */
    public void setIpv6CidrBlock(String Ipv6CidrBlock) {
        this.Ipv6CidrBlock = Ipv6CidrBlock;
    }

    /**
     * Get <p>安全组实例ID，例如：sg-ohuuioma。</p> 
     * @return SecurityGroupId <p>安全组实例ID，例如：sg-ohuuioma。</p>
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * Set <p>安全组实例ID，例如：sg-ohuuioma。</p>
     * @param SecurityGroupId <p>安全组实例ID，例如：sg-ohuuioma。</p>
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * Get <p>IP地址ID或者IP地址组ID。</p> 
     * @return AddressTemplate <p>IP地址ID或者IP地址组ID。</p>
     */
    public AddressTemplateSpecification getAddressTemplate() {
        return this.AddressTemplate;
    }

    /**
     * Set <p>IP地址ID或者IP地址组ID。</p>
     * @param AddressTemplate <p>IP地址ID或者IP地址组ID。</p>
     */
    public void setAddressTemplate(AddressTemplateSpecification AddressTemplate) {
        this.AddressTemplate = AddressTemplate;
    }

    /**
     * Get <p>ACCEPT 或 DROP。</p> 
     * @return Action <p>ACCEPT 或 DROP。</p>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set <p>ACCEPT 或 DROP。</p>
     * @param Action <p>ACCEPT 或 DROP。</p>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get <p>安全组规则描述。作为入参时，当未传递该参数或值为空，且参数CidrBlock或Ipv6CidrBlock值为MY_PUBLIC_IP时，该参数的值将会被自动填充为Replaced-From-MY_PUBLIC_IP。</p> 
     * @return PolicyDescription <p>安全组规则描述。作为入参时，当未传递该参数或值为空，且参数CidrBlock或Ipv6CidrBlock值为MY_PUBLIC_IP时，该参数的值将会被自动填充为Replaced-From-MY_PUBLIC_IP。</p>
     */
    public String getPolicyDescription() {
        return this.PolicyDescription;
    }

    /**
     * Set <p>安全组规则描述。作为入参时，当未传递该参数或值为空，且参数CidrBlock或Ipv6CidrBlock值为MY_PUBLIC_IP时，该参数的值将会被自动填充为Replaced-From-MY_PUBLIC_IP。</p>
     * @param PolicyDescription <p>安全组规则描述。作为入参时，当未传递该参数或值为空，且参数CidrBlock或Ipv6CidrBlock值为MY_PUBLIC_IP时，该参数的值将会被自动填充为Replaced-From-MY_PUBLIC_IP。</p>
     */
    public void setPolicyDescription(String PolicyDescription) {
        this.PolicyDescription = PolicyDescription;
    }

    /**
     * Get <p>安全组最近修改时间。</p> 
     * @return ModifyTime <p>安全组最近修改时间。</p>
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>安全组最近修改时间。</p>
     * @param ModifyTime <p>安全组最近修改时间。</p>
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get <p>安全组规则优先级，值会随着安全组规则的变更动态变化。使用Priority时，请先调用<code>DescribeSecurityGroupPolicies</code>获取到规则的Priority，并且结合返回值中的Version一起使用处理规则。</p> 
     * @return Priority <p>安全组规则优先级，值会随着安全组规则的变更动态变化。使用Priority时，请先调用<code>DescribeSecurityGroupPolicies</code>获取到规则的Priority，并且结合返回值中的Version一起使用处理规则。</p>
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set <p>安全组规则优先级，值会随着安全组规则的变更动态变化。使用Priority时，请先调用<code>DescribeSecurityGroupPolicies</code>获取到规则的Priority，并且结合返回值中的Version一起使用处理规则。</p>
     * @param Priority <p>安全组规则优先级，值会随着安全组规则的变更动态变化。使用Priority时，请先调用<code>DescribeSecurityGroupPolicies</code>获取到规则的Priority，并且结合返回值中的Version一起使用处理规则。</p>
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    public SecurityGroupPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityGroupPolicy(SecurityGroupPolicy source) {
        if (source.PolicyIndex != null) {
            this.PolicyIndex = new Long(source.PolicyIndex);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.ServiceTemplate != null) {
            this.ServiceTemplate = new ServiceTemplateSpecification(source.ServiceTemplate);
        }
        if (source.CidrBlock != null) {
            this.CidrBlock = new String(source.CidrBlock);
        }
        if (source.Ipv6CidrBlock != null) {
            this.Ipv6CidrBlock = new String(source.Ipv6CidrBlock);
        }
        if (source.SecurityGroupId != null) {
            this.SecurityGroupId = new String(source.SecurityGroupId);
        }
        if (source.AddressTemplate != null) {
            this.AddressTemplate = new AddressTemplateSpecification(source.AddressTemplate);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.PolicyDescription != null) {
            this.PolicyDescription = new String(source.PolicyDescription);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
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
        this.setParamSimple(map, prefix + "Priority", this.Priority);

    }
}

