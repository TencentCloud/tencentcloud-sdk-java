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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TotalPrice extends AbstractModel {

    /**
    * <p>原始总计价格。</p><p>单位：元</p>
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Float OriginalPrice;

    /**
    * <p>折扣总计价格。</p><p>单位：元</p>
    */
    @SerializedName("DiscountPrice")
    @Expose
    private Float DiscountPrice;

    /**
     * Get <p>原始总计价格。</p><p>单位：元</p> 
     * @return OriginalPrice <p>原始总计价格。</p><p>单位：元</p>
     */
    public Float getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * Set <p>原始总计价格。</p><p>单位：元</p>
     * @param OriginalPrice <p>原始总计价格。</p><p>单位：元</p>
     */
    public void setOriginalPrice(Float OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    /**
     * Get <p>折扣总计价格。</p><p>单位：元</p> 
     * @return DiscountPrice <p>折扣总计价格。</p><p>单位：元</p>
     */
    public Float getDiscountPrice() {
        return this.DiscountPrice;
    }

    /**
     * Set <p>折扣总计价格。</p><p>单位：元</p>
     * @param DiscountPrice <p>折扣总计价格。</p><p>单位：元</p>
     */
    public void setDiscountPrice(Float DiscountPrice) {
        this.DiscountPrice = DiscountPrice;
    }

    public TotalPrice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TotalPrice(TotalPrice source) {
        if (source.OriginalPrice != null) {
            this.OriginalPrice = new Float(source.OriginalPrice);
        }
        if (source.DiscountPrice != null) {
            this.DiscountPrice = new Float(source.DiscountPrice);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OriginalPrice", this.OriginalPrice);
        this.setParamSimple(map, prefix + "DiscountPrice", this.DiscountPrice);

    }
}

