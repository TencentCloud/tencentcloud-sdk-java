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
    * <p>CHC物理服务器ID。</p>
    */
    @SerializedName("ChcId")
    @Expose
    private String ChcId;

    /**
    * <p>实例名称。</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>服务器序列号。</p>
    */
    @SerializedName("SerialNumber")
    @Expose
    private String SerialNumber;

    /**
    * <p>CHC的状态<br></p><ul><li>INIT: 设备已录入。还未配置带外和部署网络</li><li>READY: 已配置带外和部署网络</li><li>PREPARED: 可分配云主机</li><li>ONLINE: 已分配云主机</li><li>OPERATING: 设备操作中，如正在配置带外网络等。</li><li>CLEAR_NETWORK_FAILED: 清理带外和部署网络失败</li></ul>
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
    * <p>设备类型。</p>
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * <p>所属可用区。</p>
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * <p>带外网络。</p>
    */
    @SerializedName("BmcVirtualPrivateCloud")
    @Expose
    private VirtualPrivateCloud BmcVirtualPrivateCloud;

    /**
    * <p>带外网络IP。</p>
    */
    @SerializedName("BmcIp")
    @Expose
    private String BmcIp;

    /**
    * <p>带外网络安全组ID。</p>
    */
    @SerializedName("BmcSecurityGroupIds")
    @Expose
    private String [] BmcSecurityGroupIds;

    /**
    * <p>部署网络。</p>
    */
    @SerializedName("DeployVirtualPrivateCloud")
    @Expose
    private VirtualPrivateCloud DeployVirtualPrivateCloud;

    /**
    * <p>部署网络IP。</p>
    */
    @SerializedName("DeployIp")
    @Expose
    private String DeployIp;

    /**
    * <p>部署网络安全组ID。</p>
    */
    @SerializedName("DeploySecurityGroupIds")
    @Expose
    private String [] DeploySecurityGroupIds;

    /**
    * <p>关联的云主机ID。</p>
    */
    @SerializedName("CvmInstanceId")
    @Expose
    private String CvmInstanceId;

    /**
    * <p>服务器导入的时间。</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>机型的硬件描述，分别为CPU核数，内存容量和磁盘容量。</p>
    */
    @SerializedName("HardwareDescription")
    @Expose
    private String HardwareDescription;

    /**
    * <p>CHC物理服务器的CPU核数。</p>
    */
    @SerializedName("CPU")
    @Expose
    private Long CPU;

    /**
    * <p>CHC物理服务器的内存大小，单位为GB。</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>CHC物理服务器的磁盘信息。</p>
    */
    @SerializedName("Disk")
    @Expose
    private String Disk;

    /**
    * <p>带外网络下分配的MAC地址。</p>
    */
    @SerializedName("BmcMAC")
    @Expose
    private String BmcMAC;

    /**
    * <p>部署网络下分配的MAC地址。</p>
    */
    @SerializedName("DeployMAC")
    @Expose
    private String DeployMAC;

    /**
    * <p>设备托管类型。</p><p>枚举值：</p><ul><li>HOSTING： 托管类型。</li><li>TENANT： 租赁类型。</li></ul>
    */
    @SerializedName("TenantType")
    @Expose
    private String TenantType;

    /**
    * <p>CHC DHCP选项，用于客户自建PXE环境。</p>
    */
    @SerializedName("DeployExtraConfig")
    @Expose
    private ChcDeployExtraConfig DeployExtraConfig;

    /**
    * <p>GPU型号。</p>
    */
    @SerializedName("Gpu")
    @Expose
    private String Gpu;

    /**
    * <p>网卡型号。主要指RDMA网卡。</p>
    */
    @SerializedName("NetworkCard")
    @Expose
    private String NetworkCard;

    /**
    * <p>是否是预定义机型。</p>
    */
    @SerializedName("IsPredefinedType")
    @Expose
    private Boolean IsPredefinedType;

    /**
    * <p>CHC云主机机型。</p>
    */
    @SerializedName("ChcInstanceType")
    @Expose
    private String ChcInstanceType;

    /**
    * <p>CHC云主机机型簇。</p>
    */
    @SerializedName("ChcInstanceFamily")
    @Expose
    private String ChcInstanceFamily;

    /**
    * <p>CHC云主机机型簇名称。</p>
    */
    @SerializedName("ChcInstanceFamilyName")
    @Expose
    private String ChcInstanceFamilyName;

    /**
    * <p>转售客户的AppID。</p>
    */
    @SerializedName("ResaleAppId")
    @Expose
    private String ResaleAppId;

    /**
    * <p>转售客户的账号ID。</p>
    */
    @SerializedName("ResaleAccountId")
    @Expose
    private String ResaleAccountId;

    /**
    * <p>售卖状态。<br></p><ul><li>NOT_FOR_SALE:不可售卖</li><li>AVAILABLE: 可售卖</li><li>SOLD: 已售卖</li></ul>
    */
    @SerializedName("SaleStatus")
    @Expose
    private String SaleStatus;

    /**
    * <p>CHC物理服务器关联的标签列表。</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>最近操作。</p>
    */
    @SerializedName("LatestOperation")
    @Expose
    private String LatestOperation;

    /**
    * <p>最近操作错误码。</p>
    */
    @SerializedName("LatestOperationErrorCode")
    @Expose
    private String LatestOperationErrorCode;

    /**
    * <p>最近操作错误详情和建议项。</p>
    */
    @SerializedName("LatestOperationErrorMsg")
    @Expose
    private String LatestOperationErrorMsg;

    /**
    * <p>最近操作名称。</p>
    */
    @SerializedName("LatestOperationName")
    @Expose
    private String LatestOperationName;

    /**
    * <p>最近操作状态。</p><p>枚举值：</p><ul><li>SUCCESS： 成功。</li><li>FAILED： 失败。</li></ul>
    */
    @SerializedName("LatestOperationState")
    @Expose
    private String LatestOperationState;

    /**
    * <p>所在的CHC网关的ID，只有专属网关才会返回。</p>
    */
    @SerializedName("ChcGatewayId")
    @Expose
    private String ChcGatewayId;

    /**
    * <p>所属的CDC集群ID。</p>
    */
    @SerializedName("DedicatedClusterId")
    @Expose
    private String DedicatedClusterId;

    /**
    * <p>业务网卡网络模式。</p><p>枚举值：</p><ul><li>DEPLOY： 部署网络模式</li><li>BUSINESS： 业务网络模式</li></ul>
    */
    @SerializedName("NetworkMode")
    @Expose
    private String NetworkMode;

    /**
     * Get <p>CHC物理服务器ID。</p> 
     * @return ChcId <p>CHC物理服务器ID。</p>
     */
    public String getChcId() {
        return this.ChcId;
    }

    /**
     * Set <p>CHC物理服务器ID。</p>
     * @param ChcId <p>CHC物理服务器ID。</p>
     */
    public void setChcId(String ChcId) {
        this.ChcId = ChcId;
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
     * Get <p>服务器序列号。</p> 
     * @return SerialNumber <p>服务器序列号。</p>
     */
    public String getSerialNumber() {
        return this.SerialNumber;
    }

    /**
     * Set <p>服务器序列号。</p>
     * @param SerialNumber <p>服务器序列号。</p>
     */
    public void setSerialNumber(String SerialNumber) {
        this.SerialNumber = SerialNumber;
    }

    /**
     * Get <p>CHC的状态<br></p><ul><li>INIT: 设备已录入。还未配置带外和部署网络</li><li>READY: 已配置带外和部署网络</li><li>PREPARED: 可分配云主机</li><li>ONLINE: 已分配云主机</li><li>OPERATING: 设备操作中，如正在配置带外网络等。</li><li>CLEAR_NETWORK_FAILED: 清理带外和部署网络失败</li></ul> 
     * @return InstanceState <p>CHC的状态<br></p><ul><li>INIT: 设备已录入。还未配置带外和部署网络</li><li>READY: 已配置带外和部署网络</li><li>PREPARED: 可分配云主机</li><li>ONLINE: 已分配云主机</li><li>OPERATING: 设备操作中，如正在配置带外网络等。</li><li>CLEAR_NETWORK_FAILED: 清理带外和部署网络失败</li></ul>
     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set <p>CHC的状态<br></p><ul><li>INIT: 设备已录入。还未配置带外和部署网络</li><li>READY: 已配置带外和部署网络</li><li>PREPARED: 可分配云主机</li><li>ONLINE: 已分配云主机</li><li>OPERATING: 设备操作中，如正在配置带外网络等。</li><li>CLEAR_NETWORK_FAILED: 清理带外和部署网络失败</li></ul>
     * @param InstanceState <p>CHC的状态<br></p><ul><li>INIT: 设备已录入。还未配置带外和部署网络</li><li>READY: 已配置带外和部署网络</li><li>PREPARED: 可分配云主机</li><li>ONLINE: 已分配云主机</li><li>OPERATING: 设备操作中，如正在配置带外网络等。</li><li>CLEAR_NETWORK_FAILED: 清理带外和部署网络失败</li></ul>
     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    /**
     * Get <p>设备类型。</p> 
     * @return DeviceType <p>设备类型。</p>
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set <p>设备类型。</p>
     * @param DeviceType <p>设备类型。</p>
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get <p>所属可用区。</p> 
     * @return Placement <p>所属可用区。</p>
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set <p>所属可用区。</p>
     * @param Placement <p>所属可用区。</p>
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get <p>带外网络。</p> 
     * @return BmcVirtualPrivateCloud <p>带外网络。</p>
     */
    public VirtualPrivateCloud getBmcVirtualPrivateCloud() {
        return this.BmcVirtualPrivateCloud;
    }

    /**
     * Set <p>带外网络。</p>
     * @param BmcVirtualPrivateCloud <p>带外网络。</p>
     */
    public void setBmcVirtualPrivateCloud(VirtualPrivateCloud BmcVirtualPrivateCloud) {
        this.BmcVirtualPrivateCloud = BmcVirtualPrivateCloud;
    }

    /**
     * Get <p>带外网络IP。</p> 
     * @return BmcIp <p>带外网络IP。</p>
     */
    public String getBmcIp() {
        return this.BmcIp;
    }

    /**
     * Set <p>带外网络IP。</p>
     * @param BmcIp <p>带外网络IP。</p>
     */
    public void setBmcIp(String BmcIp) {
        this.BmcIp = BmcIp;
    }

    /**
     * Get <p>带外网络安全组ID。</p> 
     * @return BmcSecurityGroupIds <p>带外网络安全组ID。</p>
     */
    public String [] getBmcSecurityGroupIds() {
        return this.BmcSecurityGroupIds;
    }

    /**
     * Set <p>带外网络安全组ID。</p>
     * @param BmcSecurityGroupIds <p>带外网络安全组ID。</p>
     */
    public void setBmcSecurityGroupIds(String [] BmcSecurityGroupIds) {
        this.BmcSecurityGroupIds = BmcSecurityGroupIds;
    }

    /**
     * Get <p>部署网络。</p> 
     * @return DeployVirtualPrivateCloud <p>部署网络。</p>
     */
    public VirtualPrivateCloud getDeployVirtualPrivateCloud() {
        return this.DeployVirtualPrivateCloud;
    }

    /**
     * Set <p>部署网络。</p>
     * @param DeployVirtualPrivateCloud <p>部署网络。</p>
     */
    public void setDeployVirtualPrivateCloud(VirtualPrivateCloud DeployVirtualPrivateCloud) {
        this.DeployVirtualPrivateCloud = DeployVirtualPrivateCloud;
    }

    /**
     * Get <p>部署网络IP。</p> 
     * @return DeployIp <p>部署网络IP。</p>
     */
    public String getDeployIp() {
        return this.DeployIp;
    }

    /**
     * Set <p>部署网络IP。</p>
     * @param DeployIp <p>部署网络IP。</p>
     */
    public void setDeployIp(String DeployIp) {
        this.DeployIp = DeployIp;
    }

    /**
     * Get <p>部署网络安全组ID。</p> 
     * @return DeploySecurityGroupIds <p>部署网络安全组ID。</p>
     */
    public String [] getDeploySecurityGroupIds() {
        return this.DeploySecurityGroupIds;
    }

    /**
     * Set <p>部署网络安全组ID。</p>
     * @param DeploySecurityGroupIds <p>部署网络安全组ID。</p>
     */
    public void setDeploySecurityGroupIds(String [] DeploySecurityGroupIds) {
        this.DeploySecurityGroupIds = DeploySecurityGroupIds;
    }

    /**
     * Get <p>关联的云主机ID。</p> 
     * @return CvmInstanceId <p>关联的云主机ID。</p>
     */
    public String getCvmInstanceId() {
        return this.CvmInstanceId;
    }

    /**
     * Set <p>关联的云主机ID。</p>
     * @param CvmInstanceId <p>关联的云主机ID。</p>
     */
    public void setCvmInstanceId(String CvmInstanceId) {
        this.CvmInstanceId = CvmInstanceId;
    }

    /**
     * Get <p>服务器导入的时间。</p> 
     * @return CreatedTime <p>服务器导入的时间。</p>
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>服务器导入的时间。</p>
     * @param CreatedTime <p>服务器导入的时间。</p>
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>机型的硬件描述，分别为CPU核数，内存容量和磁盘容量。</p> 
     * @return HardwareDescription <p>机型的硬件描述，分别为CPU核数，内存容量和磁盘容量。</p>
     */
    public String getHardwareDescription() {
        return this.HardwareDescription;
    }

    /**
     * Set <p>机型的硬件描述，分别为CPU核数，内存容量和磁盘容量。</p>
     * @param HardwareDescription <p>机型的硬件描述，分别为CPU核数，内存容量和磁盘容量。</p>
     */
    public void setHardwareDescription(String HardwareDescription) {
        this.HardwareDescription = HardwareDescription;
    }

    /**
     * Get <p>CHC物理服务器的CPU核数。</p> 
     * @return CPU <p>CHC物理服务器的CPU核数。</p>
     */
    public Long getCPU() {
        return this.CPU;
    }

    /**
     * Set <p>CHC物理服务器的CPU核数。</p>
     * @param CPU <p>CHC物理服务器的CPU核数。</p>
     */
    public void setCPU(Long CPU) {
        this.CPU = CPU;
    }

    /**
     * Get <p>CHC物理服务器的内存大小，单位为GB。</p> 
     * @return Memory <p>CHC物理服务器的内存大小，单位为GB。</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>CHC物理服务器的内存大小，单位为GB。</p>
     * @param Memory <p>CHC物理服务器的内存大小，单位为GB。</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>CHC物理服务器的磁盘信息。</p> 
     * @return Disk <p>CHC物理服务器的磁盘信息。</p>
     */
    public String getDisk() {
        return this.Disk;
    }

    /**
     * Set <p>CHC物理服务器的磁盘信息。</p>
     * @param Disk <p>CHC物理服务器的磁盘信息。</p>
     */
    public void setDisk(String Disk) {
        this.Disk = Disk;
    }

    /**
     * Get <p>带外网络下分配的MAC地址。</p> 
     * @return BmcMAC <p>带外网络下分配的MAC地址。</p>
     */
    public String getBmcMAC() {
        return this.BmcMAC;
    }

    /**
     * Set <p>带外网络下分配的MAC地址。</p>
     * @param BmcMAC <p>带外网络下分配的MAC地址。</p>
     */
    public void setBmcMAC(String BmcMAC) {
        this.BmcMAC = BmcMAC;
    }

    /**
     * Get <p>部署网络下分配的MAC地址。</p> 
     * @return DeployMAC <p>部署网络下分配的MAC地址。</p>
     */
    public String getDeployMAC() {
        return this.DeployMAC;
    }

    /**
     * Set <p>部署网络下分配的MAC地址。</p>
     * @param DeployMAC <p>部署网络下分配的MAC地址。</p>
     */
    public void setDeployMAC(String DeployMAC) {
        this.DeployMAC = DeployMAC;
    }

    /**
     * Get <p>设备托管类型。</p><p>枚举值：</p><ul><li>HOSTING： 托管类型。</li><li>TENANT： 租赁类型。</li></ul> 
     * @return TenantType <p>设备托管类型。</p><p>枚举值：</p><ul><li>HOSTING： 托管类型。</li><li>TENANT： 租赁类型。</li></ul>
     */
    public String getTenantType() {
        return this.TenantType;
    }

    /**
     * Set <p>设备托管类型。</p><p>枚举值：</p><ul><li>HOSTING： 托管类型。</li><li>TENANT： 租赁类型。</li></ul>
     * @param TenantType <p>设备托管类型。</p><p>枚举值：</p><ul><li>HOSTING： 托管类型。</li><li>TENANT： 租赁类型。</li></ul>
     */
    public void setTenantType(String TenantType) {
        this.TenantType = TenantType;
    }

    /**
     * Get <p>CHC DHCP选项，用于客户自建PXE环境。</p> 
     * @return DeployExtraConfig <p>CHC DHCP选项，用于客户自建PXE环境。</p>
     */
    public ChcDeployExtraConfig getDeployExtraConfig() {
        return this.DeployExtraConfig;
    }

    /**
     * Set <p>CHC DHCP选项，用于客户自建PXE环境。</p>
     * @param DeployExtraConfig <p>CHC DHCP选项，用于客户自建PXE环境。</p>
     */
    public void setDeployExtraConfig(ChcDeployExtraConfig DeployExtraConfig) {
        this.DeployExtraConfig = DeployExtraConfig;
    }

    /**
     * Get <p>GPU型号。</p> 
     * @return Gpu <p>GPU型号。</p>
     */
    public String getGpu() {
        return this.Gpu;
    }

    /**
     * Set <p>GPU型号。</p>
     * @param Gpu <p>GPU型号。</p>
     */
    public void setGpu(String Gpu) {
        this.Gpu = Gpu;
    }

    /**
     * Get <p>网卡型号。主要指RDMA网卡。</p> 
     * @return NetworkCard <p>网卡型号。主要指RDMA网卡。</p>
     */
    public String getNetworkCard() {
        return this.NetworkCard;
    }

    /**
     * Set <p>网卡型号。主要指RDMA网卡。</p>
     * @param NetworkCard <p>网卡型号。主要指RDMA网卡。</p>
     */
    public void setNetworkCard(String NetworkCard) {
        this.NetworkCard = NetworkCard;
    }

    /**
     * Get <p>是否是预定义机型。</p> 
     * @return IsPredefinedType <p>是否是预定义机型。</p>
     */
    public Boolean getIsPredefinedType() {
        return this.IsPredefinedType;
    }

    /**
     * Set <p>是否是预定义机型。</p>
     * @param IsPredefinedType <p>是否是预定义机型。</p>
     */
    public void setIsPredefinedType(Boolean IsPredefinedType) {
        this.IsPredefinedType = IsPredefinedType;
    }

    /**
     * Get <p>CHC云主机机型。</p> 
     * @return ChcInstanceType <p>CHC云主机机型。</p>
     */
    public String getChcInstanceType() {
        return this.ChcInstanceType;
    }

    /**
     * Set <p>CHC云主机机型。</p>
     * @param ChcInstanceType <p>CHC云主机机型。</p>
     */
    public void setChcInstanceType(String ChcInstanceType) {
        this.ChcInstanceType = ChcInstanceType;
    }

    /**
     * Get <p>CHC云主机机型簇。</p> 
     * @return ChcInstanceFamily <p>CHC云主机机型簇。</p>
     */
    public String getChcInstanceFamily() {
        return this.ChcInstanceFamily;
    }

    /**
     * Set <p>CHC云主机机型簇。</p>
     * @param ChcInstanceFamily <p>CHC云主机机型簇。</p>
     */
    public void setChcInstanceFamily(String ChcInstanceFamily) {
        this.ChcInstanceFamily = ChcInstanceFamily;
    }

    /**
     * Get <p>CHC云主机机型簇名称。</p> 
     * @return ChcInstanceFamilyName <p>CHC云主机机型簇名称。</p>
     */
    public String getChcInstanceFamilyName() {
        return this.ChcInstanceFamilyName;
    }

    /**
     * Set <p>CHC云主机机型簇名称。</p>
     * @param ChcInstanceFamilyName <p>CHC云主机机型簇名称。</p>
     */
    public void setChcInstanceFamilyName(String ChcInstanceFamilyName) {
        this.ChcInstanceFamilyName = ChcInstanceFamilyName;
    }

    /**
     * Get <p>转售客户的AppID。</p> 
     * @return ResaleAppId <p>转售客户的AppID。</p>
     */
    public String getResaleAppId() {
        return this.ResaleAppId;
    }

    /**
     * Set <p>转售客户的AppID。</p>
     * @param ResaleAppId <p>转售客户的AppID。</p>
     */
    public void setResaleAppId(String ResaleAppId) {
        this.ResaleAppId = ResaleAppId;
    }

    /**
     * Get <p>转售客户的账号ID。</p> 
     * @return ResaleAccountId <p>转售客户的账号ID。</p>
     */
    public String getResaleAccountId() {
        return this.ResaleAccountId;
    }

    /**
     * Set <p>转售客户的账号ID。</p>
     * @param ResaleAccountId <p>转售客户的账号ID。</p>
     */
    public void setResaleAccountId(String ResaleAccountId) {
        this.ResaleAccountId = ResaleAccountId;
    }

    /**
     * Get <p>售卖状态。<br></p><ul><li>NOT_FOR_SALE:不可售卖</li><li>AVAILABLE: 可售卖</li><li>SOLD: 已售卖</li></ul> 
     * @return SaleStatus <p>售卖状态。<br></p><ul><li>NOT_FOR_SALE:不可售卖</li><li>AVAILABLE: 可售卖</li><li>SOLD: 已售卖</li></ul>
     */
    public String getSaleStatus() {
        return this.SaleStatus;
    }

    /**
     * Set <p>售卖状态。<br></p><ul><li>NOT_FOR_SALE:不可售卖</li><li>AVAILABLE: 可售卖</li><li>SOLD: 已售卖</li></ul>
     * @param SaleStatus <p>售卖状态。<br></p><ul><li>NOT_FOR_SALE:不可售卖</li><li>AVAILABLE: 可售卖</li><li>SOLD: 已售卖</li></ul>
     */
    public void setSaleStatus(String SaleStatus) {
        this.SaleStatus = SaleStatus;
    }

    /**
     * Get <p>CHC物理服务器关联的标签列表。</p> 
     * @return Tags <p>CHC物理服务器关联的标签列表。</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>CHC物理服务器关联的标签列表。</p>
     * @param Tags <p>CHC物理服务器关联的标签列表。</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>最近操作。</p> 
     * @return LatestOperation <p>最近操作。</p>
     */
    public String getLatestOperation() {
        return this.LatestOperation;
    }

    /**
     * Set <p>最近操作。</p>
     * @param LatestOperation <p>最近操作。</p>
     */
    public void setLatestOperation(String LatestOperation) {
        this.LatestOperation = LatestOperation;
    }

    /**
     * Get <p>最近操作错误码。</p> 
     * @return LatestOperationErrorCode <p>最近操作错误码。</p>
     */
    public String getLatestOperationErrorCode() {
        return this.LatestOperationErrorCode;
    }

    /**
     * Set <p>最近操作错误码。</p>
     * @param LatestOperationErrorCode <p>最近操作错误码。</p>
     */
    public void setLatestOperationErrorCode(String LatestOperationErrorCode) {
        this.LatestOperationErrorCode = LatestOperationErrorCode;
    }

    /**
     * Get <p>最近操作错误详情和建议项。</p> 
     * @return LatestOperationErrorMsg <p>最近操作错误详情和建议项。</p>
     */
    public String getLatestOperationErrorMsg() {
        return this.LatestOperationErrorMsg;
    }

    /**
     * Set <p>最近操作错误详情和建议项。</p>
     * @param LatestOperationErrorMsg <p>最近操作错误详情和建议项。</p>
     */
    public void setLatestOperationErrorMsg(String LatestOperationErrorMsg) {
        this.LatestOperationErrorMsg = LatestOperationErrorMsg;
    }

    /**
     * Get <p>最近操作名称。</p> 
     * @return LatestOperationName <p>最近操作名称。</p>
     */
    public String getLatestOperationName() {
        return this.LatestOperationName;
    }

    /**
     * Set <p>最近操作名称。</p>
     * @param LatestOperationName <p>最近操作名称。</p>
     */
    public void setLatestOperationName(String LatestOperationName) {
        this.LatestOperationName = LatestOperationName;
    }

    /**
     * Get <p>最近操作状态。</p><p>枚举值：</p><ul><li>SUCCESS： 成功。</li><li>FAILED： 失败。</li></ul> 
     * @return LatestOperationState <p>最近操作状态。</p><p>枚举值：</p><ul><li>SUCCESS： 成功。</li><li>FAILED： 失败。</li></ul>
     */
    public String getLatestOperationState() {
        return this.LatestOperationState;
    }

    /**
     * Set <p>最近操作状态。</p><p>枚举值：</p><ul><li>SUCCESS： 成功。</li><li>FAILED： 失败。</li></ul>
     * @param LatestOperationState <p>最近操作状态。</p><p>枚举值：</p><ul><li>SUCCESS： 成功。</li><li>FAILED： 失败。</li></ul>
     */
    public void setLatestOperationState(String LatestOperationState) {
        this.LatestOperationState = LatestOperationState;
    }

    /**
     * Get <p>所在的CHC网关的ID，只有专属网关才会返回。</p> 
     * @return ChcGatewayId <p>所在的CHC网关的ID，只有专属网关才会返回。</p>
     */
    public String getChcGatewayId() {
        return this.ChcGatewayId;
    }

    /**
     * Set <p>所在的CHC网关的ID，只有专属网关才会返回。</p>
     * @param ChcGatewayId <p>所在的CHC网关的ID，只有专属网关才会返回。</p>
     */
    public void setChcGatewayId(String ChcGatewayId) {
        this.ChcGatewayId = ChcGatewayId;
    }

    /**
     * Get <p>所属的CDC集群ID。</p> 
     * @return DedicatedClusterId <p>所属的CDC集群ID。</p>
     */
    public String getDedicatedClusterId() {
        return this.DedicatedClusterId;
    }

    /**
     * Set <p>所属的CDC集群ID。</p>
     * @param DedicatedClusterId <p>所属的CDC集群ID。</p>
     */
    public void setDedicatedClusterId(String DedicatedClusterId) {
        this.DedicatedClusterId = DedicatedClusterId;
    }

    /**
     * Get <p>业务网卡网络模式。</p><p>枚举值：</p><ul><li>DEPLOY： 部署网络模式</li><li>BUSINESS： 业务网络模式</li></ul> 
     * @return NetworkMode <p>业务网卡网络模式。</p><p>枚举值：</p><ul><li>DEPLOY： 部署网络模式</li><li>BUSINESS： 业务网络模式</li></ul>
     */
    public String getNetworkMode() {
        return this.NetworkMode;
    }

    /**
     * Set <p>业务网卡网络模式。</p><p>枚举值：</p><ul><li>DEPLOY： 部署网络模式</li><li>BUSINESS： 业务网络模式</li></ul>
     * @param NetworkMode <p>业务网卡网络模式。</p><p>枚举值：</p><ul><li>DEPLOY： 部署网络模式</li><li>BUSINESS： 业务网络模式</li></ul>
     */
    public void setNetworkMode(String NetworkMode) {
        this.NetworkMode = NetworkMode;
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
        if (source.ChcGatewayId != null) {
            this.ChcGatewayId = new String(source.ChcGatewayId);
        }
        if (source.DedicatedClusterId != null) {
            this.DedicatedClusterId = new String(source.DedicatedClusterId);
        }
        if (source.NetworkMode != null) {
            this.NetworkMode = new String(source.NetworkMode);
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
        this.setParamSimple(map, prefix + "ChcGatewayId", this.ChcGatewayId);
        this.setParamSimple(map, prefix + "DedicatedClusterId", this.DedicatedClusterId);
        this.setParamSimple(map, prefix + "NetworkMode", this.NetworkMode);

    }
}

