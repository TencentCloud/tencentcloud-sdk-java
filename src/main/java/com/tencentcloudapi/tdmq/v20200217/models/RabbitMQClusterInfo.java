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

public class RabbitMQClusterInfo extends AbstractModel {

    /**
    * <p>集群 ID</p>
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
    * <p>创建时间，毫秒为单位。unix 时间戳</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>集群说明信息</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>VPC及网络信息</p>
    */
    @SerializedName("Vpcs")
    @Expose
    private VpcEndpointInfo [] Vpcs;

    /**
    * <p>可用区信息</p>
    */
    @SerializedName("ZoneIds")
    @Expose
    private Long [] ZoneIds;

    /**
    * <p>虚拟主机数量</p>
    */
    @SerializedName("VirtualHostNumber")
    @Expose
    private Long VirtualHostNumber;

    /**
    * <p>队列数量</p>
    */
    @SerializedName("QueueNumber")
    @Expose
    private Long QueueNumber;

    /**
    * <p>每秒生产消息数 单位：条/秒</p>
    */
    @SerializedName("MessagePublishRate")
    @Expose
    private Float MessagePublishRate;

    /**
    * <p>堆积消息数 单位：条</p>
    */
    @SerializedName("MessageStackNumber")
    @Expose
    private Long MessageStackNumber;

    /**
    * <p>实例到期时间，按量付费的资源该值为 0，毫秒为单位。unix 时间戳</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * <p>Channel数量</p>
    */
    @SerializedName("ChannelNumber")
    @Expose
    private Long ChannelNumber;

    /**
    * <p>Connection数量</p>
    */
    @SerializedName("ConnectionNumber")
    @Expose
    private Long ConnectionNumber;

    /**
    * <p>Consumer数量</p>
    */
    @SerializedName("ConsumerNumber")
    @Expose
    private Long ConsumerNumber;

    /**
    * <p>Exchang数量</p>
    */
    @SerializedName("ExchangeNumber")
    @Expose
    private Long ExchangeNumber;

    /**
    * <p>集群异常信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExceptionInformation")
    @Expose
    private String ExceptionInformation;

    /**
    * <p>实例状态，0表示创建中，1表示正常，2表示隔离中，3表示已销毁，4 - 异常, 5 - 发货失败</p>
    */
    @SerializedName("ClusterStatus")
    @Expose
    private Long ClusterStatus;

    /**
    * <p>自动续费标记，0表示默认状态(用户未设置，即初始状态即手动续费)， 1表示自动续费，2表示明确不自动续费(用户设置)</p>
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * <p>是否开启镜像队列策略。1表示开启，0表示没开启。</p>
    */
    @SerializedName("MirrorQueuePolicyFlag")
    @Expose
    private Long MirrorQueuePolicyFlag;

    /**
    * <p>每秒消费消息数 单位：条/秒</p>
    */
    @SerializedName("MessageConsumeRate")
    @Expose
    private Float MessageConsumeRate;

    /**
    * <p>集群版本信息</p>
    */
    @SerializedName("ClusterVersion")
    @Expose
    private String ClusterVersion;

    /**
    * <p>计费模式，0-后付费，1-预付费</p>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>实例类型，0 专享版、1 Serverless 版</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * <p>开始隔离时间。unix 时间戳</p>
    */
    @SerializedName("IsolatedTime")
    @Expose
    private Long IsolatedTime;

    /**
    * <p>是否为容器实例，默认 true</p>
    */
    @SerializedName("Container")
    @Expose
    private Boolean Container;

    /**
    * <p>标签列表</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>是否已开启删除保护</p>
    */
    @SerializedName("EnableDeletionProtection")
    @Expose
    private Boolean EnableDeletionProtection;

    /**
    * <p>是否有vhost未开启镜像队列风险</p>
    */
    @SerializedName("MirroredQueueRisk")
    @Expose
    private Boolean MirroredQueueRisk;

    /**
    * <p>是否提示风险</p>
    */
    @SerializedName("EnableRiskWarning")
    @Expose
    private Boolean EnableRiskWarning;

    /**
    * <p>消费超时时间</p>
    */
    @SerializedName("ConsumeTimeout")
    @Expose
    private Long ConsumeTimeout;

    /**
    * <p>最大Channel数</p>
    */
    @SerializedName("ChannelMax")
    @Expose
    private Long ChannelMax;

    /**
    * <p>集群类型</p><p>枚举值：</p><ul><li>NORMAL： 公有云</li><li>CDC： 本地专用集群</li></ul>
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * <p>CDC集群ID</p>
    */
    @SerializedName("CdcClusterId")
    @Expose
    private String CdcClusterId;

    /**
     * Get <p>集群 ID</p> 
     * @return ClusterId <p>集群 ID</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群 ID</p>
     * @param ClusterId <p>集群 ID</p>
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
     * Get <p>创建时间，毫秒为单位。unix 时间戳</p> 
     * @return CreateTime <p>创建时间，毫秒为单位。unix 时间戳</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间，毫秒为单位。unix 时间戳</p>
     * @param CreateTime <p>创建时间，毫秒为单位。unix 时间戳</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>集群说明信息</p> 
     * @return Remark <p>集群说明信息</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>集群说明信息</p>
     * @param Remark <p>集群说明信息</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>VPC及网络信息</p> 
     * @return Vpcs <p>VPC及网络信息</p>
     */
    public VpcEndpointInfo [] getVpcs() {
        return this.Vpcs;
    }

    /**
     * Set <p>VPC及网络信息</p>
     * @param Vpcs <p>VPC及网络信息</p>
     */
    public void setVpcs(VpcEndpointInfo [] Vpcs) {
        this.Vpcs = Vpcs;
    }

    /**
     * Get <p>可用区信息</p> 
     * @return ZoneIds <p>可用区信息</p>
     */
    public Long [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set <p>可用区信息</p>
     * @param ZoneIds <p>可用区信息</p>
     */
    public void setZoneIds(Long [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get <p>虚拟主机数量</p> 
     * @return VirtualHostNumber <p>虚拟主机数量</p>
     */
    public Long getVirtualHostNumber() {
        return this.VirtualHostNumber;
    }

    /**
     * Set <p>虚拟主机数量</p>
     * @param VirtualHostNumber <p>虚拟主机数量</p>
     */
    public void setVirtualHostNumber(Long VirtualHostNumber) {
        this.VirtualHostNumber = VirtualHostNumber;
    }

    /**
     * Get <p>队列数量</p> 
     * @return QueueNumber <p>队列数量</p>
     */
    public Long getQueueNumber() {
        return this.QueueNumber;
    }

    /**
     * Set <p>队列数量</p>
     * @param QueueNumber <p>队列数量</p>
     */
    public void setQueueNumber(Long QueueNumber) {
        this.QueueNumber = QueueNumber;
    }

    /**
     * Get <p>每秒生产消息数 单位：条/秒</p> 
     * @return MessagePublishRate <p>每秒生产消息数 单位：条/秒</p>
     */
    public Float getMessagePublishRate() {
        return this.MessagePublishRate;
    }

    /**
     * Set <p>每秒生产消息数 单位：条/秒</p>
     * @param MessagePublishRate <p>每秒生产消息数 单位：条/秒</p>
     */
    public void setMessagePublishRate(Float MessagePublishRate) {
        this.MessagePublishRate = MessagePublishRate;
    }

    /**
     * Get <p>堆积消息数 单位：条</p> 
     * @return MessageStackNumber <p>堆积消息数 单位：条</p>
     */
    public Long getMessageStackNumber() {
        return this.MessageStackNumber;
    }

    /**
     * Set <p>堆积消息数 单位：条</p>
     * @param MessageStackNumber <p>堆积消息数 单位：条</p>
     */
    public void setMessageStackNumber(Long MessageStackNumber) {
        this.MessageStackNumber = MessageStackNumber;
    }

    /**
     * Get <p>实例到期时间，按量付费的资源该值为 0，毫秒为单位。unix 时间戳</p> 
     * @return ExpireTime <p>实例到期时间，按量付费的资源该值为 0，毫秒为单位。unix 时间戳</p>
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>实例到期时间，按量付费的资源该值为 0，毫秒为单位。unix 时间戳</p>
     * @param ExpireTime <p>实例到期时间，按量付费的资源该值为 0，毫秒为单位。unix 时间戳</p>
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>Channel数量</p> 
     * @return ChannelNumber <p>Channel数量</p>
     */
    public Long getChannelNumber() {
        return this.ChannelNumber;
    }

    /**
     * Set <p>Channel数量</p>
     * @param ChannelNumber <p>Channel数量</p>
     */
    public void setChannelNumber(Long ChannelNumber) {
        this.ChannelNumber = ChannelNumber;
    }

    /**
     * Get <p>Connection数量</p> 
     * @return ConnectionNumber <p>Connection数量</p>
     */
    public Long getConnectionNumber() {
        return this.ConnectionNumber;
    }

    /**
     * Set <p>Connection数量</p>
     * @param ConnectionNumber <p>Connection数量</p>
     */
    public void setConnectionNumber(Long ConnectionNumber) {
        this.ConnectionNumber = ConnectionNumber;
    }

    /**
     * Get <p>Consumer数量</p> 
     * @return ConsumerNumber <p>Consumer数量</p>
     */
    public Long getConsumerNumber() {
        return this.ConsumerNumber;
    }

    /**
     * Set <p>Consumer数量</p>
     * @param ConsumerNumber <p>Consumer数量</p>
     */
    public void setConsumerNumber(Long ConsumerNumber) {
        this.ConsumerNumber = ConsumerNumber;
    }

    /**
     * Get <p>Exchang数量</p> 
     * @return ExchangeNumber <p>Exchang数量</p>
     */
    public Long getExchangeNumber() {
        return this.ExchangeNumber;
    }

    /**
     * Set <p>Exchang数量</p>
     * @param ExchangeNumber <p>Exchang数量</p>
     */
    public void setExchangeNumber(Long ExchangeNumber) {
        this.ExchangeNumber = ExchangeNumber;
    }

    /**
     * Get <p>集群异常信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExceptionInformation <p>集群异常信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExceptionInformation() {
        return this.ExceptionInformation;
    }

    /**
     * Set <p>集群异常信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExceptionInformation <p>集群异常信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExceptionInformation(String ExceptionInformation) {
        this.ExceptionInformation = ExceptionInformation;
    }

    /**
     * Get <p>实例状态，0表示创建中，1表示正常，2表示隔离中，3表示已销毁，4 - 异常, 5 - 发货失败</p> 
     * @return ClusterStatus <p>实例状态，0表示创建中，1表示正常，2表示隔离中，3表示已销毁，4 - 异常, 5 - 发货失败</p>
     */
    public Long getClusterStatus() {
        return this.ClusterStatus;
    }

    /**
     * Set <p>实例状态，0表示创建中，1表示正常，2表示隔离中，3表示已销毁，4 - 异常, 5 - 发货失败</p>
     * @param ClusterStatus <p>实例状态，0表示创建中，1表示正常，2表示隔离中，3表示已销毁，4 - 异常, 5 - 发货失败</p>
     */
    public void setClusterStatus(Long ClusterStatus) {
        this.ClusterStatus = ClusterStatus;
    }

    /**
     * Get <p>自动续费标记，0表示默认状态(用户未设置，即初始状态即手动续费)， 1表示自动续费，2表示明确不自动续费(用户设置)</p> 
     * @return AutoRenewFlag <p>自动续费标记，0表示默认状态(用户未设置，即初始状态即手动续费)， 1表示自动续费，2表示明确不自动续费(用户设置)</p>
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set <p>自动续费标记，0表示默认状态(用户未设置，即初始状态即手动续费)， 1表示自动续费，2表示明确不自动续费(用户设置)</p>
     * @param AutoRenewFlag <p>自动续费标记，0表示默认状态(用户未设置，即初始状态即手动续费)， 1表示自动续费，2表示明确不自动续费(用户设置)</p>
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get <p>是否开启镜像队列策略。1表示开启，0表示没开启。</p> 
     * @return MirrorQueuePolicyFlag <p>是否开启镜像队列策略。1表示开启，0表示没开启。</p>
     */
    public Long getMirrorQueuePolicyFlag() {
        return this.MirrorQueuePolicyFlag;
    }

    /**
     * Set <p>是否开启镜像队列策略。1表示开启，0表示没开启。</p>
     * @param MirrorQueuePolicyFlag <p>是否开启镜像队列策略。1表示开启，0表示没开启。</p>
     */
    public void setMirrorQueuePolicyFlag(Long MirrorQueuePolicyFlag) {
        this.MirrorQueuePolicyFlag = MirrorQueuePolicyFlag;
    }

    /**
     * Get <p>每秒消费消息数 单位：条/秒</p> 
     * @return MessageConsumeRate <p>每秒消费消息数 单位：条/秒</p>
     */
    public Float getMessageConsumeRate() {
        return this.MessageConsumeRate;
    }

    /**
     * Set <p>每秒消费消息数 单位：条/秒</p>
     * @param MessageConsumeRate <p>每秒消费消息数 单位：条/秒</p>
     */
    public void setMessageConsumeRate(Float MessageConsumeRate) {
        this.MessageConsumeRate = MessageConsumeRate;
    }

    /**
     * Get <p>集群版本信息</p> 
     * @return ClusterVersion <p>集群版本信息</p>
     */
    public String getClusterVersion() {
        return this.ClusterVersion;
    }

    /**
     * Set <p>集群版本信息</p>
     * @param ClusterVersion <p>集群版本信息</p>
     */
    public void setClusterVersion(String ClusterVersion) {
        this.ClusterVersion = ClusterVersion;
    }

    /**
     * Get <p>计费模式，0-后付费，1-预付费</p> 
     * @return PayMode <p>计费模式，0-后付费，1-预付费</p>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>计费模式，0-后付费，1-预付费</p>
     * @param PayMode <p>计费模式，0-后付费，1-预付费</p>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>实例类型，0 专享版、1 Serverless 版</p> 
     * @return InstanceType <p>实例类型，0 专享版、1 Serverless 版</p>
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>实例类型，0 专享版、1 Serverless 版</p>
     * @param InstanceType <p>实例类型，0 专享版、1 Serverless 版</p>
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>开始隔离时间。unix 时间戳</p> 
     * @return IsolatedTime <p>开始隔离时间。unix 时间戳</p>
     */
    public Long getIsolatedTime() {
        return this.IsolatedTime;
    }

    /**
     * Set <p>开始隔离时间。unix 时间戳</p>
     * @param IsolatedTime <p>开始隔离时间。unix 时间戳</p>
     */
    public void setIsolatedTime(Long IsolatedTime) {
        this.IsolatedTime = IsolatedTime;
    }

    /**
     * Get <p>是否为容器实例，默认 true</p> 
     * @return Container <p>是否为容器实例，默认 true</p>
     */
    public Boolean getContainer() {
        return this.Container;
    }

    /**
     * Set <p>是否为容器实例，默认 true</p>
     * @param Container <p>是否为容器实例，默认 true</p>
     */
    public void setContainer(Boolean Container) {
        this.Container = Container;
    }

    /**
     * Get <p>标签列表</p> 
     * @return Tags <p>标签列表</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签列表</p>
     * @param Tags <p>标签列表</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>是否已开启删除保护</p> 
     * @return EnableDeletionProtection <p>是否已开启删除保护</p>
     */
    public Boolean getEnableDeletionProtection() {
        return this.EnableDeletionProtection;
    }

    /**
     * Set <p>是否已开启删除保护</p>
     * @param EnableDeletionProtection <p>是否已开启删除保护</p>
     */
    public void setEnableDeletionProtection(Boolean EnableDeletionProtection) {
        this.EnableDeletionProtection = EnableDeletionProtection;
    }

    /**
     * Get <p>是否有vhost未开启镜像队列风险</p> 
     * @return MirroredQueueRisk <p>是否有vhost未开启镜像队列风险</p>
     */
    public Boolean getMirroredQueueRisk() {
        return this.MirroredQueueRisk;
    }

    /**
     * Set <p>是否有vhost未开启镜像队列风险</p>
     * @param MirroredQueueRisk <p>是否有vhost未开启镜像队列风险</p>
     */
    public void setMirroredQueueRisk(Boolean MirroredQueueRisk) {
        this.MirroredQueueRisk = MirroredQueueRisk;
    }

    /**
     * Get <p>是否提示风险</p> 
     * @return EnableRiskWarning <p>是否提示风险</p>
     */
    public Boolean getEnableRiskWarning() {
        return this.EnableRiskWarning;
    }

    /**
     * Set <p>是否提示风险</p>
     * @param EnableRiskWarning <p>是否提示风险</p>
     */
    public void setEnableRiskWarning(Boolean EnableRiskWarning) {
        this.EnableRiskWarning = EnableRiskWarning;
    }

    /**
     * Get <p>消费超时时间</p> 
     * @return ConsumeTimeout <p>消费超时时间</p>
     */
    public Long getConsumeTimeout() {
        return this.ConsumeTimeout;
    }

    /**
     * Set <p>消费超时时间</p>
     * @param ConsumeTimeout <p>消费超时时间</p>
     */
    public void setConsumeTimeout(Long ConsumeTimeout) {
        this.ConsumeTimeout = ConsumeTimeout;
    }

    /**
     * Get <p>最大Channel数</p> 
     * @return ChannelMax <p>最大Channel数</p>
     */
    public Long getChannelMax() {
        return this.ChannelMax;
    }

    /**
     * Set <p>最大Channel数</p>
     * @param ChannelMax <p>最大Channel数</p>
     */
    public void setChannelMax(Long ChannelMax) {
        this.ChannelMax = ChannelMax;
    }

    /**
     * Get <p>集群类型</p><p>枚举值：</p><ul><li>NORMAL： 公有云</li><li>CDC： 本地专用集群</li></ul> 
     * @return ClusterType <p>集群类型</p><p>枚举值：</p><ul><li>NORMAL： 公有云</li><li>CDC： 本地专用集群</li></ul>
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set <p>集群类型</p><p>枚举值：</p><ul><li>NORMAL： 公有云</li><li>CDC： 本地专用集群</li></ul>
     * @param ClusterType <p>集群类型</p><p>枚举值：</p><ul><li>NORMAL： 公有云</li><li>CDC： 本地专用集群</li></ul>
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get <p>CDC集群ID</p> 
     * @return CdcClusterId <p>CDC集群ID</p>
     */
    public String getCdcClusterId() {
        return this.CdcClusterId;
    }

    /**
     * Set <p>CDC集群ID</p>
     * @param CdcClusterId <p>CDC集群ID</p>
     */
    public void setCdcClusterId(String CdcClusterId) {
        this.CdcClusterId = CdcClusterId;
    }

    public RabbitMQClusterInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RabbitMQClusterInfo(RabbitMQClusterInfo source) {
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
        if (source.Vpcs != null) {
            this.Vpcs = new VpcEndpointInfo[source.Vpcs.length];
            for (int i = 0; i < source.Vpcs.length; i++) {
                this.Vpcs[i] = new VpcEndpointInfo(source.Vpcs[i]);
            }
        }
        if (source.ZoneIds != null) {
            this.ZoneIds = new Long[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new Long(source.ZoneIds[i]);
            }
        }
        if (source.VirtualHostNumber != null) {
            this.VirtualHostNumber = new Long(source.VirtualHostNumber);
        }
        if (source.QueueNumber != null) {
            this.QueueNumber = new Long(source.QueueNumber);
        }
        if (source.MessagePublishRate != null) {
            this.MessagePublishRate = new Float(source.MessagePublishRate);
        }
        if (source.MessageStackNumber != null) {
            this.MessageStackNumber = new Long(source.MessageStackNumber);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.ChannelNumber != null) {
            this.ChannelNumber = new Long(source.ChannelNumber);
        }
        if (source.ConnectionNumber != null) {
            this.ConnectionNumber = new Long(source.ConnectionNumber);
        }
        if (source.ConsumerNumber != null) {
            this.ConsumerNumber = new Long(source.ConsumerNumber);
        }
        if (source.ExchangeNumber != null) {
            this.ExchangeNumber = new Long(source.ExchangeNumber);
        }
        if (source.ExceptionInformation != null) {
            this.ExceptionInformation = new String(source.ExceptionInformation);
        }
        if (source.ClusterStatus != null) {
            this.ClusterStatus = new Long(source.ClusterStatus);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.MirrorQueuePolicyFlag != null) {
            this.MirrorQueuePolicyFlag = new Long(source.MirrorQueuePolicyFlag);
        }
        if (source.MessageConsumeRate != null) {
            this.MessageConsumeRate = new Float(source.MessageConsumeRate);
        }
        if (source.ClusterVersion != null) {
            this.ClusterVersion = new String(source.ClusterVersion);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new Long(source.InstanceType);
        }
        if (source.IsolatedTime != null) {
            this.IsolatedTime = new Long(source.IsolatedTime);
        }
        if (source.Container != null) {
            this.Container = new Boolean(source.Container);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.EnableDeletionProtection != null) {
            this.EnableDeletionProtection = new Boolean(source.EnableDeletionProtection);
        }
        if (source.MirroredQueueRisk != null) {
            this.MirroredQueueRisk = new Boolean(source.MirroredQueueRisk);
        }
        if (source.EnableRiskWarning != null) {
            this.EnableRiskWarning = new Boolean(source.EnableRiskWarning);
        }
        if (source.ConsumeTimeout != null) {
            this.ConsumeTimeout = new Long(source.ConsumeTimeout);
        }
        if (source.ChannelMax != null) {
            this.ChannelMax = new Long(source.ChannelMax);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.CdcClusterId != null) {
            this.CdcClusterId = new String(source.CdcClusterId);
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
        this.setParamArrayObj(map, prefix + "Vpcs.", this.Vpcs);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamSimple(map, prefix + "VirtualHostNumber", this.VirtualHostNumber);
        this.setParamSimple(map, prefix + "QueueNumber", this.QueueNumber);
        this.setParamSimple(map, prefix + "MessagePublishRate", this.MessagePublishRate);
        this.setParamSimple(map, prefix + "MessageStackNumber", this.MessageStackNumber);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "ChannelNumber", this.ChannelNumber);
        this.setParamSimple(map, prefix + "ConnectionNumber", this.ConnectionNumber);
        this.setParamSimple(map, prefix + "ConsumerNumber", this.ConsumerNumber);
        this.setParamSimple(map, prefix + "ExchangeNumber", this.ExchangeNumber);
        this.setParamSimple(map, prefix + "ExceptionInformation", this.ExceptionInformation);
        this.setParamSimple(map, prefix + "ClusterStatus", this.ClusterStatus);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "MirrorQueuePolicyFlag", this.MirrorQueuePolicyFlag);
        this.setParamSimple(map, prefix + "MessageConsumeRate", this.MessageConsumeRate);
        this.setParamSimple(map, prefix + "ClusterVersion", this.ClusterVersion);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "IsolatedTime", this.IsolatedTime);
        this.setParamSimple(map, prefix + "Container", this.Container);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "EnableDeletionProtection", this.EnableDeletionProtection);
        this.setParamSimple(map, prefix + "MirroredQueueRisk", this.MirroredQueueRisk);
        this.setParamSimple(map, prefix + "EnableRiskWarning", this.EnableRiskWarning);
        this.setParamSimple(map, prefix + "ConsumeTimeout", this.ConsumeTimeout);
        this.setParamSimple(map, prefix + "ChannelMax", this.ChannelMax);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "CdcClusterId", this.CdcClusterId);

    }
}

