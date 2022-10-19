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
    * 商品标题。默认值“商品支付”。
    */
    @SerializedName("GoodsName")
    @Expose
    private String GoodsName;

    /**
    * 商品详细描述（商品列表）。
    */
    @SerializedName("GoodsDetail")
    @Expose
    private String GoodsDetail;

    /**
    * 银行附言。不可以有以下字符：<>+{}()%*&';"[]等特殊符号
    */
    @SerializedName("GoodsDescription")
    @Expose
    private String GoodsDescription;

    /**
    * 业务类型。汇付渠道必填，汇付渠道传入固定值100099。
    */
    @SerializedName("GoodsBizType")
    @Expose
    private String GoodsBizType;

    /**
    * 商品编号。
    */
    @SerializedName("Sku")
    @Expose
    private String Sku;

    /**
    * 商品单价。
    */
    @SerializedName("Price")
    @Expose
    private String Price;

    /**
    * 商品数量
    */
    @SerializedName("Quantity")
    @Expose
    private String Quantity;

    /**
    * 商品图片url
    */
    @SerializedName("ProductImage")
    @Expose
    private String ProductImage;

    /**
    * 商品链接url
    */
    @SerializedName("ProductUrl")
    @Expose
    private String ProductUrl;

    /**
     * Get 商品标题。默认值“商品支付”。 
     * @return GoodsName 商品标题。默认值“商品支付”。
     */
    public String getGoodsName() {
        return this.GoodsName;
    }

    /**
     * Set 商品标题。默认值“商品支付”。
     * @param GoodsName 商品标题。默认值“商品支付”。
     */
    public void setGoodsName(String GoodsName) {
        this.GoodsName = GoodsName;
    }

    /**
     * Get 商品详细描述（商品列表）。 
     * @return GoodsDetail 商品详细描述（商品列表）。
     */
    public String getGoodsDetail() {
        return this.GoodsDetail;
    }

    /**
     * Set 商品详细描述（商品列表）。
     * @param GoodsDetail 商品详细描述（商品列表）。
     */
    public void setGoodsDetail(String GoodsDetail) {
        this.GoodsDetail = GoodsDetail;
    }

    /**
     * Get 银行附言。不可以有以下字符：<>+{}()%*&';"[]等特殊符号 
     * @return GoodsDescription 银行附言。不可以有以下字符：<>+{}()%*&';"[]等特殊符号
     */
    public String getGoodsDescription() {
        return this.GoodsDescription;
    }

    /**
     * Set 银行附言。不可以有以下字符：<>+{}()%*&';"[]等特殊符号
     * @param GoodsDescription 银行附言。不可以有以下字符：<>+{}()%*&';"[]等特殊符号
     */
    public void setGoodsDescription(String GoodsDescription) {
        this.GoodsDescription = GoodsDescription;
    }

    /**
     * Get 业务类型。汇付渠道必填，汇付渠道传入固定值100099。 
     * @return GoodsBizType 业务类型。汇付渠道必填，汇付渠道传入固定值100099。
     */
    public String getGoodsBizType() {
        return this.GoodsBizType;
    }

    /**
     * Set 业务类型。汇付渠道必填，汇付渠道传入固定值100099。
     * @param GoodsBizType 业务类型。汇付渠道必填，汇付渠道传入固定值100099。
     */
    public void setGoodsBizType(String GoodsBizType) {
        this.GoodsBizType = GoodsBizType;
    }

    /**
     * Get 商品编号。 
     * @return Sku 商品编号。
     */
    public String getSku() {
        return this.Sku;
    }

    /**
     * Set 商品编号。
     * @param Sku 商品编号。
     */
    public void setSku(String Sku) {
        this.Sku = Sku;
    }

    /**
     * Get 商品单价。 
     * @return Price 商品单价。
     */
    public String getPrice() {
        return this.Price;
    }

    /**
     * Set 商品单价。
     * @param Price 商品单价。
     */
    public void setPrice(String Price) {
        this.Price = Price;
    }

    /**
     * Get 商品数量 
     * @return Quantity 商品数量
     */
    public String getQuantity() {
        return this.Quantity;
    }

    /**
     * Set 商品数量
     * @param Quantity 商品数量
     */
    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }

    /**
     * Get 商品图片url 
     * @return ProductImage 商品图片url
     */
    public String getProductImage() {
        return this.ProductImage;
    }

    /**
     * Set 商品图片url
     * @param ProductImage 商品图片url
     */
    public void setProductImage(String ProductImage) {
        this.ProductImage = ProductImage;
    }

    /**
     * Get 商品链接url 
     * @return ProductUrl 商品链接url
     */
    public String getProductUrl() {
        return this.ProductUrl;
    }

    /**
     * Set 商品链接url
     * @param ProductUrl 商品链接url
     */
    public void setProductUrl(String ProductUrl) {
        this.ProductUrl = ProductUrl;
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
        if (source.GoodsBizType != null) {
            this.GoodsBizType = new String(source.GoodsBizType);
        }
        if (source.Sku != null) {
            this.Sku = new String(source.Sku);
        }
        if (source.Price != null) {
            this.Price = new String(source.Price);
        }
        if (source.Quantity != null) {
            this.Quantity = new String(source.Quantity);
        }
        if (source.ProductImage != null) {
            this.ProductImage = new String(source.ProductImage);
        }
        if (source.ProductUrl != null) {
            this.ProductUrl = new String(source.ProductUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GoodsName", this.GoodsName);
        this.setParamSimple(map, prefix + "GoodsDetail", this.GoodsDetail);
        this.setParamSimple(map, prefix + "GoodsDescription", this.GoodsDescription);
        this.setParamSimple(map, prefix + "GoodsBizType", this.GoodsBizType);
        this.setParamSimple(map, prefix + "Sku", this.Sku);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "Quantity", this.Quantity);
        this.setParamSimple(map, prefix + "ProductImage", this.ProductImage);
        this.setParamSimple(map, prefix + "ProductUrl", this.ProductUrl);

    }
}

