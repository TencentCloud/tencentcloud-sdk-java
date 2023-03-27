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

public class ShardBriefInfo extends AbstractModel{

    /**
    * 分片SerialId
    */
    @SerializedName("ShardSerialId")
    @Expose
    private String ShardSerialId;

    /**
    * 分片ID，形如shard-7vg1o339
    */
    @SerializedName("ShardInstanceId")
    @Expose
    private String ShardInstanceId;

    /**
    * 分片运行状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 分片运行状态描述
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * 分片创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 分片内存大小，单位GB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 分片磁盘大小，单位GB
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * 分片日志磁盘空间大小，单位GB
    */
    @SerializedName("LogDisk")
    @Expose
    private Long LogDisk;

    /**
    * 分片节点个数
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * 分片磁盘空间使用率
    */
    @SerializedName("StorageUsage")
    @Expose
    private Float StorageUsage;

    /**
    * 分片Proxy版本信息
    */
    @SerializedName("ProxyVersion")
    @Expose
    private String ProxyVersion;

    /**
    * 分片主DB可用区
    */
    @SerializedName("ShardMasterZone")
    @Expose
    private String ShardMasterZone;

    /**
    * 分片从DB可用区
    */
    @SerializedName("ShardSlaveZones")
    @Expose
    private String [] ShardSlaveZones;

    /**
    * 分片Cpu核数
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * DB节点信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodesInfo")
    @Expose
    private NodeInfo [] NodesInfo;

    /**
     * Get 分片SerialId 
     * @return ShardSerialId 分片SerialId
     */
    public String getShardSerialId() {
        return this.ShardSerialId;
    }

    /**
     * Set 分片SerialId
     * @param ShardSerialId 分片SerialId
     */
    public void setShardSerialId(String ShardSerialId) {
        this.ShardSerialId = ShardSerialId;
    }

    /**
     * Get 分片ID，形如shard-7vg1o339 
     * @return ShardInstanceId 分片ID，形如shard-7vg1o339
     */
    public String getShardInstanceId() {
        return this.ShardInstanceId;
    }

    /**
     * Set 分片ID，形如shard-7vg1o339
     * @param ShardInstanceId 分片ID，形如shard-7vg1o339
     */
    public void setShardInstanceId(String ShardInstanceId) {
        this.ShardInstanceId = ShardInstanceId;
    }

    /**
     * Get 分片运行状态 
     * @return Status 分片运行状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 分片运行状态
     * @param Status 分片运行状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 分片运行状态描述 
     * @return StatusDesc 分片运行状态描述
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set 分片运行状态描述
     * @param StatusDesc 分片运行状态描述
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get 分片创建时间 
     * @return CreateTime 分片创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 分片创建时间
     * @param CreateTime 分片创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 分片内存大小，单位GB 
     * @return Memory 分片内存大小，单位GB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 分片内存大小，单位GB
     * @param Memory 分片内存大小，单位GB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 分片磁盘大小，单位GB 
     * @return Storage 分片磁盘大小，单位GB
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set 分片磁盘大小，单位GB
     * @param Storage 分片磁盘大小，单位GB
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get 分片日志磁盘空间大小，单位GB 
     * @return LogDisk 分片日志磁盘空间大小，单位GB
     */
    public Long getLogDisk() {
        return this.LogDisk;
    }

    /**
     * Set 分片日志磁盘空间大小，单位GB
     * @param LogDisk 分片日志磁盘空间大小，单位GB
     */
    public void setLogDisk(Long LogDisk) {
        this.LogDisk = LogDisk;
    }

    /**
     * Get 分片节点个数 
     * @return NodeCount 分片节点个数
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set 分片节点个数
     * @param NodeCount 分片节点个数
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get 分片磁盘空间使用率 
     * @return StorageUsage 分片磁盘空间使用率
     */
    public Float getStorageUsage() {
        return this.StorageUsage;
    }

    /**
     * Set 分片磁盘空间使用率
     * @param StorageUsage 分片磁盘空间使用率
     */
    public void setStorageUsage(Float StorageUsage) {
        this.StorageUsage = StorageUsage;
    }

    /**
     * Get 分片Proxy版本信息 
     * @return ProxyVersion 分片Proxy版本信息
     */
    public String getProxyVersion() {
        return this.ProxyVersion;
    }

    /**
     * Set 分片Proxy版本信息
     * @param ProxyVersion 分片Proxy版本信息
     */
    public void setProxyVersion(String ProxyVersion) {
        this.ProxyVersion = ProxyVersion;
    }

    /**
     * Get 分片主DB可用区 
     * @return ShardMasterZone 分片主DB可用区
     */
    public String getShardMasterZone() {
        return this.ShardMasterZone;
    }

    /**
     * Set 分片主DB可用区
     * @param ShardMasterZone 分片主DB可用区
     */
    public void setShardMasterZone(String ShardMasterZone) {
        this.ShardMasterZone = ShardMasterZone;
    }

    /**
     * Get 分片从DB可用区 
     * @return ShardSlaveZones 分片从DB可用区
     */
    public String [] getShardSlaveZones() {
        return this.ShardSlaveZones;
    }

    /**
     * Set 分片从DB可用区
     * @param ShardSlaveZones 分片从DB可用区
     */
    public void setShardSlaveZones(String [] ShardSlaveZones) {
        this.ShardSlaveZones = ShardSlaveZones;
    }

    /**
     * Get 分片Cpu核数 
     * @return Cpu 分片Cpu核数
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set 分片Cpu核数
     * @param Cpu 分片Cpu核数
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get DB节点信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodesInfo DB节点信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NodeInfo [] getNodesInfo() {
        return this.NodesInfo;
    }

    /**
     * Set DB节点信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodesInfo DB节点信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodesInfo(NodeInfo [] NodesInfo) {
        this.NodesInfo = NodesInfo;
    }

    public ShardBriefInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ShardBriefInfo(ShardBriefInfo source) {
        if (source.ShardSerialId != null) {
            this.ShardSerialId = new String(source.ShardSerialId);
        }
        if (source.ShardInstanceId != null) {
            this.ShardInstanceId = new String(source.ShardInstanceId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.LogDisk != null) {
            this.LogDisk = new Long(source.LogDisk);
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.StorageUsage != null) {
            this.StorageUsage = new Float(source.StorageUsage);
        }
        if (source.ProxyVersion != null) {
            this.ProxyVersion = new String(source.ProxyVersion);
        }
        if (source.ShardMasterZone != null) {
            this.ShardMasterZone = new String(source.ShardMasterZone);
        }
        if (source.ShardSlaveZones != null) {
            this.ShardSlaveZones = new String[source.ShardSlaveZones.length];
            for (int i = 0; i < source.ShardSlaveZones.length; i++) {
                this.ShardSlaveZones[i] = new String(source.ShardSlaveZones[i]);
            }
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.NodesInfo != null) {
            this.NodesInfo = new NodeInfo[source.NodesInfo.length];
            for (int i = 0; i < source.NodesInfo.length; i++) {
                this.NodesInfo[i] = new NodeInfo(source.NodesInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ShardSerialId", this.ShardSerialId);
        this.setParamSimple(map, prefix + "ShardInstanceId", this.ShardInstanceId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "LogDisk", this.LogDisk);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "StorageUsage", this.StorageUsage);
        this.setParamSimple(map, prefix + "ProxyVersion", this.ProxyVersion);
        this.setParamSimple(map, prefix + "ShardMasterZone", this.ShardMasterZone);
        this.setParamArraySimple(map, prefix + "ShardSlaveZones.", this.ShardSlaveZones);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamArrayObj(map, prefix + "NodesInfo.", this.NodesInfo);

    }
}

