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
package com.tencentcloudapi.tiia.v20190529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetectEnvelopeRequest extends AbstractModel {

    /**
    * 图片的URL地址。图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。 
非腾讯云存储的Url速度和稳定性可能受一定影响。
图片大小的限制为4M，图片像素的限制为4k。
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * 图片经过base64编码的内容。与ImageUrl同时存在时优先使用ImageUrl字段。 
图片大小的限制为4M，图片像素的限制为4k。
**注意：图片需要base64编码，并且要去掉编码头部。
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
     * Get 图片的URL地址。图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。 
非腾讯云存储的Url速度和稳定性可能受一定影响。
图片大小的限制为4M，图片像素的限制为4k。 
     * @return ImageUrl 图片的URL地址。图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。 
非腾讯云存储的Url速度和稳定性可能受一定影响。
图片大小的限制为4M，图片像素的限制为4k。
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 图片的URL地址。图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。 
非腾讯云存储的Url速度和稳定性可能受一定影响。
图片大小的限制为4M，图片像素的限制为4k。
     * @param ImageUrl 图片的URL地址。图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。 
非腾讯云存储的Url速度和稳定性可能受一定影响。
图片大小的限制为4M，图片像素的限制为4k。
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get 图片经过base64编码的内容。与ImageUrl同时存在时优先使用ImageUrl字段。 
图片大小的限制为4M，图片像素的限制为4k。
**注意：图片需要base64编码，并且要去掉编码头部。 
     * @return ImageBase64 图片经过base64编码的内容。与ImageUrl同时存在时优先使用ImageUrl字段。 
图片大小的限制为4M，图片像素的限制为4k。
**注意：图片需要base64编码，并且要去掉编码头部。
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set 图片经过base64编码的内容。与ImageUrl同时存在时优先使用ImageUrl字段。 
图片大小的限制为4M，图片像素的限制为4k。
**注意：图片需要base64编码，并且要去掉编码头部。
     * @param ImageBase64 图片经过base64编码的内容。与ImageUrl同时存在时优先使用ImageUrl字段。 
图片大小的限制为4M，图片像素的限制为4k。
**注意：图片需要base64编码，并且要去掉编码头部。
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    public DetectEnvelopeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetectEnvelopeRequest(DetectEnvelopeRequest source) {
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);

    }
}

