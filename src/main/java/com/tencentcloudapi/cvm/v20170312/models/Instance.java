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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Instance extends AbstractModel{

    /**
    * 实例所在的位置。
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * 实例`ID`。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例机型。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 实例的CPU核数，单位：核。
    */
    @SerializedName("CPU")
    @Expose
    private Long CPU;

    /**
    * 实例内存容量，单位：`GB`。
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 实例业务状态。取值范围：<br><li>NORMAL：表示正常状态的实例<br><li>EXPIRED：表示过期的实例<br><li>PROTECTIVELY_ISOLATED：表示被安全隔离的实例。
    */
    @SerializedName("RestrictState")
    @Expose
    private String RestrictState;

    /**
    * 实例名称。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例计费模式。取值范围：<br><li>`PREPAID`：表示预付费，即包年包月<br><li>`POSTPAID_BY_HOUR`：表示后付费，即按量计费<br><li>`CDHPAID`：`专用宿主机`付费，即只对`专用宿主机`计费，不对`专用宿主机`上的实例计费。<br><li>`SPOTPAID`：表示竞价实例付费。
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
    * 实例数据盘信息。
    */
    @SerializedName("DataDisks")
    @Expose
    private DataDisk [] DataDisks;

    /**
    * 实例主网卡的内网`IP`列表。
    */
    @SerializedName("PrivateIpAddresses")
    @Expose
    private String [] PrivateIpAddresses;

    /**
    * 实例主网卡的公网`IP`列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicIpAddresses")
    @Expose
    private String [] PublicIpAddresses;

    /**
    * 实例带宽信息。
    */
    @SerializedName("InternetAccessible")
    @Expose
    private InternetAccessible InternetAccessible;

    /**
    * 实例所属虚拟私有网络信息。
    */
    @SerializedName("VirtualPrivateCloud")
    @Expose
    private VirtualPrivateCloud VirtualPrivateCloud;

    /**
    * 生产实例所使用的镜像`ID`。
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 自动续费标识。取值范围：<br><li>`NOTIFY_AND_MANUAL_RENEW`：表示通知即将过期，但不自动续费<br><li>`NOTIFY_AND_AUTO_RENEW`：表示通知即将过期，而且自动续费<br><li>`DISABLE_NOTIFY_AND_MANUAL_RENEW`：表示不通知即将过期，也不自动续费。
<br><li>注意：后付费模式本项为null
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * 创建时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-DDThh:mm:ssZ`。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 到期时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-DDThh:mm:ssZ`。注意：后付费模式本项为null
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
    * 操作系统名称。
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * 实例所属安全组。该参数可以通过调用 [DescribeSecurityGroups](https://cloud.tencent.com/document/api/215/15808) 的返回值中的sgId字段来获取。
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * 实例登录设置。目前只返回实例所关联的密钥。
    */
    @SerializedName("LoginSettings")
    @Expose
    private LoginSettings LoginSettings;

    /**
    * 实例状态。取值范围：<br><li>PENDING：表示创建中<br></li><li>LAUNCH_FAILED：表示创建失败<br></li><li>RUNNING：表示运行中<br></li><li>STOPPED：表示关机<br></li><li>STARTING：表示开机中<br></li><li>STOPPING：表示关机中<br></li><li>REBOOTING：表示重启中<br></li><li>SHUTDOWN：表示停止待销毁<br></li><li>TERMINATING：表示销毁中。<br></li>
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
    * 实例关联的标签列表。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 实例的关机计费模式。
取值范围：<br><li>KEEP_CHARGING：关机继续收费<br><li>STOP_CHARGING：关机停止收费<li>NOT_APPLICABLE：实例处于非关机状态或者不适用关机停止计费的条件<br>
    */
    @SerializedName("StopChargingMode")
    @Expose
    private String StopChargingMode;

    /**
    * 实例全局唯一ID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 实例的最新操作。例：StopInstances、ResetInstance。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestOperation")
    @Expose
    private String LatestOperation;

    /**
    * 实例的最新操作状态。取值范围：<br><li>SUCCESS：表示操作成功<br><li>OPERATING：表示操作执行中<br><li>FAILED：表示操作失败
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestOperationState")
    @Expose
    private String LatestOperationState;

    /**
    * 实例最新操作的唯一请求 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestOperationRequestId")
    @Expose
    private String LatestOperationRequestId;

    /**
    * 分散置放群组ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DisasterRecoverGroupId")
    @Expose
    private String DisasterRecoverGroupId;

    /**
    * 实例的IPv6地址。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IPv6Addresses")
    @Expose
    private String [] IPv6Addresses;

    /**
    * CAM角色名。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CamRoleName")
    @Expose
    private String CamRoleName;

    /**
    * 高性能计算集群`ID`。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HpcClusterId")
    @Expose
    private String HpcClusterId;

    /**
    * 高性能计算集群`IP`列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RdmaIpAddresses")
    @Expose
    private String [] RdmaIpAddresses;

    /**
    * 实例隔离类型。取值范围：<br><li>ARREAR：表示欠费隔离<br></li><li>EXPIRE：表示到期隔离<br></li><li>MANMADE：表示主动退还隔离<br></li><li>NOTISOLATED：表示未隔离<br></li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsolatedSource")
    @Expose
    private String IsolatedSource;

    /**
    * GPU信息。如果是gpu类型子机，该值会返回GPU信息，如果是其他类型子机则不返回。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GPUInfo")
    @Expose
    private GPUInfo GPUInfo;

    /**
    * 实例的操作系统许可类型，默认为TencentCloud
    */
    @SerializedName("LicenseType")
    @Expose
    private String LicenseType;

    /**
     * Get 实例所在的位置。 
     * @return Placement 实例所在的位置。
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set 实例所在的位置。
     * @param Placement 实例所在的位置。
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get 实例`ID`。 
     * @return InstanceId 实例`ID`。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例`ID`。
     * @param InstanceId 实例`ID`。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例机型。 
     * @return InstanceType 实例机型。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例机型。
     * @param InstanceType 实例机型。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 实例的CPU核数，单位：核。 
     * @return CPU 实例的CPU核数，单位：核。
     */
    public Long getCPU() {
        return this.CPU;
    }

    /**
     * Set 实例的CPU核数，单位：核。
     * @param CPU 实例的CPU核数，单位：核。
     */
    public void setCPU(Long CPU) {
        this.CPU = CPU;
    }

    /**
     * Get 实例内存容量，单位：`GB`。 
     * @return Memory 实例内存容量，单位：`GB`。
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 实例内存容量，单位：`GB`。
     * @param Memory 实例内存容量，单位：`GB`。
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 实例业务状态。取值范围：<br><li>NORMAL：表示正常状态的实例<br><li>EXPIRED：表示过期的实例<br><li>PROTECTIVELY_ISOLATED：表示被安全隔离的实例。 
     * @return RestrictState 实例业务状态。取值范围：<br><li>NORMAL：表示正常状态的实例<br><li>EXPIRED：表示过期的实例<br><li>PROTECTIVELY_ISOLATED：表示被安全隔离的实例。
     */
    public String getRestrictState() {
        return this.RestrictState;
    }

    /**
     * Set 实例业务状态。取值范围：<br><li>NORMAL：表示正常状态的实例<br><li>EXPIRED：表示过期的实例<br><li>PROTECTIVELY_ISOLATED：表示被安全隔离的实例。
     * @param RestrictState 实例业务状态。取值范围：<br><li>NORMAL：表示正常状态的实例<br><li>EXPIRED：表示过期的实例<br><li>PROTECTIVELY_ISOLATED：表示被安全隔离的实例。
     */
    public void setRestrictState(String RestrictState) {
        this.RestrictState = RestrictState;
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
     * Get 实例计费模式。取值范围：<br><li>`PREPAID`：表示预付费，即包年包月<br><li>`POSTPAID_BY_HOUR`：表示后付费，即按量计费<br><li>`CDHPAID`：`专用宿主机`付费，即只对`专用宿主机`计费，不对`专用宿主机`上的实例计费。<br><li>`SPOTPAID`：表示竞价实例付费。 
     * @return InstanceChargeType 实例计费模式。取值范围：<br><li>`PREPAID`：表示预付费，即包年包月<br><li>`POSTPAID_BY_HOUR`：表示后付费，即按量计费<br><li>`CDHPAID`：`专用宿主机`付费，即只对`专用宿主机`计费，不对`专用宿主机`上的实例计费。<br><li>`SPOTPAID`：表示竞价实例付费。
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set 实例计费模式。取值范围：<br><li>`PREPAID`：表示预付费，即包年包月<br><li>`POSTPAID_BY_HOUR`：表示后付费，即按量计费<br><li>`CDHPAID`：`专用宿主机`付费，即只对`专用宿主机`计费，不对`专用宿主机`上的实例计费。<br><li>`SPOTPAID`：表示竞价实例付费。
     * @param InstanceChargeType 实例计费模式。取值范围：<br><li>`PREPAID`：表示预付费，即包年包月<br><li>`POSTPAID_BY_HOUR`：表示后付费，即按量计费<br><li>`CDHPAID`：`专用宿主机`付费，即只对`专用宿主机`计费，不对`专用宿主机`上的实例计费。<br><li>`SPOTPAID`：表示竞价实例付费。
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
     * Get 实例数据盘信息。 
     * @return DataDisks 实例数据盘信息。
     */
    public DataDisk [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * Set 实例数据盘信息。
     * @param DataDisks 实例数据盘信息。
     */
    public void setDataDisks(DataDisk [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    /**
     * Get 实例主网卡的内网`IP`列表。 
     * @return PrivateIpAddresses 实例主网卡的内网`IP`列表。
     */
    public String [] getPrivateIpAddresses() {
        return this.PrivateIpAddresses;
    }

    /**
     * Set 实例主网卡的内网`IP`列表。
     * @param PrivateIpAddresses 实例主网卡的内网`IP`列表。
     */
    public void setPrivateIpAddresses(String [] PrivateIpAddresses) {
        this.PrivateIpAddresses = PrivateIpAddresses;
    }

    /**
     * Get 实例主网卡的公网`IP`列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicIpAddresses 实例主网卡的公网`IP`列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getPublicIpAddresses() {
        return this.PublicIpAddresses;
    }

    /**
     * Set 实例主网卡的公网`IP`列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicIpAddresses 实例主网卡的公网`IP`列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicIpAddresses(String [] PublicIpAddresses) {
        this.PublicIpAddresses = PublicIpAddresses;
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
     * Get 实例所属虚拟私有网络信息。 
     * @return VirtualPrivateCloud 实例所属虚拟私有网络信息。
     */
    public VirtualPrivateCloud getVirtualPrivateCloud() {
        return this.VirtualPrivateCloud;
    }

    /**
     * Set 实例所属虚拟私有网络信息。
     * @param VirtualPrivateCloud 实例所属虚拟私有网络信息。
     */
    public void setVirtualPrivateCloud(VirtualPrivateCloud VirtualPrivateCloud) {
        this.VirtualPrivateCloud = VirtualPrivateCloud;
    }

    /**
     * Get 生产实例所使用的镜像`ID`。 
     * @return ImageId 生产实例所使用的镜像`ID`。
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 生产实例所使用的镜像`ID`。
     * @param ImageId 生产实例所使用的镜像`ID`。
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 自动续费标识。取值范围：<br><li>`NOTIFY_AND_MANUAL_RENEW`：表示通知即将过期，但不自动续费<br><li>`NOTIFY_AND_AUTO_RENEW`：表示通知即将过期，而且自动续费<br><li>`DISABLE_NOTIFY_AND_MANUAL_RENEW`：表示不通知即将过期，也不自动续费。
<br><li>注意：后付费模式本项为null 
     * @return RenewFlag 自动续费标识。取值范围：<br><li>`NOTIFY_AND_MANUAL_RENEW`：表示通知即将过期，但不自动续费<br><li>`NOTIFY_AND_AUTO_RENEW`：表示通知即将过期，而且自动续费<br><li>`DISABLE_NOTIFY_AND_MANUAL_RENEW`：表示不通知即将过期，也不自动续费。
<br><li>注意：后付费模式本项为null
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 自动续费标识。取值范围：<br><li>`NOTIFY_AND_MANUAL_RENEW`：表示通知即将过期，但不自动续费<br><li>`NOTIFY_AND_AUTO_RENEW`：表示通知即将过期，而且自动续费<br><li>`DISABLE_NOTIFY_AND_MANUAL_RENEW`：表示不通知即将过期，也不自动续费。
<br><li>注意：后付费模式本项为null
     * @param RenewFlag 自动续费标识。取值范围：<br><li>`NOTIFY_AND_MANUAL_RENEW`：表示通知即将过期，但不自动续费<br><li>`NOTIFY_AND_AUTO_RENEW`：表示通知即将过期，而且自动续费<br><li>`DISABLE_NOTIFY_AND_MANUAL_RENEW`：表示不通知即将过期，也不自动续费。
<br><li>注意：后付费模式本项为null
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 创建时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-DDThh:mm:ssZ`。 
     * @return CreatedTime 创建时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-DDThh:mm:ssZ`。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-DDThh:mm:ssZ`。
     * @param CreatedTime 创建时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-DDThh:mm:ssZ`。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 到期时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-DDThh:mm:ssZ`。注意：后付费模式本项为null 
     * @return ExpiredTime 到期时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-DDThh:mm:ssZ`。注意：后付费模式本项为null
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set 到期时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-DDThh:mm:ssZ`。注意：后付费模式本项为null
     * @param ExpiredTime 到期时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-DDThh:mm:ssZ`。注意：后付费模式本项为null
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
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
     * Get 实例所属安全组。该参数可以通过调用 [DescribeSecurityGroups](https://cloud.tencent.com/document/api/215/15808) 的返回值中的sgId字段来获取。 
     * @return SecurityGroupIds 实例所属安全组。该参数可以通过调用 [DescribeSecurityGroups](https://cloud.tencent.com/document/api/215/15808) 的返回值中的sgId字段来获取。
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set 实例所属安全组。该参数可以通过调用 [DescribeSecurityGroups](https://cloud.tencent.com/document/api/215/15808) 的返回值中的sgId字段来获取。
     * @param SecurityGroupIds 实例所属安全组。该参数可以通过调用 [DescribeSecurityGroups](https://cloud.tencent.com/document/api/215/15808) 的返回值中的sgId字段来获取。
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get 实例登录设置。目前只返回实例所关联的密钥。 
     * @return LoginSettings 实例登录设置。目前只返回实例所关联的密钥。
     */
    public LoginSettings getLoginSettings() {
        return this.LoginSettings;
    }

    /**
     * Set 实例登录设置。目前只返回实例所关联的密钥。
     * @param LoginSettings 实例登录设置。目前只返回实例所关联的密钥。
     */
    public void setLoginSettings(LoginSettings LoginSettings) {
        this.LoginSettings = LoginSettings;
    }

    /**
     * Get 实例状态。取值范围：<br><li>PENDING：表示创建中<br></li><li>LAUNCH_FAILED：表示创建失败<br></li><li>RUNNING：表示运行中<br></li><li>STOPPED：表示关机<br></li><li>STARTING：表示开机中<br></li><li>STOPPING：表示关机中<br></li><li>REBOOTING：表示重启中<br></li><li>SHUTDOWN：表示停止待销毁<br></li><li>TERMINATING：表示销毁中。<br></li> 
     * @return InstanceState 实例状态。取值范围：<br><li>PENDING：表示创建中<br></li><li>LAUNCH_FAILED：表示创建失败<br></li><li>RUNNING：表示运行中<br></li><li>STOPPED：表示关机<br></li><li>STARTING：表示开机中<br></li><li>STOPPING：表示关机中<br></li><li>REBOOTING：表示重启中<br></li><li>SHUTDOWN：表示停止待销毁<br></li><li>TERMINATING：表示销毁中。<br></li>
     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set 实例状态。取值范围：<br><li>PENDING：表示创建中<br></li><li>LAUNCH_FAILED：表示创建失败<br></li><li>RUNNING：表示运行中<br></li><li>STOPPED：表示关机<br></li><li>STARTING：表示开机中<br></li><li>STOPPING：表示关机中<br></li><li>REBOOTING：表示重启中<br></li><li>SHUTDOWN：表示停止待销毁<br></li><li>TERMINATING：表示销毁中。<br></li>
     * @param InstanceState 实例状态。取值范围：<br><li>PENDING：表示创建中<br></li><li>LAUNCH_FAILED：表示创建失败<br></li><li>RUNNING：表示运行中<br></li><li>STOPPED：表示关机<br></li><li>STARTING：表示开机中<br></li><li>STOPPING：表示关机中<br></li><li>REBOOTING：表示重启中<br></li><li>SHUTDOWN：表示停止待销毁<br></li><li>TERMINATING：表示销毁中。<br></li>
     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    /**
     * Get 实例关联的标签列表。 
     * @return Tags 实例关联的标签列表。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 实例关联的标签列表。
     * @param Tags 实例关联的标签列表。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 实例的关机计费模式。
取值范围：<br><li>KEEP_CHARGING：关机继续收费<br><li>STOP_CHARGING：关机停止收费<li>NOT_APPLICABLE：实例处于非关机状态或者不适用关机停止计费的条件<br> 
     * @return StopChargingMode 实例的关机计费模式。
取值范围：<br><li>KEEP_CHARGING：关机继续收费<br><li>STOP_CHARGING：关机停止收费<li>NOT_APPLICABLE：实例处于非关机状态或者不适用关机停止计费的条件<br>
     */
    public String getStopChargingMode() {
        return this.StopChargingMode;
    }

    /**
     * Set 实例的关机计费模式。
取值范围：<br><li>KEEP_CHARGING：关机继续收费<br><li>STOP_CHARGING：关机停止收费<li>NOT_APPLICABLE：实例处于非关机状态或者不适用关机停止计费的条件<br>
     * @param StopChargingMode 实例的关机计费模式。
取值范围：<br><li>KEEP_CHARGING：关机继续收费<br><li>STOP_CHARGING：关机停止收费<li>NOT_APPLICABLE：实例处于非关机状态或者不适用关机停止计费的条件<br>
     */
    public void setStopChargingMode(String StopChargingMode) {
        this.StopChargingMode = StopChargingMode;
    }

    /**
     * Get 实例全局唯一ID 
     * @return Uuid 实例全局唯一ID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 实例全局唯一ID
     * @param Uuid 实例全局唯一ID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 实例的最新操作。例：StopInstances、ResetInstance。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestOperation 实例的最新操作。例：StopInstances、ResetInstance。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestOperation() {
        return this.LatestOperation;
    }

    /**
     * Set 实例的最新操作。例：StopInstances、ResetInstance。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestOperation 实例的最新操作。例：StopInstances、ResetInstance。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestOperation(String LatestOperation) {
        this.LatestOperation = LatestOperation;
    }

    /**
     * Get 实例的最新操作状态。取值范围：<br><li>SUCCESS：表示操作成功<br><li>OPERATING：表示操作执行中<br><li>FAILED：表示操作失败
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestOperationState 实例的最新操作状态。取值范围：<br><li>SUCCESS：表示操作成功<br><li>OPERATING：表示操作执行中<br><li>FAILED：表示操作失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestOperationState() {
        return this.LatestOperationState;
    }

    /**
     * Set 实例的最新操作状态。取值范围：<br><li>SUCCESS：表示操作成功<br><li>OPERATING：表示操作执行中<br><li>FAILED：表示操作失败
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestOperationState 实例的最新操作状态。取值范围：<br><li>SUCCESS：表示操作成功<br><li>OPERATING：表示操作执行中<br><li>FAILED：表示操作失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestOperationState(String LatestOperationState) {
        this.LatestOperationState = LatestOperationState;
    }

    /**
     * Get 实例最新操作的唯一请求 ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestOperationRequestId 实例最新操作的唯一请求 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestOperationRequestId() {
        return this.LatestOperationRequestId;
    }

    /**
     * Set 实例最新操作的唯一请求 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestOperationRequestId 实例最新操作的唯一请求 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestOperationRequestId(String LatestOperationRequestId) {
        this.LatestOperationRequestId = LatestOperationRequestId;
    }

    /**
     * Get 分散置放群组ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DisasterRecoverGroupId 分散置放群组ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDisasterRecoverGroupId() {
        return this.DisasterRecoverGroupId;
    }

    /**
     * Set 分散置放群组ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DisasterRecoverGroupId 分散置放群组ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisasterRecoverGroupId(String DisasterRecoverGroupId) {
        this.DisasterRecoverGroupId = DisasterRecoverGroupId;
    }

    /**
     * Get 实例的IPv6地址。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IPv6Addresses 实例的IPv6地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getIPv6Addresses() {
        return this.IPv6Addresses;
    }

    /**
     * Set 实例的IPv6地址。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IPv6Addresses 实例的IPv6地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIPv6Addresses(String [] IPv6Addresses) {
        this.IPv6Addresses = IPv6Addresses;
    }

    /**
     * Get CAM角色名。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CamRoleName CAM角色名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCamRoleName() {
        return this.CamRoleName;
    }

    /**
     * Set CAM角色名。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CamRoleName CAM角色名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCamRoleName(String CamRoleName) {
        this.CamRoleName = CamRoleName;
    }

    /**
     * Get 高性能计算集群`ID`。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HpcClusterId 高性能计算集群`ID`。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHpcClusterId() {
        return this.HpcClusterId;
    }

    /**
     * Set 高性能计算集群`ID`。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HpcClusterId 高性能计算集群`ID`。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHpcClusterId(String HpcClusterId) {
        this.HpcClusterId = HpcClusterId;
    }

    /**
     * Get 高性能计算集群`IP`列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RdmaIpAddresses 高性能计算集群`IP`列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getRdmaIpAddresses() {
        return this.RdmaIpAddresses;
    }

    /**
     * Set 高性能计算集群`IP`列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RdmaIpAddresses 高性能计算集群`IP`列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRdmaIpAddresses(String [] RdmaIpAddresses) {
        this.RdmaIpAddresses = RdmaIpAddresses;
    }

    /**
     * Get 实例隔离类型。取值范围：<br><li>ARREAR：表示欠费隔离<br></li><li>EXPIRE：表示到期隔离<br></li><li>MANMADE：表示主动退还隔离<br></li><li>NOTISOLATED：表示未隔离<br></li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsolatedSource 实例隔离类型。取值范围：<br><li>ARREAR：表示欠费隔离<br></li><li>EXPIRE：表示到期隔离<br></li><li>MANMADE：表示主动退还隔离<br></li><li>NOTISOLATED：表示未隔离<br></li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsolatedSource() {
        return this.IsolatedSource;
    }

    /**
     * Set 实例隔离类型。取值范围：<br><li>ARREAR：表示欠费隔离<br></li><li>EXPIRE：表示到期隔离<br></li><li>MANMADE：表示主动退还隔离<br></li><li>NOTISOLATED：表示未隔离<br></li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsolatedSource 实例隔离类型。取值范围：<br><li>ARREAR：表示欠费隔离<br></li><li>EXPIRE：表示到期隔离<br></li><li>MANMADE：表示主动退还隔离<br></li><li>NOTISOLATED：表示未隔离<br></li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsolatedSource(String IsolatedSource) {
        this.IsolatedSource = IsolatedSource;
    }

    /**
     * Get GPU信息。如果是gpu类型子机，该值会返回GPU信息，如果是其他类型子机则不返回。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GPUInfo GPU信息。如果是gpu类型子机，该值会返回GPU信息，如果是其他类型子机则不返回。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GPUInfo getGPUInfo() {
        return this.GPUInfo;
    }

    /**
     * Set GPU信息。如果是gpu类型子机，该值会返回GPU信息，如果是其他类型子机则不返回。
注意：此字段可能返回 null，表示取不到有效值。
     * @param GPUInfo GPU信息。如果是gpu类型子机，该值会返回GPU信息，如果是其他类型子机则不返回。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGPUInfo(GPUInfo GPUInfo) {
        this.GPUInfo = GPUInfo;
    }

    /**
     * Get 实例的操作系统许可类型，默认为TencentCloud 
     * @return LicenseType 实例的操作系统许可类型，默认为TencentCloud
     */
    public String getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set 实例的操作系统许可类型，默认为TencentCloud
     * @param LicenseType 实例的操作系统许可类型，默认为TencentCloud
     */
    public void setLicenseType(String LicenseType) {
        this.LicenseType = LicenseType;
    }

    public Instance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Instance(Instance source) {
        if (source.Placement != null) {
            this.Placement = new Placement(source.Placement);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.CPU != null) {
            this.CPU = new Long(source.CPU);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.RestrictState != null) {
            this.RestrictState = new String(source.RestrictState);
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
        if (source.DataDisks != null) {
            this.DataDisks = new DataDisk[source.DataDisks.length];
            for (int i = 0; i < source.DataDisks.length; i++) {
                this.DataDisks[i] = new DataDisk(source.DataDisks[i]);
            }
        }
        if (source.PrivateIpAddresses != null) {
            this.PrivateIpAddresses = new String[source.PrivateIpAddresses.length];
            for (int i = 0; i < source.PrivateIpAddresses.length; i++) {
                this.PrivateIpAddresses[i] = new String(source.PrivateIpAddresses[i]);
            }
        }
        if (source.PublicIpAddresses != null) {
            this.PublicIpAddresses = new String[source.PublicIpAddresses.length];
            for (int i = 0; i < source.PublicIpAddresses.length; i++) {
                this.PublicIpAddresses[i] = new String(source.PublicIpAddresses[i]);
            }
        }
        if (source.InternetAccessible != null) {
            this.InternetAccessible = new InternetAccessible(source.InternetAccessible);
        }
        if (source.VirtualPrivateCloud != null) {
            this.VirtualPrivateCloud = new VirtualPrivateCloud(source.VirtualPrivateCloud);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new String(source.ExpiredTime);
        }
        if (source.OsName != null) {
            this.OsName = new String(source.OsName);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.LoginSettings != null) {
            this.LoginSettings = new LoginSettings(source.LoginSettings);
        }
        if (source.InstanceState != null) {
            this.InstanceState = new String(source.InstanceState);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.StopChargingMode != null) {
            this.StopChargingMode = new String(source.StopChargingMode);
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
        if (source.DisasterRecoverGroupId != null) {
            this.DisasterRecoverGroupId = new String(source.DisasterRecoverGroupId);
        }
        if (source.IPv6Addresses != null) {
            this.IPv6Addresses = new String[source.IPv6Addresses.length];
            for (int i = 0; i < source.IPv6Addresses.length; i++) {
                this.IPv6Addresses[i] = new String(source.IPv6Addresses[i]);
            }
        }
        if (source.CamRoleName != null) {
            this.CamRoleName = new String(source.CamRoleName);
        }
        if (source.HpcClusterId != null) {
            this.HpcClusterId = new String(source.HpcClusterId);
        }
        if (source.RdmaIpAddresses != null) {
            this.RdmaIpAddresses = new String[source.RdmaIpAddresses.length];
            for (int i = 0; i < source.RdmaIpAddresses.length; i++) {
                this.RdmaIpAddresses[i] = new String(source.RdmaIpAddresses[i]);
            }
        }
        if (source.IsolatedSource != null) {
            this.IsolatedSource = new String(source.IsolatedSource);
        }
        if (source.GPUInfo != null) {
            this.GPUInfo = new GPUInfo(source.GPUInfo);
        }
        if (source.LicenseType != null) {
            this.LicenseType = new String(source.LicenseType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "RestrictState", this.RestrictState);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamArrayObj(map, prefix + "DataDisks.", this.DataDisks);
        this.setParamArraySimple(map, prefix + "PrivateIpAddresses.", this.PrivateIpAddresses);
        this.setParamArraySimple(map, prefix + "PublicIpAddresses.", this.PublicIpAddresses);
        this.setParamObj(map, prefix + "InternetAccessible.", this.InternetAccessible);
        this.setParamObj(map, prefix + "VirtualPrivateCloud.", this.VirtualPrivateCloud);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamObj(map, prefix + "LoginSettings.", this.LoginSettings);
        this.setParamSimple(map, prefix + "InstanceState", this.InstanceState);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "StopChargingMode", this.StopChargingMode);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "LatestOperation", this.LatestOperation);
        this.setParamSimple(map, prefix + "LatestOperationState", this.LatestOperationState);
        this.setParamSimple(map, prefix + "LatestOperationRequestId", this.LatestOperationRequestId);
        this.setParamSimple(map, prefix + "DisasterRecoverGroupId", this.DisasterRecoverGroupId);
        this.setParamArraySimple(map, prefix + "IPv6Addresses.", this.IPv6Addresses);
        this.setParamSimple(map, prefix + "CamRoleName", this.CamRoleName);
        this.setParamSimple(map, prefix + "HpcClusterId", this.HpcClusterId);
        this.setParamArraySimple(map, prefix + "RdmaIpAddresses.", this.RdmaIpAddresses);
        this.setParamSimple(map, prefix + "IsolatedSource", this.IsolatedSource);
        this.setParamObj(map, prefix + "GPUInfo.", this.GPUInfo);
        this.setParamSimple(map, prefix + "LicenseType", this.LicenseType);

    }
}

