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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Instance extends AbstractModel {

    /**
    * 实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 套餐 ID。
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * 镜像 ID。
    */
    @SerializedName("BlueprintId")
    @Expose
    private String BlueprintId;

    /**
    * 实例的 CPU 核数，单位：核。
    */
    @SerializedName("CPU")
    @Expose
    private Long CPU;

    /**
    * 实例内存容量，单位：GB 。
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 实例名称。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例计费模式。取值范围： 
PREPAID：表示预付费，即包年包月。
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * 实例系统盘信息。
    */
    @SerializedName("SystemDisk")
    @Expose
    private SystemDisk SystemDisk;

    /**
    * 实例主网卡的内网 IP。 
注意：此字段可能返回 空，表示取不到有效值。
    */
    @SerializedName("PrivateAddresses")
    @Expose
    private String [] PrivateAddresses;

    /**
    * 实例主网卡的公网 IP。 
注意：此字段可能返回 空，表示取不到有效值。
    */
    @SerializedName("PublicAddresses")
    @Expose
    private String [] PublicAddresses;

    /**
    * 实例带宽信息。
    */
    @SerializedName("InternetAccessible")
    @Expose
    private InternetAccessible InternetAccessible;

    /**
    * 自动续费标识。取值范围： 
NOTIFY_AND_MANUAL_RENEW：表示通知即将过期，但不自动续费  
NOTIFY_AND_AUTO_RENEW：表示通知即将过期，而且自动续费 。
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * 实例登录设置。
    */
    @SerializedName("LoginSettings")
    @Expose
    private LoginSettings LoginSettings;

    /**
    * 实例状态。取值范围： 
<li>PENDING：表示创建中</li><li>LAUNCH_FAILED：表示创建失败</li><li>RUNNING：表示运行中</li><li>STOPPED：表示关机</li><li>STARTING：表示开机中</li><li>STOPPING：表示关机中</li><li>REBOOTING：表示重启中</li><li>SHUTDOWN：表示停止待销毁</li><li>TERMINATING：表示销毁中</li><li>DELETING：表示删除中</li><li>FREEZING：表示冻结中</li><li>ENTER_RESCUE_MODE：表示进入救援模式中</li><li>RESCUE_MODE：表示救援模式</li><li>EXIT_RESCUE_MODE：表示退出救援模式中</li>
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
    * 实例全局唯一 ID。
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 实例的最新操作。例：StopInstances、ResetInstance。注意：此字段可能返回 空值，表示取不到有效值。
    */
    @SerializedName("LatestOperation")
    @Expose
    private String LatestOperation;

    /**
    * 实例的最新操作状态。取值范围： 
SUCCESS：表示操作成功 
OPERATING：表示操作执行中 
FAILED：表示操作失败 
注意：此字段可能返回 空值，表示取不到有效值。
    */
    @SerializedName("LatestOperationState")
    @Expose
    private String LatestOperationState;

    /**
    * 实例最新操作的唯一请求 ID。 
注意：此字段可能返回 空值，表示取不到有效值。
    */
    @SerializedName("LatestOperationRequestId")
    @Expose
    private String LatestOperationRequestId;

    /**
    * 实例最新操作的开始时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestOperationStartedTime")
    @Expose
    private String LatestOperationStartedTime;

    /**
    * 隔离时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsolatedTime")
    @Expose
    private String IsolatedTime;

    /**
    * 创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 到期时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ 。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
    * 操作系统平台类型，如 LINUX_UNIX、WINDOWS。
    */
    @SerializedName("PlatformType")
    @Expose
    private String PlatformType;

    /**
    * 操作系统平台。
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 操作系统名称。
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * 可用区。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 实例绑定的标签列表。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 实例封禁状态。取值范围：
<li>NORMAL实例正常。</li><li>NETWORK_RESTRICT：网络封禁。</li>
    */
    @SerializedName("InstanceRestrictState")
    @Expose
    private String InstanceRestrictState;

    /**
    * 创建实例后自动执行TAT命令的调用ID。
    */
    @SerializedName("InitInvocationId")
    @Expose
    private String InitInvocationId;

    /**
    * 实例违规详情。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceViolationDetail")
    @Expose
    private InstanceViolationDetail InstanceViolationDetail;

    /**
     * Get 实例 ID。 
     * @return InstanceId 实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID。
     * @param InstanceId 实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 套餐 ID。 
     * @return BundleId 套餐 ID。
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set 套餐 ID。
     * @param BundleId 套餐 ID。
     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    /**
     * Get 镜像 ID。 
     * @return BlueprintId 镜像 ID。
     */
    public String getBlueprintId() {
        return this.BlueprintId;
    }

    /**
     * Set 镜像 ID。
     * @param BlueprintId 镜像 ID。
     */
    public void setBlueprintId(String BlueprintId) {
        this.BlueprintId = BlueprintId;
    }

    /**
     * Get 实例的 CPU 核数，单位：核。 
     * @return CPU 实例的 CPU 核数，单位：核。
     */
    public Long getCPU() {
        return this.CPU;
    }

    /**
     * Set 实例的 CPU 核数，单位：核。
     * @param CPU 实例的 CPU 核数，单位：核。
     */
    public void setCPU(Long CPU) {
        this.CPU = CPU;
    }

    /**
     * Get 实例内存容量，单位：GB 。 
     * @return Memory 实例内存容量，单位：GB 。
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 实例内存容量，单位：GB 。
     * @param Memory 实例内存容量，单位：GB 。
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 实例名称。 
     * @return InstanceName 实例名称。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称。
     * @param InstanceName 实例名称。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例计费模式。取值范围： 
PREPAID：表示预付费，即包年包月。 
     * @return InstanceChargeType 实例计费模式。取值范围： 
PREPAID：表示预付费，即包年包月。
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set 实例计费模式。取值范围： 
PREPAID：表示预付费，即包年包月。
     * @param InstanceChargeType 实例计费模式。取值范围： 
PREPAID：表示预付费，即包年包月。
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get 实例系统盘信息。 
     * @return SystemDisk 实例系统盘信息。
     */
    public SystemDisk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set 实例系统盘信息。
     * @param SystemDisk 实例系统盘信息。
     */
    public void setSystemDisk(SystemDisk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get 实例主网卡的内网 IP。 
注意：此字段可能返回 空，表示取不到有效值。 
     * @return PrivateAddresses 实例主网卡的内网 IP。 
注意：此字段可能返回 空，表示取不到有效值。
     */
    public String [] getPrivateAddresses() {
        return this.PrivateAddresses;
    }

    /**
     * Set 实例主网卡的内网 IP。 
注意：此字段可能返回 空，表示取不到有效值。
     * @param PrivateAddresses 实例主网卡的内网 IP。 
注意：此字段可能返回 空，表示取不到有效值。
     */
    public void setPrivateAddresses(String [] PrivateAddresses) {
        this.PrivateAddresses = PrivateAddresses;
    }

    /**
     * Get 实例主网卡的公网 IP。 
注意：此字段可能返回 空，表示取不到有效值。 
     * @return PublicAddresses 实例主网卡的公网 IP。 
注意：此字段可能返回 空，表示取不到有效值。
     */
    public String [] getPublicAddresses() {
        return this.PublicAddresses;
    }

    /**
     * Set 实例主网卡的公网 IP。 
注意：此字段可能返回 空，表示取不到有效值。
     * @param PublicAddresses 实例主网卡的公网 IP。 
注意：此字段可能返回 空，表示取不到有效值。
     */
    public void setPublicAddresses(String [] PublicAddresses) {
        this.PublicAddresses = PublicAddresses;
    }

    /**
     * Get 实例带宽信息。 
     * @return InternetAccessible 实例带宽信息。
     */
    public InternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * Set 实例带宽信息。
     * @param InternetAccessible 实例带宽信息。
     */
    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     * Get 自动续费标识。取值范围： 
NOTIFY_AND_MANUAL_RENEW：表示通知即将过期，但不自动续费  
NOTIFY_AND_AUTO_RENEW：表示通知即将过期，而且自动续费 。 
     * @return RenewFlag 自动续费标识。取值范围： 
NOTIFY_AND_MANUAL_RENEW：表示通知即将过期，但不自动续费  
NOTIFY_AND_AUTO_RENEW：表示通知即将过期，而且自动续费 。
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 自动续费标识。取值范围： 
NOTIFY_AND_MANUAL_RENEW：表示通知即将过期，但不自动续费  
NOTIFY_AND_AUTO_RENEW：表示通知即将过期，而且自动续费 。
     * @param RenewFlag 自动续费标识。取值范围： 
NOTIFY_AND_MANUAL_RENEW：表示通知即将过期，但不自动续费  
NOTIFY_AND_AUTO_RENEW：表示通知即将过期，而且自动续费 。
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 实例登录设置。 
     * @return LoginSettings 实例登录设置。
     */
    public LoginSettings getLoginSettings() {
        return this.LoginSettings;
    }

    /**
     * Set 实例登录设置。
     * @param LoginSettings 实例登录设置。
     */
    public void setLoginSettings(LoginSettings LoginSettings) {
        this.LoginSettings = LoginSettings;
    }

    /**
     * Get 实例状态。取值范围： 
<li>PENDING：表示创建中</li><li>LAUNCH_FAILED：表示创建失败</li><li>RUNNING：表示运行中</li><li>STOPPED：表示关机</li><li>STARTING：表示开机中</li><li>STOPPING：表示关机中</li><li>REBOOTING：表示重启中</li><li>SHUTDOWN：表示停止待销毁</li><li>TERMINATING：表示销毁中</li><li>DELETING：表示删除中</li><li>FREEZING：表示冻结中</li><li>ENTER_RESCUE_MODE：表示进入救援模式中</li><li>RESCUE_MODE：表示救援模式</li><li>EXIT_RESCUE_MODE：表示退出救援模式中</li> 
     * @return InstanceState 实例状态。取值范围： 
<li>PENDING：表示创建中</li><li>LAUNCH_FAILED：表示创建失败</li><li>RUNNING：表示运行中</li><li>STOPPED：表示关机</li><li>STARTING：表示开机中</li><li>STOPPING：表示关机中</li><li>REBOOTING：表示重启中</li><li>SHUTDOWN：表示停止待销毁</li><li>TERMINATING：表示销毁中</li><li>DELETING：表示删除中</li><li>FREEZING：表示冻结中</li><li>ENTER_RESCUE_MODE：表示进入救援模式中</li><li>RESCUE_MODE：表示救援模式</li><li>EXIT_RESCUE_MODE：表示退出救援模式中</li>
     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set 实例状态。取值范围： 
<li>PENDING：表示创建中</li><li>LAUNCH_FAILED：表示创建失败</li><li>RUNNING：表示运行中</li><li>STOPPED：表示关机</li><li>STARTING：表示开机中</li><li>STOPPING：表示关机中</li><li>REBOOTING：表示重启中</li><li>SHUTDOWN：表示停止待销毁</li><li>TERMINATING：表示销毁中</li><li>DELETING：表示删除中</li><li>FREEZING：表示冻结中</li><li>ENTER_RESCUE_MODE：表示进入救援模式中</li><li>RESCUE_MODE：表示救援模式</li><li>EXIT_RESCUE_MODE：表示退出救援模式中</li>
     * @param InstanceState 实例状态。取值范围： 
<li>PENDING：表示创建中</li><li>LAUNCH_FAILED：表示创建失败</li><li>RUNNING：表示运行中</li><li>STOPPED：表示关机</li><li>STARTING：表示开机中</li><li>STOPPING：表示关机中</li><li>REBOOTING：表示重启中</li><li>SHUTDOWN：表示停止待销毁</li><li>TERMINATING：表示销毁中</li><li>DELETING：表示删除中</li><li>FREEZING：表示冻结中</li><li>ENTER_RESCUE_MODE：表示进入救援模式中</li><li>RESCUE_MODE：表示救援模式</li><li>EXIT_RESCUE_MODE：表示退出救援模式中</li>
     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    /**
     * Get 实例全局唯一 ID。 
     * @return Uuid 实例全局唯一 ID。
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 实例全局唯一 ID。
     * @param Uuid 实例全局唯一 ID。
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 实例的最新操作。例：StopInstances、ResetInstance。注意：此字段可能返回 空值，表示取不到有效值。 
     * @return LatestOperation 实例的最新操作。例：StopInstances、ResetInstance。注意：此字段可能返回 空值，表示取不到有效值。
     */
    public String getLatestOperation() {
        return this.LatestOperation;
    }

    /**
     * Set 实例的最新操作。例：StopInstances、ResetInstance。注意：此字段可能返回 空值，表示取不到有效值。
     * @param LatestOperation 实例的最新操作。例：StopInstances、ResetInstance。注意：此字段可能返回 空值，表示取不到有效值。
     */
    public void setLatestOperation(String LatestOperation) {
        this.LatestOperation = LatestOperation;
    }

    /**
     * Get 实例的最新操作状态。取值范围： 
SUCCESS：表示操作成功 
OPERATING：表示操作执行中 
FAILED：表示操作失败 
注意：此字段可能返回 空值，表示取不到有效值。 
     * @return LatestOperationState 实例的最新操作状态。取值范围： 
SUCCESS：表示操作成功 
OPERATING：表示操作执行中 
FAILED：表示操作失败 
注意：此字段可能返回 空值，表示取不到有效值。
     */
    public String getLatestOperationState() {
        return this.LatestOperationState;
    }

    /**
     * Set 实例的最新操作状态。取值范围： 
SUCCESS：表示操作成功 
OPERATING：表示操作执行中 
FAILED：表示操作失败 
注意：此字段可能返回 空值，表示取不到有效值。
     * @param LatestOperationState 实例的最新操作状态。取值范围： 
SUCCESS：表示操作成功 
OPERATING：表示操作执行中 
FAILED：表示操作失败 
注意：此字段可能返回 空值，表示取不到有效值。
     */
    public void setLatestOperationState(String LatestOperationState) {
        this.LatestOperationState = LatestOperationState;
    }

    /**
     * Get 实例最新操作的唯一请求 ID。 
注意：此字段可能返回 空值，表示取不到有效值。 
     * @return LatestOperationRequestId 实例最新操作的唯一请求 ID。 
注意：此字段可能返回 空值，表示取不到有效值。
     */
    public String getLatestOperationRequestId() {
        return this.LatestOperationRequestId;
    }

    /**
     * Set 实例最新操作的唯一请求 ID。 
注意：此字段可能返回 空值，表示取不到有效值。
     * @param LatestOperationRequestId 实例最新操作的唯一请求 ID。 
注意：此字段可能返回 空值，表示取不到有效值。
     */
    public void setLatestOperationRequestId(String LatestOperationRequestId) {
        this.LatestOperationRequestId = LatestOperationRequestId;
    }

    /**
     * Get 实例最新操作的开始时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestOperationStartedTime 实例最新操作的开始时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestOperationStartedTime() {
        return this.LatestOperationStartedTime;
    }

    /**
     * Set 实例最新操作的开始时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestOperationStartedTime 实例最新操作的开始时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestOperationStartedTime(String LatestOperationStartedTime) {
        this.LatestOperationStartedTime = LatestOperationStartedTime;
    }

    /**
     * Get 隔离时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsolatedTime 隔离时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsolatedTime() {
        return this.IsolatedTime;
    }

    /**
     * Set 隔离时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsolatedTime 隔离时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsolatedTime(String IsolatedTime) {
        this.IsolatedTime = IsolatedTime;
    }

    /**
     * Get 创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedTime 创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedTime 创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 到期时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ 。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpiredTime 到期时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ 。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set 到期时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ 。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpiredTime 到期时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ 。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get 操作系统平台类型，如 LINUX_UNIX、WINDOWS。 
     * @return PlatformType 操作系统平台类型，如 LINUX_UNIX、WINDOWS。
     */
    public String getPlatformType() {
        return this.PlatformType;
    }

    /**
     * Set 操作系统平台类型，如 LINUX_UNIX、WINDOWS。
     * @param PlatformType 操作系统平台类型，如 LINUX_UNIX、WINDOWS。
     */
    public void setPlatformType(String PlatformType) {
        this.PlatformType = PlatformType;
    }

    /**
     * Get 操作系统平台。 
     * @return Platform 操作系统平台。
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 操作系统平台。
     * @param Platform 操作系统平台。
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 操作系统名称。 
     * @return OsName 操作系统名称。
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set 操作系统名称。
     * @param OsName 操作系统名称。
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get 可用区。 
     * @return Zone 可用区。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区。
     * @param Zone 可用区。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 实例绑定的标签列表。 
     * @return Tags 实例绑定的标签列表。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 实例绑定的标签列表。
     * @param Tags 实例绑定的标签列表。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 实例封禁状态。取值范围：
<li>NORMAL实例正常。</li><li>NETWORK_RESTRICT：网络封禁。</li> 
     * @return InstanceRestrictState 实例封禁状态。取值范围：
<li>NORMAL实例正常。</li><li>NETWORK_RESTRICT：网络封禁。</li>
     */
    public String getInstanceRestrictState() {
        return this.InstanceRestrictState;
    }

    /**
     * Set 实例封禁状态。取值范围：
<li>NORMAL实例正常。</li><li>NETWORK_RESTRICT：网络封禁。</li>
     * @param InstanceRestrictState 实例封禁状态。取值范围：
<li>NORMAL实例正常。</li><li>NETWORK_RESTRICT：网络封禁。</li>
     */
    public void setInstanceRestrictState(String InstanceRestrictState) {
        this.InstanceRestrictState = InstanceRestrictState;
    }

    /**
     * Get 创建实例后自动执行TAT命令的调用ID。 
     * @return InitInvocationId 创建实例后自动执行TAT命令的调用ID。
     */
    public String getInitInvocationId() {
        return this.InitInvocationId;
    }

    /**
     * Set 创建实例后自动执行TAT命令的调用ID。
     * @param InitInvocationId 创建实例后自动执行TAT命令的调用ID。
     */
    public void setInitInvocationId(String InitInvocationId) {
        this.InitInvocationId = InitInvocationId;
    }

    /**
     * Get 实例违规详情。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceViolationDetail 实例违规详情。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceViolationDetail getInstanceViolationDetail() {
        return this.InstanceViolationDetail;
    }

    /**
     * Set 实例违规详情。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceViolationDetail 实例违规详情。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceViolationDetail(InstanceViolationDetail InstanceViolationDetail) {
        this.InstanceViolationDetail = InstanceViolationDetail;
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
        if (source.BundleId != null) {
            this.BundleId = new String(source.BundleId);
        }
        if (source.BlueprintId != null) {
            this.BlueprintId = new String(source.BlueprintId);
        }
        if (source.CPU != null) {
            this.CPU = new Long(source.CPU);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.SystemDisk != null) {
            this.SystemDisk = new SystemDisk(source.SystemDisk);
        }
        if (source.PrivateAddresses != null) {
            this.PrivateAddresses = new String[source.PrivateAddresses.length];
            for (int i = 0; i < source.PrivateAddresses.length; i++) {
                this.PrivateAddresses[i] = new String(source.PrivateAddresses[i]);
            }
        }
        if (source.PublicAddresses != null) {
            this.PublicAddresses = new String[source.PublicAddresses.length];
            for (int i = 0; i < source.PublicAddresses.length; i++) {
                this.PublicAddresses[i] = new String(source.PublicAddresses[i]);
            }
        }
        if (source.InternetAccessible != null) {
            this.InternetAccessible = new InternetAccessible(source.InternetAccessible);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
        if (source.LoginSettings != null) {
            this.LoginSettings = new LoginSettings(source.LoginSettings);
        }
        if (source.InstanceState != null) {
            this.InstanceState = new String(source.InstanceState);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.LatestOperation != null) {
            this.LatestOperation = new String(source.LatestOperation);
        }
        if (source.LatestOperationState != null) {
            this.LatestOperationState = new String(source.LatestOperationState);
        }
        if (source.LatestOperationRequestId != null) {
            this.LatestOperationRequestId = new String(source.LatestOperationRequestId);
        }
        if (source.LatestOperationStartedTime != null) {
            this.LatestOperationStartedTime = new String(source.LatestOperationStartedTime);
        }
        if (source.IsolatedTime != null) {
            this.IsolatedTime = new String(source.IsolatedTime);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new String(source.ExpiredTime);
        }
        if (source.PlatformType != null) {
            this.PlatformType = new String(source.PlatformType);
        }
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.OsName != null) {
            this.OsName = new String(source.OsName);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.InstanceRestrictState != null) {
            this.InstanceRestrictState = new String(source.InstanceRestrictState);
        }
        if (source.InitInvocationId != null) {
            this.InitInvocationId = new String(source.InitInvocationId);
        }
        if (source.InstanceViolationDetail != null) {
            this.InstanceViolationDetail = new InstanceViolationDetail(source.InstanceViolationDetail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "BlueprintId", this.BlueprintId);
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamArraySimple(map, prefix + "PrivateAddresses.", this.PrivateAddresses);
        this.setParamArraySimple(map, prefix + "PublicAddresses.", this.PublicAddresses);
        this.setParamObj(map, prefix + "InternetAccessible.", this.InternetAccessible);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamObj(map, prefix + "LoginSettings.", this.LoginSettings);
        this.setParamSimple(map, prefix + "InstanceState", this.InstanceState);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "LatestOperation", this.LatestOperation);
        this.setParamSimple(map, prefix + "LatestOperationState", this.LatestOperationState);
        this.setParamSimple(map, prefix + "LatestOperationRequestId", this.LatestOperationRequestId);
        this.setParamSimple(map, prefix + "LatestOperationStartedTime", this.LatestOperationStartedTime);
        this.setParamSimple(map, prefix + "IsolatedTime", this.IsolatedTime);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "PlatformType", this.PlatformType);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "InstanceRestrictState", this.InstanceRestrictState);
        this.setParamSimple(map, prefix + "InitInvocationId", this.InitInvocationId);
        this.setParamObj(map, prefix + "InstanceViolationDetail.", this.InstanceViolationDetail);

    }
}

