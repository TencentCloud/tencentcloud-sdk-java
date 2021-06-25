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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BankCardOCRRequest extends AbstractModel{

    /**
    * 图片的 Base64 值。要求图片经Base64编码后不超过 7M，分辨率建议500*800以上，支持PNG、JPG、JPEG、BMP格式。建议卡片部分占据图片2/3以上。
图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * 图片的 Url 地址。要求图片经Base64编码后不超过 7M，分辨率建议500*800以上，支持PNG、JPG、JPEG、BMP格式。建议卡片部分占据图片2/3以上。
建议图片存储于腾讯云，可保障更高的下载速度和稳定性。
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * 是否返回预处理（精确剪裁对齐）后的银行卡图片数据，默认false。
    */
    @SerializedName("RetBorderCutImage")
    @Expose
    private Boolean RetBorderCutImage;

    /**
    * 是否返回卡号的切图图片数据，默认false。
    */
    @SerializedName("RetCardNoImage")
    @Expose
    private Boolean RetCardNoImage;

    /**
    * 复印件检测开关，如果输入的图片是银行卡复印件图片则返回告警，默认false。
    */
    @SerializedName("EnableCopyCheck")
    @Expose
    private Boolean EnableCopyCheck;

    /**
    * 翻拍检测开关，如果输入的图片是银行卡翻拍图片则返回告警，默认false。
    */
    @SerializedName("EnableReshootCheck")
    @Expose
    private Boolean EnableReshootCheck;

    /**
    * 边框遮挡检测开关，如果输入的图片是银行卡边框被遮挡则返回告警，默认false。
    */
    @SerializedName("EnableBorderCheck")
    @Expose
    private Boolean EnableBorderCheck;

    /**
    * 是否返回图片质量分数（图片质量分数是评价一个图片的模糊程度的标准），默认false。
    */
    @SerializedName("EnableQualityValue")
    @Expose
    private Boolean EnableQualityValue;

    /**
     * Get 图片的 Base64 值。要求图片经Base64编码后不超过 7M，分辨率建议500*800以上，支持PNG、JPG、JPEG、BMP格式。建议卡片部分占据图片2/3以上。
图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。 
     * @return ImageBase64 图片的 Base64 值。要求图片经Base64编码后不超过 7M，分辨率建议500*800以上，支持PNG、JPG、JPEG、BMP格式。建议卡片部分占据图片2/3以上。
图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set 图片的 Base64 值。要求图片经Base64编码后不超过 7M，分辨率建议500*800以上，支持PNG、JPG、JPEG、BMP格式。建议卡片部分占据图片2/3以上。
图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
     * @param ImageBase64 图片的 Base64 值。要求图片经Base64编码后不超过 7M，分辨率建议500*800以上，支持PNG、JPG、JPEG、BMP格式。建议卡片部分占据图片2/3以上。
图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get 图片的 Url 地址。要求图片经Base64编码后不超过 7M，分辨率建议500*800以上，支持PNG、JPG、JPEG、BMP格式。建议卡片部分占据图片2/3以上。
建议图片存储于腾讯云，可保障更高的下载速度和稳定性。 
     * @return ImageUrl 图片的 Url 地址。要求图片经Base64编码后不超过 7M，分辨率建议500*800以上，支持PNG、JPG、JPEG、BMP格式。建议卡片部分占据图片2/3以上。
建议图片存储于腾讯云，可保障更高的下载速度和稳定性。
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 图片的 Url 地址。要求图片经Base64编码后不超过 7M，分辨率建议500*800以上，支持PNG、JPG、JPEG、BMP格式。建议卡片部分占据图片2/3以上。
建议图片存储于腾讯云，可保障更高的下载速度和稳定性。
     * @param ImageUrl 图片的 Url 地址。要求图片经Base64编码后不超过 7M，分辨率建议500*800以上，支持PNG、JPG、JPEG、BMP格式。建议卡片部分占据图片2/3以上。
建议图片存储于腾讯云，可保障更高的下载速度和稳定性。
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get 是否返回预处理（精确剪裁对齐）后的银行卡图片数据，默认false。 
     * @return RetBorderCutImage 是否返回预处理（精确剪裁对齐）后的银行卡图片数据，默认false。
     */
    public Boolean getRetBorderCutImage() {
        return this.RetBorderCutImage;
    }

    /**
     * Set 是否返回预处理（精确剪裁对齐）后的银行卡图片数据，默认false。
     * @param RetBorderCutImage 是否返回预处理（精确剪裁对齐）后的银行卡图片数据，默认false。
     */
    public void setRetBorderCutImage(Boolean RetBorderCutImage) {
        this.RetBorderCutImage = RetBorderCutImage;
    }

    /**
     * Get 是否返回卡号的切图图片数据，默认false。 
     * @return RetCardNoImage 是否返回卡号的切图图片数据，默认false。
     */
    public Boolean getRetCardNoImage() {
        return this.RetCardNoImage;
    }

    /**
     * Set 是否返回卡号的切图图片数据，默认false。
     * @param RetCardNoImage 是否返回卡号的切图图片数据，默认false。
     */
    public void setRetCardNoImage(Boolean RetCardNoImage) {
        this.RetCardNoImage = RetCardNoImage;
    }

    /**
     * Get 复印件检测开关，如果输入的图片是银行卡复印件图片则返回告警，默认false。 
     * @return EnableCopyCheck 复印件检测开关，如果输入的图片是银行卡复印件图片则返回告警，默认false。
     */
    public Boolean getEnableCopyCheck() {
        return this.EnableCopyCheck;
    }

    /**
     * Set 复印件检测开关，如果输入的图片是银行卡复印件图片则返回告警，默认false。
     * @param EnableCopyCheck 复印件检测开关，如果输入的图片是银行卡复印件图片则返回告警，默认false。
     */
    public void setEnableCopyCheck(Boolean EnableCopyCheck) {
        this.EnableCopyCheck = EnableCopyCheck;
    }

    /**
     * Get 翻拍检测开关，如果输入的图片是银行卡翻拍图片则返回告警，默认false。 
     * @return EnableReshootCheck 翻拍检测开关，如果输入的图片是银行卡翻拍图片则返回告警，默认false。
     */
    public Boolean getEnableReshootCheck() {
        return this.EnableReshootCheck;
    }

    /**
     * Set 翻拍检测开关，如果输入的图片是银行卡翻拍图片则返回告警，默认false。
     * @param EnableReshootCheck 翻拍检测开关，如果输入的图片是银行卡翻拍图片则返回告警，默认false。
     */
    public void setEnableReshootCheck(Boolean EnableReshootCheck) {
        this.EnableReshootCheck = EnableReshootCheck;
    }

    /**
     * Get 边框遮挡检测开关，如果输入的图片是银行卡边框被遮挡则返回告警，默认false。 
     * @return EnableBorderCheck 边框遮挡检测开关，如果输入的图片是银行卡边框被遮挡则返回告警，默认false。
     */
    public Boolean getEnableBorderCheck() {
        return this.EnableBorderCheck;
    }

    /**
     * Set 边框遮挡检测开关，如果输入的图片是银行卡边框被遮挡则返回告警，默认false。
     * @param EnableBorderCheck 边框遮挡检测开关，如果输入的图片是银行卡边框被遮挡则返回告警，默认false。
     */
    public void setEnableBorderCheck(Boolean EnableBorderCheck) {
        this.EnableBorderCheck = EnableBorderCheck;
    }

    /**
     * Get 是否返回图片质量分数（图片质量分数是评价一个图片的模糊程度的标准），默认false。 
     * @return EnableQualityValue 是否返回图片质量分数（图片质量分数是评价一个图片的模糊程度的标准），默认false。
     */
    public Boolean getEnableQualityValue() {
        return this.EnableQualityValue;
    }

    /**
     * Set 是否返回图片质量分数（图片质量分数是评价一个图片的模糊程度的标准），默认false。
     * @param EnableQualityValue 是否返回图片质量分数（图片质量分数是评价一个图片的模糊程度的标准），默认false。
     */
    public void setEnableQualityValue(Boolean EnableQualityValue) {
        this.EnableQualityValue = EnableQualityValue;
    }

    public BankCardOCRRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BankCardOCRRequest(BankCardOCRRequest source) {
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.RetBorderCutImage != null) {
            this.RetBorderCutImage = new Boolean(source.RetBorderCutImage);
        }
        if (source.RetCardNoImage != null) {
            this.RetCardNoImage = new Boolean(source.RetCardNoImage);
        }
        if (source.EnableCopyCheck != null) {
            this.EnableCopyCheck = new Boolean(source.EnableCopyCheck);
        }
        if (source.EnableReshootCheck != null) {
            this.EnableReshootCheck = new Boolean(source.EnableReshootCheck);
        }
        if (source.EnableBorderCheck != null) {
            this.EnableBorderCheck = new Boolean(source.EnableBorderCheck);
        }
        if (source.EnableQualityValue != null) {
            this.EnableQualityValue = new Boolean(source.EnableQualityValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "RetBorderCutImage", this.RetBorderCutImage);
        this.setParamSimple(map, prefix + "RetCardNoImage", this.RetCardNoImage);
        this.setParamSimple(map, prefix + "EnableCopyCheck", this.EnableCopyCheck);
        this.setParamSimple(map, prefix + "EnableReshootCheck", this.EnableReshootCheck);
        this.setParamSimple(map, prefix + "EnableBorderCheck", this.EnableBorderCheck);
        this.setParamSimple(map, prefix + "EnableQualityValue", this.EnableQualityValue);

    }
}

