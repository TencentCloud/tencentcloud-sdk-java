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

public class EnglishOCRRequest extends AbstractModel{

    /**
    * 图片的 Base64 值。
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经Base64编码后不超过 3M。图片下载时间不超过 3 秒。
图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * 图片的 Url 地址。
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经 Base64 编码后不超过 3M。图片下载时间不超过 3 秒。
图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。
非腾讯云存储的 Url 速度和稳定性可能受一定影响。
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * 单词四点坐标开关，开启可返回图片中单词的四点坐标。
该参数默认值为false。
    */
    @SerializedName("EnableCoordPoint")
    @Expose
    private Boolean EnableCoordPoint;

    /**
    * 候选字开关，开启可返回识别时多个可能的候选字（每个候选字对应其置信度）。
该参数默认值为false。
    */
    @SerializedName("EnableCandWord")
    @Expose
    private Boolean EnableCandWord;

    /**
     * Get 图片的 Base64 值。
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经Base64编码后不超过 3M。图片下载时间不超过 3 秒。
图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。 
     * @return ImageBase64 图片的 Base64 值。
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经Base64编码后不超过 3M。图片下载时间不超过 3 秒。
图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set 图片的 Base64 值。
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经Base64编码后不超过 3M。图片下载时间不超过 3 秒。
图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
     * @param ImageBase64 图片的 Base64 值。
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经Base64编码后不超过 3M。图片下载时间不超过 3 秒。
图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get 图片的 Url 地址。
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经 Base64 编码后不超过 3M。图片下载时间不超过 3 秒。
图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。
非腾讯云存储的 Url 速度和稳定性可能受一定影响。 
     * @return ImageUrl 图片的 Url 地址。
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经 Base64 编码后不超过 3M。图片下载时间不超过 3 秒。
图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。
非腾讯云存储的 Url 速度和稳定性可能受一定影响。
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 图片的 Url 地址。
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经 Base64 编码后不超过 3M。图片下载时间不超过 3 秒。
图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。
非腾讯云存储的 Url 速度和稳定性可能受一定影响。
     * @param ImageUrl 图片的 Url 地址。
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经 Base64 编码后不超过 3M。图片下载时间不超过 3 秒。
图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。
非腾讯云存储的 Url 速度和稳定性可能受一定影响。
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get 单词四点坐标开关，开启可返回图片中单词的四点坐标。
该参数默认值为false。 
     * @return EnableCoordPoint 单词四点坐标开关，开启可返回图片中单词的四点坐标。
该参数默认值为false。
     */
    public Boolean getEnableCoordPoint() {
        return this.EnableCoordPoint;
    }

    /**
     * Set 单词四点坐标开关，开启可返回图片中单词的四点坐标。
该参数默认值为false。
     * @param EnableCoordPoint 单词四点坐标开关，开启可返回图片中单词的四点坐标。
该参数默认值为false。
     */
    public void setEnableCoordPoint(Boolean EnableCoordPoint) {
        this.EnableCoordPoint = EnableCoordPoint;
    }

    /**
     * Get 候选字开关，开启可返回识别时多个可能的候选字（每个候选字对应其置信度）。
该参数默认值为false。 
     * @return EnableCandWord 候选字开关，开启可返回识别时多个可能的候选字（每个候选字对应其置信度）。
该参数默认值为false。
     */
    public Boolean getEnableCandWord() {
        return this.EnableCandWord;
    }

    /**
     * Set 候选字开关，开启可返回识别时多个可能的候选字（每个候选字对应其置信度）。
该参数默认值为false。
     * @param EnableCandWord 候选字开关，开启可返回识别时多个可能的候选字（每个候选字对应其置信度）。
该参数默认值为false。
     */
    public void setEnableCandWord(Boolean EnableCandWord) {
        this.EnableCandWord = EnableCandWord;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "EnableCoordPoint", this.EnableCoordPoint);
        this.setParamSimple(map, prefix + "EnableCandWord", this.EnableCandWord);

    }
}

