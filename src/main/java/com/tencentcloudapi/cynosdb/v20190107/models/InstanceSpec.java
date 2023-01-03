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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceSpec extends AbstractModel{

    /**
    * 实例CPU，单位：核
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 实例内存，单位：GB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 实例最大可用存储，单位：GB
    */
    @SerializedName("MaxStorageSize")
    @Expose
    private Long MaxStorageSize;

    /**
    * 实例最小可用存储，单位：GB
    */
    @SerializedName("MinStorageSize")
    @Expose
    private Long MinStorageSize;

    /**
    * 是否有库存
    */
    @SerializedName("HasStock")
    @Expose
    private Boolean HasStock;

    /**
    * 机器类型
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * 最大IOPS
    */
    @SerializedName("MaxIops")
    @Expose
    private Long MaxIops;

    /**
    * 最大IO带宽
    */
    @SerializedName("MaxIoBandWidth")
    @Expose
    private Long MaxIoBandWidth;

    /**
    * 地域库存信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneStockInfos")
    @Expose
    private ZoneStockInfo [] ZoneStockInfos;

    /**
    * 库存数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StockCount")
    @Expose
    private Long StockCount;

    /**
     * Get 实例CPU，单位：核 
     * @return Cpu 实例CPU，单位：核
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set 实例CPU，单位：核
     * @param Cpu 实例CPU，单位：核
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 实例内存，单位：GB 
     * @return Memory 实例内存，单位：GB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 实例内存，单位：GB
     * @param Memory 实例内存，单位：GB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 实例最大可用存储，单位：GB 
     * @return MaxStorageSize 实例最大可用存储，单位：GB
     */
    public Long getMaxStorageSize() {
        return this.MaxStorageSize;
    }

    /**
     * Set 实例最大可用存储，单位：GB
     * @param MaxStorageSize 实例最大可用存储，单位：GB
     */
    public void setMaxStorageSize(Long MaxStorageSize) {
        this.MaxStorageSize = MaxStorageSize;
    }

    /**
     * Get 实例最小可用存储，单位：GB 
     * @return MinStorageSize 实例最小可用存储，单位：GB
     */
    public Long getMinStorageSize() {
        return this.MinStorageSize;
    }

    /**
     * Set 实例最小可用存储，单位：GB
     * @param MinStorageSize 实例最小可用存储，单位：GB
     */
    public void setMinStorageSize(Long MinStorageSize) {
        this.MinStorageSize = MinStorageSize;
    }

    /**
     * Get 是否有库存 
     * @return HasStock 是否有库存
     */
    public Boolean getHasStock() {
        return this.HasStock;
    }

    /**
     * Set 是否有库存
     * @param HasStock 是否有库存
     */
    public void setHasStock(Boolean HasStock) {
        this.HasStock = HasStock;
    }

    /**
     * Get 机器类型 
     * @return MachineType 机器类型
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set 机器类型
     * @param MachineType 机器类型
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get 最大IOPS 
     * @return MaxIops 最大IOPS
     */
    public Long getMaxIops() {
        return this.MaxIops;
    }

    /**
     * Set 最大IOPS
     * @param MaxIops 最大IOPS
     */
    public void setMaxIops(Long MaxIops) {
        this.MaxIops = MaxIops;
    }

    /**
     * Get 最大IO带宽 
     * @return MaxIoBandWidth 最大IO带宽
     */
    public Long getMaxIoBandWidth() {
        return this.MaxIoBandWidth;
    }

    /**
     * Set 最大IO带宽
     * @param MaxIoBandWidth 最大IO带宽
     */
    public void setMaxIoBandWidth(Long MaxIoBandWidth) {
        this.MaxIoBandWidth = MaxIoBandWidth;
    }

    /**
     * Get 地域库存信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneStockInfos 地域库存信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ZoneStockInfo [] getZoneStockInfos() {
        return this.ZoneStockInfos;
    }

    /**
     * Set 地域库存信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneStockInfos 地域库存信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneStockInfos(ZoneStockInfo [] ZoneStockInfos) {
        this.ZoneStockInfos = ZoneStockInfos;
    }

    /**
     * Get 库存数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StockCount 库存数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStockCount() {
        return this.StockCount;
    }

    /**
     * Set 库存数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param StockCount 库存数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStockCount(Long StockCount) {
        this.StockCount = StockCount;
    }

    public InstanceSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceSpec(InstanceSpec source) {
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.MaxStorageSize != null) {
            this.MaxStorageSize = new Long(source.MaxStorageSize);
        }
        if (source.MinStorageSize != null) {
            this.MinStorageSize = new Long(source.MinStorageSize);
        }
        if (source.HasStock != null) {
            this.HasStock = new Boolean(source.HasStock);
        }
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.MaxIops != null) {
            this.MaxIops = new Long(source.MaxIops);
        }
        if (source.MaxIoBandWidth != null) {
            this.MaxIoBandWidth = new Long(source.MaxIoBandWidth);
        }
        if (source.ZoneStockInfos != null) {
            this.ZoneStockInfos = new ZoneStockInfo[source.ZoneStockInfos.length];
            for (int i = 0; i < source.ZoneStockInfos.length; i++) {
                this.ZoneStockInfos[i] = new ZoneStockInfo(source.ZoneStockInfos[i]);
            }
        }
        if (source.StockCount != null) {
            this.StockCount = new Long(source.StockCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "MaxStorageSize", this.MaxStorageSize);
        this.setParamSimple(map, prefix + "MinStorageSize", this.MinStorageSize);
        this.setParamSimple(map, prefix + "HasStock", this.HasStock);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "MaxIops", this.MaxIops);
        this.setParamSimple(map, prefix + "MaxIoBandWidth", this.MaxIoBandWidth);
        this.setParamArrayObj(map, prefix + "ZoneStockInfos.", this.ZoneStockInfos);
        this.setParamSimple(map, prefix + "StockCount", this.StockCount);

    }
}

