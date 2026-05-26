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

public class FlavorKingCycleBrandScanAnalysisResponse extends AbstractModel {

    /**
    * <p>总数</p>
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * <p>占比</p>
    */
    @SerializedName("CycleRatio")
    @Expose
    private Float CycleRatio;

    /**
    * <p>环比</p>
    */
    @SerializedName("CycleOverCycle")
    @Expose
    private Float CycleOverCycle;

    /**
    * <p>占比详情</p>
    */
    @SerializedName("CycleRatioItems")
    @Expose
    private FlavorKingCycleBrandScanAnalysisDataItem [] CycleRatioItems;

    /**
     * Get <p>总数</p> 
     * @return Count <p>总数</p>
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set <p>总数</p>
     * @param Count <p>总数</p>
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get <p>占比</p> 
     * @return CycleRatio <p>占比</p>
     */
    public Float getCycleRatio() {
        return this.CycleRatio;
    }

    /**
     * Set <p>占比</p>
     * @param CycleRatio <p>占比</p>
     */
    public void setCycleRatio(Float CycleRatio) {
        this.CycleRatio = CycleRatio;
    }

    /**
     * Get <p>环比</p> 
     * @return CycleOverCycle <p>环比</p>
     */
    public Float getCycleOverCycle() {
        return this.CycleOverCycle;
    }

    /**
     * Set <p>环比</p>
     * @param CycleOverCycle <p>环比</p>
     */
    public void setCycleOverCycle(Float CycleOverCycle) {
        this.CycleOverCycle = CycleOverCycle;
    }

    /**
     * Get <p>占比详情</p> 
     * @return CycleRatioItems <p>占比详情</p>
     */
    public FlavorKingCycleBrandScanAnalysisDataItem [] getCycleRatioItems() {
        return this.CycleRatioItems;
    }

    /**
     * Set <p>占比详情</p>
     * @param CycleRatioItems <p>占比详情</p>
     */
    public void setCycleRatioItems(FlavorKingCycleBrandScanAnalysisDataItem [] CycleRatioItems) {
        this.CycleRatioItems = CycleRatioItems;
    }

    public FlavorKingCycleBrandScanAnalysisResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlavorKingCycleBrandScanAnalysisResponse(FlavorKingCycleBrandScanAnalysisResponse source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.CycleRatio != null) {
            this.CycleRatio = new Float(source.CycleRatio);
        }
        if (source.CycleOverCycle != null) {
            this.CycleOverCycle = new Float(source.CycleOverCycle);
        }
        if (source.CycleRatioItems != null) {
            this.CycleRatioItems = new FlavorKingCycleBrandScanAnalysisDataItem[source.CycleRatioItems.length];
            for (int i = 0; i < source.CycleRatioItems.length; i++) {
                this.CycleRatioItems[i] = new FlavorKingCycleBrandScanAnalysisDataItem(source.CycleRatioItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "CycleRatio", this.CycleRatio);
        this.setParamSimple(map, prefix + "CycleOverCycle", this.CycleOverCycle);
        this.setParamArrayObj(map, prefix + "CycleRatioItems.", this.CycleRatioItems);

    }
}

