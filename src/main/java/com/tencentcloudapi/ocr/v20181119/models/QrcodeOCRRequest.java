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

public class QrcodeOCRRequest extends AbstractModel {

    /**
    * <p>图片的 Base64 值。要求图片经Base64编码后不超过 10M，支持PNG、JPG、JPEG、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。</p>
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * <p>图片的 Url 地址。要求图片经Base64编码后不超过 10M，支持PNG、JPG、JPEG、PDF格式。建议图片存储于腾讯云，可保障更高的下载速度和稳定性。</p>
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
     * Get <p>图片的 Base64 值。要求图片经Base64编码后不超过 10M，支持PNG、JPG、JPEG、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。</p> 
     * @return ImageBase64 <p>图片的 Base64 值。要求图片经Base64编码后不超过 10M，支持PNG、JPG、JPEG、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。</p>
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set <p>图片的 Base64 值。要求图片经Base64编码后不超过 10M，支持PNG、JPG、JPEG、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。</p>
     * @param ImageBase64 <p>图片的 Base64 值。要求图片经Base64编码后不超过 10M，支持PNG、JPG、JPEG、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。</p>
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get <p>图片的 Url 地址。要求图片经Base64编码后不超过 10M，支持PNG、JPG、JPEG、PDF格式。建议图片存储于腾讯云，可保障更高的下载速度和稳定性。</p> 
     * @return ImageUrl <p>图片的 Url 地址。要求图片经Base64编码后不超过 10M，支持PNG、JPG、JPEG、PDF格式。建议图片存储于腾讯云，可保障更高的下载速度和稳定性。</p>
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set <p>图片的 Url 地址。要求图片经Base64编码后不超过 10M，支持PNG、JPG、JPEG、PDF格式。建议图片存储于腾讯云，可保障更高的下载速度和稳定性。</p>
     * @param ImageUrl <p>图片的 Url 地址。要求图片经Base64编码后不超过 10M，支持PNG、JPG、JPEG、PDF格式。建议图片存储于腾讯云，可保障更高的下载速度和稳定性。</p>
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    public QrcodeOCRRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QrcodeOCRRequest(QrcodeOCRRequest source) {
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
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);

    }
}

