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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpenBankGoodsInfo extends AbstractModel{

    /**
    * 商品标题，默认值“商品支付”
    */
    @SerializedName("GoodsName")
    @Expose
    private String GoodsName;

    /**
    * 商品详细描述（商品列表）
    */
    @SerializedName("GoodsDetail")
    @Expose
    private String GoodsDetail;

    /**
    * 银行附言，不可以有以下字符：<>+{}()%*&';"[]等特殊符号
    */
    @SerializedName("GoodsDescription")
    @Expose
    private String GoodsDescription;

    /**
     * Get 商品标题，默认值“商品支付” 
     * @return GoodsName 商品标题，默认值“商品支付”
     */
    public String getGoodsName() {
        return this.GoodsName;
    }

    /**
     * Set 商品标题，默认值“商品支付”
     * @param GoodsName 商品标题，默认值“商品支付”
     */
    public void setGoodsName(String GoodsName) {
        this.GoodsName = GoodsName;
    }

    /**
     * Get 商品详细描述（商品列表） 
     * @return GoodsDetail 商品详细描述（商品列表）
     */
    public String getGoodsDetail() {
        return this.GoodsDetail;
    }

    /**
     * Set 商品详细描述（商品列表）
     * @param GoodsDetail 商品详细描述（商品列表）
     */
    public void setGoodsDetail(String GoodsDetail) {
        this.GoodsDetail = GoodsDetail;
    }

    /**
     * Get 银行附言，不可以有以下字符：<>+{}()%*&';"[]等特殊符号 
     * @return GoodsDescription 银行附言，不可以有以下字符：<>+{}()%*&';"[]等特殊符号
     */
    public String getGoodsDescription() {
        return this.GoodsDescription;
    }

    /**
     * Set 银行附言，不可以有以下字符：<>+{}()%*&';"[]等特殊符号
     * @param GoodsDescription 银行附言，不可以有以下字符：<>+{}()%*&';"[]等特殊符号
     */
    public void setGoodsDescription(String GoodsDescription) {
        this.GoodsDescription = GoodsDescription;
    }

    public OpenBankGoodsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenBankGoodsInfo(OpenBankGoodsInfo source) {
        if (source.GoodsName != null) {
            this.GoodsName = new String(source.GoodsName);
        }
        if (source.GoodsDetail != null) {
            this.GoodsDetail = new String(source.GoodsDetail);
        }
        if (source.GoodsDescription != null) {
            this.GoodsDescription = new String(source.GoodsDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GoodsName", this.GoodsName);
        this.setParamSimple(map, prefix + "GoodsDetail", this.GoodsDetail);
        this.setParamSimple(map, prefix + "GoodsDescription", this.GoodsDescription);

    }
}

