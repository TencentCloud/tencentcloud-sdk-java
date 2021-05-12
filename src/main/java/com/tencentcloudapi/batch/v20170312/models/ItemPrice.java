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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ItemPrice extends AbstractModel{

    /**
    * 后续合计费用的原价，后付费模式使用，单位：元。<br><li>如返回了其他时间区间项，如UnitPriceSecondStep，则本项代表时间区间在(0, 96)小时；若未返回其他时间区间项，则本项代表全时段，即(0, ∞)小时
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnitPrice")
    @Expose
    private Float UnitPrice;

    /**
    * 后续计价单元，后付费模式使用，可取值范围： <br><li>HOUR：表示计价单元是按每小时来计算。当前涉及该计价单元的场景有：实例按小时后付费（POSTPAID_BY_HOUR）、带宽按小时后付费（BANDWIDTH_POSTPAID_BY_HOUR）：<br><li>GB：表示计价单元是按每GB来计算。当前涉及该计价单元的场景有：流量按小时后付费（TRAFFIC_POSTPAID_BY_HOUR）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChargeUnit")
    @Expose
    private String ChargeUnit;

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
    * 后续合计费用的折扣价，后付费模式使用，单位：元<br><li>如返回了其他时间区间项，如UnitPriceDiscountSecondStep，则本项代表时间区间在(0, 96)小时；若未返回其他时间区间项，则本项代表全时段，即(0, ∞)小时
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnitPriceDiscount")
    @Expose
    private Float UnitPriceDiscount;

    /**
    * 使用时间区间在(96, 360)小时的后续合计费用的原价，后付费模式使用，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnitPriceSecondStep")
    @Expose
    private Float UnitPriceSecondStep;

    /**
    * 使用时间区间在(96, 360)小时的后续合计费用的折扣价，后付费模式使用，单位：元
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnitPriceDiscountSecondStep")
    @Expose
    private Float UnitPriceDiscountSecondStep;

    /**
    * 使用时间区间在(360, ∞)小时的后续合计费用的原价，后付费模式使用，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnitPriceThirdStep")
    @Expose
    private Float UnitPriceThirdStep;

    /**
    * 使用时间区间在(360, ∞)小时的后续合计费用的折扣价，后付费模式使用，单位：元
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnitPriceDiscountThirdStep")
    @Expose
    private Float UnitPriceDiscountThirdStep;

    /**
    * 预支三年合计费用的原价，预付费模式使用，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginalPriceThreeYear")
    @Expose
    private Float OriginalPriceThreeYear;

    /**
    * 预支三年合计费用的折扣价，预付费模式使用，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiscountPriceThreeYear")
    @Expose
    private Float DiscountPriceThreeYear;

    /**
    * 预支三年应用的折扣，如20.0代表2折。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiscountThreeYear")
    @Expose
    private Float DiscountThreeYear;

    /**
    * 预支五年合计费用的原价，预付费模式使用，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginalPriceFiveYear")
    @Expose
    private Float OriginalPriceFiveYear;

    /**
    * 预支五年合计费用的折扣价，预付费模式使用，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiscountPriceFiveYear")
    @Expose
    private Float DiscountPriceFiveYear;

    /**
    * 预支五年应用的折扣，如20.0代表2折。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiscountFiveYear")
    @Expose
    private Float DiscountFiveYear;

    /**
    * 预支一年合计费用的原价，预付费模式使用，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginalPriceOneYear")
    @Expose
    private Float OriginalPriceOneYear;

    /**
    * 预支一年合计费用的折扣价，预付费模式使用，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiscountPriceOneYear")
    @Expose
    private Float DiscountPriceOneYear;

    /**
    * 预支一年应用的折扣，如20.0代表2折。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiscountOneYear")
    @Expose
    private Float DiscountOneYear;

    /**
     * Get 后续合计费用的原价，后付费模式使用，单位：元。<br><li>如返回了其他时间区间项，如UnitPriceSecondStep，则本项代表时间区间在(0, 96)小时；若未返回其他时间区间项，则本项代表全时段，即(0, ∞)小时
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnitPrice 后续合计费用的原价，后付费模式使用，单位：元。<br><li>如返回了其他时间区间项，如UnitPriceSecondStep，则本项代表时间区间在(0, 96)小时；若未返回其他时间区间项，则本项代表全时段，即(0, ∞)小时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getUnitPrice() {
        return this.UnitPrice;
    }

    /**
     * Set 后续合计费用的原价，后付费模式使用，单位：元。<br><li>如返回了其他时间区间项，如UnitPriceSecondStep，则本项代表时间区间在(0, 96)小时；若未返回其他时间区间项，则本项代表全时段，即(0, ∞)小时
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnitPrice 后续合计费用的原价，后付费模式使用，单位：元。<br><li>如返回了其他时间区间项，如UnitPriceSecondStep，则本项代表时间区间在(0, 96)小时；若未返回其他时间区间项，则本项代表全时段，即(0, ∞)小时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnitPrice(Float UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    /**
     * Get 后续计价单元，后付费模式使用，可取值范围： <br><li>HOUR：表示计价单元是按每小时来计算。当前涉及该计价单元的场景有：实例按小时后付费（POSTPAID_BY_HOUR）、带宽按小时后付费（BANDWIDTH_POSTPAID_BY_HOUR）：<br><li>GB：表示计价单元是按每GB来计算。当前涉及该计价单元的场景有：流量按小时后付费（TRAFFIC_POSTPAID_BY_HOUR）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChargeUnit 后续计价单元，后付费模式使用，可取值范围： <br><li>HOUR：表示计价单元是按每小时来计算。当前涉及该计价单元的场景有：实例按小时后付费（POSTPAID_BY_HOUR）、带宽按小时后付费（BANDWIDTH_POSTPAID_BY_HOUR）：<br><li>GB：表示计价单元是按每GB来计算。当前涉及该计价单元的场景有：流量按小时后付费（TRAFFIC_POSTPAID_BY_HOUR）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChargeUnit() {
        return this.ChargeUnit;
    }

    /**
     * Set 后续计价单元，后付费模式使用，可取值范围： <br><li>HOUR：表示计价单元是按每小时来计算。当前涉及该计价单元的场景有：实例按小时后付费（POSTPAID_BY_HOUR）、带宽按小时后付费（BANDWIDTH_POSTPAID_BY_HOUR）：<br><li>GB：表示计价单元是按每GB来计算。当前涉及该计价单元的场景有：流量按小时后付费（TRAFFIC_POSTPAID_BY_HOUR）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChargeUnit 后续计价单元，后付费模式使用，可取值范围： <br><li>HOUR：表示计价单元是按每小时来计算。当前涉及该计价单元的场景有：实例按小时后付费（POSTPAID_BY_HOUR）、带宽按小时后付费（BANDWIDTH_POSTPAID_BY_HOUR）：<br><li>GB：表示计价单元是按每GB来计算。当前涉及该计价单元的场景有：流量按小时后付费（TRAFFIC_POSTPAID_BY_HOUR）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChargeUnit(String ChargeUnit) {
        this.ChargeUnit = ChargeUnit;
    }

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
     * Get 后续合计费用的折扣价，后付费模式使用，单位：元<br><li>如返回了其他时间区间项，如UnitPriceDiscountSecondStep，则本项代表时间区间在(0, 96)小时；若未返回其他时间区间项，则本项代表全时段，即(0, ∞)小时
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnitPriceDiscount 后续合计费用的折扣价，后付费模式使用，单位：元<br><li>如返回了其他时间区间项，如UnitPriceDiscountSecondStep，则本项代表时间区间在(0, 96)小时；若未返回其他时间区间项，则本项代表全时段，即(0, ∞)小时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getUnitPriceDiscount() {
        return this.UnitPriceDiscount;
    }

    /**
     * Set 后续合计费用的折扣价，后付费模式使用，单位：元<br><li>如返回了其他时间区间项，如UnitPriceDiscountSecondStep，则本项代表时间区间在(0, 96)小时；若未返回其他时间区间项，则本项代表全时段，即(0, ∞)小时
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnitPriceDiscount 后续合计费用的折扣价，后付费模式使用，单位：元<br><li>如返回了其他时间区间项，如UnitPriceDiscountSecondStep，则本项代表时间区间在(0, 96)小时；若未返回其他时间区间项，则本项代表全时段，即(0, ∞)小时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnitPriceDiscount(Float UnitPriceDiscount) {
        this.UnitPriceDiscount = UnitPriceDiscount;
    }

    /**
     * Get 使用时间区间在(96, 360)小时的后续合计费用的原价，后付费模式使用，单位：元。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnitPriceSecondStep 使用时间区间在(96, 360)小时的后续合计费用的原价，后付费模式使用，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getUnitPriceSecondStep() {
        return this.UnitPriceSecondStep;
    }

    /**
     * Set 使用时间区间在(96, 360)小时的后续合计费用的原价，后付费模式使用，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnitPriceSecondStep 使用时间区间在(96, 360)小时的后续合计费用的原价，后付费模式使用，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnitPriceSecondStep(Float UnitPriceSecondStep) {
        this.UnitPriceSecondStep = UnitPriceSecondStep;
    }

    /**
     * Get 使用时间区间在(96, 360)小时的后续合计费用的折扣价，后付费模式使用，单位：元
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnitPriceDiscountSecondStep 使用时间区间在(96, 360)小时的后续合计费用的折扣价，后付费模式使用，单位：元
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getUnitPriceDiscountSecondStep() {
        return this.UnitPriceDiscountSecondStep;
    }

    /**
     * Set 使用时间区间在(96, 360)小时的后续合计费用的折扣价，后付费模式使用，单位：元
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnitPriceDiscountSecondStep 使用时间区间在(96, 360)小时的后续合计费用的折扣价，后付费模式使用，单位：元
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnitPriceDiscountSecondStep(Float UnitPriceDiscountSecondStep) {
        this.UnitPriceDiscountSecondStep = UnitPriceDiscountSecondStep;
    }

    /**
     * Get 使用时间区间在(360, ∞)小时的后续合计费用的原价，后付费模式使用，单位：元。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnitPriceThirdStep 使用时间区间在(360, ∞)小时的后续合计费用的原价，后付费模式使用，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getUnitPriceThirdStep() {
        return this.UnitPriceThirdStep;
    }

    /**
     * Set 使用时间区间在(360, ∞)小时的后续合计费用的原价，后付费模式使用，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnitPriceThirdStep 使用时间区间在(360, ∞)小时的后续合计费用的原价，后付费模式使用，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnitPriceThirdStep(Float UnitPriceThirdStep) {
        this.UnitPriceThirdStep = UnitPriceThirdStep;
    }

    /**
     * Get 使用时间区间在(360, ∞)小时的后续合计费用的折扣价，后付费模式使用，单位：元
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnitPriceDiscountThirdStep 使用时间区间在(360, ∞)小时的后续合计费用的折扣价，后付费模式使用，单位：元
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getUnitPriceDiscountThirdStep() {
        return this.UnitPriceDiscountThirdStep;
    }

    /**
     * Set 使用时间区间在(360, ∞)小时的后续合计费用的折扣价，后付费模式使用，单位：元
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnitPriceDiscountThirdStep 使用时间区间在(360, ∞)小时的后续合计费用的折扣价，后付费模式使用，单位：元
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnitPriceDiscountThirdStep(Float UnitPriceDiscountThirdStep) {
        this.UnitPriceDiscountThirdStep = UnitPriceDiscountThirdStep;
    }

    /**
     * Get 预支三年合计费用的原价，预付费模式使用，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginalPriceThreeYear 预支三年合计费用的原价，预付费模式使用，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getOriginalPriceThreeYear() {
        return this.OriginalPriceThreeYear;
    }

    /**
     * Set 预支三年合计费用的原价，预付费模式使用，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginalPriceThreeYear 预支三年合计费用的原价，预付费模式使用，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginalPriceThreeYear(Float OriginalPriceThreeYear) {
        this.OriginalPriceThreeYear = OriginalPriceThreeYear;
    }

    /**
     * Get 预支三年合计费用的折扣价，预付费模式使用，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiscountPriceThreeYear 预支三年合计费用的折扣价，预付费模式使用，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getDiscountPriceThreeYear() {
        return this.DiscountPriceThreeYear;
    }

    /**
     * Set 预支三年合计费用的折扣价，预付费模式使用，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiscountPriceThreeYear 预支三年合计费用的折扣价，预付费模式使用，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiscountPriceThreeYear(Float DiscountPriceThreeYear) {
        this.DiscountPriceThreeYear = DiscountPriceThreeYear;
    }

    /**
     * Get 预支三年应用的折扣，如20.0代表2折。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiscountThreeYear 预支三年应用的折扣，如20.0代表2折。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getDiscountThreeYear() {
        return this.DiscountThreeYear;
    }

    /**
     * Set 预支三年应用的折扣，如20.0代表2折。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiscountThreeYear 预支三年应用的折扣，如20.0代表2折。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiscountThreeYear(Float DiscountThreeYear) {
        this.DiscountThreeYear = DiscountThreeYear;
    }

    /**
     * Get 预支五年合计费用的原价，预付费模式使用，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginalPriceFiveYear 预支五年合计费用的原价，预付费模式使用，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getOriginalPriceFiveYear() {
        return this.OriginalPriceFiveYear;
    }

    /**
     * Set 预支五年合计费用的原价，预付费模式使用，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginalPriceFiveYear 预支五年合计费用的原价，预付费模式使用，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginalPriceFiveYear(Float OriginalPriceFiveYear) {
        this.OriginalPriceFiveYear = OriginalPriceFiveYear;
    }

    /**
     * Get 预支五年合计费用的折扣价，预付费模式使用，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiscountPriceFiveYear 预支五年合计费用的折扣价，预付费模式使用，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getDiscountPriceFiveYear() {
        return this.DiscountPriceFiveYear;
    }

    /**
     * Set 预支五年合计费用的折扣价，预付费模式使用，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiscountPriceFiveYear 预支五年合计费用的折扣价，预付费模式使用，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiscountPriceFiveYear(Float DiscountPriceFiveYear) {
        this.DiscountPriceFiveYear = DiscountPriceFiveYear;
    }

    /**
     * Get 预支五年应用的折扣，如20.0代表2折。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiscountFiveYear 预支五年应用的折扣，如20.0代表2折。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getDiscountFiveYear() {
        return this.DiscountFiveYear;
    }

    /**
     * Set 预支五年应用的折扣，如20.0代表2折。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiscountFiveYear 预支五年应用的折扣，如20.0代表2折。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiscountFiveYear(Float DiscountFiveYear) {
        this.DiscountFiveYear = DiscountFiveYear;
    }

    /**
     * Get 预支一年合计费用的原价，预付费模式使用，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginalPriceOneYear 预支一年合计费用的原价，预付费模式使用，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getOriginalPriceOneYear() {
        return this.OriginalPriceOneYear;
    }

    /**
     * Set 预支一年合计费用的原价，预付费模式使用，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginalPriceOneYear 预支一年合计费用的原价，预付费模式使用，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginalPriceOneYear(Float OriginalPriceOneYear) {
        this.OriginalPriceOneYear = OriginalPriceOneYear;
    }

    /**
     * Get 预支一年合计费用的折扣价，预付费模式使用，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiscountPriceOneYear 预支一年合计费用的折扣价，预付费模式使用，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getDiscountPriceOneYear() {
        return this.DiscountPriceOneYear;
    }

    /**
     * Set 预支一年合计费用的折扣价，预付费模式使用，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiscountPriceOneYear 预支一年合计费用的折扣价，预付费模式使用，单位：元。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiscountPriceOneYear(Float DiscountPriceOneYear) {
        this.DiscountPriceOneYear = DiscountPriceOneYear;
    }

    /**
     * Get 预支一年应用的折扣，如20.0代表2折。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiscountOneYear 预支一年应用的折扣，如20.0代表2折。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getDiscountOneYear() {
        return this.DiscountOneYear;
    }

    /**
     * Set 预支一年应用的折扣，如20.0代表2折。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiscountOneYear 预支一年应用的折扣，如20.0代表2折。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiscountOneYear(Float DiscountOneYear) {
        this.DiscountOneYear = DiscountOneYear;
    }

    public ItemPrice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ItemPrice(ItemPrice source) {
        if (source.UnitPrice != null) {
            this.UnitPrice = new Float(source.UnitPrice);
        }
        if (source.ChargeUnit != null) {
            this.ChargeUnit = new String(source.ChargeUnit);
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
        if (source.UnitPriceDiscount != null) {
            this.UnitPriceDiscount = new Float(source.UnitPriceDiscount);
        }
        if (source.UnitPriceSecondStep != null) {
            this.UnitPriceSecondStep = new Float(source.UnitPriceSecondStep);
        }
        if (source.UnitPriceDiscountSecondStep != null) {
            this.UnitPriceDiscountSecondStep = new Float(source.UnitPriceDiscountSecondStep);
        }
        if (source.UnitPriceThirdStep != null) {
            this.UnitPriceThirdStep = new Float(source.UnitPriceThirdStep);
        }
        if (source.UnitPriceDiscountThirdStep != null) {
            this.UnitPriceDiscountThirdStep = new Float(source.UnitPriceDiscountThirdStep);
        }
        if (source.OriginalPriceThreeYear != null) {
            this.OriginalPriceThreeYear = new Float(source.OriginalPriceThreeYear);
        }
        if (source.DiscountPriceThreeYear != null) {
            this.DiscountPriceThreeYear = new Float(source.DiscountPriceThreeYear);
        }
        if (source.DiscountThreeYear != null) {
            this.DiscountThreeYear = new Float(source.DiscountThreeYear);
        }
        if (source.OriginalPriceFiveYear != null) {
            this.OriginalPriceFiveYear = new Float(source.OriginalPriceFiveYear);
        }
        if (source.DiscountPriceFiveYear != null) {
            this.DiscountPriceFiveYear = new Float(source.DiscountPriceFiveYear);
        }
        if (source.DiscountFiveYear != null) {
            this.DiscountFiveYear = new Float(source.DiscountFiveYear);
        }
        if (source.OriginalPriceOneYear != null) {
            this.OriginalPriceOneYear = new Float(source.OriginalPriceOneYear);
        }
        if (source.DiscountPriceOneYear != null) {
            this.DiscountPriceOneYear = new Float(source.DiscountPriceOneYear);
        }
        if (source.DiscountOneYear != null) {
            this.DiscountOneYear = new Float(source.DiscountOneYear);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UnitPrice", this.UnitPrice);
        this.setParamSimple(map, prefix + "ChargeUnit", this.ChargeUnit);
        this.setParamSimple(map, prefix + "OriginalPrice", this.OriginalPrice);
        this.setParamSimple(map, prefix + "DiscountPrice", this.DiscountPrice);
        this.setParamSimple(map, prefix + "Discount", this.Discount);
        this.setParamSimple(map, prefix + "UnitPriceDiscount", this.UnitPriceDiscount);
        this.setParamSimple(map, prefix + "UnitPriceSecondStep", this.UnitPriceSecondStep);
        this.setParamSimple(map, prefix + "UnitPriceDiscountSecondStep", this.UnitPriceDiscountSecondStep);
        this.setParamSimple(map, prefix + "UnitPriceThirdStep", this.UnitPriceThirdStep);
        this.setParamSimple(map, prefix + "UnitPriceDiscountThirdStep", this.UnitPriceDiscountThirdStep);
        this.setParamSimple(map, prefix + "OriginalPriceThreeYear", this.OriginalPriceThreeYear);
        this.setParamSimple(map, prefix + "DiscountPriceThreeYear", this.DiscountPriceThreeYear);
        this.setParamSimple(map, prefix + "DiscountThreeYear", this.DiscountThreeYear);
        this.setParamSimple(map, prefix + "OriginalPriceFiveYear", this.OriginalPriceFiveYear);
        this.setParamSimple(map, prefix + "DiscountPriceFiveYear", this.DiscountPriceFiveYear);
        this.setParamSimple(map, prefix + "DiscountFiveYear", this.DiscountFiveYear);
        this.setParamSimple(map, prefix + "OriginalPriceOneYear", this.OriginalPriceOneYear);
        this.setParamSimple(map, prefix + "DiscountPriceOneYear", this.DiscountPriceOneYear);
        this.setParamSimple(map, prefix + "DiscountOneYear", this.DiscountOneYear);

    }
}

