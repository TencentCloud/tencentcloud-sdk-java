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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RabbitMQClusterInfo extends AbstractModel {

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
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * VPC及网络信息
    */
    @SerializedName("Vpcs")
    @Expose
    private VpcEndpointInfo [] Vpcs;

    /**
    * 可用区信息
    */
    @SerializedName("ZoneIds")
    @Expose
    private Long [] ZoneIds;

    /**
    * 虚拟主机数量
    */
    @SerializedName("VirtualHostNumber")
    @Expose
    private Long VirtualHostNumber;

    /**
    * 队列数量
    */
    @SerializedName("QueueNumber")
    @Expose
    private Long QueueNumber;

    /**
    * 每秒生产消息数 单位：条/秒
    */
    @SerializedName("MessagePublishRate")
    @Expose
    private Float MessagePublishRate;

    /**
    * 堆积消息数 单位：条
    */
    @SerializedName("MessageStackNumber")
    @Expose
    private Long MessageStackNumber;

    /**
    * 过期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * Channel数量
    */
    @SerializedName("ChannelNumber")
    @Expose
    private Long ChannelNumber;

    /**
    * Connection数量
    */
    @SerializedName("ConnectionNumber")
    @Expose
    private Long ConnectionNumber;

    /**
    * Consumer数量
    */
    @SerializedName("ConsumerNumber")
    @Expose
    private Long ConsumerNumber;

    /**
    * Exchang数量
    */
    @SerializedName("ExchangeNumber")
    @Expose
    private Long ExchangeNumber;

    /**
    * 集群异常信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExceptionInformation")
    @Expose
    private String ExceptionInformation;

    /**
    * 实例状态，0表示创建中，1表示正常，2表示隔离中，3表示已销毁，4 - 异常, 5 - 发货失败
    */
    @SerializedName("ClusterStatus")
    @Expose
    private Long ClusterStatus;

    /**
    * 自动续费标记，0表示默认状态(用户未设置，即初始状态即手动续费)， 1表示自动续费，2表示明确不自动续费(用户设置)
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 是否开启镜像队列策略。1表示开启，0表示没开启。
    */
    @SerializedName("MirrorQueuePolicyFlag")
    @Expose
    private Long MirrorQueuePolicyFlag;

    /**
    * 每秒消费消息数 单位：条/秒
    */
    @SerializedName("MessageConsumeRate")
    @Expose
    private Float MessageConsumeRate;

    /**
    * 集群版本信息
    */
    @SerializedName("ClusterVersion")
    @Expose
    private String ClusterVersion;

    /**
    * 计费模式，0-后付费，1-预付费
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 实例类型，0 专享版、1 Serverless 版
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

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
     * @return Remark 集群说明信息
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 集群说明信息
     * @param Remark 集群说明信息
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get VPC及网络信息 
     * @return Vpcs VPC及网络信息
     */
    public VpcEndpointInfo [] getVpcs() {
        return this.Vpcs;
    }

    /**
     * Set VPC及网络信息
     * @param Vpcs VPC及网络信息
     */
    public void setVpcs(VpcEndpointInfo [] Vpcs) {
        this.Vpcs = Vpcs;
    }

    /**
     * Get 可用区信息 
     * @return ZoneIds 可用区信息
     */
    public Long [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set 可用区信息
     * @param ZoneIds 可用区信息
     */
    public void setZoneIds(Long [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get 虚拟主机数量 
     * @return VirtualHostNumber 虚拟主机数量
     */
    public Long getVirtualHostNumber() {
        return this.VirtualHostNumber;
    }

    /**
     * Set 虚拟主机数量
     * @param VirtualHostNumber 虚拟主机数量
     */
    public void setVirtualHostNumber(Long VirtualHostNumber) {
        this.VirtualHostNumber = VirtualHostNumber;
    }

    /**
     * Get 队列数量 
     * @return QueueNumber 队列数量
     */
    public Long getQueueNumber() {
        return this.QueueNumber;
    }

    /**
     * Set 队列数量
     * @param QueueNumber 队列数量
     */
    public void setQueueNumber(Long QueueNumber) {
        this.QueueNumber = QueueNumber;
    }

    /**
     * Get 每秒生产消息数 单位：条/秒 
     * @return MessagePublishRate 每秒生产消息数 单位：条/秒
     */
    public Float getMessagePublishRate() {
        return this.MessagePublishRate;
    }

    /**
     * Set 每秒生产消息数 单位：条/秒
     * @param MessagePublishRate 每秒生产消息数 单位：条/秒
     */
    public void setMessagePublishRate(Float MessagePublishRate) {
        this.MessagePublishRate = MessagePublishRate;
    }

    /**
     * Get 堆积消息数 单位：条 
     * @return MessageStackNumber 堆积消息数 单位：条
     */
    public Long getMessageStackNumber() {
        return this.MessageStackNumber;
    }

    /**
     * Set 堆积消息数 单位：条
     * @param MessageStackNumber 堆积消息数 单位：条
     */
    public void setMessageStackNumber(Long MessageStackNumber) {
        this.MessageStackNumber = MessageStackNumber;
    }

    /**
     * Get 过期时间 
     * @return ExpireTime 过期时间
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间
     * @param ExpireTime 过期时间
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Channel数量 
     * @return ChannelNumber Channel数量
     */
    public Long getChannelNumber() {
        return this.ChannelNumber;
    }

    /**
     * Set Channel数量
     * @param ChannelNumber Channel数量
     */
    public void setChannelNumber(Long ChannelNumber) {
        this.ChannelNumber = ChannelNumber;
    }

    /**
     * Get Connection数量 
     * @return ConnectionNumber Connection数量
     */
    public Long getConnectionNumber() {
        return this.ConnectionNumber;
    }

    /**
     * Set Connection数量
     * @param ConnectionNumber Connection数量
     */
    public void setConnectionNumber(Long ConnectionNumber) {
        this.ConnectionNumber = ConnectionNumber;
    }

    /**
     * Get Consumer数量 
     * @return ConsumerNumber Consumer数量
     */
    public Long getConsumerNumber() {
        return this.ConsumerNumber;
    }

    /**
     * Set Consumer数量
     * @param ConsumerNumber Consumer数量
     */
    public void setConsumerNumber(Long ConsumerNumber) {
        this.ConsumerNumber = ConsumerNumber;
    }

    /**
     * Get Exchang数量 
     * @return ExchangeNumber Exchang数量
     */
    public Long getExchangeNumber() {
        return this.ExchangeNumber;
    }

    /**
     * Set Exchang数量
     * @param ExchangeNumber Exchang数量
     */
    public void setExchangeNumber(Long ExchangeNumber) {
        this.ExchangeNumber = ExchangeNumber;
    }

    /**
     * Get 集群异常信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExceptionInformation 集群异常信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExceptionInformation() {
        return this.ExceptionInformation;
    }

    /**
     * Set 集群异常信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExceptionInformation 集群异常信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExceptionInformation(String ExceptionInformation) {
        this.ExceptionInformation = ExceptionInformation;
    }

    /**
     * Get 实例状态，0表示创建中，1表示正常，2表示隔离中，3表示已销毁，4 - 异常, 5 - 发货失败 
     * @return ClusterStatus 实例状态，0表示创建中，1表示正常，2表示隔离中，3表示已销毁，4 - 异常, 5 - 发货失败
     */
    public Long getClusterStatus() {
        return this.ClusterStatus;
    }

    /**
     * Set 实例状态，0表示创建中，1表示正常，2表示隔离中，3表示已销毁，4 - 异常, 5 - 发货失败
     * @param ClusterStatus 实例状态，0表示创建中，1表示正常，2表示隔离中，3表示已销毁，4 - 异常, 5 - 发货失败
     */
    public void setClusterStatus(Long ClusterStatus) {
        this.ClusterStatus = ClusterStatus;
    }

    /**
     * Get 自动续费标记，0表示默认状态(用户未设置，即初始状态即手动续费)， 1表示自动续费，2表示明确不自动续费(用户设置) 
     * @return AutoRenewFlag 自动续费标记，0表示默认状态(用户未设置，即初始状态即手动续费)， 1表示自动续费，2表示明确不自动续费(用户设置)
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 自动续费标记，0表示默认状态(用户未设置，即初始状态即手动续费)， 1表示自动续费，2表示明确不自动续费(用户设置)
     * @param AutoRenewFlag 自动续费标记，0表示默认状态(用户未设置，即初始状态即手动续费)， 1表示自动续费，2表示明确不自动续费(用户设置)
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 是否开启镜像队列策略。1表示开启，0表示没开启。 
     * @return MirrorQueuePolicyFlag 是否开启镜像队列策略。1表示开启，0表示没开启。
     */
    public Long getMirrorQueuePolicyFlag() {
        return this.MirrorQueuePolicyFlag;
    }

    /**
     * Set 是否开启镜像队列策略。1表示开启，0表示没开启。
     * @param MirrorQueuePolicyFlag 是否开启镜像队列策略。1表示开启，0表示没开启。
     */
    public void setMirrorQueuePolicyFlag(Long MirrorQueuePolicyFlag) {
        this.MirrorQueuePolicyFlag = MirrorQueuePolicyFlag;
    }

    /**
     * Get 每秒消费消息数 单位：条/秒 
     * @return MessageConsumeRate 每秒消费消息数 单位：条/秒
     */
    public Float getMessageConsumeRate() {
        return this.MessageConsumeRate;
    }

    /**
     * Set 每秒消费消息数 单位：条/秒
     * @param MessageConsumeRate 每秒消费消息数 单位：条/秒
     */
    public void setMessageConsumeRate(Float MessageConsumeRate) {
        this.MessageConsumeRate = MessageConsumeRate;
    }

    /**
     * Get 集群版本信息 
     * @return ClusterVersion 集群版本信息
     */
    public String getClusterVersion() {
        return this.ClusterVersion;
    }

    /**
     * Set 集群版本信息
     * @param ClusterVersion 集群版本信息
     */
    public void setClusterVersion(String ClusterVersion) {
        this.ClusterVersion = ClusterVersion;
    }

    /**
     * Get 计费模式，0-后付费，1-预付费 
     * @return PayMode 计费模式，0-后付费，1-预付费
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 计费模式，0-后付费，1-预付费
     * @param PayMode 计费模式，0-后付费，1-预付费
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 实例类型，0 专享版、1 Serverless 版 
     * @return InstanceType 实例类型，0 专享版、1 Serverless 版
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型，0 专享版、1 Serverless 版
     * @param InstanceType 实例类型，0 专享版、1 Serverless 版
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
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

    }
}

