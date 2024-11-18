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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CCN extends AbstractModel {

    /**
    * 云联网唯一ID
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * 云联网名称
    */
    @SerializedName("CcnName")
    @Expose
    private String CcnName;

    /**
    * 云联网描述信息
    */
    @SerializedName("CcnDescription")
    @Expose
    private String CcnDescription;

    /**
    * 关联实例数量
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 实例状态， 'ISOLATED': 隔离中（欠费停服），'AVAILABLE'：运行中。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 实例服务质量，’PT’：白金，'AU'：金，'AG'：银。
    */
    @SerializedName("QosLevel")
    @Expose
    private String QosLevel;

    /**
    * 付费类型，PREPAID为预付费，POSTPAID为后付费。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * 限速类型，`INTER_REGION_LIMIT` 为地域间限速；`OUTER_REGION_LIMIT` 为地域出口限速。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BandwidthLimitType")
    @Expose
    private String BandwidthLimitType;

    /**
    * 标签键值对。
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
    * 是否支持云联网路由优先级的功能。`False`：不支持，`True`：支持。
    */
    @SerializedName("RoutePriorityFlag")
    @Expose
    private Boolean RoutePriorityFlag;

    /**
    * 实例关联的路由表个数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RouteTableCount")
    @Expose
    private Long RouteTableCount;

    /**
    * 是否开启云联网多路由表特性。`False`：未开启，`True`：开启。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RouteTableFlag")
    @Expose
    private Boolean RouteTableFlag;

    /**
    * `true`：实例已被封禁，流量不通，`false`:解封禁。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsSecurityLock")
    @Expose
    private Boolean IsSecurityLock;

    /**
    * 是否开启云联网路由传播策略。`False` 未开启，`True` 开启。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RouteBroadcastPolicyFlag")
    @Expose
    private Boolean RouteBroadcastPolicyFlag;

    /**
    * 是否开启等价路由功能。`False` 未开启，`True` 开启。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RouteECMPFlag")
    @Expose
    private Boolean RouteECMPFlag;

    /**
    * 是否开启路由重叠功能。`False` 未开启，`True` 开启。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RouteOverlapFlag")
    @Expose
    private Boolean RouteOverlapFlag;

    /**
    * 是否开启QOS。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TrafficMarkingPolicyFlag")
    @Expose
    private Boolean TrafficMarkingPolicyFlag;

    /**
    * 是否开启路由表选择策略。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RouteSelectPolicyFlag")
    @Expose
    private Boolean RouteSelectPolicyFlag;

    /**
    * 是否开启二层云联网通道。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DirectConnectAccelerateChannelFlag")
    @Expose
    private Boolean DirectConnectAccelerateChannelFlag;

    /**
    * 是否支持ipv6路由表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ipv6Flag")
    @Expose
    private Boolean Ipv6Flag;

    /**
    * 是否支持路由表聚合策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MrtbAggregatePolicyFlag")
    @Expose
    private Boolean MrtbAggregatePolicyFlag;

    /**
    * 是否支持策略值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MrtbPolicyValueFlag")
    @Expose
    private Boolean MrtbPolicyValueFlag;

    /**
     * Get 云联网唯一ID 
     * @return CcnId 云联网唯一ID
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set 云联网唯一ID
     * @param CcnId 云联网唯一ID
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get 云联网名称 
     * @return CcnName 云联网名称
     */
    public String getCcnName() {
        return this.CcnName;
    }

    /**
     * Set 云联网名称
     * @param CcnName 云联网名称
     */
    public void setCcnName(String CcnName) {
        this.CcnName = CcnName;
    }

    /**
     * Get 云联网描述信息 
     * @return CcnDescription 云联网描述信息
     */
    public String getCcnDescription() {
        return this.CcnDescription;
    }

    /**
     * Set 云联网描述信息
     * @param CcnDescription 云联网描述信息
     */
    public void setCcnDescription(String CcnDescription) {
        this.CcnDescription = CcnDescription;
    }

    /**
     * Get 关联实例数量 
     * @return InstanceCount 关联实例数量
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set 关联实例数量
     * @param InstanceCount 关联实例数量
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 实例状态， 'ISOLATED': 隔离中（欠费停服），'AVAILABLE'：运行中。 
     * @return State 实例状态， 'ISOLATED': 隔离中（欠费停服），'AVAILABLE'：运行中。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 实例状态， 'ISOLATED': 隔离中（欠费停服），'AVAILABLE'：运行中。
     * @param State 实例状态， 'ISOLATED': 隔离中（欠费停服），'AVAILABLE'：运行中。
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 实例服务质量，’PT’：白金，'AU'：金，'AG'：银。 
     * @return QosLevel 实例服务质量，’PT’：白金，'AU'：金，'AG'：银。
     */
    public String getQosLevel() {
        return this.QosLevel;
    }

    /**
     * Set 实例服务质量，’PT’：白金，'AU'：金，'AG'：银。
     * @param QosLevel 实例服务质量，’PT’：白金，'AU'：金，'AG'：银。
     */
    public void setQosLevel(String QosLevel) {
        this.QosLevel = QosLevel;
    }

    /**
     * Get 付费类型，PREPAID为预付费，POSTPAID为后付费。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceChargeType 付费类型，PREPAID为预付费，POSTPAID为后付费。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set 付费类型，PREPAID为预付费，POSTPAID为后付费。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceChargeType 付费类型，PREPAID为预付费，POSTPAID为后付费。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get 限速类型，`INTER_REGION_LIMIT` 为地域间限速；`OUTER_REGION_LIMIT` 为地域出口限速。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BandwidthLimitType 限速类型，`INTER_REGION_LIMIT` 为地域间限速；`OUTER_REGION_LIMIT` 为地域出口限速。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBandwidthLimitType() {
        return this.BandwidthLimitType;
    }

    /**
     * Set 限速类型，`INTER_REGION_LIMIT` 为地域间限速；`OUTER_REGION_LIMIT` 为地域出口限速。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BandwidthLimitType 限速类型，`INTER_REGION_LIMIT` 为地域间限速；`OUTER_REGION_LIMIT` 为地域出口限速。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBandwidthLimitType(String BandwidthLimitType) {
        this.BandwidthLimitType = BandwidthLimitType;
    }

    /**
     * Get 标签键值对。 
     * @return TagSet 标签键值对。
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 标签键值对。
     * @param TagSet 标签键值对。
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get 是否支持云联网路由优先级的功能。`False`：不支持，`True`：支持。 
     * @return RoutePriorityFlag 是否支持云联网路由优先级的功能。`False`：不支持，`True`：支持。
     */
    public Boolean getRoutePriorityFlag() {
        return this.RoutePriorityFlag;
    }

    /**
     * Set 是否支持云联网路由优先级的功能。`False`：不支持，`True`：支持。
     * @param RoutePriorityFlag 是否支持云联网路由优先级的功能。`False`：不支持，`True`：支持。
     */
    public void setRoutePriorityFlag(Boolean RoutePriorityFlag) {
        this.RoutePriorityFlag = RoutePriorityFlag;
    }

    /**
     * Get 实例关联的路由表个数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RouteTableCount 实例关联的路由表个数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRouteTableCount() {
        return this.RouteTableCount;
    }

    /**
     * Set 实例关联的路由表个数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RouteTableCount 实例关联的路由表个数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRouteTableCount(Long RouteTableCount) {
        this.RouteTableCount = RouteTableCount;
    }

    /**
     * Get 是否开启云联网多路由表特性。`False`：未开启，`True`：开启。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RouteTableFlag 是否开启云联网多路由表特性。`False`：未开启，`True`：开启。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getRouteTableFlag() {
        return this.RouteTableFlag;
    }

    /**
     * Set 是否开启云联网多路由表特性。`False`：未开启，`True`：开启。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RouteTableFlag 是否开启云联网多路由表特性。`False`：未开启，`True`：开启。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRouteTableFlag(Boolean RouteTableFlag) {
        this.RouteTableFlag = RouteTableFlag;
    }

    /**
     * Get `true`：实例已被封禁，流量不通，`false`:解封禁。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsSecurityLock `true`：实例已被封禁，流量不通，`false`:解封禁。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsSecurityLock() {
        return this.IsSecurityLock;
    }

    /**
     * Set `true`：实例已被封禁，流量不通，`false`:解封禁。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsSecurityLock `true`：实例已被封禁，流量不通，`false`:解封禁。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsSecurityLock(Boolean IsSecurityLock) {
        this.IsSecurityLock = IsSecurityLock;
    }

    /**
     * Get 是否开启云联网路由传播策略。`False` 未开启，`True` 开启。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RouteBroadcastPolicyFlag 是否开启云联网路由传播策略。`False` 未开启，`True` 开启。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getRouteBroadcastPolicyFlag() {
        return this.RouteBroadcastPolicyFlag;
    }

    /**
     * Set 是否开启云联网路由传播策略。`False` 未开启，`True` 开启。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RouteBroadcastPolicyFlag 是否开启云联网路由传播策略。`False` 未开启，`True` 开启。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRouteBroadcastPolicyFlag(Boolean RouteBroadcastPolicyFlag) {
        this.RouteBroadcastPolicyFlag = RouteBroadcastPolicyFlag;
    }

    /**
     * Get 是否开启等价路由功能。`False` 未开启，`True` 开启。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RouteECMPFlag 是否开启等价路由功能。`False` 未开启，`True` 开启。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getRouteECMPFlag() {
        return this.RouteECMPFlag;
    }

    /**
     * Set 是否开启等价路由功能。`False` 未开启，`True` 开启。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RouteECMPFlag 是否开启等价路由功能。`False` 未开启，`True` 开启。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRouteECMPFlag(Boolean RouteECMPFlag) {
        this.RouteECMPFlag = RouteECMPFlag;
    }

    /**
     * Get 是否开启路由重叠功能。`False` 未开启，`True` 开启。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RouteOverlapFlag 是否开启路由重叠功能。`False` 未开启，`True` 开启。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getRouteOverlapFlag() {
        return this.RouteOverlapFlag;
    }

    /**
     * Set 是否开启路由重叠功能。`False` 未开启，`True` 开启。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RouteOverlapFlag 是否开启路由重叠功能。`False` 未开启，`True` 开启。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRouteOverlapFlag(Boolean RouteOverlapFlag) {
        this.RouteOverlapFlag = RouteOverlapFlag;
    }

    /**
     * Get 是否开启QOS。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TrafficMarkingPolicyFlag 是否开启QOS。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getTrafficMarkingPolicyFlag() {
        return this.TrafficMarkingPolicyFlag;
    }

    /**
     * Set 是否开启QOS。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TrafficMarkingPolicyFlag 是否开启QOS。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrafficMarkingPolicyFlag(Boolean TrafficMarkingPolicyFlag) {
        this.TrafficMarkingPolicyFlag = TrafficMarkingPolicyFlag;
    }

    /**
     * Get 是否开启路由表选择策略。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RouteSelectPolicyFlag 是否开启路由表选择策略。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getRouteSelectPolicyFlag() {
        return this.RouteSelectPolicyFlag;
    }

    /**
     * Set 是否开启路由表选择策略。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RouteSelectPolicyFlag 是否开启路由表选择策略。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRouteSelectPolicyFlag(Boolean RouteSelectPolicyFlag) {
        this.RouteSelectPolicyFlag = RouteSelectPolicyFlag;
    }

    /**
     * Get 是否开启二层云联网通道。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DirectConnectAccelerateChannelFlag 是否开启二层云联网通道。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getDirectConnectAccelerateChannelFlag() {
        return this.DirectConnectAccelerateChannelFlag;
    }

    /**
     * Set 是否开启二层云联网通道。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DirectConnectAccelerateChannelFlag 是否开启二层云联网通道。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDirectConnectAccelerateChannelFlag(Boolean DirectConnectAccelerateChannelFlag) {
        this.DirectConnectAccelerateChannelFlag = DirectConnectAccelerateChannelFlag;
    }

    /**
     * Get 是否支持ipv6路由表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ipv6Flag 是否支持ipv6路由表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIpv6Flag() {
        return this.Ipv6Flag;
    }

    /**
     * Set 是否支持ipv6路由表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ipv6Flag 是否支持ipv6路由表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpv6Flag(Boolean Ipv6Flag) {
        this.Ipv6Flag = Ipv6Flag;
    }

    /**
     * Get 是否支持路由表聚合策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MrtbAggregatePolicyFlag 是否支持路由表聚合策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getMrtbAggregatePolicyFlag() {
        return this.MrtbAggregatePolicyFlag;
    }

    /**
     * Set 是否支持路由表聚合策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param MrtbAggregatePolicyFlag 是否支持路由表聚合策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMrtbAggregatePolicyFlag(Boolean MrtbAggregatePolicyFlag) {
        this.MrtbAggregatePolicyFlag = MrtbAggregatePolicyFlag;
    }

    /**
     * Get 是否支持策略值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MrtbPolicyValueFlag 是否支持策略值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getMrtbPolicyValueFlag() {
        return this.MrtbPolicyValueFlag;
    }

    /**
     * Set 是否支持策略值
注意：此字段可能返回 null，表示取不到有效值。
     * @param MrtbPolicyValueFlag 是否支持策略值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMrtbPolicyValueFlag(Boolean MrtbPolicyValueFlag) {
        this.MrtbPolicyValueFlag = MrtbPolicyValueFlag;
    }

    public CCN() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CCN(CCN source) {
        if (source.CcnId != null) {
            this.CcnId = new String(source.CcnId);
        }
        if (source.CcnName != null) {
            this.CcnName = new String(source.CcnName);
        }
        if (source.CcnDescription != null) {
            this.CcnDescription = new String(source.CcnDescription);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.QosLevel != null) {
            this.QosLevel = new String(source.QosLevel);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.BandwidthLimitType != null) {
            this.BandwidthLimitType = new String(source.BandwidthLimitType);
        }
        if (source.TagSet != null) {
            this.TagSet = new Tag[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new Tag(source.TagSet[i]);
            }
        }
        if (source.RoutePriorityFlag != null) {
            this.RoutePriorityFlag = new Boolean(source.RoutePriorityFlag);
        }
        if (source.RouteTableCount != null) {
            this.RouteTableCount = new Long(source.RouteTableCount);
        }
        if (source.RouteTableFlag != null) {
            this.RouteTableFlag = new Boolean(source.RouteTableFlag);
        }
        if (source.IsSecurityLock != null) {
            this.IsSecurityLock = new Boolean(source.IsSecurityLock);
        }
        if (source.RouteBroadcastPolicyFlag != null) {
            this.RouteBroadcastPolicyFlag = new Boolean(source.RouteBroadcastPolicyFlag);
        }
        if (source.RouteECMPFlag != null) {
            this.RouteECMPFlag = new Boolean(source.RouteECMPFlag);
        }
        if (source.RouteOverlapFlag != null) {
            this.RouteOverlapFlag = new Boolean(source.RouteOverlapFlag);
        }
        if (source.TrafficMarkingPolicyFlag != null) {
            this.TrafficMarkingPolicyFlag = new Boolean(source.TrafficMarkingPolicyFlag);
        }
        if (source.RouteSelectPolicyFlag != null) {
            this.RouteSelectPolicyFlag = new Boolean(source.RouteSelectPolicyFlag);
        }
        if (source.DirectConnectAccelerateChannelFlag != null) {
            this.DirectConnectAccelerateChannelFlag = new Boolean(source.DirectConnectAccelerateChannelFlag);
        }
        if (source.Ipv6Flag != null) {
            this.Ipv6Flag = new Boolean(source.Ipv6Flag);
        }
        if (source.MrtbAggregatePolicyFlag != null) {
            this.MrtbAggregatePolicyFlag = new Boolean(source.MrtbAggregatePolicyFlag);
        }
        if (source.MrtbPolicyValueFlag != null) {
            this.MrtbPolicyValueFlag = new Boolean(source.MrtbPolicyValueFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamSimple(map, prefix + "CcnName", this.CcnName);
        this.setParamSimple(map, prefix + "CcnDescription", this.CcnDescription);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "QosLevel", this.QosLevel);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "BandwidthLimitType", this.BandwidthLimitType);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamSimple(map, prefix + "RoutePriorityFlag", this.RoutePriorityFlag);
        this.setParamSimple(map, prefix + "RouteTableCount", this.RouteTableCount);
        this.setParamSimple(map, prefix + "RouteTableFlag", this.RouteTableFlag);
        this.setParamSimple(map, prefix + "IsSecurityLock", this.IsSecurityLock);
        this.setParamSimple(map, prefix + "RouteBroadcastPolicyFlag", this.RouteBroadcastPolicyFlag);
        this.setParamSimple(map, prefix + "RouteECMPFlag", this.RouteECMPFlag);
        this.setParamSimple(map, prefix + "RouteOverlapFlag", this.RouteOverlapFlag);
        this.setParamSimple(map, prefix + "TrafficMarkingPolicyFlag", this.TrafficMarkingPolicyFlag);
        this.setParamSimple(map, prefix + "RouteSelectPolicyFlag", this.RouteSelectPolicyFlag);
        this.setParamSimple(map, prefix + "DirectConnectAccelerateChannelFlag", this.DirectConnectAccelerateChannelFlag);
        this.setParamSimple(map, prefix + "Ipv6Flag", this.Ipv6Flag);
        this.setParamSimple(map, prefix + "MrtbAggregatePolicyFlag", this.MrtbAggregatePolicyFlag);
        this.setParamSimple(map, prefix + "MrtbPolicyValueFlag", this.MrtbPolicyValueFlag);

    }
}

