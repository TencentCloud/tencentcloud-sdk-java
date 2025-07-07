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
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 实例所在项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 实例所在地域ID
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 实例所在可用区ID
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 实例所在私有网络ID，基础网络时为 0
    */
    @SerializedName("VpcId")
    @Expose
    private Long VpcId;

    /**
    * 实例所在私有网络子网ID，基础网络时为 0
    */
    @SerializedName("SubnetId")
    @Expose
    private Long SubnetId;

    /**
    * 实例状态。取值范围： <li>1：申请中</li> <li>2：运行中</li> <li>3：受限运行中 (主备切换中)</li> <li>4：已隔离</li> <li>5：回收中</li> <li>6：已回收</li> <li>7：任务执行中 (实例做备份、回档等操作)</li> <li>8：已下线</li> <li>9：实例扩容中</li> <li>10：实例迁移中</li> <li>11：只读</li> <li>12：重启中</li>  <li>13：实例修改中且待切换</li> <li>14：订阅发布创建中</li> <li>15：订阅发布修改中</li> <li>16：实例修改中且切换中</li> <li>17：创建RO副本中</li>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 实例访问IP
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 实例访问端口
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * 实例创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 实例更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 实例计费开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 实例计费结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 实例隔离时间
    */
    @SerializedName("IsolateTime")
    @Expose
    private String IsolateTime;

    /**
    * 实例内存大小，单位G
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 实例已经使用存储空间大小，单位G
    */
    @SerializedName("UsedStorage")
    @Expose
    private Long UsedStorage;

    /**
    * 实例存储空间大小，单位G
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * 实例版本
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * 实例续费标记，0-正常续费，1-自动续费，2-到期不续费
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * 实例高可用， 1-双机高可用，2-单机，3-跨可用区，4-集群跨可用区，5-集群，6-多节点集群，7-多节点集群跨可用区，9-自研机房
    */
    @SerializedName("Model")
    @Expose
    private Long Model;

    /**
    * 实例所在地域名称，如 ap-guangzhou
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 实例所在可用区名称，如 ap-guangzhou-1
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 备份时间点
    */
    @SerializedName("BackupTime")
    @Expose
    private String BackupTime;

    /**
    * 实例付费模式， 0-按量计费，1-包年包月
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 实例唯一UID
    */
    @SerializedName("Uid")
    @Expose
    private String Uid;

    /**
    * 实例cpu核心数
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 实例版本代号
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 实例类型代号："TS85"-物理机，本地SSD硬盘；"Z3"-物理机早期版本，本地SSD硬盘；"CLOUD_BASIC"-虚拟机，普通云硬盘；"CLOUD_PREMIUM"-虚拟机，高性能云硬盘；"CLOUD_SSD"-虚拟机，云SSD硬盘；"CLOUD_HSSD"-虚拟机，增强型SSD云硬盘；"CLOUD_TSSD"-虚拟机，极速型SSD云硬盘；"CLOUD_BSSD"-虚拟机，通用型SSD云硬盘
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 计费ID
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * 实例所属VPC的唯一字符串ID，格式如：vpc-xxx，基础网络时为空字符串
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * 实例所属子网的唯一字符串ID，格式如： subnet-xxx，基础网络时为空字符串
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * 实例隔离操作
    */
    @SerializedName("IsolateOperator")
    @Expose
    private String IsolateOperator;

    /**
    * 发布订阅标识，SUB-订阅实例，PUB-发布实例，空值-没有发布订阅的普通实例
    */
    @SerializedName("SubFlag")
    @Expose
    private String SubFlag;

    /**
    * 只读标识，RO-只读实例，MASTER-有RO实例的主实例，空值-没有只读组的非RO实例
    */
    @SerializedName("ROFlag")
    @Expose
    private String ROFlag;

    /**
    * 容灾类型，MIRROR-镜像，ALWAYSON-AlwaysOn, SINGLE-单例
    */
    @SerializedName("HAFlag")
    @Expose
    private String HAFlag;

    /**
    * 实例绑定的标签列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceTags")
    @Expose
    private ResourceTag [] ResourceTags;

    /**
    * 备份模式，master_pkg-主节点打包备份(默认) ；master_no_pkg-主节点不打包备份；slave_pkg-从节点打包备份(always on集群有效)；slave_no_pkg-从节点不打包备份(always on集群有效)；只读副本对该值无效。
    */
    @SerializedName("BackupModel")
    @Expose
    private String BackupModel;

    /**
    * 实例备份信息
    */
    @SerializedName("InstanceNote")
    @Expose
    private String InstanceNote;

    /**
    * 备份周期
    */
    @SerializedName("BackupCycle")
    @Expose
    private Long [] BackupCycle;

    /**
    * 备份周期类型，[daily、weekly、monthly]
    */
    @SerializedName("BackupCycleType")
    @Expose
    private String BackupCycleType;

    /**
    * 数据(日志)备份保留时间
    */
    @SerializedName("BackupSaveDays")
    @Expose
    private Long BackupSaveDays;

    /**
    * 实例类型 HA-高可用，RO-只读实例，SI-基础版，BI-商业智能服务，cvmHA-云盘高可用，cvmRO-云盘只读实例，MultiHA-多节点，cvmMultiHA-云盘多节点

    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 跨地域备份目的地域，如果为空，则表示未开启跨地域备份
    */
    @SerializedName("CrossRegions")
    @Expose
    private String [] CrossRegions;

    /**
    * 跨地域备份状态 enable-开启，disable-关闭
    */
    @SerializedName("CrossBackupEnabled")
    @Expose
    private String CrossBackupEnabled;

    /**
    * 跨地域备份保留天数，则默认7天
    */
    @SerializedName("CrossBackupSaveDays")
    @Expose
    private Long CrossBackupSaveDays;

    /**
    * 外网地址域名
    */
    @SerializedName("DnsPodDomain")
    @Expose
    private String DnsPodDomain;

    /**
    * 外网端口号
    */
    @SerializedName("TgwWanVPort")
    @Expose
    private Long TgwWanVPort;

    /**
    * 系统字符集排序规则，默认：Chinese_PRC_CI_AS
    */
    @SerializedName("Collation")
    @Expose
    private String Collation;

    /**
    * 系统时区，默认：China Standard Time
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
    * 是否跨AZ
    */
    @SerializedName("IsDrZone")
    @Expose
    private Boolean IsDrZone;

    /**
    * 双节点实例备可用区信息
    */
    @SerializedName("SlaveZones")
    @Expose
    private SlaveZones SlaveZones;

    /**
    * 架构标识，SINGLE-单节点 DOUBLE-双节点
    */
    @SerializedName("Architecture")
    @Expose
    private String Architecture;

    /**
    * 类型标识，EXCLUSIVE-独享型，SHARED-共享型
    */
    @SerializedName("Style")
    @Expose
    private String Style;

    /**
    * 多节点实例备可用区信息
    */
    @SerializedName("MultiSlaveZones")
    @Expose
    private SlaveZones [] MultiSlaveZones;

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
     * @return Name 实例名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 实例名称
     * @param Name 实例名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 实例所在项目ID 
     * @return ProjectId 实例所在项目ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 实例所在项目ID
     * @param ProjectId 实例所在项目ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 实例所在地域ID 
     * @return RegionId 实例所在地域ID
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 实例所在地域ID
     * @param RegionId 实例所在地域ID
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 实例所在可用区ID 
     * @return ZoneId 实例所在可用区ID
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 实例所在可用区ID
     * @param ZoneId 实例所在可用区ID
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 实例所在私有网络ID，基础网络时为 0 
     * @return VpcId 实例所在私有网络ID，基础网络时为 0
     */
    public Long getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 实例所在私有网络ID，基础网络时为 0
     * @param VpcId 实例所在私有网络ID，基础网络时为 0
     */
    public void setVpcId(Long VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 实例所在私有网络子网ID，基础网络时为 0 
     * @return SubnetId 实例所在私有网络子网ID，基础网络时为 0
     */
    public Long getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 实例所在私有网络子网ID，基础网络时为 0
     * @param SubnetId 实例所在私有网络子网ID，基础网络时为 0
     */
    public void setSubnetId(Long SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 实例状态。取值范围： <li>1：申请中</li> <li>2：运行中</li> <li>3：受限运行中 (主备切换中)</li> <li>4：已隔离</li> <li>5：回收中</li> <li>6：已回收</li> <li>7：任务执行中 (实例做备份、回档等操作)</li> <li>8：已下线</li> <li>9：实例扩容中</li> <li>10：实例迁移中</li> <li>11：只读</li> <li>12：重启中</li>  <li>13：实例修改中且待切换</li> <li>14：订阅发布创建中</li> <li>15：订阅发布修改中</li> <li>16：实例修改中且切换中</li> <li>17：创建RO副本中</li> 
     * @return Status 实例状态。取值范围： <li>1：申请中</li> <li>2：运行中</li> <li>3：受限运行中 (主备切换中)</li> <li>4：已隔离</li> <li>5：回收中</li> <li>6：已回收</li> <li>7：任务执行中 (实例做备份、回档等操作)</li> <li>8：已下线</li> <li>9：实例扩容中</li> <li>10：实例迁移中</li> <li>11：只读</li> <li>12：重启中</li>  <li>13：实例修改中且待切换</li> <li>14：订阅发布创建中</li> <li>15：订阅发布修改中</li> <li>16：实例修改中且切换中</li> <li>17：创建RO副本中</li>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 实例状态。取值范围： <li>1：申请中</li> <li>2：运行中</li> <li>3：受限运行中 (主备切换中)</li> <li>4：已隔离</li> <li>5：回收中</li> <li>6：已回收</li> <li>7：任务执行中 (实例做备份、回档等操作)</li> <li>8：已下线</li> <li>9：实例扩容中</li> <li>10：实例迁移中</li> <li>11：只读</li> <li>12：重启中</li>  <li>13：实例修改中且待切换</li> <li>14：订阅发布创建中</li> <li>15：订阅发布修改中</li> <li>16：实例修改中且切换中</li> <li>17：创建RO副本中</li>
     * @param Status 实例状态。取值范围： <li>1：申请中</li> <li>2：运行中</li> <li>3：受限运行中 (主备切换中)</li> <li>4：已隔离</li> <li>5：回收中</li> <li>6：已回收</li> <li>7：任务执行中 (实例做备份、回档等操作)</li> <li>8：已下线</li> <li>9：实例扩容中</li> <li>10：实例迁移中</li> <li>11：只读</li> <li>12：重启中</li>  <li>13：实例修改中且待切换</li> <li>14：订阅发布创建中</li> <li>15：订阅发布修改中</li> <li>16：实例修改中且切换中</li> <li>17：创建RO副本中</li>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 实例访问IP 
     * @return Vip 实例访问IP
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 实例访问IP
     * @param Vip 实例访问IP
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 实例访问端口 
     * @return Vport 实例访问端口
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set 实例访问端口
     * @param Vport 实例访问端口
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get 实例创建时间 
     * @return CreateTime 实例创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 实例创建时间
     * @param CreateTime 实例创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 实例更新时间 
     * @return UpdateTime 实例更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 实例更新时间
     * @param UpdateTime 实例更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 实例计费开始时间 
     * @return StartTime 实例计费开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 实例计费开始时间
     * @param StartTime 实例计费开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 实例计费结束时间 
     * @return EndTime 实例计费结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 实例计费结束时间
     * @param EndTime 实例计费结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 实例隔离时间 
     * @return IsolateTime 实例隔离时间
     */
    public String getIsolateTime() {
        return this.IsolateTime;
    }

    /**
     * Set 实例隔离时间
     * @param IsolateTime 实例隔离时间
     */
    public void setIsolateTime(String IsolateTime) {
        this.IsolateTime = IsolateTime;
    }

    /**
     * Get 实例内存大小，单位G 
     * @return Memory 实例内存大小，单位G
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 实例内存大小，单位G
     * @param Memory 实例内存大小，单位G
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 实例已经使用存储空间大小，单位G 
     * @return UsedStorage 实例已经使用存储空间大小，单位G
     */
    public Long getUsedStorage() {
        return this.UsedStorage;
    }

    /**
     * Set 实例已经使用存储空间大小，单位G
     * @param UsedStorage 实例已经使用存储空间大小，单位G
     */
    public void setUsedStorage(Long UsedStorage) {
        this.UsedStorage = UsedStorage;
    }

    /**
     * Get 实例存储空间大小，单位G 
     * @return Storage 实例存储空间大小，单位G
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set 实例存储空间大小，单位G
     * @param Storage 实例存储空间大小，单位G
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get 实例版本 
     * @return VersionName 实例版本
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set 实例版本
     * @param VersionName 实例版本
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get 实例续费标记，0-正常续费，1-自动续费，2-到期不续费 
     * @return RenewFlag 实例续费标记，0-正常续费，1-自动续费，2-到期不续费
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 实例续费标记，0-正常续费，1-自动续费，2-到期不续费
     * @param RenewFlag 实例续费标记，0-正常续费，1-自动续费，2-到期不续费
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 实例高可用， 1-双机高可用，2-单机，3-跨可用区，4-集群跨可用区，5-集群，6-多节点集群，7-多节点集群跨可用区，9-自研机房 
     * @return Model 实例高可用， 1-双机高可用，2-单机，3-跨可用区，4-集群跨可用区，5-集群，6-多节点集群，7-多节点集群跨可用区，9-自研机房
     */
    public Long getModel() {
        return this.Model;
    }

    /**
     * Set 实例高可用， 1-双机高可用，2-单机，3-跨可用区，4-集群跨可用区，5-集群，6-多节点集群，7-多节点集群跨可用区，9-自研机房
     * @param Model 实例高可用， 1-双机高可用，2-单机，3-跨可用区，4-集群跨可用区，5-集群，6-多节点集群，7-多节点集群跨可用区，9-自研机房
     */
    public void setModel(Long Model) {
        this.Model = Model;
    }

    /**
     * Get 实例所在地域名称，如 ap-guangzhou 
     * @return Region 实例所在地域名称，如 ap-guangzhou
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 实例所在地域名称，如 ap-guangzhou
     * @param Region 实例所在地域名称，如 ap-guangzhou
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 实例所在可用区名称，如 ap-guangzhou-1 
     * @return Zone 实例所在可用区名称，如 ap-guangzhou-1
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 实例所在可用区名称，如 ap-guangzhou-1
     * @param Zone 实例所在可用区名称，如 ap-guangzhou-1
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 备份时间点 
     * @return BackupTime 备份时间点
     */
    public String getBackupTime() {
        return this.BackupTime;
    }

    /**
     * Set 备份时间点
     * @param BackupTime 备份时间点
     */
    public void setBackupTime(String BackupTime) {
        this.BackupTime = BackupTime;
    }

    /**
     * Get 实例付费模式， 0-按量计费，1-包年包月 
     * @return PayMode 实例付费模式， 0-按量计费，1-包年包月
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 实例付费模式， 0-按量计费，1-包年包月
     * @param PayMode 实例付费模式， 0-按量计费，1-包年包月
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 实例唯一UID 
     * @return Uid 实例唯一UID
     */
    public String getUid() {
        return this.Uid;
    }

    /**
     * Set 实例唯一UID
     * @param Uid 实例唯一UID
     */
    public void setUid(String Uid) {
        this.Uid = Uid;
    }

    /**
     * Get 实例cpu核心数 
     * @return Cpu 实例cpu核心数
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set 实例cpu核心数
     * @param Cpu 实例cpu核心数
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 实例版本代号 
     * @return Version 实例版本代号
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 实例版本代号
     * @param Version 实例版本代号
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 实例类型代号："TS85"-物理机，本地SSD硬盘；"Z3"-物理机早期版本，本地SSD硬盘；"CLOUD_BASIC"-虚拟机，普通云硬盘；"CLOUD_PREMIUM"-虚拟机，高性能云硬盘；"CLOUD_SSD"-虚拟机，云SSD硬盘；"CLOUD_HSSD"-虚拟机，增强型SSD云硬盘；"CLOUD_TSSD"-虚拟机，极速型SSD云硬盘；"CLOUD_BSSD"-虚拟机，通用型SSD云硬盘 
     * @return Type 实例类型代号："TS85"-物理机，本地SSD硬盘；"Z3"-物理机早期版本，本地SSD硬盘；"CLOUD_BASIC"-虚拟机，普通云硬盘；"CLOUD_PREMIUM"-虚拟机，高性能云硬盘；"CLOUD_SSD"-虚拟机，云SSD硬盘；"CLOUD_HSSD"-虚拟机，增强型SSD云硬盘；"CLOUD_TSSD"-虚拟机，极速型SSD云硬盘；"CLOUD_BSSD"-虚拟机，通用型SSD云硬盘
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 实例类型代号："TS85"-物理机，本地SSD硬盘；"Z3"-物理机早期版本，本地SSD硬盘；"CLOUD_BASIC"-虚拟机，普通云硬盘；"CLOUD_PREMIUM"-虚拟机，高性能云硬盘；"CLOUD_SSD"-虚拟机，云SSD硬盘；"CLOUD_HSSD"-虚拟机，增强型SSD云硬盘；"CLOUD_TSSD"-虚拟机，极速型SSD云硬盘；"CLOUD_BSSD"-虚拟机，通用型SSD云硬盘
     * @param Type 实例类型代号："TS85"-物理机，本地SSD硬盘；"Z3"-物理机早期版本，本地SSD硬盘；"CLOUD_BASIC"-虚拟机，普通云硬盘；"CLOUD_PREMIUM"-虚拟机，高性能云硬盘；"CLOUD_SSD"-虚拟机，云SSD硬盘；"CLOUD_HSSD"-虚拟机，增强型SSD云硬盘；"CLOUD_TSSD"-虚拟机，极速型SSD云硬盘；"CLOUD_BSSD"-虚拟机，通用型SSD云硬盘
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 计费ID 
     * @return Pid 计费ID
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set 计费ID
     * @param Pid 计费ID
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get 实例所属VPC的唯一字符串ID，格式如：vpc-xxx，基础网络时为空字符串 
     * @return UniqVpcId 实例所属VPC的唯一字符串ID，格式如：vpc-xxx，基础网络时为空字符串
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set 实例所属VPC的唯一字符串ID，格式如：vpc-xxx，基础网络时为空字符串
     * @param UniqVpcId 实例所属VPC的唯一字符串ID，格式如：vpc-xxx，基础网络时为空字符串
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get 实例所属子网的唯一字符串ID，格式如： subnet-xxx，基础网络时为空字符串 
     * @return UniqSubnetId 实例所属子网的唯一字符串ID，格式如： subnet-xxx，基础网络时为空字符串
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set 实例所属子网的唯一字符串ID，格式如： subnet-xxx，基础网络时为空字符串
     * @param UniqSubnetId 实例所属子网的唯一字符串ID，格式如： subnet-xxx，基础网络时为空字符串
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get 实例隔离操作 
     * @return IsolateOperator 实例隔离操作
     */
    public String getIsolateOperator() {
        return this.IsolateOperator;
    }

    /**
     * Set 实例隔离操作
     * @param IsolateOperator 实例隔离操作
     */
    public void setIsolateOperator(String IsolateOperator) {
        this.IsolateOperator = IsolateOperator;
    }

    /**
     * Get 发布订阅标识，SUB-订阅实例，PUB-发布实例，空值-没有发布订阅的普通实例 
     * @return SubFlag 发布订阅标识，SUB-订阅实例，PUB-发布实例，空值-没有发布订阅的普通实例
     */
    public String getSubFlag() {
        return this.SubFlag;
    }

    /**
     * Set 发布订阅标识，SUB-订阅实例，PUB-发布实例，空值-没有发布订阅的普通实例
     * @param SubFlag 发布订阅标识，SUB-订阅实例，PUB-发布实例，空值-没有发布订阅的普通实例
     */
    public void setSubFlag(String SubFlag) {
        this.SubFlag = SubFlag;
    }

    /**
     * Get 只读标识，RO-只读实例，MASTER-有RO实例的主实例，空值-没有只读组的非RO实例 
     * @return ROFlag 只读标识，RO-只读实例，MASTER-有RO实例的主实例，空值-没有只读组的非RO实例
     */
    public String getROFlag() {
        return this.ROFlag;
    }

    /**
     * Set 只读标识，RO-只读实例，MASTER-有RO实例的主实例，空值-没有只读组的非RO实例
     * @param ROFlag 只读标识，RO-只读实例，MASTER-有RO实例的主实例，空值-没有只读组的非RO实例
     */
    public void setROFlag(String ROFlag) {
        this.ROFlag = ROFlag;
    }

    /**
     * Get 容灾类型，MIRROR-镜像，ALWAYSON-AlwaysOn, SINGLE-单例 
     * @return HAFlag 容灾类型，MIRROR-镜像，ALWAYSON-AlwaysOn, SINGLE-单例
     */
    public String getHAFlag() {
        return this.HAFlag;
    }

    /**
     * Set 容灾类型，MIRROR-镜像，ALWAYSON-AlwaysOn, SINGLE-单例
     * @param HAFlag 容灾类型，MIRROR-镜像，ALWAYSON-AlwaysOn, SINGLE-单例
     */
    public void setHAFlag(String HAFlag) {
        this.HAFlag = HAFlag;
    }

    /**
     * Get 实例绑定的标签列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceTags 实例绑定的标签列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceTag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set 实例绑定的标签列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceTags 实例绑定的标签列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceTags(ResourceTag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get 备份模式，master_pkg-主节点打包备份(默认) ；master_no_pkg-主节点不打包备份；slave_pkg-从节点打包备份(always on集群有效)；slave_no_pkg-从节点不打包备份(always on集群有效)；只读副本对该值无效。 
     * @return BackupModel 备份模式，master_pkg-主节点打包备份(默认) ；master_no_pkg-主节点不打包备份；slave_pkg-从节点打包备份(always on集群有效)；slave_no_pkg-从节点不打包备份(always on集群有效)；只读副本对该值无效。
     */
    public String getBackupModel() {
        return this.BackupModel;
    }

    /**
     * Set 备份模式，master_pkg-主节点打包备份(默认) ；master_no_pkg-主节点不打包备份；slave_pkg-从节点打包备份(always on集群有效)；slave_no_pkg-从节点不打包备份(always on集群有效)；只读副本对该值无效。
     * @param BackupModel 备份模式，master_pkg-主节点打包备份(默认) ；master_no_pkg-主节点不打包备份；slave_pkg-从节点打包备份(always on集群有效)；slave_no_pkg-从节点不打包备份(always on集群有效)；只读副本对该值无效。
     */
    public void setBackupModel(String BackupModel) {
        this.BackupModel = BackupModel;
    }

    /**
     * Get 实例备份信息 
     * @return InstanceNote 实例备份信息
     */
    public String getInstanceNote() {
        return this.InstanceNote;
    }

    /**
     * Set 实例备份信息
     * @param InstanceNote 实例备份信息
     */
    public void setInstanceNote(String InstanceNote) {
        this.InstanceNote = InstanceNote;
    }

    /**
     * Get 备份周期 
     * @return BackupCycle 备份周期
     */
    public Long [] getBackupCycle() {
        return this.BackupCycle;
    }

    /**
     * Set 备份周期
     * @param BackupCycle 备份周期
     */
    public void setBackupCycle(Long [] BackupCycle) {
        this.BackupCycle = BackupCycle;
    }

    /**
     * Get 备份周期类型，[daily、weekly、monthly] 
     * @return BackupCycleType 备份周期类型，[daily、weekly、monthly]
     */
    public String getBackupCycleType() {
        return this.BackupCycleType;
    }

    /**
     * Set 备份周期类型，[daily、weekly、monthly]
     * @param BackupCycleType 备份周期类型，[daily、weekly、monthly]
     */
    public void setBackupCycleType(String BackupCycleType) {
        this.BackupCycleType = BackupCycleType;
    }

    /**
     * Get 数据(日志)备份保留时间 
     * @return BackupSaveDays 数据(日志)备份保留时间
     */
    public Long getBackupSaveDays() {
        return this.BackupSaveDays;
    }

    /**
     * Set 数据(日志)备份保留时间
     * @param BackupSaveDays 数据(日志)备份保留时间
     */
    public void setBackupSaveDays(Long BackupSaveDays) {
        this.BackupSaveDays = BackupSaveDays;
    }

    /**
     * Get 实例类型 HA-高可用，RO-只读实例，SI-基础版，BI-商业智能服务，cvmHA-云盘高可用，cvmRO-云盘只读实例，MultiHA-多节点，cvmMultiHA-云盘多节点
 
     * @return InstanceType 实例类型 HA-高可用，RO-只读实例，SI-基础版，BI-商业智能服务，cvmHA-云盘高可用，cvmRO-云盘只读实例，MultiHA-多节点，cvmMultiHA-云盘多节点

     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型 HA-高可用，RO-只读实例，SI-基础版，BI-商业智能服务，cvmHA-云盘高可用，cvmRO-云盘只读实例，MultiHA-多节点，cvmMultiHA-云盘多节点

     * @param InstanceType 实例类型 HA-高可用，RO-只读实例，SI-基础版，BI-商业智能服务，cvmHA-云盘高可用，cvmRO-云盘只读实例，MultiHA-多节点，cvmMultiHA-云盘多节点

     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 跨地域备份目的地域，如果为空，则表示未开启跨地域备份 
     * @return CrossRegions 跨地域备份目的地域，如果为空，则表示未开启跨地域备份
     */
    public String [] getCrossRegions() {
        return this.CrossRegions;
    }

    /**
     * Set 跨地域备份目的地域，如果为空，则表示未开启跨地域备份
     * @param CrossRegions 跨地域备份目的地域，如果为空，则表示未开启跨地域备份
     */
    public void setCrossRegions(String [] CrossRegions) {
        this.CrossRegions = CrossRegions;
    }

    /**
     * Get 跨地域备份状态 enable-开启，disable-关闭 
     * @return CrossBackupEnabled 跨地域备份状态 enable-开启，disable-关闭
     */
    public String getCrossBackupEnabled() {
        return this.CrossBackupEnabled;
    }

    /**
     * Set 跨地域备份状态 enable-开启，disable-关闭
     * @param CrossBackupEnabled 跨地域备份状态 enable-开启，disable-关闭
     */
    public void setCrossBackupEnabled(String CrossBackupEnabled) {
        this.CrossBackupEnabled = CrossBackupEnabled;
    }

    /**
     * Get 跨地域备份保留天数，则默认7天 
     * @return CrossBackupSaveDays 跨地域备份保留天数，则默认7天
     */
    public Long getCrossBackupSaveDays() {
        return this.CrossBackupSaveDays;
    }

    /**
     * Set 跨地域备份保留天数，则默认7天
     * @param CrossBackupSaveDays 跨地域备份保留天数，则默认7天
     */
    public void setCrossBackupSaveDays(Long CrossBackupSaveDays) {
        this.CrossBackupSaveDays = CrossBackupSaveDays;
    }

    /**
     * Get 外网地址域名 
     * @return DnsPodDomain 外网地址域名
     */
    public String getDnsPodDomain() {
        return this.DnsPodDomain;
    }

    /**
     * Set 外网地址域名
     * @param DnsPodDomain 外网地址域名
     */
    public void setDnsPodDomain(String DnsPodDomain) {
        this.DnsPodDomain = DnsPodDomain;
    }

    /**
     * Get 外网端口号 
     * @return TgwWanVPort 外网端口号
     */
    public Long getTgwWanVPort() {
        return this.TgwWanVPort;
    }

    /**
     * Set 外网端口号
     * @param TgwWanVPort 外网端口号
     */
    public void setTgwWanVPort(Long TgwWanVPort) {
        this.TgwWanVPort = TgwWanVPort;
    }

    /**
     * Get 系统字符集排序规则，默认：Chinese_PRC_CI_AS 
     * @return Collation 系统字符集排序规则，默认：Chinese_PRC_CI_AS
     */
    public String getCollation() {
        return this.Collation;
    }

    /**
     * Set 系统字符集排序规则，默认：Chinese_PRC_CI_AS
     * @param Collation 系统字符集排序规则，默认：Chinese_PRC_CI_AS
     */
    public void setCollation(String Collation) {
        this.Collation = Collation;
    }

    /**
     * Get 系统时区，默认：China Standard Time 
     * @return TimeZone 系统时区，默认：China Standard Time
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set 系统时区，默认：China Standard Time
     * @param TimeZone 系统时区，默认：China Standard Time
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    /**
     * Get 是否跨AZ 
     * @return IsDrZone 是否跨AZ
     */
    public Boolean getIsDrZone() {
        return this.IsDrZone;
    }

    /**
     * Set 是否跨AZ
     * @param IsDrZone 是否跨AZ
     */
    public void setIsDrZone(Boolean IsDrZone) {
        this.IsDrZone = IsDrZone;
    }

    /**
     * Get 双节点实例备可用区信息 
     * @return SlaveZones 双节点实例备可用区信息
     */
    public SlaveZones getSlaveZones() {
        return this.SlaveZones;
    }

    /**
     * Set 双节点实例备可用区信息
     * @param SlaveZones 双节点实例备可用区信息
     */
    public void setSlaveZones(SlaveZones SlaveZones) {
        this.SlaveZones = SlaveZones;
    }

    /**
     * Get 架构标识，SINGLE-单节点 DOUBLE-双节点 
     * @return Architecture 架构标识，SINGLE-单节点 DOUBLE-双节点
     */
    public String getArchitecture() {
        return this.Architecture;
    }

    /**
     * Set 架构标识，SINGLE-单节点 DOUBLE-双节点
     * @param Architecture 架构标识，SINGLE-单节点 DOUBLE-双节点
     */
    public void setArchitecture(String Architecture) {
        this.Architecture = Architecture;
    }

    /**
     * Get 类型标识，EXCLUSIVE-独享型，SHARED-共享型 
     * @return Style 类型标识，EXCLUSIVE-独享型，SHARED-共享型
     */
    public String getStyle() {
        return this.Style;
    }

    /**
     * Set 类型标识，EXCLUSIVE-独享型，SHARED-共享型
     * @param Style 类型标识，EXCLUSIVE-独享型，SHARED-共享型
     */
    public void setStyle(String Style) {
        this.Style = Style;
    }

    /**
     * Get 多节点实例备可用区信息 
     * @return MultiSlaveZones 多节点实例备可用区信息
     */
    public SlaveZones [] getMultiSlaveZones() {
        return this.MultiSlaveZones;
    }

    /**
     * Set 多节点实例备可用区信息
     * @param MultiSlaveZones 多节点实例备可用区信息
     */
    public void setMultiSlaveZones(SlaveZones [] MultiSlaveZones) {
        this.MultiSlaveZones = MultiSlaveZones;
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

    }
}

