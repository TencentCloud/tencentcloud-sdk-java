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

public class RecognizeTableAccurateOCRRequest extends AbstractModel {

    /**
    * 图片/PDF的 Base64 值。要求图片/PDF经Base64编码后不超过 10M，分辨率建议600*800以上，且长宽比小于3（短边分辨率大于600, 长边分辨率小于等于短边分辨率的三倍）。支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * 图片/PDF的 Url 地址。要求图片/PDF经Base64编码后不超过 10M，分辨率建议600*800以上，且长宽比小于3（短边分辨率大于600, 长边分辨率小于等于短边分辨率的三倍）。支持PNG、JPG、JPEG、BMP、PDF格式。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * 需要识别的PDF页面的对应页码，仅支持PDF单页识别，当上传文件为PDF有效，默认值为1。
    */
    @SerializedName("PdfPageNumber")
    @Expose
    private Long PdfPageNumber;

    /**
     * Get 图片/PDF的 Base64 值。要求图片/PDF经Base64编码后不超过 10M，分辨率建议600*800以上，且长宽比小于3（短边分辨率大于600, 长边分辨率小于等于短边分辨率的三倍）。支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。 
     * @return ImageBase64 图片/PDF的 Base64 值。要求图片/PDF经Base64编码后不超过 10M，分辨率建议600*800以上，且长宽比小于3（短边分辨率大于600, 长边分辨率小于等于短边分辨率的三倍）。支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set 图片/PDF的 Base64 值。要求图片/PDF经Base64编码后不超过 10M，分辨率建议600*800以上，且长宽比小于3（短边分辨率大于600, 长边分辨率小于等于短边分辨率的三倍）。支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
     * @param ImageBase64 图片/PDF的 Base64 值。要求图片/PDF经Base64编码后不超过 10M，分辨率建议600*800以上，且长宽比小于3（短边分辨率大于600, 长边分辨率小于等于短边分辨率的三倍）。支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get 图片/PDF的 Url 地址。要求图片/PDF经Base64编码后不超过 10M，分辨率建议600*800以上，且长宽比小于3（短边分辨率大于600, 长边分辨率小于等于短边分辨率的三倍）。支持PNG、JPG、JPEG、BMP、PDF格式。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。 
     * @return ImageUrl 图片/PDF的 Url 地址。要求图片/PDF经Base64编码后不超过 10M，分辨率建议600*800以上，且长宽比小于3（短边分辨率大于600, 长边分辨率小于等于短边分辨率的三倍）。支持PNG、JPG、JPEG、BMP、PDF格式。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 图片/PDF的 Url 地址。要求图片/PDF经Base64编码后不超过 10M，分辨率建议600*800以上，且长宽比小于3（短边分辨率大于600, 长边分辨率小于等于短边分辨率的三倍）。支持PNG、JPG、JPEG、BMP、PDF格式。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。
     * @param ImageUrl 图片/PDF的 Url 地址。要求图片/PDF经Base64编码后不超过 10M，分辨率建议600*800以上，且长宽比小于3（短边分辨率大于600, 长边分辨率小于等于短边分辨率的三倍）。支持PNG、JPG、JPEG、BMP、PDF格式。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get 需要识别的PDF页面的对应页码，仅支持PDF单页识别，当上传文件为PDF有效，默认值为1。 
     * @return PdfPageNumber 需要识别的PDF页面的对应页码，仅支持PDF单页识别，当上传文件为PDF有效，默认值为1。
     */
    public Long getPdfPageNumber() {
        return this.PdfPageNumber;
    }

    /**
     * Set 需要识别的PDF页面的对应页码，仅支持PDF单页识别，当上传文件为PDF有效，默认值为1。
     * @param PdfPageNumber 需要识别的PDF页面的对应页码，仅支持PDF单页识别，当上传文件为PDF有效，默认值为1。
     */
    public void setPdfPageNumber(Long PdfPageNumber) {
        this.PdfPageNumber = PdfPageNumber;
    }

    public RecognizeTableAccurateOCRRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizeTableAccurateOCRRequest(RecognizeTableAccurateOCRRequest source) {
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.PdfPageNumber != null) {
            this.PdfPageNumber = new Long(source.PdfPageNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "PdfPageNumber", this.PdfPageNumber);

    }
}

