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

public class Instance extends AbstractModel{

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
    * 生命周期状态，取值如下：<br>
<li>IN_SERVICE：运行中
<li>CREATING：创建中
<li>CREATION_FAILED：创建失败
<li>TERMINATING：中止中
<li>TERMINATION_FAILED：中止失败
<li>ATTACHING：绑定中
<li>ATTACH_FAILED：绑定失败
<li>DETACHING：解绑中
<li>DETACH_FAILED：解绑失败
<li>ATTACHING_LB：绑定LB中
<li>DETACHING_LB：解绑LB中
<li>MODIFYING_LB：修改LB中
<li>STARTING：开机中
<li>START_FAILED：开机失败
<li>STOPPING：关机中
<li>STOP_FAILED：关机失败
<li>STOPPED：已关机
<li>IN_LAUNCHING_HOOK：扩容生命周期挂钩中
<li>IN_TERMINATING_HOOK：缩容生命周期挂钩中
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
    private Long VersionNumber;

    /**
    * 伸缩组名称
    */
    @SerializedName("AutoScalingGroupName")
    @Expose
    private String AutoScalingGroupName;

    /**
    * 预热状态，取值如下：
<li>WAITING_ENTER_WARMUP：等待进入预热
<li>NO_NEED_WARMUP：无需预热
<li>IN_WARMUP：预热中
<li>AFTER_WARMUP：完成预热
    */
    @SerializedName("WarmupStatus")
    @Expose
    private String WarmupStatus;

    /**
    * 置放群组id，仅支持指定一个。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DisasterRecoverGroupIds")
    @Expose
    private String [] DisasterRecoverGroupIds;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

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
     * Get 生命周期状态，取值如下：<br>
<li>IN_SERVICE：运行中
<li>CREATING：创建中
<li>CREATION_FAILED：创建失败
<li>TERMINATING：中止中
<li>TERMINATION_FAILED：中止失败
<li>ATTACHING：绑定中
<li>ATTACH_FAILED：绑定失败
<li>DETACHING：解绑中
<li>DETACH_FAILED：解绑失败
<li>ATTACHING_LB：绑定LB中
<li>DETACHING_LB：解绑LB中
<li>MODIFYING_LB：修改LB中
<li>STARTING：开机中
<li>START_FAILED：开机失败
<li>STOPPING：关机中
<li>STOP_FAILED：关机失败
<li>STOPPED：已关机
<li>IN_LAUNCHING_HOOK：扩容生命周期挂钩中
<li>IN_TERMINATING_HOOK：缩容生命周期挂钩中 
     * @return LifeCycleState 生命周期状态，取值如下：<br>
<li>IN_SERVICE：运行中
<li>CREATING：创建中
<li>CREATION_FAILED：创建失败
<li>TERMINATING：中止中
<li>TERMINATION_FAILED：中止失败
<li>ATTACHING：绑定中
<li>ATTACH_FAILED：绑定失败
<li>DETACHING：解绑中
<li>DETACH_FAILED：解绑失败
<li>ATTACHING_LB：绑定LB中
<li>DETACHING_LB：解绑LB中
<li>MODIFYING_LB：修改LB中
<li>STARTING：开机中
<li>START_FAILED：开机失败
<li>STOPPING：关机中
<li>STOP_FAILED：关机失败
<li>STOPPED：已关机
<li>IN_LAUNCHING_HOOK：扩容生命周期挂钩中
<li>IN_TERMINATING_HOOK：缩容生命周期挂钩中
     */
    public String getLifeCycleState() {
        return this.LifeCycleState;
    }

    /**
     * Set 生命周期状态，取值如下：<br>
<li>IN_SERVICE：运行中
<li>CREATING：创建中
<li>CREATION_FAILED：创建失败
<li>TERMINATING：中止中
<li>TERMINATION_FAILED：中止失败
<li>ATTACHING：绑定中
<li>ATTACH_FAILED：绑定失败
<li>DETACHING：解绑中
<li>DETACH_FAILED：解绑失败
<li>ATTACHING_LB：绑定LB中
<li>DETACHING_LB：解绑LB中
<li>MODIFYING_LB：修改LB中
<li>STARTING：开机中
<li>START_FAILED：开机失败
<li>STOPPING：关机中
<li>STOP_FAILED：关机失败
<li>STOPPED：已关机
<li>IN_LAUNCHING_HOOK：扩容生命周期挂钩中
<li>IN_TERMINATING_HOOK：缩容生命周期挂钩中
     * @param LifeCycleState 生命周期状态，取值如下：<br>
<li>IN_SERVICE：运行中
<li>CREATING：创建中
<li>CREATION_FAILED：创建失败
<li>TERMINATING：中止中
<li>TERMINATION_FAILED：中止失败
<li>ATTACHING：绑定中
<li>ATTACH_FAILED：绑定失败
<li>DETACHING：解绑中
<li>DETACH_FAILED：解绑失败
<li>ATTACHING_LB：绑定LB中
<li>DETACHING_LB：解绑LB中
<li>MODIFYING_LB：修改LB中
<li>STARTING：开机中
<li>START_FAILED：开机失败
<li>STOPPING：关机中
<li>STOP_FAILED：关机失败
<li>STOPPED：已关机
<li>IN_LAUNCHING_HOOK：扩容生命周期挂钩中
<li>IN_TERMINATING_HOOK：缩容生命周期挂钩中
     */
    public void setLifeCycleState(String LifeCycleState) {
        this.LifeCycleState = LifeCycleState;
    }

    /**
     * Get 健康状态，取值包括HEALTHY和UNHEALTHY 
     * @return HealthStatus 健康状态，取值包括HEALTHY和UNHEALTHY
     */
    public String getHealthStatus() {
        return this.HealthStatus;
    }

    /**
     * Set 健康状态，取值包括HEALTHY和UNHEALTHY
     * @param HealthStatus 健康状态，取值包括HEALTHY和UNHEALTHY
     */
    public void setHealthStatus(String HealthStatus) {
        this.HealthStatus = HealthStatus;
    }

    /**
     * Get 是否加入缩容保护 
     * @return ProtectedFromScaleIn 是否加入缩容保护
     */
    public Boolean getProtectedFromScaleIn() {
        return this.ProtectedFromScaleIn;
    }

    /**
     * Set 是否加入缩容保护
     * @param ProtectedFromScaleIn 是否加入缩容保护
     */
    public void setProtectedFromScaleIn(Boolean ProtectedFromScaleIn) {
        this.ProtectedFromScaleIn = ProtectedFromScaleIn;
    }

    /**
     * Get 可用区 
     * @return Zone 可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区
     * @param Zone 可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 创建类型，取值包括AUTO_CREATION, MANUAL_ATTACHING。 
     * @return CreationType 创建类型，取值包括AUTO_CREATION, MANUAL_ATTACHING。
     */
    public String getCreationType() {
        return this.CreationType;
    }

    /**
     * Set 创建类型，取值包括AUTO_CREATION, MANUAL_ATTACHING。
     * @param CreationType 创建类型，取值包括AUTO_CREATION, MANUAL_ATTACHING。
     */
    public void setCreationType(String CreationType) {
        this.CreationType = CreationType;
    }

    /**
     * Get 实例加入时间 
     * @return AddTime 实例加入时间
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set 实例加入时间
     * @param AddTime 实例加入时间
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get 实例类型 
     * @return InstanceType 实例类型
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型
     * @param InstanceType 实例类型
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 版本号 
     * @return VersionNumber 版本号
     */
    public Long getVersionNumber() {
        return this.VersionNumber;
    }

    /**
     * Set 版本号
     * @param VersionNumber 版本号
     */
    public void setVersionNumber(Long VersionNumber) {
        this.VersionNumber = VersionNumber;
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
     * Get 预热状态，取值如下：
<li>WAITING_ENTER_WARMUP：等待进入预热
<li>NO_NEED_WARMUP：无需预热
<li>IN_WARMUP：预热中
<li>AFTER_WARMUP：完成预热 
     * @return WarmupStatus 预热状态，取值如下：
<li>WAITING_ENTER_WARMUP：等待进入预热
<li>NO_NEED_WARMUP：无需预热
<li>IN_WARMUP：预热中
<li>AFTER_WARMUP：完成预热
     */
    public String getWarmupStatus() {
        return this.WarmupStatus;
    }

    /**
     * Set 预热状态，取值如下：
<li>WAITING_ENTER_WARMUP：等待进入预热
<li>NO_NEED_WARMUP：无需预热
<li>IN_WARMUP：预热中
<li>AFTER_WARMUP：完成预热
     * @param WarmupStatus 预热状态，取值如下：
<li>WAITING_ENTER_WARMUP：等待进入预热
<li>NO_NEED_WARMUP：无需预热
<li>IN_WARMUP：预热中
<li>AFTER_WARMUP：完成预热
     */
    public void setWarmupStatus(String WarmupStatus) {
        this.WarmupStatus = WarmupStatus;
    }

    /**
     * Get 置放群组id，仅支持指定一个。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DisasterRecoverGroupIds 置放群组id，仅支持指定一个。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDisasterRecoverGroupIds() {
        return this.DisasterRecoverGroupIds;
    }

    /**
     * Set 置放群组id，仅支持指定一个。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DisasterRecoverGroupIds 置放群组id，仅支持指定一个。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisasterRecoverGroupIds(String [] DisasterRecoverGroupIds) {
        this.DisasterRecoverGroupIds = DisasterRecoverGroupIds;
    }

    public Instance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Instance(Instance source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AutoScalingGroupId != null) {
            this.AutoScalingGroupId = new String(source.AutoScalingGroupId);
        }
        if (source.LaunchConfigurationId != null) {
            this.LaunchConfigurationId = new String(source.LaunchConfigurationId);
        }
        if (source.LaunchConfigurationName != null) {
            this.LaunchConfigurationName = new String(source.LaunchConfigurationName);
        }
        if (source.LifeCycleState != null) {
            this.LifeCycleState = new String(source.LifeCycleState);
        }
        if (source.HealthStatus != null) {
            this.HealthStatus = new String(source.HealthStatus);
        }
        if (source.ProtectedFromScaleIn != null) {
            this.ProtectedFromScaleIn = new Boolean(source.ProtectedFromScaleIn);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.CreationType != null) {
            this.CreationType = new String(source.CreationType);
        }
        if (source.AddTime != null) {
            this.AddTime = new String(source.AddTime);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.VersionNumber != null) {
            this.VersionNumber = new Long(source.VersionNumber);
        }
        if (source.AutoScalingGroupName != null) {
            this.AutoScalingGroupName = new String(source.AutoScalingGroupName);
        }
        if (source.WarmupStatus != null) {
            this.WarmupStatus = new String(source.WarmupStatus);
        }
        if (source.DisasterRecoverGroupIds != null) {
            this.DisasterRecoverGroupIds = new String[source.DisasterRecoverGroupIds.length];
            for (int i = 0; i < source.DisasterRecoverGroupIds.length; i++) {
                this.DisasterRecoverGroupIds[i] = new String(source.DisasterRecoverGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
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
        this.setParamSimple(map, prefix + "WarmupStatus", this.WarmupStatus);
        this.setParamArraySimple(map, prefix + "DisasterRecoverGroupIds.", this.DisasterRecoverGroupIds);

    }
}

