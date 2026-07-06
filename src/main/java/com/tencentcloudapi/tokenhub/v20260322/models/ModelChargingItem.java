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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModelChargingItem extends AbstractModel {

    /**
    * 价格维度标识。取值：Input（输入）、Output（输出）、Cache（缓存命中）、Thinking（思考）、BatchInput（批量输入）、BatchOutput（批量输出）、BatchCache（批量缓存命中）、ImageInput（输入图片）、ImageOutput（输出图片）、Search（搜索调用）。
    */
    @SerializedName("PriceName")
    @Expose
    private String PriceName;

    /**
    * 价格维度展示名，后端直接提供当前语言文本（如 输入、Input），前端无需翻译。
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * 价格数值。
    */
    @SerializedName("Price")
    @Expose
    private String Price;

    /**
    * 价格单位，后端直接提供当前语言文本（如 元/百万tokens、元/张、积分/次）。
    */
    @SerializedName("PriceUnit")
    @Expose
    private String PriceUnit;

    /**
     * Get 价格维度标识。取值：Input（输入）、Output（输出）、Cache（缓存命中）、Thinking（思考）、BatchInput（批量输入）、BatchOutput（批量输出）、BatchCache（批量缓存命中）、ImageInput（输入图片）、ImageOutput（输出图片）、Search（搜索调用）。 
     * @return PriceName 价格维度标识。取值：Input（输入）、Output（输出）、Cache（缓存命中）、Thinking（思考）、BatchInput（批量输入）、BatchOutput（批量输出）、BatchCache（批量缓存命中）、ImageInput（输入图片）、ImageOutput（输出图片）、Search（搜索调用）。
     */
    public String getPriceName() {
        return this.PriceName;
    }

    /**
     * Set 价格维度标识。取值：Input（输入）、Output（输出）、Cache（缓存命中）、Thinking（思考）、BatchInput（批量输入）、BatchOutput（批量输出）、BatchCache（批量缓存命中）、ImageInput（输入图片）、ImageOutput（输出图片）、Search（搜索调用）。
     * @param PriceName 价格维度标识。取值：Input（输入）、Output（输出）、Cache（缓存命中）、Thinking（思考）、BatchInput（批量输入）、BatchOutput（批量输出）、BatchCache（批量缓存命中）、ImageInput（输入图片）、ImageOutput（输出图片）、Search（搜索调用）。
     */
    public void setPriceName(String PriceName) {
        this.PriceName = PriceName;
    }

    /**
     * Get 价格维度展示名，后端直接提供当前语言文本（如 输入、Input），前端无需翻译。 
     * @return DisplayName 价格维度展示名，后端直接提供当前语言文本（如 输入、Input），前端无需翻译。
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set 价格维度展示名，后端直接提供当前语言文本（如 输入、Input），前端无需翻译。
     * @param DisplayName 价格维度展示名，后端直接提供当前语言文本（如 输入、Input），前端无需翻译。
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get 价格数值。 
     * @return Price 价格数值。
     */
    public String getPrice() {
        return this.Price;
    }

    /**
     * Set 价格数值。
     * @param Price 价格数值。
     */
    public void setPrice(String Price) {
        this.Price = Price;
    }

    /**
     * Get 价格单位，后端直接提供当前语言文本（如 元/百万tokens、元/张、积分/次）。 
     * @return PriceUnit 价格单位，后端直接提供当前语言文本（如 元/百万tokens、元/张、积分/次）。
     */
    public String getPriceUnit() {
        return this.PriceUnit;
    }

    /**
     * Set 价格单位，后端直接提供当前语言文本（如 元/百万tokens、元/张、积分/次）。
     * @param PriceUnit 价格单位，后端直接提供当前语言文本（如 元/百万tokens、元/张、积分/次）。
     */
    public void setPriceUnit(String PriceUnit) {
        this.PriceUnit = PriceUnit;
    }

    public ModelChargingItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelChargingItem(ModelChargingItem source) {
        if (source.PriceName != null) {
            this.PriceName = new String(source.PriceName);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.Price != null) {
            this.Price = new String(source.Price);
        }
        if (source.PriceUnit != null) {
            this.PriceUnit = new String(source.PriceUnit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PriceName", this.PriceName);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "PriceUnit", this.PriceUnit);

    }
}

