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

public class ImageRecognitionV2Request extends AbstractModel {

    /**
    * <p>身份证号。</p>
    */
    @SerializedName("IdCard")
    @Expose
    private String IdCard;

    /**
    * <p>姓名。</p><ul><li>中文请使用UTF-8编码。</li></ul>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>用于人脸比对的照片，图片的Base64值；<br>Base64编码后的图片数据大小不超过3M，仅支持jpg、png格式。<br>请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。</p>
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * <p>本接口不需要传递此参数。</p>
    */
    @SerializedName("Optional")
    @Expose
    private String Optional;

    /**
    * <p>敏感数据加密信息。</p><ul><li>对传入信息（姓名、身份证号）有加密需求的用户可使用此参数，详情请点击左侧链接。</li></ul>
    */
    @SerializedName("Encryption")
    @Expose
    private Encryption Encryption;

    /**
    * <p>自定义描述字段。</p><ul><li>用于描述调用业务信息，出参中将返回此描述字段。 </li><li>每个自定义描述字段支持[1,10]个字符。</li></ul>
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
     * Get <p>身份证号。</p> 
     * @return IdCard <p>身份证号。</p>
     */
    public String getIdCard() {
        return this.IdCard;
    }

    /**
     * Set <p>身份证号。</p>
     * @param IdCard <p>身份证号。</p>
     */
    public void setIdCard(String IdCard) {
        this.IdCard = IdCard;
    }

    /**
     * Get <p>姓名。</p><ul><li>中文请使用UTF-8编码。</li></ul> 
     * @return Name <p>姓名。</p><ul><li>中文请使用UTF-8编码。</li></ul>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>姓名。</p><ul><li>中文请使用UTF-8编码。</li></ul>
     * @param Name <p>姓名。</p><ul><li>中文请使用UTF-8编码。</li></ul>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>用于人脸比对的照片，图片的Base64值；<br>Base64编码后的图片数据大小不超过3M，仅支持jpg、png格式。<br>请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。</p> 
     * @return ImageBase64 <p>用于人脸比对的照片，图片的Base64值；<br>Base64编码后的图片数据大小不超过3M，仅支持jpg、png格式。<br>请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。</p>
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set <p>用于人脸比对的照片，图片的Base64值；<br>Base64编码后的图片数据大小不超过3M，仅支持jpg、png格式。<br>请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。</p>
     * @param ImageBase64 <p>用于人脸比对的照片，图片的Base64值；<br>Base64编码后的图片数据大小不超过3M，仅支持jpg、png格式。<br>请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。</p>
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get <p>本接口不需要传递此参数。</p> 
     * @return Optional <p>本接口不需要传递此参数。</p>
     */
    public String getOptional() {
        return this.Optional;
    }

    /**
     * Set <p>本接口不需要传递此参数。</p>
     * @param Optional <p>本接口不需要传递此参数。</p>
     */
    public void setOptional(String Optional) {
        this.Optional = Optional;
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
     * Get <p>自定义描述字段。</p><ul><li>用于描述调用业务信息，出参中将返回此描述字段。 </li><li>每个自定义描述字段支持[1,10]个字符。</li></ul> 
     * @return Extra <p>自定义描述字段。</p><ul><li>用于描述调用业务信息，出参中将返回此描述字段。 </li><li>每个自定义描述字段支持[1,10]个字符。</li></ul>
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set <p>自定义描述字段。</p><ul><li>用于描述调用业务信息，出参中将返回此描述字段。 </li><li>每个自定义描述字段支持[1,10]个字符。</li></ul>
     * @param Extra <p>自定义描述字段。</p><ul><li>用于描述调用业务信息，出参中将返回此描述字段。 </li><li>每个自定义描述字段支持[1,10]个字符。</li></ul>
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    public ImageRecognitionV2Request() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageRecognitionV2Request(ImageRecognitionV2Request source) {
        if (source.IdCard != null) {
            this.IdCard = new String(source.IdCard);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.Optional != null) {
            this.Optional = new String(source.Optional);
        }
        if (source.Encryption != null) {
            this.Encryption = new Encryption(source.Encryption);
        }
        if (source.Extra != null) {
            this.Extra = new String(source.Extra);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdCard", this.IdCard);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "Optional", this.Optional);
        this.setParamObj(map, prefix + "Encryption.", this.Encryption);
        this.setParamSimple(map, prefix + "Extra", this.Extra);

    }
}

