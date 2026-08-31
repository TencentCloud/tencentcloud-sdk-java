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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CCN extends AbstractModel {

    /**
    * <p>云联网唯一ID</p>
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * <p>云联网名称</p>
    */
    @SerializedName("CcnName")
    @Expose
    private String CcnName;

    /**
    * <p>云联网描述信息</p>
    */
    @SerializedName("CcnDescription")
    @Expose
    private String CcnDescription;

    /**
    * <p>关联实例数量</p>
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>实例状态， &#39;ISOLATED&#39;: 隔离中（欠费停服），&#39;AVAILABLE&#39;：运行中。</p>
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * <p>实例服务质量，’PT’：白金，&#39;AU&#39;：金，&#39;AG&#39;：银。</p>
    */
    @SerializedName("QosLevel")
    @Expose
    private String QosLevel;

    /**
    * <p>付费类型，PREPAID为预付费，POSTPAID为后付费。</p>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * <p>计量类型</p>
    */
    @SerializedName("InstanceMeteringType")
    @Expose
    private String InstanceMeteringType;

    /**
    * <p>限速类型，<code>INTER_REGION_LIMIT</code> 为地域间限速；<code>OUTER_REGION_LIMIT</code> 为地域出口限速。</p>
    */
    @SerializedName("BandwidthLimitType")
    @Expose
    private String BandwidthLimitType;

    /**
    * <p>标签键值对。</p>
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
    * <p>是否支持云联网路由优先级的功能。<code>False</code>：不支持，<code>True</code>：支持。</p>
    */
    @SerializedName("RoutePriorityFlag")
    @Expose
    private Boolean RoutePriorityFlag;

    /**
    * <p>实例关联的路由表个数。</p>
    */
    @SerializedName("RouteTableCount")
    @Expose
    private Long RouteTableCount;

    /**
    * <p>是否开启云联网多路由表特性。<code>False</code>：未开启，<code>True</code>：开启。</p>
    */
    @SerializedName("RouteTableFlag")
    @Expose
    private Boolean RouteTableFlag;

    /**
    * <p><code>true</code>：实例已被封禁，流量不通，<code>false</code>:解封禁。</p>
    */
    @SerializedName("IsSecurityLock")
    @Expose
    private Boolean IsSecurityLock;

    /**
    * <p>是否开启云联网路由传播策略。<code>False</code> 未开启，<code>True</code> 开启。</p>
    */
    @SerializedName("RouteBroadcastPolicyFlag")
    @Expose
    private Boolean RouteBroadcastPolicyFlag;

    /**
    * <p>是否开启等价路由功能。<code>False</code> 未开启，<code>True</code> 开启。</p>
    */
    @SerializedName("RouteECMPFlag")
    @Expose
    private Boolean RouteECMPFlag;

    /**
    * <p>是否开启路由重叠功能。<code>False</code> 未开启，<code>True</code> 开启。</p>
    */
    @SerializedName("RouteOverlapFlag")
    @Expose
    private Boolean RouteOverlapFlag;

    /**
    * <p>是否开启QOS。</p>
    */
    @SerializedName("TrafficMarkingPolicyFlag")
    @Expose
    private Boolean TrafficMarkingPolicyFlag;

    /**
    * <p>是否开启路由表选择策略。</p>
    */
    @SerializedName("RouteSelectPolicyFlag")
    @Expose
    private Boolean RouteSelectPolicyFlag;

    /**
    * <p>是否开启二层云联网通道。</p>
    */
    @SerializedName("DirectConnectAccelerateChannelFlag")
    @Expose
    private Boolean DirectConnectAccelerateChannelFlag;

    /**
    * <p>是否支持ipv6路由表</p>
    */
    @SerializedName("Ipv6Flag")
    @Expose
    private Boolean Ipv6Flag;

    /**
    * <p>是否支持路由表聚合策略</p>
    */
    @SerializedName("MrtbAggregatePolicyFlag")
    @Expose
    private Boolean MrtbAggregatePolicyFlag;

    /**
    * <p>是否支持AsPath策略值</p>
    */
    @SerializedName("MrtbPolicyValueFlag")
    @Expose
    private Boolean MrtbPolicyValueFlag;

    /**
    * <p>是否支持Community策略值</p>
    */
    @SerializedName("RouteTablePolicyValueCommunityFlag")
    @Expose
    private Boolean RouteTablePolicyValueCommunityFlag;

    /**
    * <p>是否支持策略路由</p>
    */
    @SerializedName("PolicyBasedRoutingFlag")
    @Expose
    private Boolean PolicyBasedRoutingFlag;

    /**
    * <p>服务等级模式</p><p>枚举值：</p><ul><li>0： 云联网模式</li><li>1： 地域间模式</li></ul>
    */
    @SerializedName("ServiceLevelMode")
    @Expose
    private Long ServiceLevelMode;

    /**
     * Get <p>云联网唯一ID</p> 
     * @return CcnId <p>云联网唯一ID</p>
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set <p>云联网唯一ID</p>
     * @param CcnId <p>云联网唯一ID</p>
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get <p>云联网名称</p> 
     * @return CcnName <p>云联网名称</p>
     */
    public String getCcnName() {
        return this.CcnName;
    }

    /**
     * Set <p>云联网名称</p>
     * @param CcnName <p>云联网名称</p>
     */
    public void setCcnName(String CcnName) {
        this.CcnName = CcnName;
    }

    /**
     * Get <p>云联网描述信息</p> 
     * @return CcnDescription <p>云联网描述信息</p>
     */
    public String getCcnDescription() {
        return this.CcnDescription;
    }

    /**
     * Set <p>云联网描述信息</p>
     * @param CcnDescription <p>云联网描述信息</p>
     */
    public void setCcnDescription(String CcnDescription) {
        this.CcnDescription = CcnDescription;
    }

    /**
     * Get <p>关联实例数量</p> 
     * @return InstanceCount <p>关联实例数量</p>
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set <p>关联实例数量</p>
     * @param InstanceCount <p>关联实例数量</p>
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>实例状态， &#39;ISOLATED&#39;: 隔离中（欠费停服），&#39;AVAILABLE&#39;：运行中。</p> 
     * @return State <p>实例状态， &#39;ISOLATED&#39;: 隔离中（欠费停服），&#39;AVAILABLE&#39;：运行中。</p>
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set <p>实例状态， &#39;ISOLATED&#39;: 隔离中（欠费停服），&#39;AVAILABLE&#39;：运行中。</p>
     * @param State <p>实例状态， &#39;ISOLATED&#39;: 隔离中（欠费停服），&#39;AVAILABLE&#39;：运行中。</p>
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get <p>实例服务质量，’PT’：白金，&#39;AU&#39;：金，&#39;AG&#39;：银。</p> 
     * @return QosLevel <p>实例服务质量，’PT’：白金，&#39;AU&#39;：金，&#39;AG&#39;：银。</p>
     */
    public String getQosLevel() {
        return this.QosLevel;
    }

    /**
     * Set <p>实例服务质量，’PT’：白金，&#39;AU&#39;：金，&#39;AG&#39;：银。</p>
     * @param QosLevel <p>实例服务质量，’PT’：白金，&#39;AU&#39;：金，&#39;AG&#39;：银。</p>
     */
    public void setQosLevel(String QosLevel) {
        this.QosLevel = QosLevel;
    }

    /**
     * Get <p>付费类型，PREPAID为预付费，POSTPAID为后付费。</p> 
     * @return InstanceChargeType <p>付费类型，PREPAID为预付费，POSTPAID为后付费。</p>
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set <p>付费类型，PREPAID为预付费，POSTPAID为后付费。</p>
     * @param InstanceChargeType <p>付费类型，PREPAID为预付费，POSTPAID为后付费。</p>
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get <p>计量类型</p> 
     * @return InstanceMeteringType <p>计量类型</p>
     */
    public String getInstanceMeteringType() {
        return this.InstanceMeteringType;
    }

    /**
     * Set <p>计量类型</p>
     * @param InstanceMeteringType <p>计量类型</p>
     */
    public void setInstanceMeteringType(String InstanceMeteringType) {
        this.InstanceMeteringType = InstanceMeteringType;
    }

    /**
     * Get <p>限速类型，<code>INTER_REGION_LIMIT</code> 为地域间限速；<code>OUTER_REGION_LIMIT</code> 为地域出口限速。</p> 
     * @return BandwidthLimitType <p>限速类型，<code>INTER_REGION_LIMIT</code> 为地域间限速；<code>OUTER_REGION_LIMIT</code> 为地域出口限速。</p>
     */
    public String getBandwidthLimitType() {
        return this.BandwidthLimitType;
    }

    /**
     * Set <p>限速类型，<code>INTER_REGION_LIMIT</code> 为地域间限速；<code>OUTER_REGION_LIMIT</code> 为地域出口限速。</p>
     * @param BandwidthLimitType <p>限速类型，<code>INTER_REGION_LIMIT</code> 为地域间限速；<code>OUTER_REGION_LIMIT</code> 为地域出口限速。</p>
     */
    public void setBandwidthLimitType(String BandwidthLimitType) {
        this.BandwidthLimitType = BandwidthLimitType;
    }

    /**
     * Get <p>标签键值对。</p> 
     * @return TagSet <p>标签键值对。</p>
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set <p>标签键值对。</p>
     * @param TagSet <p>标签键值对。</p>
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get <p>是否支持云联网路由优先级的功能。<code>False</code>：不支持，<code>True</code>：支持。</p> 
     * @return RoutePriorityFlag <p>是否支持云联网路由优先级的功能。<code>False</code>：不支持，<code>True</code>：支持。</p>
     */
    public Boolean getRoutePriorityFlag() {
        return this.RoutePriorityFlag;
    }

    /**
     * Set <p>是否支持云联网路由优先级的功能。<code>False</code>：不支持，<code>True</code>：支持。</p>
     * @param RoutePriorityFlag <p>是否支持云联网路由优先级的功能。<code>False</code>：不支持，<code>True</code>：支持。</p>
     */
    public void setRoutePriorityFlag(Boolean RoutePriorityFlag) {
        this.RoutePriorityFlag = RoutePriorityFlag;
    }

    /**
     * Get <p>实例关联的路由表个数。</p> 
     * @return RouteTableCount <p>实例关联的路由表个数。</p>
     */
    public Long getRouteTableCount() {
        return this.RouteTableCount;
    }

    /**
     * Set <p>实例关联的路由表个数。</p>
     * @param RouteTableCount <p>实例关联的路由表个数。</p>
     */
    public void setRouteTableCount(Long RouteTableCount) {
        this.RouteTableCount = RouteTableCount;
    }

    /**
     * Get <p>是否开启云联网多路由表特性。<code>False</code>：未开启，<code>True</code>：开启。</p> 
     * @return RouteTableFlag <p>是否开启云联网多路由表特性。<code>False</code>：未开启，<code>True</code>：开启。</p>
     */
    public Boolean getRouteTableFlag() {
        return this.RouteTableFlag;
    }

    /**
     * Set <p>是否开启云联网多路由表特性。<code>False</code>：未开启，<code>True</code>：开启。</p>
     * @param RouteTableFlag <p>是否开启云联网多路由表特性。<code>False</code>：未开启，<code>True</code>：开启。</p>
     */
    public void setRouteTableFlag(Boolean RouteTableFlag) {
        this.RouteTableFlag = RouteTableFlag;
    }

    /**
     * Get <p><code>true</code>：实例已被封禁，流量不通，<code>false</code>:解封禁。</p> 
     * @return IsSecurityLock <p><code>true</code>：实例已被封禁，流量不通，<code>false</code>:解封禁。</p>
     */
    public Boolean getIsSecurityLock() {
        return this.IsSecurityLock;
    }

    /**
     * Set <p><code>true</code>：实例已被封禁，流量不通，<code>false</code>:解封禁。</p>
     * @param IsSecurityLock <p><code>true</code>：实例已被封禁，流量不通，<code>false</code>:解封禁。</p>
     */
    public void setIsSecurityLock(Boolean IsSecurityLock) {
        this.IsSecurityLock = IsSecurityLock;
    }

    /**
     * Get <p>是否开启云联网路由传播策略。<code>False</code> 未开启，<code>True</code> 开启。</p> 
     * @return RouteBroadcastPolicyFlag <p>是否开启云联网路由传播策略。<code>False</code> 未开启，<code>True</code> 开启。</p>
     */
    public Boolean getRouteBroadcastPolicyFlag() {
        return this.RouteBroadcastPolicyFlag;
    }

    /**
     * Set <p>是否开启云联网路由传播策略。<code>False</code> 未开启，<code>True</code> 开启。</p>
     * @param RouteBroadcastPolicyFlag <p>是否开启云联网路由传播策略。<code>False</code> 未开启，<code>True</code> 开启。</p>
     */
    public void setRouteBroadcastPolicyFlag(Boolean RouteBroadcastPolicyFlag) {
        this.RouteBroadcastPolicyFlag = RouteBroadcastPolicyFlag;
    }

    /**
     * Get <p>是否开启等价路由功能。<code>False</code> 未开启，<code>True</code> 开启。</p> 
     * @return RouteECMPFlag <p>是否开启等价路由功能。<code>False</code> 未开启，<code>True</code> 开启。</p>
     */
    public Boolean getRouteECMPFlag() {
        return this.RouteECMPFlag;
    }

    /**
     * Set <p>是否开启等价路由功能。<code>False</code> 未开启，<code>True</code> 开启。</p>
     * @param RouteECMPFlag <p>是否开启等价路由功能。<code>False</code> 未开启，<code>True</code> 开启。</p>
     */
    public void setRouteECMPFlag(Boolean RouteECMPFlag) {
        this.RouteECMPFlag = RouteECMPFlag;
    }

    /**
     * Get <p>是否开启路由重叠功能。<code>False</code> 未开启，<code>True</code> 开启。</p> 
     * @return RouteOverlapFlag <p>是否开启路由重叠功能。<code>False</code> 未开启，<code>True</code> 开启。</p>
     */
    public Boolean getRouteOverlapFlag() {
        return this.RouteOverlapFlag;
    }

    /**
     * Set <p>是否开启路由重叠功能。<code>False</code> 未开启，<code>True</code> 开启。</p>
     * @param RouteOverlapFlag <p>是否开启路由重叠功能。<code>False</code> 未开启，<code>True</code> 开启。</p>
     */
    public void setRouteOverlapFlag(Boolean RouteOverlapFlag) {
        this.RouteOverlapFlag = RouteOverlapFlag;
    }

    /**
     * Get <p>是否开启QOS。</p> 
     * @return TrafficMarkingPolicyFlag <p>是否开启QOS。</p>
     */
    public Boolean getTrafficMarkingPolicyFlag() {
        return this.TrafficMarkingPolicyFlag;
    }

    /**
     * Set <p>是否开启QOS。</p>
     * @param TrafficMarkingPolicyFlag <p>是否开启QOS。</p>
     */
    public void setTrafficMarkingPolicyFlag(Boolean TrafficMarkingPolicyFlag) {
        this.TrafficMarkingPolicyFlag = TrafficMarkingPolicyFlag;
    }

    /**
     * Get <p>是否开启路由表选择策略。</p> 
     * @return RouteSelectPolicyFlag <p>是否开启路由表选择策略。</p>
     */
    public Boolean getRouteSelectPolicyFlag() {
        return this.RouteSelectPolicyFlag;
    }

    /**
     * Set <p>是否开启路由表选择策略。</p>
     * @param RouteSelectPolicyFlag <p>是否开启路由表选择策略。</p>
     */
    public void setRouteSelectPolicyFlag(Boolean RouteSelectPolicyFlag) {
        this.RouteSelectPolicyFlag = RouteSelectPolicyFlag;
    }

    /**
     * Get <p>是否开启二层云联网通道。</p> 
     * @return DirectConnectAccelerateChannelFlag <p>是否开启二层云联网通道。</p>
     */
    public Boolean getDirectConnectAccelerateChannelFlag() {
        return this.DirectConnectAccelerateChannelFlag;
    }

    /**
     * Set <p>是否开启二层云联网通道。</p>
     * @param DirectConnectAccelerateChannelFlag <p>是否开启二层云联网通道。</p>
     */
    public void setDirectConnectAccelerateChannelFlag(Boolean DirectConnectAccelerateChannelFlag) {
        this.DirectConnectAccelerateChannelFlag = DirectConnectAccelerateChannelFlag;
    }

    /**
     * Get <p>是否支持ipv6路由表</p> 
     * @return Ipv6Flag <p>是否支持ipv6路由表</p>
     */
    public Boolean getIpv6Flag() {
        return this.Ipv6Flag;
    }

    /**
     * Set <p>是否支持ipv6路由表</p>
     * @param Ipv6Flag <p>是否支持ipv6路由表</p>
     */
    public void setIpv6Flag(Boolean Ipv6Flag) {
        this.Ipv6Flag = Ipv6Flag;
    }

    /**
     * Get <p>是否支持路由表聚合策略</p> 
     * @return MrtbAggregatePolicyFlag <p>是否支持路由表聚合策略</p>
     */
    public Boolean getMrtbAggregatePolicyFlag() {
        return this.MrtbAggregatePolicyFlag;
    }

    /**
     * Set <p>是否支持路由表聚合策略</p>
     * @param MrtbAggregatePolicyFlag <p>是否支持路由表聚合策略</p>
     */
    public void setMrtbAggregatePolicyFlag(Boolean MrtbAggregatePolicyFlag) {
        this.MrtbAggregatePolicyFlag = MrtbAggregatePolicyFlag;
    }

    /**
     * Get <p>是否支持AsPath策略值</p> 
     * @return MrtbPolicyValueFlag <p>是否支持AsPath策略值</p>
     */
    public Boolean getMrtbPolicyValueFlag() {
        return this.MrtbPolicyValueFlag;
    }

    /**
     * Set <p>是否支持AsPath策略值</p>
     * @param MrtbPolicyValueFlag <p>是否支持AsPath策略值</p>
     */
    public void setMrtbPolicyValueFlag(Boolean MrtbPolicyValueFlag) {
        this.MrtbPolicyValueFlag = MrtbPolicyValueFlag;
    }

    /**
     * Get <p>是否支持Community策略值</p> 
     * @return RouteTablePolicyValueCommunityFlag <p>是否支持Community策略值</p>
     */
    public Boolean getRouteTablePolicyValueCommunityFlag() {
        return this.RouteTablePolicyValueCommunityFlag;
    }

    /**
     * Set <p>是否支持Community策略值</p>
     * @param RouteTablePolicyValueCommunityFlag <p>是否支持Community策略值</p>
     */
    public void setRouteTablePolicyValueCommunityFlag(Boolean RouteTablePolicyValueCommunityFlag) {
        this.RouteTablePolicyValueCommunityFlag = RouteTablePolicyValueCommunityFlag;
    }

    /**
     * Get <p>是否支持策略路由</p> 
     * @return PolicyBasedRoutingFlag <p>是否支持策略路由</p>
     */
    public Boolean getPolicyBasedRoutingFlag() {
        return this.PolicyBasedRoutingFlag;
    }

    /**
     * Set <p>是否支持策略路由</p>
     * @param PolicyBasedRoutingFlag <p>是否支持策略路由</p>
     */
    public void setPolicyBasedRoutingFlag(Boolean PolicyBasedRoutingFlag) {
        this.PolicyBasedRoutingFlag = PolicyBasedRoutingFlag;
    }

    /**
     * Get <p>服务等级模式</p><p>枚举值：</p><ul><li>0： 云联网模式</li><li>1： 地域间模式</li></ul> 
     * @return ServiceLevelMode <p>服务等级模式</p><p>枚举值：</p><ul><li>0： 云联网模式</li><li>1： 地域间模式</li></ul>
     */
    public Long getServiceLevelMode() {
        return this.ServiceLevelMode;
    }

    /**
     * Set <p>服务等级模式</p><p>枚举值：</p><ul><li>0： 云联网模式</li><li>1： 地域间模式</li></ul>
     * @param ServiceLevelMode <p>服务等级模式</p><p>枚举值：</p><ul><li>0： 云联网模式</li><li>1： 地域间模式</li></ul>
     */
    public void setServiceLevelMode(Long ServiceLevelMode) {
        this.ServiceLevelMode = ServiceLevelMode;
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
        if (source.InstanceMeteringType != null) {
            this.InstanceMeteringType = new String(source.InstanceMeteringType);
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
        if (source.RouteTablePolicyValueCommunityFlag != null) {
            this.RouteTablePolicyValueCommunityFlag = new Boolean(source.RouteTablePolicyValueCommunityFlag);
        }
        if (source.PolicyBasedRoutingFlag != null) {
            this.PolicyBasedRoutingFlag = new Boolean(source.PolicyBasedRoutingFlag);
        }
        if (source.ServiceLevelMode != null) {
            this.ServiceLevelMode = new Long(source.ServiceLevelMode);
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
        this.setParamSimple(map, prefix + "InstanceMeteringType", this.InstanceMeteringType);
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
        this.setParamSimple(map, prefix + "RouteTablePolicyValueCommunityFlag", this.RouteTablePolicyValueCommunityFlag);
        this.setParamSimple(map, prefix + "PolicyBasedRoutingFlag", this.PolicyBasedRoutingFlag);
        this.setParamSimple(map, prefix + "ServiceLevelMode", this.ServiceLevelMode);

    }
}

