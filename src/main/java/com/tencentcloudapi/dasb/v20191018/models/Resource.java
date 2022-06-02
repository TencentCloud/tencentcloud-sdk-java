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
package com.tencentcloudapi.dasb.v20191018.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Resource extends AbstractModel{

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

    }
}

