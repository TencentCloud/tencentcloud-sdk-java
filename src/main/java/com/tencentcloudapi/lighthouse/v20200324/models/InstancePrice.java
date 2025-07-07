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

public class InstancePrice extends AbstractModel {

    /**
    * 套餐单价原价。
    */
    @SerializedName("OriginalBundlePrice")
    @Expose
    private Float OriginalBundlePrice;

    /**
    * 原价。
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
    * 折后价。
    */
    @SerializedName("DiscountPrice")
    @Expose
    private Float DiscountPrice;

    /**
    * 价格货币单位。取值范围CNY:人民币。USD:美元。
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
     * Get 套餐单价原价。 
     * @return OriginalBundlePrice 套餐单价原价。
     */
    public Float getOriginalBundlePrice() {
        return this.OriginalBundlePrice;
    }

    /**
     * Set 套餐单价原价。
     * @param OriginalBundlePrice 套餐单价原价。
     */
    public void setOriginalBundlePrice(Float OriginalBundlePrice) {
        this.OriginalBundlePrice = OriginalBundlePrice;
    }

    /**
     * Get 原价。 
     * @return OriginalPrice 原价。
     */
    public Float getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * Set 原价。
     * @param OriginalPrice 原价。
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
     * Get 折后价。 
     * @return DiscountPrice 折后价。
     */
    public Float getDiscountPrice() {
        return this.DiscountPrice;
    }

    /**
     * Set 折后价。
     * @param DiscountPrice 折后价。
     */
    public void setDiscountPrice(Float DiscountPrice) {
        this.DiscountPrice = DiscountPrice;
    }

    /**
     * Get 价格货币单位。取值范围CNY:人民币。USD:美元。 
     * @return Currency 价格货币单位。取值范围CNY:人民币。USD:美元。
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set 价格货币单位。取值范围CNY:人民币。USD:美元。
     * @param Currency 价格货币单位。取值范围CNY:人民币。USD:美元。
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    public InstancePrice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstancePrice(InstancePrice source) {
        if (source.OriginalBundlePrice != null) {
            this.OriginalBundlePrice = new Float(source.OriginalBundlePrice);
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
        if (source.Currency != null) {
            this.Currency = new String(source.Currency);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OriginalBundlePrice", this.OriginalBundlePrice);
        this.setParamSimple(map, prefix + "OriginalPrice", this.OriginalPrice);
        this.setParamSimple(map, prefix + "Discount", this.Discount);
        this.setParamSimple(map, prefix + "DiscountPrice", this.DiscountPrice);
        this.setParamSimple(map, prefix + "Currency", this.Currency);

    }
}

