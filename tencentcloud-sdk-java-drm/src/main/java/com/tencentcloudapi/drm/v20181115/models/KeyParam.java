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
package com.tencentcloudapi.drm.v20181115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KeyParam extends AbstractModel{

    /**
    * 加密track类型。取值范围：
SD、HD、UHD1、UHD2、AUDIO
    */
    @SerializedName("Track")
    @Expose
    private String Track;

    /**
    * 请使用腾讯云DRM 提供的公钥，使用rsa加密算法，PKCS1填充方式对解密密钥进行加密，并对加密结果进行base64编码。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 密钥ID。
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 请使用腾讯云DRM 提供的公钥，使用rsa加密算法，PKCS1填充方式对解密密钥进行加密，并对加密结果进行base64编码。
    */
    @SerializedName("Iv")
    @Expose
    private String Iv;

    /**
     * Get 加密track类型。取值范围：
SD、HD、UHD1、UHD2、AUDIO 
     * @return Track 加密track类型。取值范围：
SD、HD、UHD1、UHD2、AUDIO
     */
    public String getTrack() {
        return this.Track;
    }

    /**
     * Set 加密track类型。取值范围：
SD、HD、UHD1、UHD2、AUDIO
     * @param Track 加密track类型。取值范围：
SD、HD、UHD1、UHD2、AUDIO
     */
    public void setTrack(String Track) {
        this.Track = Track;
    }

    /**
     * Get 请使用腾讯云DRM 提供的公钥，使用rsa加密算法，PKCS1填充方式对解密密钥进行加密，并对加密结果进行base64编码。 
     * @return Key 请使用腾讯云DRM 提供的公钥，使用rsa加密算法，PKCS1填充方式对解密密钥进行加密，并对加密结果进行base64编码。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 请使用腾讯云DRM 提供的公钥，使用rsa加密算法，PKCS1填充方式对解密密钥进行加密，并对加密结果进行base64编码。
     * @param Key 请使用腾讯云DRM 提供的公钥，使用rsa加密算法，PKCS1填充方式对解密密钥进行加密，并对加密结果进行base64编码。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 密钥ID。 
     * @return KeyId 密钥ID。
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set 密钥ID。
     * @param KeyId 密钥ID。
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get 请使用腾讯云DRM 提供的公钥，使用rsa加密算法，PKCS1填充方式对解密密钥进行加密，并对加密结果进行base64编码。 
     * @return Iv 请使用腾讯云DRM 提供的公钥，使用rsa加密算法，PKCS1填充方式对解密密钥进行加密，并对加密结果进行base64编码。
     */
    public String getIv() {
        return this.Iv;
    }

    /**
     * Set 请使用腾讯云DRM 提供的公钥，使用rsa加密算法，PKCS1填充方式对解密密钥进行加密，并对加密结果进行base64编码。
     * @param Iv 请使用腾讯云DRM 提供的公钥，使用rsa加密算法，PKCS1填充方式对解密密钥进行加密，并对加密结果进行base64编码。
     */
    public void setIv(String Iv) {
        this.Iv = Iv;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Track", this.Track);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "Iv", this.Iv);

    }
}

