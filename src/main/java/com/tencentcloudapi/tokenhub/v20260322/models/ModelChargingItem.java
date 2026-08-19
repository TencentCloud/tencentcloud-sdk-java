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
    * <p>价格维度标识。取值：Input（输入）、Output（输出）、Cache（缓存命中）、Thinking（思考）、BatchInput（批量输入）、BatchOutput（批量输出）、BatchCache（批量缓存命中）、ImageInput（输入图片）、ImageOutput（输出图片）、Search（搜索调用）。</p>
    */
    @SerializedName("PriceName")
    @Expose
    private String PriceName;

    /**
    * <p>价格维度展示名，后端直接提供当前语言文本（如 输入、Input），前端无需翻译。</p>
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * <p>价格数值。</p>
    */
    @SerializedName("Price")
    @Expose
    private String Price;

    /**
    * <p>价格单位，后端直接提供当前语言文本（如 元/百万tokens、元/张、积分/次）。</p>
    */
    @SerializedName("PriceUnit")
    @Expose
    private String PriceUnit;

    /**
    * <p>高峰价格，为空表示无高峰定价</p>
    */
    @SerializedName("PeakPrice")
    @Expose
    private String PeakPrice;

    /**
    * <p>规格描述，例如视觉/语音类模型有值（如 有参考视频 540P、图生视频 首帧 720P、动作控制 1080P、有声-未指定音色），其他模型为空。</p>
    */
    @SerializedName("Specification")
    @Expose
    private String Specification;

    /**
    * <p>Token 用量描述，例如视觉/语音类模型有值（如 第1秒 62,500 Tokens，后续每秒 15,625 Tokens），其他模型为空。</p>
    */
    @SerializedName("Usage")
    @Expose
    private String Usage;

    /**
    * <p>参考费用/预估费用描述，例如视觉/语音类模型有值（如 第1秒 0.625 元，后续每秒 0.15625 元），其他模型为空。</p>
    */
    @SerializedName("ReferencePrice")
    @Expose
    private String ReferencePrice;

    /**
     * Get <p>价格维度标识。取值：Input（输入）、Output（输出）、Cache（缓存命中）、Thinking（思考）、BatchInput（批量输入）、BatchOutput（批量输出）、BatchCache（批量缓存命中）、ImageInput（输入图片）、ImageOutput（输出图片）、Search（搜索调用）。</p> 
     * @return PriceName <p>价格维度标识。取值：Input（输入）、Output（输出）、Cache（缓存命中）、Thinking（思考）、BatchInput（批量输入）、BatchOutput（批量输出）、BatchCache（批量缓存命中）、ImageInput（输入图片）、ImageOutput（输出图片）、Search（搜索调用）。</p>
     */
    public String getPriceName() {
        return this.PriceName;
    }

    /**
     * Set <p>价格维度标识。取值：Input（输入）、Output（输出）、Cache（缓存命中）、Thinking（思考）、BatchInput（批量输入）、BatchOutput（批量输出）、BatchCache（批量缓存命中）、ImageInput（输入图片）、ImageOutput（输出图片）、Search（搜索调用）。</p>
     * @param PriceName <p>价格维度标识。取值：Input（输入）、Output（输出）、Cache（缓存命中）、Thinking（思考）、BatchInput（批量输入）、BatchOutput（批量输出）、BatchCache（批量缓存命中）、ImageInput（输入图片）、ImageOutput（输出图片）、Search（搜索调用）。</p>
     */
    public void setPriceName(String PriceName) {
        this.PriceName = PriceName;
    }

    /**
     * Get <p>价格维度展示名，后端直接提供当前语言文本（如 输入、Input），前端无需翻译。</p> 
     * @return DisplayName <p>价格维度展示名，后端直接提供当前语言文本（如 输入、Input），前端无需翻译。</p>
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set <p>价格维度展示名，后端直接提供当前语言文本（如 输入、Input），前端无需翻译。</p>
     * @param DisplayName <p>价格维度展示名，后端直接提供当前语言文本（如 输入、Input），前端无需翻译。</p>
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get <p>价格数值。</p> 
     * @return Price <p>价格数值。</p>
     */
    public String getPrice() {
        return this.Price;
    }

    /**
     * Set <p>价格数值。</p>
     * @param Price <p>价格数值。</p>
     */
    public void setPrice(String Price) {
        this.Price = Price;
    }

    /**
     * Get <p>价格单位，后端直接提供当前语言文本（如 元/百万tokens、元/张、积分/次）。</p> 
     * @return PriceUnit <p>价格单位，后端直接提供当前语言文本（如 元/百万tokens、元/张、积分/次）。</p>
     */
    public String getPriceUnit() {
        return this.PriceUnit;
    }

    /**
     * Set <p>价格单位，后端直接提供当前语言文本（如 元/百万tokens、元/张、积分/次）。</p>
     * @param PriceUnit <p>价格单位，后端直接提供当前语言文本（如 元/百万tokens、元/张、积分/次）。</p>
     */
    public void setPriceUnit(String PriceUnit) {
        this.PriceUnit = PriceUnit;
    }

    /**
     * Get <p>高峰价格，为空表示无高峰定价</p> 
     * @return PeakPrice <p>高峰价格，为空表示无高峰定价</p>
     */
    public String getPeakPrice() {
        return this.PeakPrice;
    }

    /**
     * Set <p>高峰价格，为空表示无高峰定价</p>
     * @param PeakPrice <p>高峰价格，为空表示无高峰定价</p>
     */
    public void setPeakPrice(String PeakPrice) {
        this.PeakPrice = PeakPrice;
    }

    /**
     * Get <p>规格描述，例如视觉/语音类模型有值（如 有参考视频 540P、图生视频 首帧 720P、动作控制 1080P、有声-未指定音色），其他模型为空。</p> 
     * @return Specification <p>规格描述，例如视觉/语音类模型有值（如 有参考视频 540P、图生视频 首帧 720P、动作控制 1080P、有声-未指定音色），其他模型为空。</p>
     */
    public String getSpecification() {
        return this.Specification;
    }

    /**
     * Set <p>规格描述，例如视觉/语音类模型有值（如 有参考视频 540P、图生视频 首帧 720P、动作控制 1080P、有声-未指定音色），其他模型为空。</p>
     * @param Specification <p>规格描述，例如视觉/语音类模型有值（如 有参考视频 540P、图生视频 首帧 720P、动作控制 1080P、有声-未指定音色），其他模型为空。</p>
     */
    public void setSpecification(String Specification) {
        this.Specification = Specification;
    }

    /**
     * Get <p>Token 用量描述，例如视觉/语音类模型有值（如 第1秒 62,500 Tokens，后续每秒 15,625 Tokens），其他模型为空。</p> 
     * @return Usage <p>Token 用量描述，例如视觉/语音类模型有值（如 第1秒 62,500 Tokens，后续每秒 15,625 Tokens），其他模型为空。</p>
     */
    public String getUsage() {
        return this.Usage;
    }

    /**
     * Set <p>Token 用量描述，例如视觉/语音类模型有值（如 第1秒 62,500 Tokens，后续每秒 15,625 Tokens），其他模型为空。</p>
     * @param Usage <p>Token 用量描述，例如视觉/语音类模型有值（如 第1秒 62,500 Tokens，后续每秒 15,625 Tokens），其他模型为空。</p>
     */
    public void setUsage(String Usage) {
        this.Usage = Usage;
    }

    /**
     * Get <p>参考费用/预估费用描述，例如视觉/语音类模型有值（如 第1秒 0.625 元，后续每秒 0.15625 元），其他模型为空。</p> 
     * @return ReferencePrice <p>参考费用/预估费用描述，例如视觉/语音类模型有值（如 第1秒 0.625 元，后续每秒 0.15625 元），其他模型为空。</p>
     */
    public String getReferencePrice() {
        return this.ReferencePrice;
    }

    /**
     * Set <p>参考费用/预估费用描述，例如视觉/语音类模型有值（如 第1秒 0.625 元，后续每秒 0.15625 元），其他模型为空。</p>
     * @param ReferencePrice <p>参考费用/预估费用描述，例如视觉/语音类模型有值（如 第1秒 0.625 元，后续每秒 0.15625 元），其他模型为空。</p>
     */
    public void setReferencePrice(String ReferencePrice) {
        this.ReferencePrice = ReferencePrice;
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
        if (source.PeakPrice != null) {
            this.PeakPrice = new String(source.PeakPrice);
        }
        if (source.Specification != null) {
            this.Specification = new String(source.Specification);
        }
        if (source.Usage != null) {
            this.Usage = new String(source.Usage);
        }
        if (source.ReferencePrice != null) {
            this.ReferencePrice = new String(source.ReferencePrice);
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
        this.setParamSimple(map, prefix + "PeakPrice", this.PeakPrice);
        this.setParamSimple(map, prefix + "Specification", this.Specification);
        this.setParamSimple(map, prefix + "Usage", this.Usage);
        this.setParamSimple(map, prefix + "ReferencePrice", this.ReferencePrice);

    }
}

