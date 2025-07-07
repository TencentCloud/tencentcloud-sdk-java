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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InternetPrice extends AbstractModel {

    /**
    * 公网IP询价详细参数。
    */
    @SerializedName("AddressPrice")
    @Expose
    private InternetPriceDetail AddressPrice;

    /**
     * Get 公网IP询价详细参数。 
     * @return AddressPrice 公网IP询价详细参数。
     */
    public InternetPriceDetail getAddressPrice() {
        return this.AddressPrice;
    }

    /**
     * Set 公网IP询价详细参数。
     * @param AddressPrice 公网IP询价详细参数。
     */
    public void setAddressPrice(InternetPriceDetail AddressPrice) {
        this.AddressPrice = AddressPrice;
    }

    public InternetPrice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InternetPrice(InternetPrice source) {
        if (source.AddressPrice != null) {
            this.AddressPrice = new InternetPriceDetail(source.AddressPrice);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AddressPrice.", this.AddressPrice);

    }
}

