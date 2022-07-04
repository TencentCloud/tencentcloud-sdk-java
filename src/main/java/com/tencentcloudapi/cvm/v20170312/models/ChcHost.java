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

public class ChcHost extends AbstractModel{

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
<li>REGISTERED: 设备已录入。还未配置带外和部署网络</li>
<li>VPC_READY: 已配置带外和部署网络</li>
<li>PREPARED: 可分配云主机</li>
<li>ONLINE: 已分配云主机</li>
</ul>
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
    * 设备类型。
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BmcVirtualPrivateCloud")
    @Expose
    private VirtualPrivateCloud BmcVirtualPrivateCloud;

    /**
    * 带外网络Ip。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BmcIp")
    @Expose
    private String BmcIp;

    /**
    * 带外网络安全组Id。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BmcSecurityGroupIds")
    @Expose
    private String [] BmcSecurityGroupIds;

    /**
    * 部署网络。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeployVirtualPrivateCloud")
    @Expose
    private VirtualPrivateCloud DeployVirtualPrivateCloud;

    /**
    * 部署网络Ip。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeployIp")
    @Expose
    private String DeployIp;

    /**
    * 部署网络安全组Id。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeploySecurityGroupIds")
    @Expose
    private String [] DeploySecurityGroupIds;

    /**
    * 关联的云主机Id。
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HardwareDescription")
    @Expose
    private String HardwareDescription;

    /**
    * CHC物理服务器的CPU核数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CPU")
    @Expose
    private Long CPU;

    /**
    * CHC物理服务器的内存大小，单位为GB
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * CHC物理服务器的磁盘信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Disk")
    @Expose
    private String Disk;

    /**
    * 带外网络下分配的MAC地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BmcMAC")
    @Expose
    private String BmcMAC;

    /**
    * 部署网络下分配的MAC地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeployMAC")
    @Expose
    private String DeployMAC;

    /**
    * 设备托管类型。
HOSTING: 托管
TENANT: 租赁
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TenantType")
    @Expose
    private String TenantType;

    /**
    * chc dhcp选项，用于minios调试
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeployExtraConfig")
    @Expose
    private ChcDeployExtraConfig DeployExtraConfig;

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
<li>REGISTERED: 设备已录入。还未配置带外和部署网络</li>
<li>VPC_READY: 已配置带外和部署网络</li>
<li>PREPARED: 可分配云主机</li>
<li>ONLINE: 已分配云主机</li>
</ul> 
     * @return InstanceState CHC的状态<br/>
<ul>
<li>REGISTERED: 设备已录入。还未配置带外和部署网络</li>
<li>VPC_READY: 已配置带外和部署网络</li>
<li>PREPARED: 可分配云主机</li>
<li>ONLINE: 已分配云主机</li>
</ul>
     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set CHC的状态<br/>
<ul>
<li>REGISTERED: 设备已录入。还未配置带外和部署网络</li>
<li>VPC_READY: 已配置带外和部署网络</li>
<li>PREPARED: 可分配云主机</li>
<li>ONLINE: 已分配云主机</li>
</ul>
     * @param InstanceState CHC的状态<br/>
<ul>
<li>REGISTERED: 设备已录入。还未配置带外和部署网络</li>
<li>VPC_READY: 已配置带外和部署网络</li>
<li>PREPARED: 可分配云主机</li>
<li>ONLINE: 已分配云主机</li>
</ul>
     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    /**
     * Get 设备类型。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceType 设备类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 设备类型。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceType 设备类型。
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BmcVirtualPrivateCloud 带外网络。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VirtualPrivateCloud getBmcVirtualPrivateCloud() {
        return this.BmcVirtualPrivateCloud;
    }

    /**
     * Set 带外网络。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BmcVirtualPrivateCloud 带外网络。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBmcVirtualPrivateCloud(VirtualPrivateCloud BmcVirtualPrivateCloud) {
        this.BmcVirtualPrivateCloud = BmcVirtualPrivateCloud;
    }

    /**
     * Get 带外网络Ip。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BmcIp 带外网络Ip。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBmcIp() {
        return this.BmcIp;
    }

    /**
     * Set 带外网络Ip。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BmcIp 带外网络Ip。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBmcIp(String BmcIp) {
        this.BmcIp = BmcIp;
    }

    /**
     * Get 带外网络安全组Id。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BmcSecurityGroupIds 带外网络安全组Id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getBmcSecurityGroupIds() {
        return this.BmcSecurityGroupIds;
    }

    /**
     * Set 带外网络安全组Id。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BmcSecurityGroupIds 带外网络安全组Id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBmcSecurityGroupIds(String [] BmcSecurityGroupIds) {
        this.BmcSecurityGroupIds = BmcSecurityGroupIds;
    }

    /**
     * Get 部署网络。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeployVirtualPrivateCloud 部署网络。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VirtualPrivateCloud getDeployVirtualPrivateCloud() {
        return this.DeployVirtualPrivateCloud;
    }

    /**
     * Set 部署网络。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeployVirtualPrivateCloud 部署网络。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeployVirtualPrivateCloud(VirtualPrivateCloud DeployVirtualPrivateCloud) {
        this.DeployVirtualPrivateCloud = DeployVirtualPrivateCloud;
    }

    /**
     * Get 部署网络Ip。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeployIp 部署网络Ip。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeployIp() {
        return this.DeployIp;
    }

    /**
     * Set 部署网络Ip。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeployIp 部署网络Ip。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeployIp(String DeployIp) {
        this.DeployIp = DeployIp;
    }

    /**
     * Get 部署网络安全组Id。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeploySecurityGroupIds 部署网络安全组Id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDeploySecurityGroupIds() {
        return this.DeploySecurityGroupIds;
    }

    /**
     * Set 部署网络安全组Id。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeploySecurityGroupIds 部署网络安全组Id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeploySecurityGroupIds(String [] DeploySecurityGroupIds) {
        this.DeploySecurityGroupIds = DeploySecurityGroupIds;
    }

    /**
     * Get 关联的云主机Id。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CvmInstanceId 关联的云主机Id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCvmInstanceId() {
        return this.CvmInstanceId;
    }

    /**
     * Set 关联的云主机Id。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CvmInstanceId 关联的云主机Id。
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HardwareDescription 机型的硬件描述，分别为CPU核数，内存容量和磁盘容量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHardwareDescription() {
        return this.HardwareDescription;
    }

    /**
     * Set 机型的硬件描述，分别为CPU核数，内存容量和磁盘容量
注意：此字段可能返回 null，表示取不到有效值。
     * @param HardwareDescription 机型的硬件描述，分别为CPU核数，内存容量和磁盘容量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHardwareDescription(String HardwareDescription) {
        this.HardwareDescription = HardwareDescription;
    }

    /**
     * Get CHC物理服务器的CPU核数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CPU CHC物理服务器的CPU核数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCPU() {
        return this.CPU;
    }

    /**
     * Set CHC物理服务器的CPU核数
注意：此字段可能返回 null，表示取不到有效值。
     * @param CPU CHC物理服务器的CPU核数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCPU(Long CPU) {
        this.CPU = CPU;
    }

    /**
     * Get CHC物理服务器的内存大小，单位为GB
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Memory CHC物理服务器的内存大小，单位为GB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set CHC物理服务器的内存大小，单位为GB
注意：此字段可能返回 null，表示取不到有效值。
     * @param Memory CHC物理服务器的内存大小，单位为GB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get CHC物理服务器的磁盘信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Disk CHC物理服务器的磁盘信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDisk() {
        return this.Disk;
    }

    /**
     * Set CHC物理服务器的磁盘信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Disk CHC物理服务器的磁盘信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisk(String Disk) {
        this.Disk = Disk;
    }

    /**
     * Get 带外网络下分配的MAC地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BmcMAC 带外网络下分配的MAC地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBmcMAC() {
        return this.BmcMAC;
    }

    /**
     * Set 带外网络下分配的MAC地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param BmcMAC 带外网络下分配的MAC地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBmcMAC(String BmcMAC) {
        this.BmcMAC = BmcMAC;
    }

    /**
     * Get 部署网络下分配的MAC地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeployMAC 部署网络下分配的MAC地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeployMAC() {
        return this.DeployMAC;
    }

    /**
     * Set 部署网络下分配的MAC地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeployMAC 部署网络下分配的MAC地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeployMAC(String DeployMAC) {
        this.DeployMAC = DeployMAC;
    }

    /**
     * Get 设备托管类型。
HOSTING: 托管
TENANT: 租赁
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TenantType 设备托管类型。
HOSTING: 托管
TENANT: 租赁
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTenantType() {
        return this.TenantType;
    }

    /**
     * Set 设备托管类型。
HOSTING: 托管
TENANT: 租赁
注意：此字段可能返回 null，表示取不到有效值。
     * @param TenantType 设备托管类型。
HOSTING: 托管
TENANT: 租赁
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTenantType(String TenantType) {
        this.TenantType = TenantType;
    }

    /**
     * Get chc dhcp选项，用于minios调试
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeployExtraConfig chc dhcp选项，用于minios调试
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ChcDeployExtraConfig getDeployExtraConfig() {
        return this.DeployExtraConfig;
    }

    /**
     * Set chc dhcp选项，用于minios调试
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeployExtraConfig chc dhcp选项，用于minios调试
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeployExtraConfig(ChcDeployExtraConfig DeployExtraConfig) {
        this.DeployExtraConfig = DeployExtraConfig;
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

    }
}

