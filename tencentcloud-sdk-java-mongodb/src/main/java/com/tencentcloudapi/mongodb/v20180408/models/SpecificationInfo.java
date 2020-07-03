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
package com.tencentcloudapi.mongodb.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpecificationInfo extends AbstractModel{

    /**
    * 地域信息
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 可用区信息
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 售卖规格信息
    */
    @SerializedName("SpecItems")
    @Expose
    private SpecItem [] SpecItems;

    /**
     * Get 地域信息 
     * @return Region 地域信息
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域信息
     * @param Region 地域信息
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 可用区信息 
     * @return Zone 可用区信息
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区信息
     * @param Zone 可用区信息
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 售卖规格信息 
     * @return SpecItems 售卖规格信息
     */
    public SpecItem [] getSpecItems() {
        return this.SpecItems;
    }

    /**
     * Set 售卖规格信息
     * @param SpecItems 售卖规格信息
     */
    public void setSpecItems(SpecItem [] SpecItems) {
        this.SpecItems = SpecItems;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamArrayObj(map, prefix + "SpecItems.", this.SpecItems);

    }
}

