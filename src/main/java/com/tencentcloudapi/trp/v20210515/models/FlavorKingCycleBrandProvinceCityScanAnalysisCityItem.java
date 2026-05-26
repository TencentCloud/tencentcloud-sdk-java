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
package com.tencentcloudapi.trp.v20210515.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlavorKingCycleBrandProvinceCityScanAnalysisCityItem extends AbstractModel {

    /**
    * <p>口味王分布</p>
    */
    @SerializedName("Ratio")
    @Expose
    private Float [] Ratio;

    /**
    * <p>分区域数据</p>
    */
    @SerializedName("Regions")
    @Expose
    private FlavorKingCycleBrandProvinceCityScanAnalysisRegionItem [] Regions;

    /**
    * <p>城市</p>
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
     * Get <p>口味王分布</p> 
     * @return Ratio <p>口味王分布</p>
     */
    public Float [] getRatio() {
        return this.Ratio;
    }

    /**
     * Set <p>口味王分布</p>
     * @param Ratio <p>口味王分布</p>
     */
    public void setRatio(Float [] Ratio) {
        this.Ratio = Ratio;
    }

    /**
     * Get <p>分区域数据</p> 
     * @return Regions <p>分区域数据</p>
     */
    public FlavorKingCycleBrandProvinceCityScanAnalysisRegionItem [] getRegions() {
        return this.Regions;
    }

    /**
     * Set <p>分区域数据</p>
     * @param Regions <p>分区域数据</p>
     */
    public void setRegions(FlavorKingCycleBrandProvinceCityScanAnalysisRegionItem [] Regions) {
        this.Regions = Regions;
    }

    /**
     * Get <p>城市</p> 
     * @return City <p>城市</p>
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set <p>城市</p>
     * @param City <p>城市</p>
     */
    public void setCity(String City) {
        this.City = City;
    }

    public FlavorKingCycleBrandProvinceCityScanAnalysisCityItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlavorKingCycleBrandProvinceCityScanAnalysisCityItem(FlavorKingCycleBrandProvinceCityScanAnalysisCityItem source) {
        if (source.Ratio != null) {
            this.Ratio = new Float[source.Ratio.length];
            for (int i = 0; i < source.Ratio.length; i++) {
                this.Ratio[i] = new Float(source.Ratio[i]);
            }
        }
        if (source.Regions != null) {
            this.Regions = new FlavorKingCycleBrandProvinceCityScanAnalysisRegionItem[source.Regions.length];
            for (int i = 0; i < source.Regions.length; i++) {
                this.Regions[i] = new FlavorKingCycleBrandProvinceCityScanAnalysisRegionItem(source.Regions[i]);
            }
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Ratio.", this.Ratio);
        this.setParamArrayObj(map, prefix + "Regions.", this.Regions);
        this.setParamSimple(map, prefix + "City", this.City);

    }
}

