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
    * <p>集群ID</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>集群名称</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>地域信息</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>创建时间，毫秒为单位</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>集群说明信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>公网接入地址</p>
    */
    @SerializedName("PublicEndPoint")
    @Expose
    private String PublicEndPoint;

    /**
    * <p>VPC接入地址</p>
    */
    @SerializedName("VpcEndPoint")
    @Expose
    private String VpcEndPoint;

    /**
    * <p>是否支持命名空间接入点</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportNamespaceEndpoint")
    @Expose
    private Boolean SupportNamespaceEndpoint;

    /**
    * <p>VPC信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vpcs")
    @Expose
    private VpcConfig [] Vpcs;

    /**
    * <p>是否为专享实例</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsVip")
    @Expose
    private Boolean IsVip;

    /**
    * <p>Rocketmq集群标识</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RocketMQFlag")
    @Expose
    private Boolean RocketMQFlag;

    /**
    * <p>计费状态，1表示正常，2表示已停服，3表示已销毁</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>欠费停服时间，毫秒为单位</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsolateTime")
    @Expose
    private Long IsolateTime;

    /**
    * <p>HTTP协议公网接入地址</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HttpPublicEndpoint")
    @Expose
    private String HttpPublicEndpoint;

    /**
    * <p>HTTP协议VPC接入地址</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HttpVpcEndpoint")
    @Expose
    private String HttpVpcEndpoint;

    /**
    * <p>TCP内部接入地址</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InternalEndpoint")
    @Expose
    private String InternalEndpoint;

    /**
    * <p>HTTP协议内部接入地址</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HttpInternalEndpoint")
    @Expose
    private String HttpInternalEndpoint;

    /**
    * <p>是否开启ACL鉴权，专享实例支持关闭</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AclEnabled")
    @Expose
    private Boolean AclEnabled;

    /**
    * <p>公网CLB实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicClbId")
    @Expose
    private String PublicClbId;

    /**
    * <p>vip</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * <p>所属VPC</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>是否支持迁移</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportMigration")
    @Expose
    private Boolean SupportMigration;

    /**
    * <p>实例状态，0表示创建中，1表示正常，2表示隔离中，3表示已销毁，4 - 异常, 5 - 发货失败，6 - 变配中，7 - 变配失败</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceStatus")
    @Expose
    private Long InstanceStatus;

    /**
    * <p>集群所属可用区，表明集群归属的可用区</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * <p>集群节点所在的可用区，若该集群为跨可用区集群，则包含该集群节点所在的多个可用区。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneIds")
    @Expose
    private Long [] ZoneIds;

    /**
    * <p>是否已冻结</p>
    */
    @SerializedName("IsFrozen")
    @Expose
    private Boolean IsFrozen;

    /**
    * <p>是否开启自动创建主题</p>
    */
    @SerializedName("AutoCreateTopicEnabled")
    @Expose
    private Boolean AutoCreateTopicEnabled;

    /**
    * <p>是否开启集群Admin能力</p>
    */
    @SerializedName("AdminFeatureEnabled")
    @Expose
    private Boolean AdminFeatureEnabled;

    /**
    * <p>Admin AK</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdminAccessKey")
    @Expose
    private String AdminAccessKey;

    /**
    * <p>Admin SK</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdminSecretKey")
    @Expose
    private String AdminSecretKey;

    /**
    * <p>是否开启删除保护</p>
    */
    @SerializedName("EnableDeletionProtection")
    @Expose
    private Boolean EnableDeletionProtection;

    /**
    * <p>是否开启自动创建消费组</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoCreateConsumeGroupEnabled")
    @Expose
    private Boolean AutoCreateConsumeGroupEnabled;

    /**
     * Get <p>集群ID</p> 
     * @return ClusterId <p>集群ID</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群ID</p>
     * @param ClusterId <p>集群ID</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>集群名称</p> 
     * @return ClusterName <p>集群名称</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>集群名称</p>
     * @param ClusterName <p>集群名称</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>地域信息</p> 
     * @return Region <p>地域信息</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域信息</p>
     * @param Region <p>地域信息</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>创建时间，毫秒为单位</p> 
     * @return CreateTime <p>创建时间，毫秒为单位</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间，毫秒为单位</p>
     * @param CreateTime <p>创建时间，毫秒为单位</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>集群说明信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark <p>集群说明信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>集群说明信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark <p>集群说明信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>公网接入地址</p> 
     * @return PublicEndPoint <p>公网接入地址</p>
     */
    public String getPublicEndPoint() {
        return this.PublicEndPoint;
    }

    /**
     * Set <p>公网接入地址</p>
     * @param PublicEndPoint <p>公网接入地址</p>
     */
    public void setPublicEndPoint(String PublicEndPoint) {
        this.PublicEndPoint = PublicEndPoint;
    }

    /**
     * Get <p>VPC接入地址</p> 
     * @return VpcEndPoint <p>VPC接入地址</p>
     */
    public String getVpcEndPoint() {
        return this.VpcEndPoint;
    }

    /**
     * Set <p>VPC接入地址</p>
     * @param VpcEndPoint <p>VPC接入地址</p>
     */
    public void setVpcEndPoint(String VpcEndPoint) {
        this.VpcEndPoint = VpcEndPoint;
    }

    /**
     * Get <p>是否支持命名空间接入点</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportNamespaceEndpoint <p>是否支持命名空间接入点</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSupportNamespaceEndpoint() {
        return this.SupportNamespaceEndpoint;
    }

    /**
     * Set <p>是否支持命名空间接入点</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportNamespaceEndpoint <p>是否支持命名空间接入点</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportNamespaceEndpoint(Boolean SupportNamespaceEndpoint) {
        this.SupportNamespaceEndpoint = SupportNamespaceEndpoint;
    }

    /**
     * Get <p>VPC信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vpcs <p>VPC信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VpcConfig [] getVpcs() {
        return this.Vpcs;
    }

    /**
     * Set <p>VPC信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vpcs <p>VPC信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcs(VpcConfig [] Vpcs) {
        this.Vpcs = Vpcs;
    }

    /**
     * Get <p>是否为专享实例</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsVip <p>是否为专享实例</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsVip() {
        return this.IsVip;
    }

    /**
     * Set <p>是否为专享实例</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsVip <p>是否为专享实例</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsVip(Boolean IsVip) {
        this.IsVip = IsVip;
    }

    /**
     * Get <p>Rocketmq集群标识</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RocketMQFlag <p>Rocketmq集群标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getRocketMQFlag() {
        return this.RocketMQFlag;
    }

    /**
     * Set <p>Rocketmq集群标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RocketMQFlag <p>Rocketmq集群标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRocketMQFlag(Boolean RocketMQFlag) {
        this.RocketMQFlag = RocketMQFlag;
    }

    /**
     * Get <p>计费状态，1表示正常，2表示已停服，3表示已销毁</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>计费状态，1表示正常，2表示已停服，3表示已销毁</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>计费状态，1表示正常，2表示已停服，3表示已销毁</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>计费状态，1表示正常，2表示已停服，3表示已销毁</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>欠费停服时间，毫秒为单位</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsolateTime <p>欠费停服时间，毫秒为单位</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsolateTime() {
        return this.IsolateTime;
    }

    /**
     * Set <p>欠费停服时间，毫秒为单位</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsolateTime <p>欠费停服时间，毫秒为单位</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsolateTime(Long IsolateTime) {
        this.IsolateTime = IsolateTime;
    }

    /**
     * Get <p>HTTP协议公网接入地址</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HttpPublicEndpoint <p>HTTP协议公网接入地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHttpPublicEndpoint() {
        return this.HttpPublicEndpoint;
    }

    /**
     * Set <p>HTTP协议公网接入地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HttpPublicEndpoint <p>HTTP协议公网接入地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttpPublicEndpoint(String HttpPublicEndpoint) {
        this.HttpPublicEndpoint = HttpPublicEndpoint;
    }

    /**
     * Get <p>HTTP协议VPC接入地址</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HttpVpcEndpoint <p>HTTP协议VPC接入地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHttpVpcEndpoint() {
        return this.HttpVpcEndpoint;
    }

    /**
     * Set <p>HTTP协议VPC接入地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HttpVpcEndpoint <p>HTTP协议VPC接入地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttpVpcEndpoint(String HttpVpcEndpoint) {
        this.HttpVpcEndpoint = HttpVpcEndpoint;
    }

    /**
     * Get <p>TCP内部接入地址</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InternalEndpoint <p>TCP内部接入地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInternalEndpoint() {
        return this.InternalEndpoint;
    }

    /**
     * Set <p>TCP内部接入地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InternalEndpoint <p>TCP内部接入地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInternalEndpoint(String InternalEndpoint) {
        this.InternalEndpoint = InternalEndpoint;
    }

    /**
     * Get <p>HTTP协议内部接入地址</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HttpInternalEndpoint <p>HTTP协议内部接入地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHttpInternalEndpoint() {
        return this.HttpInternalEndpoint;
    }

    /**
     * Set <p>HTTP协议内部接入地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HttpInternalEndpoint <p>HTTP协议内部接入地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttpInternalEndpoint(String HttpInternalEndpoint) {
        this.HttpInternalEndpoint = HttpInternalEndpoint;
    }

    /**
     * Get <p>是否开启ACL鉴权，专享实例支持关闭</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AclEnabled <p>是否开启ACL鉴权，专享实例支持关闭</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAclEnabled() {
        return this.AclEnabled;
    }

    /**
     * Set <p>是否开启ACL鉴权，专享实例支持关闭</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AclEnabled <p>是否开启ACL鉴权，专享实例支持关闭</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAclEnabled(Boolean AclEnabled) {
        this.AclEnabled = AclEnabled;
    }

    /**
     * Get <p>公网CLB实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicClbId <p>公网CLB实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublicClbId() {
        return this.PublicClbId;
    }

    /**
     * Set <p>公网CLB实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicClbId <p>公网CLB实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicClbId(String PublicClbId) {
        this.PublicClbId = PublicClbId;
    }

    /**
     * Get <p>vip</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vip <p>vip</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set <p>vip</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vip <p>vip</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get <p>所属VPC</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId <p>所属VPC</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>所属VPC</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId <p>所属VPC</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>是否支持迁移</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportMigration <p>是否支持迁移</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSupportMigration() {
        return this.SupportMigration;
    }

    /**
     * Set <p>是否支持迁移</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportMigration <p>是否支持迁移</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportMigration(Boolean SupportMigration) {
        this.SupportMigration = SupportMigration;
    }

    /**
     * Get <p>实例状态，0表示创建中，1表示正常，2表示隔离中，3表示已销毁，4 - 异常, 5 - 发货失败，6 - 变配中，7 - 变配失败</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceStatus <p>实例状态，0表示创建中，1表示正常，2表示隔离中，3表示已销毁，4 - 异常, 5 - 发货失败，6 - 变配中，7 - 变配失败</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set <p>实例状态，0表示创建中，1表示正常，2表示隔离中，3表示已销毁，4 - 异常, 5 - 发货失败，6 - 变配中，7 - 变配失败</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceStatus <p>实例状态，0表示创建中，1表示正常，2表示隔离中，3表示已销毁，4 - 异常, 5 - 发货失败，6 - 变配中，7 - 变配失败</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceStatus(Long InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get <p>集群所属可用区，表明集群归属的可用区</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneId <p>集群所属可用区，表明集群归属的可用区</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>集群所属可用区，表明集群归属的可用区</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneId <p>集群所属可用区，表明集群归属的可用区</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>集群节点所在的可用区，若该集群为跨可用区集群，则包含该集群节点所在的多个可用区。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneIds <p>集群节点所在的可用区，若该集群为跨可用区集群，则包含该集群节点所在的多个可用区。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set <p>集群节点所在的可用区，若该集群为跨可用区集群，则包含该集群节点所在的多个可用区。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneIds <p>集群节点所在的可用区，若该集群为跨可用区集群，则包含该集群节点所在的多个可用区。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneIds(Long [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get <p>是否已冻结</p> 
     * @return IsFrozen <p>是否已冻结</p>
     */
    public Boolean getIsFrozen() {
        return this.IsFrozen;
    }

    /**
     * Set <p>是否已冻结</p>
     * @param IsFrozen <p>是否已冻结</p>
     */
    public void setIsFrozen(Boolean IsFrozen) {
        this.IsFrozen = IsFrozen;
    }

    /**
     * Get <p>是否开启自动创建主题</p> 
     * @return AutoCreateTopicEnabled <p>是否开启自动创建主题</p>
     */
    public Boolean getAutoCreateTopicEnabled() {
        return this.AutoCreateTopicEnabled;
    }

    /**
     * Set <p>是否开启自动创建主题</p>
     * @param AutoCreateTopicEnabled <p>是否开启自动创建主题</p>
     */
    public void setAutoCreateTopicEnabled(Boolean AutoCreateTopicEnabled) {
        this.AutoCreateTopicEnabled = AutoCreateTopicEnabled;
    }

    /**
     * Get <p>是否开启集群Admin能力</p> 
     * @return AdminFeatureEnabled <p>是否开启集群Admin能力</p>
     */
    public Boolean getAdminFeatureEnabled() {
        return this.AdminFeatureEnabled;
    }

    /**
     * Set <p>是否开启集群Admin能力</p>
     * @param AdminFeatureEnabled <p>是否开启集群Admin能力</p>
     */
    public void setAdminFeatureEnabled(Boolean AdminFeatureEnabled) {
        this.AdminFeatureEnabled = AdminFeatureEnabled;
    }

    /**
     * Get <p>Admin AK</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdminAccessKey <p>Admin AK</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAdminAccessKey() {
        return this.AdminAccessKey;
    }

    /**
     * Set <p>Admin AK</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdminAccessKey <p>Admin AK</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdminAccessKey(String AdminAccessKey) {
        this.AdminAccessKey = AdminAccessKey;
    }

    /**
     * Get <p>Admin SK</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdminSecretKey <p>Admin SK</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAdminSecretKey() {
        return this.AdminSecretKey;
    }

    /**
     * Set <p>Admin SK</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdminSecretKey <p>Admin SK</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdminSecretKey(String AdminSecretKey) {
        this.AdminSecretKey = AdminSecretKey;
    }

    /**
     * Get <p>是否开启删除保护</p> 
     * @return EnableDeletionProtection <p>是否开启删除保护</p>
     */
    public Boolean getEnableDeletionProtection() {
        return this.EnableDeletionProtection;
    }

    /**
     * Set <p>是否开启删除保护</p>
     * @param EnableDeletionProtection <p>是否开启删除保护</p>
     */
    public void setEnableDeletionProtection(Boolean EnableDeletionProtection) {
        this.EnableDeletionProtection = EnableDeletionProtection;
    }

    /**
     * Get <p>是否开启自动创建消费组</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoCreateConsumeGroupEnabled <p>是否开启自动创建消费组</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAutoCreateConsumeGroupEnabled() {
        return this.AutoCreateConsumeGroupEnabled;
    }

    /**
     * Set <p>是否开启自动创建消费组</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoCreateConsumeGroupEnabled <p>是否开启自动创建消费组</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoCreateConsumeGroupEnabled(Boolean AutoCreateConsumeGroupEnabled) {
        this.AutoCreateConsumeGroupEnabled = AutoCreateConsumeGroupEnabled;
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
        if (source.AutoCreateConsumeGroupEnabled != null) {
            this.AutoCreateConsumeGroupEnabled = new Boolean(source.AutoCreateConsumeGroupEnabled);
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
        this.setParamSimple(map, prefix + "AutoCreateConsumeGroupEnabled", this.AutoCreateConsumeGroupEnabled);

    }
}

