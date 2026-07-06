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
package com.tencentcloudapi.keewidb.v20220308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceInfo extends AbstractModel {

    /**
    * <p>实例名称。</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>实例 ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>用户的Appid。</p>
    */
    @SerializedName("Appid")
    @Expose
    private Long Appid;

    /**
    * <p>项目 ID。</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>地域ID。<ul><li>1：广州。</li><li>4：上海。</li><li>8：北京。</li></ul></p>
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * <p>可用区 ID。</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * <p>VPC 网络 ID， 如：75101。该参数当前暂保留，可忽略。</p>
    */
    @SerializedName("VpcId")
    @Expose
    private Long VpcId;

    /**
    * <p>实例当前状态。<ul><li>0：待初始化。</li><li>1：实例在流程中。</li><li>2：实例运行中。</li><li>-2：实例已隔离。</li><li>-3：实例待删除。</li></ul></p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>VPC 网络下子网 ID， 如：46315。该参数当前暂保留，可忽略。</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private Long SubnetId;

    /**
    * <p>实例 VIP。</p>
    */
    @SerializedName("WanIp")
    @Expose
    private String WanIp;

    /**
    * <p>实例端口号。</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>实例创建时间。</p>
    */
    @SerializedName("Createtime")
    @Expose
    private String Createtime;

    /**
    * <p>实例持久内存总容量大小，单位：MB。</p>
    */
    @SerializedName("Size")
    @Expose
    private Float Size;

    /**
    * <p>实例类型。</p><p>枚举值：</p><ul><li>11： 存储版标准架构。</li><li>12： 存储版集群架构。</li><li>13： 极速版标准架构。</li><li>14： 极速版集群架构。</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>实例是否设置自动续费标识。<ul><li>1：设置自动续费。</li><li>0：未设置自动续费。</li></ul></p>
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * <p>实例到期时间。</p>
    */
    @SerializedName("DeadlineTime")
    @Expose
    private String DeadlineTime;

    /**
    * <p>存储引擎。</p>
    */
    @SerializedName("Engine")
    @Expose
    private String Engine;

    /**
    * <p>产品类型。<ul><li>standalone ：标准版。</li><li>cluster ：集群版。</li></ul></p>
    */
    @SerializedName("ProductType")
    @Expose
    private String ProductType;

    /**
    * <p>VPC 网络 ID， 如：vpc-fk33jsf4****。</p>
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * <p>VPC 网络下子网 ID，如：subnet-fd3j6l3****。</p>
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * <p>计费模式。<ul><li>0：按量计费。</li><li>1：包年包月。</li></ul></p>
    */
    @SerializedName("BillingMode")
    @Expose
    private Long BillingMode;

    /**
    * <p>实例运行状态描述：如”实例运行中“。</p>
    */
    @SerializedName("InstanceTitle")
    @Expose
    private String InstanceTitle;

    /**
    * <p>计划下线时间。</p>
    */
    @SerializedName("OfflineTime")
    @Expose
    private String OfflineTime;

    /**
    * <p>流程中的实例，返回子状态。</p>
    */
    @SerializedName("SubStatus")
    @Expose
    private Long SubStatus;

    /**
    * <p>反亲和性标签</p>
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * <p>分片大小。</p>
    */
    @SerializedName("RedisShardSize")
    @Expose
    private Long RedisShardSize;

    /**
    * <p>分片数量。</p>
    */
    @SerializedName("RedisShardNum")
    @Expose
    private Long RedisShardNum;

    /**
    * <p>副本数量。</p>
    */
    @SerializedName("RedisReplicasNum")
    @Expose
    private Long RedisReplicasNum;

    /**
    * <p>计费 ID。</p>
    */
    @SerializedName("PriceId")
    @Expose
    private Long PriceId;

    /**
    * <p>隔离时间。</p>
    */
    @SerializedName("CloseTime")
    @Expose
    private String CloseTime;

    /**
    * <p>从节点读取权重。</p>
    */
    @SerializedName("SlaveReadWeight")
    @Expose
    private Long SlaveReadWeight;

    /**
    * <p>实例关联的标签信息。</p>
    */
    @SerializedName("InstanceTags")
    @Expose
    private InstanceTagInfo [] InstanceTags;

    /**
    * <p>项目名称。</p>
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * <p>是否为免密实例；<ul><li>true：免密实例。</li><li>false：非免密实例。</li></ul></p>
    */
    @SerializedName("NoAuth")
    @Expose
    private Boolean NoAuth;

    /**
    * <p>客户端连接数。</p>
    */
    @SerializedName("ClientLimit")
    @Expose
    private Long ClientLimit;

    /**
    * <p>DTS状态（内部参数，用户可忽略）。</p>
    */
    @SerializedName("DtsStatus")
    @Expose
    private Long DtsStatus;

    /**
    * <p>分片带宽上限，单位 MB。</p>
    */
    @SerializedName("NetLimit")
    @Expose
    private Long NetLimit;

    /**
    * <p>免密实例标识（内部参数，用户可忽略）。</p>
    */
    @SerializedName("PasswordFree")
    @Expose
    private Long PasswordFree;

    /**
    * <p>实例只读标识（内部参数，用户可忽略）。</p>
    */
    @SerializedName("ReadOnly")
    @Expose
    private Long ReadOnly;

    /**
    * <p>内部参数，用户可忽略。</p>
    */
    @SerializedName("Vip6")
    @Expose
    private String Vip6;

    /**
    * <p>内部参数，用户可忽略。</p>
    */
    @SerializedName("RemainBandwidthDuration")
    @Expose
    private String RemainBandwidthDuration;

    /**
    * <p>实例的磁盘容量大小。</p>
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * <p>监控版本。<ul><li>1m：分钟粒度监控。</li><li>5s：5秒粒度监控。</li></ul></p>
    */
    @SerializedName("MonitorVersion")
    @Expose
    private String MonitorVersion;

    /**
    * <p>客户端最大连接数可设置的最小值。</p>
    */
    @SerializedName("ClientLimitMin")
    @Expose
    private Long ClientLimitMin;

    /**
    * <p>客户端最大连接数可设置的最大值。</p>
    */
    @SerializedName("ClientLimitMax")
    @Expose
    private Long ClientLimitMax;

    /**
    * <p>实例的节点详细信息。</p>
    */
    @SerializedName("NodeSet")
    @Expose
    private NodeInfo [] NodeSet;

    /**
    * <p>实例所在的地域信息，比如ap-guangzhou。</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>实例内存容量，单位：GB。KeeWiDB 内存容量</p>
    */
    @SerializedName("MachineMemory")
    @Expose
    private Long MachineMemory;

    /**
    * <p>单分片磁盘大小，单位：MB</p>
    */
    @SerializedName("DiskShardSize")
    @Expose
    private Long DiskShardSize;

    /**
    * <p>分片数量</p>
    */
    @SerializedName("DiskShardNum")
    @Expose
    private Long DiskShardNum;

    /**
    * <p>副本数量</p>
    */
    @SerializedName("DiskReplicasNum")
    @Expose
    private Long DiskReplicasNum;

    /**
    * <p>数据压缩开关。<ul><li>ON：开启。</li><li>OFF：关闭。</li></ul></p>
    */
    @SerializedName("Compression")
    @Expose
    private String Compression;

    /**
     * Get <p>实例名称。</p> 
     * @return InstanceName <p>实例名称。</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称。</p>
     * @param InstanceName <p>实例名称。</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>实例 ID。</p> 
     * @return InstanceId <p>实例 ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID。</p>
     * @param InstanceId <p>实例 ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>用户的Appid。</p> 
     * @return Appid <p>用户的Appid。</p>
     */
    public Long getAppid() {
        return this.Appid;
    }

    /**
     * Set <p>用户的Appid。</p>
     * @param Appid <p>用户的Appid。</p>
     */
    public void setAppid(Long Appid) {
        this.Appid = Appid;
    }

    /**
     * Get <p>项目 ID。</p> 
     * @return ProjectId <p>项目 ID。</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目 ID。</p>
     * @param ProjectId <p>项目 ID。</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>地域ID。<ul><li>1：广州。</li><li>4：上海。</li><li>8：北京。</li></ul></p> 
     * @return RegionId <p>地域ID。<ul><li>1：广州。</li><li>4：上海。</li><li>8：北京。</li></ul></p>
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set <p>地域ID。<ul><li>1：广州。</li><li>4：上海。</li><li>8：北京。</li></ul></p>
     * @param RegionId <p>地域ID。<ul><li>1：广州。</li><li>4：上海。</li><li>8：北京。</li></ul></p>
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get <p>可用区 ID。</p> 
     * @return ZoneId <p>可用区 ID。</p>
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>可用区 ID。</p>
     * @param ZoneId <p>可用区 ID。</p>
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>VPC 网络 ID， 如：75101。该参数当前暂保留，可忽略。</p> 
     * @return VpcId <p>VPC 网络 ID， 如：75101。该参数当前暂保留，可忽略。</p>
     */
    public Long getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC 网络 ID， 如：75101。该参数当前暂保留，可忽略。</p>
     * @param VpcId <p>VPC 网络 ID， 如：75101。该参数当前暂保留，可忽略。</p>
     */
    public void setVpcId(Long VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>实例当前状态。<ul><li>0：待初始化。</li><li>1：实例在流程中。</li><li>2：实例运行中。</li><li>-2：实例已隔离。</li><li>-3：实例待删除。</li></ul></p> 
     * @return Status <p>实例当前状态。<ul><li>0：待初始化。</li><li>1：实例在流程中。</li><li>2：实例运行中。</li><li>-2：实例已隔离。</li><li>-3：实例待删除。</li></ul></p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>实例当前状态。<ul><li>0：待初始化。</li><li>1：实例在流程中。</li><li>2：实例运行中。</li><li>-2：实例已隔离。</li><li>-3：实例待删除。</li></ul></p>
     * @param Status <p>实例当前状态。<ul><li>0：待初始化。</li><li>1：实例在流程中。</li><li>2：实例运行中。</li><li>-2：实例已隔离。</li><li>-3：实例待删除。</li></ul></p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>VPC 网络下子网 ID， 如：46315。该参数当前暂保留，可忽略。</p> 
     * @return SubnetId <p>VPC 网络下子网 ID， 如：46315。该参数当前暂保留，可忽略。</p>
     */
    public Long getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>VPC 网络下子网 ID， 如：46315。该参数当前暂保留，可忽略。</p>
     * @param SubnetId <p>VPC 网络下子网 ID， 如：46315。该参数当前暂保留，可忽略。</p>
     */
    public void setSubnetId(Long SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>实例 VIP。</p> 
     * @return WanIp <p>实例 VIP。</p>
     */
    public String getWanIp() {
        return this.WanIp;
    }

    /**
     * Set <p>实例 VIP。</p>
     * @param WanIp <p>实例 VIP。</p>
     */
    public void setWanIp(String WanIp) {
        this.WanIp = WanIp;
    }

    /**
     * Get <p>实例端口号。</p> 
     * @return Port <p>实例端口号。</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>实例端口号。</p>
     * @param Port <p>实例端口号。</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>实例创建时间。</p> 
     * @return Createtime <p>实例创建时间。</p>
     */
    public String getCreatetime() {
        return this.Createtime;
    }

    /**
     * Set <p>实例创建时间。</p>
     * @param Createtime <p>实例创建时间。</p>
     */
    public void setCreatetime(String Createtime) {
        this.Createtime = Createtime;
    }

    /**
     * Get <p>实例持久内存总容量大小，单位：MB。</p> 
     * @return Size <p>实例持久内存总容量大小，单位：MB。</p>
     */
    public Float getSize() {
        return this.Size;
    }

    /**
     * Set <p>实例持久内存总容量大小，单位：MB。</p>
     * @param Size <p>实例持久内存总容量大小，单位：MB。</p>
     */
    public void setSize(Float Size) {
        this.Size = Size;
    }

    /**
     * Get <p>实例类型。</p><p>枚举值：</p><ul><li>11： 存储版标准架构。</li><li>12： 存储版集群架构。</li><li>13： 极速版标准架构。</li><li>14： 极速版集群架构。</li></ul> 
     * @return Type <p>实例类型。</p><p>枚举值：</p><ul><li>11： 存储版标准架构。</li><li>12： 存储版集群架构。</li><li>13： 极速版标准架构。</li><li>14： 极速版集群架构。</li></ul>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>实例类型。</p><p>枚举值：</p><ul><li>11： 存储版标准架构。</li><li>12： 存储版集群架构。</li><li>13： 极速版标准架构。</li><li>14： 极速版集群架构。</li></ul>
     * @param Type <p>实例类型。</p><p>枚举值：</p><ul><li>11： 存储版标准架构。</li><li>12： 存储版集群架构。</li><li>13： 极速版标准架构。</li><li>14： 极速版集群架构。</li></ul>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>实例是否设置自动续费标识。<ul><li>1：设置自动续费。</li><li>0：未设置自动续费。</li></ul></p> 
     * @return AutoRenewFlag <p>实例是否设置自动续费标识。<ul><li>1：设置自动续费。</li><li>0：未设置自动续费。</li></ul></p>
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set <p>实例是否设置自动续费标识。<ul><li>1：设置自动续费。</li><li>0：未设置自动续费。</li></ul></p>
     * @param AutoRenewFlag <p>实例是否设置自动续费标识。<ul><li>1：设置自动续费。</li><li>0：未设置自动续费。</li></ul></p>
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get <p>实例到期时间。</p> 
     * @return DeadlineTime <p>实例到期时间。</p>
     */
    public String getDeadlineTime() {
        return this.DeadlineTime;
    }

    /**
     * Set <p>实例到期时间。</p>
     * @param DeadlineTime <p>实例到期时间。</p>
     */
    public void setDeadlineTime(String DeadlineTime) {
        this.DeadlineTime = DeadlineTime;
    }

    /**
     * Get <p>存储引擎。</p> 
     * @return Engine <p>存储引擎。</p>
     */
    public String getEngine() {
        return this.Engine;
    }

    /**
     * Set <p>存储引擎。</p>
     * @param Engine <p>存储引擎。</p>
     */
    public void setEngine(String Engine) {
        this.Engine = Engine;
    }

    /**
     * Get <p>产品类型。<ul><li>standalone ：标准版。</li><li>cluster ：集群版。</li></ul></p> 
     * @return ProductType <p>产品类型。<ul><li>standalone ：标准版。</li><li>cluster ：集群版。</li></ul></p>
     */
    public String getProductType() {
        return this.ProductType;
    }

    /**
     * Set <p>产品类型。<ul><li>standalone ：标准版。</li><li>cluster ：集群版。</li></ul></p>
     * @param ProductType <p>产品类型。<ul><li>standalone ：标准版。</li><li>cluster ：集群版。</li></ul></p>
     */
    public void setProductType(String ProductType) {
        this.ProductType = ProductType;
    }

    /**
     * Get <p>VPC 网络 ID， 如：vpc-fk33jsf4****。</p> 
     * @return UniqVpcId <p>VPC 网络 ID， 如：vpc-fk33jsf4****。</p>
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set <p>VPC 网络 ID， 如：vpc-fk33jsf4****。</p>
     * @param UniqVpcId <p>VPC 网络 ID， 如：vpc-fk33jsf4****。</p>
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get <p>VPC 网络下子网 ID，如：subnet-fd3j6l3****。</p> 
     * @return UniqSubnetId <p>VPC 网络下子网 ID，如：subnet-fd3j6l3****。</p>
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set <p>VPC 网络下子网 ID，如：subnet-fd3j6l3****。</p>
     * @param UniqSubnetId <p>VPC 网络下子网 ID，如：subnet-fd3j6l3****。</p>
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get <p>计费模式。<ul><li>0：按量计费。</li><li>1：包年包月。</li></ul></p> 
     * @return BillingMode <p>计费模式。<ul><li>0：按量计费。</li><li>1：包年包月。</li></ul></p>
     */
    public Long getBillingMode() {
        return this.BillingMode;
    }

    /**
     * Set <p>计费模式。<ul><li>0：按量计费。</li><li>1：包年包月。</li></ul></p>
     * @param BillingMode <p>计费模式。<ul><li>0：按量计费。</li><li>1：包年包月。</li></ul></p>
     */
    public void setBillingMode(Long BillingMode) {
        this.BillingMode = BillingMode;
    }

    /**
     * Get <p>实例运行状态描述：如”实例运行中“。</p> 
     * @return InstanceTitle <p>实例运行状态描述：如”实例运行中“。</p>
     */
    public String getInstanceTitle() {
        return this.InstanceTitle;
    }

    /**
     * Set <p>实例运行状态描述：如”实例运行中“。</p>
     * @param InstanceTitle <p>实例运行状态描述：如”实例运行中“。</p>
     */
    public void setInstanceTitle(String InstanceTitle) {
        this.InstanceTitle = InstanceTitle;
    }

    /**
     * Get <p>计划下线时间。</p> 
     * @return OfflineTime <p>计划下线时间。</p>
     */
    public String getOfflineTime() {
        return this.OfflineTime;
    }

    /**
     * Set <p>计划下线时间。</p>
     * @param OfflineTime <p>计划下线时间。</p>
     */
    public void setOfflineTime(String OfflineTime) {
        this.OfflineTime = OfflineTime;
    }

    /**
     * Get <p>流程中的实例，返回子状态。</p> 
     * @return SubStatus <p>流程中的实例，返回子状态。</p>
     */
    public Long getSubStatus() {
        return this.SubStatus;
    }

    /**
     * Set <p>流程中的实例，返回子状态。</p>
     * @param SubStatus <p>流程中的实例，返回子状态。</p>
     */
    public void setSubStatus(Long SubStatus) {
        this.SubStatus = SubStatus;
    }

    /**
     * Get <p>反亲和性标签</p> 
     * @return Tags <p>反亲和性标签</p>
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>反亲和性标签</p>
     * @param Tags <p>反亲和性标签</p>
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>分片大小。</p> 
     * @return RedisShardSize <p>分片大小。</p>
     */
    public Long getRedisShardSize() {
        return this.RedisShardSize;
    }

    /**
     * Set <p>分片大小。</p>
     * @param RedisShardSize <p>分片大小。</p>
     */
    public void setRedisShardSize(Long RedisShardSize) {
        this.RedisShardSize = RedisShardSize;
    }

    /**
     * Get <p>分片数量。</p> 
     * @return RedisShardNum <p>分片数量。</p>
     */
    public Long getRedisShardNum() {
        return this.RedisShardNum;
    }

    /**
     * Set <p>分片数量。</p>
     * @param RedisShardNum <p>分片数量。</p>
     */
    public void setRedisShardNum(Long RedisShardNum) {
        this.RedisShardNum = RedisShardNum;
    }

    /**
     * Get <p>副本数量。</p> 
     * @return RedisReplicasNum <p>副本数量。</p>
     */
    public Long getRedisReplicasNum() {
        return this.RedisReplicasNum;
    }

    /**
     * Set <p>副本数量。</p>
     * @param RedisReplicasNum <p>副本数量。</p>
     */
    public void setRedisReplicasNum(Long RedisReplicasNum) {
        this.RedisReplicasNum = RedisReplicasNum;
    }

    /**
     * Get <p>计费 ID。</p> 
     * @return PriceId <p>计费 ID。</p>
     */
    public Long getPriceId() {
        return this.PriceId;
    }

    /**
     * Set <p>计费 ID。</p>
     * @param PriceId <p>计费 ID。</p>
     */
    public void setPriceId(Long PriceId) {
        this.PriceId = PriceId;
    }

    /**
     * Get <p>隔离时间。</p> 
     * @return CloseTime <p>隔离时间。</p>
     */
    public String getCloseTime() {
        return this.CloseTime;
    }

    /**
     * Set <p>隔离时间。</p>
     * @param CloseTime <p>隔离时间。</p>
     */
    public void setCloseTime(String CloseTime) {
        this.CloseTime = CloseTime;
    }

    /**
     * Get <p>从节点读取权重。</p> 
     * @return SlaveReadWeight <p>从节点读取权重。</p>
     */
    public Long getSlaveReadWeight() {
        return this.SlaveReadWeight;
    }

    /**
     * Set <p>从节点读取权重。</p>
     * @param SlaveReadWeight <p>从节点读取权重。</p>
     */
    public void setSlaveReadWeight(Long SlaveReadWeight) {
        this.SlaveReadWeight = SlaveReadWeight;
    }

    /**
     * Get <p>实例关联的标签信息。</p> 
     * @return InstanceTags <p>实例关联的标签信息。</p>
     */
    public InstanceTagInfo [] getInstanceTags() {
        return this.InstanceTags;
    }

    /**
     * Set <p>实例关联的标签信息。</p>
     * @param InstanceTags <p>实例关联的标签信息。</p>
     */
    public void setInstanceTags(InstanceTagInfo [] InstanceTags) {
        this.InstanceTags = InstanceTags;
    }

    /**
     * Get <p>项目名称。</p> 
     * @return ProjectName <p>项目名称。</p>
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set <p>项目名称。</p>
     * @param ProjectName <p>项目名称。</p>
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get <p>是否为免密实例；<ul><li>true：免密实例。</li><li>false：非免密实例。</li></ul></p> 
     * @return NoAuth <p>是否为免密实例；<ul><li>true：免密实例。</li><li>false：非免密实例。</li></ul></p>
     */
    public Boolean getNoAuth() {
        return this.NoAuth;
    }

    /**
     * Set <p>是否为免密实例；<ul><li>true：免密实例。</li><li>false：非免密实例。</li></ul></p>
     * @param NoAuth <p>是否为免密实例；<ul><li>true：免密实例。</li><li>false：非免密实例。</li></ul></p>
     */
    public void setNoAuth(Boolean NoAuth) {
        this.NoAuth = NoAuth;
    }

    /**
     * Get <p>客户端连接数。</p> 
     * @return ClientLimit <p>客户端连接数。</p>
     */
    public Long getClientLimit() {
        return this.ClientLimit;
    }

    /**
     * Set <p>客户端连接数。</p>
     * @param ClientLimit <p>客户端连接数。</p>
     */
    public void setClientLimit(Long ClientLimit) {
        this.ClientLimit = ClientLimit;
    }

    /**
     * Get <p>DTS状态（内部参数，用户可忽略）。</p> 
     * @return DtsStatus <p>DTS状态（内部参数，用户可忽略）。</p>
     */
    public Long getDtsStatus() {
        return this.DtsStatus;
    }

    /**
     * Set <p>DTS状态（内部参数，用户可忽略）。</p>
     * @param DtsStatus <p>DTS状态（内部参数，用户可忽略）。</p>
     */
    public void setDtsStatus(Long DtsStatus) {
        this.DtsStatus = DtsStatus;
    }

    /**
     * Get <p>分片带宽上限，单位 MB。</p> 
     * @return NetLimit <p>分片带宽上限，单位 MB。</p>
     */
    public Long getNetLimit() {
        return this.NetLimit;
    }

    /**
     * Set <p>分片带宽上限，单位 MB。</p>
     * @param NetLimit <p>分片带宽上限，单位 MB。</p>
     */
    public void setNetLimit(Long NetLimit) {
        this.NetLimit = NetLimit;
    }

    /**
     * Get <p>免密实例标识（内部参数，用户可忽略）。</p> 
     * @return PasswordFree <p>免密实例标识（内部参数，用户可忽略）。</p>
     */
    public Long getPasswordFree() {
        return this.PasswordFree;
    }

    /**
     * Set <p>免密实例标识（内部参数，用户可忽略）。</p>
     * @param PasswordFree <p>免密实例标识（内部参数，用户可忽略）。</p>
     */
    public void setPasswordFree(Long PasswordFree) {
        this.PasswordFree = PasswordFree;
    }

    /**
     * Get <p>实例只读标识（内部参数，用户可忽略）。</p> 
     * @return ReadOnly <p>实例只读标识（内部参数，用户可忽略）。</p>
     */
    public Long getReadOnly() {
        return this.ReadOnly;
    }

    /**
     * Set <p>实例只读标识（内部参数，用户可忽略）。</p>
     * @param ReadOnly <p>实例只读标识（内部参数，用户可忽略）。</p>
     */
    public void setReadOnly(Long ReadOnly) {
        this.ReadOnly = ReadOnly;
    }

    /**
     * Get <p>内部参数，用户可忽略。</p> 
     * @return Vip6 <p>内部参数，用户可忽略。</p>
     */
    public String getVip6() {
        return this.Vip6;
    }

    /**
     * Set <p>内部参数，用户可忽略。</p>
     * @param Vip6 <p>内部参数，用户可忽略。</p>
     */
    public void setVip6(String Vip6) {
        this.Vip6 = Vip6;
    }

    /**
     * Get <p>内部参数，用户可忽略。</p> 
     * @return RemainBandwidthDuration <p>内部参数，用户可忽略。</p>
     */
    public String getRemainBandwidthDuration() {
        return this.RemainBandwidthDuration;
    }

    /**
     * Set <p>内部参数，用户可忽略。</p>
     * @param RemainBandwidthDuration <p>内部参数，用户可忽略。</p>
     */
    public void setRemainBandwidthDuration(String RemainBandwidthDuration) {
        this.RemainBandwidthDuration = RemainBandwidthDuration;
    }

    /**
     * Get <p>实例的磁盘容量大小。</p> 
     * @return DiskSize <p>实例的磁盘容量大小。</p>
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set <p>实例的磁盘容量大小。</p>
     * @param DiskSize <p>实例的磁盘容量大小。</p>
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get <p>监控版本。<ul><li>1m：分钟粒度监控。</li><li>5s：5秒粒度监控。</li></ul></p> 
     * @return MonitorVersion <p>监控版本。<ul><li>1m：分钟粒度监控。</li><li>5s：5秒粒度监控。</li></ul></p>
     */
    public String getMonitorVersion() {
        return this.MonitorVersion;
    }

    /**
     * Set <p>监控版本。<ul><li>1m：分钟粒度监控。</li><li>5s：5秒粒度监控。</li></ul></p>
     * @param MonitorVersion <p>监控版本。<ul><li>1m：分钟粒度监控。</li><li>5s：5秒粒度监控。</li></ul></p>
     */
    public void setMonitorVersion(String MonitorVersion) {
        this.MonitorVersion = MonitorVersion;
    }

    /**
     * Get <p>客户端最大连接数可设置的最小值。</p> 
     * @return ClientLimitMin <p>客户端最大连接数可设置的最小值。</p>
     */
    public Long getClientLimitMin() {
        return this.ClientLimitMin;
    }

    /**
     * Set <p>客户端最大连接数可设置的最小值。</p>
     * @param ClientLimitMin <p>客户端最大连接数可设置的最小值。</p>
     */
    public void setClientLimitMin(Long ClientLimitMin) {
        this.ClientLimitMin = ClientLimitMin;
    }

    /**
     * Get <p>客户端最大连接数可设置的最大值。</p> 
     * @return ClientLimitMax <p>客户端最大连接数可设置的最大值。</p>
     */
    public Long getClientLimitMax() {
        return this.ClientLimitMax;
    }

    /**
     * Set <p>客户端最大连接数可设置的最大值。</p>
     * @param ClientLimitMax <p>客户端最大连接数可设置的最大值。</p>
     */
    public void setClientLimitMax(Long ClientLimitMax) {
        this.ClientLimitMax = ClientLimitMax;
    }

    /**
     * Get <p>实例的节点详细信息。</p> 
     * @return NodeSet <p>实例的节点详细信息。</p>
     */
    public NodeInfo [] getNodeSet() {
        return this.NodeSet;
    }

    /**
     * Set <p>实例的节点详细信息。</p>
     * @param NodeSet <p>实例的节点详细信息。</p>
     */
    public void setNodeSet(NodeInfo [] NodeSet) {
        this.NodeSet = NodeSet;
    }

    /**
     * Get <p>实例所在的地域信息，比如ap-guangzhou。</p> 
     * @return Region <p>实例所在的地域信息，比如ap-guangzhou。</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>实例所在的地域信息，比如ap-guangzhou。</p>
     * @param Region <p>实例所在的地域信息，比如ap-guangzhou。</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>实例内存容量，单位：GB。KeeWiDB 内存容量</p> 
     * @return MachineMemory <p>实例内存容量，单位：GB。KeeWiDB 内存容量</p>
     */
    public Long getMachineMemory() {
        return this.MachineMemory;
    }

    /**
     * Set <p>实例内存容量，单位：GB。KeeWiDB 内存容量</p>
     * @param MachineMemory <p>实例内存容量，单位：GB。KeeWiDB 内存容量</p>
     */
    public void setMachineMemory(Long MachineMemory) {
        this.MachineMemory = MachineMemory;
    }

    /**
     * Get <p>单分片磁盘大小，单位：MB</p> 
     * @return DiskShardSize <p>单分片磁盘大小，单位：MB</p>
     */
    public Long getDiskShardSize() {
        return this.DiskShardSize;
    }

    /**
     * Set <p>单分片磁盘大小，单位：MB</p>
     * @param DiskShardSize <p>单分片磁盘大小，单位：MB</p>
     */
    public void setDiskShardSize(Long DiskShardSize) {
        this.DiskShardSize = DiskShardSize;
    }

    /**
     * Get <p>分片数量</p> 
     * @return DiskShardNum <p>分片数量</p>
     */
    public Long getDiskShardNum() {
        return this.DiskShardNum;
    }

    /**
     * Set <p>分片数量</p>
     * @param DiskShardNum <p>分片数量</p>
     */
    public void setDiskShardNum(Long DiskShardNum) {
        this.DiskShardNum = DiskShardNum;
    }

    /**
     * Get <p>副本数量</p> 
     * @return DiskReplicasNum <p>副本数量</p>
     */
    public Long getDiskReplicasNum() {
        return this.DiskReplicasNum;
    }

    /**
     * Set <p>副本数量</p>
     * @param DiskReplicasNum <p>副本数量</p>
     */
    public void setDiskReplicasNum(Long DiskReplicasNum) {
        this.DiskReplicasNum = DiskReplicasNum;
    }

    /**
     * Get <p>数据压缩开关。<ul><li>ON：开启。</li><li>OFF：关闭。</li></ul></p> 
     * @return Compression <p>数据压缩开关。<ul><li>ON：开启。</li><li>OFF：关闭。</li></ul></p>
     */
    public String getCompression() {
        return this.Compression;
    }

    /**
     * Set <p>数据压缩开关。<ul><li>ON：开启。</li><li>OFF：关闭。</li></ul></p>
     * @param Compression <p>数据压缩开关。<ul><li>ON：开启。</li><li>OFF：关闭。</li></ul></p>
     */
    public void setCompression(String Compression) {
        this.Compression = Compression;
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
        if (source.Compression != null) {
            this.Compression = new String(source.Compression);
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
        this.setParamSimple(map, prefix + "Compression", this.Compression);

    }
}

