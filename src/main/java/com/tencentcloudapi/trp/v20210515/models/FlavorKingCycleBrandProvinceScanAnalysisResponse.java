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

public class FlavorKingCycleBrandProvinceScanAnalysisResponse extends AbstractModel {

    /**
    * <p>口味王全国份额</p>
    */
    @SerializedName("MarketShare")
    @Expose
    private Float MarketShare;

    /**
    * <p>上周期口味王市场份额</p>
    */
    @SerializedName("LastCycleMarketShare")
    @Expose
    private Float LastCycleMarketShare;

    /**
    * <p>口味王全国周环比</p>
    */
    @SerializedName("Provinces")
    @Expose
    private FlavorKingCycleBrandProvinceScanAnalysisDataItem [] Provinces;

    /**
    * <p>口味王环比</p>
    */
    @SerializedName("GrowRatio")
    @Expose
    private Float GrowRatio;

    /**
    * <p>其他品牌环比</p>
    */
    @SerializedName("OtherGrowRatio")
    @Expose
    private Float OtherGrowRatio;

    /**
     * Get <p>口味王全国份额</p> 
     * @return MarketShare <p>口味王全国份额</p>
     */
    public Float getMarketShare() {
        return this.MarketShare;
    }

    /**
     * Set <p>口味王全国份额</p>
     * @param MarketShare <p>口味王全国份额</p>
     */
    public void setMarketShare(Float MarketShare) {
        this.MarketShare = MarketShare;
    }

    /**
     * Get <p>上周期口味王市场份额</p> 
     * @return LastCycleMarketShare <p>上周期口味王市场份额</p>
     */
    public Float getLastCycleMarketShare() {
        return this.LastCycleMarketShare;
    }

    /**
     * Set <p>上周期口味王市场份额</p>
     * @param LastCycleMarketShare <p>上周期口味王市场份额</p>
     */
    public void setLastCycleMarketShare(Float LastCycleMarketShare) {
        this.LastCycleMarketShare = LastCycleMarketShare;
    }

    /**
     * Get <p>口味王全国周环比</p> 
     * @return Provinces <p>口味王全国周环比</p>
     */
    public FlavorKingCycleBrandProvinceScanAnalysisDataItem [] getProvinces() {
        return this.Provinces;
    }

    /**
     * Set <p>口味王全国周环比</p>
     * @param Provinces <p>口味王全国周环比</p>
     */
    public void setProvinces(FlavorKingCycleBrandProvinceScanAnalysisDataItem [] Provinces) {
        this.Provinces = Provinces;
    }

    /**
     * Get <p>口味王环比</p> 
     * @return GrowRatio <p>口味王环比</p>
     */
    public Float getGrowRatio() {
        return this.GrowRatio;
    }

    /**
     * Set <p>口味王环比</p>
     * @param GrowRatio <p>口味王环比</p>
     */
    public void setGrowRatio(Float GrowRatio) {
        this.GrowRatio = GrowRatio;
    }

    /**
     * Get <p>其他品牌环比</p> 
     * @return OtherGrowRatio <p>其他品牌环比</p>
     */
    public Float getOtherGrowRatio() {
        return this.OtherGrowRatio;
    }

    /**
     * Set <p>其他品牌环比</p>
     * @param OtherGrowRatio <p>其他品牌环比</p>
     */
    public void setOtherGrowRatio(Float OtherGrowRatio) {
        this.OtherGrowRatio = OtherGrowRatio;
    }

    public FlavorKingCycleBrandProvinceScanAnalysisResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlavorKingCycleBrandProvinceScanAnalysisResponse(FlavorKingCycleBrandProvinceScanAnalysisResponse source) {
        if (source.MarketShare != null) {
            this.MarketShare = new Float(source.MarketShare);
        }
        if (source.LastCycleMarketShare != null) {
            this.LastCycleMarketShare = new Float(source.LastCycleMarketShare);
        }
        if (source.Provinces != null) {
            this.Provinces = new FlavorKingCycleBrandProvinceScanAnalysisDataItem[source.Provinces.length];
            for (int i = 0; i < source.Provinces.length; i++) {
                this.Provinces[i] = new FlavorKingCycleBrandProvinceScanAnalysisDataItem(source.Provinces[i]);
            }
        }
        if (source.GrowRatio != null) {
            this.GrowRatio = new Float(source.GrowRatio);
        }
        if (source.OtherGrowRatio != null) {
            this.OtherGrowRatio = new Float(source.OtherGrowRatio);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MarketShare", this.MarketShare);
        this.setParamSimple(map, prefix + "LastCycleMarketShare", this.LastCycleMarketShare);
        this.setParamArrayObj(map, prefix + "Provinces.", this.Provinces);
        this.setParamSimple(map, prefix + "GrowRatio", this.GrowRatio);
        this.setParamSimple(map, prefix + "OtherGrowRatio", this.OtherGrowRatio);

    }
}

