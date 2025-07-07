/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuntimeMC extends AbstractModel {

    /**
    * 环境id
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
    * 环境名称，用户输入，同一uin内唯一
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * 环境所在地域，tianjin，beijiing，guangzhou等
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 环境类型：0: sandbox, 1:shared, 2:private 3: trial
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
    * 环境创建时间
    */
    @SerializedName("CreatedAt")
    @Expose
    private Long CreatedAt;

    /**
    * 环境更新时间
    */
    @SerializedName("UpdatedAt")
    @Expose
    private Long UpdatedAt;

    /**
    * 环境资源配置，worker总配额，0:0vCore0G, 1:1vCore2G, 2:2vCore4G, 4:4vCore8G, 8:8vCore16G, 12:12vCore24G, 16:16vCore32G, 100:unlimited
    */
    @SerializedName("WorkerSize")
    @Expose
    private Long WorkerSize;

    /**
    * 环境资源配置，worker副本数
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
    * 环境过期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpiredAt")
    @Expose
    private Long ExpiredAt;

    /**
    * 收费类型：0:缺省，1:自助下单页购买(支持续费/升配等操作)，2:代销下单页购买
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChargeType")
    @Expose
    private Long ChargeType;

    /**
    * 资源限制类型：0:无限制，1:有限制
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceLimitType")
    @Expose
    private Long ResourceLimitType;

    /**
    * 是否开启自动续费
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoRenewal")
    @Expose
    private Boolean AutoRenewal;

    /**
    * 扩展组件列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkerExtensions")
    @Expose
    private RuntimeExtensionMC [] WorkerExtensions;

    /**
    * 环境类型：0: sandbox, 1:shared, 2:private 3: trial
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuntimeType")
    @Expose
    private Long RuntimeType;

    /**
    * 环境运行类型：0:运行时类型、1:api类型、2:etl环境
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuntimeClass")
    @Expose
    private Long RuntimeClass;

    /**
    * 已使用出带宽 Mbps
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BandwidthOutUsed")
    @Expose
    private Float BandwidthOutUsed;

    /**
    * 出带宽上限 Mbps
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BandwidthOutLimit")
    @Expose
    private Float BandwidthOutLimit;

    /**
     * Get 环境id 
     * @return RuntimeId 环境id
     */
    public Long getRuntimeId() {
        return this.RuntimeId;
    }

    /**
     * Set 环境id
     * @param RuntimeId 环境id
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
     * Get 环境名称，用户输入，同一uin内唯一 
     * @return DisplayName 环境名称，用户输入，同一uin内唯一
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set 环境名称，用户输入，同一uin内唯一
     * @param DisplayName 环境名称，用户输入，同一uin内唯一
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get 环境所在地域，tianjin，beijiing，guangzhou等 
     * @return Zone 环境所在地域，tianjin，beijiing，guangzhou等
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 环境所在地域，tianjin，beijiing，guangzhou等
     * @param Zone 环境所在地域，tianjin，beijiing，guangzhou等
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 环境类型：0: sandbox, 1:shared, 2:private 3: trial 
     * @return Type 环境类型：0: sandbox, 1:shared, 2:private 3: trial
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 环境类型：0: sandbox, 1:shared, 2:private 3: trial
     * @param Type 环境类型：0: sandbox, 1:shared, 2:private 3: trial
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
     * Get 环境创建时间 
     * @return CreatedAt 环境创建时间
     */
    public Long getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 环境创建时间
     * @param CreatedAt 环境创建时间
     */
    public void setCreatedAt(Long CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 环境更新时间 
     * @return UpdatedAt 环境更新时间
     */
    public Long getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 环境更新时间
     * @param UpdatedAt 环境更新时间
     */
    public void setUpdatedAt(Long UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get 环境资源配置，worker总配额，0:0vCore0G, 1:1vCore2G, 2:2vCore4G, 4:4vCore8G, 8:8vCore16G, 12:12vCore24G, 16:16vCore32G, 100:unlimited 
     * @return WorkerSize 环境资源配置，worker总配额，0:0vCore0G, 1:1vCore2G, 2:2vCore4G, 4:4vCore8G, 8:8vCore16G, 12:12vCore24G, 16:16vCore32G, 100:unlimited
     */
    public Long getWorkerSize() {
        return this.WorkerSize;
    }

    /**
     * Set 环境资源配置，worker总配额，0:0vCore0G, 1:1vCore2G, 2:2vCore4G, 4:4vCore8G, 8:8vCore16G, 12:12vCore24G, 16:16vCore32G, 100:unlimited
     * @param WorkerSize 环境资源配置，worker总配额，0:0vCore0G, 1:1vCore2G, 2:2vCore4G, 4:4vCore8G, 8:8vCore16G, 12:12vCore24G, 16:16vCore32G, 100:unlimited
     */
    public void setWorkerSize(Long WorkerSize) {
        this.WorkerSize = WorkerSize;
    }

    /**
     * Get 环境资源配置，worker副本数 
     * @return WorkerReplica 环境资源配置，worker副本数
     */
    public Long getWorkerReplica() {
        return this.WorkerReplica;
    }

    /**
     * Set 环境资源配置，worker副本数
     * @param WorkerReplica 环境资源配置，worker副本数
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

    /**
     * Get 环境过期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpiredAt 环境过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExpiredAt() {
        return this.ExpiredAt;
    }

    /**
     * Set 环境过期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpiredAt 环境过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpiredAt(Long ExpiredAt) {
        this.ExpiredAt = ExpiredAt;
    }

    /**
     * Get 收费类型：0:缺省，1:自助下单页购买(支持续费/升配等操作)，2:代销下单页购买
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChargeType 收费类型：0:缺省，1:自助下单页购买(支持续费/升配等操作)，2:代销下单页购买
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set 收费类型：0:缺省，1:自助下单页购买(支持续费/升配等操作)，2:代销下单页购买
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChargeType 收费类型：0:缺省，1:自助下单页购买(支持续费/升配等操作)，2:代销下单页购买
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChargeType(Long ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get 资源限制类型：0:无限制，1:有限制
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceLimitType 资源限制类型：0:无限制，1:有限制
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getResourceLimitType() {
        return this.ResourceLimitType;
    }

    /**
     * Set 资源限制类型：0:无限制，1:有限制
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceLimitType 资源限制类型：0:无限制，1:有限制
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceLimitType(Long ResourceLimitType) {
        this.ResourceLimitType = ResourceLimitType;
    }

    /**
     * Get 是否开启自动续费
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoRenewal 是否开启自动续费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAutoRenewal() {
        return this.AutoRenewal;
    }

    /**
     * Set 是否开启自动续费
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoRenewal 是否开启自动续费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoRenewal(Boolean AutoRenewal) {
        this.AutoRenewal = AutoRenewal;
    }

    /**
     * Get 扩展组件列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkerExtensions 扩展组件列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RuntimeExtensionMC [] getWorkerExtensions() {
        return this.WorkerExtensions;
    }

    /**
     * Set 扩展组件列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkerExtensions 扩展组件列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkerExtensions(RuntimeExtensionMC [] WorkerExtensions) {
        this.WorkerExtensions = WorkerExtensions;
    }

    /**
     * Get 环境类型：0: sandbox, 1:shared, 2:private 3: trial
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuntimeType 环境类型：0: sandbox, 1:shared, 2:private 3: trial
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuntimeType() {
        return this.RuntimeType;
    }

    /**
     * Set 环境类型：0: sandbox, 1:shared, 2:private 3: trial
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuntimeType 环境类型：0: sandbox, 1:shared, 2:private 3: trial
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuntimeType(Long RuntimeType) {
        this.RuntimeType = RuntimeType;
    }

    /**
     * Get 环境运行类型：0:运行时类型、1:api类型、2:etl环境
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuntimeClass 环境运行类型：0:运行时类型、1:api类型、2:etl环境
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuntimeClass() {
        return this.RuntimeClass;
    }

    /**
     * Set 环境运行类型：0:运行时类型、1:api类型、2:etl环境
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuntimeClass 环境运行类型：0:运行时类型、1:api类型、2:etl环境
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuntimeClass(Long RuntimeClass) {
        this.RuntimeClass = RuntimeClass;
    }

    /**
     * Get 已使用出带宽 Mbps
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BandwidthOutUsed 已使用出带宽 Mbps
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getBandwidthOutUsed() {
        return this.BandwidthOutUsed;
    }

    /**
     * Set 已使用出带宽 Mbps
注意：此字段可能返回 null，表示取不到有效值。
     * @param BandwidthOutUsed 已使用出带宽 Mbps
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBandwidthOutUsed(Float BandwidthOutUsed) {
        this.BandwidthOutUsed = BandwidthOutUsed;
    }

    /**
     * Get 出带宽上限 Mbps
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BandwidthOutLimit 出带宽上限 Mbps
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getBandwidthOutLimit() {
        return this.BandwidthOutLimit;
    }

    /**
     * Set 出带宽上限 Mbps
注意：此字段可能返回 null，表示取不到有效值。
     * @param BandwidthOutLimit 出带宽上限 Mbps
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBandwidthOutLimit(Float BandwidthOutLimit) {
        this.BandwidthOutLimit = BandwidthOutLimit;
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
        if (source.ExpiredAt != null) {
            this.ExpiredAt = new Long(source.ExpiredAt);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new Long(source.ChargeType);
        }
        if (source.ResourceLimitType != null) {
            this.ResourceLimitType = new Long(source.ResourceLimitType);
        }
        if (source.AutoRenewal != null) {
            this.AutoRenewal = new Boolean(source.AutoRenewal);
        }
        if (source.WorkerExtensions != null) {
            this.WorkerExtensions = new RuntimeExtensionMC[source.WorkerExtensions.length];
            for (int i = 0; i < source.WorkerExtensions.length; i++) {
                this.WorkerExtensions[i] = new RuntimeExtensionMC(source.WorkerExtensions[i]);
            }
        }
        if (source.RuntimeType != null) {
            this.RuntimeType = new Long(source.RuntimeType);
        }
        if (source.RuntimeClass != null) {
            this.RuntimeClass = new Long(source.RuntimeClass);
        }
        if (source.BandwidthOutUsed != null) {
            this.BandwidthOutUsed = new Float(source.BandwidthOutUsed);
        }
        if (source.BandwidthOutLimit != null) {
            this.BandwidthOutLimit = new Float(source.BandwidthOutLimit);
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
        this.setParamSimple(map, prefix + "ExpiredAt", this.ExpiredAt);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "ResourceLimitType", this.ResourceLimitType);
        this.setParamSimple(map, prefix + "AutoRenewal", this.AutoRenewal);
        this.setParamArrayObj(map, prefix + "WorkerExtensions.", this.WorkerExtensions);
        this.setParamSimple(map, prefix + "RuntimeType", this.RuntimeType);
        this.setParamSimple(map, prefix + "RuntimeClass", this.RuntimeClass);
        this.setParamSimple(map, prefix + "BandwidthOutUsed", this.BandwidthOutUsed);
        this.setParamSimple(map, prefix + "BandwidthOutLimit", this.BandwidthOutLimit);

    }
}

