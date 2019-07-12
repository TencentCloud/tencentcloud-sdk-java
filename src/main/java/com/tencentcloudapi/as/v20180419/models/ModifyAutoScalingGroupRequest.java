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

public class ModifyAutoScalingGroupRequest  extends AbstractModel{

    /**
    * 伸缩组ID
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * 伸缩组名称，在您账号中必须唯一。名称仅支持中文、英文、数字、下划线、分隔符"-"、小数点，最大长度不能超55个字节。
    */
    @SerializedName("AutoScalingGroupName")
    @Expose
    private String AutoScalingGroupName;

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
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;

    /**
    * 子网ID列表
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * 销毁策略，目前长度上限为1。取值包括 OLDEST_INSTANCE 和 NEWEST_INSTANCE。
<br><li> OLDEST_INSTANCE 优先销毁伸缩组中最旧的实例。
<br><li> NEWEST_INSTANCE，优先销毁伸缩组中最新的实例。
    */
    @SerializedName("TerminationPolicies")
    @Expose
    private String [] TerminationPolicies;

    /**
    * VPC ID，基础网络则填空字符串。修改为具体VPC ID时，需指定相应的SubnetIds；修改为基础网络时，需指定相应的Zones。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 可用区列表
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * 重试策略，取值包括 IMMEDIATE_RETRY、 INCREMENTAL_INTERVALS、NO_RETRY，默认取值为 IMMEDIATE_RETRY。
<br><li> IMMEDIATE_RETRY，立即重试，在较短时间内快速重试，连续失败超过一定次数（5次）后不再重试。
<br><li> INCREMENTAL_INTERVALS，间隔递增重试，随着连续失败次数的增加，重试间隔逐渐增大，重试间隔从秒级到1天不等。
<br><li> NO_RETRY，不进行重试，直到再次收到用户调用或者告警信息后才会重试。
    */
    @SerializedName("RetryPolicy")
    @Expose
    private String RetryPolicy;

    /**
    * 可用区校验策略，取值包括 ALL 和 ANY，默认取值为ANY。在伸缩组实际变更资源相关字段时（启动配置、可用区、子网）发挥作用。
<br><li> ALL，所有可用区（Zone）或子网（SubnetId）都可用则通过校验，否则校验报错。
<br><li> ANY，存在任何一个可用区（Zone）或子网（SubnetId）可用则通过校验，否则校验报错。

可用区或子网不可用的常见原因包括该可用区CVM实例类型售罄、该可用区CBS云盘售罄、该可用区配额不足、该子网IP不足等。
如果 Zones/SubnetIds 中可用区或者子网不存在，则无论 ZonesCheckPolicy 采用何种取值，都会校验报错。
    */
    @SerializedName("ZonesCheckPolicy")
    @Expose
    private String ZonesCheckPolicy;

    /**
    * 服务设置，包括云监控不健康替换等服务设置。
    */
    @SerializedName("ServiceSettings")
    @Expose
    private ServiceSettings ServiceSettings;

    /**
     * 获取伸缩组ID
     * @return AutoScalingGroupId 伸缩组ID
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * 设置伸缩组ID
     * @param AutoScalingGroupId 伸缩组ID
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

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
     * 获取子网ID列表
     * @return SubnetIds 子网ID列表
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * 设置子网ID列表
     * @param SubnetIds 子网ID列表
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * 获取销毁策略，目前长度上限为1。取值包括 OLDEST_INSTANCE 和 NEWEST_INSTANCE。
<br><li> OLDEST_INSTANCE 优先销毁伸缩组中最旧的实例。
<br><li> NEWEST_INSTANCE，优先销毁伸缩组中最新的实例。
     * @return TerminationPolicies 销毁策略，目前长度上限为1。取值包括 OLDEST_INSTANCE 和 NEWEST_INSTANCE。
<br><li> OLDEST_INSTANCE 优先销毁伸缩组中最旧的实例。
<br><li> NEWEST_INSTANCE，优先销毁伸缩组中最新的实例。
     */
    public String [] getTerminationPolicies() {
        return this.TerminationPolicies;
    }

    /**
     * 设置销毁策略，目前长度上限为1。取值包括 OLDEST_INSTANCE 和 NEWEST_INSTANCE。
<br><li> OLDEST_INSTANCE 优先销毁伸缩组中最旧的实例。
<br><li> NEWEST_INSTANCE，优先销毁伸缩组中最新的实例。
     * @param TerminationPolicies 销毁策略，目前长度上限为1。取值包括 OLDEST_INSTANCE 和 NEWEST_INSTANCE。
<br><li> OLDEST_INSTANCE 优先销毁伸缩组中最旧的实例。
<br><li> NEWEST_INSTANCE，优先销毁伸缩组中最新的实例。
     */
    public void setTerminationPolicies(String [] TerminationPolicies) {
        this.TerminationPolicies = TerminationPolicies;
    }

    /**
     * 获取VPC ID，基础网络则填空字符串。修改为具体VPC ID时，需指定相应的SubnetIds；修改为基础网络时，需指定相应的Zones。
     * @return VpcId VPC ID，基础网络则填空字符串。修改为具体VPC ID时，需指定相应的SubnetIds；修改为基础网络时，需指定相应的Zones。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置VPC ID，基础网络则填空字符串。修改为具体VPC ID时，需指定相应的SubnetIds；修改为基础网络时，需指定相应的Zones。
     * @param VpcId VPC ID，基础网络则填空字符串。修改为具体VPC ID时，需指定相应的SubnetIds；修改为基础网络时，需指定相应的Zones。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取可用区列表
     * @return Zones 可用区列表
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * 设置可用区列表
     * @param Zones 可用区列表
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * 获取重试策略，取值包括 IMMEDIATE_RETRY、 INCREMENTAL_INTERVALS、NO_RETRY，默认取值为 IMMEDIATE_RETRY。
<br><li> IMMEDIATE_RETRY，立即重试，在较短时间内快速重试，连续失败超过一定次数（5次）后不再重试。
<br><li> INCREMENTAL_INTERVALS，间隔递增重试，随着连续失败次数的增加，重试间隔逐渐增大，重试间隔从秒级到1天不等。
<br><li> NO_RETRY，不进行重试，直到再次收到用户调用或者告警信息后才会重试。
     * @return RetryPolicy 重试策略，取值包括 IMMEDIATE_RETRY、 INCREMENTAL_INTERVALS、NO_RETRY，默认取值为 IMMEDIATE_RETRY。
<br><li> IMMEDIATE_RETRY，立即重试，在较短时间内快速重试，连续失败超过一定次数（5次）后不再重试。
<br><li> INCREMENTAL_INTERVALS，间隔递增重试，随着连续失败次数的增加，重试间隔逐渐增大，重试间隔从秒级到1天不等。
<br><li> NO_RETRY，不进行重试，直到再次收到用户调用或者告警信息后才会重试。
     */
    public String getRetryPolicy() {
        return this.RetryPolicy;
    }

    /**
     * 设置重试策略，取值包括 IMMEDIATE_RETRY、 INCREMENTAL_INTERVALS、NO_RETRY，默认取值为 IMMEDIATE_RETRY。
<br><li> IMMEDIATE_RETRY，立即重试，在较短时间内快速重试，连续失败超过一定次数（5次）后不再重试。
<br><li> INCREMENTAL_INTERVALS，间隔递增重试，随着连续失败次数的增加，重试间隔逐渐增大，重试间隔从秒级到1天不等。
<br><li> NO_RETRY，不进行重试，直到再次收到用户调用或者告警信息后才会重试。
     * @param RetryPolicy 重试策略，取值包括 IMMEDIATE_RETRY、 INCREMENTAL_INTERVALS、NO_RETRY，默认取值为 IMMEDIATE_RETRY。
<br><li> IMMEDIATE_RETRY，立即重试，在较短时间内快速重试，连续失败超过一定次数（5次）后不再重试。
<br><li> INCREMENTAL_INTERVALS，间隔递增重试，随着连续失败次数的增加，重试间隔逐渐增大，重试间隔从秒级到1天不等。
<br><li> NO_RETRY，不进行重试，直到再次收到用户调用或者告警信息后才会重试。
     */
    public void setRetryPolicy(String RetryPolicy) {
        this.RetryPolicy = RetryPolicy;
    }

    /**
     * 获取可用区校验策略，取值包括 ALL 和 ANY，默认取值为ANY。在伸缩组实际变更资源相关字段时（启动配置、可用区、子网）发挥作用。
<br><li> ALL，所有可用区（Zone）或子网（SubnetId）都可用则通过校验，否则校验报错。
<br><li> ANY，存在任何一个可用区（Zone）或子网（SubnetId）可用则通过校验，否则校验报错。

可用区或子网不可用的常见原因包括该可用区CVM实例类型售罄、该可用区CBS云盘售罄、该可用区配额不足、该子网IP不足等。
如果 Zones/SubnetIds 中可用区或者子网不存在，则无论 ZonesCheckPolicy 采用何种取值，都会校验报错。
     * @return ZonesCheckPolicy 可用区校验策略，取值包括 ALL 和 ANY，默认取值为ANY。在伸缩组实际变更资源相关字段时（启动配置、可用区、子网）发挥作用。
<br><li> ALL，所有可用区（Zone）或子网（SubnetId）都可用则通过校验，否则校验报错。
<br><li> ANY，存在任何一个可用区（Zone）或子网（SubnetId）可用则通过校验，否则校验报错。

可用区或子网不可用的常见原因包括该可用区CVM实例类型售罄、该可用区CBS云盘售罄、该可用区配额不足、该子网IP不足等。
如果 Zones/SubnetIds 中可用区或者子网不存在，则无论 ZonesCheckPolicy 采用何种取值，都会校验报错。
     */
    public String getZonesCheckPolicy() {
        return this.ZonesCheckPolicy;
    }

    /**
     * 设置可用区校验策略，取值包括 ALL 和 ANY，默认取值为ANY。在伸缩组实际变更资源相关字段时（启动配置、可用区、子网）发挥作用。
<br><li> ALL，所有可用区（Zone）或子网（SubnetId）都可用则通过校验，否则校验报错。
<br><li> ANY，存在任何一个可用区（Zone）或子网（SubnetId）可用则通过校验，否则校验报错。

可用区或子网不可用的常见原因包括该可用区CVM实例类型售罄、该可用区CBS云盘售罄、该可用区配额不足、该子网IP不足等。
如果 Zones/SubnetIds 中可用区或者子网不存在，则无论 ZonesCheckPolicy 采用何种取值，都会校验报错。
     * @param ZonesCheckPolicy 可用区校验策略，取值包括 ALL 和 ANY，默认取值为ANY。在伸缩组实际变更资源相关字段时（启动配置、可用区、子网）发挥作用。
<br><li> ALL，所有可用区（Zone）或子网（SubnetId）都可用则通过校验，否则校验报错。
<br><li> ANY，存在任何一个可用区（Zone）或子网（SubnetId）可用则通过校验，否则校验报错。

可用区或子网不可用的常见原因包括该可用区CVM实例类型售罄、该可用区CBS云盘售罄、该可用区配额不足、该子网IP不足等。
如果 Zones/SubnetIds 中可用区或者子网不存在，则无论 ZonesCheckPolicy 采用何种取值，都会校验报错。
     */
    public void setZonesCheckPolicy(String ZonesCheckPolicy) {
        this.ZonesCheckPolicy = ZonesCheckPolicy;
    }

    /**
     * 获取服务设置，包括云监控不健康替换等服务设置。
     * @return ServiceSettings 服务设置，包括云监控不健康替换等服务设置。
     */
    public ServiceSettings getServiceSettings() {
        return this.ServiceSettings;
    }

    /**
     * 设置服务设置，包括云监控不健康替换等服务设置。
     * @param ServiceSettings 服务设置，包括云监控不健康替换等服务设置。
     */
    public void setServiceSettings(ServiceSettings ServiceSettings) {
        this.ServiceSettings = ServiceSettings;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamSimple(map, prefix + "AutoScalingGroupName", this.AutoScalingGroupName);
        this.setParamSimple(map, prefix + "DefaultCooldown", this.DefaultCooldown);
        this.setParamSimple(map, prefix + "DesiredCapacity", this.DesiredCapacity);
        this.setParamSimple(map, prefix + "LaunchConfigurationId", this.LaunchConfigurationId);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);
        this.setParamSimple(map, prefix + "MinSize", this.MinSize);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamArraySimple(map, prefix + "TerminationPolicies.", this.TerminationPolicies);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamSimple(map, prefix + "RetryPolicy", this.RetryPolicy);
        this.setParamSimple(map, prefix + "ZonesCheckPolicy", this.ZonesCheckPolicy);
        this.setParamObj(map, prefix + "ServiceSettings.", this.ServiceSettings);

    }
}

