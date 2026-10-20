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

public class ProxyZoneStockInfo extends AbstractModel {

    /**
    * <p>地域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>可用区</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>CPU库存</p><p>该字段不作为发货是否有资源的判断标准，资源请参考CheckProxyStockInfos</p>
    */
    @SerializedName("CpuStock")
    @Expose
    private Long CpuStock;

    /**
    * <p>内存库存</p><p>该字段不作为发货是否有资源的判断标准，资源请参考CheckProxyStockInfos</p>
    */
    @SerializedName("MemStock")
    @Expose
    private Long MemStock;

    /**
     * Get <p>地域</p> 
     * @return Region <p>地域</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域</p>
     * @param Region <p>地域</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>可用区</p> 
     * @return Zone <p>可用区</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区</p>
     * @param Zone <p>可用区</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>CPU库存</p><p>该字段不作为发货是否有资源的判断标准，资源请参考CheckProxyStockInfos</p> 
     * @return CpuStock <p>CPU库存</p><p>该字段不作为发货是否有资源的判断标准，资源请参考CheckProxyStockInfos</p>
     */
    public Long getCpuStock() {
        return this.CpuStock;
    }

    /**
     * Set <p>CPU库存</p><p>该字段不作为发货是否有资源的判断标准，资源请参考CheckProxyStockInfos</p>
     * @param CpuStock <p>CPU库存</p><p>该字段不作为发货是否有资源的判断标准，资源请参考CheckProxyStockInfos</p>
     */
    public void setCpuStock(Long CpuStock) {
        this.CpuStock = CpuStock;
    }

    /**
     * Get <p>内存库存</p><p>该字段不作为发货是否有资源的判断标准，资源请参考CheckProxyStockInfos</p> 
     * @return MemStock <p>内存库存</p><p>该字段不作为发货是否有资源的判断标准，资源请参考CheckProxyStockInfos</p>
     */
    public Long getMemStock() {
        return this.MemStock;
    }

    /**
     * Set <p>内存库存</p><p>该字段不作为发货是否有资源的判断标准，资源请参考CheckProxyStockInfos</p>
     * @param MemStock <p>内存库存</p><p>该字段不作为发货是否有资源的判断标准，资源请参考CheckProxyStockInfos</p>
     */
    public void setMemStock(Long MemStock) {
        this.MemStock = MemStock;
    }

    public ProxyZoneStockInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxyZoneStockInfo(ProxyZoneStockInfo source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.CpuStock != null) {
            this.CpuStock = new Long(source.CpuStock);
        }
        if (source.MemStock != null) {
            this.MemStock = new Long(source.MemStock);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "CpuStock", this.CpuStock);
        this.setParamSimple(map, prefix + "MemStock", this.MemStock);

    }
}

