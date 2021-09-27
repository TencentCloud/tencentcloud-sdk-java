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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetMachineDetail extends AbstractModel{

    /**
    * 服务器Quuid
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 服务器uuid
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 服务器内网IP
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * 服务器名称
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * 操作系统名称
    */
    @SerializedName("OsInfo")
    @Expose
    private String OsInfo;

    /**
    * CPU信息
    */
    @SerializedName("Cpu")
    @Expose
    private String Cpu;

    /**
    * 内存容量：单位G
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * 内存使用率百分比
    */
    @SerializedName("MemLoad")
    @Expose
    private String MemLoad;

    /**
    * 硬盘容量：单位G
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 硬盘使用率百分比
    */
    @SerializedName("DiskLoad")
    @Expose
    private String DiskLoad;

    /**
    * 分区数
    */
    @SerializedName("PartitionCount")
    @Expose
    private Long PartitionCount;

    /**
    * 主机外网IP
    */
    @SerializedName("MachineWanIp")
    @Expose
    private String MachineWanIp;

    /**
    * Cpu数量
    */
    @SerializedName("CpuSize")
    @Expose
    private Long CpuSize;

    /**
    * Cpu使用率百分比
    */
    @SerializedName("CpuLoad")
    @Expose
    private String CpuLoad;

    /**
    * 防护级别：0基础版，1专业版
    */
    @SerializedName("ProtectLevel")
    @Expose
    private Long ProtectLevel;

    /**
    * 风险状态：UNKNOW-未知，RISK-风险，SAFT-安全
    */
    @SerializedName("RiskStatus")
    @Expose
    private String RiskStatus;

    /**
    * 已防护天数
    */
    @SerializedName("ProtectDays")
    @Expose
    private Long ProtectDays;

    /**
    * 专业版开通时间
    */
    @SerializedName("BuyTime")
    @Expose
    private String BuyTime;

    /**
    * 专业版到期时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 内核版本
    */
    @SerializedName("CoreVersion")
    @Expose
    private String CoreVersion;

    /**
    * linux/windows
    */
    @SerializedName("OsType")
    @Expose
    private String OsType;

    /**
    * agent版本
    */
    @SerializedName("AgentVersion")
    @Expose
    private String AgentVersion;

    /**
    * 安装时间
    */
    @SerializedName("InstallTime")
    @Expose
    private String InstallTime;

    /**
    * 系统启动时间
    */
    @SerializedName("BootTime")
    @Expose
    private String BootTime;

    /**
    * 最后上线时间
    */
    @SerializedName("LastLiveTime")
    @Expose
    private String LastLiveTime;

    /**
    * 生产商
    */
    @SerializedName("Producer")
    @Expose
    private String Producer;

    /**
    * 序列号
    */
    @SerializedName("SerialNumber")
    @Expose
    private String SerialNumber;

    /**
    * 网卡
    */
    @SerializedName("NetCards")
    @Expose
    private AssetNetworkCardInfo [] NetCards;

    /**
    * 分区
    */
    @SerializedName("Disks")
    @Expose
    private AssetDiskPartitionInfo [] Disks;

    /**
    * 0在线，1已离线
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 业务组ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 设备型号
    */
    @SerializedName("DeviceVersion")
    @Expose
    private String DeviceVersion;

    /**
    * 离线时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OfflineTime")
    @Expose
    private String OfflineTime;

    /**
    * 主机ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 数据更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 服务器Quuid 
     * @return Quuid 服务器Quuid
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 服务器Quuid
     * @param Quuid 服务器Quuid
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 服务器uuid 
     * @return Uuid 服务器uuid
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 服务器uuid
     * @param Uuid 服务器uuid
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 服务器内网IP 
     * @return MachineIp 服务器内网IP
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set 服务器内网IP
     * @param MachineIp 服务器内网IP
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get 服务器名称 
     * @return MachineName 服务器名称
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set 服务器名称
     * @param MachineName 服务器名称
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get 操作系统名称 
     * @return OsInfo 操作系统名称
     */
    public String getOsInfo() {
        return this.OsInfo;
    }

    /**
     * Set 操作系统名称
     * @param OsInfo 操作系统名称
     */
    public void setOsInfo(String OsInfo) {
        this.OsInfo = OsInfo;
    }

    /**
     * Get CPU信息 
     * @return Cpu CPU信息
     */
    public String getCpu() {
        return this.Cpu;
    }

    /**
     * Set CPU信息
     * @param Cpu CPU信息
     */
    public void setCpu(String Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存容量：单位G 
     * @return MemSize 内存容量：单位G
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set 内存容量：单位G
     * @param MemSize 内存容量：单位G
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get 内存使用率百分比 
     * @return MemLoad 内存使用率百分比
     */
    public String getMemLoad() {
        return this.MemLoad;
    }

    /**
     * Set 内存使用率百分比
     * @param MemLoad 内存使用率百分比
     */
    public void setMemLoad(String MemLoad) {
        this.MemLoad = MemLoad;
    }

    /**
     * Get 硬盘容量：单位G 
     * @return DiskSize 硬盘容量：单位G
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 硬盘容量：单位G
     * @param DiskSize 硬盘容量：单位G
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 硬盘使用率百分比 
     * @return DiskLoad 硬盘使用率百分比
     */
    public String getDiskLoad() {
        return this.DiskLoad;
    }

    /**
     * Set 硬盘使用率百分比
     * @param DiskLoad 硬盘使用率百分比
     */
    public void setDiskLoad(String DiskLoad) {
        this.DiskLoad = DiskLoad;
    }

    /**
     * Get 分区数 
     * @return PartitionCount 分区数
     */
    public Long getPartitionCount() {
        return this.PartitionCount;
    }

    /**
     * Set 分区数
     * @param PartitionCount 分区数
     */
    public void setPartitionCount(Long PartitionCount) {
        this.PartitionCount = PartitionCount;
    }

    /**
     * Get 主机外网IP 
     * @return MachineWanIp 主机外网IP
     */
    public String getMachineWanIp() {
        return this.MachineWanIp;
    }

    /**
     * Set 主机外网IP
     * @param MachineWanIp 主机外网IP
     */
    public void setMachineWanIp(String MachineWanIp) {
        this.MachineWanIp = MachineWanIp;
    }

    /**
     * Get Cpu数量 
     * @return CpuSize Cpu数量
     */
    public Long getCpuSize() {
        return this.CpuSize;
    }

    /**
     * Set Cpu数量
     * @param CpuSize Cpu数量
     */
    public void setCpuSize(Long CpuSize) {
        this.CpuSize = CpuSize;
    }

    /**
     * Get Cpu使用率百分比 
     * @return CpuLoad Cpu使用率百分比
     */
    public String getCpuLoad() {
        return this.CpuLoad;
    }

    /**
     * Set Cpu使用率百分比
     * @param CpuLoad Cpu使用率百分比
     */
    public void setCpuLoad(String CpuLoad) {
        this.CpuLoad = CpuLoad;
    }

    /**
     * Get 防护级别：0基础版，1专业版 
     * @return ProtectLevel 防护级别：0基础版，1专业版
     */
    public Long getProtectLevel() {
        return this.ProtectLevel;
    }

    /**
     * Set 防护级别：0基础版，1专业版
     * @param ProtectLevel 防护级别：0基础版，1专业版
     */
    public void setProtectLevel(Long ProtectLevel) {
        this.ProtectLevel = ProtectLevel;
    }

    /**
     * Get 风险状态：UNKNOW-未知，RISK-风险，SAFT-安全 
     * @return RiskStatus 风险状态：UNKNOW-未知，RISK-风险，SAFT-安全
     */
    public String getRiskStatus() {
        return this.RiskStatus;
    }

    /**
     * Set 风险状态：UNKNOW-未知，RISK-风险，SAFT-安全
     * @param RiskStatus 风险状态：UNKNOW-未知，RISK-风险，SAFT-安全
     */
    public void setRiskStatus(String RiskStatus) {
        this.RiskStatus = RiskStatus;
    }

    /**
     * Get 已防护天数 
     * @return ProtectDays 已防护天数
     */
    public Long getProtectDays() {
        return this.ProtectDays;
    }

    /**
     * Set 已防护天数
     * @param ProtectDays 已防护天数
     */
    public void setProtectDays(Long ProtectDays) {
        this.ProtectDays = ProtectDays;
    }

    /**
     * Get 专业版开通时间 
     * @return BuyTime 专业版开通时间
     */
    public String getBuyTime() {
        return this.BuyTime;
    }

    /**
     * Set 专业版开通时间
     * @param BuyTime 专业版开通时间
     */
    public void setBuyTime(String BuyTime) {
        this.BuyTime = BuyTime;
    }

    /**
     * Get 专业版到期时间 
     * @return EndTime 专业版到期时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 专业版到期时间
     * @param EndTime 专业版到期时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 内核版本 
     * @return CoreVersion 内核版本
     */
    public String getCoreVersion() {
        return this.CoreVersion;
    }

    /**
     * Set 内核版本
     * @param CoreVersion 内核版本
     */
    public void setCoreVersion(String CoreVersion) {
        this.CoreVersion = CoreVersion;
    }

    /**
     * Get linux/windows 
     * @return OsType linux/windows
     */
    public String getOsType() {
        return this.OsType;
    }

    /**
     * Set linux/windows
     * @param OsType linux/windows
     */
    public void setOsType(String OsType) {
        this.OsType = OsType;
    }

    /**
     * Get agent版本 
     * @return AgentVersion agent版本
     */
    public String getAgentVersion() {
        return this.AgentVersion;
    }

    /**
     * Set agent版本
     * @param AgentVersion agent版本
     */
    public void setAgentVersion(String AgentVersion) {
        this.AgentVersion = AgentVersion;
    }

    /**
     * Get 安装时间 
     * @return InstallTime 安装时间
     */
    public String getInstallTime() {
        return this.InstallTime;
    }

    /**
     * Set 安装时间
     * @param InstallTime 安装时间
     */
    public void setInstallTime(String InstallTime) {
        this.InstallTime = InstallTime;
    }

    /**
     * Get 系统启动时间 
     * @return BootTime 系统启动时间
     */
    public String getBootTime() {
        return this.BootTime;
    }

    /**
     * Set 系统启动时间
     * @param BootTime 系统启动时间
     */
    public void setBootTime(String BootTime) {
        this.BootTime = BootTime;
    }

    /**
     * Get 最后上线时间 
     * @return LastLiveTime 最后上线时间
     */
    public String getLastLiveTime() {
        return this.LastLiveTime;
    }

    /**
     * Set 最后上线时间
     * @param LastLiveTime 最后上线时间
     */
    public void setLastLiveTime(String LastLiveTime) {
        this.LastLiveTime = LastLiveTime;
    }

    /**
     * Get 生产商 
     * @return Producer 生产商
     */
    public String getProducer() {
        return this.Producer;
    }

    /**
     * Set 生产商
     * @param Producer 生产商
     */
    public void setProducer(String Producer) {
        this.Producer = Producer;
    }

    /**
     * Get 序列号 
     * @return SerialNumber 序列号
     */
    public String getSerialNumber() {
        return this.SerialNumber;
    }

    /**
     * Set 序列号
     * @param SerialNumber 序列号
     */
    public void setSerialNumber(String SerialNumber) {
        this.SerialNumber = SerialNumber;
    }

    /**
     * Get 网卡 
     * @return NetCards 网卡
     */
    public AssetNetworkCardInfo [] getNetCards() {
        return this.NetCards;
    }

    /**
     * Set 网卡
     * @param NetCards 网卡
     */
    public void setNetCards(AssetNetworkCardInfo [] NetCards) {
        this.NetCards = NetCards;
    }

    /**
     * Get 分区 
     * @return Disks 分区
     */
    public AssetDiskPartitionInfo [] getDisks() {
        return this.Disks;
    }

    /**
     * Set 分区
     * @param Disks 分区
     */
    public void setDisks(AssetDiskPartitionInfo [] Disks) {
        this.Disks = Disks;
    }

    /**
     * Get 0在线，1已离线 
     * @return Status 0在线，1已离线
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 0在线，1已离线
     * @param Status 0在线，1已离线
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 业务组ID 
     * @return ProjectId 业务组ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 业务组ID
     * @param ProjectId 业务组ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 设备型号 
     * @return DeviceVersion 设备型号
     */
    public String getDeviceVersion() {
        return this.DeviceVersion;
    }

    /**
     * Set 设备型号
     * @param DeviceVersion 设备型号
     */
    public void setDeviceVersion(String DeviceVersion) {
        this.DeviceVersion = DeviceVersion;
    }

    /**
     * Get 离线时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OfflineTime 离线时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOfflineTime() {
        return this.OfflineTime;
    }

    /**
     * Set 离线时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param OfflineTime 离线时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOfflineTime(String OfflineTime) {
        this.OfflineTime = OfflineTime;
    }

    /**
     * Get 主机ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 主机ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 主机ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 主机ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 数据更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 数据更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 数据更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 数据更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public AssetMachineDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetMachineDetail(AssetMachineDetail source) {
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.MachineIp != null) {
            this.MachineIp = new String(source.MachineIp);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.OsInfo != null) {
            this.OsInfo = new String(source.OsInfo);
        }
        if (source.Cpu != null) {
            this.Cpu = new String(source.Cpu);
        }
        if (source.MemSize != null) {
            this.MemSize = new Long(source.MemSize);
        }
        if (source.MemLoad != null) {
            this.MemLoad = new String(source.MemLoad);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.DiskLoad != null) {
            this.DiskLoad = new String(source.DiskLoad);
        }
        if (source.PartitionCount != null) {
            this.PartitionCount = new Long(source.PartitionCount);
        }
        if (source.MachineWanIp != null) {
            this.MachineWanIp = new String(source.MachineWanIp);
        }
        if (source.CpuSize != null) {
            this.CpuSize = new Long(source.CpuSize);
        }
        if (source.CpuLoad != null) {
            this.CpuLoad = new String(source.CpuLoad);
        }
        if (source.ProtectLevel != null) {
            this.ProtectLevel = new Long(source.ProtectLevel);
        }
        if (source.RiskStatus != null) {
            this.RiskStatus = new String(source.RiskStatus);
        }
        if (source.ProtectDays != null) {
            this.ProtectDays = new Long(source.ProtectDays);
        }
        if (source.BuyTime != null) {
            this.BuyTime = new String(source.BuyTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.CoreVersion != null) {
            this.CoreVersion = new String(source.CoreVersion);
        }
        if (source.OsType != null) {
            this.OsType = new String(source.OsType);
        }
        if (source.AgentVersion != null) {
            this.AgentVersion = new String(source.AgentVersion);
        }
        if (source.InstallTime != null) {
            this.InstallTime = new String(source.InstallTime);
        }
        if (source.BootTime != null) {
            this.BootTime = new String(source.BootTime);
        }
        if (source.LastLiveTime != null) {
            this.LastLiveTime = new String(source.LastLiveTime);
        }
        if (source.Producer != null) {
            this.Producer = new String(source.Producer);
        }
        if (source.SerialNumber != null) {
            this.SerialNumber = new String(source.SerialNumber);
        }
        if (source.NetCards != null) {
            this.NetCards = new AssetNetworkCardInfo[source.NetCards.length];
            for (int i = 0; i < source.NetCards.length; i++) {
                this.NetCards[i] = new AssetNetworkCardInfo(source.NetCards[i]);
            }
        }
        if (source.Disks != null) {
            this.Disks = new AssetDiskPartitionInfo[source.Disks.length];
            for (int i = 0; i < source.Disks.length; i++) {
                this.Disks[i] = new AssetDiskPartitionInfo(source.Disks[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.DeviceVersion != null) {
            this.DeviceVersion = new String(source.DeviceVersion);
        }
        if (source.OfflineTime != null) {
            this.OfflineTime = new String(source.OfflineTime);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "OsInfo", this.OsInfo);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "MemLoad", this.MemLoad);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "DiskLoad", this.DiskLoad);
        this.setParamSimple(map, prefix + "PartitionCount", this.PartitionCount);
        this.setParamSimple(map, prefix + "MachineWanIp", this.MachineWanIp);
        this.setParamSimple(map, prefix + "CpuSize", this.CpuSize);
        this.setParamSimple(map, prefix + "CpuLoad", this.CpuLoad);
        this.setParamSimple(map, prefix + "ProtectLevel", this.ProtectLevel);
        this.setParamSimple(map, prefix + "RiskStatus", this.RiskStatus);
        this.setParamSimple(map, prefix + "ProtectDays", this.ProtectDays);
        this.setParamSimple(map, prefix + "BuyTime", this.BuyTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CoreVersion", this.CoreVersion);
        this.setParamSimple(map, prefix + "OsType", this.OsType);
        this.setParamSimple(map, prefix + "AgentVersion", this.AgentVersion);
        this.setParamSimple(map, prefix + "InstallTime", this.InstallTime);
        this.setParamSimple(map, prefix + "BootTime", this.BootTime);
        this.setParamSimple(map, prefix + "LastLiveTime", this.LastLiveTime);
        this.setParamSimple(map, prefix + "Producer", this.Producer);
        this.setParamSimple(map, prefix + "SerialNumber", this.SerialNumber);
        this.setParamArrayObj(map, prefix + "NetCards.", this.NetCards);
        this.setParamArrayObj(map, prefix + "Disks.", this.Disks);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "DeviceVersion", this.DeviceVersion);
        this.setParamSimple(map, prefix + "OfflineTime", this.OfflineTime);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

