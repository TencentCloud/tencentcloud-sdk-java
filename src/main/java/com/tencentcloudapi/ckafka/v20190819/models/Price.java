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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Price extends AbstractModel{

    /**
    * 折扣价
    */
    @SerializedName("RealTotalCost")
    @Expose
    private Float RealTotalCost;

    /**
    * 原价
    */
    @SerializedName("TotalCost")
    @Expose
    private Float TotalCost;

    /**
     * Get 折扣价 
     * @return RealTotalCost 折扣价
     */
    public Float getRealTotalCost() {
        return this.RealTotalCost;
    }

    /**
     * Set 折扣价
     * @param RealTotalCost 折扣价
     */
    public void setRealTotalCost(Float RealTotalCost) {
        this.RealTotalCost = RealTotalCost;
    }

    /**
     * Get 原价 
     * @return TotalCost 原价
     */
    public Float getTotalCost() {
        return this.TotalCost;
    }

    /**
     * Set 原价
     * @param TotalCost 原价
     */
    public void setTotalCost(Float TotalCost) {
        this.TotalCost = TotalCost;
    }

    public Price() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Price(Price source) {
        if (source.RealTotalCost != null) {
            this.RealTotalCost = new Float(source.RealTotalCost);
        }
        if (source.TotalCost != null) {
            this.TotalCost = new Float(source.TotalCost);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RealTotalCost", this.RealTotalCost);
        this.setParamSimple(map, prefix + "TotalCost", this.TotalCost);

    }
}

