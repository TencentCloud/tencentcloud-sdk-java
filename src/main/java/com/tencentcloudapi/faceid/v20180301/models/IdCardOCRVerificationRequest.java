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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IdCardOCRVerificationRequest extends AbstractModel {

    /**
    * <p>身份证号。</p><ul><li>姓名和身份证号、ImageBase64、ImageUrl三者必须提供其中之一。</li><li>若都提供了，则按照姓名和身份证号&gt;ImageBase64&gt;ImageUrl的优先级使用参数。</li></ul>
    */
    @SerializedName("IdCard")
    @Expose
    private String IdCard;

    /**
    * <p>姓名。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>身份证人像面的 Base64 值。</p><ul><li>支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。</li><li>支持的图片大小：所下载图片经Base64编码后不超过 3M。请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。</li></ul>
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * <p>身份证人像面的 Url 地址。</p><ul><li>支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。</li><li>支持的图片大小：所下载图片经 Base64 编码后不超过 3M。图片下载时间不超过 3 秒。</li><li>图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。</li><li>非腾讯云存储的 Url 速度和稳定性可能受一定影响。</li></ul>
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * <p>敏感数据加密信息。</p><ul><li>对传入信息（姓名、身份证号）有加密需求的用户可使用此参数，详情请点击左侧链接。</li></ul>
    */
    @SerializedName("Encryption")
    @Expose
    private Encryption Encryption;

    /**
    * <p>告警配置。</p><ul><li>仅当使用ImageBase64或者ImageUrl时，告警配置生效</li><li>以下可选字段均为bool 类型，默认false。<ul><li>CopyWarn，复印件告警。</li><li>BorderCheckWarn，边框和框内遮挡告警。</li><li>ReshootWarn，翻拍告警。</li><li>DetectPsWarn，PS检测告警（疑似存在PS痕迹）。</li><li>TempIdWarn，临时身份证告警。</li><li>Quality，图片质量告警（评价图片模糊程度）。</li></ul></li><li>SDK 设置方式参考：Config = Json.stringify({&quot;CopyWarn&quot;:true,&quot;ReshootWarn&quot;:true})。</li><li>API 3.0 Explorer 设置方式参考：Config = {&quot;CopyWarn&quot;:true,&quot;Quality&quot;:true}。</li></ul>
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
     * Get <p>身份证号。</p><ul><li>姓名和身份证号、ImageBase64、ImageUrl三者必须提供其中之一。</li><li>若都提供了，则按照姓名和身份证号&gt;ImageBase64&gt;ImageUrl的优先级使用参数。</li></ul> 
     * @return IdCard <p>身份证号。</p><ul><li>姓名和身份证号、ImageBase64、ImageUrl三者必须提供其中之一。</li><li>若都提供了，则按照姓名和身份证号&gt;ImageBase64&gt;ImageUrl的优先级使用参数。</li></ul>
     */
    public String getIdCard() {
        return this.IdCard;
    }

    /**
     * Set <p>身份证号。</p><ul><li>姓名和身份证号、ImageBase64、ImageUrl三者必须提供其中之一。</li><li>若都提供了，则按照姓名和身份证号&gt;ImageBase64&gt;ImageUrl的优先级使用参数。</li></ul>
     * @param IdCard <p>身份证号。</p><ul><li>姓名和身份证号、ImageBase64、ImageUrl三者必须提供其中之一。</li><li>若都提供了，则按照姓名和身份证号&gt;ImageBase64&gt;ImageUrl的优先级使用参数。</li></ul>
     */
    public void setIdCard(String IdCard) {
        this.IdCard = IdCard;
    }

    /**
     * Get <p>姓名。</p> 
     * @return Name <p>姓名。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>姓名。</p>
     * @param Name <p>姓名。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>身份证人像面的 Base64 值。</p><ul><li>支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。</li><li>支持的图片大小：所下载图片经Base64编码后不超过 3M。请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。</li></ul> 
     * @return ImageBase64 <p>身份证人像面的 Base64 值。</p><ul><li>支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。</li><li>支持的图片大小：所下载图片经Base64编码后不超过 3M。请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。</li></ul>
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set <p>身份证人像面的 Base64 值。</p><ul><li>支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。</li><li>支持的图片大小：所下载图片经Base64编码后不超过 3M。请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。</li></ul>
     * @param ImageBase64 <p>身份证人像面的 Base64 值。</p><ul><li>支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。</li><li>支持的图片大小：所下载图片经Base64编码后不超过 3M。请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。</li></ul>
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get <p>身份证人像面的 Url 地址。</p><ul><li>支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。</li><li>支持的图片大小：所下载图片经 Base64 编码后不超过 3M。图片下载时间不超过 3 秒。</li><li>图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。</li><li>非腾讯云存储的 Url 速度和稳定性可能受一定影响。</li></ul> 
     * @return ImageUrl <p>身份证人像面的 Url 地址。</p><ul><li>支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。</li><li>支持的图片大小：所下载图片经 Base64 编码后不超过 3M。图片下载时间不超过 3 秒。</li><li>图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。</li><li>非腾讯云存储的 Url 速度和稳定性可能受一定影响。</li></ul>
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set <p>身份证人像面的 Url 地址。</p><ul><li>支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。</li><li>支持的图片大小：所下载图片经 Base64 编码后不超过 3M。图片下载时间不超过 3 秒。</li><li>图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。</li><li>非腾讯云存储的 Url 速度和稳定性可能受一定影响。</li></ul>
     * @param ImageUrl <p>身份证人像面的 Url 地址。</p><ul><li>支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。</li><li>支持的图片大小：所下载图片经 Base64 编码后不超过 3M。图片下载时间不超过 3 秒。</li><li>图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。</li><li>非腾讯云存储的 Url 速度和稳定性可能受一定影响。</li></ul>
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get <p>敏感数据加密信息。</p><ul><li>对传入信息（姓名、身份证号）有加密需求的用户可使用此参数，详情请点击左侧链接。</li></ul> 
     * @return Encryption <p>敏感数据加密信息。</p><ul><li>对传入信息（姓名、身份证号）有加密需求的用户可使用此参数，详情请点击左侧链接。</li></ul>
     */
    public Encryption getEncryption() {
        return this.Encryption;
    }

    /**
     * Set <p>敏感数据加密信息。</p><ul><li>对传入信息（姓名、身份证号）有加密需求的用户可使用此参数，详情请点击左侧链接。</li></ul>
     * @param Encryption <p>敏感数据加密信息。</p><ul><li>对传入信息（姓名、身份证号）有加密需求的用户可使用此参数，详情请点击左侧链接。</li></ul>
     */
    public void setEncryption(Encryption Encryption) {
        this.Encryption = Encryption;
    }

    /**
     * Get <p>告警配置。</p><ul><li>仅当使用ImageBase64或者ImageUrl时，告警配置生效</li><li>以下可选字段均为bool 类型，默认false。<ul><li>CopyWarn，复印件告警。</li><li>BorderCheckWarn，边框和框内遮挡告警。</li><li>ReshootWarn，翻拍告警。</li><li>DetectPsWarn，PS检测告警（疑似存在PS痕迹）。</li><li>TempIdWarn，临时身份证告警。</li><li>Quality，图片质量告警（评价图片模糊程度）。</li></ul></li><li>SDK 设置方式参考：Config = Json.stringify({&quot;CopyWarn&quot;:true,&quot;ReshootWarn&quot;:true})。</li><li>API 3.0 Explorer 设置方式参考：Config = {&quot;CopyWarn&quot;:true,&quot;Quality&quot;:true}。</li></ul> 
     * @return Config <p>告警配置。</p><ul><li>仅当使用ImageBase64或者ImageUrl时，告警配置生效</li><li>以下可选字段均为bool 类型，默认false。<ul><li>CopyWarn，复印件告警。</li><li>BorderCheckWarn，边框和框内遮挡告警。</li><li>ReshootWarn，翻拍告警。</li><li>DetectPsWarn，PS检测告警（疑似存在PS痕迹）。</li><li>TempIdWarn，临时身份证告警。</li><li>Quality，图片质量告警（评价图片模糊程度）。</li></ul></li><li>SDK 设置方式参考：Config = Json.stringify({&quot;CopyWarn&quot;:true,&quot;ReshootWarn&quot;:true})。</li><li>API 3.0 Explorer 设置方式参考：Config = {&quot;CopyWarn&quot;:true,&quot;Quality&quot;:true}。</li></ul>
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set <p>告警配置。</p><ul><li>仅当使用ImageBase64或者ImageUrl时，告警配置生效</li><li>以下可选字段均为bool 类型，默认false。<ul><li>CopyWarn，复印件告警。</li><li>BorderCheckWarn，边框和框内遮挡告警。</li><li>ReshootWarn，翻拍告警。</li><li>DetectPsWarn，PS检测告警（疑似存在PS痕迹）。</li><li>TempIdWarn，临时身份证告警。</li><li>Quality，图片质量告警（评价图片模糊程度）。</li></ul></li><li>SDK 设置方式参考：Config = Json.stringify({&quot;CopyWarn&quot;:true,&quot;ReshootWarn&quot;:true})。</li><li>API 3.0 Explorer 设置方式参考：Config = {&quot;CopyWarn&quot;:true,&quot;Quality&quot;:true}。</li></ul>
     * @param Config <p>告警配置。</p><ul><li>仅当使用ImageBase64或者ImageUrl时，告警配置生效</li><li>以下可选字段均为bool 类型，默认false。<ul><li>CopyWarn，复印件告警。</li><li>BorderCheckWarn，边框和框内遮挡告警。</li><li>ReshootWarn，翻拍告警。</li><li>DetectPsWarn，PS检测告警（疑似存在PS痕迹）。</li><li>TempIdWarn，临时身份证告警。</li><li>Quality，图片质量告警（评价图片模糊程度）。</li></ul></li><li>SDK 设置方式参考：Config = Json.stringify({&quot;CopyWarn&quot;:true,&quot;ReshootWarn&quot;:true})。</li><li>API 3.0 Explorer 设置方式参考：Config = {&quot;CopyWarn&quot;:true,&quot;Quality&quot;:true}。</li></ul>
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    public IdCardOCRVerificationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IdCardOCRVerificationRequest(IdCardOCRVerificationRequest source) {
        if (source.IdCard != null) {
            this.IdCard = new String(source.IdCard);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.Encryption != null) {
            this.Encryption = new Encryption(source.Encryption);
        }
        if (source.Config != null) {
            this.Config = new String(source.Config);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdCard", this.IdCard);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamObj(map, prefix + "Encryption.", this.Encryption);
        this.setParamSimple(map, prefix + "Config", this.Config);

    }
}

