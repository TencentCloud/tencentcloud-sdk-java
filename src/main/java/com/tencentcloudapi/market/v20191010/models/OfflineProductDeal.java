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
package com.tencentcloudapi.market.v20191010.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OfflineProductDeal extends AbstractModel{

    /**
    * 产品标签
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * 子产品标签
    */
    @SerializedName("SubProductCode")
    @Expose
    private String SubProductCode;

    /**
    * 计费项
    */
    @SerializedName("BillingItemCode")
    @Expose
    private String BillingItemCode;

    /**
    * 计费细项
    */
    @SerializedName("SubBillingItemCode")
    @Expose
    private String SubBillingItemCode;

    /**
    * 单价（单位：分）
    */
    @SerializedName("UnitPrice")
    @Expose
    private Float UnitPrice;

    /**
    * 用量
    */
    @SerializedName("Dosage")
    @Expose
    private Float Dosage;

    /**
    * 用量单位
    */
    @SerializedName("DosageUnit")
    @Expose
    private String DosageUnit;

    /**
    * 商品的时间大小，当TimeUnit 是package时，timeSpan 只能传1。当TimeUnit是year；month；day；hour；minute；second，传具体时长。
    */
    @SerializedName("TimeSpan")
    @Expose
    private Float TimeSpan;

    /**
    * 商品的时间单位：year:年；month:月；day:日；hour:小时；minute:分钟；second:秒; package:与价格无关,一次性购买的产品传package
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * 原价 （单位：分）OriginPrice=round(UnitPrice * Dosage * TimeSpan)
    */
    @SerializedName("OriginPrice")
    @Expose
    private Long OriginPrice;

    /**
    * 折扣百分比，传入0-100的值
    */
    @SerializedName("Discount")
    @Expose
    private Float Discount;

    /**
    * 最终扣费金额（单位：分）Fee=round(OriginPrice*Discount/100)
    */
    @SerializedName("Fee")
    @Expose
    private Long Fee;

    /**
     * Get 产品标签 
     * @return ProductCode 产品标签
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set 产品标签
     * @param ProductCode 产品标签
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get 子产品标签 
     * @return SubProductCode 子产品标签
     */
    public String getSubProductCode() {
        return this.SubProductCode;
    }

    /**
     * Set 子产品标签
     * @param SubProductCode 子产品标签
     */
    public void setSubProductCode(String SubProductCode) {
        this.SubProductCode = SubProductCode;
    }

    /**
     * Get 计费项 
     * @return BillingItemCode 计费项
     */
    public String getBillingItemCode() {
        return this.BillingItemCode;
    }

    /**
     * Set 计费项
     * @param BillingItemCode 计费项
     */
    public void setBillingItemCode(String BillingItemCode) {
        this.BillingItemCode = BillingItemCode;
    }

    /**
     * Get 计费细项 
     * @return SubBillingItemCode 计费细项
     */
    public String getSubBillingItemCode() {
        return this.SubBillingItemCode;
    }

    /**
     * Set 计费细项
     * @param SubBillingItemCode 计费细项
     */
    public void setSubBillingItemCode(String SubBillingItemCode) {
        this.SubBillingItemCode = SubBillingItemCode;
    }

    /**
     * Get 单价（单位：分） 
     * @return UnitPrice 单价（单位：分）
     */
    public Float getUnitPrice() {
        return this.UnitPrice;
    }

    /**
     * Set 单价（单位：分）
     * @param UnitPrice 单价（单位：分）
     */
    public void setUnitPrice(Float UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    /**
     * Get 用量 
     * @return Dosage 用量
     */
    public Float getDosage() {
        return this.Dosage;
    }

    /**
     * Set 用量
     * @param Dosage 用量
     */
    public void setDosage(Float Dosage) {
        this.Dosage = Dosage;
    }

    /**
     * Get 用量单位 
     * @return DosageUnit 用量单位
     */
    public String getDosageUnit() {
        return this.DosageUnit;
    }

    /**
     * Set 用量单位
     * @param DosageUnit 用量单位
     */
    public void setDosageUnit(String DosageUnit) {
        this.DosageUnit = DosageUnit;
    }

    /**
     * Get 商品的时间大小，当TimeUnit 是package时，timeSpan 只能传1。当TimeUnit是year；month；day；hour；minute；second，传具体时长。 
     * @return TimeSpan 商品的时间大小，当TimeUnit 是package时，timeSpan 只能传1。当TimeUnit是year；month；day；hour；minute；second，传具体时长。
     */
    public Float getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 商品的时间大小，当TimeUnit 是package时，timeSpan 只能传1。当TimeUnit是year；month；day；hour；minute；second，传具体时长。
     * @param TimeSpan 商品的时间大小，当TimeUnit 是package时，timeSpan 只能传1。当TimeUnit是year；month；day；hour；minute；second，传具体时长。
     */
    public void setTimeSpan(Float TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get 商品的时间单位：year:年；month:月；day:日；hour:小时；minute:分钟；second:秒; package:与价格无关,一次性购买的产品传package 
     * @return TimeUnit 商品的时间单位：year:年；month:月；day:日；hour:小时；minute:分钟；second:秒; package:与价格无关,一次性购买的产品传package
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set 商品的时间单位：year:年；month:月；day:日；hour:小时；minute:分钟；second:秒; package:与价格无关,一次性购买的产品传package
     * @param TimeUnit 商品的时间单位：year:年；month:月；day:日；hour:小时；minute:分钟；second:秒; package:与价格无关,一次性购买的产品传package
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get 原价 （单位：分）OriginPrice=round(UnitPrice * Dosage * TimeSpan) 
     * @return OriginPrice 原价 （单位：分）OriginPrice=round(UnitPrice * Dosage * TimeSpan)
     */
    public Long getOriginPrice() {
        return this.OriginPrice;
    }

    /**
     * Set 原价 （单位：分）OriginPrice=round(UnitPrice * Dosage * TimeSpan)
     * @param OriginPrice 原价 （单位：分）OriginPrice=round(UnitPrice * Dosage * TimeSpan)
     */
    public void setOriginPrice(Long OriginPrice) {
        this.OriginPrice = OriginPrice;
    }

    /**
     * Get 折扣百分比，传入0-100的值 
     * @return Discount 折扣百分比，传入0-100的值
     */
    public Float getDiscount() {
        return this.Discount;
    }

    /**
     * Set 折扣百分比，传入0-100的值
     * @param Discount 折扣百分比，传入0-100的值
     */
    public void setDiscount(Float Discount) {
        this.Discount = Discount;
    }

    /**
     * Get 最终扣费金额（单位：分）Fee=round(OriginPrice*Discount/100) 
     * @return Fee 最终扣费金额（单位：分）Fee=round(OriginPrice*Discount/100)
     */
    public Long getFee() {
        return this.Fee;
    }

    /**
     * Set 最终扣费金额（单位：分）Fee=round(OriginPrice*Discount/100)
     * @param Fee 最终扣费金额（单位：分）Fee=round(OriginPrice*Discount/100)
     */
    public void setFee(Long Fee) {
        this.Fee = Fee;
    }

    public OfflineProductDeal() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OfflineProductDeal(OfflineProductDeal source) {
        if (source.ProductCode != null) {
            this.ProductCode = new String(source.ProductCode);
        }
        if (source.SubProductCode != null) {
            this.SubProductCode = new String(source.SubProductCode);
        }
        if (source.BillingItemCode != null) {
            this.BillingItemCode = new String(source.BillingItemCode);
        }
        if (source.SubBillingItemCode != null) {
            this.SubBillingItemCode = new String(source.SubBillingItemCode);
        }
        if (source.UnitPrice != null) {
            this.UnitPrice = new Float(source.UnitPrice);
        }
        if (source.Dosage != null) {
            this.Dosage = new Float(source.Dosage);
        }
        if (source.DosageUnit != null) {
            this.DosageUnit = new String(source.DosageUnit);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Float(source.TimeSpan);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.OriginPrice != null) {
            this.OriginPrice = new Long(source.OriginPrice);
        }
        if (source.Discount != null) {
            this.Discount = new Float(source.Discount);
        }
        if (source.Fee != null) {
            this.Fee = new Long(source.Fee);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductCode", this.ProductCode);
        this.setParamSimple(map, prefix + "SubProductCode", this.SubProductCode);
        this.setParamSimple(map, prefix + "BillingItemCode", this.BillingItemCode);
        this.setParamSimple(map, prefix + "SubBillingItemCode", this.SubBillingItemCode);
        this.setParamSimple(map, prefix + "UnitPrice", this.UnitPrice);
        this.setParamSimple(map, prefix + "Dosage", this.Dosage);
        this.setParamSimple(map, prefix + "DosageUnit", this.DosageUnit);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "OriginPrice", this.OriginPrice);
        this.setParamSimple(map, prefix + "Discount", this.Discount);
        this.setParamSimple(map, prefix + "Fee", this.Fee);

    }
}

