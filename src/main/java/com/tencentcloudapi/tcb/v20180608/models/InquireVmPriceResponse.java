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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquireVmPriceResponse extends AbstractModel {

    /**
    * 价格货币单位。取值范围CNY:人民币。USD:美元。
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
    * 原价（主机原始每月价格）
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Float OriginalPrice;

    /**
    * 折扣率
    */
    @SerializedName("Discount")
    @Expose
    private Float Discount;

    /**
    * 折扣后每月价格
    */
    @SerializedName("DiscountPrice")
    @Expose
    private Float DiscountPrice;

    /**
    * 折扣前每天资源点
    */
    @SerializedName("OriginalCredits")
    @Expose
    private Float OriginalCredits;

    /**
    * 折扣后每天资源点
    */
    @SerializedName("DiscountCredits")
    @Expose
    private Float DiscountCredits;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 价格货币单位。取值范围CNY:人民币。USD:美元。 
     * @return Currency 价格货币单位。取值范围CNY:人民币。USD:美元。
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set 价格货币单位。取值范围CNY:人民币。USD:美元。
     * @param Currency 价格货币单位。取值范围CNY:人民币。USD:美元。
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    /**
     * Get 原价（主机原始每月价格） 
     * @return OriginalPrice 原价（主机原始每月价格）
     */
    public Float getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * Set 原价（主机原始每月价格）
     * @param OriginalPrice 原价（主机原始每月价格）
     */
    public void setOriginalPrice(Float OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    /**
     * Get 折扣率 
     * @return Discount 折扣率
     */
    public Float getDiscount() {
        return this.Discount;
    }

    /**
     * Set 折扣率
     * @param Discount 折扣率
     */
    public void setDiscount(Float Discount) {
        this.Discount = Discount;
    }

    /**
     * Get 折扣后每月价格 
     * @return DiscountPrice 折扣后每月价格
     */
    public Float getDiscountPrice() {
        return this.DiscountPrice;
    }

    /**
     * Set 折扣后每月价格
     * @param DiscountPrice 折扣后每月价格
     */
    public void setDiscountPrice(Float DiscountPrice) {
        this.DiscountPrice = DiscountPrice;
    }

    /**
     * Get 折扣前每天资源点 
     * @return OriginalCredits 折扣前每天资源点
     */
    public Float getOriginalCredits() {
        return this.OriginalCredits;
    }

    /**
     * Set 折扣前每天资源点
     * @param OriginalCredits 折扣前每天资源点
     */
    public void setOriginalCredits(Float OriginalCredits) {
        this.OriginalCredits = OriginalCredits;
    }

    /**
     * Get 折扣后每天资源点 
     * @return DiscountCredits 折扣后每天资源点
     */
    public Float getDiscountCredits() {
        return this.DiscountCredits;
    }

    /**
     * Set 折扣后每天资源点
     * @param DiscountCredits 折扣后每天资源点
     */
    public void setDiscountCredits(Float DiscountCredits) {
        this.DiscountCredits = DiscountCredits;
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

    public InquireVmPriceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquireVmPriceResponse(InquireVmPriceResponse source) {
        if (source.Currency != null) {
            this.Currency = new String(source.Currency);
        }
        if (source.OriginalPrice != null) {
            this.OriginalPrice = new Float(source.OriginalPrice);
        }
        if (source.Discount != null) {
            this.Discount = new Float(source.Discount);
        }
        if (source.DiscountPrice != null) {
            this.DiscountPrice = new Float(source.DiscountPrice);
        }
        if (source.OriginalCredits != null) {
            this.OriginalCredits = new Float(source.OriginalCredits);
        }
        if (source.DiscountCredits != null) {
            this.DiscountCredits = new Float(source.DiscountCredits);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Currency", this.Currency);
        this.setParamSimple(map, prefix + "OriginalPrice", this.OriginalPrice);
        this.setParamSimple(map, prefix + "Discount", this.Discount);
        this.setParamSimple(map, prefix + "DiscountPrice", this.DiscountPrice);
        this.setParamSimple(map, prefix + "OriginalCredits", this.OriginalCredits);
        this.setParamSimple(map, prefix + "DiscountCredits", this.DiscountCredits);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

