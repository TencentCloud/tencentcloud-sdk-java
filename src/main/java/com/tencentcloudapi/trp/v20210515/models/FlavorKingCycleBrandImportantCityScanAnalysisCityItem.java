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

public class FlavorKingCycleBrandImportantCityScanAnalysisCityItem extends AbstractModel {

    /**
    * <p>口味王分布</p>
    */
    @SerializedName("Ratio")
    @Expose
    private Float Ratio;

    /**
    * <p>口味王市场份额</p>
    */
    @SerializedName("MarketShare")
    @Expose
    private Float MarketShare;

    /**
    * <p>其他品牌市场份额</p>
    */
    @SerializedName("OtherMarketShare")
    @Expose
    private Float OtherMarketShare;

    /**
    * <p>上周期口味王分布</p>
    */
    @SerializedName("LastCycleRatio")
    @Expose
    private Float LastCycleRatio;

    /**
    * <p>上周期口味王品牌市场份额</p>
    */
    @SerializedName("LastCycleMarketShare")
    @Expose
    private Float LastCycleMarketShare;

    /**
    * <p>上周期其他品牌市场份额</p>
    */
    @SerializedName("LastCycleOtherMarketShare")
    @Expose
    private Float LastCycleOtherMarketShare;

    /**
    * <p>口味王增长率</p>
    */
    @SerializedName("GrowRatio")
    @Expose
    private Float GrowRatio;

    /**
    * <p>其他品牌增长率</p>
    */
    @SerializedName("OtherGrowRatio")
    @Expose
    private Float OtherGrowRatio;

    /**
    * <p>下属城市明细</p>
    */
    @SerializedName("Regions")
    @Expose
    private FlavorKingCycleBrandImportantCityScanAnalysisRegionItem [] Regions;

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
    public Float getRatio() {
        return this.Ratio;
    }

    /**
     * Set <p>口味王分布</p>
     * @param Ratio <p>口味王分布</p>
     */
    public void setRatio(Float Ratio) {
        this.Ratio = Ratio;
    }

    /**
     * Get <p>口味王市场份额</p> 
     * @return MarketShare <p>口味王市场份额</p>
     */
    public Float getMarketShare() {
        return this.MarketShare;
    }

    /**
     * Set <p>口味王市场份额</p>
     * @param MarketShare <p>口味王市场份额</p>
     */
    public void setMarketShare(Float MarketShare) {
        this.MarketShare = MarketShare;
    }

    /**
     * Get <p>其他品牌市场份额</p> 
     * @return OtherMarketShare <p>其他品牌市场份额</p>
     */
    public Float getOtherMarketShare() {
        return this.OtherMarketShare;
    }

    /**
     * Set <p>其他品牌市场份额</p>
     * @param OtherMarketShare <p>其他品牌市场份额</p>
     */
    public void setOtherMarketShare(Float OtherMarketShare) {
        this.OtherMarketShare = OtherMarketShare;
    }

    /**
     * Get <p>上周期口味王分布</p> 
     * @return LastCycleRatio <p>上周期口味王分布</p>
     */
    public Float getLastCycleRatio() {
        return this.LastCycleRatio;
    }

    /**
     * Set <p>上周期口味王分布</p>
     * @param LastCycleRatio <p>上周期口味王分布</p>
     */
    public void setLastCycleRatio(Float LastCycleRatio) {
        this.LastCycleRatio = LastCycleRatio;
    }

    /**
     * Get <p>上周期口味王品牌市场份额</p> 
     * @return LastCycleMarketShare <p>上周期口味王品牌市场份额</p>
     */
    public Float getLastCycleMarketShare() {
        return this.LastCycleMarketShare;
    }

    /**
     * Set <p>上周期口味王品牌市场份额</p>
     * @param LastCycleMarketShare <p>上周期口味王品牌市场份额</p>
     */
    public void setLastCycleMarketShare(Float LastCycleMarketShare) {
        this.LastCycleMarketShare = LastCycleMarketShare;
    }

    /**
     * Get <p>上周期其他品牌市场份额</p> 
     * @return LastCycleOtherMarketShare <p>上周期其他品牌市场份额</p>
     */
    public Float getLastCycleOtherMarketShare() {
        return this.LastCycleOtherMarketShare;
    }

    /**
     * Set <p>上周期其他品牌市场份额</p>
     * @param LastCycleOtherMarketShare <p>上周期其他品牌市场份额</p>
     */
    public void setLastCycleOtherMarketShare(Float LastCycleOtherMarketShare) {
        this.LastCycleOtherMarketShare = LastCycleOtherMarketShare;
    }

    /**
     * Get <p>口味王增长率</p> 
     * @return GrowRatio <p>口味王增长率</p>
     */
    public Float getGrowRatio() {
        return this.GrowRatio;
    }

    /**
     * Set <p>口味王增长率</p>
     * @param GrowRatio <p>口味王增长率</p>
     */
    public void setGrowRatio(Float GrowRatio) {
        this.GrowRatio = GrowRatio;
    }

    /**
     * Get <p>其他品牌增长率</p> 
     * @return OtherGrowRatio <p>其他品牌增长率</p>
     */
    public Float getOtherGrowRatio() {
        return this.OtherGrowRatio;
    }

    /**
     * Set <p>其他品牌增长率</p>
     * @param OtherGrowRatio <p>其他品牌增长率</p>
     */
    public void setOtherGrowRatio(Float OtherGrowRatio) {
        this.OtherGrowRatio = OtherGrowRatio;
    }

    /**
     * Get <p>下属城市明细</p> 
     * @return Regions <p>下属城市明细</p>
     */
    public FlavorKingCycleBrandImportantCityScanAnalysisRegionItem [] getRegions() {
        return this.Regions;
    }

    /**
     * Set <p>下属城市明细</p>
     * @param Regions <p>下属城市明细</p>
     */
    public void setRegions(FlavorKingCycleBrandImportantCityScanAnalysisRegionItem [] Regions) {
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

    public FlavorKingCycleBrandImportantCityScanAnalysisCityItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlavorKingCycleBrandImportantCityScanAnalysisCityItem(FlavorKingCycleBrandImportantCityScanAnalysisCityItem source) {
        if (source.Ratio != null) {
            this.Ratio = new Float(source.Ratio);
        }
        if (source.MarketShare != null) {
            this.MarketShare = new Float(source.MarketShare);
        }
        if (source.OtherMarketShare != null) {
            this.OtherMarketShare = new Float(source.OtherMarketShare);
        }
        if (source.LastCycleRatio != null) {
            this.LastCycleRatio = new Float(source.LastCycleRatio);
        }
        if (source.LastCycleMarketShare != null) {
            this.LastCycleMarketShare = new Float(source.LastCycleMarketShare);
        }
        if (source.LastCycleOtherMarketShare != null) {
            this.LastCycleOtherMarketShare = new Float(source.LastCycleOtherMarketShare);
        }
        if (source.GrowRatio != null) {
            this.GrowRatio = new Float(source.GrowRatio);
        }
        if (source.OtherGrowRatio != null) {
            this.OtherGrowRatio = new Float(source.OtherGrowRatio);
        }
        if (source.Regions != null) {
            this.Regions = new FlavorKingCycleBrandImportantCityScanAnalysisRegionItem[source.Regions.length];
            for (int i = 0; i < source.Regions.length; i++) {
                this.Regions[i] = new FlavorKingCycleBrandImportantCityScanAnalysisRegionItem(source.Regions[i]);
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
        this.setParamSimple(map, prefix + "Ratio", this.Ratio);
        this.setParamSimple(map, prefix + "MarketShare", this.MarketShare);
        this.setParamSimple(map, prefix + "OtherMarketShare", this.OtherMarketShare);
        this.setParamSimple(map, prefix + "LastCycleRatio", this.LastCycleRatio);
        this.setParamSimple(map, prefix + "LastCycleMarketShare", this.LastCycleMarketShare);
        this.setParamSimple(map, prefix + "LastCycleOtherMarketShare", this.LastCycleOtherMarketShare);
        this.setParamSimple(map, prefix + "GrowRatio", this.GrowRatio);
        this.setParamSimple(map, prefix + "OtherGrowRatio", this.OtherGrowRatio);
        this.setParamArrayObj(map, prefix + "Regions.", this.Regions);
        this.setParamSimple(map, prefix + "City", this.City);

    }
}

