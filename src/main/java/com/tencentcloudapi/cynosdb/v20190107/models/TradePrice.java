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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TradePrice extends AbstractModel {

    /**
    * 预付费模式下资源总价，不包含优惠，单位:分
    */
    @SerializedName("TotalPrice")
    @Expose
    private Long TotalPrice;

    /**
    * 总的折扣，100表示100%不打折
    */
    @SerializedName("Discount")
    @Expose
    private Float Discount;

    /**
    * 预付费模式下的优惠后总价, 单位: 分,例如用户享有折扣 =TotalPrice × Discount
    */
    @SerializedName("TotalPriceDiscount")
    @Expose
    private Long TotalPriceDiscount;

    /**
    * 后付费模式下的单位资源价格，不包含优惠，单位:分
    */
    @SerializedName("UnitPrice")
    @Expose
    private Long UnitPrice;

    /**
    * 优惠后后付费模式下的单位资源价格, 单位: 分,例如用户享有折扣=UnitPricet × Discount
    */
    @SerializedName("UnitPriceDiscount")
    @Expose
    private Long UnitPriceDiscount;

    /**
    * 计费价格单位
    */
    @SerializedName("ChargeUnit")
    @Expose
    private String ChargeUnit;

    /**
    * 高精度下不包含优惠价格
    */
    @SerializedName("UnitPriceHighPrecision")
    @Expose
    private String UnitPriceHighPrecision;

    /**
    * 高精度下优惠后价格
    */
    @SerializedName("UnitPriceDiscountHighPrecision")
    @Expose
    private String UnitPriceDiscountHighPrecision;

    /**
    * 货币单位
    */
    @SerializedName("AmountUnit")
    @Expose
    private String AmountUnit;

    /**
     * Get 预付费模式下资源总价，不包含优惠，单位:分 
     * @return TotalPrice 预付费模式下资源总价，不包含优惠，单位:分
     */
    public Long getTotalPrice() {
        return this.TotalPrice;
    }

    /**
     * Set 预付费模式下资源总价，不包含优惠，单位:分
     * @param TotalPrice 预付费模式下资源总价，不包含优惠，单位:分
     */
    public void setTotalPrice(Long TotalPrice) {
        this.TotalPrice = TotalPrice;
    }

    /**
     * Get 总的折扣，100表示100%不打折 
     * @return Discount 总的折扣，100表示100%不打折
     */
    public Float getDiscount() {
        return this.Discount;
    }

    /**
     * Set 总的折扣，100表示100%不打折
     * @param Discount 总的折扣，100表示100%不打折
     */
    public void setDiscount(Float Discount) {
        this.Discount = Discount;
    }

    /**
     * Get 预付费模式下的优惠后总价, 单位: 分,例如用户享有折扣 =TotalPrice × Discount 
     * @return TotalPriceDiscount 预付费模式下的优惠后总价, 单位: 分,例如用户享有折扣 =TotalPrice × Discount
     */
    public Long getTotalPriceDiscount() {
        return this.TotalPriceDiscount;
    }

    /**
     * Set 预付费模式下的优惠后总价, 单位: 分,例如用户享有折扣 =TotalPrice × Discount
     * @param TotalPriceDiscount 预付费模式下的优惠后总价, 单位: 分,例如用户享有折扣 =TotalPrice × Discount
     */
    public void setTotalPriceDiscount(Long TotalPriceDiscount) {
        this.TotalPriceDiscount = TotalPriceDiscount;
    }

    /**
     * Get 后付费模式下的单位资源价格，不包含优惠，单位:分 
     * @return UnitPrice 后付费模式下的单位资源价格，不包含优惠，单位:分
     */
    public Long getUnitPrice() {
        return this.UnitPrice;
    }

    /**
     * Set 后付费模式下的单位资源价格，不包含优惠，单位:分
     * @param UnitPrice 后付费模式下的单位资源价格，不包含优惠，单位:分
     */
    public void setUnitPrice(Long UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    /**
     * Get 优惠后后付费模式下的单位资源价格, 单位: 分,例如用户享有折扣=UnitPricet × Discount 
     * @return UnitPriceDiscount 优惠后后付费模式下的单位资源价格, 单位: 分,例如用户享有折扣=UnitPricet × Discount
     */
    public Long getUnitPriceDiscount() {
        return this.UnitPriceDiscount;
    }

    /**
     * Set 优惠后后付费模式下的单位资源价格, 单位: 分,例如用户享有折扣=UnitPricet × Discount
     * @param UnitPriceDiscount 优惠后后付费模式下的单位资源价格, 单位: 分,例如用户享有折扣=UnitPricet × Discount
     */
    public void setUnitPriceDiscount(Long UnitPriceDiscount) {
        this.UnitPriceDiscount = UnitPriceDiscount;
    }

    /**
     * Get 计费价格单位 
     * @return ChargeUnit 计费价格单位
     */
    public String getChargeUnit() {
        return this.ChargeUnit;
    }

    /**
     * Set 计费价格单位
     * @param ChargeUnit 计费价格单位
     */
    public void setChargeUnit(String ChargeUnit) {
        this.ChargeUnit = ChargeUnit;
    }

    /**
     * Get 高精度下不包含优惠价格 
     * @return UnitPriceHighPrecision 高精度下不包含优惠价格
     */
    public String getUnitPriceHighPrecision() {
        return this.UnitPriceHighPrecision;
    }

    /**
     * Set 高精度下不包含优惠价格
     * @param UnitPriceHighPrecision 高精度下不包含优惠价格
     */
    public void setUnitPriceHighPrecision(String UnitPriceHighPrecision) {
        this.UnitPriceHighPrecision = UnitPriceHighPrecision;
    }

    /**
     * Get 高精度下优惠后价格 
     * @return UnitPriceDiscountHighPrecision 高精度下优惠后价格
     */
    public String getUnitPriceDiscountHighPrecision() {
        return this.UnitPriceDiscountHighPrecision;
    }

    /**
     * Set 高精度下优惠后价格
     * @param UnitPriceDiscountHighPrecision 高精度下优惠后价格
     */
    public void setUnitPriceDiscountHighPrecision(String UnitPriceDiscountHighPrecision) {
        this.UnitPriceDiscountHighPrecision = UnitPriceDiscountHighPrecision;
    }

    /**
     * Get 货币单位 
     * @return AmountUnit 货币单位
     */
    public String getAmountUnit() {
        return this.AmountUnit;
    }

    /**
     * Set 货币单位
     * @param AmountUnit 货币单位
     */
    public void setAmountUnit(String AmountUnit) {
        this.AmountUnit = AmountUnit;
    }

    public TradePrice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TradePrice(TradePrice source) {
        if (source.TotalPrice != null) {
            this.TotalPrice = new Long(source.TotalPrice);
        }
        if (source.Discount != null) {
            this.Discount = new Float(source.Discount);
        }
        if (source.TotalPriceDiscount != null) {
            this.TotalPriceDiscount = new Long(source.TotalPriceDiscount);
        }
        if (source.UnitPrice != null) {
            this.UnitPrice = new Long(source.UnitPrice);
        }
        if (source.UnitPriceDiscount != null) {
            this.UnitPriceDiscount = new Long(source.UnitPriceDiscount);
        }
        if (source.ChargeUnit != null) {
            this.ChargeUnit = new String(source.ChargeUnit);
        }
        if (source.UnitPriceHighPrecision != null) {
            this.UnitPriceHighPrecision = new String(source.UnitPriceHighPrecision);
        }
        if (source.UnitPriceDiscountHighPrecision != null) {
            this.UnitPriceDiscountHighPrecision = new String(source.UnitPriceDiscountHighPrecision);
        }
        if (source.AmountUnit != null) {
            this.AmountUnit = new String(source.AmountUnit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalPrice", this.TotalPrice);
        this.setParamSimple(map, prefix + "Discount", this.Discount);
        this.setParamSimple(map, prefix + "TotalPriceDiscount", this.TotalPriceDiscount);
        this.setParamSimple(map, prefix + "UnitPrice", this.UnitPrice);
        this.setParamSimple(map, prefix + "UnitPriceDiscount", this.UnitPriceDiscount);
        this.setParamSimple(map, prefix + "ChargeUnit", this.ChargeUnit);
        this.setParamSimple(map, prefix + "UnitPriceHighPrecision", this.UnitPriceHighPrecision);
        this.setParamSimple(map, prefix + "UnitPriceDiscountHighPrecision", this.UnitPriceDiscountHighPrecision);
        this.setParamSimple(map, prefix + "AmountUnit", this.AmountUnit);

    }
}

