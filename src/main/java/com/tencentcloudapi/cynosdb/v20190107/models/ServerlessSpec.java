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
    * <p>cpu最小值</p>
    */
    @SerializedName("MinCpu")
    @Expose
    private Float MinCpu;

    /**
    * <p>cpu最大值</p>
    */
    @SerializedName("MaxCpu")
    @Expose
    private Float MaxCpu;

    /**
    * <p>最大存储空间</p>
    */
    @SerializedName("MaxStorageSize")
    @Expose
    private Long MaxStorageSize;

    /**
    * <p>是否为默认规格</p>
    */
    @SerializedName("IsDefault")
    @Expose
    private Long IsDefault;

    /**
    * <p>是否有库存</p>
    */
    @SerializedName("HasStock")
    @Expose
    private Boolean HasStock;

    /**
    * <p>库存数量</p>
    */
    @SerializedName("StockCount")
    @Expose
    private Long StockCount;

    /**
    * <p>可用区库存信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneStockInfos")
    @Expose
    private ServerlessZoneStockInfo [] ZoneStockInfos;

    /**
     * Get <p>cpu最小值</p> 
     * @return MinCpu <p>cpu最小值</p>
     */
    public Float getMinCpu() {
        return this.MinCpu;
    }

    /**
     * Set <p>cpu最小值</p>
     * @param MinCpu <p>cpu最小值</p>
     */
    public void setMinCpu(Float MinCpu) {
        this.MinCpu = MinCpu;
    }

    /**
     * Get <p>cpu最大值</p> 
     * @return MaxCpu <p>cpu最大值</p>
     */
    public Float getMaxCpu() {
        return this.MaxCpu;
    }

    /**
     * Set <p>cpu最大值</p>
     * @param MaxCpu <p>cpu最大值</p>
     */
    public void setMaxCpu(Float MaxCpu) {
        this.MaxCpu = MaxCpu;
    }

    /**
     * Get <p>最大存储空间</p> 
     * @return MaxStorageSize <p>最大存储空间</p>
     */
    public Long getMaxStorageSize() {
        return this.MaxStorageSize;
    }

    /**
     * Set <p>最大存储空间</p>
     * @param MaxStorageSize <p>最大存储空间</p>
     */
    public void setMaxStorageSize(Long MaxStorageSize) {
        this.MaxStorageSize = MaxStorageSize;
    }

    /**
     * Get <p>是否为默认规格</p> 
     * @return IsDefault <p>是否为默认规格</p>
     */
    public Long getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set <p>是否为默认规格</p>
     * @param IsDefault <p>是否为默认规格</p>
     */
    public void setIsDefault(Long IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get <p>是否有库存</p> 
     * @return HasStock <p>是否有库存</p>
     */
    public Boolean getHasStock() {
        return this.HasStock;
    }

    /**
     * Set <p>是否有库存</p>
     * @param HasStock <p>是否有库存</p>
     */
    public void setHasStock(Boolean HasStock) {
        this.HasStock = HasStock;
    }

    /**
     * Get <p>库存数量</p> 
     * @return StockCount <p>库存数量</p>
     */
    public Long getStockCount() {
        return this.StockCount;
    }

    /**
     * Set <p>库存数量</p>
     * @param StockCount <p>库存数量</p>
     */
    public void setStockCount(Long StockCount) {
        this.StockCount = StockCount;
    }

    /**
     * Get <p>可用区库存信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneStockInfos <p>可用区库存信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ServerlessZoneStockInfo [] getZoneStockInfos() {
        return this.ZoneStockInfos;
    }

    /**
     * Set <p>可用区库存信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneStockInfos <p>可用区库存信息</p>
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

