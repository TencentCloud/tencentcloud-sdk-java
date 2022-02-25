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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceDetail extends AbstractModel{

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 访问实例的vip 信息
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 访问实例的端口信息
    */
    @SerializedName("Vport")
    @Expose
    private String Vport;

    /**
    * 虚拟IP列表
    */
    @SerializedName("VipList")
    @Expose
    private VipEntity [] VipList;

    /**
    * 实例的状态。0：创建中，1：运行中，2：删除中：5隔离中， -1 创建失败
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 实例带宽，单位Mbps
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * 实例的存储大小，单位GB
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 可用区域ID
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * vpcId，如果为空，说明是基础网络
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网id
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 实例是否续费，int  枚举值：1表示自动续费，2表示明确不自动续费
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * 实例状态 int：1表示健康，2表示告警，3 表示实例状态异常
    */
    @SerializedName("Healthy")
    @Expose
    private Long Healthy;

    /**
    * 实例状态信息
    */
    @SerializedName("HealthyMessage")
    @Expose
    private String HealthyMessage;

    /**
    * 实例创建时间时间
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 实例过期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * 是否为内部客户。值为1 表示内部客户
    */
    @SerializedName("IsInternal")
    @Expose
    private Long IsInternal;

    /**
    * Topic个数
    */
    @SerializedName("TopicNum")
    @Expose
    private Long TopicNum;

    /**
    * 标识tag
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * kafka版本信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 跨可用区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneIds")
    @Expose
    private Long [] ZoneIds;

    /**
    * ckafka售卖类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cvm")
    @Expose
    private Long Cvm;

    /**
    * ckafka实例类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 磁盘类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 当前规格最大Topic数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxTopicNumber")
    @Expose
    private Long MaxTopicNumber;

    /**
    * 当前规格最大Partition数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxPartitionNumber")
    @Expose
    private Long MaxPartitionNumber;

    /**
    * 计划升级配置时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RebalanceTime")
    @Expose
    private String RebalanceTime;

    /**
    * 实例当前partition数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PartitionNumber")
    @Expose
    private Long PartitionNumber;

    /**
    * 公网带宽类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicNetworkChargeType")
    @Expose
    private String PublicNetworkChargeType;

    /**
    * 公网带宽值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicNetwork")
    @Expose
    private Long PublicNetwork;

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 访问实例的vip 信息 
     * @return Vip 访问实例的vip 信息
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 访问实例的vip 信息
     * @param Vip 访问实例的vip 信息
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 访问实例的端口信息 
     * @return Vport 访问实例的端口信息
     */
    public String getVport() {
        return this.Vport;
    }

    /**
     * Set 访问实例的端口信息
     * @param Vport 访问实例的端口信息
     */
    public void setVport(String Vport) {
        this.Vport = Vport;
    }

    /**
     * Get 虚拟IP列表 
     * @return VipList 虚拟IP列表
     */
    public VipEntity [] getVipList() {
        return this.VipList;
    }

    /**
     * Set 虚拟IP列表
     * @param VipList 虚拟IP列表
     */
    public void setVipList(VipEntity [] VipList) {
        this.VipList = VipList;
    }

    /**
     * Get 实例的状态。0：创建中，1：运行中，2：删除中：5隔离中， -1 创建失败 
     * @return Status 实例的状态。0：创建中，1：运行中，2：删除中：5隔离中， -1 创建失败
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 实例的状态。0：创建中，1：运行中，2：删除中：5隔离中， -1 创建失败
     * @param Status 实例的状态。0：创建中，1：运行中，2：删除中：5隔离中， -1 创建失败
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 实例带宽，单位Mbps 
     * @return Bandwidth 实例带宽，单位Mbps
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 实例带宽，单位Mbps
     * @param Bandwidth 实例带宽，单位Mbps
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get 实例的存储大小，单位GB 
     * @return DiskSize 实例的存储大小，单位GB
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 实例的存储大小，单位GB
     * @param DiskSize 实例的存储大小，单位GB
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 可用区域ID 
     * @return ZoneId 可用区域ID
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 可用区域ID
     * @param ZoneId 可用区域ID
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get vpcId，如果为空，说明是基础网络 
     * @return VpcId vpcId，如果为空，说明是基础网络
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpcId，如果为空，说明是基础网络
     * @param VpcId vpcId，如果为空，说明是基础网络
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网id 
     * @return SubnetId 子网id
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网id
     * @param SubnetId 子网id
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 实例是否续费，int  枚举值：1表示自动续费，2表示明确不自动续费 
     * @return RenewFlag 实例是否续费，int  枚举值：1表示自动续费，2表示明确不自动续费
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 实例是否续费，int  枚举值：1表示自动续费，2表示明确不自动续费
     * @param RenewFlag 实例是否续费，int  枚举值：1表示自动续费，2表示明确不自动续费
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 实例状态 int：1表示健康，2表示告警，3 表示实例状态异常 
     * @return Healthy 实例状态 int：1表示健康，2表示告警，3 表示实例状态异常
     */
    public Long getHealthy() {
        return this.Healthy;
    }

    /**
     * Set 实例状态 int：1表示健康，2表示告警，3 表示实例状态异常
     * @param Healthy 实例状态 int：1表示健康，2表示告警，3 表示实例状态异常
     */
    public void setHealthy(Long Healthy) {
        this.Healthy = Healthy;
    }

    /**
     * Get 实例状态信息 
     * @return HealthyMessage 实例状态信息
     */
    public String getHealthyMessage() {
        return this.HealthyMessage;
    }

    /**
     * Set 实例状态信息
     * @param HealthyMessage 实例状态信息
     */
    public void setHealthyMessage(String HealthyMessage) {
        this.HealthyMessage = HealthyMessage;
    }

    /**
     * Get 实例创建时间时间 
     * @return CreateTime 实例创建时间时间
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 实例创建时间时间
     * @param CreateTime 实例创建时间时间
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 实例过期时间 
     * @return ExpireTime 实例过期时间
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 实例过期时间
     * @param ExpireTime 实例过期时间
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 是否为内部客户。值为1 表示内部客户 
     * @return IsInternal 是否为内部客户。值为1 表示内部客户
     */
    public Long getIsInternal() {
        return this.IsInternal;
    }

    /**
     * Set 是否为内部客户。值为1 表示内部客户
     * @param IsInternal 是否为内部客户。值为1 表示内部客户
     */
    public void setIsInternal(Long IsInternal) {
        this.IsInternal = IsInternal;
    }

    /**
     * Get Topic个数 
     * @return TopicNum Topic个数
     */
    public Long getTopicNum() {
        return this.TopicNum;
    }

    /**
     * Set Topic个数
     * @param TopicNum Topic个数
     */
    public void setTopicNum(Long TopicNum) {
        this.TopicNum = TopicNum;
    }

    /**
     * Get 标识tag 
     * @return Tags 标识tag
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标识tag
     * @param Tags 标识tag
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get kafka版本信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version kafka版本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set kafka版本信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version kafka版本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 跨可用区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneIds 跨可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set 跨可用区
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneIds 跨可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneIds(Long [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get ckafka售卖类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cvm ckafka售卖类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCvm() {
        return this.Cvm;
    }

    /**
     * Set ckafka售卖类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cvm ckafka售卖类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCvm(Long Cvm) {
        this.Cvm = Cvm;
    }

    /**
     * Get ckafka实例类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceType ckafka实例类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set ckafka实例类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceType ckafka实例类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 磁盘类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskType 磁盘类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 磁盘类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskType 磁盘类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 当前规格最大Topic数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxTopicNumber 当前规格最大Topic数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxTopicNumber() {
        return this.MaxTopicNumber;
    }

    /**
     * Set 当前规格最大Topic数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxTopicNumber 当前规格最大Topic数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxTopicNumber(Long MaxTopicNumber) {
        this.MaxTopicNumber = MaxTopicNumber;
    }

    /**
     * Get 当前规格最大Partition数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxPartitionNumber 当前规格最大Partition数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxPartitionNumber() {
        return this.MaxPartitionNumber;
    }

    /**
     * Set 当前规格最大Partition数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxPartitionNumber 当前规格最大Partition数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxPartitionNumber(Long MaxPartitionNumber) {
        this.MaxPartitionNumber = MaxPartitionNumber;
    }

    /**
     * Get 计划升级配置时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RebalanceTime 计划升级配置时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRebalanceTime() {
        return this.RebalanceTime;
    }

    /**
     * Set 计划升级配置时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param RebalanceTime 计划升级配置时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRebalanceTime(String RebalanceTime) {
        this.RebalanceTime = RebalanceTime;
    }

    /**
     * Get 实例当前partition数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PartitionNumber 实例当前partition数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPartitionNumber() {
        return this.PartitionNumber;
    }

    /**
     * Set 实例当前partition数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param PartitionNumber 实例当前partition数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPartitionNumber(Long PartitionNumber) {
        this.PartitionNumber = PartitionNumber;
    }

    /**
     * Get 公网带宽类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicNetworkChargeType 公网带宽类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublicNetworkChargeType() {
        return this.PublicNetworkChargeType;
    }

    /**
     * Set 公网带宽类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicNetworkChargeType 公网带宽类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicNetworkChargeType(String PublicNetworkChargeType) {
        this.PublicNetworkChargeType = PublicNetworkChargeType;
    }

    /**
     * Get 公网带宽值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicNetwork 公网带宽值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPublicNetwork() {
        return this.PublicNetwork;
    }

    /**
     * Set 公网带宽值
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicNetwork 公网带宽值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicNetwork(Long PublicNetwork) {
        this.PublicNetwork = PublicNetwork;
    }

    public InstanceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceDetail(InstanceDetail source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new String(source.Vport);
        }
        if (source.VipList != null) {
            this.VipList = new VipEntity[source.VipList.length];
            for (int i = 0; i < source.VipList.length; i++) {
                this.VipList[i] = new VipEntity(source.VipList[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.Healthy != null) {
            this.Healthy = new Long(source.Healthy);
        }
        if (source.HealthyMessage != null) {
            this.HealthyMessage = new String(source.HealthyMessage);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.IsInternal != null) {
            this.IsInternal = new Long(source.IsInternal);
        }
        if (source.TopicNum != null) {
            this.TopicNum = new Long(source.TopicNum);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.ZoneIds != null) {
            this.ZoneIds = new Long[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new Long(source.ZoneIds[i]);
            }
        }
        if (source.Cvm != null) {
            this.Cvm = new Long(source.Cvm);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.MaxTopicNumber != null) {
            this.MaxTopicNumber = new Long(source.MaxTopicNumber);
        }
        if (source.MaxPartitionNumber != null) {
            this.MaxPartitionNumber = new Long(source.MaxPartitionNumber);
        }
        if (source.RebalanceTime != null) {
            this.RebalanceTime = new String(source.RebalanceTime);
        }
        if (source.PartitionNumber != null) {
            this.PartitionNumber = new Long(source.PartitionNumber);
        }
        if (source.PublicNetworkChargeType != null) {
            this.PublicNetworkChargeType = new String(source.PublicNetworkChargeType);
        }
        if (source.PublicNetwork != null) {
            this.PublicNetwork = new Long(source.PublicNetwork);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamArrayObj(map, prefix + "VipList.", this.VipList);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "Healthy", this.Healthy);
        this.setParamSimple(map, prefix + "HealthyMessage", this.HealthyMessage);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "IsInternal", this.IsInternal);
        this.setParamSimple(map, prefix + "TopicNum", this.TopicNum);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamSimple(map, prefix + "Cvm", this.Cvm);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "MaxTopicNumber", this.MaxTopicNumber);
        this.setParamSimple(map, prefix + "MaxPartitionNumber", this.MaxPartitionNumber);
        this.setParamSimple(map, prefix + "RebalanceTime", this.RebalanceTime);
        this.setParamSimple(map, prefix + "PartitionNumber", this.PartitionNumber);
        this.setParamSimple(map, prefix + "PublicNetworkChargeType", this.PublicNetworkChargeType);
        this.setParamSimple(map, prefix + "PublicNetwork", this.PublicNetwork);

    }
}

