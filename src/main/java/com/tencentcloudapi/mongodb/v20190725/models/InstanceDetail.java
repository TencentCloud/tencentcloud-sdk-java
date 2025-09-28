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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceDetail extends AbstractModel {

    /**
    * 实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 付费类型。
- 1：包年包月。
- 0：按量计费。
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 项目 ID。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 集群类型。
- 0：副本集实例。
- 1：分片实例。
    */
    @SerializedName("ClusterType")
    @Expose
    private Long ClusterType;

    /**
    * 地域信息。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 可用区信息。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 网络类型。
- 0：基础网络。
- 1：私有网络。
    */
    @SerializedName("NetType")
    @Expose
    private Long NetType;

    /**
    * 私有网络的ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 私有网络的子网ID。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 实例状态。
- 0：待初始化。
- 1：流程处理中，例如：变更规格、参数修改等。
- 2：实例正常运行中。
- -2：已隔离（包年包月）。
- -3：已隔离（按量计费）。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 实例IP。
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 端口号。
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * 实例创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 实例到期时间。
    */
    @SerializedName("DeadLine")
    @Expose
    private String DeadLine;

    /**
    * 实例存储引擎版本信息。
- MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本。
- MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本。
- MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。
- MONGO_44_WT：MongoDB 4.4 WiredTiger存储引擎版本。
- MONGO_50_WT：MongoDB 5.0 WiredTiger存储引擎版本。
- MONGO_60_WT：MongoDB 6.0 WiredTiger存储引擎版本。
- MONGO_70_WT：MongoDB 7.0 WiredTiger存储引擎版本。
    */
    @SerializedName("MongoVersion")
    @Expose
    private String MongoVersion;

    /**
    * 实例内存规格，单位：MB。
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 实例磁盘规格，单位：MB。
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * 实例 CPU 核心数。
    */
    @SerializedName("CpuNum")
    @Expose
    private Long CpuNum;

    /**
    * 实例机器类型。
- HIO10G：通用高 HIO 万兆型。
- HCD：云盘版类型。
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * 实例从节点数。
    */
    @SerializedName("SecondaryNum")
    @Expose
    private Long SecondaryNum;

    /**
    * 实例分片数。
    */
    @SerializedName("ReplicationSetNum")
    @Expose
    private Long ReplicationSetNum;

    /**
    * 实例自动续费标志。
- 0：手动续费。
- 1：自动续费。
- 2：确认不续费。
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 已用容量，单位：MB。
    */
    @SerializedName("UsedVolume")
    @Expose
    private Long UsedVolume;

    /**
    * 维护窗口起始时间。
    */
    @SerializedName("MaintenanceStart")
    @Expose
    private String MaintenanceStart;

    /**
    * 维护窗口结束时间。
    */
    @SerializedName("MaintenanceEnd")
    @Expose
    private String MaintenanceEnd;

    /**
    * 分片信息。
    */
    @SerializedName("ReplicaSets")
    @Expose
    private ShardInfo [] ReplicaSets;

    /**
    * 只读实例信息。
    */
    @SerializedName("ReadonlyInstances")
    @Expose
    private DBInstanceInfo [] ReadonlyInstances;

    /**
    * 灾备实例信息。
    */
    @SerializedName("StandbyInstances")
    @Expose
    private DBInstanceInfo [] StandbyInstances;

    /**
    * 临时实例信息。
    */
    @SerializedName("CloneInstances")
    @Expose
    private DBInstanceInfo [] CloneInstances;

    /**
    * 关联实例信息，对于正式实例，该字段表示它的临时实例信息；对于临时实例，则表示它的正式实例信息;如果为只读/灾备实例,则表示他的主实例信息。
    */
    @SerializedName("RelatedInstance")
    @Expose
    private DBInstanceInfo RelatedInstance;

    /**
    * 实例标签信息集合。
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * 实例版本标记。
    */
    @SerializedName("InstanceVer")
    @Expose
    private Long InstanceVer;

    /**
    * 实例版本标记。
    */
    @SerializedName("ClusterVer")
    @Expose
    private Long ClusterVer;

    /**
    * 协议信息：mongodb。
    */
    @SerializedName("Protocol")
    @Expose
    private Long Protocol;

    /**
    * 实例类型。
- 0：所有实例。
- 1：正式实例。
- 2：临时实例
- 3：只读实例。
- -1：同时包括正式实例、只读实例与灾备实例。
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * 实例状态描述。
    */
    @SerializedName("InstanceStatusDesc")
    @Expose
    private String InstanceStatusDesc;

    /**
    * 实例对应的物理实例 ID。回档并替换过的实例有不同的 InstanceId 和 RealInstanceId，从 barad 获取监控数据等场景下需要用物理 ID 获取。
    */
    @SerializedName("RealInstanceId")
    @Expose
    private String RealInstanceId;

    /**
    * 实例当前可用区信息。
    */
    @SerializedName("ZoneList")
    @Expose
    private String [] ZoneList;

    /**
    * mongos 节点个数。
    */
    @SerializedName("MongosNodeNum")
    @Expose
    private Long MongosNodeNum;

    /**
    * mongos 节点内存。单位：MB。
    */
    @SerializedName("MongosMemory")
    @Expose
    private Long MongosMemory;

    /**
    * mongos 节点 CPU 核数。
    */
    @SerializedName("MongosCpuNum")
    @Expose
    private Long MongosCpuNum;

    /**
    * Config Server节点个数。
    */
    @SerializedName("ConfigServerNodeNum")
    @Expose
    private Long ConfigServerNodeNum;

    /**
    * Config Server节点内存。单位：MB。
    */
    @SerializedName("ConfigServerMemory")
    @Expose
    private Long ConfigServerMemory;

    /**
    * Config Server节点磁盘大小。单位：MB。
    */
    @SerializedName("ConfigServerVolume")
    @Expose
    private Long ConfigServerVolume;

    /**
    * Config Server 节点 CPU 核数。
    */
    @SerializedName("ConfigServerCpuNum")
    @Expose
    private Long ConfigServerCpuNum;

    /**
    * readonly节点个数。
    */
    @SerializedName("ReadonlyNodeNum")
    @Expose
    private Long ReadonlyNodeNum;

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
     * Get 付费类型。
- 1：包年包月。
- 0：按量计费。 
     * @return PayMode 付费类型。
- 1：包年包月。
- 0：按量计费。
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费类型。
- 1：包年包月。
- 0：按量计费。
     * @param PayMode 付费类型。
- 1：包年包月。
- 0：按量计费。
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 项目 ID。 
     * @return ProjectId 项目 ID。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目 ID。
     * @param ProjectId 项目 ID。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 集群类型。
- 0：副本集实例。
- 1：分片实例。 
     * @return ClusterType 集群类型。
- 0：副本集实例。
- 1：分片实例。
     */
    public Long getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 集群类型。
- 0：副本集实例。
- 1：分片实例。
     * @param ClusterType 集群类型。
- 0：副本集实例。
- 1：分片实例。
     */
    public void setClusterType(Long ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get 地域信息。 
     * @return Region 地域信息。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域信息。
     * @param Region 地域信息。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 可用区信息。 
     * @return Zone 可用区信息。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区信息。
     * @param Zone 可用区信息。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 网络类型。
- 0：基础网络。
- 1：私有网络。 
     * @return NetType 网络类型。
- 0：基础网络。
- 1：私有网络。
     */
    public Long getNetType() {
        return this.NetType;
    }

    /**
     * Set 网络类型。
- 0：基础网络。
- 1：私有网络。
     * @param NetType 网络类型。
- 0：基础网络。
- 1：私有网络。
     */
    public void setNetType(Long NetType) {
        this.NetType = NetType;
    }

    /**
     * Get 私有网络的ID。 
     * @return VpcId 私有网络的ID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络的ID。
     * @param VpcId 私有网络的ID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 私有网络的子网ID。 
     * @return SubnetId 私有网络的子网ID。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 私有网络的子网ID。
     * @param SubnetId 私有网络的子网ID。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 实例状态。
- 0：待初始化。
- 1：流程处理中，例如：变更规格、参数修改等。
- 2：实例正常运行中。
- -2：已隔离（包年包月）。
- -3：已隔离（按量计费）。 
     * @return Status 实例状态。
- 0：待初始化。
- 1：流程处理中，例如：变更规格、参数修改等。
- 2：实例正常运行中。
- -2：已隔离（包年包月）。
- -3：已隔离（按量计费）。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 实例状态。
- 0：待初始化。
- 1：流程处理中，例如：变更规格、参数修改等。
- 2：实例正常运行中。
- -2：已隔离（包年包月）。
- -3：已隔离（按量计费）。
     * @param Status 实例状态。
- 0：待初始化。
- 1：流程处理中，例如：变更规格、参数修改等。
- 2：实例正常运行中。
- -2：已隔离（包年包月）。
- -3：已隔离（按量计费）。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 实例IP。 
     * @return Vip 实例IP。
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 实例IP。
     * @param Vip 实例IP。
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 端口号。 
     * @return Vport 端口号。
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set 端口号。
     * @param Vport 端口号。
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get 实例创建时间。 
     * @return CreateTime 实例创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 实例创建时间。
     * @param CreateTime 实例创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 实例到期时间。 
     * @return DeadLine 实例到期时间。
     */
    public String getDeadLine() {
        return this.DeadLine;
    }

    /**
     * Set 实例到期时间。
     * @param DeadLine 实例到期时间。
     */
    public void setDeadLine(String DeadLine) {
        this.DeadLine = DeadLine;
    }

    /**
     * Get 实例存储引擎版本信息。
- MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本。
- MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本。
- MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。
- MONGO_44_WT：MongoDB 4.4 WiredTiger存储引擎版本。
- MONGO_50_WT：MongoDB 5.0 WiredTiger存储引擎版本。
- MONGO_60_WT：MongoDB 6.0 WiredTiger存储引擎版本。
- MONGO_70_WT：MongoDB 7.0 WiredTiger存储引擎版本。 
     * @return MongoVersion 实例存储引擎版本信息。
- MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本。
- MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本。
- MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。
- MONGO_44_WT：MongoDB 4.4 WiredTiger存储引擎版本。
- MONGO_50_WT：MongoDB 5.0 WiredTiger存储引擎版本。
- MONGO_60_WT：MongoDB 6.0 WiredTiger存储引擎版本。
- MONGO_70_WT：MongoDB 7.0 WiredTiger存储引擎版本。
     */
    public String getMongoVersion() {
        return this.MongoVersion;
    }

    /**
     * Set 实例存储引擎版本信息。
- MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本。
- MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本。
- MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。
- MONGO_44_WT：MongoDB 4.4 WiredTiger存储引擎版本。
- MONGO_50_WT：MongoDB 5.0 WiredTiger存储引擎版本。
- MONGO_60_WT：MongoDB 6.0 WiredTiger存储引擎版本。
- MONGO_70_WT：MongoDB 7.0 WiredTiger存储引擎版本。
     * @param MongoVersion 实例存储引擎版本信息。
- MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本。
- MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本。
- MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。
- MONGO_44_WT：MongoDB 4.4 WiredTiger存储引擎版本。
- MONGO_50_WT：MongoDB 5.0 WiredTiger存储引擎版本。
- MONGO_60_WT：MongoDB 6.0 WiredTiger存储引擎版本。
- MONGO_70_WT：MongoDB 7.0 WiredTiger存储引擎版本。
     */
    public void setMongoVersion(String MongoVersion) {
        this.MongoVersion = MongoVersion;
    }

    /**
     * Get 实例内存规格，单位：MB。 
     * @return Memory 实例内存规格，单位：MB。
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 实例内存规格，单位：MB。
     * @param Memory 实例内存规格，单位：MB。
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 实例磁盘规格，单位：MB。 
     * @return Volume 实例磁盘规格，单位：MB。
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set 实例磁盘规格，单位：MB。
     * @param Volume 实例磁盘规格，单位：MB。
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get 实例 CPU 核心数。 
     * @return CpuNum 实例 CPU 核心数。
     */
    public Long getCpuNum() {
        return this.CpuNum;
    }

    /**
     * Set 实例 CPU 核心数。
     * @param CpuNum 实例 CPU 核心数。
     */
    public void setCpuNum(Long CpuNum) {
        this.CpuNum = CpuNum;
    }

    /**
     * Get 实例机器类型。
- HIO10G：通用高 HIO 万兆型。
- HCD：云盘版类型。 
     * @return MachineType 实例机器类型。
- HIO10G：通用高 HIO 万兆型。
- HCD：云盘版类型。
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set 实例机器类型。
- HIO10G：通用高 HIO 万兆型。
- HCD：云盘版类型。
     * @param MachineType 实例机器类型。
- HIO10G：通用高 HIO 万兆型。
- HCD：云盘版类型。
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get 实例从节点数。 
     * @return SecondaryNum 实例从节点数。
     */
    public Long getSecondaryNum() {
        return this.SecondaryNum;
    }

    /**
     * Set 实例从节点数。
     * @param SecondaryNum 实例从节点数。
     */
    public void setSecondaryNum(Long SecondaryNum) {
        this.SecondaryNum = SecondaryNum;
    }

    /**
     * Get 实例分片数。 
     * @return ReplicationSetNum 实例分片数。
     */
    public Long getReplicationSetNum() {
        return this.ReplicationSetNum;
    }

    /**
     * Set 实例分片数。
     * @param ReplicationSetNum 实例分片数。
     */
    public void setReplicationSetNum(Long ReplicationSetNum) {
        this.ReplicationSetNum = ReplicationSetNum;
    }

    /**
     * Get 实例自动续费标志。
- 0：手动续费。
- 1：自动续费。
- 2：确认不续费。 
     * @return AutoRenewFlag 实例自动续费标志。
- 0：手动续费。
- 1：自动续费。
- 2：确认不续费。
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 实例自动续费标志。
- 0：手动续费。
- 1：自动续费。
- 2：确认不续费。
     * @param AutoRenewFlag 实例自动续费标志。
- 0：手动续费。
- 1：自动续费。
- 2：确认不续费。
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 已用容量，单位：MB。 
     * @return UsedVolume 已用容量，单位：MB。
     */
    public Long getUsedVolume() {
        return this.UsedVolume;
    }

    /**
     * Set 已用容量，单位：MB。
     * @param UsedVolume 已用容量，单位：MB。
     */
    public void setUsedVolume(Long UsedVolume) {
        this.UsedVolume = UsedVolume;
    }

    /**
     * Get 维护窗口起始时间。 
     * @return MaintenanceStart 维护窗口起始时间。
     */
    public String getMaintenanceStart() {
        return this.MaintenanceStart;
    }

    /**
     * Set 维护窗口起始时间。
     * @param MaintenanceStart 维护窗口起始时间。
     */
    public void setMaintenanceStart(String MaintenanceStart) {
        this.MaintenanceStart = MaintenanceStart;
    }

    /**
     * Get 维护窗口结束时间。 
     * @return MaintenanceEnd 维护窗口结束时间。
     */
    public String getMaintenanceEnd() {
        return this.MaintenanceEnd;
    }

    /**
     * Set 维护窗口结束时间。
     * @param MaintenanceEnd 维护窗口结束时间。
     */
    public void setMaintenanceEnd(String MaintenanceEnd) {
        this.MaintenanceEnd = MaintenanceEnd;
    }

    /**
     * Get 分片信息。 
     * @return ReplicaSets 分片信息。
     */
    public ShardInfo [] getReplicaSets() {
        return this.ReplicaSets;
    }

    /**
     * Set 分片信息。
     * @param ReplicaSets 分片信息。
     */
    public void setReplicaSets(ShardInfo [] ReplicaSets) {
        this.ReplicaSets = ReplicaSets;
    }

    /**
     * Get 只读实例信息。 
     * @return ReadonlyInstances 只读实例信息。
     */
    public DBInstanceInfo [] getReadonlyInstances() {
        return this.ReadonlyInstances;
    }

    /**
     * Set 只读实例信息。
     * @param ReadonlyInstances 只读实例信息。
     */
    public void setReadonlyInstances(DBInstanceInfo [] ReadonlyInstances) {
        this.ReadonlyInstances = ReadonlyInstances;
    }

    /**
     * Get 灾备实例信息。 
     * @return StandbyInstances 灾备实例信息。
     */
    public DBInstanceInfo [] getStandbyInstances() {
        return this.StandbyInstances;
    }

    /**
     * Set 灾备实例信息。
     * @param StandbyInstances 灾备实例信息。
     */
    public void setStandbyInstances(DBInstanceInfo [] StandbyInstances) {
        this.StandbyInstances = StandbyInstances;
    }

    /**
     * Get 临时实例信息。 
     * @return CloneInstances 临时实例信息。
     */
    public DBInstanceInfo [] getCloneInstances() {
        return this.CloneInstances;
    }

    /**
     * Set 临时实例信息。
     * @param CloneInstances 临时实例信息。
     */
    public void setCloneInstances(DBInstanceInfo [] CloneInstances) {
        this.CloneInstances = CloneInstances;
    }

    /**
     * Get 关联实例信息，对于正式实例，该字段表示它的临时实例信息；对于临时实例，则表示它的正式实例信息;如果为只读/灾备实例,则表示他的主实例信息。 
     * @return RelatedInstance 关联实例信息，对于正式实例，该字段表示它的临时实例信息；对于临时实例，则表示它的正式实例信息;如果为只读/灾备实例,则表示他的主实例信息。
     */
    public DBInstanceInfo getRelatedInstance() {
        return this.RelatedInstance;
    }

    /**
     * Set 关联实例信息，对于正式实例，该字段表示它的临时实例信息；对于临时实例，则表示它的正式实例信息;如果为只读/灾备实例,则表示他的主实例信息。
     * @param RelatedInstance 关联实例信息，对于正式实例，该字段表示它的临时实例信息；对于临时实例，则表示它的正式实例信息;如果为只读/灾备实例,则表示他的主实例信息。
     */
    public void setRelatedInstance(DBInstanceInfo RelatedInstance) {
        this.RelatedInstance = RelatedInstance;
    }

    /**
     * Get 实例标签信息集合。 
     * @return Tags 实例标签信息集合。
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set 实例标签信息集合。
     * @param Tags 实例标签信息集合。
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 实例版本标记。 
     * @return InstanceVer 实例版本标记。
     */
    public Long getInstanceVer() {
        return this.InstanceVer;
    }

    /**
     * Set 实例版本标记。
     * @param InstanceVer 实例版本标记。
     */
    public void setInstanceVer(Long InstanceVer) {
        this.InstanceVer = InstanceVer;
    }

    /**
     * Get 实例版本标记。 
     * @return ClusterVer 实例版本标记。
     */
    public Long getClusterVer() {
        return this.ClusterVer;
    }

    /**
     * Set 实例版本标记。
     * @param ClusterVer 实例版本标记。
     */
    public void setClusterVer(Long ClusterVer) {
        this.ClusterVer = ClusterVer;
    }

    /**
     * Get 协议信息：mongodb。 
     * @return Protocol 协议信息：mongodb。
     */
    public Long getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议信息：mongodb。
     * @param Protocol 协议信息：mongodb。
     */
    public void setProtocol(Long Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 实例类型。
- 0：所有实例。
- 1：正式实例。
- 2：临时实例
- 3：只读实例。
- -1：同时包括正式实例、只读实例与灾备实例。 
     * @return InstanceType 实例类型。
- 0：所有实例。
- 1：正式实例。
- 2：临时实例
- 3：只读实例。
- -1：同时包括正式实例、只读实例与灾备实例。
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型。
- 0：所有实例。
- 1：正式实例。
- 2：临时实例
- 3：只读实例。
- -1：同时包括正式实例、只读实例与灾备实例。
     * @param InstanceType 实例类型。
- 0：所有实例。
- 1：正式实例。
- 2：临时实例
- 3：只读实例。
- -1：同时包括正式实例、只读实例与灾备实例。
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 实例状态描述。 
     * @return InstanceStatusDesc 实例状态描述。
     */
    public String getInstanceStatusDesc() {
        return this.InstanceStatusDesc;
    }

    /**
     * Set 实例状态描述。
     * @param InstanceStatusDesc 实例状态描述。
     */
    public void setInstanceStatusDesc(String InstanceStatusDesc) {
        this.InstanceStatusDesc = InstanceStatusDesc;
    }

    /**
     * Get 实例对应的物理实例 ID。回档并替换过的实例有不同的 InstanceId 和 RealInstanceId，从 barad 获取监控数据等场景下需要用物理 ID 获取。 
     * @return RealInstanceId 实例对应的物理实例 ID。回档并替换过的实例有不同的 InstanceId 和 RealInstanceId，从 barad 获取监控数据等场景下需要用物理 ID 获取。
     */
    public String getRealInstanceId() {
        return this.RealInstanceId;
    }

    /**
     * Set 实例对应的物理实例 ID。回档并替换过的实例有不同的 InstanceId 和 RealInstanceId，从 barad 获取监控数据等场景下需要用物理 ID 获取。
     * @param RealInstanceId 实例对应的物理实例 ID。回档并替换过的实例有不同的 InstanceId 和 RealInstanceId，从 barad 获取监控数据等场景下需要用物理 ID 获取。
     */
    public void setRealInstanceId(String RealInstanceId) {
        this.RealInstanceId = RealInstanceId;
    }

    /**
     * Get 实例当前可用区信息。 
     * @return ZoneList 实例当前可用区信息。
     */
    public String [] getZoneList() {
        return this.ZoneList;
    }

    /**
     * Set 实例当前可用区信息。
     * @param ZoneList 实例当前可用区信息。
     */
    public void setZoneList(String [] ZoneList) {
        this.ZoneList = ZoneList;
    }

    /**
     * Get mongos 节点个数。 
     * @return MongosNodeNum mongos 节点个数。
     */
    public Long getMongosNodeNum() {
        return this.MongosNodeNum;
    }

    /**
     * Set mongos 节点个数。
     * @param MongosNodeNum mongos 节点个数。
     */
    public void setMongosNodeNum(Long MongosNodeNum) {
        this.MongosNodeNum = MongosNodeNum;
    }

    /**
     * Get mongos 节点内存。单位：MB。 
     * @return MongosMemory mongos 节点内存。单位：MB。
     */
    public Long getMongosMemory() {
        return this.MongosMemory;
    }

    /**
     * Set mongos 节点内存。单位：MB。
     * @param MongosMemory mongos 节点内存。单位：MB。
     */
    public void setMongosMemory(Long MongosMemory) {
        this.MongosMemory = MongosMemory;
    }

    /**
     * Get mongos 节点 CPU 核数。 
     * @return MongosCpuNum mongos 节点 CPU 核数。
     */
    public Long getMongosCpuNum() {
        return this.MongosCpuNum;
    }

    /**
     * Set mongos 节点 CPU 核数。
     * @param MongosCpuNum mongos 节点 CPU 核数。
     */
    public void setMongosCpuNum(Long MongosCpuNum) {
        this.MongosCpuNum = MongosCpuNum;
    }

    /**
     * Get Config Server节点个数。 
     * @return ConfigServerNodeNum Config Server节点个数。
     */
    public Long getConfigServerNodeNum() {
        return this.ConfigServerNodeNum;
    }

    /**
     * Set Config Server节点个数。
     * @param ConfigServerNodeNum Config Server节点个数。
     */
    public void setConfigServerNodeNum(Long ConfigServerNodeNum) {
        this.ConfigServerNodeNum = ConfigServerNodeNum;
    }

    /**
     * Get Config Server节点内存。单位：MB。 
     * @return ConfigServerMemory Config Server节点内存。单位：MB。
     */
    public Long getConfigServerMemory() {
        return this.ConfigServerMemory;
    }

    /**
     * Set Config Server节点内存。单位：MB。
     * @param ConfigServerMemory Config Server节点内存。单位：MB。
     */
    public void setConfigServerMemory(Long ConfigServerMemory) {
        this.ConfigServerMemory = ConfigServerMemory;
    }

    /**
     * Get Config Server节点磁盘大小。单位：MB。 
     * @return ConfigServerVolume Config Server节点磁盘大小。单位：MB。
     */
    public Long getConfigServerVolume() {
        return this.ConfigServerVolume;
    }

    /**
     * Set Config Server节点磁盘大小。单位：MB。
     * @param ConfigServerVolume Config Server节点磁盘大小。单位：MB。
     */
    public void setConfigServerVolume(Long ConfigServerVolume) {
        this.ConfigServerVolume = ConfigServerVolume;
    }

    /**
     * Get Config Server 节点 CPU 核数。 
     * @return ConfigServerCpuNum Config Server 节点 CPU 核数。
     */
    public Long getConfigServerCpuNum() {
        return this.ConfigServerCpuNum;
    }

    /**
     * Set Config Server 节点 CPU 核数。
     * @param ConfigServerCpuNum Config Server 节点 CPU 核数。
     */
    public void setConfigServerCpuNum(Long ConfigServerCpuNum) {
        this.ConfigServerCpuNum = ConfigServerCpuNum;
    }

    /**
     * Get readonly节点个数。 
     * @return ReadonlyNodeNum readonly节点个数。
     */
    public Long getReadonlyNodeNum() {
        return this.ReadonlyNodeNum;
    }

    /**
     * Set readonly节点个数。
     * @param ReadonlyNodeNum readonly节点个数。
     */
    public void setReadonlyNodeNum(Long ReadonlyNodeNum) {
        this.ReadonlyNodeNum = ReadonlyNodeNum;
    }

    public InstanceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceDetail(InstanceDetail source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new Long(source.ClusterType);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.NetType != null) {
            this.NetType = new Long(source.NetType);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.DeadLine != null) {
            this.DeadLine = new String(source.DeadLine);
        }
        if (source.MongoVersion != null) {
            this.MongoVersion = new String(source.MongoVersion);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Volume != null) {
            this.Volume = new Long(source.Volume);
        }
        if (source.CpuNum != null) {
            this.CpuNum = new Long(source.CpuNum);
        }
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.SecondaryNum != null) {
            this.SecondaryNum = new Long(source.SecondaryNum);
        }
        if (source.ReplicationSetNum != null) {
            this.ReplicationSetNum = new Long(source.ReplicationSetNum);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.UsedVolume != null) {
            this.UsedVolume = new Long(source.UsedVolume);
        }
        if (source.MaintenanceStart != null) {
            this.MaintenanceStart = new String(source.MaintenanceStart);
        }
        if (source.MaintenanceEnd != null) {
            this.MaintenanceEnd = new String(source.MaintenanceEnd);
        }
        if (source.ReplicaSets != null) {
            this.ReplicaSets = new ShardInfo[source.ReplicaSets.length];
            for (int i = 0; i < source.ReplicaSets.length; i++) {
                this.ReplicaSets[i] = new ShardInfo(source.ReplicaSets[i]);
            }
        }
        if (source.ReadonlyInstances != null) {
            this.ReadonlyInstances = new DBInstanceInfo[source.ReadonlyInstances.length];
            for (int i = 0; i < source.ReadonlyInstances.length; i++) {
                this.ReadonlyInstances[i] = new DBInstanceInfo(source.ReadonlyInstances[i]);
            }
        }
        if (source.StandbyInstances != null) {
            this.StandbyInstances = new DBInstanceInfo[source.StandbyInstances.length];
            for (int i = 0; i < source.StandbyInstances.length; i++) {
                this.StandbyInstances[i] = new DBInstanceInfo(source.StandbyInstances[i]);
            }
        }
        if (source.CloneInstances != null) {
            this.CloneInstances = new DBInstanceInfo[source.CloneInstances.length];
            for (int i = 0; i < source.CloneInstances.length; i++) {
                this.CloneInstances[i] = new DBInstanceInfo(source.CloneInstances[i]);
            }
        }
        if (source.RelatedInstance != null) {
            this.RelatedInstance = new DBInstanceInfo(source.RelatedInstance);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.InstanceVer != null) {
            this.InstanceVer = new Long(source.InstanceVer);
        }
        if (source.ClusterVer != null) {
            this.ClusterVer = new Long(source.ClusterVer);
        }
        if (source.Protocol != null) {
            this.Protocol = new Long(source.Protocol);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new Long(source.InstanceType);
        }
        if (source.InstanceStatusDesc != null) {
            this.InstanceStatusDesc = new String(source.InstanceStatusDesc);
        }
        if (source.RealInstanceId != null) {
            this.RealInstanceId = new String(source.RealInstanceId);
        }
        if (source.ZoneList != null) {
            this.ZoneList = new String[source.ZoneList.length];
            for (int i = 0; i < source.ZoneList.length; i++) {
                this.ZoneList[i] = new String(source.ZoneList[i]);
            }
        }
        if (source.MongosNodeNum != null) {
            this.MongosNodeNum = new Long(source.MongosNodeNum);
        }
        if (source.MongosMemory != null) {
            this.MongosMemory = new Long(source.MongosMemory);
        }
        if (source.MongosCpuNum != null) {
            this.MongosCpuNum = new Long(source.MongosCpuNum);
        }
        if (source.ConfigServerNodeNum != null) {
            this.ConfigServerNodeNum = new Long(source.ConfigServerNodeNum);
        }
        if (source.ConfigServerMemory != null) {
            this.ConfigServerMemory = new Long(source.ConfigServerMemory);
        }
        if (source.ConfigServerVolume != null) {
            this.ConfigServerVolume = new Long(source.ConfigServerVolume);
        }
        if (source.ConfigServerCpuNum != null) {
            this.ConfigServerCpuNum = new Long(source.ConfigServerCpuNum);
        }
        if (source.ReadonlyNodeNum != null) {
            this.ReadonlyNodeNum = new Long(source.ReadonlyNodeNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DeadLine", this.DeadLine);
        this.setParamSimple(map, prefix + "MongoVersion", this.MongoVersion);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "CpuNum", this.CpuNum);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "SecondaryNum", this.SecondaryNum);
        this.setParamSimple(map, prefix + "ReplicationSetNum", this.ReplicationSetNum);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "UsedVolume", this.UsedVolume);
        this.setParamSimple(map, prefix + "MaintenanceStart", this.MaintenanceStart);
        this.setParamSimple(map, prefix + "MaintenanceEnd", this.MaintenanceEnd);
        this.setParamArrayObj(map, prefix + "ReplicaSets.", this.ReplicaSets);
        this.setParamArrayObj(map, prefix + "ReadonlyInstances.", this.ReadonlyInstances);
        this.setParamArrayObj(map, prefix + "StandbyInstances.", this.StandbyInstances);
        this.setParamArrayObj(map, prefix + "CloneInstances.", this.CloneInstances);
        this.setParamObj(map, prefix + "RelatedInstance.", this.RelatedInstance);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "InstanceVer", this.InstanceVer);
        this.setParamSimple(map, prefix + "ClusterVer", this.ClusterVer);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceStatusDesc", this.InstanceStatusDesc);
        this.setParamSimple(map, prefix + "RealInstanceId", this.RealInstanceId);
        this.setParamArraySimple(map, prefix + "ZoneList.", this.ZoneList);
        this.setParamSimple(map, prefix + "MongosNodeNum", this.MongosNodeNum);
        this.setParamSimple(map, prefix + "MongosMemory", this.MongosMemory);
        this.setParamSimple(map, prefix + "MongosCpuNum", this.MongosCpuNum);
        this.setParamSimple(map, prefix + "ConfigServerNodeNum", this.ConfigServerNodeNum);
        this.setParamSimple(map, prefix + "ConfigServerMemory", this.ConfigServerMemory);
        this.setParamSimple(map, prefix + "ConfigServerVolume", this.ConfigServerVolume);
        this.setParamSimple(map, prefix + "ConfigServerCpuNum", this.ConfigServerCpuNum);
        this.setParamSimple(map, prefix + "ReadonlyNodeNum", this.ReadonlyNodeNum);

    }
}

