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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUpgradePriceResponse extends AbstractModel{

    /**
    * 原价，单位：分
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Long OriginalPrice;

    /**
    * 实际价格，单位：分。受折扣等影响，可能和原价不同。
    */
    @SerializedName("Price")
    @Expose
    private Long Price;

    /**
    * 变配明细计算公式
    */
    @SerializedName("Formula")
    @Expose
    private String Formula;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 原价，单位：分 
     * @return OriginalPrice 原价，单位：分
     */
    public Long getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * Set 原价，单位：分
     * @param OriginalPrice 原价，单位：分
     */
    public void setOriginalPrice(Long OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    /**
     * Get 实际价格，单位：分。受折扣等影响，可能和原价不同。 
     * @return Price 实际价格，单位：分。受折扣等影响，可能和原价不同。
     */
    public Long getPrice() {
        return this.Price;
    }

    /**
     * Set 实际价格，单位：分。受折扣等影响，可能和原价不同。
     * @param Price 实际价格，单位：分。受折扣等影响，可能和原价不同。
     */
    public void setPrice(Long Price) {
        this.Price = Price;
    }

    /**
     * Get 变配明细计算公式 
     * @return Formula 变配明细计算公式
     */
    public String getFormula() {
        return this.Formula;
    }

    /**
     * Set 变配明细计算公式
     * @param Formula 变配明细计算公式
     */
    public void setFormula(String Formula) {
        this.Formula = Formula;
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

    public DescribeUpgradePriceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUpgradePriceResponse(DescribeUpgradePriceResponse source) {
        if (source.OriginalPrice != null) {
            this.OriginalPrice = new Long(source.OriginalPrice);
        }
        if (source.Price != null) {
            this.Price = new Long(source.Price);
        }
        if (source.Formula != null) {
            this.Formula = new String(source.Formula);
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
        this.setParamSimple(map, prefix + "Formula", this.Formula);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

