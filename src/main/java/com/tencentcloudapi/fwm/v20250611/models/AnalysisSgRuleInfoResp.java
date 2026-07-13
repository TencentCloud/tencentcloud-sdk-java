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
    * <p>规则id  等同RuleUuid</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>规则Id</p>
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * <p>排序</p>
    */
    @SerializedName("OrderIndex")
    @Expose
    private Long OrderIndex;

    /**
    * <p>云防排序</p>
    */
    @SerializedName("CfwOrderIndex")
    @Expose
    private Long CfwOrderIndex;

    /**
    * <p>源规则内容</p>
    */
    @SerializedName("SourceId")
    @Expose
    private String SourceId;

    /**
    * <p>源规则类型<br>取值范围 0/1/2/3/4/5/6/7/8/9<br>0表示ip(net),<br>1表示VPC实例(instance)<br>2表示子网实例(instance)<br>3表示CVM实例(instance)<br>4表示CLB实例(instance)<br>5表示ENI实例(instance)<br>6表示数据库实例(instance)<br>7表示模板(template)<br>8表示标签(tag)<br>9表示地域(region)</p><p>枚举值：</p><ul><li>0： IP / CIDR</li><li>1： VPC 实例</li><li>2： 子网 </li><li>3： CVM 实例</li><li>4： CLB 实例</li><li>5： ENI（弹性网卡）实例</li><li>6： CDB（云数据库）实例</li><li>7： 参数模板</li><li>8： 标签</li><li>9： 地域</li></ul>
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
    * <p>目的规则类型<br>取值范围 0/1/2/3/4/5/6/7/8/9/100<br>0表示ip(net),<br>1表示VPC实例(instance)<br>2表示子网实例(instance)<br>3表示CVM实例(instance)<br>4表示CLB实例(instance)<br>5表示ENI实例(instance)<br>6表示数据库实例(instance)<br>7表示模板(template)<br>8表示标签(tag)<br>9表示地域(region)<br>100表示资产分组(resourcegroup)</p><p>枚举值：</p><ul><li>0： IP / CIDR</li><li>1： VPC 实例</li><li>2： 子网 </li><li>3： CVM 实例</li><li>4： CLB 实例</li><li>5： ENI（弹性网卡）实例</li><li>6： CDB（云数据库）实例</li><li>7： 参数模板</li><li>8： 标签</li><li>9： 地域</li></ul>
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
    * <p>规则策略<br>取值范围:1/2<br>1:阻断<br>2:放行</p>
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
    * <p>分区：<br>1防火墙管理最前分区<br>2是云防规则<br>3防火墙管理最后分区</p>
    */
    @SerializedName("RulePartition")
    @Expose
    private Long RulePartition;

    /**
    * <p>规则组Id</p>
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * <p>规则组名称</p>
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>规则组内规则id</p>
    */
    @SerializedName("GroupRuleId")
    @Expose
    private String GroupRuleId;

    /**
    * <p>策略Id</p>
    */
    @SerializedName("StrategyId")
    @Expose
    private String StrategyId;

    /**
    * <p>ip类型</p>
    */
    @SerializedName("IpVersion")
    @Expose
    private String IpVersion;

    /**
    * <p>成员信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BelongMember")
    @Expose
    private MemberInfo BelongMember;

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
     * Get <p>规则Id</p> 
     * @return RuleId <p>规则Id</p>
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>规则Id</p>
     * @param RuleId <p>规则Id</p>
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

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
     * Get <p>云防排序</p> 
     * @return CfwOrderIndex <p>云防排序</p>
     */
    public Long getCfwOrderIndex() {
        return this.CfwOrderIndex;
    }

    /**
     * Set <p>云防排序</p>
     * @param CfwOrderIndex <p>云防排序</p>
     */
    public void setCfwOrderIndex(Long CfwOrderIndex) {
        this.CfwOrderIndex = CfwOrderIndex;
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
     * Get <p>源规则类型<br>取值范围 0/1/2/3/4/5/6/7/8/9<br>0表示ip(net),<br>1表示VPC实例(instance)<br>2表示子网实例(instance)<br>3表示CVM实例(instance)<br>4表示CLB实例(instance)<br>5表示ENI实例(instance)<br>6表示数据库实例(instance)<br>7表示模板(template)<br>8表示标签(tag)<br>9表示地域(region)</p><p>枚举值：</p><ul><li>0： IP / CIDR</li><li>1： VPC 实例</li><li>2： 子网 </li><li>3： CVM 实例</li><li>4： CLB 实例</li><li>5： ENI（弹性网卡）实例</li><li>6： CDB（云数据库）实例</li><li>7： 参数模板</li><li>8： 标签</li><li>9： 地域</li></ul> 
     * @return SourceType <p>源规则类型<br>取值范围 0/1/2/3/4/5/6/7/8/9<br>0表示ip(net),<br>1表示VPC实例(instance)<br>2表示子网实例(instance)<br>3表示CVM实例(instance)<br>4表示CLB实例(instance)<br>5表示ENI实例(instance)<br>6表示数据库实例(instance)<br>7表示模板(template)<br>8表示标签(tag)<br>9表示地域(region)</p><p>枚举值：</p><ul><li>0： IP / CIDR</li><li>1： VPC 实例</li><li>2： 子网 </li><li>3： CVM 实例</li><li>4： CLB 实例</li><li>5： ENI（弹性网卡）实例</li><li>6： CDB（云数据库）实例</li><li>7： 参数模板</li><li>8： 标签</li><li>9： 地域</li></ul>
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set <p>源规则类型<br>取值范围 0/1/2/3/4/5/6/7/8/9<br>0表示ip(net),<br>1表示VPC实例(instance)<br>2表示子网实例(instance)<br>3表示CVM实例(instance)<br>4表示CLB实例(instance)<br>5表示ENI实例(instance)<br>6表示数据库实例(instance)<br>7表示模板(template)<br>8表示标签(tag)<br>9表示地域(region)</p><p>枚举值：</p><ul><li>0： IP / CIDR</li><li>1： VPC 实例</li><li>2： 子网 </li><li>3： CVM 实例</li><li>4： CLB 实例</li><li>5： ENI（弹性网卡）实例</li><li>6： CDB（云数据库）实例</li><li>7： 参数模板</li><li>8： 标签</li><li>9： 地域</li></ul>
     * @param SourceType <p>源规则类型<br>取值范围 0/1/2/3/4/5/6/7/8/9<br>0表示ip(net),<br>1表示VPC实例(instance)<br>2表示子网实例(instance)<br>3表示CVM实例(instance)<br>4表示CLB实例(instance)<br>5表示ENI实例(instance)<br>6表示数据库实例(instance)<br>7表示模板(template)<br>8表示标签(tag)<br>9表示地域(region)</p><p>枚举值：</p><ul><li>0： IP / CIDR</li><li>1： VPC 实例</li><li>2： 子网 </li><li>3： CVM 实例</li><li>4： CLB 实例</li><li>5： ENI（弹性网卡）实例</li><li>6： CDB（云数据库）实例</li><li>7： 参数模板</li><li>8： 标签</li><li>9： 地域</li></ul>
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
     * Get <p>目的规则类型<br>取值范围 0/1/2/3/4/5/6/7/8/9/100<br>0表示ip(net),<br>1表示VPC实例(instance)<br>2表示子网实例(instance)<br>3表示CVM实例(instance)<br>4表示CLB实例(instance)<br>5表示ENI实例(instance)<br>6表示数据库实例(instance)<br>7表示模板(template)<br>8表示标签(tag)<br>9表示地域(region)<br>100表示资产分组(resourcegroup)</p><p>枚举值：</p><ul><li>0： IP / CIDR</li><li>1： VPC 实例</li><li>2： 子网 </li><li>3： CVM 实例</li><li>4： CLB 实例</li><li>5： ENI（弹性网卡）实例</li><li>6： CDB（云数据库）实例</li><li>7： 参数模板</li><li>8： 标签</li><li>9： 地域</li></ul> 
     * @return TargetType <p>目的规则类型<br>取值范围 0/1/2/3/4/5/6/7/8/9/100<br>0表示ip(net),<br>1表示VPC实例(instance)<br>2表示子网实例(instance)<br>3表示CVM实例(instance)<br>4表示CLB实例(instance)<br>5表示ENI实例(instance)<br>6表示数据库实例(instance)<br>7表示模板(template)<br>8表示标签(tag)<br>9表示地域(region)<br>100表示资产分组(resourcegroup)</p><p>枚举值：</p><ul><li>0： IP / CIDR</li><li>1： VPC 实例</li><li>2： 子网 </li><li>3： CVM 实例</li><li>4： CLB 实例</li><li>5： ENI（弹性网卡）实例</li><li>6： CDB（云数据库）实例</li><li>7： 参数模板</li><li>8： 标签</li><li>9： 地域</li></ul>
     */
    public Long getTargetType() {
        return this.TargetType;
    }

    /**
     * Set <p>目的规则类型<br>取值范围 0/1/2/3/4/5/6/7/8/9/100<br>0表示ip(net),<br>1表示VPC实例(instance)<br>2表示子网实例(instance)<br>3表示CVM实例(instance)<br>4表示CLB实例(instance)<br>5表示ENI实例(instance)<br>6表示数据库实例(instance)<br>7表示模板(template)<br>8表示标签(tag)<br>9表示地域(region)<br>100表示资产分组(resourcegroup)</p><p>枚举值：</p><ul><li>0： IP / CIDR</li><li>1： VPC 实例</li><li>2： 子网 </li><li>3： CVM 实例</li><li>4： CLB 实例</li><li>5： ENI（弹性网卡）实例</li><li>6： CDB（云数据库）实例</li><li>7： 参数模板</li><li>8： 标签</li><li>9： 地域</li></ul>
     * @param TargetType <p>目的规则类型<br>取值范围 0/1/2/3/4/5/6/7/8/9/100<br>0表示ip(net),<br>1表示VPC实例(instance)<br>2表示子网实例(instance)<br>3表示CVM实例(instance)<br>4表示CLB实例(instance)<br>5表示ENI实例(instance)<br>6表示数据库实例(instance)<br>7表示模板(template)<br>8表示标签(tag)<br>9表示地域(region)<br>100表示资产分组(resourcegroup)</p><p>枚举值：</p><ul><li>0： IP / CIDR</li><li>1： VPC 实例</li><li>2： 子网 </li><li>3： CVM 实例</li><li>4： CLB 实例</li><li>5： ENI（弹性网卡）实例</li><li>6： CDB（云数据库）实例</li><li>7： 参数模板</li><li>8： 标签</li><li>9： 地域</li></ul>
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
     * Get <p>规则策略<br>取值范围:1/2<br>1:阻断<br>2:放行</p> 
     * @return Strategy <p>规则策略<br>取值范围:1/2<br>1:阻断<br>2:放行</p>
     */
    public Long getStrategy() {
        return this.Strategy;
    }

    /**
     * Set <p>规则策略<br>取值范围:1/2<br>1:阻断<br>2:放行</p>
     * @param Strategy <p>规则策略<br>取值范围:1/2<br>1:阻断<br>2:放行</p>
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
     * Get <p>分区：<br>1防火墙管理最前分区<br>2是云防规则<br>3防火墙管理最后分区</p> 
     * @return RulePartition <p>分区：<br>1防火墙管理最前分区<br>2是云防规则<br>3防火墙管理最后分区</p>
     */
    public Long getRulePartition() {
        return this.RulePartition;
    }

    /**
     * Set <p>分区：<br>1防火墙管理最前分区<br>2是云防规则<br>3防火墙管理最后分区</p>
     * @param RulePartition <p>分区：<br>1防火墙管理最前分区<br>2是云防规则<br>3防火墙管理最后分区</p>
     */
    public void setRulePartition(Long RulePartition) {
        this.RulePartition = RulePartition;
    }

    /**
     * Get <p>规则组Id</p> 
     * @return GroupId <p>规则组Id</p>
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>规则组Id</p>
     * @param GroupId <p>规则组Id</p>
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>规则组名称</p> 
     * @return GroupName <p>规则组名称</p>
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set <p>规则组名称</p>
     * @param GroupName <p>规则组名称</p>
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get <p>规则组内规则id</p> 
     * @return GroupRuleId <p>规则组内规则id</p>
     */
    public String getGroupRuleId() {
        return this.GroupRuleId;
    }

    /**
     * Set <p>规则组内规则id</p>
     * @param GroupRuleId <p>规则组内规则id</p>
     */
    public void setGroupRuleId(String GroupRuleId) {
        this.GroupRuleId = GroupRuleId;
    }

    /**
     * Get <p>策略Id</p> 
     * @return StrategyId <p>策略Id</p>
     */
    public String getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set <p>策略Id</p>
     * @param StrategyId <p>策略Id</p>
     */
    public void setStrategyId(String StrategyId) {
        this.StrategyId = StrategyId;
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
     * Get <p>成员信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BelongMember <p>成员信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MemberInfo getBelongMember() {
        return this.BelongMember;
    }

    /**
     * Set <p>成员信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BelongMember <p>成员信息</p>
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

