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

public class CynosdbClusterDetail extends AbstractModel{

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
    * 物理可用区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PhysicalZone")
    @Expose
    private String PhysicalZone;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 状态描述
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * 当Db类型为SERVERLESS时，serverless集群状态，可选值:
resume
resuming
pause
pausing
    */
    @SerializedName("ServerlessStatus")
    @Expose
    private String ServerlessStatus;

    /**
    * 存储Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageId")
    @Expose
    private String StorageId;

    /**
    * 存储大小，单位为G
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * 最大存储规格，单位为G
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxStorageSize")
    @Expose
    private Long MaxStorageSize;

    /**
    * 最小存储规格，单位为G
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MinStorageSize")
    @Expose
    private Long MinStorageSize;

    /**
    * 存储付费类型，1为包年包月，0为按量计费
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StoragePayMode")
    @Expose
    private Long StoragePayMode;

    /**
    * VPC名称
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * vpc唯一id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网名称
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * 子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 字符集
    */
    @SerializedName("Charset")
    @Expose
    private String Charset;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 数据库类型
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * 数据库类型，normal，serverless
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DbMode")
    @Expose
    private String DbMode;

    /**
    * 数据库版本
    */
    @SerializedName("DbVersion")
    @Expose
    private String DbVersion;

    /**
    * 存储空间上限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageLimit")
    @Expose
    private Long StorageLimit;

    /**
    * 使用容量
    */
    @SerializedName("UsedStorage")
    @Expose
    private Long UsedStorage;

    /**
    * vip地址
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * vport端口
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * 集群只读实例的vip地址和vport端口
    */
    @SerializedName("RoAddr")
    @Expose
    private Addr [] RoAddr;

    /**
    * 集群支持的功能
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ability")
    @Expose
    private Ability Ability;

    /**
    * cynos版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CynosVersion")
    @Expose
    private String CynosVersion;

    /**
    * 商业类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BusinessType")
    @Expose
    private String BusinessType;

    /**
    * 是否有从可用区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HasSlaveZone")
    @Expose
    private String HasSlaveZone;

    /**
    * 是否冻结
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsFreeze")
    @Expose
    private String IsFreeze;

    /**
    * 任务列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tasks")
    @Expose
    private ObjectTask [] Tasks;

    /**
    * 主可用区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MasterZone")
    @Expose
    private String MasterZone;

    /**
    * 从可用区列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SlaveZones")
    @Expose
    private String [] SlaveZones;

    /**
    * 实例信息
    */
    @SerializedName("InstanceSet")
    @Expose
    private ClusterInstanceDetail [] InstanceSet;

    /**
    * 付费模式
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 到期时间
    */
    @SerializedName("PeriodEndTime")
    @Expose
    private String PeriodEndTime;

    /**
    * 项目id
    */
    @SerializedName("ProjectID")
    @Expose
    private Long ProjectID;

    /**
    * 实例绑定的tag数组信息
    */
    @SerializedName("ResourceTags")
    @Expose
    private Tag [] ResourceTags;

    /**
    * Proxy状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxyStatus")
    @Expose
    private String ProxyStatus;

    /**
    * binlog开关，可选值：ON, OFF
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogBin")
    @Expose
    private String LogBin;

    /**
    * 是否跳过交易
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsSkipTrade")
    @Expose
    private String IsSkipTrade;

    /**
    * pitr类型，可选值：normal, redo_pitr
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PitrType")
    @Expose
    private String PitrType;

    /**
    * 是否打开密码复杂度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsOpenPasswordComplexity")
    @Expose
    private String IsOpenPasswordComplexity;

    /**
    * 网络类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetworkStatus")
    @Expose
    private String NetworkStatus;

    /**
    * 集群绑定的资源包信息	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourcePackages")
    @Expose
    private ResourcePackage [] ResourcePackages;

    /**
    * 自动续费标识，1为自动续费，0为到期不续
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

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
     * Get 状态 
     * @return Status 状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 状态描述 
     * @return StatusDesc 状态描述
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set 状态描述
     * @param StatusDesc 状态描述
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get 当Db类型为SERVERLESS时，serverless集群状态，可选值:
resume
resuming
pause
pausing 
     * @return ServerlessStatus 当Db类型为SERVERLESS时，serverless集群状态，可选值:
resume
resuming
pause
pausing
     */
    public String getServerlessStatus() {
        return this.ServerlessStatus;
    }

    /**
     * Set 当Db类型为SERVERLESS时，serverless集群状态，可选值:
resume
resuming
pause
pausing
     * @param ServerlessStatus 当Db类型为SERVERLESS时，serverless集群状态，可选值:
resume
resuming
pause
pausing
     */
    public void setServerlessStatus(String ServerlessStatus) {
        this.ServerlessStatus = ServerlessStatus;
    }

    /**
     * Get 存储Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageId 存储Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStorageId() {
        return this.StorageId;
    }

    /**
     * Set 存储Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageId 存储Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageId(String StorageId) {
        this.StorageId = StorageId;
    }

    /**
     * Get 存储大小，单位为G
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Storage 存储大小，单位为G
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set 存储大小，单位为G
注意：此字段可能返回 null，表示取不到有效值。
     * @param Storage 存储大小，单位为G
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get 最大存储规格，单位为G
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxStorageSize 最大存储规格，单位为G
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxStorageSize() {
        return this.MaxStorageSize;
    }

    /**
     * Set 最大存储规格，单位为G
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxStorageSize 最大存储规格，单位为G
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxStorageSize(Long MaxStorageSize) {
        this.MaxStorageSize = MaxStorageSize;
    }

    /**
     * Get 最小存储规格，单位为G
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MinStorageSize 最小存储规格，单位为G
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMinStorageSize() {
        return this.MinStorageSize;
    }

    /**
     * Set 最小存储规格，单位为G
注意：此字段可能返回 null，表示取不到有效值。
     * @param MinStorageSize 最小存储规格，单位为G
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMinStorageSize(Long MinStorageSize) {
        this.MinStorageSize = MinStorageSize;
    }

    /**
     * Get 存储付费类型，1为包年包月，0为按量计费
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StoragePayMode 存储付费类型，1为包年包月，0为按量计费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStoragePayMode() {
        return this.StoragePayMode;
    }

    /**
     * Set 存储付费类型，1为包年包月，0为按量计费
注意：此字段可能返回 null，表示取不到有效值。
     * @param StoragePayMode 存储付费类型，1为包年包月，0为按量计费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStoragePayMode(Long StoragePayMode) {
        this.StoragePayMode = StoragePayMode;
    }

    /**
     * Get VPC名称 
     * @return VpcName VPC名称
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set VPC名称
     * @param VpcName VPC名称
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get vpc唯一id 
     * @return VpcId vpc唯一id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc唯一id
     * @param VpcId vpc唯一id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网名称 
     * @return SubnetName 子网名称
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set 子网名称
     * @param SubnetName 子网名称
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
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
     * Get 字符集 
     * @return Charset 字符集
     */
    public String getCharset() {
        return this.Charset;
    }

    /**
     * Set 字符集
     * @param Charset 字符集
     */
    public void setCharset(String Charset) {
        this.Charset = Charset;
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
     * Get 数据库类型，normal，serverless
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DbMode 数据库类型，normal，serverless
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDbMode() {
        return this.DbMode;
    }

    /**
     * Set 数据库类型，normal，serverless
注意：此字段可能返回 null，表示取不到有效值。
     * @param DbMode 数据库类型，normal，serverless
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDbMode(String DbMode) {
        this.DbMode = DbMode;
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
     * Get 存储空间上限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageLimit 存储空间上限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStorageLimit() {
        return this.StorageLimit;
    }

    /**
     * Set 存储空间上限
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageLimit 存储空间上限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageLimit(Long StorageLimit) {
        this.StorageLimit = StorageLimit;
    }

    /**
     * Get 使用容量 
     * @return UsedStorage 使用容量
     */
    public Long getUsedStorage() {
        return this.UsedStorage;
    }

    /**
     * Set 使用容量
     * @param UsedStorage 使用容量
     */
    public void setUsedStorage(Long UsedStorage) {
        this.UsedStorage = UsedStorage;
    }

    /**
     * Get vip地址 
     * @return Vip vip地址
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set vip地址
     * @param Vip vip地址
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get vport端口 
     * @return Vport vport端口
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set vport端口
     * @param Vport vport端口
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get 集群只读实例的vip地址和vport端口 
     * @return RoAddr 集群只读实例的vip地址和vport端口
     */
    public Addr [] getRoAddr() {
        return this.RoAddr;
    }

    /**
     * Set 集群只读实例的vip地址和vport端口
     * @param RoAddr 集群只读实例的vip地址和vport端口
     */
    public void setRoAddr(Addr [] RoAddr) {
        this.RoAddr = RoAddr;
    }

    /**
     * Get 集群支持的功能
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ability 集群支持的功能
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Ability getAbility() {
        return this.Ability;
    }

    /**
     * Set 集群支持的功能
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ability 集群支持的功能
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAbility(Ability Ability) {
        this.Ability = Ability;
    }

    /**
     * Get cynos版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CynosVersion cynos版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCynosVersion() {
        return this.CynosVersion;
    }

    /**
     * Set cynos版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param CynosVersion cynos版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCynosVersion(String CynosVersion) {
        this.CynosVersion = CynosVersion;
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
     * Get 任务列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tasks 任务列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ObjectTask [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set 任务列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tasks 任务列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTasks(ObjectTask [] Tasks) {
        this.Tasks = Tasks;
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
     * Get 从可用区列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SlaveZones 从可用区列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSlaveZones() {
        return this.SlaveZones;
    }

    /**
     * Set 从可用区列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param SlaveZones 从可用区列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSlaveZones(String [] SlaveZones) {
        this.SlaveZones = SlaveZones;
    }

    /**
     * Get 实例信息 
     * @return InstanceSet 实例信息
     */
    public ClusterInstanceDetail [] getInstanceSet() {
        return this.InstanceSet;
    }

    /**
     * Set 实例信息
     * @param InstanceSet 实例信息
     */
    public void setInstanceSet(ClusterInstanceDetail [] InstanceSet) {
        this.InstanceSet = InstanceSet;
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
     * Get 项目id 
     * @return ProjectID 项目id
     */
    public Long getProjectID() {
        return this.ProjectID;
    }

    /**
     * Set 项目id
     * @param ProjectID 项目id
     */
    public void setProjectID(Long ProjectID) {
        this.ProjectID = ProjectID;
    }

    /**
     * Get 实例绑定的tag数组信息 
     * @return ResourceTags 实例绑定的tag数组信息
     */
    public Tag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set 实例绑定的tag数组信息
     * @param ResourceTags 实例绑定的tag数组信息
     */
    public void setResourceTags(Tag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get Proxy状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxyStatus Proxy状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProxyStatus() {
        return this.ProxyStatus;
    }

    /**
     * Set Proxy状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxyStatus Proxy状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxyStatus(String ProxyStatus) {
        this.ProxyStatus = ProxyStatus;
    }

    /**
     * Get binlog开关，可选值：ON, OFF
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogBin binlog开关，可选值：ON, OFF
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogBin() {
        return this.LogBin;
    }

    /**
     * Set binlog开关，可选值：ON, OFF
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogBin binlog开关，可选值：ON, OFF
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogBin(String LogBin) {
        this.LogBin = LogBin;
    }

    /**
     * Get 是否跳过交易
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsSkipTrade 是否跳过交易
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsSkipTrade() {
        return this.IsSkipTrade;
    }

    /**
     * Set 是否跳过交易
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsSkipTrade 是否跳过交易
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsSkipTrade(String IsSkipTrade) {
        this.IsSkipTrade = IsSkipTrade;
    }

    /**
     * Get pitr类型，可选值：normal, redo_pitr
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PitrType pitr类型，可选值：normal, redo_pitr
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPitrType() {
        return this.PitrType;
    }

    /**
     * Set pitr类型，可选值：normal, redo_pitr
注意：此字段可能返回 null，表示取不到有效值。
     * @param PitrType pitr类型，可选值：normal, redo_pitr
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPitrType(String PitrType) {
        this.PitrType = PitrType;
    }

    /**
     * Get 是否打开密码复杂度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsOpenPasswordComplexity 是否打开密码复杂度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsOpenPasswordComplexity() {
        return this.IsOpenPasswordComplexity;
    }

    /**
     * Set 是否打开密码复杂度
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsOpenPasswordComplexity 是否打开密码复杂度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsOpenPasswordComplexity(String IsOpenPasswordComplexity) {
        this.IsOpenPasswordComplexity = IsOpenPasswordComplexity;
    }

    /**
     * Get 网络类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetworkStatus 网络类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNetworkStatus() {
        return this.NetworkStatus;
    }

    /**
     * Set 网络类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetworkStatus 网络类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetworkStatus(String NetworkStatus) {
        this.NetworkStatus = NetworkStatus;
    }

    /**
     * Get 集群绑定的资源包信息	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourcePackages 集群绑定的资源包信息	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourcePackage [] getResourcePackages() {
        return this.ResourcePackages;
    }

    /**
     * Set 集群绑定的资源包信息	
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourcePackages 集群绑定的资源包信息	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourcePackages(ResourcePackage [] ResourcePackages) {
        this.ResourcePackages = ResourcePackages;
    }

    /**
     * Get 自动续费标识，1为自动续费，0为到期不续
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RenewFlag 自动续费标识，1为自动续费，0为到期不续
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 自动续费标识，1为自动续费，0为到期不续
注意：此字段可能返回 null，表示取不到有效值。
     * @param RenewFlag 自动续费标识，1为自动续费，0为到期不续
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    public CynosdbClusterDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CynosdbClusterDetail(CynosdbClusterDetail source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.PhysicalZone != null) {
            this.PhysicalZone = new String(source.PhysicalZone);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.ServerlessStatus != null) {
            this.ServerlessStatus = new String(source.ServerlessStatus);
        }
        if (source.StorageId != null) {
            this.StorageId = new String(source.StorageId);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.MaxStorageSize != null) {
            this.MaxStorageSize = new Long(source.MaxStorageSize);
        }
        if (source.MinStorageSize != null) {
            this.MinStorageSize = new Long(source.MinStorageSize);
        }
        if (source.StoragePayMode != null) {
            this.StoragePayMode = new Long(source.StoragePayMode);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetName != null) {
            this.SubnetName = new String(source.SubnetName);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Charset != null) {
            this.Charset = new String(source.Charset);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.DbType != null) {
            this.DbType = new String(source.DbType);
        }
        if (source.DbMode != null) {
            this.DbMode = new String(source.DbMode);
        }
        if (source.DbVersion != null) {
            this.DbVersion = new String(source.DbVersion);
        }
        if (source.StorageLimit != null) {
            this.StorageLimit = new Long(source.StorageLimit);
        }
        if (source.UsedStorage != null) {
            this.UsedStorage = new Long(source.UsedStorage);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.RoAddr != null) {
            this.RoAddr = new Addr[source.RoAddr.length];
            for (int i = 0; i < source.RoAddr.length; i++) {
                this.RoAddr[i] = new Addr(source.RoAddr[i]);
            }
        }
        if (source.Ability != null) {
            this.Ability = new Ability(source.Ability);
        }
        if (source.CynosVersion != null) {
            this.CynosVersion = new String(source.CynosVersion);
        }
        if (source.BusinessType != null) {
            this.BusinessType = new String(source.BusinessType);
        }
        if (source.HasSlaveZone != null) {
            this.HasSlaveZone = new String(source.HasSlaveZone);
        }
        if (source.IsFreeze != null) {
            this.IsFreeze = new String(source.IsFreeze);
        }
        if (source.Tasks != null) {
            this.Tasks = new ObjectTask[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new ObjectTask(source.Tasks[i]);
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
        if (source.InstanceSet != null) {
            this.InstanceSet = new ClusterInstanceDetail[source.InstanceSet.length];
            for (int i = 0; i < source.InstanceSet.length; i++) {
                this.InstanceSet[i] = new ClusterInstanceDetail(source.InstanceSet[i]);
            }
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.PeriodEndTime != null) {
            this.PeriodEndTime = new String(source.PeriodEndTime);
        }
        if (source.ProjectID != null) {
            this.ProjectID = new Long(source.ProjectID);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new Tag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new Tag(source.ResourceTags[i]);
            }
        }
        if (source.ProxyStatus != null) {
            this.ProxyStatus = new String(source.ProxyStatus);
        }
        if (source.LogBin != null) {
            this.LogBin = new String(source.LogBin);
        }
        if (source.IsSkipTrade != null) {
            this.IsSkipTrade = new String(source.IsSkipTrade);
        }
        if (source.PitrType != null) {
            this.PitrType = new String(source.PitrType);
        }
        if (source.IsOpenPasswordComplexity != null) {
            this.IsOpenPasswordComplexity = new String(source.IsOpenPasswordComplexity);
        }
        if (source.NetworkStatus != null) {
            this.NetworkStatus = new String(source.NetworkStatus);
        }
        if (source.ResourcePackages != null) {
            this.ResourcePackages = new ResourcePackage[source.ResourcePackages.length];
            for (int i = 0; i < source.ResourcePackages.length; i++) {
                this.ResourcePackages[i] = new ResourcePackage(source.ResourcePackages[i]);
            }
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "PhysicalZone", this.PhysicalZone);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "ServerlessStatus", this.ServerlessStatus);
        this.setParamSimple(map, prefix + "StorageId", this.StorageId);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "MaxStorageSize", this.MaxStorageSize);
        this.setParamSimple(map, prefix + "MinStorageSize", this.MinStorageSize);
        this.setParamSimple(map, prefix + "StoragePayMode", this.StoragePayMode);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Charset", this.Charset);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamSimple(map, prefix + "DbMode", this.DbMode);
        this.setParamSimple(map, prefix + "DbVersion", this.DbVersion);
        this.setParamSimple(map, prefix + "StorageLimit", this.StorageLimit);
        this.setParamSimple(map, prefix + "UsedStorage", this.UsedStorage);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamArrayObj(map, prefix + "RoAddr.", this.RoAddr);
        this.setParamObj(map, prefix + "Ability.", this.Ability);
        this.setParamSimple(map, prefix + "CynosVersion", this.CynosVersion);
        this.setParamSimple(map, prefix + "BusinessType", this.BusinessType);
        this.setParamSimple(map, prefix + "HasSlaveZone", this.HasSlaveZone);
        this.setParamSimple(map, prefix + "IsFreeze", this.IsFreeze);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "MasterZone", this.MasterZone);
        this.setParamArraySimple(map, prefix + "SlaveZones.", this.SlaveZones);
        this.setParamArrayObj(map, prefix + "InstanceSet.", this.InstanceSet);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "PeriodEndTime", this.PeriodEndTime);
        this.setParamSimple(map, prefix + "ProjectID", this.ProjectID);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "ProxyStatus", this.ProxyStatus);
        this.setParamSimple(map, prefix + "LogBin", this.LogBin);
        this.setParamSimple(map, prefix + "IsSkipTrade", this.IsSkipTrade);
        this.setParamSimple(map, prefix + "PitrType", this.PitrType);
        this.setParamSimple(map, prefix + "IsOpenPasswordComplexity", this.IsOpenPasswordComplexity);
        this.setParamSimple(map, prefix + "NetworkStatus", this.NetworkStatus);
        this.setParamArrayObj(map, prefix + "ResourcePackages.", this.ResourcePackages);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);

    }
}

