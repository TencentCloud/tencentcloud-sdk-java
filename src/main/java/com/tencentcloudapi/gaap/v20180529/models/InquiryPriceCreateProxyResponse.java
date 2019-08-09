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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceCreateProxyResponse  extends AbstractModel{

    /**
    * 通道基础费用价格，单位：元/天。
    */
    @SerializedName("ProxyDailyPrice")
    @Expose
    private Float ProxyDailyPrice;

    /**
    * 通道带宽费用梯度价格。
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
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取通道基础费用价格，单位：元/天。
     * @return ProxyDailyPrice 通道基础费用价格，单位：元/天。
     */
    public Float getProxyDailyPrice() {
        return this.ProxyDailyPrice;
    }

    /**
     * 设置通道基础费用价格，单位：元/天。
     * @param ProxyDailyPrice 通道基础费用价格，单位：元/天。
     */
    public void setProxyDailyPrice(Float ProxyDailyPrice) {
        this.ProxyDailyPrice = ProxyDailyPrice;
    }

    /**
     * 获取通道带宽费用梯度价格。
     * @return BandwidthUnitPrice 通道带宽费用梯度价格。
     */
    public BandwidthPriceGradient [] getBandwidthUnitPrice() {
        return this.BandwidthUnitPrice;
    }

    /**
     * 设置通道带宽费用梯度价格。
     * @param BandwidthUnitPrice 通道带宽费用梯度价格。
     */
    public void setBandwidthUnitPrice(BandwidthPriceGradient [] BandwidthUnitPrice) {
        this.BandwidthUnitPrice = BandwidthUnitPrice;
    }

    /**
     * 获取通道基础费用折扣价格，单位：元/天。
     * @return DiscountProxyDailyPrice 通道基础费用折扣价格，单位：元/天。
     */
    public Float getDiscountProxyDailyPrice() {
        return this.DiscountProxyDailyPrice;
    }

    /**
     * 设置通道基础费用折扣价格，单位：元/天。
     * @param DiscountProxyDailyPrice 通道基础费用折扣价格，单位：元/天。
     */
    public void setDiscountProxyDailyPrice(Float DiscountProxyDailyPrice) {
        this.DiscountProxyDailyPrice = DiscountProxyDailyPrice;
    }

    /**
     * 获取价格使用的货币，支持人民币，美元等。
     * @return Currency 价格使用的货币，支持人民币，美元等。
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * 设置价格使用的货币，支持人民币，美元等。
     * @param Currency 价格使用的货币，支持人民币，美元等。
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyDailyPrice", this.ProxyDailyPrice);
        this.setParamArrayObj(map, prefix + "BandwidthUnitPrice.", this.BandwidthUnitPrice);
        this.setParamSimple(map, prefix + "DiscountProxyDailyPrice", this.DiscountProxyDailyPrice);
        this.setParamSimple(map, prefix + "Currency", this.Currency);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

