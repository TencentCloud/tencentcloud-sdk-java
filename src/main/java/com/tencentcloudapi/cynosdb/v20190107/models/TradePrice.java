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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TradePrice extends AbstractModel{

    /**
    * 预付费模式下资源总价，不包含优惠，单位:分
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalPriceDiscount")
    @Expose
    private Long TotalPriceDiscount;

    /**
    * 后付费模式下的单位资源价格，不包含优惠，单位:分
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnitPrice")
    @Expose
    private Long UnitPrice;

    /**
    * 优惠后后付费模式下的单位资源价格, 单位: 分,例如用户享有折扣=UnitPricet × Discount
注意：此字段可能返回 null，表示取不到有效值。
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
     * Get 预付费模式下资源总价，不包含优惠，单位:分
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalPrice 预付费模式下资源总价，不包含优惠，单位:分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalPrice() {
        return this.TotalPrice;
    }

    /**
     * Set 预付费模式下资源总价，不包含优惠，单位:分
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalPrice 预付费模式下资源总价，不包含优惠，单位:分
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalPriceDiscount 预付费模式下的优惠后总价, 单位: 分,例如用户享有折扣 =TotalPrice × Discount
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalPriceDiscount() {
        return this.TotalPriceDiscount;
    }

    /**
     * Set 预付费模式下的优惠后总价, 单位: 分,例如用户享有折扣 =TotalPrice × Discount
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalPriceDiscount 预付费模式下的优惠后总价, 单位: 分,例如用户享有折扣 =TotalPrice × Discount
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalPriceDiscount(Long TotalPriceDiscount) {
        this.TotalPriceDiscount = TotalPriceDiscount;
    }

    /**
     * Get 后付费模式下的单位资源价格，不包含优惠，单位:分
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnitPrice 后付费模式下的单位资源价格，不包含优惠，单位:分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUnitPrice() {
        return this.UnitPrice;
    }

    /**
     * Set 后付费模式下的单位资源价格，不包含优惠，单位:分
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnitPrice 后付费模式下的单位资源价格，不包含优惠，单位:分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnitPrice(Long UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    /**
     * Get 优惠后后付费模式下的单位资源价格, 单位: 分,例如用户享有折扣=UnitPricet × Discount
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnitPriceDiscount 优惠后后付费模式下的单位资源价格, 单位: 分,例如用户享有折扣=UnitPricet × Discount
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUnitPriceDiscount() {
        return this.UnitPriceDiscount;
    }

    /**
     * Set 优惠后后付费模式下的单位资源价格, 单位: 分,例如用户享有折扣=UnitPricet × Discount
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnitPriceDiscount 优惠后后付费模式下的单位资源价格, 单位: 分,例如用户享有折扣=UnitPricet × Discount
注意：此字段可能返回 null，表示取不到有效值。
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

    }
}

