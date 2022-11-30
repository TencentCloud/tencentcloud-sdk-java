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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceRenewDBInstanceResponse extends AbstractModel{

    /**
    * 刊例价，单位为分。如24650表示246.5元
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Long OriginalPrice;

    /**
    * 折后实际付款金额，单位为分。如24650表示246.5元
    */
    @SerializedName("Price")
    @Expose
    private Long Price;

    /**
    * 币种。例如，CNY：人民币。
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
     * Get 刊例价，单位为分。如24650表示246.5元 
     * @return OriginalPrice 刊例价，单位为分。如24650表示246.5元
     */
    public Long getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * Set 刊例价，单位为分。如24650表示246.5元
     * @param OriginalPrice 刊例价，单位为分。如24650表示246.5元
     */
    public void setOriginalPrice(Long OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    /**
     * Get 折后实际付款金额，单位为分。如24650表示246.5元 
     * @return Price 折后实际付款金额，单位为分。如24650表示246.5元
     */
    public Long getPrice() {
        return this.Price;
    }

    /**
     * Set 折后实际付款金额，单位为分。如24650表示246.5元
     * @param Price 折后实际付款金额，单位为分。如24650表示246.5元
     */
    public void setPrice(Long Price) {
        this.Price = Price;
    }

    /**
     * Get 币种。例如，CNY：人民币。 
     * @return Currency 币种。例如，CNY：人民币。
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set 币种。例如，CNY：人民币。
     * @param Currency 币种。例如，CNY：人民币。
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public InquiryPriceRenewDBInstanceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryPriceRenewDBInstanceResponse(InquiryPriceRenewDBInstanceResponse source) {
        if (source.OriginalPrice != null) {
            this.OriginalPrice = new Long(source.OriginalPrice);
        }
        if (source.Price != null) {
            this.Price = new Long(source.Price);
        }
        if (source.Currency != null) {
            this.Currency = new String(source.Currency);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OriginalPrice", this.OriginalPrice);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "Currency", this.Currency);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

