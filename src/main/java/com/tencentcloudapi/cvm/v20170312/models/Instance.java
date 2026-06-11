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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Instance extends AbstractModel {

    /**
    * <p>实例所在的位置。</p>
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * <p>实例<code>ID</code>。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例机型。</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>实例的CPU核数，单位：核。</p>
    */
    @SerializedName("CPU")
    @Expose
    private Long CPU;

    /**
    * <p>实例内存容量，单位：<code>GiB</code>。</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>实例业务状态。取值范围：<br><li>NORMAL：表示正常状态的实例</li><li>EXPIRED：表示过期的实例</li><li>PROTECTIVELY_ISOLATED：表示被安全隔离的实例。</li></p>
    */
    @SerializedName("RestrictState")
    @Expose
    private String RestrictState;

    /**
    * <p>实例名称。</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>实例<a href="https://cloud.tencent.com/document/product/213/2180">计费类型</a>。取值范围：<br><li>PREPAID：预付费，即包年包月</li><br><li>POSTPAID_BY_HOUR：按小时后付费</li><br><li>CDHPAID：独享子机（基于专用宿主机创建，宿主机部分的资源不收费）</li><br><li>SPOTPAID：竞价付费</li><br><li>CDCPAID：专用集群付费</li></p>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * <p>实例系统盘信息。</p>
    */
    @SerializedName("SystemDisk")
    @Expose
    private SystemDisk SystemDisk;

    /**
    * <p>实例数据盘信息。</p>
    */
    @SerializedName("DataDisks")
    @Expose
    private DataDisk [] DataDisks;

    /**
    * <p>实例主网卡的内网<code>IP</code>列表。</p>
    */
    @SerializedName("PrivateIpAddresses")
    @Expose
    private String [] PrivateIpAddresses;

    /**
    * <p>实例主网卡的公网<code>IP</code>列表。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicIpAddresses")
    @Expose
    private String [] PublicIpAddresses;

    /**
    * <p>实例带宽信息。</p>
    */
    @SerializedName("InternetAccessible")
    @Expose
    private InternetAccessible InternetAccessible;

    /**
    * <p>实例所属虚拟私有网络信息。</p>
    */
    @SerializedName("VirtualPrivateCloud")
    @Expose
    private VirtualPrivateCloud VirtualPrivateCloud;

    /**
    * <p>生产实例所使用的镜像<code>ID</code>。</p>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * <p>自动续费标识。取值范围：<br><li><code>NOTIFY_AND_MANUAL_RENEW</code>：表示通知即将过期，但不自动续费</li><li><code>NOTIFY_AND_AUTO_RENEW</code>：表示通知即将过期，而且自动续费</li><li><code>DISABLE_NOTIFY_AND_MANUAL_RENEW</code>：表示不通知即将过期，也不自动续费。</p></li><li>注意：后付费模式本项为null</li>
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * <p>创建时间。按照<code>ISO8601</code>标准表示，并且使用<code>UTC</code>时间。格式为：<code>YYYY-MM-DDThh:mm:ssZ</code>。</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>到期时间。按照<code>ISO8601</code>标准表示，并且使用<code>UTC</code>时间。格式为：<code>YYYY-MM-DDThh:mm:ssZ</code>。注意：后付费模式本项为null</p>
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
    * <p>操作系统名称。</p>
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * <p>实例所属安全组。该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/215/15808">DescribeSecurityGroups</a> 的返回值中的sgId字段来获取。</p>
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * <p>实例登录设置。目前只返回实例所关联的密钥。</p>
    */
    @SerializedName("LoginSettings")
    @Expose
    private LoginSettings LoginSettings;

    /**
    * <p>实例状态。状态类型详见<a href="https://cloud.tencent.com/document/api/213/15753#InstanceStatus">实例状态表</a></p>
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
    * <p>实例关联的标签列表。</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>实例的关机计费模式。<br>取值范围：<br><li>KEEP_CHARGING：关机继续收费</li><li>STOP_CHARGING：关机停止收费</li><li>NOT_APPLICABLE：实例处于非关机状态或者不适用关机停止计费的条件</li></p>
    */
    @SerializedName("StopChargingMode")
    @Expose
    private String StopChargingMode;

    /**
    * <p>实例全局唯一ID</p>
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * <p>实例的最新操作。例：StopInstances、ResetInstance。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestOperation")
    @Expose
    private String LatestOperation;

    /**
    * <p>实例的最新操作状态。取值范围：<br><li>SUCCESS：表示操作成功</li><li>OPERATING：表示操作执行中</li><li>FAILED：表示操作失败</li></p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestOperationState")
    @Expose
    private String LatestOperationState;

    /**
    * <p>实例最新操作的唯一请求 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestOperationRequestId")
    @Expose
    private String LatestOperationRequestId;

    /**
    * <p>分散置放群组ID。</p>
    */
    @SerializedName("DisasterRecoverGroupId")
    @Expose
    private String DisasterRecoverGroupId;

    /**
    * <p>实例的IPv6地址。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IPv6Addresses")
    @Expose
    private String [] IPv6Addresses;

    /**
    * <p>CAM角色名。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CamRoleName")
    @Expose
    private String CamRoleName;

    /**
    * <p>高性能计算集群<code>ID</code>。</p>
    */
    @SerializedName("HpcClusterId")
    @Expose
    private String HpcClusterId;

    /**
    * <p>高性能计算集群<code>IP</code>列表。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RdmaIpAddresses")
    @Expose
    private String [] RdmaIpAddresses;

    /**
    * <p>实例所在的专用集群<code>ID</code>。</p>
    */
    @SerializedName("DedicatedClusterId")
    @Expose
    private String DedicatedClusterId;

    /**
    * <p>实例隔离类型。取值范围：<br><li>ARREAR：表示欠费隔离<br></li><li>EXPIRE：表示到期隔离<br></li><li>MANMADE：表示主动退还隔离<br></li><li>NOTISOLATED：表示未隔离<br></li></p>
    */
    @SerializedName("IsolatedSource")
    @Expose
    private String IsolatedSource;

    /**
    * <p>GPU信息。如果是gpu类型子机，该值会返回GPU信息，如果是其他类型子机则不返回。</p>
    */
    @SerializedName("GPUInfo")
    @Expose
    private GPUInfo GPUInfo;

    /**
    * <p>实例的操作系统许可类型，默认为TencentCloud</p>
    */
    @SerializedName("LicenseType")
    @Expose
    private String LicenseType;

    /**
    * <p>实例销毁保护标志，表示是否允许通过api接口删除实例。取值范围：<br><li>true：表示开启实例保护，不允许通过api接口删除实例</li><li>false：表示关闭实例保护，允许通过api接口删除实例</li><br>默认取值：false。</p>
    */
    @SerializedName("DisableApiTermination")
    @Expose
    private Boolean DisableApiTermination;

    /**
    * <p>默认登录用户。</p>
    */
    @SerializedName("DefaultLoginUser")
    @Expose
    private String DefaultLoginUser;

    /**
    * <p>默认登录端口。</p>
    */
    @SerializedName("DefaultLoginPort")
    @Expose
    private Long DefaultLoginPort;

    /**
    * <p>实例的最新操作错误信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestOperationErrorMsg")
    @Expose
    private String LatestOperationErrorMsg;

    /**
    * <p>自定义metadata，本参数对应创建 CVM时指定的Metadata 信息。<strong>注：内测中</strong>。</p>
    */
    @SerializedName("Metadata")
    @Expose
    private Metadata Metadata;

    /**
    * <p>实例绑定的公网IPv6地址。</p>
    */
    @SerializedName("PublicIPv6Addresses")
    @Expose
    private String [] PublicIPv6Addresses;

    /**
    * <p>描述了实例CPU拓扑结构的相关信息。</p>
    */
    @SerializedName("CpuTopology")
    @Expose
    private CpuTopology CpuTopology;

    /**
     * Get <p>实例所在的位置。</p> 
     * @return Placement <p>实例所在的位置。</p>
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set <p>实例所在的位置。</p>
     * @param Placement <p>实例所在的位置。</p>
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get <p>实例<code>ID</code>。</p> 
     * @return InstanceId <p>实例<code>ID</code>。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例<code>ID</code>。</p>
     * @param InstanceId <p>实例<code>ID</code>。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>实例机型。</p> 
     * @return InstanceType <p>实例机型。</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>实例机型。</p>
     * @param InstanceType <p>实例机型。</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>实例的CPU核数，单位：核。</p> 
     * @return CPU <p>实例的CPU核数，单位：核。</p>
     */
    public Long getCPU() {
        return this.CPU;
    }

    /**
     * Set <p>实例的CPU核数，单位：核。</p>
     * @param CPU <p>实例的CPU核数，单位：核。</p>
     */
    public void setCPU(Long CPU) {
        this.CPU = CPU;
    }

    /**
     * Get <p>实例内存容量，单位：<code>GiB</code>。</p> 
     * @return Memory <p>实例内存容量，单位：<code>GiB</code>。</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>实例内存容量，单位：<code>GiB</code>。</p>
     * @param Memory <p>实例内存容量，单位：<code>GiB</code>。</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>实例业务状态。取值范围：<br><li>NORMAL：表示正常状态的实例</li><li>EXPIRED：表示过期的实例</li><li>PROTECTIVELY_ISOLATED：表示被安全隔离的实例。</li></p> 
     * @return RestrictState <p>实例业务状态。取值范围：<br><li>NORMAL：表示正常状态的实例</li><li>EXPIRED：表示过期的实例</li><li>PROTECTIVELY_ISOLATED：表示被安全隔离的实例。</li></p>
     */
    public String getRestrictState() {
        return this.RestrictState;
    }

    /**
     * Set <p>实例业务状态。取值范围：<br><li>NORMAL：表示正常状态的实例</li><li>EXPIRED：表示过期的实例</li><li>PROTECTIVELY_ISOLATED：表示被安全隔离的实例。</li></p>
     * @param RestrictState <p>实例业务状态。取值范围：<br><li>NORMAL：表示正常状态的实例</li><li>EXPIRED：表示过期的实例</li><li>PROTECTIVELY_ISOLATED：表示被安全隔离的实例。</li></p>
     */
    public void setRestrictState(String RestrictState) {
        this.RestrictState = RestrictState;
    }

    /**
     * Get <p>实例名称。</p> 
     * @return InstanceName <p>实例名称。</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称。</p>
     * @param InstanceName <p>实例名称。</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>实例<a href="https://cloud.tencent.com/document/product/213/2180">计费类型</a>。取值范围：<br><li>PREPAID：预付费，即包年包月</li><br><li>POSTPAID_BY_HOUR：按小时后付费</li><br><li>CDHPAID：独享子机（基于专用宿主机创建，宿主机部分的资源不收费）</li><br><li>SPOTPAID：竞价付费</li><br><li>CDCPAID：专用集群付费</li></p> 
     * @return InstanceChargeType <p>实例<a href="https://cloud.tencent.com/document/product/213/2180">计费类型</a>。取值范围：<br><li>PREPAID：预付费，即包年包月</li><br><li>POSTPAID_BY_HOUR：按小时后付费</li><br><li>CDHPAID：独享子机（基于专用宿主机创建，宿主机部分的资源不收费）</li><br><li>SPOTPAID：竞价付费</li><br><li>CDCPAID：专用集群付费</li></p>
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set <p>实例<a href="https://cloud.tencent.com/document/product/213/2180">计费类型</a>。取值范围：<br><li>PREPAID：预付费，即包年包月</li><br><li>POSTPAID_BY_HOUR：按小时后付费</li><br><li>CDHPAID：独享子机（基于专用宿主机创建，宿主机部分的资源不收费）</li><br><li>SPOTPAID：竞价付费</li><br><li>CDCPAID：专用集群付费</li></p>
     * @param InstanceChargeType <p>实例<a href="https://cloud.tencent.com/document/product/213/2180">计费类型</a>。取值范围：<br><li>PREPAID：预付费，即包年包月</li><br><li>POSTPAID_BY_HOUR：按小时后付费</li><br><li>CDHPAID：独享子机（基于专用宿主机创建，宿主机部分的资源不收费）</li><br><li>SPOTPAID：竞价付费</li><br><li>CDCPAID：专用集群付费</li></p>
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get <p>实例系统盘信息。</p> 
     * @return SystemDisk <p>实例系统盘信息。</p>
     */
    public SystemDisk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set <p>实例系统盘信息。</p>
     * @param SystemDisk <p>实例系统盘信息。</p>
     */
    public void setSystemDisk(SystemDisk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get <p>实例数据盘信息。</p> 
     * @return DataDisks <p>实例数据盘信息。</p>
     */
    public DataDisk [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * Set <p>实例数据盘信息。</p>
     * @param DataDisks <p>实例数据盘信息。</p>
     */
    public void setDataDisks(DataDisk [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    /**
     * Get <p>实例主网卡的内网<code>IP</code>列表。</p> 
     * @return PrivateIpAddresses <p>实例主网卡的内网<code>IP</code>列表。</p>
     */
    public String [] getPrivateIpAddresses() {
        return this.PrivateIpAddresses;
    }

    /**
     * Set <p>实例主网卡的内网<code>IP</code>列表。</p>
     * @param PrivateIpAddresses <p>实例主网卡的内网<code>IP</code>列表。</p>
     */
    public void setPrivateIpAddresses(String [] PrivateIpAddresses) {
        this.PrivateIpAddresses = PrivateIpAddresses;
    }

    /**
     * Get <p>实例主网卡的公网<code>IP</code>列表。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicIpAddresses <p>实例主网卡的公网<code>IP</code>列表。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getPublicIpAddresses() {
        return this.PublicIpAddresses;
    }

    /**
     * Set <p>实例主网卡的公网<code>IP</code>列表。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicIpAddresses <p>实例主网卡的公网<code>IP</code>列表。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicIpAddresses(String [] PublicIpAddresses) {
        this.PublicIpAddresses = PublicIpAddresses;
    }

    /**
     * Get <p>实例带宽信息。</p> 
     * @return InternetAccessible <p>实例带宽信息。</p>
     */
    public InternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * Set <p>实例带宽信息。</p>
     * @param InternetAccessible <p>实例带宽信息。</p>
     */
    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     * Get <p>实例所属虚拟私有网络信息。</p> 
     * @return VirtualPrivateCloud <p>实例所属虚拟私有网络信息。</p>
     */
    public VirtualPrivateCloud getVirtualPrivateCloud() {
        return this.VirtualPrivateCloud;
    }

    /**
     * Set <p>实例所属虚拟私有网络信息。</p>
     * @param VirtualPrivateCloud <p>实例所属虚拟私有网络信息。</p>
     */
    public void setVirtualPrivateCloud(VirtualPrivateCloud VirtualPrivateCloud) {
        this.VirtualPrivateCloud = VirtualPrivateCloud;
    }

    /**
     * Get <p>生产实例所使用的镜像<code>ID</code>。</p> 
     * @return ImageId <p>生产实例所使用的镜像<code>ID</code>。</p>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set <p>生产实例所使用的镜像<code>ID</code>。</p>
     * @param ImageId <p>生产实例所使用的镜像<code>ID</code>。</p>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get <p>自动续费标识。取值范围：<br><li><code>NOTIFY_AND_MANUAL_RENEW</code>：表示通知即将过期，但不自动续费</li><li><code>NOTIFY_AND_AUTO_RENEW</code>：表示通知即将过期，而且自动续费</li><li><code>DISABLE_NOTIFY_AND_MANUAL_RENEW</code>：表示不通知即将过期，也不自动续费。</p></li><li>注意：后付费模式本项为null</li> 
     * @return RenewFlag <p>自动续费标识。取值范围：<br><li><code>NOTIFY_AND_MANUAL_RENEW</code>：表示通知即将过期，但不自动续费</li><li><code>NOTIFY_AND_AUTO_RENEW</code>：表示通知即将过期，而且自动续费</li><li><code>DISABLE_NOTIFY_AND_MANUAL_RENEW</code>：表示不通知即将过期，也不自动续费。</p></li><li>注意：后付费模式本项为null</li>
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set <p>自动续费标识。取值范围：<br><li><code>NOTIFY_AND_MANUAL_RENEW</code>：表示通知即将过期，但不自动续费</li><li><code>NOTIFY_AND_AUTO_RENEW</code>：表示通知即将过期，而且自动续费</li><li><code>DISABLE_NOTIFY_AND_MANUAL_RENEW</code>：表示不通知即将过期，也不自动续费。</p></li><li>注意：后付费模式本项为null</li>
     * @param RenewFlag <p>自动续费标识。取值范围：<br><li><code>NOTIFY_AND_MANUAL_RENEW</code>：表示通知即将过期，但不自动续费</li><li><code>NOTIFY_AND_AUTO_RENEW</code>：表示通知即将过期，而且自动续费</li><li><code>DISABLE_NOTIFY_AND_MANUAL_RENEW</code>：表示不通知即将过期，也不自动续费。</p></li><li>注意：后付费模式本项为null</li>
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get <p>创建时间。按照<code>ISO8601</code>标准表示，并且使用<code>UTC</code>时间。格式为：<code>YYYY-MM-DDThh:mm:ssZ</code>。</p> 
     * @return CreatedTime <p>创建时间。按照<code>ISO8601</code>标准表示，并且使用<code>UTC</code>时间。格式为：<code>YYYY-MM-DDThh:mm:ssZ</code>。</p>
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>创建时间。按照<code>ISO8601</code>标准表示，并且使用<code>UTC</code>时间。格式为：<code>YYYY-MM-DDThh:mm:ssZ</code>。</p>
     * @param CreatedTime <p>创建时间。按照<code>ISO8601</code>标准表示，并且使用<code>UTC</code>时间。格式为：<code>YYYY-MM-DDThh:mm:ssZ</code>。</p>
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>到期时间。按照<code>ISO8601</code>标准表示，并且使用<code>UTC</code>时间。格式为：<code>YYYY-MM-DDThh:mm:ssZ</code>。注意：后付费模式本项为null</p> 
     * @return ExpiredTime <p>到期时间。按照<code>ISO8601</code>标准表示，并且使用<code>UTC</code>时间。格式为：<code>YYYY-MM-DDThh:mm:ssZ</code>。注意：后付费模式本项为null</p>
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set <p>到期时间。按照<code>ISO8601</code>标准表示，并且使用<code>UTC</code>时间。格式为：<code>YYYY-MM-DDThh:mm:ssZ</code>。注意：后付费模式本项为null</p>
     * @param ExpiredTime <p>到期时间。按照<code>ISO8601</code>标准表示，并且使用<code>UTC</code>时间。格式为：<code>YYYY-MM-DDThh:mm:ssZ</code>。注意：后付费模式本项为null</p>
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get <p>操作系统名称。</p> 
     * @return OsName <p>操作系统名称。</p>
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set <p>操作系统名称。</p>
     * @param OsName <p>操作系统名称。</p>
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get <p>实例所属安全组。该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/215/15808">DescribeSecurityGroups</a> 的返回值中的sgId字段来获取。</p> 
     * @return SecurityGroupIds <p>实例所属安全组。该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/215/15808">DescribeSecurityGroups</a> 的返回值中的sgId字段来获取。</p>
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set <p>实例所属安全组。该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/215/15808">DescribeSecurityGroups</a> 的返回值中的sgId字段来获取。</p>
     * @param SecurityGroupIds <p>实例所属安全组。该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/215/15808">DescribeSecurityGroups</a> 的返回值中的sgId字段来获取。</p>
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get <p>实例登录设置。目前只返回实例所关联的密钥。</p> 
     * @return LoginSettings <p>实例登录设置。目前只返回实例所关联的密钥。</p>
     */
    public LoginSettings getLoginSettings() {
        return this.LoginSettings;
    }

    /**
     * Set <p>实例登录设置。目前只返回实例所关联的密钥。</p>
     * @param LoginSettings <p>实例登录设置。目前只返回实例所关联的密钥。</p>
     */
    public void setLoginSettings(LoginSettings LoginSettings) {
        this.LoginSettings = LoginSettings;
    }

    /**
     * Get <p>实例状态。状态类型详见<a href="https://cloud.tencent.com/document/api/213/15753#InstanceStatus">实例状态表</a></p> 
     * @return InstanceState <p>实例状态。状态类型详见<a href="https://cloud.tencent.com/document/api/213/15753#InstanceStatus">实例状态表</a></p>
     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set <p>实例状态。状态类型详见<a href="https://cloud.tencent.com/document/api/213/15753#InstanceStatus">实例状态表</a></p>
     * @param InstanceState <p>实例状态。状态类型详见<a href="https://cloud.tencent.com/document/api/213/15753#InstanceStatus">实例状态表</a></p>
     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    /**
     * Get <p>实例关联的标签列表。</p> 
     * @return Tags <p>实例关联的标签列表。</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>实例关联的标签列表。</p>
     * @param Tags <p>实例关联的标签列表。</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>实例的关机计费模式。<br>取值范围：<br><li>KEEP_CHARGING：关机继续收费</li><li>STOP_CHARGING：关机停止收费</li><li>NOT_APPLICABLE：实例处于非关机状态或者不适用关机停止计费的条件</li></p> 
     * @return StopChargingMode <p>实例的关机计费模式。<br>取值范围：<br><li>KEEP_CHARGING：关机继续收费</li><li>STOP_CHARGING：关机停止收费</li><li>NOT_APPLICABLE：实例处于非关机状态或者不适用关机停止计费的条件</li></p>
     */
    public String getStopChargingMode() {
        return this.StopChargingMode;
    }

    /**
     * Set <p>实例的关机计费模式。<br>取值范围：<br><li>KEEP_CHARGING：关机继续收费</li><li>STOP_CHARGING：关机停止收费</li><li>NOT_APPLICABLE：实例处于非关机状态或者不适用关机停止计费的条件</li></p>
     * @param StopChargingMode <p>实例的关机计费模式。<br>取值范围：<br><li>KEEP_CHARGING：关机继续收费</li><li>STOP_CHARGING：关机停止收费</li><li>NOT_APPLICABLE：实例处于非关机状态或者不适用关机停止计费的条件</li></p>
     */
    public void setStopChargingMode(String StopChargingMode) {
        this.StopChargingMode = StopChargingMode;
    }

    /**
     * Get <p>实例全局唯一ID</p> 
     * @return Uuid <p>实例全局唯一ID</p>
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set <p>实例全局唯一ID</p>
     * @param Uuid <p>实例全局唯一ID</p>
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get <p>实例的最新操作。例：StopInstances、ResetInstance。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestOperation <p>实例的最新操作。例：StopInstances、ResetInstance。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestOperation() {
        return this.LatestOperation;
    }

    /**
     * Set <p>实例的最新操作。例：StopInstances、ResetInstance。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestOperation <p>实例的最新操作。例：StopInstances、ResetInstance。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestOperation(String LatestOperation) {
        this.LatestOperation = LatestOperation;
    }

    /**
     * Get <p>实例的最新操作状态。取值范围：<br><li>SUCCESS：表示操作成功</li><li>OPERATING：表示操作执行中</li><li>FAILED：表示操作失败</li></p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestOperationState <p>实例的最新操作状态。取值范围：<br><li>SUCCESS：表示操作成功</li><li>OPERATING：表示操作执行中</li><li>FAILED：表示操作失败</li></p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestOperationState() {
        return this.LatestOperationState;
    }

    /**
     * Set <p>实例的最新操作状态。取值范围：<br><li>SUCCESS：表示操作成功</li><li>OPERATING：表示操作执行中</li><li>FAILED：表示操作失败</li></p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestOperationState <p>实例的最新操作状态。取值范围：<br><li>SUCCESS：表示操作成功</li><li>OPERATING：表示操作执行中</li><li>FAILED：表示操作失败</li></p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestOperationState(String LatestOperationState) {
        this.LatestOperationState = LatestOperationState;
    }

    /**
     * Get <p>实例最新操作的唯一请求 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestOperationRequestId <p>实例最新操作的唯一请求 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestOperationRequestId() {
        return this.LatestOperationRequestId;
    }

    /**
     * Set <p>实例最新操作的唯一请求 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestOperationRequestId <p>实例最新操作的唯一请求 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestOperationRequestId(String LatestOperationRequestId) {
        this.LatestOperationRequestId = LatestOperationRequestId;
    }

    /**
     * Get <p>分散置放群组ID。</p> 
     * @return DisasterRecoverGroupId <p>分散置放群组ID。</p>
     */
    public String getDisasterRecoverGroupId() {
        return this.DisasterRecoverGroupId;
    }

    /**
     * Set <p>分散置放群组ID。</p>
     * @param DisasterRecoverGroupId <p>分散置放群组ID。</p>
     */
    public void setDisasterRecoverGroupId(String DisasterRecoverGroupId) {
        this.DisasterRecoverGroupId = DisasterRecoverGroupId;
    }

    /**
     * Get <p>实例的IPv6地址。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IPv6Addresses <p>实例的IPv6地址。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getIPv6Addresses() {
        return this.IPv6Addresses;
    }

    /**
     * Set <p>实例的IPv6地址。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IPv6Addresses <p>实例的IPv6地址。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIPv6Addresses(String [] IPv6Addresses) {
        this.IPv6Addresses = IPv6Addresses;
    }

    /**
     * Get <p>CAM角色名。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CamRoleName <p>CAM角色名。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCamRoleName() {
        return this.CamRoleName;
    }

    /**
     * Set <p>CAM角色名。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CamRoleName <p>CAM角色名。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCamRoleName(String CamRoleName) {
        this.CamRoleName = CamRoleName;
    }

    /**
     * Get <p>高性能计算集群<code>ID</code>。</p> 
     * @return HpcClusterId <p>高性能计算集群<code>ID</code>。</p>
     */
    public String getHpcClusterId() {
        return this.HpcClusterId;
    }

    /**
     * Set <p>高性能计算集群<code>ID</code>。</p>
     * @param HpcClusterId <p>高性能计算集群<code>ID</code>。</p>
     */
    public void setHpcClusterId(String HpcClusterId) {
        this.HpcClusterId = HpcClusterId;
    }

    /**
     * Get <p>高性能计算集群<code>IP</code>列表。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RdmaIpAddresses <p>高性能计算集群<code>IP</code>列表。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getRdmaIpAddresses() {
        return this.RdmaIpAddresses;
    }

    /**
     * Set <p>高性能计算集群<code>IP</code>列表。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RdmaIpAddresses <p>高性能计算集群<code>IP</code>列表。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRdmaIpAddresses(String [] RdmaIpAddresses) {
        this.RdmaIpAddresses = RdmaIpAddresses;
    }

    /**
     * Get <p>实例所在的专用集群<code>ID</code>。</p> 
     * @return DedicatedClusterId <p>实例所在的专用集群<code>ID</code>。</p>
     */
    public String getDedicatedClusterId() {
        return this.DedicatedClusterId;
    }

    /**
     * Set <p>实例所在的专用集群<code>ID</code>。</p>
     * @param DedicatedClusterId <p>实例所在的专用集群<code>ID</code>。</p>
     */
    public void setDedicatedClusterId(String DedicatedClusterId) {
        this.DedicatedClusterId = DedicatedClusterId;
    }

    /**
     * Get <p>实例隔离类型。取值范围：<br><li>ARREAR：表示欠费隔离<br></li><li>EXPIRE：表示到期隔离<br></li><li>MANMADE：表示主动退还隔离<br></li><li>NOTISOLATED：表示未隔离<br></li></p> 
     * @return IsolatedSource <p>实例隔离类型。取值范围：<br><li>ARREAR：表示欠费隔离<br></li><li>EXPIRE：表示到期隔离<br></li><li>MANMADE：表示主动退还隔离<br></li><li>NOTISOLATED：表示未隔离<br></li></p>
     */
    public String getIsolatedSource() {
        return this.IsolatedSource;
    }

    /**
     * Set <p>实例隔离类型。取值范围：<br><li>ARREAR：表示欠费隔离<br></li><li>EXPIRE：表示到期隔离<br></li><li>MANMADE：表示主动退还隔离<br></li><li>NOTISOLATED：表示未隔离<br></li></p>
     * @param IsolatedSource <p>实例隔离类型。取值范围：<br><li>ARREAR：表示欠费隔离<br></li><li>EXPIRE：表示到期隔离<br></li><li>MANMADE：表示主动退还隔离<br></li><li>NOTISOLATED：表示未隔离<br></li></p>
     */
    public void setIsolatedSource(String IsolatedSource) {
        this.IsolatedSource = IsolatedSource;
    }

    /**
     * Get <p>GPU信息。如果是gpu类型子机，该值会返回GPU信息，如果是其他类型子机则不返回。</p> 
     * @return GPUInfo <p>GPU信息。如果是gpu类型子机，该值会返回GPU信息，如果是其他类型子机则不返回。</p>
     */
    public GPUInfo getGPUInfo() {
        return this.GPUInfo;
    }

    /**
     * Set <p>GPU信息。如果是gpu类型子机，该值会返回GPU信息，如果是其他类型子机则不返回。</p>
     * @param GPUInfo <p>GPU信息。如果是gpu类型子机，该值会返回GPU信息，如果是其他类型子机则不返回。</p>
     */
    public void setGPUInfo(GPUInfo GPUInfo) {
        this.GPUInfo = GPUInfo;
    }

    /**
     * Get <p>实例的操作系统许可类型，默认为TencentCloud</p> 
     * @return LicenseType <p>实例的操作系统许可类型，默认为TencentCloud</p>
     */
    public String getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set <p>实例的操作系统许可类型，默认为TencentCloud</p>
     * @param LicenseType <p>实例的操作系统许可类型，默认为TencentCloud</p>
     */
    public void setLicenseType(String LicenseType) {
        this.LicenseType = LicenseType;
    }

    /**
     * Get <p>实例销毁保护标志，表示是否允许通过api接口删除实例。取值范围：<br><li>true：表示开启实例保护，不允许通过api接口删除实例</li><li>false：表示关闭实例保护，允许通过api接口删除实例</li><br>默认取值：false。</p> 
     * @return DisableApiTermination <p>实例销毁保护标志，表示是否允许通过api接口删除实例。取值范围：<br><li>true：表示开启实例保护，不允许通过api接口删除实例</li><li>false：表示关闭实例保护，允许通过api接口删除实例</li><br>默认取值：false。</p>
     */
    public Boolean getDisableApiTermination() {
        return this.DisableApiTermination;
    }

    /**
     * Set <p>实例销毁保护标志，表示是否允许通过api接口删除实例。取值范围：<br><li>true：表示开启实例保护，不允许通过api接口删除实例</li><li>false：表示关闭实例保护，允许通过api接口删除实例</li><br>默认取值：false。</p>
     * @param DisableApiTermination <p>实例销毁保护标志，表示是否允许通过api接口删除实例。取值范围：<br><li>true：表示开启实例保护，不允许通过api接口删除实例</li><li>false：表示关闭实例保护，允许通过api接口删除实例</li><br>默认取值：false。</p>
     */
    public void setDisableApiTermination(Boolean DisableApiTermination) {
        this.DisableApiTermination = DisableApiTermination;
    }

    /**
     * Get <p>默认登录用户。</p> 
     * @return DefaultLoginUser <p>默认登录用户。</p>
     */
    public String getDefaultLoginUser() {
        return this.DefaultLoginUser;
    }

    /**
     * Set <p>默认登录用户。</p>
     * @param DefaultLoginUser <p>默认登录用户。</p>
     */
    public void setDefaultLoginUser(String DefaultLoginUser) {
        this.DefaultLoginUser = DefaultLoginUser;
    }

    /**
     * Get <p>默认登录端口。</p> 
     * @return DefaultLoginPort <p>默认登录端口。</p>
     */
    public Long getDefaultLoginPort() {
        return this.DefaultLoginPort;
    }

    /**
     * Set <p>默认登录端口。</p>
     * @param DefaultLoginPort <p>默认登录端口。</p>
     */
    public void setDefaultLoginPort(Long DefaultLoginPort) {
        this.DefaultLoginPort = DefaultLoginPort;
    }

    /**
     * Get <p>实例的最新操作错误信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestOperationErrorMsg <p>实例的最新操作错误信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestOperationErrorMsg() {
        return this.LatestOperationErrorMsg;
    }

    /**
     * Set <p>实例的最新操作错误信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestOperationErrorMsg <p>实例的最新操作错误信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestOperationErrorMsg(String LatestOperationErrorMsg) {
        this.LatestOperationErrorMsg = LatestOperationErrorMsg;
    }

    /**
     * Get <p>自定义metadata，本参数对应创建 CVM时指定的Metadata 信息。<strong>注：内测中</strong>。</p> 
     * @return Metadata <p>自定义metadata，本参数对应创建 CVM时指定的Metadata 信息。<strong>注：内测中</strong>。</p>
     */
    public Metadata getMetadata() {
        return this.Metadata;
    }

    /**
     * Set <p>自定义metadata，本参数对应创建 CVM时指定的Metadata 信息。<strong>注：内测中</strong>。</p>
     * @param Metadata <p>自定义metadata，本参数对应创建 CVM时指定的Metadata 信息。<strong>注：内测中</strong>。</p>
     */
    public void setMetadata(Metadata Metadata) {
        this.Metadata = Metadata;
    }

    /**
     * Get <p>实例绑定的公网IPv6地址。</p> 
     * @return PublicIPv6Addresses <p>实例绑定的公网IPv6地址。</p>
     */
    public String [] getPublicIPv6Addresses() {
        return this.PublicIPv6Addresses;
    }

    /**
     * Set <p>实例绑定的公网IPv6地址。</p>
     * @param PublicIPv6Addresses <p>实例绑定的公网IPv6地址。</p>
     */
    public void setPublicIPv6Addresses(String [] PublicIPv6Addresses) {
        this.PublicIPv6Addresses = PublicIPv6Addresses;
    }

    /**
     * Get <p>描述了实例CPU拓扑结构的相关信息。</p> 
     * @return CpuTopology <p>描述了实例CPU拓扑结构的相关信息。</p>
     */
    public CpuTopology getCpuTopology() {
        return this.CpuTopology;
    }

    /**
     * Set <p>描述了实例CPU拓扑结构的相关信息。</p>
     * @param CpuTopology <p>描述了实例CPU拓扑结构的相关信息。</p>
     */
    public void setCpuTopology(CpuTopology CpuTopology) {
        this.CpuTopology = CpuTopology;
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
        if (source.DedicatedClusterId != null) {
            this.DedicatedClusterId = new String(source.DedicatedClusterId);
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
        if (source.DisableApiTermination != null) {
            this.DisableApiTermination = new Boolean(source.DisableApiTermination);
        }
        if (source.DefaultLoginUser != null) {
            this.DefaultLoginUser = new String(source.DefaultLoginUser);
        }
        if (source.DefaultLoginPort != null) {
            this.DefaultLoginPort = new Long(source.DefaultLoginPort);
        }
        if (source.LatestOperationErrorMsg != null) {
            this.LatestOperationErrorMsg = new String(source.LatestOperationErrorMsg);
        }
        if (source.Metadata != null) {
            this.Metadata = new Metadata(source.Metadata);
        }
        if (source.PublicIPv6Addresses != null) {
            this.PublicIPv6Addresses = new String[source.PublicIPv6Addresses.length];
            for (int i = 0; i < source.PublicIPv6Addresses.length; i++) {
                this.PublicIPv6Addresses[i] = new String(source.PublicIPv6Addresses[i]);
            }
        }
        if (source.CpuTopology != null) {
            this.CpuTopology = new CpuTopology(source.CpuTopology);
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
        this.setParamSimple(map, prefix + "DedicatedClusterId", this.DedicatedClusterId);
        this.setParamSimple(map, prefix + "IsolatedSource", this.IsolatedSource);
        this.setParamObj(map, prefix + "GPUInfo.", this.GPUInfo);
        this.setParamSimple(map, prefix + "LicenseType", this.LicenseType);
        this.setParamSimple(map, prefix + "DisableApiTermination", this.DisableApiTermination);
        this.setParamSimple(map, prefix + "DefaultLoginUser", this.DefaultLoginUser);
        this.setParamSimple(map, prefix + "DefaultLoginPort", this.DefaultLoginPort);
        this.setParamSimple(map, prefix + "LatestOperationErrorMsg", this.LatestOperationErrorMsg);
        this.setParamObj(map, prefix + "Metadata.", this.Metadata);
        this.setParamArraySimple(map, prefix + "PublicIPv6Addresses.", this.PublicIPv6Addresses);
        this.setParamObj(map, prefix + "CpuTopology.", this.CpuTopology);

    }
}

