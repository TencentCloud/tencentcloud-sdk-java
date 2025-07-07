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
package com.tencentcloudapi.partners.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DealGoodsPriceNewElem extends AbstractModel {

    /**
    * 实付金额（单位：分）
    */
    @SerializedName("RealTotalCost")
    @Expose
    private Long RealTotalCost;

    /**
    * 原始金额（不含折扣，单位：分）
    */
    @SerializedName("OriginalTotalCost")
    @Expose
    private Long OriginalTotalCost;

    /**
     * Get 实付金额（单位：分） 
     * @return RealTotalCost 实付金额（单位：分）
     */
    public Long getRealTotalCost() {
        return this.RealTotalCost;
    }

    /**
     * Set 实付金额（单位：分）
     * @param RealTotalCost 实付金额（单位：分）
     */
    public void setRealTotalCost(Long RealTotalCost) {
        this.RealTotalCost = RealTotalCost;
    }

    /**
     * Get 原始金额（不含折扣，单位：分） 
     * @return OriginalTotalCost 原始金额（不含折扣，单位：分）
     */
    public Long getOriginalTotalCost() {
        return this.OriginalTotalCost;
    }

    /**
     * Set 原始金额（不含折扣，单位：分）
     * @param OriginalTotalCost 原始金额（不含折扣，单位：分）
     */
    public void setOriginalTotalCost(Long OriginalTotalCost) {
        this.OriginalTotalCost = OriginalTotalCost;
    }

    public DealGoodsPriceNewElem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DealGoodsPriceNewElem(DealGoodsPriceNewElem source) {
        if (source.RealTotalCost != null) {
            this.RealTotalCost = new Long(source.RealTotalCost);
        }
        if (source.OriginalTotalCost != null) {
            this.OriginalTotalCost = new Long(source.OriginalTotalCost);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RealTotalCost", this.RealTotalCost);
        this.setParamSimple(map, prefix + "OriginalTotalCost", this.OriginalTotalCost);

    }
}

