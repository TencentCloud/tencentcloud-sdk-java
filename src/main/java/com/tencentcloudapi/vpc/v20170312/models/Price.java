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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Price extends AbstractModel {

    /**
    * 实例价格。
    */
    @SerializedName("InstancePrice")
    @Expose
    private ItemPrice InstancePrice;

    /**
    * 带宽价格。
    */
    @SerializedName("BandwidthPrice")
    @Expose
    private ItemPrice BandwidthPrice;

    /**
     * Get 实例价格。 
     * @return InstancePrice 实例价格。
     */
    public ItemPrice getInstancePrice() {
        return this.InstancePrice;
    }

    /**
     * Set 实例价格。
     * @param InstancePrice 实例价格。
     */
    public void setInstancePrice(ItemPrice InstancePrice) {
        this.InstancePrice = InstancePrice;
    }

    /**
     * Get 带宽价格。 
     * @return BandwidthPrice 带宽价格。
     */
    public ItemPrice getBandwidthPrice() {
        return this.BandwidthPrice;
    }

    /**
     * Set 带宽价格。
     * @param BandwidthPrice 带宽价格。
     */
    public void setBandwidthPrice(ItemPrice BandwidthPrice) {
        this.BandwidthPrice = BandwidthPrice;
    }

    public Price() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Price(Price source) {
        if (source.InstancePrice != null) {
            this.InstancePrice = new ItemPrice(source.InstancePrice);
        }
        if (source.BandwidthPrice != null) {
            this.BandwidthPrice = new ItemPrice(source.BandwidthPrice);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "InstancePrice.", this.InstancePrice);
        this.setParamObj(map, prefix + "BandwidthPrice.", this.BandwidthPrice);

    }
}

