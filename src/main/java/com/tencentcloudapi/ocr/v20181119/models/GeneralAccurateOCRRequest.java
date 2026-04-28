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

public class GeneralAccurateOCRRequest extends AbstractModel {

    /**
    * <p>图片/PDF的 Base64 值。要求图片经Base64编码后不超过 10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。</p>
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * <p>图片/PDF的 Url 地址。要求图片经Base64编码后不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。</p>
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * <p>是否返回单字信息，默认值为false，注：仅ConfigID配置为OCR时支持。</p>
    */
    @SerializedName("IsWords")
    @Expose
    private Boolean IsWords;

    /**
    * <p>是否开启原图切图检测功能，开启后可提升“整图面积大，但单字符占比面积小”（例如：试卷）场景下的识别效果，默认关，注：仅ConfigID配置为OCR时支持。</p>
    */
    @SerializedName("EnableDetectSplit")
    @Expose
    private Boolean EnableDetectSplit;

    /**
    * <p>是否开启PDF识别，默认值为false，开启后可同时支持图片和PDF的识别。</p>
    */
    @SerializedName("IsPdf")
    @Expose
    private Boolean IsPdf;

    /**
    * <p>需要识别的PDF页面的对应页码，仅支持PDF单页识别，当上传文件为PDF且IsPdf参数值为true时有效，默认值为1。</p>
    */
    @SerializedName("PdfPageNumber")
    @Expose
    private Long PdfPageNumber;

    /**
    * <p>文本检测开关，默认为true。设置为false可直接进行单行识别，适用于仅包含正向单行文本的图片场景。</p>
    */
    @SerializedName("EnableDetectText")
    @Expose
    private Boolean EnableDetectText;

    /**
    * <p>配置ID支持： OCR -- 通用场景 MulOCR--多语种场景，默认值为OCR</p>
    */
    @SerializedName("ConfigID")
    @Expose
    private String ConfigID;

    /**
    * <p>需要识别的文字类型，默认识别全部类型的文字。 0：自动识别全部类型文字 1：仅识别手写体文字 2：仅识别印刷体文字</p><p>当config id=OCR 且 iswords 是false 时 才生效</p>
    */
    @SerializedName("WordsType")
    @Expose
    private String WordsType;

    /**
     * Get <p>图片/PDF的 Base64 值。要求图片经Base64编码后不超过 10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。</p> 
     * @return ImageBase64 <p>图片/PDF的 Base64 值。要求图片经Base64编码后不超过 10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。</p>
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set <p>图片/PDF的 Base64 值。要求图片经Base64编码后不超过 10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。</p>
     * @param ImageBase64 <p>图片/PDF的 Base64 值。要求图片经Base64编码后不超过 10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。</p>
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get <p>图片/PDF的 Url 地址。要求图片经Base64编码后不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。</p> 
     * @return ImageUrl <p>图片/PDF的 Url 地址。要求图片经Base64编码后不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。</p>
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set <p>图片/PDF的 Url 地址。要求图片经Base64编码后不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。</p>
     * @param ImageUrl <p>图片/PDF的 Url 地址。要求图片经Base64编码后不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。</p>
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get <p>是否返回单字信息，默认值为false，注：仅ConfigID配置为OCR时支持。</p> 
     * @return IsWords <p>是否返回单字信息，默认值为false，注：仅ConfigID配置为OCR时支持。</p>
     */
    public Boolean getIsWords() {
        return this.IsWords;
    }

    /**
     * Set <p>是否返回单字信息，默认值为false，注：仅ConfigID配置为OCR时支持。</p>
     * @param IsWords <p>是否返回单字信息，默认值为false，注：仅ConfigID配置为OCR时支持。</p>
     */
    public void setIsWords(Boolean IsWords) {
        this.IsWords = IsWords;
    }

    /**
     * Get <p>是否开启原图切图检测功能，开启后可提升“整图面积大，但单字符占比面积小”（例如：试卷）场景下的识别效果，默认关，注：仅ConfigID配置为OCR时支持。</p> 
     * @return EnableDetectSplit <p>是否开启原图切图检测功能，开启后可提升“整图面积大，但单字符占比面积小”（例如：试卷）场景下的识别效果，默认关，注：仅ConfigID配置为OCR时支持。</p>
     */
    public Boolean getEnableDetectSplit() {
        return this.EnableDetectSplit;
    }

    /**
     * Set <p>是否开启原图切图检测功能，开启后可提升“整图面积大，但单字符占比面积小”（例如：试卷）场景下的识别效果，默认关，注：仅ConfigID配置为OCR时支持。</p>
     * @param EnableDetectSplit <p>是否开启原图切图检测功能，开启后可提升“整图面积大，但单字符占比面积小”（例如：试卷）场景下的识别效果，默认关，注：仅ConfigID配置为OCR时支持。</p>
     */
    public void setEnableDetectSplit(Boolean EnableDetectSplit) {
        this.EnableDetectSplit = EnableDetectSplit;
    }

    /**
     * Get <p>是否开启PDF识别，默认值为false，开启后可同时支持图片和PDF的识别。</p> 
     * @return IsPdf <p>是否开启PDF识别，默认值为false，开启后可同时支持图片和PDF的识别。</p>
     */
    public Boolean getIsPdf() {
        return this.IsPdf;
    }

    /**
     * Set <p>是否开启PDF识别，默认值为false，开启后可同时支持图片和PDF的识别。</p>
     * @param IsPdf <p>是否开启PDF识别，默认值为false，开启后可同时支持图片和PDF的识别。</p>
     */
    public void setIsPdf(Boolean IsPdf) {
        this.IsPdf = IsPdf;
    }

    /**
     * Get <p>需要识别的PDF页面的对应页码，仅支持PDF单页识别，当上传文件为PDF且IsPdf参数值为true时有效，默认值为1。</p> 
     * @return PdfPageNumber <p>需要识别的PDF页面的对应页码，仅支持PDF单页识别，当上传文件为PDF且IsPdf参数值为true时有效，默认值为1。</p>
     */
    public Long getPdfPageNumber() {
        return this.PdfPageNumber;
    }

    /**
     * Set <p>需要识别的PDF页面的对应页码，仅支持PDF单页识别，当上传文件为PDF且IsPdf参数值为true时有效，默认值为1。</p>
     * @param PdfPageNumber <p>需要识别的PDF页面的对应页码，仅支持PDF单页识别，当上传文件为PDF且IsPdf参数值为true时有效，默认值为1。</p>
     */
    public void setPdfPageNumber(Long PdfPageNumber) {
        this.PdfPageNumber = PdfPageNumber;
    }

    /**
     * Get <p>文本检测开关，默认为true。设置为false可直接进行单行识别，适用于仅包含正向单行文本的图片场景。</p> 
     * @return EnableDetectText <p>文本检测开关，默认为true。设置为false可直接进行单行识别，适用于仅包含正向单行文本的图片场景。</p>
     */
    public Boolean getEnableDetectText() {
        return this.EnableDetectText;
    }

    /**
     * Set <p>文本检测开关，默认为true。设置为false可直接进行单行识别，适用于仅包含正向单行文本的图片场景。</p>
     * @param EnableDetectText <p>文本检测开关，默认为true。设置为false可直接进行单行识别，适用于仅包含正向单行文本的图片场景。</p>
     */
    public void setEnableDetectText(Boolean EnableDetectText) {
        this.EnableDetectText = EnableDetectText;
    }

    /**
     * Get <p>配置ID支持： OCR -- 通用场景 MulOCR--多语种场景，默认值为OCR</p> 
     * @return ConfigID <p>配置ID支持： OCR -- 通用场景 MulOCR--多语种场景，默认值为OCR</p>
     */
    public String getConfigID() {
        return this.ConfigID;
    }

    /**
     * Set <p>配置ID支持： OCR -- 通用场景 MulOCR--多语种场景，默认值为OCR</p>
     * @param ConfigID <p>配置ID支持： OCR -- 通用场景 MulOCR--多语种场景，默认值为OCR</p>
     */
    public void setConfigID(String ConfigID) {
        this.ConfigID = ConfigID;
    }

    /**
     * Get <p>需要识别的文字类型，默认识别全部类型的文字。 0：自动识别全部类型文字 1：仅识别手写体文字 2：仅识别印刷体文字</p><p>当config id=OCR 且 iswords 是false 时 才生效</p> 
     * @return WordsType <p>需要识别的文字类型，默认识别全部类型的文字。 0：自动识别全部类型文字 1：仅识别手写体文字 2：仅识别印刷体文字</p><p>当config id=OCR 且 iswords 是false 时 才生效</p>
     */
    public String getWordsType() {
        return this.WordsType;
    }

    /**
     * Set <p>需要识别的文字类型，默认识别全部类型的文字。 0：自动识别全部类型文字 1：仅识别手写体文字 2：仅识别印刷体文字</p><p>当config id=OCR 且 iswords 是false 时 才生效</p>
     * @param WordsType <p>需要识别的文字类型，默认识别全部类型的文字。 0：自动识别全部类型文字 1：仅识别手写体文字 2：仅识别印刷体文字</p><p>当config id=OCR 且 iswords 是false 时 才生效</p>
     */
    public void setWordsType(String WordsType) {
        this.WordsType = WordsType;
    }

    public GeneralAccurateOCRRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GeneralAccurateOCRRequest(GeneralAccurateOCRRequest source) {
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.IsWords != null) {
            this.IsWords = new Boolean(source.IsWords);
        }
        if (source.EnableDetectSplit != null) {
            this.EnableDetectSplit = new Boolean(source.EnableDetectSplit);
        }
        if (source.IsPdf != null) {
            this.IsPdf = new Boolean(source.IsPdf);
        }
        if (source.PdfPageNumber != null) {
            this.PdfPageNumber = new Long(source.PdfPageNumber);
        }
        if (source.EnableDetectText != null) {
            this.EnableDetectText = new Boolean(source.EnableDetectText);
        }
        if (source.ConfigID != null) {
            this.ConfigID = new String(source.ConfigID);
        }
        if (source.WordsType != null) {
            this.WordsType = new String(source.WordsType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "IsWords", this.IsWords);
        this.setParamSimple(map, prefix + "EnableDetectSplit", this.EnableDetectSplit);
        this.setParamSimple(map, prefix + "IsPdf", this.IsPdf);
        this.setParamSimple(map, prefix + "PdfPageNumber", this.PdfPageNumber);
        this.setParamSimple(map, prefix + "EnableDetectText", this.EnableDetectText);
        this.setParamSimple(map, prefix + "ConfigID", this.ConfigID);
        this.setParamSimple(map, prefix + "WordsType", this.WordsType);

    }
}

