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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IdCardOCRVerificationRequest extends AbstractModel {

    /**
    * 身份证号。
- 姓名和身份证号、ImageBase64、ImageUrl三者必须提供其中之一。
- 若都提供了，则按照姓名和身份证号>ImageBase64>ImageUrl的优先级使用参数。
    */
    @SerializedName("IdCard")
    @Expose
    private String IdCard;

    /**
    * 姓名。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 身份证人像面的 Base64 值。
- 支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
- 支持的图片大小：所下载图片经Base64编码后不超过 3M。请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * 身份证人像面的 Url 地址。
- 支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
- 支持的图片大小：所下载图片经 Base64 编码后不超过 3M。图片下载时间不超过 3 秒。
- 图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。
- 非腾讯云存储的 Url 速度和稳定性可能受一定影响。
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * 敏感数据加密信息。
- 对传入信息（姓名、身份证号）有加密需求的用户可使用此参数，详情请点击左侧链接。
    */
    @SerializedName("Encryption")
    @Expose
    private Encryption Encryption;

    /**
     * Get 身份证号。
- 姓名和身份证号、ImageBase64、ImageUrl三者必须提供其中之一。
- 若都提供了，则按照姓名和身份证号>ImageBase64>ImageUrl的优先级使用参数。 
     * @return IdCard 身份证号。
- 姓名和身份证号、ImageBase64、ImageUrl三者必须提供其中之一。
- 若都提供了，则按照姓名和身份证号>ImageBase64>ImageUrl的优先级使用参数。
     */
    public String getIdCard() {
        return this.IdCard;
    }

    /**
     * Set 身份证号。
- 姓名和身份证号、ImageBase64、ImageUrl三者必须提供其中之一。
- 若都提供了，则按照姓名和身份证号>ImageBase64>ImageUrl的优先级使用参数。
     * @param IdCard 身份证号。
- 姓名和身份证号、ImageBase64、ImageUrl三者必须提供其中之一。
- 若都提供了，则按照姓名和身份证号>ImageBase64>ImageUrl的优先级使用参数。
     */
    public void setIdCard(String IdCard) {
        this.IdCard = IdCard;
    }

    /**
     * Get 姓名。 
     * @return Name 姓名。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 姓名。
     * @param Name 姓名。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 身份证人像面的 Base64 值。
- 支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
- 支持的图片大小：所下载图片经Base64编码后不超过 3M。请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。 
     * @return ImageBase64 身份证人像面的 Base64 值。
- 支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
- 支持的图片大小：所下载图片经Base64编码后不超过 3M。请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set 身份证人像面的 Base64 值。
- 支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
- 支持的图片大小：所下载图片经Base64编码后不超过 3M。请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。
     * @param ImageBase64 身份证人像面的 Base64 值。
- 支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
- 支持的图片大小：所下载图片经Base64编码后不超过 3M。请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get 身份证人像面的 Url 地址。
- 支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
- 支持的图片大小：所下载图片经 Base64 编码后不超过 3M。图片下载时间不超过 3 秒。
- 图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。
- 非腾讯云存储的 Url 速度和稳定性可能受一定影响。 
     * @return ImageUrl 身份证人像面的 Url 地址。
- 支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
- 支持的图片大小：所下载图片经 Base64 编码后不超过 3M。图片下载时间不超过 3 秒。
- 图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。
- 非腾讯云存储的 Url 速度和稳定性可能受一定影响。
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 身份证人像面的 Url 地址。
- 支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
- 支持的图片大小：所下载图片经 Base64 编码后不超过 3M。图片下载时间不超过 3 秒。
- 图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。
- 非腾讯云存储的 Url 速度和稳定性可能受一定影响。
     * @param ImageUrl 身份证人像面的 Url 地址。
- 支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
- 支持的图片大小：所下载图片经 Base64 编码后不超过 3M。图片下载时间不超过 3 秒。
- 图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。
- 非腾讯云存储的 Url 速度和稳定性可能受一定影响。
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get 敏感数据加密信息。
- 对传入信息（姓名、身份证号）有加密需求的用户可使用此参数，详情请点击左侧链接。 
     * @return Encryption 敏感数据加密信息。
- 对传入信息（姓名、身份证号）有加密需求的用户可使用此参数，详情请点击左侧链接。
     */
    public Encryption getEncryption() {
        return this.Encryption;
    }

    /**
     * Set 敏感数据加密信息。
- 对传入信息（姓名、身份证号）有加密需求的用户可使用此参数，详情请点击左侧链接。
     * @param Encryption 敏感数据加密信息。
- 对传入信息（姓名、身份证号）有加密需求的用户可使用此参数，详情请点击左侧链接。
     */
    public void setEncryption(Encryption Encryption) {
        this.Encryption = Encryption;
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

    }
}

