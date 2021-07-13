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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckIdCardInformationRequest extends AbstractModel{

    /**
    * 身份证人像面的 Base64 值
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经Base64编码后不超过 7M。
请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。
ImageBase64、ImageUrl二者必须提供其中之一。若都提供了，则按照ImageUrl>ImageBase64的优先级使用参数。
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * 身份证人像面的 Url 地址
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经 Base64 编码后不超过 3M。图片下载时间不超过 3 秒。
图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。
非腾讯云存储的 Url 速度和稳定性可能受一定影响。
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * 以下可选字段均为bool 类型，默认false：
CopyWarn，复印件告警
BorderCheckWarn，边框和框内遮挡告警
ReshootWarn，翻拍告警
DetectPsWarn，PS检测告警
TempIdWarn，临时身份证告警
Quality，图片质量告警（评价图片模糊程度）

SDK 设置方式参考：
Config = Json.stringify({"CopyWarn":true,"ReshootWarn":true})
API 3.0 Explorer 设置方式参考：
Config = {"CopyWarn":true,"ReshootWarn":true}
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
    * 是否需要对返回中的敏感信息进行加密。默认false。
其中敏感信息包括：Response.IdNum、Response.Name
    */
    @SerializedName("IsEncrypt")
    @Expose
    private Boolean IsEncrypt;

    /**
     * Get 身份证人像面的 Base64 值
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经Base64编码后不超过 7M。
请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。
ImageBase64、ImageUrl二者必须提供其中之一。若都提供了，则按照ImageUrl>ImageBase64的优先级使用参数。 
     * @return ImageBase64 身份证人像面的 Base64 值
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经Base64编码后不超过 7M。
请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。
ImageBase64、ImageUrl二者必须提供其中之一。若都提供了，则按照ImageUrl>ImageBase64的优先级使用参数。
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set 身份证人像面的 Base64 值
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经Base64编码后不超过 7M。
请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。
ImageBase64、ImageUrl二者必须提供其中之一。若都提供了，则按照ImageUrl>ImageBase64的优先级使用参数。
     * @param ImageBase64 身份证人像面的 Base64 值
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经Base64编码后不超过 7M。
请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。
ImageBase64、ImageUrl二者必须提供其中之一。若都提供了，则按照ImageUrl>ImageBase64的优先级使用参数。
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get 身份证人像面的 Url 地址
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经 Base64 编码后不超过 3M。图片下载时间不超过 3 秒。
图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。
非腾讯云存储的 Url 速度和稳定性可能受一定影响。 
     * @return ImageUrl 身份证人像面的 Url 地址
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经 Base64 编码后不超过 3M。图片下载时间不超过 3 秒。
图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。
非腾讯云存储的 Url 速度和稳定性可能受一定影响。
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 身份证人像面的 Url 地址
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经 Base64 编码后不超过 3M。图片下载时间不超过 3 秒。
图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。
非腾讯云存储的 Url 速度和稳定性可能受一定影响。
     * @param ImageUrl 身份证人像面的 Url 地址
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经 Base64 编码后不超过 3M。图片下载时间不超过 3 秒。
图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。
非腾讯云存储的 Url 速度和稳定性可能受一定影响。
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get 以下可选字段均为bool 类型，默认false：
CopyWarn，复印件告警
BorderCheckWarn，边框和框内遮挡告警
ReshootWarn，翻拍告警
DetectPsWarn，PS检测告警
TempIdWarn，临时身份证告警
Quality，图片质量告警（评价图片模糊程度）

SDK 设置方式参考：
Config = Json.stringify({"CopyWarn":true,"ReshootWarn":true})
API 3.0 Explorer 设置方式参考：
Config = {"CopyWarn":true,"ReshootWarn":true} 
     * @return Config 以下可选字段均为bool 类型，默认false：
CopyWarn，复印件告警
BorderCheckWarn，边框和框内遮挡告警
ReshootWarn，翻拍告警
DetectPsWarn，PS检测告警
TempIdWarn，临时身份证告警
Quality，图片质量告警（评价图片模糊程度）

SDK 设置方式参考：
Config = Json.stringify({"CopyWarn":true,"ReshootWarn":true})
API 3.0 Explorer 设置方式参考：
Config = {"CopyWarn":true,"ReshootWarn":true}
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set 以下可选字段均为bool 类型，默认false：
CopyWarn，复印件告警
BorderCheckWarn，边框和框内遮挡告警
ReshootWarn，翻拍告警
DetectPsWarn，PS检测告警
TempIdWarn，临时身份证告警
Quality，图片质量告警（评价图片模糊程度）

SDK 设置方式参考：
Config = Json.stringify({"CopyWarn":true,"ReshootWarn":true})
API 3.0 Explorer 设置方式参考：
Config = {"CopyWarn":true,"ReshootWarn":true}
     * @param Config 以下可选字段均为bool 类型，默认false：
CopyWarn，复印件告警
BorderCheckWarn，边框和框内遮挡告警
ReshootWarn，翻拍告警
DetectPsWarn，PS检测告警
TempIdWarn，临时身份证告警
Quality，图片质量告警（评价图片模糊程度）

SDK 设置方式参考：
Config = Json.stringify({"CopyWarn":true,"ReshootWarn":true})
API 3.0 Explorer 设置方式参考：
Config = {"CopyWarn":true,"ReshootWarn":true}
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    /**
     * Get 是否需要对返回中的敏感信息进行加密。默认false。
其中敏感信息包括：Response.IdNum、Response.Name 
     * @return IsEncrypt 是否需要对返回中的敏感信息进行加密。默认false。
其中敏感信息包括：Response.IdNum、Response.Name
     */
    public Boolean getIsEncrypt() {
        return this.IsEncrypt;
    }

    /**
     * Set 是否需要对返回中的敏感信息进行加密。默认false。
其中敏感信息包括：Response.IdNum、Response.Name
     * @param IsEncrypt 是否需要对返回中的敏感信息进行加密。默认false。
其中敏感信息包括：Response.IdNum、Response.Name
     */
    public void setIsEncrypt(Boolean IsEncrypt) {
        this.IsEncrypt = IsEncrypt;
    }

    public CheckIdCardInformationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckIdCardInformationRequest(CheckIdCardInformationRequest source) {
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.Config != null) {
            this.Config = new String(source.Config);
        }
        if (source.IsEncrypt != null) {
            this.IsEncrypt = new Boolean(source.IsEncrypt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "Config", this.Config);
        this.setParamSimple(map, prefix + "IsEncrypt", this.IsEncrypt);

    }
}

