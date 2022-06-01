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
package com.tencentcloudapi.dbdc.v20201029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DBInstanceDetail extends AbstractModel{

    /**
    * DB实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * DB实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * DB实例状态,-1:已隔离, 0:创建中, 1:流程中, 2:运行中, 3:未初始化
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * DB实例状态描述,-1:已隔离, 0:创建中, 1:流程中, 2:运行中, 3:未初始化
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * DB实例版本
    */
    @SerializedName("DbVersion")
    @Expose
    private String DbVersion;

    /**
    * Vip信息
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Vip使用的端口号
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * 字符串型的私有网络ID
    */
    @SerializedName("UniqueVpcId")
    @Expose
    private String UniqueVpcId;

    /**
    * 字符串型的私有网络子网ID
    */
    @SerializedName("UniqueSubnetId")
    @Expose
    private String UniqueSubnetId;

    /**
    * 是否为分布式版本,0:否,1:是
    */
    @SerializedName("Shard")
    @Expose
    private Long Shard;

    /**
    * DB实例节点数
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
    * CPU规格(单位:核数)
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 内存规格(单位:GB)
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 磁盘规格(单位:GB)
    */
    @SerializedName("Disk")
    @Expose
    private Long Disk;

    /**
    * 分布式类型的实例的分片数
    */
    @SerializedName("ShardNum")
    @Expose
    private Long ShardNum;

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Db所在主机列表, 格式: m1,s1|m2,s2
    */
    @SerializedName("DbHosts")
    @Expose
    private String DbHosts;

    /**
    * 主机角色, 1:主, 2:从, 3:主+从
    */
    @SerializedName("HostRole")
    @Expose
    private Long HostRole;

    /**
    * DB引擎，MySQL,Percona,MariaDB
    */
    @SerializedName("DbEngine")
    @Expose
    private String DbEngine;

    /**
     * Get DB实例Id 
     * @return InstanceId DB实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set DB实例Id
     * @param InstanceId DB实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get DB实例名称 
     * @return InstanceName DB实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set DB实例名称
     * @param InstanceName DB实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get DB实例状态,-1:已隔离, 0:创建中, 1:流程中, 2:运行中, 3:未初始化 
     * @return Status DB实例状态,-1:已隔离, 0:创建中, 1:流程中, 2:运行中, 3:未初始化
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set DB实例状态,-1:已隔离, 0:创建中, 1:流程中, 2:运行中, 3:未初始化
     * @param Status DB实例状态,-1:已隔离, 0:创建中, 1:流程中, 2:运行中, 3:未初始化
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get DB实例状态描述,-1:已隔离, 0:创建中, 1:流程中, 2:运行中, 3:未初始化 
     * @return StatusDesc DB实例状态描述,-1:已隔离, 0:创建中, 1:流程中, 2:运行中, 3:未初始化
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set DB实例状态描述,-1:已隔离, 0:创建中, 1:流程中, 2:运行中, 3:未初始化
     * @param StatusDesc DB实例状态描述,-1:已隔离, 0:创建中, 1:流程中, 2:运行中, 3:未初始化
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get DB实例版本 
     * @return DbVersion DB实例版本
     */
    public String getDbVersion() {
        return this.DbVersion;
    }

    /**
     * Set DB实例版本
     * @param DbVersion DB实例版本
     */
    public void setDbVersion(String DbVersion) {
        this.DbVersion = DbVersion;
    }

    /**
     * Get Vip信息 
     * @return Vip Vip信息
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Vip信息
     * @param Vip Vip信息
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Vip使用的端口号 
     * @return Vport Vip使用的端口号
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set Vip使用的端口号
     * @param Vport Vip使用的端口号
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get 字符串型的私有网络ID 
     * @return UniqueVpcId 字符串型的私有网络ID
     */
    public String getUniqueVpcId() {
        return this.UniqueVpcId;
    }

    /**
     * Set 字符串型的私有网络ID
     * @param UniqueVpcId 字符串型的私有网络ID
     */
    public void setUniqueVpcId(String UniqueVpcId) {
        this.UniqueVpcId = UniqueVpcId;
    }

    /**
     * Get 字符串型的私有网络子网ID 
     * @return UniqueSubnetId 字符串型的私有网络子网ID
     */
    public String getUniqueSubnetId() {
        return this.UniqueSubnetId;
    }

    /**
     * Set 字符串型的私有网络子网ID
     * @param UniqueSubnetId 字符串型的私有网络子网ID
     */
    public void setUniqueSubnetId(String UniqueSubnetId) {
        this.UniqueSubnetId = UniqueSubnetId;
    }

    /**
     * Get 是否为分布式版本,0:否,1:是 
     * @return Shard 是否为分布式版本,0:否,1:是
     */
    public Long getShard() {
        return this.Shard;
    }

    /**
     * Set 是否为分布式版本,0:否,1:是
     * @param Shard 是否为分布式版本,0:否,1:是
     */
    public void setShard(Long Shard) {
        this.Shard = Shard;
    }

    /**
     * Get DB实例节点数 
     * @return NodeNum DB实例节点数
     */
    public Long getNodeNum() {
        return this.NodeNum;
    }

    /**
     * Set DB实例节点数
     * @param NodeNum DB实例节点数
     */
    public void setNodeNum(Long NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * Get CPU规格(单位:核数) 
     * @return Cpu CPU规格(单位:核数)
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set CPU规格(单位:核数)
     * @param Cpu CPU规格(单位:核数)
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存规格(单位:GB) 
     * @return Memory 内存规格(单位:GB)
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存规格(单位:GB)
     * @param Memory 内存规格(单位:GB)
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 磁盘规格(单位:GB) 
     * @return Disk 磁盘规格(单位:GB)
     */
    public Long getDisk() {
        return this.Disk;
    }

    /**
     * Set 磁盘规格(单位:GB)
     * @param Disk 磁盘规格(单位:GB)
     */
    public void setDisk(Long Disk) {
        this.Disk = Disk;
    }

    /**
     * Get 分布式类型的实例的分片数 
     * @return ShardNum 分布式类型的实例的分片数
     */
    public Long getShardNum() {
        return this.ShardNum;
    }

    /**
     * Set 分布式类型的实例的分片数
     * @param ShardNum 分布式类型的实例的分片数
     */
    public void setShardNum(Long ShardNum) {
        this.ShardNum = ShardNum;
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
     * Get Db所在主机列表, 格式: m1,s1|m2,s2 
     * @return DbHosts Db所在主机列表, 格式: m1,s1|m2,s2
     */
    public String getDbHosts() {
        return this.DbHosts;
    }

    /**
     * Set Db所在主机列表, 格式: m1,s1|m2,s2
     * @param DbHosts Db所在主机列表, 格式: m1,s1|m2,s2
     */
    public void setDbHosts(String DbHosts) {
        this.DbHosts = DbHosts;
    }

    /**
     * Get 主机角色, 1:主, 2:从, 3:主+从 
     * @return HostRole 主机角色, 1:主, 2:从, 3:主+从
     */
    public Long getHostRole() {
        return this.HostRole;
    }

    /**
     * Set 主机角色, 1:主, 2:从, 3:主+从
     * @param HostRole 主机角色, 1:主, 2:从, 3:主+从
     */
    public void setHostRole(Long HostRole) {
        this.HostRole = HostRole;
    }

    /**
     * Get DB引擎，MySQL,Percona,MariaDB 
     * @return DbEngine DB引擎，MySQL,Percona,MariaDB
     */
    public String getDbEngine() {
        return this.DbEngine;
    }

    /**
     * Set DB引擎，MySQL,Percona,MariaDB
     * @param DbEngine DB引擎，MySQL,Percona,MariaDB
     */
    public void setDbEngine(String DbEngine) {
        this.DbEngine = DbEngine;
    }

    public DBInstanceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DBInstanceDetail(DBInstanceDetail source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.DbVersion != null) {
            this.DbVersion = new String(source.DbVersion);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.UniqueVpcId != null) {
            this.UniqueVpcId = new String(source.UniqueVpcId);
        }
        if (source.UniqueSubnetId != null) {
            this.UniqueSubnetId = new String(source.UniqueSubnetId);
        }
        if (source.Shard != null) {
            this.Shard = new Long(source.Shard);
        }
        if (source.NodeNum != null) {
            this.NodeNum = new Long(source.NodeNum);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Disk != null) {
            this.Disk = new Long(source.Disk);
        }
        if (source.ShardNum != null) {
            this.ShardNum = new Long(source.ShardNum);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.DbHosts != null) {
            this.DbHosts = new String(source.DbHosts);
        }
        if (source.HostRole != null) {
            this.HostRole = new Long(source.HostRole);
        }
        if (source.DbEngine != null) {
            this.DbEngine = new String(source.DbEngine);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "DbVersion", this.DbVersion);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "UniqueVpcId", this.UniqueVpcId);
        this.setParamSimple(map, prefix + "UniqueSubnetId", this.UniqueSubnetId);
        this.setParamSimple(map, prefix + "Shard", this.Shard);
        this.setParamSimple(map, prefix + "NodeNum", this.NodeNum);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Disk", this.Disk);
        this.setParamSimple(map, prefix + "ShardNum", this.ShardNum);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "DbHosts", this.DbHosts);
        this.setParamSimple(map, prefix + "HostRole", this.HostRole);
        this.setParamSimple(map, prefix + "DbEngine", this.DbEngine);

    }
}

