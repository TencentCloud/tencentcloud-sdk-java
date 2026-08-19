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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Amount extends AbstractModel {

    /**
    * <p>原始货币类型</p><p>参数格式：符合ISO 4217标准</p>
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
    * <p>原始金额</p>
    */
    @SerializedName("OriginalAmount")
    @Expose
    private Float OriginalAmount;

    /**
    * <p>当前币种对美金的汇率</p>
    */
    @SerializedName("ExchangeRateUSD")
    @Expose
    private Float ExchangeRateUSD;

    /**
    * <p>当前币种对人民币的汇率</p>
    */
    @SerializedName("ExchangeRateCNY")
    @Expose
    private Float ExchangeRateCNY;

    /**
     * Get <p>原始货币类型</p><p>参数格式：符合ISO 4217标准</p> 
     * @return Currency <p>原始货币类型</p><p>参数格式：符合ISO 4217标准</p>
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set <p>原始货币类型</p><p>参数格式：符合ISO 4217标准</p>
     * @param Currency <p>原始货币类型</p><p>参数格式：符合ISO 4217标准</p>
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    /**
     * Get <p>原始金额</p> 
     * @return OriginalAmount <p>原始金额</p>
     */
    public Float getOriginalAmount() {
        return this.OriginalAmount;
    }

    /**
     * Set <p>原始金额</p>
     * @param OriginalAmount <p>原始金额</p>
     */
    public void setOriginalAmount(Float OriginalAmount) {
        this.OriginalAmount = OriginalAmount;
    }

    /**
     * Get <p>当前币种对美金的汇率</p> 
     * @return ExchangeRateUSD <p>当前币种对美金的汇率</p>
     */
    public Float getExchangeRateUSD() {
        return this.ExchangeRateUSD;
    }

    /**
     * Set <p>当前币种对美金的汇率</p>
     * @param ExchangeRateUSD <p>当前币种对美金的汇率</p>
     */
    public void setExchangeRateUSD(Float ExchangeRateUSD) {
        this.ExchangeRateUSD = ExchangeRateUSD;
    }

    /**
     * Get <p>当前币种对人民币的汇率</p> 
     * @return ExchangeRateCNY <p>当前币种对人民币的汇率</p>
     */
    public Float getExchangeRateCNY() {
        return this.ExchangeRateCNY;
    }

    /**
     * Set <p>当前币种对人民币的汇率</p>
     * @param ExchangeRateCNY <p>当前币种对人民币的汇率</p>
     */
    public void setExchangeRateCNY(Float ExchangeRateCNY) {
        this.ExchangeRateCNY = ExchangeRateCNY;
    }

    public Amount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Amount(Amount source) {
        if (source.Currency != null) {
            this.Currency = new String(source.Currency);
        }
        if (source.OriginalAmount != null) {
            this.OriginalAmount = new Float(source.OriginalAmount);
        }
        if (source.ExchangeRateUSD != null) {
            this.ExchangeRateUSD = new Float(source.ExchangeRateUSD);
        }
        if (source.ExchangeRateCNY != null) {
            this.ExchangeRateCNY = new Float(source.ExchangeRateCNY);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Currency", this.Currency);
        this.setParamSimple(map, prefix + "OriginalAmount", this.OriginalAmount);
        this.setParamSimple(map, prefix + "ExchangeRateUSD", this.ExchangeRateUSD);
        this.setParamSimple(map, prefix + "ExchangeRateCNY", this.ExchangeRateCNY);

    }
}

