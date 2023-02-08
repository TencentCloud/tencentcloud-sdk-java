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
package com.tencentcloudapi.keewidb.v20220308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceInfo extends AbstractModel{

    /**
    * 实例名称。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 用户的Appid。
    */
    @SerializedName("Appid")
    @Expose
    private Long Appid;

    /**
    * 项目 ID。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 地域ID。<ul><li>1：广州。</li><li>4：上海。</li><li>8：北京。</li></ul>
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 可用区 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * VPC 网络 ID， 如：75101。该参数当前暂保留，可忽略。
    */
    @SerializedName("VpcId")
    @Expose
    private Long VpcId;

    /**
    * 实例当前状态。<ul><li>0：待初始化。</li><li>1：实例在流程中。</li><li>2：实例运行中。</li><li>-2：实例已隔离。</li><li>-3：实例待删除。</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * VPC 网络下子网 ID， 如：46315。该参数当前暂保留，可忽略。
    */
    @SerializedName("SubnetId")
    @Expose
    private Long SubnetId;

    /**
    * 实例 VIP。
    */
    @SerializedName("WanIp")
    @Expose
    private String WanIp;

    /**
    * 实例端口号。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 实例创建时间。
    */
    @SerializedName("Createtime")
    @Expose
    private String Createtime;

    /**
    * 实例持久内存总容量大小，单位：MB。
    */
    @SerializedName("Size")
    @Expose
    private Float Size;

    /**
    * 实例类型。<ul><li>13：标准版。</li><li>14：集群版。</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 实例是否设置自动续费标识。<ul><li>1：设置自动续费。</li><li>0：未设置自动续费。</li></ul>
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 实例到期时间。
    */
    @SerializedName("DeadlineTime")
    @Expose
    private String DeadlineTime;

    /**
    * 存储引擎。
    */
    @SerializedName("Engine")
    @Expose
    private String Engine;

    /**
    * 产品类型。<ul><li>standalone ：标准版。</li><li>cluster ：集群版。</li></ul>
    */
    @SerializedName("ProductType")
    @Expose
    private String ProductType;

    /**
    * VPC 网络 ID， 如：vpc-fk33jsf4****。
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * VPC 网络下子网 ID，如：subnet-fd3j6l3****。
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * 计费模式。<ul><li>0：按量计费。</li><li>1：包年包月。</li></ul>
    */
    @SerializedName("BillingMode")
    @Expose
    private Long BillingMode;

    /**
    * 实例运行状态描述：如”实例运行中“。
    */
    @SerializedName("InstanceTitle")
    @Expose
    private String InstanceTitle;

    /**
    * 计划下线时间。
    */
    @SerializedName("OfflineTime")
    @Expose
    private String OfflineTime;

    /**
    * 流程中的实例，返回子状态。
    */
    @SerializedName("SubStatus")
    @Expose
    private Long SubStatus;

    /**
    * 反亲和性标签
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * 分片大小。
    */
    @SerializedName("RedisShardSize")
    @Expose
    private Long RedisShardSize;

    /**
    * 分片数量。
    */
    @SerializedName("RedisShardNum")
    @Expose
    private Long RedisShardNum;

    /**
    * 副本数量。
    */
    @SerializedName("RedisReplicasNum")
    @Expose
    private Long RedisReplicasNum;

    /**
    * 计费 ID。
    */
    @SerializedName("PriceId")
    @Expose
    private Long PriceId;

    /**
    * 隔离时间。
    */
    @SerializedName("CloseTime")
    @Expose
    private String CloseTime;

    /**
    * 从节点读取权重。
    */
    @SerializedName("SlaveReadWeight")
    @Expose
    private Long SlaveReadWeight;

    /**
    * 实例关联的标签信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceTags")
    @Expose
    private InstanceTagInfo [] InstanceTags;

    /**
    * 项目名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 是否为免密实例；<ul><li>true：免密实例。</li><li>false：非免密实例。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NoAuth")
    @Expose
    private Boolean NoAuth;

    /**
    * 客户端连接数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientLimit")
    @Expose
    private Long ClientLimit;

    /**
    * DTS状态（内部参数，用户可忽略）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DtsStatus")
    @Expose
    private Long DtsStatus;

    /**
    * 分片带宽上限，单位 MB。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetLimit")
    @Expose
    private Long NetLimit;

    /**
    * 免密实例标识（内部参数，用户可忽略）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PasswordFree")
    @Expose
    private Long PasswordFree;

    /**
    * 实例只读标识（内部参数，用户可忽略）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReadOnly")
    @Expose
    private Long ReadOnly;

    /**
    * 内部参数，用户可忽略。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vip6")
    @Expose
    private String Vip6;

    /**
    * 内部参数，用户可忽略。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RemainBandwidthDuration")
    @Expose
    private String RemainBandwidthDuration;

    /**
    * 实例的磁盘容量大小。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 监控版本。<ul><li>1m：分钟粒度监控。</li><li>5s：5秒粒度监控。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MonitorVersion")
    @Expose
    private String MonitorVersion;

    /**
    * 客户端最大连接数可设置的最小值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientLimitMin")
    @Expose
    private Long ClientLimitMin;

    /**
    * 客户端最大连接数可设置的最大值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientLimitMax")
    @Expose
    private Long ClientLimitMax;

    /**
    * 实例的节点详细信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeSet")
    @Expose
    private NodeInfo [] NodeSet;

    /**
    * 实例所在的地域信息，比如ap-guangzhou。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 实例内存容量，单位：GB。KeeWiDB 内存容量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MachineMemory")
    @Expose
    private Long MachineMemory;

    /**
    * 单分片磁盘大小，单位：MB
    */
    @SerializedName("DiskShardSize")
    @Expose
    private Long DiskShardSize;

    /**
    * 3
    */
    @SerializedName("DiskShardNum")
    @Expose
    private Long DiskShardNum;

    /**
    * 1
    */
    @SerializedName("DiskReplicasNum")
    @Expose
    private Long DiskReplicasNum;

    /**
     * Get 实例名称。 
     * @return InstanceName 实例名称。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称。
     * @param InstanceName 实例名称。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例 ID。 
     * @return InstanceId 实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID。
     * @param InstanceId 实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 用户的Appid。 
     * @return Appid 用户的Appid。
     */
    public Long getAppid() {
        return this.Appid;
    }

    /**
     * Set 用户的Appid。
     * @param Appid 用户的Appid。
     */
    public void setAppid(Long Appid) {
        this.Appid = Appid;
    }

    /**
     * Get 项目 ID。 
     * @return ProjectId 项目 ID。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目 ID。
     * @param ProjectId 项目 ID。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 地域ID。<ul><li>1：广州。</li><li>4：上海。</li><li>8：北京。</li></ul> 
     * @return RegionId 地域ID。<ul><li>1：广州。</li><li>4：上海。</li><li>8：北京。</li></ul>
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域ID。<ul><li>1：广州。</li><li>4：上海。</li><li>8：北京。</li></ul>
     * @param RegionId 地域ID。<ul><li>1：广州。</li><li>4：上海。</li><li>8：北京。</li></ul>
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 可用区 ID。 
     * @return ZoneId 可用区 ID。
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 可用区 ID。
     * @param ZoneId 可用区 ID。
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get VPC 网络 ID， 如：75101。该参数当前暂保留，可忽略。 
     * @return VpcId VPC 网络 ID， 如：75101。该参数当前暂保留，可忽略。
     */
    public Long getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC 网络 ID， 如：75101。该参数当前暂保留，可忽略。
     * @param VpcId VPC 网络 ID， 如：75101。该参数当前暂保留，可忽略。
     */
    public void setVpcId(Long VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 实例当前状态。<ul><li>0：待初始化。</li><li>1：实例在流程中。</li><li>2：实例运行中。</li><li>-2：实例已隔离。</li><li>-3：实例待删除。</li></ul> 
     * @return Status 实例当前状态。<ul><li>0：待初始化。</li><li>1：实例在流程中。</li><li>2：实例运行中。</li><li>-2：实例已隔离。</li><li>-3：实例待删除。</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 实例当前状态。<ul><li>0：待初始化。</li><li>1：实例在流程中。</li><li>2：实例运行中。</li><li>-2：实例已隔离。</li><li>-3：实例待删除。</li></ul>
     * @param Status 实例当前状态。<ul><li>0：待初始化。</li><li>1：实例在流程中。</li><li>2：实例运行中。</li><li>-2：实例已隔离。</li><li>-3：实例待删除。</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get VPC 网络下子网 ID， 如：46315。该参数当前暂保留，可忽略。 
     * @return SubnetId VPC 网络下子网 ID， 如：46315。该参数当前暂保留，可忽略。
     */
    public Long getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set VPC 网络下子网 ID， 如：46315。该参数当前暂保留，可忽略。
     * @param SubnetId VPC 网络下子网 ID， 如：46315。该参数当前暂保留，可忽略。
     */
    public void setSubnetId(Long SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 实例 VIP。 
     * @return WanIp 实例 VIP。
     */
    public String getWanIp() {
        return this.WanIp;
    }

    /**
     * Set 实例 VIP。
     * @param WanIp 实例 VIP。
     */
    public void setWanIp(String WanIp) {
        this.WanIp = WanIp;
    }

    /**
     * Get 实例端口号。 
     * @return Port 实例端口号。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 实例端口号。
     * @param Port 实例端口号。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 实例创建时间。 
     * @return Createtime 实例创建时间。
     */
    public String getCreatetime() {
        return this.Createtime;
    }

    /**
     * Set 实例创建时间。
     * @param Createtime 实例创建时间。
     */
    public void setCreatetime(String Createtime) {
        this.Createtime = Createtime;
    }

    /**
     * Get 实例持久内存总容量大小，单位：MB。 
     * @return Size 实例持久内存总容量大小，单位：MB。
     */
    public Float getSize() {
        return this.Size;
    }

    /**
     * Set 实例持久内存总容量大小，单位：MB。
     * @param Size 实例持久内存总容量大小，单位：MB。
     */
    public void setSize(Float Size) {
        this.Size = Size;
    }

    /**
     * Get 实例类型。<ul><li>13：标准版。</li><li>14：集群版。</li></ul> 
     * @return Type 实例类型。<ul><li>13：标准版。</li><li>14：集群版。</li></ul>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 实例类型。<ul><li>13：标准版。</li><li>14：集群版。</li></ul>
     * @param Type 实例类型。<ul><li>13：标准版。</li><li>14：集群版。</li></ul>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 实例是否设置自动续费标识。<ul><li>1：设置自动续费。</li><li>0：未设置自动续费。</li></ul> 
     * @return AutoRenewFlag 实例是否设置自动续费标识。<ul><li>1：设置自动续费。</li><li>0：未设置自动续费。</li></ul>
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 实例是否设置自动续费标识。<ul><li>1：设置自动续费。</li><li>0：未设置自动续费。</li></ul>
     * @param AutoRenewFlag 实例是否设置自动续费标识。<ul><li>1：设置自动续费。</li><li>0：未设置自动续费。</li></ul>
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 实例到期时间。 
     * @return DeadlineTime 实例到期时间。
     */
    public String getDeadlineTime() {
        return this.DeadlineTime;
    }

    /**
     * Set 实例到期时间。
     * @param DeadlineTime 实例到期时间。
     */
    public void setDeadlineTime(String DeadlineTime) {
        this.DeadlineTime = DeadlineTime;
    }

    /**
     * Get 存储引擎。 
     * @return Engine 存储引擎。
     */
    public String getEngine() {
        return this.Engine;
    }

    /**
     * Set 存储引擎。
     * @param Engine 存储引擎。
     */
    public void setEngine(String Engine) {
        this.Engine = Engine;
    }

    /**
     * Get 产品类型。<ul><li>standalone ：标准版。</li><li>cluster ：集群版。</li></ul> 
     * @return ProductType 产品类型。<ul><li>standalone ：标准版。</li><li>cluster ：集群版。</li></ul>
     */
    public String getProductType() {
        return this.ProductType;
    }

    /**
     * Set 产品类型。<ul><li>standalone ：标准版。</li><li>cluster ：集群版。</li></ul>
     * @param ProductType 产品类型。<ul><li>standalone ：标准版。</li><li>cluster ：集群版。</li></ul>
     */
    public void setProductType(String ProductType) {
        this.ProductType = ProductType;
    }

    /**
     * Get VPC 网络 ID， 如：vpc-fk33jsf4****。 
     * @return UniqVpcId VPC 网络 ID， 如：vpc-fk33jsf4****。
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set VPC 网络 ID， 如：vpc-fk33jsf4****。
     * @param UniqVpcId VPC 网络 ID， 如：vpc-fk33jsf4****。
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get VPC 网络下子网 ID，如：subnet-fd3j6l3****。 
     * @return UniqSubnetId VPC 网络下子网 ID，如：subnet-fd3j6l3****。
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set VPC 网络下子网 ID，如：subnet-fd3j6l3****。
     * @param UniqSubnetId VPC 网络下子网 ID，如：subnet-fd3j6l3****。
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get 计费模式。<ul><li>0：按量计费。</li><li>1：包年包月。</li></ul> 
     * @return BillingMode 计费模式。<ul><li>0：按量计费。</li><li>1：包年包月。</li></ul>
     */
    public Long getBillingMode() {
        return this.BillingMode;
    }

    /**
     * Set 计费模式。<ul><li>0：按量计费。</li><li>1：包年包月。</li></ul>
     * @param BillingMode 计费模式。<ul><li>0：按量计费。</li><li>1：包年包月。</li></ul>
     */
    public void setBillingMode(Long BillingMode) {
        this.BillingMode = BillingMode;
    }

    /**
     * Get 实例运行状态描述：如”实例运行中“。 
     * @return InstanceTitle 实例运行状态描述：如”实例运行中“。
     */
    public String getInstanceTitle() {
        return this.InstanceTitle;
    }

    /**
     * Set 实例运行状态描述：如”实例运行中“。
     * @param InstanceTitle 实例运行状态描述：如”实例运行中“。
     */
    public void setInstanceTitle(String InstanceTitle) {
        this.InstanceTitle = InstanceTitle;
    }

    /**
     * Get 计划下线时间。 
     * @return OfflineTime 计划下线时间。
     */
    public String getOfflineTime() {
        return this.OfflineTime;
    }

    /**
     * Set 计划下线时间。
     * @param OfflineTime 计划下线时间。
     */
    public void setOfflineTime(String OfflineTime) {
        this.OfflineTime = OfflineTime;
    }

    /**
     * Get 流程中的实例，返回子状态。 
     * @return SubStatus 流程中的实例，返回子状态。
     */
    public Long getSubStatus() {
        return this.SubStatus;
    }

    /**
     * Set 流程中的实例，返回子状态。
     * @param SubStatus 流程中的实例，返回子状态。
     */
    public void setSubStatus(Long SubStatus) {
        this.SubStatus = SubStatus;
    }

    /**
     * Get 反亲和性标签 
     * @return Tags 反亲和性标签
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 反亲和性标签
     * @param Tags 反亲和性标签
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 分片大小。 
     * @return RedisShardSize 分片大小。
     */
    public Long getRedisShardSize() {
        return this.RedisShardSize;
    }

    /**
     * Set 分片大小。
     * @param RedisShardSize 分片大小。
     */
    public void setRedisShardSize(Long RedisShardSize) {
        this.RedisShardSize = RedisShardSize;
    }

    /**
     * Get 分片数量。 
     * @return RedisShardNum 分片数量。
     */
    public Long getRedisShardNum() {
        return this.RedisShardNum;
    }

    /**
     * Set 分片数量。
     * @param RedisShardNum 分片数量。
     */
    public void setRedisShardNum(Long RedisShardNum) {
        this.RedisShardNum = RedisShardNum;
    }

    /**
     * Get 副本数量。 
     * @return RedisReplicasNum 副本数量。
     */
    public Long getRedisReplicasNum() {
        return this.RedisReplicasNum;
    }

    /**
     * Set 副本数量。
     * @param RedisReplicasNum 副本数量。
     */
    public void setRedisReplicasNum(Long RedisReplicasNum) {
        this.RedisReplicasNum = RedisReplicasNum;
    }

    /**
     * Get 计费 ID。 
     * @return PriceId 计费 ID。
     */
    public Long getPriceId() {
        return this.PriceId;
    }

    /**
     * Set 计费 ID。
     * @param PriceId 计费 ID。
     */
    public void setPriceId(Long PriceId) {
        this.PriceId = PriceId;
    }

    /**
     * Get 隔离时间。 
     * @return CloseTime 隔离时间。
     */
    public String getCloseTime() {
        return this.CloseTime;
    }

    /**
     * Set 隔离时间。
     * @param CloseTime 隔离时间。
     */
    public void setCloseTime(String CloseTime) {
        this.CloseTime = CloseTime;
    }

    /**
     * Get 从节点读取权重。 
     * @return SlaveReadWeight 从节点读取权重。
     */
    public Long getSlaveReadWeight() {
        return this.SlaveReadWeight;
    }

    /**
     * Set 从节点读取权重。
     * @param SlaveReadWeight 从节点读取权重。
     */
    public void setSlaveReadWeight(Long SlaveReadWeight) {
        this.SlaveReadWeight = SlaveReadWeight;
    }

    /**
     * Get 实例关联的标签信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceTags 实例关联的标签信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceTagInfo [] getInstanceTags() {
        return this.InstanceTags;
    }

    /**
     * Set 实例关联的标签信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceTags 实例关联的标签信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceTags(InstanceTagInfo [] InstanceTags) {
        this.InstanceTags = InstanceTags;
    }

    /**
     * Get 项目名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectName 项目名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 项目名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectName 项目名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 是否为免密实例；<ul><li>true：免密实例。</li><li>false：非免密实例。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NoAuth 是否为免密实例；<ul><li>true：免密实例。</li><li>false：非免密实例。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getNoAuth() {
        return this.NoAuth;
    }

    /**
     * Set 是否为免密实例；<ul><li>true：免密实例。</li><li>false：非免密实例。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NoAuth 是否为免密实例；<ul><li>true：免密实例。</li><li>false：非免密实例。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNoAuth(Boolean NoAuth) {
        this.NoAuth = NoAuth;
    }

    /**
     * Get 客户端连接数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClientLimit 客户端连接数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getClientLimit() {
        return this.ClientLimit;
    }

    /**
     * Set 客户端连接数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientLimit 客户端连接数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientLimit(Long ClientLimit) {
        this.ClientLimit = ClientLimit;
    }

    /**
     * Get DTS状态（内部参数，用户可忽略）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DtsStatus DTS状态（内部参数，用户可忽略）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDtsStatus() {
        return this.DtsStatus;
    }

    /**
     * Set DTS状态（内部参数，用户可忽略）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DtsStatus DTS状态（内部参数，用户可忽略）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDtsStatus(Long DtsStatus) {
        this.DtsStatus = DtsStatus;
    }

    /**
     * Get 分片带宽上限，单位 MB。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetLimit 分片带宽上限，单位 MB。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNetLimit() {
        return this.NetLimit;
    }

    /**
     * Set 分片带宽上限，单位 MB。
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetLimit 分片带宽上限，单位 MB。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetLimit(Long NetLimit) {
        this.NetLimit = NetLimit;
    }

    /**
     * Get 免密实例标识（内部参数，用户可忽略）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PasswordFree 免密实例标识（内部参数，用户可忽略）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPasswordFree() {
        return this.PasswordFree;
    }

    /**
     * Set 免密实例标识（内部参数，用户可忽略）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PasswordFree 免密实例标识（内部参数，用户可忽略）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPasswordFree(Long PasswordFree) {
        this.PasswordFree = PasswordFree;
    }

    /**
     * Get 实例只读标识（内部参数，用户可忽略）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReadOnly 实例只读标识（内部参数，用户可忽略）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReadOnly() {
        return this.ReadOnly;
    }

    /**
     * Set 实例只读标识（内部参数，用户可忽略）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReadOnly 实例只读标识（内部参数，用户可忽略）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReadOnly(Long ReadOnly) {
        this.ReadOnly = ReadOnly;
    }

    /**
     * Get 内部参数，用户可忽略。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vip6 内部参数，用户可忽略。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVip6() {
        return this.Vip6;
    }

    /**
     * Set 内部参数，用户可忽略。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vip6 内部参数，用户可忽略。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVip6(String Vip6) {
        this.Vip6 = Vip6;
    }

    /**
     * Get 内部参数，用户可忽略。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RemainBandwidthDuration 内部参数，用户可忽略。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemainBandwidthDuration() {
        return this.RemainBandwidthDuration;
    }

    /**
     * Set 内部参数，用户可忽略。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RemainBandwidthDuration 内部参数，用户可忽略。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemainBandwidthDuration(String RemainBandwidthDuration) {
        this.RemainBandwidthDuration = RemainBandwidthDuration;
    }

    /**
     * Get 实例的磁盘容量大小。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskSize 实例的磁盘容量大小。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 实例的磁盘容量大小。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskSize 实例的磁盘容量大小。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 监控版本。<ul><li>1m：分钟粒度监控。</li><li>5s：5秒粒度监控。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MonitorVersion 监控版本。<ul><li>1m：分钟粒度监控。</li><li>5s：5秒粒度监控。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMonitorVersion() {
        return this.MonitorVersion;
    }

    /**
     * Set 监控版本。<ul><li>1m：分钟粒度监控。</li><li>5s：5秒粒度监控。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MonitorVersion 监控版本。<ul><li>1m：分钟粒度监控。</li><li>5s：5秒粒度监控。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMonitorVersion(String MonitorVersion) {
        this.MonitorVersion = MonitorVersion;
    }

    /**
     * Get 客户端最大连接数可设置的最小值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClientLimitMin 客户端最大连接数可设置的最小值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getClientLimitMin() {
        return this.ClientLimitMin;
    }

    /**
     * Set 客户端最大连接数可设置的最小值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientLimitMin 客户端最大连接数可设置的最小值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientLimitMin(Long ClientLimitMin) {
        this.ClientLimitMin = ClientLimitMin;
    }

    /**
     * Get 客户端最大连接数可设置的最大值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClientLimitMax 客户端最大连接数可设置的最大值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getClientLimitMax() {
        return this.ClientLimitMax;
    }

    /**
     * Set 客户端最大连接数可设置的最大值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientLimitMax 客户端最大连接数可设置的最大值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientLimitMax(Long ClientLimitMax) {
        this.ClientLimitMax = ClientLimitMax;
    }

    /**
     * Get 实例的节点详细信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeSet 实例的节点详细信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NodeInfo [] getNodeSet() {
        return this.NodeSet;
    }

    /**
     * Set 实例的节点详细信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeSet 实例的节点详细信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeSet(NodeInfo [] NodeSet) {
        this.NodeSet = NodeSet;
    }

    /**
     * Get 实例所在的地域信息，比如ap-guangzhou。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 实例所在的地域信息，比如ap-guangzhou。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 实例所在的地域信息，比如ap-guangzhou。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 实例所在的地域信息，比如ap-guangzhou。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 实例内存容量，单位：GB。KeeWiDB 内存容量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MachineMemory 实例内存容量，单位：GB。KeeWiDB 内存容量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMachineMemory() {
        return this.MachineMemory;
    }

    /**
     * Set 实例内存容量，单位：GB。KeeWiDB 内存容量
注意：此字段可能返回 null，表示取不到有效值。
     * @param MachineMemory 实例内存容量，单位：GB。KeeWiDB 内存容量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMachineMemory(Long MachineMemory) {
        this.MachineMemory = MachineMemory;
    }

    /**
     * Get 单分片磁盘大小，单位：MB 
     * @return DiskShardSize 单分片磁盘大小，单位：MB
     */
    public Long getDiskShardSize() {
        return this.DiskShardSize;
    }

    /**
     * Set 单分片磁盘大小，单位：MB
     * @param DiskShardSize 单分片磁盘大小，单位：MB
     */
    public void setDiskShardSize(Long DiskShardSize) {
        this.DiskShardSize = DiskShardSize;
    }

    /**
     * Get 3 
     * @return DiskShardNum 3
     */
    public Long getDiskShardNum() {
        return this.DiskShardNum;
    }

    /**
     * Set 3
     * @param DiskShardNum 3
     */
    public void setDiskShardNum(Long DiskShardNum) {
        this.DiskShardNum = DiskShardNum;
    }

    /**
     * Get 1 
     * @return DiskReplicasNum 1
     */
    public Long getDiskReplicasNum() {
        return this.DiskReplicasNum;
    }

    /**
     * Set 1
     * @param DiskReplicasNum 1
     */
    public void setDiskReplicasNum(Long DiskReplicasNum) {
        this.DiskReplicasNum = DiskReplicasNum;
    }

    public InstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceInfo(InstanceInfo source) {
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Appid != null) {
            this.Appid = new Long(source.Appid);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.VpcId != null) {
            this.VpcId = new Long(source.VpcId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new Long(source.SubnetId);
        }
        if (source.WanIp != null) {
            this.WanIp = new String(source.WanIp);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Createtime != null) {
            this.Createtime = new String(source.Createtime);
        }
        if (source.Size != null) {
            this.Size = new Float(source.Size);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.DeadlineTime != null) {
            this.DeadlineTime = new String(source.DeadlineTime);
        }
        if (source.Engine != null) {
            this.Engine = new String(source.Engine);
        }
        if (source.ProductType != null) {
            this.ProductType = new String(source.ProductType);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.BillingMode != null) {
            this.BillingMode = new Long(source.BillingMode);
        }
        if (source.InstanceTitle != null) {
            this.InstanceTitle = new String(source.InstanceTitle);
        }
        if (source.OfflineTime != null) {
            this.OfflineTime = new String(source.OfflineTime);
        }
        if (source.SubStatus != null) {
            this.SubStatus = new Long(source.SubStatus);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.RedisShardSize != null) {
            this.RedisShardSize = new Long(source.RedisShardSize);
        }
        if (source.RedisShardNum != null) {
            this.RedisShardNum = new Long(source.RedisShardNum);
        }
        if (source.RedisReplicasNum != null) {
            this.RedisReplicasNum = new Long(source.RedisReplicasNum);
        }
        if (source.PriceId != null) {
            this.PriceId = new Long(source.PriceId);
        }
        if (source.CloseTime != null) {
            this.CloseTime = new String(source.CloseTime);
        }
        if (source.SlaveReadWeight != null) {
            this.SlaveReadWeight = new Long(source.SlaveReadWeight);
        }
        if (source.InstanceTags != null) {
            this.InstanceTags = new InstanceTagInfo[source.InstanceTags.length];
            for (int i = 0; i < source.InstanceTags.length; i++) {
                this.InstanceTags[i] = new InstanceTagInfo(source.InstanceTags[i]);
            }
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.NoAuth != null) {
            this.NoAuth = new Boolean(source.NoAuth);
        }
        if (source.ClientLimit != null) {
            this.ClientLimit = new Long(source.ClientLimit);
        }
        if (source.DtsStatus != null) {
            this.DtsStatus = new Long(source.DtsStatus);
        }
        if (source.NetLimit != null) {
            this.NetLimit = new Long(source.NetLimit);
        }
        if (source.PasswordFree != null) {
            this.PasswordFree = new Long(source.PasswordFree);
        }
        if (source.ReadOnly != null) {
            this.ReadOnly = new Long(source.ReadOnly);
        }
        if (source.Vip6 != null) {
            this.Vip6 = new String(source.Vip6);
        }
        if (source.RemainBandwidthDuration != null) {
            this.RemainBandwidthDuration = new String(source.RemainBandwidthDuration);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.MonitorVersion != null) {
            this.MonitorVersion = new String(source.MonitorVersion);
        }
        if (source.ClientLimitMin != null) {
            this.ClientLimitMin = new Long(source.ClientLimitMin);
        }
        if (source.ClientLimitMax != null) {
            this.ClientLimitMax = new Long(source.ClientLimitMax);
        }
        if (source.NodeSet != null) {
            this.NodeSet = new NodeInfo[source.NodeSet.length];
            for (int i = 0; i < source.NodeSet.length; i++) {
                this.NodeSet[i] = new NodeInfo(source.NodeSet[i]);
            }
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.MachineMemory != null) {
            this.MachineMemory = new Long(source.MachineMemory);
        }
        if (source.DiskShardSize != null) {
            this.DiskShardSize = new Long(source.DiskShardSize);
        }
        if (source.DiskShardNum != null) {
            this.DiskShardNum = new Long(source.DiskShardNum);
        }
        if (source.DiskReplicasNum != null) {
            this.DiskReplicasNum = new Long(source.DiskReplicasNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Appid", this.Appid);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "WanIp", this.WanIp);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Createtime", this.Createtime);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "DeadlineTime", this.DeadlineTime);
        this.setParamSimple(map, prefix + "Engine", this.Engine);
        this.setParamSimple(map, prefix + "ProductType", this.ProductType);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "BillingMode", this.BillingMode);
        this.setParamSimple(map, prefix + "InstanceTitle", this.InstanceTitle);
        this.setParamSimple(map, prefix + "OfflineTime", this.OfflineTime);
        this.setParamSimple(map, prefix + "SubStatus", this.SubStatus);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "RedisShardSize", this.RedisShardSize);
        this.setParamSimple(map, prefix + "RedisShardNum", this.RedisShardNum);
        this.setParamSimple(map, prefix + "RedisReplicasNum", this.RedisReplicasNum);
        this.setParamSimple(map, prefix + "PriceId", this.PriceId);
        this.setParamSimple(map, prefix + "CloseTime", this.CloseTime);
        this.setParamSimple(map, prefix + "SlaveReadWeight", this.SlaveReadWeight);
        this.setParamArrayObj(map, prefix + "InstanceTags.", this.InstanceTags);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "NoAuth", this.NoAuth);
        this.setParamSimple(map, prefix + "ClientLimit", this.ClientLimit);
        this.setParamSimple(map, prefix + "DtsStatus", this.DtsStatus);
        this.setParamSimple(map, prefix + "NetLimit", this.NetLimit);
        this.setParamSimple(map, prefix + "PasswordFree", this.PasswordFree);
        this.setParamSimple(map, prefix + "ReadOnly", this.ReadOnly);
        this.setParamSimple(map, prefix + "Vip6", this.Vip6);
        this.setParamSimple(map, prefix + "RemainBandwidthDuration", this.RemainBandwidthDuration);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "MonitorVersion", this.MonitorVersion);
        this.setParamSimple(map, prefix + "ClientLimitMin", this.ClientLimitMin);
        this.setParamSimple(map, prefix + "ClientLimitMax", this.ClientLimitMax);
        this.setParamArrayObj(map, prefix + "NodeSet.", this.NodeSet);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "MachineMemory", this.MachineMemory);
        this.setParamSimple(map, prefix + "DiskShardSize", this.DiskShardSize);
        this.setParamSimple(map, prefix + "DiskShardNum", this.DiskShardNum);
        this.setParamSimple(map, prefix + "DiskReplicasNum", this.DiskReplicasNum);

    }
}

