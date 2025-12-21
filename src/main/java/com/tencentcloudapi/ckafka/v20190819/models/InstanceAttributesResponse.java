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

public class InstanceAttributesResponse extends AbstractModel {

    /**
    * <p>ckafka集群实例Id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>ckafka集群实例Name</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>接入点 VIP 列表信息</p>
    */
    @SerializedName("VipList")
    @Expose
    private VipEntity [] VipList;

    /**
    * <p>虚拟IP</p>
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * <p>虚拟端口</p>
    */
    @SerializedName("Vport")
    @Expose
    private String Vport;

    /**
    * <p>实例的状态。0: 创建中，1: 运行中，2: 删除中,  3: 已删除,  5: 隔离中,  7: 升级中,  -1: 创建失败 </p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>实例带宽，单位：Mbps</p>
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * <p>实例的存储大小，单位：GB</p>
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * <p>可用区</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * <p>VPC 的 ID，为空表示是基础网络</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>子网 ID， 为空表示基础网络</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>实例健康状态， 1：健康，2：告警，3：异常</p>
    */
    @SerializedName("Healthy")
    @Expose
    private Long Healthy;

    /**
    * <p>实例健康信息，当前会展示磁盘利用率，最大长度为256</p>
    */
    @SerializedName("HealthyMessage")
    @Expose
    private String HealthyMessage;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>消息保存时间,单位为分钟</p>
    */
    @SerializedName("MsgRetentionTime")
    @Expose
    private Long MsgRetentionTime;

    /**
    * <p>自动创建 Topic 配置， 若该字段为空，则表示未开启自动创建</p>
    */
    @SerializedName("Config")
    @Expose
    private InstanceConfigDO Config;

    /**
    * <p>剩余创建分区数</p>
    */
    @SerializedName("RemainderPartitions")
    @Expose
    private Long RemainderPartitions;

    /**
    * <p>剩余创建主题数</p>
    */
    @SerializedName("RemainderTopics")
    @Expose
    private Long RemainderTopics;

    /**
    * <p>当前创建分区数</p>
    */
    @SerializedName("CreatedPartitions")
    @Expose
    private Long CreatedPartitions;

    /**
    * <p>当前创建主题数</p>
    */
    @SerializedName("CreatedTopics")
    @Expose
    private Long CreatedTopics;

    /**
    * <p>标签数组</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>过期时间</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * <p>可用区列表</p>
    */
    @SerializedName("ZoneIds")
    @Expose
    private Long [] ZoneIds;

    /**
    * <p>ckafka集群实例版本</p>
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * <p>最大分组数</p>
    */
    @SerializedName("MaxGroupNum")
    @Expose
    private Long MaxGroupNum;

    /**
    * <p>售卖类型,0:标准版,1:专业版</p>
    */
    @SerializedName("Cvm")
    @Expose
    private Long Cvm;

    /**
    * <p>实例类型  枚举列表: profession  :专业版  <br />standards2  :标准版premium   :高级版serverless  :serverless版</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>表示该实例支持的特性。FEATURE_SUBNET_ACL:表示acl策略支持设置子网。</p>
    */
    @SerializedName("Features")
    @Expose
    private String [] Features;

    /**
    * <p>动态消息保留策略</p>
    */
    @SerializedName("RetentionTimeConfig")
    @Expose
    private DynamicRetentionTime RetentionTimeConfig;

    /**
    * <p>最大连接数</p>
    */
    @SerializedName("MaxConnection")
    @Expose
    private Long MaxConnection;

    /**
    * <p>公网带宽</p>
    */
    @SerializedName("PublicNetwork")
    @Expose
    private Long PublicNetwork;

    /**
    * <p>该字段已废弃,无实际含义</p>
    */
    @SerializedName("DeleteRouteTimestamp")
    @Expose
    private String DeleteRouteTimestamp;

    /**
    * <p>剩余创建分区数</p>
    */
    @SerializedName("RemainingPartitions")
    @Expose
    private Long RemainingPartitions;

    /**
    * <p>剩余创建主题数</p>
    */
    @SerializedName("RemainingTopics")
    @Expose
    private Long RemainingTopics;

    /**
    * <p>动态硬盘扩容策略</p>
    */
    @SerializedName("DynamicDiskConfig")
    @Expose
    private DynamicDiskConfig DynamicDiskConfig;

    /**
    * <p>系统维护时间</p>
    */
    @SerializedName("SystemMaintenanceTime")
    @Expose
    private String SystemMaintenanceTime;

    /**
    * <p>实例级别消息最大大小</p>
    */
    @SerializedName("MaxMessageByte")
    @Expose
    private Long MaxMessageByte;

    /**
    * <p>实例计费类型  POSTPAID_BY_HOUR 按小时付费; PREPAID 包年包月</p>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * <p>是否开启弹性带宽白名单 <br />1:已开启弹性带宽白名单;0:未开启弹性带宽白名单;</p>
    */
    @SerializedName("ElasticBandwidthSwitch")
    @Expose
    private Long ElasticBandwidthSwitch;

    /**
    * <p>弹性带宽开通状态1:未开启弹性带宽;16: 开启弹性带宽中;32:开启弹性带宽成功;33:关闭弹性带宽中;34:关闭弹性带宽成功;64:开启弹性带宽失败;65:关闭弹性带宽失败;</p>
    */
    @SerializedName("ElasticBandwidthOpenStatus")
    @Expose
    private Long ElasticBandwidthOpenStatus;

    /**
    * <p>集群类型<br />CLOUD_IDC IDC集群CLOUD_CVM_SHARE CVM共享集群CLOUD_CVM_YUNTI 云梯CVM集群CLOUD_CVM    CVM集群CLOUD_CDC CDC集群CLOUD_EKS_TSE EKS集群</p>
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * <p>免费分区数量</p>
    */
    @SerializedName("FreePartitionNumber")
    @Expose
    private Long FreePartitionNumber;

    /**
    * <p>弹性带宽上浮值</p>
    */
    @SerializedName("ElasticFloatBandwidth")
    @Expose
    private Long ElasticFloatBandwidth;

    /**
    * <p>ssl自定义证书id  仅自定义证书实例集群返回</p>
    */
    @SerializedName("CustomCertId")
    @Expose
    private String CustomCertId;

    /**
    * <p>集群topic默认 unclean.leader.election.enable配置: 1 开启 0 关闭</p>
    */
    @SerializedName("UncleanLeaderElectionEnable")
    @Expose
    private Long UncleanLeaderElectionEnable;

    /**
    * <p>实例删除保护开关: 1 开启 0 关闭</p>
    */
    @SerializedName("DeleteProtectionEnable")
    @Expose
    private Long DeleteProtectionEnable;

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
     * Get <p>ckafka集群实例Name</p> 
     * @return InstanceName <p>ckafka集群实例Name</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>ckafka集群实例Name</p>
     * @param InstanceName <p>ckafka集群实例Name</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>接入点 VIP 列表信息</p> 
     * @return VipList <p>接入点 VIP 列表信息</p>
     */
    public VipEntity [] getVipList() {
        return this.VipList;
    }

    /**
     * Set <p>接入点 VIP 列表信息</p>
     * @param VipList <p>接入点 VIP 列表信息</p>
     */
    public void setVipList(VipEntity [] VipList) {
        this.VipList = VipList;
    }

    /**
     * Get <p>虚拟IP</p> 
     * @return Vip <p>虚拟IP</p>
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set <p>虚拟IP</p>
     * @param Vip <p>虚拟IP</p>
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get <p>虚拟端口</p> 
     * @return Vport <p>虚拟端口</p>
     */
    public String getVport() {
        return this.Vport;
    }

    /**
     * Set <p>虚拟端口</p>
     * @param Vport <p>虚拟端口</p>
     */
    public void setVport(String Vport) {
        this.Vport = Vport;
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
     * Get <p>实例带宽，单位：Mbps</p> 
     * @return Bandwidth <p>实例带宽，单位：Mbps</p>
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set <p>实例带宽，单位：Mbps</p>
     * @param Bandwidth <p>实例带宽，单位：Mbps</p>
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get <p>实例的存储大小，单位：GB</p> 
     * @return DiskSize <p>实例的存储大小，单位：GB</p>
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set <p>实例的存储大小，单位：GB</p>
     * @param DiskSize <p>实例的存储大小，单位：GB</p>
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get <p>可用区</p> 
     * @return ZoneId <p>可用区</p>
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>可用区</p>
     * @param ZoneId <p>可用区</p>
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>VPC 的 ID，为空表示是基础网络</p> 
     * @return VpcId <p>VPC 的 ID，为空表示是基础网络</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC 的 ID，为空表示是基础网络</p>
     * @param VpcId <p>VPC 的 ID，为空表示是基础网络</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>子网 ID， 为空表示基础网络</p> 
     * @return SubnetId <p>子网 ID， 为空表示基础网络</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>子网 ID， 为空表示基础网络</p>
     * @param SubnetId <p>子网 ID， 为空表示基础网络</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>实例健康状态， 1：健康，2：告警，3：异常</p> 
     * @return Healthy <p>实例健康状态， 1：健康，2：告警，3：异常</p>
     */
    public Long getHealthy() {
        return this.Healthy;
    }

    /**
     * Set <p>实例健康状态， 1：健康，2：告警，3：异常</p>
     * @param Healthy <p>实例健康状态， 1：健康，2：告警，3：异常</p>
     */
    public void setHealthy(Long Healthy) {
        this.Healthy = Healthy;
    }

    /**
     * Get <p>实例健康信息，当前会展示磁盘利用率，最大长度为256</p> 
     * @return HealthyMessage <p>实例健康信息，当前会展示磁盘利用率，最大长度为256</p>
     */
    public String getHealthyMessage() {
        return this.HealthyMessage;
    }

    /**
     * Set <p>实例健康信息，当前会展示磁盘利用率，最大长度为256</p>
     * @param HealthyMessage <p>实例健康信息，当前会展示磁盘利用率，最大长度为256</p>
     */
    public void setHealthyMessage(String HealthyMessage) {
        this.HealthyMessage = HealthyMessage;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>消息保存时间,单位为分钟</p> 
     * @return MsgRetentionTime <p>消息保存时间,单位为分钟</p>
     */
    public Long getMsgRetentionTime() {
        return this.MsgRetentionTime;
    }

    /**
     * Set <p>消息保存时间,单位为分钟</p>
     * @param MsgRetentionTime <p>消息保存时间,单位为分钟</p>
     */
    public void setMsgRetentionTime(Long MsgRetentionTime) {
        this.MsgRetentionTime = MsgRetentionTime;
    }

    /**
     * Get <p>自动创建 Topic 配置， 若该字段为空，则表示未开启自动创建</p> 
     * @return Config <p>自动创建 Topic 配置， 若该字段为空，则表示未开启自动创建</p>
     */
    public InstanceConfigDO getConfig() {
        return this.Config;
    }

    /**
     * Set <p>自动创建 Topic 配置， 若该字段为空，则表示未开启自动创建</p>
     * @param Config <p>自动创建 Topic 配置， 若该字段为空，则表示未开启自动创建</p>
     */
    public void setConfig(InstanceConfigDO Config) {
        this.Config = Config;
    }

    /**
     * Get <p>剩余创建分区数</p> 
     * @return RemainderPartitions <p>剩余创建分区数</p>
     */
    public Long getRemainderPartitions() {
        return this.RemainderPartitions;
    }

    /**
     * Set <p>剩余创建分区数</p>
     * @param RemainderPartitions <p>剩余创建分区数</p>
     */
    public void setRemainderPartitions(Long RemainderPartitions) {
        this.RemainderPartitions = RemainderPartitions;
    }

    /**
     * Get <p>剩余创建主题数</p> 
     * @return RemainderTopics <p>剩余创建主题数</p>
     */
    public Long getRemainderTopics() {
        return this.RemainderTopics;
    }

    /**
     * Set <p>剩余创建主题数</p>
     * @param RemainderTopics <p>剩余创建主题数</p>
     */
    public void setRemainderTopics(Long RemainderTopics) {
        this.RemainderTopics = RemainderTopics;
    }

    /**
     * Get <p>当前创建分区数</p> 
     * @return CreatedPartitions <p>当前创建分区数</p>
     */
    public Long getCreatedPartitions() {
        return this.CreatedPartitions;
    }

    /**
     * Set <p>当前创建分区数</p>
     * @param CreatedPartitions <p>当前创建分区数</p>
     */
    public void setCreatedPartitions(Long CreatedPartitions) {
        this.CreatedPartitions = CreatedPartitions;
    }

    /**
     * Get <p>当前创建主题数</p> 
     * @return CreatedTopics <p>当前创建主题数</p>
     */
    public Long getCreatedTopics() {
        return this.CreatedTopics;
    }

    /**
     * Set <p>当前创建主题数</p>
     * @param CreatedTopics <p>当前创建主题数</p>
     */
    public void setCreatedTopics(Long CreatedTopics) {
        this.CreatedTopics = CreatedTopics;
    }

    /**
     * Get <p>标签数组</p> 
     * @return Tags <p>标签数组</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签数组</p>
     * @param Tags <p>标签数组</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>过期时间</p> 
     * @return ExpireTime <p>过期时间</p>
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>过期时间</p>
     * @param ExpireTime <p>过期时间</p>
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>可用区列表</p> 
     * @return ZoneIds <p>可用区列表</p>
     */
    public Long [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set <p>可用区列表</p>
     * @param ZoneIds <p>可用区列表</p>
     */
    public void setZoneIds(Long [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get <p>ckafka集群实例版本</p> 
     * @return Version <p>ckafka集群实例版本</p>
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>ckafka集群实例版本</p>
     * @param Version <p>ckafka集群实例版本</p>
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get <p>最大分组数</p> 
     * @return MaxGroupNum <p>最大分组数</p>
     */
    public Long getMaxGroupNum() {
        return this.MaxGroupNum;
    }

    /**
     * Set <p>最大分组数</p>
     * @param MaxGroupNum <p>最大分组数</p>
     */
    public void setMaxGroupNum(Long MaxGroupNum) {
        this.MaxGroupNum = MaxGroupNum;
    }

    /**
     * Get <p>售卖类型,0:标准版,1:专业版</p> 
     * @return Cvm <p>售卖类型,0:标准版,1:专业版</p>
     */
    public Long getCvm() {
        return this.Cvm;
    }

    /**
     * Set <p>售卖类型,0:标准版,1:专业版</p>
     * @param Cvm <p>售卖类型,0:标准版,1:专业版</p>
     */
    public void setCvm(Long Cvm) {
        this.Cvm = Cvm;
    }

    /**
     * Get <p>实例类型  枚举列表: profession  :专业版  <br />standards2  :标准版premium   :高级版serverless  :serverless版</p> 
     * @return InstanceType <p>实例类型  枚举列表: profession  :专业版  <br />standards2  :标准版premium   :高级版serverless  :serverless版</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>实例类型  枚举列表: profession  :专业版  <br />standards2  :标准版premium   :高级版serverless  :serverless版</p>
     * @param InstanceType <p>实例类型  枚举列表: profession  :专业版  <br />standards2  :标准版premium   :高级版serverless  :serverless版</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>表示该实例支持的特性。FEATURE_SUBNET_ACL:表示acl策略支持设置子网。</p> 
     * @return Features <p>表示该实例支持的特性。FEATURE_SUBNET_ACL:表示acl策略支持设置子网。</p>
     */
    public String [] getFeatures() {
        return this.Features;
    }

    /**
     * Set <p>表示该实例支持的特性。FEATURE_SUBNET_ACL:表示acl策略支持设置子网。</p>
     * @param Features <p>表示该实例支持的特性。FEATURE_SUBNET_ACL:表示acl策略支持设置子网。</p>
     */
    public void setFeatures(String [] Features) {
        this.Features = Features;
    }

    /**
     * Get <p>动态消息保留策略</p> 
     * @return RetentionTimeConfig <p>动态消息保留策略</p>
     */
    public DynamicRetentionTime getRetentionTimeConfig() {
        return this.RetentionTimeConfig;
    }

    /**
     * Set <p>动态消息保留策略</p>
     * @param RetentionTimeConfig <p>动态消息保留策略</p>
     */
    public void setRetentionTimeConfig(DynamicRetentionTime RetentionTimeConfig) {
        this.RetentionTimeConfig = RetentionTimeConfig;
    }

    /**
     * Get <p>最大连接数</p> 
     * @return MaxConnection <p>最大连接数</p>
     */
    public Long getMaxConnection() {
        return this.MaxConnection;
    }

    /**
     * Set <p>最大连接数</p>
     * @param MaxConnection <p>最大连接数</p>
     */
    public void setMaxConnection(Long MaxConnection) {
        this.MaxConnection = MaxConnection;
    }

    /**
     * Get <p>公网带宽</p> 
     * @return PublicNetwork <p>公网带宽</p>
     */
    public Long getPublicNetwork() {
        return this.PublicNetwork;
    }

    /**
     * Set <p>公网带宽</p>
     * @param PublicNetwork <p>公网带宽</p>
     */
    public void setPublicNetwork(Long PublicNetwork) {
        this.PublicNetwork = PublicNetwork;
    }

    /**
     * Get <p>该字段已废弃,无实际含义</p> 
     * @return DeleteRouteTimestamp <p>该字段已废弃,无实际含义</p>
     */
    public String getDeleteRouteTimestamp() {
        return this.DeleteRouteTimestamp;
    }

    /**
     * Set <p>该字段已废弃,无实际含义</p>
     * @param DeleteRouteTimestamp <p>该字段已废弃,无实际含义</p>
     */
    public void setDeleteRouteTimestamp(String DeleteRouteTimestamp) {
        this.DeleteRouteTimestamp = DeleteRouteTimestamp;
    }

    /**
     * Get <p>剩余创建分区数</p> 
     * @return RemainingPartitions <p>剩余创建分区数</p>
     */
    public Long getRemainingPartitions() {
        return this.RemainingPartitions;
    }

    /**
     * Set <p>剩余创建分区数</p>
     * @param RemainingPartitions <p>剩余创建分区数</p>
     */
    public void setRemainingPartitions(Long RemainingPartitions) {
        this.RemainingPartitions = RemainingPartitions;
    }

    /**
     * Get <p>剩余创建主题数</p> 
     * @return RemainingTopics <p>剩余创建主题数</p>
     */
    public Long getRemainingTopics() {
        return this.RemainingTopics;
    }

    /**
     * Set <p>剩余创建主题数</p>
     * @param RemainingTopics <p>剩余创建主题数</p>
     */
    public void setRemainingTopics(Long RemainingTopics) {
        this.RemainingTopics = RemainingTopics;
    }

    /**
     * Get <p>动态硬盘扩容策略</p> 
     * @return DynamicDiskConfig <p>动态硬盘扩容策略</p>
     */
    public DynamicDiskConfig getDynamicDiskConfig() {
        return this.DynamicDiskConfig;
    }

    /**
     * Set <p>动态硬盘扩容策略</p>
     * @param DynamicDiskConfig <p>动态硬盘扩容策略</p>
     */
    public void setDynamicDiskConfig(DynamicDiskConfig DynamicDiskConfig) {
        this.DynamicDiskConfig = DynamicDiskConfig;
    }

    /**
     * Get <p>系统维护时间</p> 
     * @return SystemMaintenanceTime <p>系统维护时间</p>
     */
    public String getSystemMaintenanceTime() {
        return this.SystemMaintenanceTime;
    }

    /**
     * Set <p>系统维护时间</p>
     * @param SystemMaintenanceTime <p>系统维护时间</p>
     */
    public void setSystemMaintenanceTime(String SystemMaintenanceTime) {
        this.SystemMaintenanceTime = SystemMaintenanceTime;
    }

    /**
     * Get <p>实例级别消息最大大小</p> 
     * @return MaxMessageByte <p>实例级别消息最大大小</p>
     */
    public Long getMaxMessageByte() {
        return this.MaxMessageByte;
    }

    /**
     * Set <p>实例级别消息最大大小</p>
     * @param MaxMessageByte <p>实例级别消息最大大小</p>
     */
    public void setMaxMessageByte(Long MaxMessageByte) {
        this.MaxMessageByte = MaxMessageByte;
    }

    /**
     * Get <p>实例计费类型  POSTPAID_BY_HOUR 按小时付费; PREPAID 包年包月</p> 
     * @return InstanceChargeType <p>实例计费类型  POSTPAID_BY_HOUR 按小时付费; PREPAID 包年包月</p>
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set <p>实例计费类型  POSTPAID_BY_HOUR 按小时付费; PREPAID 包年包月</p>
     * @param InstanceChargeType <p>实例计费类型  POSTPAID_BY_HOUR 按小时付费; PREPAID 包年包月</p>
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get <p>是否开启弹性带宽白名单 <br />1:已开启弹性带宽白名单;0:未开启弹性带宽白名单;</p> 
     * @return ElasticBandwidthSwitch <p>是否开启弹性带宽白名单 <br />1:已开启弹性带宽白名单;0:未开启弹性带宽白名单;</p>
     */
    public Long getElasticBandwidthSwitch() {
        return this.ElasticBandwidthSwitch;
    }

    /**
     * Set <p>是否开启弹性带宽白名单 <br />1:已开启弹性带宽白名单;0:未开启弹性带宽白名单;</p>
     * @param ElasticBandwidthSwitch <p>是否开启弹性带宽白名单 <br />1:已开启弹性带宽白名单;0:未开启弹性带宽白名单;</p>
     */
    public void setElasticBandwidthSwitch(Long ElasticBandwidthSwitch) {
        this.ElasticBandwidthSwitch = ElasticBandwidthSwitch;
    }

    /**
     * Get <p>弹性带宽开通状态1:未开启弹性带宽;16: 开启弹性带宽中;32:开启弹性带宽成功;33:关闭弹性带宽中;34:关闭弹性带宽成功;64:开启弹性带宽失败;65:关闭弹性带宽失败;</p> 
     * @return ElasticBandwidthOpenStatus <p>弹性带宽开通状态1:未开启弹性带宽;16: 开启弹性带宽中;32:开启弹性带宽成功;33:关闭弹性带宽中;34:关闭弹性带宽成功;64:开启弹性带宽失败;65:关闭弹性带宽失败;</p>
     */
    public Long getElasticBandwidthOpenStatus() {
        return this.ElasticBandwidthOpenStatus;
    }

    /**
     * Set <p>弹性带宽开通状态1:未开启弹性带宽;16: 开启弹性带宽中;32:开启弹性带宽成功;33:关闭弹性带宽中;34:关闭弹性带宽成功;64:开启弹性带宽失败;65:关闭弹性带宽失败;</p>
     * @param ElasticBandwidthOpenStatus <p>弹性带宽开通状态1:未开启弹性带宽;16: 开启弹性带宽中;32:开启弹性带宽成功;33:关闭弹性带宽中;34:关闭弹性带宽成功;64:开启弹性带宽失败;65:关闭弹性带宽失败;</p>
     */
    public void setElasticBandwidthOpenStatus(Long ElasticBandwidthOpenStatus) {
        this.ElasticBandwidthOpenStatus = ElasticBandwidthOpenStatus;
    }

    /**
     * Get <p>集群类型<br />CLOUD_IDC IDC集群CLOUD_CVM_SHARE CVM共享集群CLOUD_CVM_YUNTI 云梯CVM集群CLOUD_CVM    CVM集群CLOUD_CDC CDC集群CLOUD_EKS_TSE EKS集群</p> 
     * @return ClusterType <p>集群类型<br />CLOUD_IDC IDC集群CLOUD_CVM_SHARE CVM共享集群CLOUD_CVM_YUNTI 云梯CVM集群CLOUD_CVM    CVM集群CLOUD_CDC CDC集群CLOUD_EKS_TSE EKS集群</p>
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set <p>集群类型<br />CLOUD_IDC IDC集群CLOUD_CVM_SHARE CVM共享集群CLOUD_CVM_YUNTI 云梯CVM集群CLOUD_CVM    CVM集群CLOUD_CDC CDC集群CLOUD_EKS_TSE EKS集群</p>
     * @param ClusterType <p>集群类型<br />CLOUD_IDC IDC集群CLOUD_CVM_SHARE CVM共享集群CLOUD_CVM_YUNTI 云梯CVM集群CLOUD_CVM    CVM集群CLOUD_CDC CDC集群CLOUD_EKS_TSE EKS集群</p>
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get <p>免费分区数量</p> 
     * @return FreePartitionNumber <p>免费分区数量</p>
     */
    public Long getFreePartitionNumber() {
        return this.FreePartitionNumber;
    }

    /**
     * Set <p>免费分区数量</p>
     * @param FreePartitionNumber <p>免费分区数量</p>
     */
    public void setFreePartitionNumber(Long FreePartitionNumber) {
        this.FreePartitionNumber = FreePartitionNumber;
    }

    /**
     * Get <p>弹性带宽上浮值</p> 
     * @return ElasticFloatBandwidth <p>弹性带宽上浮值</p>
     */
    public Long getElasticFloatBandwidth() {
        return this.ElasticFloatBandwidth;
    }

    /**
     * Set <p>弹性带宽上浮值</p>
     * @param ElasticFloatBandwidth <p>弹性带宽上浮值</p>
     */
    public void setElasticFloatBandwidth(Long ElasticFloatBandwidth) {
        this.ElasticFloatBandwidth = ElasticFloatBandwidth;
    }

    /**
     * Get <p>ssl自定义证书id  仅自定义证书实例集群返回</p> 
     * @return CustomCertId <p>ssl自定义证书id  仅自定义证书实例集群返回</p>
     */
    public String getCustomCertId() {
        return this.CustomCertId;
    }

    /**
     * Set <p>ssl自定义证书id  仅自定义证书实例集群返回</p>
     * @param CustomCertId <p>ssl自定义证书id  仅自定义证书实例集群返回</p>
     */
    public void setCustomCertId(String CustomCertId) {
        this.CustomCertId = CustomCertId;
    }

    /**
     * Get <p>集群topic默认 unclean.leader.election.enable配置: 1 开启 0 关闭</p> 
     * @return UncleanLeaderElectionEnable <p>集群topic默认 unclean.leader.election.enable配置: 1 开启 0 关闭</p>
     */
    public Long getUncleanLeaderElectionEnable() {
        return this.UncleanLeaderElectionEnable;
    }

    /**
     * Set <p>集群topic默认 unclean.leader.election.enable配置: 1 开启 0 关闭</p>
     * @param UncleanLeaderElectionEnable <p>集群topic默认 unclean.leader.election.enable配置: 1 开启 0 关闭</p>
     */
    public void setUncleanLeaderElectionEnable(Long UncleanLeaderElectionEnable) {
        this.UncleanLeaderElectionEnable = UncleanLeaderElectionEnable;
    }

    /**
     * Get <p>实例删除保护开关: 1 开启 0 关闭</p> 
     * @return DeleteProtectionEnable <p>实例删除保护开关: 1 开启 0 关闭</p>
     */
    public Long getDeleteProtectionEnable() {
        return this.DeleteProtectionEnable;
    }

    /**
     * Set <p>实例删除保护开关: 1 开启 0 关闭</p>
     * @param DeleteProtectionEnable <p>实例删除保护开关: 1 开启 0 关闭</p>
     */
    public void setDeleteProtectionEnable(Long DeleteProtectionEnable) {
        this.DeleteProtectionEnable = DeleteProtectionEnable;
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
        if (source.SystemMaintenanceTime != null) {
            this.SystemMaintenanceTime = new String(source.SystemMaintenanceTime);
        }
        if (source.MaxMessageByte != null) {
            this.MaxMessageByte = new Long(source.MaxMessageByte);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.ElasticBandwidthSwitch != null) {
            this.ElasticBandwidthSwitch = new Long(source.ElasticBandwidthSwitch);
        }
        if (source.ElasticBandwidthOpenStatus != null) {
            this.ElasticBandwidthOpenStatus = new Long(source.ElasticBandwidthOpenStatus);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.FreePartitionNumber != null) {
            this.FreePartitionNumber = new Long(source.FreePartitionNumber);
        }
        if (source.ElasticFloatBandwidth != null) {
            this.ElasticFloatBandwidth = new Long(source.ElasticFloatBandwidth);
        }
        if (source.CustomCertId != null) {
            this.CustomCertId = new String(source.CustomCertId);
        }
        if (source.UncleanLeaderElectionEnable != null) {
            this.UncleanLeaderElectionEnable = new Long(source.UncleanLeaderElectionEnable);
        }
        if (source.DeleteProtectionEnable != null) {
            this.DeleteProtectionEnable = new Long(source.DeleteProtectionEnable);
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
        this.setParamSimple(map, prefix + "SystemMaintenanceTime", this.SystemMaintenanceTime);
        this.setParamSimple(map, prefix + "MaxMessageByte", this.MaxMessageByte);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "ElasticBandwidthSwitch", this.ElasticBandwidthSwitch);
        this.setParamSimple(map, prefix + "ElasticBandwidthOpenStatus", this.ElasticBandwidthOpenStatus);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "FreePartitionNumber", this.FreePartitionNumber);
        this.setParamSimple(map, prefix + "ElasticFloatBandwidth", this.ElasticFloatBandwidth);
        this.setParamSimple(map, prefix + "CustomCertId", this.CustomCertId);
        this.setParamSimple(map, prefix + "UncleanLeaderElectionEnable", this.UncleanLeaderElectionEnable);
        this.setParamSimple(map, prefix + "DeleteProtectionEnable", this.DeleteProtectionEnable);

    }
}

