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

public class InquiryBasePrice extends AbstractModel{

    /**
    * 单位原价
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnitPrice")
    @Expose
    private Float UnitPrice;

    /**
    * 折扣单位价格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnitPriceDiscount")
    @Expose
    private Float UnitPriceDiscount;

    /**
    * 合计原价
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Float OriginalPrice;

    /**
    * 折扣合计价格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiscountPrice")
    @Expose
    private Float DiscountPrice;

    /**
    * 折扣(单位是%)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Discount")
    @Expose
    private Float Discount;

    /**
    * 商品数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * 付费货币
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
    * 硬盘专用返回参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 购买时长
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * 购买时长单位("m"按月, "h"按小时)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * 购买数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
     * Get 单位原价
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnitPrice 单位原价
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getUnitPrice() {
        return this.UnitPrice;
    }

    /**
     * Set 单位原价
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnitPrice 单位原价
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnitPrice(Float UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    /**
     * Get 折扣单位价格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnitPriceDiscount 折扣单位价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getUnitPriceDiscount() {
        return this.UnitPriceDiscount;
    }

    /**
     * Set 折扣单位价格
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnitPriceDiscount 折扣单位价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnitPriceDiscount(Float UnitPriceDiscount) {
        this.UnitPriceDiscount = UnitPriceDiscount;
    }

    /**
     * Get 合计原价
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginalPrice 合计原价
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * Set 合计原价
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginalPrice 合计原价
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginalPrice(Float OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    /**
     * Get 折扣合计价格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiscountPrice 折扣合计价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getDiscountPrice() {
        return this.DiscountPrice;
    }

    /**
     * Set 折扣合计价格
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiscountPrice 折扣合计价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiscountPrice(Float DiscountPrice) {
        this.DiscountPrice = DiscountPrice;
    }

    /**
     * Get 折扣(单位是%)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Discount 折扣(单位是%)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getDiscount() {
        return this.Discount;
    }

    /**
     * Set 折扣(单位是%)
注意：此字段可能返回 null，表示取不到有效值。
     * @param Discount 折扣(单位是%)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiscount(Float Discount) {
        this.Discount = Discount;
    }

    /**
     * Get 商品数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GoodsNum 商品数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set 商品数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param GoodsNum 商品数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get 付费货币
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Currency 付费货币
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set 付费货币
注意：此字段可能返回 null，表示取不到有效值。
     * @param Currency 付费货币
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    /**
     * Get 硬盘专用返回参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskType 硬盘专用返回参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 硬盘专用返回参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskType 硬盘专用返回参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 购买时长
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeSpan 购买时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 购买时长
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeSpan 购买时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get 购买时长单位("m"按月, "h"按小时)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeUnit 购买时长单位("m"按月, "h"按小时)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set 购买时长单位("m"按月, "h"按小时)
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeUnit 购买时长单位("m"按月, "h"按小时)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get 购买数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value 购买数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set 购买数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value 购买数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    public InquiryBasePrice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryBasePrice(InquiryBasePrice source) {
        if (source.UnitPrice != null) {
            this.UnitPrice = new Float(source.UnitPrice);
        }
        if (source.UnitPriceDiscount != null) {
            this.UnitPriceDiscount = new Float(source.UnitPriceDiscount);
        }
        if (source.OriginalPrice != null) {
            this.OriginalPrice = new Float(source.OriginalPrice);
        }
        if (source.DiscountPrice != null) {
            this.DiscountPrice = new Float(source.DiscountPrice);
        }
        if (source.Discount != null) {
            this.Discount = new Float(source.Discount);
        }
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
        if (source.Currency != null) {
            this.Currency = new String(source.Currency);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.Value != null) {
            this.Value = new Long(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UnitPrice", this.UnitPrice);
        this.setParamSimple(map, prefix + "UnitPriceDiscount", this.UnitPriceDiscount);
        this.setParamSimple(map, prefix + "OriginalPrice", this.OriginalPrice);
        this.setParamSimple(map, prefix + "DiscountPrice", this.DiscountPrice);
        this.setParamSimple(map, prefix + "Discount", this.Discount);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "Currency", this.Currency);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

