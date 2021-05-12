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

public class BlueprintPrice extends AbstractModel{

    /**
    * 镜像单价，原价。单位元。
    */
    @SerializedName("OriginalBlueprintPrice")
    @Expose
    private Float OriginalBlueprintPrice;

    /**
    * 镜像总价，原价。单位元。
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Float OriginalPrice;

    /**
    * 折扣。
    */
    @SerializedName("Discount")
    @Expose
    private Long Discount;

    /**
    * 镜像折扣后总价。单位元。
    */
    @SerializedName("DiscountPrice")
    @Expose
    private Float DiscountPrice;

    /**
     * Get 镜像单价，原价。单位元。 
     * @return OriginalBlueprintPrice 镜像单价，原价。单位元。
     */
    public Float getOriginalBlueprintPrice() {
        return this.OriginalBlueprintPrice;
    }

    /**
     * Set 镜像单价，原价。单位元。
     * @param OriginalBlueprintPrice 镜像单价，原价。单位元。
     */
    public void setOriginalBlueprintPrice(Float OriginalBlueprintPrice) {
        this.OriginalBlueprintPrice = OriginalBlueprintPrice;
    }

    /**
     * Get 镜像总价，原价。单位元。 
     * @return OriginalPrice 镜像总价，原价。单位元。
     */
    public Float getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * Set 镜像总价，原价。单位元。
     * @param OriginalPrice 镜像总价，原价。单位元。
     */
    public void setOriginalPrice(Float OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    /**
     * Get 折扣。 
     * @return Discount 折扣。
     */
    public Long getDiscount() {
        return this.Discount;
    }

    /**
     * Set 折扣。
     * @param Discount 折扣。
     */
    public void setDiscount(Long Discount) {
        this.Discount = Discount;
    }

    /**
     * Get 镜像折扣后总价。单位元。 
     * @return DiscountPrice 镜像折扣后总价。单位元。
     */
    public Float getDiscountPrice() {
        return this.DiscountPrice;
    }

    /**
     * Set 镜像折扣后总价。单位元。
     * @param DiscountPrice 镜像折扣后总价。单位元。
     */
    public void setDiscountPrice(Float DiscountPrice) {
        this.DiscountPrice = DiscountPrice;
    }

    public BlueprintPrice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BlueprintPrice(BlueprintPrice source) {
        if (source.OriginalBlueprintPrice != null) {
            this.OriginalBlueprintPrice = new Float(source.OriginalBlueprintPrice);
        }
        if (source.OriginalPrice != null) {
            this.OriginalPrice = new Float(source.OriginalPrice);
        }
        if (source.Discount != null) {
            this.Discount = new Long(source.Discount);
        }
        if (source.DiscountPrice != null) {
            this.DiscountPrice = new Float(source.DiscountPrice);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OriginalBlueprintPrice", this.OriginalBlueprintPrice);
        this.setParamSimple(map, prefix + "OriginalPrice", this.OriginalPrice);
        this.setParamSimple(map, prefix + "Discount", this.Discount);
        this.setParamSimple(map, prefix + "DiscountPrice", this.DiscountPrice);

    }
}

