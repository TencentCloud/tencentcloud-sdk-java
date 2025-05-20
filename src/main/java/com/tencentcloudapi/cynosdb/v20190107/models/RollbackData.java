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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RollbackData extends AbstractModel {

    /**
    * 实例CPU
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 实例内存
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 集群存储上限
    */
    @SerializedName("StorageLimit")
    @Expose
    private Long StorageLimit;

    /**
    * 原集群id
    */
    @SerializedName("OriginalClusterId")
    @Expose
    private String OriginalClusterId;

    /**
    * 原集群名
    */
    @SerializedName("OriginalClusterName")
    @Expose
    private String OriginalClusterName;

    /**
    * 回档方式
    */
    @SerializedName("RollbackStrategy")
    @Expose
    private String RollbackStrategy;

    /**
    * 快照时间
    */
    @SerializedName("SnapshotTime")
    @Expose
    private String SnapshotTime;

    /**
    * 回档到 Serverless 集群时最小 CPU
    */
    @SerializedName("MinCpu")
    @Expose
    private Long MinCpu;

    /**
    * 回档到 Serverless 集群时最大 CPU
    */
    @SerializedName("MaxCpu")
    @Expose
    private Long MaxCpu;

    /**
    * 快照ID
    */
    @SerializedName("SnapShotId")
    @Expose
    private Long SnapShotId;

    /**
    * 回档数据库
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RollbackDatabases")
    @Expose
    private RollbackDatabase [] RollbackDatabases;

    /**
    * 回档数据表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RollbackTables")
    @Expose
    private RollbackTable [] RollbackTables;

    /**
    * 备份文件名称
    */
    @SerializedName("BackupFileName")
    @Expose
    private String BackupFileName;

    /**
    * 回档进程
    */
    @SerializedName("RollbackProcess")
    @Expose
    private RollbackProcessInfo RollbackProcess;

    /**
     * Get 实例CPU 
     * @return Cpu 实例CPU
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set 实例CPU
     * @param Cpu 实例CPU
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 实例内存 
     * @return Memory 实例内存
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 实例内存
     * @param Memory 实例内存
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 集群存储上限 
     * @return StorageLimit 集群存储上限
     */
    public Long getStorageLimit() {
        return this.StorageLimit;
    }

    /**
     * Set 集群存储上限
     * @param StorageLimit 集群存储上限
     */
    public void setStorageLimit(Long StorageLimit) {
        this.StorageLimit = StorageLimit;
    }

    /**
     * Get 原集群id 
     * @return OriginalClusterId 原集群id
     */
    public String getOriginalClusterId() {
        return this.OriginalClusterId;
    }

    /**
     * Set 原集群id
     * @param OriginalClusterId 原集群id
     */
    public void setOriginalClusterId(String OriginalClusterId) {
        this.OriginalClusterId = OriginalClusterId;
    }

    /**
     * Get 原集群名 
     * @return OriginalClusterName 原集群名
     */
    public String getOriginalClusterName() {
        return this.OriginalClusterName;
    }

    /**
     * Set 原集群名
     * @param OriginalClusterName 原集群名
     */
    public void setOriginalClusterName(String OriginalClusterName) {
        this.OriginalClusterName = OriginalClusterName;
    }

    /**
     * Get 回档方式 
     * @return RollbackStrategy 回档方式
     */
    public String getRollbackStrategy() {
        return this.RollbackStrategy;
    }

    /**
     * Set 回档方式
     * @param RollbackStrategy 回档方式
     */
    public void setRollbackStrategy(String RollbackStrategy) {
        this.RollbackStrategy = RollbackStrategy;
    }

    /**
     * Get 快照时间 
     * @return SnapshotTime 快照时间
     */
    public String getSnapshotTime() {
        return this.SnapshotTime;
    }

    /**
     * Set 快照时间
     * @param SnapshotTime 快照时间
     */
    public void setSnapshotTime(String SnapshotTime) {
        this.SnapshotTime = SnapshotTime;
    }

    /**
     * Get 回档到 Serverless 集群时最小 CPU 
     * @return MinCpu 回档到 Serverless 集群时最小 CPU
     */
    public Long getMinCpu() {
        return this.MinCpu;
    }

    /**
     * Set 回档到 Serverless 集群时最小 CPU
     * @param MinCpu 回档到 Serverless 集群时最小 CPU
     */
    public void setMinCpu(Long MinCpu) {
        this.MinCpu = MinCpu;
    }

    /**
     * Get 回档到 Serverless 集群时最大 CPU 
     * @return MaxCpu 回档到 Serverless 集群时最大 CPU
     */
    public Long getMaxCpu() {
        return this.MaxCpu;
    }

    /**
     * Set 回档到 Serverless 集群时最大 CPU
     * @param MaxCpu 回档到 Serverless 集群时最大 CPU
     */
    public void setMaxCpu(Long MaxCpu) {
        this.MaxCpu = MaxCpu;
    }

    /**
     * Get 快照ID 
     * @return SnapShotId 快照ID
     */
    public Long getSnapShotId() {
        return this.SnapShotId;
    }

    /**
     * Set 快照ID
     * @param SnapShotId 快照ID
     */
    public void setSnapShotId(Long SnapShotId) {
        this.SnapShotId = SnapShotId;
    }

    /**
     * Get 回档数据库
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RollbackDatabases 回档数据库
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RollbackDatabase [] getRollbackDatabases() {
        return this.RollbackDatabases;
    }

    /**
     * Set 回档数据库
注意：此字段可能返回 null，表示取不到有效值。
     * @param RollbackDatabases 回档数据库
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRollbackDatabases(RollbackDatabase [] RollbackDatabases) {
        this.RollbackDatabases = RollbackDatabases;
    }

    /**
     * Get 回档数据表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RollbackTables 回档数据表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RollbackTable [] getRollbackTables() {
        return this.RollbackTables;
    }

    /**
     * Set 回档数据表
注意：此字段可能返回 null，表示取不到有效值。
     * @param RollbackTables 回档数据表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRollbackTables(RollbackTable [] RollbackTables) {
        this.RollbackTables = RollbackTables;
    }

    /**
     * Get 备份文件名称 
     * @return BackupFileName 备份文件名称
     */
    public String getBackupFileName() {
        return this.BackupFileName;
    }

    /**
     * Set 备份文件名称
     * @param BackupFileName 备份文件名称
     */
    public void setBackupFileName(String BackupFileName) {
        this.BackupFileName = BackupFileName;
    }

    /**
     * Get 回档进程 
     * @return RollbackProcess 回档进程
     */
    public RollbackProcessInfo getRollbackProcess() {
        return this.RollbackProcess;
    }

    /**
     * Set 回档进程
     * @param RollbackProcess 回档进程
     */
    public void setRollbackProcess(RollbackProcessInfo RollbackProcess) {
        this.RollbackProcess = RollbackProcess;
    }

    public RollbackData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RollbackData(RollbackData source) {
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.StorageLimit != null) {
            this.StorageLimit = new Long(source.StorageLimit);
        }
        if (source.OriginalClusterId != null) {
            this.OriginalClusterId = new String(source.OriginalClusterId);
        }
        if (source.OriginalClusterName != null) {
            this.OriginalClusterName = new String(source.OriginalClusterName);
        }
        if (source.RollbackStrategy != null) {
            this.RollbackStrategy = new String(source.RollbackStrategy);
        }
        if (source.SnapshotTime != null) {
            this.SnapshotTime = new String(source.SnapshotTime);
        }
        if (source.MinCpu != null) {
            this.MinCpu = new Long(source.MinCpu);
        }
        if (source.MaxCpu != null) {
            this.MaxCpu = new Long(source.MaxCpu);
        }
        if (source.SnapShotId != null) {
            this.SnapShotId = new Long(source.SnapShotId);
        }
        if (source.RollbackDatabases != null) {
            this.RollbackDatabases = new RollbackDatabase[source.RollbackDatabases.length];
            for (int i = 0; i < source.RollbackDatabases.length; i++) {
                this.RollbackDatabases[i] = new RollbackDatabase(source.RollbackDatabases[i]);
            }
        }
        if (source.RollbackTables != null) {
            this.RollbackTables = new RollbackTable[source.RollbackTables.length];
            for (int i = 0; i < source.RollbackTables.length; i++) {
                this.RollbackTables[i] = new RollbackTable(source.RollbackTables[i]);
            }
        }
        if (source.BackupFileName != null) {
            this.BackupFileName = new String(source.BackupFileName);
        }
        if (source.RollbackProcess != null) {
            this.RollbackProcess = new RollbackProcessInfo(source.RollbackProcess);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "StorageLimit", this.StorageLimit);
        this.setParamSimple(map, prefix + "OriginalClusterId", this.OriginalClusterId);
        this.setParamSimple(map, prefix + "OriginalClusterName", this.OriginalClusterName);
        this.setParamSimple(map, prefix + "RollbackStrategy", this.RollbackStrategy);
        this.setParamSimple(map, prefix + "SnapshotTime", this.SnapshotTime);
        this.setParamSimple(map, prefix + "MinCpu", this.MinCpu);
        this.setParamSimple(map, prefix + "MaxCpu", this.MaxCpu);
        this.setParamSimple(map, prefix + "SnapShotId", this.SnapShotId);
        this.setParamArrayObj(map, prefix + "RollbackDatabases.", this.RollbackDatabases);
        this.setParamArrayObj(map, prefix + "RollbackTables.", this.RollbackTables);
        this.setParamSimple(map, prefix + "BackupFileName", this.BackupFileName);
        this.setParamObj(map, prefix + "RollbackProcess.", this.RollbackProcess);

    }
}

