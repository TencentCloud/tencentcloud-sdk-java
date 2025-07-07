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

public class ServerlessSpec extends AbstractModel {

    /**
    * cpu最小值
    */
    @SerializedName("MinCpu")
    @Expose
    private Float MinCpu;

    /**
    * cpu最大值
    */
    @SerializedName("MaxCpu")
    @Expose
    private Float MaxCpu;

    /**
    * 最大存储空间
    */
    @SerializedName("MaxStorageSize")
    @Expose
    private Long MaxStorageSize;

    /**
    * 是否为默认规格
    */
    @SerializedName("IsDefault")
    @Expose
    private Long IsDefault;

    /**
    * 是否有库存
    */
    @SerializedName("HasStock")
    @Expose
    private Boolean HasStock;

    /**
    * 库存数量
    */
    @SerializedName("StockCount")
    @Expose
    private Long StockCount;

    /**
    * 可用区库存信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneStockInfos")
    @Expose
    private ServerlessZoneStockInfo [] ZoneStockInfos;

    /**
     * Get cpu最小值 
     * @return MinCpu cpu最小值
     */
    public Float getMinCpu() {
        return this.MinCpu;
    }

    /**
     * Set cpu最小值
     * @param MinCpu cpu最小值
     */
    public void setMinCpu(Float MinCpu) {
        this.MinCpu = MinCpu;
    }

    /**
     * Get cpu最大值 
     * @return MaxCpu cpu最大值
     */
    public Float getMaxCpu() {
        return this.MaxCpu;
    }

    /**
     * Set cpu最大值
     * @param MaxCpu cpu最大值
     */
    public void setMaxCpu(Float MaxCpu) {
        this.MaxCpu = MaxCpu;
    }

    /**
     * Get 最大存储空间 
     * @return MaxStorageSize 最大存储空间
     */
    public Long getMaxStorageSize() {
        return this.MaxStorageSize;
    }

    /**
     * Set 最大存储空间
     * @param MaxStorageSize 最大存储空间
     */
    public void setMaxStorageSize(Long MaxStorageSize) {
        this.MaxStorageSize = MaxStorageSize;
    }

    /**
     * Get 是否为默认规格 
     * @return IsDefault 是否为默认规格
     */
    public Long getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set 是否为默认规格
     * @param IsDefault 是否为默认规格
     */
    public void setIsDefault(Long IsDefault) {
        this.IsDefault = IsDefault;
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
     * Get 库存数量 
     * @return StockCount 库存数量
     */
    public Long getStockCount() {
        return this.StockCount;
    }

    /**
     * Set 库存数量
     * @param StockCount 库存数量
     */
    public void setStockCount(Long StockCount) {
        this.StockCount = StockCount;
    }

    /**
     * Get 可用区库存信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneStockInfos 可用区库存信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ServerlessZoneStockInfo [] getZoneStockInfos() {
        return this.ZoneStockInfos;
    }

    /**
     * Set 可用区库存信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneStockInfos 可用区库存信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneStockInfos(ServerlessZoneStockInfo [] ZoneStockInfos) {
        this.ZoneStockInfos = ZoneStockInfos;
    }

    public ServerlessSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServerlessSpec(ServerlessSpec source) {
        if (source.MinCpu != null) {
            this.MinCpu = new Float(source.MinCpu);
        }
        if (source.MaxCpu != null) {
            this.MaxCpu = new Float(source.MaxCpu);
        }
        if (source.MaxStorageSize != null) {
            this.MaxStorageSize = new Long(source.MaxStorageSize);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Long(source.IsDefault);
        }
        if (source.HasStock != null) {
            this.HasStock = new Boolean(source.HasStock);
        }
        if (source.StockCount != null) {
            this.StockCount = new Long(source.StockCount);
        }
        if (source.ZoneStockInfos != null) {
            this.ZoneStockInfos = new ServerlessZoneStockInfo[source.ZoneStockInfos.length];
            for (int i = 0; i < source.ZoneStockInfos.length; i++) {
                this.ZoneStockInfos[i] = new ServerlessZoneStockInfo(source.ZoneStockInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MinCpu", this.MinCpu);
        this.setParamSimple(map, prefix + "MaxCpu", this.MaxCpu);
        this.setParamSimple(map, prefix + "MaxStorageSize", this.MaxStorageSize);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "HasStock", this.HasStock);
        this.setParamSimple(map, prefix + "StockCount", this.StockCount);
        this.setParamArrayObj(map, prefix + "ZoneStockInfos.", this.ZoneStockInfos);

    }
}

