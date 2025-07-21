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
package com.tencentcloudapi.ctsdb.v20230202.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Spec extends AbstractModel {

    /**
    * 1：包年包月、2：按小时计费
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 请求单元，为0则表示走资源配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RequestUnit")
    @Expose
    private Long RequestUnit;

    /**
    * CPU 核数最大限制
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CpuLimit")
    @Expose
    private Float CpuLimit;

    /**
    * 内存 最大限制(Gi)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemoryLimit")
    @Expose
    private Float MemoryLimit;

    /**
    * 磁盘 最大限制(Gi)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskLimit")
    @Expose
    private Long DiskLimit;

    /**
    * 业务分片数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Shards")
    @Expose
    private Long Shards;

    /**
    * 业务节点数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Replicas")
    @Expose
    private Long Replicas;

    /**
     * Get 1：包年包月、2：按小时计费
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayMode 1：包年包月、2：按小时计费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 1：包年包月、2：按小时计费
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayMode 1：包年包月、2：按小时计费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 请求单元，为0则表示走资源配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RequestUnit 请求单元，为0则表示走资源配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRequestUnit() {
        return this.RequestUnit;
    }

    /**
     * Set 请求单元，为0则表示走资源配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param RequestUnit 请求单元，为0则表示走资源配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequestUnit(Long RequestUnit) {
        this.RequestUnit = RequestUnit;
    }

    /**
     * Get CPU 核数最大限制
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CpuLimit CPU 核数最大限制
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getCpuLimit() {
        return this.CpuLimit;
    }

    /**
     * Set CPU 核数最大限制
注意：此字段可能返回 null，表示取不到有效值。
     * @param CpuLimit CPU 核数最大限制
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpuLimit(Float CpuLimit) {
        this.CpuLimit = CpuLimit;
    }

    /**
     * Get 内存 最大限制(Gi)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemoryLimit 内存 最大限制(Gi)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getMemoryLimit() {
        return this.MemoryLimit;
    }

    /**
     * Set 内存 最大限制(Gi)
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemoryLimit 内存 最大限制(Gi)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemoryLimit(Float MemoryLimit) {
        this.MemoryLimit = MemoryLimit;
    }

    /**
     * Get 磁盘 最大限制(Gi)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskLimit 磁盘 最大限制(Gi)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDiskLimit() {
        return this.DiskLimit;
    }

    /**
     * Set 磁盘 最大限制(Gi)
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskLimit 磁盘 最大限制(Gi)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskLimit(Long DiskLimit) {
        this.DiskLimit = DiskLimit;
    }

    /**
     * Get 业务分片数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Shards 业务分片数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getShards() {
        return this.Shards;
    }

    /**
     * Set 业务分片数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Shards 业务分片数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShards(Long Shards) {
        this.Shards = Shards;
    }

    /**
     * Get 业务节点数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Replicas 业务节点数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReplicas() {
        return this.Replicas;
    }

    /**
     * Set 业务节点数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Replicas 业务节点数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReplicas(Long Replicas) {
        this.Replicas = Replicas;
    }

    public Spec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Spec(Spec source) {
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.RequestUnit != null) {
            this.RequestUnit = new Long(source.RequestUnit);
        }
        if (source.CpuLimit != null) {
            this.CpuLimit = new Float(source.CpuLimit);
        }
        if (source.MemoryLimit != null) {
            this.MemoryLimit = new Float(source.MemoryLimit);
        }
        if (source.DiskLimit != null) {
            this.DiskLimit = new Long(source.DiskLimit);
        }
        if (source.Shards != null) {
            this.Shards = new Long(source.Shards);
        }
        if (source.Replicas != null) {
            this.Replicas = new Long(source.Replicas);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "RequestUnit", this.RequestUnit);
        this.setParamSimple(map, prefix + "CpuLimit", this.CpuLimit);
        this.setParamSimple(map, prefix + "MemoryLimit", this.MemoryLimit);
        this.setParamSimple(map, prefix + "DiskLimit", this.DiskLimit);
        this.setParamSimple(map, prefix + "Shards", this.Shards);
        this.setParamSimple(map, prefix + "Replicas", this.Replicas);

    }
}

