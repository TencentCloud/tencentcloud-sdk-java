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

public class CropEnhanceImageOCRRequest extends AbstractModel {

    /**
    * <p>图片/PDF的 Base64 值。要求Base64不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。</p>
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
    * <p>需要识别的PDF页面的对应页码，仅支持PDF单页识别，默认值为1。</p>
    */
    @SerializedName("PdfPageNumber")
    @Expose
    private Long PdfPageNumber;

    /**
    * <p>0表示关闭切边<br>1表示开启切边，默认为1</p>
    */
    @SerializedName("Crop")
    @Expose
    private Long Crop;

    /**
    * <p>0表示关闭弯曲矫正<br>1表示开启弯曲矫正，默认为1</p>
    */
    @SerializedName("Deskew")
    @Expose
    private Long Deskew;

    /**
    * <p>0表示返回处理后的图和坐标，默认为0<br>1表示只返回坐标，不返回图片</p>
    */
    @SerializedName("OnlyPosition")
    @Expose
    private Long OnlyPosition;

    /**
    * <p>默认-1</p><ul><li>-1 不处理增强</li><li>1 增亮</li><li>2 增强并锐化</li><li>3 黑白</li><li>4 灰度</li><li>5 去阴影增强</li><li>6 点阵图</li></ul>
    */
    @SerializedName("EnhanceType")
    @Expose
    private Long EnhanceType;

    /**
    * <p>0表示不矫正图像方向，默认为0  1表示矫正图像方向</p>
    */
    @SerializedName("AdjustOrientation")
    @Expose
    private Long AdjustOrientation;

    /**
     * Get <p>图片/PDF的 Base64 值。要求Base64不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。</p> 
     * @return ImageBase64 <p>图片/PDF的 Base64 值。要求Base64不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。</p>
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set <p>图片/PDF的 Base64 值。要求Base64不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。</p>
     * @param ImageBase64 <p>图片/PDF的 Base64 值。要求Base64不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。</p>
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
     * Get <p>需要识别的PDF页面的对应页码，仅支持PDF单页识别，默认值为1。</p> 
     * @return PdfPageNumber <p>需要识别的PDF页面的对应页码，仅支持PDF单页识别，默认值为1。</p>
     */
    public Long getPdfPageNumber() {
        return this.PdfPageNumber;
    }

    /**
     * Set <p>需要识别的PDF页面的对应页码，仅支持PDF单页识别，默认值为1。</p>
     * @param PdfPageNumber <p>需要识别的PDF页面的对应页码，仅支持PDF单页识别，默认值为1。</p>
     */
    public void setPdfPageNumber(Long PdfPageNumber) {
        this.PdfPageNumber = PdfPageNumber;
    }

    /**
     * Get <p>0表示关闭切边<br>1表示开启切边，默认为1</p> 
     * @return Crop <p>0表示关闭切边<br>1表示开启切边，默认为1</p>
     */
    public Long getCrop() {
        return this.Crop;
    }

    /**
     * Set <p>0表示关闭切边<br>1表示开启切边，默认为1</p>
     * @param Crop <p>0表示关闭切边<br>1表示开启切边，默认为1</p>
     */
    public void setCrop(Long Crop) {
        this.Crop = Crop;
    }

    /**
     * Get <p>0表示关闭弯曲矫正<br>1表示开启弯曲矫正，默认为1</p> 
     * @return Deskew <p>0表示关闭弯曲矫正<br>1表示开启弯曲矫正，默认为1</p>
     */
    public Long getDeskew() {
        return this.Deskew;
    }

    /**
     * Set <p>0表示关闭弯曲矫正<br>1表示开启弯曲矫正，默认为1</p>
     * @param Deskew <p>0表示关闭弯曲矫正<br>1表示开启弯曲矫正，默认为1</p>
     */
    public void setDeskew(Long Deskew) {
        this.Deskew = Deskew;
    }

    /**
     * Get <p>0表示返回处理后的图和坐标，默认为0<br>1表示只返回坐标，不返回图片</p> 
     * @return OnlyPosition <p>0表示返回处理后的图和坐标，默认为0<br>1表示只返回坐标，不返回图片</p>
     */
    public Long getOnlyPosition() {
        return this.OnlyPosition;
    }

    /**
     * Set <p>0表示返回处理后的图和坐标，默认为0<br>1表示只返回坐标，不返回图片</p>
     * @param OnlyPosition <p>0表示返回处理后的图和坐标，默认为0<br>1表示只返回坐标，不返回图片</p>
     */
    public void setOnlyPosition(Long OnlyPosition) {
        this.OnlyPosition = OnlyPosition;
    }

    /**
     * Get <p>默认-1</p><ul><li>-1 不处理增强</li><li>1 增亮</li><li>2 增强并锐化</li><li>3 黑白</li><li>4 灰度</li><li>5 去阴影增强</li><li>6 点阵图</li></ul> 
     * @return EnhanceType <p>默认-1</p><ul><li>-1 不处理增强</li><li>1 增亮</li><li>2 增强并锐化</li><li>3 黑白</li><li>4 灰度</li><li>5 去阴影增强</li><li>6 点阵图</li></ul>
     */
    public Long getEnhanceType() {
        return this.EnhanceType;
    }

    /**
     * Set <p>默认-1</p><ul><li>-1 不处理增强</li><li>1 增亮</li><li>2 增强并锐化</li><li>3 黑白</li><li>4 灰度</li><li>5 去阴影增强</li><li>6 点阵图</li></ul>
     * @param EnhanceType <p>默认-1</p><ul><li>-1 不处理增强</li><li>1 增亮</li><li>2 增强并锐化</li><li>3 黑白</li><li>4 灰度</li><li>5 去阴影增强</li><li>6 点阵图</li></ul>
     */
    public void setEnhanceType(Long EnhanceType) {
        this.EnhanceType = EnhanceType;
    }

    /**
     * Get <p>0表示不矫正图像方向，默认为0  1表示矫正图像方向</p> 
     * @return AdjustOrientation <p>0表示不矫正图像方向，默认为0  1表示矫正图像方向</p>
     */
    public Long getAdjustOrientation() {
        return this.AdjustOrientation;
    }

    /**
     * Set <p>0表示不矫正图像方向，默认为0  1表示矫正图像方向</p>
     * @param AdjustOrientation <p>0表示不矫正图像方向，默认为0  1表示矫正图像方向</p>
     */
    public void setAdjustOrientation(Long AdjustOrientation) {
        this.AdjustOrientation = AdjustOrientation;
    }

    public CropEnhanceImageOCRRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CropEnhanceImageOCRRequest(CropEnhanceImageOCRRequest source) {
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
        if (source.OnlyPosition != null) {
            this.OnlyPosition = new Long(source.OnlyPosition);
        }
        if (source.EnhanceType != null) {
            this.EnhanceType = new Long(source.EnhanceType);
        }
        if (source.AdjustOrientation != null) {
            this.AdjustOrientation = new Long(source.AdjustOrientation);
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
        this.setParamSimple(map, prefix + "OnlyPosition", this.OnlyPosition);
        this.setParamSimple(map, prefix + "EnhanceType", this.EnhanceType);
        this.setParamSimple(map, prefix + "AdjustOrientation", this.AdjustOrientation);

    }
}

