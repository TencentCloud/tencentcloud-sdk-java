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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MachineDetail extends AbstractModel {

    /**
    * <p>Agent状态</p>
    */
    @SerializedName("AgentStatus")
    @Expose
    private String AgentStatus;

    /**
    * <p>Agent版本</p>
    */
    @SerializedName("AgentVersion")
    @Expose
    private String AgentVersion;

    /**
    * <p>账号AppId</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>资产类型名称</p>
    */
    @SerializedName("AssetTypeName")
    @Expose
    private String AssetTypeName;

    /**
    * <p>系统启动时间（Unix时间戳）</p>
    */
    @SerializedName("BootTime")
    @Expose
    private Long BootTime;

    /**
    * <p>购买时间（Unix时间戳）</p>
    */
    @SerializedName("BuyTime")
    @Expose
    private Long BuyTime;

    /**
    * <p>云服务商</p>
    */
    @SerializedName("CloudFromEnum")
    @Expose
    private String CloudFromEnum;

    /**
    * <p>云标签列表</p>
    */
    @SerializedName("CloudTags")
    @Expose
    private Tags [] CloudTags;

    /**
    * <p>内核版本</p>
    */
    @SerializedName("CoreVersion")
    @Expose
    private String CoreVersion;

    /**
    * <p>CPU信息</p>
    */
    @SerializedName("Cpu")
    @Expose
    private String Cpu;

    /**
    * <p>CPU负载</p>
    */
    @SerializedName("CpuLoad")
    @Expose
    private String CpuLoad;

    /**
    * <p>CPU核数</p>
    */
    @SerializedName("CpuSize")
    @Expose
    private Long CpuSize;

    /**
    * <p>设备型号</p>
    */
    @SerializedName("DeviceVersion")
    @Expose
    private String DeviceVersion;

    /**
    * <p>磁盘分区信息</p>
    */
    @SerializedName("Disks")
    @Expose
    private DiskPartitionInfo [] Disks;

    /**
    * <p>到期时间（Unix时间戳）</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>暴露状态</p>
    */
    @SerializedName("ExposedStatus")
    @Expose
    private String ExposedStatus;

    /**
    * <p>安装时间（Unix时间戳）</p>
    */
    @SerializedName("InstallTime")
    @Expose
    private Long InstallTime;

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * <p>实例状态</p>
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * <p>内核版本</p>
    */
    @SerializedName("KernelVersion")
    @Expose
    private String KernelVersion;

    /**
    * <p>最近一次在线时间（Unix时间戳）</p>
    */
    @SerializedName("LatestLiveTime")
    @Expose
    private Long LatestLiveTime;

    /**
    * <p>最近一次离线时间（Unix时间戳）</p>
    */
    @SerializedName("LatestOfflineTime")
    @Expose
    private Long LatestOfflineTime;

    /**
    * <p>内网IP</p>
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * <p>主机名称</p>
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * <p>操作系统（云采集）</p>
    */
    @SerializedName("MachineOs")
    @Expose
    private String MachineOs;

    /**
    * <p>主机状态</p>
    */
    @SerializedName("MachineStatus")
    @Expose
    private String MachineStatus;

    /**
    * <p>外网IP</p>
    */
    @SerializedName("MachineWanIp")
    @Expose
    private String MachineWanIp;

    /**
    * <p>内存大小(MB)</p>
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * <p>内存使用率</p>
    */
    @SerializedName("MemoryLoad")
    @Expose
    private String MemoryLoad;

    /**
    * <p>网卡信息</p>
    */
    @SerializedName("NetCards")
    @Expose
    private NetworkCardInfo [] NetCards;

    /**
    * <p>操作系统（端采集）</p>
    */
    @SerializedName("OsByAgent")
    @Expose
    private String OsByAgent;

    /**
    * <p>付费模式</p>
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * <p>项目ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>已防护天数</p>
    */
    @SerializedName("ProtectDays")
    @Expose
    private Long ProtectDays;

    /**
    * <p>防护类型</p>
    */
    @SerializedName("ProtectType")
    @Expose
    private String ProtectType;

    /**
    * <p>主机唯一标识</p>
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * <p>地域信息</p>
    */
    @SerializedName("RegionInfo")
    @Expose
    private RegionInfo RegionInfo;

    /**
    * <p>备注</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>序列号</p>
    */
    @SerializedName("SerialNumber")
    @Expose
    private String SerialNumber;

    /**
    * <p>资产标签列表</p>
    */
    @SerializedName("TagItems")
    @Expose
    private MiniTagItem [] TagItems;

    /**
    * <p>标签修改信息</p>
    */
    @SerializedName("TagModifyInfo")
    @Expose
    private AssetTagModifyAssetItem TagModifyInfo;

    /**
    * <p>Agent唯一标识</p>
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * <p>VPC CIDR</p>
    */
    @SerializedName("VpcCidrBlock")
    @Expose
    private String VpcCidrBlock;

    /**
    * <p>VPC ID</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>VPC名称</p>
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * <p>主机节点类型</p><p>枚举值：</p><ul><li>NONE： 主机节点</li><li>CLUSTER： 集群节点</li><li>CONTAINER： 容器节点</li></ul>
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * <p>容器防护状态</p><p>枚举值：</p><ul><li>Enabled： 开启防护</li><li>Disabled： 关闭防护</li><li>Unknown： 未知</li></ul>
    */
    @SerializedName("ContainerDefendStatus")
    @Expose
    private String ContainerDefendStatus;

    /**
    * <p>集群签证md5</p>
    */
    @SerializedName("ClusterCaMd5")
    @Expose
    private String ClusterCaMd5;

    /**
    * <p>容器环境信息</p>
    */
    @SerializedName("ContainerEnvInfo")
    @Expose
    private ContainerEnvInfo ContainerEnvInfo;

    /**
    * <p>集群id</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>集群名称</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
     * Get <p>Agent状态</p> 
     * @return AgentStatus <p>Agent状态</p>
     */
    public String getAgentStatus() {
        return this.AgentStatus;
    }

    /**
     * Set <p>Agent状态</p>
     * @param AgentStatus <p>Agent状态</p>
     */
    public void setAgentStatus(String AgentStatus) {
        this.AgentStatus = AgentStatus;
    }

    /**
     * Get <p>Agent版本</p> 
     * @return AgentVersion <p>Agent版本</p>
     */
    public String getAgentVersion() {
        return this.AgentVersion;
    }

    /**
     * Set <p>Agent版本</p>
     * @param AgentVersion <p>Agent版本</p>
     */
    public void setAgentVersion(String AgentVersion) {
        this.AgentVersion = AgentVersion;
    }

    /**
     * Get <p>账号AppId</p> 
     * @return AppId <p>账号AppId</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>账号AppId</p>
     * @param AppId <p>账号AppId</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>资产类型名称</p> 
     * @return AssetTypeName <p>资产类型名称</p>
     */
    public String getAssetTypeName() {
        return this.AssetTypeName;
    }

    /**
     * Set <p>资产类型名称</p>
     * @param AssetTypeName <p>资产类型名称</p>
     */
    public void setAssetTypeName(String AssetTypeName) {
        this.AssetTypeName = AssetTypeName;
    }

    /**
     * Get <p>系统启动时间（Unix时间戳）</p> 
     * @return BootTime <p>系统启动时间（Unix时间戳）</p>
     */
    public Long getBootTime() {
        return this.BootTime;
    }

    /**
     * Set <p>系统启动时间（Unix时间戳）</p>
     * @param BootTime <p>系统启动时间（Unix时间戳）</p>
     */
    public void setBootTime(Long BootTime) {
        this.BootTime = BootTime;
    }

    /**
     * Get <p>购买时间（Unix时间戳）</p> 
     * @return BuyTime <p>购买时间（Unix时间戳）</p>
     */
    public Long getBuyTime() {
        return this.BuyTime;
    }

    /**
     * Set <p>购买时间（Unix时间戳）</p>
     * @param BuyTime <p>购买时间（Unix时间戳）</p>
     */
    public void setBuyTime(Long BuyTime) {
        this.BuyTime = BuyTime;
    }

    /**
     * Get <p>云服务商</p> 
     * @return CloudFromEnum <p>云服务商</p>
     */
    public String getCloudFromEnum() {
        return this.CloudFromEnum;
    }

    /**
     * Set <p>云服务商</p>
     * @param CloudFromEnum <p>云服务商</p>
     */
    public void setCloudFromEnum(String CloudFromEnum) {
        this.CloudFromEnum = CloudFromEnum;
    }

    /**
     * Get <p>云标签列表</p> 
     * @return CloudTags <p>云标签列表</p>
     */
    public Tags [] getCloudTags() {
        return this.CloudTags;
    }

    /**
     * Set <p>云标签列表</p>
     * @param CloudTags <p>云标签列表</p>
     */
    public void setCloudTags(Tags [] CloudTags) {
        this.CloudTags = CloudTags;
    }

    /**
     * Get <p>内核版本</p> 
     * @return CoreVersion <p>内核版本</p>
     */
    public String getCoreVersion() {
        return this.CoreVersion;
    }

    /**
     * Set <p>内核版本</p>
     * @param CoreVersion <p>内核版本</p>
     */
    public void setCoreVersion(String CoreVersion) {
        this.CoreVersion = CoreVersion;
    }

    /**
     * Get <p>CPU信息</p> 
     * @return Cpu <p>CPU信息</p>
     */
    public String getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>CPU信息</p>
     * @param Cpu <p>CPU信息</p>
     */
    public void setCpu(String Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>CPU负载</p> 
     * @return CpuLoad <p>CPU负载</p>
     */
    public String getCpuLoad() {
        return this.CpuLoad;
    }

    /**
     * Set <p>CPU负载</p>
     * @param CpuLoad <p>CPU负载</p>
     */
    public void setCpuLoad(String CpuLoad) {
        this.CpuLoad = CpuLoad;
    }

    /**
     * Get <p>CPU核数</p> 
     * @return CpuSize <p>CPU核数</p>
     */
    public Long getCpuSize() {
        return this.CpuSize;
    }

    /**
     * Set <p>CPU核数</p>
     * @param CpuSize <p>CPU核数</p>
     */
    public void setCpuSize(Long CpuSize) {
        this.CpuSize = CpuSize;
    }

    /**
     * Get <p>设备型号</p> 
     * @return DeviceVersion <p>设备型号</p>
     */
    public String getDeviceVersion() {
        return this.DeviceVersion;
    }

    /**
     * Set <p>设备型号</p>
     * @param DeviceVersion <p>设备型号</p>
     */
    public void setDeviceVersion(String DeviceVersion) {
        this.DeviceVersion = DeviceVersion;
    }

    /**
     * Get <p>磁盘分区信息</p> 
     * @return Disks <p>磁盘分区信息</p>
     */
    public DiskPartitionInfo [] getDisks() {
        return this.Disks;
    }

    /**
     * Set <p>磁盘分区信息</p>
     * @param Disks <p>磁盘分区信息</p>
     */
    public void setDisks(DiskPartitionInfo [] Disks) {
        this.Disks = Disks;
    }

    /**
     * Get <p>到期时间（Unix时间戳）</p> 
     * @return EndTime <p>到期时间（Unix时间戳）</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>到期时间（Unix时间戳）</p>
     * @param EndTime <p>到期时间（Unix时间戳）</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>暴露状态</p> 
     * @return ExposedStatus <p>暴露状态</p>
     */
    public String getExposedStatus() {
        return this.ExposedStatus;
    }

    /**
     * Set <p>暴露状态</p>
     * @param ExposedStatus <p>暴露状态</p>
     */
    public void setExposedStatus(String ExposedStatus) {
        this.ExposedStatus = ExposedStatus;
    }

    /**
     * Get <p>安装时间（Unix时间戳）</p> 
     * @return InstallTime <p>安装时间（Unix时间戳）</p>
     */
    public Long getInstallTime() {
        return this.InstallTime;
    }

    /**
     * Set <p>安装时间（Unix时间戳）</p>
     * @param InstallTime <p>安装时间（Unix时间戳）</p>
     */
    public void setInstallTime(Long InstallTime) {
        this.InstallTime = InstallTime;
    }

    /**
     * Get <p>实例ID</p> 
     * @return InstanceID <p>实例ID</p>
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceID <p>实例ID</p>
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get <p>实例状态</p> 
     * @return InstanceStatus <p>实例状态</p>
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set <p>实例状态</p>
     * @param InstanceStatus <p>实例状态</p>
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get <p>内核版本</p> 
     * @return KernelVersion <p>内核版本</p>
     */
    public String getKernelVersion() {
        return this.KernelVersion;
    }

    /**
     * Set <p>内核版本</p>
     * @param KernelVersion <p>内核版本</p>
     */
    public void setKernelVersion(String KernelVersion) {
        this.KernelVersion = KernelVersion;
    }

    /**
     * Get <p>最近一次在线时间（Unix时间戳）</p> 
     * @return LatestLiveTime <p>最近一次在线时间（Unix时间戳）</p>
     */
    public Long getLatestLiveTime() {
        return this.LatestLiveTime;
    }

    /**
     * Set <p>最近一次在线时间（Unix时间戳）</p>
     * @param LatestLiveTime <p>最近一次在线时间（Unix时间戳）</p>
     */
    public void setLatestLiveTime(Long LatestLiveTime) {
        this.LatestLiveTime = LatestLiveTime;
    }

    /**
     * Get <p>最近一次离线时间（Unix时间戳）</p> 
     * @return LatestOfflineTime <p>最近一次离线时间（Unix时间戳）</p>
     */
    public Long getLatestOfflineTime() {
        return this.LatestOfflineTime;
    }

    /**
     * Set <p>最近一次离线时间（Unix时间戳）</p>
     * @param LatestOfflineTime <p>最近一次离线时间（Unix时间戳）</p>
     */
    public void setLatestOfflineTime(Long LatestOfflineTime) {
        this.LatestOfflineTime = LatestOfflineTime;
    }

    /**
     * Get <p>内网IP</p> 
     * @return MachineIp <p>内网IP</p>
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set <p>内网IP</p>
     * @param MachineIp <p>内网IP</p>
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get <p>主机名称</p> 
     * @return MachineName <p>主机名称</p>
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set <p>主机名称</p>
     * @param MachineName <p>主机名称</p>
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get <p>操作系统（云采集）</p> 
     * @return MachineOs <p>操作系统（云采集）</p>
     */
    public String getMachineOs() {
        return this.MachineOs;
    }

    /**
     * Set <p>操作系统（云采集）</p>
     * @param MachineOs <p>操作系统（云采集）</p>
     */
    public void setMachineOs(String MachineOs) {
        this.MachineOs = MachineOs;
    }

    /**
     * Get <p>主机状态</p> 
     * @return MachineStatus <p>主机状态</p>
     */
    public String getMachineStatus() {
        return this.MachineStatus;
    }

    /**
     * Set <p>主机状态</p>
     * @param MachineStatus <p>主机状态</p>
     */
    public void setMachineStatus(String MachineStatus) {
        this.MachineStatus = MachineStatus;
    }

    /**
     * Get <p>外网IP</p> 
     * @return MachineWanIp <p>外网IP</p>
     */
    public String getMachineWanIp() {
        return this.MachineWanIp;
    }

    /**
     * Set <p>外网IP</p>
     * @param MachineWanIp <p>外网IP</p>
     */
    public void setMachineWanIp(String MachineWanIp) {
        this.MachineWanIp = MachineWanIp;
    }

    /**
     * Get <p>内存大小(MB)</p> 
     * @return MemSize <p>内存大小(MB)</p>
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set <p>内存大小(MB)</p>
     * @param MemSize <p>内存大小(MB)</p>
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get <p>内存使用率</p> 
     * @return MemoryLoad <p>内存使用率</p>
     */
    public String getMemoryLoad() {
        return this.MemoryLoad;
    }

    /**
     * Set <p>内存使用率</p>
     * @param MemoryLoad <p>内存使用率</p>
     */
    public void setMemoryLoad(String MemoryLoad) {
        this.MemoryLoad = MemoryLoad;
    }

    /**
     * Get <p>网卡信息</p> 
     * @return NetCards <p>网卡信息</p>
     */
    public NetworkCardInfo [] getNetCards() {
        return this.NetCards;
    }

    /**
     * Set <p>网卡信息</p>
     * @param NetCards <p>网卡信息</p>
     */
    public void setNetCards(NetworkCardInfo [] NetCards) {
        this.NetCards = NetCards;
    }

    /**
     * Get <p>操作系统（端采集）</p> 
     * @return OsByAgent <p>操作系统（端采集）</p>
     */
    public String getOsByAgent() {
        return this.OsByAgent;
    }

    /**
     * Set <p>操作系统（端采集）</p>
     * @param OsByAgent <p>操作系统（端采集）</p>
     */
    public void setOsByAgent(String OsByAgent) {
        this.OsByAgent = OsByAgent;
    }

    /**
     * Get <p>付费模式</p> 
     * @return PayMode <p>付费模式</p>
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>付费模式</p>
     * @param PayMode <p>付费模式</p>
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>项目ID</p> 
     * @return ProjectId <p>项目ID</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID</p>
     * @param ProjectId <p>项目ID</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>已防护天数</p> 
     * @return ProtectDays <p>已防护天数</p>
     */
    public Long getProtectDays() {
        return this.ProtectDays;
    }

    /**
     * Set <p>已防护天数</p>
     * @param ProtectDays <p>已防护天数</p>
     */
    public void setProtectDays(Long ProtectDays) {
        this.ProtectDays = ProtectDays;
    }

    /**
     * Get <p>防护类型</p> 
     * @return ProtectType <p>防护类型</p>
     */
    public String getProtectType() {
        return this.ProtectType;
    }

    /**
     * Set <p>防护类型</p>
     * @param ProtectType <p>防护类型</p>
     */
    public void setProtectType(String ProtectType) {
        this.ProtectType = ProtectType;
    }

    /**
     * Get <p>主机唯一标识</p> 
     * @return Quuid <p>主机唯一标识</p>
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set <p>主机唯一标识</p>
     * @param Quuid <p>主机唯一标识</p>
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get <p>地域信息</p> 
     * @return RegionInfo <p>地域信息</p>
     */
    public RegionInfo getRegionInfo() {
        return this.RegionInfo;
    }

    /**
     * Set <p>地域信息</p>
     * @param RegionInfo <p>地域信息</p>
     */
    public void setRegionInfo(RegionInfo RegionInfo) {
        this.RegionInfo = RegionInfo;
    }

    /**
     * Get <p>备注</p> 
     * @return Remark <p>备注</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注</p>
     * @param Remark <p>备注</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>序列号</p> 
     * @return SerialNumber <p>序列号</p>
     */
    public String getSerialNumber() {
        return this.SerialNumber;
    }

    /**
     * Set <p>序列号</p>
     * @param SerialNumber <p>序列号</p>
     */
    public void setSerialNumber(String SerialNumber) {
        this.SerialNumber = SerialNumber;
    }

    /**
     * Get <p>资产标签列表</p> 
     * @return TagItems <p>资产标签列表</p>
     */
    public MiniTagItem [] getTagItems() {
        return this.TagItems;
    }

    /**
     * Set <p>资产标签列表</p>
     * @param TagItems <p>资产标签列表</p>
     */
    public void setTagItems(MiniTagItem [] TagItems) {
        this.TagItems = TagItems;
    }

    /**
     * Get <p>标签修改信息</p> 
     * @return TagModifyInfo <p>标签修改信息</p>
     */
    public AssetTagModifyAssetItem getTagModifyInfo() {
        return this.TagModifyInfo;
    }

    /**
     * Set <p>标签修改信息</p>
     * @param TagModifyInfo <p>标签修改信息</p>
     */
    public void setTagModifyInfo(AssetTagModifyAssetItem TagModifyInfo) {
        this.TagModifyInfo = TagModifyInfo;
    }

    /**
     * Get <p>Agent唯一标识</p> 
     * @return Uuid <p>Agent唯一标识</p>
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set <p>Agent唯一标识</p>
     * @param Uuid <p>Agent唯一标识</p>
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get <p>VPC CIDR</p> 
     * @return VpcCidrBlock <p>VPC CIDR</p>
     */
    public String getVpcCidrBlock() {
        return this.VpcCidrBlock;
    }

    /**
     * Set <p>VPC CIDR</p>
     * @param VpcCidrBlock <p>VPC CIDR</p>
     */
    public void setVpcCidrBlock(String VpcCidrBlock) {
        this.VpcCidrBlock = VpcCidrBlock;
    }

    /**
     * Get <p>VPC ID</p> 
     * @return VpcId <p>VPC ID</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC ID</p>
     * @param VpcId <p>VPC ID</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>VPC名称</p> 
     * @return VpcName <p>VPC名称</p>
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set <p>VPC名称</p>
     * @param VpcName <p>VPC名称</p>
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get <p>主机节点类型</p><p>枚举值：</p><ul><li>NONE： 主机节点</li><li>CLUSTER： 集群节点</li><li>CONTAINER： 容器节点</li></ul> 
     * @return NodeType <p>主机节点类型</p><p>枚举值：</p><ul><li>NONE： 主机节点</li><li>CLUSTER： 集群节点</li><li>CONTAINER： 容器节点</li></ul>
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set <p>主机节点类型</p><p>枚举值：</p><ul><li>NONE： 主机节点</li><li>CLUSTER： 集群节点</li><li>CONTAINER： 容器节点</li></ul>
     * @param NodeType <p>主机节点类型</p><p>枚举值：</p><ul><li>NONE： 主机节点</li><li>CLUSTER： 集群节点</li><li>CONTAINER： 容器节点</li></ul>
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get <p>容器防护状态</p><p>枚举值：</p><ul><li>Enabled： 开启防护</li><li>Disabled： 关闭防护</li><li>Unknown： 未知</li></ul> 
     * @return ContainerDefendStatus <p>容器防护状态</p><p>枚举值：</p><ul><li>Enabled： 开启防护</li><li>Disabled： 关闭防护</li><li>Unknown： 未知</li></ul>
     */
    public String getContainerDefendStatus() {
        return this.ContainerDefendStatus;
    }

    /**
     * Set <p>容器防护状态</p><p>枚举值：</p><ul><li>Enabled： 开启防护</li><li>Disabled： 关闭防护</li><li>Unknown： 未知</li></ul>
     * @param ContainerDefendStatus <p>容器防护状态</p><p>枚举值：</p><ul><li>Enabled： 开启防护</li><li>Disabled： 关闭防护</li><li>Unknown： 未知</li></ul>
     */
    public void setContainerDefendStatus(String ContainerDefendStatus) {
        this.ContainerDefendStatus = ContainerDefendStatus;
    }

    /**
     * Get <p>集群签证md5</p> 
     * @return ClusterCaMd5 <p>集群签证md5</p>
     */
    public String getClusterCaMd5() {
        return this.ClusterCaMd5;
    }

    /**
     * Set <p>集群签证md5</p>
     * @param ClusterCaMd5 <p>集群签证md5</p>
     */
    public void setClusterCaMd5(String ClusterCaMd5) {
        this.ClusterCaMd5 = ClusterCaMd5;
    }

    /**
     * Get <p>容器环境信息</p> 
     * @return ContainerEnvInfo <p>容器环境信息</p>
     */
    public ContainerEnvInfo getContainerEnvInfo() {
        return this.ContainerEnvInfo;
    }

    /**
     * Set <p>容器环境信息</p>
     * @param ContainerEnvInfo <p>容器环境信息</p>
     */
    public void setContainerEnvInfo(ContainerEnvInfo ContainerEnvInfo) {
        this.ContainerEnvInfo = ContainerEnvInfo;
    }

    /**
     * Get <p>集群id</p> 
     * @return ClusterId <p>集群id</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群id</p>
     * @param ClusterId <p>集群id</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>集群名称</p> 
     * @return ClusterName <p>集群名称</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>集群名称</p>
     * @param ClusterName <p>集群名称</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    public MachineDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MachineDetail(MachineDetail source) {
        if (source.AgentStatus != null) {
            this.AgentStatus = new String(source.AgentStatus);
        }
        if (source.AgentVersion != null) {
            this.AgentVersion = new String(source.AgentVersion);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.AssetTypeName != null) {
            this.AssetTypeName = new String(source.AssetTypeName);
        }
        if (source.BootTime != null) {
            this.BootTime = new Long(source.BootTime);
        }
        if (source.BuyTime != null) {
            this.BuyTime = new Long(source.BuyTime);
        }
        if (source.CloudFromEnum != null) {
            this.CloudFromEnum = new String(source.CloudFromEnum);
        }
        if (source.CloudTags != null) {
            this.CloudTags = new Tags[source.CloudTags.length];
            for (int i = 0; i < source.CloudTags.length; i++) {
                this.CloudTags[i] = new Tags(source.CloudTags[i]);
            }
        }
        if (source.CoreVersion != null) {
            this.CoreVersion = new String(source.CoreVersion);
        }
        if (source.Cpu != null) {
            this.Cpu = new String(source.Cpu);
        }
        if (source.CpuLoad != null) {
            this.CpuLoad = new String(source.CpuLoad);
        }
        if (source.CpuSize != null) {
            this.CpuSize = new Long(source.CpuSize);
        }
        if (source.DeviceVersion != null) {
            this.DeviceVersion = new String(source.DeviceVersion);
        }
        if (source.Disks != null) {
            this.Disks = new DiskPartitionInfo[source.Disks.length];
            for (int i = 0; i < source.Disks.length; i++) {
                this.Disks[i] = new DiskPartitionInfo(source.Disks[i]);
            }
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.ExposedStatus != null) {
            this.ExposedStatus = new String(source.ExposedStatus);
        }
        if (source.InstallTime != null) {
            this.InstallTime = new Long(source.InstallTime);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.KernelVersion != null) {
            this.KernelVersion = new String(source.KernelVersion);
        }
        if (source.LatestLiveTime != null) {
            this.LatestLiveTime = new Long(source.LatestLiveTime);
        }
        if (source.LatestOfflineTime != null) {
            this.LatestOfflineTime = new Long(source.LatestOfflineTime);
        }
        if (source.MachineIp != null) {
            this.MachineIp = new String(source.MachineIp);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.MachineOs != null) {
            this.MachineOs = new String(source.MachineOs);
        }
        if (source.MachineStatus != null) {
            this.MachineStatus = new String(source.MachineStatus);
        }
        if (source.MachineWanIp != null) {
            this.MachineWanIp = new String(source.MachineWanIp);
        }
        if (source.MemSize != null) {
            this.MemSize = new Long(source.MemSize);
        }
        if (source.MemoryLoad != null) {
            this.MemoryLoad = new String(source.MemoryLoad);
        }
        if (source.NetCards != null) {
            this.NetCards = new NetworkCardInfo[source.NetCards.length];
            for (int i = 0; i < source.NetCards.length; i++) {
                this.NetCards[i] = new NetworkCardInfo(source.NetCards[i]);
            }
        }
        if (source.OsByAgent != null) {
            this.OsByAgent = new String(source.OsByAgent);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.ProtectDays != null) {
            this.ProtectDays = new Long(source.ProtectDays);
        }
        if (source.ProtectType != null) {
            this.ProtectType = new String(source.ProtectType);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.RegionInfo != null) {
            this.RegionInfo = new RegionInfo(source.RegionInfo);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.SerialNumber != null) {
            this.SerialNumber = new String(source.SerialNumber);
        }
        if (source.TagItems != null) {
            this.TagItems = new MiniTagItem[source.TagItems.length];
            for (int i = 0; i < source.TagItems.length; i++) {
                this.TagItems[i] = new MiniTagItem(source.TagItems[i]);
            }
        }
        if (source.TagModifyInfo != null) {
            this.TagModifyInfo = new AssetTagModifyAssetItem(source.TagModifyInfo);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.VpcCidrBlock != null) {
            this.VpcCidrBlock = new String(source.VpcCidrBlock);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.ContainerDefendStatus != null) {
            this.ContainerDefendStatus = new String(source.ContainerDefendStatus);
        }
        if (source.ClusterCaMd5 != null) {
            this.ClusterCaMd5 = new String(source.ClusterCaMd5);
        }
        if (source.ContainerEnvInfo != null) {
            this.ContainerEnvInfo = new ContainerEnvInfo(source.ContainerEnvInfo);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AgentStatus", this.AgentStatus);
        this.setParamSimple(map, prefix + "AgentVersion", this.AgentVersion);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AssetTypeName", this.AssetTypeName);
        this.setParamSimple(map, prefix + "BootTime", this.BootTime);
        this.setParamSimple(map, prefix + "BuyTime", this.BuyTime);
        this.setParamSimple(map, prefix + "CloudFromEnum", this.CloudFromEnum);
        this.setParamArrayObj(map, prefix + "CloudTags.", this.CloudTags);
        this.setParamSimple(map, prefix + "CoreVersion", this.CoreVersion);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "CpuLoad", this.CpuLoad);
        this.setParamSimple(map, prefix + "CpuSize", this.CpuSize);
        this.setParamSimple(map, prefix + "DeviceVersion", this.DeviceVersion);
        this.setParamArrayObj(map, prefix + "Disks.", this.Disks);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ExposedStatus", this.ExposedStatus);
        this.setParamSimple(map, prefix + "InstallTime", this.InstallTime);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "KernelVersion", this.KernelVersion);
        this.setParamSimple(map, prefix + "LatestLiveTime", this.LatestLiveTime);
        this.setParamSimple(map, prefix + "LatestOfflineTime", this.LatestOfflineTime);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "MachineOs", this.MachineOs);
        this.setParamSimple(map, prefix + "MachineStatus", this.MachineStatus);
        this.setParamSimple(map, prefix + "MachineWanIp", this.MachineWanIp);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "MemoryLoad", this.MemoryLoad);
        this.setParamArrayObj(map, prefix + "NetCards.", this.NetCards);
        this.setParamSimple(map, prefix + "OsByAgent", this.OsByAgent);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProtectDays", this.ProtectDays);
        this.setParamSimple(map, prefix + "ProtectType", this.ProtectType);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamObj(map, prefix + "RegionInfo.", this.RegionInfo);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "SerialNumber", this.SerialNumber);
        this.setParamArrayObj(map, prefix + "TagItems.", this.TagItems);
        this.setParamObj(map, prefix + "TagModifyInfo.", this.TagModifyInfo);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "VpcCidrBlock", this.VpcCidrBlock);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "ContainerDefendStatus", this.ContainerDefendStatus);
        this.setParamSimple(map, prefix + "ClusterCaMd5", this.ClusterCaMd5);
        this.setParamObj(map, prefix + "ContainerEnvInfo.", this.ContainerEnvInfo);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);

    }
}

