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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DCDBShardInfo extends AbstractModel{

    /**
    * 所属实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 分片SQL透传Id，用于将sql透传到指定分片执行
    */
    @SerializedName("ShardSerialId")
    @Expose
    private String ShardSerialId;

    /**
    * 全局唯一的分片Id
    */
    @SerializedName("ShardInstanceId")
    @Expose
    private String ShardInstanceId;

    /**
    * 状态：0 创建中，1 流程处理中， 2 运行中，3 分片未初始化
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 状态中文描述
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 字符串格式的私有网络Id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 字符串格式的私有网络子网Id
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

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
    * 内存大小，单位 GB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 存储大小，单位 GB
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * 到期时间
    */
    @SerializedName("PeriodEndTime")
    @Expose
    private String PeriodEndTime;

    /**
    * 节点数，2 为一主一从， 3 为一主二从
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * 存储使用率，单位为 %
    */
    @SerializedName("StorageUsage")
    @Expose
    private Float StorageUsage;

    /**
    * 内存使用率，单位为 %
    */
    @SerializedName("MemoryUsage")
    @Expose
    private Float MemoryUsage;

    /**
    * 数字分片Id（过时字段，请勿依赖该值）
    */
    @SerializedName("ShardId")
    @Expose
    private Long ShardId;

    /**
    * 产品ProductID
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * Proxy版本
    */
    @SerializedName("ProxyVersion")
    @Expose
    private String ProxyVersion;

    /**
    * 付费模型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Paymode")
    @Expose
    private String Paymode;

    /**
    * 分片的主可用区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShardMasterZone")
    @Expose
    private String ShardMasterZone;

    /**
    * 分片的从可用区列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShardSlaveZones")
    @Expose
    private String [] ShardSlaveZones;

    /**
    * CPU核数
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
     * Get 所属实例Id 
     * @return InstanceId 所属实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 所属实例Id
     * @param InstanceId 所属实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 分片SQL透传Id，用于将sql透传到指定分片执行 
     * @return ShardSerialId 分片SQL透传Id，用于将sql透传到指定分片执行
     */
    public String getShardSerialId() {
        return this.ShardSerialId;
    }

    /**
     * Set 分片SQL透传Id，用于将sql透传到指定分片执行
     * @param ShardSerialId 分片SQL透传Id，用于将sql透传到指定分片执行
     */
    public void setShardSerialId(String ShardSerialId) {
        this.ShardSerialId = ShardSerialId;
    }

    /**
     * Get 全局唯一的分片Id 
     * @return ShardInstanceId 全局唯一的分片Id
     */
    public String getShardInstanceId() {
        return this.ShardInstanceId;
    }

    /**
     * Set 全局唯一的分片Id
     * @param ShardInstanceId 全局唯一的分片Id
     */
    public void setShardInstanceId(String ShardInstanceId) {
        this.ShardInstanceId = ShardInstanceId;
    }

    /**
     * Get 状态：0 创建中，1 流程处理中， 2 运行中，3 分片未初始化 
     * @return Status 状态：0 创建中，1 流程处理中， 2 运行中，3 分片未初始化
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态：0 创建中，1 流程处理中， 2 运行中，3 分片未初始化
     * @param Status 状态：0 创建中，1 流程处理中， 2 运行中，3 分片未初始化
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 状态中文描述 
     * @return StatusDesc 状态中文描述
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set 状态中文描述
     * @param StatusDesc 状态中文描述
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
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
     * Get 字符串格式的私有网络Id 
     * @return VpcId 字符串格式的私有网络Id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 字符串格式的私有网络Id
     * @param VpcId 字符串格式的私有网络Id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 字符串格式的私有网络子网Id 
     * @return SubnetId 字符串格式的私有网络子网Id
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 字符串格式的私有网络子网Id
     * @param SubnetId 字符串格式的私有网络子网Id
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
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
     * Get 内存大小，单位 GB 
     * @return Memory 内存大小，单位 GB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存大小，单位 GB
     * @param Memory 内存大小，单位 GB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 存储大小，单位 GB 
     * @return Storage 存储大小，单位 GB
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set 存储大小，单位 GB
     * @param Storage 存储大小，单位 GB
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
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
     * Get 节点数，2 为一主一从， 3 为一主二从 
     * @return NodeCount 节点数，2 为一主一从， 3 为一主二从
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set 节点数，2 为一主一从， 3 为一主二从
     * @param NodeCount 节点数，2 为一主一从， 3 为一主二从
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get 存储使用率，单位为 % 
     * @return StorageUsage 存储使用率，单位为 %
     */
    public Float getStorageUsage() {
        return this.StorageUsage;
    }

    /**
     * Set 存储使用率，单位为 %
     * @param StorageUsage 存储使用率，单位为 %
     */
    public void setStorageUsage(Float StorageUsage) {
        this.StorageUsage = StorageUsage;
    }

    /**
     * Get 内存使用率，单位为 % 
     * @return MemoryUsage 内存使用率，单位为 %
     */
    public Float getMemoryUsage() {
        return this.MemoryUsage;
    }

    /**
     * Set 内存使用率，单位为 %
     * @param MemoryUsage 内存使用率，单位为 %
     */
    public void setMemoryUsage(Float MemoryUsage) {
        this.MemoryUsage = MemoryUsage;
    }

    /**
     * Get 数字分片Id（过时字段，请勿依赖该值） 
     * @return ShardId 数字分片Id（过时字段，请勿依赖该值）
     */
    public Long getShardId() {
        return this.ShardId;
    }

    /**
     * Set 数字分片Id（过时字段，请勿依赖该值）
     * @param ShardId 数字分片Id（过时字段，请勿依赖该值）
     */
    public void setShardId(Long ShardId) {
        this.ShardId = ShardId;
    }

    /**
     * Get 产品ProductID 
     * @return Pid 产品ProductID
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set 产品ProductID
     * @param Pid 产品ProductID
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get Proxy版本 
     * @return ProxyVersion Proxy版本
     */
    public String getProxyVersion() {
        return this.ProxyVersion;
    }

    /**
     * Set Proxy版本
     * @param ProxyVersion Proxy版本
     */
    public void setProxyVersion(String ProxyVersion) {
        this.ProxyVersion = ProxyVersion;
    }

    /**
     * Get 付费模型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Paymode 付费模型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPaymode() {
        return this.Paymode;
    }

    /**
     * Set 付费模型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Paymode 付费模型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPaymode(String Paymode) {
        this.Paymode = Paymode;
    }

    /**
     * Get 分片的主可用区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShardMasterZone 分片的主可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getShardMasterZone() {
        return this.ShardMasterZone;
    }

    /**
     * Set 分片的主可用区
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShardMasterZone 分片的主可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShardMasterZone(String ShardMasterZone) {
        this.ShardMasterZone = ShardMasterZone;
    }

    /**
     * Get 分片的从可用区列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShardSlaveZones 分片的从可用区列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getShardSlaveZones() {
        return this.ShardSlaveZones;
    }

    /**
     * Set 分片的从可用区列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShardSlaveZones 分片的从可用区列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShardSlaveZones(String [] ShardSlaveZones) {
        this.ShardSlaveZones = ShardSlaveZones;
    }

    /**
     * Get CPU核数 
     * @return Cpu CPU核数
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set CPU核数
     * @param Cpu CPU核数
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ShardSerialId", this.ShardSerialId);
        this.setParamSimple(map, prefix + "ShardInstanceId", this.ShardInstanceId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "PeriodEndTime", this.PeriodEndTime);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "StorageUsage", this.StorageUsage);
        this.setParamSimple(map, prefix + "MemoryUsage", this.MemoryUsage);
        this.setParamSimple(map, prefix + "ShardId", this.ShardId);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "ProxyVersion", this.ProxyVersion);
        this.setParamSimple(map, prefix + "Paymode", this.Paymode);
        this.setParamSimple(map, prefix + "ShardMasterZone", this.ShardMasterZone);
        this.setParamArraySimple(map, prefix + "ShardSlaveZones.", this.ShardSlaveZones);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);

    }
}

