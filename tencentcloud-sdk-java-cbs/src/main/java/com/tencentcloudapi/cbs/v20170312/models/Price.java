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

public class Price extends AbstractModel{

    /**
    * 预付费云盘预支费用的原价，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Float OriginalPrice;

    /**
    * 预付费云盘预支费用的折扣价，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiscountPrice")
    @Expose
    private Float DiscountPrice;

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
     * Get 预付费云盘预支费用的原价，单位：元。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginalPrice 预付费云盘预支费用的原价，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * Set 预付费云盘预支费用的原价，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginalPrice 预付费云盘预支费用的原价，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginalPrice(Float OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    /**
     * Get 预付费云盘预支费用的折扣价，单位：元。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiscountPrice 预付费云盘预支费用的折扣价，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getDiscountPrice() {
        return this.DiscountPrice;
    }

    /**
     * Set 预付费云盘预支费用的折扣价，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiscountPrice 预付费云盘预支费用的折扣价，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiscountPrice(Float DiscountPrice) {
        this.DiscountPrice = DiscountPrice;
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OriginalPrice", this.OriginalPrice);
        this.setParamSimple(map, prefix + "DiscountPrice", this.DiscountPrice);
        this.setParamSimple(map, prefix + "UnitPrice", this.UnitPrice);
        this.setParamSimple(map, prefix + "ChargeUnit", this.ChargeUnit);
        this.setParamSimple(map, prefix + "UnitPriceDiscount", this.UnitPriceDiscount);

    }
}

