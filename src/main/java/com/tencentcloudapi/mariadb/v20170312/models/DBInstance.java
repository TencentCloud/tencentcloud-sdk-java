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

public class DBInstance extends AbstractModel {

    /**
    * 实例 ID，唯一标识一个 TDSQL 实例
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称，用户可修改
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例所属应用 ID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 实例所属项目 ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

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
    * 私有网络 ID，基础网络时为 0
    */
    @SerializedName("VpcId")
    @Expose
    private Long VpcId;

    /**
    * 子网 ID，基础网络时为 0
    */
    @SerializedName("SubnetId")
    @Expose
    private Long SubnetId;

    /**
    * 实例状态：0 创建中，1 流程处理中， 2 运行中，3 实例未初始化，-1 实例已隔离，4 实例初始化中，5 实例删除中，6 实例重启中，7 数据迁移中
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

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
    * 实例创建时间，格式为 2006-01-02 15:04:05
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 实例最后更新时间，格式为 2006-01-02 15:04:05
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 自动续费标志：0 否，1 是
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 实例到期时间，格式为 2006-01-02 15:04:05
    */
    @SerializedName("PeriodEndTime")
    @Expose
    private String PeriodEndTime;

    /**
    * 实例所属账号
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

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
    * 原始实例ID（过时字段，请勿依赖该值）
    */
    @SerializedName("OriginSerialId")
    @Expose
    private String OriginSerialId;

    /**
    * 节点数，2为一主一从，3为一主二从
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * 是否临时实例，0为否，非0为是
    */
    @SerializedName("IsTmp")
    @Expose
    private Long IsTmp;

    /**
    * 独享集群ID，为空表示为普通实例
    */
    @SerializedName("ExclusterId")
    @Expose
    private String ExclusterId;

    /**
    * 数字实例ID（过时字段，请勿依赖该值）
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 产品类型 ID
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * 最大 Qps 值
    */
    @SerializedName("Qps")
    @Expose
    private Long Qps;

    /**
    * 付费模式
    */
    @SerializedName("Paymode")
    @Expose
    private String Paymode;

    /**
    * 实例处于异步任务时的异步任务流程ID
    */
    @SerializedName("Locker")
    @Expose
    private Long Locker;

    /**
    * 实例目前运行状态描述
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

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
    * 机器型号
    */
    @SerializedName("Machine")
    @Expose
    private String Machine;

    /**
    * 是否支持数据加密。1-支持；0-不支持
    */
    @SerializedName("IsEncryptSupported")
    @Expose
    private Long IsEncryptSupported;

    /**
    * 实例CPU核数
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 实例IPv6标志
    */
    @SerializedName("Ipv6Flag")
    @Expose
    private Long Ipv6Flag;

    /**
    * 内网IPv6
    */
    @SerializedName("Vipv6")
    @Expose
    private String Vipv6;

    /**
    * 外网IPv6
    */
    @SerializedName("WanVipv6")
    @Expose
    private String WanVipv6;

    /**
    * 外网IPv6端口
    */
    @SerializedName("WanPortIpv6")
    @Expose
    private Long WanPortIpv6;

    /**
    * 外网IPv6状态
    */
    @SerializedName("WanStatusIpv6")
    @Expose
    private Long WanStatusIpv6;

    /**
    * 数据库引擎
    */
    @SerializedName("DbEngine")
    @Expose
    private String DbEngine;

    /**
    * 数据库版本
    */
    @SerializedName("DbVersion")
    @Expose
    private String DbVersion;

    /**
    * DCN标志，0-无，1-主实例，2-灾备实例
    */
    @SerializedName("DcnFlag")
    @Expose
    private Long DcnFlag;

    /**
    * DCN状态，0-无，1-创建中，2-同步中，3-已断开
    */
    @SerializedName("DcnStatus")
    @Expose
    private Long DcnStatus;

    /**
    * DCN灾备实例数
    */
    @SerializedName("DcnDstNum")
    @Expose
    private Long DcnDstNum;

    /**
    * 1： 主实例（独享型）, 2: 主实例, 3： 灾备实例, 4： 灾备实例（独享型）
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * 实例标签信息
    */
    @SerializedName("ResourceTags")
    @Expose
    private ResourceTag [] ResourceTags;

    /**
    * 数据库版本
    */
    @SerializedName("DbVersionId")
    @Expose
    private String DbVersionId;

    /**
    * 实例删除保护标签，1: 已开启删除保护，0: 未开启删除保护
    */
    @SerializedName("ProtectedProperty")
    @Expose
    private Long ProtectedProperty;

    /**
     * Get 实例 ID，唯一标识一个 TDSQL 实例 
     * @return InstanceId 实例 ID，唯一标识一个 TDSQL 实例
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID，唯一标识一个 TDSQL 实例
     * @param InstanceId 实例 ID，唯一标识一个 TDSQL 实例
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称，用户可修改 
     * @return InstanceName 实例名称，用户可修改
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称，用户可修改
     * @param InstanceName 实例名称，用户可修改
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例所属应用 ID 
     * @return AppId 实例所属应用 ID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 实例所属应用 ID
     * @param AppId 实例所属应用 ID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 实例所属项目 ID 
     * @return ProjectId 实例所属项目 ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 实例所属项目 ID
     * @param ProjectId 实例所属项目 ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
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
     * Get 私有网络 ID，基础网络时为 0 
     * @return VpcId 私有网络 ID，基础网络时为 0
     */
    public Long getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络 ID，基础网络时为 0
     * @param VpcId 私有网络 ID，基础网络时为 0
     */
    public void setVpcId(Long VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网 ID，基础网络时为 0 
     * @return SubnetId 子网 ID，基础网络时为 0
     */
    public Long getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网 ID，基础网络时为 0
     * @param SubnetId 子网 ID，基础网络时为 0
     */
    public void setSubnetId(Long SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 实例状态：0 创建中，1 流程处理中， 2 运行中，3 实例未初始化，-1 实例已隔离，4 实例初始化中，5 实例删除中，6 实例重启中，7 数据迁移中 
     * @return Status 实例状态：0 创建中，1 流程处理中， 2 运行中，3 实例未初始化，-1 实例已隔离，4 实例初始化中，5 实例删除中，6 实例重启中，7 数据迁移中
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 实例状态：0 创建中，1 流程处理中， 2 运行中，3 实例未初始化，-1 实例已隔离，4 实例初始化中，5 实例删除中，6 实例重启中，7 数据迁移中
     * @param Status 实例状态：0 创建中，1 流程处理中， 2 运行中，3 实例未初始化，-1 实例已隔离，4 实例初始化中，5 实例删除中，6 实例重启中，7 数据迁移中
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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
     * Get 实例所属账号 
     * @return Uin 实例所属账号
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 实例所属账号
     * @param Uin 实例所属账号
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
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
     * Get 原始实例ID（过时字段，请勿依赖该值） 
     * @return OriginSerialId 原始实例ID（过时字段，请勿依赖该值）
     */
    public String getOriginSerialId() {
        return this.OriginSerialId;
    }

    /**
     * Set 原始实例ID（过时字段，请勿依赖该值）
     * @param OriginSerialId 原始实例ID（过时字段，请勿依赖该值）
     */
    public void setOriginSerialId(String OriginSerialId) {
        this.OriginSerialId = OriginSerialId;
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
     * Get 独享集群ID，为空表示为普通实例 
     * @return ExclusterId 独享集群ID，为空表示为普通实例
     */
    public String getExclusterId() {
        return this.ExclusterId;
    }

    /**
     * Set 独享集群ID，为空表示为普通实例
     * @param ExclusterId 独享集群ID，为空表示为普通实例
     */
    public void setExclusterId(String ExclusterId) {
        this.ExclusterId = ExclusterId;
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
     * Get 产品类型 ID 
     * @return Pid 产品类型 ID
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set 产品类型 ID
     * @param Pid 产品类型 ID
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get 最大 Qps 值 
     * @return Qps 最大 Qps 值
     */
    public Long getQps() {
        return this.Qps;
    }

    /**
     * Set 最大 Qps 值
     * @param Qps 最大 Qps 值
     */
    public void setQps(Long Qps) {
        this.Qps = Qps;
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
     * Get 实例处于异步任务时的异步任务流程ID 
     * @return Locker 实例处于异步任务时的异步任务流程ID
     */
    public Long getLocker() {
        return this.Locker;
    }

    /**
     * Set 实例处于异步任务时的异步任务流程ID
     * @param Locker 实例处于异步任务时的异步任务流程ID
     */
    public void setLocker(Long Locker) {
        this.Locker = Locker;
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
     * Get 机器型号 
     * @return Machine 机器型号
     */
    public String getMachine() {
        return this.Machine;
    }

    /**
     * Set 机器型号
     * @param Machine 机器型号
     */
    public void setMachine(String Machine) {
        this.Machine = Machine;
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
     * Get 实例CPU核数 
     * @return Cpu 实例CPU核数
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set 实例CPU核数
     * @param Cpu 实例CPU核数
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 实例IPv6标志 
     * @return Ipv6Flag 实例IPv6标志
     */
    public Long getIpv6Flag() {
        return this.Ipv6Flag;
    }

    /**
     * Set 实例IPv6标志
     * @param Ipv6Flag 实例IPv6标志
     */
    public void setIpv6Flag(Long Ipv6Flag) {
        this.Ipv6Flag = Ipv6Flag;
    }

    /**
     * Get 内网IPv6 
     * @return Vipv6 内网IPv6
     */
    public String getVipv6() {
        return this.Vipv6;
    }

    /**
     * Set 内网IPv6
     * @param Vipv6 内网IPv6
     */
    public void setVipv6(String Vipv6) {
        this.Vipv6 = Vipv6;
    }

    /**
     * Get 外网IPv6 
     * @return WanVipv6 外网IPv6
     */
    public String getWanVipv6() {
        return this.WanVipv6;
    }

    /**
     * Set 外网IPv6
     * @param WanVipv6 外网IPv6
     */
    public void setWanVipv6(String WanVipv6) {
        this.WanVipv6 = WanVipv6;
    }

    /**
     * Get 外网IPv6端口 
     * @return WanPortIpv6 外网IPv6端口
     */
    public Long getWanPortIpv6() {
        return this.WanPortIpv6;
    }

    /**
     * Set 外网IPv6端口
     * @param WanPortIpv6 外网IPv6端口
     */
    public void setWanPortIpv6(Long WanPortIpv6) {
        this.WanPortIpv6 = WanPortIpv6;
    }

    /**
     * Get 外网IPv6状态 
     * @return WanStatusIpv6 外网IPv6状态
     */
    public Long getWanStatusIpv6() {
        return this.WanStatusIpv6;
    }

    /**
     * Set 外网IPv6状态
     * @param WanStatusIpv6 外网IPv6状态
     */
    public void setWanStatusIpv6(Long WanStatusIpv6) {
        this.WanStatusIpv6 = WanStatusIpv6;
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
     * Get 数据库版本 
     * @return DbVersion 数据库版本
     */
    public String getDbVersion() {
        return this.DbVersion;
    }

    /**
     * Set 数据库版本
     * @param DbVersion 数据库版本
     */
    public void setDbVersion(String DbVersion) {
        this.DbVersion = DbVersion;
    }

    /**
     * Get DCN标志，0-无，1-主实例，2-灾备实例 
     * @return DcnFlag DCN标志，0-无，1-主实例，2-灾备实例
     */
    public Long getDcnFlag() {
        return this.DcnFlag;
    }

    /**
     * Set DCN标志，0-无，1-主实例，2-灾备实例
     * @param DcnFlag DCN标志，0-无，1-主实例，2-灾备实例
     */
    public void setDcnFlag(Long DcnFlag) {
        this.DcnFlag = DcnFlag;
    }

    /**
     * Get DCN状态，0-无，1-创建中，2-同步中，3-已断开 
     * @return DcnStatus DCN状态，0-无，1-创建中，2-同步中，3-已断开
     */
    public Long getDcnStatus() {
        return this.DcnStatus;
    }

    /**
     * Set DCN状态，0-无，1-创建中，2-同步中，3-已断开
     * @param DcnStatus DCN状态，0-无，1-创建中，2-同步中，3-已断开
     */
    public void setDcnStatus(Long DcnStatus) {
        this.DcnStatus = DcnStatus;
    }

    /**
     * Get DCN灾备实例数 
     * @return DcnDstNum DCN灾备实例数
     */
    public Long getDcnDstNum() {
        return this.DcnDstNum;
    }

    /**
     * Set DCN灾备实例数
     * @param DcnDstNum DCN灾备实例数
     */
    public void setDcnDstNum(Long DcnDstNum) {
        this.DcnDstNum = DcnDstNum;
    }

    /**
     * Get 1： 主实例（独享型）, 2: 主实例, 3： 灾备实例, 4： 灾备实例（独享型） 
     * @return InstanceType 1： 主实例（独享型）, 2: 主实例, 3： 灾备实例, 4： 灾备实例（独享型）
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 1： 主实例（独享型）, 2: 主实例, 3： 灾备实例, 4： 灾备实例（独享型）
     * @param InstanceType 1： 主实例（独享型）, 2: 主实例, 3： 灾备实例, 4： 灾备实例（独享型）
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 实例标签信息 
     * @return ResourceTags 实例标签信息
     */
    public ResourceTag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set 实例标签信息
     * @param ResourceTags 实例标签信息
     */
    public void setResourceTags(ResourceTag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get 数据库版本 
     * @return DbVersionId 数据库版本
     */
    public String getDbVersionId() {
        return this.DbVersionId;
    }

    /**
     * Set 数据库版本
     * @param DbVersionId 数据库版本
     */
    public void setDbVersionId(String DbVersionId) {
        this.DbVersionId = DbVersionId;
    }

    /**
     * Get 实例删除保护标签，1: 已开启删除保护，0: 未开启删除保护 
     * @return ProtectedProperty 实例删除保护标签，1: 已开启删除保护，0: 未开启删除保护
     */
    public Long getProtectedProperty() {
        return this.ProtectedProperty;
    }

    /**
     * Set 实例删除保护标签，1: 已开启删除保护，0: 未开启删除保护
     * @param ProtectedProperty 实例删除保护标签，1: 已开启删除保护，0: 未开启删除保护
     */
    public void setProtectedProperty(Long ProtectedProperty) {
        this.ProtectedProperty = ProtectedProperty;
    }

    public DBInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DBInstance(DBInstance source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.VpcId != null) {
            this.VpcId = new Long(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new Long(source.SubnetId);
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
        if (source.WanDomain != null) {
            this.WanDomain = new String(source.WanDomain);
        }
        if (source.WanVip != null) {
            this.WanVip = new String(source.WanVip);
        }
        if (source.WanPort != null) {
            this.WanPort = new Long(source.WanPort);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.PeriodEndTime != null) {
            this.PeriodEndTime = new String(source.PeriodEndTime);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
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
        if (source.UniqueVpcId != null) {
            this.UniqueVpcId = new String(source.UniqueVpcId);
        }
        if (source.UniqueSubnetId != null) {
            this.UniqueSubnetId = new String(source.UniqueSubnetId);
        }
        if (source.OriginSerialId != null) {
            this.OriginSerialId = new String(source.OriginSerialId);
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.IsTmp != null) {
            this.IsTmp = new Long(source.IsTmp);
        }
        if (source.ExclusterId != null) {
            this.ExclusterId = new String(source.ExclusterId);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Pid != null) {
            this.Pid = new Long(source.Pid);
        }
        if (source.Qps != null) {
            this.Qps = new Long(source.Qps);
        }
        if (source.Paymode != null) {
            this.Paymode = new String(source.Paymode);
        }
        if (source.Locker != null) {
            this.Locker = new Long(source.Locker);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.WanStatus != null) {
            this.WanStatus = new Long(source.WanStatus);
        }
        if (source.IsAuditSupported != null) {
            this.IsAuditSupported = new Long(source.IsAuditSupported);
        }
        if (source.Machine != null) {
            this.Machine = new String(source.Machine);
        }
        if (source.IsEncryptSupported != null) {
            this.IsEncryptSupported = new Long(source.IsEncryptSupported);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Ipv6Flag != null) {
            this.Ipv6Flag = new Long(source.Ipv6Flag);
        }
        if (source.Vipv6 != null) {
            this.Vipv6 = new String(source.Vipv6);
        }
        if (source.WanVipv6 != null) {
            this.WanVipv6 = new String(source.WanVipv6);
        }
        if (source.WanPortIpv6 != null) {
            this.WanPortIpv6 = new Long(source.WanPortIpv6);
        }
        if (source.WanStatusIpv6 != null) {
            this.WanStatusIpv6 = new Long(source.WanStatusIpv6);
        }
        if (source.DbEngine != null) {
            this.DbEngine = new String(source.DbEngine);
        }
        if (source.DbVersion != null) {
            this.DbVersion = new String(source.DbVersion);
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
        if (source.ResourceTags != null) {
            this.ResourceTags = new ResourceTag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new ResourceTag(source.ResourceTags[i]);
            }
        }
        if (source.DbVersionId != null) {
            this.DbVersionId = new String(source.DbVersionId);
        }
        if (source.ProtectedProperty != null) {
            this.ProtectedProperty = new Long(source.ProtectedProperty);
        }
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "WanDomain", this.WanDomain);
        this.setParamSimple(map, prefix + "WanVip", this.WanVip);
        this.setParamSimple(map, prefix + "WanPort", this.WanPort);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "PeriodEndTime", this.PeriodEndTime);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "TdsqlVersion", this.TdsqlVersion);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "UniqueVpcId", this.UniqueVpcId);
        this.setParamSimple(map, prefix + "UniqueSubnetId", this.UniqueSubnetId);
        this.setParamSimple(map, prefix + "OriginSerialId", this.OriginSerialId);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "IsTmp", this.IsTmp);
        this.setParamSimple(map, prefix + "ExclusterId", this.ExclusterId);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "Qps", this.Qps);
        this.setParamSimple(map, prefix + "Paymode", this.Paymode);
        this.setParamSimple(map, prefix + "Locker", this.Locker);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "WanStatus", this.WanStatus);
        this.setParamSimple(map, prefix + "IsAuditSupported", this.IsAuditSupported);
        this.setParamSimple(map, prefix + "Machine", this.Machine);
        this.setParamSimple(map, prefix + "IsEncryptSupported", this.IsEncryptSupported);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Ipv6Flag", this.Ipv6Flag);
        this.setParamSimple(map, prefix + "Vipv6", this.Vipv6);
        this.setParamSimple(map, prefix + "WanVipv6", this.WanVipv6);
        this.setParamSimple(map, prefix + "WanPortIpv6", this.WanPortIpv6);
        this.setParamSimple(map, prefix + "WanStatusIpv6", this.WanStatusIpv6);
        this.setParamSimple(map, prefix + "DbEngine", this.DbEngine);
        this.setParamSimple(map, prefix + "DbVersion", this.DbVersion);
        this.setParamSimple(map, prefix + "DcnFlag", this.DcnFlag);
        this.setParamSimple(map, prefix + "DcnStatus", this.DcnStatus);
        this.setParamSimple(map, prefix + "DcnDstNum", this.DcnDstNum);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "DbVersionId", this.DbVersionId);
        this.setParamSimple(map, prefix + "ProtectedProperty", this.ProtectedProperty);

    }
}

