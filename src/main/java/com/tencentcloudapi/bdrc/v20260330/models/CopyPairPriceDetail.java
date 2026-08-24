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

public class CopyPairPriceDetail extends AbstractModel {

    /**
    * 计费项目标识名称。取值：InstanceCount（容灾CVM实例数）、InstanceDataCapacity（容灾CVM实例数据量）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PriceName")
    @Expose
    private String PriceName;

    /**
    * 计费项目展示名称（跟随语言环境翻译）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PriceTitle")
    @Expose
    private String PriceTitle;

    /**
    * 该计费项每小时原价，单位：元
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnitPrice")
    @Expose
    private Float UnitPrice;

    /**
    * 该计费项每小时折扣价，单位：元
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnitPriceDiscount")
    @Expose
    private Float UnitPriceDiscount;

    /**
    * 该计费项的折扣，100 表示无折扣
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Discount")
    @Expose
    private Long Discount;

    /**
    * 计价单元，固定为 HOUR
    */
    @SerializedName("ChargeUnit")
    @Expose
    private String ChargeUnit;

    /**
     * Get 计费项目标识名称。取值：InstanceCount（容灾CVM实例数）、InstanceDataCapacity（容灾CVM实例数据量）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PriceName 计费项目标识名称。取值：InstanceCount（容灾CVM实例数）、InstanceDataCapacity（容灾CVM实例数据量）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPriceName() {
        return this.PriceName;
    }

    /**
     * Set 计费项目标识名称。取值：InstanceCount（容灾CVM实例数）、InstanceDataCapacity（容灾CVM实例数据量）
注意：此字段可能返回 null，表示取不到有效值。
     * @param PriceName 计费项目标识名称。取值：InstanceCount（容灾CVM实例数）、InstanceDataCapacity（容灾CVM实例数据量）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPriceName(String PriceName) {
        this.PriceName = PriceName;
    }

    /**
     * Get 计费项目展示名称（跟随语言环境翻译）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PriceTitle 计费项目展示名称（跟随语言环境翻译）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPriceTitle() {
        return this.PriceTitle;
    }

    /**
     * Set 计费项目展示名称（跟随语言环境翻译）
注意：此字段可能返回 null，表示取不到有效值。
     * @param PriceTitle 计费项目展示名称（跟随语言环境翻译）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPriceTitle(String PriceTitle) {
        this.PriceTitle = PriceTitle;
    }

    /**
     * Get 该计费项每小时原价，单位：元
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnitPrice 该计费项每小时原价，单位：元
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getUnitPrice() {
        return this.UnitPrice;
    }

    /**
     * Set 该计费项每小时原价，单位：元
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnitPrice 该计费项每小时原价，单位：元
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnitPrice(Float UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    /**
     * Get 该计费项每小时折扣价，单位：元
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnitPriceDiscount 该计费项每小时折扣价，单位：元
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getUnitPriceDiscount() {
        return this.UnitPriceDiscount;
    }

    /**
     * Set 该计费项每小时折扣价，单位：元
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnitPriceDiscount 该计费项每小时折扣价，单位：元
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnitPriceDiscount(Float UnitPriceDiscount) {
        this.UnitPriceDiscount = UnitPriceDiscount;
    }

    /**
     * Get 该计费项的折扣，100 表示无折扣
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Discount 该计费项的折扣，100 表示无折扣
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDiscount() {
        return this.Discount;
    }

    /**
     * Set 该计费项的折扣，100 表示无折扣
注意：此字段可能返回 null，表示取不到有效值。
     * @param Discount 该计费项的折扣，100 表示无折扣
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiscount(Long Discount) {
        this.Discount = Discount;
    }

    /**
     * Get 计价单元，固定为 HOUR 
     * @return ChargeUnit 计价单元，固定为 HOUR
     */
    public String getChargeUnit() {
        return this.ChargeUnit;
    }

    /**
     * Set 计价单元，固定为 HOUR
     * @param ChargeUnit 计价单元，固定为 HOUR
     */
    public void setChargeUnit(String ChargeUnit) {
        this.ChargeUnit = ChargeUnit;
    }

    public CopyPairPriceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CopyPairPriceDetail(CopyPairPriceDetail source) {
        if (source.PriceName != null) {
            this.PriceName = new String(source.PriceName);
        }
        if (source.PriceTitle != null) {
            this.PriceTitle = new String(source.PriceTitle);
        }
        if (source.UnitPrice != null) {
            this.UnitPrice = new Float(source.UnitPrice);
        }
        if (source.UnitPriceDiscount != null) {
            this.UnitPriceDiscount = new Float(source.UnitPriceDiscount);
        }
        if (source.Discount != null) {
            this.Discount = new Long(source.Discount);
        }
        if (source.ChargeUnit != null) {
            this.ChargeUnit = new String(source.ChargeUnit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PriceName", this.PriceName);
        this.setParamSimple(map, prefix + "PriceTitle", this.PriceTitle);
        this.setParamSimple(map, prefix + "UnitPrice", this.UnitPrice);
        this.setParamSimple(map, prefix + "UnitPriceDiscount", this.UnitPriceDiscount);
        this.setParamSimple(map, prefix + "Discount", this.Discount);
        this.setParamSimple(map, prefix + "ChargeUnit", this.ChargeUnit);

    }
}

