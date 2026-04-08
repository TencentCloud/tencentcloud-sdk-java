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

public class EraseHandwrittenImageOCRRequest extends AbstractModel {

    /**
    * 图片/PDF的 Base64 值。要求Base64不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * 图片/PDF的 Url 地址。要求图片经Base64编码后不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * 需要识别的PDF页面的对应页码，仅支持PDF单页识别，默认值为1。
    */
    @SerializedName("PdfPageNumber")
    @Expose
    private Long PdfPageNumber;

    /**
    * 0表示关闭切边，默认为0
1表示开启切边
    */
    @SerializedName("Crop")
    @Expose
    private Long Crop;

    /**
    * 0表示关闭弯曲矫正，默认为0
1表示开启弯曲矫正
    */
    @SerializedName("Deskew")
    @Expose
    private Long Deskew;

    /**
    * 0表示关闭增强锐化，默认为0
1表示开启增强锐化
    */
    @SerializedName("Sharpen")
    @Expose
    private Long Sharpen;

    /**
    * 0表示返回黑白图像
1表示返回彩色图像，默认为1
    */
    @SerializedName("Grayscale")
    @Expose
    private Long Grayscale;

    /**
     * Get 图片/PDF的 Base64 值。要求Base64不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。 
     * @return ImageBase64 图片/PDF的 Base64 值。要求Base64不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set 图片/PDF的 Base64 值。要求Base64不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
     * @param ImageBase64 图片/PDF的 Base64 值。要求Base64不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get 图片/PDF的 Url 地址。要求图片经Base64编码后不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。 
     * @return ImageUrl 图片/PDF的 Url 地址。要求图片经Base64编码后不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 图片/PDF的 Url 地址。要求图片经Base64编码后不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。
     * @param ImageUrl 图片/PDF的 Url 地址。要求图片经Base64编码后不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get 需要识别的PDF页面的对应页码，仅支持PDF单页识别，默认值为1。 
     * @return PdfPageNumber 需要识别的PDF页面的对应页码，仅支持PDF单页识别，默认值为1。
     */
    public Long getPdfPageNumber() {
        return this.PdfPageNumber;
    }

    /**
     * Set 需要识别的PDF页面的对应页码，仅支持PDF单页识别，默认值为1。
     * @param PdfPageNumber 需要识别的PDF页面的对应页码，仅支持PDF单页识别，默认值为1。
     */
    public void setPdfPageNumber(Long PdfPageNumber) {
        this.PdfPageNumber = PdfPageNumber;
    }

    /**
     * Get 0表示关闭切边，默认为0
1表示开启切边 
     * @return Crop 0表示关闭切边，默认为0
1表示开启切边
     */
    public Long getCrop() {
        return this.Crop;
    }

    /**
     * Set 0表示关闭切边，默认为0
1表示开启切边
     * @param Crop 0表示关闭切边，默认为0
1表示开启切边
     */
    public void setCrop(Long Crop) {
        this.Crop = Crop;
    }

    /**
     * Get 0表示关闭弯曲矫正，默认为0
1表示开启弯曲矫正 
     * @return Deskew 0表示关闭弯曲矫正，默认为0
1表示开启弯曲矫正
     */
    public Long getDeskew() {
        return this.Deskew;
    }

    /**
     * Set 0表示关闭弯曲矫正，默认为0
1表示开启弯曲矫正
     * @param Deskew 0表示关闭弯曲矫正，默认为0
1表示开启弯曲矫正
     */
    public void setDeskew(Long Deskew) {
        this.Deskew = Deskew;
    }

    /**
     * Get 0表示关闭增强锐化，默认为0
1表示开启增强锐化 
     * @return Sharpen 0表示关闭增强锐化，默认为0
1表示开启增强锐化
     */
    public Long getSharpen() {
        return this.Sharpen;
    }

    /**
     * Set 0表示关闭增强锐化，默认为0
1表示开启增强锐化
     * @param Sharpen 0表示关闭增强锐化，默认为0
1表示开启增强锐化
     */
    public void setSharpen(Long Sharpen) {
        this.Sharpen = Sharpen;
    }

    /**
     * Get 0表示返回黑白图像
1表示返回彩色图像，默认为1 
     * @return Grayscale 0表示返回黑白图像
1表示返回彩色图像，默认为1
     */
    public Long getGrayscale() {
        return this.Grayscale;
    }

    /**
     * Set 0表示返回黑白图像
1表示返回彩色图像，默认为1
     * @param Grayscale 0表示返回黑白图像
1表示返回彩色图像，默认为1
     */
    public void setGrayscale(Long Grayscale) {
        this.Grayscale = Grayscale;
    }

    public EraseHandwrittenImageOCRRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EraseHandwrittenImageOCRRequest(EraseHandwrittenImageOCRRequest source) {
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.PdfPageNumber != null) {
            this.PdfPageNumber = new Long(source.PdfPageNumber);
        }
        if (source.Crop != null) {
            this.Crop = new Long(source.Crop);
        }
        if (source.Deskew != null) {
            this.Deskew = new Long(source.Deskew);
        }
        if (source.Sharpen != null) {
            this.Sharpen = new Long(source.Sharpen);
        }
        if (source.Grayscale != null) {
            this.Grayscale = new Long(source.Grayscale);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "PdfPageNumber", this.PdfPageNumber);
        this.setParamSimple(map, prefix + "Crop", this.Crop);
        this.setParamSimple(map, prefix + "Deskew", this.Deskew);
        this.setParamSimple(map, prefix + "Sharpen", this.Sharpen);
        this.setParamSimple(map, prefix + "Grayscale", this.Grayscale);

    }
}

