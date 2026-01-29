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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBInstanceDetailResponse extends AbstractModel {

    /**
    * <p>实例Id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例名称</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>实例状态</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>实例目前运行状态描述</p>
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * <p>内网 IP 地址</p>
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * <p>内网端口</p>
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * <p>是否临时实例，0为否，非0为是</p>
    */
    @SerializedName("IsTmp")
    @Expose
    private Long IsTmp;

    /**
    * <p>节点数，2为一主一从，3为一主二从</p>
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * <p>实例所在地域名称，如 ap-shanghai</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>实例所在可用区名称，如 ap-shanghai-2</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>字符串型的私有网络Id</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>字符串型的私有网络子网Id</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>外网状态，0-未开通；1-已开通；2-关闭；3-开通中；4-关闭中</p>
    */
    @SerializedName("WanStatus")
    @Expose
    private Long WanStatus;

    /**
    * <p>外网访问的域名，公网可解析</p>
    */
    @SerializedName("WanDomain")
    @Expose
    private String WanDomain;

    /**
    * <p>外网 IP 地址，公网可访问</p>
    */
    @SerializedName("WanVip")
    @Expose
    private String WanVip;

    /**
    * <p>外网端口</p>
    */
    @SerializedName("WanPort")
    @Expose
    private Long WanPort;

    /**
    * <p>实例所属项目 Id</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>TDSQL 版本信息</p>
    */
    @SerializedName("TdsqlVersion")
    @Expose
    private String TdsqlVersion;

    /**
    * <p>实例内存大小，单位 GB</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>实例存储大小，单位 GB</p>
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * <p>主可用区，如 ap-shanghai-2</p>
    */
    @SerializedName("MasterZone")
    @Expose
    private String MasterZone;

    /**
    * <p>从可用区列表，如 [ap-shanghai-2]</p>
    */
    @SerializedName("SlaveZones")
    @Expose
    private String [] SlaveZones;

    /**
    * <p>自动续费标志：0 否，1 是</p>
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * <p>独享集群Id，普通实例为空</p>
    */
    @SerializedName("ExclusterId")
    @Expose
    private String ExclusterId;

    /**
    * <p>付费模式：prepaid 表示预付费</p>
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * <p>实例创建时间，格式为 2006-01-02 15:04:05</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>实例是否支持审计</p>
    */
    @SerializedName("IsAuditSupported")
    @Expose
    private Boolean IsAuditSupported;

    /**
    * <p>实例到期时间，格式为 2006-01-02 15:04:05</p>
    */
    @SerializedName("PeriodEndTime")
    @Expose
    private String PeriodEndTime;

    /**
    * <p>机型信息</p>
    */
    @SerializedName("Machine")
    @Expose
    private String Machine;

    /**
    * <p>存储空间使用率</p>
    */
    @SerializedName("StorageUsage")
    @Expose
    private String StorageUsage;

    /**
    * <p>日志存储空间大小，单位 GB</p>
    */
    @SerializedName("LogStorage")
    @Expose
    private Long LogStorage;

    /**
    * <p>是否支持数据加密。1-支持；0-不支持</p>
    */
    @SerializedName("IsEncryptSupported")
    @Expose
    private Long IsEncryptSupported;

    /**
    * <p>内网IPv6</p>
    */
    @SerializedName("Vip6")
    @Expose
    private String Vip6;

    /**
    * <p>实例Cpu核数</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>产品类型ID</p>
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * <p>最大QPS</p>
    */
    @SerializedName("Qps")
    @Expose
    private Long Qps;

    /**
    * <p>是否支持IPv6</p>
    */
    @SerializedName("Ipv6Flag")
    @Expose
    private Long Ipv6Flag;

    /**
    * <p>外网IPv6地址，公网可访问</p>
    */
    @SerializedName("WanVipv6")
    @Expose
    private String WanVipv6;

    /**
    * <p>外网状态，0-未开通；1-已开通；2-关闭；3-开通中；4-关闭中</p>
    */
    @SerializedName("WanStatusIpv6")
    @Expose
    private Long WanStatusIpv6;

    /**
    * <p>外网IPv6端口</p>
    */
    @SerializedName("WanPortIpv6")
    @Expose
    private Long WanPortIpv6;

    /**
    * <p>数据库引擎</p>
    */
    @SerializedName("DbEngine")
    @Expose
    private String DbEngine;

    /**
    * <p>数据库版本</p>
    */
    @SerializedName("DbVersion")
    @Expose
    private String DbVersion;

    /**
    * <p>标签信息</p>
    */
    @SerializedName("ResourceTags")
    @Expose
    private ResourceTag [] ResourceTags;

    /**
    * <p>DCN标志，0-无，1-主实例，2-灾备实例</p>
    */
    @SerializedName("DcnFlag")
    @Expose
    private Long DcnFlag;

    /**
    * <p>DCN状态，0-无，1-创建中，2-同步中，3-已断开</p>
    */
    @SerializedName("DcnStatus")
    @Expose
    private Long DcnStatus;

    /**
    * <p>DCN灾备实例数</p>
    */
    @SerializedName("DcnDstNum")
    @Expose
    private Long DcnDstNum;

    /**
    * <p>1： 主实例（独享型）, 2: 主实例, 3： 灾备实例, 4： 灾备实例（独享型）</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * <p>实例的各个DB节点信息</p>
    */
    @SerializedName("NodesInfo")
    @Expose
    private NodeInfo [] NodesInfo;

    /**
    * <p>实例是否支持设置用户连接数限制，内核为10.1暂不支持。</p>
    */
    @SerializedName("IsMaxUserConnectionsSupported")
    @Expose
    private Boolean IsMaxUserConnectionsSupported;

    /**
    * <p>对外显示的数据库版本</p>
    */
    @SerializedName("DbVersionId")
    @Expose
    private String DbVersionId;

    /**
    * <p>加密状态, 0-未开启，1-已开启</p>
    */
    @SerializedName("EncryptStatus")
    @Expose
    private Long EncryptStatus;

    /**
    * <p>DCN的配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReplicaConfig")
    @Expose
    private DCNReplicaConfig ReplicaConfig;

    /**
    * <p>DCN的运行状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReplicaStatus")
    @Expose
    private DCNReplicaStatus ReplicaStatus;

    /**
    * <p>独享集群类型，0:公有云, 1:金融围笼, 2:CDC集群</p>
    */
    @SerializedName("ExclusterType")
    @Expose
    private Long ExclusterType;

    /**
    * <p>VPC就近访问</p>
    */
    @SerializedName("RsAccessStrategy")
    @Expose
    private Long RsAccessStrategy;

    /**
    * <p>尚未回收的网络资源</p>
    */
    @SerializedName("ReservedNetResources")
    @Expose
    private ReservedNetResource [] ReservedNetResources;

    /**
    * <p>是否支持物理复制</p>
    */
    @SerializedName("IsPhysicalReplicationSupported")
    @Expose
    private Boolean IsPhysicalReplicationSupported;

    /**
    * <p>是否支持强同步DCN</p>
    */
    @SerializedName("IsDcnStrongSyncSupported")
    @Expose
    private Long IsDcnStrongSyncSupported;

    /**
    * <p>是否支持DCN切换</p>
    */
    @SerializedName("IsDcnSwitchSupported")
    @Expose
    private Long IsDcnSwitchSupported;

    /**
    * <p>proxy版本号</p>
    */
    @SerializedName("ProxyVersion")
    @Expose
    private String ProxyVersion;

    /**
    * <p>Cpu类型，如：英特尔：Intel/AMD，海光：Hygon</p>
    */
    @SerializedName("CpuType")
    @Expose
    private String CpuType;

    /**
    * <p>删除保护标记，1: 已开启删除保护，0: 未开启删除保护</p>
    */
    @SerializedName("ProtectedProperty")
    @Expose
    private Long ProtectedProperty;

    /**
    * <p>流程Id，标志实例当前所处的异步任务</p>
    */
    @SerializedName("FlowId")
    @Expose
    private Long FlowId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>实例Id</p> 
     * @return InstanceId <p>实例Id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例Id</p>
     * @param InstanceId <p>实例Id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>实例名称</p> 
     * @return InstanceName <p>实例名称</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称</p>
     * @param InstanceName <p>实例名称</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>实例状态</p> 
     * @return Status <p>实例状态</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>实例状态</p>
     * @param Status <p>实例状态</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>实例目前运行状态描述</p> 
     * @return StatusDesc <p>实例目前运行状态描述</p>
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set <p>实例目前运行状态描述</p>
     * @param StatusDesc <p>实例目前运行状态描述</p>
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get <p>内网 IP 地址</p> 
     * @return Vip <p>内网 IP 地址</p>
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set <p>内网 IP 地址</p>
     * @param Vip <p>内网 IP 地址</p>
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get <p>内网端口</p> 
     * @return Vport <p>内网端口</p>
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set <p>内网端口</p>
     * @param Vport <p>内网端口</p>
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get <p>是否临时实例，0为否，非0为是</p> 
     * @return IsTmp <p>是否临时实例，0为否，非0为是</p>
     */
    public Long getIsTmp() {
        return this.IsTmp;
    }

    /**
     * Set <p>是否临时实例，0为否，非0为是</p>
     * @param IsTmp <p>是否临时实例，0为否，非0为是</p>
     */
    public void setIsTmp(Long IsTmp) {
        this.IsTmp = IsTmp;
    }

    /**
     * Get <p>节点数，2为一主一从，3为一主二从</p> 
     * @return NodeCount <p>节点数，2为一主一从，3为一主二从</p>
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set <p>节点数，2为一主一从，3为一主二从</p>
     * @param NodeCount <p>节点数，2为一主一从，3为一主二从</p>
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get <p>实例所在地域名称，如 ap-shanghai</p> 
     * @return Region <p>实例所在地域名称，如 ap-shanghai</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>实例所在地域名称，如 ap-shanghai</p>
     * @param Region <p>实例所在地域名称，如 ap-shanghai</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>实例所在可用区名称，如 ap-shanghai-2</p> 
     * @return Zone <p>实例所在可用区名称，如 ap-shanghai-2</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>实例所在可用区名称，如 ap-shanghai-2</p>
     * @param Zone <p>实例所在可用区名称，如 ap-shanghai-2</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>字符串型的私有网络Id</p> 
     * @return VpcId <p>字符串型的私有网络Id</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>字符串型的私有网络Id</p>
     * @param VpcId <p>字符串型的私有网络Id</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>字符串型的私有网络子网Id</p> 
     * @return SubnetId <p>字符串型的私有网络子网Id</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>字符串型的私有网络子网Id</p>
     * @param SubnetId <p>字符串型的私有网络子网Id</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>外网状态，0-未开通；1-已开通；2-关闭；3-开通中；4-关闭中</p> 
     * @return WanStatus <p>外网状态，0-未开通；1-已开通；2-关闭；3-开通中；4-关闭中</p>
     */
    public Long getWanStatus() {
        return this.WanStatus;
    }

    /**
     * Set <p>外网状态，0-未开通；1-已开通；2-关闭；3-开通中；4-关闭中</p>
     * @param WanStatus <p>外网状态，0-未开通；1-已开通；2-关闭；3-开通中；4-关闭中</p>
     */
    public void setWanStatus(Long WanStatus) {
        this.WanStatus = WanStatus;
    }

    /**
     * Get <p>外网访问的域名，公网可解析</p> 
     * @return WanDomain <p>外网访问的域名，公网可解析</p>
     */
    public String getWanDomain() {
        return this.WanDomain;
    }

    /**
     * Set <p>外网访问的域名，公网可解析</p>
     * @param WanDomain <p>外网访问的域名，公网可解析</p>
     */
    public void setWanDomain(String WanDomain) {
        this.WanDomain = WanDomain;
    }

    /**
     * Get <p>外网 IP 地址，公网可访问</p> 
     * @return WanVip <p>外网 IP 地址，公网可访问</p>
     */
    public String getWanVip() {
        return this.WanVip;
    }

    /**
     * Set <p>外网 IP 地址，公网可访问</p>
     * @param WanVip <p>外网 IP 地址，公网可访问</p>
     */
    public void setWanVip(String WanVip) {
        this.WanVip = WanVip;
    }

    /**
     * Get <p>外网端口</p> 
     * @return WanPort <p>外网端口</p>
     */
    public Long getWanPort() {
        return this.WanPort;
    }

    /**
     * Set <p>外网端口</p>
     * @param WanPort <p>外网端口</p>
     */
    public void setWanPort(Long WanPort) {
        this.WanPort = WanPort;
    }

    /**
     * Get <p>实例所属项目 Id</p> 
     * @return ProjectId <p>实例所属项目 Id</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>实例所属项目 Id</p>
     * @param ProjectId <p>实例所属项目 Id</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>TDSQL 版本信息</p> 
     * @return TdsqlVersion <p>TDSQL 版本信息</p>
     */
    public String getTdsqlVersion() {
        return this.TdsqlVersion;
    }

    /**
     * Set <p>TDSQL 版本信息</p>
     * @param TdsqlVersion <p>TDSQL 版本信息</p>
     */
    public void setTdsqlVersion(String TdsqlVersion) {
        this.TdsqlVersion = TdsqlVersion;
    }

    /**
     * Get <p>实例内存大小，单位 GB</p> 
     * @return Memory <p>实例内存大小，单位 GB</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>实例内存大小，单位 GB</p>
     * @param Memory <p>实例内存大小，单位 GB</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>实例存储大小，单位 GB</p> 
     * @return Storage <p>实例存储大小，单位 GB</p>
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set <p>实例存储大小，单位 GB</p>
     * @param Storage <p>实例存储大小，单位 GB</p>
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get <p>主可用区，如 ap-shanghai-2</p> 
     * @return MasterZone <p>主可用区，如 ap-shanghai-2</p>
     */
    public String getMasterZone() {
        return this.MasterZone;
    }

    /**
     * Set <p>主可用区，如 ap-shanghai-2</p>
     * @param MasterZone <p>主可用区，如 ap-shanghai-2</p>
     */
    public void setMasterZone(String MasterZone) {
        this.MasterZone = MasterZone;
    }

    /**
     * Get <p>从可用区列表，如 [ap-shanghai-2]</p> 
     * @return SlaveZones <p>从可用区列表，如 [ap-shanghai-2]</p>
     */
    public String [] getSlaveZones() {
        return this.SlaveZones;
    }

    /**
     * Set <p>从可用区列表，如 [ap-shanghai-2]</p>
     * @param SlaveZones <p>从可用区列表，如 [ap-shanghai-2]</p>
     */
    public void setSlaveZones(String [] SlaveZones) {
        this.SlaveZones = SlaveZones;
    }

    /**
     * Get <p>自动续费标志：0 否，1 是</p> 
     * @return AutoRenewFlag <p>自动续费标志：0 否，1 是</p>
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set <p>自动续费标志：0 否，1 是</p>
     * @param AutoRenewFlag <p>自动续费标志：0 否，1 是</p>
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get <p>独享集群Id，普通实例为空</p> 
     * @return ExclusterId <p>独享集群Id，普通实例为空</p>
     */
    public String getExclusterId() {
        return this.ExclusterId;
    }

    /**
     * Set <p>独享集群Id，普通实例为空</p>
     * @param ExclusterId <p>独享集群Id，普通实例为空</p>
     */
    public void setExclusterId(String ExclusterId) {
        this.ExclusterId = ExclusterId;
    }

    /**
     * Get <p>付费模式：prepaid 表示预付费</p> 
     * @return PayMode <p>付费模式：prepaid 表示预付费</p>
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>付费模式：prepaid 表示预付费</p>
     * @param PayMode <p>付费模式：prepaid 表示预付费</p>
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>实例创建时间，格式为 2006-01-02 15:04:05</p> 
     * @return CreateTime <p>实例创建时间，格式为 2006-01-02 15:04:05</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>实例创建时间，格式为 2006-01-02 15:04:05</p>
     * @param CreateTime <p>实例创建时间，格式为 2006-01-02 15:04:05</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>实例是否支持审计</p> 
     * @return IsAuditSupported <p>实例是否支持审计</p>
     */
    public Boolean getIsAuditSupported() {
        return this.IsAuditSupported;
    }

    /**
     * Set <p>实例是否支持审计</p>
     * @param IsAuditSupported <p>实例是否支持审计</p>
     */
    public void setIsAuditSupported(Boolean IsAuditSupported) {
        this.IsAuditSupported = IsAuditSupported;
    }

    /**
     * Get <p>实例到期时间，格式为 2006-01-02 15:04:05</p> 
     * @return PeriodEndTime <p>实例到期时间，格式为 2006-01-02 15:04:05</p>
     */
    public String getPeriodEndTime() {
        return this.PeriodEndTime;
    }

    /**
     * Set <p>实例到期时间，格式为 2006-01-02 15:04:05</p>
     * @param PeriodEndTime <p>实例到期时间，格式为 2006-01-02 15:04:05</p>
     */
    public void setPeriodEndTime(String PeriodEndTime) {
        this.PeriodEndTime = PeriodEndTime;
    }

    /**
     * Get <p>机型信息</p> 
     * @return Machine <p>机型信息</p>
     */
    public String getMachine() {
        return this.Machine;
    }

    /**
     * Set <p>机型信息</p>
     * @param Machine <p>机型信息</p>
     */
    public void setMachine(String Machine) {
        this.Machine = Machine;
    }

    /**
     * Get <p>存储空间使用率</p> 
     * @return StorageUsage <p>存储空间使用率</p>
     */
    public String getStorageUsage() {
        return this.StorageUsage;
    }

    /**
     * Set <p>存储空间使用率</p>
     * @param StorageUsage <p>存储空间使用率</p>
     */
    public void setStorageUsage(String StorageUsage) {
        this.StorageUsage = StorageUsage;
    }

    /**
     * Get <p>日志存储空间大小，单位 GB</p> 
     * @return LogStorage <p>日志存储空间大小，单位 GB</p>
     */
    public Long getLogStorage() {
        return this.LogStorage;
    }

    /**
     * Set <p>日志存储空间大小，单位 GB</p>
     * @param LogStorage <p>日志存储空间大小，单位 GB</p>
     */
    public void setLogStorage(Long LogStorage) {
        this.LogStorage = LogStorage;
    }

    /**
     * Get <p>是否支持数据加密。1-支持；0-不支持</p> 
     * @return IsEncryptSupported <p>是否支持数据加密。1-支持；0-不支持</p>
     */
    public Long getIsEncryptSupported() {
        return this.IsEncryptSupported;
    }

    /**
     * Set <p>是否支持数据加密。1-支持；0-不支持</p>
     * @param IsEncryptSupported <p>是否支持数据加密。1-支持；0-不支持</p>
     */
    public void setIsEncryptSupported(Long IsEncryptSupported) {
        this.IsEncryptSupported = IsEncryptSupported;
    }

    /**
     * Get <p>内网IPv6</p> 
     * @return Vip6 <p>内网IPv6</p>
     */
    public String getVip6() {
        return this.Vip6;
    }

    /**
     * Set <p>内网IPv6</p>
     * @param Vip6 <p>内网IPv6</p>
     */
    public void setVip6(String Vip6) {
        this.Vip6 = Vip6;
    }

    /**
     * Get <p>实例Cpu核数</p> 
     * @return Cpu <p>实例Cpu核数</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>实例Cpu核数</p>
     * @param Cpu <p>实例Cpu核数</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>产品类型ID</p> 
     * @return Pid <p>产品类型ID</p>
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set <p>产品类型ID</p>
     * @param Pid <p>产品类型ID</p>
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get <p>最大QPS</p> 
     * @return Qps <p>最大QPS</p>
     */
    public Long getQps() {
        return this.Qps;
    }

    /**
     * Set <p>最大QPS</p>
     * @param Qps <p>最大QPS</p>
     */
    public void setQps(Long Qps) {
        this.Qps = Qps;
    }

    /**
     * Get <p>是否支持IPv6</p> 
     * @return Ipv6Flag <p>是否支持IPv6</p>
     */
    public Long getIpv6Flag() {
        return this.Ipv6Flag;
    }

    /**
     * Set <p>是否支持IPv6</p>
     * @param Ipv6Flag <p>是否支持IPv6</p>
     */
    public void setIpv6Flag(Long Ipv6Flag) {
        this.Ipv6Flag = Ipv6Flag;
    }

    /**
     * Get <p>外网IPv6地址，公网可访问</p> 
     * @return WanVipv6 <p>外网IPv6地址，公网可访问</p>
     */
    public String getWanVipv6() {
        return this.WanVipv6;
    }

    /**
     * Set <p>外网IPv6地址，公网可访问</p>
     * @param WanVipv6 <p>外网IPv6地址，公网可访问</p>
     */
    public void setWanVipv6(String WanVipv6) {
        this.WanVipv6 = WanVipv6;
    }

    /**
     * Get <p>外网状态，0-未开通；1-已开通；2-关闭；3-开通中；4-关闭中</p> 
     * @return WanStatusIpv6 <p>外网状态，0-未开通；1-已开通；2-关闭；3-开通中；4-关闭中</p>
     */
    public Long getWanStatusIpv6() {
        return this.WanStatusIpv6;
    }

    /**
     * Set <p>外网状态，0-未开通；1-已开通；2-关闭；3-开通中；4-关闭中</p>
     * @param WanStatusIpv6 <p>外网状态，0-未开通；1-已开通；2-关闭；3-开通中；4-关闭中</p>
     */
    public void setWanStatusIpv6(Long WanStatusIpv6) {
        this.WanStatusIpv6 = WanStatusIpv6;
    }

    /**
     * Get <p>外网IPv6端口</p> 
     * @return WanPortIpv6 <p>外网IPv6端口</p>
     */
    public Long getWanPortIpv6() {
        return this.WanPortIpv6;
    }

    /**
     * Set <p>外网IPv6端口</p>
     * @param WanPortIpv6 <p>外网IPv6端口</p>
     */
    public void setWanPortIpv6(Long WanPortIpv6) {
        this.WanPortIpv6 = WanPortIpv6;
    }

    /**
     * Get <p>数据库引擎</p> 
     * @return DbEngine <p>数据库引擎</p>
     */
    public String getDbEngine() {
        return this.DbEngine;
    }

    /**
     * Set <p>数据库引擎</p>
     * @param DbEngine <p>数据库引擎</p>
     */
    public void setDbEngine(String DbEngine) {
        this.DbEngine = DbEngine;
    }

    /**
     * Get <p>数据库版本</p> 
     * @return DbVersion <p>数据库版本</p>
     */
    public String getDbVersion() {
        return this.DbVersion;
    }

    /**
     * Set <p>数据库版本</p>
     * @param DbVersion <p>数据库版本</p>
     */
    public void setDbVersion(String DbVersion) {
        this.DbVersion = DbVersion;
    }

    /**
     * Get <p>标签信息</p> 
     * @return ResourceTags <p>标签信息</p>
     */
    public ResourceTag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set <p>标签信息</p>
     * @param ResourceTags <p>标签信息</p>
     */
    public void setResourceTags(ResourceTag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get <p>DCN标志，0-无，1-主实例，2-灾备实例</p> 
     * @return DcnFlag <p>DCN标志，0-无，1-主实例，2-灾备实例</p>
     */
    public Long getDcnFlag() {
        return this.DcnFlag;
    }

    /**
     * Set <p>DCN标志，0-无，1-主实例，2-灾备实例</p>
     * @param DcnFlag <p>DCN标志，0-无，1-主实例，2-灾备实例</p>
     */
    public void setDcnFlag(Long DcnFlag) {
        this.DcnFlag = DcnFlag;
    }

    /**
     * Get <p>DCN状态，0-无，1-创建中，2-同步中，3-已断开</p> 
     * @return DcnStatus <p>DCN状态，0-无，1-创建中，2-同步中，3-已断开</p>
     */
    public Long getDcnStatus() {
        return this.DcnStatus;
    }

    /**
     * Set <p>DCN状态，0-无，1-创建中，2-同步中，3-已断开</p>
     * @param DcnStatus <p>DCN状态，0-无，1-创建中，2-同步中，3-已断开</p>
     */
    public void setDcnStatus(Long DcnStatus) {
        this.DcnStatus = DcnStatus;
    }

    /**
     * Get <p>DCN灾备实例数</p> 
     * @return DcnDstNum <p>DCN灾备实例数</p>
     */
    public Long getDcnDstNum() {
        return this.DcnDstNum;
    }

    /**
     * Set <p>DCN灾备实例数</p>
     * @param DcnDstNum <p>DCN灾备实例数</p>
     */
    public void setDcnDstNum(Long DcnDstNum) {
        this.DcnDstNum = DcnDstNum;
    }

    /**
     * Get <p>1： 主实例（独享型）, 2: 主实例, 3： 灾备实例, 4： 灾备实例（独享型）</p> 
     * @return InstanceType <p>1： 主实例（独享型）, 2: 主实例, 3： 灾备实例, 4： 灾备实例（独享型）</p>
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>1： 主实例（独享型）, 2: 主实例, 3： 灾备实例, 4： 灾备实例（独享型）</p>
     * @param InstanceType <p>1： 主实例（独享型）, 2: 主实例, 3： 灾备实例, 4： 灾备实例（独享型）</p>
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>实例的各个DB节点信息</p> 
     * @return NodesInfo <p>实例的各个DB节点信息</p>
     */
    public NodeInfo [] getNodesInfo() {
        return this.NodesInfo;
    }

    /**
     * Set <p>实例的各个DB节点信息</p>
     * @param NodesInfo <p>实例的各个DB节点信息</p>
     */
    public void setNodesInfo(NodeInfo [] NodesInfo) {
        this.NodesInfo = NodesInfo;
    }

    /**
     * Get <p>实例是否支持设置用户连接数限制，内核为10.1暂不支持。</p> 
     * @return IsMaxUserConnectionsSupported <p>实例是否支持设置用户连接数限制，内核为10.1暂不支持。</p>
     */
    public Boolean getIsMaxUserConnectionsSupported() {
        return this.IsMaxUserConnectionsSupported;
    }

    /**
     * Set <p>实例是否支持设置用户连接数限制，内核为10.1暂不支持。</p>
     * @param IsMaxUserConnectionsSupported <p>实例是否支持设置用户连接数限制，内核为10.1暂不支持。</p>
     */
    public void setIsMaxUserConnectionsSupported(Boolean IsMaxUserConnectionsSupported) {
        this.IsMaxUserConnectionsSupported = IsMaxUserConnectionsSupported;
    }

    /**
     * Get <p>对外显示的数据库版本</p> 
     * @return DbVersionId <p>对外显示的数据库版本</p>
     */
    public String getDbVersionId() {
        return this.DbVersionId;
    }

    /**
     * Set <p>对外显示的数据库版本</p>
     * @param DbVersionId <p>对外显示的数据库版本</p>
     */
    public void setDbVersionId(String DbVersionId) {
        this.DbVersionId = DbVersionId;
    }

    /**
     * Get <p>加密状态, 0-未开启，1-已开启</p> 
     * @return EncryptStatus <p>加密状态, 0-未开启，1-已开启</p>
     */
    public Long getEncryptStatus() {
        return this.EncryptStatus;
    }

    /**
     * Set <p>加密状态, 0-未开启，1-已开启</p>
     * @param EncryptStatus <p>加密状态, 0-未开启，1-已开启</p>
     */
    public void setEncryptStatus(Long EncryptStatus) {
        this.EncryptStatus = EncryptStatus;
    }

    /**
     * Get <p>DCN的配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReplicaConfig <p>DCN的配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DCNReplicaConfig getReplicaConfig() {
        return this.ReplicaConfig;
    }

    /**
     * Set <p>DCN的配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReplicaConfig <p>DCN的配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReplicaConfig(DCNReplicaConfig ReplicaConfig) {
        this.ReplicaConfig = ReplicaConfig;
    }

    /**
     * Get <p>DCN的运行状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReplicaStatus <p>DCN的运行状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DCNReplicaStatus getReplicaStatus() {
        return this.ReplicaStatus;
    }

    /**
     * Set <p>DCN的运行状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReplicaStatus <p>DCN的运行状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReplicaStatus(DCNReplicaStatus ReplicaStatus) {
        this.ReplicaStatus = ReplicaStatus;
    }

    /**
     * Get <p>独享集群类型，0:公有云, 1:金融围笼, 2:CDC集群</p> 
     * @return ExclusterType <p>独享集群类型，0:公有云, 1:金融围笼, 2:CDC集群</p>
     */
    public Long getExclusterType() {
        return this.ExclusterType;
    }

    /**
     * Set <p>独享集群类型，0:公有云, 1:金融围笼, 2:CDC集群</p>
     * @param ExclusterType <p>独享集群类型，0:公有云, 1:金融围笼, 2:CDC集群</p>
     */
    public void setExclusterType(Long ExclusterType) {
        this.ExclusterType = ExclusterType;
    }

    /**
     * Get <p>VPC就近访问</p> 
     * @return RsAccessStrategy <p>VPC就近访问</p>
     */
    public Long getRsAccessStrategy() {
        return this.RsAccessStrategy;
    }

    /**
     * Set <p>VPC就近访问</p>
     * @param RsAccessStrategy <p>VPC就近访问</p>
     */
    public void setRsAccessStrategy(Long RsAccessStrategy) {
        this.RsAccessStrategy = RsAccessStrategy;
    }

    /**
     * Get <p>尚未回收的网络资源</p> 
     * @return ReservedNetResources <p>尚未回收的网络资源</p>
     */
    public ReservedNetResource [] getReservedNetResources() {
        return this.ReservedNetResources;
    }

    /**
     * Set <p>尚未回收的网络资源</p>
     * @param ReservedNetResources <p>尚未回收的网络资源</p>
     */
    public void setReservedNetResources(ReservedNetResource [] ReservedNetResources) {
        this.ReservedNetResources = ReservedNetResources;
    }

    /**
     * Get <p>是否支持物理复制</p> 
     * @return IsPhysicalReplicationSupported <p>是否支持物理复制</p>
     */
    public Boolean getIsPhysicalReplicationSupported() {
        return this.IsPhysicalReplicationSupported;
    }

    /**
     * Set <p>是否支持物理复制</p>
     * @param IsPhysicalReplicationSupported <p>是否支持物理复制</p>
     */
    public void setIsPhysicalReplicationSupported(Boolean IsPhysicalReplicationSupported) {
        this.IsPhysicalReplicationSupported = IsPhysicalReplicationSupported;
    }

    /**
     * Get <p>是否支持强同步DCN</p> 
     * @return IsDcnStrongSyncSupported <p>是否支持强同步DCN</p>
     */
    public Long getIsDcnStrongSyncSupported() {
        return this.IsDcnStrongSyncSupported;
    }

    /**
     * Set <p>是否支持强同步DCN</p>
     * @param IsDcnStrongSyncSupported <p>是否支持强同步DCN</p>
     */
    public void setIsDcnStrongSyncSupported(Long IsDcnStrongSyncSupported) {
        this.IsDcnStrongSyncSupported = IsDcnStrongSyncSupported;
    }

    /**
     * Get <p>是否支持DCN切换</p> 
     * @return IsDcnSwitchSupported <p>是否支持DCN切换</p>
     */
    public Long getIsDcnSwitchSupported() {
        return this.IsDcnSwitchSupported;
    }

    /**
     * Set <p>是否支持DCN切换</p>
     * @param IsDcnSwitchSupported <p>是否支持DCN切换</p>
     */
    public void setIsDcnSwitchSupported(Long IsDcnSwitchSupported) {
        this.IsDcnSwitchSupported = IsDcnSwitchSupported;
    }

    /**
     * Get <p>proxy版本号</p> 
     * @return ProxyVersion <p>proxy版本号</p>
     */
    public String getProxyVersion() {
        return this.ProxyVersion;
    }

    /**
     * Set <p>proxy版本号</p>
     * @param ProxyVersion <p>proxy版本号</p>
     */
    public void setProxyVersion(String ProxyVersion) {
        this.ProxyVersion = ProxyVersion;
    }

    /**
     * Get <p>Cpu类型，如：英特尔：Intel/AMD，海光：Hygon</p> 
     * @return CpuType <p>Cpu类型，如：英特尔：Intel/AMD，海光：Hygon</p>
     */
    public String getCpuType() {
        return this.CpuType;
    }

    /**
     * Set <p>Cpu类型，如：英特尔：Intel/AMD，海光：Hygon</p>
     * @param CpuType <p>Cpu类型，如：英特尔：Intel/AMD，海光：Hygon</p>
     */
    public void setCpuType(String CpuType) {
        this.CpuType = CpuType;
    }

    /**
     * Get <p>删除保护标记，1: 已开启删除保护，0: 未开启删除保护</p> 
     * @return ProtectedProperty <p>删除保护标记，1: 已开启删除保护，0: 未开启删除保护</p>
     */
    public Long getProtectedProperty() {
        return this.ProtectedProperty;
    }

    /**
     * Set <p>删除保护标记，1: 已开启删除保护，0: 未开启删除保护</p>
     * @param ProtectedProperty <p>删除保护标记，1: 已开启删除保护，0: 未开启删除保护</p>
     */
    public void setProtectedProperty(Long ProtectedProperty) {
        this.ProtectedProperty = ProtectedProperty;
    }

    /**
     * Get <p>流程Id，标志实例当前所处的异步任务</p> 
     * @return FlowId <p>流程Id，标志实例当前所处的异步任务</p>
     */
    public Long getFlowId() {
        return this.FlowId;
    }

    /**
     * Set <p>流程Id，标志实例当前所处的异步任务</p>
     * @param FlowId <p>流程Id，标志实例当前所处的异步任务</p>
     */
    public void setFlowId(Long FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
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
        if (source.IsDcnStrongSyncSupported != null) {
            this.IsDcnStrongSyncSupported = new Long(source.IsDcnStrongSyncSupported);
        }
        if (source.IsDcnSwitchSupported != null) {
            this.IsDcnSwitchSupported = new Long(source.IsDcnSwitchSupported);
        }
        if (source.ProxyVersion != null) {
            this.ProxyVersion = new String(source.ProxyVersion);
        }
        if (source.CpuType != null) {
            this.CpuType = new String(source.CpuType);
        }
        if (source.ProtectedProperty != null) {
            this.ProtectedProperty = new Long(source.ProtectedProperty);
        }
        if (source.FlowId != null) {
            this.FlowId = new Long(source.FlowId);
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
        this.setParamSimple(map, prefix + "IsDcnStrongSyncSupported", this.IsDcnStrongSyncSupported);
        this.setParamSimple(map, prefix + "IsDcnSwitchSupported", this.IsDcnSwitchSupported);
        this.setParamSimple(map, prefix + "ProxyVersion", this.ProxyVersion);
        this.setParamSimple(map, prefix + "CpuType", this.CpuType);
        this.setParamSimple(map, prefix + "ProtectedProperty", this.ProtectedProperty);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

