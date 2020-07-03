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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ItemPrice extends AbstractModel{

    /**
    * 按量计费后付费单价，单位：元。
    */
    @SerializedName("UnitPrice")
    @Expose
    private Float UnitPrice;

    /**
    * 按量计费后付费计价单元，可取值范围： HOUR：表示计价单元是按每小时来计算。当前涉及该计价单元的场景有：实例按小时后付费（POSTPAID_BY_HOUR）、带宽按小时后付费（BANDWIDTH_POSTPAID_BY_HOUR）： GB：表示计价单元是按每GB来计算。当前涉及该计价单元的场景有：流量按小时后付费（TRAFFIC_POSTPAID_BY_HOUR）。
    */
    @SerializedName("ChargeUnit")
    @Expose
    private String ChargeUnit;

    /**
    * 预付费商品的原价，单位：元。
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Float OriginalPrice;

    /**
    * 预付费商品的折扣价，单位：元。
    */
    @SerializedName("DiscountPrice")
    @Expose
    private Float DiscountPrice;

    /**
     * Get 按量计费后付费单价，单位：元。 
     * @return UnitPrice 按量计费后付费单价，单位：元。
     */
    public Float getUnitPrice() {
        return this.UnitPrice;
    }

    /**
     * Set 按量计费后付费单价，单位：元。
     * @param UnitPrice 按量计费后付费单价，单位：元。
     */
    public void setUnitPrice(Float UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    /**
     * Get 按量计费后付费计价单元，可取值范围： HOUR：表示计价单元是按每小时来计算。当前涉及该计价单元的场景有：实例按小时后付费（POSTPAID_BY_HOUR）、带宽按小时后付费（BANDWIDTH_POSTPAID_BY_HOUR）： GB：表示计价单元是按每GB来计算。当前涉及该计价单元的场景有：流量按小时后付费（TRAFFIC_POSTPAID_BY_HOUR）。 
     * @return ChargeUnit 按量计费后付费计价单元，可取值范围： HOUR：表示计价单元是按每小时来计算。当前涉及该计价单元的场景有：实例按小时后付费（POSTPAID_BY_HOUR）、带宽按小时后付费（BANDWIDTH_POSTPAID_BY_HOUR）： GB：表示计价单元是按每GB来计算。当前涉及该计价单元的场景有：流量按小时后付费（TRAFFIC_POSTPAID_BY_HOUR）。
     */
    public String getChargeUnit() {
        return this.ChargeUnit;
    }

    /**
     * Set 按量计费后付费计价单元，可取值范围： HOUR：表示计价单元是按每小时来计算。当前涉及该计价单元的场景有：实例按小时后付费（POSTPAID_BY_HOUR）、带宽按小时后付费（BANDWIDTH_POSTPAID_BY_HOUR）： GB：表示计价单元是按每GB来计算。当前涉及该计价单元的场景有：流量按小时后付费（TRAFFIC_POSTPAID_BY_HOUR）。
     * @param ChargeUnit 按量计费后付费计价单元，可取值范围： HOUR：表示计价单元是按每小时来计算。当前涉及该计价单元的场景有：实例按小时后付费（POSTPAID_BY_HOUR）、带宽按小时后付费（BANDWIDTH_POSTPAID_BY_HOUR）： GB：表示计价单元是按每GB来计算。当前涉及该计价单元的场景有：流量按小时后付费（TRAFFIC_POSTPAID_BY_HOUR）。
     */
    public void setChargeUnit(String ChargeUnit) {
        this.ChargeUnit = ChargeUnit;
    }

    /**
     * Get 预付费商品的原价，单位：元。 
     * @return OriginalPrice 预付费商品的原价，单位：元。
     */
    public Float getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * Set 预付费商品的原价，单位：元。
     * @param OriginalPrice 预付费商品的原价，单位：元。
     */
    public void setOriginalPrice(Float OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    /**
     * Get 预付费商品的折扣价，单位：元。 
     * @return DiscountPrice 预付费商品的折扣价，单位：元。
     */
    public Float getDiscountPrice() {
        return this.DiscountPrice;
    }

    /**
     * Set 预付费商品的折扣价，单位：元。
     * @param DiscountPrice 预付费商品的折扣价，单位：元。
     */
    public void setDiscountPrice(Float DiscountPrice) {
        this.DiscountPrice = DiscountPrice;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UnitPrice", this.UnitPrice);
        this.setParamSimple(map, prefix + "ChargeUnit", this.ChargeUnit);
        this.setParamSimple(map, prefix + "OriginalPrice", this.OriginalPrice);
        this.setParamSimple(map, prefix + "DiscountPrice", this.DiscountPrice);

    }
}

