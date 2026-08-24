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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CopyPairPrice extends AbstractModel {

    /**
    * 后付费每小时原价，单位：元
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnitPrice")
    @Expose
    private Float UnitPrice;

    /**
    * 高精度后付费每小时原价，单位：元（字符串形式，避免精度丢失）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnitPriceHigh")
    @Expose
    private String UnitPriceHigh;

    /**
    * 后付费每小时折扣价，单位：元
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnitPriceDiscount")
    @Expose
    private Float UnitPriceDiscount;

    /**
    * 高精度后付费每小时折扣价，单位：元（字符串形式，避免精度丢失）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnitPriceDiscountHigh")
    @Expose
    private String UnitPriceDiscountHigh;

    /**
    * 折扣，100 表示无折扣，80 表示 8 折
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Discount")
    @Expose
    private Long Discount;

    /**
    * 计价单元，固定为 HOUR（按小时计费）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChargeUnit")
    @Expose
    private String ChargeUnit;

    /**
    * 计费项目明细列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DetailPrices")
    @Expose
    private CopyPairPriceDetail [] DetailPrices;

    /**
     * Get 后付费每小时原价，单位：元
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnitPrice 后付费每小时原价，单位：元
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getUnitPrice() {
        return this.UnitPrice;
    }

    /**
     * Set 后付费每小时原价，单位：元
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnitPrice 后付费每小时原价，单位：元
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnitPrice(Float UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    /**
     * Get 高精度后付费每小时原价，单位：元（字符串形式，避免精度丢失）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnitPriceHigh 高精度后付费每小时原价，单位：元（字符串形式，避免精度丢失）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUnitPriceHigh() {
        return this.UnitPriceHigh;
    }

    /**
     * Set 高精度后付费每小时原价，单位：元（字符串形式，避免精度丢失）
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnitPriceHigh 高精度后付费每小时原价，单位：元（字符串形式，避免精度丢失）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnitPriceHigh(String UnitPriceHigh) {
        this.UnitPriceHigh = UnitPriceHigh;
    }

    /**
     * Get 后付费每小时折扣价，单位：元
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnitPriceDiscount 后付费每小时折扣价，单位：元
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getUnitPriceDiscount() {
        return this.UnitPriceDiscount;
    }

    /**
     * Set 后付费每小时折扣价，单位：元
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnitPriceDiscount 后付费每小时折扣价，单位：元
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnitPriceDiscount(Float UnitPriceDiscount) {
        this.UnitPriceDiscount = UnitPriceDiscount;
    }

    /**
     * Get 高精度后付费每小时折扣价，单位：元（字符串形式，避免精度丢失）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnitPriceDiscountHigh 高精度后付费每小时折扣价，单位：元（字符串形式，避免精度丢失）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUnitPriceDiscountHigh() {
        return this.UnitPriceDiscountHigh;
    }

    /**
     * Set 高精度后付费每小时折扣价，单位：元（字符串形式，避免精度丢失）
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnitPriceDiscountHigh 高精度后付费每小时折扣价，单位：元（字符串形式，避免精度丢失）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnitPriceDiscountHigh(String UnitPriceDiscountHigh) {
        this.UnitPriceDiscountHigh = UnitPriceDiscountHigh;
    }

    /**
     * Get 折扣，100 表示无折扣，80 表示 8 折
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Discount 折扣，100 表示无折扣，80 表示 8 折
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDiscount() {
        return this.Discount;
    }

    /**
     * Set 折扣，100 表示无折扣，80 表示 8 折
注意：此字段可能返回 null，表示取不到有效值。
     * @param Discount 折扣，100 表示无折扣，80 表示 8 折
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiscount(Long Discount) {
        this.Discount = Discount;
    }

    /**
     * Get 计价单元，固定为 HOUR（按小时计费）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChargeUnit 计价单元，固定为 HOUR（按小时计费）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChargeUnit() {
        return this.ChargeUnit;
    }

    /**
     * Set 计价单元，固定为 HOUR（按小时计费）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChargeUnit 计价单元，固定为 HOUR（按小时计费）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChargeUnit(String ChargeUnit) {
        this.ChargeUnit = ChargeUnit;
    }

    /**
     * Get 计费项目明细列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DetailPrices 计费项目明细列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CopyPairPriceDetail [] getDetailPrices() {
        return this.DetailPrices;
    }

    /**
     * Set 计费项目明细列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param DetailPrices 计费项目明细列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetailPrices(CopyPairPriceDetail [] DetailPrices) {
        this.DetailPrices = DetailPrices;
    }

    public CopyPairPrice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CopyPairPrice(CopyPairPrice source) {
        if (source.UnitPrice != null) {
            this.UnitPrice = new Float(source.UnitPrice);
        }
        if (source.UnitPriceHigh != null) {
            this.UnitPriceHigh = new String(source.UnitPriceHigh);
        }
        if (source.UnitPriceDiscount != null) {
            this.UnitPriceDiscount = new Float(source.UnitPriceDiscount);
        }
        if (source.UnitPriceDiscountHigh != null) {
            this.UnitPriceDiscountHigh = new String(source.UnitPriceDiscountHigh);
        }
        if (source.Discount != null) {
            this.Discount = new Long(source.Discount);
        }
        if (source.ChargeUnit != null) {
            this.ChargeUnit = new String(source.ChargeUnit);
        }
        if (source.DetailPrices != null) {
            this.DetailPrices = new CopyPairPriceDetail[source.DetailPrices.length];
            for (int i = 0; i < source.DetailPrices.length; i++) {
                this.DetailPrices[i] = new CopyPairPriceDetail(source.DetailPrices[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UnitPrice", this.UnitPrice);
        this.setParamSimple(map, prefix + "UnitPriceHigh", this.UnitPriceHigh);
        this.setParamSimple(map, prefix + "UnitPriceDiscount", this.UnitPriceDiscount);
        this.setParamSimple(map, prefix + "UnitPriceDiscountHigh", this.UnitPriceDiscountHigh);
        this.setParamSimple(map, prefix + "Discount", this.Discount);
        this.setParamSimple(map, prefix + "ChargeUnit", this.ChargeUnit);
        this.setParamArrayObj(map, prefix + "DetailPrices.", this.DetailPrices);

    }
}

