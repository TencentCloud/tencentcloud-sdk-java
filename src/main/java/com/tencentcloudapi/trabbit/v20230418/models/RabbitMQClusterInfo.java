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
package com.tencentcloudapi.trabbit.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RabbitMQClusterInfo extends AbstractModel {

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
    * <p>过期时间</p>
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
    * <p>集群类型</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * <p>消息保留时间，单位小时</p>
    */
    @SerializedName("MessageRetainTime")
    @Expose
    private Long MessageRetainTime;

    /**
    * <p>发送消息流量比例</p>
    */
    @SerializedName("SendReceiveRatio")
    @Expose
    private Float SendReceiveRatio;

    /**
    * <p>消息轨迹保留时间，单位小时</p>
    */
    @SerializedName("TraceTime")
    @Expose
    private Long TraceTime;

    /**
    * <p>实例标签列表</p>
    */
    @SerializedName("Tags")
    @Expose
    private RabbitMQServerlessTag [] Tags;

    /**
    * <p>是否开启弹性tps</p>
    */
    @SerializedName("ElasticTpsFlag")
    @Expose
    private Boolean ElasticTpsFlag;

    /**
    * <p>弹性tps倍数，默认弹1倍</p>
    */
    @SerializedName("ElasticTpsRatio")
    @Expose
    private Float ElasticTpsRatio;

    /**
    * <p>最大重投次数</p>
    */
    @SerializedName("MaxRedeliverCount")
    @Expose
    private Long MaxRedeliverCount;

    /**
    * <p>消费超时时间，单位min</p>
    */
    @SerializedName("ConsumerTimeout")
    @Expose
    private Long ConsumerTimeout;

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
     * @return ExceptionInformation <p>集群异常信息</p>
     */
    public String getExceptionInformation() {
        return this.ExceptionInformation;
    }

    /**
     * Set <p>集群异常信息</p>
     * @param ExceptionInformation <p>集群异常信息</p>
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
     * Get <p>集群类型</p> 
     * @return InstanceType <p>集群类型</p>
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>集群类型</p>
     * @param InstanceType <p>集群类型</p>
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>消息保留时间，单位小时</p> 
     * @return MessageRetainTime <p>消息保留时间，单位小时</p>
     */
    public Long getMessageRetainTime() {
        return this.MessageRetainTime;
    }

    /**
     * Set <p>消息保留时间，单位小时</p>
     * @param MessageRetainTime <p>消息保留时间，单位小时</p>
     */
    public void setMessageRetainTime(Long MessageRetainTime) {
        this.MessageRetainTime = MessageRetainTime;
    }

    /**
     * Get <p>发送消息流量比例</p> 
     * @return SendReceiveRatio <p>发送消息流量比例</p>
     */
    public Float getSendReceiveRatio() {
        return this.SendReceiveRatio;
    }

    /**
     * Set <p>发送消息流量比例</p>
     * @param SendReceiveRatio <p>发送消息流量比例</p>
     */
    public void setSendReceiveRatio(Float SendReceiveRatio) {
        this.SendReceiveRatio = SendReceiveRatio;
    }

    /**
     * Get <p>消息轨迹保留时间，单位小时</p> 
     * @return TraceTime <p>消息轨迹保留时间，单位小时</p>
     */
    public Long getTraceTime() {
        return this.TraceTime;
    }

    /**
     * Set <p>消息轨迹保留时间，单位小时</p>
     * @param TraceTime <p>消息轨迹保留时间，单位小时</p>
     */
    public void setTraceTime(Long TraceTime) {
        this.TraceTime = TraceTime;
    }

    /**
     * Get <p>实例标签列表</p> 
     * @return Tags <p>实例标签列表</p>
     */
    public RabbitMQServerlessTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>实例标签列表</p>
     * @param Tags <p>实例标签列表</p>
     */
    public void setTags(RabbitMQServerlessTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>是否开启弹性tps</p> 
     * @return ElasticTpsFlag <p>是否开启弹性tps</p>
     */
    public Boolean getElasticTpsFlag() {
        return this.ElasticTpsFlag;
    }

    /**
     * Set <p>是否开启弹性tps</p>
     * @param ElasticTpsFlag <p>是否开启弹性tps</p>
     */
    public void setElasticTpsFlag(Boolean ElasticTpsFlag) {
        this.ElasticTpsFlag = ElasticTpsFlag;
    }

    /**
     * Get <p>弹性tps倍数，默认弹1倍</p> 
     * @return ElasticTpsRatio <p>弹性tps倍数，默认弹1倍</p>
     */
    public Float getElasticTpsRatio() {
        return this.ElasticTpsRatio;
    }

    /**
     * Set <p>弹性tps倍数，默认弹1倍</p>
     * @param ElasticTpsRatio <p>弹性tps倍数，默认弹1倍</p>
     */
    public void setElasticTpsRatio(Float ElasticTpsRatio) {
        this.ElasticTpsRatio = ElasticTpsRatio;
    }

    /**
     * Get <p>最大重投次数</p> 
     * @return MaxRedeliverCount <p>最大重投次数</p>
     */
    public Long getMaxRedeliverCount() {
        return this.MaxRedeliverCount;
    }

    /**
     * Set <p>最大重投次数</p>
     * @param MaxRedeliverCount <p>最大重投次数</p>
     */
    public void setMaxRedeliverCount(Long MaxRedeliverCount) {
        this.MaxRedeliverCount = MaxRedeliverCount;
    }

    /**
     * Get <p>消费超时时间，单位min</p> 
     * @return ConsumerTimeout <p>消费超时时间，单位min</p>
     */
    public Long getConsumerTimeout() {
        return this.ConsumerTimeout;
    }

    /**
     * Set <p>消费超时时间，单位min</p>
     * @param ConsumerTimeout <p>消费超时时间，单位min</p>
     */
    public void setConsumerTimeout(Long ConsumerTimeout) {
        this.ConsumerTimeout = ConsumerTimeout;
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
        if (source.MessageRetainTime != null) {
            this.MessageRetainTime = new Long(source.MessageRetainTime);
        }
        if (source.SendReceiveRatio != null) {
            this.SendReceiveRatio = new Float(source.SendReceiveRatio);
        }
        if (source.TraceTime != null) {
            this.TraceTime = new Long(source.TraceTime);
        }
        if (source.Tags != null) {
            this.Tags = new RabbitMQServerlessTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new RabbitMQServerlessTag(source.Tags[i]);
            }
        }
        if (source.ElasticTpsFlag != null) {
            this.ElasticTpsFlag = new Boolean(source.ElasticTpsFlag);
        }
        if (source.ElasticTpsRatio != null) {
            this.ElasticTpsRatio = new Float(source.ElasticTpsRatio);
        }
        if (source.MaxRedeliverCount != null) {
            this.MaxRedeliverCount = new Long(source.MaxRedeliverCount);
        }
        if (source.ConsumerTimeout != null) {
            this.ConsumerTimeout = new Long(source.ConsumerTimeout);
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
        this.setParamSimple(map, prefix + "MessageRetainTime", this.MessageRetainTime);
        this.setParamSimple(map, prefix + "SendReceiveRatio", this.SendReceiveRatio);
        this.setParamSimple(map, prefix + "TraceTime", this.TraceTime);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "ElasticTpsFlag", this.ElasticTpsFlag);
        this.setParamSimple(map, prefix + "ElasticTpsRatio", this.ElasticTpsRatio);
        this.setParamSimple(map, prefix + "MaxRedeliverCount", this.MaxRedeliverCount);
        this.setParamSimple(map, prefix + "ConsumerTimeout", this.ConsumerTimeout);

    }
}

