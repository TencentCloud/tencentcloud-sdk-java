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

public class AnalysisSgRuleInfoResp extends AbstractModel {

    /**
    * 规则id  等同RuleUuid
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 规则Id
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 排序
    */
    @SerializedName("OrderIndex")
    @Expose
    private Long OrderIndex;

    /**
    * 云防排序
    */
    @SerializedName("CfwOrderIndex")
    @Expose
    private Long CfwOrderIndex;

    /**
    * 源规则内容
    */
    @SerializedName("SourceId")
    @Expose
    private String SourceId;

    /**
    * 源规则类型 
取值范围 0/1/2/3/4/5/6/7/8/9/100
0表示ip(net),
1表示VPC实例(instance)
2表示子网实例(instance)
3表示CVM实例(instance)
4表示CLB实例(instance)
5表示ENI实例(instance)
6表示数据库实例(instance)
7表示模板(template)
8表示标签(tag)
9表示地域(region)
100表示资产分组(resourcegroup)
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
    * 目的规则内容
    */
    @SerializedName("TargetId")
    @Expose
    private String TargetId;

    /**
    * 目的规则类型 
取值范围 0/1/2/3/4/5/6/7/8/9/100
0表示ip(net),
1表示VPC实例(instance)
2表示子网实例(instance)
3表示CVM实例(instance)
4表示CLB实例(instance)
5表示ENI实例(instance)
6表示数据库实例(instance)
7表示模板(template)
8表示标签(tag)
9表示地域(region)
100表示资产分组(resourcegroup)
    */
    @SerializedName("TargetType")
    @Expose
    private Long TargetType;

    /**
    * 协议名称
取值范围:TCP/ANY/ICMP/UDP
ANY:表示所有

    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 端口
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * 规则策略
取值范围:1/2
1:阻断
2:放行
    */
    @SerializedName("Strategy")
    @Expose
    private Long Strategy;

    /**
    * 描述
    */
    @SerializedName("Detail")
    @Expose
    private String Detail;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 服务模板id
    */
    @SerializedName("ServiceTemplateId")
    @Expose
    private String ServiceTemplateId;

    /**
    * 源资产名称
    */
    @SerializedName("SouInstanceName")
    @Expose
    private String SouInstanceName;

    /**
    * 源资产公网ip
    */
    @SerializedName("SouPublicIp")
    @Expose
    private String SouPublicIp;

    /**
    * 源资产内网ip
    */
    @SerializedName("SouPrivateIp")
    @Expose
    private String SouPrivateIp;

    /**
    * 源资产网段信息
    */
    @SerializedName("SouCidr")
    @Expose
    private String SouCidr;

    /**
    * 源模板名称
    */
    @SerializedName("SouParameterName")
    @Expose
    private String SouParameterName;

    /**
    * 目的资产名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 目的资产公网ip
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * 目的资产内网ip
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * 目的资产网段信息
    */
    @SerializedName("Cidr")
    @Expose
    private String Cidr;

    /**
    * 目的模板名称
    */
    @SerializedName("ParameterName")
    @Expose
    private String ParameterName;

    /**
    * 端口模板名称
    */
    @SerializedName("ProtocolPortName")
    @Expose
    private String ProtocolPortName;

    /**
    * 域名解析的IP统计
    */
    @SerializedName("DnsParseCount")
    @Expose
    private SgDnsParseCount DnsParseCount;

    /**
    * 规则生效范围
    */
    @SerializedName("Scope")
    @Expose
    private String Scope;

    /**
    * 分区：
1防火墙管理最前分区
2是云防规则
3防火墙管理最后分区
    */
    @SerializedName("RulePartition")
    @Expose
    private Long RulePartition;

    /**
    * 规则组Id
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 规则组名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 规则组内规则id
    */
    @SerializedName("GroupRuleId")
    @Expose
    private String GroupRuleId;

    /**
    * 策略Id
    */
    @SerializedName("StrategyId")
    @Expose
    private String StrategyId;

    /**
    * ip类型
    */
    @SerializedName("IpVersion")
    @Expose
    private String IpVersion;

    /**
    * 成员信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BelongMember")
    @Expose
    private MemberInfo BelongMember;

    /**
     * Get 规则id  等同RuleUuid 
     * @return Id 规则id  等同RuleUuid
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 规则id  等同RuleUuid
     * @param Id 规则id  等同RuleUuid
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 规则Id 
     * @return RuleId 规则Id
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则Id
     * @param RuleId 规则Id
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 排序 
     * @return OrderIndex 排序
     */
    public Long getOrderIndex() {
        return this.OrderIndex;
    }

    /**
     * Set 排序
     * @param OrderIndex 排序
     */
    public void setOrderIndex(Long OrderIndex) {
        this.OrderIndex = OrderIndex;
    }

    /**
     * Get 云防排序 
     * @return CfwOrderIndex 云防排序
     */
    public Long getCfwOrderIndex() {
        return this.CfwOrderIndex;
    }

    /**
     * Set 云防排序
     * @param CfwOrderIndex 云防排序
     */
    public void setCfwOrderIndex(Long CfwOrderIndex) {
        this.CfwOrderIndex = CfwOrderIndex;
    }

    /**
     * Get 源规则内容 
     * @return SourceId 源规则内容
     */
    public String getSourceId() {
        return this.SourceId;
    }

    /**
     * Set 源规则内容
     * @param SourceId 源规则内容
     */
    public void setSourceId(String SourceId) {
        this.SourceId = SourceId;
    }

    /**
     * Get 源规则类型 
取值范围 0/1/2/3/4/5/6/7/8/9/100
0表示ip(net),
1表示VPC实例(instance)
2表示子网实例(instance)
3表示CVM实例(instance)
4表示CLB实例(instance)
5表示ENI实例(instance)
6表示数据库实例(instance)
7表示模板(template)
8表示标签(tag)
9表示地域(region)
100表示资产分组(resourcegroup) 
     * @return SourceType 源规则类型 
取值范围 0/1/2/3/4/5/6/7/8/9/100
0表示ip(net),
1表示VPC实例(instance)
2表示子网实例(instance)
3表示CVM实例(instance)
4表示CLB实例(instance)
5表示ENI实例(instance)
6表示数据库实例(instance)
7表示模板(template)
8表示标签(tag)
9表示地域(region)
100表示资产分组(resourcegroup)
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 源规则类型 
取值范围 0/1/2/3/4/5/6/7/8/9/100
0表示ip(net),
1表示VPC实例(instance)
2表示子网实例(instance)
3表示CVM实例(instance)
4表示CLB实例(instance)
5表示ENI实例(instance)
6表示数据库实例(instance)
7表示模板(template)
8表示标签(tag)
9表示地域(region)
100表示资产分组(resourcegroup)
     * @param SourceType 源规则类型 
取值范围 0/1/2/3/4/5/6/7/8/9/100
0表示ip(net),
1表示VPC实例(instance)
2表示子网实例(instance)
3表示CVM实例(instance)
4表示CLB实例(instance)
5表示ENI实例(instance)
6表示数据库实例(instance)
7表示模板(template)
8表示标签(tag)
9表示地域(region)
100表示资产分组(resourcegroup)
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 目的规则内容 
     * @return TargetId 目的规则内容
     */
    public String getTargetId() {
        return this.TargetId;
    }

    /**
     * Set 目的规则内容
     * @param TargetId 目的规则内容
     */
    public void setTargetId(String TargetId) {
        this.TargetId = TargetId;
    }

    /**
     * Get 目的规则类型 
取值范围 0/1/2/3/4/5/6/7/8/9/100
0表示ip(net),
1表示VPC实例(instance)
2表示子网实例(instance)
3表示CVM实例(instance)
4表示CLB实例(instance)
5表示ENI实例(instance)
6表示数据库实例(instance)
7表示模板(template)
8表示标签(tag)
9表示地域(region)
100表示资产分组(resourcegroup) 
     * @return TargetType 目的规则类型 
取值范围 0/1/2/3/4/5/6/7/8/9/100
0表示ip(net),
1表示VPC实例(instance)
2表示子网实例(instance)
3表示CVM实例(instance)
4表示CLB实例(instance)
5表示ENI实例(instance)
6表示数据库实例(instance)
7表示模板(template)
8表示标签(tag)
9表示地域(region)
100表示资产分组(resourcegroup)
     */
    public Long getTargetType() {
        return this.TargetType;
    }

    /**
     * Set 目的规则类型 
取值范围 0/1/2/3/4/5/6/7/8/9/100
0表示ip(net),
1表示VPC实例(instance)
2表示子网实例(instance)
3表示CVM实例(instance)
4表示CLB实例(instance)
5表示ENI实例(instance)
6表示数据库实例(instance)
7表示模板(template)
8表示标签(tag)
9表示地域(region)
100表示资产分组(resourcegroup)
     * @param TargetType 目的规则类型 
取值范围 0/1/2/3/4/5/6/7/8/9/100
0表示ip(net),
1表示VPC实例(instance)
2表示子网实例(instance)
3表示CVM实例(instance)
4表示CLB实例(instance)
5表示ENI实例(instance)
6表示数据库实例(instance)
7表示模板(template)
8表示标签(tag)
9表示地域(region)
100表示资产分组(resourcegroup)
     */
    public void setTargetType(Long TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get 协议名称
取值范围:TCP/ANY/ICMP/UDP
ANY:表示所有
 
     * @return Protocol 协议名称
取值范围:TCP/ANY/ICMP/UDP
ANY:表示所有

     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议名称
取值范围:TCP/ANY/ICMP/UDP
ANY:表示所有

     * @param Protocol 协议名称
取值范围:TCP/ANY/ICMP/UDP
ANY:表示所有

     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 端口 
     * @return Port 端口
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set 端口
     * @param Port 端口
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get 规则策略
取值范围:1/2
1:阻断
2:放行 
     * @return Strategy 规则策略
取值范围:1/2
1:阻断
2:放行
     */
    public Long getStrategy() {
        return this.Strategy;
    }

    /**
     * Set 规则策略
取值范围:1/2
1:阻断
2:放行
     * @param Strategy 规则策略
取值范围:1/2
1:阻断
2:放行
     */
    public void setStrategy(Long Strategy) {
        this.Strategy = Strategy;
    }

    /**
     * Get 描述 
     * @return Detail 描述
     */
    public String getDetail() {
        return this.Detail;
    }

    /**
     * Set 描述
     * @param Detail 描述
     */
    public void setDetail(String Detail) {
        this.Detail = Detail;
    }

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 服务模板id 
     * @return ServiceTemplateId 服务模板id
     */
    public String getServiceTemplateId() {
        return this.ServiceTemplateId;
    }

    /**
     * Set 服务模板id
     * @param ServiceTemplateId 服务模板id
     */
    public void setServiceTemplateId(String ServiceTemplateId) {
        this.ServiceTemplateId = ServiceTemplateId;
    }

    /**
     * Get 源资产名称 
     * @return SouInstanceName 源资产名称
     */
    public String getSouInstanceName() {
        return this.SouInstanceName;
    }

    /**
     * Set 源资产名称
     * @param SouInstanceName 源资产名称
     */
    public void setSouInstanceName(String SouInstanceName) {
        this.SouInstanceName = SouInstanceName;
    }

    /**
     * Get 源资产公网ip 
     * @return SouPublicIp 源资产公网ip
     */
    public String getSouPublicIp() {
        return this.SouPublicIp;
    }

    /**
     * Set 源资产公网ip
     * @param SouPublicIp 源资产公网ip
     */
    public void setSouPublicIp(String SouPublicIp) {
        this.SouPublicIp = SouPublicIp;
    }

    /**
     * Get 源资产内网ip 
     * @return SouPrivateIp 源资产内网ip
     */
    public String getSouPrivateIp() {
        return this.SouPrivateIp;
    }

    /**
     * Set 源资产内网ip
     * @param SouPrivateIp 源资产内网ip
     */
    public void setSouPrivateIp(String SouPrivateIp) {
        this.SouPrivateIp = SouPrivateIp;
    }

    /**
     * Get 源资产网段信息 
     * @return SouCidr 源资产网段信息
     */
    public String getSouCidr() {
        return this.SouCidr;
    }

    /**
     * Set 源资产网段信息
     * @param SouCidr 源资产网段信息
     */
    public void setSouCidr(String SouCidr) {
        this.SouCidr = SouCidr;
    }

    /**
     * Get 源模板名称 
     * @return SouParameterName 源模板名称
     */
    public String getSouParameterName() {
        return this.SouParameterName;
    }

    /**
     * Set 源模板名称
     * @param SouParameterName 源模板名称
     */
    public void setSouParameterName(String SouParameterName) {
        this.SouParameterName = SouParameterName;
    }

    /**
     * Get 目的资产名称 
     * @return InstanceName 目的资产名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 目的资产名称
     * @param InstanceName 目的资产名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 目的资产公网ip 
     * @return PublicIp 目的资产公网ip
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set 目的资产公网ip
     * @param PublicIp 目的资产公网ip
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get 目的资产内网ip 
     * @return PrivateIp 目的资产内网ip
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set 目的资产内网ip
     * @param PrivateIp 目的资产内网ip
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get 目的资产网段信息 
     * @return Cidr 目的资产网段信息
     */
    public String getCidr() {
        return this.Cidr;
    }

    /**
     * Set 目的资产网段信息
     * @param Cidr 目的资产网段信息
     */
    public void setCidr(String Cidr) {
        this.Cidr = Cidr;
    }

    /**
     * Get 目的模板名称 
     * @return ParameterName 目的模板名称
     */
    public String getParameterName() {
        return this.ParameterName;
    }

    /**
     * Set 目的模板名称
     * @param ParameterName 目的模板名称
     */
    public void setParameterName(String ParameterName) {
        this.ParameterName = ParameterName;
    }

    /**
     * Get 端口模板名称 
     * @return ProtocolPortName 端口模板名称
     */
    public String getProtocolPortName() {
        return this.ProtocolPortName;
    }

    /**
     * Set 端口模板名称
     * @param ProtocolPortName 端口模板名称
     */
    public void setProtocolPortName(String ProtocolPortName) {
        this.ProtocolPortName = ProtocolPortName;
    }

    /**
     * Get 域名解析的IP统计 
     * @return DnsParseCount 域名解析的IP统计
     */
    public SgDnsParseCount getDnsParseCount() {
        return this.DnsParseCount;
    }

    /**
     * Set 域名解析的IP统计
     * @param DnsParseCount 域名解析的IP统计
     */
    public void setDnsParseCount(SgDnsParseCount DnsParseCount) {
        this.DnsParseCount = DnsParseCount;
    }

    /**
     * Get 规则生效范围 
     * @return Scope 规则生效范围
     */
    public String getScope() {
        return this.Scope;
    }

    /**
     * Set 规则生效范围
     * @param Scope 规则生效范围
     */
    public void setScope(String Scope) {
        this.Scope = Scope;
    }

    /**
     * Get 分区：
1防火墙管理最前分区
2是云防规则
3防火墙管理最后分区 
     * @return RulePartition 分区：
1防火墙管理最前分区
2是云防规则
3防火墙管理最后分区
     */
    public Long getRulePartition() {
        return this.RulePartition;
    }

    /**
     * Set 分区：
1防火墙管理最前分区
2是云防规则
3防火墙管理最后分区
     * @param RulePartition 分区：
1防火墙管理最前分区
2是云防规则
3防火墙管理最后分区
     */
    public void setRulePartition(Long RulePartition) {
        this.RulePartition = RulePartition;
    }

    /**
     * Get 规则组Id 
     * @return GroupId 规则组Id
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 规则组Id
     * @param GroupId 规则组Id
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 规则组名称 
     * @return GroupName 规则组名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 规则组名称
     * @param GroupName 规则组名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 规则组内规则id 
     * @return GroupRuleId 规则组内规则id
     */
    public String getGroupRuleId() {
        return this.GroupRuleId;
    }

    /**
     * Set 规则组内规则id
     * @param GroupRuleId 规则组内规则id
     */
    public void setGroupRuleId(String GroupRuleId) {
        this.GroupRuleId = GroupRuleId;
    }

    /**
     * Get 策略Id 
     * @return StrategyId 策略Id
     */
    public String getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set 策略Id
     * @param StrategyId 策略Id
     */
    public void setStrategyId(String StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get ip类型 
     * @return IpVersion ip类型
     */
    public String getIpVersion() {
        return this.IpVersion;
    }

    /**
     * Set ip类型
     * @param IpVersion ip类型
     */
    public void setIpVersion(String IpVersion) {
        this.IpVersion = IpVersion;
    }

    /**
     * Get 成员信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BelongMember 成员信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MemberInfo getBelongMember() {
        return this.BelongMember;
    }

    /**
     * Set 成员信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param BelongMember 成员信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBelongMember(MemberInfo BelongMember) {
        this.BelongMember = BelongMember;
    }

    public AnalysisSgRuleInfoResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AnalysisSgRuleInfoResp(AnalysisSgRuleInfoResp source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.OrderIndex != null) {
            this.OrderIndex = new Long(source.OrderIndex);
        }
        if (source.CfwOrderIndex != null) {
            this.CfwOrderIndex = new Long(source.CfwOrderIndex);
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
        if (source.DnsParseCount != null) {
            this.DnsParseCount = new SgDnsParseCount(source.DnsParseCount);
        }
        if (source.Scope != null) {
            this.Scope = new String(source.Scope);
        }
        if (source.RulePartition != null) {
            this.RulePartition = new Long(source.RulePartition);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.GroupRuleId != null) {
            this.GroupRuleId = new String(source.GroupRuleId);
        }
        if (source.StrategyId != null) {
            this.StrategyId = new String(source.StrategyId);
        }
        if (source.IpVersion != null) {
            this.IpVersion = new String(source.IpVersion);
        }
        if (source.BelongMember != null) {
            this.BelongMember = new MemberInfo(source.BelongMember);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "OrderIndex", this.OrderIndex);
        this.setParamSimple(map, prefix + "CfwOrderIndex", this.CfwOrderIndex);
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
        this.setParamObj(map, prefix + "DnsParseCount.", this.DnsParseCount);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "RulePartition", this.RulePartition);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "GroupRuleId", this.GroupRuleId);
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamSimple(map, prefix + "IpVersion", this.IpVersion);
        this.setParamObj(map, prefix + "BelongMember.", this.BelongMember);

    }
}

