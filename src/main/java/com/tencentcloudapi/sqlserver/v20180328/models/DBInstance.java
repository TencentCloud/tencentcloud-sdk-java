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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DBInstance extends AbstractModel {

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>实例所在项目ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>实例所在地域ID</p>
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * <p>实例所在可用区ID</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * <p>实例所在私有网络ID，基础网络时为 0</p>
    */
    @SerializedName("VpcId")
    @Expose
    private Long VpcId;

    /**
    * <p>实例所在私有网络子网ID，基础网络时为 0</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private Long SubnetId;

    /**
    * <p>实例状态。取值范围： <li>1：申请中</li> <li>2：运行中</li> <li>3：受限运行中 (主备切换中)</li> <li>4：已隔离</li> <li>5：回收中</li> <li>6：已回收</li> <li>7：任务执行中 (实例做备份、回档等操作)</li> <li>8：已下线</li> <li>9：实例扩容中</li> <li>10：实例迁移中</li> <li>11：只读</li> <li>12：重启中</li>  <li>13：实例修改中且待切换</li> <li>14：订阅发布创建中</li> <li>15：订阅发布修改中</li> <li>16：实例修改中且切换中</li> <li>17：创建RO副本中</li></p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>实例访问IP</p>
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * <p>实例访问端口</p>
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * <p>实例创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>实例更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>实例计费开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>实例计费结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>实例隔离时间</p>
    */
    @SerializedName("IsolateTime")
    @Expose
    private String IsolateTime;

    /**
    * <p>实例内存大小，单位G</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>实例已经使用存储空间大小，单位G</p>
    */
    @SerializedName("UsedStorage")
    @Expose
    private Long UsedStorage;

    /**
    * <p>实例存储空间大小，单位G</p>
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * <p>实例版本</p>
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * <p>实例续费标记，0-正常续费，1-自动续费，2-到期不续费</p>
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * <p>实例高可用， 1-双机高可用，2-单机，3-跨可用区，4-集群跨可用区，5-集群，6-多节点集群，7-多节点集群跨可用区，9-自研机房</p>
    */
    @SerializedName("Model")
    @Expose
    private Long Model;

    /**
    * <p>实例所在地域名称，如 ap-guangzhou</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>实例所在可用区名称，如 ap-guangzhou-1</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>备份时间点</p>
    */
    @SerializedName("BackupTime")
    @Expose
    private String BackupTime;

    /**
    * <p>实例付费模式， 0-按量计费，1-包年包月</p>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>实例唯一UID</p>
    */
    @SerializedName("Uid")
    @Expose
    private String Uid;

    /**
    * <p>实例cpu核心数</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>实例版本代号</p>
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * <p>实例类型代号：&quot;TS85&quot;-物理机，本地SSD硬盘；&quot;Z3&quot;-物理机早期版本，本地SSD硬盘；&quot;CLOUD_BASIC&quot;-虚拟机，普通云硬盘；&quot;CLOUD_PREMIUM&quot;-虚拟机，高性能云硬盘；&quot;CLOUD_SSD&quot;-虚拟机，云SSD硬盘；&quot;CLOUD_HSSD&quot;-虚拟机，增强型SSD云硬盘；&quot;CLOUD_TSSD&quot;-虚拟机，极速型SSD云硬盘；&quot;CLOUD_BSSD&quot;-虚拟机，通用型SSD云硬盘</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>计费ID</p>
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * <p>实例所属VPC的唯一字符串ID，格式如：vpc-xxx，基础网络时为空字符串</p>
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * <p>实例所属子网的唯一字符串ID，格式如： subnet-xxx，基础网络时为空字符串</p>
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * <p>实例隔离操作</p>
    */
    @SerializedName("IsolateOperator")
    @Expose
    private String IsolateOperator;

    /**
    * <p>发布订阅标识，SUB-订阅实例，PUB-发布实例，空值-没有发布订阅的普通实例</p>
    */
    @SerializedName("SubFlag")
    @Expose
    private String SubFlag;

    /**
    * <p>只读标识，RO-只读实例，MASTER-有RO实例的主实例，空值-没有只读组的非RO实例</p>
    */
    @SerializedName("ROFlag")
    @Expose
    private String ROFlag;

    /**
    * <p>容灾类型，MIRROR-镜像，ALWAYSON-AlwaysOn, SINGLE-单例</p>
    */
    @SerializedName("HAFlag")
    @Expose
    private String HAFlag;

    /**
    * <p>实例绑定的标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceTags")
    @Expose
    private ResourceTag [] ResourceTags;

    /**
    * <p>备份模式，master_pkg-主节点打包备份(默认) ；master_no_pkg-主节点不打包备份；slave_pkg-从节点打包备份(always on集群有效)；slave_no_pkg-从节点不打包备份(always on集群有效)；只读副本对该值无效。</p>
    */
    @SerializedName("BackupModel")
    @Expose
    private String BackupModel;

    /**
    * <p>实例备份信息</p>
    */
    @SerializedName("InstanceNote")
    @Expose
    private String InstanceNote;

    /**
    * <p>备份周期</p>
    */
    @SerializedName("BackupCycle")
    @Expose
    private Long [] BackupCycle;

    /**
    * <p>备份周期类型，[daily、weekly、monthly]</p>
    */
    @SerializedName("BackupCycleType")
    @Expose
    private String BackupCycleType;

    /**
    * <p>数据(日志)备份保留时间</p>
    */
    @SerializedName("BackupSaveDays")
    @Expose
    private Long BackupSaveDays;

    /**
    * <p>实例类型 HA-高可用，RO-只读实例，SI-基础版，BI-商业智能服务，cvmHA-云盘高可用，cvmRO-云盘只读实例，MultiHA-多节点，cvmMultiHA-云盘多节点</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>跨地域备份目的地域，如果为空，则表示未开启跨地域备份</p>
    */
    @SerializedName("CrossRegions")
    @Expose
    private String [] CrossRegions;

    /**
    * <p>跨地域备份状态 enable-开启，disable-关闭</p>
    */
    @SerializedName("CrossBackupEnabled")
    @Expose
    private String CrossBackupEnabled;

    /**
    * <p>跨地域备份保留天数，则默认7天</p>
    */
    @SerializedName("CrossBackupSaveDays")
    @Expose
    private Long CrossBackupSaveDays;

    /**
    * <p>外网地址域名</p>
    */
    @SerializedName("DnsPodDomain")
    @Expose
    private String DnsPodDomain;

    /**
    * <p>外网端口号</p>
    */
    @SerializedName("TgwWanVPort")
    @Expose
    private Long TgwWanVPort;

    /**
    * <p>系统字符集排序规则，默认：Chinese_PRC_CI_AS</p>
    */
    @SerializedName("Collation")
    @Expose
    private String Collation;

    /**
    * <p>系统时区，默认：China Standard Time</p>
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
    * <p>是否跨AZ</p>
    */
    @SerializedName("IsDrZone")
    @Expose
    private Boolean IsDrZone;

    /**
    * <p>双节点实例备可用区信息</p>
    */
    @SerializedName("SlaveZones")
    @Expose
    private SlaveZones SlaveZones;

    /**
    * <p>架构标识，SINGLE-单节点 DOUBLE-双节点</p>
    */
    @SerializedName("Architecture")
    @Expose
    private String Architecture;

    /**
    * <p>类型标识，EXCLUSIVE-独享型，SHARED-共享型</p>
    */
    @SerializedName("Style")
    @Expose
    private String Style;

    /**
    * <p>多节点实例备可用区信息</p>
    */
    @SerializedName("MultiSlaveZones")
    @Expose
    private SlaveZones [] MultiSlaveZones;

    /**
    * <p>额外IO吞吐量</p><p>单位：MB/s</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ThroughputPerformance")
    @Expose
    private Long ThroughputPerformance;

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>实例名称</p> 
     * @return Name <p>实例名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>实例名称</p>
     * @param Name <p>实例名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>实例所在项目ID</p> 
     * @return ProjectId <p>实例所在项目ID</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>实例所在项目ID</p>
     * @param ProjectId <p>实例所在项目ID</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>实例所在地域ID</p> 
     * @return RegionId <p>实例所在地域ID</p>
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set <p>实例所在地域ID</p>
     * @param RegionId <p>实例所在地域ID</p>
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get <p>实例所在可用区ID</p> 
     * @return ZoneId <p>实例所在可用区ID</p>
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>实例所在可用区ID</p>
     * @param ZoneId <p>实例所在可用区ID</p>
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>实例所在私有网络ID，基础网络时为 0</p> 
     * @return VpcId <p>实例所在私有网络ID，基础网络时为 0</p>
     */
    public Long getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>实例所在私有网络ID，基础网络时为 0</p>
     * @param VpcId <p>实例所在私有网络ID，基础网络时为 0</p>
     */
    public void setVpcId(Long VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>实例所在私有网络子网ID，基础网络时为 0</p> 
     * @return SubnetId <p>实例所在私有网络子网ID，基础网络时为 0</p>
     */
    public Long getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>实例所在私有网络子网ID，基础网络时为 0</p>
     * @param SubnetId <p>实例所在私有网络子网ID，基础网络时为 0</p>
     */
    public void setSubnetId(Long SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>实例状态。取值范围： <li>1：申请中</li> <li>2：运行中</li> <li>3：受限运行中 (主备切换中)</li> <li>4：已隔离</li> <li>5：回收中</li> <li>6：已回收</li> <li>7：任务执行中 (实例做备份、回档等操作)</li> <li>8：已下线</li> <li>9：实例扩容中</li> <li>10：实例迁移中</li> <li>11：只读</li> <li>12：重启中</li>  <li>13：实例修改中且待切换</li> <li>14：订阅发布创建中</li> <li>15：订阅发布修改中</li> <li>16：实例修改中且切换中</li> <li>17：创建RO副本中</li></p> 
     * @return Status <p>实例状态。取值范围： <li>1：申请中</li> <li>2：运行中</li> <li>3：受限运行中 (主备切换中)</li> <li>4：已隔离</li> <li>5：回收中</li> <li>6：已回收</li> <li>7：任务执行中 (实例做备份、回档等操作)</li> <li>8：已下线</li> <li>9：实例扩容中</li> <li>10：实例迁移中</li> <li>11：只读</li> <li>12：重启中</li>  <li>13：实例修改中且待切换</li> <li>14：订阅发布创建中</li> <li>15：订阅发布修改中</li> <li>16：实例修改中且切换中</li> <li>17：创建RO副本中</li></p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>实例状态。取值范围： <li>1：申请中</li> <li>2：运行中</li> <li>3：受限运行中 (主备切换中)</li> <li>4：已隔离</li> <li>5：回收中</li> <li>6：已回收</li> <li>7：任务执行中 (实例做备份、回档等操作)</li> <li>8：已下线</li> <li>9：实例扩容中</li> <li>10：实例迁移中</li> <li>11：只读</li> <li>12：重启中</li>  <li>13：实例修改中且待切换</li> <li>14：订阅发布创建中</li> <li>15：订阅发布修改中</li> <li>16：实例修改中且切换中</li> <li>17：创建RO副本中</li></p>
     * @param Status <p>实例状态。取值范围： <li>1：申请中</li> <li>2：运行中</li> <li>3：受限运行中 (主备切换中)</li> <li>4：已隔离</li> <li>5：回收中</li> <li>6：已回收</li> <li>7：任务执行中 (实例做备份、回档等操作)</li> <li>8：已下线</li> <li>9：实例扩容中</li> <li>10：实例迁移中</li> <li>11：只读</li> <li>12：重启中</li>  <li>13：实例修改中且待切换</li> <li>14：订阅发布创建中</li> <li>15：订阅发布修改中</li> <li>16：实例修改中且切换中</li> <li>17：创建RO副本中</li></p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>实例访问IP</p> 
     * @return Vip <p>实例访问IP</p>
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set <p>实例访问IP</p>
     * @param Vip <p>实例访问IP</p>
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get <p>实例访问端口</p> 
     * @return Vport <p>实例访问端口</p>
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set <p>实例访问端口</p>
     * @param Vport <p>实例访问端口</p>
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get <p>实例创建时间</p> 
     * @return CreateTime <p>实例创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>实例创建时间</p>
     * @param CreateTime <p>实例创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>实例更新时间</p> 
     * @return UpdateTime <p>实例更新时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>实例更新时间</p>
     * @param UpdateTime <p>实例更新时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>实例计费开始时间</p> 
     * @return StartTime <p>实例计费开始时间</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>实例计费开始时间</p>
     * @param StartTime <p>实例计费开始时间</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>实例计费结束时间</p> 
     * @return EndTime <p>实例计费结束时间</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>实例计费结束时间</p>
     * @param EndTime <p>实例计费结束时间</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>实例隔离时间</p> 
     * @return IsolateTime <p>实例隔离时间</p>
     */
    public String getIsolateTime() {
        return this.IsolateTime;
    }

    /**
     * Set <p>实例隔离时间</p>
     * @param IsolateTime <p>实例隔离时间</p>
     */
    public void setIsolateTime(String IsolateTime) {
        this.IsolateTime = IsolateTime;
    }

    /**
     * Get <p>实例内存大小，单位G</p> 
     * @return Memory <p>实例内存大小，单位G</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>实例内存大小，单位G</p>
     * @param Memory <p>实例内存大小，单位G</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>实例已经使用存储空间大小，单位G</p> 
     * @return UsedStorage <p>实例已经使用存储空间大小，单位G</p>
     */
    public Long getUsedStorage() {
        return this.UsedStorage;
    }

    /**
     * Set <p>实例已经使用存储空间大小，单位G</p>
     * @param UsedStorage <p>实例已经使用存储空间大小，单位G</p>
     */
    public void setUsedStorage(Long UsedStorage) {
        this.UsedStorage = UsedStorage;
    }

    /**
     * Get <p>实例存储空间大小，单位G</p> 
     * @return Storage <p>实例存储空间大小，单位G</p>
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set <p>实例存储空间大小，单位G</p>
     * @param Storage <p>实例存储空间大小，单位G</p>
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get <p>实例版本</p> 
     * @return VersionName <p>实例版本</p>
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set <p>实例版本</p>
     * @param VersionName <p>实例版本</p>
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get <p>实例续费标记，0-正常续费，1-自动续费，2-到期不续费</p> 
     * @return RenewFlag <p>实例续费标记，0-正常续费，1-自动续费，2-到期不续费</p>
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set <p>实例续费标记，0-正常续费，1-自动续费，2-到期不续费</p>
     * @param RenewFlag <p>实例续费标记，0-正常续费，1-自动续费，2-到期不续费</p>
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get <p>实例高可用， 1-双机高可用，2-单机，3-跨可用区，4-集群跨可用区，5-集群，6-多节点集群，7-多节点集群跨可用区，9-自研机房</p> 
     * @return Model <p>实例高可用， 1-双机高可用，2-单机，3-跨可用区，4-集群跨可用区，5-集群，6-多节点集群，7-多节点集群跨可用区，9-自研机房</p>
     */
    public Long getModel() {
        return this.Model;
    }

    /**
     * Set <p>实例高可用， 1-双机高可用，2-单机，3-跨可用区，4-集群跨可用区，5-集群，6-多节点集群，7-多节点集群跨可用区，9-自研机房</p>
     * @param Model <p>实例高可用， 1-双机高可用，2-单机，3-跨可用区，4-集群跨可用区，5-集群，6-多节点集群，7-多节点集群跨可用区，9-自研机房</p>
     */
    public void setModel(Long Model) {
        this.Model = Model;
    }

    /**
     * Get <p>实例所在地域名称，如 ap-guangzhou</p> 
     * @return Region <p>实例所在地域名称，如 ap-guangzhou</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>实例所在地域名称，如 ap-guangzhou</p>
     * @param Region <p>实例所在地域名称，如 ap-guangzhou</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>实例所在可用区名称，如 ap-guangzhou-1</p> 
     * @return Zone <p>实例所在可用区名称，如 ap-guangzhou-1</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>实例所在可用区名称，如 ap-guangzhou-1</p>
     * @param Zone <p>实例所在可用区名称，如 ap-guangzhou-1</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>备份时间点</p> 
     * @return BackupTime <p>备份时间点</p>
     */
    public String getBackupTime() {
        return this.BackupTime;
    }

    /**
     * Set <p>备份时间点</p>
     * @param BackupTime <p>备份时间点</p>
     */
    public void setBackupTime(String BackupTime) {
        this.BackupTime = BackupTime;
    }

    /**
     * Get <p>实例付费模式， 0-按量计费，1-包年包月</p> 
     * @return PayMode <p>实例付费模式， 0-按量计费，1-包年包月</p>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>实例付费模式， 0-按量计费，1-包年包月</p>
     * @param PayMode <p>实例付费模式， 0-按量计费，1-包年包月</p>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>实例唯一UID</p> 
     * @return Uid <p>实例唯一UID</p>
     */
    public String getUid() {
        return this.Uid;
    }

    /**
     * Set <p>实例唯一UID</p>
     * @param Uid <p>实例唯一UID</p>
     */
    public void setUid(String Uid) {
        this.Uid = Uid;
    }

    /**
     * Get <p>实例cpu核心数</p> 
     * @return Cpu <p>实例cpu核心数</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>实例cpu核心数</p>
     * @param Cpu <p>实例cpu核心数</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>实例版本代号</p> 
     * @return Version <p>实例版本代号</p>
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>实例版本代号</p>
     * @param Version <p>实例版本代号</p>
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get <p>实例类型代号：&quot;TS85&quot;-物理机，本地SSD硬盘；&quot;Z3&quot;-物理机早期版本，本地SSD硬盘；&quot;CLOUD_BASIC&quot;-虚拟机，普通云硬盘；&quot;CLOUD_PREMIUM&quot;-虚拟机，高性能云硬盘；&quot;CLOUD_SSD&quot;-虚拟机，云SSD硬盘；&quot;CLOUD_HSSD&quot;-虚拟机，增强型SSD云硬盘；&quot;CLOUD_TSSD&quot;-虚拟机，极速型SSD云硬盘；&quot;CLOUD_BSSD&quot;-虚拟机，通用型SSD云硬盘</p> 
     * @return Type <p>实例类型代号：&quot;TS85&quot;-物理机，本地SSD硬盘；&quot;Z3&quot;-物理机早期版本，本地SSD硬盘；&quot;CLOUD_BASIC&quot;-虚拟机，普通云硬盘；&quot;CLOUD_PREMIUM&quot;-虚拟机，高性能云硬盘；&quot;CLOUD_SSD&quot;-虚拟机，云SSD硬盘；&quot;CLOUD_HSSD&quot;-虚拟机，增强型SSD云硬盘；&quot;CLOUD_TSSD&quot;-虚拟机，极速型SSD云硬盘；&quot;CLOUD_BSSD&quot;-虚拟机，通用型SSD云硬盘</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>实例类型代号：&quot;TS85&quot;-物理机，本地SSD硬盘；&quot;Z3&quot;-物理机早期版本，本地SSD硬盘；&quot;CLOUD_BASIC&quot;-虚拟机，普通云硬盘；&quot;CLOUD_PREMIUM&quot;-虚拟机，高性能云硬盘；&quot;CLOUD_SSD&quot;-虚拟机，云SSD硬盘；&quot;CLOUD_HSSD&quot;-虚拟机，增强型SSD云硬盘；&quot;CLOUD_TSSD&quot;-虚拟机，极速型SSD云硬盘；&quot;CLOUD_BSSD&quot;-虚拟机，通用型SSD云硬盘</p>
     * @param Type <p>实例类型代号：&quot;TS85&quot;-物理机，本地SSD硬盘；&quot;Z3&quot;-物理机早期版本，本地SSD硬盘；&quot;CLOUD_BASIC&quot;-虚拟机，普通云硬盘；&quot;CLOUD_PREMIUM&quot;-虚拟机，高性能云硬盘；&quot;CLOUD_SSD&quot;-虚拟机，云SSD硬盘；&quot;CLOUD_HSSD&quot;-虚拟机，增强型SSD云硬盘；&quot;CLOUD_TSSD&quot;-虚拟机，极速型SSD云硬盘；&quot;CLOUD_BSSD&quot;-虚拟机，通用型SSD云硬盘</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>计费ID</p> 
     * @return Pid <p>计费ID</p>
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set <p>计费ID</p>
     * @param Pid <p>计费ID</p>
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get <p>实例所属VPC的唯一字符串ID，格式如：vpc-xxx，基础网络时为空字符串</p> 
     * @return UniqVpcId <p>实例所属VPC的唯一字符串ID，格式如：vpc-xxx，基础网络时为空字符串</p>
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set <p>实例所属VPC的唯一字符串ID，格式如：vpc-xxx，基础网络时为空字符串</p>
     * @param UniqVpcId <p>实例所属VPC的唯一字符串ID，格式如：vpc-xxx，基础网络时为空字符串</p>
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get <p>实例所属子网的唯一字符串ID，格式如： subnet-xxx，基础网络时为空字符串</p> 
     * @return UniqSubnetId <p>实例所属子网的唯一字符串ID，格式如： subnet-xxx，基础网络时为空字符串</p>
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set <p>实例所属子网的唯一字符串ID，格式如： subnet-xxx，基础网络时为空字符串</p>
     * @param UniqSubnetId <p>实例所属子网的唯一字符串ID，格式如： subnet-xxx，基础网络时为空字符串</p>
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get <p>实例隔离操作</p> 
     * @return IsolateOperator <p>实例隔离操作</p>
     */
    public String getIsolateOperator() {
        return this.IsolateOperator;
    }

    /**
     * Set <p>实例隔离操作</p>
     * @param IsolateOperator <p>实例隔离操作</p>
     */
    public void setIsolateOperator(String IsolateOperator) {
        this.IsolateOperator = IsolateOperator;
    }

    /**
     * Get <p>发布订阅标识，SUB-订阅实例，PUB-发布实例，空值-没有发布订阅的普通实例</p> 
     * @return SubFlag <p>发布订阅标识，SUB-订阅实例，PUB-发布实例，空值-没有发布订阅的普通实例</p>
     */
    public String getSubFlag() {
        return this.SubFlag;
    }

    /**
     * Set <p>发布订阅标识，SUB-订阅实例，PUB-发布实例，空值-没有发布订阅的普通实例</p>
     * @param SubFlag <p>发布订阅标识，SUB-订阅实例，PUB-发布实例，空值-没有发布订阅的普通实例</p>
     */
    public void setSubFlag(String SubFlag) {
        this.SubFlag = SubFlag;
    }

    /**
     * Get <p>只读标识，RO-只读实例，MASTER-有RO实例的主实例，空值-没有只读组的非RO实例</p> 
     * @return ROFlag <p>只读标识，RO-只读实例，MASTER-有RO实例的主实例，空值-没有只读组的非RO实例</p>
     */
    public String getROFlag() {
        return this.ROFlag;
    }

    /**
     * Set <p>只读标识，RO-只读实例，MASTER-有RO实例的主实例，空值-没有只读组的非RO实例</p>
     * @param ROFlag <p>只读标识，RO-只读实例，MASTER-有RO实例的主实例，空值-没有只读组的非RO实例</p>
     */
    public void setROFlag(String ROFlag) {
        this.ROFlag = ROFlag;
    }

    /**
     * Get <p>容灾类型，MIRROR-镜像，ALWAYSON-AlwaysOn, SINGLE-单例</p> 
     * @return HAFlag <p>容灾类型，MIRROR-镜像，ALWAYSON-AlwaysOn, SINGLE-单例</p>
     */
    public String getHAFlag() {
        return this.HAFlag;
    }

    /**
     * Set <p>容灾类型，MIRROR-镜像，ALWAYSON-AlwaysOn, SINGLE-单例</p>
     * @param HAFlag <p>容灾类型，MIRROR-镜像，ALWAYSON-AlwaysOn, SINGLE-单例</p>
     */
    public void setHAFlag(String HAFlag) {
        this.HAFlag = HAFlag;
    }

    /**
     * Get <p>实例绑定的标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceTags <p>实例绑定的标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceTag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set <p>实例绑定的标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceTags <p>实例绑定的标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceTags(ResourceTag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get <p>备份模式，master_pkg-主节点打包备份(默认) ；master_no_pkg-主节点不打包备份；slave_pkg-从节点打包备份(always on集群有效)；slave_no_pkg-从节点不打包备份(always on集群有效)；只读副本对该值无效。</p> 
     * @return BackupModel <p>备份模式，master_pkg-主节点打包备份(默认) ；master_no_pkg-主节点不打包备份；slave_pkg-从节点打包备份(always on集群有效)；slave_no_pkg-从节点不打包备份(always on集群有效)；只读副本对该值无效。</p>
     */
    public String getBackupModel() {
        return this.BackupModel;
    }

    /**
     * Set <p>备份模式，master_pkg-主节点打包备份(默认) ；master_no_pkg-主节点不打包备份；slave_pkg-从节点打包备份(always on集群有效)；slave_no_pkg-从节点不打包备份(always on集群有效)；只读副本对该值无效。</p>
     * @param BackupModel <p>备份模式，master_pkg-主节点打包备份(默认) ；master_no_pkg-主节点不打包备份；slave_pkg-从节点打包备份(always on集群有效)；slave_no_pkg-从节点不打包备份(always on集群有效)；只读副本对该值无效。</p>
     */
    public void setBackupModel(String BackupModel) {
        this.BackupModel = BackupModel;
    }

    /**
     * Get <p>实例备份信息</p> 
     * @return InstanceNote <p>实例备份信息</p>
     */
    public String getInstanceNote() {
        return this.InstanceNote;
    }

    /**
     * Set <p>实例备份信息</p>
     * @param InstanceNote <p>实例备份信息</p>
     */
    public void setInstanceNote(String InstanceNote) {
        this.InstanceNote = InstanceNote;
    }

    /**
     * Get <p>备份周期</p> 
     * @return BackupCycle <p>备份周期</p>
     */
    public Long [] getBackupCycle() {
        return this.BackupCycle;
    }

    /**
     * Set <p>备份周期</p>
     * @param BackupCycle <p>备份周期</p>
     */
    public void setBackupCycle(Long [] BackupCycle) {
        this.BackupCycle = BackupCycle;
    }

    /**
     * Get <p>备份周期类型，[daily、weekly、monthly]</p> 
     * @return BackupCycleType <p>备份周期类型，[daily、weekly、monthly]</p>
     */
    public String getBackupCycleType() {
        return this.BackupCycleType;
    }

    /**
     * Set <p>备份周期类型，[daily、weekly、monthly]</p>
     * @param BackupCycleType <p>备份周期类型，[daily、weekly、monthly]</p>
     */
    public void setBackupCycleType(String BackupCycleType) {
        this.BackupCycleType = BackupCycleType;
    }

    /**
     * Get <p>数据(日志)备份保留时间</p> 
     * @return BackupSaveDays <p>数据(日志)备份保留时间</p>
     */
    public Long getBackupSaveDays() {
        return this.BackupSaveDays;
    }

    /**
     * Set <p>数据(日志)备份保留时间</p>
     * @param BackupSaveDays <p>数据(日志)备份保留时间</p>
     */
    public void setBackupSaveDays(Long BackupSaveDays) {
        this.BackupSaveDays = BackupSaveDays;
    }

    /**
     * Get <p>实例类型 HA-高可用，RO-只读实例，SI-基础版，BI-商业智能服务，cvmHA-云盘高可用，cvmRO-云盘只读实例，MultiHA-多节点，cvmMultiHA-云盘多节点</p> 
     * @return InstanceType <p>实例类型 HA-高可用，RO-只读实例，SI-基础版，BI-商业智能服务，cvmHA-云盘高可用，cvmRO-云盘只读实例，MultiHA-多节点，cvmMultiHA-云盘多节点</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>实例类型 HA-高可用，RO-只读实例，SI-基础版，BI-商业智能服务，cvmHA-云盘高可用，cvmRO-云盘只读实例，MultiHA-多节点，cvmMultiHA-云盘多节点</p>
     * @param InstanceType <p>实例类型 HA-高可用，RO-只读实例，SI-基础版，BI-商业智能服务，cvmHA-云盘高可用，cvmRO-云盘只读实例，MultiHA-多节点，cvmMultiHA-云盘多节点</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>跨地域备份目的地域，如果为空，则表示未开启跨地域备份</p> 
     * @return CrossRegions <p>跨地域备份目的地域，如果为空，则表示未开启跨地域备份</p>
     */
    public String [] getCrossRegions() {
        return this.CrossRegions;
    }

    /**
     * Set <p>跨地域备份目的地域，如果为空，则表示未开启跨地域备份</p>
     * @param CrossRegions <p>跨地域备份目的地域，如果为空，则表示未开启跨地域备份</p>
     */
    public void setCrossRegions(String [] CrossRegions) {
        this.CrossRegions = CrossRegions;
    }

    /**
     * Get <p>跨地域备份状态 enable-开启，disable-关闭</p> 
     * @return CrossBackupEnabled <p>跨地域备份状态 enable-开启，disable-关闭</p>
     */
    public String getCrossBackupEnabled() {
        return this.CrossBackupEnabled;
    }

    /**
     * Set <p>跨地域备份状态 enable-开启，disable-关闭</p>
     * @param CrossBackupEnabled <p>跨地域备份状态 enable-开启，disable-关闭</p>
     */
    public void setCrossBackupEnabled(String CrossBackupEnabled) {
        this.CrossBackupEnabled = CrossBackupEnabled;
    }

    /**
     * Get <p>跨地域备份保留天数，则默认7天</p> 
     * @return CrossBackupSaveDays <p>跨地域备份保留天数，则默认7天</p>
     */
    public Long getCrossBackupSaveDays() {
        return this.CrossBackupSaveDays;
    }

    /**
     * Set <p>跨地域备份保留天数，则默认7天</p>
     * @param CrossBackupSaveDays <p>跨地域备份保留天数，则默认7天</p>
     */
    public void setCrossBackupSaveDays(Long CrossBackupSaveDays) {
        this.CrossBackupSaveDays = CrossBackupSaveDays;
    }

    /**
     * Get <p>外网地址域名</p> 
     * @return DnsPodDomain <p>外网地址域名</p>
     */
    public String getDnsPodDomain() {
        return this.DnsPodDomain;
    }

    /**
     * Set <p>外网地址域名</p>
     * @param DnsPodDomain <p>外网地址域名</p>
     */
    public void setDnsPodDomain(String DnsPodDomain) {
        this.DnsPodDomain = DnsPodDomain;
    }

    /**
     * Get <p>外网端口号</p> 
     * @return TgwWanVPort <p>外网端口号</p>
     */
    public Long getTgwWanVPort() {
        return this.TgwWanVPort;
    }

    /**
     * Set <p>外网端口号</p>
     * @param TgwWanVPort <p>外网端口号</p>
     */
    public void setTgwWanVPort(Long TgwWanVPort) {
        this.TgwWanVPort = TgwWanVPort;
    }

    /**
     * Get <p>系统字符集排序规则，默认：Chinese_PRC_CI_AS</p> 
     * @return Collation <p>系统字符集排序规则，默认：Chinese_PRC_CI_AS</p>
     */
    public String getCollation() {
        return this.Collation;
    }

    /**
     * Set <p>系统字符集排序规则，默认：Chinese_PRC_CI_AS</p>
     * @param Collation <p>系统字符集排序规则，默认：Chinese_PRC_CI_AS</p>
     */
    public void setCollation(String Collation) {
        this.Collation = Collation;
    }

    /**
     * Get <p>系统时区，默认：China Standard Time</p> 
     * @return TimeZone <p>系统时区，默认：China Standard Time</p>
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set <p>系统时区，默认：China Standard Time</p>
     * @param TimeZone <p>系统时区，默认：China Standard Time</p>
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    /**
     * Get <p>是否跨AZ</p> 
     * @return IsDrZone <p>是否跨AZ</p>
     */
    public Boolean getIsDrZone() {
        return this.IsDrZone;
    }

    /**
     * Set <p>是否跨AZ</p>
     * @param IsDrZone <p>是否跨AZ</p>
     */
    public void setIsDrZone(Boolean IsDrZone) {
        this.IsDrZone = IsDrZone;
    }

    /**
     * Get <p>双节点实例备可用区信息</p> 
     * @return SlaveZones <p>双节点实例备可用区信息</p>
     */
    public SlaveZones getSlaveZones() {
        return this.SlaveZones;
    }

    /**
     * Set <p>双节点实例备可用区信息</p>
     * @param SlaveZones <p>双节点实例备可用区信息</p>
     */
    public void setSlaveZones(SlaveZones SlaveZones) {
        this.SlaveZones = SlaveZones;
    }

    /**
     * Get <p>架构标识，SINGLE-单节点 DOUBLE-双节点</p> 
     * @return Architecture <p>架构标识，SINGLE-单节点 DOUBLE-双节点</p>
     */
    public String getArchitecture() {
        return this.Architecture;
    }

    /**
     * Set <p>架构标识，SINGLE-单节点 DOUBLE-双节点</p>
     * @param Architecture <p>架构标识，SINGLE-单节点 DOUBLE-双节点</p>
     */
    public void setArchitecture(String Architecture) {
        this.Architecture = Architecture;
    }

    /**
     * Get <p>类型标识，EXCLUSIVE-独享型，SHARED-共享型</p> 
     * @return Style <p>类型标识，EXCLUSIVE-独享型，SHARED-共享型</p>
     */
    public String getStyle() {
        return this.Style;
    }

    /**
     * Set <p>类型标识，EXCLUSIVE-独享型，SHARED-共享型</p>
     * @param Style <p>类型标识，EXCLUSIVE-独享型，SHARED-共享型</p>
     */
    public void setStyle(String Style) {
        this.Style = Style;
    }

    /**
     * Get <p>多节点实例备可用区信息</p> 
     * @return MultiSlaveZones <p>多节点实例备可用区信息</p>
     */
    public SlaveZones [] getMultiSlaveZones() {
        return this.MultiSlaveZones;
    }

    /**
     * Set <p>多节点实例备可用区信息</p>
     * @param MultiSlaveZones <p>多节点实例备可用区信息</p>
     */
    public void setMultiSlaveZones(SlaveZones [] MultiSlaveZones) {
        this.MultiSlaveZones = MultiSlaveZones;
    }

    /**
     * Get <p>额外IO吞吐量</p><p>单位：MB/s</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ThroughputPerformance <p>额外IO吞吐量</p><p>单位：MB/s</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getThroughputPerformance() {
        return this.ThroughputPerformance;
    }

    /**
     * Set <p>额外IO吞吐量</p><p>单位：MB/s</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ThroughputPerformance <p>额外IO吞吐量</p><p>单位：MB/s</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setThroughputPerformance(Long ThroughputPerformance) {
        this.ThroughputPerformance = ThroughputPerformance;
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
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
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
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.IsolateTime != null) {
            this.IsolateTime = new String(source.IsolateTime);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.UsedStorage != null) {
            this.UsedStorage = new Long(source.UsedStorage);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.Model != null) {
            this.Model = new Long(source.Model);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.BackupTime != null) {
            this.BackupTime = new String(source.BackupTime);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.Uid != null) {
            this.Uid = new String(source.Uid);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Pid != null) {
            this.Pid = new Long(source.Pid);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.IsolateOperator != null) {
            this.IsolateOperator = new String(source.IsolateOperator);
        }
        if (source.SubFlag != null) {
            this.SubFlag = new String(source.SubFlag);
        }
        if (source.ROFlag != null) {
            this.ROFlag = new String(source.ROFlag);
        }
        if (source.HAFlag != null) {
            this.HAFlag = new String(source.HAFlag);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new ResourceTag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new ResourceTag(source.ResourceTags[i]);
            }
        }
        if (source.BackupModel != null) {
            this.BackupModel = new String(source.BackupModel);
        }
        if (source.InstanceNote != null) {
            this.InstanceNote = new String(source.InstanceNote);
        }
        if (source.BackupCycle != null) {
            this.BackupCycle = new Long[source.BackupCycle.length];
            for (int i = 0; i < source.BackupCycle.length; i++) {
                this.BackupCycle[i] = new Long(source.BackupCycle[i]);
            }
        }
        if (source.BackupCycleType != null) {
            this.BackupCycleType = new String(source.BackupCycleType);
        }
        if (source.BackupSaveDays != null) {
            this.BackupSaveDays = new Long(source.BackupSaveDays);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.CrossRegions != null) {
            this.CrossRegions = new String[source.CrossRegions.length];
            for (int i = 0; i < source.CrossRegions.length; i++) {
                this.CrossRegions[i] = new String(source.CrossRegions[i]);
            }
        }
        if (source.CrossBackupEnabled != null) {
            this.CrossBackupEnabled = new String(source.CrossBackupEnabled);
        }
        if (source.CrossBackupSaveDays != null) {
            this.CrossBackupSaveDays = new Long(source.CrossBackupSaveDays);
        }
        if (source.DnsPodDomain != null) {
            this.DnsPodDomain = new String(source.DnsPodDomain);
        }
        if (source.TgwWanVPort != null) {
            this.TgwWanVPort = new Long(source.TgwWanVPort);
        }
        if (source.Collation != null) {
            this.Collation = new String(source.Collation);
        }
        if (source.TimeZone != null) {
            this.TimeZone = new String(source.TimeZone);
        }
        if (source.IsDrZone != null) {
            this.IsDrZone = new Boolean(source.IsDrZone);
        }
        if (source.SlaveZones != null) {
            this.SlaveZones = new SlaveZones(source.SlaveZones);
        }
        if (source.Architecture != null) {
            this.Architecture = new String(source.Architecture);
        }
        if (source.Style != null) {
            this.Style = new String(source.Style);
        }
        if (source.MultiSlaveZones != null) {
            this.MultiSlaveZones = new SlaveZones[source.MultiSlaveZones.length];
            for (int i = 0; i < source.MultiSlaveZones.length; i++) {
                this.MultiSlaveZones[i] = new SlaveZones(source.MultiSlaveZones[i]);
            }
        }
        if (source.ThroughputPerformance != null) {
            this.ThroughputPerformance = new Long(source.ThroughputPerformance);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "IsolateTime", this.IsolateTime);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "UsedStorage", this.UsedStorage);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "BackupTime", this.BackupTime);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "IsolateOperator", this.IsolateOperator);
        this.setParamSimple(map, prefix + "SubFlag", this.SubFlag);
        this.setParamSimple(map, prefix + "ROFlag", this.ROFlag);
        this.setParamSimple(map, prefix + "HAFlag", this.HAFlag);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "BackupModel", this.BackupModel);
        this.setParamSimple(map, prefix + "InstanceNote", this.InstanceNote);
        this.setParamArraySimple(map, prefix + "BackupCycle.", this.BackupCycle);
        this.setParamSimple(map, prefix + "BackupCycleType", this.BackupCycleType);
        this.setParamSimple(map, prefix + "BackupSaveDays", this.BackupSaveDays);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamArraySimple(map, prefix + "CrossRegions.", this.CrossRegions);
        this.setParamSimple(map, prefix + "CrossBackupEnabled", this.CrossBackupEnabled);
        this.setParamSimple(map, prefix + "CrossBackupSaveDays", this.CrossBackupSaveDays);
        this.setParamSimple(map, prefix + "DnsPodDomain", this.DnsPodDomain);
        this.setParamSimple(map, prefix + "TgwWanVPort", this.TgwWanVPort);
        this.setParamSimple(map, prefix + "Collation", this.Collation);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);
        this.setParamSimple(map, prefix + "IsDrZone", this.IsDrZone);
        this.setParamObj(map, prefix + "SlaveZones.", this.SlaveZones);
        this.setParamSimple(map, prefix + "Architecture", this.Architecture);
        this.setParamSimple(map, prefix + "Style", this.Style);
        this.setParamArrayObj(map, prefix + "MultiSlaveZones.", this.MultiSlaveZones);
        this.setParamSimple(map, prefix + "ThroughputPerformance", this.ThroughputPerformance);

    }
}

