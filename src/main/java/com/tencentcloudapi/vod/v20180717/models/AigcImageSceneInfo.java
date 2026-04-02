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
    * <p>AI生图场景类型，可选值：</p><ul><li>change_clothes：常规场景换衣。</li><li>change_clothes_under：特殊场景换衣。</li><li>change_clothes_top_wear：上半身换衣。</li><li>change_clothes_bottom_wear：下半身换衣。</li><li>change_clothes_full_wear：全身换衣。</li><li>product_image：AI生商品图。</li><li>outpainting: AI扩图。</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>当 Type 下列类型时，则该项为必填，表示AI 换衣生图配置参数：</p><ul><li>change_clothes</li><li>change_clothes_under</li><li>change_clothes_full_wear</li><li>change_clothes_top_wear</li><li>change_clothes_bottom_wear</li></ul>
    */
    @SerializedName("ChangeClothesConfig")
    @Expose
    private ChangeClothesConfig ChangeClothesConfig;

    /**
    * <p>当 Type 为 product_image 时有效，表示AI 生商品图配置参数。</p>
    */
    @SerializedName("ProductImageConfig")
    @Expose
    private ProductImageConfig ProductImageConfig;

    /**
     * Get <p>AI生图场景类型，可选值：</p><ul><li>change_clothes：常规场景换衣。</li><li>change_clothes_under：特殊场景换衣。</li><li>change_clothes_top_wear：上半身换衣。</li><li>change_clothes_bottom_wear：下半身换衣。</li><li>change_clothes_full_wear：全身换衣。</li><li>product_image：AI生商品图。</li><li>outpainting: AI扩图。</li></ul> 
     * @return Type <p>AI生图场景类型，可选值：</p><ul><li>change_clothes：常规场景换衣。</li><li>change_clothes_under：特殊场景换衣。</li><li>change_clothes_top_wear：上半身换衣。</li><li>change_clothes_bottom_wear：下半身换衣。</li><li>change_clothes_full_wear：全身换衣。</li><li>product_image：AI生商品图。</li><li>outpainting: AI扩图。</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>AI生图场景类型，可选值：</p><ul><li>change_clothes：常规场景换衣。</li><li>change_clothes_under：特殊场景换衣。</li><li>change_clothes_top_wear：上半身换衣。</li><li>change_clothes_bottom_wear：下半身换衣。</li><li>change_clothes_full_wear：全身换衣。</li><li>product_image：AI生商品图。</li><li>outpainting: AI扩图。</li></ul>
     * @param Type <p>AI生图场景类型，可选值：</p><ul><li>change_clothes：常规场景换衣。</li><li>change_clothes_under：特殊场景换衣。</li><li>change_clothes_top_wear：上半身换衣。</li><li>change_clothes_bottom_wear：下半身换衣。</li><li>change_clothes_full_wear：全身换衣。</li><li>product_image：AI生商品图。</li><li>outpainting: AI扩图。</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>当 Type 下列类型时，则该项为必填，表示AI 换衣生图配置参数：</p><ul><li>change_clothes</li><li>change_clothes_under</li><li>change_clothes_full_wear</li><li>change_clothes_top_wear</li><li>change_clothes_bottom_wear</li></ul> 
     * @return ChangeClothesConfig <p>当 Type 下列类型时，则该项为必填，表示AI 换衣生图配置参数：</p><ul><li>change_clothes</li><li>change_clothes_under</li><li>change_clothes_full_wear</li><li>change_clothes_top_wear</li><li>change_clothes_bottom_wear</li></ul>
     */
    public ChangeClothesConfig getChangeClothesConfig() {
        return this.ChangeClothesConfig;
    }

    /**
     * Set <p>当 Type 下列类型时，则该项为必填，表示AI 换衣生图配置参数：</p><ul><li>change_clothes</li><li>change_clothes_under</li><li>change_clothes_full_wear</li><li>change_clothes_top_wear</li><li>change_clothes_bottom_wear</li></ul>
     * @param ChangeClothesConfig <p>当 Type 下列类型时，则该项为必填，表示AI 换衣生图配置参数：</p><ul><li>change_clothes</li><li>change_clothes_under</li><li>change_clothes_full_wear</li><li>change_clothes_top_wear</li><li>change_clothes_bottom_wear</li></ul>
     */
    public void setChangeClothesConfig(ChangeClothesConfig ChangeClothesConfig) {
        this.ChangeClothesConfig = ChangeClothesConfig;
    }

    /**
     * Get <p>当 Type 为 product_image 时有效，表示AI 生商品图配置参数。</p> 
     * @return ProductImageConfig <p>当 Type 为 product_image 时有效，表示AI 生商品图配置参数。</p>
     */
    public ProductImageConfig getProductImageConfig() {
        return this.ProductImageConfig;
    }

    /**
     * Set <p>当 Type 为 product_image 时有效，表示AI 生商品图配置参数。</p>
     * @param ProductImageConfig <p>当 Type 为 product_image 时有效，表示AI 生商品图配置参数。</p>
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

