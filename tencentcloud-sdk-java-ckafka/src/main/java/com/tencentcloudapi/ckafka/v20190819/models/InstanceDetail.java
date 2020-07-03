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
    * 实例状态 int：0表示健康，1表示告警，2 表示实例状态异常
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
     * Get 实例状态 int：0表示健康，1表示告警，2 表示实例状态异常 
     * @return Healthy 实例状态 int：0表示健康，1表示告警，2 表示实例状态异常
     */
    public Long getHealthy() {
        return this.Healthy;
    }

    /**
     * Set 实例状态 int：0表示健康，1表示告警，2 表示实例状态异常
     * @param Healthy 实例状态 int：0表示健康，1表示告警，2 表示实例状态异常
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

    }
}

