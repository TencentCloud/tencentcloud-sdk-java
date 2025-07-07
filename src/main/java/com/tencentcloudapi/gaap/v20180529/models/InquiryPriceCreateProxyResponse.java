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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceCreateProxyResponse extends AbstractModel {

    /**
    * 通道基础费用价格，单位：元/天。
    */
    @SerializedName("ProxyDailyPrice")
    @Expose
    private Float ProxyDailyPrice;

    /**
    * 通道带宽费用梯度价格。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BandwidthUnitPrice")
    @Expose
    private BandwidthPriceGradient [] BandwidthUnitPrice;

    /**
    * 通道基础费用折扣价格，单位：元/天。
    */
    @SerializedName("DiscountProxyDailyPrice")
    @Expose
    private Float DiscountProxyDailyPrice;

    /**
    * 价格使用的货币，支持人民币，美元等。
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
    * 通道的流量费用价格，单位: 元/GB
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowUnitPrice")
    @Expose
    private Float FlowUnitPrice;

    /**
    * 通道的流量费用折扣价格，单位:元/GB
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiscountFlowUnitPrice")
    @Expose
    private Float DiscountFlowUnitPrice;

    /**
    * 精品BGP的带宽费用价格，单位: 元/Mbps/天
    */
    @SerializedName("Cn2BandwidthPrice")
    @Expose
    private Float Cn2BandwidthPrice;

    /**
    * 精品BGP的折后带宽费用价格，单位: 元/Mbps/天
    */
    @SerializedName("Cn2BandwidthPriceWithDiscount")
    @Expose
    private Float Cn2BandwidthPriceWithDiscount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 通道基础费用价格，单位：元/天。 
     * @return ProxyDailyPrice 通道基础费用价格，单位：元/天。
     */
    public Float getProxyDailyPrice() {
        return this.ProxyDailyPrice;
    }

    /**
     * Set 通道基础费用价格，单位：元/天。
     * @param ProxyDailyPrice 通道基础费用价格，单位：元/天。
     */
    public void setProxyDailyPrice(Float ProxyDailyPrice) {
        this.ProxyDailyPrice = ProxyDailyPrice;
    }

    /**
     * Get 通道带宽费用梯度价格。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BandwidthUnitPrice 通道带宽费用梯度价格。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BandwidthPriceGradient [] getBandwidthUnitPrice() {
        return this.BandwidthUnitPrice;
    }

    /**
     * Set 通道带宽费用梯度价格。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BandwidthUnitPrice 通道带宽费用梯度价格。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBandwidthUnitPrice(BandwidthPriceGradient [] BandwidthUnitPrice) {
        this.BandwidthUnitPrice = BandwidthUnitPrice;
    }

    /**
     * Get 通道基础费用折扣价格，单位：元/天。 
     * @return DiscountProxyDailyPrice 通道基础费用折扣价格，单位：元/天。
     */
    public Float getDiscountProxyDailyPrice() {
        return this.DiscountProxyDailyPrice;
    }

    /**
     * Set 通道基础费用折扣价格，单位：元/天。
     * @param DiscountProxyDailyPrice 通道基础费用折扣价格，单位：元/天。
     */
    public void setDiscountProxyDailyPrice(Float DiscountProxyDailyPrice) {
        this.DiscountProxyDailyPrice = DiscountProxyDailyPrice;
    }

    /**
     * Get 价格使用的货币，支持人民币，美元等。 
     * @return Currency 价格使用的货币，支持人民币，美元等。
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set 价格使用的货币，支持人民币，美元等。
     * @param Currency 价格使用的货币，支持人民币，美元等。
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    /**
     * Get 通道的流量费用价格，单位: 元/GB
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowUnitPrice 通道的流量费用价格，单位: 元/GB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getFlowUnitPrice() {
        return this.FlowUnitPrice;
    }

    /**
     * Set 通道的流量费用价格，单位: 元/GB
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowUnitPrice 通道的流量费用价格，单位: 元/GB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowUnitPrice(Float FlowUnitPrice) {
        this.FlowUnitPrice = FlowUnitPrice;
    }

    /**
     * Get 通道的流量费用折扣价格，单位:元/GB
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiscountFlowUnitPrice 通道的流量费用折扣价格，单位:元/GB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getDiscountFlowUnitPrice() {
        return this.DiscountFlowUnitPrice;
    }

    /**
     * Set 通道的流量费用折扣价格，单位:元/GB
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiscountFlowUnitPrice 通道的流量费用折扣价格，单位:元/GB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiscountFlowUnitPrice(Float DiscountFlowUnitPrice) {
        this.DiscountFlowUnitPrice = DiscountFlowUnitPrice;
    }

    /**
     * Get 精品BGP的带宽费用价格，单位: 元/Mbps/天 
     * @return Cn2BandwidthPrice 精品BGP的带宽费用价格，单位: 元/Mbps/天
     */
    public Float getCn2BandwidthPrice() {
        return this.Cn2BandwidthPrice;
    }

    /**
     * Set 精品BGP的带宽费用价格，单位: 元/Mbps/天
     * @param Cn2BandwidthPrice 精品BGP的带宽费用价格，单位: 元/Mbps/天
     */
    public void setCn2BandwidthPrice(Float Cn2BandwidthPrice) {
        this.Cn2BandwidthPrice = Cn2BandwidthPrice;
    }

    /**
     * Get 精品BGP的折后带宽费用价格，单位: 元/Mbps/天 
     * @return Cn2BandwidthPriceWithDiscount 精品BGP的折后带宽费用价格，单位: 元/Mbps/天
     */
    public Float getCn2BandwidthPriceWithDiscount() {
        return this.Cn2BandwidthPriceWithDiscount;
    }

    /**
     * Set 精品BGP的折后带宽费用价格，单位: 元/Mbps/天
     * @param Cn2BandwidthPriceWithDiscount 精品BGP的折后带宽费用价格，单位: 元/Mbps/天
     */
    public void setCn2BandwidthPriceWithDiscount(Float Cn2BandwidthPriceWithDiscount) {
        this.Cn2BandwidthPriceWithDiscount = Cn2BandwidthPriceWithDiscount;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public InquiryPriceCreateProxyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryPriceCreateProxyResponse(InquiryPriceCreateProxyResponse source) {
        if (source.ProxyDailyPrice != null) {
            this.ProxyDailyPrice = new Float(source.ProxyDailyPrice);
        }
        if (source.BandwidthUnitPrice != null) {
            this.BandwidthUnitPrice = new BandwidthPriceGradient[source.BandwidthUnitPrice.length];
            for (int i = 0; i < source.BandwidthUnitPrice.length; i++) {
                this.BandwidthUnitPrice[i] = new BandwidthPriceGradient(source.BandwidthUnitPrice[i]);
            }
        }
        if (source.DiscountProxyDailyPrice != null) {
            this.DiscountProxyDailyPrice = new Float(source.DiscountProxyDailyPrice);
        }
        if (source.Currency != null) {
            this.Currency = new String(source.Currency);
        }
        if (source.FlowUnitPrice != null) {
            this.FlowUnitPrice = new Float(source.FlowUnitPrice);
        }
        if (source.DiscountFlowUnitPrice != null) {
            this.DiscountFlowUnitPrice = new Float(source.DiscountFlowUnitPrice);
        }
        if (source.Cn2BandwidthPrice != null) {
            this.Cn2BandwidthPrice = new Float(source.Cn2BandwidthPrice);
        }
        if (source.Cn2BandwidthPriceWithDiscount != null) {
            this.Cn2BandwidthPriceWithDiscount = new Float(source.Cn2BandwidthPriceWithDiscount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyDailyPrice", this.ProxyDailyPrice);
        this.setParamArrayObj(map, prefix + "BandwidthUnitPrice.", this.BandwidthUnitPrice);
        this.setParamSimple(map, prefix + "DiscountProxyDailyPrice", this.DiscountProxyDailyPrice);
        this.setParamSimple(map, prefix + "Currency", this.Currency);
        this.setParamSimple(map, prefix + "FlowUnitPrice", this.FlowUnitPrice);
        this.setParamSimple(map, prefix + "DiscountFlowUnitPrice", this.DiscountFlowUnitPrice);
        this.setParamSimple(map, prefix + "Cn2BandwidthPrice", this.Cn2BandwidthPrice);
        this.setParamSimple(map, prefix + "Cn2BandwidthPriceWithDiscount", this.Cn2BandwidthPriceWithDiscount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

