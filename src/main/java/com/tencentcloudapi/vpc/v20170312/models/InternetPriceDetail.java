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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InternetPriceDetail extends AbstractModel {

    /**
    * 付费单价，单位：元，仅后付费价格查询返回。
    */
    @SerializedName("UnitPrice")
    @Expose
    private Float UnitPrice;

    /**
    * 折扣后的价格，单位：元。
    */
    @SerializedName("DiscountPrice")
    @Expose
    private Float DiscountPrice;

    /**
    * 计价单元，可取值范围：<ul> <li>HOUR：表示计价单元是按每小时来计算。当前涉及该计价单元的场景有：流量按小时后付费（TRAFFIC_POSTPAID_BY_HOUR）、带宽按小时后付费（BANDWIDTH_POSTPAID_BY_HOUR）。</li><li> MONTH :表示计价单元是按月来计算。当前涉及该计价单元的场景有：包月按带宽预付费（BANDWIDTH_PREPAID_BY_MONTH）。</li></ul>
    */
    @SerializedName("ChargeUnit")
    @Expose
    private String ChargeUnit;

    /**
    * 原价，单位：元，仅预付费价格查询返回。
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Float OriginalPrice;

    /**
     * Get 付费单价，单位：元，仅后付费价格查询返回。 
     * @return UnitPrice 付费单价，单位：元，仅后付费价格查询返回。
     */
    public Float getUnitPrice() {
        return this.UnitPrice;
    }

    /**
     * Set 付费单价，单位：元，仅后付费价格查询返回。
     * @param UnitPrice 付费单价，单位：元，仅后付费价格查询返回。
     */
    public void setUnitPrice(Float UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    /**
     * Get 折扣后的价格，单位：元。 
     * @return DiscountPrice 折扣后的价格，单位：元。
     */
    public Float getDiscountPrice() {
        return this.DiscountPrice;
    }

    /**
     * Set 折扣后的价格，单位：元。
     * @param DiscountPrice 折扣后的价格，单位：元。
     */
    public void setDiscountPrice(Float DiscountPrice) {
        this.DiscountPrice = DiscountPrice;
    }

    /**
     * Get 计价单元，可取值范围：<ul> <li>HOUR：表示计价单元是按每小时来计算。当前涉及该计价单元的场景有：流量按小时后付费（TRAFFIC_POSTPAID_BY_HOUR）、带宽按小时后付费（BANDWIDTH_POSTPAID_BY_HOUR）。</li><li> MONTH :表示计价单元是按月来计算。当前涉及该计价单元的场景有：包月按带宽预付费（BANDWIDTH_PREPAID_BY_MONTH）。</li></ul> 
     * @return ChargeUnit 计价单元，可取值范围：<ul> <li>HOUR：表示计价单元是按每小时来计算。当前涉及该计价单元的场景有：流量按小时后付费（TRAFFIC_POSTPAID_BY_HOUR）、带宽按小时后付费（BANDWIDTH_POSTPAID_BY_HOUR）。</li><li> MONTH :表示计价单元是按月来计算。当前涉及该计价单元的场景有：包月按带宽预付费（BANDWIDTH_PREPAID_BY_MONTH）。</li></ul>
     */
    public String getChargeUnit() {
        return this.ChargeUnit;
    }

    /**
     * Set 计价单元，可取值范围：<ul> <li>HOUR：表示计价单元是按每小时来计算。当前涉及该计价单元的场景有：流量按小时后付费（TRAFFIC_POSTPAID_BY_HOUR）、带宽按小时后付费（BANDWIDTH_POSTPAID_BY_HOUR）。</li><li> MONTH :表示计价单元是按月来计算。当前涉及该计价单元的场景有：包月按带宽预付费（BANDWIDTH_PREPAID_BY_MONTH）。</li></ul>
     * @param ChargeUnit 计价单元，可取值范围：<ul> <li>HOUR：表示计价单元是按每小时来计算。当前涉及该计价单元的场景有：流量按小时后付费（TRAFFIC_POSTPAID_BY_HOUR）、带宽按小时后付费（BANDWIDTH_POSTPAID_BY_HOUR）。</li><li> MONTH :表示计价单元是按月来计算。当前涉及该计价单元的场景有：包月按带宽预付费（BANDWIDTH_PREPAID_BY_MONTH）。</li></ul>
     */
    public void setChargeUnit(String ChargeUnit) {
        this.ChargeUnit = ChargeUnit;
    }

    /**
     * Get 原价，单位：元，仅预付费价格查询返回。 
     * @return OriginalPrice 原价，单位：元，仅预付费价格查询返回。
     */
    public Float getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * Set 原价，单位：元，仅预付费价格查询返回。
     * @param OriginalPrice 原价，单位：元，仅预付费价格查询返回。
     */
    public void setOriginalPrice(Float OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    public InternetPriceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InternetPriceDetail(InternetPriceDetail source) {
        if (source.UnitPrice != null) {
            this.UnitPrice = new Float(source.UnitPrice);
        }
        if (source.DiscountPrice != null) {
            this.DiscountPrice = new Float(source.DiscountPrice);
        }
        if (source.ChargeUnit != null) {
            this.ChargeUnit = new String(source.ChargeUnit);
        }
        if (source.OriginalPrice != null) {
            this.OriginalPrice = new Float(source.OriginalPrice);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UnitPrice", this.UnitPrice);
        this.setParamSimple(map, prefix + "DiscountPrice", this.DiscountPrice);
        this.setParamSimple(map, prefix + "ChargeUnit", this.ChargeUnit);
        this.setParamSimple(map, prefix + "OriginalPrice", this.OriginalPrice);

    }
}

