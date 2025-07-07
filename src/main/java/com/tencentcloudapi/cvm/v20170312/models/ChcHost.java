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

public class ChcHost extends AbstractModel {

    /**
    * CHC物理服务器ID。
    */
    @SerializedName("ChcId")
    @Expose
    private String ChcId;

    /**
    * 实例名称。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 服务器序列号。
    */
    @SerializedName("SerialNumber")
    @Expose
    private String SerialNumber;

    /**
    * CHC的状态<br/>
<ul>
<li>INIT: 设备已录入。还未配置带外和部署网络</li>
<li>READY: 已配置带外和部署网络</li>
<li>PREPARED: 可分配云主机</li>
<li>ONLINE: 已分配云主机</li>
<li>OPERATING: 设备操作中，如正在配置带外网络等。</li>
<li>CLEAR_NETWORK_FAILED: 清理带外和部署网络失败</li>
</ul>
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
    * 设备类型。
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * 所属可用区
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * 带外网络。
    */
    @SerializedName("BmcVirtualPrivateCloud")
    @Expose
    private VirtualPrivateCloud BmcVirtualPrivateCloud;

    /**
    * 带外网络Ip。
    */
    @SerializedName("BmcIp")
    @Expose
    private String BmcIp;

    /**
    * 带外网络安全组Id。
    */
    @SerializedName("BmcSecurityGroupIds")
    @Expose
    private String [] BmcSecurityGroupIds;

    /**
    * 部署网络。
    */
    @SerializedName("DeployVirtualPrivateCloud")
    @Expose
    private VirtualPrivateCloud DeployVirtualPrivateCloud;

    /**
    * 部署网络Ip。
    */
    @SerializedName("DeployIp")
    @Expose
    private String DeployIp;

    /**
    * 部署网络安全组Id。
    */
    @SerializedName("DeploySecurityGroupIds")
    @Expose
    private String [] DeploySecurityGroupIds;

    /**
    * 关联的云主机Id。
    */
    @SerializedName("CvmInstanceId")
    @Expose
    private String CvmInstanceId;

    /**
    * 服务器导入的时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 机型的硬件描述，分别为CPU核数，内存容量和磁盘容量
    */
    @SerializedName("HardwareDescription")
    @Expose
    private String HardwareDescription;

    /**
    * CHC物理服务器的CPU核数
    */
    @SerializedName("CPU")
    @Expose
    private Long CPU;

    /**
    * CHC物理服务器的内存大小，单位为GB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * CHC物理服务器的磁盘信息
    */
    @SerializedName("Disk")
    @Expose
    private String Disk;

    /**
    * 带外网络下分配的MAC地址
    */
    @SerializedName("BmcMAC")
    @Expose
    private String BmcMAC;

    /**
    * 部署网络下分配的MAC地址
    */
    @SerializedName("DeployMAC")
    @Expose
    private String DeployMAC;

    /**
    * 设备托管类型。
HOSTING: 托管
TENANT: 租赁
    */
    @SerializedName("TenantType")
    @Expose
    private String TenantType;

    /**
    * chc dhcp选项，用于minios调试。
    */
    @SerializedName("DeployExtraConfig")
    @Expose
    private ChcDeployExtraConfig DeployExtraConfig;

    /**
    * GPU型号。
    */
    @SerializedName("Gpu")
    @Expose
    private String Gpu;

    /**
    * 网卡型号。主要指RDMA网卡。
    */
    @SerializedName("NetworkCard")
    @Expose
    private String NetworkCard;

    /**
    * 是否是预定义机型。
    */
    @SerializedName("IsPredefinedType")
    @Expose
    private Boolean IsPredefinedType;

    /**
    * CHC云主机机型。
    */
    @SerializedName("ChcInstanceType")
    @Expose
    private String ChcInstanceType;

    /**
    * CHC云主机机型簇。
    */
    @SerializedName("ChcInstanceFamily")
    @Expose
    private String ChcInstanceFamily;

    /**
    * CHC云主机机型簇名称。
    */
    @SerializedName("ChcInstanceFamilyName")
    @Expose
    private String ChcInstanceFamilyName;

    /**
    * 转售客户的AppId。
    */
    @SerializedName("ResaleAppId")
    @Expose
    private String ResaleAppId;

    /**
    * 转售客户的账号ID。
    */
    @SerializedName("ResaleAccountId")
    @Expose
    private String ResaleAccountId;

    /**
    * 售卖状态。<br/>
<ul>
<li>NOT_FOR_SALE:不可售卖</li>
<li>AVAILABLE: 可售卖</li>
<li>SOLD: 已售卖</li>
</ul>

    */
    @SerializedName("SaleStatus")
    @Expose
    private String SaleStatus;

    /**
    * CHC物理服务器关联的标签列表。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 最近操作
    */
    @SerializedName("LatestOperation")
    @Expose
    private String LatestOperation;

    /**
    * 最近操作错误码
    */
    @SerializedName("LatestOperationErrorCode")
    @Expose
    private String LatestOperationErrorCode;

    /**
    * 最近操作错误详情和建议项
    */
    @SerializedName("LatestOperationErrorMsg")
    @Expose
    private String LatestOperationErrorMsg;

    /**
    * 最近操作名称
    */
    @SerializedName("LatestOperationName")
    @Expose
    private String LatestOperationName;

    /**
    * 最近操作状态
    */
    @SerializedName("LatestOperationState")
    @Expose
    private String LatestOperationState;

    /**
     * Get CHC物理服务器ID。 
     * @return ChcId CHC物理服务器ID。
     */
    public String getChcId() {
        return this.ChcId;
    }

    /**
     * Set CHC物理服务器ID。
     * @param ChcId CHC物理服务器ID。
     */
    public void setChcId(String ChcId) {
        this.ChcId = ChcId;
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
     * Get 服务器序列号。 
     * @return SerialNumber 服务器序列号。
     */
    public String getSerialNumber() {
        return this.SerialNumber;
    }

    /**
     * Set 服务器序列号。
     * @param SerialNumber 服务器序列号。
     */
    public void setSerialNumber(String SerialNumber) {
        this.SerialNumber = SerialNumber;
    }

    /**
     * Get CHC的状态<br/>
<ul>
<li>INIT: 设备已录入。还未配置带外和部署网络</li>
<li>READY: 已配置带外和部署网络</li>
<li>PREPARED: 可分配云主机</li>
<li>ONLINE: 已分配云主机</li>
<li>OPERATING: 设备操作中，如正在配置带外网络等。</li>
<li>CLEAR_NETWORK_FAILED: 清理带外和部署网络失败</li>
</ul> 
     * @return InstanceState CHC的状态<br/>
<ul>
<li>INIT: 设备已录入。还未配置带外和部署网络</li>
<li>READY: 已配置带外和部署网络</li>
<li>PREPARED: 可分配云主机</li>
<li>ONLINE: 已分配云主机</li>
<li>OPERATING: 设备操作中，如正在配置带外网络等。</li>
<li>CLEAR_NETWORK_FAILED: 清理带外和部署网络失败</li>
</ul>
     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set CHC的状态<br/>
<ul>
<li>INIT: 设备已录入。还未配置带外和部署网络</li>
<li>READY: 已配置带外和部署网络</li>
<li>PREPARED: 可分配云主机</li>
<li>ONLINE: 已分配云主机</li>
<li>OPERATING: 设备操作中，如正在配置带外网络等。</li>
<li>CLEAR_NETWORK_FAILED: 清理带外和部署网络失败</li>
</ul>
     * @param InstanceState CHC的状态<br/>
<ul>
<li>INIT: 设备已录入。还未配置带外和部署网络</li>
<li>READY: 已配置带外和部署网络</li>
<li>PREPARED: 可分配云主机</li>
<li>ONLINE: 已分配云主机</li>
<li>OPERATING: 设备操作中，如正在配置带外网络等。</li>
<li>CLEAR_NETWORK_FAILED: 清理带外和部署网络失败</li>
</ul>
     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    /**
     * Get 设备类型。 
     * @return DeviceType 设备类型。
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 设备类型。
     * @param DeviceType 设备类型。
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get 所属可用区 
     * @return Placement 所属可用区
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set 所属可用区
     * @param Placement 所属可用区
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get 带外网络。 
     * @return BmcVirtualPrivateCloud 带外网络。
     */
    public VirtualPrivateCloud getBmcVirtualPrivateCloud() {
        return this.BmcVirtualPrivateCloud;
    }

    /**
     * Set 带外网络。
     * @param BmcVirtualPrivateCloud 带外网络。
     */
    public void setBmcVirtualPrivateCloud(VirtualPrivateCloud BmcVirtualPrivateCloud) {
        this.BmcVirtualPrivateCloud = BmcVirtualPrivateCloud;
    }

    /**
     * Get 带外网络Ip。 
     * @return BmcIp 带外网络Ip。
     */
    public String getBmcIp() {
        return this.BmcIp;
    }

    /**
     * Set 带外网络Ip。
     * @param BmcIp 带外网络Ip。
     */
    public void setBmcIp(String BmcIp) {
        this.BmcIp = BmcIp;
    }

    /**
     * Get 带外网络安全组Id。 
     * @return BmcSecurityGroupIds 带外网络安全组Id。
     */
    public String [] getBmcSecurityGroupIds() {
        return this.BmcSecurityGroupIds;
    }

    /**
     * Set 带外网络安全组Id。
     * @param BmcSecurityGroupIds 带外网络安全组Id。
     */
    public void setBmcSecurityGroupIds(String [] BmcSecurityGroupIds) {
        this.BmcSecurityGroupIds = BmcSecurityGroupIds;
    }

    /**
     * Get 部署网络。 
     * @return DeployVirtualPrivateCloud 部署网络。
     */
    public VirtualPrivateCloud getDeployVirtualPrivateCloud() {
        return this.DeployVirtualPrivateCloud;
    }

    /**
     * Set 部署网络。
     * @param DeployVirtualPrivateCloud 部署网络。
     */
    public void setDeployVirtualPrivateCloud(VirtualPrivateCloud DeployVirtualPrivateCloud) {
        this.DeployVirtualPrivateCloud = DeployVirtualPrivateCloud;
    }

    /**
     * Get 部署网络Ip。 
     * @return DeployIp 部署网络Ip。
     */
    public String getDeployIp() {
        return this.DeployIp;
    }

    /**
     * Set 部署网络Ip。
     * @param DeployIp 部署网络Ip。
     */
    public void setDeployIp(String DeployIp) {
        this.DeployIp = DeployIp;
    }

    /**
     * Get 部署网络安全组Id。 
     * @return DeploySecurityGroupIds 部署网络安全组Id。
     */
    public String [] getDeploySecurityGroupIds() {
        return this.DeploySecurityGroupIds;
    }

    /**
     * Set 部署网络安全组Id。
     * @param DeploySecurityGroupIds 部署网络安全组Id。
     */
    public void setDeploySecurityGroupIds(String [] DeploySecurityGroupIds) {
        this.DeploySecurityGroupIds = DeploySecurityGroupIds;
    }

    /**
     * Get 关联的云主机Id。 
     * @return CvmInstanceId 关联的云主机Id。
     */
    public String getCvmInstanceId() {
        return this.CvmInstanceId;
    }

    /**
     * Set 关联的云主机Id。
     * @param CvmInstanceId 关联的云主机Id。
     */
    public void setCvmInstanceId(String CvmInstanceId) {
        this.CvmInstanceId = CvmInstanceId;
    }

    /**
     * Get 服务器导入的时间。 
     * @return CreatedTime 服务器导入的时间。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 服务器导入的时间。
     * @param CreatedTime 服务器导入的时间。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 机型的硬件描述，分别为CPU核数，内存容量和磁盘容量 
     * @return HardwareDescription 机型的硬件描述，分别为CPU核数，内存容量和磁盘容量
     */
    public String getHardwareDescription() {
        return this.HardwareDescription;
    }

    /**
     * Set 机型的硬件描述，分别为CPU核数，内存容量和磁盘容量
     * @param HardwareDescription 机型的硬件描述，分别为CPU核数，内存容量和磁盘容量
     */
    public void setHardwareDescription(String HardwareDescription) {
        this.HardwareDescription = HardwareDescription;
    }

    /**
     * Get CHC物理服务器的CPU核数 
     * @return CPU CHC物理服务器的CPU核数
     */
    public Long getCPU() {
        return this.CPU;
    }

    /**
     * Set CHC物理服务器的CPU核数
     * @param CPU CHC物理服务器的CPU核数
     */
    public void setCPU(Long CPU) {
        this.CPU = CPU;
    }

    /**
     * Get CHC物理服务器的内存大小，单位为GB 
     * @return Memory CHC物理服务器的内存大小，单位为GB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set CHC物理服务器的内存大小，单位为GB
     * @param Memory CHC物理服务器的内存大小，单位为GB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get CHC物理服务器的磁盘信息 
     * @return Disk CHC物理服务器的磁盘信息
     */
    public String getDisk() {
        return this.Disk;
    }

    /**
     * Set CHC物理服务器的磁盘信息
     * @param Disk CHC物理服务器的磁盘信息
     */
    public void setDisk(String Disk) {
        this.Disk = Disk;
    }

    /**
     * Get 带外网络下分配的MAC地址 
     * @return BmcMAC 带外网络下分配的MAC地址
     */
    public String getBmcMAC() {
        return this.BmcMAC;
    }

    /**
     * Set 带外网络下分配的MAC地址
     * @param BmcMAC 带外网络下分配的MAC地址
     */
    public void setBmcMAC(String BmcMAC) {
        this.BmcMAC = BmcMAC;
    }

    /**
     * Get 部署网络下分配的MAC地址 
     * @return DeployMAC 部署网络下分配的MAC地址
     */
    public String getDeployMAC() {
        return this.DeployMAC;
    }

    /**
     * Set 部署网络下分配的MAC地址
     * @param DeployMAC 部署网络下分配的MAC地址
     */
    public void setDeployMAC(String DeployMAC) {
        this.DeployMAC = DeployMAC;
    }

    /**
     * Get 设备托管类型。
HOSTING: 托管
TENANT: 租赁 
     * @return TenantType 设备托管类型。
HOSTING: 托管
TENANT: 租赁
     */
    public String getTenantType() {
        return this.TenantType;
    }

    /**
     * Set 设备托管类型。
HOSTING: 托管
TENANT: 租赁
     * @param TenantType 设备托管类型。
HOSTING: 托管
TENANT: 租赁
     */
    public void setTenantType(String TenantType) {
        this.TenantType = TenantType;
    }

    /**
     * Get chc dhcp选项，用于minios调试。 
     * @return DeployExtraConfig chc dhcp选项，用于minios调试。
     */
    public ChcDeployExtraConfig getDeployExtraConfig() {
        return this.DeployExtraConfig;
    }

    /**
     * Set chc dhcp选项，用于minios调试。
     * @param DeployExtraConfig chc dhcp选项，用于minios调试。
     */
    public void setDeployExtraConfig(ChcDeployExtraConfig DeployExtraConfig) {
        this.DeployExtraConfig = DeployExtraConfig;
    }

    /**
     * Get GPU型号。 
     * @return Gpu GPU型号。
     */
    public String getGpu() {
        return this.Gpu;
    }

    /**
     * Set GPU型号。
     * @param Gpu GPU型号。
     */
    public void setGpu(String Gpu) {
        this.Gpu = Gpu;
    }

    /**
     * Get 网卡型号。主要指RDMA网卡。 
     * @return NetworkCard 网卡型号。主要指RDMA网卡。
     */
    public String getNetworkCard() {
        return this.NetworkCard;
    }

    /**
     * Set 网卡型号。主要指RDMA网卡。
     * @param NetworkCard 网卡型号。主要指RDMA网卡。
     */
    public void setNetworkCard(String NetworkCard) {
        this.NetworkCard = NetworkCard;
    }

    /**
     * Get 是否是预定义机型。 
     * @return IsPredefinedType 是否是预定义机型。
     */
    public Boolean getIsPredefinedType() {
        return this.IsPredefinedType;
    }

    /**
     * Set 是否是预定义机型。
     * @param IsPredefinedType 是否是预定义机型。
     */
    public void setIsPredefinedType(Boolean IsPredefinedType) {
        this.IsPredefinedType = IsPredefinedType;
    }

    /**
     * Get CHC云主机机型。 
     * @return ChcInstanceType CHC云主机机型。
     */
    public String getChcInstanceType() {
        return this.ChcInstanceType;
    }

    /**
     * Set CHC云主机机型。
     * @param ChcInstanceType CHC云主机机型。
     */
    public void setChcInstanceType(String ChcInstanceType) {
        this.ChcInstanceType = ChcInstanceType;
    }

    /**
     * Get CHC云主机机型簇。 
     * @return ChcInstanceFamily CHC云主机机型簇。
     */
    public String getChcInstanceFamily() {
        return this.ChcInstanceFamily;
    }

    /**
     * Set CHC云主机机型簇。
     * @param ChcInstanceFamily CHC云主机机型簇。
     */
    public void setChcInstanceFamily(String ChcInstanceFamily) {
        this.ChcInstanceFamily = ChcInstanceFamily;
    }

    /**
     * Get CHC云主机机型簇名称。 
     * @return ChcInstanceFamilyName CHC云主机机型簇名称。
     */
    public String getChcInstanceFamilyName() {
        return this.ChcInstanceFamilyName;
    }

    /**
     * Set CHC云主机机型簇名称。
     * @param ChcInstanceFamilyName CHC云主机机型簇名称。
     */
    public void setChcInstanceFamilyName(String ChcInstanceFamilyName) {
        this.ChcInstanceFamilyName = ChcInstanceFamilyName;
    }

    /**
     * Get 转售客户的AppId。 
     * @return ResaleAppId 转售客户的AppId。
     */
    public String getResaleAppId() {
        return this.ResaleAppId;
    }

    /**
     * Set 转售客户的AppId。
     * @param ResaleAppId 转售客户的AppId。
     */
    public void setResaleAppId(String ResaleAppId) {
        this.ResaleAppId = ResaleAppId;
    }

    /**
     * Get 转售客户的账号ID。 
     * @return ResaleAccountId 转售客户的账号ID。
     */
    public String getResaleAccountId() {
        return this.ResaleAccountId;
    }

    /**
     * Set 转售客户的账号ID。
     * @param ResaleAccountId 转售客户的账号ID。
     */
    public void setResaleAccountId(String ResaleAccountId) {
        this.ResaleAccountId = ResaleAccountId;
    }

    /**
     * Get 售卖状态。<br/>
<ul>
<li>NOT_FOR_SALE:不可售卖</li>
<li>AVAILABLE: 可售卖</li>
<li>SOLD: 已售卖</li>
</ul>
 
     * @return SaleStatus 售卖状态。<br/>
<ul>
<li>NOT_FOR_SALE:不可售卖</li>
<li>AVAILABLE: 可售卖</li>
<li>SOLD: 已售卖</li>
</ul>

     */
    public String getSaleStatus() {
        return this.SaleStatus;
    }

    /**
     * Set 售卖状态。<br/>
<ul>
<li>NOT_FOR_SALE:不可售卖</li>
<li>AVAILABLE: 可售卖</li>
<li>SOLD: 已售卖</li>
</ul>

     * @param SaleStatus 售卖状态。<br/>
<ul>
<li>NOT_FOR_SALE:不可售卖</li>
<li>AVAILABLE: 可售卖</li>
<li>SOLD: 已售卖</li>
</ul>

     */
    public void setSaleStatus(String SaleStatus) {
        this.SaleStatus = SaleStatus;
    }

    /**
     * Get CHC物理服务器关联的标签列表。 
     * @return Tags CHC物理服务器关联的标签列表。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set CHC物理服务器关联的标签列表。
     * @param Tags CHC物理服务器关联的标签列表。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 最近操作 
     * @return LatestOperation 最近操作
     */
    public String getLatestOperation() {
        return this.LatestOperation;
    }

    /**
     * Set 最近操作
     * @param LatestOperation 最近操作
     */
    public void setLatestOperation(String LatestOperation) {
        this.LatestOperation = LatestOperation;
    }

    /**
     * Get 最近操作错误码 
     * @return LatestOperationErrorCode 最近操作错误码
     */
    public String getLatestOperationErrorCode() {
        return this.LatestOperationErrorCode;
    }

    /**
     * Set 最近操作错误码
     * @param LatestOperationErrorCode 最近操作错误码
     */
    public void setLatestOperationErrorCode(String LatestOperationErrorCode) {
        this.LatestOperationErrorCode = LatestOperationErrorCode;
    }

    /**
     * Get 最近操作错误详情和建议项 
     * @return LatestOperationErrorMsg 最近操作错误详情和建议项
     */
    public String getLatestOperationErrorMsg() {
        return this.LatestOperationErrorMsg;
    }

    /**
     * Set 最近操作错误详情和建议项
     * @param LatestOperationErrorMsg 最近操作错误详情和建议项
     */
    public void setLatestOperationErrorMsg(String LatestOperationErrorMsg) {
        this.LatestOperationErrorMsg = LatestOperationErrorMsg;
    }

    /**
     * Get 最近操作名称 
     * @return LatestOperationName 最近操作名称
     */
    public String getLatestOperationName() {
        return this.LatestOperationName;
    }

    /**
     * Set 最近操作名称
     * @param LatestOperationName 最近操作名称
     */
    public void setLatestOperationName(String LatestOperationName) {
        this.LatestOperationName = LatestOperationName;
    }

    /**
     * Get 最近操作状态 
     * @return LatestOperationState 最近操作状态
     */
    public String getLatestOperationState() {
        return this.LatestOperationState;
    }

    /**
     * Set 最近操作状态
     * @param LatestOperationState 最近操作状态
     */
    public void setLatestOperationState(String LatestOperationState) {
        this.LatestOperationState = LatestOperationState;
    }

    public ChcHost() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChcHost(ChcHost source) {
        if (source.ChcId != null) {
            this.ChcId = new String(source.ChcId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.SerialNumber != null) {
            this.SerialNumber = new String(source.SerialNumber);
        }
        if (source.InstanceState != null) {
            this.InstanceState = new String(source.InstanceState);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.Placement != null) {
            this.Placement = new Placement(source.Placement);
        }
        if (source.BmcVirtualPrivateCloud != null) {
            this.BmcVirtualPrivateCloud = new VirtualPrivateCloud(source.BmcVirtualPrivateCloud);
        }
        if (source.BmcIp != null) {
            this.BmcIp = new String(source.BmcIp);
        }
        if (source.BmcSecurityGroupIds != null) {
            this.BmcSecurityGroupIds = new String[source.BmcSecurityGroupIds.length];
            for (int i = 0; i < source.BmcSecurityGroupIds.length; i++) {
                this.BmcSecurityGroupIds[i] = new String(source.BmcSecurityGroupIds[i]);
            }
        }
        if (source.DeployVirtualPrivateCloud != null) {
            this.DeployVirtualPrivateCloud = new VirtualPrivateCloud(source.DeployVirtualPrivateCloud);
        }
        if (source.DeployIp != null) {
            this.DeployIp = new String(source.DeployIp);
        }
        if (source.DeploySecurityGroupIds != null) {
            this.DeploySecurityGroupIds = new String[source.DeploySecurityGroupIds.length];
            for (int i = 0; i < source.DeploySecurityGroupIds.length; i++) {
                this.DeploySecurityGroupIds[i] = new String(source.DeploySecurityGroupIds[i]);
            }
        }
        if (source.CvmInstanceId != null) {
            this.CvmInstanceId = new String(source.CvmInstanceId);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.HardwareDescription != null) {
            this.HardwareDescription = new String(source.HardwareDescription);
        }
        if (source.CPU != null) {
            this.CPU = new Long(source.CPU);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Disk != null) {
            this.Disk = new String(source.Disk);
        }
        if (source.BmcMAC != null) {
            this.BmcMAC = new String(source.BmcMAC);
        }
        if (source.DeployMAC != null) {
            this.DeployMAC = new String(source.DeployMAC);
        }
        if (source.TenantType != null) {
            this.TenantType = new String(source.TenantType);
        }
        if (source.DeployExtraConfig != null) {
            this.DeployExtraConfig = new ChcDeployExtraConfig(source.DeployExtraConfig);
        }
        if (source.Gpu != null) {
            this.Gpu = new String(source.Gpu);
        }
        if (source.NetworkCard != null) {
            this.NetworkCard = new String(source.NetworkCard);
        }
        if (source.IsPredefinedType != null) {
            this.IsPredefinedType = new Boolean(source.IsPredefinedType);
        }
        if (source.ChcInstanceType != null) {
            this.ChcInstanceType = new String(source.ChcInstanceType);
        }
        if (source.ChcInstanceFamily != null) {
            this.ChcInstanceFamily = new String(source.ChcInstanceFamily);
        }
        if (source.ChcInstanceFamilyName != null) {
            this.ChcInstanceFamilyName = new String(source.ChcInstanceFamilyName);
        }
        if (source.ResaleAppId != null) {
            this.ResaleAppId = new String(source.ResaleAppId);
        }
        if (source.ResaleAccountId != null) {
            this.ResaleAccountId = new String(source.ResaleAccountId);
        }
        if (source.SaleStatus != null) {
            this.SaleStatus = new String(source.SaleStatus);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.LatestOperation != null) {
            this.LatestOperation = new String(source.LatestOperation);
        }
        if (source.LatestOperationErrorCode != null) {
            this.LatestOperationErrorCode = new String(source.LatestOperationErrorCode);
        }
        if (source.LatestOperationErrorMsg != null) {
            this.LatestOperationErrorMsg = new String(source.LatestOperationErrorMsg);
        }
        if (source.LatestOperationName != null) {
            this.LatestOperationName = new String(source.LatestOperationName);
        }
        if (source.LatestOperationState != null) {
            this.LatestOperationState = new String(source.LatestOperationState);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChcId", this.ChcId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "SerialNumber", this.SerialNumber);
        this.setParamSimple(map, prefix + "InstanceState", this.InstanceState);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamObj(map, prefix + "BmcVirtualPrivateCloud.", this.BmcVirtualPrivateCloud);
        this.setParamSimple(map, prefix + "BmcIp", this.BmcIp);
        this.setParamArraySimple(map, prefix + "BmcSecurityGroupIds.", this.BmcSecurityGroupIds);
        this.setParamObj(map, prefix + "DeployVirtualPrivateCloud.", this.DeployVirtualPrivateCloud);
        this.setParamSimple(map, prefix + "DeployIp", this.DeployIp);
        this.setParamArraySimple(map, prefix + "DeploySecurityGroupIds.", this.DeploySecurityGroupIds);
        this.setParamSimple(map, prefix + "CvmInstanceId", this.CvmInstanceId);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "HardwareDescription", this.HardwareDescription);
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Disk", this.Disk);
        this.setParamSimple(map, prefix + "BmcMAC", this.BmcMAC);
        this.setParamSimple(map, prefix + "DeployMAC", this.DeployMAC);
        this.setParamSimple(map, prefix + "TenantType", this.TenantType);
        this.setParamObj(map, prefix + "DeployExtraConfig.", this.DeployExtraConfig);
        this.setParamSimple(map, prefix + "Gpu", this.Gpu);
        this.setParamSimple(map, prefix + "NetworkCard", this.NetworkCard);
        this.setParamSimple(map, prefix + "IsPredefinedType", this.IsPredefinedType);
        this.setParamSimple(map, prefix + "ChcInstanceType", this.ChcInstanceType);
        this.setParamSimple(map, prefix + "ChcInstanceFamily", this.ChcInstanceFamily);
        this.setParamSimple(map, prefix + "ChcInstanceFamilyName", this.ChcInstanceFamilyName);
        this.setParamSimple(map, prefix + "ResaleAppId", this.ResaleAppId);
        this.setParamSimple(map, prefix + "ResaleAccountId", this.ResaleAccountId);
        this.setParamSimple(map, prefix + "SaleStatus", this.SaleStatus);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "LatestOperation", this.LatestOperation);
        this.setParamSimple(map, prefix + "LatestOperationErrorCode", this.LatestOperationErrorCode);
        this.setParamSimple(map, prefix + "LatestOperationErrorMsg", this.LatestOperationErrorMsg);
        this.setParamSimple(map, prefix + "LatestOperationName", this.LatestOperationName);
        this.setParamSimple(map, prefix + "LatestOperationState", this.LatestOperationState);

    }
}

