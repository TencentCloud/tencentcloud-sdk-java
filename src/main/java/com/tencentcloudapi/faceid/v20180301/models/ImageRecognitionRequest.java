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

public class ImageRecognitionRequest extends AbstractModel{

    /**
    * 身份证号
    */
    @SerializedName("IdCard")
    @Expose
    private String IdCard;

    /**
    * 姓名。中文请使用UTF-8编码。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 用于人脸比对的照片，图片的Base64值；
Base64编码后的图片数据大小不超过3M，仅支持jpg、png格式。
请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * 本接口不需要传递此参数。
    */
    @SerializedName("Optional")
    @Expose
    private String Optional;

    /**
    * 敏感数据加密信息。对传入信息（姓名、身份证号）有加密需求的用户可使用此参数，详情请点击左侧链接。
    */
    @SerializedName("Encryption")
    @Expose
    private Encryption Encryption;

    /**
     * Get 身份证号 
     * @return IdCard 身份证号
     */
    public String getIdCard() {
        return this.IdCard;
    }

    /**
     * Set 身份证号
     * @param IdCard 身份证号
     */
    public void setIdCard(String IdCard) {
        this.IdCard = IdCard;
    }

    /**
     * Get 姓名。中文请使用UTF-8编码。 
     * @return Name 姓名。中文请使用UTF-8编码。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 姓名。中文请使用UTF-8编码。
     * @param Name 姓名。中文请使用UTF-8编码。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 用于人脸比对的照片，图片的Base64值；
Base64编码后的图片数据大小不超过3M，仅支持jpg、png格式。
请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。 
     * @return ImageBase64 用于人脸比对的照片，图片的Base64值；
Base64编码后的图片数据大小不超过3M，仅支持jpg、png格式。
请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set 用于人脸比对的照片，图片的Base64值；
Base64编码后的图片数据大小不超过3M，仅支持jpg、png格式。
请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。
     * @param ImageBase64 用于人脸比对的照片，图片的Base64值；
Base64编码后的图片数据大小不超过3M，仅支持jpg、png格式。
请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get 本接口不需要传递此参数。 
     * @return Optional 本接口不需要传递此参数。
     */
    public String getOptional() {
        return this.Optional;
    }

    /**
     * Set 本接口不需要传递此参数。
     * @param Optional 本接口不需要传递此参数。
     */
    public void setOptional(String Optional) {
        this.Optional = Optional;
    }

    /**
     * Get 敏感数据加密信息。对传入信息（姓名、身份证号）有加密需求的用户可使用此参数，详情请点击左侧链接。 
     * @return Encryption 敏感数据加密信息。对传入信息（姓名、身份证号）有加密需求的用户可使用此参数，详情请点击左侧链接。
     */
    public Encryption getEncryption() {
        return this.Encryption;
    }

    /**
     * Set 敏感数据加密信息。对传入信息（姓名、身份证号）有加密需求的用户可使用此参数，详情请点击左侧链接。
     * @param Encryption 敏感数据加密信息。对传入信息（姓名、身份证号）有加密需求的用户可使用此参数，详情请点击左侧链接。
     */
    public void setEncryption(Encryption Encryption) {
        this.Encryption = Encryption;
    }

    public ImageRecognitionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageRecognitionRequest(ImageRecognitionRequest source) {
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

    }
}

