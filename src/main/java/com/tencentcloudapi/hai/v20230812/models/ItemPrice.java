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
package com.tencentcloudapi.hai.v20230812.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ItemPrice extends AbstractModel {

    /**
    * 原单价，元
    */
    @SerializedName("UnitPrice")
    @Expose
    private Float UnitPrice;

    /**
    * 折扣后单价，元
    */
    @SerializedName("DiscountUnitPrice")
    @Expose
    private Float DiscountUnitPrice;

    /**
    * 折扣
    */
    @SerializedName("Discount")
    @Expose
    private Float Discount;

    /**
    * 单位：时/月

    */
    @SerializedName("ChargeUnit")
    @Expose
    private String ChargeUnit;

    /**
    * 商品数量
    */
    @SerializedName("Amount")
    @Expose
    private Long Amount;

    /**
     * Get 原单价，元 
     * @return UnitPrice 原单价，元
     */
    public Float getUnitPrice() {
        return this.UnitPrice;
    }

    /**
     * Set 原单价，元
     * @param UnitPrice 原单价，元
     */
    public void setUnitPrice(Float UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    /**
     * Get 折扣后单价，元 
     * @return DiscountUnitPrice 折扣后单价，元
     */
    public Float getDiscountUnitPrice() {
        return this.DiscountUnitPrice;
    }

    /**
     * Set 折扣后单价，元
     * @param DiscountUnitPrice 折扣后单价，元
     */
    public void setDiscountUnitPrice(Float DiscountUnitPrice) {
        this.DiscountUnitPrice = DiscountUnitPrice;
    }

    /**
     * Get 折扣 
     * @return Discount 折扣
     */
    public Float getDiscount() {
        return this.Discount;
    }

    /**
     * Set 折扣
     * @param Discount 折扣
     */
    public void setDiscount(Float Discount) {
        this.Discount = Discount;
    }

    /**
     * Get 单位：时/月
 
     * @return ChargeUnit 单位：时/月

     */
    public String getChargeUnit() {
        return this.ChargeUnit;
    }

    /**
     * Set 单位：时/月

     * @param ChargeUnit 单位：时/月

     */
    public void setChargeUnit(String ChargeUnit) {
        this.ChargeUnit = ChargeUnit;
    }

    /**
     * Get 商品数量 
     * @return Amount 商品数量
     */
    public Long getAmount() {
        return this.Amount;
    }

    /**
     * Set 商品数量
     * @param Amount 商品数量
     */
    public void setAmount(Long Amount) {
        this.Amount = Amount;
    }

    public ItemPrice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ItemPrice(ItemPrice source) {
        if (source.UnitPrice != null) {
            this.UnitPrice = new Float(source.UnitPrice);
        }
        if (source.DiscountUnitPrice != null) {
            this.DiscountUnitPrice = new Float(source.DiscountUnitPrice);
        }
        if (source.Discount != null) {
            this.Discount = new Float(source.Discount);
        }
        if (source.ChargeUnit != null) {
            this.ChargeUnit = new String(source.ChargeUnit);
        }
        if (source.Amount != null) {
            this.Amount = new Long(source.Amount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UnitPrice", this.UnitPrice);
        this.setParamSimple(map, prefix + "DiscountUnitPrice", this.DiscountUnitPrice);
        this.setParamSimple(map, prefix + "Discount", this.Discount);
        this.setParamSimple(map, prefix + "ChargeUnit", this.ChargeUnit);
        this.setParamSimple(map, prefix + "Amount", this.Amount);

    }
}

