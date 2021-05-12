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

public class Asset extends AbstractModel{

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
    @SerializedName("AssetRegionName")
    @Expose
    private String AssetRegionName;

    /**
    * 所属网络
    */
    @SerializedName("AssetVpcid")
    @Expose
    private String AssetVpcid;

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
    * 引擎版本
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * 数据库标识
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
    * 配置风险统计数
    */
    @SerializedName("AssetCspmRiskNum")
    @Expose
    private Long AssetCspmRiskNum;

    /**
    * 主机IP
    */
    @SerializedName("PublicIpAddresses")
    @Expose
    private String [] PublicIpAddresses;

    /**
    * 资产唯一标识
    */
    @SerializedName("AssetUniqid")
    @Expose
    private String AssetUniqid;

    /**
    * 付费类型
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * 安全事件统计数
    */
    @SerializedName("AssetEventNum")
    @Expose
    private Long AssetEventNum;

    /**
    * 漏洞统计数
    */
    @SerializedName("AssetVulNum")
    @Expose
    private Long AssetVulNum;

    /**
    * 主机IP内网
    */
    @SerializedName("PrivateIpAddresses")
    @Expose
    private String [] PrivateIpAddresses;

    /**
    * 所属分组
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 发现时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SsaAssetDiscoverTime")
    @Expose
    private String SsaAssetDiscoverTime;

    /**
    * 下线时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SsaAssetDeleteTime")
    @Expose
    private String SsaAssetDeleteTime;

    /**
    * 是否是新增资产
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsNew")
    @Expose
    private Boolean IsNew;

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
    * 负载均衡实例的网络类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LoadBalancerType")
    @Expose
    private String LoadBalancerType;

    /**
    * 负载均衡实例的vip列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LoadBalancerVips")
    @Expose
    private String [] LoadBalancerVips;

    /**
    * ipv6信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetIpv6")
    @Expose
    private String [] AssetIpv6;

    /**
    * ssh端口暴露风险
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SSHRisk")
    @Expose
    private String SSHRisk;

    /**
    * rdp端口暴露风险
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RDPRisk")
    @Expose
    private String RDPRisk;

    /**
    * 资产失陷事件风险
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventRisk")
    @Expose
    private String EventRisk;

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
     * @return AssetRegionName 区域
     */
    public String getAssetRegionName() {
        return this.AssetRegionName;
    }

    /**
     * Set 区域
     * @param AssetRegionName 区域
     */
    public void setAssetRegionName(String AssetRegionName) {
        this.AssetRegionName = AssetRegionName;
    }

    /**
     * Get 所属网络 
     * @return AssetVpcid 所属网络
     */
    public String getAssetVpcid() {
        return this.AssetVpcid;
    }

    /**
     * Set 所属网络
     * @param AssetVpcid 所属网络
     */
    public void setAssetVpcid(String AssetVpcid) {
        this.AssetVpcid = AssetVpcid;
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
     * Get 数据库标识 
     * @return Id 数据库标识
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 数据库标识
     * @param Id 数据库标识
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
     * Get 配置风险统计数 
     * @return AssetCspmRiskNum 配置风险统计数
     */
    public Long getAssetCspmRiskNum() {
        return this.AssetCspmRiskNum;
    }

    /**
     * Set 配置风险统计数
     * @param AssetCspmRiskNum 配置风险统计数
     */
    public void setAssetCspmRiskNum(Long AssetCspmRiskNum) {
        this.AssetCspmRiskNum = AssetCspmRiskNum;
    }

    /**
     * Get 主机IP 
     * @return PublicIpAddresses 主机IP
     */
    public String [] getPublicIpAddresses() {
        return this.PublicIpAddresses;
    }

    /**
     * Set 主机IP
     * @param PublicIpAddresses 主机IP
     */
    public void setPublicIpAddresses(String [] PublicIpAddresses) {
        this.PublicIpAddresses = PublicIpAddresses;
    }

    /**
     * Get 资产唯一标识 
     * @return AssetUniqid 资产唯一标识
     */
    public String getAssetUniqid() {
        return this.AssetUniqid;
    }

    /**
     * Set 资产唯一标识
     * @param AssetUniqid 资产唯一标识
     */
    public void setAssetUniqid(String AssetUniqid) {
        this.AssetUniqid = AssetUniqid;
    }

    /**
     * Get 付费类型 
     * @return ChargeType 付费类型
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set 付费类型
     * @param ChargeType 付费类型
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get 安全事件统计数 
     * @return AssetEventNum 安全事件统计数
     */
    public Long getAssetEventNum() {
        return this.AssetEventNum;
    }

    /**
     * Set 安全事件统计数
     * @param AssetEventNum 安全事件统计数
     */
    public void setAssetEventNum(Long AssetEventNum) {
        this.AssetEventNum = AssetEventNum;
    }

    /**
     * Get 漏洞统计数 
     * @return AssetVulNum 漏洞统计数
     */
    public Long getAssetVulNum() {
        return this.AssetVulNum;
    }

    /**
     * Set 漏洞统计数
     * @param AssetVulNum 漏洞统计数
     */
    public void setAssetVulNum(Long AssetVulNum) {
        this.AssetVulNum = AssetVulNum;
    }

    /**
     * Get 主机IP内网 
     * @return PrivateIpAddresses 主机IP内网
     */
    public String [] getPrivateIpAddresses() {
        return this.PrivateIpAddresses;
    }

    /**
     * Set 主机IP内网
     * @param PrivateIpAddresses 主机IP内网
     */
    public void setPrivateIpAddresses(String [] PrivateIpAddresses) {
        this.PrivateIpAddresses = PrivateIpAddresses;
    }

    /**
     * Get 所属分组 
     * @return GroupName 所属分组
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 所属分组
     * @param GroupName 所属分组
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 发现时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SsaAssetDiscoverTime 发现时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSsaAssetDiscoverTime() {
        return this.SsaAssetDiscoverTime;
    }

    /**
     * Set 发现时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param SsaAssetDiscoverTime 发现时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSsaAssetDiscoverTime(String SsaAssetDiscoverTime) {
        this.SsaAssetDiscoverTime = SsaAssetDiscoverTime;
    }

    /**
     * Get 下线时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SsaAssetDeleteTime 下线时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSsaAssetDeleteTime() {
        return this.SsaAssetDeleteTime;
    }

    /**
     * Set 下线时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param SsaAssetDeleteTime 下线时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSsaAssetDeleteTime(String SsaAssetDeleteTime) {
        this.SsaAssetDeleteTime = SsaAssetDeleteTime;
    }

    /**
     * Get 是否是新增资产
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsNew 是否是新增资产
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsNew() {
        return this.IsNew;
    }

    /**
     * Set 是否是新增资产
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsNew 是否是新增资产
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsNew(Boolean IsNew) {
        this.IsNew = IsNew;
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
     * Get 负载均衡实例的网络类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LoadBalancerType 负载均衡实例的网络类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLoadBalancerType() {
        return this.LoadBalancerType;
    }

    /**
     * Set 负载均衡实例的网络类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param LoadBalancerType 负载均衡实例的网络类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLoadBalancerType(String LoadBalancerType) {
        this.LoadBalancerType = LoadBalancerType;
    }

    /**
     * Get 负载均衡实例的vip列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LoadBalancerVips 负载均衡实例的vip列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getLoadBalancerVips() {
        return this.LoadBalancerVips;
    }

    /**
     * Set 负载均衡实例的vip列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param LoadBalancerVips 负载均衡实例的vip列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLoadBalancerVips(String [] LoadBalancerVips) {
        this.LoadBalancerVips = LoadBalancerVips;
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
     * Get ssh端口暴露风险
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SSHRisk ssh端口暴露风险
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSSHRisk() {
        return this.SSHRisk;
    }

    /**
     * Set ssh端口暴露风险
注意：此字段可能返回 null，表示取不到有效值。
     * @param SSHRisk ssh端口暴露风险
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSSHRisk(String SSHRisk) {
        this.SSHRisk = SSHRisk;
    }

    /**
     * Get rdp端口暴露风险
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RDPRisk rdp端口暴露风险
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRDPRisk() {
        return this.RDPRisk;
    }

    /**
     * Set rdp端口暴露风险
注意：此字段可能返回 null，表示取不到有效值。
     * @param RDPRisk rdp端口暴露风险
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRDPRisk(String RDPRisk) {
        this.RDPRisk = RDPRisk;
    }

    /**
     * Get 资产失陷事件风险
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventRisk 资产失陷事件风险
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventRisk() {
        return this.EventRisk;
    }

    /**
     * Set 资产失陷事件风险
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventRisk 资产失陷事件风险
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventRisk(String EventRisk) {
        this.EventRisk = EventRisk;
    }

    public Asset() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Asset(Asset source) {
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AssetRegionName != null) {
            this.AssetRegionName = new String(source.AssetRegionName);
        }
        if (source.AssetVpcid != null) {
            this.AssetVpcid = new String(source.AssetVpcid);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceState != null) {
            this.InstanceState = new String(source.InstanceState);
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
        if (source.AssetCspmRiskNum != null) {
            this.AssetCspmRiskNum = new Long(source.AssetCspmRiskNum);
        }
        if (source.PublicIpAddresses != null) {
            this.PublicIpAddresses = new String[source.PublicIpAddresses.length];
            for (int i = 0; i < source.PublicIpAddresses.length; i++) {
                this.PublicIpAddresses[i] = new String(source.PublicIpAddresses[i]);
            }
        }
        if (source.AssetUniqid != null) {
            this.AssetUniqid = new String(source.AssetUniqid);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.AssetEventNum != null) {
            this.AssetEventNum = new Long(source.AssetEventNum);
        }
        if (source.AssetVulNum != null) {
            this.AssetVulNum = new Long(source.AssetVulNum);
        }
        if (source.PrivateIpAddresses != null) {
            this.PrivateIpAddresses = new String[source.PrivateIpAddresses.length];
            for (int i = 0; i < source.PrivateIpAddresses.length; i++) {
                this.PrivateIpAddresses[i] = new String(source.PrivateIpAddresses[i]);
            }
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.SsaAssetDiscoverTime != null) {
            this.SsaAssetDiscoverTime = new String(source.SsaAssetDiscoverTime);
        }
        if (source.SsaAssetDeleteTime != null) {
            this.SsaAssetDeleteTime = new String(source.SsaAssetDeleteTime);
        }
        if (source.IsNew != null) {
            this.IsNew = new Boolean(source.IsNew);
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
        if (source.LoadBalancerType != null) {
            this.LoadBalancerType = new String(source.LoadBalancerType);
        }
        if (source.LoadBalancerVips != null) {
            this.LoadBalancerVips = new String[source.LoadBalancerVips.length];
            for (int i = 0; i < source.LoadBalancerVips.length; i++) {
                this.LoadBalancerVips[i] = new String(source.LoadBalancerVips[i]);
            }
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "AssetRegionName", this.AssetRegionName);
        this.setParamSimple(map, prefix + "AssetVpcid", this.AssetVpcid);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceState", this.InstanceState);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);
        this.setParamSimple(map, prefix + "AssetCspmRiskNum", this.AssetCspmRiskNum);
        this.setParamArraySimple(map, prefix + "PublicIpAddresses.", this.PublicIpAddresses);
        this.setParamSimple(map, prefix + "AssetUniqid", this.AssetUniqid);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "AssetEventNum", this.AssetEventNum);
        this.setParamSimple(map, prefix + "AssetVulNum", this.AssetVulNum);
        this.setParamArraySimple(map, prefix + "PrivateIpAddresses.", this.PrivateIpAddresses);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "SsaAssetDiscoverTime", this.SsaAssetDiscoverTime);
        this.setParamSimple(map, prefix + "SsaAssetDeleteTime", this.SsaAssetDeleteTime);
        this.setParamSimple(map, prefix + "IsNew", this.IsNew);
        this.setParamSimple(map, prefix + "AssetSubnetId", this.AssetSubnetId);
        this.setParamSimple(map, prefix + "AssetSubnetName", this.AssetSubnetName);
        this.setParamSimple(map, prefix + "AssetVpcName", this.AssetVpcName);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "NameSpace", this.NameSpace);
        this.setParamSimple(map, prefix + "LoadBalancerType", this.LoadBalancerType);
        this.setParamArraySimple(map, prefix + "LoadBalancerVips.", this.LoadBalancerVips);
        this.setParamArraySimple(map, prefix + "AssetIpv6.", this.AssetIpv6);
        this.setParamSimple(map, prefix + "SSHRisk", this.SSHRisk);
        this.setParamSimple(map, prefix + "RDPRisk", this.RDPRisk);
        this.setParamSimple(map, prefix + "EventRisk", this.EventRisk);

    }
}

