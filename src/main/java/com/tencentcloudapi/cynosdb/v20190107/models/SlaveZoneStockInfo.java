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

public class SlaveZoneStockInfo extends AbstractModel {

    /**
    * 备可用区
    */
    @SerializedName("SlaveZone")
    @Expose
    private String SlaveZone;

    /**
    * 备可用区的库存数量	
    */
    @SerializedName("StockCount")
    @Expose
    private Long StockCount;

    /**
    * 备可用区是否有库存	
    */
    @SerializedName("HasStock")
    @Expose
    private Boolean HasStock;

    /**
     * Get 备可用区 
     * @return SlaveZone 备可用区
     */
    public String getSlaveZone() {
        return this.SlaveZone;
    }

    /**
     * Set 备可用区
     * @param SlaveZone 备可用区
     */
    public void setSlaveZone(String SlaveZone) {
        this.SlaveZone = SlaveZone;
    }

    /**
     * Get 备可用区的库存数量	 
     * @return StockCount 备可用区的库存数量	
     */
    public Long getStockCount() {
        return this.StockCount;
    }

    /**
     * Set 备可用区的库存数量	
     * @param StockCount 备可用区的库存数量	
     */
    public void setStockCount(Long StockCount) {
        this.StockCount = StockCount;
    }

    /**
     * Get 备可用区是否有库存	 
     * @return HasStock 备可用区是否有库存	
     */
    public Boolean getHasStock() {
        return this.HasStock;
    }

    /**
     * Set 备可用区是否有库存	
     * @param HasStock 备可用区是否有库存	
     */
    public void setHasStock(Boolean HasStock) {
        this.HasStock = HasStock;
    }

    public SlaveZoneStockInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SlaveZoneStockInfo(SlaveZoneStockInfo source) {
        if (source.SlaveZone != null) {
            this.SlaveZone = new String(source.SlaveZone);
        }
        if (source.StockCount != null) {
            this.StockCount = new Long(source.StockCount);
        }
        if (source.HasStock != null) {
            this.HasStock = new Boolean(source.HasStock);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SlaveZone", this.SlaveZone);
        this.setParamSimple(map, prefix + "StockCount", this.StockCount);
        this.setParamSimple(map, prefix + "HasStock", this.HasStock);

    }
}

