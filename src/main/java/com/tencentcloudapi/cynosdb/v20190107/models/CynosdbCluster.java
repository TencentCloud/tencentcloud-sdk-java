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

public class CynosdbCluster extends AbstractModel {

    /**
    * <p>集群状态， 可选值如下:<br>creating: 创建中<br>running:运行中<br>isolating:隔离中<br>isolated:已隔离<br>activating:解隔离中<br>offlining:下线中<br>offlined:已下线<br>deleting:删除中<br>deleted:已删除</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>可用区</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>集群名称</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>地域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>数据库版本</p>
    */
    @SerializedName("DbVersion")
    @Expose
    private String DbVersion;

    /**
    * <p>集群ID</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>实例数</p>
    */
    @SerializedName("InstanceNum")
    @Expose
    private Long InstanceNum;

    /**
    * <p>用户uin</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>引擎类型</p>
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * <p>用户appid</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>集群状态描述</p>
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * <p>集群创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>付费模式。0-按量计费，1-包年包月</p>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>截止时间</p>
    */
    @SerializedName("PeriodEndTime")
    @Expose
    private String PeriodEndTime;

    /**
    * <p>集群读写vip</p>
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * <p>集群读写vport</p>
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * <p>项目id</p>
    */
    @SerializedName("ProjectID")
    @Expose
    private Long ProjectID;

    /**
    * <p>私有网络ID</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>子网ID</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>cynos内核版本</p>
    */
    @SerializedName("CynosVersion")
    @Expose
    private String CynosVersion;

    /**
    * <p>cynos版本标签</p>
    */
    @SerializedName("CynosVersionTag")
    @Expose
    private String CynosVersionTag;

    /**
    * <p>存储容量</p>
    */
    @SerializedName("StorageLimit")
    @Expose
    private Long StorageLimit;

    /**
    * <p>续费标志</p>
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * <p>正在处理的任务</p>
    */
    @SerializedName("ProcessingTask")
    @Expose
    private String ProcessingTask;

    /**
    * <p>集群的任务数组</p>
    */
    @SerializedName("Tasks")
    @Expose
    private ObjectTask [] Tasks;

    /**
    * <p>集群绑定的tag数组</p>
    */
    @SerializedName("ResourceTags")
    @Expose
    private Tag [] ResourceTags;

    /**
    * <p>Db类型(NORMAL, SERVERLESS)</p>
    */
    @SerializedName("DbMode")
    @Expose
    private String DbMode;

    /**
    * <p>当Db类型为SERVERLESS时，serverless集群状态，可选值:<br>resume<br>pause</p>
    */
    @SerializedName("ServerlessStatus")
    @Expose
    private String ServerlessStatus;

    /**
    * <p>集群预付费存储值大小</p>
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * <p>集群存储为预付费时的存储ID，用于预付费存储变配</p>
    */
    @SerializedName("StorageId")
    @Expose
    private String StorageId;

    /**
    * <p>集群存储付费模式。0-按量计费，1-包年包月</p>
    */
    @SerializedName("StoragePayMode")
    @Expose
    private Long StoragePayMode;

    /**
    * <p>集群计算规格对应的最小存储值</p>
    */
    @SerializedName("MinStorageSize")
    @Expose
    private Long MinStorageSize;

    /**
    * <p>集群计算规格对应的最大存储值</p>
    */
    @SerializedName("MaxStorageSize")
    @Expose
    private Long MaxStorageSize;

    /**
    * <p>集群网络信息</p>
    */
    @SerializedName("NetAddrs")
    @Expose
    private NetAddr [] NetAddrs;

    /**
    * <p>物理可用区</p>
    */
    @SerializedName("PhysicalZone")
    @Expose
    private String PhysicalZone;

    /**
    * <p>主可用区</p>
    */
    @SerializedName("MasterZone")
    @Expose
    private String MasterZone;

    /**
    * <p>是否有从可用区</p>
    */
    @SerializedName("HasSlaveZone")
    @Expose
    private String HasSlaveZone;

    /**
    * <p>从可用区</p>
    */
    @SerializedName("SlaveZones")
    @Expose
    private String [] SlaveZones;

    /**
    * <p>商业类型</p>
    */
    @SerializedName("BusinessType")
    @Expose
    private String BusinessType;

    /**
    * <p>是否冻结</p>
    */
    @SerializedName("IsFreeze")
    @Expose
    private String IsFreeze;

    /**
    * <p>订单来源</p>
    */
    @SerializedName("OrderSource")
    @Expose
    private String OrderSource;

    /**
    * <p>能力</p>
    */
    @SerializedName("Ability")
    @Expose
    private Ability Ability;

    /**
    * <p>实例绑定资源包信息（此处只返回存储资源包，即packageType=DISK）</p>
    */
    @SerializedName("ResourcePackages")
    @Expose
    private ResourcePackage [] ResourcePackages;

    /**
    * <p>全球数据库唯一标识</p>
    */
    @SerializedName("GdnId")
    @Expose
    private String GdnId;

    /**
    * <p>集群角色。主集群- primary，从集群 - standby，如果 GdnId为空，该字段无效。</p>
    */
    @SerializedName("GdnRole")
    @Expose
    private String GdnRole;

    /**
     * Get <p>集群状态， 可选值如下:<br>creating: 创建中<br>running:运行中<br>isolating:隔离中<br>isolated:已隔离<br>activating:解隔离中<br>offlining:下线中<br>offlined:已下线<br>deleting:删除中<br>deleted:已删除</p> 
     * @return Status <p>集群状态， 可选值如下:<br>creating: 创建中<br>running:运行中<br>isolating:隔离中<br>isolated:已隔离<br>activating:解隔离中<br>offlining:下线中<br>offlined:已下线<br>deleting:删除中<br>deleted:已删除</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>集群状态， 可选值如下:<br>creating: 创建中<br>running:运行中<br>isolating:隔离中<br>isolated:已隔离<br>activating:解隔离中<br>offlining:下线中<br>offlined:已下线<br>deleting:删除中<br>deleted:已删除</p>
     * @param Status <p>集群状态， 可选值如下:<br>creating: 创建中<br>running:运行中<br>isolating:隔离中<br>isolated:已隔离<br>activating:解隔离中<br>offlining:下线中<br>offlined:已下线<br>deleting:删除中<br>deleted:已删除</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>更新时间</p> 
     * @return UpdateTime <p>更新时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdateTime <p>更新时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>可用区</p> 
     * @return Zone <p>可用区</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区</p>
     * @param Zone <p>可用区</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>集群名称</p> 
     * @return ClusterName <p>集群名称</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>集群名称</p>
     * @param ClusterName <p>集群名称</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>地域</p> 
     * @return Region <p>地域</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域</p>
     * @param Region <p>地域</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
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
     * Get <p>集群ID</p> 
     * @return ClusterId <p>集群ID</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群ID</p>
     * @param ClusterId <p>集群ID</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>实例数</p> 
     * @return InstanceNum <p>实例数</p>
     */
    public Long getInstanceNum() {
        return this.InstanceNum;
    }

    /**
     * Set <p>实例数</p>
     * @param InstanceNum <p>实例数</p>
     */
    public void setInstanceNum(Long InstanceNum) {
        this.InstanceNum = InstanceNum;
    }

    /**
     * Get <p>用户uin</p> 
     * @return Uin <p>用户uin</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>用户uin</p>
     * @param Uin <p>用户uin</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>引擎类型</p> 
     * @return DbType <p>引擎类型</p>
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set <p>引擎类型</p>
     * @param DbType <p>引擎类型</p>
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get <p>用户appid</p> 
     * @return AppId <p>用户appid</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>用户appid</p>
     * @param AppId <p>用户appid</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>集群状态描述</p> 
     * @return StatusDesc <p>集群状态描述</p>
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set <p>集群状态描述</p>
     * @param StatusDesc <p>集群状态描述</p>
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get <p>集群创建时间</p> 
     * @return CreateTime <p>集群创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>集群创建时间</p>
     * @param CreateTime <p>集群创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>付费模式。0-按量计费，1-包年包月</p> 
     * @return PayMode <p>付费模式。0-按量计费，1-包年包月</p>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>付费模式。0-按量计费，1-包年包月</p>
     * @param PayMode <p>付费模式。0-按量计费，1-包年包月</p>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>截止时间</p> 
     * @return PeriodEndTime <p>截止时间</p>
     */
    public String getPeriodEndTime() {
        return this.PeriodEndTime;
    }

    /**
     * Set <p>截止时间</p>
     * @param PeriodEndTime <p>截止时间</p>
     */
    public void setPeriodEndTime(String PeriodEndTime) {
        this.PeriodEndTime = PeriodEndTime;
    }

    /**
     * Get <p>集群读写vip</p> 
     * @return Vip <p>集群读写vip</p>
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set <p>集群读写vip</p>
     * @param Vip <p>集群读写vip</p>
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get <p>集群读写vport</p> 
     * @return Vport <p>集群读写vport</p>
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set <p>集群读写vport</p>
     * @param Vport <p>集群读写vport</p>
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get <p>项目id</p> 
     * @return ProjectID <p>项目id</p>
     */
    public Long getProjectID() {
        return this.ProjectID;
    }

    /**
     * Set <p>项目id</p>
     * @param ProjectID <p>项目id</p>
     */
    public void setProjectID(Long ProjectID) {
        this.ProjectID = ProjectID;
    }

    /**
     * Get <p>私有网络ID</p> 
     * @return VpcId <p>私有网络ID</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>私有网络ID</p>
     * @param VpcId <p>私有网络ID</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>子网ID</p> 
     * @return SubnetId <p>子网ID</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>子网ID</p>
     * @param SubnetId <p>子网ID</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>cynos内核版本</p> 
     * @return CynosVersion <p>cynos内核版本</p>
     */
    public String getCynosVersion() {
        return this.CynosVersion;
    }

    /**
     * Set <p>cynos内核版本</p>
     * @param CynosVersion <p>cynos内核版本</p>
     */
    public void setCynosVersion(String CynosVersion) {
        this.CynosVersion = CynosVersion;
    }

    /**
     * Get <p>cynos版本标签</p> 
     * @return CynosVersionTag <p>cynos版本标签</p>
     */
    public String getCynosVersionTag() {
        return this.CynosVersionTag;
    }

    /**
     * Set <p>cynos版本标签</p>
     * @param CynosVersionTag <p>cynos版本标签</p>
     */
    public void setCynosVersionTag(String CynosVersionTag) {
        this.CynosVersionTag = CynosVersionTag;
    }

    /**
     * Get <p>存储容量</p> 
     * @return StorageLimit <p>存储容量</p>
     */
    public Long getStorageLimit() {
        return this.StorageLimit;
    }

    /**
     * Set <p>存储容量</p>
     * @param StorageLimit <p>存储容量</p>
     */
    public void setStorageLimit(Long StorageLimit) {
        this.StorageLimit = StorageLimit;
    }

    /**
     * Get <p>续费标志</p> 
     * @return RenewFlag <p>续费标志</p>
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set <p>续费标志</p>
     * @param RenewFlag <p>续费标志</p>
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get <p>正在处理的任务</p> 
     * @return ProcessingTask <p>正在处理的任务</p>
     */
    public String getProcessingTask() {
        return this.ProcessingTask;
    }

    /**
     * Set <p>正在处理的任务</p>
     * @param ProcessingTask <p>正在处理的任务</p>
     */
    public void setProcessingTask(String ProcessingTask) {
        this.ProcessingTask = ProcessingTask;
    }

    /**
     * Get <p>集群的任务数组</p> 
     * @return Tasks <p>集群的任务数组</p>
     */
    public ObjectTask [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set <p>集群的任务数组</p>
     * @param Tasks <p>集群的任务数组</p>
     */
    public void setTasks(ObjectTask [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get <p>集群绑定的tag数组</p> 
     * @return ResourceTags <p>集群绑定的tag数组</p>
     */
    public Tag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set <p>集群绑定的tag数组</p>
     * @param ResourceTags <p>集群绑定的tag数组</p>
     */
    public void setResourceTags(Tag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get <p>Db类型(NORMAL, SERVERLESS)</p> 
     * @return DbMode <p>Db类型(NORMAL, SERVERLESS)</p>
     */
    public String getDbMode() {
        return this.DbMode;
    }

    /**
     * Set <p>Db类型(NORMAL, SERVERLESS)</p>
     * @param DbMode <p>Db类型(NORMAL, SERVERLESS)</p>
     */
    public void setDbMode(String DbMode) {
        this.DbMode = DbMode;
    }

    /**
     * Get <p>当Db类型为SERVERLESS时，serverless集群状态，可选值:<br>resume<br>pause</p> 
     * @return ServerlessStatus <p>当Db类型为SERVERLESS时，serverless集群状态，可选值:<br>resume<br>pause</p>
     */
    public String getServerlessStatus() {
        return this.ServerlessStatus;
    }

    /**
     * Set <p>当Db类型为SERVERLESS时，serverless集群状态，可选值:<br>resume<br>pause</p>
     * @param ServerlessStatus <p>当Db类型为SERVERLESS时，serverless集群状态，可选值:<br>resume<br>pause</p>
     */
    public void setServerlessStatus(String ServerlessStatus) {
        this.ServerlessStatus = ServerlessStatus;
    }

    /**
     * Get <p>集群预付费存储值大小</p> 
     * @return Storage <p>集群预付费存储值大小</p>
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set <p>集群预付费存储值大小</p>
     * @param Storage <p>集群预付费存储值大小</p>
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get <p>集群存储为预付费时的存储ID，用于预付费存储变配</p> 
     * @return StorageId <p>集群存储为预付费时的存储ID，用于预付费存储变配</p>
     */
    public String getStorageId() {
        return this.StorageId;
    }

    /**
     * Set <p>集群存储为预付费时的存储ID，用于预付费存储变配</p>
     * @param StorageId <p>集群存储为预付费时的存储ID，用于预付费存储变配</p>
     */
    public void setStorageId(String StorageId) {
        this.StorageId = StorageId;
    }

    /**
     * Get <p>集群存储付费模式。0-按量计费，1-包年包月</p> 
     * @return StoragePayMode <p>集群存储付费模式。0-按量计费，1-包年包月</p>
     */
    public Long getStoragePayMode() {
        return this.StoragePayMode;
    }

    /**
     * Set <p>集群存储付费模式。0-按量计费，1-包年包月</p>
     * @param StoragePayMode <p>集群存储付费模式。0-按量计费，1-包年包月</p>
     */
    public void setStoragePayMode(Long StoragePayMode) {
        this.StoragePayMode = StoragePayMode;
    }

    /**
     * Get <p>集群计算规格对应的最小存储值</p> 
     * @return MinStorageSize <p>集群计算规格对应的最小存储值</p>
     */
    public Long getMinStorageSize() {
        return this.MinStorageSize;
    }

    /**
     * Set <p>集群计算规格对应的最小存储值</p>
     * @param MinStorageSize <p>集群计算规格对应的最小存储值</p>
     */
    public void setMinStorageSize(Long MinStorageSize) {
        this.MinStorageSize = MinStorageSize;
    }

    /**
     * Get <p>集群计算规格对应的最大存储值</p> 
     * @return MaxStorageSize <p>集群计算规格对应的最大存储值</p>
     */
    public Long getMaxStorageSize() {
        return this.MaxStorageSize;
    }

    /**
     * Set <p>集群计算规格对应的最大存储值</p>
     * @param MaxStorageSize <p>集群计算规格对应的最大存储值</p>
     */
    public void setMaxStorageSize(Long MaxStorageSize) {
        this.MaxStorageSize = MaxStorageSize;
    }

    /**
     * Get <p>集群网络信息</p> 
     * @return NetAddrs <p>集群网络信息</p>
     */
    public NetAddr [] getNetAddrs() {
        return this.NetAddrs;
    }

    /**
     * Set <p>集群网络信息</p>
     * @param NetAddrs <p>集群网络信息</p>
     */
    public void setNetAddrs(NetAddr [] NetAddrs) {
        this.NetAddrs = NetAddrs;
    }

    /**
     * Get <p>物理可用区</p> 
     * @return PhysicalZone <p>物理可用区</p>
     */
    public String getPhysicalZone() {
        return this.PhysicalZone;
    }

    /**
     * Set <p>物理可用区</p>
     * @param PhysicalZone <p>物理可用区</p>
     */
    public void setPhysicalZone(String PhysicalZone) {
        this.PhysicalZone = PhysicalZone;
    }

    /**
     * Get <p>主可用区</p> 
     * @return MasterZone <p>主可用区</p>
     */
    public String getMasterZone() {
        return this.MasterZone;
    }

    /**
     * Set <p>主可用区</p>
     * @param MasterZone <p>主可用区</p>
     */
    public void setMasterZone(String MasterZone) {
        this.MasterZone = MasterZone;
    }

    /**
     * Get <p>是否有从可用区</p> 
     * @return HasSlaveZone <p>是否有从可用区</p>
     */
    public String getHasSlaveZone() {
        return this.HasSlaveZone;
    }

    /**
     * Set <p>是否有从可用区</p>
     * @param HasSlaveZone <p>是否有从可用区</p>
     */
    public void setHasSlaveZone(String HasSlaveZone) {
        this.HasSlaveZone = HasSlaveZone;
    }

    /**
     * Get <p>从可用区</p> 
     * @return SlaveZones <p>从可用区</p>
     */
    public String [] getSlaveZones() {
        return this.SlaveZones;
    }

    /**
     * Set <p>从可用区</p>
     * @param SlaveZones <p>从可用区</p>
     */
    public void setSlaveZones(String [] SlaveZones) {
        this.SlaveZones = SlaveZones;
    }

    /**
     * Get <p>商业类型</p> 
     * @return BusinessType <p>商业类型</p>
     */
    public String getBusinessType() {
        return this.BusinessType;
    }

    /**
     * Set <p>商业类型</p>
     * @param BusinessType <p>商业类型</p>
     */
    public void setBusinessType(String BusinessType) {
        this.BusinessType = BusinessType;
    }

    /**
     * Get <p>是否冻结</p> 
     * @return IsFreeze <p>是否冻结</p>
     */
    public String getIsFreeze() {
        return this.IsFreeze;
    }

    /**
     * Set <p>是否冻结</p>
     * @param IsFreeze <p>是否冻结</p>
     */
    public void setIsFreeze(String IsFreeze) {
        this.IsFreeze = IsFreeze;
    }

    /**
     * Get <p>订单来源</p> 
     * @return OrderSource <p>订单来源</p>
     */
    public String getOrderSource() {
        return this.OrderSource;
    }

    /**
     * Set <p>订单来源</p>
     * @param OrderSource <p>订单来源</p>
     */
    public void setOrderSource(String OrderSource) {
        this.OrderSource = OrderSource;
    }

    /**
     * Get <p>能力</p> 
     * @return Ability <p>能力</p>
     */
    public Ability getAbility() {
        return this.Ability;
    }

    /**
     * Set <p>能力</p>
     * @param Ability <p>能力</p>
     */
    public void setAbility(Ability Ability) {
        this.Ability = Ability;
    }

    /**
     * Get <p>实例绑定资源包信息（此处只返回存储资源包，即packageType=DISK）</p> 
     * @return ResourcePackages <p>实例绑定资源包信息（此处只返回存储资源包，即packageType=DISK）</p>
     */
    public ResourcePackage [] getResourcePackages() {
        return this.ResourcePackages;
    }

    /**
     * Set <p>实例绑定资源包信息（此处只返回存储资源包，即packageType=DISK）</p>
     * @param ResourcePackages <p>实例绑定资源包信息（此处只返回存储资源包，即packageType=DISK）</p>
     */
    public void setResourcePackages(ResourcePackage [] ResourcePackages) {
        this.ResourcePackages = ResourcePackages;
    }

    /**
     * Get <p>全球数据库唯一标识</p> 
     * @return GdnId <p>全球数据库唯一标识</p>
     */
    public String getGdnId() {
        return this.GdnId;
    }

    /**
     * Set <p>全球数据库唯一标识</p>
     * @param GdnId <p>全球数据库唯一标识</p>
     */
    public void setGdnId(String GdnId) {
        this.GdnId = GdnId;
    }

    /**
     * Get <p>集群角色。主集群- primary，从集群 - standby，如果 GdnId为空，该字段无效。</p> 
     * @return GdnRole <p>集群角色。主集群- primary，从集群 - standby，如果 GdnId为空，该字段无效。</p>
     */
    public String getGdnRole() {
        return this.GdnRole;
    }

    /**
     * Set <p>集群角色。主集群- primary，从集群 - standby，如果 GdnId为空，该字段无效。</p>
     * @param GdnRole <p>集群角色。主集群- primary，从集群 - standby，如果 GdnId为空，该字段无效。</p>
     */
    public void setGdnRole(String GdnRole) {
        this.GdnRole = GdnRole;
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
        if (source.CynosVersionTag != null) {
            this.CynosVersionTag = new String(source.CynosVersionTag);
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
        if (source.GdnId != null) {
            this.GdnId = new String(source.GdnId);
        }
        if (source.GdnRole != null) {
            this.GdnRole = new String(source.GdnRole);
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
        this.setParamSimple(map, prefix + "CynosVersionTag", this.CynosVersionTag);
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
        this.setParamSimple(map, prefix + "GdnId", this.GdnId);
        this.setParamSimple(map, prefix + "GdnRole", this.GdnRole);

    }
}

