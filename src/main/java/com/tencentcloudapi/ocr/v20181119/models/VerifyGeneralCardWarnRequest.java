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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VerifyGeneralCardWarnRequest extends AbstractModel {

    /**
    * <p>卡证类型参数，仅支持传入下列指定值，请按实际情况选择对应卡证类型，目前支持以下类型：<br><strong>身份证件</strong><br>0101 身份证<br>0102 护照<br><strong>经营证照</strong><br>0201 营业执照<br><strong>权属登记</strong><br>0301 行驶证<br><strong>资格许可</strong><br>0401 驾驶证</p>
    */
    @SerializedName("CardType")
    @Expose
    private String CardType;

    /**
    * <p>图片的 Url 地址。要求图片经Base64编码后不超过 10M。</p>
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * <p>图片的 Base64 值。要求图片经Base64编码后不超过 10M。</p>
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * <p>推理 Prompt 模板，默认使用 VLM 对图片进行理解推理，同时支持使用 ${变量名} 进行推理。传入该参数即开启推理流程。</p><p>入参限制：长度限制：1–3000 字符</p>
    */
    @SerializedName("ReasoningPrompt")
    @Expose
    private String ReasoningPrompt;

    /**
    * <p>推理输出配置。当 ReasoningPrompt 传入时建议同步传入，未传入时使用默认配置（OutputMode=enum, EnumValues=[&quot;true&quot;,&quot;false&quot;], EnableImageInput=true）。</p>
    */
    @SerializedName("ReasoningConfig")
    @Expose
    private ReasoningConfig ReasoningConfig;

    /**
    * <p>水印提示排除类型，选择出参“水印提示”排除掉的水印类型，不传的话即代表任意水印都会提示。 PhoneCam：手机相机水印  WatermarkCam：水印相机水印</p>
    */
    @SerializedName("IgnoreWatermarkCategories")
    @Expose
    private String [] IgnoreWatermarkCategories;

    /**
     * Get <p>卡证类型参数，仅支持传入下列指定值，请按实际情况选择对应卡证类型，目前支持以下类型：<br><strong>身份证件</strong><br>0101 身份证<br>0102 护照<br><strong>经营证照</strong><br>0201 营业执照<br><strong>权属登记</strong><br>0301 行驶证<br><strong>资格许可</strong><br>0401 驾驶证</p> 
     * @return CardType <p>卡证类型参数，仅支持传入下列指定值，请按实际情况选择对应卡证类型，目前支持以下类型：<br><strong>身份证件</strong><br>0101 身份证<br>0102 护照<br><strong>经营证照</strong><br>0201 营业执照<br><strong>权属登记</strong><br>0301 行驶证<br><strong>资格许可</strong><br>0401 驾驶证</p>
     */
    public String getCardType() {
        return this.CardType;
    }

    /**
     * Set <p>卡证类型参数，仅支持传入下列指定值，请按实际情况选择对应卡证类型，目前支持以下类型：<br><strong>身份证件</strong><br>0101 身份证<br>0102 护照<br><strong>经营证照</strong><br>0201 营业执照<br><strong>权属登记</strong><br>0301 行驶证<br><strong>资格许可</strong><br>0401 驾驶证</p>
     * @param CardType <p>卡证类型参数，仅支持传入下列指定值，请按实际情况选择对应卡证类型，目前支持以下类型：<br><strong>身份证件</strong><br>0101 身份证<br>0102 护照<br><strong>经营证照</strong><br>0201 营业执照<br><strong>权属登记</strong><br>0301 行驶证<br><strong>资格许可</strong><br>0401 驾驶证</p>
     */
    public void setCardType(String CardType) {
        this.CardType = CardType;
    }

    /**
     * Get <p>图片的 Url 地址。要求图片经Base64编码后不超过 10M。</p> 
     * @return ImageUrl <p>图片的 Url 地址。要求图片经Base64编码后不超过 10M。</p>
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set <p>图片的 Url 地址。要求图片经Base64编码后不超过 10M。</p>
     * @param ImageUrl <p>图片的 Url 地址。要求图片经Base64编码后不超过 10M。</p>
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get <p>图片的 Base64 值。要求图片经Base64编码后不超过 10M。</p> 
     * @return ImageBase64 <p>图片的 Base64 值。要求图片经Base64编码后不超过 10M。</p>
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set <p>图片的 Base64 值。要求图片经Base64编码后不超过 10M。</p>
     * @param ImageBase64 <p>图片的 Base64 值。要求图片经Base64编码后不超过 10M。</p>
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get <p>推理 Prompt 模板，默认使用 VLM 对图片进行理解推理，同时支持使用 ${变量名} 进行推理。传入该参数即开启推理流程。</p><p>入参限制：长度限制：1–3000 字符</p> 
     * @return ReasoningPrompt <p>推理 Prompt 模板，默认使用 VLM 对图片进行理解推理，同时支持使用 ${变量名} 进行推理。传入该参数即开启推理流程。</p><p>入参限制：长度限制：1–3000 字符</p>
     */
    public String getReasoningPrompt() {
        return this.ReasoningPrompt;
    }

    /**
     * Set <p>推理 Prompt 模板，默认使用 VLM 对图片进行理解推理，同时支持使用 ${变量名} 进行推理。传入该参数即开启推理流程。</p><p>入参限制：长度限制：1–3000 字符</p>
     * @param ReasoningPrompt <p>推理 Prompt 模板，默认使用 VLM 对图片进行理解推理，同时支持使用 ${变量名} 进行推理。传入该参数即开启推理流程。</p><p>入参限制：长度限制：1–3000 字符</p>
     */
    public void setReasoningPrompt(String ReasoningPrompt) {
        this.ReasoningPrompt = ReasoningPrompt;
    }

    /**
     * Get <p>推理输出配置。当 ReasoningPrompt 传入时建议同步传入，未传入时使用默认配置（OutputMode=enum, EnumValues=[&quot;true&quot;,&quot;false&quot;], EnableImageInput=true）。</p> 
     * @return ReasoningConfig <p>推理输出配置。当 ReasoningPrompt 传入时建议同步传入，未传入时使用默认配置（OutputMode=enum, EnumValues=[&quot;true&quot;,&quot;false&quot;], EnableImageInput=true）。</p>
     */
    public ReasoningConfig getReasoningConfig() {
        return this.ReasoningConfig;
    }

    /**
     * Set <p>推理输出配置。当 ReasoningPrompt 传入时建议同步传入，未传入时使用默认配置（OutputMode=enum, EnumValues=[&quot;true&quot;,&quot;false&quot;], EnableImageInput=true）。</p>
     * @param ReasoningConfig <p>推理输出配置。当 ReasoningPrompt 传入时建议同步传入，未传入时使用默认配置（OutputMode=enum, EnumValues=[&quot;true&quot;,&quot;false&quot;], EnableImageInput=true）。</p>
     */
    public void setReasoningConfig(ReasoningConfig ReasoningConfig) {
        this.ReasoningConfig = ReasoningConfig;
    }

    /**
     * Get <p>水印提示排除类型，选择出参“水印提示”排除掉的水印类型，不传的话即代表任意水印都会提示。 PhoneCam：手机相机水印  WatermarkCam：水印相机水印</p> 
     * @return IgnoreWatermarkCategories <p>水印提示排除类型，选择出参“水印提示”排除掉的水印类型，不传的话即代表任意水印都会提示。 PhoneCam：手机相机水印  WatermarkCam：水印相机水印</p>
     */
    public String [] getIgnoreWatermarkCategories() {
        return this.IgnoreWatermarkCategories;
    }

    /**
     * Set <p>水印提示排除类型，选择出参“水印提示”排除掉的水印类型，不传的话即代表任意水印都会提示。 PhoneCam：手机相机水印  WatermarkCam：水印相机水印</p>
     * @param IgnoreWatermarkCategories <p>水印提示排除类型，选择出参“水印提示”排除掉的水印类型，不传的话即代表任意水印都会提示。 PhoneCam：手机相机水印  WatermarkCam：水印相机水印</p>
     */
    public void setIgnoreWatermarkCategories(String [] IgnoreWatermarkCategories) {
        this.IgnoreWatermarkCategories = IgnoreWatermarkCategories;
    }

    public VerifyGeneralCardWarnRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerifyGeneralCardWarnRequest(VerifyGeneralCardWarnRequest source) {
        if (source.CardType != null) {
            this.CardType = new String(source.CardType);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.ReasoningPrompt != null) {
            this.ReasoningPrompt = new String(source.ReasoningPrompt);
        }
        if (source.ReasoningConfig != null) {
            this.ReasoningConfig = new ReasoningConfig(source.ReasoningConfig);
        }
        if (source.IgnoreWatermarkCategories != null) {
            this.IgnoreWatermarkCategories = new String[source.IgnoreWatermarkCategories.length];
            for (int i = 0; i < source.IgnoreWatermarkCategories.length; i++) {
                this.IgnoreWatermarkCategories[i] = new String(source.IgnoreWatermarkCategories[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CardType", this.CardType);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "ReasoningPrompt", this.ReasoningPrompt);
        this.setParamObj(map, prefix + "ReasoningConfig.", this.ReasoningConfig);
        this.setParamArraySimple(map, prefix + "IgnoreWatermarkCategories.", this.IgnoreWatermarkCategories);

    }
}

