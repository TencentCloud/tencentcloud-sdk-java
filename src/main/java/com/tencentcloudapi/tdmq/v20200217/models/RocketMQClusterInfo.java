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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RocketMQClusterInfo extends AbstractModel {

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 地域信息
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 创建时间，毫秒为单位
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 集群说明信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 公网接入地址
    */
    @SerializedName("PublicEndPoint")
    @Expose
    private String PublicEndPoint;

    /**
    * VPC接入地址
    */
    @SerializedName("VpcEndPoint")
    @Expose
    private String VpcEndPoint;

    /**
    * 是否支持命名空间接入点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportNamespaceEndpoint")
    @Expose
    private Boolean SupportNamespaceEndpoint;

    /**
    * VPC信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vpcs")
    @Expose
    private VpcConfig [] Vpcs;

    /**
    * 是否为专享实例
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsVip")
    @Expose
    private Boolean IsVip;

    /**
    * Rocketmq集群标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RocketMQFlag")
    @Expose
    private Boolean RocketMQFlag;

    /**
    * 计费状态，1表示正常，2表示已停服，3表示已销毁
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 欠费停服时间，毫秒为单位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsolateTime")
    @Expose
    private Long IsolateTime;

    /**
    * HTTP协议公网接入地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HttpPublicEndpoint")
    @Expose
    private String HttpPublicEndpoint;

    /**
    * HTTP协议VPC接入地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HttpVpcEndpoint")
    @Expose
    private String HttpVpcEndpoint;

    /**
    * TCP内部接入地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InternalEndpoint")
    @Expose
    private String InternalEndpoint;

    /**
    * HTTP协议内部接入地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HttpInternalEndpoint")
    @Expose
    private String HttpInternalEndpoint;

    /**
    * 是否开启ACL鉴权，专享实例支持关闭
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AclEnabled")
    @Expose
    private Boolean AclEnabled;

    /**
    * 公网CLB实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicClbId")
    @Expose
    private String PublicClbId;

    /**
    * vip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 所属VPC
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 是否支持迁移
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportMigration")
    @Expose
    private Boolean SupportMigration;

    /**
    * 实例状态，0表示创建中，1表示正常，2表示隔离中，3表示已销毁，4 - 异常, 5 - 发货失败，6 - 变配中，7 - 变配失败
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceStatus")
    @Expose
    private Long InstanceStatus;

    /**
    * 集群所属可用区，表明集群归属的可用区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 集群节点所在的可用区，若该集群为跨可用区集群，则包含该集群节点所在的多个可用区。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneIds")
    @Expose
    private Long [] ZoneIds;

    /**
    * 是否已冻结
    */
    @SerializedName("IsFrozen")
    @Expose
    private Boolean IsFrozen;

    /**
    * 是否开启自动创建主题
    */
    @SerializedName("AutoCreateTopicEnabled")
    @Expose
    private Boolean AutoCreateTopicEnabled;

    /**
    * 是否开启集群Admin能力
    */
    @SerializedName("AdminFeatureEnabled")
    @Expose
    private Boolean AdminFeatureEnabled;

    /**
    * Admin AK
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdminAccessKey")
    @Expose
    private String AdminAccessKey;

    /**
    * Admin SK
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdminSecretKey")
    @Expose
    private String AdminSecretKey;

    /**
    * 是否开启删除保护
    */
    @SerializedName("EnableDeletionProtection")
    @Expose
    private Boolean EnableDeletionProtection;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 集群名称 
     * @return ClusterName 集群名称
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名称
     * @param ClusterName 集群名称
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 地域信息 
     * @return Region 地域信息
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域信息
     * @param Region 地域信息
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 创建时间，毫秒为单位 
     * @return CreateTime 创建时间，毫秒为单位
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间，毫秒为单位
     * @param CreateTime 创建时间，毫秒为单位
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 集群说明信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 集群说明信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 集群说明信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 集群说明信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 公网接入地址 
     * @return PublicEndPoint 公网接入地址
     */
    public String getPublicEndPoint() {
        return this.PublicEndPoint;
    }

    /**
     * Set 公网接入地址
     * @param PublicEndPoint 公网接入地址
     */
    public void setPublicEndPoint(String PublicEndPoint) {
        this.PublicEndPoint = PublicEndPoint;
    }

    /**
     * Get VPC接入地址 
     * @return VpcEndPoint VPC接入地址
     */
    public String getVpcEndPoint() {
        return this.VpcEndPoint;
    }

    /**
     * Set VPC接入地址
     * @param VpcEndPoint VPC接入地址
     */
    public void setVpcEndPoint(String VpcEndPoint) {
        this.VpcEndPoint = VpcEndPoint;
    }

    /**
     * Get 是否支持命名空间接入点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportNamespaceEndpoint 是否支持命名空间接入点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSupportNamespaceEndpoint() {
        return this.SupportNamespaceEndpoint;
    }

    /**
     * Set 是否支持命名空间接入点
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportNamespaceEndpoint 是否支持命名空间接入点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportNamespaceEndpoint(Boolean SupportNamespaceEndpoint) {
        this.SupportNamespaceEndpoint = SupportNamespaceEndpoint;
    }

    /**
     * Get VPC信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vpcs VPC信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VpcConfig [] getVpcs() {
        return this.Vpcs;
    }

    /**
     * Set VPC信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vpcs VPC信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcs(VpcConfig [] Vpcs) {
        this.Vpcs = Vpcs;
    }

    /**
     * Get 是否为专享实例
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsVip 是否为专享实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsVip() {
        return this.IsVip;
    }

    /**
     * Set 是否为专享实例
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsVip 是否为专享实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsVip(Boolean IsVip) {
        this.IsVip = IsVip;
    }

    /**
     * Get Rocketmq集群标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RocketMQFlag Rocketmq集群标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getRocketMQFlag() {
        return this.RocketMQFlag;
    }

    /**
     * Set Rocketmq集群标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param RocketMQFlag Rocketmq集群标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRocketMQFlag(Boolean RocketMQFlag) {
        this.RocketMQFlag = RocketMQFlag;
    }

    /**
     * Get 计费状态，1表示正常，2表示已停服，3表示已销毁
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 计费状态，1表示正常，2表示已停服，3表示已销毁
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 计费状态，1表示正常，2表示已停服，3表示已销毁
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 计费状态，1表示正常，2表示已停服，3表示已销毁
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 欠费停服时间，毫秒为单位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsolateTime 欠费停服时间，毫秒为单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsolateTime() {
        return this.IsolateTime;
    }

    /**
     * Set 欠费停服时间，毫秒为单位
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsolateTime 欠费停服时间，毫秒为单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsolateTime(Long IsolateTime) {
        this.IsolateTime = IsolateTime;
    }

    /**
     * Get HTTP协议公网接入地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HttpPublicEndpoint HTTP协议公网接入地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHttpPublicEndpoint() {
        return this.HttpPublicEndpoint;
    }

    /**
     * Set HTTP协议公网接入地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param HttpPublicEndpoint HTTP协议公网接入地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttpPublicEndpoint(String HttpPublicEndpoint) {
        this.HttpPublicEndpoint = HttpPublicEndpoint;
    }

    /**
     * Get HTTP协议VPC接入地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HttpVpcEndpoint HTTP协议VPC接入地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHttpVpcEndpoint() {
        return this.HttpVpcEndpoint;
    }

    /**
     * Set HTTP协议VPC接入地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param HttpVpcEndpoint HTTP协议VPC接入地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttpVpcEndpoint(String HttpVpcEndpoint) {
        this.HttpVpcEndpoint = HttpVpcEndpoint;
    }

    /**
     * Get TCP内部接入地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InternalEndpoint TCP内部接入地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInternalEndpoint() {
        return this.InternalEndpoint;
    }

    /**
     * Set TCP内部接入地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param InternalEndpoint TCP内部接入地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInternalEndpoint(String InternalEndpoint) {
        this.InternalEndpoint = InternalEndpoint;
    }

    /**
     * Get HTTP协议内部接入地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HttpInternalEndpoint HTTP协议内部接入地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHttpInternalEndpoint() {
        return this.HttpInternalEndpoint;
    }

    /**
     * Set HTTP协议内部接入地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param HttpInternalEndpoint HTTP协议内部接入地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttpInternalEndpoint(String HttpInternalEndpoint) {
        this.HttpInternalEndpoint = HttpInternalEndpoint;
    }

    /**
     * Get 是否开启ACL鉴权，专享实例支持关闭
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AclEnabled 是否开启ACL鉴权，专享实例支持关闭
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAclEnabled() {
        return this.AclEnabled;
    }

    /**
     * Set 是否开启ACL鉴权，专享实例支持关闭
注意：此字段可能返回 null，表示取不到有效值。
     * @param AclEnabled 是否开启ACL鉴权，专享实例支持关闭
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAclEnabled(Boolean AclEnabled) {
        this.AclEnabled = AclEnabled;
    }

    /**
     * Get 公网CLB实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicClbId 公网CLB实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublicClbId() {
        return this.PublicClbId;
    }

    /**
     * Set 公网CLB实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicClbId 公网CLB实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicClbId(String PublicClbId) {
        this.PublicClbId = PublicClbId;
    }

    /**
     * Get vip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vip vip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set vip
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vip vip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 所属VPC
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId 所属VPC
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 所属VPC
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId 所属VPC
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 是否支持迁移
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportMigration 是否支持迁移
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSupportMigration() {
        return this.SupportMigration;
    }

    /**
     * Set 是否支持迁移
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportMigration 是否支持迁移
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportMigration(Boolean SupportMigration) {
        this.SupportMigration = SupportMigration;
    }

    /**
     * Get 实例状态，0表示创建中，1表示正常，2表示隔离中，3表示已销毁，4 - 异常, 5 - 发货失败，6 - 变配中，7 - 变配失败
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceStatus 实例状态，0表示创建中，1表示正常，2表示隔离中，3表示已销毁，4 - 异常, 5 - 发货失败，6 - 变配中，7 - 变配失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set 实例状态，0表示创建中，1表示正常，2表示隔离中，3表示已销毁，4 - 异常, 5 - 发货失败，6 - 变配中，7 - 变配失败
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceStatus 实例状态，0表示创建中，1表示正常，2表示隔离中，3表示已销毁，4 - 异常, 5 - 发货失败，6 - 变配中，7 - 变配失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceStatus(Long InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get 集群所属可用区，表明集群归属的可用区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneId 集群所属可用区，表明集群归属的可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 集群所属可用区，表明集群归属的可用区
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneId 集群所属可用区，表明集群归属的可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 集群节点所在的可用区，若该集群为跨可用区集群，则包含该集群节点所在的多个可用区。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneIds 集群节点所在的可用区，若该集群为跨可用区集群，则包含该集群节点所在的多个可用区。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set 集群节点所在的可用区，若该集群为跨可用区集群，则包含该集群节点所在的多个可用区。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneIds 集群节点所在的可用区，若该集群为跨可用区集群，则包含该集群节点所在的多个可用区。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneIds(Long [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get 是否已冻结 
     * @return IsFrozen 是否已冻结
     */
    public Boolean getIsFrozen() {
        return this.IsFrozen;
    }

    /**
     * Set 是否已冻结
     * @param IsFrozen 是否已冻结
     */
    public void setIsFrozen(Boolean IsFrozen) {
        this.IsFrozen = IsFrozen;
    }

    /**
     * Get 是否开启自动创建主题 
     * @return AutoCreateTopicEnabled 是否开启自动创建主题
     */
    public Boolean getAutoCreateTopicEnabled() {
        return this.AutoCreateTopicEnabled;
    }

    /**
     * Set 是否开启自动创建主题
     * @param AutoCreateTopicEnabled 是否开启自动创建主题
     */
    public void setAutoCreateTopicEnabled(Boolean AutoCreateTopicEnabled) {
        this.AutoCreateTopicEnabled = AutoCreateTopicEnabled;
    }

    /**
     * Get 是否开启集群Admin能力 
     * @return AdminFeatureEnabled 是否开启集群Admin能力
     */
    public Boolean getAdminFeatureEnabled() {
        return this.AdminFeatureEnabled;
    }

    /**
     * Set 是否开启集群Admin能力
     * @param AdminFeatureEnabled 是否开启集群Admin能力
     */
    public void setAdminFeatureEnabled(Boolean AdminFeatureEnabled) {
        this.AdminFeatureEnabled = AdminFeatureEnabled;
    }

    /**
     * Get Admin AK
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdminAccessKey Admin AK
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAdminAccessKey() {
        return this.AdminAccessKey;
    }

    /**
     * Set Admin AK
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdminAccessKey Admin AK
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdminAccessKey(String AdminAccessKey) {
        this.AdminAccessKey = AdminAccessKey;
    }

    /**
     * Get Admin SK
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdminSecretKey Admin SK
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAdminSecretKey() {
        return this.AdminSecretKey;
    }

    /**
     * Set Admin SK
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdminSecretKey Admin SK
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdminSecretKey(String AdminSecretKey) {
        this.AdminSecretKey = AdminSecretKey;
    }

    /**
     * Get 是否开启删除保护 
     * @return EnableDeletionProtection 是否开启删除保护
     */
    public Boolean getEnableDeletionProtection() {
        return this.EnableDeletionProtection;
    }

    /**
     * Set 是否开启删除保护
     * @param EnableDeletionProtection 是否开启删除保护
     */
    public void setEnableDeletionProtection(Boolean EnableDeletionProtection) {
        this.EnableDeletionProtection = EnableDeletionProtection;
    }

    public RocketMQClusterInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RocketMQClusterInfo(RocketMQClusterInfo source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.PublicEndPoint != null) {
            this.PublicEndPoint = new String(source.PublicEndPoint);
        }
        if (source.VpcEndPoint != null) {
            this.VpcEndPoint = new String(source.VpcEndPoint);
        }
        if (source.SupportNamespaceEndpoint != null) {
            this.SupportNamespaceEndpoint = new Boolean(source.SupportNamespaceEndpoint);
        }
        if (source.Vpcs != null) {
            this.Vpcs = new VpcConfig[source.Vpcs.length];
            for (int i = 0; i < source.Vpcs.length; i++) {
                this.Vpcs[i] = new VpcConfig(source.Vpcs[i]);
            }
        }
        if (source.IsVip != null) {
            this.IsVip = new Boolean(source.IsVip);
        }
        if (source.RocketMQFlag != null) {
            this.RocketMQFlag = new Boolean(source.RocketMQFlag);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.IsolateTime != null) {
            this.IsolateTime = new Long(source.IsolateTime);
        }
        if (source.HttpPublicEndpoint != null) {
            this.HttpPublicEndpoint = new String(source.HttpPublicEndpoint);
        }
        if (source.HttpVpcEndpoint != null) {
            this.HttpVpcEndpoint = new String(source.HttpVpcEndpoint);
        }
        if (source.InternalEndpoint != null) {
            this.InternalEndpoint = new String(source.InternalEndpoint);
        }
        if (source.HttpInternalEndpoint != null) {
            this.HttpInternalEndpoint = new String(source.HttpInternalEndpoint);
        }
        if (source.AclEnabled != null) {
            this.AclEnabled = new Boolean(source.AclEnabled);
        }
        if (source.PublicClbId != null) {
            this.PublicClbId = new String(source.PublicClbId);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SupportMigration != null) {
            this.SupportMigration = new Boolean(source.SupportMigration);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new Long(source.InstanceStatus);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.ZoneIds != null) {
            this.ZoneIds = new Long[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new Long(source.ZoneIds[i]);
            }
        }
        if (source.IsFrozen != null) {
            this.IsFrozen = new Boolean(source.IsFrozen);
        }
        if (source.AutoCreateTopicEnabled != null) {
            this.AutoCreateTopicEnabled = new Boolean(source.AutoCreateTopicEnabled);
        }
        if (source.AdminFeatureEnabled != null) {
            this.AdminFeatureEnabled = new Boolean(source.AdminFeatureEnabled);
        }
        if (source.AdminAccessKey != null) {
            this.AdminAccessKey = new String(source.AdminAccessKey);
        }
        if (source.AdminSecretKey != null) {
            this.AdminSecretKey = new String(source.AdminSecretKey);
        }
        if (source.EnableDeletionProtection != null) {
            this.EnableDeletionProtection = new Boolean(source.EnableDeletionProtection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "PublicEndPoint", this.PublicEndPoint);
        this.setParamSimple(map, prefix + "VpcEndPoint", this.VpcEndPoint);
        this.setParamSimple(map, prefix + "SupportNamespaceEndpoint", this.SupportNamespaceEndpoint);
        this.setParamArrayObj(map, prefix + "Vpcs.", this.Vpcs);
        this.setParamSimple(map, prefix + "IsVip", this.IsVip);
        this.setParamSimple(map, prefix + "RocketMQFlag", this.RocketMQFlag);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsolateTime", this.IsolateTime);
        this.setParamSimple(map, prefix + "HttpPublicEndpoint", this.HttpPublicEndpoint);
        this.setParamSimple(map, prefix + "HttpVpcEndpoint", this.HttpVpcEndpoint);
        this.setParamSimple(map, prefix + "InternalEndpoint", this.InternalEndpoint);
        this.setParamSimple(map, prefix + "HttpInternalEndpoint", this.HttpInternalEndpoint);
        this.setParamSimple(map, prefix + "AclEnabled", this.AclEnabled);
        this.setParamSimple(map, prefix + "PublicClbId", this.PublicClbId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SupportMigration", this.SupportMigration);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamSimple(map, prefix + "IsFrozen", this.IsFrozen);
        this.setParamSimple(map, prefix + "AutoCreateTopicEnabled", this.AutoCreateTopicEnabled);
        this.setParamSimple(map, prefix + "AdminFeatureEnabled", this.AdminFeatureEnabled);
        this.setParamSimple(map, prefix + "AdminAccessKey", this.AdminAccessKey);
        this.setParamSimple(map, prefix + "AdminSecretKey", this.AdminSecretKey);
        this.setParamSimple(map, prefix + "EnableDeletionProtection", this.EnableDeletionProtection);

    }
}

