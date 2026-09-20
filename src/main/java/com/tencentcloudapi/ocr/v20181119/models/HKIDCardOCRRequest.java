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

public class HKIDCardOCRRequest extends AbstractModel {

    /**
    * <p>是否返回人像照片。</p>
    */
    @SerializedName("ReturnHeadImage")
    @Expose
    private Boolean ReturnHeadImage;

    /**
    * <p>是否鉴伪。</p>
    */
    @SerializedName("DetectFake")
    @Expose
    private Boolean DetectFake;

    /**
    * <p>图片的 Base64 值。支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。支持的图片大小：所下载图片经Base64编码后不超过 10M。图片下载时间不超过 3 秒。</p>
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * <p>图片的 Url 地址。支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。支持的图片大小：所下载图片经 Base64 编码后不超过 10M。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。</p>
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
     * Get <p>是否返回人像照片。</p> 
     * @return ReturnHeadImage <p>是否返回人像照片。</p>
     */
    public Boolean getReturnHeadImage() {
        return this.ReturnHeadImage;
    }

    /**
     * Set <p>是否返回人像照片。</p>
     * @param ReturnHeadImage <p>是否返回人像照片。</p>
     */
    public void setReturnHeadImage(Boolean ReturnHeadImage) {
        this.ReturnHeadImage = ReturnHeadImage;
    }

    /**
     * Get <p>是否鉴伪。</p> 
     * @return DetectFake <p>是否鉴伪。</p>
     * @deprecated
     */
    @Deprecated
    public Boolean getDetectFake() {
        return this.DetectFake;
    }

    /**
     * Set <p>是否鉴伪。</p>
     * @param DetectFake <p>是否鉴伪。</p>
     * @deprecated
     */
    @Deprecated
    public void setDetectFake(Boolean DetectFake) {
        this.DetectFake = DetectFake;
    }

    /**
     * Get <p>图片的 Base64 值。支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。支持的图片大小：所下载图片经Base64编码后不超过 10M。图片下载时间不超过 3 秒。</p> 
     * @return ImageBase64 <p>图片的 Base64 值。支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。支持的图片大小：所下载图片经Base64编码后不超过 10M。图片下载时间不超过 3 秒。</p>
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set <p>图片的 Base64 值。支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。支持的图片大小：所下载图片经Base64编码后不超过 10M。图片下载时间不超过 3 秒。</p>
     * @param ImageBase64 <p>图片的 Base64 值。支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。支持的图片大小：所下载图片经Base64编码后不超过 10M。图片下载时间不超过 3 秒。</p>
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get <p>图片的 Url 地址。支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。支持的图片大小：所下载图片经 Base64 编码后不超过 10M。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。</p> 
     * @return ImageUrl <p>图片的 Url 地址。支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。支持的图片大小：所下载图片经 Base64 编码后不超过 10M。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。</p>
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set <p>图片的 Url 地址。支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。支持的图片大小：所下载图片经 Base64 编码后不超过 10M。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。</p>
     * @param ImageUrl <p>图片的 Url 地址。支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。支持的图片大小：所下载图片经 Base64 编码后不超过 10M。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。</p>
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    public HKIDCardOCRRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HKIDCardOCRRequest(HKIDCardOCRRequest source) {
        if (source.ReturnHeadImage != null) {
            this.ReturnHeadImage = new Boolean(source.ReturnHeadImage);
        }
        if (source.DetectFake != null) {
            this.DetectFake = new Boolean(source.DetectFake);
        }
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReturnHeadImage", this.ReturnHeadImage);
        this.setParamSimple(map, prefix + "DetectFake", this.DetectFake);
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);

    }
}

