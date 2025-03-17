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

public class ZoneStockInfo extends AbstractModel {

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

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
    * 备可用区库存信息
    */
    @SerializedName("SlaveZoneStockInfos")
    @Expose
    private SlaveZoneStockInfo [] SlaveZoneStockInfos;

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
     * Get 备可用区库存信息 
     * @return SlaveZoneStockInfos 备可用区库存信息
     */
    public SlaveZoneStockInfo [] getSlaveZoneStockInfos() {
        return this.SlaveZoneStockInfos;
    }

    /**
     * Set 备可用区库存信息
     * @param SlaveZoneStockInfos 备可用区库存信息
     */
    public void setSlaveZoneStockInfos(SlaveZoneStockInfo [] SlaveZoneStockInfos) {
        this.SlaveZoneStockInfos = SlaveZoneStockInfos;
    }

    public ZoneStockInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneStockInfo(ZoneStockInfo source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.HasStock != null) {
            this.HasStock = new Boolean(source.HasStock);
        }
        if (source.StockCount != null) {
            this.StockCount = new Long(source.StockCount);
        }
        if (source.SlaveZoneStockInfos != null) {
            this.SlaveZoneStockInfos = new SlaveZoneStockInfo[source.SlaveZoneStockInfos.length];
            for (int i = 0; i < source.SlaveZoneStockInfos.length; i++) {
                this.SlaveZoneStockInfos[i] = new SlaveZoneStockInfo(source.SlaveZoneStockInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "HasStock", this.HasStock);
        this.setParamSimple(map, prefix + "StockCount", this.StockCount);
        this.setParamArrayObj(map, prefix + "SlaveZoneStockInfos.", this.SlaveZoneStockInfos);

    }
}

