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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpecificationInfo extends AbstractModel {

    /**
    * 地域信息。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 可用区信息。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 售卖规格信息。
    */
    @SerializedName("SpecItems")
    @Expose
    private SpecItem [] SpecItems;

    /**
    * 是否支持跨可用区部署。
- 1：支持。
- 0：不支持。
    */
    @SerializedName("SupportMultiAZ")
    @Expose
    private Long SupportMultiAZ;

    /**
     * Get 地域信息。 
     * @return Region 地域信息。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域信息。
     * @param Region 地域信息。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 可用区信息。 
     * @return Zone 可用区信息。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区信息。
     * @param Zone 可用区信息。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 售卖规格信息。 
     * @return SpecItems 售卖规格信息。
     */
    public SpecItem [] getSpecItems() {
        return this.SpecItems;
    }

    /**
     * Set 售卖规格信息。
     * @param SpecItems 售卖规格信息。
     */
    public void setSpecItems(SpecItem [] SpecItems) {
        this.SpecItems = SpecItems;
    }

    /**
     * Get 是否支持跨可用区部署。
- 1：支持。
- 0：不支持。 
     * @return SupportMultiAZ 是否支持跨可用区部署。
- 1：支持。
- 0：不支持。
     */
    public Long getSupportMultiAZ() {
        return this.SupportMultiAZ;
    }

    /**
     * Set 是否支持跨可用区部署。
- 1：支持。
- 0：不支持。
     * @param SupportMultiAZ 是否支持跨可用区部署。
- 1：支持。
- 0：不支持。
     */
    public void setSupportMultiAZ(Long SupportMultiAZ) {
        this.SupportMultiAZ = SupportMultiAZ;
    }

    public SpecificationInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpecificationInfo(SpecificationInfo source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.SpecItems != null) {
            this.SpecItems = new SpecItem[source.SpecItems.length];
            for (int i = 0; i < source.SpecItems.length; i++) {
                this.SpecItems[i] = new SpecItem(source.SpecItems[i]);
            }
        }
        if (source.SupportMultiAZ != null) {
            this.SupportMultiAZ = new Long(source.SupportMultiAZ);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamArrayObj(map, prefix + "SpecItems.", this.SpecItems);
        this.setParamSimple(map, prefix + "SupportMultiAZ", this.SupportMultiAZ);

    }
}

