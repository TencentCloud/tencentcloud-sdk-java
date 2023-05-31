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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CynosdbCluster extends AbstractModel{

    /**
    * 集群状态， 可选值如下:
creating: 创建中
running:运行中
isolating:隔离中
isolated:已隔离
activating:解隔离中
offlining:下线中
offlined:已下线
deleting:删除中
deleted:已删除
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 数据库版本
    */
    @SerializedName("DbVersion")
    @Expose
    private String DbVersion;

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 实例数
    */
    @SerializedName("InstanceNum")
    @Expose
    private Long InstanceNum;

    /**
    * 用户uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 引擎类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * 用户appid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 集群状态描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * 集群创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 付费模式。0-按量计费，1-包年包月
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 截止时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PeriodEndTime")
    @Expose
    private String PeriodEndTime;

    /**
    * 集群读写vip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 集群读写vport
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * 项目id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectID")
    @Expose
    private Long ProjectID;

    /**
    * 私有网络ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * cynos内核版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CynosVersion")
    @Expose
    private String CynosVersion;

    /**
    * 存储容量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageLimit")
    @Expose
    private Long StorageLimit;

    /**
    * 续费标志
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * 正在处理的任务
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcessingTask")
    @Expose
    private String ProcessingTask;

    /**
    * 集群的任务数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tasks")
    @Expose
    private ObjectTask [] Tasks;

    /**
    * 集群绑定的tag数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceTags")
    @Expose
    private Tag [] ResourceTags;

    /**
    * Db类型(NORMAL, SERVERLESS)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DbMode")
    @Expose
    private String DbMode;

    /**
    * 当Db类型为SERVERLESS时，serverless集群状态，可选值:
resume
pause
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServerlessStatus")
    @Expose
    private String ServerlessStatus;

    /**
    * 集群预付费存储值大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * 集群存储为预付费时的存储ID，用于预付费存储变配
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageId")
    @Expose
    private String StorageId;

    /**
    * 集群存储付费模式。0-按量计费，1-包年包月
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StoragePayMode")
    @Expose
    private Long StoragePayMode;

    /**
    * 集群计算规格对应的最小存储值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MinStorageSize")
    @Expose
    private Long MinStorageSize;

    /**
    * 集群计算规格对应的最大存储值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxStorageSize")
    @Expose
    private Long MaxStorageSize;

    /**
    * 集群网络信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetAddrs")
    @Expose
    private NetAddr [] NetAddrs;

    /**
    * 物理可用区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PhysicalZone")
    @Expose
    private String PhysicalZone;

    /**
    * 主可用区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MasterZone")
    @Expose
    private String MasterZone;

    /**
    * 是否有从可用区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HasSlaveZone")
    @Expose
    private String HasSlaveZone;

    /**
    * 从可用区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SlaveZones")
    @Expose
    private String [] SlaveZones;

    /**
    * 商业类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BusinessType")
    @Expose
    private String BusinessType;

    /**
    * 是否冻结
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsFreeze")
    @Expose
    private String IsFreeze;

    /**
    * 订单来源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrderSource")
    @Expose
    private String OrderSource;

    /**
    * 能力
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ability")
    @Expose
    private Ability Ability;

    /**
    * 实例绑定资源包信息（此处只返回存储资源包，即packageType=DISK）	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourcePackages")
    @Expose
    private ResourcePackage [] ResourcePackages;

    /**
     * Get 集群状态， 可选值如下:
creating: 创建中
running:运行中
isolating:隔离中
isolated:已隔离
activating:解隔离中
offlining:下线中
offlined:已下线
deleting:删除中
deleted:已删除 
     * @return Status 集群状态， 可选值如下:
creating: 创建中
running:运行中
isolating:隔离中
isolated:已隔离
activating:解隔离中
offlining:下线中
offlined:已下线
deleting:删除中
deleted:已删除
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 集群状态， 可选值如下:
creating: 创建中
running:运行中
isolating:隔离中
isolated:已隔离
activating:解隔离中
offlining:下线中
offlined:已下线
deleting:删除中
deleted:已删除
     * @param Status 集群状态， 可选值如下:
creating: 创建中
running:运行中
isolating:隔离中
isolated:已隔离
activating:解隔离中
offlining:下线中
offlined:已下线
deleting:删除中
deleted:已删除
     */
    public void setStatus(String Status) {
        this.Status = Status;
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
     * Get 实例数 
     * @return InstanceNum 实例数
     */
    public Long getInstanceNum() {
        return this.InstanceNum;
    }

    /**
     * Set 实例数
     * @param InstanceNum 实例数
     */
    public void setInstanceNum(Long InstanceNum) {
        this.InstanceNum = InstanceNum;
    }

    /**
     * Get 用户uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uin 用户uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 用户uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uin 用户uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 引擎类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DbType 引擎类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set 引擎类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param DbType 引擎类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get 用户appid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId 用户appid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户appid
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId 用户appid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 集群状态描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusDesc 集群状态描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set 集群状态描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusDesc 集群状态描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get 集群创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 集群创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 集群创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 集群创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 付费模式。0-按量计费，1-包年包月
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayMode 付费模式。0-按量计费，1-包年包月
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费模式。0-按量计费，1-包年包月
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayMode 付费模式。0-按量计费，1-包年包月
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 截止时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PeriodEndTime 截止时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPeriodEndTime() {
        return this.PeriodEndTime;
    }

    /**
     * Set 截止时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param PeriodEndTime 截止时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeriodEndTime(String PeriodEndTime) {
        this.PeriodEndTime = PeriodEndTime;
    }

    /**
     * Get 集群读写vip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vip 集群读写vip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 集群读写vip
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vip 集群读写vip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 集群读写vport
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vport 集群读写vport
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set 集群读写vport
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vport 集群读写vport
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get 项目id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectID 项目id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProjectID() {
        return this.ProjectID;
    }

    /**
     * Set 项目id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectID 项目id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectID(Long ProjectID) {
        this.ProjectID = ProjectID;
    }

    /**
     * Get 私有网络ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId 私有网络ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId 私有网络ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get cynos内核版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CynosVersion cynos内核版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCynosVersion() {
        return this.CynosVersion;
    }

    /**
     * Set cynos内核版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param CynosVersion cynos内核版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCynosVersion(String CynosVersion) {
        this.CynosVersion = CynosVersion;
    }

    /**
     * Get 存储容量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageLimit 存储容量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStorageLimit() {
        return this.StorageLimit;
    }

    /**
     * Set 存储容量
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageLimit 存储容量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageLimit(Long StorageLimit) {
        this.StorageLimit = StorageLimit;
    }

    /**
     * Get 续费标志
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RenewFlag 续费标志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 续费标志
注意：此字段可能返回 null，表示取不到有效值。
     * @param RenewFlag 续费标志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 正在处理的任务
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcessingTask 正在处理的任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProcessingTask() {
        return this.ProcessingTask;
    }

    /**
     * Set 正在处理的任务
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcessingTask 正在处理的任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcessingTask(String ProcessingTask) {
        this.ProcessingTask = ProcessingTask;
    }

    /**
     * Get 集群的任务数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tasks 集群的任务数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ObjectTask [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set 集群的任务数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tasks 集群的任务数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTasks(ObjectTask [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get 集群绑定的tag数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceTags 集群绑定的tag数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set 集群绑定的tag数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceTags 集群绑定的tag数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceTags(Tag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get Db类型(NORMAL, SERVERLESS)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DbMode Db类型(NORMAL, SERVERLESS)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDbMode() {
        return this.DbMode;
    }

    /**
     * Set Db类型(NORMAL, SERVERLESS)
注意：此字段可能返回 null，表示取不到有效值。
     * @param DbMode Db类型(NORMAL, SERVERLESS)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDbMode(String DbMode) {
        this.DbMode = DbMode;
    }

    /**
     * Get 当Db类型为SERVERLESS时，serverless集群状态，可选值:
resume
pause
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServerlessStatus 当Db类型为SERVERLESS时，serverless集群状态，可选值:
resume
pause
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServerlessStatus() {
        return this.ServerlessStatus;
    }

    /**
     * Set 当Db类型为SERVERLESS时，serverless集群状态，可选值:
resume
pause
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServerlessStatus 当Db类型为SERVERLESS时，serverless集群状态，可选值:
resume
pause
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServerlessStatus(String ServerlessStatus) {
        this.ServerlessStatus = ServerlessStatus;
    }

    /**
     * Get 集群预付费存储值大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Storage 集群预付费存储值大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set 集群预付费存储值大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param Storage 集群预付费存储值大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get 集群存储为预付费时的存储ID，用于预付费存储变配
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageId 集群存储为预付费时的存储ID，用于预付费存储变配
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStorageId() {
        return this.StorageId;
    }

    /**
     * Set 集群存储为预付费时的存储ID，用于预付费存储变配
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageId 集群存储为预付费时的存储ID，用于预付费存储变配
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageId(String StorageId) {
        this.StorageId = StorageId;
    }

    /**
     * Get 集群存储付费模式。0-按量计费，1-包年包月
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StoragePayMode 集群存储付费模式。0-按量计费，1-包年包月
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStoragePayMode() {
        return this.StoragePayMode;
    }

    /**
     * Set 集群存储付费模式。0-按量计费，1-包年包月
注意：此字段可能返回 null，表示取不到有效值。
     * @param StoragePayMode 集群存储付费模式。0-按量计费，1-包年包月
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStoragePayMode(Long StoragePayMode) {
        this.StoragePayMode = StoragePayMode;
    }

    /**
     * Get 集群计算规格对应的最小存储值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MinStorageSize 集群计算规格对应的最小存储值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMinStorageSize() {
        return this.MinStorageSize;
    }

    /**
     * Set 集群计算规格对应的最小存储值
注意：此字段可能返回 null，表示取不到有效值。
     * @param MinStorageSize 集群计算规格对应的最小存储值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMinStorageSize(Long MinStorageSize) {
        this.MinStorageSize = MinStorageSize;
    }

    /**
     * Get 集群计算规格对应的最大存储值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxStorageSize 集群计算规格对应的最大存储值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxStorageSize() {
        return this.MaxStorageSize;
    }

    /**
     * Set 集群计算规格对应的最大存储值
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxStorageSize 集群计算规格对应的最大存储值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxStorageSize(Long MaxStorageSize) {
        this.MaxStorageSize = MaxStorageSize;
    }

    /**
     * Get 集群网络信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetAddrs 集群网络信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NetAddr [] getNetAddrs() {
        return this.NetAddrs;
    }

    /**
     * Set 集群网络信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetAddrs 集群网络信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetAddrs(NetAddr [] NetAddrs) {
        this.NetAddrs = NetAddrs;
    }

    /**
     * Get 物理可用区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PhysicalZone 物理可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPhysicalZone() {
        return this.PhysicalZone;
    }

    /**
     * Set 物理可用区
注意：此字段可能返回 null，表示取不到有效值。
     * @param PhysicalZone 物理可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhysicalZone(String PhysicalZone) {
        this.PhysicalZone = PhysicalZone;
    }

    /**
     * Get 主可用区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MasterZone 主可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMasterZone() {
        return this.MasterZone;
    }

    /**
     * Set 主可用区
注意：此字段可能返回 null，表示取不到有效值。
     * @param MasterZone 主可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMasterZone(String MasterZone) {
        this.MasterZone = MasterZone;
    }

    /**
     * Get 是否有从可用区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HasSlaveZone 是否有从可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHasSlaveZone() {
        return this.HasSlaveZone;
    }

    /**
     * Set 是否有从可用区
注意：此字段可能返回 null，表示取不到有效值。
     * @param HasSlaveZone 是否有从可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHasSlaveZone(String HasSlaveZone) {
        this.HasSlaveZone = HasSlaveZone;
    }

    /**
     * Get 从可用区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SlaveZones 从可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSlaveZones() {
        return this.SlaveZones;
    }

    /**
     * Set 从可用区
注意：此字段可能返回 null，表示取不到有效值。
     * @param SlaveZones 从可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSlaveZones(String [] SlaveZones) {
        this.SlaveZones = SlaveZones;
    }

    /**
     * Get 商业类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BusinessType 商业类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBusinessType() {
        return this.BusinessType;
    }

    /**
     * Set 商业类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param BusinessType 商业类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBusinessType(String BusinessType) {
        this.BusinessType = BusinessType;
    }

    /**
     * Get 是否冻结
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsFreeze 是否冻结
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsFreeze() {
        return this.IsFreeze;
    }

    /**
     * Set 是否冻结
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsFreeze 是否冻结
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsFreeze(String IsFreeze) {
        this.IsFreeze = IsFreeze;
    }

    /**
     * Get 订单来源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrderSource 订单来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrderSource() {
        return this.OrderSource;
    }

    /**
     * Set 订单来源
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrderSource 订单来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrderSource(String OrderSource) {
        this.OrderSource = OrderSource;
    }

    /**
     * Get 能力
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ability 能力
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Ability getAbility() {
        return this.Ability;
    }

    /**
     * Set 能力
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ability 能力
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAbility(Ability Ability) {
        this.Ability = Ability;
    }

    /**
     * Get 实例绑定资源包信息（此处只返回存储资源包，即packageType=DISK）	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourcePackages 实例绑定资源包信息（此处只返回存储资源包，即packageType=DISK）	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourcePackage [] getResourcePackages() {
        return this.ResourcePackages;
    }

    /**
     * Set 实例绑定资源包信息（此处只返回存储资源包，即packageType=DISK）	
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourcePackages 实例绑定资源包信息（此处只返回存储资源包，即packageType=DISK）	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourcePackages(ResourcePackage [] ResourcePackages) {
        this.ResourcePackages = ResourcePackages;
    }

    public CynosdbCluster() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CynosdbCluster(CynosdbCluster source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.DbVersion != null) {
            this.DbVersion = new String(source.DbVersion);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.InstanceNum != null) {
            this.InstanceNum = new Long(source.InstanceNum);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.DbType != null) {
            this.DbType = new String(source.DbType);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.PeriodEndTime != null) {
            this.PeriodEndTime = new String(source.PeriodEndTime);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.ProjectID != null) {
            this.ProjectID = new Long(source.ProjectID);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.CynosVersion != null) {
            this.CynosVersion = new String(source.CynosVersion);
        }
        if (source.StorageLimit != null) {
            this.StorageLimit = new Long(source.StorageLimit);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.ProcessingTask != null) {
            this.ProcessingTask = new String(source.ProcessingTask);
        }
        if (source.Tasks != null) {
            this.Tasks = new ObjectTask[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new ObjectTask(source.Tasks[i]);
            }
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new Tag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new Tag(source.ResourceTags[i]);
            }
        }
        if (source.DbMode != null) {
            this.DbMode = new String(source.DbMode);
        }
        if (source.ServerlessStatus != null) {
            this.ServerlessStatus = new String(source.ServerlessStatus);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.StorageId != null) {
            this.StorageId = new String(source.StorageId);
        }
        if (source.StoragePayMode != null) {
            this.StoragePayMode = new Long(source.StoragePayMode);
        }
        if (source.MinStorageSize != null) {
            this.MinStorageSize = new Long(source.MinStorageSize);
        }
        if (source.MaxStorageSize != null) {
            this.MaxStorageSize = new Long(source.MaxStorageSize);
        }
        if (source.NetAddrs != null) {
            this.NetAddrs = new NetAddr[source.NetAddrs.length];
            for (int i = 0; i < source.NetAddrs.length; i++) {
                this.NetAddrs[i] = new NetAddr(source.NetAddrs[i]);
            }
        }
        if (source.PhysicalZone != null) {
            this.PhysicalZone = new String(source.PhysicalZone);
        }
        if (source.MasterZone != null) {
            this.MasterZone = new String(source.MasterZone);
        }
        if (source.HasSlaveZone != null) {
            this.HasSlaveZone = new String(source.HasSlaveZone);
        }
        if (source.SlaveZones != null) {
            this.SlaveZones = new String[source.SlaveZones.length];
            for (int i = 0; i < source.SlaveZones.length; i++) {
                this.SlaveZones[i] = new String(source.SlaveZones[i]);
            }
        }
        if (source.BusinessType != null) {
            this.BusinessType = new String(source.BusinessType);
        }
        if (source.IsFreeze != null) {
            this.IsFreeze = new String(source.IsFreeze);
        }
        if (source.OrderSource != null) {
            this.OrderSource = new String(source.OrderSource);
        }
        if (source.Ability != null) {
            this.Ability = new Ability(source.Ability);
        }
        if (source.ResourcePackages != null) {
            this.ResourcePackages = new ResourcePackage[source.ResourcePackages.length];
            for (int i = 0; i < source.ResourcePackages.length; i++) {
                this.ResourcePackages[i] = new ResourcePackage(source.ResourcePackages[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "DbVersion", this.DbVersion);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "InstanceNum", this.InstanceNum);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "PeriodEndTime", this.PeriodEndTime);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "ProjectID", this.ProjectID);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "CynosVersion", this.CynosVersion);
        this.setParamSimple(map, prefix + "StorageLimit", this.StorageLimit);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "ProcessingTask", this.ProcessingTask);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "DbMode", this.DbMode);
        this.setParamSimple(map, prefix + "ServerlessStatus", this.ServerlessStatus);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "StorageId", this.StorageId);
        this.setParamSimple(map, prefix + "StoragePayMode", this.StoragePayMode);
        this.setParamSimple(map, prefix + "MinStorageSize", this.MinStorageSize);
        this.setParamSimple(map, prefix + "MaxStorageSize", this.MaxStorageSize);
        this.setParamArrayObj(map, prefix + "NetAddrs.", this.NetAddrs);
        this.setParamSimple(map, prefix + "PhysicalZone", this.PhysicalZone);
        this.setParamSimple(map, prefix + "MasterZone", this.MasterZone);
        this.setParamSimple(map, prefix + "HasSlaveZone", this.HasSlaveZone);
        this.setParamArraySimple(map, prefix + "SlaveZones.", this.SlaveZones);
        this.setParamSimple(map, prefix + "BusinessType", this.BusinessType);
        this.setParamSimple(map, prefix + "IsFreeze", this.IsFreeze);
        this.setParamSimple(map, prefix + "OrderSource", this.OrderSource);
        this.setParamObj(map, prefix + "Ability.", this.Ability);
        this.setParamArrayObj(map, prefix + "ResourcePackages.", this.ResourcePackages);

    }
}

