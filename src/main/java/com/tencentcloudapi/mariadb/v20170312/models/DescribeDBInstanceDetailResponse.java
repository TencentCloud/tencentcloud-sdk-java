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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBInstanceDetailResponse extends AbstractModel{

    /**
    * 实例Id
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
    * 实例状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 实例目前运行状态描述
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * 内网 IP 地址
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 内网端口
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * 是否临时实例，0为否，非0为是
    */
    @SerializedName("IsTmp")
    @Expose
    private Long IsTmp;

    /**
    * 节点数，2为一主一从，3为一主二从
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * 实例所在地域名称，如 ap-shanghai
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 实例所在可用区名称，如 ap-shanghai-1
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 字符串型的私有网络Id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 字符串型的私有网络子网Id
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 外网状态，0-未开通；1-已开通；2-关闭；3-开通中；4-关闭中
    */
    @SerializedName("WanStatus")
    @Expose
    private Long WanStatus;

    /**
    * 外网访问的域名，公网可解析
    */
    @SerializedName("WanDomain")
    @Expose
    private String WanDomain;

    /**
    * 外网 IP 地址，公网可访问
    */
    @SerializedName("WanVip")
    @Expose
    private String WanVip;

    /**
    * 外网端口
    */
    @SerializedName("WanPort")
    @Expose
    private Long WanPort;

    /**
    * 实例所属项目 Id
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * TDSQL 版本信息
    */
    @SerializedName("TdsqlVersion")
    @Expose
    private String TdsqlVersion;

    /**
    * 实例内存大小，单位 GB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 实例存储大小，单位 GB
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * 主可用区，如 ap-shanghai-1
    */
    @SerializedName("MasterZone")
    @Expose
    private String MasterZone;

    /**
    * 从可用区列表，如 [ap-shanghai-2]
    */
    @SerializedName("SlaveZones")
    @Expose
    private String [] SlaveZones;

    /**
    * 自动续费标志：0 否，1 是
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 独享集群Id，普通实例为空
    */
    @SerializedName("ExclusterId")
    @Expose
    private String ExclusterId;

    /**
    * 付费模式：prepaid 表示预付费
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * 实例创建时间，格式为 2006-01-02 15:04:05
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 实例是否支持审计
    */
    @SerializedName("IsAuditSupported")
    @Expose
    private Boolean IsAuditSupported;

    /**
    * 实例到期时间，格式为 2006-01-02 15:04:05
    */
    @SerializedName("PeriodEndTime")
    @Expose
    private String PeriodEndTime;

    /**
    * 机型信息
    */
    @SerializedName("Machine")
    @Expose
    private String Machine;

    /**
    * 存储空间使用率
    */
    @SerializedName("StorageUsage")
    @Expose
    private String StorageUsage;

    /**
    * 日志存储空间大小，单位 GB
    */
    @SerializedName("LogStorage")
    @Expose
    private Long LogStorage;

    /**
    * 是否支持数据加密。1-支持；0-不支持
    */
    @SerializedName("IsEncryptSupported")
    @Expose
    private Long IsEncryptSupported;

    /**
    * 内网IPv6
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vip6")
    @Expose
    private String Vip6;

    /**
    * 实例Cpu核数
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 产品类型ID
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * 最大QPS
    */
    @SerializedName("Qps")
    @Expose
    private Long Qps;

    /**
    * 是否支持IPv6
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ipv6Flag")
    @Expose
    private Long Ipv6Flag;

    /**
    * 外网IPv6地址，公网可访问
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WanVipv6")
    @Expose
    private String WanVipv6;

    /**
    * 外网状态，0-未开通；1-已开通；2-关闭；3-开通中；4-关闭中
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WanStatusIpv6")
    @Expose
    private Long WanStatusIpv6;

    /**
    * 外网IPv6端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WanPortIpv6")
    @Expose
    private Long WanPortIpv6;

    /**
    * 数据库引擎
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DbEngine")
    @Expose
    private String DbEngine;

    /**
    * 数据库版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DbVersion")
    @Expose
    private String DbVersion;

    /**
    * 标签信息
    */
    @SerializedName("ResourceTags")
    @Expose
    private ResourceTag [] ResourceTags;

    /**
    * DCN标志，0-无，1-主实例，2-灾备实例
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DcnFlag")
    @Expose
    private Long DcnFlag;

    /**
    * DCN状态，0-无，1-创建中，2-同步中，3-已断开
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DcnStatus")
    @Expose
    private Long DcnStatus;

    /**
    * DCN灾备实例数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DcnDstNum")
    @Expose
    private Long DcnDstNum;

    /**
    * 1： 主实例（独享型）, 2: 主实例, 3： 灾备实例, 4： 灾备实例（独享型）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * 实例的各个DB节点信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodesInfo")
    @Expose
    private NodeInfo [] NodesInfo;

    /**
    * 实例是否支持设置用户连接数限制，内核为10.1暂不支持。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsMaxUserConnectionsSupported")
    @Expose
    private Boolean IsMaxUserConnectionsSupported;

    /**
    * 对外显示的数据库版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DbVersionId")
    @Expose
    private String DbVersionId;

    /**
    * 加密状态, 0-未开启，1-已开启
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EncryptStatus")
    @Expose
    private Long EncryptStatus;

    /**
    * DCN的配置信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReplicaConfig")
    @Expose
    private DCNReplicaConfig ReplicaConfig;

    /**
    * DCN的运行状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReplicaStatus")
    @Expose
    private DCNReplicaStatus ReplicaStatus;

    /**
    * 独享集群类型，0:公有云, 1:金融围笼, 2:CDC集群
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExclusterType")
    @Expose
    private Long ExclusterType;

    /**
    * VPC就近访问
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RsAccessStrategy")
    @Expose
    private Long RsAccessStrategy;

    /**
    * 尚未回收的网络资源
    */
    @SerializedName("ReservedNetResources")
    @Expose
    private ReservedNetResource [] ReservedNetResources;

    /**
    * 是否支持物理复制
    */
    @SerializedName("IsPhysicalReplicationSupported")
    @Expose
    private Boolean IsPhysicalReplicationSupported;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 实例Id 
     * @return InstanceId 实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例Id
     * @param InstanceId 实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例状态 
     * @return Status 实例状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 实例状态
     * @param Status 实例状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 实例目前运行状态描述 
     * @return StatusDesc 实例目前运行状态描述
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set 实例目前运行状态描述
     * @param StatusDesc 实例目前运行状态描述
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get 内网 IP 地址 
     * @return Vip 内网 IP 地址
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 内网 IP 地址
     * @param Vip 内网 IP 地址
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 内网端口 
     * @return Vport 内网端口
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set 内网端口
     * @param Vport 内网端口
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get 是否临时实例，0为否，非0为是 
     * @return IsTmp 是否临时实例，0为否，非0为是
     */
    public Long getIsTmp() {
        return this.IsTmp;
    }

    /**
     * Set 是否临时实例，0为否，非0为是
     * @param IsTmp 是否临时实例，0为否，非0为是
     */
    public void setIsTmp(Long IsTmp) {
        this.IsTmp = IsTmp;
    }

    /**
     * Get 节点数，2为一主一从，3为一主二从 
     * @return NodeCount 节点数，2为一主一从，3为一主二从
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set 节点数，2为一主一从，3为一主二从
     * @param NodeCount 节点数，2为一主一从，3为一主二从
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get 实例所在地域名称，如 ap-shanghai 
     * @return Region 实例所在地域名称，如 ap-shanghai
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 实例所在地域名称，如 ap-shanghai
     * @param Region 实例所在地域名称，如 ap-shanghai
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 实例所在可用区名称，如 ap-shanghai-1 
     * @return Zone 实例所在可用区名称，如 ap-shanghai-1
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 实例所在可用区名称，如 ap-shanghai-1
     * @param Zone 实例所在可用区名称，如 ap-shanghai-1
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 字符串型的私有网络Id 
     * @return VpcId 字符串型的私有网络Id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 字符串型的私有网络Id
     * @param VpcId 字符串型的私有网络Id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 字符串型的私有网络子网Id 
     * @return SubnetId 字符串型的私有网络子网Id
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 字符串型的私有网络子网Id
     * @param SubnetId 字符串型的私有网络子网Id
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 外网状态，0-未开通；1-已开通；2-关闭；3-开通中；4-关闭中 
     * @return WanStatus 外网状态，0-未开通；1-已开通；2-关闭；3-开通中；4-关闭中
     */
    public Long getWanStatus() {
        return this.WanStatus;
    }

    /**
     * Set 外网状态，0-未开通；1-已开通；2-关闭；3-开通中；4-关闭中
     * @param WanStatus 外网状态，0-未开通；1-已开通；2-关闭；3-开通中；4-关闭中
     */
    public void setWanStatus(Long WanStatus) {
        this.WanStatus = WanStatus;
    }

    /**
     * Get 外网访问的域名，公网可解析 
     * @return WanDomain 外网访问的域名，公网可解析
     */
    public String getWanDomain() {
        return this.WanDomain;
    }

    /**
     * Set 外网访问的域名，公网可解析
     * @param WanDomain 外网访问的域名，公网可解析
     */
    public void setWanDomain(String WanDomain) {
        this.WanDomain = WanDomain;
    }

    /**
     * Get 外网 IP 地址，公网可访问 
     * @return WanVip 外网 IP 地址，公网可访问
     */
    public String getWanVip() {
        return this.WanVip;
    }

    /**
     * Set 外网 IP 地址，公网可访问
     * @param WanVip 外网 IP 地址，公网可访问
     */
    public void setWanVip(String WanVip) {
        this.WanVip = WanVip;
    }

    /**
     * Get 外网端口 
     * @return WanPort 外网端口
     */
    public Long getWanPort() {
        return this.WanPort;
    }

    /**
     * Set 外网端口
     * @param WanPort 外网端口
     */
    public void setWanPort(Long WanPort) {
        this.WanPort = WanPort;
    }

    /**
     * Get 实例所属项目 Id 
     * @return ProjectId 实例所属项目 Id
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 实例所属项目 Id
     * @param ProjectId 实例所属项目 Id
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get TDSQL 版本信息 
     * @return TdsqlVersion TDSQL 版本信息
     */
    public String getTdsqlVersion() {
        return this.TdsqlVersion;
    }

    /**
     * Set TDSQL 版本信息
     * @param TdsqlVersion TDSQL 版本信息
     */
    public void setTdsqlVersion(String TdsqlVersion) {
        this.TdsqlVersion = TdsqlVersion;
    }

    /**
     * Get 实例内存大小，单位 GB 
     * @return Memory 实例内存大小，单位 GB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 实例内存大小，单位 GB
     * @param Memory 实例内存大小，单位 GB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 实例存储大小，单位 GB 
     * @return Storage 实例存储大小，单位 GB
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set 实例存储大小，单位 GB
     * @param Storage 实例存储大小，单位 GB
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get 主可用区，如 ap-shanghai-1 
     * @return MasterZone 主可用区，如 ap-shanghai-1
     */
    public String getMasterZone() {
        return this.MasterZone;
    }

    /**
     * Set 主可用区，如 ap-shanghai-1
     * @param MasterZone 主可用区，如 ap-shanghai-1
     */
    public void setMasterZone(String MasterZone) {
        this.MasterZone = MasterZone;
    }

    /**
     * Get 从可用区列表，如 [ap-shanghai-2] 
     * @return SlaveZones 从可用区列表，如 [ap-shanghai-2]
     */
    public String [] getSlaveZones() {
        return this.SlaveZones;
    }

    /**
     * Set 从可用区列表，如 [ap-shanghai-2]
     * @param SlaveZones 从可用区列表，如 [ap-shanghai-2]
     */
    public void setSlaveZones(String [] SlaveZones) {
        this.SlaveZones = SlaveZones;
    }

    /**
     * Get 自动续费标志：0 否，1 是 
     * @return AutoRenewFlag 自动续费标志：0 否，1 是
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 自动续费标志：0 否，1 是
     * @param AutoRenewFlag 自动续费标志：0 否，1 是
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 独享集群Id，普通实例为空 
     * @return ExclusterId 独享集群Id，普通实例为空
     */
    public String getExclusterId() {
        return this.ExclusterId;
    }

    /**
     * Set 独享集群Id，普通实例为空
     * @param ExclusterId 独享集群Id，普通实例为空
     */
    public void setExclusterId(String ExclusterId) {
        this.ExclusterId = ExclusterId;
    }

    /**
     * Get 付费模式：prepaid 表示预付费 
     * @return PayMode 付费模式：prepaid 表示预付费
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费模式：prepaid 表示预付费
     * @param PayMode 付费模式：prepaid 表示预付费
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 实例创建时间，格式为 2006-01-02 15:04:05 
     * @return CreateTime 实例创建时间，格式为 2006-01-02 15:04:05
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 实例创建时间，格式为 2006-01-02 15:04:05
     * @param CreateTime 实例创建时间，格式为 2006-01-02 15:04:05
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 实例是否支持审计 
     * @return IsAuditSupported 实例是否支持审计
     */
    public Boolean getIsAuditSupported() {
        return this.IsAuditSupported;
    }

    /**
     * Set 实例是否支持审计
     * @param IsAuditSupported 实例是否支持审计
     */
    public void setIsAuditSupported(Boolean IsAuditSupported) {
        this.IsAuditSupported = IsAuditSupported;
    }

    /**
     * Get 实例到期时间，格式为 2006-01-02 15:04:05 
     * @return PeriodEndTime 实例到期时间，格式为 2006-01-02 15:04:05
     */
    public String getPeriodEndTime() {
        return this.PeriodEndTime;
    }

    /**
     * Set 实例到期时间，格式为 2006-01-02 15:04:05
     * @param PeriodEndTime 实例到期时间，格式为 2006-01-02 15:04:05
     */
    public void setPeriodEndTime(String PeriodEndTime) {
        this.PeriodEndTime = PeriodEndTime;
    }

    /**
     * Get 机型信息 
     * @return Machine 机型信息
     */
    public String getMachine() {
        return this.Machine;
    }

    /**
     * Set 机型信息
     * @param Machine 机型信息
     */
    public void setMachine(String Machine) {
        this.Machine = Machine;
    }

    /**
     * Get 存储空间使用率 
     * @return StorageUsage 存储空间使用率
     */
    public String getStorageUsage() {
        return this.StorageUsage;
    }

    /**
     * Set 存储空间使用率
     * @param StorageUsage 存储空间使用率
     */
    public void setStorageUsage(String StorageUsage) {
        this.StorageUsage = StorageUsage;
    }

    /**
     * Get 日志存储空间大小，单位 GB 
     * @return LogStorage 日志存储空间大小，单位 GB
     */
    public Long getLogStorage() {
        return this.LogStorage;
    }

    /**
     * Set 日志存储空间大小，单位 GB
     * @param LogStorage 日志存储空间大小，单位 GB
     */
    public void setLogStorage(Long LogStorage) {
        this.LogStorage = LogStorage;
    }

    /**
     * Get 是否支持数据加密。1-支持；0-不支持 
     * @return IsEncryptSupported 是否支持数据加密。1-支持；0-不支持
     */
    public Long getIsEncryptSupported() {
        return this.IsEncryptSupported;
    }

    /**
     * Set 是否支持数据加密。1-支持；0-不支持
     * @param IsEncryptSupported 是否支持数据加密。1-支持；0-不支持
     */
    public void setIsEncryptSupported(Long IsEncryptSupported) {
        this.IsEncryptSupported = IsEncryptSupported;
    }

    /**
     * Get 内网IPv6
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vip6 内网IPv6
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVip6() {
        return this.Vip6;
    }

    /**
     * Set 内网IPv6
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vip6 内网IPv6
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVip6(String Vip6) {
        this.Vip6 = Vip6;
    }

    /**
     * Get 实例Cpu核数 
     * @return Cpu 实例Cpu核数
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set 实例Cpu核数
     * @param Cpu 实例Cpu核数
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 产品类型ID 
     * @return Pid 产品类型ID
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set 产品类型ID
     * @param Pid 产品类型ID
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get 最大QPS 
     * @return Qps 最大QPS
     */
    public Long getQps() {
        return this.Qps;
    }

    /**
     * Set 最大QPS
     * @param Qps 最大QPS
     */
    public void setQps(Long Qps) {
        this.Qps = Qps;
    }

    /**
     * Get 是否支持IPv6
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ipv6Flag 是否支持IPv6
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIpv6Flag() {
        return this.Ipv6Flag;
    }

    /**
     * Set 是否支持IPv6
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ipv6Flag 是否支持IPv6
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpv6Flag(Long Ipv6Flag) {
        this.Ipv6Flag = Ipv6Flag;
    }

    /**
     * Get 外网IPv6地址，公网可访问
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WanVipv6 外网IPv6地址，公网可访问
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWanVipv6() {
        return this.WanVipv6;
    }

    /**
     * Set 外网IPv6地址，公网可访问
注意：此字段可能返回 null，表示取不到有效值。
     * @param WanVipv6 外网IPv6地址，公网可访问
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWanVipv6(String WanVipv6) {
        this.WanVipv6 = WanVipv6;
    }

    /**
     * Get 外网状态，0-未开通；1-已开通；2-关闭；3-开通中；4-关闭中
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WanStatusIpv6 外网状态，0-未开通；1-已开通；2-关闭；3-开通中；4-关闭中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWanStatusIpv6() {
        return this.WanStatusIpv6;
    }

    /**
     * Set 外网状态，0-未开通；1-已开通；2-关闭；3-开通中；4-关闭中
注意：此字段可能返回 null，表示取不到有效值。
     * @param WanStatusIpv6 外网状态，0-未开通；1-已开通；2-关闭；3-开通中；4-关闭中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWanStatusIpv6(Long WanStatusIpv6) {
        this.WanStatusIpv6 = WanStatusIpv6;
    }

    /**
     * Get 外网IPv6端口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WanPortIpv6 外网IPv6端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWanPortIpv6() {
        return this.WanPortIpv6;
    }

    /**
     * Set 外网IPv6端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param WanPortIpv6 外网IPv6端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWanPortIpv6(Long WanPortIpv6) {
        this.WanPortIpv6 = WanPortIpv6;
    }

    /**
     * Get 数据库引擎
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DbEngine 数据库引擎
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDbEngine() {
        return this.DbEngine;
    }

    /**
     * Set 数据库引擎
注意：此字段可能返回 null，表示取不到有效值。
     * @param DbEngine 数据库引擎
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDbEngine(String DbEngine) {
        this.DbEngine = DbEngine;
    }

    /**
     * Get 数据库版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DbVersion 数据库版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDbVersion() {
        return this.DbVersion;
    }

    /**
     * Set 数据库版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param DbVersion 数据库版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDbVersion(String DbVersion) {
        this.DbVersion = DbVersion;
    }

    /**
     * Get 标签信息 
     * @return ResourceTags 标签信息
     */
    public ResourceTag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set 标签信息
     * @param ResourceTags 标签信息
     */
    public void setResourceTags(ResourceTag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get DCN标志，0-无，1-主实例，2-灾备实例
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DcnFlag DCN标志，0-无，1-主实例，2-灾备实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDcnFlag() {
        return this.DcnFlag;
    }

    /**
     * Set DCN标志，0-无，1-主实例，2-灾备实例
注意：此字段可能返回 null，表示取不到有效值。
     * @param DcnFlag DCN标志，0-无，1-主实例，2-灾备实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDcnFlag(Long DcnFlag) {
        this.DcnFlag = DcnFlag;
    }

    /**
     * Get DCN状态，0-无，1-创建中，2-同步中，3-已断开
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DcnStatus DCN状态，0-无，1-创建中，2-同步中，3-已断开
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDcnStatus() {
        return this.DcnStatus;
    }

    /**
     * Set DCN状态，0-无，1-创建中，2-同步中，3-已断开
注意：此字段可能返回 null，表示取不到有效值。
     * @param DcnStatus DCN状态，0-无，1-创建中，2-同步中，3-已断开
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDcnStatus(Long DcnStatus) {
        this.DcnStatus = DcnStatus;
    }

    /**
     * Get DCN灾备实例数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DcnDstNum DCN灾备实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDcnDstNum() {
        return this.DcnDstNum;
    }

    /**
     * Set DCN灾备实例数
注意：此字段可能返回 null，表示取不到有效值。
     * @param DcnDstNum DCN灾备实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDcnDstNum(Long DcnDstNum) {
        this.DcnDstNum = DcnDstNum;
    }

    /**
     * Get 1： 主实例（独享型）, 2: 主实例, 3： 灾备实例, 4： 灾备实例（独享型）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceType 1： 主实例（独享型）, 2: 主实例, 3： 灾备实例, 4： 灾备实例（独享型）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 1： 主实例（独享型）, 2: 主实例, 3： 灾备实例, 4： 灾备实例（独享型）
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceType 1： 主实例（独享型）, 2: 主实例, 3： 灾备实例, 4： 灾备实例（独享型）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 实例的各个DB节点信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodesInfo 实例的各个DB节点信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NodeInfo [] getNodesInfo() {
        return this.NodesInfo;
    }

    /**
     * Set 实例的各个DB节点信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodesInfo 实例的各个DB节点信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodesInfo(NodeInfo [] NodesInfo) {
        this.NodesInfo = NodesInfo;
    }

    /**
     * Get 实例是否支持设置用户连接数限制，内核为10.1暂不支持。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsMaxUserConnectionsSupported 实例是否支持设置用户连接数限制，内核为10.1暂不支持。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsMaxUserConnectionsSupported() {
        return this.IsMaxUserConnectionsSupported;
    }

    /**
     * Set 实例是否支持设置用户连接数限制，内核为10.1暂不支持。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsMaxUserConnectionsSupported 实例是否支持设置用户连接数限制，内核为10.1暂不支持。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsMaxUserConnectionsSupported(Boolean IsMaxUserConnectionsSupported) {
        this.IsMaxUserConnectionsSupported = IsMaxUserConnectionsSupported;
    }

    /**
     * Get 对外显示的数据库版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DbVersionId 对外显示的数据库版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDbVersionId() {
        return this.DbVersionId;
    }

    /**
     * Set 对外显示的数据库版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param DbVersionId 对外显示的数据库版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDbVersionId(String DbVersionId) {
        this.DbVersionId = DbVersionId;
    }

    /**
     * Get 加密状态, 0-未开启，1-已开启
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EncryptStatus 加密状态, 0-未开启，1-已开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEncryptStatus() {
        return this.EncryptStatus;
    }

    /**
     * Set 加密状态, 0-未开启，1-已开启
注意：此字段可能返回 null，表示取不到有效值。
     * @param EncryptStatus 加密状态, 0-未开启，1-已开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEncryptStatus(Long EncryptStatus) {
        this.EncryptStatus = EncryptStatus;
    }

    /**
     * Get DCN的配置信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReplicaConfig DCN的配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DCNReplicaConfig getReplicaConfig() {
        return this.ReplicaConfig;
    }

    /**
     * Set DCN的配置信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReplicaConfig DCN的配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReplicaConfig(DCNReplicaConfig ReplicaConfig) {
        this.ReplicaConfig = ReplicaConfig;
    }

    /**
     * Get DCN的运行状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReplicaStatus DCN的运行状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DCNReplicaStatus getReplicaStatus() {
        return this.ReplicaStatus;
    }

    /**
     * Set DCN的运行状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReplicaStatus DCN的运行状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReplicaStatus(DCNReplicaStatus ReplicaStatus) {
        this.ReplicaStatus = ReplicaStatus;
    }

    /**
     * Get 独享集群类型，0:公有云, 1:金融围笼, 2:CDC集群
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExclusterType 独享集群类型，0:公有云, 1:金融围笼, 2:CDC集群
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExclusterType() {
        return this.ExclusterType;
    }

    /**
     * Set 独享集群类型，0:公有云, 1:金融围笼, 2:CDC集群
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExclusterType 独享集群类型，0:公有云, 1:金融围笼, 2:CDC集群
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExclusterType(Long ExclusterType) {
        this.ExclusterType = ExclusterType;
    }

    /**
     * Get VPC就近访问
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RsAccessStrategy VPC就近访问
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRsAccessStrategy() {
        return this.RsAccessStrategy;
    }

    /**
     * Set VPC就近访问
注意：此字段可能返回 null，表示取不到有效值。
     * @param RsAccessStrategy VPC就近访问
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRsAccessStrategy(Long RsAccessStrategy) {
        this.RsAccessStrategy = RsAccessStrategy;
    }

    /**
     * Get 尚未回收的网络资源 
     * @return ReservedNetResources 尚未回收的网络资源
     */
    public ReservedNetResource [] getReservedNetResources() {
        return this.ReservedNetResources;
    }

    /**
     * Set 尚未回收的网络资源
     * @param ReservedNetResources 尚未回收的网络资源
     */
    public void setReservedNetResources(ReservedNetResource [] ReservedNetResources) {
        this.ReservedNetResources = ReservedNetResources;
    }

    /**
     * Get 是否支持物理复制 
     * @return IsPhysicalReplicationSupported 是否支持物理复制
     */
    public Boolean getIsPhysicalReplicationSupported() {
        return this.IsPhysicalReplicationSupported;
    }

    /**
     * Set 是否支持物理复制
     * @param IsPhysicalReplicationSupported 是否支持物理复制
     */
    public void setIsPhysicalReplicationSupported(Boolean IsPhysicalReplicationSupported) {
        this.IsPhysicalReplicationSupported = IsPhysicalReplicationSupported;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDBInstanceDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBInstanceDetailResponse(DescribeDBInstanceDetailResponse source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.IsTmp != null) {
            this.IsTmp = new Long(source.IsTmp);
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.WanStatus != null) {
            this.WanStatus = new Long(source.WanStatus);
        }
        if (source.WanDomain != null) {
            this.WanDomain = new String(source.WanDomain);
        }
        if (source.WanVip != null) {
            this.WanVip = new String(source.WanVip);
        }
        if (source.WanPort != null) {
            this.WanPort = new Long(source.WanPort);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.TdsqlVersion != null) {
            this.TdsqlVersion = new String(source.TdsqlVersion);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.MasterZone != null) {
            this.MasterZone = new String(source.MasterZone);
        }
        if (source.SlaveZones != null) {
            this.SlaveZones = new String[source.SlaveZones.length];
            for (int i = 0; i < source.SlaveZones.length; i++) {
                this.SlaveZones[i] = new String(source.SlaveZones[i]);
            }
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.ExclusterId != null) {
            this.ExclusterId = new String(source.ExclusterId);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.IsAuditSupported != null) {
            this.IsAuditSupported = new Boolean(source.IsAuditSupported);
        }
        if (source.PeriodEndTime != null) {
            this.PeriodEndTime = new String(source.PeriodEndTime);
        }
        if (source.Machine != null) {
            this.Machine = new String(source.Machine);
        }
        if (source.StorageUsage != null) {
            this.StorageUsage = new String(source.StorageUsage);
        }
        if (source.LogStorage != null) {
            this.LogStorage = new Long(source.LogStorage);
        }
        if (source.IsEncryptSupported != null) {
            this.IsEncryptSupported = new Long(source.IsEncryptSupported);
        }
        if (source.Vip6 != null) {
            this.Vip6 = new String(source.Vip6);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Pid != null) {
            this.Pid = new Long(source.Pid);
        }
        if (source.Qps != null) {
            this.Qps = new Long(source.Qps);
        }
        if (source.Ipv6Flag != null) {
            this.Ipv6Flag = new Long(source.Ipv6Flag);
        }
        if (source.WanVipv6 != null) {
            this.WanVipv6 = new String(source.WanVipv6);
        }
        if (source.WanStatusIpv6 != null) {
            this.WanStatusIpv6 = new Long(source.WanStatusIpv6);
        }
        if (source.WanPortIpv6 != null) {
            this.WanPortIpv6 = new Long(source.WanPortIpv6);
        }
        if (source.DbEngine != null) {
            this.DbEngine = new String(source.DbEngine);
        }
        if (source.DbVersion != null) {
            this.DbVersion = new String(source.DbVersion);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new ResourceTag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new ResourceTag(source.ResourceTags[i]);
            }
        }
        if (source.DcnFlag != null) {
            this.DcnFlag = new Long(source.DcnFlag);
        }
        if (source.DcnStatus != null) {
            this.DcnStatus = new Long(source.DcnStatus);
        }
        if (source.DcnDstNum != null) {
            this.DcnDstNum = new Long(source.DcnDstNum);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new Long(source.InstanceType);
        }
        if (source.NodesInfo != null) {
            this.NodesInfo = new NodeInfo[source.NodesInfo.length];
            for (int i = 0; i < source.NodesInfo.length; i++) {
                this.NodesInfo[i] = new NodeInfo(source.NodesInfo[i]);
            }
        }
        if (source.IsMaxUserConnectionsSupported != null) {
            this.IsMaxUserConnectionsSupported = new Boolean(source.IsMaxUserConnectionsSupported);
        }
        if (source.DbVersionId != null) {
            this.DbVersionId = new String(source.DbVersionId);
        }
        if (source.EncryptStatus != null) {
            this.EncryptStatus = new Long(source.EncryptStatus);
        }
        if (source.ReplicaConfig != null) {
            this.ReplicaConfig = new DCNReplicaConfig(source.ReplicaConfig);
        }
        if (source.ReplicaStatus != null) {
            this.ReplicaStatus = new DCNReplicaStatus(source.ReplicaStatus);
        }
        if (source.ExclusterType != null) {
            this.ExclusterType = new Long(source.ExclusterType);
        }
        if (source.RsAccessStrategy != null) {
            this.RsAccessStrategy = new Long(source.RsAccessStrategy);
        }
        if (source.ReservedNetResources != null) {
            this.ReservedNetResources = new ReservedNetResource[source.ReservedNetResources.length];
            for (int i = 0; i < source.ReservedNetResources.length; i++) {
                this.ReservedNetResources[i] = new ReservedNetResource(source.ReservedNetResources[i]);
            }
        }
        if (source.IsPhysicalReplicationSupported != null) {
            this.IsPhysicalReplicationSupported = new Boolean(source.IsPhysicalReplicationSupported);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "IsTmp", this.IsTmp);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "WanStatus", this.WanStatus);
        this.setParamSimple(map, prefix + "WanDomain", this.WanDomain);
        this.setParamSimple(map, prefix + "WanVip", this.WanVip);
        this.setParamSimple(map, prefix + "WanPort", this.WanPort);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TdsqlVersion", this.TdsqlVersion);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "MasterZone", this.MasterZone);
        this.setParamArraySimple(map, prefix + "SlaveZones.", this.SlaveZones);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "ExclusterId", this.ExclusterId);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "IsAuditSupported", this.IsAuditSupported);
        this.setParamSimple(map, prefix + "PeriodEndTime", this.PeriodEndTime);
        this.setParamSimple(map, prefix + "Machine", this.Machine);
        this.setParamSimple(map, prefix + "StorageUsage", this.StorageUsage);
        this.setParamSimple(map, prefix + "LogStorage", this.LogStorage);
        this.setParamSimple(map, prefix + "IsEncryptSupported", this.IsEncryptSupported);
        this.setParamSimple(map, prefix + "Vip6", this.Vip6);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "Qps", this.Qps);
        this.setParamSimple(map, prefix + "Ipv6Flag", this.Ipv6Flag);
        this.setParamSimple(map, prefix + "WanVipv6", this.WanVipv6);
        this.setParamSimple(map, prefix + "WanStatusIpv6", this.WanStatusIpv6);
        this.setParamSimple(map, prefix + "WanPortIpv6", this.WanPortIpv6);
        this.setParamSimple(map, prefix + "DbEngine", this.DbEngine);
        this.setParamSimple(map, prefix + "DbVersion", this.DbVersion);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "DcnFlag", this.DcnFlag);
        this.setParamSimple(map, prefix + "DcnStatus", this.DcnStatus);
        this.setParamSimple(map, prefix + "DcnDstNum", this.DcnDstNum);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamArrayObj(map, prefix + "NodesInfo.", this.NodesInfo);
        this.setParamSimple(map, prefix + "IsMaxUserConnectionsSupported", this.IsMaxUserConnectionsSupported);
        this.setParamSimple(map, prefix + "DbVersionId", this.DbVersionId);
        this.setParamSimple(map, prefix + "EncryptStatus", this.EncryptStatus);
        this.setParamObj(map, prefix + "ReplicaConfig.", this.ReplicaConfig);
        this.setParamObj(map, prefix + "ReplicaStatus.", this.ReplicaStatus);
        this.setParamSimple(map, prefix + "ExclusterType", this.ExclusterType);
        this.setParamSimple(map, prefix + "RsAccessStrategy", this.RsAccessStrategy);
        this.setParamArrayObj(map, prefix + "ReservedNetResources.", this.ReservedNetResources);
        this.setParamSimple(map, prefix + "IsPhysicalReplicationSupported", this.IsPhysicalReplicationSupported);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

