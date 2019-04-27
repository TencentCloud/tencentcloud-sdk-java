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

public class IDCardOCRRequest  extends AbstractModel{

    /**
    * 图片的BASE64值。
支持的图片格式：PNG、JPG、JPEG，暂不支持GIF格式。
支持的图片大小：所下载图片经Base64编码后不超过6M。图片下载时间不超过3秒。
图片的 ImageUrl、ImageBase64必须提供一个，如果都提供，只使用ImageBase64。
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * 图片URL地址。
支持的图片格式：PNG、JPG、JPEG，暂不支持GIF格式。
支持的图片大小：所下载图片经Base64编码后不超过3M。图片下载时间不超过3秒。
图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的Url速度和稳定性可能受一定影响。
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * FRONT为身份证有照片的一面（正面）
BACK为身份证有国徽的一面（反面）
    */
    @SerializedName("CardSide")
    @Expose
    private String CardSide;

    /**
    * 可选字段，根据需要选择是否请求对应字段。
目前包含的字段为：
CropIdCard-身份证照片裁剪，bool类型，
CropPortrait-人像照片裁剪，bool类型，
CopyWarn-复印件告警，bool类型，
ReshootWarn-翻拍告警，bool类型。

SDK设置方式参考：
Config = Json.stringify({"CropIdCard":true,"CropPortrait":true})
API 3.0 Explorer设置方式参考：
Config = {"CropIdCard":true,"CropPortrait":true}
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
     * 获取图片的BASE64值。
支持的图片格式：PNG、JPG、JPEG，暂不支持GIF格式。
支持的图片大小：所下载图片经Base64编码后不超过6M。图片下载时间不超过3秒。
图片的 ImageUrl、ImageBase64必须提供一个，如果都提供，只使用ImageBase64。
     * @return ImageBase64 图片的BASE64值。
支持的图片格式：PNG、JPG、JPEG，暂不支持GIF格式。
支持的图片大小：所下载图片经Base64编码后不超过6M。图片下载时间不超过3秒。
图片的 ImageUrl、ImageBase64必须提供一个，如果都提供，只使用ImageBase64。
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * 设置图片的BASE64值。
支持的图片格式：PNG、JPG、JPEG，暂不支持GIF格式。
支持的图片大小：所下载图片经Base64编码后不超过6M。图片下载时间不超过3秒。
图片的 ImageUrl、ImageBase64必须提供一个，如果都提供，只使用ImageBase64。
     * @param ImageBase64 图片的BASE64值。
支持的图片格式：PNG、JPG、JPEG，暂不支持GIF格式。
支持的图片大小：所下载图片经Base64编码后不超过6M。图片下载时间不超过3秒。
图片的 ImageUrl、ImageBase64必须提供一个，如果都提供，只使用ImageBase64。
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * 获取图片URL地址。
支持的图片格式：PNG、JPG、JPEG，暂不支持GIF格式。
支持的图片大小：所下载图片经Base64编码后不超过3M。图片下载时间不超过3秒。
图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的Url速度和稳定性可能受一定影响。
     * @return ImageUrl 图片URL地址。
支持的图片格式：PNG、JPG、JPEG，暂不支持GIF格式。
支持的图片大小：所下载图片经Base64编码后不超过3M。图片下载时间不超过3秒。
图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的Url速度和稳定性可能受一定影响。
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * 设置图片URL地址。
支持的图片格式：PNG、JPG、JPEG，暂不支持GIF格式。
支持的图片大小：所下载图片经Base64编码后不超过3M。图片下载时间不超过3秒。
图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的Url速度和稳定性可能受一定影响。
     * @param ImageUrl 图片URL地址。
支持的图片格式：PNG、JPG、JPEG，暂不支持GIF格式。
支持的图片大小：所下载图片经Base64编码后不超过3M。图片下载时间不超过3秒。
图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的Url速度和稳定性可能受一定影响。
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * 获取FRONT为身份证有照片的一面（正面）
BACK为身份证有国徽的一面（反面）
     * @return CardSide FRONT为身份证有照片的一面（正面）
BACK为身份证有国徽的一面（反面）
     */
    public String getCardSide() {
        return this.CardSide;
    }

    /**
     * 设置FRONT为身份证有照片的一面（正面）
BACK为身份证有国徽的一面（反面）
     * @param CardSide FRONT为身份证有照片的一面（正面）
BACK为身份证有国徽的一面（反面）
     */
    public void setCardSide(String CardSide) {
        this.CardSide = CardSide;
    }

    /**
     * 获取可选字段，根据需要选择是否请求对应字段。
目前包含的字段为：
CropIdCard-身份证照片裁剪，bool类型，
CropPortrait-人像照片裁剪，bool类型，
CopyWarn-复印件告警，bool类型，
ReshootWarn-翻拍告警，bool类型。

SDK设置方式参考：
Config = Json.stringify({"CropIdCard":true,"CropPortrait":true})
API 3.0 Explorer设置方式参考：
Config = {"CropIdCard":true,"CropPortrait":true}
     * @return Config 可选字段，根据需要选择是否请求对应字段。
目前包含的字段为：
CropIdCard-身份证照片裁剪，bool类型，
CropPortrait-人像照片裁剪，bool类型，
CopyWarn-复印件告警，bool类型，
ReshootWarn-翻拍告警，bool类型。

SDK设置方式参考：
Config = Json.stringify({"CropIdCard":true,"CropPortrait":true})
API 3.0 Explorer设置方式参考：
Config = {"CropIdCard":true,"CropPortrait":true}
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * 设置可选字段，根据需要选择是否请求对应字段。
目前包含的字段为：
CropIdCard-身份证照片裁剪，bool类型，
CropPortrait-人像照片裁剪，bool类型，
CopyWarn-复印件告警，bool类型，
ReshootWarn-翻拍告警，bool类型。

SDK设置方式参考：
Config = Json.stringify({"CropIdCard":true,"CropPortrait":true})
API 3.0 Explorer设置方式参考：
Config = {"CropIdCard":true,"CropPortrait":true}
     * @param Config 可选字段，根据需要选择是否请求对应字段。
目前包含的字段为：
CropIdCard-身份证照片裁剪，bool类型，
CropPortrait-人像照片裁剪，bool类型，
CopyWarn-复印件告警，bool类型，
ReshootWarn-翻拍告警，bool类型。

SDK设置方式参考：
Config = Json.stringify({"CropIdCard":true,"CropPortrait":true})
API 3.0 Explorer设置方式参考：
Config = {"CropIdCard":true,"CropPortrait":true}
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "CardSide", this.CardSide);
        this.setParamSimple(map, prefix + "Config", this.Config);

    }
}

