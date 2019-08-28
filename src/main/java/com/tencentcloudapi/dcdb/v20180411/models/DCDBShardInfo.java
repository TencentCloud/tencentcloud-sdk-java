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

public class DCDBShardInfo  extends AbstractModel{

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
    private Integer Status;

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
    private Integer ProjectId;

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
    private Integer Memory;

    /**
    * 存储大小，单位 GB
    */
    @SerializedName("Storage")
    @Expose
    private Integer Storage;

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
    private Integer NodeCount;

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
    private Integer ShardId;

    /**
    * 产品ProductID
    */
    @SerializedName("Pid")
    @Expose
    private Integer Pid;

    /**
    * Proxy版本
    */
    @SerializedName("ProxyVersion")
    @Expose
    private String ProxyVersion;

    /**
     * 获取所属实例Id
     * @return InstanceId 所属实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置所属实例Id
     * @param InstanceId 所属实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取分片SQL透传Id，用于将sql透传到指定分片执行
     * @return ShardSerialId 分片SQL透传Id，用于将sql透传到指定分片执行
     */
    public String getShardSerialId() {
        return this.ShardSerialId;
    }

    /**
     * 设置分片SQL透传Id，用于将sql透传到指定分片执行
     * @param ShardSerialId 分片SQL透传Id，用于将sql透传到指定分片执行
     */
    public void setShardSerialId(String ShardSerialId) {
        this.ShardSerialId = ShardSerialId;
    }

    /**
     * 获取全局唯一的分片Id
     * @return ShardInstanceId 全局唯一的分片Id
     */
    public String getShardInstanceId() {
        return this.ShardInstanceId;
    }

    /**
     * 设置全局唯一的分片Id
     * @param ShardInstanceId 全局唯一的分片Id
     */
    public void setShardInstanceId(String ShardInstanceId) {
        this.ShardInstanceId = ShardInstanceId;
    }

    /**
     * 获取状态：0 创建中，1 流程处理中， 2 运行中，3 分片未初始化
     * @return Status 状态：0 创建中，1 流程处理中， 2 运行中，3 分片未初始化
     */
    public Integer getStatus() {
        return this.Status;
    }

    /**
     * 设置状态：0 创建中，1 流程处理中， 2 运行中，3 分片未初始化
     * @param Status 状态：0 创建中，1 流程处理中， 2 运行中，3 分片未初始化
     */
    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    /**
     * 获取状态中文描述
     * @return StatusDesc 状态中文描述
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * 设置状态中文描述
     * @param StatusDesc 状态中文描述
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * 获取创建时间
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取字符串格式的私有网络Id
     * @return VpcId 字符串格式的私有网络Id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置字符串格式的私有网络Id
     * @param VpcId 字符串格式的私有网络Id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取字符串格式的私有网络子网Id
     * @return SubnetId 字符串格式的私有网络子网Id
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * 设置字符串格式的私有网络子网Id
     * @param SubnetId 字符串格式的私有网络子网Id
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * 获取项目ID
     * @return ProjectId 项目ID
     */
    public Integer getProjectId() {
        return this.ProjectId;
    }

    /**
     * 设置项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * 获取地域
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * 设置地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * 获取可用区
     * @return Zone 可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * 设置可用区
     * @param Zone 可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * 获取内存大小，单位 GB
     * @return Memory 内存大小，单位 GB
     */
    public Integer getMemory() {
        return this.Memory;
    }

    /**
     * 设置内存大小，单位 GB
     * @param Memory 内存大小，单位 GB
     */
    public void setMemory(Integer Memory) {
        this.Memory = Memory;
    }

    /**
     * 获取存储大小，单位 GB
     * @return Storage 存储大小，单位 GB
     */
    public Integer getStorage() {
        return this.Storage;
    }

    /**
     * 设置存储大小，单位 GB
     * @param Storage 存储大小，单位 GB
     */
    public void setStorage(Integer Storage) {
        this.Storage = Storage;
    }

    /**
     * 获取到期时间
     * @return PeriodEndTime 到期时间
     */
    public String getPeriodEndTime() {
        return this.PeriodEndTime;
    }

    /**
     * 设置到期时间
     * @param PeriodEndTime 到期时间
     */
    public void setPeriodEndTime(String PeriodEndTime) {
        this.PeriodEndTime = PeriodEndTime;
    }

    /**
     * 获取节点数，2 为一主一从， 3 为一主二从
     * @return NodeCount 节点数，2 为一主一从， 3 为一主二从
     */
    public Integer getNodeCount() {
        return this.NodeCount;
    }

    /**
     * 设置节点数，2 为一主一从， 3 为一主二从
     * @param NodeCount 节点数，2 为一主一从， 3 为一主二从
     */
    public void setNodeCount(Integer NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * 获取存储使用率，单位为 %
     * @return StorageUsage 存储使用率，单位为 %
     */
    public Float getStorageUsage() {
        return this.StorageUsage;
    }

    /**
     * 设置存储使用率，单位为 %
     * @param StorageUsage 存储使用率，单位为 %
     */
    public void setStorageUsage(Float StorageUsage) {
        this.StorageUsage = StorageUsage;
    }

    /**
     * 获取内存使用率，单位为 %
     * @return MemoryUsage 内存使用率，单位为 %
     */
    public Float getMemoryUsage() {
        return this.MemoryUsage;
    }

    /**
     * 设置内存使用率，单位为 %
     * @param MemoryUsage 内存使用率，单位为 %
     */
    public void setMemoryUsage(Float MemoryUsage) {
        this.MemoryUsage = MemoryUsage;
    }

    /**
     * 获取数字分片Id（过时字段，请勿依赖该值）
     * @return ShardId 数字分片Id（过时字段，请勿依赖该值）
     */
    public Integer getShardId() {
        return this.ShardId;
    }

    /**
     * 设置数字分片Id（过时字段，请勿依赖该值）
     * @param ShardId 数字分片Id（过时字段，请勿依赖该值）
     */
    public void setShardId(Integer ShardId) {
        this.ShardId = ShardId;
    }

    /**
     * 获取产品ProductID
     * @return Pid 产品ProductID
     */
    public Integer getPid() {
        return this.Pid;
    }

    /**
     * 设置产品ProductID
     * @param Pid 产品ProductID
     */
    public void setPid(Integer Pid) {
        this.Pid = Pid;
    }

    /**
     * 获取Proxy版本
     * @return ProxyVersion Proxy版本
     */
    public String getProxyVersion() {
        return this.ProxyVersion;
    }

    /**
     * 设置Proxy版本
     * @param ProxyVersion Proxy版本
     */
    public void setProxyVersion(String ProxyVersion) {
        this.ProxyVersion = ProxyVersion;
    }

    /**
     * 内部实现，用户禁止调用
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

    }
}

