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

public class DCDBInstanceInfo  extends AbstractModel{

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
    * APPID
    */
    @SerializedName("AppId")
    @Expose
    private Integer AppId;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;

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
    private Integer VpcId;

    /**
    * Subnet数字ID
    */
    @SerializedName("SubnetId")
    @Expose
    private Integer SubnetId;

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
    private Integer Status;

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
    private Integer Vport;

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
    private Integer AutoRenewFlag;

    /**
    * 内存大小，单位 GB
    */
    @SerializedName("Memory")
    @Expose
    private Integer Memory;

    /**
    * 存储大小，单位 GB
    */
    @SerializedName("Storage")
    @Expose
    private Integer Storage;

    /**
    * 分片个数
    */
    @SerializedName("ShardCount")
    @Expose
    private Integer ShardCount;

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
    private Integer NodeCount;

    /**
    * 临时实例标记，0 为非临时实例
    */
    @SerializedName("IsTmp")
    @Expose
    private Integer IsTmp;

    /**
    * 独享集群Id，为空表示非独享集群实例
    */
    @SerializedName("ExclusterId")
    @Expose
    private String ExclusterId;

    /**
    * 字符串型的私有网络Id
    */
    @SerializedName("UniqueVpcId")
    @Expose
    private String UniqueVpcId;

    /**
    * 字符串型的私有网络子网Id
    */
    @SerializedName("UniqueSubnetId")
    @Expose
    private String UniqueSubnetId;

    /**
    * 数字实例Id（过时字段，请勿依赖该值）
    */
    @SerializedName("Id")
    @Expose
    private Integer Id;

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
    private Integer WanPort;

    /**
    * 产品类型 Id（过时字段，请勿依赖该值）
    */
    @SerializedName("Pid")
    @Expose
    private Integer Pid;

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
    private Integer Locker;

    /**
    * 外网状态，0-未开通；1-已开通；2-关闭；3-开通中
    */
    @SerializedName("WanStatus")
    @Expose
    private Integer WanStatus;

    /**
    * 该实例是否支持审计。1-支持；0-不支持
    */
    @SerializedName("IsAuditSupported")
    @Expose
    private Integer IsAuditSupported;

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
     * 获取APPID
     * @return AppId APPID
     */
    public Integer getAppId() {
        return this.AppId;
    }

    /**
     * 设置APPID
     * @param AppId APPID
     */
    public void setAppId(Integer AppId) {
        this.AppId = AppId;
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
     * 获取地域
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * 设置地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * 获取可用区
     * @return Zone 可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * 设置可用区
     * @param Zone 可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * 获取VPC数字ID
     * @return VpcId VPC数字ID
     */
    public Integer getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置VPC数字ID
     * @param VpcId VPC数字ID
     */
    public void setVpcId(Integer VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取Subnet数字ID
     * @return SubnetId Subnet数字ID
     */
    public Integer getSubnetId() {
        return this.SubnetId;
    }

    /**
     * 设置Subnet数字ID
     * @param SubnetId Subnet数字ID
     */
    public void setSubnetId(Integer SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * 获取状态中文描述
     * @return StatusDesc 状态中文描述
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * 设置状态中文描述
     * @param StatusDesc 状态中文描述
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * 获取状态
     * @return Status 状态
     */
    public Integer getStatus() {
        return this.Status;
    }

    /**
     * 设置状态
     * @param Status 状态
     */
    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    /**
     * 获取内网IP
     * @return Vip 内网IP
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * 设置内网IP
     * @param Vip 内网IP
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * 获取内网端口
     * @return Vport 内网端口
     */
    public Integer getVport() {
        return this.Vport;
    }

    /**
     * 设置内网端口
     * @param Vport 内网端口
     */
    public void setVport(Integer Vport) {
        this.Vport = Vport;
    }

    /**
     * 获取创建时间
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取自动续费标志
     * @return AutoRenewFlag 自动续费标志
     */
    public Integer getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * 设置自动续费标志
     * @param AutoRenewFlag 自动续费标志
     */
    public void setAutoRenewFlag(Integer AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * 获取内存大小，单位 GB
     * @return Memory 内存大小，单位 GB
     */
    public Integer getMemory() {
        return this.Memory;
    }

    /**
     * 设置内存大小，单位 GB
     * @param Memory 内存大小，单位 GB
     */
    public void setMemory(Integer Memory) {
        this.Memory = Memory;
    }

    /**
     * 获取存储大小，单位 GB
     * @return Storage 存储大小，单位 GB
     */
    public Integer getStorage() {
        return this.Storage;
    }

    /**
     * 设置存储大小，单位 GB
     * @param Storage 存储大小，单位 GB
     */
    public void setStorage(Integer Storage) {
        this.Storage = Storage;
    }

    /**
     * 获取分片个数
     * @return ShardCount 分片个数
     */
    public Integer getShardCount() {
        return this.ShardCount;
    }

    /**
     * 设置分片个数
     * @param ShardCount 分片个数
     */
    public void setShardCount(Integer ShardCount) {
        this.ShardCount = ShardCount;
    }

    /**
     * 获取到期时间
     * @return PeriodEndTime 到期时间
     */
    public String getPeriodEndTime() {
        return this.PeriodEndTime;
    }

    /**
     * 设置到期时间
     * @param PeriodEndTime 到期时间
     */
    public void setPeriodEndTime(String PeriodEndTime) {
        this.PeriodEndTime = PeriodEndTime;
    }

    /**
     * 获取隔离时间
     * @return IsolatedTimestamp 隔离时间
     */
    public String getIsolatedTimestamp() {
        return this.IsolatedTimestamp;
    }

    /**
     * 设置隔离时间
     * @param IsolatedTimestamp 隔离时间
     */
    public void setIsolatedTimestamp(String IsolatedTimestamp) {
        this.IsolatedTimestamp = IsolatedTimestamp;
    }

    /**
     * 获取UIN
     * @return Uin UIN
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * 设置UIN
     * @param Uin UIN
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * 获取分片详情
     * @return ShardDetail 分片详情
     */
    public ShardInfo [] getShardDetail() {
        return this.ShardDetail;
    }

    /**
     * 设置分片详情
     * @param ShardDetail 分片详情
     */
    public void setShardDetail(ShardInfo [] ShardDetail) {
        this.ShardDetail = ShardDetail;
    }

    /**
     * 获取节点数，2 为一主一从， 3 为一主二从
     * @return NodeCount 节点数，2 为一主一从， 3 为一主二从
     */
    public Integer getNodeCount() {
        return this.NodeCount;
    }

    /**
     * 设置节点数，2 为一主一从， 3 为一主二从
     * @param NodeCount 节点数，2 为一主一从， 3 为一主二从
     */
    public void setNodeCount(Integer NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * 获取临时实例标记，0 为非临时实例
     * @return IsTmp 临时实例标记，0 为非临时实例
     */
    public Integer getIsTmp() {
        return this.IsTmp;
    }

    /**
     * 设置临时实例标记，0 为非临时实例
     * @param IsTmp 临时实例标记，0 为非临时实例
     */
    public void setIsTmp(Integer IsTmp) {
        this.IsTmp = IsTmp;
    }

    /**
     * 获取独享集群Id，为空表示非独享集群实例
     * @return ExclusterId 独享集群Id，为空表示非独享集群实例
     */
    public String getExclusterId() {
        return this.ExclusterId;
    }

    /**
     * 设置独享集群Id，为空表示非独享集群实例
     * @param ExclusterId 独享集群Id，为空表示非独享集群实例
     */
    public void setExclusterId(String ExclusterId) {
        this.ExclusterId = ExclusterId;
    }

    /**
     * 获取字符串型的私有网络Id
     * @return UniqueVpcId 字符串型的私有网络Id
     */
    public String getUniqueVpcId() {
        return this.UniqueVpcId;
    }

    /**
     * 设置字符串型的私有网络Id
     * @param UniqueVpcId 字符串型的私有网络Id
     */
    public void setUniqueVpcId(String UniqueVpcId) {
        this.UniqueVpcId = UniqueVpcId;
    }

    /**
     * 获取字符串型的私有网络子网Id
     * @return UniqueSubnetId 字符串型的私有网络子网Id
     */
    public String getUniqueSubnetId() {
        return this.UniqueSubnetId;
    }

    /**
     * 设置字符串型的私有网络子网Id
     * @param UniqueSubnetId 字符串型的私有网络子网Id
     */
    public void setUniqueSubnetId(String UniqueSubnetId) {
        this.UniqueSubnetId = UniqueSubnetId;
    }

    /**
     * 获取数字实例Id（过时字段，请勿依赖该值）
     * @return Id 数字实例Id（过时字段，请勿依赖该值）
     */
    public Integer getId() {
        return this.Id;
    }

    /**
     * 设置数字实例Id（过时字段，请勿依赖该值）
     * @param Id 数字实例Id（过时字段，请勿依赖该值）
     */
    public void setId(Integer Id) {
        this.Id = Id;
    }

    /**
     * 获取外网访问的域名，公网可解析
     * @return WanDomain 外网访问的域名，公网可解析
     */
    public String getWanDomain() {
        return this.WanDomain;
    }

    /**
     * 设置外网访问的域名，公网可解析
     * @param WanDomain 外网访问的域名，公网可解析
     */
    public void setWanDomain(String WanDomain) {
        this.WanDomain = WanDomain;
    }

    /**
     * 获取外网 IP 地址，公网可访问
     * @return WanVip 外网 IP 地址，公网可访问
     */
    public String getWanVip() {
        return this.WanVip;
    }

    /**
     * 设置外网 IP 地址，公网可访问
     * @param WanVip 外网 IP 地址，公网可访问
     */
    public void setWanVip(String WanVip) {
        this.WanVip = WanVip;
    }

    /**
     * 获取外网端口
     * @return WanPort 外网端口
     */
    public Integer getWanPort() {
        return this.WanPort;
    }

    /**
     * 设置外网端口
     * @param WanPort 外网端口
     */
    public void setWanPort(Integer WanPort) {
        this.WanPort = WanPort;
    }

    /**
     * 获取产品类型 Id（过时字段，请勿依赖该值）
     * @return Pid 产品类型 Id（过时字段，请勿依赖该值）
     */
    public Integer getPid() {
        return this.Pid;
    }

    /**
     * 设置产品类型 Id（过时字段，请勿依赖该值）
     * @param Pid 产品类型 Id（过时字段，请勿依赖该值）
     */
    public void setPid(Integer Pid) {
        this.Pid = Pid;
    }

    /**
     * 获取实例最后更新时间，格式为 2006-01-02 15:04:05
     * @return UpdateTime 实例最后更新时间，格式为 2006-01-02 15:04:05
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * 设置实例最后更新时间，格式为 2006-01-02 15:04:05
     * @param UpdateTime 实例最后更新时间，格式为 2006-01-02 15:04:05
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * 获取数据库引擎
     * @return DbEngine 数据库引擎
     */
    public String getDbEngine() {
        return this.DbEngine;
    }

    /**
     * 设置数据库引擎
     * @param DbEngine 数据库引擎
     */
    public void setDbEngine(String DbEngine) {
        this.DbEngine = DbEngine;
    }

    /**
     * 获取数据库引擎版本
     * @return DbVersion 数据库引擎版本
     */
    public String getDbVersion() {
        return this.DbVersion;
    }

    /**
     * 设置数据库引擎版本
     * @param DbVersion 数据库引擎版本
     */
    public void setDbVersion(String DbVersion) {
        this.DbVersion = DbVersion;
    }

    /**
     * 获取付费模式
     * @return Paymode 付费模式
     */
    public String getPaymode() {
        return this.Paymode;
    }

    /**
     * 设置付费模式
     * @param Paymode 付费模式
     */
    public void setPaymode(String Paymode) {
        this.Paymode = Paymode;
    }

    /**
     * 获取实例处于异步任务状态时，表示异步任务流程ID
注意：此字段可能返回 null，表示取不到有效值。
     * @return Locker 实例处于异步任务状态时，表示异步任务流程ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getLocker() {
        return this.Locker;
    }

    /**
     * 设置实例处于异步任务状态时，表示异步任务流程ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Locker 实例处于异步任务状态时，表示异步任务流程ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocker(Integer Locker) {
        this.Locker = Locker;
    }

    /**
     * 获取外网状态，0-未开通；1-已开通；2-关闭；3-开通中
     * @return WanStatus 外网状态，0-未开通；1-已开通；2-关闭；3-开通中
     */
    public Integer getWanStatus() {
        return this.WanStatus;
    }

    /**
     * 设置外网状态，0-未开通；1-已开通；2-关闭；3-开通中
     * @param WanStatus 外网状态，0-未开通；1-已开通；2-关闭；3-开通中
     */
    public void setWanStatus(Integer WanStatus) {
        this.WanStatus = WanStatus;
    }

    /**
     * 获取该实例是否支持审计。1-支持；0-不支持
     * @return IsAuditSupported 该实例是否支持审计。1-支持；0-不支持
     */
    public Integer getIsAuditSupported() {
        return this.IsAuditSupported;
    }

    /**
     * 设置该实例是否支持审计。1-支持；0-不支持
     * @param IsAuditSupported 该实例是否支持审计。1-支持；0-不支持
     */
    public void setIsAuditSupported(Integer IsAuditSupported) {
        this.IsAuditSupported = IsAuditSupported;
    }

    /**
     * 内部实现，用户禁止调用
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

    }
}

