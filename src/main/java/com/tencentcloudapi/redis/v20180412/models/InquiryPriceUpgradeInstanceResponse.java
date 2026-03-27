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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceUpgradeInstanceResponse extends AbstractModel {

    /**
    * <p>折扣后价格</p>
    */
    @SerializedName("Price")
    @Expose
    private Float Price;

    /**
    * <p>高精度折扣后价格</p>
    */
    @SerializedName("HighPrecisionPrice")
    @Expose
    private Float HighPrecisionPrice;

    /**
    * <p>原价</p>
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Float OriginalPrice;

    /**
    * <p>高精度原价</p>
    */
    @SerializedName("HighPrecisionOriginalPrice")
    @Expose
    private Float HighPrecisionOriginalPrice;

    /**
    * <p>币种</p>
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
    * <p>价格金额单位</p><ul><li>pent: 分</li><li>microPent: 微分</li></ul>
    */
    @SerializedName("AmountUnit")
    @Expose
    private String AmountUnit;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>折扣后价格</p> 
     * @return Price <p>折扣后价格</p>
     */
    public Float getPrice() {
        return this.Price;
    }

    /**
     * Set <p>折扣后价格</p>
     * @param Price <p>折扣后价格</p>
     */
    public void setPrice(Float Price) {
        this.Price = Price;
    }

    /**
     * Get <p>高精度折扣后价格</p> 
     * @return HighPrecisionPrice <p>高精度折扣后价格</p>
     */
    public Float getHighPrecisionPrice() {
        return this.HighPrecisionPrice;
    }

    /**
     * Set <p>高精度折扣后价格</p>
     * @param HighPrecisionPrice <p>高精度折扣后价格</p>
     */
    public void setHighPrecisionPrice(Float HighPrecisionPrice) {
        this.HighPrecisionPrice = HighPrecisionPrice;
    }

    /**
     * Get <p>原价</p> 
     * @return OriginalPrice <p>原价</p>
     */
    public Float getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * Set <p>原价</p>
     * @param OriginalPrice <p>原价</p>
     */
    public void setOriginalPrice(Float OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    /**
     * Get <p>高精度原价</p> 
     * @return HighPrecisionOriginalPrice <p>高精度原价</p>
     */
    public Float getHighPrecisionOriginalPrice() {
        return this.HighPrecisionOriginalPrice;
    }

    /**
     * Set <p>高精度原价</p>
     * @param HighPrecisionOriginalPrice <p>高精度原价</p>
     */
    public void setHighPrecisionOriginalPrice(Float HighPrecisionOriginalPrice) {
        this.HighPrecisionOriginalPrice = HighPrecisionOriginalPrice;
    }

    /**
     * Get <p>币种</p> 
     * @return Currency <p>币种</p>
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set <p>币种</p>
     * @param Currency <p>币种</p>
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    /**
     * Get <p>价格金额单位</p><ul><li>pent: 分</li><li>microPent: 微分</li></ul> 
     * @return AmountUnit <p>价格金额单位</p><ul><li>pent: 分</li><li>microPent: 微分</li></ul>
     */
    public String getAmountUnit() {
        return this.AmountUnit;
    }

    /**
     * Set <p>价格金额单位</p><ul><li>pent: 分</li><li>microPent: 微分</li></ul>
     * @param AmountUnit <p>价格金额单位</p><ul><li>pent: 分</li><li>microPent: 微分</li></ul>
     */
    public void setAmountUnit(String AmountUnit) {
        this.AmountUnit = AmountUnit;
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

    public InquiryPriceUpgradeInstanceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryPriceUpgradeInstanceResponse(InquiryPriceUpgradeInstanceResponse source) {
        if (source.Price != null) {
            this.Price = new Float(source.Price);
        }
        if (source.HighPrecisionPrice != null) {
            this.HighPrecisionPrice = new Float(source.HighPrecisionPrice);
        }
        if (source.OriginalPrice != null) {
            this.OriginalPrice = new Float(source.OriginalPrice);
        }
        if (source.HighPrecisionOriginalPrice != null) {
            this.HighPrecisionOriginalPrice = new Float(source.HighPrecisionOriginalPrice);
        }
        if (source.Currency != null) {
            this.Currency = new String(source.Currency);
        }
        if (source.AmountUnit != null) {
            this.AmountUnit = new String(source.AmountUnit);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "HighPrecisionPrice", this.HighPrecisionPrice);
        this.setParamSimple(map, prefix + "OriginalPrice", this.OriginalPrice);
        this.setParamSimple(map, prefix + "HighPrecisionOriginalPrice", this.HighPrecisionOriginalPrice);
        this.setParamSimple(map, prefix + "Currency", this.Currency);
        this.setParamSimple(map, prefix + "AmountUnit", this.AmountUnit);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

