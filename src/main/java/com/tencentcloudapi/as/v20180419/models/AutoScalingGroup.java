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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoScalingGroup extends AbstractModel {

    /**
    * <p>伸缩组ID</p>
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * <p>伸缩组名称</p>
    */
    @SerializedName("AutoScalingGroupName")
    @Expose
    private String AutoScalingGroupName;

    /**
    * <p>伸缩组当前状态。取值范围：</p><li>NORMAL：正常</li><li>CVM_ABNORMAL：启动配置异常</li><li>LB_ABNORMAL：负载均衡器异常</li><li>LB_LISTENER_ABNORMAL：负载均衡器监听器异常</li><li>LB_LOCATION_ABNORMAL：负载均衡器监听器转发配置异常</li><li>VPC_ABNORMAL：VPC网络异常</li><li>SUBNET_ABNORMAL：VPC子网异常</li><li>INSUFFICIENT_BALANCE：余额不足</li><li>LB_BACKEND_REGION_NOT_MATCH：CLB实例后端地域与AS服务所在地域不匹配</li><li>LB_BACKEND_VPC_NOT_MATCH：CLB实例VPC与伸缩组VPC不匹配</li>
    */
    @SerializedName("AutoScalingGroupStatus")
    @Expose
    private String AutoScalingGroupStatus;

    /**
    * <p>创建时间，采用UTC标准计时</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>默认冷却时间，单位秒</p>
    */
    @SerializedName("DefaultCooldown")
    @Expose
    private Long DefaultCooldown;

    /**
    * <p>期望实例数</p>
    */
    @SerializedName("DesiredCapacity")
    @Expose
    private Long DesiredCapacity;

    /**
    * <p>启用状态，取值包括<code>ENABLED</code>和<code>DISABLED</code></p>
    */
    @SerializedName("EnabledStatus")
    @Expose
    private String EnabledStatus;

    /**
    * <p>应用型负载均衡器列表</p>
    */
    @SerializedName("ForwardLoadBalancerSet")
    @Expose
    private ForwardLoadBalancer [] ForwardLoadBalancerSet;

    /**
    * <p>实例数量</p>
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * <p>状态为<code>IN_SERVICE</code>实例的数量</p>
    */
    @SerializedName("InServiceInstanceCount")
    @Expose
    private Long InServiceInstanceCount;

    /**
    * <p>启动配置ID</p>
    */
    @SerializedName("LaunchConfigurationId")
    @Expose
    private String LaunchConfigurationId;

    /**
    * <p>启动配置名称</p>
    */
    @SerializedName("LaunchConfigurationName")
    @Expose
    private String LaunchConfigurationName;

    /**
    * <p>传统型负载均衡器ID列表</p>
    */
    @SerializedName("LoadBalancerIdSet")
    @Expose
    private String [] LoadBalancerIdSet;

    /**
    * <p>最大实例数</p>
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
    * <p>最小实例数</p>
    */
    @SerializedName("MinSize")
    @Expose
    private Long MinSize;

    /**
    * <p>项目ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>子网ID列表</p>
    */
    @SerializedName("SubnetIdSet")
    @Expose
    private String [] SubnetIdSet;

    /**
    * <p>销毁策略。取值范围如下：</p><li>OLDEST_INSTANCE：优先销毁伸缩组中最旧的实例，默认取值。</li><li>NEWEST_INSTANCE：优先销毁伸缩组中最新的实例。</li>
    */
    @SerializedName("TerminationPolicySet")
    @Expose
    private String [] TerminationPolicySet;

    /**
    * <p>私有网络ID。</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>可用区列表</p>
    */
    @SerializedName("ZoneSet")
    @Expose
    private String [] ZoneSet;

    /**
    * <p>重试策略，部分成功的伸缩活动判定为一次失败活动。取值范围如下：</p><li>IMMEDIATE_RETRY：默认取值，表示立即重试，在较短时间内快速重试，连续失败超过一定次数（5次）后不再重试。</li><li>INCREMENTAL_INTERVALS：间隔递增重试，随着连续失败次数的增加，重试间隔逐渐增大。前 10 次重试为快速重试，后续重试间隔逐步递增至 10 分钟、30 分钟、60 分钟、一天。</li><li>NO_RETRY，不进行重试，直到再次收到用户调用或者告警信息后才会重试。</li>
    */
    @SerializedName("RetryPolicy")
    @Expose
    private String RetryPolicy;

    /**
    * <p>伸缩组是否处于伸缩活动中，<code>IN_ACTIVITY</code>表示处于伸缩活动中，<code>NOT_IN_ACTIVITY</code>表示不处于伸缩活动中。</p>
    */
    @SerializedName("InActivityStatus")
    @Expose
    private String InActivityStatus;

    /**
    * <p>伸缩组标签列表</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>服务设置</p>
    */
    @SerializedName("ServiceSettings")
    @Expose
    private ServiceSettings ServiceSettings;

    /**
    * <p>实例具有IPv6地址数量的配置，取值包括0、1。默认值为 0，表示实例不分配 IPv6 地址。需使用支持 IPv6 的私有网络，需在子网中开启 IPv6 CIDR，其他使用限制可参考 <a href="https://cloud.tencent.com/document/product/1142/38369">IPv6使用限制</a>。</p>
    */
    @SerializedName("Ipv6AddressCount")
    @Expose
    private Long Ipv6AddressCount;

    /**
    * <p>多可用区/子网策略。</p><li> PRIORITY，按照可用区/子网列表的顺序，作为优先级来尝试创建实例，如果优先级最高的可用区/子网可以创建成功，则总在该可用区/子网创建。</li><li> EQUALITY：每次选择当前实例数最少的可用区/子网进行扩容，使得每个可用区/子网都有机会发生扩容，多次扩容出的实例会打散到多个可用区/子网。</li>
    */
    @SerializedName("MultiZoneSubnetPolicy")
    @Expose
    private String MultiZoneSubnetPolicy;

    /**
    * <p>伸缩组实例健康检查类型，取值如下：</p><li>CVM：根据实例网络状态判断实例是否处于不健康状态，不健康的网络状态即发生实例 PING 不可达事件，详细判断标准可参考[实例健康检查](https://cloud.tencent.com/document/product/377/8553)</li><li>CLB：根据 CLB 的健康检查状态判断实例是否处于不健康状态，CLB健康检查原理可参考[健康检查](https://cloud.tencent.com/document/product/214/6097)</li>
    */
    @SerializedName("HealthCheckType")
    @Expose
    private String HealthCheckType;

    /**
    * <p>CLB健康检查宽限期.当扩容的实例进入IN_SERVICE后，在宽限期时间范围内将不会被标记为不健康CLB_UNHEALTHY。<br>默认值：0。取值范围[0, 7200]，单位：秒。</p>
    */
    @SerializedName("LoadBalancerHealthCheckGracePeriod")
    @Expose
    private Long LoadBalancerHealthCheckGracePeriod;

    /**
    * <p>实例分配策略，取值包括 LAUNCH_CONFIGURATION 和 SPOT_MIXED。</p><li> LAUNCH_CONFIGURATION，代表传统的按照启动配置模式。</li><li> SPOT_MIXED，代表竞价混合模式。目前仅支持启动配置为按量计费模式时使用混合模式，混合模式下，伸缩组将根据设定扩容按量或竞价机型。使用混合模式时，关联的启动配置的计费类型不可被修改。</li>
    */
    @SerializedName("InstanceAllocationPolicy")
    @Expose
    private String InstanceAllocationPolicy;

    /**
    * <p>竞价混合模式下，各计费类型实例的分配策略。<br>仅当 InstanceAllocationPolicy 取 SPOT_MIXED 时才会返回有效值。</p>
    */
    @SerializedName("SpotMixedAllocationPolicy")
    @Expose
    private SpotMixedAllocationPolicy SpotMixedAllocationPolicy;

    /**
    * <p>容量重平衡功能，仅对伸缩组内的竞价实例有效。取值范围：</p><li> TRUE，开启该功能，当伸缩组内的竞价实例即将被竞价实例服务自动回收前，AS 主动发起竞价实例销毁流程，如果有配置过缩容 hook，则销毁前 hook 会生效。销毁流程启动后，AS 会异步开启一个扩容活动，用于补齐期望实例数。</li><li> FALSE，不开启该功能，则 AS 等待竞价实例被销毁后才会去扩容补齐伸缩组期望实例数。</li>
    */
    @SerializedName("CapacityRebalance")
    @Expose
    private Boolean CapacityRebalance;

    /**
    * <p>实例名称序号相关设置。</p>
    */
    @SerializedName("InstanceNameIndexSettings")
    @Expose
    private InstanceNameIndexSettings InstanceNameIndexSettings;

    /**
    * <p>实例主机名序号相关设置。</p>
    */
    @SerializedName("HostNameIndexSettings")
    @Expose
    private HostNameIndexSettings HostNameIndexSettings;

    /**
    * <p>匹配期望数并发扩容功能，不能在InstanceAllocationPolicy为竞价混合模式时设置，也不能在ScalingMode为扩容优先开机模式时设置。目前仅支持两个匹配期望数扩容活动并发进行，不支持指定数量扩容、缩容等其他类型活动并发。默认值为FALSE，表示不开启。</p>
    */
    @SerializedName("ConcurrentScaleOutForDesiredCapacity")
    @Expose
    private Boolean ConcurrentScaleOutForDesiredCapacity;

    /**
     * Get <p>伸缩组ID</p> 
     * @return AutoScalingGroupId <p>伸缩组ID</p>
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Set <p>伸缩组ID</p>
     * @param AutoScalingGroupId <p>伸缩组ID</p>
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * Get <p>伸缩组名称</p> 
     * @return AutoScalingGroupName <p>伸缩组名称</p>
     */
    public String getAutoScalingGroupName() {
        return this.AutoScalingGroupName;
    }

    /**
     * Set <p>伸缩组名称</p>
     * @param AutoScalingGroupName <p>伸缩组名称</p>
     */
    public void setAutoScalingGroupName(String AutoScalingGroupName) {
        this.AutoScalingGroupName = AutoScalingGroupName;
    }

    /**
     * Get <p>伸缩组当前状态。取值范围：</p><li>NORMAL：正常</li><li>CVM_ABNORMAL：启动配置异常</li><li>LB_ABNORMAL：负载均衡器异常</li><li>LB_LISTENER_ABNORMAL：负载均衡器监听器异常</li><li>LB_LOCATION_ABNORMAL：负载均衡器监听器转发配置异常</li><li>VPC_ABNORMAL：VPC网络异常</li><li>SUBNET_ABNORMAL：VPC子网异常</li><li>INSUFFICIENT_BALANCE：余额不足</li><li>LB_BACKEND_REGION_NOT_MATCH：CLB实例后端地域与AS服务所在地域不匹配</li><li>LB_BACKEND_VPC_NOT_MATCH：CLB实例VPC与伸缩组VPC不匹配</li> 
     * @return AutoScalingGroupStatus <p>伸缩组当前状态。取值范围：</p><li>NORMAL：正常</li><li>CVM_ABNORMAL：启动配置异常</li><li>LB_ABNORMAL：负载均衡器异常</li><li>LB_LISTENER_ABNORMAL：负载均衡器监听器异常</li><li>LB_LOCATION_ABNORMAL：负载均衡器监听器转发配置异常</li><li>VPC_ABNORMAL：VPC网络异常</li><li>SUBNET_ABNORMAL：VPC子网异常</li><li>INSUFFICIENT_BALANCE：余额不足</li><li>LB_BACKEND_REGION_NOT_MATCH：CLB实例后端地域与AS服务所在地域不匹配</li><li>LB_BACKEND_VPC_NOT_MATCH：CLB实例VPC与伸缩组VPC不匹配</li>
     */
    public String getAutoScalingGroupStatus() {
        return this.AutoScalingGroupStatus;
    }

    /**
     * Set <p>伸缩组当前状态。取值范围：</p><li>NORMAL：正常</li><li>CVM_ABNORMAL：启动配置异常</li><li>LB_ABNORMAL：负载均衡器异常</li><li>LB_LISTENER_ABNORMAL：负载均衡器监听器异常</li><li>LB_LOCATION_ABNORMAL：负载均衡器监听器转发配置异常</li><li>VPC_ABNORMAL：VPC网络异常</li><li>SUBNET_ABNORMAL：VPC子网异常</li><li>INSUFFICIENT_BALANCE：余额不足</li><li>LB_BACKEND_REGION_NOT_MATCH：CLB实例后端地域与AS服务所在地域不匹配</li><li>LB_BACKEND_VPC_NOT_MATCH：CLB实例VPC与伸缩组VPC不匹配</li>
     * @param AutoScalingGroupStatus <p>伸缩组当前状态。取值范围：</p><li>NORMAL：正常</li><li>CVM_ABNORMAL：启动配置异常</li><li>LB_ABNORMAL：负载均衡器异常</li><li>LB_LISTENER_ABNORMAL：负载均衡器监听器异常</li><li>LB_LOCATION_ABNORMAL：负载均衡器监听器转发配置异常</li><li>VPC_ABNORMAL：VPC网络异常</li><li>SUBNET_ABNORMAL：VPC子网异常</li><li>INSUFFICIENT_BALANCE：余额不足</li><li>LB_BACKEND_REGION_NOT_MATCH：CLB实例后端地域与AS服务所在地域不匹配</li><li>LB_BACKEND_VPC_NOT_MATCH：CLB实例VPC与伸缩组VPC不匹配</li>
     */
    public void setAutoScalingGroupStatus(String AutoScalingGroupStatus) {
        this.AutoScalingGroupStatus = AutoScalingGroupStatus;
    }

    /**
     * Get <p>创建时间，采用UTC标准计时</p> 
     * @return CreatedTime <p>创建时间，采用UTC标准计时</p>
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>创建时间，采用UTC标准计时</p>
     * @param CreatedTime <p>创建时间，采用UTC标准计时</p>
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>默认冷却时间，单位秒</p> 
     * @return DefaultCooldown <p>默认冷却时间，单位秒</p>
     */
    public Long getDefaultCooldown() {
        return this.DefaultCooldown;
    }

    /**
     * Set <p>默认冷却时间，单位秒</p>
     * @param DefaultCooldown <p>默认冷却时间，单位秒</p>
     */
    public void setDefaultCooldown(Long DefaultCooldown) {
        this.DefaultCooldown = DefaultCooldown;
    }

    /**
     * Get <p>期望实例数</p> 
     * @return DesiredCapacity <p>期望实例数</p>
     */
    public Long getDesiredCapacity() {
        return this.DesiredCapacity;
    }

    /**
     * Set <p>期望实例数</p>
     * @param DesiredCapacity <p>期望实例数</p>
     */
    public void setDesiredCapacity(Long DesiredCapacity) {
        this.DesiredCapacity = DesiredCapacity;
    }

    /**
     * Get <p>启用状态，取值包括<code>ENABLED</code>和<code>DISABLED</code></p> 
     * @return EnabledStatus <p>启用状态，取值包括<code>ENABLED</code>和<code>DISABLED</code></p>
     */
    public String getEnabledStatus() {
        return this.EnabledStatus;
    }

    /**
     * Set <p>启用状态，取值包括<code>ENABLED</code>和<code>DISABLED</code></p>
     * @param EnabledStatus <p>启用状态，取值包括<code>ENABLED</code>和<code>DISABLED</code></p>
     */
    public void setEnabledStatus(String EnabledStatus) {
        this.EnabledStatus = EnabledStatus;
    }

    /**
     * Get <p>应用型负载均衡器列表</p> 
     * @return ForwardLoadBalancerSet <p>应用型负载均衡器列表</p>
     */
    public ForwardLoadBalancer [] getForwardLoadBalancerSet() {
        return this.ForwardLoadBalancerSet;
    }

    /**
     * Set <p>应用型负载均衡器列表</p>
     * @param ForwardLoadBalancerSet <p>应用型负载均衡器列表</p>
     */
    public void setForwardLoadBalancerSet(ForwardLoadBalancer [] ForwardLoadBalancerSet) {
        this.ForwardLoadBalancerSet = ForwardLoadBalancerSet;
    }

    /**
     * Get <p>实例数量</p> 
     * @return InstanceCount <p>实例数量</p>
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set <p>实例数量</p>
     * @param InstanceCount <p>实例数量</p>
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get <p>状态为<code>IN_SERVICE</code>实例的数量</p> 
     * @return InServiceInstanceCount <p>状态为<code>IN_SERVICE</code>实例的数量</p>
     */
    public Long getInServiceInstanceCount() {
        return this.InServiceInstanceCount;
    }

    /**
     * Set <p>状态为<code>IN_SERVICE</code>实例的数量</p>
     * @param InServiceInstanceCount <p>状态为<code>IN_SERVICE</code>实例的数量</p>
     */
    public void setInServiceInstanceCount(Long InServiceInstanceCount) {
        this.InServiceInstanceCount = InServiceInstanceCount;
    }

    /**
     * Get <p>启动配置ID</p> 
     * @return LaunchConfigurationId <p>启动配置ID</p>
     */
    public String getLaunchConfigurationId() {
        return this.LaunchConfigurationId;
    }

    /**
     * Set <p>启动配置ID</p>
     * @param LaunchConfigurationId <p>启动配置ID</p>
     */
    public void setLaunchConfigurationId(String LaunchConfigurationId) {
        this.LaunchConfigurationId = LaunchConfigurationId;
    }

    /**
     * Get <p>启动配置名称</p> 
     * @return LaunchConfigurationName <p>启动配置名称</p>
     */
    public String getLaunchConfigurationName() {
        return this.LaunchConfigurationName;
    }

    /**
     * Set <p>启动配置名称</p>
     * @param LaunchConfigurationName <p>启动配置名称</p>
     */
    public void setLaunchConfigurationName(String LaunchConfigurationName) {
        this.LaunchConfigurationName = LaunchConfigurationName;
    }

    /**
     * Get <p>传统型负载均衡器ID列表</p> 
     * @return LoadBalancerIdSet <p>传统型负载均衡器ID列表</p>
     */
    public String [] getLoadBalancerIdSet() {
        return this.LoadBalancerIdSet;
    }

    /**
     * Set <p>传统型负载均衡器ID列表</p>
     * @param LoadBalancerIdSet <p>传统型负载均衡器ID列表</p>
     */
    public void setLoadBalancerIdSet(String [] LoadBalancerIdSet) {
        this.LoadBalancerIdSet = LoadBalancerIdSet;
    }

    /**
     * Get <p>最大实例数</p> 
     * @return MaxSize <p>最大实例数</p>
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set <p>最大实例数</p>
     * @param MaxSize <p>最大实例数</p>
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * Get <p>最小实例数</p> 
     * @return MinSize <p>最小实例数</p>
     */
    public Long getMinSize() {
        return this.MinSize;
    }

    /**
     * Set <p>最小实例数</p>
     * @param MinSize <p>最小实例数</p>
     */
    public void setMinSize(Long MinSize) {
        this.MinSize = MinSize;
    }

    /**
     * Get <p>项目ID</p> 
     * @return ProjectId <p>项目ID</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID</p>
     * @param ProjectId <p>项目ID</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>子网ID列表</p> 
     * @return SubnetIdSet <p>子网ID列表</p>
     */
    public String [] getSubnetIdSet() {
        return this.SubnetIdSet;
    }

    /**
     * Set <p>子网ID列表</p>
     * @param SubnetIdSet <p>子网ID列表</p>
     */
    public void setSubnetIdSet(String [] SubnetIdSet) {
        this.SubnetIdSet = SubnetIdSet;
    }

    /**
     * Get <p>销毁策略。取值范围如下：</p><li>OLDEST_INSTANCE：优先销毁伸缩组中最旧的实例，默认取值。</li><li>NEWEST_INSTANCE：优先销毁伸缩组中最新的实例。</li> 
     * @return TerminationPolicySet <p>销毁策略。取值范围如下：</p><li>OLDEST_INSTANCE：优先销毁伸缩组中最旧的实例，默认取值。</li><li>NEWEST_INSTANCE：优先销毁伸缩组中最新的实例。</li>
     */
    public String [] getTerminationPolicySet() {
        return this.TerminationPolicySet;
    }

    /**
     * Set <p>销毁策略。取值范围如下：</p><li>OLDEST_INSTANCE：优先销毁伸缩组中最旧的实例，默认取值。</li><li>NEWEST_INSTANCE：优先销毁伸缩组中最新的实例。</li>
     * @param TerminationPolicySet <p>销毁策略。取值范围如下：</p><li>OLDEST_INSTANCE：优先销毁伸缩组中最旧的实例，默认取值。</li><li>NEWEST_INSTANCE：优先销毁伸缩组中最新的实例。</li>
     */
    public void setTerminationPolicySet(String [] TerminationPolicySet) {
        this.TerminationPolicySet = TerminationPolicySet;
    }

    /**
     * Get <p>私有网络ID。</p> 
     * @return VpcId <p>私有网络ID。</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>私有网络ID。</p>
     * @param VpcId <p>私有网络ID。</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>可用区列表</p> 
     * @return ZoneSet <p>可用区列表</p>
     */
    public String [] getZoneSet() {
        return this.ZoneSet;
    }

    /**
     * Set <p>可用区列表</p>
     * @param ZoneSet <p>可用区列表</p>
     */
    public void setZoneSet(String [] ZoneSet) {
        this.ZoneSet = ZoneSet;
    }

    /**
     * Get <p>重试策略，部分成功的伸缩活动判定为一次失败活动。取值范围如下：</p><li>IMMEDIATE_RETRY：默认取值，表示立即重试，在较短时间内快速重试，连续失败超过一定次数（5次）后不再重试。</li><li>INCREMENTAL_INTERVALS：间隔递增重试，随着连续失败次数的增加，重试间隔逐渐增大。前 10 次重试为快速重试，后续重试间隔逐步递增至 10 分钟、30 分钟、60 分钟、一天。</li><li>NO_RETRY，不进行重试，直到再次收到用户调用或者告警信息后才会重试。</li> 
     * @return RetryPolicy <p>重试策略，部分成功的伸缩活动判定为一次失败活动。取值范围如下：</p><li>IMMEDIATE_RETRY：默认取值，表示立即重试，在较短时间内快速重试，连续失败超过一定次数（5次）后不再重试。</li><li>INCREMENTAL_INTERVALS：间隔递增重试，随着连续失败次数的增加，重试间隔逐渐增大。前 10 次重试为快速重试，后续重试间隔逐步递增至 10 分钟、30 分钟、60 分钟、一天。</li><li>NO_RETRY，不进行重试，直到再次收到用户调用或者告警信息后才会重试。</li>
     */
    public String getRetryPolicy() {
        return this.RetryPolicy;
    }

    /**
     * Set <p>重试策略，部分成功的伸缩活动判定为一次失败活动。取值范围如下：</p><li>IMMEDIATE_RETRY：默认取值，表示立即重试，在较短时间内快速重试，连续失败超过一定次数（5次）后不再重试。</li><li>INCREMENTAL_INTERVALS：间隔递增重试，随着连续失败次数的增加，重试间隔逐渐增大。前 10 次重试为快速重试，后续重试间隔逐步递增至 10 分钟、30 分钟、60 分钟、一天。</li><li>NO_RETRY，不进行重试，直到再次收到用户调用或者告警信息后才会重试。</li>
     * @param RetryPolicy <p>重试策略，部分成功的伸缩活动判定为一次失败活动。取值范围如下：</p><li>IMMEDIATE_RETRY：默认取值，表示立即重试，在较短时间内快速重试，连续失败超过一定次数（5次）后不再重试。</li><li>INCREMENTAL_INTERVALS：间隔递增重试，随着连续失败次数的增加，重试间隔逐渐增大。前 10 次重试为快速重试，后续重试间隔逐步递增至 10 分钟、30 分钟、60 分钟、一天。</li><li>NO_RETRY，不进行重试，直到再次收到用户调用或者告警信息后才会重试。</li>
     */
    public void setRetryPolicy(String RetryPolicy) {
        this.RetryPolicy = RetryPolicy;
    }

    /**
     * Get <p>伸缩组是否处于伸缩活动中，<code>IN_ACTIVITY</code>表示处于伸缩活动中，<code>NOT_IN_ACTIVITY</code>表示不处于伸缩活动中。</p> 
     * @return InActivityStatus <p>伸缩组是否处于伸缩活动中，<code>IN_ACTIVITY</code>表示处于伸缩活动中，<code>NOT_IN_ACTIVITY</code>表示不处于伸缩活动中。</p>
     */
    public String getInActivityStatus() {
        return this.InActivityStatus;
    }

    /**
     * Set <p>伸缩组是否处于伸缩活动中，<code>IN_ACTIVITY</code>表示处于伸缩活动中，<code>NOT_IN_ACTIVITY</code>表示不处于伸缩活动中。</p>
     * @param InActivityStatus <p>伸缩组是否处于伸缩活动中，<code>IN_ACTIVITY</code>表示处于伸缩活动中，<code>NOT_IN_ACTIVITY</code>表示不处于伸缩活动中。</p>
     */
    public void setInActivityStatus(String InActivityStatus) {
        this.InActivityStatus = InActivityStatus;
    }

    /**
     * Get <p>伸缩组标签列表</p> 
     * @return Tags <p>伸缩组标签列表</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>伸缩组标签列表</p>
     * @param Tags <p>伸缩组标签列表</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>服务设置</p> 
     * @return ServiceSettings <p>服务设置</p>
     */
    public ServiceSettings getServiceSettings() {
        return this.ServiceSettings;
    }

    /**
     * Set <p>服务设置</p>
     * @param ServiceSettings <p>服务设置</p>
     */
    public void setServiceSettings(ServiceSettings ServiceSettings) {
        this.ServiceSettings = ServiceSettings;
    }

    /**
     * Get <p>实例具有IPv6地址数量的配置，取值包括0、1。默认值为 0，表示实例不分配 IPv6 地址。需使用支持 IPv6 的私有网络，需在子网中开启 IPv6 CIDR，其他使用限制可参考 <a href="https://cloud.tencent.com/document/product/1142/38369">IPv6使用限制</a>。</p> 
     * @return Ipv6AddressCount <p>实例具有IPv6地址数量的配置，取值包括0、1。默认值为 0，表示实例不分配 IPv6 地址。需使用支持 IPv6 的私有网络，需在子网中开启 IPv6 CIDR，其他使用限制可参考 <a href="https://cloud.tencent.com/document/product/1142/38369">IPv6使用限制</a>。</p>
     */
    public Long getIpv6AddressCount() {
        return this.Ipv6AddressCount;
    }

    /**
     * Set <p>实例具有IPv6地址数量的配置，取值包括0、1。默认值为 0，表示实例不分配 IPv6 地址。需使用支持 IPv6 的私有网络，需在子网中开启 IPv6 CIDR，其他使用限制可参考 <a href="https://cloud.tencent.com/document/product/1142/38369">IPv6使用限制</a>。</p>
     * @param Ipv6AddressCount <p>实例具有IPv6地址数量的配置，取值包括0、1。默认值为 0，表示实例不分配 IPv6 地址。需使用支持 IPv6 的私有网络，需在子网中开启 IPv6 CIDR，其他使用限制可参考 <a href="https://cloud.tencent.com/document/product/1142/38369">IPv6使用限制</a>。</p>
     */
    public void setIpv6AddressCount(Long Ipv6AddressCount) {
        this.Ipv6AddressCount = Ipv6AddressCount;
    }

    /**
     * Get <p>多可用区/子网策略。</p><li> PRIORITY，按照可用区/子网列表的顺序，作为优先级来尝试创建实例，如果优先级最高的可用区/子网可以创建成功，则总在该可用区/子网创建。</li><li> EQUALITY：每次选择当前实例数最少的可用区/子网进行扩容，使得每个可用区/子网都有机会发生扩容，多次扩容出的实例会打散到多个可用区/子网。</li> 
     * @return MultiZoneSubnetPolicy <p>多可用区/子网策略。</p><li> PRIORITY，按照可用区/子网列表的顺序，作为优先级来尝试创建实例，如果优先级最高的可用区/子网可以创建成功，则总在该可用区/子网创建。</li><li> EQUALITY：每次选择当前实例数最少的可用区/子网进行扩容，使得每个可用区/子网都有机会发生扩容，多次扩容出的实例会打散到多个可用区/子网。</li>
     */
    public String getMultiZoneSubnetPolicy() {
        return this.MultiZoneSubnetPolicy;
    }

    /**
     * Set <p>多可用区/子网策略。</p><li> PRIORITY，按照可用区/子网列表的顺序，作为优先级来尝试创建实例，如果优先级最高的可用区/子网可以创建成功，则总在该可用区/子网创建。</li><li> EQUALITY：每次选择当前实例数最少的可用区/子网进行扩容，使得每个可用区/子网都有机会发生扩容，多次扩容出的实例会打散到多个可用区/子网。</li>
     * @param MultiZoneSubnetPolicy <p>多可用区/子网策略。</p><li> PRIORITY，按照可用区/子网列表的顺序，作为优先级来尝试创建实例，如果优先级最高的可用区/子网可以创建成功，则总在该可用区/子网创建。</li><li> EQUALITY：每次选择当前实例数最少的可用区/子网进行扩容，使得每个可用区/子网都有机会发生扩容，多次扩容出的实例会打散到多个可用区/子网。</li>
     */
    public void setMultiZoneSubnetPolicy(String MultiZoneSubnetPolicy) {
        this.MultiZoneSubnetPolicy = MultiZoneSubnetPolicy;
    }

    /**
     * Get <p>伸缩组实例健康检查类型，取值如下：</p><li>CVM：根据实例网络状态判断实例是否处于不健康状态，不健康的网络状态即发生实例 PING 不可达事件，详细判断标准可参考[实例健康检查](https://cloud.tencent.com/document/product/377/8553)</li><li>CLB：根据 CLB 的健康检查状态判断实例是否处于不健康状态，CLB健康检查原理可参考[健康检查](https://cloud.tencent.com/document/product/214/6097)</li> 
     * @return HealthCheckType <p>伸缩组实例健康检查类型，取值如下：</p><li>CVM：根据实例网络状态判断实例是否处于不健康状态，不健康的网络状态即发生实例 PING 不可达事件，详细判断标准可参考[实例健康检查](https://cloud.tencent.com/document/product/377/8553)</li><li>CLB：根据 CLB 的健康检查状态判断实例是否处于不健康状态，CLB健康检查原理可参考[健康检查](https://cloud.tencent.com/document/product/214/6097)</li>
     */
    public String getHealthCheckType() {
        return this.HealthCheckType;
    }

    /**
     * Set <p>伸缩组实例健康检查类型，取值如下：</p><li>CVM：根据实例网络状态判断实例是否处于不健康状态，不健康的网络状态即发生实例 PING 不可达事件，详细判断标准可参考[实例健康检查](https://cloud.tencent.com/document/product/377/8553)</li><li>CLB：根据 CLB 的健康检查状态判断实例是否处于不健康状态，CLB健康检查原理可参考[健康检查](https://cloud.tencent.com/document/product/214/6097)</li>
     * @param HealthCheckType <p>伸缩组实例健康检查类型，取值如下：</p><li>CVM：根据实例网络状态判断实例是否处于不健康状态，不健康的网络状态即发生实例 PING 不可达事件，详细判断标准可参考[实例健康检查](https://cloud.tencent.com/document/product/377/8553)</li><li>CLB：根据 CLB 的健康检查状态判断实例是否处于不健康状态，CLB健康检查原理可参考[健康检查](https://cloud.tencent.com/document/product/214/6097)</li>
     */
    public void setHealthCheckType(String HealthCheckType) {
        this.HealthCheckType = HealthCheckType;
    }

    /**
     * Get <p>CLB健康检查宽限期.当扩容的实例进入IN_SERVICE后，在宽限期时间范围内将不会被标记为不健康CLB_UNHEALTHY。<br>默认值：0。取值范围[0, 7200]，单位：秒。</p> 
     * @return LoadBalancerHealthCheckGracePeriod <p>CLB健康检查宽限期.当扩容的实例进入IN_SERVICE后，在宽限期时间范围内将不会被标记为不健康CLB_UNHEALTHY。<br>默认值：0。取值范围[0, 7200]，单位：秒。</p>
     */
    public Long getLoadBalancerHealthCheckGracePeriod() {
        return this.LoadBalancerHealthCheckGracePeriod;
    }

    /**
     * Set <p>CLB健康检查宽限期.当扩容的实例进入IN_SERVICE后，在宽限期时间范围内将不会被标记为不健康CLB_UNHEALTHY。<br>默认值：0。取值范围[0, 7200]，单位：秒。</p>
     * @param LoadBalancerHealthCheckGracePeriod <p>CLB健康检查宽限期.当扩容的实例进入IN_SERVICE后，在宽限期时间范围内将不会被标记为不健康CLB_UNHEALTHY。<br>默认值：0。取值范围[0, 7200]，单位：秒。</p>
     */
    public void setLoadBalancerHealthCheckGracePeriod(Long LoadBalancerHealthCheckGracePeriod) {
        this.LoadBalancerHealthCheckGracePeriod = LoadBalancerHealthCheckGracePeriod;
    }

    /**
     * Get <p>实例分配策略，取值包括 LAUNCH_CONFIGURATION 和 SPOT_MIXED。</p><li> LAUNCH_CONFIGURATION，代表传统的按照启动配置模式。</li><li> SPOT_MIXED，代表竞价混合模式。目前仅支持启动配置为按量计费模式时使用混合模式，混合模式下，伸缩组将根据设定扩容按量或竞价机型。使用混合模式时，关联的启动配置的计费类型不可被修改。</li> 
     * @return InstanceAllocationPolicy <p>实例分配策略，取值包括 LAUNCH_CONFIGURATION 和 SPOT_MIXED。</p><li> LAUNCH_CONFIGURATION，代表传统的按照启动配置模式。</li><li> SPOT_MIXED，代表竞价混合模式。目前仅支持启动配置为按量计费模式时使用混合模式，混合模式下，伸缩组将根据设定扩容按量或竞价机型。使用混合模式时，关联的启动配置的计费类型不可被修改。</li>
     */
    public String getInstanceAllocationPolicy() {
        return this.InstanceAllocationPolicy;
    }

    /**
     * Set <p>实例分配策略，取值包括 LAUNCH_CONFIGURATION 和 SPOT_MIXED。</p><li> LAUNCH_CONFIGURATION，代表传统的按照启动配置模式。</li><li> SPOT_MIXED，代表竞价混合模式。目前仅支持启动配置为按量计费模式时使用混合模式，混合模式下，伸缩组将根据设定扩容按量或竞价机型。使用混合模式时，关联的启动配置的计费类型不可被修改。</li>
     * @param InstanceAllocationPolicy <p>实例分配策略，取值包括 LAUNCH_CONFIGURATION 和 SPOT_MIXED。</p><li> LAUNCH_CONFIGURATION，代表传统的按照启动配置模式。</li><li> SPOT_MIXED，代表竞价混合模式。目前仅支持启动配置为按量计费模式时使用混合模式，混合模式下，伸缩组将根据设定扩容按量或竞价机型。使用混合模式时，关联的启动配置的计费类型不可被修改。</li>
     */
    public void setInstanceAllocationPolicy(String InstanceAllocationPolicy) {
        this.InstanceAllocationPolicy = InstanceAllocationPolicy;
    }

    /**
     * Get <p>竞价混合模式下，各计费类型实例的分配策略。<br>仅当 InstanceAllocationPolicy 取 SPOT_MIXED 时才会返回有效值。</p> 
     * @return SpotMixedAllocationPolicy <p>竞价混合模式下，各计费类型实例的分配策略。<br>仅当 InstanceAllocationPolicy 取 SPOT_MIXED 时才会返回有效值。</p>
     */
    public SpotMixedAllocationPolicy getSpotMixedAllocationPolicy() {
        return this.SpotMixedAllocationPolicy;
    }

    /**
     * Set <p>竞价混合模式下，各计费类型实例的分配策略。<br>仅当 InstanceAllocationPolicy 取 SPOT_MIXED 时才会返回有效值。</p>
     * @param SpotMixedAllocationPolicy <p>竞价混合模式下，各计费类型实例的分配策略。<br>仅当 InstanceAllocationPolicy 取 SPOT_MIXED 时才会返回有效值。</p>
     */
    public void setSpotMixedAllocationPolicy(SpotMixedAllocationPolicy SpotMixedAllocationPolicy) {
        this.SpotMixedAllocationPolicy = SpotMixedAllocationPolicy;
    }

    /**
     * Get <p>容量重平衡功能，仅对伸缩组内的竞价实例有效。取值范围：</p><li> TRUE，开启该功能，当伸缩组内的竞价实例即将被竞价实例服务自动回收前，AS 主动发起竞价实例销毁流程，如果有配置过缩容 hook，则销毁前 hook 会生效。销毁流程启动后，AS 会异步开启一个扩容活动，用于补齐期望实例数。</li><li> FALSE，不开启该功能，则 AS 等待竞价实例被销毁后才会去扩容补齐伸缩组期望实例数。</li> 
     * @return CapacityRebalance <p>容量重平衡功能，仅对伸缩组内的竞价实例有效。取值范围：</p><li> TRUE，开启该功能，当伸缩组内的竞价实例即将被竞价实例服务自动回收前，AS 主动发起竞价实例销毁流程，如果有配置过缩容 hook，则销毁前 hook 会生效。销毁流程启动后，AS 会异步开启一个扩容活动，用于补齐期望实例数。</li><li> FALSE，不开启该功能，则 AS 等待竞价实例被销毁后才会去扩容补齐伸缩组期望实例数。</li>
     */
    public Boolean getCapacityRebalance() {
        return this.CapacityRebalance;
    }

    /**
     * Set <p>容量重平衡功能，仅对伸缩组内的竞价实例有效。取值范围：</p><li> TRUE，开启该功能，当伸缩组内的竞价实例即将被竞价实例服务自动回收前，AS 主动发起竞价实例销毁流程，如果有配置过缩容 hook，则销毁前 hook 会生效。销毁流程启动后，AS 会异步开启一个扩容活动，用于补齐期望实例数。</li><li> FALSE，不开启该功能，则 AS 等待竞价实例被销毁后才会去扩容补齐伸缩组期望实例数。</li>
     * @param CapacityRebalance <p>容量重平衡功能，仅对伸缩组内的竞价实例有效。取值范围：</p><li> TRUE，开启该功能，当伸缩组内的竞价实例即将被竞价实例服务自动回收前，AS 主动发起竞价实例销毁流程，如果有配置过缩容 hook，则销毁前 hook 会生效。销毁流程启动后，AS 会异步开启一个扩容活动，用于补齐期望实例数。</li><li> FALSE，不开启该功能，则 AS 等待竞价实例被销毁后才会去扩容补齐伸缩组期望实例数。</li>
     */
    public void setCapacityRebalance(Boolean CapacityRebalance) {
        this.CapacityRebalance = CapacityRebalance;
    }

    /**
     * Get <p>实例名称序号相关设置。</p> 
     * @return InstanceNameIndexSettings <p>实例名称序号相关设置。</p>
     */
    public InstanceNameIndexSettings getInstanceNameIndexSettings() {
        return this.InstanceNameIndexSettings;
    }

    /**
     * Set <p>实例名称序号相关设置。</p>
     * @param InstanceNameIndexSettings <p>实例名称序号相关设置。</p>
     */
    public void setInstanceNameIndexSettings(InstanceNameIndexSettings InstanceNameIndexSettings) {
        this.InstanceNameIndexSettings = InstanceNameIndexSettings;
    }

    /**
     * Get <p>实例主机名序号相关设置。</p> 
     * @return HostNameIndexSettings <p>实例主机名序号相关设置。</p>
     */
    public HostNameIndexSettings getHostNameIndexSettings() {
        return this.HostNameIndexSettings;
    }

    /**
     * Set <p>实例主机名序号相关设置。</p>
     * @param HostNameIndexSettings <p>实例主机名序号相关设置。</p>
     */
    public void setHostNameIndexSettings(HostNameIndexSettings HostNameIndexSettings) {
        this.HostNameIndexSettings = HostNameIndexSettings;
    }

    /**
     * Get <p>匹配期望数并发扩容功能，不能在InstanceAllocationPolicy为竞价混合模式时设置，也不能在ScalingMode为扩容优先开机模式时设置。目前仅支持两个匹配期望数扩容活动并发进行，不支持指定数量扩容、缩容等其他类型活动并发。默认值为FALSE，表示不开启。</p> 
     * @return ConcurrentScaleOutForDesiredCapacity <p>匹配期望数并发扩容功能，不能在InstanceAllocationPolicy为竞价混合模式时设置，也不能在ScalingMode为扩容优先开机模式时设置。目前仅支持两个匹配期望数扩容活动并发进行，不支持指定数量扩容、缩容等其他类型活动并发。默认值为FALSE，表示不开启。</p>
     */
    public Boolean getConcurrentScaleOutForDesiredCapacity() {
        return this.ConcurrentScaleOutForDesiredCapacity;
    }

    /**
     * Set <p>匹配期望数并发扩容功能，不能在InstanceAllocationPolicy为竞价混合模式时设置，也不能在ScalingMode为扩容优先开机模式时设置。目前仅支持两个匹配期望数扩容活动并发进行，不支持指定数量扩容、缩容等其他类型活动并发。默认值为FALSE，表示不开启。</p>
     * @param ConcurrentScaleOutForDesiredCapacity <p>匹配期望数并发扩容功能，不能在InstanceAllocationPolicy为竞价混合模式时设置，也不能在ScalingMode为扩容优先开机模式时设置。目前仅支持两个匹配期望数扩容活动并发进行，不支持指定数量扩容、缩容等其他类型活动并发。默认值为FALSE，表示不开启。</p>
     */
    public void setConcurrentScaleOutForDesiredCapacity(Boolean ConcurrentScaleOutForDesiredCapacity) {
        this.ConcurrentScaleOutForDesiredCapacity = ConcurrentScaleOutForDesiredCapacity;
    }

    public AutoScalingGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoScalingGroup(AutoScalingGroup source) {
        if (source.AutoScalingGroupId != null) {
            this.AutoScalingGroupId = new String(source.AutoScalingGroupId);
        }
        if (source.AutoScalingGroupName != null) {
            this.AutoScalingGroupName = new String(source.AutoScalingGroupName);
        }
        if (source.AutoScalingGroupStatus != null) {
            this.AutoScalingGroupStatus = new String(source.AutoScalingGroupStatus);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.DefaultCooldown != null) {
            this.DefaultCooldown = new Long(source.DefaultCooldown);
        }
        if (source.DesiredCapacity != null) {
            this.DesiredCapacity = new Long(source.DesiredCapacity);
        }
        if (source.EnabledStatus != null) {
            this.EnabledStatus = new String(source.EnabledStatus);
        }
        if (source.ForwardLoadBalancerSet != null) {
            this.ForwardLoadBalancerSet = new ForwardLoadBalancer[source.ForwardLoadBalancerSet.length];
            for (int i = 0; i < source.ForwardLoadBalancerSet.length; i++) {
                this.ForwardLoadBalancerSet[i] = new ForwardLoadBalancer(source.ForwardLoadBalancerSet[i]);
            }
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.InServiceInstanceCount != null) {
            this.InServiceInstanceCount = new Long(source.InServiceInstanceCount);
        }
        if (source.LaunchConfigurationId != null) {
            this.LaunchConfigurationId = new String(source.LaunchConfigurationId);
        }
        if (source.LaunchConfigurationName != null) {
            this.LaunchConfigurationName = new String(source.LaunchConfigurationName);
        }
        if (source.LoadBalancerIdSet != null) {
            this.LoadBalancerIdSet = new String[source.LoadBalancerIdSet.length];
            for (int i = 0; i < source.LoadBalancerIdSet.length; i++) {
                this.LoadBalancerIdSet[i] = new String(source.LoadBalancerIdSet[i]);
            }
        }
        if (source.MaxSize != null) {
            this.MaxSize = new Long(source.MaxSize);
        }
        if (source.MinSize != null) {
            this.MinSize = new Long(source.MinSize);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.SubnetIdSet != null) {
            this.SubnetIdSet = new String[source.SubnetIdSet.length];
            for (int i = 0; i < source.SubnetIdSet.length; i++) {
                this.SubnetIdSet[i] = new String(source.SubnetIdSet[i]);
            }
        }
        if (source.TerminationPolicySet != null) {
            this.TerminationPolicySet = new String[source.TerminationPolicySet.length];
            for (int i = 0; i < source.TerminationPolicySet.length; i++) {
                this.TerminationPolicySet[i] = new String(source.TerminationPolicySet[i]);
            }
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.ZoneSet != null) {
            this.ZoneSet = new String[source.ZoneSet.length];
            for (int i = 0; i < source.ZoneSet.length; i++) {
                this.ZoneSet[i] = new String(source.ZoneSet[i]);
            }
        }
        if (source.RetryPolicy != null) {
            this.RetryPolicy = new String(source.RetryPolicy);
        }
        if (source.InActivityStatus != null) {
            this.InActivityStatus = new String(source.InActivityStatus);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.ServiceSettings != null) {
            this.ServiceSettings = new ServiceSettings(source.ServiceSettings);
        }
        if (source.Ipv6AddressCount != null) {
            this.Ipv6AddressCount = new Long(source.Ipv6AddressCount);
        }
        if (source.MultiZoneSubnetPolicy != null) {
            this.MultiZoneSubnetPolicy = new String(source.MultiZoneSubnetPolicy);
        }
        if (source.HealthCheckType != null) {
            this.HealthCheckType = new String(source.HealthCheckType);
        }
        if (source.LoadBalancerHealthCheckGracePeriod != null) {
            this.LoadBalancerHealthCheckGracePeriod = new Long(source.LoadBalancerHealthCheckGracePeriod);
        }
        if (source.InstanceAllocationPolicy != null) {
            this.InstanceAllocationPolicy = new String(source.InstanceAllocationPolicy);
        }
        if (source.SpotMixedAllocationPolicy != null) {
            this.SpotMixedAllocationPolicy = new SpotMixedAllocationPolicy(source.SpotMixedAllocationPolicy);
        }
        if (source.CapacityRebalance != null) {
            this.CapacityRebalance = new Boolean(source.CapacityRebalance);
        }
        if (source.InstanceNameIndexSettings != null) {
            this.InstanceNameIndexSettings = new InstanceNameIndexSettings(source.InstanceNameIndexSettings);
        }
        if (source.HostNameIndexSettings != null) {
            this.HostNameIndexSettings = new HostNameIndexSettings(source.HostNameIndexSettings);
        }
        if (source.ConcurrentScaleOutForDesiredCapacity != null) {
            this.ConcurrentScaleOutForDesiredCapacity = new Boolean(source.ConcurrentScaleOutForDesiredCapacity);
        }
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
        this.setParamSimple(map, prefix + "HealthCheckType", this.HealthCheckType);
        this.setParamSimple(map, prefix + "LoadBalancerHealthCheckGracePeriod", this.LoadBalancerHealthCheckGracePeriod);
        this.setParamSimple(map, prefix + "InstanceAllocationPolicy", this.InstanceAllocationPolicy);
        this.setParamObj(map, prefix + "SpotMixedAllocationPolicy.", this.SpotMixedAllocationPolicy);
        this.setParamSimple(map, prefix + "CapacityRebalance", this.CapacityRebalance);
        this.setParamObj(map, prefix + "InstanceNameIndexSettings.", this.InstanceNameIndexSettings);
        this.setParamObj(map, prefix + "HostNameIndexSettings.", this.HostNameIndexSettings);
        this.setParamSimple(map, prefix + "ConcurrentScaleOutForDesiredCapacity", this.ConcurrentScaleOutForDesiredCapacity);

    }
}

