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
package com.tencentcloudapi.fwm.v20250611.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecGroupRuleResp extends AbstractModel {

    /**
    * <p>排序</p>
    */
    @SerializedName("OrderIndex")
    @Expose
    private Long OrderIndex;

    /**
    * <p>主键id</p>
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * <p>ip类型</p>
    */
    @SerializedName("IpVersion")
    @Expose
    private String IpVersion;

    /**
    * <p>源规则内容</p>
    */
    @SerializedName("SourceId")
    @Expose
    private String SourceId;

    /**
    * <p>源规则类型<br>取值范围 0/1/2/3/4/5/6/7/8/9/100<br>0表示ip(net),<br>1表示VPC实例(instance)<br>2表示子网实例(instance)<br>3表示CVM实例(instance)<br>4表示CLB实例(instance)<br>5表示ENI实例(instance)<br>6表示数据库实例(instance)<br>7表示模板(template)<br>8表示标签(tag)<br>9表示地域(region)<br>100表示资产分组(resourcegroup)</p>
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
    * <p>目的规则内容</p>
    */
    @SerializedName("TargetId")
    @Expose
    private String TargetId;

    /**
    * <p>目的规则类型<br>取值范围 0/1/2/3/4/5/6/7/8/9/100<br>0表示ip(net),<br>1表示VPC实例(instance)<br>2表示子网实例(instance)<br>3表示CVM实例(instance)<br>4表示CLB实例(instance)<br>5表示ENI实例(instance)<br>6表示数据库实例(instance)<br>7表示模板(template)<br>8表示标签(tag)<br>9表示地域(region)<br>100表示资产分组(resourcegroup)</p>
    */
    @SerializedName("TargetType")
    @Expose
    private Long TargetType;

    /**
    * <p>协议名称<br>取值范围:TCP/ANY/ICMP/UDP<br>ANY:表示所有</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>端口</p>
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * <p>策略</p>
    */
    @SerializedName("Strategy")
    @Expose
    private Long Strategy;

    /**
    * <p>描述</p>
    */
    @SerializedName("Detail")
    @Expose
    private String Detail;

    /**
    * <p>地域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>服务模板id</p>
    */
    @SerializedName("ServiceTemplateId")
    @Expose
    private String ServiceTemplateId;

    /**
    * <p>源资产名称</p>
    */
    @SerializedName("SouInstanceName")
    @Expose
    private String SouInstanceName;

    /**
    * <p>源资产公网ip</p>
    */
    @SerializedName("SouPublicIp")
    @Expose
    private String SouPublicIp;

    /**
    * <p>源资产内网ip</p>
    */
    @SerializedName("SouPrivateIp")
    @Expose
    private String SouPrivateIp;

    /**
    * <p>源资产网段信息</p>
    */
    @SerializedName("SouCidr")
    @Expose
    private String SouCidr;

    /**
    * <p>源模板名称</p>
    */
    @SerializedName("SouParameterName")
    @Expose
    private String SouParameterName;

    /**
    * <p>目的资产名称</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>目的资产公网ip</p>
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * <p>目的资产内网ip</p>
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * <p>目的资产网段信息</p>
    */
    @SerializedName("Cidr")
    @Expose
    private String Cidr;

    /**
    * <p>目的模板名称</p>
    */
    @SerializedName("ParameterName")
    @Expose
    private String ParameterName;

    /**
    * <p>端口模板名称</p>
    */
    @SerializedName("ProtocolPortName")
    @Expose
    private String ProtocolPortName;

    /**
    * <p>规则id  等同RuleUuid</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>域名解析的IP统计</p>
    */
    @SerializedName("DnsParseCount")
    @Expose
    private SgDnsParseCount DnsParseCount;

    /**
    * <p>规则生效范围</p>
    */
    @SerializedName("Scope")
    @Expose
    private String Scope;

    /**
    * <p>规则最近一次是否有改动 取值范围：0/1 0:否 1:是</p>
    */
    @SerializedName("IsNew")
    @Expose
    private Long IsNew;

    /**
    * <p>规则归属的成员账号（当FwGroupId为cfwg-xxx或SourceType/DestType为instance/tag时必填)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BelongMember")
    @Expose
    private MemberInfo BelongMember;

    /**
     * Get <p>排序</p> 
     * @return OrderIndex <p>排序</p>
     */
    public Long getOrderIndex() {
        return this.OrderIndex;
    }

    /**
     * Set <p>排序</p>
     * @param OrderIndex <p>排序</p>
     */
    public void setOrderIndex(Long OrderIndex) {
        this.OrderIndex = OrderIndex;
    }

    /**
     * Get <p>主键id</p> 
     * @return RuleId <p>主键id</p>
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>主键id</p>
     * @param RuleId <p>主键id</p>
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>ip类型</p> 
     * @return IpVersion <p>ip类型</p>
     */
    public String getIpVersion() {
        return this.IpVersion;
    }

    /**
     * Set <p>ip类型</p>
     * @param IpVersion <p>ip类型</p>
     */
    public void setIpVersion(String IpVersion) {
        this.IpVersion = IpVersion;
    }

    /**
     * Get <p>源规则内容</p> 
     * @return SourceId <p>源规则内容</p>
     */
    public String getSourceId() {
        return this.SourceId;
    }

    /**
     * Set <p>源规则内容</p>
     * @param SourceId <p>源规则内容</p>
     */
    public void setSourceId(String SourceId) {
        this.SourceId = SourceId;
    }

    /**
     * Get <p>源规则类型<br>取值范围 0/1/2/3/4/5/6/7/8/9/100<br>0表示ip(net),<br>1表示VPC实例(instance)<br>2表示子网实例(instance)<br>3表示CVM实例(instance)<br>4表示CLB实例(instance)<br>5表示ENI实例(instance)<br>6表示数据库实例(instance)<br>7表示模板(template)<br>8表示标签(tag)<br>9表示地域(region)<br>100表示资产分组(resourcegroup)</p> 
     * @return SourceType <p>源规则类型<br>取值范围 0/1/2/3/4/5/6/7/8/9/100<br>0表示ip(net),<br>1表示VPC实例(instance)<br>2表示子网实例(instance)<br>3表示CVM实例(instance)<br>4表示CLB实例(instance)<br>5表示ENI实例(instance)<br>6表示数据库实例(instance)<br>7表示模板(template)<br>8表示标签(tag)<br>9表示地域(region)<br>100表示资产分组(resourcegroup)</p>
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set <p>源规则类型<br>取值范围 0/1/2/3/4/5/6/7/8/9/100<br>0表示ip(net),<br>1表示VPC实例(instance)<br>2表示子网实例(instance)<br>3表示CVM实例(instance)<br>4表示CLB实例(instance)<br>5表示ENI实例(instance)<br>6表示数据库实例(instance)<br>7表示模板(template)<br>8表示标签(tag)<br>9表示地域(region)<br>100表示资产分组(resourcegroup)</p>
     * @param SourceType <p>源规则类型<br>取值范围 0/1/2/3/4/5/6/7/8/9/100<br>0表示ip(net),<br>1表示VPC实例(instance)<br>2表示子网实例(instance)<br>3表示CVM实例(instance)<br>4表示CLB实例(instance)<br>5表示ENI实例(instance)<br>6表示数据库实例(instance)<br>7表示模板(template)<br>8表示标签(tag)<br>9表示地域(region)<br>100表示资产分组(resourcegroup)</p>
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get <p>目的规则内容</p> 
     * @return TargetId <p>目的规则内容</p>
     */
    public String getTargetId() {
        return this.TargetId;
    }

    /**
     * Set <p>目的规则内容</p>
     * @param TargetId <p>目的规则内容</p>
     */
    public void setTargetId(String TargetId) {
        this.TargetId = TargetId;
    }

    /**
     * Get <p>目的规则类型<br>取值范围 0/1/2/3/4/5/6/7/8/9/100<br>0表示ip(net),<br>1表示VPC实例(instance)<br>2表示子网实例(instance)<br>3表示CVM实例(instance)<br>4表示CLB实例(instance)<br>5表示ENI实例(instance)<br>6表示数据库实例(instance)<br>7表示模板(template)<br>8表示标签(tag)<br>9表示地域(region)<br>100表示资产分组(resourcegroup)</p> 
     * @return TargetType <p>目的规则类型<br>取值范围 0/1/2/3/4/5/6/7/8/9/100<br>0表示ip(net),<br>1表示VPC实例(instance)<br>2表示子网实例(instance)<br>3表示CVM实例(instance)<br>4表示CLB实例(instance)<br>5表示ENI实例(instance)<br>6表示数据库实例(instance)<br>7表示模板(template)<br>8表示标签(tag)<br>9表示地域(region)<br>100表示资产分组(resourcegroup)</p>
     */
    public Long getTargetType() {
        return this.TargetType;
    }

    /**
     * Set <p>目的规则类型<br>取值范围 0/1/2/3/4/5/6/7/8/9/100<br>0表示ip(net),<br>1表示VPC实例(instance)<br>2表示子网实例(instance)<br>3表示CVM实例(instance)<br>4表示CLB实例(instance)<br>5表示ENI实例(instance)<br>6表示数据库实例(instance)<br>7表示模板(template)<br>8表示标签(tag)<br>9表示地域(region)<br>100表示资产分组(resourcegroup)</p>
     * @param TargetType <p>目的规则类型<br>取值范围 0/1/2/3/4/5/6/7/8/9/100<br>0表示ip(net),<br>1表示VPC实例(instance)<br>2表示子网实例(instance)<br>3表示CVM实例(instance)<br>4表示CLB实例(instance)<br>5表示ENI实例(instance)<br>6表示数据库实例(instance)<br>7表示模板(template)<br>8表示标签(tag)<br>9表示地域(region)<br>100表示资产分组(resourcegroup)</p>
     */
    public void setTargetType(Long TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get <p>协议名称<br>取值范围:TCP/ANY/ICMP/UDP<br>ANY:表示所有</p> 
     * @return Protocol <p>协议名称<br>取值范围:TCP/ANY/ICMP/UDP<br>ANY:表示所有</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>协议名称<br>取值范围:TCP/ANY/ICMP/UDP<br>ANY:表示所有</p>
     * @param Protocol <p>协议名称<br>取值范围:TCP/ANY/ICMP/UDP<br>ANY:表示所有</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>端口</p> 
     * @return Port <p>端口</p>
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set <p>端口</p>
     * @param Port <p>端口</p>
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get <p>策略</p> 
     * @return Strategy <p>策略</p>
     */
    public Long getStrategy() {
        return this.Strategy;
    }

    /**
     * Set <p>策略</p>
     * @param Strategy <p>策略</p>
     */
    public void setStrategy(Long Strategy) {
        this.Strategy = Strategy;
    }

    /**
     * Get <p>描述</p> 
     * @return Detail <p>描述</p>
     */
    public String getDetail() {
        return this.Detail;
    }

    /**
     * Set <p>描述</p>
     * @param Detail <p>描述</p>
     */
    public void setDetail(String Detail) {
        this.Detail = Detail;
    }

    /**
     * Get <p>地域</p> 
     * @return Region <p>地域</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域</p>
     * @param Region <p>地域</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>服务模板id</p> 
     * @return ServiceTemplateId <p>服务模板id</p>
     */
    public String getServiceTemplateId() {
        return this.ServiceTemplateId;
    }

    /**
     * Set <p>服务模板id</p>
     * @param ServiceTemplateId <p>服务模板id</p>
     */
    public void setServiceTemplateId(String ServiceTemplateId) {
        this.ServiceTemplateId = ServiceTemplateId;
    }

    /**
     * Get <p>源资产名称</p> 
     * @return SouInstanceName <p>源资产名称</p>
     */
    public String getSouInstanceName() {
        return this.SouInstanceName;
    }

    /**
     * Set <p>源资产名称</p>
     * @param SouInstanceName <p>源资产名称</p>
     */
    public void setSouInstanceName(String SouInstanceName) {
        this.SouInstanceName = SouInstanceName;
    }

    /**
     * Get <p>源资产公网ip</p> 
     * @return SouPublicIp <p>源资产公网ip</p>
     */
    public String getSouPublicIp() {
        return this.SouPublicIp;
    }

    /**
     * Set <p>源资产公网ip</p>
     * @param SouPublicIp <p>源资产公网ip</p>
     */
    public void setSouPublicIp(String SouPublicIp) {
        this.SouPublicIp = SouPublicIp;
    }

    /**
     * Get <p>源资产内网ip</p> 
     * @return SouPrivateIp <p>源资产内网ip</p>
     */
    public String getSouPrivateIp() {
        return this.SouPrivateIp;
    }

    /**
     * Set <p>源资产内网ip</p>
     * @param SouPrivateIp <p>源资产内网ip</p>
     */
    public void setSouPrivateIp(String SouPrivateIp) {
        this.SouPrivateIp = SouPrivateIp;
    }

    /**
     * Get <p>源资产网段信息</p> 
     * @return SouCidr <p>源资产网段信息</p>
     */
    public String getSouCidr() {
        return this.SouCidr;
    }

    /**
     * Set <p>源资产网段信息</p>
     * @param SouCidr <p>源资产网段信息</p>
     */
    public void setSouCidr(String SouCidr) {
        this.SouCidr = SouCidr;
    }

    /**
     * Get <p>源模板名称</p> 
     * @return SouParameterName <p>源模板名称</p>
     */
    public String getSouParameterName() {
        return this.SouParameterName;
    }

    /**
     * Set <p>源模板名称</p>
     * @param SouParameterName <p>源模板名称</p>
     */
    public void setSouParameterName(String SouParameterName) {
        this.SouParameterName = SouParameterName;
    }

    /**
     * Get <p>目的资产名称</p> 
     * @return InstanceName <p>目的资产名称</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>目的资产名称</p>
     * @param InstanceName <p>目的资产名称</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>目的资产公网ip</p> 
     * @return PublicIp <p>目的资产公网ip</p>
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set <p>目的资产公网ip</p>
     * @param PublicIp <p>目的资产公网ip</p>
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get <p>目的资产内网ip</p> 
     * @return PrivateIp <p>目的资产内网ip</p>
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set <p>目的资产内网ip</p>
     * @param PrivateIp <p>目的资产内网ip</p>
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get <p>目的资产网段信息</p> 
     * @return Cidr <p>目的资产网段信息</p>
     */
    public String getCidr() {
        return this.Cidr;
    }

    /**
     * Set <p>目的资产网段信息</p>
     * @param Cidr <p>目的资产网段信息</p>
     */
    public void setCidr(String Cidr) {
        this.Cidr = Cidr;
    }

    /**
     * Get <p>目的模板名称</p> 
     * @return ParameterName <p>目的模板名称</p>
     */
    public String getParameterName() {
        return this.ParameterName;
    }

    /**
     * Set <p>目的模板名称</p>
     * @param ParameterName <p>目的模板名称</p>
     */
    public void setParameterName(String ParameterName) {
        this.ParameterName = ParameterName;
    }

    /**
     * Get <p>端口模板名称</p> 
     * @return ProtocolPortName <p>端口模板名称</p>
     */
    public String getProtocolPortName() {
        return this.ProtocolPortName;
    }

    /**
     * Set <p>端口模板名称</p>
     * @param ProtocolPortName <p>端口模板名称</p>
     */
    public void setProtocolPortName(String ProtocolPortName) {
        this.ProtocolPortName = ProtocolPortName;
    }

    /**
     * Get <p>规则id  等同RuleUuid</p> 
     * @return Id <p>规则id  等同RuleUuid</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>规则id  等同RuleUuid</p>
     * @param Id <p>规则id  等同RuleUuid</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>域名解析的IP统计</p> 
     * @return DnsParseCount <p>域名解析的IP统计</p>
     */
    public SgDnsParseCount getDnsParseCount() {
        return this.DnsParseCount;
    }

    /**
     * Set <p>域名解析的IP统计</p>
     * @param DnsParseCount <p>域名解析的IP统计</p>
     */
    public void setDnsParseCount(SgDnsParseCount DnsParseCount) {
        this.DnsParseCount = DnsParseCount;
    }

    /**
     * Get <p>规则生效范围</p> 
     * @return Scope <p>规则生效范围</p>
     */
    public String getScope() {
        return this.Scope;
    }

    /**
     * Set <p>规则生效范围</p>
     * @param Scope <p>规则生效范围</p>
     */
    public void setScope(String Scope) {
        this.Scope = Scope;
    }

    /**
     * Get <p>规则最近一次是否有改动 取值范围：0/1 0:否 1:是</p> 
     * @return IsNew <p>规则最近一次是否有改动 取值范围：0/1 0:否 1:是</p>
     */
    public Long getIsNew() {
        return this.IsNew;
    }

    /**
     * Set <p>规则最近一次是否有改动 取值范围：0/1 0:否 1:是</p>
     * @param IsNew <p>规则最近一次是否有改动 取值范围：0/1 0:否 1:是</p>
     */
    public void setIsNew(Long IsNew) {
        this.IsNew = IsNew;
    }

    /**
     * Get <p>规则归属的成员账号（当FwGroupId为cfwg-xxx或SourceType/DestType为instance/tag时必填)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BelongMember <p>规则归属的成员账号（当FwGroupId为cfwg-xxx或SourceType/DestType为instance/tag时必填)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MemberInfo getBelongMember() {
        return this.BelongMember;
    }

    /**
     * Set <p>规则归属的成员账号（当FwGroupId为cfwg-xxx或SourceType/DestType为instance/tag时必填)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BelongMember <p>规则归属的成员账号（当FwGroupId为cfwg-xxx或SourceType/DestType为instance/tag时必填)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBelongMember(MemberInfo BelongMember) {
        this.BelongMember = BelongMember;
    }

    public SecGroupRuleResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecGroupRuleResp(SecGroupRuleResp source) {
        if (source.OrderIndex != null) {
            this.OrderIndex = new Long(source.OrderIndex);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.IpVersion != null) {
            this.IpVersion = new String(source.IpVersion);
        }
        if (source.SourceId != null) {
            this.SourceId = new String(source.SourceId);
        }
        if (source.SourceType != null) {
            this.SourceType = new Long(source.SourceType);
        }
        if (source.TargetId != null) {
            this.TargetId = new String(source.TargetId);
        }
        if (source.TargetType != null) {
            this.TargetType = new Long(source.TargetType);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.Strategy != null) {
            this.Strategy = new Long(source.Strategy);
        }
        if (source.Detail != null) {
            this.Detail = new String(source.Detail);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.ServiceTemplateId != null) {
            this.ServiceTemplateId = new String(source.ServiceTemplateId);
        }
        if (source.SouInstanceName != null) {
            this.SouInstanceName = new String(source.SouInstanceName);
        }
        if (source.SouPublicIp != null) {
            this.SouPublicIp = new String(source.SouPublicIp);
        }
        if (source.SouPrivateIp != null) {
            this.SouPrivateIp = new String(source.SouPrivateIp);
        }
        if (source.SouCidr != null) {
            this.SouCidr = new String(source.SouCidr);
        }
        if (source.SouParameterName != null) {
            this.SouParameterName = new String(source.SouParameterName);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.Cidr != null) {
            this.Cidr = new String(source.Cidr);
        }
        if (source.ParameterName != null) {
            this.ParameterName = new String(source.ParameterName);
        }
        if (source.ProtocolPortName != null) {
            this.ProtocolPortName = new String(source.ProtocolPortName);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.DnsParseCount != null) {
            this.DnsParseCount = new SgDnsParseCount(source.DnsParseCount);
        }
        if (source.Scope != null) {
            this.Scope = new String(source.Scope);
        }
        if (source.IsNew != null) {
            this.IsNew = new Long(source.IsNew);
        }
        if (source.BelongMember != null) {
            this.BelongMember = new MemberInfo(source.BelongMember);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrderIndex", this.OrderIndex);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "IpVersion", this.IpVersion);
        this.setParamSimple(map, prefix + "SourceId", this.SourceId);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "TargetId", this.TargetId);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Strategy", this.Strategy);
        this.setParamSimple(map, prefix + "Detail", this.Detail);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "ServiceTemplateId", this.ServiceTemplateId);
        this.setParamSimple(map, prefix + "SouInstanceName", this.SouInstanceName);
        this.setParamSimple(map, prefix + "SouPublicIp", this.SouPublicIp);
        this.setParamSimple(map, prefix + "SouPrivateIp", this.SouPrivateIp);
        this.setParamSimple(map, prefix + "SouCidr", this.SouCidr);
        this.setParamSimple(map, prefix + "SouParameterName", this.SouParameterName);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "Cidr", this.Cidr);
        this.setParamSimple(map, prefix + "ParameterName", this.ParameterName);
        this.setParamSimple(map, prefix + "ProtocolPortName", this.ProtocolPortName);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamObj(map, prefix + "DnsParseCount.", this.DnsParseCount);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "IsNew", this.IsNew);
        this.setParamObj(map, prefix + "BelongMember.", this.BelongMember);

    }
}

