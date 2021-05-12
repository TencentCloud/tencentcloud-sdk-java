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
package com.tencentcloudapi.ssa.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetDetail extends AbstractModel{

    /**
    * 资产类型
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * 名字
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 区域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 所属网络
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 主机类型
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 主机状态
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
    * 主机IP-公网
    */
    @SerializedName("PublicIpAddresses")
    @Expose
    private String [] PublicIpAddresses;

    /**
    * 引擎版本
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * 标识
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 标签
    */
    @SerializedName("Tag")
    @Expose
    private Tag [] Tag;

    /**
    * 内网IP地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 负载均衡示例的vip列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LoadBalancerVips")
    @Expose
    private String [] LoadBalancerVips;

    /**
    * 账号ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreationDate")
    @Expose
    private String CreationDate;

    /**
    * 访问域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 资产唯一id
    */
    @SerializedName("AssetUniqid")
    @Expose
    private String AssetUniqid;

    /**
    * 关联实例
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 配置硬盘类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 配置硬盘大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 云硬盘/证书状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetStatus")
    @Expose
    private String AssetStatus;

    /**
    * 证书类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertType")
    @Expose
    private String CertType;

    /**
    * 所属项目
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 到期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertEndTime")
    @Expose
    private String CertEndTime;

    /**
    * nosql引擎/版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductType")
    @Expose
    private Long ProductType;

    /**
    * 主机IP-内网
    */
    @SerializedName("PrivateIpAddresses")
    @Expose
    private String [] PrivateIpAddresses;

    /**
    * 证书有效期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValidityPeriod")
    @Expose
    private String ValidityPeriod;

    /**
    * 分组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 端口服务数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private String [] Port;

    /**
    * 配置风险数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskConfig")
    @Expose
    private String [] RiskConfig;

    /**
    * 相关待处理事件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Event")
    @Expose
    private String Event;

    /**
    * 相关待处理漏洞
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vul")
    @Expose
    private String Vul;

    /**
    * 资产发现时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SsaAssetDiscoverTime")
    @Expose
    private String SsaAssetDiscoverTime;

    /**
    * 所属子网
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetSubnetId")
    @Expose
    private String AssetSubnetId;

    /**
    * 子网名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetSubnetName")
    @Expose
    private String AssetSubnetName;

    /**
    * vpc名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetVpcName")
    @Expose
    private String AssetVpcName;

    /**
    * 集群类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterType")
    @Expose
    private Long ClusterType;

    /**
    * 命名空间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NameSpace")
    @Expose
    private String NameSpace;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetCreateTime")
    @Expose
    private String AssetCreateTime;

    /**
    * 负载均衡网络类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LoadBalancerType")
    @Expose
    private String LoadBalancerType;

    /**
    * ipv6信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetIpv6")
    @Expose
    private String [] AssetIpv6;

    /**
    * ssh风险
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SSHRisk")
    @Expose
    private String SSHRisk;

    /**
    * rdp风险
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RDPRisk")
    @Expose
    private String RDPRisk;

    /**
    * 安全事件风险
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventRisk")
    @Expose
    private String EventRisk;

    /**
    * 漏洞数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetVulNum")
    @Expose
    private Long AssetVulNum;

    /**
     * Get 资产类型 
     * @return AssetType 资产类型
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set 资产类型
     * @param AssetType 资产类型
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get 名字 
     * @return Name 名字
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名字
     * @param Name 名字
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 区域 
     * @return Region 区域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 区域
     * @param Region 区域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 所属网络 
     * @return VpcId 所属网络
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 所属网络
     * @param VpcId 所属网络
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 主机类型 
     * @return InstanceType 主机类型
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 主机类型
     * @param InstanceType 主机类型
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 主机状态 
     * @return InstanceState 主机状态
     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set 主机状态
     * @param InstanceState 主机状态
     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    /**
     * Get 主机IP-公网 
     * @return PublicIpAddresses 主机IP-公网
     */
    public String [] getPublicIpAddresses() {
        return this.PublicIpAddresses;
    }

    /**
     * Set 主机IP-公网
     * @param PublicIpAddresses 主机IP-公网
     */
    public void setPublicIpAddresses(String [] PublicIpAddresses) {
        this.PublicIpAddresses = PublicIpAddresses;
    }

    /**
     * Get 引擎版本 
     * @return EngineVersion 引擎版本
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set 引擎版本
     * @param EngineVersion 引擎版本
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get 标识 
     * @return Id 标识
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 标识
     * @param Id 标识
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 标签 
     * @return Tag 标签
     */
    public Tag [] getTag() {
        return this.Tag;
    }

    /**
     * Set 标签
     * @param Tag 标签
     */
    public void setTag(Tag [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get 内网IP地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vip 内网IP地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 内网IP地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vip 内网IP地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 负载均衡示例的vip列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LoadBalancerVips 负载均衡示例的vip列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getLoadBalancerVips() {
        return this.LoadBalancerVips;
    }

    /**
     * Set 负载均衡示例的vip列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param LoadBalancerVips 负载均衡示例的vip列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLoadBalancerVips(String [] LoadBalancerVips) {
        this.LoadBalancerVips = LoadBalancerVips;
    }

    /**
     * Get 账号ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uin 账号ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set 账号ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uin 账号ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreationDate 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreationDate() {
        return this.CreationDate;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreationDate 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreationDate(String CreationDate) {
        this.CreationDate = CreationDate;
    }

    /**
     * Get 访问域名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Domain 访问域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 访问域名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Domain 访问域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 资产唯一id 
     * @return AssetUniqid 资产唯一id
     */
    public String getAssetUniqid() {
        return this.AssetUniqid;
    }

    /**
     * Set 资产唯一id
     * @param AssetUniqid 资产唯一id
     */
    public void setAssetUniqid(String AssetUniqid) {
        this.AssetUniqid = AssetUniqid;
    }

    /**
     * Get 关联实例
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 关联实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 关联实例
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 关联实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 配置硬盘类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskType 配置硬盘类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 配置硬盘类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskType 配置硬盘类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 配置硬盘大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskSize 配置硬盘大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 配置硬盘大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskSize 配置硬盘大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 云硬盘/证书状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetStatus 云硬盘/证书状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetStatus() {
        return this.AssetStatus;
    }

    /**
     * Set 云硬盘/证书状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetStatus 云硬盘/证书状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetStatus(String AssetStatus) {
        this.AssetStatus = AssetStatus;
    }

    /**
     * Get 证书类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CertType 证书类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCertType() {
        return this.CertType;
    }

    /**
     * Set 证书类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param CertType 证书类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertType(String CertType) {
        this.CertType = CertType;
    }

    /**
     * Get 所属项目
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectName 所属项目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 所属项目
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectName 所属项目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 到期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CertEndTime 到期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCertEndTime() {
        return this.CertEndTime;
    }

    /**
     * Set 到期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CertEndTime 到期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertEndTime(String CertEndTime) {
        this.CertEndTime = CertEndTime;
    }

    /**
     * Get nosql引擎/版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductType nosql引擎/版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProductType() {
        return this.ProductType;
    }

    /**
     * Set nosql引擎/版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductType nosql引擎/版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductType(Long ProductType) {
        this.ProductType = ProductType;
    }

    /**
     * Get 主机IP-内网 
     * @return PrivateIpAddresses 主机IP-内网
     */
    public String [] getPrivateIpAddresses() {
        return this.PrivateIpAddresses;
    }

    /**
     * Set 主机IP-内网
     * @param PrivateIpAddresses 主机IP-内网
     */
    public void setPrivateIpAddresses(String [] PrivateIpAddresses) {
        this.PrivateIpAddresses = PrivateIpAddresses;
    }

    /**
     * Get 证书有效期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ValidityPeriod 证书有效期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValidityPeriod() {
        return this.ValidityPeriod;
    }

    /**
     * Set 证书有效期
注意：此字段可能返回 null，表示取不到有效值。
     * @param ValidityPeriod 证书有效期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValidityPeriod(String ValidityPeriod) {
        this.ValidityPeriod = ValidityPeriod;
    }

    /**
     * Get 分组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupName 分组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 分组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupName 分组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 端口服务数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port 端口服务数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getPort() {
        return this.Port;
    }

    /**
     * Set 端口服务数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port 端口服务数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(String [] Port) {
        this.Port = Port;
    }

    /**
     * Get 配置风险数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskConfig 配置风险数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getRiskConfig() {
        return this.RiskConfig;
    }

    /**
     * Set 配置风险数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskConfig 配置风险数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskConfig(String [] RiskConfig) {
        this.RiskConfig = RiskConfig;
    }

    /**
     * Get 相关待处理事件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Event 相关待处理事件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEvent() {
        return this.Event;
    }

    /**
     * Set 相关待处理事件
注意：此字段可能返回 null，表示取不到有效值。
     * @param Event 相关待处理事件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEvent(String Event) {
        this.Event = Event;
    }

    /**
     * Get 相关待处理漏洞
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vul 相关待处理漏洞
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVul() {
        return this.Vul;
    }

    /**
     * Set 相关待处理漏洞
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vul 相关待处理漏洞
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVul(String Vul) {
        this.Vul = Vul;
    }

    /**
     * Get 资产发现时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SsaAssetDiscoverTime 资产发现时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSsaAssetDiscoverTime() {
        return this.SsaAssetDiscoverTime;
    }

    /**
     * Set 资产发现时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param SsaAssetDiscoverTime 资产发现时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSsaAssetDiscoverTime(String SsaAssetDiscoverTime) {
        this.SsaAssetDiscoverTime = SsaAssetDiscoverTime;
    }

    /**
     * Get 所属子网
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetSubnetId 所属子网
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetSubnetId() {
        return this.AssetSubnetId;
    }

    /**
     * Set 所属子网
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetSubnetId 所属子网
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetSubnetId(String AssetSubnetId) {
        this.AssetSubnetId = AssetSubnetId;
    }

    /**
     * Get 子网名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetSubnetName 子网名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetSubnetName() {
        return this.AssetSubnetName;
    }

    /**
     * Set 子网名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetSubnetName 子网名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetSubnetName(String AssetSubnetName) {
        this.AssetSubnetName = AssetSubnetName;
    }

    /**
     * Get vpc名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetVpcName vpc名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetVpcName() {
        return this.AssetVpcName;
    }

    /**
     * Set vpc名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetVpcName vpc名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetVpcName(String AssetVpcName) {
        this.AssetVpcName = AssetVpcName;
    }

    /**
     * Get 集群类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterType 集群类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 集群类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterType 集群类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterType(Long ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get 命名空间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NameSpace 命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNameSpace() {
        return this.NameSpace;
    }

    /**
     * Set 命名空间
注意：此字段可能返回 null，表示取不到有效值。
     * @param NameSpace 命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNameSpace(String NameSpace) {
        this.NameSpace = NameSpace;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetCreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetCreateTime() {
        return this.AssetCreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetCreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetCreateTime(String AssetCreateTime) {
        this.AssetCreateTime = AssetCreateTime;
    }

    /**
     * Get 负载均衡网络类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LoadBalancerType 负载均衡网络类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLoadBalancerType() {
        return this.LoadBalancerType;
    }

    /**
     * Set 负载均衡网络类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param LoadBalancerType 负载均衡网络类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLoadBalancerType(String LoadBalancerType) {
        this.LoadBalancerType = LoadBalancerType;
    }

    /**
     * Get ipv6信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetIpv6 ipv6信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAssetIpv6() {
        return this.AssetIpv6;
    }

    /**
     * Set ipv6信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetIpv6 ipv6信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetIpv6(String [] AssetIpv6) {
        this.AssetIpv6 = AssetIpv6;
    }

    /**
     * Get ssh风险
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SSHRisk ssh风险
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSSHRisk() {
        return this.SSHRisk;
    }

    /**
     * Set ssh风险
注意：此字段可能返回 null，表示取不到有效值。
     * @param SSHRisk ssh风险
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSSHRisk(String SSHRisk) {
        this.SSHRisk = SSHRisk;
    }

    /**
     * Get rdp风险
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RDPRisk rdp风险
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRDPRisk() {
        return this.RDPRisk;
    }

    /**
     * Set rdp风险
注意：此字段可能返回 null，表示取不到有效值。
     * @param RDPRisk rdp风险
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRDPRisk(String RDPRisk) {
        this.RDPRisk = RDPRisk;
    }

    /**
     * Get 安全事件风险
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventRisk 安全事件风险
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventRisk() {
        return this.EventRisk;
    }

    /**
     * Set 安全事件风险
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventRisk 安全事件风险
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventRisk(String EventRisk) {
        this.EventRisk = EventRisk;
    }

    /**
     * Get 漏洞数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetVulNum 漏洞数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAssetVulNum() {
        return this.AssetVulNum;
    }

    /**
     * Set 漏洞数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetVulNum 漏洞数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetVulNum(Long AssetVulNum) {
        this.AssetVulNum = AssetVulNum;
    }

    public AssetDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetDetail(AssetDetail source) {
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceState != null) {
            this.InstanceState = new String(source.InstanceState);
        }
        if (source.PublicIpAddresses != null) {
            this.PublicIpAddresses = new String[source.PublicIpAddresses.length];
            for (int i = 0; i < source.PublicIpAddresses.length; i++) {
                this.PublicIpAddresses[i] = new String(source.PublicIpAddresses[i]);
            }
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new String(source.EngineVersion);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Tag != null) {
            this.Tag = new Tag[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new Tag(source.Tag[i]);
            }
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.LoadBalancerVips != null) {
            this.LoadBalancerVips = new String[source.LoadBalancerVips.length];
            for (int i = 0; i < source.LoadBalancerVips.length; i++) {
                this.LoadBalancerVips[i] = new String(source.LoadBalancerVips[i]);
            }
        }
        if (source.Uin != null) {
            this.Uin = new Long(source.Uin);
        }
        if (source.CreationDate != null) {
            this.CreationDate = new String(source.CreationDate);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.AssetUniqid != null) {
            this.AssetUniqid = new String(source.AssetUniqid);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.AssetStatus != null) {
            this.AssetStatus = new String(source.AssetStatus);
        }
        if (source.CertType != null) {
            this.CertType = new String(source.CertType);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.CertEndTime != null) {
            this.CertEndTime = new String(source.CertEndTime);
        }
        if (source.ProductType != null) {
            this.ProductType = new Long(source.ProductType);
        }
        if (source.PrivateIpAddresses != null) {
            this.PrivateIpAddresses = new String[source.PrivateIpAddresses.length];
            for (int i = 0; i < source.PrivateIpAddresses.length; i++) {
                this.PrivateIpAddresses[i] = new String(source.PrivateIpAddresses[i]);
            }
        }
        if (source.ValidityPeriod != null) {
            this.ValidityPeriod = new String(source.ValidityPeriod);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.Port != null) {
            this.Port = new String[source.Port.length];
            for (int i = 0; i < source.Port.length; i++) {
                this.Port[i] = new String(source.Port[i]);
            }
        }
        if (source.RiskConfig != null) {
            this.RiskConfig = new String[source.RiskConfig.length];
            for (int i = 0; i < source.RiskConfig.length; i++) {
                this.RiskConfig[i] = new String(source.RiskConfig[i]);
            }
        }
        if (source.Event != null) {
            this.Event = new String(source.Event);
        }
        if (source.Vul != null) {
            this.Vul = new String(source.Vul);
        }
        if (source.SsaAssetDiscoverTime != null) {
            this.SsaAssetDiscoverTime = new String(source.SsaAssetDiscoverTime);
        }
        if (source.AssetSubnetId != null) {
            this.AssetSubnetId = new String(source.AssetSubnetId);
        }
        if (source.AssetSubnetName != null) {
            this.AssetSubnetName = new String(source.AssetSubnetName);
        }
        if (source.AssetVpcName != null) {
            this.AssetVpcName = new String(source.AssetVpcName);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new Long(source.ClusterType);
        }
        if (source.NameSpace != null) {
            this.NameSpace = new String(source.NameSpace);
        }
        if (source.AssetCreateTime != null) {
            this.AssetCreateTime = new String(source.AssetCreateTime);
        }
        if (source.LoadBalancerType != null) {
            this.LoadBalancerType = new String(source.LoadBalancerType);
        }
        if (source.AssetIpv6 != null) {
            this.AssetIpv6 = new String[source.AssetIpv6.length];
            for (int i = 0; i < source.AssetIpv6.length; i++) {
                this.AssetIpv6[i] = new String(source.AssetIpv6[i]);
            }
        }
        if (source.SSHRisk != null) {
            this.SSHRisk = new String(source.SSHRisk);
        }
        if (source.RDPRisk != null) {
            this.RDPRisk = new String(source.RDPRisk);
        }
        if (source.EventRisk != null) {
            this.EventRisk = new String(source.EventRisk);
        }
        if (source.AssetVulNum != null) {
            this.AssetVulNum = new Long(source.AssetVulNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceState", this.InstanceState);
        this.setParamArraySimple(map, prefix + "PublicIpAddresses.", this.PublicIpAddresses);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "LoadBalancerVips.", this.LoadBalancerVips);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "CreationDate", this.CreationDate);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "AssetUniqid", this.AssetUniqid);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "AssetStatus", this.AssetStatus);
        this.setParamSimple(map, prefix + "CertType", this.CertType);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "CertEndTime", this.CertEndTime);
        this.setParamSimple(map, prefix + "ProductType", this.ProductType);
        this.setParamArraySimple(map, prefix + "PrivateIpAddresses.", this.PrivateIpAddresses);
        this.setParamSimple(map, prefix + "ValidityPeriod", this.ValidityPeriod);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamArraySimple(map, prefix + "Port.", this.Port);
        this.setParamArraySimple(map, prefix + "RiskConfig.", this.RiskConfig);
        this.setParamSimple(map, prefix + "Event", this.Event);
        this.setParamSimple(map, prefix + "Vul", this.Vul);
        this.setParamSimple(map, prefix + "SsaAssetDiscoverTime", this.SsaAssetDiscoverTime);
        this.setParamSimple(map, prefix + "AssetSubnetId", this.AssetSubnetId);
        this.setParamSimple(map, prefix + "AssetSubnetName", this.AssetSubnetName);
        this.setParamSimple(map, prefix + "AssetVpcName", this.AssetVpcName);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "NameSpace", this.NameSpace);
        this.setParamSimple(map, prefix + "AssetCreateTime", this.AssetCreateTime);
        this.setParamSimple(map, prefix + "LoadBalancerType", this.LoadBalancerType);
        this.setParamArraySimple(map, prefix + "AssetIpv6.", this.AssetIpv6);
        this.setParamSimple(map, prefix + "SSHRisk", this.SSHRisk);
        this.setParamSimple(map, prefix + "RDPRisk", this.RDPRisk);
        this.setParamSimple(map, prefix + "EventRisk", this.EventRisk);
        this.setParamSimple(map, prefix + "AssetVulNum", this.AssetVulNum);

    }
}

