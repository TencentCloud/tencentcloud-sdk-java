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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Resource extends AbstractModel {

    /**
    * 服务实例ID，如bh-saas-s3ed4r5e
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 地域编码
    */
    @SerializedName("ApCode")
    @Expose
    private String ApCode;

    /**
    * 服务实例规格信息
    */
    @SerializedName("SvArgs")
    @Expose
    private String SvArgs;

    /**
    * VPC ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 服务规格对应的资产数
    */
    @SerializedName("Nodes")
    @Expose
    private Long Nodes;

    /**
    * 自动续费标记，0 - 表示默认状态，1 - 表示自动续费，2 - 表示明确不自动续费
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * 过期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 资源状态，0 - 未初始化，1 - 正常，2 - 隔离，3 - 销毁，4 - 初始化失败，5 - 初始化中
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 服务实例名，如T-Sec-堡垒机（SaaS型）
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * 定价模型ID
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * 资源创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 商品码, p_cds_dasb
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * 子商品码, sp_cds_dasb_bh_saas
    */
    @SerializedName("SubProductCode")
    @Expose
    private String SubProductCode;

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 是否过期，true-过期，false-未过期
    */
    @SerializedName("Expired")
    @Expose
    private Boolean Expired;

    /**
    * 是否开通，true-开通，false-未开通
    */
    @SerializedName("Deployed")
    @Expose
    private Boolean Deployed;

    /**
    * 开通服务的 VPC 名称
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * 开通服务的 VPC 对应的网段
    */
    @SerializedName("VpcCidrBlock")
    @Expose
    private String VpcCidrBlock;

    /**
    * 开通服务的子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 开通服务的子网名称
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * 开通服务的子网网段
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * 外部IP
    */
    @SerializedName("PublicIpSet")
    @Expose
    private String [] PublicIpSet;

    /**
    * 内部IP
    */
    @SerializedName("PrivateIpSet")
    @Expose
    private String [] PrivateIpSet;

    /**
    * 服务开通的高级功能列表，如:[DB]
    */
    @SerializedName("ModuleSet")
    @Expose
    private String [] ModuleSet;

    /**
    * 已使用的授权点数
    */
    @SerializedName("UsedNodes")
    @Expose
    private Long UsedNodes;

    /**
    * 扩展点数
    */
    @SerializedName("ExtendPoints")
    @Expose
    private Long ExtendPoints;

    /**
    * 带宽扩展包个数(4M)
    */
    @SerializedName("PackageBandwidth")
    @Expose
    private Long PackageBandwidth;

    /**
    * 授权点数扩展包个数(50点)
    */
    @SerializedName("PackageNode")
    @Expose
    private Long PackageNode;

    /**
    * 日志投递规格信息
    */
    @SerializedName("LogDeliveryArgs")
    @Expose
    private String LogDeliveryArgs;

    /**
    * 堡垒机资源LB	
    */
    @SerializedName("ClbSet")
    @Expose
    private Clb [] ClbSet;

    /**
    * 网络域个数
    */
    @SerializedName("DomainCount")
    @Expose
    private Long DomainCount;

    /**
    * 已经使用的网络域个数
    */
    @SerializedName("UsedDomainCount")
    @Expose
    private Long UsedDomainCount;

    /**
    * 0 非试用版，1 试用版
    */
    @SerializedName("Trial")
    @Expose
    private Long Trial;

    /**
    * 日志投递规格信息
    */
    @SerializedName("LogDelivery")
    @Expose
    private String LogDelivery;

    /**
    * cdc集群id
    */
    @SerializedName("CdcClusterId")
    @Expose
    private String CdcClusterId;

    /**
    * 部署模式 默认0 0-cvm 1-tke
    */
    @SerializedName("DeployModel")
    @Expose
    private Long DeployModel;

    /**
    * 0 默认值，非内网访问，1 内网访问，2 内网访问开通中，3 内网访问关闭中
    */
    @SerializedName("IntranetAccess")
    @Expose
    private Long IntranetAccess;

    /**
    * 内网访问的ip
    */
    @SerializedName("IntranetPrivateIpSet")
    @Expose
    private String [] IntranetPrivateIpSet;

    /**
    * 开通内网访问的vpc
    */
    @SerializedName("IntranetVpcId")
    @Expose
    private String IntranetVpcId;

    /**
    * 开通内网访问的subnetId
    */
    @SerializedName("IntranetSubnetId")
    @Expose
    private String IntranetSubnetId;

    /**
    * 开通内网访问vpc的网段
    */
    @SerializedName("IntranetVpcCidr")
    @Expose
    private String IntranetVpcCidr;

    /**
    * 堡垒机内网ip自定义域名
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 是否共享clb，true-共享clb，false-独享clb
    */
    @SerializedName("ShareClb")
    @Expose
    private Boolean ShareClb;

    /**
    * 共享clb id
    */
    @SerializedName("OpenClbId")
    @Expose
    private String OpenClbId;

    /**
    * 运营商信息
    */
    @SerializedName("LbVipIsp")
    @Expose
    private String LbVipIsp;

    /**
    * linux资产命令行运维端口
    */
    @SerializedName("TUICmdPort")
    @Expose
    private Long TUICmdPort;

    /**
    * linux资产直连端口
    */
    @SerializedName("TUIDirectPort")
    @Expose
    private Long TUIDirectPort;

    /**
    * 1 默认值，web访问开启，0 web访问关闭，2 web访问开通中，3 web访问关闭中
    */
    @SerializedName("WebAccess")
    @Expose
    private Long WebAccess;

    /**
    * 1 默认值，客户单访问开启，0 客户端访问关闭，2 客户端访问开通中，3 客户端访问关闭中
    */
    @SerializedName("ClientAccess")
    @Expose
    private Long ClientAccess;

    /**
    * 1 默认值，外网访问开启，0 外网访问关闭，2 外网访问开通中，3 外网访问关闭中
    */
    @SerializedName("ExternalAccess")
    @Expose
    private Long ExternalAccess;

    /**
    * 0默认值。0-免费版（试用版）ioa，1-付费版ioa
    */
    @SerializedName("IOAResource")
    @Expose
    private Long IOAResource;

    /**
    * 零信任堡垒机用户扩展包个数。1个扩展包对应20个用户数
    */
    @SerializedName("PackageIOAUserCount")
    @Expose
    private Long PackageIOAUserCount;

    /**
    *  零信任堡垒机带宽扩展包个数。一个扩展包表示4M带宽
    */
    @SerializedName("PackageIOABandwidth")
    @Expose
    private Long PackageIOABandwidth;

    /**
    * 堡垒机实例对应的零信任实例id
    */
    @SerializedName("IOAResourceId")
    @Expose
    private String IOAResourceId;

    /**
     * Get 服务实例ID，如bh-saas-s3ed4r5e 
     * @return ResourceId 服务实例ID，如bh-saas-s3ed4r5e
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 服务实例ID，如bh-saas-s3ed4r5e
     * @param ResourceId 服务实例ID，如bh-saas-s3ed4r5e
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 地域编码 
     * @return ApCode 地域编码
     */
    public String getApCode() {
        return this.ApCode;
    }

    /**
     * Set 地域编码
     * @param ApCode 地域编码
     */
    public void setApCode(String ApCode) {
        this.ApCode = ApCode;
    }

    /**
     * Get 服务实例规格信息 
     * @return SvArgs 服务实例规格信息
     */
    public String getSvArgs() {
        return this.SvArgs;
    }

    /**
     * Set 服务实例规格信息
     * @param SvArgs 服务实例规格信息
     */
    public void setSvArgs(String SvArgs) {
        this.SvArgs = SvArgs;
    }

    /**
     * Get VPC ID 
     * @return VpcId VPC ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID
     * @param VpcId VPC ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 服务规格对应的资产数 
     * @return Nodes 服务规格对应的资产数
     */
    public Long getNodes() {
        return this.Nodes;
    }

    /**
     * Set 服务规格对应的资产数
     * @param Nodes 服务规格对应的资产数
     */
    public void setNodes(Long Nodes) {
        this.Nodes = Nodes;
    }

    /**
     * Get 自动续费标记，0 - 表示默认状态，1 - 表示自动续费，2 - 表示明确不自动续费 
     * @return RenewFlag 自动续费标记，0 - 表示默认状态，1 - 表示自动续费，2 - 表示明确不自动续费
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 自动续费标记，0 - 表示默认状态，1 - 表示自动续费，2 - 表示明确不自动续费
     * @param RenewFlag 自动续费标记，0 - 表示默认状态，1 - 表示自动续费，2 - 表示明确不自动续费
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 过期时间 
     * @return ExpireTime 过期时间
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间
     * @param ExpireTime 过期时间
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 资源状态，0 - 未初始化，1 - 正常，2 - 隔离，3 - 销毁，4 - 初始化失败，5 - 初始化中 
     * @return Status 资源状态，0 - 未初始化，1 - 正常，2 - 隔离，3 - 销毁，4 - 初始化失败，5 - 初始化中
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 资源状态，0 - 未初始化，1 - 正常，2 - 隔离，3 - 销毁，4 - 初始化失败，5 - 初始化中
     * @param Status 资源状态，0 - 未初始化，1 - 正常，2 - 隔离，3 - 销毁，4 - 初始化失败，5 - 初始化中
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 服务实例名，如T-Sec-堡垒机（SaaS型） 
     * @return ResourceName 服务实例名，如T-Sec-堡垒机（SaaS型）
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 服务实例名，如T-Sec-堡垒机（SaaS型）
     * @param ResourceName 服务实例名，如T-Sec-堡垒机（SaaS型）
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get 定价模型ID 
     * @return Pid 定价模型ID
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set 定价模型ID
     * @param Pid 定价模型ID
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get 资源创建时间 
     * @return CreateTime 资源创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 资源创建时间
     * @param CreateTime 资源创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 商品码, p_cds_dasb 
     * @return ProductCode 商品码, p_cds_dasb
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set 商品码, p_cds_dasb
     * @param ProductCode 商品码, p_cds_dasb
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get 子商品码, sp_cds_dasb_bh_saas 
     * @return SubProductCode 子商品码, sp_cds_dasb_bh_saas
     */
    public String getSubProductCode() {
        return this.SubProductCode;
    }

    /**
     * Set 子商品码, sp_cds_dasb_bh_saas
     * @param SubProductCode 子商品码, sp_cds_dasb_bh_saas
     */
    public void setSubProductCode(String SubProductCode) {
        this.SubProductCode = SubProductCode;
    }

    /**
     * Get 可用区 
     * @return Zone 可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区
     * @param Zone 可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 是否过期，true-过期，false-未过期 
     * @return Expired 是否过期，true-过期，false-未过期
     */
    public Boolean getExpired() {
        return this.Expired;
    }

    /**
     * Set 是否过期，true-过期，false-未过期
     * @param Expired 是否过期，true-过期，false-未过期
     */
    public void setExpired(Boolean Expired) {
        this.Expired = Expired;
    }

    /**
     * Get 是否开通，true-开通，false-未开通 
     * @return Deployed 是否开通，true-开通，false-未开通
     */
    public Boolean getDeployed() {
        return this.Deployed;
    }

    /**
     * Set 是否开通，true-开通，false-未开通
     * @param Deployed 是否开通，true-开通，false-未开通
     */
    public void setDeployed(Boolean Deployed) {
        this.Deployed = Deployed;
    }

    /**
     * Get 开通服务的 VPC 名称 
     * @return VpcName 开通服务的 VPC 名称
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set 开通服务的 VPC 名称
     * @param VpcName 开通服务的 VPC 名称
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get 开通服务的 VPC 对应的网段 
     * @return VpcCidrBlock 开通服务的 VPC 对应的网段
     */
    public String getVpcCidrBlock() {
        return this.VpcCidrBlock;
    }

    /**
     * Set 开通服务的 VPC 对应的网段
     * @param VpcCidrBlock 开通服务的 VPC 对应的网段
     */
    public void setVpcCidrBlock(String VpcCidrBlock) {
        this.VpcCidrBlock = VpcCidrBlock;
    }

    /**
     * Get 开通服务的子网ID 
     * @return SubnetId 开通服务的子网ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 开通服务的子网ID
     * @param SubnetId 开通服务的子网ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 开通服务的子网名称 
     * @return SubnetName 开通服务的子网名称
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set 开通服务的子网名称
     * @param SubnetName 开通服务的子网名称
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * Get 开通服务的子网网段 
     * @return CidrBlock 开通服务的子网网段
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set 开通服务的子网网段
     * @param CidrBlock 开通服务的子网网段
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get 外部IP 
     * @return PublicIpSet 外部IP
     */
    public String [] getPublicIpSet() {
        return this.PublicIpSet;
    }

    /**
     * Set 外部IP
     * @param PublicIpSet 外部IP
     */
    public void setPublicIpSet(String [] PublicIpSet) {
        this.PublicIpSet = PublicIpSet;
    }

    /**
     * Get 内部IP 
     * @return PrivateIpSet 内部IP
     */
    public String [] getPrivateIpSet() {
        return this.PrivateIpSet;
    }

    /**
     * Set 内部IP
     * @param PrivateIpSet 内部IP
     */
    public void setPrivateIpSet(String [] PrivateIpSet) {
        this.PrivateIpSet = PrivateIpSet;
    }

    /**
     * Get 服务开通的高级功能列表，如:[DB] 
     * @return ModuleSet 服务开通的高级功能列表，如:[DB]
     */
    public String [] getModuleSet() {
        return this.ModuleSet;
    }

    /**
     * Set 服务开通的高级功能列表，如:[DB]
     * @param ModuleSet 服务开通的高级功能列表，如:[DB]
     */
    public void setModuleSet(String [] ModuleSet) {
        this.ModuleSet = ModuleSet;
    }

    /**
     * Get 已使用的授权点数 
     * @return UsedNodes 已使用的授权点数
     */
    public Long getUsedNodes() {
        return this.UsedNodes;
    }

    /**
     * Set 已使用的授权点数
     * @param UsedNodes 已使用的授权点数
     */
    public void setUsedNodes(Long UsedNodes) {
        this.UsedNodes = UsedNodes;
    }

    /**
     * Get 扩展点数 
     * @return ExtendPoints 扩展点数
     */
    public Long getExtendPoints() {
        return this.ExtendPoints;
    }

    /**
     * Set 扩展点数
     * @param ExtendPoints 扩展点数
     */
    public void setExtendPoints(Long ExtendPoints) {
        this.ExtendPoints = ExtendPoints;
    }

    /**
     * Get 带宽扩展包个数(4M) 
     * @return PackageBandwidth 带宽扩展包个数(4M)
     */
    public Long getPackageBandwidth() {
        return this.PackageBandwidth;
    }

    /**
     * Set 带宽扩展包个数(4M)
     * @param PackageBandwidth 带宽扩展包个数(4M)
     */
    public void setPackageBandwidth(Long PackageBandwidth) {
        this.PackageBandwidth = PackageBandwidth;
    }

    /**
     * Get 授权点数扩展包个数(50点) 
     * @return PackageNode 授权点数扩展包个数(50点)
     */
    public Long getPackageNode() {
        return this.PackageNode;
    }

    /**
     * Set 授权点数扩展包个数(50点)
     * @param PackageNode 授权点数扩展包个数(50点)
     */
    public void setPackageNode(Long PackageNode) {
        this.PackageNode = PackageNode;
    }

    /**
     * Get 日志投递规格信息 
     * @return LogDeliveryArgs 日志投递规格信息
     */
    public String getLogDeliveryArgs() {
        return this.LogDeliveryArgs;
    }

    /**
     * Set 日志投递规格信息
     * @param LogDeliveryArgs 日志投递规格信息
     */
    public void setLogDeliveryArgs(String LogDeliveryArgs) {
        this.LogDeliveryArgs = LogDeliveryArgs;
    }

    /**
     * Get 堡垒机资源LB	 
     * @return ClbSet 堡垒机资源LB	
     */
    public Clb [] getClbSet() {
        return this.ClbSet;
    }

    /**
     * Set 堡垒机资源LB	
     * @param ClbSet 堡垒机资源LB	
     */
    public void setClbSet(Clb [] ClbSet) {
        this.ClbSet = ClbSet;
    }

    /**
     * Get 网络域个数 
     * @return DomainCount 网络域个数
     */
    public Long getDomainCount() {
        return this.DomainCount;
    }

    /**
     * Set 网络域个数
     * @param DomainCount 网络域个数
     */
    public void setDomainCount(Long DomainCount) {
        this.DomainCount = DomainCount;
    }

    /**
     * Get 已经使用的网络域个数 
     * @return UsedDomainCount 已经使用的网络域个数
     */
    public Long getUsedDomainCount() {
        return this.UsedDomainCount;
    }

    /**
     * Set 已经使用的网络域个数
     * @param UsedDomainCount 已经使用的网络域个数
     */
    public void setUsedDomainCount(Long UsedDomainCount) {
        this.UsedDomainCount = UsedDomainCount;
    }

    /**
     * Get 0 非试用版，1 试用版 
     * @return Trial 0 非试用版，1 试用版
     */
    public Long getTrial() {
        return this.Trial;
    }

    /**
     * Set 0 非试用版，1 试用版
     * @param Trial 0 非试用版，1 试用版
     */
    public void setTrial(Long Trial) {
        this.Trial = Trial;
    }

    /**
     * Get 日志投递规格信息 
     * @return LogDelivery 日志投递规格信息
     */
    public String getLogDelivery() {
        return this.LogDelivery;
    }

    /**
     * Set 日志投递规格信息
     * @param LogDelivery 日志投递规格信息
     */
    public void setLogDelivery(String LogDelivery) {
        this.LogDelivery = LogDelivery;
    }

    /**
     * Get cdc集群id 
     * @return CdcClusterId cdc集群id
     */
    public String getCdcClusterId() {
        return this.CdcClusterId;
    }

    /**
     * Set cdc集群id
     * @param CdcClusterId cdc集群id
     */
    public void setCdcClusterId(String CdcClusterId) {
        this.CdcClusterId = CdcClusterId;
    }

    /**
     * Get 部署模式 默认0 0-cvm 1-tke 
     * @return DeployModel 部署模式 默认0 0-cvm 1-tke
     */
    public Long getDeployModel() {
        return this.DeployModel;
    }

    /**
     * Set 部署模式 默认0 0-cvm 1-tke
     * @param DeployModel 部署模式 默认0 0-cvm 1-tke
     */
    public void setDeployModel(Long DeployModel) {
        this.DeployModel = DeployModel;
    }

    /**
     * Get 0 默认值，非内网访问，1 内网访问，2 内网访问开通中，3 内网访问关闭中 
     * @return IntranetAccess 0 默认值，非内网访问，1 内网访问，2 内网访问开通中，3 内网访问关闭中
     */
    public Long getIntranetAccess() {
        return this.IntranetAccess;
    }

    /**
     * Set 0 默认值，非内网访问，1 内网访问，2 内网访问开通中，3 内网访问关闭中
     * @param IntranetAccess 0 默认值，非内网访问，1 内网访问，2 内网访问开通中，3 内网访问关闭中
     */
    public void setIntranetAccess(Long IntranetAccess) {
        this.IntranetAccess = IntranetAccess;
    }

    /**
     * Get 内网访问的ip 
     * @return IntranetPrivateIpSet 内网访问的ip
     */
    public String [] getIntranetPrivateIpSet() {
        return this.IntranetPrivateIpSet;
    }

    /**
     * Set 内网访问的ip
     * @param IntranetPrivateIpSet 内网访问的ip
     */
    public void setIntranetPrivateIpSet(String [] IntranetPrivateIpSet) {
        this.IntranetPrivateIpSet = IntranetPrivateIpSet;
    }

    /**
     * Get 开通内网访问的vpc 
     * @return IntranetVpcId 开通内网访问的vpc
     */
    public String getIntranetVpcId() {
        return this.IntranetVpcId;
    }

    /**
     * Set 开通内网访问的vpc
     * @param IntranetVpcId 开通内网访问的vpc
     */
    public void setIntranetVpcId(String IntranetVpcId) {
        this.IntranetVpcId = IntranetVpcId;
    }

    /**
     * Get 开通内网访问的subnetId 
     * @return IntranetSubnetId 开通内网访问的subnetId
     */
    public String getIntranetSubnetId() {
        return this.IntranetSubnetId;
    }

    /**
     * Set 开通内网访问的subnetId
     * @param IntranetSubnetId 开通内网访问的subnetId
     */
    public void setIntranetSubnetId(String IntranetSubnetId) {
        this.IntranetSubnetId = IntranetSubnetId;
    }

    /**
     * Get 开通内网访问vpc的网段 
     * @return IntranetVpcCidr 开通内网访问vpc的网段
     */
    public String getIntranetVpcCidr() {
        return this.IntranetVpcCidr;
    }

    /**
     * Set 开通内网访问vpc的网段
     * @param IntranetVpcCidr 开通内网访问vpc的网段
     */
    public void setIntranetVpcCidr(String IntranetVpcCidr) {
        this.IntranetVpcCidr = IntranetVpcCidr;
    }

    /**
     * Get 堡垒机内网ip自定义域名 
     * @return DomainName 堡垒机内网ip自定义域名
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 堡垒机内网ip自定义域名
     * @param DomainName 堡垒机内网ip自定义域名
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get 是否共享clb，true-共享clb，false-独享clb 
     * @return ShareClb 是否共享clb，true-共享clb，false-独享clb
     */
    public Boolean getShareClb() {
        return this.ShareClb;
    }

    /**
     * Set 是否共享clb，true-共享clb，false-独享clb
     * @param ShareClb 是否共享clb，true-共享clb，false-独享clb
     */
    public void setShareClb(Boolean ShareClb) {
        this.ShareClb = ShareClb;
    }

    /**
     * Get 共享clb id 
     * @return OpenClbId 共享clb id
     */
    public String getOpenClbId() {
        return this.OpenClbId;
    }

    /**
     * Set 共享clb id
     * @param OpenClbId 共享clb id
     */
    public void setOpenClbId(String OpenClbId) {
        this.OpenClbId = OpenClbId;
    }

    /**
     * Get 运营商信息 
     * @return LbVipIsp 运营商信息
     */
    public String getLbVipIsp() {
        return this.LbVipIsp;
    }

    /**
     * Set 运营商信息
     * @param LbVipIsp 运营商信息
     */
    public void setLbVipIsp(String LbVipIsp) {
        this.LbVipIsp = LbVipIsp;
    }

    /**
     * Get linux资产命令行运维端口 
     * @return TUICmdPort linux资产命令行运维端口
     */
    public Long getTUICmdPort() {
        return this.TUICmdPort;
    }

    /**
     * Set linux资产命令行运维端口
     * @param TUICmdPort linux资产命令行运维端口
     */
    public void setTUICmdPort(Long TUICmdPort) {
        this.TUICmdPort = TUICmdPort;
    }

    /**
     * Get linux资产直连端口 
     * @return TUIDirectPort linux资产直连端口
     */
    public Long getTUIDirectPort() {
        return this.TUIDirectPort;
    }

    /**
     * Set linux资产直连端口
     * @param TUIDirectPort linux资产直连端口
     */
    public void setTUIDirectPort(Long TUIDirectPort) {
        this.TUIDirectPort = TUIDirectPort;
    }

    /**
     * Get 1 默认值，web访问开启，0 web访问关闭，2 web访问开通中，3 web访问关闭中 
     * @return WebAccess 1 默认值，web访问开启，0 web访问关闭，2 web访问开通中，3 web访问关闭中
     */
    public Long getWebAccess() {
        return this.WebAccess;
    }

    /**
     * Set 1 默认值，web访问开启，0 web访问关闭，2 web访问开通中，3 web访问关闭中
     * @param WebAccess 1 默认值，web访问开启，0 web访问关闭，2 web访问开通中，3 web访问关闭中
     */
    public void setWebAccess(Long WebAccess) {
        this.WebAccess = WebAccess;
    }

    /**
     * Get 1 默认值，客户单访问开启，0 客户端访问关闭，2 客户端访问开通中，3 客户端访问关闭中 
     * @return ClientAccess 1 默认值，客户单访问开启，0 客户端访问关闭，2 客户端访问开通中，3 客户端访问关闭中
     */
    public Long getClientAccess() {
        return this.ClientAccess;
    }

    /**
     * Set 1 默认值，客户单访问开启，0 客户端访问关闭，2 客户端访问开通中，3 客户端访问关闭中
     * @param ClientAccess 1 默认值，客户单访问开启，0 客户端访问关闭，2 客户端访问开通中，3 客户端访问关闭中
     */
    public void setClientAccess(Long ClientAccess) {
        this.ClientAccess = ClientAccess;
    }

    /**
     * Get 1 默认值，外网访问开启，0 外网访问关闭，2 外网访问开通中，3 外网访问关闭中 
     * @return ExternalAccess 1 默认值，外网访问开启，0 外网访问关闭，2 外网访问开通中，3 外网访问关闭中
     */
    public Long getExternalAccess() {
        return this.ExternalAccess;
    }

    /**
     * Set 1 默认值，外网访问开启，0 外网访问关闭，2 外网访问开通中，3 外网访问关闭中
     * @param ExternalAccess 1 默认值，外网访问开启，0 外网访问关闭，2 外网访问开通中，3 外网访问关闭中
     */
    public void setExternalAccess(Long ExternalAccess) {
        this.ExternalAccess = ExternalAccess;
    }

    /**
     * Get 0默认值。0-免费版（试用版）ioa，1-付费版ioa 
     * @return IOAResource 0默认值。0-免费版（试用版）ioa，1-付费版ioa
     */
    public Long getIOAResource() {
        return this.IOAResource;
    }

    /**
     * Set 0默认值。0-免费版（试用版）ioa，1-付费版ioa
     * @param IOAResource 0默认值。0-免费版（试用版）ioa，1-付费版ioa
     */
    public void setIOAResource(Long IOAResource) {
        this.IOAResource = IOAResource;
    }

    /**
     * Get 零信任堡垒机用户扩展包个数。1个扩展包对应20个用户数 
     * @return PackageIOAUserCount 零信任堡垒机用户扩展包个数。1个扩展包对应20个用户数
     */
    public Long getPackageIOAUserCount() {
        return this.PackageIOAUserCount;
    }

    /**
     * Set 零信任堡垒机用户扩展包个数。1个扩展包对应20个用户数
     * @param PackageIOAUserCount 零信任堡垒机用户扩展包个数。1个扩展包对应20个用户数
     */
    public void setPackageIOAUserCount(Long PackageIOAUserCount) {
        this.PackageIOAUserCount = PackageIOAUserCount;
    }

    /**
     * Get  零信任堡垒机带宽扩展包个数。一个扩展包表示4M带宽 
     * @return PackageIOABandwidth  零信任堡垒机带宽扩展包个数。一个扩展包表示4M带宽
     */
    public Long getPackageIOABandwidth() {
        return this.PackageIOABandwidth;
    }

    /**
     * Set  零信任堡垒机带宽扩展包个数。一个扩展包表示4M带宽
     * @param PackageIOABandwidth  零信任堡垒机带宽扩展包个数。一个扩展包表示4M带宽
     */
    public void setPackageIOABandwidth(Long PackageIOABandwidth) {
        this.PackageIOABandwidth = PackageIOABandwidth;
    }

    /**
     * Get 堡垒机实例对应的零信任实例id 
     * @return IOAResourceId 堡垒机实例对应的零信任实例id
     */
    public String getIOAResourceId() {
        return this.IOAResourceId;
    }

    /**
     * Set 堡垒机实例对应的零信任实例id
     * @param IOAResourceId 堡垒机实例对应的零信任实例id
     */
    public void setIOAResourceId(String IOAResourceId) {
        this.IOAResourceId = IOAResourceId;
    }

    public Resource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Resource(Resource source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ApCode != null) {
            this.ApCode = new String(source.ApCode);
        }
        if (source.SvArgs != null) {
            this.SvArgs = new String(source.SvArgs);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Nodes != null) {
            this.Nodes = new Long(source.Nodes);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.Pid != null) {
            this.Pid = new Long(source.Pid);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ProductCode != null) {
            this.ProductCode = new String(source.ProductCode);
        }
        if (source.SubProductCode != null) {
            this.SubProductCode = new String(source.SubProductCode);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Expired != null) {
            this.Expired = new Boolean(source.Expired);
        }
        if (source.Deployed != null) {
            this.Deployed = new Boolean(source.Deployed);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.VpcCidrBlock != null) {
            this.VpcCidrBlock = new String(source.VpcCidrBlock);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.SubnetName != null) {
            this.SubnetName = new String(source.SubnetName);
        }
        if (source.CidrBlock != null) {
            this.CidrBlock = new String(source.CidrBlock);
        }
        if (source.PublicIpSet != null) {
            this.PublicIpSet = new String[source.PublicIpSet.length];
            for (int i = 0; i < source.PublicIpSet.length; i++) {
                this.PublicIpSet[i] = new String(source.PublicIpSet[i]);
            }
        }
        if (source.PrivateIpSet != null) {
            this.PrivateIpSet = new String[source.PrivateIpSet.length];
            for (int i = 0; i < source.PrivateIpSet.length; i++) {
                this.PrivateIpSet[i] = new String(source.PrivateIpSet[i]);
            }
        }
        if (source.ModuleSet != null) {
            this.ModuleSet = new String[source.ModuleSet.length];
            for (int i = 0; i < source.ModuleSet.length; i++) {
                this.ModuleSet[i] = new String(source.ModuleSet[i]);
            }
        }
        if (source.UsedNodes != null) {
            this.UsedNodes = new Long(source.UsedNodes);
        }
        if (source.ExtendPoints != null) {
            this.ExtendPoints = new Long(source.ExtendPoints);
        }
        if (source.PackageBandwidth != null) {
            this.PackageBandwidth = new Long(source.PackageBandwidth);
        }
        if (source.PackageNode != null) {
            this.PackageNode = new Long(source.PackageNode);
        }
        if (source.LogDeliveryArgs != null) {
            this.LogDeliveryArgs = new String(source.LogDeliveryArgs);
        }
        if (source.ClbSet != null) {
            this.ClbSet = new Clb[source.ClbSet.length];
            for (int i = 0; i < source.ClbSet.length; i++) {
                this.ClbSet[i] = new Clb(source.ClbSet[i]);
            }
        }
        if (source.DomainCount != null) {
            this.DomainCount = new Long(source.DomainCount);
        }
        if (source.UsedDomainCount != null) {
            this.UsedDomainCount = new Long(source.UsedDomainCount);
        }
        if (source.Trial != null) {
            this.Trial = new Long(source.Trial);
        }
        if (source.LogDelivery != null) {
            this.LogDelivery = new String(source.LogDelivery);
        }
        if (source.CdcClusterId != null) {
            this.CdcClusterId = new String(source.CdcClusterId);
        }
        if (source.DeployModel != null) {
            this.DeployModel = new Long(source.DeployModel);
        }
        if (source.IntranetAccess != null) {
            this.IntranetAccess = new Long(source.IntranetAccess);
        }
        if (source.IntranetPrivateIpSet != null) {
            this.IntranetPrivateIpSet = new String[source.IntranetPrivateIpSet.length];
            for (int i = 0; i < source.IntranetPrivateIpSet.length; i++) {
                this.IntranetPrivateIpSet[i] = new String(source.IntranetPrivateIpSet[i]);
            }
        }
        if (source.IntranetVpcId != null) {
            this.IntranetVpcId = new String(source.IntranetVpcId);
        }
        if (source.IntranetSubnetId != null) {
            this.IntranetSubnetId = new String(source.IntranetSubnetId);
        }
        if (source.IntranetVpcCidr != null) {
            this.IntranetVpcCidr = new String(source.IntranetVpcCidr);
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.ShareClb != null) {
            this.ShareClb = new Boolean(source.ShareClb);
        }
        if (source.OpenClbId != null) {
            this.OpenClbId = new String(source.OpenClbId);
        }
        if (source.LbVipIsp != null) {
            this.LbVipIsp = new String(source.LbVipIsp);
        }
        if (source.TUICmdPort != null) {
            this.TUICmdPort = new Long(source.TUICmdPort);
        }
        if (source.TUIDirectPort != null) {
            this.TUIDirectPort = new Long(source.TUIDirectPort);
        }
        if (source.WebAccess != null) {
            this.WebAccess = new Long(source.WebAccess);
        }
        if (source.ClientAccess != null) {
            this.ClientAccess = new Long(source.ClientAccess);
        }
        if (source.ExternalAccess != null) {
            this.ExternalAccess = new Long(source.ExternalAccess);
        }
        if (source.IOAResource != null) {
            this.IOAResource = new Long(source.IOAResource);
        }
        if (source.PackageIOAUserCount != null) {
            this.PackageIOAUserCount = new Long(source.PackageIOAUserCount);
        }
        if (source.PackageIOABandwidth != null) {
            this.PackageIOABandwidth = new Long(source.PackageIOABandwidth);
        }
        if (source.IOAResourceId != null) {
            this.IOAResourceId = new String(source.IOAResourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ApCode", this.ApCode);
        this.setParamSimple(map, prefix + "SvArgs", this.SvArgs);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Nodes", this.Nodes);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ProductCode", this.ProductCode);
        this.setParamSimple(map, prefix + "SubProductCode", this.SubProductCode);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Expired", this.Expired);
        this.setParamSimple(map, prefix + "Deployed", this.Deployed);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "VpcCidrBlock", this.VpcCidrBlock);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamArraySimple(map, prefix + "PublicIpSet.", this.PublicIpSet);
        this.setParamArraySimple(map, prefix + "PrivateIpSet.", this.PrivateIpSet);
        this.setParamArraySimple(map, prefix + "ModuleSet.", this.ModuleSet);
        this.setParamSimple(map, prefix + "UsedNodes", this.UsedNodes);
        this.setParamSimple(map, prefix + "ExtendPoints", this.ExtendPoints);
        this.setParamSimple(map, prefix + "PackageBandwidth", this.PackageBandwidth);
        this.setParamSimple(map, prefix + "PackageNode", this.PackageNode);
        this.setParamSimple(map, prefix + "LogDeliveryArgs", this.LogDeliveryArgs);
        this.setParamArrayObj(map, prefix + "ClbSet.", this.ClbSet);
        this.setParamSimple(map, prefix + "DomainCount", this.DomainCount);
        this.setParamSimple(map, prefix + "UsedDomainCount", this.UsedDomainCount);
        this.setParamSimple(map, prefix + "Trial", this.Trial);
        this.setParamSimple(map, prefix + "LogDelivery", this.LogDelivery);
        this.setParamSimple(map, prefix + "CdcClusterId", this.CdcClusterId);
        this.setParamSimple(map, prefix + "DeployModel", this.DeployModel);
        this.setParamSimple(map, prefix + "IntranetAccess", this.IntranetAccess);
        this.setParamArraySimple(map, prefix + "IntranetPrivateIpSet.", this.IntranetPrivateIpSet);
        this.setParamSimple(map, prefix + "IntranetVpcId", this.IntranetVpcId);
        this.setParamSimple(map, prefix + "IntranetSubnetId", this.IntranetSubnetId);
        this.setParamSimple(map, prefix + "IntranetVpcCidr", this.IntranetVpcCidr);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "ShareClb", this.ShareClb);
        this.setParamSimple(map, prefix + "OpenClbId", this.OpenClbId);
        this.setParamSimple(map, prefix + "LbVipIsp", this.LbVipIsp);
        this.setParamSimple(map, prefix + "TUICmdPort", this.TUICmdPort);
        this.setParamSimple(map, prefix + "TUIDirectPort", this.TUIDirectPort);
        this.setParamSimple(map, prefix + "WebAccess", this.WebAccess);
        this.setParamSimple(map, prefix + "ClientAccess", this.ClientAccess);
        this.setParamSimple(map, prefix + "ExternalAccess", this.ExternalAccess);
        this.setParamSimple(map, prefix + "IOAResource", this.IOAResource);
        this.setParamSimple(map, prefix + "PackageIOAUserCount", this.PackageIOAUserCount);
        this.setParamSimple(map, prefix + "PackageIOABandwidth", this.PackageIOABandwidth);
        this.setParamSimple(map, prefix + "IOAResourceId", this.IOAResourceId);

    }
}

