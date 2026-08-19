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
package com.tencentcloudapi.thpc.v20230321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ItemPrice extends AbstractModel {

    /**
    * 预支合计费用的原价，预付费模式使用，单位：元。	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Float OriginalPrice;

    /**
    * 预支合计费用的折扣价，预付费模式使用，单位：元。	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiscountPrice")
    @Expose
    private Float DiscountPrice;

    /**
    * 折扣，如20.0代表2折。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Discount")
    @Expose
    private Float Discount;

    /**
    * 后续合计费用的原价，后付费模式使用，单位：元。

如返回了其他时间区间项，如UnitPriceSecondStep，则本项代表时间区间在(0, 96)小时；若未返回其他时间区间项，则本项代表全时段，即(0, ∞)小时
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnitPrice")
    @Expose
    private Float UnitPrice;

    /**
    * 后续合计费用的折扣价，后付费模式使用，单位：元

如返回了其他时间区间项，如DiscountUnitPriceSecondStep，则本项代表时间区间在(0, 96)小时；若未返回其他时间区间项，则本项代表全时段，即(0, ∞)小时
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiscountUnitPrice")
    @Expose
    private Float DiscountUnitPrice;

    /**
    * 后续计价单元，后付费模式使用，可取值范围：

HOUR：表示计价单元是按每小时来计算。当前涉及该计价单元的场景有：实例按小时后付费（POSTPAID_BY_HOUR）、带宽按小时后付费（BANDWIDTH_POSTPAID_BY_HOUR）：
GB：表示计价单元是按每GB来计算。当前涉及该计价单元的场景有：流量按小时后付费（TRAFFIC_POSTPAID_BY_HOUR）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChargeUnit")
    @Expose
    private String ChargeUnit;

    /**
    * 后续合计费用的折扣价，后付费模式使用，单位：元

如返回了其他时间区间项，如UnitPriceDiscount
float，则本项代表时间区间在(0, 96)小时；若未返回其他时间区间项，则本项代表全时段，即(0, ∞)小时
    */
    @SerializedName("UnitPriceDiscount")
    @Expose
    private Float UnitPriceDiscount;

    /**
     * Get 预支合计费用的原价，预付费模式使用，单位：元。	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginalPrice 预支合计费用的原价，预付费模式使用，单位：元。	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * Set 预支合计费用的原价，预付费模式使用，单位：元。	
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginalPrice 预支合计费用的原价，预付费模式使用，单位：元。	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginalPrice(Float OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    /**
     * Get 预支合计费用的折扣价，预付费模式使用，单位：元。	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiscountPrice 预支合计费用的折扣价，预付费模式使用，单位：元。	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getDiscountPrice() {
        return this.DiscountPrice;
    }

    /**
     * Set 预支合计费用的折扣价，预付费模式使用，单位：元。	
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiscountPrice 预支合计费用的折扣价，预付费模式使用，单位：元。	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiscountPrice(Float DiscountPrice) {
        this.DiscountPrice = DiscountPrice;
    }

    /**
     * Get 折扣，如20.0代表2折。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Discount 折扣，如20.0代表2折。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getDiscount() {
        return this.Discount;
    }

    /**
     * Set 折扣，如20.0代表2折。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Discount 折扣，如20.0代表2折。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiscount(Float Discount) {
        this.Discount = Discount;
    }

    /**
     * Get 后续合计费用的原价，后付费模式使用，单位：元。

如返回了其他时间区间项，如UnitPriceSecondStep，则本项代表时间区间在(0, 96)小时；若未返回其他时间区间项，则本项代表全时段，即(0, ∞)小时
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnitPrice 后续合计费用的原价，后付费模式使用，单位：元。

如返回了其他时间区间项，如UnitPriceSecondStep，则本项代表时间区间在(0, 96)小时；若未返回其他时间区间项，则本项代表全时段，即(0, ∞)小时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getUnitPrice() {
        return this.UnitPrice;
    }

    /**
     * Set 后续合计费用的原价，后付费模式使用，单位：元。

如返回了其他时间区间项，如UnitPriceSecondStep，则本项代表时间区间在(0, 96)小时；若未返回其他时间区间项，则本项代表全时段，即(0, ∞)小时
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnitPrice 后续合计费用的原价，后付费模式使用，单位：元。

如返回了其他时间区间项，如UnitPriceSecondStep，则本项代表时间区间在(0, 96)小时；若未返回其他时间区间项，则本项代表全时段，即(0, ∞)小时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnitPrice(Float UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    /**
     * Get 后续合计费用的折扣价，后付费模式使用，单位：元

如返回了其他时间区间项，如DiscountUnitPriceSecondStep，则本项代表时间区间在(0, 96)小时；若未返回其他时间区间项，则本项代表全时段，即(0, ∞)小时
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiscountUnitPrice 后续合计费用的折扣价，后付费模式使用，单位：元

如返回了其他时间区间项，如DiscountUnitPriceSecondStep，则本项代表时间区间在(0, 96)小时；若未返回其他时间区间项，则本项代表全时段，即(0, ∞)小时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getDiscountUnitPrice() {
        return this.DiscountUnitPrice;
    }

    /**
     * Set 后续合计费用的折扣价，后付费模式使用，单位：元

如返回了其他时间区间项，如DiscountUnitPriceSecondStep，则本项代表时间区间在(0, 96)小时；若未返回其他时间区间项，则本项代表全时段，即(0, ∞)小时
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiscountUnitPrice 后续合计费用的折扣价，后付费模式使用，单位：元

如返回了其他时间区间项，如DiscountUnitPriceSecondStep，则本项代表时间区间在(0, 96)小时；若未返回其他时间区间项，则本项代表全时段，即(0, ∞)小时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiscountUnitPrice(Float DiscountUnitPrice) {
        this.DiscountUnitPrice = DiscountUnitPrice;
    }

    /**
     * Get 后续计价单元，后付费模式使用，可取值范围：

HOUR：表示计价单元是按每小时来计算。当前涉及该计价单元的场景有：实例按小时后付费（POSTPAID_BY_HOUR）、带宽按小时后付费（BANDWIDTH_POSTPAID_BY_HOUR）：
GB：表示计价单元是按每GB来计算。当前涉及该计价单元的场景有：流量按小时后付费（TRAFFIC_POSTPAID_BY_HOUR）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChargeUnit 后续计价单元，后付费模式使用，可取值范围：

HOUR：表示计价单元是按每小时来计算。当前涉及该计价单元的场景有：实例按小时后付费（POSTPAID_BY_HOUR）、带宽按小时后付费（BANDWIDTH_POSTPAID_BY_HOUR）：
GB：表示计价单元是按每GB来计算。当前涉及该计价单元的场景有：流量按小时后付费（TRAFFIC_POSTPAID_BY_HOUR）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChargeUnit() {
        return this.ChargeUnit;
    }

    /**
     * Set 后续计价单元，后付费模式使用，可取值范围：

HOUR：表示计价单元是按每小时来计算。当前涉及该计价单元的场景有：实例按小时后付费（POSTPAID_BY_HOUR）、带宽按小时后付费（BANDWIDTH_POSTPAID_BY_HOUR）：
GB：表示计价单元是按每GB来计算。当前涉及该计价单元的场景有：流量按小时后付费（TRAFFIC_POSTPAID_BY_HOUR）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChargeUnit 后续计价单元，后付费模式使用，可取值范围：

HOUR：表示计价单元是按每小时来计算。当前涉及该计价单元的场景有：实例按小时后付费（POSTPAID_BY_HOUR）、带宽按小时后付费（BANDWIDTH_POSTPAID_BY_HOUR）：
GB：表示计价单元是按每GB来计算。当前涉及该计价单元的场景有：流量按小时后付费（TRAFFIC_POSTPAID_BY_HOUR）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChargeUnit(String ChargeUnit) {
        this.ChargeUnit = ChargeUnit;
    }

    /**
     * Get 后续合计费用的折扣价，后付费模式使用，单位：元

如返回了其他时间区间项，如UnitPriceDiscount
float，则本项代表时间区间在(0, 96)小时；若未返回其他时间区间项，则本项代表全时段，即(0, ∞)小时 
     * @return UnitPriceDiscount 后续合计费用的折扣价，后付费模式使用，单位：元

如返回了其他时间区间项，如UnitPriceDiscount
float，则本项代表时间区间在(0, 96)小时；若未返回其他时间区间项，则本项代表全时段，即(0, ∞)小时
     */
    public Float getUnitPriceDiscount() {
        return this.UnitPriceDiscount;
    }

    /**
     * Set 后续合计费用的折扣价，后付费模式使用，单位：元

如返回了其他时间区间项，如UnitPriceDiscount
float，则本项代表时间区间在(0, 96)小时；若未返回其他时间区间项，则本项代表全时段，即(0, ∞)小时
     * @param UnitPriceDiscount 后续合计费用的折扣价，后付费模式使用，单位：元

如返回了其他时间区间项，如UnitPriceDiscount
float，则本项代表时间区间在(0, 96)小时；若未返回其他时间区间项，则本项代表全时段，即(0, ∞)小时
     */
    public void setUnitPriceDiscount(Float UnitPriceDiscount) {
        this.UnitPriceDiscount = UnitPriceDiscount;
    }

    public ItemPrice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ItemPrice(ItemPrice source) {
        if (source.OriginalPrice != null) {
            this.OriginalPrice = new Float(source.OriginalPrice);
        }
        if (source.DiscountPrice != null) {
            this.DiscountPrice = new Float(source.DiscountPrice);
        }
        if (source.Discount != null) {
            this.Discount = new Float(source.Discount);
        }
        if (source.UnitPrice != null) {
            this.UnitPrice = new Float(source.UnitPrice);
        }
        if (source.DiscountUnitPrice != null) {
            this.DiscountUnitPrice = new Float(source.DiscountUnitPrice);
        }
        if (source.ChargeUnit != null) {
            this.ChargeUnit = new String(source.ChargeUnit);
        }
        if (source.UnitPriceDiscount != null) {
            this.UnitPriceDiscount = new Float(source.UnitPriceDiscount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OriginalPrice", this.OriginalPrice);
        this.setParamSimple(map, prefix + "DiscountPrice", this.DiscountPrice);
        this.setParamSimple(map, prefix + "Discount", this.Discount);
        this.setParamSimple(map, prefix + "UnitPrice", this.UnitPrice);
        this.setParamSimple(map, prefix + "DiscountUnitPrice", this.DiscountUnitPrice);
        this.setParamSimple(map, prefix + "ChargeUnit", this.ChargeUnit);
        this.setParamSimple(map, prefix + "UnitPriceDiscount", this.UnitPriceDiscount);

    }
}

