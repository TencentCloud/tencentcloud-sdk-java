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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplicableProducts extends AbstractModel{

    /**
    * 适用商品名称，值为“全产品通用”或商品名称组成的string，以","分割。
    */
    @SerializedName("GoodsName")
    @Expose
    private String GoodsName;

    /**
    * postPay后付费/prePay预付费/riPay预留实例/空字符串或者"*"表示全部模式。如GoodsName为多个商品名以","分割组成的string，而PayMode为"*"，表示每一件商品的模式都为"*"。
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
     * Get 适用商品名称，值为“全产品通用”或商品名称组成的string，以","分割。 
     * @return GoodsName 适用商品名称，值为“全产品通用”或商品名称组成的string，以","分割。
     */
    public String getGoodsName() {
        return this.GoodsName;
    }

    /**
     * Set 适用商品名称，值为“全产品通用”或商品名称组成的string，以","分割。
     * @param GoodsName 适用商品名称，值为“全产品通用”或商品名称组成的string，以","分割。
     */
    public void setGoodsName(String GoodsName) {
        this.GoodsName = GoodsName;
    }

    /**
     * Get postPay后付费/prePay预付费/riPay预留实例/空字符串或者"*"表示全部模式。如GoodsName为多个商品名以","分割组成的string，而PayMode为"*"，表示每一件商品的模式都为"*"。 
     * @return PayMode postPay后付费/prePay预付费/riPay预留实例/空字符串或者"*"表示全部模式。如GoodsName为多个商品名以","分割组成的string，而PayMode为"*"，表示每一件商品的模式都为"*"。
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set postPay后付费/prePay预付费/riPay预留实例/空字符串或者"*"表示全部模式。如GoodsName为多个商品名以","分割组成的string，而PayMode为"*"，表示每一件商品的模式都为"*"。
     * @param PayMode postPay后付费/prePay预付费/riPay预留实例/空字符串或者"*"表示全部模式。如GoodsName为多个商品名以","分割组成的string，而PayMode为"*"，表示每一件商品的模式都为"*"。
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    public ApplicableProducts() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplicableProducts(ApplicableProducts source) {
        if (source.GoodsName != null) {
            this.GoodsName = new String(source.GoodsName);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GoodsName", this.GoodsName);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);

    }
}

