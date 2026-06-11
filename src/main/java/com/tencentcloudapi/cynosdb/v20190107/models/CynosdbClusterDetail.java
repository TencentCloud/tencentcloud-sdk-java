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

public class CynosdbClusterDetail extends AbstractModel {

    /**
    * <p>集群ID</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

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
    * <p>可用区</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>物理可用区</p>
    */
    @SerializedName("PhysicalZone")
    @Expose
    private String PhysicalZone;

    /**
    * <p>状态，支持的值如下：</p><ul><li>creating：创建中</li><li>running：运行中</li><li>isolating：隔离中</li><li>isolated：已隔离</li><li>activating：从回收站重新恢复</li><li>offlining：下线中</li><li>offlined：已下线</li><li>deleting：删除中</li><li>deleted：已删除</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>状态描述</p>
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * <p>当Db类型为SERVERLESS时，serverless集群状态，可选值:<br>resume<br>resuming<br>pause<br>pausing</p>
    */
    @SerializedName("ServerlessStatus")
    @Expose
    private String ServerlessStatus;

    /**
    * <p>存储Id</p>
    */
    @SerializedName("StorageId")
    @Expose
    private String StorageId;

    /**
    * <p>存储大小，单位为G</p>
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * <p>最大存储规格，单位为G</p>
    */
    @SerializedName("MaxStorageSize")
    @Expose
    private Long MaxStorageSize;

    /**
    * <p>最小存储规格，单位为G</p>
    */
    @SerializedName("MinStorageSize")
    @Expose
    private Long MinStorageSize;

    /**
    * <p>存储付费类型，1为包年包月，0为按量计费</p>
    */
    @SerializedName("StoragePayMode")
    @Expose
    private Long StoragePayMode;

    /**
    * <p>VPC名称</p>
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * <p>vpc唯一id</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>子网名称</p>
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * <p>子网ID</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>字符集</p>
    */
    @SerializedName("Charset")
    @Expose
    private String Charset;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>数据库类型</p>
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * <p>Db类型：<li>NORMAL</li><li>SERVERLESS</li></p>
    */
    @SerializedName("DbMode")
    @Expose
    private String DbMode;

    /**
    * <p>数据库版本</p>
    */
    @SerializedName("DbVersion")
    @Expose
    private String DbVersion;

    /**
    * <p>存储空间上限</p>
    */
    @SerializedName("StorageLimit")
    @Expose
    private Long StorageLimit;

    /**
    * <p>使用容量</p>
    */
    @SerializedName("UsedStorage")
    @Expose
    private Long UsedStorage;

    /**
    * <p>vip地址</p>
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * <p>vport端口</p>
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * <p>集群只读实例的vip地址和vport端口</p>
    */
    @SerializedName("RoAddr")
    @Expose
    private Addr [] RoAddr;

    /**
    * <p>集群支持的功能</p>
    */
    @SerializedName("Ability")
    @Expose
    private Ability Ability;

    /**
    * <p>cynos版本</p>
    */
    @SerializedName("CynosVersion")
    @Expose
    private String CynosVersion;

    /**
    * <p>商业类型</p>
    */
    @SerializedName("BusinessType")
    @Expose
    private String BusinessType;

    /**
    * <p>是否有从可用区</p>
    */
    @SerializedName("HasSlaveZone")
    @Expose
    private String HasSlaveZone;

    /**
    * <p>是否冻结</p>
    */
    @SerializedName("IsFreeze")
    @Expose
    private String IsFreeze;

    /**
    * <p>任务列表</p>
    */
    @SerializedName("Tasks")
    @Expose
    private ObjectTask [] Tasks;

    /**
    * <p>主可用区</p>
    */
    @SerializedName("MasterZone")
    @Expose
    private String MasterZone;

    /**
    * <p>从可用区列表</p>
    */
    @SerializedName("SlaveZones")
    @Expose
    private String [] SlaveZones;

    /**
    * <p>实例信息</p>
    */
    @SerializedName("InstanceSet")
    @Expose
    private ClusterInstanceDetail [] InstanceSet;

    /**
    * <p>付费模式</p>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>到期时间</p>
    */
    @SerializedName("PeriodEndTime")
    @Expose
    private String PeriodEndTime;

    /**
    * <p>项目id</p>
    */
    @SerializedName("ProjectID")
    @Expose
    private Long ProjectID;

    /**
    * <p>实例绑定的tag数组信息</p>
    */
    @SerializedName("ResourceTags")
    @Expose
    private Tag [] ResourceTags;

    /**
    * <p>Proxy状态</p>
    */
    @SerializedName("ProxyStatus")
    @Expose
    private String ProxyStatus;

    /**
    * <p>binlog开关，可选值：ON, OFF</p>
    */
    @SerializedName("LogBin")
    @Expose
    private String LogBin;

    /**
    * <p>是否跳过交易</p>
    */
    @SerializedName("IsSkipTrade")
    @Expose
    private String IsSkipTrade;

    /**
    * <p>pitr类型，可选值：normal, redo_pitr</p>
    */
    @SerializedName("PitrType")
    @Expose
    private String PitrType;

    /**
    * <p>是否打开密码复杂度</p>
    */
    @SerializedName("IsOpenPasswordComplexity")
    @Expose
    private String IsOpenPasswordComplexity;

    /**
    * <p>网络类型</p>
    */
    @SerializedName("NetworkStatus")
    @Expose
    private String NetworkStatus;

    /**
    * <p>集群绑定的资源包信息</p>
    */
    @SerializedName("ResourcePackages")
    @Expose
    private ResourcePackage [] ResourcePackages;

    /**
    * <p>自动续费标识，1为自动续费，0为到期不续</p>
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * <p>节点网络类型</p>
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * <p>备可用区属性</p>
    */
    @SerializedName("SlaveZoneAttr")
    @Expose
    private SlaveZoneAttrItem [] SlaveZoneAttr;

    /**
    * <p>版本标签</p>
    */
    @SerializedName("CynosVersionTag")
    @Expose
    private String CynosVersionTag;

    /**
    * <p>全球数据库网络唯一标识</p>
    */
    @SerializedName("GdnId")
    @Expose
    private String GdnId;

    /**
    * <p>集群在全球数据网络中的角色。<br>主集群- primary<br>从集群 - standby<br>如为空，该字段无效</p>
    */
    @SerializedName("GdnRole")
    @Expose
    private String GdnRole;

    /**
    * <p>二级存储使用量，单位：G</p>
    */
    @SerializedName("UsedArchiveStorage")
    @Expose
    private Long UsedArchiveStorage;

    /**
    * <p>归档状态，枚举值<li>normal:正常</li><li>archiving:归档中</li><li>resuming:恢复中</li><li>archived :已归档</li></p>
    */
    @SerializedName("ArchiveStatus")
    @Expose
    private String ArchiveStatus;

    /**
    * <p>归档进度，百分比。</p>
    */
    @SerializedName("ArchiveProgress")
    @Expose
    private Long ArchiveProgress;

    /**
    * <p>集群级别。例如 P0, P1</p>
    */
    @SerializedName("ClusterLevel")
    @Expose
    private String ClusterLevel;

    /**
    * <p>是否开启透明加密</p>
    */
    @SerializedName("IsOpenTDE")
    @Expose
    private Boolean IsOpenTDE;

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
     * Get <p>状态，支持的值如下：</p><ul><li>creating：创建中</li><li>running：运行中</li><li>isolating：隔离中</li><li>isolated：已隔离</li><li>activating：从回收站重新恢复</li><li>offlining：下线中</li><li>offlined：已下线</li><li>deleting：删除中</li><li>deleted：已删除</li></ul> 
     * @return Status <p>状态，支持的值如下：</p><ul><li>creating：创建中</li><li>running：运行中</li><li>isolating：隔离中</li><li>isolated：已隔离</li><li>activating：从回收站重新恢复</li><li>offlining：下线中</li><li>offlined：已下线</li><li>deleting：删除中</li><li>deleted：已删除</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态，支持的值如下：</p><ul><li>creating：创建中</li><li>running：运行中</li><li>isolating：隔离中</li><li>isolated：已隔离</li><li>activating：从回收站重新恢复</li><li>offlining：下线中</li><li>offlined：已下线</li><li>deleting：删除中</li><li>deleted：已删除</li></ul>
     * @param Status <p>状态，支持的值如下：</p><ul><li>creating：创建中</li><li>running：运行中</li><li>isolating：隔离中</li><li>isolated：已隔离</li><li>activating：从回收站重新恢复</li><li>offlining：下线中</li><li>offlined：已下线</li><li>deleting：删除中</li><li>deleted：已删除</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>状态描述</p> 
     * @return StatusDesc <p>状态描述</p>
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set <p>状态描述</p>
     * @param StatusDesc <p>状态描述</p>
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get <p>当Db类型为SERVERLESS时，serverless集群状态，可选值:<br>resume<br>resuming<br>pause<br>pausing</p> 
     * @return ServerlessStatus <p>当Db类型为SERVERLESS时，serverless集群状态，可选值:<br>resume<br>resuming<br>pause<br>pausing</p>
     */
    public String getServerlessStatus() {
        return this.ServerlessStatus;
    }

    /**
     * Set <p>当Db类型为SERVERLESS时，serverless集群状态，可选值:<br>resume<br>resuming<br>pause<br>pausing</p>
     * @param ServerlessStatus <p>当Db类型为SERVERLESS时，serverless集群状态，可选值:<br>resume<br>resuming<br>pause<br>pausing</p>
     */
    public void setServerlessStatus(String ServerlessStatus) {
        this.ServerlessStatus = ServerlessStatus;
    }

    /**
     * Get <p>存储Id</p> 
     * @return StorageId <p>存储Id</p>
     */
    public String getStorageId() {
        return this.StorageId;
    }

    /**
     * Set <p>存储Id</p>
     * @param StorageId <p>存储Id</p>
     */
    public void setStorageId(String StorageId) {
        this.StorageId = StorageId;
    }

    /**
     * Get <p>存储大小，单位为G</p> 
     * @return Storage <p>存储大小，单位为G</p>
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set <p>存储大小，单位为G</p>
     * @param Storage <p>存储大小，单位为G</p>
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get <p>最大存储规格，单位为G</p> 
     * @return MaxStorageSize <p>最大存储规格，单位为G</p>
     */
    public Long getMaxStorageSize() {
        return this.MaxStorageSize;
    }

    /**
     * Set <p>最大存储规格，单位为G</p>
     * @param MaxStorageSize <p>最大存储规格，单位为G</p>
     */
    public void setMaxStorageSize(Long MaxStorageSize) {
        this.MaxStorageSize = MaxStorageSize;
    }

    /**
     * Get <p>最小存储规格，单位为G</p> 
     * @return MinStorageSize <p>最小存储规格，单位为G</p>
     */
    public Long getMinStorageSize() {
        return this.MinStorageSize;
    }

    /**
     * Set <p>最小存储规格，单位为G</p>
     * @param MinStorageSize <p>最小存储规格，单位为G</p>
     */
    public void setMinStorageSize(Long MinStorageSize) {
        this.MinStorageSize = MinStorageSize;
    }

    /**
     * Get <p>存储付费类型，1为包年包月，0为按量计费</p> 
     * @return StoragePayMode <p>存储付费类型，1为包年包月，0为按量计费</p>
     */
    public Long getStoragePayMode() {
        return this.StoragePayMode;
    }

    /**
     * Set <p>存储付费类型，1为包年包月，0为按量计费</p>
     * @param StoragePayMode <p>存储付费类型，1为包年包月，0为按量计费</p>
     */
    public void setStoragePayMode(Long StoragePayMode) {
        this.StoragePayMode = StoragePayMode;
    }

    /**
     * Get <p>VPC名称</p> 
     * @return VpcName <p>VPC名称</p>
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set <p>VPC名称</p>
     * @param VpcName <p>VPC名称</p>
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get <p>vpc唯一id</p> 
     * @return VpcId <p>vpc唯一id</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>vpc唯一id</p>
     * @param VpcId <p>vpc唯一id</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>子网名称</p> 
     * @return SubnetName <p>子网名称</p>
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set <p>子网名称</p>
     * @param SubnetName <p>子网名称</p>
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
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
     * Get <p>字符集</p> 
     * @return Charset <p>字符集</p>
     */
    public String getCharset() {
        return this.Charset;
    }

    /**
     * Set <p>字符集</p>
     * @param Charset <p>字符集</p>
     */
    public void setCharset(String Charset) {
        this.Charset = Charset;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>数据库类型</p> 
     * @return DbType <p>数据库类型</p>
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set <p>数据库类型</p>
     * @param DbType <p>数据库类型</p>
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get <p>Db类型：<li>NORMAL</li><li>SERVERLESS</li></p> 
     * @return DbMode <p>Db类型：<li>NORMAL</li><li>SERVERLESS</li></p>
     */
    public String getDbMode() {
        return this.DbMode;
    }

    /**
     * Set <p>Db类型：<li>NORMAL</li><li>SERVERLESS</li></p>
     * @param DbMode <p>Db类型：<li>NORMAL</li><li>SERVERLESS</li></p>
     */
    public void setDbMode(String DbMode) {
        this.DbMode = DbMode;
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
     * Get <p>存储空间上限</p> 
     * @return StorageLimit <p>存储空间上限</p>
     */
    public Long getStorageLimit() {
        return this.StorageLimit;
    }

    /**
     * Set <p>存储空间上限</p>
     * @param StorageLimit <p>存储空间上限</p>
     */
    public void setStorageLimit(Long StorageLimit) {
        this.StorageLimit = StorageLimit;
    }

    /**
     * Get <p>使用容量</p> 
     * @return UsedStorage <p>使用容量</p>
     */
    public Long getUsedStorage() {
        return this.UsedStorage;
    }

    /**
     * Set <p>使用容量</p>
     * @param UsedStorage <p>使用容量</p>
     */
    public void setUsedStorage(Long UsedStorage) {
        this.UsedStorage = UsedStorage;
    }

    /**
     * Get <p>vip地址</p> 
     * @return Vip <p>vip地址</p>
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set <p>vip地址</p>
     * @param Vip <p>vip地址</p>
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get <p>vport端口</p> 
     * @return Vport <p>vport端口</p>
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set <p>vport端口</p>
     * @param Vport <p>vport端口</p>
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get <p>集群只读实例的vip地址和vport端口</p> 
     * @return RoAddr <p>集群只读实例的vip地址和vport端口</p>
     */
    public Addr [] getRoAddr() {
        return this.RoAddr;
    }

    /**
     * Set <p>集群只读实例的vip地址和vport端口</p>
     * @param RoAddr <p>集群只读实例的vip地址和vport端口</p>
     */
    public void setRoAddr(Addr [] RoAddr) {
        this.RoAddr = RoAddr;
    }

    /**
     * Get <p>集群支持的功能</p> 
     * @return Ability <p>集群支持的功能</p>
     */
    public Ability getAbility() {
        return this.Ability;
    }

    /**
     * Set <p>集群支持的功能</p>
     * @param Ability <p>集群支持的功能</p>
     */
    public void setAbility(Ability Ability) {
        this.Ability = Ability;
    }

    /**
     * Get <p>cynos版本</p> 
     * @return CynosVersion <p>cynos版本</p>
     */
    public String getCynosVersion() {
        return this.CynosVersion;
    }

    /**
     * Set <p>cynos版本</p>
     * @param CynosVersion <p>cynos版本</p>
     */
    public void setCynosVersion(String CynosVersion) {
        this.CynosVersion = CynosVersion;
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
     * Get <p>任务列表</p> 
     * @return Tasks <p>任务列表</p>
     */
    public ObjectTask [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set <p>任务列表</p>
     * @param Tasks <p>任务列表</p>
     */
    public void setTasks(ObjectTask [] Tasks) {
        this.Tasks = Tasks;
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
     * Get <p>从可用区列表</p> 
     * @return SlaveZones <p>从可用区列表</p>
     */
    public String [] getSlaveZones() {
        return this.SlaveZones;
    }

    /**
     * Set <p>从可用区列表</p>
     * @param SlaveZones <p>从可用区列表</p>
     */
    public void setSlaveZones(String [] SlaveZones) {
        this.SlaveZones = SlaveZones;
    }

    /**
     * Get <p>实例信息</p> 
     * @return InstanceSet <p>实例信息</p>
     */
    public ClusterInstanceDetail [] getInstanceSet() {
        return this.InstanceSet;
    }

    /**
     * Set <p>实例信息</p>
     * @param InstanceSet <p>实例信息</p>
     */
    public void setInstanceSet(ClusterInstanceDetail [] InstanceSet) {
        this.InstanceSet = InstanceSet;
    }

    /**
     * Get <p>付费模式</p> 
     * @return PayMode <p>付费模式</p>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>付费模式</p>
     * @param PayMode <p>付费模式</p>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>到期时间</p> 
     * @return PeriodEndTime <p>到期时间</p>
     */
    public String getPeriodEndTime() {
        return this.PeriodEndTime;
    }

    /**
     * Set <p>到期时间</p>
     * @param PeriodEndTime <p>到期时间</p>
     */
    public void setPeriodEndTime(String PeriodEndTime) {
        this.PeriodEndTime = PeriodEndTime;
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
     * Get <p>实例绑定的tag数组信息</p> 
     * @return ResourceTags <p>实例绑定的tag数组信息</p>
     */
    public Tag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set <p>实例绑定的tag数组信息</p>
     * @param ResourceTags <p>实例绑定的tag数组信息</p>
     */
    public void setResourceTags(Tag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get <p>Proxy状态</p> 
     * @return ProxyStatus <p>Proxy状态</p>
     */
    public String getProxyStatus() {
        return this.ProxyStatus;
    }

    /**
     * Set <p>Proxy状态</p>
     * @param ProxyStatus <p>Proxy状态</p>
     */
    public void setProxyStatus(String ProxyStatus) {
        this.ProxyStatus = ProxyStatus;
    }

    /**
     * Get <p>binlog开关，可选值：ON, OFF</p> 
     * @return LogBin <p>binlog开关，可选值：ON, OFF</p>
     */
    public String getLogBin() {
        return this.LogBin;
    }

    /**
     * Set <p>binlog开关，可选值：ON, OFF</p>
     * @param LogBin <p>binlog开关，可选值：ON, OFF</p>
     */
    public void setLogBin(String LogBin) {
        this.LogBin = LogBin;
    }

    /**
     * Get <p>是否跳过交易</p> 
     * @return IsSkipTrade <p>是否跳过交易</p>
     */
    public String getIsSkipTrade() {
        return this.IsSkipTrade;
    }

    /**
     * Set <p>是否跳过交易</p>
     * @param IsSkipTrade <p>是否跳过交易</p>
     */
    public void setIsSkipTrade(String IsSkipTrade) {
        this.IsSkipTrade = IsSkipTrade;
    }

    /**
     * Get <p>pitr类型，可选值：normal, redo_pitr</p> 
     * @return PitrType <p>pitr类型，可选值：normal, redo_pitr</p>
     */
    public String getPitrType() {
        return this.PitrType;
    }

    /**
     * Set <p>pitr类型，可选值：normal, redo_pitr</p>
     * @param PitrType <p>pitr类型，可选值：normal, redo_pitr</p>
     */
    public void setPitrType(String PitrType) {
        this.PitrType = PitrType;
    }

    /**
     * Get <p>是否打开密码复杂度</p> 
     * @return IsOpenPasswordComplexity <p>是否打开密码复杂度</p>
     */
    public String getIsOpenPasswordComplexity() {
        return this.IsOpenPasswordComplexity;
    }

    /**
     * Set <p>是否打开密码复杂度</p>
     * @param IsOpenPasswordComplexity <p>是否打开密码复杂度</p>
     */
    public void setIsOpenPasswordComplexity(String IsOpenPasswordComplexity) {
        this.IsOpenPasswordComplexity = IsOpenPasswordComplexity;
    }

    /**
     * Get <p>网络类型</p> 
     * @return NetworkStatus <p>网络类型</p>
     */
    public String getNetworkStatus() {
        return this.NetworkStatus;
    }

    /**
     * Set <p>网络类型</p>
     * @param NetworkStatus <p>网络类型</p>
     */
    public void setNetworkStatus(String NetworkStatus) {
        this.NetworkStatus = NetworkStatus;
    }

    /**
     * Get <p>集群绑定的资源包信息</p> 
     * @return ResourcePackages <p>集群绑定的资源包信息</p>
     */
    public ResourcePackage [] getResourcePackages() {
        return this.ResourcePackages;
    }

    /**
     * Set <p>集群绑定的资源包信息</p>
     * @param ResourcePackages <p>集群绑定的资源包信息</p>
     */
    public void setResourcePackages(ResourcePackage [] ResourcePackages) {
        this.ResourcePackages = ResourcePackages;
    }

    /**
     * Get <p>自动续费标识，1为自动续费，0为到期不续</p> 
     * @return RenewFlag <p>自动续费标识，1为自动续费，0为到期不续</p>
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set <p>自动续费标识，1为自动续费，0为到期不续</p>
     * @param RenewFlag <p>自动续费标识，1为自动续费，0为到期不续</p>
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get <p>节点网络类型</p> 
     * @return NetworkType <p>节点网络类型</p>
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set <p>节点网络类型</p>
     * @param NetworkType <p>节点网络类型</p>
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get <p>备可用区属性</p> 
     * @return SlaveZoneAttr <p>备可用区属性</p>
     */
    public SlaveZoneAttrItem [] getSlaveZoneAttr() {
        return this.SlaveZoneAttr;
    }

    /**
     * Set <p>备可用区属性</p>
     * @param SlaveZoneAttr <p>备可用区属性</p>
     */
    public void setSlaveZoneAttr(SlaveZoneAttrItem [] SlaveZoneAttr) {
        this.SlaveZoneAttr = SlaveZoneAttr;
    }

    /**
     * Get <p>版本标签</p> 
     * @return CynosVersionTag <p>版本标签</p>
     */
    public String getCynosVersionTag() {
        return this.CynosVersionTag;
    }

    /**
     * Set <p>版本标签</p>
     * @param CynosVersionTag <p>版本标签</p>
     */
    public void setCynosVersionTag(String CynosVersionTag) {
        this.CynosVersionTag = CynosVersionTag;
    }

    /**
     * Get <p>全球数据库网络唯一标识</p> 
     * @return GdnId <p>全球数据库网络唯一标识</p>
     */
    public String getGdnId() {
        return this.GdnId;
    }

    /**
     * Set <p>全球数据库网络唯一标识</p>
     * @param GdnId <p>全球数据库网络唯一标识</p>
     */
    public void setGdnId(String GdnId) {
        this.GdnId = GdnId;
    }

    /**
     * Get <p>集群在全球数据网络中的角色。<br>主集群- primary<br>从集群 - standby<br>如为空，该字段无效</p> 
     * @return GdnRole <p>集群在全球数据网络中的角色。<br>主集群- primary<br>从集群 - standby<br>如为空，该字段无效</p>
     */
    public String getGdnRole() {
        return this.GdnRole;
    }

    /**
     * Set <p>集群在全球数据网络中的角色。<br>主集群- primary<br>从集群 - standby<br>如为空，该字段无效</p>
     * @param GdnRole <p>集群在全球数据网络中的角色。<br>主集群- primary<br>从集群 - standby<br>如为空，该字段无效</p>
     */
    public void setGdnRole(String GdnRole) {
        this.GdnRole = GdnRole;
    }

    /**
     * Get <p>二级存储使用量，单位：G</p> 
     * @return UsedArchiveStorage <p>二级存储使用量，单位：G</p>
     */
    public Long getUsedArchiveStorage() {
        return this.UsedArchiveStorage;
    }

    /**
     * Set <p>二级存储使用量，单位：G</p>
     * @param UsedArchiveStorage <p>二级存储使用量，单位：G</p>
     */
    public void setUsedArchiveStorage(Long UsedArchiveStorage) {
        this.UsedArchiveStorage = UsedArchiveStorage;
    }

    /**
     * Get <p>归档状态，枚举值<li>normal:正常</li><li>archiving:归档中</li><li>resuming:恢复中</li><li>archived :已归档</li></p> 
     * @return ArchiveStatus <p>归档状态，枚举值<li>normal:正常</li><li>archiving:归档中</li><li>resuming:恢复中</li><li>archived :已归档</li></p>
     */
    public String getArchiveStatus() {
        return this.ArchiveStatus;
    }

    /**
     * Set <p>归档状态，枚举值<li>normal:正常</li><li>archiving:归档中</li><li>resuming:恢复中</li><li>archived :已归档</li></p>
     * @param ArchiveStatus <p>归档状态，枚举值<li>normal:正常</li><li>archiving:归档中</li><li>resuming:恢复中</li><li>archived :已归档</li></p>
     */
    public void setArchiveStatus(String ArchiveStatus) {
        this.ArchiveStatus = ArchiveStatus;
    }

    /**
     * Get <p>归档进度，百分比。</p> 
     * @return ArchiveProgress <p>归档进度，百分比。</p>
     */
    public Long getArchiveProgress() {
        return this.ArchiveProgress;
    }

    /**
     * Set <p>归档进度，百分比。</p>
     * @param ArchiveProgress <p>归档进度，百分比。</p>
     */
    public void setArchiveProgress(Long ArchiveProgress) {
        this.ArchiveProgress = ArchiveProgress;
    }

    /**
     * Get <p>集群级别。例如 P0, P1</p> 
     * @return ClusterLevel <p>集群级别。例如 P0, P1</p>
     */
    public String getClusterLevel() {
        return this.ClusterLevel;
    }

    /**
     * Set <p>集群级别。例如 P0, P1</p>
     * @param ClusterLevel <p>集群级别。例如 P0, P1</p>
     */
    public void setClusterLevel(String ClusterLevel) {
        this.ClusterLevel = ClusterLevel;
    }

    /**
     * Get <p>是否开启透明加密</p> 
     * @return IsOpenTDE <p>是否开启透明加密</p>
     */
    public Boolean getIsOpenTDE() {
        return this.IsOpenTDE;
    }

    /**
     * Set <p>是否开启透明加密</p>
     * @param IsOpenTDE <p>是否开启透明加密</p>
     */
    public void setIsOpenTDE(Boolean IsOpenTDE) {
        this.IsOpenTDE = IsOpenTDE;
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
        if (source.NetworkType != null) {
            this.NetworkType = new String(source.NetworkType);
        }
        if (source.SlaveZoneAttr != null) {
            this.SlaveZoneAttr = new SlaveZoneAttrItem[source.SlaveZoneAttr.length];
            for (int i = 0; i < source.SlaveZoneAttr.length; i++) {
                this.SlaveZoneAttr[i] = new SlaveZoneAttrItem(source.SlaveZoneAttr[i]);
            }
        }
        if (source.CynosVersionTag != null) {
            this.CynosVersionTag = new String(source.CynosVersionTag);
        }
        if (source.GdnId != null) {
            this.GdnId = new String(source.GdnId);
        }
        if (source.GdnRole != null) {
            this.GdnRole = new String(source.GdnRole);
        }
        if (source.UsedArchiveStorage != null) {
            this.UsedArchiveStorage = new Long(source.UsedArchiveStorage);
        }
        if (source.ArchiveStatus != null) {
            this.ArchiveStatus = new String(source.ArchiveStatus);
        }
        if (source.ArchiveProgress != null) {
            this.ArchiveProgress = new Long(source.ArchiveProgress);
        }
        if (source.ClusterLevel != null) {
            this.ClusterLevel = new String(source.ClusterLevel);
        }
        if (source.IsOpenTDE != null) {
            this.IsOpenTDE = new Boolean(source.IsOpenTDE);
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
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamArrayObj(map, prefix + "SlaveZoneAttr.", this.SlaveZoneAttr);
        this.setParamSimple(map, prefix + "CynosVersionTag", this.CynosVersionTag);
        this.setParamSimple(map, prefix + "GdnId", this.GdnId);
        this.setParamSimple(map, prefix + "GdnRole", this.GdnRole);
        this.setParamSimple(map, prefix + "UsedArchiveStorage", this.UsedArchiveStorage);
        this.setParamSimple(map, prefix + "ArchiveStatus", this.ArchiveStatus);
        this.setParamSimple(map, prefix + "ArchiveProgress", this.ArchiveProgress);
        this.setParamSimple(map, prefix + "ClusterLevel", this.ClusterLevel);
        this.setParamSimple(map, prefix + "IsOpenTDE", this.IsOpenTDE);

    }
}

