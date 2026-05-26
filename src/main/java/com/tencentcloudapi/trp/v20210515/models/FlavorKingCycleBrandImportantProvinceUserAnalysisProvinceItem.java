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

public class FlavorKingCycleBrandImportantProvinceUserAnalysisProvinceItem extends AbstractModel {

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
    @SerializedName("Cities")
    @Expose
    private FlavorKingCycleBrandImportantProvinceUserAnalysisCityItem [] Cities;

    /**
    * <p>省份</p>
    */
    @SerializedName("Province")
    @Expose
    private String Province;

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
     * @return Cities <p>下属城市明细</p>
     */
    public FlavorKingCycleBrandImportantProvinceUserAnalysisCityItem [] getCities() {
        return this.Cities;
    }

    /**
     * Set <p>下属城市明细</p>
     * @param Cities <p>下属城市明细</p>
     */
    public void setCities(FlavorKingCycleBrandImportantProvinceUserAnalysisCityItem [] Cities) {
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

    public FlavorKingCycleBrandImportantProvinceUserAnalysisProvinceItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlavorKingCycleBrandImportantProvinceUserAnalysisProvinceItem(FlavorKingCycleBrandImportantProvinceUserAnalysisProvinceItem source) {
        if (source.MarketShare != null) {
            this.MarketShare = new Float(source.MarketShare);
        }
        if (source.OtherMarketShare != null) {
            this.OtherMarketShare = new Float(source.OtherMarketShare);
        }
        if (source.GrowRatio != null) {
            this.GrowRatio = new Float(source.GrowRatio);
        }
        if (source.OtherGrowRatio != null) {
            this.OtherGrowRatio = new Float(source.OtherGrowRatio);
        }
        if (source.Cities != null) {
            this.Cities = new FlavorKingCycleBrandImportantProvinceUserAnalysisCityItem[source.Cities.length];
            for (int i = 0; i < source.Cities.length; i++) {
                this.Cities[i] = new FlavorKingCycleBrandImportantProvinceUserAnalysisCityItem(source.Cities[i]);
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
        this.setParamSimple(map, prefix + "MarketShare", this.MarketShare);
        this.setParamSimple(map, prefix + "OtherMarketShare", this.OtherMarketShare);
        this.setParamSimple(map, prefix + "GrowRatio", this.GrowRatio);
        this.setParamSimple(map, prefix + "OtherGrowRatio", this.OtherGrowRatio);
        this.setParamArrayObj(map, prefix + "Cities.", this.Cities);
        this.setParamSimple(map, prefix + "Province", this.Province);

    }
}

