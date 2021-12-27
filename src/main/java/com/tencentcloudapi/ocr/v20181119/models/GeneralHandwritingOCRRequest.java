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

public class GeneralHandwritingOCRRequest extends AbstractModel{

    /**
    * 图片的 Base64 值。
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经Base64编码后不超过 7M。图片下载时间不超过 3 秒。
图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * 图片的 Url 地址。
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经 Base64 编码后不超过7M。图片下载时间不超过 3 秒。
图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。
非腾讯云存储的 Url 速度和稳定性可能受一定影响。
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * 场景字段，默认不用填写。
可选值:only_hw  表示只输出手写体识别结果，过滤印刷体。
    */
    @SerializedName("Scene")
    @Expose
    private String Scene;

    /**
    * 是否开启单字的四点定位坐标输出，默认值为false。
    */
    @SerializedName("EnableWordPolygon")
    @Expose
    private Boolean EnableWordPolygon;

    /**
    * 文本检测开关，默认值为true。
设置为false表示直接进行单行识别，可适用于识别单行手写体签名场景。
    */
    @SerializedName("EnableDetectText")
    @Expose
    private Boolean EnableDetectText;

    /**
     * Get 图片的 Base64 值。
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经Base64编码后不超过 7M。图片下载时间不超过 3 秒。
图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。 
     * @return ImageBase64 图片的 Base64 值。
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经Base64编码后不超过 7M。图片下载时间不超过 3 秒。
图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set 图片的 Base64 值。
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经Base64编码后不超过 7M。图片下载时间不超过 3 秒。
图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
     * @param ImageBase64 图片的 Base64 值。
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经Base64编码后不超过 7M。图片下载时间不超过 3 秒。
图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get 图片的 Url 地址。
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经 Base64 编码后不超过7M。图片下载时间不超过 3 秒。
图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。
非腾讯云存储的 Url 速度和稳定性可能受一定影响。 
     * @return ImageUrl 图片的 Url 地址。
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经 Base64 编码后不超过7M。图片下载时间不超过 3 秒。
图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。
非腾讯云存储的 Url 速度和稳定性可能受一定影响。
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 图片的 Url 地址。
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经 Base64 编码后不超过7M。图片下载时间不超过 3 秒。
图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。
非腾讯云存储的 Url 速度和稳定性可能受一定影响。
     * @param ImageUrl 图片的 Url 地址。
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经 Base64 编码后不超过7M。图片下载时间不超过 3 秒。
图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。
非腾讯云存储的 Url 速度和稳定性可能受一定影响。
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get 场景字段，默认不用填写。
可选值:only_hw  表示只输出手写体识别结果，过滤印刷体。 
     * @return Scene 场景字段，默认不用填写。
可选值:only_hw  表示只输出手写体识别结果，过滤印刷体。
     */
    public String getScene() {
        return this.Scene;
    }

    /**
     * Set 场景字段，默认不用填写。
可选值:only_hw  表示只输出手写体识别结果，过滤印刷体。
     * @param Scene 场景字段，默认不用填写。
可选值:only_hw  表示只输出手写体识别结果，过滤印刷体。
     */
    public void setScene(String Scene) {
        this.Scene = Scene;
    }

    /**
     * Get 是否开启单字的四点定位坐标输出，默认值为false。 
     * @return EnableWordPolygon 是否开启单字的四点定位坐标输出，默认值为false。
     */
    public Boolean getEnableWordPolygon() {
        return this.EnableWordPolygon;
    }

    /**
     * Set 是否开启单字的四点定位坐标输出，默认值为false。
     * @param EnableWordPolygon 是否开启单字的四点定位坐标输出，默认值为false。
     */
    public void setEnableWordPolygon(Boolean EnableWordPolygon) {
        this.EnableWordPolygon = EnableWordPolygon;
    }

    /**
     * Get 文本检测开关，默认值为true。
设置为false表示直接进行单行识别，可适用于识别单行手写体签名场景。 
     * @return EnableDetectText 文本检测开关，默认值为true。
设置为false表示直接进行单行识别，可适用于识别单行手写体签名场景。
     */
    public Boolean getEnableDetectText() {
        return this.EnableDetectText;
    }

    /**
     * Set 文本检测开关，默认值为true。
设置为false表示直接进行单行识别，可适用于识别单行手写体签名场景。
     * @param EnableDetectText 文本检测开关，默认值为true。
设置为false表示直接进行单行识别，可适用于识别单行手写体签名场景。
     */
    public void setEnableDetectText(Boolean EnableDetectText) {
        this.EnableDetectText = EnableDetectText;
    }

    public GeneralHandwritingOCRRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GeneralHandwritingOCRRequest(GeneralHandwritingOCRRequest source) {
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.Scene != null) {
            this.Scene = new String(source.Scene);
        }
        if (source.EnableWordPolygon != null) {
            this.EnableWordPolygon = new Boolean(source.EnableWordPolygon);
        }
        if (source.EnableDetectText != null) {
            this.EnableDetectText = new Boolean(source.EnableDetectText);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "Scene", this.Scene);
        this.setParamSimple(map, prefix + "EnableWordPolygon", this.EnableWordPolygon);
        this.setParamSimple(map, prefix + "EnableDetectText", this.EnableDetectText);

    }
}

