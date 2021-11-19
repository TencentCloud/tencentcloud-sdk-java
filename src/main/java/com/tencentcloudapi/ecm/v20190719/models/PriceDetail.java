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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PriceDetail extends AbstractModel{

    /**
    * 表示折扣，20 表示20%，打2折
    */
    @SerializedName("Discount")
    @Expose
    private Long Discount;

    /**
    * 打折后价格，单位分
    */
    @SerializedName("DiscountPrice")
    @Expose
    private Long DiscountPrice;

    /**
    * 折扣前价格，单位分
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Long OriginalPrice;

    /**
     * Get 表示折扣，20 表示20%，打2折 
     * @return Discount 表示折扣，20 表示20%，打2折
     */
    public Long getDiscount() {
        return this.Discount;
    }

    /**
     * Set 表示折扣，20 表示20%，打2折
     * @param Discount 表示折扣，20 表示20%，打2折
     */
    public void setDiscount(Long Discount) {
        this.Discount = Discount;
    }

    /**
     * Get 打折后价格，单位分 
     * @return DiscountPrice 打折后价格，单位分
     */
    public Long getDiscountPrice() {
        return this.DiscountPrice;
    }

    /**
     * Set 打折后价格，单位分
     * @param DiscountPrice 打折后价格，单位分
     */
    public void setDiscountPrice(Long DiscountPrice) {
        this.DiscountPrice = DiscountPrice;
    }

    /**
     * Get 折扣前价格，单位分 
     * @return OriginalPrice 折扣前价格，单位分
     */
    public Long getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * Set 折扣前价格，单位分
     * @param OriginalPrice 折扣前价格，单位分
     */
    public void setOriginalPrice(Long OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    public PriceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PriceDetail(PriceDetail source) {
        if (source.Discount != null) {
            this.Discount = new Long(source.Discount);
        }
        if (source.DiscountPrice != null) {
            this.DiscountPrice = new Long(source.DiscountPrice);
        }
        if (source.OriginalPrice != null) {
            this.OriginalPrice = new Long(source.OriginalPrice);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Discount", this.Discount);
        this.setParamSimple(map, prefix + "DiscountPrice", this.DiscountPrice);
        this.setParamSimple(map, prefix + "OriginalPrice", this.OriginalPrice);

    }
}

