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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceInfo extends AbstractModel{

    /**
    * 外网状态，可能的返回值为：0-未开通外网；1-已开通外网；2-已关闭外网
    */
    @SerializedName("WanStatus")
    @Expose
    private Long WanStatus;

    /**
    * 可用区信息
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 初始化标志，可能的返回值为：0-未初始化；1-已初始化
    */
    @SerializedName("InitFlag")
    @Expose
    private Long InitFlag;

    /**
    * 只读vip信息。单独开通只读实例访问的只读实例才有该字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoVipInfo")
    @Expose
    private RoVipInfo RoVipInfo;

    /**
    * 内存容量，单位为 MB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 实例状态，可能的返回值：0-创建中；1-运行中；4-隔离中；5-已隔离
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 私有网络 ID，例如：51102
    */
    @SerializedName("VpcId")
    @Expose
    private Long VpcId;

    /**
    * 备机信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SlaveInfo")
    @Expose
    private SlaveInfo SlaveInfo;

    /**
    * 实例 ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 硬盘容量，单位为 GB
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * 自动续费标志，可能的返回值：0-未开通自动续费；1-已开通自动续费；2-已关闭自动续费
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * 数据复制方式。0 - 异步复制；1 - 半同步复制；2 - 强同步复制
    */
    @SerializedName("ProtectMode")
    @Expose
    private Long ProtectMode;

    /**
    * 只读组详细信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoGroups")
    @Expose
    private RoGroup [] RoGroups;

    /**
    * 子网 ID，例如：2333
    */
    @SerializedName("SubnetId")
    @Expose
    private Long SubnetId;

    /**
    * 实例类型，可能的返回值：1-主实例；2-灾备实例；3-只读实例
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * 项目 ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 地域信息
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 实例到期时间
    */
    @SerializedName("DeadlineTime")
    @Expose
    private String DeadlineTime;

    /**
    * 可用区部署方式。可能的值为：0 - 单可用区；1 - 多可用区
    */
    @SerializedName("DeployMode")
    @Expose
    private Long DeployMode;

    /**
    * 实例任务状态。0 - 没有任务 ,1 - 升级中,2 - 数据导入中,3 - 开放Slave中,4 - 外网访问开通中,5 - 批量操作执行中,6 - 回档中,7 - 外网访问关闭中,8 - 密码修改中,9 - 实例名修改中,10 - 重启中,12 - 自建迁移中,13 - 删除库表中,14 - 灾备实例创建同步中,15 - 升级待切换,16 - 升级切换中,17 - 升级切换完成
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long TaskStatus;

    /**
    * 主实例详细信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MasterInfo")
    @Expose
    private MasterInfo MasterInfo;

    /**
    * 实例类型，可能的返回值：“HA”-高可用版；“FE”-金融版；“BASIC”-基础版
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * 内核版本
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 灾备实例详细信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DrInfo")
    @Expose
    private DrInfo [] DrInfo;

    /**
    * 外网域名
    */
    @SerializedName("WanDomain")
    @Expose
    private String WanDomain;

    /**
    * 外网端口号
    */
    @SerializedName("WanPort")
    @Expose
    private Long WanPort;

    /**
    * 付费类型，可能的返回值：0-包年包月；1-按量计费
    */
    @SerializedName("PayType")
    @Expose
    private Long PayType;

    /**
    * 实例创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 实例 IP
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 端口号
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * 是否锁定标记
    */
    @SerializedName("CdbError")
    @Expose
    private Long CdbError;

    /**
    * 私有网络描述符，例如：“vpc-5v8wn9mg”
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * 子网描述符，例如：“subnet-1typ0s7d”
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * 物理 ID
    */
    @SerializedName("PhysicalId")
    @Expose
    private String PhysicalId;

    /**
    * 核心数
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 每秒查询数量
    */
    @SerializedName("Qps")
    @Expose
    private Long Qps;

    /**
    * 可用区中文名称
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 物理机型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceClass")
    @Expose
    private String DeviceClass;

    /**
    * 置放群组 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeployGroupId")
    @Expose
    private String DeployGroupId;

    /**
    * 可用区 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
     * Get 外网状态，可能的返回值为：0-未开通外网；1-已开通外网；2-已关闭外网 
     * @return WanStatus 外网状态，可能的返回值为：0-未开通外网；1-已开通外网；2-已关闭外网
     */
    public Long getWanStatus() {
        return this.WanStatus;
    }

    /**
     * Set 外网状态，可能的返回值为：0-未开通外网；1-已开通外网；2-已关闭外网
     * @param WanStatus 外网状态，可能的返回值为：0-未开通外网；1-已开通外网；2-已关闭外网
     */
    public void setWanStatus(Long WanStatus) {
        this.WanStatus = WanStatus;
    }

    /**
     * Get 可用区信息 
     * @return Zone 可用区信息
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区信息
     * @param Zone 可用区信息
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 初始化标志，可能的返回值为：0-未初始化；1-已初始化 
     * @return InitFlag 初始化标志，可能的返回值为：0-未初始化；1-已初始化
     */
    public Long getInitFlag() {
        return this.InitFlag;
    }

    /**
     * Set 初始化标志，可能的返回值为：0-未初始化；1-已初始化
     * @param InitFlag 初始化标志，可能的返回值为：0-未初始化；1-已初始化
     */
    public void setInitFlag(Long InitFlag) {
        this.InitFlag = InitFlag;
    }

    /**
     * Get 只读vip信息。单独开通只读实例访问的只读实例才有该字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoVipInfo 只读vip信息。单独开通只读实例访问的只读实例才有该字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RoVipInfo getRoVipInfo() {
        return this.RoVipInfo;
    }

    /**
     * Set 只读vip信息。单独开通只读实例访问的只读实例才有该字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoVipInfo 只读vip信息。单独开通只读实例访问的只读实例才有该字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoVipInfo(RoVipInfo RoVipInfo) {
        this.RoVipInfo = RoVipInfo;
    }

    /**
     * Get 内存容量，单位为 MB 
     * @return Memory 内存容量，单位为 MB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存容量，单位为 MB
     * @param Memory 内存容量，单位为 MB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 实例状态，可能的返回值：0-创建中；1-运行中；4-隔离中；5-已隔离 
     * @return Status 实例状态，可能的返回值：0-创建中；1-运行中；4-隔离中；5-已隔离
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 实例状态，可能的返回值：0-创建中；1-运行中；4-隔离中；5-已隔离
     * @param Status 实例状态，可能的返回值：0-创建中；1-运行中；4-隔离中；5-已隔离
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 私有网络 ID，例如：51102 
     * @return VpcId 私有网络 ID，例如：51102
     */
    public Long getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络 ID，例如：51102
     * @param VpcId 私有网络 ID，例如：51102
     */
    public void setVpcId(Long VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 备机信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SlaveInfo 备机信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SlaveInfo getSlaveInfo() {
        return this.SlaveInfo;
    }

    /**
     * Set 备机信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param SlaveInfo 备机信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSlaveInfo(SlaveInfo SlaveInfo) {
        this.SlaveInfo = SlaveInfo;
    }

    /**
     * Get 实例 ID 
     * @return InstanceId 实例 ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID
     * @param InstanceId 实例 ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 硬盘容量，单位为 GB 
     * @return Volume 硬盘容量，单位为 GB
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set 硬盘容量，单位为 GB
     * @param Volume 硬盘容量，单位为 GB
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get 自动续费标志，可能的返回值：0-未开通自动续费；1-已开通自动续费；2-已关闭自动续费 
     * @return AutoRenew 自动续费标志，可能的返回值：0-未开通自动续费；1-已开通自动续费；2-已关闭自动续费
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set 自动续费标志，可能的返回值：0-未开通自动续费；1-已开通自动续费；2-已关闭自动续费
     * @param AutoRenew 自动续费标志，可能的返回值：0-未开通自动续费；1-已开通自动续费；2-已关闭自动续费
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get 数据复制方式。0 - 异步复制；1 - 半同步复制；2 - 强同步复制 
     * @return ProtectMode 数据复制方式。0 - 异步复制；1 - 半同步复制；2 - 强同步复制
     */
    public Long getProtectMode() {
        return this.ProtectMode;
    }

    /**
     * Set 数据复制方式。0 - 异步复制；1 - 半同步复制；2 - 强同步复制
     * @param ProtectMode 数据复制方式。0 - 异步复制；1 - 半同步复制；2 - 强同步复制
     */
    public void setProtectMode(Long ProtectMode) {
        this.ProtectMode = ProtectMode;
    }

    /**
     * Get 只读组详细信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoGroups 只读组详细信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RoGroup [] getRoGroups() {
        return this.RoGroups;
    }

    /**
     * Set 只读组详细信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoGroups 只读组详细信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoGroups(RoGroup [] RoGroups) {
        this.RoGroups = RoGroups;
    }

    /**
     * Get 子网 ID，例如：2333 
     * @return SubnetId 子网 ID，例如：2333
     */
    public Long getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网 ID，例如：2333
     * @param SubnetId 子网 ID，例如：2333
     */
    public void setSubnetId(Long SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 实例类型，可能的返回值：1-主实例；2-灾备实例；3-只读实例 
     * @return InstanceType 实例类型，可能的返回值：1-主实例；2-灾备实例；3-只读实例
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型，可能的返回值：1-主实例；2-灾备实例；3-只读实例
     * @param InstanceType 实例类型，可能的返回值：1-主实例；2-灾备实例；3-只读实例
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 项目 ID 
     * @return ProjectId 项目 ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目 ID
     * @param ProjectId 项目 ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 地域信息 
     * @return Region 地域信息
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域信息
     * @param Region 地域信息
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 实例到期时间 
     * @return DeadlineTime 实例到期时间
     */
    public String getDeadlineTime() {
        return this.DeadlineTime;
    }

    /**
     * Set 实例到期时间
     * @param DeadlineTime 实例到期时间
     */
    public void setDeadlineTime(String DeadlineTime) {
        this.DeadlineTime = DeadlineTime;
    }

    /**
     * Get 可用区部署方式。可能的值为：0 - 单可用区；1 - 多可用区 
     * @return DeployMode 可用区部署方式。可能的值为：0 - 单可用区；1 - 多可用区
     */
    public Long getDeployMode() {
        return this.DeployMode;
    }

    /**
     * Set 可用区部署方式。可能的值为：0 - 单可用区；1 - 多可用区
     * @param DeployMode 可用区部署方式。可能的值为：0 - 单可用区；1 - 多可用区
     */
    public void setDeployMode(Long DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * Get 实例任务状态。0 - 没有任务 ,1 - 升级中,2 - 数据导入中,3 - 开放Slave中,4 - 外网访问开通中,5 - 批量操作执行中,6 - 回档中,7 - 外网访问关闭中,8 - 密码修改中,9 - 实例名修改中,10 - 重启中,12 - 自建迁移中,13 - 删除库表中,14 - 灾备实例创建同步中,15 - 升级待切换,16 - 升级切换中,17 - 升级切换完成 
     * @return TaskStatus 实例任务状态。0 - 没有任务 ,1 - 升级中,2 - 数据导入中,3 - 开放Slave中,4 - 外网访问开通中,5 - 批量操作执行中,6 - 回档中,7 - 外网访问关闭中,8 - 密码修改中,9 - 实例名修改中,10 - 重启中,12 - 自建迁移中,13 - 删除库表中,14 - 灾备实例创建同步中,15 - 升级待切换,16 - 升级切换中,17 - 升级切换完成
     */
    public Long getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 实例任务状态。0 - 没有任务 ,1 - 升级中,2 - 数据导入中,3 - 开放Slave中,4 - 外网访问开通中,5 - 批量操作执行中,6 - 回档中,7 - 外网访问关闭中,8 - 密码修改中,9 - 实例名修改中,10 - 重启中,12 - 自建迁移中,13 - 删除库表中,14 - 灾备实例创建同步中,15 - 升级待切换,16 - 升级切换中,17 - 升级切换完成
     * @param TaskStatus 实例任务状态。0 - 没有任务 ,1 - 升级中,2 - 数据导入中,3 - 开放Slave中,4 - 外网访问开通中,5 - 批量操作执行中,6 - 回档中,7 - 外网访问关闭中,8 - 密码修改中,9 - 实例名修改中,10 - 重启中,12 - 自建迁移中,13 - 删除库表中,14 - 灾备实例创建同步中,15 - 升级待切换,16 - 升级切换中,17 - 升级切换完成
     */
    public void setTaskStatus(Long TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get 主实例详细信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MasterInfo 主实例详细信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MasterInfo getMasterInfo() {
        return this.MasterInfo;
    }

    /**
     * Set 主实例详细信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param MasterInfo 主实例详细信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMasterInfo(MasterInfo MasterInfo) {
        this.MasterInfo = MasterInfo;
    }

    /**
     * Get 实例类型，可能的返回值：“HA”-高可用版；“FE”-金融版；“BASIC”-基础版 
     * @return DeviceType 实例类型，可能的返回值：“HA”-高可用版；“FE”-金融版；“BASIC”-基础版
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 实例类型，可能的返回值：“HA”-高可用版；“FE”-金融版；“BASIC”-基础版
     * @param DeviceType 实例类型，可能的返回值：“HA”-高可用版；“FE”-金融版；“BASIC”-基础版
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get 内核版本 
     * @return EngineVersion 内核版本
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set 内核版本
     * @param EngineVersion 内核版本
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
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
     * Get 灾备实例详细信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DrInfo 灾备实例详细信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DrInfo [] getDrInfo() {
        return this.DrInfo;
    }

    /**
     * Set 灾备实例详细信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param DrInfo 灾备实例详细信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDrInfo(DrInfo [] DrInfo) {
        this.DrInfo = DrInfo;
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
     * Get 外网端口号 
     * @return WanPort 外网端口号
     */
    public Long getWanPort() {
        return this.WanPort;
    }

    /**
     * Set 外网端口号
     * @param WanPort 外网端口号
     */
    public void setWanPort(Long WanPort) {
        this.WanPort = WanPort;
    }

    /**
     * Get 付费类型，可能的返回值：0-包年包月；1-按量计费 
     * @return PayType 付费类型，可能的返回值：0-包年包月；1-按量计费
     */
    public Long getPayType() {
        return this.PayType;
    }

    /**
     * Set 付费类型，可能的返回值：0-包年包月；1-按量计费
     * @param PayType 付费类型，可能的返回值：0-包年包月；1-按量计费
     */
    public void setPayType(Long PayType) {
        this.PayType = PayType;
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
     * Get 实例 IP 
     * @return Vip 实例 IP
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 实例 IP
     * @param Vip 实例 IP
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 端口号 
     * @return Vport 端口号
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set 端口号
     * @param Vport 端口号
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get 是否锁定标记 
     * @return CdbError 是否锁定标记
     */
    public Long getCdbError() {
        return this.CdbError;
    }

    /**
     * Set 是否锁定标记
     * @param CdbError 是否锁定标记
     */
    public void setCdbError(Long CdbError) {
        this.CdbError = CdbError;
    }

    /**
     * Get 私有网络描述符，例如：“vpc-5v8wn9mg” 
     * @return UniqVpcId 私有网络描述符，例如：“vpc-5v8wn9mg”
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set 私有网络描述符，例如：“vpc-5v8wn9mg”
     * @param UniqVpcId 私有网络描述符，例如：“vpc-5v8wn9mg”
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get 子网描述符，例如：“subnet-1typ0s7d” 
     * @return UniqSubnetId 子网描述符，例如：“subnet-1typ0s7d”
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set 子网描述符，例如：“subnet-1typ0s7d”
     * @param UniqSubnetId 子网描述符，例如：“subnet-1typ0s7d”
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get 物理 ID 
     * @return PhysicalId 物理 ID
     */
    public String getPhysicalId() {
        return this.PhysicalId;
    }

    /**
     * Set 物理 ID
     * @param PhysicalId 物理 ID
     */
    public void setPhysicalId(String PhysicalId) {
        this.PhysicalId = PhysicalId;
    }

    /**
     * Get 核心数 
     * @return Cpu 核心数
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set 核心数
     * @param Cpu 核心数
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 每秒查询数量 
     * @return Qps 每秒查询数量
     */
    public Long getQps() {
        return this.Qps;
    }

    /**
     * Set 每秒查询数量
     * @param Qps 每秒查询数量
     */
    public void setQps(Long Qps) {
        this.Qps = Qps;
    }

    /**
     * Get 可用区中文名称 
     * @return ZoneName 可用区中文名称
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 可用区中文名称
     * @param ZoneName 可用区中文名称
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get 物理机型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceClass 物理机型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeviceClass() {
        return this.DeviceClass;
    }

    /**
     * Set 物理机型
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceClass 物理机型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceClass(String DeviceClass) {
        this.DeviceClass = DeviceClass;
    }

    /**
     * Get 置放群组 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeployGroupId 置放群组 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeployGroupId() {
        return this.DeployGroupId;
    }

    /**
     * Set 置放群组 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeployGroupId 置放群组 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeployGroupId(String DeployGroupId) {
        this.DeployGroupId = DeployGroupId;
    }

    /**
     * Get 可用区 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneId 可用区 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 可用区 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneId 可用区 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WanStatus", this.WanStatus);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InitFlag", this.InitFlag);
        this.setParamObj(map, prefix + "RoVipInfo.", this.RoVipInfo);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamObj(map, prefix + "SlaveInfo.", this.SlaveInfo);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);
        this.setParamSimple(map, prefix + "ProtectMode", this.ProtectMode);
        this.setParamArrayObj(map, prefix + "RoGroups.", this.RoGroups);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "DeadlineTime", this.DeadlineTime);
        this.setParamSimple(map, prefix + "DeployMode", this.DeployMode);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamObj(map, prefix + "MasterInfo.", this.MasterInfo);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArrayObj(map, prefix + "DrInfo.", this.DrInfo);
        this.setParamSimple(map, prefix + "WanDomain", this.WanDomain);
        this.setParamSimple(map, prefix + "WanPort", this.WanPort);
        this.setParamSimple(map, prefix + "PayType", this.PayType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "CdbError", this.CdbError);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "PhysicalId", this.PhysicalId);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Qps", this.Qps);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "DeviceClass", this.DeviceClass);
        this.setParamSimple(map, prefix + "DeployGroupId", this.DeployGroupId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);

    }
}

