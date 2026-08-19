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
    * <p>服务实例ID，如bh-saas-s3ed4r5e</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>地域编码</p>
    */
    @SerializedName("ApCode")
    @Expose
    private String ApCode;

    /**
    * <p>服务实例规格信息</p>
    */
    @SerializedName("SvArgs")
    @Expose
    private String SvArgs;

    /**
    * <p>VPC ID</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>服务规格对应的资产数</p>
    */
    @SerializedName("Nodes")
    @Expose
    private Long Nodes;

    /**
    * <p>自动续费标记，0 - 表示默认状态，1 - 表示自动续费，2 - 表示明确不自动续费</p>
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * <p>过期时间</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>资源状态，0 - 未初始化，1 - 正常，2 - 隔离，3 - 销毁，4 - 初始化失败，5 - 初始化中</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>服务实例名，如T-Sec-堡垒机（SaaS型）</p>
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * <p>定价模型ID</p>
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * <p>资源创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>商品码, p_cds_dasb</p>
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * <p>子商品码, sp_cds_dasb_bh_saas</p>
    */
    @SerializedName("SubProductCode")
    @Expose
    private String SubProductCode;

    /**
    * <p>可用区</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>是否过期，true-过期，false-未过期</p>
    */
    @SerializedName("Expired")
    @Expose
    private Boolean Expired;

    /**
    * <p>是否开通，true-开通，false-未开通</p>
    */
    @SerializedName("Deployed")
    @Expose
    private Boolean Deployed;

    /**
    * <p>开通服务的 VPC 名称</p>
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * <p>开通服务的 VPC 对应的网段</p>
    */
    @SerializedName("VpcCidrBlock")
    @Expose
    private String VpcCidrBlock;

    /**
    * <p>开通服务的子网ID</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>开通服务的子网名称</p>
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * <p>开通服务的子网网段</p>
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * <p>外部IP</p>
    */
    @SerializedName("PublicIpSet")
    @Expose
    private String [] PublicIpSet;

    /**
    * <p>内部IP</p>
    */
    @SerializedName("PrivateIpSet")
    @Expose
    private String [] PrivateIpSet;

    /**
    * <p>服务开通的高级功能列表，如:[DB]</p>
    */
    @SerializedName("ModuleSet")
    @Expose
    private String [] ModuleSet;

    /**
    * <p>已使用的授权点数</p>
    */
    @SerializedName("UsedNodes")
    @Expose
    private Long UsedNodes;

    /**
    * <p>扩展点数</p>
    */
    @SerializedName("ExtendPoints")
    @Expose
    private Long ExtendPoints;

    /**
    * <p>带宽扩展包个数(4M)</p>
    */
    @SerializedName("PackageBandwidth")
    @Expose
    private Long PackageBandwidth;

    /**
    * <p>授权点数扩展包个数(50点)</p>
    */
    @SerializedName("PackageNode")
    @Expose
    private Long PackageNode;

    /**
    * <p>日志投递规格信息</p>
    */
    @SerializedName("LogDeliveryArgs")
    @Expose
    private String LogDeliveryArgs;

    /**
    * <p>堡垒机资源LB</p>
    */
    @SerializedName("ClbSet")
    @Expose
    private Clb [] ClbSet;

    /**
    * <p>网络域个数</p>
    */
    @SerializedName("DomainCount")
    @Expose
    private Long DomainCount;

    /**
    * <p>已经使用的网络域个数</p>
    */
    @SerializedName("UsedDomainCount")
    @Expose
    private Long UsedDomainCount;

    /**
    * <p>开启的网络域个数（不包含默认网络域）</p>
    */
    @SerializedName("EnabledDomainCount")
    @Expose
    private Long EnabledDomainCount;

    /**
    * <p>0 非试用版，1 试用版</p>
    */
    @SerializedName("Trial")
    @Expose
    private Long Trial;

    /**
    * <p>日志投递规格信息</p>
    */
    @SerializedName("LogDelivery")
    @Expose
    private String LogDelivery;

    /**
    * <p>cdc集群id</p>
    */
    @SerializedName("CdcClusterId")
    @Expose
    private String CdcClusterId;

    /**
    * <p>部署模式 默认0 0-cvm 1-tke</p>
    */
    @SerializedName("DeployModel")
    @Expose
    private Long DeployModel;

    /**
    * <p>0 默认值，非内网访问，1 内网访问，2 内网访问开通中，3 内网访问关闭中</p>
    */
    @SerializedName("IntranetAccess")
    @Expose
    private Long IntranetAccess;

    /**
    * <p>内网访问的ip</p>
    */
    @SerializedName("IntranetPrivateIpSet")
    @Expose
    private String [] IntranetPrivateIpSet;

    /**
    * <p>开通内网访问的vpc</p>
    */
    @SerializedName("IntranetVpcId")
    @Expose
    private String IntranetVpcId;

    /**
    * <p>开通内网访问的subnetId</p>
    */
    @SerializedName("IntranetSubnetId")
    @Expose
    private String IntranetSubnetId;

    /**
    * <p>开通内网访问的子网集合</p>
    */
    @SerializedName("IntranetSubnetIdSet")
    @Expose
    private String [] IntranetSubnetIdSet;

    /**
    * <p>开通内网访问vpc的网段</p>
    */
    @SerializedName("IntranetVpcCidr")
    @Expose
    private String IntranetVpcCidr;

    /**
    * <p>堡垒机内网ip自定义域名</p>
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * <p>是否共享clb，true-共享clb，false-独享clb</p>
    */
    @SerializedName("ShareClb")
    @Expose
    private Boolean ShareClb;

    /**
    * <p>共享clb id</p>
    */
    @SerializedName("OpenClbId")
    @Expose
    private String OpenClbId;

    /**
    * <p>运营商信息</p>
    */
    @SerializedName("LbVipIsp")
    @Expose
    private String LbVipIsp;

    /**
    * <p>linux资产命令行运维端口</p>
    */
    @SerializedName("TUICmdPort")
    @Expose
    private Long TUICmdPort;

    /**
    * <p>linux资产直连端口</p>
    */
    @SerializedName("TUIDirectPort")
    @Expose
    private Long TUIDirectPort;

    /**
    * <p>1 默认值，web访问开启，0 web访问关闭，2 web访问开通中，3 web访问关闭中</p>
    */
    @SerializedName("WebAccess")
    @Expose
    private Long WebAccess;

    /**
    * <p>1 默认值，客户单访问开启，0 客户端访问关闭，2 客户端访问开通中，3 客户端访问关闭中</p>
    */
    @SerializedName("ClientAccess")
    @Expose
    private Long ClientAccess;

    /**
    * <p>1 默认值，外网访问开启，0 外网访问关闭，2 外网访问开通中，3 外网访问关闭中</p>
    */
    @SerializedName("ExternalAccess")
    @Expose
    private Long ExternalAccess;

    /**
    * <p>0默认值。0-免费版（试用版）ioa，1-付费版ioa</p>
    */
    @SerializedName("IOAResource")
    @Expose
    private Long IOAResource;

    /**
    * <p>零信任堡垒机用户扩展包个数。1个扩展包对应20个用户数</p>
    */
    @SerializedName("PackageIOAUserCount")
    @Expose
    private Long PackageIOAUserCount;

    /**
    * <p>零信任堡垒机带宽扩展包个数。一个扩展包表示4M带宽</p>
    */
    @SerializedName("PackageIOABandwidth")
    @Expose
    private Long PackageIOABandwidth;

    /**
    * <p>堡垒机实例对应的零信任实例id</p>
    */
    @SerializedName("IOAResourceId")
    @Expose
    private String IOAResourceId;

    /**
    * <p>资源类型 免费版/标准版/专业版 /国密版 free/standard/pro/gm</p>
    */
    @SerializedName("ResourceEdition")
    @Expose
    private String ResourceEdition;

    /**
    * <p>计费周期 年：y，月：m，日：d，时：h，分：M，秒：s，一次性购买：p</p>
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * <p>计费时长</p>
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * <p>计费模式 0后付费，1预付费</p>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>计费侧地域</p>
    */
    @SerializedName("BillingRegion")
    @Expose
    private String BillingRegion;

    /**
    * <p>计费侧可用区</p>
    */
    @SerializedName("BillingZone")
    @Expose
    private String BillingZone;

    /**
    * <p>部署的cvm个数</p>
    */
    @SerializedName("DeployCvmCount")
    @Expose
    private Long DeployCvmCount;

    /**
    * <p>堡垒机实例的可用区信息</p>
    */
    @SerializedName("ResourceZoneSet")
    @Expose
    private ResourceDeployZone [] ResourceZoneSet;

    /**
     * Get <p>服务实例ID，如bh-saas-s3ed4r5e</p> 
     * @return ResourceId <p>服务实例ID，如bh-saas-s3ed4r5e</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>服务实例ID，如bh-saas-s3ed4r5e</p>
     * @param ResourceId <p>服务实例ID，如bh-saas-s3ed4r5e</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>地域编码</p> 
     * @return ApCode <p>地域编码</p>
     */
    public String getApCode() {
        return this.ApCode;
    }

    /**
     * Set <p>地域编码</p>
     * @param ApCode <p>地域编码</p>
     */
    public void setApCode(String ApCode) {
        this.ApCode = ApCode;
    }

    /**
     * Get <p>服务实例规格信息</p> 
     * @return SvArgs <p>服务实例规格信息</p>
     */
    public String getSvArgs() {
        return this.SvArgs;
    }

    /**
     * Set <p>服务实例规格信息</p>
     * @param SvArgs <p>服务实例规格信息</p>
     */
    public void setSvArgs(String SvArgs) {
        this.SvArgs = SvArgs;
    }

    /**
     * Get <p>VPC ID</p> 
     * @return VpcId <p>VPC ID</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC ID</p>
     * @param VpcId <p>VPC ID</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>服务规格对应的资产数</p> 
     * @return Nodes <p>服务规格对应的资产数</p>
     */
    public Long getNodes() {
        return this.Nodes;
    }

    /**
     * Set <p>服务规格对应的资产数</p>
     * @param Nodes <p>服务规格对应的资产数</p>
     */
    public void setNodes(Long Nodes) {
        this.Nodes = Nodes;
    }

    /**
     * Get <p>自动续费标记，0 - 表示默认状态，1 - 表示自动续费，2 - 表示明确不自动续费</p> 
     * @return RenewFlag <p>自动续费标记，0 - 表示默认状态，1 - 表示自动续费，2 - 表示明确不自动续费</p>
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set <p>自动续费标记，0 - 表示默认状态，1 - 表示自动续费，2 - 表示明确不自动续费</p>
     * @param RenewFlag <p>自动续费标记，0 - 表示默认状态，1 - 表示自动续费，2 - 表示明确不自动续费</p>
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get <p>过期时间</p> 
     * @return ExpireTime <p>过期时间</p>
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>过期时间</p>
     * @param ExpireTime <p>过期时间</p>
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>资源状态，0 - 未初始化，1 - 正常，2 - 隔离，3 - 销毁，4 - 初始化失败，5 - 初始化中</p> 
     * @return Status <p>资源状态，0 - 未初始化，1 - 正常，2 - 隔离，3 - 销毁，4 - 初始化失败，5 - 初始化中</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>资源状态，0 - 未初始化，1 - 正常，2 - 隔离，3 - 销毁，4 - 初始化失败，5 - 初始化中</p>
     * @param Status <p>资源状态，0 - 未初始化，1 - 正常，2 - 隔离，3 - 销毁，4 - 初始化失败，5 - 初始化中</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>服务实例名，如T-Sec-堡垒机（SaaS型）</p> 
     * @return ResourceName <p>服务实例名，如T-Sec-堡垒机（SaaS型）</p>
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set <p>服务实例名，如T-Sec-堡垒机（SaaS型）</p>
     * @param ResourceName <p>服务实例名，如T-Sec-堡垒机（SaaS型）</p>
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get <p>定价模型ID</p> 
     * @return Pid <p>定价模型ID</p>
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set <p>定价模型ID</p>
     * @param Pid <p>定价模型ID</p>
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get <p>资源创建时间</p> 
     * @return CreateTime <p>资源创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>资源创建时间</p>
     * @param CreateTime <p>资源创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>商品码, p_cds_dasb</p> 
     * @return ProductCode <p>商品码, p_cds_dasb</p>
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set <p>商品码, p_cds_dasb</p>
     * @param ProductCode <p>商品码, p_cds_dasb</p>
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get <p>子商品码, sp_cds_dasb_bh_saas</p> 
     * @return SubProductCode <p>子商品码, sp_cds_dasb_bh_saas</p>
     */
    public String getSubProductCode() {
        return this.SubProductCode;
    }

    /**
     * Set <p>子商品码, sp_cds_dasb_bh_saas</p>
     * @param SubProductCode <p>子商品码, sp_cds_dasb_bh_saas</p>
     */
    public void setSubProductCode(String SubProductCode) {
        this.SubProductCode = SubProductCode;
    }

    /**
     * Get <p>可用区</p> 
     * @return Zone <p>可用区</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区</p>
     * @param Zone <p>可用区</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>是否过期，true-过期，false-未过期</p> 
     * @return Expired <p>是否过期，true-过期，false-未过期</p>
     */
    public Boolean getExpired() {
        return this.Expired;
    }

    /**
     * Set <p>是否过期，true-过期，false-未过期</p>
     * @param Expired <p>是否过期，true-过期，false-未过期</p>
     */
    public void setExpired(Boolean Expired) {
        this.Expired = Expired;
    }

    /**
     * Get <p>是否开通，true-开通，false-未开通</p> 
     * @return Deployed <p>是否开通，true-开通，false-未开通</p>
     */
    public Boolean getDeployed() {
        return this.Deployed;
    }

    /**
     * Set <p>是否开通，true-开通，false-未开通</p>
     * @param Deployed <p>是否开通，true-开通，false-未开通</p>
     */
    public void setDeployed(Boolean Deployed) {
        this.Deployed = Deployed;
    }

    /**
     * Get <p>开通服务的 VPC 名称</p> 
     * @return VpcName <p>开通服务的 VPC 名称</p>
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set <p>开通服务的 VPC 名称</p>
     * @param VpcName <p>开通服务的 VPC 名称</p>
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get <p>开通服务的 VPC 对应的网段</p> 
     * @return VpcCidrBlock <p>开通服务的 VPC 对应的网段</p>
     */
    public String getVpcCidrBlock() {
        return this.VpcCidrBlock;
    }

    /**
     * Set <p>开通服务的 VPC 对应的网段</p>
     * @param VpcCidrBlock <p>开通服务的 VPC 对应的网段</p>
     */
    public void setVpcCidrBlock(String VpcCidrBlock) {
        this.VpcCidrBlock = VpcCidrBlock;
    }

    /**
     * Get <p>开通服务的子网ID</p> 
     * @return SubnetId <p>开通服务的子网ID</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>开通服务的子网ID</p>
     * @param SubnetId <p>开通服务的子网ID</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>开通服务的子网名称</p> 
     * @return SubnetName <p>开通服务的子网名称</p>
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set <p>开通服务的子网名称</p>
     * @param SubnetName <p>开通服务的子网名称</p>
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * Get <p>开通服务的子网网段</p> 
     * @return CidrBlock <p>开通服务的子网网段</p>
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set <p>开通服务的子网网段</p>
     * @param CidrBlock <p>开通服务的子网网段</p>
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get <p>外部IP</p> 
     * @return PublicIpSet <p>外部IP</p>
     */
    public String [] getPublicIpSet() {
        return this.PublicIpSet;
    }

    /**
     * Set <p>外部IP</p>
     * @param PublicIpSet <p>外部IP</p>
     */
    public void setPublicIpSet(String [] PublicIpSet) {
        this.PublicIpSet = PublicIpSet;
    }

    /**
     * Get <p>内部IP</p> 
     * @return PrivateIpSet <p>内部IP</p>
     */
    public String [] getPrivateIpSet() {
        return this.PrivateIpSet;
    }

    /**
     * Set <p>内部IP</p>
     * @param PrivateIpSet <p>内部IP</p>
     */
    public void setPrivateIpSet(String [] PrivateIpSet) {
        this.PrivateIpSet = PrivateIpSet;
    }

    /**
     * Get <p>服务开通的高级功能列表，如:[DB]</p> 
     * @return ModuleSet <p>服务开通的高级功能列表，如:[DB]</p>
     */
    public String [] getModuleSet() {
        return this.ModuleSet;
    }

    /**
     * Set <p>服务开通的高级功能列表，如:[DB]</p>
     * @param ModuleSet <p>服务开通的高级功能列表，如:[DB]</p>
     */
    public void setModuleSet(String [] ModuleSet) {
        this.ModuleSet = ModuleSet;
    }

    /**
     * Get <p>已使用的授权点数</p> 
     * @return UsedNodes <p>已使用的授权点数</p>
     */
    public Long getUsedNodes() {
        return this.UsedNodes;
    }

    /**
     * Set <p>已使用的授权点数</p>
     * @param UsedNodes <p>已使用的授权点数</p>
     */
    public void setUsedNodes(Long UsedNodes) {
        this.UsedNodes = UsedNodes;
    }

    /**
     * Get <p>扩展点数</p> 
     * @return ExtendPoints <p>扩展点数</p>
     */
    public Long getExtendPoints() {
        return this.ExtendPoints;
    }

    /**
     * Set <p>扩展点数</p>
     * @param ExtendPoints <p>扩展点数</p>
     */
    public void setExtendPoints(Long ExtendPoints) {
        this.ExtendPoints = ExtendPoints;
    }

    /**
     * Get <p>带宽扩展包个数(4M)</p> 
     * @return PackageBandwidth <p>带宽扩展包个数(4M)</p>
     */
    public Long getPackageBandwidth() {
        return this.PackageBandwidth;
    }

    /**
     * Set <p>带宽扩展包个数(4M)</p>
     * @param PackageBandwidth <p>带宽扩展包个数(4M)</p>
     */
    public void setPackageBandwidth(Long PackageBandwidth) {
        this.PackageBandwidth = PackageBandwidth;
    }

    /**
     * Get <p>授权点数扩展包个数(50点)</p> 
     * @return PackageNode <p>授权点数扩展包个数(50点)</p>
     */
    public Long getPackageNode() {
        return this.PackageNode;
    }

    /**
     * Set <p>授权点数扩展包个数(50点)</p>
     * @param PackageNode <p>授权点数扩展包个数(50点)</p>
     */
    public void setPackageNode(Long PackageNode) {
        this.PackageNode = PackageNode;
    }

    /**
     * Get <p>日志投递规格信息</p> 
     * @return LogDeliveryArgs <p>日志投递规格信息</p>
     */
    public String getLogDeliveryArgs() {
        return this.LogDeliveryArgs;
    }

    /**
     * Set <p>日志投递规格信息</p>
     * @param LogDeliveryArgs <p>日志投递规格信息</p>
     */
    public void setLogDeliveryArgs(String LogDeliveryArgs) {
        this.LogDeliveryArgs = LogDeliveryArgs;
    }

    /**
     * Get <p>堡垒机资源LB</p> 
     * @return ClbSet <p>堡垒机资源LB</p>
     */
    public Clb [] getClbSet() {
        return this.ClbSet;
    }

    /**
     * Set <p>堡垒机资源LB</p>
     * @param ClbSet <p>堡垒机资源LB</p>
     */
    public void setClbSet(Clb [] ClbSet) {
        this.ClbSet = ClbSet;
    }

    /**
     * Get <p>网络域个数</p> 
     * @return DomainCount <p>网络域个数</p>
     */
    public Long getDomainCount() {
        return this.DomainCount;
    }

    /**
     * Set <p>网络域个数</p>
     * @param DomainCount <p>网络域个数</p>
     */
    public void setDomainCount(Long DomainCount) {
        this.DomainCount = DomainCount;
    }

    /**
     * Get <p>已经使用的网络域个数</p> 
     * @return UsedDomainCount <p>已经使用的网络域个数</p>
     */
    public Long getUsedDomainCount() {
        return this.UsedDomainCount;
    }

    /**
     * Set <p>已经使用的网络域个数</p>
     * @param UsedDomainCount <p>已经使用的网络域个数</p>
     */
    public void setUsedDomainCount(Long UsedDomainCount) {
        this.UsedDomainCount = UsedDomainCount;
    }

    /**
     * Get <p>开启的网络域个数（不包含默认网络域）</p> 
     * @return EnabledDomainCount <p>开启的网络域个数（不包含默认网络域）</p>
     */
    public Long getEnabledDomainCount() {
        return this.EnabledDomainCount;
    }

    /**
     * Set <p>开启的网络域个数（不包含默认网络域）</p>
     * @param EnabledDomainCount <p>开启的网络域个数（不包含默认网络域）</p>
     */
    public void setEnabledDomainCount(Long EnabledDomainCount) {
        this.EnabledDomainCount = EnabledDomainCount;
    }

    /**
     * Get <p>0 非试用版，1 试用版</p> 
     * @return Trial <p>0 非试用版，1 试用版</p>
     */
    public Long getTrial() {
        return this.Trial;
    }

    /**
     * Set <p>0 非试用版，1 试用版</p>
     * @param Trial <p>0 非试用版，1 试用版</p>
     */
    public void setTrial(Long Trial) {
        this.Trial = Trial;
    }

    /**
     * Get <p>日志投递规格信息</p> 
     * @return LogDelivery <p>日志投递规格信息</p>
     */
    public String getLogDelivery() {
        return this.LogDelivery;
    }

    /**
     * Set <p>日志投递规格信息</p>
     * @param LogDelivery <p>日志投递规格信息</p>
     */
    public void setLogDelivery(String LogDelivery) {
        this.LogDelivery = LogDelivery;
    }

    /**
     * Get <p>cdc集群id</p> 
     * @return CdcClusterId <p>cdc集群id</p>
     */
    public String getCdcClusterId() {
        return this.CdcClusterId;
    }

    /**
     * Set <p>cdc集群id</p>
     * @param CdcClusterId <p>cdc集群id</p>
     */
    public void setCdcClusterId(String CdcClusterId) {
        this.CdcClusterId = CdcClusterId;
    }

    /**
     * Get <p>部署模式 默认0 0-cvm 1-tke</p> 
     * @return DeployModel <p>部署模式 默认0 0-cvm 1-tke</p>
     */
    public Long getDeployModel() {
        return this.DeployModel;
    }

    /**
     * Set <p>部署模式 默认0 0-cvm 1-tke</p>
     * @param DeployModel <p>部署模式 默认0 0-cvm 1-tke</p>
     */
    public void setDeployModel(Long DeployModel) {
        this.DeployModel = DeployModel;
    }

    /**
     * Get <p>0 默认值，非内网访问，1 内网访问，2 内网访问开通中，3 内网访问关闭中</p> 
     * @return IntranetAccess <p>0 默认值，非内网访问，1 内网访问，2 内网访问开通中，3 内网访问关闭中</p>
     */
    public Long getIntranetAccess() {
        return this.IntranetAccess;
    }

    /**
     * Set <p>0 默认值，非内网访问，1 内网访问，2 内网访问开通中，3 内网访问关闭中</p>
     * @param IntranetAccess <p>0 默认值，非内网访问，1 内网访问，2 内网访问开通中，3 内网访问关闭中</p>
     */
    public void setIntranetAccess(Long IntranetAccess) {
        this.IntranetAccess = IntranetAccess;
    }

    /**
     * Get <p>内网访问的ip</p> 
     * @return IntranetPrivateIpSet <p>内网访问的ip</p>
     */
    public String [] getIntranetPrivateIpSet() {
        return this.IntranetPrivateIpSet;
    }

    /**
     * Set <p>内网访问的ip</p>
     * @param IntranetPrivateIpSet <p>内网访问的ip</p>
     */
    public void setIntranetPrivateIpSet(String [] IntranetPrivateIpSet) {
        this.IntranetPrivateIpSet = IntranetPrivateIpSet;
    }

    /**
     * Get <p>开通内网访问的vpc</p> 
     * @return IntranetVpcId <p>开通内网访问的vpc</p>
     */
    public String getIntranetVpcId() {
        return this.IntranetVpcId;
    }

    /**
     * Set <p>开通内网访问的vpc</p>
     * @param IntranetVpcId <p>开通内网访问的vpc</p>
     */
    public void setIntranetVpcId(String IntranetVpcId) {
        this.IntranetVpcId = IntranetVpcId;
    }

    /**
     * Get <p>开通内网访问的subnetId</p> 
     * @return IntranetSubnetId <p>开通内网访问的subnetId</p>
     * @deprecated
     */
    @Deprecated
    public String getIntranetSubnetId() {
        return this.IntranetSubnetId;
    }

    /**
     * Set <p>开通内网访问的subnetId</p>
     * @param IntranetSubnetId <p>开通内网访问的subnetId</p>
     * @deprecated
     */
    @Deprecated
    public void setIntranetSubnetId(String IntranetSubnetId) {
        this.IntranetSubnetId = IntranetSubnetId;
    }

    /**
     * Get <p>开通内网访问的子网集合</p> 
     * @return IntranetSubnetIdSet <p>开通内网访问的子网集合</p>
     */
    public String [] getIntranetSubnetIdSet() {
        return this.IntranetSubnetIdSet;
    }

    /**
     * Set <p>开通内网访问的子网集合</p>
     * @param IntranetSubnetIdSet <p>开通内网访问的子网集合</p>
     */
    public void setIntranetSubnetIdSet(String [] IntranetSubnetIdSet) {
        this.IntranetSubnetIdSet = IntranetSubnetIdSet;
    }

    /**
     * Get <p>开通内网访问vpc的网段</p> 
     * @return IntranetVpcCidr <p>开通内网访问vpc的网段</p>
     */
    public String getIntranetVpcCidr() {
        return this.IntranetVpcCidr;
    }

    /**
     * Set <p>开通内网访问vpc的网段</p>
     * @param IntranetVpcCidr <p>开通内网访问vpc的网段</p>
     */
    public void setIntranetVpcCidr(String IntranetVpcCidr) {
        this.IntranetVpcCidr = IntranetVpcCidr;
    }

    /**
     * Get <p>堡垒机内网ip自定义域名</p> 
     * @return DomainName <p>堡垒机内网ip自定义域名</p>
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set <p>堡垒机内网ip自定义域名</p>
     * @param DomainName <p>堡垒机内网ip自定义域名</p>
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get <p>是否共享clb，true-共享clb，false-独享clb</p> 
     * @return ShareClb <p>是否共享clb，true-共享clb，false-独享clb</p>
     */
    public Boolean getShareClb() {
        return this.ShareClb;
    }

    /**
     * Set <p>是否共享clb，true-共享clb，false-独享clb</p>
     * @param ShareClb <p>是否共享clb，true-共享clb，false-独享clb</p>
     */
    public void setShareClb(Boolean ShareClb) {
        this.ShareClb = ShareClb;
    }

    /**
     * Get <p>共享clb id</p> 
     * @return OpenClbId <p>共享clb id</p>
     */
    public String getOpenClbId() {
        return this.OpenClbId;
    }

    /**
     * Set <p>共享clb id</p>
     * @param OpenClbId <p>共享clb id</p>
     */
    public void setOpenClbId(String OpenClbId) {
        this.OpenClbId = OpenClbId;
    }

    /**
     * Get <p>运营商信息</p> 
     * @return LbVipIsp <p>运营商信息</p>
     */
    public String getLbVipIsp() {
        return this.LbVipIsp;
    }

    /**
     * Set <p>运营商信息</p>
     * @param LbVipIsp <p>运营商信息</p>
     */
    public void setLbVipIsp(String LbVipIsp) {
        this.LbVipIsp = LbVipIsp;
    }

    /**
     * Get <p>linux资产命令行运维端口</p> 
     * @return TUICmdPort <p>linux资产命令行运维端口</p>
     */
    public Long getTUICmdPort() {
        return this.TUICmdPort;
    }

    /**
     * Set <p>linux资产命令行运维端口</p>
     * @param TUICmdPort <p>linux资产命令行运维端口</p>
     */
    public void setTUICmdPort(Long TUICmdPort) {
        this.TUICmdPort = TUICmdPort;
    }

    /**
     * Get <p>linux资产直连端口</p> 
     * @return TUIDirectPort <p>linux资产直连端口</p>
     */
    public Long getTUIDirectPort() {
        return this.TUIDirectPort;
    }

    /**
     * Set <p>linux资产直连端口</p>
     * @param TUIDirectPort <p>linux资产直连端口</p>
     */
    public void setTUIDirectPort(Long TUIDirectPort) {
        this.TUIDirectPort = TUIDirectPort;
    }

    /**
     * Get <p>1 默认值，web访问开启，0 web访问关闭，2 web访问开通中，3 web访问关闭中</p> 
     * @return WebAccess <p>1 默认值，web访问开启，0 web访问关闭，2 web访问开通中，3 web访问关闭中</p>
     */
    public Long getWebAccess() {
        return this.WebAccess;
    }

    /**
     * Set <p>1 默认值，web访问开启，0 web访问关闭，2 web访问开通中，3 web访问关闭中</p>
     * @param WebAccess <p>1 默认值，web访问开启，0 web访问关闭，2 web访问开通中，3 web访问关闭中</p>
     */
    public void setWebAccess(Long WebAccess) {
        this.WebAccess = WebAccess;
    }

    /**
     * Get <p>1 默认值，客户单访问开启，0 客户端访问关闭，2 客户端访问开通中，3 客户端访问关闭中</p> 
     * @return ClientAccess <p>1 默认值，客户单访问开启，0 客户端访问关闭，2 客户端访问开通中，3 客户端访问关闭中</p>
     */
    public Long getClientAccess() {
        return this.ClientAccess;
    }

    /**
     * Set <p>1 默认值，客户单访问开启，0 客户端访问关闭，2 客户端访问开通中，3 客户端访问关闭中</p>
     * @param ClientAccess <p>1 默认值，客户单访问开启，0 客户端访问关闭，2 客户端访问开通中，3 客户端访问关闭中</p>
     */
    public void setClientAccess(Long ClientAccess) {
        this.ClientAccess = ClientAccess;
    }

    /**
     * Get <p>1 默认值，外网访问开启，0 外网访问关闭，2 外网访问开通中，3 外网访问关闭中</p> 
     * @return ExternalAccess <p>1 默认值，外网访问开启，0 外网访问关闭，2 外网访问开通中，3 外网访问关闭中</p>
     */
    public Long getExternalAccess() {
        return this.ExternalAccess;
    }

    /**
     * Set <p>1 默认值，外网访问开启，0 外网访问关闭，2 外网访问开通中，3 外网访问关闭中</p>
     * @param ExternalAccess <p>1 默认值，外网访问开启，0 外网访问关闭，2 外网访问开通中，3 外网访问关闭中</p>
     */
    public void setExternalAccess(Long ExternalAccess) {
        this.ExternalAccess = ExternalAccess;
    }

    /**
     * Get <p>0默认值。0-免费版（试用版）ioa，1-付费版ioa</p> 
     * @return IOAResource <p>0默认值。0-免费版（试用版）ioa，1-付费版ioa</p>
     */
    public Long getIOAResource() {
        return this.IOAResource;
    }

    /**
     * Set <p>0默认值。0-免费版（试用版）ioa，1-付费版ioa</p>
     * @param IOAResource <p>0默认值。0-免费版（试用版）ioa，1-付费版ioa</p>
     */
    public void setIOAResource(Long IOAResource) {
        this.IOAResource = IOAResource;
    }

    /**
     * Get <p>零信任堡垒机用户扩展包个数。1个扩展包对应20个用户数</p> 
     * @return PackageIOAUserCount <p>零信任堡垒机用户扩展包个数。1个扩展包对应20个用户数</p>
     */
    public Long getPackageIOAUserCount() {
        return this.PackageIOAUserCount;
    }

    /**
     * Set <p>零信任堡垒机用户扩展包个数。1个扩展包对应20个用户数</p>
     * @param PackageIOAUserCount <p>零信任堡垒机用户扩展包个数。1个扩展包对应20个用户数</p>
     */
    public void setPackageIOAUserCount(Long PackageIOAUserCount) {
        this.PackageIOAUserCount = PackageIOAUserCount;
    }

    /**
     * Get <p>零信任堡垒机带宽扩展包个数。一个扩展包表示4M带宽</p> 
     * @return PackageIOABandwidth <p>零信任堡垒机带宽扩展包个数。一个扩展包表示4M带宽</p>
     */
    public Long getPackageIOABandwidth() {
        return this.PackageIOABandwidth;
    }

    /**
     * Set <p>零信任堡垒机带宽扩展包个数。一个扩展包表示4M带宽</p>
     * @param PackageIOABandwidth <p>零信任堡垒机带宽扩展包个数。一个扩展包表示4M带宽</p>
     */
    public void setPackageIOABandwidth(Long PackageIOABandwidth) {
        this.PackageIOABandwidth = PackageIOABandwidth;
    }

    /**
     * Get <p>堡垒机实例对应的零信任实例id</p> 
     * @return IOAResourceId <p>堡垒机实例对应的零信任实例id</p>
     */
    public String getIOAResourceId() {
        return this.IOAResourceId;
    }

    /**
     * Set <p>堡垒机实例对应的零信任实例id</p>
     * @param IOAResourceId <p>堡垒机实例对应的零信任实例id</p>
     */
    public void setIOAResourceId(String IOAResourceId) {
        this.IOAResourceId = IOAResourceId;
    }

    /**
     * Get <p>资源类型 免费版/标准版/专业版 /国密版 free/standard/pro/gm</p> 
     * @return ResourceEdition <p>资源类型 免费版/标准版/专业版 /国密版 free/standard/pro/gm</p>
     */
    public String getResourceEdition() {
        return this.ResourceEdition;
    }

    /**
     * Set <p>资源类型 免费版/标准版/专业版 /国密版 free/standard/pro/gm</p>
     * @param ResourceEdition <p>资源类型 免费版/标准版/专业版 /国密版 free/standard/pro/gm</p>
     */
    public void setResourceEdition(String ResourceEdition) {
        this.ResourceEdition = ResourceEdition;
    }

    /**
     * Get <p>计费周期 年：y，月：m，日：d，时：h，分：M，秒：s，一次性购买：p</p> 
     * @return TimeUnit <p>计费周期 年：y，月：m，日：d，时：h，分：M，秒：s，一次性购买：p</p>
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set <p>计费周期 年：y，月：m，日：d，时：h，分：M，秒：s，一次性购买：p</p>
     * @param TimeUnit <p>计费周期 年：y，月：m，日：d，时：h，分：M，秒：s，一次性购买：p</p>
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get <p>计费时长</p> 
     * @return TimeSpan <p>计费时长</p>
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set <p>计费时长</p>
     * @param TimeSpan <p>计费时长</p>
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get <p>计费模式 0后付费，1预付费</p> 
     * @return PayMode <p>计费模式 0后付费，1预付费</p>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>计费模式 0后付费，1预付费</p>
     * @param PayMode <p>计费模式 0后付费，1预付费</p>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>计费侧地域</p> 
     * @return BillingRegion <p>计费侧地域</p>
     */
    public String getBillingRegion() {
        return this.BillingRegion;
    }

    /**
     * Set <p>计费侧地域</p>
     * @param BillingRegion <p>计费侧地域</p>
     */
    public void setBillingRegion(String BillingRegion) {
        this.BillingRegion = BillingRegion;
    }

    /**
     * Get <p>计费侧可用区</p> 
     * @return BillingZone <p>计费侧可用区</p>
     */
    public String getBillingZone() {
        return this.BillingZone;
    }

    /**
     * Set <p>计费侧可用区</p>
     * @param BillingZone <p>计费侧可用区</p>
     */
    public void setBillingZone(String BillingZone) {
        this.BillingZone = BillingZone;
    }

    /**
     * Get <p>部署的cvm个数</p> 
     * @return DeployCvmCount <p>部署的cvm个数</p>
     */
    public Long getDeployCvmCount() {
        return this.DeployCvmCount;
    }

    /**
     * Set <p>部署的cvm个数</p>
     * @param DeployCvmCount <p>部署的cvm个数</p>
     */
    public void setDeployCvmCount(Long DeployCvmCount) {
        this.DeployCvmCount = DeployCvmCount;
    }

    /**
     * Get <p>堡垒机实例的可用区信息</p> 
     * @return ResourceZoneSet <p>堡垒机实例的可用区信息</p>
     */
    public ResourceDeployZone [] getResourceZoneSet() {
        return this.ResourceZoneSet;
    }

    /**
     * Set <p>堡垒机实例的可用区信息</p>
     * @param ResourceZoneSet <p>堡垒机实例的可用区信息</p>
     */
    public void setResourceZoneSet(ResourceDeployZone [] ResourceZoneSet) {
        this.ResourceZoneSet = ResourceZoneSet;
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
        if (source.EnabledDomainCount != null) {
            this.EnabledDomainCount = new Long(source.EnabledDomainCount);
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
        if (source.IntranetSubnetIdSet != null) {
            this.IntranetSubnetIdSet = new String[source.IntranetSubnetIdSet.length];
            for (int i = 0; i < source.IntranetSubnetIdSet.length; i++) {
                this.IntranetSubnetIdSet[i] = new String(source.IntranetSubnetIdSet[i]);
            }
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
        if (source.ResourceEdition != null) {
            this.ResourceEdition = new String(source.ResourceEdition);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.BillingRegion != null) {
            this.BillingRegion = new String(source.BillingRegion);
        }
        if (source.BillingZone != null) {
            this.BillingZone = new String(source.BillingZone);
        }
        if (source.DeployCvmCount != null) {
            this.DeployCvmCount = new Long(source.DeployCvmCount);
        }
        if (source.ResourceZoneSet != null) {
            this.ResourceZoneSet = new ResourceDeployZone[source.ResourceZoneSet.length];
            for (int i = 0; i < source.ResourceZoneSet.length; i++) {
                this.ResourceZoneSet[i] = new ResourceDeployZone(source.ResourceZoneSet[i]);
            }
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
        this.setParamSimple(map, prefix + "EnabledDomainCount", this.EnabledDomainCount);
        this.setParamSimple(map, prefix + "Trial", this.Trial);
        this.setParamSimple(map, prefix + "LogDelivery", this.LogDelivery);
        this.setParamSimple(map, prefix + "CdcClusterId", this.CdcClusterId);
        this.setParamSimple(map, prefix + "DeployModel", this.DeployModel);
        this.setParamSimple(map, prefix + "IntranetAccess", this.IntranetAccess);
        this.setParamArraySimple(map, prefix + "IntranetPrivateIpSet.", this.IntranetPrivateIpSet);
        this.setParamSimple(map, prefix + "IntranetVpcId", this.IntranetVpcId);
        this.setParamSimple(map, prefix + "IntranetSubnetId", this.IntranetSubnetId);
        this.setParamArraySimple(map, prefix + "IntranetSubnetIdSet.", this.IntranetSubnetIdSet);
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
        this.setParamSimple(map, prefix + "ResourceEdition", this.ResourceEdition);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "BillingRegion", this.BillingRegion);
        this.setParamSimple(map, prefix + "BillingZone", this.BillingZone);
        this.setParamSimple(map, prefix + "DeployCvmCount", this.DeployCvmCount);
        this.setParamArrayObj(map, prefix + "ResourceZoneSet.", this.ResourceZoneSet);

    }
}

