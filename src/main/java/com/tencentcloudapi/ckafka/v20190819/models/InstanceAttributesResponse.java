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

public class InstanceAttributesResponse extends AbstractModel{

    /**
    * 实例ID
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
    * 接入点 VIP 列表信息
    */
    @SerializedName("VipList")
    @Expose
    private VipEntity [] VipList;

    /**
    * 虚拟IP
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 虚拟端口
    */
    @SerializedName("Vport")
    @Expose
    private String Vport;

    /**
    * 实例的状态。0：创建中，1：运行中，2：删除中
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 实例带宽，单位：Mbps
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * 实例的存储大小，单位：GB
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 可用区
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * VPC 的 ID，为空表示是基础网络
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网 ID， 为空表示基础网络
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 实例健康状态， 1：健康，2：告警，3：异常
    */
    @SerializedName("Healthy")
    @Expose
    private Long Healthy;

    /**
    * 实例健康信息，当前会展示磁盘利用率，最大长度为256
    */
    @SerializedName("HealthyMessage")
    @Expose
    private String HealthyMessage;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 消息保存时间,单位为分钟
    */
    @SerializedName("MsgRetentionTime")
    @Expose
    private Long MsgRetentionTime;

    /**
    * 自动创建 Topic 配置， 若该字段为空，则表示未开启自动创建
    */
    @SerializedName("Config")
    @Expose
    private InstanceConfigDO Config;

    /**
    * 剩余创建分区数
    */
    @SerializedName("RemainderPartitions")
    @Expose
    private Long RemainderPartitions;

    /**
    * 剩余创建主题数
    */
    @SerializedName("RemainderTopics")
    @Expose
    private Long RemainderTopics;

    /**
    * 当前创建分区数
    */
    @SerializedName("CreatedPartitions")
    @Expose
    private Long CreatedPartitions;

    /**
    * 当前创建主题数
    */
    @SerializedName("CreatedTopics")
    @Expose
    private Long CreatedTopics;

    /**
    * 标签数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 过期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * 跨可用区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneIds")
    @Expose
    private Long [] ZoneIds;

    /**
    * kafka版本信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 最大分组数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxGroupNum")
    @Expose
    private Long MaxGroupNum;

    /**
    * 售卖类型,0:标准版,1:专业版
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cvm")
    @Expose
    private Long Cvm;

    /**
    * 类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 表示该实例支持的特性。FEATURE_SUBNET_ACL:表示acl策略支持设置子网。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Features")
    @Expose
    private String [] Features;

    /**
    * 动态消息保留策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RetentionTimeConfig")
    @Expose
    private DynamicRetentionTime RetentionTimeConfig;

    /**
    * 最大连接数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxConnection")
    @Expose
    private Long MaxConnection;

    /**
    * 公网带宽
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicNetwork")
    @Expose
    private Long PublicNetwork;

    /**
    * 时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeleteRouteTimestamp")
    @Expose
    private String DeleteRouteTimestamp;

    /**
    * 剩余创建分区数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RemainingPartitions")
    @Expose
    private Long RemainingPartitions;

    /**
    * 剩余创建主题数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RemainingTopics")
    @Expose
    private Long RemainingTopics;

    /**
    * 动态硬盘扩容策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DynamicDiskConfig")
    @Expose
    private DynamicDiskConfig DynamicDiskConfig;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
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
     * Get 接入点 VIP 列表信息 
     * @return VipList 接入点 VIP 列表信息
     */
    public VipEntity [] getVipList() {
        return this.VipList;
    }

    /**
     * Set 接入点 VIP 列表信息
     * @param VipList 接入点 VIP 列表信息
     */
    public void setVipList(VipEntity [] VipList) {
        this.VipList = VipList;
    }

    /**
     * Get 虚拟IP 
     * @return Vip 虚拟IP
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 虚拟IP
     * @param Vip 虚拟IP
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 虚拟端口 
     * @return Vport 虚拟端口
     */
    public String getVport() {
        return this.Vport;
    }

    /**
     * Set 虚拟端口
     * @param Vport 虚拟端口
     */
    public void setVport(String Vport) {
        this.Vport = Vport;
    }

    /**
     * Get 实例的状态。0：创建中，1：运行中，2：删除中 
     * @return Status 实例的状态。0：创建中，1：运行中，2：删除中
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 实例的状态。0：创建中，1：运行中，2：删除中
     * @param Status 实例的状态。0：创建中，1：运行中，2：删除中
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 实例带宽，单位：Mbps 
     * @return Bandwidth 实例带宽，单位：Mbps
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 实例带宽，单位：Mbps
     * @param Bandwidth 实例带宽，单位：Mbps
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get 实例的存储大小，单位：GB 
     * @return DiskSize 实例的存储大小，单位：GB
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 实例的存储大小，单位：GB
     * @param DiskSize 实例的存储大小，单位：GB
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 可用区 
     * @return ZoneId 可用区
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 可用区
     * @param ZoneId 可用区
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get VPC 的 ID，为空表示是基础网络 
     * @return VpcId VPC 的 ID，为空表示是基础网络
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC 的 ID，为空表示是基础网络
     * @param VpcId VPC 的 ID，为空表示是基础网络
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网 ID， 为空表示基础网络 
     * @return SubnetId 子网 ID， 为空表示基础网络
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网 ID， 为空表示基础网络
     * @param SubnetId 子网 ID， 为空表示基础网络
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 实例健康状态， 1：健康，2：告警，3：异常 
     * @return Healthy 实例健康状态， 1：健康，2：告警，3：异常
     */
    public Long getHealthy() {
        return this.Healthy;
    }

    /**
     * Set 实例健康状态， 1：健康，2：告警，3：异常
     * @param Healthy 实例健康状态， 1：健康，2：告警，3：异常
     */
    public void setHealthy(Long Healthy) {
        this.Healthy = Healthy;
    }

    /**
     * Get 实例健康信息，当前会展示磁盘利用率，最大长度为256 
     * @return HealthyMessage 实例健康信息，当前会展示磁盘利用率，最大长度为256
     */
    public String getHealthyMessage() {
        return this.HealthyMessage;
    }

    /**
     * Set 实例健康信息，当前会展示磁盘利用率，最大长度为256
     * @param HealthyMessage 实例健康信息，当前会展示磁盘利用率，最大长度为256
     */
    public void setHealthyMessage(String HealthyMessage) {
        this.HealthyMessage = HealthyMessage;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 消息保存时间,单位为分钟 
     * @return MsgRetentionTime 消息保存时间,单位为分钟
     */
    public Long getMsgRetentionTime() {
        return this.MsgRetentionTime;
    }

    /**
     * Set 消息保存时间,单位为分钟
     * @param MsgRetentionTime 消息保存时间,单位为分钟
     */
    public void setMsgRetentionTime(Long MsgRetentionTime) {
        this.MsgRetentionTime = MsgRetentionTime;
    }

    /**
     * Get 自动创建 Topic 配置， 若该字段为空，则表示未开启自动创建 
     * @return Config 自动创建 Topic 配置， 若该字段为空，则表示未开启自动创建
     */
    public InstanceConfigDO getConfig() {
        return this.Config;
    }

    /**
     * Set 自动创建 Topic 配置， 若该字段为空，则表示未开启自动创建
     * @param Config 自动创建 Topic 配置， 若该字段为空，则表示未开启自动创建
     */
    public void setConfig(InstanceConfigDO Config) {
        this.Config = Config;
    }

    /**
     * Get 剩余创建分区数 
     * @return RemainderPartitions 剩余创建分区数
     */
    public Long getRemainderPartitions() {
        return this.RemainderPartitions;
    }

    /**
     * Set 剩余创建分区数
     * @param RemainderPartitions 剩余创建分区数
     */
    public void setRemainderPartitions(Long RemainderPartitions) {
        this.RemainderPartitions = RemainderPartitions;
    }

    /**
     * Get 剩余创建主题数 
     * @return RemainderTopics 剩余创建主题数
     */
    public Long getRemainderTopics() {
        return this.RemainderTopics;
    }

    /**
     * Set 剩余创建主题数
     * @param RemainderTopics 剩余创建主题数
     */
    public void setRemainderTopics(Long RemainderTopics) {
        this.RemainderTopics = RemainderTopics;
    }

    /**
     * Get 当前创建分区数 
     * @return CreatedPartitions 当前创建分区数
     */
    public Long getCreatedPartitions() {
        return this.CreatedPartitions;
    }

    /**
     * Set 当前创建分区数
     * @param CreatedPartitions 当前创建分区数
     */
    public void setCreatedPartitions(Long CreatedPartitions) {
        this.CreatedPartitions = CreatedPartitions;
    }

    /**
     * Get 当前创建主题数 
     * @return CreatedTopics 当前创建主题数
     */
    public Long getCreatedTopics() {
        return this.CreatedTopics;
    }

    /**
     * Set 当前创建主题数
     * @param CreatedTopics 当前创建主题数
     */
    public void setCreatedTopics(Long CreatedTopics) {
        this.CreatedTopics = CreatedTopics;
    }

    /**
     * Get 标签数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 标签数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 标签数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 过期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
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
     * Get 最大分组数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxGroupNum 最大分组数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxGroupNum() {
        return this.MaxGroupNum;
    }

    /**
     * Set 最大分组数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxGroupNum 最大分组数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxGroupNum(Long MaxGroupNum) {
        this.MaxGroupNum = MaxGroupNum;
    }

    /**
     * Get 售卖类型,0:标准版,1:专业版
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cvm 售卖类型,0:标准版,1:专业版
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCvm() {
        return this.Cvm;
    }

    /**
     * Set 售卖类型,0:标准版,1:专业版
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cvm 售卖类型,0:标准版,1:专业版
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCvm(Long Cvm) {
        this.Cvm = Cvm;
    }

    /**
     * Get 类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceType 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceType 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 表示该实例支持的特性。FEATURE_SUBNET_ACL:表示acl策略支持设置子网。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Features 表示该实例支持的特性。FEATURE_SUBNET_ACL:表示acl策略支持设置子网。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getFeatures() {
        return this.Features;
    }

    /**
     * Set 表示该实例支持的特性。FEATURE_SUBNET_ACL:表示acl策略支持设置子网。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Features 表示该实例支持的特性。FEATURE_SUBNET_ACL:表示acl策略支持设置子网。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFeatures(String [] Features) {
        this.Features = Features;
    }

    /**
     * Get 动态消息保留策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RetentionTimeConfig 动态消息保留策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DynamicRetentionTime getRetentionTimeConfig() {
        return this.RetentionTimeConfig;
    }

    /**
     * Set 动态消息保留策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param RetentionTimeConfig 动态消息保留策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRetentionTimeConfig(DynamicRetentionTime RetentionTimeConfig) {
        this.RetentionTimeConfig = RetentionTimeConfig;
    }

    /**
     * Get 最大连接数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxConnection 最大连接数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxConnection() {
        return this.MaxConnection;
    }

    /**
     * Set 最大连接数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxConnection 最大连接数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxConnection(Long MaxConnection) {
        this.MaxConnection = MaxConnection;
    }

    /**
     * Get 公网带宽
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicNetwork 公网带宽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPublicNetwork() {
        return this.PublicNetwork;
    }

    /**
     * Set 公网带宽
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicNetwork 公网带宽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicNetwork(Long PublicNetwork) {
        this.PublicNetwork = PublicNetwork;
    }

    /**
     * Get 时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeleteRouteTimestamp 时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeleteRouteTimestamp() {
        return this.DeleteRouteTimestamp;
    }

    /**
     * Set 时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeleteRouteTimestamp 时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeleteRouteTimestamp(String DeleteRouteTimestamp) {
        this.DeleteRouteTimestamp = DeleteRouteTimestamp;
    }

    /**
     * Get 剩余创建分区数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RemainingPartitions 剩余创建分区数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRemainingPartitions() {
        return this.RemainingPartitions;
    }

    /**
     * Set 剩余创建分区数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RemainingPartitions 剩余创建分区数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemainingPartitions(Long RemainingPartitions) {
        this.RemainingPartitions = RemainingPartitions;
    }

    /**
     * Get 剩余创建主题数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RemainingTopics 剩余创建主题数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRemainingTopics() {
        return this.RemainingTopics;
    }

    /**
     * Set 剩余创建主题数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RemainingTopics 剩余创建主题数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemainingTopics(Long RemainingTopics) {
        this.RemainingTopics = RemainingTopics;
    }

    /**
     * Get 动态硬盘扩容策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DynamicDiskConfig 动态硬盘扩容策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DynamicDiskConfig getDynamicDiskConfig() {
        return this.DynamicDiskConfig;
    }

    /**
     * Set 动态硬盘扩容策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param DynamicDiskConfig 动态硬盘扩容策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDynamicDiskConfig(DynamicDiskConfig DynamicDiskConfig) {
        this.DynamicDiskConfig = DynamicDiskConfig;
    }

    public InstanceAttributesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceAttributesResponse(InstanceAttributesResponse source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.VipList != null) {
            this.VipList = new VipEntity[source.VipList.length];
            for (int i = 0; i < source.VipList.length; i++) {
                this.VipList[i] = new VipEntity(source.VipList[i]);
            }
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new String(source.Vport);
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
        if (source.Healthy != null) {
            this.Healthy = new Long(source.Healthy);
        }
        if (source.HealthyMessage != null) {
            this.HealthyMessage = new String(source.HealthyMessage);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.MsgRetentionTime != null) {
            this.MsgRetentionTime = new Long(source.MsgRetentionTime);
        }
        if (source.Config != null) {
            this.Config = new InstanceConfigDO(source.Config);
        }
        if (source.RemainderPartitions != null) {
            this.RemainderPartitions = new Long(source.RemainderPartitions);
        }
        if (source.RemainderTopics != null) {
            this.RemainderTopics = new Long(source.RemainderTopics);
        }
        if (source.CreatedPartitions != null) {
            this.CreatedPartitions = new Long(source.CreatedPartitions);
        }
        if (source.CreatedTopics != null) {
            this.CreatedTopics = new Long(source.CreatedTopics);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.ZoneIds != null) {
            this.ZoneIds = new Long[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new Long(source.ZoneIds[i]);
            }
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.MaxGroupNum != null) {
            this.MaxGroupNum = new Long(source.MaxGroupNum);
        }
        if (source.Cvm != null) {
            this.Cvm = new Long(source.Cvm);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.Features != null) {
            this.Features = new String[source.Features.length];
            for (int i = 0; i < source.Features.length; i++) {
                this.Features[i] = new String(source.Features[i]);
            }
        }
        if (source.RetentionTimeConfig != null) {
            this.RetentionTimeConfig = new DynamicRetentionTime(source.RetentionTimeConfig);
        }
        if (source.MaxConnection != null) {
            this.MaxConnection = new Long(source.MaxConnection);
        }
        if (source.PublicNetwork != null) {
            this.PublicNetwork = new Long(source.PublicNetwork);
        }
        if (source.DeleteRouteTimestamp != null) {
            this.DeleteRouteTimestamp = new String(source.DeleteRouteTimestamp);
        }
        if (source.RemainingPartitions != null) {
            this.RemainingPartitions = new Long(source.RemainingPartitions);
        }
        if (source.RemainingTopics != null) {
            this.RemainingTopics = new Long(source.RemainingTopics);
        }
        if (source.DynamicDiskConfig != null) {
            this.DynamicDiskConfig = new DynamicDiskConfig(source.DynamicDiskConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArrayObj(map, prefix + "VipList.", this.VipList);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Healthy", this.Healthy);
        this.setParamSimple(map, prefix + "HealthyMessage", this.HealthyMessage);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "MsgRetentionTime", this.MsgRetentionTime);
        this.setParamObj(map, prefix + "Config.", this.Config);
        this.setParamSimple(map, prefix + "RemainderPartitions", this.RemainderPartitions);
        this.setParamSimple(map, prefix + "RemainderTopics", this.RemainderTopics);
        this.setParamSimple(map, prefix + "CreatedPartitions", this.CreatedPartitions);
        this.setParamSimple(map, prefix + "CreatedTopics", this.CreatedTopics);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "MaxGroupNum", this.MaxGroupNum);
        this.setParamSimple(map, prefix + "Cvm", this.Cvm);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamArraySimple(map, prefix + "Features.", this.Features);
        this.setParamObj(map, prefix + "RetentionTimeConfig.", this.RetentionTimeConfig);
        this.setParamSimple(map, prefix + "MaxConnection", this.MaxConnection);
        this.setParamSimple(map, prefix + "PublicNetwork", this.PublicNetwork);
        this.setParamSimple(map, prefix + "DeleteRouteTimestamp", this.DeleteRouteTimestamp);
        this.setParamSimple(map, prefix + "RemainingPartitions", this.RemainingPartitions);
        this.setParamSimple(map, prefix + "RemainingTopics", this.RemainingTopics);
        this.setParamObj(map, prefix + "DynamicDiskConfig.", this.DynamicDiskConfig);

    }
}

