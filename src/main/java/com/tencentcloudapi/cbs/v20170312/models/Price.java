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

public class Price  extends AbstractModel{

    /**
    * 预付费云盘预支费用的原价，单位：元。
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Float OriginalPrice;

    /**
    * 预付费云盘预支费用的折扣价，单位：元。
    */
    @SerializedName("DiscountPrice")
    @Expose
    private Float DiscountPrice;

    /**
    * 后付费云盘原单价，单位：元。
    */
    @SerializedName("UnitPrice")
    @Expose
    private Float UnitPrice;

    /**
    * 后付费云盘的计价单元，取值范围：<br><li>HOUR：表示后付费云盘的计价单元是按小时计算。
    */
    @SerializedName("ChargeUnit")
    @Expose
    private String ChargeUnit;

    /**
    * 后付费云盘折扣单价，单位：元。
    */
    @SerializedName("UnitPriceDiscount")
    @Expose
    private Float UnitPriceDiscount;

    /**
     * 获取预付费云盘预支费用的原价，单位：元。
     * @return OriginalPrice 预付费云盘预支费用的原价，单位：元。
     */
    public Float getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * 设置预付费云盘预支费用的原价，单位：元。
     * @param OriginalPrice 预付费云盘预支费用的原价，单位：元。
     */
    public void setOriginalPrice(Float OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    /**
     * 获取预付费云盘预支费用的折扣价，单位：元。
     * @return DiscountPrice 预付费云盘预支费用的折扣价，单位：元。
     */
    public Float getDiscountPrice() {
        return this.DiscountPrice;
    }

    /**
     * 设置预付费云盘预支费用的折扣价，单位：元。
     * @param DiscountPrice 预付费云盘预支费用的折扣价，单位：元。
     */
    public void setDiscountPrice(Float DiscountPrice) {
        this.DiscountPrice = DiscountPrice;
    }

    /**
     * 获取后付费云盘原单价，单位：元。
     * @return UnitPrice 后付费云盘原单价，单位：元。
     */
    public Float getUnitPrice() {
        return this.UnitPrice;
    }

    /**
     * 设置后付费云盘原单价，单位：元。
     * @param UnitPrice 后付费云盘原单价，单位：元。
     */
    public void setUnitPrice(Float UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    /**
     * 获取后付费云盘的计价单元，取值范围：<br><li>HOUR：表示后付费云盘的计价单元是按小时计算。
     * @return ChargeUnit 后付费云盘的计价单元，取值范围：<br><li>HOUR：表示后付费云盘的计价单元是按小时计算。
     */
    public String getChargeUnit() {
        return this.ChargeUnit;
    }

    /**
     * 设置后付费云盘的计价单元，取值范围：<br><li>HOUR：表示后付费云盘的计价单元是按小时计算。
     * @param ChargeUnit 后付费云盘的计价单元，取值范围：<br><li>HOUR：表示后付费云盘的计价单元是按小时计算。
     */
    public void setChargeUnit(String ChargeUnit) {
        this.ChargeUnit = ChargeUnit;
    }

    /**
     * 获取后付费云盘折扣单价，单位：元。
     * @return UnitPriceDiscount 后付费云盘折扣单价，单位：元。
     */
    public Float getUnitPriceDiscount() {
        return this.UnitPriceDiscount;
    }

    /**
     * 设置后付费云盘折扣单价，单位：元。
     * @param UnitPriceDiscount 后付费云盘折扣单价，单位：元。
     */
    public void setUnitPriceDiscount(Float UnitPriceDiscount) {
        this.UnitPriceDiscount = UnitPriceDiscount;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OriginalPrice", this.OriginalPrice);
        this.setParamSimple(map, prefix + "DiscountPrice", this.DiscountPrice);
        this.setParamSimple(map, prefix + "UnitPrice", this.UnitPrice);
        this.setParamSimple(map, prefix + "ChargeUnit", this.ChargeUnit);
        this.setParamSimple(map, prefix + "UnitPriceDiscount", this.UnitPriceDiscount);

    }
}

