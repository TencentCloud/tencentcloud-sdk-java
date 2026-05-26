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

public class FlavorKingCycleBrandProvinceCityScanAnalysisRegionItem extends AbstractModel {

    /**
    * <p>口味王分布</p>
    */
    @SerializedName("Ratio")
    @Expose
    private Float [] Ratio;

    /**
    * <p>区域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

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
     * Get <p>区域</p> 
     * @return Region <p>区域</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>区域</p>
     * @param Region <p>区域</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public FlavorKingCycleBrandProvinceCityScanAnalysisRegionItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlavorKingCycleBrandProvinceCityScanAnalysisRegionItem(FlavorKingCycleBrandProvinceCityScanAnalysisRegionItem source) {
        if (source.Ratio != null) {
            this.Ratio = new Float[source.Ratio.length];
            for (int i = 0; i < source.Ratio.length; i++) {
                this.Ratio[i] = new Float(source.Ratio[i]);
            }
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Ratio.", this.Ratio);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

