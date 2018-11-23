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

public class Key  extends AbstractModel{

    /**
    * 加密track类型。
    */
    @SerializedName("Track")
    @Expose
    private String Track;

    /**
    * 密钥ID。
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 原始Key使用AES-128 ECB模式和SessionKey加密的后的二进制数据，Base64编码的字符串。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 原始IV使用AES-128 ECB模式和SessionKey加密的后的二进制数据，Base64编码的字符串。
    */
    @SerializedName("Iv")
    @Expose
    private String Iv;

    /**
     * 获取加密track类型。
     * @return Track 加密track类型。
     */
    public String getTrack() {
        return this.Track;
    }

    /**
     * 设置加密track类型。
     * @param Track 加密track类型。
     */
    public void setTrack(String Track) {
        this.Track = Track;
    }

    /**
     * 获取密钥ID。
     * @return KeyId 密钥ID。
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * 设置密钥ID。
     * @param KeyId 密钥ID。
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * 获取原始Key使用AES-128 ECB模式和SessionKey加密的后的二进制数据，Base64编码的字符串。
     * @return Key 原始Key使用AES-128 ECB模式和SessionKey加密的后的二进制数据，Base64编码的字符串。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * 设置原始Key使用AES-128 ECB模式和SessionKey加密的后的二进制数据，Base64编码的字符串。
     * @param Key 原始Key使用AES-128 ECB模式和SessionKey加密的后的二进制数据，Base64编码的字符串。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * 获取原始IV使用AES-128 ECB模式和SessionKey加密的后的二进制数据，Base64编码的字符串。
     * @return Iv 原始IV使用AES-128 ECB模式和SessionKey加密的后的二进制数据，Base64编码的字符串。
     */
    public String getIv() {
        return this.Iv;
    }

    /**
     * 设置原始IV使用AES-128 ECB模式和SessionKey加密的后的二进制数据，Base64编码的字符串。
     * @param Iv 原始IV使用AES-128 ECB模式和SessionKey加密的后的二进制数据，Base64编码的字符串。
     */
    public void setIv(String Iv) {
        this.Iv = Iv;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Track", this.Track);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Iv", this.Iv);

    }
}

