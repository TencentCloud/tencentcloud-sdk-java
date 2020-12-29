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
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Float OriginalPrice;

    /**
    * 预付费云盘或快照预支费用的折扣价，单位：元。
    */
    @SerializedName("DiscountPrice")
    @Expose
    private Float DiscountPrice;

    /**
    * 高精度预付费云盘或快照预支费用的原价，单位：元
    */
    @SerializedName("OriginalPriceHigh")
    @Expose
    private String OriginalPriceHigh;

    /**
    * 高精度预付费云盘或快照预支费用的折扣价，单位：元
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
    private String UnitPrice;

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
    private String UnitPriceDiscount;

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
     * @return OriginalPrice 预付费云盘或快照预支费用的原价，单位：元。
     */
    public Float getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * Set 预付费云盘或快照预支费用的原价，单位：元。
     * @param OriginalPrice 预付费云盘或快照预支费用的原价，单位：元。
     */
    public void setOriginalPrice(Float OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    /**
     * Get 预付费云盘或快照预支费用的折扣价，单位：元。 
     * @return DiscountPrice 预付费云盘或快照预支费用的折扣价，单位：元。
     */
    public Float getDiscountPrice() {
        return this.DiscountPrice;
    }

    /**
     * Set 预付费云盘或快照预支费用的折扣价，单位：元。
     * @param DiscountPrice 预付费云盘或快照预支费用的折扣价，单位：元。
     */
    public void setDiscountPrice(Float DiscountPrice) {
        this.DiscountPrice = DiscountPrice;
    }

    /**
     * Get 高精度预付费云盘或快照预支费用的原价，单位：元 
     * @return OriginalPriceHigh 高精度预付费云盘或快照预支费用的原价，单位：元
     */
    public String getOriginalPriceHigh() {
        return this.OriginalPriceHigh;
    }

    /**
     * Set 高精度预付费云盘或快照预支费用的原价，单位：元
     * @param OriginalPriceHigh 高精度预付费云盘或快照预支费用的原价，单位：元
     */
    public void setOriginalPriceHigh(String OriginalPriceHigh) {
        this.OriginalPriceHigh = OriginalPriceHigh;
    }

    /**
     * Get 高精度预付费云盘或快照预支费用的折扣价，单位：元 
     * @return DiscountPriceHigh 高精度预付费云盘或快照预支费用的折扣价，单位：元
     */
    public String getDiscountPriceHigh() {
        return this.DiscountPriceHigh;
    }

    /**
     * Set 高精度预付费云盘或快照预支费用的折扣价，单位：元
     * @param DiscountPriceHigh 高精度预付费云盘或快照预支费用的折扣价，单位：元
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
    public String getUnitPrice() {
        return this.UnitPrice;
    }

    /**
     * Set 后付费云盘原单价，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnitPrice 后付费云盘原单价，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnitPrice(String UnitPrice) {
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
    public String getUnitPriceDiscount() {
        return this.UnitPriceDiscount;
    }

    /**
     * Set 后付费云盘折扣单价，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnitPriceDiscount 后付费云盘折扣单价，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnitPriceDiscount(String UnitPriceDiscount) {
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

