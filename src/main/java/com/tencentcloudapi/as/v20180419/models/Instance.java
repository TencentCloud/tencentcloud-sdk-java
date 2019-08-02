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

public class Instance  extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 伸缩组ID
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

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
    * 生命周期状态，取值包括IN_SERVICE, CREATING, TERMINATING, ATTACHING, DETACHING, ATTACHING_LB, DETACHING_LB等
    */
    @SerializedName("LifeCycleState")
    @Expose
    private String LifeCycleState;

    /**
    * 健康状态，取值包括HEALTHY和UNHEALTHY
    */
    @SerializedName("HealthStatus")
    @Expose
    private String HealthStatus;

    /**
    * 是否加入缩容保护
    */
    @SerializedName("ProtectedFromScaleIn")
    @Expose
    private Boolean ProtectedFromScaleIn;

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 创建类型，取值包括AUTO_CREATION, MANUAL_ATTACHING。
    */
    @SerializedName("CreationType")
    @Expose
    private String CreationType;

    /**
    * 实例加入时间
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * 实例类型
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 版本号
    */
    @SerializedName("VersionNumber")
    @Expose
    private Integer VersionNumber;

    /**
    * 伸缩组名称
    */
    @SerializedName("AutoScalingGroupName")
    @Expose
    private String AutoScalingGroupName;

    /**
     * 获取实例ID
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

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
     * 获取启动配置名称
     * @return LaunchConfigurationName 启动配置名称
     */
    public String getLaunchConfigurationName() {
        return this.LaunchConfigurationName;
    }

    /**
     * 设置启动配置名称
     * @param LaunchConfigurationName 启动配置名称
     */
    public void setLaunchConfigurationName(String LaunchConfigurationName) {
        this.LaunchConfigurationName = LaunchConfigurationName;
    }

    /**
     * 获取生命周期状态，取值包括IN_SERVICE, CREATING, TERMINATING, ATTACHING, DETACHING, ATTACHING_LB, DETACHING_LB等
     * @return LifeCycleState 生命周期状态，取值包括IN_SERVICE, CREATING, TERMINATING, ATTACHING, DETACHING, ATTACHING_LB, DETACHING_LB等
     */
    public String getLifeCycleState() {
        return this.LifeCycleState;
    }

    /**
     * 设置生命周期状态，取值包括IN_SERVICE, CREATING, TERMINATING, ATTACHING, DETACHING, ATTACHING_LB, DETACHING_LB等
     * @param LifeCycleState 生命周期状态，取值包括IN_SERVICE, CREATING, TERMINATING, ATTACHING, DETACHING, ATTACHING_LB, DETACHING_LB等
     */
    public void setLifeCycleState(String LifeCycleState) {
        this.LifeCycleState = LifeCycleState;
    }

    /**
     * 获取健康状态，取值包括HEALTHY和UNHEALTHY
     * @return HealthStatus 健康状态，取值包括HEALTHY和UNHEALTHY
     */
    public String getHealthStatus() {
        return this.HealthStatus;
    }

    /**
     * 设置健康状态，取值包括HEALTHY和UNHEALTHY
     * @param HealthStatus 健康状态，取值包括HEALTHY和UNHEALTHY
     */
    public void setHealthStatus(String HealthStatus) {
        this.HealthStatus = HealthStatus;
    }

    /**
     * 获取是否加入缩容保护
     * @return ProtectedFromScaleIn 是否加入缩容保护
     */
    public Boolean getProtectedFromScaleIn() {
        return this.ProtectedFromScaleIn;
    }

    /**
     * 设置是否加入缩容保护
     * @param ProtectedFromScaleIn 是否加入缩容保护
     */
    public void setProtectedFromScaleIn(Boolean ProtectedFromScaleIn) {
        this.ProtectedFromScaleIn = ProtectedFromScaleIn;
    }

    /**
     * 获取可用区
     * @return Zone 可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * 设置可用区
     * @param Zone 可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * 获取创建类型，取值包括AUTO_CREATION, MANUAL_ATTACHING。
     * @return CreationType 创建类型，取值包括AUTO_CREATION, MANUAL_ATTACHING。
     */
    public String getCreationType() {
        return this.CreationType;
    }

    /**
     * 设置创建类型，取值包括AUTO_CREATION, MANUAL_ATTACHING。
     * @param CreationType 创建类型，取值包括AUTO_CREATION, MANUAL_ATTACHING。
     */
    public void setCreationType(String CreationType) {
        this.CreationType = CreationType;
    }

    /**
     * 获取实例加入时间
     * @return AddTime 实例加入时间
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * 设置实例加入时间
     * @param AddTime 实例加入时间
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * 获取实例类型
     * @return InstanceType 实例类型
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * 设置实例类型
     * @param InstanceType 实例类型
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * 获取版本号
     * @return VersionNumber 版本号
     */
    public Integer getVersionNumber() {
        return this.VersionNumber;
    }

    /**
     * 设置版本号
     * @param VersionNumber 版本号
     */
    public void setVersionNumber(Integer VersionNumber) {
        this.VersionNumber = VersionNumber;
    }

    /**
     * 获取伸缩组名称
     * @return AutoScalingGroupName 伸缩组名称
     */
    public String getAutoScalingGroupName() {
        return this.AutoScalingGroupName;
    }

    /**
     * 设置伸缩组名称
     * @param AutoScalingGroupName 伸缩组名称
     */
    public void setAutoScalingGroupName(String AutoScalingGroupName) {
        this.AutoScalingGroupName = AutoScalingGroupName;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamSimple(map, prefix + "LaunchConfigurationId", this.LaunchConfigurationId);
        this.setParamSimple(map, prefix + "LaunchConfigurationName", this.LaunchConfigurationName);
        this.setParamSimple(map, prefix + "LifeCycleState", this.LifeCycleState);
        this.setParamSimple(map, prefix + "HealthStatus", this.HealthStatus);
        this.setParamSimple(map, prefix + "ProtectedFromScaleIn", this.ProtectedFromScaleIn);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "CreationType", this.CreationType);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "VersionNumber", this.VersionNumber);
        this.setParamSimple(map, prefix + "AutoScalingGroupName", this.AutoScalingGroupName);

    }
}

