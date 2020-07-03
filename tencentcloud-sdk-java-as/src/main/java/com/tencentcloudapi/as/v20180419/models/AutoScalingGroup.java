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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoScalingGroup extends AbstractModel{

    /**
    * 伸缩组ID
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * 伸缩组名称
    */
    @SerializedName("AutoScalingGroupName")
    @Expose
    private String AutoScalingGroupName;

    /**
    * 伸缩组当前状态。取值范围：<br><li>NORMAL：正常<br><li>CVM_ABNORMAL：启动配置异常<br><li>LB_ABNORMAL：负载均衡器异常<br><li>VPC_ABNORMAL：VPC网络异常<br><li>INSUFFICIENT_BALANCE：余额不足<br><li>LB_BACKEND_REGION_NOT_MATCH：CLB实例后端地域与AS服务所在地域不匹配<br>
    */
    @SerializedName("AutoScalingGroupStatus")
    @Expose
    private String AutoScalingGroupStatus;

    /**
    * 创建时间，采用UTC标准计时
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 默认冷却时间，单位秒
    */
    @SerializedName("DefaultCooldown")
    @Expose
    private Long DefaultCooldown;

    /**
    * 期望实例数
    */
    @SerializedName("DesiredCapacity")
    @Expose
    private Long DesiredCapacity;

    /**
    * 启用状态，取值包括`ENABLED`和`DISABLED`
    */
    @SerializedName("EnabledStatus")
    @Expose
    private String EnabledStatus;

    /**
    * 应用型负载均衡器列表
    */
    @SerializedName("ForwardLoadBalancerSet")
    @Expose
    private ForwardLoadBalancer [] ForwardLoadBalancerSet;

    /**
    * 实例数量
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * 状态为`IN_SERVICE`实例的数量
    */
    @SerializedName("InServiceInstanceCount")
    @Expose
    private Long InServiceInstanceCount;

    /**
    * 启动配置ID
    */
    @SerializedName("LaunchConfigurationId")
    @Expose
    private String LaunchConfigurationId;

    /**
    * 启动配置名称
    */
    @SerializedName("LaunchConfigurationName")
    @Expose
    private String LaunchConfigurationName;

    /**
    * 传统型负载均衡器ID列表
    */
    @SerializedName("LoadBalancerIdSet")
    @Expose
    private String [] LoadBalancerIdSet;

    /**
    * 最大实例数
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
    * 最小实例数
    */
    @SerializedName("MinSize")
    @Expose
    private Long MinSize;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 子网ID列表
    */
    @SerializedName("SubnetIdSet")
    @Expose
    private String [] SubnetIdSet;

    /**
    * 销毁策略
    */
    @SerializedName("TerminationPolicySet")
    @Expose
    private String [] TerminationPolicySet;

    /**
    * VPC标识
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 可用区列表
    */
    @SerializedName("ZoneSet")
    @Expose
    private String [] ZoneSet;

    /**
    * 重试策略
    */
    @SerializedName("RetryPolicy")
    @Expose
    private String RetryPolicy;

    /**
    * 伸缩组是否处于伸缩活动中，`IN_ACTIVITY`表示处于伸缩活动中，`NOT_IN_ACTIVITY`表示不处于伸缩活动中。
    */
    @SerializedName("InActivityStatus")
    @Expose
    private String InActivityStatus;

    /**
    * 伸缩组标签列表
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 服务设置
    */
    @SerializedName("ServiceSettings")
    @Expose
    private ServiceSettings ServiceSettings;

    /**
    * 实例具有IPv6地址数量的配置
    */
    @SerializedName("Ipv6AddressCount")
    @Expose
    private Long Ipv6AddressCount;

    /**
    * 多可用区/子网策略。
<br><li> PRIORITY，按照可用区/子网列表的顺序，作为优先级来尝试创建实例，如果优先级最高的可用区/子网可以创建成功，则总在该可用区/子网创建。
<br><li> EQUALITY：每次选择当前实例数最少的可用区/子网进行扩容，使得每个可用区/子网都有机会发生扩容，多次扩容出的实例会打散到多个可用区/子网。
    */
    @SerializedName("MultiZoneSubnetPolicy")
    @Expose
    private String MultiZoneSubnetPolicy;

    /**
     * Get 伸缩组ID 
     * @return AutoScalingGroupId 伸缩组ID
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Set 伸缩组ID
     * @param AutoScalingGroupId 伸缩组ID
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * Get 伸缩组名称 
     * @return AutoScalingGroupName 伸缩组名称
     */
    public String getAutoScalingGroupName() {
        return this.AutoScalingGroupName;
    }

    /**
     * Set 伸缩组名称
     * @param AutoScalingGroupName 伸缩组名称
     */
    public void setAutoScalingGroupName(String AutoScalingGroupName) {
        this.AutoScalingGroupName = AutoScalingGroupName;
    }

    /**
     * Get 伸缩组当前状态。取值范围：<br><li>NORMAL：正常<br><li>CVM_ABNORMAL：启动配置异常<br><li>LB_ABNORMAL：负载均衡器异常<br><li>VPC_ABNORMAL：VPC网络异常<br><li>INSUFFICIENT_BALANCE：余额不足<br><li>LB_BACKEND_REGION_NOT_MATCH：CLB实例后端地域与AS服务所在地域不匹配<br> 
     * @return AutoScalingGroupStatus 伸缩组当前状态。取值范围：<br><li>NORMAL：正常<br><li>CVM_ABNORMAL：启动配置异常<br><li>LB_ABNORMAL：负载均衡器异常<br><li>VPC_ABNORMAL：VPC网络异常<br><li>INSUFFICIENT_BALANCE：余额不足<br><li>LB_BACKEND_REGION_NOT_MATCH：CLB实例后端地域与AS服务所在地域不匹配<br>
     */
    public String getAutoScalingGroupStatus() {
        return this.AutoScalingGroupStatus;
    }

    /**
     * Set 伸缩组当前状态。取值范围：<br><li>NORMAL：正常<br><li>CVM_ABNORMAL：启动配置异常<br><li>LB_ABNORMAL：负载均衡器异常<br><li>VPC_ABNORMAL：VPC网络异常<br><li>INSUFFICIENT_BALANCE：余额不足<br><li>LB_BACKEND_REGION_NOT_MATCH：CLB实例后端地域与AS服务所在地域不匹配<br>
     * @param AutoScalingGroupStatus 伸缩组当前状态。取值范围：<br><li>NORMAL：正常<br><li>CVM_ABNORMAL：启动配置异常<br><li>LB_ABNORMAL：负载均衡器异常<br><li>VPC_ABNORMAL：VPC网络异常<br><li>INSUFFICIENT_BALANCE：余额不足<br><li>LB_BACKEND_REGION_NOT_MATCH：CLB实例后端地域与AS服务所在地域不匹配<br>
     */
    public void setAutoScalingGroupStatus(String AutoScalingGroupStatus) {
        this.AutoScalingGroupStatus = AutoScalingGroupStatus;
    }

    /**
     * Get 创建时间，采用UTC标准计时 
     * @return CreatedTime 创建时间，采用UTC标准计时
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间，采用UTC标准计时
     * @param CreatedTime 创建时间，采用UTC标准计时
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 默认冷却时间，单位秒 
     * @return DefaultCooldown 默认冷却时间，单位秒
     */
    public Long getDefaultCooldown() {
        return this.DefaultCooldown;
    }

    /**
     * Set 默认冷却时间，单位秒
     * @param DefaultCooldown 默认冷却时间，单位秒
     */
    public void setDefaultCooldown(Long DefaultCooldown) {
        this.DefaultCooldown = DefaultCooldown;
    }

    /**
     * Get 期望实例数 
     * @return DesiredCapacity 期望实例数
     */
    public Long getDesiredCapacity() {
        return this.DesiredCapacity;
    }

    /**
     * Set 期望实例数
     * @param DesiredCapacity 期望实例数
     */
    public void setDesiredCapacity(Long DesiredCapacity) {
        this.DesiredCapacity = DesiredCapacity;
    }

    /**
     * Get 启用状态，取值包括`ENABLED`和`DISABLED` 
     * @return EnabledStatus 启用状态，取值包括`ENABLED`和`DISABLED`
     */
    public String getEnabledStatus() {
        return this.EnabledStatus;
    }

    /**
     * Set 启用状态，取值包括`ENABLED`和`DISABLED`
     * @param EnabledStatus 启用状态，取值包括`ENABLED`和`DISABLED`
     */
    public void setEnabledStatus(String EnabledStatus) {
        this.EnabledStatus = EnabledStatus;
    }

    /**
     * Get 应用型负载均衡器列表 
     * @return ForwardLoadBalancerSet 应用型负载均衡器列表
     */
    public ForwardLoadBalancer [] getForwardLoadBalancerSet() {
        return this.ForwardLoadBalancerSet;
    }

    /**
     * Set 应用型负载均衡器列表
     * @param ForwardLoadBalancerSet 应用型负载均衡器列表
     */
    public void setForwardLoadBalancerSet(ForwardLoadBalancer [] ForwardLoadBalancerSet) {
        this.ForwardLoadBalancerSet = ForwardLoadBalancerSet;
    }

    /**
     * Get 实例数量 
     * @return InstanceCount 实例数量
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set 实例数量
     * @param InstanceCount 实例数量
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get 状态为`IN_SERVICE`实例的数量 
     * @return InServiceInstanceCount 状态为`IN_SERVICE`实例的数量
     */
    public Long getInServiceInstanceCount() {
        return this.InServiceInstanceCount;
    }

    /**
     * Set 状态为`IN_SERVICE`实例的数量
     * @param InServiceInstanceCount 状态为`IN_SERVICE`实例的数量
     */
    public void setInServiceInstanceCount(Long InServiceInstanceCount) {
        this.InServiceInstanceCount = InServiceInstanceCount;
    }

    /**
     * Get 启动配置ID 
     * @return LaunchConfigurationId 启动配置ID
     */
    public String getLaunchConfigurationId() {
        return this.LaunchConfigurationId;
    }

    /**
     * Set 启动配置ID
     * @param LaunchConfigurationId 启动配置ID
     */
    public void setLaunchConfigurationId(String LaunchConfigurationId) {
        this.LaunchConfigurationId = LaunchConfigurationId;
    }

    /**
     * Get 启动配置名称 
     * @return LaunchConfigurationName 启动配置名称
     */
    public String getLaunchConfigurationName() {
        return this.LaunchConfigurationName;
    }

    /**
     * Set 启动配置名称
     * @param LaunchConfigurationName 启动配置名称
     */
    public void setLaunchConfigurationName(String LaunchConfigurationName) {
        this.LaunchConfigurationName = LaunchConfigurationName;
    }

    /**
     * Get 传统型负载均衡器ID列表 
     * @return LoadBalancerIdSet 传统型负载均衡器ID列表
     */
    public String [] getLoadBalancerIdSet() {
        return this.LoadBalancerIdSet;
    }

    /**
     * Set 传统型负载均衡器ID列表
     * @param LoadBalancerIdSet 传统型负载均衡器ID列表
     */
    public void setLoadBalancerIdSet(String [] LoadBalancerIdSet) {
        this.LoadBalancerIdSet = LoadBalancerIdSet;
    }

    /**
     * Get 最大实例数 
     * @return MaxSize 最大实例数
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set 最大实例数
     * @param MaxSize 最大实例数
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * Get 最小实例数 
     * @return MinSize 最小实例数
     */
    public Long getMinSize() {
        return this.MinSize;
    }

    /**
     * Set 最小实例数
     * @param MinSize 最小实例数
     */
    public void setMinSize(Long MinSize) {
        this.MinSize = MinSize;
    }

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 子网ID列表 
     * @return SubnetIdSet 子网ID列表
     */
    public String [] getSubnetIdSet() {
        return this.SubnetIdSet;
    }

    /**
     * Set 子网ID列表
     * @param SubnetIdSet 子网ID列表
     */
    public void setSubnetIdSet(String [] SubnetIdSet) {
        this.SubnetIdSet = SubnetIdSet;
    }

    /**
     * Get 销毁策略 
     * @return TerminationPolicySet 销毁策略
     */
    public String [] getTerminationPolicySet() {
        return this.TerminationPolicySet;
    }

    /**
     * Set 销毁策略
     * @param TerminationPolicySet 销毁策略
     */
    public void setTerminationPolicySet(String [] TerminationPolicySet) {
        this.TerminationPolicySet = TerminationPolicySet;
    }

    /**
     * Get VPC标识 
     * @return VpcId VPC标识
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC标识
     * @param VpcId VPC标识
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 可用区列表 
     * @return ZoneSet 可用区列表
     */
    public String [] getZoneSet() {
        return this.ZoneSet;
    }

    /**
     * Set 可用区列表
     * @param ZoneSet 可用区列表
     */
    public void setZoneSet(String [] ZoneSet) {
        this.ZoneSet = ZoneSet;
    }

    /**
     * Get 重试策略 
     * @return RetryPolicy 重试策略
     */
    public String getRetryPolicy() {
        return this.RetryPolicy;
    }

    /**
     * Set 重试策略
     * @param RetryPolicy 重试策略
     */
    public void setRetryPolicy(String RetryPolicy) {
        this.RetryPolicy = RetryPolicy;
    }

    /**
     * Get 伸缩组是否处于伸缩活动中，`IN_ACTIVITY`表示处于伸缩活动中，`NOT_IN_ACTIVITY`表示不处于伸缩活动中。 
     * @return InActivityStatus 伸缩组是否处于伸缩活动中，`IN_ACTIVITY`表示处于伸缩活动中，`NOT_IN_ACTIVITY`表示不处于伸缩活动中。
     */
    public String getInActivityStatus() {
        return this.InActivityStatus;
    }

    /**
     * Set 伸缩组是否处于伸缩活动中，`IN_ACTIVITY`表示处于伸缩活动中，`NOT_IN_ACTIVITY`表示不处于伸缩活动中。
     * @param InActivityStatus 伸缩组是否处于伸缩活动中，`IN_ACTIVITY`表示处于伸缩活动中，`NOT_IN_ACTIVITY`表示不处于伸缩活动中。
     */
    public void setInActivityStatus(String InActivityStatus) {
        this.InActivityStatus = InActivityStatus;
    }

    /**
     * Get 伸缩组标签列表 
     * @return Tags 伸缩组标签列表
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 伸缩组标签列表
     * @param Tags 伸缩组标签列表
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 服务设置 
     * @return ServiceSettings 服务设置
     */
    public ServiceSettings getServiceSettings() {
        return this.ServiceSettings;
    }

    /**
     * Set 服务设置
     * @param ServiceSettings 服务设置
     */
    public void setServiceSettings(ServiceSettings ServiceSettings) {
        this.ServiceSettings = ServiceSettings;
    }

    /**
     * Get 实例具有IPv6地址数量的配置 
     * @return Ipv6AddressCount 实例具有IPv6地址数量的配置
     */
    public Long getIpv6AddressCount() {
        return this.Ipv6AddressCount;
    }

    /**
     * Set 实例具有IPv6地址数量的配置
     * @param Ipv6AddressCount 实例具有IPv6地址数量的配置
     */
    public void setIpv6AddressCount(Long Ipv6AddressCount) {
        this.Ipv6AddressCount = Ipv6AddressCount;
    }

    /**
     * Get 多可用区/子网策略。
<br><li> PRIORITY，按照可用区/子网列表的顺序，作为优先级来尝试创建实例，如果优先级最高的可用区/子网可以创建成功，则总在该可用区/子网创建。
<br><li> EQUALITY：每次选择当前实例数最少的可用区/子网进行扩容，使得每个可用区/子网都有机会发生扩容，多次扩容出的实例会打散到多个可用区/子网。 
     * @return MultiZoneSubnetPolicy 多可用区/子网策略。
<br><li> PRIORITY，按照可用区/子网列表的顺序，作为优先级来尝试创建实例，如果优先级最高的可用区/子网可以创建成功，则总在该可用区/子网创建。
<br><li> EQUALITY：每次选择当前实例数最少的可用区/子网进行扩容，使得每个可用区/子网都有机会发生扩容，多次扩容出的实例会打散到多个可用区/子网。
     */
    public String getMultiZoneSubnetPolicy() {
        return this.MultiZoneSubnetPolicy;
    }

    /**
     * Set 多可用区/子网策略。
<br><li> PRIORITY，按照可用区/子网列表的顺序，作为优先级来尝试创建实例，如果优先级最高的可用区/子网可以创建成功，则总在该可用区/子网创建。
<br><li> EQUALITY：每次选择当前实例数最少的可用区/子网进行扩容，使得每个可用区/子网都有机会发生扩容，多次扩容出的实例会打散到多个可用区/子网。
     * @param MultiZoneSubnetPolicy 多可用区/子网策略。
<br><li> PRIORITY，按照可用区/子网列表的顺序，作为优先级来尝试创建实例，如果优先级最高的可用区/子网可以创建成功，则总在该可用区/子网创建。
<br><li> EQUALITY：每次选择当前实例数最少的可用区/子网进行扩容，使得每个可用区/子网都有机会发生扩容，多次扩容出的实例会打散到多个可用区/子网。
     */
    public void setMultiZoneSubnetPolicy(String MultiZoneSubnetPolicy) {
        this.MultiZoneSubnetPolicy = MultiZoneSubnetPolicy;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamSimple(map, prefix + "AutoScalingGroupName", this.AutoScalingGroupName);
        this.setParamSimple(map, prefix + "AutoScalingGroupStatus", this.AutoScalingGroupStatus);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "DefaultCooldown", this.DefaultCooldown);
        this.setParamSimple(map, prefix + "DesiredCapacity", this.DesiredCapacity);
        this.setParamSimple(map, prefix + "EnabledStatus", this.EnabledStatus);
        this.setParamArrayObj(map, prefix + "ForwardLoadBalancerSet.", this.ForwardLoadBalancerSet);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "InServiceInstanceCount", this.InServiceInstanceCount);
        this.setParamSimple(map, prefix + "LaunchConfigurationId", this.LaunchConfigurationId);
        this.setParamSimple(map, prefix + "LaunchConfigurationName", this.LaunchConfigurationName);
        this.setParamArraySimple(map, prefix + "LoadBalancerIdSet.", this.LoadBalancerIdSet);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);
        this.setParamSimple(map, prefix + "MinSize", this.MinSize);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "SubnetIdSet.", this.SubnetIdSet);
        this.setParamArraySimple(map, prefix + "TerminationPolicySet.", this.TerminationPolicySet);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "ZoneSet.", this.ZoneSet);
        this.setParamSimple(map, prefix + "RetryPolicy", this.RetryPolicy);
        this.setParamSimple(map, prefix + "InActivityStatus", this.InActivityStatus);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "ServiceSettings.", this.ServiceSettings);
        this.setParamSimple(map, prefix + "Ipv6AddressCount", this.Ipv6AddressCount);
        this.setParamSimple(map, prefix + "MultiZoneSubnetPolicy", this.MultiZoneSubnetPolicy);

    }
}

