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
package com.tencentcloudapi.eis.v20210601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuntimeMC extends AbstractModel{

    /**
    * 运行时id
    */
    @SerializedName("RuntimeId")
    @Expose
    private Long RuntimeId;

    /**
    * 主账号uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 运行时名称，用户输入，同一uin内唯一
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * 运行时所在地域，tianjin，beijiing，guangzhou等
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 运行时类型：0: sandbox, 1:shared, 2:private
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 运行时状态：1:running, 2:deleting, 3:creating, 4:scaling, 5:unavailable, 6:deleted, 7:errored
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 运行时创建时间
    */
    @SerializedName("CreatedAt")
    @Expose
    private Long CreatedAt;

    /**
    * 运行时更新时间
    */
    @SerializedName("UpdatedAt")
    @Expose
    private Long UpdatedAt;

    /**
    * 运行时资源配置，worker总配额，0:0vCore0G, 1:1vCore2G, 2:2vCore4G, 4:4vCore8G, 8:8vCore16G, 12:12vCore24G, 16:16vCore32G, 100:unlimited
    */
    @SerializedName("WorkerSize")
    @Expose
    private Long WorkerSize;

    /**
    * 运行时资源配置，worker副本数
    */
    @SerializedName("WorkerReplica")
    @Expose
    private Long WorkerReplica;

    /**
    * 正在运行的应用实例数量
    */
    @SerializedName("RunningInstanceCount")
    @Expose
    private Long RunningInstanceCount;

    /**
    * 已使用cpu核数
    */
    @SerializedName("CpuUsed")
    @Expose
    private Float CpuUsed;

    /**
    * cpu核数上限
    */
    @SerializedName("CpuLimit")
    @Expose
    private Float CpuLimit;

    /**
    * 已使用内存 MB
    */
    @SerializedName("MemoryUsed")
    @Expose
    private Float MemoryUsed;

    /**
    * 内存上限 MB
    */
    @SerializedName("MemoryLimit")
    @Expose
    private Float MemoryLimit;

    /**
     * Get 运行时id 
     * @return RuntimeId 运行时id
     */
    public Long getRuntimeId() {
        return this.RuntimeId;
    }

    /**
     * Set 运行时id
     * @param RuntimeId 运行时id
     */
    public void setRuntimeId(Long RuntimeId) {
        this.RuntimeId = RuntimeId;
    }

    /**
     * Get 主账号uin 
     * @return Uin 主账号uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 主账号uin
     * @param Uin 主账号uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 运行时名称，用户输入，同一uin内唯一 
     * @return DisplayName 运行时名称，用户输入，同一uin内唯一
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set 运行时名称，用户输入，同一uin内唯一
     * @param DisplayName 运行时名称，用户输入，同一uin内唯一
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get 运行时所在地域，tianjin，beijiing，guangzhou等 
     * @return Zone 运行时所在地域，tianjin，beijiing，guangzhou等
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 运行时所在地域，tianjin，beijiing，guangzhou等
     * @param Zone 运行时所在地域，tianjin，beijiing，guangzhou等
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 运行时类型：0: sandbox, 1:shared, 2:private 
     * @return Type 运行时类型：0: sandbox, 1:shared, 2:private
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 运行时类型：0: sandbox, 1:shared, 2:private
     * @param Type 运行时类型：0: sandbox, 1:shared, 2:private
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 运行时状态：1:running, 2:deleting, 3:creating, 4:scaling, 5:unavailable, 6:deleted, 7:errored 
     * @return Status 运行时状态：1:running, 2:deleting, 3:creating, 4:scaling, 5:unavailable, 6:deleted, 7:errored
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 运行时状态：1:running, 2:deleting, 3:creating, 4:scaling, 5:unavailable, 6:deleted, 7:errored
     * @param Status 运行时状态：1:running, 2:deleting, 3:creating, 4:scaling, 5:unavailable, 6:deleted, 7:errored
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 运行时创建时间 
     * @return CreatedAt 运行时创建时间
     */
    public Long getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 运行时创建时间
     * @param CreatedAt 运行时创建时间
     */
    public void setCreatedAt(Long CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 运行时更新时间 
     * @return UpdatedAt 运行时更新时间
     */
    public Long getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 运行时更新时间
     * @param UpdatedAt 运行时更新时间
     */
    public void setUpdatedAt(Long UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get 运行时资源配置，worker总配额，0:0vCore0G, 1:1vCore2G, 2:2vCore4G, 4:4vCore8G, 8:8vCore16G, 12:12vCore24G, 16:16vCore32G, 100:unlimited 
     * @return WorkerSize 运行时资源配置，worker总配额，0:0vCore0G, 1:1vCore2G, 2:2vCore4G, 4:4vCore8G, 8:8vCore16G, 12:12vCore24G, 16:16vCore32G, 100:unlimited
     */
    public Long getWorkerSize() {
        return this.WorkerSize;
    }

    /**
     * Set 运行时资源配置，worker总配额，0:0vCore0G, 1:1vCore2G, 2:2vCore4G, 4:4vCore8G, 8:8vCore16G, 12:12vCore24G, 16:16vCore32G, 100:unlimited
     * @param WorkerSize 运行时资源配置，worker总配额，0:0vCore0G, 1:1vCore2G, 2:2vCore4G, 4:4vCore8G, 8:8vCore16G, 12:12vCore24G, 16:16vCore32G, 100:unlimited
     */
    public void setWorkerSize(Long WorkerSize) {
        this.WorkerSize = WorkerSize;
    }

    /**
     * Get 运行时资源配置，worker副本数 
     * @return WorkerReplica 运行时资源配置，worker副本数
     */
    public Long getWorkerReplica() {
        return this.WorkerReplica;
    }

    /**
     * Set 运行时资源配置，worker副本数
     * @param WorkerReplica 运行时资源配置，worker副本数
     */
    public void setWorkerReplica(Long WorkerReplica) {
        this.WorkerReplica = WorkerReplica;
    }

    /**
     * Get 正在运行的应用实例数量 
     * @return RunningInstanceCount 正在运行的应用实例数量
     */
    public Long getRunningInstanceCount() {
        return this.RunningInstanceCount;
    }

    /**
     * Set 正在运行的应用实例数量
     * @param RunningInstanceCount 正在运行的应用实例数量
     */
    public void setRunningInstanceCount(Long RunningInstanceCount) {
        this.RunningInstanceCount = RunningInstanceCount;
    }

    /**
     * Get 已使用cpu核数 
     * @return CpuUsed 已使用cpu核数
     */
    public Float getCpuUsed() {
        return this.CpuUsed;
    }

    /**
     * Set 已使用cpu核数
     * @param CpuUsed 已使用cpu核数
     */
    public void setCpuUsed(Float CpuUsed) {
        this.CpuUsed = CpuUsed;
    }

    /**
     * Get cpu核数上限 
     * @return CpuLimit cpu核数上限
     */
    public Float getCpuLimit() {
        return this.CpuLimit;
    }

    /**
     * Set cpu核数上限
     * @param CpuLimit cpu核数上限
     */
    public void setCpuLimit(Float CpuLimit) {
        this.CpuLimit = CpuLimit;
    }

    /**
     * Get 已使用内存 MB 
     * @return MemoryUsed 已使用内存 MB
     */
    public Float getMemoryUsed() {
        return this.MemoryUsed;
    }

    /**
     * Set 已使用内存 MB
     * @param MemoryUsed 已使用内存 MB
     */
    public void setMemoryUsed(Float MemoryUsed) {
        this.MemoryUsed = MemoryUsed;
    }

    /**
     * Get 内存上限 MB 
     * @return MemoryLimit 内存上限 MB
     */
    public Float getMemoryLimit() {
        return this.MemoryLimit;
    }

    /**
     * Set 内存上限 MB
     * @param MemoryLimit 内存上限 MB
     */
    public void setMemoryLimit(Float MemoryLimit) {
        this.MemoryLimit = MemoryLimit;
    }

    public RuntimeMC() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuntimeMC(RuntimeMC source) {
        if (source.RuntimeId != null) {
            this.RuntimeId = new Long(source.RuntimeId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new Long(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new Long(source.UpdatedAt);
        }
        if (source.WorkerSize != null) {
            this.WorkerSize = new Long(source.WorkerSize);
        }
        if (source.WorkerReplica != null) {
            this.WorkerReplica = new Long(source.WorkerReplica);
        }
        if (source.RunningInstanceCount != null) {
            this.RunningInstanceCount = new Long(source.RunningInstanceCount);
        }
        if (source.CpuUsed != null) {
            this.CpuUsed = new Float(source.CpuUsed);
        }
        if (source.CpuLimit != null) {
            this.CpuLimit = new Float(source.CpuLimit);
        }
        if (source.MemoryUsed != null) {
            this.MemoryUsed = new Float(source.MemoryUsed);
        }
        if (source.MemoryLimit != null) {
            this.MemoryLimit = new Float(source.MemoryLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuntimeId", this.RuntimeId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "WorkerSize", this.WorkerSize);
        this.setParamSimple(map, prefix + "WorkerReplica", this.WorkerReplica);
        this.setParamSimple(map, prefix + "RunningInstanceCount", this.RunningInstanceCount);
        this.setParamSimple(map, prefix + "CpuUsed", this.CpuUsed);
        this.setParamSimple(map, prefix + "CpuLimit", this.CpuLimit);
        this.setParamSimple(map, prefix + "MemoryUsed", this.MemoryUsed);
        this.setParamSimple(map, prefix + "MemoryLimit", this.MemoryLimit);

    }
}

