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

public class CreateAutoScalingGroupRequest  extends AbstractModel{

    /**
    * 伸缩组名称，在您账号中必须唯一。名称仅支持中文、英文、数字、下划线、分隔符"-"、小数点，最大长度不能超55个字节。
    */
    @SerializedName("AutoScalingGroupName")
    @Expose
    private String AutoScalingGroupName;

    /**
    * 启动配置ID
    */
    @SerializedName("LaunchConfigurationId")
    @Expose
    private String LaunchConfigurationId;

    /**
    * 最大实例数，取值范围为0-2000。
    */
    @SerializedName("MaxSize")
    @Expose
    private Integer MaxSize;

    /**
    * 最小实例数，取值范围为0-2000。
    */
    @SerializedName("MinSize")
    @Expose
    private Integer MinSize;

    /**
    * VPC ID，基础网络则填空字符串
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 默认冷却时间，单位秒，默认值为300
    */
    @SerializedName("DefaultCooldown")
    @Expose
    private Integer DefaultCooldown;

    /**
    * 期望实例数，大小介于最小实例数和最大实例数之间
    */
    @SerializedName("DesiredCapacity")
    @Expose
    private Integer DesiredCapacity;

    /**
    * 传统负载均衡器ID列表，目前长度上限为1，LoadBalancerIds 和 ForwardLoadBalancers 二者同时最多只能指定一个
    */
    @SerializedName("LoadBalancerIds")
    @Expose
    private String [] LoadBalancerIds;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;

    /**
    * 应用型负载均衡器列表，目前长度上限为1，LoadBalancerIds 和 ForwardLoadBalancers 二者同时最多只能指定一个
    */
    @SerializedName("ForwardLoadBalancers")
    @Expose
    private ForwardLoadBalancer [] ForwardLoadBalancers;

    /**
    * 子网ID列表，VPC场景下必须指定子网
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * 销毁策略，目前长度上限为1
    */
    @SerializedName("TerminationPolicies")
    @Expose
    private String [] TerminationPolicies;

    /**
    * 可用区列表，基础网络场景下必须指定可用区
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
     * 获取伸缩组名称，在您账号中必须唯一。名称仅支持中文、英文、数字、下划线、分隔符"-"、小数点，最大长度不能超55个字节。
     * @return AutoScalingGroupName 伸缩组名称，在您账号中必须唯一。名称仅支持中文、英文、数字、下划线、分隔符"-"、小数点，最大长度不能超55个字节。
     */
    public String getAutoScalingGroupName() {
        return this.AutoScalingGroupName;
    }

    /**
     * 设置伸缩组名称，在您账号中必须唯一。名称仅支持中文、英文、数字、下划线、分隔符"-"、小数点，最大长度不能超55个字节。
     * @param AutoScalingGroupName 伸缩组名称，在您账号中必须唯一。名称仅支持中文、英文、数字、下划线、分隔符"-"、小数点，最大长度不能超55个字节。
     */
    public void setAutoScalingGroupName(String AutoScalingGroupName) {
        this.AutoScalingGroupName = AutoScalingGroupName;
    }

    /**
     * 获取启动配置ID
     * @return LaunchConfigurationId 启动配置ID
     */
    public String getLaunchConfigurationId() {
        return this.LaunchConfigurationId;
    }

    /**
     * 设置启动配置ID
     * @param LaunchConfigurationId 启动配置ID
     */
    public void setLaunchConfigurationId(String LaunchConfigurationId) {
        this.LaunchConfigurationId = LaunchConfigurationId;
    }

    /**
     * 获取最大实例数，取值范围为0-2000。
     * @return MaxSize 最大实例数，取值范围为0-2000。
     */
    public Integer getMaxSize() {
        return this.MaxSize;
    }

    /**
     * 设置最大实例数，取值范围为0-2000。
     * @param MaxSize 最大实例数，取值范围为0-2000。
     */
    public void setMaxSize(Integer MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * 获取最小实例数，取值范围为0-2000。
     * @return MinSize 最小实例数，取值范围为0-2000。
     */
    public Integer getMinSize() {
        return this.MinSize;
    }

    /**
     * 设置最小实例数，取值范围为0-2000。
     * @param MinSize 最小实例数，取值范围为0-2000。
     */
    public void setMinSize(Integer MinSize) {
        this.MinSize = MinSize;
    }

    /**
     * 获取VPC ID，基础网络则填空字符串
     * @return VpcId VPC ID，基础网络则填空字符串
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置VPC ID，基础网络则填空字符串
     * @param VpcId VPC ID，基础网络则填空字符串
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取默认冷却时间，单位秒，默认值为300
     * @return DefaultCooldown 默认冷却时间，单位秒，默认值为300
     */
    public Integer getDefaultCooldown() {
        return this.DefaultCooldown;
    }

    /**
     * 设置默认冷却时间，单位秒，默认值为300
     * @param DefaultCooldown 默认冷却时间，单位秒，默认值为300
     */
    public void setDefaultCooldown(Integer DefaultCooldown) {
        this.DefaultCooldown = DefaultCooldown;
    }

    /**
     * 获取期望实例数，大小介于最小实例数和最大实例数之间
     * @return DesiredCapacity 期望实例数，大小介于最小实例数和最大实例数之间
     */
    public Integer getDesiredCapacity() {
        return this.DesiredCapacity;
    }

    /**
     * 设置期望实例数，大小介于最小实例数和最大实例数之间
     * @param DesiredCapacity 期望实例数，大小介于最小实例数和最大实例数之间
     */
    public void setDesiredCapacity(Integer DesiredCapacity) {
        this.DesiredCapacity = DesiredCapacity;
    }

    /**
     * 获取传统负载均衡器ID列表，目前长度上限为1，LoadBalancerIds 和 ForwardLoadBalancers 二者同时最多只能指定一个
     * @return LoadBalancerIds 传统负载均衡器ID列表，目前长度上限为1，LoadBalancerIds 和 ForwardLoadBalancers 二者同时最多只能指定一个
     */
    public String [] getLoadBalancerIds() {
        return this.LoadBalancerIds;
    }

    /**
     * 设置传统负载均衡器ID列表，目前长度上限为1，LoadBalancerIds 和 ForwardLoadBalancers 二者同时最多只能指定一个
     * @param LoadBalancerIds 传统负载均衡器ID列表，目前长度上限为1，LoadBalancerIds 和 ForwardLoadBalancers 二者同时最多只能指定一个
     */
    public void setLoadBalancerIds(String [] LoadBalancerIds) {
        this.LoadBalancerIds = LoadBalancerIds;
    }

    /**
     * 获取项目ID
     * @return ProjectId 项目ID
     */
    public Integer getProjectId() {
        return this.ProjectId;
    }

    /**
     * 设置项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * 获取应用型负载均衡器列表，目前长度上限为1，LoadBalancerIds 和 ForwardLoadBalancers 二者同时最多只能指定一个
     * @return ForwardLoadBalancers 应用型负载均衡器列表，目前长度上限为1，LoadBalancerIds 和 ForwardLoadBalancers 二者同时最多只能指定一个
     */
    public ForwardLoadBalancer [] getForwardLoadBalancers() {
        return this.ForwardLoadBalancers;
    }

    /**
     * 设置应用型负载均衡器列表，目前长度上限为1，LoadBalancerIds 和 ForwardLoadBalancers 二者同时最多只能指定一个
     * @param ForwardLoadBalancers 应用型负载均衡器列表，目前长度上限为1，LoadBalancerIds 和 ForwardLoadBalancers 二者同时最多只能指定一个
     */
    public void setForwardLoadBalancers(ForwardLoadBalancer [] ForwardLoadBalancers) {
        this.ForwardLoadBalancers = ForwardLoadBalancers;
    }

    /**
     * 获取子网ID列表，VPC场景下必须指定子网
     * @return SubnetIds 子网ID列表，VPC场景下必须指定子网
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * 设置子网ID列表，VPC场景下必须指定子网
     * @param SubnetIds 子网ID列表，VPC场景下必须指定子网
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * 获取销毁策略，目前长度上限为1
     * @return TerminationPolicies 销毁策略，目前长度上限为1
     */
    public String [] getTerminationPolicies() {
        return this.TerminationPolicies;
    }

    /**
     * 设置销毁策略，目前长度上限为1
     * @param TerminationPolicies 销毁策略，目前长度上限为1
     */
    public void setTerminationPolicies(String [] TerminationPolicies) {
        this.TerminationPolicies = TerminationPolicies;
    }

    /**
     * 获取可用区列表，基础网络场景下必须指定可用区
     * @return Zones 可用区列表，基础网络场景下必须指定可用区
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * 设置可用区列表，基础网络场景下必须指定可用区
     * @param Zones 可用区列表，基础网络场景下必须指定可用区
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingGroupName", this.AutoScalingGroupName);
        this.setParamSimple(map, prefix + "LaunchConfigurationId", this.LaunchConfigurationId);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);
        this.setParamSimple(map, prefix + "MinSize", this.MinSize);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "DefaultCooldown", this.DefaultCooldown);
        this.setParamSimple(map, prefix + "DesiredCapacity", this.DesiredCapacity);
        this.setParamArraySimple(map, prefix + "LoadBalancerIds.", this.LoadBalancerIds);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "ForwardLoadBalancers.", this.ForwardLoadBalancers);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamArraySimple(map, prefix + "TerminationPolicies.", this.TerminationPolicies);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);

    }
}

