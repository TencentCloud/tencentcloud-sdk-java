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

public class FlavorKingCycleBrandProvinceCityScanAnalysisProvinceItem extends AbstractModel {

    /**
    * <p>口味王分布</p>
    */
    @SerializedName("Ratio")
    @Expose
    private Float [] Ratio;

    /**
    * <p>下属城市明细</p>
    */
    @SerializedName("Cities")
    @Expose
    private FlavorKingCycleBrandProvinceCityScanAnalysisCityItem [] Cities;

    /**
    * <p>省份</p>
    */
    @SerializedName("Province")
    @Expose
    private String Province;

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
     * Get <p>下属城市明细</p> 
     * @return Cities <p>下属城市明细</p>
     */
    public FlavorKingCycleBrandProvinceCityScanAnalysisCityItem [] getCities() {
        return this.Cities;
    }

    /**
     * Set <p>下属城市明细</p>
     * @param Cities <p>下属城市明细</p>
     */
    public void setCities(FlavorKingCycleBrandProvinceCityScanAnalysisCityItem [] Cities) {
        this.Cities = Cities;
    }

    /**
     * Get <p>省份</p> 
     * @return Province <p>省份</p>
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set <p>省份</p>
     * @param Province <p>省份</p>
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    public FlavorKingCycleBrandProvinceCityScanAnalysisProvinceItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlavorKingCycleBrandProvinceCityScanAnalysisProvinceItem(FlavorKingCycleBrandProvinceCityScanAnalysisProvinceItem source) {
        if (source.Ratio != null) {
            this.Ratio = new Float[source.Ratio.length];
            for (int i = 0; i < source.Ratio.length; i++) {
                this.Ratio[i] = new Float(source.Ratio[i]);
            }
        }
        if (source.Cities != null) {
            this.Cities = new FlavorKingCycleBrandProvinceCityScanAnalysisCityItem[source.Cities.length];
            for (int i = 0; i < source.Cities.length; i++) {
                this.Cities[i] = new FlavorKingCycleBrandProvinceCityScanAnalysisCityItem(source.Cities[i]);
            }
        }
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Ratio.", this.Ratio);
        this.setParamArrayObj(map, prefix + "Cities.", this.Cities);
        this.setParamSimple(map, prefix + "Province", this.Province);

    }
}

