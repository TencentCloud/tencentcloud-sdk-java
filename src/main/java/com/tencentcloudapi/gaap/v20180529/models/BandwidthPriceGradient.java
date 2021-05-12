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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BandwidthPriceGradient extends AbstractModel{

    /**
    * 带宽范围。
    */
    @SerializedName("BandwidthRange")
    @Expose
    private Long [] BandwidthRange;

    /**
    * 在对应带宽范围内的单宽单价，单位：元/Mbps/天。
    */
    @SerializedName("BandwidthUnitPrice")
    @Expose
    private Float BandwidthUnitPrice;

    /**
    * 带宽折扣价，单位：元/Mbps/天。
    */
    @SerializedName("DiscountBandwidthUnitPrice")
    @Expose
    private Float DiscountBandwidthUnitPrice;

    /**
     * Get 带宽范围。 
     * @return BandwidthRange 带宽范围。
     */
    public Long [] getBandwidthRange() {
        return this.BandwidthRange;
    }

    /**
     * Set 带宽范围。
     * @param BandwidthRange 带宽范围。
     */
    public void setBandwidthRange(Long [] BandwidthRange) {
        this.BandwidthRange = BandwidthRange;
    }

    /**
     * Get 在对应带宽范围内的单宽单价，单位：元/Mbps/天。 
     * @return BandwidthUnitPrice 在对应带宽范围内的单宽单价，单位：元/Mbps/天。
     */
    public Float getBandwidthUnitPrice() {
        return this.BandwidthUnitPrice;
    }

    /**
     * Set 在对应带宽范围内的单宽单价，单位：元/Mbps/天。
     * @param BandwidthUnitPrice 在对应带宽范围内的单宽单价，单位：元/Mbps/天。
     */
    public void setBandwidthUnitPrice(Float BandwidthUnitPrice) {
        this.BandwidthUnitPrice = BandwidthUnitPrice;
    }

    /**
     * Get 带宽折扣价，单位：元/Mbps/天。 
     * @return DiscountBandwidthUnitPrice 带宽折扣价，单位：元/Mbps/天。
     */
    public Float getDiscountBandwidthUnitPrice() {
        return this.DiscountBandwidthUnitPrice;
    }

    /**
     * Set 带宽折扣价，单位：元/Mbps/天。
     * @param DiscountBandwidthUnitPrice 带宽折扣价，单位：元/Mbps/天。
     */
    public void setDiscountBandwidthUnitPrice(Float DiscountBandwidthUnitPrice) {
        this.DiscountBandwidthUnitPrice = DiscountBandwidthUnitPrice;
    }

    public BandwidthPriceGradient() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BandwidthPriceGradient(BandwidthPriceGradient source) {
        if (source.BandwidthRange != null) {
            this.BandwidthRange = new Long[source.BandwidthRange.length];
            for (int i = 0; i < source.BandwidthRange.length; i++) {
                this.BandwidthRange[i] = new Long(source.BandwidthRange[i]);
            }
        }
        if (source.BandwidthUnitPrice != null) {
            this.BandwidthUnitPrice = new Float(source.BandwidthUnitPrice);
        }
        if (source.DiscountBandwidthUnitPrice != null) {
            this.DiscountBandwidthUnitPrice = new Float(source.DiscountBandwidthUnitPrice);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "BandwidthRange.", this.BandwidthRange);
        this.setParamSimple(map, prefix + "BandwidthUnitPrice", this.BandwidthUnitPrice);
        this.setParamSimple(map, prefix + "DiscountBandwidthUnitPrice", this.DiscountBandwidthUnitPrice);

    }
}

