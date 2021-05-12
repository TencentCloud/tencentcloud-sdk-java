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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrepayPrice extends AbstractModel{

    /**
    * 预付费云盘或快照预支费用的原价，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Float OriginalPrice;

    /**
    * 预付费云盘或快照预支费用的折扣价，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiscountPrice")
    @Expose
    private Float DiscountPrice;

    /**
    * 高精度预付费云盘或快照预支费用的原价，单位：元
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginalPriceHigh")
    @Expose
    private String OriginalPriceHigh;

    /**
    * 高精度预付费云盘或快照预支费用的折扣价，单位：元
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiscountPriceHigh")
    @Expose
    private String DiscountPriceHigh;

    /**
    * 后付费云盘原单价，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnitPrice")
    @Expose
    private Float UnitPrice;

    /**
    * 后付费云盘的计价单元，取值范围：<br><li>HOUR：表示后付费云盘的计价单元是按小时计算。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChargeUnit")
    @Expose
    private String ChargeUnit;

    /**
    * 后付费云盘折扣单价，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnitPriceDiscount")
    @Expose
    private Float UnitPriceDiscount;

    /**
    * 高精度后付费云盘原单价, 单位：元
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnitPriceHigh")
    @Expose
    private String UnitPriceHigh;

    /**
    * 高精度后付费云盘折扣单价, 单位：元
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnitPriceDiscountHigh")
    @Expose
    private String UnitPriceDiscountHigh;

    /**
     * Get 预付费云盘或快照预支费用的原价，单位：元。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginalPrice 预付费云盘或快照预支费用的原价，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * Set 预付费云盘或快照预支费用的原价，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginalPrice 预付费云盘或快照预支费用的原价，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginalPrice(Float OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    /**
     * Get 预付费云盘或快照预支费用的折扣价，单位：元。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiscountPrice 预付费云盘或快照预支费用的折扣价，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getDiscountPrice() {
        return this.DiscountPrice;
    }

    /**
     * Set 预付费云盘或快照预支费用的折扣价，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiscountPrice 预付费云盘或快照预支费用的折扣价，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiscountPrice(Float DiscountPrice) {
        this.DiscountPrice = DiscountPrice;
    }

    /**
     * Get 高精度预付费云盘或快照预支费用的原价，单位：元
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginalPriceHigh 高精度预付费云盘或快照预支费用的原价，单位：元
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOriginalPriceHigh() {
        return this.OriginalPriceHigh;
    }

    /**
     * Set 高精度预付费云盘或快照预支费用的原价，单位：元
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginalPriceHigh 高精度预付费云盘或快照预支费用的原价，单位：元
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginalPriceHigh(String OriginalPriceHigh) {
        this.OriginalPriceHigh = OriginalPriceHigh;
    }

    /**
     * Get 高精度预付费云盘或快照预支费用的折扣价，单位：元
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiscountPriceHigh 高精度预付费云盘或快照预支费用的折扣价，单位：元
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiscountPriceHigh() {
        return this.DiscountPriceHigh;
    }

    /**
     * Set 高精度预付费云盘或快照预支费用的折扣价，单位：元
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiscountPriceHigh 高精度预付费云盘或快照预支费用的折扣价，单位：元
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiscountPriceHigh(String DiscountPriceHigh) {
        this.DiscountPriceHigh = DiscountPriceHigh;
    }

    /**
     * Get 后付费云盘原单价，单位：元。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnitPrice 后付费云盘原单价，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getUnitPrice() {
        return this.UnitPrice;
    }

    /**
     * Set 后付费云盘原单价，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnitPrice 后付费云盘原单价，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnitPrice(Float UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    /**
     * Get 后付费云盘的计价单元，取值范围：<br><li>HOUR：表示后付费云盘的计价单元是按小时计算。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChargeUnit 后付费云盘的计价单元，取值范围：<br><li>HOUR：表示后付费云盘的计价单元是按小时计算。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChargeUnit() {
        return this.ChargeUnit;
    }

    /**
     * Set 后付费云盘的计价单元，取值范围：<br><li>HOUR：表示后付费云盘的计价单元是按小时计算。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChargeUnit 后付费云盘的计价单元，取值范围：<br><li>HOUR：表示后付费云盘的计价单元是按小时计算。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChargeUnit(String ChargeUnit) {
        this.ChargeUnit = ChargeUnit;
    }

    /**
     * Get 后付费云盘折扣单价，单位：元。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnitPriceDiscount 后付费云盘折扣单价，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getUnitPriceDiscount() {
        return this.UnitPriceDiscount;
    }

    /**
     * Set 后付费云盘折扣单价，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnitPriceDiscount 后付费云盘折扣单价，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnitPriceDiscount(Float UnitPriceDiscount) {
        this.UnitPriceDiscount = UnitPriceDiscount;
    }

    /**
     * Get 高精度后付费云盘原单价, 单位：元
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnitPriceHigh 高精度后付费云盘原单价, 单位：元
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUnitPriceHigh() {
        return this.UnitPriceHigh;
    }

    /**
     * Set 高精度后付费云盘原单价, 单位：元
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnitPriceHigh 高精度后付费云盘原单价, 单位：元
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnitPriceHigh(String UnitPriceHigh) {
        this.UnitPriceHigh = UnitPriceHigh;
    }

    /**
     * Get 高精度后付费云盘折扣单价, 单位：元
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnitPriceDiscountHigh 高精度后付费云盘折扣单价, 单位：元
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUnitPriceDiscountHigh() {
        return this.UnitPriceDiscountHigh;
    }

    /**
     * Set 高精度后付费云盘折扣单价, 单位：元
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnitPriceDiscountHigh 高精度后付费云盘折扣单价, 单位：元
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnitPriceDiscountHigh(String UnitPriceDiscountHigh) {
        this.UnitPriceDiscountHigh = UnitPriceDiscountHigh;
    }

    public PrepayPrice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrepayPrice(PrepayPrice source) {
        if (source.OriginalPrice != null) {
            this.OriginalPrice = new Float(source.OriginalPrice);
        }
        if (source.DiscountPrice != null) {
            this.DiscountPrice = new Float(source.DiscountPrice);
        }
        if (source.OriginalPriceHigh != null) {
            this.OriginalPriceHigh = new String(source.OriginalPriceHigh);
        }
        if (source.DiscountPriceHigh != null) {
            this.DiscountPriceHigh = new String(source.DiscountPriceHigh);
        }
        if (source.UnitPrice != null) {
            this.UnitPrice = new Float(source.UnitPrice);
        }
        if (source.ChargeUnit != null) {
            this.ChargeUnit = new String(source.ChargeUnit);
        }
        if (source.UnitPriceDiscount != null) {
            this.UnitPriceDiscount = new Float(source.UnitPriceDiscount);
        }
        if (source.UnitPriceHigh != null) {
            this.UnitPriceHigh = new String(source.UnitPriceHigh);
        }
        if (source.UnitPriceDiscountHigh != null) {
            this.UnitPriceDiscountHigh = new String(source.UnitPriceDiscountHigh);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OriginalPrice", this.OriginalPrice);
        this.setParamSimple(map, prefix + "DiscountPrice", this.DiscountPrice);
        this.setParamSimple(map, prefix + "OriginalPriceHigh", this.OriginalPriceHigh);
        this.setParamSimple(map, prefix + "DiscountPriceHigh", this.DiscountPriceHigh);
        this.setParamSimple(map, prefix + "UnitPrice", this.UnitPrice);
        this.setParamSimple(map, prefix + "ChargeUnit", this.ChargeUnit);
        this.setParamSimple(map, prefix + "UnitPriceDiscount", this.UnitPriceDiscount);
        this.setParamSimple(map, prefix + "UnitPriceHigh", this.UnitPriceHigh);
        this.setParamSimple(map, prefix + "UnitPriceDiscountHigh", this.UnitPriceDiscountHigh);

    }
}

