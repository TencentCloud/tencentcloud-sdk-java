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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnterpriseSecurityGroupRuleRuleInfo extends AbstractModel {

    /**
    * 排序
    */
    @SerializedName("OrderIndex")
    @Expose
    private Long OrderIndex;

    /**
    * 主键id
    */
    @SerializedName("RuleUuid")
    @Expose
    private Long RuleUuid;

    /**
    * 规则uuid
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

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
1表示VPC实例(intance)
2表示子网实例(intance)
3表示CVM实例(intance)
4表示CLB实例(intance)
5表示ENI实例(intance)
6表示数据库实例(intance)
7表示模版(template)
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
1表示VPC实例(intance)
2表示子网实例(intance)
3表示CVM实例(intance)
4表示CLB实例(intance)
5表示ENI实例(intance)
6表示数据库实例(intance)
7表示模版(template)
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
    * 规则启用状态 
取值范围： 0/1
0:未开启
1:开启
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 描述
    */
    @SerializedName("Detail")
    @Expose
    private String Detail;

    /**
    * 标签
    */
    @SerializedName("AclTags")
    @Expose
    private String AclTags;

    /**
    * 规则最新一次是否有改动
取值范围：0/1
0:否
1:是
    */
    @SerializedName("IsNew")
    @Expose
    private Long IsNew;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 是否延迟下发规则 
取值范围：0/1
0:立即下发 1:延迟下发
    */
    @SerializedName("IsDelay")
    @Expose
    private Long IsDelay;

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
    * 自动化任务信息
    */
    @SerializedName("BetaList")
    @Expose
    private EnterpriseSecurityGroupRuleBetaInfo [] BetaList;

    /**
    * 规则id  等同RuleUuid
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

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
     * Get 主键id 
     * @return RuleUuid 主键id
     */
    public Long getRuleUuid() {
        return this.RuleUuid;
    }

    /**
     * Set 主键id
     * @param RuleUuid 主键id
     */
    public void setRuleUuid(Long RuleUuid) {
        this.RuleUuid = RuleUuid;
    }

    /**
     * Get 规则uuid 
     * @return Uuid 规则uuid
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 规则uuid
     * @param Uuid 规则uuid
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
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
1表示VPC实例(intance)
2表示子网实例(intance)
3表示CVM实例(intance)
4表示CLB实例(intance)
5表示ENI实例(intance)
6表示数据库实例(intance)
7表示模版(template)
8表示标签(tag)
9表示地域(region)
100表示资产分组(resourcegroup) 
     * @return SourceType 源规则类型 
取值范围 0/1/2/3/4/5/6/7/8/9/100
0表示ip(net),
1表示VPC实例(intance)
2表示子网实例(intance)
3表示CVM实例(intance)
4表示CLB实例(intance)
5表示ENI实例(intance)
6表示数据库实例(intance)
7表示模版(template)
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
1表示VPC实例(intance)
2表示子网实例(intance)
3表示CVM实例(intance)
4表示CLB实例(intance)
5表示ENI实例(intance)
6表示数据库实例(intance)
7表示模版(template)
8表示标签(tag)
9表示地域(region)
100表示资产分组(resourcegroup)
     * @param SourceType 源规则类型 
取值范围 0/1/2/3/4/5/6/7/8/9/100
0表示ip(net),
1表示VPC实例(intance)
2表示子网实例(intance)
3表示CVM实例(intance)
4表示CLB实例(intance)
5表示ENI实例(intance)
6表示数据库实例(intance)
7表示模版(template)
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
1表示VPC实例(intance)
2表示子网实例(intance)
3表示CVM实例(intance)
4表示CLB实例(intance)
5表示ENI实例(intance)
6表示数据库实例(intance)
7表示模版(template)
8表示标签(tag)
9表示地域(region)
100表示资产分组(resourcegroup) 
     * @return TargetType 目的规则类型 
取值范围 0/1/2/3/4/5/6/7/8/9/100
0表示ip(net),
1表示VPC实例(intance)
2表示子网实例(intance)
3表示CVM实例(intance)
4表示CLB实例(intance)
5表示ENI实例(intance)
6表示数据库实例(intance)
7表示模版(template)
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
1表示VPC实例(intance)
2表示子网实例(intance)
3表示CVM实例(intance)
4表示CLB实例(intance)
5表示ENI实例(intance)
6表示数据库实例(intance)
7表示模版(template)
8表示标签(tag)
9表示地域(region)
100表示资产分组(resourcegroup)
     * @param TargetType 目的规则类型 
取值范围 0/1/2/3/4/5/6/7/8/9/100
0表示ip(net),
1表示VPC实例(intance)
2表示子网实例(intance)
3表示CVM实例(intance)
4表示CLB实例(intance)
5表示ENI实例(intance)
6表示数据库实例(intance)
7表示模版(template)
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
     * Get 规则启用状态 
取值范围： 0/1
0:未开启
1:开启 
     * @return Status 规则启用状态 
取值范围： 0/1
0:未开启
1:开启
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 规则启用状态 
取值范围： 0/1
0:未开启
1:开启
     * @param Status 规则启用状态 
取值范围： 0/1
0:未开启
1:开启
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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
     * Get 标签 
     * @return AclTags 标签
     */
    public String getAclTags() {
        return this.AclTags;
    }

    /**
     * Set 标签
     * @param AclTags 标签
     */
    public void setAclTags(String AclTags) {
        this.AclTags = AclTags;
    }

    /**
     * Get 规则最新一次是否有改动
取值范围：0/1
0:否
1:是 
     * @return IsNew 规则最新一次是否有改动
取值范围：0/1
0:否
1:是
     */
    public Long getIsNew() {
        return this.IsNew;
    }

    /**
     * Set 规则最新一次是否有改动
取值范围：0/1
0:否
1:是
     * @param IsNew 规则最新一次是否有改动
取值范围：0/1
0:否
1:是
     */
    public void setIsNew(Long IsNew) {
        this.IsNew = IsNew;
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
     * Get 是否延迟下发规则 
取值范围：0/1
0:立即下发 1:延迟下发 
     * @return IsDelay 是否延迟下发规则 
取值范围：0/1
0:立即下发 1:延迟下发
     */
    public Long getIsDelay() {
        return this.IsDelay;
    }

    /**
     * Set 是否延迟下发规则 
取值范围：0/1
0:立即下发 1:延迟下发
     * @param IsDelay 是否延迟下发规则 
取值范围：0/1
0:立即下发 1:延迟下发
     */
    public void setIsDelay(Long IsDelay) {
        this.IsDelay = IsDelay;
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
     * Get 自动化任务信息 
     * @return BetaList 自动化任务信息
     */
    public EnterpriseSecurityGroupRuleBetaInfo [] getBetaList() {
        return this.BetaList;
    }

    /**
     * Set 自动化任务信息
     * @param BetaList 自动化任务信息
     */
    public void setBetaList(EnterpriseSecurityGroupRuleBetaInfo [] BetaList) {
        this.BetaList = BetaList;
    }

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

    public EnterpriseSecurityGroupRuleRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnterpriseSecurityGroupRuleRuleInfo(EnterpriseSecurityGroupRuleRuleInfo source) {
        if (source.OrderIndex != null) {
            this.OrderIndex = new Long(source.OrderIndex);
        }
        if (source.RuleUuid != null) {
            this.RuleUuid = new Long(source.RuleUuid);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
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
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Detail != null) {
            this.Detail = new String(source.Detail);
        }
        if (source.AclTags != null) {
            this.AclTags = new String(source.AclTags);
        }
        if (source.IsNew != null) {
            this.IsNew = new Long(source.IsNew);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.IsDelay != null) {
            this.IsDelay = new Long(source.IsDelay);
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
        if (source.BetaList != null) {
            this.BetaList = new EnterpriseSecurityGroupRuleBetaInfo[source.BetaList.length];
            for (int i = 0; i < source.BetaList.length; i++) {
                this.BetaList[i] = new EnterpriseSecurityGroupRuleBetaInfo(source.BetaList[i]);
            }
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrderIndex", this.OrderIndex);
        this.setParamSimple(map, prefix + "RuleUuid", this.RuleUuid);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "SourceId", this.SourceId);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "TargetId", this.TargetId);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Strategy", this.Strategy);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Detail", this.Detail);
        this.setParamSimple(map, prefix + "AclTags", this.AclTags);
        this.setParamSimple(map, prefix + "IsNew", this.IsNew);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "IsDelay", this.IsDelay);
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
        this.setParamArrayObj(map, prefix + "BetaList.", this.BetaList);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

