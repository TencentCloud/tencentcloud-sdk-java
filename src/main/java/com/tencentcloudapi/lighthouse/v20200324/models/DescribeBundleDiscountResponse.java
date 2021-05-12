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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBundleDiscountResponse extends AbstractModel{

    /**
    * 币种：CNY人民币，USD 美元。
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
    * 折扣梯度详情，每个梯度包含的信息有：时长，折扣数，总价，折扣价，折扣详情（用户折扣、官网折扣、最终折扣）。
    */
    @SerializedName("DiscountDetail")
    @Expose
    private DiscountDetail [] DiscountDetail;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 币种：CNY人民币，USD 美元。 
     * @return Currency 币种：CNY人民币，USD 美元。
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set 币种：CNY人民币，USD 美元。
     * @param Currency 币种：CNY人民币，USD 美元。
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    /**
     * Get 折扣梯度详情，每个梯度包含的信息有：时长，折扣数，总价，折扣价，折扣详情（用户折扣、官网折扣、最终折扣）。 
     * @return DiscountDetail 折扣梯度详情，每个梯度包含的信息有：时长，折扣数，总价，折扣价，折扣详情（用户折扣、官网折扣、最终折扣）。
     */
    public DiscountDetail [] getDiscountDetail() {
        return this.DiscountDetail;
    }

    /**
     * Set 折扣梯度详情，每个梯度包含的信息有：时长，折扣数，总价，折扣价，折扣详情（用户折扣、官网折扣、最终折扣）。
     * @param DiscountDetail 折扣梯度详情，每个梯度包含的信息有：时长，折扣数，总价，折扣价，折扣详情（用户折扣、官网折扣、最终折扣）。
     */
    public void setDiscountDetail(DiscountDetail [] DiscountDetail) {
        this.DiscountDetail = DiscountDetail;
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

    public DescribeBundleDiscountResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBundleDiscountResponse(DescribeBundleDiscountResponse source) {
        if (source.Currency != null) {
            this.Currency = new String(source.Currency);
        }
        if (source.DiscountDetail != null) {
            this.DiscountDetail = new DiscountDetail[source.DiscountDetail.length];
            for (int i = 0; i < source.DiscountDetail.length; i++) {
                this.DiscountDetail[i] = new DiscountDetail(source.DiscountDetail[i]);
            }
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
        this.setParamArrayObj(map, prefix + "DiscountDetail.", this.DiscountDetail);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

