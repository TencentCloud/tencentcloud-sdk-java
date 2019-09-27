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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DBInstance  extends AbstractModel{

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
    private Integer ProjectId;

    /**
    * 实例所在地域ID
    */
    @SerializedName("RegionId")
    @Expose
    private Integer RegionId;

    /**
    * 实例所在可用区ID
    */
    @SerializedName("ZoneId")
    @Expose
    private Integer ZoneId;

    /**
    * 实例所在私有网络ID，基础网络时为 0
    */
    @SerializedName("VpcId")
    @Expose
    private Integer VpcId;

    /**
    * 实例所在私有网络子网ID，基础网络时为 0
    */
    @SerializedName("SubnetId")
    @Expose
    private Integer SubnetId;

    /**
    * 实例状态。取值范围： <li>1：申请中</li> <li>2：运行中</li> <li>3：受限运行中 (主备切换中)</li> <li>4：已隔离</li> <li>5：回收中</li> <li>6：已回收</li> <li>7：任务执行中 (实例做备份、回档等操作)</li> <li>8：已下线</li> <li>9：实例扩容中</li> <li>10：实例迁移中</li> <li>11：只读</li> <li>12：重启中</li>
    */
    @SerializedName("Status")
    @Expose
    private Integer Status;

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
    private Integer Vport;

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
    private Integer Memory;

    /**
    * 实例已经使用存储空间大小，单位G
    */
    @SerializedName("UsedStorage")
    @Expose
    private Integer UsedStorage;

    /**
    * 实例存储空间大小，单位G
    */
    @SerializedName("Storage")
    @Expose
    private Integer Storage;

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
    private Integer RenewFlag;

    /**
    * 实例高可用， 1-双机高可用，2-单机
    */
    @SerializedName("Model")
    @Expose
    private Integer Model;

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
    private Integer PayMode;

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
    private Integer Cpu;

    /**
    * 实例版本代号
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 物理机代号
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 计费ID
    */
    @SerializedName("Pid")
    @Expose
    private Integer Pid;

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
     * @return Name 实例名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置实例名称
     * @param Name 实例名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取实例所在项目ID
     * @return ProjectId 实例所在项目ID
     */
    public Integer getProjectId() {
        return this.ProjectId;
    }

    /**
     * 设置实例所在项目ID
     * @param ProjectId 实例所在项目ID
     */
    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * 获取实例所在地域ID
     * @return RegionId 实例所在地域ID
     */
    public Integer getRegionId() {
        return this.RegionId;
    }

    /**
     * 设置实例所在地域ID
     * @param RegionId 实例所在地域ID
     */
    public void setRegionId(Integer RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * 获取实例所在可用区ID
     * @return ZoneId 实例所在可用区ID
     */
    public Integer getZoneId() {
        return this.ZoneId;
    }

    /**
     * 设置实例所在可用区ID
     * @param ZoneId 实例所在可用区ID
     */
    public void setZoneId(Integer ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * 获取实例所在私有网络ID，基础网络时为 0
     * @return VpcId 实例所在私有网络ID，基础网络时为 0
     */
    public Integer getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置实例所在私有网络ID，基础网络时为 0
     * @param VpcId 实例所在私有网络ID，基础网络时为 0
     */
    public void setVpcId(Integer VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取实例所在私有网络子网ID，基础网络时为 0
     * @return SubnetId 实例所在私有网络子网ID，基础网络时为 0
     */
    public Integer getSubnetId() {
        return this.SubnetId;
    }

    /**
     * 设置实例所在私有网络子网ID，基础网络时为 0
     * @param SubnetId 实例所在私有网络子网ID，基础网络时为 0
     */
    public void setSubnetId(Integer SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * 获取实例状态。取值范围： <li>1：申请中</li> <li>2：运行中</li> <li>3：受限运行中 (主备切换中)</li> <li>4：已隔离</li> <li>5：回收中</li> <li>6：已回收</li> <li>7：任务执行中 (实例做备份、回档等操作)</li> <li>8：已下线</li> <li>9：实例扩容中</li> <li>10：实例迁移中</li> <li>11：只读</li> <li>12：重启中</li>
     * @return Status 实例状态。取值范围： <li>1：申请中</li> <li>2：运行中</li> <li>3：受限运行中 (主备切换中)</li> <li>4：已隔离</li> <li>5：回收中</li> <li>6：已回收</li> <li>7：任务执行中 (实例做备份、回档等操作)</li> <li>8：已下线</li> <li>9：实例扩容中</li> <li>10：实例迁移中</li> <li>11：只读</li> <li>12：重启中</li>
     */
    public Integer getStatus() {
        return this.Status;
    }

    /**
     * 设置实例状态。取值范围： <li>1：申请中</li> <li>2：运行中</li> <li>3：受限运行中 (主备切换中)</li> <li>4：已隔离</li> <li>5：回收中</li> <li>6：已回收</li> <li>7：任务执行中 (实例做备份、回档等操作)</li> <li>8：已下线</li> <li>9：实例扩容中</li> <li>10：实例迁移中</li> <li>11：只读</li> <li>12：重启中</li>
     * @param Status 实例状态。取值范围： <li>1：申请中</li> <li>2：运行中</li> <li>3：受限运行中 (主备切换中)</li> <li>4：已隔离</li> <li>5：回收中</li> <li>6：已回收</li> <li>7：任务执行中 (实例做备份、回档等操作)</li> <li>8：已下线</li> <li>9：实例扩容中</li> <li>10：实例迁移中</li> <li>11：只读</li> <li>12：重启中</li>
     */
    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    /**
     * 获取实例访问IP
     * @return Vip 实例访问IP
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * 设置实例访问IP
     * @param Vip 实例访问IP
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * 获取实例访问端口
     * @return Vport 实例访问端口
     */
    public Integer getVport() {
        return this.Vport;
    }

    /**
     * 设置实例访问端口
     * @param Vport 实例访问端口
     */
    public void setVport(Integer Vport) {
        this.Vport = Vport;
    }

    /**
     * 获取实例创建时间
     * @return CreateTime 实例创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置实例创建时间
     * @param CreateTime 实例创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取实例更新时间
     * @return UpdateTime 实例更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * 设置实例更新时间
     * @param UpdateTime 实例更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * 获取实例计费开始时间
     * @return StartTime 实例计费开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * 设置实例计费开始时间
     * @param StartTime 实例计费开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * 获取实例计费结束时间
     * @return EndTime 实例计费结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * 设置实例计费结束时间
     * @param EndTime 实例计费结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * 获取实例隔离时间
     * @return IsolateTime 实例隔离时间
     */
    public String getIsolateTime() {
        return this.IsolateTime;
    }

    /**
     * 设置实例隔离时间
     * @param IsolateTime 实例隔离时间
     */
    public void setIsolateTime(String IsolateTime) {
        this.IsolateTime = IsolateTime;
    }

    /**
     * 获取实例内存大小，单位G
     * @return Memory 实例内存大小，单位G
     */
    public Integer getMemory() {
        return this.Memory;
    }

    /**
     * 设置实例内存大小，单位G
     * @param Memory 实例内存大小，单位G
     */
    public void setMemory(Integer Memory) {
        this.Memory = Memory;
    }

    /**
     * 获取实例已经使用存储空间大小，单位G
     * @return UsedStorage 实例已经使用存储空间大小，单位G
     */
    public Integer getUsedStorage() {
        return this.UsedStorage;
    }

    /**
     * 设置实例已经使用存储空间大小，单位G
     * @param UsedStorage 实例已经使用存储空间大小，单位G
     */
    public void setUsedStorage(Integer UsedStorage) {
        this.UsedStorage = UsedStorage;
    }

    /**
     * 获取实例存储空间大小，单位G
     * @return Storage 实例存储空间大小，单位G
     */
    public Integer getStorage() {
        return this.Storage;
    }

    /**
     * 设置实例存储空间大小，单位G
     * @param Storage 实例存储空间大小，单位G
     */
    public void setStorage(Integer Storage) {
        this.Storage = Storage;
    }

    /**
     * 获取实例版本
     * @return VersionName 实例版本
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * 设置实例版本
     * @param VersionName 实例版本
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * 获取实例续费标记，0-正常续费，1-自动续费，2-到期不续费
     * @return RenewFlag 实例续费标记，0-正常续费，1-自动续费，2-到期不续费
     */
    public Integer getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * 设置实例续费标记，0-正常续费，1-自动续费，2-到期不续费
     * @param RenewFlag 实例续费标记，0-正常续费，1-自动续费，2-到期不续费
     */
    public void setRenewFlag(Integer RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * 获取实例高可用， 1-双机高可用，2-单机
     * @return Model 实例高可用， 1-双机高可用，2-单机
     */
    public Integer getModel() {
        return this.Model;
    }

    /**
     * 设置实例高可用， 1-双机高可用，2-单机
     * @param Model 实例高可用， 1-双机高可用，2-单机
     */
    public void setModel(Integer Model) {
        this.Model = Model;
    }

    /**
     * 获取实例所在地域名称，如 ap-guangzhou
     * @return Region 实例所在地域名称，如 ap-guangzhou
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * 设置实例所在地域名称，如 ap-guangzhou
     * @param Region 实例所在地域名称，如 ap-guangzhou
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * 获取实例所在可用区名称，如 ap-guangzhou-1
     * @return Zone 实例所在可用区名称，如 ap-guangzhou-1
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * 设置实例所在可用区名称，如 ap-guangzhou-1
     * @param Zone 实例所在可用区名称，如 ap-guangzhou-1
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * 获取备份时间点
     * @return BackupTime 备份时间点
     */
    public String getBackupTime() {
        return this.BackupTime;
    }

    /**
     * 设置备份时间点
     * @param BackupTime 备份时间点
     */
    public void setBackupTime(String BackupTime) {
        this.BackupTime = BackupTime;
    }

    /**
     * 获取实例付费模式， 0-按量计费，1-包年包月
     * @return PayMode 实例付费模式， 0-按量计费，1-包年包月
     */
    public Integer getPayMode() {
        return this.PayMode;
    }

    /**
     * 设置实例付费模式， 0-按量计费，1-包年包月
     * @param PayMode 实例付费模式， 0-按量计费，1-包年包月
     */
    public void setPayMode(Integer PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * 获取实例唯一UID
     * @return Uid 实例唯一UID
     */
    public String getUid() {
        return this.Uid;
    }

    /**
     * 设置实例唯一UID
     * @param Uid 实例唯一UID
     */
    public void setUid(String Uid) {
        this.Uid = Uid;
    }

    /**
     * 获取实例cpu核心数
     * @return Cpu 实例cpu核心数
     */
    public Integer getCpu() {
        return this.Cpu;
    }

    /**
     * 设置实例cpu核心数
     * @param Cpu 实例cpu核心数
     */
    public void setCpu(Integer Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * 获取实例版本代号
     * @return Version 实例版本代号
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * 设置实例版本代号
     * @param Version 实例版本代号
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * 获取物理机代号
     * @return Type 物理机代号
     */
    public String getType() {
        return this.Type;
    }

    /**
     * 设置物理机代号
     * @param Type 物理机代号
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * 获取计费ID
     * @return Pid 计费ID
     */
    public Integer getPid() {
        return this.Pid;
    }

    /**
     * 设置计费ID
     * @param Pid 计费ID
     */
    public void setPid(Integer Pid) {
        this.Pid = Pid;
    }

    /**
     * 内部实现，用户禁止调用
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

    }
}

