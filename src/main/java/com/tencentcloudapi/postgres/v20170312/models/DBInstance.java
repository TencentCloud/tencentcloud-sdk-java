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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DBInstance extends AbstractModel{

    /**
    * 实例所属地域，如: ap-guangzhou，对应RegionSet的Region字段
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 实例所属可用区， 如：ap-guangzhou-3，对应ZoneSet的Zone字段
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 私有网络ID
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
    * 实例ID
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 实例名称
    */
    @SerializedName("DBInstanceName")
    @Expose
    private String DBInstanceName;

    /**
    * 实例状态，分别为：applying（申请中）、init(待初始化)、initing(初始化中)、running(运行中)、limited run（受限运行）、isolated（已隔离）、recycling（回收中）、recycled（已回收）、job running（任务执行中）、offline（下线）、migrating（迁移中）、expanding（扩容中）、waitSwitch（等待切换）、switching（切换中）、readonly（只读）、restarting（重启中）、network changing（网络变更中）
    */
    @SerializedName("DBInstanceStatus")
    @Expose
    private String DBInstanceStatus;

    /**
    * 实例分配的内存大小，单位：GB
    */
    @SerializedName("DBInstanceMemory")
    @Expose
    private Long DBInstanceMemory;

    /**
    * 实例分配的存储空间大小，单位：GB
    */
    @SerializedName("DBInstanceStorage")
    @Expose
    private Long DBInstanceStorage;

    /**
    * 实例分配的CPU数量，单位：个
    */
    @SerializedName("DBInstanceCpu")
    @Expose
    private Long DBInstanceCpu;

    /**
    * 售卖规格ID
    */
    @SerializedName("DBInstanceClass")
    @Expose
    private String DBInstanceClass;

    /**
    * 实例类型，类型有：1、primary（主实例）；2、readonly（只读实例）；3、guard（灾备实例）；4、temp（临时实例）
    */
    @SerializedName("DBInstanceType")
    @Expose
    private String DBInstanceType;

    /**
    * 实例版本，目前只支持standard（双机高可用版, 一主一从）
    */
    @SerializedName("DBInstanceVersion")
    @Expose
    private String DBInstanceVersion;

    /**
    * 实例DB字符集
    */
    @SerializedName("DBCharset")
    @Expose
    private String DBCharset;

    /**
    * PostgreSQL版本
    */
    @SerializedName("DBVersion")
    @Expose
    private String DBVersion;

    /**
    * 实例创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 实例执行最后一次更新的时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 实例到期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 实例隔离时间
    */
    @SerializedName("IsolatedTime")
    @Expose
    private String IsolatedTime;

    /**
    * 计费模式，1、prepaid（包年包月,预付费）；2、postpaid（按量计费，后付费）
    */
    @SerializedName("PayType")
    @Expose
    private String PayType;

    /**
    * 是否自动续费，1：自动续费，0：不自动续费
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * 实例网络连接信息
    */
    @SerializedName("DBInstanceNetInfo")
    @Expose
    private DBInstanceNetInfo [] DBInstanceNetInfo;

    /**
    * 机器类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 用户的AppId
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 实例的Uid
    */
    @SerializedName("Uid")
    @Expose
    private Long Uid;

    /**
    * 实例是否支持Ipv6，1：支持，0：不支持
    */
    @SerializedName("SupportIpv6")
    @Expose
    private Long SupportIpv6;

    /**
    * 实例绑定的标签信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagList")
    @Expose
    private Tag [] TagList;

    /**
    * 主实例信息，仅在实例为只读实例时返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MasterDBInstanceId")
    @Expose
    private String MasterDBInstanceId;

    /**
    * 只读实例数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReadOnlyInstanceNum")
    @Expose
    private Long ReadOnlyInstanceNum;

    /**
    * 只读实例在只读组中的状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusInReadonlyGroup")
    @Expose
    private String StatusInReadonlyGroup;

    /**
    * 下线时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OfflineTime")
    @Expose
    private String OfflineTime;

    /**
    * 数据库内核版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DBKernelVersion")
    @Expose
    private String DBKernelVersion;

    /**
    * 实例网络信息列表（此字段已废弃）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetworkAccessList")
    @Expose
    private NetworkAccess [] NetworkAccessList;

    /**
    * PostgreSQL主要版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DBMajorVersion")
    @Expose
    private String DBMajorVersion;

    /**
    * 实例的节点信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DBNodeSet")
    @Expose
    private DBNode [] DBNodeSet;

    /**
    * 实例是否支持TDE数据加密  0：不支持，1：支持
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsSupportTDE")
    @Expose
    private Long IsSupportTDE;

    /**
     * Get 实例所属地域，如: ap-guangzhou，对应RegionSet的Region字段 
     * @return Region 实例所属地域，如: ap-guangzhou，对应RegionSet的Region字段
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 实例所属地域，如: ap-guangzhou，对应RegionSet的Region字段
     * @param Region 实例所属地域，如: ap-guangzhou，对应RegionSet的Region字段
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 实例所属可用区， 如：ap-guangzhou-3，对应ZoneSet的Zone字段 
     * @return Zone 实例所属可用区， 如：ap-guangzhou-3，对应ZoneSet的Zone字段
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 实例所属可用区， 如：ap-guangzhou-3，对应ZoneSet的Zone字段
     * @param Zone 实例所属可用区， 如：ap-guangzhou-3，对应ZoneSet的Zone字段
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
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
     * Get 私有网络ID 
     * @return VpcId 私有网络ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络ID
     * @param VpcId 私有网络ID
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
     * Get 实例ID 
     * @return DBInstanceId 实例ID
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set 实例ID
     * @param DBInstanceId 实例ID
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get 实例名称 
     * @return DBInstanceName 实例名称
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * Set 实例名称
     * @param DBInstanceName 实例名称
     */
    public void setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
    }

    /**
     * Get 实例状态，分别为：applying（申请中）、init(待初始化)、initing(初始化中)、running(运行中)、limited run（受限运行）、isolated（已隔离）、recycling（回收中）、recycled（已回收）、job running（任务执行中）、offline（下线）、migrating（迁移中）、expanding（扩容中）、waitSwitch（等待切换）、switching（切换中）、readonly（只读）、restarting（重启中）、network changing（网络变更中） 
     * @return DBInstanceStatus 实例状态，分别为：applying（申请中）、init(待初始化)、initing(初始化中)、running(运行中)、limited run（受限运行）、isolated（已隔离）、recycling（回收中）、recycled（已回收）、job running（任务执行中）、offline（下线）、migrating（迁移中）、expanding（扩容中）、waitSwitch（等待切换）、switching（切换中）、readonly（只读）、restarting（重启中）、network changing（网络变更中）
     */
    public String getDBInstanceStatus() {
        return this.DBInstanceStatus;
    }

    /**
     * Set 实例状态，分别为：applying（申请中）、init(待初始化)、initing(初始化中)、running(运行中)、limited run（受限运行）、isolated（已隔离）、recycling（回收中）、recycled（已回收）、job running（任务执行中）、offline（下线）、migrating（迁移中）、expanding（扩容中）、waitSwitch（等待切换）、switching（切换中）、readonly（只读）、restarting（重启中）、network changing（网络变更中）
     * @param DBInstanceStatus 实例状态，分别为：applying（申请中）、init(待初始化)、initing(初始化中)、running(运行中)、limited run（受限运行）、isolated（已隔离）、recycling（回收中）、recycled（已回收）、job running（任务执行中）、offline（下线）、migrating（迁移中）、expanding（扩容中）、waitSwitch（等待切换）、switching（切换中）、readonly（只读）、restarting（重启中）、network changing（网络变更中）
     */
    public void setDBInstanceStatus(String DBInstanceStatus) {
        this.DBInstanceStatus = DBInstanceStatus;
    }

    /**
     * Get 实例分配的内存大小，单位：GB 
     * @return DBInstanceMemory 实例分配的内存大小，单位：GB
     */
    public Long getDBInstanceMemory() {
        return this.DBInstanceMemory;
    }

    /**
     * Set 实例分配的内存大小，单位：GB
     * @param DBInstanceMemory 实例分配的内存大小，单位：GB
     */
    public void setDBInstanceMemory(Long DBInstanceMemory) {
        this.DBInstanceMemory = DBInstanceMemory;
    }

    /**
     * Get 实例分配的存储空间大小，单位：GB 
     * @return DBInstanceStorage 实例分配的存储空间大小，单位：GB
     */
    public Long getDBInstanceStorage() {
        return this.DBInstanceStorage;
    }

    /**
     * Set 实例分配的存储空间大小，单位：GB
     * @param DBInstanceStorage 实例分配的存储空间大小，单位：GB
     */
    public void setDBInstanceStorage(Long DBInstanceStorage) {
        this.DBInstanceStorage = DBInstanceStorage;
    }

    /**
     * Get 实例分配的CPU数量，单位：个 
     * @return DBInstanceCpu 实例分配的CPU数量，单位：个
     */
    public Long getDBInstanceCpu() {
        return this.DBInstanceCpu;
    }

    /**
     * Set 实例分配的CPU数量，单位：个
     * @param DBInstanceCpu 实例分配的CPU数量，单位：个
     */
    public void setDBInstanceCpu(Long DBInstanceCpu) {
        this.DBInstanceCpu = DBInstanceCpu;
    }

    /**
     * Get 售卖规格ID 
     * @return DBInstanceClass 售卖规格ID
     */
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    /**
     * Set 售卖规格ID
     * @param DBInstanceClass 售卖规格ID
     */
    public void setDBInstanceClass(String DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
    }

    /**
     * Get 实例类型，类型有：1、primary（主实例）；2、readonly（只读实例）；3、guard（灾备实例）；4、temp（临时实例） 
     * @return DBInstanceType 实例类型，类型有：1、primary（主实例）；2、readonly（只读实例）；3、guard（灾备实例）；4、temp（临时实例）
     */
    public String getDBInstanceType() {
        return this.DBInstanceType;
    }

    /**
     * Set 实例类型，类型有：1、primary（主实例）；2、readonly（只读实例）；3、guard（灾备实例）；4、temp（临时实例）
     * @param DBInstanceType 实例类型，类型有：1、primary（主实例）；2、readonly（只读实例）；3、guard（灾备实例）；4、temp（临时实例）
     */
    public void setDBInstanceType(String DBInstanceType) {
        this.DBInstanceType = DBInstanceType;
    }

    /**
     * Get 实例版本，目前只支持standard（双机高可用版, 一主一从） 
     * @return DBInstanceVersion 实例版本，目前只支持standard（双机高可用版, 一主一从）
     */
    public String getDBInstanceVersion() {
        return this.DBInstanceVersion;
    }

    /**
     * Set 实例版本，目前只支持standard（双机高可用版, 一主一从）
     * @param DBInstanceVersion 实例版本，目前只支持standard（双机高可用版, 一主一从）
     */
    public void setDBInstanceVersion(String DBInstanceVersion) {
        this.DBInstanceVersion = DBInstanceVersion;
    }

    /**
     * Get 实例DB字符集 
     * @return DBCharset 实例DB字符集
     */
    public String getDBCharset() {
        return this.DBCharset;
    }

    /**
     * Set 实例DB字符集
     * @param DBCharset 实例DB字符集
     */
    public void setDBCharset(String DBCharset) {
        this.DBCharset = DBCharset;
    }

    /**
     * Get PostgreSQL版本 
     * @return DBVersion PostgreSQL版本
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * Set PostgreSQL版本
     * @param DBVersion PostgreSQL版本
     */
    public void setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
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
     * Get 实例执行最后一次更新的时间 
     * @return UpdateTime 实例执行最后一次更新的时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 实例执行最后一次更新的时间
     * @param UpdateTime 实例执行最后一次更新的时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 实例到期时间 
     * @return ExpireTime 实例到期时间
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 实例到期时间
     * @param ExpireTime 实例到期时间
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 实例隔离时间 
     * @return IsolatedTime 实例隔离时间
     */
    public String getIsolatedTime() {
        return this.IsolatedTime;
    }

    /**
     * Set 实例隔离时间
     * @param IsolatedTime 实例隔离时间
     */
    public void setIsolatedTime(String IsolatedTime) {
        this.IsolatedTime = IsolatedTime;
    }

    /**
     * Get 计费模式，1、prepaid（包年包月,预付费）；2、postpaid（按量计费，后付费） 
     * @return PayType 计费模式，1、prepaid（包年包月,预付费）；2、postpaid（按量计费，后付费）
     */
    public String getPayType() {
        return this.PayType;
    }

    /**
     * Set 计费模式，1、prepaid（包年包月,预付费）；2、postpaid（按量计费，后付费）
     * @param PayType 计费模式，1、prepaid（包年包月,预付费）；2、postpaid（按量计费，后付费）
     */
    public void setPayType(String PayType) {
        this.PayType = PayType;
    }

    /**
     * Get 是否自动续费，1：自动续费，0：不自动续费 
     * @return AutoRenew 是否自动续费，1：自动续费，0：不自动续费
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set 是否自动续费，1：自动续费，0：不自动续费
     * @param AutoRenew 是否自动续费，1：自动续费，0：不自动续费
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get 实例网络连接信息 
     * @return DBInstanceNetInfo 实例网络连接信息
     */
    public DBInstanceNetInfo [] getDBInstanceNetInfo() {
        return this.DBInstanceNetInfo;
    }

    /**
     * Set 实例网络连接信息
     * @param DBInstanceNetInfo 实例网络连接信息
     */
    public void setDBInstanceNetInfo(DBInstanceNetInfo [] DBInstanceNetInfo) {
        this.DBInstanceNetInfo = DBInstanceNetInfo;
    }

    /**
     * Get 机器类型 
     * @return Type 机器类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 机器类型
     * @param Type 机器类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 用户的AppId 
     * @return AppId 用户的AppId
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户的AppId
     * @param AppId 用户的AppId
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 实例的Uid 
     * @return Uid 实例的Uid
     */
    public Long getUid() {
        return this.Uid;
    }

    /**
     * Set 实例的Uid
     * @param Uid 实例的Uid
     */
    public void setUid(Long Uid) {
        this.Uid = Uid;
    }

    /**
     * Get 实例是否支持Ipv6，1：支持，0：不支持 
     * @return SupportIpv6 实例是否支持Ipv6，1：支持，0：不支持
     */
    public Long getSupportIpv6() {
        return this.SupportIpv6;
    }

    /**
     * Set 实例是否支持Ipv6，1：支持，0：不支持
     * @param SupportIpv6 实例是否支持Ipv6，1：支持，0：不支持
     */
    public void setSupportIpv6(Long SupportIpv6) {
        this.SupportIpv6 = SupportIpv6;
    }

    /**
     * Get 实例绑定的标签信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagList 实例绑定的标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTagList() {
        return this.TagList;
    }

    /**
     * Set 实例绑定的标签信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagList 实例绑定的标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagList(Tag [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get 主实例信息，仅在实例为只读实例时返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MasterDBInstanceId 主实例信息，仅在实例为只读实例时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMasterDBInstanceId() {
        return this.MasterDBInstanceId;
    }

    /**
     * Set 主实例信息，仅在实例为只读实例时返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param MasterDBInstanceId 主实例信息，仅在实例为只读实例时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMasterDBInstanceId(String MasterDBInstanceId) {
        this.MasterDBInstanceId = MasterDBInstanceId;
    }

    /**
     * Get 只读实例数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReadOnlyInstanceNum 只读实例数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReadOnlyInstanceNum() {
        return this.ReadOnlyInstanceNum;
    }

    /**
     * Set 只读实例数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReadOnlyInstanceNum 只读实例数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReadOnlyInstanceNum(Long ReadOnlyInstanceNum) {
        this.ReadOnlyInstanceNum = ReadOnlyInstanceNum;
    }

    /**
     * Get 只读实例在只读组中的状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusInReadonlyGroup 只读实例在只读组中的状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatusInReadonlyGroup() {
        return this.StatusInReadonlyGroup;
    }

    /**
     * Set 只读实例在只读组中的状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusInReadonlyGroup 只读实例在只读组中的状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusInReadonlyGroup(String StatusInReadonlyGroup) {
        this.StatusInReadonlyGroup = StatusInReadonlyGroup;
    }

    /**
     * Get 下线时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OfflineTime 下线时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOfflineTime() {
        return this.OfflineTime;
    }

    /**
     * Set 下线时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param OfflineTime 下线时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOfflineTime(String OfflineTime) {
        this.OfflineTime = OfflineTime;
    }

    /**
     * Get 数据库内核版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DBKernelVersion 数据库内核版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDBKernelVersion() {
        return this.DBKernelVersion;
    }

    /**
     * Set 数据库内核版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param DBKernelVersion 数据库内核版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDBKernelVersion(String DBKernelVersion) {
        this.DBKernelVersion = DBKernelVersion;
    }

    /**
     * Get 实例网络信息列表（此字段已废弃）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetworkAccessList 实例网络信息列表（此字段已废弃）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NetworkAccess [] getNetworkAccessList() {
        return this.NetworkAccessList;
    }

    /**
     * Set 实例网络信息列表（此字段已废弃）
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetworkAccessList 实例网络信息列表（此字段已废弃）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetworkAccessList(NetworkAccess [] NetworkAccessList) {
        this.NetworkAccessList = NetworkAccessList;
    }

    /**
     * Get PostgreSQL主要版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DBMajorVersion PostgreSQL主要版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDBMajorVersion() {
        return this.DBMajorVersion;
    }

    /**
     * Set PostgreSQL主要版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param DBMajorVersion PostgreSQL主要版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDBMajorVersion(String DBMajorVersion) {
        this.DBMajorVersion = DBMajorVersion;
    }

    /**
     * Get 实例的节点信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DBNodeSet 实例的节点信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DBNode [] getDBNodeSet() {
        return this.DBNodeSet;
    }

    /**
     * Set 实例的节点信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param DBNodeSet 实例的节点信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDBNodeSet(DBNode [] DBNodeSet) {
        this.DBNodeSet = DBNodeSet;
    }

    /**
     * Get 实例是否支持TDE数据加密  0：不支持，1：支持
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsSupportTDE 实例是否支持TDE数据加密  0：不支持，1：支持
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsSupportTDE() {
        return this.IsSupportTDE;
    }

    /**
     * Set 实例是否支持TDE数据加密  0：不支持，1：支持
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsSupportTDE 实例是否支持TDE数据加密  0：不支持，1：支持
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsSupportTDE(Long IsSupportTDE) {
        this.IsSupportTDE = IsSupportTDE;
    }

    public DBInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DBInstance(DBInstance source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.DBInstanceName != null) {
            this.DBInstanceName = new String(source.DBInstanceName);
        }
        if (source.DBInstanceStatus != null) {
            this.DBInstanceStatus = new String(source.DBInstanceStatus);
        }
        if (source.DBInstanceMemory != null) {
            this.DBInstanceMemory = new Long(source.DBInstanceMemory);
        }
        if (source.DBInstanceStorage != null) {
            this.DBInstanceStorage = new Long(source.DBInstanceStorage);
        }
        if (source.DBInstanceCpu != null) {
            this.DBInstanceCpu = new Long(source.DBInstanceCpu);
        }
        if (source.DBInstanceClass != null) {
            this.DBInstanceClass = new String(source.DBInstanceClass);
        }
        if (source.DBInstanceType != null) {
            this.DBInstanceType = new String(source.DBInstanceType);
        }
        if (source.DBInstanceVersion != null) {
            this.DBInstanceVersion = new String(source.DBInstanceVersion);
        }
        if (source.DBCharset != null) {
            this.DBCharset = new String(source.DBCharset);
        }
        if (source.DBVersion != null) {
            this.DBVersion = new String(source.DBVersion);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.IsolatedTime != null) {
            this.IsolatedTime = new String(source.IsolatedTime);
        }
        if (source.PayType != null) {
            this.PayType = new String(source.PayType);
        }
        if (source.AutoRenew != null) {
            this.AutoRenew = new Long(source.AutoRenew);
        }
        if (source.DBInstanceNetInfo != null) {
            this.DBInstanceNetInfo = new DBInstanceNetInfo[source.DBInstanceNetInfo.length];
            for (int i = 0; i < source.DBInstanceNetInfo.length; i++) {
                this.DBInstanceNetInfo[i] = new DBInstanceNetInfo(source.DBInstanceNetInfo[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Uid != null) {
            this.Uid = new Long(source.Uid);
        }
        if (source.SupportIpv6 != null) {
            this.SupportIpv6 = new Long(source.SupportIpv6);
        }
        if (source.TagList != null) {
            this.TagList = new Tag[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new Tag(source.TagList[i]);
            }
        }
        if (source.MasterDBInstanceId != null) {
            this.MasterDBInstanceId = new String(source.MasterDBInstanceId);
        }
        if (source.ReadOnlyInstanceNum != null) {
            this.ReadOnlyInstanceNum = new Long(source.ReadOnlyInstanceNum);
        }
        if (source.StatusInReadonlyGroup != null) {
            this.StatusInReadonlyGroup = new String(source.StatusInReadonlyGroup);
        }
        if (source.OfflineTime != null) {
            this.OfflineTime = new String(source.OfflineTime);
        }
        if (source.DBKernelVersion != null) {
            this.DBKernelVersion = new String(source.DBKernelVersion);
        }
        if (source.NetworkAccessList != null) {
            this.NetworkAccessList = new NetworkAccess[source.NetworkAccessList.length];
            for (int i = 0; i < source.NetworkAccessList.length; i++) {
                this.NetworkAccessList[i] = new NetworkAccess(source.NetworkAccessList[i]);
            }
        }
        if (source.DBMajorVersion != null) {
            this.DBMajorVersion = new String(source.DBMajorVersion);
        }
        if (source.DBNodeSet != null) {
            this.DBNodeSet = new DBNode[source.DBNodeSet.length];
            for (int i = 0; i < source.DBNodeSet.length; i++) {
                this.DBNodeSet[i] = new DBNode(source.DBNodeSet[i]);
            }
        }
        if (source.IsSupportTDE != null) {
            this.IsSupportTDE = new Long(source.IsSupportTDE);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "DBInstanceName", this.DBInstanceName);
        this.setParamSimple(map, prefix + "DBInstanceStatus", this.DBInstanceStatus);
        this.setParamSimple(map, prefix + "DBInstanceMemory", this.DBInstanceMemory);
        this.setParamSimple(map, prefix + "DBInstanceStorage", this.DBInstanceStorage);
        this.setParamSimple(map, prefix + "DBInstanceCpu", this.DBInstanceCpu);
        this.setParamSimple(map, prefix + "DBInstanceClass", this.DBInstanceClass);
        this.setParamSimple(map, prefix + "DBInstanceType", this.DBInstanceType);
        this.setParamSimple(map, prefix + "DBInstanceVersion", this.DBInstanceVersion);
        this.setParamSimple(map, prefix + "DBCharset", this.DBCharset);
        this.setParamSimple(map, prefix + "DBVersion", this.DBVersion);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "IsolatedTime", this.IsolatedTime);
        this.setParamSimple(map, prefix + "PayType", this.PayType);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);
        this.setParamArrayObj(map, prefix + "DBInstanceNetInfo.", this.DBInstanceNetInfo);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "SupportIpv6", this.SupportIpv6);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);
        this.setParamSimple(map, prefix + "MasterDBInstanceId", this.MasterDBInstanceId);
        this.setParamSimple(map, prefix + "ReadOnlyInstanceNum", this.ReadOnlyInstanceNum);
        this.setParamSimple(map, prefix + "StatusInReadonlyGroup", this.StatusInReadonlyGroup);
        this.setParamSimple(map, prefix + "OfflineTime", this.OfflineTime);
        this.setParamSimple(map, prefix + "DBKernelVersion", this.DBKernelVersion);
        this.setParamArrayObj(map, prefix + "NetworkAccessList.", this.NetworkAccessList);
        this.setParamSimple(map, prefix + "DBMajorVersion", this.DBMajorVersion);
        this.setParamArrayObj(map, prefix + "DBNodeSet.", this.DBNodeSet);
        this.setParamSimple(map, prefix + "IsSupportTDE", this.IsSupportTDE);

    }
}

