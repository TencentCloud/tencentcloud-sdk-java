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

public class BizLicenseOCRRequest extends AbstractModel {

    /**
    * <p>图片的 Base64 值。<br>支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。<br>支持的图片大小：所下载图片经Base64编码后不超过 7M。图片下载时间不超过 3 秒。<br>图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。</p>
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * <p>图片的 Url 地址。<br>支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。<br>支持的图片大小：所下载图片经 Base64 编码后不超过 7M。图片下载时间不超过 3 秒。<br>图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。<br>非腾讯云存储的 Url 速度和稳定性可能受一定影响。</p>
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * <p>是否返回告警码，默认为false</p>
    */
    @SerializedName("EnableCopyWarn")
    @Expose
    private Boolean EnableCopyWarn;

    /**
    * <p>是否返回自动拼接的有效期，默认为true</p>
    */
    @SerializedName("EnablePeriodComplete")
    @Expose
    private Boolean EnablePeriodComplete;

    /**
    * <p>是否支持营业类证件识别（包括营业执照和非营业执照的其他证件），默认为false</p>
    */
    @SerializedName("EnableBusinessCertificate")
    @Expose
    private Boolean EnableBusinessCertificate;

    /**
     * Get <p>图片的 Base64 值。<br>支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。<br>支持的图片大小：所下载图片经Base64编码后不超过 7M。图片下载时间不超过 3 秒。<br>图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。</p> 
     * @return ImageBase64 <p>图片的 Base64 值。<br>支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。<br>支持的图片大小：所下载图片经Base64编码后不超过 7M。图片下载时间不超过 3 秒。<br>图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。</p>
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set <p>图片的 Base64 值。<br>支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。<br>支持的图片大小：所下载图片经Base64编码后不超过 7M。图片下载时间不超过 3 秒。<br>图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。</p>
     * @param ImageBase64 <p>图片的 Base64 值。<br>支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。<br>支持的图片大小：所下载图片经Base64编码后不超过 7M。图片下载时间不超过 3 秒。<br>图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。</p>
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get <p>图片的 Url 地址。<br>支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。<br>支持的图片大小：所下载图片经 Base64 编码后不超过 7M。图片下载时间不超过 3 秒。<br>图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。<br>非腾讯云存储的 Url 速度和稳定性可能受一定影响。</p> 
     * @return ImageUrl <p>图片的 Url 地址。<br>支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。<br>支持的图片大小：所下载图片经 Base64 编码后不超过 7M。图片下载时间不超过 3 秒。<br>图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。<br>非腾讯云存储的 Url 速度和稳定性可能受一定影响。</p>
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set <p>图片的 Url 地址。<br>支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。<br>支持的图片大小：所下载图片经 Base64 编码后不超过 7M。图片下载时间不超过 3 秒。<br>图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。<br>非腾讯云存储的 Url 速度和稳定性可能受一定影响。</p>
     * @param ImageUrl <p>图片的 Url 地址。<br>支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。<br>支持的图片大小：所下载图片经 Base64 编码后不超过 7M。图片下载时间不超过 3 秒。<br>图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。<br>非腾讯云存储的 Url 速度和稳定性可能受一定影响。</p>
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get <p>是否返回告警码，默认为false</p> 
     * @return EnableCopyWarn <p>是否返回告警码，默认为false</p>
     */
    public Boolean getEnableCopyWarn() {
        return this.EnableCopyWarn;
    }

    /**
     * Set <p>是否返回告警码，默认为false</p>
     * @param EnableCopyWarn <p>是否返回告警码，默认为false</p>
     */
    public void setEnableCopyWarn(Boolean EnableCopyWarn) {
        this.EnableCopyWarn = EnableCopyWarn;
    }

    /**
     * Get <p>是否返回自动拼接的有效期，默认为true</p> 
     * @return EnablePeriodComplete <p>是否返回自动拼接的有效期，默认为true</p>
     */
    public Boolean getEnablePeriodComplete() {
        return this.EnablePeriodComplete;
    }

    /**
     * Set <p>是否返回自动拼接的有效期，默认为true</p>
     * @param EnablePeriodComplete <p>是否返回自动拼接的有效期，默认为true</p>
     */
    public void setEnablePeriodComplete(Boolean EnablePeriodComplete) {
        this.EnablePeriodComplete = EnablePeriodComplete;
    }

    /**
     * Get <p>是否支持营业类证件识别（包括营业执照和非营业执照的其他证件），默认为false</p> 
     * @return EnableBusinessCertificate <p>是否支持营业类证件识别（包括营业执照和非营业执照的其他证件），默认为false</p>
     */
    public Boolean getEnableBusinessCertificate() {
        return this.EnableBusinessCertificate;
    }

    /**
     * Set <p>是否支持营业类证件识别（包括营业执照和非营业执照的其他证件），默认为false</p>
     * @param EnableBusinessCertificate <p>是否支持营业类证件识别（包括营业执照和非营业执照的其他证件），默认为false</p>
     */
    public void setEnableBusinessCertificate(Boolean EnableBusinessCertificate) {
        this.EnableBusinessCertificate = EnableBusinessCertificate;
    }

    public BizLicenseOCRRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BizLicenseOCRRequest(BizLicenseOCRRequest source) {
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.EnableCopyWarn != null) {
            this.EnableCopyWarn = new Boolean(source.EnableCopyWarn);
        }
        if (source.EnablePeriodComplete != null) {
            this.EnablePeriodComplete = new Boolean(source.EnablePeriodComplete);
        }
        if (source.EnableBusinessCertificate != null) {
            this.EnableBusinessCertificate = new Boolean(source.EnableBusinessCertificate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "EnableCopyWarn", this.EnableCopyWarn);
        this.setParamSimple(map, prefix + "EnablePeriodComplete", this.EnablePeriodComplete);
        this.setParamSimple(map, prefix + "EnableBusinessCertificate", this.EnableBusinessCertificate);

    }
}

