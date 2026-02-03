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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegionInstanceSpecInfo extends AbstractModel {

    /**
    * cpu核数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 内存大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 最小存储大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MinStorageSize")
    @Expose
    private Long MinStorageSize;

    /**
    * 最大存储大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxStorageSize")
    @Expose
    private Long MaxStorageSize;

    /**
    * 是否有库存
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HasStock")
    @Expose
    private Boolean HasStock;

    /**
    * 实例类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 存储类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * 最小副本数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MinReplicaNum")
    @Expose
    private Long MinReplicaNum;

    /**
    * 最大副本数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxReplicaNum")
    @Expose
    private Long MaxReplicaNum;

    /**
    * 可用区库存信息列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneStockInfos")
    @Expose
    private ZoneStockInfo4Libra [] ZoneStockInfos;

    /**
     * Get cpu核数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cpu cpu核数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set cpu核数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cpu cpu核数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Memory 内存大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param Memory 内存大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 最小存储大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MinStorageSize 最小存储大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMinStorageSize() {
        return this.MinStorageSize;
    }

    /**
     * Set 最小存储大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param MinStorageSize 最小存储大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMinStorageSize(Long MinStorageSize) {
        this.MinStorageSize = MinStorageSize;
    }

    /**
     * Get 最大存储大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxStorageSize 最大存储大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxStorageSize() {
        return this.MaxStorageSize;
    }

    /**
     * Set 最大存储大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxStorageSize 最大存储大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxStorageSize(Long MaxStorageSize) {
        this.MaxStorageSize = MaxStorageSize;
    }

    /**
     * Get 是否有库存
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HasStock 是否有库存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getHasStock() {
        return this.HasStock;
    }

    /**
     * Set 是否有库存
注意：此字段可能返回 null，表示取不到有效值。
     * @param HasStock 是否有库存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHasStock(Boolean HasStock) {
        this.HasStock = HasStock;
    }

    /**
     * Get 实例类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceType 实例类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceType 实例类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 存储类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageType 存储类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set 存储类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageType 存储类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get 最小副本数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MinReplicaNum 最小副本数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMinReplicaNum() {
        return this.MinReplicaNum;
    }

    /**
     * Set 最小副本数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MinReplicaNum 最小副本数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMinReplicaNum(Long MinReplicaNum) {
        this.MinReplicaNum = MinReplicaNum;
    }

    /**
     * Get 最大副本数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxReplicaNum 最大副本数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxReplicaNum() {
        return this.MaxReplicaNum;
    }

    /**
     * Set 最大副本数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxReplicaNum 最大副本数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxReplicaNum(Long MaxReplicaNum) {
        this.MaxReplicaNum = MaxReplicaNum;
    }

    /**
     * Get 可用区库存信息列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneStockInfos 可用区库存信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ZoneStockInfo4Libra [] getZoneStockInfos() {
        return this.ZoneStockInfos;
    }

    /**
     * Set 可用区库存信息列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneStockInfos 可用区库存信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneStockInfos(ZoneStockInfo4Libra [] ZoneStockInfos) {
        this.ZoneStockInfos = ZoneStockInfos;
    }

    public RegionInstanceSpecInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegionInstanceSpecInfo(RegionInstanceSpecInfo source) {
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.MinStorageSize != null) {
            this.MinStorageSize = new Long(source.MinStorageSize);
        }
        if (source.MaxStorageSize != null) {
            this.MaxStorageSize = new Long(source.MaxStorageSize);
        }
        if (source.HasStock != null) {
            this.HasStock = new Boolean(source.HasStock);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.MinReplicaNum != null) {
            this.MinReplicaNum = new Long(source.MinReplicaNum);
        }
        if (source.MaxReplicaNum != null) {
            this.MaxReplicaNum = new Long(source.MaxReplicaNum);
        }
        if (source.ZoneStockInfos != null) {
            this.ZoneStockInfos = new ZoneStockInfo4Libra[source.ZoneStockInfos.length];
            for (int i = 0; i < source.ZoneStockInfos.length; i++) {
                this.ZoneStockInfos[i] = new ZoneStockInfo4Libra(source.ZoneStockInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "MinStorageSize", this.MinStorageSize);
        this.setParamSimple(map, prefix + "MaxStorageSize", this.MaxStorageSize);
        this.setParamSimple(map, prefix + "HasStock", this.HasStock);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "MinReplicaNum", this.MinReplicaNum);
        this.setParamSimple(map, prefix + "MaxReplicaNum", this.MaxReplicaNum);
        this.setParamArrayObj(map, prefix + "ZoneStockInfos.", this.ZoneStockInfos);

    }
}

