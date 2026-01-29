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
    * <p>实例 ID，唯一标识一个 TDSQL 实例</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例名称，用户可修改</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>实例所属应用 ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>实例所属项目 ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

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
    * <p>私有网络 ID，基础网络时为 0</p>
    */
    @SerializedName("VpcId")
    @Expose
    private Long VpcId;

    /**
    * <p>子网 ID，基础网络时为 0</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private Long SubnetId;

    /**
    * <p>实例状态：0 创建中，1 流程处理中， 2 运行中，3 实例未初始化，-1 实例已隔离，4 实例初始化中，5 实例删除中，6 实例重启中，7 数据迁移中</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

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
    * <p>实例创建时间，格式为 2006-01-02 15:04:05</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>实例最后更新时间，格式为 2006-01-02 15:04:05</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>自动续费标志：0 否，1 是</p>
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * <p>实例到期时间，格式为 2006-01-02 15:04:05</p>
    */
    @SerializedName("PeriodEndTime")
    @Expose
    private String PeriodEndTime;

    /**
    * <p>实例所属账号</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

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
    * <p>字符串型的私有网络ID</p>
    */
    @SerializedName("UniqueVpcId")
    @Expose
    private String UniqueVpcId;

    /**
    * <p>字符串型的私有网络子网ID</p>
    */
    @SerializedName("UniqueSubnetId")
    @Expose
    private String UniqueSubnetId;

    /**
    * <p>原始实例ID（过时字段，请勿依赖该值）</p>
    */
    @SerializedName("OriginSerialId")
    @Expose
    private String OriginSerialId;

    /**
    * <p>节点数，2为一主一从，3为一主二从</p>
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * <p>是否临时实例，0为否，非0为是</p>
    */
    @SerializedName("IsTmp")
    @Expose
    private Long IsTmp;

    /**
    * <p>独享集群ID，为空表示为普通实例</p>
    */
    @SerializedName("ExclusterId")
    @Expose
    private String ExclusterId;

    /**
    * <p>数字实例ID（过时字段，请勿依赖该值）</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>产品类型 ID</p>
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * <p>最大 Qps 值</p>
    */
    @SerializedName("Qps")
    @Expose
    private Long Qps;

    /**
    * <p>付费模式</p>
    */
    @SerializedName("Paymode")
    @Expose
    private String Paymode;

    /**
    * <p>实例处于异步任务时的异步任务流程ID</p>
    */
    @SerializedName("Locker")
    @Expose
    private Long Locker;

    /**
    * <p>实例目前运行状态描述</p>
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * <p>外网状态，0-未开通；1-已开通；2-关闭；3-开通中</p>
    */
    @SerializedName("WanStatus")
    @Expose
    private Long WanStatus;

    /**
    * <p>该实例是否支持审计。1-支持；0-不支持</p>
    */
    @SerializedName("IsAuditSupported")
    @Expose
    private Long IsAuditSupported;

    /**
    * <p>机器型号</p>
    */
    @SerializedName("Machine")
    @Expose
    private String Machine;

    /**
    * <p>是否支持数据加密。1-支持；0-不支持</p>
    */
    @SerializedName("IsEncryptSupported")
    @Expose
    private Long IsEncryptSupported;

    /**
    * <p>实例CPU核数</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>实例IPv6标志</p>
    */
    @SerializedName("Ipv6Flag")
    @Expose
    private Long Ipv6Flag;

    /**
    * <p>内网IPv6</p>
    */
    @SerializedName("Vipv6")
    @Expose
    private String Vipv6;

    /**
    * <p>外网IPv6</p>
    */
    @SerializedName("WanVipv6")
    @Expose
    private String WanVipv6;

    /**
    * <p>外网IPv6端口</p>
    */
    @SerializedName("WanPortIpv6")
    @Expose
    private Long WanPortIpv6;

    /**
    * <p>外网IPv6状态</p>
    */
    @SerializedName("WanStatusIpv6")
    @Expose
    private Long WanStatusIpv6;

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
    * <p>实例标签信息</p>
    */
    @SerializedName("ResourceTags")
    @Expose
    private ResourceTag [] ResourceTags;

    /**
    * <p>数据库版本</p>
    */
    @SerializedName("DbVersionId")
    @Expose
    private String DbVersionId;

    /**
    * <p>实例删除保护标签，1: 已开启删除保护，0: 未开启删除保护</p>
    */
    @SerializedName("ProtectedProperty")
    @Expose
    private Long ProtectedProperty;

    /**
     * Get <p>实例 ID，唯一标识一个 TDSQL 实例</p> 
     * @return InstanceId <p>实例 ID，唯一标识一个 TDSQL 实例</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID，唯一标识一个 TDSQL 实例</p>
     * @param InstanceId <p>实例 ID，唯一标识一个 TDSQL 实例</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>实例名称，用户可修改</p> 
     * @return InstanceName <p>实例名称，用户可修改</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称，用户可修改</p>
     * @param InstanceName <p>实例名称，用户可修改</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>实例所属应用 ID</p> 
     * @return AppId <p>实例所属应用 ID</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>实例所属应用 ID</p>
     * @param AppId <p>实例所属应用 ID</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>实例所属项目 ID</p> 
     * @return ProjectId <p>实例所属项目 ID</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>实例所属项目 ID</p>
     * @param ProjectId <p>实例所属项目 ID</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
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
     * Get <p>私有网络 ID，基础网络时为 0</p> 
     * @return VpcId <p>私有网络 ID，基础网络时为 0</p>
     */
    public Long getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>私有网络 ID，基础网络时为 0</p>
     * @param VpcId <p>私有网络 ID，基础网络时为 0</p>
     */
    public void setVpcId(Long VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>子网 ID，基础网络时为 0</p> 
     * @return SubnetId <p>子网 ID，基础网络时为 0</p>
     */
    public Long getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>子网 ID，基础网络时为 0</p>
     * @param SubnetId <p>子网 ID，基础网络时为 0</p>
     */
    public void setSubnetId(Long SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>实例状态：0 创建中，1 流程处理中， 2 运行中，3 实例未初始化，-1 实例已隔离，4 实例初始化中，5 实例删除中，6 实例重启中，7 数据迁移中</p> 
     * @return Status <p>实例状态：0 创建中，1 流程处理中， 2 运行中，3 实例未初始化，-1 实例已隔离，4 实例初始化中，5 实例删除中，6 实例重启中，7 数据迁移中</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>实例状态：0 创建中，1 流程处理中， 2 运行中，3 实例未初始化，-1 实例已隔离，4 实例初始化中，5 实例删除中，6 实例重启中，7 数据迁移中</p>
     * @param Status <p>实例状态：0 创建中，1 流程处理中， 2 运行中，3 实例未初始化，-1 实例已隔离，4 实例初始化中，5 实例删除中，6 实例重启中，7 数据迁移中</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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
     * Get <p>实例最后更新时间，格式为 2006-01-02 15:04:05</p> 
     * @return UpdateTime <p>实例最后更新时间，格式为 2006-01-02 15:04:05</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>实例最后更新时间，格式为 2006-01-02 15:04:05</p>
     * @param UpdateTime <p>实例最后更新时间，格式为 2006-01-02 15:04:05</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
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
     * Get <p>实例所属账号</p> 
     * @return Uin <p>实例所属账号</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>实例所属账号</p>
     * @param Uin <p>实例所属账号</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
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
     * Get <p>字符串型的私有网络ID</p> 
     * @return UniqueVpcId <p>字符串型的私有网络ID</p>
     */
    public String getUniqueVpcId() {
        return this.UniqueVpcId;
    }

    /**
     * Set <p>字符串型的私有网络ID</p>
     * @param UniqueVpcId <p>字符串型的私有网络ID</p>
     */
    public void setUniqueVpcId(String UniqueVpcId) {
        this.UniqueVpcId = UniqueVpcId;
    }

    /**
     * Get <p>字符串型的私有网络子网ID</p> 
     * @return UniqueSubnetId <p>字符串型的私有网络子网ID</p>
     */
    public String getUniqueSubnetId() {
        return this.UniqueSubnetId;
    }

    /**
     * Set <p>字符串型的私有网络子网ID</p>
     * @param UniqueSubnetId <p>字符串型的私有网络子网ID</p>
     */
    public void setUniqueSubnetId(String UniqueSubnetId) {
        this.UniqueSubnetId = UniqueSubnetId;
    }

    /**
     * Get <p>原始实例ID（过时字段，请勿依赖该值）</p> 
     * @return OriginSerialId <p>原始实例ID（过时字段，请勿依赖该值）</p>
     */
    public String getOriginSerialId() {
        return this.OriginSerialId;
    }

    /**
     * Set <p>原始实例ID（过时字段，请勿依赖该值）</p>
     * @param OriginSerialId <p>原始实例ID（过时字段，请勿依赖该值）</p>
     */
    public void setOriginSerialId(String OriginSerialId) {
        this.OriginSerialId = OriginSerialId;
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
     * Get <p>独享集群ID，为空表示为普通实例</p> 
     * @return ExclusterId <p>独享集群ID，为空表示为普通实例</p>
     */
    public String getExclusterId() {
        return this.ExclusterId;
    }

    /**
     * Set <p>独享集群ID，为空表示为普通实例</p>
     * @param ExclusterId <p>独享集群ID，为空表示为普通实例</p>
     */
    public void setExclusterId(String ExclusterId) {
        this.ExclusterId = ExclusterId;
    }

    /**
     * Get <p>数字实例ID（过时字段，请勿依赖该值）</p> 
     * @return Id <p>数字实例ID（过时字段，请勿依赖该值）</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>数字实例ID（过时字段，请勿依赖该值）</p>
     * @param Id <p>数字实例ID（过时字段，请勿依赖该值）</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>产品类型 ID</p> 
     * @return Pid <p>产品类型 ID</p>
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set <p>产品类型 ID</p>
     * @param Pid <p>产品类型 ID</p>
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get <p>最大 Qps 值</p> 
     * @return Qps <p>最大 Qps 值</p>
     */
    public Long getQps() {
        return this.Qps;
    }

    /**
     * Set <p>最大 Qps 值</p>
     * @param Qps <p>最大 Qps 值</p>
     */
    public void setQps(Long Qps) {
        this.Qps = Qps;
    }

    /**
     * Get <p>付费模式</p> 
     * @return Paymode <p>付费模式</p>
     */
    public String getPaymode() {
        return this.Paymode;
    }

    /**
     * Set <p>付费模式</p>
     * @param Paymode <p>付费模式</p>
     */
    public void setPaymode(String Paymode) {
        this.Paymode = Paymode;
    }

    /**
     * Get <p>实例处于异步任务时的异步任务流程ID</p> 
     * @return Locker <p>实例处于异步任务时的异步任务流程ID</p>
     */
    public Long getLocker() {
        return this.Locker;
    }

    /**
     * Set <p>实例处于异步任务时的异步任务流程ID</p>
     * @param Locker <p>实例处于异步任务时的异步任务流程ID</p>
     */
    public void setLocker(Long Locker) {
        this.Locker = Locker;
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
     * Get <p>外网状态，0-未开通；1-已开通；2-关闭；3-开通中</p> 
     * @return WanStatus <p>外网状态，0-未开通；1-已开通；2-关闭；3-开通中</p>
     */
    public Long getWanStatus() {
        return this.WanStatus;
    }

    /**
     * Set <p>外网状态，0-未开通；1-已开通；2-关闭；3-开通中</p>
     * @param WanStatus <p>外网状态，0-未开通；1-已开通；2-关闭；3-开通中</p>
     */
    public void setWanStatus(Long WanStatus) {
        this.WanStatus = WanStatus;
    }

    /**
     * Get <p>该实例是否支持审计。1-支持；0-不支持</p> 
     * @return IsAuditSupported <p>该实例是否支持审计。1-支持；0-不支持</p>
     */
    public Long getIsAuditSupported() {
        return this.IsAuditSupported;
    }

    /**
     * Set <p>该实例是否支持审计。1-支持；0-不支持</p>
     * @param IsAuditSupported <p>该实例是否支持审计。1-支持；0-不支持</p>
     */
    public void setIsAuditSupported(Long IsAuditSupported) {
        this.IsAuditSupported = IsAuditSupported;
    }

    /**
     * Get <p>机器型号</p> 
     * @return Machine <p>机器型号</p>
     */
    public String getMachine() {
        return this.Machine;
    }

    /**
     * Set <p>机器型号</p>
     * @param Machine <p>机器型号</p>
     */
    public void setMachine(String Machine) {
        this.Machine = Machine;
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
     * Get <p>实例CPU核数</p> 
     * @return Cpu <p>实例CPU核数</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>实例CPU核数</p>
     * @param Cpu <p>实例CPU核数</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>实例IPv6标志</p> 
     * @return Ipv6Flag <p>实例IPv6标志</p>
     */
    public Long getIpv6Flag() {
        return this.Ipv6Flag;
    }

    /**
     * Set <p>实例IPv6标志</p>
     * @param Ipv6Flag <p>实例IPv6标志</p>
     */
    public void setIpv6Flag(Long Ipv6Flag) {
        this.Ipv6Flag = Ipv6Flag;
    }

    /**
     * Get <p>内网IPv6</p> 
     * @return Vipv6 <p>内网IPv6</p>
     */
    public String getVipv6() {
        return this.Vipv6;
    }

    /**
     * Set <p>内网IPv6</p>
     * @param Vipv6 <p>内网IPv6</p>
     */
    public void setVipv6(String Vipv6) {
        this.Vipv6 = Vipv6;
    }

    /**
     * Get <p>外网IPv6</p> 
     * @return WanVipv6 <p>外网IPv6</p>
     */
    public String getWanVipv6() {
        return this.WanVipv6;
    }

    /**
     * Set <p>外网IPv6</p>
     * @param WanVipv6 <p>外网IPv6</p>
     */
    public void setWanVipv6(String WanVipv6) {
        this.WanVipv6 = WanVipv6;
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
     * Get <p>外网IPv6状态</p> 
     * @return WanStatusIpv6 <p>外网IPv6状态</p>
     */
    public Long getWanStatusIpv6() {
        return this.WanStatusIpv6;
    }

    /**
     * Set <p>外网IPv6状态</p>
     * @param WanStatusIpv6 <p>外网IPv6状态</p>
     */
    public void setWanStatusIpv6(Long WanStatusIpv6) {
        this.WanStatusIpv6 = WanStatusIpv6;
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
     * Get <p>实例标签信息</p> 
     * @return ResourceTags <p>实例标签信息</p>
     */
    public ResourceTag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set <p>实例标签信息</p>
     * @param ResourceTags <p>实例标签信息</p>
     */
    public void setResourceTags(ResourceTag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get <p>数据库版本</p> 
     * @return DbVersionId <p>数据库版本</p>
     */
    public String getDbVersionId() {
        return this.DbVersionId;
    }

    /**
     * Set <p>数据库版本</p>
     * @param DbVersionId <p>数据库版本</p>
     */
    public void setDbVersionId(String DbVersionId) {
        this.DbVersionId = DbVersionId;
    }

    /**
     * Get <p>实例删除保护标签，1: 已开启删除保护，0: 未开启删除保护</p> 
     * @return ProtectedProperty <p>实例删除保护标签，1: 已开启删除保护，0: 未开启删除保护</p>
     */
    public Long getProtectedProperty() {
        return this.ProtectedProperty;
    }

    /**
     * Set <p>实例删除保护标签，1: 已开启删除保护，0: 未开启删除保护</p>
     * @param ProtectedProperty <p>实例删除保护标签，1: 已开启删除保护，0: 未开启删除保护</p>
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

