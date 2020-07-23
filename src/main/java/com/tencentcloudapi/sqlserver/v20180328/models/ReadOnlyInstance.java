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

public class ReadOnlyInstance extends AbstractModel{

    /**
    * 只读副本ID，格式如：mssqlro-3l3fgqn7
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 只读副本名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 只读副本唯一UID
    */
    @SerializedName("Uid")
    @Expose
    private String Uid;

    /**
    * 只读副本所在项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 只读副本状态。1：申请中 2：运行中 3：被延迟剔除 4：已隔离 5：回收中 6：已回收 7：任务执行中 8：已下线 9：实例扩容中 10：实例迁移中  12：重启中
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 只读副本创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 只读副本更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 只读副本内存大小，单位G
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 只读副本存储空间大小，单位G
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * 只读副本cpu核心数
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 只读副本版本代号
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 宿主机代号
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 只读副本模式，2-单机
    */
    @SerializedName("Model")
    @Expose
    private Long Model;

    /**
    * 只读副本计费模式，1-包年包月，0-按量计费
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 只读副本权重
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * 只读副本延迟时间，单位秒
    */
    @SerializedName("DelayTime")
    @Expose
    private String DelayTime;

    /**
    * 只读副本与主实例的同步状态。
Init:初始化
DeployReadOnlyInPorgress:部署副本进行中
DeployReadOnlySuccess:部署副本成功
DeployReadOnlyFail:部署副本失败
DeployMasterDBInPorgress:主节点上加入副本数据库进行中
DeployMasterDBSuccess:主节点上加入副本数据库成功
DeployMasterDBFail:主节点上加入副本数据库进失败
DeployReadOnlyDBInPorgress:副本还原加入数据库开始
DeployReadOnlyDBSuccess:副本还原加入数据库成功
DeployReadOnlyDBFail:副本还原加入数据库失败
SyncDelay:同步延迟
SyncFail:同步故障
SyncExcluded:已剔除只读组
SyncNormal:正常
    */
    @SerializedName("SynStatus")
    @Expose
    private String SynStatus;

    /**
    * 只读副本与主实例没有同步的库
    */
    @SerializedName("DatabaseDifference")
    @Expose
    private String DatabaseDifference;

    /**
    * 只读副本与主实例没有同步的账户
    */
    @SerializedName("AccountDifference")
    @Expose
    private String AccountDifference;

    /**
    * 只读副本计费开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 只读副本计费结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 只读副本隔离时间
    */
    @SerializedName("IsolateTime")
    @Expose
    private String IsolateTime;

    /**
     * Get 只读副本ID，格式如：mssqlro-3l3fgqn7 
     * @return InstanceId 只读副本ID，格式如：mssqlro-3l3fgqn7
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 只读副本ID，格式如：mssqlro-3l3fgqn7
     * @param InstanceId 只读副本ID，格式如：mssqlro-3l3fgqn7
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 只读副本名称 
     * @return Name 只读副本名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 只读副本名称
     * @param Name 只读副本名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 只读副本唯一UID 
     * @return Uid 只读副本唯一UID
     */
    public String getUid() {
        return this.Uid;
    }

    /**
     * Set 只读副本唯一UID
     * @param Uid 只读副本唯一UID
     */
    public void setUid(String Uid) {
        this.Uid = Uid;
    }

    /**
     * Get 只读副本所在项目ID 
     * @return ProjectId 只读副本所在项目ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 只读副本所在项目ID
     * @param ProjectId 只读副本所在项目ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 只读副本状态。1：申请中 2：运行中 3：被延迟剔除 4：已隔离 5：回收中 6：已回收 7：任务执行中 8：已下线 9：实例扩容中 10：实例迁移中  12：重启中 
     * @return Status 只读副本状态。1：申请中 2：运行中 3：被延迟剔除 4：已隔离 5：回收中 6：已回收 7：任务执行中 8：已下线 9：实例扩容中 10：实例迁移中  12：重启中
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 只读副本状态。1：申请中 2：运行中 3：被延迟剔除 4：已隔离 5：回收中 6：已回收 7：任务执行中 8：已下线 9：实例扩容中 10：实例迁移中  12：重启中
     * @param Status 只读副本状态。1：申请中 2：运行中 3：被延迟剔除 4：已隔离 5：回收中 6：已回收 7：任务执行中 8：已下线 9：实例扩容中 10：实例迁移中  12：重启中
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 只读副本创建时间 
     * @return CreateTime 只读副本创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 只读副本创建时间
     * @param CreateTime 只读副本创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 只读副本更新时间 
     * @return UpdateTime 只读副本更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 只读副本更新时间
     * @param UpdateTime 只读副本更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 只读副本内存大小，单位G 
     * @return Memory 只读副本内存大小，单位G
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 只读副本内存大小，单位G
     * @param Memory 只读副本内存大小，单位G
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 只读副本存储空间大小，单位G 
     * @return Storage 只读副本存储空间大小，单位G
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set 只读副本存储空间大小，单位G
     * @param Storage 只读副本存储空间大小，单位G
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get 只读副本cpu核心数 
     * @return Cpu 只读副本cpu核心数
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set 只读副本cpu核心数
     * @param Cpu 只读副本cpu核心数
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 只读副本版本代号 
     * @return Version 只读副本版本代号
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 只读副本版本代号
     * @param Version 只读副本版本代号
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 宿主机代号 
     * @return Type 宿主机代号
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 宿主机代号
     * @param Type 宿主机代号
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 只读副本模式，2-单机 
     * @return Model 只读副本模式，2-单机
     */
    public Long getModel() {
        return this.Model;
    }

    /**
     * Set 只读副本模式，2-单机
     * @param Model 只读副本模式，2-单机
     */
    public void setModel(Long Model) {
        this.Model = Model;
    }

    /**
     * Get 只读副本计费模式，1-包年包月，0-按量计费 
     * @return PayMode 只读副本计费模式，1-包年包月，0-按量计费
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 只读副本计费模式，1-包年包月，0-按量计费
     * @param PayMode 只读副本计费模式，1-包年包月，0-按量计费
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 只读副本权重 
     * @return Weight 只读副本权重
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 只读副本权重
     * @param Weight 只读副本权重
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get 只读副本延迟时间，单位秒 
     * @return DelayTime 只读副本延迟时间，单位秒
     */
    public String getDelayTime() {
        return this.DelayTime;
    }

    /**
     * Set 只读副本延迟时间，单位秒
     * @param DelayTime 只读副本延迟时间，单位秒
     */
    public void setDelayTime(String DelayTime) {
        this.DelayTime = DelayTime;
    }

    /**
     * Get 只读副本与主实例的同步状态。
Init:初始化
DeployReadOnlyInPorgress:部署副本进行中
DeployReadOnlySuccess:部署副本成功
DeployReadOnlyFail:部署副本失败
DeployMasterDBInPorgress:主节点上加入副本数据库进行中
DeployMasterDBSuccess:主节点上加入副本数据库成功
DeployMasterDBFail:主节点上加入副本数据库进失败
DeployReadOnlyDBInPorgress:副本还原加入数据库开始
DeployReadOnlyDBSuccess:副本还原加入数据库成功
DeployReadOnlyDBFail:副本还原加入数据库失败
SyncDelay:同步延迟
SyncFail:同步故障
SyncExcluded:已剔除只读组
SyncNormal:正常 
     * @return SynStatus 只读副本与主实例的同步状态。
Init:初始化
DeployReadOnlyInPorgress:部署副本进行中
DeployReadOnlySuccess:部署副本成功
DeployReadOnlyFail:部署副本失败
DeployMasterDBInPorgress:主节点上加入副本数据库进行中
DeployMasterDBSuccess:主节点上加入副本数据库成功
DeployMasterDBFail:主节点上加入副本数据库进失败
DeployReadOnlyDBInPorgress:副本还原加入数据库开始
DeployReadOnlyDBSuccess:副本还原加入数据库成功
DeployReadOnlyDBFail:副本还原加入数据库失败
SyncDelay:同步延迟
SyncFail:同步故障
SyncExcluded:已剔除只读组
SyncNormal:正常
     */
    public String getSynStatus() {
        return this.SynStatus;
    }

    /**
     * Set 只读副本与主实例的同步状态。
Init:初始化
DeployReadOnlyInPorgress:部署副本进行中
DeployReadOnlySuccess:部署副本成功
DeployReadOnlyFail:部署副本失败
DeployMasterDBInPorgress:主节点上加入副本数据库进行中
DeployMasterDBSuccess:主节点上加入副本数据库成功
DeployMasterDBFail:主节点上加入副本数据库进失败
DeployReadOnlyDBInPorgress:副本还原加入数据库开始
DeployReadOnlyDBSuccess:副本还原加入数据库成功
DeployReadOnlyDBFail:副本还原加入数据库失败
SyncDelay:同步延迟
SyncFail:同步故障
SyncExcluded:已剔除只读组
SyncNormal:正常
     * @param SynStatus 只读副本与主实例的同步状态。
Init:初始化
DeployReadOnlyInPorgress:部署副本进行中
DeployReadOnlySuccess:部署副本成功
DeployReadOnlyFail:部署副本失败
DeployMasterDBInPorgress:主节点上加入副本数据库进行中
DeployMasterDBSuccess:主节点上加入副本数据库成功
DeployMasterDBFail:主节点上加入副本数据库进失败
DeployReadOnlyDBInPorgress:副本还原加入数据库开始
DeployReadOnlyDBSuccess:副本还原加入数据库成功
DeployReadOnlyDBFail:副本还原加入数据库失败
SyncDelay:同步延迟
SyncFail:同步故障
SyncExcluded:已剔除只读组
SyncNormal:正常
     */
    public void setSynStatus(String SynStatus) {
        this.SynStatus = SynStatus;
    }

    /**
     * Get 只读副本与主实例没有同步的库 
     * @return DatabaseDifference 只读副本与主实例没有同步的库
     */
    public String getDatabaseDifference() {
        return this.DatabaseDifference;
    }

    /**
     * Set 只读副本与主实例没有同步的库
     * @param DatabaseDifference 只读副本与主实例没有同步的库
     */
    public void setDatabaseDifference(String DatabaseDifference) {
        this.DatabaseDifference = DatabaseDifference;
    }

    /**
     * Get 只读副本与主实例没有同步的账户 
     * @return AccountDifference 只读副本与主实例没有同步的账户
     */
    public String getAccountDifference() {
        return this.AccountDifference;
    }

    /**
     * Set 只读副本与主实例没有同步的账户
     * @param AccountDifference 只读副本与主实例没有同步的账户
     */
    public void setAccountDifference(String AccountDifference) {
        this.AccountDifference = AccountDifference;
    }

    /**
     * Get 只读副本计费开始时间 
     * @return StartTime 只读副本计费开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 只读副本计费开始时间
     * @param StartTime 只读副本计费开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 只读副本计费结束时间 
     * @return EndTime 只读副本计费结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 只读副本计费结束时间
     * @param EndTime 只读副本计费结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 只读副本隔离时间 
     * @return IsolateTime 只读副本隔离时间
     */
    public String getIsolateTime() {
        return this.IsolateTime;
    }

    /**
     * Set 只读副本隔离时间
     * @param IsolateTime 只读副本隔离时间
     */
    public void setIsolateTime(String IsolateTime) {
        this.IsolateTime = IsolateTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "DelayTime", this.DelayTime);
        this.setParamSimple(map, prefix + "SynStatus", this.SynStatus);
        this.setParamSimple(map, prefix + "DatabaseDifference", this.DatabaseDifference);
        this.setParamSimple(map, prefix + "AccountDifference", this.AccountDifference);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "IsolateTime", this.IsolateTime);

    }
}

