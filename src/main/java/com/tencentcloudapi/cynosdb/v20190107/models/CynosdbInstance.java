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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CynosdbInstance extends AbstractModel {

    /**
    * 用户Uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 用户AppId
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

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
    * 实例状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 实例状态中文描述
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * 实例形态，是否为serverless实例
    */
    @SerializedName("DbMode")
    @Expose
    private String DbMode;

    /**
    * 数据库类型
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * 数据库版本
    */
    @SerializedName("DbVersion")
    @Expose
    private String DbVersion;

    /**
    * Cpu，单位：核
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 内存，单位：GB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 存储量，单位：GB
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * 实例类型
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 实例当前角色
    */
    @SerializedName("InstanceRole")
    @Expose
    private String InstanceRole;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * VPC网络ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 实例内网IP
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 实例内网端口
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * 付费模式
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 实例过期时间
    */
    @SerializedName("PeriodEndTime")
    @Expose
    private String PeriodEndTime;

    /**
    * 销毁期限
    */
    @SerializedName("DestroyDeadlineText")
    @Expose
    private String DestroyDeadlineText;

    /**
    * 隔离时间
    */
    @SerializedName("IsolateTime")
    @Expose
    private String IsolateTime;

    /**
    * 网络类型
    */
    @SerializedName("NetType")
    @Expose
    private Long NetType;

    /**
    * 外网域名
    */
    @SerializedName("WanDomain")
    @Expose
    private String WanDomain;

    /**
    * 外网IP
    */
    @SerializedName("WanIP")
    @Expose
    private String WanIP;

    /**
    * 外网端口
    */
    @SerializedName("WanPort")
    @Expose
    private Long WanPort;

    /**
    * 外网状态
    */
    @SerializedName("WanStatus")
    @Expose
    private String WanStatus;

    /**
    * 实例销毁时间
    */
    @SerializedName("DestroyTime")
    @Expose
    private String DestroyTime;

    /**
    * Cynos内核版本
    */
    @SerializedName("CynosVersion")
    @Expose
    private String CynosVersion;

    /**
    * 正在处理的任务
    */
    @SerializedName("ProcessingTask")
    @Expose
    private String ProcessingTask;

    /**
    * 续费标志
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * serverless实例cpu下限
    */
    @SerializedName("MinCpu")
    @Expose
    private Float MinCpu;

    /**
    * serverless实例cpu上限
    */
    @SerializedName("MaxCpu")
    @Expose
    private Float MaxCpu;

    /**
    * serverless实例状态, 可选值：
resume
pause
    */
    @SerializedName("ServerlessStatus")
    @Expose
    private String ServerlessStatus;

    /**
    * 预付费存储Id
    */
    @SerializedName("StorageId")
    @Expose
    private String StorageId;

    /**
    * 存储付费类型
    */
    @SerializedName("StoragePayMode")
    @Expose
    private Long StoragePayMode;

    /**
    * 物理区
    */
    @SerializedName("PhysicalZone")
    @Expose
    private String PhysicalZone;

    /**
    * 商业类型
    */
    @SerializedName("BusinessType")
    @Expose
    private String BusinessType;

    /**
    * 任务
    */
    @SerializedName("Tasks")
    @Expose
    private ObjectTask [] Tasks;

    /**
    * 是否冻结
    */
    @SerializedName("IsFreeze")
    @Expose
    private String IsFreeze;

    /**
    * 资源标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceTags")
    @Expose
    private Tag [] ResourceTags;

    /**
    * 主可用区
    */
    @SerializedName("MasterZone")
    @Expose
    private String MasterZone;

    /**
    * 备可用区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SlaveZones")
    @Expose
    private String [] SlaveZones;

    /**
    * 实例网络信息
    */
    @SerializedName("InstanceNetInfo")
    @Expose
    private InstanceNetInfo [] InstanceNetInfo;

    /**
    * 实例绑定资源包信息（此处只返回计算资源包，即packageType=CCU）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourcePackages")
    @Expose
    private ResourcePackage [] ResourcePackages;

    /**
    * 实例索引形态,可选值【mixedRowColumn（行列混存），onlyRowIndex（仅行存）】
    */
    @SerializedName("InstanceIndexMode")
    @Expose
    private String InstanceIndexMode;

    /**
    * 当前实例支持的能力
    */
    @SerializedName("InstanceAbility")
    @Expose
    private InstanceAbility InstanceAbility;

    /**
    * 实例机器类型
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * 实例存储类型
    */
    @SerializedName("InstanceStorageType")
    @Expose
    private String InstanceStorageType;

    /**
    * 未知字段
    */
    @SerializedName("CynosVersionTag")
    @Expose
    private String CynosVersionTag;

    /**
    * libradb 节点信息
    */
    @SerializedName("NodeList")
    @Expose
    private String [] NodeList;

    /**
    * 全球数据库唯一标识
    */
    @SerializedName("GdnId")
    @Expose
    private String GdnId;

    /**
     * Get 用户Uin 
     * @return Uin 用户Uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 用户Uin
     * @param Uin 用户Uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 用户AppId 
     * @return AppId 用户AppId
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户AppId
     * @param AppId 用户AppId
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 集群名称 
     * @return ClusterName 集群名称
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名称
     * @param ClusterName 集群名称
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

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
     * Get 实例状态 
     * @return Status 实例状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 实例状态
     * @param Status 实例状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 实例状态中文描述 
     * @return StatusDesc 实例状态中文描述
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set 实例状态中文描述
     * @param StatusDesc 实例状态中文描述
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get 实例形态，是否为serverless实例 
     * @return DbMode 实例形态，是否为serverless实例
     */
    public String getDbMode() {
        return this.DbMode;
    }

    /**
     * Set 实例形态，是否为serverless实例
     * @param DbMode 实例形态，是否为serverless实例
     */
    public void setDbMode(String DbMode) {
        this.DbMode = DbMode;
    }

    /**
     * Get 数据库类型 
     * @return DbType 数据库类型
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set 数据库类型
     * @param DbType 数据库类型
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
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
     * Get Cpu，单位：核 
     * @return Cpu Cpu，单位：核
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Cpu，单位：核
     * @param Cpu Cpu，单位：核
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存，单位：GB 
     * @return Memory 内存，单位：GB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存，单位：GB
     * @param Memory 内存，单位：GB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 存储量，单位：GB 
     * @return Storage 存储量，单位：GB
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set 存储量，单位：GB
     * @param Storage 存储量，单位：GB
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get 实例类型 
     * @return InstanceType 实例类型
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型
     * @param InstanceType 实例类型
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 实例当前角色 
     * @return InstanceRole 实例当前角色
     */
    public String getInstanceRole() {
        return this.InstanceRole;
    }

    /**
     * Set 实例当前角色
     * @param InstanceRole 实例当前角色
     */
    public void setInstanceRole(String InstanceRole) {
        this.InstanceRole = InstanceRole;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
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
     * Get VPC网络ID 
     * @return VpcId VPC网络ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC网络ID
     * @param VpcId VPC网络ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网ID 
     * @return SubnetId 子网ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID
     * @param SubnetId 子网ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 实例内网IP 
     * @return Vip 实例内网IP
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 实例内网IP
     * @param Vip 实例内网IP
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 实例内网端口 
     * @return Vport 实例内网端口
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set 实例内网端口
     * @param Vport 实例内网端口
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get 付费模式 
     * @return PayMode 付费模式
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费模式
     * @param PayMode 付费模式
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 实例过期时间 
     * @return PeriodEndTime 实例过期时间
     */
    public String getPeriodEndTime() {
        return this.PeriodEndTime;
    }

    /**
     * Set 实例过期时间
     * @param PeriodEndTime 实例过期时间
     */
    public void setPeriodEndTime(String PeriodEndTime) {
        this.PeriodEndTime = PeriodEndTime;
    }

    /**
     * Get 销毁期限 
     * @return DestroyDeadlineText 销毁期限
     */
    public String getDestroyDeadlineText() {
        return this.DestroyDeadlineText;
    }

    /**
     * Set 销毁期限
     * @param DestroyDeadlineText 销毁期限
     */
    public void setDestroyDeadlineText(String DestroyDeadlineText) {
        this.DestroyDeadlineText = DestroyDeadlineText;
    }

    /**
     * Get 隔离时间 
     * @return IsolateTime 隔离时间
     */
    public String getIsolateTime() {
        return this.IsolateTime;
    }

    /**
     * Set 隔离时间
     * @param IsolateTime 隔离时间
     */
    public void setIsolateTime(String IsolateTime) {
        this.IsolateTime = IsolateTime;
    }

    /**
     * Get 网络类型 
     * @return NetType 网络类型
     */
    public Long getNetType() {
        return this.NetType;
    }

    /**
     * Set 网络类型
     * @param NetType 网络类型
     */
    public void setNetType(Long NetType) {
        this.NetType = NetType;
    }

    /**
     * Get 外网域名 
     * @return WanDomain 外网域名
     */
    public String getWanDomain() {
        return this.WanDomain;
    }

    /**
     * Set 外网域名
     * @param WanDomain 外网域名
     */
    public void setWanDomain(String WanDomain) {
        this.WanDomain = WanDomain;
    }

    /**
     * Get 外网IP 
     * @return WanIP 外网IP
     */
    public String getWanIP() {
        return this.WanIP;
    }

    /**
     * Set 外网IP
     * @param WanIP 外网IP
     */
    public void setWanIP(String WanIP) {
        this.WanIP = WanIP;
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
     * Get 外网状态 
     * @return WanStatus 外网状态
     */
    public String getWanStatus() {
        return this.WanStatus;
    }

    /**
     * Set 外网状态
     * @param WanStatus 外网状态
     */
    public void setWanStatus(String WanStatus) {
        this.WanStatus = WanStatus;
    }

    /**
     * Get 实例销毁时间 
     * @return DestroyTime 实例销毁时间
     */
    public String getDestroyTime() {
        return this.DestroyTime;
    }

    /**
     * Set 实例销毁时间
     * @param DestroyTime 实例销毁时间
     */
    public void setDestroyTime(String DestroyTime) {
        this.DestroyTime = DestroyTime;
    }

    /**
     * Get Cynos内核版本 
     * @return CynosVersion Cynos内核版本
     */
    public String getCynosVersion() {
        return this.CynosVersion;
    }

    /**
     * Set Cynos内核版本
     * @param CynosVersion Cynos内核版本
     */
    public void setCynosVersion(String CynosVersion) {
        this.CynosVersion = CynosVersion;
    }

    /**
     * Get 正在处理的任务 
     * @return ProcessingTask 正在处理的任务
     */
    public String getProcessingTask() {
        return this.ProcessingTask;
    }

    /**
     * Set 正在处理的任务
     * @param ProcessingTask 正在处理的任务
     */
    public void setProcessingTask(String ProcessingTask) {
        this.ProcessingTask = ProcessingTask;
    }

    /**
     * Get 续费标志 
     * @return RenewFlag 续费标志
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 续费标志
     * @param RenewFlag 续费标志
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get serverless实例cpu下限 
     * @return MinCpu serverless实例cpu下限
     */
    public Float getMinCpu() {
        return this.MinCpu;
    }

    /**
     * Set serverless实例cpu下限
     * @param MinCpu serverless实例cpu下限
     */
    public void setMinCpu(Float MinCpu) {
        this.MinCpu = MinCpu;
    }

    /**
     * Get serverless实例cpu上限 
     * @return MaxCpu serverless实例cpu上限
     */
    public Float getMaxCpu() {
        return this.MaxCpu;
    }

    /**
     * Set serverless实例cpu上限
     * @param MaxCpu serverless实例cpu上限
     */
    public void setMaxCpu(Float MaxCpu) {
        this.MaxCpu = MaxCpu;
    }

    /**
     * Get serverless实例状态, 可选值：
resume
pause 
     * @return ServerlessStatus serverless实例状态, 可选值：
resume
pause
     */
    public String getServerlessStatus() {
        return this.ServerlessStatus;
    }

    /**
     * Set serverless实例状态, 可选值：
resume
pause
     * @param ServerlessStatus serverless实例状态, 可选值：
resume
pause
     */
    public void setServerlessStatus(String ServerlessStatus) {
        this.ServerlessStatus = ServerlessStatus;
    }

    /**
     * Get 预付费存储Id 
     * @return StorageId 预付费存储Id
     */
    public String getStorageId() {
        return this.StorageId;
    }

    /**
     * Set 预付费存储Id
     * @param StorageId 预付费存储Id
     */
    public void setStorageId(String StorageId) {
        this.StorageId = StorageId;
    }

    /**
     * Get 存储付费类型 
     * @return StoragePayMode 存储付费类型
     */
    public Long getStoragePayMode() {
        return this.StoragePayMode;
    }

    /**
     * Set 存储付费类型
     * @param StoragePayMode 存储付费类型
     */
    public void setStoragePayMode(Long StoragePayMode) {
        this.StoragePayMode = StoragePayMode;
    }

    /**
     * Get 物理区 
     * @return PhysicalZone 物理区
     */
    public String getPhysicalZone() {
        return this.PhysicalZone;
    }

    /**
     * Set 物理区
     * @param PhysicalZone 物理区
     */
    public void setPhysicalZone(String PhysicalZone) {
        this.PhysicalZone = PhysicalZone;
    }

    /**
     * Get 商业类型 
     * @return BusinessType 商业类型
     */
    public String getBusinessType() {
        return this.BusinessType;
    }

    /**
     * Set 商业类型
     * @param BusinessType 商业类型
     */
    public void setBusinessType(String BusinessType) {
        this.BusinessType = BusinessType;
    }

    /**
     * Get 任务 
     * @return Tasks 任务
     */
    public ObjectTask [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set 任务
     * @param Tasks 任务
     */
    public void setTasks(ObjectTask [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get 是否冻结 
     * @return IsFreeze 是否冻结
     */
    public String getIsFreeze() {
        return this.IsFreeze;
    }

    /**
     * Set 是否冻结
     * @param IsFreeze 是否冻结
     */
    public void setIsFreeze(String IsFreeze) {
        this.IsFreeze = IsFreeze;
    }

    /**
     * Get 资源标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceTags 资源标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set 资源标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceTags 资源标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceTags(Tag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get 主可用区 
     * @return MasterZone 主可用区
     */
    public String getMasterZone() {
        return this.MasterZone;
    }

    /**
     * Set 主可用区
     * @param MasterZone 主可用区
     */
    public void setMasterZone(String MasterZone) {
        this.MasterZone = MasterZone;
    }

    /**
     * Get 备可用区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SlaveZones 备可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSlaveZones() {
        return this.SlaveZones;
    }

    /**
     * Set 备可用区
注意：此字段可能返回 null，表示取不到有效值。
     * @param SlaveZones 备可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSlaveZones(String [] SlaveZones) {
        this.SlaveZones = SlaveZones;
    }

    /**
     * Get 实例网络信息 
     * @return InstanceNetInfo 实例网络信息
     */
    public InstanceNetInfo [] getInstanceNetInfo() {
        return this.InstanceNetInfo;
    }

    /**
     * Set 实例网络信息
     * @param InstanceNetInfo 实例网络信息
     */
    public void setInstanceNetInfo(InstanceNetInfo [] InstanceNetInfo) {
        this.InstanceNetInfo = InstanceNetInfo;
    }

    /**
     * Get 实例绑定资源包信息（此处只返回计算资源包，即packageType=CCU）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourcePackages 实例绑定资源包信息（此处只返回计算资源包，即packageType=CCU）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourcePackage [] getResourcePackages() {
        return this.ResourcePackages;
    }

    /**
     * Set 实例绑定资源包信息（此处只返回计算资源包，即packageType=CCU）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourcePackages 实例绑定资源包信息（此处只返回计算资源包，即packageType=CCU）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourcePackages(ResourcePackage [] ResourcePackages) {
        this.ResourcePackages = ResourcePackages;
    }

    /**
     * Get 实例索引形态,可选值【mixedRowColumn（行列混存），onlyRowIndex（仅行存）】 
     * @return InstanceIndexMode 实例索引形态,可选值【mixedRowColumn（行列混存），onlyRowIndex（仅行存）】
     */
    public String getInstanceIndexMode() {
        return this.InstanceIndexMode;
    }

    /**
     * Set 实例索引形态,可选值【mixedRowColumn（行列混存），onlyRowIndex（仅行存）】
     * @param InstanceIndexMode 实例索引形态,可选值【mixedRowColumn（行列混存），onlyRowIndex（仅行存）】
     */
    public void setInstanceIndexMode(String InstanceIndexMode) {
        this.InstanceIndexMode = InstanceIndexMode;
    }

    /**
     * Get 当前实例支持的能力 
     * @return InstanceAbility 当前实例支持的能力
     */
    public InstanceAbility getInstanceAbility() {
        return this.InstanceAbility;
    }

    /**
     * Set 当前实例支持的能力
     * @param InstanceAbility 当前实例支持的能力
     */
    public void setInstanceAbility(InstanceAbility InstanceAbility) {
        this.InstanceAbility = InstanceAbility;
    }

    /**
     * Get 实例机器类型 
     * @return DeviceType 实例机器类型
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 实例机器类型
     * @param DeviceType 实例机器类型
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get 实例存储类型 
     * @return InstanceStorageType 实例存储类型
     */
    public String getInstanceStorageType() {
        return this.InstanceStorageType;
    }

    /**
     * Set 实例存储类型
     * @param InstanceStorageType 实例存储类型
     */
    public void setInstanceStorageType(String InstanceStorageType) {
        this.InstanceStorageType = InstanceStorageType;
    }

    /**
     * Get 未知字段 
     * @return CynosVersionTag 未知字段
     */
    public String getCynosVersionTag() {
        return this.CynosVersionTag;
    }

    /**
     * Set 未知字段
     * @param CynosVersionTag 未知字段
     */
    public void setCynosVersionTag(String CynosVersionTag) {
        this.CynosVersionTag = CynosVersionTag;
    }

    /**
     * Get libradb 节点信息 
     * @return NodeList libradb 节点信息
     */
    public String [] getNodeList() {
        return this.NodeList;
    }

    /**
     * Set libradb 节点信息
     * @param NodeList libradb 节点信息
     */
    public void setNodeList(String [] NodeList) {
        this.NodeList = NodeList;
    }

    /**
     * Get 全球数据库唯一标识 
     * @return GdnId 全球数据库唯一标识
     */
    public String getGdnId() {
        return this.GdnId;
    }

    /**
     * Set 全球数据库唯一标识
     * @param GdnId 全球数据库唯一标识
     */
    public void setGdnId(String GdnId) {
        this.GdnId = GdnId;
    }

    public CynosdbInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CynosdbInstance(CynosdbInstance source) {
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
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
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.DbMode != null) {
            this.DbMode = new String(source.DbMode);
        }
        if (source.DbType != null) {
            this.DbType = new String(source.DbType);
        }
        if (source.DbVersion != null) {
            this.DbVersion = new String(source.DbVersion);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceRole != null) {
            this.InstanceRole = new String(source.InstanceRole);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.PeriodEndTime != null) {
            this.PeriodEndTime = new String(source.PeriodEndTime);
        }
        if (source.DestroyDeadlineText != null) {
            this.DestroyDeadlineText = new String(source.DestroyDeadlineText);
        }
        if (source.IsolateTime != null) {
            this.IsolateTime = new String(source.IsolateTime);
        }
        if (source.NetType != null) {
            this.NetType = new Long(source.NetType);
        }
        if (source.WanDomain != null) {
            this.WanDomain = new String(source.WanDomain);
        }
        if (source.WanIP != null) {
            this.WanIP = new String(source.WanIP);
        }
        if (source.WanPort != null) {
            this.WanPort = new Long(source.WanPort);
        }
        if (source.WanStatus != null) {
            this.WanStatus = new String(source.WanStatus);
        }
        if (source.DestroyTime != null) {
            this.DestroyTime = new String(source.DestroyTime);
        }
        if (source.CynosVersion != null) {
            this.CynosVersion = new String(source.CynosVersion);
        }
        if (source.ProcessingTask != null) {
            this.ProcessingTask = new String(source.ProcessingTask);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.MinCpu != null) {
            this.MinCpu = new Float(source.MinCpu);
        }
        if (source.MaxCpu != null) {
            this.MaxCpu = new Float(source.MaxCpu);
        }
        if (source.ServerlessStatus != null) {
            this.ServerlessStatus = new String(source.ServerlessStatus);
        }
        if (source.StorageId != null) {
            this.StorageId = new String(source.StorageId);
        }
        if (source.StoragePayMode != null) {
            this.StoragePayMode = new Long(source.StoragePayMode);
        }
        if (source.PhysicalZone != null) {
            this.PhysicalZone = new String(source.PhysicalZone);
        }
        if (source.BusinessType != null) {
            this.BusinessType = new String(source.BusinessType);
        }
        if (source.Tasks != null) {
            this.Tasks = new ObjectTask[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new ObjectTask(source.Tasks[i]);
            }
        }
        if (source.IsFreeze != null) {
            this.IsFreeze = new String(source.IsFreeze);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new Tag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new Tag(source.ResourceTags[i]);
            }
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
        if (source.InstanceNetInfo != null) {
            this.InstanceNetInfo = new InstanceNetInfo[source.InstanceNetInfo.length];
            for (int i = 0; i < source.InstanceNetInfo.length; i++) {
                this.InstanceNetInfo[i] = new InstanceNetInfo(source.InstanceNetInfo[i]);
            }
        }
        if (source.ResourcePackages != null) {
            this.ResourcePackages = new ResourcePackage[source.ResourcePackages.length];
            for (int i = 0; i < source.ResourcePackages.length; i++) {
                this.ResourcePackages[i] = new ResourcePackage(source.ResourcePackages[i]);
            }
        }
        if (source.InstanceIndexMode != null) {
            this.InstanceIndexMode = new String(source.InstanceIndexMode);
        }
        if (source.InstanceAbility != null) {
            this.InstanceAbility = new InstanceAbility(source.InstanceAbility);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.InstanceStorageType != null) {
            this.InstanceStorageType = new String(source.InstanceStorageType);
        }
        if (source.CynosVersionTag != null) {
            this.CynosVersionTag = new String(source.CynosVersionTag);
        }
        if (source.NodeList != null) {
            this.NodeList = new String[source.NodeList.length];
            for (int i = 0; i < source.NodeList.length; i++) {
                this.NodeList[i] = new String(source.NodeList[i]);
            }
        }
        if (source.GdnId != null) {
            this.GdnId = new String(source.GdnId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "DbMode", this.DbMode);
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamSimple(map, prefix + "DbVersion", this.DbVersion);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceRole", this.InstanceRole);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "PeriodEndTime", this.PeriodEndTime);
        this.setParamSimple(map, prefix + "DestroyDeadlineText", this.DestroyDeadlineText);
        this.setParamSimple(map, prefix + "IsolateTime", this.IsolateTime);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "WanDomain", this.WanDomain);
        this.setParamSimple(map, prefix + "WanIP", this.WanIP);
        this.setParamSimple(map, prefix + "WanPort", this.WanPort);
        this.setParamSimple(map, prefix + "WanStatus", this.WanStatus);
        this.setParamSimple(map, prefix + "DestroyTime", this.DestroyTime);
        this.setParamSimple(map, prefix + "CynosVersion", this.CynosVersion);
        this.setParamSimple(map, prefix + "ProcessingTask", this.ProcessingTask);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "MinCpu", this.MinCpu);
        this.setParamSimple(map, prefix + "MaxCpu", this.MaxCpu);
        this.setParamSimple(map, prefix + "ServerlessStatus", this.ServerlessStatus);
        this.setParamSimple(map, prefix + "StorageId", this.StorageId);
        this.setParamSimple(map, prefix + "StoragePayMode", this.StoragePayMode);
        this.setParamSimple(map, prefix + "PhysicalZone", this.PhysicalZone);
        this.setParamSimple(map, prefix + "BusinessType", this.BusinessType);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "IsFreeze", this.IsFreeze);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "MasterZone", this.MasterZone);
        this.setParamArraySimple(map, prefix + "SlaveZones.", this.SlaveZones);
        this.setParamArrayObj(map, prefix + "InstanceNetInfo.", this.InstanceNetInfo);
        this.setParamArrayObj(map, prefix + "ResourcePackages.", this.ResourcePackages);
        this.setParamSimple(map, prefix + "InstanceIndexMode", this.InstanceIndexMode);
        this.setParamObj(map, prefix + "InstanceAbility.", this.InstanceAbility);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "InstanceStorageType", this.InstanceStorageType);
        this.setParamSimple(map, prefix + "CynosVersionTag", this.CynosVersionTag);
        this.setParamArraySimple(map, prefix + "NodeList.", this.NodeList);
        this.setParamSimple(map, prefix + "GdnId", this.GdnId);

    }
}

