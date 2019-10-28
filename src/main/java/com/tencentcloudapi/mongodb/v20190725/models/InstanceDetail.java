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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceDetail  extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 付费类型，可能的返回值：1-包年包月；0-按量计费
    */
    @SerializedName("PayMode")
    @Expose
    private Integer PayMode;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;

    /**
    * 集群类型，可能的返回值：0-副本集实例，1-分片实例，
    */
    @SerializedName("ClusterType")
    @Expose
    private Integer ClusterType;

    /**
    * 地域信息
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 可用区信息
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 网络类型，可能的返回值：0-基础网络，1-私有网络
    */
    @SerializedName("NetType")
    @Expose
    private Integer NetType;

    /**
    * 私有网络的ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 私有网络的子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 实例状态，可能的返回值：0-待初始化，1-流程处理中，2-运行中，-2-实例已过期
    */
    @SerializedName("Status")
    @Expose
    private Integer Status;

    /**
    * 实例IP
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 端口号
    */
    @SerializedName("Vport")
    @Expose
    private Integer Vport;

    /**
    * 实例创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 实例到期时间
    */
    @SerializedName("DeadLine")
    @Expose
    private String DeadLine;

    /**
    * 实例版本信息
    */
    @SerializedName("MongoVersion")
    @Expose
    private String MongoVersion;

    /**
    * 实例内存规格，单位为MB
    */
    @SerializedName("Memory")
    @Expose
    private Integer Memory;

    /**
    * 实例磁盘规格，单位为MB
    */
    @SerializedName("Volume")
    @Expose
    private Integer Volume;

    /**
    * 实例CPU核心数
    */
    @SerializedName("CpuNum")
    @Expose
    private Integer CpuNum;

    /**
    * 实例机器类型
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * 实例从节点数
    */
    @SerializedName("SecondaryNum")
    @Expose
    private Integer SecondaryNum;

    /**
    * 实例分片数
    */
    @SerializedName("ReplicationSetNum")
    @Expose
    private Integer ReplicationSetNum;

    /**
    * 实例自动续费标志，可能的返回值：0-手动续费，1-自动续费，2-确认不续费
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Integer AutoRenewFlag;

    /**
    * 已用容量，单位MB
    */
    @SerializedName("UsedVolume")
    @Expose
    private Integer UsedVolume;

    /**
    * 维护窗口起始时间
    */
    @SerializedName("MaintenanceStart")
    @Expose
    private String MaintenanceStart;

    /**
    * 维护窗口结束时间
    */
    @SerializedName("MaintenanceEnd")
    @Expose
    private String MaintenanceEnd;

    /**
    * 分片信息
    */
    @SerializedName("ReplicaSets")
    @Expose
    private ShardInfo [] ReplicaSets;

    /**
    * 只读实例信息
    */
    @SerializedName("ReadonlyInstances")
    @Expose
    private DBInstanceInfo [] ReadonlyInstances;

    /**
    * 灾备实例信息
    */
    @SerializedName("StandbyInstances")
    @Expose
    private DBInstanceInfo [] StandbyInstances;

    /**
    * 临时实例信息
    */
    @SerializedName("CloneInstances")
    @Expose
    private DBInstanceInfo [] CloneInstances;

    /**
    * 关联实例信息，对于正式实例，该字段表示它的临时实例信息；对于临时实例，则表示它的正式实例信息;如果为只读/灾备实例,则表示他的主实例信息
    */
    @SerializedName("RelatedInstance")
    @Expose
    private DBInstanceInfo RelatedInstance;

    /**
    * 实例标签信息集合
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * 实例版本标记
    */
    @SerializedName("InstanceVer")
    @Expose
    private Integer InstanceVer;

    /**
    * 实例版本标记
    */
    @SerializedName("ClusterVer")
    @Expose
    private Integer ClusterVer;

    /**
    * 协议信息，可能的返回值：1-mongodb，2-dynamodb
    */
    @SerializedName("Protocol")
    @Expose
    private Integer Protocol;

    /**
    * 实例类型，可能的返回值，1-正式实例，2-临时实例，3-只读实例，4-灾备实例
    */
    @SerializedName("InstanceType")
    @Expose
    private Integer InstanceType;

    /**
    * 实例状态描述
    */
    @SerializedName("InstanceStatusDesc")
    @Expose
    private String InstanceStatusDesc;

    /**
    * 实例对应的物理实例id，回档并替换过的实例有不同的InstanceId和RealInstanceId，从barad获取监控数据等场景下需要用物理id获取
    */
    @SerializedName("RealInstanceId")
    @Expose
    private String RealInstanceId;

    /**
     * 获取实例ID
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取实例名称
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * 设置实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * 获取付费类型，可能的返回值：1-包年包月；0-按量计费
     * @return PayMode 付费类型，可能的返回值：1-包年包月；0-按量计费
     */
    public Integer getPayMode() {
        return this.PayMode;
    }

    /**
     * 设置付费类型，可能的返回值：1-包年包月；0-按量计费
     * @param PayMode 付费类型，可能的返回值：1-包年包月；0-按量计费
     */
    public void setPayMode(Integer PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * 获取项目ID
     * @return ProjectId 项目ID
     */
    public Integer getProjectId() {
        return this.ProjectId;
    }

    /**
     * 设置项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * 获取集群类型，可能的返回值：0-副本集实例，1-分片实例，
     * @return ClusterType 集群类型，可能的返回值：0-副本集实例，1-分片实例，
     */
    public Integer getClusterType() {
        return this.ClusterType;
    }

    /**
     * 设置集群类型，可能的返回值：0-副本集实例，1-分片实例，
     * @param ClusterType 集群类型，可能的返回值：0-副本集实例，1-分片实例，
     */
    public void setClusterType(Integer ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * 获取地域信息
     * @return Region 地域信息
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * 设置地域信息
     * @param Region 地域信息
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * 获取可用区信息
     * @return Zone 可用区信息
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * 设置可用区信息
     * @param Zone 可用区信息
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * 获取网络类型，可能的返回值：0-基础网络，1-私有网络
     * @return NetType 网络类型，可能的返回值：0-基础网络，1-私有网络
     */
    public Integer getNetType() {
        return this.NetType;
    }

    /**
     * 设置网络类型，可能的返回值：0-基础网络，1-私有网络
     * @param NetType 网络类型，可能的返回值：0-基础网络，1-私有网络
     */
    public void setNetType(Integer NetType) {
        this.NetType = NetType;
    }

    /**
     * 获取私有网络的ID
     * @return VpcId 私有网络的ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置私有网络的ID
     * @param VpcId 私有网络的ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取私有网络的子网ID
     * @return SubnetId 私有网络的子网ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * 设置私有网络的子网ID
     * @param SubnetId 私有网络的子网ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * 获取实例状态，可能的返回值：0-待初始化，1-流程处理中，2-运行中，-2-实例已过期
     * @return Status 实例状态，可能的返回值：0-待初始化，1-流程处理中，2-运行中，-2-实例已过期
     */
    public Integer getStatus() {
        return this.Status;
    }

    /**
     * 设置实例状态，可能的返回值：0-待初始化，1-流程处理中，2-运行中，-2-实例已过期
     * @param Status 实例状态，可能的返回值：0-待初始化，1-流程处理中，2-运行中，-2-实例已过期
     */
    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    /**
     * 获取实例IP
     * @return Vip 实例IP
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * 设置实例IP
     * @param Vip 实例IP
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * 获取端口号
     * @return Vport 端口号
     */
    public Integer getVport() {
        return this.Vport;
    }

    /**
     * 设置端口号
     * @param Vport 端口号
     */
    public void setVport(Integer Vport) {
        this.Vport = Vport;
    }

    /**
     * 获取实例创建时间
     * @return CreateTime 实例创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置实例创建时间
     * @param CreateTime 实例创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取实例到期时间
     * @return DeadLine 实例到期时间
     */
    public String getDeadLine() {
        return this.DeadLine;
    }

    /**
     * 设置实例到期时间
     * @param DeadLine 实例到期时间
     */
    public void setDeadLine(String DeadLine) {
        this.DeadLine = DeadLine;
    }

    /**
     * 获取实例版本信息
     * @return MongoVersion 实例版本信息
     */
    public String getMongoVersion() {
        return this.MongoVersion;
    }

    /**
     * 设置实例版本信息
     * @param MongoVersion 实例版本信息
     */
    public void setMongoVersion(String MongoVersion) {
        this.MongoVersion = MongoVersion;
    }

    /**
     * 获取实例内存规格，单位为MB
     * @return Memory 实例内存规格，单位为MB
     */
    public Integer getMemory() {
        return this.Memory;
    }

    /**
     * 设置实例内存规格，单位为MB
     * @param Memory 实例内存规格，单位为MB
     */
    public void setMemory(Integer Memory) {
        this.Memory = Memory;
    }

    /**
     * 获取实例磁盘规格，单位为MB
     * @return Volume 实例磁盘规格，单位为MB
     */
    public Integer getVolume() {
        return this.Volume;
    }

    /**
     * 设置实例磁盘规格，单位为MB
     * @param Volume 实例磁盘规格，单位为MB
     */
    public void setVolume(Integer Volume) {
        this.Volume = Volume;
    }

    /**
     * 获取实例CPU核心数
     * @return CpuNum 实例CPU核心数
     */
    public Integer getCpuNum() {
        return this.CpuNum;
    }

    /**
     * 设置实例CPU核心数
     * @param CpuNum 实例CPU核心数
     */
    public void setCpuNum(Integer CpuNum) {
        this.CpuNum = CpuNum;
    }

    /**
     * 获取实例机器类型
     * @return MachineType 实例机器类型
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * 设置实例机器类型
     * @param MachineType 实例机器类型
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * 获取实例从节点数
     * @return SecondaryNum 实例从节点数
     */
    public Integer getSecondaryNum() {
        return this.SecondaryNum;
    }

    /**
     * 设置实例从节点数
     * @param SecondaryNum 实例从节点数
     */
    public void setSecondaryNum(Integer SecondaryNum) {
        this.SecondaryNum = SecondaryNum;
    }

    /**
     * 获取实例分片数
     * @return ReplicationSetNum 实例分片数
     */
    public Integer getReplicationSetNum() {
        return this.ReplicationSetNum;
    }

    /**
     * 设置实例分片数
     * @param ReplicationSetNum 实例分片数
     */
    public void setReplicationSetNum(Integer ReplicationSetNum) {
        this.ReplicationSetNum = ReplicationSetNum;
    }

    /**
     * 获取实例自动续费标志，可能的返回值：0-手动续费，1-自动续费，2-确认不续费
     * @return AutoRenewFlag 实例自动续费标志，可能的返回值：0-手动续费，1-自动续费，2-确认不续费
     */
    public Integer getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * 设置实例自动续费标志，可能的返回值：0-手动续费，1-自动续费，2-确认不续费
     * @param AutoRenewFlag 实例自动续费标志，可能的返回值：0-手动续费，1-自动续费，2-确认不续费
     */
    public void setAutoRenewFlag(Integer AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * 获取已用容量，单位MB
     * @return UsedVolume 已用容量，单位MB
     */
    public Integer getUsedVolume() {
        return this.UsedVolume;
    }

    /**
     * 设置已用容量，单位MB
     * @param UsedVolume 已用容量，单位MB
     */
    public void setUsedVolume(Integer UsedVolume) {
        this.UsedVolume = UsedVolume;
    }

    /**
     * 获取维护窗口起始时间
     * @return MaintenanceStart 维护窗口起始时间
     */
    public String getMaintenanceStart() {
        return this.MaintenanceStart;
    }

    /**
     * 设置维护窗口起始时间
     * @param MaintenanceStart 维护窗口起始时间
     */
    public void setMaintenanceStart(String MaintenanceStart) {
        this.MaintenanceStart = MaintenanceStart;
    }

    /**
     * 获取维护窗口结束时间
     * @return MaintenanceEnd 维护窗口结束时间
     */
    public String getMaintenanceEnd() {
        return this.MaintenanceEnd;
    }

    /**
     * 设置维护窗口结束时间
     * @param MaintenanceEnd 维护窗口结束时间
     */
    public void setMaintenanceEnd(String MaintenanceEnd) {
        this.MaintenanceEnd = MaintenanceEnd;
    }

    /**
     * 获取分片信息
     * @return ReplicaSets 分片信息
     */
    public ShardInfo [] getReplicaSets() {
        return this.ReplicaSets;
    }

    /**
     * 设置分片信息
     * @param ReplicaSets 分片信息
     */
    public void setReplicaSets(ShardInfo [] ReplicaSets) {
        this.ReplicaSets = ReplicaSets;
    }

    /**
     * 获取只读实例信息
     * @return ReadonlyInstances 只读实例信息
     */
    public DBInstanceInfo [] getReadonlyInstances() {
        return this.ReadonlyInstances;
    }

    /**
     * 设置只读实例信息
     * @param ReadonlyInstances 只读实例信息
     */
    public void setReadonlyInstances(DBInstanceInfo [] ReadonlyInstances) {
        this.ReadonlyInstances = ReadonlyInstances;
    }

    /**
     * 获取灾备实例信息
     * @return StandbyInstances 灾备实例信息
     */
    public DBInstanceInfo [] getStandbyInstances() {
        return this.StandbyInstances;
    }

    /**
     * 设置灾备实例信息
     * @param StandbyInstances 灾备实例信息
     */
    public void setStandbyInstances(DBInstanceInfo [] StandbyInstances) {
        this.StandbyInstances = StandbyInstances;
    }

    /**
     * 获取临时实例信息
     * @return CloneInstances 临时实例信息
     */
    public DBInstanceInfo [] getCloneInstances() {
        return this.CloneInstances;
    }

    /**
     * 设置临时实例信息
     * @param CloneInstances 临时实例信息
     */
    public void setCloneInstances(DBInstanceInfo [] CloneInstances) {
        this.CloneInstances = CloneInstances;
    }

    /**
     * 获取关联实例信息，对于正式实例，该字段表示它的临时实例信息；对于临时实例，则表示它的正式实例信息;如果为只读/灾备实例,则表示他的主实例信息
     * @return RelatedInstance 关联实例信息，对于正式实例，该字段表示它的临时实例信息；对于临时实例，则表示它的正式实例信息;如果为只读/灾备实例,则表示他的主实例信息
     */
    public DBInstanceInfo getRelatedInstance() {
        return this.RelatedInstance;
    }

    /**
     * 设置关联实例信息，对于正式实例，该字段表示它的临时实例信息；对于临时实例，则表示它的正式实例信息;如果为只读/灾备实例,则表示他的主实例信息
     * @param RelatedInstance 关联实例信息，对于正式实例，该字段表示它的临时实例信息；对于临时实例，则表示它的正式实例信息;如果为只读/灾备实例,则表示他的主实例信息
     */
    public void setRelatedInstance(DBInstanceInfo RelatedInstance) {
        this.RelatedInstance = RelatedInstance;
    }

    /**
     * 获取实例标签信息集合
     * @return Tags 实例标签信息集合
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * 设置实例标签信息集合
     * @param Tags 实例标签信息集合
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * 获取实例版本标记
     * @return InstanceVer 实例版本标记
     */
    public Integer getInstanceVer() {
        return this.InstanceVer;
    }

    /**
     * 设置实例版本标记
     * @param InstanceVer 实例版本标记
     */
    public void setInstanceVer(Integer InstanceVer) {
        this.InstanceVer = InstanceVer;
    }

    /**
     * 获取实例版本标记
     * @return ClusterVer 实例版本标记
     */
    public Integer getClusterVer() {
        return this.ClusterVer;
    }

    /**
     * 设置实例版本标记
     * @param ClusterVer 实例版本标记
     */
    public void setClusterVer(Integer ClusterVer) {
        this.ClusterVer = ClusterVer;
    }

    /**
     * 获取协议信息，可能的返回值：1-mongodb，2-dynamodb
     * @return Protocol 协议信息，可能的返回值：1-mongodb，2-dynamodb
     */
    public Integer getProtocol() {
        return this.Protocol;
    }

    /**
     * 设置协议信息，可能的返回值：1-mongodb，2-dynamodb
     * @param Protocol 协议信息，可能的返回值：1-mongodb，2-dynamodb
     */
    public void setProtocol(Integer Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * 获取实例类型，可能的返回值，1-正式实例，2-临时实例，3-只读实例，4-灾备实例
     * @return InstanceType 实例类型，可能的返回值，1-正式实例，2-临时实例，3-只读实例，4-灾备实例
     */
    public Integer getInstanceType() {
        return this.InstanceType;
    }

    /**
     * 设置实例类型，可能的返回值，1-正式实例，2-临时实例，3-只读实例，4-灾备实例
     * @param InstanceType 实例类型，可能的返回值，1-正式实例，2-临时实例，3-只读实例，4-灾备实例
     */
    public void setInstanceType(Integer InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * 获取实例状态描述
     * @return InstanceStatusDesc 实例状态描述
     */
    public String getInstanceStatusDesc() {
        return this.InstanceStatusDesc;
    }

    /**
     * 设置实例状态描述
     * @param InstanceStatusDesc 实例状态描述
     */
    public void setInstanceStatusDesc(String InstanceStatusDesc) {
        this.InstanceStatusDesc = InstanceStatusDesc;
    }

    /**
     * 获取实例对应的物理实例id，回档并替换过的实例有不同的InstanceId和RealInstanceId，从barad获取监控数据等场景下需要用物理id获取
     * @return RealInstanceId 实例对应的物理实例id，回档并替换过的实例有不同的InstanceId和RealInstanceId，从barad获取监控数据等场景下需要用物理id获取
     */
    public String getRealInstanceId() {
        return this.RealInstanceId;
    }

    /**
     * 设置实例对应的物理实例id，回档并替换过的实例有不同的InstanceId和RealInstanceId，从barad获取监控数据等场景下需要用物理id获取
     * @param RealInstanceId 实例对应的物理实例id，回档并替换过的实例有不同的InstanceId和RealInstanceId，从barad获取监控数据等场景下需要用物理id获取
     */
    public void setRealInstanceId(String RealInstanceId) {
        this.RealInstanceId = RealInstanceId;
    }

    /**
     * 内部实现，用户禁止调用
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

    }
}

