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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiskPrice extends AbstractModel {

    /**
    * 云硬盘单价。
    */
    @SerializedName("OriginalDiskPrice")
    @Expose
    private Float OriginalDiskPrice;

    /**
    * 云硬盘总价。
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Float OriginalPrice;

    /**
    * 折扣。
    */
    @SerializedName("Discount")
    @Expose
    private Float Discount;

    /**
    * 折后总价。
    */
    @SerializedName("DiscountPrice")
    @Expose
    private Float DiscountPrice;

    /**
    * 计费项目明细列表。
    */
    @SerializedName("DetailPrices")
    @Expose
    private DetailPrice [] DetailPrices;

    /**
     * Get 云硬盘单价。 
     * @return OriginalDiskPrice 云硬盘单价。
     */
    public Float getOriginalDiskPrice() {
        return this.OriginalDiskPrice;
    }

    /**
     * Set 云硬盘单价。
     * @param OriginalDiskPrice 云硬盘单价。
     */
    public void setOriginalDiskPrice(Float OriginalDiskPrice) {
        this.OriginalDiskPrice = OriginalDiskPrice;
    }

    /**
     * Get 云硬盘总价。 
     * @return OriginalPrice 云硬盘总价。
     */
    public Float getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * Set 云硬盘总价。
     * @param OriginalPrice 云硬盘总价。
     */
    public void setOriginalPrice(Float OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    /**
     * Get 折扣。 
     * @return Discount 折扣。
     */
    public Float getDiscount() {
        return this.Discount;
    }

    /**
     * Set 折扣。
     * @param Discount 折扣。
     */
    public void setDiscount(Float Discount) {
        this.Discount = Discount;
    }

    /**
     * Get 折后总价。 
     * @return DiscountPrice 折后总价。
     */
    public Float getDiscountPrice() {
        return this.DiscountPrice;
    }

    /**
     * Set 折后总价。
     * @param DiscountPrice 折后总价。
     */
    public void setDiscountPrice(Float DiscountPrice) {
        this.DiscountPrice = DiscountPrice;
    }

    /**
     * Get 计费项目明细列表。 
     * @return DetailPrices 计费项目明细列表。
     */
    public DetailPrice [] getDetailPrices() {
        return this.DetailPrices;
    }

    /**
     * Set 计费项目明细列表。
     * @param DetailPrices 计费项目明细列表。
     */
    public void setDetailPrices(DetailPrice [] DetailPrices) {
        this.DetailPrices = DetailPrices;
    }

    public DiskPrice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiskPrice(DiskPrice source) {
        if (source.OriginalDiskPrice != null) {
            this.OriginalDiskPrice = new Float(source.OriginalDiskPrice);
        }
        if (source.OriginalPrice != null) {
            this.OriginalPrice = new Float(source.OriginalPrice);
        }
        if (source.Discount != null) {
            this.Discount = new Float(source.Discount);
        }
        if (source.DiscountPrice != null) {
            this.DiscountPrice = new Float(source.DiscountPrice);
        }
        if (source.DetailPrices != null) {
            this.DetailPrices = new DetailPrice[source.DetailPrices.length];
            for (int i = 0; i < source.DetailPrices.length; i++) {
                this.DetailPrices[i] = new DetailPrice(source.DetailPrices[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OriginalDiskPrice", this.OriginalDiskPrice);
        this.setParamSimple(map, prefix + "OriginalPrice", this.OriginalPrice);
        this.setParamSimple(map, prefix + "Discount", this.Discount);
        this.setParamSimple(map, prefix + "DiscountPrice", this.DiscountPrice);
        this.setParamArrayObj(map, prefix + "DetailPrices.", this.DetailPrices);

    }
}

