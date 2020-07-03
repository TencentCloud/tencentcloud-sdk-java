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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DCDBInstanceInfo extends AbstractModel{

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
    * AppID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * VPC数字ID
    */
    @SerializedName("VpcId")
    @Expose
    private Long VpcId;

    /**
    * Subnet数字ID
    */
    @SerializedName("SubnetId")
    @Expose
    private Long SubnetId;

    /**
    * 状态中文描述
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 内网IP
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
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 自动续费标志
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 内存大小，单位 GB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 存储大小，单位 GB
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * 分片个数
    */
    @SerializedName("ShardCount")
    @Expose
    private Long ShardCount;

    /**
    * 到期时间
    */
    @SerializedName("PeriodEndTime")
    @Expose
    private String PeriodEndTime;

    /**
    * 隔离时间
    */
    @SerializedName("IsolatedTimestamp")
    @Expose
    private String IsolatedTimestamp;

    /**
    * UIN
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 分片详情
    */
    @SerializedName("ShardDetail")
    @Expose
    private ShardInfo [] ShardDetail;

    /**
    * 节点数，2 为一主一从， 3 为一主二从
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * 临时实例标记，0 为非临时实例
    */
    @SerializedName("IsTmp")
    @Expose
    private Long IsTmp;

    /**
    * 独享集群ID，为空表示非独享集群实例
    */
    @SerializedName("ExclusterId")
    @Expose
    private String ExclusterId;

    /**
    * 字符串型的私有网络ID
    */
    @SerializedName("UniqueVpcId")
    @Expose
    private String UniqueVpcId;

    /**
    * 字符串型的私有网络子网ID
    */
    @SerializedName("UniqueSubnetId")
    @Expose
    private String UniqueSubnetId;

    /**
    * 数字实例ID（过时字段，请勿依赖该值）
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

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
    * 产品类型 ID（过时字段，请勿依赖该值）
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * 实例最后更新时间，格式为 2006-01-02 15:04:05
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 数据库引擎
    */
    @SerializedName("DbEngine")
    @Expose
    private String DbEngine;

    /**
    * 数据库引擎版本
    */
    @SerializedName("DbVersion")
    @Expose
    private String DbVersion;

    /**
    * 付费模式
    */
    @SerializedName("Paymode")
    @Expose
    private String Paymode;

    /**
    * 实例处于异步任务状态时，表示异步任务流程ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Locker")
    @Expose
    private Long Locker;

    /**
    * 外网状态，0-未开通；1-已开通；2-关闭；3-开通中
    */
    @SerializedName("WanStatus")
    @Expose
    private Long WanStatus;

    /**
    * 该实例是否支持审计。1-支持；0-不支持
    */
    @SerializedName("IsAuditSupported")
    @Expose
    private Long IsAuditSupported;

    /**
    * Cpu核数
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
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
     * Get AppID 
     * @return AppId AppID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set AppID
     * @param AppId AppID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 可用区 
     * @return Zone 可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区
     * @param Zone 可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get VPC数字ID 
     * @return VpcId VPC数字ID
     */
    public Long getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC数字ID
     * @param VpcId VPC数字ID
     */
    public void setVpcId(Long VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet数字ID 
     * @return SubnetId Subnet数字ID
     */
    public Long getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet数字ID
     * @param SubnetId Subnet数字ID
     */
    public void setSubnetId(Long SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 状态中文描述 
     * @return StatusDesc 状态中文描述
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set 状态中文描述
     * @param StatusDesc 状态中文描述
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get 状态 
     * @return Status 状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 内网IP 
     * @return Vip 内网IP
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 内网IP
     * @param Vip 内网IP
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
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 自动续费标志 
     * @return AutoRenewFlag 自动续费标志
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 自动续费标志
     * @param AutoRenewFlag 自动续费标志
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 内存大小，单位 GB 
     * @return Memory 内存大小，单位 GB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存大小，单位 GB
     * @param Memory 内存大小，单位 GB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 存储大小，单位 GB 
     * @return Storage 存储大小，单位 GB
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set 存储大小，单位 GB
     * @param Storage 存储大小，单位 GB
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get 分片个数 
     * @return ShardCount 分片个数
     */
    public Long getShardCount() {
        return this.ShardCount;
    }

    /**
     * Set 分片个数
     * @param ShardCount 分片个数
     */
    public void setShardCount(Long ShardCount) {
        this.ShardCount = ShardCount;
    }

    /**
     * Get 到期时间 
     * @return PeriodEndTime 到期时间
     */
    public String getPeriodEndTime() {
        return this.PeriodEndTime;
    }

    /**
     * Set 到期时间
     * @param PeriodEndTime 到期时间
     */
    public void setPeriodEndTime(String PeriodEndTime) {
        this.PeriodEndTime = PeriodEndTime;
    }

    /**
     * Get 隔离时间 
     * @return IsolatedTimestamp 隔离时间
     */
    public String getIsolatedTimestamp() {
        return this.IsolatedTimestamp;
    }

    /**
     * Set 隔离时间
     * @param IsolatedTimestamp 隔离时间
     */
    public void setIsolatedTimestamp(String IsolatedTimestamp) {
        this.IsolatedTimestamp = IsolatedTimestamp;
    }

    /**
     * Get UIN 
     * @return Uin UIN
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set UIN
     * @param Uin UIN
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 分片详情 
     * @return ShardDetail 分片详情
     */
    public ShardInfo [] getShardDetail() {
        return this.ShardDetail;
    }

    /**
     * Set 分片详情
     * @param ShardDetail 分片详情
     */
    public void setShardDetail(ShardInfo [] ShardDetail) {
        this.ShardDetail = ShardDetail;
    }

    /**
     * Get 节点数，2 为一主一从， 3 为一主二从 
     * @return NodeCount 节点数，2 为一主一从， 3 为一主二从
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set 节点数，2 为一主一从， 3 为一主二从
     * @param NodeCount 节点数，2 为一主一从， 3 为一主二从
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get 临时实例标记，0 为非临时实例 
     * @return IsTmp 临时实例标记，0 为非临时实例
     */
    public Long getIsTmp() {
        return this.IsTmp;
    }

    /**
     * Set 临时实例标记，0 为非临时实例
     * @param IsTmp 临时实例标记，0 为非临时实例
     */
    public void setIsTmp(Long IsTmp) {
        this.IsTmp = IsTmp;
    }

    /**
     * Get 独享集群ID，为空表示非独享集群实例 
     * @return ExclusterId 独享集群ID，为空表示非独享集群实例
     */
    public String getExclusterId() {
        return this.ExclusterId;
    }

    /**
     * Set 独享集群ID，为空表示非独享集群实例
     * @param ExclusterId 独享集群ID，为空表示非独享集群实例
     */
    public void setExclusterId(String ExclusterId) {
        this.ExclusterId = ExclusterId;
    }

    /**
     * Get 字符串型的私有网络ID 
     * @return UniqueVpcId 字符串型的私有网络ID
     */
    public String getUniqueVpcId() {
        return this.UniqueVpcId;
    }

    /**
     * Set 字符串型的私有网络ID
     * @param UniqueVpcId 字符串型的私有网络ID
     */
    public void setUniqueVpcId(String UniqueVpcId) {
        this.UniqueVpcId = UniqueVpcId;
    }

    /**
     * Get 字符串型的私有网络子网ID 
     * @return UniqueSubnetId 字符串型的私有网络子网ID
     */
    public String getUniqueSubnetId() {
        return this.UniqueSubnetId;
    }

    /**
     * Set 字符串型的私有网络子网ID
     * @param UniqueSubnetId 字符串型的私有网络子网ID
     */
    public void setUniqueSubnetId(String UniqueSubnetId) {
        this.UniqueSubnetId = UniqueSubnetId;
    }

    /**
     * Get 数字实例ID（过时字段，请勿依赖该值） 
     * @return Id 数字实例ID（过时字段，请勿依赖该值）
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 数字实例ID（过时字段，请勿依赖该值）
     * @param Id 数字实例ID（过时字段，请勿依赖该值）
     */
    public void setId(Long Id) {
        this.Id = Id;
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
     * Get 产品类型 ID（过时字段，请勿依赖该值） 
     * @return Pid 产品类型 ID（过时字段，请勿依赖该值）
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set 产品类型 ID（过时字段，请勿依赖该值）
     * @param Pid 产品类型 ID（过时字段，请勿依赖该值）
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get 实例最后更新时间，格式为 2006-01-02 15:04:05 
     * @return UpdateTime 实例最后更新时间，格式为 2006-01-02 15:04:05
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 实例最后更新时间，格式为 2006-01-02 15:04:05
     * @param UpdateTime 实例最后更新时间，格式为 2006-01-02 15:04:05
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 数据库引擎 
     * @return DbEngine 数据库引擎
     */
    public String getDbEngine() {
        return this.DbEngine;
    }

    /**
     * Set 数据库引擎
     * @param DbEngine 数据库引擎
     */
    public void setDbEngine(String DbEngine) {
        this.DbEngine = DbEngine;
    }

    /**
     * Get 数据库引擎版本 
     * @return DbVersion 数据库引擎版本
     */
    public String getDbVersion() {
        return this.DbVersion;
    }

    /**
     * Set 数据库引擎版本
     * @param DbVersion 数据库引擎版本
     */
    public void setDbVersion(String DbVersion) {
        this.DbVersion = DbVersion;
    }

    /**
     * Get 付费模式 
     * @return Paymode 付费模式
     */
    public String getPaymode() {
        return this.Paymode;
    }

    /**
     * Set 付费模式
     * @param Paymode 付费模式
     */
    public void setPaymode(String Paymode) {
        this.Paymode = Paymode;
    }

    /**
     * Get 实例处于异步任务状态时，表示异步任务流程ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Locker 实例处于异步任务状态时，表示异步任务流程ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLocker() {
        return this.Locker;
    }

    /**
     * Set 实例处于异步任务状态时，表示异步任务流程ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Locker 实例处于异步任务状态时，表示异步任务流程ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocker(Long Locker) {
        this.Locker = Locker;
    }

    /**
     * Get 外网状态，0-未开通；1-已开通；2-关闭；3-开通中 
     * @return WanStatus 外网状态，0-未开通；1-已开通；2-关闭；3-开通中
     */
    public Long getWanStatus() {
        return this.WanStatus;
    }

    /**
     * Set 外网状态，0-未开通；1-已开通；2-关闭；3-开通中
     * @param WanStatus 外网状态，0-未开通；1-已开通；2-关闭；3-开通中
     */
    public void setWanStatus(Long WanStatus) {
        this.WanStatus = WanStatus;
    }

    /**
     * Get 该实例是否支持审计。1-支持；0-不支持 
     * @return IsAuditSupported 该实例是否支持审计。1-支持；0-不支持
     */
    public Long getIsAuditSupported() {
        return this.IsAuditSupported;
    }

    /**
     * Set 该实例是否支持审计。1-支持；0-不支持
     * @param IsAuditSupported 该实例是否支持审计。1-支持；0-不支持
     */
    public void setIsAuditSupported(Long IsAuditSupported) {
        this.IsAuditSupported = IsAuditSupported;
    }

    /**
     * Get Cpu核数 
     * @return Cpu Cpu核数
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Cpu核数
     * @param Cpu Cpu核数
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "ShardCount", this.ShardCount);
        this.setParamSimple(map, prefix + "PeriodEndTime", this.PeriodEndTime);
        this.setParamSimple(map, prefix + "IsolatedTimestamp", this.IsolatedTimestamp);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamArrayObj(map, prefix + "ShardDetail.", this.ShardDetail);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "IsTmp", this.IsTmp);
        this.setParamSimple(map, prefix + "ExclusterId", this.ExclusterId);
        this.setParamSimple(map, prefix + "UniqueVpcId", this.UniqueVpcId);
        this.setParamSimple(map, prefix + "UniqueSubnetId", this.UniqueSubnetId);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "WanDomain", this.WanDomain);
        this.setParamSimple(map, prefix + "WanVip", this.WanVip);
        this.setParamSimple(map, prefix + "WanPort", this.WanPort);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "DbEngine", this.DbEngine);
        this.setParamSimple(map, prefix + "DbVersion", this.DbVersion);
        this.setParamSimple(map, prefix + "Paymode", this.Paymode);
        this.setParamSimple(map, prefix + "Locker", this.Locker);
        this.setParamSimple(map, prefix + "WanStatus", this.WanStatus);
        this.setParamSimple(map, prefix + "IsAuditSupported", this.IsAuditSupported);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);

    }
}

