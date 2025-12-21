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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceDetail extends AbstractModel {

    /**
    * <p>ckafka集群实例Id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>ckafka集群实例名称</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>访问实例的vip 信息</p>
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * <p>访问实例的端口信息</p>
    */
    @SerializedName("Vport")
    @Expose
    private String Vport;

    /**
    * <p>虚拟IP列表</p>
    */
    @SerializedName("VipList")
    @Expose
    private VipEntity [] VipList;

    /**
    * <p>实例的状态。0: 创建中，1: 运行中，2: 删除中,  3: 已删除,  5: 隔离中,  7: 升级中,  -1: 创建失败 </p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>实例带宽，单位Mbps</p>
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * <p>ckafka集群实例磁盘大小，单位G</p>
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * <p>可用区域ID</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * <p>vpcId，如果为空，说明是基础网络</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>子网id</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>实例是否续费，int  枚举值：1表示自动续费，2表示明确不自动续费</p>
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * <p>实例状态 int：1表示健康，2表示告警，3 表示实例状态异常</p>
    */
    @SerializedName("Healthy")
    @Expose
    private Long Healthy;

    /**
    * <p>实例状态信息</p>
    */
    @SerializedName("HealthyMessage")
    @Expose
    private String HealthyMessage;

    /**
    * <p>实例创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>实例过期时间</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * <p>是否为内部客户。值为1 表示内部客户</p>
    */
    @SerializedName("IsInternal")
    @Expose
    private Long IsInternal;

    /**
    * <p>Topic个数</p>
    */
    @SerializedName("TopicNum")
    @Expose
    private Long TopicNum;

    /**
    * <p>标识tag</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>kafka版本信息</p>
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * <p>跨可用区</p>
    */
    @SerializedName("ZoneIds")
    @Expose
    private Long [] ZoneIds;

    /**
    * <p>ckafka售卖类型</p>
    */
    @SerializedName("Cvm")
    @Expose
    private Long Cvm;

    /**
    * <p>ckafka集群实例类型</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>ckafka集群实例磁盘类型</p>
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * <p>当前规格最大Topic数</p>
    */
    @SerializedName("MaxTopicNumber")
    @Expose
    private Long MaxTopicNumber;

    /**
    * <p>当前规格最大Partition数</p>
    */
    @SerializedName("MaxPartitionNumber")
    @Expose
    private Long MaxPartitionNumber;

    /**
    * <p>计划升级配置时间</p>
    */
    @SerializedName("RebalanceTime")
    @Expose
    private String RebalanceTime;

    /**
    * <p>实例当前partition数量</p>
    */
    @SerializedName("PartitionNumber")
    @Expose
    private Long PartitionNumber;

    /**
    * <p>ckafka集群实例公网带宽类型</p>
    */
    @SerializedName("PublicNetworkChargeType")
    @Expose
    private String PublicNetworkChargeType;

    /**
    * <p>公网带宽 最小3Mbps  最大999Mbps 仅专业版支持填写</p>
    */
    @SerializedName("PublicNetwork")
    @Expose
    private Long PublicNetwork;

    /**
    * <p>ckafka集群实例底层集群类型</p>
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * <p>实例功能列表</p>
    */
    @SerializedName("Features")
    @Expose
    private String [] Features;

    /**
     * Get <p>ckafka集群实例Id</p> 
     * @return InstanceId <p>ckafka集群实例Id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>ckafka集群实例Id</p>
     * @param InstanceId <p>ckafka集群实例Id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>ckafka集群实例名称</p> 
     * @return InstanceName <p>ckafka集群实例名称</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>ckafka集群实例名称</p>
     * @param InstanceName <p>ckafka集群实例名称</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>访问实例的vip 信息</p> 
     * @return Vip <p>访问实例的vip 信息</p>
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set <p>访问实例的vip 信息</p>
     * @param Vip <p>访问实例的vip 信息</p>
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get <p>访问实例的端口信息</p> 
     * @return Vport <p>访问实例的端口信息</p>
     */
    public String getVport() {
        return this.Vport;
    }

    /**
     * Set <p>访问实例的端口信息</p>
     * @param Vport <p>访问实例的端口信息</p>
     */
    public void setVport(String Vport) {
        this.Vport = Vport;
    }

    /**
     * Get <p>虚拟IP列表</p> 
     * @return VipList <p>虚拟IP列表</p>
     */
    public VipEntity [] getVipList() {
        return this.VipList;
    }

    /**
     * Set <p>虚拟IP列表</p>
     * @param VipList <p>虚拟IP列表</p>
     */
    public void setVipList(VipEntity [] VipList) {
        this.VipList = VipList;
    }

    /**
     * Get <p>实例的状态。0: 创建中，1: 运行中，2: 删除中,  3: 已删除,  5: 隔离中,  7: 升级中,  -1: 创建失败 </p> 
     * @return Status <p>实例的状态。0: 创建中，1: 运行中，2: 删除中,  3: 已删除,  5: 隔离中,  7: 升级中,  -1: 创建失败 </p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>实例的状态。0: 创建中，1: 运行中，2: 删除中,  3: 已删除,  5: 隔离中,  7: 升级中,  -1: 创建失败 </p>
     * @param Status <p>实例的状态。0: 创建中，1: 运行中，2: 删除中,  3: 已删除,  5: 隔离中,  7: 升级中,  -1: 创建失败 </p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>实例带宽，单位Mbps</p> 
     * @return Bandwidth <p>实例带宽，单位Mbps</p>
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set <p>实例带宽，单位Mbps</p>
     * @param Bandwidth <p>实例带宽，单位Mbps</p>
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get <p>ckafka集群实例磁盘大小，单位G</p> 
     * @return DiskSize <p>ckafka集群实例磁盘大小，单位G</p>
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set <p>ckafka集群实例磁盘大小，单位G</p>
     * @param DiskSize <p>ckafka集群实例磁盘大小，单位G</p>
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get <p>可用区域ID</p> 
     * @return ZoneId <p>可用区域ID</p>
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>可用区域ID</p>
     * @param ZoneId <p>可用区域ID</p>
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>vpcId，如果为空，说明是基础网络</p> 
     * @return VpcId <p>vpcId，如果为空，说明是基础网络</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>vpcId，如果为空，说明是基础网络</p>
     * @param VpcId <p>vpcId，如果为空，说明是基础网络</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>子网id</p> 
     * @return SubnetId <p>子网id</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>子网id</p>
     * @param SubnetId <p>子网id</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>实例是否续费，int  枚举值：1表示自动续费，2表示明确不自动续费</p> 
     * @return RenewFlag <p>实例是否续费，int  枚举值：1表示自动续费，2表示明确不自动续费</p>
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set <p>实例是否续费，int  枚举值：1表示自动续费，2表示明确不自动续费</p>
     * @param RenewFlag <p>实例是否续费，int  枚举值：1表示自动续费，2表示明确不自动续费</p>
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get <p>实例状态 int：1表示健康，2表示告警，3 表示实例状态异常</p> 
     * @return Healthy <p>实例状态 int：1表示健康，2表示告警，3 表示实例状态异常</p>
     */
    public Long getHealthy() {
        return this.Healthy;
    }

    /**
     * Set <p>实例状态 int：1表示健康，2表示告警，3 表示实例状态异常</p>
     * @param Healthy <p>实例状态 int：1表示健康，2表示告警，3 表示实例状态异常</p>
     */
    public void setHealthy(Long Healthy) {
        this.Healthy = Healthy;
    }

    /**
     * Get <p>实例状态信息</p> 
     * @return HealthyMessage <p>实例状态信息</p>
     */
    public String getHealthyMessage() {
        return this.HealthyMessage;
    }

    /**
     * Set <p>实例状态信息</p>
     * @param HealthyMessage <p>实例状态信息</p>
     */
    public void setHealthyMessage(String HealthyMessage) {
        this.HealthyMessage = HealthyMessage;
    }

    /**
     * Get <p>实例创建时间</p> 
     * @return CreateTime <p>实例创建时间</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>实例创建时间</p>
     * @param CreateTime <p>实例创建时间</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>实例过期时间</p> 
     * @return ExpireTime <p>实例过期时间</p>
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>实例过期时间</p>
     * @param ExpireTime <p>实例过期时间</p>
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>是否为内部客户。值为1 表示内部客户</p> 
     * @return IsInternal <p>是否为内部客户。值为1 表示内部客户</p>
     */
    public Long getIsInternal() {
        return this.IsInternal;
    }

    /**
     * Set <p>是否为内部客户。值为1 表示内部客户</p>
     * @param IsInternal <p>是否为内部客户。值为1 表示内部客户</p>
     */
    public void setIsInternal(Long IsInternal) {
        this.IsInternal = IsInternal;
    }

    /**
     * Get <p>Topic个数</p> 
     * @return TopicNum <p>Topic个数</p>
     */
    public Long getTopicNum() {
        return this.TopicNum;
    }

    /**
     * Set <p>Topic个数</p>
     * @param TopicNum <p>Topic个数</p>
     */
    public void setTopicNum(Long TopicNum) {
        this.TopicNum = TopicNum;
    }

    /**
     * Get <p>标识tag</p> 
     * @return Tags <p>标识tag</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标识tag</p>
     * @param Tags <p>标识tag</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>kafka版本信息</p> 
     * @return Version <p>kafka版本信息</p>
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>kafka版本信息</p>
     * @param Version <p>kafka版本信息</p>
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get <p>跨可用区</p> 
     * @return ZoneIds <p>跨可用区</p>
     */
    public Long [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set <p>跨可用区</p>
     * @param ZoneIds <p>跨可用区</p>
     */
    public void setZoneIds(Long [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get <p>ckafka售卖类型</p> 
     * @return Cvm <p>ckafka售卖类型</p>
     */
    public Long getCvm() {
        return this.Cvm;
    }

    /**
     * Set <p>ckafka售卖类型</p>
     * @param Cvm <p>ckafka售卖类型</p>
     */
    public void setCvm(Long Cvm) {
        this.Cvm = Cvm;
    }

    /**
     * Get <p>ckafka集群实例类型</p> 
     * @return InstanceType <p>ckafka集群实例类型</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>ckafka集群实例类型</p>
     * @param InstanceType <p>ckafka集群实例类型</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>ckafka集群实例磁盘类型</p> 
     * @return DiskType <p>ckafka集群实例磁盘类型</p>
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set <p>ckafka集群实例磁盘类型</p>
     * @param DiskType <p>ckafka集群实例磁盘类型</p>
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get <p>当前规格最大Topic数</p> 
     * @return MaxTopicNumber <p>当前规格最大Topic数</p>
     */
    public Long getMaxTopicNumber() {
        return this.MaxTopicNumber;
    }

    /**
     * Set <p>当前规格最大Topic数</p>
     * @param MaxTopicNumber <p>当前规格最大Topic数</p>
     */
    public void setMaxTopicNumber(Long MaxTopicNumber) {
        this.MaxTopicNumber = MaxTopicNumber;
    }

    /**
     * Get <p>当前规格最大Partition数</p> 
     * @return MaxPartitionNumber <p>当前规格最大Partition数</p>
     */
    public Long getMaxPartitionNumber() {
        return this.MaxPartitionNumber;
    }

    /**
     * Set <p>当前规格最大Partition数</p>
     * @param MaxPartitionNumber <p>当前规格最大Partition数</p>
     */
    public void setMaxPartitionNumber(Long MaxPartitionNumber) {
        this.MaxPartitionNumber = MaxPartitionNumber;
    }

    /**
     * Get <p>计划升级配置时间</p> 
     * @return RebalanceTime <p>计划升级配置时间</p>
     */
    public String getRebalanceTime() {
        return this.RebalanceTime;
    }

    /**
     * Set <p>计划升级配置时间</p>
     * @param RebalanceTime <p>计划升级配置时间</p>
     */
    public void setRebalanceTime(String RebalanceTime) {
        this.RebalanceTime = RebalanceTime;
    }

    /**
     * Get <p>实例当前partition数量</p> 
     * @return PartitionNumber <p>实例当前partition数量</p>
     */
    public Long getPartitionNumber() {
        return this.PartitionNumber;
    }

    /**
     * Set <p>实例当前partition数量</p>
     * @param PartitionNumber <p>实例当前partition数量</p>
     */
    public void setPartitionNumber(Long PartitionNumber) {
        this.PartitionNumber = PartitionNumber;
    }

    /**
     * Get <p>ckafka集群实例公网带宽类型</p> 
     * @return PublicNetworkChargeType <p>ckafka集群实例公网带宽类型</p>
     */
    public String getPublicNetworkChargeType() {
        return this.PublicNetworkChargeType;
    }

    /**
     * Set <p>ckafka集群实例公网带宽类型</p>
     * @param PublicNetworkChargeType <p>ckafka集群实例公网带宽类型</p>
     */
    public void setPublicNetworkChargeType(String PublicNetworkChargeType) {
        this.PublicNetworkChargeType = PublicNetworkChargeType;
    }

    /**
     * Get <p>公网带宽 最小3Mbps  最大999Mbps 仅专业版支持填写</p> 
     * @return PublicNetwork <p>公网带宽 最小3Mbps  最大999Mbps 仅专业版支持填写</p>
     */
    public Long getPublicNetwork() {
        return this.PublicNetwork;
    }

    /**
     * Set <p>公网带宽 最小3Mbps  最大999Mbps 仅专业版支持填写</p>
     * @param PublicNetwork <p>公网带宽 最小3Mbps  最大999Mbps 仅专业版支持填写</p>
     */
    public void setPublicNetwork(Long PublicNetwork) {
        this.PublicNetwork = PublicNetwork;
    }

    /**
     * Get <p>ckafka集群实例底层集群类型</p> 
     * @return ClusterType <p>ckafka集群实例底层集群类型</p>
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set <p>ckafka集群实例底层集群类型</p>
     * @param ClusterType <p>ckafka集群实例底层集群类型</p>
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get <p>实例功能列表</p> 
     * @return Features <p>实例功能列表</p>
     */
    public String [] getFeatures() {
        return this.Features;
    }

    /**
     * Set <p>实例功能列表</p>
     * @param Features <p>实例功能列表</p>
     */
    public void setFeatures(String [] Features) {
        this.Features = Features;
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
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.Features != null) {
            this.Features = new String[source.Features.length];
            for (int i = 0; i < source.Features.length; i++) {
                this.Features[i] = new String(source.Features[i]);
            }
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
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamArraySimple(map, prefix + "Features.", this.Features);

    }
}

