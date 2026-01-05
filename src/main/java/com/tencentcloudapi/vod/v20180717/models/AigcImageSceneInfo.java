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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AigcImageSceneInfo extends AbstractModel {

    /**
    * AI生图场景类型，可选值：
- change_clothes：AI换衣。
- product_image：AI生商品图。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 当 Type 为 change_clothes 时有效，则该项为必填，表示AI 换衣生图配置参数。
    */
    @SerializedName("ChangeClothesConfig")
    @Expose
    private ChangeClothesConfig ChangeClothesConfig;

    /**
    * 当 Type 为 product_image 时有效，表示AI 生商品图配置参数。
    */
    @SerializedName("ProductImageConfig")
    @Expose
    private ProductImageConfig ProductImageConfig;

    /**
     * Get AI生图场景类型，可选值：
- change_clothes：AI换衣。
- product_image：AI生商品图。 
     * @return Type AI生图场景类型，可选值：
- change_clothes：AI换衣。
- product_image：AI生商品图。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set AI生图场景类型，可选值：
- change_clothes：AI换衣。
- product_image：AI生商品图。
     * @param Type AI生图场景类型，可选值：
- change_clothes：AI换衣。
- product_image：AI生商品图。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 当 Type 为 change_clothes 时有效，则该项为必填，表示AI 换衣生图配置参数。 
     * @return ChangeClothesConfig 当 Type 为 change_clothes 时有效，则该项为必填，表示AI 换衣生图配置参数。
     */
    public ChangeClothesConfig getChangeClothesConfig() {
        return this.ChangeClothesConfig;
    }

    /**
     * Set 当 Type 为 change_clothes 时有效，则该项为必填，表示AI 换衣生图配置参数。
     * @param ChangeClothesConfig 当 Type 为 change_clothes 时有效，则该项为必填，表示AI 换衣生图配置参数。
     */
    public void setChangeClothesConfig(ChangeClothesConfig ChangeClothesConfig) {
        this.ChangeClothesConfig = ChangeClothesConfig;
    }

    /**
     * Get 当 Type 为 product_image 时有效，表示AI 生商品图配置参数。 
     * @return ProductImageConfig 当 Type 为 product_image 时有效，表示AI 生商品图配置参数。
     */
    public ProductImageConfig getProductImageConfig() {
        return this.ProductImageConfig;
    }

    /**
     * Set 当 Type 为 product_image 时有效，表示AI 生商品图配置参数。
     * @param ProductImageConfig 当 Type 为 product_image 时有效，表示AI 生商品图配置参数。
     */
    public void setProductImageConfig(ProductImageConfig ProductImageConfig) {
        this.ProductImageConfig = ProductImageConfig;
    }

    public AigcImageSceneInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcImageSceneInfo(AigcImageSceneInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ChangeClothesConfig != null) {
            this.ChangeClothesConfig = new ChangeClothesConfig(source.ChangeClothesConfig);
        }
        if (source.ProductImageConfig != null) {
            this.ProductImageConfig = new ProductImageConfig(source.ProductImageConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "ChangeClothesConfig.", this.ChangeClothesConfig);
        this.setParamObj(map, prefix + "ProductImageConfig.", this.ProductImageConfig);

    }
}

