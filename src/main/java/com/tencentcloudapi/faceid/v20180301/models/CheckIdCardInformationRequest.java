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

public class CheckIdCardInformationRequest extends AbstractModel {

    /**
    * <p>身份证人像面的 Base64 值。</p><ul><li>支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。</li><li>支持的图片大小：所下载图片经Base64编码后不超过 7M。</li><li>请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。</li><li>ImageBase64、ImageUrl二者必须提供其中之一。若都提供了，则按照ImageUrl&gt;ImageBase64的优先级使用参数。</li></ul>
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * <p>身份证人像面的 Url 地址</p><ul><li>支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。</li><li>支持的图片大小：所下载图片经 Base64 编码后不超过 3M。图片下载时间不超过 3 秒。</li><li>图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。</li><li>非腾讯云存储的 Url 速度和稳定性可能受一定影响。</li></ul>
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * <p>配置。</p><ul><li><p>以下可选字段均为bool 类型，默认false。<br>CopyWarn，复印件告警。<br>BorderCheckWarn，边框和框内遮挡告警。<br>ReshootWarn，翻拍告警。<br>DetectPsWarn，PS检测告警（疑似存在PS痕迹）。<br>TempIdWarn，临时身份证告警。<br>Quality，图片质量告警（评价图片模糊程度）。</p></li><li><p>SDK 设置方式参考：<br>Config = Json.stringify({&quot;CopyWarn&quot;:true,&quot;ReshootWarn&quot;:true})。</p></li><li><p>API 3.0 Explorer 设置方式参考：<br>Config = {&quot;CopyWarn&quot;:true,&quot;ReshootWarn&quot;:true}。</p></li></ul>
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
    * <p>是否需要对返回中的敏感信息进行加密。</p><ul><li>默认false。</li><li>敏感信息包括：Response.IdNum、Response.Name。</li></ul>
    */
    @SerializedName("IsEncrypt")
    @Expose
    private Boolean IsEncrypt;

    /**
    * <p>是否需要对响应体加密。</p>
    */
    @SerializedName("IsEncryptResponse")
    @Expose
    private Boolean IsEncryptResponse;

    /**
    * <p>是否需要对返回中的敏感信息进行加密,需指定加密算法Algorithm、CBC加密的初始向量、加密后的对称密钥。</p>
    */
    @SerializedName("Encryption")
    @Expose
    private Encryption Encryption;

    /**
     * Get <p>身份证人像面的 Base64 值。</p><ul><li>支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。</li><li>支持的图片大小：所下载图片经Base64编码后不超过 7M。</li><li>请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。</li><li>ImageBase64、ImageUrl二者必须提供其中之一。若都提供了，则按照ImageUrl&gt;ImageBase64的优先级使用参数。</li></ul> 
     * @return ImageBase64 <p>身份证人像面的 Base64 值。</p><ul><li>支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。</li><li>支持的图片大小：所下载图片经Base64编码后不超过 7M。</li><li>请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。</li><li>ImageBase64、ImageUrl二者必须提供其中之一。若都提供了，则按照ImageUrl&gt;ImageBase64的优先级使用参数。</li></ul>
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set <p>身份证人像面的 Base64 值。</p><ul><li>支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。</li><li>支持的图片大小：所下载图片经Base64编码后不超过 7M。</li><li>请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。</li><li>ImageBase64、ImageUrl二者必须提供其中之一。若都提供了，则按照ImageUrl&gt;ImageBase64的优先级使用参数。</li></ul>
     * @param ImageBase64 <p>身份证人像面的 Base64 值。</p><ul><li>支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。</li><li>支持的图片大小：所下载图片经Base64编码后不超过 7M。</li><li>请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。</li><li>ImageBase64、ImageUrl二者必须提供其中之一。若都提供了，则按照ImageUrl&gt;ImageBase64的优先级使用参数。</li></ul>
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get <p>身份证人像面的 Url 地址</p><ul><li>支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。</li><li>支持的图片大小：所下载图片经 Base64 编码后不超过 3M。图片下载时间不超过 3 秒。</li><li>图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。</li><li>非腾讯云存储的 Url 速度和稳定性可能受一定影响。</li></ul> 
     * @return ImageUrl <p>身份证人像面的 Url 地址</p><ul><li>支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。</li><li>支持的图片大小：所下载图片经 Base64 编码后不超过 3M。图片下载时间不超过 3 秒。</li><li>图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。</li><li>非腾讯云存储的 Url 速度和稳定性可能受一定影响。</li></ul>
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set <p>身份证人像面的 Url 地址</p><ul><li>支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。</li><li>支持的图片大小：所下载图片经 Base64 编码后不超过 3M。图片下载时间不超过 3 秒。</li><li>图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。</li><li>非腾讯云存储的 Url 速度和稳定性可能受一定影响。</li></ul>
     * @param ImageUrl <p>身份证人像面的 Url 地址</p><ul><li>支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。</li><li>支持的图片大小：所下载图片经 Base64 编码后不超过 3M。图片下载时间不超过 3 秒。</li><li>图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。</li><li>非腾讯云存储的 Url 速度和稳定性可能受一定影响。</li></ul>
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get <p>配置。</p><ul><li><p>以下可选字段均为bool 类型，默认false。<br>CopyWarn，复印件告警。<br>BorderCheckWarn，边框和框内遮挡告警。<br>ReshootWarn，翻拍告警。<br>DetectPsWarn，PS检测告警（疑似存在PS痕迹）。<br>TempIdWarn，临时身份证告警。<br>Quality，图片质量告警（评价图片模糊程度）。</p></li><li><p>SDK 设置方式参考：<br>Config = Json.stringify({&quot;CopyWarn&quot;:true,&quot;ReshootWarn&quot;:true})。</p></li><li><p>API 3.0 Explorer 设置方式参考：<br>Config = {&quot;CopyWarn&quot;:true,&quot;ReshootWarn&quot;:true}。</p></li></ul> 
     * @return Config <p>配置。</p><ul><li><p>以下可选字段均为bool 类型，默认false。<br>CopyWarn，复印件告警。<br>BorderCheckWarn，边框和框内遮挡告警。<br>ReshootWarn，翻拍告警。<br>DetectPsWarn，PS检测告警（疑似存在PS痕迹）。<br>TempIdWarn，临时身份证告警。<br>Quality，图片质量告警（评价图片模糊程度）。</p></li><li><p>SDK 设置方式参考：<br>Config = Json.stringify({&quot;CopyWarn&quot;:true,&quot;ReshootWarn&quot;:true})。</p></li><li><p>API 3.0 Explorer 设置方式参考：<br>Config = {&quot;CopyWarn&quot;:true,&quot;ReshootWarn&quot;:true}。</p></li></ul>
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set <p>配置。</p><ul><li><p>以下可选字段均为bool 类型，默认false。<br>CopyWarn，复印件告警。<br>BorderCheckWarn，边框和框内遮挡告警。<br>ReshootWarn，翻拍告警。<br>DetectPsWarn，PS检测告警（疑似存在PS痕迹）。<br>TempIdWarn，临时身份证告警。<br>Quality，图片质量告警（评价图片模糊程度）。</p></li><li><p>SDK 设置方式参考：<br>Config = Json.stringify({&quot;CopyWarn&quot;:true,&quot;ReshootWarn&quot;:true})。</p></li><li><p>API 3.0 Explorer 设置方式参考：<br>Config = {&quot;CopyWarn&quot;:true,&quot;ReshootWarn&quot;:true}。</p></li></ul>
     * @param Config <p>配置。</p><ul><li><p>以下可选字段均为bool 类型，默认false。<br>CopyWarn，复印件告警。<br>BorderCheckWarn，边框和框内遮挡告警。<br>ReshootWarn，翻拍告警。<br>DetectPsWarn，PS检测告警（疑似存在PS痕迹）。<br>TempIdWarn，临时身份证告警。<br>Quality，图片质量告警（评价图片模糊程度）。</p></li><li><p>SDK 设置方式参考：<br>Config = Json.stringify({&quot;CopyWarn&quot;:true,&quot;ReshootWarn&quot;:true})。</p></li><li><p>API 3.0 Explorer 设置方式参考：<br>Config = {&quot;CopyWarn&quot;:true,&quot;ReshootWarn&quot;:true}。</p></li></ul>
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    /**
     * Get <p>是否需要对返回中的敏感信息进行加密。</p><ul><li>默认false。</li><li>敏感信息包括：Response.IdNum、Response.Name。</li></ul> 
     * @return IsEncrypt <p>是否需要对返回中的敏感信息进行加密。</p><ul><li>默认false。</li><li>敏感信息包括：Response.IdNum、Response.Name。</li></ul>
     */
    public Boolean getIsEncrypt() {
        return this.IsEncrypt;
    }

    /**
     * Set <p>是否需要对返回中的敏感信息进行加密。</p><ul><li>默认false。</li><li>敏感信息包括：Response.IdNum、Response.Name。</li></ul>
     * @param IsEncrypt <p>是否需要对返回中的敏感信息进行加密。</p><ul><li>默认false。</li><li>敏感信息包括：Response.IdNum、Response.Name。</li></ul>
     */
    public void setIsEncrypt(Boolean IsEncrypt) {
        this.IsEncrypt = IsEncrypt;
    }

    /**
     * Get <p>是否需要对响应体加密。</p> 
     * @return IsEncryptResponse <p>是否需要对响应体加密。</p>
     */
    public Boolean getIsEncryptResponse() {
        return this.IsEncryptResponse;
    }

    /**
     * Set <p>是否需要对响应体加密。</p>
     * @param IsEncryptResponse <p>是否需要对响应体加密。</p>
     */
    public void setIsEncryptResponse(Boolean IsEncryptResponse) {
        this.IsEncryptResponse = IsEncryptResponse;
    }

    /**
     * Get <p>是否需要对返回中的敏感信息进行加密,需指定加密算法Algorithm、CBC加密的初始向量、加密后的对称密钥。</p> 
     * @return Encryption <p>是否需要对返回中的敏感信息进行加密,需指定加密算法Algorithm、CBC加密的初始向量、加密后的对称密钥。</p>
     */
    public Encryption getEncryption() {
        return this.Encryption;
    }

    /**
     * Set <p>是否需要对返回中的敏感信息进行加密,需指定加密算法Algorithm、CBC加密的初始向量、加密后的对称密钥。</p>
     * @param Encryption <p>是否需要对返回中的敏感信息进行加密,需指定加密算法Algorithm、CBC加密的初始向量、加密后的对称密钥。</p>
     */
    public void setEncryption(Encryption Encryption) {
        this.Encryption = Encryption;
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
        if (source.IsEncryptResponse != null) {
            this.IsEncryptResponse = new Boolean(source.IsEncryptResponse);
        }
        if (source.Encryption != null) {
            this.Encryption = new Encryption(source.Encryption);
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
        this.setParamSimple(map, prefix + "IsEncryptResponse", this.IsEncryptResponse);
        this.setParamObj(map, prefix + "Encryption.", this.Encryption);

    }
}

